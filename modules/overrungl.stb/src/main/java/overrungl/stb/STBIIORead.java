/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

package overrungl.stb;

import overrun.marshal.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * The read callback interface
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface STBIIORead extends Upcall {
    /**
     * the type
     */
    Type<STBIIORead> TYPE = Upcall.type("ninvoke", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));

    /**
     * Fill {@code data} with {@code size} bytes.
     *
     * @param user userdata
     * @param data data buffer to be filled
     * @return number of bytes actually read
     */
    int invoke(MemorySegment user, MemorySegment data);

    /**
     * Fill {@code data} with {@code size} bytes.
     *
     * @param user userdata
     * @param data data buffer to be filled
     * @param size byte size to fill
     * @return number of bytes actually read
     */
    default int ninvoke(MemorySegment user, MemorySegment data, int size) {
        return invoke(user, data.reinterpret(size));
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }

    static int invoke(MemorySegment stub, MemorySegment user, MemorySegment data, int size) {
        try {
            return (int) TYPE.downcallTarget().invokeExact(stub, user, data, size);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static STBIIORead wrap(MemorySegment stub) {
        return (user, data) -> invoke(stub, user, data, Math.toIntExact(data.byteSize()));
    }
}
