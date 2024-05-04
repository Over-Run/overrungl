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

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    char *{@link #vendor};
 *
 *    int {@link #comment_list_length};
 *    char **{@link #comment_list};
 * } stb_vorbis_comment;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBVorbisComment extends Struct<STBVorbisComment> {
    /**
     * The allocator
     */
    StructAllocator<STBVorbisComment> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cAddress("vendor", MemoryLayout.sequenceLayout(Unmarshal.STR_SIZE, ValueLayout.JAVA_BYTE))
            .cInt("comment_list_length")
            .cAddress("comment_list", ValueLayout.ADDRESS)
            .build()
    );

    /**
     * {@return vendor}
     */
    MemorySegment vendor();

    /**
     * Sets {@link #vendor()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisComment vendor(MemorySegment val);

    /**
     * {@return {@link #vendor()}}
     */
    default String javaVendor() {
        return Unmarshal.unmarshalAsString(vendor());
    }

    /**
     * Sets {@link #vendor()}.
     *
     * @param allocator the allocator
     * @param val       the value
     * @return this
     */
    default STBVorbisComment javaVendor(SegmentAllocator allocator, String val) {
        return vendor(Marshal.marshal(allocator, val));
    }

    /**
     * {@return comment_list_length}
     */
    int comment_list_length();

    /**
     * Sets {@link #comment_list_length()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisComment comment_list_length(int val);

    /**
     * {@return comment_list}
     */
    MemorySegment comment_list();

    /**
     * Sets {@link #comment_list()}.
     *
     * @param val the value
     * @return this
     */
    STBVorbisComment comment_list(MemorySegment val);

    /**
     * {@return {@link #comment_list()}}
     */
    default String[] javaCommentList() {
        return Unmarshal.unmarshalAsStringArray(comment_list().reinterpret(ValueLayout.ADDRESS.scale(0L, comment_list_length())));
    }

    /**
     * Sets {@link #comment_list()}.
     *
     * @param allocator the allocator
     * @param val       the value
     * @return this
     */
    default STBVorbisComment javaCommentList(SegmentAllocator allocator, String[] val) {
        return comment_list(Marshal.marshal(allocator, val));
    }
}
