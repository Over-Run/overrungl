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
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.stb;
import org.graalvm.nativeimage.hosted.Feature;
import static org.graalvm.nativeimage.hosted.RuntimeForeignAccess.*;
class ForeignRegistrationFeature implements Feature {
    @Override public void duringSetup(DuringSetupAccess access) {
        registerForDowncall(overrungl.stb.STBEasyFont.Descriptors.FD_stb_easy_font_get_spacing);
        registerForDowncall(overrungl.stb.STBEasyFont.Descriptors.FD_stb_easy_font_spacing);
        registerForDowncall(overrungl.stb.STBEasyFont.Descriptors.FD_stb_easy_font_print);
        registerForDowncall(overrungl.stb.STBEasyFont.Descriptors.FD_stb_easy_font_width);
        registerForDowncall(overrungl.stb.STBEasyFont.Descriptors.FD_stb_easy_font_height);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_load_from_memory);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_load_from_callbacks);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_load);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_load_gif_from_memory);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_load_16_from_memory);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_load_16_from_callbacks);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_load_16);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_loadf_from_memory);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_loadf_from_callbacks);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_loadf);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_hdr_to_ldr_gamma);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_hdr_to_ldr_scale);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_ldr_to_hdr_gamma);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_ldr_to_hdr_scale);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_is_hdr_from_callbacks);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_is_hdr_from_memory);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_is_hdr);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_failure_reason);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_image_free);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_info_from_memory);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_info_from_callbacks);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_is_16_bit_from_memory);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_is_16_bit_from_callbacks);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_info);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_is_16_bit);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_set_unpremultiply_on_load);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_convert_iphone_png_to_rgb);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_set_flip_vertically_on_load);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_zlib_decode_malloc_guesssize);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_zlib_decode_malloc_guesssize_headerflag);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_zlib_decode_malloc);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_zlib_decode_buffer);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_zlib_decode_noheader_malloc);
        registerForDowncall(overrungl.stb.STBImage.Descriptors.FD_stbi_zlib_decode_noheader_buffer);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_resize_uint8_srgb);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_resize);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_resize_init);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_datatypes);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_pixel_callbacks);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_user_data);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_buffer_ptrs);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_pixel_layouts);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_edgemodes);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_filters);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_filter_callbacks);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_pixel_subrect);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_input_subrect);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_output_pixel_subrect);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_set_non_pm_alpha_speed_over_quality);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_build_samplers);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_free_samplers);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_resize_extended);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_build_samplers_with_splits);
        registerForDowncall(overrungl.stb.STBImageResize2.Descriptors.FD_stbir_resize_extended_splits);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_png);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_bmp);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_tga);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_hdr);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_jpg);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_png_to_func);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_bmp_to_func);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_tga_to_func);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_hdr_to_func);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_write_jpg_to_func);
        registerForDowncall(overrungl.stb.STBImageWrite.Descriptors.FD_stbi_flip_vertically_on_write);
        registerForDowncall(overrungl.stb.STBPerlin.Descriptors.FD_stb_perlin_noise3);
        registerForDowncall(overrungl.stb.STBPerlin.Descriptors.FD_stb_perlin_noise3_seed);
        registerForDowncall(overrungl.stb.STBPerlin.Descriptors.FD_stb_perlin_ridge_noise3);
        registerForDowncall(overrungl.stb.STBPerlin.Descriptors.FD_stb_perlin_fbm_noise3);
        registerForDowncall(overrungl.stb.STBPerlin.Descriptors.FD_stb_perlin_turbulence_noise3);
        registerForDowncall(overrungl.stb.STBPerlin.Descriptors.FD_stb_perlin_noise3_wrap_nonpow2);
        registerForDowncall(overrungl.stb.STBRectPack.Descriptors.FD_stbrp_pack_rects);
        registerForDowncall(overrungl.stb.STBRectPack.Descriptors.FD_stbrp_init_target);
        registerForDowncall(overrungl.stb.STBRectPack.Descriptors.FD_stbrp_setup_allow_out_of_mem);
        registerForDowncall(overrungl.stb.STBRectPack.Descriptors.FD_stbrp_setup_heuristic);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_BakeFontBitmap);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetBakedQuad);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetScaledFontVMetrics);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackBegin);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackEnd);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackFontRange);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackFontRanges);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackSetOversampling);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackSetSkipMissingCodepoints);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetPackedQuad);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackFontRangesGatherRects);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackFontRangesPackRects);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_PackFontRangesRenderIntoRects);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetNumberOfFonts);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetFontOffsetForIndex);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_InitFont);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_FindGlyphIndex);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_ScaleForPixelHeight);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_ScaleForMappingEmToPixels);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetFontVMetrics);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetFontVMetricsOS2);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetFontBoundingBox);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointHMetrics);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointKernAdvance);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointBox);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphHMetrics);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphKernAdvance);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphBox);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetKerningTableLength);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetKerningTable);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_IsGlyphEmpty);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointShape);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphShape);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_FreeShape);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_FindSVGDoc);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointSVG);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphSVG);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_FreeBitmap);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointBitmap);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointBitmapSubpixel);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_MakeCodepointBitmap);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_MakeCodepointBitmapSubpixel);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_MakeCodepointBitmapSubpixelPrefilter);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointBitmapBox);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointBitmapBoxSubpixel);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphBitmap);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphBitmapSubpixel);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_MakeGlyphBitmap);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_MakeGlyphBitmapSubpixel);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_MakeGlyphBitmapSubpixelPrefilter);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphBitmapBox);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphBitmapBoxSubpixel);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_Rasterize);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_FreeSDF);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetGlyphSDF);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetCodepointSDF);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_FindMatchingFont);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_CompareUTF8toUTF16_bigendian);
        registerForDowncall(overrungl.stb.STBTrueType.Descriptors.FD_stbtt_GetFontNameString);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_info);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_comment);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_error);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_close);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_sample_offset);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_file_offset);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_open_pushdata);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_decode_frame_pushdata);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_flush_pushdata);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_decode_filename);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_decode_memory);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_open_memory);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_open_filename);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_seek_frame);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_seek);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_seek_start);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_stream_length_in_samples);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_stream_length_in_seconds);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_frame_float);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_frame_short_interleaved);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_frame_short);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_samples_float_interleaved);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_samples_float);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_samples_short_interleaved);
        registerForDowncall(overrungl.stb.STBVorbis.Descriptors.FD_stb_vorbis_get_samples_short);
        registerForUpcall(overrungl.stb.STBIIORead.DESCRIPTOR);
        registerForUpcall(overrungl.stb.STBIIOSkip.DESCRIPTOR);
        registerForUpcall(overrungl.stb.STBIIOEof.DESCRIPTOR);
        registerForUpcall(overrungl.stb.STBIRInputCallback.DESCRIPTOR);
        registerForUpcall(overrungl.stb.STBIROutputCallback.DESCRIPTOR);
        registerForUpcall(overrungl.stb.STBIRKernelCallback.DESCRIPTOR);
        registerForUpcall(overrungl.stb.STBIRSupportCallback.DESCRIPTOR);
        registerForUpcall(overrungl.stb.STBIWriteFunc.DESCRIPTOR);
    }
}
