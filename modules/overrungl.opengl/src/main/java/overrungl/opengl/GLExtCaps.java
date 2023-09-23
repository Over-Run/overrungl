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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl;

import overrungl.opengl.ext.*;
import overrungl.opengl.ext.arb.*;
import overrungl.opengl.ext.khr.*;
import overrungl.opengl.ext.oes.*;
import overrungl.opengl.ext.amd.*;
import overrungl.opengl.ext.apple.*;
//import overrungl.opengl.ext.ati.*;
//import overrungl.opengl.ext.ext.*;
import overrungl.opengl.ext.ibm.*;
import overrungl.opengl.ext.intel.*;
import overrungl.opengl.ext.mesa.*;
//import overrungl.opengl.ext.nv.*;
//import overrungl.opengl.ext.sgi.*;
import overrungl.opengl.ext.sun.*;

import java.lang.invoke.MethodHandle;

/**
 * The OpenGL extension capabilities.
 *
 * @since 0.1.0
 */
public final class GLExtCaps {
    /** The OpenGL extension flags. */
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
        glGetGraphicsResetStatusARB, glGetnCompressedTexImageARB, glGetnTexImageARB, glGetnUniformdvARB, glGetnUniformfvARB, glGetnUniformivARB, glGetnUniformuivARB, glReadnPixelsARB, glEvaluateDepthValuesARB, glFramebufferSampleLocationsfvARB, glNamedFramebufferSampleLocationsfvARB, glMinSampleShadingARB, glDeleteObjectARB, glGetHandleARB, glDetachObjectARB, glCreateShaderObjectARB,
        glShaderSourceARB, glCompileShaderARB, glCreateProgramObjectARB, glAttachObjectARB, glLinkProgramARB, glUseProgramObjectARB, glValidateProgramARB, glUniform1fARB, glUniform2fARB, glUniform3fARB, glUniform4fARB, glUniform1iARB, glUniform2iARB, glUniform3iARB, glUniform4iARB, glUniform1fvARB,
        glUniform2fvARB, glUniform3fvARB, glUniform4fvARB, glUniform1ivARB, glUniform2ivARB, glUniform3ivARB, glUniform4ivARB, glUniformMatrix2fvARB, glUniformMatrix3fvARB, glUniformMatrix4fvARB, glGetObjectParameterfvARB, glGetObjectParameterivARB, glGetInfoLogARB, glGetAttachedObjectsARB, glGetUniformLocationARB, glGetActiveUniformARB,
        glGetUniformfvARB, glGetUniformivARB, glGetShaderSourceARB, glNamedStringARB, glDeleteNamedStringARB, glCompileShaderIncludeARB, glIsNamedStringARB, glGetNamedStringARB, glGetNamedStringivARB, glBufferPageCommitmentARB, glNamedBufferPageCommitmentEXT, glNamedBufferPageCommitmentARB, glTexPageCommitmentARB, glTexBufferARB, glCompressedTexImage3DARB, glCompressedTexImage2DARB,
        glCompressedTexImage1DARB, glCompressedTexSubImage3DARB, glCompressedTexSubImage2DARB, glCompressedTexSubImage1DARB, glGetCompressedTexImageARB, glLoadTransposeMatrixfARB, glLoadTransposeMatrixdARB, glMultTransposeMatrixfARB, glMultTransposeMatrixdARB, glWeightbvARB, glWeightsvARB, glWeightivARB, glWeightfvARB, glWeightdvARB, glWeightubvARB, glWeightusvARB,
        glWeightuivARB, glWeightPointerARB, glVertexBlendARB, glBindBufferARB, glDeleteBuffersARB, glGenBuffersARB, glIsBufferARB, glBufferDataARB, glBufferSubDataARB, glGetBufferSubDataARB, glMapBufferARB, glUnmapBufferARB, glGetBufferParameterivARB, glGetBufferPointervARB, glVertexAttrib1dARB, glVertexAttrib1dvARB,
        glVertexAttrib1fARB, glVertexAttrib1fvARB, glVertexAttrib1sARB, glVertexAttrib1svARB, glVertexAttrib2dARB, glVertexAttrib2dvARB, glVertexAttrib2fARB, glVertexAttrib2fvARB, glVertexAttrib2sARB, glVertexAttrib2svARB, glVertexAttrib3dARB, glVertexAttrib3dvARB, glVertexAttrib3fARB, glVertexAttrib3fvARB, glVertexAttrib3sARB, glVertexAttrib3svARB,
        glVertexAttrib4NbvARB, glVertexAttrib4NivARB, glVertexAttrib4NsvARB, glVertexAttrib4NubARB, glVertexAttrib4NubvARB, glVertexAttrib4NuivARB, glVertexAttrib4NusvARB, glVertexAttrib4bvARB, glVertexAttrib4dARB, glVertexAttrib4dvARB, glVertexAttrib4fARB, glVertexAttrib4fvARB, glVertexAttrib4ivARB, glVertexAttrib4sARB, glVertexAttrib4svARB, glVertexAttrib4ubvARB,
        glVertexAttrib4uivARB, glVertexAttrib4usvARB, glVertexAttribPointerARB, glEnableVertexAttribArrayARB, glDisableVertexAttribArrayARB, glGetVertexAttribdvARB, glGetVertexAttribfvARB, glGetVertexAttribivARB, glGetVertexAttribPointervARB, glBindAttribLocationARB, glGetActiveAttribARB, glGetAttribLocationARB, glDepthRangeArraydvNV, glDepthRangeIndexeddNV, glWindowPos2dARB, glWindowPos2dvARB,
        glWindowPos2fARB, glWindowPos2fvARB, glWindowPos2iARB, glWindowPos2ivARB, glWindowPos2sARB, glWindowPos2svARB, glWindowPos3dARB, glWindowPos3dvARB, glWindowPos3fARB, glWindowPos3fvARB, glWindowPos3iARB, glWindowPos3ivARB, glWindowPos3sARB, glWindowPos3svARB, glBlendBarrierKHR, glMaxShaderCompilerThreadsKHR,
        glMultiTexCoord1bOES, glMultiTexCoord1bvOES, glMultiTexCoord2bOES, glMultiTexCoord2bvOES, glMultiTexCoord3bOES, glMultiTexCoord3bvOES, glMultiTexCoord4bOES, glMultiTexCoord4bvOES, glTexCoord1bOES, glTexCoord1bvOES, glTexCoord2bOES, glTexCoord2bvOES, glTexCoord3bOES, glTexCoord3bvOES, glTexCoord4bOES, glTexCoord4bvOES,
        glVertex2bOES, glVertex2bvOES, glVertex3bOES, glVertex3bvOES, glVertex4bOES, glVertex4bvOES, glAlphaFuncxOES, glClearColorxOES, glClearDepthxOES, glClipPlanexOES, glColor4xOES, glDepthRangexOES, glFogxOES, glFogxvOES, glFrustumxOES, glGetClipPlanexOES,
        glGetFixedvOES, glGetTexEnvxvOES, glGetTexParameterxvOES, glLightModelxOES, glLightModelxvOES, glLightxOES, glLightxvOES, glLineWidthxOES, glLoadMatrixxOES, glMaterialxOES, glMaterialxvOES, glMultMatrixxOES, glMultiTexCoord4xOES, glNormal3xOES, glOrthoxOES, glPointParameterxvOES,
        glPointSizexOES, glPolygonOffsetxOES, glRotatexOES, glScalexOES, glTexEnvxOES, glTexEnvxvOES, glTexParameterxOES, glTexParameterxvOES, glTranslatexOES, glAccumxOES, glBitmapxOES, glBlendColorxOES, glClearAccumxOES, glColor3xOES, glColor3xvOES, glColor4xvOES,
        glConvolutionParameterxOES, glConvolutionParameterxvOES, glEvalCoord1xOES, glEvalCoord1xvOES, glEvalCoord2xOES, glEvalCoord2xvOES, glFeedbackBufferxOES, glGetConvolutionParameterxvOES, glGetHistogramParameterxvOES, glGetLightxOES, glGetMapxvOES, glGetMaterialxOES, glGetPixelMapxv, glGetTexGenxvOES, glGetTexLevelParameterxvOES, glIndexxOES,
        glIndexxvOES, glLoadTransposeMatrixxOES, glMap1xOES, glMap2xOES, glMapGrid1xOES, glMapGrid2xOES, glMultTransposeMatrixxOES, glMultiTexCoord1xOES, glMultiTexCoord1xvOES, glMultiTexCoord2xOES, glMultiTexCoord2xvOES, glMultiTexCoord3xOES, glMultiTexCoord3xvOES, glMultiTexCoord4xvOES, glNormal3xvOES, glPassThroughxOES,
        glPixelMapx, glPixelStorex, glPixelTransferxOES, glPixelZoomxOES, glPrioritizeTexturesxOES, glRasterPos2xOES, glRasterPos2xvOES, glRasterPos3xOES, glRasterPos3xvOES, glRasterPos4xOES, glRasterPos4xvOES, glRectxOES, glRectxvOES, glTexCoord1xOES, glTexCoord1xvOES, glTexCoord2xOES,
        glTexCoord2xvOES, glTexCoord3xOES, glTexCoord3xvOES, glTexCoord4xOES, glTexCoord4xvOES, glTexGenxOES, glTexGenxvOES, glVertex2xOES, glVertex2xvOES, glVertex3xOES, glVertex3xvOES, glVertex4xOES, glVertex4xvOES, glQueryMatrixxOES, glClearDepthfOES, glClipPlanefOES,
        glDepthRangefOES, glFrustumfOES, glGetClipPlanefOES, glOrthofOES, glTbufferMask3DFX, glDebugMessageEnableAMD, glDebugMessageInsertAMD, glDebugMessageCallbackAMD, glGetDebugMessageLogAMD, glBlendFuncIndexedAMD, glBlendFuncSeparateIndexedAMD, glBlendEquationIndexedAMD, glBlendEquationSeparateIndexedAMD, glRenderbufferStorageMultisampleAdvancedAMD, glNamedRenderbufferStorageMultisampleAdvancedAMD, glFramebufferSamplePositionsfvAMD,
        glNamedFramebufferSamplePositionsfvAMD, glGetFramebufferParameterfvAMD, glGetNamedFramebufferParameterfvAMD, glUniform1i64NV, glUniform2i64NV, glUniform3i64NV, glUniform4i64NV, glUniform1i64vNV, glUniform2i64vNV, glUniform3i64vNV, glUniform4i64vNV, glUniform1ui64NV, glUniform2ui64NV, glUniform3ui64NV, glUniform4ui64NV, glUniform1ui64vNV,
        glUniform2ui64vNV, glUniform3ui64vNV, glUniform4ui64vNV, glGetUniformi64vNV, glGetUniformui64vNV, glProgramUniform1i64NV, glProgramUniform2i64NV, glProgramUniform3i64NV, glProgramUniform4i64NV, glProgramUniform1i64vNV, glProgramUniform2i64vNV, glProgramUniform3i64vNV, glProgramUniform4i64vNV, glProgramUniform1ui64NV, glProgramUniform2ui64NV, glProgramUniform3ui64NV,
        glProgramUniform4ui64NV, glProgramUniform1ui64vNV, glProgramUniform2ui64vNV, glProgramUniform3ui64vNV, glProgramUniform4ui64vNV, glVertexAttribParameteriAMD, glMultiDrawArraysIndirectAMD, glMultiDrawElementsIndirectAMD, glGenNamesAMD, glDeleteNamesAMD, glIsNameAMD, glQueryObjectParameteruiAMD, glGetPerfMonitorGroupsAMD, glGetPerfMonitorCountersAMD, glGetPerfMonitorGroupStringAMD, glGetPerfMonitorCounterStringAMD,
        glGetPerfMonitorCounterInfoAMD, glGenPerfMonitorsAMD, glDeletePerfMonitorsAMD, glSelectPerfMonitorCountersAMD, glBeginPerfMonitorAMD, glEndPerfMonitorAMD, glGetPerfMonitorCounterDataAMD, glSetMultisamplefvAMD, glTexStorageSparseAMD, glTextureStorageSparseAMD, glStencilOpValueAMD, glTessellationFactorAMD, glTessellationModeAMD, glElementPointerAPPLE, glDrawElementArrayAPPLE, glDrawRangeElementArrayAPPLE,
        glMultiDrawElementArrayAPPLE, glMultiDrawRangeElementArrayAPPLE, glGenFencesAPPLE, glDeleteFencesAPPLE, glSetFenceAPPLE, glIsFenceAPPLE, glTestFenceAPPLE, glFinishFenceAPPLE, glTestObjectAPPLE, glFinishObjectAPPLE, glBufferParameteriAPPLE, glFlushMappedBufferRangeAPPLE, glObjectPurgeableAPPLE, glObjectUnpurgeableAPPLE, glGetObjectParameterivAPPLE, glTextureRangeAPPLE,
        glGetTexParameterPointervAPPLE, glBindVertexArrayAPPLE, glDeleteVertexArraysAPPLE, glGenVertexArraysAPPLE, glIsVertexArrayAPPLE, glVertexArrayRangeAPPLE, glFlushVertexArrayRangeAPPLE, glVertexArrayParameteriAPPLE, glEnableVertexAttribAPPLE, glDisableVertexAttribAPPLE, glIsVertexAttribEnabledAPPLE, glMapVertexAttrib1dAPPLE, glMapVertexAttrib1fAPPLE, glMapVertexAttrib2dAPPLE, glMapVertexAttrib2fAPPLE, glFrameTerminatorGREMEDY,
        glStringMarkerGREMEDY, glImageTransformParameteriHP, glImageTransformParameterfHP, glImageTransformParameterivHP, glImageTransformParameterfvHP, glGetImageTransformParameterivHP, glGetImageTransformParameterfvHP, glMultiModeDrawArraysIBM, glMultiModeDrawElementsIBM, glFlushStaticDataIBM, glColorPointerListIBM, glSecondaryColorPointerListIBM, glEdgeFlagPointerListIBM, glFogCoordPointerListIBM, glIndexPointerListIBM, glNormalPointerListIBM,
        glTexCoordPointerListIBM, glVertexPointerListIBM, glBlendFuncSeparateINGR, glApplyFramebufferAttachmentCMAAINTEL, glSyncTextureINTEL, glUnmapTexture2DINTEL, glMapTexture2DINTEL, glVertexPointervINTEL, glNormalPointervINTEL, glColorPointervINTEL, glTexCoordPointervINTEL, glBeginPerfQueryINTEL, glCreatePerfQueryINTEL, glDeletePerfQueryINTEL, glEndPerfQueryINTEL, glGetFirstPerfQueryIdINTEL,
        glGetNextPerfQueryIdINTEL, glGetPerfCounterInfoINTEL, glGetPerfQueryDataINTEL, glGetPerfQueryIdByNameINTEL, glGetPerfQueryInfoINTEL, glFramebufferParameteriMESA, glGetFramebufferParameterivMESA, glResizeBuffersMESA, glWindowPos2dMESA, glWindowPos2dvMESA, glWindowPos2fMESA, glWindowPos2fvMESA, glWindowPos2iMESA, glWindowPos2ivMESA, glWindowPos2sMESA, glWindowPos2svMESA,
        glWindowPos3dMESA, glWindowPos3dvMESA, glWindowPos3fMESA, glWindowPos3fvMESA, glWindowPos3iMESA, glWindowPos3ivMESA, glWindowPos3sMESA, glWindowPos3svMESA, glWindowPos4dMESA, glWindowPos4dvMESA, glWindowPos4fMESA, glWindowPos4fvMESA, glWindowPos4iMESA, glWindowPos4ivMESA, glWindowPos4sMESA, glWindowPos4svMESA,
        glFramebufferTextureMultiviewOVR, glHintPGI, glFinishTextureSUNX, glGlobalAlphaFactorbSUN, glGlobalAlphaFactorsSUN, glGlobalAlphaFactoriSUN, glGlobalAlphaFactorfSUN, glGlobalAlphaFactordSUN, glGlobalAlphaFactorubSUN, glGlobalAlphaFactorusSUN, glGlobalAlphaFactoruiSUN, glDrawMeshArraysSUN, glReplacementCodeuiSUN, glReplacementCodeusSUN, glReplacementCodeubSUN, glReplacementCodeuivSUN,
        glReplacementCodeusvSUN, glReplacementCodeubvSUN, glReplacementCodePointerSUN, glColor4ubVertex2fSUN, glColor4ubVertex2fvSUN, glColor4ubVertex3fSUN, glColor4ubVertex3fvSUN, glColor3fVertex3fSUN, glColor3fVertex3fvSUN, glNormal3fVertex3fSUN, glNormal3fVertex3fvSUN, glColor4fNormal3fVertex3fSUN, glColor4fNormal3fVertex3fvSUN, glTexCoord2fVertex3fSUN, glTexCoord2fVertex3fvSUN, glTexCoord4fVertex4fSUN,
        glTexCoord4fVertex4fvSUN, glTexCoord2fColor4ubVertex3fSUN, glTexCoord2fColor4ubVertex3fvSUN, glTexCoord2fColor3fVertex3fSUN, glTexCoord2fColor3fVertex3fvSUN, glTexCoord2fNormal3fVertex3fSUN, glTexCoord2fNormal3fVertex3fvSUN, glTexCoord2fColor4fNormal3fVertex3fSUN, glTexCoord2fColor4fNormal3fVertex3fvSUN, glTexCoord4fColor4fNormal3fVertex4fSUN, glTexCoord4fColor4fNormal3fVertex4fvSUN, glReplacementCodeuiVertex3fSUN, glReplacementCodeuiVertex3fvSUN, glReplacementCodeuiColor4ubVertex3fSUN, glReplacementCodeuiColor4ubVertex3fvSUN, glReplacementCodeuiColor3fVertex3fSUN,
        glReplacementCodeuiColor3fVertex3fvSUN, glReplacementCodeuiNormal3fVertex3fSUN, glReplacementCodeuiNormal3fVertex3fvSUN, glReplacementCodeuiColor4fNormal3fVertex3fSUN, glReplacementCodeuiColor4fNormal3fVertex3fvSUN, glReplacementCodeuiTexCoord2fVertex3fSUN, glReplacementCodeuiTexCoord2fVertex3fvSUN, glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN, glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN, glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN, glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN;

    void load(GLLoadFunc load) {
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
        GLOVRMultiview.load(this, load);
        GLPGIMiscHints.load(this, load);
        GLSUNXConstantData.load(this, load);
        GLSUNGlobalAlpha.load(this, load);
        GLSUNMeshArray.load(this, load);
        GLSUNTriangleList.load(this, load);
        GLSUNVertex.load(this, load);
    }
}
