/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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

package org.overrun.glib.stb;

import org.overrun.glib.GameLib;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

/**
 * The STB method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    public static SymbolLookup lookup;
    public static MethodHandle
        //region stb_image.h
        stbi__unpremultiply_on_load_thread,
        stbi_convert_iphone_png_to_rgb,
        stbi_convert_iphone_png_to_rgb_thread,
        stbi_failure_reason,
        stbi_hdr_to_ldr_gamma,
        stbi_hdr_to_ldr_scale,
        stbi_image_free,
        stbi_info,
        stbi_info_from_callbacks,
        stbi_info_from_file,
        stbi_info_from_memory,
        stbi_is_16_bit,
        stbi_is_16_bit_from_callbacks,
        stbi_is_16_bit_from_file,
        stbi_is_16_bit_from_memory,
        stbi_is_hdr,
        stbi_is_hdr_from_callbacks,
        stbi_is_hdr_from_file,
        stbi_is_hdr_from_memory,
        stbi_ldr_to_hdr_gamma,
        stbi_ldr_to_hdr_scale,
        stbi_load,
        stbi_load_16,
        stbi_load_16_from_callbacks,
        stbi_load_16_from_memory,
        stbi_load_from_callbacks,
        stbi_load_from_file,
        stbi_load_from_file_16,
        stbi_load_from_memory,
        stbi_load_gif_from_memory,
        stbi_loadf,
        stbi_loadf_from_callbacks,
        stbi_loadf_from_file,
        stbi_loadf_from_memory,
        stbi_set_flip_vertically_on_load,
        stbi_set_flip_vertically_on_load_thread,
        stbi_set_unpremultiply_on_load,
        stbi_zlib_decode_buffer,
        stbi_zlib_decode_malloc,
        stbi_zlib_decode_malloc_guesssize,
        stbi_zlib_decode_malloc_guesssize_headerflag,
        stbi_zlib_decode_noheader_buffer,
        stbi_zlib_decode_noheader_malloc
            //endregion
            ;

    private static MethodHandle downcall(String name,
                                         MemoryLayout retLayout,
                                         MemoryLayout... argLayouts) {
        return RuntimeHelper.downcallThrow(lookup.lookup(name),
            FunctionDescriptor.of(retLayout, argLayouts));
    }

    private static MethodHandle downcallI(String name,
                                          MemoryLayout... argLayouts) {
        return RuntimeHelper.downcallThrow(lookup.lookup(name),
            FunctionDescriptor.of(JAVA_INT, argLayouts));
    }

    private static MethodHandle downcallP(String name,
                                          MemoryLayout... argLayouts) {
        return RuntimeHelper.downcallThrow(lookup.lookup(name),
            FunctionDescriptor.of(ADDRESS, argLayouts));
    }

    private static MethodHandle downcallV(String name,
                                          MemoryLayout... argLayouts) {
        return RuntimeHelper.downcallThrow(lookup.lookup(name),
            FunctionDescriptor.ofVoid(argLayouts));
    }

    private static MethodHandle downcallIV(String name) {
        return downcallV(name, JAVA_INT);
    }

    public static void create() {
        lookup = GameLib.load("stb",
            "stb",
            "0.1.0");
        stbi__unpremultiply_on_load_thread = downcallIV("stbi__unpremultiply_on_load_thread");
        stbi_convert_iphone_png_to_rgb = downcallIV("stbi_convert_iphone_png_to_rgb");
        stbi_convert_iphone_png_to_rgb_thread = downcallIV("stbi_convert_iphone_png_to_rgb_thread");
        stbi_failure_reason = downcallP("stbi_failure_reason");
        stbi_hdr_to_ldr_gamma = downcallV("stbi_hdr_to_ldr_gamma", JAVA_FLOAT);
        stbi_hdr_to_ldr_scale = downcallV("stbi_hdr_to_ldr_scale", JAVA_FLOAT);
        stbi_image_free = downcallV("stbi_image_free", ADDRESS);
        stbi_info = downcallI("stbi_info", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
        stbi_info_from_callbacks = downcallI("stbi_info_from_callbacks", ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
        stbi_info_from_file = downcallI("stbi_info_from_file", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
        stbi_info_from_memory = downcallI("stbi_info_from_memory", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
        stbi_is_16_bit = downcallI("stbi_is_16_bit", ADDRESS);
        stbi_is_16_bit_from_callbacks = downcallI("stbi_is_16_bit_from_callbacks", ADDRESS, ADDRESS);
        stbi_is_16_bit_from_file = downcallI("stbi_is_16_bit_from_file", ADDRESS);
        stbi_is_16_bit_from_memory = downcallI("stbi_is_16_bit_from_memory", ADDRESS, JAVA_INT);
        stbi_is_hdr = downcallI("stbi_is_hdr", ADDRESS);
        stbi_is_hdr_from_callbacks = downcallI("stbi_is_hdr_from_callbacks", ADDRESS, ADDRESS);
        stbi_is_hdr_from_file = downcallI("stbi_is_hdr_from_file", ADDRESS);
        stbi_is_hdr_from_memory = downcallI("stbi_is_hdr_from_memory", ADDRESS, JAVA_INT);
        stbi_ldr_to_hdr_gamma = downcallV("stbi_ldr_to_hdr_gamma", JAVA_FLOAT);
        stbi_ldr_to_hdr_scale = downcallV("stbi_ldr_to_hdr_scale", JAVA_FLOAT);
        stbi_load = downcallP("stbi_load", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_load_16 = downcallP("stbi_load_16", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_load_16_from_callbacks = downcallP("stbi_load_16_from_callbacks", ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_load_16_from_memory = downcallP("stbi_load_16_from_memory", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_load_from_callbacks = downcallP("stbi_load_from_callbacks", ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_load_from_file = downcallP("stbi_load_from_file", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_load_from_file_16 = downcallP("stbi_load_from_file_16", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_load_from_memory = downcallP("stbi_load_from_memory", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_load_gif_from_memory = downcallP("stbi_load_gif_from_memory", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_loadf = downcallP("stbi_loadf", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_loadf_from_callbacks = downcallP("stbi_loadf_from_callbacks", ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_loadf_from_file = downcallP("stbi_loadf_from_file", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_loadf_from_memory = downcallP("stbi_loadf_from_memory", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
        stbi_set_flip_vertically_on_load = downcallV("stbi_set_flip_vertically_on_load", JAVA_INT);
        stbi_set_flip_vertically_on_load_thread = downcallV("stbi_set_flip_vertically_on_load_thread", JAVA_INT);
        stbi_set_unpremultiply_on_load = downcallV("stbi_set_unpremultiply_on_load", JAVA_INT);
        stbi_zlib_decode_buffer = downcallI("stbi_zlib_decode_buffer", ADDRESS, JAVA_INT, ADDRESS, JAVA_INT);
        stbi_zlib_decode_malloc = downcallP("stbi_zlib_decode_malloc", ADDRESS, JAVA_INT, ADDRESS);
        stbi_zlib_decode_malloc_guesssize = downcallP("stbi_zlib_decode_malloc_guesssize", ADDRESS, JAVA_INT, JAVA_INT, ADDRESS);
        stbi_zlib_decode_malloc_guesssize_headerflag = downcallP("stbi_zlib_decode_malloc_guesssize_headerflag", ADDRESS, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT);
        stbi_zlib_decode_noheader_buffer = downcallI("stbi_zlib_decode_noheader_buffer", ADDRESS, JAVA_INT, ADDRESS, JAVA_INT);
        stbi_zlib_decode_noheader_malloc = downcallP("stbi_zlib_decode_noheader_malloc", ADDRESS, JAVA_INT, ADDRESS);
    }
}
