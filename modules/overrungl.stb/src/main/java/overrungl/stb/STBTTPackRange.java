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
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    float {@link #font_size};
 *    int {@link #first_unicode_codepoint_in_range}; // if non-zero, then the chars are continuous, and this is the first codepoint
 *    int *{@link #array_of_unicode_codepoints};     // if non-zero, then this is an array of unicode codepoints
 *    int {@link #num_chars};
 *    stbtt_packedchar *{@link #chardata_for_range}; // output
 *    unsigned char {@link #h_oversample}, {@link #v_oversample}; // don't set these, they're used internally
 * } stbtt_pack_range;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBTTPackRange extends Struct<STBTTPackRange> {
    /**
     * The allocator
     */
    StructAllocator<STBTTPackRange> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cFloat("font_size")
            .cInt("first_unicode_codepoint_in_range")
            .cAddress("array_of_unicode_codepoints")
            .cInt("num_chars")
            .cAddress("chardata_for_range")
            .cByte("h_oversample")
            .cByte("v_oversample")
            .build()
    );

    /**
     * {@return font_size}
     */
    float font_size();

    /**
     * Sets {@link #font_size()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackRange font_size(float val);

    /**
     * if non-zero, then the chars are continuous, and this is the first codepoint
     *
     * @return first_unicode_codepoint_in_range
     */
    int first_unicode_codepoint_in_range();

    /**
     * Sets {@link #first_unicode_codepoint_in_range()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackRange first_unicode_codepoint_in_range(int val);

    /**
     * if non-zero, then this is an array of unicode codepoints
     *
     * @return array_of_unicode_codepoints
     */
    MemorySegment array_of_unicode_codepoints();

    /**
     * Sets {@link #array_of_unicode_codepoints()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackRange array_of_unicode_codepoints(MemorySegment val);

    /**
     * {@return {@link #array_of_unicode_codepoints()}}
     *
     * @param size the size
     */
    default int[] javaArrayOfUnicodeCodepoints(int size) {
        return Unmarshal.unmarshalAsIntArray(array_of_unicode_codepoints().reinterpret(ValueLayout.JAVA_INT.scale(0L, size)));
    }

    /**
     * Sets {@link #array_of_unicode_codepoints()}.
     *
     * @param allocator the allocator
     * @param val       the value
     * @return this
     */
    default STBTTPackRange javaArrayOfUnicodeCodepoints(SegmentAllocator allocator, int[] val) {
        return array_of_unicode_codepoints(Marshal.marshal(allocator, val));
    }

    /**
     * {@return num_chars}
     */
    int num_chars();

    /**
     * Sets {@link #num_chars()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackRange num_chars(int val);

    /**
     * output
     *
     * @return chardata_for_range
     */
    MemorySegment chardata_for_range();

    /**
     * Sets {@link #chardata_for_range()}.
     *
     * @param val the value
     * @return this
     */
    STBTTPackRange chardata_for_range(MemorySegment val);

    /**
     * {@return {@link #chardata_for_range()}}
     */
    default STBTTPackedChar javaChardataForRange() {
        return STBTTPackedChar.OF.of(chardata_for_range().reinterpret(STBTTPackedChar.OF.layout().scale(0L, num_chars())));
    }

    /**
     * Sets {@link #chardata_for_range()}.
     *
     * @param val the value
     * @return this
     */
    default STBTTPackRange javaChardataForRange(STBTTPackedChar val) {
        return chardata_for_range(Marshal.marshal(val));
    }

    /**
     * don't set these, they're used internally
     *
     * @return h_oversample
     */
    byte h_oversample();

    /**
     * don't set these, they're used internally
     *
     * @return v_oversample
     */
    byte v_oversample();
}
