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

fun STBTruetype() {
    //region Structs
    val stbtt__buf =
        Struct(stbPackage, "STBTT__buf", cType = "stbtt__buf", javadoc = "private structure", opaque = true) {
            uchar_ptr("data")
            int("cursor")
            int("size")
        }
    Struct(stbPackage, "STBTTBakedChar", cType = "stbtt_bakedchar") {
        val xy01 = "coordinates of bbox in bitmap"
        ushort("x0", javadoc = xy01)
        ushort("y0", javadoc = xy01)
        ushort("x1", javadoc = xy01)
        ushort("y1", javadoc = xy01)
        float("xoff")
        float("yoff")
        float("xadvance")
    }
    Struct(stbPackage, "STBTTAlignedQuad", cType = "stbtt_aligned_quad") {
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
    }
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
    val stbtt_pack_context_ptr = address c "stbtt_pack_context *"
    Struct(
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
    }
    Struct(stbPackage, "STBTTPackRange", cType = "stbtt_pack_range") {
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
    }
    Struct(stbPackage, "STBTTKerningEntry", cType = "stbtt_kerningentry") {
        int("glyph1", javadoc = "use stbtt_FindGlyphIndex")
        int("glyph2")
        int("advance")
    }
    Struct(stbPackage, "STBTTVertex", cType = "stbtt_vertex") {
        val stbtt_vertex_type = short c "stbtt_vertex_type"
        stbtt_vertex_type("x")
        stbtt_vertex_type("y")
        stbtt_vertex_type("cx")
        stbtt_vertex_type("cy")
        stbtt_vertex_type("cx1")
        stbtt_vertex_type("cy1")
        uchar("type")
        uchar("padding")
    }
    //endregion

    StaticDowncall(stbPackage, "STBTrueType", symbolLookup = stbLookup) {
        //region fields
        int("STBTT_vmove" to "1")
        int("STBTT_vline" to "2")
        int("STBTT_vcurve" to "3")
        int("STBTT_vcubic" to "4")

        int("STBTT_MACSTYLE_DONTCARE" to "0")
        int("STBTT_MACSTYLE_BOLD" to "1")
        int("STBTT_MACSTYLE_ITALIC" to "2")
        int("STBTT_MACSTYLE_UNDERSCORE" to "4")
        int("STBTT_MACSTYLE_NONE" to "8")

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
        //endregion
    }
}
