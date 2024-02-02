/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.struct.ByValue;
import overrungl.NativeType;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandles;

/**
 * normally stb_vorbis uses malloc() to allocate memory at startup,
 * and alloca() to allocate temporary memory during a frame on the
 * stack.
 * (Memory consumption will depend on the amount of setup
 * data in the file and how you set the compile flags for speed
 * vs. size. In my test files the maximal-size usage is ~150KB.)
 * <p>
 * You can modify the wrapper functions in the source (setup_malloc,
 * setup_temp_malloc, temp_malloc) to change this behavior, or you
 * can use a simpler allocation model: you pass in a buffer from
 * which stb_vorbis will allocate _all_ its memory (including the
 * temp memory).
 * "open" may fail with a VORBIS_outofmem if you
 * do not pass in enough data; there is no way to determine how
 * much you do need except to succeed (at which point you can
 * query get_info to find the exact amount required. yes I know
 * this is lame).
 * <p>
 * If you pass in a non-NULL buffer of the type below, allocation
 * will occur from it as described above.
 * Otherwise just pass NULL
 * to use malloc()/alloca()
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBVorbis {
    /**
     * The instance of STBVorbis.
     */
    STBVorbis INSTANCE = Downcall.load(MethodHandles.lookup(), Handles.lookup);
    /**
     * ERROR CODES
     */
    int _no_error = 0,
    /**
     * not a real error
     */
    need_more_data = 1,
    /**
     * can't mix API modes
     */
    invalid_api_mixing = 2,
    /**
     * not enough memory
     */
    outofmem = 3,
    /**
     * uses floor 0
     */
    feature_not_supported = 4,
    /**
     * STB_VORBIS_MAX_CHANNELS is too small
     */
    too_many_channels = 5,
    /**
     * fopen() failed
     */
    file_open_failure = 6,
    /**
     * can't seek in unknown-length file
     */
    seek_without_length = 7,
    /**
     * file is truncated?
     */
    unexpected_eof = 10,
    /**
     * seek past EOF
     */
    seek_invalid = 11;
    // decoding errors (corrupt/invalid stream) -- you probably
    // don't care about the exact details of these
    /**
     * vorbis errors
     */
    int invalid_setup = 20,
        invalid_stream = 21;
    /**
     * ogg errors
     */
    int missing_capture_pattern = 30,
        invalid_stream_structure_version = 31,
        continued_packet_flag_invalid = 32,
        incorrect_stream_serial_number = 33,
        invalid_first_page = 34,
        bad_packet_type = 35,
        cant_find_last_page = 36,
        seek_failed = 37,
        ogg_skeleton_not_supported = 38;

    /**
     * get general information about the file
     *
     * @param allocator allocator
     * @param f         f
     * @return general information about the file
     */
    @ByValue
    @Entrypoint("stb_vorbis_get_info")
    STBVorbisInfo getInfo(SegmentAllocator allocator, @NativeType("stb_vorbis *") MemorySegment f);

    /**
     * get ogg comments
     *
     * @param allocator allocator
     * @param f         f
     * @return ogg comments
     */
    @ByValue
    @Entrypoint("stb_vorbis_get_comment")
    STBVorbisComment getComment(SegmentAllocator allocator, @NativeType("stb_vorbis *") MemorySegment f);

    /**
     * get the last error detected (clears it, too)
     *
     * @param f f
     * @return the last error detected
     */
    @Entrypoint("stb_vorbis_get_error")
    int getError(@NativeType("stb_vorbis *") MemorySegment f);

    /**
     * close an ogg vorbis file and free all memory in use
     *
     * @param f f
     */
    @Entrypoint("stb_vorbis_close")
    void close(@NativeType("stb_vorbis *") MemorySegment f);

    /**
     * this function returns the offset (in samples) from the beginning of the
     * file that will be returned by the next decode, if it is known, or -1
     * otherwise.
     * after a flush_pushdata() call, this may take a while before
     * it becomes valid again.
     * NOT WORKING YET after a seek with PULLDATA API
     *
     * @param f f
     * @return the offset
     */
    @Entrypoint("stb_vorbis_get_sample_offset")
    int getSampleOffset(@NativeType("stb_vorbis *") MemorySegment f);

    /**
     * {@return the current seek point within the file, or offset from the beginning
     * of the memory buffer}
     * In pushdata mode it returns 0.
     *
     * @param f f
     */
    @Entrypoint("stb_vorbis_get_file_offset")
    int getFileOffset(@NativeType("stb_vorbis *") MemorySegment f);

    // this API allows you to get blocks of data from any source and hand
    // them to stb_vorbis. you have to buffer them; stb_vorbis will tell
    // you how much it used, and you have to give it the rest next time;
    // and stb_vorbis may not have enough data to work with and you will
    // need to give it the same data again PLUS more. Note that the Vorbis
    // specification does not bound the size of an individual frame.

    /**
     * create a vorbis decoder by passing in the initial data block containing
     * the ogg&amp;vorbis headers (you don't need to do parse them, just provide
     * the first N bytes of the file--you're told if it's not enough, see below)
     *
     * @param datablock                          datablock
     * @param datablock_length_in_bytes          datablock_length_in_bytes
     * @param datablock_memory_consumed_in_bytes datablock_memory_consumed_in_bytes
     * @param error                              error
     * @param alloc_buffer                       alloc_buffer
     * @return on success, returns an stb_vorbis *, does not set error, returns the amount of
     * data parsed/consumed on this call in *datablock_memory_consumed_in_bytes;
     * on failure, returns NULL on error and sets *error, does not change *datablock_memory_consumed
     * if returns NULL and *error is VORBIS_need_more_data, then the input block was
     * incomplete and you need to pass in a larger block from the start of the file
     */
    @Entrypoint("stb_vorbis_open_pushdata")
    @NativeType("stb_vorbis *")
    MemorySegment openPushdata(
        @NativeType("const unsigned char *") MemorySegment datablock, int datablock_length_in_bytes,
        @NativeType("int *") MemorySegment datablock_memory_consumed_in_bytes,
        @NativeType("int *") MemorySegment error,
        STBVorbisAlloc alloc_buffer);

    /**
     * decode a frame of audio sample data if possible from the passed-in data block
     * <p>
     * possible cases:
     * <ul>
     *     <li>0 bytes used, 0 samples output (need more data)</li>
     *     <li>N bytes used, 0 samples output (resynching the stream, keep going)</li>
     *     <li>N bytes used, M samples output (one frame of data)</li>
     * </ul>
     * note that after opening a file, you will ALWAYS get one N-bytes,0-sample
     * frame, because Vorbis always "discards" the first frame.
     * <p>
     * Note that on resynch, stb_vorbis will rarely consume all of the buffer,
     * instead only datablock_length_in_bytes-3 or less. This is because it wants
     * to avoid missing parts of a page header if they cross a datablock boundary,
     * without writing state-machiney code to record a partial detection.
     * <p>
     * The number of channels returned are stored in *channels (which can be
     * NULL--it is always the same as the number of channels reported by
     * get_info). *output will contain an array of float* buffers, one per
     * channel. In other words, (*output)[0][0] contains the first sample from
     * the first channel, and (*output)[1][0] contains the first sample from
     * the second channel.
     * <p>
     * *output points into stb_vorbis's internal output buffer storage; these
     * buffers are owned by stb_vorbis and application code should not free
     * them or modify their contents. They are transient and will be overwritten
     * once you ask for more data to get decoded, so be sure to grab any data
     * you need before then.
     *
     * @param f                         f
     * @param datablock                 datablock
     * @param datablock_length_in_bytes datablock_length_in_bytes
     * @param channels                  place to write number of float * buffers
     * @param output                    place to write float ** array of float * buffers
     * @param samples                   place to write number of output samples
     * @return number of bytes we used from datablock
     */
    @Entrypoint("stb_vorbis_decode_frame_pushdata")
    int decodeFramePushdata(
        @NativeType("stb_vorbis *") MemorySegment f,
        @NativeType("const unsigned char *") MemorySegment datablock, int datablock_length_in_bytes,
        @NativeType("int *") MemorySegment channels,
        @NativeType("float ***") MemorySegment output,
        @NativeType("int *") MemorySegment samples
    );

    /**
     * inform stb_vorbis that your next datablock will not be contiguous with
     * previous ones (e.g. you've seeked in the data); future attempts to decode
     * frames will cause stb_vorbis to resynchronize (as noted above), and
     * once it sees a valid Ogg page (typically 4-8KB, as large as 64KB), it
     * will begin decoding the _next_ frame.
     * <p>
     * if you want to seek using pushdata, you need to seek in your file, then
     * call stb_vorbis_flush_pushdata(), then start calling decoding, then once
     * decoding is returning you data, call stb_vorbis_get_sample_offset, and
     * if you don't like the result, seek your file again and repeat.
     *
     * @param f f
     */
    @Entrypoint("stb_vorbis_flush_pushdata")
    void flushPushdata(@NativeType("stb_vorbis *") MemorySegment f);

    //////////   PULLING INPUT API
    // This API assumes stb_vorbis is allowed to pull data from a source--
    // either a block of memory containing the _entire_ vorbis stream, or a
    // FILE * that you or it create, or possibly some other reading mechanism
    // if you go modify the source to replace the FILE * case with some kind
    // of callback to your code. (But if you don't support seeking, you may
    // just want to go ahead and use pushdata.)

    /**
     * decode an entire file and output the data interleaved into a malloc()ed
     * buffer stored in *output. The return value is the number of samples
     * decoded, or -1 if the file could not be opened or was not an ogg vorbis file.
     * When you're done with it, just free() the pointer returned in *output.
     *
     * @param filename    filename
     * @param channels    channels
     * @param sample_rate sample_rate
     * @param output      output
     * @return the number of samples decoded
     */
    @Entrypoint("stb_vorbis_decode_filename")
    int decodeFilename(@NativeType("const char *") MemorySegment filename, @NativeType("int *") MemorySegment channels, @NativeType("int *") MemorySegment sample_rate, @NativeType("short **") MemorySegment output);

    /**
     * decode an entire file and output the data interleaved into a malloc()ed
     * buffer stored in *output. The return value is the number of samples
     * decoded, or -1 if the file could not be opened or was not an ogg vorbis file.
     * When you're done with it, just free() the pointer returned in *output.
     *
     * @param mem         mem
     * @param len         len
     * @param channels    channels
     * @param sample_rate sample_rate
     * @param output      output
     * @return the number of samples decoded
     */
    @Entrypoint("stb_vorbis_decode_memory")
    int decodeMemory(@NativeType("const unsigned char *") MemorySegment mem, int len, @NativeType("int *") MemorySegment channels, @NativeType("int *") MemorySegment sample_rate, @NativeType("short **") MemorySegment output);

    /**
     * create an ogg vorbis decoder from an ogg vorbis stream in memory (note
     * this must be the entire stream!).
     * on failure, returns NULL and sets *error
     *
     * @param data         data
     * @param len          len
     * @param error        error
     * @param alloc_buffer alloc_buffer
     * @return ogg vorbis decoder
     */
    @Entrypoint("stb_vorbis_open_memory")
    @NativeType("stb_vorbis *")
    MemorySegment openMemory(@NativeType("const unsigned char *") MemorySegment data, int len,
                             @NativeType("int *") MemorySegment error, STBVorbisAlloc alloc_buffer);

    /**
     * create an ogg vorbis decoder from a filename via fopen().
     * on failure, returns NULL and sets *error (possibly to VORBIS_file_open_failure).
     *
     * @param filename     filename
     * @param error        error
     * @param alloc_buffer alloc_buffer
     * @return ogg vorbis decoder
     */
    @Entrypoint("stb_vorbis_open_filename")
    @NativeType("stb_vorbis *")
    MemorySegment openFilename(@NativeType("const char *") MemorySegment filename,
                               @NativeType("int *") MemorySegment error, STBVorbisAlloc alloc_buffer);

    /**
     * create an ogg vorbis decoder from an open FILE *, looking for a stream at
     * the _current_ seek point (ftell).
     * on failure, returns NULL and sets *error.
     * note that stb_vorbis must "own" this stream; if you seek it in between
     * calls to stb_vorbis, it will become confused.
     * Moreover, if you attempt to
     * perform stb_vorbis_seek_*() operations on this file, it will assume it
     * owns the _entire_ rest of the file after the start point.
     * Use the next
     * function, stb_vorbis_open_file_section(), to limit it.
     *
     * @param f                     f
     * @param close_handle_on_close close_handle_on_close
     * @param error                 error
     * @param alloc_buffer          alloc_buffer
     * @return ogg vorbis decoder
     */
    @Entrypoint("stb_vorbis_open_file")
    @NativeType("stb_vorbis *")
    MemorySegment openFile(@NativeType("FILE *") MemorySegment f, int close_handle_on_close,
                           @NativeType("int *") MemorySegment error, STBVorbisAlloc alloc_buffer);

    /**
     * create an ogg vorbis decoder from an open FILE *, looking for a stream at
     * the _current_ seek point (ftell); the stream will be of length 'len' bytes.
     * on failure, returns NULL and sets *error.
     * note that stb_vorbis must "own"
     * this stream; if you seek it in between calls to stb_vorbis, it will become
     * confused.
     *
     * @param f                     f
     * @param close_handle_on_close close_handle_on_close
     * @param error                 error
     * @param alloc_buffer          alloc_buffer
     * @param len                   len
     * @return ogg vorbis decoder
     */
    @Entrypoint("stb_vorbis_open_file_section")
    @NativeType("stb_vorbis *")
    MemorySegment openFileSection(@NativeType("FILE *") MemorySegment f, int close_handle_on_close,
                                  @NativeType("int *") MemorySegment error, STBVorbisAlloc alloc_buffer, int len);

    /**
     * these functions seek in the Vorbis file to (approximately) 'sample_number'.
     * after calling seek_frame(), the next call to get_frame_*() will include
     * the specified sample.
     * after calling stb_vorbis_seek(), the next call to
     * stb_vorbis_get_samples_* will start with the specified sample.
     * If you
     * do not need to seek to EXACTLY the target sample when using get_samples_*,
     * you can also use seek_frame().
     *
     * @param f             f
     * @param sample_number sample_number
     * @return int
     */
    @Entrypoint("stb_vorbis_seek_frame")
    int seekFrame(@NativeType("stb_vorbis *") MemorySegment f, int sample_number);

    /**
     * these functions seek in the Vorbis file to (approximately) 'sample_number'.
     * after calling seek_frame(), the next call to get_frame_*() will include
     * the specified sample.
     * after calling stb_vorbis_seek(), the next call to
     * stb_vorbis_get_samples_* will start with the specified sample.
     * If you
     * do not need to seek to EXACTLY the target sample when using get_samples_*,
     * you can also use seek_frame().
     *
     * @param f             f
     * @param sample_number sample_number
     * @return int
     */
    @Entrypoint("stb_vorbis_seek")
    int seek(@NativeType("stb_vorbis *") MemorySegment f, int sample_number);

    /**
     * this function is equivalent to stb_vorbis_seek(f,0)
     *
     * @param f f
     * @return int
     */
    @Entrypoint("stb_vorbis_seek_start")
    int seekStart(@NativeType("stb_vorbis *") MemorySegment f);

    /**
     * {@return the total length of the vorbis stream}
     *
     * @param f f
     */
    @Entrypoint("stb_vorbis_stream_length_in_samples")
    int streamLengthInSamples(@NativeType("stb_vorbis *") MemorySegment f);

    /**
     * {@return the total length of the vorbis stream}
     *
     * @param f f
     */
    @Entrypoint("stb_vorbis_stream_length_in_seconds")
    float streamLengthInSeconds(@NativeType("stb_vorbis *") MemorySegment f);

    /**
     * decode the next frame and return the number of samples.
     * the number of
     * channels returned are stored in *channels (which can be NULL--it is always
     * the same as the number of channels reported by get_info).
     * *output will
     * contain an array of float* buffers, one per channel.
     * These outputs will
     * be overwritten on the next call to stb_vorbis_get_frame_*.
     * <p>
     * You generally should not intermix calls to stb_vorbis_get_frame_*()
     * and stb_vorbis_get_samples_*(), since the latter calls the former.
     *
     * @param f        f
     * @param channels channels
     * @param output   output
     * @return the number of samples
     */
    @Entrypoint("stb_vorbis_get_frame_float")
    int getFrameFloat(@NativeType("stb_vorbis *") MemorySegment f, @NativeType("int *") MemorySegment channels, @NativeType("float ***") MemorySegment output);

    // decode the next frame and return the number of *samples* per channel.
    // Note that for interleaved data, you pass in the number of shorts (the
    // size of your array), but the return value is the number of samples per
    // channel, not the total number of samples.
    //
    // The data is coerced to the number of channels you request according to the
    // channel coercion rules (see below).
    // You must pass in the size of your
    // buffer(s) so that stb_vorbis will not overwrite the end of the buffer.
    // The maximum buffer size needed can be gotten from get_info(); however,
    // the Vorbis I specification implies an absolute maximum of 4096 samples
    // per channel.

    // Channel coercion rules:
    //    Let M be the number of channels requested, and N the number of channels present,
    //    and Cn be the nth channel; let stereo L be the sum of all L and center channels,
    //    and stereo R be the sum of all R and center channels (channel assignment from the
    //    vorbis spec).
    //        M    N       output
    //        1    k      sum(Ck) for all k
    //        2    *      stereo L, stereo R
    //        k    l      k > l, the first l channels, then 0s
    //        k    l      k <= l, the first k channels
    //    Note that this is not _good_ surround etc. mixing at all!
    //    It's just so
    //    you get something useful.

    /**
     * gets num_samples samples, not necessarily on a frame boundary--this requires
     * buffering so you have to supply the buffers.
     * DOES NOT APPLY THE COERCION RULES.
     * <p>
     * {@return the number of samples stored per channel}
     * it may be less than requested
     * at the end of the file.
     * If there are no more samples in the file, returns 0.
     *
     * @param f          f
     * @param channels   channels
     * @param buffer     buffer
     * @param num_floats num_floats
     */
    @Entrypoint("stb_vorbis_get_samples_float_interleaved")
    int getSamplesFloatInterleaved(@NativeType("stb_vorbis *") MemorySegment f, int channels, @NativeType("float *") MemorySegment buffer, int num_floats);

    /**
     * gets num_samples samples, not necessarily on a frame boundary--this requires
     * buffering so you have to supply the buffers.
     * DOES NOT APPLY THE COERCION RULES.
     * <p>
     * {@return the number of samples stored per channel}
     * it may be less than requested
     * at the end of the file.
     * If there are no more samples in the file, returns 0.
     *
     * @param f           f
     * @param channels    channels
     * @param buffer      buffer
     * @param num_samples num_samples
     */
    @Entrypoint("stb_vorbis_get_samples_float")
    int getSamplesFloat(@NativeType("stb_vorbis *") MemorySegment f, int channels, @NativeType("float **") MemorySegment buffer, int num_samples);

    /**
     * gets num_samples samples, not necessarily on a frame boundary--this requires
     * buffering so you have to supply the buffers.
     * Applies the coercion rules above
     * to produce 'channels' channels.
     * <p>
     * {@return the number of samples stored per channel}
     * it may be less than requested at the end of the file. If there are no more
     * samples in the file, returns 0.
     *
     * @param f          f
     * @param channels   channels
     * @param buffer     buffer
     * @param num_shorts num_shorts
     */
    @Entrypoint("stb_vorbis_get_samples_short_interleaved")
    int stb_vorbis_get_samples_short_interleaved(@NativeType("stb_vorbis *") MemorySegment f, int channels, @NativeType("short *") MemorySegment buffer, int num_shorts);

    /**
     * gets num_samples samples, not necessarily on a frame boundary--this requires
     * buffering so you have to supply the buffers.
     * Applies the coercion rules above
     * to produce 'channels' channels.
     * <p>
     * {@return the number of samples stored per channel}
     * it may be less than requested at the end of the file.
     * If there are no more
     * samples in the file, returns 0.
     *
     * @param f           f
     * @param channels    channels
     * @param buffer      buffer
     * @param num_samples num_samples
     */
    @Entrypoint("stb_vorbis_get_samples_short")
    int stb_vorbis_get_samples_short(@NativeType("stb_vorbis *") MemorySegment f, int channels, @NativeType("short **") MemorySegment buffer, int num_samples);
}
