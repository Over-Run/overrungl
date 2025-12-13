/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

/// [stb_image_write.h](https://github.com/nothings/stb/blob/master/stb_image_write.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBImageWrite {
    //@formatter:off

    /// Invokes `stbi_write_png`.
    /// ```
    /// int stbi_write_png(char const * filename, int w, int h, int comp, const void* data, int stride_in_bytes);
    /// ```
    public static int stbi_write_png(@NonNull MemorySegment filename, int w, int h, int comp, @NonNull MemorySegment data, int stride_in_bytes) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_png(filename.address(), w, h, comp, data.address(), stride_in_bytes);
    }

    /// Invokes `stbi_write_bmp`.
    /// ```
    /// int stbi_write_bmp(char const * filename, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_bmp(@NonNull MemorySegment filename, int w, int h, int comp, @NonNull MemorySegment data) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_bmp(filename.address(), w, h, comp, data.address());
    }

    /// Invokes `stbi_write_tga`.
    /// ```
    /// int stbi_write_tga(char const * filename, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_tga(@NonNull MemorySegment filename, int w, int h, int comp, @NonNull MemorySegment data) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_tga(filename.address(), w, h, comp, data.address());
    }

    /// Invokes `stbi_write_hdr`.
    /// ```
    /// int stbi_write_hdr(char const * filename, int w, int h, int comp, const float* data);
    /// ```
    public static int stbi_write_hdr(@NonNull MemorySegment filename, int w, int h, int comp, @NonNull MemorySegment data) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_hdr(filename.address(), w, h, comp, data.address());
    }

    /// Invokes `stbi_write_jpg`.
    /// ```
    /// int stbi_write_jpg(char const * filename, int x, int y, int comp, const void* data, int quality);
    /// ```
    public static int stbi_write_jpg(@NonNull MemorySegment filename, int x, int y, int comp, @NonNull MemorySegment data, int quality) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_jpg(filename.address(), x, y, comp, data.address(), quality);
    }

    /// Invokes `stbi_write_png_to_func`.
    /// ```
    /// int stbi_write_png_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data, int stride_in_bytes);
    /// ```
    public static int stbi_write_png_to_func(@NonNull MemorySegment func, @NonNull MemorySegment context, int w, int h, int comp, @NonNull MemorySegment data, int stride_in_bytes) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_png_to_func(func.address(), context.address(), w, h, comp, data.address(), stride_in_bytes);
    }

    /// Invokes `stbi_write_bmp_to_func`.
    /// ```
    /// int stbi_write_bmp_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_bmp_to_func(@NonNull MemorySegment func, @NonNull MemorySegment context, int w, int h, int comp, @NonNull MemorySegment data) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_bmp_to_func(func.address(), context.address(), w, h, comp, data.address());
    }

    /// Invokes `stbi_write_tga_to_func`.
    /// ```
    /// int stbi_write_tga_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_tga_to_func(@NonNull MemorySegment func, @NonNull MemorySegment context, int w, int h, int comp, @NonNull MemorySegment data) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_tga_to_func(func.address(), context.address(), w, h, comp, data.address());
    }

    /// Invokes `stbi_write_hdr_to_func`.
    /// ```
    /// int stbi_write_hdr_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const float* data);
    /// ```
    public static int stbi_write_hdr_to_func(@NonNull MemorySegment func, @NonNull MemorySegment context, int w, int h, int comp, @NonNull MemorySegment data) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_hdr_to_func(func.address(), context.address(), w, h, comp, data.address());
    }

    /// Invokes `stbi_write_jpg_to_func`.
    /// ```
    /// int stbi_write_jpg_to_func(stbi_write_func* func, void* context, int x, int y, int comp, const void* data, int quality);
    /// ```
    public static int stbi_write_jpg_to_func(@NonNull MemorySegment func, @NonNull MemorySegment context, int x, int y, int comp, @NonNull MemorySegment data, int quality) {
        return org.lwjgl.stb.STBImageWrite.nstbi_write_jpg_to_func(func.address(), context.address(), x, y, comp, data.address(), quality);
    }

    /// Invokes `stbi_flip_vertically_on_write`.
    /// ```
    /// void stbi_flip_vertically_on_write(int flip_boolean);
    /// ```
    public static void stbi_flip_vertically_on_write(int flip_boolean) {
        org.lwjgl.stb.STBImageWrite.nstbi_flip_vertically_on_write(flip_boolean);
    }

    //@formatter:on

    private STBImageWrite() {
    }

    public static MemorySegment stbi_write_tga_with_rle() {
        return MemorySegment.ofBuffer(org.lwjgl.stb.STBImageWrite.stbi_write_tga_with_rle);
    }

    public static MemorySegment stbi_write_png_compression_level() {
        return MemorySegment.ofBuffer(org.lwjgl.stb.STBImageWrite.stbi_write_png_compression_level);
    }

    public static MemorySegment stbi_write_force_png_filter() {
        return MemorySegment.ofBuffer(org.lwjgl.stb.STBImageWrite.stbi_write_force_png_filter);
    }
}
