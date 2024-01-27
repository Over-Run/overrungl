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

import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;
import overrun.marshal.struct.StructHandleView;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;

import static java.lang.foreign.ValueLayout.*;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    float {@link #fontSize font_size};
 *    int {@link #firstUnicodeCodepointInRange first_unicode_codepoint_in_range};  // if non-zero, then the chars are continuous, and this is the first codepoint
 *    int *{@link #arrayOfUnicodeCodepoints array_of_unicode_codepoints};       // if non-zero, then this is an array of unicode codepoints
 *    int {@link #numChars num_chars};
 *    stbtt_packedchar *{@link #chardataForRange chardata_for_range}; // output
 *    unsigned char {@link #hOversample h_oversample}, {@link #vOversample v_oversample}; // don't set these, they're used internally
 * } stbtt_pack_range;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTTPackRange extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_FLOAT.withName("font_size"),
        JAVA_INT.withName("first_unicode_codepoint_in_range"),
        ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(0L, JAVA_INT)).withName("array_of_unicode_codepoints"),
        JAVA_INT.withName("num_chars"),
        MemoryLayout.paddingLayout(4L),
        ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(0L, STBTTPackedChar.LAYOUT)).withName("chardata_for_range"),
        JAVA_BYTE.withName("h_oversample"),
        JAVA_BYTE.withName("v_oversample"),
        MemoryLayout.paddingLayout(6L)
    );
    /**
     * font_size
     */
    public final StructHandle.Float fontSize = StructHandle.ofFloat(this, "font_size");
    /**
     * first_unicode_codepoint_in_range
     */
    public final StructHandle.Int firstUnicodeCodepointInRange = StructHandle.ofInt(this, "first_unicode_codepoint_in_range");
    /**
     * array_of_unicode_codepoints
     */
    public final StructHandle.Array<int[]> arrayOfUnicodeCodepoints = StructHandle.ofArray(this, "array_of_unicode_codepoints", Marshal::marshal, Unmarshal::unmarshalAsIntArray);
    /**
     * num_chars
     */
    public final StructHandle.Int numChars = StructHandle.ofInt(this, "num_chars");
    /**
     * chardata_for_range
     */
    public final StructHandle.Array<STBTTPackedChar[]> chardataForRange = StructHandle.ofArray(this, "chardata_for_range", Marshal::marshal,
        segment -> Unmarshal.unmarshal(ADDRESS, segment, STBTTPackedChar[]::new, s -> new STBTTPackedChar(s.get(ADDRESS.withTargetLayout(STBTTPackedChar.LAYOUT), 0L), 1L)));
    /**
     * h_oversample
     */
    public final StructHandleView.Byte hOversample = StructHandle.ofByte(this, "h_oversample");
    /**
     * v_oversample
     */
    public final StructHandleView.Byte vOversample = StructHandle.ofByte(this, "v_oversample");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBTTPackRange(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBTTPackRange(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBTTPackRange(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBTTPackRange(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
