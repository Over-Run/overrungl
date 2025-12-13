/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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

/// [stb_easy_font.h](https://github.com/nothings/stb/blob/master/stb_easy_font.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBEasyFont {
    //@formatter:off

    /// Invokes `stb_easy_font_spacing`.
    /// ```
    /// void stb_easy_font_spacing(float spacing);
    /// ```
    public static void stb_easy_font_spacing(float spacing) {
        org.lwjgl.stb.STBEasyFont.stb_easy_font_spacing(spacing);
    }

    /// Invokes `stb_easy_font_print`.
    /// ```
    /// int stb_easy_font_print(float x, float y, char* text, unsigned char color[4], void* vertex_buffer, int vbuf_size);
    /// ```
    public static int stb_easy_font_print(float x, float y, @NonNull MemorySegment text, @NonNull MemorySegment color, @NonNull MemorySegment vertex_buffer, int vbuf_size) {
        return org.lwjgl.stb.STBEasyFont.nstb_easy_font_print(x, y, text.address(), color.address(), vertex_buffer.address(), vbuf_size);
    }

    /// Invokes `stb_easy_font_width`.
    /// ```
    /// int stb_easy_font_width(char* text);
    /// ```
    public static int stb_easy_font_width(@NonNull MemorySegment text) {
        return org.lwjgl.stb.STBEasyFont.nstb_easy_font_width(text.address());
    }

    /// Invokes `stb_easy_font_height`.
    /// ```
    /// int stb_easy_font_height(char* text);
    /// ```
    public static int stb_easy_font_height(@NonNull MemorySegment text) {
        return org.lwjgl.stb.STBEasyFont.nstb_easy_font_height(text.address());
    }

    //@formatter:on

    private STBEasyFont() {
    }
}
