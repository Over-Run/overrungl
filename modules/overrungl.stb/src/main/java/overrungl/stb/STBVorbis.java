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

import overrun.marshal.ByValue;
import overrun.marshal.gen.Entrypoint;
import overrungl.NativeType;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

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
     * the ogg&vorbis headers (you don't need to do parse them, just provide
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
}
