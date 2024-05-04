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

import overrun.marshal.LayoutBuilder;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.invoke.MethodHandles;

/**
 * 16 bytes, nominally
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBRPRect extends Struct<STBRPRect> {
    /**
     * The allocator
     */
    StructAllocator<STBRPRect> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cInt("id")
            .cInt("w")
            .cInt("h")
            .cInt("x")
            .cInt("y")
            .cInt("was_packed")
            .build()
    );

    /**
     * reserved for your use
     *
     * @return id
     */
    int id();

    /**
     * Sets {@link #id()}.
     *
     * @param val the value
     * @return this
     */
    STBRPRect id(int val);

    /**
     * input
     *
     * @return w
     */
    int w();

    /**
     * Sets {@link #w()}.
     *
     * @param val the value
     * @return this
     */
    STBRPRect w(int val);

    /**
     * input
     *
     * @return h
     */
    int h();

    /**
     * Sets {@link #h()}.
     *
     * @param val the value
     * @return this
     */
    STBRPRect h(int val);

    /**
     * output
     *
     * @return x
     */
    int x();

    /**
     * Sets {@link #x()}.
     *
     * @param val the value
     * @return this
     */
    STBRPRect x(int val);

    /**
     * output
     *
     * @return y
     */
    int y();

    /**
     * Sets {@link #y()}.
     *
     * @param val the value
     * @return this
     */
    STBRPRect y(int val);

    /**
     * output
     * <p>
     * non-zero if valid packing
     *
     * @return was_packed
     */
    int was_packed();

    /**
     * Sets {@link #was_packed()}.
     *
     * @param val the value
     * @return this
     */
    STBRPRect was_packed(int val);
}
