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

import overrun.marshal.Unmarshal;
import overrungl.NativeType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import java.util.List;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * Utilities
 *
 * @author squid233
 * @since 0.1.0
 */
final class GLExtFinder {
    static boolean getExtensions(SegmentAllocator allocator,
                                 int version,
                                 @NativeType("const char**") MemorySegment outExts,
                                 List<String> outExtsI,
                                 GLLoadFunc load) {
        // < 3.0
        if (GLLoader.versionMajor(version) < 3) {
            final MethodHandle glGetString = load.invoke("glGetString", FunctionDescriptor.of(ADDRESS, JAVA_INT));
            if (glGetString == null) {
                return false;
            }
            try {
                outExts.set(ADDRESS, 0, (MemorySegment) glGetString.invokeExact(GL.EXTENSIONS));
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        // 3.0
        // method handles
        final MethodHandle glGetStringi = load.invoke("glGetStringi", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, JAVA_INT, JAVA_INT));
        if (glGetStringi == null) {
            return false;
        }
        final MethodHandle glGetIntegerv = load.invoke("glGetIntegerv", FunctionDescriptor.ofVoid(JAVA_INT, ADDRESS));
        if (glGetIntegerv == null) {
            return false;
        }

        // extension count
        final MemorySegment pNumExtsI = allocator.allocate(JAVA_INT);
        try {
            glGetIntegerv.invokeExact(GL.NUM_EXTENSIONS, pNumExtsI);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        int numExtsI = pNumExtsI.get(JAVA_INT, 0L);
        if (numExtsI <= 0) {
            return false;
        }

        // write to the extension array
        for (int index = 0; index < numExtsI; index++) {
            MemorySegment glStrTmp;
            try {
                glStrTmp = (MemorySegment) glGetStringi.invokeExact(GL.EXTENSIONS, index);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            outExtsI.add(glStrTmp.getString(0L));
        }

        return true;
    }

    static boolean hasExtension(int version, String exts, List<String> extsI, String ext) {
        if (GLLoader.versionMajor(version) < 3) {
            return exts != null && ext != null && exts.contains(ext);
        }
        return extsI.contains(ext);
    }
}
