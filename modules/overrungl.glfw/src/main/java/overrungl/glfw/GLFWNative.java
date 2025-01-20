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
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `glfwGetWin32Adapter`.
        public static final FunctionDescriptor FD_glfwGetWin32Adapter = FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetWin32Monitor`.
        public static final FunctionDescriptor FD_glfwGetWin32Monitor = FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetWin32Window`.
        public static final FunctionDescriptor FD_glfwGetWin32Window = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetWGLContext`.
        public static final FunctionDescriptor FD_glfwGetWGLContext = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetCocoaMonitor`.
        public static final FunctionDescriptor FD_glfwGetCocoaMonitor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetCocoaWindow`.
        public static final FunctionDescriptor FD_glfwGetCocoaWindow = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetCocoaView`.
        public static final FunctionDescriptor FD_glfwGetCocoaView = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetNSGLContext`.
        public static final FunctionDescriptor FD_glfwGetNSGLContext = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetX11Display`.
        public static final FunctionDescriptor FD_glfwGetX11Display = FunctionDescriptor.of(ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetX11Adapter`.
        public static final FunctionDescriptor FD_glfwGetX11Adapter = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetX11Monitor`.
        public static final FunctionDescriptor FD_glfwGetX11Monitor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetX11Window`.
        public static final FunctionDescriptor FD_glfwGetX11Window = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwSetX11SelectionString`.
        public static final FunctionDescriptor FD_glfwSetX11SelectionString = FunctionDescriptor.ofVoid(Unmarshal.STR_LAYOUT);
        /// The function descriptor of `glfwGetX11SelectionString`.
        public static final FunctionDescriptor FD_glfwGetX11SelectionString = FunctionDescriptor.of(Unmarshal.STR_LAYOUT);
        /// The function descriptor of `glfwGetGLXContext`.
        public static final FunctionDescriptor FD_glfwGetGLXContext = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetGLXWindow`.
        public static final FunctionDescriptor FD_glfwGetGLXWindow = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetWaylandDisplay`.
        public static final FunctionDescriptor FD_glfwGetWaylandDisplay = FunctionDescriptor.of(ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetWaylandMonitor`.
        public static final FunctionDescriptor FD_glfwGetWaylandMonitor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetWaylandWindow`.
        public static final FunctionDescriptor FD_glfwGetWaylandWindow = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetEGLDisplay`.
        public static final FunctionDescriptor FD_glfwGetEGLDisplay = FunctionDescriptor.of(ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetEGLContext`.
        public static final FunctionDescriptor FD_glfwGetEGLContext = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetEGLSurface`.
        public static final FunctionDescriptor FD_glfwGetEGLSurface = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetOSMesaColorBuffer`.
        public static final FunctionDescriptor FD_glfwGetOSMesaColorBuffer = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetOSMesaDepthBuffer`.
        public static final FunctionDescriptor FD_glfwGetOSMesaDepthBuffer = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `glfwGetOSMesaContext`.
        public static final FunctionDescriptor FD_glfwGetOSMesaContext = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `glfwGetWin32Adapter`.
        public static final MethodHandle MH_glfwGetWin32Adapter = RuntimeHelper.downcall(Descriptors.FD_glfwGetWin32Adapter);
        /// The method handle of `glfwGetWin32Monitor`.
        public static final MethodHandle MH_glfwGetWin32Monitor = RuntimeHelper.downcall(Descriptors.FD_glfwGetWin32Monitor);
        /// The method handle of `glfwGetWin32Window`.
        public static final MethodHandle MH_glfwGetWin32Window = RuntimeHelper.downcall(Descriptors.FD_glfwGetWin32Window);
        /// The method handle of `glfwGetWGLContext`.
        public static final MethodHandle MH_glfwGetWGLContext = RuntimeHelper.downcall(Descriptors.FD_glfwGetWGLContext);
        /// The method handle of `glfwGetCocoaMonitor`.
        public static final MethodHandle MH_glfwGetCocoaMonitor = RuntimeHelper.downcall(Descriptors.FD_glfwGetCocoaMonitor);
        /// The method handle of `glfwGetCocoaWindow`.
        public static final MethodHandle MH_glfwGetCocoaWindow = RuntimeHelper.downcall(Descriptors.FD_glfwGetCocoaWindow);
        /// The method handle of `glfwGetCocoaView`.
        public static final MethodHandle MH_glfwGetCocoaView = RuntimeHelper.downcall(Descriptors.FD_glfwGetCocoaView);
        /// The method handle of `glfwGetNSGLContext`.
        public static final MethodHandle MH_glfwGetNSGLContext = RuntimeHelper.downcall(Descriptors.FD_glfwGetNSGLContext);
        /// The method handle of `glfwGetX11Display`.
        public static final MethodHandle MH_glfwGetX11Display = RuntimeHelper.downcall(Descriptors.FD_glfwGetX11Display);
        /// The method handle of `glfwGetX11Adapter`.
        public static final MethodHandle MH_glfwGetX11Adapter = RuntimeHelper.downcall(Descriptors.FD_glfwGetX11Adapter);
        /// The method handle of `glfwGetX11Monitor`.
        public static final MethodHandle MH_glfwGetX11Monitor = RuntimeHelper.downcall(Descriptors.FD_glfwGetX11Monitor);
        /// The method handle of `glfwGetX11Window`.
        public static final MethodHandle MH_glfwGetX11Window = RuntimeHelper.downcall(Descriptors.FD_glfwGetX11Window);
        /// The method handle of `glfwSetX11SelectionString`.
        public static final MethodHandle MH_glfwSetX11SelectionString = RuntimeHelper.downcall(Descriptors.FD_glfwSetX11SelectionString);
        /// The method handle of `glfwGetX11SelectionString`.
        public static final MethodHandle MH_glfwGetX11SelectionString = RuntimeHelper.downcall(Descriptors.FD_glfwGetX11SelectionString);
        /// The method handle of `glfwGetGLXContext`.
        public static final MethodHandle MH_glfwGetGLXContext = RuntimeHelper.downcall(Descriptors.FD_glfwGetGLXContext);
        /// The method handle of `glfwGetGLXWindow`.
        public static final MethodHandle MH_glfwGetGLXWindow = RuntimeHelper.downcall(Descriptors.FD_glfwGetGLXWindow);
        /// The method handle of `glfwGetWaylandDisplay`.
        public static final MethodHandle MH_glfwGetWaylandDisplay = RuntimeHelper.downcall(Descriptors.FD_glfwGetWaylandDisplay);
        /// The method handle of `glfwGetWaylandMonitor`.
        public static final MethodHandle MH_glfwGetWaylandMonitor = RuntimeHelper.downcall(Descriptors.FD_glfwGetWaylandMonitor);
        /// The method handle of `glfwGetWaylandWindow`.
        public static final MethodHandle MH_glfwGetWaylandWindow = RuntimeHelper.downcall(Descriptors.FD_glfwGetWaylandWindow);
        /// The method handle of `glfwGetEGLDisplay`.
        public static final MethodHandle MH_glfwGetEGLDisplay = RuntimeHelper.downcall(Descriptors.FD_glfwGetEGLDisplay);
        /// The method handle of `glfwGetEGLContext`.
        public static final MethodHandle MH_glfwGetEGLContext = RuntimeHelper.downcall(Descriptors.FD_glfwGetEGLContext);
        /// The method handle of `glfwGetEGLSurface`.
        public static final MethodHandle MH_glfwGetEGLSurface = RuntimeHelper.downcall(Descriptors.FD_glfwGetEGLSurface);
        /// The method handle of `glfwGetOSMesaColorBuffer`.
        public static final MethodHandle MH_glfwGetOSMesaColorBuffer = RuntimeHelper.downcall(Descriptors.FD_glfwGetOSMesaColorBuffer);
        /// The method handle of `glfwGetOSMesaDepthBuffer`.
        public static final MethodHandle MH_glfwGetOSMesaDepthBuffer = RuntimeHelper.downcall(Descriptors.FD_glfwGetOSMesaDepthBuffer);
        /// The method handle of `glfwGetOSMesaContext`.
        public static final MethodHandle MH_glfwGetOSMesaContext = RuntimeHelper.downcall(Descriptors.FD_glfwGetOSMesaContext);
        /// The function address of `glfwGetWin32Adapter`.
        public final MemorySegment PFN_glfwGetWin32Adapter;
        /// The function address of `glfwGetWin32Monitor`.
        public final MemorySegment PFN_glfwGetWin32Monitor;
        /// The function address of `glfwGetWin32Window`.
        public final MemorySegment PFN_glfwGetWin32Window;
        /// The function address of `glfwGetWGLContext`.
        public final MemorySegment PFN_glfwGetWGLContext;
        /// The function address of `glfwGetCocoaMonitor`.
        public final MemorySegment PFN_glfwGetCocoaMonitor;
        /// The function address of `glfwGetCocoaWindow`.
        public final MemorySegment PFN_glfwGetCocoaWindow;
        /// The function address of `glfwGetCocoaView`.
        public final MemorySegment PFN_glfwGetCocoaView;
        /// The function address of `glfwGetNSGLContext`.
        public final MemorySegment PFN_glfwGetNSGLContext;
        /// The function address of `glfwGetX11Display`.
        public final MemorySegment PFN_glfwGetX11Display;
        /// The function address of `glfwGetX11Adapter`.
        public final MemorySegment PFN_glfwGetX11Adapter;
        /// The function address of `glfwGetX11Monitor`.
        public final MemorySegment PFN_glfwGetX11Monitor;
        /// The function address of `glfwGetX11Window`.
        public final MemorySegment PFN_glfwGetX11Window;
        /// The function address of `glfwSetX11SelectionString`.
        public final MemorySegment PFN_glfwSetX11SelectionString;
        /// The function address of `glfwGetX11SelectionString`.
        public final MemorySegment PFN_glfwGetX11SelectionString;
        /// The function address of `glfwGetGLXContext`.
        public final MemorySegment PFN_glfwGetGLXContext;
        /// The function address of `glfwGetGLXWindow`.
        public final MemorySegment PFN_glfwGetGLXWindow;
        /// The function address of `glfwGetWaylandDisplay`.
        public final MemorySegment PFN_glfwGetWaylandDisplay;
        /// The function address of `glfwGetWaylandMonitor`.
        public final MemorySegment PFN_glfwGetWaylandMonitor;
        /// The function address of `glfwGetWaylandWindow`.
        public final MemorySegment PFN_glfwGetWaylandWindow;
        /// The function address of `glfwGetEGLDisplay`.
        public final MemorySegment PFN_glfwGetEGLDisplay;
        /// The function address of `glfwGetEGLContext`.
        public final MemorySegment PFN_glfwGetEGLContext;
        /// The function address of `glfwGetEGLSurface`.
        public final MemorySegment PFN_glfwGetEGLSurface;
        /// The function address of `glfwGetOSMesaColorBuffer`.
        public final MemorySegment PFN_glfwGetOSMesaColorBuffer;
        /// The function address of `glfwGetOSMesaDepthBuffer`.
        public final MemorySegment PFN_glfwGetOSMesaDepthBuffer;
        /// The function address of `glfwGetOSMesaContext`.
        public final MemorySegment PFN_glfwGetOSMesaContext;
        private Handles() {
            PFN_glfwGetWin32Adapter = GLFWInternal.lookup().find("glfwGetWin32Adapter").orElse(MemorySegment.NULL);
            PFN_glfwGetWin32Monitor = GLFWInternal.lookup().find("glfwGetWin32Monitor").orElse(MemorySegment.NULL);
            PFN_glfwGetWin32Window = GLFWInternal.lookup().find("glfwGetWin32Window").orElse(MemorySegment.NULL);
            PFN_glfwGetWGLContext = GLFWInternal.lookup().find("glfwGetWGLContext").orElse(MemorySegment.NULL);
            PFN_glfwGetCocoaMonitor = GLFWInternal.lookup().find("glfwGetCocoaMonitor").orElse(MemorySegment.NULL);
            PFN_glfwGetCocoaWindow = GLFWInternal.lookup().find("glfwGetCocoaWindow").orElse(MemorySegment.NULL);
            PFN_glfwGetCocoaView = GLFWInternal.lookup().find("glfwGetCocoaView").orElse(MemorySegment.NULL);
            PFN_glfwGetNSGLContext = GLFWInternal.lookup().find("glfwGetNSGLContext").orElse(MemorySegment.NULL);
            PFN_glfwGetX11Display = GLFWInternal.lookup().find("glfwGetX11Display").orElse(MemorySegment.NULL);
            PFN_glfwGetX11Adapter = GLFWInternal.lookup().find("glfwGetX11Adapter").orElse(MemorySegment.NULL);
            PFN_glfwGetX11Monitor = GLFWInternal.lookup().find("glfwGetX11Monitor").orElse(MemorySegment.NULL);
            PFN_glfwGetX11Window = GLFWInternal.lookup().find("glfwGetX11Window").orElse(MemorySegment.NULL);
            PFN_glfwSetX11SelectionString = GLFWInternal.lookup().find("glfwSetX11SelectionString").orElse(MemorySegment.NULL);
            PFN_glfwGetX11SelectionString = GLFWInternal.lookup().find("glfwGetX11SelectionString").orElse(MemorySegment.NULL);
            PFN_glfwGetGLXContext = GLFWInternal.lookup().find("glfwGetGLXContext").orElse(MemorySegment.NULL);
            PFN_glfwGetGLXWindow = GLFWInternal.lookup().find("glfwGetGLXWindow").orElse(MemorySegment.NULL);
            PFN_glfwGetWaylandDisplay = GLFWInternal.lookup().find("glfwGetWaylandDisplay").orElse(MemorySegment.NULL);
            PFN_glfwGetWaylandMonitor = GLFWInternal.lookup().find("glfwGetWaylandMonitor").orElse(MemorySegment.NULL);
            PFN_glfwGetWaylandWindow = GLFWInternal.lookup().find("glfwGetWaylandWindow").orElse(MemorySegment.NULL);
            PFN_glfwGetEGLDisplay = GLFWInternal.lookup().find("glfwGetEGLDisplay").orElse(MemorySegment.NULL);
            PFN_glfwGetEGLContext = GLFWInternal.lookup().find("glfwGetEGLContext").orElse(MemorySegment.NULL);
            PFN_glfwGetEGLSurface = GLFWInternal.lookup().find("glfwGetEGLSurface").orElse(MemorySegment.NULL);
            PFN_glfwGetOSMesaColorBuffer = GLFWInternal.lookup().find("glfwGetOSMesaColorBuffer").orElse(MemorySegment.NULL);
            PFN_glfwGetOSMesaDepthBuffer = GLFWInternal.lookup().find("glfwGetOSMesaDepthBuffer").orElse(MemorySegment.NULL);
            PFN_glfwGetOSMesaContext = GLFWInternal.lookup().find("glfwGetOSMesaContext").orElse(MemorySegment.NULL);
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetWin32Adapter_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWin32Adapter == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Adapter");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Adapter.invokeExact(Handles.get().PFN_glfwGetWin32Adapter, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Adapter", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetWin32Adapter(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWin32Adapter == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Adapter");
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Adapter.invokeExact(Handles.get().PFN_glfwGetWin32Adapter, monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Adapter", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetWin32Monitor_(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWin32Monitor == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Monitor");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Monitor.invokeExact(Handles.get().PFN_glfwGetWin32Monitor, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Monitor", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetWin32Monitor(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWin32Monitor == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Monitor");
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Monitor.invokeExact(Handles.get().PFN_glfwGetWin32Monitor, monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Monitor", e); }
    }

    public static @CType("HWND") java.lang.foreign.MemorySegment glfwGetWin32Window(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetWin32Window == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Window");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWin32Window.invokeExact(Handles.get().PFN_glfwGetWin32Window, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Window", e); }
    }

    public static @CType("HGLRC") java.lang.foreign.MemorySegment glfwGetWGLContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetWGLContext == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWGLContext");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWGLContext.invokeExact(Handles.get().PFN_glfwGetWGLContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWGLContext", e); }
    }

    public static @CType("CGDirectDisplayID") int glfwGetCocoaMonitor(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetCocoaMonitor == null) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaMonitor");
        try {
            return (int) Handles.MH_glfwGetCocoaMonitor.invokeExact(Handles.get().PFN_glfwGetCocoaMonitor, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaMonitor", e); }
    }

    public static @CType("id") java.lang.foreign.MemorySegment glfwGetCocoaWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetCocoaWindow == null) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaWindow");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetCocoaWindow.invokeExact(Handles.get().PFN_glfwGetCocoaWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaWindow", e); }
    }

    public static @CType("id") java.lang.foreign.MemorySegment glfwGetCocoaView(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetCocoaView == null) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaView");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetCocoaView.invokeExact(Handles.get().PFN_glfwGetCocoaView, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaView", e); }
    }

    public static @CType("id") java.lang.foreign.MemorySegment glfwGetNSGLContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetNSGLContext == null) throw new SymbolNotFoundError("Symbol not found: glfwGetNSGLContext");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetNSGLContext.invokeExact(Handles.get().PFN_glfwGetNSGLContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetNSGLContext", e); }
    }

    public static @CType("Display*") java.lang.foreign.MemorySegment glfwGetX11Display() {
        if (Handles.MH_glfwGetX11Display == null) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Display");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetX11Display.invokeExact(Handles.get().PFN_glfwGetX11Display);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Display", e); }
    }

    public static @CType("RRCrtc") long glfwGetX11Adapter(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetX11Adapter == null) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Adapter");
        try {
            return (long) Handles.MH_glfwGetX11Adapter.invokeExact(Handles.get().PFN_glfwGetX11Adapter, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Adapter", e); }
    }

    public static @CType("RROutput") long glfwGetX11Monitor(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetX11Monitor == null) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Monitor");
        try {
            return (long) Handles.MH_glfwGetX11Monitor.invokeExact(Handles.get().PFN_glfwGetX11Monitor, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Monitor", e); }
    }

    public static @CType("Window") long glfwGetX11Window(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetX11Window == null) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Window");
        try {
            return (long) Handles.MH_glfwGetX11Window.invokeExact(Handles.get().PFN_glfwGetX11Window, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Window", e); }
    }

    public static void glfwSetX11SelectionString(@CType("const char*") java.lang.foreign.MemorySegment string) {
        if (Handles.MH_glfwSetX11SelectionString == null) throw new SymbolNotFoundError("Symbol not found: glfwSetX11SelectionString");
        try {
            Handles.MH_glfwSetX11SelectionString.invokeExact(Handles.get().PFN_glfwSetX11SelectionString, string);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetX11SelectionString", e); }
    }

    public static void glfwSetX11SelectionString(@CType("const char*") java.lang.String string) {
        if (Handles.MH_glfwSetX11SelectionString == null) throw new SymbolNotFoundError("Symbol not found: glfwSetX11SelectionString");
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            Handles.MH_glfwSetX11SelectionString.invokeExact(Handles.get().PFN_glfwSetX11SelectionString, Marshal.marshal(__overrungl_stack, string));
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetX11SelectionString", e); }
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment glfwGetX11SelectionString_() {
        if (Handles.MH_glfwGetX11SelectionString == null) throw new SymbolNotFoundError("Symbol not found: glfwGetX11SelectionString");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetX11SelectionString.invokeExact(Handles.get().PFN_glfwGetX11SelectionString);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11SelectionString", e); }
    }

    public static @CType("const char*") java.lang.String glfwGetX11SelectionString() {
        if (Handles.MH_glfwGetX11SelectionString == null) throw new SymbolNotFoundError("Symbol not found: glfwGetX11SelectionString");
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_glfwGetX11SelectionString.invokeExact(Handles.get().PFN_glfwGetX11SelectionString));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11SelectionString", e); }
    }

    public static @CType("GLXContext") java.lang.foreign.MemorySegment glfwGetGLXContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetGLXContext == null) throw new SymbolNotFoundError("Symbol not found: glfwGetGLXContext");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetGLXContext.invokeExact(Handles.get().PFN_glfwGetGLXContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXContext", e); }
    }

    public static @CType("GLXWindow") long glfwGetGLXWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetGLXWindow == null) throw new SymbolNotFoundError("Symbol not found: glfwGetGLXWindow");
        try {
            return (long) Handles.MH_glfwGetGLXWindow.invokeExact(Handles.get().PFN_glfwGetGLXWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXWindow", e); }
    }

    public static @CType("struct wl_display*") java.lang.foreign.MemorySegment glfwGetWaylandDisplay() {
        if (Handles.MH_glfwGetWaylandDisplay == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandDisplay");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWaylandDisplay.invokeExact(Handles.get().PFN_glfwGetWaylandDisplay);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandDisplay", e); }
    }

    public static @CType("struct wl_output*") java.lang.foreign.MemorySegment glfwGetWaylandMonitor(@CType("GLFWmonitor*") java.lang.foreign.MemorySegment monitor) {
        if (Handles.MH_glfwGetWaylandMonitor == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandMonitor");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWaylandMonitor.invokeExact(Handles.get().PFN_glfwGetWaylandMonitor, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandMonitor", e); }
    }

    public static @CType("struct wl_surface*") java.lang.foreign.MemorySegment glfwGetWaylandWindow(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetWaylandWindow == null) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandWindow");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetWaylandWindow.invokeExact(Handles.get().PFN_glfwGetWaylandWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandWindow", e); }
    }

    public static @CType("EGLDisplay") java.lang.foreign.MemorySegment glfwGetEGLDisplay() {
        if (Handles.MH_glfwGetEGLDisplay == null) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLDisplay");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetEGLDisplay.invokeExact(Handles.get().PFN_glfwGetEGLDisplay);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLDisplay", e); }
    }

    public static @CType("EGLContext") java.lang.foreign.MemorySegment glfwGetEGLContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetEGLContext == null) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLContext");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetEGLContext.invokeExact(Handles.get().PFN_glfwGetEGLContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLContext", e); }
    }

    public static @CType("EGLSurface") java.lang.foreign.MemorySegment glfwGetEGLSurface(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetEGLSurface == null) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLSurface");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetEGLSurface.invokeExact(Handles.get().PFN_glfwGetEGLSurface, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLSurface", e); }
    }

    public static @CType("int") boolean glfwGetOSMesaColorBuffer(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment format, @Out @CType("void**") java.lang.foreign.MemorySegment buffer) {
        if (Handles.MH_glfwGetOSMesaColorBuffer == null) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaColorBuffer");
        try {
            return (int) Handles.MH_glfwGetOSMesaColorBuffer.invokeExact(Handles.get().PFN_glfwGetOSMesaColorBuffer, window, width, height, format, buffer) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaColorBuffer", e); }
    }

    public static @CType("int") boolean glfwGetOSMesaDepthBuffer(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment bytesPerValue, @Out @CType("void**") java.lang.foreign.MemorySegment buffer) {
        if (Handles.MH_glfwGetOSMesaDepthBuffer == null) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaDepthBuffer");
        try {
            return (int) Handles.MH_glfwGetOSMesaDepthBuffer.invokeExact(Handles.get().PFN_glfwGetOSMesaDepthBuffer, window, width, height, bytesPerValue, buffer) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaDepthBuffer", e); }
    }

    public static @CType("OSMesaContext") java.lang.foreign.MemorySegment glfwGetOSMesaContext(@CType("GLFWwindow*") java.lang.foreign.MemorySegment window) {
        if (Handles.MH_glfwGetOSMesaContext == null) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaContext");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetOSMesaContext.invokeExact(Handles.get().PFN_glfwGetOSMesaContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaContext", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFWNative() {
    }
}
