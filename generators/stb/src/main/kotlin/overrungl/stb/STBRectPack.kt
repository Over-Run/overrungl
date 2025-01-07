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

val stbrp_coord = int c "stbrp_coord"

fun STBRectPack() {
    val stbrp_rect_ptr = Struct(stbPackage, "STBRPRect", cType = "stbrp_rect") {
        int("id")
        stbrp_coord("w")
        stbrp_coord("h")
        stbrp_coord("x")
        stbrp_coord("y")
        int("was_packed")
    }.pointerType c "stbrp_rect *"
    val stbrp_node = Struct(stbPackage, "STBRPNode", cType = "stbrp_node", opaque = true) {
        stbrp_coord("x")
        stbrp_coord("y")
        (address c "stbrp_node *")("next")
    }
    val stbrp_node_ptr = stbrp_node.pointerType c "stbrp_node *"
    val stbrp_context_ptr = Struct(stbPackage, "STBRPContext", cType = "stbrp_context", opaque = true) {
        int("width")
        int("height")
        int("align")
        int("init_mode")
        int("heuristic")
        int("num_nodes")
        stbrp_node_ptr("active_head")
        stbrp_node_ptr("free_head")
        fixedSize(stbrp_node.byValueType, "extra", 2)
    }.pointerType c "stbrp_context *"

    StaticDowncall(stbPackage, "STBRectPack", symbolLookup = stbLookup) {
        int("STBRP__MAXVAL" to "0x7fffffff")
        int("STBRP_HEURISTIC_Skyline_default" to "0")
        int("STBRP_HEURISTIC_Skyline_BL_sortHeight" to "STBRP_HEURISTIC_Skyline_default")
        int("STBRP_HEURISTIC_Skyline_BF_sortHeight" to "1")

        +"stbrp_pack_rects"(
            int,
            stbrp_context_ptr("context"),
            stbrp_rect_ptr("rects"),
            int("num_rects"),
            entrypoint = "stbrp_pack_rects"
        ).overload()

        +"stbrp_init_target"(
            void,
            stbrp_context_ptr("context"),
            int("width"),
            int("height"),
            stbrp_node_ptr("nodes"),
            int("num_nodes"),
            entrypoint = "stbrp_init_target"
        ).overload()

        +"stbrp_setup_allow_out_of_mem"(
            void,
            stbrp_context_ptr("context"),
            boolean_int("allow_out_of_mem"),
            entrypoint = "stbrp_setup_allow_out_of_mem"
        ).overload()

        +"stbrp_setup_heuristic"(
            void,
            stbrp_context_ptr("context"),
            int("heuristic"),
            entrypoint = "stbrp_setup_heuristic"
        ).overload()
    }
}
