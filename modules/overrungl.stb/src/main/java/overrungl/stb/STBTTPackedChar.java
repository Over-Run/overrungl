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
 *    unsigned short {@link #x0() x0},{@link #y0() y0},{@link #x1() x1},{@link #y1() y1}; // coordinates of bbox in bitmap
 *    float {@link #xoff() xoff},{@link #yoff() yoff},{@link #xadvance() xadvance};
 *    float {@link #xoff2() xoff2},{@link #yoff2() yoff2};
 * } stbtt_packedchar;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class STBTTPackedChar extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_SHORT.withName("x0"),
        JAVA_SHORT.withName("y0"),
        JAVA_SHORT.withName("x1"),
        JAVA_SHORT.withName("y1"),
        JAVA_FLOAT.withName("xoff"),
        JAVA_FLOAT.withName("yoff"),
        JAVA_FLOAT.withName("xadvance"),
        JAVA_FLOAT.withName("xoff2"),
        JAVA_FLOAT.withName("yoff2")
    );
    private static final VarHandle
        x0 = LAYOUT.varHandle(PathElement.groupElement("x0")),
        y0 = LAYOUT.varHandle(PathElement.groupElement("y0")),
        x1 = LAYOUT.varHandle(PathElement.groupElement("x1")),
        y1 = LAYOUT.varHandle(PathElement.groupElement("y1")),
        xoff = LAYOUT.varHandle(PathElement.groupElement("xoff")),
        yoff = LAYOUT.varHandle(PathElement.groupElement("yoff")),
        xadvance = LAYOUT.varHandle(PathElement.groupElement("xadvance")),
        xoff2 = LAYOUT.varHandle(PathElement.groupElement("xoff2")),
        yoff2 = LAYOUT.varHandle(PathElement.groupElement("yoff2"));

    protected STBTTPackedChar(MemorySegment address, MemoryLayout layout) {
        super(address, layout);
    }

    public STBTTPackedChar(MemorySegment address) {
        super(address, LAYOUT);
    }

    /**
     * {@return the elements size of this struct in bytes}
     */
    public static long sizeof() {
        return LAYOUT.byteSize();
    }

    public static Buffer create(SegmentAllocator allocator, long count) {
        return new Buffer(allocator.allocateArray(LAYOUT, count), count);
    }

    public short x0() {
        return (short) x0.get(segment());
    }

    public short y0() {
        return (short) y0.get(segment());
    }

    public short x1() {
        return (short) x1.get(segment());
    }

    public short y1() {
        return (short) y1.get(segment());
    }

    public float xoff() {
        return (float) xoff.get(segment());
    }

    public float yoff() {
        return (float) yoff.get(segment());
    }

    public float xadvance() {
        return (float) xadvance.get(segment());
    }

    public float xoff2() {
        return (float) xoff2.get(segment());
    }

    public float yoff2() {
        return (float) yoff2.get(segment());
    }

    /**
     * @author squid233
     * @since 0.1.0
     */
    public static final class Buffer extends STBTTPackedChar implements ArrayPointer {
        private final VarHandle pChar;

        public Buffer(MemorySegment address, long elementCount) {
            super(address, MemoryLayout.sequenceLayout(elementCount, LAYOUT));
            pChar = layout().varHandle(PathElement.sequenceElement());
        }

        public STBTTPackedChar get(long index) {
            return new STBTTPackedChar((MemorySegment) pChar.get(segment(), index));
        }
    }
}
