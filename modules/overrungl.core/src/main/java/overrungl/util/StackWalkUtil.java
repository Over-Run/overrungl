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

import java.util.Arrays;

/**
 * @author Spasi
 * @author lwjgl3
 * @since 0.1.0
 */
final class StackWalkUtil {
    private StackWalkUtil() {
    }

    static StackTraceElement[] stackWalkArray(Object[] a) {
        return Arrays.stream(((StackWalker.StackFrame[]) a))
            .map(StackWalker.StackFrame::toStackTraceElement)
            .toArray(StackTraceElement[]::new);
    }

    static Object[] stackWalkGetTrace() {
        return StackWalker.getInstance()
            .walk(s -> s
                .skip(2)
                .dropWhile(f -> {
                    String name = f.getClassName();
                    return name.equals(MemoryUtil.class.getName()) || name.equals(DebugAllocator.class.getName());
                })
                .toArray(StackWalker.StackFrame[]::new)
            );
    }
}
