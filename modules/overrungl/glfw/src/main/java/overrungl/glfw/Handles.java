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

import overrungl.FunctionDescriptors;
import overrungl.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static overrungl.FunctionDescriptors.*;

/**
 * The GLFW method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    private static boolean initialized;
    static SymbolLookup lookup;
    static MethodHandle
        glfwInit, glfwTerminate, glfwInitHint, glfwGetVersion, glfwGetVersionString, glfwGetError, glfwSetErrorCallback,
        glfwGetMonitors, glfwGetPrimaryMonitor, glfwGetMonitorPos, glfwGetMonitorWorkarea, glfwGetMonitorPhysicalSize,
        glfwGetMonitorContentScale, glfwGetMonitorName, glfwSetMonitorUserPointer, glfwGetMonitorUserPointer,
        glfwSetMonitorCallback, glfwGetVideoModes, glfwGetVideoMode, glfwSetGamma, glfwGetGammaRamp, glfwSetGammaRamp,
        glfwDefaultWindowHints, glfwWindowHint, glfwWindowHintString, glfwCreateWindow, glfwDestroyWindow, glfwWindowShouldClose,
        glfwSetWindowShouldClose, glfwSetWindowTitle, glfwSetWindowIcon, glfwGetWindowPos, glfwSetWindowPos, glfwGetWindowSize,
        glfwSetWindowSizeLimits, glfwSetWindowAspectRatio, glfwSetWindowSize, glfwGetFramebufferSize, glfwGetWindowFrameSize,
        glfwGetWindowContentScale, glfwGetWindowOpacity, glfwSetWindowOpacity, glfwIconifyWindow, glfwRestoreWindow,
        glfwMaximizeWindow, glfwShowWindow, glfwHideWindow, glfwFocusWindow, glfwRequestWindowAttention, glfwGetWindowMonitor,
        glfwSetWindowMonitor, glfwGetWindowAttrib, glfwSetWindowAttrib, glfwSetWindowUserPointer, glfwGetWindowUserPointer,
        glfwSetWindowPosCallback, glfwSetWindowSizeCallback, glfwSetWindowCloseCallback, glfwSetWindowRefreshCallback,
        glfwSetWindowFocusCallback, glfwSetWindowIconifyCallback, glfwSetWindowMaximizeCallback, glfwSetFramebufferSizeCallback,
        glfwSetWindowContentScaleCallback, glfwPollEvents, glfwWaitEvents, glfwWaitEventsTimeout, glfwPostEmptyEvent,
        glfwGetInputMode, glfwSetInputMode, glfwRawMouseMotionSupported, glfwGetKeyName, glfwGetKeyScancode, glfwGetKey,
        glfwGetMouseButton, glfwGetCursorPos, glfwSetCursorPos, glfwCreateCursor, glfwCreateStandardCursor, glfwDestroyCursor,
        glfwSetCursor, glfwSetKeyCallback, glfwSetCharCallback, glfwSetMouseButtonCallback, glfwSetCursorPosCallback,
        glfwSetCursorEnterCallback, glfwSetScrollCallback, glfwSetDropCallback, glfwJoystickPresent, glfwGetJoystickAxes,
        glfwGetJoystickButtons, glfwGetJoystickHats, glfwGetJoystickName, glfwGetJoystickGUID, glfwSetJoystickUserPointer,
        glfwGetJoystickUserPointer, glfwJoystickIsGamepad, glfwSetJoystickCallback, glfwUpdateGamepadMappings, glfwGetGamepadName,
        glfwGetGamepadState, glfwSetClipboardString, glfwGetClipboardString, glfwGetTime, glfwSetTime, glfwGetTimerValue,
        glfwGetTimerFrequency, glfwMakeContextCurrent, glfwGetCurrentContext, glfwSwapBuffers, glfwSwapInterval,
        glfwExtensionSupported, glfwGetProcAddress, glfwVulkanSupported, glfwGetRequiredInstanceExtensions;

    // GLFW Vulkan
    static MethodHandle
        glfwGetInstanceProcAddress, glfwGetPhysicalDevicePresentationSupport, glfwCreateWindowSurface;

    // GLFW Native
    static MethodHandle
        glfwGetWin32Adapter, glfwGetWin32Monitor, glfwGetWin32Window, glfwGetWGLContext, glfwGetCocoaMonitor, glfwGetCocoaWindow,
        glfwGetNSGLContext, glfwGetX11Display, glfwGetX11Adapter, glfwGetX11Monitor, glfwGetX11Window, glfwSetX11SelectionString,
        glfwGetX11SelectionString, glfwGetGLXContext, glfwGetGLXWindow, glfwGetWaylandDisplay, glfwGetWaylandMonitor, glfwGetWaylandWindow,
        glfwGetEGLDisplay, glfwGetEGLContext, glfwGetEGLSurface, glfwGetOSMesaColorBuffer, glfwGetOSMesaDepthBuffer, glfwGetOSMesaContext;

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

    private static void createNative() {
        glfwGetWin32Adapter = downcallNative("glfwGetWin32Adapter", Pp);
        glfwGetWin32Monitor = downcallNative("glfwGetWin32Monitor", Pp);
        glfwGetWin32Window = downcallNative("glfwGetWin32Window", PP);
        glfwGetWGLContext = downcallNative("glfwGetWGLContext", PP);
        glfwGetCocoaMonitor = downcallNative("glfwGetCocoaMonitor", fd_PI);
        glfwGetCocoaWindow = downcallNative("glfwGetCocoaWindow", PP);
        glfwGetNSGLContext = downcallNative("glfwGetNSGLContext", PP);
        glfwGetX11Display = downcallNative("glfwGetX11Display", P);
        glfwGetX11Adapter = downcallNative("glfwGetX11Adapter", PJ);
        glfwGetX11Monitor = downcallNative("glfwGetX11Monitor", PJ);
        glfwGetX11Window = downcallNative("glfwGetX11Window", PJ);
        glfwSetX11SelectionString = downcallNative("glfwSetX11SelectionString", PV);
        glfwGetX11SelectionString = downcallNative("glfwGetX11SelectionString", p);
        glfwGetGLXContext = downcallNative("glfwGetGLXContext", PP);
        glfwGetGLXWindow = downcallNative("glfwGetGLXWindow", PJ);
        glfwGetWaylandDisplay = downcallNative("glfwGetWaylandDisplay", P);
        glfwGetWaylandMonitor = downcallNative("glfwGetWaylandMonitor", PP);
        glfwGetWaylandWindow = downcallNative("glfwGetWaylandWindow", PP);
        glfwGetEGLDisplay = downcallNative("glfwGetEGLDisplay", P);
        glfwGetEGLContext = downcallNative("glfwGetEGLContext", PP);
        glfwGetEGLSurface = downcallNative("glfwGetEGLSurface", PP);
        glfwGetOSMesaColorBuffer = downcallNative("glfwGetOSMesaColorBuffer", PPPPPI);
        glfwGetOSMesaDepthBuffer = downcallNative("glfwGetOSMesaDepthBuffer", PPPPPI);
        glfwGetOSMesaContext = downcallNative("glfwGetOSMesaContext", PP);
    }

    static void create() {
        if (initialized) return;
        initialized = true;

        lookup = RuntimeHelper.load("glfw", "glfw3",
            STR."\{GLFW.VERSION_MAJOR}.\{GLFW.VERSION_MINOR}.\{GLFW.VERSION_REVISION}");
        glfwInit = downcall("glfwInit", I);
        glfwTerminate = downcall("glfwTerminate", V);
        glfwInitHint = downcallTrivial("glfwInitHint", IIV);
        glfwGetVersion = downcallTrivial("glfwGetVersion", PPPV);
        glfwGetVersionString = downcallTrivial("glfwGetVersionString", p);
        glfwGetError = downcallTrivial("glfwGetError", fd_PI);
        glfwSetErrorCallback = downcall("glfwSetErrorCallback", PP);
        glfwGetMonitors = downcallTrivial("glfwGetMonitors", Pp);
        glfwGetPrimaryMonitor = downcallTrivial("glfwGetPrimaryMonitor", P);
        glfwGetMonitorPos = downcallTrivial("glfwGetMonitorPos", PPPV);
        glfwGetMonitorWorkarea = downcallTrivial("glfwGetMonitorWorkarea", PPPPPV);
        glfwGetMonitorPhysicalSize = downcallTrivial("glfwGetMonitorPhysicalSize", PPPV);
        glfwGetMonitorContentScale = downcallTrivial("glfwGetMonitorContentScale", PPPV);
        glfwGetMonitorName = downcallTrivial("glfwGetMonitorName", Pp);
        glfwSetMonitorUserPointer = downcallTrivial("glfwSetMonitorUserPointer", PPV);
        glfwGetMonitorUserPointer = downcallTrivial("glfwGetMonitorUserPointer", PP);
        glfwSetMonitorCallback = downcall("glfwSetMonitorCallback", PP);
        glfwGetVideoModes = downcallTrivial("glfwGetVideoModes", PPp);
        glfwGetVideoMode = downcall("glfwGetVideoMode", FunctionDescriptor.of(ADDRESS.withTargetLayout(GLFWVidMode.LAYOUT), ADDRESS), Linker.Option.isTrivial());
        glfwSetGamma = downcallTrivial("glfwSetGamma", PFV);
        glfwGetGammaRamp = downcall("glfwGetGammaRamp", FunctionDescriptor.of(ADDRESS.withTargetLayout(GLFWGammaRamp.LAYOUT), ADDRESS), Linker.Option.isTrivial());
        glfwSetGammaRamp = downcallTrivial("glfwSetGammaRamp", PPV);
        glfwDefaultWindowHints = downcallTrivial("glfwDefaultWindowHints", V);
        glfwWindowHint = downcallTrivial("glfwWindowHint", IIV);
        glfwWindowHintString = downcallTrivial("glfwWindowHintString", IPV);
        glfwCreateWindow = downcall("glfwCreateWindow", IIPPPP);
        glfwDestroyWindow = downcall("glfwDestroyWindow", PV);
        glfwWindowShouldClose = downcallTrivial("glfwWindowShouldClose", fd_PI);
        glfwSetWindowShouldClose = downcallTrivial("glfwSetWindowShouldClose", PIV);
        glfwSetWindowTitle = downcallTrivial("glfwSetWindowTitle", PPV);
        glfwSetWindowIcon = downcallTrivial("glfwSetWindowIcon", PIPV);
        glfwGetWindowPos = downcallTrivial("glfwGetWindowPos", PPPV);
        glfwSetWindowPos = downcallTrivial("glfwSetWindowPos", PIIV);
        glfwGetWindowSize = downcallTrivial("glfwGetWindowSize", PPPV);
        glfwSetWindowSizeLimits = downcallTrivial("glfwSetWindowSizeLimits", PIIIIV);
        glfwSetWindowAspectRatio = downcallTrivial("glfwSetWindowAspectRatio", PIIV);
        glfwSetWindowSize = downcallTrivial("glfwSetWindowSize", PIIV);
        glfwGetFramebufferSize = downcallTrivial("glfwGetFramebufferSize", PPPV);
        glfwGetWindowFrameSize = downcallTrivial("glfwGetWindowFrameSize", PPPPPV);
        glfwGetWindowContentScale = downcallTrivial("glfwGetWindowContentScale", PPPV);
        glfwGetWindowOpacity = downcallTrivial("glfwGetWindowOpacity", PF);
        glfwSetWindowOpacity = downcallTrivial("glfwSetWindowOpacity", PFV);
        glfwIconifyWindow = downcallTrivial("glfwIconifyWindow", PV);
        glfwRestoreWindow = downcallTrivial("glfwRestoreWindow", PV);
        glfwMaximizeWindow = downcallTrivial("glfwMaximizeWindow", PV);
        glfwShowWindow = downcallTrivial("glfwShowWindow", PV);
        glfwHideWindow = downcallTrivial("glfwHideWindow", PV);
        glfwFocusWindow = downcallTrivial("glfwFocusWindow", PV);
        glfwRequestWindowAttention = downcallTrivial("glfwRequestWindowAttention", PV);
        glfwGetWindowMonitor = downcallTrivial("glfwGetWindowMonitor", PP);
        glfwSetWindowMonitor = downcallTrivial("glfwSetWindowMonitor", PPIIIIIV);
        glfwGetWindowAttrib = downcallTrivial("glfwGetWindowAttrib", PII);
        glfwSetWindowAttrib = downcallTrivial("glfwSetWindowAttrib", PIIV);
        glfwSetWindowUserPointer = downcallTrivial("glfwSetWindowUserPointer", PPV);
        glfwGetWindowUserPointer = downcallTrivial("glfwGetWindowUserPointer", PP);
        glfwSetWindowPosCallback = downcall("glfwSetWindowPosCallback", PPP);
        glfwSetWindowSizeCallback = downcall("glfwSetWindowSizeCallback", PPP);
        glfwSetWindowCloseCallback = downcall("glfwSetWindowCloseCallback", PPP);
        glfwSetWindowRefreshCallback = downcall("glfwSetWindowRefreshCallback", PPP);
        glfwSetWindowFocusCallback = downcall("glfwSetWindowFocusCallback", PPP);
        glfwSetWindowIconifyCallback = downcall("glfwSetWindowIconifyCallback", PPP);
        glfwSetWindowMaximizeCallback = downcall("glfwSetWindowMaximizeCallback", PPP);
        glfwSetFramebufferSizeCallback = downcall("glfwSetFramebufferSizeCallback", PPP);
        glfwSetWindowContentScaleCallback = downcall("glfwSetWindowContentScaleCallback", PPP);
        glfwPollEvents = downcall("glfwPollEvents", V);
        glfwWaitEvents = downcall("glfwWaitEvents", V);
        glfwWaitEventsTimeout = downcall("glfwWaitEventsTimeout", DV);
        glfwPostEmptyEvent = downcallTrivial("glfwPostEmptyEvent", V);
        glfwGetInputMode = downcallTrivial("glfwGetInputMode", PII);
        glfwSetInputMode = downcallTrivial("glfwSetInputMode", PIIV);
        glfwRawMouseMotionSupported = downcallTrivial("glfwRawMouseMotionSupported", I);
        glfwGetKeyName = downcallTrivial("glfwGetKeyName", IIp);
        glfwGetKeyScancode = downcallTrivial("glfwGetKeyScancode", II);
        glfwGetKey = downcallTrivial("glfwGetKey", PII);
        glfwGetMouseButton = downcallTrivial("glfwGetMouseButton", PII);
        glfwGetCursorPos = downcallTrivial("glfwGetCursorPos", PPPV);
        glfwSetCursorPos = downcallTrivial("glfwSetCursorPos", PDDV);
        glfwCreateCursor = downcallTrivial("glfwCreateCursor", PIIP);
        glfwCreateStandardCursor = downcallTrivial("glfwCreateStandardCursor", IP);
        glfwDestroyCursor = downcallTrivial("glfwDestroyCursor", PV);
        glfwSetCursor = downcallTrivial("glfwSetCursor", PPV);
        glfwSetKeyCallback = downcall("glfwSetKeyCallback", PPP);
        glfwSetCharCallback = downcall("glfwSetCharCallback", PPP);
        glfwSetMouseButtonCallback = downcall("glfwSetMouseButtonCallback", PPP);
        glfwSetCursorPosCallback = downcall("glfwSetCursorPosCallback", PPP);
        glfwSetCursorEnterCallback = downcall("glfwSetCursorEnterCallback", PPP);
        glfwSetScrollCallback = downcall("glfwSetScrollCallback", PPP);
        glfwSetDropCallback = downcall("glfwSetDropCallback", PPP);
        glfwJoystickPresent = downcallTrivial("glfwJoystickPresent", II);
        glfwGetJoystickAxes = downcallTrivial("glfwGetJoystickAxes", IPp);
        glfwGetJoystickButtons = downcallTrivial("glfwGetJoystickButtons", IPp);
        glfwGetJoystickHats = downcallTrivial("glfwGetJoystickHats", IPP);
        glfwGetJoystickName = downcallTrivial("glfwGetJoystickName", Ip);
        glfwGetJoystickGUID = downcallTrivial("glfwGetJoystickGUID", Ip);
        glfwSetJoystickUserPointer = downcallTrivial("glfwSetJoystickUserPointer", IPV);
        glfwGetJoystickUserPointer = downcallTrivial("glfwGetJoystickUserPointer", IP);
        glfwJoystickIsGamepad = downcallTrivial("glfwJoystickIsGamepad", II);
        glfwSetJoystickCallback = downcall("glfwSetJoystickCallback", PP);
        glfwUpdateGamepadMappings = downcall("glfwUpdateGamepadMappings", fd_PI);
        glfwGetGamepadName = downcallTrivial("glfwGetGamepadName", Ip);
        glfwGetGamepadState = downcallTrivial("glfwGetGamepadState", IPI);
        glfwSetClipboardString = downcallTrivial("glfwSetClipboardString", PPV);
        glfwGetClipboardString = downcallTrivial("glfwGetClipboardString", Pp);
        glfwGetTime = downcallTrivial("glfwGetTime", D);
        glfwSetTime = downcallTrivial("glfwSetTime", DV);
        glfwGetTimerValue = downcallTrivial("glfwGetTimerValue", J);
        glfwGetTimerFrequency = downcallTrivial("glfwGetTimerFrequency", J);
        glfwMakeContextCurrent = downcall("glfwMakeContextCurrent", PV);
        glfwGetCurrentContext = downcallTrivial("glfwGetCurrentContext", P);
        glfwSwapBuffers = downcall("glfwSwapBuffers", PV);
        glfwSwapInterval = downcallTrivial("glfwSwapInterval", IV);
        glfwExtensionSupported = downcallTrivial("glfwExtensionSupported", fd_PI);
        glfwGetProcAddress = downcall("glfwGetProcAddress", PP);
        glfwVulkanSupported = downcallTrivial("glfwVulkanSupported", I);
        glfwGetRequiredInstanceExtensions = downcallTrivial("glfwGetRequiredInstanceExtensions", Pp);

        // GLFW Vulkan
        glfwGetInstanceProcAddress = downcall("glfwGetInstanceProcAddress", PPP);
        glfwGetPhysicalDevicePresentationSupport = downcall("glfwGetPhysicalDevicePresentationSupport", PPII);
        glfwCreateWindowSurface = downcall("glfwCreateWindowSurface", PPPPI);

        // GLFW Native
        createNative();
    }
}
