/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/// This class finds OpenGL capabilities.
///
/// The finding methods are ported from [glad2](https://github.com/Dav1dde/glad).
///
/// @author squid233
/// @since 0.1.0
final class GLLoader {
    private static final String[] prefixes = {
        "OpenGL ES-CM ",
        "OpenGL ES-CL ",
        "OpenGL ES ",
        "OpenGL SC "
    };
    private static final Pattern versionPattern = Pattern.compile("(\\d+)\\.(\\d+)");
    private final GLLoadFunc func;
    private final MemorySegment glGetString;
    private final boolean hasGL;

    GLLoader(GLLoadFunc func) {
        this.func = func;
        this.glGetString = func.invoke("glGetString");
        this.hasGL = !MemoryUtil.isNullPointer(glGetString);
    }

    private static int makeVersion(int major, int minor) {
        return major * 10000 + minor;
    }

    static int versionMajor(int version) {
        return version / 10000;
    }

    static int versionMinor(int version) {
        return version % 10000;
    }

    int findCoreGL() {
        if (!hasGL) return 0;

        MemorySegment pVersion;
        try {
            pVersion = (MemorySegment) GL10.Handles.MH_glGetString.invokeExact(glGetString, GL10.GL_VERSION);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        String version = MemoryUtil.nativeString(pVersion);
        if (version == null) return 0;
        for (String prefix : prefixes) {
            if (version.startsWith(prefix)) {
                version = version.substring(prefix.length());
                break;
            }
        }

        Matcher matcher = versionPattern.matcher(version);
        if (!matcher.find()) throw new IllegalStateException("Cannot find OpenGL version: " + version);
        int major = Integer.parseInt(matcher.group(1));
        int minor = Integer.parseInt(matcher.group(2));

        return makeVersion(major, minor);
    }

    record GetExtensions(
        boolean result,
        String[] exts,
        String[] extsI
    ) {
        static final GetExtensions FAIL = new GetExtensions(false, null, null);
    }

    GetExtensions getExtensions(int version) {
        String[] exts = null;
        String[] extsI = null;
        if (versionMajor(version) < 3) {
            if (!hasGL) return GetExtensions.FAIL;
            MemorySegment segment;
            try {
                segment = (MemorySegment) GL10.Handles.MH_glGetString.invokeExact(glGetString, GL10.GL_VERSION);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            String s = MemoryUtil.nativeString(segment);
            if (s != null) {
                exts = s.split(" ");
                Arrays.sort(exts);
            }
        } else {
            MemorySegment glGetStringi = func.invoke("glGetStringi");
            MemorySegment glGetIntegerv = func.invoke("glGetIntegerv");
            if (MemoryUtil.isNullPointer(glGetStringi) || MemoryUtil.isNullPointer(glGetIntegerv)) {
                return GetExtensions.FAIL;
            }
            int numExtsI;
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                var pNumExtsI = stack.ints(0);
                try {
                    GL10.Handles.MH_glGetIntegerv.invokeExact(glGetIntegerv, GL30.GL_NUM_EXTENSIONS, pNumExtsI);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
                numExtsI = pNumExtsI.get(ValueLayout.JAVA_INT, 0);
            }
            if (numExtsI > 0) {
                extsI = new String[numExtsI];
            }
            if (extsI == null) return GetExtensions.FAIL;
            try {
                for (int index = 0; index < numExtsI; index++) {
                    extsI[index] = MemoryUtil.nativeString((MemorySegment) GL30.Handles.MH_glGetStringi.invokeExact(glGetStringi, GL10.GL_EXTENSIONS, index));
                }
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            Arrays.sort(extsI);
        }
        return new GetExtensions(true, exts, extsI);
    }

    boolean hasExtension(int version, GetExtensions exts, String extension) {
        if (versionMajor(version) < 3) {
            return Arrays.binarySearch(exts.exts, extension) >= 0;
        }
        return Arrays.binarySearch(exts.extsI, extension) >= 0;
    }
}
