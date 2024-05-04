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
 *    unsigned short {@link #x0},{@link #y0},{@link #x1},{@link #y1}; // coordinates of bbox in bitmap
 *    float {@link #xoff},{@link #yoff},{@link #xadvance};
 *    float {@link #xoff2},{@link #yoff2};
 * } stbtt_packedchar;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBTTPackedChar extends Struct<STBTTPackedChar> {
    /**
     * The allocator
     */
    StructAllocator<STBTTPackedChar> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cShort("x0")
            .cShort("y0")
            .cShort("x1")
            .cShort("y1")
            .cFloat("xoff")
            .cFloat("yoff")
            .cFloat("xadvance")
            .cFloat("xoff2")
            .cFloat("yoff2")
            .build()
    );

    /**
     * coordinates of bbox in bitmap
     *
     * @return x0
     */
    short x0();

    /**
     * Sets {@link #x0()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar x0(short val);

    /**
     * coordinates of bbox in bitmap
     *
     * @return y0
     */
    short y0();

    /**
     * Sets {@link #y0()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar y0(short val);

    /**
     * coordinates of bbox in bitmap
     *
     * @return x1
     */
    short x1();

    /**
     * Sets {@link #x1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar x1(short val);

    /**
     * coordinates of bbox in bitmap
     *
     * @return y1
     */
    short y1();

    /**
     * Sets {@link #y1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar y1(short val);

    /**
     * {@return xoff}
     */
    float xoff();

    /**
     * Sets {@link #xoff()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar xoff(float val);

    /**
     * {@return yoff}
     */
    float yoff();

    /**
     * Sets {@link #yoff()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar yoff(float val);

    /**
     * {@return xadvance}
     */
    float xadvance();

    /**
     * Sets {@link #xadvance()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar xadvance(float val);

    /**
     * {@return xoff2}
     */
    float xoff2();

    /**
     * Sets {@link #xoff2()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar xoff2(float val);

    /**
     * {@return yoff2}
     */
    float yoff2();

    /**
     * Sets {@link #yoff2()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackedChar yoff2(float val);
}
