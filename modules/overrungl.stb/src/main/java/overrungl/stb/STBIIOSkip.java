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
 * The skip callback interface
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface STBIIOSkip extends Upcall {
    /**
     * the type
     */
    Type<STBIIOSkip> TYPE = Upcall.type("invoke", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));

    /**
     * Skip the next {@code n} bytes, or “unget” the last {@code -n} bytes if negative
     *
     * @param user userdata
     * @param n    byte size to skip
     */
    void invoke(MemorySegment user, int n);


    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }

    static void invoke(MemorySegment stub, MemorySegment user, int n) {
        try {
            TYPE.downcallTarget().invokeExact(stub, user, n);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static STBIIOSkip wrap(MemorySegment stub) {
        return (user, n) -> invoke(stub, user, n);
    }
}
