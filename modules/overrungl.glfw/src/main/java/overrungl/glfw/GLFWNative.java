/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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

import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.SymbolNotFoundError;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/// GLFW native functions.
///
/// **By using the native access functions you assert that you know what you're
/// doing and how to fix problems caused by using them.  If you don't, you
/// shouldn't be using them.**
///
/// @author squid233
/// @since 0.1.0
public final class GLFWNative {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `glfwGetWin32Adapter`.
        public static final MethodHandle MH_glfwGetWin32Adapter = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetWin32Adapter", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWin32Monitor`.
        public static final MethodHandle MH_glfwGetWin32Monitor = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetWin32Monitor", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWin32Window`.
        public static final MethodHandle MH_glfwGetWin32Window = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetWin32Window", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWGLContext`.
        public static final MethodHandle MH_glfwGetWGLContext = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetWGLContext", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCocoaMonitor`.
        public static final MethodHandle MH_glfwGetCocoaMonitor = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetCocoaMonitor", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCocoaWindow`.
        public static final MethodHandle MH_glfwGetCocoaWindow = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetCocoaWindow", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCocoaView`.
        public static final MethodHandle MH_glfwGetCocoaView = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetCocoaView", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetNSGLContext`.
        public static final MethodHandle MH_glfwGetNSGLContext = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetNSGLContext", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11Display`.
        public static final MethodHandle MH_glfwGetX11Display = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetX11Display", FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11Adapter`.
        public static final MethodHandle MH_glfwGetX11Adapter = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetX11Adapter", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11Monitor`.
        public static final MethodHandle MH_glfwGetX11Monitor = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetX11Monitor", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11Window`.
        public static final MethodHandle MH_glfwGetX11Window = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetX11Window", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetX11SelectionString`.
        public static final MethodHandle MH_glfwSetX11SelectionString = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwSetX11SelectionString", FunctionDescriptor.ofVoid(Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetX11SelectionString`.
        public static final MethodHandle MH_glfwGetX11SelectionString = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetX11SelectionString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetGLXContext`.
        public static final MethodHandle MH_glfwGetGLXContext = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetGLXContext", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetGLXWindow`.
        public static final MethodHandle MH_glfwGetGLXWindow = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetGLXWindow", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWaylandDisplay`.
        public static final MethodHandle MH_glfwGetWaylandDisplay = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetWaylandDisplay", FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWaylandMonitor`.
        public static final MethodHandle MH_glfwGetWaylandMonitor = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetWaylandMonitor", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWaylandWindow`.
        public static final MethodHandle MH_glfwGetWaylandWindow = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetWaylandWindow", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetEGLDisplay`.
        public static final MethodHandle MH_glfwGetEGLDisplay = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetEGLDisplay", FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetEGLContext`.
        public static final MethodHandle MH_glfwGetEGLContext = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetEGLContext", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetEGLSurface`.
        public static final MethodHandle MH_glfwGetEGLSurface = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetEGLSurface", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetOSMesaColorBuffer`.
        public static final MethodHandle MH_glfwGetOSMesaColorBuffer = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetOSMesaColorBuffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetOSMesaDepthBuffer`.
        public static final MethodHandle MH_glfwGetOSMesaDepthBuffer = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetOSMesaDepthBuffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetOSMesaContext`.
        public static final MethodHandle MH_glfwGetOSMesaContext = RuntimeHelper.downcallOrNull(GLFWInternal.lookup(), "glfwGetOSMesaContext", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    }
    //endregion

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetWin32Adapter_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWin32Adapter != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Adapter.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Adapter", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Adapter"); }
    }

    public static @CType("const char*") java.lang.String glfwGetWin32Adapter(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWin32Adapter != null) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Adapter.invokeExact(monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Adapter", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Adapter"); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetWin32Monitor_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWin32Monitor != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Monitor.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Monitor", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Monitor"); }
    }

    public static @CType("const char*") java.lang.String glfwGetWin32Monitor(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWin32Monitor != null) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Monitor.invokeExact(monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Monitor", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Monitor"); }
    }

    public static @CType("HWND") java.lang.foreign.MemorySegment glfwGetWin32Window(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetWin32Window != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Window.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Window", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Window"); }
    }

    public static @CType("HGLRC") java.lang.foreign.MemorySegment glfwGetWGLContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetWGLContext != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWGLContext.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWGLContext", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWGLContext"); }
    }

    public static @CType("CGDirectDisplayID") int glfwGetCocoaMonitor(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetCocoaMonitor != null) {
        try {
            return (int) Handles.MH_glfwGetCocoaMonitor.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaMonitor", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaMonitor"); }
    }

    public static @CType("id") java.lang.foreign.MemorySegment glfwGetCocoaWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetCocoaWindow != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetCocoaWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaWindow", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaWindow"); }
    }

    public static @CType("id") java.lang.foreign.MemorySegment glfwGetCocoaView(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetCocoaView != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetCocoaView.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaView", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaView"); }
    }

    public static @CType("id") java.lang.foreign.MemorySegment glfwGetNSGLContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetNSGLContext != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetNSGLContext.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetNSGLContext", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetNSGLContext"); }
    }

    public static @CType("Display*") java.lang.foreign.MemorySegment glfwGetX11Display() {
        if (Handles.MH_glfwGetX11Display != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetX11Display.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Display", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetX11Display"); }
    }

    public static @CType("RRCrtc") long glfwGetX11Adapter(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetX11Adapter != null) {
        try {
            return (long) Handles.MH_glfwGetX11Adapter.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Adapter", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetX11Adapter"); }
    }

    public static @CType("RROutput") long glfwGetX11Monitor(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetX11Monitor != null) {
        try {
            return (long) Handles.MH_glfwGetX11Monitor.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Monitor", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetX11Monitor"); }
    }

    public static @CType("RROutput") long glfwGetX11Window(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetX11Window != null) {
        try {
            return (long) Handles.MH_glfwGetX11Window.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Window", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetX11Window"); }
    }

    public static void glfwSetX11SelectionString(@CType("const char*") java.lang.foreign.MemorySegment string) {
        if (Handles.MH_glfwSetX11SelectionString != null) {
        try {
            Handles.MH_glfwSetX11SelectionString.invokeExact(string);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetX11SelectionString", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwSetX11SelectionString"); }
    }

    public static void glfwSetX11SelectionString(@CType("const char*") java.lang.String string) {
        if (Handles.MH_glfwSetX11SelectionString != null) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwSetX11SelectionString.invokeExact(Marshal.marshal(__overrungl_stack, string));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetX11SelectionString", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwSetX11SelectionString"); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetX11SelectionString_() {
        if (Handles.MH_glfwGetX11SelectionString != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetX11SelectionString.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11SelectionString", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetX11SelectionString"); }
    }

    public static @CType("const char*") java.lang.String glfwGetX11SelectionString() {
        if (Handles.MH_glfwGetX11SelectionString != null) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetX11SelectionString.invokeExact());
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11SelectionString", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetX11SelectionString"); }
    }

    public static @CType("GLXContext") java.lang.foreign.MemorySegment glfwGetGLXContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetGLXContext != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetGLXContext.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXContext", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetGLXContext"); }
    }

    public static @CType("GLXWindow") long glfwGetGLXWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetGLXWindow != null) {
        try {
            return (long) Handles.MH_glfwGetGLXWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXWindow", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetGLXWindow"); }
    }

    public static @CType("struct wl_display*") java.lang.foreign.MemorySegment glfwGetWaylandDisplay() {
        if (Handles.MH_glfwGetWaylandDisplay != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWaylandDisplay.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandDisplay", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandDisplay"); }
    }

    public static @CType("struct wl_output*") java.lang.foreign.MemorySegment glfwGetWaylandMonitor(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWaylandMonitor != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWaylandMonitor.invokeExact(monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandMonitor", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandMonitor"); }
    }

    public static @CType("struct wl_surface*") java.lang.foreign.MemorySegment glfwGetWaylandWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetWaylandWindow != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWaylandWindow.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandWindow", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandWindow"); }
    }

    public static @CType("EGLDisplay") java.lang.foreign.MemorySegment glfwGetEGLDisplay() {
        if (Handles.MH_glfwGetEGLDisplay != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetEGLDisplay.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLDisplay", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetEGLDisplay"); }
    }

    public static @CType("EGLContext") java.lang.foreign.MemorySegment glfwGetEGLContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetEGLContext != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetEGLContext.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLContext", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetEGLContext"); }
    }

    public static @CType("EGLSurface") java.lang.foreign.MemorySegment glfwGetEGLSurface(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetEGLSurface != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetEGLSurface.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLSurface", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetEGLSurface"); }
    }

    public static @CType("int") boolean glfwGetOSMesaColorBuffer(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment format, @Out @CType("void**") java.lang.foreign.MemorySegment buffer) {
        if (Handles.MH_glfwGetOSMesaColorBuffer != null) {
        try {
            return (int) Handles.MH_glfwGetOSMesaColorBuffer.invokeExact(window, width, height, format, buffer) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaColorBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaColorBuffer"); }
    }

    public static @CType("int") boolean glfwGetOSMesaDepthBuffer(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment bytesPerValue, @Out @CType("void**") java.lang.foreign.MemorySegment buffer) {
        if (Handles.MH_glfwGetOSMesaDepthBuffer != null) {
        try {
            return (int) Handles.MH_glfwGetOSMesaDepthBuffer.invokeExact(window, width, height, bytesPerValue, buffer) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaDepthBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaDepthBuffer"); }
    }

    public static @CType("OSMesaContext") java.lang.foreign.MemorySegment glfwGetOSMesaContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetOSMesaContext != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetOSMesaContext.invokeExact(window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaContext", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaContext"); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFWNative() {
    }
}
