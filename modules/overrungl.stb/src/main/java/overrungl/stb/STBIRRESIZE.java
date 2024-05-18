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

import overrun.marshal.LayoutBuilder;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.invoke.MethodHandles;

/**
 * {@code STBIR_RESIZE}
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBIRRESIZE extends Struct<STBIRRESIZE> {
    /**
     * The allocator
     */
    StructAllocator<STBIRRESIZE> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cAddress("user_data")
            .cAddress("input_pixels")
            .cInt("input_w")
            .cInt("input_h")
            .cDouble("input_s0")
            .cDouble("input_t0")
            .cDouble("input_s1")
            .cDouble("input_t1")
            .cAddress("input_cb")
            .cAddress("output_pixels")
            .cInt("output_w")
            .cInt("output_h")
            .cInt("output_subx")
            .cInt("output_suby")
            .cInt("output_subw")
            .cInt("output_subh")
            .cAddress("output_cb")
            .cInt("input_stride_in_bytes")
            .cInt("output_stride_in_bytes")
            .cInt("splits")
            .cInt("fast_alpha")
            .cInt("needs_rebuild")
            .cInt("called_alloc")
            .cInt("input_pixel_layout_public")
            .cInt("output_pixel_layout_public")
            .cInt("input_data_type")
            .cInt("output_data_type")
            .cInt("horizontal_filter")
            .cInt("vertical_filter")
            .cInt("horizontal_edge")
            .cInt("vertical_edge")
            .cAddress("horizontal_filter_kernel")
            .cAddress("horizontal_filter_support")
            .cAddress("vertical_filter_kernel")
            .cAddress("vertical_filter_support")
            .cAddress("samplers")
            .build()
    );
}
