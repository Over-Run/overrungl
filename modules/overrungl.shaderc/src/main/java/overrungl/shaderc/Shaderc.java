/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.shaderc;

import org.jspecify.annotations.NonNull;
import overrungl.util.CanonicalTypes;
import overrungl.util.MemoryUtil;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;

/// [shaderc.h](https://github.com/google/shaderc/blob/main/libshaderc/include/shaderc/shaderc.h)
///
/// @since 0.2.0
public final class Shaderc {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int shaderc_env_version_vulkan_1_0 = ((1 << 22));
    public static final int shaderc_env_version_vulkan_1_1 = ((1 << 22) | (1 << 12));
    public static final int shaderc_env_version_vulkan_1_2 = ((1 << 22) | (2 << 12));
    public static final int shaderc_env_version_vulkan_1_3 = ((1 << 22) | (3 << 12));
    public static final int shaderc_env_version_vulkan_1_4 = ((1 << 22) | (4 << 12));
    public static final int shaderc_env_version_opengl_4_5 = 450;
    public static final int shaderc_env_version_webgpu = 451;
    public static final int shaderc_target_env_vulkan = 0;
    public static final int shaderc_target_env_opengl = 1;
    public static final int shaderc_target_env_opengl_compat = 2;
    public static final int shaderc_target_env_webgpu = 3;
    public static final int shaderc_target_env_default = 0;
    public static final int shaderc_spirv_version_1_0 = 65536;
    public static final int shaderc_spirv_version_1_1 = 65792;
    public static final int shaderc_spirv_version_1_2 = 66048;
    public static final int shaderc_spirv_version_1_3 = 66304;
    public static final int shaderc_spirv_version_1_4 = 66560;
    public static final int shaderc_spirv_version_1_5 = 66816;
    public static final int shaderc_spirv_version_1_6 = 67072;
    public static final int shaderc_compilation_status_success = 0;
    public static final int shaderc_compilation_status_invalid_stage = 1;
    public static final int shaderc_compilation_status_compilation_error = 2;
    public static final int shaderc_compilation_status_internal_error = 3;
    public static final int shaderc_compilation_status_null_result_object = 4;
    public static final int shaderc_compilation_status_invalid_assembly = 5;
    public static final int shaderc_compilation_status_validation_error = 6;
    public static final int shaderc_compilation_status_transformation_error = 7;
    public static final int shaderc_compilation_status_configuration_error = 8;
    public static final int shaderc_source_language_glsl = 0;
    public static final int shaderc_source_language_hlsl = 1;
    public static final int shaderc_vertex_shader = 0;
    public static final int shaderc_fragment_shader = 1;
    public static final int shaderc_compute_shader = 2;
    public static final int shaderc_geometry_shader = 3;
    public static final int shaderc_tess_control_shader = 4;
    public static final int shaderc_tess_evaluation_shader = 5;
    public static final int shaderc_glsl_vertex_shader = 0;
    public static final int shaderc_glsl_fragment_shader = 1;
    public static final int shaderc_glsl_compute_shader = 2;
    public static final int shaderc_glsl_geometry_shader = 3;
    public static final int shaderc_glsl_tess_control_shader = 4;
    public static final int shaderc_glsl_tess_evaluation_shader = 5;
    public static final int shaderc_glsl_infer_from_source = 6;
    public static final int shaderc_glsl_default_vertex_shader = 7;
    public static final int shaderc_glsl_default_fragment_shader = 8;
    public static final int shaderc_glsl_default_compute_shader = 9;
    public static final int shaderc_glsl_default_geometry_shader = 10;
    public static final int shaderc_glsl_default_tess_control_shader = 11;
    public static final int shaderc_glsl_default_tess_evaluation_shader = 12;
    public static final int shaderc_spirv_assembly = 13;
    public static final int shaderc_raygen_shader = 14;
    public static final int shaderc_anyhit_shader = 15;
    public static final int shaderc_closesthit_shader = 16;
    public static final int shaderc_miss_shader = 17;
    public static final int shaderc_intersection_shader = 18;
    public static final int shaderc_callable_shader = 19;
    public static final int shaderc_glsl_raygen_shader = 14;
    public static final int shaderc_glsl_anyhit_shader = 15;
    public static final int shaderc_glsl_closesthit_shader = 16;
    public static final int shaderc_glsl_miss_shader = 17;
    public static final int shaderc_glsl_intersection_shader = 18;
    public static final int shaderc_glsl_callable_shader = 19;
    public static final int shaderc_glsl_default_raygen_shader = 20;
    public static final int shaderc_glsl_default_anyhit_shader = 21;
    public static final int shaderc_glsl_default_closesthit_shader = 22;
    public static final int shaderc_glsl_default_miss_shader = 23;
    public static final int shaderc_glsl_default_intersection_shader = 24;
    public static final int shaderc_glsl_default_callable_shader = 25;
    public static final int shaderc_task_shader = 26;
    public static final int shaderc_mesh_shader = 27;
    public static final int shaderc_glsl_task_shader = 26;
    public static final int shaderc_glsl_mesh_shader = 27;
    public static final int shaderc_glsl_default_task_shader = 28;
    public static final int shaderc_glsl_default_mesh_shader = 29;
    public static final int shaderc_profile_none = 0;
    public static final int shaderc_profile_core = 1;
    public static final int shaderc_profile_compatibility = 2;
    public static final int shaderc_profile_es = 3;
    public static final int shaderc_optimization_level_zero = 0;
    public static final int shaderc_optimization_level_size = 1;
    public static final int shaderc_optimization_level_performance = 2;
    public static final int shaderc_limit_max_lights = 0;
    public static final int shaderc_limit_max_clip_planes = 1;
    public static final int shaderc_limit_max_texture_units = 2;
    public static final int shaderc_limit_max_texture_coords = 3;
    public static final int shaderc_limit_max_vertex_attribs = 4;
    public static final int shaderc_limit_max_vertex_uniform_components = 5;
    public static final int shaderc_limit_max_varying_floats = 6;
    public static final int shaderc_limit_max_vertex_texture_image_units = 7;
    public static final int shaderc_limit_max_combined_texture_image_units = 8;
    public static final int shaderc_limit_max_texture_image_units = 9;
    public static final int shaderc_limit_max_fragment_uniform_components = 10;
    public static final int shaderc_limit_max_draw_buffers = 11;
    public static final int shaderc_limit_max_vertex_uniform_vectors = 12;
    public static final int shaderc_limit_max_varying_vectors = 13;
    public static final int shaderc_limit_max_fragment_uniform_vectors = 14;
    public static final int shaderc_limit_max_vertex_output_vectors = 15;
    public static final int shaderc_limit_max_fragment_input_vectors = 16;
    public static final int shaderc_limit_min_program_texel_offset = 17;
    public static final int shaderc_limit_max_program_texel_offset = 18;
    public static final int shaderc_limit_max_clip_distances = 19;
    public static final int shaderc_limit_max_compute_work_group_count_x = 20;
    public static final int shaderc_limit_max_compute_work_group_count_y = 21;
    public static final int shaderc_limit_max_compute_work_group_count_z = 22;
    public static final int shaderc_limit_max_compute_work_group_size_x = 23;
    public static final int shaderc_limit_max_compute_work_group_size_y = 24;
    public static final int shaderc_limit_max_compute_work_group_size_z = 25;
    public static final int shaderc_limit_max_compute_uniform_components = 26;
    public static final int shaderc_limit_max_compute_texture_image_units = 27;
    public static final int shaderc_limit_max_compute_image_uniforms = 28;
    public static final int shaderc_limit_max_compute_atomic_counters = 29;
    public static final int shaderc_limit_max_compute_atomic_counter_buffers = 30;
    public static final int shaderc_limit_max_varying_components = 31;
    public static final int shaderc_limit_max_vertex_output_components = 32;
    public static final int shaderc_limit_max_geometry_input_components = 33;
    public static final int shaderc_limit_max_geometry_output_components = 34;
    public static final int shaderc_limit_max_fragment_input_components = 35;
    public static final int shaderc_limit_max_image_units = 36;
    public static final int shaderc_limit_max_combined_image_units_and_fragment_outputs = 37;
    public static final int shaderc_limit_max_combined_shader_output_resources = 38;
    public static final int shaderc_limit_max_image_samples = 39;
    public static final int shaderc_limit_max_vertex_image_uniforms = 40;
    public static final int shaderc_limit_max_tess_control_image_uniforms = 41;
    public static final int shaderc_limit_max_tess_evaluation_image_uniforms = 42;
    public static final int shaderc_limit_max_geometry_image_uniforms = 43;
    public static final int shaderc_limit_max_fragment_image_uniforms = 44;
    public static final int shaderc_limit_max_combined_image_uniforms = 45;
    public static final int shaderc_limit_max_geometry_texture_image_units = 46;
    public static final int shaderc_limit_max_geometry_output_vertices = 47;
    public static final int shaderc_limit_max_geometry_total_output_components = 48;
    public static final int shaderc_limit_max_geometry_uniform_components = 49;
    public static final int shaderc_limit_max_geometry_varying_components = 50;
    public static final int shaderc_limit_max_tess_control_input_components = 51;
    public static final int shaderc_limit_max_tess_control_output_components = 52;
    public static final int shaderc_limit_max_tess_control_texture_image_units = 53;
    public static final int shaderc_limit_max_tess_control_uniform_components = 54;
    public static final int shaderc_limit_max_tess_control_total_output_components = 55;
    public static final int shaderc_limit_max_tess_evaluation_input_components = 56;
    public static final int shaderc_limit_max_tess_evaluation_output_components = 57;
    public static final int shaderc_limit_max_tess_evaluation_texture_image_units = 58;
    public static final int shaderc_limit_max_tess_evaluation_uniform_components = 59;
    public static final int shaderc_limit_max_tess_patch_components = 60;
    public static final int shaderc_limit_max_patch_vertices = 61;
    public static final int shaderc_limit_max_tess_gen_level = 62;
    public static final int shaderc_limit_max_viewports = 63;
    public static final int shaderc_limit_max_vertex_atomic_counters = 64;
    public static final int shaderc_limit_max_tess_control_atomic_counters = 65;
    public static final int shaderc_limit_max_tess_evaluation_atomic_counters = 66;
    public static final int shaderc_limit_max_geometry_atomic_counters = 67;
    public static final int shaderc_limit_max_fragment_atomic_counters = 68;
    public static final int shaderc_limit_max_combined_atomic_counters = 69;
    public static final int shaderc_limit_max_atomic_counter_bindings = 70;
    public static final int shaderc_limit_max_vertex_atomic_counter_buffers = 71;
    public static final int shaderc_limit_max_tess_control_atomic_counter_buffers = 72;
    public static final int shaderc_limit_max_tess_evaluation_atomic_counter_buffers = 73;
    public static final int shaderc_limit_max_geometry_atomic_counter_buffers = 74;
    public static final int shaderc_limit_max_fragment_atomic_counter_buffers = 75;
    public static final int shaderc_limit_max_combined_atomic_counter_buffers = 76;
    public static final int shaderc_limit_max_atomic_counter_buffer_size = 77;
    public static final int shaderc_limit_max_transform_feedback_buffers = 78;
    public static final int shaderc_limit_max_transform_feedback_interleaved_components = 79;
    public static final int shaderc_limit_max_cull_distances = 80;
    public static final int shaderc_limit_max_combined_clip_and_cull_distances = 81;
    public static final int shaderc_limit_max_samples = 82;
    public static final int shaderc_limit_max_mesh_output_vertices_nv = 83;
    public static final int shaderc_limit_max_mesh_output_primitives_nv = 84;
    public static final int shaderc_limit_max_mesh_work_group_size_x_nv = 85;
    public static final int shaderc_limit_max_mesh_work_group_size_y_nv = 86;
    public static final int shaderc_limit_max_mesh_work_group_size_z_nv = 87;
    public static final int shaderc_limit_max_task_work_group_size_x_nv = 88;
    public static final int shaderc_limit_max_task_work_group_size_y_nv = 89;
    public static final int shaderc_limit_max_task_work_group_size_z_nv = 90;
    public static final int shaderc_limit_max_mesh_view_count_nv = 91;
    public static final int shaderc_limit_max_mesh_output_vertices_ext = 92;
    public static final int shaderc_limit_max_mesh_output_primitives_ext = 93;
    public static final int shaderc_limit_max_mesh_work_group_size_x_ext = 94;
    public static final int shaderc_limit_max_mesh_work_group_size_y_ext = 95;
    public static final int shaderc_limit_max_mesh_work_group_size_z_ext = 96;
    public static final int shaderc_limit_max_task_work_group_size_x_ext = 97;
    public static final int shaderc_limit_max_task_work_group_size_y_ext = 98;
    public static final int shaderc_limit_max_task_work_group_size_z_ext = 99;
    public static final int shaderc_limit_max_mesh_view_count_ext = 100;
    public static final int shaderc_limit_max_dual_source_draw_buffers_ext = 101;
    public static final int shaderc_uniform_kind_image = 0;
    public static final int shaderc_uniform_kind_sampler = 1;
    public static final int shaderc_uniform_kind_texture = 2;
    public static final int shaderc_uniform_kind_buffer = 3;
    public static final int shaderc_uniform_kind_storage_buffer = 4;
    public static final int shaderc_uniform_kind_unordered_access_view = 5;
    public static final int shaderc_include_type_relative = 0;
    public static final int shaderc_include_type_standard = 1;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of [`shaderc_compiler_initialize`][#shaderc_compiler_initialize].
        public static final MethodHandle MH_shaderc_compiler_initialize = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compiler_release`][#shaderc_compiler_release].
        public static final MethodHandle MH_shaderc_compiler_release = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_initialize`][#shaderc_compile_options_initialize].
        public static final MethodHandle MH_shaderc_compile_options_initialize = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_clone`][#shaderc_compile_options_clone].
        public static final MethodHandle MH_shaderc_compile_options_clone = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_release`][#shaderc_compile_options_release].
        public static final MethodHandle MH_shaderc_compile_options_release = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_add_macro_definition`][#shaderc_compile_options_add_macro_definition].
        public static final MethodHandle MH_shaderc_compile_options_add_macro_definition = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T));
        /// The method handle of [`shaderc_compile_options_set_source_language`][#shaderc_compile_options_set_source_language].
        public static final MethodHandle MH_shaderc_compile_options_set_source_language = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_generate_debug_info`][#shaderc_compile_options_set_generate_debug_info].
        public static final MethodHandle MH_shaderc_compile_options_set_generate_debug_info = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_set_optimization_level`][#shaderc_compile_options_set_optimization_level].
        public static final MethodHandle MH_shaderc_compile_options_set_optimization_level = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_forced_version_profile`][#shaderc_compile_options_set_forced_version_profile].
        public static final MethodHandle MH_shaderc_compile_options_set_forced_version_profile = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_include_callbacks`][#shaderc_compile_options_set_include_callbacks].
        public static final MethodHandle MH_shaderc_compile_options_set_include_callbacks = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_set_suppress_warnings`][#shaderc_compile_options_set_suppress_warnings].
        public static final MethodHandle MH_shaderc_compile_options_set_suppress_warnings = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_set_target_env`][#shaderc_compile_options_set_target_env].
        public static final MethodHandle MH_shaderc_compile_options_set_target_env = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_target_spirv`][#shaderc_compile_options_set_target_spirv].
        public static final MethodHandle MH_shaderc_compile_options_set_target_spirv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_warnings_as_errors`][#shaderc_compile_options_set_warnings_as_errors].
        public static final MethodHandle MH_shaderc_compile_options_set_warnings_as_errors = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_set_limit`][#shaderc_compile_options_set_limit].
        public static final MethodHandle MH_shaderc_compile_options_set_limit = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_auto_bind_uniforms`][#shaderc_compile_options_set_auto_bind_uniforms].
        public static final MethodHandle MH_shaderc_compile_options_set_auto_bind_uniforms = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_auto_combined_image_sampler`][#shaderc_compile_options_set_auto_combined_image_sampler].
        public static final MethodHandle MH_shaderc_compile_options_set_auto_combined_image_sampler = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_hlsl_io_mapping`][#shaderc_compile_options_set_hlsl_io_mapping].
        public static final MethodHandle MH_shaderc_compile_options_set_hlsl_io_mapping = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_hlsl_offsets`][#shaderc_compile_options_set_hlsl_offsets].
        public static final MethodHandle MH_shaderc_compile_options_set_hlsl_offsets = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_binding_base`][#shaderc_compile_options_set_binding_base].
        public static final MethodHandle MH_shaderc_compile_options_set_binding_base = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_binding_base_for_stage`][#shaderc_compile_options_set_binding_base_for_stage].
        public static final MethodHandle MH_shaderc_compile_options_set_binding_base_for_stage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_preserve_bindings`][#shaderc_compile_options_set_preserve_bindings].
        public static final MethodHandle MH_shaderc_compile_options_set_preserve_bindings = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_max_id_bound`][#shaderc_compile_options_set_max_id_bound].
        public static final MethodHandle MH_shaderc_compile_options_set_max_id_bound = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`shaderc_compile_options_set_auto_map_locations`][#shaderc_compile_options_set_auto_map_locations].
        public static final MethodHandle MH_shaderc_compile_options_set_auto_map_locations = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage`][#shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage].
        public static final MethodHandle MH_shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_set_hlsl_register_set_and_binding`][#shaderc_compile_options_set_hlsl_register_set_and_binding].
        public static final MethodHandle MH_shaderc_compile_options_set_hlsl_register_set_and_binding = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_options_set_hlsl_functionality1`][#shaderc_compile_options_set_hlsl_functionality1].
        public static final MethodHandle MH_shaderc_compile_options_set_hlsl_functionality1 = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_hlsl_16bit_types`][#shaderc_compile_options_set_hlsl_16bit_types].
        public static final MethodHandle MH_shaderc_compile_options_set_hlsl_16bit_types = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_vulkan_rules_relaxed`][#shaderc_compile_options_set_vulkan_rules_relaxed].
        public static final MethodHandle MH_shaderc_compile_options_set_vulkan_rules_relaxed = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_invert_y`][#shaderc_compile_options_set_invert_y].
        public static final MethodHandle MH_shaderc_compile_options_set_invert_y = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_options_set_nan_clamp`][#shaderc_compile_options_set_nan_clamp].
        public static final MethodHandle MH_shaderc_compile_options_set_nan_clamp = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of [`shaderc_compile_into_spv`][#shaderc_compile_into_spv].
        public static final MethodHandle MH_shaderc_compile_into_spv = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_into_spv_assembly`][#shaderc_compile_into_spv_assembly].
        public static final MethodHandle MH_shaderc_compile_into_spv_assembly = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_compile_into_preprocessed_text`][#shaderc_compile_into_preprocessed_text].
        public static final MethodHandle MH_shaderc_compile_into_preprocessed_text = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_assemble_into_spv`][#shaderc_assemble_into_spv].
        public static final MethodHandle MH_shaderc_assemble_into_spv = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_result_release`][#shaderc_result_release].
        public static final MethodHandle MH_shaderc_result_release = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_result_get_length`][#shaderc_result_get_length].
        public static final MethodHandle MH_shaderc_result_get_length = downcallHandle(FunctionDescriptor.of(CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_result_get_num_warnings`][#shaderc_result_get_num_warnings].
        public static final MethodHandle MH_shaderc_result_get_num_warnings = downcallHandle(FunctionDescriptor.of(CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_result_get_num_errors`][#shaderc_result_get_num_errors].
        public static final MethodHandle MH_shaderc_result_get_num_errors = downcallHandle(FunctionDescriptor.of(CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_result_get_compilation_status`][#shaderc_result_get_compilation_status].
        public static final MethodHandle MH_shaderc_result_get_compilation_status = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_result_get_bytes`][#shaderc_result_get_bytes].
        public static final MethodHandle MH_shaderc_result_get_bytes = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_result_get_error_message`][#shaderc_result_get_error_message].
        public static final MethodHandle MH_shaderc_result_get_error_message = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_get_spv_version`][#shaderc_get_spv_version].
        public static final MethodHandle MH_shaderc_get_spv_version = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`shaderc_parse_version_profile`][#shaderc_parse_version_profile].
        public static final MethodHandle MH_shaderc_parse_version_profile = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The function address of [`shaderc_compiler_initialize`][#shaderc_compiler_initialize].
        public final MemorySegment PFN_shaderc_compiler_initialize;
        /// The function address of [`shaderc_compiler_release`][#shaderc_compiler_release].
        public final MemorySegment PFN_shaderc_compiler_release;
        /// The function address of [`shaderc_compile_options_initialize`][#shaderc_compile_options_initialize].
        public final MemorySegment PFN_shaderc_compile_options_initialize;
        /// The function address of [`shaderc_compile_options_clone`][#shaderc_compile_options_clone].
        public final MemorySegment PFN_shaderc_compile_options_clone;
        /// The function address of [`shaderc_compile_options_release`][#shaderc_compile_options_release].
        public final MemorySegment PFN_shaderc_compile_options_release;
        /// The function address of [`shaderc_compile_options_add_macro_definition`][#shaderc_compile_options_add_macro_definition].
        public final MemorySegment PFN_shaderc_compile_options_add_macro_definition;
        /// The function address of [`shaderc_compile_options_set_source_language`][#shaderc_compile_options_set_source_language].
        public final MemorySegment PFN_shaderc_compile_options_set_source_language;
        /// The function address of [`shaderc_compile_options_set_generate_debug_info`][#shaderc_compile_options_set_generate_debug_info].
        public final MemorySegment PFN_shaderc_compile_options_set_generate_debug_info;
        /// The function address of [`shaderc_compile_options_set_optimization_level`][#shaderc_compile_options_set_optimization_level].
        public final MemorySegment PFN_shaderc_compile_options_set_optimization_level;
        /// The function address of [`shaderc_compile_options_set_forced_version_profile`][#shaderc_compile_options_set_forced_version_profile].
        public final MemorySegment PFN_shaderc_compile_options_set_forced_version_profile;
        /// The function address of [`shaderc_compile_options_set_include_callbacks`][#shaderc_compile_options_set_include_callbacks].
        public final MemorySegment PFN_shaderc_compile_options_set_include_callbacks;
        /// The function address of [`shaderc_compile_options_set_suppress_warnings`][#shaderc_compile_options_set_suppress_warnings].
        public final MemorySegment PFN_shaderc_compile_options_set_suppress_warnings;
        /// The function address of [`shaderc_compile_options_set_target_env`][#shaderc_compile_options_set_target_env].
        public final MemorySegment PFN_shaderc_compile_options_set_target_env;
        /// The function address of [`shaderc_compile_options_set_target_spirv`][#shaderc_compile_options_set_target_spirv].
        public final MemorySegment PFN_shaderc_compile_options_set_target_spirv;
        /// The function address of [`shaderc_compile_options_set_warnings_as_errors`][#shaderc_compile_options_set_warnings_as_errors].
        public final MemorySegment PFN_shaderc_compile_options_set_warnings_as_errors;
        /// The function address of [`shaderc_compile_options_set_limit`][#shaderc_compile_options_set_limit].
        public final MemorySegment PFN_shaderc_compile_options_set_limit;
        /// The function address of [`shaderc_compile_options_set_auto_bind_uniforms`][#shaderc_compile_options_set_auto_bind_uniforms].
        public final MemorySegment PFN_shaderc_compile_options_set_auto_bind_uniforms;
        /// The function address of [`shaderc_compile_options_set_auto_combined_image_sampler`][#shaderc_compile_options_set_auto_combined_image_sampler].
        public final MemorySegment PFN_shaderc_compile_options_set_auto_combined_image_sampler;
        /// The function address of [`shaderc_compile_options_set_hlsl_io_mapping`][#shaderc_compile_options_set_hlsl_io_mapping].
        public final MemorySegment PFN_shaderc_compile_options_set_hlsl_io_mapping;
        /// The function address of [`shaderc_compile_options_set_hlsl_offsets`][#shaderc_compile_options_set_hlsl_offsets].
        public final MemorySegment PFN_shaderc_compile_options_set_hlsl_offsets;
        /// The function address of [`shaderc_compile_options_set_binding_base`][#shaderc_compile_options_set_binding_base].
        public final MemorySegment PFN_shaderc_compile_options_set_binding_base;
        /// The function address of [`shaderc_compile_options_set_binding_base_for_stage`][#shaderc_compile_options_set_binding_base_for_stage].
        public final MemorySegment PFN_shaderc_compile_options_set_binding_base_for_stage;
        /// The function address of [`shaderc_compile_options_set_preserve_bindings`][#shaderc_compile_options_set_preserve_bindings].
        public final MemorySegment PFN_shaderc_compile_options_set_preserve_bindings;
        /// The function address of [`shaderc_compile_options_set_max_id_bound`][#shaderc_compile_options_set_max_id_bound].
        public final MemorySegment PFN_shaderc_compile_options_set_max_id_bound;
        /// The function address of [`shaderc_compile_options_set_auto_map_locations`][#shaderc_compile_options_set_auto_map_locations].
        public final MemorySegment PFN_shaderc_compile_options_set_auto_map_locations;
        /// The function address of [`shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage`][#shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage].
        public final MemorySegment PFN_shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage;
        /// The function address of [`shaderc_compile_options_set_hlsl_register_set_and_binding`][#shaderc_compile_options_set_hlsl_register_set_and_binding].
        public final MemorySegment PFN_shaderc_compile_options_set_hlsl_register_set_and_binding;
        /// The function address of [`shaderc_compile_options_set_hlsl_functionality1`][#shaderc_compile_options_set_hlsl_functionality1].
        public final MemorySegment PFN_shaderc_compile_options_set_hlsl_functionality1;
        /// The function address of [`shaderc_compile_options_set_hlsl_16bit_types`][#shaderc_compile_options_set_hlsl_16bit_types].
        public final MemorySegment PFN_shaderc_compile_options_set_hlsl_16bit_types;
        /// The function address of [`shaderc_compile_options_set_vulkan_rules_relaxed`][#shaderc_compile_options_set_vulkan_rules_relaxed].
        public final MemorySegment PFN_shaderc_compile_options_set_vulkan_rules_relaxed;
        /// The function address of [`shaderc_compile_options_set_invert_y`][#shaderc_compile_options_set_invert_y].
        public final MemorySegment PFN_shaderc_compile_options_set_invert_y;
        /// The function address of [`shaderc_compile_options_set_nan_clamp`][#shaderc_compile_options_set_nan_clamp].
        public final MemorySegment PFN_shaderc_compile_options_set_nan_clamp;
        /// The function address of [`shaderc_compile_into_spv`][#shaderc_compile_into_spv].
        public final MemorySegment PFN_shaderc_compile_into_spv;
        /// The function address of [`shaderc_compile_into_spv_assembly`][#shaderc_compile_into_spv_assembly].
        public final MemorySegment PFN_shaderc_compile_into_spv_assembly;
        /// The function address of [`shaderc_compile_into_preprocessed_text`][#shaderc_compile_into_preprocessed_text].
        public final MemorySegment PFN_shaderc_compile_into_preprocessed_text;
        /// The function address of [`shaderc_assemble_into_spv`][#shaderc_assemble_into_spv].
        public final MemorySegment PFN_shaderc_assemble_into_spv;
        /// The function address of [`shaderc_result_release`][#shaderc_result_release].
        public final MemorySegment PFN_shaderc_result_release;
        /// The function address of [`shaderc_result_get_length`][#shaderc_result_get_length].
        public final MemorySegment PFN_shaderc_result_get_length;
        /// The function address of [`shaderc_result_get_num_warnings`][#shaderc_result_get_num_warnings].
        public final MemorySegment PFN_shaderc_result_get_num_warnings;
        /// The function address of [`shaderc_result_get_num_errors`][#shaderc_result_get_num_errors].
        public final MemorySegment PFN_shaderc_result_get_num_errors;
        /// The function address of [`shaderc_result_get_compilation_status`][#shaderc_result_get_compilation_status].
        public final MemorySegment PFN_shaderc_result_get_compilation_status;
        /// The function address of [`shaderc_result_get_bytes`][#shaderc_result_get_bytes].
        public final MemorySegment PFN_shaderc_result_get_bytes;
        /// The function address of [`shaderc_result_get_error_message`][#shaderc_result_get_error_message].
        public final MemorySegment PFN_shaderc_result_get_error_message;
        /// The function address of [`shaderc_get_spv_version`][#shaderc_get_spv_version].
        public final MemorySegment PFN_shaderc_get_spv_version;
        /// The function address of [`shaderc_parse_version_profile`][#shaderc_parse_version_profile].
        public final MemorySegment PFN_shaderc_parse_version_profile;

        private Handles() {
            var _lookup = ShadercLibrary.lookup();
            PFN_shaderc_compiler_initialize = _lookup.findOrThrow("shaderc_compiler_initialize");
            PFN_shaderc_compiler_release = _lookup.findOrThrow("shaderc_compiler_release");
            PFN_shaderc_compile_options_initialize = _lookup.findOrThrow("shaderc_compile_options_initialize");
            PFN_shaderc_compile_options_clone = _lookup.findOrThrow("shaderc_compile_options_clone");
            PFN_shaderc_compile_options_release = _lookup.findOrThrow("shaderc_compile_options_release");
            PFN_shaderc_compile_options_add_macro_definition = _lookup.findOrThrow("shaderc_compile_options_add_macro_definition");
            PFN_shaderc_compile_options_set_source_language = _lookup.findOrThrow("shaderc_compile_options_set_source_language");
            PFN_shaderc_compile_options_set_generate_debug_info = _lookup.findOrThrow("shaderc_compile_options_set_generate_debug_info");
            PFN_shaderc_compile_options_set_optimization_level = _lookup.findOrThrow("shaderc_compile_options_set_optimization_level");
            PFN_shaderc_compile_options_set_forced_version_profile = _lookup.findOrThrow("shaderc_compile_options_set_forced_version_profile");
            PFN_shaderc_compile_options_set_include_callbacks = _lookup.findOrThrow("shaderc_compile_options_set_include_callbacks");
            PFN_shaderc_compile_options_set_suppress_warnings = _lookup.findOrThrow("shaderc_compile_options_set_suppress_warnings");
            PFN_shaderc_compile_options_set_target_env = _lookup.findOrThrow("shaderc_compile_options_set_target_env");
            PFN_shaderc_compile_options_set_target_spirv = _lookup.findOrThrow("shaderc_compile_options_set_target_spirv");
            PFN_shaderc_compile_options_set_warnings_as_errors = _lookup.findOrThrow("shaderc_compile_options_set_warnings_as_errors");
            PFN_shaderc_compile_options_set_limit = _lookup.findOrThrow("shaderc_compile_options_set_limit");
            PFN_shaderc_compile_options_set_auto_bind_uniforms = _lookup.findOrThrow("shaderc_compile_options_set_auto_bind_uniforms");
            PFN_shaderc_compile_options_set_auto_combined_image_sampler = _lookup.findOrThrow("shaderc_compile_options_set_auto_combined_image_sampler");
            PFN_shaderc_compile_options_set_hlsl_io_mapping = _lookup.findOrThrow("shaderc_compile_options_set_hlsl_io_mapping");
            PFN_shaderc_compile_options_set_hlsl_offsets = _lookup.findOrThrow("shaderc_compile_options_set_hlsl_offsets");
            PFN_shaderc_compile_options_set_binding_base = _lookup.findOrThrow("shaderc_compile_options_set_binding_base");
            PFN_shaderc_compile_options_set_binding_base_for_stage = _lookup.findOrThrow("shaderc_compile_options_set_binding_base_for_stage");
            PFN_shaderc_compile_options_set_preserve_bindings = _lookup.findOrThrow("shaderc_compile_options_set_preserve_bindings");
            PFN_shaderc_compile_options_set_max_id_bound = _lookup.findOrThrow("shaderc_compile_options_set_max_id_bound");
            PFN_shaderc_compile_options_set_auto_map_locations = _lookup.findOrThrow("shaderc_compile_options_set_auto_map_locations");
            PFN_shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage = _lookup.findOrThrow("shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage");
            PFN_shaderc_compile_options_set_hlsl_register_set_and_binding = _lookup.findOrThrow("shaderc_compile_options_set_hlsl_register_set_and_binding");
            PFN_shaderc_compile_options_set_hlsl_functionality1 = _lookup.findOrThrow("shaderc_compile_options_set_hlsl_functionality1");
            PFN_shaderc_compile_options_set_hlsl_16bit_types = _lookup.findOrThrow("shaderc_compile_options_set_hlsl_16bit_types");
            PFN_shaderc_compile_options_set_vulkan_rules_relaxed = _lookup.findOrThrow("shaderc_compile_options_set_vulkan_rules_relaxed");
            PFN_shaderc_compile_options_set_invert_y = _lookup.findOrThrow("shaderc_compile_options_set_invert_y");
            PFN_shaderc_compile_options_set_nan_clamp = _lookup.findOrThrow("shaderc_compile_options_set_nan_clamp");
            PFN_shaderc_compile_into_spv = _lookup.findOrThrow("shaderc_compile_into_spv");
            PFN_shaderc_compile_into_spv_assembly = _lookup.findOrThrow("shaderc_compile_into_spv_assembly");
            PFN_shaderc_compile_into_preprocessed_text = _lookup.findOrThrow("shaderc_compile_into_preprocessed_text");
            PFN_shaderc_assemble_into_spv = _lookup.findOrThrow("shaderc_assemble_into_spv");
            PFN_shaderc_result_release = _lookup.findOrThrow("shaderc_result_release");
            PFN_shaderc_result_get_length = _lookup.findOrThrow("shaderc_result_get_length");
            PFN_shaderc_result_get_num_warnings = _lookup.findOrThrow("shaderc_result_get_num_warnings");
            PFN_shaderc_result_get_num_errors = _lookup.findOrThrow("shaderc_result_get_num_errors");
            PFN_shaderc_result_get_compilation_status = _lookup.findOrThrow("shaderc_result_get_compilation_status");
            PFN_shaderc_result_get_bytes = _lookup.findOrThrow("shaderc_result_get_bytes");
            PFN_shaderc_result_get_error_message = _lookup.findOrThrow("shaderc_result_get_error_message");
            PFN_shaderc_get_spv_version = _lookup.findOrThrow("shaderc_get_spv_version");
            PFN_shaderc_parse_version_profile = _lookup.findOrThrow("shaderc_parse_version_profile");
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `shaderc_compiler_initialize`.
    /// ```
    /// (struct shaderc_compiler *) shaderc_compiler_t shaderc_compiler_initialize();
    /// ```
    public static @NonNull MemorySegment shaderc_compiler_initialize() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compiler_initialize"); }
        return (MemorySegment) Handles.MH_shaderc_compiler_initialize.invokeExact(Handles.get().PFN_shaderc_compiler_initialize); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compiler_initialize", e); }
    }

    /// Invokes `shaderc_compiler_release`.
    /// ```
    /// void shaderc_compiler_release((struct shaderc_compiler *) shaderc_compiler_t compiler);
    /// ```
    public static void shaderc_compiler_release(@NonNull MemorySegment compiler) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compiler_release", compiler); }
        Handles.MH_shaderc_compiler_release.invokeExact(Handles.get().PFN_shaderc_compiler_release, compiler); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compiler_release", e); }
    }

    /// Invokes `shaderc_compile_options_initialize`.
    /// ```
    /// (struct shaderc_compile_options *) shaderc_compile_options_t shaderc_compile_options_initialize();
    /// ```
    public static @NonNull MemorySegment shaderc_compile_options_initialize() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_initialize"); }
        return (MemorySegment) Handles.MH_shaderc_compile_options_initialize.invokeExact(Handles.get().PFN_shaderc_compile_options_initialize); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_initialize", e); }
    }

    /// Invokes `shaderc_compile_options_clone`.
    /// ```
    /// (struct shaderc_compile_options *) shaderc_compile_options_t shaderc_compile_options_clone((struct shaderc_compile_options *) const shaderc_compile_options_t options);
    /// ```
    public static @NonNull MemorySegment shaderc_compile_options_clone(@NonNull MemorySegment options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_clone", options); }
        return (MemorySegment) Handles.MH_shaderc_compile_options_clone.invokeExact(Handles.get().PFN_shaderc_compile_options_clone, options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_clone", e); }
    }

    /// Invokes `shaderc_compile_options_release`.
    /// ```
    /// void shaderc_compile_options_release((struct shaderc_compile_options *) shaderc_compile_options_t options);
    /// ```
    public static void shaderc_compile_options_release(@NonNull MemorySegment options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_release", options); }
        Handles.MH_shaderc_compile_options_release.invokeExact(Handles.get().PFN_shaderc_compile_options_release, options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_release", e); }
    }

    /// Invokes `shaderc_compile_options_add_macro_definition`.
    /// ```
    /// void shaderc_compile_options_add_macro_definition((struct shaderc_compile_options *) shaderc_compile_options_t options, const char* name, size_t name_length, const char* value, size_t value_length);
    /// ```
    public static void shaderc_compile_options_add_macro_definition(@NonNull MemorySegment options, @NonNull MemorySegment name, long name_length, @NonNull MemorySegment value, long value_length) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_add_macro_definition", options, name, name_length, value, value_length); }
        Handles.MH_shaderc_compile_options_add_macro_definition.invoke(Handles.get().PFN_shaderc_compile_options_add_macro_definition, options, name, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, name_length), value, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value_length)); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_add_macro_definition", e); }
    }

    /// Invokes `shaderc_compile_options_set_source_language`.
    /// ```
    /// void shaderc_compile_options_set_source_language((struct shaderc_compile_options *) shaderc_compile_options_t options, (int) shaderc_source_language lang);
    /// ```
    public static void shaderc_compile_options_set_source_language(@NonNull MemorySegment options, int lang) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_source_language", options, lang); }
        Handles.MH_shaderc_compile_options_set_source_language.invokeExact(Handles.get().PFN_shaderc_compile_options_set_source_language, options, lang); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_source_language", e); }
    }

    /// Invokes `shaderc_compile_options_set_generate_debug_info`.
    /// ```
    /// void shaderc_compile_options_set_generate_debug_info((struct shaderc_compile_options *) shaderc_compile_options_t options);
    /// ```
    public static void shaderc_compile_options_set_generate_debug_info(@NonNull MemorySegment options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_generate_debug_info", options); }
        Handles.MH_shaderc_compile_options_set_generate_debug_info.invokeExact(Handles.get().PFN_shaderc_compile_options_set_generate_debug_info, options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_generate_debug_info", e); }
    }

    /// Invokes `shaderc_compile_options_set_optimization_level`.
    /// ```
    /// void shaderc_compile_options_set_optimization_level((struct shaderc_compile_options *) shaderc_compile_options_t options, (int) shaderc_optimization_level level);
    /// ```
    public static void shaderc_compile_options_set_optimization_level(@NonNull MemorySegment options, int level) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_optimization_level", options, level); }
        Handles.MH_shaderc_compile_options_set_optimization_level.invokeExact(Handles.get().PFN_shaderc_compile_options_set_optimization_level, options, level); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_optimization_level", e); }
    }

    /// Invokes `shaderc_compile_options_set_forced_version_profile`.
    /// ```
    /// void shaderc_compile_options_set_forced_version_profile((struct shaderc_compile_options *) shaderc_compile_options_t options, int version, (int) shaderc_profile profile);
    /// ```
    public static void shaderc_compile_options_set_forced_version_profile(@NonNull MemorySegment options, int version, int profile) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_forced_version_profile", options, version, profile); }
        Handles.MH_shaderc_compile_options_set_forced_version_profile.invokeExact(Handles.get().PFN_shaderc_compile_options_set_forced_version_profile, options, version, profile); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_forced_version_profile", e); }
    }

    /// Invokes `shaderc_compile_options_set_include_callbacks`.
    /// ```
    /// void shaderc_compile_options_set_include_callbacks((struct shaderc_compile_options *) shaderc_compile_options_t options, (shaderc_include_result* (*ShadercIncludeResolveFn)(void* user_data, const char* requested_source, int type, const char* requesting_source, size_t include_depth)) shaderc_include_resolve_fn resolver, (void (*ShadercIncludeResultReleaseFn)(void* user_data, shaderc_include_result* include_result)) shaderc_include_result_release_fn result_releaser, void* user_data);
    /// ```
    public static void shaderc_compile_options_set_include_callbacks(@NonNull MemorySegment options, @NonNull MemorySegment resolver, @NonNull MemorySegment result_releaser, @NonNull MemorySegment user_data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_include_callbacks", options, resolver, result_releaser, user_data); }
        Handles.MH_shaderc_compile_options_set_include_callbacks.invokeExact(Handles.get().PFN_shaderc_compile_options_set_include_callbacks, options, resolver, result_releaser, user_data); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_include_callbacks", e); }
    }

    /// Invokes `shaderc_compile_options_set_suppress_warnings`.
    /// ```
    /// void shaderc_compile_options_set_suppress_warnings((struct shaderc_compile_options *) shaderc_compile_options_t options);
    /// ```
    public static void shaderc_compile_options_set_suppress_warnings(@NonNull MemorySegment options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_suppress_warnings", options); }
        Handles.MH_shaderc_compile_options_set_suppress_warnings.invokeExact(Handles.get().PFN_shaderc_compile_options_set_suppress_warnings, options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_suppress_warnings", e); }
    }

    /// Invokes `shaderc_compile_options_set_target_env`.
    /// ```
    /// void shaderc_compile_options_set_target_env((struct shaderc_compile_options *) shaderc_compile_options_t options, (int) shaderc_target_env target, uint32_t version);
    /// ```
    public static void shaderc_compile_options_set_target_env(@NonNull MemorySegment options, int target, int version) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_target_env", options, target, version); }
        Handles.MH_shaderc_compile_options_set_target_env.invokeExact(Handles.get().PFN_shaderc_compile_options_set_target_env, options, target, version); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_target_env", e); }
    }

    /// Invokes `shaderc_compile_options_set_target_spirv`.
    /// ```
    /// void shaderc_compile_options_set_target_spirv((struct shaderc_compile_options *) shaderc_compile_options_t options, (int) shaderc_spirv_version version);
    /// ```
    public static void shaderc_compile_options_set_target_spirv(@NonNull MemorySegment options, int version) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_target_spirv", options, version); }
        Handles.MH_shaderc_compile_options_set_target_spirv.invokeExact(Handles.get().PFN_shaderc_compile_options_set_target_spirv, options, version); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_target_spirv", e); }
    }

    /// Invokes `shaderc_compile_options_set_warnings_as_errors`.
    /// ```
    /// void shaderc_compile_options_set_warnings_as_errors((struct shaderc_compile_options *) shaderc_compile_options_t options);
    /// ```
    public static void shaderc_compile_options_set_warnings_as_errors(@NonNull MemorySegment options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_warnings_as_errors", options); }
        Handles.MH_shaderc_compile_options_set_warnings_as_errors.invokeExact(Handles.get().PFN_shaderc_compile_options_set_warnings_as_errors, options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_warnings_as_errors", e); }
    }

    /// Invokes `shaderc_compile_options_set_limit`.
    /// ```
    /// void shaderc_compile_options_set_limit((struct shaderc_compile_options *) shaderc_compile_options_t options, (int) shaderc_limit limit, int value);
    /// ```
    public static void shaderc_compile_options_set_limit(@NonNull MemorySegment options, int limit, int value) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_limit", options, limit, value); }
        Handles.MH_shaderc_compile_options_set_limit.invokeExact(Handles.get().PFN_shaderc_compile_options_set_limit, options, limit, value); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_limit", e); }
    }

    /// Invokes `shaderc_compile_options_set_auto_bind_uniforms`.
    /// ```
    /// void shaderc_compile_options_set_auto_bind_uniforms((struct shaderc_compile_options *) shaderc_compile_options_t options, bool auto_bind);
    /// ```
    public static void shaderc_compile_options_set_auto_bind_uniforms(@NonNull MemorySegment options, boolean auto_bind) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_auto_bind_uniforms", options, auto_bind); }
        Handles.MH_shaderc_compile_options_set_auto_bind_uniforms.invokeExact(Handles.get().PFN_shaderc_compile_options_set_auto_bind_uniforms, options, auto_bind); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_auto_bind_uniforms", e); }
    }

    /// Invokes `shaderc_compile_options_set_auto_combined_image_sampler`.
    /// ```
    /// void shaderc_compile_options_set_auto_combined_image_sampler((struct shaderc_compile_options *) shaderc_compile_options_t options, bool upgrade);
    /// ```
    public static void shaderc_compile_options_set_auto_combined_image_sampler(@NonNull MemorySegment options, boolean upgrade) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_auto_combined_image_sampler", options, upgrade); }
        Handles.MH_shaderc_compile_options_set_auto_combined_image_sampler.invokeExact(Handles.get().PFN_shaderc_compile_options_set_auto_combined_image_sampler, options, upgrade); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_auto_combined_image_sampler", e); }
    }

    /// Invokes `shaderc_compile_options_set_hlsl_io_mapping`.
    /// ```
    /// void shaderc_compile_options_set_hlsl_io_mapping((struct shaderc_compile_options *) shaderc_compile_options_t options, bool hlsl_iomap);
    /// ```
    public static void shaderc_compile_options_set_hlsl_io_mapping(@NonNull MemorySegment options, boolean hlsl_iomap) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_hlsl_io_mapping", options, hlsl_iomap); }
        Handles.MH_shaderc_compile_options_set_hlsl_io_mapping.invokeExact(Handles.get().PFN_shaderc_compile_options_set_hlsl_io_mapping, options, hlsl_iomap); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_hlsl_io_mapping", e); }
    }

    /// Invokes `shaderc_compile_options_set_hlsl_offsets`.
    /// ```
    /// void shaderc_compile_options_set_hlsl_offsets((struct shaderc_compile_options *) shaderc_compile_options_t options, bool hlsl_offsets);
    /// ```
    public static void shaderc_compile_options_set_hlsl_offsets(@NonNull MemorySegment options, boolean hlsl_offsets) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_hlsl_offsets", options, hlsl_offsets); }
        Handles.MH_shaderc_compile_options_set_hlsl_offsets.invokeExact(Handles.get().PFN_shaderc_compile_options_set_hlsl_offsets, options, hlsl_offsets); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_hlsl_offsets", e); }
    }

    /// Invokes `shaderc_compile_options_set_binding_base`.
    /// ```
    /// void shaderc_compile_options_set_binding_base((struct shaderc_compile_options *) shaderc_compile_options_t options, (int) shaderc_uniform_kind kind, uint32_t base);
    /// ```
    public static void shaderc_compile_options_set_binding_base(@NonNull MemorySegment options, int kind, int base) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_binding_base", options, kind, base); }
        Handles.MH_shaderc_compile_options_set_binding_base.invokeExact(Handles.get().PFN_shaderc_compile_options_set_binding_base, options, kind, base); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_binding_base", e); }
    }

    /// Invokes `shaderc_compile_options_set_binding_base_for_stage`.
    /// ```
    /// void shaderc_compile_options_set_binding_base_for_stage((struct shaderc_compile_options *) shaderc_compile_options_t options, (int) shaderc_shader_kind shader_kind, (int) shaderc_uniform_kind kind, uint32_t base);
    /// ```
    public static void shaderc_compile_options_set_binding_base_for_stage(@NonNull MemorySegment options, int shader_kind, int kind, int base) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_binding_base_for_stage", options, shader_kind, kind, base); }
        Handles.MH_shaderc_compile_options_set_binding_base_for_stage.invokeExact(Handles.get().PFN_shaderc_compile_options_set_binding_base_for_stage, options, shader_kind, kind, base); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_binding_base_for_stage", e); }
    }

    /// Invokes `shaderc_compile_options_set_preserve_bindings`.
    /// ```
    /// void shaderc_compile_options_set_preserve_bindings((struct shaderc_compile_options *) shaderc_compile_options_t options, bool preserve_bindings);
    /// ```
    public static void shaderc_compile_options_set_preserve_bindings(@NonNull MemorySegment options, boolean preserve_bindings) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_preserve_bindings", options, preserve_bindings); }
        Handles.MH_shaderc_compile_options_set_preserve_bindings.invokeExact(Handles.get().PFN_shaderc_compile_options_set_preserve_bindings, options, preserve_bindings); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_preserve_bindings", e); }
    }

    /// Invokes `shaderc_compile_options_set_max_id_bound`.
    /// ```
    /// void shaderc_compile_options_set_max_id_bound((struct shaderc_compile_options *) shaderc_compile_options_t options, uint32_t max_id_bound);
    /// ```
    public static void shaderc_compile_options_set_max_id_bound(@NonNull MemorySegment options, int max_id_bound) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_max_id_bound", options, max_id_bound); }
        Handles.MH_shaderc_compile_options_set_max_id_bound.invokeExact(Handles.get().PFN_shaderc_compile_options_set_max_id_bound, options, max_id_bound); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_max_id_bound", e); }
    }

    /// Invokes `shaderc_compile_options_set_auto_map_locations`.
    /// ```
    /// void shaderc_compile_options_set_auto_map_locations((struct shaderc_compile_options *) shaderc_compile_options_t options, bool auto_map);
    /// ```
    public static void shaderc_compile_options_set_auto_map_locations(@NonNull MemorySegment options, boolean auto_map) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_auto_map_locations", options, auto_map); }
        Handles.MH_shaderc_compile_options_set_auto_map_locations.invokeExact(Handles.get().PFN_shaderc_compile_options_set_auto_map_locations, options, auto_map); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_auto_map_locations", e); }
    }

    /// Invokes `shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage`.
    /// ```
    /// void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage((struct shaderc_compile_options *) shaderc_compile_options_t options, (int) shaderc_shader_kind shader_kind, const char* reg, const char* set, const char* binding);
    /// ```
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(@NonNull MemorySegment options, int shader_kind, @NonNull MemorySegment reg, @NonNull MemorySegment set, @NonNull MemorySegment binding) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage", options, shader_kind, reg, set, binding); }
        Handles.MH_shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage.invokeExact(Handles.get().PFN_shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage, options, shader_kind, reg, set, binding); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage", e); }
    }

    /// Invokes `shaderc_compile_options_set_hlsl_register_set_and_binding`.
    /// ```
    /// void shaderc_compile_options_set_hlsl_register_set_and_binding((struct shaderc_compile_options *) shaderc_compile_options_t options, const char* reg, const char* set, const char* binding);
    /// ```
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(@NonNull MemorySegment options, @NonNull MemorySegment reg, @NonNull MemorySegment set, @NonNull MemorySegment binding) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_hlsl_register_set_and_binding", options, reg, set, binding); }
        Handles.MH_shaderc_compile_options_set_hlsl_register_set_and_binding.invokeExact(Handles.get().PFN_shaderc_compile_options_set_hlsl_register_set_and_binding, options, reg, set, binding); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_hlsl_register_set_and_binding", e); }
    }

    /// Invokes `shaderc_compile_options_set_hlsl_functionality1`.
    /// ```
    /// void shaderc_compile_options_set_hlsl_functionality1((struct shaderc_compile_options *) shaderc_compile_options_t options, bool enable);
    /// ```
    public static void shaderc_compile_options_set_hlsl_functionality1(@NonNull MemorySegment options, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_hlsl_functionality1", options, enable); }
        Handles.MH_shaderc_compile_options_set_hlsl_functionality1.invokeExact(Handles.get().PFN_shaderc_compile_options_set_hlsl_functionality1, options, enable); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_hlsl_functionality1", e); }
    }

    /// Invokes `shaderc_compile_options_set_hlsl_16bit_types`.
    /// ```
    /// void shaderc_compile_options_set_hlsl_16bit_types((struct shaderc_compile_options *) shaderc_compile_options_t options, bool enable);
    /// ```
    public static void shaderc_compile_options_set_hlsl_16bit_types(@NonNull MemorySegment options, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_hlsl_16bit_types", options, enable); }
        Handles.MH_shaderc_compile_options_set_hlsl_16bit_types.invokeExact(Handles.get().PFN_shaderc_compile_options_set_hlsl_16bit_types, options, enable); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_hlsl_16bit_types", e); }
    }

    /// Invokes `shaderc_compile_options_set_vulkan_rules_relaxed`.
    /// ```
    /// void shaderc_compile_options_set_vulkan_rules_relaxed((struct shaderc_compile_options *) shaderc_compile_options_t options, bool enable);
    /// ```
    public static void shaderc_compile_options_set_vulkan_rules_relaxed(@NonNull MemorySegment options, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_vulkan_rules_relaxed", options, enable); }
        Handles.MH_shaderc_compile_options_set_vulkan_rules_relaxed.invokeExact(Handles.get().PFN_shaderc_compile_options_set_vulkan_rules_relaxed, options, enable); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_vulkan_rules_relaxed", e); }
    }

    /// Invokes `shaderc_compile_options_set_invert_y`.
    /// ```
    /// void shaderc_compile_options_set_invert_y((struct shaderc_compile_options *) shaderc_compile_options_t options, bool enable);
    /// ```
    public static void shaderc_compile_options_set_invert_y(@NonNull MemorySegment options, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_invert_y", options, enable); }
        Handles.MH_shaderc_compile_options_set_invert_y.invokeExact(Handles.get().PFN_shaderc_compile_options_set_invert_y, options, enable); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_invert_y", e); }
    }

    /// Invokes `shaderc_compile_options_set_nan_clamp`.
    /// ```
    /// void shaderc_compile_options_set_nan_clamp((struct shaderc_compile_options *) shaderc_compile_options_t options, bool enable);
    /// ```
    public static void shaderc_compile_options_set_nan_clamp(@NonNull MemorySegment options, boolean enable) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_options_set_nan_clamp", options, enable); }
        Handles.MH_shaderc_compile_options_set_nan_clamp.invokeExact(Handles.get().PFN_shaderc_compile_options_set_nan_clamp, options, enable); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_options_set_nan_clamp", e); }
    }

    /// Invokes `shaderc_compile_into_spv`.
    /// ```
    /// (struct shaderc_compilation_result *) shaderc_compilation_result_t shaderc_compile_into_spv((struct shaderc_compiler *) const shaderc_compiler_t compiler, const char* source_text, size_t source_text_size, (int) shaderc_shader_kind shader_kind, const char* input_file_name, const char* entry_point_name, (struct shaderc_compile_options *) const shaderc_compile_options_t additional_options);
    /// ```
    public static @NonNull MemorySegment shaderc_compile_into_spv(@NonNull MemorySegment compiler, @NonNull MemorySegment source_text, long source_text_size, int shader_kind, @NonNull MemorySegment input_file_name, @NonNull MemorySegment entry_point_name, @NonNull MemorySegment additional_options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_into_spv", compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options); }
        return (MemorySegment) Handles.MH_shaderc_compile_into_spv.invoke(Handles.get().PFN_shaderc_compile_into_spv, compiler, source_text, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, source_text_size), shader_kind, input_file_name, entry_point_name, additional_options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_into_spv", e); }
    }

    /// Invokes `shaderc_compile_into_spv_assembly`.
    /// ```
    /// (struct shaderc_compilation_result *) shaderc_compilation_result_t shaderc_compile_into_spv_assembly((struct shaderc_compiler *) const shaderc_compiler_t compiler, const char* source_text, size_t source_text_size, (int) shaderc_shader_kind shader_kind, const char* input_file_name, const char* entry_point_name, (struct shaderc_compile_options *) const shaderc_compile_options_t additional_options);
    /// ```
    public static @NonNull MemorySegment shaderc_compile_into_spv_assembly(@NonNull MemorySegment compiler, @NonNull MemorySegment source_text, long source_text_size, int shader_kind, @NonNull MemorySegment input_file_name, @NonNull MemorySegment entry_point_name, @NonNull MemorySegment additional_options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_into_spv_assembly", compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options); }
        return (MemorySegment) Handles.MH_shaderc_compile_into_spv_assembly.invoke(Handles.get().PFN_shaderc_compile_into_spv_assembly, compiler, source_text, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, source_text_size), shader_kind, input_file_name, entry_point_name, additional_options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_into_spv_assembly", e); }
    }

    /// Invokes `shaderc_compile_into_preprocessed_text`.
    /// ```
    /// (struct shaderc_compilation_result *) shaderc_compilation_result_t shaderc_compile_into_preprocessed_text((struct shaderc_compiler *) const shaderc_compiler_t compiler, const char* source_text, size_t source_text_size, (int) shaderc_shader_kind shader_kind, const char* input_file_name, const char* entry_point_name, (struct shaderc_compile_options *) const shaderc_compile_options_t additional_options);
    /// ```
    public static @NonNull MemorySegment shaderc_compile_into_preprocessed_text(@NonNull MemorySegment compiler, @NonNull MemorySegment source_text, long source_text_size, int shader_kind, @NonNull MemorySegment input_file_name, @NonNull MemorySegment entry_point_name, @NonNull MemorySegment additional_options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_compile_into_preprocessed_text", compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options); }
        return (MemorySegment) Handles.MH_shaderc_compile_into_preprocessed_text.invoke(Handles.get().PFN_shaderc_compile_into_preprocessed_text, compiler, source_text, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, source_text_size), shader_kind, input_file_name, entry_point_name, additional_options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_compile_into_preprocessed_text", e); }
    }

    /// Invokes `shaderc_assemble_into_spv`.
    /// ```
    /// (struct shaderc_compilation_result *) shaderc_compilation_result_t shaderc_assemble_into_spv((struct shaderc_compiler *) const shaderc_compiler_t compiler, const char* source_assembly, size_t source_assembly_size, (struct shaderc_compile_options *) const shaderc_compile_options_t additional_options);
    /// ```
    public static @NonNull MemorySegment shaderc_assemble_into_spv(@NonNull MemorySegment compiler, @NonNull MemorySegment source_assembly, long source_assembly_size, @NonNull MemorySegment additional_options) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_assemble_into_spv", compiler, source_assembly, source_assembly_size, additional_options); }
        return (MemorySegment) Handles.MH_shaderc_assemble_into_spv.invoke(Handles.get().PFN_shaderc_assemble_into_spv, compiler, source_assembly, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, source_assembly_size), additional_options); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_assemble_into_spv", e); }
    }

    /// Invokes `shaderc_result_release`.
    /// ```
    /// void shaderc_result_release((struct shaderc_compilation_result *) shaderc_compilation_result_t result);
    /// ```
    public static void shaderc_result_release(@NonNull MemorySegment result) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_result_release", result); }
        Handles.MH_shaderc_result_release.invokeExact(Handles.get().PFN_shaderc_result_release, result); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_result_release", e); }
    }

    /// Invokes `shaderc_result_get_length`.
    /// ```
    /// size_t shaderc_result_get_length((struct shaderc_compilation_result *) const shaderc_compilation_result_t result);
    /// ```
    public static long shaderc_result_get_length(@NonNull MemorySegment result) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_result_get_length", result); }
        return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, Handles.MH_shaderc_result_get_length.invoke(Handles.get().PFN_shaderc_result_get_length, result)); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_result_get_length", e); }
    }

    /// Invokes `shaderc_result_get_num_warnings`.
    /// ```
    /// size_t shaderc_result_get_num_warnings((struct shaderc_compilation_result *) const shaderc_compilation_result_t result);
    /// ```
    public static long shaderc_result_get_num_warnings(@NonNull MemorySegment result) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_result_get_num_warnings", result); }
        return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, Handles.MH_shaderc_result_get_num_warnings.invoke(Handles.get().PFN_shaderc_result_get_num_warnings, result)); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_result_get_num_warnings", e); }
    }

    /// Invokes `shaderc_result_get_num_errors`.
    /// ```
    /// size_t shaderc_result_get_num_errors((struct shaderc_compilation_result *) const shaderc_compilation_result_t result);
    /// ```
    public static long shaderc_result_get_num_errors(@NonNull MemorySegment result) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_result_get_num_errors", result); }
        return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, Handles.MH_shaderc_result_get_num_errors.invoke(Handles.get().PFN_shaderc_result_get_num_errors, result)); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_result_get_num_errors", e); }
    }

    /// Invokes `shaderc_result_get_compilation_status`.
    /// ```
    /// (int) shaderc_compilation_status shaderc_result_get_compilation_status((struct shaderc_compilation_result *) const shaderc_compilation_result_t result);
    /// ```
    public static int shaderc_result_get_compilation_status(@NonNull MemorySegment result) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_result_get_compilation_status", result); }
        return (int) Handles.MH_shaderc_result_get_compilation_status.invokeExact(Handles.get().PFN_shaderc_result_get_compilation_status, result); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_result_get_compilation_status", e); }
    }

    /// Invokes `shaderc_result_get_bytes`.
    /// ```
    /// const char* shaderc_result_get_bytes((struct shaderc_compilation_result *) const shaderc_compilation_result_t result);
    /// ```
    public static @NonNull MemorySegment shaderc_result_get_bytes(@NonNull MemorySegment result) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_result_get_bytes", result); }
        return (MemorySegment) Handles.MH_shaderc_result_get_bytes.invokeExact(Handles.get().PFN_shaderc_result_get_bytes, result); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_result_get_bytes", e); }
    }

    /// Invokes `shaderc_result_get_error_message`.
    /// ```
    /// const char* shaderc_result_get_error_message((struct shaderc_compilation_result *) const shaderc_compilation_result_t result);
    /// ```
    public static @NonNull MemorySegment shaderc_result_get_error_message(@NonNull MemorySegment result) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_result_get_error_message", result); }
        return (MemorySegment) Handles.MH_shaderc_result_get_error_message.invokeExact(Handles.get().PFN_shaderc_result_get_error_message, result); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_result_get_error_message", e); }
    }

    /// Invokes `shaderc_get_spv_version`.
    /// ```
    /// void shaderc_get_spv_version(unsigned int* version, unsigned int* revision);
    /// ```
    public static void shaderc_get_spv_version(@NonNull MemorySegment version, @NonNull MemorySegment revision) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_get_spv_version", version, revision); }
        Handles.MH_shaderc_get_spv_version.invokeExact(Handles.get().PFN_shaderc_get_spv_version, version, revision); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_get_spv_version", e); }
    }

    /// Invokes `shaderc_parse_version_profile`.
    /// ```
    /// bool shaderc_parse_version_profile(const char* str, int* version, shaderc_profile* profile);
    /// ```
    public static boolean shaderc_parse_version_profile(@NonNull MemorySegment str, @NonNull MemorySegment version, @NonNull MemorySegment profile) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("shaderc_parse_version_profile", str, version, profile); }
        return (boolean) Handles.MH_shaderc_parse_version_profile.invokeExact(Handles.get().PFN_shaderc_parse_version_profile, str, version, profile); }
        catch (Throwable e) { throw new RuntimeException("error in shaderc_parse_version_profile", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private Shaderc() {
    }
}
