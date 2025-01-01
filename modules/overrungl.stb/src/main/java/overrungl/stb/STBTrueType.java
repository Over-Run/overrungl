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

/**
 * =======================================================================
 * <p>
 * NO SECURITY GUARANTEE -- DO NOT USE THIS ON UNTRUSTED FONT FILES
 * <p>
 * This library does no range checking of the offsets found in the file,
 * meaning an attacker can use it to read arbitrary memory.
 * <p>
 * Immediately after this block comment are a series of sample programs.
 * <p>
 * Some important concepts to understand to use this library:
 * <h2>Codepoint</h2>
 * Characters are defined by unicode codepoints, e.g. 65 is
 * uppercase A, 231 is lowercase c with a cedilla, 0x7e30 is
 * the hiragana for "ma".
 * <h2>Glyph</h2>
 * A visual character shape (every codepoint is rendered as
 * some glyph)
 * <h2>Glyph index</h2>
 * A font-specific integer ID representing a glyph
 * <h2>Baseline</h2>
 * Glyph shapes are defined relative to a baseline, which is the
 * bottom of uppercase characters. Characters extend both above
 * and below the baseline.
 * <h2>Current Point</h2>
 * As you draw text to the screen, you keep track of a "current point"
 * which is the origin of each character. The current point's vertical
 * position is the baseline. Even "baked fonts" use this model.
 * <h2>Vertical Font Metrics</h2>
 * The vertical qualities of the font, used to vertically position
 * and space the characters. See docs for stbtt_GetFontVMetrics.
 * <h2>Font Size in Pixels or Points</h2>
 * The preferred interface for specifying font sizes in stb_truetype
 * is to specify how tall the font's vertical extent should be in pixels.
 * If that sounds good enough, skip the next paragraph.
 * <p>
 * Most font APIs instead use "points", which are a common typographic
 * measurement for describing font size, defined as 72 points per inch.
 * stb_truetype provides a point API for compatibility. However, true
 * "per inch" conventions don't make much sense on computer displays
 * since different monitors have different number of pixels per
 * inch. For example, Windows traditionally uses a convention that
 * there are 96 pixels per inch, thus making 'inch' measurements have
 * nothing to do with inches, and thus effectively defining a point to
 * be 1.333 pixels. Additionally, the TrueType font data provides
 * an explicit scale factor to scale a given font's glyphs to points,
 * but the author has observed that this scale factor is often wrong
 * for non-commercial fonts, thus making fonts scaled in points
 * according to the TrueType spec incoherently sized in practice.
 * <h2>DETAILED USAGE</h2>
 * <h3>Scale</h3>
 * Select how high you want the font to be, in points or pixels.
 * Call ScaleForPixelHeight or ScaleForMappingEmToPixels to compute
 * a scale factor SF that will be used by all other functions.
 * <h3>Baseline</h3>
 * You need to select a y-coordinate that is the baseline of where
 * your text will appear. Call GetFontBoundingBox to get the baseline-relative
 * bounding box for all characters. SF*-y0 will be the distance in pixels
 * that the worst-case character could extend above the baseline, so if
 * you want the top edge of characters to appear at the top of the
 * screen where y=0, then you would set the baseline to SF*-y0.
 * <h3>Current point</h3>
 * Set the current point where the first character will appear. The
 * first character could extend left of the current point; this is font
 * dependent. You can either choose a current point that is the leftmost
 * point and hope, or add some padding, or check the bounding box or
 * left-side-bearing of the first character to be displayed and set
 * the current point based on that.
 * <h3>Displaying a character</h3>
 * Compute the bounding box of the character. It will contain signed values
 * relative to {@code current_point, baseline}. I.e. if it returns x0,y0,x1,y1,
 * then the character should be displayed in the rectangle from
 * {@code current_point+SF*x0, baseline+SF*y0} to {@code current_point+SF*x1,baseline+SF*y1}.
 * <h3>Advancing for the next character</h3>
 * Call GlyphHMetrics, and compute 'current_point += SF * advance'.
 * <h2>ADVANCED USAGE</h2>
 * <h3>Quality</h3>
 * <ul>
 *     <li>Use the functions with Subpixel at the end to allow your characters
 *     to have subpixel positioning. Since the font is anti-aliased, not
 *     hinted, this is very import for quality. (This is not possible with
 *     baked fonts.)</li>
 *     <li>Kerning is now supported, and if you're supporting subpixel rendering
 *     then kerning is worth using to give your text a polished look.</li>
 * </ul>
 * <h3>Performance</h3>
 * <ul>
 *     <li>Convert Unicode codepoints to glyph indexes and operate on the glyphs;
 *     if you don't do this, stb_truetype is forced to do the conversion on
 *     every call.</li>
 *     <li>There are a lot of memory allocations. We should modify it to take
 *     a temp buffer and allocate from the temp buffer (without freeing),
 *     should help performance a lot.</li>
 * </ul>
 * <h2>NOTES</h2>
 * The system uses the raw data found in the .ttf file without changing it
 * and without building auxiliary data structures. This is a bit inefficient
 * on little-endian systems (the data is big-endian), but assuming you're
 * caching the bitmaps or glyph shapes this shouldn't be a big deal.
 * <p>
 * It appears to be very hard to programmatically determine what font a
 * given file is in a general way. I provide an API for this, but I don't
 * recommend it.
 * <h2>Finding the right font...</h2>
 * You should really just solve this offline, keep your own tables
 * of what font is what, and don't try to get it out of the .ttf file.
 * That's because getting it out of the .ttf file is really hard, because
 * the names in the file can appear in many possible encodings, in many
 * possible languages, and e.g. if you need a case-insensitive comparison,
 * the details of that depend on the encoding &amp; language in a complex way
 * (actually underspecified in truetype, but also gigantic).
 * <p>
 * But you can use the provided functions in two possible ways:
 * <p>
 * stbtt_FindMatchingFont() will use *case-sensitive* comparisons on
 * unicode-encoded names to try to find the font you want;
 * you can run this before calling stbtt_InitFont()
 * <p>
 * stbtt_GetFontNameString() lets you get any of the various strings
 * from the file yourself and do your own comparisons on them.
 * You have to have called stbtt_InitFont() first.
 * <h2>SAMPLE PROGRAMS</h2>
 * Incomplete text-in-3d-api example, which draws quads properly aligned to be lossless.
 * {@snippet lang = java:
 * import java.lang.foreign.Arena;
 * import java.nio.channels.FileChannel;
 * import java.nio.file.Path;
 * import java.nio.file.StandardOpenOption;
 * Arena arena = Arena.ofAuto();
 *
 * STBTTBakedChar cdata = STBTTBakedChar.alloc(arena, 96);
 * int ftex = 0;
 *
 * void my_stbtt_initfont() {
 *     try (var fc = FileChannel.open(Path.of("c:/windows/fonts/times.ttf"), StandardOpenOption.READ);
 *          var bufArena = Arena.ofConfined()) {
 *         var ttf_buffer = bufArena.allocate(1 << 20);
 *         var temp_bitmap = bufArena.allocate(512 * 512);
 *         ttf_buffer.copyFrom(fc.map(FileChannel.MapMode.READ_ONLY, 0, 1 << 20, arena));
 *         stbtt_BakeFontBitmap(ttf_buffer, 0, 32.0f, temp_bitmap, 512, 512, 32, 96, cdata); // no guarantee this fits!
 *         // can free ttf_buffer at this point
 *         ftex = gl.GenTextures();
 *         gl.BindTexture(GL_TEXTURE_2D, ftex);
 *         gl.TexImage2D(GL_TEXTURE_2D, 0, GL_ALPHA, 512, 512, 0, GL_ALPHA, GL_UNSIGNED_BYTE, temp_bitmap);
 *         // can free temp_bitmap at this point
 *         gl.TexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
 *     }
 * }
 *
 * void my_stbtt_print(float x, float y, String text) {
 *     // assume orthographic projection with units = screen pixels, origin at top left
 *     gl.Enable(GL_BLEND);
 *     gl.BlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
 *     gl.Enable(GL_TEXTURE_2D);
 *     gl.BindTexture(GL_TEXTURE_2D, ftex);
 *     gl.Begin(GL_QUADS);
 *     try (var stack = MemoryStack.pushLocal()) {
 *         var q = STBTTAlignedQuad.alloc(stack);
 *         var px = stack.allocateFrom(ValueLayout.JAVA_FLOAT, x);
 *         var py = stack.allocateFrom(ValueLayout.JAVA_FLOAT, y);
 *         for (int i = 0, c = text.codePointCount(0, text.length()); i < c; i++) {
 *             int p = text.codePointAt(i);
 *             if (p >= 32 && p < 128) {
 *                 stbtt_GetBakedQuad(cdata.segment(), 512, 512, p - 32, px, py, q.segment(), true); //true=opengl & d3d10+,false=d3d9
 *                 gl.TexCoord2f(q.s0(), q.t0()); gl.Vertex2f(q.x0(), q.y0());
 *                 gl.TexCoord2f(q.s1(), q.t0()); gl.Vertex2f(q.x1(), q.y0());
 *                 gl.TexCoord2f(q.s1(), q.t1()); gl.Vertex2f(q.x1(), q.y1());
 *                 gl.TexCoord2f(q.s0(), q.t1()); gl.Vertex2f(q.x0(), q.y1());
 *             }
 *         }
 *     }
 *     gl.End();
 * }
 *}
 * <p>
 * Complete program (this compiles): get a single bitmap, print as ASCII art
 * {@snippet lang = java:
 * import overrungl.stb.STBTTFontInfo;
 * import overrungl.stb.STBTrueType;
 *
 * import java.io.IOException;
 * import java.lang.foreign.Arena;
 * import java.lang.foreign.MemorySegment;
 * import java.lang.foreign.ValueLayout;
 * import java.nio.channels.FileChannel;
 * import java.nio.file.Path;
 * import java.nio.file.StandardOpenOption;
 *
 * void main(String[] args) throws IOException {
 *     var arena = Arena.ofAuto();
 *
 *     var font = STBTTFontInfo.alloc(arena);
 *     int c = (args.length > 0 ? Integer.parseInt(args[0]) : 'a');
 *     int s = (args.length > 1 ? Integer.parseInt(args[1]) : 20);
 *
 *     try (var fc = FileChannel.open(Path.of(args.length > 2 ? args[2] : "c:/windows/fonts/arialbd.ttf"), StandardOpenOption.READ)) {
 *         var ttf_buffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size(), arena);
 *         stbtt_InitFont(font, ttf_buffer, stbtt_GetFontOffsetForIndex(ttf_buffer, 0));
 *     }
 *
 *     try (var stack = MemoryStack.pushLocal()) {
 *         var pw = stack.allocateFrom(ValueLayout.JAVA_INT, 0);
 *         var ph = stack.allocateFrom(ValueLayout.JAVA_INT, 0);
 *         var bitmap = stbtt_GetCodepointBitmap(font.segment(), 0, stbtt_ScaleForPixelHeight(font, s), c, pw, ph, MemorySegment.NULL, MemorySegment.NULL);
 *         int w = pw.get(ValueLayout.JAVA_INT, 0);
 *         int h = ph.get(ValueLayout.JAVA_INT, 0);
 *         bitmap = bitmap.reinterpret((long) w * h);
 *
 *         final var str = " .:ioVM@";
 *         for (int j = 0; j < h; j++) {
 *             for (int i = 0; i < w; i++) {
 *                 System.out.print(str.charAt(Byte.toUnsignedInt(bitmap.getAtIndex(ValueLayout.JAVA_BYTE, (long) j * w + i)) >> 5));
 *             }
 *             System.out.println();
 *         }
 *     }
 * }
 *}
 * Output:
 * <pre>{@code
 *    .ii.
 *   @@@@@@.
 *  V@Mio@@o
 *  :i.  V@V
 *    :oM@@M
 *  :@@@MM@M
 *  @@o o@M
 * :@@.  M@M
 *  @@@o@@@@
 *  :M@@V:@@.
 * }</pre>
 * <p>
 * Complete program: print "Hello World!" banner, with bugs
 * {@snippet lang = c:
 * char buffer[24<<20];
 * unsigned char screen[20][79];
 *
 * int main(int arg, char **argv)
 * {
 *    stbtt_fontinfo font;
 *    int i,j,ascent,baseline,ch=0;
 *    float scale, xpos=2; // leave a little padding in case the character extends left
 *    char *text = "Heljo World!"; // intentionally misspelled to show 'lj' brokenness
 *
 *    fread(buffer, 1, 1000000, fopen("c:/windows/fonts/arialbd.ttf", "rb"));
 *    stbtt_InitFont(&font, buffer, 0);
 *
 *    scale = stbtt_ScaleForPixelHeight(&font, 15);
 *    stbtt_GetFontVMetrics(&font, &ascent,0,0);
 *    baseline = (int) (ascent*scale);
 *
 *    while (text[ch]) {
 *       int advance,lsb,x0,y0,x1,y1;
 *       float x_shift = xpos - (float) floor(xpos);
 *       stbtt_GetCodepointHMetrics(&font, text[ch], &advance, &lsb);
 *       stbtt_GetCodepointBitmapBoxSubpixel(&font, text[ch], scale,scale,x_shift,0, &x0,&y0,&x1,&y1);
 *       stbtt_MakeCodepointBitmapSubpixel(&font, &screen[baseline + y0][(int) xpos + x0], x1-x0,y1-y0, 79, scale,scale,x_shift,0, text[ch]);
 *       // note that this stomps the old data, so where character boxes overlap (e.g. 'lj') it's wrong
 *       // because this API is really for baking character bitmaps into textures. if you want to render
 *       // a sequence of characters, you really need to render each bitmap to a temp buffer, then
 *       // "alpha blend" that into the working buffer
 *       xpos += (advance * scale);
 *       if (text[ch+1])
 *          xpos += scale*stbtt_GetCodepointKernAdvance(&font, text[ch],text[ch+1]);
 *       ++ch;
 *    }
 *
 *    for (j=0; j < 20; ++j) {
 *       for (i=0; i < 78; ++i)
 *          putchar(" .:ioVM@"[screen[j][i]>>5]);
 *       putchar('\n');
 *    }
 *
 *    return 0;
 * }
 *}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTrueType {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int
        STBTT_vmove = 1,
        STBTT_vline = 2,
        STBTT_vcurve = 3,
        STBTT_vcubic = 4;
    ///#### Documentation of fields
    ///##### STBTT_MACSTYLE_NONE
    ///<= not same as 0, this makes us check the bitfield is 0
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
    //region Method handles
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbtt_BakeFontBitmap`.
        public static final MethodHandle MH_stbtt_BakeFontBitmap = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_BakeFontBitmap", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTBakedChar.LAYOUT)));
        /// The method handle of `stbtt_GetBakedQuad`.
        public static final MethodHandle MH_stbtt_GetBakedQuad = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetBakedQuad", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTBakedChar.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTAlignedQuad.LAYOUT), ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbtt_GetScaledFontVMetrics`.
        public static final MethodHandle MH_stbtt_GetScaledFontVMetrics = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetScaledFontVMetrics", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackBegin`.
        public static final MethodHandle MH_stbtt_PackBegin = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackBegin", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackEnd`.
        public static final MethodHandle MH_stbtt_PackEnd = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackEnd", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `stbtt_PackFontRange`.
        public static final MethodHandle MH_stbtt_PackFontRange = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackFontRange", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackedChar.LAYOUT)));
        /// The method handle of `stbtt_PackFontRanges`.
        public static final MethodHandle MH_stbtt_PackFontRanges = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackFontRanges", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackRange.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackSetOversampling`.
        public static final MethodHandle MH_stbtt_PackSetOversampling = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackSetOversampling", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackSetSkipMissingCodepoints`.
        public static final MethodHandle MH_stbtt_PackSetSkipMissingCodepoints = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackSetSkipMissingCodepoints", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbtt_GetPackedQuad`.
        public static final MethodHandle MH_stbtt_GetPackedQuad = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetPackedQuad", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackedChar.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTAlignedQuad.LAYOUT), ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbtt_PackFontRangesGatherRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesGatherRects = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackFontRangesGatherRects", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackRange.LAYOUT), ValueLayout.JAVA_INT, STBRPRect.LAYOUT));
        /// The method handle of `stbtt_PackFontRangesPackRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesPackRects = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackFontRangesPackRects", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, STBRPRect.LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_PackFontRangesRenderIntoRects`.
        public static final MethodHandle MH_stbtt_PackFontRangesRenderIntoRects = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_PackFontRangesRenderIntoRects", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTPackRange.LAYOUT), ValueLayout.JAVA_INT, STBRPRect.LAYOUT));
        /// The method handle of `stbtt_GetNumberOfFonts`.
        public static final MethodHandle MH_stbtt_GetNumberOfFonts = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetNumberOfFonts", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontOffsetForIndex`.
        public static final MethodHandle MH_stbtt_GetFontOffsetForIndex = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetFontOffsetForIndex", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_InitFont`.
        public static final MethodHandle MH_stbtt_InitFont = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_InitFont", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_FindGlyphIndex`.
        public static final MethodHandle MH_stbtt_FindGlyphIndex = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_FindGlyphIndex", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_ScaleForPixelHeight`.
        public static final MethodHandle MH_stbtt_ScaleForPixelHeight = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_ScaleForPixelHeight", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbtt_ScaleForMappingEmToPixels`.
        public static final MethodHandle MH_stbtt_ScaleForMappingEmToPixels = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_ScaleForMappingEmToPixels", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbtt_GetFontVMetrics`.
        public static final MethodHandle MH_stbtt_GetFontVMetrics = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetFontVMetrics", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontVMetricsOS2`.
        public static final MethodHandle MH_stbtt_GetFontVMetricsOS2 = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetFontVMetricsOS2", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetFontBoundingBox`.
        public static final MethodHandle MH_stbtt_GetFontBoundingBox = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetFontBoundingBox", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointHMetrics`.
        public static final MethodHandle MH_stbtt_GetCodepointHMetrics = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointHMetrics", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointKernAdvance`.
        public static final MethodHandle MH_stbtt_GetCodepointKernAdvance = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointKernAdvance", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointBox`.
        public static final MethodHandle MH_stbtt_GetCodepointBox = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointBox", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphHMetrics`.
        public static final MethodHandle MH_stbtt_GetGlyphHMetrics = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphHMetrics", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphKernAdvance`.
        public static final MethodHandle MH_stbtt_GetGlyphKernAdvance = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphKernAdvance", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetGlyphBox`.
        public static final MethodHandle MH_stbtt_GetGlyphBox = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphBox", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetKerningTableLength`.
        public static final MethodHandle MH_stbtt_GetKerningTableLength = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetKerningTableLength", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT)));
        /// The method handle of `stbtt_GetKerningTable`.
        public static final MethodHandle MH_stbtt_GetKerningTable = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetKerningTable", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTKerningEntry.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_IsGlyphEmpty`.
        public static final MethodHandle MH_stbtt_IsGlyphEmpty = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_IsGlyphEmpty", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointShape`.
        public static final MethodHandle MH_stbtt_GetCodepointShape = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointShape", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphShape`.
        public static final MethodHandle MH_stbtt_GetGlyphShape = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphShape", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeShape`.
        public static final MethodHandle MH_stbtt_FreeShape = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_FreeShape", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTVertex.LAYOUT)));
        /// The method handle of `stbtt_FindSVGDoc`.
        public static final MethodHandle MH_stbtt_FindSVGDoc = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_FindSVGDoc", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointSVG`.
        public static final MethodHandle MH_stbtt_GetCodepointSVG = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointSVG", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphSVG`.
        public static final MethodHandle MH_stbtt_GetGlyphSVG = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphSVG", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeBitmap`.
        public static final MethodHandle MH_stbtt_FreeBitmap = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_FreeBitmap", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmap`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmap = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointBitmap", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapSubpixel = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointBitmapSubpixel", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_MakeCodepointBitmap`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmap = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_MakeCodepointBitmap", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeCodepointBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmapSubpixel = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_MakeCodepointBitmapSubpixel", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeCodepointBitmapSubpixelPrefilter`.
        public static final MethodHandle MH_stbtt_MakeCodepointBitmapSubpixelPrefilter = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_MakeCodepointBitmapSubpixelPrefilter", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetCodepointBitmapBox`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapBox = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointBitmapBox", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointBitmapBoxSubpixel`.
        public static final MethodHandle MH_stbtt_GetCodepointBitmapBoxSubpixel = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointBitmapBoxSubpixel", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmap`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmap = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphBitmap", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapSubpixel = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphBitmapSubpixel", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_MakeGlyphBitmap`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmap = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_MakeGlyphBitmap", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeGlyphBitmapSubpixel`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmapSubpixel = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_MakeGlyphBitmapSubpixel", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_MakeGlyphBitmapSubpixelPrefilter`.
        public static final MethodHandle MH_stbtt_MakeGlyphBitmapSubpixelPrefilter = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_MakeGlyphBitmapSubpixelPrefilter", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetGlyphBitmapBox`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapBox = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphBitmapBox", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphBitmapBoxSubpixel`.
        public static final MethodHandle MH_stbtt_GetGlyphBitmapBoxSubpixel = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphBitmapBoxSubpixel", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_Rasterize`.
        public static final MethodHandle MH_stbtt_Rasterize = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_Rasterize", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTT__bitmap.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTVertex.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FreeSDF`.
        public static final MethodHandle MH_stbtt_FreeSDF = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_FreeSDF", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetGlyphSDF`.
        public static final MethodHandle MH_stbtt_GetGlyphSDF = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetGlyphSDF", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_GetCodepointSDF`.
        public static final MethodHandle MH_stbtt_GetCodepointSDF = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetCodepointSDF", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbtt_FindMatchingFont`.
        public static final MethodHandle MH_stbtt_FindMatchingFont = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_FindMatchingFont", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_CompareUTF8toUTF16_bigendian`.
        public static final MethodHandle MH_stbtt_CompareUTF8toUTF16_bigendian = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_CompareUTF8toUTF16_bigendian", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `stbtt_GetFontNameString`.
        public static final MethodHandle MH_stbtt_GetFontNameString = RuntimeHelper.downcall(STBInternal.lookup, "stbtt_GetFontNameString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBTTFontInfo.LAYOUT), ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    }
    //endregion

    ///if return is positive, the first unused row of the bitmap
    ///if return is negative, returns the negative of the number of characters that fit
    ///if return is 0, no characters fit and no rows were used
    ///This uses a very crappy packing.
    public static @CType("int") int stbtt_BakeFontBitmap(@CType("const unsigned char *") java.lang.foreign.MemorySegment data, @CType("int") int offset, @CType("float") float pixel_height, @CType("unsigned char *") java.lang.foreign.MemorySegment pixels, @CType("int") int pw, @CType("int") int ph, @CType("int") int first_char, @CType("int") int num_chars, @CType("stbtt_bakedchar *") java.lang.foreign.MemorySegment chardata) {
        try {
            return (int) Handles.MH_stbtt_BakeFontBitmap.invokeExact(data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, chardata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_BakeFontBitmap", e); }
    }

    ///if return is positive, the first unused row of the bitmap
    ///if return is negative, returns the negative of the number of characters that fit
    ///if return is 0, no characters fit and no rows were used
    ///This uses a very crappy packing.
    public static @CType("int") int stbtt_BakeFontBitmap(@CType("const unsigned char *") java.lang.foreign.MemorySegment data, @CType("int") int offset, @CType("float") float pixel_height, @CType("unsigned char *") java.lang.foreign.MemorySegment pixels, @CType("int") int pw, @CType("int") int ph, @CType("int") int first_char, @CType("int") int num_chars, @CType("stbtt_bakedchar *") overrungl.stb.STBTTBakedChar chardata) {
        try {
            return (int) Handles.MH_stbtt_BakeFontBitmap.invokeExact(data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, Marshal.marshal(chardata));
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_BakeFontBitmap", e); }
    }

    ///Call GetBakedQuad with char_index = 'character - first_char', and it
    ///creates the quad you need to draw and advances the current position.
    ///
    ///The coordinate system used assumes y increases downwards.
    ///
    ///Characters will extend both above and below the current position;
    ///see discussion of "BASELINE" above.
    ///
    ///It's inefficient; you might want to c&p it and optimize it.
    public static void stbtt_GetBakedQuad(@CType("const stbtt_bakedchar *") java.lang.foreign.MemorySegment chardata, @CType("int") int pw, @CType("int") int ph, @CType("int") int char_index, @Out @CType("float*") java.lang.foreign.MemorySegment xpos, @Out @CType("float*") java.lang.foreign.MemorySegment ypos, @CType("stbtt_aligned_quad *") java.lang.foreign.MemorySegment q, @CType("int") boolean opengl_fillrule) {
        try {
            Handles.MH_stbtt_GetBakedQuad.invokeExact(chardata, pw, ph, char_index, xpos, ypos, q, opengl_fillrule);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetBakedQuad", e); }
    }

    ///Call GetBakedQuad with char_index = 'character - first_char', and it
    ///creates the quad you need to draw and advances the current position.
    ///
    ///The coordinate system used assumes y increases downwards.
    ///
    ///Characters will extend both above and below the current position;
    ///see discussion of "BASELINE" above.
    ///
    ///It's inefficient; you might want to c&p it and optimize it.
    public static void stbtt_GetBakedQuad(@CType("const stbtt_bakedchar *") overrungl.stb.STBTTBakedChar chardata, @CType("int") int pw, @CType("int") int ph, @CType("int") int char_index, @Out @CType("float*") float[] xpos, @Out @CType("float*") float[] ypos, @CType("stbtt_aligned_quad *") overrungl.stb.STBTTAlignedQuad q, @CType("int") boolean opengl_fillrule) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_stbtt_GetBakedQuad.invokeExact(Marshal.marshal(chardata), pw, ph, char_index, __overrungl_ref_xpos, __overrungl_ref_ypos, Marshal.marshal(q), opengl_fillrule);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetBakedQuad", e); }
    }

    ///Query the font vertical metrics without having to create a font first.
    public static void stbtt_GetScaledFontVMetrics(@CType("const unsigned char *") java.lang.foreign.MemorySegment fontdata, @CType("int") int index, @CType("float") float size, @Out @CType("float*") java.lang.foreign.MemorySegment ascent, @Out @CType("float*") java.lang.foreign.MemorySegment descent, @Out @CType("float*") java.lang.foreign.MemorySegment lineGap) {
        try {
            Handles.MH_stbtt_GetScaledFontVMetrics.invokeExact(fontdata, index, size, ascent, descent, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetScaledFontVMetrics", e); }
    }

    ///Query the font vertical metrics without having to create a font first.
    public static void stbtt_GetScaledFontVMetrics(@CType("const unsigned char *") java.lang.foreign.MemorySegment fontdata, @CType("int") int index, @CType("float") float size, @Out @CType("float*") float[] ascent, @Out @CType("float*") float[] descent, @Out @CType("float*") float[] lineGap) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ascent = Marshal.marshal(__overrungl_stack, ascent);
            var __overrungl_ref_descent = Marshal.marshal(__overrungl_stack, descent);
            var __overrungl_ref_lineGap = Marshal.marshal(__overrungl_stack, lineGap);
            Handles.MH_stbtt_GetScaledFontVMetrics.invokeExact(fontdata, index, size, __overrungl_ref_ascent, __overrungl_ref_descent, __overrungl_ref_lineGap);
            Unmarshal.copy(__overrungl_ref_ascent, ascent);
            Unmarshal.copy(__overrungl_ref_descent, descent);
            Unmarshal.copy(__overrungl_ref_lineGap, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetScaledFontVMetrics", e); }
    }

    ///Initializes a packing context stored in the passed-in stbtt_pack_context.
    ///Future calls using this context will pack characters into the bitmap passed
    ///in here: a 1-channel bitmap that is width * height. stride_in_bytes is
    ///the distance from one row to the next (or 0 to mean they are packed tightly
    ///together). "padding" is the amount of padding to leave between each
    ///character (normally you want '1' for bitmaps you'll use as textures with
    ///bilinear filtering).
    ///
    ///Returns `false` on failure, `true` on success.
    public static @CType("int") boolean stbtt_PackBegin(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("unsigned char *") java.lang.foreign.MemorySegment pixels, @CType("int") int width, @CType("int") int height, @CType("int") int stride_in_bytes, @CType("int") int padding, @CType("void*") java.lang.foreign.MemorySegment alloc_context) {
        try {
            return (boolean) Handles.MH_stbtt_PackBegin.invokeExact(spc, pixels, width, height, stride_in_bytes, padding, alloc_context);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackBegin", e); }
    }

    ///Cleans up the packing context and frees all memory.
    public static void stbtt_PackEnd(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc) {
        try {
            Handles.MH_stbtt_PackEnd.invokeExact(spc);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackEnd", e); }
    }

    ///Creates character bitmaps from the font_index'th font found in fontdata (use
    ///font_index=0 if you don't know what that is). It creates num_chars_in_range
    ///bitmaps for characters with unicode values starting at first_unicode_char_in_range
    ///and increasing. Data for how to render them is stored in chardata_for_range;
    ///pass these to stbtt_GetPackedQuad to get back renderable quads.
    ///
    ///font_size is the full height of the character from ascender to descender,
    ///as computed by stbtt_ScaleForPixelHeight. To use a point size as computed
    ///by stbtt_ScaleForMappingEmToPixels, wrap the point size in STBTT_POINT_SIZE()
    ///and pass that result as 'font_size':
    ///```
    ///...,                  20 , ... // font max minus min y is 20 pixels tall
    ///..., STBTT_POINT_SIZE(20), ... // 'M' is 20 pixels tall
    ///```
    public static @CType("int") boolean stbtt_PackFontRange(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("const unsigned char *") java.lang.foreign.MemorySegment fontdata, @CType("int") int font_index, @CType("float") float font_size, @CType("int") int first_unicode_char_in_range, @CType("int") int num_chars_in_range, @CType("stbtt_packedchar *") java.lang.foreign.MemorySegment chardata_for_range) {
        try {
            return (boolean) Handles.MH_stbtt_PackFontRange.invokeExact(spc, fontdata, font_index, font_size, first_unicode_char_in_range, num_chars_in_range, chardata_for_range);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRange", e); }
    }

    ///Creates character bitmaps from multiple ranges of characters stored in
    ///ranges. This will usually create a better-packed bitmap than multiple
    ///calls to stbtt_PackFontRange. Note that you can call this multiple
    ///times within a single PackBegin/PackEnd.
    public static @CType("int") boolean stbtt_PackFontRanges(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("const unsigned char *") java.lang.foreign.MemorySegment fontdata, @CType("int") int font_index, @CType("stbtt_pack_range *") java.lang.foreign.MemorySegment ranges, @CType("int") int num_ranges) {
        try {
            return (boolean) Handles.MH_stbtt_PackFontRanges.invokeExact(spc, fontdata, font_index, ranges, num_ranges);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRanges", e); }
    }

    ///Creates character bitmaps from multiple ranges of characters stored in
    ///ranges. This will usually create a better-packed bitmap than multiple
    ///calls to stbtt_PackFontRange. Note that you can call this multiple
    ///times within a single PackBegin/PackEnd.
    public static @CType("int") boolean stbtt_PackFontRanges(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("const unsigned char *") java.lang.foreign.MemorySegment fontdata, @CType("int") int font_index, @CType("stbtt_pack_range *") overrungl.stb.STBTTPackRange ranges, @CType("int") int num_ranges) {
        try {
            return (boolean) Handles.MH_stbtt_PackFontRanges.invokeExact(spc, fontdata, font_index, Marshal.marshal(ranges), num_ranges);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRanges", e); }
    }

    ///Oversampling a font increases the quality by allowing higher-quality subpixel
    ///positioning, and is especially valuable at smaller text sizes.
    ///
    ///This function sets the amount of oversampling for all following calls to
    ///stbtt_PackFontRange(s) or stbtt_PackFontRangesGatherRects for a given
    ///pack context. The default (no oversampling) is achieved by h_oversample=1
    ///and v_oversample=1. The total number of pixels required is
    ///h_oversample*v_oversample larger than the default; for example, 2x2
    ///oversampling requires 4x the storage of 1x1. For best results, render
    ///oversampled textures with bilinear filtering. Look at the readme in
    ///stb/tests/oversample for information about oversampled fonts
    ///
    ///To use with PackFontRangesGather etc., you must set it before calls
    ///call to PackFontRangesGatherRects.
    public static void stbtt_PackSetOversampling(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("unsigned int") int h_oversample, @CType("unsigned int") int v_oversample) {
        try {
            Handles.MH_stbtt_PackSetOversampling.invokeExact(spc, h_oversample, v_oversample);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackSetOversampling", e); }
    }

    ///If skip != 0, this tells stb_truetype to skip any codepoints for which
    ///there is no corresponding glyph. If skip=0, which is the default, then
    ///codepoints without a glyph recived the font's "missing character" glyph,
    ///typically an empty box by convention.
    public static void stbtt_PackSetSkipMissingCodepoints(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("int") boolean skip) {
        try {
            Handles.MH_stbtt_PackSetSkipMissingCodepoints.invokeExact(spc, skip);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackSetSkipMissingCodepoints", e); }
    }

    ///Calling these functions in sequence is roughly equivalent to calling
    ///stbtt_PackFontRanges(). If you more control over the packing of multiple
    ///fonts, or if you want to pack custom data into a font texture, take a look
    ///at the source to of stbtt_PackFontRanges() and create a custom version
    ///using these functions, e.g. call GatherRects multiple times,
    ///building up a single array of rects, then call PackRects once,
    ///then call RenderIntoRects repeatedly. This may result in a
    ///better packing than calling PackFontRanges multiple times
    ///(or it may not).
    public static void stbtt_GetPackedQuad(@CType("const stbtt_packedchar *") java.lang.foreign.MemorySegment chardata, @CType("int") int pw, @CType("int") int ph, @CType("int") int char_index, @Out @CType("float*") java.lang.foreign.MemorySegment xpos, @Out @CType("float*") java.lang.foreign.MemorySegment ypos, @CType("stbtt_aligned_quad *") java.lang.foreign.MemorySegment q, @CType("int") boolean align_to_integer) {
        try {
            Handles.MH_stbtt_GetPackedQuad.invokeExact(chardata, pw, ph, char_index, xpos, ypos, q, align_to_integer);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetPackedQuad", e); }
    }

    ///Calling these functions in sequence is roughly equivalent to calling
    ///stbtt_PackFontRanges(). If you more control over the packing of multiple
    ///fonts, or if you want to pack custom data into a font texture, take a look
    ///at the source to of stbtt_PackFontRanges() and create a custom version
    ///using these functions, e.g. call GatherRects multiple times,
    ///building up a single array of rects, then call PackRects once,
    ///then call RenderIntoRects repeatedly. This may result in a
    ///better packing than calling PackFontRanges multiple times
    ///(or it may not).
    public static void stbtt_GetPackedQuad(@CType("const stbtt_packedchar *") overrungl.stb.STBTTPackedChar chardata, @CType("int") int pw, @CType("int") int ph, @CType("int") int char_index, @Out @CType("float*") float[] xpos, @Out @CType("float*") float[] ypos, @CType("stbtt_aligned_quad *") overrungl.stb.STBTTAlignedQuad q, @CType("int") boolean align_to_integer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_xpos = Marshal.marshal(__overrungl_stack, xpos);
            var __overrungl_ref_ypos = Marshal.marshal(__overrungl_stack, ypos);
            Handles.MH_stbtt_GetPackedQuad.invokeExact(Marshal.marshal(chardata), pw, ph, char_index, __overrungl_ref_xpos, __overrungl_ref_ypos, Marshal.marshal(q), align_to_integer);
            Unmarshal.copy(__overrungl_ref_xpos, xpos);
            Unmarshal.copy(__overrungl_ref_ypos, ypos);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetPackedQuad", e); }
    }

    public static @CType("int") int stbtt_PackFontRangesGatherRects(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("stbtt_pack_range *") java.lang.foreign.MemorySegment ranges, @CType("int") int num_ranges, @CType("stbrp_rect *") java.lang.foreign.MemorySegment rects) {
        try {
            return (int) Handles.MH_stbtt_PackFontRangesGatherRects.invokeExact(spc, info, ranges, num_ranges, rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesGatherRects", e); }
    }

    public static void stbtt_PackFontRangesPackRects(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("stbrp_rect *") java.lang.foreign.MemorySegment rects, @CType("int") int num_rects) {
        try {
            Handles.MH_stbtt_PackFontRangesPackRects.invokeExact(spc, rects, num_rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesPackRects", e); }
    }

    public static @CType("int") int stbtt_PackFontRangesRenderIntoRects(@CType("stbtt_pack_context *") java.lang.foreign.MemorySegment spc, @CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("stbtt_pack_range *") java.lang.foreign.MemorySegment ranges, @CType("int") int num_ranges, @CType("stbrp_rect *") java.lang.foreign.MemorySegment rects) {
        try {
            return (int) Handles.MH_stbtt_PackFontRangesRenderIntoRects.invokeExact(spc, info, ranges, num_ranges, rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_PackFontRangesRenderIntoRects", e); }
    }

    ///This function will determine the number of fonts in a font file.  TrueType
    ///collection (.ttc) files may contain multiple fonts, while TrueType font
    ///(.ttf) files only contain one font. The number of fonts can be used for
    ///indexing with the previous function where the index is between zero and one
    ///less than the total fonts. If an error occurs, -1 is returned.
    public static @CType("int") int stbtt_GetNumberOfFonts(@CType("const unsigned char *") java.lang.foreign.MemorySegment data) {
        try {
            return (int) Handles.MH_stbtt_GetNumberOfFonts.invokeExact(data);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetNumberOfFonts", e); }
    }

    ///Each .ttf/.ttc file may have more than one font. Each font has a sequential
    ///index number starting from 0. Call this function to get the font offset for
    ///a given index; it returns -1 if the index is out of range. A regular .ttf
    ///file will only define one font and it always be at offset 0, so it will
    ///return '0' for index 0, and -1 for all other indices.
    public static @CType("int") int stbtt_GetFontOffsetForIndex(@CType("const unsigned char *") java.lang.foreign.MemorySegment data, @CType("int") int index) {
        try {
            return (int) Handles.MH_stbtt_GetFontOffsetForIndex.invokeExact(data, index);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontOffsetForIndex", e); }
    }

    ///Given an offset into the file that defines a font, this function builds
    ///the necessary cached info for the rest of the system. You must allocate
    ///the stbtt_fontinfo yourself, and stbtt_InitFont will fill it out. You don't
    ///need to do anything special to free it, because the contents are pure
    ///value data with no additional data structures.
    ///@return 0 on failure.
    public static @CType("int") boolean stbtt_InitFont(@CType("stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("const unsigned char *") java.lang.foreign.MemorySegment data, @CType("int") int offset) {
        try {
            return (boolean) Handles.MH_stbtt_InitFont.invokeExact(info, data, offset);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_InitFont", e); }
    }

    ///If you're going to perform multiple operations on the same character
    ///and you want a speed-up, call this function with the character you're
    ///going to process, then use glyph-based functions instead of the
    ///codepoint-based functions.
    ///@return 0 if the character codepoint is not defined in the font.
    public static @CType("int") int stbtt_FindGlyphIndex(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int unicode_codepoint) {
        try {
            return (int) Handles.MH_stbtt_FindGlyphIndex.invokeExact(info, unicode_codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindGlyphIndex", e); }
    }

    ///computes a scale factor to produce a font whose "height" is 'pixels' tall.
    ///Height is measured as the distance from the highest ascender to the lowest
    ///descender; in other words, it's equivalent to calling stbtt_GetFontVMetrics
    ///and computing:
    ///```
    ///scale = pixels / (ascent - descent)
    ///```
    ///so if you prefer to measure height by the ascent only, use a similar calculation.
    public static @CType("float") float stbtt_ScaleForPixelHeight(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("float") float pixels) {
        try {
            return (float) Handles.MH_stbtt_ScaleForPixelHeight.invokeExact(info, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_ScaleForPixelHeight", e); }
    }

    ///computes a scale factor to produce a font whose EM size is mapped to
    ///'pixels' tall. This is probably what traditional APIs compute, but
    ///I'm not positive.
    public static @CType("float") float stbtt_ScaleForMappingEmToPixels(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("float") float pixels) {
        try {
            return (float) Handles.MH_stbtt_ScaleForMappingEmToPixels.invokeExact(info, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_ScaleForMappingEmToPixels", e); }
    }

    ///these are expressed in unscaled coordinates, so you must multiply by
    ///the scale factor for a given size
    ///
    ///@param ascent the coordinate above the baseline the font extends
    ///@param descent the coordinate below the baseline the font extends (i.e. it is typically negative)
    ///@param lineGap the spacing between one row's descent and the next row's ascent...
    ///so you should advance the vertical position by "*ascent - *descent + *lineGap"
    public static void stbtt_GetFontVMetrics(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @Out @CType("int*") java.lang.foreign.MemorySegment ascent, @Out @CType("int*") java.lang.foreign.MemorySegment descent, @Out @CType("int*") java.lang.foreign.MemorySegment lineGap) {
        try {
            Handles.MH_stbtt_GetFontVMetrics.invokeExact(info, ascent, descent, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetrics", e); }
    }

    ///these are expressed in unscaled coordinates, so you must multiply by
    ///the scale factor for a given size
    ///
    ///@param ascent the coordinate above the baseline the font extends
    ///@param descent the coordinate below the baseline the font extends (i.e. it is typically negative)
    ///@param lineGap the spacing between one row's descent and the next row's ascent...
    ///so you should advance the vertical position by "*ascent - *descent + *lineGap"
    public static void stbtt_GetFontVMetrics(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @Out @CType("int*") int[] ascent, @Out @CType("int*") int[] descent, @Out @CType("int*") int[] lineGap) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ascent = Marshal.marshal(__overrungl_stack, ascent);
            var __overrungl_ref_descent = Marshal.marshal(__overrungl_stack, descent);
            var __overrungl_ref_lineGap = Marshal.marshal(__overrungl_stack, lineGap);
            Handles.MH_stbtt_GetFontVMetrics.invokeExact(Marshal.marshal(info), __overrungl_ref_ascent, __overrungl_ref_descent, __overrungl_ref_lineGap);
            Unmarshal.copy(__overrungl_ref_ascent, ascent);
            Unmarshal.copy(__overrungl_ref_descent, descent);
            Unmarshal.copy(__overrungl_ref_lineGap, lineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetrics", e); }
    }

    ///analogous to GetFontVMetrics, but returns the "typographic" values from the OS/2
    ///table (specific to MS/Windows TTF files).
    ///
    ///@return 1 on success (table present), 0 on failure.
    public static @CType("int") boolean stbtt_GetFontVMetricsOS2(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @Out @CType("int*") java.lang.foreign.MemorySegment typoAscent, @Out @CType("int*") java.lang.foreign.MemorySegment typoDescent, @Out @CType("int*") java.lang.foreign.MemorySegment typoLineGap) {
        try {
            return (boolean) Handles.MH_stbtt_GetFontVMetricsOS2.invokeExact(info, typoAscent, typoDescent, typoLineGap);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetricsOS2", e); }
    }

    ///analogous to GetFontVMetrics, but returns the "typographic" values from the OS/2
    ///table (specific to MS/Windows TTF files).
    ///
    ///@return 1 on success (table present), 0 on failure.
    public static @CType("int") boolean stbtt_GetFontVMetricsOS2(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @Out @CType("int*") int[] typoAscent, @Out @CType("int*") int[] typoDescent, @Out @CType("int*") int[] typoLineGap) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_typoAscent = Marshal.marshal(__overrungl_stack, typoAscent);
            var __overrungl_ref_typoDescent = Marshal.marshal(__overrungl_stack, typoDescent);
            var __overrungl_ref_typoLineGap = Marshal.marshal(__overrungl_stack, typoLineGap);
            var __overrungl_result = (boolean) Handles.MH_stbtt_GetFontVMetricsOS2.invokeExact(Marshal.marshal(info), __overrungl_ref_typoAscent, __overrungl_ref_typoDescent, __overrungl_ref_typoLineGap);
            Unmarshal.copy(__overrungl_ref_typoAscent, typoAscent);
            Unmarshal.copy(__overrungl_ref_typoDescent, typoDescent);
            Unmarshal.copy(__overrungl_ref_typoLineGap, typoLineGap);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontVMetricsOS2", e); }
    }

    ///the bounding box around all possible characters
    public static void stbtt_GetFontBoundingBox(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @Out @CType("int*") java.lang.foreign.MemorySegment x0, @Out @CType("int*") java.lang.foreign.MemorySegment y0, @Out @CType("int*") java.lang.foreign.MemorySegment x1, @Out @CType("int*") java.lang.foreign.MemorySegment y1) {
        try {
            Handles.MH_stbtt_GetFontBoundingBox.invokeExact(info, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontBoundingBox", e); }
    }

    ///the bounding box around all possible characters
    public static void stbtt_GetFontBoundingBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @Out @CType("int*") int[] x0, @Out @CType("int*") int[] y0, @Out @CType("int*") int[] x1, @Out @CType("int*") int[] y1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x0 = Marshal.marshal(__overrungl_stack, x0);
            var __overrungl_ref_y0 = Marshal.marshal(__overrungl_stack, y0);
            var __overrungl_ref_x1 = Marshal.marshal(__overrungl_stack, x1);
            var __overrungl_ref_y1 = Marshal.marshal(__overrungl_stack, y1);
            Handles.MH_stbtt_GetFontBoundingBox.invokeExact(Marshal.marshal(info), __overrungl_ref_x0, __overrungl_ref_y0, __overrungl_ref_x1, __overrungl_ref_y1);
            Unmarshal.copy(__overrungl_ref_x0, x0);
            Unmarshal.copy(__overrungl_ref_y0, y0);
            Unmarshal.copy(__overrungl_ref_x1, x1);
            Unmarshal.copy(__overrungl_ref_y1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetFontBoundingBox", e); }
    }

    ///these are expressed in unscaled coordinates
    ///@param advanceWidth the offset from the current horizontal position to the next horizontal position
    ///@param leftSideBearing the offset from the current horizontal position to the left edge of the character
    public static void stbtt_GetCodepointHMetrics(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int codepoint, @Out @CType("int*") java.lang.foreign.MemorySegment advanceWidth, @Out @CType("int*") java.lang.foreign.MemorySegment leftSideBearing) {
        try {
            Handles.MH_stbtt_GetCodepointHMetrics.invokeExact(info, codepoint, advanceWidth, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointHMetrics", e); }
    }

    ///these are expressed in unscaled coordinates
    ///@param advanceWidth the offset from the current horizontal position to the next horizontal position
    ///@param leftSideBearing the offset from the current horizontal position to the left edge of the character
    public static void stbtt_GetCodepointHMetrics(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("int") int codepoint, @Out @CType("int*") int[] advanceWidth, @Out @CType("int*") int[] leftSideBearing) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_advanceWidth = Marshal.marshal(__overrungl_stack, advanceWidth);
            var __overrungl_ref_leftSideBearing = Marshal.marshal(__overrungl_stack, leftSideBearing);
            Handles.MH_stbtt_GetCodepointHMetrics.invokeExact(Marshal.marshal(info), codepoint, __overrungl_ref_advanceWidth, __overrungl_ref_leftSideBearing);
            Unmarshal.copy(__overrungl_ref_advanceWidth, advanceWidth);
            Unmarshal.copy(__overrungl_ref_leftSideBearing, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointHMetrics", e); }
    }

    ///an additional amount to add to the 'advance' value between ch1 and ch2
    public static @CType("int") int stbtt_GetCodepointKernAdvance(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int ch1, @CType("int") int ch2) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointKernAdvance.invokeExact(info, ch1, ch2);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointKernAdvance", e); }
    }

    ///Gets the bounding box of the visible part of the glyph, in unscaled coordinates
    public static @CType("int") int stbtt_GetCodepointBox(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int codepoint, @Out @CType("int*") java.lang.foreign.MemorySegment x0, @Out @CType("int*") java.lang.foreign.MemorySegment y0, @Out @CType("int*") java.lang.foreign.MemorySegment x1, @Out @CType("int*") java.lang.foreign.MemorySegment y1) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointBox.invokeExact(info, codepoint, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBox", e); }
    }

    ///Gets the bounding box of the visible part of the glyph, in unscaled coordinates
    public static @CType("int") int stbtt_GetCodepointBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("int") int codepoint, @Out @CType("int*") int[] x0, @Out @CType("int*") int[] y0, @Out @CType("int*") int[] x1, @Out @CType("int*") int[] y1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x0 = Marshal.marshal(__overrungl_stack, x0);
            var __overrungl_ref_y0 = Marshal.marshal(__overrungl_stack, y0);
            var __overrungl_ref_x1 = Marshal.marshal(__overrungl_stack, x1);
            var __overrungl_ref_y1 = Marshal.marshal(__overrungl_stack, y1);
            var __overrungl_result = (int) Handles.MH_stbtt_GetCodepointBox.invokeExact(Marshal.marshal(info), codepoint, __overrungl_ref_x0, __overrungl_ref_y0, __overrungl_ref_x1, __overrungl_ref_y1);
            Unmarshal.copy(__overrungl_ref_x0, x0);
            Unmarshal.copy(__overrungl_ref_y0, y0);
            Unmarshal.copy(__overrungl_ref_x1, x1);
            Unmarshal.copy(__overrungl_ref_y1, y1);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBox", e); }
    }

    ///as above, but takes one or more glyph indices for greater efficiency
    public static void stbtt_GetGlyphHMetrics(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int glyph_index, @Out @CType("int*") java.lang.foreign.MemorySegment advanceWidth, @Out @CType("int*") java.lang.foreign.MemorySegment leftSideBearing) {
        try {
            Handles.MH_stbtt_GetGlyphHMetrics.invokeExact(info, glyph_index, advanceWidth, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphHMetrics", e); }
    }

    ///as above, but takes one or more glyph indices for greater efficiency
    public static void stbtt_GetGlyphHMetrics(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("int") int glyph_index, @Out @CType("int*") int[] advanceWidth, @Out @CType("int*") int[] leftSideBearing) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_advanceWidth = Marshal.marshal(__overrungl_stack, advanceWidth);
            var __overrungl_ref_leftSideBearing = Marshal.marshal(__overrungl_stack, leftSideBearing);
            Handles.MH_stbtt_GetGlyphHMetrics.invokeExact(Marshal.marshal(info), glyph_index, __overrungl_ref_advanceWidth, __overrungl_ref_leftSideBearing);
            Unmarshal.copy(__overrungl_ref_advanceWidth, advanceWidth);
            Unmarshal.copy(__overrungl_ref_leftSideBearing, leftSideBearing);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphHMetrics", e); }
    }

    public static @CType("int") int stbtt_GetGlyphKernAdvance(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int glyph1, @CType("int") int glyph2) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphKernAdvance.invokeExact(info, glyph1, glyph2);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphKernAdvance", e); }
    }

    public static @CType("int") int stbtt_GetGlyphBox(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int glyph_index, @Out @CType("int*") java.lang.foreign.MemorySegment x0, @Out @CType("int*") java.lang.foreign.MemorySegment y0, @Out @CType("int*") java.lang.foreign.MemorySegment x1, @Out @CType("int*") java.lang.foreign.MemorySegment y1) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphBox.invokeExact(info, glyph_index, x0, y0, x1, y1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBox", e); }
    }

    public static @CType("int") int stbtt_GetGlyphBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("int") int glyph_index, @Out @CType("int*") int[] x0, @Out @CType("int*") int[] y0, @Out @CType("int*") int[] x1, @Out @CType("int*") int[] y1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x0 = Marshal.marshal(__overrungl_stack, x0);
            var __overrungl_ref_y0 = Marshal.marshal(__overrungl_stack, y0);
            var __overrungl_ref_x1 = Marshal.marshal(__overrungl_stack, x1);
            var __overrungl_ref_y1 = Marshal.marshal(__overrungl_stack, y1);
            var __overrungl_result = (int) Handles.MH_stbtt_GetGlyphBox.invokeExact(Marshal.marshal(info), glyph_index, __overrungl_ref_x0, __overrungl_ref_y0, __overrungl_ref_x1, __overrungl_ref_y1);
            Unmarshal.copy(__overrungl_ref_x0, x0);
            Unmarshal.copy(__overrungl_ref_y0, y0);
            Unmarshal.copy(__overrungl_ref_x1, x1);
            Unmarshal.copy(__overrungl_ref_y1, y1);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBox", e); }
    }

    public static @CType("int") int stbtt_GetKerningTableLength(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info) {
        try {
            return (int) Handles.MH_stbtt_GetKerningTableLength.invokeExact(info);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetKerningTableLength", e); }
    }

    ///Retrieves a complete list of all of the kerning pairs provided by the font
    ///stbtt_GetKerningTable never writes more than table_length entries and returns how many entries it did write.
    ///The table will be sorted by (a.glyph1 == b.glyph1)?(a.glyph2 < b.glyph2):(a.glyph1 < b.glyph1)
    public static @CType("int") int stbtt_GetKerningTable(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("stbtt_kerningentry*") java.lang.foreign.MemorySegment table, @CType("int") int table_length) {
        try {
            return (int) Handles.MH_stbtt_GetKerningTable.invokeExact(info, table, table_length);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetKerningTable", e); }
    }

    ///@return `true` if nothing is drawn for this glyph
    public static @CType("int") boolean stbtt_IsGlyphEmpty(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int glyph_index) {
        try {
            return (boolean) Handles.MH_stbtt_IsGlyphEmpty.invokeExact(info, glyph_index);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_IsGlyphEmpty", e); }
    }

    ///{@return # of vertices and fills *vertices with the pointer to them}
    ///these are expressed in "unscaled" coordinates
    ///
    ///The shape is a series of contours. Each one starts with
    ///a STBTT_moveto, then consists of a series of mixed
    ///STBTT_lineto and STBTT_curveto segments. A lineto
    ///draws a line from previous endpoint to its x,y; a curveto
    ///draws a quadratic bezier from previous endpoint to
    ///its x,y, using cx,cy as the bezier control point.
    public static @CType("int") int stbtt_GetCodepointShape(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int unicode_codepoint, @CType("stbtt_vertex **") java.lang.foreign.MemorySegment vertices) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointShape.invokeExact(info, unicode_codepoint, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointShape", e); }
    }

    ///{@return # of vertices and fills *vertices with the pointer to them}
    ///these are expressed in "unscaled" coordinates
    ///
    ///The shape is a series of contours. Each one starts with
    ///a STBTT_moveto, then consists of a series of mixed
    ///STBTT_lineto and STBTT_curveto segments. A lineto
    ///draws a line from previous endpoint to its x,y; a curveto
    ///draws a quadratic bezier from previous endpoint to
    ///its x,y, using cx,cy as the bezier control point.
    public static @CType("int") int stbtt_GetGlyphShape(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int glyph_index, @CType("stbtt_vertex **") java.lang.foreign.MemorySegment vertices) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphShape.invokeExact(info, glyph_index, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphShape", e); }
    }

    ///frees the data allocated above
    public static void stbtt_FreeShape(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("stbtt_vertex *") java.lang.foreign.MemorySegment vertices) {
        try {
            Handles.MH_stbtt_FreeShape.invokeExact(info, vertices);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeShape", e); }
    }

    ///frees the data allocated above
    public static void stbtt_FreeShape(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("stbtt_vertex *") overrungl.stb.STBTTVertex vertices) {
        try {
            Handles.MH_stbtt_FreeShape.invokeExact(Marshal.marshal(info), Marshal.marshal(vertices));
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeShape", e); }
    }

    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_FindSVGDoc(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int gl) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stbtt_FindSVGDoc.invokeExact(info, gl);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindSVGDoc", e); }
    }

    ///fills svg with the character's SVG data.
    ///@return data size or 0 if SVG not found.
    public static @CType("int") int stbtt_GetCodepointSVG(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int unicode_codepoint, @CType("const char **") java.lang.foreign.MemorySegment svg) {
        try {
            return (int) Handles.MH_stbtt_GetCodepointSVG.invokeExact(info, unicode_codepoint, svg);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSVG", e); }
    }

    ///fills svg with the character's SVG data.
    ///@return data size or 0 if SVG not found.
    public static @CType("int") int stbtt_GetGlyphSVG(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("int") int gl, @CType("const char **") java.lang.foreign.MemorySegment svg) {
        try {
            return (int) Handles.MH_stbtt_GetGlyphSVG.invokeExact(info, gl, svg);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSVG", e); }
    }

    ///frees the bitmap allocated below
    public static void stbtt_FreeBitmap(@CType("unsigned char *") java.lang.foreign.MemorySegment bitmap, @CType("void*") java.lang.foreign.MemorySegment userdata) {
        try {
            Handles.MH_stbtt_FreeBitmap.invokeExact(bitmap, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeBitmap", e); }
    }

    ///allocates a large-enough single-channel 8bpp bitmap and renders the
    ///specified character/glyph at the specified scale into it, with
    ///antialiasing. 0 is no coverage (transparent), 255 is fully covered (opaque).
    ///*width & *height are filled out with the width & height of the bitmap,
    ///which is stored left-to-right, top-to-bottom.
    ///
    ///xoff/yoff are the offset it pixel space from the glyph origin to the top-left of the bitmap
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetCodepointBitmap(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int codepoint, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment xoff, @Out @CType("int*") java.lang.foreign.MemorySegment yoff) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetCodepointBitmap.invokeExact(info, scale_x, scale_y, codepoint, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmap", e); }
    }

    ///allocates a large-enough single-channel 8bpp bitmap and renders the
    ///specified character/glyph at the specified scale into it, with
    ///antialiasing. 0 is no coverage (transparent), 255 is fully covered (opaque).
    ///*width & *height are filled out with the width & height of the bitmap,
    ///which is stored left-to-right, top-to-bottom.
    ///
    ///xoff/yoff are the offset it pixel space from the glyph origin to the top-left of the bitmap
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetCodepointBitmap(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int codepoint, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetCodepointBitmap.invokeExact(Marshal.marshal(info), scale_x, scale_y, codepoint, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmap", e); }
    }

    ///the same as stbtt_GetCodepointBitmap, but you can specify a subpixel
    ///shift for the character
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetCodepointBitmapSubpixel(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int codepoint, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment xoff, @Out @CType("int*") java.lang.foreign.MemorySegment yoff) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetCodepointBitmapSubpixel.invokeExact(info, scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapSubpixel", e); }
    }

    ///the same as stbtt_GetCodepointBitmap, but you can specify a subpixel
    ///shift for the character
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetCodepointBitmapSubpixel(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int codepoint, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetCodepointBitmapSubpixel.invokeExact(Marshal.marshal(info), scale_x, scale_y, shift_x, shift_y, codepoint, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapSubpixel", e); }
    }

    ///the same as stbtt_GetCodepointBitmap, but you pass in storage for the bitmap
    ///in the form of 'output', with row spacing of 'out_stride' bytes. the bitmap
    ///is clipped to out_w/out_h bytes. Call stbtt_GetCodepointBitmapBox to get the
    ///width and height and positioning info for it first.
    public static void stbtt_MakeCodepointBitmap(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("unsigned char *") java.lang.foreign.MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmap.invokeExact(info, output, out_w, out_h, out_stride, scale_x, scale_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmap", e); }
    }

    ///same as stbtt_MakeCodepointBitmap, but you can specify a subpixel
    ///shift for the character
    public static void stbtt_MakeCodepointBitmapSubpixel(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("unsigned char *") java.lang.foreign.MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmapSubpixel.invokeExact(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixel", e); }
    }

    ///same as stbtt_MakeCodepointBitmapSubpixel, but prefiltering
    ///is performed (see stbtt_PackSetOversampling)
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("unsigned char *") java.lang.foreign.MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int oversample_x, @CType("int") int oversample_y, @Out @CType("float*") java.lang.foreign.MemorySegment sub_x, @Out @CType("float*") java.lang.foreign.MemorySegment sub_y, @CType("int") int codepoint) {
        try {
            Handles.MH_stbtt_MakeCodepointBitmapSubpixelPrefilter.invokeExact(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixelPrefilter", e); }
    }

    ///same as stbtt_MakeCodepointBitmapSubpixel, but prefiltering
    ///is performed (see stbtt_PackSetOversampling)
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("unsigned char *") java.lang.foreign.MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int oversample_x, @CType("int") int oversample_y, @Out @CType("float*") float[] sub_x, @Out @CType("float*") float[] sub_y, @CType("int") int codepoint) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_sub_x = Marshal.marshal(__overrungl_stack, sub_x);
            var __overrungl_ref_sub_y = Marshal.marshal(__overrungl_stack, sub_y);
            Handles.MH_stbtt_MakeCodepointBitmapSubpixelPrefilter.invokeExact(Marshal.marshal(info), output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, __overrungl_ref_sub_x, __overrungl_ref_sub_y, codepoint);
            Unmarshal.copy(__overrungl_ref_sub_x, sub_x);
            Unmarshal.copy(__overrungl_ref_sub_y, sub_y);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeCodepointBitmapSubpixelPrefilter", e); }
    }

    ///get the bbox of the bitmap centered around the glyph origin; so the
    ///bitmap width is ix1-ix0, height is iy1-iy0, and location to place
    ///the bitmap top left is (leftSideBearing*scale,iy0).
    ///(Note that the bitmap uses y-increases-down, but the shape uses
    ///y-increases-up, so CodepointBitmapBox and CodepointBox are inverted.)
    public static void stbtt_GetCodepointBitmapBox(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment font, @CType("int") int codepoint, @CType("float") float scale_x, @CType("float") float scale_y, @Out @CType("int*") java.lang.foreign.MemorySegment ix0, @Out @CType("int*") java.lang.foreign.MemorySegment iy0, @Out @CType("int*") java.lang.foreign.MemorySegment ix1, @Out @CType("int*") java.lang.foreign.MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetCodepointBitmapBox.invokeExact(font, codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBox", e); }
    }

    ///get the bbox of the bitmap centered around the glyph origin; so the
    ///bitmap width is ix1-ix0, height is iy1-iy0, and location to place
    ///the bitmap top left is (leftSideBearing*scale,iy0).
    ///(Note that the bitmap uses y-increases-down, but the shape uses
    ///y-increases-up, so CodepointBitmapBox and CodepointBox are inverted.)
    public static void stbtt_GetCodepointBitmapBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo font, @CType("int") int codepoint, @CType("float") float scale_x, @CType("float") float scale_y, @Out @CType("int*") int[] ix0, @Out @CType("int*") int[] iy0, @Out @CType("int*") int[] ix1, @Out @CType("int*") int[] iy1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ix0 = Marshal.marshal(__overrungl_stack, ix0);
            var __overrungl_ref_iy0 = Marshal.marshal(__overrungl_stack, iy0);
            var __overrungl_ref_ix1 = Marshal.marshal(__overrungl_stack, ix1);
            var __overrungl_ref_iy1 = Marshal.marshal(__overrungl_stack, iy1);
            Handles.MH_stbtt_GetCodepointBitmapBox.invokeExact(Marshal.marshal(font), codepoint, scale_x, scale_y, __overrungl_ref_ix0, __overrungl_ref_iy0, __overrungl_ref_ix1, __overrungl_ref_iy1);
            Unmarshal.copy(__overrungl_ref_ix0, ix0);
            Unmarshal.copy(__overrungl_ref_iy0, iy0);
            Unmarshal.copy(__overrungl_ref_ix1, ix1);
            Unmarshal.copy(__overrungl_ref_iy1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBox", e); }
    }

    ///same as stbtt_GetCodepointBitmapBox, but you can specify a subpixel
    ///shift for the character
    public static void stbtt_GetCodepointBitmapBoxSubpixel(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment font, @CType("int") int codepoint, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @Out @CType("int*") java.lang.foreign.MemorySegment ix0, @Out @CType("int*") java.lang.foreign.MemorySegment iy0, @Out @CType("int*") java.lang.foreign.MemorySegment ix1, @Out @CType("int*") java.lang.foreign.MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetCodepointBitmapBoxSubpixel.invokeExact(font, codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBoxSubpixel", e); }
    }

    ///same as stbtt_GetCodepointBitmapBox, but you can specify a subpixel
    ///shift for the character
    public static void stbtt_GetCodepointBitmapBoxSubpixel(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo font, @CType("int") int codepoint, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @Out @CType("int*") int[] ix0, @Out @CType("int*") int[] iy0, @Out @CType("int*") int[] ix1, @Out @CType("int*") int[] iy1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ix0 = Marshal.marshal(__overrungl_stack, ix0);
            var __overrungl_ref_iy0 = Marshal.marshal(__overrungl_stack, iy0);
            var __overrungl_ref_ix1 = Marshal.marshal(__overrungl_stack, ix1);
            var __overrungl_ref_iy1 = Marshal.marshal(__overrungl_stack, iy1);
            Handles.MH_stbtt_GetCodepointBitmapBoxSubpixel.invokeExact(Marshal.marshal(font), codepoint, scale_x, scale_y, shift_x, shift_y, __overrungl_ref_ix0, __overrungl_ref_iy0, __overrungl_ref_ix1, __overrungl_ref_iy1);
            Unmarshal.copy(__overrungl_ref_ix0, ix0);
            Unmarshal.copy(__overrungl_ref_iy0, iy0);
            Unmarshal.copy(__overrungl_ref_ix1, ix1);
            Unmarshal.copy(__overrungl_ref_iy1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointBitmapBoxSubpixel", e); }
    }

    ///the following functions are equivalent to the above functions, but operate
    ///on glyph indices instead of Unicode codepoints (for efficiency)
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetGlyphBitmap(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int glyph, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment xoff, @Out @CType("int*") java.lang.foreign.MemorySegment yoff) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetGlyphBitmap.invokeExact(info, scale_x, scale_y, glyph, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmap", e); }
    }

    ///the following functions are equivalent to the above functions, but operate
    ///on glyph indices instead of Unicode codepoints (for efficiency)
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetGlyphBitmap(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int glyph, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetGlyphBitmap.invokeExact(Marshal.marshal(info), scale_x, scale_y, glyph, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmap", e); }
    }

    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetGlyphBitmapSubpixel(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int glyph, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment xoff, @Out @CType("int*") java.lang.foreign.MemorySegment yoff) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetGlyphBitmapSubpixel.invokeExact(info, scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapSubpixel", e); }
    }

    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetGlyphBitmapSubpixel(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int glyph, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetGlyphBitmapSubpixel.invokeExact(Marshal.marshal(info), scale_x, scale_y, shift_x, shift_y, glyph, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapSubpixel", e); }
    }

    public static void stbtt_MakeGlyphBitmap(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("unsigned char *") java.lang.foreign.MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("int") int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmap.invokeExact(info, output, out_w, out_h, out_stride, scale_x, scale_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmap", e); }
    }

    public static void stbtt_MakeGlyphBitmapSubpixel(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("unsigned char *") java.lang.foreign.MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmapSubpixel.invokeExact(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixel", e); }
    }

    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("unsigned char *") java.lang.foreign.MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int oversample_x, @CType("int") int oversample_y, @Out @CType("float*") java.lang.foreign.MemorySegment sub_x, @Out @CType("float*") java.lang.foreign.MemorySegment sub_y, @CType("int") int glyph) {
        try {
            Handles.MH_stbtt_MakeGlyphBitmapSubpixelPrefilter.invokeExact(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixelPrefilter", e); }
    }

    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("unsigned char *") java.lang.foreign.MemorySegment output, @CType("int") int out_w, @CType("int") int out_h, @CType("int") int out_stride, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int oversample_x, @CType("int") int oversample_y, @Out @CType("float*") float[] sub_x, @Out @CType("float*") float[] sub_y, @CType("int") int glyph) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_sub_x = Marshal.marshal(__overrungl_stack, sub_x);
            var __overrungl_ref_sub_y = Marshal.marshal(__overrungl_stack, sub_y);
            Handles.MH_stbtt_MakeGlyphBitmapSubpixelPrefilter.invokeExact(Marshal.marshal(info), output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, __overrungl_ref_sub_x, __overrungl_ref_sub_y, glyph);
            Unmarshal.copy(__overrungl_ref_sub_x, sub_x);
            Unmarshal.copy(__overrungl_ref_sub_y, sub_y);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_MakeGlyphBitmapSubpixelPrefilter", e); }
    }

    public static void stbtt_GetGlyphBitmapBox(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment font, @CType("int") int glyph, @CType("float") float scale_x, @CType("float") float scale_y, @Out @CType("int*") java.lang.foreign.MemorySegment ix0, @Out @CType("int*") java.lang.foreign.MemorySegment iy0, @Out @CType("int*") java.lang.foreign.MemorySegment ix1, @Out @CType("int*") java.lang.foreign.MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetGlyphBitmapBox.invokeExact(font, glyph, scale_x, scale_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBox", e); }
    }

    public static void stbtt_GetGlyphBitmapBox(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo font, @CType("int") int glyph, @CType("float") float scale_x, @CType("float") float scale_y, @Out @CType("int*") int[] ix0, @Out @CType("int*") int[] iy0, @Out @CType("int*") int[] ix1, @Out @CType("int*") int[] iy1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ix0 = Marshal.marshal(__overrungl_stack, ix0);
            var __overrungl_ref_iy0 = Marshal.marshal(__overrungl_stack, iy0);
            var __overrungl_ref_ix1 = Marshal.marshal(__overrungl_stack, ix1);
            var __overrungl_ref_iy1 = Marshal.marshal(__overrungl_stack, iy1);
            Handles.MH_stbtt_GetGlyphBitmapBox.invokeExact(Marshal.marshal(font), glyph, scale_x, scale_y, __overrungl_ref_ix0, __overrungl_ref_iy0, __overrungl_ref_ix1, __overrungl_ref_iy1);
            Unmarshal.copy(__overrungl_ref_ix0, ix0);
            Unmarshal.copy(__overrungl_ref_iy0, iy0);
            Unmarshal.copy(__overrungl_ref_ix1, ix1);
            Unmarshal.copy(__overrungl_ref_iy1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBox", e); }
    }

    public static void stbtt_GetGlyphBitmapBoxSubpixel(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment font, @CType("int") int glyph, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @Out @CType("int*") java.lang.foreign.MemorySegment ix0, @Out @CType("int*") java.lang.foreign.MemorySegment iy0, @Out @CType("int*") java.lang.foreign.MemorySegment ix1, @Out @CType("int*") java.lang.foreign.MemorySegment iy1) {
        try {
            Handles.MH_stbtt_GetGlyphBitmapBoxSubpixel.invokeExact(font, glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBoxSubpixel", e); }
    }

    public static void stbtt_GetGlyphBitmapBoxSubpixel(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo font, @CType("int") int glyph, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @Out @CType("int*") int[] ix0, @Out @CType("int*") int[] iy0, @Out @CType("int*") int[] ix1, @Out @CType("int*") int[] iy1) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_ix0 = Marshal.marshal(__overrungl_stack, ix0);
            var __overrungl_ref_iy0 = Marshal.marshal(__overrungl_stack, iy0);
            var __overrungl_ref_ix1 = Marshal.marshal(__overrungl_stack, ix1);
            var __overrungl_ref_iy1 = Marshal.marshal(__overrungl_stack, iy1);
            Handles.MH_stbtt_GetGlyphBitmapBoxSubpixel.invokeExact(Marshal.marshal(font), glyph, scale_x, scale_y, shift_x, shift_y, __overrungl_ref_ix0, __overrungl_ref_iy0, __overrungl_ref_ix1, __overrungl_ref_iy1);
            Unmarshal.copy(__overrungl_ref_ix0, ix0);
            Unmarshal.copy(__overrungl_ref_iy0, iy0);
            Unmarshal.copy(__overrungl_ref_ix1, ix1);
            Unmarshal.copy(__overrungl_ref_iy1, iy1);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphBitmapBoxSubpixel", e); }
    }

    ///rasterize a shape with quadratic beziers into a bitmap
    ///@param result 1-channel bitmap to draw into
    ///@param flatness_in_pixels allowable error of curve in pixels
    ///@param vertices array of vertices defining shape
    ///@param num_verts number of vertices in above array
    ///@param scale_x scale applied to input vertices
    ///@param scale_y scale applied to input vertices
    ///@param shift_x translation applied to input vertices
    ///@param shift_y translation applied to input vertices
    ///@param x_off another translation applied to input
    ///@param y_off another translation applied to input
    ///@param invert if non-zero, vertically flip shape
    ///@param userdata context for to STBTT_MALLOC
    public static void stbtt_Rasterize(@CType("stbtt__bitmap *") java.lang.foreign.MemorySegment result, @CType("float") float flatness_in_pixels, @CType("stbtt_vertex *") java.lang.foreign.MemorySegment vertices, @CType("int") int num_verts, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int x_off, @CType("int") int y_off, @CType("int") boolean invert, @CType("void*") java.lang.foreign.MemorySegment userdata) {
        try {
            Handles.MH_stbtt_Rasterize.invokeExact(result, flatness_in_pixels, vertices, num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_Rasterize", e); }
    }

    ///rasterize a shape with quadratic beziers into a bitmap
    ///@param result 1-channel bitmap to draw into
    ///@param flatness_in_pixels allowable error of curve in pixels
    ///@param vertices array of vertices defining shape
    ///@param num_verts number of vertices in above array
    ///@param scale_x scale applied to input vertices
    ///@param scale_y scale applied to input vertices
    ///@param shift_x translation applied to input vertices
    ///@param shift_y translation applied to input vertices
    ///@param x_off another translation applied to input
    ///@param y_off another translation applied to input
    ///@param invert if non-zero, vertically flip shape
    ///@param userdata context for to STBTT_MALLOC
    public static void stbtt_Rasterize(@CType("stbtt__bitmap *") overrungl.stb.STBTT__bitmap result, @CType("float") float flatness_in_pixels, @CType("stbtt_vertex *") overrungl.stb.STBTTVertex vertices, @CType("int") int num_verts, @CType("float") float scale_x, @CType("float") float scale_y, @CType("float") float shift_x, @CType("float") float shift_y, @CType("int") int x_off, @CType("int") int y_off, @CType("int") boolean invert, @CType("void*") java.lang.foreign.MemorySegment userdata) {
        try {
            Handles.MH_stbtt_Rasterize.invokeExact(Marshal.marshal(result), flatness_in_pixels, Marshal.marshal(vertices), num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_Rasterize", e); }
    }

    ///frees the SDF bitmap allocated below
    public static void stbtt_FreeSDF(@CType("unsigned char *") java.lang.foreign.MemorySegment bitmap, @CType("void*") java.lang.foreign.MemorySegment userdata) {
        try {
            Handles.MH_stbtt_FreeSDF.invokeExact(bitmap, userdata);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FreeSDF", e); }
    }

    ///These functions compute a discretized SDF field for a single character, suitable for storing
    ///in a single-channel texture, sampling with bilinear filtering, and testing against
    ///larger than some threshold to produce scalable fonts.
    ///
    ///pixel_dist_scale & onedge_value are a scale & bias that allows you to make
    ///optimal use of the limited 0..255 for your application, trading off precision
    ///and special effects. SDF values outside the range 0..255 are clamped to 0..255.
    ///
    ///The function computes the SDF analytically at each SDF pixel, not by e.g.
    ///building a higher-res bitmap and approximating it. In theory the quality
    ///should be as high as possible for an SDF of this size & representation, but
    ///unclear if this is true in practice (perhaps building a higher-res bitmap
    ///and computing from that can allow drop-out prevention).
    ///
    ///The algorithm has not been optimized at all, so expect it to be slow
    ///if computing lots of characters or very large sizes.
    ///
    ///#### Example
    ///- scale = stbtt_ScaleForPixelHeight(22)
    ///- padding = 5
    ///- onedge_value = 180
    ///- pixel_dist_scale = 180/5.0 = 36.0
    ///
    ///This will create an SDF bitmap in which the character is about 22 pixels
    ///high but the whole bitmap is about 22+5+5=32 pixels high. To produce a filled
    ///shape, sample the SDF at each pixel and fill the pixel if the SDF value
    ///is greater than or equal to 180/255. (You'll actually want to antialias,
    ///which is beyond the scope of this example.) Additionally, you can compute
    ///offset outlines (e.g. to stroke the character border inside & outside,
    ///or only outside). For example, to fill outside the character up to 3 SDF
    ///pixels, you would compare against (180-36.0*3)/255 = 72/255. The above
    ///choice of variables maps a range from 5 pixels outside the shape to
    ///2 pixels inside the shape to 0..255; this is intended primarily for apply
    ///outside effects only (the interior range is needed to allow proper
    ///antialiasing of the font at *smaller* sizes)
    ///
    ///@param info             the font
    ///@param scale            controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap
    ///@param glyph            the character to generate the SDF for
    ///@param padding          extra "pixels" around the character which are filled with the distance to the character (not 0),
    ///                        which allows effects like bit outlines
    ///@param onedge_value     value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)
    ///@param pixel_dist_scale what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale)
    ///                        if positive, > onedge_value is inside; if negative, < onedge_value is inside
    ///@param width            output width of the SDF bitmap (including padding)
    ///@param height           output height of the SDF bitmap (including padding)
    ///@param xoff             output origin of the character
    ///@param yoff             output origin of the character
    ///@return a 2D array of bytes 0..255, width*height in size
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetGlyphSDF(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("float") float scale, @CType("int") int glyph, @CType("int") int padding, @CType("unsigned char") byte onedge_value, @CType("float") float pixel_dist_scale, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment xoff, @Out @CType("int*") java.lang.foreign.MemorySegment yoff) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetGlyphSDF.invokeExact(info, scale, glyph, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSDF", e); }
    }

    ///These functions compute a discretized SDF field for a single character, suitable for storing
    ///in a single-channel texture, sampling with bilinear filtering, and testing against
    ///larger than some threshold to produce scalable fonts.
    ///
    ///pixel_dist_scale & onedge_value are a scale & bias that allows you to make
    ///optimal use of the limited 0..255 for your application, trading off precision
    ///and special effects. SDF values outside the range 0..255 are clamped to 0..255.
    ///
    ///The function computes the SDF analytically at each SDF pixel, not by e.g.
    ///building a higher-res bitmap and approximating it. In theory the quality
    ///should be as high as possible for an SDF of this size & representation, but
    ///unclear if this is true in practice (perhaps building a higher-res bitmap
    ///and computing from that can allow drop-out prevention).
    ///
    ///The algorithm has not been optimized at all, so expect it to be slow
    ///if computing lots of characters or very large sizes.
    ///
    ///#### Example
    ///- scale = stbtt_ScaleForPixelHeight(22)
    ///- padding = 5
    ///- onedge_value = 180
    ///- pixel_dist_scale = 180/5.0 = 36.0
    ///
    ///This will create an SDF bitmap in which the character is about 22 pixels
    ///high but the whole bitmap is about 22+5+5=32 pixels high. To produce a filled
    ///shape, sample the SDF at each pixel and fill the pixel if the SDF value
    ///is greater than or equal to 180/255. (You'll actually want to antialias,
    ///which is beyond the scope of this example.) Additionally, you can compute
    ///offset outlines (e.g. to stroke the character border inside & outside,
    ///or only outside). For example, to fill outside the character up to 3 SDF
    ///pixels, you would compare against (180-36.0*3)/255 = 72/255. The above
    ///choice of variables maps a range from 5 pixels outside the shape to
    ///2 pixels inside the shape to 0..255; this is intended primarily for apply
    ///outside effects only (the interior range is needed to allow proper
    ///antialiasing of the font at *smaller* sizes)
    ///
    ///@param info             the font
    ///@param scale            controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap
    ///@param glyph            the character to generate the SDF for
    ///@param padding          extra "pixels" around the character which are filled with the distance to the character (not 0),
    ///                        which allows effects like bit outlines
    ///@param onedge_value     value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)
    ///@param pixel_dist_scale what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale)
    ///                        if positive, > onedge_value is inside; if negative, < onedge_value is inside
    ///@param width            output width of the SDF bitmap (including padding)
    ///@param height           output height of the SDF bitmap (including padding)
    ///@param xoff             output origin of the character
    ///@param yoff             output origin of the character
    ///@return a 2D array of bytes 0..255, width*height in size
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetGlyphSDF(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale, @CType("int") int glyph, @CType("int") int padding, @CType("unsigned char") byte onedge_value, @CType("float") float pixel_dist_scale, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetGlyphSDF.invokeExact(Marshal.marshal(info), scale, glyph, padding, onedge_value, pixel_dist_scale, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetGlyphSDF", e); }
    }

    ///See stbtt_GetGlyphSDF
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetCodepointSDF(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment info, @CType("float") float scale, @CType("int") int codepoint, @CType("int") int padding, @CType("unsigned char") byte onedge_value, @CType("float") float pixel_dist_scale, @Out @CType("int*") java.lang.foreign.MemorySegment width, @Out @CType("int*") java.lang.foreign.MemorySegment height, @Out @CType("int*") java.lang.foreign.MemorySegment xoff, @Out @CType("int*") java.lang.foreign.MemorySegment yoff) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetCodepointSDF.invokeExact(info, scale, codepoint, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSDF", e); }
    }

    ///See stbtt_GetGlyphSDF
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbtt_GetCodepointSDF(@CType("const stbtt_fontinfo *") overrungl.stb.STBTTFontInfo info, @CType("float") float scale, @CType("int") int codepoint, @CType("int") int padding, @CType("unsigned char") byte onedge_value, @CType("float") float pixel_dist_scale, @Out @CType("int*") int[] width, @Out @CType("int*") int[] height, @Out @CType("int*") int[] xoff, @Out @CType("int*") int[] yoff) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_width = Marshal.marshal(__overrungl_stack, width);
            var __overrungl_ref_height = Marshal.marshal(__overrungl_stack, height);
            var __overrungl_ref_xoff = Marshal.marshal(__overrungl_stack, xoff);
            var __overrungl_ref_yoff = Marshal.marshal(__overrungl_stack, yoff);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetCodepointSDF.invokeExact(Marshal.marshal(info), scale, codepoint, padding, onedge_value, pixel_dist_scale, __overrungl_ref_width, __overrungl_ref_height, __overrungl_ref_xoff, __overrungl_ref_yoff);
            Unmarshal.copy(__overrungl_ref_width, width);
            Unmarshal.copy(__overrungl_ref_height, height);
            Unmarshal.copy(__overrungl_ref_xoff, xoff);
            Unmarshal.copy(__overrungl_ref_yoff, yoff);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_GetCodepointSDF", e); }
    }

    ///returns the offset (not index) of the font that matches, or -1 if none
    ///if you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold".
    ///if you use any other flag, use a font name like "Arial"; this checks
    ///the 'macStyle' header field; i don't know if fonts set this consistently
    public static @CType("int") int stbtt_FindMatchingFont(@CType("const unsigned char *") java.lang.foreign.MemorySegment fontdata, @CType("const char*") java.lang.foreign.MemorySegment name, @CType("int") int flags) {
        try {
            return (int) Handles.MH_stbtt_FindMatchingFont.invokeExact(fontdata, name, flags);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindMatchingFont", e); }
    }

    ///returns the offset (not index) of the font that matches, or -1 if none
    ///if you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold".
    ///if you use any other flag, use a font name like "Arial"; this checks
    ///the 'macStyle' header field; i don't know if fonts set this consistently
    public static @CType("int") int stbtt_FindMatchingFont(@CType("const unsigned char *") java.lang.foreign.MemorySegment fontdata, @CType("const char*") java.lang.String name, @CType("int") int flags) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_stbtt_FindMatchingFont.invokeExact(fontdata, Marshal.marshal(__overrungl_stack, name), flags);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_FindMatchingFont", e); }
    }

    ///returns 1/0 whether the first string interpreted as utf8 is identical to
    ///the second string interpreted as big-endian utf16... useful for strings from next func
    public static @CType("int") boolean stbtt_CompareUTF8toUTF16_bigendian(@CType("const char*") java.lang.foreign.MemorySegment s1, @CType("int") int len1, @CType("const char*") java.lang.foreign.MemorySegment s2, @CType("int") int len2) {
        try {
            return (boolean) Handles.MH_stbtt_CompareUTF8toUTF16_bigendian.invokeExact(s1, len1, s2, len2);
        } catch (Throwable e) { throw new RuntimeException("error in stbtt_CompareUTF8toUTF16_bigendian", e); }
    }

    ///returns the string (which may be big-endian double byte, e.g. for unicode)
    ///and puts the length in bytes in *length.
    ///
    ///some of the values for the IDs are below; for more see the truetype spec:
    ///- <https://developer.apple.com/textfonts/TTRefMan/RM06/Chap6name.html>
    ///- <https://www.microsoft.com/typography/otspec/name.htm>
    public static @CType("const char*") java.lang.foreign.MemorySegment stbtt_GetFontNameString(@CType("const stbtt_fontinfo *") java.lang.foreign.MemorySegment font, @Out @CType("int*") java.lang.foreign.MemorySegment length, @CType("int") int platformID, @CType("int") int encodingID, @CType("int") int languageID, @CType("int") int nameID) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stbtt_GetFontNameString.invokeExact(font, length, platformID, encodingID, languageID, nameID);
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

    /// returns 1/0 whether the first string interpreted as utf8 is identical to
    /// the second string interpreted as big-endian utf16... useful for strings from next func
    public static boolean stbtt_CompareUTF8toUTF16_bigendian(String s1, String s2) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment ps1 = Marshal.marshal(stack, s1);
            MemorySegment ps2 = Marshal.marshal(stack, s2, StandardCharsets.UTF_16BE);
            return stbtt_CompareUTF8toUTF16_bigendian(ps1, Math.toIntExact(ps1.byteSize()) - 1, ps2, Math.toIntExact(ps2.byteSize()) - 2);
        }
    }

    /// Overloads [#stbtt_GetFontNameString(MemorySegment, MemorySegment, int, int, int, int)]
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
