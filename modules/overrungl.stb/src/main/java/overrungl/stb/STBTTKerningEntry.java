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
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct stbtt_kerningentry
 * {
 *    int {@link #glyph1() glyph1}; // use stbtt_FindGlyphIndex
 *    int {@link #glyph2() glyph2};
 *    int {@link #advance() advance};
 * } stbtt_kerningentry;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class STBTTKerningEntry extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("glyph1"),
        ValueLayout.JAVA_INT.withName("glyph2"),
        ValueLayout.JAVA_INT.withName("advance")
    );
    private static final VarHandle
        glyph1 = LAYOUT.varHandle(PathElement.groupElement("glyph1")),
        glyph2 = LAYOUT.varHandle(PathElement.groupElement("glyph2")),
        advance = LAYOUT.varHandle(PathElement.groupElement("advance"));

    public STBTTKerningEntry(MemorySegment address, MemoryLayout layout) {
        super(address, layout);
    }

    public STBTTKerningEntry(MemorySegment address) {
        super(address, LAYOUT);
    }

    public int glyph1() {
        return (int) glyph1.get(segment());
    }

    public int glyph2() {
        return (int) glyph2.get(segment());
    }

    public int advance() {
        return (int) advance.get(segment());
    }

    /**
     * @author squid233
     * @since 0.1.0
     */
    public static final class Buffer extends STBTTKerningEntry implements ArrayPointer {
        private final VarHandle pEntry = layout().varHandle(PathElement.sequenceElement());

        public Buffer(MemorySegment address, long elementCount) {
            super(address, MemoryLayout.sequenceLayout(elementCount, LAYOUT));
        }

        public STBTTKerningEntry get(long index) {
            return new STBTTKerningEntry((MemorySegment) pEntry.get(segment(), index));
        }
    }
}
