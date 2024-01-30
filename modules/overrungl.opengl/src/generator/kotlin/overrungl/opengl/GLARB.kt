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

import overrungl.opengl.OpenGLExt.ARB

/**
 * @author squid233
 * @since 0.1.0
 */
fun arb() {
    file("ES32Compatibility", ARB, "GL_ARB_ES3_2_compatibility") {
        "GL_PRIMITIVE_BOUNDING_BOX_ARB"("0x92BE")
        "GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB"("0x9381")
        "GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB"("0x9382")
        "glPrimitiveBoundingBoxARB"(
            void,
            GLfloat("minX"),
            GLfloat("minY"),
            GLfloat("minZ"),
            GLfloat("minW"),
            GLfloat("maxX"),
            GLfloat("maxY"),
            GLfloat("maxZ"),
            GLfloat("maxW")
        )
    }
    file("BindlessTexture", ARB, "GL_ARB_bindless_texture") {
        "GL_UNSIGNED_INT64_ARB"("0x140F")
        "glGetTextureHandleARB"(GLuint64, GLuint("texture"))
        "glGetTextureSamplerHandleARB"(GLuint64, GLuint("texture"), GLuint("sampler"))
        "glMakeTextureHandleResidentARB"(void, GLuint64("handle"))
        "glMakeTextureHandleNonResidentARB"(void, GLuint64("handle"))
        "glGetImageHandleARB"(
            GLuint64,
            GLuint("texture"),
            GLint("level"),
            GLboolean("layered"),
            GLint("layer"),
            GLenum("format")
        )
        "glMakeImageHandleResidentARB"(void, GLuint64("handle"), GLenum("access"))
        "glMakeImageHandleNonResidentARB"(void, GLuint64("handle"))
        "glUniformHandleui64ARB"(void, GLint("location"), GLuint64("value"))
        "glUniformHandleui64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64 *"))
        "glProgramUniformHandleui64ARB"(void, GLuint("program"), GLint("location"), GLuint64("value"))
        "glProgramUniformHandleui64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("values", "const GLuint64 *")
        )
        "glIsTextureHandleResidentARB"(GLboolean, GLuint64("handle"))
        "glIsImageHandleResidentARB"(GLboolean, GLuint64("handle"))
        "glVertexAttribL1ui64ARB"(void, GLuint("index"), GLuint64EXT("x"))
        "glVertexAttribL1ui64vARB"(void, GLuint("index"), address("v", "const GLuint64EXT *"))
        "glGetVertexAttribLui64vARB"(void, GLuint("index"), GLenum("pname"), address("params", "GLuint64EXT *"))
    }
    file("CLEvent", ARB, "GL_ARB_cl_event") {
        "GL_SYNC_CL_EVENT_ARB"("0x8240")
        "GL_SYNC_CL_EVENT_COMPLETE_ARB"("0x8241")
        "glCreateSyncFromCLeventARB"(
            address,
            address("context", "struct _cl_context *"),
            address("event", "struct _cl_event *"),
            GLbitfield("flags"),
            nativeType = "GLsync"
        )
    }
    file("ColorBufferFloat", ARB, "GL_ARB_color_buffer_float") {
        "GL_RGBA_FLOAT_MODE_ARB"("0x8820")
        "GL_CLAMP_VERTEX_COLOR_ARB"("0x891A")
        "GL_CLAMP_FRAGMENT_COLOR_ARB"("0x891B")
        "GL_CLAMP_READ_COLOR_ARB"("0x891C")
        "GL_FIXED_ONLY_ARB"("0x891D")
        "glClampColorARB"(void, GLenum("target"), GLenum("clamp"))
    }
    file("ComputeVariableGroupSize", ARB, "GL_ARB_compute_variable_group_size") {
        "GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB"("0x9344")
        "GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB"("0x90EB")
        "GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB"("0x9345")
        "GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB"("0x91BF")
        "glDispatchComputeGroupSizeARB"(
            void,
            GLuint("num_groups_x"),
            GLuint("num_groups_y"),
            GLuint("num_groups_z"),
            GLuint("group_size_x"),
            GLuint("group_size_y"),
            GLuint("group_size_z")
        )
    }
    file("DebugOutput", ARB, "GL_ARB_debug_output") {
        "GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB"("0x8242")
        "GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB"("0x8243")
        "GL_DEBUG_CALLBACK_FUNCTION_ARB"("0x8244")
        "GL_DEBUG_CALLBACK_USER_PARAM_ARB"("0x8245")
        "GL_DEBUG_SOURCE_API_ARB"("0x8246")
        "GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB"("0x8247")
        "GL_DEBUG_SOURCE_SHADER_COMPILER_ARB"("0x8248")
        "GL_DEBUG_SOURCE_THIRD_PARTY_ARB"("0x8249")
        "GL_DEBUG_SOURCE_APPLICATION_ARB"("0x824A")
        "GL_DEBUG_SOURCE_OTHER_ARB"("0x824B")
        "GL_DEBUG_TYPE_ERROR_ARB"("0x824C")
        "GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB"("0x824D")
        "GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB"("0x824E")
        "GL_DEBUG_TYPE_PORTABILITY_ARB"("0x824F")
        "GL_DEBUG_TYPE_PERFORMANCE_ARB"("0x8250")
        "GL_DEBUG_TYPE_OTHER_ARB"("0x8251")
        "GL_MAX_DEBUG_MESSAGE_LENGTH_ARB"("0x9143")
        "GL_MAX_DEBUG_LOGGED_MESSAGES_ARB"("0x9144")
        "GL_DEBUG_LOGGED_MESSAGES_ARB"("0x9145")
        "GL_DEBUG_SEVERITY_HIGH_ARB"("0x9146")
        "GL_DEBUG_SEVERITY_MEDIUM_ARB"("0x9147")
        "GL_DEBUG_SEVERITY_LOW_ARB"("0x9148")
        "glDebugMessageControlARB"(
            void,
            GLenum("source"),
            GLenum("type"),
            GLenum("severity"),
            GLsizei("count"),
            address("ids", "const GLuint *"),
            GLboolean("enabled")
        )
        "glDebugMessageInsertARB"(
            void,
            GLenum("source"),
            GLenum("type"),
            GLuint("id"),
            GLenum("severity"),
            GLsizei("length"),
            address("buf", "const GLchar *")
        )
        ("glDebugMessageCallbackARB"(
            void,
            address("callback", "GLDEBUGPROCARB"),
            address("userParam", "const void *")
        )) {
            "glDebugMessageCallbackARB"(
                void,
                "glDebugMessageCallbackARB(callback.stub(arena), userParam);",
                arena("arena"),
                Type("GLDebugProc", null)("callback"),
                address("userParam", "const void *")
            )
        }
        "glGetDebugMessageLogARB"(
            GLuint,
            GLuint("count"),
            GLsizei("bufSize"),
            address("sources", "GLenum *"),
            address("types", "GLenum *"),
            address("ids", "GLuint *"),
            address("severities", "GLenum *"),
            address("lengths", "GLsizei *"),
            address("messageLog", "GLchar *")
        )
    }
    file(
        "DepthTexture", ARB, "GL_ARB_depth_texture",
        "GL_DEPTH_COMPONENT16_ARB" to "0x81A5",
        "GL_DEPTH_COMPONENT24_ARB" to "0x81A6",
        "GL_DEPTH_COMPONENT32_ARB" to "0x81A7",
        "GL_TEXTURE_DEPTH_SIZE_ARB" to "0x884A",
        "GL_DEPTH_TEXTURE_MODE_ARB" to "0x884B"
    )
    file("DrawBuffers", ARB, "GL_ARB_draw_buffers") {
        "GL_MAX_DRAW_BUFFERS_ARB"("0x8824")
        "GL_DRAW_BUFFER0_ARB"("0x8825")
        "GL_DRAW_BUFFER1_ARB"("0x8826")
        "GL_DRAW_BUFFER2_ARB"("0x8827")
        "GL_DRAW_BUFFER3_ARB"("0x8828")
        "GL_DRAW_BUFFER4_ARB"("0x8829")
        "GL_DRAW_BUFFER5_ARB"("0x882A")
        "GL_DRAW_BUFFER6_ARB"("0x882B")
        "GL_DRAW_BUFFER7_ARB"("0x882C")
        "GL_DRAW_BUFFER8_ARB"("0x882D")
        "GL_DRAW_BUFFER9_ARB"("0x882E")
        "GL_DRAW_BUFFER10_ARB"("0x882F")
        "GL_DRAW_BUFFER11_ARB"("0x8830")
        "GL_DRAW_BUFFER12_ARB"("0x8831")
        "GL_DRAW_BUFFER13_ARB"("0x8832")
        "GL_DRAW_BUFFER14_ARB"("0x8833")
        "GL_DRAW_BUFFER15_ARB"("0x8834")
        "glDrawBuffersARB"(void, GLsizei("n"), address("bufs", "const GLenum *"))
    }
    file("DrawBuffersBlend", ARB, "GL_ARB_draw_buffers_blend") {
        "glBlendEquationiARB"(void, GLuint("buf"), GLenum("mode"))
        "glBlendEquationSeparateiARB"(void, GLuint("buf"), GLenum("modeRGB"), GLenum("modeAlpha"))
        "glBlendFunciARB"(void, GLuint("buf"), GLenum("src"), GLenum("dst"))
        "glBlendFuncSeparateiARB"(
            void,
            GLuint("buf"),
            GLenum("srcRGB"),
            GLenum("dstRGB"),
            GLenum("srcAlpha"),
            GLenum("dstAlpha")
        )
    }
    file("DrawInstanced", ARB, "GL_ARB_draw_instanced") {
        "glDrawArraysInstancedARB"(void, GLenum("mode"), GLint("first"), GLsizei("count"), GLsizei("primcount"))
        "glDrawElementsInstancedARB"(
            void,
            GLenum("mode"),
            GLsizei("count"),
            GLenum("type"),
            address("indices", "const void *"),
            GLsizei("primcount")
        )
    }
    file("FragmentProgram", ARB, "GL_ARB_fragment_program") {
        "GL_FRAGMENT_PROGRAM_ARB"("0x8804")
        "GL_PROGRAM_FORMAT_ASCII_ARB"("0x8875")
        "GL_PROGRAM_LENGTH_ARB"("0x8627")
        "GL_PROGRAM_FORMAT_ARB"("0x8876")
        "GL_PROGRAM_BINDING_ARB"("0x8677")
        "GL_PROGRAM_INSTRUCTIONS_ARB"("0x88A0")
        "GL_MAX_PROGRAM_INSTRUCTIONS_ARB"("0x88A1")
        "GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB"("0x88A2")
        "GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB"("0x88A3")
        "GL_PROGRAM_TEMPORARIES_ARB"("0x88A4")
        "GL_MAX_PROGRAM_TEMPORARIES_ARB"("0x88A5")
        "GL_PROGRAM_NATIVE_TEMPORARIES_ARB"("0x88A6")
        "GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB"("0x88A7")
        "GL_PROGRAM_PARAMETERS_ARB"("0x88A8")
        "GL_MAX_PROGRAM_PARAMETERS_ARB"("0x88A9")
        "GL_PROGRAM_NATIVE_PARAMETERS_ARB"("0x88AA")
        "GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB"("0x88AB")
        "GL_PROGRAM_ATTRIBS_ARB"("0x88AC")
        "GL_MAX_PROGRAM_ATTRIBS_ARB"("0x88AD")
        "GL_PROGRAM_NATIVE_ATTRIBS_ARB"("0x88AE")
        "GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB"("0x88AF")
        "GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB"("0x88B4")
        "GL_MAX_PROGRAM_ENV_PARAMETERS_ARB"("0x88B5")
        "GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB"("0x88B6")
        "GL_PROGRAM_ALU_INSTRUCTIONS_ARB"("0x8805")
        "GL_PROGRAM_TEX_INSTRUCTIONS_ARB"("0x8806")
        "GL_PROGRAM_TEX_INDIRECTIONS_ARB"("0x8807")
        "GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB"("0x8808")
        "GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB"("0x8809")
        "GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB"("0x880A")
        "GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB"("0x880B")
        "GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB"("0x880C")
        "GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB"("0x880D")
        "GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB"("0x880E")
        "GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB"("0x880F")
        "GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB"("0x8810")
        "GL_PROGRAM_STRING_ARB"("0x8628")
        "GL_PROGRAM_ERROR_POSITION_ARB"("0x864B")
        "GL_CURRENT_MATRIX_ARB"("0x8641")
        "GL_TRANSPOSE_CURRENT_MATRIX_ARB"("0x88B7")
        "GL_CURRENT_MATRIX_STACK_DEPTH_ARB"("0x8640")
        "GL_MAX_PROGRAM_MATRICES_ARB"("0x862F")
        "GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB"("0x862E")
        "GL_MAX_TEXTURE_COORDS_ARB"("0x8871")
        "GL_MAX_TEXTURE_IMAGE_UNITS_ARB"("0x8872")
        "GL_PROGRAM_ERROR_STRING_ARB"("0x8874")
        "GL_MATRIX0_ARB"("0x88C0")
        "GL_MATRIX1_ARB"("0x88C1")
        "GL_MATRIX2_ARB"("0x88C2")
        "GL_MATRIX3_ARB"("0x88C3")
        "GL_MATRIX4_ARB"("0x88C4")
        "GL_MATRIX5_ARB"("0x88C5")
        "GL_MATRIX6_ARB"("0x88C6")
        "GL_MATRIX7_ARB"("0x88C7")
        "GL_MATRIX8_ARB"("0x88C8")
        "GL_MATRIX9_ARB"("0x88C9")
        "GL_MATRIX10_ARB"("0x88CA")
        "GL_MATRIX11_ARB"("0x88CB")
        "GL_MATRIX12_ARB"("0x88CC")
        "GL_MATRIX13_ARB"("0x88CD")
        "GL_MATRIX14_ARB"("0x88CE")
        "GL_MATRIX15_ARB"("0x88CF")
        "GL_MATRIX16_ARB"("0x88D0")
        "GL_MATRIX17_ARB"("0x88D1")
        "GL_MATRIX18_ARB"("0x88D2")
        "GL_MATRIX19_ARB"("0x88D3")
        "GL_MATRIX20_ARB"("0x88D4")
        "GL_MATRIX21_ARB"("0x88D5")
        "GL_MATRIX22_ARB"("0x88D6")
        "GL_MATRIX23_ARB"("0x88D7")
        "GL_MATRIX24_ARB"("0x88D8")
        "GL_MATRIX25_ARB"("0x88D9")
        "GL_MATRIX26_ARB"("0x88DA")
        "GL_MATRIX27_ARB"("0x88DB")
        "GL_MATRIX28_ARB"("0x88DC")
        "GL_MATRIX29_ARB"("0x88DD")
        "GL_MATRIX30_ARB"("0x88DE")
        "GL_MATRIX31_ARB"("0x88DF")
        "glProgramStringARB"(
            void,
            GLenum("target"),
            GLenum("format"),
            GLsizei("len"),
            address("string", "const void *")
        )
        "glBindProgramARB"(void, GLenum("target"), GLuint("program"))
        "glDeleteProgramsARB"(void, GLsizei("n"), address("programs", "const GLuint *"))
        "glGenProgramsARB"(void, GLsizei("n"), address("programs", "GLuint *"))
        "glProgramEnvParameter4dARB"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLdouble("x"),
            GLdouble("y"),
            GLdouble("z"),
            GLdouble("w")
        )
        "glProgramEnvParameter4dvARB"(void, GLenum("target"), GLuint("index"), address("params", "const GLdouble *"))
        "glProgramEnvParameter4fARB"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z"),
            GLfloat("w")
        )
        "glProgramEnvParameter4fvARB"(void, GLenum("target"), GLuint("index"), address("params", "const GLfloat *"))
        "glProgramLocalParameter4dARB"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLdouble("x"),
            GLdouble("y"),
            GLdouble("z"),
            GLdouble("w")
        )
        "glProgramLocalParameter4dvARB"(void, GLenum("target"), GLuint("index"), address("params", "const GLdouble *"))
        "glProgramLocalParameter4fARB"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z"),
            GLfloat("w")
        )
        "glProgramLocalParameter4fvARB"(void, GLenum("target"), GLuint("index"), address("params", "const GLfloat *"))
        "glGetProgramEnvParameterdvARB"(void, GLenum("target"), GLuint("index"), address("params", "GLdouble *"))
        "glGetProgramEnvParameterfvARB"(void, GLenum("target"), GLuint("index"), address("params", "GLfloat *"))
        "glGetProgramLocalParameterdvARB"(void, GLenum("target"), GLuint("index"), address("params", "GLdouble *"))
        "glGetProgramLocalParameterfvARB"(void, GLenum("target"), GLuint("index"), address("params", "GLfloat *"))
        "glGetProgramivARB"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetProgramStringARB"(void, GLenum("target"), GLenum("pname"), address("string", "void *"))
        "glIsProgramARB"(GLboolean, GLuint("program"))
    }
    file(
        "FragmentShader", ARB, "GL_ARB_fragment_shader",
        "GL_FRAGMENT_SHADER_ARB" to "0x8B30",
        "GL_MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB" to "0x8B49",
        "GL_FRAGMENT_SHADER_DERIVATIVE_HINT_ARB" to "0x8B8B"
    )
    file("GeometryShader4", ARB, "GL_ARB_geometry_shader4") {
        "GL_LINES_ADJACENCY_ARB"("0x000A")
        "GL_LINE_STRIP_ADJACENCY_ARB"("0x000B")
        "GL_TRIANGLES_ADJACENCY_ARB"("0x000C")
        "GL_TRIANGLE_STRIP_ADJACENCY_ARB"("0x000D")
        "GL_PROGRAM_POINT_SIZE_ARB"("0x8642")
        "GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB"("0x8C29")
        "GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB"("0x8DA7")
        "GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB"("0x8DA8")
        "GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB"("0x8DA9")
        "GL_GEOMETRY_SHADER_ARB"("0x8DD9")
        "GL_GEOMETRY_VERTICES_OUT_ARB"("0x8DDA")
        "GL_GEOMETRY_INPUT_TYPE_ARB"("0x8DDB")
        "GL_GEOMETRY_OUTPUT_TYPE_ARB"("0x8DDC")
        "GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB"("0x8DDD")
        "GL_MAX_VERTEX_VARYING_COMPONENTS_ARB"("0x8DDE")
        "GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB"("0x8DDF")
        "GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB"("0x8DE0")
        "GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB"("0x8DE1")
        "glProgramParameteriARB"(void, GLuint("program"), GLenum("pname"), GLint("value"))
        "glFramebufferTextureARB"(void, GLenum("target"), GLenum("attachment"), GLuint("texture"), GLint("level"))
        "glFramebufferTextureLayerARB"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLuint("texture"),
            GLint("level"),
            GLint("layer")
        )
        "glFramebufferTextureFaceARB"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLuint("texture"),
            GLint("level"),
            GLenum("face")
        )
    }
    file("GLSpirv", ARB, "GL_ARB_gl_spirv") {
        "GL_SHADER_BINARY_FORMAT_SPIR_V_ARB"("0x9551")
        "GL_SPIR_V_BINARY_ARB"("0x9552")
        "glSpecializeShaderARB"(
            void,
            GLuint("shader"),
            address("pEntryPoint", "const GLchar *"),
            GLuint("numSpecializationConstants"),
            address("pConstantIndex", "const GLuint *"),
            address("pConstantValue", "const GLuint *")
        )
    }
    file("GpuShaderInt64", ARB, "GL_ARB_gpu_shader_int64") {
        "GL_INT64_ARB"("0x140E")
        "GL_INT64_VEC2_ARB"("0x8FE9")
        "GL_INT64_VEC3_ARB"("0x8FEA")
        "GL_INT64_VEC4_ARB"("0x8FEB")
        "GL_UNSIGNED_INT64_VEC2_ARB"("0x8FF5")
        "GL_UNSIGNED_INT64_VEC3_ARB"("0x8FF6")
        "GL_UNSIGNED_INT64_VEC4_ARB"("0x8FF7")
        "glUniform1i64ARB"(void, GLint("location"), GLint64("x"))
        "glUniform2i64ARB"(void, GLint("location"), GLint64("x"), GLint64("y"))
        "glUniform3i64ARB"(void, GLint("location"), GLint64("x"), GLint64("y"), GLint64("z"))
        "glUniform4i64ARB"(void, GLint("location"), GLint64("x"), GLint64("y"), GLint64("z"), GLint64("w"))
        "glUniform1i64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLint64 *"))
        "glUniform2i64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLint64 *"))
        "glUniform3i64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLint64 *"))
        "glUniform4i64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLint64 *"))
        "glUniform1ui64ARB"(void, GLint("location"), GLuint64("x"))
        "glUniform2ui64ARB"(void, GLint("location"), GLuint64("x"), GLuint64("y"))
        "glUniform3ui64ARB"(void, GLint("location"), GLuint64("x"), GLuint64("y"), GLuint64("z"))
        "glUniform4ui64ARB"(void, GLint("location"), GLuint64("x"), GLuint64("y"), GLuint64("z"), GLuint64("w"))
        "glUniform1ui64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64 *"))
        "glUniform2ui64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64 *"))
        "glUniform3ui64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64 *"))
        "glUniform4ui64vARB"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64 *"))
        "glGetUniformi64vARB"(void, GLuint("program"), GLint("location"), address("params", "GLint64 *"))
        "glGetUniformui64vARB"(void, GLuint("program"), GLint("location"), address("params", "GLuint64 *"))
        "glGetnUniformi64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("bufSize"),
            address("params", "GLint64 *")
        )
        "glGetnUniformui64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("bufSize"),
            address("params", "GLuint64 *")
        )
        "glProgramUniform1i64ARB"(void, GLuint("program"), GLint("location"), GLint64("x"))
        "glProgramUniform2i64ARB"(void, GLuint("program"), GLint("location"), GLint64("x"), GLint64("y"))
        "glProgramUniform3i64ARB"(void, GLuint("program"), GLint("location"), GLint64("x"), GLint64("y"), GLint64("z"))
        "glProgramUniform4i64ARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLint64("x"),
            GLint64("y"),
            GLint64("z"),
            GLint64("w")
        )
        "glProgramUniform1i64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint64 *")
        )
        "glProgramUniform2i64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint64 *")
        )
        "glProgramUniform3i64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint64 *")
        )
        "glProgramUniform4i64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint64 *")
        )
        "glProgramUniform1ui64ARB"(void, GLuint("program"), GLint("location"), GLuint64("x"))
        "glProgramUniform2ui64ARB"(void, GLuint("program"), GLint("location"), GLuint64("x"), GLuint64("y"))
        "glProgramUniform3ui64ARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLuint64("x"),
            GLuint64("y"),
            GLuint64("z")
        )
        "glProgramUniform4ui64ARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLuint64("x"),
            GLuint64("y"),
            GLuint64("z"),
            GLuint64("w")
        )
        "glProgramUniform1ui64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64 *")
        )
        "glProgramUniform2ui64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64 *")
        )
        "glProgramUniform3ui64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64 *")
        )
        "glProgramUniform4ui64vARB"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64 *")
        )
    }
    file("HalfFloatPixel", ARB, "GL_ARB_half_float_pixel", "GL_HALF_FLOAT_ARB" to "0x140B")
    file("Imaging", ARB, "GL_ARB_imaging") {
        "GL_CONVOLUTION_BORDER_MODE"("0x8013")
        "GL_CONVOLUTION_FILTER_SCALE"("0x8014")
        "GL_CONVOLUTION_FILTER_BIAS"("0x8015")
        "GL_REDUCE"("0x8016")
        "GL_CONVOLUTION_FORMAT"("0x8017")
        "GL_CONVOLUTION_WIDTH"("0x8018")
        "GL_CONVOLUTION_HEIGHT"("0x8019")
        "GL_MAX_CONVOLUTION_WIDTH"("0x801A")
        "GL_MAX_CONVOLUTION_HEIGHT"("0x801B")
        "GL_POST_CONVOLUTION_RED_SCALE"("0x801C")
        "GL_POST_CONVOLUTION_GREEN_SCALE"("0x801D")
        "GL_POST_CONVOLUTION_BLUE_SCALE"("0x801E")
        "GL_POST_CONVOLUTION_ALPHA_SCALE"("0x801F")
        "GL_POST_CONVOLUTION_RED_BIAS"("0x8020")
        "GL_POST_CONVOLUTION_GREEN_BIAS"("0x8021")
        "GL_POST_CONVOLUTION_BLUE_BIAS"("0x8022")
        "GL_POST_CONVOLUTION_ALPHA_BIAS"("0x8023")
        "GL_HISTOGRAM_WIDTH"("0x8026")
        "GL_HISTOGRAM_FORMAT"("0x8027")
        "GL_HISTOGRAM_RED_SIZE"("0x8028")
        "GL_HISTOGRAM_GREEN_SIZE"("0x8029")
        "GL_HISTOGRAM_BLUE_SIZE"("0x802A")
        "GL_HISTOGRAM_ALPHA_SIZE"("0x802B")
        "GL_HISTOGRAM_LUMINANCE_SIZE"("0x802C")
        "GL_HISTOGRAM_SINK"("0x802D")
        "GL_MINMAX_FORMAT"("0x802F")
        "GL_MINMAX_SINK"("0x8030")
        "GL_TABLE_TOO_LARGE"("0x8031")
        "GL_COLOR_MATRIX"("0x80B1")
        "GL_COLOR_MATRIX_STACK_DEPTH"("0x80B2")
        "GL_MAX_COLOR_MATRIX_STACK_DEPTH"("0x80B3")
        "GL_POST_COLOR_MATRIX_RED_SCALE"("0x80B4")
        "GL_POST_COLOR_MATRIX_GREEN_SCALE"("0x80B5")
        "GL_POST_COLOR_MATRIX_BLUE_SCALE"("0x80B6")
        "GL_POST_COLOR_MATRIX_ALPHA_SCALE"("0x80B7")
        "GL_POST_COLOR_MATRIX_RED_BIAS"("0x80B8")
        "GL_POST_COLOR_MATRIX_GREEN_BIAS"("0x80B9")
        "GL_POST_COLOR_MATRIX_BLUE_BIAS"("0x80BA")
        "GL_POST_COLOR_MATRIX_ALPHA_BIAS"("0x80BB")
        "GL_COLOR_TABLE_SCALE"("0x80D6")
        "GL_COLOR_TABLE_BIAS"("0x80D7")
        "GL_COLOR_TABLE_FORMAT"("0x80D8")
        "GL_COLOR_TABLE_WIDTH"("0x80D9")
        "GL_COLOR_TABLE_RED_SIZE"("0x80DA")
        "GL_COLOR_TABLE_GREEN_SIZE"("0x80DB")
        "GL_COLOR_TABLE_BLUE_SIZE"("0x80DC")
        "GL_COLOR_TABLE_ALPHA_SIZE"("0x80DD")
        "GL_COLOR_TABLE_LUMINANCE_SIZE"("0x80DE")
        "GL_COLOR_TABLE_INTENSITY_SIZE"("0x80DF")
        "GL_CONSTANT_BORDER"("0x8151")
        "GL_REPLICATE_BORDER"("0x8153")
        "GL_CONVOLUTION_BORDER_COLOR"("0x8154")
        "glColorTable"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLenum("format"),
            GLenum("type"),
            address("table", "const void *")
        )
        "glColorTableParameterfv"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfloat *"))
        "glColorTableParameteriv"(void, GLenum("target"), GLenum("pname"), address("params", "const GLint *"))
        "glCopyColorTable"(void, GLenum("target"), GLenum("internalformat"), GLint("x"), GLint("y"), GLsizei("width"))
        "glGetColorTable"(void, GLenum("target"), GLenum("format"), GLenum("type"), address("table", "void *"))
        "glGetColorTableParameterfv"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetColorTableParameteriv"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glColorSubTable"(
            void,
            GLenum("target"),
            GLsizei("start"),
            GLsizei("count"),
            GLenum("format"),
            GLenum("type"),
            address("data", "const void *")
        )
        "glCopyColorSubTable"(void, GLenum("target"), GLsizei("start"), GLint("x"), GLint("y"), GLsizei("width"))
        "glConvolutionFilter1D"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLenum("format"),
            GLenum("type"),
            address("image", "const void *")
        )
        "glConvolutionFilter2D"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLenum("format"),
            GLenum("type"),
            address("image", "const void *")
        )
        "glConvolutionParameterf"(void, GLenum("target"), GLenum("pname"), GLfloat("params"))
        "glConvolutionParameterfv"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfloat *"))
        "glConvolutionParameteri"(void, GLenum("target"), GLenum("pname"), GLint("params"))
        "glConvolutionParameteriv"(void, GLenum("target"), GLenum("pname"), address("params", "const GLint *"))
        "glCopyConvolutionFilter1D"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width")
        )
        "glCopyConvolutionFilter2D"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glGetConvolutionFilter"(void, GLenum("target"), GLenum("format"), GLenum("type"), address("image", "void *"))
        "glGetConvolutionParameterfv"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetConvolutionParameteriv"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetSeparableFilter"(
            void,
            GLenum("target"),
            GLenum("format"),
            GLenum("type"),
            address("row", "void *"),
            address("column", "void *"),
            address("span", "void *")
        )
        "glSeparableFilter2D"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLenum("format"),
            GLenum("type"),
            address("row", "const void *"),
            address("column", "const void *")
        )
        "glGetHistogram"(
            void,
            GLenum("target"),
            GLboolean("reset"),
            GLenum("format"),
            GLenum("type"),
            address("values", "void *")
        )
        "glGetHistogramParameterfv"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetHistogramParameteriv"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetMinmax"(
            void,
            GLenum("target"),
            GLboolean("reset"),
            GLenum("format"),
            GLenum("type"),
            address("values", "void *")
        )
        "glGetMinmaxParameterfv"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetMinmaxParameteriv"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glHistogram"(void, GLenum("target"), GLsizei("width"), GLenum("internalformat"), GLboolean("sink"))
        "glMinmax"(void, GLenum("target"), GLenum("internalformat"), GLboolean("sink"))
        "glResetHistogram"(void, GLenum("target"))
        "glResetMinmax"(void, GLenum("target"))
    }
    file("IndirectParameters", ARB, "GL_ARB_indirect_parameters") {
        "GL_PARAMETER_BUFFER_ARB"("0x80EE")
        "GL_PARAMETER_BUFFER_BINDING_ARB"("0x80EF")
        "glMultiDrawArraysIndirectCountARB"(
            void,
            GLenum("mode"),
            address("indirect", "const void *"),
            GLintptr("drawcount"),
            GLsizei("maxdrawcount"),
            GLsizei("stride")
        )
        "glMultiDrawElementsIndirectCountARB"(
            void,
            GLenum("mode"),
            GLenum("type"),
            address("indirect", "const void *"),
            GLintptr("drawcount"),
            GLsizei("maxdrawcount"),
            GLsizei("stride")
        )
    }
    file("InstancedArrays", ARB, "GL_ARB_instanced_arrays") {
        "GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB"("0x88FE")
        "glVertexAttribDivisorARB"(void, GLuint("index"), GLuint("divisor"))
    }
    file(
        "InternalformatQuery2", ARB, "GL_ARB_internalformat_query2",
        "GL_SRGB_DECODE_ARB" to "0x8299",
        "GL_VIEW_CLASS_EAC_R11" to "0x9383",
        "GL_VIEW_CLASS_EAC_RG11" to "0x9384",
        "GL_VIEW_CLASS_ETC2_RGB" to "0x9385",
        "GL_VIEW_CLASS_ETC2_RGBA" to "0x9386",
        "GL_VIEW_CLASS_ETC2_EAC_RGBA" to "0x9387",
        "GL_VIEW_CLASS_ASTC_4x4_RGBA" to "0x9388",
        "GL_VIEW_CLASS_ASTC_5x4_RGBA" to "0x9389",
        "GL_VIEW_CLASS_ASTC_5x5_RGBA" to "0x938A",
        "GL_VIEW_CLASS_ASTC_6x5_RGBA" to "0x938B",
        "GL_VIEW_CLASS_ASTC_6x6_RGBA" to "0x938C",
        "GL_VIEW_CLASS_ASTC_8x5_RGBA" to "0x938D",
        "GL_VIEW_CLASS_ASTC_8x6_RGBA" to "0x938E",
        "GL_VIEW_CLASS_ASTC_8x8_RGBA" to "0x938F",
        "GL_VIEW_CLASS_ASTC_10x5_RGBA" to "0x9390",
        "GL_VIEW_CLASS_ASTC_10x6_RGBA" to "0x9391",
        "GL_VIEW_CLASS_ASTC_10x8_RGBA" to "0x9392",
        "GL_VIEW_CLASS_ASTC_10x10_RGBA" to "0x9393",
        "GL_VIEW_CLASS_ASTC_12x10_RGBA" to "0x9394",
        "GL_VIEW_CLASS_ASTC_12x12_RGBA" to "0x9395"
    )
    file("MatrixPalette", ARB, "GL_ARB_matrix_palette") {
        "GL_MATRIX_PALETTE_ARB"("0x8840")
        "GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB"("0x8841")
        "GL_MAX_PALETTE_MATRICES_ARB"("0x8842")
        "GL_CURRENT_PALETTE_MATRIX_ARB"("0x8843")
        "GL_MATRIX_INDEX_ARRAY_ARB"("0x8844")
        "GL_CURRENT_MATRIX_INDEX_ARB"("0x8845")
        "GL_MATRIX_INDEX_ARRAY_SIZE_ARB"("0x8846")
        "GL_MATRIX_INDEX_ARRAY_TYPE_ARB"("0x8847")
        "GL_MATRIX_INDEX_ARRAY_STRIDE_ARB"("0x8848")
        "GL_MATRIX_INDEX_ARRAY_POINTER_ARB"("0x8849")
        "glCurrentPaletteMatrixARB"(void, GLint("index"))
        "glMatrixIndexubvARB"(void, GLint("size"), address("indices", "const GLubyte *"))
        "glMatrixIndexusvARB"(void, GLint("size"), address("indices", "const GLushort *"))
        "glMatrixIndexuivARB"(void, GLint("size"), address("indices", "const GLuint *"))
        "glMatrixIndexPointerARB"(
            void,
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            address("pointer", "const void *")
        )
    }
    file("Multisample", ARB, "GL_ARB_multisample") {
        "GL_MULTISAMPLE_ARB"("0x809D")
        "GL_SAMPLE_ALPHA_TO_COVERAGE_ARB"("0x809E")
        "GL_SAMPLE_ALPHA_TO_ONE_ARB"("0x809F")
        "GL_SAMPLE_COVERAGE_ARB"("0x80A0")
        "GL_SAMPLE_BUFFERS_ARB"("0x80A8")
        "GL_SAMPLES_ARB"("0x80A9")
        "GL_SAMPLE_COVERAGE_VALUE_ARB"("0x80AA")
        "GL_SAMPLE_COVERAGE_INVERT_ARB"("0x80AB")
        "GL_MULTISAMPLE_BIT_ARB"("0x20000000")
        "glSampleCoverageARB"(void, GLfloat("value"), GLboolean("invert"))
    }
    file("Multitexture", ARB, "GL_ARB_multitexture") {
        "GL_TEXTURE0_ARB"("0x84C0")
        "GL_TEXTURE1_ARB"("0x84C1")
        "GL_TEXTURE2_ARB"("0x84C2")
        "GL_TEXTURE3_ARB"("0x84C3")
        "GL_TEXTURE4_ARB"("0x84C4")
        "GL_TEXTURE5_ARB"("0x84C5")
        "GL_TEXTURE6_ARB"("0x84C6")
        "GL_TEXTURE7_ARB"("0x84C7")
        "GL_TEXTURE8_ARB"("0x84C8")
        "GL_TEXTURE9_ARB"("0x84C9")
        "GL_TEXTURE10_ARB"("0x84CA")
        "GL_TEXTURE11_ARB"("0x84CB")
        "GL_TEXTURE12_ARB"("0x84CC")
        "GL_TEXTURE13_ARB"("0x84CD")
        "GL_TEXTURE14_ARB"("0x84CE")
        "GL_TEXTURE15_ARB"("0x84CF")
        "GL_TEXTURE16_ARB"("0x84D0")
        "GL_TEXTURE17_ARB"("0x84D1")
        "GL_TEXTURE18_ARB"("0x84D2")
        "GL_TEXTURE19_ARB"("0x84D3")
        "GL_TEXTURE20_ARB"("0x84D4")
        "GL_TEXTURE21_ARB"("0x84D5")
        "GL_TEXTURE22_ARB"("0x84D6")
        "GL_TEXTURE23_ARB"("0x84D7")
        "GL_TEXTURE24_ARB"("0x84D8")
        "GL_TEXTURE25_ARB"("0x84D9")
        "GL_TEXTURE26_ARB"("0x84DA")
        "GL_TEXTURE27_ARB"("0x84DB")
        "GL_TEXTURE28_ARB"("0x84DC")
        "GL_TEXTURE29_ARB"("0x84DD")
        "GL_TEXTURE30_ARB"("0x84DE")
        "GL_TEXTURE31_ARB"("0x84DF")
        "GL_ACTIVE_TEXTURE_ARB"("0x84E0")
        "GL_CLIENT_ACTIVE_TEXTURE_ARB"("0x84E1")
        "GL_MAX_TEXTURE_UNITS_ARB"("0x84E2")
        "glActiveTextureARB"(void, GLenum("texture"))
        "glClientActiveTextureARB"(void, GLenum("texture"))
        "glMultiTexCoord1dARB"(void, GLenum("target"), GLdouble("s"))
        "glMultiTexCoord1dvARB"(void, GLenum("target"), address("v", "const GLdouble *"))
        "glMultiTexCoord1fARB"(void, GLenum("target"), GLfloat("s"))
        "glMultiTexCoord1fvARB"(void, GLenum("target"), address("v", "const GLfloat *"))
        "glMultiTexCoord1iARB"(void, GLenum("target"), GLint("s"))
        "glMultiTexCoord1ivARB"(void, GLenum("target"), address("v", "const GLint *"))
        "glMultiTexCoord1sARB"(void, GLenum("target"), GLshort("s"))
        "glMultiTexCoord1svARB"(void, GLenum("target"), address("v", "const GLshort *"))
        "glMultiTexCoord2dARB"(void, GLenum("target"), GLdouble("s"), GLdouble("t"))
        "glMultiTexCoord2dvARB"(void, GLenum("target"), address("v", "const GLdouble *"))
        "glMultiTexCoord2fARB"(void, GLenum("target"), GLfloat("s"), GLfloat("t"))
        "glMultiTexCoord2fvARB"(void, GLenum("target"), address("v", "const GLfloat *"))
        "glMultiTexCoord2iARB"(void, GLenum("target"), GLint("s"), GLint("t"))
        "glMultiTexCoord2ivARB"(void, GLenum("target"), address("v", "const GLint *"))
        "glMultiTexCoord2sARB"(void, GLenum("target"), GLshort("s"), GLshort("t"))
        "glMultiTexCoord2svARB"(void, GLenum("target"), address("v", "const GLshort *"))
        "glMultiTexCoord3dARB"(void, GLenum("target"), GLdouble("s"), GLdouble("t"), GLdouble("r"))
        "glMultiTexCoord3dvARB"(void, GLenum("target"), address("v", "const GLdouble *"))
        "glMultiTexCoord3fARB"(void, GLenum("target"), GLfloat("s"), GLfloat("t"), GLfloat("r"))
        "glMultiTexCoord3fvARB"(void, GLenum("target"), address("v", "const GLfloat *"))
        "glMultiTexCoord3iARB"(void, GLenum("target"), GLint("s"), GLint("t"), GLint("r"))
        "glMultiTexCoord3ivARB"(void, GLenum("target"), address("v", "const GLint *"))
        "glMultiTexCoord3sARB"(void, GLenum("target"), GLshort("s"), GLshort("t"), GLshort("r"))
        "glMultiTexCoord3svARB"(void, GLenum("target"), address("v", "const GLshort *"))
        "glMultiTexCoord4dARB"(void, GLenum("target"), GLdouble("s"), GLdouble("t"), GLdouble("r"), GLdouble("q"))
        "glMultiTexCoord4dvARB"(void, GLenum("target"), address("v", "const GLdouble *"))
        "glMultiTexCoord4fARB"(void, GLenum("target"), GLfloat("s"), GLfloat("t"), GLfloat("r"), GLfloat("q"))
        "glMultiTexCoord4fvARB"(void, GLenum("target"), address("v", "const GLfloat *"))
        "glMultiTexCoord4iARB"(void, GLenum("target"), GLint("s"), GLint("t"), GLint("r"), GLint("q"))
        "glMultiTexCoord4ivARB"(void, GLenum("target"), address("v", "const GLint *"))
        "glMultiTexCoord4sARB"(void, GLenum("target"), GLshort("s"), GLshort("t"), GLshort("r"), GLshort("q"))
        "glMultiTexCoord4svARB"(void, GLenum("target"), address("v", "const GLshort *"))
    }
    file("OcclusionQuery", ARB, "GL_ARB_occlusion_query") {
        "GL_QUERY_COUNTER_BITS_ARB"("0x8864")
        "GL_CURRENT_QUERY_ARB"("0x8865")
        "GL_QUERY_RESULT_ARB"("0x8866")
        "GL_QUERY_RESULT_AVAILABLE_ARB"("0x8867")
        "GL_SAMPLES_PASSED_ARB"("0x8914")
        "glGenQueriesARB"(void, GLsizei("n"), address("ids", "GLuint *"))
        "glDeleteQueriesARB"(void, GLsizei("n"), address("ids", "const GLuint *"))
        "glIsQueryARB"(GLboolean, GLuint("id"))
        "glBeginQueryARB"(void, GLenum("target"), GLuint("id"))
        "glEndQueryARB"(void, GLenum("target"))
        "glGetQueryivARB"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetQueryObjectivARB"(void, GLuint("id"), GLenum("pname"), address("params", "GLint *"))
        "glGetQueryObjectuivARB"(void, GLuint("id"), GLenum("pname"), address("params", "GLuint *"))
    }
    file("ParallelShaderCompile", ARB, "GL_ARB_parallel_shader_compile") {
        "GL_MAX_SHADER_COMPILER_THREADS_ARB"("0x91B0")
        "GL_COMPLETION_STATUS_ARB"("0x91B1")
        "glMaxShaderCompilerThreadsARB"(void, GLuint("count"))
    }
    file(
        "PipelineStatisticsQuery", ARB, "GL_ARB_pipeline_statistics_query",
        "GL_VERTICES_SUBMITTED_ARB" to "0x82EE",
        "GL_PRIMITIVES_SUBMITTED_ARB" to "0x82EF",
        "GL_VERTEX_SHADER_INVOCATIONS_ARB" to "0x82F0",
        "GL_TESS_CONTROL_SHADER_PATCHES_ARB" to "0x82F1",
        "GL_TESS_EVALUATION_SHADER_INVOCATIONS_ARB" to "0x82F2",
        "GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED_ARB" to "0x82F3",
        "GL_FRAGMENT_SHADER_INVOCATIONS_ARB" to "0x82F4",
        "GL_COMPUTE_SHADER_INVOCATIONS_ARB" to "0x82F5",
        "GL_CLIPPING_INPUT_PRIMITIVES_ARB" to "0x82F6",
        "GL_CLIPPING_OUTPUT_PRIMITIVES_ARB" to "0x82F7"
    )
    file(
        "PixelBufferObject", ARB, "GL_ARB_pixel_buffer_object",
        "GL_PIXEL_PACK_BUFFER_ARB" to "0x88EB",
        "GL_PIXEL_UNPACK_BUFFER_ARB" to "0x88EC",
        "GL_PIXEL_PACK_BUFFER_BINDING_ARB" to "0x88ED",
        "GL_PIXEL_UNPACK_BUFFER_BINDING_ARB" to "0x88EF"
    )
    file("PointParameters", ARB, "GL_ARB_point_parameters") {
        "GL_POINT_SIZE_MIN_ARB"("0x8126")
        "GL_POINT_SIZE_MAX_ARB"("0x8127")
        "GL_POINT_FADE_THRESHOLD_SIZE_ARB"("0x8128")
        "GL_POINT_DISTANCE_ATTENUATION_ARB"("0x8129")
        "glPointParameterfARB"(void, GLenum("pname"), GLfloat("param"))
        "glPointParameterfvARB"(void, GLenum("pname"), address("params", "const GLfloat *"))
    }
    file(
        "PointSprite", ARB, "GL_ARB_point_sprite",
        "GL_POINT_SPRITE_ARB" to "0x8861",
        "GL_COORD_REPLACE_ARB" to "0x8862"
    )
    file("Robustness", ARB, "GL_ARB_robustness") {
        "GL_NO_RESET_NOTIFICATION_ARB"("0x8261")
        "GL_RESET_NOTIFICATION_STRATEGY_ARB"("0x8256")
        "GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB"("0x00000004")
        "GL_UNKNOWN_CONTEXT_RESET_ARB"("0x8255")
        "GL_LOSE_CONTEXT_ON_RESET_ARB"("0x8252")
        "GL_INNOCENT_CONTEXT_RESET_ARB"("0x8254")
        "GL_GUILTY_CONTEXT_RESET_ARB"("0x8253")
        "glGetGraphicsResetStatusARB"(int)
        "glGetnCompressedTexImageARB"(void, int("target"), int("lod"), int("bufSize"), address("img", "void*"))
        "glGetnTexImageARB"(
            void,
            int("target"),
            int("level"),
            int("format"),
            int("type"),
            int("bufSize"),
            address("img", "void*")
        )
        "glGetnUniformdvARB"(void, int("program"), int("location"), int("bufSize"), address("params", "GLdouble*"))
        "glGetnUniformfvARB"(void, int("program"), int("location"), int("bufSize"), address("params", "GLfloat*"))
        "glGetnUniformivARB"(void, int("program"), int("location"), int("bufSize"), address("params", "GLint*"))
        "glGetnUniformuivARB"(void, int("program"), int("location"), int("bufSize"), address("params", "GLuint*"))
        "glReadnPixelsARB"(
            void,
            int("x"),
            int("y"),
            int("width"),
            int("height"),
            int("format"),
            int("type"),
            int("bufSize"),
            address("data", "void*")
        )
    }
    file("SampleLocations", ARB, "GL_ARB_sample_locations") {
        "GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB"("0x933D")
        "GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB"("0x933E")
        "GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB"("0x933F")
        "GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB"("0x9340")
        "GL_SAMPLE_LOCATION_ARB"("0x8E50")
        "GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB"("0x9341")
        "GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB"("0x9342")
        "GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB"("0x9343")
        "glEvaluateDepthValuesARB"(void)
        "glFramebufferSampleLocationsfvARB"(
            void,
            int("target"),
            int("start"),
            int("count"),
            address("v", "const GLfloat *v")
        )
        "glNamedFramebufferSampleLocationsfvARB"(
            void,
            int("framebuffer"),
            int("start"),
            int("count"),
            address("v", "const GLfloat *v")
        )
    }
    file("SampleShading", ARB, "GL_ARB_sample_shading") {
        "GL_SAMPLE_SHADING_ARB"("0x8C36")
        "GL_MIN_SAMPLE_SHADING_VALUE_ARB"("0x8C37")
        "glMinSampleShadingARB"(void, float("value"))
    }
    file("ShaderObjects", ARB, "GL_ARB_shader_objects") {
        "GL_PROGRAM_OBJECT_ARB"("0x8B40")
        "GL_SHADER_OBJECT_ARB"("0x8B48")
        "GL_OBJECT_TYPE_ARB"("0x8B4E")
        "GL_OBJECT_SUBTYPE_ARB"("0x8B4F")
        "GL_FLOAT_VEC2_ARB"("0x8B50")
        "GL_FLOAT_VEC3_ARB"("0x8B51")
        "GL_FLOAT_VEC4_ARB"("0x8B52")
        "GL_INT_VEC2_ARB"("0x8B53")
        "GL_INT_VEC3_ARB"("0x8B54")
        "GL_INT_VEC4_ARB"("0x8B55")
        "GL_BOOL_ARB"("0x8B56")
        "GL_BOOL_VEC2_ARB"("0x8B57")
        "GL_BOOL_VEC3_ARB"("0x8B58")
        "GL_BOOL_VEC4_ARB"("0x8B59")
        "GL_FLOAT_MAT2_ARB"("0x8B5A")
        "GL_FLOAT_MAT3_ARB"("0x8B5B")
        "GL_FLOAT_MAT4_ARB"("0x8B5C")
        "GL_SAMPLER_1D_ARB"("0x8B5D")
        "GL_SAMPLER_2D_ARB"("0x8B5E")
        "GL_SAMPLER_3D_ARB"("0x8B5F")
        "GL_SAMPLER_CUBE_ARB"("0x8B60")
        "GL_SAMPLER_1D_SHADOW_ARB"("0x8B61")
        "GL_SAMPLER_2D_SHADOW_ARB"("0x8B62")
        "GL_SAMPLER_2D_RECT_ARB"("0x8B63")
        "GL_SAMPLER_2D_RECT_SHADOW_ARB"("0x8B64")
        "GL_OBJECT_DELETE_STATUS_ARB"("0x8B80")
        "GL_OBJECT_COMPILE_STATUS_ARB"("0x8B81")
        "GL_OBJECT_LINK_STATUS_ARB"("0x8B82")
        "GL_OBJECT_VALIDATE_STATUS_ARB"("0x8B83")
        "GL_OBJECT_INFO_LOG_LENGTH_ARB"("0x8B84")
        "GL_OBJECT_ATTACHED_OBJECTS_ARB"("0x8B85")
        "GL_OBJECT_ACTIVE_UNIFORMS_ARB"("0x8B86")
        "GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB"("0x8B87")
        "GL_OBJECT_SHADER_SOURCE_LENGTH_ARB"("0x8B88")
        "glDeleteObjectARB"(void, int("obj"))
        "glGetHandleARB"(int, int("pname"))
        "glDetachObjectARB"(void, int("containerObj"), int("attachedObj"))
        "glCreateShaderObjectARB"(int, int("shaderType"))
        "glShaderSourceARB"(
            void,
            int("shaderObj"),
            int("count"),
            address("string", "const GLcharARB**"),
            address("length", "const GLint*")
        )
        "glCompileShaderARB"(void, int("shaderObj"))
        "glCreateProgramObjectARB"(int)
        "glAttachObjectARB"(void, int("containerObj"), int("obj"))
        "glLinkProgramARB"(void, int("programObj"))
        "glUseProgramObjectARB"(void, int("programObj"))
        "glValidateProgramARB"(void, int("programObj"))
        "glUniform1fARB"(void, int("location"), float("v0"))
        "glUniform2fARB"(void, int("location"), float("v0"), float("v1"))
        "glUniform3fARB"(void, int("location"), float("v0"), float("v1"), float("v2"))
        "glUniform4fARB"(void, int("location"), float("v0"), float("v1"), float("v2"), float("v3"))
        "glUniform1iARB"(void, int("location"), int("v0"))
        "glUniform2iARB"(void, int("location"), int("v0"), int("v1"))
        "glUniform3iARB"(void, int("location"), int("v0"), int("v1"), int("v2"))
        "glUniform4iARB"(void, int("location"), int("v0"), int("v1"), int("v2"), int("v3"))
        "glUniform1fvARB"(void, int("location"), int("count"), address("value", "const GLfloat*"))
        "glUniform2fvARB"(void, int("location"), int("count"), address("value", "const GLfloat*"))
        "glUniform3fvARB"(void, int("location"), int("count"), address("value", "const GLfloat*"))
        "glUniform4fvARB"(void, int("location"), int("count"), address("value", "const GLfloat*"))
        "glUniform1ivARB"(void, int("location"), int("count"), address("value", "const GLint*"))
        "glUniform2ivARB"(void, int("location"), int("count"), address("value", "const GLint*"))
        "glUniform3ivARB"(void, int("location"), int("count"), address("value", "const GLint*"))
        "glUniform4ivARB"(void, int("location"), int("count"), address("value", "const GLint*"))
        "glUniformMatrix2fvARB"(
            void,
            int("location"),
            int("count"),
            boolean("transpose"),
            address("value", "const GLfloat*")
        )
        "glUniformMatrix3fvARB"(
            void,
            int("location"),
            int("count"),
            boolean("transpose"),
            address("value", "const GLfloat*")
        )
        "glUniformMatrix4fvARB"(
            void,
            int("location"),
            int("count"),
            boolean("transpose"),
            address("value", "const GLfloat*")
        )
        "glGetObjectParameterfvARB"(void, int("obj"), int("pname"), address("params", "GLfloat*"))
        "glGetObjectParameterivARB"(void, int("obj"), int("pname"), address("params", "GLint*"))
        "glGetInfoLogARB"(
            void,
            int("obj"),
            int("maxLength"),
            address("length", "GLsizei*"),
            address("infoLog", "GLcharARB*")
        )
        "glGetAttachedObjectsARB"(
            void,
            int("containerObj"),
            int("maxCount"),
            address("count", "GLsizei*"),
            address("obj", "GLhandleARB*")
        )
        "glGetUniformLocationARB"(int, int("programObj"), address("name", "const GLcharARB*"))
        "glGetActiveUniformARB"(
            void,
            int("programObj"),
            int("index"),
            int("maxLength"),
            address("length", "GLsizei*"),
            address("size", "GLint*"),
            address("type", "GLenum*"),
            address("name", "GLcharARB*")
        )
        "glGetUniformfvARB"(void, int("programObj"), int("location"), address("params", "GLfloat*"))
        "glGetUniformivARB"(void, int("programObj"), int("location"), address("params", "GLint*"))
        "glGetShaderSourceARB"(
            void,
            int("obj"),
            int("maxLength"),
            address("length", "GLsizei*"),
            address("source", "GLcharARB*")
        )
    }
    file("ShadingLanguageInclude", ARB, "GL_ARB_shading_language_include") {
        "GL_SHADER_INCLUDE_ARB"("0x8DAE")
        "GL_NAMED_STRING_LENGTH_ARB"("0x8DE9")
        "GL_NAMED_STRING_TYPE_ARB"("0x8DEA")
        "glNamedStringARB"(
            void,
            int("type"),
            int("nameLen"),
            address("name", "const GLchar*"),
            int("stringLen"),
            address("string", "const GLchar*")
        )
        "glDeleteNamedStringARB"(void, int("nameLen"), address("name", "const GLchar*"))
        "glCompileShaderIncludeARB"(
            void,
            int("shader"),
            int("count"),
            address("path", "const GLchar *const*"),
            address("length", "const GLint*")
        )
        "glIsNamedStringARB"(boolean, int("nameLen"), address("name", "const GLchar*"))
        "glGetNamedStringARB"(
            void,
            int("nameLen"),
            address("name", "const GLchar*"),
            int("bufSize"),
            address("stringLen", "GLint*"),
            address("string", "GLchar*")
        )
        "glGetNamedStringivARB"(
            void,
            int("nameLen"),
            address("name", "const GLchar*"),
            int("pname"),
            address("params", "GLint*")
        )
    }
    file(
        "Shadow", ARB, "GL_ARB_shadow",
        "GL_TEXTURE_COMPARE_MODE_ARB" to "0x884C",
        "GL_TEXTURE_COMPARE_FUNC_ARB" to "0x884D",
        "GL_COMPARE_R_TO_TEXTURE_ARB" to "0x884E"
    )
    file(
        "ShadowAmbient", ARB, "GL_ARB_shadow_ambient",
        "GL_TEXTURE_COMPARE_FAIL_VALUE_ARB" to "0x80BF"
    )
    file("SparseBuffer", ARB, "GL_ARB_sparse_buffer") {
        "GL_SPARSE_STORAGE_BIT_ARB"("0x0400")
        "GL_SPARSE_BUFFER_PAGE_SIZE_ARB"("0x82F8")
        "glBufferPageCommitmentARB"(void, int("target"), long("offset"), long("size"), boolean("commit"))
        "glNamedBufferPageCommitmentEXT"(void, int("buffer"), long("offset"), long("size"), boolean("commit"))
        "glNamedBufferPageCommitmentARB"(void, int("buffer"), long("offset"), long("size"), boolean("commit"))
    }
    file("SparseTexture", ARB, "GL_ARB_sparse_texture") {
        "GL_TEXTURE_SPARSE_ARB"("0x91A6")
        "GL_VIRTUAL_PAGE_SIZE_INDEX_ARB"("0x91A7")
        "GL_NUM_SPARSE_LEVELS_ARB"("0x91AA")
        "GL_NUM_VIRTUAL_PAGE_SIZES_ARB"("0x91A8")
        "GL_VIRTUAL_PAGE_SIZE_X_ARB"("0x9195")
        "GL_VIRTUAL_PAGE_SIZE_Y_ARB"("0x9196")
        "GL_VIRTUAL_PAGE_SIZE_Z_ARB"("0x9197")
        "GL_MAX_SPARSE_TEXTURE_SIZE_ARB"("0x9198")
        "GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB"("0x9199")
        "GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB"("0x919A")
        "GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB"("0x91A9")
        "glTexPageCommitmentARB"(
            void,
            int("target"),
            int("level"),
            int("xoffset"),
            int("yoffset"),
            int("zoffset"),
            int("width"),
            int("height"),
            int("depth"),
            boolean("commit")
        )
    }
    file(
        "TextureBorderClamp", ARB, "GL_ARB_texture_border_clamp",
        "GL_CLAMP_TO_BORDER_ARB" to "0x812D"
    )
    file("TextureBufferObject", ARB, "GL_ARB_texture_buffer_object") {
        "GL_TEXTURE_BUFFER_ARB"("0x8C2A")
        "GL_MAX_TEXTURE_BUFFER_SIZE_ARB"("0x8C2B")
        "GL_TEXTURE_BINDING_BUFFER_ARB"("0x8C2C")
        "GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB"("0x8C2D")
        "GL_TEXTURE_BUFFER_FORMAT_ARB"("0x8C2E")
        "glTexBufferARB"(void, int("target"), int("internalFormat"), int("buffer"))
    }
    file("TextureCompression", ARB, "GL_ARB_texture_compression") {
        "GL_COMPRESSED_ALPHA_ARB"("0x84E9")
        "GL_COMPRESSED_LUMINANCE_ARB"("0x84EA")
        "GL_COMPRESSED_LUMINANCE_ALPHA_ARB"("0x84EB")
        "GL_COMPRESSED_INTENSITY_ARB"("0x84EC")
        "GL_COMPRESSED_RGB_ARB"("0x84ED")
        "GL_COMPRESSED_RGBA_ARB"("0x84EE")
        "GL_TEXTURE_COMPRESSION_HINT_ARB"("0x84EF")
        "GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB"("0x86A0")
        "GL_TEXTURE_COMPRESSED_ARB"("0x86A1")
        "GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB"("0x86A2")
        "GL_COMPRESSED_TEXTURE_FORMATS_ARB"("0x86A3")
        "glCompressedTexImage3DARB"(
            void,
            int("target"),
            int("level"),
            int("internalFormat"),
            int("width"),
            int("height"),
            int("depth"),
            int("border"),
            int("imageSize"),
            address("data", "const void*")
        )
        "glCompressedTexImage2DARB"(
            void,
            int("target"),
            int("level"),
            int("internalFormat"),
            int("width"),
            int("height"),
            int("border"),
            int("imageSize"),
            address("data", "const void*")
        )
        "glCompressedTexImage1DARB"(
            void,
            int("target"),
            int("level"),
            int("internalFormat"),
            int("width"),
            int("border"),
            int("imageSize"),
            address("data", "const void*")
        )
        "glCompressedTexSubImage3DARB"(
            void,
            int("target"),
            int("level"),
            int("xoffset"),
            int("yoffset"),
            int("zoffset"),
            int("width"),
            int("height"),
            int("depth"),
            int("format"),
            int("imageSize"),
            address("data", "const void*")
        )
        "glCompressedTexSubImage2DARB"(
            void,
            int("target"),
            int("level"),
            int("xoffset"),
            int("yoffset"),
            int("width"),
            int("height"),
            int("format"),
            int("imageSize"),
            address("data", "const void*")
        )
        "glCompressedTexSubImage1DARB"(
            void,
            int("target"),
            int("level"),
            int("xoffset"),
            int("width"),
            int("format"),
            int("imageSize"),
            address("data", "const void*")
        )
        "glGetCompressedTexImageARB"(void, int("target"), int("level"), address("img", "void*"))
    }
    file(
        "TextureCompressionBptc", ARB, "GL_ARB_texture_compression_bptc",
        "GL_COMPRESSED_RGBA_BPTC_UNORM_ARB" to "0x8E8C",
        "GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB" to "0x8E8D",
        "GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB" to "0x8E8E",
        "GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB" to "0x8E8F"
    )
    file(
        "TextureCubeMap", ARB, "GL_ARB_texture_cube_map",
        "GL_NORMAL_MAP_ARB" to "0x8511",
        "GL_REFLECTION_MAP_ARB" to "0x8512",
        "GL_TEXTURE_CUBE_MAP_ARB" to "0x8513",
        "GL_TEXTURE_BINDING_CUBE_MAP_ARB" to "0x8514",
        "GL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB" to "0x8515",
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB" to "0x8516",
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB" to "0x8517",
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB" to "0x8518",
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB" to "0x8519",
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB" to "0x851A",
        "GL_PROXY_TEXTURE_CUBE_MAP_ARB" to "0x851B",
        "GL_MAX_CUBE_MAP_TEXTURE_SIZE_ARB" to "0x851C"
    )
    file(
        "TextureCubeMapArray", ARB, "GL_ARB_texture_cube_map_array",
        "GL_TEXTURE_CUBE_MAP_ARRAY_ARB" to "0x9009",
        "GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB" to "0x900A",
        "GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB" to "0x900B",
        "GL_SAMPLER_CUBE_MAP_ARRAY_ARB" to "0x900C",
        "GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB" to "0x900D",
        "GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB" to "0x900E",
        "GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB" to "0x900F"
    )
    file(
        "TextureEnvCombine", ARB, "GL_ARB_texture_env_combine",
        "GL_COMBINE_ARB" to "0x8570",
        "GL_COMBINE_RGB_ARB" to "0x8571",
        "GL_COMBINE_ALPHA_ARB" to "0x8572",
        "GL_SOURCE0_RGB_ARB" to "0x8580",
        "GL_SOURCE1_RGB_ARB" to "0x8581",
        "GL_SOURCE2_RGB_ARB" to "0x8582",
        "GL_SOURCE0_ALPHA_ARB" to "0x8588",
        "GL_SOURCE1_ALPHA_ARB" to "0x8589",
        "GL_SOURCE2_ALPHA_ARB" to "0x858A",
        "GL_OPERAND0_RGB_ARB" to "0x8590",
        "GL_OPERAND1_RGB_ARB" to "0x8591",
        "GL_OPERAND2_RGB_ARB" to "0x8592",
        "GL_OPERAND0_ALPHA_ARB" to "0x8598",
        "GL_OPERAND1_ALPHA_ARB" to "0x8599",
        "GL_OPERAND2_ALPHA_ARB" to "0x859A",
        "GL_RGB_SCALE_ARB" to "0x8573",
        "GL_ADD_SIGNED_ARB" to "0x8574",
        "GL_INTERPOLATE_ARB" to "0x8575",
        "GL_SUBTRACT_ARB" to "0x84E7",
        "GL_CONSTANT_ARB" to "0x8576",
        "GL_PRIMARY_COLOR_ARB" to "0x8577",
        "GL_PREVIOUS_ARB" to "0x8578"
    )
    file(
        "TextureEnvDot3", ARB, "GL_ARB_texture_env_dot3",
        "GL_DOT3_RGB_ARB" to "0x86AE",
        "GL_DOT3_RGBA_ARB" to "0x86AF"
    )
    file(
        "TextureFilterMinmax", ARB, "GL_ARB_texture_filter_minmax",
        "GL_TEXTURE_REDUCTION_MODE_ARB" to "0x9366",
        "GL_WEIGHTED_AVERAGE_ARB" to "0x9367"
    )
    file(
        "TextureFloat", ARB, "GL_ARB_texture_float",
        "GL_TEXTURE_RED_TYPE_ARB" to "0x8C10",
        "GL_TEXTURE_GREEN_TYPE_ARB" to "0x8C11",
        "GL_TEXTURE_BLUE_TYPE_ARB" to "0x8C12",
        "GL_TEXTURE_ALPHA_TYPE_ARB" to "0x8C13",
        "GL_TEXTURE_LUMINANCE_TYPE_ARB" to "0x8C14",
        "GL_TEXTURE_INTENSITY_TYPE_ARB" to "0x8C15",
        "GL_TEXTURE_DEPTH_TYPE_ARB" to "0x8C16",
        "GL_UNSIGNED_NORMALIZED_ARB" to "0x8C17",
        "GL_RGBA32F_ARB" to "0x8814",
        "GL_RGB32F_ARB" to "0x8815",
        "GL_ALPHA32F_ARB" to "0x8816",
        "GL_INTENSITY32F_ARB" to "0x8817",
        "GL_LUMINANCE32F_ARB" to "0x8818",
        "GL_LUMINANCE_ALPHA32F_ARB" to "0x8819",
        "GL_RGBA16F_ARB" to "0x881A",
        "GL_RGB16F_ARB" to "0x881B",
        "GL_ALPHA16F_ARB" to "0x881C",
        "GL_INTENSITY16F_ARB" to "0x881D",
        "GL_LUMINANCE16F_ARB" to "0x881E",
        "GL_LUMINANCE_ALPHA16F_ARB" to "0x881F"
    )
    file(
        "TextureGather", ARB, "GL_ARB_texture_gather",
        "GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB" to "0x8E5E",
        "GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB" to "0x8E5F",
        "GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB" to "0x8F9F"
    )
    file(
        "TextureMirroredRepeat", ARB, "GL_ARB_texture_mirrored_repeat",
        "GL_MIRRORED_REPEAT_ARB" to "0x8370"
    )
    file(
        "TextureRectangle", ARB, "GL_ARB_texture_rectangle",
        "GL_TEXTURE_RECTANGLE_ARB" to "0x84F5",
        "GL_TEXTURE_BINDING_RECTANGLE_ARB" to "0x84F6",
        "GL_PROXY_TEXTURE_RECTANGLE_ARB" to "0x84F7",
        "GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB" to "0x84F8"
    )
    file(
        "TransformFeedbackOverflowQuery", ARB, "GL_ARB_transform_feedback_overflow_query",
        "GL_TRANSFORM_FEEDBACK_OVERFLOW_ARB" to "0x82EC",
        "GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB" to "0x82ED"
    )
    file("TransposeMatrix", ARB, "GL_ARB_transpose_matrix") {
        "GL_TRANSPOSE_MODELVIEW_MATRIX_ARB"("0x84E3")
        "GL_TRANSPOSE_PROJECTION_MATRIX_ARB"("0x84E4")
        "GL_TRANSPOSE_TEXTURE_MATRIX_ARB"("0x84E5")
        "GL_TRANSPOSE_COLOR_MATRIX_ARB"("0x84E6")
        "glLoadTransposeMatrixfARB"(void, address("m", "const GLfloat*"))
        "glLoadTransposeMatrixdARB"(void, address("m", "const GLdouble*"))
        "glMultTransposeMatrixfARB"(void, address("m", "const GLfloat*"))
        "glMultTransposeMatrixdARB"(void, address("m", "const GLdouble*"))
    }
    file("VertexBlend", ARB, "GL_ARB_vertex_blend") {
        "GL_MAX_VERTEX_UNITS_ARB"("0x86A4")
        "GL_ACTIVE_VERTEX_UNITS_ARB"("0x86A5")
        "GL_WEIGHT_SUM_UNITY_ARB"("0x86A6")
        "GL_VERTEX_BLEND_ARB"("0x86A7")
        "GL_CURRENT_WEIGHT_ARB"("0x86A8")
        "GL_WEIGHT_ARRAY_TYPE_ARB"("0x86A9")
        "GL_WEIGHT_ARRAY_STRIDE_ARB"("0x86AA")
        "GL_WEIGHT_ARRAY_SIZE_ARB"("0x86AB")
        "GL_WEIGHT_ARRAY_POINTER_ARB"("0x86AC")
        "GL_WEIGHT_ARRAY_ARB"("0x86AD")
        "GL_MODELVIEW0_ARB"("0x1700")
        "GL_MODELVIEW1_ARB"("0x850A")
        "GL_MODELVIEW2_ARB"("0x8722")
        "GL_MODELVIEW3_ARB"("0x8723")
        "GL_MODELVIEW4_ARB"("0x8724")
        "GL_MODELVIEW5_ARB"("0x8725")
        "GL_MODELVIEW6_ARB"("0x8726")
        "GL_MODELVIEW7_ARB"("0x8727")
        "GL_MODELVIEW8_ARB"("0x8728")
        "GL_MODELVIEW9_ARB"("0x8729")
        "GL_MODELVIEW10_ARB"("0x872A")
        "GL_MODELVIEW11_ARB"("0x872B")
        "GL_MODELVIEW12_ARB"("0x872C")
        "GL_MODELVIEW13_ARB"("0x872D")
        "GL_MODELVIEW14_ARB"("0x872E")
        "GL_MODELVIEW15_ARB"("0x872F")
        "GL_MODELVIEW16_ARB"("0x8730")
        "GL_MODELVIEW17_ARB"("0x8731")
        "GL_MODELVIEW18_ARB"("0x8732")
        "GL_MODELVIEW19_ARB"("0x8733")
        "GL_MODELVIEW20_ARB"("0x8734")
        "GL_MODELVIEW21_ARB"("0x8735")
        "GL_MODELVIEW22_ARB"("0x8736")
        "GL_MODELVIEW23_ARB"("0x8737")
        "GL_MODELVIEW24_ARB"("0x8738")
        "GL_MODELVIEW25_ARB"("0x8739")
        "GL_MODELVIEW26_ARB"("0x873A")
        "GL_MODELVIEW27_ARB"("0x873B")
        "GL_MODELVIEW28_ARB"("0x873C")
        "GL_MODELVIEW29_ARB"("0x873D")
        "GL_MODELVIEW30_ARB"("0x873E")
        "GL_MODELVIEW31_ARB"("0x873F")
        "glWeightbvARB"(void, GLint("size"), address("weights", "const GLbyte*"))
        "glWeightsvARB"(void, GLint("size"), address("weights", "const GLshort*"))
        "glWeightivARB"(void, GLint("size"), address("weights", "const GLint*"))
        "glWeightfvARB"(void, GLint("size"), address("weights", "const GLfloat*"))
        "glWeightdvARB"(void, GLint("size"), address("weights", "const GLdouble*"))
        "glWeightubvARB"(void, GLint("size"), address("weights", "const GLubyte*"))
        "glWeightusvARB"(void, GLint("size"), address("weights", "const GLushort*"))
        "glWeightuivARB"(void, GLint("size"), address("weights", "const GLuint*"))
        "glWeightPointerARB"(void, GLint("size"), GLenum("type"), GLsizei("stride"), address("pointer", "const void*"))
        "glVertexBlendARB"(void, GLint("count"))
    }
    file("VertexBufferObject", ARB, "GL_ARB_vertex_buffer_object") {
        "GL_BUFFER_SIZE_ARB"("0x8764")
        "GL_BUFFER_USAGE_ARB"("0x8765")
        "GL_ARRAY_BUFFER_ARB"("0x8892")
        "GL_ELEMENT_ARRAY_BUFFER_ARB"("0x8893")
        "GL_ARRAY_BUFFER_BINDING_ARB"("0x8894")
        "GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB"("0x8895")
        "GL_VERTEX_ARRAY_BUFFER_BINDING_ARB"("0x8896")
        "GL_NORMAL_ARRAY_BUFFER_BINDING_ARB"("0x8897")
        "GL_COLOR_ARRAY_BUFFER_BINDING_ARB"("0x8898")
        "GL_INDEX_ARRAY_BUFFER_BINDING_ARB"("0x8899")
        "GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB"("0x889A")
        "GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB"("0x889B")
        "GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB"("0x889C")
        "GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB"("0x889D")
        "GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB"("0x889E")
        "GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB"("0x889F")
        "GL_READ_ONLY_ARB"("0x88B8")
        "GL_WRITE_ONLY_ARB"("0x88B9")
        "GL_READ_WRITE_ARB"("0x88BA")
        "GL_BUFFER_ACCESS_ARB"("0x88BB")
        "GL_BUFFER_MAPPED_ARB"("0x88BC")
        "GL_BUFFER_MAP_POINTER_ARB"("0x88BD")
        "GL_STREAM_DRAW_ARB"("0x88E0")
        "GL_STREAM_READ_ARB"("0x88E1")
        "GL_STREAM_COPY_ARB"("0x88E2")
        "GL_STATIC_DRAW_ARB"("0x88E4")
        "GL_STATIC_READ_ARB"("0x88E5")
        "GL_STATIC_COPY_ARB"("0x88E6")
        "GL_DYNAMIC_DRAW_ARB"("0x88E8")
        "GL_DYNAMIC_READ_ARB"("0x88E9")
        "GL_DYNAMIC_COPY_ARB"("0x88EA")
        "glBindBufferARB"(void, GLenum("target"), GLuint("buffer"))
        "glDeleteBuffersARB"(void, GLsizei("n"), address("buffers", "const GLuint*"))
        "glGenBuffersARB"(void, GLsizei("n"), address("buffers", "GLuint*"))
        "glIsBufferARB"(boolean, GLuint("buffer"))
        "glBufferDataARB"(
            void,
            GLenum("target"),
            GLsizeiptrARB("size"),
            address("data", "const void*"),
            GLenum("usage")
        )
        "glBufferSubDataARB"(
            void,
            GLenum("target"),
            GLintptrARB("offset"),
            GLsizeiptrARB("size"),
            address("data", "const void*")
        )
        "glGetBufferSubDataARB"(
            void,
            GLenum("target"),
            GLintptrARB("offset"),
            GLsizeiptrARB("size"),
            address("data", "void*")
        )
        "glMapBufferARB"(address, GLenum("target"), GLenum("access"), nativeType = "void*")
        "glUnmapBufferARB"(boolean, GLenum("target"))
        "glGetBufferParameterivARB"(void, GLenum("target"), GLenum("pname"), address("params", "GLint*"))
        "glGetBufferPointervARB"(void, GLenum("target"), GLenum("pname"), address("params", "void**"))
    }
    file("VertexProgram", ARB, "GL_ARB_vertex_program") {
        "GL_COLOR_SUM_ARB"("0x8458")
        "GL_VERTEX_PROGRAM_ARB"("0x8620")
        "GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB"("0x8622")
        "GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB"("0x8623")
        "GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB"("0x8624")
        "GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB"("0x8625")
        "GL_CURRENT_VERTEX_ATTRIB_ARB"("0x8626")
        "GL_VERTEX_PROGRAM_POINT_SIZE_ARB"("0x8642")
        "GL_VERTEX_PROGRAM_TWO_SIDE_ARB"("0x8643")
        "GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB"("0x8645")
        "GL_MAX_VERTEX_ATTRIBS_ARB"("0x8869")
        "GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB"("0x886A")
        "GL_PROGRAM_ADDRESS_REGISTERS_ARB"("0x88B0")
        "GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB"("0x88B1")
        "GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB"("0x88B2")
        "GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB"("0x88B3")
        "glVertexAttrib1dARB"(void, GLuint("index"), GLdouble("x"))
        "glVertexAttrib1dvARB"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttrib1fARB"(void, GLuint("index"), GLfloat("x"))
        "glVertexAttrib1fvARB"(void, GLuint("index"), address("v", "const GLfloat *"))
        "glVertexAttrib1sARB"(void, GLuint("index"), GLshort("x"))
        "glVertexAttrib1svARB"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib2dARB"(void, GLuint("index"), GLdouble("x"), GLdouble("y"))
        "glVertexAttrib2dvARB"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttrib2fARB"(void, GLuint("index"), GLfloat("x"), GLfloat("y"))
        "glVertexAttrib2fvARB"(void, GLuint("index"), address("v", "const GLfloat *"))
        "glVertexAttrib2sARB"(void, GLuint("index"), GLshort("x"), GLshort("y"))
        "glVertexAttrib2svARB"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib3dARB"(void, GLuint("index"), GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glVertexAttrib3dvARB"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttrib3fARB"(void, GLuint("index"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glVertexAttrib3fvARB"(void, GLuint("index"), address("v", "const GLfloat *"))
        "glVertexAttrib3sARB"(void, GLuint("index"), GLshort("x"), GLshort("y"), GLshort("z"))
        "glVertexAttrib3svARB"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib4NbvARB"(void, GLuint("index"), address("v", "const GLbyte *"))
        "glVertexAttrib4NivARB"(void, GLuint("index"), address("v", "const GLint *"))
        "glVertexAttrib4NsvARB"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib4NubARB"(void, GLuint("index"), GLubyte("x"), GLubyte("y"), GLubyte("z"), GLubyte("w"))
        "glVertexAttrib4NubvARB"(void, GLuint("index"), address("v", "const GLubyte *"))
        "glVertexAttrib4NuivARB"(void, GLuint("index"), address("v", "const GLuint *"))
        "glVertexAttrib4NusvARB"(void, GLuint("index"), address("v", "const GLushort *"))
        "glVertexAttrib4bvARB"(void, GLuint("index"), address("v", "const GLbyte *"))
        "glVertexAttrib4dARB"(void, GLuint("index"), GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))
        "glVertexAttrib4dvARB"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttrib4fARB"(void, GLuint("index"), GLfloat("x"), GLfloat("y"), GLfloat("z"), GLfloat("w"))
        "glVertexAttrib4fvARB"(void, GLuint("index"), address("v", "const GLfloat *"))
        "glVertexAttrib4ivARB"(void, GLuint("index"), address("v", "const GLint *"))
        "glVertexAttrib4sARB"(void, GLuint("index"), GLshort("x"), GLshort("y"), GLshort("z"), GLshort("w"))
        "glVertexAttrib4svARB"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib4ubvARB"(void, GLuint("index"), address("v", "const GLubyte *"))
        "glVertexAttrib4uivARB"(void, GLuint("index"), address("v", "const GLuint *"))
        "glVertexAttrib4usvARB"(void, GLuint("index"), address("v", "const GLushort *"))
        "glVertexAttribPointerARB"(
            void,
            GLuint("index"),
            GLint("size"),
            GLenum("type"),
            GLboolean("normalized"),
            GLsizei("stride"),
            address("pointer", "const void *")
        )
        "glEnableVertexAttribArrayARB"(void, GLuint("index"))
        "glDisableVertexAttribArrayARB"(void, GLuint("index"))
        "glGetVertexAttribdvARB"(void, GLuint("index"), GLenum("pname"), address("params", "GLdouble *"))
        "glGetVertexAttribfvARB"(void, GLuint("index"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetVertexAttribivARB"(void, GLuint("index"), GLenum("pname"), address("params", "GLint *"))
        "glGetVertexAttribPointervARB"(void, GLuint("index"), GLenum("pname"), address("pointer", "void **"))
    }
    file("VertexShader", ARB, "GL_ARB_vertex_shader") {
        "GL_VERTEX_SHADER_ARB"("0x8B31")
        "GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB"("0x8B4A")
        "GL_MAX_VARYING_FLOATS_ARB"("0x8B4B")
        "GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB"("0x8B4C")
        "GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB"("0x8B4D")
        "GL_OBJECT_ACTIVE_ATTRIBUTES_ARB"("0x8B89")
        "GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB"("0x8B8A")
        "glBindAttribLocationARB"(
            void,
            GLhandleARB("programObj"),
            GLuint("index"),
            address("name", "const GLcharARB *")
        )
        "glGetActiveAttribARB"(
            void,
            GLhandleARB("programObj"),
            GLuint("index"),
            GLsizei("maxLength"),
            address("length", "GLsizei *"),
            address("size", "GLint *"),
            address("type", "GLenum *"),
            address("name", "GLcharARB *")
        )
        "glGetAttribLocationARB"(GLint, GLhandleARB("programObj"), address("name", "const GLcharARB *"))
    }
    file("ViewportArray", ARB, "GL_ARB_viewport_array") {
        "glDepthRangeArraydvNV"(void, GLuint("first"), GLsizei("count"), address("v", "const GLdouble *"))
        "glDepthRangeIndexeddNV"(void, GLuint("index"), GLdouble("n"), GLdouble("f"))
    }
    file("WindowPos", ARB, "GL_ARB_window_pos") {
        "glWindowPos2dARB"(void, GLdouble("x"), GLdouble("y"))
        "glWindowPos2dvARB"(void, address("v", "const GLdouble *"))
        "glWindowPos2fARB"(void, GLfloat("x"), GLfloat("y"))
        "glWindowPos2fvARB"(void, address("v", "const GLfloat *"))
        "glWindowPos2iARB"(void, GLint("x"), GLint("y"))
        "glWindowPos2ivARB"(void, address("v", "const GLint *"))
        "glWindowPos2sARB"(void, GLshort("x"), GLshort("y"))
        "glWindowPos2svARB"(void, address("v", "const GLshort *"))
        "glWindowPos3dARB"(void, GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glWindowPos3dvARB"(void, address("v", "const GLdouble *"))
        "glWindowPos3fARB"(void, GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glWindowPos3fvARB"(void, address("v", "const GLfloat *"))
        "glWindowPos3iARB"(void, GLint("x"), GLint("y"), GLint("z"))
        "glWindowPos3ivARB"(void, address("v", "const GLint *"))
        "glWindowPos3sARB"(void, GLshort("x"), GLshort("y"), GLshort("z"))
        "glWindowPos3svARB"(void, address("v", "const GLshort *"))
    }
}
