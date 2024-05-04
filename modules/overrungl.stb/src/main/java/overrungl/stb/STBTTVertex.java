/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    stbtt_vertex_type {@link #x},{@link #y},{@link #cx},{@link #cy},{@link #cx1},{@link #cy1};
 *    unsigned char {@link #type},{@link #padding};
 * } stbtt_vertex;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBTTVertex extends Struct<STBTTVertex> {
    /**
     * The allocator
     */
    StructAllocator<STBTTVertex> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cShort("x")
            .cShort("y")
            .cShort("cx")
            .cShort("cy")
            .cShort("cx1")
            .cShort("cy1")
            .cByte("type")
            .cByte("padding")
            .build()
    );

    /**
     * {@return x}
     */
    short x();

    /**
     * Sets {@link #x()}.
     *
     * @param val the value
     * @return this
     */
    STBTTVertex x(short val);

    /**
     * {@return y}
     */
    short y();

    /**
     * Sets {@link #y()}.
     *
     * @param val the value
     * @return this
     */
    STBTTVertex y(short val);

    /**
     * {@return cx}
     */
    short cx();

    /**
     * Sets {@link #cx()}.
     *
     * @param val the value
     * @return this
     */
    STBTTVertex cx(short val);

    /**
     * {@return cy}
     */
    short cy();

    /**
     * Sets {@link #cy()}.
     *
     * @param val the value
     * @return this
     */
    STBTTVertex cy(short val);

    /**
     * {@return cx1}
     */
    short cx1();

    /**
     * Sets {@link #cx1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTVertex cx1(short val);

    /**
     * {@return cy1}
     */
    short cy1();

    /**
     * Sets {@link #cy1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTVertex cy1(short val);

    /**
     * {@return type}
     */
    byte type();

    /**
     * Sets {@link #type()}.
     *
     * @param val the value
     * @return this
     */
    STBTTVertex type(byte val);

    /**
     * {@return padding}
     */
    byte padding();

    /**
     * Sets {@link #padding()}.
     *
     * @param val the value
     * @return this
     */
    STBTTVertex padding(byte val);
}
