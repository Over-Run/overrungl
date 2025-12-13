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

/// [stb_image.h](https://github.com/nothings/stb/blob/master/stb_image.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBImage {
    //@formatter:off
    //region Fields
    public static final int STBI_default = 0;
    public static final int STBI_grey = 1;
    public static final int STBI_grey_alpha = 2;
    public static final int STBI_rgb = 3;
    public static final int STBI_rgb_alpha = 4;
    //endregion

    /// Invokes `stbi_load_from_memory`.
    /// ```
    /// stbi_uc* stbi_load_from_memory(stbi_uc const * buffer, int len, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_load_from_memory(@NonNull MemorySegment buffer, int len, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_load_from_memory(buffer.address(), len, x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_load_from_callbacks`.
    /// ```
    /// stbi_uc* stbi_load_from_callbacks(stbi_io_callbacks const * clbk, void* user, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_load_from_callbacks(@NonNull MemorySegment clbk, @NonNull MemorySegment user, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_load_from_callbacks(clbk.address(), user.address(), x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_load`.
    /// ```
    /// stbi_uc* stbi_load(char const * filename, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_load(@NonNull MemorySegment filename, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_load(filename.address(), x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_load_gif_from_memory`.
    /// ```
    /// stbi_uc* stbi_load_gif_from_memory(stbi_uc const * buffer, int len, int** delays, int* x, int* y, int* z, int* comp, int req_comp);
    /// ```
    public static @NonNull MemorySegment stbi_load_gif_from_memory(@NonNull MemorySegment buffer, int len, @NonNull MemorySegment delays, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment z, @NonNull MemorySegment comp, int req_comp) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_load_gif_from_memory(buffer.address(), len, delays.address(), x.address(), y.address(), z.address(), comp.address(), req_comp));
    }

    /// Invokes `stbi_load_16_from_memory`.
    /// ```
    /// stbi_us* stbi_load_16_from_memory(stbi_uc const * buffer, int len, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_load_16_from_memory(@NonNull MemorySegment buffer, int len, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_load_16_from_memory(buffer.address(), len, x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_load_16_from_callbacks`.
    /// ```
    /// stbi_us* stbi_load_16_from_callbacks(stbi_io_callbacks const * clbk, void* user, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_load_16_from_callbacks(@NonNull MemorySegment clbk, @NonNull MemorySegment user, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_load_16_from_callbacks(clbk.address(), user.address(), x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_load_16`.
    /// ```
    /// stbi_us* stbi_load_16(char const * filename, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_load_16(@NonNull MemorySegment filename, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_load_16(filename.address(), x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_loadf_from_memory`.
    /// ```
    /// float* stbi_loadf_from_memory(stbi_uc const * buffer, int len, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_loadf_from_memory(@NonNull MemorySegment buffer, int len, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_loadf_from_memory(buffer.address(), len, x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_loadf_from_callbacks`.
    /// ```
    /// float* stbi_loadf_from_callbacks(stbi_io_callbacks const * clbk, void* user, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_loadf_from_callbacks(@NonNull MemorySegment clbk, @NonNull MemorySegment user, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_loadf_from_callbacks(clbk.address(), user.address(), x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_loadf`.
    /// ```
    /// float* stbi_loadf(char const * filename, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static @NonNull MemorySegment stbi_loadf(@NonNull MemorySegment filename, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment channels_in_file, int desired_channels) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_loadf(filename.address(), x.address(), y.address(), channels_in_file.address(), desired_channels));
    }

    /// Invokes `stbi_hdr_to_ldr_gamma`.
    /// ```
    /// void stbi_hdr_to_ldr_gamma(float gamma);
    /// ```
    public static void stbi_hdr_to_ldr_gamma(float gamma) {
        org.lwjgl.stb.STBImage.stbi_hdr_to_ldr_gamma(gamma);
    }

    /// Invokes `stbi_hdr_to_ldr_scale`.
    /// ```
    /// void stbi_hdr_to_ldr_scale(float scale);
    /// ```
    public static void stbi_hdr_to_ldr_scale(float scale) {
        org.lwjgl.stb.STBImage.stbi_hdr_to_ldr_scale(scale);
    }

    /// Invokes `stbi_ldr_to_hdr_gamma`.
    /// ```
    /// void stbi_ldr_to_hdr_gamma(float gamma);
    /// ```
    public static void stbi_ldr_to_hdr_gamma(float gamma) {
        org.lwjgl.stb.STBImage.stbi_ldr_to_hdr_gamma(gamma);
    }

    /// Invokes `stbi_ldr_to_hdr_scale`.
    /// ```
    /// void stbi_ldr_to_hdr_scale(float scale);
    /// ```
    public static void stbi_ldr_to_hdr_scale(float scale) {
        org.lwjgl.stb.STBImage.stbi_ldr_to_hdr_scale(scale);
    }

    /// Invokes `stbi_is_hdr_from_callbacks`.
    /// ```
    /// (int) STBbool stbi_is_hdr_from_callbacks(stbi_io_callbacks const * clbk, void* user);
    /// ```
    public static boolean stbi_is_hdr_from_callbacks(@NonNull MemorySegment clbk, @NonNull MemorySegment user) {
        return org.lwjgl.stb.STBImage.nstbi_is_hdr_from_callbacks(clbk.address(), user.address()) != 0;
    }

    /// Invokes `stbi_is_hdr_from_memory`.
    /// ```
    /// (int) STBbool stbi_is_hdr_from_memory(stbi_uc const * buffer, int len);
    /// ```
    public static boolean stbi_is_hdr_from_memory(@NonNull MemorySegment buffer, int len) {
        return org.lwjgl.stb.STBImage.nstbi_is_hdr_from_memory(buffer.address(), len) != 0;
    }

    /// Invokes `stbi_is_hdr`.
    /// ```
    /// (int) STBbool stbi_is_hdr(char const * filename);
    /// ```
    public static boolean stbi_is_hdr(@NonNull MemorySegment filename) {
        return org.lwjgl.stb.STBImage.nstbi_is_hdr(filename.address()) != 0;
    }

    /// Invokes `stbi_failure_reason`.
    /// ```
    /// const char* stbi_failure_reason();
    /// ```
    public static @NonNull MemorySegment stbi_failure_reason() {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_failure_reason());
    }

    /// Invokes `stbi_image_free`.
    /// ```
    /// void stbi_image_free(void* retval_from_stbi_load);
    /// ```
    public static void stbi_image_free(@NonNull MemorySegment retval_from_stbi_load) {
        org.lwjgl.stb.STBImage.nstbi_image_free(retval_from_stbi_load.address());
    }

    /// Invokes `stbi_info_from_memory`.
    /// ```
    /// (int) STBbool stbi_info_from_memory(stbi_uc const * buffer, int len, int* x, int* y, int* comp);
    /// ```
    public static boolean stbi_info_from_memory(@NonNull MemorySegment buffer, int len, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment comp) {
        return org.lwjgl.stb.STBImage.nstbi_info_from_memory(buffer.address(), len, x.address(), y.address(), comp.address()) != 0;
    }

    /// Invokes `stbi_info_from_callbacks`.
    /// ```
    /// (int) STBbool stbi_info_from_callbacks(stbi_io_callbacks const * clbk, void* user, int* x, int* y, int* comp);
    /// ```
    public static boolean stbi_info_from_callbacks(@NonNull MemorySegment clbk, @NonNull MemorySegment user, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment comp) {
        return org.lwjgl.stb.STBImage.nstbi_info_from_callbacks(clbk.address(), user.address(), x.address(), y.address(), comp.address()) != 0;
    }

    /// Invokes `stbi_is_16_bit_from_memory`.
    /// ```
    /// (int) STBbool stbi_is_16_bit_from_memory(stbi_uc const * buffer, int len);
    /// ```
    public static boolean stbi_is_16_bit_from_memory(@NonNull MemorySegment buffer, int len) {
        return org.lwjgl.stb.STBImage.nstbi_is_16_bit_from_memory(buffer.address(), len) != 0;
    }

    /// Invokes `stbi_is_16_bit_from_callbacks`.
    /// ```
    /// (int) STBbool stbi_is_16_bit_from_callbacks(stbi_io_callbacks const * clbk, void* user);
    /// ```
    public static boolean stbi_is_16_bit_from_callbacks(@NonNull MemorySegment clbk, @NonNull MemorySegment user) {
        return org.lwjgl.stb.STBImage.nstbi_is_16_bit_from_callbacks(clbk.address(), user.address()) != 0;
    }

    /// Invokes `stbi_info`.
    /// ```
    /// (int) STBbool stbi_info(char const * filename, int* x, int* y, int* comp);
    /// ```
    public static boolean stbi_info(@NonNull MemorySegment filename, @NonNull MemorySegment x, @NonNull MemorySegment y, @NonNull MemorySegment comp) {
        return org.lwjgl.stb.STBImage.nstbi_info(filename.address(), x.address(), y.address(), comp.address()) != 0;
    }

    /// Invokes `stbi_is_16_bit`.
    /// ```
    /// (int) STBbool stbi_is_16_bit(char const * filename);
    /// ```
    public static boolean stbi_is_16_bit(@NonNull MemorySegment filename) {
        return org.lwjgl.stb.STBImage.nstbi_is_16_bit(filename.address()) != 0;
    }

    /// Invokes `stbi_set_unpremultiply_on_load`.
    /// ```
    /// void stbi_set_unpremultiply_on_load((int) STBbool flag_true_if_should_unpremultiply);
    /// ```
    public static void stbi_set_unpremultiply_on_load(boolean flag_true_if_should_unpremultiply) {
        org.lwjgl.stb.STBImage.nstbi_set_unpremultiply_on_load(flag_true_if_should_unpremultiply ? 1 : 0);
    }

    /// Invokes `stbi_convert_iphone_png_to_rgb`.
    /// ```
    /// void stbi_convert_iphone_png_to_rgb((int) STBbool flag_true_if_should_convert);
    /// ```
    public static void stbi_convert_iphone_png_to_rgb(boolean flag_true_if_should_convert) {
        org.lwjgl.stb.STBImage.nstbi_convert_iphone_png_to_rgb(flag_true_if_should_convert ? 1 : 0);
    }

    /// Invokes `stbi_set_flip_vertically_on_load`.
    /// ```
    /// void stbi_set_flip_vertically_on_load((int) STBbool flag_true_if_should_flip);
    /// ```
    public static void stbi_set_flip_vertically_on_load(boolean flag_true_if_should_flip) {
        org.lwjgl.stb.STBImage.nstbi_set_flip_vertically_on_load(flag_true_if_should_flip ? 1 : 0);
    }

    /// Invokes `stbi_set_unpremultiply_on_load_thread`.
    /// ```
    /// void stbi_set_unpremultiply_on_load_thread((int) STBbool flag_true_if_should_unpremultiply);
    /// ```
    public static void stbi_set_unpremultiply_on_load_thread(boolean flag_true_if_should_unpremultiply) {
        org.lwjgl.stb.STBImage.nstbi_set_unpremultiply_on_load_thread(flag_true_if_should_unpremultiply ? 1 : 0);
    }

    /// Invokes `stbi_convert_iphone_png_to_rgb_thread`.
    /// ```
    /// void stbi_convert_iphone_png_to_rgb_thread((int) STBbool flag_true_if_should_convert);
    /// ```
    public static void stbi_convert_iphone_png_to_rgb_thread(boolean flag_true_if_should_convert) {
        org.lwjgl.stb.STBImage.nstbi_convert_iphone_png_to_rgb_thread(flag_true_if_should_convert ? 1 : 0);
    }

    /// Invokes `stbi_set_flip_vertically_on_load_thread`.
    /// ```
    /// void stbi_set_flip_vertically_on_load_thread((int) STBbool flag_true_if_should_flip);
    /// ```
    public static void stbi_set_flip_vertically_on_load_thread(boolean flag_true_if_should_flip) {
        org.lwjgl.stb.STBImage.stbi_set_flip_vertically_on_load_thread(flag_true_if_should_flip ? 1 : 0);
    }

    /// Invokes `stbi_zlib_decode_malloc_guesssize`.
    /// ```
    /// char* stbi_zlib_decode_malloc_guesssize(const char* buffer, int len, int initial_size, int* outlen);
    /// ```
    public static @NonNull MemorySegment stbi_zlib_decode_malloc_guesssize(@NonNull MemorySegment buffer, int len, int initial_size, @NonNull MemorySegment outlen) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_zlib_decode_malloc_guesssize(buffer.address(), len, initial_size, outlen.address()));
    }

    /// Invokes `stbi_zlib_decode_malloc_guesssize_headerflag`.
    /// ```
    /// char* stbi_zlib_decode_malloc_guesssize_headerflag(const char* buffer, int len, int initial_size, int* outlen, int parse_header);
    /// ```
    public static @NonNull MemorySegment stbi_zlib_decode_malloc_guesssize_headerflag(@NonNull MemorySegment buffer, int len, int initial_size, @NonNull MemorySegment outlen, int parse_header) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_zlib_decode_malloc_guesssize_headerflag(buffer.address(), len, initial_size, outlen.address(), parse_header));
    }

    /// Invokes `stbi_zlib_decode_malloc`.
    /// ```
    /// char* stbi_zlib_decode_malloc(const char* buffer, int len, int* outlen);
    /// ```
    public static @NonNull MemorySegment stbi_zlib_decode_malloc(@NonNull MemorySegment buffer, int len, @NonNull MemorySegment outlen) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_zlib_decode_malloc(buffer.address(), len, outlen.address()));
    }

    /// Invokes `stbi_zlib_decode_buffer`.
    /// ```
    /// int stbi_zlib_decode_buffer(char* obuffer, int olen, const char* ibuffer, int ilen);
    /// ```
    public static int stbi_zlib_decode_buffer(@NonNull MemorySegment obuffer, int olen, @NonNull MemorySegment ibuffer, int ilen) {
        return org.lwjgl.stb.STBImage.nstbi_zlib_decode_buffer(obuffer.address(), olen, ibuffer.address(), ilen);
    }

    /// Invokes `stbi_zlib_decode_noheader_malloc`.
    /// ```
    /// char* stbi_zlib_decode_noheader_malloc(const char* buffer, int len, int* outlen);
    /// ```
    public static @NonNull MemorySegment stbi_zlib_decode_noheader_malloc(@NonNull MemorySegment buffer, int len, @NonNull MemorySegment outlen) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImage.nstbi_zlib_decode_noheader_malloc(buffer.address(), len, outlen.address()));
    }

    /// Invokes `stbi_zlib_decode_noheader_buffer`.
    /// ```
    /// int stbi_zlib_decode_noheader_buffer(char* obuffer, int olen, const char* ibuffer, int ilen);
    /// ```
    public static int stbi_zlib_decode_noheader_buffer(@NonNull MemorySegment obuffer, int olen, @NonNull MemorySegment ibuffer, int ilen) {
        return org.lwjgl.stb.STBImage.nstbi_zlib_decode_noheader_buffer(obuffer.address(), olen, ibuffer.address(), ilen);
    }

    //@formatter:on

    private STBImage() {
    }
}
