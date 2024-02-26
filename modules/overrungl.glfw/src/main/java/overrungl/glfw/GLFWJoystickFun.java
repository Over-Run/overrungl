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

package overrungl.glfw;

import overrun.marshal.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * This is the function pointer type for joystick configuration callbacks.
 * A joystick configuration callback function has the following signature:
 * {@snippet :
 * void functionName(int jid, int event); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFW#setJoystickCallback
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWJoystickFun extends Upcall {
    /**
     * The type.
     */
    Type<GLFWJoystickFun> TYPE = Upcall.type("invoke", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

    /**
     * The function pointer type for joystick configuration callbacks.
     *
     * @param jid   The joystick that was connected or disconnected.
     * @param event One of {@code CONNECTED} or {@code DISCONNECTED}. Future
     *              releases may add more events.
     */
    void invoke(int jid, int event);

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
