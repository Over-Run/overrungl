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

package overrungl.stb;

import overrungl.internal.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

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
    //region ---[BEGIN GENERATOR BEGIN]---
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
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbtt_BakeFontBitmap`.
        public static final MethodHandle MH_stbtt_BakeFontBitmap = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetBakedQuad`.
        public static final MethodHandle MH_stbtt_GetBakedQuad = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetScaledFontVMetrics`.
        public static final MethodHandle MH_stbtt_GetScaledFontVMetrics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackBegin`.
        public static final MethodHandle MH_stbtt_PackBegin = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackEnd`.
        public static final MethodHandle MH_stbtt_PackEnd = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackFontRange`.
        public static final MethodHandle MH_stbtt_PackFontRange = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackFontRanges`.
        public static final MethodHandle MH_stbtt_PackFontRanges = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackSetOversampling`.
        public static final MethodHandle MH_stbtt_PackSetOversampling = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackSetSkipMissingCodepoints`.
        public static final MethodHandle MH_stbtt_PackSetSkipMissingCodepoints = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetPackedQuad`.
        public static final MethodHandle MH_stbtt_GetPackedQuad = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackFontRangesGatherRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesGatherRects = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackFontRangesPackRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesPackRects = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackFontRangesRenderIntoRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesRenderIntoRects = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetNumberOfFonts`.
        public static final MethodHandle MH_stbtt_GetNumberOfFonts = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontOffsetForIndex`.
        public static final MethodHandle MH_stbtt_GetFontOffsetForIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_InitFont`.
        public static final MethodHandle MH_stbtt_InitFont = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_FindGlyphIndex`.
        public static final MethodHandle MH_stbtt_FindGlyphIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_ScaleForPixelHeight`.
        public static final MethodHandle MH_stbtt_ScaleForPixelHeight = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbtt_ScaleForMappingEmToPixels`.
        public static final MethodHandle MH_stbtt_ScaleForMappingEmToPixels = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbtt_GetFontVMetrics`.
        public static final MethodHandle MH_stbtt_GetFontVMetrics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontVMetricsOS2`.
        public static final MethodHandle MH_stbtt_GetFontVMetricsOS2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontBoundingBox`.
        public static final MethodHandle MH_stbtt_GetFontBoundingBox = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointHMetrics`.
        public static final MethodHandle MH_stbtt_GetCodepointHMetrics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointKernAdvance`.
        public static final MethodHandle MH_stbtt_GetCodepointKernAdvance = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointBox`.
        public static final MethodHandle MH_stbtt_GetCodepointBox = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphHMetrics`.
        public static final MethodHandle MH_stbtt_GetGlyphHMetrics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphKernAdvance`.
        public static final MethodHandle MH_stbtt_GetGlyphKernAdvance = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetGlyphBox`.
        public static final MethodHandle MH_stbtt_GetGlyphBox = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetKerningTableLength`.
        public static final MethodHandle MH_stbtt_GetKerningTableLength = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetKerningTable`.
        public static final MethodHandle MH_stbtt_GetKerningTable = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_IsGlyphEmpty`.
        public static final MethodHandle MH_stbtt_IsGlyphEmpty = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointShape`.
        public static final MethodHandle MH_stbtt_GetCodepointShape = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphShape`.
        public static final MethodHandle MH_stbtt_GetGlyphShape = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeShape`.
        public static final MethodHandle MH_stbtt_FreeShape = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FindSVGDoc`.
        public static final MethodHandle MH_stbtt_FindSVGDoc = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointSVG`.
        public static final MethodHandle MH_stbtt_GetCodepointSVG = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphSVG`.
        public static final MethodHandle MH_stbtt_GetGlyphSVG = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeBitmap`.
        public static final MethodHandle MH_stbtt_FreeBitmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmap`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmap = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapSubpixel = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_MakeCodepointBitmap`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeCodepointBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmapSubpixel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeCodepointBitmapSubpixelPrefilter`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmapSubpixelPrefilter = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointBitmapBox`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapBox = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmapBoxSubpixel`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapBoxSubpixel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmap`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmap = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapSubpixel = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_MakeGlyphBitmap`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeGlyphBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmapSubpixel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeGlyphBitmapSubpixelPrefilter`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmapSubpixelPrefilter = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetGlyphBitmapBox`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapBox = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmapBoxSubpixel`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapBoxSubpixel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_Rasterize`.
        public static final MethodHandle MH_stbtt_Rasterize = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeSDF`.
        public static final MethodHandle MH_stbtt_FreeSDF = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphSDF`.
        public static final MethodHandle MH_stbtt_GetGlyphSDF = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointSDF`.
        public static final MethodHandle MH_stbtt_GetCodepointSDF = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FindMatchingFont`.
        public static final MethodHandle MH_stbtt_FindMatchingFont = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_CompareUTF8toUTF16_bigendian`.
        public static final MethodHandle MH_stbtt_CompareUTF8toUTF16_bigendian = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetFontNameString`.
        public static final MethodHandle MH_stbtt_GetFontNameString = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The function address of `stbtt_BakeFontBitmap`.
        public final MemorySegment PFN_stbtt_BakeFontBitmap;
        /// The function address of `stbtt_GetBakedQuad`.
        public final MemorySegment PFN_stbtt_GetBakedQuad;
        /// The function address of `stbtt_GetScaledFontVMetrics`.
        public final MemorySegment PFN_stbtt_GetScaledFontVMetrics;
        /// The function address of `stbtt_PackBegin`.
        public final MemorySegment PFN_stbtt_PackBegin;
        /// The function address of `stbtt_PackEnd`.
        public final MemorySegment PFN_stbtt_PackEnd;
        /// The function address of `stbtt_PackFontRange`.
        public final MemorySegment PFN_stbtt_PackFontRange;
        /// The function address of `stbtt_PackFontRanges`.
        public final MemorySegment PFN_stbtt_PackFontRanges;
        /// The function address of `stbtt_PackSetOversampling`.
        public final MemorySegment PFN_stbtt_PackSetOversampling;
        /// The function address of `stbtt_PackSetSkipMissingCodepoints`.
        public final MemorySegment PFN_stbtt_PackSetSkipMissingCodepoints;
        /// The function address of `stbtt_GetPackedQuad`.
        public final MemorySegment PFN_stbtt_GetPackedQuad;
        /// The function address of `stbtt_PackFontRangesGatherRects`.
        public final MemorySegment PFN_stbtt_PackFontRangesGatherRects;
        /// The function address of `stbtt_PackFontRangesPackRects`.
        public final MemorySegment PFN_stbtt_PackFontRangesPackRects;
        /// The function address of `stbtt_PackFontRangesRenderIntoRects`.
        public final MemorySegment PFN_stbtt_PackFontRangesRenderIntoRects;
        /// The function address of `stbtt_GetNumberOfFonts`.
        public final MemorySegment PFN_stbtt_GetNumberOfFonts;
        /// The function address of `stbtt_GetFontOffsetForIndex`.
        public final MemorySegment PFN_stbtt_GetFontOffsetForIndex;
        /// The function address of `stbtt_InitFont`.
        public final MemorySegment PFN_stbtt_InitFont;
        /// The function address of `stbtt_FindGlyphIndex`.
        public final MemorySegment PFN_stbtt_FindGlyphIndex;
        /// The function address of `stbtt_ScaleForPixelHeight`.
        public final MemorySegment PFN_stbtt_ScaleForPixelHeight;
        /// The function address of `stbtt_ScaleForMappingEmToPixels`.
        public final MemorySegment PFN_stbtt_ScaleForMappingEmToPixels;
        /// The function address of `stbtt_GetFontVMetrics`.
        public final MemorySegment PFN_stbtt_GetFontVMetrics;
        /// The function address of `stbtt_GetFontVMetricsOS2`.
        public final MemorySegment PFN_stbtt_GetFontVMetricsOS2;
        /// The function address of `stbtt_GetFontBoundingBox`.
        public final MemorySegment PFN_stbtt_GetFontBoundingBox;
        /// The function address of `stbtt_GetCodepointHMetrics`.
        public final MemorySegment PFN_stbtt_GetCodepointHMetrics;
        /// The function address of `stbtt_GetCodepointKernAdvance`.
        public final MemorySegment PFN_stbtt_GetCodepointKernAdvance;
        /// The function address of `stbtt_GetCodepointBox`.
        public final MemorySegment PFN_stbtt_GetCodepointBox;
        /// The function address of `stbtt_GetGlyphHMetrics`.
        public final MemorySegment PFN_stbtt_GetGlyphHMetrics;
        /// The function address of `stbtt_GetGlyphKernAdvance`.
        public final MemorySegment PFN_stbtt_GetGlyphKernAdvance;
        /// The function address of `stbtt_GetGlyphBox`.
        public final MemorySegment PFN_stbtt_GetGlyphBox;
        /// The function address of `stbtt_GetKerningTableLength`.
        public final MemorySegment PFN_stbtt_GetKerningTableLength;
        /// The function address of `stbtt_GetKerningTable`.
        public final MemorySegment PFN_stbtt_GetKerningTable;
        /// The function address of `stbtt_IsGlyphEmpty`.
        public final MemorySegment PFN_stbtt_IsGlyphEmpty;
        /// The function address of `stbtt_GetCodepointShape`.
        public final MemorySegment PFN_stbtt_GetCodepointShape;
        /// The function address of `stbtt_GetGlyphShape`.
        public final MemorySegment PFN_stbtt_GetGlyphShape;
        /// The function address of `stbtt_FreeShape`.
        public final MemorySegment PFN_stbtt_FreeShape;
        /// The function address of `stbtt_FindSVGDoc`.
        public final MemorySegment PFN_stbtt_FindSVGDoc;
        /// The function address of `stbtt_GetCodepointSVG`.
        public final MemorySegment PFN_stbtt_GetCodepointSVG;
        /// The function address of `stbtt_GetGlyphSVG`.
        public final MemorySegment PFN_stbtt_GetGlyphSVG;
        /// The function address of `stbtt_FreeBitmap`.
        public final MemorySegment PFN_stbtt_FreeBitmap;
        /// The function address of `stbtt_GetCodepointBitmap`.
        public final MemorySegment PFN_stbtt_GetCodepointBitmap;
        /// The function address of `stbtt_GetCodepointBitmapSubpixel`.
        public final MemorySegment PFN_stbtt_GetCodepointBitmapSubpixel;
        /// The function address of `stbtt_MakeCodepointBitmap`.
        public final MemorySegment PFN_stbtt_MakeCodepointBitmap;
        /// The function address of `stbtt_MakeCodepointBitmapSubpixel`.
        public final MemorySegment PFN_stbtt_MakeCodepointBitmapSubpixel;
        /// The function address of `stbtt_MakeCodepointBitmapSubpixelPrefilter`.
        public final MemorySegment PFN_stbtt_MakeCodepointBitmapSubpixelPrefilter;
        /// The function address of `stbtt_GetCodepointBitmapBox`.
        public final MemorySegment PFN_stbtt_GetCodepointBitmapBox;
        /// The function address of `stbtt_GetCodepointBitmapBoxSubpixel`.
        public final MemorySegment PFN_stbtt_GetCodepointBitmapBoxSubpixel;
        /// The function address of `stbtt_GetGlyphBitmap`.
        public final MemorySegment PFN_stbtt_GetGlyphBitmap;
        /// The function address of `stbtt_GetGlyphBitmapSubpixel`.
        public final MemorySegment PFN_stbtt_GetGlyphBitmapSubpixel;
        /// The function address of `stbtt_MakeGlyphBitmap`.
        public final MemorySegment PFN_stbtt_MakeGlyphBitmap;
        /// The function address of `stbtt_MakeGlyphBitmapSubpixel`.
        public final MemorySegment PFN_stbtt_MakeGlyphBitmapSubpixel;
        /// The function address of `stbtt_MakeGlyphBitmapSubpixelPrefilter`.
        public final MemorySegment PFN_stbtt_MakeGlyphBitmapSubpixelPrefilter;
        /// The function address of `stbtt_GetGlyphBitmapBox`.
        public final MemorySegment PFN_stbtt_GetGlyphBitmapBox;
        /// The function address of `stbtt_GetGlyphBitmapBoxSubpixel`.
        public final MemorySegment PFN_stbtt_GetGlyphBitmapBoxSubpixel;
        /// The function address of `stbtt_Rasterize`.
        public final MemorySegment PFN_stbtt_Rasterize;
        /// The function address of `stbtt_FreeSDF`.
        public final MemorySegment PFN_stbtt_FreeSDF;
        /// The function address of `stbtt_GetGlyphSDF`.
        public final MemorySegment PFN_stbtt_GetGlyphSDF;
        /// The function address of `stbtt_GetCodepointSDF`.
        public final MemorySegment PFN_stbtt_GetCodepointSDF;
        /// The function address of `stbtt_FindMatchingFont`.
        public final MemorySegment PFN_stbtt_FindMatchingFont;
        /// The function address of `stbtt_CompareUTF8toUTF16_bigendian`.
        public final MemorySegment PFN_stbtt_CompareUTF8toUTF16_bigendian;
        /// The function address of `stbtt_GetFontNameString`.
        public final MemorySegment PFN_stbtt_GetFontNameString;
        private Handles() {
            PFN_stbtt_BakeFontBitmap = STBInternal.lookup().findOrThrow("stbtt_BakeFontBitmap");
            PFN_stbtt_GetBakedQuad = STBInternal.lookup().findOrThrow("stbtt_GetBakedQuad");
            PFN_stbtt_GetScaledFontVMetrics = STBInternal.lookup().findOrThrow("stbtt_GetScaledFontVMetrics");
            PFN_stbtt_PackBegin = STBInternal.lookup().findOrThrow("stbtt_PackBegin");
            PFN_stbtt_PackEnd = STBInternal.lookup().findOrThrow("stbtt_PackEnd");
            PFN_stbtt_PackFontRange = STBInternal.lookup().findOrThrow("stbtt_PackFontRange");
            PFN_stbtt_PackFontRanges = STBInternal.lookup().findOrThrow("stbtt_PackFontRanges");
            PFN_stbtt_PackSetOversampling = STBInternal.lookup().findOrThrow("stbtt_PackSetOversampling");
            PFN_stbtt_PackSetSkipMissingCodepoints = STBInternal.lookup().findOrThrow("stbtt_PackSetSkipMissingCodepoints");
            PFN_stbtt_GetPackedQuad = STBInternal.lookup().findOrThrow("stbtt_GetPackedQuad");
            PFN_stbtt_PackFontRangesGatherRects = STBInternal.lookup().findOrThrow("stbtt_PackFontRangesGatherRects");
            PFN_stbtt_PackFontRangesPackRects = STBInternal.lookup().findOrThrow("stbtt_PackFontRangesPackRects");
            PFN_stbtt_PackFontRangesRenderIntoRects = STBInternal.lookup().findOrThrow("stbtt_PackFontRangesRenderIntoRects");
            PFN_stbtt_GetNumberOfFonts = STBInternal.lookup().findOrThrow("stbtt_GetNumberOfFonts");
            PFN_stbtt_GetFontOffsetForIndex = STBInternal.lookup().findOrThrow("stbtt_GetFontOffsetForIndex");
            PFN_stbtt_InitFont = STBInternal.lookup().findOrThrow("stbtt_InitFont");
            PFN_stbtt_FindGlyphIndex = STBInternal.lookup().findOrThrow("stbtt_FindGlyphIndex");
            PFN_stbtt_ScaleForPixelHeight = STBInternal.lookup().findOrThrow("stbtt_ScaleForPixelHeight");
            PFN_stbtt_ScaleForMappingEmToPixels = STBInternal.lookup().findOrThrow("stbtt_ScaleForMappingEmToPixels");
            PFN_stbtt_GetFontVMetrics = STBInternal.lookup().findOrThrow("stbtt_GetFontVMetrics");
            PFN_stbtt_GetFontVMetricsOS2 = STBInternal.lookup().findOrThrow("stbtt_GetFontVMetricsOS2");
            PFN_stbtt_GetFontBoundingBox = STBInternal.lookup().findOrThrow("stbtt_GetFontBoundingBox");
            PFN_stbtt_GetCodepointHMetrics = STBInternal.lookup().findOrThrow("stbtt_GetCodepointHMetrics");
            PFN_stbtt_GetCodepointKernAdvance = STBInternal.lookup().findOrThrow("stbtt_GetCodepointKernAdvance");
            PFN_stbtt_GetCodepointBox = STBInternal.lookup().findOrThrow("stbtt_GetCodepointBox");
            PFN_stbtt_GetGlyphHMetrics = STBInternal.lookup().findOrThrow("stbtt_GetGlyphHMetrics");
            PFN_stbtt_GetGlyphKernAdvance = STBInternal.lookup().findOrThrow("stbtt_GetGlyphKernAdvance");
            PFN_stbtt_GetGlyphBox = STBInternal.lookup().findOrThrow("stbtt_GetGlyphBox");
            PFN_stbtt_GetKerningTableLength = STBInternal.lookup().findOrThrow("stbtt_GetKerningTableLength");
            PFN_stbtt_GetKerningTable = STBInternal.lookup().findOrThrow("stbtt_GetKerningTable");
            PFN_stbtt_IsGlyphEmpty = STBInternal.lookup().findOrThrow("stbtt_IsGlyphEmpty");
            PFN_stbtt_GetCodepointShape = STBInternal.lookup().findOrThrow("stbtt_GetCodepointShape");
            PFN_stbtt_GetGlyphShape = STBInternal.lookup().findOrThrow("stbtt_GetGlyphShape");
            PFN_stbtt_FreeShape = STBInternal.lookup().findOrThrow("stbtt_FreeShape");
            PFN_stbtt_FindSVGDoc = STBInternal.lookup().findOrThrow("stbtt_FindSVGDoc");
            PFN_stbtt_GetCodepointSVG = STBInternal.lookup().findOrThrow("stbtt_GetCodepointSVG");
            PFN_stbtt_GetGlyphSVG = STBInternal.lookup().findOrThrow("stbtt_GetGlyphSVG");
            PFN_stbtt_FreeBitmap = STBInternal.lookup().findOrThrow("stbtt_FreeBitmap");
            PFN_stbtt_GetCodepointBitmap = STBInternal.lookup().findOrThrow("stbtt_GetCodepointBitmap");
            PFN_stbtt_GetCodepointBitmapSubpixel = STBInternal.lookup().findOrThrow("stbtt_GetCodepointBitmapSubpixel");
            PFN_stbtt_MakeCodepointBitmap = STBInternal.lookup().findOrThrow("stbtt_MakeCodepointBitmap");
            PFN_stbtt_MakeCodepointBitmapSubpixel = STBInternal.lookup().findOrThrow("stbtt_MakeCodepointBitmapSubpixel");
            PFN_stbtt_MakeCodepointBitmapSubpixelPrefilter = STBInternal.lookup().findOrThrow("stbtt_MakeCodepointBitmapSubpixelPrefilter");
            PFN_stbtt_GetCodepointBitmapBox = STBInternal.lookup().findOrThrow("stbtt_GetCodepointBitmapBox");
            PFN_stbtt_GetCodepointBitmapBoxSubpixel = STBInternal.lookup().findOrThrow("stbtt_GetCodepointBitmapBoxSubpixel");
            PFN_stbtt_GetGlyphBitmap = STBInternal.lookup().findOrThrow("stbtt_GetGlyphBitmap");
            PFN_stbtt_GetGlyphBitmapSubpixel = STBInternal.lookup().findOrThrow("stbtt_GetGlyphBitmapSubpixel");
            PFN_stbtt_MakeGlyphBitmap = STBInternal.lookup().findOrThrow("stbtt_MakeGlyphBitmap");
            PFN_stbtt_MakeGlyphBitmapSubpixel = STBInternal.lookup().findOrThrow("stbtt_MakeGlyphBitmapSubpixel");
            PFN_stbtt_MakeGlyphBitmapSubpixelPrefilter = STBInternal.lookup().findOrThrow("stbtt_MakeGlyphBitmapSubpixelPrefilter");
            PFN_stbtt_GetGlyphBitmapBox = STBInternal.lookup().findOrThrow("stbtt_GetGlyphBitmapBox");
            PFN_stbtt_GetGlyphBitmapBoxSubpixel = STBInternal.lookup().findOrThrow("stbtt_GetGlyphBitmapBoxSubpixel");
            PFN_stbtt_Rasterize = STBInternal.lookup().findOrThrow("stbtt_Rasterize");
            PFN_stbtt_FreeSDF = STBInternal.lookup().findOrThrow("stbtt_FreeSDF");
            PFN_stbtt_GetGlyphSDF = STBInternal.lookup().findOrThrow("stbtt_GetGlyphSDF");
            PFN_stbtt_GetCodepointSDF = STBInternal.lookup().findOrThrow("stbtt_GetCodepointSDF");
            PFN_stbtt_FindMatchingFont = STBInternal.lookup().findOrThrow("stbtt_FindMatchingFont");
            PFN_stbtt_CompareUTF8toUTF16_bigendian = STBInternal.lookup().findOrThrow("stbtt_CompareUTF8toUTF16_bigendian");
            PFN_stbtt_GetFontNameString = STBInternal.lookup().findOrThrow("stbtt_GetFontNameString");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    /// Signature:
    /// ```
    /// int stbtt_BakeFontBitmap(const unsigned char* data, int offset, float pixel_height, unsigned char* pixels, int pw, int ph, int first_char, int num_chars, stbtt_bakedchar* chardata);
    /// ```
    public static int stbtt_BakeFontBitmap(MemorySegment data, int offset, float pixel_height, MemorySegment pixels, int pw, int ph, int first_char, int num_chars, MemorySegment chardata) {
        try {
            return (int) Handles.MH_stbtt_BakeFontBitmap.invokeExact(Handles.get().PFN_stbtt_BakeFontBitmap, data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, chardata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_BakeFontBitmap", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetBakedQuad(const stbtt_bakedchar* chardata, int pw, int ph, int char_index, float* xpos, float* ypos, stbtt_aligned_quad* q, int opengl_fillrule);
    /// ```
    public static void stbtt_GetBakedQuad(MemorySegment chardata, int pw, int ph, int char_index, MemorySegment xpos, MemorySegment ypos, MemorySegment q, int opengl_fillrule) {
        try {
            Handles.MH_stbtt_GetBakedQuad.invokeExact(Handles.get().PFN_stbtt_GetBakedQuad, chardata, pw, ph, char_index, xpos, ypos, q, opengl_fillrule);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetBakedQuad", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetScaledFontVMetrics(const unsigned char* fontdata, int index, float size, float* ascent, float* descent, float* lineGap);
    /// ```
    public static void stbtt_GetScaledFontVMetrics(MemorySegment fontdata, int index, float size, MemorySegment ascent, MemorySegment descent, MemorySegment lineGap) {
        try {
            Handles.MH_stbtt_GetScaledFontVMetrics.invokeExact(Handles.get().PFN_stbtt_GetScaledFontVMetrics, fontdata, index, size, ascent, descent, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetScaledFontVMetrics", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_PackBegin(stbtt_pack_context* spc, unsigned char* pixels, int width, int height, int stride_in_bytes, int padding, void* alloc_context);
    /// ```
    public static boolean stbtt_PackBegin(MemorySegment spc, MemorySegment pixels, int width, int height, int stride_in_bytes, int padding, MemorySegment alloc_context) {
        try {
            return (((int) Handles.MH_stbtt_PackBegin.invokeExact(Handles.get().PFN_stbtt_PackBegin, spc, pixels, width, height, stride_in_bytes, padding, alloc_context)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackBegin", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_PackEnd(stbtt_pack_context* spc);
    /// ```
    public static void stbtt_PackEnd(MemorySegment spc) {
        try {
            Handles.MH_stbtt_PackEnd.invokeExact(Handles.get().PFN_stbtt_PackEnd, spc);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackEnd", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_PackFontRange(stbtt_pack_context* spc, const unsigned char* fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, stbtt_packedchar* chardata_for_range);
    /// ```
    public static boolean stbtt_PackFontRange(MemorySegment spc, MemorySegment fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, MemorySegment chardata_for_range) {
        try {
            return (((int) Handles.MH_stbtt_PackFontRange.invokeExact(Handles.get().PFN_stbtt_PackFontRange, spc, fontdata, font_index, font_size, first_unicode_char_in_range, num_chars_in_range, chardata_for_range)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRange", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_PackFontRanges(stbtt_pack_context* spc, const unsigned char* fontdata, int font_index, stbtt_pack_range* ranges, int num_ranges);
    /// ```
    public static int stbtt_PackFontRanges(MemorySegment spc, MemorySegment fontdata, int font_index, MemorySegment ranges, int num_ranges) {
        try {
            return (int) Handles.MH_stbtt_PackFontRanges.invokeExact(Handles.get().PFN_stbtt_PackFontRanges, spc, fontdata, font_index, ranges, num_ranges);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRanges", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_PackSetOversampling(stbtt_pack_context* spc, unsigned int h_oversample, unsigned int v_oversample);
    /// ```
    public static void stbtt_PackSetOversampling(MemorySegment spc, int h_oversample, int v_oversample) {
        try {
            Handles.MH_stbtt_PackSetOversampling.invokeExact(Handles.get().PFN_stbtt_PackSetOversampling, spc, h_oversample, v_oversample);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackSetOversampling", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_PackSetSkipMissingCodepoints(stbtt_pack_context* spc, int skip);
    /// ```
    public static void stbtt_PackSetSkipMissingCodepoints(MemorySegment spc, int skip) {
        try {
            Handles.MH_stbtt_PackSetSkipMissingCodepoints.invokeExact(Handles.get().PFN_stbtt_PackSetSkipMissingCodepoints, spc, skip);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackSetSkipMissingCodepoints", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetPackedQuad(const stbtt_packedchar* chardata, int pw, int ph, int char_index, float* xpos, float* ypos, stbtt_aligned_quad* q, int align_to_integer);
    /// ```
    public static void stbtt_GetPackedQuad(MemorySegment chardata, int pw, int ph, int char_index, MemorySegment xpos, MemorySegment ypos, MemorySegment q, int align_to_integer) {
        try {
            Handles.MH_stbtt_GetPackedQuad.invokeExact(Handles.get().PFN_stbtt_GetPackedQuad, chardata, pw, ph, char_index, xpos, ypos, q, align_to_integer);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetPackedQuad", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_PackFontRangesGatherRects(stbtt_pack_context* spc, const stbtt_fontinfo* info, stbtt_pack_range* ranges, int num_ranges, stbrp_rect* rects);
    /// ```
    public static int stbtt_PackFontRangesGatherRects(MemorySegment spc, MemorySegment info, MemorySegment ranges, int num_ranges, MemorySegment rects) {
        try {
            return (int) Handles.MH_stbtt_PackFontRangesGatherRects.invokeExact(Handles.get().PFN_stbtt_PackFontRangesGatherRects, spc, info, ranges, num_ranges, rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesGatherRects", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_PackFontRangesPackRects(stbtt_pack_context* spc, stbrp_rect* rects, int num_rects);
    /// ```
    public static void stbtt_PackFontRangesPackRects(MemorySegment spc, MemorySegment rects, int num_rects) {
        try {
            Handles.MH_stbtt_PackFontRangesPackRects.invokeExact(Handles.get().PFN_stbtt_PackFontRangesPackRects, spc, rects, num_rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesPackRects", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_PackFontRangesRenderIntoRects(stbtt_pack_context* spc, const stbtt_fontinfo* info, stbtt_pack_range* ranges, int num_ranges, stbrp_rect* rects);
    /// ```
    public static int stbtt_PackFontRangesRenderIntoRects(MemorySegment spc, MemorySegment info, MemorySegment ranges, int num_ranges, MemorySegment rects) {
        try {
            return (int) Handles.MH_stbtt_PackFontRangesRenderIntoRects.invokeExact(Handles.get().PFN_stbtt_PackFontRangesRenderIntoRects, spc, info, ranges, num_ranges, rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesRenderIntoRects", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetNumberOfFonts(const unsigned char* data);
    /// ```
    public static int stbtt_GetNumberOfFonts(MemorySegment data) {
        try {
            return (int) Handles.MH_stbtt_GetNumberOfFonts.invokeExact(Handles.get().PFN_stbtt_GetNumberOfFonts, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetNumberOfFonts", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetFontOffsetForIndex(const unsigned char* data, int index);
    /// ```
    public static int stbtt_GetFontOffsetForIndex(MemorySegment data, int index) {
        try {
            return (int) Handles.MH_stbtt_GetFontOffsetForIndex.invokeExact(Handles.get().PFN_stbtt_GetFontOffsetForIndex, data, index);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontOffsetForIndex", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_InitFont(stbtt_fontinfo* info, const unsigned char* data, int offset);
    /// ```
    public static boolean stbtt_InitFont(MemorySegment info, MemorySegment data, int offset) {
        try {
            return (((int) Handles.MH_stbtt_InitFont.invokeExact(Handles.get().PFN_stbtt_InitFont, info, data, offset)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_InitFont", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_FindGlyphIndex(const stbtt_fontinfo* info, int unicode_codepoint);
    /// ```
    public static int stbtt_FindGlyphIndex(MemorySegment info, int unicode_codepoint) {
        try {
            return (int) Handles.MH_stbtt_FindGlyphIndex.invokeExact(Handles.get().PFN_stbtt_FindGlyphIndex, info, unicode_codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindGlyphIndex", e); }
    }

    /// Signature:
    /// ```
    /// float stbtt_ScaleForPixelHeight(const stbtt_fontinfo* info, float pixels);
    /// ```
    public static float stbtt_ScaleForPixelHeight(MemorySegment info, float pixels) {
        try {
            return (float) Handles.MH_stbtt_ScaleForPixelHeight.invokeExact(Handles.get().PFN_stbtt_ScaleForPixelHeight, info, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_ScaleForPixelHeight", e); }
    }

    /// Signature:
    /// ```
    /// float stbtt_ScaleForMappingEmToPixels(const stbtt_fontinfo* info, float pixels);
    /// ```
    public static float stbtt_ScaleForMappingEmToPixels(MemorySegment info, float pixels) {
        try {
            return (float) Handles.MH_stbtt_ScaleForMappingEmToPixels.invokeExact(Handles.get().PFN_stbtt_ScaleForMappingEmToPixels, info, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_ScaleForMappingEmToPixels", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetFontVMetrics(const stbtt_fontinfo* info, int* ascent, int* descent, int* lineGap);
    /// ```
    public static void stbtt_GetFontVMetrics(MemorySegment info, MemorySegment ascent, MemorySegment descent, MemorySegment lineGap) {
        try {
            Handles.MH_stbtt_GetFontVMetrics.invokeExact(Handles.get().PFN_stbtt_GetFontVMetrics, info, ascent, descent, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetrics", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetFontVMetricsOS2(const stbtt_fontinfo* info, int* typoAscent, int* typoDescent, int* typoLineGap);
    /// ```
    public static boolean stbtt_GetFontVMetricsOS2(MemorySegment info, MemorySegment typoAscent, MemorySegment typoDescent, MemorySegment typoLineGap) {
        try {
            return (((int) Handles.MH_stbtt_GetFontVMetricsOS2.invokeExact(Handles.get().PFN_stbtt_GetFontVMetricsOS2, info, typoAscent, typoDescent, typoLineGap)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetricsOS2", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetFontBoundingBox(const stbtt_fontinfo* info, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static void stbtt_GetFontBoundingBox(MemorySegment info, MemorySegment x0, MemorySegment y0, MemorySegment x1, MemorySegment y1) {
        try {
            Handles.MH_stbtt_GetFontBoundingBox.invokeExact(Handles.get().PFN_stbtt_GetFontBoundingBox, info, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontBoundingBox", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetCodepointHMetrics(const stbtt_fontinfo* info, int codepoint, int* advanceWidth, int* leftSideBearing);
    /// ```
    public static void stbtt_GetCodepointHMetrics(MemorySegment info, int codepoint, MemorySegment advanceWidth, MemorySegment leftSideBearing) {
        try {
            Handles.MH_stbtt_GetCodepointHMetrics.invokeExact(Handles.get().PFN_stbtt_GetCodepointHMetrics, info, codepoint, advanceWidth, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointHMetrics", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetCodepointKernAdvance(const stbtt_fontinfo* info, int ch1, int ch2);
    /// ```
    public static int stbtt_GetCodepointKernAdvance(MemorySegment info, int ch1, int ch2) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointKernAdvance.invokeExact(Handles.get().PFN_stbtt_GetCodepointKernAdvance, info, ch1, ch2);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointKernAdvance", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetCodepointBox(const stbtt_fontinfo* info, int codepoint, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static int stbtt_GetCodepointBox(MemorySegment info, int codepoint, MemorySegment x0, MemorySegment y0, MemorySegment x1, MemorySegment y1) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointBox.invokeExact(Handles.get().PFN_stbtt_GetCodepointBox, info, codepoint, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBox", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetGlyphHMetrics(const stbtt_fontinfo* info, int glyph_index, int* advanceWidth, int* leftSideBearing);
    /// ```
    public static void stbtt_GetGlyphHMetrics(MemorySegment info, int glyph_index, MemorySegment advanceWidth, MemorySegment leftSideBearing) {
        try {
            Handles.MH_stbtt_GetGlyphHMetrics.invokeExact(Handles.get().PFN_stbtt_GetGlyphHMetrics, info, glyph_index, advanceWidth, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphHMetrics", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetGlyphKernAdvance(const stbtt_fontinfo* info, int glyph1, int glyph2);
    /// ```
    public static int stbtt_GetGlyphKernAdvance(MemorySegment info, int glyph1, int glyph2) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphKernAdvance.invokeExact(Handles.get().PFN_stbtt_GetGlyphKernAdvance, info, glyph1, glyph2);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphKernAdvance", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetGlyphBox(const stbtt_fontinfo* info, int glyph_index, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static int stbtt_GetGlyphBox(MemorySegment info, int glyph_index, MemorySegment x0, MemorySegment y0, MemorySegment x1, MemorySegment y1) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphBox.invokeExact(Handles.get().PFN_stbtt_GetGlyphBox, info, glyph_index, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBox", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetKerningTableLength(const stbtt_fontinfo* info);
    /// ```
    public static int stbtt_GetKerningTableLength(MemorySegment info) {
        try {
            return (int) Handles.MH_stbtt_GetKerningTableLength.invokeExact(Handles.get().PFN_stbtt_GetKerningTableLength, info);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetKerningTableLength", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetKerningTable(const stbtt_fontinfo* info, stbtt_kerningentry* table, int table_length);
    /// ```
    public static int stbtt_GetKerningTable(MemorySegment info, MemorySegment table, int table_length) {
        try {
            return (int) Handles.MH_stbtt_GetKerningTable.invokeExact(Handles.get().PFN_stbtt_GetKerningTable, info, table, table_length);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetKerningTable", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_IsGlyphEmpty(const stbtt_fontinfo* info, int glyph_index);
    /// ```
    public static boolean stbtt_IsGlyphEmpty(MemorySegment info, int glyph_index) {
        try {
            return (((int) Handles.MH_stbtt_IsGlyphEmpty.invokeExact(Handles.get().PFN_stbtt_IsGlyphEmpty, info, glyph_index)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_IsGlyphEmpty", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetCodepointShape(const stbtt_fontinfo* info, int unicode_codepoint, stbtt_vertex** vertices);
    /// ```
    public static int stbtt_GetCodepointShape(MemorySegment info, int unicode_codepoint, MemorySegment vertices) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointShape.invokeExact(Handles.get().PFN_stbtt_GetCodepointShape, info, unicode_codepoint, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointShape", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetGlyphShape(const stbtt_fontinfo* info, int glyph_index, stbtt_vertex** vertices);
    /// ```
    public static int stbtt_GetGlyphShape(MemorySegment info, int glyph_index, MemorySegment vertices) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphShape.invokeExact(Handles.get().PFN_stbtt_GetGlyphShape, info, glyph_index, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphShape", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_FreeShape(const stbtt_fontinfo* info, stbtt_vertex* vertices);
    /// ```
    public static void stbtt_FreeShape(MemorySegment info, MemorySegment vertices) {
        try {
            Handles.MH_stbtt_FreeShape.invokeExact(Handles.get().PFN_stbtt_FreeShape, info, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeShape", e); }
    }

    /// Signature:
    /// ```
    /// unsigned char* stbtt_FindSVGDoc(const stbtt_fontinfo* info, int gl);
    /// ```
    public static MemorySegment stbtt_FindSVGDoc(MemorySegment info, int gl) {
        try {
            return (MemorySegment) Handles.MH_stbtt_FindSVGDoc.invokeExact(Handles.get().PFN_stbtt_FindSVGDoc, info, gl);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindSVGDoc", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetCodepointSVG(const stbtt_fontinfo* info, int unicode_codepoint, const char** svg);
    /// ```
    public static int stbtt_GetCodepointSVG(MemorySegment info, int unicode_codepoint, MemorySegment svg) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointSVG.invokeExact(Handles.get().PFN_stbtt_GetCodepointSVG, info, unicode_codepoint, svg);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSVG", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_GetGlyphSVG(const stbtt_fontinfo* info, int gl, const char** svg);
    /// ```
    public static int stbtt_GetGlyphSVG(MemorySegment info, int gl, MemorySegment svg) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphSVG.invokeExact(Handles.get().PFN_stbtt_GetGlyphSVG, info, gl, svg);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSVG", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_FreeBitmap(unsigned char* bitmap, void* userdata);
    /// ```
    public static void stbtt_FreeBitmap(MemorySegment bitmap, MemorySegment userdata) {
        try {
            Handles.MH_stbtt_FreeBitmap.invokeExact(Handles.get().PFN_stbtt_FreeBitmap, bitmap, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeBitmap", e); }
    }

    /// Signature:
    /// ```
    /// unsigned char* stbtt_GetCodepointBitmap(const stbtt_fontinfo* info, float scale_x, float scale_y, int codepoint, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static MemorySegment stbtt_GetCodepointBitmap(MemorySegment info, float scale_x, float scale_y, int codepoint, MemorySegment width, MemorySegment height, MemorySegment xoff, MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetCodepointBitmap.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmap, info, scale_x, scale_y, codepoint, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmap", e); }
    }

    /// Signature:
    /// ```
    /// unsigned char* stbtt_GetCodepointBitmapSubpixel(const stbtt_fontinfo* info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static MemorySegment stbtt_GetCodepointBitmapSubpixel(MemorySegment info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, MemorySegment width, MemorySegment height, MemorySegment xoff, MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetCodepointBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapSubpixel, info, scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapSubpixel", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_MakeCodepointBitmap(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmap(MemorySegment info, MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmap.invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmap, info, output, out_w, out_h, out_stride, scale_x, scale_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmap", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_MakeCodepointBitmapSubpixel(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmapSubpixel(MemorySegment info, MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmapSubpixel, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixel", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_MakeCodepointBitmapSubpixelPrefilter(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float* sub_x, float* sub_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(MemorySegment info, MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, MemorySegment sub_x, MemorySegment sub_y, int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmapSubpixelPrefilter.invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmapSubpixelPrefilter, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixelPrefilter", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetCodepointBitmapBox(const stbtt_fontinfo* font, int codepoint, float scale_x, float scale_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetCodepointBitmapBox(MemorySegment font, int codepoint, float scale_x, float scale_y, MemorySegment ix0, MemorySegment iy0, MemorySegment ix1, MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetCodepointBitmapBox.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapBox, font, codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBox", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetCodepointBitmapBoxSubpixel(const stbtt_fontinfo* font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetCodepointBitmapBoxSubpixel(MemorySegment font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, MemorySegment ix0, MemorySegment iy0, MemorySegment ix1, MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetCodepointBitmapBoxSubpixel.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapBoxSubpixel, font, codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBoxSubpixel", e); }
    }

    /// Signature:
    /// ```
    /// unsigned char* stbtt_GetGlyphBitmap(const stbtt_fontinfo* info, float scale_x, float scale_y, int glyph, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static MemorySegment stbtt_GetGlyphBitmap(MemorySegment info, float scale_x, float scale_y, int glyph, MemorySegment width, MemorySegment height, MemorySegment xoff, MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetGlyphBitmap.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmap, info, scale_x, scale_y, glyph, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmap", e); }
    }

    /// Signature:
    /// ```
    /// unsigned char* stbtt_GetGlyphBitmapSubpixel(const stbtt_fontinfo* info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static MemorySegment stbtt_GetGlyphBitmapSubpixel(MemorySegment info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, MemorySegment width, MemorySegment height, MemorySegment xoff, MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetGlyphBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapSubpixel, info, scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapSubpixel", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_MakeGlyphBitmap(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmap(MemorySegment info, MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmap.invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmap, info, output, out_w, out_h, out_stride, scale_x, scale_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmap", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_MakeGlyphBitmapSubpixel(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmapSubpixel(MemorySegment info, MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmapSubpixel, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixel", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_MakeGlyphBitmapSubpixelPrefilter(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float* sub_x, float* sub_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(MemorySegment info, MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, MemorySegment sub_x, MemorySegment sub_y, int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmapSubpixelPrefilter.invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmapSubpixelPrefilter, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixelPrefilter", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetGlyphBitmapBox(const stbtt_fontinfo* font, int glyph, float scale_x, float scale_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetGlyphBitmapBox(MemorySegment font, int glyph, float scale_x, float scale_y, MemorySegment ix0, MemorySegment iy0, MemorySegment ix1, MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetGlyphBitmapBox.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapBox, font, glyph, scale_x, scale_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBox", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_GetGlyphBitmapBoxSubpixel(const stbtt_fontinfo* font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetGlyphBitmapBoxSubpixel(MemorySegment font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, MemorySegment ix0, MemorySegment iy0, MemorySegment ix1, MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetGlyphBitmapBoxSubpixel.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapBoxSubpixel, font, glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBoxSubpixel", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_Rasterize(stbtt__bitmap* result, float flatness_in_pixels, stbtt_vertex* vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, void* userdata);
    /// ```
    public static void stbtt_Rasterize(MemorySegment result, float flatness_in_pixels, MemorySegment vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, MemorySegment userdata) {
        try {
            Handles.MH_stbtt_Rasterize.invokeExact(Handles.get().PFN_stbtt_Rasterize, result, flatness_in_pixels, vertices, num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_Rasterize", e); }
    }

    /// Signature:
    /// ```
    /// void stbtt_FreeSDF(unsigned char* bitmap, void* userdata);
    /// ```
    public static void stbtt_FreeSDF(MemorySegment bitmap, MemorySegment userdata) {
        try {
            Handles.MH_stbtt_FreeSDF.invokeExact(Handles.get().PFN_stbtt_FreeSDF, bitmap, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeSDF", e); }
    }

    /// Signature:
    /// ```
    /// unsigned char* stbtt_GetGlyphSDF(const stbtt_fontinfo* info, float scale, int glyph, int padding, unsigned char onedge_value, float pixel_dist_scale, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static MemorySegment stbtt_GetGlyphSDF(MemorySegment info, float scale, int glyph, int padding, byte onedge_value, float pixel_dist_scale, MemorySegment width, MemorySegment height, MemorySegment xoff, MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetGlyphSDF.invokeExact(Handles.get().PFN_stbtt_GetGlyphSDF, info, scale, glyph, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSDF", e); }
    }

    /// Signature:
    /// ```
    /// unsigned char* stbtt_GetCodepointSDF(const stbtt_fontinfo* info, float scale, int codepoint, int padding, unsigned char onedge_value, float pixel_dist_scale, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static MemorySegment stbtt_GetCodepointSDF(MemorySegment info, float scale, int codepoint, int padding, byte onedge_value, float pixel_dist_scale, MemorySegment width, MemorySegment height, MemorySegment xoff, MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetCodepointSDF.invokeExact(Handles.get().PFN_stbtt_GetCodepointSDF, info, scale, codepoint, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSDF", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_FindMatchingFont(const unsigned char* fontdata, const char* name, int flags);
    /// ```
    public static int stbtt_FindMatchingFont(MemorySegment fontdata, MemorySegment name, int flags) {
        try {
            return (int) Handles.MH_stbtt_FindMatchingFont.invokeExact(Handles.get().PFN_stbtt_FindMatchingFont, fontdata, name, flags);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindMatchingFont", e); }
    }

    /// Signature:
    /// ```
    /// int stbtt_CompareUTF8toUTF16_bigendian(const char* s1, int len1, const char* s2, int len2);
    /// ```
    public static boolean stbtt_CompareUTF8toUTF16_bigendian(MemorySegment s1, int len1, MemorySegment s2, int len2) {
        try {
            return (((int) Handles.MH_stbtt_CompareUTF8toUTF16_bigendian.invokeExact(Handles.get().PFN_stbtt_CompareUTF8toUTF16_bigendian, s1, len1, s2, len2)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_CompareUTF8toUTF16_bigendian", e); }
    }

    /// Signature:
    /// ```
    /// const char* stbtt_GetFontNameString(const stbtt_fontinfo* font, int* length, int platformID, int encodingID, int languageID, int nameID);
    /// ```
    public static MemorySegment stbtt_GetFontNameString(MemorySegment font, MemorySegment length, int platformID, int encodingID, int languageID, int nameID) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetFontNameString.invokeExact(Handles.get().PFN_stbtt_GetFontNameString, font, length, platformID, encodingID, languageID, nameID);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontNameString", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

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
