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

package overrungl.glfw;

import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;

import java.lang.invoke.VarHandle;

/**
 * Sized array struct handle
 *
 * @author squid233
 * @since 0.1.0
 */
public final class StructHandleSizedFloatArray extends StructHandle {
    private StructHandleSizedFloatArray(VarHandle varHandle) {
        super(varHandle);
    }

    /**
     * Creates it
     *
     * @param struct struct
     * @param name   name
     * @return handle
     */
    static StructHandleSizedFloatArray of(Struct struct, String name) {
        return new StructHandleSizedFloatArray(StructHandle.ofSizedArray(struct, name));
    }

    /**
     * Sets the value at the given index.
     *
     * @param index the index
     * @param arrayIndex the array index
     * @param value the value
     */
    public void set(long index, long arrayIndex, float value) {
        varHandle.set(0L, index, arrayIndex, value);
    }

    /**
     * Sets the value.
     *
     * @param arrayIndex the array index
     * @param value the value
     */
    public void set(long arrayIndex, float value) {
        set(0L, arrayIndex, value);
    }

    /**
     * Gets the value at the given index.
     *
     * @param index the index
     * @param arrayIndex the array index
     * @return the value
     */
    public float get(long index, long arrayIndex) {
        return (short) varHandle.get(0L, index, arrayIndex);
    }

    /**
     * Gets the value.
     *
     * @param arrayIndex the array index
     * @return the value
     */
    public float get(long arrayIndex) {
        return get(0L, arrayIndex);
    }
}
