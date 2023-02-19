/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package org.overrun.glib.glfw;

import java.lang.foreign.MemorySegment;

import static org.overrun.glib.glfw.Handles.*;

/**
 * This is the header file of the native access functions.
 * <h2>Native access</h2>
 * <strong>By using the native access functions you assert that you know what you're
 * doing and how to fix problems caused by using them.  If you don't, you
 * shouldn't be using them.</strong>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWNative {
    static {
        create();
    }

    public static MemorySegment ngetWin32Adapter(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetWin32Adapter.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getWin32Adapter(MemorySegment monitor) {
        return ngetWin32Adapter(monitor).getUtf8String(0);
    }

    public static MemorySegment ngetWin32Monitor(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetWin32Monitor.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getWin32Monitor(MemorySegment monitor) {
        return ngetWin32Monitor(monitor).getUtf8String(0);
    }
}
