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
        Struct(stbPackage, "STBTT__buf", cType = "stbtt__buf", javadoc = "private structure", opaque = true) {
            uchar_ptr("data")
            int("cursor")
            int("size")
        }

    val stbtt_bakedchar_ptr = Struct(stbPackage, "STBTTBakedChar", cType = "stbtt_bakedchar") {
        val xy01 = "coordinates of bbox in bitmap"
        ushort("x0", javadoc = xy01)
        ushort("y0", javadoc = xy01)
        ushort("x1", javadoc = xy01)
        ushort("y1", javadoc = xy01)
        float("xoff")
        float("yoff")
        float("xadvance")
    }.pointerType c "stbtt_bakedchar *"
    val const_stbtt_bakedchar_ptr = stbtt_bakedchar_ptr c "const stbtt_bakedchar *"

    val stbtt_aligned_quad_ptr = Struct(stbPackage, "STBTTAlignedQuad", cType = "stbtt_aligned_quad") {
        val tl = "top-left"
        val br = "bottom-right"
        float("x0", javadoc = tl)
        float("y0", javadoc = tl)
        float("s0", javadoc = tl)
        float("t0", javadoc = tl)
        float("x1", javadoc = br)
        float("y1", javadoc = br)
        float("s1", javadoc = br)
        float("t1", javadoc = br)
    }.pointerType c "stbtt_aligned_quad *"

    val stbtt_packedchar_ptr = Struct(stbPackage, "STBTTPackedChar", cType = "stbtt_packedchar") {
        val doc = "coordinates of bbox in bitmap"
        ushort("x0", javadoc = doc)
        ushort("y0", javadoc = doc)
        ushort("x1", javadoc = doc)
        ushort("y1", javadoc = doc)
        float("xoff")
        float("yoff")
        float("xadvance")
        float("xoff2")
        float("yoff2")
    }.pointerType c "stbtt_packedchar *"
    val const_stbtt_packedchar_ptr = stbtt_packedchar_ptr c "const stbtt_packedchar *"

    val stbtt_pack_context_ptr = address c "stbtt_pack_context *"

    val stbtt_fontinfo_ptr = Struct(
        stbPackage,
        "STBTTFontInfo",
        cType = "stbtt_fontinfo",
        javadoc = """
            The following structure is defined publicly so you can declare one on
            the stack or as a global or etc, but you should treat it as opaque.
        """.trimIndent(),
        opaque = true
    ) {
        void_ptr("userdata")
        uchar_ptr("data", javadoc = "pointer to .ttf file")
        int("fontstart", javadoc = "offset of start of font")
        int("numGlyphs", javadoc = "number of glyphs, needed for range checking")
        val doc1 = "table locations as offset from start of .ttf"
        int("loca", javadoc = doc1)
        int("head", javadoc = doc1)
        int("glyf", javadoc = doc1)
        int("hhea", javadoc = doc1)
        int("hmtx", javadoc = doc1)
        int("kern", javadoc = doc1)
        int("gpos", javadoc = doc1)
        int("svg", javadoc = doc1)
        int("index_map", javadoc = "a cmap mapping for our chosen character encoding")
        int("indexToLocFormat", javadoc = "format needed to map from glyph index to glyph")
        stbtt__buf.byValue("cff", javadoc = "cff font data")
        stbtt__buf.byValue("charstrings", javadoc = "the charstring index")
        stbtt__buf.byValue("gsubrs", javadoc = "global charstring subroutines index")
        stbtt__buf.byValue("subrs", javadoc = "private charstring subroutines index")
        stbtt__buf.byValue("fontdicts", javadoc = "array of font dicts")
        stbtt__buf.byValue("fdselect", javadoc = "map from glyph to fontdict")
    }.pointerType c "stbtt_fontinfo *"
    val const_stbtt_fontinfo_ptr = stbtt_fontinfo_ptr c "const stbtt_fontinfo *"

    val stbtt_pack_range_ptr = Struct(stbPackage, "STBTTPackRange", cType = "stbtt_pack_range") {
        float("font_size")
        int(
            "first_unicode_codepoint_in_range",
            javadoc = "if non-zero, then the chars are continuous, and this is the first codepoint"
        )
        int_ptr("array_of_unicode_codepoints", javadoc = "if non-zero, then this is an array of unicode codepoints")
        int("num_chars")
        stbtt_packedchar_ptr("chardata_for_range", javadoc = "output")
        val doc = "don't set these, they're used internally"
        uchar("h_oversample", javadoc = doc)
        uchar("v_oversample", javadoc = doc)
    }.pointerType c "stbtt_pack_range *"

    val stbtt_kerningentry_ptr = Struct(stbPackage, "STBTTKerningEntry", cType = "stbtt_kerningentry") {
        int("glyph1", javadoc = "use stbtt_FindGlyphIndex")
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

    val stbtt__bitmap_ptr = Struct(
        stbPackage,
        "STBTT__bitmap",
        cType = "stbtt__bitmap",
        javadoc = "`@TODO: don't expose this structure`",
        opaque = true
    ) {
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
            entrypoint = "stbtt_BakeFontBitmap",
            javadoc = """
                if return is positive, the first unused row of the bitmap
                if return is negative, returns the negative of the number of characters that fit
                if return is 0, no characters fit and no rows were used
                This uses a very crappy packing.
            """.trimIndent()
        ).overload()
        +"stbtt_GetBakedQuad"(
            void,
            const_stbtt_bakedchar_ptr("chardata"), int("pw"), int("ph"),
            int("char_index"),
            float_ptr("xpos").ref(), float_ptr("ypos").ref(),
            stbtt_aligned_quad_ptr("q"),
            boolean_int("opengl_fillrule"),
            entrypoint = "stbtt_GetBakedQuad",
            javadoc = """
                Call GetBakedQuad with char_index = 'character - first_char', and it
                creates the quad you need to draw and advances the current position.

                The coordinate system used assumes y increases downwards.

                Characters will extend both above and below the current position;
                see discussion of "BASELINE" above.

                It's inefficient; you might want to c&p it and optimize it.
            """.trimIndent()
        ).overload()
        +"stbtt_GetScaledFontVMetrics"(
            void,
            const_uchar_ptr("fontdata"),
            int("index"),
            float("size"),
            float_ptr("ascent").ref(),
            float_ptr("descent").ref(),
            float_ptr("lineGap").ref(),
            entrypoint = "stbtt_GetScaledFontVMetrics",
            javadoc = "Query the font vertical metrics without having to create a font first."
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
            entrypoint = "stbtt_PackBegin",
            javadoc = """
                Initializes a packing context stored in the passed-in stbtt_pack_context.
                Future calls using this context will pack characters into the bitmap passed
                in here: a 1-channel bitmap that is width * height. stride_in_bytes is
                the distance from one row to the next (or 0 to mean they are packed tightly
                together). "padding" is the amount of padding to leave between each
                character (normally you want '1' for bitmaps you'll use as textures with
                bilinear filtering).

                Returns `false` on failure, `true` on success.
            """.trimIndent()
        )
        "stbtt_PackEnd"(
            void,
            stbtt_pack_context_ptr("spc"),
            entrypoint = "stbtt_PackEnd",
            javadoc = "Cleans up the packing context and frees all memory."
        )
        "stbtt_PackFontRange"(
            boolean_int,
            stbtt_pack_context_ptr("spc"),
            const_uchar_ptr("fontdata"),
            int("font_index"),
            float("font_size"),
            int("first_unicode_char_in_range"),
            int("num_chars_in_range"),
            stbtt_packedchar_ptr("chardata_for_range"),
            entrypoint = "stbtt_PackFontRange",
            javadoc = """
                Creates character bitmaps from the font_index'th font found in fontdata (use
                font_index=0 if you don't know what that is). It creates num_chars_in_range
                bitmaps for characters with unicode values starting at first_unicode_char_in_range
                and increasing. Data for how to render them is stored in chardata_for_range;
                pass these to stbtt_GetPackedQuad to get back renderable quads.

                font_size is the full height of the character from ascender to descender,
                as computed by stbtt_ScaleForPixelHeight. To use a point size as computed
                by stbtt_ScaleForMappingEmToPixels, wrap the point size in STBTT_POINT_SIZE()
                and pass that result as 'font_size':
                ```
                ...,                  20 , ... // font max minus min y is 20 pixels tall
                ..., STBTT_POINT_SIZE(20), ... // 'M' is 20 pixels tall
                ```
            """.trimIndent()
        )
        +"stbtt_PackFontRanges"(
            boolean_int,
            stbtt_pack_context_ptr("spc"),
            const_uchar_ptr("fontdata"),
            int("font_index"),
            stbtt_pack_range_ptr("ranges"),
            int("num_ranges"),
            entrypoint = "stbtt_PackFontRanges",
            javadoc = """
                Creates character bitmaps from multiple ranges of characters stored in
                ranges. This will usually create a better-packed bitmap than multiple
                calls to stbtt_PackFontRange. Note that you can call this multiple
                times within a single PackBegin/PackEnd.
            """.trimIndent()
        ).overload()
        "stbtt_PackSetOversampling"(
            void,
            stbtt_pack_context_ptr("spc"),
            uint("h_oversample"),
            uint("v_oversample"),
            entrypoint = "stbtt_PackSetOversampling",
            javadoc = """
                Oversampling a font increases the quality by allowing higher-quality subpixel
                positioning, and is especially valuable at smaller text sizes.

                This function sets the amount of oversampling for all following calls to
                stbtt_PackFontRange(s) or stbtt_PackFontRangesGatherRects for a given
                pack context. The default (no oversampling) is achieved by h_oversample=1
                and v_oversample=1. The total number of pixels required is
                h_oversample*v_oversample larger than the default; for example, 2x2
                oversampling requires 4x the storage of 1x1. For best results, render
                oversampled textures with bilinear filtering. Look at the readme in
                stb/tests/oversample for information about oversampled fonts

                To use with PackFontRangesGather etc., you must set it before calls
                call to PackFontRangesGatherRects.
            """.trimIndent()
        )
        "stbtt_PackSetSkipMissingCodepoints"(
            void,
            stbtt_pack_context_ptr("spc"),
            boolean_int("skip"),
            entrypoint = "stbtt_PackSetSkipMissingCodepoints",
            javadoc = """
                If skip != 0, this tells stb_truetype to skip any codepoints for which
                there is no corresponding glyph. If skip=0, which is the default, then
                codepoints without a glyph recived the font's "missing character" glyph,
                typically an empty box by convention.
            """.trimIndent()
        )
        +"stbtt_GetPackedQuad"(
            void,
            const_stbtt_packedchar_ptr("chardata"), int("pw"), int("ph"),
            int("char_index"),
            float_ptr("xpos").ref(), float_ptr("ypos").ref(),
            stbtt_aligned_quad_ptr("q"),
            boolean_int("align_to_integer"),
            entrypoint = "stbtt_GetPackedQuad",
            javadoc = """
                Calling these functions in sequence is roughly equivalent to calling
                stbtt_PackFontRanges(). If you more control over the packing of multiple
                fonts, or if you want to pack custom data into a font texture, take a look
                at the source to of stbtt_PackFontRanges() and create a custom version
                using these functions, e.g. call GatherRects multiple times,
                building up a single array of rects, then call PackRects once,
                then call RenderIntoRects repeatedly. This may result in a
                better packing than calling PackFontRanges multiple times
                (or it may not).
            """.trimIndent()
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
        "stbtt_GetNumberOfFonts"(
            int,
            const_uchar_ptr("data"),
            entrypoint = "stbtt_GetNumberOfFonts",
            javadoc = """
                This function will determine the number of fonts in a font file.  TrueType
                collection (.ttc) files may contain multiple fonts, while TrueType font
                (.ttf) files only contain one font. The number of fonts can be used for
                indexing with the previous function where the index is between zero and one
                less than the total fonts. If an error occurs, -1 is returned.
            """.trimIndent()
        )
        "stbtt_GetFontOffsetForIndex"(
            int,
            const_uchar_ptr("data"),
            int("index"),
            entrypoint = "stbtt_GetFontOffsetForIndex",
            javadoc = """
                Each .ttf/.ttc file may have more than one font. Each font has a sequential
                index number starting from 0. Call this function to get the font offset for
                a given index; it returns -1 if the index is out of range. A regular .ttf
                file will only define one font and it always be at offset 0, so it will
                return '0' for index 0, and -1 for all other indices.
            """.trimIndent()
        )
        "stbtt_InitFont"(
            boolean_int,
            stbtt_fontinfo_ptr("info"),
            const_uchar_ptr("data"),
            int("offset"),
            entrypoint = "stbtt_InitFont",
            javadoc = """
                Given an offset into the file that defines a font, this function builds
                the necessary cached info for the rest of the system. You must allocate
                the stbtt_fontinfo yourself, and stbtt_InitFont will fill it out. You don't
                need to do anything special to free it, because the contents are pure
                value data with no additional data structures.
                @return 0 on failure.
            """.trimIndent()
        )


        // CHARACTER TO GLYPH-INDEX CONVERSION
        "stbtt_FindGlyphIndex"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("unicode_codepoint"),
            entrypoint = "stbtt_FindGlyphIndex",
            javadoc = """
                If you're going to perform multiple operations on the same character
                and you want a speed-up, call this function with the character you're
                going to process, then use glyph-based functions instead of the
                codepoint-based functions.
                @return 0 if the character codepoint is not defined in the font.
            """.trimIndent()
        )


        // CHARACTER PROPERTIES
        "stbtt_ScaleForPixelHeight"(
            float,
            const_stbtt_fontinfo_ptr("info"),
            float("pixels"),
            entrypoint = "stbtt_ScaleForPixelHeight",
            javadoc = """
                computes a scale factor to produce a font whose "height" is 'pixels' tall.
                Height is measured as the distance from the highest ascender to the lowest
                descender; in other words, it's equivalent to calling stbtt_GetFontVMetrics
                and computing:
                ```
                scale = pixels / (ascent - descent)
                ```
                so if you prefer to measure height by the ascent only, use a similar calculation.
            """.trimIndent()
        )
        "stbtt_ScaleForMappingEmToPixels"(
            float,
            const_stbtt_fontinfo_ptr("info"),
            float("pixels"),
            entrypoint = "stbtt_ScaleForMappingEmToPixels",
            javadoc = """
                computes a scale factor to produce a font whose EM size is mapped to
                'pixels' tall. This is probably what traditional APIs compute, but
                I'm not positive.
            """.trimIndent()
        )
        +"stbtt_GetFontVMetrics"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            int_ptr("ascent").ref(),
            int_ptr("descent").ref(),
            int_ptr("lineGap").ref(),
            entrypoint = "stbtt_GetFontVMetrics",
            javadoc = """
                these are expressed in unscaled coordinates, so you must multiply by
                the scale factor for a given size

                @param ascent the coordinate above the baseline the font extends
                @param descent the coordinate below the baseline the font extends (i.e. it is typically negative)
                @param lineGap the spacing between one row's descent and the next row's ascent...
                so you should advance the vertical position by "*ascent - *descent + *lineGap"
            """.trimIndent()
        ).overload()
        +"stbtt_GetFontVMetricsOS2"(
            boolean_int,
            const_stbtt_fontinfo_ptr("info"),
            int_ptr("typoAscent").ref(),
            int_ptr("typoDescent").ref(),
            int_ptr("typoLineGap").ref(),
            entrypoint = "stbtt_GetFontVMetricsOS2",
            javadoc = """
                analogous to GetFontVMetrics, but returns the "typographic" values from the OS/2
                table (specific to MS/Windows TTF files).

                @return 1 on success (table present), 0 on failure.
            """.trimIndent()
        ).overload()
        +"stbtt_GetFontBoundingBox"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            int_ptr("x0").ref(),
            int_ptr("y0").ref(),
            int_ptr("x1").ref(),
            int_ptr("y1").ref(),
            entrypoint = "stbtt_GetFontBoundingBox",
            javadoc = "the bounding box around all possible characters"
        ).overload()
        +"stbtt_GetCodepointHMetrics"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            int("codepoint"),
            int_ptr("advanceWidth").ref(),
            int_ptr("leftSideBearing").ref(),
            entrypoint = "stbtt_GetCodepointHMetrics",
            javadoc = """
                these are expressed in unscaled coordinates
                @param advanceWidth the offset from the current horizontal position to the next horizontal position
                @param leftSideBearing the offset from the current horizontal position to the left edge of the character
            """.trimIndent()
        ).overload()
        "stbtt_GetCodepointKernAdvance"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("ch1"),
            int("ch2"),
            entrypoint = "stbtt_GetCodepointKernAdvance",
            javadoc = "an additional amount to add to the 'advance' value between ch1 and ch2"
        )
        +"stbtt_GetCodepointBox"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("codepoint"),
            int_ptr("x0").ref(),
            int_ptr("y0").ref(),
            int_ptr("x1").ref(),
            int_ptr("y1").ref(),
            entrypoint = "stbtt_GetCodepointBox",
            javadoc = "Gets the bounding box of the visible part of the glyph, in unscaled coordinates"
        ).overload()
        +"stbtt_GetGlyphHMetrics"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            int("glyph_index"),
            int_ptr("advanceWidth").ref(),
            int_ptr("leftSideBearing").ref(),
            entrypoint = "stbtt_GetGlyphHMetrics",
            javadoc = "as above, but takes one or more glyph indices for greater efficiency"
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
            entrypoint = "stbtt_GetKerningTable",
            javadoc = """
                Retrieves a complete list of all of the kerning pairs provided by the font
                stbtt_GetKerningTable never writes more than table_length entries and returns how many entries it did write.
                The table will be sorted by (a.glyph1 == b.glyph1)?(a.glyph2 < b.glyph2):(a.glyph1 < b.glyph1)
            """.trimIndent()
        )


        // GLYPH SHAPES
        int {
            "STBTT_vmove"("1")
            "STBTT_vline"("2")
            "STBTT_vcurve"("3")
            "STBTT_vcubic"("4")
        }

        "stbtt_IsGlyphEmpty"(
            boolean_int,
            const_stbtt_fontinfo_ptr("info"),
            int("glyph_index"),
            entrypoint = "stbtt_IsGlyphEmpty",
            javadoc = "@return `true` if nothing is drawn for this glyph"
        )
        val stbtt_vertex_ptr_ptr = address c "stbtt_vertex **"
        val doc_GetShape = """
            {@return # of vertices and fills *vertices with the pointer to them}
            these are expressed in "unscaled" coordinates

            The shape is a series of contours. Each one starts with
            a STBTT_moveto, then consists of a series of mixed
            STBTT_lineto and STBTT_curveto segments. A lineto
            draws a line from previous endpoint to its x,y; a curveto
            draws a quadratic bezier from previous endpoint to
            its x,y, using cx,cy as the bezier control point.
        """.trimIndent()
        "stbtt_GetCodepointShape"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("unicode_codepoint"),
            stbtt_vertex_ptr_ptr("vertices"),
            entrypoint = "stbtt_GetCodepointShape",
            javadoc = doc_GetShape
        )
        "stbtt_GetGlyphShape"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("glyph_index"),
            stbtt_vertex_ptr_ptr("vertices"),
            entrypoint = "stbtt_GetGlyphShape",
            javadoc = doc_GetShape
        )
        +"stbtt_FreeShape"(
            void,
            const_stbtt_fontinfo_ptr("info"),
            stbtt_vertex_ptr("vertices"),
            entrypoint = "stbtt_FreeShape",
            javadoc = "frees the data allocated above"
        ).overload()
        "stbtt_FindSVGDoc"(
            uchar_ptr,
            const_stbtt_fontinfo_ptr("info"),
            int("gl"),
            entrypoint = "stbtt_FindSVGDoc"
        )
        val doc_GetSVG = """
            fills svg with the character's SVG data.
            @return data size or 0 if SVG not found.
        """.trimIndent()
        "stbtt_GetCodepointSVG"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("unicode_codepoint"),
            const_char_ptr_ptr("svg"),
            entrypoint = "stbtt_GetCodepointSVG",
            javadoc = doc_GetSVG
        )
        "stbtt_GetGlyphSVG"(
            int,
            const_stbtt_fontinfo_ptr("info"),
            int("gl"),
            const_char_ptr_ptr("svg"),
            entrypoint = "stbtt_GetGlyphSVG",
            javadoc = doc_GetSVG
        )


        // BITMAP RENDERING
        "stbtt_FreeBitmap"(
            void,
            uchar_ptr("bitmap"),
            void_ptr("userdata"),
            entrypoint = "stbtt_FreeBitmap",
            javadoc = "frees the bitmap allocated below"
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
            entrypoint = "stbtt_GetCodepointBitmap",
            javadoc = """
                allocates a large-enough single-channel 8bpp bitmap and renders the
                specified character/glyph at the specified scale into it, with
                antialiasing. 0 is no coverage (transparent), 255 is fully covered (opaque).
                *width & *height are filled out with the width & height of the bitmap,
                which is stored left-to-right, top-to-bottom.

                xoff/yoff are the offset it pixel space from the glyph origin to the top-left of the bitmap
            """.trimIndent()
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
            entrypoint = "stbtt_GetCodepointBitmapSubpixel",
            javadoc = """
                the same as stbtt_GetCodepointBitmap, but you can specify a subpixel
                shift for the character
            """.trimIndent()
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
            entrypoint = "stbtt_MakeCodepointBitmap",
            javadoc = """
                the same as stbtt_GetCodepointBitmap, but you pass in storage for the bitmap
                in the form of 'output', with row spacing of 'out_stride' bytes. the bitmap
                is clipped to out_w/out_h bytes. Call stbtt_GetCodepointBitmapBox to get the
                width and height and positioning info for it first.
            """.trimIndent()
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
            entrypoint = "stbtt_MakeCodepointBitmapSubpixel",
            javadoc = """
                same as stbtt_MakeCodepointBitmap, but you can specify a subpixel
                shift for the character
            """.trimIndent()
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
            entrypoint = "stbtt_MakeCodepointBitmapSubpixelPrefilter",
            javadoc = """
                same as stbtt_MakeCodepointBitmapSubpixel, but prefiltering
                is performed (see stbtt_PackSetOversampling)
            """.trimIndent()
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
            entrypoint = "stbtt_GetCodepointBitmapBox",
            javadoc = """
                get the bbox of the bitmap centered around the glyph origin; so the
                bitmap width is ix1-ix0, height is iy1-iy0, and location to place
                the bitmap top left is (leftSideBearing*scale,iy0).
                (Note that the bitmap uses y-increases-down, but the shape uses
                y-increases-up, so CodepointBitmapBox and CodepointBox are inverted.)
            """.trimIndent()
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
            entrypoint = "stbtt_GetCodepointBitmapBoxSubpixel",
            javadoc = """
                same as stbtt_GetCodepointBitmapBox, but you can specify a subpixel
                shift for the character
            """.trimIndent()
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
            entrypoint = "stbtt_GetGlyphBitmap",
            javadoc = """
                the following functions are equivalent to the above functions, but operate
                on glyph indices instead of Unicode codepoints (for efficiency)
            """.trimIndent()
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
            entrypoint = "stbtt_Rasterize",
            javadoc = """
                rasterize a shape with quadratic beziers into a bitmap
                @param result 1-channel bitmap to draw into
                @param flatness_in_pixels allowable error of curve in pixels
                @param vertices array of vertices defining shape
                @param num_verts number of vertices in above array
                @param scale_x scale applied to input vertices
                @param scale_y scale applied to input vertices
                @param shift_x translation applied to input vertices
                @param shift_y translation applied to input vertices
                @param x_off another translation applied to input
                @param y_off another translation applied to input
                @param invert if non-zero, vertically flip shape
                @param userdata context for to STBTT_MALLOC
            """.trimIndent()
        ).overload()

        // Signed Distance Function (or Field) rendering
        "stbtt_FreeSDF"(
            void,
            uchar_ptr("bitmap"),
            void_ptr("userdata"),
            entrypoint = "stbtt_FreeSDF",
            javadoc = "frees the SDF bitmap allocated below"
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
            entrypoint = "stbtt_GetGlyphSDF",
            javadoc = """
                These functions compute a discretized SDF field for a single character, suitable for storing
                in a single-channel texture, sampling with bilinear filtering, and testing against
                larger than some threshold to produce scalable fonts.

                pixel_dist_scale & onedge_value are a scale & bias that allows you to make
                optimal use of the limited 0..255 for your application, trading off precision
                and special effects. SDF values outside the range 0..255 are clamped to 0..255.

                The function computes the SDF analytically at each SDF pixel, not by e.g.
                building a higher-res bitmap and approximating it. In theory the quality
                should be as high as possible for an SDF of this size & representation, but
                unclear if this is true in practice (perhaps building a higher-res bitmap
                and computing from that can allow drop-out prevention).

                The algorithm has not been optimized at all, so expect it to be slow
                if computing lots of characters or very large sizes.

                #### Example
                - scale = stbtt_ScaleForPixelHeight(22)
                - padding = 5
                - onedge_value = 180
                - pixel_dist_scale = 180/5.0 = 36.0

                This will create an SDF bitmap in which the character is about 22 pixels
                high but the whole bitmap is about 22+5+5=32 pixels high. To produce a filled
                shape, sample the SDF at each pixel and fill the pixel if the SDF value
                is greater than or equal to 180/255. (You'll actually want to antialias,
                which is beyond the scope of this example.) Additionally, you can compute
                offset outlines (e.g. to stroke the character border inside & outside,
                or only outside). For example, to fill outside the character up to 3 SDF
                pixels, you would compare against (180-36.0*3)/255 = 72/255. The above
                choice of variables maps a range from 5 pixels outside the shape to
                2 pixels inside the shape to 0..255; this is intended primarily for apply
                outside effects only (the interior range is needed to allow proper
                antialiasing of the font at *smaller* sizes)

                @param info             the font
                @param scale            controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap
                @param glyph            the character to generate the SDF for
                @param padding          extra "pixels" around the character which are filled with the distance to the character (not 0),
                                        which allows effects like bit outlines
                @param onedge_value     value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)
                @param pixel_dist_scale what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale)
                                        if positive, > onedge_value is inside; if negative, < onedge_value is inside
                @param width            output width of the SDF bitmap (including padding)
                @param height           output height of the SDF bitmap (including padding)
                @param xoff             output origin of the character
                @param yoff             output origin of the character
                @return a 2D array of bytes 0..255, width*height in size
            """.trimIndent()
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
            entrypoint = "stbtt_GetCodepointSDF",
            javadoc = "See stbtt_GetGlyphSDF"
        ).overload()


        +"stbtt_FindMatchingFont"(
            int,
            const_uchar_ptr("fontdata"),
            const_char_ptr("name"),
            int("flags"),
            entrypoint = "stbtt_FindMatchingFont",
            javadoc = """
                returns the offset (not index) of the font that matches, or -1 if none
                if you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold".
                if you use any other flag, use a font name like "Arial"; this checks
                the 'macStyle' header field; i don't know if fonts set this consistently
            """.trimIndent()
        ).overload()
        int {
            "STBTT_MACSTYLE_DONTCARE"("0")
            "STBTT_MACSTYLE_BOLD"("1")
            "STBTT_MACSTYLE_ITALIC"("2")
            "STBTT_MACSTYLE_UNDERSCORE"("4")
            "STBTT_MACSTYLE_NONE"("8", javadoc = "<= not same as 0, this makes us check the bitfield is 0")
        }
        "stbtt_CompareUTF8toUTF16_bigendian"(
            boolean_int,
            const_char_ptr("s1"),
            int("len1"),
            const_char_ptr("s2"),
            int("len2"),
            entrypoint = "stbtt_CompareUTF8toUTF16_bigendian",
            javadoc = """
                returns 1/0 whether the first string interpreted as utf8 is identical to
                the second string interpreted as big-endian utf16... useful for strings from next func
            """.trimIndent()
        )
        "stbtt_GetFontNameString"(
            const_char_ptr,
            const_stbtt_fontinfo_ptr("font"),
            int_ptr("length").ref(),
            int("platformID"),
            int("encodingID"),
            int("languageID"),
            int("nameID"),
            entrypoint = "stbtt_GetFontNameString",
            javadoc = """
                returns the string (which may be big-endian double byte, e.g. for unicode)
                and puts the length in bytes in *length.

                some of the values for the IDs are below; for more see the truetype spec:
                - <https://developer.apple.com/textfonts/TTRefMan/RM06/Chap6name.html>
                - <https://www.microsoft.com/typography/otspec/name.htm>
            """.trimIndent()
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
