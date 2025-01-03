/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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

package overrungl.opengl.old

import overrungl.opengl.old.OpenGLExt.ARB

/**
 * @author squid233
 * @since 0.1.0
 */
fun arb() {
    _root_ide_package_.overrungl.opengl.old.file("ES32Compatibility", ARB, "GL_ARB_ES3_2_compatibility") {
        "GL_PRIMITIVE_BOUNDING_BOX_ARB"("0x92BE")
        "GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB"("0x9381")
        "GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB"("0x9382")
        "glPrimitiveBoundingBoxARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLfloat("minX"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("minY"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("minZ"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("minW"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("maxX"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("maxY"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("maxZ"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("maxW")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("BindlessTexture", ARB, "GL_ARB_bindless_texture") {
        "GL_UNSIGNED_INT64_ARB"("0x140F")
        "glGetTextureHandleARB"(
            _root_ide_package_.overrungl.opengl.old.GLuint64,
            _root_ide_package_.overrungl.opengl.old.GLuint("texture")
        )
        "glGetTextureSamplerHandleARB"(
            _root_ide_package_.overrungl.opengl.old.GLuint64,
            _root_ide_package_.overrungl.opengl.old.GLuint("texture"),
            _root_ide_package_.overrungl.opengl.old.GLuint("sampler")
        )
        "glMakeTextureHandleResidentARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint64("handle")
        )
        "glMakeTextureHandleNonResidentARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint64("handle")
        )
        "glGetImageHandleARB"(
            _root_ide_package_.overrungl.opengl.old.GLuint64,
            _root_ide_package_.overrungl.opengl.old.GLuint("texture"),
            _root_ide_package_.overrungl.opengl.old.GLint("level"),
            _root_ide_package_.overrungl.opengl.old.GLboolean("layered"),
            _root_ide_package_.overrungl.opengl.old.GLint("layer"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format")
        )
        "glMakeImageHandleResidentARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint64("handle"),
            _root_ide_package_.overrungl.opengl.old.GLenum("access")
        )
        "glMakeImageHandleNonResidentARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint64("handle")
        )
        "glUniformHandleui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("value")
        )
        "glUniformHandleui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
        "glProgramUniformHandleui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("value")
        )
        "glProgramUniformHandleui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("values", "const GLuint64 *")
        )
        "glIsTextureHandleResidentARB"(
            _root_ide_package_.overrungl.opengl.old.GLboolean,
            _root_ide_package_.overrungl.opengl.old.GLuint64("handle")
        )
        "glIsImageHandleResidentARB"(
            _root_ide_package_.overrungl.opengl.old.GLboolean,
            _root_ide_package_.overrungl.opengl.old.GLuint64("handle")
        )
        "glVertexAttribL1ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLuint64EXT("x")
        )
        "glVertexAttribL1ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLuint64EXT *")
        )
        "glGetVertexAttribLui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLuint64EXT *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("CLEvent", ARB, "GL_ARB_cl_event") {
        "GL_SYNC_CL_EVENT_ARB"("0x8240")
        "GL_SYNC_CL_EVENT_COMPLETE_ARB"("0x8241")
        "glCreateSyncFromCLeventARB"(
            _root_ide_package_.overrungl.opengl.old.address,
            _root_ide_package_.overrungl.opengl.old.address("context", "struct _cl_context *"),
            _root_ide_package_.overrungl.opengl.old.address("event", "struct _cl_event *"),
            _root_ide_package_.overrungl.opengl.old.GLbitfield("flags"),
            nativeType = "GLsync"
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("ColorBufferFloat", ARB, "GL_ARB_color_buffer_float") {
        "GL_RGBA_FLOAT_MODE_ARB"("0x8820")
        "GL_CLAMP_VERTEX_COLOR_ARB"("0x891A")
        "GL_CLAMP_FRAGMENT_COLOR_ARB"("0x891B")
        "GL_CLAMP_READ_COLOR_ARB"("0x891C")
        "GL_FIXED_ONLY_ARB"("0x891D")
        "glClampColorARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("clamp")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
        "ComputeVariableGroupSize",
        ARB,
        "GL_ARB_compute_variable_group_size"
    ) {
        "GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB"("0x9344")
        "GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB"("0x90EB")
        "GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB"("0x9345")
        "GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB"("0x91BF")
        "glDispatchComputeGroupSizeARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("num_groups_x"),
            _root_ide_package_.overrungl.opengl.old.GLuint("num_groups_y"),
            _root_ide_package_.overrungl.opengl.old.GLuint("num_groups_z"),
            _root_ide_package_.overrungl.opengl.old.GLuint("group_size_x"),
            _root_ide_package_.overrungl.opengl.old.GLuint("group_size_y"),
            _root_ide_package_.overrungl.opengl.old.GLuint("group_size_z")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("DebugOutput", ARB, "GL_ARB_debug_output") {
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
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("source"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.GLenum("severity"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("ids", "const GLuint *"),
            _root_ide_package_.overrungl.opengl.old.GLboolean("enabled")
        )
        "glDebugMessageInsertARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("source"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.GLuint("id"),
            _root_ide_package_.overrungl.opengl.old.GLenum("severity"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("length"),
            _root_ide_package_.overrungl.opengl.old.address("buf", "const GLchar *")
        )
        ("glDebugMessageCallbackARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("callback", "GLDEBUGPROCARB"),
            _root_ide_package_.overrungl.opengl.old.address("userParam", "const void *")
        )) {
            "glDebugMessageCallbackARB"(
                _root_ide_package_.overrungl.opengl.old.void,
                "glDebugMessageCallbackARB(callback.stub(arena), userParam);",
                _root_ide_package_.overrungl.opengl.old.arena("arena"),
                _root_ide_package_.overrungl.opengl.old.Type("overrungl.opengl.GLDebugProc", null)("callback"),
                _root_ide_package_.overrungl.opengl.old.address("userParam", "const void *")
            )
        }
        "glGetDebugMessageLogARB"(
            _root_ide_package_.overrungl.opengl.old.GLuint,
            _root_ide_package_.overrungl.opengl.old.GLuint("count"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("sources", "GLenum *"),
            _root_ide_package_.overrungl.opengl.old.address("types", "GLenum *"),
            _root_ide_package_.overrungl.opengl.old.address("ids", "GLuint *"),
            _root_ide_package_.overrungl.opengl.old.address("severities", "GLenum *"),
            _root_ide_package_.overrungl.opengl.old.address("lengths", "GLsizei *"),
            _root_ide_package_.overrungl.opengl.old.address("messageLog", "GLchar *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
        "DepthTexture", ARB, "GL_ARB_depth_texture",
        "GL_DEPTH_COMPONENT16_ARB" to "0x81A5",
        "GL_DEPTH_COMPONENT24_ARB" to "0x81A6",
        "GL_DEPTH_COMPONENT32_ARB" to "0x81A7",
        "GL_TEXTURE_DEPTH_SIZE_ARB" to "0x884A",
        "GL_DEPTH_TEXTURE_MODE_ARB" to "0x884B"
    )
    _root_ide_package_.overrungl.opengl.old.file("DrawBuffers", ARB, "GL_ARB_draw_buffers") {
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
        "glDrawBuffersARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLsizei("n"),
            _root_ide_package_.overrungl.opengl.old.address("bufs", "const GLenum *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("DrawBuffersBlend", ARB, "GL_ARB_draw_buffers_blend") {
        "glBlendEquationiARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("buf"),
            _root_ide_package_.overrungl.opengl.old.GLenum("mode")
        )
        "glBlendEquationSeparateiARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("buf"),
            _root_ide_package_.overrungl.opengl.old.GLenum("modeRGB"),
            _root_ide_package_.overrungl.opengl.old.GLenum("modeAlpha")
        )
        "glBlendFunciARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("buf"),
            _root_ide_package_.overrungl.opengl.old.GLenum("src"),
            _root_ide_package_.overrungl.opengl.old.GLenum("dst")
        )
        "glBlendFuncSeparateiARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("buf"),
            _root_ide_package_.overrungl.opengl.old.GLenum("srcRGB"),
            _root_ide_package_.overrungl.opengl.old.GLenum("dstRGB"),
            _root_ide_package_.overrungl.opengl.old.GLenum("srcAlpha"),
            _root_ide_package_.overrungl.opengl.old.GLenum("dstAlpha")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("DrawInstanced", ARB, "GL_ARB_draw_instanced") {
        "glDrawArraysInstancedARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("mode"),
            _root_ide_package_.overrungl.opengl.old.GLint("first"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("primcount")
        )
        "glDrawElementsInstancedARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("mode"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("indices", "const void *"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("primcount")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("FragmentProgram", ARB, "GL_ARB_fragment_program") {
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
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("len"),
            _root_ide_package_.overrungl.opengl.old.address("string", "const void *")
        )
        "glBindProgramARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("program")
        )
        "glDeleteProgramsARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLsizei("n"),
            _root_ide_package_.overrungl.opengl.old.address("programs", "const GLuint *")
        )
        "glGenProgramsARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLsizei("n"),
            _root_ide_package_.overrungl.opengl.old.address("programs", "GLuint *")
        )
        "glProgramEnvParameter4dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("x"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("y"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("z"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("w")
        )
        "glProgramEnvParameter4dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLdouble *")
        )
        "glProgramEnvParameter4fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("x"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("y"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("z"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("w")
        )
        "glProgramEnvParameter4fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLfloat *")
        )
        "glProgramLocalParameter4dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("x"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("y"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("z"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("w")
        )
        "glProgramLocalParameter4dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLdouble *")
        )
        "glProgramLocalParameter4fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("x"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("y"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("z"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("w")
        )
        "glProgramLocalParameter4fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLfloat *")
        )
        "glGetProgramEnvParameterdvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLdouble *")
        )
        "glGetProgramEnvParameterfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat *")
        )
        "glGetProgramLocalParameterdvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLdouble *")
        )
        "glGetProgramLocalParameterfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat *")
        )
        "glGetProgramivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint *")
        )
        "glGetProgramStringARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("string", "void *")
        )
        "glIsProgramARB"(
            _root_ide_package_.overrungl.opengl.old.GLboolean,
            _root_ide_package_.overrungl.opengl.old.GLuint("program")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
        "FragmentShader", ARB, "GL_ARB_fragment_shader",
        "GL_FRAGMENT_SHADER_ARB" to "0x8B30",
        "GL_MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB" to "0x8B49",
        "GL_FRAGMENT_SHADER_DERIVATIVE_HINT_ARB" to "0x8B8B"
    )
    _root_ide_package_.overrungl.opengl.old.file("GeometryShader4", ARB, "GL_ARB_geometry_shader4") {
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
        "glProgramParameteriARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.GLint("value")
        )
        "glFramebufferTextureARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("attachment"),
            _root_ide_package_.overrungl.opengl.old.GLuint("texture"),
            _root_ide_package_.overrungl.opengl.old.GLint("level")
        )
        "glFramebufferTextureLayerARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("attachment"),
            _root_ide_package_.overrungl.opengl.old.GLuint("texture"),
            _root_ide_package_.overrungl.opengl.old.GLint("level"),
            _root_ide_package_.overrungl.opengl.old.GLint("layer")
        )
        "glFramebufferTextureFaceARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("attachment"),
            _root_ide_package_.overrungl.opengl.old.GLuint("texture"),
            _root_ide_package_.overrungl.opengl.old.GLint("level"),
            _root_ide_package_.overrungl.opengl.old.GLenum("face")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("GLSpirv", ARB, "GL_ARB_gl_spirv") {
        "GL_SHADER_BINARY_FORMAT_SPIR_V_ARB"("0x9551")
        "GL_SPIR_V_BINARY_ARB"("0x9552")
        "glSpecializeShaderARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("shader"),
            _root_ide_package_.overrungl.opengl.old.address("pEntryPoint", "const GLchar *"),
            _root_ide_package_.overrungl.opengl.old.GLuint("numSpecializationConstants"),
            _root_ide_package_.overrungl.opengl.old.address("pConstantIndex", "const GLuint *"),
            _root_ide_package_.overrungl.opengl.old.address("pConstantValue", "const GLuint *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("GpuShaderInt64", ARB, "GL_ARB_gpu_shader_int64") {
        "GL_INT64_ARB"("0x140E")
        "GL_INT64_VEC2_ARB"("0x8FE9")
        "GL_INT64_VEC3_ARB"("0x8FEA")
        "GL_INT64_VEC4_ARB"("0x8FEB")
        "GL_UNSIGNED_INT64_VEC2_ARB"("0x8FF5")
        "GL_UNSIGNED_INT64_VEC3_ARB"("0x8FF6")
        "GL_UNSIGNED_INT64_VEC4_ARB"("0x8FF7")
        "glUniform1i64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLint64("x")
        )
        "glUniform2i64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLint64("y")
        )
        "glUniform3i64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLint64("y"),
            _root_ide_package_.overrungl.opengl.old.GLint64("z")
        )
        "glUniform4i64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLint64("y"),
            _root_ide_package_.overrungl.opengl.old.GLint64("z"),
            _root_ide_package_.overrungl.opengl.old.GLint64("w")
        )
        "glUniform1i64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint64 *")
        )
        "glUniform2i64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint64 *")
        )
        "glUniform3i64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint64 *")
        )
        "glUniform4i64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint64 *")
        )
        "glUniform1ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("x")
        )
        "glUniform2ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("y")
        )
        "glUniform3ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("y"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("z")
        )
        "glUniform4ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("y"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("z"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("w")
        )
        "glUniform1ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
        "glUniform2ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
        "glUniform3ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
        "glUniform4ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
        "glGetUniformi64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint64 *")
        )
        "glGetUniformui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLuint64 *")
        )
        "glGetnUniformi64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint64 *")
        )
        "glGetnUniformui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLuint64 *")
        )
        "glProgramUniform1i64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLint64("x")
        )
        "glProgramUniform2i64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLint64("y")
        )
        "glProgramUniform3i64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLint64("y"),
            _root_ide_package_.overrungl.opengl.old.GLint64("z")
        )
        "glProgramUniform4i64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLint64("y"),
            _root_ide_package_.overrungl.opengl.old.GLint64("z"),
            _root_ide_package_.overrungl.opengl.old.GLint64("w")
        )
        "glProgramUniform1i64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint64 *")
        )
        "glProgramUniform2i64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint64 *")
        )
        "glProgramUniform3i64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint64 *")
        )
        "glProgramUniform4i64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint64 *")
        )
        "glProgramUniform1ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("x")
        )
        "glProgramUniform2ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("y")
        )
        "glProgramUniform3ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("y"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("z")
        )
        "glProgramUniform4ui64ARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("x"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("y"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("z"),
            _root_ide_package_.overrungl.opengl.old.GLuint64("w")
        )
        "glProgramUniform1ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
        "glProgramUniform2ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
        "glProgramUniform3ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
        "glProgramUniform4ui64vARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("program"),
            _root_ide_package_.overrungl.opengl.old.GLint("location"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLuint64 *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
        "HalfFloatPixel",
        ARB,
        "GL_ARB_half_float_pixel",
        "GL_HALF_FLOAT_ARB" to "0x140B"
    )
    _root_ide_package_.overrungl.opengl.old.file("Imaging", ARB, "GL_ARB_imaging") {
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
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("table", "const void *")
        )
        "glColorTableParameterfv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLfloat *")
        )
        "glColorTableParameteriv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLint *")
        )
        "glCopyColorTable"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLint("x"),
            _root_ide_package_.overrungl.opengl.old.GLint("y"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width")
        )
        "glGetColorTable"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("table", "void *")
        )
        "glGetColorTableParameterfv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat *")
        )
        "glGetColorTableParameteriv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint *")
        )
        "glColorSubTable"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("start"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void *")
        )
        "glCopyColorSubTable"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("start"),
            _root_ide_package_.overrungl.opengl.old.GLint("x"),
            _root_ide_package_.overrungl.opengl.old.GLint("y"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width")
        )
        "glConvolutionFilter1D"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("image", "const void *")
        )
        "glConvolutionFilter2D"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("height"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("image", "const void *")
        )
        "glConvolutionParameterf"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("params")
        )
        "glConvolutionParameterfv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLfloat *")
        )
        "glConvolutionParameteri"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.GLint("params")
        )
        "glConvolutionParameteriv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLint *")
        )
        "glCopyConvolutionFilter1D"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLint("x"),
            _root_ide_package_.overrungl.opengl.old.GLint("y"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width")
        )
        "glCopyConvolutionFilter2D"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLint("x"),
            _root_ide_package_.overrungl.opengl.old.GLint("y"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("height")
        )
        "glGetConvolutionFilter"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("image", "void *")
        )
        "glGetConvolutionParameterfv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat *")
        )
        "glGetConvolutionParameteriv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint *")
        )
        "glGetSeparableFilter"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("row", "void *"),
            _root_ide_package_.overrungl.opengl.old.address("column", "void *"),
            _root_ide_package_.overrungl.opengl.old.address("span", "void *")
        )
        "glSeparableFilter2D"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("height"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("row", "const void *"),
            _root_ide_package_.overrungl.opengl.old.address("column", "const void *")
        )
        "glGetHistogram"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLboolean("reset"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("values", "void *")
        )
        "glGetHistogramParameterfv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat *")
        )
        "glGetHistogramParameteriv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint *")
        )
        "glGetMinmax"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLboolean("reset"),
            _root_ide_package_.overrungl.opengl.old.GLenum("format"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("values", "void *")
        )
        "glGetMinmaxParameterfv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat *")
        )
        "glGetMinmaxParameteriv"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint *")
        )
        "glHistogram"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("width"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLboolean("sink")
        )
        "glMinmax"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("internalformat"),
            _root_ide_package_.overrungl.opengl.old.GLboolean("sink")
        )
        "glResetHistogram"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target")
        )
        "glResetMinmax"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("IndirectParameters", ARB, "GL_ARB_indirect_parameters") {
        "GL_PARAMETER_BUFFER_ARB"("0x80EE")
        "GL_PARAMETER_BUFFER_BINDING_ARB"("0x80EF")
        "glMultiDrawArraysIndirectCountARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("mode"),
            _root_ide_package_.overrungl.opengl.old.address("indirect", "const void *"),
            _root_ide_package_.overrungl.opengl.old.GLintptr("drawcount"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("maxdrawcount"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("stride")
        )
        "glMultiDrawElementsIndirectCountARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("mode"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.address("indirect", "const void *"),
            _root_ide_package_.overrungl.opengl.old.GLintptr("drawcount"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("maxdrawcount"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("stride")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("InstancedArrays", ARB, "GL_ARB_instanced_arrays") {
        "GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB"("0x88FE")
        "glVertexAttribDivisorARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLuint("divisor")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
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
    _root_ide_package_.overrungl.opengl.old.file("MatrixPalette", ARB, "GL_ARB_matrix_palette") {
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
        "glCurrentPaletteMatrixARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("index")
        )
        "glMatrixIndexubvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("indices", "const GLubyte *")
        )
        "glMatrixIndexusvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("indices", "const GLushort *")
        )
        "glMatrixIndexuivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("indices", "const GLuint *")
        )
        "glMatrixIndexPointerARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("stride"),
            _root_ide_package_.overrungl.opengl.old.address("pointer", "const void *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("Multisample", ARB, "GL_ARB_multisample") {
        "GL_MULTISAMPLE_ARB"("0x809D")
        "GL_SAMPLE_ALPHA_TO_COVERAGE_ARB"("0x809E")
        "GL_SAMPLE_ALPHA_TO_ONE_ARB"("0x809F")
        "GL_SAMPLE_COVERAGE_ARB"("0x80A0")
        "GL_SAMPLE_BUFFERS_ARB"("0x80A8")
        "GL_SAMPLES_ARB"("0x80A9")
        "GL_SAMPLE_COVERAGE_VALUE_ARB"("0x80AA")
        "GL_SAMPLE_COVERAGE_INVERT_ARB"("0x80AB")
        "GL_MULTISAMPLE_BIT_ARB"("0x20000000")
        "glSampleCoverageARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLfloat("value"),
            _root_ide_package_.overrungl.opengl.old.GLboolean("invert")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("Multitexture", ARB, "GL_ARB_multitexture") {
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
        "glActiveTextureARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("texture")
        )
        "glClientActiveTextureARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("texture")
        )
        "glMultiTexCoord1dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("s")
        )
        "glMultiTexCoord1dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glMultiTexCoord1fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("s")
        )
        "glMultiTexCoord1fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glMultiTexCoord1iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLint("s")
        )
        "glMultiTexCoord1ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLint *")
        )
        "glMultiTexCoord1sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLshort("s")
        )
        "glMultiTexCoord1svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glMultiTexCoord2dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("s"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("t")
        )
        "glMultiTexCoord2dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glMultiTexCoord2fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("s"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("t")
        )
        "glMultiTexCoord2fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glMultiTexCoord2iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLint("s"),
            _root_ide_package_.overrungl.opengl.old.GLint("t")
        )
        "glMultiTexCoord2ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLint *")
        )
        "glMultiTexCoord2sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLshort("s"),
            _root_ide_package_.overrungl.opengl.old.GLshort("t")
        )
        "glMultiTexCoord2svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glMultiTexCoord3dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("s"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("t"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("r")
        )
        "glMultiTexCoord3dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glMultiTexCoord3fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("s"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("t"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("r")
        )
        "glMultiTexCoord3fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glMultiTexCoord3iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLint("s"),
            _root_ide_package_.overrungl.opengl.old.GLint("t"),
            _root_ide_package_.overrungl.opengl.old.GLint("r")
        )
        "glMultiTexCoord3ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLint *")
        )
        "glMultiTexCoord3sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLshort("s"),
            _root_ide_package_.overrungl.opengl.old.GLshort("t"),
            _root_ide_package_.overrungl.opengl.old.GLshort("r")
        )
        "glMultiTexCoord3svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glMultiTexCoord4dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("s"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("t"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("r"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("q")
        )
        "glMultiTexCoord4dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glMultiTexCoord4fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("s"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("t"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("r"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("q")
        )
        "glMultiTexCoord4fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glMultiTexCoord4iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLint("s"),
            _root_ide_package_.overrungl.opengl.old.GLint("t"),
            _root_ide_package_.overrungl.opengl.old.GLint("r"),
            _root_ide_package_.overrungl.opengl.old.GLint("q")
        )
        "glMultiTexCoord4ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLint *")
        )
        "glMultiTexCoord4sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLshort("s"),
            _root_ide_package_.overrungl.opengl.old.GLshort("t"),
            _root_ide_package_.overrungl.opengl.old.GLshort("r"),
            _root_ide_package_.overrungl.opengl.old.GLshort("q")
        )
        "glMultiTexCoord4svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("OcclusionQuery", ARB, "GL_ARB_occlusion_query") {
        "GL_QUERY_COUNTER_BITS_ARB"("0x8864")
        "GL_CURRENT_QUERY_ARB"("0x8865")
        "GL_QUERY_RESULT_ARB"("0x8866")
        "GL_QUERY_RESULT_AVAILABLE_ARB"("0x8867")
        "GL_SAMPLES_PASSED_ARB"("0x8914")
        "glGenQueriesARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLsizei("n"),
            _root_ide_package_.overrungl.opengl.old.address("ids", "GLuint *")
        )
        "glDeleteQueriesARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLsizei("n"),
            _root_ide_package_.overrungl.opengl.old.address("ids", "const GLuint *")
        )
        "glIsQueryARB"(
            _root_ide_package_.overrungl.opengl.old.GLboolean,
            _root_ide_package_.overrungl.opengl.old.GLuint("id")
        )
        "glBeginQueryARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("id")
        )
        "glEndQueryARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target")
        )
        "glGetQueryivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint *")
        )
        "glGetQueryObjectivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("id"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint *")
        )
        "glGetQueryObjectuivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("id"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLuint *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("ParallelShaderCompile", ARB, "GL_ARB_parallel_shader_compile") {
        "GL_MAX_SHADER_COMPILER_THREADS_ARB"("0x91B0")
        "GL_COMPLETION_STATUS_ARB"("0x91B1")
        "glMaxShaderCompilerThreadsARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("count")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
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
    _root_ide_package_.overrungl.opengl.old.file(
        "PixelBufferObject", ARB, "GL_ARB_pixel_buffer_object",
        "GL_PIXEL_PACK_BUFFER_ARB" to "0x88EB",
        "GL_PIXEL_UNPACK_BUFFER_ARB" to "0x88EC",
        "GL_PIXEL_PACK_BUFFER_BINDING_ARB" to "0x88ED",
        "GL_PIXEL_UNPACK_BUFFER_BINDING_ARB" to "0x88EF"
    )
    _root_ide_package_.overrungl.opengl.old.file("PointParameters", ARB, "GL_ARB_point_parameters") {
        "GL_POINT_SIZE_MIN_ARB"("0x8126")
        "GL_POINT_SIZE_MAX_ARB"("0x8127")
        "GL_POINT_FADE_THRESHOLD_SIZE_ARB"("0x8128")
        "GL_POINT_DISTANCE_ATTENUATION_ARB"("0x8129")
        "glPointParameterfARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("param")
        )
        "glPointParameterfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "const GLfloat *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
        "PointSprite", ARB, "GL_ARB_point_sprite",
        "GL_POINT_SPRITE_ARB" to "0x8861",
        "GL_COORD_REPLACE_ARB" to "0x8862"
    )
    _root_ide_package_.overrungl.opengl.old.file("Robustness", ARB, "GL_ARB_robustness") {
        "GL_NO_RESET_NOTIFICATION_ARB"("0x8261")
        "GL_RESET_NOTIFICATION_STRATEGY_ARB"("0x8256")
        "GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB"("0x00000004")
        "GL_UNKNOWN_CONTEXT_RESET_ARB"("0x8255")
        "GL_LOSE_CONTEXT_ON_RESET_ARB"("0x8252")
        "GL_INNOCENT_CONTEXT_RESET_ARB"("0x8254")
        "GL_GUILTY_CONTEXT_RESET_ARB"("0x8253")
        "glGetGraphicsResetStatusARB"(_root_ide_package_.overrungl.opengl.old.int)
        "glGetnCompressedTexImageARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("lod"),
            _root_ide_package_.overrungl.opengl.old.int("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("img", "void*")
        )
        "glGetnTexImageARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.int("format"),
            _root_ide_package_.overrungl.opengl.old.int("type"),
            _root_ide_package_.overrungl.opengl.old.int("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("img", "void*")
        )
        "glGetnUniformdvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("program"),
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLdouble*")
        )
        "glGetnUniformfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("program"),
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat*")
        )
        "glGetnUniformivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("program"),
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint*")
        )
        "glGetnUniformuivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("program"),
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLuint*")
        )
        "glReadnPixelsARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("x"),
            _root_ide_package_.overrungl.opengl.old.int("y"),
            _root_ide_package_.overrungl.opengl.old.int("width"),
            _root_ide_package_.overrungl.opengl.old.int("height"),
            _root_ide_package_.overrungl.opengl.old.int("format"),
            _root_ide_package_.overrungl.opengl.old.int("type"),
            _root_ide_package_.overrungl.opengl.old.int("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("data", "void*")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("SampleLocations", ARB, "GL_ARB_sample_locations") {
        "GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB"("0x933D")
        "GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB"("0x933E")
        "GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB"("0x933F")
        "GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB"("0x9340")
        "GL_SAMPLE_LOCATION_ARB"("0x8E50")
        "GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB"("0x9341")
        "GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB"("0x9342")
        "GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB"("0x9343")
        "glEvaluateDepthValuesARB"(_root_ide_package_.overrungl.opengl.old.void)
        "glFramebufferSampleLocationsfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("start"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *v")
        )
        "glNamedFramebufferSampleLocationsfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("framebuffer"),
            _root_ide_package_.overrungl.opengl.old.int("start"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *v")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("SampleShading", ARB, "GL_ARB_sample_shading") {
        "GL_SAMPLE_SHADING_ARB"("0x8C36")
        "GL_MIN_SAMPLE_SHADING_VALUE_ARB"("0x8C37")
        "glMinSampleShadingARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.float("value")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("ShaderObjects", ARB, "GL_ARB_shader_objects") {
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
        "glDeleteObjectARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("obj")
        )
        "glGetHandleARB"(
            _root_ide_package_.overrungl.opengl.old.int,
            _root_ide_package_.overrungl.opengl.old.int("pname")
        )
        "glDetachObjectARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("containerObj"),
            _root_ide_package_.overrungl.opengl.old.int("attachedObj")
        )
        "glCreateShaderObjectARB"(
            _root_ide_package_.overrungl.opengl.old.int,
            _root_ide_package_.overrungl.opengl.old.int("shaderType")
        )
        "glShaderSourceARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("shaderObj"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("string", "const GLcharARB**"),
            _root_ide_package_.overrungl.opengl.old.address("length", "const GLint*")
        )
        "glCompileShaderARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("shaderObj")
        )
        "glCreateProgramObjectARB"(_root_ide_package_.overrungl.opengl.old.int)
        "glAttachObjectARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("containerObj"),
            _root_ide_package_.overrungl.opengl.old.int("obj")
        )
        "glLinkProgramARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("programObj")
        )
        "glUseProgramObjectARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("programObj")
        )
        "glValidateProgramARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("programObj")
        )
        "glUniform1fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.float("v0")
        )
        "glUniform2fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.float("v0"),
            _root_ide_package_.overrungl.opengl.old.float("v1")
        )
        "glUniform3fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.float("v0"),
            _root_ide_package_.overrungl.opengl.old.float("v1"),
            _root_ide_package_.overrungl.opengl.old.float("v2")
        )
        "glUniform4fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.float("v0"),
            _root_ide_package_.overrungl.opengl.old.float("v1"),
            _root_ide_package_.overrungl.opengl.old.float("v2"),
            _root_ide_package_.overrungl.opengl.old.float("v3")
        )
        "glUniform1iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("v0")
        )
        "glUniform2iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("v0"),
            _root_ide_package_.overrungl.opengl.old.int("v1")
        )
        "glUniform3iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("v0"),
            _root_ide_package_.overrungl.opengl.old.int("v1"),
            _root_ide_package_.overrungl.opengl.old.int("v2")
        )
        "glUniform4iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("v0"),
            _root_ide_package_.overrungl.opengl.old.int("v1"),
            _root_ide_package_.overrungl.opengl.old.int("v2"),
            _root_ide_package_.overrungl.opengl.old.int("v3")
        )
        "glUniform1fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLfloat*")
        )
        "glUniform2fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLfloat*")
        )
        "glUniform3fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLfloat*")
        )
        "glUniform4fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLfloat*")
        )
        "glUniform1ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint*")
        )
        "glUniform2ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint*")
        )
        "glUniform3ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint*")
        )
        "glUniform4ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLint*")
        )
        "glUniformMatrix2fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.boolean("transpose"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLfloat*")
        )
        "glUniformMatrix3fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.boolean("transpose"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLfloat*")
        )
        "glUniformMatrix4fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.boolean("transpose"),
            _root_ide_package_.overrungl.opengl.old.address("value", "const GLfloat*")
        )
        "glGetObjectParameterfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("obj"),
            _root_ide_package_.overrungl.opengl.old.int("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat*")
        )
        "glGetObjectParameterivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("obj"),
            _root_ide_package_.overrungl.opengl.old.int("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint*")
        )
        "glGetInfoLogARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("obj"),
            _root_ide_package_.overrungl.opengl.old.int("maxLength"),
            _root_ide_package_.overrungl.opengl.old.address("length", "GLsizei*"),
            _root_ide_package_.overrungl.opengl.old.address("infoLog", "GLcharARB*")
        )
        "glGetAttachedObjectsARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("containerObj"),
            _root_ide_package_.overrungl.opengl.old.int("maxCount"),
            _root_ide_package_.overrungl.opengl.old.address("count", "GLsizei*"),
            _root_ide_package_.overrungl.opengl.old.address("obj", "GLhandleARB*")
        )
        "glGetUniformLocationARB"(
            _root_ide_package_.overrungl.opengl.old.int,
            _root_ide_package_.overrungl.opengl.old.int("programObj"),
            _root_ide_package_.overrungl.opengl.old.address("name", "const GLcharARB*")
        )
        "glGetActiveUniformARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("programObj"),
            _root_ide_package_.overrungl.opengl.old.int("index"),
            _root_ide_package_.overrungl.opengl.old.int("maxLength"),
            _root_ide_package_.overrungl.opengl.old.address("length", "GLsizei*"),
            _root_ide_package_.overrungl.opengl.old.address("size", "GLint*"),
            _root_ide_package_.overrungl.opengl.old.address("type", "GLenum*"),
            _root_ide_package_.overrungl.opengl.old.address("name", "GLcharARB*")
        )
        "glGetUniformfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("programObj"),
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat*")
        )
        "glGetUniformivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("programObj"),
            _root_ide_package_.overrungl.opengl.old.int("location"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint*")
        )
        "glGetShaderSourceARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("obj"),
            _root_ide_package_.overrungl.opengl.old.int("maxLength"),
            _root_ide_package_.overrungl.opengl.old.address("length", "GLsizei*"),
            _root_ide_package_.overrungl.opengl.old.address("source", "GLcharARB*")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("ShadingLanguageInclude", ARB, "GL_ARB_shading_language_include") {
        "GL_SHADER_INCLUDE_ARB"("0x8DAE")
        "GL_NAMED_STRING_LENGTH_ARB"("0x8DE9")
        "GL_NAMED_STRING_TYPE_ARB"("0x8DEA")
        "glNamedStringARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("type"),
            _root_ide_package_.overrungl.opengl.old.int("nameLen"),
            _root_ide_package_.overrungl.opengl.old.address("name", "const GLchar*"),
            _root_ide_package_.overrungl.opengl.old.int("stringLen"),
            _root_ide_package_.overrungl.opengl.old.address("string", "const GLchar*")
        )
        "glDeleteNamedStringARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("nameLen"),
            _root_ide_package_.overrungl.opengl.old.address("name", "const GLchar*")
        )
        "glCompileShaderIncludeARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("shader"),
            _root_ide_package_.overrungl.opengl.old.int("count"),
            _root_ide_package_.overrungl.opengl.old.address("path", "const GLchar *const*"),
            _root_ide_package_.overrungl.opengl.old.address("length", "const GLint*")
        )
        "glIsNamedStringARB"(
            _root_ide_package_.overrungl.opengl.old.boolean,
            _root_ide_package_.overrungl.opengl.old.int("nameLen"),
            _root_ide_package_.overrungl.opengl.old.address("name", "const GLchar*")
        )
        "glGetNamedStringARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("nameLen"),
            _root_ide_package_.overrungl.opengl.old.address("name", "const GLchar*"),
            _root_ide_package_.overrungl.opengl.old.int("bufSize"),
            _root_ide_package_.overrungl.opengl.old.address("stringLen", "GLint*"),
            _root_ide_package_.overrungl.opengl.old.address("string", "GLchar*")
        )
        "glGetNamedStringivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("nameLen"),
            _root_ide_package_.overrungl.opengl.old.address("name", "const GLchar*"),
            _root_ide_package_.overrungl.opengl.old.int("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint*")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
        "Shadow", ARB, "GL_ARB_shadow",
        "GL_TEXTURE_COMPARE_MODE_ARB" to "0x884C",
        "GL_TEXTURE_COMPARE_FUNC_ARB" to "0x884D",
        "GL_COMPARE_R_TO_TEXTURE_ARB" to "0x884E"
    )
    _root_ide_package_.overrungl.opengl.old.file(
        "ShadowAmbient", ARB, "GL_ARB_shadow_ambient",
        "GL_TEXTURE_COMPARE_FAIL_VALUE_ARB" to "0x80BF"
    )
    _root_ide_package_.overrungl.opengl.old.file("SparseBuffer", ARB, "GL_ARB_sparse_buffer") {
        "GL_SPARSE_STORAGE_BIT_ARB"("0x0400")
        "GL_SPARSE_BUFFER_PAGE_SIZE_ARB"("0x82F8")
        "glBufferPageCommitmentARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.long("offset"),
            _root_ide_package_.overrungl.opengl.old.long("size"),
            _root_ide_package_.overrungl.opengl.old.boolean("commit")
        )
        "glNamedBufferPageCommitmentEXT"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("buffer"),
            _root_ide_package_.overrungl.opengl.old.long("offset"),
            _root_ide_package_.overrungl.opengl.old.long("size"),
            _root_ide_package_.overrungl.opengl.old.boolean("commit")
        )
        "glNamedBufferPageCommitmentARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("buffer"),
            _root_ide_package_.overrungl.opengl.old.long("offset"),
            _root_ide_package_.overrungl.opengl.old.long("size"),
            _root_ide_package_.overrungl.opengl.old.boolean("commit")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("SparseTexture", ARB, "GL_ARB_sparse_texture") {
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
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.int("xoffset"),
            _root_ide_package_.overrungl.opengl.old.int("yoffset"),
            _root_ide_package_.overrungl.opengl.old.int("zoffset"),
            _root_ide_package_.overrungl.opengl.old.int("width"),
            _root_ide_package_.overrungl.opengl.old.int("height"),
            _root_ide_package_.overrungl.opengl.old.int("depth"),
            _root_ide_package_.overrungl.opengl.old.boolean("commit")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
        "TextureBorderClamp", ARB, "GL_ARB_texture_border_clamp",
        "GL_CLAMP_TO_BORDER_ARB" to "0x812D"
    )
    _root_ide_package_.overrungl.opengl.old.file("TextureBufferObject", ARB, "GL_ARB_texture_buffer_object") {
        "GL_TEXTURE_BUFFER_ARB"("0x8C2A")
        "GL_MAX_TEXTURE_BUFFER_SIZE_ARB"("0x8C2B")
        "GL_TEXTURE_BINDING_BUFFER_ARB"("0x8C2C")
        "GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB"("0x8C2D")
        "GL_TEXTURE_BUFFER_FORMAT_ARB"("0x8C2E")
        "glTexBufferARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("internalFormat"),
            _root_ide_package_.overrungl.opengl.old.int("buffer")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("TextureCompression", ARB, "GL_ARB_texture_compression") {
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
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.int("internalFormat"),
            _root_ide_package_.overrungl.opengl.old.int("width"),
            _root_ide_package_.overrungl.opengl.old.int("height"),
            _root_ide_package_.overrungl.opengl.old.int("depth"),
            _root_ide_package_.overrungl.opengl.old.int("border"),
            _root_ide_package_.overrungl.opengl.old.int("imageSize"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void*")
        )
        "glCompressedTexImage2DARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.int("internalFormat"),
            _root_ide_package_.overrungl.opengl.old.int("width"),
            _root_ide_package_.overrungl.opengl.old.int("height"),
            _root_ide_package_.overrungl.opengl.old.int("border"),
            _root_ide_package_.overrungl.opengl.old.int("imageSize"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void*")
        )
        "glCompressedTexImage1DARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.int("internalFormat"),
            _root_ide_package_.overrungl.opengl.old.int("width"),
            _root_ide_package_.overrungl.opengl.old.int("border"),
            _root_ide_package_.overrungl.opengl.old.int("imageSize"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void*")
        )
        "glCompressedTexSubImage3DARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.int("xoffset"),
            _root_ide_package_.overrungl.opengl.old.int("yoffset"),
            _root_ide_package_.overrungl.opengl.old.int("zoffset"),
            _root_ide_package_.overrungl.opengl.old.int("width"),
            _root_ide_package_.overrungl.opengl.old.int("height"),
            _root_ide_package_.overrungl.opengl.old.int("depth"),
            _root_ide_package_.overrungl.opengl.old.int("format"),
            _root_ide_package_.overrungl.opengl.old.int("imageSize"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void*")
        )
        "glCompressedTexSubImage2DARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.int("xoffset"),
            _root_ide_package_.overrungl.opengl.old.int("yoffset"),
            _root_ide_package_.overrungl.opengl.old.int("width"),
            _root_ide_package_.overrungl.opengl.old.int("height"),
            _root_ide_package_.overrungl.opengl.old.int("format"),
            _root_ide_package_.overrungl.opengl.old.int("imageSize"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void*")
        )
        "glCompressedTexSubImage1DARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.int("xoffset"),
            _root_ide_package_.overrungl.opengl.old.int("width"),
            _root_ide_package_.overrungl.opengl.old.int("format"),
            _root_ide_package_.overrungl.opengl.old.int("imageSize"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void*")
        )
        "glGetCompressedTexImageARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.int("target"),
            _root_ide_package_.overrungl.opengl.old.int("level"),
            _root_ide_package_.overrungl.opengl.old.address("img", "void*")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file(
        "TextureCompressionBptc", ARB, "GL_ARB_texture_compression_bptc",
        "GL_COMPRESSED_RGBA_BPTC_UNORM_ARB" to "0x8E8C",
        "GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB" to "0x8E8D",
        "GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB" to "0x8E8E",
        "GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB" to "0x8E8F"
    )
    _root_ide_package_.overrungl.opengl.old.file(
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
    _root_ide_package_.overrungl.opengl.old.file(
        "TextureCubeMapArray", ARB, "GL_ARB_texture_cube_map_array",
        "GL_TEXTURE_CUBE_MAP_ARRAY_ARB" to "0x9009",
        "GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB" to "0x900A",
        "GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB" to "0x900B",
        "GL_SAMPLER_CUBE_MAP_ARRAY_ARB" to "0x900C",
        "GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB" to "0x900D",
        "GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB" to "0x900E",
        "GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB" to "0x900F"
    )
    _root_ide_package_.overrungl.opengl.old.file(
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
    _root_ide_package_.overrungl.opengl.old.file(
        "TextureEnvDot3", ARB, "GL_ARB_texture_env_dot3",
        "GL_DOT3_RGB_ARB" to "0x86AE",
        "GL_DOT3_RGBA_ARB" to "0x86AF"
    )
    _root_ide_package_.overrungl.opengl.old.file(
        "TextureFilterMinmax", ARB, "GL_ARB_texture_filter_minmax",
        "GL_TEXTURE_REDUCTION_MODE_ARB" to "0x9366",
        "GL_WEIGHTED_AVERAGE_ARB" to "0x9367"
    )
    _root_ide_package_.overrungl.opengl.old.file(
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
    _root_ide_package_.overrungl.opengl.old.file(
        "TextureGather", ARB, "GL_ARB_texture_gather",
        "GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB" to "0x8E5E",
        "GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB" to "0x8E5F",
        "GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB" to "0x8F9F"
    )
    _root_ide_package_.overrungl.opengl.old.file(
        "TextureMirroredRepeat", ARB, "GL_ARB_texture_mirrored_repeat",
        "GL_MIRRORED_REPEAT_ARB" to "0x8370"
    )
    _root_ide_package_.overrungl.opengl.old.file(
        "TextureRectangle", ARB, "GL_ARB_texture_rectangle",
        "GL_TEXTURE_RECTANGLE_ARB" to "0x84F5",
        "GL_TEXTURE_BINDING_RECTANGLE_ARB" to "0x84F6",
        "GL_PROXY_TEXTURE_RECTANGLE_ARB" to "0x84F7",
        "GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB" to "0x84F8"
    )
    _root_ide_package_.overrungl.opengl.old.file(
        "TransformFeedbackOverflowQuery", ARB, "GL_ARB_transform_feedback_overflow_query",
        "GL_TRANSFORM_FEEDBACK_OVERFLOW_ARB" to "0x82EC",
        "GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB" to "0x82ED"
    )
    _root_ide_package_.overrungl.opengl.old.file("TransposeMatrix", ARB, "GL_ARB_transpose_matrix") {
        "GL_TRANSPOSE_MODELVIEW_MATRIX_ARB"("0x84E3")
        "GL_TRANSPOSE_PROJECTION_MATRIX_ARB"("0x84E4")
        "GL_TRANSPOSE_TEXTURE_MATRIX_ARB"("0x84E5")
        "GL_TRANSPOSE_COLOR_MATRIX_ARB"("0x84E6")
        "glLoadTransposeMatrixfARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("m", "const GLfloat*")
        )
        "glLoadTransposeMatrixdARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("m", "const GLdouble*")
        )
        "glMultTransposeMatrixfARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("m", "const GLfloat*")
        )
        "glMultTransposeMatrixdARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("m", "const GLdouble*")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("VertexBlend", ARB, "GL_ARB_vertex_blend") {
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
        "glWeightbvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("weights", "const GLbyte*")
        )
        "glWeightsvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("weights", "const GLshort*")
        )
        "glWeightivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("weights", "const GLint*")
        )
        "glWeightfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("weights", "const GLfloat*")
        )
        "glWeightdvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("weights", "const GLdouble*")
        )
        "glWeightubvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("weights", "const GLubyte*")
        )
        "glWeightusvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("weights", "const GLushort*")
        )
        "glWeightuivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.address("weights", "const GLuint*")
        )
        "glWeightPointerARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("stride"),
            _root_ide_package_.overrungl.opengl.old.address("pointer", "const void*")
        )
        "glVertexBlendARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("count")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("VertexBufferObject", ARB, "GL_ARB_vertex_buffer_object") {
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
        "glBindBufferARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLuint("buffer")
        )
        "glDeleteBuffersARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLsizei("n"),
            _root_ide_package_.overrungl.opengl.old.address("buffers", "const GLuint*")
        )
        "glGenBuffersARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLsizei("n"),
            _root_ide_package_.overrungl.opengl.old.address("buffers", "GLuint*")
        )
        "glIsBufferARB"(
            _root_ide_package_.overrungl.opengl.old.boolean,
            _root_ide_package_.overrungl.opengl.old.GLuint("buffer")
        )
        "glBufferDataARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLsizeiptrARB("size"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void*"),
            _root_ide_package_.overrungl.opengl.old.GLenum("usage")
        )
        "glBufferSubDataARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLintptrARB("offset"),
            _root_ide_package_.overrungl.opengl.old.GLsizeiptrARB("size"),
            _root_ide_package_.overrungl.opengl.old.address("data", "const void*")
        )
        "glGetBufferSubDataARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLintptrARB("offset"),
            _root_ide_package_.overrungl.opengl.old.GLsizeiptrARB("size"),
            _root_ide_package_.overrungl.opengl.old.address("data", "void*")
        )
        "glMapBufferARB"(
            _root_ide_package_.overrungl.opengl.old.address,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("access"),
            nativeType = "void*"
        )
        "glUnmapBufferARB"(
            _root_ide_package_.overrungl.opengl.old.boolean,
            _root_ide_package_.overrungl.opengl.old.GLenum("target")
        )
        "glGetBufferParameterivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint*")
        )
        "glGetBufferPointervARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLenum("target"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "void**")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("VertexProgram", ARB, "GL_ARB_vertex_program") {
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
        "glVertexAttrib1dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("x")
        )
        "glVertexAttrib1dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glVertexAttrib1fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("x")
        )
        "glVertexAttrib1fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glVertexAttrib1sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLshort("x")
        )
        "glVertexAttrib1svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glVertexAttrib2dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("x"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("y")
        )
        "glVertexAttrib2dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glVertexAttrib2fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("x"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("y")
        )
        "glVertexAttrib2fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glVertexAttrib2sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLshort("x"),
            _root_ide_package_.overrungl.opengl.old.GLshort("y")
        )
        "glVertexAttrib2svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glVertexAttrib3dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("x"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("y"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("z")
        )
        "glVertexAttrib3dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glVertexAttrib3fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("x"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("y"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("z")
        )
        "glVertexAttrib3fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glVertexAttrib3sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLshort("x"),
            _root_ide_package_.overrungl.opengl.old.GLshort("y"),
            _root_ide_package_.overrungl.opengl.old.GLshort("z")
        )
        "glVertexAttrib3svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glVertexAttrib4NbvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLbyte *")
        )
        "glVertexAttrib4NivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLint *")
        )
        "glVertexAttrib4NsvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glVertexAttrib4NubARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLubyte("x"),
            _root_ide_package_.overrungl.opengl.old.GLubyte("y"),
            _root_ide_package_.overrungl.opengl.old.GLubyte("z"),
            _root_ide_package_.overrungl.opengl.old.GLubyte("w")
        )
        "glVertexAttrib4NubvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLubyte *")
        )
        "glVertexAttrib4NuivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLuint *")
        )
        "glVertexAttrib4NusvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLushort *")
        )
        "glVertexAttrib4bvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLbyte *")
        )
        "glVertexAttrib4dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("x"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("y"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("z"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("w")
        )
        "glVertexAttrib4dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glVertexAttrib4fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("x"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("y"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("z"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("w")
        )
        "glVertexAttrib4fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glVertexAttrib4ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLint *")
        )
        "glVertexAttrib4sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLshort("x"),
            _root_ide_package_.overrungl.opengl.old.GLshort("y"),
            _root_ide_package_.overrungl.opengl.old.GLshort("z"),
            _root_ide_package_.overrungl.opengl.old.GLshort("w")
        )
        "glVertexAttrib4svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glVertexAttrib4ubvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLubyte *")
        )
        "glVertexAttrib4uivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLuint *")
        )
        "glVertexAttrib4usvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLushort *")
        )
        "glVertexAttribPointerARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLint("size"),
            _root_ide_package_.overrungl.opengl.old.GLenum("type"),
            _root_ide_package_.overrungl.opengl.old.GLboolean("normalized"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("stride"),
            _root_ide_package_.overrungl.opengl.old.address("pointer", "const void *")
        )
        "glEnableVertexAttribArrayARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index")
        )
        "glDisableVertexAttribArrayARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index")
        )
        "glGetVertexAttribdvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLdouble *")
        )
        "glGetVertexAttribfvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLfloat *")
        )
        "glGetVertexAttribivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("params", "GLint *")
        )
        "glGetVertexAttribPointervARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLenum("pname"),
            _root_ide_package_.overrungl.opengl.old.address("pointer", "void **")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("VertexShader", ARB, "GL_ARB_vertex_shader") {
        "GL_VERTEX_SHADER_ARB"("0x8B31")
        "GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB"("0x8B4A")
        "GL_MAX_VARYING_FLOATS_ARB"("0x8B4B")
        "GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB"("0x8B4C")
        "GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB"("0x8B4D")
        "GL_OBJECT_ACTIVE_ATTRIBUTES_ARB"("0x8B89")
        "GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB"("0x8B8A")
        "glBindAttribLocationARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLhandleARB("programObj"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.address("name", "const GLcharARB *")
        )
        "glGetActiveAttribARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLhandleARB("programObj"),
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("maxLength"),
            _root_ide_package_.overrungl.opengl.old.address("length", "GLsizei *"),
            _root_ide_package_.overrungl.opengl.old.address("size", "GLint *"),
            _root_ide_package_.overrungl.opengl.old.address("type", "GLenum *"),
            _root_ide_package_.overrungl.opengl.old.address("name", "GLcharARB *")
        )
        "glGetAttribLocationARB"(
            _root_ide_package_.overrungl.opengl.old.GLint,
            _root_ide_package_.overrungl.opengl.old.GLhandleARB("programObj"),
            _root_ide_package_.overrungl.opengl.old.address("name", "const GLcharARB *")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("ViewportArray", ARB, "GL_ARB_viewport_array") {
        "glDepthRangeArraydvNV"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("first"),
            _root_ide_package_.overrungl.opengl.old.GLsizei("count"),
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glDepthRangeIndexeddNV"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLuint("index"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("n"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("f")
        )
    }
    _root_ide_package_.overrungl.opengl.old.file("WindowPos", ARB, "GL_ARB_window_pos") {
        "glWindowPos2dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLdouble("x"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("y")
        )
        "glWindowPos2dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glWindowPos2fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLfloat("x"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("y")
        )
        "glWindowPos2fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glWindowPos2iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("x"),
            _root_ide_package_.overrungl.opengl.old.GLint("y")
        )
        "glWindowPos2ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLint *")
        )
        "glWindowPos2sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLshort("x"),
            _root_ide_package_.overrungl.opengl.old.GLshort("y")
        )
        "glWindowPos2svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
        "glWindowPos3dARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLdouble("x"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("y"),
            _root_ide_package_.overrungl.opengl.old.GLdouble("z")
        )
        "glWindowPos3dvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLdouble *")
        )
        "glWindowPos3fARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLfloat("x"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("y"),
            _root_ide_package_.overrungl.opengl.old.GLfloat("z")
        )
        "glWindowPos3fvARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLfloat *")
        )
        "glWindowPos3iARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLint("x"),
            _root_ide_package_.overrungl.opengl.old.GLint("y"),
            _root_ide_package_.overrungl.opengl.old.GLint("z")
        )
        "glWindowPos3ivARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLint *")
        )
        "glWindowPos3sARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.GLshort("x"),
            _root_ide_package_.overrungl.opengl.old.GLshort("y"),
            _root_ide_package_.overrungl.opengl.old.GLshort("z")
        )
        "glWindowPos3svARB"(
            _root_ide_package_.overrungl.opengl.old.void,
            _root_ide_package_.overrungl.opengl.old.address("v", "const GLshort *")
        )
    }
}
