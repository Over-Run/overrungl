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

import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.nio.charset.StandardCharsets;

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
    public static final int
        STBTT_vmove = 1,
        STBTT_vline = 2,
        STBTT_vcurve = 3,
        STBTT_vcubic = 4;
    public static final int
        STBTT_MACSTYLE_DONTCARE = 0,
        STBTT_MACSTYLE_BOLD = 1,
        STBTT_MACSTYLE_ITALIC = 2,
        STBTT_MACSTYLE_UNDERSCORE = 4,
        STBTT_MACSTYLE_NONE = 8;
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
    public static final int STBTT_MAC_EID_JAPANESE = 1;
    public static final int STBTT_MAC_EID_CHINESE_TRAD = 2;
    public static final int STBTT_MAC_EID_KOREAN = 3;
    public static final int STBTT_MAC_EID_ARABIC = 4;
    public static final int STBTT_MAC_EID_HEBREW = 5;
    public static final int STBTT_MAC_EID_GREEK = 6;
    public static final int STBTT_MAC_EID_RUSSIAN = 7;
    public static final int STBTT_MS_LANG_ENGLISH = 0x0409;
    public static final int STBTT_MS_LANG_CHINESE = 0x0804;
    public static final int STBTT_MS_LANG_DUTCH = 0x0413;
    public static final int STBTT_MS_LANG_FRENCH = 0x040c;
    public static final int STBTT_MS_LANG_GERMAN = 0x0407;
    public static final int STBTT_MS_LANG_HEBREW = 0x040d;
    public static final int STBTT_MS_LANG_ITALIAN = 0x0410;
    public static final int STBTT_MS_LANG_JAPANESE = 0x0411;
    public static final int STBTT_MS_LANG_KOREAN = 0x0412;
    public static final int STBTT_MS_LANG_RUSSIAN = 0x0419;
    public static final int STBTT_MS_LANG_SPANISH = 0x0409;
    public static final int STBTT_MS_LANG_SWEDISH = 0x041D;
    public static final int STBTT_MAC_LANG_ENGLISH = 0;
    public static final int STBTT_MAC_LANG_ARABIC = 12;
    public static final int STBTT_MAC_LANG_DUTCH = 4;
    public static final int STBTT_MAC_LANG_FRENCH = 1;
    public static final int STBTT_MAC_LANG_GERMAN = 2;
    public static final int STBTT_MAC_LANG_HEBREW = 10;
    public static final int STBTT_MAC_LANG_ITALIAN = 3;
    public static final int STBTT_MAC_LANG_JAPANESE = 11;
    public static final int STBTT_MAC_LANG_KOREAN = 23;
    public static final int STBTT_MAC_LANG_RUSSIAN = 32;
    public static final int STBTT_MAC_LANG_SPANISH = 6;
    public static final int STBTT_MAC_LANG_SWEDISH = 5;
    public static final int STBTT_MAC_LANG_CHINESE_SIMPLIFIED = 33;
    public static final int STBTT_MAC_LANG_CHINESE_TRAD = 19;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbtt_BakeFontBitmap`.
        public static final MethodHandle MH_stbtt_BakeFontBitmap = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTBakedChar.LAYOUT)));
        /// The method handle of `stbtt_GetBakedQuad`.
        public static final MethodHandle MH_stbtt_GetBakedQuad = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTBakedChar.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTAlignedQuad.LAYOUT), ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbtt_GetScaledFontVMetrics`.
        public static final MethodHandle MH_stbtt_GetScaledFontVMetrics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackBegin`.
        public static final MethodHandle MH_stbtt_PackBegin = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackEnd`.
        public static final MethodHandle MH_stbtt_PackEnd = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackFontRange`.
        public static final MethodHandle MH_stbtt_PackFontRange = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackedChar.LAYOUT)));
        /// The method handle of `stbtt_PackFontRanges`.
        public static final MethodHandle MH_stbtt_PackFontRanges = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackRange.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackSetOversampling`.
        public static final MethodHandle MH_stbtt_PackSetOversampling = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackSetSkipMissingCodepoints`.
        public static final MethodHandle MH_stbtt_PackSetSkipMissingCodepoints = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbtt_GetPackedQuad`.
        public static final MethodHandle MH_stbtt_GetPackedQuad = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackedChar.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTAlignedQuad.LAYOUT), ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbtt_PackFontRangesGatherRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesGatherRects = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackRange.LAYOUT), ValueLayout.JAVA_INT, STBRPRect.LAYOUT));
        /// The method handle of `stbtt_PackFontRangesPackRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesPackRects = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, STBRPRect.LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackFontRangesRenderIntoRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesRenderIntoRects = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackRange.LAYOUT), ValueLayout.JAVA_INT, STBRPRect.LAYOUT));
        /// The method handle of `stbtt_GetNumberOfFonts`.
        public static final MethodHandle MH_stbtt_GetNumberOfFonts = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontOffsetForIndex`.
        public static final MethodHandle MH_stbtt_GetFontOffsetForIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_InitFont`.
        public static final MethodHandle MH_stbtt_InitFont = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_FindGlyphIndex`.
        public static final MethodHandle MH_stbtt_FindGlyphIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_ScaleForPixelHeight`.
        public static final MethodHandle MH_stbtt_ScaleForPixelHeight = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbtt_ScaleForMappingEmToPixels`.
        public static final MethodHandle MH_stbtt_ScaleForMappingEmToPixels = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbtt_GetFontVMetrics`.
        public static final MethodHandle MH_stbtt_GetFontVMetrics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontVMetricsOS2`.
        public static final MethodHandle MH_stbtt_GetFontVMetricsOS2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontBoundingBox`.
        public static final MethodHandle MH_stbtt_GetFontBoundingBox = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointHMetrics`.
        public static final MethodHandle MH_stbtt_GetCodepointHMetrics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointKernAdvance`.
        public static final MethodHandle MH_stbtt_GetCodepointKernAdvance = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointBox`.
        public static final MethodHandle MH_stbtt_GetCodepointBox = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphHMetrics`.
        public static final MethodHandle MH_stbtt_GetGlyphHMetrics = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphKernAdvance`.
        public static final MethodHandle MH_stbtt_GetGlyphKernAdvance = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetGlyphBox`.
        public static final MethodHandle MH_stbtt_GetGlyphBox = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetKerningTableLength`.
        public static final MethodHandle MH_stbtt_GetKerningTableLength = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT)));
        /// The method handle of `stbtt_GetKerningTable`.
        public static final MethodHandle MH_stbtt_GetKerningTable = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTKerningEntry.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_IsGlyphEmpty`.
        public static final MethodHandle MH_stbtt_IsGlyphEmpty = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointShape`.
        public static final MethodHandle MH_stbtt_GetCodepointShape = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphShape`.
        public static final MethodHandle MH_stbtt_GetGlyphShape = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeShape`.
        public static final MethodHandle MH_stbtt_FreeShape = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTVertex.LAYOUT)));
        /// The method handle of `stbtt_FindSVGDoc`.
        public static final MethodHandle MH_stbtt_FindSVGDoc = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointSVG`.
        public static final MethodHandle MH_stbtt_GetCodepointSVG = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphSVG`.
        public static final MethodHandle MH_stbtt_GetGlyphSVG = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeBitmap`.
        public static final MethodHandle MH_stbtt_FreeBitmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmap`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmap = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapSubpixel = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_MakeCodepointBitmap`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeCodepointBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmapSubpixel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeCodepointBitmapSubpixelPrefilter`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmapSubpixelPrefilter = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointBitmapBox`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapBox = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmapBoxSubpixel`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapBoxSubpixel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmap`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmap = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapSubpixel = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_MakeGlyphBitmap`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeGlyphBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmapSubpixel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeGlyphBitmapSubpixelPrefilter`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmapSubpixelPrefilter = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetGlyphBitmapBox`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapBox = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmapBoxSubpixel`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapBoxSubpixel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_Rasterize`.
        public static final MethodHandle MH_stbtt_Rasterize = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTT__bitmap.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTVertex.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeSDF`.
        public static final MethodHandle MH_stbtt_FreeSDF = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphSDF`.
        public static final MethodHandle MH_stbtt_GetGlyphSDF = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointSDF`.
        public static final MethodHandle MH_stbtt_GetCodepointSDF = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FindMatchingFont`.
        public static final MethodHandle MH_stbtt_FindMatchingFont = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_CompareUTF8toUTF16_bigendian`.
        public static final MethodHandle MH_stbtt_CompareUTF8toUTF16_bigendian = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetFontNameString`.
        public static final MethodHandle MH_stbtt_GetFontNameString = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
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

    public static @CType("int") int stbtt_BakeFontBitmap(@CType("const unsigned char *") MemorySegment data, @CType("int") int offset, @CType("float") float pixel_height, @CType("unsigned char *") MemorySegment pixels, @CType("int") int pw, @CType("int") int ph, @CType("int") int first_char, @CType("int") int num_chars, @CType("stbtt_bakedchar *") MemorySegment chardata) {
        try {
            return (int) Handles.MH_stbtt_BakeFontBitmap.invokeExact(Handles.get().PFN_stbtt_BakeFontBitmap, data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, chardata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_BakeFontBitmap", e); }
    }

    public static @CType("int") int stbtt_BakeFontBitmap(@CType("const unsigned char *") MemorySegment data, @CType("int") int offset, @CType("float") float pixel_height, @CType("unsigned char *") MemorySegment pixels, @CType("int") int pw, @CType("int") int ph, @CType("int") int first_char, @CType("int") int num_chars, @CType("stbtt_bakedchar *") overrungl.stb.STBTTBakedChar chardata) {
        try {
            return (int) Handles.MH_stbtt_BakeFontBitmap.invokeExact(Handles.get().PFN_stbtt_BakeFontBitmap, data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, Marshal.marshal(chardata));
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_BakeFontBitmap", e); }
    }

    public static void stbtt_GetBakedQuad(@CType("const stbtt_bakedchar *") MemorySegment chardata, @CType("int") int pw, @CType("int") int ph, @CType("int") int char_index, @Out @CType("float*") MemorySegment xpos, @Out @CType("float*") MemorySegment ypos, @CType("stbtt_aligned_quad *") MemorySegment q, @CType("int") boolean opengl_fillrule) {
        try {
            Handles.MH_stbtt_GetBakedQuad.invokeExact(Handles.get().PFN_stbtt_GetBakedQuad, chardata, pw, ph, char_index, xpos, ypos, q, opengl_fillrule);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetBakedQuad", e); }
    }

    public static void stbtt_GetBakedQuad(@CType("const stbtt_bakedchar *") overrungl.stb.STBTTBakedChar chardata, @CType("int") int pw, @CType("int") int ph, @CType("int") int char_index, @Out @CType("float*") float[] xpos, @Out @CType("float*") float[] ypos, @CType("stbtt_aligned_quad *") overrungl.stb.STBTTAlignedQuad q, @CType("int") boolean opengl_fillrule) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_stbtt_GetBakedQuad.invokeExact(Handles.get().PFN_stbtt_GetBakedQuad, Marshal.marshal(chardata), pw, ph, char_index, __overrungl_ref_xpos, __overrungl_ref_ypos, Marshal.marshal(q), opengl_fillrule);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetBakedQuad", e); }
    }

    public static void stbtt_GetScaledFontVMetrics(@CType("const unsigned char *") MemorySegment fontdata, @CType("int") int index, @CType("float") float size, @Out @CType("float*") MemorySegment ascent, @Out @CType("float*") MemorySegment descent, @Out @CType("float*") MemorySegment lineGap) {
        try {
            Handles.MH_stbtt_GetScaledFontVMetrics.invokeExact(Handles.get().PFN_stbtt_GetScaledFontVMetrics, fontdata, index, size, ascent, descent, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetScaledFontVMetrics", e); }
    }

    public static void stbtt_GetScaledFontVMetrics(@CType("const unsigned char *") MemorySegment fontdata, @CType("int") int index, @CType("float") float size, @Out @CType("float*") float[] ascent, @Out @CType("float*") float[] descent, @Out @CType("float*") float[] lineGap) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ascent = Marshal.marshal(__overrungl_stack, ascent);
            var __overrungl_ref_descent = Marshal.marshal(__overrungl_stack, descent);
            var __overrungl_ref_lineGap = Marshal.marshal(__overrungl_stack, lineGap);
            Handles.MH_stbtt_GetScaledFontVMetrics.invokeExact(Handles.get().PFN_stbtt_GetScaledFontVMetrics, fontdata, index, size, __overrungl_ref_ascent, __overrungl_ref_descent, __overrungl_ref_lineGap);
            Unmarshal.copy(__overrungl_ref_ascent, ascent);
            Unmarshal.copy(__overrungl_ref_descent, descent);
            Unmarshal.copy(__overrungl_ref_lineGap, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetScaledFontVMetrics", e); }
    }

    public static @CType("int") boolean stbtt_PackBegin(@CType("stbtt_pack_context *") MemorySegment spc, @CType("unsigned char *") MemorySegment pixels, @CType("int") int width, @CType("int") int height, @CType("int") int stride_in_bytes, @CType("int") int padding, @CType("void*") MemorySegment alloc_context) {
        try {
            return (boolean) Handles.MH_stbtt_PackBegin.invokeExact(Handles.get().PFN_stbtt_PackBegin, spc, pixels, width, height, stride_in_bytes, padding, alloc_context);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackBegin", e); }
    }

    public static void stbtt_PackEnd(@CType("stbtt_pack_context *") MemorySegment spc) {
        try {
            Handles.MH_stbtt_PackEnd.invokeExact(Handles.get().PFN_stbtt_PackEnd, spc);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackEnd", e); }
    }

    public static @CType("int") boolean stbtt_PackFontRange(@CType("stbtt_pack_context *") MemorySegment spc, @CType("const unsigned char *") MemorySegment fontdata, @CType("int") int font_index, @CType("float") float font_size, @CType("int") int first_unicode_char_in_range, @CType("int") int num_chars_in_range, @CType("stbtt_packedchar *") MemorySegment chardata_for_range) {
        try {
            return (boolean) Handles.MH_stbtt_PackFontRange.invokeExact(Handles.get().PFN_stbtt_PackFontRange, spc, fontdata, font_index, font_size, first_unicode_char_in_range, num_chars_in_range, chardata_for_range);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRange", e); }
    }

    public static @CType("int") boolean stbtt_PackFontRanges(@CType("stbtt_pack_context *") MemorySegment spc, @CType("const unsigned char *") MemorySegment fontdata, @CType("int") int font_index, @CType("stbtt_pack_range *") MemorySegment ranges, @CType("int") int num_ranges) {
        try {
            return (boolean) Handles.MH_stbtt_PackFontRanges.invokeExact(Handles.get().PFN_stbtt_PackFontRanges, spc, fontdata, font_index, ranges, num_ranges);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRanges", e); }
    }

    public static @CType("int") boolean stbtt_PackFontRanges(@CType("stbtt_pack_context *") MemorySegment spc, @CType("const unsigned char *") MemorySegment fontdata, @CType("int") int font_index, @CType("stbtt_pack_range *") overrungl.stb.STBTTPackRange ranges, @CType("int") int num_ranges) {
        try {
            return (boolean) Handles.MH_stbtt_PackFontRanges.invokeExact(Handles.get().PFN_stbtt_PackFontRanges, spc, fontdata, font_index, Marshal.marshal(ranges), num_ranges);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRanges", e); }
    }

    public static void stbtt_PackSetOversampling(@CType("stbtt_pack_context *") MemorySegment spc, @CType("unsigned int") int h_oversample, @CType("unsigned int") int v_oversample) {
        try {
            Handles.MH_stbtt_PackSetOversampling.invokeExact(Handles.get().PFN_stbtt_PackSetOversampling, spc, h_oversample, v_oversample);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackSetOversampling", e); }
    }

    public static void stbtt_PackSetSkipMissingCodepoints(@CType("stbtt_pack_context *") MemorySegment spc, @CType("int") boolean skip) {
        try {
            Handles.MH_stbtt_PackSetSkipMissingCodepoints.invokeExact(Handles.get().PFN_stbtt_PackSetSkipMissingCodepoints, spc, skip);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackSetSkipMissingCodepoints", e); }
    }

    public static void stbtt_GetPackedQuad(@CType("const stbtt_packedchar *") MemorySegment chardata, @CType("int") int pw, @CType("int") int ph, @CType("int") int char_index, @Out @CType("float*") MemorySegment xpos, @Out @CType("float*") MemorySegment ypos, @CType("stbtt_aligned_quad *") MemorySegment q, @CType("int") boolean align_to_integer) {
        try {
            Handles.MH_stbtt_GetPackedQuad.invokeExact(Handles.get().PFN_stbtt_GetPackedQuad, chardata, pw, ph, char_index, xpos, ypos, q, align_to_integer);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetPackedQuad", e); }
    }

    public static void stbtt_GetPackedQuad(@CType("const stbtt_packedchar *") overrungl.stb.STBTTPackedChar chardata, @CType("int") int pw, @CType("int") int ph, @CType("int") int char_index, @Out @CType("float*") float[] xpos, @Out @CType("float*") float[] ypos, @CType("stbtt_aligned_quad *") overrungl.stb.STBTTAlignedQuad q, @CType("int") boolean align_to_integer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_stbtt_GetPackedQuad.invokeExact(Handles.get().PFN_stbtt_GetPackedQuad, Marshal.marshal(chardata), pw, ph, char_index, __overrungl_ref_xpos, __overrungl_ref_ypos, Marshal.marshal(q), align_to_integer);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetPackedQuad", e); }
    }

    public static @CType("int") int stbtt_PackFontRangesGatherRects(@CType("stbtt_pack_context *") MemorySegment spc, @CType("const stbtt_fontinfo *") MemorySegment info, @CType("stbtt_pack_range *") MemorySegment ranges, @CType("int") int num_ranges, @CType("stbrp_rect *") MemorySegment rects) {
        try {
            return (int) Handles.MH_stbtt_PackFontRangesGatherRects.invokeExact(Handles.get().PFN_stbtt_PackFontRangesGatherRects, spc, info, ranges, num_ranges, rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesGatherRects", e); }
    }

    public static void stbtt_PackFontRangesPackRects(@CType("stbtt_pack_context *") MemorySegment spc, @CType("stbrp_rect *") MemorySegment rects, @CType("int") int num_rects) {
        try {
            Handles.MH_stbtt_PackFontRangesPackRects.invokeExact(Handles.get().PFN_stbtt_PackFontRangesPackRects, spc, rects, num_rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesPackRects", e); }
    }

    public static @CType("int") int stbtt_PackFontRangesRenderIntoRects(@CType("stbtt_pack_context *") MemorySegment spc, @CType("const stbtt_fontinfo *") MemorySegment info, @CType("stbtt_pack_range *") MemorySegment ranges, @CType("int") int num_ranges, @CType("stbrp_rect *") MemorySegment rects) {
        try {
            return (int) Handles.MH_stbtt_PackFontRangesRenderIntoRects.invokeExact(Handles.get().PFN_stbtt_PackFontRangesRenderIntoRects, spc, info, ranges, num_ranges, rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesRenderIntoRects", e); }
    }

    public static @CType("int") int stbtt_GetNumberOfFonts(@CType("const unsigned char *") MemorySegment data) {
        try {
            return (int) Handles.MH_stbtt_GetNumberOfFonts.invokeExact(Handles.get().PFN_stbtt_GetNumberOfFonts, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetNumberOfFonts", e); }
    }

    public static @CType("int") int stbtt_GetFontOffsetForIndex(@CType("const unsigned char *") MemorySegment data, @CType("int") int index) {
        try {
            return (int) Handles.MH_stbtt_GetFontOffsetForIndex.invokeExact(Handles.get().PFN_stbtt_GetFontOffsetForIndex, data, index);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontOffsetForIndex", e); }
    }

    public static @CType("int") boolean stbtt_InitFont(@CType("stbtt_fontinfo *") MemorySegment info, @CType("const unsigned char *") MemorySegment data, @CType("int") int offset) {
        try {
            return (boolean) Handles.MH_stbtt_InitFont.invokeExact(Handles.get().PFN_stbtt_InitFont, info, data, offset);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_InitFont", e); }
    }

    public static @CType("int") int stbtt_FindGlyphIndex(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int unicode_codepoint) {
        try {
            return (int) Handles.MH_stbtt_FindGlyphIndex.invokeExact(Handles.get().PFN_stbtt_FindGlyphIndex, info, unicode_codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindGlyphIndex", e); }
    }

    public static @CType("float") float stbtt_ScaleForPixelHeight(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("float") float pixels) {
        try {
            return (float) Handles.MH_stbtt_ScaleForPixelHeight.invokeExact(Handles.get().PFN_stbtt_ScaleForPixelHeight, info, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_ScaleForPixelHeight", e); }
    }

    public static @CType("float") float stbtt_ScaleForMappingEmToPixels(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("float") float pixels) {
        try {
            return (float) Handles.MH_stbtt_ScaleForMappingEmToPixels.invokeExact(Handles.get().PFN_stbtt_ScaleForMappingEmToPixels, info, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_ScaleForMappingEmToPixels", e); }
    }

    public static void stbtt_GetFontVMetrics(@CType("const stbtt_fontinfo *") MemorySegment info, @Out @CType("int*") MemorySegment ascent, @Out @CType("int*") MemorySegment descent, @Out @CType("int*") MemorySegment lineGap) {
        try {
            Handles.MH_stbtt_GetFontVMetrics.invokeExact(Handles.get().PFN_stbtt_GetFontVMetrics, info, ascent, descent, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetrics", e); }
    }

    public static void stbtt_GetFontVMetrics(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @Out @CType("int*") int[] ascent, @Out @CType("int*") int[] descent, @Out @CType("int*") int[] lineGap) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ascent = Marshal.marshal(__overrungl_stack, ascent);
            var __overrungl_ref_descent = Marshal.marshal(__overrungl_stack, descent);
            var __overrungl_ref_lineGap = Marshal.marshal(__overrungl_stack, lineGap);
            Handles.MH_stbtt_GetFontVMetrics.invokeExact(Handles.get().PFN_stbtt_GetFontVMetrics, Marshal.marshal(info), __overrungl_ref_ascent, __overrungl_ref_descent, __overrungl_ref_lineGap);
            Unmarshal.copy(__overrungl_ref_ascent, ascent);
            Unmarshal.copy(__overrungl_ref_descent, descent);
            Unmarshal.copy(__overrungl_ref_lineGap, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetrics", e); }
    }

    public static @CType("int") boolean stbtt_GetFontVMetricsOS2(@CType("const stbtt_fontinfo *") MemorySegment info, @Out @CType("int*") MemorySegment typoAscent, @Out @CType("int*") MemorySegment typoDescent, @Out @CType("int*") MemorySegment typoLineGap) {
        try {
            return (boolean) Handles.MH_stbtt_GetFontVMetricsOS2.invokeExact(Handles.get().PFN_stbtt_GetFontVMetricsOS2, info, typoAscent, typoDescent, typoLineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetricsOS2", e); }
    }

    public static @CType("int") boolean stbtt_GetFontVMetricsOS2(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @Out @CType("int*") int[] typoAscent, @Out @CType("int*") int[] typoDescent, @Out @CType("int*") int[] typoLineGap) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_typoAscent = Marshal.marshal(__overrungl_stack, typoAscent);
            var __overrungl_ref_typoDescent = Marshal.marshal(__overrungl_stack, typoDescent);
            var __overrungl_ref_typoLineGap = Marshal.marshal(__overrungl_stack, typoLineGap);
            var __overrungl_result = (boolean) Handles.MH_stbtt_GetFontVMetricsOS2.invokeExact(Handles.get().PFN_stbtt_GetFontVMetricsOS2, Marshal.marshal(info), __overrungl_ref_typoAscent, __overrungl_ref_typoDescent, __overrungl_ref_typoLineGap);
            Unmarshal.copy(__overrungl_ref_typoAscent, typoAscent);
            Unmarshal.copy(__overrungl_ref_typoDescent, typoDescent);
            Unmarshal.copy(__overrungl_ref_typoLineGap, typoLineGap);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetricsOS2", e); }
    }

    public static void stbtt_GetFontBoundingBox(@CType("const stbtt_fontinfo *") MemorySegment info, @Out @CType("int*") MemorySegment x0, @Out @CType("int*") MemorySegment y0, @Out @CType("int*") MemorySegment x1, @Out @CType("int*") MemorySegment y1) {
        try {
            Handles.MH_stbtt_GetFontBoundingBox.invokeExact(Handles.get().PFN_stbtt_GetFontBoundingBox, info, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontBoundingBox", e); }
    }

    public static void stbtt_GetFontBoundingBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @Out @CType("int*") int[] x0, @Out @CType("int*") int[] y0, @Out @CType("int*") int[] x1, @Out @CType("int*") int[] y1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x0 = Marshal.marshal(__overrungl_stack, x0);
            var __overrungl_ref_y0 = Marshal.marshal(__overrungl_stack, y0);
            var __overrungl_ref_x1 = Marshal.marshal(__overrungl_stack, x1);
            var __overrungl_ref_y1 = Marshal.marshal(__overrungl_stack, y1);
            Handles.MH_stbtt_GetFontBoundingBox.invokeExact(Handles.get().PFN_stbtt_GetFontBoundingBox, Marshal.marshal(info), __overrungl_ref_x0, __overrungl_ref_y0, __overrungl_ref_x1, __overrungl_ref_y1);
            Unmarshal.copy(__overrungl_ref_x0, x0);
            Unmarshal.copy(__overrungl_ref_y0, y0);
            Unmarshal.copy(__overrungl_ref_x1, x1);
            Unmarshal.copy(__overrungl_ref_y1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontBoundingBox", e); }
    }

    public static void stbtt_GetCodepointHMetrics(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int codepoint, @Out @CType("int*") MemorySegment advanceWidth, @Out @CType("int*") MemorySegment leftSideBearing) {
        try {
            Handles.MH_stbtt_GetCodepointHMetrics.invokeExact(Handles.get().PFN_stbtt_GetCodepointHMetrics, info, codepoint, advanceWidth, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointHMetrics", e); }
    }

    public static void stbtt_GetCodepointHMetrics(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("int") int codepoint, @Out @CType("int*") int[] advanceWidth, @Out @CType("int*") int[] leftSideBearing) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_advanceWidth = Marshal.marshal(__overrungl_stack, advanceWidth);
            var __overrungl_ref_leftSideBearing = Marshal.marshal(__overrungl_stack, leftSideBearing);
            Handles.MH_stbtt_GetCodepointHMetrics.invokeExact(Handles.get().PFN_stbtt_GetCodepointHMetrics, Marshal.marshal(info), codepoint, __overrungl_ref_advanceWidth, __overrungl_ref_leftSideBearing);
            Unmarshal.copy(__overrungl_ref_advanceWidth, advanceWidth);
            Unmarshal.copy(__overrungl_ref_leftSideBearing, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointHMetrics", e); }
    }

    public static @CType("int") int stbtt_GetCodepointKernAdvance(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int ch1, @CType("int") int ch2) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointKernAdvance.invokeExact(Handles.get().PFN_stbtt_GetCodepointKernAdvance, info, ch1, ch2);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointKernAdvance", e); }
    }

    public static @CType("int") int stbtt_GetCodepointBox(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int codepoint, @Out @CType("int*") MemorySegment x0, @Out @CType("int*") MemorySegment y0, @Out @CType("int*") MemorySegment x1, @Out @CType("int*") MemorySegment y1) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointBox.invokeExact(Handles.get().PFN_stbtt_GetCodepointBox, info, codepoint, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBox", e); }
    }

    public static @CType("int") int stbtt_GetCodepointBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("int") int codepoint, @Out @CType("int*") int[] x0, @Out @CType("int*") int[] y0, @Out @CType("int*") int[] x1, @Out @CType("int*") int[] y1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x0 = Marshal.marshal(__overrungl_stack, x0);
            var __overrungl_ref_y0 = Marshal.marshal(__overrungl_stack, y0);
            var __overrungl_ref_x1 = Marshal.marshal(__overrungl_stack, x1);
            var __overrungl_ref_y1 = Marshal.marshal(__overrungl_stack, y1);
            var __overrungl_result = (int) Handles.MH_stbtt_GetCodepointBox.invokeExact(Handles.get().PFN_stbtt_GetCodepointBox, Marshal.marshal(info), codepoint, __overrungl_ref_x0, __overrungl_ref_y0, __overrungl_ref_x1, __overrungl_ref_y1);
            Unmarshal.copy(__overrungl_ref_x0, x0);
            Unmarshal.copy(__overrungl_ref_y0, y0);
            Unmarshal.copy(__overrungl_ref_x1, x1);
            Unmarshal.copy(__overrungl_ref_y1, y1);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBox", e); }
    }

    public static void stbtt_GetGlyphHMetrics(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int glyph_index, @Out @CType("int*") MemorySegment advanceWidth, @Out @CType("int*") MemorySegment leftSideBearing) {
        try {
            Handles.MH_stbtt_GetGlyphHMetrics.invokeExact(Handles.get().PFN_stbtt_GetGlyphHMetrics, info, glyph_index, advanceWidth, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphHMetrics", e); }
    }

    public static void stbtt_GetGlyphHMetrics(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("int") int glyph_index, @Out @CType("int*") int[] advanceWidth, @Out @CType("int*") int[] leftSideBearing) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_advanceWidth = Marshal.marshal(__overrungl_stack, advanceWidth);
            var __overrungl_ref_leftSideBearing = Marshal.marshal(__overrungl_stack, leftSideBearing);
            Handles.MH_stbtt_GetGlyphHMetrics.invokeExact(Handles.get().PFN_stbtt_GetGlyphHMetrics, Marshal.marshal(info), glyph_index, __overrungl_ref_advanceWidth, __overrungl_ref_leftSideBearing);
            Unmarshal.copy(__overrungl_ref_advanceWidth, advanceWidth);
            Unmarshal.copy(__overrungl_ref_leftSideBearing, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphHMetrics", e); }
    }

    public static @CType("int") int stbtt_GetGlyphKernAdvance(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int glyph1, @CType("int") int glyph2) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphKernAdvance.invokeExact(Handles.get().PFN_stbtt_GetGlyphKernAdvance, info, glyph1, glyph2);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphKernAdvance", e); }
    }

    public static @CType("int") int stbtt_GetGlyphBox(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int glyph_index, @Out @CType("int*") MemorySegment x0, @Out @CType("int*") MemorySegment y0, @Out @CType("int*") MemorySegment x1, @Out @CType("int*") MemorySegment y1) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphBox.invokeExact(Handles.get().PFN_stbtt_GetGlyphBox, info, glyph_index, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBox", e); }
    }

    public static @CType("int") int stbtt_GetGlyphBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("int") int glyph_index, @Out @CType("int*") int[] x0, @Out @CType("int*") int[] y0, @Out @CType("int*") int[] x1, @Out @CType("int*") int[] y1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x0 = Marshal.marshal(__overrungl_stack, x0);
            var __overrungl_ref_y0 = Marshal.marshal(__overrungl_stack, y0);
            var __overrungl_ref_x1 = Marshal.marshal(__overrungl_stack, x1);
            var __overrungl_ref_y1 = Marshal.marshal(__overrungl_stack, y1);
            var __overrungl_result = (int) Handles.MH_stbtt_GetGlyphBox.invokeExact(Handles.get().PFN_stbtt_GetGlyphBox, Marshal.marshal(info), glyph_index, __overrungl_ref_x0, __overrungl_ref_y0, __overrungl_ref_x1, __overrungl_ref_y1);
            Unmarshal.copy(__overrungl_ref_x0, x0);
            Unmarshal.copy(__overrungl_ref_y0, y0);
            Unmarshal.copy(__overrungl_ref_x1, x1);
            Unmarshal.copy(__overrungl_ref_y1, y1);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBox", e); }
    }

    public static @CType("int") int stbtt_GetKerningTableLength(@CType("const stbtt_fontinfo *") MemorySegment info) {
        try {
            return (int) Handles.MH_stbtt_GetKerningTableLength.invokeExact(Handles.get().PFN_stbtt_GetKerningTableLength, info);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetKerningTableLength", e); }
    }

    public static @CType("int") int stbtt_GetKerningTable(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("stbtt_kerningentry*") MemorySegment table, @CType("int") int table_length) {
        try {
            return (int) Handles.MH_stbtt_GetKerningTable.invokeExact(Handles.get().PFN_stbtt_GetKerningTable, info, table, table_length);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetKerningTable", e); }
    }

    public static @CType("int") boolean stbtt_IsGlyphEmpty(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int glyph_index) {
        try {
            return (boolean) Handles.MH_stbtt_IsGlyphEmpty.invokeExact(Handles.get().PFN_stbtt_IsGlyphEmpty, info, glyph_index);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_IsGlyphEmpty", e); }
    }

    public static @CType("int") int stbtt_GetCodepointShape(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int unicode_codepoint, @CType("stbtt_vertex **") MemorySegment vertices) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointShape.invokeExact(Handles.get().PFN_stbtt_GetCodepointShape, info, unicode_codepoint, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointShape", e); }
    }

    public static @CType("int") int stbtt_GetGlyphShape(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int glyph_index, @CType("stbtt_vertex **") MemorySegment vertices) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphShape.invokeExact(Handles.get().PFN_stbtt_GetGlyphShape, info, glyph_index, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphShape", e); }
    }

    public static void stbtt_FreeShape(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("stbtt_vertex *") MemorySegment vertices) {
        try {
            Handles.MH_stbtt_FreeShape.invokeExact(Handles.get().PFN_stbtt_FreeShape, info, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeShape", e); }
    }

    public static void stbtt_FreeShape(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("stbtt_vertex *") overrungl.stb.STBTTVertex vertices) {
        try {
            Handles.MH_stbtt_FreeShape.invokeExact(Handles.get().PFN_stbtt_FreeShape, Marshal.marshal(info), Marshal.marshal(vertices));
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeShape", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_FindSVGDoc(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int gl) {
        try {
            return (MemorySegment) Handles.MH_stbtt_FindSVGDoc.invokeExact(Handles.get().PFN_stbtt_FindSVGDoc, info, gl);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindSVGDoc", e); }
    }

    public static @CType("int") int stbtt_GetCodepointSVG(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int unicode_codepoint, @CType("const char **") MemorySegment svg) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointSVG.invokeExact(Handles.get().PFN_stbtt_GetCodepointSVG, info, unicode_codepoint, svg);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSVG", e); }
    }

    public static @CType("int") int stbtt_GetGlyphSVG(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("int") int gl, @CType("const char **") MemorySegment svg) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphSVG.invokeExact(Handles.get().PFN_stbtt_GetGlyphSVG, info, gl, svg);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSVG", e); }
    }

    public static void stbtt_FreeBitmap(@CType("unsigned char *") MemorySegment bitmap, @CType("void*") MemorySegment userdata) {
        try {
            Handles.MH_stbtt_FreeBitmap.invokeExact(Handles.get().PFN_stbtt_FreeBitmap, bitmap, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeBitmap", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetCodepointBitmap(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int codepoint, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height, @Out @CType("int*") MemorySegment xoff, @Out @CType("int*") MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetCodepointBitmap.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmap, info, scale_x, scale_y, codepoint, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmap", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetCodepointBitmap(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int codepoint, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (MemorySegment) Handles.MH_stbtt_GetCodepointBitmap.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmap, Marshal.marshal(info), scale_x, scale_y, codepoint, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmap", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetCodepointBitmapSubpixel(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int codepoint, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height, @Out @CType("int*") MemorySegment xoff, @Out @CType("int*") MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetCodepointBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapSubpixel, info, scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapSubpixel", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetCodepointBitmapSubpixel(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int codepoint, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (MemorySegment) Handles.MH_stbtt_GetCodepointBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapSubpixel, Marshal.marshal(info), scale_x, scale_y, shift_x, shift_y, codepoint, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapSubpixel", e); }
    }

    public static void stbtt_MakeCodepointBitmap(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("unsigned char *") MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmap.invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmap, info, output, out_w, out_h, out_stride, scale_x, scale_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmap", e); }
    }

    public static void stbtt_MakeCodepointBitmapSubpixel(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("unsigned char *") MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmapSubpixel, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixel", e); }
    }

    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("unsigned char *") MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int oversample_x, @CType("int") int oversample_y, @Out @CType("float*") MemorySegment sub_x, @Out @CType("float*") MemorySegment sub_y, @CType("int") int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmapSubpixelPrefilter.invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmapSubpixelPrefilter, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixelPrefilter", e); }
    }

    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("unsigned char *") MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int oversample_x, @CType("int") int oversample_y, @Out @CType("float*") float[] sub_x, @Out @CType("float*") float[] sub_y, @CType("int") int codepoint) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_sub_x = Marshal.marshal(__overrungl_stack, sub_x);
            var __overrungl_ref_sub_y = Marshal.marshal(__overrungl_stack, sub_y);
            Handles.MH_stbtt_MakeCodepointBitmapSubpixelPrefilter.invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmapSubpixelPrefilter, Marshal.marshal(info), output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, __overrungl_ref_sub_x, __overrungl_ref_sub_y, codepoint);
            Unmarshal.copy(__overrungl_ref_sub_x, sub_x);
            Unmarshal.copy(__overrungl_ref_sub_y, sub_y);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixelPrefilter", e); }
    }

    public static void stbtt_GetCodepointBitmapBox(@CType("const stbtt_fontinfo *") MemorySegment font, @CType("int") int codepoint, @CType("float") float scale_x, @CType("float") float scale_y, @Out @CType("int*") MemorySegment ix0, @Out @CType("int*") MemorySegment iy0, @Out @CType("int*") MemorySegment ix1, @Out @CType("int*") MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetCodepointBitmapBox.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapBox, font, codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBox", e); }
    }

    public static void stbtt_GetCodepointBitmapBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo font, @CType("int") int codepoint, @CType("float") float scale_x, @CType("float") float scale_y, @Out @CType("int*") int[] ix0, @Out @CType("int*") int[] iy0, @Out @CType("int*") int[] ix1, @Out @CType("int*") int[] iy1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ix0 = Marshal.marshal(__overrungl_stack, ix0);
            var __overrungl_ref_iy0 = Marshal.marshal(__overrungl_stack, iy0);
            var __overrungl_ref_ix1 = Marshal.marshal(__overrungl_stack, ix1);
            var __overrungl_ref_iy1 = Marshal.marshal(__overrungl_stack, iy1);
            Handles.MH_stbtt_GetCodepointBitmapBox.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapBox, Marshal.marshal(font), codepoint, scale_x, scale_y, __overrungl_ref_ix0, __overrungl_ref_iy0, __overrungl_ref_ix1, __overrungl_ref_iy1);
            Unmarshal.copy(__overrungl_ref_ix0, ix0);
            Unmarshal.copy(__overrungl_ref_iy0, iy0);
            Unmarshal.copy(__overrungl_ref_ix1, ix1);
            Unmarshal.copy(__overrungl_ref_iy1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBox", e); }
    }

    public static void stbtt_GetCodepointBitmapBoxSubpixel(@CType("const stbtt_fontinfo *") MemorySegment font, @CType("int") int codepoint, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @Out @CType("int*") MemorySegment ix0, @Out @CType("int*") MemorySegment iy0, @Out @CType("int*") MemorySegment ix1, @Out @CType("int*") MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetCodepointBitmapBoxSubpixel.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapBoxSubpixel, font, codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBoxSubpixel", e); }
    }

    public static void stbtt_GetCodepointBitmapBoxSubpixel(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo font, @CType("int") int codepoint, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @Out @CType("int*") int[] ix0, @Out @CType("int*") int[] iy0, @Out @CType("int*") int[] ix1, @Out @CType("int*") int[] iy1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ix0 = Marshal.marshal(__overrungl_stack, ix0);
            var __overrungl_ref_iy0 = Marshal.marshal(__overrungl_stack, iy0);
            var __overrungl_ref_ix1 = Marshal.marshal(__overrungl_stack, ix1);
            var __overrungl_ref_iy1 = Marshal.marshal(__overrungl_stack, iy1);
            Handles.MH_stbtt_GetCodepointBitmapBoxSubpixel.invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapBoxSubpixel, Marshal.marshal(font), codepoint, scale_x, scale_y, shift_x, shift_y, __overrungl_ref_ix0, __overrungl_ref_iy0, __overrungl_ref_ix1, __overrungl_ref_iy1);
            Unmarshal.copy(__overrungl_ref_ix0, ix0);
            Unmarshal.copy(__overrungl_ref_iy0, iy0);
            Unmarshal.copy(__overrungl_ref_ix1, ix1);
            Unmarshal.copy(__overrungl_ref_iy1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBoxSubpixel", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetGlyphBitmap(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int glyph, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height, @Out @CType("int*") MemorySegment xoff, @Out @CType("int*") MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetGlyphBitmap.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmap, info, scale_x, scale_y, glyph, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmap", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetGlyphBitmap(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int glyph, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (MemorySegment) Handles.MH_stbtt_GetGlyphBitmap.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmap, Marshal.marshal(info), scale_x, scale_y, glyph, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmap", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetGlyphBitmapSubpixel(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int glyph, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height, @Out @CType("int*") MemorySegment xoff, @Out @CType("int*") MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetGlyphBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapSubpixel, info, scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapSubpixel", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetGlyphBitmapSubpixel(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int glyph, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (MemorySegment) Handles.MH_stbtt_GetGlyphBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapSubpixel, Marshal.marshal(info), scale_x, scale_y, shift_x, shift_y, glyph, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapSubpixel", e); }
    }

    public static void stbtt_MakeGlyphBitmap(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("unsigned char *") MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmap.invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmap, info, output, out_w, out_h, out_stride, scale_x, scale_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmap", e); }
    }

    public static void stbtt_MakeGlyphBitmapSubpixel(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("unsigned char *") MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmapSubpixel.invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmapSubpixel, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixel", e); }
    }

    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("unsigned char *") MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int oversample_x, @CType("int") int oversample_y, @Out @CType("float*") MemorySegment sub_x, @Out @CType("float*") MemorySegment sub_y, @CType("int") int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmapSubpixelPrefilter.invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmapSubpixelPrefilter, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixelPrefilter", e); }
    }

    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("unsigned char *") MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int oversample_x, @CType("int") int oversample_y, @Out @CType("float*") float[] sub_x, @Out @CType("float*") float[] sub_y, @CType("int") int glyph) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_sub_x = Marshal.marshal(__overrungl_stack, sub_x);
            var __overrungl_ref_sub_y = Marshal.marshal(__overrungl_stack, sub_y);
            Handles.MH_stbtt_MakeGlyphBitmapSubpixelPrefilter.invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmapSubpixelPrefilter, Marshal.marshal(info), output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, __overrungl_ref_sub_x, __overrungl_ref_sub_y, glyph);
            Unmarshal.copy(__overrungl_ref_sub_x, sub_x);
            Unmarshal.copy(__overrungl_ref_sub_y, sub_y);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixelPrefilter", e); }
    }

    public static void stbtt_GetGlyphBitmapBox(@CType("const stbtt_fontinfo *") MemorySegment font, @CType("int") int glyph, @CType("float") float scale_x, @CType("float") float scale_y, @Out @CType("int*") MemorySegment ix0, @Out @CType("int*") MemorySegment iy0, @Out @CType("int*") MemorySegment ix1, @Out @CType("int*") MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetGlyphBitmapBox.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapBox, font, glyph, scale_x, scale_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBox", e); }
    }

    public static void stbtt_GetGlyphBitmapBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo font, @CType("int") int glyph, @CType("float") float scale_x, @CType("float") float scale_y, @Out @CType("int*") int[] ix0, @Out @CType("int*") int[] iy0, @Out @CType("int*") int[] ix1, @Out @CType("int*") int[] iy1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ix0 = Marshal.marshal(__overrungl_stack, ix0);
            var __overrungl_ref_iy0 = Marshal.marshal(__overrungl_stack, iy0);
            var __overrungl_ref_ix1 = Marshal.marshal(__overrungl_stack, ix1);
            var __overrungl_ref_iy1 = Marshal.marshal(__overrungl_stack, iy1);
            Handles.MH_stbtt_GetGlyphBitmapBox.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapBox, Marshal.marshal(font), glyph, scale_x, scale_y, __overrungl_ref_ix0, __overrungl_ref_iy0, __overrungl_ref_ix1, __overrungl_ref_iy1);
            Unmarshal.copy(__overrungl_ref_ix0, ix0);
            Unmarshal.copy(__overrungl_ref_iy0, iy0);
            Unmarshal.copy(__overrungl_ref_ix1, ix1);
            Unmarshal.copy(__overrungl_ref_iy1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBox", e); }
    }

    public static void stbtt_GetGlyphBitmapBoxSubpixel(@CType("const stbtt_fontinfo *") MemorySegment font, @CType("int") int glyph, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @Out @CType("int*") MemorySegment ix0, @Out @CType("int*") MemorySegment iy0, @Out @CType("int*") MemorySegment ix1, @Out @CType("int*") MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetGlyphBitmapBoxSubpixel.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapBoxSubpixel, font, glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBoxSubpixel", e); }
    }

    public static void stbtt_GetGlyphBitmapBoxSubpixel(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo font, @CType("int") int glyph, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @Out @CType("int*") int[] ix0, @Out @CType("int*") int[] iy0, @Out @CType("int*") int[] ix1, @Out @CType("int*") int[] iy1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ix0 = Marshal.marshal(__overrungl_stack, ix0);
            var __overrungl_ref_iy0 = Marshal.marshal(__overrungl_stack, iy0);
            var __overrungl_ref_ix1 = Marshal.marshal(__overrungl_stack, ix1);
            var __overrungl_ref_iy1 = Marshal.marshal(__overrungl_stack, iy1);
            Handles.MH_stbtt_GetGlyphBitmapBoxSubpixel.invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapBoxSubpixel, Marshal.marshal(font), glyph, scale_x, scale_y, shift_x, shift_y, __overrungl_ref_ix0, __overrungl_ref_iy0, __overrungl_ref_ix1, __overrungl_ref_iy1);
            Unmarshal.copy(__overrungl_ref_ix0, ix0);
            Unmarshal.copy(__overrungl_ref_iy0, iy0);
            Unmarshal.copy(__overrungl_ref_ix1, ix1);
            Unmarshal.copy(__overrungl_ref_iy1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBoxSubpixel", e); }
    }

    public static void stbtt_Rasterize(@CType("stbtt__bitmap *") MemorySegment result, @CType("float") float flatness_in_pixels, @CType("stbtt_vertex *") MemorySegment vertices, @CType("int") int num_verts, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int x_off, @CType("int") int y_off, @CType("int") boolean invert, @CType("void*") MemorySegment userdata) {
        try {
            Handles.MH_stbtt_Rasterize.invokeExact(Handles.get().PFN_stbtt_Rasterize, result, flatness_in_pixels, vertices, num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_Rasterize", e); }
    }

    public static void stbtt_Rasterize(@CType("stbtt__bitmap *") overrungl.stb.STBTT__bitmap result, @CType("float") float flatness_in_pixels, @CType("stbtt_vertex *") overrungl.stb.STBTTVertex vertices, @CType("int") int num_verts, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int x_off, @CType("int") int y_off, @CType("int") boolean invert, @CType("void*") MemorySegment userdata) {
        try {
            Handles.MH_stbtt_Rasterize.invokeExact(Handles.get().PFN_stbtt_Rasterize, Marshal.marshal(result), flatness_in_pixels, Marshal.marshal(vertices), num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_Rasterize", e); }
    }

    public static void stbtt_FreeSDF(@CType("unsigned char *") MemorySegment bitmap, @CType("void*") MemorySegment userdata) {
        try {
            Handles.MH_stbtt_FreeSDF.invokeExact(Handles.get().PFN_stbtt_FreeSDF, bitmap, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeSDF", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetGlyphSDF(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("float") float scale, @CType("int") int glyph, @CType("int") int padding, @CType("unsigned char") byte onedge_value, @CType("float") float pixel_dist_scale, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height, @Out @CType("int*") MemorySegment xoff, @Out @CType("int*") MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetGlyphSDF.invokeExact(Handles.get().PFN_stbtt_GetGlyphSDF, info, scale, glyph, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSDF", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetGlyphSDF(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale, @CType("int") int glyph, @CType("int") int padding, @CType("unsigned char") byte onedge_value, @CType("float") float pixel_dist_scale, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (MemorySegment) Handles.MH_stbtt_GetGlyphSDF.invokeExact(Handles.get().PFN_stbtt_GetGlyphSDF, Marshal.marshal(info), scale, glyph, padding, onedge_value, pixel_dist_scale, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSDF", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetCodepointSDF(@CType("const stbtt_fontinfo *") MemorySegment info, @CType("float") float scale, @CType("int") int codepoint, @CType("int") int padding, @CType("unsigned char") byte onedge_value, @CType("float") float pixel_dist_scale, @Out @CType("int*") MemorySegment width, @Out @CType("int*") MemorySegment height, @Out @CType("int*") MemorySegment xoff, @Out @CType("int*") MemorySegment yoff) {
        try {
            return (MemorySegment) Handles.MH_stbtt_GetCodepointSDF.invokeExact(Handles.get().PFN_stbtt_GetCodepointSDF, info, scale, codepoint, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSDF", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbtt_GetCodepointSDF(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale, @CType("int") int codepoint, @CType("int") int padding, @CType("unsigned char") byte onedge_value, @CType("float") float pixel_dist_scale, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (MemorySegment) Handles.MH_stbtt_GetCodepointSDF.invokeExact(Handles.get().PFN_stbtt_GetCodepointSDF, Marshal.marshal(info), scale, codepoint, padding, onedge_value, pixel_dist_scale, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSDF", e); }
    }

    public static @CType("int") int stbtt_FindMatchingFont(@CType("const unsigned char *") MemorySegment fontdata, @CType("const char*") MemorySegment name, @CType("int") int flags) {
        try {
            return (int) Handles.MH_stbtt_FindMatchingFont.invokeExact(Handles.get().PFN_stbtt_FindMatchingFont, fontdata, name, flags);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindMatchingFont", e); }
    }

    public static @CType("int") int stbtt_FindMatchingFont(@CType("const unsigned char *") MemorySegment fontdata, @CType("const char*") String name, @CType("int") int flags) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_stbtt_FindMatchingFont.invokeExact(Handles.get().PFN_stbtt_FindMatchingFont, fontdata, Marshal.marshal(__overrungl_stack, name), flags);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindMatchingFont", e); }
    }

    public static @CType("int") boolean stbtt_CompareUTF8toUTF16_bigendian(@CType("const char*") MemorySegment s1, @CType("int") int len1, @CType("const char*") MemorySegment s2, @CType("int") int len2) {
        try {
            return (boolean) Handles.MH_stbtt_CompareUTF8toUTF16_bigendian.invokeExact(Handles.get().PFN_stbtt_CompareUTF8toUTF16_bigendian, s1, len1, s2, len2);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_CompareUTF8toUTF16_bigendian", e); }
    }

    public static @CType("const char*") MemorySegment stbtt_GetFontNameString(@CType("const stbtt_fontinfo *") MemorySegment font, @Out @CType("int*") MemorySegment length, @CType("int") int platformID, @CType("int") int encodingID, @CType("int") int languageID, @CType("int") int nameID) {
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

    public static boolean stbtt_CompareUTF8toUTF16_bigendian(String s1, String s2) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment ps1 = Marshal.marshal(stack, s1);
            MemorySegment ps2 = Marshal.marshal(stack, s2, StandardCharsets.UTF_16BE);
            return stbtt_CompareUTF8toUTF16_bigendian(ps1, Math.toIntExact(ps1.byteSize()) - 1, ps2, Math.toIntExact(ps2.byteSize()) - 2);
        }
    }

    public static String stbtt_GetFontNameString(STBTTFontInfo font, int platformID, int encodingID, int languageID, int nameID) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pLength = stack.allocate(ValueLayout.JAVA_INT);
            var res = stbtt_GetFontNameString(Marshal.marshal(font), pLength, platformID, encodingID, languageID, nameID);
            int length = pLength.get(ValueLayout.JAVA_INT, 0L);
            return Unmarshal.unmarshalAsString(res,
                stbtt_CompareUTF8toUTF16_bigendian(res, length, res, length) ?
                    StandardCharsets.UTF_8 :
                    StandardCharsets.UTF_16BE);
        }
    }
}
