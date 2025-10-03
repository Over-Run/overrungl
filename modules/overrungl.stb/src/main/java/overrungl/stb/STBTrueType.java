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

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Supplier;

import static overrungl.internal.RuntimeHelper.*;

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
        /// The method handle of [`stbtt_BakeFontBitmap`][#stbtt_BakeFontBitmap].
        public static final Supplier<MethodHandle> MH_stbtt_BakeFontBitmap = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetBakedQuad`][#stbtt_GetBakedQuad].
        public static final Supplier<MethodHandle> MH_stbtt_GetBakedQuad = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetScaledFontVMetrics`][#stbtt_GetScaledFontVMetrics].
        public static final Supplier<MethodHandle> MH_stbtt_GetScaledFontVMetrics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_PackBegin`][#stbtt_PackBegin].
        public static final Supplier<MethodHandle> MH_stbtt_PackBegin = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_PackEnd`][#stbtt_PackEnd].
        public static final Supplier<MethodHandle> MH_stbtt_PackEnd = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_PackFontRange`][#stbtt_PackFontRange].
        public static final Supplier<MethodHandle> MH_stbtt_PackFontRange = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_PackFontRanges`][#stbtt_PackFontRanges].
        public static final Supplier<MethodHandle> MH_stbtt_PackFontRanges = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_PackSetOversampling`][#stbtt_PackSetOversampling].
        public static final Supplier<MethodHandle> MH_stbtt_PackSetOversampling = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_PackSetSkipMissingCodepoints`][#stbtt_PackSetSkipMissingCodepoints].
        public static final Supplier<MethodHandle> MH_stbtt_PackSetSkipMissingCodepoints = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetPackedQuad`][#stbtt_GetPackedQuad].
        public static final Supplier<MethodHandle> MH_stbtt_GetPackedQuad = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_PackFontRangesGatherRects`][#stbtt_PackFontRangesGatherRects].
        public static final Supplier<MethodHandle> MH_stbtt_PackFontRangesGatherRects = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_PackFontRangesPackRects`][#stbtt_PackFontRangesPackRects].
        public static final Supplier<MethodHandle> MH_stbtt_PackFontRangesPackRects = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_PackFontRangesRenderIntoRects`][#stbtt_PackFontRangesRenderIntoRects].
        public static final Supplier<MethodHandle> MH_stbtt_PackFontRangesRenderIntoRects = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetNumberOfFonts`][#stbtt_GetNumberOfFonts].
        public static final Supplier<MethodHandle> MH_stbtt_GetNumberOfFonts = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetFontOffsetForIndex`][#stbtt_GetFontOffsetForIndex].
        public static final Supplier<MethodHandle> MH_stbtt_GetFontOffsetForIndex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_InitFont`][#stbtt_InitFont].
        public static final Supplier<MethodHandle> MH_stbtt_InitFont = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_FindGlyphIndex`][#stbtt_FindGlyphIndex].
        public static final Supplier<MethodHandle> MH_stbtt_FindGlyphIndex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_ScaleForPixelHeight`][#stbtt_ScaleForPixelHeight].
        public static final Supplier<MethodHandle> MH_stbtt_ScaleForPixelHeight = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`stbtt_ScaleForMappingEmToPixels`][#stbtt_ScaleForMappingEmToPixels].
        public static final Supplier<MethodHandle> MH_stbtt_ScaleForMappingEmToPixels = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)));
        /// The method handle of [`stbtt_GetFontVMetrics`][#stbtt_GetFontVMetrics].
        public static final Supplier<MethodHandle> MH_stbtt_GetFontVMetrics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetFontVMetricsOS2`][#stbtt_GetFontVMetricsOS2].
        public static final Supplier<MethodHandle> MH_stbtt_GetFontVMetricsOS2 = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetFontBoundingBox`][#stbtt_GetFontBoundingBox].
        public static final Supplier<MethodHandle> MH_stbtt_GetFontBoundingBox = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetCodepointHMetrics`][#stbtt_GetCodepointHMetrics].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointHMetrics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetCodepointKernAdvance`][#stbtt_GetCodepointKernAdvance].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointKernAdvance = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetCodepointBox`][#stbtt_GetCodepointBox].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointBox = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetGlyphHMetrics`][#stbtt_GetGlyphHMetrics].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphHMetrics = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetGlyphKernAdvance`][#stbtt_GetGlyphKernAdvance].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphKernAdvance = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetGlyphBox`][#stbtt_GetGlyphBox].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphBox = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetKerningTableLength`][#stbtt_GetKerningTableLength].
        public static final Supplier<MethodHandle> MH_stbtt_GetKerningTableLength = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetKerningTable`][#stbtt_GetKerningTable].
        public static final Supplier<MethodHandle> MH_stbtt_GetKerningTable = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_IsGlyphEmpty`][#stbtt_IsGlyphEmpty].
        public static final Supplier<MethodHandle> MH_stbtt_IsGlyphEmpty = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetCodepointShape`][#stbtt_GetCodepointShape].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointShape = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetGlyphShape`][#stbtt_GetGlyphShape].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphShape = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_FreeShape`][#stbtt_FreeShape].
        public static final Supplier<MethodHandle> MH_stbtt_FreeShape = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_FindSVGDoc`][#stbtt_FindSVGDoc].
        public static final Supplier<MethodHandle> MH_stbtt_FindSVGDoc = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetCodepointSVG`][#stbtt_GetCodepointSVG].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointSVG = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetGlyphSVG`][#stbtt_GetGlyphSVG].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphSVG = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_FreeBitmap`][#stbtt_FreeBitmap].
        public static final Supplier<MethodHandle> MH_stbtt_FreeBitmap = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetCodepointBitmap`][#stbtt_GetCodepointBitmap].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointBitmap = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetCodepointBitmapSubpixel`][#stbtt_GetCodepointBitmapSubpixel].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointBitmapSubpixel = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_MakeCodepointBitmap`][#stbtt_MakeCodepointBitmap].
        public static final Supplier<MethodHandle> MH_stbtt_MakeCodepointBitmap = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_MakeCodepointBitmapSubpixel`][#stbtt_MakeCodepointBitmapSubpixel].
        public static final Supplier<MethodHandle> MH_stbtt_MakeCodepointBitmapSubpixel = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_MakeCodepointBitmapSubpixelPrefilter`][#stbtt_MakeCodepointBitmapSubpixelPrefilter].
        public static final Supplier<MethodHandle> MH_stbtt_MakeCodepointBitmapSubpixelPrefilter = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetCodepointBitmapBox`][#stbtt_GetCodepointBitmapBox].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointBitmapBox = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetCodepointBitmapBoxSubpixel`][#stbtt_GetCodepointBitmapBoxSubpixel].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointBitmapBoxSubpixel = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetGlyphBitmap`][#stbtt_GetGlyphBitmap].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphBitmap = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetGlyphBitmapSubpixel`][#stbtt_GetGlyphBitmapSubpixel].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphBitmapSubpixel = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_MakeGlyphBitmap`][#stbtt_MakeGlyphBitmap].
        public static final Supplier<MethodHandle> MH_stbtt_MakeGlyphBitmap = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_MakeGlyphBitmapSubpixel`][#stbtt_MakeGlyphBitmapSubpixel].
        public static final Supplier<MethodHandle> MH_stbtt_MakeGlyphBitmapSubpixel = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_MakeGlyphBitmapSubpixelPrefilter`][#stbtt_MakeGlyphBitmapSubpixelPrefilter].
        public static final Supplier<MethodHandle> MH_stbtt_MakeGlyphBitmapSubpixelPrefilter = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetGlyphBitmapBox`][#stbtt_GetGlyphBitmapBox].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphBitmapBox = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetGlyphBitmapBoxSubpixel`][#stbtt_GetGlyphBitmapBoxSubpixel].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphBitmapBoxSubpixel = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_Rasterize`][#stbtt_Rasterize].
        public static final Supplier<MethodHandle> MH_stbtt_Rasterize = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_FreeSDF`][#stbtt_FreeSDF].
        public static final Supplier<MethodHandle> MH_stbtt_FreeSDF = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetGlyphSDF`][#stbtt_GetGlyphSDF].
        public static final Supplier<MethodHandle> MH_stbtt_GetGlyphSDF = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_GetCodepointSDF`][#stbtt_GetCodepointSDF].
        public static final Supplier<MethodHandle> MH_stbtt_GetCodepointSDF = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stbtt_FindMatchingFont`][#stbtt_FindMatchingFont].
        public static final Supplier<MethodHandle> MH_stbtt_FindMatchingFont = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_CompareUTF8toUTF16_bigendian`][#stbtt_CompareUTF8toUTF16_bigendian].
        public static final Supplier<MethodHandle> MH_stbtt_CompareUTF8toUTF16_bigendian = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stbtt_GetFontNameString`][#stbtt_GetFontNameString].
        public static final Supplier<MethodHandle> MH_stbtt_GetFontNameString = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        /// The function address of [`stbtt_BakeFontBitmap`][#stbtt_BakeFontBitmap].
        public final MemorySegment PFN_stbtt_BakeFontBitmap;
        /// The function address of [`stbtt_GetBakedQuad`][#stbtt_GetBakedQuad].
        public final MemorySegment PFN_stbtt_GetBakedQuad;
        /// The function address of [`stbtt_GetScaledFontVMetrics`][#stbtt_GetScaledFontVMetrics].
        public final MemorySegment PFN_stbtt_GetScaledFontVMetrics;
        /// The function address of [`stbtt_PackBegin`][#stbtt_PackBegin].
        public final MemorySegment PFN_stbtt_PackBegin;
        /// The function address of [`stbtt_PackEnd`][#stbtt_PackEnd].
        public final MemorySegment PFN_stbtt_PackEnd;
        /// The function address of [`stbtt_PackFontRange`][#stbtt_PackFontRange].
        public final MemorySegment PFN_stbtt_PackFontRange;
        /// The function address of [`stbtt_PackFontRanges`][#stbtt_PackFontRanges].
        public final MemorySegment PFN_stbtt_PackFontRanges;
        /// The function address of [`stbtt_PackSetOversampling`][#stbtt_PackSetOversampling].
        public final MemorySegment PFN_stbtt_PackSetOversampling;
        /// The function address of [`stbtt_PackSetSkipMissingCodepoints`][#stbtt_PackSetSkipMissingCodepoints].
        public final MemorySegment PFN_stbtt_PackSetSkipMissingCodepoints;
        /// The function address of [`stbtt_GetPackedQuad`][#stbtt_GetPackedQuad].
        public final MemorySegment PFN_stbtt_GetPackedQuad;
        /// The function address of [`stbtt_PackFontRangesGatherRects`][#stbtt_PackFontRangesGatherRects].
        public final MemorySegment PFN_stbtt_PackFontRangesGatherRects;
        /// The function address of [`stbtt_PackFontRangesPackRects`][#stbtt_PackFontRangesPackRects].
        public final MemorySegment PFN_stbtt_PackFontRangesPackRects;
        /// The function address of [`stbtt_PackFontRangesRenderIntoRects`][#stbtt_PackFontRangesRenderIntoRects].
        public final MemorySegment PFN_stbtt_PackFontRangesRenderIntoRects;
        /// The function address of [`stbtt_GetNumberOfFonts`][#stbtt_GetNumberOfFonts].
        public final MemorySegment PFN_stbtt_GetNumberOfFonts;
        /// The function address of [`stbtt_GetFontOffsetForIndex`][#stbtt_GetFontOffsetForIndex].
        public final MemorySegment PFN_stbtt_GetFontOffsetForIndex;
        /// The function address of [`stbtt_InitFont`][#stbtt_InitFont].
        public final MemorySegment PFN_stbtt_InitFont;
        /// The function address of [`stbtt_FindGlyphIndex`][#stbtt_FindGlyphIndex].
        public final MemorySegment PFN_stbtt_FindGlyphIndex;
        /// The function address of [`stbtt_ScaleForPixelHeight`][#stbtt_ScaleForPixelHeight].
        public final MemorySegment PFN_stbtt_ScaleForPixelHeight;
        /// The function address of [`stbtt_ScaleForMappingEmToPixels`][#stbtt_ScaleForMappingEmToPixels].
        public final MemorySegment PFN_stbtt_ScaleForMappingEmToPixels;
        /// The function address of [`stbtt_GetFontVMetrics`][#stbtt_GetFontVMetrics].
        public final MemorySegment PFN_stbtt_GetFontVMetrics;
        /// The function address of [`stbtt_GetFontVMetricsOS2`][#stbtt_GetFontVMetricsOS2].
        public final MemorySegment PFN_stbtt_GetFontVMetricsOS2;
        /// The function address of [`stbtt_GetFontBoundingBox`][#stbtt_GetFontBoundingBox].
        public final MemorySegment PFN_stbtt_GetFontBoundingBox;
        /// The function address of [`stbtt_GetCodepointHMetrics`][#stbtt_GetCodepointHMetrics].
        public final MemorySegment PFN_stbtt_GetCodepointHMetrics;
        /// The function address of [`stbtt_GetCodepointKernAdvance`][#stbtt_GetCodepointKernAdvance].
        public final MemorySegment PFN_stbtt_GetCodepointKernAdvance;
        /// The function address of [`stbtt_GetCodepointBox`][#stbtt_GetCodepointBox].
        public final MemorySegment PFN_stbtt_GetCodepointBox;
        /// The function address of [`stbtt_GetGlyphHMetrics`][#stbtt_GetGlyphHMetrics].
        public final MemorySegment PFN_stbtt_GetGlyphHMetrics;
        /// The function address of [`stbtt_GetGlyphKernAdvance`][#stbtt_GetGlyphKernAdvance].
        public final MemorySegment PFN_stbtt_GetGlyphKernAdvance;
        /// The function address of [`stbtt_GetGlyphBox`][#stbtt_GetGlyphBox].
        public final MemorySegment PFN_stbtt_GetGlyphBox;
        /// The function address of [`stbtt_GetKerningTableLength`][#stbtt_GetKerningTableLength].
        public final MemorySegment PFN_stbtt_GetKerningTableLength;
        /// The function address of [`stbtt_GetKerningTable`][#stbtt_GetKerningTable].
        public final MemorySegment PFN_stbtt_GetKerningTable;
        /// The function address of [`stbtt_IsGlyphEmpty`][#stbtt_IsGlyphEmpty].
        public final MemorySegment PFN_stbtt_IsGlyphEmpty;
        /// The function address of [`stbtt_GetCodepointShape`][#stbtt_GetCodepointShape].
        public final MemorySegment PFN_stbtt_GetCodepointShape;
        /// The function address of [`stbtt_GetGlyphShape`][#stbtt_GetGlyphShape].
        public final MemorySegment PFN_stbtt_GetGlyphShape;
        /// The function address of [`stbtt_FreeShape`][#stbtt_FreeShape].
        public final MemorySegment PFN_stbtt_FreeShape;
        /// The function address of [`stbtt_FindSVGDoc`][#stbtt_FindSVGDoc].
        public final MemorySegment PFN_stbtt_FindSVGDoc;
        /// The function address of [`stbtt_GetCodepointSVG`][#stbtt_GetCodepointSVG].
        public final MemorySegment PFN_stbtt_GetCodepointSVG;
        /// The function address of [`stbtt_GetGlyphSVG`][#stbtt_GetGlyphSVG].
        public final MemorySegment PFN_stbtt_GetGlyphSVG;
        /// The function address of [`stbtt_FreeBitmap`][#stbtt_FreeBitmap].
        public final MemorySegment PFN_stbtt_FreeBitmap;
        /// The function address of [`stbtt_GetCodepointBitmap`][#stbtt_GetCodepointBitmap].
        public final MemorySegment PFN_stbtt_GetCodepointBitmap;
        /// The function address of [`stbtt_GetCodepointBitmapSubpixel`][#stbtt_GetCodepointBitmapSubpixel].
        public final MemorySegment PFN_stbtt_GetCodepointBitmapSubpixel;
        /// The function address of [`stbtt_MakeCodepointBitmap`][#stbtt_MakeCodepointBitmap].
        public final MemorySegment PFN_stbtt_MakeCodepointBitmap;
        /// The function address of [`stbtt_MakeCodepointBitmapSubpixel`][#stbtt_MakeCodepointBitmapSubpixel].
        public final MemorySegment PFN_stbtt_MakeCodepointBitmapSubpixel;
        /// The function address of [`stbtt_MakeCodepointBitmapSubpixelPrefilter`][#stbtt_MakeCodepointBitmapSubpixelPrefilter].
        public final MemorySegment PFN_stbtt_MakeCodepointBitmapSubpixelPrefilter;
        /// The function address of [`stbtt_GetCodepointBitmapBox`][#stbtt_GetCodepointBitmapBox].
        public final MemorySegment PFN_stbtt_GetCodepointBitmapBox;
        /// The function address of [`stbtt_GetCodepointBitmapBoxSubpixel`][#stbtt_GetCodepointBitmapBoxSubpixel].
        public final MemorySegment PFN_stbtt_GetCodepointBitmapBoxSubpixel;
        /// The function address of [`stbtt_GetGlyphBitmap`][#stbtt_GetGlyphBitmap].
        public final MemorySegment PFN_stbtt_GetGlyphBitmap;
        /// The function address of [`stbtt_GetGlyphBitmapSubpixel`][#stbtt_GetGlyphBitmapSubpixel].
        public final MemorySegment PFN_stbtt_GetGlyphBitmapSubpixel;
        /// The function address of [`stbtt_MakeGlyphBitmap`][#stbtt_MakeGlyphBitmap].
        public final MemorySegment PFN_stbtt_MakeGlyphBitmap;
        /// The function address of [`stbtt_MakeGlyphBitmapSubpixel`][#stbtt_MakeGlyphBitmapSubpixel].
        public final MemorySegment PFN_stbtt_MakeGlyphBitmapSubpixel;
        /// The function address of [`stbtt_MakeGlyphBitmapSubpixelPrefilter`][#stbtt_MakeGlyphBitmapSubpixelPrefilter].
        public final MemorySegment PFN_stbtt_MakeGlyphBitmapSubpixelPrefilter;
        /// The function address of [`stbtt_GetGlyphBitmapBox`][#stbtt_GetGlyphBitmapBox].
        public final MemorySegment PFN_stbtt_GetGlyphBitmapBox;
        /// The function address of [`stbtt_GetGlyphBitmapBoxSubpixel`][#stbtt_GetGlyphBitmapBoxSubpixel].
        public final MemorySegment PFN_stbtt_GetGlyphBitmapBoxSubpixel;
        /// The function address of [`stbtt_Rasterize`][#stbtt_Rasterize].
        public final MemorySegment PFN_stbtt_Rasterize;
        /// The function address of [`stbtt_FreeSDF`][#stbtt_FreeSDF].
        public final MemorySegment PFN_stbtt_FreeSDF;
        /// The function address of [`stbtt_GetGlyphSDF`][#stbtt_GetGlyphSDF].
        public final MemorySegment PFN_stbtt_GetGlyphSDF;
        /// The function address of [`stbtt_GetCodepointSDF`][#stbtt_GetCodepointSDF].
        public final MemorySegment PFN_stbtt_GetCodepointSDF;
        /// The function address of [`stbtt_FindMatchingFont`][#stbtt_FindMatchingFont].
        public final MemorySegment PFN_stbtt_FindMatchingFont;
        /// The function address of [`stbtt_CompareUTF8toUTF16_bigendian`][#stbtt_CompareUTF8toUTF16_bigendian].
        public final MemorySegment PFN_stbtt_CompareUTF8toUTF16_bigendian;
        /// The function address of [`stbtt_GetFontNameString`][#stbtt_GetFontNameString].
        public final MemorySegment PFN_stbtt_GetFontNameString;

        private Handles() {
            var _lookup = STBLibrary.lookup();
            PFN_stbtt_BakeFontBitmap = _lookup.findOrThrow("stbtt_BakeFontBitmap");
            PFN_stbtt_GetBakedQuad = _lookup.findOrThrow("stbtt_GetBakedQuad");
            PFN_stbtt_GetScaledFontVMetrics = _lookup.findOrThrow("stbtt_GetScaledFontVMetrics");
            PFN_stbtt_PackBegin = _lookup.findOrThrow("stbtt_PackBegin");
            PFN_stbtt_PackEnd = _lookup.findOrThrow("stbtt_PackEnd");
            PFN_stbtt_PackFontRange = _lookup.findOrThrow("stbtt_PackFontRange");
            PFN_stbtt_PackFontRanges = _lookup.findOrThrow("stbtt_PackFontRanges");
            PFN_stbtt_PackSetOversampling = _lookup.findOrThrow("stbtt_PackSetOversampling");
            PFN_stbtt_PackSetSkipMissingCodepoints = _lookup.findOrThrow("stbtt_PackSetSkipMissingCodepoints");
            PFN_stbtt_GetPackedQuad = _lookup.findOrThrow("stbtt_GetPackedQuad");
            PFN_stbtt_PackFontRangesGatherRects = _lookup.findOrThrow("stbtt_PackFontRangesGatherRects");
            PFN_stbtt_PackFontRangesPackRects = _lookup.findOrThrow("stbtt_PackFontRangesPackRects");
            PFN_stbtt_PackFontRangesRenderIntoRects = _lookup.findOrThrow("stbtt_PackFontRangesRenderIntoRects");
            PFN_stbtt_GetNumberOfFonts = _lookup.findOrThrow("stbtt_GetNumberOfFonts");
            PFN_stbtt_GetFontOffsetForIndex = _lookup.findOrThrow("stbtt_GetFontOffsetForIndex");
            PFN_stbtt_InitFont = _lookup.findOrThrow("stbtt_InitFont");
            PFN_stbtt_FindGlyphIndex = _lookup.findOrThrow("stbtt_FindGlyphIndex");
            PFN_stbtt_ScaleForPixelHeight = _lookup.findOrThrow("stbtt_ScaleForPixelHeight");
            PFN_stbtt_ScaleForMappingEmToPixels = _lookup.findOrThrow("stbtt_ScaleForMappingEmToPixels");
            PFN_stbtt_GetFontVMetrics = _lookup.findOrThrow("stbtt_GetFontVMetrics");
            PFN_stbtt_GetFontVMetricsOS2 = _lookup.findOrThrow("stbtt_GetFontVMetricsOS2");
            PFN_stbtt_GetFontBoundingBox = _lookup.findOrThrow("stbtt_GetFontBoundingBox");
            PFN_stbtt_GetCodepointHMetrics = _lookup.findOrThrow("stbtt_GetCodepointHMetrics");
            PFN_stbtt_GetCodepointKernAdvance = _lookup.findOrThrow("stbtt_GetCodepointKernAdvance");
            PFN_stbtt_GetCodepointBox = _lookup.findOrThrow("stbtt_GetCodepointBox");
            PFN_stbtt_GetGlyphHMetrics = _lookup.findOrThrow("stbtt_GetGlyphHMetrics");
            PFN_stbtt_GetGlyphKernAdvance = _lookup.findOrThrow("stbtt_GetGlyphKernAdvance");
            PFN_stbtt_GetGlyphBox = _lookup.findOrThrow("stbtt_GetGlyphBox");
            PFN_stbtt_GetKerningTableLength = _lookup.findOrThrow("stbtt_GetKerningTableLength");
            PFN_stbtt_GetKerningTable = _lookup.findOrThrow("stbtt_GetKerningTable");
            PFN_stbtt_IsGlyphEmpty = _lookup.findOrThrow("stbtt_IsGlyphEmpty");
            PFN_stbtt_GetCodepointShape = _lookup.findOrThrow("stbtt_GetCodepointShape");
            PFN_stbtt_GetGlyphShape = _lookup.findOrThrow("stbtt_GetGlyphShape");
            PFN_stbtt_FreeShape = _lookup.findOrThrow("stbtt_FreeShape");
            PFN_stbtt_FindSVGDoc = _lookup.findOrThrow("stbtt_FindSVGDoc");
            PFN_stbtt_GetCodepointSVG = _lookup.findOrThrow("stbtt_GetCodepointSVG");
            PFN_stbtt_GetGlyphSVG = _lookup.findOrThrow("stbtt_GetGlyphSVG");
            PFN_stbtt_FreeBitmap = _lookup.findOrThrow("stbtt_FreeBitmap");
            PFN_stbtt_GetCodepointBitmap = _lookup.findOrThrow("stbtt_GetCodepointBitmap");
            PFN_stbtt_GetCodepointBitmapSubpixel = _lookup.findOrThrow("stbtt_GetCodepointBitmapSubpixel");
            PFN_stbtt_MakeCodepointBitmap = _lookup.findOrThrow("stbtt_MakeCodepointBitmap");
            PFN_stbtt_MakeCodepointBitmapSubpixel = _lookup.findOrThrow("stbtt_MakeCodepointBitmapSubpixel");
            PFN_stbtt_MakeCodepointBitmapSubpixelPrefilter = _lookup.findOrThrow("stbtt_MakeCodepointBitmapSubpixelPrefilter");
            PFN_stbtt_GetCodepointBitmapBox = _lookup.findOrThrow("stbtt_GetCodepointBitmapBox");
            PFN_stbtt_GetCodepointBitmapBoxSubpixel = _lookup.findOrThrow("stbtt_GetCodepointBitmapBoxSubpixel");
            PFN_stbtt_GetGlyphBitmap = _lookup.findOrThrow("stbtt_GetGlyphBitmap");
            PFN_stbtt_GetGlyphBitmapSubpixel = _lookup.findOrThrow("stbtt_GetGlyphBitmapSubpixel");
            PFN_stbtt_MakeGlyphBitmap = _lookup.findOrThrow("stbtt_MakeGlyphBitmap");
            PFN_stbtt_MakeGlyphBitmapSubpixel = _lookup.findOrThrow("stbtt_MakeGlyphBitmapSubpixel");
            PFN_stbtt_MakeGlyphBitmapSubpixelPrefilter = _lookup.findOrThrow("stbtt_MakeGlyphBitmapSubpixelPrefilter");
            PFN_stbtt_GetGlyphBitmapBox = _lookup.findOrThrow("stbtt_GetGlyphBitmapBox");
            PFN_stbtt_GetGlyphBitmapBoxSubpixel = _lookup.findOrThrow("stbtt_GetGlyphBitmapBoxSubpixel");
            PFN_stbtt_Rasterize = _lookup.findOrThrow("stbtt_Rasterize");
            PFN_stbtt_FreeSDF = _lookup.findOrThrow("stbtt_FreeSDF");
            PFN_stbtt_GetGlyphSDF = _lookup.findOrThrow("stbtt_GetGlyphSDF");
            PFN_stbtt_GetCodepointSDF = _lookup.findOrThrow("stbtt_GetCodepointSDF");
            PFN_stbtt_FindMatchingFont = _lookup.findOrThrow("stbtt_FindMatchingFont");
            PFN_stbtt_CompareUTF8toUTF16_bigendian = _lookup.findOrThrow("stbtt_CompareUTF8toUTF16_bigendian");
            PFN_stbtt_GetFontNameString = _lookup.findOrThrow("stbtt_GetFontNameString");
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `stbtt_BakeFontBitmap`.
    /// ```
    /// int stbtt_BakeFontBitmap(const unsigned char* data, int offset, float pixel_height, unsigned char* pixels, int pw, int ph, int first_char, int num_chars, stbtt_bakedchar* chardata);
    /// ```
    public static int stbtt_BakeFontBitmap(@NonNull MemorySegment data, int offset, float pixel_height, @NonNull MemorySegment pixels, int pw, int ph, int first_char, int num_chars, @NonNull MemorySegment chardata) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_BakeFontBitmap", data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, chardata); }
        return (int) Handles.MH_stbtt_BakeFontBitmap.get().invokeExact(Handles.get().PFN_stbtt_BakeFontBitmap, data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, chardata); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_BakeFontBitmap", e); }
    }

    /// Invokes `stbtt_GetBakedQuad`.
    /// ```
    /// void stbtt_GetBakedQuad(const stbtt_bakedchar* chardata, int pw, int ph, int char_index, float* xpos, float* ypos, stbtt_aligned_quad* q, int opengl_fillrule);
    /// ```
    public static void stbtt_GetBakedQuad(@NonNull MemorySegment chardata, int pw, int ph, int char_index, @NonNull MemorySegment xpos, @NonNull MemorySegment ypos, @NonNull MemorySegment q, int opengl_fillrule) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetBakedQuad", chardata, pw, ph, char_index, xpos, ypos, q, opengl_fillrule); }
        Handles.MH_stbtt_GetBakedQuad.get().invokeExact(Handles.get().PFN_stbtt_GetBakedQuad, chardata, pw, ph, char_index, xpos, ypos, q, opengl_fillrule); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetBakedQuad", e); }
    }

    /// Invokes `stbtt_GetScaledFontVMetrics`.
    /// ```
    /// void stbtt_GetScaledFontVMetrics(const unsigned char* fontdata, int index, float size, float* ascent, float* descent, float* lineGap);
    /// ```
    public static void stbtt_GetScaledFontVMetrics(@NonNull MemorySegment fontdata, int index, float size, @NonNull MemorySegment ascent, @NonNull MemorySegment descent, @NonNull MemorySegment lineGap) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetScaledFontVMetrics", fontdata, index, size, ascent, descent, lineGap); }
        Handles.MH_stbtt_GetScaledFontVMetrics.get().invokeExact(Handles.get().PFN_stbtt_GetScaledFontVMetrics, fontdata, index, size, ascent, descent, lineGap); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetScaledFontVMetrics", e); }
    }

    /// Invokes `stbtt_PackBegin`.
    /// ```
    /// (int) STBbool stbtt_PackBegin(stbtt_pack_context* spc, unsigned char* pixels, int width, int height, int stride_in_bytes, int padding, void* alloc_context);
    /// ```
    public static boolean stbtt_PackBegin(@NonNull MemorySegment spc, @NonNull MemorySegment pixels, int width, int height, int stride_in_bytes, int padding, @NonNull MemorySegment alloc_context) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackBegin", spc, pixels, width, height, stride_in_bytes, padding, alloc_context); }
        return (((int) Handles.MH_stbtt_PackBegin.get().invokeExact(Handles.get().PFN_stbtt_PackBegin, spc, pixels, width, height, stride_in_bytes, padding, alloc_context)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackBegin", e); }
    }

    /// Invokes `stbtt_PackEnd`.
    /// ```
    /// void stbtt_PackEnd(stbtt_pack_context* spc);
    /// ```
    public static void stbtt_PackEnd(@NonNull MemorySegment spc) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackEnd", spc); }
        Handles.MH_stbtt_PackEnd.get().invokeExact(Handles.get().PFN_stbtt_PackEnd, spc); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackEnd", e); }
    }

    /// Invokes `stbtt_PackFontRange`.
    /// ```
    /// (int) STBbool stbtt_PackFontRange(stbtt_pack_context* spc, const unsigned char* fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, stbtt_packedchar* chardata_for_range);
    /// ```
    public static boolean stbtt_PackFontRange(@NonNull MemorySegment spc, @NonNull MemorySegment fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, @NonNull MemorySegment chardata_for_range) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackFontRange", spc, fontdata, font_index, font_size, first_unicode_char_in_range, num_chars_in_range, chardata_for_range); }
        return (((int) Handles.MH_stbtt_PackFontRange.get().invokeExact(Handles.get().PFN_stbtt_PackFontRange, spc, fontdata, font_index, font_size, first_unicode_char_in_range, num_chars_in_range, chardata_for_range)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRange", e); }
    }

    /// Invokes `stbtt_PackFontRanges`.
    /// ```
    /// int stbtt_PackFontRanges(stbtt_pack_context* spc, const unsigned char* fontdata, int font_index, stbtt_pack_range* ranges, int num_ranges);
    /// ```
    public static int stbtt_PackFontRanges(@NonNull MemorySegment spc, @NonNull MemorySegment fontdata, int font_index, @NonNull MemorySegment ranges, int num_ranges) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackFontRanges", spc, fontdata, font_index, ranges, num_ranges); }
        return (int) Handles.MH_stbtt_PackFontRanges.get().invokeExact(Handles.get().PFN_stbtt_PackFontRanges, spc, fontdata, font_index, ranges, num_ranges); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRanges", e); }
    }

    /// Invokes `stbtt_PackSetOversampling`.
    /// ```
    /// void stbtt_PackSetOversampling(stbtt_pack_context* spc, unsigned int h_oversample, unsigned int v_oversample);
    /// ```
    public static void stbtt_PackSetOversampling(@NonNull MemorySegment spc, int h_oversample, int v_oversample) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackSetOversampling", spc, h_oversample, v_oversample); }
        Handles.MH_stbtt_PackSetOversampling.get().invokeExact(Handles.get().PFN_stbtt_PackSetOversampling, spc, h_oversample, v_oversample); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackSetOversampling", e); }
    }

    /// Invokes `stbtt_PackSetSkipMissingCodepoints`.
    /// ```
    /// void stbtt_PackSetSkipMissingCodepoints(stbtt_pack_context* spc, int skip);
    /// ```
    public static void stbtt_PackSetSkipMissingCodepoints(@NonNull MemorySegment spc, int skip) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackSetSkipMissingCodepoints", spc, skip); }
        Handles.MH_stbtt_PackSetSkipMissingCodepoints.get().invokeExact(Handles.get().PFN_stbtt_PackSetSkipMissingCodepoints, spc, skip); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackSetSkipMissingCodepoints", e); }
    }

    /// Invokes `stbtt_GetPackedQuad`.
    /// ```
    /// void stbtt_GetPackedQuad(const stbtt_packedchar* chardata, int pw, int ph, int char_index, float* xpos, float* ypos, stbtt_aligned_quad* q, int align_to_integer);
    /// ```
    public static void stbtt_GetPackedQuad(@NonNull MemorySegment chardata, int pw, int ph, int char_index, @NonNull MemorySegment xpos, @NonNull MemorySegment ypos, @NonNull MemorySegment q, int align_to_integer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetPackedQuad", chardata, pw, ph, char_index, xpos, ypos, q, align_to_integer); }
        Handles.MH_stbtt_GetPackedQuad.get().invokeExact(Handles.get().PFN_stbtt_GetPackedQuad, chardata, pw, ph, char_index, xpos, ypos, q, align_to_integer); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetPackedQuad", e); }
    }

    /// Invokes `stbtt_PackFontRangesGatherRects`.
    /// ```
    /// int stbtt_PackFontRangesGatherRects(stbtt_pack_context* spc, const stbtt_fontinfo* info, stbtt_pack_range* ranges, int num_ranges, stbrp_rect* rects);
    /// ```
    public static int stbtt_PackFontRangesGatherRects(@NonNull MemorySegment spc, @NonNull MemorySegment info, @NonNull MemorySegment ranges, int num_ranges, @NonNull MemorySegment rects) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackFontRangesGatherRects", spc, info, ranges, num_ranges, rects); }
        return (int) Handles.MH_stbtt_PackFontRangesGatherRects.get().invokeExact(Handles.get().PFN_stbtt_PackFontRangesGatherRects, spc, info, ranges, num_ranges, rects); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesGatherRects", e); }
    }

    /// Invokes `stbtt_PackFontRangesPackRects`.
    /// ```
    /// void stbtt_PackFontRangesPackRects(stbtt_pack_context* spc, stbrp_rect* rects, int num_rects);
    /// ```
    public static void stbtt_PackFontRangesPackRects(@NonNull MemorySegment spc, @NonNull MemorySegment rects, int num_rects) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackFontRangesPackRects", spc, rects, num_rects); }
        Handles.MH_stbtt_PackFontRangesPackRects.get().invokeExact(Handles.get().PFN_stbtt_PackFontRangesPackRects, spc, rects, num_rects); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesPackRects", e); }
    }

    /// Invokes `stbtt_PackFontRangesRenderIntoRects`.
    /// ```
    /// int stbtt_PackFontRangesRenderIntoRects(stbtt_pack_context* spc, const stbtt_fontinfo* info, stbtt_pack_range* ranges, int num_ranges, stbrp_rect* rects);
    /// ```
    public static int stbtt_PackFontRangesRenderIntoRects(@NonNull MemorySegment spc, @NonNull MemorySegment info, @NonNull MemorySegment ranges, int num_ranges, @NonNull MemorySegment rects) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_PackFontRangesRenderIntoRects", spc, info, ranges, num_ranges, rects); }
        return (int) Handles.MH_stbtt_PackFontRangesRenderIntoRects.get().invokeExact(Handles.get().PFN_stbtt_PackFontRangesRenderIntoRects, spc, info, ranges, num_ranges, rects); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesRenderIntoRects", e); }
    }

    /// Invokes `stbtt_GetNumberOfFonts`.
    /// ```
    /// int stbtt_GetNumberOfFonts(const unsigned char* data);
    /// ```
    public static int stbtt_GetNumberOfFonts(@NonNull MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetNumberOfFonts", data); }
        return (int) Handles.MH_stbtt_GetNumberOfFonts.get().invokeExact(Handles.get().PFN_stbtt_GetNumberOfFonts, data); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetNumberOfFonts", e); }
    }

    /// Invokes `stbtt_GetFontOffsetForIndex`.
    /// ```
    /// int stbtt_GetFontOffsetForIndex(const unsigned char* data, int index);
    /// ```
    public static int stbtt_GetFontOffsetForIndex(@NonNull MemorySegment data, int index) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetFontOffsetForIndex", data, index); }
        return (int) Handles.MH_stbtt_GetFontOffsetForIndex.get().invokeExact(Handles.get().PFN_stbtt_GetFontOffsetForIndex, data, index); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontOffsetForIndex", e); }
    }

    /// Invokes `stbtt_InitFont`.
    /// ```
    /// (int) STBbool stbtt_InitFont(stbtt_fontinfo* info, const unsigned char* data, int offset);
    /// ```
    public static boolean stbtt_InitFont(@NonNull MemorySegment info, @NonNull MemorySegment data, int offset) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_InitFont", info, data, offset); }
        return (((int) Handles.MH_stbtt_InitFont.get().invokeExact(Handles.get().PFN_stbtt_InitFont, info, data, offset)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_InitFont", e); }
    }

    /// Invokes `stbtt_FindGlyphIndex`.
    /// ```
    /// int stbtt_FindGlyphIndex(const stbtt_fontinfo* info, int unicode_codepoint);
    /// ```
    public static int stbtt_FindGlyphIndex(@NonNull MemorySegment info, int unicode_codepoint) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_FindGlyphIndex", info, unicode_codepoint); }
        return (int) Handles.MH_stbtt_FindGlyphIndex.get().invokeExact(Handles.get().PFN_stbtt_FindGlyphIndex, info, unicode_codepoint); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_FindGlyphIndex", e); }
    }

    /// Invokes `stbtt_ScaleForPixelHeight`.
    /// ```
    /// float stbtt_ScaleForPixelHeight(const stbtt_fontinfo* info, float pixels);
    /// ```
    public static float stbtt_ScaleForPixelHeight(@NonNull MemorySegment info, float pixels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_ScaleForPixelHeight", info, pixels); }
        return (float) Handles.MH_stbtt_ScaleForPixelHeight.get().invokeExact(Handles.get().PFN_stbtt_ScaleForPixelHeight, info, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_ScaleForPixelHeight", e); }
    }

    /// Invokes `stbtt_ScaleForMappingEmToPixels`.
    /// ```
    /// float stbtt_ScaleForMappingEmToPixels(const stbtt_fontinfo* info, float pixels);
    /// ```
    public static float stbtt_ScaleForMappingEmToPixels(@NonNull MemorySegment info, float pixels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_ScaleForMappingEmToPixels", info, pixels); }
        return (float) Handles.MH_stbtt_ScaleForMappingEmToPixels.get().invokeExact(Handles.get().PFN_stbtt_ScaleForMappingEmToPixels, info, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_ScaleForMappingEmToPixels", e); }
    }

    /// Invokes `stbtt_GetFontVMetrics`.
    /// ```
    /// void stbtt_GetFontVMetrics(const stbtt_fontinfo* info, int* ascent, int* descent, int* lineGap);
    /// ```
    public static void stbtt_GetFontVMetrics(@NonNull MemorySegment info, @NonNull MemorySegment ascent, @NonNull MemorySegment descent, @NonNull MemorySegment lineGap) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetFontVMetrics", info, ascent, descent, lineGap); }
        Handles.MH_stbtt_GetFontVMetrics.get().invokeExact(Handles.get().PFN_stbtt_GetFontVMetrics, info, ascent, descent, lineGap); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetrics", e); }
    }

    /// Invokes `stbtt_GetFontVMetricsOS2`.
    /// ```
    /// (int) STBbool stbtt_GetFontVMetricsOS2(const stbtt_fontinfo* info, int* typoAscent, int* typoDescent, int* typoLineGap);
    /// ```
    public static boolean stbtt_GetFontVMetricsOS2(@NonNull MemorySegment info, @NonNull MemorySegment typoAscent, @NonNull MemorySegment typoDescent, @NonNull MemorySegment typoLineGap) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetFontVMetricsOS2", info, typoAscent, typoDescent, typoLineGap); }
        return (((int) Handles.MH_stbtt_GetFontVMetricsOS2.get().invokeExact(Handles.get().PFN_stbtt_GetFontVMetricsOS2, info, typoAscent, typoDescent, typoLineGap)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetricsOS2", e); }
    }

    /// Invokes `stbtt_GetFontBoundingBox`.
    /// ```
    /// void stbtt_GetFontBoundingBox(const stbtt_fontinfo* info, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static void stbtt_GetFontBoundingBox(@NonNull MemorySegment info, @NonNull MemorySegment x0, @NonNull MemorySegment y0, @NonNull MemorySegment x1, @NonNull MemorySegment y1) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetFontBoundingBox", info, x0, y0, x1, y1); }
        Handles.MH_stbtt_GetFontBoundingBox.get().invokeExact(Handles.get().PFN_stbtt_GetFontBoundingBox, info, x0, y0, x1, y1); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontBoundingBox", e); }
    }

    /// Invokes `stbtt_GetCodepointHMetrics`.
    /// ```
    /// void stbtt_GetCodepointHMetrics(const stbtt_fontinfo* info, int codepoint, int* advanceWidth, int* leftSideBearing);
    /// ```
    public static void stbtt_GetCodepointHMetrics(@NonNull MemorySegment info, int codepoint, @NonNull MemorySegment advanceWidth, @NonNull MemorySegment leftSideBearing) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointHMetrics", info, codepoint, advanceWidth, leftSideBearing); }
        Handles.MH_stbtt_GetCodepointHMetrics.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointHMetrics, info, codepoint, advanceWidth, leftSideBearing); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointHMetrics", e); }
    }

    /// Invokes `stbtt_GetCodepointKernAdvance`.
    /// ```
    /// int stbtt_GetCodepointKernAdvance(const stbtt_fontinfo* info, int ch1, int ch2);
    /// ```
    public static int stbtt_GetCodepointKernAdvance(@NonNull MemorySegment info, int ch1, int ch2) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointKernAdvance", info, ch1, ch2); }
        return (int) Handles.MH_stbtt_GetCodepointKernAdvance.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointKernAdvance, info, ch1, ch2); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointKernAdvance", e); }
    }

    /// Invokes `stbtt_GetCodepointBox`.
    /// ```
    /// int stbtt_GetCodepointBox(const stbtt_fontinfo* info, int codepoint, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static int stbtt_GetCodepointBox(@NonNull MemorySegment info, int codepoint, @NonNull MemorySegment x0, @NonNull MemorySegment y0, @NonNull MemorySegment x1, @NonNull MemorySegment y1) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointBox", info, codepoint, x0, y0, x1, y1); }
        return (int) Handles.MH_stbtt_GetCodepointBox.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointBox, info, codepoint, x0, y0, x1, y1); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBox", e); }
    }

    /// Invokes `stbtt_GetGlyphHMetrics`.
    /// ```
    /// void stbtt_GetGlyphHMetrics(const stbtt_fontinfo* info, int glyph_index, int* advanceWidth, int* leftSideBearing);
    /// ```
    public static void stbtt_GetGlyphHMetrics(@NonNull MemorySegment info, int glyph_index, @NonNull MemorySegment advanceWidth, @NonNull MemorySegment leftSideBearing) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphHMetrics", info, glyph_index, advanceWidth, leftSideBearing); }
        Handles.MH_stbtt_GetGlyphHMetrics.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphHMetrics, info, glyph_index, advanceWidth, leftSideBearing); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphHMetrics", e); }
    }

    /// Invokes `stbtt_GetGlyphKernAdvance`.
    /// ```
    /// int stbtt_GetGlyphKernAdvance(const stbtt_fontinfo* info, int glyph1, int glyph2);
    /// ```
    public static int stbtt_GetGlyphKernAdvance(@NonNull MemorySegment info, int glyph1, int glyph2) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphKernAdvance", info, glyph1, glyph2); }
        return (int) Handles.MH_stbtt_GetGlyphKernAdvance.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphKernAdvance, info, glyph1, glyph2); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphKernAdvance", e); }
    }

    /// Invokes `stbtt_GetGlyphBox`.
    /// ```
    /// int stbtt_GetGlyphBox(const stbtt_fontinfo* info, int glyph_index, int* x0, int* y0, int* x1, int* y1);
    /// ```
    public static int stbtt_GetGlyphBox(@NonNull MemorySegment info, int glyph_index, @NonNull MemorySegment x0, @NonNull MemorySegment y0, @NonNull MemorySegment x1, @NonNull MemorySegment y1) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphBox", info, glyph_index, x0, y0, x1, y1); }
        return (int) Handles.MH_stbtt_GetGlyphBox.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphBox, info, glyph_index, x0, y0, x1, y1); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBox", e); }
    }

    /// Invokes `stbtt_GetKerningTableLength`.
    /// ```
    /// int stbtt_GetKerningTableLength(const stbtt_fontinfo* info);
    /// ```
    public static int stbtt_GetKerningTableLength(@NonNull MemorySegment info) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetKerningTableLength", info); }
        return (int) Handles.MH_stbtt_GetKerningTableLength.get().invokeExact(Handles.get().PFN_stbtt_GetKerningTableLength, info); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetKerningTableLength", e); }
    }

    /// Invokes `stbtt_GetKerningTable`.
    /// ```
    /// int stbtt_GetKerningTable(const stbtt_fontinfo* info, stbtt_kerningentry* table, int table_length);
    /// ```
    public static int stbtt_GetKerningTable(@NonNull MemorySegment info, @NonNull MemorySegment table, int table_length) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetKerningTable", info, table, table_length); }
        return (int) Handles.MH_stbtt_GetKerningTable.get().invokeExact(Handles.get().PFN_stbtt_GetKerningTable, info, table, table_length); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetKerningTable", e); }
    }

    /// Invokes `stbtt_IsGlyphEmpty`.
    /// ```
    /// (int) STBbool stbtt_IsGlyphEmpty(const stbtt_fontinfo* info, int glyph_index);
    /// ```
    public static boolean stbtt_IsGlyphEmpty(@NonNull MemorySegment info, int glyph_index) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_IsGlyphEmpty", info, glyph_index); }
        return (((int) Handles.MH_stbtt_IsGlyphEmpty.get().invokeExact(Handles.get().PFN_stbtt_IsGlyphEmpty, info, glyph_index)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_IsGlyphEmpty", e); }
    }

    /// Invokes `stbtt_GetCodepointShape`.
    /// ```
    /// int stbtt_GetCodepointShape(const stbtt_fontinfo* info, int unicode_codepoint, stbtt_vertex** vertices);
    /// ```
    public static int stbtt_GetCodepointShape(@NonNull MemorySegment info, int unicode_codepoint, @NonNull MemorySegment vertices) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointShape", info, unicode_codepoint, vertices); }
        return (int) Handles.MH_stbtt_GetCodepointShape.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointShape, info, unicode_codepoint, vertices); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointShape", e); }
    }

    /// Invokes `stbtt_GetGlyphShape`.
    /// ```
    /// int stbtt_GetGlyphShape(const stbtt_fontinfo* info, int glyph_index, stbtt_vertex** vertices);
    /// ```
    public static int stbtt_GetGlyphShape(@NonNull MemorySegment info, int glyph_index, @NonNull MemorySegment vertices) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphShape", info, glyph_index, vertices); }
        return (int) Handles.MH_stbtt_GetGlyphShape.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphShape, info, glyph_index, vertices); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphShape", e); }
    }

    /// Invokes `stbtt_FreeShape`.
    /// ```
    /// void stbtt_FreeShape(const stbtt_fontinfo* info, stbtt_vertex* vertices);
    /// ```
    public static void stbtt_FreeShape(@NonNull MemorySegment info, @NonNull MemorySegment vertices) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_FreeShape", info, vertices); }
        Handles.MH_stbtt_FreeShape.get().invokeExact(Handles.get().PFN_stbtt_FreeShape, info, vertices); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeShape", e); }
    }

    /// Invokes `stbtt_FindSVGDoc`.
    /// ```
    /// unsigned char* stbtt_FindSVGDoc(const stbtt_fontinfo* info, int gl);
    /// ```
    public static @NonNull MemorySegment stbtt_FindSVGDoc(@NonNull MemorySegment info, int gl) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_FindSVGDoc", info, gl); }
        return (MemorySegment) Handles.MH_stbtt_FindSVGDoc.get().invokeExact(Handles.get().PFN_stbtt_FindSVGDoc, info, gl); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_FindSVGDoc", e); }
    }

    /// Invokes `stbtt_GetCodepointSVG`.
    /// ```
    /// int stbtt_GetCodepointSVG(const stbtt_fontinfo* info, int unicode_codepoint, const char** svg);
    /// ```
    public static int stbtt_GetCodepointSVG(@NonNull MemorySegment info, int unicode_codepoint, @NonNull MemorySegment svg) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointSVG", info, unicode_codepoint, svg); }
        return (int) Handles.MH_stbtt_GetCodepointSVG.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointSVG, info, unicode_codepoint, svg); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSVG", e); }
    }

    /// Invokes `stbtt_GetGlyphSVG`.
    /// ```
    /// int stbtt_GetGlyphSVG(const stbtt_fontinfo* info, int gl, const char** svg);
    /// ```
    public static int stbtt_GetGlyphSVG(@NonNull MemorySegment info, int gl, @NonNull MemorySegment svg) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphSVG", info, gl, svg); }
        return (int) Handles.MH_stbtt_GetGlyphSVG.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphSVG, info, gl, svg); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSVG", e); }
    }

    /// Invokes `stbtt_FreeBitmap`.
    /// ```
    /// void stbtt_FreeBitmap(unsigned char* bitmap, void* userdata);
    /// ```
    public static void stbtt_FreeBitmap(@NonNull MemorySegment bitmap, @NonNull MemorySegment userdata) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_FreeBitmap", bitmap, userdata); }
        Handles.MH_stbtt_FreeBitmap.get().invokeExact(Handles.get().PFN_stbtt_FreeBitmap, bitmap, userdata); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeBitmap", e); }
    }

    /// Invokes `stbtt_GetCodepointBitmap`.
    /// ```
    /// unsigned char* stbtt_GetCodepointBitmap(const stbtt_fontinfo* info, float scale_x, float scale_y, int codepoint, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetCodepointBitmap(@NonNull MemorySegment info, float scale_x, float scale_y, int codepoint, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointBitmap", info, scale_x, scale_y, codepoint, width, height, xoff, yoff); }
        return (MemorySegment) Handles.MH_stbtt_GetCodepointBitmap.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmap, info, scale_x, scale_y, codepoint, width, height, xoff, yoff); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmap", e); }
    }

    /// Invokes `stbtt_GetCodepointBitmapSubpixel`.
    /// ```
    /// unsigned char* stbtt_GetCodepointBitmapSubpixel(const stbtt_fontinfo* info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetCodepointBitmapSubpixel(@NonNull MemorySegment info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointBitmapSubpixel", info, scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff); }
        return (MemorySegment) Handles.MH_stbtt_GetCodepointBitmapSubpixel.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapSubpixel, info, scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapSubpixel", e); }
    }

    /// Invokes `stbtt_MakeCodepointBitmap`.
    /// ```
    /// void stbtt_MakeCodepointBitmap(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmap(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_MakeCodepointBitmap", info, output, out_w, out_h, out_stride, scale_x, scale_y, codepoint); }
        Handles.MH_stbtt_MakeCodepointBitmap.get().invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmap, info, output, out_w, out_h, out_stride, scale_x, scale_y, codepoint); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmap", e); }
    }

    /// Invokes `stbtt_MakeCodepointBitmapSubpixel`.
    /// ```
    /// void stbtt_MakeCodepointBitmapSubpixel(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmapSubpixel(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_MakeCodepointBitmapSubpixel", info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint); }
        Handles.MH_stbtt_MakeCodepointBitmapSubpixel.get().invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmapSubpixel, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixel", e); }
    }

    /// Invokes `stbtt_MakeCodepointBitmapSubpixelPrefilter`.
    /// ```
    /// void stbtt_MakeCodepointBitmapSubpixelPrefilter(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float* sub_x, float* sub_y, int codepoint);
    /// ```
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NonNull MemorySegment sub_x, @NonNull MemorySegment sub_y, int codepoint) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_MakeCodepointBitmapSubpixelPrefilter", info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint); }
        Handles.MH_stbtt_MakeCodepointBitmapSubpixelPrefilter.get().invokeExact(Handles.get().PFN_stbtt_MakeCodepointBitmapSubpixelPrefilter, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixelPrefilter", e); }
    }

    /// Invokes `stbtt_GetCodepointBitmapBox`.
    /// ```
    /// void stbtt_GetCodepointBitmapBox(const stbtt_fontinfo* font, int codepoint, float scale_x, float scale_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetCodepointBitmapBox(@NonNull MemorySegment font, int codepoint, float scale_x, float scale_y, @NonNull MemorySegment ix0, @NonNull MemorySegment iy0, @NonNull MemorySegment ix1, @NonNull MemorySegment iy1) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointBitmapBox", font, codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1); }
        Handles.MH_stbtt_GetCodepointBitmapBox.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapBox, font, codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBox", e); }
    }

    /// Invokes `stbtt_GetCodepointBitmapBoxSubpixel`.
    /// ```
    /// void stbtt_GetCodepointBitmapBoxSubpixel(const stbtt_fontinfo* font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetCodepointBitmapBoxSubpixel(@NonNull MemorySegment font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @NonNull MemorySegment ix0, @NonNull MemorySegment iy0, @NonNull MemorySegment ix1, @NonNull MemorySegment iy1) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointBitmapBoxSubpixel", font, codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1); }
        Handles.MH_stbtt_GetCodepointBitmapBoxSubpixel.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointBitmapBoxSubpixel, font, codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBoxSubpixel", e); }
    }

    /// Invokes `stbtt_GetGlyphBitmap`.
    /// ```
    /// unsigned char* stbtt_GetGlyphBitmap(const stbtt_fontinfo* info, float scale_x, float scale_y, int glyph, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetGlyphBitmap(@NonNull MemorySegment info, float scale_x, float scale_y, int glyph, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphBitmap", info, scale_x, scale_y, glyph, width, height, xoff, yoff); }
        return (MemorySegment) Handles.MH_stbtt_GetGlyphBitmap.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmap, info, scale_x, scale_y, glyph, width, height, xoff, yoff); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmap", e); }
    }

    /// Invokes `stbtt_GetGlyphBitmapSubpixel`.
    /// ```
    /// unsigned char* stbtt_GetGlyphBitmapSubpixel(const stbtt_fontinfo* info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetGlyphBitmapSubpixel(@NonNull MemorySegment info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphBitmapSubpixel", info, scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff); }
        return (MemorySegment) Handles.MH_stbtt_GetGlyphBitmapSubpixel.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapSubpixel, info, scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapSubpixel", e); }
    }

    /// Invokes `stbtt_MakeGlyphBitmap`.
    /// ```
    /// void stbtt_MakeGlyphBitmap(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmap(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_MakeGlyphBitmap", info, output, out_w, out_h, out_stride, scale_x, scale_y, glyph); }
        Handles.MH_stbtt_MakeGlyphBitmap.get().invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmap, info, output, out_w, out_h, out_stride, scale_x, scale_y, glyph); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmap", e); }
    }

    /// Invokes `stbtt_MakeGlyphBitmapSubpixel`.
    /// ```
    /// void stbtt_MakeGlyphBitmapSubpixel(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmapSubpixel(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_MakeGlyphBitmapSubpixel", info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph); }
        Handles.MH_stbtt_MakeGlyphBitmapSubpixel.get().invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmapSubpixel, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixel", e); }
    }

    /// Invokes `stbtt_MakeGlyphBitmapSubpixelPrefilter`.
    /// ```
    /// void stbtt_MakeGlyphBitmapSubpixelPrefilter(const stbtt_fontinfo* info, unsigned char* output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float* sub_x, float* sub_y, int glyph);
    /// ```
    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@NonNull MemorySegment info, @NonNull MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NonNull MemorySegment sub_x, @NonNull MemorySegment sub_y, int glyph) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_MakeGlyphBitmapSubpixelPrefilter", info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph); }
        Handles.MH_stbtt_MakeGlyphBitmapSubpixelPrefilter.get().invokeExact(Handles.get().PFN_stbtt_MakeGlyphBitmapSubpixelPrefilter, info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixelPrefilter", e); }
    }

    /// Invokes `stbtt_GetGlyphBitmapBox`.
    /// ```
    /// void stbtt_GetGlyphBitmapBox(const stbtt_fontinfo* font, int glyph, float scale_x, float scale_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetGlyphBitmapBox(@NonNull MemorySegment font, int glyph, float scale_x, float scale_y, @NonNull MemorySegment ix0, @NonNull MemorySegment iy0, @NonNull MemorySegment ix1, @NonNull MemorySegment iy1) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphBitmapBox", font, glyph, scale_x, scale_y, ix0, iy0, ix1, iy1); }
        Handles.MH_stbtt_GetGlyphBitmapBox.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapBox, font, glyph, scale_x, scale_y, ix0, iy0, ix1, iy1); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBox", e); }
    }

    /// Invokes `stbtt_GetGlyphBitmapBoxSubpixel`.
    /// ```
    /// void stbtt_GetGlyphBitmapBoxSubpixel(const stbtt_fontinfo* font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int* ix0, int* iy0, int* ix1, int* iy1);
    /// ```
    public static void stbtt_GetGlyphBitmapBoxSubpixel(@NonNull MemorySegment font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @NonNull MemorySegment ix0, @NonNull MemorySegment iy0, @NonNull MemorySegment ix1, @NonNull MemorySegment iy1) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphBitmapBoxSubpixel", font, glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1); }
        Handles.MH_stbtt_GetGlyphBitmapBoxSubpixel.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphBitmapBoxSubpixel, font, glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBoxSubpixel", e); }
    }

    /// Invokes `stbtt_Rasterize`.
    /// ```
    /// void stbtt_Rasterize(stbtt__bitmap* result, float flatness_in_pixels, stbtt_vertex* vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, void* userdata);
    /// ```
    public static void stbtt_Rasterize(@NonNull MemorySegment result, float flatness_in_pixels, @NonNull MemorySegment vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, @NonNull MemorySegment userdata) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_Rasterize", result, flatness_in_pixels, vertices, num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, userdata); }
        Handles.MH_stbtt_Rasterize.get().invokeExact(Handles.get().PFN_stbtt_Rasterize, result, flatness_in_pixels, vertices, num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, userdata); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_Rasterize", e); }
    }

    /// Invokes `stbtt_FreeSDF`.
    /// ```
    /// void stbtt_FreeSDF(unsigned char* bitmap, void* userdata);
    /// ```
    public static void stbtt_FreeSDF(@NonNull MemorySegment bitmap, @NonNull MemorySegment userdata) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_FreeSDF", bitmap, userdata); }
        Handles.MH_stbtt_FreeSDF.get().invokeExact(Handles.get().PFN_stbtt_FreeSDF, bitmap, userdata); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeSDF", e); }
    }

    /// Invokes `stbtt_GetGlyphSDF`.
    /// ```
    /// unsigned char* stbtt_GetGlyphSDF(const stbtt_fontinfo* info, float scale, int glyph, int padding, unsigned char onedge_value, float pixel_dist_scale, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetGlyphSDF(@NonNull MemorySegment info, float scale, int glyph, int padding, byte onedge_value, float pixel_dist_scale, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetGlyphSDF", info, scale, glyph, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff); }
        return (MemorySegment) Handles.MH_stbtt_GetGlyphSDF.get().invokeExact(Handles.get().PFN_stbtt_GetGlyphSDF, info, scale, glyph, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSDF", e); }
    }

    /// Invokes `stbtt_GetCodepointSDF`.
    /// ```
    /// unsigned char* stbtt_GetCodepointSDF(const stbtt_fontinfo* info, float scale, int codepoint, int padding, unsigned char onedge_value, float pixel_dist_scale, int* width, int* height, int* xoff, int* yoff);
    /// ```
    public static @NonNull MemorySegment stbtt_GetCodepointSDF(@NonNull MemorySegment info, float scale, int codepoint, int padding, byte onedge_value, float pixel_dist_scale, @NonNull MemorySegment width, @NonNull MemorySegment height, @NonNull MemorySegment xoff, @NonNull MemorySegment yoff) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetCodepointSDF", info, scale, codepoint, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff); }
        return (MemorySegment) Handles.MH_stbtt_GetCodepointSDF.get().invokeExact(Handles.get().PFN_stbtt_GetCodepointSDF, info, scale, codepoint, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSDF", e); }
    }

    /// Invokes `stbtt_FindMatchingFont`.
    /// ```
    /// int stbtt_FindMatchingFont(const unsigned char* fontdata, const char* name, int flags);
    /// ```
    public static int stbtt_FindMatchingFont(@NonNull MemorySegment fontdata, @NonNull MemorySegment name, int flags) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_FindMatchingFont", fontdata, name, flags); }
        return (int) Handles.MH_stbtt_FindMatchingFont.get().invokeExact(Handles.get().PFN_stbtt_FindMatchingFont, fontdata, name, flags); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_FindMatchingFont", e); }
    }

    /// Invokes `stbtt_CompareUTF8toUTF16_bigendian`.
    /// ```
    /// (int) STBbool stbtt_CompareUTF8toUTF16_bigendian(const char* s1, int len1, const char* s2, int len2);
    /// ```
    public static boolean stbtt_CompareUTF8toUTF16_bigendian(@NonNull MemorySegment s1, int len1, @NonNull MemorySegment s2, int len2) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_CompareUTF8toUTF16_bigendian", s1, len1, s2, len2); }
        return (((int) Handles.MH_stbtt_CompareUTF8toUTF16_bigendian.get().invokeExact(Handles.get().PFN_stbtt_CompareUTF8toUTF16_bigendian, s1, len1, s2, len2)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_CompareUTF8toUTF16_bigendian", e); }
    }

    /// Invokes `stbtt_GetFontNameString`.
    /// ```
    /// const char* stbtt_GetFontNameString(const stbtt_fontinfo* font, int* length, int platformID, int encodingID, int languageID, int nameID);
    /// ```
    public static @NonNull MemorySegment stbtt_GetFontNameString(@NonNull MemorySegment font, @NonNull MemorySegment length, int platformID, int encodingID, int languageID, int nameID) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbtt_GetFontNameString", font, length, platformID, encodingID, languageID, nameID); }
        return (MemorySegment) Handles.MH_stbtt_GetFontNameString.get().invokeExact(Handles.get().PFN_stbtt_GetFontNameString, font, length, platformID, encodingID, languageID, nameID); }
        catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontNameString", e); }
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
