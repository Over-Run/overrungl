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

import com.palantir.javapoet.ClassName
import overrungl.gen.*

val const_char_ptr_ptr = address c "const char **"
private val _STBRPRect = ClassName.get(stbPackage, "STBRPRect")
val stbrp_rect_ptr = CustomTypeSpec(
    carrier = MemorySegment_,
    javaType = _STBRPRect,
    processor = StructProcessor(_STBRPRect),
    layout = "STBRPRect.LAYOUT",
    cType = "stbrp_rect *"
)

fun STBTruetype() {
    //region Structs
    val stbtt__buf =
        Struct(stbPackage, "STBTT__buf", cType = "stbtt__buf", opaque = true) {
            uchar_ptr("data")
            int("cursor")
            int("size")
        }

    val stbtt_bakedchar_ptr = Struct(stbPackage, "STBTTBakedChar", cType = "stbtt_bakedchar") {
        ushort("x0")
        ushort("y0")
        ushort("x1")
        ushort("y1")
        float("xoff")
        float("yoff")
        float("xadvance")
    }.pointerType c "stbtt_bakedchar *"
    val const_stbtt_bakedchar_ptr = stbtt_bakedchar_ptr c "const stbtt_bakedchar *"

    val stbtt_aligned_quad_ptr = Struct(stbPackage, "STBTTAlignedQuad", cType = "stbtt_aligned_quad") {
        float("x0")
        float("y0")
        float("s0")
        float("t0")
        float("x1")
        float("y1")
        float("s1")
        float("t1")
    }.pointerType c "stbtt_aligned_quad *"

    val stbtt_packedchar_ptr = Struct(stbPackage, "STBTTPackedChar", cType = "stbtt_packedchar") {
        ushort("x0")
        ushort("y0")
        ushort("x1")
        ushort("y1")
        float("xoff")
        float("yoff")
        float("xadvance")
        float("xoff2")
        float("yoff2")
    }.pointerType c "stbtt_packedchar *"
    val const_stbtt_packedchar_ptr = stbtt_packedchar_ptr c "const stbtt_packedchar *"

    val stbtt_pack_context_ptr = address c "stbtt_pack_context *"

    val stbtt_fontinfo_ptr = Struct(stbPackage, "STBTTFontInfo", cType = "stbtt_fontinfo", opaque = true) {
        void_ptr("userdata")
        uchar_ptr("data")
        int("fontstart")
        int("numGlyphs")
        int("loca")
        int("head")
        int("glyf")
        int("hhea")
        int("hmtx")
        int("kern")
        int("gpos")
        int("svg")
        int("index_map")
        int("indexToLocFormat")
        stbtt__buf.byValue("cff")
        stbtt__buf.byValue("charstrings")
        stbtt__buf.byValue("gsubrs")
        stbtt__buf.byValue("subrs")
        stbtt__buf.byValue("fontdicts")
        stbtt__buf.byValue("fdselect")
    }.pointerType c "stbtt_fontinfo *"
    val const_stbtt_fontinfo_ptr = stbtt_fontinfo_ptr c "const stbtt_fontinfo *"

    val stbtt_pack_range_ptr = Struct(stbPackage, "STBTTPackRange", cType = "stbtt_pack_range") {
        float("font_size")
        int("first_unicode_codepoint_in_range")
        int_ptr("array_of_unicode_codepoints")
        int("num_chars")
        stbtt_packedchar_ptr("chardata_for_range")
        uchar("h_oversample")
        uchar("v_oversample")
    }.pointerType c "stbtt_pack_range *"

    val stbtt_kerningentry_ptr = Struct(stbPackage, "STBTTKerningEntry", cType = "stbtt_kerningentry") {
        int("glyph1")
        int("glyph2")
        int("advance")
    }.pointerType c "stbtt_kerningentry*"

    val stbtt_vertex_ptr = Struct(stbPackage, "STBTTVertex", cType = "stbtt_vertex") {
        val stbtt_vertex_type = short c "stbtt_vertex_type"
        stbtt_vertex_type("x")
        stbtt_vertex_type("y")
        stbtt_vertex_type("cx")
        stbtt_vertex_type("cy")
        stbtt_vertex_type("cx1")
        stbtt_vertex_type("cy1")
        uchar("type")
        uchar("padding")
    }.pointerType c "stbtt_vertex *"

    val stbtt__bitmap_ptr = Struct(stbPackage, "STBTT__bitmap", cType = "stbtt__bitmap", opaque = true) {
        int("w")
        int("h")
        int("stride")
        uchar_ptr("pixels")
    }.pointerType c "stbtt__bitmap *"
    //endregion

    StaticDowncall(stbPackage, "STBTrueType", symbolLookup = stbLookup) {
        // TEXTURE BAKING API
        +"stbtt_BakeFontBitmap"(
            int,
            const_uchar_ptr("data"), int("offset"),
            float("pixel_height"),
            uchar_ptr("pixels"), int("pw"), int("ph"),
            int("first_char"), int("num_chars"),
            stbtt_bakedchar_ptr("chardata"),
            entrypoint = "stbtt_BakeFontBitmap"
        ).overload()
        +"stbtt_GetBakedQuad"(
            void,
            const_stbtt_bakedchar_ptr("chardata"), int("pw"), int("ph"),
            int("char_index"),
            float_ptr("xpos").ref(), float_ptr("ypos").ref(),
            stbtt_aligned_quad_ptr("q"),
            boolean_int("opengl_fillrule"),
            entrypoint = "stbtt_GetBakedQuad"
        ).overload()
        +"stbtt_GetScaledFontVMetrics"(
            void,
            const_uchar_ptr("fontdata"),
            int("index"),
            float("size"),
            float_ptr("ascent").ref(),
            float_ptr("descent").ref(),
            float_ptr("lineGap").ref(),
            entrypoint = "stbtt_GetScaledFontVMetrics"
        ).overload()


        // NEW TEXTURE BAKING API
        "stbtt_PackBegin"(
            boolean_int,
            stbtt_pack_context_ptr("spc"),
            uchar_ptr("pixels"),
            int("width"),
            int("height"),
            int("stride_in_bytes"),
            int("padding"),
            void_ptr("alloc_context"),
            entrypoint = "stbtt_PackBegin"
        )
        "stbtt_PackEnd"(void, stbtt_pack_context_ptr("spc"), entrypoint = "stbtt_PackEnd")
        "stbtt_PackFontRange"(
            boolean_int,
            stbtt_pack_context_ptr("spc"),
            const_uchar_ptr("fontdata"),
            int("font_index"),
            float("font_size"),
            int("first_unicode_char_in_range"),
            int("num_chars_in_range"),
            stbtt_packedchar_ptr("chardata_for_range"),
            entrypoint = "stbtt_PackFontRange"
        )
        +"stbtt_PackFontRanges"(
            boolean_int,
            stbtt_pack_context_ptr("spc"),
            const_uchar_ptr("fontdata"),
            int("font_index"),
            stbtt_pack_range_ptr("ranges"),
            int("num_ranges"),
            entrypoint = "stbtt_PackFontRanges"
        ).overload()
        "stbtt_PackSetOversampling"(
            void,
            stbtt_pack_context_ptr("spc"),
            uint("h_oversample"),
            uint("v_oversample"),
            entrypoint = "stbtt_PackSetOversampling"
        )
        "stbtt_PackSetSkipMissingCodepoints"(
            void,
            stbtt_pack_context_ptr("spc"),
            boolean_int("skip"),
            entrypoint = "stbtt_PackSetSkipMissingCodepoints"
        )
        +"stbtt_GetPackedQuad"(
            void,
            const_stbtt_packedchar_ptr("chardata"), int("pw"), int("ph"),
            int("char_index"),
            float_ptr("xpos").ref(), float_ptr("ypos").ref(),
            stbtt_aligned_quad_ptr("q"),
            boolean_int("align_to_integer"),
            entrypoint = "stbtt_GetPackedQuad"
        ).overload()
        "stbtt_PackFontRangesGatherRects"(
            int,
            stbtt_pack_context_ptr("spc"),
            const_stbtt_fontinfo_ptr("info"),
            stbtt_pack_range_ptr("ranges"),
            int("num_ranges"),
            stbrp_rect_ptr("rects"),
            entrypoint = "stbtt_PackFontRangesGatherRects"
        )
        "stbtt_PackFontRangesPackRects"(
            void,
            stbtt_pack_context_ptr("spc"),
            stbrp_rect_ptr("rects"),
            int("num_rects"),
            entrypoint = "stbtt_PackFontRangesPackRects"
        )
        "stbtt_PackFontRangesRenderIntoRects"(
            int,
            stbtt_pack_context_ptr("spc"),
            const_stbtt_fontinfo_ptr("info"),
            stbtt_pack_range_ptr("ranges"),
            int("num_ranges"),
            stbrp_rect_ptr("rects"),
            entrypoint = "stbtt_PackFontRangesRenderIntoRects"
        )


        // FONT LOADING
        "stbtt_GetNumberOfFonts"(int, const_uchar_ptr("data"), entrypoint = "stbtt_GetNumberOfFonts")
        "stbtt_GetFontOffsetForIndex"(
            int,
            const_uchar_ptr("data"),
            int("index"),
            entrypoint = "stbtt_GetFontOffsetForIndex"
        )
        "stbtt_InitFont"(
            boolean_int,
            stbtt_fontinfo_ptr("info"),
            const_uchar_ptr("data"),
            int("offset"),
            entrypoint = "stbtt_InitFont"
        )


        // CHARACTER TO GLYPH-INDEX CONVERSION
        "stbtt_FindGlyphIndex"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("unicode_codepoint"),
            entrypoint = "stbtt_FindGlyphIndex"
        )


        // CHARACTER PROPERTIES
        "stbtt_ScaleForPixelHeight"(
            float,
            const_stbtt_fontinfo_ptr("info"),
            float("pixels"),
            entrypoint = "stbtt_ScaleForPixelHeight"
        )
        "stbtt_ScaleForMappingEmToPixels"(
            float,
            const_stbtt_fontinfo_ptr("info"),
            float("pixels"),
            entrypoint = "stbtt_ScaleForMappingEmToPixels"
        )
        +"stbtt_GetFontVMetrics"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            int_ptr("ascent").ref(),
            int_ptr("descent").ref(),
            int_ptr("lineGap").ref(),
            entrypoint = "stbtt_GetFontVMetrics"
        ).overload()
        +"stbtt_GetFontVMetricsOS2"(
            boolean_int,
            const_stbtt_fontinfo_ptr("info"),
            int_ptr("typoAscent").ref(),
            int_ptr("typoDescent").ref(),
            int_ptr("typoLineGap").ref(),
            entrypoint = "stbtt_GetFontVMetricsOS2"
        ).overload()
        +"stbtt_GetFontBoundingBox"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            int_ptr("x0").ref(),
            int_ptr("y0").ref(),
            int_ptr("x1").ref(),
            int_ptr("y1").ref(),
            entrypoint = "stbtt_GetFontBoundingBox"
        ).overload()
        +"stbtt_GetCodepointHMetrics"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            int("codepoint"),
            int_ptr("advanceWidth").ref(),
            int_ptr("leftSideBearing").ref(),
            entrypoint = "stbtt_GetCodepointHMetrics"
        ).overload()
        "stbtt_GetCodepointKernAdvance"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("ch1"),
            int("ch2"),
            entrypoint = "stbtt_GetCodepointKernAdvance"
        )
        +"stbtt_GetCodepointBox"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("codepoint"),
            int_ptr("x0").ref(),
            int_ptr("y0").ref(),
            int_ptr("x1").ref(),
            int_ptr("y1").ref(),
            entrypoint = "stbtt_GetCodepointBox"
        ).overload()
        +"stbtt_GetGlyphHMetrics"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            int("glyph_index"),
            int_ptr("advanceWidth").ref(),
            int_ptr("leftSideBearing").ref(),
            entrypoint = "stbtt_GetGlyphHMetrics"
        ).overload()
        "stbtt_GetGlyphKernAdvance"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("glyph1"),
            int("glyph2"),
            entrypoint = "stbtt_GetGlyphKernAdvance"
        )
        +"stbtt_GetGlyphBox"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("glyph_index"),
            int_ptr("x0").ref(),
            int_ptr("y0").ref(),
            int_ptr("x1").ref(),
            int_ptr("y1").ref(),
            entrypoint = "stbtt_GetGlyphBox"
        ).overload()
        "stbtt_GetKerningTableLength"(int, const_stbtt_fontinfo_ptr("info"), entrypoint = "stbtt_GetKerningTableLength")
        "stbtt_GetKerningTable"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            stbtt_kerningentry_ptr("table"),
            int("table_length"),
            entrypoint = "stbtt_GetKerningTable"
        )


        // GLYPH SHAPES
        int {
            "STBTT_vmove"("1")
            "STBTT_vline"("2")
            "STBTT_vcurve"("3")
            "STBTT_vcubic"("4")
        }

        "stbtt_IsGlyphEmpty"(boolean_int, const_stbtt_fontinfo_ptr("info"), int("glyph_index"), entrypoint = "stbtt_IsGlyphEmpty")
        val stbtt_vertex_ptr_ptr = address c "stbtt_vertex **"
        "stbtt_GetCodepointShape"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("unicode_codepoint"),
            stbtt_vertex_ptr_ptr("vertices"),
            entrypoint = "stbtt_GetCodepointShape"
        )
        "stbtt_GetGlyphShape"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("glyph_index"),
            stbtt_vertex_ptr_ptr("vertices"),
            entrypoint = "stbtt_GetGlyphShape"
        )
        +"stbtt_FreeShape"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            stbtt_vertex_ptr("vertices"),
            entrypoint = "stbtt_FreeShape"
        ).overload()
        "stbtt_FindSVGDoc"(
            uchar_ptr,
            const_stbtt_fontinfo_ptr("info"),
            int("gl"),
            entrypoint = "stbtt_FindSVGDoc"
        )
        "stbtt_GetCodepointSVG"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("unicode_codepoint"),
            const_char_ptr_ptr("svg"),
            entrypoint = "stbtt_GetCodepointSVG"
        )
        "stbtt_GetGlyphSVG"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("gl"),
            const_char_ptr_ptr("svg"),
            entrypoint = "stbtt_GetGlyphSVG"
        )


        // BITMAP RENDERING
        "stbtt_FreeBitmap"(
            void,
            uchar_ptr("bitmap"),
            void_ptr("userdata"),
            entrypoint = "stbtt_FreeBitmap"
        )
        +"stbtt_GetCodepointBitmap"(
            uchar_ptr,
            const_stbtt_fontinfo_ptr("info"),
            float("scale_x"),
            float("scale_y"),
            int("codepoint"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            int_ptr("xoff").ref(),
            int_ptr("yoff").ref(),
            entrypoint = "stbtt_GetCodepointBitmap"
        ).overload()
        +"stbtt_GetCodepointBitmapSubpixel"(
            uchar_ptr,
            const_stbtt_fontinfo_ptr("info"),
            float("scale_x"),
            float("scale_y"),
            float("shift_x"),
            float("shift_y"),
            int("codepoint"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            int_ptr("xoff").ref(),
            int_ptr("yoff").ref(),
            entrypoint = "stbtt_GetCodepointBitmapSubpixel"
        ).overload()
        "stbtt_MakeCodepointBitmap"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            uchar_ptr("output"),
            int("out_w"),
            int("out_h"),
            int("out_stride"),
            float("scale_x"),
            float("scale_y"),
            int("codepoint"),
            entrypoint = "stbtt_MakeCodepointBitmap"
        )
        "stbtt_MakeCodepointBitmapSubpixel"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            uchar_ptr("output"),
            int("out_w"),
            int("out_h"),
            int("out_stride"),
            float("scale_x"),
            float("scale_y"),
            float("shift_x"),
            float("shift_y"),
            int("codepoint"),
            entrypoint = "stbtt_MakeCodepointBitmapSubpixel"
        )
        +"stbtt_MakeCodepointBitmapSubpixelPrefilter"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            uchar_ptr("output"),
            int("out_w"),
            int("out_h"),
            int("out_stride"),
            float("scale_x"),
            float("scale_y"),
            float("shift_x"),
            float("shift_y"),
            int("oversample_x"),
            int("oversample_y"),
            float_ptr("sub_x").ref(),
            float_ptr("sub_y").ref(),
            int("codepoint"),
            entrypoint = "stbtt_MakeCodepointBitmapSubpixelPrefilter"
        ).overload()
        +"stbtt_GetCodepointBitmapBox"(
            void,
            const_stbtt_fontinfo_ptr("font"),
            int("codepoint"),
            float("scale_x"),
            float("scale_y"),
            int_ptr("ix0").ref(),
            int_ptr("iy0").ref(),
            int_ptr("ix1").ref(),
            int_ptr("iy1").ref(),
            entrypoint = "stbtt_GetCodepointBitmapBox"
        ).overload()
        +"stbtt_GetCodepointBitmapBoxSubpixel"(
            void,
            const_stbtt_fontinfo_ptr("font"),
            int("codepoint"),
            float("scale_x"),
            float("scale_y"),
            float("shift_x"),
            float("shift_y"),
            int_ptr("ix0").ref(),
            int_ptr("iy0").ref(),
            int_ptr("ix1").ref(),
            int_ptr("iy1").ref(),
            entrypoint = "stbtt_GetCodepointBitmapBoxSubpixel"
        ).overload()
        +"stbtt_GetGlyphBitmap"(
            uchar_ptr,
            const_stbtt_fontinfo_ptr("info"),
            float("scale_x"),
            float("scale_y"),
            int("glyph"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            int_ptr("xoff").ref(),
            int_ptr("yoff").ref(),
            entrypoint = "stbtt_GetGlyphBitmap"
        ).overload()
        +"stbtt_GetGlyphBitmapSubpixel"(
            uchar_ptr,
            const_stbtt_fontinfo_ptr("info"),
            float("scale_x"),
            float("scale_y"),
            float("shift_x"),
            float("shift_y"),
            int("glyph"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            int_ptr("xoff").ref(),
            int_ptr("yoff").ref(),
            entrypoint = "stbtt_GetGlyphBitmapSubpixel"
        ).overload()
        "stbtt_MakeGlyphBitmap"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            uchar_ptr("output"),
            int("out_w"),
            int("out_h"),
            int("out_stride"),
            float("scale_x"),
            float("scale_y"),
            int("glyph"),
            entrypoint = "stbtt_MakeGlyphBitmap"
        )
        "stbtt_MakeGlyphBitmapSubpixel"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            uchar_ptr("output"),
            int("out_w"),
            int("out_h"),
            int("out_stride"),
            float("scale_x"),
            float("scale_y"),
            float("shift_x"),
            float("shift_y"),
            int("glyph"),
            entrypoint = "stbtt_MakeGlyphBitmapSubpixel"
        )
        +"stbtt_MakeGlyphBitmapSubpixelPrefilter"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            uchar_ptr("output"),
            int("out_w"),
            int("out_h"),
            int("out_stride"),
            float("scale_x"),
            float("scale_y"),
            float("shift_x"),
            float("shift_y"),
            int("oversample_x"),
            int("oversample_y"),
            float_ptr("sub_x").ref(),
            float_ptr("sub_y").ref(),
            int("glyph"),
            entrypoint = "stbtt_MakeGlyphBitmapSubpixelPrefilter"
        ).overload()
        +"stbtt_GetGlyphBitmapBox"(
            void,
            const_stbtt_fontinfo_ptr("font"),
            int("glyph"),
            float("scale_x"),
            float("scale_y"),
            int_ptr("ix0").ref(),
            int_ptr("iy0").ref(),
            int_ptr("ix1").ref(),
            int_ptr("iy1").ref(),
            entrypoint = "stbtt_GetGlyphBitmapBox"
        ).overload()
        +"stbtt_GetGlyphBitmapBoxSubpixel"(
            void,
            const_stbtt_fontinfo_ptr("font"),
            int("glyph"),
            float("scale_x"),
            float("scale_y"),
            float("shift_x"),
            float("shift_y"),
            int_ptr("ix0").ref(),
            int_ptr("iy0").ref(),
            int_ptr("ix1").ref(),
            int_ptr("iy1").ref(),
            entrypoint = "stbtt_GetGlyphBitmapBoxSubpixel"
        ).overload()
        +"stbtt_Rasterize"(
            void,
            stbtt__bitmap_ptr("result"),
            float("flatness_in_pixels"),
            stbtt_vertex_ptr("vertices"),
            int("num_verts"),
            float("scale_x"), float("scale_y"),
            float("shift_x"), float("shift_y"),
            int("x_off"), int("y_off"),
            boolean_int("invert"),
            void_ptr("userdata"),
            entrypoint = "stbtt_Rasterize"
        ).overload()

        // Signed Distance Function (or Field) rendering
        "stbtt_FreeSDF"(
            void,
            uchar_ptr("bitmap"),
            void_ptr("userdata"),
            entrypoint = "stbtt_FreeSDF"
        )
        +"stbtt_GetGlyphSDF"(
            uchar_ptr,
            const_stbtt_fontinfo_ptr("info"),
            float("scale"),
            int("glyph"),
            int("padding"),
            uchar("onedge_value"),
            float("pixel_dist_scale"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            int_ptr("xoff").ref(),
            int_ptr("yoff").ref(),
            entrypoint = "stbtt_GetGlyphSDF"
        ).overload()
        +"stbtt_GetCodepointSDF"(
            uchar_ptr,
            const_stbtt_fontinfo_ptr("info"),
            float("scale"),
            int("codepoint"),
            int("padding"),
            uchar("onedge_value"),
            float("pixel_dist_scale"),
            int_ptr("width").ref(),
            int_ptr("height").ref(),
            int_ptr("xoff").ref(),
            int_ptr("yoff").ref(),
            entrypoint = "stbtt_GetCodepointSDF"
        ).overload()


        +"stbtt_FindMatchingFont"(
            int,
            const_uchar_ptr("fontdata"),
            const_char_ptr("name"),
            int("flags"),
            entrypoint = "stbtt_FindMatchingFont"
        ).overload()
        int {
            "STBTT_MACSTYLE_DONTCARE"("0")
            "STBTT_MACSTYLE_BOLD"("1")
            "STBTT_MACSTYLE_ITALIC"("2")
            "STBTT_MACSTYLE_UNDERSCORE"("4")
            "STBTT_MACSTYLE_NONE"("8")
        }
        "stbtt_CompareUTF8toUTF16_bigendian"(
            boolean_int,
            const_char_ptr("s1"),
            int("len1"),
            const_char_ptr("s2"),
            int("len2"),
            entrypoint = "stbtt_CompareUTF8toUTF16_bigendian"
        )
        "stbtt_GetFontNameString"(
            const_char_ptr,
            const_stbtt_fontinfo_ptr("font"),
            int_ptr("length").ref(),
            int("platformID"),
            int("encodingID"),
            int("languageID"),
            int("nameID"),
            entrypoint = "stbtt_GetFontNameString"
        )

        int("STBTT_PLATFORM_ID_UNICODE" to "0")
        int("STBTT_PLATFORM_ID_MAC" to "1")
        int("STBTT_PLATFORM_ID_ISO" to "2")
        int("STBTT_PLATFORM_ID_MICROSOFT" to "3")

        int("STBTT_UNICODE_EID_UNICODE_1_0" to "0")
        int("STBTT_UNICODE_EID_UNICODE_1_1" to "1")
        int("STBTT_UNICODE_EID_ISO_10646" to "2")
        int("STBTT_UNICODE_EID_UNICODE_2_0_BMP" to "3")
        int("STBTT_UNICODE_EID_UNICODE_2_0_FULL" to "4")

        int("STBTT_MS_EID_SYMBOL" to "0")
        int("STBTT_MS_EID_UNICODE_BMP" to "1")
        int("STBTT_MS_EID_SHIFTJIS" to "2")
        int("STBTT_MS_EID_UNICODE_FULL" to "10")

        int("STBTT_MAC_EID_ROMAN" to "0")
        int("STBTT_MAC_EID_JAPANESE" to "1")
        int("STBTT_MAC_EID_CHINESE_TRAD" to "2")
        int("STBTT_MAC_EID_KOREAN" to "3")
        int("STBTT_MAC_EID_ARABIC" to "4")
        int("STBTT_MAC_EID_HEBREW" to "5")
        int("STBTT_MAC_EID_GREEK" to "6")
        int("STBTT_MAC_EID_RUSSIAN" to "7")

        int("STBTT_MS_LANG_ENGLISH" to "0x0409")
        int("STBTT_MS_LANG_CHINESE" to "0x0804")
        int("STBTT_MS_LANG_DUTCH" to "0x0413")
        int("STBTT_MS_LANG_FRENCH" to "0x040c")
        int("STBTT_MS_LANG_GERMAN" to "0x0407")
        int("STBTT_MS_LANG_HEBREW" to "0x040d")
        int("STBTT_MS_LANG_ITALIAN" to "0x0410")
        int("STBTT_MS_LANG_JAPANESE" to "0x0411")
        int("STBTT_MS_LANG_KOREAN" to "0x0412")
        int("STBTT_MS_LANG_RUSSIAN" to "0x0419")
        int("STBTT_MS_LANG_SPANISH" to "0x0409")
        int("STBTT_MS_LANG_SWEDISH" to "0x041D")

        int("STBTT_MAC_LANG_ENGLISH" to "0")
        int("STBTT_MAC_LANG_ARABIC" to "12")
        int("STBTT_MAC_LANG_DUTCH" to "4")
        int("STBTT_MAC_LANG_FRENCH" to "1")
        int("STBTT_MAC_LANG_GERMAN" to "2")
        int("STBTT_MAC_LANG_HEBREW" to "10")
        int("STBTT_MAC_LANG_ITALIAN" to "3")
        int("STBTT_MAC_LANG_JAPANESE" to "11")
        int("STBTT_MAC_LANG_KOREAN" to "23")
        int("STBTT_MAC_LANG_RUSSIAN" to "32")
        int("STBTT_MAC_LANG_SPANISH" to "6")
        int("STBTT_MAC_LANG_SWEDISH" to "5")
        int("STBTT_MAC_LANG_CHINESE_SIMPLIFIED" to "33")
        int("STBTT_MAC_LANG_CHINESE_TRAD" to "19")
    }
}
