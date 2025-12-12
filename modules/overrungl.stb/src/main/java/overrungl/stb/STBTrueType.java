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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.stb;

import org.jspecify.annotations.NonNull;

import java.lang.foreign.MemorySegment;

/// =======================================================================
///
/// NO SECURITY GUARANTEE -- DO NOT USE THIS ON UNTRUSTED FONT FILES
///
/// This library does no range checking of the offsets found in the file,
/// meaning an attacker can use it to read arbitrary memory.
///
/// =======================================================================
///
/// [stb_truetype.h](https://github.com/nothings/stb/blob/master/stb_truetype.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBTrueType {
    //@formatter:off
    //region Fields
    public static final int STBTT_MACSTYLE_DONTCARE = 0;
    public static final int STBTT_MACSTYLE_BOLD = 1;
    public static final int STBTT_MACSTYLE_ITALIC = 2;
    public static final int STBTT_MACSTYLE_UNDERSCORE = 4;
    public static final int STBTT_MACSTYLE_NONE = 8;
    public static final int STBTT_vmove = 1;
    public static final int STBTT_vline = 2;
    public static final int STBTT_vcurve = 3;
    public static final int STBTT_vcubic = 4;
    public static final int STBTT_PLATFORM_ID_UNICODE = 0;
    public static final int STBTT_PLATFORM_ID_MAC = 1;
    public static final int STBTT_PLATFORM_ID_ISO = 2;
    public static final int STBTT_PLATFORM_ID_MICROSOFT = 3;
    public static final int STBTT_UNICODE_EID_UNICODE_1_0 = 0;
    public static final int STBTT_UNICODE_EID_UNICODE_1_1 = 1;
    public static final int STBTT_UNICODE_EID_ISO_10646 = 2;
    public static final int STBTT_UNICODE_EID_UNICODE_2_0_BMP = 3;
    public static final int STBTT_UNICODE_EID_UNICODE_2_0_FULL = 4;
    public static final int STBTT_MS_EID_SYMBOL = 0;
    public static final int STBTT_MS_EID_UNICODE_BMP = 1;
    public static final int STBTT_MS_EID_SHIFTJIS = 2;
    public static final int STBTT_MS_EID_UNICODE_FULL = 10;
    public static final int STBTT_MAC_EID_ROMAN = 0;
    public static final int STBTT_MAC_EID_ARABIC = 4;
    public static final int STBTT_MAC_EID_JAPANESE = 1;
    public static final int STBTT_MAC_EID_HEBREW = 5;
    public static final int STBTT_MAC_EID_CHINESE_TRAD = 2;
    public static final int STBTT_MAC_EID_GREEK = 6;
    public static final int STBTT_MAC_EID_KOREAN = 3;
    public static final int STBTT_MAC_EID_RUSSIAN = 7;
    public static final int STBTT_MS_LANG_ENGLISH = 1033;
    public static final int STBTT_MS_LANG_ITALIAN = 1040;
    public static final int STBTT_MS_LANG_CHINESE = 2052;
    public static final int STBTT_MS_LANG_JAPANESE = 1041;
    public static final int STBTT_MS_LANG_DUTCH = 1043;
    public static final int STBTT_MS_LANG_KOREAN = 1042;
    public static final int STBTT_MS_LANG_FRENCH = 1036;
    public static final int STBTT_MS_LANG_RUSSIAN = 1049;
    public static final int STBTT_MS_LANG_GERMAN = 1031;
    public static final int STBTT_MS_LANG_SPANISH = 1033;
    public static final int STBTT_MS_LANG_HEBREW = 1037;
    public static final int STBTT_MS_LANG_SWEDISH = 1053;
    public static final int STBTT_MAC_LANG_ENGLISH = 0;
    public static final int STBTT_MAC_LANG_JAPANESE = 11;
    public static final int STBTT_MAC_LANG_ARABIC = 12;
    public static final int STBTT_MAC_LANG_KOREAN = 23;
    public static final int STBTT_MAC_LANG_DUTCH = 4;
    public static final int STBTT_MAC_LANG_RUSSIAN = 32;
    public static final int STBTT_MAC_LANG_FRENCH = 1;
    public static final int STBTT_MAC_LANG_SPANISH = 6;
    public static final int STBTT_MAC_LANG_GERMAN = 2;
    public static final int STBTT_MAC_LANG_SWEDISH = 5;
    public static final int STBTT_MAC_LANG_HEBREW = 10;
    public static final int STBTT_MAC_LANG_CHINESE_SIMPLIFIED = 33;
    public static final int STBTT_MAC_LANG_ITALIAN = 3;
    public static final int STBTT_MAC_LANG_CHINESE_TRAD = 19;
    //endregion

    /// Invokes `stbtt_BakeFontBitmap`.
    /// ```
    /// int stbtt_BakeFontBitmap(const unsigned char* data, int offset, float pixel_height, unsigned char* pixels, int pw, int ph, int first_char, int num_chars, stbtt_bakedchar* chardata);
    /// ```
    public static int stbtt_BakeFontBitmap(@NonNull MemorySegment data, int offset, float pixel_height, @NonNull MemorySegment pixels, int pw, int ph, int first_char, int num_chars, @NonNull MemorySegment chardata) {
        return org.lwjgl.stb.STBTruetype.nstbtt_BakeFontBitmap(data.address(), offset, pixel_height, pixels.address(), pw, ph, first_char, num_chars, chardata.address());
    }

    /// Invokes `stbtt_GetBakedQuad`.
    /// ```
    /// void stbtt_GetBakedQuad(const stbtt_bakedchar* chardata, int pw, int ph, int char_index, float* xpos, float* ypos, stbtt_aligned_quad* q, int opengl_fillrule);
    /// ```
    public static void stbtt_GetBakedQuad(@NonNull MemorySegment chardata, int pw, int ph, int char_index, @NonNull MemorySegment xpos, @NonNull MemorySegment ypos, @NonNull MemorySegment q, int opengl_fillrule) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetBakedQuad(chardata.address(), pw, ph, char_index, xpos.address(), ypos.address(), q.address(), opengl_fillrule);
    }

    /// Invokes `stbtt_GetScaledFontVMetrics`.
    /// ```
    /// void stbtt_GetScaledFontVMetrics(const unsigned char* fontdata, int index, float size, float* ascent, float* descent, float* lineGap);
    /// ```
    public static void stbtt_GetScaledFontVMetrics(@NonNull MemorySegment fontdata, int index, float size, @NonNull MemorySegment ascent, @NonNull MemorySegment descent, @NonNull MemorySegment lineGap) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetScaledFontVMetrics(fontdata.address(), index, size, ascent.address(), descent.address(), lineGap.address());
    }

    /// Invokes `stbtt_PackBegin`.
    /// ```
    /// (int) STBbool stbtt_PackBegin(stbtt_pack_context* spc, unsigned char* pixels, int width, int height, int stride_in_bytes, int padding, void* alloc_context);
    /// ```
    public static boolean stbtt_PackBegin(@NonNull MemorySegment spc, @NonNull MemorySegment pixels, int width, int height, int stride_in_bytes, int padding, @NonNull MemorySegment alloc_context) {
        return org.lwjgl.stb.STBTruetype.nstbtt_PackBegin(spc.address(), pixels.address(), width, height, stride_in_bytes, padding, alloc_context.address()) != 0;
    }

    /// Invokes `stbtt_PackEnd`.
    /// ```
    /// void stbtt_PackEnd(stbtt_pack_context* spc);
    /// ```
    public static void stbtt_PackEnd(@NonNull MemorySegment spc) {
        org.lwjgl.stb.STBTruetype.nstbtt_PackEnd(spc.address());
    }

    /// Invokes `stbtt_PackFontRange`.
    /// ```
    /// (int) STBbool stbtt_PackFontRange(stbtt_pack_context* spc, const unsigned char* fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, stbtt_packedchar* chardata_for_range);
    /// ```
    public static boolean stbtt_PackFontRange(@NonNull MemorySegment spc, @NonNull MemorySegment fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, @NonNull MemorySegment chardata_for_range) {
        return org.lwjgl.stb.STBTruetype.nstbtt_PackFontRange(spc.address(), fontdata.address(), font_index, font_size, first_unicode_char_in_range, num_chars_in_range, chardata_for_range.address()) != 0;
    }

    /// Invokes `stbtt_PackFontRanges`.
    /// ```
    /// int stbtt_PackFontRanges(stbtt_pack_context* spc, const unsigned char* fontdata, int font_index, stbtt_pack_range* ranges, int num_ranges);
    /// ```
    public static int stbtt_PackFontRanges(@NonNull MemorySegment spc, @NonNull MemorySegment fontdata, int font_index, @NonNull MemorySegment ranges, int num_ranges) {
        return org.lwjgl.stb.STBTruetype.nstbtt_PackFontRanges(spc.address(), fontdata.address(), font_index, ranges.address(), num_ranges);
    }

    /// Invokes `stbtt_PackSetOversampling`.
    /// ```
    /// void stbtt_PackSetOversampling(stbtt_pack_context* spc, unsigned int h_oversample, unsigned int v_oversample);
    /// ```
    public static void stbtt_PackSetOversampling(@NonNull MemorySegment spc, int h_oversample, int v_oversample) {
        org.lwjgl.stb.STBTruetype.nstbtt_PackSetOversampling(spc.address(), h_oversample, v_oversample);
    }

    /// Invokes `stbtt_PackSetSkipMissingCodepoints`.
    /// ```
    /// void stbtt_PackSetSkipMissingCodepoints(stbtt_pack_context* spc, int skip);
    /// ```
    public static void stbtt_PackSetSkipMissingCodepoints(@NonNull MemorySegment spc, int skip) {
        org.lwjgl.stb.STBTruetype.nstbtt_PackSetSkipMissingCodepoints(spc.address(), skip);
    }

    /// Invokes `stbtt_GetPackedQuad`.
    /// ```
    /// void stbtt_GetPackedQuad(const stbtt_packedchar* chardata, int pw, int ph, int char_index, float* xpos, float* ypos, stbtt_aligned_quad* q, int align_to_integer);
    /// ```
    public static void stbtt_GetPackedQuad(@NonNull MemorySegment chardata, int pw, int ph, int char_index, @NonNull MemorySegment xpos, @NonNull MemorySegment ypos, @NonNull MemorySegment q, int align_to_integer) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetPackedQuad(chardata.address(), pw, ph, char_index, xpos.address(), ypos.address(), q.address(), align_to_integer);
    }

    /// Invokes `stbtt_PackFontRangesGatherRects`.
    /// ```
    /// int stbtt_PackFontRangesGatherRects(stbtt_pack_context* spc, const stbtt_fontinfo* info, stbtt_pack_range* ranges, int num_ranges, stbrp_rect* rects);
    /// ```
    public static int stbtt_PackFontRangesGatherRects(@NonNull MemorySegment spc, @NonNull MemorySegment info, @NonNull MemorySegment ranges, int num_ranges, @NonNull MemorySegment rects) {
        return org.lwjgl.stb.STBTruetype.nstbtt_PackFontRangesGatherRects(spc.address(), info.address(), ranges.address(), num_ranges, rects.address());
    }

    /// Invokes `stbtt_PackFontRangesPackRects`.
    /// ```
    /// void stbtt_PackFontRangesPackRects(stbtt_pack_context* spc, stbrp_rect* rects, int num_rects);
    /// ```
    public static void stbtt_PackFontRangesPackRects(@NonNull MemorySegment spc, @NonNull MemorySegment rects, int num_rects) {
        org.lwjgl.stb.STBTruetype.nstbtt_PackFontRangesPackRects(spc.address(), rects.address(), num_rects);
    }

    /// Invokes `stbtt_PackFontRangesRenderIntoRects`.
    /// ```
    /// int stbtt_PackFontRangesRenderIntoRects(stbtt_pack_context* spc, const stbtt_fontinfo* info, stbtt_pack_range* ranges, int num_ranges, stbrp_rect* rects);
    /// ```
    public static int stbtt_PackFontRangesRenderIntoRects(@NonNull MemorySegment spc, @NonNull MemorySegment info, @NonNull MemorySegment ranges, int num_ranges, @NonNull MemorySegment rects) {
        return org.lwjgl.stb.STBTruetype.nstbtt_PackFontRangesRenderIntoRects(spc.address(), info.address(), ranges.address(), num_ranges, rects.address());
    }

    /// Invokes `stbtt_GetNumberOfFonts`.
    /// ```
    /// int stbtt_GetNumberOfFonts(const unsigned char* data);
    /// ```
    public static int stbtt_GetNumberOfFonts(@NonNull MemorySegment data) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetNumberOfFonts(data.address());
    }

    /// Invokes `stbtt_GetFontOffsetForIndex`.
    /// ```
    /// int stbtt_GetFontOffsetForIndex(const unsigned char* data, int index);
    /// ```
    public static int stbtt_GetFontOffsetForIndex(@NonNull MemorySegment data, int index) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetFontOffsetForIndex(data.address(), index);
    }

    /// Invokes `stbtt_InitFont`.
    /// ```
    /// (int) STBbool stbtt_InitFont(stbtt_fontinfo* info, const unsigned char* data, int offset);
    /// ```
    public static boolean stbtt_InitFont(@NonNull MemorySegment info, @NonNull MemorySegment data, int offset) {
        return org.lwjgl.stb.STBTruetype.nstbtt_InitFont(info.address(), data.address(), offset) != 0;
    }

    /// Invokes `stbtt_FindGlyphIndex`.
    /// ```
    /// int stbtt_FindGlyphIndex(const stbtt_fontinfo* info, int unicode_codepoint);
    /// ```
    public static int stbtt_FindGlyphIndex(@NonNull MemorySegment info, int unicode_codepoint) {
        return org.lwjgl.stb.STBTruetype.nstbtt_FindGlyphIndex(info.address(), unicode_codepoint);
    }

    /// Invokes `stbtt_ScaleForPixelHeight`.
    /// ```
    /// float stbtt_ScaleForPixelHeight(const stbtt_fontinfo* info, float pixels);
    /// ```
    public static float stbtt_ScaleForPixelHeight(@NonNull MemorySegment info, float pixels) {
        return org.lwjgl.stb.STBTruetype.nstbtt_ScaleForPixelHeight(info.address(), pixels);
    }

    /// Invokes `stbtt_ScaleForMappingEmToPixels`.
    /// ```
    /// float stbtt_ScaleForMappingEmToPixels(const stbtt_fontinfo* info, float pixels);
    /// ```
    public static float stbtt_ScaleForMappingEmToPixels(@NonNull MemorySegment info, float pixels) {
        return org.lwjgl.stb.STBTruetype.nstbtt_ScaleForMappingEmToPixels(info.address(), pixels);
    }

    /// Invokes `stbtt_GetFontVMetrics`.
    /// ```
    /// void stbtt_GetFontVMetrics(const stbtt_fontinfo* info, int* ascent, int* descent, int* lineGap);
    /// ```
    public static void stbtt_GetFontVMetrics(@NonNull MemorySegment info, @NonNull MemorySegment ascent, @NonNull MemorySegment descent, @NonNull MemorySegment lineGap) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetFontVMetrics(info.address(), ascent.address(), descent.address(), lineGap.address());
    }

    /// Invokes `stbtt_GetFontVMetricsOS2`.
    /// ```
    /// (int) STBbool stbtt_GetFontVMetricsOS2(const stbtt_fontinfo* info, int* typoAscent, int* typoDescent, int* typoLineGap);
    /// ```
    public static boolean stbtt_GetFontVMetricsOS2(@NonNull MemorySegment info, @NonNull MemorySegment typoAscent, @NonNull MemorySegment typoDescent, @NonNull MemorySegment typoLineGap) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetFontVMetricsOS2(info.address(), typoAscent.address(), typoDescent.address(), typoLineGap.address()) != 0;
    }

    /// Invokes `stbtt_GetFontBoundingBox`.
    /// ```
    /// void stbtt_GetFontBoundingBox(const stbtt_fontinfo* info, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static void stbtt_GetFontBoundingBox(@NonNull MemorySegment info, @NonNull MemorySegment x0, @NonNull MemorySegment y0, @NonNull MemorySegment x1, @NonNull MemorySegment y1) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetFontBoundingBox(info.address(), x0.address(), y0.address(), x1.address(), y1.address());
    }

    /// Invokes `stbtt_GetCodepointHMetrics`.
    /// ```
    /// void stbtt_GetCodepointHMetrics(const stbtt_fontinfo* info, int codepoint, int* advanceWidth, int* leftSideBearing);
    /// ```
    public static void stbtt_GetCodepointHMetrics(@NonNull MemorySegment info, int codepoint, @NonNull MemorySegment advanceWidth, @NonNull MemorySegment leftSideBearing) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointHMetrics(info.address(), codepoint, advanceWidth.address(), leftSideBearing.address());
    }

    /// Invokes `stbtt_GetCodepointKernAdvance`.
    /// ```
    /// int stbtt_GetCodepointKernAdvance(const stbtt_fontinfo* info, int ch1, int ch2);
    /// ```
    public static int stbtt_GetCodepointKernAdvance(@NonNull MemorySegment info, int ch1, int ch2) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointKernAdvance(info.address(), ch1, ch2);
    }

    /// Invokes `stbtt_GetCodepointBox`.
    /// ```
    /// int stbtt_GetCodepointBox(const stbtt_fontinfo* info, int codepoint, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static int stbtt_GetCodepointBox(@NonNull MemorySegment info, int codepoint, @NonNull MemorySegment x0, @NonNull MemorySegment y0, @NonNull MemorySegment x1, @NonNull MemorySegment y1) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointBox(info.address(), codepoint, x0.address(), y0.address(), x1.address(), y1.address());
    }

    /// Invokes `stbtt_GetGlyphHMetrics`.
    /// ```
    /// void stbtt_GetGlyphHMetrics(const stbtt_fontinfo* info, int glyph_index, int* advanceWidth, int* leftSideBearing);
    /// ```
    public static void stbtt_GetGlyphHMetrics(@NonNull MemorySegment info, int glyph_index, @NonNull MemorySegment advanceWidth, @NonNull MemorySegment leftSideBearing) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphHMetrics(info.address(), glyph_index, advanceWidth.address(), leftSideBearing.address());
    }

    /// Invokes `stbtt_GetGlyphKernAdvance`.
    /// ```
    /// int stbtt_GetGlyphKernAdvance(const stbtt_fontinfo* info, int glyph1, int glyph2);
    /// ```
    public static int stbtt_GetGlyphKernAdvance(@NonNull MemorySegment info, int glyph1, int glyph2) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphKernAdvance(info.address(), glyph1, glyph2);
    }

    /// Invokes `stbtt_GetGlyphBox`.
    /// ```
    /// int stbtt_GetGlyphBox(const stbtt_fontinfo* info, int glyph_index, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static int stbtt_GetGlyphBox(@NonNull MemorySegment info, int glyph_index, @NonNull MemorySegment x0, @NonNull MemorySegment y0, @NonNull MemorySegment x1, @NonNull MemorySegment y1) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphBox(info.address(), glyph_index, x0.address(), y0.address(), x1.address(), y1.address());
    }

    /// Invokes `stbtt_GetKerningTableLength`.
    /// ```
    /// int stbtt_GetKerningTableLength(const stbtt_fontinfo* info);
    /// ```
    public static int stbtt_GetKerningTableLength(@NonNull MemorySegment info) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetKerningTableLength(info.address());
    }

    /// Invokes `stbtt_GetKerningTable`.
    /// ```
    /// int stbtt_GetKerningTable(const stbtt_fontinfo* info, stbtt_kerningentry* table, int table_length);
    /// ```
    public static int stbtt_GetKerningTable(@NonNull MemorySegment info, @NonNull MemorySegment table, int table_length) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetKerningTable(info.address(), table.address(), table_length);
    }

    /// Invokes `stbtt_IsGlyphEmpty`.
    /// ```
    /// (int) STBbool stbtt_IsGlyphEmpty(const stbtt_fontinfo* info, int glyph_index);
    /// ```
    public static boolean stbtt_IsGlyphEmpty(@NonNull MemorySegment info, int glyph_index) {
        return org.lwjgl.stb.STBTruetype.nstbtt_IsGlyphEmpty(info.address(), glyph_index) != 0;
    }

    /// Invokes `stbtt_GetCodepointShape`.
    /// ```
    /// int stbtt_GetCodepointShape(const stbtt_fontinfo* info, int unicode_codepoint, stbtt_vertex** vertices);
    /// ```
    public static int stbtt_GetCodepointShape(@NonNull MemorySegment info, int unicode_codepoint, @NonNull MemorySegment vertices) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointShape(info.address(), unicode_codepoint, vertices.address());
    }

    /// Invokes `stbtt_GetGlyphShape`.
    /// ```
    /// int stbtt_GetGlyphShape(const stbtt_fontinfo* info, int glyph_index, stbtt_vertex** vertices);
    /// ```
    public static int stbtt_GetGlyphShape(@NonNull MemorySegment info, int glyph_index, @NonNull MemorySegment vertices) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphShape(info.address(), glyph_index, vertices.address());
    }

    /// Invokes `stbtt_FreeShape`.
    /// ```
    /// void stbtt_FreeShape(const stbtt_fontinfo* info, stbtt_vertex* vertices);
    /// ```
    public static void stbtt_FreeShape(@NonNull MemorySegment info, @NonNull MemorySegment vertices) {
        org.lwjgl.stb.STBTruetype.nstbtt_FreeShape(info.address(), vertices.address());
    }

    /// Invokes `stbtt_FindSVGDoc`.
    /// ```
    /// unsigned char* stbtt_FindSVGDoc(const stbtt_fontinfo* info, int gl);
    /// ```
    public static @NonNull MemorySegment stbtt_FindSVGDoc(@NonNull MemorySegment info, int gl) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBTruetype.nstbtt_FindSVGDoc(info.address(), gl));
    }

    /// Invokes `stbtt_GetCodepointSVG`.
    /// ```
    /// int stbtt_GetCodepointSVG(const stbtt_fontinfo* info, int unicode_codepoint, const char** svg);
    /// ```
    public static int stbtt_GetCodepointSVG(@NonNull MemorySegment info, int unicode_codepoint, @NonNull MemorySegment svg) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointSVG(info.address(), unicode_codepoint, svg.address());
    }

    /// Invokes `stbtt_GetGlyphSVG`.
    /// ```
    /// int stbtt_GetGlyphSVG(const stbtt_fontinfo* info, int gl, const char** svg);
    /// ```
    public static int stbtt_GetGlyphSVG(@NonNull MemorySegment info, int gl, @NonNull MemorySegment svg) {
        return org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphSVG(info.address(), gl, svg.address());
    }

    /// Invokes `stbtt_FreeBitmap`.
    /// ```
    /// void stbtt_FreeBitmap(unsigned char* bitmap, void* userdata);
    /// ```
    public static void stbtt_FreeBitmap(@NonNull MemorySegment bitmap, @NonNull MemorySegment userdata) {
        org.lwjgl.stb.STBTruetype.nstbtt_FreeBitmap(bitmap.address(), userdata.address());
    }

    /// Invokes `stbtt_GetCodepointBitmap`.
    /// ```
    /// unsigned char* stbtt_GetCodepointBitmap(const stbtt_fontinfo* info, float scale_x, float scale_y, int codepoint, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetCodepointBitmap(@NonNull MemorySegment info, float scale_x, float scale_y, int codepoint, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointBitmap(info.address(), scale_x, scale_y, codepoint, width.address(), height.address(), xoff.address(), yoff.address()));
    }

    /// Invokes `stbtt_GetCodepointBitmapSubpixel`.
    /// ```
    /// unsigned char* stbtt_GetCodepointBitmapSubpixel(const stbtt_fontinfo* info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetCodepointBitmapSubpixel(@NonNull MemorySegment info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, codepoint, width.address(), height.address(), xoff.address(), yoff.address()));
    }

    /// Invokes `stbtt_MakeCodepointBitmap`.
    /// ```
    /// void stbtt_MakeCodepointBitmap(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmap(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint) {
        org.lwjgl.stb.STBTruetype.nstbtt_MakeCodepointBitmap(info.address(), output.address(), out_w, out_h, out_stride, scale_x, scale_y, codepoint);
    }

    /// Invokes `stbtt_MakeCodepointBitmapSubpixel`.
    /// ```
    /// void stbtt_MakeCodepointBitmapSubpixel(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmapSubpixel(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint) {
        org.lwjgl.stb.STBTruetype.nstbtt_MakeCodepointBitmapSubpixel(info.address(), output.address(), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
    }

    /// Invokes `stbtt_MakeCodepointBitmapSubpixelPrefilter`.
    /// ```
    /// void stbtt_MakeCodepointBitmapSubpixelPrefilter(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float* sub_x, float* sub_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NonNull MemorySegment sub_x, @NonNull MemorySegment sub_y, int codepoint) {
        org.lwjgl.stb.STBTruetype.nstbtt_MakeCodepointBitmapSubpixelPrefilter(info.address(), output.address(), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x.address(), sub_y.address(), codepoint);
    }

    /// Invokes `stbtt_GetCodepointBitmapBox`.
    /// ```
    /// void stbtt_GetCodepointBitmapBox(const stbtt_fontinfo* font, int codepoint, float scale_x, float scale_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetCodepointBitmapBox(@NonNull MemorySegment font, int codepoint, float scale_x, float scale_y, @NonNull MemorySegment ix0, @NonNull MemorySegment iy0, @NonNull MemorySegment ix1, @NonNull MemorySegment iy1) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointBitmapBox(font.address(), codepoint, scale_x, scale_y, ix0.address(), iy0.address(), ix1.address(), iy1.address());
    }

    /// Invokes `stbtt_GetCodepointBitmapBoxSubpixel`.
    /// ```
    /// void stbtt_GetCodepointBitmapBoxSubpixel(const stbtt_fontinfo* font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetCodepointBitmapBoxSubpixel(@NonNull MemorySegment font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @NonNull MemorySegment ix0, @NonNull MemorySegment iy0, @NonNull MemorySegment ix1, @NonNull MemorySegment iy1) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointBitmapBoxSubpixel(font.address(), codepoint, scale_x, scale_y, shift_x, shift_y, ix0.address(), iy0.address(), ix1.address(), iy1.address());
    }

    /// Invokes `stbtt_GetGlyphBitmap`.
    /// ```
    /// unsigned char* stbtt_GetGlyphBitmap(const stbtt_fontinfo* info, float scale_x, float scale_y, int glyph, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetGlyphBitmap(@NonNull MemorySegment info, float scale_x, float scale_y, int glyph, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphBitmap(info.address(), scale_x, scale_y, glyph, width.address(), height.address(), xoff.address(), yoff.address()));
    }

    /// Invokes `stbtt_GetGlyphBitmapSubpixel`.
    /// ```
    /// unsigned char* stbtt_GetGlyphBitmapSubpixel(const stbtt_fontinfo* info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetGlyphBitmapSubpixel(@NonNull MemorySegment info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, glyph, width.address(), height.address(), xoff.address(), yoff.address()));
    }

    /// Invokes `stbtt_MakeGlyphBitmap`.
    /// ```
    /// void stbtt_MakeGlyphBitmap(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmap(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph) {
        org.lwjgl.stb.STBTruetype.nstbtt_MakeGlyphBitmap(info.address(), output.address(), out_w, out_h, out_stride, scale_x, scale_y, glyph);
    }

    /// Invokes `stbtt_MakeGlyphBitmapSubpixel`.
    /// ```
    /// void stbtt_MakeGlyphBitmapSubpixel(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmapSubpixel(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph) {
        org.lwjgl.stb.STBTruetype.nstbtt_MakeGlyphBitmapSubpixel(info.address(), output.address(), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
    }

    /// Invokes `stbtt_MakeGlyphBitmapSubpixelPrefilter`.
    /// ```
    /// void stbtt_MakeGlyphBitmapSubpixelPrefilter(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float* sub_x, float* sub_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NonNull MemorySegment sub_x, @NonNull MemorySegment sub_y, int glyph) {
        org.lwjgl.stb.STBTruetype.nstbtt_MakeGlyphBitmapSubpixelPrefilter(info.address(), output.address(), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x.address(), sub_y.address(), glyph);
    }

    /// Invokes `stbtt_GetGlyphBitmapBox`.
    /// ```
    /// void stbtt_GetGlyphBitmapBox(const stbtt_fontinfo* font, int glyph, float scale_x, float scale_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetGlyphBitmapBox(@NonNull MemorySegment font, int glyph, float scale_x, float scale_y, @NonNull MemorySegment ix0, @NonNull MemorySegment iy0, @NonNull MemorySegment ix1, @NonNull MemorySegment iy1) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphBitmapBox(font.address(), glyph, scale_x, scale_y, ix0.address(), iy0.address(), ix1.address(), iy1.address());
    }

    /// Invokes `stbtt_GetGlyphBitmapBoxSubpixel`.
    /// ```
    /// void stbtt_GetGlyphBitmapBoxSubpixel(const stbtt_fontinfo* font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetGlyphBitmapBoxSubpixel(@NonNull MemorySegment font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @NonNull MemorySegment ix0, @NonNull MemorySegment iy0, @NonNull MemorySegment ix1, @NonNull MemorySegment iy1) {
        org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphBitmapBoxSubpixel(font.address(), glyph, scale_x, scale_y, shift_x, shift_y, ix0.address(), iy0.address(), ix1.address(), iy1.address());
    }

    /// Invokes `stbtt_Rasterize`.
    /// ```
    /// void stbtt_Rasterize(stbtt__bitmap* result, float flatness_in_pixels, stbtt_vertex* vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, void* userdata);
    /// ```
    public static void stbtt_Rasterize(@NonNull MemorySegment result, float flatness_in_pixels, @NonNull MemorySegment vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, @NonNull MemorySegment userdata) {
        org.lwjgl.stb.STBTruetype.nstbtt_Rasterize(result.address(), flatness_in_pixels, vertices.address(), num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, userdata.address());
    }

    /// Invokes `stbtt_FreeSDF`.
    /// ```
    /// void stbtt_FreeSDF(unsigned char* bitmap, void* userdata);
    /// ```
    public static void stbtt_FreeSDF(@NonNull MemorySegment bitmap, @NonNull MemorySegment userdata) {
        org.lwjgl.stb.STBTruetype.nstbtt_FreeSDF(bitmap.address(), userdata.address());
    }

    /// Invokes `stbtt_GetGlyphSDF`.
    /// ```
    /// unsigned char* stbtt_GetGlyphSDF(const stbtt_fontinfo* info, float scale, int glyph, int padding, unsigned char onedge_value, float pixel_dist_scale, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetGlyphSDF(@NonNull MemorySegment info, float scale, int glyph, int padding, byte onedge_value, float pixel_dist_scale, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBTruetype.nstbtt_GetGlyphSDF(info.address(), scale, glyph, padding, onedge_value, pixel_dist_scale, width.address(), height.address(), xoff.address(), yoff.address()));
    }

    /// Invokes `stbtt_GetCodepointSDF`.
    /// ```
    /// unsigned char* stbtt_GetCodepointSDF(const stbtt_fontinfo* info, float scale, int codepoint, int padding, unsigned char onedge_value, float pixel_dist_scale, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetCodepointSDF(@NonNull MemorySegment info, float scale, int codepoint, int padding, byte onedge_value, float pixel_dist_scale, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBTruetype.nstbtt_GetCodepointSDF(info.address(), scale, codepoint, padding, onedge_value, pixel_dist_scale, width.address(), height.address(), xoff.address(), yoff.address()));
    }

    /// Invokes `stbtt_FindMatchingFont`.
    /// ```
    /// int stbtt_FindMatchingFont(const unsigned char* fontdata, const char* name, int flags);
    /// ```
    public static int stbtt_FindMatchingFont(@NonNull MemorySegment fontdata, @NonNull MemorySegment name, int flags) {
        return org.lwjgl.stb.STBTruetype.nstbtt_FindMatchingFont(fontdata.address(), name.address(), flags);
    }

    /// Invokes `stbtt_CompareUTF8toUTF16_bigendian`.
    /// ```
    /// (int) STBbool stbtt_CompareUTF8toUTF16_bigendian(const char* s1, int len1, const char* s2, int len2);
    /// ```
    public static boolean stbtt_CompareUTF8toUTF16_bigendian(@NonNull MemorySegment s1, int len1, @NonNull MemorySegment s2, int len2) {
        return org.lwjgl.stb.STBTruetype.nstbtt_CompareUTF8toUTF16_bigendian(s1.address(), len1, s2.address(), len2) != 0;
    }

    /// Invokes `stbtt_GetFontNameString`.
    /// ```
    /// const char* stbtt_GetFontNameString(const stbtt_fontinfo* font, int* length, int platformID, int encodingID, int languageID, int nameID);
    /// ```
    public static @NonNull MemorySegment stbtt_GetFontNameString(@NonNull MemorySegment font, @NonNull MemorySegment length, int platformID, int encodingID, int languageID, int nameID) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBTruetype.nstbtt_GetFontNameString(font.address(), length.address(), platformID, encodingID, languageID, nameID));
    }

    //@formatter:on

    private STBTrueType() {
    }

    /**
     * <h4>C Macro Definition</h4>
     * <pre><code>
     * #define STBTT_POINT_SIZE(x)   (-(x))
     * </code></pre>
     *
     * @param x the parameter
     * @return {@code -x}
     */
    public static float STBTT_POINT_SIZE(float x) {
        return -x;
    }
}
