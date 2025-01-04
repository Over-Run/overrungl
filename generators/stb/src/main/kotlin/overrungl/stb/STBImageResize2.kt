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

    Upcall(stbPackage, "STBIRInputCallback", javadoc = "INPUT CALLBACK: this callback is used for input scanlines") {
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
    Upcall(stbPackage, "STBIROutputCallback", javadoc = "OUTPUT CALLBACK: this callback is used for output scanlines") {
        targetMethod = "invoke"(
            void,
            void_const_ptr("output_ptr"),
            int("num_pixels"),
            int("y"),
            void_ptr("context")
        )
    }
    Upcall(stbPackage, "STBIRKernelCallback", javadoc = "callbacks for user installed filters") {
        targetMethod = "invoke"(
            float,
            float("x"),
            float("scale"),
            void_ptr("user_data")
        )
    }
    Upcall(stbPackage, "STBIRSupportCallback", javadoc = "callbacks for user installed filters") {
        targetMethod = "invoke"(
            float,
            float("scale"),
            void_ptr("user_data")
        )
    }

    StaticDowncall(stbPackage, "STBImageResize2", symbolLookup = stbLookup) {
        // Easy-to-use API
        stbir_pixel_layout(
            javadoc = """
                stbir_pixel_layout specifies:
                - number of channels
                - order of channels
                - whether color is premultiplied by alpha
                for back compatibility, you can cast the old channel count to an stbir_pixel_layout
            """.trimIndent()
        ) {
            "STBIR_1CHANNEL"("1")
            "STBIR_2CHANNEL"("2")
            "STBIR_RGB"("3", javadoc = "3-chan, with order specified (for channel flipping)")
            "STBIR_BGR"("0", javadoc = "3-chan, with order specified (for channel flipping)")
            "STBIR_4CHANNEL"("5")

            "STBIR_RGBA"("4", javadoc = "alpha formats, where alpha is NOT premultiplied into color channels")
            "STBIR_BGRA"("6")
            "STBIR_ARGB"("7")
            "STBIR_ABGR"("8")
            "STBIR_RA"("9")
            "STBIR_AR"("10")

            "STBIR_RGBA_PM"("11", javadoc = "alpha formats, where alpha is premultiplied into color channels")
            "STBIR_BGRA_PM"("12")
            "STBIR_ARGB_PM"("13")
            "STBIR_ABGR_PM"("14")
            "STBIR_RA_PM"("15")
            "STBIR_AR_PM"("16")

            "STBIR_RGBA_NO_AW"(
                "11",
                javadoc = """
                    alpha formats, where NO alpha weighting is applied at all!
                    these are just synonyms for the _PM flags (which also do
                    no alpha weighting). These names just make it more clear
                    for some folks).
                """.trimIndent()
            )
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
        stbir_edge(javadoc = "stbir_edge") {
            "STBIR_EDGE_CLAMP"("0")
            "STBIR_EDGE_REFLECT"("1")
            "STBIR_EDGE_WRAP"("2", javadoc = "this edge mode is slower and uses more memory")
            "STBIR_EDGE_ZERO"("3")
        }

        stbir_filter(javadoc = "stbir_filter") {
            "STBIR_FILTER_DEFAULT"("0", javadoc = "use same filter type that easy-to-use API chooses")
            "STBIR_FILTER_BOX"(
                "1",
                javadoc = "A trapezoid w/1-pixel wide ramps, same result as box for integer scale ratios"
            )
            "STBIR_FILTER_TRIANGLE"("2", javadoc = "On upsampling, produces same results as bilinear texture filtering")
            "STBIR_FILTER_CUBICBSPLINE"(
                "3",
                javadoc = "The cubic b-spline (aka Mitchell-Netrevalli with B=1,C=0), gaussian-esque"
            )
            "STBIR_FILTER_CATMULLROM"("4", javadoc = "An interpolating cubic spline")
            "STBIR_FILTER_MITCHELL"("5", javadoc = "Mitchell-Netrevalli filter with B=1/3, C=1/3")
            "STBIR_FILTER_POINT_SAMPLE"("6", javadoc = "Simple point sampling")
            "STBIR_FILTER_OTHER"("7", javadoc = "User callback specified")
        }

        stbir_datatype(javadoc = "stbir_datatype") {
            "STBIR_TYPE_UINT8"("0")
            "STBIR_TYPE_UINT8_SRGB"("1")
            "STBIR_TYPE_UINT8_SRGB_ALPHA"(
                "2",
                javadoc = "alpha channel, when present, should also be SRGB (this is very unusual)"
            )
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
            entrypoint = "stbir_set_non_pm_alpha_speed_over_quality",
            javadoc = """
                when inputting AND outputting non-premultiplied alpha pixels, we use a slower but higher quality technique
                that fills the zero alpha pixel's RGB values with something plausible.  If you don't care about areas of
                zero alpha, you can call this function to get about a 25% speed improvement for STBIR_RGBA to STBIR_RGBA
                types of resizes.
            """.trimIndent()
        )

        "stbir_build_samplers"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            entrypoint = "stbir_build_samplers",
            javadoc = "This builds the samplers and does one allocation"
        )
        "stbir_free_samplers"(
            void,
            STBIR_RESIZE_ptr("resize"),
            entrypoint = "stbir_free_samplers",
            javadoc = "You MUST call this, if you call stbir_build_samplers or stbir_build_samplers_with_splits"
        )
        "stbir_resize_extended"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            entrypoint = "stbir_resize_extended",
            javadoc = "And this is the main function to perform the resize synchronously on one thread."
        )

        "stbir_build_samplers_with_splits"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            int("try_splits"),
            entrypoint = "stbir_build_samplers_with_splits",
            javadoc = """
                This will build samplers for threading.
                You can pass in the number of threads you'd like to use (try_splits).
                It returns the number of splits (threads) that you can call it with.
                It might be less if the image resize can't be split up that many ways.
            """.trimIndent()
        )

        "stbir_resize_extended_split"(
            boolean_int,
            STBIR_RESIZE_ptr("resize"),
            int("split_start"),
            int("split_count"),
            entrypoint = "stbir_resize_extended_splits",
            javadoc = """
                This function does a split of the resizing (you call this fuction for each
                split, on multiple threads). A split is a piece of the output resize pixel space.

                Note that you MUST call stbir_build_samplers_with_splits before stbir_resize_extended_split!

                Usually, you will always call stbir_resize_split with split_start as the thread_index
                and "1" for the split_count.
                But, if you have a weird situation where you MIGHT want 8 threads, but sometimes
                only 4 threads, you can use 0,2,4,6 for the split_start's and use "2" for the
                split_count each time to turn in into a 4 thread resize. (This is unusual).
            """.trimIndent()
        )
    }
}
