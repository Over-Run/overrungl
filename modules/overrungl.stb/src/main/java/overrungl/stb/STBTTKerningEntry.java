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
 * typedef struct stbtt_kerningentry
 * {
 *    int {@link #glyph1}; // use stbtt_FindGlyphIndex
 *    int {@link #glyph2};
 *    int {@link #advance};
 * } stbtt_kerningentry;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBTTKerningEntry extends Struct<STBTTKerningEntry> {
    /**
     * The allocator
     */
    StructAllocator<STBTTKerningEntry> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cInt("glyph1")
            .cInt("glyph2")
            .cInt("advance")
            .build()
    );

    /**
     * use stbtt_FindGlyphIndex
     *
     * @return glyph1
     */
    int glyph1();

    /**
     * Sets {@link #glyph1()}.
     *
     * @param val the value
     * @return this
     */
    STBTTKerningEntry glyph1(int val);

    /**
     * {@return glyph2}
     */
    int glyph2();

    /**
     * Sets {@link #glyph2()}.
     *
     * @param val the value
     * @return this
     */
    STBTTKerningEntry glyph2(int val);

    /**
     * {@return advance}
     */
    int advance();

    /**
     * Sets {@link #advance()}.
     *
     * @param val the value
     * @return this
     */
    STBTTKerningEntry advance(int val);
}
