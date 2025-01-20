/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.glfw;
import java.lang.foreign.*;
import overrungl.util.*;
import org.graalvm.nativeimage.hosted.Feature;
import static org.graalvm.nativeimage.hosted.RuntimeForeignAccess.*;
class ForeignRegistrationFeature implements Feature {
    @Override public void duringSetup(DuringSetupAccess access) {
        registerForDowncall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
        registerForDowncall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT), ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWVidMode.LAYOUT), ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGamepadState.LAYOUT)));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_LONG));
        registerForDowncall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid());
        registerForDowncall(FunctionDescriptor.ofVoid(Unmarshal.STR_LAYOUT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWGammaRamp.LAYOUT)));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWImage.LAYOUT)));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.glfw.GLFWAllocator.LAYOUT)));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        registerForDowncall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        registerForUpcall(overrungl.glfw.GLFWAllocateFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWReallocateFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWDeallocateFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWErrorFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWWindowPosFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWWindowSizeFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWWindowCloseFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWWindowRefreshFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWWindowFocusFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWWindowIconifyFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWWindowMaximizeFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWFramebufferSizeFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWWindowContentScaleFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWMouseButtonFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWCursorPosFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWCursorEnterFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWScrollFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWKeyFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWCharFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWDropFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWMonitorFun.DESCRIPTOR);
        registerForUpcall(overrungl.glfw.GLFWJoystickFun.DESCRIPTOR);
    }
}
