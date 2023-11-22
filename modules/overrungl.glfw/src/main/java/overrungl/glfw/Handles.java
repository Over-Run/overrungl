/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

import overrungl.Configurations;
import overrungl.FunctionDescriptors;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.function.Supplier;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static overrungl.FunctionDescriptors.*;

/**
 * The GLFW method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    private static final SymbolLookup lookup;

    static {
        final Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("glfw", "glfw3", OverrunGL.GLFW_VERSION);
        final var function = Configurations.GLFW_SYMBOL_LOOKUP.get();
        lookup = function != null ? function.apply(lib) : lib.get();
    }

    static final MethodHandle
        glfwInit = downcall("glfwInit", I),
        glfwTerminate = downcall("glfwTerminate", V),
        glfwInitHint = downcall("glfwInitHint", IIV),
        glfwGetVersion = downcallTrivial("glfwGetVersion", PPPV),
        glfwGetVersionString = downcallTrivial("glfwGetVersionString", p),
        glfwGetError = downcallTrivial("glfwGetError", fd_PI),
        glfwSetErrorCallback = downcall("glfwSetErrorCallback", PP),
        glfwGetMonitors = downcall("glfwGetMonitors", Pp),
        glfwGetPrimaryMonitor = downcall("glfwGetPrimaryMonitor", P),
        glfwGetMonitorPos = downcall("glfwGetMonitorPos", PPPV),
        glfwGetMonitorWorkarea = downcall("glfwGetMonitorWorkarea", PPPPPV),
        glfwGetMonitorPhysicalSize = downcall("glfwGetMonitorPhysicalSize", PPPV),
        glfwGetMonitorContentScale = downcall("glfwGetMonitorContentScale", PPPV),
        glfwGetMonitorName = downcall("glfwGetMonitorName", Pp),
        glfwSetMonitorUserPointer = downcallTrivial("glfwSetMonitorUserPointer", PPV),
        glfwGetMonitorUserPointer = downcallTrivial("glfwGetMonitorUserPointer", PP),
        glfwSetMonitorCallback = downcall("glfwSetMonitorCallback", PP),
        glfwGetVideoModes = downcall("glfwGetVideoModes", PPp),
        glfwGetVideoMode = downcall("glfwGetVideoMode", FunctionDescriptor.of(ADDRESS.withTargetLayout(GLFWVidMode.LAYOUT), ADDRESS)),
        glfwSetGamma = downcall("glfwSetGamma", PFV),
        glfwGetGammaRamp = downcall("glfwGetGammaRamp", FunctionDescriptor.of(ADDRESS.withTargetLayout(GLFWGammaRamp.LAYOUT), ADDRESS)),
        glfwSetGammaRamp = downcall("glfwSetGammaRamp", PPV),
        glfwDefaultWindowHints = downcall("glfwDefaultWindowHints", V),
        glfwWindowHint = downcall("glfwWindowHint", IIV),
        glfwWindowHintString = downcall("glfwWindowHintString", IPV),
        glfwCreateWindow = downcall("glfwCreateWindow", IIPPPP),
        glfwDestroyWindow = downcall("glfwDestroyWindow", PV),
        glfwWindowShouldClose = downcallTrivial("glfwWindowShouldClose", fd_PI),
        glfwSetWindowShouldClose = downcallTrivial("glfwSetWindowShouldClose", PIV),
        glfwSetWindowTitle = downcall("glfwSetWindowTitle", PPV),
        glfwSetWindowIcon = downcall("glfwSetWindowIcon", PIPV),
        glfwGetWindowPos = downcall("glfwGetWindowPos", PPPV),
        glfwSetWindowPos = downcall("glfwSetWindowPos", PIIV),
        glfwGetWindowSize = downcall("glfwGetWindowSize", PPPV),
        glfwSetWindowSizeLimits = downcall("glfwSetWindowSizeLimits", PIIIIV),
        glfwSetWindowAspectRatio = downcall("glfwSetWindowAspectRatio", PIIV),
        glfwSetWindowSize = downcall("glfwSetWindowSize", PIIV),
        glfwGetFramebufferSize = downcall("glfwGetFramebufferSize", PPPV),
        glfwGetWindowFrameSize = downcall("glfwGetWindowFrameSize", PPPPPV),
        glfwGetWindowContentScale = downcall("glfwGetWindowContentScale", PPPV),
        glfwGetWindowOpacity = downcall("glfwGetWindowOpacity", PF),
        glfwSetWindowOpacity = downcall("glfwSetWindowOpacity", PFV),
        glfwIconifyWindow = downcall("glfwIconifyWindow", PV),
        glfwRestoreWindow = downcall("glfwRestoreWindow", PV),
        glfwMaximizeWindow = downcall("glfwMaximizeWindow", PV),
        glfwShowWindow = downcall("glfwShowWindow", PV),
        glfwHideWindow = downcall("glfwHideWindow", PV),
        glfwFocusWindow = downcall("glfwFocusWindow", PV),
        glfwRequestWindowAttention = downcall("glfwRequestWindowAttention", PV),
        glfwGetWindowMonitor = downcall("glfwGetWindowMonitor", PP),
        glfwSetWindowMonitor = downcall("glfwSetWindowMonitor", PPIIIIIV),
        glfwGetWindowAttrib = downcall("glfwGetWindowAttrib", PII),
        glfwSetWindowAttrib = downcall("glfwSetWindowAttrib", PIIV),
        glfwSetWindowUserPointer = downcallTrivial("glfwSetWindowUserPointer", PPV),
        glfwGetWindowUserPointer = downcallTrivial("glfwGetWindowUserPointer", PP),
        glfwSetWindowPosCallback = downcall("glfwSetWindowPosCallback", PPP),
        glfwSetWindowSizeCallback = downcall("glfwSetWindowSizeCallback", PPP),
        glfwSetWindowCloseCallback = downcall("glfwSetWindowCloseCallback", PPP),
        glfwSetWindowRefreshCallback = downcall("glfwSetWindowRefreshCallback", PPP),
        glfwSetWindowFocusCallback = downcall("glfwSetWindowFocusCallback", PPP),
        glfwSetWindowIconifyCallback = downcall("glfwSetWindowIconifyCallback", PPP),
        glfwSetWindowMaximizeCallback = downcall("glfwSetWindowMaximizeCallback", PPP),
        glfwSetFramebufferSizeCallback = downcall("glfwSetFramebufferSizeCallback", PPP),
        glfwSetWindowContentScaleCallback = downcall("glfwSetWindowContentScaleCallback", PPP),
        glfwPollEvents = downcall("glfwPollEvents", V),
        glfwWaitEvents = downcall("glfwWaitEvents", V),
        glfwWaitEventsTimeout = downcall("glfwWaitEventsTimeout", DV),
        glfwPostEmptyEvent = downcallTrivial("glfwPostEmptyEvent", V),
        glfwGetInputMode = downcall("glfwGetInputMode", PII),
        glfwSetInputMode = downcall("glfwSetInputMode", PIIV),
        glfwRawMouseMotionSupported = downcall("glfwRawMouseMotionSupported", I),
        glfwGetKeyName = downcall("glfwGetKeyName", IIp),
        glfwGetKeyScancode = downcallTrivial("glfwGetKeyScancode", II),
        glfwGetKey = downcall("glfwGetKey", PII),
        glfwGetMouseButton = downcall("glfwGetMouseButton", PII),
        glfwGetCursorPos = downcall("glfwGetCursorPos", PPPV),
        glfwSetCursorPos = downcall("glfwSetCursorPos", PDDV),
        glfwCreateCursor = downcall("glfwCreateCursor", PIIP),
        glfwCreateStandardCursor = downcall("glfwCreateStandardCursor", IP),
        glfwDestroyCursor = downcall("glfwDestroyCursor", PV),
        glfwSetCursor = downcall("glfwSetCursor", PPV),
        glfwSetKeyCallback = downcall("glfwSetKeyCallback", PPP),
        glfwSetCharCallback = downcall("glfwSetCharCallback", PPP),
        glfwSetMouseButtonCallback = downcall("glfwSetMouseButtonCallback", PPP),
        glfwSetCursorPosCallback = downcall("glfwSetCursorPosCallback", PPP),
        glfwSetCursorEnterCallback = downcall("glfwSetCursorEnterCallback", PPP),
        glfwSetScrollCallback = downcall("glfwSetScrollCallback", PPP),
        glfwSetDropCallback = downcall("glfwSetDropCallback", PPP),
        glfwJoystickPresent = downcall("glfwJoystickPresent", II),
        glfwGetJoystickAxes = downcall("glfwGetJoystickAxes", IPp),
        glfwGetJoystickButtons = downcall("glfwGetJoystickButtons", IPp),
        glfwGetJoystickHats = downcall("glfwGetJoystickHats", IPP),
        glfwGetJoystickName = downcall("glfwGetJoystickName", Ip),
        glfwGetJoystickGUID = downcall("glfwGetJoystickGUID", Ip),
        glfwSetJoystickUserPointer = downcallTrivial("glfwSetJoystickUserPointer", IPV),
        glfwGetJoystickUserPointer = downcallTrivial("glfwGetJoystickUserPointer", IP),
        glfwJoystickIsGamepad = downcall("glfwJoystickIsGamepad", II),
        glfwSetJoystickCallback = downcall("glfwSetJoystickCallback", PP),
        glfwUpdateGamepadMappings = downcall("glfwUpdateGamepadMappings", fd_PI),
        glfwGetGamepadName = downcall("glfwGetGamepadName", Ip),
        glfwGetGamepadState = downcall("glfwGetGamepadState", IPI),
        glfwSetClipboardString = downcall("glfwSetClipboardString", PPV),
        glfwGetClipboardString = downcall("glfwGetClipboardString", Pp),
        glfwGetTime = downcallTrivial("glfwGetTime", D),
        glfwSetTime = downcallTrivial("glfwSetTime", DV),
        glfwGetTimerValue = downcallTrivial("glfwGetTimerValue", J),
        glfwGetTimerFrequency = downcallTrivial("glfwGetTimerFrequency", J),
        glfwMakeContextCurrent = downcall("glfwMakeContextCurrent", PV),
        glfwGetCurrentContext = downcallTrivial("glfwGetCurrentContext", P),
        glfwSwapBuffers = downcall("glfwSwapBuffers", PV),
        glfwSwapInterval = downcall("glfwSwapInterval", IV),
        glfwExtensionSupported = downcall("glfwExtensionSupported", fd_PI),
        glfwGetProcAddress = downcall("glfwGetProcAddress", PP),
        glfwVulkanSupported = downcall("glfwVulkanSupported", I),
        glfwGetRequiredInstanceExtensions = downcall("glfwGetRequiredInstanceExtensions", Pp);

    // GLFW Vulkan
    static final MethodHandle
        glfwGetInstanceProcAddress = downcall("glfwGetInstanceProcAddress", PPP),
        glfwGetPhysicalDevicePresentationSupport = downcall("glfwGetPhysicalDevicePresentationSupport", PPII),
        glfwCreateWindowSurface = downcall("glfwCreateWindowSurface", PPPPI);

    // GLFW Native
    static final MethodHandle
        glfwGetWin32Adapter = downcallNative("glfwGetWin32Adapter", Pp),
        glfwGetWin32Monitor = downcallNative("glfwGetWin32Monitor", Pp),
        glfwGetWin32Window = downcallNative("glfwGetWin32Window", PP),
        glfwGetWGLContext = downcallNative("glfwGetWGLContext", PP),
        glfwGetCocoaMonitor = downcallNative("glfwGetCocoaMonitor", fd_PI),
        glfwGetCocoaWindow = downcallNative("glfwGetCocoaWindow", PP),
        glfwGetNSGLContext = downcallNative("glfwGetNSGLContext", PP),
        glfwGetX11Display = downcallNative("glfwGetX11Display", P),
        glfwGetX11Adapter = downcallNative("glfwGetX11Adapter", PJ),
        glfwGetX11Monitor = downcallNative("glfwGetX11Monitor", PJ),
        glfwGetX11Window = downcallNative("glfwGetX11Window", PJ),
        glfwSetX11SelectionString = downcallNative("glfwSetX11SelectionString", PV),
        glfwGetX11SelectionString = downcallNative("glfwGetX11SelectionString", p),
        glfwGetGLXContext = downcallNative("glfwGetGLXContext", PP),
        glfwGetGLXWindow = downcallNative("glfwGetGLXWindow", PJ),
        glfwGetWaylandDisplay = downcallNative("glfwGetWaylandDisplay", P),
        glfwGetWaylandMonitor = downcallNative("glfwGetWaylandMonitor", PP),
        glfwGetWaylandWindow = downcallNative("glfwGetWaylandWindow", PP),
        glfwGetEGLDisplay = downcallNative("glfwGetEGLDisplay", P),
        glfwGetEGLContext = downcallNative("glfwGetEGLContext", PP),
        glfwGetEGLSurface = downcallNative("glfwGetEGLSurface", PP),
        glfwGetOSMesaColorBuffer = downcallNative("glfwGetOSMesaColorBuffer", PPPPPI),
        glfwGetOSMesaDepthBuffer = downcallNative("glfwGetOSMesaDepthBuffer", PPPPPI),
        glfwGetOSMesaContext = downcallNative("glfwGetOSMesaContext", PP);

    private Handles() {
        //no instance
    }

    private static MethodHandle downcall(String name,
                                         FunctionDescriptor function,
                                         Linker.Option... options) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function, options);
    }

    private static MethodHandle downcall(String name,
                                         FunctionDescriptors function,
                                         Linker.Option... options) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function, options);
    }

    private static MethodHandle downcallTrivial(String name,
                                                FunctionDescriptors function) {
        return downcall(name, function, Linker.Option.isTrivial());
    }

    private static MethodHandle downcallNative(String name,
                                               FunctionDescriptors function) {
        return RuntimeHelper.downcallSafe(lookup.find(name).orElse(MemorySegment.NULL), function);
    }
}
