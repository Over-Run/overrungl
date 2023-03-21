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

package org.overrun.glib.demo.glfw;

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.glfw.Callbacks;
import org.overrun.glib.glfw.GLFW;
import org.overrun.glib.glfw.GLFWErrorCallback;
import org.overrun.glib.glfw.GLFWGamepadState;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * Tests GLFW joystick
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWJoystickTest {
    private MemorySegment window;

    public void run() {
        init();
        loop();

        Callbacks.free(window);
        GLFW.destroyWindow(window);

        GLFW.terminate();
        GLFW.setErrorCallback(null);
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        if (!GLFW.init()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
        GLFW.defaultWindowHints();
        GLFW.windowHint(GLFW.VISIBLE, false);
        GLFW.windowHint(GLFW.RESIZABLE, true);
        GLFW.windowHint(GLFW.CLIENT_API, GLFW.NO_API);
        try (var arena = Arena.openConfined()) {
            window = GLFW.createWindow(arena, 200, 100, "Holder", MemorySegment.NULL, MemorySegment.NULL);
        }
        if (window.address() == RuntimeHelper.NULL)
            throw new RuntimeException("Failed to create the GLFW window");
        GLFW.setKeyCallback(window, (handle, key, scancode, action, mods) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                GLFW.setWindowShouldClose(window, true);
            }
        });
        GLFW.setJoystickCallback((jid, event) -> {
            switch (event) {
                case GLFW.CONNECTED -> {
                    boolean isGamepad = GLFW.joystickIsGamepad(jid);
                    var prefix = isGamepad ? "Gamepad " : "Joystick ";
                    System.out.println(prefix + jid + ": \"" + (isGamepad ? GLFW.getGamepadName(jid) : GLFW.getJoystickName(jid)) + "\" has connected");
                }
                case GLFW.DISCONNECTED -> System.out.println("Joystick " + jid + " has disconnected");
            }
        });

        GLFW.showWindow(window);
    }

    private void loop() {
        var states = new GLFWGamepadState[GLFW.JOYSTICK_LAST + 1];
        for (int i = 0; i < states.length; i++) {
            states[i] = GLFWGamepadState.create(RuntimeHelper.globalArena());
        }
        while (!GLFW.windowShouldClose(window)) {
//            try (var arena = Arena.openShared()) {
            for (int i = 0; i <= GLFW.JOYSTICK_LAST; i++) {
                if (GLFW.joystickPresent(i)) {
                    if (GLFW.joystickIsGamepad(i)) {
                        var state = states[i];
                        if (GLFW.getGamepadState(i, state)) {
                            System.out.printf(
                                "Get gamepad state for [jid=%d,name=%s] successful:" +
                                    " Buttons: [A(Cross)=%b, B(Circle)=%b, X(Square)=%b, Y(Triangle)=%b," +
                                    " Left bumper=%b, Right bumper=%b, Back=%b, Start=%b, Guide=%b, Left thumb=%b, Right thumb=%b," +
                                    " DPAD(up=%b, right=%b, down=%b, left=%b)]%n," +
                                    " Axis: [Left(x=%f, y=%f), Right(x=%f, y=%f), Trigger(left=%f, right%f)] %n",
                                i,
                                GLFW.getGamepadName(i),
                                state.button(GLFW.GAMEPAD_BUTTON_A),
                                state.button(GLFW.GAMEPAD_BUTTON_B),
                                state.button(GLFW.GAMEPAD_BUTTON_X),
                                state.button(GLFW.GAMEPAD_BUTTON_Y),
                                state.button(GLFW.GAMEPAD_BUTTON_LEFT_BUMPER),
                                state.button(GLFW.GAMEPAD_BUTTON_RIGHT_BUMPER),
                                state.button(GLFW.GAMEPAD_BUTTON_BACK),
                                state.button(GLFW.GAMEPAD_BUTTON_START),
                                state.button(GLFW.GAMEPAD_BUTTON_GUIDE),
                                state.button(GLFW.GAMEPAD_BUTTON_LEFT_THUMB),
                                state.button(GLFW.GAMEPAD_BUTTON_RIGHT_THUMB),
                                state.button(GLFW.GAMEPAD_BUTTON_DPAD_UP),
                                state.button(GLFW.GAMEPAD_BUTTON_DPAD_RIGHT),
                                state.button(GLFW.GAMEPAD_BUTTON_DPAD_DOWN),
                                state.button(GLFW.GAMEPAD_BUTTON_DPAD_LEFT),
                                state.axe(GLFW.GAMEPAD_AXIS_LEFT_X),
                                state.axe(GLFW.GAMEPAD_AXIS_LEFT_Y),
                                state.axe(GLFW.GAMEPAD_AXIS_RIGHT_X),
                                state.axe(GLFW.GAMEPAD_AXIS_RIGHT_Y),
                                state.axe(GLFW.GAMEPAD_AXIS_LEFT_TRIGGER),
                                state.axe(GLFW.GAMEPAD_AXIS_RIGHT_TRIGGER));
                        }
                    }
                }
            }
//        }
            GLFW.waitEventsTimeout(3);
        }
    }

    public static void main(String[] args) {
        new GLFWJoystickTest().run();
    }
}
