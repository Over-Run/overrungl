/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import org.jetbrains.annotations.Nullable;
import overrun.marshal.Downcall;
import overrun.marshal.MemoryStack;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.*;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;

/**
 * The STB image reader.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBImage {
    /**
     * The instance of STBImage.
     */
    STBImage INSTANCE = Downcall.load(MethodHandles.lookup(), Handles.lookup);
    // only used for desiredChannels
    /**
     * Image channels
     */
    int DEFAULT = 0,
        GREY = 1,
        GREY_ALPHA = 2,
        RGB = 3,
        RGB_ALPHA = 4;

    @Entrypoint("stbi_convert_iphone_png_to_rgb")
    void convertIphonePngToRgb(@Convert(Type.INT) boolean shouldConvert);

    @Entrypoint("stbi_convert_iphone_png_to_rgb_thread")
    void convertIphonePngToRgbThread(@Convert(Type.INT) boolean shouldConvert);

    @Entrypoint("stbi_failure_reason")
    MemorySegment nfailureReason();

    @Entrypoint("stbi_failure_reason")
    @Nullable
    @SizedSeg(Unmarshal.STR_SIZE)
    String failureReason();

    @Entrypoint("stbi_hdr_to_ldr_gamma")
    void hdrToLdrGamma(float gamma);

    @Entrypoint("stbi_hdr_to_ldr_scale")
    void hdrToLdrScale(float scale);

    @Entrypoint("stbi_image_free")
    void free(MemorySegment retValFromLoad);

    @Convert(Type.INT)
    @Entrypoint("stbi_info")
    boolean ninfo(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment comp);

    @Convert(Type.INT)
    @Entrypoint("stbi_info")
    boolean info(String filename, @Ref int[] x, @Ref int[] y, @Ref int[] comp);

    @Convert(Type.INT)
    @Entrypoint("stbi_info_from_callbacks")
    boolean ninfoFromCallbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment comp);

    @Convert(Type.INT)
    @Entrypoint("stbi_info_from_callbacks")
    boolean infoFromCallbacks(STBIIoCallbacks clbk, MemorySegment user, @Ref int[] x, @Ref int[] y, @Ref int[] comp);

    @Convert(Type.INT)
    @Entrypoint("stbi_info_from_file")
    boolean ninfoFromFile(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment comp);

    @Convert(Type.INT)
    @Entrypoint("stbi_info_from_file")
    boolean infoFromFile(MemorySegment f, @Ref int[] x, @Ref int[] y, @Ref int[] comp);

    @Convert(Type.INT)
    @Entrypoint("stbi_info_from_memory")
    boolean ninfoFromMemory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment comp);

    @Skip
    default boolean infoFromMemory(MemorySegment buffer, MemorySegment x, MemorySegment y, MemorySegment comp) {
        return ninfoFromMemory(buffer, Math.toIntExact(buffer.byteSize()), x, y, comp);
    }

    @Convert(Type.INT)
    @Entrypoint("stbi_info_from_memory")
    boolean infoFromMemory(SegmentAllocator allocator, int len, byte[] buffer, @Ref int[] x, @Ref int[] y, @Ref int[] comp);

    @Skip
    default boolean infoFromMemory(SegmentAllocator allocator, byte[] buffer, @Ref int[] x, @Ref int[] y, @Ref int[] comp) {
        return infoFromMemory(allocator, buffer.length, buffer, x, y, comp);
    }

    @Convert(Type.INT)
    @Entrypoint("stbi_is_16_bit")
    boolean nis16Bit(MemorySegment filename);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_16_bit")
    boolean nis16Bit(String filename);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_16_bit_from_callbacks")
    boolean nis16BitFromCallbacks(MemorySegment clbk, MemorySegment user);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_16_bit_from_callbacks")
    boolean nis16BitFromCallbacks(STBIIoCallbacks clbk, MemorySegment user);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_16_bit_from_file")
    boolean nis16BitFromFile(MemorySegment f);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_16_bit_from_memory")
    boolean nis16BitFromMemory(MemorySegment buffer, int len);

    @Skip
    default boolean is16BitFromMemory(MemorySegment buffer) {
        return nis16BitFromMemory(buffer, Math.toIntExact(buffer.byteSize()));
    }

    @Convert(Type.INT)
    @Entrypoint("stbi_is_16_bit_from_memory")
    boolean is16BitFromMemory(SegmentAllocator allocator, byte[] buffer, int len);

    @Skip
    default boolean is16BitFromMemory(SegmentAllocator allocator, byte[] buffer) {
        return is16BitFromMemory(allocator, buffer, buffer.length);
    }

    @Convert(Type.INT)
    @Entrypoint("stbi_is_hdr")
    boolean isHdr(MemorySegment filename);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_hdr")
    boolean isHdr(String filename);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_hdr_from_callbacks")
    boolean nisHdrFromCallbacks(MemorySegment clbk, MemorySegment user);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_hdr_from_callbacks")
    boolean isHdrFromCallbacks(STBIIoCallbacks clbk, MemorySegment user);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_hdr_from_file")
    boolean isHdrFromFile(MemorySegment f);

    @Convert(Type.INT)
    @Entrypoint("stbi_is_hdr_from_memory")
    boolean nisHdrFromMemory(MemorySegment buffer, int len);

    @Skip
    default boolean isHdrFromMemory(MemorySegment buffer) {
        return nisHdrFromMemory(buffer, Math.toIntExact(buffer.byteSize()));
    }

    @Convert(Type.INT)
    @Entrypoint("stbi_is_hdr_from_memory")
    boolean isHdrFromMemory(SegmentAllocator allocator, byte[] buffer, int len);

    @Skip
    default boolean isHdrFromMemory(SegmentAllocator allocator, byte[] buffer) {
        return isHdrFromMemory(allocator, buffer, buffer.length);
    }

    @Entrypoint("stbi_ldr_to_hdr_gamma")
    void ldrToHdrGamma(float gamma);

    @Entrypoint("stbi_ldr_to_hdr_scale")
    void ldrToHdrScale(float scale);

    @Entrypoint("stbi_load")
    MemorySegment nload(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load")
    MemorySegment load(String filename, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_16")
    MemorySegment nload16(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_16")
    MemorySegment load16(String filename, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_16_from_callbacks")
    MemorySegment nload16FromCallbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_16_from_callbacks")
    MemorySegment load16FromCallbacks(STBIIoCallbacks clbk, MemorySegment user, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_16_from_memory")
    MemorySegment nload16FromMemory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Skip
    default MemorySegment load16FromMemory(MemorySegment buffer, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        return nload16FromMemory(buffer, Math.toIntExact(buffer.byteSize()), x, y, channelsInFile, desiredChannels);
    }

    @Entrypoint("stbi_load_16_from_memory")
    MemorySegment load16FromMemory(SegmentAllocator allocator, int len, byte[] buffer, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Skip
    default MemorySegment load16FromMemory(SegmentAllocator allocator, byte[] buffer, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels) {
        return load16FromMemory(allocator, buffer.length, buffer, x, y, channelsInFile, desiredChannels);
    }

    @Entrypoint("stbi_load_from_callbacks")
    MemorySegment nloadFromCallbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_from_callbacks")
    MemorySegment loadFromCallbacks(STBIIoCallbacks clbk, MemorySegment user, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_from_file")
    MemorySegment nloadFromFile(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_from_file")
    MemorySegment loadFromFile(MemorySegment f, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_from_file_16")
    MemorySegment nloadFromFile16(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_from_file_16")
    MemorySegment loadFromFile16(MemorySegment f, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_load_from_memory")
    MemorySegment nloadFromMemory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Skip
    default MemorySegment loadFromMemory(MemorySegment buffer, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        return nloadFromMemory(buffer, Math.toIntExact(buffer.byteSize()), x, y, channelsInFile, desiredChannels);
    }

    @Entrypoint("stbi_load_from_memory")
    MemorySegment loadFromMemory(SegmentAllocator allocator, byte[] buffer, int len, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Skip
    default MemorySegment loadFromMemory(SegmentAllocator allocator, byte[] buffer, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels) {
        return loadFromMemory(allocator, buffer, buffer.length, x, y, channelsInFile, desiredChannels);
    }

    @Entrypoint("stbi_load_gif_from_memory")
    MemorySegment nloadGifFromMemory(MemorySegment buffer, int len, MemorySegment delays, MemorySegment x, MemorySegment y, MemorySegment z, MemorySegment comp, int reqComp);

    @Skip
    default MemorySegment loadGifFromMemory(MemorySegment buffer, MemorySegment delays, MemorySegment x, MemorySegment y, MemorySegment z, MemorySegment comp, int reqComp) {
        return nloadGifFromMemory(buffer, Math.toIntExact(buffer.byteSize()), delays, x, y, z, comp, reqComp);
    }

    @Skip
    default MemorySegment loadGifFromMemory(SegmentAllocator allocator, byte[] buffer, @Ref int[][] delays, @Ref int[] x, @Ref int[] y, @Ref int[] z, @Ref int[] comp, int reqComp) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var pd = stack.allocate(ValueLayout.ADDRESS);
            var px = stack.ints(x);
            var py = stack.ints(y);
            var pz = stack.ints(z);
            var pc = stack.ints(comp);
            var addr = loadGifFromMemory(allocator.allocateFrom(ValueLayout.JAVA_BYTE, buffer), pd, px, py, pz, pc, reqComp);
            Unmarshal.copy(px, x);
            Unmarshal.copy(py, y);
            Unmarshal.copy(pz, z);
            Unmarshal.copy(pc, comp);
            final int layers = z[0];
            final int[] refDelays = new int[layers];
            Unmarshal.copy(pd.get(ValueLayout.ADDRESS, 0L).reinterpret(layers), refDelays);
            delays[0] = refDelays;
            return addr;
        }
    }

    @Entrypoint("stbi_loadf")
    MemorySegment nloadf(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_loadf")
    MemorySegment loadf(String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_loadf_from_callbacks")
    MemorySegment nloadfFromCallbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_loadf_from_callbacks")
    MemorySegment loadfFromCallbacks(STBIIoCallbacks clbk, MemorySegment user, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_loadf_from_file")
    MemorySegment nloadfFromFile(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Entrypoint("stbi_loadf_from_file")
    MemorySegment loadfFromFile(MemorySegment f, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Entrypoint("stbi_loadf_from_memory")
    MemorySegment nloadfFromMemory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels);

    @Skip
    default MemorySegment loadfFromMemory(MemorySegment buffer, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        return nloadfFromMemory(buffer, Math.toIntExact(buffer.byteSize()), x, y, channelsInFile, desiredChannels);
    }

    @Entrypoint("stbi_loadf_from_memory")
    MemorySegment loadfFromMemory(SegmentAllocator allocator, int len, byte[] buffer, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels);

    @Skip
    default MemorySegment loadfFromMemory(SegmentAllocator allocator, byte[] buffer, @Ref int[] x, @Ref int[] y, @Ref int[] channelsInFile, int desiredChannels) {
        return loadfFromMemory(allocator, buffer.length, buffer, x, y, channelsInFile, desiredChannels);
    }

    @Entrypoint("stbi_set_flip_vertically_on_load")
    void setFlipVerticallyOnLoad(@Convert(Type.INT) boolean shouldFlip);

    @Entrypoint("stbi_set_flip_vertically_on_load_thread")
    void setFlipVerticallyOnLoadThread(@Convert(Type.INT) boolean shouldFlip);

    @Entrypoint("stbi_set_unpremultiply_on_load")
    void nsetUnpremultiplyOnLoad(@Convert(Type.INT) boolean shouldUnpremultiply);

    @Entrypoint("stbi_set_unpremultiply_on_load_thread")
    void nsetUnpremultiplyOnLoadThread(@Convert(Type.INT) boolean shouldUnpremultiply);

    @Entrypoint("stbi_zlib_decode_buffer")
    int zlibDecodeBuffer(MemorySegment obuffer, int olen, MemorySegment ibuffer, int ilen);

    @Entrypoint("stbi_zlib_decode_malloc")
    MemorySegment zlibDecodeMalloc(MemorySegment buffer, int len, MemorySegment outLen);

    @Entrypoint("stbi_zlib_decode_malloc_guesssize")
    MemorySegment zlibDecodeMallocGuesssize(MemorySegment buffer, int len, int initialSize, MemorySegment outLen);

    @Entrypoint("stbi_zlib_decode_malloc_guesssize_headerflag")
    MemorySegment zlibDecodeMallocGuesssizeHeaderflag(MemorySegment buffer, int len, int initialSize, MemorySegment outLen, int parseHeader);

    @Entrypoint("stbi_zlib_decode_noheader_buffer")
    int zlibDecodeNoHeaderBuffer(MemorySegment obuffer, int olen, MemorySegment ibuffer, int ilen);

    @Entrypoint("stbi_zlib_decode_noheader_malloc")
    MemorySegment zlibDecodeNoheaderMalloc(MemorySegment buffer, int len, MemorySegment outLen);
}
