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

package overrungl.stb;

import overrun.marshal.Downcall;
import overrun.marshal.gen.Convert;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Type;
import overrungl.NativeType;

import java.lang.foreign.MemorySegment;

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
 * import overrun.marshal.MemoryStack;
 * import java.lang.foreign.Arena;
 * import java.nio.channels.FileChannel;
 * import java.nio.file.Path;
 * import java.nio.file.StandardOpenOption;
 * STBTrueType stbtt = STBTrueType.INSTANCE;
 * Arena arena = Arena.ofAuto();
 *
 * STBTTBakedChar cdata = new STBTTBakedChar(arena, 96);
 * int ftex = 0;
 *
 * void my_stbtt_initfont() {
 *     try (var fc = FileChannel.open(Path.of("c:/windows/fonts/times.ttf"), StandardOpenOption.READ);
 *          var bufArena = Arena.ofConfined()) {
 *         var ttf_buffer = bufArena.allocate(1 << 20);
 *         var temp_bitmap = bufArena.allocate(512 * 512);
 *         ttf_buffer.copyFrom(fc.map(FileChannel.MapMode.READ_ONLY, 0, 1 << 20, arena));
 *         stbtt.bakeFontBitmap(ttf_buffer, 0, 32.0f, temp_bitmap, 512, 512, 32, 96, cdata); // no guarantee this fits!
 *         // can free ttf_buffer at this point
 *         ftex = gl.genTextures();
 *         gl.bindTexture(GL.TEXTURE_2D, ftex);
 *         gl.texImage2D(GL.TEXTURE_2D, 0, GL.ALPHA, 512, 512, 0, GL.ALPHA, GL.UNSIGNED_BYTE, temp_bitmap);
 *         // can free temp_bitmap at this point
 *         gl.texParameteri(GL.TEXTURE_2D, GL.TEXTURE_MIN_FILTER, GL.LINEAR);
 *     }
 * }
 *
 * void my_stbtt_print(float x, float y, String text) {
 *     // assume orthographic projection with units = screen pixels, origin at top left
 *     gl.enable(GL.BLEND);
 *     gl.blendFunc(GL.SRC_ALPHA, GL.ONE_MINUS_SRC_ALPHA);
 *     gl.enable(GL.TEXTURE_2D);
 *     gl.bindTexture(GL.TEXTURE_2D, ftex);
 *     gl.begin(GL.QUADS);
 *     try (var stack = MemoryStack.stackPush()) {
 *         var q = new STBTTAlignedQuad(stack);
 *         var px = stack.floats(x);
 *         var py = stack.floats(y);
 *         for (int i = 0, c = text.codePointCount(0, text.length()); i < c; i++) {
 *             int p = text.codePointAt(i);
 *             if (p >= 32 && p < 128) {
 *                 stbtt.getBakedQuad(cdata, 512, 512, p - 32, px, py, q, true); //true=opengl & d3d10+,false=d3d9
 *                 gl.texCoord2f(q.s0.get(), q.t0.get()); gl.vertex2f(q.x0.get(), q.y0.get());
 *                 gl.texCoord2f(q.s1.get(), q.t0.get()); gl.vertex2f(q.x1.get(), q.y0.get());
 *                 gl.texCoord2f(q.s1.get(), q.t1.get()); gl.vertex2f(q.x1.get(), q.y1.get());
 *                 gl.texCoord2f(q.s0.get(), q.t1.get()); gl.vertex2f(q.x0.get(), q.y1.get());
 *             }
 *         }
 *     }
 *     gl.end();
 * }
 *}
 * <p>
 * Complete program (this compiles): get a single bitmap, print as ASCII art
 * {@snippet lang = java:
 * import overrun.marshal.MemoryStack;
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
 *     var stbtt = STBTrueType.INSTANCE;
 *     var arena = Arena.ofAuto();
 *
 *     var font = new STBTTFontInfo(arena);
 *     int c = (args.length > 0 ? Integer.parseInt(args[0]) : 'a');
 *     int s = (args.length > 1 ? Integer.parseInt(args[1]) : 20);
 *
 *     try (var fc = FileChannel.open(Path.of(args.length > 2 ? args[2] : "c:/windows/fonts/arialbd.ttf"), StandardOpenOption.READ)) {
 *         var ttf_buffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size(), arena);
 *         stbtt.initFont(font, ttf_buffer, stbtt.getFontOffsetForIndex(ttf_buffer, 0));
 *     }
 *
 *     try (var stack = MemoryStack.stackPush()) {
 *         var pw = stack.ints(0);
 *         var ph = stack.ints(0);
 *         var bitmap = stbtt.getCodepointBitmap(font, 0, stbtt.scaleForPixelHeight(font, s), c, pw, ph, MemorySegment.NULL, MemorySegment.NULL);
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
public interface STBTrueType {
    /**
     * The instance of STBTrueType.
     */
    STBTrueType INSTANCE = Downcall.load(Handles.lookup);
    /**
     * STBTT_vmove
     */
    int vmove = 1,
        vline = 2,
        vcurve = 3,
        vcubic = 4;
    /**
     * macStyle
     */
    int MACSTYLE_DONTCARE = 0,
        MACSTYLE_BOLD = 1,
        MACSTYLE_ITALIC = 2,
        MACSTYLE_UNDERSCORE = 4,
        MACSTYLE_NONE = 8;
    /**
     * platformID
     */
    int PLATFORM_ID_UNICODE = 0,
        PLATFORM_ID_MAC = 1,
        PLATFORM_ID_ISO = 2,
        PLATFORM_ID_MICROSOFT = 3;
    /**
     * encodingID for STBTT_PLATFORM_ID_UNICODE
     */
    int UNICODE_EID_UNICODE_1_0 = 0,
        UNICODE_EID_UNICODE_1_1 = 1,
        UNICODE_EID_ISO_10646 = 2,
        UNICODE_EID_UNICODE_2_0_BMP = 3,
        UNICODE_EID_UNICODE_2_0_FULL = 4;
    /**
     * encodingID for STBTT_PLATFORM_ID_MICROSOFT
     */
    int MS_EID_SYMBOL = 0,
        MS_EID_UNICODE_BMP = 1,
        MS_EID_SHIFTJIS = 2,
        MS_EID_UNICODE_FULL = 10;
    /**
     * encodingID for STBTT_PLATFORM_ID_MAC; same as Script Manager codes
     */
    int MAC_EID_ROMAN = 0, MAC_EID_ARABIC = 4,
        MAC_EID_JAPANESE = 1, MAC_EID_HEBREW = 5,
        MAC_EID_CHINESE_TRAD = 2, MAC_EID_GREEK = 6,
        MAC_EID_KOREAN = 3, MAC_EID_RUSSIAN = 7;
    /**
     * languageID for STBTT_PLATFORM_ID_MICROSOFT; same as LCID...
     * <p>
     * problematic because there are e.g. 16 english LCIDs and 16 arabic LCIDs
     */
    int MS_LANG_ENGLISH = 0x0409, MS_LANG_ITALIAN = 0x0410,
        MS_LANG_CHINESE = 0x0804, MS_LANG_JAPANESE = 0x0411,
        MS_LANG_DUTCH = 0x0413, MS_LANG_KOREAN = 0x0412,
        MS_LANG_FRENCH = 0x040c, MS_LANG_RUSSIAN = 0x0419,
        MS_LANG_GERMAN = 0x0407, MS_LANG_SPANISH = 0x0409,
        MS_LANG_HEBREW = 0x040d, MS_LANG_SWEDISH = 0x041D;
    /**
     * languageID for STBTT_PLATFORM_ID_MAC
     */
    int MAC_LANG_ENGLISH = 0, MAC_LANG_JAPANESE = 11,
        MAC_LANG_ARABIC = 12, MAC_LANG_KOREAN = 23,
        MAC_LANG_DUTCH = 4, MAC_LANG_RUSSIAN = 32,
        MAC_LANG_FRENCH = 1, MAC_LANG_SPANISH = 6,
        MAC_LANG_GERMAN = 2, MAC_LANG_SWEDISH = 5,
        MAC_LANG_HEBREW = 10, MAC_LANG_CHINESE_SIMPLIFIED = 33,
        MAC_LANG_ITALIAN = 3, MAC_LANG_CHINESE_TRAD = 19;

    //////////////////////////////////////////////////////////////////////////////
    //
    // TEXTURE BAKING API
    //
    // If you use this API, you only have to call two functions ever.
    //

    /**
     * This uses a very crappy packing.
     *
     * @param data         data
     * @param offset       font location (use offset=0 for plain .ttf)
     * @param pixel_height height of font in pixels
     * @param pixels       bitmap to be filled in
     * @param pw           bitmap to be filled in
     * @param ph           bitmap to be filled in
     * @param first_char   characters to bake
     * @param num_chars    characters to bake
     * @param chardata     you allocate this, it's num_chars long
     * @return if return is positive, the first unused row of the bitmap;
     * if return is negative, returns the negative of the number of characters that fit;
     * if return is 0, no characters fit and no rows were used
     */
    @Entrypoint("stbtt_BakeFontBitmap")
    int bakeFontBitmap(@NativeType("const unsigned char *") MemorySegment data, int offset,
                       float pixel_height,
                       @NativeType("unsigned char *") MemorySegment pixels, int pw, int ph,
                       int first_char, int num_chars,
                       STBTTBakedChar chardata);

    /**
     * Call GetBakedQuad with char_index = 'character - first_char', and it
     * creates the quad you need to draw and advances the current position.
     * <p>
     * The coordinate system used assumes y increases downwards.
     * <p>
     * Characters will extend both above and below the current position;
     * see discussion of "BASELINE" above.
     * <p>
     * It's inefficient; you might want to c&amp;p it and optimize it.
     *
     * @param chardata        same data as {@link #bakeFontBitmap(MemorySegment, int, float, MemorySegment, int, int, int, int, STBTTBakedChar) above}
     * @param pw              same data as above
     * @param ph              same data as above
     * @param char_index      character to display
     * @param xpos            pointers to current position in screen pixel space
     * @param ypos            pointers to current position in screen pixel space
     * @param q               output: quad to draw
     * @param opengl_fillrule true if opengl fill rule; false if DX9 or earlier
     */
    @Entrypoint("stbtt_GetBakedQuad")
    void getBakedQuad(STBTTBakedChar chardata, int pw, int ph,
                      int char_index,
                      @NativeType("float *") MemorySegment xpos, @NativeType("float *") MemorySegment ypos,
                      STBTTAlignedQuad q,
                      @Convert(Type.INT) boolean opengl_fillrule);

    /**
     * Query the font vertical metrics without having to create a font first.
     *
     * @param fontdata fontdata
     * @param index    index
     * @param size     size
     * @param ascent   ascent
     * @param descent  descent
     * @param lineGap  lineGap
     */
    @Entrypoint("stbtt_GetScaledFontVMetrics")
    void getScaledFontVMetrics(@NativeType("const unsigned char *") MemorySegment fontdata, int index, float size, @NativeType("float *") MemorySegment ascent, @NativeType("float *") MemorySegment descent, @NativeType("float *") MemorySegment lineGap);

    //////////////////////////////////////////////////////////////////////////////
    //
    // NEW TEXTURE BAKING API
    //
    // This provides options for packing multiple fonts into one atlas, not
    // perfectly but better than nothing.

    /**
     * Initializes a packing context stored in the passed-in stbtt_pack_context.
     * Future calls using this context will pack characters into the bitmap passed
     * in here: a 1-channel bitmap that is width * height.
     *
     * @param spc             spc
     * @param pixels          pixels
     * @param width           width
     * @param height          height
     * @param stride_in_bytes the distance from one row to the next (or 0 to mean they are packed tightly
     *                        together).
     * @param padding         the amount of padding to leave between each
     *                        character (normally you want '1' for bitmaps you'll use as textures with
     *                        bilinear filtering).
     * @param alloc_context   alloc_context
     * @return 0 on failure, 1 on success.
     */
    @Entrypoint("stbtt_PackBegin")
    int packBegin(@NativeType("stbtt_pack_context *") MemorySegment spc, @NativeType("unsigned char *") MemorySegment pixels, int width, int height, int stride_in_bytes, int padding, @NativeType("void *") MemorySegment alloc_context);

    /**
     * Cleans up the packing context and frees all memory.
     *
     * @param spc spc
     */
    @Entrypoint("stbtt_PackEnd")
    void packEnd(@NativeType("stbtt_pack_context *") MemorySegment spc);

    /**
     * {@return a point size as computed by stbtt_ScaleForMappingEmToPixels}
     *
     * @param x x
     */
    static float pointSize(float x) {
        return -x;
    }

    /**
     * Creates character bitmaps from the font_index'th font found in fontdata (use
     * font_index=0 if you don't know what that is). It creates num_chars_in_range
     * bitmaps for characters with unicode values starting at first_unicode_char_in_range
     * and increasing. Data for how to render them is stored in chardata_for_range;
     * pass these to stbtt_GetPackedQuad to get back renderable quads.
     * <p>
     * font_size is the full height of the character from ascender to descender,
     * as computed by stbtt_ScaleForPixelHeight. To use a point size as computed
     * by stbtt_ScaleForMappingEmToPixels, wrap the point size in STBTT_POINT_SIZE()
     * and pass that result as 'font_size':
     * <pre>{@code
     * ...,                  20 , ... // font max minus min y is 20 pixels tall
     * ..., STBTT_POINT_SIZE(20), ... // 'M' is 20 pixels tall}</pre>
     *
     * @param spc                         spc
     * @param fontdata                    fontdata
     * @param font_index                  font_index
     * @param font_size                   the full height of the character from ascender to descender,
     *                                    as computed by stbtt_ScaleForPixelHeight.
     * @param first_unicode_char_in_range first_unicode_char_in_range
     * @param num_chars_in_range          num_chars_in_range
     * @param chardata_for_range          chardata_for_range
     * @return int
     */
    @Entrypoint("stbtt_PackFontRange")
    int packFontRange(@NativeType("stbtt_pack_context *") MemorySegment spc, @NativeType("const unsigned char *") MemorySegment fontdata, int font_index, float font_size,
                      int first_unicode_char_in_range, int num_chars_in_range, STBTTPackedChar chardata_for_range);

    /**
     * Creates character bitmaps from multiple ranges of characters stored in
     * ranges. This will usually create a better-packed bitmap than multiple
     * calls to stbtt_PackFontRange. Note that you can call this multiple
     * times within a single PackBegin/PackEnd.
     *
     * @param spc        spc
     * @param fontdata   fontdata
     * @param font_index font_index
     * @param ranges     ranges
     * @param num_ranges num_ranges
     * @return int
     */
    @Entrypoint("stbtt_PackFontRanges")
    int packFontRanges(@NativeType("stbtt_pack_context *") MemorySegment spc, @NativeType("const unsigned char *") MemorySegment fontdata, int font_index, STBTTPackRange ranges, int num_ranges);

    /**
     * Oversampling a font increases the quality by allowing higher-quality subpixel
     * positioning, and is especially valuable at smaller text sizes.
     * <p>
     * This function sets the amount of oversampling for all following calls to
     * stbtt_PackFontRange(s) or stbtt_PackFontRangesGatherRects for a given
     * pack context. The default (no oversampling) is achieved by h_oversample=1
     * and v_oversample=1. The total number of pixels required is
     * h_oversample*v_oversample larger than the default; for example, 2x2
     * oversampling requires 4x the storage of 1x1. For best results, render
     * oversampled textures with bilinear filtering. Look at the readme in
     * stb/tests/oversample for information about oversampled fonts
     * <p>
     * To use with PackFontRangesGather etc., you must set it before calls
     * call to PackFontRangesGatherRects.
     *
     * @param spc          spc
     * @param h_oversample h_oversample
     * @param v_oversample v_oversample
     */
    @Entrypoint("stbtt_PackSetOversampling")
    void packSetOversampling(@NativeType("stbtt_pack_context *") MemorySegment spc, int h_oversample, int v_oversample);

    /**
     * If skip != 0, this tells stb_truetype to skip any codepoints for which
     * there is no corresponding glyph. If skip=0, which is the default, then
     * codepoints without a glyph recived the font's "missing character" glyph,
     * typically an empty box by convention.
     *
     * @param spc  spc
     * @param skip skip
     */
    @Entrypoint("stbtt_PackSetSkipMissingCodepoints")
    void packSetSkipMissingCodepoints(@NativeType("stbtt_pack_context *") MemorySegment spc, @Convert(Type.INT) boolean skip);

    /**
     * Calling these functions in sequence is roughly equivalent to calling
     * stbtt_PackFontRanges(). If you more control over the packing of multiple
     * fonts, or if you want to pack custom data into a font texture, take a look
     * at the source to of stbtt_PackFontRanges() and create a custom version
     * using these functions, e.g. call GatherRects multiple times,
     * building up a single array of rects, then call PackRects once,
     * then call RenderIntoRects repeatedly. This may result in a
     * better packing than calling PackFontRanges multiple times
     * (or it may not).
     *
     * @param chardata         same data as above
     * @param pw               same data as above
     * @param ph               same data as above
     * @param char_index       character to display
     * @param xpos             pointers to current position in screen pixel space
     * @param ypos             pointers to current position in screen pixel space
     * @param q                output: quad to draw
     * @param align_to_integer align_to_integer
     */
    @Entrypoint("stbtt_GetPackedQuad")
    void getPackedQuad(STBTTPackedChar chardata, int pw, int ph,
                       int char_index,
                       @NativeType("float *") MemorySegment xpos, @NativeType("float *") MemorySegment ypos,
                       STBTTAlignedQuad q,
                       int align_to_integer);

    // TODO: 2024/1/28 squid233: Support STBRPRect

    /**
     * Calling these functions in sequence is roughly equivalent to calling
     * stbtt_PackFontRanges(). If you more control over the packing of multiple
     * fonts, or if you want to pack custom data into a font texture, take a look
     * at the source to of stbtt_PackFontRanges() and create a custom version
     * using these functions, e.g. call GatherRects multiple times,
     * building up a single array of rects, then call PackRects once,
     * then call RenderIntoRects repeatedly. This may result in a
     * better packing than calling PackFontRanges multiple times
     * (or it may not).
     *
     * @param spc        spc
     * @param info       info
     * @param ranges     ranges
     * @param num_ranges num_ranges
     * @param rects      rects
     * @return int
     */
    @Entrypoint("stbtt_PackFontRangesGatherRects")
    int packFontRangesGatherRects(@NativeType("stbtt_pack_context *") MemorySegment spc, @NativeType("const stbtt_fontinfo *") MemorySegment info, STBTTPackRange ranges, int num_ranges, @NativeType("stbrp_rect *") MemorySegment rects);

    /**
     * Calling these functions in sequence is roughly equivalent to calling
     * stbtt_PackFontRanges(). If you more control over the packing of multiple
     * fonts, or if you want to pack custom data into a font texture, take a look
     * at the source to of stbtt_PackFontRanges() and create a custom version
     * using these functions, e.g. call GatherRects multiple times,
     * building up a single array of rects, then call PackRects once,
     * then call RenderIntoRects repeatedly. This may result in a
     * better packing than calling PackFontRanges multiple times
     * (or it may not).
     *
     * @param spc       spc
     * @param rects     rects
     * @param num_rects num_rects
     */
    @Entrypoint("stbtt_PackFontRangesPackRects")
    void packFontRangesPackRects(@NativeType("stbtt_pack_context *") MemorySegment spc, @NativeType("stbrp_rect *") MemorySegment rects, int num_rects);

    /**
     * Calling these functions in sequence is roughly equivalent to calling
     * stbtt_PackFontRanges(). If you more control over the packing of multiple
     * fonts, or if you want to pack custom data into a font texture, take a look
     * at the source to of stbtt_PackFontRanges() and create a custom version
     * using these functions, e.g. call GatherRects multiple times,
     * building up a single array of rects, then call PackRects once,
     * then call RenderIntoRects repeatedly. This may result in a
     * better packing than calling PackFontRanges multiple times
     * (or it may not).
     *
     * @param spc        spc
     * @param info       info
     * @param ranges     ranges
     * @param num_ranges num_ranges
     * @param rects      rects
     * @return int
     */
    @Entrypoint("stbtt_PackFontRangesRenderIntoRects")
    int packFontRangesRenderIntoRects(@NativeType("stbtt_pack_context *") MemorySegment spc, @NativeType("const stbtt_fontinfo *") MemorySegment info, STBTTPackRange ranges, int num_ranges, @NativeType("stbrp_rect *") MemorySegment rects);

    //////////////////////////////////////////////////////////////////////////////
    //
    // FONT LOADING
    //
    //

    /**
     * This function will determine the number of fonts in a font file.  TrueType
     * collection (.ttc) files may contain multiple fonts, while TrueType font
     * (.ttf) files only contain one font. The number of fonts can be used for
     * indexing with the previous function where the index is between zero and one
     * less than the total fonts. If an error occurs, -1 is returned.
     *
     * @param data data
     * @return the number of fonts in a font file
     */
    @Entrypoint("stbtt_GetNumberOfFonts")
    int getNumberOfFonts(@NativeType("const unsigned char *") MemorySegment data);

    /**
     * Each .ttf/.ttc file may have more than one font. Each font has a sequential
     * index number starting from 0. Call this function to get the font offset for
     * a given index; it returns -1 if the index is out of range. A regular .ttf
     * file will only define one font and it always be at offset 0, so it will
     * return '0' for index 0, and -1 for all other indices.
     *
     * @param index index
     * @return the font offset for a given index
     */
    @Entrypoint("stbtt_GetFontOffsetForIndex")
    int getFontOffsetForIndex(@NativeType("const unsigned char *") MemorySegment data, int index);

    /**
     * Given an offset into the file that defines a font, this function builds
     * the necessary cached info for the rest of the system. You must allocate
     * the stbtt_fontinfo yourself, and stbtt_InitFont will fill it out. You don't
     * need to do anything special to free it, because the contents are pure
     * value data with no additional data structures.
     *
     * @param info   info
     * @param data   data
     * @param offset offset
     * @return {@code false} on failure.
     */
    @Convert(Type.INT)
    @Entrypoint("stbtt_InitFont")
    boolean initFont(STBTTFontInfo info, @NativeType("const unsigned char *") MemorySegment data, int offset);

    //////////////////////////////////////////////////////////////////////////////
    //
    // CHARACTER TO GLYPH-INDEX CONVERSION

    /**
     * If you're going to perform multiple operations on the same character
     * and you want a speed-up, call this function with the character you're
     * going to process, then use glyph-based functions instead of the
     * codepoint-based functions.
     *
     * @param info              info
     * @param unicode_codepoint unicode_codepoint
     * @return 0 if the character codepoint is not defined in the font.
     */
    @Entrypoint("stbtt_FindGlyphIndex")
    int findGlyphIndex(STBTTFontInfo info, int unicode_codepoint);

    //////////////////////////////////////////////////////////////////////////////
    //
    // CHARACTER PROPERTIES
    //

    /**
     * computes a scale factor to produce a font whose "height" is 'pixels' tall.
     * Height is measured as the distance from the highest ascender to the lowest
     * descender; in other words, it's equivalent to calling stbtt_GetFontVMetrics
     * and computing:
     * <p>
     * {@code scale = pixels / (ascent - descent)}
     * <p>
     * so if you prefer to measure height by the ascent only, use a similar calculation.
     *
     * @param info   info
     * @param pixels pixels
     * @return a scale factor
     */
    @Entrypoint("stbtt_ScaleForPixelHeight")
    float scaleForPixelHeight(STBTTFontInfo info, float pixels);

    /**
     * computes a scale factor to produce a font whose EM size is mapped to
     * 'pixels' tall. This is probably what traditional APIs compute, but
     * I'm not positive.
     *
     * @param info   info
     * @param pixels pixels
     * @return a scale factor
     */
    @Entrypoint("stbtt_ScaleForMappingEmToPixels")
    float scaleForMappingEmToPixels(STBTTFontInfo info, float pixels);

    /**
     * ascent is the coordinate above the baseline the font extends; descent
     * is the coordinate below the baseline the font extends (i.e. it is typically negative)
     * lineGap is the spacing between one row's descent and the next row's ascent...
     * so you should advance the vertical position by "*ascent - *descent + *lineGap"
     * <p>
     * these are expressed in unscaled coordinates, so you must multiply by
     * the scale factor for a given size
     *
     * @param info    info
     * @param ascent  ascent
     * @param descent descent
     * @param lineGap lineGap
     */
    @Entrypoint("stbtt_GetFontVMetrics")
    void getFontVMetrics(STBTTFontInfo info, @NativeType("int *") MemorySegment ascent, @NativeType("int *") MemorySegment descent, @NativeType("int *") MemorySegment lineGap);

    /**
     * analogous to GetFontVMetrics, but returns the "typographic" values from the OS/2
     * table (specific to MS/Windows TTF files).
     *
     * @param info        info
     * @param typoAscent  typoAscent
     * @param typoDescent typoDescent
     * @param typoLineGap typoLineGap
     * @return {@code true} on success (table present), {@code false} on failure.
     */
    @Convert(Type.INT)
    @Entrypoint("stbtt_GetFontVMetricsOS2")
    boolean getFontVMetricsOS2(STBTTFontInfo info, @NativeType("int *") MemorySegment typoAscent, @NativeType("int *") MemorySegment typoDescent, @NativeType("int *") MemorySegment typoLineGap);

    /**
     * the bounding box around all possible characters
     *
     * @param info info
     * @param x0   x0
     * @param y0   y0
     * @param x1   x1
     * @param y1   y1
     */
    @Entrypoint("stbtt_GetFontBoundingBox")
    void getFontBoundingBox(STBTTFontInfo info, @NativeType("int *") MemorySegment x0, @NativeType("int *") MemorySegment y0, @NativeType("int *") MemorySegment x1, @NativeType("int *") MemorySegment y1);

    /**
     * <i>{@code advanceWidth}</i> and <i>{@code leftSideBearing}</i> are expressed in unscaled coordinates
     *
     * @param info            info
     * @param codepoint       codepoint
     * @param advanceWidth    the offset from the current horizontal position to the next horizontal position
     * @param leftSideBearing the offset from the current horizontal position to the left edge of the character
     */
    @Entrypoint("stbtt_GetCodepointHMetrics")
    void getCodepointHMetrics(STBTTFontInfo info, int codepoint, @NativeType("int *") MemorySegment advanceWidth, @NativeType("int *") MemorySegment leftSideBearing);

    /**
     * {@return an additional amount to add to the 'advance' value between ch1 and ch2}
     *
     * @param info info
     * @param ch1  ch1
     * @param ch2  ch2
     */
    @Entrypoint("stbtt_GetCodepointKernAdvance")
    int getCodepointKernAdvance(STBTTFontInfo info, int ch1, int ch2);

    /**
     * Gets the bounding box of the visible part of the glyph, in unscaled coordinates
     *
     * @param info      info
     * @param codepoint codepoint
     * @param x0        x0
     * @param y0        y0
     * @param x1        x1
     * @param y1        y1
     * @return the bounding box of the visible part of the glyph, in unscaled coordinates
     */
    @Entrypoint("stbtt_GetCodepointBox")
    int getCodepointBox(STBTTFontInfo info, int codepoint, @NativeType("int *") MemorySegment x0, @NativeType("int *") MemorySegment y0, @NativeType("int *") MemorySegment x1, @NativeType("int *") MemorySegment y1);

    /**
     * as above, but takes one or more glyph indices for greater efficiency
     *
     * @param info            info
     * @param glyph_index     glyph_index
     * @param advanceWidth    advanceWidth
     * @param leftSideBearing leftSideBearing
     */
    @Entrypoint("stbtt_GetGlyphHMetrics")
    void getGlyphHMetrics(STBTTFontInfo info, int glyph_index, @NativeType("int *") MemorySegment advanceWidth, @NativeType("int *") MemorySegment leftSideBearing);

    /**
     * as above, but takes one or more glyph indices for greater efficiency
     *
     * @param info   info
     * @param glyph1 glyph1
     * @param glyph2 glyph2
     * @return int
     */
    @Entrypoint("stbtt_GetGlyphKernAdvance")
    int getGlyphKernAdvance(STBTTFontInfo info, int glyph1, int glyph2);

    /**
     * as above, but takes one or more glyph indices for greater efficiency
     *
     * @param info        info
     * @param glyph_index glyph_index
     * @param x0          x0
     * @param y0          y0
     * @param x1          x1
     * @param y1          y1
     * @return int
     */
    @Entrypoint("stbtt_GetGlyphBox")
    int getGlyphBox(STBTTFontInfo info, int glyph_index, @NativeType("int *") MemorySegment x0, @NativeType("int *") MemorySegment y0, @NativeType("int *") MemorySegment x1, @NativeType("int *") MemorySegment y1);

    /**
     * Retrieves a complete list of all of the kerning pairs provided by the font
     * stbtt_GetKerningTable never writes more than table_length entries and returns how many entries it did write.
     * <p>
     * The table will be sorted by {@code (a.glyph1 == b.glyph1)?(a.glyph2 < b.glyph2):(a.glyph1 < b.glyph1)}
     *
     * @param info info
     * @return how many entries it did write
     */
    @Entrypoint("stbtt_GetKerningTableLength")
    int getKerningTableLength(STBTTFontInfo info);

    /**
     * Retrieves a complete list of all of the kerning pairs provided by the font
     * stbtt_GetKerningTable never writes more than table_length entries and returns how many entries it did write.
     * <p>
     * The table will be sorted by {@code (a.glyph1 == b.glyph1)?(a.glyph2 < b.glyph2):(a.glyph1 < b.glyph1)}
     *
     * @param info         info
     * @param table        table
     * @param table_length table_length
     * @return int
     */
    @Entrypoint("stbtt_GetKerningTable")
    int getKerningTable(STBTTFontInfo info, STBTTKerningEntry table, int table_length);

    //////////////////////////////////////////////////////////////////////////////
    //
    // GLYPH SHAPES (you probably don't need these, but they have to go before
    // the bitmaps for C declaration-order reasons)
    //

    /**
     * {@return true if nothing is drawn for this glyph}
     *
     * @param info        info
     * @param glyph_index glyph_index
     */
    @Convert(Type.INT)
    @Entrypoint("stbtt_IsGlyphEmpty")
    boolean isGlyphEmpty(STBTTFontInfo info, int glyph_index);

    /**
     * {@return # of vertices and fills *vertices with the pointer to them
     * these are expressed in "unscaled" coordinates}
     * <p>
     * The shape is a series of contours. Each one starts with
     * a STBTT_moveto, then consists of a series of mixed
     * STBTT_lineto and STBTT_curveto segments. A lineto
     * draws a line from previous endpoint to its x,y; a curveto
     * draws a quadratic bezier from previous endpoint to
     * its x,y, using cx,cy as the bezier control point.
     *
     * @param info              info
     * @param unicode_codepoint unicode_codepoint
     * @param vertices          vertices
     */
    @Entrypoint("stbtt_GetCodepointShape")
    int getCodepointShape(STBTTFontInfo info, int unicode_codepoint, @NativeType("stbtt_vertex **") MemorySegment vertices);

    /**
     * {@return # of vertices and fills *vertices with the pointer to them
     * these are expressed in "unscaled" coordinates}
     * <p>
     * The shape is a series of contours. Each one starts with
     * a STBTT_moveto, then consists of a series of mixed
     * STBTT_lineto and STBTT_curveto segments. A lineto
     * draws a line from previous endpoint to its x,y; a curveto
     * draws a quadratic bezier from previous endpoint to
     * its x,y, using cx,cy as the bezier control point.
     *
     * @param info        info
     * @param glyph_index glyph_index
     * @param vertices    vertices
     */
    @Entrypoint("stbtt_GetGlyphShape")
    int getGlyphShape(STBTTFontInfo info, int glyph_index, @NativeType("stbtt_vertex **") MemorySegment vertices);

    /**
     * frees the data allocated above
     *
     * @param info     info
     * @param vertices vertices
     */
    @Entrypoint("stbtt_FreeShape")
    void freeShape(STBTTFontInfo info, STBTTVertex vertices);

    /**
     * fills svg with the character's SVG data.
     *
     * @param info info
     * @param gl   gl
     * @return data size or 0 if SVG not found.
     */
    @NativeType("unsigned char *")
    @Entrypoint("stbtt_FindSVGDoc")
    MemorySegment findSVGDoc(STBTTFontInfo info, int gl);

    /**
     * fills svg with the character's SVG data.
     *
     * @param info              info
     * @param unicode_codepoint unicode_codepoint
     * @param svg               svg
     * @return data size or 0 if SVG not found.
     */
    @Entrypoint("stbtt_GetCodepointSVG")
    int getCodepointSVG(STBTTFontInfo info, int unicode_codepoint, @NativeType("const char **") MemorySegment svg);

    /**
     * fills svg with the character's SVG data.
     *
     * @param info info
     * @param gl   gl
     * @param svg  svg
     * @return data size or 0 if SVG not found.
     */
    @Entrypoint("stbtt_GetGlyphSVG")
    int getGlyphSVG(STBTTFontInfo info, int gl, @NativeType("const char **") MemorySegment svg);

    //////////////////////////////////////////////////////////////////////////////
    //
    // BITMAP RENDERING
    //

    /**
     * frees the bitmap allocated below
     *
     * @param bitmap   bitmap
     * @param userdata userdata
     */
    @Entrypoint("stbtt_FreeBitmap")
    void freeBitmap(@NativeType("unsigned char *") MemorySegment bitmap, @NativeType("void *") MemorySegment userdata);

    /**
     * allocates a large-enough single-channel 8bpp bitmap and renders the
     * specified character/glyph at the specified scale into it, with
     * antialiasing. 0 is no coverage (transparent), 255 is fully covered (opaque).
     * *width &amp; *height are filled out with the width &amp; height of the bitmap,
     * which is stored left-to-right, top-to-bottom.
     *
     * @param info      info
     * @param scale_x   scale_x
     * @param scale_y   scale_y
     * @param codepoint codepoint
     * @param width     width
     * @param height    height
     * @param xoff      the offset it pixel space from the glyph origin to the top-left of the bitmap
     * @param yoff      the offset it pixel space from the glyph origin to the top-left of the bitmap
     * @return data
     */
    @Entrypoint("stbtt_GetCodepointBitmap")
    @NativeType("unsigned char *")
    MemorySegment getCodepointBitmap(STBTTFontInfo info, float scale_x, float scale_y, int codepoint, @NativeType("int *") MemorySegment width, @NativeType("int *") MemorySegment height, @NativeType("int *") MemorySegment xoff, @NativeType("int *") MemorySegment yoff);

    /**
     * the same as stbtt_GetCodepoitnBitmap, but you can specify a subpixel
     * shift for the character
     *
     * @param info      info
     * @param scale_x   scale_x
     * @param scale_y   scale_y
     * @param shift_x   shift_x
     * @param shift_y   shift_y
     * @param codepoint codepoint
     * @param width     width
     * @param height    height
     * @param xoff      the offset it pixel space from the glyph origin to the top-left of the bitmap
     * @param yoff      the offset it pixel space from the glyph origin to the top-left of the bitmap
     * @return data
     */
    @Entrypoint("stbtt_GetCodepointBitmapSubpixel")
    @NativeType("unsigned char *")
    MemorySegment getCodepointBitmapSubpixel(STBTTFontInfo info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NativeType("int *") MemorySegment width, @NativeType("int *") MemorySegment height, @NativeType("int *") MemorySegment xoff, @NativeType("int *") MemorySegment yoff);

    /**
     * the same as stbtt_GetCodepointBitmap, but you pass in storage for the bitmap
     * in the form of 'output', with row spacing of 'out_stride' bytes. the bitmap
     * is clipped to out_w/out_h bytes. Call stbtt_GetCodepointBitmapBox to get the
     * width and height and positioning info for it first.
     *
     * @param info       info
     * @param output     output
     * @param out_w      out_w
     * @param out_h      out_h
     * @param out_stride out_stride
     * @param scale_x    scale_x
     * @param scale_y    scale_y
     * @param codepoint  codepoint
     */
    @Entrypoint("stbtt_MakeCodepointBitmap")
    void makeCodepointBitmap(STBTTFontInfo info, @NativeType("unsigned char *") MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint);

    /**
     * same as stbtt_MakeCodepointBitmap, but you can specify a subpixel
     * shift for the character
     *
     * @param info       info
     * @param output     output
     * @param out_w      out_w
     * @param out_h      out_h
     * @param out_stride out_stride
     * @param scale_x    scale_x
     * @param scale_y    scale_y
     * @param shift_x    shift_x
     * @param shift_y    shift_y
     * @param codepoint  codepoint
     */
    @Entrypoint("stbtt_MakeCodepointBitmapSubpixel")
    void makeCodepointBitmapSubpixel(STBTTFontInfo info, @NativeType("unsigned char *") MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint);

    /**
     * same as stbtt_MakeCodepointBitmapSubpixel, but prefiltering
     * is performed (see stbtt_PackSetOversampling)
     *
     * @param info         info
     * @param output       output
     * @param out_w        out_w
     * @param out_h        out_h
     * @param out_stride   out_stride
     * @param scale_x      scale_x
     * @param scale_y      scale_y
     * @param shift_x      shift_x
     * @param shift_y      shift_y
     * @param oversample_x oversample_x
     * @param oversample_y oversample_y
     * @param sub_x        sub_x
     * @param sub_y        sub_y
     * @param codepoint    codepoint
     * @see #packSetOversampling(MemorySegment, int, int)
     */
    @Entrypoint("stbtt_MakeCodepointBitmapSubpixelPrefilter")
    void makeCodepointBitmapSubpixelPrefilter(STBTTFontInfo info, @NativeType("unsigned char *") MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") MemorySegment sub_x, @NativeType("float *") MemorySegment sub_y, int codepoint);

    /**
     * get the bbox of the bitmap centered around the glyph origin; so the
     * bitmap width is ix1-ix0, height is iy1-iy0, and location to place
     * the bitmap top left is (leftSideBearing*scale,iy0).
     * (Note that the bitmap uses y-increases-down, but the shape uses
     * y-increases-up, so CodepointBitmapBox and CodepointBox are inverted.)
     *
     * @param font      font
     * @param codepoint codepoint
     * @param scale_x   scale_x
     * @param scale_y   scale_y
     * @param ix0       ix0
     * @param iy0       iy0
     * @param ix1       ix1
     * @param iy1       iy1
     */
    @Entrypoint("stbtt_GetCodepointBitmapBox")
    void getCodepointBitmapBox(STBTTFontInfo font, int codepoint, float scale_x, float scale_y, @NativeType("int *") MemorySegment ix0, @NativeType("int *") MemorySegment iy0, @NativeType("int *") MemorySegment ix1, @NativeType("int *") MemorySegment iy1);

    /**
     * same as stbtt_GetCodepointBitmapBox, but you can specify a subpixel
     * shift for the character
     *
     * @param font      font
     * @param codepoint codepoint
     * @param scale_x   scale_x
     * @param scale_y   scale_y
     * @param shift_x   shift_x
     * @param shift_y   shift_y
     * @param ix0       ix0
     * @param iy0       iy0
     * @param ix1       ix1
     * @param iy1       iy1
     */
    @Entrypoint("stbtt_GetCodepointBitmapBoxSubpixel")
    void getCodepointBitmapBoxSubpixel(STBTTFontInfo font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") MemorySegment ix0, @NativeType("int *") MemorySegment iy0, @NativeType("int *") MemorySegment ix1, @NativeType("int *") MemorySegment iy1);

    /**
     * the following functions are equivalent to the above functions, but operate
     * on glyph indices instead of Unicode codepoints (for efficiency)
     *
     * @param info    info
     * @param scale_x scale_x
     * @param scale_y scale_y
     * @param glyph   glyph
     * @param width   width
     * @param height  height
     * @param xoff    xoff
     * @param yoff    yoff
     * @return data
     */
    @NativeType("unsigned char *")
    @Entrypoint("stbtt_GetGlyphBitmap")
    MemorySegment getGlyphBitmap(STBTTFontInfo info, float scale_x, float scale_y, int glyph, @NativeType("int *") MemorySegment width, @NativeType("int *") MemorySegment height, @NativeType("int *") MemorySegment xoff, @NativeType("int *") MemorySegment yoff);

    /**
     * the following functions are equivalent to the above functions, but operate
     * on glyph indices instead of Unicode codepoints (for efficiency)
     *
     * @param info    info
     * @param scale_x scale_x
     * @param scale_y scale_y
     * @param shift_x shift_x
     * @param shift_y shift_y
     * @param glyph   glyph
     * @param width   width
     * @param height  height
     * @param xoff    xoff
     * @param yoff    yoff
     * @return data
     */
    @NativeType("unsigned char *")
    @Entrypoint("stbtt_GetGlyphBitmapSubpixel")
    MemorySegment getGlyphBitmapSubpixel(STBTTFontInfo info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NativeType("int *") MemorySegment width, @NativeType("int *") MemorySegment height, @NativeType("int *") MemorySegment xoff, @NativeType("int *") MemorySegment yoff);

    /**
     * the following functions are equivalent to the above functions, but operate
     * on glyph indices instead of Unicode codepoints (for efficiency)
     *
     * @param info       info
     * @param output     output
     * @param out_w      out_w
     * @param out_h      out_h
     * @param out_stride out_stride
     * @param scale_x    scale_x
     * @param scale_y    scale_y
     * @param glyph      glyph
     */
    @Entrypoint("stbtt_MakeGlyphBitmap")
    void makeGlyphBitmap(STBTTFontInfo info, @NativeType("unsigned char *") MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph);

    /**
     * the following functions are equivalent to the above functions, but operate
     * on glyph indices instead of Unicode codepoints (for efficiency)
     *
     * @param info       info
     * @param output     output
     * @param out_w      out_w
     * @param out_h      out_h
     * @param out_stride out_stride
     * @param scale_x    scale_x
     * @param scale_y    scale_y
     * @param shift_x    shift_x
     * @param shift_y    shift_y
     * @param glyph      glyph
     */
    @Entrypoint("stbtt_MakeGlyphBitmapSubpixel")
    void makeGlyphBitmapSubpixel(STBTTFontInfo info, @NativeType("unsigned char *") MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph);

    /**
     * the following functions are equivalent to the above functions, but operate
     * on glyph indices instead of Unicode codepoints (for efficiency)
     *
     * @param info         info
     * @param output       output
     * @param out_w        out_w
     * @param out_h        out_h
     * @param out_stride   out_stride
     * @param scale_x      scale_x
     * @param scale_y      scale_y
     * @param shift_x      shift_x
     * @param shift_y      shift_y
     * @param oversample_x oversample_x
     * @param oversample_y oversample_y
     * @param sub_x        sub_x
     * @param sub_y        sub_y
     * @param glyph        glyph
     */
    @Entrypoint("stbtt_MakeGlyphBitmapSubpixelPrefilter")
    void makeGlyphBitmapSubpixelPrefilter(STBTTFontInfo info, @NativeType("unsigned char *") MemorySegment output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") MemorySegment sub_x, @NativeType("float *") MemorySegment sub_y, int glyph);

    /**
     * the following functions are equivalent to the above functions, but operate
     * on glyph indices instead of Unicode codepoints (for efficiency)
     *
     * @param font    font
     * @param glyph   glyph
     * @param scale_x scale_x
     * @param scale_y scale_y
     * @param ix0     ix0
     * @param iy0     iy0
     * @param ix1     ix1
     * @param iy1     iy1
     */
    @Entrypoint("stbtt_GetGlyphBitmapBox")
    void getGlyphBitmapBox(STBTTFontInfo font, int glyph, float scale_x, float scale_y, @NativeType("int *") MemorySegment ix0, @NativeType("int *") MemorySegment iy0, @NativeType("int *") MemorySegment ix1, @NativeType("int *") MemorySegment iy1);

    /**
     * the following functions are equivalent to the above functions, but operate
     * on glyph indices instead of Unicode codepoints (for efficiency)
     *
     * @param font    font
     * @param glyph   glyph
     * @param scale_x scale_x
     * @param scale_y scale_y
     * @param shift_x shift_x
     * @param shift_y shift_y
     * @param ix0     ix0
     * @param iy0     iy0
     * @param ix1     ix1
     * @param iy1     iy1
     */
    @Entrypoint("stbtt_GetGlyphBitmapBoxSubpixel")
    void getGlyphBitmapBoxSubpixel(STBTTFontInfo font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") MemorySegment ix0, @NativeType("int *") MemorySegment iy0, @NativeType("int *") MemorySegment ix1, @NativeType("int *") MemorySegment iy1);

    /**
     * rasterize a shape with quadratic beziers into a bitmap
     *
     * @param result             1-channel bitmap to draw into
     * @param flatness_in_pixels allowable error of curve in pixels
     * @param vertices           array of vertices defining shape
     * @param num_verts          number of vertices in above array
     * @param scale_x            scale applied to input vertices
     * @param scale_y            scale applied to input vertices
     * @param shift_x            translation applied to input vertices
     * @param shift_y            translation applied to input vertices
     * @param x_off              another translation applied to input
     * @param y_off              another translation applied to input
     * @param invert             if non-zero, vertically flip shape
     * @param userdata           context for to STBTT_MALLOC
     */
    @Entrypoint("stbtt_Rasterize")
    void rasterize(@NativeType("stbtt__bitmap *") MemorySegment result,
                   float flatness_in_pixels,
                   STBTTVertex vertices,
                   int num_verts,
                   float scale_x, float scale_y,
                   float shift_x, float shift_y,
                   int x_off, int y_off,
                   int invert,
                   @NativeType("void *") MemorySegment userdata);

    //////////////////////////////////////////////////////////////////////////////
    //
    // Signed Distance Function (or Field) rendering

    /**
     * frees the SDF bitmap allocated below
     *
     * @param bitmap   bitmap
     * @param userdata userdata
     */
    @Entrypoint("stbtt_FreeSDF")
    void freeSDF(@NativeType("unsigned char *") MemorySegment bitmap, @NativeType("void *") MemorySegment userdata);

    /**
     * These functions compute a discretized SDF field for a single character, suitable for storing
     * in a single-channel texture, sampling with bilinear filtering, and testing against
     * larger than some threshold to produce scalable fonts.
     * <p>
     * pixel_dist_scale &amp; onedge_value are a scale &amp; bias that allows you to make
     * optimal use of the limited 0..255 for your application, trading off precision
     * and special effects. SDF values outside the range 0..255 are clamped to 0..255.
     * <h4>Example</h4>
     * <pre>{@code scale = stbtt_ScaleForPixelHeight(22)
     * padding = 5
     * onedge_value = 180
     * pixel_dist_scale = 180/5.0 = 36.0}</pre>
     * <p>
     * This will create an SDF bitmap in which the character is about 22 pixels
     * high but the whole bitmap is about 22+5+5=32 pixels high. To produce a filled
     * shape, sample the SDF at each pixel and fill the pixel if the SDF value
     * is greater than or equal to 180/255. (You'll actually want to antialias,
     * which is beyond the scope of this example.) Additionally, you can compute
     * offset outlines (e.g. to stroke the character border inside &amp; outside,
     * or only outside). For example, to fill outside the character up to 3 SDF
     * pixels, you would compare against (180-36.0*3)/255 = 72/255. The above
     * choice of variables maps a range from 5 pixels outside the shape to
     * 2 pixels inside the shape to 0..255; this is intended primarily for apply
     * outside effects only (the interior range is needed to allow proper
     * antialiasing of the font at *smaller* sizes)
     * <p>
     * The function computes the SDF analytically at each SDF pixel, not by e.g.
     * building a higher-res bitmap and approximating it. In theory the quality
     * should be as high as possible for an SDF of this size &amp; representation, but
     * unclear if this is true in practice (perhaps building a higher-res bitmap
     * and computing from that can allow drop-out prevention).
     * <p>
     * The algorithm has not been optimized at all, so expect it to be slow
     * if computing lots of characters or very large sizes.
     *
     * @param info             the font
     * @param scale            controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap
     * @param glyph            the character to generate the SDF for
     * @param padding          extra "pixels" around the character which are filled with the distance to the character (not 0),
     *                         which allows effects like bit outlines
     * @param onedge_value     value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)
     * @param pixel_dist_scale what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale)
     *                         if positive, {@code > onedge_value} is inside; if negative, {@code < onedge_value} is inside
     * @param width            output width of the SDF bitmap (including padding)
     * @param height           output height of the SDF bitmap (including padding)
     * @param xoff             output origin of the character
     * @param yoff             output origin of the character
     * @return a 2D array of bytes 0..255, width*height in size
     */
    @NativeType("unsigned char *")
    @Entrypoint("stbtt_GetGlyphSDF")
    MemorySegment getGlyphSDF(STBTTFontInfo info, float scale, int glyph, int padding, byte onedge_value, float pixel_dist_scale, @NativeType("int *") MemorySegment width, @NativeType("int *") MemorySegment height, @NativeType("int *") MemorySegment xoff, @NativeType("int *") MemorySegment yoff);

    /**
     * These functions compute a discretized SDF field for a single character, suitable for storing
     * in a single-channel texture, sampling with bilinear filtering, and testing against
     * larger than some threshold to produce scalable fonts.
     * <p>
     * pixel_dist_scale &amp; onedge_value are a scale &amp; bias that allows you to make
     * optimal use of the limited 0..255 for your application, trading off precision
     * and special effects. SDF values outside the range 0..255 are clamped to 0..255.
     * <h4>Example</h4>
     * <pre>{@code scale = stbtt_ScaleForPixelHeight(22)
     * padding = 5
     * onedge_value = 180
     * pixel_dist_scale = 180/5.0 = 36.0}</pre>
     * <p>
     * This will create an SDF bitmap in which the character is about 22 pixels
     * high but the whole bitmap is about 22+5+5=32 pixels high. To produce a filled
     * shape, sample the SDF at each pixel and fill the pixel if the SDF value
     * is greater than or equal to 180/255. (You'll actually want to antialias,
     * which is beyond the scope of this example.) Additionally, you can compute
     * offset outlines (e.g. to stroke the character border inside &amp; outside,
     * or only outside). For example, to fill outside the character up to 3 SDF
     * pixels, you would compare against (180-36.0*3)/255 = 72/255. The above
     * choice of variables maps a range from 5 pixels outside the shape to
     * 2 pixels inside the shape to 0..255; this is intended primarily for apply
     * outside effects only (the interior range is needed to allow proper
     * antialiasing of the font at *smaller* sizes)
     * <p>
     * The function computes the SDF analytically at each SDF pixel, not by e.g.
     * building a higher-res bitmap and approximating it. In theory the quality
     * should be as high as possible for an SDF of this size &amp; representation, but
     * unclear if this is true in practice (perhaps building a higher-res bitmap
     * and computing from that can allow drop-out prevention).
     * <p>
     * The algorithm has not been optimized at all, so expect it to be slow
     * if computing lots of characters or very large sizes.
     *
     * @param info             the font
     * @param scale            controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap
     * @param codepoint        the character to generate the SDF for
     * @param padding          extra "pixels" around the character which are filled with the distance to the character (not 0),
     *                         which allows effects like bit outlines
     * @param onedge_value     value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)
     * @param pixel_dist_scale what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale)
     *                         if positive, {@code > onedge_value} is inside; if negative, {@code < onedge_value} is inside
     * @param width            output width of the SDF bitmap (including padding)
     * @param height           output height of the SDF bitmap (including padding)
     * @param xoff             output origin of the character
     * @param yoff             output origin of the character
     * @return a 2D array of bytes 0..255, width*height in size
     */
    @NativeType("unsigned char *")
    @Entrypoint("stbtt_GetCodepointSDF")
    MemorySegment getCodepointSDF(STBTTFontInfo info, float scale, int codepoint, int padding, byte onedge_value, float pixel_dist_scale, @NativeType("int *") MemorySegment width, @NativeType("int *") MemorySegment height, @NativeType("int *") MemorySegment xoff, @NativeType("int *") MemorySegment yoff);

    /**
     * returns the offset (not index) of the font that matches, or -1 if none
     * if you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold".
     * if you use any other flag, use a font name like "Arial"; this checks
     * the 'macStyle' header field; i don't know if fonts set this consistently
     *
     * @param fontdata fontdata
     * @param name     name
     * @param flags    flags
     * @return the offset (not index) of the font that matches
     */
    @Entrypoint("stbtt_FindMatchingFont")
    int findMatchingFont(@NativeType("const unsigned char *") MemorySegment fontdata, @NativeType("const char *") MemorySegment name, int flags);

    /**
     * returns the offset (not index) of the font that matches, or -1 if none
     * if you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold".
     * if you use any other flag, use a font name like "Arial"; this checks
     * the 'macStyle' header field; i don't know if fonts set this consistently
     *
     * @param fontdata fontdata
     * @param name     name
     * @param flags    flags
     * @return the offset (not index) of the font that matches
     */
    @Entrypoint("stbtt_FindMatchingFont")
    int findMatchingFont(@NativeType("const unsigned char *") MemorySegment fontdata, String name, int flags);

    /**
     * {@return 1/0 whether the first string interpreted as utf8 is identical to
     * the second string interpreted as big-endian utf16}.. useful for strings from next func
     *
     * @param s1   s1
     * @param len1 len1
     * @param s2   s2
     * @param len2 len2
     */
    @Entrypoint("stbtt_CompareUTF8toUTF16_bigendian")
    int compareUTF8toUTF16_bigendian(@NativeType("const char *") MemorySegment s1, int len1, @NativeType("const char *") MemorySegment s2, int len2);

    /**
     * {@return the string (which may be big-endian double byte, e.g. for unicode)} and puts the length in bytes in *length.
     * <p>
     * some of the values for the IDs are below; for more see the truetype spec:
     * <ul>
     *     <li><a href="http://developer.apple.com/textfonts/TTRefMan/RM06/Chap6name.html">http://developer.apple.com/textfonts/TTRefMan/RM06/Chap6name.html</a></li>
     *     <li><a href="http://www.microsoft.com/typography/otspec/name.htm">http://www.microsoft.com/typography/otspec/name.htm</a></li>
     * </ul>
     *
     * @param font       font
     * @param length     length
     * @param platformID platformID
     * @param encodingID encodingID
     * @param languageID languageID
     * @param nameID     nameID
     */
    @Entrypoint("stbtt_GetFontNameString")
    @NativeType("const char *")
    MemorySegment getFontNameString(STBTTFontInfo font, @NativeType("int *") MemorySegment length, int platformID, int encodingID, int languageID, int nameID);
}
