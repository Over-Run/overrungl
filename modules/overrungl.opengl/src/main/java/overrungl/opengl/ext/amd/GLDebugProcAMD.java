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

package overrungl.opengl.ext.amd;

import overrun.marshal.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * The OpenGL debug message callback.
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLDebugProcAMD extends Upcall {
    /**
     * The type.
     */
    Type<GLDebugProcAMD> TYPE = Upcall.type();

    /**
     * debug callback
     *
     * @param id        the id of the message
     * @param category  The category of debug message
     * @param severity  The severity of debug message
     * @param message   The debug message
     * @param userParam will be set to the value passed in the {@code userParam}
     *                  parameter to the most recent call to {@code glDebugMessageCallback}.
     */
    void invoke(int id, int category, int severity, String message, MemorySegment userParam);

    @Stub
    default void ninvoke(int id, int category, int severity, int length, MemorySegment message, MemorySegment userParam) {
        invoke(id, category, severity, message.reinterpret(length + 1).getString(0), userParam);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
