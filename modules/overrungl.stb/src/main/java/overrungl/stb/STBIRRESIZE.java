/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

import overrun.marshal.struct.Struct;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

/**
 * {@code STBIR_RESIZE}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBIRRESIZE extends Struct {
    /**
     * Layout
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ADDRESS.withName("user_data"),
        ADDRESS.withName("input_pixels"),
        JAVA_INT.withName("input_w"),
        JAVA_INT.withName("input_h"),
        JAVA_DOUBLE.withName("input_s0"),
        JAVA_DOUBLE.withName("input_t0"),
        JAVA_DOUBLE.withName("input_s1"),
        JAVA_DOUBLE.withName("input_t1"),
        ADDRESS.withName("input_cb"),
        ADDRESS.withName("output_pixels"),
        JAVA_INT.withName("output_w"),
        JAVA_INT.withName("output_h"),
        JAVA_INT.withName("output_subx"),
        JAVA_INT.withName("output_suby"),
        JAVA_INT.withName("output_subw"),
        JAVA_INT.withName("output_subh"),
        ADDRESS.withName("output_cb"),
        JAVA_INT.withName("input_stride_in_bytes"),
        JAVA_INT.withName("output_stride_in_bytes"),
        JAVA_INT.withName("splits"),
        JAVA_INT.withName("fast_alpha"),
        JAVA_INT.withName("needs_rebuild"),
        JAVA_INT.withName("called_alloc"),
        JAVA_INT.withName("input_pixel_layout_public"),
        JAVA_INT.withName("output_pixel_layout_public"),
        JAVA_INT.withName("input_data_type"),
        JAVA_INT.withName("output_data_type"),
        JAVA_INT.withName("horizontal_filter"),
        JAVA_INT.withName("vertical_filter"),
        JAVA_INT.withName("horizontal_edge"),
        JAVA_INT.withName("vertical_edge"),
        ADDRESS.withName("horizontal_filter_kernel"),
        ADDRESS.withName("horizontal_filter_support"),
        ADDRESS.withName("vertical_filter_kernel"),
        ADDRESS.withName("vertical_filter_support"),
        ADDRESS.withName("samplers")
    );

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public STBIRRESIZE(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public STBIRRESIZE(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public STBIRRESIZE(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public STBIRRESIZE(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}
