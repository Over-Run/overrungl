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
import java.lang.foreign.SegmentAllocator;

/// [stb_vorbis.c](https://github.com/nothings/stb/blob/master/stb_vorbis.c)
///
/// @author squid233
/// @since 0.1.0
public final class STBVorbis {
    //@formatter:off
    //region Fields
    public static final int VORBIS__no_error = 0;
    public static final int VORBIS_need_more_data = 1;
    public static final int VORBIS_invalid_api_mixing = 2;
    public static final int VORBIS_outofmem = 3;
    public static final int VORBIS_feature_not_supported = 4;
    public static final int VORBIS_too_many_channels = 5;
    public static final int VORBIS_file_open_failure = 6;
    public static final int VORBIS_seek_without_length = 7;
    public static final int VORBIS_unexpected_eof = 10;
    public static final int VORBIS_seek_invalid = 11;
    public static final int VORBIS_invalid_setup = 20;
    public static final int VORBIS_invalid_stream = 21;
    public static final int VORBIS_missing_capture_pattern = 30;
    public static final int VORBIS_invalid_stream_structure_version = 31;
    public static final int VORBIS_continued_packet_flag_invalid = 32;
    public static final int VORBIS_incorrect_stream_serial_number = 33;
    public static final int VORBIS_invalid_first_page = 34;
    public static final int VORBIS_bad_packet_type = 35;
    public static final int VORBIS_cant_find_last_page = 36;
    public static final int VORBIS_seek_failed = 37;
    public static final int VORBIS_ogg_skeleton_not_supported = 38;
    //endregion

    /// Invokes `stb_vorbis_get_info`.
    /// ```
    /// (struct STBVorbisInfo) stb_vorbis_info stb_vorbis_get_info(stb_vorbis* f);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_get_info(@NonNull SegmentAllocator __allocator, @NonNull MemorySegment f) {
        var result = STBVorbisInfo.alloc(__allocator);
        org.lwjgl.stb.STBVorbis.nstb_vorbis_get_info(f.address(), result.segment().address());
        return result.segment();
    }

    /// Invokes `stb_vorbis_get_comment`.
    /// ```
    /// (struct STBVorbisComment) stb_vorbis_comment stb_vorbis_get_comment(stb_vorbis* f);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_get_comment(@NonNull SegmentAllocator __allocator, @NonNull MemorySegment f) {
        var result = STBVorbisComment.alloc(__allocator);
        org.lwjgl.stb.STBVorbis.nstb_vorbis_get_comment(f.address(), result.segment().address());
        return result.segment();
    }

    /// Invokes `stb_vorbis_get_error`.
    /// ```
    /// int stb_vorbis_get_error(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_error(@NonNull MemorySegment f) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_error(f.address());
    }

    /// Invokes `stb_vorbis_close`.
    /// ```
    /// void stb_vorbis_close(stb_vorbis* f);
    /// ```
    public static void stb_vorbis_close(@NonNull MemorySegment f) {
        org.lwjgl.stb.STBVorbis.nstb_vorbis_close(f.address());
    }

    /// Invokes `stb_vorbis_get_sample_offset`.
    /// ```
    /// int stb_vorbis_get_sample_offset(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_sample_offset(@NonNull MemorySegment f) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_sample_offset(f.address());
    }

    /// Invokes `stb_vorbis_get_file_offset`.
    /// ```
    /// unsigned int stb_vorbis_get_file_offset(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_file_offset(@NonNull MemorySegment f) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_file_offset(f.address());
    }

    /// Invokes `stb_vorbis_open_pushdata`.
    /// ```
    /// stb_vorbis* stb_vorbis_open_pushdata(const unsigned char* datablock, int datablock_length_in_bytes, int* datablock_memory_consumed_in_bytes, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_open_pushdata(@NonNull MemorySegment datablock, int datablock_length_in_bytes, @NonNull MemorySegment datablock_memory_consumed_in_bytes, @NonNull MemorySegment error, @NonNull MemorySegment alloc_buffer) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBVorbis.nstb_vorbis_open_pushdata(datablock.address(), datablock_length_in_bytes, datablock_memory_consumed_in_bytes.address(), error.address(), alloc_buffer.address()));
    }

    /// Invokes `stb_vorbis_decode_frame_pushdata`.
    /// ```
    /// int stb_vorbis_decode_frame_pushdata(stb_vorbis* f, const unsigned char* datablock, int datablock_length_in_bytes, int* channels, float*** output, int* samples);
    /// ```
    public static int stb_vorbis_decode_frame_pushdata(@NonNull MemorySegment f, @NonNull MemorySegment datablock, int datablock_length_in_bytes, @NonNull MemorySegment channels, @NonNull MemorySegment output, @NonNull MemorySegment samples) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_decode_frame_pushdata(f.address(), datablock.address(), datablock_length_in_bytes, channels.address(), output.address(), samples.address());
    }

    /// Invokes `stb_vorbis_flush_pushdata`.
    /// ```
    /// void stb_vorbis_flush_pushdata(stb_vorbis* f);
    /// ```
    public static void stb_vorbis_flush_pushdata(@NonNull MemorySegment f) {
        org.lwjgl.stb.STBVorbis.nstb_vorbis_flush_pushdata(f.address());
    }

    /// Invokes `stb_vorbis_decode_filename`.
    /// ```
    /// int stb_vorbis_decode_filename(const char* filename, int* channels, int* sample_rate, short** output);
    /// ```
    public static int stb_vorbis_decode_filename(@NonNull MemorySegment filename, @NonNull MemorySegment channels, @NonNull MemorySegment sample_rate, @NonNull MemorySegment output) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_decode_filename(filename.address(), channels.address(), sample_rate.address(), output.address());
    }

    /// Invokes `stb_vorbis_decode_memory`.
    /// ```
    /// int stb_vorbis_decode_memory(const unsigned char* mem, int len, int* channels, int* sample_rate, short** output);
    /// ```
    public static int stb_vorbis_decode_memory(@NonNull MemorySegment mem, int len, @NonNull MemorySegment channels, @NonNull MemorySegment sample_rate, @NonNull MemorySegment output) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_decode_memory(mem.address(), len, channels.address(), sample_rate.address(), output.address());
    }

    /// Invokes `stb_vorbis_open_memory`.
    /// ```
    /// stb_vorbis* stb_vorbis_open_memory(const unsigned char* data, int len, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_open_memory(@NonNull MemorySegment data, int len, @NonNull MemorySegment error, @NonNull MemorySegment alloc_buffer) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBVorbis.nstb_vorbis_open_memory(data.address(), len, error.address(), alloc_buffer.address()));
    }

    /// Invokes `stb_vorbis_open_filename`.
    /// ```
    /// stb_vorbis* stb_vorbis_open_filename(const char* filename, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_open_filename(@NonNull MemorySegment filename, @NonNull MemorySegment error, @NonNull MemorySegment alloc_buffer) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBVorbis.nstb_vorbis_open_filename(filename.address(), error.address(), alloc_buffer.address()));
    }

    /// Invokes `stb_vorbis_seek_frame`.
    /// ```
    /// int stb_vorbis_seek_frame(stb_vorbis* f, unsigned int sample_number);
    /// ```
    public static int stb_vorbis_seek_frame(@NonNull MemorySegment f, int sample_number) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_seek_frame(f.address(), sample_number);
    }

    /// Invokes `stb_vorbis_seek`.
    /// ```
    /// int stb_vorbis_seek(stb_vorbis* f, unsigned int sample_number);
    /// ```
    public static int stb_vorbis_seek(@NonNull MemorySegment f, int sample_number) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_seek(f.address(), sample_number);
    }

    /// Invokes `stb_vorbis_seek_start`.
    /// ```
    /// int stb_vorbis_seek_start(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_seek_start(@NonNull MemorySegment f) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_seek_start(f.address());
    }

    /// Invokes `stb_vorbis_stream_length_in_samples`.
    /// ```
    /// unsigned int stb_vorbis_stream_length_in_samples(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_stream_length_in_samples(@NonNull MemorySegment f) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_stream_length_in_samples(f.address());
    }

    /// Invokes `stb_vorbis_stream_length_in_seconds`.
    /// ```
    /// float stb_vorbis_stream_length_in_seconds(stb_vorbis* f);
    /// ```
    public static float stb_vorbis_stream_length_in_seconds(@NonNull MemorySegment f) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_stream_length_in_seconds(f.address());
    }

    /// Invokes `stb_vorbis_get_frame_float`.
    /// ```
    /// int stb_vorbis_get_frame_float(stb_vorbis* f, int* channels, float*** output);
    /// ```
    public static int stb_vorbis_get_frame_float(@NonNull MemorySegment f, @NonNull MemorySegment channels, @NonNull MemorySegment output) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_frame_float(f.address(), channels.address(), output.address());
    }

    /// Invokes `stb_vorbis_get_frame_short_interleaved`.
    /// ```
    /// int stb_vorbis_get_frame_short_interleaved(stb_vorbis* f, int num_c, short* buffer, int num_shorts);
    /// ```
    public static int stb_vorbis_get_frame_short_interleaved(@NonNull MemorySegment f, int num_c, @NonNull MemorySegment buffer, int num_shorts) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_frame_short_interleaved(f.address(), num_c, buffer.address(), num_shorts);
    }

    /// Invokes `stb_vorbis_get_frame_short`.
    /// ```
    /// int stb_vorbis_get_frame_short(stb_vorbis* f, int num_c, short** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_frame_short(@NonNull MemorySegment f, int num_c, @NonNull MemorySegment buffer, int num_samples) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_frame_short(f.address(), num_c, buffer.address(), num_samples);
    }

    /// Invokes `stb_vorbis_get_samples_float_interleaved`.
    /// ```
    /// int stb_vorbis_get_samples_float_interleaved(stb_vorbis* f, int channels, float* buffer, int num_floats);
    /// ```
    public static int stb_vorbis_get_samples_float_interleaved(@NonNull MemorySegment f, int channels, @NonNull MemorySegment buffer, int num_floats) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_samples_float_interleaved(f.address(), channels, buffer.address(), num_floats);
    }

    /// Invokes `stb_vorbis_get_samples_float`.
    /// ```
    /// int stb_vorbis_get_samples_float(stb_vorbis* f, int channels, float** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_samples_float(@NonNull MemorySegment f, int channels, @NonNull MemorySegment buffer, int num_samples) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_samples_float(f.address(), channels, buffer.address(), num_samples);
    }

    /// Invokes `stb_vorbis_get_samples_short_interleaved`.
    /// ```
    /// int stb_vorbis_get_samples_short_interleaved(stb_vorbis* f, int channels, short* buffer, int num_shorts);
    /// ```
    public static int stb_vorbis_get_samples_short_interleaved(@NonNull MemorySegment f, int channels, @NonNull MemorySegment buffer, int num_shorts) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_samples_short_interleaved(f.address(), channels, buffer.address(), num_shorts);
    }

    /// Invokes `stb_vorbis_get_samples_short`.
    /// ```
    /// int stb_vorbis_get_samples_short(stb_vorbis* f, int channels, short** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_samples_short(@NonNull MemorySegment f, int channels, @NonNull MemorySegment buffer, int num_samples) {
        return org.lwjgl.stb.STBVorbis.nstb_vorbis_get_samples_short(f.address(), channels, buffer.address(), num_samples);
    }

    //@formatter:on

    private STBVorbis() {
    }
}
