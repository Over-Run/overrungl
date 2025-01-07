/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.stb

import overrungl.gen.*

val stbir_pixel_layout = int c "stbir_pixel_layout"
val stbir_edge = int c "stbir_edge"
val stbir_filter = int c "stbir_filter"
val stbir_datatype = int c "stbir_datatype"
val const_float_ptr = address c "const float *"
val void_const_ptr = address c "void const *"
val stbir_input_callback_ptr = address c "stbir_input_callback *"
val stbir_output_callback_ptr = address c "stbir_output_callback *"
val stbir__kernel_callback_ptr = address c "stbir__kernel_callback *"
val stbir__support_callback_ptr = address c "stbir__support_callback *"
val stbir__info_ptr = address c "stbir__info *"

fun STBImageResize2() {
    Struct(stbPackage, "STBIR_RESIZE", cType = "STBIR_RESIZE") {
        void_ptr("user_data")
        void_const_ptr("input_pixels")
        int("input_w")
        int("input_h")
        double("input_s0")
        double("input_t0")
        double("input_s1")
        double("input_t1")
        stbir_input_callback_ptr("input_cb")
        void_ptr("output_pixels")
        int("output_w")
        int("output_h")
        int("output_subx")
        int("output_suby")
        int("output_subw")
        int("output_subh")
        stbir_output_callback_ptr("output_cb")
        int("input_stride_in_bytes")
        int("output_stride_in_bytes")
        int("splits")
        int("fast_alpha")
        int("needs_rebuild")
        int("called_alloc")
        stbir_pixel_layout("input_pixel_layout_public")
        stbir_pixel_layout("output_pixel_layout_public")
        stbir_datatype("input_data_type")
        stbir_datatype("output_data_type")
        stbir_filter("horizontal_filter")
        stbir_filter("vertical_filter")
        stbir_edge("horizontal_edge")
        stbir_edge("vertical_edge")
        stbir__kernel_callback_ptr("horizontal_filter_kernel")
        stbir__support_callback_ptr("horizontal_filter_support")
        stbir__kernel_callback_ptr("vertical_filter_kernel")
        stbir__support_callback_ptr("vertical_filter_support")
        stbir__info_ptr("samplers")
    }

    Upcall(stbPackage, "STBIRInputCallback") {
        targetMethod = "invoke"(
            void_const_ptr,
            void_ptr("optional_output"),
            void_const_ptr("input_ptr"),
            int("num_pixels"),
            int("x"),
            int("y"),
            void_ptr("context")
        )
    }
    Upcall(stbPackage, "STBIROutputCallback") {
        targetMethod = "invoke"(
            void,
            void_const_ptr("output_ptr"),
            int("num_pixels"),
            int("y"),
            void_ptr("context")
        )
    }
    Upcall(stbPackage, "STBIRKernelCallback") {
        targetMethod = "invoke"(
            float,
            float("x"),
            float("scale"),
            void_ptr("user_data")
        )
    }
    Upcall(stbPackage, "STBIRSupportCallback") {
        targetMethod = "invoke"(
            float,
            float("scale"),
            void_ptr("user_data")
        )
    }

    StaticDowncall(stbPackage, "STBImageResize2", symbolLookup = stbLookup) {
        // Easy-to-use API
        stbir_pixel_layout {
            "STBIR_1CHANNEL"("1")
            "STBIR_2CHANNEL"("2")
            "STBIR_RGB"("3")
            "STBIR_BGR"("0")
            "STBIR_4CHANNEL"("5")

            "STBIR_RGBA"("4")
            "STBIR_BGRA"("6")
            "STBIR_ARGB"("7")
            "STBIR_ABGR"("8")
            "STBIR_RA"("9")
            "STBIR_AR"("10")

            "STBIR_RGBA_PM"("11")
            "STBIR_BGRA_PM"("12")
            "STBIR_ARGB_PM"("13")
            "STBIR_ABGR_PM"("14")
            "STBIR_RA_PM"("15")
            "STBIR_AR_PM"("16")

            "STBIR_RGBA_NO_AW"("11")
            "STBIR_BGRA_NO_AW"("12")
            "STBIR_ARGB_NO_AW"("13")
            "STBIR_ABGR_NO_AW"("14")
            "STBIR_RA_NO_AW"("15")
            "STBIR_AR_NO_AW"("16")
        }

        "stbir_resize_uint8_srgb"(
            uchar_ptr,
            const_uchar_ptr("input_pixels"), int("input_w"), int("input_h"), int("input_stride_in_bytes"),
            uchar_ptr("output_pixels"), int("output_w"), int("output_h"), int("output_stride_in_bytes"),
            stbir_pixel_layout("pixel_type"),
            entrypoint = "stbir_resize_uint8_srgb"
        )
        "stbir_resize_uint8_linear"(
            uchar_ptr,
            const_uchar_ptr("input_pixels"), int("input_w"), int("input_h"), int("input_stride_in_bytes"),
            uchar_ptr("output_pixels"), int("output_w"), int("output_h"), int("output_stride_in_bytes"),
            stbir_pixel_layout("pixel_type"),
            entrypoint = "stbir_resize_uint8_srgb"
        )
        "stbir_resize_float_linear"(
            float_ptr,
            const_float_ptr("input_pixels"), int("input_w"), int("input_h"), int("input_stride_in_bytes"),
            float_ptr("output_pixels"), int("output_w"), int("output_h"), int("output_stride_in_bytes"),
            stbir_pixel_layout("pixel_type"),
            entrypoint = "stbir_resize_uint8_srgb"
        )


        // Medium-complexity API
        stbir_edge {
            "STBIR_EDGE_CLAMP"("0")
            "STBIR_EDGE_REFLECT"("1")
            "STBIR_EDGE_WRAP"("2")
            "STBIR_EDGE_ZERO"("3")
        }

        stbir_filter {
            "STBIR_FILTER_DEFAULT"("0")
            "STBIR_FILTER_BOX"("1")
            "STBIR_FILTER_TRIANGLE"("2")
            "STBIR_FILTER_CUBICBSPLINE"("3")
            "STBIR_FILTER_CATMULLROM"("4")
            "STBIR_FILTER_MITCHELL"("5")
            "STBIR_FILTER_POINT_SAMPLE"("6")
            "STBIR_FILTER_OTHER"("7")
        }

        stbir_datatype {
            "STBIR_TYPE_UINT8"("0")
            "STBIR_TYPE_UINT8_SRGB"("1")
            "STBIR_TYPE_UINT8_SRGB_ALPHA"("2")
            "STBIR_TYPE_UINT16"("3")
            "STBIR_TYPE_FLOAT"("4")
            "STBIR_TYPE_HALF_FLOAT"("5")
        }

        "stbir_resize"(
            void_ptr,
            const_void_ptr("input_pixels"), int("input_w"), int("input_h"), int("input_stride_in_bytes"),
            void_ptr("output_pixels"), int("output_w"), int("output_h"), int("output_stride_in_bytes"),
            stbir_pixel_layout("pixel_layout"), stbir_datatype("data_type"),
            stbir_edge("edge"), stbir_filter("filter"),
            entrypoint = "stbir_resize"
        )


        // Extended-complexity API
        val STBIR_RESIZE_ptr = address c "STBIR_RESIZE *"
        "stbir_resize_init"(
            void,
            STBIR_RESIZE_ptr("resize"),
            const_void_ptr("input_pixels"), int("input_w"), int("input_h"), int("input_stride_in_bytes"),
            void_ptr("output_pixels"), int("output_w"), int("output_h"), int("output_stride_in_bytes"),
            stbir_pixel_layout("pixel_layout"), stbir_datatype("data_type"),
            entrypoint = "stbir_resize_init"
        )

        "stbir_set_datatypes"(
            void,
            STBIR_RESIZE_ptr("resize"),
            stbir_datatype("input_type"),
            stbir_datatype("output_type"),
            entrypoint = "stbir_set_datatypes"
        )
        "stbir_set_pixel_callbacks"(
            void,
            STBIR_RESIZE_ptr("resize"),
            stbir_input_callback_ptr("input_cb"),
            stbir_output_callback_ptr("output_cb"),
            entrypoint = "stbir_set_pixel_callbacks"
        )
        "stbir_set_user_data"(
            void,
            STBIR_RESIZE_ptr("resize"),
            void_ptr("user_data"),
            entrypoint = "stbir_set_user_data"
        )
        "stbir_set_buffer_ptrs"(
            void,
            STBIR_RESIZE_ptr("resize"),
            const_void_ptr("input_pixels"), int("input_stride_in_bytes"),
            void_ptr("output_pixels"), int("output_stride_in_bytes"),
            entrypoint = "stbir_set_buffer_ptrs"
        )

        "stbir_set_pixel_layouts"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            stbir_pixel_layout("input_pixel_layout"),
            stbir_pixel_layout("output_pixel_layout"),
            entrypoint = "stbir_set_pixel_layouts"
        )
        "stbir_set_edgemodes"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            stbir_edge("horizontal_edge"),
            stbir_edge("vertical_edge"),
            entrypoint = "stbir_set_edgemodes"
        )
        "stbir_set_filters"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            stbir_filter("horizontal_filter"),
            stbir_filter("vertical_filter"),
            entrypoint = "stbir_set_filters"
        )
        "stbir_set_filter_callbacks"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            stbir__kernel_callback_ptr("horizontal_filter"),
            stbir__support_callback_ptr("horizontal_support"),
            stbir__kernel_callback_ptr("vertical_filter"),
            stbir__support_callback_ptr("vertical_support"),
            entrypoint = "stbir_set_filter_callbacks"
        )
        "stbir_set_pixel_subrect"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            int("subx"),
            int("suby"),
            int("subw"),
            int("subh"),
            entrypoint = "stbir_set_pixel_subrect"
        )
        "stbir_set_input_subrect"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            double("s0"),
            double("t0"),
            double("s1"),
            double("t1"),
            entrypoint = "stbir_set_input_subrect"
        )
        "stbir_set_output_pixel_subrect"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            int("subx"),
            int("suby"),
            int("subw"),
            int("subh"),
            entrypoint = "stbir_set_output_pixel_subrect"
        )
        "stbir_set_non_pm_alpha_speed_over_quality"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            int("non_pma_alpha_speed_over_quality"),
            entrypoint = "stbir_set_non_pm_alpha_speed_over_quality"
        )

        "stbir_build_samplers"(boolean_int, STBIR_RESIZE_ptr("resize"), entrypoint = "stbir_build_samplers")
        "stbir_free_samplers"(void, STBIR_RESIZE_ptr("resize"), entrypoint = "stbir_free_samplers")
        "stbir_resize_extended"(boolean_int, STBIR_RESIZE_ptr("resize"), entrypoint = "stbir_resize_extended")

        "stbir_build_samplers_with_splits"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            int("try_splits"),
            entrypoint = "stbir_build_samplers_with_splits"
        )

        "stbir_resize_extended_split"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            int("split_start"),
            int("split_count"),
            entrypoint = "stbir_resize_extended_splits"
        )
    }
}
