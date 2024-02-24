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

package overrungl.opengl;

import overrun.marshal.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * The OpenGL debug message callback.
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLDebugProc extends Upcall {
    /**
     * The type.
     */
    Type<GLDebugProc> TYPE = Upcall.type("ninvoke", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));

    /**
     * debug callback
     *
     * @param source    The source of debug message
     * @param type      The type of debug message
     * @param id        the id of the message
     * @param severity  The severity of debug message
     * @param message   The debug message
     * @param userParam will be set to the value passed in the {@code userParam}
     *                  parameter to the most recent call to {@code glDebugMessageCallback}.
     */
    void invoke(int source, int type, int id, int severity, String message, MemorySegment userParam);

    default void ninvoke(int source, int type, int id, int severity, int length, MemorySegment message, MemorySegment userParam) {
        invoke(source, type, id, severity, message.reinterpret(length + 1).getString(0), userParam);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
