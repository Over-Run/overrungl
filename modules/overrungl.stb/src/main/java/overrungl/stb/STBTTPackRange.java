/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

import overrungl.ArrayPointer;
import overrungl.Struct;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    float {@link #fontSize() font_size};
 *    int {@link #firstUnicodeCodepointInRange() first_unicode_codepoint_in_range};  // if non-zero, then the chars are continuous, and this is the first codepoint
 *    int *{@link #arrayOfUnicodeCodepoints() array_of_unicode_codepoints};       // if non-zero, then this is an array of unicode codepoints
 *    int {@link #numChars() num_chars};
 *    stbtt_packedchar *{@link #chardataForRange() chardata_for_range}; // output
 *    unsigned char h_oversample, v_oversample; // don't set these, they're used internally
 * } stbtt_pack_range;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class STBTTPackRange extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_FLOAT.withName("font_size"),
        JAVA_INT.withName("first_unicode_codepoint_in_range"),
        ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(JAVA_INT)).withName("array_of_unicode_codepoints"),
        JAVA_INT.withName("num_chars"),
        ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(STBTTPackedChar.LAYOUT)).withName("chardata_for_range"),
        JAVA_BYTE.withName("h_oversample"),
        JAVA_BYTE.withName("v_oversample")
    );
    private static final VarHandle
        font_size = LAYOUT.varHandle(PathElement.groupElement("font_size")),
        first_unicode_codepoint_in_range = LAYOUT.varHandle(PathElement.groupElement("first_unicode_codepoint_in_range")),
        array_of_unicode_codepoints = LAYOUT.varHandle(PathElement.groupElement("array_of_unicode_codepoints")),
        num_chars = LAYOUT.varHandle(PathElement.groupElement("num_chars")),
        chardata_for_range = LAYOUT.varHandle(PathElement.groupElement("chardata_for_range"));

    public STBTTPackRange(MemorySegment address, MemoryLayout layout) {
        super(address, layout);
    }

    public STBTTPackRange(MemorySegment address) {
        super(address, LAYOUT);
    }

    public static STBTTPackRange create(SegmentAllocator allocator) {
        return new STBTTPackRange(allocator.allocate(LAYOUT));
    }

    public static Buffer create(SegmentAllocator allocator, long count) {
        return new Buffer(allocator.allocateArray(LAYOUT, count), count);
    }

    public STBTTPackRange fontSize(float fontSize) {
        font_size.set(segment(), fontSize);
        return this;
    }

    public STBTTPackRange firstUnicodeCodepointInRange(int firstUnicodeCodepointInRange) {
        first_unicode_codepoint_in_range.set(segment(), firstUnicodeCodepointInRange);
        return this;
    }

    public STBTTPackRange narrayOfUnicodeCodepoints(MemorySegment arrayOfUnicodeCodepoints) {
        array_of_unicode_codepoints.set(segment(), arrayOfUnicodeCodepoints);
        return this;
    }

    public STBTTPackRange arrayOfUnicodeCodepoints(SegmentAllocator allocator, int[] arrayOfUnicodeCodepoints) {
        return narrayOfUnicodeCodepoints(allocator.allocateArray(JAVA_INT, arrayOfUnicodeCodepoints));
    }

    public STBTTPackRange numChars(int numChars) {
        num_chars.set(segment(), numChars);
        return this;
    }

    public STBTTPackRange nchardataForRange(MemorySegment chardataForRange) {
        chardata_for_range.set(segment(), chardataForRange);
        return this;
    }

    public STBTTPackRange chardataForRange(STBTTPackedChar.Buffer chardataForRange) {
        return nchardataForRange(chardataForRange.address())
            .numChars(Math.toIntExact(chardataForRange.elementCount()));
    }

    public float fontSize() {
        return (float) font_size.get(segment());
    }

    public int firstUnicodeCodepointInRange() {
        return (int) first_unicode_codepoint_in_range.get(segment());
    }

    public MemorySegment narrayOfUnicodeCodepoints() {
        return (MemorySegment) array_of_unicode_codepoints.get(segment());
    }

    public int[] arrayOfUnicodeCodepoints() {
        final MemorySegment seg = narrayOfUnicodeCodepoints();
        if (RuntimeHelper.isNullptr(seg)) return null;
        return RuntimeHelper.toArray(seg, new int[numChars()]);
    }

    public int numChars() {
        return (int) num_chars.get(segment());
    }

    public MemorySegment nchardataForRange() {
        return (MemorySegment) chardata_for_range.get(segment());
    }

    public STBTTPackedChar.Buffer chardataForRange() {
        return new STBTTPackedChar.Buffer(nchardataForRange(), numChars());
    }

    /**
     * @author squid233
     * @since 0.1.0
     */
    public static final class Buffer extends STBTTPackRange implements ArrayPointer {
        private final VarHandle
            font_size = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("font_size")),
            first_unicode_codepoint_in_range = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("first_unicode_codepoint_in_range")),
            array_of_unicode_codepoints = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("array_of_unicode_codepoints")),
            num_chars = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("num_chars")),
            chardata_for_range = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("chardata_for_range"));

        public Buffer(MemorySegment address, long elementCount) {
            super(address, MemoryLayout.sequenceLayout(elementCount, LAYOUT));
        }

        public Buffer fontSize(long index, float fontSize) {
            font_size.set(segment(), index, fontSize);
            return this;
        }

        public Buffer firstUnicodeCodepointInRange(long index, int firstUnicodeCodepointInRange) {
            first_unicode_codepoint_in_range.set(segment(), index, firstUnicodeCodepointInRange);
            return this;
        }

        public Buffer narrayOfUnicodeCodepoints(long index, MemorySegment arrayOfUnicodeCodepoints) {
            array_of_unicode_codepoints.set(segment(), index, arrayOfUnicodeCodepoints);
            return this;
        }

        public Buffer arrayOfUnicodeCodepoints(long index, SegmentAllocator allocator, int[] arrayOfUnicodeCodepoints) {
            return narrayOfUnicodeCodepoints(index, allocator.allocateArray(JAVA_INT, arrayOfUnicodeCodepoints));
        }

        public Buffer numChars(long index, int numChars) {
            num_chars.set(segment(), index, numChars);
            return this;
        }

        public Buffer nchardataForRange(long index, MemorySegment chardataForRange) {
            chardata_for_range.set(segment(), index, chardataForRange);
            return this;
        }

        public Buffer chardataForRange(long index, STBTTPackedChar.Buffer chardataForRange) {
            return nchardataForRange(index, chardataForRange.address())
                .numChars(index, Math.toIntExact(chardataForRange.elementCount()));
        }

        @Override
        public Buffer fontSize(float fontSize) {
            return fontSize(0, fontSize);
        }

        @Override
        public Buffer firstUnicodeCodepointInRange(int firstUnicodeCodepointInRange) {
            return firstUnicodeCodepointInRange(0, firstUnicodeCodepointInRange);
        }

        @Override
        public Buffer narrayOfUnicodeCodepoints(MemorySegment arrayOfUnicodeCodepoints) {
            return narrayOfUnicodeCodepoints(0, arrayOfUnicodeCodepoints);
        }

        @Override
        public Buffer arrayOfUnicodeCodepoints(SegmentAllocator allocator, int[] arrayOfUnicodeCodepoints) {
            return arrayOfUnicodeCodepoints(0, allocator, arrayOfUnicodeCodepoints);
        }

        @Override
        public Buffer numChars(int numChars) {
            return numChars(0, numChars);
        }

        @Override
        public Buffer nchardataForRange(MemorySegment chardataForRange) {
            return nchardataForRange(0, chardataForRange);
        }

        @Override
        public Buffer chardataForRange(STBTTPackedChar.Buffer chardataForRange) {
            return chardataForRange(0, chardataForRange);
        }

        public float fontSizeAt(long index) {
            return (float) font_size.get(segment(), index);
        }

        public int firstUnicodeCodepointInRangeAt(long index) {
            return (int) first_unicode_codepoint_in_range.get(segment(), index);
        }

        public MemorySegment narrayOfUnicodeCodepointsAt(long index) {
            return (MemorySegment) array_of_unicode_codepoints.get(segment(), index);
        }

        public int[] arrayOfUnicodeCodepointsAt(long index) {
            final MemorySegment seg = narrayOfUnicodeCodepointsAt(index);
            if (RuntimeHelper.isNullptr(seg)) return null;
            return RuntimeHelper.toArray(seg, new int[numChars()]);
        }

        public int numCharsAt(long index) {
            return (int) num_chars.get(segment(), index);
        }

        public MemorySegment nchardataForRangeAt(long index) {
            return (MemorySegment) chardata_for_range.get(segment(), index);
        }

        public STBTTPackedChar.Buffer chardataForRangeAt(long index) {
            return new STBTTPackedChar.Buffer(nchardataForRangeAt(index), numCharsAt(index));
        }

        @Override
        public float fontSize() {
            return fontSizeAt(0);
        }

        @Override
        public int firstUnicodeCodepointInRange() {
            return firstUnicodeCodepointInRangeAt(0);
        }

        @Override
        public MemorySegment narrayOfUnicodeCodepoints() {
            return narrayOfUnicodeCodepointsAt(0);
        }

        @Override
        public int[] arrayOfUnicodeCodepoints() {
            return arrayOfUnicodeCodepointsAt(0);
        }

        @Override
        public int numChars() {
            return numCharsAt(0);
        }

        @Override
        public MemorySegment nchardataForRange() {
            return nchardataForRangeAt(0);
        }

        @Override
        public STBTTPackedChar.Buffer chardataForRange() {
            return chardataForRangeAt(0);
        }
    }
}
