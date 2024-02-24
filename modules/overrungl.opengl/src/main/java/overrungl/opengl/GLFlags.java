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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl;

/**
 * The OpenGL flags.
 * @since 0.1.0
 */
public final class GLFlags {
    final GLLoadFunc load;
    final boolean foundExtension;
    /** The OpenGL core flags. */
    public final boolean GL10, GL11, GL12, GL13, GL14, GL15,
        GL20, GL21,
        GL30, GL31, GL32, GL33,
        GL40, GL41, GL42, GL43, GL44, GL45, GL46;
    /** The OpenGL extension flags. */
    public final boolean GL_ARB_ES2_compatibility,
        GL_ARB_ES3_1_compatibility,
        GL_ARB_ES3_2_compatibility,
        GL_ARB_ES3_compatibility,
        GL_ARB_arrays_of_arrays,
        GL_ARB_base_instance,
        GL_ARB_bindless_texture,
        GL_ARB_blend_func_extended,
        GL_ARB_buffer_storage,
        GL_ARB_cl_event,
        GL_ARB_clear_buffer_object,
        GL_ARB_clear_texture,
        GL_ARB_clip_control,
        GL_ARB_color_buffer_float,
        GL_ARB_compatibility,
        GL_ARB_compressed_texture_pixel_storage,
        GL_ARB_compute_shader,
        GL_ARB_compute_variable_group_size,
        GL_ARB_conditional_render_inverted,
        GL_ARB_conservative_depth,
        GL_ARB_copy_buffer,
        GL_ARB_copy_image,
        GL_ARB_cull_distance,
        GL_ARB_debug_output,
        GL_ARB_depth_buffer_float,
        GL_ARB_depth_clamp,
        GL_ARB_depth_texture,
        GL_ARB_derivative_control,
        GL_ARB_direct_state_access,
        GL_ARB_draw_buffers,
        GL_ARB_draw_buffers_blend,
        GL_ARB_draw_elements_base_vertex,
        GL_ARB_draw_indirect,
        GL_ARB_draw_instanced,
        GL_ARB_enhanced_layouts,
        GL_ARB_explicit_attrib_location,
        GL_ARB_explicit_uniform_location,
        GL_ARB_fragment_coord_conventions,
        GL_ARB_fragment_layer_viewport,
        GL_ARB_fragment_program,
        GL_ARB_fragment_program_shadow,
        GL_ARB_fragment_shader,
        GL_ARB_fragment_shader_interlock,
        GL_ARB_framebuffer_no_attachments,
        GL_ARB_framebuffer_object,
        GL_ARB_framebuffer_sRGB,
        GL_ARB_geometry_shader4,
        GL_ARB_get_program_binary,
        GL_ARB_get_texture_sub_image,
        GL_ARB_gl_spirv,
        GL_ARB_gpu_shader5,
        GL_ARB_gpu_shader_fp64,
        GL_ARB_gpu_shader_int64,
        GL_ARB_half_float_pixel,
        GL_ARB_half_float_vertex,
        GL_ARB_imaging,
        GL_ARB_indirect_parameters,
        GL_ARB_instanced_arrays,
        GL_ARB_internalformat_query,
        GL_ARB_internalformat_query2,
        GL_ARB_invalidate_subdata,
        GL_ARB_map_buffer_alignment,
        GL_ARB_map_buffer_range,
        GL_ARB_matrix_palette,
        GL_ARB_multi_bind,
        GL_ARB_multi_draw_indirect,
        GL_ARB_multisample,
        GL_ARB_multitexture,
        GL_ARB_occlusion_query,
        GL_ARB_occlusion_query2,
        GL_ARB_parallel_shader_compile,
        GL_ARB_pipeline_statistics_query,
        GL_ARB_pixel_buffer_object,
        GL_ARB_point_parameters,
        GL_ARB_point_sprite,
        GL_ARB_polygon_offset_clamp,
        GL_ARB_post_depth_coverage,
        GL_ARB_program_interface_query,
        GL_ARB_provoking_vertex,
        GL_ARB_query_buffer_object,
        GL_ARB_robust_buffer_access_behavior,
        GL_ARB_robustness,
        GL_ARB_robustness_isolation,
        GL_ARB_sample_locations,
        GL_ARB_sample_shading,
        GL_ARB_sampler_objects,
        GL_ARB_seamless_cube_map,
        GL_ARB_seamless_cubemap_per_texture,
        GL_ARB_separate_shader_objects,
        GL_ARB_shader_atomic_counter_ops,
        GL_ARB_shader_atomic_counters,
        GL_ARB_shader_ballot,
        GL_ARB_shader_bit_encoding,
        GL_ARB_shader_clock,
        GL_ARB_shader_draw_parameters,
        GL_ARB_shader_group_vote,
        GL_ARB_shader_image_load_store,
        GL_ARB_shader_image_size,
        GL_ARB_shader_objects,
        GL_ARB_shader_precision,
        GL_ARB_shader_stencil_export,
        GL_ARB_shader_storage_buffer_object,
        GL_ARB_shader_subroutine,
        GL_ARB_shader_texture_image_samples,
        GL_ARB_shader_texture_lod,
        GL_ARB_shader_viewport_layer_array,
        GL_ARB_shading_language_100,
        GL_ARB_shading_language_420pack,
        GL_ARB_shading_language_include,
        GL_ARB_shading_language_packing,
        GL_ARB_shadow,
        GL_ARB_shadow_ambient,
        GL_ARB_sparse_buffer,
        GL_ARB_sparse_texture,
        GL_ARB_sparse_texture2,
        GL_ARB_sparse_texture_clamp,
        GL_ARB_spirv_extensions,
        GL_ARB_stencil_texturing,
        GL_ARB_sync,
        GL_ARB_tessellation_shader,
        GL_ARB_texture_barrier,
        GL_ARB_texture_border_clamp,
        GL_ARB_texture_buffer_object,
        GL_ARB_texture_buffer_object_rgb32,
        GL_ARB_texture_buffer_range,
        GL_ARB_texture_compression,
        GL_ARB_texture_compression_bptc,
        GL_ARB_texture_compression_rgtc,
        GL_ARB_texture_cube_map,
        GL_ARB_texture_cube_map_array,
        GL_ARB_texture_env_add,
        GL_ARB_texture_env_combine,
        GL_ARB_texture_env_crossbar,
        GL_ARB_texture_env_dot3,
        GL_ARB_texture_filter_anisotropic,
        GL_ARB_texture_filter_minmax,
        GL_ARB_texture_float,
        GL_ARB_texture_gather,
        GL_ARB_texture_mirror_clamp_to_edge,
        GL_ARB_texture_mirrored_repeat,
        GL_ARB_texture_multisample,
        GL_ARB_texture_non_power_of_two,
        GL_ARB_texture_query_levels,
        GL_ARB_texture_query_lod,
        GL_ARB_texture_rectangle,
        GL_ARB_texture_rg,
        GL_ARB_texture_rgb10_a2ui,
        GL_ARB_texture_stencil8,
        GL_ARB_texture_storage,
        GL_ARB_texture_storage_multisample,
        GL_ARB_texture_swizzle,
        GL_ARB_texture_view,
        GL_ARB_timer_query,
        GL_ARB_transform_feedback2,
        GL_ARB_transform_feedback3,
        GL_ARB_transform_feedback_instanced,
        GL_ARB_transform_feedback_overflow_query,
        GL_ARB_transpose_matrix,
        GL_ARB_uniform_buffer_object,
        GL_ARB_vertex_array_bgra,
        GL_ARB_vertex_array_object,
        GL_ARB_vertex_attrib_64bit,
        GL_ARB_vertex_attrib_binding,
        GL_ARB_vertex_blend,
        GL_ARB_vertex_buffer_object,
        GL_ARB_vertex_program,
        GL_ARB_vertex_shader,
        GL_ARB_vertex_type_10f_11f_11f_rev,
        GL_ARB_vertex_type_2_10_10_10_rev,
        GL_ARB_viewport_array,
        GL_ARB_window_pos,
        GL_KHR_blend_equation_advanced,
        GL_KHR_blend_equation_advanced_coherent,
        GL_KHR_context_flush_control,
        GL_KHR_debug,
        GL_KHR_no_error,
        GL_KHR_parallel_shader_compile,
        GL_KHR_robust_buffer_access_behavior,
        GL_KHR_robustness,
        GL_KHR_shader_subgroup,
        GL_KHR_texture_compression_astc_hdr,
        GL_KHR_texture_compression_astc_ldr,
        GL_KHR_texture_compression_astc_sliced_3d,
        GL_OES_byte_coordinates,
        GL_OES_compressed_paletted_texture,
        GL_OES_fixed_point,
        GL_OES_query_matrix,
        GL_OES_read_format,
        GL_OES_single_precision,
        GL_3DFX_multisample,
        GL_3DFX_tbuffer,
        GL_3DFX_texture_compression_FXT1,
        GL_AMD_blend_minmax_factor,
        GL_AMD_conservative_depth,
        GL_AMD_debug_output,
        GL_AMD_depth_clamp_separate,
        GL_AMD_draw_buffers_blend,
        GL_AMD_framebuffer_multisample_advanced,
        GL_AMD_framebuffer_sample_positions,
        GL_AMD_gcn_shader,
        GL_AMD_gpu_shader_half_float,
        GL_AMD_gpu_shader_int16,
        GL_AMD_gpu_shader_int64,
        GL_AMD_interleaved_elements,
        GL_AMD_multi_draw_indirect,
        GL_AMD_name_gen_delete,
        GL_AMD_occlusion_query_event,
        GL_AMD_performance_monitor,
        GL_AMD_pinned_memory,
        GL_AMD_query_buffer_object,
        GL_AMD_sample_positions,
        GL_AMD_seamless_cubemap_per_texture,
        GL_AMD_shader_atomic_counter_ops,
        GL_AMD_shader_ballot,
        GL_AMD_shader_explicit_vertex_parameter,
        GL_AMD_shader_gpu_shader_half_float_fetch,
        GL_AMD_shader_image_load_store_lod,
        GL_AMD_shader_stencil_export,
        GL_AMD_shader_trinary_minmax,
        GL_AMD_sparse_texture,
        GL_AMD_stencil_operation_extended,
        GL_AMD_texture_gather_bias_lod,
        GL_AMD_texture_texture4,
        GL_AMD_transform_feedback3_lines_triangles,
        GL_AMD_transform_feedback4,
        GL_AMD_vertex_shader_layer,
        GL_AMD_vertex_shader_tessellator,
        GL_AMD_vertex_shader_viewport_index,
        GL_APPLE_aux_depth_stencil,
        GL_APPLE_client_storage,
        GL_APPLE_element_array,
        GL_APPLE_fence,
        GL_APPLE_float_pixels,
        GL_APPLE_flush_buffer_range,
        GL_APPLE_object_purgeable,
        GL_APPLE_rgb_422,
        GL_APPLE_row_bytes,
        GL_APPLE_specular_vector,
        GL_APPLE_texture_range,
        GL_APPLE_transform_hint,
        GL_APPLE_vertex_array_object,
        GL_APPLE_vertex_array_range,
        GL_APPLE_vertex_program_evaluators,
        GL_APPLE_ycbcr_422,
        GL_ATI_draw_buffers,
        GL_ATI_element_array,
        GL_ATI_envmap_bumpmap,
        GL_ATI_fragment_shader,
        GL_ATI_map_object_buffer,
        GL_ATI_meminfo,
        GL_ATI_pixel_format_float,
        GL_ATI_pn_triangles,
        GL_ATI_separate_stencil,
        GL_ATI_text_fragment_shader,
        GL_ATI_texture_env_combine3,
        GL_ATI_texture_float,
        GL_ATI_texture_mirror_once,
        GL_ATI_vertex_array_object,
        GL_ATI_vertex_attrib_array_object,
        GL_ATI_vertex_streams,
        GL_EXT_422_pixels,
        GL_EXT_EGL_image_storage,
        GL_EXT_EGL_sync,
        GL_EXT_abgr,
        GL_EXT_bgra,
        GL_EXT_bindable_uniform,
        GL_EXT_blend_color,
        GL_EXT_blend_equation_separate,
        GL_EXT_blend_func_separate,
        GL_EXT_blend_logic_op,
        GL_EXT_blend_minmax,
        GL_EXT_blend_subtract,
        GL_EXT_clip_volume_hint,
        GL_EXT_cmyka,
        GL_EXT_color_subtable,
        GL_EXT_compiled_vertex_array,
        GL_EXT_convolution,
        GL_EXT_coordinate_frame,
        GL_EXT_copy_texture,
        GL_EXT_cull_vertex,
        GL_EXT_debug_label,
        GL_EXT_debug_marker,
        GL_EXT_depth_bounds_test,
        GL_EXT_direct_state_access,
        GL_EXT_draw_buffers2,
        GL_EXT_draw_instanced,
        GL_EXT_draw_range_elements,
        GL_EXT_external_buffer,
        GL_EXT_fog_coord,
        GL_EXT_framebuffer_blit,
        GL_EXT_framebuffer_blit_layers,
        GL_EXT_framebuffer_multisample,
        GL_EXT_framebuffer_multisample_blit_scaled,
        GL_EXT_framebuffer_object,
        GL_EXT_framebuffer_sRGB,
        GL_EXT_geometry_shader4,
        GL_EXT_gpu_program_parameters,
        GL_EXT_gpu_shader4,
        GL_EXT_histogram,
        GL_EXT_index_array_formats,
        GL_EXT_index_func,
        GL_EXT_index_material,
        GL_EXT_index_texture,
        GL_EXT_light_texture,
        GL_EXT_memory_object,
        GL_EXT_memory_object_fd,
        GL_EXT_memory_object_win32,
        GL_EXT_misc_attribute,
        GL_EXT_multi_draw_arrays,
        GL_EXT_multisample,
        GL_EXT_multiview_tessellation_geometry_shader,
        GL_EXT_multiview_texture_multisample,
        GL_EXT_multiview_timer_query,
        GL_EXT_packed_depth_stencil,
        GL_EXT_packed_float,
        GL_EXT_packed_pixels,
        GL_EXT_paletted_texture,
        GL_EXT_pixel_buffer_object,
        GL_EXT_pixel_transform,
        GL_EXT_pixel_transform_color_table,
        GL_EXT_point_parameters,
        GL_EXT_polygon_offset,
        GL_EXT_polygon_offset_clamp,
        GL_EXT_post_depth_coverage,
        GL_EXT_provoking_vertex,
        GL_EXT_raster_multisample,
        GL_EXT_rescale_normal,
        GL_EXT_secondary_color,
        GL_EXT_semaphore,
        GL_EXT_semaphore_fd,
        GL_EXT_semaphore_win32,
        GL_EXT_separate_shader_objects,
        GL_EXT_separate_specular_color,
        GL_EXT_shader_framebuffer_fetch,
        GL_EXT_shader_framebuffer_fetch_non_coherent,
        GL_EXT_shader_image_load_formatted,
        GL_EXT_shader_image_load_store,
        GL_EXT_shader_integer_mix,
        GL_EXT_shader_samples_identical,
        GL_EXT_shadow_funcs,
        GL_EXT_shared_texture_palette,
        GL_EXT_sparse_texture2,
        GL_EXT_stencil_clear_tag,
        GL_EXT_stencil_two_side,
        GL_EXT_stencil_wrap,
        GL_EXT_subtexture,
        GL_EXT_texture,
        GL_EXT_texture3D,
        GL_EXT_texture_array,
        GL_EXT_texture_buffer_object,
        GL_EXT_texture_compression_latc,
        GL_EXT_texture_compression_rgtc,
        GL_EXT_texture_compression_s3tc,
        GL_EXT_texture_cube_map,
        GL_EXT_texture_env_add,
        GL_EXT_texture_env_combine,
        GL_EXT_texture_env_dot3,
        GL_EXT_texture_filter_anisotropic,
        GL_EXT_texture_filter_minmax,
        GL_EXT_texture_integer,
        GL_EXT_texture_lod_bias,
        GL_EXT_texture_mirror_clamp,
        GL_EXT_texture_object,
        GL_EXT_texture_perturb_normal,
        GL_EXT_texture_sRGB,
        GL_EXT_texture_sRGB_R8,
        GL_EXT_texture_sRGB_RG8,
        GL_EXT_texture_sRGB_decode,
        GL_EXT_texture_shadow_lod,
        GL_EXT_texture_shared_exponent,
        GL_EXT_texture_snorm,
        GL_EXT_texture_storage,
        GL_EXT_texture_swizzle,
        GL_EXT_timer_query,
        GL_EXT_transform_feedback,
        GL_EXT_vertex_array,
        GL_EXT_vertex_array_bgra,
        GL_EXT_vertex_attrib_64bit,
        GL_EXT_vertex_shader,
        GL_EXT_vertex_weighting,
        GL_EXT_win32_keyed_mutex,
        GL_EXT_window_rectangles,
        GL_EXT_x11_sync_object,
        GL_GREMEDY_frame_terminator,
        GL_GREMEDY_string_marker,
        GL_HP_convolution_border_modes,
        GL_HP_image_transform,
        GL_HP_occlusion_test,
        GL_HP_texture_lighting,
        GL_IBM_cull_vertex,
        GL_IBM_multimode_draw_arrays,
        GL_IBM_rasterpos_clip,
        GL_IBM_static_data,
        GL_IBM_texture_mirrored_repeat,
        GL_IBM_vertex_array_lists,
        GL_INGR_blend_func_separate,
        GL_INGR_color_clamp,
        GL_INGR_interlace_read,
        GL_INTEL_blackhole_render,
        GL_INTEL_conservative_rasterization,
        GL_INTEL_fragment_shader_ordering,
        GL_INTEL_framebuffer_CMAA,
        GL_INTEL_map_texture,
        GL_INTEL_parallel_arrays,
        GL_INTEL_performance_query,
        GL_MESAX_texture_stack,
        GL_MESA_framebuffer_flip_x,
        GL_MESA_framebuffer_flip_y,
        GL_MESA_framebuffer_swap_xy,
        GL_MESA_pack_invert,
        GL_MESA_program_binary_formats,
        GL_MESA_resize_buffers,
        GL_MESA_shader_integer_functions,
        GL_MESA_tile_raster_order,
        GL_MESA_window_pos,
        GL_MESA_ycbcr_texture,
        GL_NVX_blend_equation_advanced_multi_draw_buffers,
        GL_NVX_conditional_render,
        GL_NVX_gpu_memory_info,
        GL_NVX_gpu_multicast2,
        GL_NVX_linked_gpu_multicast,
        GL_NVX_progress_fence,
        GL_NV_alpha_to_coverage_dither_control,
        GL_NV_bindless_multi_draw_indirect,
        GL_NV_bindless_multi_draw_indirect_count,
        GL_NV_bindless_texture,
        GL_NV_blend_equation_advanced,
        GL_NV_blend_equation_advanced_coherent,
        GL_NV_blend_minmax_factor,
        GL_NV_blend_square,
        GL_NV_clip_space_w_scaling,
        GL_NV_command_list,
        GL_NV_compute_program5,
        GL_NV_compute_shader_derivatives,
        GL_NV_conditional_render,
        GL_NV_conservative_raster,
        GL_NV_conservative_raster_dilate,
        GL_NV_conservative_raster_pre_snap,
        GL_NV_conservative_raster_pre_snap_triangles,
        GL_NV_conservative_raster_underestimation,
        GL_NV_copy_depth_to_color,
        GL_NV_copy_image,
        GL_NV_deep_texture3D,
        GL_NV_depth_buffer_float,
        GL_NV_depth_clamp,
        GL_NV_draw_texture,
        GL_NV_draw_vulkan_image,
        GL_NV_evaluators,
        GL_NV_explicit_multisample,
        GL_NV_fence,
        GL_NV_fill_rectangle,
        GL_NV_float_buffer,
        GL_NV_fog_distance,
        GL_NV_fragment_coverage_to_color,
        GL_NV_fragment_program,
        GL_NV_fragment_program2,
        GL_NV_fragment_program4,
        GL_NV_fragment_program_option,
        GL_NV_fragment_shader_barycentric,
        GL_NV_fragment_shader_interlock,
        GL_NV_framebuffer_mixed_samples,
        GL_NV_framebuffer_multisample_coverage,
        GL_NV_geometry_program4,
        GL_NV_geometry_shader4,
        GL_NV_geometry_shader_passthrough,
        GL_NV_gpu_multicast,
        GL_NV_gpu_program4,
        GL_NV_gpu_program5,
        GL_NV_gpu_program5_mem_extended,
        GL_NV_gpu_shader5,
        GL_NV_half_float,
        GL_NV_internalformat_sample_query,
        GL_NV_light_max_exponent,
        GL_NV_memory_attachment,
        GL_NV_memory_object_sparse,
        GL_NV_mesh_shader,
        GL_NV_multisample_coverage,
        GL_NV_multisample_filter_hint,
        GL_NV_occlusion_query,
        GL_NV_packed_depth_stencil,
        GL_NV_parameter_buffer_object,
        GL_NV_parameter_buffer_object2,
        GL_NV_path_rendering,
        GL_NV_path_rendering_shared_edge,
        GL_NV_pixel_data_range,
        GL_NV_point_sprite,
        GL_NV_present_video,
        GL_NV_primitive_restart,
        GL_NV_primitive_shading_rate,
        GL_NV_query_resource,
        GL_NV_query_resource_tag,
        GL_NV_register_combiners,
        GL_NV_register_combiners2,
        GL_NV_representative_fragment_test,
        GL_NV_robustness_video_memory_purge,
        GL_NV_sample_locations,
        GL_NV_sample_mask_override_coverage,
        GL_NV_scissor_exclusive,
        GL_NV_shader_atomic_counters,
        GL_NV_shader_atomic_float,
        GL_NV_shader_atomic_float64,
        GL_NV_shader_atomic_fp16_vector,
        GL_NV_shader_atomic_int64,
        GL_NV_shader_buffer_load,
        GL_NV_shader_buffer_store,
        GL_NV_shader_storage_buffer_object,
        GL_NV_shader_subgroup_partitioned,
        GL_NV_shader_texture_footprint,
        GL_NV_shader_thread_group,
        GL_NV_shader_thread_shuffle,
        GL_NV_shading_rate_image,
        GL_NV_stereo_view_rendering,
        GL_NV_tessellation_program5,
        GL_NV_texgen_emboss,
        GL_NV_texgen_reflection,
        GL_NV_texture_barrier,
        GL_NV_texture_compression_vtc,
        GL_NV_texture_env_combine4,
        GL_NV_texture_expand_normal,
        GL_NV_texture_multisample,
        GL_NV_texture_rectangle,
        GL_NV_texture_rectangle_compressed,
        GL_NV_texture_shader,
        GL_NV_texture_shader2,
        GL_NV_texture_shader3,
        GL_NV_timeline_semaphore,
        GL_NV_transform_feedback,
        GL_NV_transform_feedback2,
        GL_NV_uniform_buffer_std430_layout,
        GL_NV_uniform_buffer_unified_memory,
        GL_NV_vdpau_interop,
        GL_NV_vdpau_interop2,
        GL_NV_vertex_array_range,
        GL_NV_vertex_array_range2,
        GL_NV_vertex_attrib_integer_64bit,
        GL_NV_vertex_buffer_unified_memory,
        GL_NV_vertex_program,
        GL_NV_vertex_program1_1,
        GL_NV_vertex_program2,
        GL_NV_vertex_program2_option,
        GL_NV_vertex_program3,
        GL_NV_vertex_program4,
        GL_NV_video_capture,
        GL_NV_viewport_array2,
        GL_NV_viewport_swizzle,
        GL_OML_interlace,
        GL_OML_resample,
        GL_OML_subsample,
        GL_OVR_multiview,
        GL_OVR_multiview2,
        GL_PGI_misc_hints,
        GL_PGI_vertex_hints,
        GL_REND_screen_coordinates,
        GL_S3_s3tc,
        GL_SGIS_detail_texture,
        GL_SGIS_fog_function,
        GL_SGIS_generate_mipmap,
        GL_SGIS_multisample,
        GL_SGIS_pixel_texture,
        GL_SGIS_point_line_texgen,
        GL_SGIS_point_parameters,
        GL_SGIS_sharpen_texture,
        GL_SGIS_texture4D,
        GL_SGIS_texture_border_clamp,
        GL_SGIS_texture_color_mask,
        GL_SGIS_texture_edge_clamp,
        GL_SGIS_texture_filter4,
        GL_SGIS_texture_lod,
        GL_SGIS_texture_select,
        GL_SGIX_async,
        GL_SGIX_async_histogram,
        GL_SGIX_async_pixel,
        GL_SGIX_blend_alpha_minmax,
        GL_SGIX_calligraphic_fragment,
        GL_SGIX_clipmap,
        GL_SGIX_convolution_accuracy,
        GL_SGIX_depth_pass_instrument,
        GL_SGIX_depth_texture,
        GL_SGIX_flush_raster,
        GL_SGIX_fog_offset,
        GL_SGIX_fragment_lighting,
        GL_SGIX_framezoom,
        GL_SGIX_igloo_interface,
        GL_SGIX_instruments,
        GL_SGIX_interlace,
        GL_SGIX_ir_instrument1,
        GL_SGIX_list_priority,
        GL_SGIX_pixel_texture,
        GL_SGIX_pixel_tiles,
        GL_SGIX_polynomial_ffd,
        GL_SGIX_reference_plane,
        GL_SGIX_resample,
        GL_SGIX_scalebias_hint,
        GL_SGIX_shadow,
        GL_SGIX_shadow_ambient,
        GL_SGIX_sprite,
        GL_SGIX_subsample,
        GL_SGIX_tag_sample_buffer,
        GL_SGIX_texture_add_env,
        GL_SGIX_texture_coordinate_clamp,
        GL_SGIX_texture_lod_bias,
        GL_SGIX_texture_multi_buffer,
        GL_SGIX_texture_scale_bias,
        GL_SGIX_vertex_preclip,
        GL_SGIX_ycrcb,
        GL_SGIX_ycrcb_subsample,
        GL_SGIX_ycrcba,
        GL_SGI_color_matrix,
        GL_SGI_color_table,
        GL_SGI_texture_color_table,
        GL_SUNX_constant_data,
        GL_SUN_convolution_border_modes,
        GL_SUN_global_alpha,
        GL_SUN_mesh_array,
        GL_SUN_slice_accum,
        GL_SUN_triangle_list,
        GL_SUN_vertex,
        GL_WIN_phong_shading,
        GL_WIN_specular_fog;

    /**
     * Construct OpenGL flags.
     *
     * @param load the function where to find OpenGL functions.
     */
    GLFlags(GLLoadFunc load) {
        this.load = load;
        var core = GLFinder.findCoreGL(load);
        int major = core.x();
        int minor = core.y();
        this.GL10 = (major == 1 && minor >= 0) || major > 1;
        this.GL11 = (major == 1 && minor >= 1) || major > 1;
        this.GL12 = (major == 1 && minor >= 2) || major > 1;
        this.GL13 = (major == 1 && minor >= 3) || major > 1;
        this.GL14 = (major == 1 && minor >= 4) || major > 1;
        this.GL15 = (major == 1 && minor >= 5) || major > 1;
        this.GL20 = (major == 2 && minor >= 0) || major > 2;
        this.GL21 = (major == 2 && minor >= 1) || major > 2;
        this.GL30 = (major == 3 && minor >= 0) || major > 3;
        this.GL31 = (major == 3 && minor >= 1) || major > 3;
        this.GL32 = (major == 3 && minor >= 2) || major > 3;
        this.GL33 = (major == 3 && minor >= 3) || major > 3;
        this.GL40 = (major == 4 && minor >= 0) || major > 4;
        this.GL41 = (major == 4 && minor >= 1) || major > 4;
        this.GL42 = (major == 4 && minor >= 2) || major > 4;
        this.GL43 = (major == 4 && minor >= 3) || major > 4;
        this.GL44 = (major == 4 && minor >= 4) || major > 4;
        this.GL45 = (major == 4 && minor >= 5) || major > 4;
        this.GL46 = (major == 4 && minor >= 6) || major > 4;
        var list = new java.util.ArrayList<String>(700);
        this.foundExtension = GLFinder.getExtensions(load, major, list);
        this.GL_ARB_ES2_compatibility = this.foundExtension && list.contains("GL_ARB_ES2_compatibility");
        this.GL_ARB_ES3_1_compatibility = this.foundExtension && list.contains("GL_ARB_ES3_1_compatibility");
        this.GL_ARB_ES3_2_compatibility = this.foundExtension && list.contains("GL_ARB_ES3_2_compatibility");
        this.GL_ARB_ES3_compatibility = this.foundExtension && list.contains("GL_ARB_ES3_compatibility");
        this.GL_ARB_arrays_of_arrays = this.foundExtension && list.contains("GL_ARB_arrays_of_arrays");
        this.GL_ARB_base_instance = this.foundExtension && list.contains("GL_ARB_base_instance");
        this.GL_ARB_bindless_texture = this.foundExtension && list.contains("GL_ARB_bindless_texture");
        this.GL_ARB_blend_func_extended = this.foundExtension && list.contains("GL_ARB_blend_func_extended");
        this.GL_ARB_buffer_storage = this.foundExtension && list.contains("GL_ARB_buffer_storage");
        this.GL_ARB_cl_event = this.foundExtension && list.contains("GL_ARB_cl_event");
        this.GL_ARB_clear_buffer_object = this.foundExtension && list.contains("GL_ARB_clear_buffer_object");
        this.GL_ARB_clear_texture = this.foundExtension && list.contains("GL_ARB_clear_texture");
        this.GL_ARB_clip_control = this.foundExtension && list.contains("GL_ARB_clip_control");
        this.GL_ARB_color_buffer_float = this.foundExtension && list.contains("GL_ARB_color_buffer_float");
        this.GL_ARB_compatibility = this.foundExtension && list.contains("GL_ARB_compatibility");
        this.GL_ARB_compressed_texture_pixel_storage = this.foundExtension && list.contains("GL_ARB_compressed_texture_pixel_storage");
        this.GL_ARB_compute_shader = this.foundExtension && list.contains("GL_ARB_compute_shader");
        this.GL_ARB_compute_variable_group_size = this.foundExtension && list.contains("GL_ARB_compute_variable_group_size");
        this.GL_ARB_conditional_render_inverted = this.foundExtension && list.contains("GL_ARB_conditional_render_inverted");
        this.GL_ARB_conservative_depth = this.foundExtension && list.contains("GL_ARB_conservative_depth");
        this.GL_ARB_copy_buffer = this.foundExtension && list.contains("GL_ARB_copy_buffer");
        this.GL_ARB_copy_image = this.foundExtension && list.contains("GL_ARB_copy_image");
        this.GL_ARB_cull_distance = this.foundExtension && list.contains("GL_ARB_cull_distance");
        this.GL_ARB_debug_output = this.foundExtension && list.contains("GL_ARB_debug_output");
        this.GL_ARB_depth_buffer_float = this.foundExtension && list.contains("GL_ARB_depth_buffer_float");
        this.GL_ARB_depth_clamp = this.foundExtension && list.contains("GL_ARB_depth_clamp");
        this.GL_ARB_depth_texture = this.foundExtension && list.contains("GL_ARB_depth_texture");
        this.GL_ARB_derivative_control = this.foundExtension && list.contains("GL_ARB_derivative_control");
        this.GL_ARB_direct_state_access = this.foundExtension && list.contains("GL_ARB_direct_state_access");
        this.GL_ARB_draw_buffers = this.foundExtension && list.contains("GL_ARB_draw_buffers");
        this.GL_ARB_draw_buffers_blend = this.foundExtension && list.contains("GL_ARB_draw_buffers_blend");
        this.GL_ARB_draw_elements_base_vertex = this.foundExtension && list.contains("GL_ARB_draw_elements_base_vertex");
        this.GL_ARB_draw_indirect = this.foundExtension && list.contains("GL_ARB_draw_indirect");
        this.GL_ARB_draw_instanced = this.foundExtension && list.contains("GL_ARB_draw_instanced");
        this.GL_ARB_enhanced_layouts = this.foundExtension && list.contains("GL_ARB_enhanced_layouts");
        this.GL_ARB_explicit_attrib_location = this.foundExtension && list.contains("GL_ARB_explicit_attrib_location");
        this.GL_ARB_explicit_uniform_location = this.foundExtension && list.contains("GL_ARB_explicit_uniform_location");
        this.GL_ARB_fragment_coord_conventions = this.foundExtension && list.contains("GL_ARB_fragment_coord_conventions");
        this.GL_ARB_fragment_layer_viewport = this.foundExtension && list.contains("GL_ARB_fragment_layer_viewport");
        this.GL_ARB_fragment_program = this.foundExtension && list.contains("GL_ARB_fragment_program");
        this.GL_ARB_fragment_program_shadow = this.foundExtension && list.contains("GL_ARB_fragment_program_shadow");
        this.GL_ARB_fragment_shader = this.foundExtension && list.contains("GL_ARB_fragment_shader");
        this.GL_ARB_fragment_shader_interlock = this.foundExtension && list.contains("GL_ARB_fragment_shader_interlock");
        this.GL_ARB_framebuffer_no_attachments = this.foundExtension && list.contains("GL_ARB_framebuffer_no_attachments");
        this.GL_ARB_framebuffer_object = this.foundExtension && list.contains("GL_ARB_framebuffer_object");
        this.GL_ARB_framebuffer_sRGB = this.foundExtension && list.contains("GL_ARB_framebuffer_sRGB");
        this.GL_ARB_geometry_shader4 = this.foundExtension && list.contains("GL_ARB_geometry_shader4");
        this.GL_ARB_get_program_binary = this.foundExtension && list.contains("GL_ARB_get_program_binary");
        this.GL_ARB_get_texture_sub_image = this.foundExtension && list.contains("GL_ARB_get_texture_sub_image");
        this.GL_ARB_gl_spirv = this.foundExtension && list.contains("GL_ARB_gl_spirv");
        this.GL_ARB_gpu_shader5 = this.foundExtension && list.contains("GL_ARB_gpu_shader5");
        this.GL_ARB_gpu_shader_fp64 = this.foundExtension && list.contains("GL_ARB_gpu_shader_fp64");
        this.GL_ARB_gpu_shader_int64 = this.foundExtension && list.contains("GL_ARB_gpu_shader_int64");
        this.GL_ARB_half_float_pixel = this.foundExtension && list.contains("GL_ARB_half_float_pixel");
        this.GL_ARB_half_float_vertex = this.foundExtension && list.contains("GL_ARB_half_float_vertex");
        this.GL_ARB_imaging = this.foundExtension && list.contains("GL_ARB_imaging");
        this.GL_ARB_indirect_parameters = this.foundExtension && list.contains("GL_ARB_indirect_parameters");
        this.GL_ARB_instanced_arrays = this.foundExtension && list.contains("GL_ARB_instanced_arrays");
        this.GL_ARB_internalformat_query = this.foundExtension && list.contains("GL_ARB_internalformat_query");
        this.GL_ARB_internalformat_query2 = this.foundExtension && list.contains("GL_ARB_internalformat_query2");
        this.GL_ARB_invalidate_subdata = this.foundExtension && list.contains("GL_ARB_invalidate_subdata");
        this.GL_ARB_map_buffer_alignment = this.foundExtension && list.contains("GL_ARB_map_buffer_alignment");
        this.GL_ARB_map_buffer_range = this.foundExtension && list.contains("GL_ARB_map_buffer_range");
        this.GL_ARB_matrix_palette = this.foundExtension && list.contains("GL_ARB_matrix_palette");
        this.GL_ARB_multi_bind = this.foundExtension && list.contains("GL_ARB_multi_bind");
        this.GL_ARB_multi_draw_indirect = this.foundExtension && list.contains("GL_ARB_multi_draw_indirect");
        this.GL_ARB_multisample = this.foundExtension && list.contains("GL_ARB_multisample");
        this.GL_ARB_multitexture = this.foundExtension && list.contains("GL_ARB_multitexture");
        this.GL_ARB_occlusion_query = this.foundExtension && list.contains("GL_ARB_occlusion_query");
        this.GL_ARB_occlusion_query2 = this.foundExtension && list.contains("GL_ARB_occlusion_query2");
        this.GL_ARB_parallel_shader_compile = this.foundExtension && list.contains("GL_ARB_parallel_shader_compile");
        this.GL_ARB_pipeline_statistics_query = this.foundExtension && list.contains("GL_ARB_pipeline_statistics_query");
        this.GL_ARB_pixel_buffer_object = this.foundExtension && list.contains("GL_ARB_pixel_buffer_object");
        this.GL_ARB_point_parameters = this.foundExtension && list.contains("GL_ARB_point_parameters");
        this.GL_ARB_point_sprite = this.foundExtension && list.contains("GL_ARB_point_sprite");
        this.GL_ARB_polygon_offset_clamp = this.foundExtension && list.contains("GL_ARB_polygon_offset_clamp");
        this.GL_ARB_post_depth_coverage = this.foundExtension && list.contains("GL_ARB_post_depth_coverage");
        this.GL_ARB_program_interface_query = this.foundExtension && list.contains("GL_ARB_program_interface_query");
        this.GL_ARB_provoking_vertex = this.foundExtension && list.contains("GL_ARB_provoking_vertex");
        this.GL_ARB_query_buffer_object = this.foundExtension && list.contains("GL_ARB_query_buffer_object");
        this.GL_ARB_robust_buffer_access_behavior = this.foundExtension && list.contains("GL_ARB_robust_buffer_access_behavior");
        this.GL_ARB_robustness = this.foundExtension && list.contains("GL_ARB_robustness");
        this.GL_ARB_robustness_isolation = this.foundExtension && list.contains("GL_ARB_robustness_isolation");
        this.GL_ARB_sample_locations = this.foundExtension && list.contains("GL_ARB_sample_locations");
        this.GL_ARB_sample_shading = this.foundExtension && list.contains("GL_ARB_sample_shading");
        this.GL_ARB_sampler_objects = this.foundExtension && list.contains("GL_ARB_sampler_objects");
        this.GL_ARB_seamless_cube_map = this.foundExtension && list.contains("GL_ARB_seamless_cube_map");
        this.GL_ARB_seamless_cubemap_per_texture = this.foundExtension && list.contains("GL_ARB_seamless_cubemap_per_texture");
        this.GL_ARB_separate_shader_objects = this.foundExtension && list.contains("GL_ARB_separate_shader_objects");
        this.GL_ARB_shader_atomic_counter_ops = this.foundExtension && list.contains("GL_ARB_shader_atomic_counter_ops");
        this.GL_ARB_shader_atomic_counters = this.foundExtension && list.contains("GL_ARB_shader_atomic_counters");
        this.GL_ARB_shader_ballot = this.foundExtension && list.contains("GL_ARB_shader_ballot");
        this.GL_ARB_shader_bit_encoding = this.foundExtension && list.contains("GL_ARB_shader_bit_encoding");
        this.GL_ARB_shader_clock = this.foundExtension && list.contains("GL_ARB_shader_clock");
        this.GL_ARB_shader_draw_parameters = this.foundExtension && list.contains("GL_ARB_shader_draw_parameters");
        this.GL_ARB_shader_group_vote = this.foundExtension && list.contains("GL_ARB_shader_group_vote");
        this.GL_ARB_shader_image_load_store = this.foundExtension && list.contains("GL_ARB_shader_image_load_store");
        this.GL_ARB_shader_image_size = this.foundExtension && list.contains("GL_ARB_shader_image_size");
        this.GL_ARB_shader_objects = this.foundExtension && list.contains("GL_ARB_shader_objects");
        this.GL_ARB_shader_precision = this.foundExtension && list.contains("GL_ARB_shader_precision");
        this.GL_ARB_shader_stencil_export = this.foundExtension && list.contains("GL_ARB_shader_stencil_export");
        this.GL_ARB_shader_storage_buffer_object = this.foundExtension && list.contains("GL_ARB_shader_storage_buffer_object");
        this.GL_ARB_shader_subroutine = this.foundExtension && list.contains("GL_ARB_shader_subroutine");
        this.GL_ARB_shader_texture_image_samples = this.foundExtension && list.contains("GL_ARB_shader_texture_image_samples");
        this.GL_ARB_shader_texture_lod = this.foundExtension && list.contains("GL_ARB_shader_texture_lod");
        this.GL_ARB_shader_viewport_layer_array = this.foundExtension && list.contains("GL_ARB_shader_viewport_layer_array");
        this.GL_ARB_shading_language_100 = this.foundExtension && list.contains("GL_ARB_shading_language_100");
        this.GL_ARB_shading_language_420pack = this.foundExtension && list.contains("GL_ARB_shading_language_420pack");
        this.GL_ARB_shading_language_include = this.foundExtension && list.contains("GL_ARB_shading_language_include");
        this.GL_ARB_shading_language_packing = this.foundExtension && list.contains("GL_ARB_shading_language_packing");
        this.GL_ARB_shadow = this.foundExtension && list.contains("GL_ARB_shadow");
        this.GL_ARB_shadow_ambient = this.foundExtension && list.contains("GL_ARB_shadow_ambient");
        this.GL_ARB_sparse_buffer = this.foundExtension && list.contains("GL_ARB_sparse_buffer");
        this.GL_ARB_sparse_texture = this.foundExtension && list.contains("GL_ARB_sparse_texture");
        this.GL_ARB_sparse_texture2 = this.foundExtension && list.contains("GL_ARB_sparse_texture2");
        this.GL_ARB_sparse_texture_clamp = this.foundExtension && list.contains("GL_ARB_sparse_texture_clamp");
        this.GL_ARB_spirv_extensions = this.foundExtension && list.contains("GL_ARB_spirv_extensions");
        this.GL_ARB_stencil_texturing = this.foundExtension && list.contains("GL_ARB_stencil_texturing");
        this.GL_ARB_sync = this.foundExtension && list.contains("GL_ARB_sync");
        this.GL_ARB_tessellation_shader = this.foundExtension && list.contains("GL_ARB_tessellation_shader");
        this.GL_ARB_texture_barrier = this.foundExtension && list.contains("GL_ARB_texture_barrier");
        this.GL_ARB_texture_border_clamp = this.foundExtension && list.contains("GL_ARB_texture_border_clamp");
        this.GL_ARB_texture_buffer_object = this.foundExtension && list.contains("GL_ARB_texture_buffer_object");
        this.GL_ARB_texture_buffer_object_rgb32 = this.foundExtension && list.contains("GL_ARB_texture_buffer_object_rgb32");
        this.GL_ARB_texture_buffer_range = this.foundExtension && list.contains("GL_ARB_texture_buffer_range");
        this.GL_ARB_texture_compression = this.foundExtension && list.contains("GL_ARB_texture_compression");
        this.GL_ARB_texture_compression_bptc = this.foundExtension && list.contains("GL_ARB_texture_compression_bptc");
        this.GL_ARB_texture_compression_rgtc = this.foundExtension && list.contains("GL_ARB_texture_compression_rgtc");
        this.GL_ARB_texture_cube_map = this.foundExtension && list.contains("GL_ARB_texture_cube_map");
        this.GL_ARB_texture_cube_map_array = this.foundExtension && list.contains("GL_ARB_texture_cube_map_array");
        this.GL_ARB_texture_env_add = this.foundExtension && list.contains("GL_ARB_texture_env_add");
        this.GL_ARB_texture_env_combine = this.foundExtension && list.contains("GL_ARB_texture_env_combine");
        this.GL_ARB_texture_env_crossbar = this.foundExtension && list.contains("GL_ARB_texture_env_crossbar");
        this.GL_ARB_texture_env_dot3 = this.foundExtension && list.contains("GL_ARB_texture_env_dot3");
        this.GL_ARB_texture_filter_anisotropic = this.foundExtension && list.contains("GL_ARB_texture_filter_anisotropic");
        this.GL_ARB_texture_filter_minmax = this.foundExtension && list.contains("GL_ARB_texture_filter_minmax");
        this.GL_ARB_texture_float = this.foundExtension && list.contains("GL_ARB_texture_float");
        this.GL_ARB_texture_gather = this.foundExtension && list.contains("GL_ARB_texture_gather");
        this.GL_ARB_texture_mirror_clamp_to_edge = this.foundExtension && list.contains("GL_ARB_texture_mirror_clamp_to_edge");
        this.GL_ARB_texture_mirrored_repeat = this.foundExtension && list.contains("GL_ARB_texture_mirrored_repeat");
        this.GL_ARB_texture_multisample = this.foundExtension && list.contains("GL_ARB_texture_multisample");
        this.GL_ARB_texture_non_power_of_two = this.foundExtension && list.contains("GL_ARB_texture_non_power_of_two");
        this.GL_ARB_texture_query_levels = this.foundExtension && list.contains("GL_ARB_texture_query_levels");
        this.GL_ARB_texture_query_lod = this.foundExtension && list.contains("GL_ARB_texture_query_lod");
        this.GL_ARB_texture_rectangle = this.foundExtension && list.contains("GL_ARB_texture_rectangle");
        this.GL_ARB_texture_rg = this.foundExtension && list.contains("GL_ARB_texture_rg");
        this.GL_ARB_texture_rgb10_a2ui = this.foundExtension && list.contains("GL_ARB_texture_rgb10_a2ui");
        this.GL_ARB_texture_stencil8 = this.foundExtension && list.contains("GL_ARB_texture_stencil8");
        this.GL_ARB_texture_storage = this.foundExtension && list.contains("GL_ARB_texture_storage");
        this.GL_ARB_texture_storage_multisample = this.foundExtension && list.contains("GL_ARB_texture_storage_multisample");
        this.GL_ARB_texture_swizzle = this.foundExtension && list.contains("GL_ARB_texture_swizzle");
        this.GL_ARB_texture_view = this.foundExtension && list.contains("GL_ARB_texture_view");
        this.GL_ARB_timer_query = this.foundExtension && list.contains("GL_ARB_timer_query");
        this.GL_ARB_transform_feedback2 = this.foundExtension && list.contains("GL_ARB_transform_feedback2");
        this.GL_ARB_transform_feedback3 = this.foundExtension && list.contains("GL_ARB_transform_feedback3");
        this.GL_ARB_transform_feedback_instanced = this.foundExtension && list.contains("GL_ARB_transform_feedback_instanced");
        this.GL_ARB_transform_feedback_overflow_query = this.foundExtension && list.contains("GL_ARB_transform_feedback_overflow_query");
        this.GL_ARB_transpose_matrix = this.foundExtension && list.contains("GL_ARB_transpose_matrix");
        this.GL_ARB_uniform_buffer_object = this.foundExtension && list.contains("GL_ARB_uniform_buffer_object");
        this.GL_ARB_vertex_array_bgra = this.foundExtension && list.contains("GL_ARB_vertex_array_bgra");
        this.GL_ARB_vertex_array_object = this.foundExtension && list.contains("GL_ARB_vertex_array_object");
        this.GL_ARB_vertex_attrib_64bit = this.foundExtension && list.contains("GL_ARB_vertex_attrib_64bit");
        this.GL_ARB_vertex_attrib_binding = this.foundExtension && list.contains("GL_ARB_vertex_attrib_binding");
        this.GL_ARB_vertex_blend = this.foundExtension && list.contains("GL_ARB_vertex_blend");
        this.GL_ARB_vertex_buffer_object = this.foundExtension && list.contains("GL_ARB_vertex_buffer_object");
        this.GL_ARB_vertex_program = this.foundExtension && list.contains("GL_ARB_vertex_program");
        this.GL_ARB_vertex_shader = this.foundExtension && list.contains("GL_ARB_vertex_shader");
        this.GL_ARB_vertex_type_10f_11f_11f_rev = this.foundExtension && list.contains("GL_ARB_vertex_type_10f_11f_11f_rev");
        this.GL_ARB_vertex_type_2_10_10_10_rev = this.foundExtension && list.contains("GL_ARB_vertex_type_2_10_10_10_rev");
        this.GL_ARB_viewport_array = this.foundExtension && list.contains("GL_ARB_viewport_array");
        this.GL_ARB_window_pos = this.foundExtension && list.contains("GL_ARB_window_pos");
        this.GL_KHR_blend_equation_advanced = this.foundExtension && list.contains("GL_KHR_blend_equation_advanced");
        this.GL_KHR_blend_equation_advanced_coherent = this.foundExtension && list.contains("GL_KHR_blend_equation_advanced_coherent");
        this.GL_KHR_context_flush_control = this.foundExtension && list.contains("GL_KHR_context_flush_control");
        this.GL_KHR_debug = this.foundExtension && list.contains("GL_KHR_debug");
        this.GL_KHR_no_error = this.foundExtension && list.contains("GL_KHR_no_error");
        this.GL_KHR_parallel_shader_compile = this.foundExtension && list.contains("GL_KHR_parallel_shader_compile");
        this.GL_KHR_robust_buffer_access_behavior = this.foundExtension && list.contains("GL_KHR_robust_buffer_access_behavior");
        this.GL_KHR_robustness = this.foundExtension && list.contains("GL_KHR_robustness");
        this.GL_KHR_shader_subgroup = this.foundExtension && list.contains("GL_KHR_shader_subgroup");
        this.GL_KHR_texture_compression_astc_hdr = this.foundExtension && list.contains("GL_KHR_texture_compression_astc_hdr");
        this.GL_KHR_texture_compression_astc_ldr = this.foundExtension && list.contains("GL_KHR_texture_compression_astc_ldr");
        this.GL_KHR_texture_compression_astc_sliced_3d = this.foundExtension && list.contains("GL_KHR_texture_compression_astc_sliced_3d");
        this.GL_OES_byte_coordinates = this.foundExtension && list.contains("GL_OES_byte_coordinates");
        this.GL_OES_compressed_paletted_texture = this.foundExtension && list.contains("GL_OES_compressed_paletted_texture");
        this.GL_OES_fixed_point = this.foundExtension && list.contains("GL_OES_fixed_point");
        this.GL_OES_query_matrix = this.foundExtension && list.contains("GL_OES_query_matrix");
        this.GL_OES_read_format = this.foundExtension && list.contains("GL_OES_read_format");
        this.GL_OES_single_precision = this.foundExtension && list.contains("GL_OES_single_precision");
        this.GL_3DFX_multisample = this.foundExtension && list.contains("GL_3DFX_multisample");
        this.GL_3DFX_tbuffer = this.foundExtension && list.contains("GL_3DFX_tbuffer");
        this.GL_3DFX_texture_compression_FXT1 = this.foundExtension && list.contains("GL_3DFX_texture_compression_FXT1");
        this.GL_AMD_blend_minmax_factor = this.foundExtension && list.contains("GL_AMD_blend_minmax_factor");
        this.GL_AMD_conservative_depth = this.foundExtension && list.contains("GL_AMD_conservative_depth");
        this.GL_AMD_debug_output = this.foundExtension && list.contains("GL_AMD_debug_output");
        this.GL_AMD_depth_clamp_separate = this.foundExtension && list.contains("GL_AMD_depth_clamp_separate");
        this.GL_AMD_draw_buffers_blend = this.foundExtension && list.contains("GL_AMD_draw_buffers_blend");
        this.GL_AMD_framebuffer_multisample_advanced = this.foundExtension && list.contains("GL_AMD_framebuffer_multisample_advanced");
        this.GL_AMD_framebuffer_sample_positions = this.foundExtension && list.contains("GL_AMD_framebuffer_sample_positions");
        this.GL_AMD_gcn_shader = this.foundExtension && list.contains("GL_AMD_gcn_shader");
        this.GL_AMD_gpu_shader_half_float = this.foundExtension && list.contains("GL_AMD_gpu_shader_half_float");
        this.GL_AMD_gpu_shader_int16 = this.foundExtension && list.contains("GL_AMD_gpu_shader_int16");
        this.GL_AMD_gpu_shader_int64 = this.foundExtension && list.contains("GL_AMD_gpu_shader_int64");
        this.GL_AMD_interleaved_elements = this.foundExtension && list.contains("GL_AMD_interleaved_elements");
        this.GL_AMD_multi_draw_indirect = this.foundExtension && list.contains("GL_AMD_multi_draw_indirect");
        this.GL_AMD_name_gen_delete = this.foundExtension && list.contains("GL_AMD_name_gen_delete");
        this.GL_AMD_occlusion_query_event = this.foundExtension && list.contains("GL_AMD_occlusion_query_event");
        this.GL_AMD_performance_monitor = this.foundExtension && list.contains("GL_AMD_performance_monitor");
        this.GL_AMD_pinned_memory = this.foundExtension && list.contains("GL_AMD_pinned_memory");
        this.GL_AMD_query_buffer_object = this.foundExtension && list.contains("GL_AMD_query_buffer_object");
        this.GL_AMD_sample_positions = this.foundExtension && list.contains("GL_AMD_sample_positions");
        this.GL_AMD_seamless_cubemap_per_texture = this.foundExtension && list.contains("GL_AMD_seamless_cubemap_per_texture");
        this.GL_AMD_shader_atomic_counter_ops = this.foundExtension && list.contains("GL_AMD_shader_atomic_counter_ops");
        this.GL_AMD_shader_ballot = this.foundExtension && list.contains("GL_AMD_shader_ballot");
        this.GL_AMD_shader_explicit_vertex_parameter = this.foundExtension && list.contains("GL_AMD_shader_explicit_vertex_parameter");
        this.GL_AMD_shader_gpu_shader_half_float_fetch = this.foundExtension && list.contains("GL_AMD_shader_gpu_shader_half_float_fetch");
        this.GL_AMD_shader_image_load_store_lod = this.foundExtension && list.contains("GL_AMD_shader_image_load_store_lod");
        this.GL_AMD_shader_stencil_export = this.foundExtension && list.contains("GL_AMD_shader_stencil_export");
        this.GL_AMD_shader_trinary_minmax = this.foundExtension && list.contains("GL_AMD_shader_trinary_minmax");
        this.GL_AMD_sparse_texture = this.foundExtension && list.contains("GL_AMD_sparse_texture");
        this.GL_AMD_stencil_operation_extended = this.foundExtension && list.contains("GL_AMD_stencil_operation_extended");
        this.GL_AMD_texture_gather_bias_lod = this.foundExtension && list.contains("GL_AMD_texture_gather_bias_lod");
        this.GL_AMD_texture_texture4 = this.foundExtension && list.contains("GL_AMD_texture_texture4");
        this.GL_AMD_transform_feedback3_lines_triangles = this.foundExtension && list.contains("GL_AMD_transform_feedback3_lines_triangles");
        this.GL_AMD_transform_feedback4 = this.foundExtension && list.contains("GL_AMD_transform_feedback4");
        this.GL_AMD_vertex_shader_layer = this.foundExtension && list.contains("GL_AMD_vertex_shader_layer");
        this.GL_AMD_vertex_shader_tessellator = this.foundExtension && list.contains("GL_AMD_vertex_shader_tessellator");
        this.GL_AMD_vertex_shader_viewport_index = this.foundExtension && list.contains("GL_AMD_vertex_shader_viewport_index");
        this.GL_APPLE_aux_depth_stencil = this.foundExtension && list.contains("GL_APPLE_aux_depth_stencil");
        this.GL_APPLE_client_storage = this.foundExtension && list.contains("GL_APPLE_client_storage");
        this.GL_APPLE_element_array = this.foundExtension && list.contains("GL_APPLE_element_array");
        this.GL_APPLE_fence = this.foundExtension && list.contains("GL_APPLE_fence");
        this.GL_APPLE_float_pixels = this.foundExtension && list.contains("GL_APPLE_float_pixels");
        this.GL_APPLE_flush_buffer_range = this.foundExtension && list.contains("GL_APPLE_flush_buffer_range");
        this.GL_APPLE_object_purgeable = this.foundExtension && list.contains("GL_APPLE_object_purgeable");
        this.GL_APPLE_rgb_422 = this.foundExtension && list.contains("GL_APPLE_rgb_422");
        this.GL_APPLE_row_bytes = this.foundExtension && list.contains("GL_APPLE_row_bytes");
        this.GL_APPLE_specular_vector = this.foundExtension && list.contains("GL_APPLE_specular_vector");
        this.GL_APPLE_texture_range = this.foundExtension && list.contains("GL_APPLE_texture_range");
        this.GL_APPLE_transform_hint = this.foundExtension && list.contains("GL_APPLE_transform_hint");
        this.GL_APPLE_vertex_array_object = this.foundExtension && list.contains("GL_APPLE_vertex_array_object");
        this.GL_APPLE_vertex_array_range = this.foundExtension && list.contains("GL_APPLE_vertex_array_range");
        this.GL_APPLE_vertex_program_evaluators = this.foundExtension && list.contains("GL_APPLE_vertex_program_evaluators");
        this.GL_APPLE_ycbcr_422 = this.foundExtension && list.contains("GL_APPLE_ycbcr_422");
        this.GL_ATI_draw_buffers = this.foundExtension && list.contains("GL_ATI_draw_buffers");
        this.GL_ATI_element_array = this.foundExtension && list.contains("GL_ATI_element_array");
        this.GL_ATI_envmap_bumpmap = this.foundExtension && list.contains("GL_ATI_envmap_bumpmap");
        this.GL_ATI_fragment_shader = this.foundExtension && list.contains("GL_ATI_fragment_shader");
        this.GL_ATI_map_object_buffer = this.foundExtension && list.contains("GL_ATI_map_object_buffer");
        this.GL_ATI_meminfo = this.foundExtension && list.contains("GL_ATI_meminfo");
        this.GL_ATI_pixel_format_float = this.foundExtension && list.contains("GL_ATI_pixel_format_float");
        this.GL_ATI_pn_triangles = this.foundExtension && list.contains("GL_ATI_pn_triangles");
        this.GL_ATI_separate_stencil = this.foundExtension && list.contains("GL_ATI_separate_stencil");
        this.GL_ATI_text_fragment_shader = this.foundExtension && list.contains("GL_ATI_text_fragment_shader");
        this.GL_ATI_texture_env_combine3 = this.foundExtension && list.contains("GL_ATI_texture_env_combine3");
        this.GL_ATI_texture_float = this.foundExtension && list.contains("GL_ATI_texture_float");
        this.GL_ATI_texture_mirror_once = this.foundExtension && list.contains("GL_ATI_texture_mirror_once");
        this.GL_ATI_vertex_array_object = this.foundExtension && list.contains("GL_ATI_vertex_array_object");
        this.GL_ATI_vertex_attrib_array_object = this.foundExtension && list.contains("GL_ATI_vertex_attrib_array_object");
        this.GL_ATI_vertex_streams = this.foundExtension && list.contains("GL_ATI_vertex_streams");
        this.GL_EXT_422_pixels = this.foundExtension && list.contains("GL_EXT_422_pixels");
        this.GL_EXT_EGL_image_storage = this.foundExtension && list.contains("GL_EXT_EGL_image_storage");
        this.GL_EXT_EGL_sync = this.foundExtension && list.contains("GL_EXT_EGL_sync");
        this.GL_EXT_abgr = this.foundExtension && list.contains("GL_EXT_abgr");
        this.GL_EXT_bgra = this.foundExtension && list.contains("GL_EXT_bgra");
        this.GL_EXT_bindable_uniform = this.foundExtension && list.contains("GL_EXT_bindable_uniform");
        this.GL_EXT_blend_color = this.foundExtension && list.contains("GL_EXT_blend_color");
        this.GL_EXT_blend_equation_separate = this.foundExtension && list.contains("GL_EXT_blend_equation_separate");
        this.GL_EXT_blend_func_separate = this.foundExtension && list.contains("GL_EXT_blend_func_separate");
        this.GL_EXT_blend_logic_op = this.foundExtension && list.contains("GL_EXT_blend_logic_op");
        this.GL_EXT_blend_minmax = this.foundExtension && list.contains("GL_EXT_blend_minmax");
        this.GL_EXT_blend_subtract = this.foundExtension && list.contains("GL_EXT_blend_subtract");
        this.GL_EXT_clip_volume_hint = this.foundExtension && list.contains("GL_EXT_clip_volume_hint");
        this.GL_EXT_cmyka = this.foundExtension && list.contains("GL_EXT_cmyka");
        this.GL_EXT_color_subtable = this.foundExtension && list.contains("GL_EXT_color_subtable");
        this.GL_EXT_compiled_vertex_array = this.foundExtension && list.contains("GL_EXT_compiled_vertex_array");
        this.GL_EXT_convolution = this.foundExtension && list.contains("GL_EXT_convolution");
        this.GL_EXT_coordinate_frame = this.foundExtension && list.contains("GL_EXT_coordinate_frame");
        this.GL_EXT_copy_texture = this.foundExtension && list.contains("GL_EXT_copy_texture");
        this.GL_EXT_cull_vertex = this.foundExtension && list.contains("GL_EXT_cull_vertex");
        this.GL_EXT_debug_label = this.foundExtension && list.contains("GL_EXT_debug_label");
        this.GL_EXT_debug_marker = this.foundExtension && list.contains("GL_EXT_debug_marker");
        this.GL_EXT_depth_bounds_test = this.foundExtension && list.contains("GL_EXT_depth_bounds_test");
        this.GL_EXT_direct_state_access = this.foundExtension && list.contains("GL_EXT_direct_state_access");
        this.GL_EXT_draw_buffers2 = this.foundExtension && list.contains("GL_EXT_draw_buffers2");
        this.GL_EXT_draw_instanced = this.foundExtension && list.contains("GL_EXT_draw_instanced");
        this.GL_EXT_draw_range_elements = this.foundExtension && list.contains("GL_EXT_draw_range_elements");
        this.GL_EXT_external_buffer = this.foundExtension && list.contains("GL_EXT_external_buffer");
        this.GL_EXT_fog_coord = this.foundExtension && list.contains("GL_EXT_fog_coord");
        this.GL_EXT_framebuffer_blit = this.foundExtension && list.contains("GL_EXT_framebuffer_blit");
        this.GL_EXT_framebuffer_blit_layers = this.foundExtension && list.contains("GL_EXT_framebuffer_blit_layers");
        this.GL_EXT_framebuffer_multisample = this.foundExtension && list.contains("GL_EXT_framebuffer_multisample");
        this.GL_EXT_framebuffer_multisample_blit_scaled = this.foundExtension && list.contains("GL_EXT_framebuffer_multisample_blit_scaled");
        this.GL_EXT_framebuffer_object = this.foundExtension && list.contains("GL_EXT_framebuffer_object");
        this.GL_EXT_framebuffer_sRGB = this.foundExtension && list.contains("GL_EXT_framebuffer_sRGB");
        this.GL_EXT_geometry_shader4 = this.foundExtension && list.contains("GL_EXT_geometry_shader4");
        this.GL_EXT_gpu_program_parameters = this.foundExtension && list.contains("GL_EXT_gpu_program_parameters");
        this.GL_EXT_gpu_shader4 = this.foundExtension && list.contains("GL_EXT_gpu_shader4");
        this.GL_EXT_histogram = this.foundExtension && list.contains("GL_EXT_histogram");
        this.GL_EXT_index_array_formats = this.foundExtension && list.contains("GL_EXT_index_array_formats");
        this.GL_EXT_index_func = this.foundExtension && list.contains("GL_EXT_index_func");
        this.GL_EXT_index_material = this.foundExtension && list.contains("GL_EXT_index_material");
        this.GL_EXT_index_texture = this.foundExtension && list.contains("GL_EXT_index_texture");
        this.GL_EXT_light_texture = this.foundExtension && list.contains("GL_EXT_light_texture");
        this.GL_EXT_memory_object = this.foundExtension && list.contains("GL_EXT_memory_object");
        this.GL_EXT_memory_object_fd = this.foundExtension && list.contains("GL_EXT_memory_object_fd");
        this.GL_EXT_memory_object_win32 = this.foundExtension && list.contains("GL_EXT_memory_object_win32");
        this.GL_EXT_misc_attribute = this.foundExtension && list.contains("GL_EXT_misc_attribute");
        this.GL_EXT_multi_draw_arrays = this.foundExtension && list.contains("GL_EXT_multi_draw_arrays");
        this.GL_EXT_multisample = this.foundExtension && list.contains("GL_EXT_multisample");
        this.GL_EXT_multiview_tessellation_geometry_shader = this.foundExtension && list.contains("GL_EXT_multiview_tessellation_geometry_shader");
        this.GL_EXT_multiview_texture_multisample = this.foundExtension && list.contains("GL_EXT_multiview_texture_multisample");
        this.GL_EXT_multiview_timer_query = this.foundExtension && list.contains("GL_EXT_multiview_timer_query");
        this.GL_EXT_packed_depth_stencil = this.foundExtension && list.contains("GL_EXT_packed_depth_stencil");
        this.GL_EXT_packed_float = this.foundExtension && list.contains("GL_EXT_packed_float");
        this.GL_EXT_packed_pixels = this.foundExtension && list.contains("GL_EXT_packed_pixels");
        this.GL_EXT_paletted_texture = this.foundExtension && list.contains("GL_EXT_paletted_texture");
        this.GL_EXT_pixel_buffer_object = this.foundExtension && list.contains("GL_EXT_pixel_buffer_object");
        this.GL_EXT_pixel_transform = this.foundExtension && list.contains("GL_EXT_pixel_transform");
        this.GL_EXT_pixel_transform_color_table = this.foundExtension && list.contains("GL_EXT_pixel_transform_color_table");
        this.GL_EXT_point_parameters = this.foundExtension && list.contains("GL_EXT_point_parameters");
        this.GL_EXT_polygon_offset = this.foundExtension && list.contains("GL_EXT_polygon_offset");
        this.GL_EXT_polygon_offset_clamp = this.foundExtension && list.contains("GL_EXT_polygon_offset_clamp");
        this.GL_EXT_post_depth_coverage = this.foundExtension && list.contains("GL_EXT_post_depth_coverage");
        this.GL_EXT_provoking_vertex = this.foundExtension && list.contains("GL_EXT_provoking_vertex");
        this.GL_EXT_raster_multisample = this.foundExtension && list.contains("GL_EXT_raster_multisample");
        this.GL_EXT_rescale_normal = this.foundExtension && list.contains("GL_EXT_rescale_normal");
        this.GL_EXT_secondary_color = this.foundExtension && list.contains("GL_EXT_secondary_color");
        this.GL_EXT_semaphore = this.foundExtension && list.contains("GL_EXT_semaphore");
        this.GL_EXT_semaphore_fd = this.foundExtension && list.contains("GL_EXT_semaphore_fd");
        this.GL_EXT_semaphore_win32 = this.foundExtension && list.contains("GL_EXT_semaphore_win32");
        this.GL_EXT_separate_shader_objects = this.foundExtension && list.contains("GL_EXT_separate_shader_objects");
        this.GL_EXT_separate_specular_color = this.foundExtension && list.contains("GL_EXT_separate_specular_color");
        this.GL_EXT_shader_framebuffer_fetch = this.foundExtension && list.contains("GL_EXT_shader_framebuffer_fetch");
        this.GL_EXT_shader_framebuffer_fetch_non_coherent = this.foundExtension && list.contains("GL_EXT_shader_framebuffer_fetch_non_coherent");
        this.GL_EXT_shader_image_load_formatted = this.foundExtension && list.contains("GL_EXT_shader_image_load_formatted");
        this.GL_EXT_shader_image_load_store = this.foundExtension && list.contains("GL_EXT_shader_image_load_store");
        this.GL_EXT_shader_integer_mix = this.foundExtension && list.contains("GL_EXT_shader_integer_mix");
        this.GL_EXT_shader_samples_identical = this.foundExtension && list.contains("GL_EXT_shader_samples_identical");
        this.GL_EXT_shadow_funcs = this.foundExtension && list.contains("GL_EXT_shadow_funcs");
        this.GL_EXT_shared_texture_palette = this.foundExtension && list.contains("GL_EXT_shared_texture_palette");
        this.GL_EXT_sparse_texture2 = this.foundExtension && list.contains("GL_EXT_sparse_texture2");
        this.GL_EXT_stencil_clear_tag = this.foundExtension && list.contains("GL_EXT_stencil_clear_tag");
        this.GL_EXT_stencil_two_side = this.foundExtension && list.contains("GL_EXT_stencil_two_side");
        this.GL_EXT_stencil_wrap = this.foundExtension && list.contains("GL_EXT_stencil_wrap");
        this.GL_EXT_subtexture = this.foundExtension && list.contains("GL_EXT_subtexture");
        this.GL_EXT_texture = this.foundExtension && list.contains("GL_EXT_texture");
        this.GL_EXT_texture3D = this.foundExtension && list.contains("GL_EXT_texture3D");
        this.GL_EXT_texture_array = this.foundExtension && list.contains("GL_EXT_texture_array");
        this.GL_EXT_texture_buffer_object = this.foundExtension && list.contains("GL_EXT_texture_buffer_object");
        this.GL_EXT_texture_compression_latc = this.foundExtension && list.contains("GL_EXT_texture_compression_latc");
        this.GL_EXT_texture_compression_rgtc = this.foundExtension && list.contains("GL_EXT_texture_compression_rgtc");
        this.GL_EXT_texture_compression_s3tc = this.foundExtension && list.contains("GL_EXT_texture_compression_s3tc");
        this.GL_EXT_texture_cube_map = this.foundExtension && list.contains("GL_EXT_texture_cube_map");
        this.GL_EXT_texture_env_add = this.foundExtension && list.contains("GL_EXT_texture_env_add");
        this.GL_EXT_texture_env_combine = this.foundExtension && list.contains("GL_EXT_texture_env_combine");
        this.GL_EXT_texture_env_dot3 = this.foundExtension && list.contains("GL_EXT_texture_env_dot3");
        this.GL_EXT_texture_filter_anisotropic = this.foundExtension && list.contains("GL_EXT_texture_filter_anisotropic");
        this.GL_EXT_texture_filter_minmax = this.foundExtension && list.contains("GL_EXT_texture_filter_minmax");
        this.GL_EXT_texture_integer = this.foundExtension && list.contains("GL_EXT_texture_integer");
        this.GL_EXT_texture_lod_bias = this.foundExtension && list.contains("GL_EXT_texture_lod_bias");
        this.GL_EXT_texture_mirror_clamp = this.foundExtension && list.contains("GL_EXT_texture_mirror_clamp");
        this.GL_EXT_texture_object = this.foundExtension && list.contains("GL_EXT_texture_object");
        this.GL_EXT_texture_perturb_normal = this.foundExtension && list.contains("GL_EXT_texture_perturb_normal");
        this.GL_EXT_texture_sRGB = this.foundExtension && list.contains("GL_EXT_texture_sRGB");
        this.GL_EXT_texture_sRGB_R8 = this.foundExtension && list.contains("GL_EXT_texture_sRGB_R8");
        this.GL_EXT_texture_sRGB_RG8 = this.foundExtension && list.contains("GL_EXT_texture_sRGB_RG8");
        this.GL_EXT_texture_sRGB_decode = this.foundExtension && list.contains("GL_EXT_texture_sRGB_decode");
        this.GL_EXT_texture_shadow_lod = this.foundExtension && list.contains("GL_EXT_texture_shadow_lod");
        this.GL_EXT_texture_shared_exponent = this.foundExtension && list.contains("GL_EXT_texture_shared_exponent");
        this.GL_EXT_texture_snorm = this.foundExtension && list.contains("GL_EXT_texture_snorm");
        this.GL_EXT_texture_storage = this.foundExtension && list.contains("GL_EXT_texture_storage");
        this.GL_EXT_texture_swizzle = this.foundExtension && list.contains("GL_EXT_texture_swizzle");
        this.GL_EXT_timer_query = this.foundExtension && list.contains("GL_EXT_timer_query");
        this.GL_EXT_transform_feedback = this.foundExtension && list.contains("GL_EXT_transform_feedback");
        this.GL_EXT_vertex_array = this.foundExtension && list.contains("GL_EXT_vertex_array");
        this.GL_EXT_vertex_array_bgra = this.foundExtension && list.contains("GL_EXT_vertex_array_bgra");
        this.GL_EXT_vertex_attrib_64bit = this.foundExtension && list.contains("GL_EXT_vertex_attrib_64bit");
        this.GL_EXT_vertex_shader = this.foundExtension && list.contains("GL_EXT_vertex_shader");
        this.GL_EXT_vertex_weighting = this.foundExtension && list.contains("GL_EXT_vertex_weighting");
        this.GL_EXT_win32_keyed_mutex = this.foundExtension && list.contains("GL_EXT_win32_keyed_mutex");
        this.GL_EXT_window_rectangles = this.foundExtension && list.contains("GL_EXT_window_rectangles");
        this.GL_EXT_x11_sync_object = this.foundExtension && list.contains("GL_EXT_x11_sync_object");
        this.GL_GREMEDY_frame_terminator = this.foundExtension && list.contains("GL_GREMEDY_frame_terminator");
        this.GL_GREMEDY_string_marker = this.foundExtension && list.contains("GL_GREMEDY_string_marker");
        this.GL_HP_convolution_border_modes = this.foundExtension && list.contains("GL_HP_convolution_border_modes");
        this.GL_HP_image_transform = this.foundExtension && list.contains("GL_HP_image_transform");
        this.GL_HP_occlusion_test = this.foundExtension && list.contains("GL_HP_occlusion_test");
        this.GL_HP_texture_lighting = this.foundExtension && list.contains("GL_HP_texture_lighting");
        this.GL_IBM_cull_vertex = this.foundExtension && list.contains("GL_IBM_cull_vertex");
        this.GL_IBM_multimode_draw_arrays = this.foundExtension && list.contains("GL_IBM_multimode_draw_arrays");
        this.GL_IBM_rasterpos_clip = this.foundExtension && list.contains("GL_IBM_rasterpos_clip");
        this.GL_IBM_static_data = this.foundExtension && list.contains("GL_IBM_static_data");
        this.GL_IBM_texture_mirrored_repeat = this.foundExtension && list.contains("GL_IBM_texture_mirrored_repeat");
        this.GL_IBM_vertex_array_lists = this.foundExtension && list.contains("GL_IBM_vertex_array_lists");
        this.GL_INGR_blend_func_separate = this.foundExtension && list.contains("GL_INGR_blend_func_separate");
        this.GL_INGR_color_clamp = this.foundExtension && list.contains("GL_INGR_color_clamp");
        this.GL_INGR_interlace_read = this.foundExtension && list.contains("GL_INGR_interlace_read");
        this.GL_INTEL_blackhole_render = this.foundExtension && list.contains("GL_INTEL_blackhole_render");
        this.GL_INTEL_conservative_rasterization = this.foundExtension && list.contains("GL_INTEL_conservative_rasterization");
        this.GL_INTEL_fragment_shader_ordering = this.foundExtension && list.contains("GL_INTEL_fragment_shader_ordering");
        this.GL_INTEL_framebuffer_CMAA = this.foundExtension && list.contains("GL_INTEL_framebuffer_CMAA");
        this.GL_INTEL_map_texture = this.foundExtension && list.contains("GL_INTEL_map_texture");
        this.GL_INTEL_parallel_arrays = this.foundExtension && list.contains("GL_INTEL_parallel_arrays");
        this.GL_INTEL_performance_query = this.foundExtension && list.contains("GL_INTEL_performance_query");
        this.GL_MESAX_texture_stack = this.foundExtension && list.contains("GL_MESAX_texture_stack");
        this.GL_MESA_framebuffer_flip_x = this.foundExtension && list.contains("GL_MESA_framebuffer_flip_x");
        this.GL_MESA_framebuffer_flip_y = this.foundExtension && list.contains("GL_MESA_framebuffer_flip_y");
        this.GL_MESA_framebuffer_swap_xy = this.foundExtension && list.contains("GL_MESA_framebuffer_swap_xy");
        this.GL_MESA_pack_invert = this.foundExtension && list.contains("GL_MESA_pack_invert");
        this.GL_MESA_program_binary_formats = this.foundExtension && list.contains("GL_MESA_program_binary_formats");
        this.GL_MESA_resize_buffers = this.foundExtension && list.contains("GL_MESA_resize_buffers");
        this.GL_MESA_shader_integer_functions = this.foundExtension && list.contains("GL_MESA_shader_integer_functions");
        this.GL_MESA_tile_raster_order = this.foundExtension && list.contains("GL_MESA_tile_raster_order");
        this.GL_MESA_window_pos = this.foundExtension && list.contains("GL_MESA_window_pos");
        this.GL_MESA_ycbcr_texture = this.foundExtension && list.contains("GL_MESA_ycbcr_texture");
        this.GL_NVX_blend_equation_advanced_multi_draw_buffers = this.foundExtension && list.contains("GL_NVX_blend_equation_advanced_multi_draw_buffers");
        this.GL_NVX_conditional_render = this.foundExtension && list.contains("GL_NVX_conditional_render");
        this.GL_NVX_gpu_memory_info = this.foundExtension && list.contains("GL_NVX_gpu_memory_info");
        this.GL_NVX_gpu_multicast2 = this.foundExtension && list.contains("GL_NVX_gpu_multicast2");
        this.GL_NVX_linked_gpu_multicast = this.foundExtension && list.contains("GL_NVX_linked_gpu_multicast");
        this.GL_NVX_progress_fence = this.foundExtension && list.contains("GL_NVX_progress_fence");
        this.GL_NV_alpha_to_coverage_dither_control = this.foundExtension && list.contains("GL_NV_alpha_to_coverage_dither_control");
        this.GL_NV_bindless_multi_draw_indirect = this.foundExtension && list.contains("GL_NV_bindless_multi_draw_indirect");
        this.GL_NV_bindless_multi_draw_indirect_count = this.foundExtension && list.contains("GL_NV_bindless_multi_draw_indirect_count");
        this.GL_NV_bindless_texture = this.foundExtension && list.contains("GL_NV_bindless_texture");
        this.GL_NV_blend_equation_advanced = this.foundExtension && list.contains("GL_NV_blend_equation_advanced");
        this.GL_NV_blend_equation_advanced_coherent = this.foundExtension && list.contains("GL_NV_blend_equation_advanced_coherent");
        this.GL_NV_blend_minmax_factor = this.foundExtension && list.contains("GL_NV_blend_minmax_factor");
        this.GL_NV_blend_square = this.foundExtension && list.contains("GL_NV_blend_square");
        this.GL_NV_clip_space_w_scaling = this.foundExtension && list.contains("GL_NV_clip_space_w_scaling");
        this.GL_NV_command_list = this.foundExtension && list.contains("GL_NV_command_list");
        this.GL_NV_compute_program5 = this.foundExtension && list.contains("GL_NV_compute_program5");
        this.GL_NV_compute_shader_derivatives = this.foundExtension && list.contains("GL_NV_compute_shader_derivatives");
        this.GL_NV_conditional_render = this.foundExtension && list.contains("GL_NV_conditional_render");
        this.GL_NV_conservative_raster = this.foundExtension && list.contains("GL_NV_conservative_raster");
        this.GL_NV_conservative_raster_dilate = this.foundExtension && list.contains("GL_NV_conservative_raster_dilate");
        this.GL_NV_conservative_raster_pre_snap = this.foundExtension && list.contains("GL_NV_conservative_raster_pre_snap");
        this.GL_NV_conservative_raster_pre_snap_triangles = this.foundExtension && list.contains("GL_NV_conservative_raster_pre_snap_triangles");
        this.GL_NV_conservative_raster_underestimation = this.foundExtension && list.contains("GL_NV_conservative_raster_underestimation");
        this.GL_NV_copy_depth_to_color = this.foundExtension && list.contains("GL_NV_copy_depth_to_color");
        this.GL_NV_copy_image = this.foundExtension && list.contains("GL_NV_copy_image");
        this.GL_NV_deep_texture3D = this.foundExtension && list.contains("GL_NV_deep_texture3D");
        this.GL_NV_depth_buffer_float = this.foundExtension && list.contains("GL_NV_depth_buffer_float");
        this.GL_NV_depth_clamp = this.foundExtension && list.contains("GL_NV_depth_clamp");
        this.GL_NV_draw_texture = this.foundExtension && list.contains("GL_NV_draw_texture");
        this.GL_NV_draw_vulkan_image = this.foundExtension && list.contains("GL_NV_draw_vulkan_image");
        this.GL_NV_evaluators = this.foundExtension && list.contains("GL_NV_evaluators");
        this.GL_NV_explicit_multisample = this.foundExtension && list.contains("GL_NV_explicit_multisample");
        this.GL_NV_fence = this.foundExtension && list.contains("GL_NV_fence");
        this.GL_NV_fill_rectangle = this.foundExtension && list.contains("GL_NV_fill_rectangle");
        this.GL_NV_float_buffer = this.foundExtension && list.contains("GL_NV_float_buffer");
        this.GL_NV_fog_distance = this.foundExtension && list.contains("GL_NV_fog_distance");
        this.GL_NV_fragment_coverage_to_color = this.foundExtension && list.contains("GL_NV_fragment_coverage_to_color");
        this.GL_NV_fragment_program = this.foundExtension && list.contains("GL_NV_fragment_program");
        this.GL_NV_fragment_program2 = this.foundExtension && list.contains("GL_NV_fragment_program2");
        this.GL_NV_fragment_program4 = this.foundExtension && list.contains("GL_NV_fragment_program4");
        this.GL_NV_fragment_program_option = this.foundExtension && list.contains("GL_NV_fragment_program_option");
        this.GL_NV_fragment_shader_barycentric = this.foundExtension && list.contains("GL_NV_fragment_shader_barycentric");
        this.GL_NV_fragment_shader_interlock = this.foundExtension && list.contains("GL_NV_fragment_shader_interlock");
        this.GL_NV_framebuffer_mixed_samples = this.foundExtension && list.contains("GL_NV_framebuffer_mixed_samples");
        this.GL_NV_framebuffer_multisample_coverage = this.foundExtension && list.contains("GL_NV_framebuffer_multisample_coverage");
        this.GL_NV_geometry_program4 = this.foundExtension && list.contains("GL_NV_geometry_program4");
        this.GL_NV_geometry_shader4 = this.foundExtension && list.contains("GL_NV_geometry_shader4");
        this.GL_NV_geometry_shader_passthrough = this.foundExtension && list.contains("GL_NV_geometry_shader_passthrough");
        this.GL_NV_gpu_multicast = this.foundExtension && list.contains("GL_NV_gpu_multicast");
        this.GL_NV_gpu_program4 = this.foundExtension && list.contains("GL_NV_gpu_program4");
        this.GL_NV_gpu_program5 = this.foundExtension && list.contains("GL_NV_gpu_program5");
        this.GL_NV_gpu_program5_mem_extended = this.foundExtension && list.contains("GL_NV_gpu_program5_mem_extended");
        this.GL_NV_gpu_shader5 = this.foundExtension && list.contains("GL_NV_gpu_shader5");
        this.GL_NV_half_float = this.foundExtension && list.contains("GL_NV_half_float");
        this.GL_NV_internalformat_sample_query = this.foundExtension && list.contains("GL_NV_internalformat_sample_query");
        this.GL_NV_light_max_exponent = this.foundExtension && list.contains("GL_NV_light_max_exponent");
        this.GL_NV_memory_attachment = this.foundExtension && list.contains("GL_NV_memory_attachment");
        this.GL_NV_memory_object_sparse = this.foundExtension && list.contains("GL_NV_memory_object_sparse");
        this.GL_NV_mesh_shader = this.foundExtension && list.contains("GL_NV_mesh_shader");
        this.GL_NV_multisample_coverage = this.foundExtension && list.contains("GL_NV_multisample_coverage");
        this.GL_NV_multisample_filter_hint = this.foundExtension && list.contains("GL_NV_multisample_filter_hint");
        this.GL_NV_occlusion_query = this.foundExtension && list.contains("GL_NV_occlusion_query");
        this.GL_NV_packed_depth_stencil = this.foundExtension && list.contains("GL_NV_packed_depth_stencil");
        this.GL_NV_parameter_buffer_object = this.foundExtension && list.contains("GL_NV_parameter_buffer_object");
        this.GL_NV_parameter_buffer_object2 = this.foundExtension && list.contains("GL_NV_parameter_buffer_object2");
        this.GL_NV_path_rendering = this.foundExtension && list.contains("GL_NV_path_rendering");
        this.GL_NV_path_rendering_shared_edge = this.foundExtension && list.contains("GL_NV_path_rendering_shared_edge");
        this.GL_NV_pixel_data_range = this.foundExtension && list.contains("GL_NV_pixel_data_range");
        this.GL_NV_point_sprite = this.foundExtension && list.contains("GL_NV_point_sprite");
        this.GL_NV_present_video = this.foundExtension && list.contains("GL_NV_present_video");
        this.GL_NV_primitive_restart = this.foundExtension && list.contains("GL_NV_primitive_restart");
        this.GL_NV_primitive_shading_rate = this.foundExtension && list.contains("GL_NV_primitive_shading_rate");
        this.GL_NV_query_resource = this.foundExtension && list.contains("GL_NV_query_resource");
        this.GL_NV_query_resource_tag = this.foundExtension && list.contains("GL_NV_query_resource_tag");
        this.GL_NV_register_combiners = this.foundExtension && list.contains("GL_NV_register_combiners");
        this.GL_NV_register_combiners2 = this.foundExtension && list.contains("GL_NV_register_combiners2");
        this.GL_NV_representative_fragment_test = this.foundExtension && list.contains("GL_NV_representative_fragment_test");
        this.GL_NV_robustness_video_memory_purge = this.foundExtension && list.contains("GL_NV_robustness_video_memory_purge");
        this.GL_NV_sample_locations = this.foundExtension && list.contains("GL_NV_sample_locations");
        this.GL_NV_sample_mask_override_coverage = this.foundExtension && list.contains("GL_NV_sample_mask_override_coverage");
        this.GL_NV_scissor_exclusive = this.foundExtension && list.contains("GL_NV_scissor_exclusive");
        this.GL_NV_shader_atomic_counters = this.foundExtension && list.contains("GL_NV_shader_atomic_counters");
        this.GL_NV_shader_atomic_float = this.foundExtension && list.contains("GL_NV_shader_atomic_float");
        this.GL_NV_shader_atomic_float64 = this.foundExtension && list.contains("GL_NV_shader_atomic_float64");
        this.GL_NV_shader_atomic_fp16_vector = this.foundExtension && list.contains("GL_NV_shader_atomic_fp16_vector");
        this.GL_NV_shader_atomic_int64 = this.foundExtension && list.contains("GL_NV_shader_atomic_int64");
        this.GL_NV_shader_buffer_load = this.foundExtension && list.contains("GL_NV_shader_buffer_load");
        this.GL_NV_shader_buffer_store = this.foundExtension && list.contains("GL_NV_shader_buffer_store");
        this.GL_NV_shader_storage_buffer_object = this.foundExtension && list.contains("GL_NV_shader_storage_buffer_object");
        this.GL_NV_shader_subgroup_partitioned = this.foundExtension && list.contains("GL_NV_shader_subgroup_partitioned");
        this.GL_NV_shader_texture_footprint = this.foundExtension && list.contains("GL_NV_shader_texture_footprint");
        this.GL_NV_shader_thread_group = this.foundExtension && list.contains("GL_NV_shader_thread_group");
        this.GL_NV_shader_thread_shuffle = this.foundExtension && list.contains("GL_NV_shader_thread_shuffle");
        this.GL_NV_shading_rate_image = this.foundExtension && list.contains("GL_NV_shading_rate_image");
        this.GL_NV_stereo_view_rendering = this.foundExtension && list.contains("GL_NV_stereo_view_rendering");
        this.GL_NV_tessellation_program5 = this.foundExtension && list.contains("GL_NV_tessellation_program5");
        this.GL_NV_texgen_emboss = this.foundExtension && list.contains("GL_NV_texgen_emboss");
        this.GL_NV_texgen_reflection = this.foundExtension && list.contains("GL_NV_texgen_reflection");
        this.GL_NV_texture_barrier = this.foundExtension && list.contains("GL_NV_texture_barrier");
        this.GL_NV_texture_compression_vtc = this.foundExtension && list.contains("GL_NV_texture_compression_vtc");
        this.GL_NV_texture_env_combine4 = this.foundExtension && list.contains("GL_NV_texture_env_combine4");
        this.GL_NV_texture_expand_normal = this.foundExtension && list.contains("GL_NV_texture_expand_normal");
        this.GL_NV_texture_multisample = this.foundExtension && list.contains("GL_NV_texture_multisample");
        this.GL_NV_texture_rectangle = this.foundExtension && list.contains("GL_NV_texture_rectangle");
        this.GL_NV_texture_rectangle_compressed = this.foundExtension && list.contains("GL_NV_texture_rectangle_compressed");
        this.GL_NV_texture_shader = this.foundExtension && list.contains("GL_NV_texture_shader");
        this.GL_NV_texture_shader2 = this.foundExtension && list.contains("GL_NV_texture_shader2");
        this.GL_NV_texture_shader3 = this.foundExtension && list.contains("GL_NV_texture_shader3");
        this.GL_NV_timeline_semaphore = this.foundExtension && list.contains("GL_NV_timeline_semaphore");
        this.GL_NV_transform_feedback = this.foundExtension && list.contains("GL_NV_transform_feedback");
        this.GL_NV_transform_feedback2 = this.foundExtension && list.contains("GL_NV_transform_feedback2");
        this.GL_NV_uniform_buffer_std430_layout = this.foundExtension && list.contains("GL_NV_uniform_buffer_std430_layout");
        this.GL_NV_uniform_buffer_unified_memory = this.foundExtension && list.contains("GL_NV_uniform_buffer_unified_memory");
        this.GL_NV_vdpau_interop = this.foundExtension && list.contains("GL_NV_vdpau_interop");
        this.GL_NV_vdpau_interop2 = this.foundExtension && list.contains("GL_NV_vdpau_interop2");
        this.GL_NV_vertex_array_range = this.foundExtension && list.contains("GL_NV_vertex_array_range");
        this.GL_NV_vertex_array_range2 = this.foundExtension && list.contains("GL_NV_vertex_array_range2");
        this.GL_NV_vertex_attrib_integer_64bit = this.foundExtension && list.contains("GL_NV_vertex_attrib_integer_64bit");
        this.GL_NV_vertex_buffer_unified_memory = this.foundExtension && list.contains("GL_NV_vertex_buffer_unified_memory");
        this.GL_NV_vertex_program = this.foundExtension && list.contains("GL_NV_vertex_program");
        this.GL_NV_vertex_program1_1 = this.foundExtension && list.contains("GL_NV_vertex_program1_1");
        this.GL_NV_vertex_program2 = this.foundExtension && list.contains("GL_NV_vertex_program2");
        this.GL_NV_vertex_program2_option = this.foundExtension && list.contains("GL_NV_vertex_program2_option");
        this.GL_NV_vertex_program3 = this.foundExtension && list.contains("GL_NV_vertex_program3");
        this.GL_NV_vertex_program4 = this.foundExtension && list.contains("GL_NV_vertex_program4");
        this.GL_NV_video_capture = this.foundExtension && list.contains("GL_NV_video_capture");
        this.GL_NV_viewport_array2 = this.foundExtension && list.contains("GL_NV_viewport_array2");
        this.GL_NV_viewport_swizzle = this.foundExtension && list.contains("GL_NV_viewport_swizzle");
        this.GL_OML_interlace = this.foundExtension && list.contains("GL_OML_interlace");
        this.GL_OML_resample = this.foundExtension && list.contains("GL_OML_resample");
        this.GL_OML_subsample = this.foundExtension && list.contains("GL_OML_subsample");
        this.GL_OVR_multiview = this.foundExtension && list.contains("GL_OVR_multiview");
        this.GL_OVR_multiview2 = this.foundExtension && list.contains("GL_OVR_multiview2");
        this.GL_PGI_misc_hints = this.foundExtension && list.contains("GL_PGI_misc_hints");
        this.GL_PGI_vertex_hints = this.foundExtension && list.contains("GL_PGI_vertex_hints");
        this.GL_REND_screen_coordinates = this.foundExtension && list.contains("GL_REND_screen_coordinates");
        this.GL_S3_s3tc = this.foundExtension && list.contains("GL_S3_s3tc");
        this.GL_SGIS_detail_texture = this.foundExtension && list.contains("GL_SGIS_detail_texture");
        this.GL_SGIS_fog_function = this.foundExtension && list.contains("GL_SGIS_fog_function");
        this.GL_SGIS_generate_mipmap = this.foundExtension && list.contains("GL_SGIS_generate_mipmap");
        this.GL_SGIS_multisample = this.foundExtension && list.contains("GL_SGIS_multisample");
        this.GL_SGIS_pixel_texture = this.foundExtension && list.contains("GL_SGIS_pixel_texture");
        this.GL_SGIS_point_line_texgen = this.foundExtension && list.contains("GL_SGIS_point_line_texgen");
        this.GL_SGIS_point_parameters = this.foundExtension && list.contains("GL_SGIS_point_parameters");
        this.GL_SGIS_sharpen_texture = this.foundExtension && list.contains("GL_SGIS_sharpen_texture");
        this.GL_SGIS_texture4D = this.foundExtension && list.contains("GL_SGIS_texture4D");
        this.GL_SGIS_texture_border_clamp = this.foundExtension && list.contains("GL_SGIS_texture_border_clamp");
        this.GL_SGIS_texture_color_mask = this.foundExtension && list.contains("GL_SGIS_texture_color_mask");
        this.GL_SGIS_texture_edge_clamp = this.foundExtension && list.contains("GL_SGIS_texture_edge_clamp");
        this.GL_SGIS_texture_filter4 = this.foundExtension && list.contains("GL_SGIS_texture_filter4");
        this.GL_SGIS_texture_lod = this.foundExtension && list.contains("GL_SGIS_texture_lod");
        this.GL_SGIS_texture_select = this.foundExtension && list.contains("GL_SGIS_texture_select");
        this.GL_SGIX_async = this.foundExtension && list.contains("GL_SGIX_async");
        this.GL_SGIX_async_histogram = this.foundExtension && list.contains("GL_SGIX_async_histogram");
        this.GL_SGIX_async_pixel = this.foundExtension && list.contains("GL_SGIX_async_pixel");
        this.GL_SGIX_blend_alpha_minmax = this.foundExtension && list.contains("GL_SGIX_blend_alpha_minmax");
        this.GL_SGIX_calligraphic_fragment = this.foundExtension && list.contains("GL_SGIX_calligraphic_fragment");
        this.GL_SGIX_clipmap = this.foundExtension && list.contains("GL_SGIX_clipmap");
        this.GL_SGIX_convolution_accuracy = this.foundExtension && list.contains("GL_SGIX_convolution_accuracy");
        this.GL_SGIX_depth_pass_instrument = this.foundExtension && list.contains("GL_SGIX_depth_pass_instrument");
        this.GL_SGIX_depth_texture = this.foundExtension && list.contains("GL_SGIX_depth_texture");
        this.GL_SGIX_flush_raster = this.foundExtension && list.contains("GL_SGIX_flush_raster");
        this.GL_SGIX_fog_offset = this.foundExtension && list.contains("GL_SGIX_fog_offset");
        this.GL_SGIX_fragment_lighting = this.foundExtension && list.contains("GL_SGIX_fragment_lighting");
        this.GL_SGIX_framezoom = this.foundExtension && list.contains("GL_SGIX_framezoom");
        this.GL_SGIX_igloo_interface = this.foundExtension && list.contains("GL_SGIX_igloo_interface");
        this.GL_SGIX_instruments = this.foundExtension && list.contains("GL_SGIX_instruments");
        this.GL_SGIX_interlace = this.foundExtension && list.contains("GL_SGIX_interlace");
        this.GL_SGIX_ir_instrument1 = this.foundExtension && list.contains("GL_SGIX_ir_instrument1");
        this.GL_SGIX_list_priority = this.foundExtension && list.contains("GL_SGIX_list_priority");
        this.GL_SGIX_pixel_texture = this.foundExtension && list.contains("GL_SGIX_pixel_texture");
        this.GL_SGIX_pixel_tiles = this.foundExtension && list.contains("GL_SGIX_pixel_tiles");
        this.GL_SGIX_polynomial_ffd = this.foundExtension && list.contains("GL_SGIX_polynomial_ffd");
        this.GL_SGIX_reference_plane = this.foundExtension && list.contains("GL_SGIX_reference_plane");
        this.GL_SGIX_resample = this.foundExtension && list.contains("GL_SGIX_resample");
        this.GL_SGIX_scalebias_hint = this.foundExtension && list.contains("GL_SGIX_scalebias_hint");
        this.GL_SGIX_shadow = this.foundExtension && list.contains("GL_SGIX_shadow");
        this.GL_SGIX_shadow_ambient = this.foundExtension && list.contains("GL_SGIX_shadow_ambient");
        this.GL_SGIX_sprite = this.foundExtension && list.contains("GL_SGIX_sprite");
        this.GL_SGIX_subsample = this.foundExtension && list.contains("GL_SGIX_subsample");
        this.GL_SGIX_tag_sample_buffer = this.foundExtension && list.contains("GL_SGIX_tag_sample_buffer");
        this.GL_SGIX_texture_add_env = this.foundExtension && list.contains("GL_SGIX_texture_add_env");
        this.GL_SGIX_texture_coordinate_clamp = this.foundExtension && list.contains("GL_SGIX_texture_coordinate_clamp");
        this.GL_SGIX_texture_lod_bias = this.foundExtension && list.contains("GL_SGIX_texture_lod_bias");
        this.GL_SGIX_texture_multi_buffer = this.foundExtension && list.contains("GL_SGIX_texture_multi_buffer");
        this.GL_SGIX_texture_scale_bias = this.foundExtension && list.contains("GL_SGIX_texture_scale_bias");
        this.GL_SGIX_vertex_preclip = this.foundExtension && list.contains("GL_SGIX_vertex_preclip");
        this.GL_SGIX_ycrcb = this.foundExtension && list.contains("GL_SGIX_ycrcb");
        this.GL_SGIX_ycrcb_subsample = this.foundExtension && list.contains("GL_SGIX_ycrcb_subsample");
        this.GL_SGIX_ycrcba = this.foundExtension && list.contains("GL_SGIX_ycrcba");
        this.GL_SGI_color_matrix = this.foundExtension && list.contains("GL_SGI_color_matrix");
        this.GL_SGI_color_table = this.foundExtension && list.contains("GL_SGI_color_table");
        this.GL_SGI_texture_color_table = this.foundExtension && list.contains("GL_SGI_texture_color_table");
        this.GL_SUNX_constant_data = this.foundExtension && list.contains("GL_SUNX_constant_data");
        this.GL_SUN_convolution_border_modes = this.foundExtension && list.contains("GL_SUN_convolution_border_modes");
        this.GL_SUN_global_alpha = this.foundExtension && list.contains("GL_SUN_global_alpha");
        this.GL_SUN_mesh_array = this.foundExtension && list.contains("GL_SUN_mesh_array");
        this.GL_SUN_slice_accum = this.foundExtension && list.contains("GL_SUN_slice_accum");
        this.GL_SUN_triangle_list = this.foundExtension && list.contains("GL_SUN_triangle_list");
        this.GL_SUN_vertex = this.foundExtension && list.contains("GL_SUN_vertex");
        this.GL_WIN_phong_shading = this.foundExtension && list.contains("GL_WIN_phong_shading");
        this.GL_WIN_specular_fog = this.foundExtension && list.contains("GL_WIN_specular_fog");
    }
}
