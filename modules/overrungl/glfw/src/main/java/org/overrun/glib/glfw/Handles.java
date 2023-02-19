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

package org.overrun.glib.glfw;

import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.FunctionDescriptors.*;

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
        glfwDefaultWindowHints, glfwWindowHint, glfwWindowHintString, glfwCreateWindow, glfwDestroyWindow,
        glfwWindowShouldClose, glfwSetWindowShouldClose, glfwSetWindowTitle, glfwSetWindowIcon, glfwGetWindowPos,
        glfwSetWindowPos, glfwGetWindowSize, glfwSetWindowSizeLimits, glfwSetWindowAspectRatio, glfwSetWindowSize,
        glfwGetFramebufferSize, glfwGetWindowFrameSize, glfwGetWindowContentScale, glfwGetWindowOpacity,
        glfwSetWindowOpacity, glfwIconifyWindow, glfwRestoreWindow, glfwMaximizeWindow, glfwShowWindow, glfwHideWindow,
        glfwFocusWindow, glfwRequestWindowAttention, glfwGetWindowMonitor, glfwSetWindowMonitor, glfwGetWindowAttrib,
        glfwSetWindowAttrib, glfwSetWindowUserPointer, glfwGetWindowUserPointer, glfwSetWindowPosCallback,
        glfwSetWindowSizeCallback, glfwSetWindowCloseCallback, glfwSetWindowRefreshCallback, glfwSetWindowFocusCallback,
        glfwSetWindowIconifyCallback, glfwSetWindowMaximizeCallback, glfwSetFramebufferSizeCallback,
        glfwSetWindowContentScaleCallback, glfwPollEvents, glfwWaitEvents, glfwWaitEventsTimeout, glfwPostEmptyEvent,
        glfwGetInputMode, glfwSetInputMode, glfwRawMouseMotionSupported, glfwGetKeyName, glfwGetKeyScancode, glfwGetKey,
        glfwGetMouseButton, glfwGetCursorPos, glfwSetCursorPos, glfwCreateCursor, glfwCreateStandardCursor,
        glfwDestroyCursor, glfwSetCursor, glfwSetKeyCallback, glfwSetCharCallback;
    @Deprecated(forRemoval = true)
    static MethodHandle glfwSetCharModsCallback;
    static MethodHandle
        glfwSetMouseButtonCallback, glfwSetCursorPosCallback, glfwSetCursorEnterCallback, glfwSetScrollCallback,
        glfwSetDropCallback, glfwJoystickPresent, glfwGetJoystickAxes, glfwGetJoystickButtons, glfwGetJoystickHats,
        glfwGetJoystickName, glfwGetJoystickGUID, glfwSetJoystickUserPointer, glfwGetJoystickUserPointer,
        glfwJoystickIsGamepad, glfwSetJoystickCallback, glfwUpdateGamepadMappings, glfwGetGamepadName,
        glfwGetGamepadState, glfwSetClipboardString, glfwGetClipboardString, glfwGetTime, glfwSetTime,
        glfwGetTimerValue, glfwGetTimerFrequency, glfwMakeContextCurrent, glfwGetCurrentContext, glfwSwapBuffers,
        glfwSwapInterval, glfwExtensionSupported, glfwGetProcAddress, glfwVulkanSupported,
        glfwGetRequiredInstanceExtensions;

    // GLFW Vulkan
    static MethodHandle
        glfwGetInstanceProcAddress, glfwGetPhysicalDevicePresentationSupport, glfwCreateWindowSurface;

    // GLFW Native
    static MethodHandle
        glfwGetWin32Adapter, glfwGetWin32Monitor;

    private static MethodHandle downcall(String name,
                                         FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function);
    }

    private static MethodHandle downcallNative(String name,
                                               FunctionDescriptors function) {
        return RuntimeHelper.downcallSafe(lookup.find(name).orElse(MemorySegment.NULL), function);
    }

    private static void createNative() {
        glfwGetWin32Adapter = downcallNative("glfwGetWin32Adapter", Pp);
        glfwGetWin32Monitor = downcallNative("glfwGetWin32Monitor", Pp);
    }

    static void create() {
        if (initialized) return;
        initialized = true;

        lookup = RuntimeHelper.load("glfw", "glfw3",
            GLFW.VERSION_MAJOR + "." + GLFW.VERSION_MINOR + "." + GLFW.VERSION_REVISION);
        glfwInit = downcall("glfwInit", I);
        glfwTerminate = downcall("glfwTerminate", V);
        glfwInitHint = downcall("glfwInitHint", IIV);
        glfwGetVersion = downcall("glfwGetVersion", PPPV);
        glfwGetVersionString = downcall("glfwGetVersionString", p);
        glfwGetError = downcall("glfwGetError", fd_PI);
        glfwSetErrorCallback = downcall("glfwSetErrorCallback", PP);
        glfwGetMonitors = downcall("glfwGetMonitors", Pp);
        glfwGetPrimaryMonitor = downcall("glfwGetPrimaryMonitor", P);
        glfwGetMonitorPos = downcall("glfwGetMonitorPos", PPPV);
        glfwGetMonitorWorkarea = downcall("glfwGetMonitorWorkarea", PPPPPV);
        glfwGetMonitorPhysicalSize = downcall("glfwGetMonitorPhysicalSize", PPPV);
        glfwGetMonitorContentScale = downcall("glfwGetMonitorContentScale", PPPV);
        glfwGetMonitorName = downcall("glfwGetMonitorName", Pp);
        glfwSetMonitorUserPointer = downcall("glfwSetMonitorUserPointer", PPV);
        glfwGetMonitorUserPointer = downcall("glfwGetMonitorUserPointer", PP);
        glfwSetMonitorCallback = downcall("glfwSetMonitorCallback", PP);
        glfwGetVideoModes = downcall("glfwGetVideoModes", PPp);
        glfwGetVideoMode = downcall("glfwGetVideoMode", PP);
        glfwSetGamma = downcall("glfwSetGamma", PFV);
        glfwGetGammaRamp = downcall("glfwGetGammaRamp", PP);
        glfwSetGammaRamp = downcall("glfwSetGammaRamp", PPV);
        glfwDefaultWindowHints = downcall("glfwDefaultWindowHints", V);
        glfwWindowHint = downcall("glfwWindowHint", IIV);
        glfwWindowHintString = downcall("glfwWindowHintString", IPV);
        glfwCreateWindow = downcall("glfwCreateWindow", IIPPPP);
        glfwDestroyWindow = downcall("glfwDestroyWindow", PV);
        glfwWindowShouldClose = downcall("glfwWindowShouldClose", fd_PI);
        glfwSetWindowShouldClose = downcall("glfwSetWindowShouldClose", PIV);
        glfwSetWindowTitle = downcall("glfwSetWindowTitle", PPV);
        glfwSetWindowIcon = downcall("glfwSetWindowIcon", PIPV);
        glfwGetWindowPos = downcall("glfwGetWindowPos", PPPV);
        glfwSetWindowPos = downcall("glfwSetWindowPos", PIIV);
        glfwGetWindowSize = downcall("glfwGetWindowSize", PPPV);
        glfwSetWindowSizeLimits = downcall("glfwSetWindowSizeLimits", PIIIIV);
        glfwSetWindowAspectRatio = downcall("glfwSetWindowAspectRatio", PIIV);
        glfwSetWindowSize = downcall("glfwSetWindowSize", PIIV);
        glfwGetFramebufferSize = downcall("glfwGetFramebufferSize", PPPV);
        glfwGetWindowFrameSize = downcall("glfwGetWindowFrameSize", PPPPPV);
        glfwGetWindowContentScale = downcall("glfwGetWindowContentScale", PPPV);
        glfwGetWindowOpacity = downcall("glfwGetWindowOpacity", PF);
        glfwSetWindowOpacity = downcall("glfwSetWindowOpacity", PFV);
        glfwIconifyWindow = downcall("glfwIconifyWindow", PV);
        glfwRestoreWindow = downcall("glfwRestoreWindow", PV);
        glfwMaximizeWindow = downcall("glfwMaximizeWindow", PV);
        glfwShowWindow = downcall("glfwShowWindow", PV);
        glfwHideWindow = downcall("glfwHideWindow", PV);
        glfwFocusWindow = downcall("glfwFocusWindow", PV);
        glfwRequestWindowAttention = downcall("glfwRequestWindowAttention", PV);
        glfwGetWindowMonitor = downcall("glfwGetWindowMonitor", PP);
        glfwSetWindowMonitor = downcall("glfwSetWindowMonitor", PPIIIIIV);
        glfwGetWindowAttrib = downcall("glfwGetWindowAttrib", PII);
        glfwSetWindowAttrib = downcall("glfwSetWindowAttrib", PIIV);
        glfwSetWindowUserPointer = downcall("glfwSetWindowUserPointer", PPV);
        glfwGetWindowUserPointer = downcall("glfwGetWindowUserPointer", PP);
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
        glfwPostEmptyEvent = downcall("glfwPostEmptyEvent", V);
        glfwGetInputMode = downcall("glfwGetInputMode", PII);
        glfwSetInputMode = downcall("glfwSetInputMode", PIIV);
        glfwRawMouseMotionSupported = downcall("glfwRawMouseMotionSupported", I);
        glfwGetKeyName = downcall("glfwGetKeyName", IIp);
        glfwGetKeyScancode = downcall("glfwGetKeyScancode", II);
        glfwGetKey = downcall("glfwGetKey", PII);
        glfwGetMouseButton = downcall("glfwGetMouseButton", PII);
        glfwGetCursorPos = downcall("glfwGetCursorPos", PPPV);
        glfwSetCursorPos = downcall("glfwSetCursorPos", PDDV);
        glfwCreateCursor = downcall("glfwCreateCursor", PIIP);
        glfwCreateStandardCursor = downcall("glfwCreateStandardCursor", IP);
        glfwDestroyCursor = downcall("glfwDestroyCursor", PV);
        glfwSetCursor = downcall("glfwSetCursor", PPV);
        glfwSetKeyCallback = downcall("glfwSetKeyCallback", PPP);
        glfwSetCharCallback = downcall("glfwSetCharCallback", PPP);
        glfwSetCharModsCallback = downcall("glfwSetCharModsCallback", PPP);
        glfwSetMouseButtonCallback = downcall("glfwSetMouseButtonCallback", PPP);
        glfwSetCursorPosCallback = downcall("glfwSetCursorPosCallback", PPP);
        glfwSetCursorEnterCallback = downcall("glfwSetCursorEnterCallback", PPP);
        glfwSetScrollCallback = downcall("glfwSetScrollCallback", PPP);
        glfwSetDropCallback = downcall("glfwSetDropCallback", PPP);
        glfwJoystickPresent = downcall("glfwJoystickPresent", II);
        glfwGetJoystickAxes = downcall("glfwGetJoystickAxes", IPp);
        glfwGetJoystickButtons = downcall("glfwGetJoystickButtons", IPp);
        glfwGetJoystickHats = downcall("glfwGetJoystickHats", IPP);
        glfwGetJoystickName = downcall("glfwGetJoystickName", Ip);
        glfwGetJoystickGUID = downcall("glfwGetJoystickGUID", Ip);
        glfwSetJoystickUserPointer = downcall("glfwSetJoystickUserPointer", IPV);
        glfwGetJoystickUserPointer = downcall("glfwGetJoystickUserPointer", IP);
        glfwJoystickIsGamepad = downcall("glfwJoystickIsGamepad", II);
        glfwSetJoystickCallback = downcall("glfwSetJoystickCallback", PP);
        glfwUpdateGamepadMappings = downcall("glfwUpdateGamepadMappings", fd_PI);
        glfwGetGamepadName = downcall("glfwGetGamepadName", Ip);
        glfwGetGamepadState = downcall("glfwGetGamepadState", IPI);
        glfwSetClipboardString = downcall("glfwSetClipboardString", PPV);
        glfwGetClipboardString = downcall("glfwGetClipboardString", Pp);
        glfwGetTime = downcall("glfwGetTime", D);
        glfwSetTime = downcall("glfwSetTime", DV);
        glfwGetTimerValue = downcall("glfwGetTimerValue", J);
        glfwGetTimerFrequency = downcall("glfwGetTimerFrequency", J);
        glfwMakeContextCurrent = downcall("glfwMakeContextCurrent", PV);
        glfwGetCurrentContext = downcall("glfwGetCurrentContext", P);
        glfwSwapBuffers = downcall("glfwSwapBuffers", PV);
        glfwSwapInterval = downcall("glfwSwapInterval", IV);
        glfwExtensionSupported = downcall("glfwExtensionSupported", fd_PI);
        glfwGetProcAddress = downcall("glfwGetProcAddress", PP);
        glfwVulkanSupported = downcall("glfwVulkanSupported", I);
        glfwGetRequiredInstanceExtensions = downcall("glfwGetRequiredInstanceExtensions", Pp);

        // GLFW Vulkan
        glfwGetInstanceProcAddress = downcall("glfwGetInstanceProcAddress", PPP);
        glfwGetPhysicalDevicePresentationSupport = downcall("glfwGetPhysicalDevicePresentationSupport", PPII);
        glfwCreateWindowSurface = downcall("glfwCreateWindowSurface", PPPPI);

        // GLFW Native
        createNative();
    }
}
