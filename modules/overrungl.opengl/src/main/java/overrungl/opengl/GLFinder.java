/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

package overrungl.opengl;

import overrun.marshal.MemoryStack;
import overrun.marshal.Unmarshal;
import overrungl.util.value.Pair;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Utilities
 *
 * @author squid233
 * @since 0.1.0
 */
final class GLFinder {
    private static final Linker LINKER = Linker.nativeLinker();
    private static final FunctionDescriptor
        fd_glGetString = FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT),
        fd_glGetStringi = FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
        fd_glGetIntegerv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    private static final Pattern VERSION_PATTERN = Pattern.compile("^(\\d+)\\.(\\d+).*$");
    private static final String[] PREFIXES = {
        "OpenGL ES-CM ",
        "OpenGL ES-CL ",
        "OpenGL ES ",
        "OpenGL SC "
    };
    private static final Pair.OfInt NO_CORE_GL = new Pair.OfInt(0, 0);

    static Pair.OfInt findCoreGL(GLLoadFunc load) {
        final MethodHandle glGetString = toHandle(load, "glGetString", fd_glGetString);
        if (glGetString == null) return NO_CORE_GL;

        String version;
        try {
            version = ((MemorySegment) glGetString.invokeExact(GL.VERSION)).getString(0L);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        if (version == null) return NO_CORE_GL;

        for (var prefix : PREFIXES) {
            if (version.startsWith(prefix)) {
                version = version.substring(prefix.length());
                break;
            }
        }

        var matcher = VERSION_PATTERN.matcher(version);
        if (matcher.find()) {
            return new Pair.OfInt(Integer.parseInt(matcher.group(1)),
                Integer.parseInt(matcher.group(2)));
        }
        return NO_CORE_GL;
    }

    static boolean getExtensions(GLLoadFunc load,
                                 int major,
                                 List<String> list) {
        // < 3.0
        if (major < 3) {
            final MethodHandle glGetString = toHandle(load, "glGetString", fd_glGetString);
            if (glGetString == null) {
                return false;
            }
            try {
                Collections.addAll(list, ((MemorySegment) glGetString.invokeExact(GL.EXTENSIONS)).getString(0L).split("\\s+"));
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        // 3.0
        // method handles
        final MethodHandle glGetStringi = toHandle(load, "glGetStringi", fd_glGetStringi);
        if (glGetStringi == null) {
            return false;
        }
        final MethodHandle glGetIntegerv = toHandle(load, "glGetIntegerv", fd_glGetIntegerv);
        if (glGetIntegerv == null) {
            return false;
        }

        // extension count
        int numExtsI;
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment pNumExtsI = stack.allocate(ValueLayout.JAVA_INT);
            try {
                glGetIntegerv.invokeExact(GL.NUM_EXTENSIONS, pNumExtsI);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            numExtsI = pNumExtsI.get(ValueLayout.JAVA_INT, 0L);
            if (numExtsI <= 0) {
                return false;
            }
        }

        // write to the extension array
        for (int index = 0; index < numExtsI; index++) {
            MemorySegment glStrTmp;
            try {
                glStrTmp = (MemorySegment) glGetStringi.invokeExact(GL.EXTENSIONS, index);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            list.add(glStrTmp.getString(0L));
        }

        return true;
    }

    private static MethodHandle toHandle(GLLoadFunc load, String name, FunctionDescriptor descriptor) {
        final MemorySegment segment = load.invoke(name);
        if (Unmarshal.isNullPointer(segment)) {
            return null;
        }
        return LINKER.downcallHandle(segment, descriptor);
    }
}
