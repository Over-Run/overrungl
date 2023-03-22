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

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static org.overrun.glib.glfw.Handles.*;

/**
 * This is the header file of the native access functions.
 *
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

    /**
     * Returns the adapter device name of the specified monitor.
     *
     * @param monitor the monitor.
     * @return The UTF-8 encoded adapter device name (for example {@code \\.\DISPLAY1}) of the specified monitor, or
     * {@link MemorySegment#NULL NULL} if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a>
     * occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not synchronized.
     */
    public static MemorySegment ngetWin32Adapter(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetWin32Adapter.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the adapter device name of the specified monitor.
     *
     * @param monitor the monitor.
     * @return The UTF-8 encoded adapter device name (for example {@code \\.\DISPLAY1}) of the specified monitor, or
     * {@link MemorySegment#NULL NULL} if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a>
     * occurred.
     * @see #ngetWin32Adapter(MemorySegment) ngetWin32Adapter
     */
    public static String getWin32Adapter(MemorySegment monitor) {
        return ngetWin32Adapter(monitor).getUtf8String(0);
    }

    /**
     * Returns the display device name of the specified monitor.
     *
     * @param monitor the monitor.
     * @return The UTF-8 encoded display device name (for example
     * {@code \\.\DISPLAY1\Monitor0}) of the specified monitor, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment ngetWin32Monitor(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetWin32Monitor.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the display device name of the specified monitor.
     *
     * @param monitor the monitor.
     * @return The UTF-8 encoded display device name (for example
     * {@code \\.\DISPLAY1\Monitor0}) of the specified monitor, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetWin32Monitor(MemorySegment) ngetWin32Monitor
     */
    public static String getWin32Monitor(MemorySegment monitor) {
        return ngetWin32Monitor(monitor).getUtf8String(0);
    }

    /**
     * Returns the {@code HWND} of the specified window.
     *
     * @param window the window.
     * @return The {@code HWND} of the specified window, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.remark The {@code HDC} associated with the window can be queried with the
     * <a href="https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-getdc">GetDC</a>
     * function.
     * <pre>{@code HDC dc = GetDC(getWin32Window(window));}</pre>
     * This DC is private and does not need to be released.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getWin32Window(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetWin32Window.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code HGLRC} of the specified window.
     *
     * @param window the window.
     * @return The {@code HGLRC} of the specified window, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.remark The {@code HDC} associated with the window can be queried with the
     * <a href="https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-getdc">GetDC</a>
     * function.
     * <pre>{@code HDC dc = GetDC(getWin32Window(window));}</pre>
     * This DC is private and does not need to be released.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getWGLContext(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetWGLContext.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code CGDirectDisplayID} of the specified monitor.
     *
     * @param monitor the monitor.
     * @return The {@code CGDirectDisplayID} of the specified monitor, or
     * {@code kCGNullDirectDisplay} if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static int getCocoaMonitor(MemorySegment monitor) {
        try {
            return (int) glfwGetCocoaMonitor.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code NSWindow} of the specified window.
     *
     * @param window the window.
     * @return The {@code NSWindow} of the specified window, or {@code nil} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getCocoaWindow(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetCocoaWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code NSOpenGLContext} of the specified window.
     *
     * @param window the window.
     * @return The {@code NSOpenGLContext} of the specified window, or {@code nil} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getNSGLContext(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetNSGLContext.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code Display} used by GLFW.
     *
     * @return The {@code Display} used by GLFW, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getX11Display() {
        try {
            return (MemorySegment) glfwGetX11Display.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code RRCrtc} of the specified monitor.
     *
     * @param monitor the monitor.
     * @return The {@code RRCrtc} of the specified monitor, or {@code None} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static long getX11Adapter(MemorySegment monitor) {
        try {
            return (long) glfwGetX11Adapter.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code RROutput} of the specified monitor.
     *
     * @param monitor the monitor.
     * @return The {@code RROutput} of the specified monitor, or {@code None} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static long getX11Monitor(MemorySegment monitor) {
        try {
            return (long) glfwGetX11Monitor.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code Window} of the specified window.
     *
     * @param window the window.
     * @return The {@code Window} of the specified window, or {@code None} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static long getX11Window(MemorySegment window) {
        try {
            return (long) glfwGetX11Window.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the current primary selection to the specified string.
     *
     * @param string string A UTF-8 encoded string.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED} and {@link GLFW#PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The specified string is copied before this function
     * returns.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #ngetX11SelectionString() getX11SelectionString
     * @see GLFW#nsetClipboardString(MemorySegment, MemorySegment) setClipboardString
     */
    public static void nsetX11SelectionString(MemorySegment string) {
        try {
            glfwSetX11SelectionString.invokeExact(string);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets the current primary selection to the specified string.
     *
     * @param string string A UTF-8 encoded string.
     * @see #nsetX11SelectionString(MemorySegment) nsetX11SelectionString
     */
    public static void setX11SelectionString(SegmentAllocator allocator, String string) {
        nsetX11SelectionString(allocator.allocateUtf8String(string));
    }

    /**
     * Returns the contents of the current primary selection as a string.
     * <p>
     * If the selection is empty or if its contents cannot be converted, {@link MemorySegment#NULL NULL}
     * is returned and a {@link GLFW#FORMAT_UNAVAILABLE} error is generated.
     *
     * @return The contents of the selection as a UTF-8 encoded string, or {@link MemorySegment#NULL NULL}
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED} and {@link GLFW#PLATFORM_ERROR}.
     * @glfw.pointer_lifetime The returned string is allocated and freed by GLFW. You
     * should not free it yourself. It is valid until the next call to
     * {@code ngetX11SelectionString} or {@link #nsetX11SelectionString(MemorySegment) setX11SelectionString}, or until the
     * library is terminated.
     * @glfw.thread_safety This function must only be called from the main thread.
     * @see #nsetX11SelectionString(MemorySegment) setX11SelectionString
     * @see GLFW#ngetClipboardString(MemorySegment) getClipboardString
     */
    public static MemorySegment ngetX11SelectionString() {
        try {
            return (MemorySegment) glfwGetX11SelectionString.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the contents of the current primary selection as a string.
     *
     * @return The contents of the selection as a UTF-8 encoded string, or {@code null}
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetX11SelectionString() ngetX11SelectionString
     */
    public static String getX11SelectionString() {
        final MemorySegment seg = ngetX11SelectionString();
        return seg != null ? seg.getUtf8String(0) : null;
    }

    /**
     * Returns the {@code GLXContext} of the specified window.
     *
     * @param window the window.
     * @return The {@code GLXContext} of the specified window, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getGLXContext(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetGLXContext.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code GLXWindow} of the specified window.
     *
     * @param window the window.
     * @return The {@code GLXWindow} of the specified window, or {@code None} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static long getGLXWindow(MemorySegment window) {
        try {
            return (long) glfwGetGLXWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code struct wl_display*} used by GLFW.
     *
     * @return The {@code struct wl_display*} used by GLFW, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getWaylandDisplay() {
        try {
            return (MemorySegment) glfwGetWaylandDisplay.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code struct wl_output*} of the specified monitor.
     *
     * @param monitor the monitor
     * @return The {@code struct wl_output*} of the specified monitor, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getWaylandMonitor(MemorySegment monitor) {
        try {
            return (MemorySegment) glfwGetWaylandMonitor.invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the main {@code struct wl_surface*} of the specified window.
     *
     * @param window the window.
     * @return The main {@code struct wl_surface*} of the specified window, or {@link MemorySegment#NULL NULL} if
     * an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getWaylandWindow(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetWaylandWindow.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code EGLDisplay} used by GLFW.
     *
     * @return The {@code EGLDisplay} used by GLFW, or {@code EGL_NO_DISPLAY} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.remark Because EGL is initialized on demand, this function will return
     * {@code EGL_NO_DISPLAY} until the first context has been created via EGL.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getEGLDisplay() {
        try {
            return (MemorySegment) glfwGetEGLDisplay.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code EGLContext} of the specified window.
     *
     * @param window the window.
     * @return The {@code EGLContext} of the specified window, or {@code EGL_NO_CONTEXT} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getEGLContext(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetEGLContext.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Returns the {@code EGLSurface} of the specified window.
     *
     * @param window the window
     * @return The {@code EGLSurface} of the specified window, or {@code EGL_NO_SURFACE} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getEGLSurface(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetEGLSurface.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the color buffer associated with the specified window.
     *
     * @param window window The window whose color buffer to retrieve.
     * @param width  width Where to store the width of the color buffer, or {@link MemorySegment#NULL NULL}.
     * @param height height Where to store the height of the color buffer, or {@link MemorySegment#NULL NULL}.
     * @param format format Where to store the OSMesa pixel format of the color
     *               buffer, or {@link MemorySegment#NULL NULL}.
     * @param buffer buffer Where to store the address of the color buffer, or
     *               {@link MemorySegment#NULL NULL}.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static boolean ngetOSMesaColorBuffer(MemorySegment window, MemorySegment width, MemorySegment height, MemorySegment format, MemorySegment buffer) {
        try {
            return (int) glfwGetOSMesaColorBuffer.invokeExact(window, width, height, format, buffer) != GLFW.FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the color buffer associated with the specified window.
     *
     * @param window window The window whose color buffer to retrieve.
     * @param width  width Where to store the width of the color buffer, or {@code null}.
     * @param height height Where to store the height of the color buffer, or {@code null}.
     * @param format format Where to store the OSMesa pixel format of the color
     *               buffer, or {@code null}.
     * @param buffer buffer Where to store the address of the color buffer, or
     *               {@code null}.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetOSMesaColorBuffer(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment) ngetOSMesaColorBuffer
     */
    public static boolean getOSMesaColorBuffer(MemorySegment window, int @Nullable [] width, int @Nullable [] height, int @Nullable [] format, MemorySegment @Nullable [] buffer) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment pWidth = width != null ? stack.calloc(ValueLayout.JAVA_INT) : MemorySegment.NULL;
            final MemorySegment pHeight = height != null ? stack.calloc(ValueLayout.JAVA_INT) : MemorySegment.NULL;
            final MemorySegment pFormat = format != null ? stack.calloc(ValueLayout.JAVA_INT) : MemorySegment.NULL;
            final MemorySegment pBuffer = buffer != null ? stack.calloc(ValueLayout.ADDRESS) : MemorySegment.NULL;
            final boolean success = ngetOSMesaColorBuffer(window, pWidth, pHeight, pFormat, pBuffer);
            if (width != null && width.length > 0) {
                width[0] = pWidth.get(ValueLayout.JAVA_INT, 0);
            }
            if (height != null && height.length > 0) {
                height[0] = pHeight.get(ValueLayout.JAVA_INT, 0);
            }
            if (format != null && format.length > 0) {
                format[0] = pFormat.get(ValueLayout.JAVA_INT, 0);
            }
            if (buffer != null && buffer.length > 0) {
                buffer[0] = pBuffer.get(ValueLayout.ADDRESS, 0);
            }
            return success;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves the depth buffer associated with the specified window.
     *
     * @param window        The window whose depth buffer to retrieve.
     * @param width         Where to store the width of the depth buffer, or {@link MemorySegment#NULL NULL}.
     * @param height        Where to store the height of the depth buffer, or {@link MemorySegment#NULL NULL}.
     * @param bytesPerValue Where to store the number of bytes per depth
     *                      buffer element, or {@link MemorySegment#NULL NULL}.
     * @param buffer        Where to store the address of the depth buffer, or
     *                      {@link MemorySegment#NULL NULL}.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static boolean ngetOSMesaDepthBuffer(MemorySegment window, MemorySegment width, MemorySegment height, MemorySegment bytesPerValue, MemorySegment buffer) {
        try {
            return (int) glfwGetOSMesaDepthBuffer.invokeExact(window, width, height, bytesPerValue, buffer) != GLFW.FALSE;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieves the depth buffer associated with the specified window.
     *
     * @param window        The window whose depth buffer to retrieve.
     * @param width         Where to store the width of the depth buffer, or {@code null}.
     * @param height        Where to store the height of the depth buffer, or {@code null}.
     * @param bytesPerValue Where to store the number of bytes per depth
     *                      buffer element, or {@code null}.
     * @param buffer        Where to store the address of the depth buffer, or
     *                      {@code null}.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetOSMesaDepthBuffer(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment) ngetOSMesaDepthBuffer
     */
    public static boolean getOSMesaDepthBuffer(MemorySegment window, int @Nullable [] width, int @Nullable [] height, int @Nullable [] bytesPerValue, MemorySegment @Nullable [] buffer) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment pWidth = width != null ? stack.calloc(ValueLayout.JAVA_INT) : MemorySegment.NULL;
            final MemorySegment pHeight = height != null ? stack.calloc(ValueLayout.JAVA_INT) : MemorySegment.NULL;
            final MemorySegment pBPV = bytesPerValue != null ? stack.calloc(ValueLayout.JAVA_INT) : MemorySegment.NULL;
            final MemorySegment pBuffer = buffer != null ? stack.calloc(ValueLayout.ADDRESS) : MemorySegment.NULL;
            final boolean success = ngetOSMesaDepthBuffer(window, pWidth, pHeight, pBPV, pBuffer);
            if (width != null && width.length > 0) {
                width[0] = pWidth.get(ValueLayout.JAVA_INT, 0);
            }
            if (height != null && height.length > 0) {
                height[0] = pHeight.get(ValueLayout.JAVA_INT, 0);
            }
            if (bytesPerValue != null && bytesPerValue.length > 0) {
                bytesPerValue[0] = pBPV.get(ValueLayout.JAVA_INT, 0);
            }
            if (buffer != null && buffer.length > 0) {
                buffer[0] = pBuffer.get(ValueLayout.ADDRESS, 0);
            }
            return success;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the {@code OSMesaContext} of the specified window.
     *
     * @param window the window.
     * @return The {@code OSMesaContext} of the specified window, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    public static MemorySegment getOSMesaContext(MemorySegment window) {
        try {
            return (MemorySegment) glfwGetOSMesaContext.invokeExact(window);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
