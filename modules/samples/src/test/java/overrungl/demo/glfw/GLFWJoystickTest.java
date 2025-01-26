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

package overrungl.demo.glfw;

import overrungl.glfw.*;
import overrungl.util.MemoryUtil;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static overrungl.glfw.GLFW.*;

/**
 * Tests GLFW joystick
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWJoystickTest {
    private Arena windowArena;
    private MemorySegment window;

    public void run() {
        init();
        loop();

        glfwDestroyWindow(window);
        windowArena.close();

        glfwTerminate();
        glfwSetErrorCallback(MemorySegment.NULL);
    }

    private void init() {
        glfwSetErrorCallback(GLFWErrorCallback.createPrint().stub(Arena.global()));
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize GLFW");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);
        windowArena = Arena.ofConfined();
        window = glfwCreateWindow(200, 100, MemoryUtil.allocString("Holder"), MemorySegment.NULL, MemorySegment.NULL);
        if (MemoryUtil.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");
        glfwSetKeyCallback(window, GLFWKeyFun.alloc(windowArena, (_, key, _, action, _) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        }));
        glfwSetJoystickCallback(GLFWJoystickFun.alloc(Arena.global(), (jid, event) -> {
            switch (event) {
                case GLFW_CONNECTED -> {
                    boolean isGamepad = glfwJoystickIsGamepad(jid);
                    var prefix = isGamepad ? "Gamepad " : "Joystick ";
                    System.out.println(prefix + jid + ": \"" + (isGamepad ? glfwGetGamepadName(jid) : glfwGetJoystickName(jid)) + "\" has connected");
                }
                case GLFW_DISCONNECTED -> System.out.println("Joystick " + jid + " has disconnected");
            }
        }));

        glfwShowWindow(window);
    }

    private void loop() {
        try (Arena arena = Arena.ofConfined()) {
            var states = new GLFWGamepadState[GLFW_JOYSTICK_LAST + 1];
            for (int i = 0; i < states.length; i++) {
                states[i] = GLFWGamepadState.alloc(arena);
            }
            while (!glfwWindowShouldClose(window)) {
                for (int i = 0; i <= GLFW_JOYSTICK_LAST; i++) {
                    if (glfwJoystickPresent(i)) {
                        if (glfwJoystickIsGamepad(i)) {
                            var state = states[i];
                            if (glfwGetGamepadState(i, state.segment())) {
                                System.out.printf("""
                                        Get gamepad state for [jid=%d,name=%s] successful:
                                        Buttons: [A(Cross)=%d, B(Circle)=%d, X(Square)=%d, Y(Triangle)=%d,
                                        Left bumper=%d, Right bumper=%d, Back=%d, Start=%d,
                                        Guide=%d, Left thumb=%d, Right thumb=%d,
                                        DPAD(up=%d, right=%d, down=%d, left=%d)],
                                        Axis: [Left(x=%f, y=%f), Right(x=%f, y=%f), Trigger(left=%f, right%f)]
                                        %n""",
                                    i,
                                    glfwGetGamepadName(i),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_A),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_B),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_X),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_Y),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_LEFT_BUMPER),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_BACK),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_START),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_GUIDE),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_LEFT_THUMB),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_RIGHT_THUMB),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_DPAD_UP),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_DPAD_RIGHT),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_DPAD_DOWN),
                                    gpsButton(state, GLFW_GAMEPAD_BUTTON_DPAD_LEFT),
                                    gpsAxe(state, GLFW_GAMEPAD_AXIS_LEFT_X),
                                    gpsAxe(state, GLFW_GAMEPAD_AXIS_LEFT_Y),
                                    gpsAxe(state, GLFW_GAMEPAD_AXIS_RIGHT_X),
                                    gpsAxe(state, GLFW_GAMEPAD_AXIS_RIGHT_Y),
                                    gpsAxe(state, GLFW_GAMEPAD_AXIS_LEFT_TRIGGER),
                                    gpsAxe(state, GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER));
                            }
                        }
                    }
                }
                glfwWaitEventsTimeout(3);
            }
        }
    }

    private static byte gpsButton(GLFWGamepadState state, int button) {
        return state.buttons().getAtIndex(ValueLayout.JAVA_BYTE, button);
    }

    private static float gpsAxe(GLFWGamepadState state, int axis) {
        return state.axes().getAtIndex(ValueLayout.JAVA_FLOAT, axis);
    }

    public static void main(String[] args) {
        new GLFWJoystickTest().run();
    }
}
