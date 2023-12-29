/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

import overrungl.opengl.OpenGLExt.NV
import overrungl.opengl.OpenGLExt.NVX

/**
 * @author squid233
 * @since 0.1.0
 */
fun nv() {
    file("ConditionalRender", NVX, "GL_NVX_conditional_render") {
        "glBeginConditionalRenderNVX"(void, GLuint("id"))
        "glEndConditionalRenderNVX"(void)
    }
    file(
        "GpuMemoryInfo", NVX, "GL_NVX_gpu_memory_info",
        "GL_GPU_MEMORY_INFO_DEDICATED_VIDMEM_NVX" to "0x9047",
        "GL_GPU_MEMORY_INFO_TOTAL_AVAILABLE_MEMORY_NVX" to "0x9048",
        "GL_GPU_MEMORY_INFO_CURRENT_AVAILABLE_VIDMEM_NVX" to "0x9049",
        "GL_GPU_MEMORY_INFO_EVICTION_COUNT_NVX" to "0x904A",
        "GL_GPU_MEMORY_INFO_EVICTED_MEMORY_NVX" to "0x904B"
    )
    file("GpuMulticast2", NVX, "GL_NVX_gpu_multicast2") {
        "GL_UPLOAD_GPU_MASK_NVX"("0x954A")
        "glUploadGpuMaskNVX"(void, GLbitfield("mask"))
        "glMulticastViewportArrayvNVX"(
            void,
            GLuint("gpu"),
            GLuint("first"),
            GLsizei("count"),
            address("v", "const GLfloat *")
        )
        "glMulticastViewportPositionWScaleNVX"(
            void,
            GLuint("gpu"),
            GLuint("index"),
            GLfloat("xcoeff"),
            GLfloat("ycoeff")
        )
        "glMulticastScissorArrayvNVX"(
            void,
            GLuint("gpu"),
            GLuint("first"),
            GLsizei("count"),
            address("v", "const GLint *")
        )
        "glAsyncCopyBufferSubDataNVX"(
            GLuint,
            GLsizei("waitSemaphoreCount"),
            address("waitSemaphoreArray", "const GLuint *"),
            address("fenceValueArray", "const GLuint64 *"),
            GLuint("readGpu"),
            GLbitfield("writeGpuMask"),
            GLuint("readBuffer"),
            GLuint("writeBuffer"),
            GLintptr("readOffset"),
            GLintptr("writeOffset"),
            GLsizeiptr("size"),
            GLsizei("signalSemaphoreCount"),
            address("signalSemaphoreArray", "const GLuint *"),
            address("signalValueArray", "const GLuint64 *")
        )
        "glAsyncCopyImageSubDataNVX"(
            GLuint,
            GLsizei("waitSemaphoreCount"),
            address("waitSemaphoreArray", "const GLuint *"),
            address("waitValueArray", "const GLuint64 *"),
            GLuint("srcGpu"),
            GLbitfield("dstGpuMask"),
            GLuint("srcName"),
            GLenum("srcTarget"),
            GLint("srcLevel"),
            GLint("srcX"),
            GLint("srcY"),
            GLint("srcZ"),
            GLuint("dstName"),
            GLenum("dstTarget"),
            GLint("dstLevel"),
            GLint("dstX"),
            GLint("dstY"),
            GLint("dstZ"),
            GLsizei("srcWidth"),
            GLsizei("srcHeight"),
            GLsizei("srcDepth"),
            GLsizei("signalSemaphoreCount"),
            address("signalSemaphoreArray", "const GLuint *"),
            address("signalValueArray", "const GLuint64 *")
        )
    }
    file("LinkedGpuMulticast", NVX, "GL_NVX_linked_gpu_multicast") {
        "GL_LGPU_SEPARATE_STORAGE_BIT_NVX"("0x0800")
        "GL_MAX_LGPU_GPUS_NVX"("0x92BA")
        "glLGPUNamedBufferSubDataNVX"(
            void,
            GLbitfield("gpuMask"),
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size"),
            address("data", "const void *")
        )
        "glLGPUCopyImageSubDataNVX"(
            void,
            GLuint("sourceGpu"),
            GLbitfield("destinationGpuMask"),
            GLuint("srcName"),
            GLenum("srcTarget"),
            GLint("srcLevel"),
            GLint("srcX"),
            GLint("srxY"),
            GLint("srcZ"),
            GLuint("dstName"),
            GLenum("dstTarget"),
            GLint("dstLevel"),
            GLint("dstX"),
            GLint("dstY"),
            GLint("dstZ"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth")
        )
        "glLGPUInterlockNVX"(void)
    }
    file("ProgressFence", NVX, "GL_NVX_progress_fence") {
        "glCreateProgressFenceNVX"(void)
        "glSignalSemaphoreui64NVX"(
            void,
            GLuint("signalGpu"),
            GLsizei("fenceObjectCount"),
            address("semaphoreArray", "const GLuint *"),
            address("fenceValueArray", "const GLuint64 *")
        )
        "glWaitSemaphoreui64NVX"(
            void,
            GLuint("waitGpu"),
            GLsizei("fenceObjectCount"),
            address("semaphoreArray", "const GLuint *"),
            address("fenceValueArray", "const GLuint64 *")
        )
        "glClientWaitSemaphoreui64NVX"(
            void,
            GLsizei("fenceObjectCount"),
            address("semaphoreArray", "const GLuint *"),
            address("fenceValueArray", "const GLuint64 *")
        )
    }
    file("AlphaToCoverageDitherControl", NV, "GL_NV_alpha_to_coverage_dither_control") {
        "GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV"("0x934D")
        "GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV"("0x934E")
        "GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV"("0x934F")
        "GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV"("0x92BF")
        "glAlphaToCoverageDitherControlNV"(void, GLenum("mode"))
    }
    file("BindlessMultiDrawIndirect", NV, "GL_NV_bindless_multi_draw_indirect") {
        "glMultiDrawArraysIndirectBindlessNV"(
            void,
            GLenum("mode"),
            address("indirect", "const void *"),
            GLsizei("drawCount"),
            GLsizei("stride"),
            GLint("vertexBufferCount")
        )
        "glMultiDrawElementsIndirectBindlessNV"(
            void,
            GLenum("mode"),
            GLenum("type"),
            address("indirect", "const void *"),
            GLsizei("drawCount"),
            GLsizei("stride"),
            GLint("vertexBufferCount")
        )
    }
    file("BindlessMultiDrawIndirectCount", NV, "GL_NV_bindless_multi_draw_indirect_count") {
        "glMultiDrawArraysIndirectBindlessCountNV"(
            void,
            GLenum("mode"),
            address("indirect", "const void *"),
            GLsizei("drawCount"),
            GLsizei("maxDrawCount"),
            GLsizei("stride"),
            GLint("vertexBufferCount")
        )
        "glMultiDrawElementsIndirectBindlessCountNV"(
            void,
            GLenum("mode"),
            GLenum("type"),
            address("indirect", "const void *"),
            GLsizei("drawCount"),
            GLsizei("maxDrawCount"),
            GLsizei("stride"),
            GLint("vertexBufferCount")
        )
    }
    file("BindlessTexture", NV, "GL_NV_bindless_texture") {
        "glGetTextureHandleNV"(GLuint64, GLuint("texture"))
        "glGetTextureSamplerHandleNV"(GLuint64, GLuint("texture"), GLuint("sampler"))
        "glMakeTextureHandleResidentNV"(void, GLuint64("handle"))
        "glMakeTextureHandleNonResidentNV"(void, GLuint64("handle"))
        "glGetImageHandleNV"(
            GLuint64,
            GLuint("texture"),
            GLint("level"),
            GLboolean("layered"),
            GLint("layer"),
            GLenum("format")
        )
        "glMakeImageHandleResidentNV"(void, GLuint64("handle"), GLenum("access"))
        "glMakeImageHandleNonResidentNV"(void, GLuint64("handle"))
        "glUniformHandleui64NV"(void, GLint("location"), GLuint64("value"))
        "glUniformHandleui64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64 *"))
        "glProgramUniformHandleui64NV"(void, GLuint("program"), GLint("location"), GLuint64("value"))
        "glProgramUniformHandleui64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("values", "const GLuint64 *")
        )
        "glIsTextureHandleResidentNV"(GLboolean, GLuint64("handle"))
        "glIsImageHandleResidentNV"(GLboolean, GLuint64("handle"))
    }
    file("BlendEquationAdvanced", NV, "GL_NV_blend_equation_advanced") {
        "GL_BLEND_OVERLAP_NV"("0x9281")
        "GL_BLEND_PREMULTIPLIED_SRC_NV"("0x9280")
        "GL_BLUE_NV"("0x1905")
        "GL_COLORBURN_NV"("0x929A")
        "GL_COLORDODGE_NV"("0x9299")
        "GL_CONJOINT_NV"("0x9284")
        "GL_CONTRAST_NV"("0x92A1")
        "GL_DARKEN_NV"("0x9297")
        "GL_DIFFERENCE_NV"("0x929E")
        "GL_DISJOINT_NV"("0x9283")
        "GL_DST_ATOP_NV"("0x928F")
        "GL_DST_IN_NV"("0x928B")
        "GL_DST_NV"("0x9287")
        "GL_DST_OUT_NV"("0x928D")
        "GL_DST_OVER_NV"("0x9289")
        "GL_EXCLUSION_NV"("0x92A0")
        "GL_GREEN_NV"("0x1904")
        "GL_HARDLIGHT_NV"("0x929B")
        "GL_HARDMIX_NV"("0x92A9")
        "GL_HSL_COLOR_NV"("0x92AF")
        "GL_HSL_HUE_NV"("0x92AD")
        "GL_HSL_LUMINOSITY_NV"("0x92B0")
        "GL_HSL_SATURATION_NV"("0x92AE")
        "GL_INVERT_OVG_NV"("0x92B4")
        "GL_INVERT_RGB_NV"("0x92A3")
        "GL_LIGHTEN_NV"("0x9298")
        "GL_LINEARBURN_NV"("0x92A5")
        "GL_LINEARDODGE_NV"("0x92A4")
        "GL_LINEARLIGHT_NV"("0x92A7")
        "GL_MINUS_CLAMPED_NV"("0x92B3")
        "GL_MINUS_NV"("0x929F")
        "GL_MULTIPLY_NV"("0x9294")
        "GL_OVERLAY_NV"("0x9296")
        "GL_PINLIGHT_NV"("0x92A8")
        "GL_PLUS_CLAMPED_ALPHA_NV"("0x92B2")
        "GL_PLUS_CLAMPED_NV"("0x92B1")
        "GL_PLUS_DARKER_NV"("0x9292")
        "GL_PLUS_NV"("0x9291")
        "GL_RED_NV"("0x1903")
        "GL_SCREEN_NV"("0x9295")
        "GL_SOFTLIGHT_NV"("0x929C")
        "GL_SRC_ATOP_NV"("0x928E")
        "GL_SRC_IN_NV"("0x928A")
        "GL_SRC_NV"("0x9286")
        "GL_SRC_OUT_NV"("0x928C")
        "GL_SRC_OVER_NV"("0x9288")
        "GL_UNCORRELATED_NV"("0x9282")
        "GL_VIVIDLIGHT_NV"("0x92A6")
        "GL_XOR_NV"("0x1506")
        "glBlendParameteriNV"(void, GLenum("pname"), GLint("value"))
        "glBlendBarrierNV"(void)
    }
    file(
        "BlendEquationAdvancedCoherent",
        NV,
        "GL_NV_blend_equation_advanced_coherent",
        "GL_BLEND_ADVANCED_COHERENT_NV" to "0x9285"
    )
    file("ClipSpaceWScaling", NV, "GL_NV_clip_space_w_scaling") {
        "GL_VIEWPORT_POSITION_W_SCALE_NV"("0x937C")
        "GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV"("0x937D")
        "GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV"("0x937E")
        "glViewportPositionWScaleNV"(void, GLuint("index"), GLfloat("xcoeff"), GLfloat("ycoeff"))
    }
    file("CommandList", NV, "GL_NV_command_list") {
        "GL_TERMINATE_SEQUENCE_COMMAND_NV"("0x0000")
        "GL_NOP_COMMAND_NV"("0x0001")
        "GL_DRAW_ELEMENTS_COMMAND_NV"("0x0002")
        "GL_DRAW_ARRAYS_COMMAND_NV"("0x0003")
        "GL_DRAW_ELEMENTS_STRIP_COMMAND_NV"("0x0004")
        "GL_DRAW_ARRAYS_STRIP_COMMAND_NV"("0x0005")
        "GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV"("0x0006")
        "GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV"("0x0007")
        "GL_ELEMENT_ADDRESS_COMMAND_NV"("0x0008")
        "GL_ATTRIBUTE_ADDRESS_COMMAND_NV"("0x0009")
        "GL_UNIFORM_ADDRESS_COMMAND_NV"("0x000A")
        "GL_BLEND_COLOR_COMMAND_NV"("0x000B")
        "GL_STENCIL_REF_COMMAND_NV"("0x000C")
        "GL_LINE_WIDTH_COMMAND_NV"("0x000D")
        "GL_POLYGON_OFFSET_COMMAND_NV"("0x000E")
        "GL_ALPHA_REF_COMMAND_NV"("0x000F")
        "GL_VIEWPORT_COMMAND_NV"("0x0010")
        "GL_SCISSOR_COMMAND_NV"("0x0011")
        "GL_FRONT_FACE_COMMAND_NV"("0x0012")
        "glCreateStatesNV"(void, GLsizei("n"), address("states", "GLuint *"))
        "glDeleteStatesNV"(void, GLsizei("n"), address("states", "const GLuint *"))
        "glIsStateNV"(GLboolean, GLuint("state"))
        "glStateCaptureNV"(void, GLuint("state"), GLenum("mode"))
        "glGetCommandHeaderNV"(GLuint, GLenum("tokenID"), GLuint("size"))
        "glGetStageIndexNV"(GLushort, GLenum("shadertype"))
        "glDrawCommandsNV"(
            void,
            GLenum("primitiveMode"),
            GLuint("buffer"),
            address("indirects", "const GLintptr *"),
            address("sizes", "const GLsizei *"),
            GLuint("count")
        )
        "glDrawCommandsAddressNV"(
            void,
            GLenum("primitiveMode"),
            address("indirects", "const GLuint64 *"),
            address("sizes", "const GLsizei *"),
            GLuint("count")
        )
        "glDrawCommandsStatesNV"(
            void,
            GLuint("buffer"),
            address("indirects", "const GLintptr *"),
            address("sizes", "const GLsizei *"),
            address("states", "const GLuint *"),
            address("fbos", "const GLuint *"),
            GLuint("count")
        )
        "glDrawCommandsStatesAddressNV"(
            void,
            address("indirects", "const GLuint64 *"),
            address("sizes", "const GLsizei *"),
            address("states", "const GLuint *"),
            address("fbos", "const GLuint *"),
            GLuint("count")
        )
        "glCreateCommandListsNV"(void, GLsizei("n"), address("lists", "GLuint *"))
        "glDeleteCommandListsNV"(void, GLsizei("n"), address("lists", "const GLuint *"))
        "glIsCommandListNV"(GLboolean, GLuint("list"))
        "glListDrawCommandsStatesClientNV"(
            void,
            GLuint("list"),
            GLuint("segment"),
            address("indirects", "const void **"),
            address("sizes", "const GLsizei *"),
            address("states", "const GLuint *"),
            address("fbos", "const GLuint *"),
            GLuint("count")
        )
        "glCommandListSegmentsNV"(void, GLuint("list"), GLuint("segments"))
        "glCompileCommandListNV"(void, GLuint("list"))
        "glCallCommandListNV"(void, GLuint("list"))
    }
    file(
        "ComputeProgram5", NV, "GL_NV_compute_program5",
        "GL_COMPUTE_PROGRAM_NV" to "0x90FB",
        "GL_COMPUTE_PROGRAM_PARAMETER_BUFFER_NV" to "0x90FC"
    )
    file("ConditionalRender", NV, "GL_NV_conditional_render") {
        "GL_QUERY_WAIT_NV"("0x8E13")
        "GL_QUERY_NO_WAIT_NV"("0x8E14")
        "GL_QUERY_BY_REGION_WAIT_NV"("0x8E15")
        "GL_QUERY_BY_REGION_NO_WAIT_NV"("0x8E16")
        "glBeginConditionalRenderNV"(void, GLuint("id"), GLenum("mode"))
        "glEndConditionalRenderNV"(void)
    }
    file("ConservativeRaster", NV, "GL_NV_conservative_raster") {
        "GL_CONSERVATIVE_RASTERIZATION_NV"("0x9346")
        "GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV"("0x9347")
        "GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV"("0x9348")
        "GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV"("0x9349")
        "glSubpixelPrecisionBiasNV"(void, GLuint("xbits"), GLuint("ybits"))
    }
    file("ConservativeRasterDilate", NV, "GL_NV_conservative_raster_dilate") {
        "GL_CONSERVATIVE_RASTER_DILATE_NV"("0x9379")
        "GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV"("0x937A")
        "GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV"("0x937B")
        "glConservativeRasterParameterfNV"(void, GLenum("pname"), GLfloat("value"))
    }
    file(
        "ConservativeRasterPreSnap",
        NV,
        "GL_NV_conservative_raster_pre_snap",
        "GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_NV" to "0x9550"
    )
    file("ConservativeRasterPreSnapTriangles", NV, "GL_NV_conservative_raster_pre_snap_triangles") {
        "GL_CONSERVATIVE_RASTER_MODE_NV"("0x954D")
        "GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV"("0x954E")
        "GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV"("0x954F")
        "glConservativeRasterParameteriNV"(void, GLenum("pname"), GLint("param"))
    }
    file(
        "CopyDepthToColor", NV, "GL_NV_copy_depth_to_color",
        "GL_DEPTH_STENCIL_TO_RGBA_NV" to "0x886E",
        "GL_DEPTH_STENCIL_TO_BGRA_NV" to "0x886F"
    )
    file("CopyImage", NV, "GL_NV_copy_image") {
        "glCopyImageSubDataNV"(
            void,
            GLuint("srcName"),
            GLenum("srcTarget"),
            GLint("srcLevel"),
            GLint("srcX"),
            GLint("srcY"),
            GLint("srcZ"),
            GLuint("dstName"),
            GLenum("dstTarget"),
            GLint("dstLevel"),
            GLint("dstX"),
            GLint("dstY"),
            GLint("dstZ"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth")
        )
    }
    file(
        "DeepTexture3D", NV, "GL_NV_deep_texture3D",
        "GL_MAX_DEEP_3D_TEXTURE_WIDTH_HEIGHT_NV" to "0x90D0",
        "GL_MAX_DEEP_3D_TEXTURE_DEPTH_NV" to "0x90D1"
    )
    file("DepthBufferFloat", NV, "GL_NV_depth_buffer_float") {
        "GL_DEPTH_COMPONENT32F_NV"("0x8DAB")
        "GL_DEPTH32F_STENCIL8_NV"("0x8DAC")
        "GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV"("0x8DAD")
        "GL_DEPTH_BUFFER_FLOAT_MODE_NV"("0x8DAF")
        "glDepthRangedNV"(void, GLdouble("zNear"), GLdouble("zFar"))
        "glClearDepthdNV"(void, GLdouble("depth"))
        "glDepthBoundsdNV"(void, GLdouble("zmin"), GLdouble("zmax"))
    }
    file("DepthClamp", NV, "GL_NV_depth_clamp", "GL_DEPTH_CLAMP_NV" to "0x864F")
    file("DrawTexture", NV, "GL_NV_draw_texture") {
        "glDrawTextureNV"(
            void,
            GLuint("texture"),
            GLuint("sampler"),
            GLfloat("x0"),
            GLfloat("y0"),
            GLfloat("x1"),
            GLfloat("y1"),
            GLfloat("z"),
            GLfloat("s0"),
            GLfloat("t0"),
            GLfloat("s1"),
            GLfloat("t1")
        )
    }
    file("DrawVulkanImage", NV, "GL_NV_draw_vulkan_image") {
        "glDrawVkImageNV"(
            void,
            GLuint64("vkImage"),
            GLuint("sampler"),
            GLfloat("x0"),
            GLfloat("y0"),
            GLfloat("x1"),
            GLfloat("y1"),
            GLfloat("z"),
            GLfloat("s0"),
            GLfloat("t0"),
            GLfloat("s1"),
            GLfloat("t1")
        )
        "glGetVkProcAddrNV"(address, address("name", "const GLchar *"), nativeType = "GLVULKANPROCNV")
        "glWaitVkSemaphoreNV"(void, GLuint64("vkSemaphore"))
        "glSignalVkSemaphoreNV"(void, GLuint64("vkSemaphore"))
        "glSignalVkFenceNV"(void, GLuint64("vkFence"))
    }
    file("Evaluators", NV, "GL_NV_evaluators") {
        "GL_EVAL_2D_NV"("0x86C0")
        "GL_EVAL_TRIANGULAR_2D_NV"("0x86C1")
        "GL_MAP_TESSELLATION_NV"("0x86C2")
        "GL_MAP_ATTRIB_U_ORDER_NV"("0x86C3")
        "GL_MAP_ATTRIB_V_ORDER_NV"("0x86C4")
        "GL_EVAL_FRACTIONAL_TESSELLATION_NV"("0x86C5")
        "GL_EVAL_VERTEX_ATTRIB0_NV"("0x86C6")
        "GL_EVAL_VERTEX_ATTRIB1_NV"("0x86C7")
        "GL_EVAL_VERTEX_ATTRIB2_NV"("0x86C8")
        "GL_EVAL_VERTEX_ATTRIB3_NV"("0x86C9")
        "GL_EVAL_VERTEX_ATTRIB4_NV"("0x86CA")
        "GL_EVAL_VERTEX_ATTRIB5_NV"("0x86CB")
        "GL_EVAL_VERTEX_ATTRIB6_NV"("0x86CC")
        "GL_EVAL_VERTEX_ATTRIB7_NV"("0x86CD")
        "GL_EVAL_VERTEX_ATTRIB8_NV"("0x86CE")
        "GL_EVAL_VERTEX_ATTRIB9_NV"("0x86CF")
        "GL_EVAL_VERTEX_ATTRIB10_NV"("0x86D0")
        "GL_EVAL_VERTEX_ATTRIB11_NV"("0x86D1")
        "GL_EVAL_VERTEX_ATTRIB12_NV"("0x86D2")
        "GL_EVAL_VERTEX_ATTRIB13_NV"("0x86D3")
        "GL_EVAL_VERTEX_ATTRIB14_NV"("0x86D4")
        "GL_EVAL_VERTEX_ATTRIB15_NV"("0x86D5")
        "GL_MAX_MAP_TESSELLATION_NV"("0x86D6")
        "GL_MAX_RATIONAL_EVAL_ORDER_NV"("0x86D7")
        "glMapControlPointsNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLenum("type"),
            GLsizei("ustride"),
            GLsizei("vstride"),
            GLint("uorder"),
            GLint("vorder"),
            GLboolean("packed"),
            address("points", "const void *")
        )
        "glMapParameterivNV"(void, GLenum("target"), GLenum("pname"), address("params", "const GLint *"))
        "glMapParameterfvNV"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfloat *"))
        "glGetMapControlPointsNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLenum("type"),
            GLsizei("ustride"),
            GLsizei("vstride"),
            GLboolean("packed"),
            address("points", "void *")
        )
        "glGetMapParameterivNV"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetMapParameterfvNV"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetMapAttribParameterivNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetMapAttribParameterfvNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glEvalMapsNV"(void, GLenum("target"), GLenum("mode"))
    }
    file("ExplicitMultisample", NV, "GL_NV_explicit_multisample") {
        "GL_SAMPLE_POSITION_NV"("0x8E50")
        "GL_SAMPLE_MASK_NV"("0x8E51")
        "GL_SAMPLE_MASK_VALUE_NV"("0x8E52")
        "GL_TEXTURE_BINDING_RENDERBUFFER_NV"("0x8E53")
        "GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV"("0x8E54")
        "GL_TEXTURE_RENDERBUFFER_NV"("0x8E55")
        "GL_SAMPLER_RENDERBUFFER_NV"("0x8E56")
        "GL_INT_SAMPLER_RENDERBUFFER_NV"("0x8E57")
        "GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV"("0x8E58")
        "GL_MAX_SAMPLE_MASK_WORDS_NV"("0x8E59")
        "glGetMultisamplefvNV"(void, GLenum("pname"), GLuint("index"), address("val", "GLfloat *"))
        "glSampleMaskIndexedNV"(void, GLuint("index"), GLbitfield("mask"))
        "glTexRenderbufferNV"(void, GLenum("target"), GLuint("renderbuffer"))
    }
    file("Fence", NV, "GL_NV_fence") {
        "GL_ALL_COMPLETED_NV"("0x84F2")
        "GL_FENCE_STATUS_NV"("0x84F3")
        "GL_FENCE_CONDITION_NV"("0x84F4")
        "glDeleteFencesNV"(void, GLsizei("n"), address("fences", "const GLuint *"))
        "glGenFencesNV"(void, GLsizei("n"), address("fences", "GLuint *"))
        "glIsFenceNV"(GLboolean, GLuint("fence"))
        "glTestFenceNV"(GLboolean, GLuint("fence"))
        "glGetFenceivNV"(void, GLuint("fence"), GLenum("pname"), address("params", "GLint *"))
        "glFinishFenceNV"(void, GLuint("fence"))
        "glSetFenceNV"(void, GLuint("fence"), GLenum("condition"))
    }
    file("FillRectangle", NV, "GL_NV_fill_rectangle", "GL_FILL_RECTANGLE_NV" to "0x933C")
    file(
        "FloatBuffer", NV, "GL_NV_float_buffer",
        "GL_FLOAT_R_NV" to "0x8880",
        "GL_FLOAT_RG_NV" to "0x8881",
        "GL_FLOAT_RGB_NV" to "0x8882",
        "GL_FLOAT_RGBA_NV" to "0x8883",
        "GL_FLOAT_R16_NV" to "0x8884",
        "GL_FLOAT_R32_NV" to "0x8885",
        "GL_FLOAT_RG16_NV" to "0x8886",
        "GL_FLOAT_RG32_NV" to "0x8887",
        "GL_FLOAT_RGB16_NV" to "0x8888",
        "GL_FLOAT_RGB32_NV" to "0x8889",
        "GL_FLOAT_RGBA16_NV" to "0x888A",
        "GL_FLOAT_RGBA32_NV" to "0x888B",
        "GL_TEXTURE_FLOAT_COMPONENTS_NV" to "0x888C",
        "GL_FLOAT_CLEAR_COLOR_VALUE_NV" to "0x888D",
        "GL_FLOAT_RGBA_MODE_NV" to "0x888E"
    )
    file(
        "FogDistance", NV, "GL_NV_fog_distance",
        "GL_FOG_DISTANCE_MODE_NV" to "0x855A",
        "GL_EYE_RADIAL_NV" to "0x855B",
        "GL_EYE_PLANE_ABSOLUTE_NV" to "0x855C"
    )
    file("FragmentCoverageToColor", NV, "GL_NV_fragment_coverage_to_color") {
        "GL_FRAGMENT_COVERAGE_TO_COLOR_NV"("0x92DD")
        "GL_FRAGMENT_COVERAGE_COLOR_NV"("0x92DE")
        "glFragmentCoverageColorNV"(void, GLuint("color"))
    }
    file("FragmentProgram", NV, "GL_NV_fragment_program") {
        "GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV"("0x8868")
        "GL_FRAGMENT_PROGRAM_NV"("0x8870")
        "GL_MAX_TEXTURE_COORDS_NV"("0x8871")
        "GL_MAX_TEXTURE_IMAGE_UNITS_NV"("0x8872")
        "GL_FRAGMENT_PROGRAM_BINDING_NV"("0x8873")
        "GL_PROGRAM_ERROR_STRING_NV"("0x8874")
        "glProgramNamedParameter4fNV"(
            void,
            GLuint("id"),
            GLsizei("len"),
            address("name", "const GLubyte *"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z"),
            GLfloat("w")
        )
        "glProgramNamedParameter4fvNV"(
            void,
            GLuint("id"),
            GLsizei("len"),
            address("name", "const GLubyte *"),
            address("v", "const GLfloat *")
        )
        "glProgramNamedParameter4dNV"(
            void,
            GLuint("id"),
            GLsizei("len"),
            address("name", "const GLubyte *"),
            GLdouble("x"),
            GLdouble("y"),
            GLdouble("z"),
            GLdouble("w")
        )
        "glProgramNamedParameter4dvNV"(
            void,
            GLuint("id"),
            GLsizei("len"),
            address("name", "const GLubyte *"),
            address("v", "const GLdouble *")
        )
        "glGetProgramNamedParameterfvNV"(
            void,
            GLuint("id"),
            GLsizei("len"),
            address("name", "const GLubyte *"),
            address("params", "GLfloat *")
        )
        "glGetProgramNamedParameterdvNV"(
            void,
            GLuint("id"),
            GLsizei("len"),
            address("name", "const GLubyte *"),
            address("params", "GLdouble *")
        )
    }
    file(
        "FragmentProgram2", NV, "GL_NV_fragment_program2",
        "GL_MAX_PROGRAM_EXEC_INSTRUCTIONS_NV" to "0x88F4",
        "GL_MAX_PROGRAM_CALL_DEPTH_NV" to "0x88F5",
        "GL_MAX_PROGRAM_IF_DEPTH_NV" to "0x88F6",
        "GL_MAX_PROGRAM_LOOP_DEPTH_NV" to "0x88F7",
        "GL_MAX_PROGRAM_LOOP_COUNT_NV" to "0x88F8"
    )
    file("FramebufferMixedSamples", NV, "GL_NV_framebuffer_mixed_samples") {
        "GL_COVERAGE_MODULATION_TABLE_NV"("0x9331")
        "GL_COLOR_SAMPLES_NV"("0x8E20")
        "GL_DEPTH_SAMPLES_NV"("0x932D")
        "GL_STENCIL_SAMPLES_NV"("0x932E")
        "GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV"("0x932F")
        "GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV"("0x9330")
        "GL_COVERAGE_MODULATION_NV"("0x9332")
        "GL_COVERAGE_MODULATION_TABLE_SIZE_NV"("0x9333")
        "glCoverageModulationTableNV"(void, GLsizei("n"), address("v", "const GLfloat *"))
        "glGetCoverageModulationTableNV"(void, GLsizei("bufSize"), address("v", "GLfloat *"))
        "glCoverageModulationNV"(void, GLenum("components"))
    }
    file("FramebufferMultisampleCoverage", NV, "GL_NV_framebuffer_multisample_coverage") {
        "GL_RENDERBUFFER_COVERAGE_SAMPLES_NV"("0x8CAB")
        "GL_RENDERBUFFER_COLOR_SAMPLES_NV"("0x8E10")
        "GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV"("0x8E11")
        "GL_MULTISAMPLE_COVERAGE_MODES_NV"("0x8E12")
        "glRenderbufferStorageMultisampleCoverageNV"(
            void,
            GLenum("target"),
            GLsizei("coverageSamples"),
            GLsizei("colorSamples"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
    }
    file("GeometryProgram4", NV, "GL_NV_geometry_program4") {
        "GL_GEOMETRY_PROGRAM_NV"("0x8C26")
        "GL_MAX_PROGRAM_OUTPUT_VERTICES_NV"("0x8C27")
        "GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV"("0x8C28")
        "glProgramVertexLimitNV"(void, GLenum("target"), GLint("limit"))
        "glFramebufferTextureEXT"(void, GLenum("target"), GLenum("attachment"), GLuint("texture"), GLint("level"))
        "glFramebufferTextureFaceEXT"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLuint("texture"),
            GLint("level"),
            GLenum("face")
        )
    }
    file("GpuMulticast", NV, "GL_NV_gpu_multicast") {
        "GL_PER_GPU_STORAGE_BIT_NV"("0x0800")
        "GL_MULTICAST_GPUS_NV"("0x92BA")
        "GL_RENDER_GPU_MASK_NV"("0x9558")
        "GL_PER_GPU_STORAGE_NV"("0x9548")
        "GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV"("0x9549")
        "glRenderGpuMaskNV"(void, GLbitfield("mask"))
        "glMulticastBufferSubDataNV"(
            void,
            GLbitfield("gpuMask"),
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size"),
            address("data", "const void *")
        )
        "glMulticastCopyBufferSubDataNV"(
            void,
            GLuint("readGpu"),
            GLbitfield("writeGpuMask"),
            GLuint("readBuffer"),
            GLuint("writeBuffer"),
            GLintptr("readOffset"),
            GLintptr("writeOffset"),
            GLsizeiptr("size")
        )
        "glMulticastCopyImageSubDataNV"(
            void,
            GLuint("srcGpu"),
            GLbitfield("dstGpuMask"),
            GLuint("srcName"),
            GLenum("srcTarget"),
            GLint("srcLevel"),
            GLint("srcX"),
            GLint("srcY"),
            GLint("srcZ"),
            GLuint("dstName"),
            GLenum("dstTarget"),
            GLint("dstLevel"),
            GLint("dstX"),
            GLint("dstY"),
            GLint("dstZ"),
            GLsizei("srcWidth"),
            GLsizei("srcHeight"),
            GLsizei("srcDepth")
        )
        "glMulticastBlitFramebufferNV"(
            void,
            GLuint("srcGpu"),
            GLuint("dstGpu"),
            GLint("srcX0"),
            GLint("srcY0"),
            GLint("srcX1"),
            GLint("srcY1"),
            GLint("dstX0"),
            GLint("dstY0"),
            GLint("dstX1"),
            GLint("dstY1"),
            GLbitfield("mask"),
            GLenum("filter")
        )
        "glMulticastFramebufferSampleLocationsfvNV"(
            void,
            GLuint("gpu"),
            GLuint("framebuffer"),
            GLuint("start"),
            GLsizei("count"),
            address("v", "const GLfloat *")
        )
        "glMulticastBarrierNV"(void)
        "glMulticastWaitSyncNV"(void, GLuint("signalGpu"), GLbitfield("waitGpuMask"))
        "glMulticastGetQueryObjectivNV"(
            void,
            GLuint("gpu"),
            GLuint("id"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glMulticastGetQueryObjectuivNV"(
            void,
            GLuint("gpu"),
            GLuint("id"),
            GLenum("pname"),
            address("params", "GLuint *")
        )
        "glMulticastGetQueryObjecti64vNV"(
            void,
            GLuint("gpu"),
            GLuint("id"),
            GLenum("pname"),
            address("params", "GLint64 *")
        )
        "glMulticastGetQueryObjectui64vNV"(
            void,
            GLuint("gpu"),
            GLuint("id"),
            GLenum("pname"),
            address("params", "GLuint64 *")
        )
    }
    file("GpuProgram4", NV, "GL_NV_gpu_program4") {
        "GL_MIN_PROGRAM_TEXEL_OFFSET_NV"("0x8904")
        "GL_MAX_PROGRAM_TEXEL_OFFSET_NV"("0x8905")
        "GL_PROGRAM_ATTRIB_COMPONENTS_NV"("0x8906")
        "GL_PROGRAM_RESULT_COMPONENTS_NV"("0x8907")
        "GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV"("0x8908")
        "GL_MAX_PROGRAM_RESULT_COMPONENTS_NV"("0x8909")
        "GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV"("0x8DA5")
        "GL_MAX_PROGRAM_GENERIC_RESULTS_NV"("0x8DA6")
        "glProgramLocalParameterI4iNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLint("x"),
            GLint("y"),
            GLint("z"),
            GLint("w")
        )
        "glProgramLocalParameterI4ivNV"(void, GLenum("target"), GLuint("index"), address("params", "const GLint *"))
        "glProgramLocalParametersI4ivNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLint *")
        )
        "glProgramLocalParameterI4uiNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLuint("x"),
            GLuint("y"),
            GLuint("z"),
            GLuint("w")
        )
        "glProgramLocalParameterI4uivNV"(void, GLenum("target"), GLuint("index"), address("params", "const GLuint *"))
        "glProgramLocalParametersI4uivNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLuint *")
        )
        "glProgramEnvParameterI4iNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLint("x"),
            GLint("y"),
            GLint("z"),
            GLint("w")
        )
        "glProgramEnvParameterI4ivNV"(void, GLenum("target"), GLuint("index"), address("params", "const GLint *"))
        "glProgramEnvParametersI4ivNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLint *")
        )
        "glProgramEnvParameterI4uiNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLuint("x"),
            GLuint("y"),
            GLuint("z"),
            GLuint("w")
        )
        "glProgramEnvParameterI4uivNV"(void, GLenum("target"), GLuint("index"), address("params", "const GLuint *"))
        "glProgramEnvParametersI4uivNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLuint *")
        )
        "glGetProgramLocalParameterIivNV"(void, GLenum("target"), GLuint("index"), address("params", "GLint *"))
        "glGetProgramLocalParameterIuivNV"(void, GLenum("target"), GLuint("index"), address("params", "GLuint *"))
        "glGetProgramEnvParameterIivNV"(void, GLenum("target"), GLuint("index"), address("params", "GLint *"))
        "glGetProgramEnvParameterIuivNV"(void, GLenum("target"), GLuint("index"), address("params", "GLuint *"))
    }
    file("GpuProgram5", NV, "GL_NV_gpu_program5") {
        "GL_MAX_GEOMETRY_PROGRAM_INVOCATIONS_NV"("0x8E5A")
        "GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_NV"("0x8E5B")
        "GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_NV"("0x8E5C")
        "GL_FRAGMENT_PROGRAM_INTERPOLATION_OFFSET_BITS_NV"("0x8E5D")
        "GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_NV"("0x8E5E")
        "GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_NV"("0x8E5F")
        "GL_MAX_PROGRAM_SUBROUTINE_PARAMETERS_NV"("0x8F44")
        "GL_MAX_PROGRAM_SUBROUTINE_NUM_NV"("0x8F45")
        "glProgramSubroutineParametersuivNV"(
            void,
            GLenum("target"),
            GLsizei("count"),
            address("params", "const GLuint *")
        )
        "glGetProgramSubroutineParameteruivNV"(void, GLenum("target"), GLuint("index"), address("param", "GLuint *"))
    }
    file("HalfFloat", NV, "GL_NV_half_float") {
        "GL_HALF_FLOAT_NV"("0x140B")
        "glVertex2hNV"(void, GLhalfNV("x"), GLhalfNV("y"))
        "glVertex2hvNV"(void, address("v", "const GLhalfNV *"))
        "glVertex3hNV"(void, GLhalfNV("x"), GLhalfNV("y"), GLhalfNV("z"))
        "glVertex3hvNV"(void, address("v", "const GLhalfNV *"))
        "glVertex4hNV"(void, GLhalfNV("x"), GLhalfNV("y"), GLhalfNV("z"), GLhalfNV("w"))
        "glVertex4hvNV"(void, address("v", "const GLhalfNV *"))
        "glNormal3hNV"(void, GLhalfNV("nx"), GLhalfNV("ny"), GLhalfNV("nz"))
        "glNormal3hvNV"(void, address("v", "const GLhalfNV *"))
        "glColor3hNV"(void, GLhalfNV("red"), GLhalfNV("green"), GLhalfNV("blue"))
        "glColor3hvNV"(void, address("v", "const GLhalfNV *"))
        "glColor4hNV"(void, GLhalfNV("red"), GLhalfNV("green"), GLhalfNV("blue"), GLhalfNV("alpha"))
        "glColor4hvNV"(void, address("v", "const GLhalfNV *"))
        "glTexCoord1hNV"(void, GLhalfNV("s"))
        "glTexCoord1hvNV"(void, address("v", "const GLhalfNV *"))
        "glTexCoord2hNV"(void, GLhalfNV("s"), GLhalfNV("t"))
        "glTexCoord2hvNV"(void, address("v", "const GLhalfNV *"))
        "glTexCoord3hNV"(void, GLhalfNV("s"), GLhalfNV("t"), GLhalfNV("r"))
        "glTexCoord3hvNV"(void, address("v", "const GLhalfNV *"))
        "glTexCoord4hNV"(void, GLhalfNV("s"), GLhalfNV("t"), GLhalfNV("r"), GLhalfNV("q"))
        "glTexCoord4hvNV"(void, address("v", "const GLhalfNV *"))
        "glMultiTexCoord1hNV"(void, GLenum("target"), GLhalfNV("s"))
        "glMultiTexCoord1hvNV"(void, GLenum("target"), address("v", "const GLhalfNV *"))
        "glMultiTexCoord2hNV"(void, GLenum("target"), GLhalfNV("s"), GLhalfNV("t"))
        "glMultiTexCoord2hvNV"(void, GLenum("target"), address("v", "const GLhalfNV *"))
        "glMultiTexCoord3hNV"(void, GLenum("target"), GLhalfNV("s"), GLhalfNV("t"), GLhalfNV("r"))
        "glMultiTexCoord3hvNV"(void, GLenum("target"), address("v", "const GLhalfNV *"))
        "glMultiTexCoord4hNV"(void, GLenum("target"), GLhalfNV("s"), GLhalfNV("t"), GLhalfNV("r"), GLhalfNV("q"))
        "glMultiTexCoord4hvNV"(void, GLenum("target"), address("v", "const GLhalfNV *"))
        "glVertexAttrib1hNV"(void, GLuint("index"), GLhalfNV("x"))
        "glVertexAttrib1hvNV"(void, GLuint("index"), address("v", "const GLhalfNV *"))
        "glVertexAttrib2hNV"(void, GLuint("index"), GLhalfNV("x"), GLhalfNV("y"))
        "glVertexAttrib2hvNV"(void, GLuint("index"), address("v", "const GLhalfNV *"))
        "glVertexAttrib3hNV"(void, GLuint("index"), GLhalfNV("x"), GLhalfNV("y"), GLhalfNV("z"))
        "glVertexAttrib3hvNV"(void, GLuint("index"), address("v", "const GLhalfNV *"))
        "glVertexAttrib4hNV"(void, GLuint("index"), GLhalfNV("x"), GLhalfNV("y"), GLhalfNV("z"), GLhalfNV("w"))
        "glVertexAttrib4hvNV"(void, GLuint("index"), address("v", "const GLhalfNV *"))
        "glVertexAttribs1hvNV"(void, GLuint("index"), GLsizei("n"), address("v", "const GLhalfNV *"))
        "glVertexAttribs2hvNV"(void, GLuint("index"), GLsizei("n"), address("v", "const GLhalfNV *"))
        "glVertexAttribs3hvNV"(void, GLuint("index"), GLsizei("n"), address("v", "const GLhalfNV *"))
        "glVertexAttribs4hvNV"(void, GLuint("index"), GLsizei("n"), address("v", "const GLhalfNV *"))
        "glFogCoordhNV"(void, GLhalfNV("fog"))
        "glFogCoordhvNV"(void, address("fog", "const GLhalfNV *"))
        "glSecondaryColor3hNV"(void, GLhalfNV("red"), GLhalfNV("green"), GLhalfNV("blue"))
        "glSecondaryColor3hvNV"(void, address("v", "const GLhalfNV *"))
        "glVertexWeighthNV"(void, GLhalfNV("weight"))
        "glVertexWeighthvNV"(void, address("weight", "const GLhalfNV *"))
    }
    file("InternalformatSampleQuery", NV, "GL_NV_internalformat_sample_query") {
        "GL_MULTISAMPLES_NV"("0x9371")
        "GL_SUPERSAMPLE_SCALE_X_NV"("0x9372")
        "GL_SUPERSAMPLE_SCALE_Y_NV"("0x9373")
        "GL_CONFORMANT_NV"("0x9374")
        "glGetInternalformatSampleivNV"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLsizei("samples"),
            GLenum("pname"),
            GLsizei("count"),
            address("params", "GLint *")
        )
    }
    file(
        "LightMaxExponent", NV, "GL_NV_light_max_exponent",
        "GL_MAX_SHININESS_NV" to "0x8504",
        "GL_MAX_SPOT_EXPONENT_NV" to "0x8505"
    )
    file("MemoryAttachment", NV, "GL_NV_memory_attachment") {
        "GL_ATTACHED_MEMORY_OBJECT_NV"("0x95A4")
        "GL_ATTACHED_MEMORY_OFFSET_NV"("0x95A5")
        "GL_MEMORY_ATTACHABLE_ALIGNMENT_NV"("0x95A6")
        "GL_MEMORY_ATTACHABLE_SIZE_NV"("0x95A7")
        "GL_MEMORY_ATTACHABLE_NV"("0x95A8")
        "GL_DETACHED_MEMORY_INCARNATION_NV"("0x95A9")
        "GL_DETACHED_TEXTURES_NV"("0x95AA")
        "GL_DETACHED_BUFFERS_NV"("0x95AB")
        "GL_MAX_DETACHED_TEXTURES_NV"("0x95AC")
        "GL_MAX_DETACHED_BUFFERS_NV"("0x95AD")
        "glGetMemoryObjectDetachedResourcesuivNV"(
            void,
            GLuint("memory"),
            GLenum("pname"),
            GLint("first"),
            GLsizei("count"),
            address("params", "GLuint *")
        )
        "glResetMemoryObjectParameterNV"(void, GLuint("memory"), GLenum("pname"))
        "glTexAttachMemoryNV"(void, GLenum("target"), GLuint("memory"), GLuint64("offset"))
        "glBufferAttachMemoryNV"(void, GLenum("target"), GLuint("memory"), GLuint64("offset"))
        "glTextureAttachMemoryNV"(void, GLuint("texture"), GLuint("memory"), GLuint64("offset"))
        "glNamedBufferAttachMemoryNV"(void, GLuint("buffer"), GLuint("memory"), GLuint64("offset"))
    }
    file("MemoryObjectSparse", NV, "GL_NV_memory_object_sparse") {
        "glBufferPageCommitmentMemNV"(
            void,
            GLenum("target"),
            GLintptr("offset"),
            GLsizeiptr("size"),
            GLuint("memory"),
            GLuint64("memOffset"),
            GLboolean("commit")
        )
        "glTexPageCommitmentMemNV"(
            void,
            GLenum("target"),
            GLint("layer"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLuint("memory"),
            GLuint64("offset"),
            GLboolean("commit")
        )
        "glNamedBufferPageCommitmentMemNV"(
            void,
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size"),
            GLuint("memory"),
            GLuint64("memOffset"),
            GLboolean("commit")
        )
        "glTexturePageCommitmentMemNV"(
            void,
            GLuint("texture"),
            GLint("layer"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLuint("memory"),
            GLuint64("offset"),
            GLboolean("commit")
        )
    }
    file("MeshShader", NV, "GL_NV_mesh_shader") {
        "GL_MESH_SHADER_NV"("0x9559")
        "GL_TASK_SHADER_NV"("0x955A")
        "GL_MAX_MESH_UNIFORM_BLOCKS_NV"("0x8E60")
        "GL_MAX_MESH_TEXTURE_IMAGE_UNITS_NV"("0x8E61")
        "GL_MAX_MESH_IMAGE_UNIFORMS_NV"("0x8E62")
        "GL_MAX_MESH_UNIFORM_COMPONENTS_NV"("0x8E63")
        "GL_MAX_MESH_ATOMIC_COUNTER_BUFFERS_NV"("0x8E64")
        "GL_MAX_MESH_ATOMIC_COUNTERS_NV"("0x8E65")
        "GL_MAX_MESH_SHADER_STORAGE_BLOCKS_NV"("0x8E66")
        "GL_MAX_COMBINED_MESH_UNIFORM_COMPONENTS_NV"("0x8E67")
        "GL_MAX_TASK_UNIFORM_BLOCKS_NV"("0x8E68")
        "GL_MAX_TASK_TEXTURE_IMAGE_UNITS_NV"("0x8E69")
        "GL_MAX_TASK_IMAGE_UNIFORMS_NV"("0x8E6A")
        "GL_MAX_TASK_UNIFORM_COMPONENTS_NV"("0x8E6B")
        "GL_MAX_TASK_ATOMIC_COUNTER_BUFFERS_NV"("0x8E6C")
        "GL_MAX_TASK_ATOMIC_COUNTERS_NV"("0x8E6D")
        "GL_MAX_TASK_SHADER_STORAGE_BLOCKS_NV"("0x8E6E")
        "GL_MAX_COMBINED_TASK_UNIFORM_COMPONENTS_NV"("0x8E6F")
        "GL_MAX_MESH_WORK_GROUP_INVOCATIONS_NV"("0x95A2")
        "GL_MAX_TASK_WORK_GROUP_INVOCATIONS_NV"("0x95A3")
        "GL_MAX_MESH_TOTAL_MEMORY_SIZE_NV"("0x9536")
        "GL_MAX_TASK_TOTAL_MEMORY_SIZE_NV"("0x9537")
        "GL_MAX_MESH_OUTPUT_VERTICES_NV"("0x9538")
        "GL_MAX_MESH_OUTPUT_PRIMITIVES_NV"("0x9539")
        "GL_MAX_TASK_OUTPUT_COUNT_NV"("0x953A")
        "GL_MAX_DRAW_MESH_TASKS_COUNT_NV"("0x953D")
        "GL_MAX_MESH_VIEWS_NV"("0x9557")
        "GL_MESH_OUTPUT_PER_VERTEX_GRANULARITY_NV"("0x92DF")
        "GL_MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_NV"("0x9543")
        "GL_MAX_MESH_WORK_GROUP_SIZE_NV"("0x953B")
        "GL_MAX_TASK_WORK_GROUP_SIZE_NV"("0x953C")
        "GL_MESH_WORK_GROUP_SIZE_NV"("0x953E")
        "GL_TASK_WORK_GROUP_SIZE_NV"("0x953F")
        "GL_MESH_VERTICES_OUT_NV"("0x9579")
        "GL_MESH_PRIMITIVES_OUT_NV"("0x957A")
        "GL_MESH_OUTPUT_TYPE_NV"("0x957B")
        "GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV"("0x959C")
        "GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_NV"("0x959D")
        "GL_REFERENCED_BY_MESH_SHADER_NV"("0x95A0")
        "GL_REFERENCED_BY_TASK_SHADER_NV"("0x95A1")
        "GL_MESH_SHADER_BIT_NV"("0x00000040")
        "GL_TASK_SHADER_BIT_NV"("0x00000080")
        "GL_MESH_SUBROUTINE_NV"("0x957C")
        "GL_TASK_SUBROUTINE_NV"("0x957D")
        "GL_MESH_SUBROUTINE_UNIFORM_NV"("0x957E")
        "GL_TASK_SUBROUTINE_UNIFORM_NV"("0x957F")
        "GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_NV"("0x959E")
        "GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_NV"("0x959F")
        "glDrawMeshTasksNV"(void, GLuint("first"), GLuint("count"))
        "glDrawMeshTasksIndirectNV"(void, GLintptr("indirect"))
        "glMultiDrawMeshTasksIndirectNV"(void, GLintptr("indirect"), GLsizei("drawcount"), GLsizei("stride"))
        "glMultiDrawMeshTasksIndirectCountNV"(
            void,
            GLintptr("indirect"),
            GLintptr("drawcount"),
            GLsizei("maxdrawcount"),
            GLsizei("stride")
        )
    }
    file("MultisampleFilterHint", NV, "GL_NV_multisample_filter_hint", "GL_MULTISAMPLE_FILTER_HINT_NV" to "0x8534")
    file("OcculusionQuery", NV, "GL_NV_occlusion_query") {
        "GL_PIXEL_COUNTER_BITS_NV"("0x8864")
        "GL_CURRENT_OCCLUSION_QUERY_ID_NV"("0x8865")
        "GL_PIXEL_COUNT_NV"("0x8866")
        "GL_PIXEL_COUNT_AVAILABLE_NV"("0x8867")
        "glGenOcclusionQueriesNV"(void, GLsizei("n"), address("ids", "GLuint *"))
        "glDeleteOcclusionQueriesNV"(void, GLsizei("n"), address("ids", "const GLuint *"))
        "glIsOcclusionQueryNV"(GLboolean, GLuint("id"))
        "glBeginOcclusionQueryNV"(void, GLuint("id"))
        "glEndOcclusionQueryNV"(void)
        "glGetOcclusionQueryivNV"(void, GLuint("id"), GLenum("pname"), address("params", "GLint *"))
        "glGetOcclusionQueryuivNV"(void, GLuint("id"), GLenum("pname"), address("params", "GLuint *"))
    }
    file(
        "PackedDepthStencil", NV, "GL_NV_packed_depth_stencil",
        "GL_DEPTH_STENCIL_NV" to "0x84F9",
        "GL_UNSIGNED_INT_24_8_NV" to "0x84FA"
    )
    file("ParameterBufferObject", NV, "GL_NV_parameter_buffer_object") {
        "GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV"("0x8DA0")
        "GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV"("0x8DA1")
        "GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV"("0x8DA2")
        "GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV"("0x8DA3")
        "GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV"("0x8DA4")
        "glProgramBufferParametersfvNV"(
            void,
            GLenum("target"),
            GLuint("bindingIndex"),
            GLuint("wordIndex"),
            GLsizei("count"),
            address("params", "const GLfloat *")
        )
        "glProgramBufferParametersIivNV"(
            void,
            GLenum("target"),
            GLuint("bindingIndex"),
            GLuint("wordIndex"),
            GLsizei("count"),
            address("params", "const GLint *")
        )
        "glProgramBufferParametersIuivNV"(
            void,
            GLenum("target"),
            GLuint("bindingIndex"),
            GLuint("wordIndex"),
            GLsizei("count"),
            address("params", "const GLuint *")
        )
    }
    file("PathRendering", NV, "GL_NV_path_rendering") {
        "GL_PATH_FORMAT_SVG_NV"("0x9070")
        "GL_PATH_FORMAT_PS_NV"("0x9071")
        "GL_STANDARD_FONT_NAME_NV"("0x9072")
        "GL_SYSTEM_FONT_NAME_NV"("0x9073")
        "GL_FILE_NAME_NV"("0x9074")
        "GL_PATH_STROKE_WIDTH_NV"("0x9075")
        "GL_PATH_END_CAPS_NV"("0x9076")
        "GL_PATH_INITIAL_END_CAP_NV"("0x9077")
        "GL_PATH_TERMINAL_END_CAP_NV"("0x9078")
        "GL_PATH_JOIN_STYLE_NV"("0x9079")
        "GL_PATH_MITER_LIMIT_NV"("0x907A")
        "GL_PATH_DASH_CAPS_NV"("0x907B")
        "GL_PATH_INITIAL_DASH_CAP_NV"("0x907C")
        "GL_PATH_TERMINAL_DASH_CAP_NV"("0x907D")
        "GL_PATH_DASH_OFFSET_NV"("0x907E")
        "GL_PATH_CLIENT_LENGTH_NV"("0x907F")
        "GL_PATH_FILL_MODE_NV"("0x9080")
        "GL_PATH_FILL_MASK_NV"("0x9081")
        "GL_PATH_FILL_COVER_MODE_NV"("0x9082")
        "GL_PATH_STROKE_COVER_MODE_NV"("0x9083")
        "GL_PATH_STROKE_MASK_NV"("0x9084")
        "GL_COUNT_UP_NV"("0x9088")
        "GL_COUNT_DOWN_NV"("0x9089")
        "GL_PATH_OBJECT_BOUNDING_BOX_NV"("0x908A")
        "GL_CONVEX_HULL_NV"("0x908B")
        "GL_BOUNDING_BOX_NV"("0x908D")
        "GL_TRANSLATE_X_NV"("0x908E")
        "GL_TRANSLATE_Y_NV"("0x908F")
        "GL_TRANSLATE_2D_NV"("0x9090")
        "GL_TRANSLATE_3D_NV"("0x9091")
        "GL_AFFINE_2D_NV"("0x9092")
        "GL_AFFINE_3D_NV"("0x9094")
        "GL_TRANSPOSE_AFFINE_2D_NV"("0x9096")
        "GL_TRANSPOSE_AFFINE_3D_NV"("0x9098")
        "GL_UTF8_NV"("0x909A")
        "GL_UTF16_NV"("0x909B")
        "GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV"("0x909C")
        "GL_PATH_COMMAND_COUNT_NV"("0x909D")
        "GL_PATH_COORD_COUNT_NV"("0x909E")
        "GL_PATH_DASH_ARRAY_COUNT_NV"("0x909F")
        "GL_PATH_COMPUTED_LENGTH_NV"("0x90A0")
        "GL_PATH_FILL_BOUNDING_BOX_NV"("0x90A1")
        "GL_PATH_STROKE_BOUNDING_BOX_NV"("0x90A2")
        "GL_SQUARE_NV"("0x90A3")
        "GL_ROUND_NV"("0x90A4")
        "GL_TRIANGULAR_NV"("0x90A5")
        "GL_BEVEL_NV"("0x90A6")
        "GL_MITER_REVERT_NV"("0x90A7")
        "GL_MITER_TRUNCATE_NV"("0x90A8")
        "GL_SKIP_MISSING_GLYPH_NV"("0x90A9")
        "GL_USE_MISSING_GLYPH_NV"("0x90AA")
        "GL_PATH_ERROR_POSITION_NV"("0x90AB")
        "GL_ACCUM_ADJACENT_PAIRS_NV"("0x90AD")
        "GL_ADJACENT_PAIRS_NV"("0x90AE")
        "GL_FIRST_TO_REST_NV"("0x90AF")
        "GL_PATH_GEN_MODE_NV"("0x90B0")
        "GL_PATH_GEN_COEFF_NV"("0x90B1")
        "GL_PATH_GEN_COMPONENTS_NV"("0x90B3")
        "GL_PATH_STENCIL_FUNC_NV"("0x90B7")
        "GL_PATH_STENCIL_REF_NV"("0x90B8")
        "GL_PATH_STENCIL_VALUE_MASK_NV"("0x90B9")
        "GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV"("0x90BD")
        "GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV"("0x90BE")
        "GL_PATH_COVER_DEPTH_FUNC_NV"("0x90BF")
        "GL_PATH_DASH_OFFSET_RESET_NV"("0x90B4")
        "GL_MOVE_TO_RESETS_NV"("0x90B5")
        "GL_MOVE_TO_CONTINUES_NV"("0x90B6")
        "GL_CLOSE_PATH_NV"("0x00")
        "GL_MOVE_TO_NV"("0x02")
        "GL_RELATIVE_MOVE_TO_NV"("0x03")
        "GL_LINE_TO_NV"("0x04")
        "GL_RELATIVE_LINE_TO_NV"("0x05")
        "GL_HORIZONTAL_LINE_TO_NV"("0x06")
        "GL_RELATIVE_HORIZONTAL_LINE_TO_NV"("0x07")
        "GL_VERTICAL_LINE_TO_NV"("0x08")
        "GL_RELATIVE_VERTICAL_LINE_TO_NV"("0x09")
        "GL_QUADRATIC_CURVE_TO_NV"("0x0A")
        "GL_RELATIVE_QUADRATIC_CURVE_TO_NV"("0x0B")
        "GL_CUBIC_CURVE_TO_NV"("0x0C")
        "GL_RELATIVE_CUBIC_CURVE_TO_NV"("0x0D")
        "GL_SMOOTH_QUADRATIC_CURVE_TO_NV"("0x0E")
        "GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV"("0x0F")
        "GL_SMOOTH_CUBIC_CURVE_TO_NV"("0x10")
        "GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV"("0x11")
        "GL_SMALL_CCW_ARC_TO_NV"("0x12")
        "GL_RELATIVE_SMALL_CCW_ARC_TO_NV"("0x13")
        "GL_SMALL_CW_ARC_TO_NV"("0x14")
        "GL_RELATIVE_SMALL_CW_ARC_TO_NV"("0x15")
        "GL_LARGE_CCW_ARC_TO_NV"("0x16")
        "GL_RELATIVE_LARGE_CCW_ARC_TO_NV"("0x17")
        "GL_LARGE_CW_ARC_TO_NV"("0x18")
        "GL_RELATIVE_LARGE_CW_ARC_TO_NV"("0x19")
        "GL_RESTART_PATH_NV"("0xF0")
        "GL_DUP_FIRST_CUBIC_CURVE_TO_NV"("0xF2")
        "GL_DUP_LAST_CUBIC_CURVE_TO_NV"("0xF4")
        "GL_RECT_NV"("0xF6")
        "GL_CIRCULAR_CCW_ARC_TO_NV"("0xF8")
        "GL_CIRCULAR_CW_ARC_TO_NV"("0xFA")
        "GL_CIRCULAR_TANGENT_ARC_TO_NV"("0xFC")
        "GL_ARC_TO_NV"("0xFE")
        "GL_RELATIVE_ARC_TO_NV"("0xFF")
        "GL_BOLD_BIT_NV"("0x01")
        "GL_ITALIC_BIT_NV"("0x02")
        "GL_GLYPH_WIDTH_BIT_NV"("0x01")
        "GL_GLYPH_HEIGHT_BIT_NV"("0x02")
        "GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV"("0x04")
        "GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV"("0x08")
        "GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV"("0x10")
        "GL_GLYPH_VERTICAL_BEARING_X_BIT_NV"("0x20")
        "GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV"("0x40")
        "GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV"("0x80")
        "GL_GLYPH_HAS_KERNING_BIT_NV"("0x100")
        "GL_FONT_X_MIN_BOUNDS_BIT_NV"("0x00010000")
        "GL_FONT_Y_MIN_BOUNDS_BIT_NV"("0x00020000")
        "GL_FONT_X_MAX_BOUNDS_BIT_NV"("0x00040000")
        "GL_FONT_Y_MAX_BOUNDS_BIT_NV"("0x00080000")
        "GL_FONT_UNITS_PER_EM_BIT_NV"("0x00100000")
        "GL_FONT_ASCENDER_BIT_NV"("0x00200000")
        "GL_FONT_DESCENDER_BIT_NV"("0x00400000")
        "GL_FONT_HEIGHT_BIT_NV"("0x00800000")
        "GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV"("0x01000000")
        "GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV"("0x02000000")
        "GL_FONT_UNDERLINE_POSITION_BIT_NV"("0x04000000")
        "GL_FONT_UNDERLINE_THICKNESS_BIT_NV"("0x08000000")
        "GL_FONT_HAS_KERNING_BIT_NV"("0x10000000")
        "GL_ROUNDED_RECT_NV"("0xE8")
        "GL_RELATIVE_ROUNDED_RECT_NV"("0xE9")
        "GL_ROUNDED_RECT2_NV"("0xEA")
        "GL_RELATIVE_ROUNDED_RECT2_NV"("0xEB")
        "GL_ROUNDED_RECT4_NV"("0xEC")
        "GL_RELATIVE_ROUNDED_RECT4_NV"("0xED")
        "GL_ROUNDED_RECT8_NV"("0xEE")
        "GL_RELATIVE_ROUNDED_RECT8_NV"("0xEF")
        "GL_RELATIVE_RECT_NV"("0xF7")
        "GL_FONT_GLYPHS_AVAILABLE_NV"("0x9368")
        "GL_FONT_TARGET_UNAVAILABLE_NV"("0x9369")
        "GL_FONT_UNAVAILABLE_NV"("0x936A")
        "GL_FONT_UNINTELLIGIBLE_NV"("0x936B")
        "GL_CONIC_CURVE_TO_NV"("0x1A")
        "GL_RELATIVE_CONIC_CURVE_TO_NV"("0x1B")
        "GL_FONT_NUM_GLYPH_INDICES_BIT_NV"("0x20000000")
        "GL_STANDARD_FONT_FORMAT_NV"("0x936C")
        "GL_2_BYTES_NV"("0x1407")
        "GL_3_BYTES_NV"("0x1408")
        "GL_4_BYTES_NV"("0x1409")
        "GL_EYE_LINEAR_NV"("0x2400")
        "GL_OBJECT_LINEAR_NV"("0x2401")
        "GL_CONSTANT_NV"("0x8576")
        "GL_PATH_FOG_GEN_MODE_NV"("0x90AC")
        "GL_PRIMARY_COLOR_NV"("0x852C")
        "GL_SECONDARY_COLOR_NV"("0x852D")
        "GL_PATH_GEN_COLOR_FORMAT_NV"("0x90B2")
        "GL_PATH_PROJECTION_NV"("0x1701")
        "GL_PATH_MODELVIEW_NV"("0x1700")
        "GL_PATH_MODELVIEW_STACK_DEPTH_NV"("0x0BA3")
        "GL_PATH_MODELVIEW_MATRIX_NV"("0x0BA6")
        "GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV"("0x0D36")
        "GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV"("0x84E3")
        "GL_PATH_PROJECTION_STACK_DEPTH_NV"("0x0BA4")
        "GL_PATH_PROJECTION_MATRIX_NV"("0x0BA7")
        "GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV"("0x0D38")
        "GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV"("0x84E4")
        "GL_FRAGMENT_INPUT_NV"("0x936D")
        "glGenPathsNV"(GLuint, GLsizei("range"))
        "glDeletePathsNV"(void, GLuint("path"), GLsizei("range"))
        "glIsPathNV"(GLboolean, GLuint("path"))
        "glPathCommandsNV"(
            void,
            GLuint("path"),
            GLsizei("numCommands"),
            address("commands", "const GLubyte *"),
            GLsizei("numCoords"),
            GLenum("coordType"),
            address("coords", "const void *")
        )
        "glPathCoordsNV"(
            void,
            GLuint("path"),
            GLsizei("numCoords"),
            GLenum("coordType"),
            address("coords", "const void *")
        )
        "glPathSubCommandsNV"(
            void,
            GLuint("path"),
            GLsizei("commandStart"),
            GLsizei("commandsToDelete"),
            GLsizei("numCommands"),
            address("commands", "const GLubyte *"),
            GLsizei("numCoords"),
            GLenum("coordType"),
            address("coords", "const void *")
        )
        "glPathSubCoordsNV"(
            void,
            GLuint("path"),
            GLsizei("coordStart"),
            GLsizei("numCoords"),
            GLenum("coordType"),
            address("coords", "const void *")
        )
        "glPathStringNV"(
            void,
            GLuint("path"),
            GLenum("format"),
            GLsizei("length"),
            address("pathString", "const void *")
        )
        "glPathGlyphsNV"(
            void,
            GLuint("firstPathName"),
            GLenum("fontTarget"),
            address("fontName", "const void *"),
            GLbitfield("fontStyle"),
            GLsizei("numGlyphs"),
            GLenum("type"),
            address("charcodes", "const void *"),
            GLenum("handleMissingGlyphs"),
            GLuint("pathParameterTemplate"),
            GLfloat("emScale")
        )
        "glPathGlyphRangeNV"(
            void,
            GLuint("firstPathName"),
            GLenum("fontTarget"),
            address("fontName", "const void *"),
            GLbitfield("fontStyle"),
            GLuint("firstGlyph"),
            GLsizei("numGlyphs"),
            GLenum("handleMissingGlyphs"),
            GLuint("pathParameterTemplate"),
            GLfloat("emScale")
        )
        "glWeightPathsNV"(
            void,
            GLuint("resultPath"),
            GLsizei("numPaths"),
            address("paths", "const GLuint *"),
            address("weights", "const GLfloat *")
        )
        "glCopyPathNV"(void, GLuint("resultPath"), GLuint("srcPath"))
        "glInterpolatePathsNV"(void, GLuint("resultPath"), GLuint("pathA"), GLuint("pathB"), GLfloat("weight"))
        "glTransformPathNV"(
            void,
            GLuint("resultPath"),
            GLuint("srcPath"),
            GLenum("transformType"),
            address("transformValues", "const GLfloat *")
        )
        "glPathParameterivNV"(void, GLuint("path"), GLenum("pname"), address("value", "const GLint *"))
        "glPathParameteriNV"(void, GLuint("path"), GLenum("pname"), GLint("value"))
        "glPathParameterfvNV"(void, GLuint("path"), GLenum("pname"), address("value", "const GLfloat *"))
        "glPathParameterfNV"(void, GLuint("path"), GLenum("pname"), GLfloat("value"))
        "glPathDashArrayNV"(void, GLuint("path"), GLsizei("dashCount"), address("dashArray", "const GLfloat *"))
        "glPathStencilFuncNV"(void, GLenum("func"), GLint("ref"), GLuint("mask"))
        "glPathStencilDepthOffsetNV"(void, GLfloat("factor"), GLfloat("units"))
        "glStencilFillPathNV"(void, GLuint("path"), GLenum("fillMode"), GLuint("mask"))
        "glStencilStrokePathNV"(void, GLuint("path"), GLint("reference"), GLuint("mask"))
        "glStencilFillPathInstancedNV"(
            void,
            GLsizei("numPaths"),
            GLenum("pathNameType"),
            address("paths", "const void *"),
            GLuint("pathBase"),
            GLenum("fillMode"),
            GLuint("mask"),
            GLenum("transformType"),
            address("transformValues", "const GLfloat *")
        )
        "glStencilStrokePathInstancedNV"(
            void,
            GLsizei("numPaths"),
            GLenum("pathNameType"),
            address("paths", "const void *"),
            GLuint("pathBase"),
            GLint("reference"),
            GLuint("mask"),
            GLenum("transformType"),
            address("transformValues", "const GLfloat *")
        )
        "glPathCoverDepthFuncNV"(void, GLenum("func"))
        "glCoverFillPathNV"(void, GLuint("path"), GLenum("coverMode"))
        "glCoverStrokePathNV"(void, GLuint("path"), GLenum("coverMode"))
        "glCoverFillPathInstancedNV"(
            void,
            GLsizei("numPaths"),
            GLenum("pathNameType"),
            address("paths", "const void *"),
            GLuint("pathBase"),
            GLenum("coverMode"),
            GLenum("transformType"),
            address("transformValues", "const GLfloat *")
        )
        "glCoverStrokePathInstancedNV"(
            void,
            GLsizei("numPaths"),
            GLenum("pathNameType"),
            address("paths", "const void *"),
            GLuint("pathBase"),
            GLenum("coverMode"),
            GLenum("transformType"),
            address("transformValues", "const GLfloat *")
        )
        "glGetPathParameterivNV"(void, GLuint("path"), GLenum("pname"), address("value", "GLint *"))
        "glGetPathParameterfvNV"(void, GLuint("path"), GLenum("pname"), address("value", "GLfloat *"))
        "glGetPathCommandsNV"(void, GLuint("path"), address("commands", "GLubyte *"))
        "glGetPathCoordsNV"(void, GLuint("path"), address("coords", "GLfloat *"))
        "glGetPathDashArrayNV"(void, GLuint("path"), address("dashArray", "GLfloat *"))
        "glGetPathMetricsNV"(
            void,
            GLbitfield("metricQueryMask"),
            GLsizei("numPaths"),
            GLenum("pathNameType"),
            address("paths", "const void *"),
            GLuint("pathBase"),
            GLsizei("stride"),
            address("metrics", "GLfloat *")
        )
        "glGetPathMetricRangeNV"(
            void,
            GLbitfield("metricQueryMask"),
            GLuint("firstPathName"),
            GLsizei("numPaths"),
            GLsizei("stride"),
            address("metrics", "GLfloat *")
        )
        "glGetPathSpacingNV"(
            void,
            GLenum("pathListMode"),
            GLsizei("numPaths"),
            GLenum("pathNameType"),
            address("paths", "const void *"),
            GLuint("pathBase"),
            GLfloat("advanceScale"),
            GLfloat("kerningScale"),
            GLenum("transformType"),
            address("returnedSpacing", "GLfloat *")
        )
        "glIsPointInFillPathNV"(GLboolean, GLuint("path"), GLuint("mask"), GLfloat("x"), GLfloat("y"))
        "glIsPointInStrokePathNV"(GLboolean, GLuint("path"), GLfloat("x"), GLfloat("y"))
        "glGetPathLengthNV"(GLfloat, GLuint("path"), GLsizei("startSegment"), GLsizei("numSegments"))
        "glPointAlongPathNV"(
            GLboolean,
            GLuint("path"),
            GLsizei("startSegment"),
            GLsizei("numSegments"),
            GLfloat("distance"),
            address("x", "GLfloat *"),
            address("y", "GLfloat *"),
            address("tangentX", "GLfloat *"),
            address("tangentY", "GLfloat *")
        )
        "glMatrixLoad3x2fNV"(void, GLenum("matrixMode"), address("m", "const GLfloat *"))
        "glMatrixLoad3x3fNV"(void, GLenum("matrixMode"), address("m", "const GLfloat *"))
        "glMatrixLoadTranspose3x3fNV"(void, GLenum("matrixMode"), address("m", "const GLfloat *"))
        "glMatrixMult3x2fNV"(void, GLenum("matrixMode"), address("m", "const GLfloat *"))
        "glMatrixMult3x3fNV"(void, GLenum("matrixMode"), address("m", "const GLfloat *"))
        "glMatrixMultTranspose3x3fNV"(void, GLenum("matrixMode"), address("m", "const GLfloat *"))
        "glStencilThenCoverFillPathNV"(void, GLuint("path"), GLenum("fillMode"), GLuint("mask"), GLenum("coverMode"))
        "glStencilThenCoverStrokePathNV"(void, GLuint("path"), GLint("reference"), GLuint("mask"), GLenum("coverMode"))
        "glStencilThenCoverFillPathInstancedNV"(
            void,
            GLsizei("numPaths"),
            GLenum("pathNameType"),
            address("paths", "const void *"),
            GLuint("pathBase"),
            GLenum("fillMode"),
            GLuint("mask"),
            GLenum("coverMode"),
            GLenum("transformType"),
            address("transformValues", "const GLfloat *")
        )
        "glStencilThenCoverStrokePathInstancedNV"(
            void,
            GLsizei("numPaths"),
            GLenum("pathNameType"),
            address("paths", "const void *"),
            GLuint("pathBase"),
            GLint("reference"),
            GLuint("mask"),
            GLenum("coverMode"),
            GLenum("transformType"),
            address("transformValues", "const GLfloat *")
        )
        "glPathGlyphIndexRangeNV"(
            GLenum,
            GLenum("fontTarget"),
            address("fontName", "const void *"),
            GLbitfield("fontStyle"),
            GLuint("pathParameterTemplate"),
            GLfloat("emScale"),
            address("baseAndCount", "GLuint *")
        )
        "glPathGlyphIndexArrayNV"(
            GLenum,
            GLuint("firstPathName"),
            GLenum("fontTarget"),
            address("fontName", "const void *"),
            GLbitfield("fontStyle"),
            GLuint("firstGlyphIndex"),
            GLsizei("numGlyphs"),
            GLuint("pathParameterTemplate"),
            GLfloat("emScale")
        )
        "glPathMemoryGlyphIndexArrayNV"(
            GLenum,
            GLuint("firstPathName"),
            GLenum("fontTarget"),
            GLsizeiptr("fontSize"),
            address("fontData", "const void *"),
            GLsizei("faceIndex"),
            GLuint("firstGlyphIndex"),
            GLsizei("numGlyphs"),
            GLuint("pathParameterTemplate"),
            GLfloat("emScale")
        )
        "glProgramPathFragmentInputGenNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLenum("genMode"),
            GLint("components"),
            address("coeffs", "const GLfloat *")
        )
        "glGetProgramResourcefvNV"(
            void,
            GLuint("program"),
            GLenum("programInterface"),
            GLuint("index"),
            GLsizei("propCount"),
            address("props", "const GLenum *"),
            GLsizei("count"),
            address("length", "GLsizei *"),
            address("params", "GLfloat *")
        )
        "glPathColorGenNV"(
            void,
            GLenum("color"),
            GLenum("genMode"),
            GLenum("colorFormat"),
            address("coeffs", "const GLfloat *")
        )
        "glPathTexGenNV"(
            void,
            GLenum("texCoordSet"),
            GLenum("genMode"),
            GLint("components"),
            address("coeffs", "const GLfloat *")
        )
        "glPathFogGenNV"(void, GLenum("genMode"))
        "glGetPathColorGenivNV"(void, GLenum("color"), GLenum("pname"), address("value", "GLint *"))
        "glGetPathColorGenfvNV"(void, GLenum("color"), GLenum("pname"), address("value", "GLfloat *"))
        "glGetPathTexGenivNV"(void, GLenum("texCoordSet"), GLenum("pname"), address("value", "GLint *"))
        "glGetPathTexGenfvNV"(void, GLenum("texCoordSet"), GLenum("pname"), address("value", "GLfloat *"))
    }
    file("PathRenderingSharedEdge", NV, "GL_NV_path_rendering_shared_edge", "GL_SHARED_EDGE_NV" to "0xC0")
    file("PixelDataRange", NV, "GL_NV_pixel_data_range") {
        "GL_WRITE_PIXEL_DATA_RANGE_NV"("0x8878")
        "GL_READ_PIXEL_DATA_RANGE_NV"("0x8879")
        "GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV"("0x887A")
        "GL_READ_PIXEL_DATA_RANGE_LENGTH_NV"("0x887B")
        "GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV"("0x887C")
        "GL_READ_PIXEL_DATA_RANGE_POINTER_NV"("0x887D")
        "glPixelDataRangeNV"(void, GLenum("target"), GLsizei("length"), address("pointer", "const void *"))
        "glFlushPixelDataRangeNV"(void, GLenum("target"))
    }
    file("PointSprite", NV, "GL_NV_point_sprite") {
        "GL_POINT_SPRITE_NV"("0x8861")
        "GL_COORD_REPLACE_NV"("0x8862")
        "GL_POINT_SPRITE_R_MODE_NV"("0x8863")
        "glPointParameteriNV"(void, GLenum("pname"), GLint("param"))
        "glPointParameterivNV"(void, GLenum("pname"), address("params", "const GLint *"))
    }
    file("PresentVideo", NV, "GL_NV_present_video") {
        "GL_FRAME_NV"("0x8E26")
        "GL_FIELDS_NV"("0x8E27")
        "GL_CURRENT_TIME_NV"("0x8E28")
        "GL_NUM_FILL_STREAMS_NV"("0x8E29")
        "GL_PRESENT_TIME_NV"("0x8E2A")
        "GL_PRESENT_DURATION_NV"("0x8E2B")
        "glPresentFrameKeyedNV"(
            void,
            GLuint("video_slot"),
            GLuint64EXT("minPresentTime"),
            GLuint("beginPresentTimeId"),
            GLuint("presentDurationId"),
            GLenum("type"),
            GLenum("target0"),
            GLuint("fill0"),
            GLuint("key0"),
            GLenum("target1"),
            GLuint("fill1"),
            GLuint("key1")
        )
        "glPresentFrameDualFillNV"(
            void,
            GLuint("video_slot"),
            GLuint64EXT("minPresentTime"),
            GLuint("beginPresentTimeId"),
            GLuint("presentDurationId"),
            GLenum("type"),
            GLenum("target0"),
            GLuint("fill0"),
            GLenum("target1"),
            GLuint("fill1"),
            GLenum("target2"),
            GLuint("fill2"),
            GLenum("target3"),
            GLuint("fill3")
        )
        "glGetVideoivNV"(void, GLuint("video_slot"), GLenum("pname"), address("params", "GLint *"))
        "glGetVideouivNV"(void, GLuint("video_slot"), GLenum("pname"), address("params", "GLuint *"))
        "glGetVideoi64vNV"(void, GLuint("video_slot"), GLenum("pname"), address("params", "GLint64EXT *"))
        "glGetVideoui64vNV"(void, GLuint("video_slot"), GLenum("pname"), address("params", "GLuint64EXT *"))
    }
    file("PrimitiveRestart", NV, "GL_NV_primitive_restart") {
        "GL_PRIMITIVE_RESTART_NV"("0x8558")
        "GL_PRIMITIVE_RESTART_INDEX_NV"("0x8559")
        "glPrimitiveRestartNV"(void)
        "glPrimitiveRestartIndexNV"(void, GLuint("index"))
    }
    file(
        "PrimitiveShadingRate", NV, "GL_NV_primitive_shading_rate",
        "GL_SHADING_RATE_IMAGE_PER_PRIMITIVE_NV" to "0x95B1",
        "GL_SHADING_RATE_IMAGE_PALETTE_COUNT_NV" to "0x95B2"
    )
    file("QueryResource", NV, "GL_NV_query_resource") {
        "GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV"("0x9540")
        "GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV"("0x9542")
        "GL_QUERY_RESOURCE_SYS_RESERVED_NV"("0x9544")
        "GL_QUERY_RESOURCE_TEXTURE_NV"("0x9545")
        "GL_QUERY_RESOURCE_RENDERBUFFER_NV"("0x9546")
        "GL_QUERY_RESOURCE_BUFFEROBJECT_NV"("0x9547")
        "glQueryResourceNV"(GLint, GLenum("queryType"), GLint("tagId"), GLuint("count"), address("buffer", "GLint *"))
    }
    file("QueryResourceTag", NV, "GL_NV_query_resource_tag") {
        "glGenQueryResourceTagNV"(void, GLsizei("n"), address("tagIds", "GLint *"))
        "glDeleteQueryResourceTagNV"(void, GLsizei("n"), address("tagIds", "const GLint *"))
        "glQueryResourceTagNV"(void, GLint("tagId"), address("tagString", "const GLchar *"))
    }
    file("RegisterCombiners", NV, "GL_NV_register_combiners") {
        "GL_REGISTER_COMBINERS_NV"("0x8522")
        "GL_VARIABLE_A_NV"("0x8523")
        "GL_VARIABLE_B_NV"("0x8524")
        "GL_VARIABLE_C_NV"("0x8525")
        "GL_VARIABLE_D_NV"("0x8526")
        "GL_VARIABLE_E_NV"("0x8527")
        "GL_VARIABLE_F_NV"("0x8528")
        "GL_VARIABLE_G_NV"("0x8529")
        "GL_CONSTANT_COLOR0_NV"("0x852A")
        "GL_CONSTANT_COLOR1_NV"("0x852B")
        "GL_SPARE0_NV"("0x852E")
        "GL_SPARE1_NV"("0x852F")
        "GL_DISCARD_NV"("0x8530")
        "GL_E_TIMES_F_NV"("0x8531")
        "GL_SPARE0_PLUS_SECONDARY_COLOR_NV"("0x8532")
        "GL_UNSIGNED_IDENTITY_NV"("0x8536")
        "GL_UNSIGNED_INVERT_NV"("0x8537")
        "GL_EXPAND_NORMAL_NV"("0x8538")
        "GL_EXPAND_NEGATE_NV"("0x8539")
        "GL_HALF_BIAS_NORMAL_NV"("0x853A")
        "GL_HALF_BIAS_NEGATE_NV"("0x853B")
        "GL_SIGNED_IDENTITY_NV"("0x853C")
        "GL_SIGNED_NEGATE_NV"("0x853D")
        "GL_SCALE_BY_TWO_NV"("0x853E")
        "GL_SCALE_BY_FOUR_NV"("0x853F")
        "GL_SCALE_BY_ONE_HALF_NV"("0x8540")
        "GL_BIAS_BY_NEGATIVE_ONE_HALF_NV"("0x8541")
        "GL_COMBINER_INPUT_NV"("0x8542")
        "GL_COMBINER_MAPPING_NV"("0x8543")
        "GL_COMBINER_COMPONENT_USAGE_NV"("0x8544")
        "GL_COMBINER_AB_DOT_PRODUCT_NV"("0x8545")
        "GL_COMBINER_CD_DOT_PRODUCT_NV"("0x8546")
        "GL_COMBINER_MUX_SUM_NV"("0x8547")
        "GL_COMBINER_SCALE_NV"("0x8548")
        "GL_COMBINER_BIAS_NV"("0x8549")
        "GL_COMBINER_AB_OUTPUT_NV"("0x854A")
        "GL_COMBINER_CD_OUTPUT_NV"("0x854B")
        "GL_COMBINER_SUM_OUTPUT_NV"("0x854C")
        "GL_MAX_GENERAL_COMBINERS_NV"("0x854D")
        "GL_NUM_GENERAL_COMBINERS_NV"("0x854E")
        "GL_COLOR_SUM_CLAMP_NV"("0x854F")
        "GL_COMBINER0_NV"("0x8550")
        "GL_COMBINER1_NV"("0x8551")
        "GL_COMBINER2_NV"("0x8552")
        "GL_COMBINER3_NV"("0x8553")
        "GL_COMBINER4_NV"("0x8554")
        "GL_COMBINER5_NV"("0x8555")
        "GL_COMBINER6_NV"("0x8556")
        "GL_COMBINER7_NV"("0x8557")
        "glCombinerParameterfvNV"(void, GLenum("pname"), address("params", "const GLfloat *"))
        "glCombinerParameterfNV"(void, GLenum("pname"), GLfloat("param"))
        "glCombinerParameterivNV"(void, GLenum("pname"), address("params", "const GLint *"))
        "glCombinerParameteriNV"(void, GLenum("pname"), GLint("param"))
        "glCombinerInputNV"(
            void,
            GLenum("stage"),
            GLenum("portion"),
            GLenum("variable"),
            GLenum("input"),
            GLenum("mapping"),
            GLenum("componentUsage")
        )
        "glCombinerOutputNV"(
            void,
            GLenum("stage"),
            GLenum("portion"),
            GLenum("abOutput"),
            GLenum("cdOutput"),
            GLenum("sumOutput"),
            GLenum("scale"),
            GLenum("bias"),
            GLboolean("abDotProduct"),
            GLboolean("cdDotProduct"),
            GLboolean("muxSum")
        )
        "glFinalCombinerInputNV"(void, GLenum("variable"), GLenum("input"), GLenum("mapping"), GLenum("componentUsage"))
        "glGetCombinerInputParameterfvNV"(
            void,
            GLenum("stage"),
            GLenum("portion"),
            GLenum("variable"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetCombinerInputParameterivNV"(
            void,
            GLenum("stage"),
            GLenum("portion"),
            GLenum("variable"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetCombinerOutputParameterfvNV"(
            void,
            GLenum("stage"),
            GLenum("portion"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetCombinerOutputParameterivNV"(
            void,
            GLenum("stage"),
            GLenum("portion"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetFinalCombinerInputParameterfvNV"(
            void,
            GLenum("variable"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetFinalCombinerInputParameterivNV"(void, GLenum("variable"), GLenum("pname"), address("params", "GLint *"))
    }
    file("RegisterCombiners2", NV, "GL_NV_register_combiners2") {
        "GL_PER_STAGE_CONSTANTS_NV"("0x8535")
        "glCombinerStageParameterfvNV"(void, GLenum("stage"), GLenum("pname"), address("params", "const GLfloat *"))
        "glGetCombinerStageParameterfvNV"(void, GLenum("stage"), GLenum("pname"), address("params", "GLfloat *"))
    }
    file("RepresentativeFragmentTest", NV, "GL_NV_representative_fragment_test", "GL_REPRESENTATIVE_FRAGMENT_TEST_NV" to "0x937F")
    file("RobustnessVideoMemoryPurge", NV, "GL_NV_robustness_video_memory_purge", "GL_PURGED_CONTEXT_RESET_NV" to "0x92BB")
    file("SampleLocations", NV, "GL_NV_sample_locations") {
        "GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV"("0x933D")
        "GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV"("0x933E")
        "GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV"("0x933F")
        "GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV"("0x9340")
        "GL_SAMPLE_LOCATION_NV"("0x8E50")
        "GL_PROGRAMMABLE_SAMPLE_LOCATION_NV"("0x9341")
        "GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV"("0x9342")
        "GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV"("0x9343")
        "glFramebufferSampleLocationsfvNV"(
            void,
            GLenum("target"),
            GLuint("start"),
            GLsizei("count"),
            address("v", "const GLfloat *")
        )
        "glNamedFramebufferSampleLocationsfvNV"(
            void,
            GLuint("framebuffer"),
            GLuint("start"),
            GLsizei("count"),
            address("v", "const GLfloat *")
        )
        "glResolveDepthValuesNV"(void)
    }
    file("ScissorExclusive", NV, "GL_NV_scissor_exclusive") {
        "GL_SCISSOR_TEST_EXCLUSIVE_NV"("0x9555")
        "GL_SCISSOR_BOX_EXCLUSIVE_NV"("0x9556")
        "glScissorExclusiveNV"(void, GLint("x"), GLint("y"), GLsizei("width"), GLsizei("height"))
        "glScissorExclusiveArrayvNV"(void, GLuint("first"), GLsizei("count"), address("v", "const GLint *"))
    }
    file("ShaderBufferLoad", NV, "GL_NV_shader_buffer_load") {
        "GL_BUFFER_GPU_ADDRESS_NV"("0x8F1D")
        "GL_GPU_ADDRESS_NV"("0x8F34")
        "GL_MAX_SHADER_BUFFER_ADDRESS_NV"("0x8F35")
        "glMakeBufferResidentNV"(void, GLenum("target"), GLenum("access"))
        "glMakeBufferNonResidentNV"(void, GLenum("target"))
        "glIsBufferResidentNV"(GLboolean, GLenum("target"))
        "glMakeNamedBufferResidentNV"(void, GLuint("buffer"), GLenum("access"))
        "glMakeNamedBufferNonResidentNV"(void, GLuint("buffer"))
        "glIsNamedBufferResidentNV"(GLboolean, GLuint("buffer"))
        "glGetBufferParameterui64vNV"(void, GLenum("target"), GLenum("pname"), address("params", "GLuint64EXT *"))
        "glGetNamedBufferParameterui64vNV"(void, GLuint("buffer"), GLenum("pname"), address("params", "GLuint64EXT *"))
        "glGetIntegerui64vNV"(void, GLenum("value"), address("result", "GLuint64EXT *"))
        "glUniformui64NV"(void, GLint("location"), GLuint64EXT("value"))
        "glUniformui64vNV"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint64EXT *"))
        "glProgramUniformui64NV"(void, GLuint("program"), GLint("location"), GLuint64EXT("value"))
        "glProgramUniformui64vNV"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint64EXT *")
        )
    }
    file("ShaderBufferStore", NV, "GL_NV_shader_buffer_store", "GL_SHADER_GLOBAL_ACCESS_BARRIER_BIT_NV" to "0x00000010")
    file("ShaderSubgroupPartitioned", NV, "GL_NV_shader_subgroup_partitioned", "GL_SUBGROUP_FEATURE_PARTITIONED_BIT_NV" to "0x00000100")
    file(
        "ShaderThreadGroup", NV, "GL_NV_shader_thread_group",
        "GL_WARP_SIZE_NV" to "0x9339",
        "GL_WARPS_PER_SM_NV" to "0x933A",
        "GL_SM_COUNT_NV" to "0x933B",
    )
    file("ShadingRateImage", NV, "GL_NV_shading_rate_image") {
        "GL_SHADING_RATE_IMAGE_NV"("0x9563")
        "GL_SHADING_RATE_NO_INVOCATIONS_NV"("0x9564")
        "GL_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV"("0x9565")
        "GL_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV"("0x9566")
        "GL_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV"("0x9567")
        "GL_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV"("0x9568")
        "GL_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV"("0x9569")
        "GL_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV"("0x956A")
        "GL_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV"("0x956B")
        "GL_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV"("0x956C")
        "GL_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV"("0x956D")
        "GL_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV"("0x956E")
        "GL_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV"("0x956F")
        "GL_SHADING_RATE_IMAGE_BINDING_NV"("0x955B")
        "GL_SHADING_RATE_IMAGE_TEXEL_WIDTH_NV"("0x955C")
        "GL_SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV"("0x955D")
        "GL_SHADING_RATE_IMAGE_PALETTE_SIZE_NV"("0x955E")
        "GL_MAX_COARSE_FRAGMENT_SAMPLES_NV"("0x955F")
        "GL_SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV"("0x95AE")
        "GL_SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV"("0x95AF")
        "GL_SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV"("0x95B0")
        "glBindShadingRateImageNV"(void, GLuint("texture"))
        "glGetShadingRateImagePaletteNV"(void, GLuint("viewport"), GLuint("entry"), address("rate", "GLenum *"))
        "glGetShadingRateSampleLocationivNV"(
            void,
            GLenum("rate"),
            GLuint("samples"),
            GLuint("index"),
            address("location", "GLint *")
        )
        "glShadingRateImageBarrierNV"(void, GLboolean("synchronize"))
        "glShadingRateImagePaletteNV"(
            void,
            GLuint("viewport"),
            GLuint("first"),
            GLsizei("count"),
            address("rates", "const GLenum *")
        )
        "glShadingRateSampleOrderNV"(void, GLenum("order"))
        "glShadingRateSampleOrderCustomNV"(
            void,
            GLenum("rate"),
            GLuint("samples"),
            address("locations", "const GLint *")
        )
    }
    file(
        "TessellationProgram5", NV, "GL_NV_tessellation_program5",
        "GL_MAX_PROGRAM_PATCH_ATTRIBS_NV" to "0x86D8",
        "GL_TESS_CONTROL_PROGRAM_NV" to "0x891E",
        "GL_TESS_EVALUATION_PROGRAM_NV" to "0x891F",
        "GL_TESS_CONTROL_PROGRAM_PARAMETER_BUFFER_NV" to "0x8C74",
        "GL_TESS_EVALUATION_PROGRAM_PARAMETER_BUFFER_NV" to "0x8C75"
    )
    file(
        "TexgenEmboss", NV, "GL_NV_texgen_emboss",
        "GL_EMBOSS_LIGHT_NV" to "0x855D",
        "GL_EMBOSS_CONSTANT_NV" to "0x855E",
        "GL_EMBOSS_MAP_NV" to "0x855F"
    )
    file(
        "TexgenReflection", NV, "GL_NV_texgen_reflection",
        "GL_NORMAL_MAP_NV" to "0x8511",
        "GL_REFLECTION_MAP_NV" to "0x8512"
    )
    file("TextureBarrier", NV, "GL_NV_texture_barrier") {
        "glTextureBarrierNV"(void)
    }
    file(
        "TextureEnvCombine4", NV, "GL_NV_texture_env_combine4",
        "GL_COMBINE4_NV" to "0x8503",
        "GL_SOURCE3_RGB_NV" to "0x8583",
        "GL_SOURCE3_ALPHA_NV" to "0x858B",
        "GL_OPERAND3_RGB_NV" to "0x8593",
        "GL_OPERAND3_ALPHA_NV" to "0x859B"
    )
    file("TextureExpandNormal", NV, "GL_NV_texture_expand_normal", "GL_TEXTURE_UNSIGNED_REMAP_MODE_NV" to "0x888F")
    file("TextureMultisample", NV, "GL_NV_texture_multisample") {
        "GL_TEXTURE_COVERAGE_SAMPLES_NV"    ("0x9045")
        "GL_TEXTURE_COLOR_SAMPLES_NV"       ("0x9046")
        "glTexImage2DMultisampleCoverageNV" (void, GLenum ("target"), GLsizei ("coverageSamples"), GLsizei ("colorSamples"), GLint ("internalFormat"), GLsizei ("width"), GLsizei ("height"), GLboolean ("fixedSampleLocations"))
        "glTexImage3DMultisampleCoverageNV" (void, GLenum ("target"), GLsizei ("coverageSamples"), GLsizei ("colorSamples"), GLint ("internalFormat"), GLsizei ("width"), GLsizei ("height"), GLsizei ("depth"), GLboolean ("fixedSampleLocations"))
        "glTextureImage2DMultisampleNV" (void, GLuint ("texture"), GLenum ("target"), GLsizei ("samples"), GLint ("internalFormat"), GLsizei ("width"), GLsizei ("height"), GLboolean ("fixedSampleLocations"))
        "glTextureImage3DMultisampleNV" (void, GLuint ("texture"), GLenum ("target"), GLsizei ("samples"), GLint ("internalFormat"), GLsizei ("width"), GLsizei ("height"), GLsizei ("depth"), GLboolean ("fixedSampleLocations"))
        "glTextureImage2DMultisampleCoverageNV" (void, GLuint ("texture"), GLenum ("target"), GLsizei ("coverageSamples"), GLsizei ("colorSamples"), GLint ("internalFormat"), GLsizei ("width"), GLsizei ("height"), GLboolean ("fixedSampleLocations"))
        "glTextureImage3DMultisampleCoverageNV" (void, GLuint ("texture"), GLenum ("target"), GLsizei ("coverageSamples"), GLsizei ("colorSamples"), GLint ("internalFormat"), GLsizei ("width"), GLsizei ("height"), GLsizei ("depth"), GLboolean ("fixedSampleLocations"))
    }
    file(
        "TextureRectangle", NV, "GL_NV_texture_rectangle",
        "GL_TEXTURE_RECTANGLE_NV" to "0x84F5",
        "GL_TEXTURE_BINDING_RECTANGLE_NV" to "0x84F6",
        "GL_PROXY_TEXTURE_RECTANGLE_NV" to "0x84F7",
        "GL_MAX_RECTANGLE_TEXTURE_SIZE_NV" to "0x84F8"
    )
    file(
        "TextureShader", NV, "GL_NV_texture_shader",
        "GL_OFFSET_TEXTURE_RECTANGLE_NV" to "0x864C",
        "GL_OFFSET_TEXTURE_RECTANGLE_SCALE_NV" to "0x864D",
        "GL_DOT_PRODUCT_TEXTURE_RECTANGLE_NV" to "0x864E",
        "GL_RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV" to "0x86D9",
        "GL_UNSIGNED_INT_S8_S8_8_8_NV" to "0x86DA",
        "GL_UNSIGNED_INT_8_8_S8_S8_REV_NV" to "0x86DB",
        "GL_DSDT_MAG_INTENSITY_NV" to "0x86DC",
        "GL_SHADER_CONSISTENT_NV" to "0x86DD",
        "GL_TEXTURE_SHADER_NV" to "0x86DE",
        "GL_SHADER_OPERATION_NV" to "0x86DF",
        "GL_CULL_MODES_NV" to "0x86E0",
        "GL_OFFSET_TEXTURE_MATRIX_NV" to "0x86E1",
        "GL_OFFSET_TEXTURE_SCALE_NV" to "0x86E2",
        "GL_OFFSET_TEXTURE_BIAS_NV" to "0x86E3",
        "GL_OFFSET_TEXTURE_2D_MATRIX_NV" to "0x86E1",
        "GL_OFFSET_TEXTURE_2D_SCALE_NV" to "0x86E2",
        "GL_OFFSET_TEXTURE_2D_BIAS_NV" to "0x86E3",
        "GL_PREVIOUS_TEXTURE_INPUT_NV" to "0x86E4",
        "GL_CONST_EYE_NV" to "0x86E5",
        "GL_PASS_THROUGH_NV" to "0x86E6",
        "GL_CULL_FRAGMENT_NV" to "0x86E7",
        "GL_OFFSET_TEXTURE_2D_NV" to "0x86E8",
        "GL_DEPENDENT_AR_TEXTURE_2D_NV" to "0x86E9",
        "GL_DEPENDENT_GB_TEXTURE_2D_NV" to "0x86EA",
        "GL_DOT_PRODUCT_NV" to "0x86EC",
        "GL_DOT_PRODUCT_DEPTH_REPLACE_NV" to "0x86ED",
        "GL_DOT_PRODUCT_TEXTURE_2D_NV" to "0x86EE",
        "GL_DOT_PRODUCT_TEXTURE_CUBE_MAP_NV" to "0x86F0",
        "GL_DOT_PRODUCT_DIFFUSE_CUBE_MAP_NV" to "0x86F1",
        "GL_DOT_PRODUCT_REFLECT_CUBE_MAP_NV" to "0x86F2",
        "GL_DOT_PRODUCT_CONST_EYE_REFLECT_CUBE_MAP_NV" to "0x86F3",
        "GL_HILO_NV" to "0x86F4",
        "GL_DSDT_NV" to "0x86F5",
        "GL_DSDT_MAG_NV" to "0x86F6",
        "GL_DSDT_MAG_VIB_NV" to "0x86F7",
        "GL_HILO16_NV" to "0x86F8",
        "GL_SIGNED_HILO_NV" to "0x86F9",
        "GL_SIGNED_HILO16_NV" to "0x86FA",
        "GL_SIGNED_RGBA_NV" to "0x86FB",
        "GL_SIGNED_RGBA8_NV" to "0x86FC",
        "GL_SIGNED_RGB_NV" to "0x86FE",
        "GL_SIGNED_RGB8_NV" to "0x86FF",
        "GL_SIGNED_LUMINANCE_NV" to "0x8701",
        "GL_SIGNED_LUMINANCE8_NV" to "0x8702",
        "GL_SIGNED_LUMINANCE_ALPHA_NV" to "0x8703",
        "GL_SIGNED_LUMINANCE8_ALPHA8_NV" to "0x8704",
        "GL_SIGNED_ALPHA_NV" to "0x8705",
        "GL_SIGNED_ALPHA8_NV" to "0x8706",
        "GL_SIGNED_INTENSITY_NV" to "0x8707",
        "GL_SIGNED_INTENSITY8_NV" to "0x8708",
        "GL_DSDT8_NV" to "0x8709",
        "GL_DSDT8_MAG8_NV" to "0x870A",
        "GL_DSDT8_MAG8_INTENSITY8_NV" to "0x870B",
        "GL_SIGNED_RGB_UNSIGNED_ALPHA_NV" to "0x870C",
        "GL_SIGNED_RGB8_UNSIGNED_ALPHA8_NV" to "0x870D",
        "GL_HI_SCALE_NV" to "0x870E",
        "GL_LO_SCALE_NV" to "0x870F",
        "GL_DS_SCALE_NV" to "0x8710",
        "GL_DT_SCALE_NV" to "0x8711",
        "GL_MAGNITUDE_SCALE_NV" to "0x8712",
        "GL_VIBRANCE_SCALE_NV" to "0x8713",
        "GL_HI_BIAS_NV" to "0x8714",
        "GL_LO_BIAS_NV" to "0x8715",
        "GL_DS_BIAS_NV" to "0x8716",
        "GL_DT_BIAS_NV" to "0x8717",
        "GL_MAGNITUDE_BIAS_NV" to "0x8718",
        "GL_VIBRANCE_BIAS_NV" to "0x8719",
        "GL_TEXTURE_BORDER_VALUES_NV" to "0x871A",
        "GL_TEXTURE_HI_SIZE_NV" to "0x871B",
        "GL_TEXTURE_LO_SIZE_NV" to "0x871C",
        "GL_TEXTURE_DS_SIZE_NV" to "0x871D",
        "GL_TEXTURE_DT_SIZE_NV" to "0x871E",
        "GL_TEXTURE_MAG_SIZE_NV" to "0x871F"
    )
    file("TextureShader2", NV, "GL_NV_texture_shader2", "GL_DOT_PRODUCT_TEXTURE_3D_NV" to "0x86EF")
    file(
        "TextureShader3", NV, "GL_NV_texture_shader3",
        "GL_OFFSET_PROJECTIVE_TEXTURE_2D_NV" to "0x8850",
        "GL_OFFSET_PROJECTIVE_TEXTURE_2D_SCALE_NV" to "0x8851",
        "GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_NV" to "0x8852",
        "GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_SCALE_NV" to "0x8853",
        "GL_OFFSET_HILO_TEXTURE_2D_NV" to "0x8854",
        "GL_OFFSET_HILO_TEXTURE_RECTANGLE_NV" to "0x8855",
        "GL_OFFSET_HILO_PROJECTIVE_TEXTURE_2D_NV" to "0x8856",
        "GL_OFFSET_HILO_PROJECTIVE_TEXTURE_RECTANGLE_NV" to "0x8857",
        "GL_DEPENDENT_HILO_TEXTURE_2D_NV" to "0x8858",
        "GL_DEPENDENT_RGB_TEXTURE_3D_NV" to "0x8859",
        "GL_DEPENDENT_RGB_TEXTURE_CUBE_MAP_NV" to "0x885A",
        "GL_DOT_PRODUCT_PASS_THROUGH_NV" to "0x885B",
        "GL_DOT_PRODUCT_TEXTURE_1D_NV" to "0x885C",
        "GL_DOT_PRODUCT_AFFINE_DEPTH_REPLACE_NV" to "0x885D",
        "GL_HILO8_NV" to "0x885E",
        "GL_SIGNED_HILO8_NV" to "0x885F",
        "GL_FORCE_BLUE_TO_ONE_NV" to "0x8860"
    )
    file("TimelineSemaphore", NV, "GL_NV_timeline_semaphore") {
        "GL_TIMELINE_SEMAPHORE_VALUE_NV"("0x9595")
        "GL_SEMAPHORE_TYPE_NV"("0x95B3")
        "GL_SEMAPHORE_TYPE_BINARY_NV"("0x95B4")
        "GL_SEMAPHORE_TYPE_TIMELINE_NV"("0x95B5")
        "GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV"("0x95B6")
        "glCreateSemaphoresNV"(void, GLsizei("n"), address("semaphores", "GLuint *"))
        "glSemaphoreParameterivNV"(void, GLuint("semaphore"), GLenum("pname"), address("params", "const GLint *"))
        "glGetSemaphoreParameterivNV"(void, GLuint("semaphore"), GLenum("pname"), address("params", "GLint *"))
    }
    file("TransformFeedback", NV, "GL_NV_transform_feedback") {
        "GL_BACK_PRIMARY_COLOR_NV"("0x8C77")
        "GL_BACK_SECONDARY_COLOR_NV"("0x8C78")
        "GL_TEXTURE_COORD_NV"("0x8C79")
        "GL_CLIP_DISTANCE_NV"("0x8C7A")
        "GL_VERTEX_ID_NV"("0x8C7B")
        "GL_PRIMITIVE_ID_NV"("0x8C7C")
        "GL_GENERIC_ATTRIB_NV"("0x8C7D")
        "GL_TRANSFORM_FEEDBACK_ATTRIBS_NV"("0x8C7E")
        "GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV"("0x8C7F")
        "GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV"("0x8C80")
        "GL_ACTIVE_VARYINGS_NV"("0x8C81")
        "GL_ACTIVE_VARYING_MAX_LENGTH_NV"("0x8C82")
        "GL_TRANSFORM_FEEDBACK_VARYINGS_NV"("0x8C83")
        "GL_TRANSFORM_FEEDBACK_BUFFER_START_NV"("0x8C84")
        "GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV"("0x8C85")
        "GL_TRANSFORM_FEEDBACK_RECORD_NV"("0x8C86")
        "GL_PRIMITIVES_GENERATED_NV"("0x8C87")
        "GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV"("0x8C88")
        "GL_RASTERIZER_DISCARD_NV"("0x8C89")
        "GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV"("0x8C8A")
        "GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV"("0x8C8B")
        "GL_INTERLEAVED_ATTRIBS_NV"("0x8C8C")
        "GL_SEPARATE_ATTRIBS_NV"("0x8C8D")
        "GL_TRANSFORM_FEEDBACK_BUFFER_NV"("0x8C8E")
        "GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV"("0x8C8F")
        "GL_LAYER_NV"("0x8DAA")
        "GL_NEXT_BUFFER_NV"("-2")
        "GL_SKIP_COMPONENTS4_NV"("-3")
        "GL_SKIP_COMPONENTS3_NV"("-4")
        "GL_SKIP_COMPONENTS2_NV"("-5")
        "GL_SKIP_COMPONENTS1_NV"("-6")
        "glBeginTransformFeedbackNV"(void, GLenum("primitiveMode"))
        "glEndTransformFeedbackNV"(void)
        "glTransformFeedbackAttribsNV"(
            void,
            GLsizei("count"),
            address("attribs", "const GLint *"),
            GLenum("bufferMode")
        )
        "glBindBufferRangeNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size")
        )
        "glBindBufferOffsetNV"(void, GLenum("target"), GLuint("index"), GLuint("buffer"), GLintptr("offset"))
        "glBindBufferBaseNV"(void, GLenum("target"), GLuint("index"), GLuint("buffer"))
        "glTransformFeedbackVaryingsNV"(
            void,
            GLuint("program"),
            GLsizei("count"),
            address("locations", "const GLint *"),
            GLenum("bufferMode")
        )
        "glActiveVaryingNV"(void, GLuint("program"), address("name", "const GLchar *"))
        "glGetVaryingLocationNV"(GLint, GLuint("program"), address("name", "const GLchar *"))
        "glGetActiveVaryingNV"(
            void,
            GLuint("program"),
            GLuint("index"),
            GLsizei("bufSize"),
            address("length", "GLsizei *"),
            address("size", "GLsizei *"),
            address("type", "GLenum *"),
            address("name", "GLchar *")
        )
        "glGetTransformFeedbackVaryingNV"(void, GLuint("program"), GLuint("index"), address("location", "GLint *"))
        "glTransformFeedbackStreamAttribsNV"(
            void,
            GLsizei("count"),
            address("attribs", "const GLint *"),
            GLsizei("nbuffers"),
            address("bufstreams", "const GLint *"),
            GLenum("bufferMode")
        )
    }
    file("TransformFeedback2", NV, "GL_NV_transform_feedback2") {
        "GL_TRANSFORM_FEEDBACK_NV"("0x8E22")
        "GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV"("0x8E23")
        "GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV"("0x8E24")
        "GL_TRANSFORM_FEEDBACK_BINDING_NV"("0x8E25")
        "glBindTransformFeedbackNV"(void, GLenum("target"), GLuint("id"))
        "glDeleteTransformFeedbacksNV"(void, GLsizei("n"), address("ids", "const GLuint *"))
        "glGenTransformFeedbacksNV"(void, GLsizei("n"), address("ids", "GLuint *"))
        "glIsTransformFeedbackNV"(GLboolean, GLuint("id"))
        "glPauseTransformFeedbackNV"(void)
        "glResumeTransformFeedbackNV"(void)
        "glDrawTransformFeedbackNV"(void, GLenum("mode"), GLuint("id"))
    }
    file(
        "UniformBufferUnifiedMemory", NV, "GL_NV_uniform_buffer_unified_memory",
        "GL_UNIFORM_BUFFER_UNIFIED_NV" to "0x936E",
        "GL_UNIFORM_BUFFER_ADDRESS_NV" to "0x936F",
        "GL_UNIFORM_BUFFER_LENGTH_NV" to "0x9370"
    )
    file("VDPAUInterop", NV, "GL_NV_vdpau_interop") {
        "GL_SURFACE_STATE_NV"("0x86EB")
        "GL_SURFACE_REGISTERED_NV"("0x86FD")
        "GL_SURFACE_MAPPED_NV"("0x8700")
        "GL_WRITE_DISCARD_NV"("0x88BE")
        "glVDPAUInitNV"(void, address("vdpDevice", "const void *"), address("getProcAddress", "const void *"))
        "glVDPAUFiniNV"(void)
        "glVDPAURegisterVideoSurfaceNV"(
            GLvdpauSurfaceNV,
            address("vdpSurface", "const void *"),
            GLenum("target"),
            GLsizei("numTextureNames"),
            address("textureNames", "const GLuint *")
        )
        "glVDPAURegisterOutputSurfaceNV"(
            GLvdpauSurfaceNV,
            address("vdpSurface", "const void *"),
            GLenum("target"),
            GLsizei("numTextureNames"),
            address("textureNames", "const GLuint *")
        )
        "glVDPAUIsSurfaceNV"(GLboolean, GLvdpauSurfaceNV("surface"))
        "glVDPAUUnregisterSurfaceNV"(void, GLvdpauSurfaceNV("surface"))
        "glVDPAUGetSurfaceivNV"(
            void,
            GLvdpauSurfaceNV("surface"),
            GLenum("pname"),
            GLsizei("count"),
            address("length", "GLsizei *"),
            address("values", "GLint *")
        )
        "glVDPAUSurfaceAccessNV"(void, GLvdpauSurfaceNV("surface"), GLenum("access"))
        "glVDPAUMapSurfacesNV"(void, GLsizei("numSurfaces"), address("surfaces", "const GLvdpauSurfaceNV *"))
        "glVDPAUUnmapSurfacesNV"(void, GLsizei("numSurface"), address("surfaces", "const GLvdpauSurfaceNV *"))
    }
    file("VDPAUInterop2", NV, "GL_NV_vdpau_interop2") {
        "glVDPAURegisterVideoSurfaceWithPictureStructureNV"(
            GLvdpauSurfaceNV,
            address("vdpSurface", "const void *"),
            GLenum("target"),
            GLsizei("numTextureNames"),
            address("textureNames", "const GLuint *"),
            GLboolean("isFrameStructure")
        )
    }
    file("VertexArrayRange", NV, "GL_NV_vertex_array_range") {
        "GL_VERTEX_ARRAY_RANGE_NV"("0x851D")
        "GL_VERTEX_ARRAY_RANGE_LENGTH_NV"("0x851E")
        "GL_VERTEX_ARRAY_RANGE_VALID_NV"("0x851F")
        "GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV"("0x8520")
        "GL_VERTEX_ARRAY_RANGE_POINTER_NV"("0x8521")
        "glFlushVertexArrayRangeNV"(void)
        "glVertexArrayRangeNV"(void, GLsizei("length"), address("pointer", "const void *"))
    }
    file("VertexArrayRange2", NV, "GL_NV_vertex_array_range2", "GL_VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV" to "0x8533")
    file("VertexAttribInteger64bit", NV, "GL_NV_vertex_attrib_integer_64bit") {
        "glVertexAttribL1i64NV"(void, GLuint("index"), GLint64EXT("x"))
        "glVertexAttribL2i64NV"(void, GLuint("index"), GLint64EXT("x"), GLint64EXT("y"))
        "glVertexAttribL3i64NV"(void, GLuint("index"), GLint64EXT("x"), GLint64EXT("y"), GLint64EXT("z"))
        "glVertexAttribL4i64NV"(
            void,
            GLuint("index"),
            GLint64EXT("x"),
            GLint64EXT("y"),
            GLint64EXT("z"),
            GLint64EXT("w")
        )
        "glVertexAttribL1i64vNV"(void, GLuint("index"), address("v", "const GLint64EXT *"))
        "glVertexAttribL2i64vNV"(void, GLuint("index"), address("v", "const GLint64EXT *"))
        "glVertexAttribL3i64vNV"(void, GLuint("index"), address("v", "const GLint64EXT *"))
        "glVertexAttribL4i64vNV"(void, GLuint("index"), address("v", "const GLint64EXT *"))
        "glVertexAttribL1ui64NV"(void, GLuint("index"), GLuint64EXT("x"))
        "glVertexAttribL2ui64NV"(void, GLuint("index"), GLuint64EXT("x"), GLuint64EXT("y"))
        "glVertexAttribL3ui64NV"(void, GLuint("index"), GLuint64EXT("x"), GLuint64EXT("y"), GLuint64EXT("z"))
        "glVertexAttribL4ui64NV"(
            void,
            GLuint("index"),
            GLuint64EXT("x"),
            GLuint64EXT("y"),
            GLuint64EXT("z"),
            GLuint64EXT("w")
        )
        "glVertexAttribL1ui64vNV"(void, GLuint("index"), address("v", "const GLuint64EXT *"))
        "glVertexAttribL2ui64vNV"(void, GLuint("index"), address("v", "const GLuint64EXT *"))
        "glVertexAttribL3ui64vNV"(void, GLuint("index"), address("v", "const GLuint64EXT *"))
        "glVertexAttribL4ui64vNV"(void, GLuint("index"), address("v", "const GLuint64EXT *"))
        "glGetVertexAttribLi64vNV"(void, GLuint("index"), GLenum("pname"), address("params", "GLint64EXT *"))
        "glGetVertexAttribLui64vNV"(void, GLuint("index"), GLenum("pname"), address("params", "GLuint64EXT *"))
        "glVertexAttribLFormatNV"(void, GLuint("index"), GLint("size"), GLenum("type"), GLsizei("stride"))
    }
    file("VertexBufferUnifiedMemory", NV, "GL_NV_vertex_buffer_unified_memory") {
        "GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV"("0x8F1E")
        "GL_ELEMENT_ARRAY_UNIFIED_NV"("0x8F1F")
        "GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV"("0x8F20")
        "GL_VERTEX_ARRAY_ADDRESS_NV"("0x8F21")
        "GL_NORMAL_ARRAY_ADDRESS_NV"("0x8F22")
        "GL_COLOR_ARRAY_ADDRESS_NV"("0x8F23")
        "GL_INDEX_ARRAY_ADDRESS_NV"("0x8F24")
        "GL_TEXTURE_COORD_ARRAY_ADDRESS_NV"("0x8F25")
        "GL_EDGE_FLAG_ARRAY_ADDRESS_NV"("0x8F26")
        "GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV"("0x8F27")
        "GL_FOG_COORD_ARRAY_ADDRESS_NV"("0x8F28")
        "GL_ELEMENT_ARRAY_ADDRESS_NV"("0x8F29")
        "GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV"("0x8F2A")
        "GL_VERTEX_ARRAY_LENGTH_NV"("0x8F2B")
        "GL_NORMAL_ARRAY_LENGTH_NV"("0x8F2C")
        "GL_COLOR_ARRAY_LENGTH_NV"("0x8F2D")
        "GL_INDEX_ARRAY_LENGTH_NV"("0x8F2E")
        "GL_TEXTURE_COORD_ARRAY_LENGTH_NV"("0x8F2F")
        "GL_EDGE_FLAG_ARRAY_LENGTH_NV"("0x8F30")
        "GL_SECONDARY_COLOR_ARRAY_LENGTH_NV"("0x8F31")
        "GL_FOG_COORD_ARRAY_LENGTH_NV"("0x8F32")
        "GL_ELEMENT_ARRAY_LENGTH_NV"("0x8F33")
        "GL_DRAW_INDIRECT_UNIFIED_NV"("0x8F40")
        "GL_DRAW_INDIRECT_ADDRESS_NV"("0x8F41")
        "GL_DRAW_INDIRECT_LENGTH_NV"("0x8F42")
        "glBufferAddressRangeNV"(void, GLenum("pname"), GLuint("index"), GLuint64EXT("address"), GLsizeiptr("length"))
        "glVertexFormatNV"(void, GLint("size"), GLenum("type"), GLsizei("stride"))
        "glNormalFormatNV"(void, GLenum("type"), GLsizei("stride"))
        "glColorFormatNV"(void, GLint("size"), GLenum("type"), GLsizei("stride"))
        "glIndexFormatNV"(void, GLenum("type"), GLsizei("stride"))
        "glTexCoordFormatNV"(void, GLint("size"), GLenum("type"), GLsizei("stride"))
        "glEdgeFlagFormatNV"(void, GLsizei("stride"))
        "glSecondaryColorFormatNV"(void, GLint("size"), GLenum("type"), GLsizei("stride"))
        "glFogCoordFormatNV"(void, GLenum("type"), GLsizei("stride"))
        "glVertexAttribFormatNV"(
            void,
            GLuint("index"),
            GLint("size"),
            GLenum("type"),
            GLboolean("normalized"),
            GLsizei("stride")
        )
        "glVertexAttribIFormatNV"(void, GLuint("index"), GLint("size"), GLenum("type"), GLsizei("stride"))
        "glGetIntegerui64i_vNV"(void, GLenum("value"), GLuint("index"), address("result", "GLuint64EXT *"))
    }
    file("VertexProgram", NV, "GL_NV_vertex_program") {
        "GL_VERTEX_PROGRAM_NV"("0x8620")
        "GL_VERTEX_STATE_PROGRAM_NV"("0x8621")
        "GL_ATTRIB_ARRAY_SIZE_NV"("0x8623")
        "GL_ATTRIB_ARRAY_STRIDE_NV"("0x8624")
        "GL_ATTRIB_ARRAY_TYPE_NV"("0x8625")
        "GL_CURRENT_ATTRIB_NV"("0x8626")
        "GL_PROGRAM_LENGTH_NV"("0x8627")
        "GL_PROGRAM_STRING_NV"("0x8628")
        "GL_MODELVIEW_PROJECTION_NV"("0x8629")
        "GL_IDENTITY_NV"("0x862A")
        "GL_INVERSE_NV"("0x862B")
        "GL_TRANSPOSE_NV"("0x862C")
        "GL_INVERSE_TRANSPOSE_NV"("0x862D")
        "GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV"("0x862E")
        "GL_MAX_TRACK_MATRICES_NV"("0x862F")
        "GL_MATRIX0_NV"("0x8630")
        "GL_MATRIX1_NV"("0x8631")
        "GL_MATRIX2_NV"("0x8632")
        "GL_MATRIX3_NV"("0x8633")
        "GL_MATRIX4_NV"("0x8634")
        "GL_MATRIX5_NV"("0x8635")
        "GL_MATRIX6_NV"("0x8636")
        "GL_MATRIX7_NV"("0x8637")
        "GL_CURRENT_MATRIX_STACK_DEPTH_NV"("0x8640")
        "GL_CURRENT_MATRIX_NV"("0x8641")
        "GL_VERTEX_PROGRAM_POINT_SIZE_NV"("0x8642")
        "GL_VERTEX_PROGRAM_TWO_SIDE_NV"("0x8643")
        "GL_PROGRAM_PARAMETER_NV"("0x8644")
        "GL_ATTRIB_ARRAY_POINTER_NV"("0x8645")
        "GL_PROGRAM_TARGET_NV"("0x8646")
        "GL_PROGRAM_RESIDENT_NV"("0x8647")
        "GL_TRACK_MATRIX_NV"("0x8648")
        "GL_TRACK_MATRIX_TRANSFORM_NV"("0x8649")
        "GL_VERTEX_PROGRAM_BINDING_NV"("0x864A")
        "GL_PROGRAM_ERROR_POSITION_NV"("0x864B")
        "GL_VERTEX_ATTRIB_ARRAY0_NV"("0x8650")
        "GL_VERTEX_ATTRIB_ARRAY1_NV"("0x8651")
        "GL_VERTEX_ATTRIB_ARRAY2_NV"("0x8652")
        "GL_VERTEX_ATTRIB_ARRAY3_NV"("0x8653")
        "GL_VERTEX_ATTRIB_ARRAY4_NV"("0x8654")
        "GL_VERTEX_ATTRIB_ARRAY5_NV"("0x8655")
        "GL_VERTEX_ATTRIB_ARRAY6_NV"("0x8656")
        "GL_VERTEX_ATTRIB_ARRAY7_NV"("0x8657")
        "GL_VERTEX_ATTRIB_ARRAY8_NV"("0x8658")
        "GL_VERTEX_ATTRIB_ARRAY9_NV"("0x8659")
        "GL_VERTEX_ATTRIB_ARRAY10_NV"("0x865A")
        "GL_VERTEX_ATTRIB_ARRAY11_NV"("0x865B")
        "GL_VERTEX_ATTRIB_ARRAY12_NV"("0x865C")
        "GL_VERTEX_ATTRIB_ARRAY13_NV"("0x865D")
        "GL_VERTEX_ATTRIB_ARRAY14_NV"("0x865E")
        "GL_VERTEX_ATTRIB_ARRAY15_NV"("0x865F")
        "GL_MAP1_VERTEX_ATTRIB0_4_NV"("0x8660")
        "GL_MAP1_VERTEX_ATTRIB1_4_NV"("0x8661")
        "GL_MAP1_VERTEX_ATTRIB2_4_NV"("0x8662")
        "GL_MAP1_VERTEX_ATTRIB3_4_NV"("0x8663")
        "GL_MAP1_VERTEX_ATTRIB4_4_NV"("0x8664")
        "GL_MAP1_VERTEX_ATTRIB5_4_NV"("0x8665")
        "GL_MAP1_VERTEX_ATTRIB6_4_NV"("0x8666")
        "GL_MAP1_VERTEX_ATTRIB7_4_NV"("0x8667")
        "GL_MAP1_VERTEX_ATTRIB8_4_NV"("0x8668")
        "GL_MAP1_VERTEX_ATTRIB9_4_NV"("0x8669")
        "GL_MAP1_VERTEX_ATTRIB10_4_NV"("0x866A")
        "GL_MAP1_VERTEX_ATTRIB11_4_NV"("0x866B")
        "GL_MAP1_VERTEX_ATTRIB12_4_NV"("0x866C")
        "GL_MAP1_VERTEX_ATTRIB13_4_NV"("0x866D")
        "GL_MAP1_VERTEX_ATTRIB14_4_NV"("0x866E")
        "GL_MAP1_VERTEX_ATTRIB15_4_NV"("0x866F")
        "GL_MAP2_VERTEX_ATTRIB0_4_NV"("0x8670")
        "GL_MAP2_VERTEX_ATTRIB1_4_NV"("0x8671")
        "GL_MAP2_VERTEX_ATTRIB2_4_NV"("0x8672")
        "GL_MAP2_VERTEX_ATTRIB3_4_NV"("0x8673")
        "GL_MAP2_VERTEX_ATTRIB4_4_NV"("0x8674")
        "GL_MAP2_VERTEX_ATTRIB5_4_NV"("0x8675")
        "GL_MAP2_VERTEX_ATTRIB6_4_NV"("0x8676")
        "GL_MAP2_VERTEX_ATTRIB7_4_NV"("0x8677")
        "GL_MAP2_VERTEX_ATTRIB8_4_NV"("0x8678")
        "GL_MAP2_VERTEX_ATTRIB9_4_NV"("0x8679")
        "GL_MAP2_VERTEX_ATTRIB10_4_NV"("0x867A")
        "GL_MAP2_VERTEX_ATTRIB11_4_NV"("0x867B")
        "GL_MAP2_VERTEX_ATTRIB12_4_NV"("0x867C")
        "GL_MAP2_VERTEX_ATTRIB13_4_NV"("0x867D")
        "GL_MAP2_VERTEX_ATTRIB14_4_NV"("0x867E")
        "GL_MAP2_VERTEX_ATTRIB15_4_NV"("0x867F")
        "glAreProgramsResidentNV"(
            GLboolean,
            GLsizei("n"),
            address("programs", "const GLuint *"),
            address("residences", "GLboolean *")
        )
        "glBindProgramNV"(void, GLenum("target"), GLuint("id"))
        "glDeleteProgramsNV"(void, GLsizei("n"), address("programs", "const GLuint *"))
        "glExecuteProgramNV"(void, GLenum("target"), GLuint("id"), address("params", "const GLfloat *"))
        "glGenProgramsNV"(void, GLsizei("n"), address("programs", "GLuint *"))
        "glGetProgramParameterdvNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLenum("pname"),
            address("params", "GLdouble *")
        )
        "glGetProgramParameterfvNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetProgramivNV"(void, GLuint("id"), GLenum("pname"), address("params", "GLint *"))
        "glGetProgramStringNV"(void, GLuint("id"), GLenum("pname"), address("program", "GLubyte *"))
        "glGetTrackMatrixivNV"(void, GLenum("target"), GLuint("address"), GLenum("pname"), address("params", "GLint *"))
        "glGetVertexAttribdvNV"(void, GLuint("index"), GLenum("pname"), address("params", "GLdouble *"))
        "glGetVertexAttribfvNV"(void, GLuint("index"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetVertexAttribivNV"(void, GLuint("index"), GLenum("pname"), address("params", "GLint *"))
        "glGetVertexAttribPointervNV"(void, GLuint("index"), GLenum("pname"), address("pointer", "void **"))
        "glIsProgramNV"(GLboolean, GLuint("id"))
        "glLoadProgramNV"(void, GLenum("target"), GLuint("id"), GLsizei("len"), address("program", "const GLubyte *"))
        "glProgramParameter4dNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLdouble("x"),
            GLdouble("y"),
            GLdouble("z"),
            GLdouble("w")
        )
        "glProgramParameter4dvNV"(void, GLenum("target"), GLuint("index"), address("v", "const GLdouble *"))
        "glProgramParameter4fNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z"),
            GLfloat("w")
        )
        "glProgramParameter4fvNV"(void, GLenum("target"), GLuint("index"), address("v", "const GLfloat *"))
        "glProgramParameters4dvNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("v", "const GLdouble *")
        )
        "glProgramParameters4fvNV"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("v", "const GLfloat *")
        )
        "glRequestResidentProgramsNV"(void, GLsizei("n"), address("programs", "const GLuint *"))
        "glTrackMatrixNV"(void, GLenum("target"), GLuint("address"), GLenum("matrix"), GLenum("transform"))
        "glVertexAttribPointerNV"(
            void,
            GLuint("index"),
            GLint("fsize"),
            GLenum("type"),
            GLsizei("stride"),
            address("pointer", "const void *")
        )
        "glVertexAttrib1dNV"(void, GLuint("index"), GLdouble("x"))
        "glVertexAttrib1dvNV"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttrib1fNV"(void, GLuint("index"), GLfloat("x"))
        "glVertexAttrib1fvNV"(void, GLuint("index"), address("v", "const GLfloat *"))
        "glVertexAttrib1sNV"(void, GLuint("index"), GLshort("x"))
        "glVertexAttrib1svNV"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib2dNV"(void, GLuint("index"), GLdouble("x"), GLdouble("y"))
        "glVertexAttrib2dvNV"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttrib2fNV"(void, GLuint("index"), GLfloat("x"), GLfloat("y"))
        "glVertexAttrib2fvNV"(void, GLuint("index"), address("v", "const GLfloat *"))
        "glVertexAttrib2sNV"(void, GLuint("index"), GLshort("x"), GLshort("y"))
        "glVertexAttrib2svNV"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib3dNV"(void, GLuint("index"), GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glVertexAttrib3dvNV"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttrib3fNV"(void, GLuint("index"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glVertexAttrib3fvNV"(void, GLuint("index"), address("v", "const GLfloat *"))
        "glVertexAttrib3sNV"(void, GLuint("index"), GLshort("x"), GLshort("y"), GLshort("z"))
        "glVertexAttrib3svNV"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib4dNV"(void, GLuint("index"), GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))
        "glVertexAttrib4dvNV"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttrib4fNV"(void, GLuint("index"), GLfloat("x"), GLfloat("y"), GLfloat("z"), GLfloat("w"))
        "glVertexAttrib4fvNV"(void, GLuint("index"), address("v", "const GLfloat *"))
        "glVertexAttrib4sNV"(void, GLuint("index"), GLshort("x"), GLshort("y"), GLshort("z"), GLshort("w"))
        "glVertexAttrib4svNV"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttrib4ubNV"(void, GLuint("index"), GLubyte("x"), GLubyte("y"), GLubyte("z"), GLubyte("w"))
        "glVertexAttrib4ubvNV"(void, GLuint("index"), address("v", "const GLubyte *"))
        "glVertexAttribs1dvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLdouble *"))
        "glVertexAttribs1fvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLfloat *"))
        "glVertexAttribs1svNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLshort *"))
        "glVertexAttribs2dvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLdouble *"))
        "glVertexAttribs2fvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLfloat *"))
        "glVertexAttribs2svNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLshort *"))
        "glVertexAttribs3dvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLdouble *"))
        "glVertexAttribs3fvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLfloat *"))
        "glVertexAttribs3svNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLshort *"))
        "glVertexAttribs4dvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLdouble *"))
        "glVertexAttribs4fvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLfloat *"))
        "glVertexAttribs4svNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLshort *"))
        "glVertexAttribs4ubvNV"(void, GLuint("index"), GLsizei("count"), address("v", "const GLubyte *"))
    }
    file("VertexProgram4", NV, "GL_NV_vertex_program4", "GL_VERTEX_ATTRIB_ARRAY_INTEGER_NV" to "0x88FD")
    file("VideoCapture", NV, "GL_NV_video_capture") {
        "GL_VIDEO_BUFFER_NV"("0x9020")
        "GL_VIDEO_BUFFER_BINDING_NV"("0x9021")
        "GL_FIELD_UPPER_NV"("0x9022")
        "GL_FIELD_LOWER_NV"("0x9023")
        "GL_NUM_VIDEO_CAPTURE_STREAMS_NV"("0x9024")
        "GL_NEXT_VIDEO_CAPTURE_BUFFER_STATUS_NV"("0x9025")
        "GL_VIDEO_CAPTURE_TO_422_SUPPORTED_NV"("0x9026")
        "GL_LAST_VIDEO_CAPTURE_STATUS_NV"("0x9027")
        "GL_VIDEO_BUFFER_PITCH_NV"("0x9028")
        "GL_VIDEO_COLOR_CONVERSION_MATRIX_NV"("0x9029")
        "GL_VIDEO_COLOR_CONVERSION_MAX_NV"("0x902A")
        "GL_VIDEO_COLOR_CONVERSION_MIN_NV"("0x902B")
        "GL_VIDEO_COLOR_CONVERSION_OFFSET_NV"("0x902C")
        "GL_VIDEO_BUFFER_INTERNAL_FORMAT_NV"("0x902D")
        "GL_PARTIAL_SUCCESS_NV"("0x902E")
        "GL_SUCCESS_NV"("0x902F")
        "GL_FAILURE_NV"("0x9030")
        "GL_YCBYCR8_422_NV"("0x9031")
        "GL_YCBAYCR8A_4224_NV"("0x9032")
        "GL_Z6Y10Z6CB10Z6Y10Z6CR10_422_NV"("0x9033")
        "GL_Z6Y10Z6CB10Z6A10Z6Y10Z6CR10Z6A10_4224_NV"("0x9034")
        "GL_Z4Y12Z4CB12Z4Y12Z4CR12_422_NV"("0x9035")
        "GL_Z4Y12Z4CB12Z4A12Z4Y12Z4CR12Z4A12_4224_NV"("0x9036")
        "GL_Z4Y12Z4CB12Z4CR12_444_NV"("0x9037")
        "GL_VIDEO_CAPTURE_FRAME_WIDTH_NV"("0x9038")
        "GL_VIDEO_CAPTURE_FRAME_HEIGHT_NV"("0x9039")
        "GL_VIDEO_CAPTURE_FIELD_UPPER_HEIGHT_NV"("0x903A")
        "GL_VIDEO_CAPTURE_FIELD_LOWER_HEIGHT_NV"("0x903B")
        "GL_VIDEO_CAPTURE_SURFACE_ORIGIN_NV"("0x903C")
        "glBeginVideoCaptureNV"(void, GLuint("video_capture_slot"))
        "glBindVideoCaptureStreamBufferNV"(
            void,
            GLuint("video_capture_slot"),
            GLuint("stream"),
            GLenum("frame_region"),
            GLintptrARB("offset")
        )
        "glBindVideoCaptureStreamTextureNV"(
            void,
            GLuint("video_capture_slot"),
            GLuint("stream"),
            GLenum("frame_region"),
            GLenum("target"),
            GLuint("texture")
        )
        "glEndVideoCaptureNV"(void, GLuint("video_capture_slot"))
        "glGetVideoCaptureivNV"(void, GLuint("video_capture_slot"), GLenum("pname"), address("params", "GLint *"))
        "glGetVideoCaptureStreamivNV"(
            void,
            GLuint("video_capture_slot"),
            GLuint("stream"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetVideoCaptureStreamfvNV"(
            void,
            GLuint("video_capture_slot"),
            GLuint("stream"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetVideoCaptureStreamdvNV"(
            void,
            GLuint("video_capture_slot"),
            GLuint("stream"),
            GLenum("pname"),
            address("params", "GLdouble *")
        )
        "glVideoCaptureNV"(
            GLenum,
            GLuint("video_capture_slot"),
            address("sequence_num", "GLuint *"),
            address("capture_time", "GLuint64EXT *")
        )
        "glVideoCaptureStreamParameterivNV"(
            void,
            GLuint("video_capture_slot"),
            GLuint("stream"),
            GLenum("pname"),
            address("params", "const GLint *")
        )
        "glVideoCaptureStreamParameterfvNV"(
            void,
            GLuint("video_capture_slot"),
            GLuint("stream"),
            GLenum("pname"),
            address("params", "const GLfloat *")
        )
        "glVideoCaptureStreamParameterdvNV"(
            void,
            GLuint("video_capture_slot"),
            GLuint("stream"),
            GLenum("pname"),
            address("params", "const GLdouble *")
        )
    }
    file("ViewportSwizzle", NV, "GL_NV_viewport_swizzle") {
        "GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV"("0x9350")
        "GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV"("0x9351")
        "GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV"("0x9352")
        "GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV"("0x9353")
        "GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV"("0x9354")
        "GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV"("0x9355")
        "GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV"("0x9356")
        "GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV"("0x9357")
        "GL_VIEWPORT_SWIZZLE_X_NV"("0x9358")
        "GL_VIEWPORT_SWIZZLE_Y_NV"("0x9359")
        "GL_VIEWPORT_SWIZZLE_Z_NV"("0x935A")
        "GL_VIEWPORT_SWIZZLE_W_NV"("0x935B")
        "glViewportSwizzleNV"(
            void,
            GLuint("index"),
            GLenum("swizzlex"),
            GLenum("swizzley"),
            GLenum("swizzlez"),
            GLenum("swizzlew")
        )
    }
}
