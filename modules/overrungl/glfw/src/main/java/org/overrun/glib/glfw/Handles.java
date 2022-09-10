/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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

package org.overrun.glib.glfw;

import org.overrun.glib.GameLib;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

/**
 * The GLFW method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    public static SymbolLookup lookup;
    public static Linker linker;
    public static MethodHandle
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
    public static MethodHandle glfwSetCharModsCallback;
    public static MethodHandle
        glfwSetMouseButtonCallback, glfwSetCursorPosCallback, glfwSetCursorEnterCallback, glfwSetScrollCallback,
        glfwSetDropCallback, glfwJoystickPresent, glfwGetJoystickAxes, glfwGetJoystickButtons, glfwGetJoystickHats,
        glfwGetJoystickName, glfwGetJoystickGUID, glfwSetJoystickUserPointer, glfwGetJoystickUserPointer,
        glfwJoystickIsGamepad, glfwSetJoystickCallback, glfwUpdateGamepadMappings, glfwGetGamepadName,
        glfwGetGamepadState, glfwSetClipboardString, glfwGetClipboardString, glfwGetTime, glfwSetTime,
        glfwGetTimerValue, glfwGetTimerFrequency, glfwMakeContextCurrent, glfwGetCurrentContext, glfwSwapBuffers,
        glfwSwapInterval, glfwExtensionSupported, glfwGetProcAddress, glfwVulkanSupported,
        glfwGetRequiredInstanceExtensions;

    private static MethodHandle downcall(String name,
                                         MemoryLayout retLayout,
                                         MemoryLayout... argLayouts) {
        return linker.downcallHandle(lookup.lookup(name).orElseThrow(),
            FunctionDescriptor.of(retLayout, argLayouts));
    }

    private static MethodHandle downcallV(String name,
                                          MemoryLayout... argLayouts) {
        return linker.downcallHandle(lookup.lookup(name).orElseThrow(),
            FunctionDescriptor.ofVoid(argLayouts));
    }

    private static MethodHandle downcallII(String name) {
        return downcall(name, JAVA_INT, JAVA_INT);
    }

    private static MethodHandle downcallIP(String name) {
        return downcall(name, ADDRESS, JAVA_INT);
    }

    private static MethodHandle downcallPP(String name) {
        return downcall(name, ADDRESS, ADDRESS);
    }

    private static MethodHandle downcallPV(String name) {
        return downcallV(name, ADDRESS);
    }

    private static MethodHandle downcallIPP(String name) {
        return downcall(name, ADDRESS, JAVA_INT, ADDRESS);
    }

    private static MethodHandle downcallPII(String name) {
        return downcall(name, JAVA_INT, ADDRESS, JAVA_INT);
    }

    private static MethodHandle downcallPPP(String name) {
        return downcall(name, ADDRESS, ADDRESS, ADDRESS);
    }

    private static MethodHandle downcallPPV(String name) {
        return downcallV(name, ADDRESS, ADDRESS);
    }

    private static MethodHandle downcallPIIV(String name) {
        return downcallV(name, ADDRESS, JAVA_INT, JAVA_INT);
    }

    private static MethodHandle downcallPPPV(String name) {
        return downcallV(name, ADDRESS, ADDRESS, ADDRESS);
    }

    public static void create() {
        lookup = GameLib.load("glfw", "glfw3");
        linker = Linker.nativeLinker();
        glfwInit = downcall("glfwInit", JAVA_INT);
        glfwTerminate = downcallV("glfwTerminate");
        glfwInitHint = downcallV("glfwInitHint", JAVA_INT, JAVA_INT);
        glfwGetVersion = downcallPPPV("glfwGetVersion");
        glfwGetVersionString = downcall("glfwGetVersionString", ADDRESS);
        glfwGetError = downcall("glfwGetError", JAVA_INT, ADDRESS);
        glfwSetErrorCallback = downcallPP("glfwSetErrorCallback");
        glfwGetMonitors = downcallPP("glfwGetMonitors");
        glfwGetPrimaryMonitor = downcall("glfwGetPrimaryMonitor", ADDRESS);
        glfwGetMonitorPos = downcallPPPV("glfwGetMonitorPos");
        glfwGetMonitorWorkarea = downcallV("glfwGetMonitorWorkarea", ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
        glfwGetMonitorPhysicalSize = downcallPPPV("glfwGetMonitorPhysicalSize");
        glfwGetMonitorContentScale = downcallPPPV("glfwGetMonitorContentScale");
        glfwGetMonitorName = downcallPP("glfwGetMonitorName");
        glfwSetMonitorUserPointer = downcallPPV("glfwSetMonitorUserPointer");
        glfwGetMonitorUserPointer = downcallPP("glfwGetMonitorUserPointer");
        glfwSetMonitorCallback = downcallPP("glfwSetMonitorCallback");
        glfwGetVideoModes = downcallPPP("glfwGetVideoModes");
        glfwGetVideoMode = downcallPP("glfwGetVideoMode");
        glfwSetGamma = downcallV("glfwSetGamma", ADDRESS, JAVA_FLOAT);
        glfwGetGammaRamp = downcallPP("glfwGetGammaRamp");
        glfwSetGammaRamp = downcallPPV("glfwSetGammaRamp");
        glfwDefaultWindowHints = downcallV("glfwDefaultWindowHints");
        glfwWindowHint = downcallV("glfwWindowHint", JAVA_INT, JAVA_INT);
        glfwWindowHintString = downcallV("glfwWindowHintString", JAVA_INT, ADDRESS);
        glfwCreateWindow = downcall("glfwCreateWindow", ADDRESS, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
        glfwDestroyWindow = downcallPV("glfwDestroyWindow");
        glfwWindowShouldClose = downcall("glfwWindowShouldClose", JAVA_INT, ADDRESS);
        glfwSetWindowShouldClose = downcallV("glfwSetWindowShouldClose", ADDRESS, JAVA_INT);
        glfwSetWindowTitle = downcallPPV("glfwSetWindowTitle");
        glfwSetWindowIcon = downcallV("glfwSetWindowIcon", ADDRESS, JAVA_INT, ADDRESS);
        glfwGetWindowPos = downcallPPPV("glfwGetWindowPos");
        glfwSetWindowPos = downcallPIIV("glfwSetWindowPos");
        glfwGetWindowSize = downcallPPPV("glfwGetWindowSize");
        glfwSetWindowSizeLimits = downcallV("glfwSetWindowSizeLimits", ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
        glfwSetWindowAspectRatio = downcallPIIV("glfwSetWindowAspectRatio");
        glfwSetWindowSize = downcallPIIV("glfwSetWindowSize");
        glfwGetFramebufferSize = downcallPPPV("glfwGetFramebufferSize");
        glfwGetWindowFrameSize = downcallV("glfwGetWindowFrameSize", ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
        glfwGetWindowContentScale = downcallPPPV("glfwGetWindowContentScale");
        glfwGetWindowOpacity = downcall("glfwGetWindowOpacity", JAVA_FLOAT, ADDRESS);
        glfwSetWindowOpacity = downcallV("glfwSetWindowOpacity", ADDRESS, JAVA_FLOAT);
        glfwIconifyWindow = downcallPV("glfwIconifyWindow");
        glfwRestoreWindow = downcallPV("glfwRestoreWindow");
        glfwMaximizeWindow = downcallPV("glfwMaximizeWindow");
        glfwShowWindow = downcallPV("glfwShowWindow");
        glfwHideWindow = downcallPV("glfwHideWindow");
        glfwFocusWindow = downcallPV("glfwFocusWindow");
        glfwRequestWindowAttention = downcallPV("glfwRequestWindowAttention");
        glfwGetWindowMonitor = downcallPP("glfwGetWindowMonitor");
        glfwSetWindowMonitor = downcallV("glfwSetWindowMonitor", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
        glfwGetWindowAttrib = downcallPII("glfwGetWindowAttrib");
        glfwSetWindowAttrib = downcallPIIV("glfwSetWindowAttrib");
        glfwSetWindowUserPointer = downcallPPV("glfwSetWindowUserPointer");
        glfwGetWindowUserPointer = downcallPP("glfwGetWindowUserPointer");
        glfwSetWindowPosCallback = downcallPPP("glfwSetWindowPosCallback");
        glfwSetWindowSizeCallback = downcallPPP("glfwSetWindowSizeCallback");
        glfwSetWindowCloseCallback = downcallPPP("glfwSetWindowCloseCallback");
        glfwSetWindowRefreshCallback = downcallPPP("glfwSetWindowRefreshCallback");
        glfwSetWindowFocusCallback = downcallPPP("glfwSetWindowFocusCallback");
        glfwSetWindowIconifyCallback = downcallPPP("glfwSetWindowIconifyCallback");
        glfwSetWindowMaximizeCallback = downcallPPP("glfwSetWindowMaximizeCallback");
        glfwSetFramebufferSizeCallback = downcallPPP("glfwSetFramebufferSizeCallback");
        glfwSetWindowContentScaleCallback = downcallPPP("glfwSetWindowContentScaleCallback");
        glfwPollEvents = downcallV("glfwPollEvents");
        glfwWaitEvents = downcallV("glfwWaitEvents");
        glfwWaitEventsTimeout = downcallV("glfwWaitEventsTimeout", JAVA_DOUBLE);
        glfwPostEmptyEvent = downcallV("glfwPostEmptyEvent");
        glfwGetInputMode = downcallPII("glfwGetInputMode");
        glfwSetInputMode = downcallPIIV("glfwSetInputMode");
        glfwRawMouseMotionSupported = downcall("glfwRawMouseMotionSupported", JAVA_INT);
        glfwGetKeyName = downcall("glfwGetKeyName", ADDRESS, JAVA_INT, JAVA_INT);
        glfwGetKeyScancode = downcallII("glfwGetKeyScancode");
        glfwGetKey = downcallPII("glfwGetKey");
        glfwGetMouseButton = downcallPII("glfwGetMouseButton");
        glfwGetCursorPos = downcallPPPV("glfwGetCursorPos");
        glfwSetCursorPos = downcallV("glfwSetCursorPos", ADDRESS, JAVA_DOUBLE, JAVA_DOUBLE);
        glfwCreateCursor = downcall("glfwCreateCursor", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
        glfwCreateStandardCursor = downcallIP("glfwCreateStandardCursor");
        glfwDestroyCursor = downcallPV("glfwDestroyCursor");
        glfwSetCursor = downcallPPV("glfwSetCursor");
        glfwSetKeyCallback = downcallPPP("glfwSetKeyCallback");
        glfwSetCharCallback = downcallPPP("glfwSetCharCallback");
        glfwSetCharModsCallback = downcallPPP("glfwSetCharModsCallback");
        glfwSetMouseButtonCallback = downcallPPP("glfwSetMouseButtonCallback");
        glfwSetCursorPosCallback = downcallPPP("glfwSetCursorPosCallback");
        glfwSetCursorEnterCallback = downcallPPP("glfwSetCursorEnterCallback");
        glfwSetScrollCallback = downcallPPP("glfwSetScrollCallback");
        glfwSetDropCallback = downcallPPP("glfwSetDropCallback");
        glfwJoystickPresent = downcallII("glfwJoystickPresent");
        glfwGetJoystickAxes = downcallIPP("glfwGetJoystickAxes");
        glfwGetJoystickButtons = downcallIPP("glfwGetJoystickButtons");
        glfwGetJoystickHats = downcallIPP("glfwGetJoystickHats");
        glfwGetJoystickName = downcallIP("glfwGetJoystickName");
        glfwGetJoystickGUID = downcallIP("glfwGetJoystickGUID");
        glfwSetJoystickUserPointer = downcallV("glfwSetJoystickUserPointer", JAVA_INT, ADDRESS);
        glfwGetJoystickUserPointer = downcallIP("glfwGetJoystickUserPointer");
        glfwJoystickIsGamepad = downcallII("glfwJoystickIsGamepad");
        glfwSetJoystickCallback = downcallPP("glfwSetJoystickCallback");
        glfwUpdateGamepadMappings = downcall("glfwUpdateGamepadMappings", JAVA_INT, ADDRESS);
        glfwGetGamepadName = downcallIP("glfwGetGamepadName");
        glfwGetGamepadState = downcall("glfwGetGamepadState", JAVA_INT, ADDRESS, JAVA_INT);
        glfwSetClipboardString = downcallPPV("glfwSetClipboardString");
        glfwGetClipboardString = downcallPP("glfwGetClipboardString");
        glfwGetTime = downcall("glfwGetTime", JAVA_DOUBLE);
        glfwSetTime = downcallV("glfwSetTime", JAVA_DOUBLE);
        glfwGetTimerValue = downcall("glfwGetTimerValue", JAVA_LONG);
        glfwGetTimerFrequency = downcall("glfwGetTimerFrequency", JAVA_LONG);
        glfwMakeContextCurrent = downcallPV("glfwMakeContextCurrent");
        glfwGetCurrentContext = downcall("glfwGetCurrentContext", ADDRESS);
        glfwSwapBuffers = downcallPV("glfwSwapBuffers");
        glfwSwapInterval = downcallV("glfwSwapInterval", JAVA_INT);
        glfwExtensionSupported = downcall("glfwExtensionSupported", JAVA_INT, ADDRESS);
        glfwGetProcAddress = downcallPP("glfwGetProcAddress");
        glfwVulkanSupported = downcall("glfwVulkanSupported", JAVA_INT);
        glfwGetRequiredInstanceExtensions = downcallPP("glfwGetRequiredInstanceExtensions");
    }
}
