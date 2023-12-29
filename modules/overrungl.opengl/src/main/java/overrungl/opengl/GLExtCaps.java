/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl;

import overrungl.opengl.ext.*;
import overrungl.opengl.ext.arb.*;
import overrungl.opengl.ext.khr.*;
import overrungl.opengl.ext.oes.*;
import overrungl.opengl.ext.amd.*;
import overrungl.opengl.ext.apple.*;
import overrungl.opengl.ext.ati.*;
import overrungl.opengl.ext.ext.*;
import overrungl.opengl.ext.ibm.*;
import overrungl.opengl.ext.intel.*;
import overrungl.opengl.ext.mesa.*;
import overrungl.opengl.ext.nv.*;
import overrungl.opengl.ext.sgi.*;
import overrungl.opengl.ext.sun.*;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLExtFinder.*;

/**
 * The OpenGL extension capabilities.
 *
 * @since 0.1.0
 */
public final class GLExtCaps {
    /** The OpenGL extension flags. */
    public boolean GL_ARB_ES2_compatibility, GL_ARB_ES3_1_compatibility, GL_ARB_ES3_2_compatibility, GL_ARB_ES3_compatibility, GL_ARB_arrays_of_arrays, GL_ARB_base_instance, GL_ARB_bindless_texture, GL_ARB_blend_func_extended, GL_ARB_buffer_storage, GL_ARB_cl_event, GL_ARB_clear_buffer_object, GL_ARB_clear_texture, GL_ARB_clip_control, GL_ARB_color_buffer_float, GL_ARB_compatibility, GL_ARB_compressed_texture_pixel_storage, GL_ARB_compute_shader, GL_ARB_compute_variable_group_size, GL_ARB_conditional_render_inverted, GL_ARB_conservative_depth, GL_ARB_copy_buffer, GL_ARB_copy_image, GL_ARB_cull_distance, GL_ARB_debug_output, GL_ARB_depth_buffer_float, GL_ARB_depth_clamp, GL_ARB_depth_texture, GL_ARB_derivative_control, GL_ARB_direct_state_access, GL_ARB_draw_buffers, GL_ARB_draw_buffers_blend, GL_ARB_draw_elements_base_vertex, GL_ARB_draw_indirect, GL_ARB_draw_instanced, GL_ARB_enhanced_layouts, GL_ARB_explicit_attrib_location, GL_ARB_explicit_uniform_location, GL_ARB_fragment_coord_conventions, GL_ARB_fragment_layer_viewport, GL_ARB_fragment_program, GL_ARB_fragment_program_shadow, GL_ARB_fragment_shader, GL_ARB_fragment_shader_interlock, GL_ARB_framebuffer_no_attachments, GL_ARB_framebuffer_object, GL_ARB_framebuffer_sRGB, GL_ARB_geometry_shader4, GL_ARB_get_program_binary, GL_ARB_get_texture_sub_image, GL_ARB_gl_spirv, GL_ARB_gpu_shader5, GL_ARB_gpu_shader_fp64, GL_ARB_gpu_shader_int64, GL_ARB_half_float_pixel, GL_ARB_half_float_vertex, GL_ARB_imaging, GL_ARB_indirect_parameters, GL_ARB_instanced_arrays, GL_ARB_internalformat_query, GL_ARB_internalformat_query2, GL_ARB_invalidate_subdata, GL_ARB_map_buffer_alignment, GL_ARB_map_buffer_range, GL_ARB_matrix_palette, GL_ARB_multi_bind, GL_ARB_multi_draw_indirect, GL_ARB_multisample, GL_ARB_multitexture, GL_ARB_occlusion_query, GL_ARB_occlusion_query2, GL_ARB_parallel_shader_compile, GL_ARB_pipeline_statistics_query, GL_ARB_pixel_buffer_object, GL_ARB_point_parameters, GL_ARB_point_sprite, GL_ARB_polygon_offset_clamp, GL_ARB_post_depth_coverage, GL_ARB_program_interface_query, GL_ARB_provoking_vertex, GL_ARB_query_buffer_object, GL_ARB_robust_buffer_access_behavior, GL_ARB_robustness, GL_ARB_robustness_isolation, GL_ARB_sample_locations, GL_ARB_sample_shading, GL_ARB_sampler_objects, GL_ARB_seamless_cube_map, GL_ARB_seamless_cubemap_per_texture, GL_ARB_separate_shader_objects, GL_ARB_shader_atomic_counter_ops, GL_ARB_shader_atomic_counters, GL_ARB_shader_ballot, GL_ARB_shader_bit_encoding, GL_ARB_shader_clock, GL_ARB_shader_draw_parameters, GL_ARB_shader_group_vote, GL_ARB_shader_image_load_store, GL_ARB_shader_image_size, GL_ARB_shader_objects, GL_ARB_shader_precision, GL_ARB_shader_stencil_export, GL_ARB_shader_storage_buffer_object, GL_ARB_shader_subroutine, GL_ARB_shader_texture_image_samples, GL_ARB_shader_texture_lod, GL_ARB_shader_viewport_layer_array, GL_ARB_shading_language_100, GL_ARB_shading_language_420pack, GL_ARB_shading_language_include, GL_ARB_shading_language_packing, GL_ARB_shadow, GL_ARB_shadow_ambient, GL_ARB_sparse_buffer, GL_ARB_sparse_texture, GL_ARB_sparse_texture2, GL_ARB_sparse_texture_clamp, GL_ARB_spirv_extensions, GL_ARB_stencil_texturing, GL_ARB_sync, GL_ARB_tessellation_shader, GL_ARB_texture_barrier, GL_ARB_texture_border_clamp, GL_ARB_texture_buffer_object, GL_ARB_texture_buffer_object_rgb32, GL_ARB_texture_buffer_range, GL_ARB_texture_compression, GL_ARB_texture_compression_bptc, GL_ARB_texture_compression_rgtc, GL_ARB_texture_cube_map, GL_ARB_texture_cube_map_array, GL_ARB_texture_env_add, GL_ARB_texture_env_combine, GL_ARB_texture_env_crossbar, GL_ARB_texture_env_dot3, GL_ARB_texture_filter_anisotropic, GL_ARB_texture_filter_minmax, GL_ARB_texture_float, GL_ARB_texture_gather, GL_ARB_texture_mirror_clamp_to_edge, GL_ARB_texture_mirrored_repeat, GL_ARB_texture_multisample, GL_ARB_texture_non_power_of_two, GL_ARB_texture_query_levels, GL_ARB_texture_query_lod, GL_ARB_texture_rectangle, GL_ARB_texture_rg, GL_ARB_texture_rgb10_a2ui, GL_ARB_texture_stencil8, GL_ARB_texture_storage, GL_ARB_texture_storage_multisample, GL_ARB_texture_swizzle, GL_ARB_texture_view, GL_ARB_timer_query, GL_ARB_transform_feedback2, GL_ARB_transform_feedback3, GL_ARB_transform_feedback_instanced, GL_ARB_transform_feedback_overflow_query, GL_ARB_transpose_matrix, GL_ARB_uniform_buffer_object, GL_ARB_vertex_array_bgra, GL_ARB_vertex_array_object, GL_ARB_vertex_attrib_64bit, GL_ARB_vertex_attrib_binding, GL_ARB_vertex_blend, GL_ARB_vertex_buffer_object, GL_ARB_vertex_program, GL_ARB_vertex_shader, GL_ARB_vertex_type_10f_11f_11f_rev, GL_ARB_vertex_type_2_10_10_10_rev, GL_ARB_viewport_array, GL_ARB_window_pos, GL_KHR_blend_equation_advanced, GL_KHR_blend_equation_advanced_coherent, GL_KHR_context_flush_control, GL_KHR_debug, GL_KHR_no_error, GL_KHR_parallel_shader_compile, GL_KHR_robust_buffer_access_behavior, GL_KHR_robustness, GL_KHR_shader_subgroup, GL_KHR_texture_compression_astc_hdr, GL_KHR_texture_compression_astc_ldr, GL_KHR_texture_compression_astc_sliced_3d, GL_OES_byte_coordinates, GL_OES_compressed_paletted_texture, GL_OES_fixed_point, GL_OES_query_matrix, GL_OES_read_format, GL_OES_single_precision, GL_3DFX_multisample, GL_3DFX_tbuffer, GL_3DFX_texture_compression_FXT1, GL_AMD_blend_minmax_factor, GL_AMD_conservative_depth, GL_AMD_debug_output, GL_AMD_depth_clamp_separate, GL_AMD_draw_buffers_blend, GL_AMD_framebuffer_multisample_advanced, GL_AMD_framebuffer_sample_positions, GL_AMD_gcn_shader, GL_AMD_gpu_shader_half_float, GL_AMD_gpu_shader_int16, GL_AMD_gpu_shader_int64, GL_AMD_interleaved_elements, GL_AMD_multi_draw_indirect, GL_AMD_name_gen_delete, GL_AMD_occlusion_query_event, GL_AMD_performance_monitor, GL_AMD_pinned_memory, GL_AMD_query_buffer_object, GL_AMD_sample_positions, GL_AMD_seamless_cubemap_per_texture, GL_AMD_shader_atomic_counter_ops, GL_AMD_shader_ballot, GL_AMD_shader_explicit_vertex_parameter, GL_AMD_shader_gpu_shader_half_float_fetch, GL_AMD_shader_image_load_store_lod, GL_AMD_shader_stencil_export, GL_AMD_shader_trinary_minmax, GL_AMD_sparse_texture, GL_AMD_stencil_operation_extended, GL_AMD_texture_gather_bias_lod, GL_AMD_texture_texture4, GL_AMD_transform_feedback3_lines_triangles, GL_AMD_transform_feedback4, GL_AMD_vertex_shader_layer, GL_AMD_vertex_shader_tessellator, GL_AMD_vertex_shader_viewport_index, GL_APPLE_aux_depth_stencil, GL_APPLE_client_storage, GL_APPLE_element_array, GL_APPLE_fence, GL_APPLE_float_pixels, GL_APPLE_flush_buffer_range, GL_APPLE_object_purgeable, GL_APPLE_rgb_422, GL_APPLE_row_bytes, GL_APPLE_specular_vector, GL_APPLE_texture_range, GL_APPLE_transform_hint, GL_APPLE_vertex_array_object, GL_APPLE_vertex_array_range, GL_APPLE_vertex_program_evaluators, GL_APPLE_ycbcr_422, GL_ATI_draw_buffers, GL_ATI_element_array, GL_ATI_envmap_bumpmap, GL_ATI_fragment_shader, GL_ATI_map_object_buffer, GL_ATI_meminfo, GL_ATI_pixel_format_float, GL_ATI_pn_triangles, GL_ATI_separate_stencil, GL_ATI_text_fragment_shader, GL_ATI_texture_env_combine3, GL_ATI_texture_float, GL_ATI_texture_mirror_once, GL_ATI_vertex_array_object, GL_ATI_vertex_attrib_array_object, GL_ATI_vertex_streams, GL_EXT_422_pixels, GL_EXT_EGL_image_storage, GL_EXT_EGL_sync, GL_EXT_abgr, GL_EXT_bgra, GL_EXT_bindable_uniform, GL_EXT_blend_color, GL_EXT_blend_equation_separate, GL_EXT_blend_func_separate, GL_EXT_blend_logic_op, GL_EXT_blend_minmax, GL_EXT_blend_subtract, GL_EXT_clip_volume_hint, GL_EXT_cmyka, GL_EXT_color_subtable, GL_EXT_compiled_vertex_array, GL_EXT_convolution, GL_EXT_coordinate_frame, GL_EXT_copy_texture, GL_EXT_cull_vertex, GL_EXT_debug_label, GL_EXT_debug_marker, GL_EXT_depth_bounds_test, GL_EXT_direct_state_access, GL_EXT_draw_buffers2, GL_EXT_draw_instanced, GL_EXT_draw_range_elements, GL_EXT_external_buffer, GL_EXT_fog_coord, GL_EXT_framebuffer_blit, GL_EXT_framebuffer_blit_layers, GL_EXT_framebuffer_multisample, GL_EXT_framebuffer_multisample_blit_scaled, GL_EXT_framebuffer_object, GL_EXT_framebuffer_sRGB, GL_EXT_geometry_shader4, GL_EXT_gpu_program_parameters, GL_EXT_gpu_shader4, GL_EXT_histogram, GL_EXT_index_array_formats, GL_EXT_index_func, GL_EXT_index_material, GL_EXT_index_texture, GL_EXT_light_texture, GL_EXT_memory_object, GL_EXT_memory_object_fd, GL_EXT_memory_object_win32, GL_EXT_misc_attribute, GL_EXT_multi_draw_arrays, GL_EXT_multisample, GL_EXT_multiview_tessellation_geometry_shader, GL_EXT_multiview_texture_multisample, GL_EXT_multiview_timer_query, GL_EXT_packed_depth_stencil, GL_EXT_packed_float, GL_EXT_packed_pixels, GL_EXT_paletted_texture, GL_EXT_pixel_buffer_object, GL_EXT_pixel_transform, GL_EXT_pixel_transform_color_table, GL_EXT_point_parameters, GL_EXT_polygon_offset, GL_EXT_polygon_offset_clamp, GL_EXT_post_depth_coverage, GL_EXT_provoking_vertex, GL_EXT_raster_multisample, GL_EXT_rescale_normal, GL_EXT_secondary_color, GL_EXT_semaphore, GL_EXT_semaphore_fd, GL_EXT_semaphore_win32, GL_EXT_separate_shader_objects, GL_EXT_separate_specular_color, GL_EXT_shader_framebuffer_fetch, GL_EXT_shader_framebuffer_fetch_non_coherent, GL_EXT_shader_image_load_formatted, GL_EXT_shader_image_load_store, GL_EXT_shader_integer_mix, GL_EXT_shader_samples_identical, GL_EXT_shadow_funcs, GL_EXT_shared_texture_palette, GL_EXT_sparse_texture2, GL_EXT_stencil_clear_tag, GL_EXT_stencil_two_side, GL_EXT_stencil_wrap, GL_EXT_subtexture, GL_EXT_texture, GL_EXT_texture3D, GL_EXT_texture_array, GL_EXT_texture_buffer_object, GL_EXT_texture_compression_latc, GL_EXT_texture_compression_rgtc, GL_EXT_texture_compression_s3tc, GL_EXT_texture_cube_map, GL_EXT_texture_env_add, GL_EXT_texture_env_combine, GL_EXT_texture_env_dot3, GL_EXT_texture_filter_anisotropic, GL_EXT_texture_filter_minmax, GL_EXT_texture_integer, GL_EXT_texture_lod_bias, GL_EXT_texture_mirror_clamp, GL_EXT_texture_object, GL_EXT_texture_perturb_normal, GL_EXT_texture_sRGB, GL_EXT_texture_sRGB_R8, GL_EXT_texture_sRGB_RG8, GL_EXT_texture_sRGB_decode, GL_EXT_texture_shadow_lod, GL_EXT_texture_shared_exponent, GL_EXT_texture_snorm, GL_EXT_texture_storage, GL_EXT_texture_swizzle, GL_EXT_timer_query, GL_EXT_transform_feedback, GL_EXT_vertex_array, GL_EXT_vertex_array_bgra, GL_EXT_vertex_attrib_64bit, GL_EXT_vertex_shader, GL_EXT_vertex_weighting, GL_EXT_win32_keyed_mutex, GL_EXT_window_rectangles, GL_EXT_x11_sync_object, GL_GREMEDY_frame_terminator, GL_GREMEDY_string_marker, GL_HP_convolution_border_modes, GL_HP_image_transform, GL_HP_occlusion_test, GL_HP_texture_lighting, GL_IBM_cull_vertex, GL_IBM_multimode_draw_arrays, GL_IBM_rasterpos_clip, GL_IBM_static_data, GL_IBM_texture_mirrored_repeat, GL_IBM_vertex_array_lists, GL_INGR_blend_func_separate, GL_INGR_color_clamp, GL_INGR_interlace_read, GL_INTEL_blackhole_render, GL_INTEL_conservative_rasterization, GL_INTEL_fragment_shader_ordering, GL_INTEL_framebuffer_CMAA, GL_INTEL_map_texture, GL_INTEL_parallel_arrays, GL_INTEL_performance_query, GL_MESAX_texture_stack, GL_MESA_framebuffer_flip_x, GL_MESA_framebuffer_flip_y, GL_MESA_framebuffer_swap_xy, GL_MESA_pack_invert, GL_MESA_program_binary_formats, GL_MESA_resize_buffers, GL_MESA_shader_integer_functions, GL_MESA_tile_raster_order, GL_MESA_window_pos, GL_MESA_ycbcr_texture, GL_NVX_blend_equation_advanced_multi_draw_buffers, GL_NVX_conditional_render, GL_NVX_gpu_memory_info, GL_NVX_gpu_multicast2, GL_NVX_linked_gpu_multicast, GL_NVX_progress_fence, GL_NV_alpha_to_coverage_dither_control, GL_NV_bindless_multi_draw_indirect, GL_NV_bindless_multi_draw_indirect_count, GL_NV_bindless_texture, GL_NV_blend_equation_advanced, GL_NV_blend_equation_advanced_coherent, GL_NV_blend_minmax_factor, GL_NV_blend_square, GL_NV_clip_space_w_scaling, GL_NV_command_list, GL_NV_compute_program5, GL_NV_compute_shader_derivatives, GL_NV_conditional_render, GL_NV_conservative_raster, GL_NV_conservative_raster_dilate, GL_NV_conservative_raster_pre_snap, GL_NV_conservative_raster_pre_snap_triangles, GL_NV_conservative_raster_underestimation, GL_NV_copy_depth_to_color, GL_NV_copy_image, GL_NV_deep_texture3D, GL_NV_depth_buffer_float, GL_NV_depth_clamp, GL_NV_draw_texture, GL_NV_draw_vulkan_image, GL_NV_evaluators, GL_NV_explicit_multisample, GL_NV_fence, GL_NV_fill_rectangle, GL_NV_float_buffer, GL_NV_fog_distance, GL_NV_fragment_coverage_to_color, GL_NV_fragment_program, GL_NV_fragment_program2, GL_NV_fragment_program4, GL_NV_fragment_program_option, GL_NV_fragment_shader_barycentric, GL_NV_fragment_shader_interlock, GL_NV_framebuffer_mixed_samples, GL_NV_framebuffer_multisample_coverage, GL_NV_geometry_program4, GL_NV_geometry_shader4, GL_NV_geometry_shader_passthrough, GL_NV_gpu_multicast, GL_NV_gpu_program4, GL_NV_gpu_program5, GL_NV_gpu_program5_mem_extended, GL_NV_gpu_shader5, GL_NV_half_float, GL_NV_internalformat_sample_query, GL_NV_light_max_exponent, GL_NV_memory_attachment, GL_NV_memory_object_sparse, GL_NV_mesh_shader, GL_NV_multisample_coverage, GL_NV_multisample_filter_hint, GL_NV_occlusion_query, GL_NV_packed_depth_stencil, GL_NV_parameter_buffer_object, GL_NV_parameter_buffer_object2, GL_NV_path_rendering, GL_NV_path_rendering_shared_edge, GL_NV_pixel_data_range, GL_NV_point_sprite, GL_NV_present_video, GL_NV_primitive_restart, GL_NV_primitive_shading_rate, GL_NV_query_resource, GL_NV_query_resource_tag, GL_NV_register_combiners, GL_NV_register_combiners2, GL_NV_representative_fragment_test, GL_NV_robustness_video_memory_purge, GL_NV_sample_locations, GL_NV_sample_mask_override_coverage, GL_NV_scissor_exclusive, GL_NV_shader_atomic_counters, GL_NV_shader_atomic_float, GL_NV_shader_atomic_float64, GL_NV_shader_atomic_fp16_vector, GL_NV_shader_atomic_int64, GL_NV_shader_buffer_load, GL_NV_shader_buffer_store, GL_NV_shader_storage_buffer_object, GL_NV_shader_subgroup_partitioned, GL_NV_shader_texture_footprint, GL_NV_shader_thread_group, GL_NV_shader_thread_shuffle, GL_NV_shading_rate_image, GL_NV_stereo_view_rendering, GL_NV_tessellation_program5, GL_NV_texgen_emboss, GL_NV_texgen_reflection, GL_NV_texture_barrier, GL_NV_texture_compression_vtc, GL_NV_texture_env_combine4, GL_NV_texture_expand_normal, GL_NV_texture_multisample, GL_NV_texture_rectangle, GL_NV_texture_rectangle_compressed, GL_NV_texture_shader, GL_NV_texture_shader2, GL_NV_texture_shader3, GL_NV_timeline_semaphore, GL_NV_transform_feedback, GL_NV_transform_feedback2, GL_NV_uniform_buffer_std430_layout, GL_NV_uniform_buffer_unified_memory, GL_NV_vdpau_interop, GL_NV_vdpau_interop2, GL_NV_vertex_array_range, GL_NV_vertex_array_range2, GL_NV_vertex_attrib_integer_64bit, GL_NV_vertex_buffer_unified_memory, GL_NV_vertex_program, GL_NV_vertex_program1_1, GL_NV_vertex_program2, GL_NV_vertex_program2_option, GL_NV_vertex_program3, GL_NV_vertex_program4, GL_NV_video_capture, GL_NV_viewport_array2, GL_NV_viewport_swizzle, GL_OML_interlace, GL_OML_resample, GL_OML_subsample, GL_OVR_multiview, GL_OVR_multiview2, GL_PGI_misc_hints, GL_PGI_vertex_hints, GL_REND_screen_coordinates, GL_S3_s3tc, GL_SGIS_detail_texture, GL_SGIS_fog_function, GL_SGIS_generate_mipmap, GL_SGIS_multisample, GL_SGIS_pixel_texture, GL_SGIS_point_line_texgen, GL_SGIS_point_parameters, GL_SGIS_sharpen_texture, GL_SGIS_texture4D, GL_SGIS_texture_border_clamp, GL_SGIS_texture_color_mask, GL_SGIS_texture_edge_clamp, GL_SGIS_texture_filter4, GL_SGIS_texture_lod, GL_SGIS_texture_select, GL_SGIX_async, GL_SGIX_async_histogram, GL_SGIX_async_pixel, GL_SGIX_blend_alpha_minmax, GL_SGIX_calligraphic_fragment, GL_SGIX_clipmap, GL_SGIX_convolution_accuracy, GL_SGIX_depth_pass_instrument, GL_SGIX_depth_texture, GL_SGIX_flush_raster, GL_SGIX_fog_offset, GL_SGIX_fragment_lighting, GL_SGIX_framezoom, GL_SGIX_igloo_interface, GL_SGIX_instruments, GL_SGIX_interlace, GL_SGIX_ir_instrument1, GL_SGIX_list_priority, GL_SGIX_pixel_texture, GL_SGIX_pixel_tiles, GL_SGIX_polynomial_ffd, GL_SGIX_reference_plane, GL_SGIX_resample, GL_SGIX_scalebias_hint, GL_SGIX_shadow, GL_SGIX_shadow_ambient, GL_SGIX_sprite, GL_SGIX_subsample, GL_SGIX_tag_sample_buffer, GL_SGIX_texture_add_env, GL_SGIX_texture_coordinate_clamp, GL_SGIX_texture_lod_bias, GL_SGIX_texture_multi_buffer, GL_SGIX_texture_scale_bias, GL_SGIX_vertex_preclip, GL_SGIX_ycrcb, GL_SGIX_ycrcb_subsample, GL_SGIX_ycrcba, GL_SGI_color_matrix, GL_SGI_color_table, GL_SGI_texture_color_table, GL_SUNX_constant_data, GL_SUN_convolution_border_modes, GL_SUN_global_alpha, GL_SUN_mesh_array, GL_SUN_slice_accum, GL_SUN_triangle_list, GL_SUN_vertex, GL_WIN_phong_shading, GL_WIN_specular_fog;

    /** GLCapabilities */
    public final GLCapabilities caps;

    /**
     * Construct <i>incomplete</i> OpenGL extension capabilities.
     *
     * @param caps The parent capabilities.
     */
    public GLExtCaps(GLCapabilities caps) {
        this.caps = caps;
    }

    /** Method handles. */
    public MethodHandle
        glPrimitiveBoundingBoxARB, glGetTextureHandleARB, glGetTextureSamplerHandleARB, glMakeTextureHandleResidentARB, glMakeTextureHandleNonResidentARB, glGetImageHandleARB, glMakeImageHandleResidentARB, glMakeImageHandleNonResidentARB, glUniformHandleui64ARB, glUniformHandleui64vARB, glProgramUniformHandleui64ARB, glProgramUniformHandleui64vARB, glIsTextureHandleResidentARB, glIsImageHandleResidentARB, glVertexAttribL1ui64ARB, glVertexAttribL1ui64vARB,
        glGetVertexAttribLui64vARB, glCreateSyncFromCLeventARB, glClampColorARB, glDispatchComputeGroupSizeARB, glDebugMessageControlARB, glDebugMessageInsertARB, glDebugMessageCallbackARB, glGetDebugMessageLogARB, glDrawBuffersARB, glBlendEquationiARB, glBlendEquationSeparateiARB, glBlendFunciARB, glBlendFuncSeparateiARB, glDrawArraysInstancedARB, glDrawElementsInstancedARB, glProgramStringARB,
        glBindProgramARB, glDeleteProgramsARB, glGenProgramsARB, glProgramEnvParameter4dARB, glProgramEnvParameter4dvARB, glProgramEnvParameter4fARB, glProgramEnvParameter4fvARB, glProgramLocalParameter4dARB, glProgramLocalParameter4dvARB, glProgramLocalParameter4fARB, glProgramLocalParameter4fvARB, glGetProgramEnvParameterdvARB, glGetProgramEnvParameterfvARB, glGetProgramLocalParameterdvARB, glGetProgramLocalParameterfvARB, glGetProgramivARB,
        glGetProgramStringARB, glIsProgramARB, glProgramParameteriARB, glFramebufferTextureARB, glFramebufferTextureLayerARB, glFramebufferTextureFaceARB, glSpecializeShaderARB, glUniform1i64ARB, glUniform2i64ARB, glUniform3i64ARB, glUniform4i64ARB, glUniform1i64vARB, glUniform2i64vARB, glUniform3i64vARB, glUniform4i64vARB, glUniform1ui64ARB,
        glUniform2ui64ARB, glUniform3ui64ARB, glUniform4ui64ARB, glUniform1ui64vARB, glUniform2ui64vARB, glUniform3ui64vARB, glUniform4ui64vARB, glGetUniformi64vARB, glGetUniformui64vARB, glGetnUniformi64vARB, glGetnUniformui64vARB, glProgramUniform1i64ARB, glProgramUniform2i64ARB, glProgramUniform3i64ARB, glProgramUniform4i64ARB, glProgramUniform1i64vARB,
        glProgramUniform2i64vARB, glProgramUniform3i64vARB, glProgramUniform4i64vARB, glProgramUniform1ui64ARB, glProgramUniform2ui64ARB, glProgramUniform3ui64ARB, glProgramUniform4ui64ARB, glProgramUniform1ui64vARB, glProgramUniform2ui64vARB, glProgramUniform3ui64vARB, glProgramUniform4ui64vARB, glColorTable, glColorTableParameterfv, glColorTableParameteriv, glCopyColorTable, glGetColorTable,
        glGetColorTableParameterfv, glGetColorTableParameteriv, glColorSubTable, glCopyColorSubTable, glConvolutionFilter1D, glConvolutionFilter2D, glConvolutionParameterf, glConvolutionParameterfv, glConvolutionParameteri, glConvolutionParameteriv, glCopyConvolutionFilter1D, glCopyConvolutionFilter2D, glGetConvolutionFilter, glGetConvolutionParameterfv, glGetConvolutionParameteriv, glGetSeparableFilter,
        glSeparableFilter2D, glGetHistogram, glGetHistogramParameterfv, glGetHistogramParameteriv, glGetMinmax, glGetMinmaxParameterfv, glGetMinmaxParameteriv, glHistogram, glMinmax, glResetHistogram, glResetMinmax, glMultiDrawArraysIndirectCountARB, glMultiDrawElementsIndirectCountARB, glVertexAttribDivisorARB, glCurrentPaletteMatrixARB, glMatrixIndexubvARB,
        glMatrixIndexusvARB, glMatrixIndexuivARB, glMatrixIndexPointerARB, glSampleCoverageARB, glActiveTextureARB, glClientActiveTextureARB, glMultiTexCoord1dARB, glMultiTexCoord1dvARB, glMultiTexCoord1fARB, glMultiTexCoord1fvARB, glMultiTexCoord1iARB, glMultiTexCoord1ivARB, glMultiTexCoord1sARB, glMultiTexCoord1svARB, glMultiTexCoord2dARB, glMultiTexCoord2dvARB,
        glMultiTexCoord2fARB, glMultiTexCoord2fvARB, glMultiTexCoord2iARB, glMultiTexCoord2ivARB, glMultiTexCoord2sARB, glMultiTexCoord2svARB, glMultiTexCoord3dARB, glMultiTexCoord3dvARB, glMultiTexCoord3fARB, glMultiTexCoord3fvARB, glMultiTexCoord3iARB, glMultiTexCoord3ivARB, glMultiTexCoord3sARB, glMultiTexCoord3svARB, glMultiTexCoord4dARB, glMultiTexCoord4dvARB,
        glMultiTexCoord4fARB, glMultiTexCoord4fvARB, glMultiTexCoord4iARB, glMultiTexCoord4ivARB, glMultiTexCoord4sARB, glMultiTexCoord4svARB, glGenQueriesARB, glDeleteQueriesARB, glIsQueryARB, glBeginQueryARB, glEndQueryARB, glGetQueryivARB, glGetQueryObjectivARB, glGetQueryObjectuivARB, glMaxShaderCompilerThreadsARB, glPointParameterfARB,
        glPointParameterfvARB, glGetGraphicsResetStatusARB, glGetnCompressedTexImageARB, glGetnTexImageARB, glGetnUniformdvARB, glGetnUniformfvARB, glGetnUniformivARB, glGetnUniformuivARB, glReadnPixelsARB, glEvaluateDepthValuesARB, glFramebufferSampleLocationsfvARB, glNamedFramebufferSampleLocationsfvARB, glMinSampleShadingARB, glDeleteObjectARB, glGetHandleARB, glDetachObjectARB,
        glCreateShaderObjectARB, glShaderSourceARB, glCompileShaderARB, glCreateProgramObjectARB, glAttachObjectARB, glLinkProgramARB, glUseProgramObjectARB, glValidateProgramARB, glUniform1fARB, glUniform2fARB, glUniform3fARB, glUniform4fARB, glUniform1iARB, glUniform2iARB, glUniform3iARB, glUniform4iARB,
        glUniform1fvARB, glUniform2fvARB, glUniform3fvARB, glUniform4fvARB, glUniform1ivARB, glUniform2ivARB, glUniform3ivARB, glUniform4ivARB, glUniformMatrix2fvARB, glUniformMatrix3fvARB, glUniformMatrix4fvARB, glGetObjectParameterfvARB, glGetObjectParameterivARB, glGetInfoLogARB, glGetAttachedObjectsARB, glGetUniformLocationARB,
        glGetActiveUniformARB, glGetUniformfvARB, glGetUniformivARB, glGetShaderSourceARB, glNamedStringARB, glDeleteNamedStringARB, glCompileShaderIncludeARB, glIsNamedStringARB, glGetNamedStringARB, glGetNamedStringivARB, glBufferPageCommitmentARB, glNamedBufferPageCommitmentEXT, glNamedBufferPageCommitmentARB, glTexPageCommitmentARB, glTexBufferARB, glCompressedTexImage3DARB,
        glCompressedTexImage2DARB, glCompressedTexImage1DARB, glCompressedTexSubImage3DARB, glCompressedTexSubImage2DARB, glCompressedTexSubImage1DARB, glGetCompressedTexImageARB, glLoadTransposeMatrixfARB, glLoadTransposeMatrixdARB, glMultTransposeMatrixfARB, glMultTransposeMatrixdARB, glWeightbvARB, glWeightsvARB, glWeightivARB, glWeightfvARB, glWeightdvARB, glWeightubvARB,
        glWeightusvARB, glWeightuivARB, glWeightPointerARB, glVertexBlendARB, glBindBufferARB, glDeleteBuffersARB, glGenBuffersARB, glIsBufferARB, glBufferDataARB, glBufferSubDataARB, glGetBufferSubDataARB, glMapBufferARB, glUnmapBufferARB, glGetBufferParameterivARB, glGetBufferPointervARB, glVertexAttrib1dARB,
        glVertexAttrib1dvARB, glVertexAttrib1fARB, glVertexAttrib1fvARB, glVertexAttrib1sARB, glVertexAttrib1svARB, glVertexAttrib2dARB, glVertexAttrib2dvARB, glVertexAttrib2fARB, glVertexAttrib2fvARB, glVertexAttrib2sARB, glVertexAttrib2svARB, glVertexAttrib3dARB, glVertexAttrib3dvARB, glVertexAttrib3fARB, glVertexAttrib3fvARB, glVertexAttrib3sARB,
        glVertexAttrib3svARB, glVertexAttrib4NbvARB, glVertexAttrib4NivARB, glVertexAttrib4NsvARB, glVertexAttrib4NubARB, glVertexAttrib4NubvARB, glVertexAttrib4NuivARB, glVertexAttrib4NusvARB, glVertexAttrib4bvARB, glVertexAttrib4dARB, glVertexAttrib4dvARB, glVertexAttrib4fARB, glVertexAttrib4fvARB, glVertexAttrib4ivARB, glVertexAttrib4sARB, glVertexAttrib4svARB,
        glVertexAttrib4ubvARB, glVertexAttrib4uivARB, glVertexAttrib4usvARB, glVertexAttribPointerARB, glEnableVertexAttribArrayARB, glDisableVertexAttribArrayARB, glGetVertexAttribdvARB, glGetVertexAttribfvARB, glGetVertexAttribivARB, glGetVertexAttribPointervARB, glBindAttribLocationARB, glGetActiveAttribARB, glGetAttribLocationARB, glDepthRangeArraydvNV, glDepthRangeIndexeddNV, glWindowPos2dARB,
        glWindowPos2dvARB, glWindowPos2fARB, glWindowPos2fvARB, glWindowPos2iARB, glWindowPos2ivARB, glWindowPos2sARB, glWindowPos2svARB, glWindowPos3dARB, glWindowPos3dvARB, glWindowPos3fARB, glWindowPos3fvARB, glWindowPos3iARB, glWindowPos3ivARB, glWindowPos3sARB, glWindowPos3svARB, glBlendBarrierKHR,
        glMaxShaderCompilerThreadsKHR, glMultiTexCoord1bOES, glMultiTexCoord1bvOES, glMultiTexCoord2bOES, glMultiTexCoord2bvOES, glMultiTexCoord3bOES, glMultiTexCoord3bvOES, glMultiTexCoord4bOES, glMultiTexCoord4bvOES, glTexCoord1bOES, glTexCoord1bvOES, glTexCoord2bOES, glTexCoord2bvOES, glTexCoord3bOES, glTexCoord3bvOES, glTexCoord4bOES,
        glTexCoord4bvOES, glVertex2bOES, glVertex2bvOES, glVertex3bOES, glVertex3bvOES, glVertex4bOES, glVertex4bvOES, glAlphaFuncxOES, glClearColorxOES, glClearDepthxOES, glClipPlanexOES, glColor4xOES, glDepthRangexOES, glFogxOES, glFogxvOES, glFrustumxOES,
        glGetClipPlanexOES, glGetFixedvOES, glGetTexEnvxvOES, glGetTexParameterxvOES, glLightModelxOES, glLightModelxvOES, glLightxOES, glLightxvOES, glLineWidthxOES, glLoadMatrixxOES, glMaterialxOES, glMaterialxvOES, glMultMatrixxOES, glMultiTexCoord4xOES, glNormal3xOES, glOrthoxOES,
        glPointParameterxvOES, glPointSizexOES, glPolygonOffsetxOES, glRotatexOES, glScalexOES, glTexEnvxOES, glTexEnvxvOES, glTexParameterxOES, glTexParameterxvOES, glTranslatexOES, glAccumxOES, glBitmapxOES, glBlendColorxOES, glClearAccumxOES, glColor3xOES, glColor3xvOES,
        glColor4xvOES, glConvolutionParameterxOES, glConvolutionParameterxvOES, glEvalCoord1xOES, glEvalCoord1xvOES, glEvalCoord2xOES, glEvalCoord2xvOES, glFeedbackBufferxOES, glGetConvolutionParameterxvOES, glGetHistogramParameterxvOES, glGetLightxOES, glGetMapxvOES, glGetMaterialxOES, glGetPixelMapxv, glGetTexGenxvOES, glGetTexLevelParameterxvOES,
        glIndexxOES, glIndexxvOES, glLoadTransposeMatrixxOES, glMap1xOES, glMap2xOES, glMapGrid1xOES, glMapGrid2xOES, glMultTransposeMatrixxOES, glMultiTexCoord1xOES, glMultiTexCoord1xvOES, glMultiTexCoord2xOES, glMultiTexCoord2xvOES, glMultiTexCoord3xOES, glMultiTexCoord3xvOES, glMultiTexCoord4xvOES, glNormal3xvOES,
        glPassThroughxOES, glPixelMapx, glPixelStorex, glPixelTransferxOES, glPixelZoomxOES, glPrioritizeTexturesxOES, glRasterPos2xOES, glRasterPos2xvOES, glRasterPos3xOES, glRasterPos3xvOES, glRasterPos4xOES, glRasterPos4xvOES, glRectxOES, glRectxvOES, glTexCoord1xOES, glTexCoord1xvOES,
        glTexCoord2xOES, glTexCoord2xvOES, glTexCoord3xOES, glTexCoord3xvOES, glTexCoord4xOES, glTexCoord4xvOES, glTexGenxOES, glTexGenxvOES, glVertex2xOES, glVertex2xvOES, glVertex3xOES, glVertex3xvOES, glVertex4xOES, glVertex4xvOES, glQueryMatrixxOES, glClearDepthfOES,
        glClipPlanefOES, glDepthRangefOES, glFrustumfOES, glGetClipPlanefOES, glOrthofOES, glTbufferMask3DFX, glDebugMessageEnableAMD, glDebugMessageInsertAMD, glDebugMessageCallbackAMD, glGetDebugMessageLogAMD, glBlendFuncIndexedAMD, glBlendFuncSeparateIndexedAMD, glBlendEquationIndexedAMD, glBlendEquationSeparateIndexedAMD, glRenderbufferStorageMultisampleAdvancedAMD, glNamedRenderbufferStorageMultisampleAdvancedAMD,
        glFramebufferSamplePositionsfvAMD, glNamedFramebufferSamplePositionsfvAMD, glGetFramebufferParameterfvAMD, glGetNamedFramebufferParameterfvAMD, glUniform1i64NV, glUniform2i64NV, glUniform3i64NV, glUniform4i64NV, glUniform1i64vNV, glUniform2i64vNV, glUniform3i64vNV, glUniform4i64vNV, glUniform1ui64NV, glUniform2ui64NV, glUniform3ui64NV, glUniform4ui64NV,
        glUniform1ui64vNV, glUniform2ui64vNV, glUniform3ui64vNV, glUniform4ui64vNV, glGetUniformi64vNV, glGetUniformui64vNV, glProgramUniform1i64NV, glProgramUniform2i64NV, glProgramUniform3i64NV, glProgramUniform4i64NV, glProgramUniform1i64vNV, glProgramUniform2i64vNV, glProgramUniform3i64vNV, glProgramUniform4i64vNV, glProgramUniform1ui64NV, glProgramUniform2ui64NV,
        glProgramUniform3ui64NV, glProgramUniform4ui64NV, glProgramUniform1ui64vNV, glProgramUniform2ui64vNV, glProgramUniform3ui64vNV, glProgramUniform4ui64vNV, glVertexAttribParameteriAMD, glMultiDrawArraysIndirectAMD, glMultiDrawElementsIndirectAMD, glGenNamesAMD, glDeleteNamesAMD, glIsNameAMD, glQueryObjectParameteruiAMD, glGetPerfMonitorGroupsAMD, glGetPerfMonitorCountersAMD, glGetPerfMonitorGroupStringAMD,
        glGetPerfMonitorCounterStringAMD, glGetPerfMonitorCounterInfoAMD, glGenPerfMonitorsAMD, glDeletePerfMonitorsAMD, glSelectPerfMonitorCountersAMD, glBeginPerfMonitorAMD, glEndPerfMonitorAMD, glGetPerfMonitorCounterDataAMD, glSetMultisamplefvAMD, glTexStorageSparseAMD, glTextureStorageSparseAMD, glStencilOpValueAMD, glTessellationFactorAMD, glTessellationModeAMD, glElementPointerAPPLE, glDrawElementArrayAPPLE,
        glDrawRangeElementArrayAPPLE, glMultiDrawElementArrayAPPLE, glMultiDrawRangeElementArrayAPPLE, glGenFencesAPPLE, glDeleteFencesAPPLE, glSetFenceAPPLE, glIsFenceAPPLE, glTestFenceAPPLE, glFinishFenceAPPLE, glTestObjectAPPLE, glFinishObjectAPPLE, glBufferParameteriAPPLE, glFlushMappedBufferRangeAPPLE, glObjectPurgeableAPPLE, glObjectUnpurgeableAPPLE, glGetObjectParameterivAPPLE,
        glTextureRangeAPPLE, glGetTexParameterPointervAPPLE, glBindVertexArrayAPPLE, glDeleteVertexArraysAPPLE, glGenVertexArraysAPPLE, glIsVertexArrayAPPLE, glVertexArrayRangeAPPLE, glFlushVertexArrayRangeAPPLE, glVertexArrayParameteriAPPLE, glEnableVertexAttribAPPLE, glDisableVertexAttribAPPLE, glIsVertexAttribEnabledAPPLE, glMapVertexAttrib1dAPPLE, glMapVertexAttrib1fAPPLE, glMapVertexAttrib2dAPPLE, glMapVertexAttrib2fAPPLE,
        glDrawBuffersATI, glElementPointerATI, glDrawElementArrayATI, glDrawRangeElementArrayATI, glTexBumpParameterivATI, glTexBumpParameterfvATI, glGetTexBumpParameterivATI, glGetTexBumpParameterfvATI, glGenFragmentShadersATI, glBindFragmentShaderATI, glDeleteFragmentShaderATI, glBeginFragmentShaderATI, glEndFragmentShaderATI, glPassTexCoordATI, glSampleMapATI, glColorFragmentOp1ATI,
        glColorFragmentOp2ATI, glColorFragmentOp3ATI, glAlphaFragmentOp1ATI, glAlphaFragmentOp2ATI, glAlphaFragmentOp3ATI, glSetFragmentShaderConstantATI, glMapObjectBufferATI, glUnmapObjectBufferATI, glPNTrianglesiATI, glPNTrianglesfATI, glStencilOpSeparateATI, glStencilFuncSeparateATI, glNewObjectBufferATI, glIsObjectBufferATI, glUpdateObjectBufferATI, glGetObjectBufferfvATI,
        glGetObjectBufferivATI, glFreeObjectBufferATI, glArrayObjectATI, glGetArrayObjectfvATI, glGetArrayObjectivATI, glVariantArrayObjectATI, glGetVariantArrayObjectfvATI, glGetVariantArrayObjectivATI, glVertexAttribArrayObjectATI, glGetVertexAttribArrayObjectfvATI, glGetVertexAttribArrayObjectivATI, glVertexStream1sATI, glVertexStream1svATI, glVertexStream1iATI, glVertexStream1ivATI, glVertexStream1fATI,
        glVertexStream1fvATI, glVertexStream1dATI, glVertexStream1dvATI, glVertexStream2sATI, glVertexStream2svATI, glVertexStream2iATI, glVertexStream2ivATI, glVertexStream2fATI, glVertexStream2fvATI, glVertexStream2dATI, glVertexStream2dvATI, glVertexStream3sATI, glVertexStream3svATI, glVertexStream3iATI, glVertexStream3ivATI, glVertexStream3fATI,
        glVertexStream3fvATI, glVertexStream3dATI, glVertexStream3dvATI, glVertexStream4sATI, glVertexStream4svATI, glVertexStream4iATI, glVertexStream4ivATI, glVertexStream4fATI, glVertexStream4fvATI, glVertexStream4dATI, glVertexStream4dvATI, glNormalStream3bATI, glNormalStream3bvATI, glNormalStream3sATI, glNormalStream3svATI, glNormalStream3iATI,
        glNormalStream3ivATI, glNormalStream3fATI, glNormalStream3fvATI, glNormalStream3dATI, glNormalStream3dvATI, glClientActiveVertexStreamATI, glVertexBlendEnviATI, glVertexBlendEnvfATI, glEGLImageTargetTexStorageEXT, glEGLImageTargetTextureStorageEXT, glUniformBufferEXT, glGetUniformBufferSizeEXT, glGetUniformOffsetEXT, glBlendColorEXT, glBlendEquationSeparateEXT, glBlendFuncSeparateEXT,
        glBlendEquationEXT, glColorSubTableEXT, glCopyColorSubTableEXT, glLockArraysEXT, glUnlockArraysEXT, glConvolutionFilter1DEXT, glConvolutionFilter2DEXT, glConvolutionParameterfEXT, glConvolutionParameterfvEXT, glConvolutionParameteriEXT, glConvolutionParameterivEXT, glCopyConvolutionFilter1DEXT, glCopyConvolutionFilter2DEXT, glGetConvolutionFilterEXT, glGetConvolutionParameterfvEXT, glGetConvolutionParameterivEXT,
        glGetSeparableFilterEXT, glSeparableFilter2DEXT, glTangent3bEXT, glTangent3bvEXT, glTangent3dEXT, glTangent3dvEXT, glTangent3fEXT, glTangent3fvEXT, glTangent3iEXT, glTangent3ivEXT, glTangent3sEXT, glTangent3svEXT, glBinormal3bEXT, glBinormal3bvEXT, glBinormal3dEXT, glBinormal3dvEXT,
        glBinormal3fEXT, glBinormal3fvEXT, glBinormal3iEXT, glBinormal3ivEXT, glBinormal3sEXT, glBinormal3svEXT, glTangentPointerEXT, glBinormalPointerEXT, glCopyTexImage1DEXT, glCopyTexImage2DEXT, glCopyTexSubImage1DEXT, glCopyTexSubImage2DEXT, glCopyTexSubImage3DEXT, glCullParameterdvEXT, glCullParameterfvEXT, glLabelObjectEXT,
        glGetObjectLabelEXT, glInsertEventMarkerEXT, glPushGroupMarkerEXT, glPopGroupMarkerEXT, glDepthBoundsEXT, glMatrixLoadfEXT, glMatrixLoaddEXT, glMatrixMultfEXT, glMatrixMultdEXT, glMatrixLoadIdentityEXT, glMatrixRotatefEXT, glMatrixRotatedEXT, glMatrixScalefEXT, glMatrixScaledEXT, glMatrixTranslatefEXT, glMatrixTranslatedEXT,
        glMatrixFrustumEXT, glMatrixOrthoEXT, glMatrixPopEXT, glMatrixPushEXT, glClientAttribDefaultEXT, glPushClientAttribDefaultEXT, glTextureParameterfEXT, glTextureParameterfvEXT, glTextureParameteriEXT, glTextureParameterivEXT, glTextureImage1DEXT, glTextureImage2DEXT, glTextureSubImage1DEXT, glTextureSubImage2DEXT, glCopyTextureImage1DEXT, glCopyTextureImage2DEXT,
        glCopyTextureSubImage1DEXT, glCopyTextureSubImage2DEXT, glGetTextureImageEXT, glGetTextureParameterfvEXT, glGetTextureParameterivEXT, glGetTextureLevelParameterfvEXT, glGetTextureLevelParameterivEXT, glTextureImage3DEXT, glTextureSubImage3DEXT, glCopyTextureSubImage3DEXT, glBindMultiTextureEXT, glMultiTexCoordPointerEXT, glMultiTexEnvfEXT, glMultiTexEnvfvEXT, glMultiTexEnviEXT, glMultiTexEnvivEXT,
        glMultiTexGendEXT, glMultiTexGendvEXT, glMultiTexGenfEXT, glMultiTexGenfvEXT, glMultiTexGeniEXT, glMultiTexGenivEXT, glGetMultiTexEnvfvEXT, glGetMultiTexEnvivEXT, glGetMultiTexGendvEXT, glGetMultiTexGenfvEXT, glGetMultiTexGenivEXT, glMultiTexParameteriEXT, glMultiTexParameterivEXT, glMultiTexParameterfEXT, glMultiTexParameterfvEXT, glMultiTexImage1DEXT,
        glMultiTexImage2DEXT, glMultiTexSubImage1DEXT, glMultiTexSubImage2DEXT, glCopyMultiTexImage1DEXT, glCopyMultiTexImage2DEXT, glCopyMultiTexSubImage1DEXT, glCopyMultiTexSubImage2DEXT, glGetMultiTexImageEXT, glGetMultiTexParameterfvEXT, glGetMultiTexParameterivEXT, glGetMultiTexLevelParameterfvEXT, glGetMultiTexLevelParameterivEXT, glMultiTexImage3DEXT, glMultiTexSubImage3DEXT, glCopyMultiTexSubImage3DEXT, glEnableClientStateIndexedEXT,
        glDisableClientStateIndexedEXT, glGetFloatIndexedvEXT, glGetDoubleIndexedvEXT, glGetPointerIndexedvEXT, glEnableIndexedEXT, glDisableIndexedEXT, glIsEnabledIndexedEXT, glGetIntegerIndexedvEXT, glGetBooleanIndexedvEXT, glCompressedTextureImage3DEXT, glCompressedTextureImage2DEXT, glCompressedTextureImage1DEXT, glCompressedTextureSubImage3DEXT, glCompressedTextureSubImage2DEXT, glCompressedTextureSubImage1DEXT, glGetCompressedTextureImageEXT,
        glCompressedMultiTexImage3DEXT, glCompressedMultiTexImage2DEXT, glCompressedMultiTexImage1DEXT, glCompressedMultiTexSubImage3DEXT, glCompressedMultiTexSubImage2DEXT, glCompressedMultiTexSubImage1DEXT, glGetCompressedMultiTexImageEXT, glMatrixLoadTransposefEXT, glMatrixLoadTransposedEXT, glMatrixMultTransposefEXT, glMatrixMultTransposedEXT, glNamedBufferDataEXT, glNamedBufferSubDataEXT, glMapNamedBufferEXT, glUnmapNamedBufferEXT, glGetNamedBufferParameterivEXT,
        glGetNamedBufferPointervEXT, glGetNamedBufferSubDataEXT, glProgramUniform1fEXT, glProgramUniform2fEXT, glProgramUniform3fEXT, glProgramUniform4fEXT, glProgramUniform1iEXT, glProgramUniform2iEXT, glProgramUniform3iEXT, glProgramUniform4iEXT, glProgramUniform1fvEXT, glProgramUniform2fvEXT, glProgramUniform3fvEXT, glProgramUniform4fvEXT, glProgramUniform1ivEXT, glProgramUniform2ivEXT,
        glProgramUniform3ivEXT, glProgramUniform4ivEXT, glProgramUniformMatrix2fvEXT, glProgramUniformMatrix3fvEXT, glProgramUniformMatrix4fvEXT, glProgramUniformMatrix2x3fvEXT, glProgramUniformMatrix3x2fvEXT, glProgramUniformMatrix2x4fvEXT, glProgramUniformMatrix4x2fvEXT, glProgramUniformMatrix3x4fvEXT, glProgramUniformMatrix4x3fvEXT, glTextureBufferEXT, glMultiTexBufferEXT, glTextureParameterIivEXT, glTextureParameterIuivEXT, glGetTextureParameterIivEXT,
        glGetTextureParameterIuivEXT, glMultiTexParameterIivEXT, glMultiTexParameterIuivEXT, glGetMultiTexParameterIivEXT, glGetMultiTexParameterIuivEXT, glProgramUniform1uiEXT, glProgramUniform2uiEXT, glProgramUniform3uiEXT, glProgramUniform4uiEXT, glProgramUniform1uivEXT, glProgramUniform2uivEXT, glProgramUniform3uivEXT, glProgramUniform4uivEXT, glNamedProgramLocalParameters4fvEXT, glNamedProgramLocalParameterI4iEXT, glNamedProgramLocalParameterI4ivEXT,
        glNamedProgramLocalParametersI4ivEXT, glNamedProgramLocalParameterI4uiEXT, glNamedProgramLocalParameterI4uivEXT, glNamedProgramLocalParametersI4uivEXT, glGetNamedProgramLocalParameterIivEXT, glGetNamedProgramLocalParameterIuivEXT, glEnableClientStateiEXT, glDisableClientStateiEXT, glGetFloati_vEXT, glGetDoublei_vEXT, glGetPointeri_vEXT, glNamedProgramStringEXT, glNamedProgramLocalParameter4dEXT, glNamedProgramLocalParameter4dvEXT, glNamedProgramLocalParameter4fEXT, glNamedProgramLocalParameter4fvEXT,
        glGetNamedProgramLocalParameterdvEXT, glGetNamedProgramLocalParameterfvEXT, glGetNamedProgramivEXT, glGetNamedProgramStringEXT, glNamedRenderbufferStorageEXT, glGetNamedRenderbufferParameterivEXT, glNamedRenderbufferStorageMultisampleEXT, glNamedRenderbufferStorageMultisampleCoverageEXT, glCheckNamedFramebufferStatusEXT, glNamedFramebufferTexture1DEXT, glNamedFramebufferTexture2DEXT, glNamedFramebufferTexture3DEXT, glNamedFramebufferRenderbufferEXT, glGetNamedFramebufferAttachmentParameterivEXT, glGenerateTextureMipmapEXT, glGenerateMultiTexMipmapEXT,
        glFramebufferDrawBufferEXT, glFramebufferDrawBuffersEXT, glFramebufferReadBufferEXT, glGetFramebufferParameterivEXT, glNamedCopyBufferSubDataEXT, glNamedFramebufferTextureEXT, glNamedFramebufferTextureLayerEXT, glNamedFramebufferTextureFaceEXT, glTextureRenderbufferEXT, glMultiTexRenderbufferEXT, glVertexArrayVertexOffsetEXT, glVertexArrayColorOffsetEXT, glVertexArrayEdgeFlagOffsetEXT, glVertexArrayIndexOffsetEXT, glVertexArrayNormalOffsetEXT, glVertexArrayTexCoordOffsetEXT,
        glVertexArrayMultiTexCoordOffsetEXT, glVertexArrayFogCoordOffsetEXT, glVertexArraySecondaryColorOffsetEXT, glVertexArrayVertexAttribOffsetEXT, glVertexArrayVertexAttribIOffsetEXT, glEnableVertexArrayEXT, glDisableVertexArrayEXT, glEnableVertexArrayAttribEXT, glDisableVertexArrayAttribEXT, glGetVertexArrayIntegervEXT, glGetVertexArrayPointervEXT, glGetVertexArrayIntegeri_vEXT, glGetVertexArrayPointeri_vEXT, glMapNamedBufferRangeEXT, glFlushMappedNamedBufferRangeEXT, glNamedBufferStorageEXT,
        glClearNamedBufferDataEXT, glClearNamedBufferSubDataEXT, glNamedFramebufferParameteriEXT, glGetNamedFramebufferParameterivEXT, glProgramUniform1dEXT, glProgramUniform2dEXT, glProgramUniform3dEXT, glProgramUniform4dEXT, glProgramUniform1dvEXT, glProgramUniform2dvEXT, glProgramUniform3dvEXT, glProgramUniform4dvEXT, glProgramUniformMatrix2dvEXT, glProgramUniformMatrix3dvEXT, glProgramUniformMatrix4dvEXT, glProgramUniformMatrix2x3dvEXT,
        glProgramUniformMatrix2x4dvEXT, glProgramUniformMatrix3x2dvEXT, glProgramUniformMatrix3x4dvEXT, glProgramUniformMatrix4x2dvEXT, glProgramUniformMatrix4x3dvEXT, glTextureBufferRangeEXT, glTextureStorage1DEXT, glTextureStorage2DEXT, glTextureStorage3DEXT, glTextureStorage2DMultisampleEXT, glTextureStorage3DMultisampleEXT, glVertexArrayBindVertexBufferEXT, glVertexArrayVertexAttribFormatEXT, glVertexArrayVertexAttribIFormatEXT, glVertexArrayVertexAttribLFormatEXT, glVertexArrayVertexAttribBindingEXT,
        glVertexArrayVertexBindingDivisorEXT, glVertexArrayVertexAttribLOffsetEXT, glTexturePageCommitmentEXT, glVertexArrayVertexAttribDivisorEXT, glColorMaskIndexedEXT, glDrawArraysInstancedEXT, glDrawElementsInstancedEXT, glDrawRangeElementsEXT, glBufferStorageExternalEXT, glNamedBufferStorageExternalEXT, glFogCoordfEXT, glFogCoordfvEXT, glFogCoorddEXT, glFogCoorddvEXT, glFogCoordPointerEXT, glBlitFramebufferEXT,
        glBlitFramebufferLayersEXT, glBlitFramebufferLayerEXT, glRenderbufferStorageMultisampleEXT, glIsRenderbufferEXT, glBindRenderbufferEXT, glDeleteRenderbuffersEXT, glGenRenderbuffersEXT, glRenderbufferStorageEXT, glGetRenderbufferParameterivEXT, glIsFramebufferEXT, glBindFramebufferEXT, glDeleteFramebuffersEXT, glGenFramebuffersEXT, glCheckFramebufferStatusEXT, glFramebufferTexture1DEXT, glFramebufferTexture2DEXT,
        glFramebufferTexture3DEXT, glFramebufferRenderbufferEXT, glGetFramebufferAttachmentParameterivEXT, glGenerateMipmapEXT, glProgramParameteriEXT, glProgramEnvParameters4fvEXT, glProgramLocalParameters4fvEXT, glGetUniformuivEXT, glBindFragDataLocationEXT, glGetFragDataLocationEXT, glUniform1uiEXT, glUniform2uiEXT, glUniform3uiEXT, glUniform4uiEXT, glUniform1uivEXT, glUniform2uivEXT,
        glUniform3uivEXT, glUniform4uivEXT, glVertexAttribI1iEXT, glVertexAttribI2iEXT, glVertexAttribI3iEXT, glVertexAttribI4iEXT, glVertexAttribI1uiEXT, glVertexAttribI2uiEXT, glVertexAttribI3uiEXT, glVertexAttribI4uiEXT, glVertexAttribI1ivEXT, glVertexAttribI2ivEXT, glVertexAttribI3ivEXT, glVertexAttribI4ivEXT, glVertexAttribI1uivEXT, glVertexAttribI2uivEXT,
        glVertexAttribI3uivEXT, glVertexAttribI4uivEXT, glVertexAttribI4bvEXT, glVertexAttribI4svEXT, glVertexAttribI4ubvEXT, glVertexAttribI4usvEXT, glVertexAttribIPointerEXT, glGetVertexAttribIivEXT, glGetVertexAttribIuivEXT, glGetHistogramEXT, glGetHistogramParameterfvEXT, glGetHistogramParameterivEXT, glGetMinmaxEXT, glGetMinmaxParameterfvEXT, glGetMinmaxParameterivEXT, glHistogramEXT,
        glMinmaxEXT, glResetHistogramEXT, glResetMinmaxEXT, glIndexFuncEXT, glIndexMaterialEXT, glApplyTextureEXT, glTextureLightEXT, glTextureMaterialEXT, glGetUnsignedBytevEXT, glGetUnsignedBytei_vEXT, glDeleteMemoryObjectsEXT, glIsMemoryObjectEXT, glCreateMemoryObjectsEXT, glMemoryObjectParameterivEXT, glGetMemoryObjectParameterivEXT, glTexStorageMem2DEXT,
        glTexStorageMem2DMultisampleEXT, glTexStorageMem3DEXT, glTexStorageMem3DMultisampleEXT, glBufferStorageMemEXT, glTextureStorageMem2DEXT, glTextureStorageMem2DMultisampleEXT, glTextureStorageMem3DEXT, glTextureStorageMem3DMultisampleEXT, glNamedBufferStorageMemEXT, glTexStorageMem1DEXT, glTextureStorageMem1DEXT, glImportMemoryFdEXT, glImportMemoryWin32HandleEXT, glImportMemoryWin32NameEXT, glMultiDrawArraysEXT, glMultiDrawElementsEXT,
        glSampleMaskEXT, glSamplePatternEXT, glColorTableEXT, glGetColorTableEXT, glGetColorTableParameterivEXT, glGetColorTableParameterfvEXT, glPixelTransformParameteriEXT, glPixelTransformParameterfEXT, glPixelTransformParameterivEXT, glPixelTransformParameterfvEXT, glGetPixelTransformParameterivEXT, glGetPixelTransformParameterfvEXT, glPointParameterfEXT, glPointParameterfvEXT, glPolygonOffsetEXT, glPolygonOffsetClampEXT,
        glProvokingVertexEXT, glRasterSamplesEXT, glSecondaryColor3bEXT, glSecondaryColor3bvEXT, glSecondaryColor3dEXT, glSecondaryColor3dvEXT, glSecondaryColor3fEXT, glSecondaryColor3fvEXT, glSecondaryColor3iEXT, glSecondaryColor3ivEXT, glSecondaryColor3sEXT, glSecondaryColor3svEXT, glSecondaryColor3ubEXT, glSecondaryColor3ubvEXT, glSecondaryColor3uiEXT, glSecondaryColor3uivEXT,
        glSecondaryColor3usEXT, glSecondaryColor3usvEXT, glSecondaryColorPointerEXT, glGenSemaphoresEXT, glDeleteSemaphoresEXT, glIsSemaphoreEXT, glSemaphoreParameterui64vEXT, glGetSemaphoreParameterui64vEXT, glWaitSemaphoreEXT, glSignalSemaphoreEXT, glImportSemaphoreFdEXT, glImportSemaphoreWin32HandleEXT, glImportSemaphoreWin32NameEXT, glUseShaderProgramEXT, glActiveProgramEXT, glCreateShaderProgramEXT,
        glFramebufferFetchBarrierEXT, glBindImageTextureEXT, glMemoryBarrierEXT, glStencilClearTagEXT, glActiveStencilFaceEXT, glTexSubImage1DEXT, glTexSubImage2DEXT, glTexImage3DEXT, glTexSubImage3DEXT, glFramebufferTextureLayerEXT, glTexBufferEXT, glTexParameterIivEXT, glTexParameterIuivEXT, glGetTexParameterIivEXT, glGetTexParameterIuivEXT, glClearColorIiEXT,
        glClearColorIuiEXT, glAreTexturesResidentEXT, glBindTextureEXT, glDeleteTexturesEXT, glGenTexturesEXT, glIsTextureEXT, glPrioritizeTexturesEXT, glTextureNormalEXT, glTexStorage1DEXT, glTexStorage2DEXT, glTexStorage3DEXT, glGetQueryObjecti64vEXT, glGetQueryObjectui64vEXT, glBeginTransformFeedbackEXT, glEndTransformFeedbackEXT, glBindBufferRangeEXT,
        glBindBufferOffsetEXT, glBindBufferBaseEXT, glTransformFeedbackVaryingsEXT, glGetTransformFeedbackVaryingEXT, glArrayElementEXT, glColorPointerEXT, glDrawArraysEXT, glEdgeFlagPointerEXT, glGetPointervEXT, glIndexPointerEXT, glNormalPointerEXT, glTexCoordPointerEXT, glVertexPointerEXT, glVertexAttribL1dEXT, glVertexAttribL2dEXT, glVertexAttribL3dEXT,
        glVertexAttribL4dEXT, glVertexAttribL1dvEXT, glVertexAttribL2dvEXT, glVertexAttribL3dvEXT, glVertexAttribL4dvEXT, glVertexAttribLPointerEXT, glGetVertexAttribLdvEXT, glBeginVertexShaderEXT, glEndVertexShaderEXT, glBindVertexShaderEXT, glGenVertexShadersEXT, glDeleteVertexShaderEXT, glShaderOp1EXT, glShaderOp2EXT, glShaderOp3EXT, glSwizzleEXT,
        glWriteMaskEXT, glInsertComponentEXT, glExtractComponentEXT, glGenSymbolsEXT, glSetInvariantEXT, glSetLocalConstantEXT, glVariantbvEXT, glVariantsvEXT, glVariantivEXT, glVariantfvEXT, glVariantdvEXT, glVariantubvEXT, glVariantusvEXT, glVariantuivEXT, glVariantPointerEXT, glEnableVariantClientStateEXT,
        glDisableVariantClientStateEXT, glBindLightParameterEXT, glBindMaterialParameterEXT, glBindTexGenParameterEXT, glBindTextureUnitParameterEXT, glBindParameterEXT, glIsVariantEnabledEXT, glGetVariantBooleanvEXT, glGetVariantIntegervEXT, glGetVariantFloatvEXT, glGetVariantPointervEXT, glGetInvariantBooleanvEXT, glGetInvariantIntegervEXT, glGetInvariantFloatvEXT, glGetLocalConstantBooleanvEXT, glGetLocalConstantIntegervEXT,
        glGetLocalConstantFloatvEXT, glVertexWeightfEXT, glVertexWeightfvEXT, glVertexWeightPointerEXT, glAcquireKeyedMutexWin32EXT, glReleaseKeyedMutexWin32EXT, glWindowRectanglesEXT, glImportSyncEXT, glFrameTerminatorGREMEDY, glStringMarkerGREMEDY, glImageTransformParameteriHP, glImageTransformParameterfHP, glImageTransformParameterivHP, glImageTransformParameterfvHP, glGetImageTransformParameterivHP, glGetImageTransformParameterfvHP,
        glMultiModeDrawArraysIBM, glMultiModeDrawElementsIBM, glFlushStaticDataIBM, glColorPointerListIBM, glSecondaryColorPointerListIBM, glEdgeFlagPointerListIBM, glFogCoordPointerListIBM, glIndexPointerListIBM, glNormalPointerListIBM, glTexCoordPointerListIBM, glVertexPointerListIBM, glBlendFuncSeparateINGR, glApplyFramebufferAttachmentCMAAINTEL, glSyncTextureINTEL, glUnmapTexture2DINTEL, glMapTexture2DINTEL,
        glVertexPointervINTEL, glNormalPointervINTEL, glColorPointervINTEL, glTexCoordPointervINTEL, glBeginPerfQueryINTEL, glCreatePerfQueryINTEL, glDeletePerfQueryINTEL, glEndPerfQueryINTEL, glGetFirstPerfQueryIdINTEL, glGetNextPerfQueryIdINTEL, glGetPerfCounterInfoINTEL, glGetPerfQueryDataINTEL, glGetPerfQueryIdByNameINTEL, glGetPerfQueryInfoINTEL, glFramebufferParameteriMESA, glGetFramebufferParameterivMESA,
        glResizeBuffersMESA, glWindowPos2dMESA, glWindowPos2dvMESA, glWindowPos2fMESA, glWindowPos2fvMESA, glWindowPos2iMESA, glWindowPos2ivMESA, glWindowPos2sMESA, glWindowPos2svMESA, glWindowPos3dMESA, glWindowPos3dvMESA, glWindowPos3fMESA, glWindowPos3fvMESA, glWindowPos3iMESA, glWindowPos3ivMESA, glWindowPos3sMESA,
        glWindowPos3svMESA, glWindowPos4dMESA, glWindowPos4dvMESA, glWindowPos4fMESA, glWindowPos4fvMESA, glWindowPos4iMESA, glWindowPos4ivMESA, glWindowPos4sMESA, glWindowPos4svMESA, glBeginConditionalRenderNVX, glEndConditionalRenderNVX, glUploadGpuMaskNVX, glMulticastViewportArrayvNVX, glMulticastViewportPositionWScaleNVX, glMulticastScissorArrayvNVX, glAsyncCopyBufferSubDataNVX,
        glAsyncCopyImageSubDataNVX, glLGPUNamedBufferSubDataNVX, glLGPUCopyImageSubDataNVX, glLGPUInterlockNVX, glCreateProgressFenceNVX, glSignalSemaphoreui64NVX, glWaitSemaphoreui64NVX, glClientWaitSemaphoreui64NVX, glAlphaToCoverageDitherControlNV, glMultiDrawArraysIndirectBindlessNV, glMultiDrawElementsIndirectBindlessNV, glMultiDrawArraysIndirectBindlessCountNV, glMultiDrawElementsIndirectBindlessCountNV, glGetTextureHandleNV, glGetTextureSamplerHandleNV, glMakeTextureHandleResidentNV,
        glMakeTextureHandleNonResidentNV, glGetImageHandleNV, glMakeImageHandleResidentNV, glMakeImageHandleNonResidentNV, glUniformHandleui64NV, glUniformHandleui64vNV, glProgramUniformHandleui64NV, glProgramUniformHandleui64vNV, glIsTextureHandleResidentNV, glIsImageHandleResidentNV, glBlendParameteriNV, glBlendBarrierNV, glViewportPositionWScaleNV, glCreateStatesNV, glDeleteStatesNV, glIsStateNV,
        glStateCaptureNV, glGetCommandHeaderNV, glGetStageIndexNV, glDrawCommandsNV, glDrawCommandsAddressNV, glDrawCommandsStatesNV, glDrawCommandsStatesAddressNV, glCreateCommandListsNV, glDeleteCommandListsNV, glIsCommandListNV, glListDrawCommandsStatesClientNV, glCommandListSegmentsNV, glCompileCommandListNV, glCallCommandListNV, glBeginConditionalRenderNV, glEndConditionalRenderNV,
        glSubpixelPrecisionBiasNV, glConservativeRasterParameterfNV, glConservativeRasterParameteriNV, glCopyImageSubDataNV, glDepthRangedNV, glClearDepthdNV, glDepthBoundsdNV, glDrawTextureNV, glDrawVkImageNV, glGetVkProcAddrNV, glWaitVkSemaphoreNV, glSignalVkSemaphoreNV, glSignalVkFenceNV, glMapControlPointsNV, glMapParameterivNV, glMapParameterfvNV,
        glGetMapControlPointsNV, glGetMapParameterivNV, glGetMapParameterfvNV, glGetMapAttribParameterivNV, glGetMapAttribParameterfvNV, glEvalMapsNV, glGetMultisamplefvNV, glSampleMaskIndexedNV, glTexRenderbufferNV, glDeleteFencesNV, glGenFencesNV, glIsFenceNV, glTestFenceNV, glGetFenceivNV, glFinishFenceNV, glSetFenceNV,
        glFragmentCoverageColorNV, glProgramNamedParameter4fNV, glProgramNamedParameter4fvNV, glProgramNamedParameter4dNV, glProgramNamedParameter4dvNV, glGetProgramNamedParameterfvNV, glGetProgramNamedParameterdvNV, glCoverageModulationTableNV, glGetCoverageModulationTableNV, glCoverageModulationNV, glRenderbufferStorageMultisampleCoverageNV, glProgramVertexLimitNV, glFramebufferTextureEXT, glFramebufferTextureFaceEXT, glRenderGpuMaskNV, glMulticastBufferSubDataNV,
        glMulticastCopyBufferSubDataNV, glMulticastCopyImageSubDataNV, glMulticastBlitFramebufferNV, glMulticastFramebufferSampleLocationsfvNV, glMulticastBarrierNV, glMulticastWaitSyncNV, glMulticastGetQueryObjectivNV, glMulticastGetQueryObjectuivNV, glMulticastGetQueryObjecti64vNV, glMulticastGetQueryObjectui64vNV, glProgramLocalParameterI4iNV, glProgramLocalParameterI4ivNV, glProgramLocalParametersI4ivNV, glProgramLocalParameterI4uiNV, glProgramLocalParameterI4uivNV, glProgramLocalParametersI4uivNV,
        glProgramEnvParameterI4iNV, glProgramEnvParameterI4ivNV, glProgramEnvParametersI4ivNV, glProgramEnvParameterI4uiNV, glProgramEnvParameterI4uivNV, glProgramEnvParametersI4uivNV, glGetProgramLocalParameterIivNV, glGetProgramLocalParameterIuivNV, glGetProgramEnvParameterIivNV, glGetProgramEnvParameterIuivNV, glProgramSubroutineParametersuivNV, glGetProgramSubroutineParameteruivNV, glVertex2hNV, glVertex2hvNV, glVertex3hNV, glVertex3hvNV,
        glVertex4hNV, glVertex4hvNV, glNormal3hNV, glNormal3hvNV, glColor3hNV, glColor3hvNV, glColor4hNV, glColor4hvNV, glTexCoord1hNV, glTexCoord1hvNV, glTexCoord2hNV, glTexCoord2hvNV, glTexCoord3hNV, glTexCoord3hvNV, glTexCoord4hNV, glTexCoord4hvNV,
        glMultiTexCoord1hNV, glMultiTexCoord1hvNV, glMultiTexCoord2hNV, glMultiTexCoord2hvNV, glMultiTexCoord3hNV, glMultiTexCoord3hvNV, glMultiTexCoord4hNV, glMultiTexCoord4hvNV, glVertexAttrib1hNV, glVertexAttrib1hvNV, glVertexAttrib2hNV, glVertexAttrib2hvNV, glVertexAttrib3hNV, glVertexAttrib3hvNV, glVertexAttrib4hNV, glVertexAttrib4hvNV,
        glVertexAttribs1hvNV, glVertexAttribs2hvNV, glVertexAttribs3hvNV, glVertexAttribs4hvNV, glFogCoordhNV, glFogCoordhvNV, glSecondaryColor3hNV, glSecondaryColor3hvNV, glVertexWeighthNV, glVertexWeighthvNV, glGetInternalformatSampleivNV, glGetMemoryObjectDetachedResourcesuivNV, glResetMemoryObjectParameterNV, glTexAttachMemoryNV, glBufferAttachMemoryNV, glTextureAttachMemoryNV,
        glNamedBufferAttachMemoryNV, glBufferPageCommitmentMemNV, glTexPageCommitmentMemNV, glNamedBufferPageCommitmentMemNV, glTexturePageCommitmentMemNV, glDrawMeshTasksNV, glDrawMeshTasksIndirectNV, glMultiDrawMeshTasksIndirectNV, glMultiDrawMeshTasksIndirectCountNV, glGenOcclusionQueriesNV, glDeleteOcclusionQueriesNV, glIsOcclusionQueryNV, glBeginOcclusionQueryNV, glEndOcclusionQueryNV, glGetOcclusionQueryivNV, glGetOcclusionQueryuivNV,
        glProgramBufferParametersfvNV, glProgramBufferParametersIivNV, glProgramBufferParametersIuivNV, glGenPathsNV, glDeletePathsNV, glIsPathNV, glPathCommandsNV, glPathCoordsNV, glPathSubCommandsNV, glPathSubCoordsNV, glPathStringNV, glPathGlyphsNV, glPathGlyphRangeNV, glWeightPathsNV, glCopyPathNV, glInterpolatePathsNV,
        glTransformPathNV, glPathParameterivNV, glPathParameteriNV, glPathParameterfvNV, glPathParameterfNV, glPathDashArrayNV, glPathStencilFuncNV, glPathStencilDepthOffsetNV, glStencilFillPathNV, glStencilStrokePathNV, glStencilFillPathInstancedNV, glStencilStrokePathInstancedNV, glPathCoverDepthFuncNV, glCoverFillPathNV, glCoverStrokePathNV, glCoverFillPathInstancedNV,
        glCoverStrokePathInstancedNV, glGetPathParameterivNV, glGetPathParameterfvNV, glGetPathCommandsNV, glGetPathCoordsNV, glGetPathDashArrayNV, glGetPathMetricsNV, glGetPathMetricRangeNV, glGetPathSpacingNV, glIsPointInFillPathNV, glIsPointInStrokePathNV, glGetPathLengthNV, glPointAlongPathNV, glMatrixLoad3x2fNV, glMatrixLoad3x3fNV, glMatrixLoadTranspose3x3fNV,
        glMatrixMult3x2fNV, glMatrixMult3x3fNV, glMatrixMultTranspose3x3fNV, glStencilThenCoverFillPathNV, glStencilThenCoverStrokePathNV, glStencilThenCoverFillPathInstancedNV, glStencilThenCoverStrokePathInstancedNV, glPathGlyphIndexRangeNV, glPathGlyphIndexArrayNV, glPathMemoryGlyphIndexArrayNV, glProgramPathFragmentInputGenNV, glGetProgramResourcefvNV, glPathColorGenNV, glPathTexGenNV, glPathFogGenNV, glGetPathColorGenivNV,
        glGetPathColorGenfvNV, glGetPathTexGenivNV, glGetPathTexGenfvNV, glPixelDataRangeNV, glFlushPixelDataRangeNV, glPointParameteriNV, glPointParameterivNV, glPresentFrameKeyedNV, glPresentFrameDualFillNV, glGetVideoivNV, glGetVideouivNV, glGetVideoi64vNV, glGetVideoui64vNV, glPrimitiveRestartNV, glPrimitiveRestartIndexNV, glQueryResourceNV,
        glGenQueryResourceTagNV, glDeleteQueryResourceTagNV, glQueryResourceTagNV, glCombinerParameterfvNV, glCombinerParameterfNV, glCombinerParameterivNV, glCombinerParameteriNV, glCombinerInputNV, glCombinerOutputNV, glFinalCombinerInputNV, glGetCombinerInputParameterfvNV, glGetCombinerInputParameterivNV, glGetCombinerOutputParameterfvNV, glGetCombinerOutputParameterivNV, glGetFinalCombinerInputParameterfvNV, glGetFinalCombinerInputParameterivNV,
        glCombinerStageParameterfvNV, glGetCombinerStageParameterfvNV, glFramebufferSampleLocationsfvNV, glNamedFramebufferSampleLocationsfvNV, glResolveDepthValuesNV, glScissorExclusiveNV, glScissorExclusiveArrayvNV, glMakeBufferResidentNV, glMakeBufferNonResidentNV, glIsBufferResidentNV, glMakeNamedBufferResidentNV, glMakeNamedBufferNonResidentNV, glIsNamedBufferResidentNV, glGetBufferParameterui64vNV, glGetNamedBufferParameterui64vNV, glGetIntegerui64vNV,
        glUniformui64NV, glUniformui64vNV, glProgramUniformui64NV, glProgramUniformui64vNV, glBindShadingRateImageNV, glGetShadingRateImagePaletteNV, glGetShadingRateSampleLocationivNV, glShadingRateImageBarrierNV, glShadingRateImagePaletteNV, glShadingRateSampleOrderNV, glShadingRateSampleOrderCustomNV, glTextureBarrierNV, glTexImage2DMultisampleCoverageNV, glTexImage3DMultisampleCoverageNV, glTextureImage2DMultisampleNV, glTextureImage3DMultisampleNV,
        glTextureImage2DMultisampleCoverageNV, glTextureImage3DMultisampleCoverageNV, glCreateSemaphoresNV, glSemaphoreParameterivNV, glGetSemaphoreParameterivNV, glBeginTransformFeedbackNV, glEndTransformFeedbackNV, glTransformFeedbackAttribsNV, glBindBufferRangeNV, glBindBufferOffsetNV, glBindBufferBaseNV, glTransformFeedbackVaryingsNV, glActiveVaryingNV, glGetVaryingLocationNV, glGetActiveVaryingNV, glGetTransformFeedbackVaryingNV,
        glTransformFeedbackStreamAttribsNV, glBindTransformFeedbackNV, glDeleteTransformFeedbacksNV, glGenTransformFeedbacksNV, glIsTransformFeedbackNV, glPauseTransformFeedbackNV, glResumeTransformFeedbackNV, glDrawTransformFeedbackNV, glVDPAUInitNV, glVDPAUFiniNV, glVDPAURegisterVideoSurfaceNV, glVDPAURegisterOutputSurfaceNV, glVDPAUIsSurfaceNV, glVDPAUUnregisterSurfaceNV, glVDPAUGetSurfaceivNV, glVDPAUSurfaceAccessNV,
        glVDPAUMapSurfacesNV, glVDPAUUnmapSurfacesNV, glVDPAURegisterVideoSurfaceWithPictureStructureNV, glFlushVertexArrayRangeNV, glVertexArrayRangeNV, glVertexAttribL1i64NV, glVertexAttribL2i64NV, glVertexAttribL3i64NV, glVertexAttribL4i64NV, glVertexAttribL1i64vNV, glVertexAttribL2i64vNV, glVertexAttribL3i64vNV, glVertexAttribL4i64vNV, glVertexAttribL1ui64NV, glVertexAttribL2ui64NV, glVertexAttribL3ui64NV,
        glVertexAttribL4ui64NV, glVertexAttribL1ui64vNV, glVertexAttribL2ui64vNV, glVertexAttribL3ui64vNV, glVertexAttribL4ui64vNV, glGetVertexAttribLi64vNV, glGetVertexAttribLui64vNV, glVertexAttribLFormatNV, glBufferAddressRangeNV, glVertexFormatNV, glNormalFormatNV, glColorFormatNV, glIndexFormatNV, glTexCoordFormatNV, glEdgeFlagFormatNV, glSecondaryColorFormatNV,
        glFogCoordFormatNV, glVertexAttribFormatNV, glVertexAttribIFormatNV, glGetIntegerui64i_vNV, glAreProgramsResidentNV, glBindProgramNV, glDeleteProgramsNV, glExecuteProgramNV, glGenProgramsNV, glGetProgramParameterdvNV, glGetProgramParameterfvNV, glGetProgramivNV, glGetProgramStringNV, glGetTrackMatrixivNV, glGetVertexAttribdvNV, glGetVertexAttribfvNV,
        glGetVertexAttribivNV, glGetVertexAttribPointervNV, glIsProgramNV, glLoadProgramNV, glProgramParameter4dNV, glProgramParameter4dvNV, glProgramParameter4fNV, glProgramParameter4fvNV, glProgramParameters4dvNV, glProgramParameters4fvNV, glRequestResidentProgramsNV, glTrackMatrixNV, glVertexAttribPointerNV, glVertexAttrib1dNV, glVertexAttrib1dvNV, glVertexAttrib1fNV,
        glVertexAttrib1fvNV, glVertexAttrib1sNV, glVertexAttrib1svNV, glVertexAttrib2dNV, glVertexAttrib2dvNV, glVertexAttrib2fNV, glVertexAttrib2fvNV, glVertexAttrib2sNV, glVertexAttrib2svNV, glVertexAttrib3dNV, glVertexAttrib3dvNV, glVertexAttrib3fNV, glVertexAttrib3fvNV, glVertexAttrib3sNV, glVertexAttrib3svNV, glVertexAttrib4dNV,
        glVertexAttrib4dvNV, glVertexAttrib4fNV, glVertexAttrib4fvNV, glVertexAttrib4sNV, glVertexAttrib4svNV, glVertexAttrib4ubNV, glVertexAttrib4ubvNV, glVertexAttribs1dvNV, glVertexAttribs1fvNV, glVertexAttribs1svNV, glVertexAttribs2dvNV, glVertexAttribs2fvNV, glVertexAttribs2svNV, glVertexAttribs3dvNV, glVertexAttribs3fvNV, glVertexAttribs3svNV,
        glVertexAttribs4dvNV, glVertexAttribs4fvNV, glVertexAttribs4svNV, glVertexAttribs4ubvNV, glBeginVideoCaptureNV, glBindVideoCaptureStreamBufferNV, glBindVideoCaptureStreamTextureNV, glEndVideoCaptureNV, glGetVideoCaptureivNV, glGetVideoCaptureStreamivNV, glGetVideoCaptureStreamfvNV, glGetVideoCaptureStreamdvNV, glVideoCaptureNV, glVideoCaptureStreamParameterivNV, glVideoCaptureStreamParameterfvNV, glVideoCaptureStreamParameterdvNV,
        glViewportSwizzleNV, glFramebufferTextureMultiviewOVR, glHintPGI, glDetailTexFuncSGIS, glGetDetailTexFuncSGIS, glFogFuncSGIS, glGetFogFuncSGIS, glSampleMaskSGIS, glSamplePatternSGIS, glPixelTexGenParameteriSGIS, glPixelTexGenParameterivSGIS, glPixelTexGenParameterfSGIS, glPixelTexGenParameterfvSGIS, glGetPixelTexGenParameterivSGIS, glGetPixelTexGenParameterfvSGIS, glPointParameterfSGIS,
        glPointParameterfvSGIS, glSharpenTexFuncSGIS, glGetSharpenTexFuncSGIS, glTexImage4DSGIS, glTexSubImage4DSGIS, glTextureColorMaskSGIS, glGetTexFilterFuncSGIS, glTexFilterFuncSGIS, glAsyncMarkerSGIX, glFinishAsyncSGIX, glPollAsyncSGIX, glGenAsyncMarkersSGIX, glDeleteAsyncMarkersSGIX, glIsAsyncMarkerSGIX, glFlushRasterSGIX, glFragmentColorMaterialSGIX,
        glFragmentLightfSGIX, glFragmentLightfvSGIX, glFragmentLightiSGIX, glFragmentLightivSGIX, glFragmentLightModelfSGIX, glFragmentLightModelfvSGIX, glFragmentLightModeliSGIX, glFragmentLightModelivSGIX, glFragmentMaterialfSGIX, glFragmentMaterialfvSGIX, glFragmentMaterialiSGIX, glFragmentMaterialivSGIX, glGetFragmentLightfvSGIX, glGetFragmentLightivSGIX, glGetFragmentMaterialfvSGIX, glGetFragmentMaterialivSGIX,
        glLightEnviSGIX, glFrameZoomSGIX, glIglooInterfaceSGIX, glGetInstrumentsSGIX, glInstrumentsBufferSGIX, glPollInstrumentsSGIX, glReadInstrumentsSGIX, glStartInstrumentsSGIX, glStopInstrumentsSGIX, glGetListParameterfvSGIX, glGetListParameterivSGIX, glListParameterfSGIX, glListParameterfvSGIX, glListParameteriSGIX, glListParameterivSGIX, glPixelTexGenSGIX,
        glDeformationMap3dSGIX, glDeformationMap3fSGIX, glDeformSGIX, glLoadIdentityDeformationMapSGIX, glReferencePlaneSGIX, glSpriteParameterfSGIX, glSpriteParameterfvSGIX, glSpriteParameteriSGIX, glSpriteParameterivSGIX, glTagSampleBufferSGIX, glColorTableSGI, glColorTableParameterfvSGI, glColorTableParameterivSGI, glCopyColorTableSGI, glGetColorTableSGI, glGetColorTableParameterfvSGI,
        glGetColorTableParameterivSGI, glFinishTextureSUNX, glGlobalAlphaFactorbSUN, glGlobalAlphaFactorsSUN, glGlobalAlphaFactoriSUN, glGlobalAlphaFactorfSUN, glGlobalAlphaFactordSUN, glGlobalAlphaFactorubSUN, glGlobalAlphaFactorusSUN, glGlobalAlphaFactoruiSUN, glDrawMeshArraysSUN, glReplacementCodeuiSUN, glReplacementCodeusSUN, glReplacementCodeubSUN, glReplacementCodeuivSUN, glReplacementCodeusvSUN,
        glReplacementCodeubvSUN, glReplacementCodePointerSUN, glColor4ubVertex2fSUN, glColor4ubVertex2fvSUN, glColor4ubVertex3fSUN, glColor4ubVertex3fvSUN, glColor3fVertex3fSUN, glColor3fVertex3fvSUN, glNormal3fVertex3fSUN, glNormal3fVertex3fvSUN, glColor4fNormal3fVertex3fSUN, glColor4fNormal3fVertex3fvSUN, glTexCoord2fVertex3fSUN, glTexCoord2fVertex3fvSUN, glTexCoord4fVertex4fSUN, glTexCoord4fVertex4fvSUN,
        glTexCoord2fColor4ubVertex3fSUN, glTexCoord2fColor4ubVertex3fvSUN, glTexCoord2fColor3fVertex3fSUN, glTexCoord2fColor3fVertex3fvSUN, glTexCoord2fNormal3fVertex3fSUN, glTexCoord2fNormal3fVertex3fvSUN, glTexCoord2fColor4fNormal3fVertex3fSUN, glTexCoord2fColor4fNormal3fVertex3fvSUN, glTexCoord4fColor4fNormal3fVertex4fSUN, glTexCoord4fColor4fNormal3fVertex4fvSUN, glReplacementCodeuiVertex3fSUN, glReplacementCodeuiVertex3fvSUN, glReplacementCodeuiColor4ubVertex3fSUN, glReplacementCodeuiColor4ubVertex3fvSUN, glReplacementCodeuiColor3fVertex3fSUN, glReplacementCodeuiColor3fVertex3fvSUN,
        glReplacementCodeuiNormal3fVertex3fSUN, glReplacementCodeuiNormal3fVertex3fvSUN, glReplacementCodeuiColor4fNormal3fVertex3fSUN, glReplacementCodeuiColor4fNormal3fVertex3fvSUN, glReplacementCodeuiTexCoord2fVertex3fSUN, glReplacementCodeuiTexCoord2fVertex3fvSUN, glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN, glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN, glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN, glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN;

    void load(GLLoadFunc load) {
        GLARBES32Compatibility.load(this, load);
        GLARBBindlessTexture.load(this, load);
        GLARBCLEvent.load(this, load);
        GLARBColorBufferFloat.load(this, load);
        GLARBComputeVariableGroupSize.load(this, load);
        GLARBDebugOutput.load(this, load);
        GLARBDrawBuffers.load(this, load);
        GLARBDrawBuffersBlend.load(this, load);
        GLARBDrawInstanced.load(this, load);
        GLARBFragmentProgram.load(this, load);
        GLARBGeometryShader4.load(this, load);
        GLARBGLSpirv.load(this, load);
        GLARBGpuShaderInt64.load(this, load);
        GLARBImaging.load(this, load);
        GLARBIndirectParameters.load(this, load);
        GLARBInstancedArrays.load(this, load);
        GLARBMatrixPalette.load(this, load);
        GLARBMultisample.load(this, load);
        GLARBMultitexture.load(this, load);
        GLARBOcclusionQuery.load(this, load);
        GLARBParallelShaderCompile.load(this, load);
        GLARBPointParameters.load(this, load);
        GLARBRobustness.load(this, load);
        GLARBSampleLocations.load(this, load);
        GLARBSampleShading.load(this, load);
        GLARBShaderObjects.load(this, load);
        GLARBShadingLanguageInclude.load(this, load);
        GLARBSparseBuffer.load(this, load);
        GLARBSparseTexture.load(this, load);
        GLARBTextureBufferObject.load(this, load);
        GLARBTextureCompression.load(this, load);
        GLARBTransposeMatrix.load(this, load);
        GLARBVertexBlend.load(this, load);
        GLARBVertexBufferObject.load(this, load);
        GLARBVertexProgram.load(this, load);
        GLARBVertexShader.load(this, load);
        GLARBViewportArray.load(this, load);
        GLARBWindowPos.load(this, load);
        GLKHRBlendEquationAdvanced.load(this, load);
        GLKHRParallelShaderCompile.load(this, load);
        GLOESByteCoordinates.load(this, load);
        GLOESFixedPoint.load(this, load);
        GLOESQueryMatrix.load(this, load);
        GLOESSinglePrecision.load(this, load);
        GL3DFXTbuffer.load(this, load);
        GLAMDDebugOutput.load(this, load);
        GLAMDDrawBuffersBlend.load(this, load);
        GLAMDFramebufferMultisampleAdvanced.load(this, load);
        GLAMDFramebufferSamplePositions.load(this, load);
        GLAMDGpuShaderInt64.load(this, load);
        GLAMDInterleavedElements.load(this, load);
        GLAMDMultiDrawIndirect.load(this, load);
        GLAMDNameGenDelete.load(this, load);
        GLAMDOcclusionQueryEvent.load(this, load);
        GLAMDPerformanceMonitor.load(this, load);
        GLAMDSamplePositions.load(this, load);
        GLAMDSparseTexture.load(this, load);
        GLAMDStencilOperationExtended.load(this, load);
        GLAMDVertexShaderTessellator.load(this, load);
        GLAPPLEElementArray.load(this, load);
        GLAPPLEFence.load(this, load);
        GLAPPLEFlushBufferRange.load(this, load);
        GLAPPLEObjectPurgeable.load(this, load);
        GLAPPLETextureRange.load(this, load);
        GLAPPLEVertexArrayObject.load(this, load);
        GLAPPLEVertexArrayRange.load(this, load);
        GLAPPLEVertexProgramEvaluators.load(this, load);
        GLATIDrawBuffers.load(this, load);
        GLATIElementArray.load(this, load);
        GLATIEnvmapBumpmap.load(this, load);
        GLATIFragmentShader.load(this, load);
        GLATIMapObjectBuffer.load(this, load);
        GLATIPnTriangles.load(this, load);
        GLATISeparateStencil.load(this, load);
        GLATIVertexArrayObject.load(this, load);
        GLATIVertexAttribArrayObject.load(this, load);
        GLATIVertexStreams.load(this, load);
        GLEXTEGLImageStorage.load(this, load);
        GLEXTBindableUniform.load(this, load);
        GLEXTBlendColor.load(this, load);
        GLEXTBlendEquationSeparate.load(this, load);
        GLEXTBlendFuncSeparate.load(this, load);
        GLEXTBlendMinmax.load(this, load);
        GLEXTColorSubtable.load(this, load);
        GLEXTCompiledVertexArray.load(this, load);
        GLEXTConvolution.load(this, load);
        GLEXTCoordinateFrame.load(this, load);
        GLEXTCopyTexture.load(this, load);
        GLEXTCullVertex.load(this, load);
        GLEXTDebugLabel.load(this, load);
        GLEXTDebugMarker.load(this, load);
        GLEXTDepthBoundsTest.load(this, load);
        GLEXTDirectStateAccess.load(this, load);
        GLEXTDrawBuffers2.load(this, load);
        GLEXTDrawInstanced.load(this, load);
        GLEXTDrawRangedElements.load(this, load);
        GLEXTExternalBuffer.load(this, load);
        GLEXTFogCoord.load(this, load);
        GLEXTFramebufferBlit.load(this, load);
        GLEXTFramebufferBlitLayers.load(this, load);
        GLEXTFramebufferMultisample.load(this, load);
        GLEXTFramebufferObject.load(this, load);
        GLEXTGeometryShader4.load(this, load);
        GLEXTGpuProgramParameters.load(this, load);
        GLEXTGpuShader4.load(this, load);
        GLEXTHistogram.load(this, load);
        GLEXTIndexFunc.load(this, load);
        GLEXTIndexMaterial.load(this, load);
        GLEXTLightTexture.load(this, load);
        GLEXTMemoryObject.load(this, load);
        GLEXTMemoryObjectFd.load(this, load);
        GLEXTMemoryObjectWin32.load(this, load);
        GLEXTMultiDrawArrays.load(this, load);
        GLEXTMultisample.load(this, load);
        GLEXTPalettedTexture.load(this, load);
        GLEXTPixelTransform.load(this, load);
        GLEXTPointParameters.load(this, load);
        GLEXTPolygonOffset.load(this, load);
        GLEXTPolygonOffsetClamp.load(this, load);
        GLEXTProvokingVertex.load(this, load);
        GLEXTRasterMultisample.load(this, load);
        GLEXTSecondaryColor.load(this, load);
        GLEXTSemaphore.load(this, load);
        GLEXTSemaphoreFd.load(this, load);
        GLEXTSemaphoreWin32.load(this, load);
        GLEXTSeparateShaderObjects.load(this, load);
        GLEXTShaderFramebufferFetchNonCoherent.load(this, load);
        GLEXTShaderImageLoadStore.load(this, load);
        GLEXTStencilClearTag.load(this, load);
        GLEXTStencilTwoSide.load(this, load);
        GLEXTSubtexture.load(this, load);
        GLEXTTexture3D.load(this, load);
        GLEXTTextureArray.load(this, load);
        GLEXTTextureBufferObject.load(this, load);
        GLEXTTextureInteger.load(this, load);
        GLEXTTextureObject.load(this, load);
        GLEXTTexturePerturbNormal.load(this, load);
        GLEXTTextureStorage.load(this, load);
        GLEXTTimerQuery.load(this, load);
        GLEXTTransformFeedback.load(this, load);
        GLEXTVertexArray.load(this, load);
        GLEXTVertexAttrib64bit.load(this, load);
        GLEXTVertexShader.load(this, load);
        GLEXTVertexWeighting.load(this, load);
        GLEXTWin32KeyedMutex.load(this, load);
        GLEXTWindowRectangles.load(this, load);
        GLEXTX11SyncObject.load(this, load);
        GLGREMEDYFrameTerminator.load(this, load);
        GLGREMEDYStringMarker.load(this, load);
        GLHPImageTransform.load(this, load);
        GLIBMMultimodeDrawArrays.load(this, load);
        GLIBMStaticData.load(this, load);
        GLIBMVertexArrayLists.load(this, load);
        GLINGRBlendFuncSeparate.load(this, load);
        GLINTELFramebufferCMAA.load(this, load);
        GLINTELMapTexture.load(this, load);
        GLINTELParallelArrays.load(this, load);
        GLINTELPerformanceQuery.load(this, load);
        GLMESAFramebufferFlipY.load(this, load);
        GLMESAResizeBuffers.load(this, load);
        GLMESAWindowPos.load(this, load);
        GLNVXConditionalRender.load(this, load);
        GLNVXGpuMulticast2.load(this, load);
        GLNVXLinkedGpuMulticast.load(this, load);
        GLNVXProgressFence.load(this, load);
        GLNVAlphaToCoverageDitherControl.load(this, load);
        GLNVBindlessMultiDrawIndirect.load(this, load);
        GLNVBindlessMultiDrawIndirectCount.load(this, load);
        GLNVBindlessTexture.load(this, load);
        GLNVBlendEquationAdvanced.load(this, load);
        GLNVClipSpaceWScaling.load(this, load);
        GLNVCommandList.load(this, load);
        GLNVConditionalRender.load(this, load);
        GLNVConservativeRaster.load(this, load);
        GLNVConservativeRasterDilate.load(this, load);
        GLNVConservativeRasterPreSnapTriangles.load(this, load);
        GLNVCopyImage.load(this, load);
        GLNVDepthBufferFloat.load(this, load);
        GLNVDrawTexture.load(this, load);
        GLNVDrawVulkanImage.load(this, load);
        GLNVEvaluators.load(this, load);
        GLNVExplicitMultisample.load(this, load);
        GLNVFence.load(this, load);
        GLNVFragmentCoverageToColor.load(this, load);
        GLNVFragmentProgram.load(this, load);
        GLNVFramebufferMixedSamples.load(this, load);
        GLNVFramebufferMultisampleCoverage.load(this, load);
        GLNVGeometryProgram4.load(this, load);
        GLNVGpuMulticast.load(this, load);
        GLNVGpuProgram4.load(this, load);
        GLNVGpuProgram5.load(this, load);
        GLNVHalfFloat.load(this, load);
        GLNVInternalformatSampleQuery.load(this, load);
        GLNVMemoryAttachment.load(this, load);
        GLNVMemoryObjectSparse.load(this, load);
        GLNVMeshShader.load(this, load);
        GLNVOcculusionQuery.load(this, load);
        GLNVParameterBufferObject.load(this, load);
        GLNVPathRendering.load(this, load);
        GLNVPixelDataRange.load(this, load);
        GLNVPointSprite.load(this, load);
        GLNVPresentVideo.load(this, load);
        GLNVPrimitiveRestart.load(this, load);
        GLNVQueryResource.load(this, load);
        GLNVQueryResourceTag.load(this, load);
        GLNVRegisterCombiners.load(this, load);
        GLNVRegisterCombiners2.load(this, load);
        GLNVSampleLocations.load(this, load);
        GLNVScissorExclusive.load(this, load);
        GLNVShaderBufferLoad.load(this, load);
        GLNVShadingRateImage.load(this, load);
        GLNVTextureBarrier.load(this, load);
        GLNVTextureMultisample.load(this, load);
        GLNVTimelineSemaphore.load(this, load);
        GLNVTransformFeedback.load(this, load);
        GLNVTransformFeedback2.load(this, load);
        GLNVVDPAUInterop.load(this, load);
        GLNVVDPAUInterop2.load(this, load);
        GLNVVertexArrayRange.load(this, load);
        GLNVVertexAttribInteger64bit.load(this, load);
        GLNVVertexBufferUnifiedMemory.load(this, load);
        GLNVVertexProgram.load(this, load);
        GLNVVideoCapture.load(this, load);
        GLNVViewportSwizzle.load(this, load);
        GLOVRMultiview.load(this, load);
        GLPGIMiscHints.load(this, load);
        GLSGISDetailTexture.load(this, load);
        GLSGISFogFunction.load(this, load);
        GLSGISMultisample.load(this, load);
        GLSGISPixelTexture.load(this, load);
        GLSGISPointParameters.load(this, load);
        GLSGISSharpenTexture.load(this, load);
        GLSGISTexture4D.load(this, load);
        GLSGISTextureColorMask.load(this, load);
        GLSGISTextureFilter4.load(this, load);
        GLSGIXAsync.load(this, load);
        GLSGIXFlushRaster.load(this, load);
        GLSGIXFragmentLighting.load(this, load);
        GLSGIXFramezoom.load(this, load);
        GLSGIXIglooInterface.load(this, load);
        GLSGIXInstruments.load(this, load);
        GLSGIXListPriority.load(this, load);
        GLSGIXPixelTexture.load(this, load);
        GLSGIXPolynomialFFD.load(this, load);
        GLSGIXReferencePlane.load(this, load);
        GLSGIXSprite.load(this, load);
        GLSGIXTagSampleBuffer.load(this, load);
        GLSGIColorTable.load(this, load);
        GLSUNXConstantData.load(this, load);
        GLSUNGlobalAlpha.load(this, load);
        GLSUNMeshArray.load(this, load);
        GLSUNTriangleList.load(this, load);
        GLSUNVertex.load(this, load);
    }

    boolean findExtensionsGL(int version, SegmentAllocator allocator) {
        var pExts = allocator.allocate(ADDRESS);
        var pNumExtsI = allocator.allocate(JAVA_INT);
        var pExtsI = new MemorySegment[1];
        if (!getExtensions(allocator, version, pExts, pNumExtsI, pExtsI, caps)) return false;

        String exts = pExts.getUtf8String(0);
        int numExtsI = pNumExtsI.get(JAVA_INT, 0);
        var extsI = pExtsI[0];

        this.GL_ARB_ES2_compatibility = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_ES2_compatibility");
        this.GL_ARB_ES3_1_compatibility = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_ES3_1_compatibility");
        this.GL_ARB_ES3_2_compatibility = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_ES3_2_compatibility");
        this.GL_ARB_ES3_compatibility = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_ES3_compatibility");
        this.GL_ARB_arrays_of_arrays = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_arrays_of_arrays");
        this.GL_ARB_base_instance = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_base_instance");
        this.GL_ARB_bindless_texture = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_bindless_texture");
        this.GL_ARB_blend_func_extended = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_blend_func_extended");
        this.GL_ARB_buffer_storage = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_buffer_storage");
        this.GL_ARB_cl_event = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_cl_event");
        this.GL_ARB_clear_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_clear_buffer_object");
        this.GL_ARB_clear_texture = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_clear_texture");
        this.GL_ARB_clip_control = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_clip_control");
        this.GL_ARB_color_buffer_float = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_color_buffer_float");
        this.GL_ARB_compatibility = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_compatibility");
        this.GL_ARB_compressed_texture_pixel_storage = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_compressed_texture_pixel_storage");
        this.GL_ARB_compute_shader = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_compute_shader");
        this.GL_ARB_compute_variable_group_size = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_compute_variable_group_size");
        this.GL_ARB_conditional_render_inverted = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_conditional_render_inverted");
        this.GL_ARB_conservative_depth = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_conservative_depth");
        this.GL_ARB_copy_buffer = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_copy_buffer");
        this.GL_ARB_copy_image = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_copy_image");
        this.GL_ARB_cull_distance = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_cull_distance");
        this.GL_ARB_debug_output = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_debug_output");
        this.GL_ARB_depth_buffer_float = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_depth_buffer_float");
        this.GL_ARB_depth_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_depth_clamp");
        this.GL_ARB_depth_texture = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_depth_texture");
        this.GL_ARB_derivative_control = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_derivative_control");
        this.GL_ARB_direct_state_access = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_direct_state_access");
        this.GL_ARB_draw_buffers = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_draw_buffers");
        this.GL_ARB_draw_buffers_blend = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_draw_buffers_blend");
        this.GL_ARB_draw_elements_base_vertex = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_draw_elements_base_vertex");
        this.GL_ARB_draw_indirect = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_draw_indirect");
        this.GL_ARB_draw_instanced = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_draw_instanced");
        this.GL_ARB_enhanced_layouts = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_enhanced_layouts");
        this.GL_ARB_explicit_attrib_location = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_explicit_attrib_location");
        this.GL_ARB_explicit_uniform_location = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_explicit_uniform_location");
        this.GL_ARB_fragment_coord_conventions = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_fragment_coord_conventions");
        this.GL_ARB_fragment_layer_viewport = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_fragment_layer_viewport");
        this.GL_ARB_fragment_program = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_fragment_program");
        this.GL_ARB_fragment_program_shadow = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_fragment_program_shadow");
        this.GL_ARB_fragment_shader = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_fragment_shader");
        this.GL_ARB_fragment_shader_interlock = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_fragment_shader_interlock");
        this.GL_ARB_framebuffer_no_attachments = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_framebuffer_no_attachments");
        this.GL_ARB_framebuffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_framebuffer_object");
        this.GL_ARB_framebuffer_sRGB = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_framebuffer_sRGB");
        this.GL_ARB_geometry_shader4 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_geometry_shader4");
        this.GL_ARB_get_program_binary = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_get_program_binary");
        this.GL_ARB_get_texture_sub_image = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_get_texture_sub_image");
        this.GL_ARB_gl_spirv = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_gl_spirv");
        this.GL_ARB_gpu_shader5 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_gpu_shader5");
        this.GL_ARB_gpu_shader_fp64 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_gpu_shader_fp64");
        this.GL_ARB_gpu_shader_int64 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_gpu_shader_int64");
        this.GL_ARB_half_float_pixel = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_half_float_pixel");
        this.GL_ARB_half_float_vertex = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_half_float_vertex");
        this.GL_ARB_imaging = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_imaging");
        this.GL_ARB_indirect_parameters = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_indirect_parameters");
        this.GL_ARB_instanced_arrays = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_instanced_arrays");
        this.GL_ARB_internalformat_query = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_internalformat_query");
        this.GL_ARB_internalformat_query2 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_internalformat_query2");
        this.GL_ARB_invalidate_subdata = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_invalidate_subdata");
        this.GL_ARB_map_buffer_alignment = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_map_buffer_alignment");
        this.GL_ARB_map_buffer_range = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_map_buffer_range");
        this.GL_ARB_matrix_palette = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_matrix_palette");
        this.GL_ARB_multi_bind = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_multi_bind");
        this.GL_ARB_multi_draw_indirect = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_multi_draw_indirect");
        this.GL_ARB_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_multisample");
        this.GL_ARB_multitexture = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_multitexture");
        this.GL_ARB_occlusion_query = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_occlusion_query");
        this.GL_ARB_occlusion_query2 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_occlusion_query2");
        this.GL_ARB_parallel_shader_compile = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_parallel_shader_compile");
        this.GL_ARB_pipeline_statistics_query = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_pipeline_statistics_query");
        this.GL_ARB_pixel_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_pixel_buffer_object");
        this.GL_ARB_point_parameters = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_point_parameters");
        this.GL_ARB_point_sprite = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_point_sprite");
        this.GL_ARB_polygon_offset_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_polygon_offset_clamp");
        this.GL_ARB_post_depth_coverage = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_post_depth_coverage");
        this.GL_ARB_program_interface_query = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_program_interface_query");
        this.GL_ARB_provoking_vertex = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_provoking_vertex");
        this.GL_ARB_query_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_query_buffer_object");
        this.GL_ARB_robust_buffer_access_behavior = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_robust_buffer_access_behavior");
        this.GL_ARB_robustness = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_robustness");
        this.GL_ARB_robustness_isolation = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_robustness_isolation");
        this.GL_ARB_sample_locations = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_sample_locations");
        this.GL_ARB_sample_shading = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_sample_shading");
        this.GL_ARB_sampler_objects = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_sampler_objects");
        this.GL_ARB_seamless_cube_map = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_seamless_cube_map");
        this.GL_ARB_seamless_cubemap_per_texture = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_seamless_cubemap_per_texture");
        this.GL_ARB_separate_shader_objects = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_separate_shader_objects");
        this.GL_ARB_shader_atomic_counter_ops = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_atomic_counter_ops");
        this.GL_ARB_shader_atomic_counters = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_atomic_counters");
        this.GL_ARB_shader_ballot = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_ballot");
        this.GL_ARB_shader_bit_encoding = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_bit_encoding");
        this.GL_ARB_shader_clock = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_clock");
        this.GL_ARB_shader_draw_parameters = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_draw_parameters");
        this.GL_ARB_shader_group_vote = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_group_vote");
        this.GL_ARB_shader_image_load_store = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_image_load_store");
        this.GL_ARB_shader_image_size = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_image_size");
        this.GL_ARB_shader_objects = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_objects");
        this.GL_ARB_shader_precision = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_precision");
        this.GL_ARB_shader_stencil_export = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_stencil_export");
        this.GL_ARB_shader_storage_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_storage_buffer_object");
        this.GL_ARB_shader_subroutine = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_subroutine");
        this.GL_ARB_shader_texture_image_samples = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_texture_image_samples");
        this.GL_ARB_shader_texture_lod = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_texture_lod");
        this.GL_ARB_shader_viewport_layer_array = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shader_viewport_layer_array");
        this.GL_ARB_shading_language_100 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shading_language_100");
        this.GL_ARB_shading_language_420pack = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shading_language_420pack");
        this.GL_ARB_shading_language_include = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shading_language_include");
        this.GL_ARB_shading_language_packing = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shading_language_packing");
        this.GL_ARB_shadow = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shadow");
        this.GL_ARB_shadow_ambient = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_shadow_ambient");
        this.GL_ARB_sparse_buffer = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_sparse_buffer");
        this.GL_ARB_sparse_texture = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_sparse_texture");
        this.GL_ARB_sparse_texture2 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_sparse_texture2");
        this.GL_ARB_sparse_texture_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_sparse_texture_clamp");
        this.GL_ARB_spirv_extensions = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_spirv_extensions");
        this.GL_ARB_stencil_texturing = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_stencil_texturing");
        this.GL_ARB_sync = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_sync");
        this.GL_ARB_tessellation_shader = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_tessellation_shader");
        this.GL_ARB_texture_barrier = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_barrier");
        this.GL_ARB_texture_border_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_border_clamp");
        this.GL_ARB_texture_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_buffer_object");
        this.GL_ARB_texture_buffer_object_rgb32 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_buffer_object_rgb32");
        this.GL_ARB_texture_buffer_range = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_buffer_range");
        this.GL_ARB_texture_compression = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_compression");
        this.GL_ARB_texture_compression_bptc = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_compression_bptc");
        this.GL_ARB_texture_compression_rgtc = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_compression_rgtc");
        this.GL_ARB_texture_cube_map = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_cube_map");
        this.GL_ARB_texture_cube_map_array = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_cube_map_array");
        this.GL_ARB_texture_env_add = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_env_add");
        this.GL_ARB_texture_env_combine = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_env_combine");
        this.GL_ARB_texture_env_crossbar = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_env_crossbar");
        this.GL_ARB_texture_env_dot3 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_env_dot3");
        this.GL_ARB_texture_filter_anisotropic = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_filter_anisotropic");
        this.GL_ARB_texture_filter_minmax = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_filter_minmax");
        this.GL_ARB_texture_float = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_float");
        this.GL_ARB_texture_gather = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_gather");
        this.GL_ARB_texture_mirror_clamp_to_edge = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_mirror_clamp_to_edge");
        this.GL_ARB_texture_mirrored_repeat = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_mirrored_repeat");
        this.GL_ARB_texture_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_multisample");
        this.GL_ARB_texture_non_power_of_two = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_non_power_of_two");
        this.GL_ARB_texture_query_levels = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_query_levels");
        this.GL_ARB_texture_query_lod = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_query_lod");
        this.GL_ARB_texture_rectangle = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_rectangle");
        this.GL_ARB_texture_rg = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_rg");
        this.GL_ARB_texture_rgb10_a2ui = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_rgb10_a2ui");
        this.GL_ARB_texture_stencil8 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_stencil8");
        this.GL_ARB_texture_storage = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_storage");
        this.GL_ARB_texture_storage_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_storage_multisample");
        this.GL_ARB_texture_swizzle = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_swizzle");
        this.GL_ARB_texture_view = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_texture_view");
        this.GL_ARB_timer_query = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_timer_query");
        this.GL_ARB_transform_feedback2 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_transform_feedback2");
        this.GL_ARB_transform_feedback3 = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_transform_feedback3");
        this.GL_ARB_transform_feedback_instanced = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_transform_feedback_instanced");
        this.GL_ARB_transform_feedback_overflow_query = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_transform_feedback_overflow_query");
        this.GL_ARB_transpose_matrix = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_transpose_matrix");
        this.GL_ARB_uniform_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_uniform_buffer_object");
        this.GL_ARB_vertex_array_bgra = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_array_bgra");
        this.GL_ARB_vertex_array_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_array_object");
        this.GL_ARB_vertex_attrib_64bit = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_attrib_64bit");
        this.GL_ARB_vertex_attrib_binding = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_attrib_binding");
        this.GL_ARB_vertex_blend = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_blend");
        this.GL_ARB_vertex_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_buffer_object");
        this.GL_ARB_vertex_program = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_program");
        this.GL_ARB_vertex_shader = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_shader");
        this.GL_ARB_vertex_type_10f_11f_11f_rev = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_type_10f_11f_11f_rev");
        this.GL_ARB_vertex_type_2_10_10_10_rev = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_vertex_type_2_10_10_10_rev");
        this.GL_ARB_viewport_array = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_viewport_array");
        this.GL_ARB_window_pos = hasExtension(version, exts, numExtsI, extsI, "GL_ARB_window_pos");
        this.GL_KHR_blend_equation_advanced = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_blend_equation_advanced");
        this.GL_KHR_blend_equation_advanced_coherent = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_blend_equation_advanced_coherent");
        this.GL_KHR_context_flush_control = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_context_flush_control");
        this.GL_KHR_debug = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_debug");
        this.GL_KHR_no_error = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_no_error");
        this.GL_KHR_parallel_shader_compile = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_parallel_shader_compile");
        this.GL_KHR_robust_buffer_access_behavior = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_robust_buffer_access_behavior");
        this.GL_KHR_robustness = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_robustness");
        this.GL_KHR_shader_subgroup = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_shader_subgroup");
        this.GL_KHR_texture_compression_astc_hdr = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_texture_compression_astc_hdr");
        this.GL_KHR_texture_compression_astc_ldr = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_texture_compression_astc_ldr");
        this.GL_KHR_texture_compression_astc_sliced_3d = hasExtension(version, exts, numExtsI, extsI, "GL_KHR_texture_compression_astc_sliced_3d");
        this.GL_OES_byte_coordinates = hasExtension(version, exts, numExtsI, extsI, "GL_OES_byte_coordinates");
        this.GL_OES_compressed_paletted_texture = hasExtension(version, exts, numExtsI, extsI, "GL_OES_compressed_paletted_texture");
        this.GL_OES_fixed_point = hasExtension(version, exts, numExtsI, extsI, "GL_OES_fixed_point");
        this.GL_OES_query_matrix = hasExtension(version, exts, numExtsI, extsI, "GL_OES_query_matrix");
        this.GL_OES_read_format = hasExtension(version, exts, numExtsI, extsI, "GL_OES_read_format");
        this.GL_OES_single_precision = hasExtension(version, exts, numExtsI, extsI, "GL_OES_single_precision");
        this.GL_3DFX_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_3DFX_multisample");
        this.GL_3DFX_tbuffer = hasExtension(version, exts, numExtsI, extsI, "GL_3DFX_tbuffer");
        this.GL_3DFX_texture_compression_FXT1 = hasExtension(version, exts, numExtsI, extsI, "GL_3DFX_texture_compression_FXT1");
        this.GL_AMD_blend_minmax_factor = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_blend_minmax_factor");
        this.GL_AMD_conservative_depth = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_conservative_depth");
        this.GL_AMD_debug_output = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_debug_output");
        this.GL_AMD_depth_clamp_separate = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_depth_clamp_separate");
        this.GL_AMD_draw_buffers_blend = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_draw_buffers_blend");
        this.GL_AMD_framebuffer_multisample_advanced = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_framebuffer_multisample_advanced");
        this.GL_AMD_framebuffer_sample_positions = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_framebuffer_sample_positions");
        this.GL_AMD_gcn_shader = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_gcn_shader");
        this.GL_AMD_gpu_shader_half_float = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_gpu_shader_half_float");
        this.GL_AMD_gpu_shader_int16 = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_gpu_shader_int16");
        this.GL_AMD_gpu_shader_int64 = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_gpu_shader_int64");
        this.GL_AMD_interleaved_elements = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_interleaved_elements");
        this.GL_AMD_multi_draw_indirect = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_multi_draw_indirect");
        this.GL_AMD_name_gen_delete = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_name_gen_delete");
        this.GL_AMD_occlusion_query_event = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_occlusion_query_event");
        this.GL_AMD_performance_monitor = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_performance_monitor");
        this.GL_AMD_pinned_memory = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_pinned_memory");
        this.GL_AMD_query_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_query_buffer_object");
        this.GL_AMD_sample_positions = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_sample_positions");
        this.GL_AMD_seamless_cubemap_per_texture = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_seamless_cubemap_per_texture");
        this.GL_AMD_shader_atomic_counter_ops = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_shader_atomic_counter_ops");
        this.GL_AMD_shader_ballot = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_shader_ballot");
        this.GL_AMD_shader_explicit_vertex_parameter = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_shader_explicit_vertex_parameter");
        this.GL_AMD_shader_gpu_shader_half_float_fetch = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_shader_gpu_shader_half_float_fetch");
        this.GL_AMD_shader_image_load_store_lod = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_shader_image_load_store_lod");
        this.GL_AMD_shader_stencil_export = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_shader_stencil_export");
        this.GL_AMD_shader_trinary_minmax = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_shader_trinary_minmax");
        this.GL_AMD_sparse_texture = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_sparse_texture");
        this.GL_AMD_stencil_operation_extended = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_stencil_operation_extended");
        this.GL_AMD_texture_gather_bias_lod = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_texture_gather_bias_lod");
        this.GL_AMD_texture_texture4 = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_texture_texture4");
        this.GL_AMD_transform_feedback3_lines_triangles = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_transform_feedback3_lines_triangles");
        this.GL_AMD_transform_feedback4 = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_transform_feedback4");
        this.GL_AMD_vertex_shader_layer = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_vertex_shader_layer");
        this.GL_AMD_vertex_shader_tessellator = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_vertex_shader_tessellator");
        this.GL_AMD_vertex_shader_viewport_index = hasExtension(version, exts, numExtsI, extsI, "GL_AMD_vertex_shader_viewport_index");
        this.GL_APPLE_aux_depth_stencil = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_aux_depth_stencil");
        this.GL_APPLE_client_storage = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_client_storage");
        this.GL_APPLE_element_array = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_element_array");
        this.GL_APPLE_fence = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_fence");
        this.GL_APPLE_float_pixels = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_float_pixels");
        this.GL_APPLE_flush_buffer_range = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_flush_buffer_range");
        this.GL_APPLE_object_purgeable = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_object_purgeable");
        this.GL_APPLE_rgb_422 = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_rgb_422");
        this.GL_APPLE_row_bytes = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_row_bytes");
        this.GL_APPLE_specular_vector = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_specular_vector");
        this.GL_APPLE_texture_range = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_texture_range");
        this.GL_APPLE_transform_hint = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_transform_hint");
        this.GL_APPLE_vertex_array_object = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_vertex_array_object");
        this.GL_APPLE_vertex_array_range = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_vertex_array_range");
        this.GL_APPLE_vertex_program_evaluators = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_vertex_program_evaluators");
        this.GL_APPLE_ycbcr_422 = hasExtension(version, exts, numExtsI, extsI, "GL_APPLE_ycbcr_422");
        this.GL_ATI_draw_buffers = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_draw_buffers");
        this.GL_ATI_element_array = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_element_array");
        this.GL_ATI_envmap_bumpmap = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_envmap_bumpmap");
        this.GL_ATI_fragment_shader = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_fragment_shader");
        this.GL_ATI_map_object_buffer = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_map_object_buffer");
        this.GL_ATI_meminfo = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_meminfo");
        this.GL_ATI_pixel_format_float = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_pixel_format_float");
        this.GL_ATI_pn_triangles = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_pn_triangles");
        this.GL_ATI_separate_stencil = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_separate_stencil");
        this.GL_ATI_text_fragment_shader = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_text_fragment_shader");
        this.GL_ATI_texture_env_combine3 = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_texture_env_combine3");
        this.GL_ATI_texture_float = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_texture_float");
        this.GL_ATI_texture_mirror_once = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_texture_mirror_once");
        this.GL_ATI_vertex_array_object = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_vertex_array_object");
        this.GL_ATI_vertex_attrib_array_object = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_vertex_attrib_array_object");
        this.GL_ATI_vertex_streams = hasExtension(version, exts, numExtsI, extsI, "GL_ATI_vertex_streams");
        this.GL_EXT_422_pixels = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_422_pixels");
        this.GL_EXT_EGL_image_storage = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_EGL_image_storage");
        this.GL_EXT_EGL_sync = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_EGL_sync");
        this.GL_EXT_abgr = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_abgr");
        this.GL_EXT_bgra = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_bgra");
        this.GL_EXT_bindable_uniform = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_bindable_uniform");
        this.GL_EXT_blend_color = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_blend_color");
        this.GL_EXT_blend_equation_separate = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_blend_equation_separate");
        this.GL_EXT_blend_func_separate = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_blend_func_separate");
        this.GL_EXT_blend_logic_op = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_blend_logic_op");
        this.GL_EXT_blend_minmax = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_blend_minmax");
        this.GL_EXT_blend_subtract = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_blend_subtract");
        this.GL_EXT_clip_volume_hint = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_clip_volume_hint");
        this.GL_EXT_cmyka = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_cmyka");
        this.GL_EXT_color_subtable = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_color_subtable");
        this.GL_EXT_compiled_vertex_array = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_compiled_vertex_array");
        this.GL_EXT_convolution = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_convolution");
        this.GL_EXT_coordinate_frame = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_coordinate_frame");
        this.GL_EXT_copy_texture = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_copy_texture");
        this.GL_EXT_cull_vertex = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_cull_vertex");
        this.GL_EXT_debug_label = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_debug_label");
        this.GL_EXT_debug_marker = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_debug_marker");
        this.GL_EXT_depth_bounds_test = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_depth_bounds_test");
        this.GL_EXT_direct_state_access = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_direct_state_access");
        this.GL_EXT_draw_buffers2 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_draw_buffers2");
        this.GL_EXT_draw_instanced = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_draw_instanced");
        this.GL_EXT_draw_range_elements = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_draw_range_elements");
        this.GL_EXT_external_buffer = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_external_buffer");
        this.GL_EXT_fog_coord = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_fog_coord");
        this.GL_EXT_framebuffer_blit = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_framebuffer_blit");
        this.GL_EXT_framebuffer_blit_layers = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_framebuffer_blit_layers");
        this.GL_EXT_framebuffer_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_framebuffer_multisample");
        this.GL_EXT_framebuffer_multisample_blit_scaled = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_framebuffer_multisample_blit_scaled");
        this.GL_EXT_framebuffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_framebuffer_object");
        this.GL_EXT_framebuffer_sRGB = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_framebuffer_sRGB");
        this.GL_EXT_geometry_shader4 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_geometry_shader4");
        this.GL_EXT_gpu_program_parameters = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_gpu_program_parameters");
        this.GL_EXT_gpu_shader4 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_gpu_shader4");
        this.GL_EXT_histogram = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_histogram");
        this.GL_EXT_index_array_formats = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_index_array_formats");
        this.GL_EXT_index_func = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_index_func");
        this.GL_EXT_index_material = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_index_material");
        this.GL_EXT_index_texture = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_index_texture");
        this.GL_EXT_light_texture = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_light_texture");
        this.GL_EXT_memory_object = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_memory_object");
        this.GL_EXT_memory_object_fd = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_memory_object_fd");
        this.GL_EXT_memory_object_win32 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_memory_object_win32");
        this.GL_EXT_misc_attribute = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_misc_attribute");
        this.GL_EXT_multi_draw_arrays = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_multi_draw_arrays");
        this.GL_EXT_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_multisample");
        this.GL_EXT_multiview_tessellation_geometry_shader = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_multiview_tessellation_geometry_shader");
        this.GL_EXT_multiview_texture_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_multiview_texture_multisample");
        this.GL_EXT_multiview_timer_query = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_multiview_timer_query");
        this.GL_EXT_packed_depth_stencil = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_packed_depth_stencil");
        this.GL_EXT_packed_float = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_packed_float");
        this.GL_EXT_packed_pixels = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_packed_pixels");
        this.GL_EXT_paletted_texture = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_paletted_texture");
        this.GL_EXT_pixel_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_pixel_buffer_object");
        this.GL_EXT_pixel_transform = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_pixel_transform");
        this.GL_EXT_pixel_transform_color_table = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_pixel_transform_color_table");
        this.GL_EXT_point_parameters = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_point_parameters");
        this.GL_EXT_polygon_offset = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_polygon_offset");
        this.GL_EXT_polygon_offset_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_polygon_offset_clamp");
        this.GL_EXT_post_depth_coverage = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_post_depth_coverage");
        this.GL_EXT_provoking_vertex = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_provoking_vertex");
        this.GL_EXT_raster_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_raster_multisample");
        this.GL_EXT_rescale_normal = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_rescale_normal");
        this.GL_EXT_secondary_color = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_secondary_color");
        this.GL_EXT_semaphore = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_semaphore");
        this.GL_EXT_semaphore_fd = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_semaphore_fd");
        this.GL_EXT_semaphore_win32 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_semaphore_win32");
        this.GL_EXT_separate_shader_objects = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_separate_shader_objects");
        this.GL_EXT_separate_specular_color = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_separate_specular_color");
        this.GL_EXT_shader_framebuffer_fetch = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_shader_framebuffer_fetch");
        this.GL_EXT_shader_framebuffer_fetch_non_coherent = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_shader_framebuffer_fetch_non_coherent");
        this.GL_EXT_shader_image_load_formatted = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_shader_image_load_formatted");
        this.GL_EXT_shader_image_load_store = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_shader_image_load_store");
        this.GL_EXT_shader_integer_mix = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_shader_integer_mix");
        this.GL_EXT_shader_samples_identical = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_shader_samples_identical");
        this.GL_EXT_shadow_funcs = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_shadow_funcs");
        this.GL_EXT_shared_texture_palette = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_shared_texture_palette");
        this.GL_EXT_sparse_texture2 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_sparse_texture2");
        this.GL_EXT_stencil_clear_tag = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_stencil_clear_tag");
        this.GL_EXT_stencil_two_side = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_stencil_two_side");
        this.GL_EXT_stencil_wrap = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_stencil_wrap");
        this.GL_EXT_subtexture = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_subtexture");
        this.GL_EXT_texture = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture");
        this.GL_EXT_texture3D = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture3D");
        this.GL_EXT_texture_array = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_array");
        this.GL_EXT_texture_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_buffer_object");
        this.GL_EXT_texture_compression_latc = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_compression_latc");
        this.GL_EXT_texture_compression_rgtc = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_compression_rgtc");
        this.GL_EXT_texture_compression_s3tc = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_compression_s3tc");
        this.GL_EXT_texture_cube_map = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_cube_map");
        this.GL_EXT_texture_env_add = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_env_add");
        this.GL_EXT_texture_env_combine = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_env_combine");
        this.GL_EXT_texture_env_dot3 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_env_dot3");
        this.GL_EXT_texture_filter_anisotropic = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_filter_anisotropic");
        this.GL_EXT_texture_filter_minmax = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_filter_minmax");
        this.GL_EXT_texture_integer = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_integer");
        this.GL_EXT_texture_lod_bias = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_lod_bias");
        this.GL_EXT_texture_mirror_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_mirror_clamp");
        this.GL_EXT_texture_object = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_object");
        this.GL_EXT_texture_perturb_normal = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_perturb_normal");
        this.GL_EXT_texture_sRGB = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_sRGB");
        this.GL_EXT_texture_sRGB_R8 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_sRGB_R8");
        this.GL_EXT_texture_sRGB_RG8 = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_sRGB_RG8");
        this.GL_EXT_texture_sRGB_decode = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_sRGB_decode");
        this.GL_EXT_texture_shadow_lod = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_shadow_lod");
        this.GL_EXT_texture_shared_exponent = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_shared_exponent");
        this.GL_EXT_texture_snorm = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_snorm");
        this.GL_EXT_texture_storage = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_storage");
        this.GL_EXT_texture_swizzle = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_texture_swizzle");
        this.GL_EXT_timer_query = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_timer_query");
        this.GL_EXT_transform_feedback = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_transform_feedback");
        this.GL_EXT_vertex_array = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_vertex_array");
        this.GL_EXT_vertex_array_bgra = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_vertex_array_bgra");
        this.GL_EXT_vertex_attrib_64bit = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_vertex_attrib_64bit");
        this.GL_EXT_vertex_shader = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_vertex_shader");
        this.GL_EXT_vertex_weighting = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_vertex_weighting");
        this.GL_EXT_win32_keyed_mutex = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_win32_keyed_mutex");
        this.GL_EXT_window_rectangles = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_window_rectangles");
        this.GL_EXT_x11_sync_object = hasExtension(version, exts, numExtsI, extsI, "GL_EXT_x11_sync_object");
        this.GL_GREMEDY_frame_terminator = hasExtension(version, exts, numExtsI, extsI, "GL_GREMEDY_frame_terminator");
        this.GL_GREMEDY_string_marker = hasExtension(version, exts, numExtsI, extsI, "GL_GREMEDY_string_marker");
        this.GL_HP_convolution_border_modes = hasExtension(version, exts, numExtsI, extsI, "GL_HP_convolution_border_modes");
        this.GL_HP_image_transform = hasExtension(version, exts, numExtsI, extsI, "GL_HP_image_transform");
        this.GL_HP_occlusion_test = hasExtension(version, exts, numExtsI, extsI, "GL_HP_occlusion_test");
        this.GL_HP_texture_lighting = hasExtension(version, exts, numExtsI, extsI, "GL_HP_texture_lighting");
        this.GL_IBM_cull_vertex = hasExtension(version, exts, numExtsI, extsI, "GL_IBM_cull_vertex");
        this.GL_IBM_multimode_draw_arrays = hasExtension(version, exts, numExtsI, extsI, "GL_IBM_multimode_draw_arrays");
        this.GL_IBM_rasterpos_clip = hasExtension(version, exts, numExtsI, extsI, "GL_IBM_rasterpos_clip");
        this.GL_IBM_static_data = hasExtension(version, exts, numExtsI, extsI, "GL_IBM_static_data");
        this.GL_IBM_texture_mirrored_repeat = hasExtension(version, exts, numExtsI, extsI, "GL_IBM_texture_mirrored_repeat");
        this.GL_IBM_vertex_array_lists = hasExtension(version, exts, numExtsI, extsI, "GL_IBM_vertex_array_lists");
        this.GL_INGR_blend_func_separate = hasExtension(version, exts, numExtsI, extsI, "GL_INGR_blend_func_separate");
        this.GL_INGR_color_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_INGR_color_clamp");
        this.GL_INGR_interlace_read = hasExtension(version, exts, numExtsI, extsI, "GL_INGR_interlace_read");
        this.GL_INTEL_blackhole_render = hasExtension(version, exts, numExtsI, extsI, "GL_INTEL_blackhole_render");
        this.GL_INTEL_conservative_rasterization = hasExtension(version, exts, numExtsI, extsI, "GL_INTEL_conservative_rasterization");
        this.GL_INTEL_fragment_shader_ordering = hasExtension(version, exts, numExtsI, extsI, "GL_INTEL_fragment_shader_ordering");
        this.GL_INTEL_framebuffer_CMAA = hasExtension(version, exts, numExtsI, extsI, "GL_INTEL_framebuffer_CMAA");
        this.GL_INTEL_map_texture = hasExtension(version, exts, numExtsI, extsI, "GL_INTEL_map_texture");
        this.GL_INTEL_parallel_arrays = hasExtension(version, exts, numExtsI, extsI, "GL_INTEL_parallel_arrays");
        this.GL_INTEL_performance_query = hasExtension(version, exts, numExtsI, extsI, "GL_INTEL_performance_query");
        this.GL_MESAX_texture_stack = hasExtension(version, exts, numExtsI, extsI, "GL_MESAX_texture_stack");
        this.GL_MESA_framebuffer_flip_x = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_framebuffer_flip_x");
        this.GL_MESA_framebuffer_flip_y = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_framebuffer_flip_y");
        this.GL_MESA_framebuffer_swap_xy = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_framebuffer_swap_xy");
        this.GL_MESA_pack_invert = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_pack_invert");
        this.GL_MESA_program_binary_formats = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_program_binary_formats");
        this.GL_MESA_resize_buffers = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_resize_buffers");
        this.GL_MESA_shader_integer_functions = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_shader_integer_functions");
        this.GL_MESA_tile_raster_order = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_tile_raster_order");
        this.GL_MESA_window_pos = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_window_pos");
        this.GL_MESA_ycbcr_texture = hasExtension(version, exts, numExtsI, extsI, "GL_MESA_ycbcr_texture");
        this.GL_NVX_blend_equation_advanced_multi_draw_buffers = hasExtension(version, exts, numExtsI, extsI, "GL_NVX_blend_equation_advanced_multi_draw_buffers");
        this.GL_NVX_conditional_render = hasExtension(version, exts, numExtsI, extsI, "GL_NVX_conditional_render");
        this.GL_NVX_gpu_memory_info = hasExtension(version, exts, numExtsI, extsI, "GL_NVX_gpu_memory_info");
        this.GL_NVX_gpu_multicast2 = hasExtension(version, exts, numExtsI, extsI, "GL_NVX_gpu_multicast2");
        this.GL_NVX_linked_gpu_multicast = hasExtension(version, exts, numExtsI, extsI, "GL_NVX_linked_gpu_multicast");
        this.GL_NVX_progress_fence = hasExtension(version, exts, numExtsI, extsI, "GL_NVX_progress_fence");
        this.GL_NV_alpha_to_coverage_dither_control = hasExtension(version, exts, numExtsI, extsI, "GL_NV_alpha_to_coverage_dither_control");
        this.GL_NV_bindless_multi_draw_indirect = hasExtension(version, exts, numExtsI, extsI, "GL_NV_bindless_multi_draw_indirect");
        this.GL_NV_bindless_multi_draw_indirect_count = hasExtension(version, exts, numExtsI, extsI, "GL_NV_bindless_multi_draw_indirect_count");
        this.GL_NV_bindless_texture = hasExtension(version, exts, numExtsI, extsI, "GL_NV_bindless_texture");
        this.GL_NV_blend_equation_advanced = hasExtension(version, exts, numExtsI, extsI, "GL_NV_blend_equation_advanced");
        this.GL_NV_blend_equation_advanced_coherent = hasExtension(version, exts, numExtsI, extsI, "GL_NV_blend_equation_advanced_coherent");
        this.GL_NV_blend_minmax_factor = hasExtension(version, exts, numExtsI, extsI, "GL_NV_blend_minmax_factor");
        this.GL_NV_blend_square = hasExtension(version, exts, numExtsI, extsI, "GL_NV_blend_square");
        this.GL_NV_clip_space_w_scaling = hasExtension(version, exts, numExtsI, extsI, "GL_NV_clip_space_w_scaling");
        this.GL_NV_command_list = hasExtension(version, exts, numExtsI, extsI, "GL_NV_command_list");
        this.GL_NV_compute_program5 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_compute_program5");
        this.GL_NV_compute_shader_derivatives = hasExtension(version, exts, numExtsI, extsI, "GL_NV_compute_shader_derivatives");
        this.GL_NV_conditional_render = hasExtension(version, exts, numExtsI, extsI, "GL_NV_conditional_render");
        this.GL_NV_conservative_raster = hasExtension(version, exts, numExtsI, extsI, "GL_NV_conservative_raster");
        this.GL_NV_conservative_raster_dilate = hasExtension(version, exts, numExtsI, extsI, "GL_NV_conservative_raster_dilate");
        this.GL_NV_conservative_raster_pre_snap = hasExtension(version, exts, numExtsI, extsI, "GL_NV_conservative_raster_pre_snap");
        this.GL_NV_conservative_raster_pre_snap_triangles = hasExtension(version, exts, numExtsI, extsI, "GL_NV_conservative_raster_pre_snap_triangles");
        this.GL_NV_conservative_raster_underestimation = hasExtension(version, exts, numExtsI, extsI, "GL_NV_conservative_raster_underestimation");
        this.GL_NV_copy_depth_to_color = hasExtension(version, exts, numExtsI, extsI, "GL_NV_copy_depth_to_color");
        this.GL_NV_copy_image = hasExtension(version, exts, numExtsI, extsI, "GL_NV_copy_image");
        this.GL_NV_deep_texture3D = hasExtension(version, exts, numExtsI, extsI, "GL_NV_deep_texture3D");
        this.GL_NV_depth_buffer_float = hasExtension(version, exts, numExtsI, extsI, "GL_NV_depth_buffer_float");
        this.GL_NV_depth_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_NV_depth_clamp");
        this.GL_NV_draw_texture = hasExtension(version, exts, numExtsI, extsI, "GL_NV_draw_texture");
        this.GL_NV_draw_vulkan_image = hasExtension(version, exts, numExtsI, extsI, "GL_NV_draw_vulkan_image");
        this.GL_NV_evaluators = hasExtension(version, exts, numExtsI, extsI, "GL_NV_evaluators");
        this.GL_NV_explicit_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_NV_explicit_multisample");
        this.GL_NV_fence = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fence");
        this.GL_NV_fill_rectangle = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fill_rectangle");
        this.GL_NV_float_buffer = hasExtension(version, exts, numExtsI, extsI, "GL_NV_float_buffer");
        this.GL_NV_fog_distance = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fog_distance");
        this.GL_NV_fragment_coverage_to_color = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fragment_coverage_to_color");
        this.GL_NV_fragment_program = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fragment_program");
        this.GL_NV_fragment_program2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fragment_program2");
        this.GL_NV_fragment_program4 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fragment_program4");
        this.GL_NV_fragment_program_option = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fragment_program_option");
        this.GL_NV_fragment_shader_barycentric = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fragment_shader_barycentric");
        this.GL_NV_fragment_shader_interlock = hasExtension(version, exts, numExtsI, extsI, "GL_NV_fragment_shader_interlock");
        this.GL_NV_framebuffer_mixed_samples = hasExtension(version, exts, numExtsI, extsI, "GL_NV_framebuffer_mixed_samples");
        this.GL_NV_framebuffer_multisample_coverage = hasExtension(version, exts, numExtsI, extsI, "GL_NV_framebuffer_multisample_coverage");
        this.GL_NV_geometry_program4 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_geometry_program4");
        this.GL_NV_geometry_shader4 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_geometry_shader4");
        this.GL_NV_geometry_shader_passthrough = hasExtension(version, exts, numExtsI, extsI, "GL_NV_geometry_shader_passthrough");
        this.GL_NV_gpu_multicast = hasExtension(version, exts, numExtsI, extsI, "GL_NV_gpu_multicast");
        this.GL_NV_gpu_program4 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_gpu_program4");
        this.GL_NV_gpu_program5 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_gpu_program5");
        this.GL_NV_gpu_program5_mem_extended = hasExtension(version, exts, numExtsI, extsI, "GL_NV_gpu_program5_mem_extended");
        this.GL_NV_gpu_shader5 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_gpu_shader5");
        this.GL_NV_half_float = hasExtension(version, exts, numExtsI, extsI, "GL_NV_half_float");
        this.GL_NV_internalformat_sample_query = hasExtension(version, exts, numExtsI, extsI, "GL_NV_internalformat_sample_query");
        this.GL_NV_light_max_exponent = hasExtension(version, exts, numExtsI, extsI, "GL_NV_light_max_exponent");
        this.GL_NV_memory_attachment = hasExtension(version, exts, numExtsI, extsI, "GL_NV_memory_attachment");
        this.GL_NV_memory_object_sparse = hasExtension(version, exts, numExtsI, extsI, "GL_NV_memory_object_sparse");
        this.GL_NV_mesh_shader = hasExtension(version, exts, numExtsI, extsI, "GL_NV_mesh_shader");
        this.GL_NV_multisample_coverage = hasExtension(version, exts, numExtsI, extsI, "GL_NV_multisample_coverage");
        this.GL_NV_multisample_filter_hint = hasExtension(version, exts, numExtsI, extsI, "GL_NV_multisample_filter_hint");
        this.GL_NV_occlusion_query = hasExtension(version, exts, numExtsI, extsI, "GL_NV_occlusion_query");
        this.GL_NV_packed_depth_stencil = hasExtension(version, exts, numExtsI, extsI, "GL_NV_packed_depth_stencil");
        this.GL_NV_parameter_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_NV_parameter_buffer_object");
        this.GL_NV_parameter_buffer_object2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_parameter_buffer_object2");
        this.GL_NV_path_rendering = hasExtension(version, exts, numExtsI, extsI, "GL_NV_path_rendering");
        this.GL_NV_path_rendering_shared_edge = hasExtension(version, exts, numExtsI, extsI, "GL_NV_path_rendering_shared_edge");
        this.GL_NV_pixel_data_range = hasExtension(version, exts, numExtsI, extsI, "GL_NV_pixel_data_range");
        this.GL_NV_point_sprite = hasExtension(version, exts, numExtsI, extsI, "GL_NV_point_sprite");
        this.GL_NV_present_video = hasExtension(version, exts, numExtsI, extsI, "GL_NV_present_video");
        this.GL_NV_primitive_restart = hasExtension(version, exts, numExtsI, extsI, "GL_NV_primitive_restart");
        this.GL_NV_primitive_shading_rate = hasExtension(version, exts, numExtsI, extsI, "GL_NV_primitive_shading_rate");
        this.GL_NV_query_resource = hasExtension(version, exts, numExtsI, extsI, "GL_NV_query_resource");
        this.GL_NV_query_resource_tag = hasExtension(version, exts, numExtsI, extsI, "GL_NV_query_resource_tag");
        this.GL_NV_register_combiners = hasExtension(version, exts, numExtsI, extsI, "GL_NV_register_combiners");
        this.GL_NV_register_combiners2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_register_combiners2");
        this.GL_NV_representative_fragment_test = hasExtension(version, exts, numExtsI, extsI, "GL_NV_representative_fragment_test");
        this.GL_NV_robustness_video_memory_purge = hasExtension(version, exts, numExtsI, extsI, "GL_NV_robustness_video_memory_purge");
        this.GL_NV_sample_locations = hasExtension(version, exts, numExtsI, extsI, "GL_NV_sample_locations");
        this.GL_NV_sample_mask_override_coverage = hasExtension(version, exts, numExtsI, extsI, "GL_NV_sample_mask_override_coverage");
        this.GL_NV_scissor_exclusive = hasExtension(version, exts, numExtsI, extsI, "GL_NV_scissor_exclusive");
        this.GL_NV_shader_atomic_counters = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_atomic_counters");
        this.GL_NV_shader_atomic_float = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_atomic_float");
        this.GL_NV_shader_atomic_float64 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_atomic_float64");
        this.GL_NV_shader_atomic_fp16_vector = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_atomic_fp16_vector");
        this.GL_NV_shader_atomic_int64 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_atomic_int64");
        this.GL_NV_shader_buffer_load = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_buffer_load");
        this.GL_NV_shader_buffer_store = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_buffer_store");
        this.GL_NV_shader_storage_buffer_object = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_storage_buffer_object");
        this.GL_NV_shader_subgroup_partitioned = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_subgroup_partitioned");
        this.GL_NV_shader_texture_footprint = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_texture_footprint");
        this.GL_NV_shader_thread_group = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_thread_group");
        this.GL_NV_shader_thread_shuffle = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shader_thread_shuffle");
        this.GL_NV_shading_rate_image = hasExtension(version, exts, numExtsI, extsI, "GL_NV_shading_rate_image");
        this.GL_NV_stereo_view_rendering = hasExtension(version, exts, numExtsI, extsI, "GL_NV_stereo_view_rendering");
        this.GL_NV_tessellation_program5 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_tessellation_program5");
        this.GL_NV_texgen_emboss = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texgen_emboss");
        this.GL_NV_texgen_reflection = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texgen_reflection");
        this.GL_NV_texture_barrier = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_barrier");
        this.GL_NV_texture_compression_vtc = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_compression_vtc");
        this.GL_NV_texture_env_combine4 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_env_combine4");
        this.GL_NV_texture_expand_normal = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_expand_normal");
        this.GL_NV_texture_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_multisample");
        this.GL_NV_texture_rectangle = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_rectangle");
        this.GL_NV_texture_rectangle_compressed = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_rectangle_compressed");
        this.GL_NV_texture_shader = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_shader");
        this.GL_NV_texture_shader2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_shader2");
        this.GL_NV_texture_shader3 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_texture_shader3");
        this.GL_NV_timeline_semaphore = hasExtension(version, exts, numExtsI, extsI, "GL_NV_timeline_semaphore");
        this.GL_NV_transform_feedback = hasExtension(version, exts, numExtsI, extsI, "GL_NV_transform_feedback");
        this.GL_NV_transform_feedback2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_transform_feedback2");
        this.GL_NV_uniform_buffer_std430_layout = hasExtension(version, exts, numExtsI, extsI, "GL_NV_uniform_buffer_std430_layout");
        this.GL_NV_uniform_buffer_unified_memory = hasExtension(version, exts, numExtsI, extsI, "GL_NV_uniform_buffer_unified_memory");
        this.GL_NV_vdpau_interop = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vdpau_interop");
        this.GL_NV_vdpau_interop2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vdpau_interop2");
        this.GL_NV_vertex_array_range = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_array_range");
        this.GL_NV_vertex_array_range2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_array_range2");
        this.GL_NV_vertex_attrib_integer_64bit = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_attrib_integer_64bit");
        this.GL_NV_vertex_buffer_unified_memory = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_buffer_unified_memory");
        this.GL_NV_vertex_program = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_program");
        this.GL_NV_vertex_program1_1 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_program1_1");
        this.GL_NV_vertex_program2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_program2");
        this.GL_NV_vertex_program2_option = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_program2_option");
        this.GL_NV_vertex_program3 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_program3");
        this.GL_NV_vertex_program4 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_vertex_program4");
        this.GL_NV_video_capture = hasExtension(version, exts, numExtsI, extsI, "GL_NV_video_capture");
        this.GL_NV_viewport_array2 = hasExtension(version, exts, numExtsI, extsI, "GL_NV_viewport_array2");
        this.GL_NV_viewport_swizzle = hasExtension(version, exts, numExtsI, extsI, "GL_NV_viewport_swizzle");
        this.GL_OML_interlace = hasExtension(version, exts, numExtsI, extsI, "GL_OML_interlace");
        this.GL_OML_resample = hasExtension(version, exts, numExtsI, extsI, "GL_OML_resample");
        this.GL_OML_subsample = hasExtension(version, exts, numExtsI, extsI, "GL_OML_subsample");
        this.GL_OVR_multiview = hasExtension(version, exts, numExtsI, extsI, "GL_OVR_multiview");
        this.GL_OVR_multiview2 = hasExtension(version, exts, numExtsI, extsI, "GL_OVR_multiview2");
        this.GL_PGI_misc_hints = hasExtension(version, exts, numExtsI, extsI, "GL_PGI_misc_hints");
        this.GL_PGI_vertex_hints = hasExtension(version, exts, numExtsI, extsI, "GL_PGI_vertex_hints");
        this.GL_REND_screen_coordinates = hasExtension(version, exts, numExtsI, extsI, "GL_REND_screen_coordinates");
        this.GL_S3_s3tc = hasExtension(version, exts, numExtsI, extsI, "GL_S3_s3tc");
        this.GL_SGIS_detail_texture = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_detail_texture");
        this.GL_SGIS_fog_function = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_fog_function");
        this.GL_SGIS_generate_mipmap = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_generate_mipmap");
        this.GL_SGIS_multisample = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_multisample");
        this.GL_SGIS_pixel_texture = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_pixel_texture");
        this.GL_SGIS_point_line_texgen = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_point_line_texgen");
        this.GL_SGIS_point_parameters = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_point_parameters");
        this.GL_SGIS_sharpen_texture = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_sharpen_texture");
        this.GL_SGIS_texture4D = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_texture4D");
        this.GL_SGIS_texture_border_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_texture_border_clamp");
        this.GL_SGIS_texture_color_mask = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_texture_color_mask");
        this.GL_SGIS_texture_edge_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_texture_edge_clamp");
        this.GL_SGIS_texture_filter4 = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_texture_filter4");
        this.GL_SGIS_texture_lod = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_texture_lod");
        this.GL_SGIS_texture_select = hasExtension(version, exts, numExtsI, extsI, "GL_SGIS_texture_select");
        this.GL_SGIX_async = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_async");
        this.GL_SGIX_async_histogram = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_async_histogram");
        this.GL_SGIX_async_pixel = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_async_pixel");
        this.GL_SGIX_blend_alpha_minmax = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_blend_alpha_minmax");
        this.GL_SGIX_calligraphic_fragment = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_calligraphic_fragment");
        this.GL_SGIX_clipmap = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_clipmap");
        this.GL_SGIX_convolution_accuracy = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_convolution_accuracy");
        this.GL_SGIX_depth_pass_instrument = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_depth_pass_instrument");
        this.GL_SGIX_depth_texture = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_depth_texture");
        this.GL_SGIX_flush_raster = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_flush_raster");
        this.GL_SGIX_fog_offset = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_fog_offset");
        this.GL_SGIX_fragment_lighting = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_fragment_lighting");
        this.GL_SGIX_framezoom = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_framezoom");
        this.GL_SGIX_igloo_interface = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_igloo_interface");
        this.GL_SGIX_instruments = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_instruments");
        this.GL_SGIX_interlace = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_interlace");
        this.GL_SGIX_ir_instrument1 = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_ir_instrument1");
        this.GL_SGIX_list_priority = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_list_priority");
        this.GL_SGIX_pixel_texture = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_pixel_texture");
        this.GL_SGIX_pixel_tiles = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_pixel_tiles");
        this.GL_SGIX_polynomial_ffd = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_polynomial_ffd");
        this.GL_SGIX_reference_plane = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_reference_plane");
        this.GL_SGIX_resample = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_resample");
        this.GL_SGIX_scalebias_hint = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_scalebias_hint");
        this.GL_SGIX_shadow = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_shadow");
        this.GL_SGIX_shadow_ambient = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_shadow_ambient");
        this.GL_SGIX_sprite = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_sprite");
        this.GL_SGIX_subsample = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_subsample");
        this.GL_SGIX_tag_sample_buffer = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_tag_sample_buffer");
        this.GL_SGIX_texture_add_env = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_texture_add_env");
        this.GL_SGIX_texture_coordinate_clamp = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_texture_coordinate_clamp");
        this.GL_SGIX_texture_lod_bias = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_texture_lod_bias");
        this.GL_SGIX_texture_multi_buffer = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_texture_multi_buffer");
        this.GL_SGIX_texture_scale_bias = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_texture_scale_bias");
        this.GL_SGIX_vertex_preclip = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_vertex_preclip");
        this.GL_SGIX_ycrcb = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_ycrcb");
        this.GL_SGIX_ycrcb_subsample = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_ycrcb_subsample");
        this.GL_SGIX_ycrcba = hasExtension(version, exts, numExtsI, extsI, "GL_SGIX_ycrcba");
        this.GL_SGI_color_matrix = hasExtension(version, exts, numExtsI, extsI, "GL_SGI_color_matrix");
        this.GL_SGI_color_table = hasExtension(version, exts, numExtsI, extsI, "GL_SGI_color_table");
        this.GL_SGI_texture_color_table = hasExtension(version, exts, numExtsI, extsI, "GL_SGI_texture_color_table");
        this.GL_SUNX_constant_data = hasExtension(version, exts, numExtsI, extsI, "GL_SUNX_constant_data");
        this.GL_SUN_convolution_border_modes = hasExtension(version, exts, numExtsI, extsI, "GL_SUN_convolution_border_modes");
        this.GL_SUN_global_alpha = hasExtension(version, exts, numExtsI, extsI, "GL_SUN_global_alpha");
        this.GL_SUN_mesh_array = hasExtension(version, exts, numExtsI, extsI, "GL_SUN_mesh_array");
        this.GL_SUN_slice_accum = hasExtension(version, exts, numExtsI, extsI, "GL_SUN_slice_accum");
        this.GL_SUN_triangle_list = hasExtension(version, exts, numExtsI, extsI, "GL_SUN_triangle_list");
        this.GL_SUN_vertex = hasExtension(version, exts, numExtsI, extsI, "GL_SUN_vertex");
        this.GL_WIN_phong_shading = hasExtension(version, exts, numExtsI, extsI, "GL_WIN_phong_shading");
        this.GL_WIN_specular_fog = hasExtension(version, exts, numExtsI, extsI, "GL_WIN_specular_fog");

        return true;
    }
}
