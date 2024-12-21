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

val stbrp_coord = int c "stbrp_coord"

fun STBRectPack() {
    val stbrp_rect_ptr = Struct(
        stbPackage,
        "STBRPRect",
        cType = "stbrp_rect",
        javadoc = "16 bytes, nominally"
    ) {
        int("id", javadoc = "reserved for your use")
        stbrp_coord("w", javadoc = "input")
        stbrp_coord("h", javadoc = "input")
        stbrp_coord("x", javadoc = "output")
        stbrp_coord("y", javadoc = "output")
        int("was_packed", javadoc = "non-zero if valid packing")
    }.pointerType c "stbrp_rect *"
    val stbrp_node = Struct(
        stbPackage,
        "STBRPNode",
        cType = "stbrp_node",
        javadoc = """
            the details of the following structures don't matter to you, but they must
            be visible so you can handle the memory allocations for them
        """.trimIndent()
    ) {
        stbrp_coord("x")
        stbrp_coord("y")
        (address c "stbrp_node *")("next")
    }
    val stbrp_node_ptr = stbrp_node.pointerType c "stbrp_node *"
    val stbrp_context_ptr = Struct(
        stbPackage,
        "STBRPContext",
        cType = "stbrp_context",
        javadoc = """
            the details of the following structures don't matter to you, but they must
            be visible so you can handle the memory allocations for them
        """.trimIndent()
    ) {
        int("width")
        int("height")
        int("align")
        int("init_mode")
        int("heuristic")
        int("num_nodes")
        stbrp_node_ptr("active_head")
        stbrp_node_ptr("free_head")
        fixedSize(
            stbrp_node.byValueType,
            "extra",
            2,
            javadoc = "we allocate two extra nodes so optimal user-node-count is 'width' not 'width+2'"
        )
    }.pointerType c "stbrp_context *"

    StaticDowncall(stbPackage, "STBRectPack", symbolLookup = stbLookup) {
        int(
            "STBRP__MAXVAL" to "0x7fffffff",
            javadoc = "Mostly for internal use, but this is the maximum supported coordinate value."
        )
        int("STBRP_HEURISTIC_Skyline_default" to "0")
        int("STBRP_HEURISTIC_Skyline_BL_sortHeight" to "STBRP_HEURISTIC_Skyline_default")
        int("STBRP_HEURISTIC_Skyline_BF_sortHeight" to "1")

        +"stbrp_pack_rects"(
            int,
            stbrp_context_ptr("context"),
            stbrp_rect_ptr("rects"),
            int("num_rects"),
            entrypoint = "stbrp_pack_rects",
            javadoc = """
                Assign packed locations to rectangles. The rectangles are of type
                'stbrp_rect' defined below, stored in the array 'rects', and there
                are 'num_rects' many of them.

                Rectangles which are successfully packed have the 'was_packed' flag
                set to a non-zero value and 'x' and 'y' store the minimum location
                on each axis (i.e. bottom-left in cartesian coordinates, top-left
                if you imagine y increasing downwards). Rectangles which do not fit
                have the 'was_packed' flag set to 0.

                You should not try to access the 'rects' array from another thread
                while this function is running, as the function temporarily reorders
                the array while it executes.

                To pack into another rectangle, you need to call stbrp_init_target
                again. To continue packing into the same rectangle, you can call
                this function again. Calling this multiple times with multiple rect
                arrays will probably produce worse packing results than calling it
                a single time with the full rectangle array, but the option is
                available.

                @return 1 if all of the rectangles were successfully
                        packed and 0 otherwise.
            """.trimIndent()
        ).overload()

        +"stbrp_init_target"(
            void,
            stbrp_context_ptr("context"),
            int("width"),
            int("height"),
            stbrp_node_ptr("nodes"),
            int("num_nodes"),
            entrypoint = "stbrp_init_target",
            javadoc = """
                Initialize a rectangle packer to:
                pack a rectangle that is 'width' by 'height' in dimensions
                using temporary storage provided by the array 'nodes', which is 'num_nodes' long

                You must call this function every time you start packing into a new target.

                There is no "shutdown" function. The 'nodes' memory must stay valid for
                the following stbrp_pack_rects() call (or calls), but can be freed after
                the call (or calls) finish.

                Note: to guarantee best results, either:
                1. make sure 'num_nodes' >= 'width' or
                2. call stbrp_allow_out_of_mem() defined below with 'allow_out_of_mem = 1'

                If you don't do either of the above things, widths will be quantized to multiples
                of small integers to guarantee the algorithm doesn't run out of temporary storage.

                If you do #2, then the non-quantized algorithm will be used, but the algorithm
                may run out of temporary storage and be unable to pack some rectangles.
            """.trimIndent()
        ).overload()

        +"stbrp_setup_allow_out_of_mem"(
            void,
            stbrp_context_ptr("context"),
            boolean_int("allow_out_of_mem"),
            entrypoint = "stbrp_setup_allow_out_of_mem",
            javadoc = """
                Optionally call this function after init but before doing any packing to
                change the handling of the out-of-temp-memory scenario, described above.
                If you call init again, this will be reset to the default (false).
            """.trimIndent()
        ).overload()

        +"stbrp_setup_heuristic"(
            void,
            stbrp_context_ptr("context"),
            int("heuristic"),
            entrypoint = "stbrp_setup_heuristic",
            javadoc = """
                Optionally select which packing heuristic the library should use. Different
                heuristics will produce better/worse results for different data sets.
                If you call init again, this will be reset to the default.
            """.trimIndent()
        ).overload()
    }
}
