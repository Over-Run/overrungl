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

package overrungl.opengl

import overrungl.opengl.OpenGLExt.AMD

/**
 * @author squid233
 * @since 0.1.0
 */
fun amd() {
    file(
        "BlendMinmaxFactor", AMD, "GL_AMD_blend_minmax_factor",
        "GL_FACTOR_MIN_AMD" to "0x901C",
        "GL_FACTOR_MAX_AMD" to "0x901D"
    )
    file("DebugOutput", AMD, "GL_AMD_debug_output") {
        "GL_MAX_DEBUG_MESSAGE_LENGTH_AMD"("0x9143")
        "GL_MAX_DEBUG_LOGGED_MESSAGES_AMD"("0x9144")
        "GL_DEBUG_LOGGED_MESSAGES_AMD"("0x9145")
        "GL_DEBUG_SEVERITY_HIGH_AMD"("0x9146")
        "GL_DEBUG_SEVERITY_MEDIUM_AMD"("0x9147")
        "GL_DEBUG_SEVERITY_LOW_AMD"("0x9148")
        "GL_DEBUG_CATEGORY_API_ERROR_AMD"("0x9149")
        "GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD"("0x914A")
        "GL_DEBUG_CATEGORY_DEPRECATION_AMD"("0x914B")
        "GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD"("0x914C")
        "GL_DEBUG_CATEGORY_PERFORMANCE_AMD"("0x914D")
        "GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD"("0x914E")
        "GL_DEBUG_CATEGORY_APPLICATION_AMD"("0x914F")
        "GL_DEBUG_CATEGORY_OTHER_AMD"("0x9150")
        "glDebugMessageEnableAMD"(
            void,
            GLenum("category"),
            GLenum("severity"),
            GLsizei("count"),
            address("ids", "const GLuint *"),
            GLboolean("enabled")
        )
        "glDebugMessageInsertAMD"(
            void,
            GLenum("category"),
            GLenum("severity"),
            GLuint("id"),
            GLsizei("length"),
            address("buf", "const GLchar *")
        )
        ("glDebugMessageCallbackAMD"(void, address("callback", "GLDEBUGPROCAMD"), address("userParam", "void *"))) {
            "glDebugMessageCallbackAMD"(
                void,
                "glDebugMessageCallbackAMD(callback.stub(arena), userParam);",
                arena("arena"),
                Type("GLDebugProcAMD", null)("callback"),
                address("userParam", "void *")
            )
        }
        "glGetDebugMessageLogAMD"(
            GLuint,
            GLuint("count"),
            GLsizei("bufSize"),
            address("categories", "GLenum *"),
            address("severities", "GLenum *"),
            address("ids", "GLuint *"),
            address("lengths", "GLsizei *"),
            address("message", "GLchar *")
        )
    }
    file(
        "DepthClampSeparate", AMD, "GL_AMD_depth_clamp_separate",
        "GL_DEPTH_CLAMP_NEAR_AMD" to "0x901E",
        "GL_DEPTH_CLAMP_FAR_AMD" to "0x901F"
    )
    file("DrawBuffersBlend", AMD, "GL_AMD_draw_buffers_blend") {
        "glBlendFuncIndexedAMD"(void, GLuint("buf"), GLenum("src"), GLenum("dst"))
        "glBlendFuncSeparateIndexedAMD"(
            void,
            GLuint("buf"),
            GLenum("srcRGB"),
            GLenum("dstRGB"),
            GLenum("srcAlpha"),
            GLenum("dstAlpha")
        )
        "glBlendEquationIndexedAMD"(void, GLuint("buf"), GLenum("mode"))
        "glBlendEquationSeparateIndexedAMD"(void, GLuint("buf"), GLenum("modeRGB"), GLenum("modeAlpha"))
    }
    file("FramebufferMultisampleAdvanced", AMD, "GL_AMD_framebuffer_multisample_advanced") {
        "GL_RENDERBUFFER_STORAGE_SAMPLES_AMD"("0x91B2")
        "GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD"("0x91B3")
        "GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD"("0x91B4")
        "GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD"("0x91B5")
        "GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD"("0x91B6")
        "GL_SUPPORTED_MULTISAMPLE_MODES_AMD"("0x91B7")
        "glRenderbufferStorageMultisampleAdvancedAMD"(
            void,
            GLenum("target"),
            GLsizei("samples"),
            GLsizei("storageSamples"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glNamedRenderbufferStorageMultisampleAdvancedAMD"(
            void,
            GLuint("renderbuffer"),
            GLsizei("samples"),
            GLsizei("storageSamples"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
    }
    file("FramebufferSamplePositions", AMD, "GL_AMD_framebuffer_sample_positions") {
        "GL_SUBSAMPLE_DISTANCE_AMD"("0x883F")
        "GL_PIXELS_PER_SAMPLE_PATTERN_X_AMD"("0x91AE")
        "GL_PIXELS_PER_SAMPLE_PATTERN_Y_AMD"("0x91AF")
        "GL_ALL_PIXELS_AMD"("0xFFFFFFFF")
        "glFramebufferSamplePositionsfvAMD"(
            void,
            GLenum("target"),
            GLuint("numsamples"),
            GLuint("pixelindex"),
            address("values", "const GLfloat *")
        )
        "glNamedFramebufferSamplePositionsfvAMD"(
            void,
            GLuint("framebuffer"),
            GLuint("numsamples"),
            GLuint("pixelindex"),
            address("values", "const GLfloat *")
        )
        "glGetFramebufferParameterfvAMD"(
            void,
            GLenum("target"),
            GLenum("pname"),
            GLuint("numsamples"),
            GLuint("pixelindex"),
            GLsizei("size"),
            address("values", "GLfloat *")
        )
        "glGetNamedFramebufferParameterfvAMD"(
            void,
            GLuint("framebuffer"),
            GLenum("pname"),
            GLuint("numsamples"),
            GLuint("pixelindex"),
            GLsizei("size"),
            address("values", "GLfloat *")
        )
    }
    file(
        "GpuShaderHalfFloat", AMD, "GL_AMD_gpu_shader_half_float",
        "GL_FLOAT16_NV" to "0x8FF8",
        "GL_FLOAT16_VEC2_NV" to "0x8FF9",
        "GL_FLOAT16_VEC3_NV" to "0x8FFA",
        "GL_FLOAT16_VEC4_NV" to "0x8FFB",
        "GL_FLOAT16_MAT2_AMD" to "0x91C5",
        "GL_FLOAT16_MAT3_AMD" to "0x91C6",
        "GL_FLOAT16_MAT4_AMD" to "0x91C7",
        "GL_FLOAT16_MAT2x3_AMD" to "0x91C8",
        "GL_FLOAT16_MAT2x4_AMD" to "0x91C9",
        "GL_FLOAT16_MAT3x2_AMD" to "0x91CA",
        "GL_FLOAT16_MAT3x4_AMD" to "0x91CB",
        "GL_FLOAT16_MAT4x2_AMD" to "0x91CC",
        "GL_FLOAT16_MAT4x3_AMD" to "0x91CD"
    )
    file("GpuShaderInt64", AMD, "GL_AMD_gpu_shader_int64") {
        "GL_INT64_NV"("0x140E")
        "GL_UNSIGNED_INT64_NV"("0x140F")
        "GL_INT8_NV"("0x8FE0")
        "GL_INT8_VEC2_NV"("0x8FE1")
        "GL_INT8_VEC3_NV"("0x8FE2")
        "GL_INT8_VEC4_NV"("0x8FE3")
        "GL_INT16_NV"("0x8FE4")
        "GL_INT16_VEC2_NV"("0x8FE5")
        "GL_INT16_VEC3_NV"("0x8FE6")
        "GL_INT16_VEC4_NV"("0x8FE7")
        "GL_INT64_VEC2_NV"("0x8FE9")
        "GL_INT64_VEC3_NV"("0x8FEA")
        "GL_INT64_VEC4_NV"("0x8FEB")
        "GL_UNSIGNED_INT8_NV"("0x8FEC")
        "GL_UNSIGNED_INT8_VEC2_NV"("0x8FED")
        "GL_UNSIGNED_INT8_VEC3_NV"("0x8FEE")
        "GL_UNSIGNED_INT8_VEC4_NV"("0x8FEF")
        "GL_UNSIGNED_INT16_NV"("0x8FF0")
        "GL_UNSIGNED_INT16_VEC2_NV"("0x8FF1")
        "GL_UNSIGNED_INT16_VEC3_NV"("0x8FF2")
        "GL_UNSIGNED_INT16_VEC4_NV"("0x8FF3")
        "GL_UNSIGNED_INT64_VEC2_NV"("0x8FF5")
        "GL_UNSIGNED_INT64_VEC3_NV"("0x8FF6")
        "GL_UNSIGNED_INT64_VEC4_NV"("0x8FF7")
        "glUniform1i64NV"(void, GLint("location"), GLint64EXT("x"))
        "glUniform2i64NV"(void, GLint("location"), GLint64EXT("x"), GLint64EXT("y"))
        "glUniform3i64NV"(void, GLint("location"), GLint64EXT("x"), GLint64EXT("y"), GLint64EXT("z"))
        "glUniform4i64NV"(void, GLint("location"), GLint64EXT("x"), GLint64EXT("y"), GLint64EXT("z"), GLint64EXT("w"))
        "glUniform1i64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLint64EXT *"))
        "glUniform2i64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLint64EXT *"))
        "glUniform3i64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLint64EXT *"))
        "glUniform4i64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLint64EXT *"))
        "glUniform1ui64NV"(void, GLint("location"), GLuint64EXT("x"))
        "glUniform2ui64NV"(void, GLint("location"), GLuint64EXT("x"), GLuint64EXT("y"))
        "glUniform3ui64NV"(void, GLint("location"), GLuint64EXT("x"), GLuint64EXT("y"), GLuint64EXT("z"))
        "glUniform4ui64NV"(
            void,
            GLint("location"),
            GLuint64EXT("x"),
            GLuint64EXT("y"),
            GLuint64EXT("z"),
            GLuint64EXT("w")
        )
        "glUniform1ui64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64EXT *"))
        "glUniform2ui64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64EXT *"))
        "glUniform3ui64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64EXT *"))
        "glUniform4ui64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64EXT *"))
        "glGetUniformi64vNV"(void, GLuint("program"), GLint("location"), address("params", "GLint64EXT *"))
        "glGetUniformui64vNV"(void, GLuint("program"), GLint("location"), address("params", "GLuint64EXT *"))
        "glProgramUniform1i64NV"(void, GLuint("program"), GLint("location"), GLint64EXT("x"))
        "glProgramUniform2i64NV"(void, GLuint("program"), GLint("location"), GLint64EXT("x"), GLint64EXT("y"))
        "glProgramUniform3i64NV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLint64EXT("x"),
            GLint64EXT("y"),
            GLint64EXT("z")
        )
        "glProgramUniform4i64NV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLint64EXT("x"),
            GLint64EXT("y"),
            GLint64EXT("z"),
            GLint64EXT("w")
        )
        "glProgramUniform1i64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint64EXT *")
        )
        "glProgramUniform2i64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint64EXT *")
        )
        "glProgramUniform3i64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint64EXT *")
        )
        "glProgramUniform4i64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint64EXT *")
        )
        "glProgramUniform1ui64NV"(void, GLuint("program"), GLint("location"), GLuint64EXT("x"))
        "glProgramUniform2ui64NV"(void, GLuint("program"), GLint("location"), GLuint64EXT("x"), GLuint64EXT("y"))
        "glProgramUniform3ui64NV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLuint64EXT("x"),
            GLuint64EXT("y"),
            GLuint64EXT("z")
        )
        "glProgramUniform4ui64NV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLuint64EXT("x"),
            GLuint64EXT("y"),
            GLuint64EXT("z"),
            GLuint64EXT("w")
        )
        "glProgramUniform1ui64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64EXT *")
        )
        "glProgramUniform2ui64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64EXT *")
        )
        "glProgramUniform3ui64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64EXT *")
        )
        "glProgramUniform4ui64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64EXT *")
        )
    }
    file("InterleavedElements", AMD, "GL_AMD_interleaved_elements") {
        "GL_VERTEX_ELEMENT_SWIZZLE_AMD"("0x91A4")
        "GL_VERTEX_ID_SWIZZLE_AMD"("0x91A5")
        "glVertexAttribParameteriAMD"(void, GLuint("index"), GLenum("pname"), GLint("param"))
    }
    file("MultiDrawIndirect", AMD, "GL_AMD_multi_draw_indirect") {
        "glMultiDrawArraysIndirectAMD"(
            void,
            GLenum("mode"),
            address("indirect", "const void *"),
            GLsizei("primcount"),
            GLsizei("stride")
        )
        "glMultiDrawElementsIndirectAMD"(
            void,
            GLenum("mode"),
            GLenum("type"),
            address("indirect", "const void *"),
            GLsizei("primcount"),
            GLsizei("stride")
        )
    }
    file("NameGenDelete", AMD, "GL_AMD_name_gen_delete") {
        "GL_DATA_BUFFER_AMD"("0x9151")
        "GL_PERFORMANCE_MONITOR_AMD"("0x9152")
        "GL_QUERY_OBJECT_AMD"("0x9153")
        "GL_VERTEX_ARRAY_OBJECT_AMD"("0x9154")
        "GL_SAMPLER_OBJECT_AMD"("0x9155")
        "glGenNamesAMD"(void, GLenum("identifier"), GLuint("num"), address("names", "GLuint *"))
        "glDeleteNamesAMD"(void, GLenum("identifier"), GLuint("num"), address("names", "const GLuint *"))
        "glIsNameAMD"(GLboolean, GLenum("identifier"), GLuint("name"))
    }
    file("OcclusionQueryEvent", AMD, "GL_AMD_occlusion_query_event") {
        "GL_OCCLUSION_QUERY_EVENT_MASK_AMD"("0x874F")
        "GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD"("0x00000001")
        "GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD"("0x00000002")
        "GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD"("0x00000004")
        "GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD"("0x00000008")
        "GL_QUERY_ALL_EVENT_BITS_AMD"("0xFFFFFFFF")
        "glQueryObjectParameteruiAMD"(void, GLenum("target"), GLuint("id"), GLenum("pname"), GLuint("param"))
    }
    file("PerformanceMonitor", AMD, "GL_AMD_performance_monitor") {
        "GL_COUNTER_TYPE_AMD"("0x8BC0")
        "GL_COUNTER_RANGE_AMD"("0x8BC1")
        "GL_UNSIGNED_INT64_AMD"("0x8BC2")
        "GL_PERCENTAGE_AMD"("0x8BC3")
        "GL_PERFMON_RESULT_AVAILABLE_AMD"("0x8BC4")
        "GL_PERFMON_RESULT_SIZE_AMD"("0x8BC5")
        "GL_PERFMON_RESULT_AMD"("0x8BC6")
        "glGetPerfMonitorGroupsAMD"(
            void,
            address("numGroups", "GLint *"),
            GLsizei("groupsSize"),
            address("groups", "GLuint *")
        )
        "glGetPerfMonitorCountersAMD"(
            void,
            GLuint("group"),
            address("numCounters", "GLint *"),
            address("maxActiveCounters", "GLint *"),
            GLsizei("counterSize"),
            address("counters", "GLuint *")
        )
        "glGetPerfMonitorGroupStringAMD"(
            void,
            GLuint("group"),
            GLsizei("bufSize"),
            address("length", "GLsizei *"),
            address("groupString", "GLchar *")
        )
        "glGetPerfMonitorCounterStringAMD"(
            void,
            GLuint("group"),
            GLuint("counter"),
            GLsizei("bufSize"),
            address("length", "GLsizei *"),
            address("counterString", "GLchar *")
        )
        "glGetPerfMonitorCounterInfoAMD"(
            void,
            GLuint("group"),
            GLuint("counter"),
            GLenum("pname"),
            address("data", "void *")
        )
        "glGenPerfMonitorsAMD"(void, GLsizei("n"), address("monitors", "GLuint *"))
        "glDeletePerfMonitorsAMD"(void, GLsizei("n"), address("monitors", "GLuint *"))
        "glSelectPerfMonitorCountersAMD"(
            void,
            GLuint("monitor"),
            GLboolean("enable"),
            GLuint("group"),
            GLint("numCounters"),
            address("counterList", "GLuint *")
        )
        "glBeginPerfMonitorAMD"(void, GLuint("monitor"))
        "glEndPerfMonitorAMD"(void, GLuint("monitor"))
        "glGetPerfMonitorCounterDataAMD"(
            void,
            GLuint("monitor"),
            GLenum("pname"),
            GLsizei("dataSize"),
            address("data", "GLuint *"),
            address("bytesWritten", "GLint *")
        )
    }
    file("PinnedMemory", AMD, "GL_AMD_pinned_memory", "GL_EXTERNAL_VIRTUAL_MEMORY_BUFFER_AMD" to "0x9160")
    file(
        "QueryBufferObject", AMD, "GL_AMD_query_buffer_object",
        "GL_QUERY_BUFFER_AMD" to "0x9192",
        "GL_QUERY_BUFFER_BINDING_AMD" to "0x9193",
        "GL_QUERY_RESULT_NO_WAIT_AMD" to "0x9194"
    )
    file("SamplePositions", AMD, "GL_AMD_sample_positions") {
        "glSetMultisamplefvAMD"(void, GLenum("pname"), GLuint("index"), address("val", "const GLfloat *"))
    }
    file("SparseTexture", AMD, "GL_AMD_sparse_texture") {
        "GL_VIRTUAL_PAGE_SIZE_X_AMD"("0x9195")
        "GL_VIRTUAL_PAGE_SIZE_Y_AMD"("0x9196")
        "GL_VIRTUAL_PAGE_SIZE_Z_AMD"("0x9197")
        "GL_MAX_SPARSE_TEXTURE_SIZE_AMD"("0x9198")
        "GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD"("0x9199")
        "GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS"("0x919A")
        "GL_MIN_SPARSE_LEVEL_AMD"("0x919B")
        "GL_MIN_LOD_WARNING_AMD"("0x919C")
        "GL_TEXTURE_STORAGE_SPARSE_BIT_AMD"("0x00000001")
        "glTexStorageSparseAMD"(
            void,
            GLenum("target"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLsizei("layers"),
            GLbitfield("flags")
        )
        "glTextureStorageSparseAMD"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLsizei("layers"),
            GLbitfield("flags")
        )
    }
    file("StencilOperationExtended", AMD, "GL_AMD_stencil_operation_extended") {
        "GL_SET_AMD"("0x874A")
        "GL_REPLACE_VALUE_AMD"("0x874B")
        "GL_STENCIL_OP_VALUE_AMD"("0x874C")
        "GL_STENCIL_BACK_OP_VALUE_AMD"("0x874D")
        "glStencilOpValueAMD"(void, GLenum("face"), GLuint("value"))
    }
    file("TransformFeedback4", AMD, "GL_AMD_transform_feedback4", "GL_STREAM_RASTERIZATION_AMD" to "0x91A0")
    file("VertexShaderTessellator", AMD, "GL_AMD_vertex_shader_tessellator") {
        "GL_SAMPLER_BUFFER_AMD"("0x9001")
        "GL_INT_SAMPLER_BUFFER_AMD"("0x9002")
        "GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD"("0x9003")
        "GL_TESSELLATION_MODE_AMD"("0x9004")
        "GL_TESSELLATION_FACTOR_AMD"("0x9005")
        "GL_DISCRETE_AMD"("0x9006")
        "GL_CONTINUOUS_AMD"("0x9007")
        "glTessellationFactorAMD"(void, GLfloat("factor"))
        "glTessellationModeAMD"(void, GLenum("mode"))
    }
}
