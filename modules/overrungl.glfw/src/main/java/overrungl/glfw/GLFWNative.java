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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.glfw;

import org.jspecify.annotations.NonNull;
import overrungl.util.CanonicalTypes;
import overrungl.util.MemoryUtil;
import overrungl.util.SymbolNotFoundError;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;

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
        /// The method handle of [`glfwGetWin32Adapter`][#glfwGetWin32Adapter].
        public static final MethodHandle MH_glfwGetWin32Adapter = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetWin32Monitor`][#glfwGetWin32Monitor].
        public static final MethodHandle MH_glfwGetWin32Monitor = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetWin32Window`][#glfwGetWin32Window].
        public static final MethodHandle MH_glfwGetWin32Window = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetWGLContext`][#glfwGetWGLContext].
        public static final MethodHandle MH_glfwGetWGLContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetCocoaMonitor`][#glfwGetCocoaMonitor].
        public static final MethodHandle MH_glfwGetCocoaMonitor = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetCocoaWindow`][#glfwGetCocoaWindow].
        public static final MethodHandle MH_glfwGetCocoaWindow = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetCocoaView`][#glfwGetCocoaView].
        public static final MethodHandle MH_glfwGetCocoaView = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetNSGLContext`][#glfwGetNSGLContext].
        public static final MethodHandle MH_glfwGetNSGLContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetX11Display`][#glfwGetX11Display].
        public static final MethodHandle MH_glfwGetX11Display = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetX11Adapter`][#glfwGetX11Adapter].
        public static final MethodHandle MH_glfwGetX11Adapter = downcallHandle(FunctionDescriptor.of(CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetX11Monitor`][#glfwGetX11Monitor].
        public static final MethodHandle MH_glfwGetX11Monitor = downcallHandle(FunctionDescriptor.of(CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetX11Window`][#glfwGetX11Window].
        public static final MethodHandle MH_glfwGetX11Window = downcallHandle(FunctionDescriptor.of(CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        /// The method handle of [`glfwSetX11SelectionString`][#glfwSetX11SelectionString].
        public static final MethodHandle MH_glfwSetX11SelectionString = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetX11SelectionString`][#glfwGetX11SelectionString].
        public static final MethodHandle MH_glfwGetX11SelectionString = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetGLXContext`][#glfwGetGLXContext].
        public static final MethodHandle MH_glfwGetGLXContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetGLXWindow`][#glfwGetGLXWindow].
        public static final MethodHandle MH_glfwGetGLXWindow = downcallHandle(FunctionDescriptor.of(CanonicalTypes.C_LONG, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetGLXFBConfig`][#glfwGetGLXFBConfig].
        public static final MethodHandle MH_glfwGetGLXFBConfig = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetWaylandDisplay`][#glfwGetWaylandDisplay].
        public static final MethodHandle MH_glfwGetWaylandDisplay = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetWaylandMonitor`][#glfwGetWaylandMonitor].
        public static final MethodHandle MH_glfwGetWaylandMonitor = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetWaylandWindow`][#glfwGetWaylandWindow].
        public static final MethodHandle MH_glfwGetWaylandWindow = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetEGLDisplay`][#glfwGetEGLDisplay].
        public static final MethodHandle MH_glfwGetEGLDisplay = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetEGLContext`][#glfwGetEGLContext].
        public static final MethodHandle MH_glfwGetEGLContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetEGLSurface`][#glfwGetEGLSurface].
        public static final MethodHandle MH_glfwGetEGLSurface = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetEGLConfig`][#glfwGetEGLConfig].
        public static final MethodHandle MH_glfwGetEGLConfig = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetOSMesaColorBuffer`][#glfwGetOSMesaColorBuffer].
        public static final MethodHandle MH_glfwGetOSMesaColorBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetOSMesaDepthBuffer`][#glfwGetOSMesaDepthBuffer].
        public static final MethodHandle MH_glfwGetOSMesaDepthBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`glfwGetOSMesaContext`][#glfwGetOSMesaContext].
        public static final MethodHandle MH_glfwGetOSMesaContext = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The function address of [`glfwGetWin32Adapter`][#glfwGetWin32Adapter].
        public final MemorySegment PFN_glfwGetWin32Adapter;
        /// The function address of [`glfwGetWin32Monitor`][#glfwGetWin32Monitor].
        public final MemorySegment PFN_glfwGetWin32Monitor;
        /// The function address of [`glfwGetWin32Window`][#glfwGetWin32Window].
        public final MemorySegment PFN_glfwGetWin32Window;
        /// The function address of [`glfwGetWGLContext`][#glfwGetWGLContext].
        public final MemorySegment PFN_glfwGetWGLContext;
        /// The function address of [`glfwGetCocoaMonitor`][#glfwGetCocoaMonitor].
        public final MemorySegment PFN_glfwGetCocoaMonitor;
        /// The function address of [`glfwGetCocoaWindow`][#glfwGetCocoaWindow].
        public final MemorySegment PFN_glfwGetCocoaWindow;
        /// The function address of [`glfwGetCocoaView`][#glfwGetCocoaView].
        public final MemorySegment PFN_glfwGetCocoaView;
        /// The function address of [`glfwGetNSGLContext`][#glfwGetNSGLContext].
        public final MemorySegment PFN_glfwGetNSGLContext;
        /// The function address of [`glfwGetX11Display`][#glfwGetX11Display].
        public final MemorySegment PFN_glfwGetX11Display;
        /// The function address of [`glfwGetX11Adapter`][#glfwGetX11Adapter].
        public final MemorySegment PFN_glfwGetX11Adapter;
        /// The function address of [`glfwGetX11Monitor`][#glfwGetX11Monitor].
        public final MemorySegment PFN_glfwGetX11Monitor;
        /// The function address of [`glfwGetX11Window`][#glfwGetX11Window].
        public final MemorySegment PFN_glfwGetX11Window;
        /// The function address of [`glfwSetX11SelectionString`][#glfwSetX11SelectionString].
        public final MemorySegment PFN_glfwSetX11SelectionString;
        /// The function address of [`glfwGetX11SelectionString`][#glfwGetX11SelectionString].
        public final MemorySegment PFN_glfwGetX11SelectionString;
        /// The function address of [`glfwGetGLXContext`][#glfwGetGLXContext].
        public final MemorySegment PFN_glfwGetGLXContext;
        /// The function address of [`glfwGetGLXWindow`][#glfwGetGLXWindow].
        public final MemorySegment PFN_glfwGetGLXWindow;
        /// The function address of [`glfwGetGLXFBConfig`][#glfwGetGLXFBConfig].
        public final MemorySegment PFN_glfwGetGLXFBConfig;
        /// The function address of [`glfwGetWaylandDisplay`][#glfwGetWaylandDisplay].
        public final MemorySegment PFN_glfwGetWaylandDisplay;
        /// The function address of [`glfwGetWaylandMonitor`][#glfwGetWaylandMonitor].
        public final MemorySegment PFN_glfwGetWaylandMonitor;
        /// The function address of [`glfwGetWaylandWindow`][#glfwGetWaylandWindow].
        public final MemorySegment PFN_glfwGetWaylandWindow;
        /// The function address of [`glfwGetEGLDisplay`][#glfwGetEGLDisplay].
        public final MemorySegment PFN_glfwGetEGLDisplay;
        /// The function address of [`glfwGetEGLContext`][#glfwGetEGLContext].
        public final MemorySegment PFN_glfwGetEGLContext;
        /// The function address of [`glfwGetEGLSurface`][#glfwGetEGLSurface].
        public final MemorySegment PFN_glfwGetEGLSurface;
        /// The function address of [`glfwGetEGLConfig`][#glfwGetEGLConfig].
        public final MemorySegment PFN_glfwGetEGLConfig;
        /// The function address of [`glfwGetOSMesaColorBuffer`][#glfwGetOSMesaColorBuffer].
        public final MemorySegment PFN_glfwGetOSMesaColorBuffer;
        /// The function address of [`glfwGetOSMesaDepthBuffer`][#glfwGetOSMesaDepthBuffer].
        public final MemorySegment PFN_glfwGetOSMesaDepthBuffer;
        /// The function address of [`glfwGetOSMesaContext`][#glfwGetOSMesaContext].
        public final MemorySegment PFN_glfwGetOSMesaContext;

        private Handles() {
            var _lookup = GLFWLibrary.lookup();
            PFN_glfwGetWin32Adapter = _lookup.find("glfwGetWin32Adapter").orElse(MemorySegment.NULL);
            PFN_glfwGetWin32Monitor = _lookup.find("glfwGetWin32Monitor").orElse(MemorySegment.NULL);
            PFN_glfwGetWin32Window = _lookup.find("glfwGetWin32Window").orElse(MemorySegment.NULL);
            PFN_glfwGetWGLContext = _lookup.find("glfwGetWGLContext").orElse(MemorySegment.NULL);
            PFN_glfwGetCocoaMonitor = _lookup.find("glfwGetCocoaMonitor").orElse(MemorySegment.NULL);
            PFN_glfwGetCocoaWindow = _lookup.find("glfwGetCocoaWindow").orElse(MemorySegment.NULL);
            PFN_glfwGetCocoaView = _lookup.find("glfwGetCocoaView").orElse(MemorySegment.NULL);
            PFN_glfwGetNSGLContext = _lookup.find("glfwGetNSGLContext").orElse(MemorySegment.NULL);
            PFN_glfwGetX11Display = _lookup.find("glfwGetX11Display").orElse(MemorySegment.NULL);
            PFN_glfwGetX11Adapter = _lookup.find("glfwGetX11Adapter").orElse(MemorySegment.NULL);
            PFN_glfwGetX11Monitor = _lookup.find("glfwGetX11Monitor").orElse(MemorySegment.NULL);
            PFN_glfwGetX11Window = _lookup.find("glfwGetX11Window").orElse(MemorySegment.NULL);
            PFN_glfwSetX11SelectionString = _lookup.find("glfwSetX11SelectionString").orElse(MemorySegment.NULL);
            PFN_glfwGetX11SelectionString = _lookup.find("glfwGetX11SelectionString").orElse(MemorySegment.NULL);
            PFN_glfwGetGLXContext = _lookup.find("glfwGetGLXContext").orElse(MemorySegment.NULL);
            PFN_glfwGetGLXWindow = _lookup.find("glfwGetGLXWindow").orElse(MemorySegment.NULL);
            PFN_glfwGetGLXFBConfig = _lookup.find("glfwGetGLXFBConfig").orElse(MemorySegment.NULL);
            PFN_glfwGetWaylandDisplay = _lookup.find("glfwGetWaylandDisplay").orElse(MemorySegment.NULL);
            PFN_glfwGetWaylandMonitor = _lookup.find("glfwGetWaylandMonitor").orElse(MemorySegment.NULL);
            PFN_glfwGetWaylandWindow = _lookup.find("glfwGetWaylandWindow").orElse(MemorySegment.NULL);
            PFN_glfwGetEGLDisplay = _lookup.find("glfwGetEGLDisplay").orElse(MemorySegment.NULL);
            PFN_glfwGetEGLContext = _lookup.find("glfwGetEGLContext").orElse(MemorySegment.NULL);
            PFN_glfwGetEGLSurface = _lookup.find("glfwGetEGLSurface").orElse(MemorySegment.NULL);
            PFN_glfwGetEGLConfig = _lookup.find("glfwGetEGLConfig").orElse(MemorySegment.NULL);
            PFN_glfwGetOSMesaColorBuffer = _lookup.find("glfwGetOSMesaColorBuffer").orElse(MemorySegment.NULL);
            PFN_glfwGetOSMesaDepthBuffer = _lookup.find("glfwGetOSMesaDepthBuffer").orElse(MemorySegment.NULL);
            PFN_glfwGetOSMesaContext = _lookup.find("glfwGetOSMesaContext").orElse(MemorySegment.NULL);
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `glfwGetWin32Adapter`.
    /// ```
    /// const char* glfwGetWin32Adapter(GLFWmonitor* monitor);
    /// ```
    public static @NonNull MemorySegment glfwGetWin32Adapter(@NonNull MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWin32Adapter)) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Adapter");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWin32Adapter", monitor); }
        return (MemorySegment) Handles.MH_glfwGetWin32Adapter.invokeExact(Handles.get().PFN_glfwGetWin32Adapter, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Adapter", e); }
    }

    /// Invokes `glfwGetWin32Monitor`.
    /// ```
    /// const char* glfwGetWin32Monitor(GLFWmonitor* monitor);
    /// ```
    public static @NonNull MemorySegment glfwGetWin32Monitor(@NonNull MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWin32Monitor)) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Monitor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWin32Monitor", monitor); }
        return (MemorySegment) Handles.MH_glfwGetWin32Monitor.invokeExact(Handles.get().PFN_glfwGetWin32Monitor, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Monitor", e); }
    }

    /// Invokes `glfwGetWin32Window`.
    /// ```
    /// (void*) HWND glfwGetWin32Window(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetWin32Window(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWin32Window)) throw new SymbolNotFoundError("Symbol not found: glfwGetWin32Window");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWin32Window", window); }
        return (MemorySegment) Handles.MH_glfwGetWin32Window.invokeExact(Handles.get().PFN_glfwGetWin32Window, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWin32Window", e); }
    }

    /// Invokes `glfwGetWGLContext`.
    /// ```
    /// (void*) HGLRC glfwGetWGLContext(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetWGLContext(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWGLContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetWGLContext");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWGLContext", window); }
        return (MemorySegment) Handles.MH_glfwGetWGLContext.invokeExact(Handles.get().PFN_glfwGetWGLContext, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWGLContext", e); }
    }

    /// Invokes `glfwGetCocoaMonitor`.
    /// ```
    /// (uint32_t) CGDirectDisplayID glfwGetCocoaMonitor(GLFWmonitor* monitor);
    /// ```
    public static int glfwGetCocoaMonitor(@NonNull MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetCocoaMonitor)) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaMonitor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetCocoaMonitor", monitor); }
        return (int) Handles.MH_glfwGetCocoaMonitor.invokeExact(Handles.get().PFN_glfwGetCocoaMonitor, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaMonitor", e); }
    }

    /// Invokes `glfwGetCocoaWindow`.
    /// ```
    /// (void*) id glfwGetCocoaWindow(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetCocoaWindow(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetCocoaWindow)) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaWindow");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetCocoaWindow", window); }
        return (MemorySegment) Handles.MH_glfwGetCocoaWindow.invokeExact(Handles.get().PFN_glfwGetCocoaWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaWindow", e); }
    }

    /// Invokes `glfwGetCocoaView`.
    /// ```
    /// (void*) id glfwGetCocoaView(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetCocoaView(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetCocoaView)) throw new SymbolNotFoundError("Symbol not found: glfwGetCocoaView");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetCocoaView", window); }
        return (MemorySegment) Handles.MH_glfwGetCocoaView.invokeExact(Handles.get().PFN_glfwGetCocoaView, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetCocoaView", e); }
    }

    /// Invokes `glfwGetNSGLContext`.
    /// ```
    /// (void*) id glfwGetNSGLContext(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetNSGLContext(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetNSGLContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetNSGLContext");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetNSGLContext", window); }
        return (MemorySegment) Handles.MH_glfwGetNSGLContext.invokeExact(Handles.get().PFN_glfwGetNSGLContext, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetNSGLContext", e); }
    }

    /// Invokes `glfwGetX11Display`.
    /// ```
    /// Display* glfwGetX11Display();
    /// ```
    public static @NonNull MemorySegment glfwGetX11Display() {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11Display)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Display");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetX11Display"); }
        return (MemorySegment) Handles.MH_glfwGetX11Display.invokeExact(Handles.get().PFN_glfwGetX11Display); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Display", e); }
    }

    /// Invokes `glfwGetX11Adapter`.
    /// ```
    /// ((unsigned long) XID) RRCrtc glfwGetX11Adapter(GLFWmonitor* monitor);
    /// ```
    public static long glfwGetX11Adapter(@NonNull MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11Adapter)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Adapter");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetX11Adapter", monitor); }
        return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, Handles.MH_glfwGetX11Adapter.invoke(Handles.get().PFN_glfwGetX11Adapter, monitor)); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Adapter", e); }
    }

    /// Invokes `glfwGetX11Monitor`.
    /// ```
    /// ((unsigned long) XID) RROutput glfwGetX11Monitor(GLFWmonitor* monitor);
    /// ```
    public static long glfwGetX11Monitor(@NonNull MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11Monitor)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Monitor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetX11Monitor", monitor); }
        return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, Handles.MH_glfwGetX11Monitor.invoke(Handles.get().PFN_glfwGetX11Monitor, monitor)); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Monitor", e); }
    }

    /// Invokes `glfwGetX11Window`.
    /// ```
    /// ((unsigned long) XID) Window glfwGetX11Window(GLFWwindow* window);
    /// ```
    public static long glfwGetX11Window(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11Window)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11Window");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetX11Window", window); }
        return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, Handles.MH_glfwGetX11Window.invoke(Handles.get().PFN_glfwGetX11Window, window)); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetX11Window", e); }
    }

    /// Invokes `glfwSetX11SelectionString`.
    /// ```
    /// void glfwSetX11SelectionString(const char* string);
    /// ```
    public static void glfwSetX11SelectionString(@NonNull MemorySegment string) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwSetX11SelectionString)) throw new SymbolNotFoundError("Symbol not found: glfwSetX11SelectionString");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwSetX11SelectionString", string); }
        Handles.MH_glfwSetX11SelectionString.invokeExact(Handles.get().PFN_glfwSetX11SelectionString, string); }
        catch (Throwable e) { throw new RuntimeException("error in glfwSetX11SelectionString", e); }
    }

    /// Invokes `glfwGetX11SelectionString`.
    /// ```
    /// const char* glfwGetX11SelectionString();
    /// ```
    public static @NonNull MemorySegment glfwGetX11SelectionString() {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetX11SelectionString)) throw new SymbolNotFoundError("Symbol not found: glfwGetX11SelectionString");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetX11SelectionString"); }
        return (MemorySegment) Handles.MH_glfwGetX11SelectionString.invokeExact(Handles.get().PFN_glfwGetX11SelectionString); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetX11SelectionString", e); }
    }

    /// Invokes `glfwGetGLXContext`.
    /// ```
    /// (struct __GLXcontextRec *) GLXContext glfwGetGLXContext(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetGLXContext(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetGLXContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetGLXContext");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGLXContext", window); }
        return (MemorySegment) Handles.MH_glfwGetGLXContext.invokeExact(Handles.get().PFN_glfwGetGLXContext, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXContext", e); }
    }

    /// Invokes `glfwGetGLXWindow`.
    /// ```
    /// ((unsigned long) XID) GLXWindow glfwGetGLXWindow(GLFWwindow* window);
    /// ```
    public static long glfwGetGLXWindow(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetGLXWindow)) throw new SymbolNotFoundError("Symbol not found: glfwGetGLXWindow");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGLXWindow", window); }
        return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, Handles.MH_glfwGetGLXWindow.invoke(Handles.get().PFN_glfwGetGLXWindow, window)); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXWindow", e); }
    }

    /// Invokes `glfwGetGLXFBConfig`.
    /// ```
    /// (int) GLFWboolean glfwGetGLXFBConfig(GLFWwindow* window, GLXFBConfig* config);
    /// ```
    public static boolean glfwGetGLXFBConfig(@NonNull MemorySegment window, @NonNull MemorySegment config) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetGLXFBConfig)) throw new SymbolNotFoundError("Symbol not found: glfwGetGLXFBConfig");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetGLXFBConfig", window, config); }
        return (((int) Handles.MH_glfwGetGLXFBConfig.invokeExact(Handles.get().PFN_glfwGetGLXFBConfig, window, config)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetGLXFBConfig", e); }
    }

    /// Invokes `glfwGetWaylandDisplay`.
    /// ```
    /// struct wl_display * glfwGetWaylandDisplay();
    /// ```
    public static @NonNull MemorySegment glfwGetWaylandDisplay() {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWaylandDisplay)) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandDisplay");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWaylandDisplay"); }
        return (MemorySegment) Handles.MH_glfwGetWaylandDisplay.invokeExact(Handles.get().PFN_glfwGetWaylandDisplay); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandDisplay", e); }
    }

    /// Invokes `glfwGetWaylandMonitor`.
    /// ```
    /// struct wl_output * glfwGetWaylandMonitor(GLFWmonitor* monitor);
    /// ```
    public static @NonNull MemorySegment glfwGetWaylandMonitor(@NonNull MemorySegment monitor) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWaylandMonitor)) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandMonitor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWaylandMonitor", monitor); }
        return (MemorySegment) Handles.MH_glfwGetWaylandMonitor.invokeExact(Handles.get().PFN_glfwGetWaylandMonitor, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandMonitor", e); }
    }

    /// Invokes `glfwGetWaylandWindow`.
    /// ```
    /// struct wl_surface * glfwGetWaylandWindow(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetWaylandWindow(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetWaylandWindow)) throw new SymbolNotFoundError("Symbol not found: glfwGetWaylandWindow");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetWaylandWindow", window); }
        return (MemorySegment) Handles.MH_glfwGetWaylandWindow.invokeExact(Handles.get().PFN_glfwGetWaylandWindow, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetWaylandWindow", e); }
    }

    /// Invokes `glfwGetEGLDisplay`.
    /// ```
    /// (void*) EGLDisplay glfwGetEGLDisplay();
    /// ```
    public static @NonNull MemorySegment glfwGetEGLDisplay() {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetEGLDisplay)) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLDisplay");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetEGLDisplay"); }
        return (MemorySegment) Handles.MH_glfwGetEGLDisplay.invokeExact(Handles.get().PFN_glfwGetEGLDisplay); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLDisplay", e); }
    }

    /// Invokes `glfwGetEGLContext`.
    /// ```
    /// (void*) EGLContext glfwGetEGLContext(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetEGLContext(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetEGLContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLContext");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetEGLContext", window); }
        return (MemorySegment) Handles.MH_glfwGetEGLContext.invokeExact(Handles.get().PFN_glfwGetEGLContext, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLContext", e); }
    }

    /// Invokes `glfwGetEGLSurface`.
    /// ```
    /// (void*) EGLSurface glfwGetEGLSurface(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetEGLSurface(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetEGLSurface)) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLSurface");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetEGLSurface", window); }
        return (MemorySegment) Handles.MH_glfwGetEGLSurface.invokeExact(Handles.get().PFN_glfwGetEGLSurface, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLSurface", e); }
    }

    /// Invokes `glfwGetEGLConfig`.
    /// ```
    /// (int) GLFWboolean glfwGetEGLConfig(GLFWwindow* window, EGLConfig* config);
    /// ```
    public static boolean glfwGetEGLConfig(@NonNull MemorySegment window, @NonNull MemorySegment config) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetEGLConfig)) throw new SymbolNotFoundError("Symbol not found: glfwGetEGLConfig");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetEGLConfig", window, config); }
        return (((int) Handles.MH_glfwGetEGLConfig.invokeExact(Handles.get().PFN_glfwGetEGLConfig, window, config)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetEGLConfig", e); }
    }

    /// Invokes `glfwGetOSMesaColorBuffer`.
    /// ```
    /// int glfwGetOSMesaColorBuffer(GLFWwindow* window, int* width, int* height, int* format, void** buffer);
    /// ```
    public static int glfwGetOSMesaColorBuffer(@NonNull MemorySegment window, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment format, @NonNull MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetOSMesaColorBuffer)) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaColorBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetOSMesaColorBuffer", window, width, height, format, buffer); }
        return (int) Handles.MH_glfwGetOSMesaColorBuffer.invokeExact(Handles.get().PFN_glfwGetOSMesaColorBuffer, window, width, height, format, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaColorBuffer", e); }
    }

    /// Invokes `glfwGetOSMesaDepthBuffer`.
    /// ```
    /// int glfwGetOSMesaDepthBuffer(GLFWwindow* window, int* width, int* height, int* bytesPerValue, void** buffer);
    /// ```
    public static int glfwGetOSMesaDepthBuffer(@NonNull MemorySegment window, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment bytesPerValue, @NonNull MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetOSMesaDepthBuffer)) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaDepthBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetOSMesaDepthBuffer", window, width, height, bytesPerValue, buffer); }
        return (int) Handles.MH_glfwGetOSMesaDepthBuffer.invokeExact(Handles.get().PFN_glfwGetOSMesaDepthBuffer, window, width, height, bytesPerValue, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaDepthBuffer", e); }
    }

    /// Invokes `glfwGetOSMesaContext`.
    /// ```
    /// (struct OSMesaContext *) OSMesaContext glfwGetOSMesaContext(GLFWwindow* window);
    /// ```
    public static @NonNull MemorySegment glfwGetOSMesaContext(@NonNull MemorySegment window) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_glfwGetOSMesaContext)) throw new SymbolNotFoundError("Symbol not found: glfwGetOSMesaContext");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glfwGetOSMesaContext", window); }
        return (MemorySegment) Handles.MH_glfwGetOSMesaContext.invokeExact(Handles.get().PFN_glfwGetOSMesaContext, window); }
        catch (Throwable e) { throw new RuntimeException("error in glfwGetOSMesaContext", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFWNative() {
    }
}
