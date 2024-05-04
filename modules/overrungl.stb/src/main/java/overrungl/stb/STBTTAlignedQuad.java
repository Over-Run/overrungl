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
 *    float {@link #x0},{@link #y0},{@link #s0},{@link #t0}; // top-left
 *    float {@link #x1},{@link #y1},{@link #s1},{@link #t1}; // bottom-right
 * } stbtt_aligned_quad;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBTTAlignedQuad extends Struct<STBTTAlignedQuad> {
    /**
     * The allocator
     */
    StructAllocator<STBTTAlignedQuad> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cFloat("x0")
            .cFloat("y0")
            .cFloat("s0")
            .cFloat("t0")
            .cFloat("x1")
            .cFloat("y1")
            .cFloat("s1")
            .cFloat("t1")
            .build()
    );

    /**
     * {@return x0}
     * <p>
     * top-left
     */
    float x0();

    /**
     * Sets {@link #x0()}.
     *
     * @param val the value
     * @return this
     */
    STBTTAlignedQuad x0(float val);

    /**
     * {@return y0}
     * <p>
     * top-left
     */
    float y0();

    /**
     * Sets {@link #y0()}.
     *
     * @param val the value
     * @return this
     */
    STBTTAlignedQuad y0(float val);

    /**
     * {@return s0}
     * <p>
     * top-left
     */
    float s0();

    /**
     * Sets {@link #s0()}.
     *
     * @param val the value
     * @return this
     */
    STBTTAlignedQuad s0(float val);

    /**
     * {@return t0}
     * <p>
     * top-left
     */
    float t0();

    /**
     * Sets {@link #t0()}.
     *
     * @param val the value
     * @return this
     */
    STBTTAlignedQuad t0(float val);

    /**
     * {@return x1}
     * <p>
     * bottom-right
     */
    float x1();

    /**
     * Sets {@link #x1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTAlignedQuad x1(float val);

    /**
     * {@return y1}
     * <p>
     * bottom-right
     */
    float y1();

    /**
     * Sets {@link #y1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTAlignedQuad y1(float val);

    /**
     * {@return s1}
     * <p>
     * bottom-right
     */
    float s1();

    /**
     * Sets {@link #s1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTAlignedQuad s1(float val);

    /**
     * {@return t1}
     * <p>
     * bottom-right
     */
    float t1();

    /**
     * Sets {@link #t1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTAlignedQuad t1(float val);
}
