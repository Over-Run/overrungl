/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import overrungl.glfw.GLFW;
import overrungl.glfw.GLFWCallbacks;
import overrungl.glfw.GLFWErrorCallback;
import overrungl.glfw.GLFWGamepadState;
import overrungl.util.Unmarshal;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * Tests GLFW joystick
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWJoystickTest {
    private final GLFW glfw = GLFW.INSTANCE;
    private MemorySegment window;

    public void run() {
        init();
        loop();

        GLFWCallbacks.free(window);
        glfw.destroyWindow(window);

        glfw.terminate();
        glfw.setErrorCallback(null);
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        if (!glfw.init()) throw new IllegalStateException("Unable to initialize GLFW");
        glfw.defaultWindowHints();
        glfw.windowHint(GLFW.VISIBLE, false);
        glfw.windowHint(GLFW.RESIZABLE, true);
        glfw.windowHint(GLFW.CLIENT_API, GLFW.NO_API);
        window = glfw.createWindow(200, 100, "Holder", MemorySegment.NULL, MemorySegment.NULL);
        if (Unmarshal.isNullPointer(window)) throw new IllegalStateException("Failed to create the GLFW window");
        glfw.setKeyCallback(window, (_, key, _, action, _) -> {
            if (key == GLFW.KEY_ESCAPE && action == GLFW.RELEASE) {
                glfw.setWindowShouldClose(window, true);
            }
        });
        glfw.setJoystickCallback((jid, event) -> {
            switch (event) {
                case GLFW.CONNECTED -> {
                    boolean isGamepad = glfw.joystickIsGamepad(jid);
                    var prefix = isGamepad ? "Gamepad " : "Joystick ";
                    System.out.println(prefix + jid + ": \"" + (isGamepad ? glfw.getGamepadName(jid) : glfw.getJoystickName(jid)) + "\" has connected");
                }
                case GLFW.DISCONNECTED -> System.out.println("Joystick " + jid + " has disconnected");
            }
        });

        glfw.showWindow(window);
    }

    private void loop() {
        try (Arena arena = Arena.ofConfined()) {
            var states = new GLFWGamepadState[GLFW.JOYSTICK_LAST + 1];
            for (int i = 0; i < states.length; i++) {
                states[i] = GLFWGamepadState.OF.of(arena);
            }
            while (!glfw.windowShouldClose(window)) {
                for (int i = 0; i <= GLFW.JOYSTICK_LAST; i++) {
                    if (glfw.joystickPresent(i)) {
                        if (glfw.joystickIsGamepad(i)) {
                            var state = states[i];
                            if (glfw.getGamepadState(i, state)) {
                                System.out.printf("""
                                    Get gamepad state for [jid=%d,name=%s] successful:
                                    Buttons: [A(Cross)=%s, B(Circle)=%s, X(Square)=%s, Y(Triangle)=%s,
                                    Left bumper=%s, Right bumper=%s, Back=%s, Start=%s,
                                    Guide=%s, Left thumb=%s, Right thumb=%s,
                                    DPAD(up=%s, right=%s, down=%s, left=%s)],
                                    Axis: [Left(x=%s, y=%s), Right(x=%s, y=%s), Trigger(left=%s, right%s)]
                                    %n""",
                                    i,
                                    glfw.getGamepadName(i),
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
                glfw.waitEventsTimeout(3);
            }
        }
    }

    public static void main(String[] args) {
        new GLFWJoystickTest().run();
    }
}
