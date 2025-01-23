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

import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    /// Method handles.
    public static final class Handles {
        /// The method handle of `glfwGetWin32Adapter`.
        public static final MethodHandle MH_glfwGetWin32Adapter = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWin32Monitor`.
        public static final MethodHandle MH_glfwGetWin32Monitor = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWin32Window`.
        public static final MethodHandle MH_glfwGetWin32Window = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWGLContext`.
        public static final MethodHandle MH_glfwGetWGLContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCocoaMonitor`.
        public static final MethodHandle MH_glfwGetCocoaMonitor = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCocoaWindow`.
        public static final MethodHandle MH_glfwGetCocoaWindow = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetCocoaView`.
        public static final MethodHandle MH_glfwGetCocoaView = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetNSGLContext`.
        public static final MethodHandle MH_glfwGetNSGLContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11Display`.
        public static final MethodHandle MH_glfwGetX11Display = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11Adapter`.
        public static final MethodHandle MH_glfwGetX11Adapter = RuntimeHelper.downcall(FunctionDescriptor.of(CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11Monitor`.
        public static final MethodHandle MH_glfwGetX11Monitor = RuntimeHelper.downcall(FunctionDescriptor.of(CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11Window`.
        public static final MethodHandle MH_glfwGetX11Window = RuntimeHelper.downcall(FunctionDescriptor.of(CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        /// The method handle of `glfwSetX11SelectionString`.
        public static final MethodHandle MH_glfwSetX11SelectionString = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetX11SelectionString`.
        public static final MethodHandle MH_glfwGetX11SelectionString = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetGLXContext`.
        public static final MethodHandle MH_glfwGetGLXContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetGLXWindow`.
        public static final MethodHandle MH_glfwGetGLXWindow = RuntimeHelper.downcall(FunctionDescriptor.of(CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWaylandDisplay`.
        public static final MethodHandle MH_glfwGetWaylandDisplay = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWaylandMonitor`.
        public static final MethodHandle MH_glfwGetWaylandMonitor = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetWaylandWindow`.
        public static final MethodHandle MH_glfwGetWaylandWindow = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetEGLDisplay`.
        public static final MethodHandle MH_glfwGetEGLDisplay = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetEGLContext`.
        public static final MethodHandle MH_glfwGetEGLContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetEGLSurface`.
        public static final MethodHandle MH_glfwGetEGLSurface = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetOSMesaColorBuffer`.
        public static final MethodHandle MH_glfwGetOSMesaColorBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetOSMesaDepthBuffer`.
        public static final MethodHandle MH_glfwGetOSMesaDepthBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `glfwGetOSMesaContext`.
        public static final MethodHandle MH_glfwGetOSMesaContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
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

    /// Signature:
    /// ```
    /// const char* glfwGetWin32Adapter(GLFWmonitor* monitor);
    /// ```
    public static MemorySegment glfwGetWin32Adapter(MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWin32Adapter)) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Adapter");
        try {
            return (MemorySegment) Handles.MH_glfwGetWin32Adapter.invokeExact(Handles.get().PFN_glfwGetWin32Adapter, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Adapter", e); }
    }

    /// Signature:
    /// ```
    /// const char* glfwGetWin32Monitor(GLFWmonitor* monitor);
    /// ```
    public static MemorySegment glfwGetWin32Monitor(MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWin32Monitor)) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Monitor");
        try {
            return (MemorySegment) Handles.MH_glfwGetWin32Monitor.invokeExact(Handles.get().PFN_glfwGetWin32Monitor, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Monitor", e); }
    }

    /// Signature:
    /// ```
    /// void* glfwGetWin32Window(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetWin32Window(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWin32Window)) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Window");
        try {
            return (MemorySegment) Handles.MH_glfwGetWin32Window.invokeExact(Handles.get().PFN_glfwGetWin32Window, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Window", e); }
    }

    /// Signature:
    /// ```
    /// void* glfwGetWGLContext(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetWGLContext(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWGLContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetWGLContext");
        try {
            return (MemorySegment) Handles.MH_glfwGetWGLContext.invokeExact(Handles.get().PFN_glfwGetWGLContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWGLContext", e); }
    }

    /// Signature:
    /// ```
    /// uint32_t glfwGetCocoaMonitor(GLFWmonitor* monitor);
    /// ```
    public static int glfwGetCocoaMonitor(MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetCocoaMonitor)) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaMonitor");
        try {
            return (int) Handles.MH_glfwGetCocoaMonitor.invokeExact(Handles.get().PFN_glfwGetCocoaMonitor, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaMonitor", e); }
    }

    /// Signature:
    /// ```
    /// void* glfwGetCocoaWindow(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetCocoaWindow(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetCocoaWindow)) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaWindow");
        try {
            return (MemorySegment) Handles.MH_glfwGetCocoaWindow.invokeExact(Handles.get().PFN_glfwGetCocoaWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaWindow", e); }
    }

    /// Signature:
    /// ```
    /// void* glfwGetCocoaView(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetCocoaView(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetCocoaView)) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaView");
        try {
            return (MemorySegment) Handles.MH_glfwGetCocoaView.invokeExact(Handles.get().PFN_glfwGetCocoaView, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaView", e); }
    }

    /// Signature:
    /// ```
    /// void* glfwGetNSGLContext(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetNSGLContext(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetNSGLContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetNSGLContext");
        try {
            return (MemorySegment) Handles.MH_glfwGetNSGLContext.invokeExact(Handles.get().PFN_glfwGetNSGLContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetNSGLContext", e); }
    }

    /// Signature:
    /// ```
    /// Display* glfwGetX11Display();
    /// ```
    public static MemorySegment glfwGetX11Display() {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11Display)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Display");
        try {
            return (MemorySegment) Handles.MH_glfwGetX11Display.invokeExact(Handles.get().PFN_glfwGetX11Display);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Display", e); }
    }

    /// Signature:
    /// ```
    /// unsigned long glfwGetX11Adapter(GLFWmonitor* monitor);
    /// ```
    public static long glfwGetX11Adapter(MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11Adapter)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Adapter");
        try {
            return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, Handles.MH_glfwGetX11Adapter.invokeWithArguments(Handles.get().PFN_glfwGetX11Adapter, monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Adapter", e); }
    }

    /// Signature:
    /// ```
    /// unsigned long glfwGetX11Monitor(GLFWmonitor* monitor);
    /// ```
    public static long glfwGetX11Monitor(MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11Monitor)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Monitor");
        try {
            return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, Handles.MH_glfwGetX11Monitor.invokeWithArguments(Handles.get().PFN_glfwGetX11Monitor, monitor));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Monitor", e); }
    }

    /// Signature:
    /// ```
    /// unsigned long glfwGetX11Window(GLFWwindow* window);
    /// ```
    public static long glfwGetX11Window(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11Window)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Window");
        try {
            return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, Handles.MH_glfwGetX11Window.invokeWithArguments(Handles.get().PFN_glfwGetX11Window, window));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Window", e); }
    }

    /// Signature:
    /// ```
    /// void glfwSetX11SelectionString(const char* string);
    /// ```
    public static void glfwSetX11SelectionString(MemorySegment string) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwSetX11SelectionString)) throw new SymbolNotFoundError("Symbol not found: glfwSetX11SelectionString");
        try {
            Handles.MH_glfwSetX11SelectionString.invokeExact(Handles.get().PFN_glfwSetX11SelectionString, string);
        } catch (Throwable e) { throw new RuntimeException("error in glfwSetX11SelectionString", e); }
    }

    /// Signature:
    /// ```
    /// const char* glfwGetX11SelectionString();
    /// ```
    public static MemorySegment glfwGetX11SelectionString() {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11SelectionString)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11SelectionString");
        try {
            return (MemorySegment) Handles.MH_glfwGetX11SelectionString.invokeExact(Handles.get().PFN_glfwGetX11SelectionString);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetX11SelectionString", e); }
    }

    /// Signature:
    /// ```
    /// GLXContext glfwGetGLXContext(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetGLXContext(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetGLXContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetGLXContext");
        try {
            return (MemorySegment) Handles.MH_glfwGetGLXContext.invokeExact(Handles.get().PFN_glfwGetGLXContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXContext", e); }
    }

    /// Signature:
    /// ```
    /// unsigned long glfwGetGLXWindow(GLFWwindow* window);
    /// ```
    public static long glfwGetGLXWindow(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetGLXWindow)) throw new SymbolNotFoundError("Symbol not found: glfwGetGLXWindow");
        try {
            return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, Handles.MH_glfwGetGLXWindow.invokeWithArguments(Handles.get().PFN_glfwGetGLXWindow, window));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXWindow", e); }
    }

    /// Signature:
    /// ```
    /// wl_display * glfwGetWaylandDisplay();
    /// ```
    public static MemorySegment glfwGetWaylandDisplay() {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWaylandDisplay)) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandDisplay");
        try {
            return (MemorySegment) Handles.MH_glfwGetWaylandDisplay.invokeExact(Handles.get().PFN_glfwGetWaylandDisplay);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandDisplay", e); }
    }

    /// Signature:
    /// ```
    /// wl_output * glfwGetWaylandMonitor(GLFWmonitor* monitor);
    /// ```
    public static MemorySegment glfwGetWaylandMonitor(MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWaylandMonitor)) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandMonitor");
        try {
            return (MemorySegment) Handles.MH_glfwGetWaylandMonitor.invokeExact(Handles.get().PFN_glfwGetWaylandMonitor, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandMonitor", e); }
    }

    /// Signature:
    /// ```
    /// wl_surface * glfwGetWaylandWindow(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetWaylandWindow(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWaylandWindow)) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandWindow");
        try {
            return (MemorySegment) Handles.MH_glfwGetWaylandWindow.invokeExact(Handles.get().PFN_glfwGetWaylandWindow, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandWindow", e); }
    }

    /// Signature:
    /// ```
    /// void* glfwGetEGLDisplay();
    /// ```
    public static MemorySegment glfwGetEGLDisplay() {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetEGLDisplay)) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLDisplay");
        try {
            return (MemorySegment) Handles.MH_glfwGetEGLDisplay.invokeExact(Handles.get().PFN_glfwGetEGLDisplay);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLDisplay", e); }
    }

    /// Signature:
    /// ```
    /// void* glfwGetEGLContext(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetEGLContext(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetEGLContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLContext");
        try {
            return (MemorySegment) Handles.MH_glfwGetEGLContext.invokeExact(Handles.get().PFN_glfwGetEGLContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLContext", e); }
    }

    /// Signature:
    /// ```
    /// void* glfwGetEGLSurface(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetEGLSurface(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetEGLSurface)) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLSurface");
        try {
            return (MemorySegment) Handles.MH_glfwGetEGLSurface.invokeExact(Handles.get().PFN_glfwGetEGLSurface, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLSurface", e); }
    }

    /// Signature:
    /// ```
    /// int glfwGetOSMesaColorBuffer(GLFWwindow* window, int* width, int* height, int* format, void** buffer);
    /// ```
    public static int glfwGetOSMesaColorBuffer(MemorySegment window, MemorySegment width, MemorySegment height, MemorySegment format, MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetOSMesaColorBuffer)) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaColorBuffer");
        try {
            return (int) Handles.MH_glfwGetOSMesaColorBuffer.invokeExact(Handles.get().PFN_glfwGetOSMesaColorBuffer, window, width, height, format, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaColorBuffer", e); }
    }

    /// Signature:
    /// ```
    /// int glfwGetOSMesaDepthBuffer(GLFWwindow* window, int* width, int* height, int* bytesPerValue, void** buffer);
    /// ```
    public static int glfwGetOSMesaDepthBuffer(MemorySegment window, MemorySegment width, MemorySegment height, MemorySegment bytesPerValue, MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetOSMesaDepthBuffer)) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaDepthBuffer");
        try {
            return (int) Handles.MH_glfwGetOSMesaDepthBuffer.invokeExact(Handles.get().PFN_glfwGetOSMesaDepthBuffer, window, width, height, bytesPerValue, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaDepthBuffer", e); }
    }

    /// Signature:
    /// ```
    /// OSMesaContext * glfwGetOSMesaContext(GLFWwindow* window);
    /// ```
    public static MemorySegment glfwGetOSMesaContext(MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetOSMesaContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaContext");
        try {
            return (MemorySegment) Handles.MH_glfwGetOSMesaContext.invokeExact(Handles.get().PFN_glfwGetOSMesaContext, window);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaContext", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFWNative() {
    }
}
