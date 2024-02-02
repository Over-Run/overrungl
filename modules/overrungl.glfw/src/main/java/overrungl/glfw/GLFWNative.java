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

package overrungl.glfw;

import org.jetbrains.annotations.Nullable;
import overrun.marshal.Downcall;
import overrun.marshal.gen.Convert;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Type;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;

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
public interface GLFWNative {
    /**
     * The instance of GLFWNative.
     */
    GLFWNative INSTANCE = Downcall.load(MethodHandles.lookup(), Handles.lookup);

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
    @Entrypoint("glfwGetWin32Adapter")
    default MemorySegment ngetWin32Adapter(MemorySegment monitor) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetWin32Adapter")
    default String getWin32Adapter(MemorySegment monitor) {
        return null;
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
    @Entrypoint("glfwGetWin32Monitor")
    default MemorySegment ngetWin32Monitor(MemorySegment monitor) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetWin32Monitor")
    default String getWin32Monitor(MemorySegment monitor) {
        return null;
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
    @Entrypoint("glfwGetWin32Window")
    default MemorySegment getWin32Window(MemorySegment window) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetWGLContext")
    default MemorySegment getWGLContext(MemorySegment window) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetCocoaMonitor")
    default int getCocoaMonitor(MemorySegment monitor) {
        return 0;
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
    @Entrypoint("glfwGetCocoaWindow")
    default MemorySegment getCocoaWindow(MemorySegment window) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetNSGLContext")
    default MemorySegment getNSGLContext(MemorySegment window) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetX11Display")
    default MemorySegment getX11Display() {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetX11Adapter")
    default long getX11Adapter(MemorySegment monitor) {
        return 0L;
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
    @Entrypoint("glfwGetX11Monitor")
    default long getX11Monitor(MemorySegment monitor) {
        return 0L;
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
    @Entrypoint("glfwGetX11Window")
    default long getX11Window(MemorySegment window) {
        return 0L;
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
     * @see GLFW#nsetClipboardString(MemorySegment) setClipboardString
     */
    @Entrypoint("glfwSetX11SelectionString")
    default void nsetX11SelectionString(MemorySegment string) {
    }

    /**
     * Sets the current primary selection to the specified string.
     *
     * @param string A UTF-8 encoded string.
     * @see #nsetX11SelectionString(MemorySegment) nsetX11SelectionString
     */
    @Entrypoint("glfwSetX11SelectionString")
    default void setX11SelectionString(String string) {
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
     * @see GLFW#ngetClipboardString() getClipboardString
     */
    @Entrypoint("glfwGetX11SelectionString")
    default MemorySegment ngetX11SelectionString() {
        return MemorySegment.NULL;
    }

    /**
     * Returns the contents of the current primary selection as a string.
     *
     * @return The contents of the selection as a UTF-8 encoded string, or {@code null}
     * if an <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetX11SelectionString() ngetX11SelectionString
     */
    @Entrypoint("glfwGetX11SelectionString")
    default String getX11SelectionString() {
        return null;
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
    @Entrypoint("glfwGetGLXContext")
    default MemorySegment getGLXContext(MemorySegment window) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetGLXWindow")
    default long getGLXWindow(MemorySegment window) {
        return 0L;
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
    @Entrypoint("glfwGetWaylandDisplay")
    default MemorySegment getWaylandDisplay() {
        return MemorySegment.NULL;
    }

    /**
     * Returns the {@code struct wl_output*} of the specified monitor.
     *
     * @param monitor the monitor.
     * @return The {@code struct wl_output*} of the specified monitor, or {@link MemorySegment#NULL NULL} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    @Entrypoint("glfwGetWaylandMonitor")
    default MemorySegment getWaylandMonitor(MemorySegment monitor) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetWaylandWindow")
    default MemorySegment getWaylandWindow(MemorySegment window) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetEGLDisplay")
    default MemorySegment getEGLDisplay() {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetEGLContext")
    default MemorySegment getEGLContext(MemorySegment window) {
        return MemorySegment.NULL;
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
    @Entrypoint("glfwGetEGLSurface")
    default MemorySegment getEGLSurface(MemorySegment window) {
        return MemorySegment.NULL;
    }

    /**
     * Retrieves the color buffer associated with the specified window.
     *
     * @param window The window whose color buffer to retrieve.
     * @param width  Where to store the width of the color buffer, or {@link MemorySegment#NULL NULL}.
     * @param height Where to store the height of the color buffer, or {@link MemorySegment#NULL NULL}.
     * @param format Where to store the OSMesa pixel format of the color
     *               buffer, or {@link MemorySegment#NULL NULL}.
     * @param buffer Where to store the address of the color buffer, or
     *               {@link MemorySegment#NULL NULL}.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @glfw.errors Possible errors include {@link GLFW#NO_WINDOW_CONTEXT} and {@link GLFW#NOT_INITIALIZED}.
     * @glfw.thread_safety This function may be called from any thread.  Access is not
     * synchronized.
     */
    @Convert(Type.INT)
    @Entrypoint("glfwGetOSMesaColorBuffer")
    default boolean ngetOSMesaColorBuffer(MemorySegment window, MemorySegment width, MemorySegment height, MemorySegment format, MemorySegment buffer) {
        return false;
    }

    /**
     * Retrieves the color buffer associated with the specified window.
     *
     * @param window The window whose color buffer to retrieve.
     * @param width  Where to store the width of the color buffer, or {@code null}.
     * @param height Where to store the height of the color buffer, or {@code null}.
     * @param format Where to store the OSMesa pixel format of the color
     *               buffer, or {@code null}.
     * @param buffer Where to store the address of the color buffer, or
     *               {@code NULL}.
     * @return {@code true} if successful, or {@code false} if an
     * <a href="https://www.glfw.org/docs/latest/intro_guide.html#error_handling">error</a> occurred.
     * @see #ngetOSMesaColorBuffer(MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment) ngetOSMesaColorBuffer
     */
    @Convert(Type.INT)
    @Entrypoint("glfwGetOSMesaColorBuffer")
    default boolean getOSMesaColorBuffer(MemorySegment window, @Ref int @Nullable [] width, @Ref int @Nullable [] height, @Ref int @Nullable [] format, MemorySegment buffer) {
        return false;
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
    @Convert(Type.INT)
    @Entrypoint("glfwGetOSMesaDepthBuffer")
    default boolean ngetOSMesaDepthBuffer(MemorySegment window, MemorySegment width, MemorySegment height, MemorySegment bytesPerValue, MemorySegment buffer) {
        return false;
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
    @Convert(Type.INT)
    @Entrypoint("glfwGetOSMesaDepthBuffer")
    default boolean getOSMesaDepthBuffer(MemorySegment window, @Ref int @Nullable [] width, @Ref int @Nullable [] height, @Ref int @Nullable [] bytesPerValue, MemorySegment buffer) {
        return false;
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
    @Entrypoint("glfwGetOSMesaContext")
    default MemorySegment getOSMesaContext(MemorySegment window) {
        return MemorySegment.NULL;
    }
}
