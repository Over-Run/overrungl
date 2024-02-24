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
 *    char *{@link #vendor vendor};
 *
 *    int {@link #commentListLength comment_list_length};
 *    char **{@link #commentList comment_list};
 * } stb_vorbis_comment;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBVorbisComment extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(0L, JAVA_BYTE)).withName("vendor"),
        JAVA_INT.withName("comment_list_length"),
        ADDRESS.withTargetLayout(ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Unmarshal.STR_SIZE, JAVA_BYTE))).withName("comment_list")
    );
    /**
     * vendor
     */
    public static final StructHandle.Array<byte[]> vendor = StructHandle.ofArray(LAYOUT, "vendor", Marshal::marshal, Unmarshal::unmarshalAsByteArray);
    /**
     * comment_list_length
     */
    public static final StructHandle.Int commentListLength = StructHandle.ofInt(LAYOUT, "comment_list_length");
    /**
     * comment_list
     */
    public static final StructHandle.Array<String[]> commentList = StructHandle.ofArray(LAYOUT, "comment_list", Marshal::marshal, Unmarshal::unmarshalAsStringArray);

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBVorbisComment(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBVorbisComment(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBVorbisComment(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBVorbisComment(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
