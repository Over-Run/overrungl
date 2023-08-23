/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package overrungl.opengl;

import overrungl.opengl.ext.*;
import overrungl.opengl.ext.amd.*;
import overrungl.opengl.ext.apple.*;
import overrungl.opengl.ext.arb.*;
import overrungl.opengl.ext.sun.*;

import java.lang.invoke.MethodHandle;

/**
 * The OpenGL extension capabilities.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLExtCaps {
    // region Flags
    /**
     * The OpenGL extension flags.
     */
    public boolean GL_3DFX_multisample, GL_3DFX_tbuffer, GL_3DFX_texture_compression_FXT1, GL_AMD_blend_minmax_factor,
        GL_AMD_conservative_depth, GL_AMD_debug_output, GL_AMD_depth_clamp_separate, GL_AMD_draw_buffers_blend,
        GL_AMD_framebuffer_multisample_advanced, GL_AMD_framebuffer_sample_positions, GL_AMD_gcn_shader,
        GL_AMD_gpu_shader_half_float, GL_AMD_gpu_shader_int16, GL_AMD_gpu_shader_int64, GL_AMD_interleaved_elements,
        GL_AMD_multi_draw_indirect, GL_AMD_name_gen_delete, GL_AMD_occlusion_query_event, GL_AMD_performance_monitor,
        GL_AMD_pinned_memory, GL_AMD_query_buffer_object, GL_AMD_sample_positions, GL_AMD_seamless_cubemap_per_texture,
        GL_AMD_shader_atomic_counter_ops, GL_AMD_shader_ballot, GL_AMD_shader_explicit_vertex_parameter,
        GL_AMD_shader_gpu_shader_half_float_fetch, GL_AMD_shader_image_load_store_lod, GL_AMD_shader_stencil_export,
        GL_AMD_shader_trinary_minmax, GL_AMD_sparse_texture, GL_AMD_stencil_operation_extended,
        GL_AMD_texture_gather_bias_lod, GL_AMD_texture_texture4, GL_AMD_transform_feedback3_lines_triangles,
        GL_AMD_transform_feedback4, GL_AMD_vertex_shader_layer, GL_AMD_vertex_shader_tessellator,
        GL_AMD_vertex_shader_viewport_index, GL_APPLE_aux_depth_stencil, GL_APPLE_client_storage, GL_APPLE_element_array,
        GL_APPLE_fence, GL_APPLE_float_pixels, GL_APPLE_flush_buffer_range, GL_APPLE_object_purgeable, GL_APPLE_rgb_422,
        GL_APPLE_row_bytes, GL_APPLE_specular_vector, GL_APPLE_texture_range, GL_APPLE_transform_hint,
        GL_APPLE_vertex_array_object, GL_APPLE_vertex_array_range, GL_APPLE_vertex_program_evaluators, GL_APPLE_ycbcr_422,
        GL_ARB_ES2_compatibility, GL_ARB_ES3_1_compatibility, GL_ARB_ES3_2_compatibility, GL_ARB_ES3_compatibility,
        GL_ARB_arrays_of_arrays, GL_ARB_base_instance, GL_ARB_bindless_texture, GL_ARB_blend_func_extended,
        GL_ARB_buffer_storage, GL_ARB_cl_event, GL_ARB_clear_buffer_object, GL_ARB_clear_texture, GL_ARB_clip_control,
        GL_ARB_color_buffer_float, GL_ARB_compatibility, GL_ARB_compressed_texture_pixel_storage, GL_ARB_compute_shader,
        GL_ARB_compute_variable_group_size, GL_ARB_conditional_render_inverted, GL_ARB_conservative_depth, GL_ARB_copy_buffer,
        GL_ARB_copy_image, GL_ARB_cull_distance, GL_ARB_debug_output, GL_ARB_depth_buffer_float, GL_ARB_depth_clamp,
        GL_ARB_depth_texture, GL_ARB_derivative_control, GL_ARB_direct_state_access, GL_ARB_draw_buffers,
        GL_ARB_draw_buffers_blend, GL_ARB_draw_elements_base_vertex, GL_ARB_draw_indirect, GL_ARB_draw_instanced,
        GL_ARB_enhanced_layouts, GL_ARB_explicit_attrib_location, GL_ARB_explicit_uniform_location,
        GL_ARB_fragment_coord_conventions, GL_ARB_fragment_layer_viewport, GL_ARB_fragment_program,
        GL_ARB_fragment_program_shadow, GL_ARB_fragment_shader, GL_ARB_fragment_shader_interlock,
        GL_ARB_framebuffer_no_attachments, GL_ARB_framebuffer_object, GL_ARB_framebuffer_sRGB, GL_ARB_geometry_shader4,
        GL_ARB_get_program_binary, GL_ARB_get_texture_sub_image, GL_ARB_gl_spirv, GL_ARB_gpu_shader5, GL_ARB_gpu_shader_fp64,
        GL_ARB_gpu_shader_int64, GL_ARB_half_float_pixel, GL_ARB_half_float_vertex, GL_ARB_imaging, GL_ARB_indirect_parameters,
        GL_ARB_instanced_arrays, GL_ARB_internalformat_query, GL_ARB_internalformat_query2, GL_ARB_invalidate_subdata,
        GL_ARB_map_buffer_alignment, GL_ARB_map_buffer_range, GL_ARB_matrix_palette, GL_ARB_multi_bind,
        GL_ARB_multi_draw_indirect, GL_ARB_multisample, GL_ARB_multitexture, GL_ARB_occlusion_query, GL_ARB_occlusion_query2,
        GL_ARB_parallel_shader_compile, GL_ARB_pipeline_statistics_query, GL_ARB_pixel_buffer_object, GL_ARB_point_parameters,
        GL_ARB_point_sprite, GL_ARB_polygon_offset_clamp, GL_ARB_post_depth_coverage, GL_ARB_program_interface_query,
        GL_ARB_provoking_vertex, GL_ARB_query_buffer_object, GL_ARB_robust_buffer_access_behavior, GL_ARB_robustness,
        GL_ARB_robustness_isolation, GL_ARB_sample_locations, GL_ARB_sample_shading, GL_ARB_sampler_objects,
        GL_ARB_seamless_cube_map, GL_ARB_seamless_cubemap_per_texture, GL_ARB_separate_shader_objects,
        GL_ARB_shader_atomic_counter_ops, GL_ARB_shader_atomic_counters, GL_ARB_shader_ballot, GL_ARB_shader_bit_encoding,
        GL_ARB_shader_clock, GL_ARB_shader_draw_parameters, GL_ARB_shader_group_vote, GL_ARB_shader_image_load_store,
        GL_ARB_shader_image_size, GL_ARB_shader_objects, GL_ARB_shader_precision, GL_ARB_shader_stencil_export,
        GL_ARB_shader_storage_buffer_object, GL_ARB_shader_subroutine, GL_ARB_shader_texture_image_samples,
        GL_ARB_shader_texture_lod, GL_ARB_shader_viewport_layer_array, GL_ARB_shading_language_100,
        GL_ARB_shading_language_420pack, GL_ARB_shading_language_include, GL_ARB_shading_language_packing, GL_ARB_shadow,
        GL_ARB_shadow_ambient, GL_ARB_sparse_buffer, GL_ARB_sparse_texture, GL_ARB_sparse_texture2, GL_ARB_sparse_texture_clamp,
        GL_ARB_spirv_extensions, GL_ARB_stencil_texturing, GL_ARB_sync, GL_ARB_tessellation_shader, GL_ARB_texture_barrier,
        GL_ARB_texture_border_clamp, GL_ARB_texture_buffer_object, GL_ARB_texture_buffer_object_rgb32, GL_ARB_texture_buffer_range,
        GL_ARB_texture_compression, GL_ARB_texture_compression_bptc, GL_ARB_texture_compression_rgtc,
        GL_ARB_texture_cube_map, GL_ARB_texture_cube_map_array, GL_ARB_texture_env_add, GL_ARB_texture_env_combine,
        GL_ARB_texture_env_crossbar, GL_ARB_texture_env_dot3, GL_ARB_texture_filter_anisotropic, GL_ARB_texture_filter_minmax,
        GL_ARB_texture_float, GL_ARB_texture_gather, GL_ARB_texture_mirror_clamp_to_edge, GL_ARB_texture_mirrored_repeat,
        GL_ARB_texture_multisample, GL_ARB_texture_non_power_of_two, GL_ARB_texture_query_levels, GL_ARB_texture_query_lod,
        GL_ARB_texture_rectangle, GL_ARB_texture_rg, GL_ARB_texture_rgb10_a2ui, GL_ARB_texture_stencil8, GL_ARB_texture_storage,
        GL_ARB_texture_storage_multisample, GL_ARB_texture_swizzle, GL_ARB_texture_view, GL_ARB_timer_query,
        GL_ARB_transform_feedback2, GL_ARB_transform_feedback3, GL_ARB_transform_feedback_instanced,
        GL_ARB_transform_feedback_overflow_query, GL_ARB_transpose_matrix, GL_ARB_uniform_buffer_object, GL_ARB_vertex_array_bgra,
        GL_ARB_vertex_array_object, GL_ARB_vertex_attrib_64bit, GL_ARB_vertex_attrib_binding, GL_ARB_vertex_blend,
        GL_ARB_vertex_buffer_object, GL_ARB_vertex_program, GL_ARB_vertex_shader, GL_ARB_vertex_type_10f_11f_11f_rev,
        GL_ARB_vertex_type_2_10_10_10_rev, GL_ARB_viewport_array, GL_ARB_window_pos, GL_ATI_draw_buffers, GL_ATI_element_array,
        GL_ATI_envmap_bumpmap, GL_ATI_fragment_shader, GL_ATI_map_object_buffer, GL_ATI_meminfo, GL_ATI_pixel_format_float,
        GL_ATI_pn_triangles, GL_ATI_separate_stencil, GL_ATI_text_fragment_shader, GL_ATI_texture_env_combine3, GL_ATI_texture_float,
        GL_ATI_texture_mirror_once, GL_ATI_vertex_array_object, GL_ATI_vertex_attrib_array_object, GL_ATI_vertex_streams,
        GL_EXT_422_pixels, GL_EXT_EGL_image_storage, GL_EXT_EGL_sync, GL_EXT_abgr, GL_EXT_bgra, GL_EXT_bindable_uniform,
        GL_EXT_blend_color, GL_EXT_blend_equation_separate, GL_EXT_blend_func_separate, GL_EXT_blend_logic_op, GL_EXT_blend_minmax,
        GL_EXT_blend_subtract, GL_EXT_clip_volume_hint, GL_EXT_cmyka, GL_EXT_color_subtable, GL_EXT_compiled_vertex_array,
        GL_EXT_convolution, GL_EXT_coordinate_frame, GL_EXT_copy_texture, GL_EXT_cull_vertex, GL_EXT_debug_label, GL_EXT_debug_marker,
        GL_EXT_depth_bounds_test, GL_EXT_direct_state_access, GL_EXT_draw_buffers2, GL_EXT_draw_instanced, GL_EXT_draw_range_elements,
        GL_EXT_external_buffer, GL_EXT_fog_coord, GL_EXT_framebuffer_blit, GL_EXT_framebuffer_multisample,
        GL_EXT_framebuffer_multisample_blit_scaled, GL_EXT_framebuffer_object, GL_EXT_framebuffer_sRGB, GL_EXT_geometry_shader4,
        GL_EXT_gpu_program_parameters, GL_EXT_gpu_shader4, GL_EXT_histogram, GL_EXT_index_array_formats, GL_EXT_index_func,
        GL_EXT_index_material, GL_EXT_index_texture, GL_EXT_light_texture, GL_EXT_memory_object, GL_EXT_memory_object_fd,
        GL_EXT_memory_object_win32, GL_EXT_misc_attribute, GL_EXT_multi_draw_arrays, GL_EXT_multisample,
        GL_EXT_multiview_tessellation_geometry_shader, GL_EXT_multiview_texture_multisample, GL_EXT_multiview_timer_query,
        GL_EXT_packed_depth_stencil, GL_EXT_packed_float, GL_EXT_packed_pixels, GL_EXT_paletted_texture,
        GL_EXT_pixel_buffer_object, GL_EXT_pixel_transform, GL_EXT_pixel_transform_color_table, GL_EXT_point_parameters,
        GL_EXT_polygon_offset, GL_EXT_polygon_offset_clamp, GL_EXT_post_depth_coverage, GL_EXT_provoking_vertex,
        GL_EXT_raster_multisample, GL_EXT_rescale_normal, GL_EXT_secondary_color, GL_EXT_semaphore, GL_EXT_semaphore_fd,
        GL_EXT_semaphore_win32, GL_EXT_separate_shader_objects, GL_EXT_separate_specular_color, GL_EXT_shader_framebuffer_fetch,
        GL_EXT_shader_framebuffer_fetch_non_coherent, GL_EXT_shader_image_load_formatted, GL_EXT_shader_image_load_store,
        GL_EXT_shader_integer_mix, GL_EXT_shadow_funcs, GL_EXT_shared_texture_palette, GL_EXT_sparse_texture2,
        GL_EXT_stencil_clear_tag, GL_EXT_stencil_two_side, GL_EXT_stencil_wrap, GL_EXT_subtexture, GL_EXT_texture,
        GL_EXT_texture3D, GL_EXT_texture_array, GL_EXT_texture_buffer_object, GL_EXT_texture_compression_latc,
        GL_EXT_texture_compression_rgtc, GL_EXT_texture_compression_s3tc, GL_EXT_texture_cube_map, GL_EXT_texture_env_add,
        GL_EXT_texture_env_combine, GL_EXT_texture_env_dot3, GL_EXT_texture_filter_anisotropic, GL_EXT_texture_filter_minmax,
        GL_EXT_texture_integer, GL_EXT_texture_lod_bias, GL_EXT_texture_mirror_clamp, GL_EXT_texture_object,
        GL_EXT_texture_perturb_normal, GL_EXT_texture_sRGB, GL_EXT_texture_sRGB_R8, GL_EXT_texture_sRGB_RG8,
        GL_EXT_texture_sRGB_decode, GL_EXT_texture_shadow_lod, GL_EXT_texture_shared_exponent, GL_EXT_texture_snorm,
        GL_EXT_texture_storage, GL_EXT_texture_swizzle, GL_EXT_timer_query, GL_EXT_transform_feedback, GL_EXT_vertex_array,
        GL_EXT_vertex_array_bgra, GL_EXT_vertex_attrib_64bit, GL_EXT_vertex_shader, GL_EXT_vertex_weighting,
        GL_EXT_win32_keyed_mutex, GL_EXT_window_rectangles, GL_EXT_x11_sync_object, GL_GREMEDY_frame_terminator,
        GL_GREMEDY_string_marker, GL_HP_convolution_border_modes, GL_HP_image_transform, GL_HP_occlusion_test,
        GL_HP_texture_lighting, GL_IBM_cull_vertex, GL_IBM_multimode_draw_arrays, GL_IBM_rasterpos_clip, GL_IBM_static_data,
        GL_IBM_texture_mirrored_repeat, GL_IBM_vertex_array_lists, GL_INGR_blend_func_separate, GL_INGR_color_clamp,
        GL_INGR_interlace_read, GL_INTEL_blackhole_render, GL_INTEL_conservative_rasterization, GL_INTEL_fragment_shader_ordering,
        GL_INTEL_framebuffer_CMAA, GL_INTEL_map_texture, GL_INTEL_parallel_arrays, GL_INTEL_performance_query,
        GL_KHR_blend_equation_advanced, GL_KHR_blend_equation_advanced_coherent, GL_KHR_context_flush_control, GL_KHR_debug,
        GL_KHR_no_error, GL_KHR_parallel_shader_compile, GL_KHR_robust_buffer_access_behavior, GL_KHR_robustness,
        GL_KHR_shader_subgroup, GL_KHR_texture_compression_astc_hdr, GL_KHR_texture_compression_astc_ldr,
        GL_KHR_texture_compression_astc_sliced_3d, GL_MESAX_texture_stack, GL_MESA_framebuffer_flip_x, GL_MESA_framebuffer_flip_y,
        GL_MESA_framebuffer_swap_xy, GL_MESA_pack_invert, GL_MESA_program_binary_formats, GL_MESA_resize_buffers,
        GL_MESA_shader_integer_functions, GL_MESA_tile_raster_order, GL_MESA_window_pos, GL_MESA_ycbcr_texture,
        GL_NVX_blend_equation_advanced_multi_draw_buffers, GL_NVX_conditional_render, GL_NVX_gpu_memory_info,
        GL_NVX_gpu_multicast2, GL_NVX_linked_gpu_multicast, GL_NVX_progress_fence, GL_NV_alpha_to_coverage_dither_control,
        GL_NV_bindless_multi_draw_indirect, GL_NV_bindless_multi_draw_indirect_count, GL_NV_bindless_texture,
        GL_NV_blend_equation_advanced, GL_NV_blend_equation_advanced_coherent, GL_NV_blend_minmax_factor, GL_NV_blend_square,
        GL_NV_clip_space_w_scaling, GL_NV_command_list, GL_NV_compute_program5, GL_NV_compute_shader_derivatives,
        GL_NV_conditional_render, GL_NV_conservative_raster, GL_NV_conservative_raster_dilate, GL_NV_conservative_raster_pre_snap,
        GL_NV_conservative_raster_pre_snap_triangles, GL_NV_conservative_raster_underestimation, GL_NV_copy_depth_to_color,
        GL_NV_copy_image, GL_NV_deep_texture3D, GL_NV_depth_buffer_float, GL_NV_depth_clamp, GL_NV_draw_texture,
        GL_NV_draw_vulkan_image, GL_NV_evaluators, GL_NV_explicit_multisample, GL_NV_fence, GL_NV_fill_rectangle,
        GL_NV_float_buffer, GL_NV_fog_distance, GL_NV_fragment_coverage_to_color, GL_NV_fragment_program, GL_NV_fragment_program2,
        GL_NV_fragment_program4, GL_NV_fragment_program_option, GL_NV_fragment_shader_barycentric, GL_NV_fragment_shader_interlock,
        GL_NV_framebuffer_mixed_samples, GL_NV_framebuffer_multisample_coverage, GL_NV_geometry_program4, GL_NV_geometry_shader4,
        GL_NV_geometry_shader_passthrough, GL_NV_gpu_multicast, GL_NV_gpu_program4, GL_NV_gpu_program5,
        GL_NV_gpu_program5_mem_extended, GL_NV_gpu_shader5, GL_NV_half_float, GL_NV_internalformat_sample_query,
        GL_NV_light_max_exponent, GL_NV_memory_attachment, GL_NV_memory_object_sparse, GL_NV_mesh_shader,
        GL_NV_multisample_coverage, GL_NV_multisample_filter_hint, GL_NV_occlusion_query, GL_NV_packed_depth_stencil,
        GL_NV_parameter_buffer_object, GL_NV_parameter_buffer_object2, GL_NV_path_rendering, GL_NV_path_rendering_shared_edge,
        GL_NV_pixel_data_range, GL_NV_point_sprite, GL_NV_present_video, GL_NV_primitive_restart, GL_NV_primitive_shading_rate,
        GL_NV_query_resource, GL_NV_query_resource_tag, GL_NV_register_combiners, GL_NV_register_combiners2,
        GL_NV_representative_fragment_test, GL_NV_robustness_video_memory_purge, GL_NV_sample_locations,
        GL_NV_sample_mask_override_coverage, GL_NV_scissor_exclusive, GL_NV_shader_atomic_counters, GL_NV_shader_atomic_float,
        GL_NV_shader_atomic_float64, GL_NV_shader_atomic_fp16_vector, GL_NV_shader_atomic_int64, GL_NV_shader_buffer_load,
        GL_NV_shader_buffer_store, GL_NV_shader_storage_buffer_object, GL_NV_shader_subgroup_partitioned,
        GL_NV_shader_texture_footprint, GL_NV_shader_thread_group, GL_NV_shader_thread_shuffle, GL_NV_shading_rate_image,
        GL_NV_stereo_view_rendering, GL_NV_tessellation_program5, GL_NV_texgen_emboss, GL_NV_texgen_reflection,
        GL_NV_texture_barrier, GL_NV_texture_compression_vtc, GL_NV_texture_env_combine4, GL_NV_texture_expand_normal,
        GL_NV_texture_multisample, GL_NV_texture_rectangle, GL_NV_texture_rectangle_compressed, GL_NV_texture_shader,
        GL_NV_texture_shader2, GL_NV_texture_shader3, GL_NV_timeline_semaphore, GL_NV_transform_feedback,
        GL_NV_transform_feedback2, GL_NV_uniform_buffer_unified_memory, GL_NV_vdpau_interop, GL_NV_vdpau_interop2,
        GL_NV_vertex_array_range, GL_NV_vertex_array_range2, GL_NV_vertex_attrib_integer_64bit, GL_NV_vertex_buffer_unified_memory,
        GL_NV_vertex_program, GL_NV_vertex_program1_1, GL_NV_vertex_program2, GL_NV_vertex_program2_option, GL_NV_vertex_program3,
        GL_NV_vertex_program4, GL_NV_video_capture, GL_NV_viewport_array2, GL_NV_viewport_swizzle, GL_OES_byte_coordinates,
        GL_OES_compressed_paletted_texture, GL_OES_fixed_point, GL_OES_query_matrix, GL_OES_read_format, GL_OES_single_precision,
        GL_OML_interlace, GL_OML_resample, GL_OML_subsample, GL_OVR_multiview, GL_OVR_multiview2, GL_PGI_misc_hints,
        GL_PGI_vertex_hints, GL_REND_screen_coordinates, GL_S3_s3tc, GL_SGIS_detail_texture, GL_SGIS_fog_function,
        GL_SGIS_generate_mipmap, GL_SGIS_multisample, GL_SGIS_pixel_texture, GL_SGIS_point_line_texgen, GL_SGIS_point_parameters,
        GL_SGIS_sharpen_texture, GL_SGIS_texture4D, GL_SGIS_texture_border_clamp, GL_SGIS_texture_color_mask,
        GL_SGIS_texture_edge_clamp, GL_SGIS_texture_filter4, GL_SGIS_texture_lod, GL_SGIS_texture_select, GL_SGIX_async,
        GL_SGIX_async_histogram, GL_SGIX_async_pixel, GL_SGIX_blend_alpha_minmax, GL_SGIX_calligraphic_fragment, GL_SGIX_clipmap,
        GL_SGIX_convolution_accuracy, GL_SGIX_depth_pass_instrument, GL_SGIX_depth_texture, GL_SGIX_flush_raster,
        GL_SGIX_fog_offset, GL_SGIX_fragment_lighting, GL_SGIX_framezoom, GL_SGIX_igloo_interface, GL_SGIX_instruments,
        GL_SGIX_interlace, GL_SGIX_ir_instrument1, GL_SGIX_list_priority, GL_SGIX_pixel_texture, GL_SGIX_pixel_tiles,
        GL_SGIX_polynomial_ffd, GL_SGIX_reference_plane, GL_SGIX_resample, GL_SGIX_scalebias_hint, GL_SGIX_shadow,
        GL_SGIX_shadow_ambient, GL_SGIX_sprite, GL_SGIX_subsample, GL_SGIX_tag_sample_buffer, GL_SGIX_texture_add_env,
        GL_SGIX_texture_coordinate_clamp, GL_SGIX_texture_lod_bias, GL_SGIX_texture_multi_buffer, GL_SGIX_texture_scale_bias,
        GL_SGIX_vertex_preclip, GL_SGIX_ycrcb, GL_SGIX_ycrcb_subsample, GL_SGIX_ycrcba, GL_SGI_color_matrix, GL_SGI_color_table,
        GL_SGI_texture_color_table, GL_SUNX_constant_data, GL_SUN_convolution_border_modes, GL_SUN_global_alpha, GL_SUN_mesh_array,
        GL_SUN_slice_accum, GL_SUN_triangle_list, GL_SUN_vertex, GL_WIN_phong_shading, GL_WIN_specular_fog;
    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region 3DFX
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_3DFX_tbuffer} extension method handles.
     */
    public MethodHandle glTbufferMask3DFX;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region AMD
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_AMD_debug_output} extension method handles.
     */
    public MethodHandle glDebugMessageCallbackAMD, glDebugMessageEnableAMD, glDebugMessageInsertAMD, glGetDebugMessageLogAMD;
    /**
     * {@code GL_AMD_draw_buffers_blend} extension method handles.
     */
    public MethodHandle glBlendEquationIndexedAMD, glBlendEquationSeparateIndexedAMD, glBlendFuncIndexedAMD, glBlendFuncSeparateIndexedAMD;
    /**
     * {@code GL_AMD_framebuffer_multisample_advanced} extension method handles.
     */
    public MethodHandle glNamedRenderbufferStorageMultisampleAdvancedAMD, glRenderbufferStorageMultisampleAdvancedAMD;
    /**
     * {@code GL_AMD_framebuffer_sample_positions} extension method handles.
     */
    public MethodHandle glFramebufferSamplePositionsfvAMD, glGetFramebufferParameterfvAMD, glGetNamedFramebufferParameterfvAMD,
        glNamedFramebufferSamplePositionsfvAMD;
    /**
     * {@code GL_AMD_interleaved_elements} extension method handles.
     */
    public MethodHandle glVertexAttribParameteriAMD;
    /**
     * {@code GL_AMD_multi_draw_indirect} extension method handles.
     */
    public MethodHandle glMultiDrawArraysIndirectAMD, glMultiDrawElementsIndirectAMD;
    /**
     * {@code GL_AMD_name_gen_delete} extension method handles.
     */
    public MethodHandle glDeleteNamesAMD, glGenNamesAMD, glIsNameAMD;
    /**
     * {@code GL_AMD_occlusion_query_event} extension method handles.
     */
    public MethodHandle glQueryObjectParameteruiAMD;
    /**
     * {@code GL_AMD_performance_monitor} extension method handles.
     */
    public MethodHandle glBeginPerfMonitorAMD, glDeletePerfMonitorsAMD, glEndPerfMonitorAMD, glGenPerfMonitorsAMD,
        glGetPerfMonitorCounterDataAMD, glGetPerfMonitorCounterInfoAMD, glGetPerfMonitorCounterStringAMD,
        glGetPerfMonitorCountersAMD, glGetPerfMonitorGroupStringAMD, glGetPerfMonitorGroupsAMD,
        glSelectPerfMonitorCountersAMD;
    /**
     * {@code GL_AMD_sample_positions} extension method handles.
     */
    public MethodHandle glSetMultisamplefvAMD;
    /**
     * {@code GL_AMD_sparse_texture} extension method handles.
     */
    public MethodHandle glTexStorageSparseAMD, glTextureStorageSparseAMD;
    /**
     * {@code GL_AMD_stencil_operation_extended} extension method handles.
     */
    public MethodHandle glStencilOpValueAMD;
    /**
     * {@code GL_AMD_vertex_shader_tessellator} extension method handles.
     */
    public MethodHandle glTessellationFactorAMD, glTessellationModeAMD;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region APPLE
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_APPLE_element_array} extension method handles.
     */
    public MethodHandle glDrawElementArrayAPPLE, glDrawRangeElementArrayAPPLE, glElementPointerAPPLE,
        glMultiDrawElementArrayAPPLE, glMultiDrawRangeElementArrayAPPLE;
    /**
     * {@code GL_APPLE_fence} extension method handles.
     */
    public MethodHandle glDeleteFencesAPPLE, glFinishFenceAPPLE, glFinishObjectAPPLE, glGenFencesAPPLE,
        glIsFenceAPPLE, glSetFenceAPPLE, glTestFenceAPPLE, glTestObjectAPPLE;
    /**
     * {@code GL_APPLE_flush_buffer_range} extension method handles.
     */
    public MethodHandle glBufferParameteriAPPLE, glFlushMappedBufferRangeAPPLE;
    /**
     * {@code GL_APPLE_object_purgeable} extension method handles.
     */
    public MethodHandle glGetObjectParameterivAPPLE, glObjectPurgeableAPPLE, glObjectUnpurgeableAPPLE;
    /**
     * {@code GL_APPLE_texture_range} extension method handles.
     */
    public MethodHandle glGetTexParameterPointervAPPLE, glTextureRangeAPPLE;
    /**
     * {@code GL_APPLE_vertex_array_object} extension method handles.
     */
    public MethodHandle glBindVertexArrayAPPLE, glDeleteVertexArraysAPPLE, glGenVertexArraysAPPLE, glIsVertexArrayAPPLE;
    /**
     * {@code GL_APPLE_vertex_array_range} extension method handles.
     */
    public MethodHandle glFlushVertexArrayRangeAPPLE, glVertexArrayParameteriAPPLE, glVertexArrayRangeAPPLE;
    /**
     * {@code GL_APPLE_vertex_program_evaluators} extension method handles.
     */
    public MethodHandle glDisableVertexAttribAPPLE, glEnableVertexAttribAPPLE, glIsVertexAttribEnabledAPPLE,
        glMapVertexAttrib1dAPPLE, glMapVertexAttrib1fAPPLE, glMapVertexAttrib2dAPPLE, glMapVertexAttrib2fAPPLE;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region ARB
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_ARB_debug_output} extension method handles.
     */
    public MethodHandle glDebugMessageCallbackARB, glDebugMessageControlARB, glDebugMessageInsertARB, glGetDebugMessageLogARB;
    /**
     * {@code GL_ARB_ES3_1_compatibility} extension method handles.
     */
    public MethodHandle glPrimitiveBoundingBoxARB;
    /**
     * {@code GL_ARB_bindless_texture} extension method handles.
     */
    public MethodHandle glGetImageHandleARB, glGetTextureHandleARB, glGetTextureSamplerHandleARB, glGetVertexAttribLui64vARB, glIsImageHandleResidentARB,
        glIsTextureHandleResidentARB, glMakeImageHandleNonResidentARB, glMakeImageHandleResidentARB, glMakeTextureHandleNonResidentARB, glMakeTextureHandleResidentARB,
        glProgramUniformHandleui64ARB, glProgramUniformHandleui64vARB, glUniformHandleui64ARB, glUniformHandleui64vARB, glVertexAttribL1ui64ARB, glVertexAttribL1ui64vARB;
    /**
     * {@code GL_ARB_cl_event} extension method handles.
     */
    public MethodHandle glCreateSyncFromCLeventARB;
    /**
     * {@code GL_ARB_color_buffer_float} extension method handles.
     */
    public MethodHandle glClampColorARB;
    /**
     * {@code GL_ARB_compute_variable_group_size} extension method handles.
     */
    public MethodHandle glDispatchComputeGroupSizeARB;
    /**
     * {@code GL_ARB_draw_buffers} extension method handles.
     */
    public MethodHandle glDrawBuffersARB;
    /**
     * {@code GL_ARB_draw_buffers_blend} extension method handles.
     */
    public MethodHandle glBlendEquationSeparateiARB, glBlendEquationiARB, glBlendFuncSeparateiARB, glBlendFunciARB;
    /**
     * {@code GL_ARB_draw_instanced} extension method handles.
     */
    public MethodHandle glDrawArraysInstancedARB, glDrawElementsInstancedARB;
    /**
     * {@code GL_ARB_fragment_program} extension method handles.
     */
    public MethodHandle glBindProgramARB, glDeleteProgramsARB, glGenProgramsARB, glGetProgramEnvParameterdvARB, glGetProgramEnvParameterfvARB, glGetProgramLocalParameterdvARB,
        glGetProgramLocalParameterfvARB, glGetProgramStringARB, glGetProgramivARB, glIsProgramARB, glProgramEnvParameter4dARB, glProgramEnvParameter4dvARB, glProgramEnvParameter4fARB,
        glProgramEnvParameter4fvARB, glProgramLocalParameter4dARB, glProgramLocalParameter4dvARB, glProgramLocalParameter4fARB, glProgramLocalParameter4fvARB, glProgramStringARB;
    /**
     * {@code GL_ARB_geometry_shader4} extension method handles.
     */
    public MethodHandle glFramebufferTextureARB, glFramebufferTextureFaceARB, glFramebufferTextureLayerARB, glProgramParameteriARB;
    /**
     * {@code GL_ARB_gl_spirv} extension method handles.
     */
    public MethodHandle glSpecializeShaderARB;
    /**
     * {@code GL_ARB_gpu_shader_int64} extension method handles.
     */
    public MethodHandle glGetUniformi64vARB, glGetUniformui64vARB, glGetnUniformi64vARB, glGetnUniformui64vARB, glProgramUniform1i64ARB, glProgramUniform1i64vARB,
        glProgramUniform1ui64ARB, glProgramUniform1ui64vARB, glProgramUniform2i64ARB, glProgramUniform2i64vARB, glProgramUniform2ui64ARB, glProgramUniform2ui64vARB,
        glProgramUniform3i64ARB, glProgramUniform3i64vARB, glProgramUniform3ui64ARB, glProgramUniform3ui64vARB, glProgramUniform4i64ARB, glProgramUniform4i64vARB,
        glProgramUniform4ui64ARB, glProgramUniform4ui64vARB, glUniform1i64ARB, glUniform1i64vARB, glUniform1ui64ARB, glUniform1ui64vARB,
        glUniform2i64ARB, glUniform2i64vARB, glUniform2ui64ARB, glUniform2ui64vARB, glUniform3i64ARB, glUniform3i64vARB,
        glUniform3ui64ARB, glUniform3ui64vARB, glUniform4i64ARB, glUniform4i64vARB, glUniform4ui64ARB, glUniform4ui64vARB;
    /**
     * {@code GL_ARB_indirect_parameters} extension method handles.
     */
    public MethodHandle glMultiDrawArraysIndirectCountARB, glMultiDrawElementsIndirectCountARB;
    /**
     * {@code GL_ARB_instanced_arrays} extension method handles.
     */
    public MethodHandle glVertexAttribDivisorARB;
    /**
     * {@code GL_ARB_matrix_palette} extension method handles.
     */
    public MethodHandle glCurrentPaletteMatrixARB, glMatrixIndexPointerARB, glMatrixIndexubvARB, glMatrixIndexuivARB, glMatrixIndexusvARB;
    /**
     * {@code GL_ARB_multisample} extension method handles.
     */
    public MethodHandle glSampleCoverageARB;
    /**
     * {@code GL_ARB_multitexture} extension method handles.
     */
    public MethodHandle glActiveTextureARB, glClientActiveTextureARB, glMultiTexCoord1dARB, glMultiTexCoord1dvARB,
        glMultiTexCoord1fARB, glMultiTexCoord1fvARB, glMultiTexCoord1iARB, glMultiTexCoord1ivARB, glMultiTexCoord1sARB, glMultiTexCoord1svARB,
        glMultiTexCoord2dARB, glMultiTexCoord2dvARB, glMultiTexCoord2fARB, glMultiTexCoord2fvARB, glMultiTexCoord2iARB, glMultiTexCoord2ivARB,
        glMultiTexCoord2sARB, glMultiTexCoord2svARB, glMultiTexCoord3dARB, glMultiTexCoord3dvARB, glMultiTexCoord3fARB, glMultiTexCoord3fvARB,
        glMultiTexCoord3iARB, glMultiTexCoord3ivARB, glMultiTexCoord3sARB, glMultiTexCoord3svARB, glMultiTexCoord4dARB, glMultiTexCoord4dvARB,
        glMultiTexCoord4fARB, glMultiTexCoord4fvARB, glMultiTexCoord4iARB, glMultiTexCoord4ivARB, glMultiTexCoord4sARB, glMultiTexCoord4svARB;
    /**
     * {@code GL_ARB_occlusion_query} extension method handles.
     */
    public MethodHandle glBeginQueryARB, glDeleteQueriesARB, glEndQueryARB, glGenQueriesARB, glGetQueryObjectivARB,
        glGetQueryObjectuivARB, glGetQueryivARB, glIsQueryARB;
    /**
     * {@code GL_ARB_parallel_shader_compile} extension method handles.
     */
    public MethodHandle glMaxShaderCompilerThreadsARB;
    /**
     * {@code GL_ARB_point_parameters} extension method handles.
     */
    public MethodHandle glPointParameterfARB, glPointParameterfvARB;
    /**
     * {@code GL_ARB_robustness} extension method handles.
     */
    public MethodHandle glGetGraphicsResetStatusARB, glGetnCompressedTexImageARB, glGetnTexImageARB, glGetnUniformdvARB,
        glGetnUniformfvARB, glGetnUniformivARB, glGetnUniformuivARB, glReadnPixelsARB;
    /**
     * {@code GL_ARB_sample_locations} extension method handles.
     */
    public MethodHandle glEvaluateDepthValuesARB, glFramebufferSampleLocationsfvARB, glNamedFramebufferSampleLocationsfvARB;
    /**
     * {@code GL_ARB_sample_shading} extension method handles.
     */
    public MethodHandle glMinSampleShadingARB;
    /**
     * {@code GL_ARB_shader_objects} extension method handles.
     */
    public MethodHandle glDeleteObjectARB, glGetHandleARB, glDetachObjectARB, glCreateShaderObjectARB, glShaderSourceARB, glCompileShaderARB,
        glCreateProgramObjectARB, glAttachObjectARB, glLinkProgramARB, glUseProgramObjectARB, glValidateProgramARB, glUniform1fARB,
        glUniform2fARB, glUniform3fARB, glUniform4fARB, glUniform1iARB, glUniform2iARB, glUniform3iARB, glUniform4iARB, glUniform1fvARB,
        glUniform2fvARB, glUniform3fvARB, glUniform4fvARB, glUniform1ivARB, glUniform2ivARB, glUniform3ivARB, glUniform4ivARB,
        glUniformMatrix2fvARB, glUniformMatrix3fvARB, glUniformMatrix4fvARB, glGetObjectParameterfvARB, glGetObjectParameterivARB, glGetInfoLogARB,
        glGetAttachedObjectsARB, glGetUniformLocationARB, glGetActiveUniformARB, glGetUniformfvARB, glGetUniformivARB, glGetShaderSourceARB;
    /**
     * {@code GL_ARB_shading_language_include} extension method handles.
     */
    public MethodHandle glNamedStringARB, glDeleteNamedStringARB, glCompileShaderIncludeARB, glIsNamedStringARB, glGetNamedStringARB, glGetNamedStringivARB;
    /**
     * {@code GL_ARB_sparse_buffer} extension method handles.
     */
    public MethodHandle glBufferPageCommitmentARB, glNamedBufferPageCommitmentEXT, glNamedBufferPageCommitmentARB;
    /**
     * {@code GL_ARB_sparse_texture} extension method handles.
     */
    public MethodHandle glTexPageCommitmentARB;
    /**
     * {@code GL_ARB_texture_buffer_object} extension method handles.
     */
    public MethodHandle glTexBufferARB;
    /**
     * {@code GL_ARB_texture_compression} extension method handles.
     */
    public MethodHandle glCompressedTexImage3DARB, glCompressedTexImage2DARB, glCompressedTexImage1DARB, glCompressedTexSubImage3DARB,
        glCompressedTexSubImage2DARB, glCompressedTexSubImage1DARB, glGetCompressedTexImageARB;
    /**
     * {@code GL_ARB_transpose_matrix} extension method handles.
     */
    public MethodHandle glLoadTransposeMatrixfARB, glLoadTransposeMatrixdARB, glMultTransposeMatrixfARB, glMultTransposeMatrixdARB;
    /**
     * {@code GL_ARB_vertex_blend} extension method handles.
     */
    public MethodHandle glWeightbvARB, glWeightsvARB, glWeightivARB, glWeightfvARB, glWeightdvARB, glWeightubvARB, glWeightusvARB,
        glWeightuivARB, glWeightPointerARB, glVertexBlendARB;
    /**
     * {@code GL_ARB_vertex_buffer_object} extension method handles.
     */
    public MethodHandle glBindBufferARB, glDeleteBuffersARB, glGenBuffersARB, glIsBufferARB, glBufferDataARB, glBufferSubDataARB,
        glGetBufferSubDataARB, glMapBufferARB, glUnmapBufferARB, glGetBufferParameterivARB, glGetBufferPointervARB;
    /**
     * {@code GL_ARB_vertex_program} extension method handles.
     */
    public MethodHandle glVertexAttrib1dARB, glVertexAttrib1dvARB, glVertexAttrib1fARB, glVertexAttrib1fvARB, glVertexAttrib1sARB, glVertexAttrib1svARB,
        glVertexAttrib2dARB, glVertexAttrib2dvARB, glVertexAttrib2fARB, glVertexAttrib2fvARB, glVertexAttrib2sARB, glVertexAttrib2svARB,
        glVertexAttrib3dARB, glVertexAttrib3dvARB, glVertexAttrib3fARB, glVertexAttrib3fvARB, glVertexAttrib3sARB, glVertexAttrib3svARB,
        glVertexAttrib4NbvARB, glVertexAttrib4NivARB, glVertexAttrib4NsvARB, glVertexAttrib4NubARB, glVertexAttrib4NubvARB, glVertexAttrib4NuivARB,
        glVertexAttrib4NusvARB, glVertexAttrib4bvARB, glVertexAttrib4dARB, glVertexAttrib4dvARB, glVertexAttrib4fARB, glVertexAttrib4fvARB,
        glVertexAttrib4ivARB, glVertexAttrib4sARB, glVertexAttrib4svARB, glVertexAttrib4ubvARB, glVertexAttrib4uivARB, glVertexAttrib4usvARB,
        glVertexAttribPointerARB, glEnableVertexAttribArrayARB, glDisableVertexAttribArrayARB, glGetVertexAttribdvARB, glGetVertexAttribfvARB, glGetVertexAttribivARB,
        glGetVertexAttribPointervARB;
    /**
     * {@code GL_ARB_vertex_shader} extension method handles.
     */
    public MethodHandle glBindAttribLocationARB, glGetActiveAttribARB, glGetAttribLocationARB;
    /**
     * {@code GL_ARB_viewport_array} extension method handles.
     */
    public MethodHandle glDepthRangeArraydvNV, glDepthRangeIndexeddNV;
    /**
     * {@code GL_ARB_window_pos} extension method handles.
     */
    public MethodHandle glWindowPos2dARB, glWindowPos2dvARB, glWindowPos2fARB, glWindowPos2fvARB, glWindowPos2iARB, glWindowPos2ivARB,
        glWindowPos2sARB, glWindowPos2svARB, glWindowPos3dARB, glWindowPos3dvARB, glWindowPos3fARB, glWindowPos3fvARB,
        glWindowPos3iARB, glWindowPos3ivARB, glWindowPos3sARB, glWindowPos3svARB;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region ATI
    ///////////////////////////////////////////////////////////////////////////

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region EXT
    ///////////////////////////////////////////////////////////////////////////

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region GREMEDY
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_GREMEDY_frame_terminator} extension method handles.
     */
    public MethodHandle glFrameTerminatorGREMEDY;
    /**
     * {@code GL_GREMEDY_string_marker} extension method handles.
     */
    public MethodHandle glStringMarkerGREMEDY;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region HP
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_HP_image_transform} extension method handles.
     */
    public MethodHandle glGetImageTransformParameterfvHP, glGetImageTransformParameterivHP, glImageTransformParameterfHP,
        glImageTransformParameterfvHP, glImageTransformParameteriHP, glImageTransformParameterivHP;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region IBM
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_IBM_multimode_draw_arrays} extension method handles.
     */
    public MethodHandle glMultiModeDrawArraysIBM, glMultiModeDrawElementsIBM;
    /**
     * {@code GL_IBM_static_data} extension method handles.
     */
    public MethodHandle glFlushStaticDataIBM;
    /**
     * {@code GL_IBM_vertex_array_lists} extension method handles.
     */
    public MethodHandle glColorPointerListIBM, glEdgeFlagPointerListIBM, glFogCoordPointerListIBM, glIndexPointerListIBM,
        glNormalPointerListIBM, glSecondaryColorPointerListIBM, glTexCoordPointerListIBM, glVertexPointerListIBM;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region INGR
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_INGR_blend_func_separate} extension method handles.
     */
    public MethodHandle glBlendFuncSeparateINGR;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region INTEL
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_INTEL_framebuffer_CMAA} extension method handles.
     */
    public MethodHandle glApplyFramebufferAttachmentCMAAINTEL;
    /**
     * {@code GL_INTEL_map_texture} extension method handles.
     */
    public MethodHandle glMapTexture2DINTEL, glSyncTextureINTEL, glUnmapTexture2DINTEL;
    /**
     * {@code GL_INTEL_parallel_arrays} extension method handles.
     */
    public MethodHandle glColorPointervINTEL, glNormalPointervINTEL, glTexCoordPointervINTEL, glVertexPointervINTEL;
    /**
     * {@code GL_INTEL_performance_query} extension method handles.
     */
    public MethodHandle glBeginPerfQueryINTEL, glCreatePerfQueryINTEL, glDeletePerfQueryINTEL, glEndPerfQueryINTEL, glGetFirstPerfQueryIdINTEL,
        glGetNextPerfQueryIdINTEL, glGetPerfCounterInfoINTEL, glGetPerfQueryDataINTEL, glGetPerfQueryIdByNameINTEL, glGetPerfQueryInfoINTEL;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region KHR
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_KHR_blend_equation_advanced} extension method handles.
     */
    public MethodHandle glBlendBarrierKHR;
    /**
     * {@code GL_KHR_parallel_shader_compile} extension method handles.
     */
    public MethodHandle glMaxShaderCompilerThreadsKHR;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region MESA
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_MESA_framebuffer_flip_y} extension method handles.
     */
    public MethodHandle glFramebufferParameteriMESA, glGetFramebufferParameterivMESA;
    /**
     * {@code GL_MESA_resize_buffers} extension method handles.
     */
    public MethodHandle glResizeBuffersMESA;
    /**
     * {@code GL_MESA_window_pos} extension method handles.
     */
    public MethodHandle glWindowPos2dMESA, glWindowPos2dvMESA, glWindowPos2fMESA, glWindowPos2fvMESA, glWindowPos2iMESA, glWindowPos2ivMESA,
        glWindowPos2sMESA, glWindowPos2svMESA, glWindowPos3dMESA, glWindowPos3dvMESA, glWindowPos3fMESA, glWindowPos3fvMESA,
        glWindowPos3iMESA, glWindowPos3ivMESA, glWindowPos3sMESA, glWindowPos3svMESA, glWindowPos4dMESA, glWindowPos4dvMESA,
        glWindowPos4fMESA, glWindowPos4fvMESA, glWindowPos4iMESA, glWindowPos4ivMESA, glWindowPos4sMESA, glWindowPos4svMESA;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region NV
    ///////////////////////////////////////////////////////////////////////////

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region OES
    ///////////////////////////////////////////////////////////////////////////

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region OVR
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_OVR_multiview} extension method handles.
     */
    public MethodHandle glFramebufferTextureMultiviewOVR;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region PGI
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_PGI_misc_hints} extension method handles.
     */
    public MethodHandle glHintPGI;

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region SGI
    ///////////////////////////////////////////////////////////////////////////

    // endregion

    ///////////////////////////////////////////////////////////////////////////
    // region SUN
    ///////////////////////////////////////////////////////////////////////////

    /**
     * {@code GL_SUNX_constant_data} extension method handles.
     */
    public MethodHandle glFinishTextureSUNX;
    /**
     * {@code GL_SUN_global_alpha} extension method handles.
     */
    public MethodHandle glGlobalAlphaFactorbSUN, glGlobalAlphaFactordSUN, glGlobalAlphaFactorfSUN, glGlobalAlphaFactoriSUN,
        glGlobalAlphaFactorsSUN, glGlobalAlphaFactorubSUN, glGlobalAlphaFactoruiSUN, glGlobalAlphaFactorusSUN;
    /**
     * {@code GL_SUN_mesh_array} extension method handles.
     */
    public MethodHandle glDrawMeshArraysSUN;
    /**
     * {@code GL_SUN_triangle_list} extension method handles.
     */
    public MethodHandle glReplacementCodePointerSUN, glReplacementCodeubSUN, glReplacementCodeubvSUN,
        glReplacementCodeuiSUN, glReplacementCodeuivSUN, glReplacementCodeusSUN, glReplacementCodeusvSUN;
    /**
     * {@code GL_SUN_vertex} extension method handles.
     */
    public MethodHandle glColor3fVertex3fSUN, glColor3fVertex3fvSUN, glColor4fNormal3fVertex3fSUN, glColor4fNormal3fVertex3fvSUN,
        glColor4ubVertex2fSUN, glColor4ubVertex2fvSUN, glColor4ubVertex3fSUN, glColor4ubVertex3fvSUN, glNormal3fVertex3fSUN,
        glNormal3fVertex3fvSUN, glReplacementCodeuiColor3fVertex3fSUN, glReplacementCodeuiColor3fVertex3fvSUN,
        glReplacementCodeuiColor4fNormal3fVertex3fSUN, glReplacementCodeuiColor4fNormal3fVertex3fvSUN, glReplacementCodeuiColor4ubVertex3fSUN,
        glReplacementCodeuiColor4ubVertex3fvSUN, glReplacementCodeuiNormal3fVertex3fSUN, glReplacementCodeuiNormal3fVertex3fvSUN,
        glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN, glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN,
        glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN, glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN,
        glReplacementCodeuiTexCoord2fVertex3fSUN, glReplacementCodeuiTexCoord2fVertex3fvSUN, glReplacementCodeuiVertex3fSUN,
        glReplacementCodeuiVertex3fvSUN, glTexCoord2fColor3fVertex3fSUN, glTexCoord2fColor3fVertex3fvSUN,
        glTexCoord2fColor4fNormal3fVertex3fSUN, glTexCoord2fColor4fNormal3fVertex3fvSUN, glTexCoord2fColor4ubVertex3fSUN,
        glTexCoord2fColor4ubVertex3fvSUN, glTexCoord2fNormal3fVertex3fSUN, glTexCoord2fNormal3fVertex3fvSUN,
        glTexCoord2fVertex3fSUN, glTexCoord2fVertex3fvSUN, glTexCoord4fColor4fNormal3fVertex4fSUN,
        glTexCoord4fColor4fNormal3fVertex4fvSUN, glTexCoord4fVertex4fSUN, glTexCoord4fVertex4fvSUN;

    // endregion

    public final GLCapabilities caps;

    /**
     * Construct <i>incomplete</i> OpenGL extension capabilities.
     *
     * @param caps The parent capabilities.
     */
    public GLExtCaps(GLCapabilities caps) {
        this.caps = caps;
    }

    void load(GLLoadFunc load) {
        GL3DFXTbuffer.load(this, load);
        GLAMDDebugOutput.load(this, load);
        GLAMDDrawBuffersBlend.load(this, load);
        GLAMDFramebufferMultisampleAdvanced.load(this, load);
        GLAMDFramebufferSamplePositions.load(this, load);
        // TODO: GLAMDGpuShaderInt64.load(this, load);
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
        GLARBGPUShaderInt64.load(this, load);
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
        // GLATIDraw_buffers.load(load);
        // GLATIElement_array.load(load);
        // GLATIEnvmap_bumpmap.load(load);
        // GLATIFragment_shader.load(load);
        // GLATIMap_object_buffer.load(load);
        // GLATIPn_triangles.load(load);
        // GLATISeparate_stencil.load(load);
        // GLATIVertex_array_object.load(load);
        // GLATIVertex_attrib_array_object.load(load);
        // GLATIVertex_streams.load(load);
        // GLEXT_EGL_image_storage.load(load);
        // GLEXT_bindable_uniform.load(load);
        // GLEXT_blend_color.load(load);
        // GLEXT_blend_equation_separate.load(load);
        // GLEXT_blend_func_separate.load(load);
        // GLEXT_blend_minmax.load(load);
        // GLEXT_color_subtable.load(load);
        // GLEXT_compiled_vertex_array.load(load);
        // GLEXT_convolution.load(load);
        // GLEXT_coordinate_frame.load(load);
        // GLEXT_copy_texture.load(load);
        // GLEXT_cull_vertex.load(load);
        // GLEXT_debug_label.load(load);
        // GLEXT_debug_marker.load(load);
        // GLEXT_depth_bounds_test.load(load);
        // GLEXT_direct_state_access.load(load);
        // GLEXT_draw_buffers2.load(load);
        // GLEXT_draw_instanced.load(load);
        // GLEXT_draw_range_elements.load(load);
        // GLEXT_external_buffer.load(load);
        // GLEXT_fog_coord.load(load);
        // GLEXT_framebuffer_blit.load(load);
        // GLEXT_framebuffer_multisample.load(load);
        // GLEXT_framebuffer_object.load(load);
        // GLEXT_geometry_shader4.load(load);
        // GLEXT_gpu_program_parameters.load(load);
        // GLEXT_gpu_shader4.load(load);
        // GLEXT_histogram.load(load);
        // GLEXT_index_func.load(load);
        // GLEXT_index_material.load(load);
        // GLEXT_light_texture.load(load);
        // GLEXT_memory_object.load(load);
        // GLEXT_memory_object_fd.load(load);
        // GLEXT_memory_object_win32.load(load);
        // GLEXT_multi_draw_arrays.load(load);
        // GLEXT_multisample.load(load);
        // GLEXT_paletted_texture.load(load);
        // GLEXT_pixel_transform.load(load);
        // GLEXT_point_parameters.load(load);
        // GLEXT_polygon_offset.load(load);
        // GLEXT_polygon_offset_clamp.load(load);
        // GLEXT_provoking_vertex.load(load);
        // GLEXT_raster_multisample.load(load);
        // GLEXT_secondary_color.load(load);
        // GLEXT_semaphore.load(load);
        // GLEXT_semaphore_fd.load(load);
        // GLEXT_semaphore_win32.load(load);
        // GLEXT_separate_shader_objects.load(load);
        // GLEXT_shader_framebuffer_fetch_non_coherent.load(load);
        // GLEXT_shader_image_load_store.load(load);
        // GLEXT_stencil_clear_tag.load(load);
        // GLEXT_stencil_two_side.load(load);
        // GLEXT_subtexture.load(load);
        // GLEXT_texture3D.load(load);
        // GLEXT_texture_array.load(load);
        // GLEXT_texture_buffer_object.load(load);
        // GLEXT_texture_integer.load(load);
        // GLEXT_texture_object.load(load);
        // GLEXT_texture_perturb_normal.load(load);
        // GLEXT_texture_storage.load(load);
        // GLEXT_timer_query.load(load);
        // GLEXT_transform_feedback.load(load);
        // GLEXT_vertex_array.load(load);
        // GLEXT_vertex_attrib_64bit.load(load);
        // GLEXT_vertex_shader.load(load);
        // GLEXT_vertex_weighting.load(load);
        // GLEXT_win32_keyed_mutex.load(load);
        // GLEXT_window_rectangles.load(load);
        // GLEXT_x11_sync_object.load(load);
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
        GLKHRBlendEquationAdvanced.load(this, load);
        GLKHRParallelShaderCompile.load(this, load);
        GLMESAFramebufferFlipY.load(this, load);
        GLMESAResizeBuffers.load(this, load);
        GLMESAWindowPos.load(this, load);
        // GLNVX_conditional_render.load(load);
        // GLNVX_gpu_multicast2.load(load);
        // GLNVX_linked_gpu_multicast.load(load);
        // GLNVX_progress_fence.load(load);
        // GLNV_alpha_to_coverage_dither_control.load(load);
        // GLNV_bindless_multi_draw_indirect.load(load);
        // GLNV_bindless_multi_draw_indirect_count.load(load);
        // GLNV_bindless_texture.load(load);
        // GLNV_blend_equation_advanced.load(load);
        // GLNV_clip_space_w_scaling.load(load);
        // GLNV_command_list.load(load);
        // GLNV_conditional_render.load(load);
        // GLNV_conservative_raster.load(load);
        // GLNV_conservative_raster_dilate.load(load);
        // GLNV_conservative_raster_pre_snap_triangles.load(load);
        // GLNV_copy_image.load(load);
        // GLNV_depth_buffer_float.load(load);
        // GLNV_draw_texture.load(load);
        // GLNV_draw_vulkan_image.load(load);
        // GLNV_evaluators.load(load);
        // GLNV_explicit_multisample.load(load);
        // GLNV_fence.load(load);
        // GLNV_fragment_coverage_to_color.load(load);
        // GLNV_fragment_program.load(load);
        // GLNV_framebuffer_mixed_samples.load(load);
        // GLNV_framebuffer_multisample_coverage.load(load);
        // GLNV_geometry_program4.load(load);
        // GLNV_gpu_multicast.load(load);
        // GLNV_gpu_program4.load(load);
        // GLNV_gpu_program5.load(load);
        // GLNV_gpu_shader5.load(load);
        // GLNV_half_float.load(load);
        // GLNV_internalformat_sample_query.load(load);
        // GLNV_memory_attachment.load(load);
        // GLNV_memory_object_sparse.load(load);
        // GLNV_mesh_shader.load(load);
        // GLNV_occlusion_query.load(load);
        // GLNV_parameter_buffer_object.load(load);
        // GLNV_path_rendering.load(load);
        // GLNV_pixel_data_range.load(load);
        // GLNV_point_sprite.load(load);
        // GLNV_present_video.load(load);
        // GLNV_primitive_restart.load(load);
        // GLNV_query_resource.load(load);
        // GLNV_query_resource_tag.load(load);
        // GLNV_register_combiners.load(load);
        // GLNV_register_combiners2.load(load);
        // GLNV_sample_locations.load(load);
        // GLNV_scissor_exclusive.load(load);
        // GLNV_shader_buffer_load.load(load);
        // GLNV_shading_rate_image.load(load);
        // GLNV_texture_barrier.load(load);
        // GLNV_texture_multisample.load(load);
        // GLNV_timeline_semaphore.load(load);
        // GLNV_transform_feedback.load(load);
        // GLNV_transform_feedback2.load(load);
        // GLNV_vdpau_interop.load(load);
        // GLNV_vdpau_interop2.load(load);
        // GLNV_vertex_array_range.load(load);
        // GLNV_vertex_attrib_integer_64bit.load(load);
        // GLNV_vertex_buffer_unified_memory.load(load);
        // GLNV_vertex_program.load(load);
        // GLNV_vertex_program4.load(load);
        // GLNV_video_capture.load(load);
        // GLNV_viewport_swizzle.load(load);
        // GLOES_byte_coordinates.load(load);
        // GLOES_fixed_point.load(load);
        // GLOES_query_matrix.load(load);
        // GLOES_single_precision.load(load);
        GLOVRMultiview.load(this, load);
        GLPGIMiscHints.load(this, load);
        // GLSGISDetailTexture.load(load);
        // GLSGISFogFunction.load(load);
        // GLSGISMultisample.load(load);
        // GLSGISPixelTexture.load(load);
        // GLSGISPointParameters.load(load);
        // GLSGISSharpenTexture.load(load);
        // GLSGISTexture4D.load(load);
        // GLSGISTextureColorMask.load(load);
        // GLSGISTextureFilter4.load(load);
        // GLSGIXAsync.load(load);
        // GLSGIXFlushRaster.load(load);
        // GLSGIXFragmentLighting.load(load);
        // GLSGIXFramezoom.load(load);
        // GLSGIXIglooInterface.load(load);
        // GLSGIXInstruments.load(load);
        // GLSGIXListPriority.load(load);
        // GLSGIXPixelTexture.load(load);
        // GLSGIXPolynomialFfd.load(load);
        // GLSGIXReferencePlane.load(load);
        // GLSGIXSprite.load(load);
        // GLSGIXTagSampleBuffer.load(load);
        // GLSGIColorTable.load(load);
        GLSUNXConstantData.load(this, load);
        GLSUNGlobalAlpha.load(this, load);
        GLSUNMeshArray.load(this, load);
        GLSUNTriangleList.load(this, load);
        GLSUNVertex.load(this, load);
    }
}
