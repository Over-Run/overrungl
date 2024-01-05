/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_win32_keyed_mutex}
 */
public final class GLEXTWin32KeyedMutex {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_win32_keyed_mutex) return;
        ext.glAcquireKeyedMutexWin32EXT = load.invoke("glAcquireKeyedMutexWin32EXT", of(JAVA_BYTE, JAVA_INT, JAVA_LONG, JAVA_INT));
        ext.glReleaseKeyedMutexWin32EXT = load.invoke("glReleaseKeyedMutexWin32EXT", of(JAVA_BYTE, JAVA_INT, JAVA_LONG));
    }

    public static boolean glAcquireKeyedMutexWin32EXT(int memory, long key, int timeout) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glAcquireKeyedMutexWin32EXT).invokeExact(memory, key, timeout);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glReleaseKeyedMutexWin32EXT(int memory, long key) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glReleaseKeyedMutexWin32EXT).invokeExact(memory, key);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
