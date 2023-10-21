/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.util;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

/**
 * @author Spasi
 * @author lwjgl3
 * @since 0.1.0
 */
final class StackWalkUtil {
    private static final StackWalker STACKWALKER = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

    private StackWalkUtil() {
    }

    static StackTraceElement[] stackWalkArray(Object[] a) {
        return Arrays.stream(((StackWalker.StackFrame[]) a))
            .map(StackWalker.StackFrame::toStackTraceElement)
            .toArray(StackTraceElement[]::new);
    }

    static Object stackWalkGetMethod(Class<?> after) {
        return STACKWALKER.walk(s -> {
            var iter = s.iterator();
            iter.next(); // skip this method
            iter.next(); // skip MemoryStack::pop

            StackWalker.StackFrame frame;
            do {
                frame = iter.next();
            } while (frame.getDeclaringClass() == after && iter.hasNext());

            return frame;
        });
    }

    private static boolean isSameMethod(StackWalker.StackFrame a, StackWalker.StackFrame b) {
        return isSameMethod(a, b, b.getMethodName());
    }

    private static boolean isSameMethod(StackWalker.StackFrame a, StackWalker.StackFrame b, String methodName) {
        return a.getDeclaringClass() == b.getDeclaringClass() &&
               a.getMethodName().equals(methodName);
    }

    private static boolean isAutoCloseable(StackWalker.StackFrame element, StackWalker.StackFrame pushed) {
        // Java 9 try-with-resources: synthetic $closeResource
        if (isSameMethod(element, pushed, "$closeResource")) {
            return true;
        }

        // Kotlin T.use: kotlin.AutoCloseable::closeFinally
        return "kotlin.jdk7.AutoCloseableKt".equals(element.getClassName()) && "closeFinally".equals(element.getMethodName());
    }

    @Nullable
    static Object stackWalkCheckPop(Class<?> after, Object pushedObj) {
        StackWalker.StackFrame pushed = (StackWalker.StackFrame) pushedObj;

        return StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE).walk(s -> {
            var iter = s.iterator();
            iter.next();
            iter.next();

            StackWalker.StackFrame element;
            do {
                element = iter.next();
            } while (element.getDeclaringClass() == after && iter.hasNext());

            if (isSameMethod(element, pushed)) {
                return null;
            }

            if (iter.hasNext() && isAutoCloseable(element, pushed)) {
                // Some runtimes use a separate method to call AutoCloseable::close in try-with-resources blocks.
                // That method suppresses any exceptions thrown by close if necessary.
                // When that happens, the pop is 1 level deeper than expected.
                element = iter.next();
                if (isSameMethod(element, pushed)) {
                    return null;
                }
            }

            return element;
        });
    }

    static Object[] stackWalkGetTrace() {
        return StackWalker.getInstance()
            .walk(s -> s
                .skip(2)
                .dropWhile(f -> {
                    String name = f.getClassName();
                    return name.equals(CStdio.class.getName()) || name.equals(DebugAllocator.class.getName());
                })
                .toArray(StackWalker.StackFrame[]::new)
            );
    }
}
