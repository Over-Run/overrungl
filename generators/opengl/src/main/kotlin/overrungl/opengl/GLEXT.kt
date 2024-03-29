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

import overrungl.opengl.OpenGLExt.EXT

/**
 * @author squid233
 * @since 0.1.0
 */
fun ext() {
    file(
        "422Pixels", EXT, "GL_EXT_422_pixels",
        "GL_422_EXT" to "0x80CC",
        "GL_422_REV_EXT" to "0x80CD",
        "GL_422_AVERAGE_EXT" to "0x80CE",
        "GL_422_REV_AVERAGE_EXT" to "0x80CF"
    )
    file("EGLImageStorage", EXT, "GL_EXT_EGL_image_storage") {
        "glEGLImageTargetTexStorageEXT"(
            void,
            GLenum("target"),
            address("image", "GLeglImageOES"),
            address("attrib_list", "const GLint*")
        )
        "glEGLImageTargetTextureStorageEXT"(
            void,
            GLuint("texture"),
            address("image", "GLeglImageOES"),
            address("attrib_list", "const GLint*")
        )
    }
    file("Abgr", EXT, "GL_EXT_abgr", "GL_ABGR_EXT" to "0x8000")
    file(
        "Bgra", EXT, "GL_EXT_bgra",
        "GL_BGR_EXT" to "0x80E0",
        "GL_BGRA_EXT" to "0x80E1"
    )
    file("BindableUniform", EXT, "GL_EXT_bindable_uniform") {
        "GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT"("0x8DE2")
        "GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT"("0x8DE3")
        "GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT"("0x8DE4")
        "GL_MAX_BINDABLE_UNIFORM_SIZE_EXT"("0x8DED")
        "GL_UNIFORM_BUFFER_EXT"("0x8DEE")
        "GL_UNIFORM_BUFFER_BINDING_EXT"("0x8DEF")
        "glUniformBufferEXT"(void, GLuint("program"), GLint("location"), GLuint("buffer"))
        "glGetUniformBufferSizeEXT"(GLint, GLuint("program"), GLint("location"))
        "glGetUniformOffsetEXT"(GLintptr, GLuint("program"), GLint("location"))
    }
    file("BlendColor", EXT, "GL_EXT_blend_color") {
        "GL_CONSTANT_COLOR_EXT"("0x8001")
        "GL_ONE_MINUS_CONSTANT_COLOR_EXT"("0x8002")
        "GL_CONSTANT_ALPHA_EXT"("0x8003")
        "GL_ONE_MINUS_CONSTANT_ALPHA_EXT"("0x8004")
        "GL_BLEND_COLOR_EXT"("0x8005")
        "glBlendColorEXT"(void, GLfloat("red"), GLfloat("green"), GLfloat("blue"), GLfloat("alpha"))
    }
    file("BlendEquationSeparate", EXT, "GL_EXT_blend_equation_separate") {
        "GL_BLEND_EQUATION_RGB_EXT"("0x8009")
        "GL_BLEND_EQUATION_ALPHA_EXT"("0x883D")
        "glBlendEquationSeparateEXT"(void, GLenum("modeRGB"), GLenum("modeAlpha"))
    }
    file("BlendFuncSeparate", EXT, "GL_EXT_blend_func_separate") {
        "GL_BLEND_DST_RGB_EXT"("0x80C8")
        "GL_BLEND_SRC_RGB_EXT"("0x80C9")
        "GL_BLEND_DST_ALPHA_EXT"("0x80CA")
        "GL_BLEND_SRC_ALPHA_EXT"("0x80CB")
        "glBlendFuncSeparateEXT"(
            void,
            GLenum("sfactorRGB"),
            GLenum("dfactorRGB"),
            GLenum("sfactorAlpha"),
            GLenum("dfactorAlpha")
        )
    }
    file("BlendMinmax", EXT, "GL_EXT_blend_minmax") {
        "GL_MIN_EXT"("0x8007")
        "GL_MAX_EXT"("0x8008")
        "GL_FUNC_ADD_EXT"("0x8006")
        "GL_BLEND_EQUATION_EXT"("0x8009")
        "glBlendEquationEXT"(void, GLenum("mode"))
    }
    file(
        "BlendSubtract", EXT, "GL_EXT_blend_subtract",
        "GL_FUNC_SUBTRACT_EXT" to "0x800A",
        "GL_FUNC_REVERSE_SUBTRACT_EXT" to "0x800B"
    )
    file("ClipVolumeHint", EXT, "GL_EXT_clip_volume_hint", "GL_CLIP_VOLUME_CLIPPING_HINT_EXT" to "0x80F0")
    file(
        "Cmyka", EXT, "GL_EXT_cmyka",
        "GL_CMYK_EXT" to "0x800C",
        "GL_CMYKA_EXT" to "0x800D",
        "GL_PACK_CMYK_HINT_EXT" to "0x800E",
        "GL_UNPACK_CMYK_HINT_EXT" to "0x800F"
    )
    file("ColorSubtable", EXT, "GL_EXT_color_subtable") {
        "glColorSubTableEXT"(
            void,
            GLenum("target"),
            GLsizei("start"),
            GLsizei("count"),
            GLenum("format"),
            GLenum("type"),
            address("data", "const void *")
        )
        "glCopyColorSubTableEXT"(void, GLenum("target"), GLsizei("start"), GLint("x"), GLint("y"), GLsizei("width"))
    }
    file("CompiledVertexArray", EXT, "GL_EXT_compiled_vertex_array") {
        "GL_ARRAY_ELEMENT_LOCK_FIRST_EXT"("0x81A8")
        "GL_ARRAY_ELEMENT_LOCK_COUNT_EXT"("0x81A9")
        "glLockArraysEXT"(void, GLint("first"), GLsizei("count"))
        "glUnlockArraysEXT"(void)
    }
    file("Convolution", EXT, "GL_EXT_convolution") {
        "GL_CONVOLUTION_1D_EXT"("0x8010")
        "GL_CONVOLUTION_2D_EXT"("0x8011")
        "GL_SEPARABLE_2D_EXT"("0x8012")
        "GL_CONVOLUTION_BORDER_MODE_EXT"("0x8013")
        "GL_CONVOLUTION_FILTER_SCALE_EXT"("0x8014")
        "GL_CONVOLUTION_FILTER_BIAS_EXT"("0x8015")
        "GL_REDUCE_EXT"("0x8016")
        "GL_CONVOLUTION_FORMAT_EXT"("0x8017")
        "GL_CONVOLUTION_WIDTH_EXT"("0x8018")
        "GL_CONVOLUTION_HEIGHT_EXT"("0x8019")
        "GL_MAX_CONVOLUTION_WIDTH_EXT"("0x801A")
        "GL_MAX_CONVOLUTION_HEIGHT_EXT"("0x801B")
        "GL_POST_CONVOLUTION_RED_SCALE_EXT"("0x801C")
        "GL_POST_CONVOLUTION_GREEN_SCALE_EXT"("0x801D")
        "GL_POST_CONVOLUTION_BLUE_SCALE_EXT"("0x801E")
        "GL_POST_CONVOLUTION_ALPHA_SCALE_EXT"("0x801F")
        "GL_POST_CONVOLUTION_RED_BIAS_EXT"("0x8020")
        "GL_POST_CONVOLUTION_GREEN_BIAS_EXT"("0x8021")
        "GL_POST_CONVOLUTION_BLUE_BIAS_EXT"("0x8022")
        "GL_POST_CONVOLUTION_ALPHA_BIAS_EXT"("0x8023")
        "glConvolutionFilter1DEXT"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLenum("format"),
            GLenum("type"),
            address("image", "const void *")
        )
        "glConvolutionFilter2DEXT"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLenum("format"),
            GLenum("type"),
            address("image", "const void *")
        )
        "glConvolutionParameterfEXT"(void, GLenum("target"), GLenum("pname"), GLfloat("params"))
        "glConvolutionParameterfvEXT"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfloat *"))
        "glConvolutionParameteriEXT"(void, GLenum("target"), GLenum("pname"), GLint("params"))
        "glConvolutionParameterivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "const GLint *"))
        "glCopyConvolutionFilter1DEXT"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width")
        )
        "glCopyConvolutionFilter2DEXT"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glGetConvolutionFilterEXT"(
            void,
            GLenum("target"),
            GLenum("format"),
            GLenum("type"),
            address("image", "void *")
        )
        "glGetConvolutionParameterfvEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetConvolutionParameterivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetSeparableFilterEXT"(
            void,
            GLenum("target"),
            GLenum("format"),
            GLenum("type"),
            address("row", "void *"),
            address("column", "void *"),
            address("span", "void *")
        )
        "glSeparableFilter2DEXT"(
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
    }
    file("CoordinateFrame", EXT, "GL_EXT_coordinate_frame") {
        "GL_TANGENT_ARRAY_EXT"("0x8439")
        "GL_BINORMAL_ARRAY_EXT"("0x843A")
        "GL_CURRENT_TANGENT_EXT"("0x843B")
        "GL_CURRENT_BINORMAL_EXT"("0x843C")
        "GL_TANGENT_ARRAY_TYPE_EXT"("0x843E")
        "GL_TANGENT_ARRAY_STRIDE_EXT"("0x843F")
        "GL_BINORMAL_ARRAY_TYPE_EXT"("0x8440")
        "GL_BINORMAL_ARRAY_STRIDE_EXT"("0x8441")
        "GL_TANGENT_ARRAY_POINTER_EXT"("0x8442")
        "GL_BINORMAL_ARRAY_POINTER_EXT"("0x8443")
        "GL_MAP1_TANGENT_EXT"("0x8444")
        "GL_MAP2_TANGENT_EXT"("0x8445")
        "GL_MAP1_BINORMAL_EXT"("0x8446")
        "GL_MAP2_BINORMAL_EXT"("0x8447")
        "glTangent3bEXT"(void, GLbyte("tx"), GLbyte("ty"), GLbyte("tz"))
        "glTangent3bvEXT"(void, address("v", "const GLbyte *"))
        "glTangent3dEXT"(void, GLdouble("tx"), GLdouble("ty"), GLdouble("tz"))
        "glTangent3dvEXT"(void, address("v", "const GLdouble *"))
        "glTangent3fEXT"(void, GLfloat("tx"), GLfloat("ty"), GLfloat("tz"))
        "glTangent3fvEXT"(void, address("v", "const GLfloat *"))
        "glTangent3iEXT"(void, GLint("tx"), GLint("ty"), GLint("tz"))
        "glTangent3ivEXT"(void, address("v", "const GLint *"))
        "glTangent3sEXT"(void, GLshort("tx"), GLshort("ty"), GLshort("tz"))
        "glTangent3svEXT"(void, address("v", "const GLshort *"))
        "glBinormal3bEXT"(void, GLbyte("bx"), GLbyte("by"), GLbyte("bz"))
        "glBinormal3bvEXT"(void, address("v", "const GLbyte *"))
        "glBinormal3dEXT"(void, GLdouble("bx"), GLdouble("by"), GLdouble("bz"))
        "glBinormal3dvEXT"(void, address("v", "const GLdouble *"))
        "glBinormal3fEXT"(void, GLfloat("bx"), GLfloat("by"), GLfloat("bz"))
        "glBinormal3fvEXT"(void, address("v", "const GLfloat *"))
        "glBinormal3iEXT"(void, GLint("bx"), GLint("by"), GLint("bz"))
        "glBinormal3ivEXT"(void, address("v", "const GLint *"))
        "glBinormal3sEXT"(void, GLshort("bx"), GLshort("by"), GLshort("bz"))
        "glBinormal3svEXT"(void, address("v", "const GLshort *"))
        "glTangentPointerEXT"(void, GLenum("type"), GLsizei("stride"), address("pointer", "const void *"))
        "glBinormalPointerEXT"(void, GLenum("type"), GLsizei("stride"), address("pointer", "const void *"))
    }
    file("CopyTexture", EXT, "GL_EXT_copy_texture") {
        "glCopyTexImage1DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLint("border")
        )
        "glCopyTexImage2DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height"),
            GLint("border")
        )
        "glCopyTexSubImage1DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width")
        )
        "glCopyTexSubImage2DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glCopyTexSubImage3DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height")
        )
    }
    file("CullVertex", EXT, "GL_EXT_cull_vertex") {
        "GL_CULL_VERTEX_EXT"("0x81AA")
        "GL_CULL_VERTEX_EYE_POSITION_EXT"("0x81AB")
        "GL_CULL_VERTEX_OBJECT_POSITION_EXT"("0x81AC")
        "glCullParameterdvEXT"(void, GLenum("pname"), address("params", "GLdouble *"))
        "glCullParameterfvEXT"(void, GLenum("pname"), address("params", "GLfloat *"))
    }
    file("DebugLabel", EXT, "GL_EXT_debug_label") {
        "GL_PROGRAM_PIPELINE_OBJECT_EXT"("0x8A4F")
        "GL_PROGRAM_OBJECT_EXT"("0x8B40")
        "GL_SHADER_OBJECT_EXT"("0x8B48")
        "GL_BUFFER_OBJECT_EXT"("0x9151")
        "GL_QUERY_OBJECT_EXT"("0x9153")
        "GL_VERTEX_ARRAY_OBJECT_EXT"("0x9154")
        "glLabelObjectEXT"(
            void,
            GLenum("type"),
            GLuint("object"),
            GLsizei("length"),
            address("label", "const GLchar *")
        )
        "glGetObjectLabelEXT"(
            void,
            GLenum("type"),
            GLuint("object"),
            GLsizei("bufSize"),
            address("length", "GLsizei *"),
            address("label", "GLchar *")
        )
    }
    file("DebugMarker", EXT, "GL_EXT_debug_marker") {
        "glInsertEventMarkerEXT"(void, GLsizei("length"), address("marker", "const GLchar *"))
        "glPushGroupMarkerEXT"(void, GLsizei("length"), address("marker", "const GLchar *"))
        "glPopGroupMarkerEXT"(void)
    }
    file("DepthBoundsTest", EXT, "GL_EXT_depth_bounds_test") {
        "GL_DEPTH_BOUNDS_TEST_EXT"("0x8890")
        "GL_DEPTH_BOUNDS_EXT"("0x8891")
        "glDepthBoundsEXT"(void, GLclampd("zmin"), GLclampd("zmax"))
    }
    file("DirectStateAccess", EXT, "GL_EXT_direct_state_access") {
        "GL_PROGRAM_MATRIX_EXT"("0x8E2D")
        "GL_TRANSPOSE_PROGRAM_MATRIX_EXT"("0x8E2E")
        "GL_PROGRAM_MATRIX_STACK_DEPTH_EXT"("0x8E2F")
        "glMatrixLoadfEXT"(void, GLenum("mode"), address("m", "const GLfloat *"))
        "glMatrixLoaddEXT"(void, GLenum("mode"), address("m", "const GLdouble *"))
        "glMatrixMultfEXT"(void, GLenum("mode"), address("m", "const GLfloat *"))
        "glMatrixMultdEXT"(void, GLenum("mode"), address("m", "const GLdouble *"))
        "glMatrixLoadIdentityEXT"(void, GLenum("mode"))
        "glMatrixRotatefEXT"(void, GLenum("mode"), GLfloat("angle"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glMatrixRotatedEXT"(void, GLenum("mode"), GLdouble("angle"), GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glMatrixScalefEXT"(void, GLenum("mode"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glMatrixScaledEXT"(void, GLenum("mode"), GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glMatrixTranslatefEXT"(void, GLenum("mode"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glMatrixTranslatedEXT"(void, GLenum("mode"), GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glMatrixFrustumEXT"(
            void,
            GLenum("mode"),
            GLdouble("left"),
            GLdouble("right"),
            GLdouble("bottom"),
            GLdouble("top"),
            GLdouble("zNear"),
            GLdouble("zFar")
        )
        "glMatrixOrthoEXT"(
            void,
            GLenum("mode"),
            GLdouble("left"),
            GLdouble("right"),
            GLdouble("bottom"),
            GLdouble("top"),
            GLdouble("zNear"),
            GLdouble("zFar")
        )
        "glMatrixPopEXT"(void, GLenum("mode"))
        "glMatrixPushEXT"(void, GLenum("mode"))
        "glClientAttribDefaultEXT"(void, GLbitfield("mask"))
        "glPushClientAttribDefaultEXT"(void, GLbitfield("mask"))
        "glTextureParameterfEXT"(void, GLuint("texture"), GLenum("target"), GLenum("pname"), GLfloat("param"))
        "glTextureParameterfvEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLfloat *")
        )
        "glTextureParameteriEXT"(void, GLuint("texture"), GLenum("target"), GLenum("pname"), GLint("param"))
        "glTextureParameterivEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLint *")
        )
        "glTextureImage1DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("internalformat"),
            GLsizei("width"),
            GLint("border"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glTextureImage2DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLint("border"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glTextureSubImage1DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLsizei("width"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glTextureSubImage2DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glCopyTextureImage1DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLint("border")
        )
        "glCopyTextureImage2DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height"),
            GLint("border")
        )
        "glCopyTextureSubImage1DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width")
        )
        "glCopyTextureSubImage2DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glGetTextureImageEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "void *")
        )
        "glGetTextureParameterfvEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetTextureParameterivEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetTextureLevelParameterfvEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetTextureLevelParameterivEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glTextureImage3DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLint("border"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glTextureSubImage3DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glCopyTextureSubImage3DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glBindMultiTextureEXT"(void, GLenum("texunit"), GLenum("target"), GLuint("texture"))
        "glMultiTexCoordPointerEXT"(
            void,
            GLenum("texunit"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            address("pointer", "const void *")
        )
        "glMultiTexEnvfEXT"(void, GLenum("texunit"), GLenum("target"), GLenum("pname"), GLfloat("param"))
        "glMultiTexEnvfvEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLfloat *")
        )
        "glMultiTexEnviEXT"(void, GLenum("texunit"), GLenum("target"), GLenum("pname"), GLint("param"))
        "glMultiTexEnvivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLint *")
        )
        "glMultiTexGendEXT"(void, GLenum("texunit"), GLenum("coord"), GLenum("pname"), GLdouble("param"))
        "glMultiTexGendvEXT"(
            void,
            GLenum("texunit"),
            GLenum("coord"),
            GLenum("pname"),
            address("params", "const GLdouble *")
        )
        "glMultiTexGenfEXT"(void, GLenum("texunit"), GLenum("coord"), GLenum("pname"), GLfloat("param"))
        "glMultiTexGenfvEXT"(
            void,
            GLenum("texunit"),
            GLenum("coord"),
            GLenum("pname"),
            address("params", "const GLfloat *")
        )
        "glMultiTexGeniEXT"(void, GLenum("texunit"), GLenum("coord"), GLenum("pname"), GLint("param"))
        "glMultiTexGenivEXT"(
            void,
            GLenum("texunit"),
            GLenum("coord"),
            GLenum("pname"),
            address("params", "const GLint *")
        )
        "glGetMultiTexEnvfvEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetMultiTexEnvivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetMultiTexGendvEXT"(
            void,
            GLenum("texunit"),
            GLenum("coord"),
            GLenum("pname"),
            address("params", "GLdouble *")
        )
        "glGetMultiTexGenfvEXT"(
            void,
            GLenum("texunit"),
            GLenum("coord"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetMultiTexGenivEXT"(void, GLenum("texunit"), GLenum("coord"), GLenum("pname"), address("params", "GLint *"))
        "glMultiTexParameteriEXT"(void, GLenum("texunit"), GLenum("target"), GLenum("pname"), GLint("param"))
        "glMultiTexParameterivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLint *")
        )
        "glMultiTexParameterfEXT"(void, GLenum("texunit"), GLenum("target"), GLenum("pname"), GLfloat("param"))
        "glMultiTexParameterfvEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLfloat *")
        )
        "glMultiTexImage1DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("internalformat"),
            GLsizei("width"),
            GLint("border"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glMultiTexImage2DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLint("border"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glMultiTexSubImage1DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLsizei("width"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glMultiTexSubImage2DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glCopyMultiTexImage1DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLint("border")
        )
        "glCopyMultiTexImage2DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height"),
            GLint("border")
        )
        "glCopyMultiTexSubImage1DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width")
        )
        "glCopyMultiTexSubImage2DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glGetMultiTexImageEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "void *")
        )
        "glGetMultiTexParameterfvEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetMultiTexParameterivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetMultiTexLevelParameterfvEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLenum("pname"),
            address("params", "GLfloat *")
        )
        "glGetMultiTexLevelParameterivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glMultiTexImage3DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLint("border"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glMultiTexSubImage3DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glCopyMultiTexSubImage3DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLint("x"),
            GLint("y"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glEnableClientStateIndexedEXT"(void, GLenum("array"), GLuint("index"))
        "glDisableClientStateIndexedEXT"(void, GLenum("array"), GLuint("index"))
        "glGetFloatIndexedvEXT"(void, GLenum("target"), GLuint("index"), address("data", "GLfloat *"))
        "glGetDoubleIndexedvEXT"(void, GLenum("target"), GLuint("index"), address("data", "GLdouble *"))
        "glGetPointerIndexedvEXT"(void, GLenum("target"), GLuint("index"), address("data", "void **"))
        "glEnableIndexedEXT"(void, GLenum("target"), GLuint("index"))
        "glDisableIndexedEXT"(void, GLenum("target"), GLuint("index"))
        "glIsEnabledIndexedEXT"(GLboolean, GLenum("target"), GLuint("index"))
        "glGetIntegerIndexedvEXT"(void, GLenum("target"), GLuint("index"), address("data", "GLint *"))
        "glGetBooleanIndexedvEXT"(void, GLenum("target"), GLuint("index"), address("data", "GLboolean *"))
        "glCompressedTextureImage3DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLint("border"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedTextureImage2DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLint("border"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedTextureImage1DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLint("border"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedTextureSubImage3DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLenum("format"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedTextureSubImage2DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLenum("format"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedTextureSubImage1DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLsizei("width"),
            GLenum("format"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glGetCompressedTextureImageEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLint("lod"),
            address("img", "void *")
        )
        "glCompressedMultiTexImage3DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLint("border"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedMultiTexImage2DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLint("border"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedMultiTexImage1DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLint("border"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedMultiTexSubImage3DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLenum("format"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedMultiTexSubImage2DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLenum("format"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glCompressedMultiTexSubImage1DEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLsizei("width"),
            GLenum("format"),
            GLsizei("imageSize"),
            address("bits", "const void *")
        )
        "glGetCompressedMultiTexImageEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLint("lod"),
            address("img", "void *")
        )
        "glMatrixLoadTransposefEXT"(void, GLenum("mode"), address("m", "const GLfloat *"))
        "glMatrixLoadTransposedEXT"(void, GLenum("mode"), address("m", "const GLdouble *"))
        "glMatrixMultTransposefEXT"(void, GLenum("mode"), address("m", "const GLfloat *"))
        "glMatrixMultTransposedEXT"(void, GLenum("mode"), address("m", "const GLdouble *"))
        "glNamedBufferDataEXT"(
            void,
            GLuint("buffer"),
            GLsizeiptr("size"),
            address("data", "const void *"),
            GLenum("usage")
        )
        "glNamedBufferSubDataEXT"(
            void,
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size"),
            address("data", "const void *")
        )
        "glMapNamedBufferEXT"(address, GLuint("buffer"), GLenum("access"), nativeType = "void *")
        "glUnmapNamedBufferEXT"(GLboolean, GLuint("buffer"))
        "glGetNamedBufferParameterivEXT"(void, GLuint("buffer"), GLenum("pname"), address("params", "GLint *"))
        "glGetNamedBufferPointervEXT"(void, GLuint("buffer"), GLenum("pname"), address("params", "void **"))
        "glGetNamedBufferSubDataEXT"(
            void,
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size"),
            address("data", "void *")
        )
        "glProgramUniform1fEXT"(void, GLuint("program"), GLint("location"), GLfloat("v0"))
        "glProgramUniform2fEXT"(void, GLuint("program"), GLint("location"), GLfloat("v0"), GLfloat("v1"))
        "glProgramUniform3fEXT"(void, GLuint("program"), GLint("location"), GLfloat("v0"), GLfloat("v1"), GLfloat("v2"))
        "glProgramUniform4fEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLfloat("v0"),
            GLfloat("v1"),
            GLfloat("v2"),
            GLfloat("v3")
        )
        "glProgramUniform1iEXT"(void, GLuint("program"), GLint("location"), GLint("v0"))
        "glProgramUniform2iEXT"(void, GLuint("program"), GLint("location"), GLint("v0"), GLint("v1"))
        "glProgramUniform3iEXT"(void, GLuint("program"), GLint("location"), GLint("v0"), GLint("v1"), GLint("v2"))
        "glProgramUniform4iEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLint("v0"),
            GLint("v1"),
            GLint("v2"),
            GLint("v3")
        )
        "glProgramUniform1fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLfloat *")
        )
        "glProgramUniform2fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLfloat *")
        )
        "glProgramUniform3fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLfloat *")
        )
        "glProgramUniform4fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLfloat *")
        )
        "glProgramUniform1ivEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint *")
        )
        "glProgramUniform2ivEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint *")
        )
        "glProgramUniform3ivEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint *")
        )
        "glProgramUniform4ivEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLint *")
        )
        "glProgramUniformMatrix2fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glProgramUniformMatrix3fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glProgramUniformMatrix4fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glProgramUniformMatrix2x3fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glProgramUniformMatrix3x2fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glProgramUniformMatrix2x4fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glProgramUniformMatrix4x2fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glProgramUniformMatrix3x4fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glProgramUniformMatrix4x3fvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLfloat *")
        )
        "glTextureBufferEXT"(void, GLuint("texture"), GLenum("target"), GLenum("internalformat"), GLuint("buffer"))
        "glMultiTexBufferEXT"(void, GLenum("texunit"), GLenum("target"), GLenum("internalformat"), GLuint("buffer"))
        "glTextureParameterIivEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLint *")
        )
        "glTextureParameterIuivEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLuint *")
        )
        "glGetTextureParameterIivEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetTextureParameterIuivEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLuint *")
        )
        "glMultiTexParameterIivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLint *")
        )
        "glMultiTexParameterIuivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "const GLuint *")
        )
        "glGetMultiTexParameterIivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetMultiTexParameterIuivEXT"(
            void,
            GLenum("texunit"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLuint *")
        )
        "glProgramUniform1uiEXT"(void, GLuint("program"), GLint("location"), GLuint("v0"))
        "glProgramUniform2uiEXT"(void, GLuint("program"), GLint("location"), GLuint("v0"), GLuint("v1"))
        "glProgramUniform3uiEXT"(void, GLuint("program"), GLint("location"), GLuint("v0"), GLuint("v1"), GLuint("v2"))
        "glProgramUniform4uiEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLuint("v0"),
            GLuint("v1"),
            GLuint("v2"),
            GLuint("v3")
        )
        "glProgramUniform1uivEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint *")
        )
        "glProgramUniform2uivEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint *")
        )
        "glProgramUniform3uivEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint *")
        )
        "glProgramUniform4uivEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLuint *")
        )
        "glNamedProgramLocalParameters4fvEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLfloat *")
        )
        "glNamedProgramLocalParameterI4iEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            GLint("x"),
            GLint("y"),
            GLint("z"),
            GLint("w")
        )
        "glNamedProgramLocalParameterI4ivEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            address("params", "const GLint *")
        )
        "glNamedProgramLocalParametersI4ivEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLint *")
        )
        "glNamedProgramLocalParameterI4uiEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            GLuint("x"),
            GLuint("y"),
            GLuint("z"),
            GLuint("w")
        )
        "glNamedProgramLocalParameterI4uivEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            address("params", "const GLuint *")
        )
        "glNamedProgramLocalParametersI4uivEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLuint *")
        )
        "glGetNamedProgramLocalParameterIivEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            address("params", "GLint *")
        )
        "glGetNamedProgramLocalParameterIuivEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            address("params", "GLuint *")
        )
        "glEnableClientStateiEXT"(void, GLenum("array"), GLuint("index"))
        "glDisableClientStateiEXT"(void, GLenum("array"), GLuint("index"))
        "glGetFloati_vEXT"(void, GLenum("pname"), GLuint("index"), address("params", "GLfloat *"))
        "glGetDoublei_vEXT"(void, GLenum("pname"), GLuint("index"), address("params", "GLdouble *"))
        "glGetPointeri_vEXT"(void, GLenum("pname"), GLuint("index"), address("params", "void **"))
        "glNamedProgramStringEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLenum("format"),
            GLsizei("len"),
            address("string", "const void *")
        )
        "glNamedProgramLocalParameter4dEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            GLdouble("x"),
            GLdouble("y"),
            GLdouble("z"),
            GLdouble("w")
        )
        "glNamedProgramLocalParameter4dvEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            address("params", "const GLdouble *")
        )
        "glNamedProgramLocalParameter4fEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z"),
            GLfloat("w")
        )
        "glNamedProgramLocalParameter4fvEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            address("params", "const GLfloat *")
        )
        "glGetNamedProgramLocalParameterdvEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            address("params", "GLdouble *")
        )
        "glGetNamedProgramLocalParameterfvEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLuint("index"),
            address("params", "GLfloat *")
        )
        "glGetNamedProgramivEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGetNamedProgramStringEXT"(
            void,
            GLuint("program"),
            GLenum("target"),
            GLenum("pname"),
            address("string", "void *")
        )
        "glNamedRenderbufferStorageEXT"(
            void,
            GLuint("renderbuffer"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glGetNamedRenderbufferParameterivEXT"(
            void,
            GLuint("renderbuffer"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glNamedRenderbufferStorageMultisampleEXT"(
            void,
            GLuint("renderbuffer"),
            GLsizei("samples"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glNamedRenderbufferStorageMultisampleCoverageEXT"(
            void,
            GLuint("renderbuffer"),
            GLsizei("coverageSamples"),
            GLsizei("colorSamples"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glCheckNamedFramebufferStatusEXT"(GLenum, GLuint("framebuffer"), GLenum("target"))
        "glNamedFramebufferTexture1DEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("attachment"),
            GLenum("textarget"),
            GLuint("texture"),
            GLint("level")
        )
        "glNamedFramebufferTexture2DEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("attachment"),
            GLenum("textarget"),
            GLuint("texture"),
            GLint("level")
        )
        "glNamedFramebufferTexture3DEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("attachment"),
            GLenum("textarget"),
            GLuint("texture"),
            GLint("level"),
            GLint("zoffset")
        )
        "glNamedFramebufferRenderbufferEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("attachment"),
            GLenum("renderbuffertarget"),
            GLuint("renderbuffer")
        )
        "glGetNamedFramebufferAttachmentParameterivEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("attachment"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGenerateTextureMipmapEXT"(void, GLuint("texture"), GLenum("target"))
        "glGenerateMultiTexMipmapEXT"(void, GLenum("texunit"), GLenum("target"))
        "glFramebufferDrawBufferEXT"(void, GLuint("framebuffer"), GLenum("mode"))
        "glFramebufferDrawBuffersEXT"(void, GLuint("framebuffer"), GLsizei("n"), address("bufs", "const GLenum *"))
        "glFramebufferReadBufferEXT"(void, GLuint("framebuffer"), GLenum("mode"))
        "glGetFramebufferParameterivEXT"(void, GLuint("framebuffer"), GLenum("pname"), address("params", "GLint *"))
        "glNamedCopyBufferSubDataEXT"(
            void,
            GLuint("readBuffer"),
            GLuint("writeBuffer"),
            GLintptr("readOffset"),
            GLintptr("writeOffset"),
            GLsizeiptr("size")
        )
        "glNamedFramebufferTextureEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("attachment"),
            GLuint("texture"),
            GLint("level")
        )
        "glNamedFramebufferTextureLayerEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("attachment"),
            GLuint("texture"),
            GLint("level"),
            GLint("layer")
        )
        "glNamedFramebufferTextureFaceEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("attachment"),
            GLuint("texture"),
            GLint("level"),
            GLenum("face")
        )
        "glTextureRenderbufferEXT"(void, GLuint("texture"), GLenum("target"), GLuint("renderbuffer"))
        "glMultiTexRenderbufferEXT"(void, GLenum("texunit"), GLenum("target"), GLuint("renderbuffer"))
        "glVertexArrayVertexOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArrayColorOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArrayEdgeFlagOffsetEXT"(void, GLuint("vaobj"), GLuint("buffer"), GLsizei("stride"), GLintptr("offset"))
        "glVertexArrayIndexOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArrayNormalOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArrayTexCoordOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArrayMultiTexCoordOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLenum("texunit"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArrayFogCoordOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArraySecondaryColorOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArrayVertexAttribOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLuint("index"),
            GLint("size"),
            GLenum("type"),
            GLboolean("normalized"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glVertexArrayVertexAttribIOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLuint("index"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glEnableVertexArrayEXT"(void, GLuint("vaobj"), GLenum("array"))
        "glDisableVertexArrayEXT"(void, GLuint("vaobj"), GLenum("array"))
        "glEnableVertexArrayAttribEXT"(void, GLuint("vaobj"), GLuint("index"))
        "glDisableVertexArrayAttribEXT"(void, GLuint("vaobj"), GLuint("index"))
        "glGetVertexArrayIntegervEXT"(void, GLuint("vaobj"), GLenum("pname"), address("param", "GLint *"))
        "glGetVertexArrayPointervEXT"(void, GLuint("vaobj"), GLenum("pname"), address("param", "void **"))
        "glGetVertexArrayIntegeri_vEXT"(
            void,
            GLuint("vaobj"),
            GLuint("index"),
            GLenum("pname"),
            address("param", "GLint *")
        )
        "glGetVertexArrayPointeri_vEXT"(
            void,
            GLuint("vaobj"),
            GLuint("index"),
            GLenum("pname"),
            address("param", "void **")
        )
        "glMapNamedBufferRangeEXT"(
            void,
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("length"),
            GLbitfield("access")
        )
        "glFlushMappedNamedBufferRangeEXT"(void, GLuint("buffer"), GLintptr("offset"), GLsizeiptr("length"))
        "glNamedBufferStorageEXT"(
            void,
            GLuint("buffer"),
            GLsizeiptr("size"),
            address("data", "const void *"),
            GLbitfield("flags")
        )
        "glClearNamedBufferDataEXT"(
            void,
            GLuint("buffer"),
            GLenum("internalformat"),
            GLenum("format"),
            GLenum("type"),
            address("data", "const void *")
        )
        "glClearNamedBufferSubDataEXT"(
            void,
            GLuint("buffer"),
            GLenum("internalformat"),
            GLsizeiptr("offset"),
            GLsizeiptr("size"),
            GLenum("format"),
            GLenum("type"),
            address("data", "const void *")
        )
        "glNamedFramebufferParameteriEXT"(void, GLuint("framebuffer"), GLenum("pname"), GLint("param"))
        "glGetNamedFramebufferParameterivEXT"(
            void,
            GLuint("framebuffer"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glProgramUniform1dEXT"(void, GLuint("program"), GLint("location"), GLdouble("x"))
        "glProgramUniform2dEXT"(void, GLuint("program"), GLint("location"), GLdouble("x"), GLdouble("y"))
        "glProgramUniform3dEXT"(void, GLuint("program"), GLint("location"), GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glProgramUniform4dEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLdouble("x"),
            GLdouble("y"),
            GLdouble("z"),
            GLdouble("w")
        )
        "glProgramUniform1dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLdouble *")
        )
        "glProgramUniform2dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLdouble *")
        )
        "glProgramUniform3dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLdouble *")
        )
        "glProgramUniform4dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix2dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix3dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix4dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix2x3dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix2x4dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix3x2dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix3x4dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix4x2dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glProgramUniformMatrix4x3dvEXT"(
            void,
            GLuint("program"),
            GLint("location"),
            GLsizei("count"),
            GLboolean("transpose"),
            address("value", "const GLdouble *")
        )
        "glTextureBufferRangeEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLenum("internalformat"),
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size")
        )
        "glTextureStorage1DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLsizei("levels"),
            GLenum("internalformat"),
            GLsizei("width")
        )
        "glTextureStorage2DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLsizei("levels"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glTextureStorage3DEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLsizei("levels"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth")
        )
        "glTextureStorage2DMultisampleEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLsizei("samples"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLboolean("fixedsamplelocations")
        )
        "glTextureStorage3DMultisampleEXT"(
            void,
            GLuint("texture"),
            GLenum("target"),
            GLsizei("samples"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLboolean("fixedsamplelocations")
        )
        "glVertexArrayBindVertexBufferEXT"(
            void,
            GLuint("vaobj"),
            GLuint("bindingindex"),
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizei("stride")
        )
        "glVertexArrayVertexAttribFormatEXT"(
            void,
            GLuint("vaobj"),
            GLuint("attribindex"),
            GLint("size"),
            GLenum("type"),
            GLboolean("normalized"),
            GLuint("relativeoffset")
        )
        "glVertexArrayVertexAttribIFormatEXT"(
            void,
            GLuint("vaobj"),
            GLuint("attribindex"),
            GLint("size"),
            GLenum("type"),
            GLuint("relativeoffset")
        )
        "glVertexArrayVertexAttribLFormatEXT"(
            void,
            GLuint("vaobj"),
            GLuint("attribindex"),
            GLint("size"),
            GLenum("type"),
            GLuint("relativeoffset")
        )
        "glVertexArrayVertexAttribBindingEXT"(void, GLuint("vaobj"), GLuint("attribindex"), GLuint("bindingindex"))
        "glVertexArrayVertexBindingDivisorEXT"(void, GLuint("vaobj"), GLuint("bindingindex"), GLuint("divisor"))
        "glVertexArrayVertexAttribLOffsetEXT"(
            void,
            GLuint("vaobj"),
            GLuint("buffer"),
            GLuint("index"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLintptr("offset")
        )
        "glTexturePageCommitmentEXT"(
            void,
            GLuint("texture"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLboolean("commit")
        )
        "glVertexArrayVertexAttribDivisorEXT"(void, GLuint("vaobj"), GLuint("index"), GLuint("divisor"))
    }
    file("DrawBuffers2", EXT, "GL_EXT_draw_buffers2") {
        "glColorMaskIndexedEXT"(void, GLuint("index"), GLboolean("r"), GLboolean("g"), GLboolean("b"), GLboolean("a"))
    }
    file("DrawInstanced", EXT, "GL_EXT_draw_instanced") {
        "glDrawArraysInstancedEXT"(void, GLenum("mode"), GLint("start"), GLsizei("count"), GLsizei("primcount"))
        "glDrawElementsInstancedEXT"(
            void,
            GLenum("mode"),
            GLsizei("count"),
            GLenum("type"),
            address("indices", "const void *"),
            GLsizei("primcount")
        )
    }
    file("DrawRangedElements", EXT, "GL_EXT_draw_range_elements") {
        "GL_MAX_ELEMENTS_VERTICES_EXT"("0x80E8")
        "GL_MAX_ELEMENTS_INDICES_EXT"("0x80E9")
        "glDrawRangeElementsEXT"(
            void,
            GLenum("mode"),
            GLuint("start"),
            GLuint("end"),
            GLsizei("count"),
            GLenum("type"),
            address("indices", "const void *")
        )
    }
    file("ExternalBuffer", EXT, "GL_EXT_external_buffer") {
        "glBufferStorageExternalEXT"(
            void,
            GLenum("target"),
            GLintptr("offset"),
            GLsizeiptr("size"),
            address("clientBuffer", "GLeglClientBufferEXT"),
            GLbitfield("flags")
        )
        "glNamedBufferStorageExternalEXT"(
            void,
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size"),
            address("clientBuffer", "GLeglClientBufferEXT"),
            GLbitfield("flags")
        )
    }
    file("FogCoord", EXT, "GL_EXT_fog_coord") {
        "GL_FOG_COORDINATE_SOURCE_EXT"("0x8450")
        "GL_FOG_COORDINATE_EXT"("0x8451")
        "GL_FRAGMENT_DEPTH_EXT"("0x8452")
        "GL_CURRENT_FOG_COORDINATE_EXT"("0x8453")
        "GL_FOG_COORDINATE_ARRAY_TYPE_EXT"("0x8454")
        "GL_FOG_COORDINATE_ARRAY_STRIDE_EXT"("0x8455")
        "GL_FOG_COORDINATE_ARRAY_POINTER_EXT"("0x8456")
        "GL_FOG_COORDINATE_ARRAY_EXT"("0x8457")
        "glFogCoordfEXT"(void, GLfloat("coord"))
        "glFogCoordfvEXT"(void, address("coord", "const GLfloat *"))
        "glFogCoorddEXT"(void, GLdouble("coord"))
        "glFogCoorddvEXT"(void, address("coord", "const GLdouble *"))
        "glFogCoordPointerEXT"(void, GLenum("type"), GLsizei("stride"), address("pointer", "const void *"))
    }
    file("FramebufferBlit", EXT, "GL_EXT_framebuffer_blit") {
        "GL_READ_FRAMEBUFFER_EXT"("0x8CA8")
        "GL_DRAW_FRAMEBUFFER_EXT"("0x8CA9")
        "GL_DRAW_FRAMEBUFFER_BINDING_EXT"("0x8CA6")
        "GL_READ_FRAMEBUFFER_BINDING_EXT"("0x8CAA")
        "glBlitFramebufferEXT"(
            void,
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
    }
    file("FramebufferBlitLayers", EXT, "GL_EXT_framebuffer_blit_layers") {
        "glBlitFramebufferLayersEXT"(
            void,
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
        "glBlitFramebufferLayerEXT"(
            void,
            GLint("srcX0"),
            GLint("srcY0"),
            GLint("srcX1"),
            GLint("srcY1"),
            GLint("srcLayer"),
            GLint("dstX0"),
            GLint("dstY0"),
            GLint("dstX1"),
            GLint("dstY1"),
            GLint("dstLayer"),
            GLbitfield("mask"),
            GLenum("filter")
        )
    }
    file("FramebufferMultisample", EXT, "GL_EXT_framebuffer_multisample") {
        "GL_RENDERBUFFER_SAMPLES_EXT"("0x8CAB")
        "GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT"("0x8D56")
        "GL_MAX_SAMPLES_EXT"("0x8D57")
        "glRenderbufferStorageMultisampleEXT"(
            void,
            GLenum("target"),
            GLsizei("samples"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
    }
    file(
        "FramebufferMultisampleBlitScaled", EXT, "GL_EXT_framebuffer_multisample_blit_scaled",
        "GL_SCALED_RESOLVE_FASTEST_EXT" to "0x90BA",
        "GL_SCALED_RESOLVE_NICEST_EXT" to "0x90BB"
    )
    file("FramebufferObject", EXT, "GL_EXT_framebuffer_object") {
        "GL_INVALID_FRAMEBUFFER_OPERATION_EXT"("0x0506")
        "GL_MAX_RENDERBUFFER_SIZE_EXT"("0x84E8")
        "GL_FRAMEBUFFER_BINDING_EXT"("0x8CA6")
        "GL_RENDERBUFFER_BINDING_EXT"("0x8CA7")
        "GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT"("0x8CD0")
        "GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT"("0x8CD1")
        "GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT"("0x8CD2")
        "GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT"("0x8CD3")
        "GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT"("0x8CD4")
        "GL_FRAMEBUFFER_COMPLETE_EXT"("0x8CD5")
        "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT"("0x8CD6")
        "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT"("0x8CD7")
        "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT"("0x8CD9")
        "GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT"("0x8CDA")
        "GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT"("0x8CDB")
        "GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT"("0x8CDC")
        "GL_FRAMEBUFFER_UNSUPPORTED_EXT"("0x8CDD")
        "GL_MAX_COLOR_ATTACHMENTS_EXT"("0x8CDF")
        "GL_COLOR_ATTACHMENT0_EXT"("0x8CE0")
        "GL_COLOR_ATTACHMENT1_EXT"("0x8CE1")
        "GL_COLOR_ATTACHMENT2_EXT"("0x8CE2")
        "GL_COLOR_ATTACHMENT3_EXT"("0x8CE3")
        "GL_COLOR_ATTACHMENT4_EXT"("0x8CE4")
        "GL_COLOR_ATTACHMENT5_EXT"("0x8CE5")
        "GL_COLOR_ATTACHMENT6_EXT"("0x8CE6")
        "GL_COLOR_ATTACHMENT7_EXT"("0x8CE7")
        "GL_COLOR_ATTACHMENT8_EXT"("0x8CE8")
        "GL_COLOR_ATTACHMENT9_EXT"("0x8CE9")
        "GL_COLOR_ATTACHMENT10_EXT"("0x8CEA")
        "GL_COLOR_ATTACHMENT11_EXT"("0x8CEB")
        "GL_COLOR_ATTACHMENT12_EXT"("0x8CEC")
        "GL_COLOR_ATTACHMENT13_EXT"("0x8CED")
        "GL_COLOR_ATTACHMENT14_EXT"("0x8CEE")
        "GL_COLOR_ATTACHMENT15_EXT"("0x8CEF")
        "GL_DEPTH_ATTACHMENT_EXT"("0x8D00")
        "GL_STENCIL_ATTACHMENT_EXT"("0x8D20")
        "GL_FRAMEBUFFER_EXT"("0x8D40")
        "GL_RENDERBUFFER_EXT"("0x8D41")
        "GL_RENDERBUFFER_WIDTH_EXT"("0x8D42")
        "GL_RENDERBUFFER_HEIGHT_EXT"("0x8D43")
        "GL_RENDERBUFFER_INTERNAL_FORMAT_EXT"("0x8D44")
        "GL_STENCIL_INDEX1_EXT"("0x8D46")
        "GL_STENCIL_INDEX4_EXT"("0x8D47")
        "GL_STENCIL_INDEX8_EXT"("0x8D48")
        "GL_STENCIL_INDEX16_EXT"("0x8D49")
        "GL_RENDERBUFFER_RED_SIZE_EXT"("0x8D50")
        "GL_RENDERBUFFER_GREEN_SIZE_EXT"("0x8D51")
        "GL_RENDERBUFFER_BLUE_SIZE_EXT"("0x8D52")
        "GL_RENDERBUFFER_ALPHA_SIZE_EXT"("0x8D53")
        "GL_RENDERBUFFER_DEPTH_SIZE_EXT"("0x8D54")
        "GL_RENDERBUFFER_STENCIL_SIZE_EXT"("0x8D55")
        "glIsRenderbufferEXT"(GLboolean, GLuint("renderbuffer"))
        "glBindRenderbufferEXT"(void, GLenum("target"), GLuint("renderbuffer"))
        "glDeleteRenderbuffersEXT"(void, GLsizei("n"), address("renderbuffers", "const GLuint *"))
        "glGenRenderbuffersEXT"(void, GLsizei("n"), address("renderbuffers", "GLuint *"))
        "glRenderbufferStorageEXT"(void, GLenum("target"), GLenum("internalformat"), GLsizei("width"), GLsizei("height"))
        "glGetRenderbufferParameterivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glIsFramebufferEXT"(GLboolean, GLuint("framebuffer"))
        "glBindFramebufferEXT"(void, GLenum("target"), GLuint("framebuffer"))
        "glDeleteFramebuffersEXT"(void, GLsizei("n"), address("framebuffers", "const GLuint *"))
        "glGenFramebuffersEXT"(void, GLsizei("n"), address("framebuffers", "GLuint *"))
        "glCheckFramebufferStatusEXT"(GLenum, GLenum("target"))
        "glFramebufferTexture1DEXT"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLenum("textarget"),
            GLuint("texture"),
            GLint("level")
        )
        "glFramebufferTexture2DEXT"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLenum("textarget"),
            GLuint("texture"),
            GLint("level")
        )
        "glFramebufferTexture3DEXT"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLenum("textarget"),
            GLuint("texture"),
            GLint("level"),
            GLint("zoffset")
        )
        "glFramebufferRenderbufferEXT"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLenum("renderbuffertarget"),
            GLuint("renderbuffer")
        )
        "glGetFramebufferAttachmentParameterivEXT"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLenum("pname"),
            address("params", "GLint *")
        )
        "glGenerateMipmapEXT"(void, GLenum("target"))
    }
    file(
        "Srgb", EXT, "GL_EXT_framebuffer_sRGB",
        "GL_FRAMEBUFFER_SRGB_EXT" to "0x8DB9",
        "GL_FRAMEBUFFER_SRGB_CAPABLE_EXT" to "0x8DBA"
    )
    file("GeometryShader4", EXT, "GL_EXT_geometry_shader4") {
        "GL_GEOMETRY_SHADER_EXT"("0x8DD9")
        "GL_GEOMETRY_VERTICES_OUT_EXT"("0x8DDA")
        "GL_GEOMETRY_INPUT_TYPE_EXT"("0x8DDB")
        "GL_GEOMETRY_OUTPUT_TYPE_EXT"("0x8DDC")
        "GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT"("0x8C29")
        "GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT"("0x8DDD")
        "GL_MAX_VERTEX_VARYING_COMPONENTS_EXT"("0x8DDE")
        "GL_MAX_VARYING_COMPONENTS_EXT"("0x8B4B")
        "GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT"("0x8DDF")
        "GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT"("0x8DE0")
        "GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT"("0x8DE1")
        "GL_LINES_ADJACENCY_EXT"("0x000A")
        "GL_LINE_STRIP_ADJACENCY_EXT"("0x000B")
        "GL_TRIANGLES_ADJACENCY_EXT"("0x000C")
        "GL_TRIANGLE_STRIP_ADJACENCY_EXT"("0x000D")
        "GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT"("0x8DA8")
        "GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT"("0x8DA9")
        "GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT"("0x8DA7")
        "GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT"("0x8CD4")
        "GL_PROGRAM_POINT_SIZE_EXT"("0x8642")
        "glProgramParameteriEXT"(void, GLuint("program"), GLenum("pname"), GLint("value"))
    }
    file("GpuProgramParameters", EXT, "GL_EXT_gpu_program_parameters") {
        "glProgramEnvParameters4fvEXT"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLfloat *")
        )
        "glProgramLocalParameters4fvEXT"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLsizei("count"),
            address("params", "const GLfloat *")
        )
    }
    file("GpuShader4", EXT, "GL_EXT_gpu_shader4") {
        "GL_SAMPLER_1D_ARRAY_EXT"("0x8DC0")
        "GL_SAMPLER_2D_ARRAY_EXT"("0x8DC1")
        "GL_SAMPLER_BUFFER_EXT"("0x8DC2")
        "GL_SAMPLER_1D_ARRAY_SHADOW_EXT"("0x8DC3")
        "GL_SAMPLER_2D_ARRAY_SHADOW_EXT"("0x8DC4")
        "GL_SAMPLER_CUBE_SHADOW_EXT"("0x8DC5")
        "GL_UNSIGNED_INT_VEC2_EXT"("0x8DC6")
        "GL_UNSIGNED_INT_VEC3_EXT"("0x8DC7")
        "GL_UNSIGNED_INT_VEC4_EXT"("0x8DC8")
        "GL_INT_SAMPLER_1D_EXT"("0x8DC9")
        "GL_INT_SAMPLER_2D_EXT"("0x8DCA")
        "GL_INT_SAMPLER_3D_EXT"("0x8DCB")
        "GL_INT_SAMPLER_CUBE_EXT"("0x8DCC")
        "GL_INT_SAMPLER_2D_RECT_EXT"("0x8DCD")
        "GL_INT_SAMPLER_1D_ARRAY_EXT"("0x8DCE")
        "GL_INT_SAMPLER_2D_ARRAY_EXT"("0x8DCF")
        "GL_INT_SAMPLER_BUFFER_EXT"("0x8DD0")
        "GL_UNSIGNED_INT_SAMPLER_1D_EXT"("0x8DD1")
        "GL_UNSIGNED_INT_SAMPLER_2D_EXT"("0x8DD2")
        "GL_UNSIGNED_INT_SAMPLER_3D_EXT"("0x8DD3")
        "GL_UNSIGNED_INT_SAMPLER_CUBE_EXT"("0x8DD4")
        "GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT"("0x8DD5")
        "GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT"("0x8DD6")
        "GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT"("0x8DD7")
        "GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT"("0x8DD8")
        "GL_MIN_PROGRAM_TEXEL_OFFSET_EXT"("0x8904")
        "GL_MAX_PROGRAM_TEXEL_OFFSET_EXT"("0x8905")
        "GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT"("0x88FD")
        "glGetUniformuivEXT"(void, GLuint("program"), GLint("location"), address("params", "GLuint *"))
        "glBindFragDataLocationEXT"(void, GLuint("program"), GLuint("color"), address("name", "const GLchar *"))
        "glGetFragDataLocationEXT"(GLint, GLuint("program"), address("name", "const GLchar *"))
        "glUniform1uiEXT"(void, GLint("location"), GLuint("v0"))
        "glUniform2uiEXT"(void, GLint("location"), GLuint("v0"), GLuint("v1"))
        "glUniform3uiEXT"(void, GLint("location"), GLuint("v0"), GLuint("v1"), GLuint("v2"))
        "glUniform4uiEXT"(void, GLint("location"), GLuint("v0"), GLuint("v1"), GLuint("v2"), GLuint("v3"))
        "glUniform1uivEXT"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint *"))
        "glUniform2uivEXT"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint *"))
        "glUniform3uivEXT"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint *"))
        "glUniform4uivEXT"(void, GLint("location"), GLsizei("count"), address("value", "const GLuint *"))
        "glVertexAttribI1iEXT"(void, GLuint("index"), GLint("x"))
        "glVertexAttribI2iEXT"(void, GLuint("index"), GLint("x"), GLint("y"))
        "glVertexAttribI3iEXT"(void, GLuint("index"), GLint("x"), GLint("y"), GLint("z"))
        "glVertexAttribI4iEXT"(void, GLuint("index"), GLint("x"), GLint("y"), GLint("z"), GLint("w"))
        "glVertexAttribI1uiEXT"(void, GLuint("index"), GLuint("x"))
        "glVertexAttribI2uiEXT"(void, GLuint("index"), GLuint("x"), GLuint("y"))
        "glVertexAttribI3uiEXT"(void, GLuint("index"), GLuint("x"), GLuint("y"), GLuint("z"))
        "glVertexAttribI4uiEXT"(void, GLuint("index"), GLuint("x"), GLuint("y"), GLuint("z"), GLuint("w"))
        "glVertexAttribI1ivEXT"(void, GLuint("index"), address("v", "const GLint *"))
        "glVertexAttribI2ivEXT"(void, GLuint("index"), address("v", "const GLint *"))
        "glVertexAttribI3ivEXT"(void, GLuint("index"), address("v", "const GLint *"))
        "glVertexAttribI4ivEXT"(void, GLuint("index"), address("v", "const GLint *"))
        "glVertexAttribI1uivEXT"(void, GLuint("index"), address("v", "const GLuint *"))
        "glVertexAttribI2uivEXT"(void, GLuint("index"), address("v", "const GLuint *"))
        "glVertexAttribI3uivEXT"(void, GLuint("index"), address("v", "const GLuint *"))
        "glVertexAttribI4uivEXT"(void, GLuint("index"), address("v", "const GLuint *"))
        "glVertexAttribI4bvEXT"(void, GLuint("index"), address("v", "const GLbyte *"))
        "glVertexAttribI4svEXT"(void, GLuint("index"), address("v", "const GLshort *"))
        "glVertexAttribI4ubvEXT"(void, GLuint("index"), address("v", "const GLubyte *"))
        "glVertexAttribI4usvEXT"(void, GLuint("index"), address("v", "const GLushort *"))
        "glVertexAttribIPointerEXT"(
            void,
            GLuint("index"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            address("pointer", "const void *")
        )
        "glGetVertexAttribIivEXT"(void, GLuint("index"), GLenum("pname"), address("params", "GLint *"))
        "glGetVertexAttribIuivEXT"(void, GLuint("index"), GLenum("pname"), address("params", "GLuint *"))
    }
    file("Histogram", EXT, "GL_EXT_histogram") {
        "GL_HISTOGRAM_EXT"("0x8024")
        "GL_PROXY_HISTOGRAM_EXT"("0x8025")
        "GL_HISTOGRAM_WIDTH_EXT"("0x8026")
        "GL_HISTOGRAM_FORMAT_EXT"("0x8027")
        "GL_HISTOGRAM_RED_SIZE_EXT"("0x8028")
        "GL_HISTOGRAM_GREEN_SIZE_EXT"("0x8029")
        "GL_HISTOGRAM_BLUE_SIZE_EXT"("0x802A")
        "GL_HISTOGRAM_ALPHA_SIZE_EXT"("0x802B")
        "GL_HISTOGRAM_LUMINANCE_SIZE_EXT"("0x802C")
        "GL_HISTOGRAM_SINK_EXT"("0x802D")
        "GL_MINMAX_EXT"("0x802E")
        "GL_MINMAX_FORMAT_EXT"("0x802F")
        "GL_MINMAX_SINK_EXT"("0x8030")
        "GL_TABLE_TOO_LARGE_EXT"("0x8031")
        "glGetHistogramEXT"(
            void,
            GLenum("target"),
            GLboolean("reset"),
            GLenum("format"),
            GLenum("type"),
            address("values", "void *")
        )
        "glGetHistogramParameterfvEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetHistogramParameterivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetMinmaxEXT"(
            void,
            GLenum("target"),
            GLboolean("reset"),
            GLenum("format"),
            GLenum("type"),
            address("values", "void *")
        )
        "glGetMinmaxParameterfvEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetMinmaxParameterivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glHistogramEXT"(void, GLenum("target"), GLsizei("width"), GLenum("internalformat"), GLboolean("sink"))
        "glMinmaxEXT"(void, GLenum("target"), GLenum("internalformat"), GLboolean("sink"))
        "glResetHistogramEXT"(void, GLenum("target"))
        "glResetMinmaxEXT"(void, GLenum("target"))
    }
    file(
        "IndexArrayFormats", EXT, "GL_EXT_index_array_formats",
        "GL_IUI_V2F_EXT" to "0x81AD",
        "GL_IUI_V3F_EXT" to "0x81AE",
        "GL_IUI_N3F_V2F_EXT" to "0x81AF",
        "GL_IUI_N3F_V3F_EXT" to "0x81B0",
        "GL_T2F_IUI_V2F_EXT" to "0x81B1",
        "GL_T2F_IUI_V3F_EXT" to "0x81B2",
        "GL_T2F_IUI_N3F_V2F_EXT" to "0x81B3",
        "GL_T2F_IUI_N3F_V3F_EXT" to "0x81B4"
    )
    file("IndexFunc", EXT, "GL_EXT_index_func") {
        "GL_INDEX_TEST_EXT"("0x81B5")
        "GL_INDEX_TEST_FUNC_EXT"("0x81B6")
        "GL_INDEX_TEST_REF_EXT"("0x81B7")
        "glIndexFuncEXT"(void, GLenum("func"), GLclampf("ref"))
    }
    file("IndexMaterial", EXT, "GL_EXT_index_material") {
        "GL_INDEX_MATERIAL_EXT"("0x81B8")
        "GL_INDEX_MATERIAL_PARAMETER_EXT"("0x81B9")
        "GL_INDEX_MATERIAL_FACE_EXT"("0x81BA")
        "glIndexMaterialEXT"(void, GLenum("face"), GLenum("mode"))
    }
    file("LightTexture", EXT, "GL_EXT_light_texture") {
        "GL_FRAGMENT_MATERIAL_EXT"("0x8349")
        "GL_FRAGMENT_NORMAL_EXT"("0x834A")
        "GL_FRAGMENT_COLOR_EXT"("0x834C")
        "GL_ATTENUATION_EXT"("0x834D")
        "GL_SHADOW_ATTENUATION_EXT"("0x834E")
        "GL_TEXTURE_APPLICATION_MODE_EXT"("0x834F")
        "GL_TEXTURE_LIGHT_EXT"("0x8350")
        "GL_TEXTURE_MATERIAL_FACE_EXT"("0x8351")
        "GL_TEXTURE_MATERIAL_PARAMETER_EXT"("0x8352")
        "glApplyTextureEXT"(void, GLenum("mode"))
        "glTextureLightEXT"(void, GLenum("pname"))
        "glTextureMaterialEXT"(void, GLenum("face"), GLenum("mode"))
    }
    file("MemoryObject", EXT, "GL_EXT_memory_object") {
        "GL_TEXTURE_TILING_EXT"("0x9580")
        "GL_DEDICATED_MEMORY_OBJECT_EXT"("0x9581")
        "GL_PROTECTED_MEMORY_OBJECT_EXT"("0x959B")
        "GL_NUM_TILING_TYPES_EXT"("0x9582")
        "GL_TILING_TYPES_EXT"("0x9583")
        "GL_OPTIMAL_TILING_EXT"("0x9584")
        "GL_LINEAR_TILING_EXT"("0x9585")
        "GL_NUM_DEVICE_UUIDS_EXT"("0x9596")
        "GL_DEVICE_UUID_EXT"("0x9597")
        "GL_DRIVER_UUID_EXT"("0x9598")
        "GL_UUID_SIZE_EXT"("16")
        "glGetUnsignedBytevEXT"(void, GLenum("pname"), address("data", "GLubyte *"))
        "glGetUnsignedBytei_vEXT"(void, GLenum("target"), GLuint("index"), address("data", "GLubyte *"))
        "glDeleteMemoryObjectsEXT"(void, GLsizei("n"), address("memoryObjects", "const GLuint *"))
        "glIsMemoryObjectEXT"(GLboolean, GLuint("memoryObject"))
        "glCreateMemoryObjectsEXT"(void, GLsizei("n"), address("memoryObjects", "GLuint *"))
        "glMemoryObjectParameterivEXT"(
            void,
            GLuint("memoryObject"),
            GLenum("pname"),
            address("params", "const GLint *")
        )
        "glGetMemoryObjectParameterivEXT"(void, GLuint("memoryObject"), GLenum("pname"), address("params", "GLint *"))
        "glTexStorageMem2DEXT"(
            void,
            GLenum("target"),
            GLsizei("levels"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glTexStorageMem2DMultisampleEXT"(
            void,
            GLenum("target"),
            GLsizei("samples"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLboolean("fixedSampleLocations"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glTexStorageMem3DEXT"(
            void,
            GLenum("target"),
            GLsizei("levels"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glTexStorageMem3DMultisampleEXT"(
            void,
            GLenum("target"),
            GLsizei("samples"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLboolean("fixedSampleLocations"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glBufferStorageMemEXT"(void, GLenum("target"), GLsizeiptr("size"), GLuint("memory"), GLuint64("offset"))
        "glTextureStorageMem2DEXT"(
            void,
            GLuint("texture"),
            GLsizei("levels"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glTextureStorageMem2DMultisampleEXT"(
            void,
            GLuint("texture"),
            GLsizei("samples"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLboolean("fixedSampleLocations"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glTextureStorageMem3DEXT"(
            void,
            GLuint("texture"),
            GLsizei("levels"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glTextureStorageMem3DMultisampleEXT"(
            void,
            GLuint("texture"),
            GLsizei("samples"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLboolean("fixedSampleLocations"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glNamedBufferStorageMemEXT"(void, GLuint("buffer"), GLsizeiptr("size"), GLuint("memory"), GLuint64("offset"))
        "glTexStorageMem1DEXT"(
            void,
            GLenum("target"),
            GLsizei("levels"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLuint("memory"),
            GLuint64("offset")
        )
        "glTextureStorageMem1DEXT"(
            void,
            GLuint("texture"),
            GLsizei("levels"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLuint("memory"),
            GLuint64("offset")
        )
    }
    file("MemoryObjectFd", EXT, "GL_EXT_memory_object_fd") {
        "GL_HANDLE_TYPE_OPAQUE_FD_EXT"("0x9586")
        "glImportMemoryFdEXT"(void, GLuint("memory"), GLuint64("size"), GLenum("handleType"), GLint("fd"))
    }
    file("MemoryObjectWin32", EXT, "GL_EXT_memory_object_win32") {
        "GL_HANDLE_TYPE_OPAQUE_WIN32_EXT"("0x9587")
        "GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT"("0x9588")
        "GL_DEVICE_LUID_EXT"("0x9599")
        "GL_DEVICE_NODE_MASK_EXT"("0x959A")
        "GL_LUID_SIZE_EXT"("8")
        "GL_HANDLE_TYPE_D3D12_TILEPOOL_EXT"("0x9589")
        "GL_HANDLE_TYPE_D3D12_RESOURCE_EXT"("0x958A")
        "GL_HANDLE_TYPE_D3D11_IMAGE_EXT"("0x958B")
        "GL_HANDLE_TYPE_D3D11_IMAGE_KMT_EXT"("0x958C")
        "glImportMemoryWin32HandleEXT"(
            void,
            GLuint("memory"),
            GLuint64("size"),
            GLenum("handleType"),
            address("handle", "void *")
        )
        "glImportMemoryWin32NameEXT"(
            void,
            GLuint("memory"),
            GLuint64("size"),
            GLenum("handleType"),
            address("name", "const void *")
        )
    }
    file("MultiDrawArrays", EXT, "GL_EXT_multi_draw_arrays") {
        "glMultiDrawArraysEXT"(
            void,
            GLenum("mode"),
            address("first", "const GLint *"),
            address("count", "const GLsizei *"),
            GLsizei("primcount")
        )
        "glMultiDrawElementsEXT"(
            void,
            GLenum("mode"),
            address("count", "const GLsizei *"),
            GLenum("type"),
            address("indices", "const void *const*"),
            GLsizei("primcount")
        )
    }
    file("Multisample", EXT, "GL_EXT_multisample") {
        "GL_MULTISAMPLE_EXT"("0x809D")
        "GL_SAMPLE_ALPHA_TO_MASK_EXT"("0x809E")
        "GL_SAMPLE_ALPHA_TO_ONE_EXT"("0x809F")
        "GL_SAMPLE_MASK_EXT"("0x80A0")
        "GL_1PASS_EXT"("0x80A1")
        "GL_2PASS_0_EXT"("0x80A2")
        "GL_2PASS_1_EXT"("0x80A3")
        "GL_4PASS_0_EXT"("0x80A4")
        "GL_4PASS_1_EXT"("0x80A5")
        "GL_4PASS_2_EXT"("0x80A6")
        "GL_4PASS_3_EXT"("0x80A7")
        "GL_SAMPLE_BUFFERS_EXT"("0x80A8")
        "GL_SAMPLES_EXT"("0x80A9")
        "GL_SAMPLE_MASK_VALUE_EXT"("0x80AA")
        "GL_SAMPLE_MASK_INVERT_EXT"("0x80AB")
        "GL_SAMPLE_PATTERN_EXT"("0x80AC")
        "GL_MULTISAMPLE_BIT_EXT"("0x20000000")
        "glSampleMaskEXT"(void, GLclampf("value"), GLboolean("invert"))
        "glSamplePatternEXT"(void, GLenum("pattern"))
    }
    file(
        "PackedDepthStencil", EXT, "GL_EXT_packed_depth_stencil",
        "GL_DEPTH_STENCIL_EXT" to "0x84F9",
        "GL_UNSIGNED_INT_24_8_EXT" to "0x84FA",
        "GL_DEPTH24_STENCIL8_EXT" to "0x88F0",
        "GL_TEXTURE_STENCIL_SIZE_EXT" to "0x88F1"
    )
    file(
        "PackedFloat", EXT, "GL_EXT_packed_float",
        "GL_R11F_G11F_B10F_EXT" to "0x8C3A",
        "GL_UNSIGNED_INT_10F_11F_11F_REV_EXT" to "0x8C3B",
        "GL_RGBA_SIGNED_COMPONENTS_EXT" to "0x8C3C"
    )
    file(
        "PackedPixels", EXT, "GL_EXT_packed_pixels",
        "GL_UNSIGNED_BYTE_3_3_2_EXT" to "0x8032",
        "GL_UNSIGNED_SHORT_4_4_4_4_EXT" to "0x8033",
        "GL_UNSIGNED_SHORT_5_5_5_1_EXT" to "0x8034",
        "GL_UNSIGNED_INT_8_8_8_8_EXT" to "0x8035",
        "GL_UNSIGNED_INT_10_10_10_2_EXT" to "0x8036"
    )
    file("PalettedTexture", EXT, "GL_EXT_paletted_texture") {
        "GL_COLOR_INDEX1_EXT"("0x80E2")
        "GL_COLOR_INDEX2_EXT"("0x80E3")
        "GL_COLOR_INDEX4_EXT"("0x80E4")
        "GL_COLOR_INDEX8_EXT"("0x80E5")
        "GL_COLOR_INDEX12_EXT"("0x80E6")
        "GL_COLOR_INDEX16_EXT"("0x80E7")
        "GL_TEXTURE_INDEX_SIZE_EXT"("0x80ED")
        "glColorTableEXT"(
            void,
            GLenum("target"),
            GLenum("internalFormat"),
            GLsizei("width"),
            GLenum("format"),
            GLenum("type"),
            address("table", "const void *")
        )
        "glGetColorTableEXT"(void, GLenum("target"), GLenum("format"), GLenum("type"), address("data", "void *"))
        "glGetColorTableParameterivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetColorTableParameterfvEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
    }
    file(
        "PixelBufferObject", EXT, "GL_EXT_pixel_buffer_object",
        "GL_PIXEL_PACK_BUFFER_EXT" to "0x88EB",
        "GL_PIXEL_UNPACK_BUFFER_EXT" to "0x88EC",
        "GL_PIXEL_PACK_BUFFER_BINDING_EXT" to "0x88ED",
        "GL_PIXEL_UNPACK_BUFFER_BINDING_EXT" to "0x88EF"
    )
    file("PixelTransform", EXT, "GL_EXT_pixel_transform") {
        "GL_PIXEL_TRANSFORM_2D_EXT"("0x8330")
        "GL_PIXEL_MAG_FILTER_EXT"("0x8331")
        "GL_PIXEL_MIN_FILTER_EXT"("0x8332")
        "GL_PIXEL_CUBIC_WEIGHT_EXT"("0x8333")
        "GL_CUBIC_EXT"("0x8334")
        "GL_AVERAGE_EXT"("0x8335")
        "GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT"("0x8336")
        "GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT"("0x8337")
        "GL_PIXEL_TRANSFORM_2D_MATRIX_EXT"("0x8338")
        "glPixelTransformParameteriEXT"(void, GLenum("target"), GLenum("pname"), GLint("param"))
        "glPixelTransformParameterfEXT"(void, GLenum("target"), GLenum("pname"), GLfloat("param"))
        "glPixelTransformParameterivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "const GLint *"))
        "glPixelTransformParameterfvEXT"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfloat *"))
        "glGetPixelTransformParameterivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetPixelTransformParameterfvEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
    }
    file("PointParameters", EXT, "GL_EXT_point_parameters") {
        "GL_POINT_SIZE_MIN_EXT"("0x8126")
        "GL_POINT_SIZE_MAX_EXT"("0x8127")
        "GL_POINT_FADE_THRESHOLD_SIZE_EXT"("0x8128")
        "GL_DISTANCE_ATTENUATION_EXT"("0x8129")
        "glPointParameterfEXT"(void, GLenum("pname"), GLfloat("param"))
        "glPointParameterfvEXT"(void, GLenum("pname"), address("params", "const GLfloat *"))
    }
    file("PolygonOffset", EXT, "GL_EXT_polygon_offset") {
        "GL_POLYGON_OFFSET_EXT"("0x8037")
        "GL_POLYGON_OFFSET_FACTOR_EXT"("0x8038")
        "GL_POLYGON_OFFSET_BIAS_EXT"("0x8039")
        "glPolygonOffsetEXT"(void, GLfloat("factor"), GLfloat("bias"))
    }
    file("PolygonOffsetClamp", EXT, "GL_EXT_polygon_offset_clamp") {
        "GL_POLYGON_OFFSET_CLAMP_EXT"("0x8E1B")
        "glPolygonOffsetClampEXT"(void, GLfloat("factor"), GLfloat("units"), GLfloat("clamp"))
    }
    file("ProvokingVertex", EXT, "GL_EXT_provoking_vertex") {
        "GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT"("0x8E4C")
        "GL_FIRST_VERTEX_CONVENTION_EXT"("0x8E4D")
        "GL_LAST_VERTEX_CONVENTION_EXT"("0x8E4E")
        "GL_PROVOKING_VERTEX_EXT"("0x8E4F")
        "glProvokingVertexEXT"(void, GLenum("mode"))
    }
    file("RasterMultisample", EXT, "GL_EXT_raster_multisample") {
        "GL_RASTER_MULTISAMPLE_EXT"("0x9327")
        "GL_RASTER_SAMPLES_EXT"("0x9328")
        "GL_MAX_RASTER_SAMPLES_EXT"("0x9329")
        "GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT"("0x932A")
        "GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT"("0x932B")
        "GL_EFFECTIVE_RASTER_SAMPLES_EXT"("0x932C")
        "glRasterSamplesEXT"(void, GLuint("samples"), GLboolean("fixedsamplelocations"))
    }
    file("RescaleNormal", EXT, "GL_EXT_rescale_normal", "GL_RESCALE_NORMAL_EXT" to "0x803A")
    file("SecondaryColor", EXT, "GL_EXT_secondary_color") {
        "GL_COLOR_SUM_EXT"("0x8458")
        "GL_CURRENT_SECONDARY_COLOR_EXT"("0x8459")
        "GL_SECONDARY_COLOR_ARRAY_SIZE_EXT"("0x845A")
        "GL_SECONDARY_COLOR_ARRAY_TYPE_EXT"("0x845B")
        "GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT"("0x845C")
        "GL_SECONDARY_COLOR_ARRAY_POINTER_EXT"("0x845D")
        "GL_SECONDARY_COLOR_ARRAY_EXT"("0x845E")
        "glSecondaryColor3bEXT"(void, GLbyte("red"), GLbyte("green"), GLbyte("blue"))
        "glSecondaryColor3bvEXT"(void, address("v", "const GLbyte *"))
        "glSecondaryColor3dEXT"(void, GLdouble("red"), GLdouble("green"), GLdouble("blue"))
        "glSecondaryColor3dvEXT"(void, address("v", "const GLdouble *"))
        "glSecondaryColor3fEXT"(void, GLfloat("red"), GLfloat("green"), GLfloat("blue"))
        "glSecondaryColor3fvEXT"(void, address("v", "const GLfloat *"))
        "glSecondaryColor3iEXT"(void, GLint("red"), GLint("green"), GLint("blue"))
        "glSecondaryColor3ivEXT"(void, address("v", "const GLint *"))
        "glSecondaryColor3sEXT"(void, GLshort("red"), GLshort("green"), GLshort("blue"))
        "glSecondaryColor3svEXT"(void, address("v", "const GLshort *"))
        "glSecondaryColor3ubEXT"(void, GLubyte("red"), GLubyte("green"), GLubyte("blue"))
        "glSecondaryColor3ubvEXT"(void, address("v", "const GLubyte *"))
        "glSecondaryColor3uiEXT"(void, GLuint("red"), GLuint("green"), GLuint("blue"))
        "glSecondaryColor3uivEXT"(void, address("v", "const GLuint *"))
        "glSecondaryColor3usEXT"(void, GLushort("red"), GLushort("green"), GLushort("blue"))
        "glSecondaryColor3usvEXT"(void, address("v", "const GLushort *"))
        "glSecondaryColorPointerEXT"(
            void,
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            address("pointer", "const void *")
        )
    }
    file("Semaphore", EXT, "GL_EXT_semaphore") {
        "GL_LAYOUT_GENERAL_EXT"("0x958D")
        "GL_LAYOUT_COLOR_ATTACHMENT_EXT"("0x958E")
        "GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT"("0x958F")
        "GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT"("0x9590")
        "GL_LAYOUT_SHADER_READ_ONLY_EXT"("0x9591")
        "GL_LAYOUT_TRANSFER_SRC_EXT"("0x9592")
        "GL_LAYOUT_TRANSFER_DST_EXT"("0x9593")
        "GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT"("0x9530")
        "GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT"("0x9531")
        "glGenSemaphoresEXT"(void, GLsizei("n"), address("semaphores", "GLuint *"))
        "glDeleteSemaphoresEXT"(void, GLsizei("n"), address("semaphores", "const GLuint *"))
        "glIsSemaphoreEXT"(GLboolean, GLuint("semaphore"))
        "glSemaphoreParameterui64vEXT"(
            void,
            GLuint("semaphore"),
            GLenum("pname"),
            address("params", "const GLuint64 *")
        )
        "glGetSemaphoreParameterui64vEXT"(void, GLuint("semaphore"), GLenum("pname"), address("params", "GLuint64 *"))
        "glWaitSemaphoreEXT"(
            void,
            GLuint("semaphore"),
            GLuint("numBufferBarriers"),
            address("buffers", "const GLuint *"),
            GLuint("numTextureBarriers"),
            address("textures", "const GLuint *"),
            address("srcLayouts", "const GLenum *")
        )
        "glSignalSemaphoreEXT"(
            void,
            GLuint("semaphore"),
            GLuint("numBufferBarriers"),
            address("buffers", "const GLuint *"),
            GLuint("numTextureBarriers"),
            address("textures", "const GLuint *"),
            address("dstLayouts", "const GLenum *")
        )
    }
    file("SemaphoreFd", EXT, "GL_EXT_semaphore_fd") {
        "glImportSemaphoreFdEXT"(void, GLuint("semaphore"), GLenum("handleType"), GLint("fd"))
    }
    file("SemaphoreWin32", EXT, "GL_EXT_semaphore_win32") {
        "GL_HANDLE_TYPE_D3D12_FENCE_EXT"("0x9594")
        "GL_D3D12_FENCE_VALUE_EXT"("0x9595")
        "glImportSemaphoreWin32HandleEXT"(void, GLuint("semaphore"), GLenum("handleType"), address("handle", "void * "))
        "glImportSemaphoreWin32NameEXT"(void, GLuint("semaphore"), GLenum("handleType"), address("name", "const void *"))
    }
    file("SeparateShaderObjects", EXT, "GL_EXT_separate_shader_objects") {
        "GL_ACTIVE_PROGRAM_EXT"("0x8B8D")
        "glUseShaderProgramEXT"(void, GLenum("type"), GLuint("program"))
        "glActiveProgramEXT"(void, GLuint("program"))
        "glCreateShaderProgramEXT"(GLuint, GLenum("type"), address("string", "const GLchar *"))
    }
    file(
        "SeparateSpecularColor", EXT, "GL_EXT_separate_specular_color",
        "GL_LIGHT_MODEL_COLOR_CONTROL_EXT" to "0x81F8",
        "GL_SINGLE_COLOR_EXT" to "0x81F9",
        "GL_SEPARATE_SPECULAR_COLOR_EXT" to "0x81FA"
    )
    file("ShaderFramebufferFetch", EXT, "GL_EXT_shader_framebuffer_fetch", "GL_FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT" to "0x8A52")
    file("ShaderFramebufferFetchNonCoherent", EXT, "GL_EXT_shader_framebuffer_fetch_non_coherent") {
        "glFramebufferFetchBarrierEXT"(void)
    }
    file("ShaderImageLoadStore", EXT, "GL_EXT_shader_image_load_store") {
        "GL_MAX_IMAGE_UNITS_EXT"("0x8F38")
        "GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT"("0x8F39")
        "GL_IMAGE_BINDING_NAME_EXT"("0x8F3A")
        "GL_IMAGE_BINDING_LEVEL_EXT"("0x8F3B")
        "GL_IMAGE_BINDING_LAYERED_EXT"("0x8F3C")
        "GL_IMAGE_BINDING_LAYER_EXT"("0x8F3D")
        "GL_IMAGE_BINDING_ACCESS_EXT"("0x8F3E")
        "GL_IMAGE_1D_EXT"("0x904C")
        "GL_IMAGE_2D_EXT"("0x904D")
        "GL_IMAGE_3D_EXT"("0x904E")
        "GL_IMAGE_2D_RECT_EXT"("0x904F")
        "GL_IMAGE_CUBE_EXT"("0x9050")
        "GL_IMAGE_BUFFER_EXT"("0x9051")
        "GL_IMAGE_1D_ARRAY_EXT"("0x9052")
        "GL_IMAGE_2D_ARRAY_EXT"("0x9053")
        "GL_IMAGE_CUBE_MAP_ARRAY_EXT"("0x9054")
        "GL_IMAGE_2D_MULTISAMPLE_EXT"("0x9055")
        "GL_IMAGE_2D_MULTISAMPLE_ARRAY_EXT"("0x9056")
        "GL_INT_IMAGE_1D_EXT"("0x9057")
        "GL_INT_IMAGE_2D_EXT"("0x9058")
        "GL_INT_IMAGE_3D_EXT"("0x9059")
        "GL_INT_IMAGE_2D_RECT_EXT"("0x905A")
        "GL_INT_IMAGE_CUBE_EXT"("0x905B")
        "GL_INT_IMAGE_BUFFER_EXT"("0x905C")
        "GL_INT_IMAGE_1D_ARRAY_EXT"("0x905D")
        "GL_INT_IMAGE_2D_ARRAY_EXT"("0x905E")
        "GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT"("0x905F")
        "GL_INT_IMAGE_2D_MULTISAMPLE_EXT"("0x9060")
        "GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT"("0x9061")
        "GL_UNSIGNED_INT_IMAGE_1D_EXT"("0x9062")
        "GL_UNSIGNED_INT_IMAGE_2D_EXT"("0x9063")
        "GL_UNSIGNED_INT_IMAGE_3D_EXT"("0x9064")
        "GL_UNSIGNED_INT_IMAGE_2D_RECT_EXT"("0x9065")
        "GL_UNSIGNED_INT_IMAGE_CUBE_EXT"("0x9066")
        "GL_UNSIGNED_INT_IMAGE_BUFFER_EXT"("0x9067")
        "GL_UNSIGNED_INT_IMAGE_1D_ARRAY_EXT"("0x9068")
        "GL_UNSIGNED_INT_IMAGE_2D_ARRAY_EXT"("0x9069")
        "GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT"("0x906A")
        "GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT"("0x906B")
        "GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT"("0x906C")
        "GL_MAX_IMAGE_SAMPLES_EXT"("0x906D")
        "GL_IMAGE_BINDING_FORMAT_EXT"("0x906E")
        "GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT"("0x00000001")
        "GL_ELEMENT_ARRAY_BARRIER_BIT_EXT"("0x00000002")
        "GL_UNIFORM_BARRIER_BIT_EXT"("0x00000004")
        "GL_TEXTURE_FETCH_BARRIER_BIT_EXT"("0x00000008")
        "GL_SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT"("0x00000020")
        "GL_COMMAND_BARRIER_BIT_EXT"("0x00000040")
        "GL_PIXEL_BUFFER_BARRIER_BIT_EXT"("0x00000080")
        "GL_TEXTURE_UPDATE_BARRIER_BIT_EXT"("0x00000100")
        "GL_BUFFER_UPDATE_BARRIER_BIT_EXT"("0x00000200")
        "GL_FRAMEBUFFER_BARRIER_BIT_EXT"("0x00000400")
        "GL_TRANSFORM_FEEDBACK_BARRIER_BIT_EXT"("0x00000800")
        "GL_ATOMIC_COUNTER_BARRIER_BIT_EXT"("0x00001000")
        "GL_ALL_BARRIER_BITS_EXT"("0xFFFFFFFF")
        "glBindImageTextureEXT"(
            void,
            GLuint("index"),
            GLuint("texture"),
            GLint("level"),
            GLboolean("layered"),
            GLint("layer"),
            GLenum("access"),
            GLint("format")
        )
        "glMemoryBarrierEXT"(void, GLbitfield("barriers"))
    }
    file("SharedTexturePalette", EXT, "GL_EXT_shared_texture_palette", "GL_SHARED_TEXTURE_PALETTE_EXT" to "0x81FB")
    file("StencilClearTag", EXT, "GL_EXT_stencil_clear_tag") {
        "GL_STENCIL_TAG_BITS_EXT"("0x88F2")
        "GL_STENCIL_CLEAR_TAG_VALUE_EXT"("0x88F3")
        "glStencilClearTagEXT"(void, GLsizei("stencilTagBits"), GLuint("stencilClearTag"))
    }
    file("StencilTwoSide", EXT, "GL_EXT_stencil_two_side") {
        "GL_STENCIL_TEST_TWO_SIDE_EXT"("0x8910")
        "GL_ACTIVE_STENCIL_FACE_EXT"("0x8911")
        "glActiveStencilFaceEXT"(void, GLenum("face"))
    }
    file(
        "StencilWrap", EXT, "GL_EXT_stencil_wrap",
        "GL_INCR_WRAP_EXT" to "0x8507",
        "GL_DECR_WRAP_EXT" to "0x8508"
    )
    file("Subtexture", EXT, "GL_EXT_subtexture") {
        "glTexSubImage1DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLsizei("width"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glTexSubImage2DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
    }
    file(
        "Texture", EXT, "GL_EXT_texture",
        "GL_ALPHA4_EXT" to "0x803B",
        "GL_ALPHA8_EXT" to "0x803C",
        "GL_ALPHA12_EXT" to "0x803D",
        "GL_ALPHA16_EXT" to "0x803E",
        "GL_LUMINANCE4_EXT" to "0x803F",
        "GL_LUMINANCE8_EXT" to "0x8040",
        "GL_LUMINANCE12_EXT" to "0x8041",
        "GL_LUMINANCE16_EXT" to "0x8042",
        "GL_LUMINANCE4_ALPHA4_EXT" to "0x8043",
        "GL_LUMINANCE6_ALPHA2_EXT" to "0x8044",
        "GL_LUMINANCE8_ALPHA8_EXT" to "0x8045",
        "GL_LUMINANCE12_ALPHA4_EXT" to "0x8046",
        "GL_LUMINANCE12_ALPHA12_EXT" to "0x8047",
        "GL_LUMINANCE16_ALPHA16_EXT" to "0x8048",
        "GL_INTENSITY_EXT" to "0x8049",
        "GL_INTENSITY4_EXT" to "0x804A",
        "GL_INTENSITY8_EXT" to "0x804B",
        "GL_INTENSITY12_EXT" to "0x804C",
        "GL_INTENSITY16_EXT" to "0x804D",
        "GL_RGB2_EXT" to "0x804E",
        "GL_RGB4_EXT" to "0x804F",
        "GL_RGB5_EXT" to "0x8050",
        "GL_RGB8_EXT" to "0x8051",
        "GL_RGB10_EXT" to "0x8052",
        "GL_RGB12_EXT" to "0x8053",
        "GL_RGB16_EXT" to "0x8054",
        "GL_RGBA2_EXT" to "0x8055",
        "GL_RGBA4_EXT" to "0x8056",
        "GL_RGB5_A1_EXT" to "0x8057",
        "GL_RGBA8_EXT" to "0x8058",
        "GL_RGB10_A2_EXT" to "0x8059",
        "GL_RGBA12_EXT" to "0x805A",
        "GL_RGBA16_EXT" to "0x805B",
        "GL_TEXTURE_RED_SIZE_EXT" to "0x805C",
        "GL_TEXTURE_GREEN_SIZE_EXT" to "0x805D",
        "GL_TEXTURE_BLUE_SIZE_EXT" to "0x805E",
        "GL_TEXTURE_ALPHA_SIZE_EXT" to "0x805F",
        "GL_TEXTURE_LUMINANCE_SIZE_EXT" to "0x8060",
        "GL_TEXTURE_INTENSITY_SIZE_EXT" to "0x8061",
        "GL_REPLACE_EXT" to "0x8062",
        "GL_PROXY_TEXTURE_1D_EXT" to "0x8063",
        "GL_PROXY_TEXTURE_2D_EXT" to "0x8064",
        "GL_TEXTURE_TOO_LARGE_EXT" to "0x8065"
    )
    file("Texture3D", EXT, "GL_EXT_texture3D") {
        "GL_PACK_SKIP_IMAGES_EXT"("0x806B")
        "GL_PACK_IMAGE_HEIGHT_EXT"("0x806C")
        "GL_UNPACK_SKIP_IMAGES_EXT"("0x806D")
        "GL_UNPACK_IMAGE_HEIGHT_EXT"("0x806E")
        "GL_TEXTURE_3D_EXT"("0x806F")
        "GL_PROXY_TEXTURE_3D_EXT"("0x8070")
        "GL_TEXTURE_DEPTH_EXT"("0x8071")
        "GL_TEXTURE_WRAP_R_EXT"("0x8072")
        "GL_MAX_3D_TEXTURE_SIZE_EXT"("0x8073")
        "glTexImage3DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLint("border"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glTexSubImage3DEXT"(
            void,
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
    }
    file("TextureArray", EXT, "GL_EXT_texture_array") {
        "GL_TEXTURE_1D_ARRAY_EXT"("0x8C18")
        "GL_PROXY_TEXTURE_1D_ARRAY_EXT"("0x8C19")
        "GL_TEXTURE_2D_ARRAY_EXT"("0x8C1A")
        "GL_PROXY_TEXTURE_2D_ARRAY_EXT"("0x8C1B")
        "GL_TEXTURE_BINDING_1D_ARRAY_EXT"("0x8C1C")
        "GL_TEXTURE_BINDING_2D_ARRAY_EXT"("0x8C1D")
        "GL_MAX_ARRAY_TEXTURE_LAYERS_EXT"("0x88FF")
        "GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT"("0x884E")
        "glFramebufferTextureLayerEXT"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLuint("texture"),
            GLint("level"),
            GLint("layer")
        )
    }
    file("TextureBufferObject", EXT, "GL_EXT_texture_buffer_object") {
        "GL_TEXTURE_BUFFER_EXT"("0x8C2A")
        "GL_MAX_TEXTURE_BUFFER_SIZE_EXT"("0x8C2B")
        "GL_TEXTURE_BINDING_BUFFER_EXT"("0x8C2C")
        "GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT"("0x8C2D")
        "GL_TEXTURE_BUFFER_FORMAT_EXT"("0x8C2E")
        "glTexBufferEXT"(void, GLenum("target"), GLenum("internalformat"), GLuint("buffer"))
    }
    file(
        "TextureCompressionLatc", EXT, "GL_EXT_texture_compression_latc",
        "GL_COMPRESSED_LUMINANCE_LATC1_EXT" to "0x8C70",
        "GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT" to "0x8C71",
        "GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT" to "0x8C72",
        "GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT" to "0x8C73"
    )
    file(
        "TextureCompressionRgtc", EXT, "GL_EXT_texture_compression_rgtc",
        "GL_COMPRESSED_RED_RGTC1_EXT" to "0x8DBB",
        "GL_COMPRESSED_SIGNED_RED_RGTC1_EXT" to "0x8DBC",
        "GL_COMPRESSED_RED_GREEN_RGTC2_EXT" to "0x8DBD",
        "GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT" to "0x8DBE"
    )
    file(
        "TextureCompressionS3tc", EXT, "GL_EXT_texture_compression_s3tc",
        "GL_COMPRESSED_RGB_S3TC_DXT1_EXT" to "0x83F0",
        "GL_COMPRESSED_RGBA_S3TC_DXT1_EXT" to "0x83F1",
        "GL_COMPRESSED_RGBA_S3TC_DXT3_EXT" to "0x83F2",
        "GL_COMPRESSED_RGBA_S3TC_DXT5_EXT" to "0x83F3"
    )
    file(
        "TextureCubeMap", EXT, "GL_EXT_texture_cube_map",
        "GL_NORMAL_MAP_EXT" to "0x8511",
        "GL_REFLECTION_MAP_EXT" to "0x8512",
        "GL_TEXTURE_CUBE_MAP_EXT" to "0x8513",
        "GL_TEXTURE_BINDING_CUBE_MAP_EXT" to "0x8514",
        "GL_TEXTURE_CUBE_MAP_POSITIVE_X_EXT" to "0x8515",
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_X_EXT" to "0x8516",
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Y_EXT" to "0x8517",
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_EXT" to "0x8518",
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Z_EXT" to "0x8519",
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_EXT" to "0x851A",
        "GL_PROXY_TEXTURE_CUBE_MAP_EXT" to "0x851B",
        "GL_MAX_CUBE_MAP_TEXTURE_SIZE_EXT" to "0x851C"
    )
    file(
        "TextureEnvCombine", EXT, "GL_EXT_texture_env_combine",
        "GL_COMBINE_EXT" to "0x8570",
        "GL_COMBINE_RGB_EXT" to "0x8571",
        "GL_COMBINE_ALPHA_EXT" to "0x8572",
        "GL_RGB_SCALE_EXT" to "0x8573",
        "GL_ADD_SIGNED_EXT" to "0x8574",
        "GL_INTERPOLATE_EXT" to "0x8575",
        "GL_CONSTANT_EXT" to "0x8576",
        "GL_PRIMARY_COLOR_EXT" to "0x8577",
        "GL_PREVIOUS_EXT" to "0x8578",
        "GL_SOURCE0_RGB_EXT" to "0x8580",
        "GL_SOURCE1_RGB_EXT" to "0x8581",
        "GL_SOURCE2_RGB_EXT" to "0x8582",
        "GL_SOURCE0_ALPHA_EXT" to "0x8588",
        "GL_SOURCE1_ALPHA_EXT" to "0x8589",
        "GL_SOURCE2_ALPHA_EXT" to "0x858A",
        "GL_OPERAND0_RGB_EXT" to "0x8590",
        "GL_OPERAND1_RGB_EXT" to "0x8591",
        "GL_OPERAND2_RGB_EXT" to "0x8592",
        "GL_OPERAND0_ALPHA_EXT" to "0x8598",
        "GL_OPERAND1_ALPHA_EXT" to "0x8599",
        "GL_OPERAND2_ALPHA_EXT" to "0x859A"
    )
    file(
        "TextureEnvDot3", EXT, "GL_EXT_texture_env_dot3",
        "GL_DOT3_RGB_EXT" to "0x8740",
        "GL_DOT3_RGBA_EXT" to "0x8741"
    )
    file(
        "TextureFilterAnisotropic", EXT, "GL_EXT_texture_filter_anisotropic",
        "GL_TEXTURE_MAX_ANISOTROPY_EXT" to "0x84FE",
        "GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT" to "0x84FF"
    )
    file(
        "TextureFilterMinmax", EXT, "GL_EXT_texture_filter_minmax",
        "GL_TEXTURE_REDUCTION_MODE_EXT" to "0x9366",
        "GL_WEIGHTED_AVERAGE_EXT" to "0x9367"
    )
    file("TextureInteger", EXT, "GL_EXT_texture_integer") {
        "GL_RGBA32UI_EXT"("0x8D70")
        "GL_RGB32UI_EXT"("0x8D71")
        "GL_ALPHA32UI_EXT"("0x8D72")
        "GL_INTENSITY32UI_EXT"("0x8D73")
        "GL_LUMINANCE32UI_EXT"("0x8D74")
        "GL_LUMINANCE_ALPHA32UI_EXT"("0x8D75")
        "GL_RGBA16UI_EXT"("0x8D76")
        "GL_RGB16UI_EXT"("0x8D77")
        "GL_ALPHA16UI_EXT"("0x8D78")
        "GL_INTENSITY16UI_EXT"("0x8D79")
        "GL_LUMINANCE16UI_EXT"("0x8D7A")
        "GL_LUMINANCE_ALPHA16UI_EXT"("0x8D7B")
        "GL_RGBA8UI_EXT"("0x8D7C")
        "GL_RGB8UI_EXT"("0x8D7D")
        "GL_ALPHA8UI_EXT"("0x8D7E")
        "GL_INTENSITY8UI_EXT"("0x8D7F")
        "GL_LUMINANCE8UI_EXT"("0x8D80")
        "GL_LUMINANCE_ALPHA8UI_EXT"("0x8D81")
        "GL_RGBA32I_EXT"("0x8D82")
        "GL_RGB32I_EXT"("0x8D83")
        "GL_ALPHA32I_EXT"("0x8D84")
        "GL_INTENSITY32I_EXT"("0x8D85")
        "GL_LUMINANCE32I_EXT"("0x8D86")
        "GL_LUMINANCE_ALPHA32I_EXT"("0x8D87")
        "GL_RGBA16I_EXT"("0x8D88")
        "GL_RGB16I_EXT"("0x8D89")
        "GL_ALPHA16I_EXT"("0x8D8A")
        "GL_INTENSITY16I_EXT"("0x8D8B")
        "GL_LUMINANCE16I_EXT"("0x8D8C")
        "GL_LUMINANCE_ALPHA16I_EXT"("0x8D8D")
        "GL_RGBA8I_EXT"("0x8D8E")
        "GL_RGB8I_EXT"("0x8D8F")
        "GL_ALPHA8I_EXT"("0x8D90")
        "GL_INTENSITY8I_EXT"("0x8D91")
        "GL_LUMINANCE8I_EXT"("0x8D92")
        "GL_LUMINANCE_ALPHA8I_EXT"("0x8D93")
        "GL_RED_INTEGER_EXT"("0x8D94")
        "GL_GREEN_INTEGER_EXT"("0x8D95")
        "GL_BLUE_INTEGER_EXT"("0x8D96")
        "GL_ALPHA_INTEGER_EXT"("0x8D97")
        "GL_RGB_INTEGER_EXT"("0x8D98")
        "GL_RGBA_INTEGER_EXT"("0x8D99")
        "GL_BGR_INTEGER_EXT"("0x8D9A")
        "GL_BGRA_INTEGER_EXT"("0x8D9B")
        "GL_LUMINANCE_INTEGER_EXT"("0x8D9C")
        "GL_LUMINANCE_ALPHA_INTEGER_EXT"("0x8D9D")
        "GL_RGBA_INTEGER_MODE_EXT"("0x8D9E")
        "glTexParameterIivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "const GLint *"))
        "glTexParameterIuivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "const GLuint *"))
        "glGetTexParameterIivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetTexParameterIuivEXT"(void, GLenum("target"), GLenum("pname"), address("params", "GLuint *"))
        "glClearColorIiEXT"(void, GLint("red"), GLint("green"), GLint("blue"), GLint("alpha"))
        "glClearColorIuiEXT"(void, GLuint("red"), GLuint("green"), GLuint("blue"), GLuint("alpha"))
    }
    file(
        "TextureLodBias", EXT, "GL_EXT_texture_lod_bias",
        "GL_MAX_TEXTURE_LOD_BIAS_EXT" to "0x84FD",
        "GL_TEXTURE_FILTER_CONTROL_EXT" to "0x8500",
        "GL_TEXTURE_LOD_BIAS_EXT" to "0x8501"
    )
    file(
        "TextureMirrorClamp", EXT, "GL_EXT_texture_mirror_clamp",
        "GL_MIRROR_CLAMP_EXT" to "0x8742",
        "GL_MIRROR_CLAMP_TO_EDGE_EXT" to "0x8743",
        "GL_MIRROR_CLAMP_TO_BORDER_EXT" to "0x8912"
    )
    file("TextureObject", EXT, "GL_EXT_texture_object") {
        "GL_TEXTURE_PRIORITY_EXT"("0x8066")
        "GL_TEXTURE_RESIDENT_EXT"("0x8067")
        "GL_TEXTURE_1D_BINDING_EXT"("0x8068")
        "GL_TEXTURE_2D_BINDING_EXT"("0x8069")
        "GL_TEXTURE_3D_BINDING_EXT"("0x806A")
        "glAreTexturesResidentEXT"(
            GLboolean,
            GLsizei("n"),
            address("textures", "const GLuint *"),
            address("residences", "GLboolean *")
        )
        "glBindTextureEXT"(void, GLenum("target"), GLuint("texture"))
        "glDeleteTexturesEXT"(void, GLsizei("n"), address("textures", "const GLuint *"))
        "glGenTexturesEXT"(void, GLsizei("n"), address("textures", "GLuint *"))
        "glIsTextureEXT"(GLboolean, GLuint("texture"))
        "glPrioritizeTexturesEXT"(
            void,
            GLsizei("n"),
            address("textures", "const GLuint *"),
            address("priorities", "const GLclampf *")
        )
    }
    file("TexturePerturbNormal", EXT, "GL_EXT_texture_perturb_normal") {
        "GL_PERTURB_EXT"("0x85AE")
        "GL_TEXTURE_NORMAL_EXT"("0x85AF")
        "glTextureNormalEXT"(void, GLenum("mode"))
    }
    file(
        "TextureSrgb", EXT, "GL_EXT_texture_sRGB",
        "GL_SRGB_EXT" to "0x8C40",
        "GL_SRGB8_EXT" to "0x8C41",
        "GL_SRGB_ALPHA_EXT" to "0x8C42",
        "GL_SRGB8_ALPHA8_EXT" to "0x8C43",
        "GL_SLUMINANCE_ALPHA_EXT" to "0x8C44",
        "GL_SLUMINANCE8_ALPHA8_EXT" to "0x8C45",
        "GL_SLUMINANCE_EXT" to "0x8C46",
        "GL_SLUMINANCE8_EXT" to "0x8C47",
        "GL_COMPRESSED_SRGB_EXT" to "0x8C48",
        "GL_COMPRESSED_SRGB_ALPHA_EXT" to "0x8C49",
        "GL_COMPRESSED_SLUMINANCE_EXT" to "0x8C4A",
        "GL_COMPRESSED_SLUMINANCE_ALPHA_EXT" to "0x8C4B",
        "GL_COMPRESSED_SRGB_S3TC_DXT1_EXT" to "0x8C4C",
        "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT" to "0x8C4D",
        "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT" to "0x8C4E",
        "GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT" to "0x8C4F"
    )
    file("TextureSrgbR8", EXT, "GL_EXT_texture_sRGB_R8", "GL_SR8_EXT" to "0x8FBD")
    file("TextureSrgbRGB", EXT, "GL_EXT_texture_sRGB_RG8", "GL_SRG8_EXT" to "0x8FBE")
    file(
        "TextureSrgbDecode", EXT, "GL_EXT_texture_sRGB_decode",
        "GL_TEXTURE_SRGB_DECODE_EXT" to "0x8A48",
        "GL_DECODE_EXT" to "0x8A49",
        "GL_SKIP_DECODE_EXT" to "0x8A4A"
    )
    file(
        "TextureSharedExponent", EXT, "GL_EXT_texture_shared_exponent",
        "GL_RGB9_E5_EXT" to "0x8C3D",
        "GL_UNSIGNED_INT_5_9_9_9_REV_EXT" to "0x8C3E",
        "GL_TEXTURE_SHARED_SIZE_EXT" to "0x8C3F",
    )
    file(
        "TextureSnorm", EXT, "GL_EXT_texture_snorm",
        "GL_ALPHA_SNORM" to "0x9010",
        "GL_LUMINANCE_SNORM" to "0x9011",
        "GL_LUMINANCE_ALPHA_SNORM" to "0x9012",
        "GL_INTENSITY_SNORM" to "0x9013",
        "GL_ALPHA8_SNORM" to "0x9014",
        "GL_LUMINANCE8_SNORM" to "0x9015",
        "GL_LUMINANCE8_ALPHA8_SNORM" to "0x9016",
        "GL_INTENSITY8_SNORM" to "0x9017",
        "GL_ALPHA16_SNORM" to "0x9018",
        "GL_LUMINANCE16_SNORM" to "0x9019",
        "GL_LUMINANCE16_ALPHA16_SNORM" to "0x901A",
        "GL_INTENSITY16_SNORM" to "0x901B",
        "GL_RED_SNORM" to "0x8F90",
        "GL_RG_SNORM" to "0x8F91",
        "GL_RGB_SNORM" to "0x8F92",
        "GL_RGBA_SNORM" to "0x8F93",
    )
    file("TextureStorage", EXT, "GL_EXT_texture_storage") {
        "GL_TEXTURE_IMMUTABLE_FORMAT_EXT"("0x912F")
        "GL_RGBA32F_EXT"("0x8814")
        "GL_RGB32F_EXT"("0x8815")
        "GL_ALPHA32F_EXT"("0x8816")
        "GL_LUMINANCE32F_EXT"("0x8818")
        "GL_LUMINANCE_ALPHA32F_EXT"("0x8819")
        "GL_RGBA16F_EXT"("0x881A")
        "GL_RGB16F_EXT"("0x881B")
        "GL_ALPHA16F_EXT"("0x881C")
        "GL_LUMINANCE16F_EXT"("0x881E")
        "GL_LUMINANCE_ALPHA16F_EXT"("0x881F")
        "GL_BGRA8_EXT"("0x93A1")
        "GL_R8_EXT"("0x8229")
        "GL_RG8_EXT"("0x822B")
        "GL_R32F_EXT"("0x822E")
        "GL_RG32F_EXT"("0x8230")
        "GL_R16F_EXT"("0x822D")
        "GL_RG16F_EXT"("0x822F")
        "glTexStorage1DEXT"(void, GLenum("target"), GLsizei("levels"), GLenum("internalformat"), GLsizei("width"))
        "glTexStorage2DEXT"(
            void,
            GLenum("target"),
            GLsizei("levels"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height")
        )
        "glTexStorage3DEXT"(
            void,
            GLenum("target"),
            GLsizei("levels"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth")
        )
    }
    file(
        "TextureSwizzle", EXT, "GL_EXT_texture_swizzle",
        "GL_TEXTURE_SWIZZLE_R_EXT" to "0x8E42",
        "GL_TEXTURE_SWIZZLE_G_EXT" to "0x8E43",
        "GL_TEXTURE_SWIZZLE_B_EXT" to "0x8E44",
        "GL_TEXTURE_SWIZZLE_A_EXT" to "0x8E45",
        "GL_TEXTURE_SWIZZLE_RGBA_EXT" to "0x8E46"
    )
    file("TimerQuery", EXT, "GL_EXT_timer_query") {
        "GL_TIME_ELAPSED_EXT"("0x88BF")
        "glGetQueryObjecti64vEXT"(void, GLuint("id"), GLenum("pname"), address("params", "GLint64 *"))
        "glGetQueryObjectui64vEXT"(void, GLuint("id"), GLenum("pname"), address("params", "GLuint64 *"))
    }
    file("TransformFeedback", EXT, "GL_EXT_transform_feedback") {
        "GL_TRANSFORM_FEEDBACK_BUFFER_EXT"("0x8C8E")
        "GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT"("0x8C84")
        "GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT"("0x8C85")
        "GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT"("0x8C8F")
        "GL_INTERLEAVED_ATTRIBS_EXT"("0x8C8C")
        "GL_SEPARATE_ATTRIBS_EXT"("0x8C8D")
        "GL_PRIMITIVES_GENERATED_EXT"("0x8C87")
        "GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT"("0x8C88")
        "GL_RASTERIZER_DISCARD_EXT"("0x8C89")
        "GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT"("0x8C8A")
        "GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT"("0x8C8B")
        "GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT"("0x8C80")
        "GL_TRANSFORM_FEEDBACK_VARYINGS_EXT"("0x8C83")
        "GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT"("0x8C7F")
        "GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT"("0x8C76")
        "glBeginTransformFeedbackEXT"(void, GLenum("primitiveMode"))
        "glEndTransformFeedbackEXT"(void)
        "glBindBufferRangeEXT"(
            void,
            GLenum("target"),
            GLuint("index"),
            GLuint("buffer"),
            GLintptr("offset"),
            GLsizeiptr("size")
        )
        "glBindBufferOffsetEXT"(void, GLenum("target"), GLuint("index"), GLuint("buffer"), GLintptr("offset"))
        "glBindBufferBaseEXT"(void, GLenum("target"), GLuint("index"), GLuint("buffer"))
        "glTransformFeedbackVaryingsEXT"(
            void,
            GLuint("program"),
            GLsizei("count"),
            address("varyings", "const GLchar *const*"),
            GLenum("bufferMode")
        )
        "glGetTransformFeedbackVaryingEXT"(
            void,
            GLuint("program"),
            GLuint("index"),
            GLsizei("bufSize"),
            address("length", "GLsizei *"),
            address("size", "GLsizei *"),
            address("type", "GLenum *"),
            address("name", "GLchar *")
        )
    }
    file("VertexArray", EXT, "GL_EXT_vertex_array") {
        "GL_VERTEX_ARRAY_EXT"("0x8074")
        "GL_NORMAL_ARRAY_EXT"("0x8075")
        "GL_COLOR_ARRAY_EXT"("0x8076")
        "GL_INDEX_ARRAY_EXT"("0x8077")
        "GL_TEXTURE_COORD_ARRAY_EXT"("0x8078")
        "GL_EDGE_FLAG_ARRAY_EXT"("0x8079")
        "GL_VERTEX_ARRAY_SIZE_EXT"("0x807A")
        "GL_VERTEX_ARRAY_TYPE_EXT"("0x807B")
        "GL_VERTEX_ARRAY_STRIDE_EXT"("0x807C")
        "GL_VERTEX_ARRAY_COUNT_EXT"("0x807D")
        "GL_NORMAL_ARRAY_TYPE_EXT"("0x807E")
        "GL_NORMAL_ARRAY_STRIDE_EXT"("0x807F")
        "GL_NORMAL_ARRAY_COUNT_EXT"("0x8080")
        "GL_COLOR_ARRAY_SIZE_EXT"("0x8081")
        "GL_COLOR_ARRAY_TYPE_EXT"("0x8082")
        "GL_COLOR_ARRAY_STRIDE_EXT"("0x8083")
        "GL_COLOR_ARRAY_COUNT_EXT"("0x8084")
        "GL_INDEX_ARRAY_TYPE_EXT"("0x8085")
        "GL_INDEX_ARRAY_STRIDE_EXT"("0x8086")
        "GL_INDEX_ARRAY_COUNT_EXT"("0x8087")
        "GL_TEXTURE_COORD_ARRAY_SIZE_EXT"("0x8088")
        "GL_TEXTURE_COORD_ARRAY_TYPE_EXT"("0x8089")
        "GL_TEXTURE_COORD_ARRAY_STRIDE_EXT"("0x808A")
        "GL_TEXTURE_COORD_ARRAY_COUNT_EXT"("0x808B")
        "GL_EDGE_FLAG_ARRAY_STRIDE_EXT"("0x808C")
        "GL_EDGE_FLAG_ARRAY_COUNT_EXT"("0x808D")
        "GL_VERTEX_ARRAY_POINTER_EXT"("0x808E")
        "GL_NORMAL_ARRAY_POINTER_EXT"("0x808F")
        "GL_COLOR_ARRAY_POINTER_EXT"("0x8090")
        "GL_INDEX_ARRAY_POINTER_EXT"("0x8091")
        "GL_TEXTURE_COORD_ARRAY_POINTER_EXT"("0x8092")
        "GL_EDGE_FLAG_ARRAY_POINTER_EXT"("0x8093")
        "glArrayElementEXT"(void, GLint("i"))
        "glColorPointerEXT"(
            void,
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLsizei("count"),
            address("pointer", "const void *")
        )
        "glDrawArraysEXT"(void, GLenum("mode"), GLint("first"), GLsizei("count"))
        "glEdgeFlagPointerEXT"(void, GLsizei("stride"), GLsizei("count"), address("pointer", "const GLboolean *"))
        "glGetPointervEXT"(void, GLenum("pname"), address("params", "void **"))
        "glIndexPointerEXT"(
            void,
            GLenum("type"),
            GLsizei("stride"),
            GLsizei("count"),
            address("pointer", "const void *")
        )
        "glNormalPointerEXT"(
            void,
            GLenum("type"),
            GLsizei("stride"),
            GLsizei("count"),
            address("pointer", "const void *")
        )
        "glTexCoordPointerEXT"(
            void,
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLsizei("count"),
            address("pointer", "const void *")
        )
        "glVertexPointerEXT"(
            void,
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLsizei("count"),
            address("pointer", "const void *")
        )
    }
    file("VertexAttrib64bit", EXT, "GL_EXT_vertex_attrib_64bit") {
        "GL_DOUBLE_VEC2_EXT"("0x8FFC")
        "GL_DOUBLE_VEC3_EXT"("0x8FFD")
        "GL_DOUBLE_VEC4_EXT"("0x8FFE")
        "GL_DOUBLE_MAT2_EXT"("0x8F46")
        "GL_DOUBLE_MAT3_EXT"("0x8F47")
        "GL_DOUBLE_MAT4_EXT"("0x8F48")
        "GL_DOUBLE_MAT2x3_EXT"("0x8F49")
        "GL_DOUBLE_MAT2x4_EXT"("0x8F4A")
        "GL_DOUBLE_MAT3x2_EXT"("0x8F4B")
        "GL_DOUBLE_MAT3x4_EXT"("0x8F4C")
        "GL_DOUBLE_MAT4x2_EXT"("0x8F4D")
        "GL_DOUBLE_MAT4x3_EXT"("0x8F4E")
        "glVertexAttribL1dEXT"(void, GLuint("index"), GLdouble("x"))
        "glVertexAttribL2dEXT"(void, GLuint("index"), GLdouble("x"), GLdouble("y"))
        "glVertexAttribL3dEXT"(void, GLuint("index"), GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glVertexAttribL4dEXT"(void, GLuint("index"), GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))
        "glVertexAttribL1dvEXT"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttribL2dvEXT"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttribL3dvEXT"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttribL4dvEXT"(void, GLuint("index"), address("v", "const GLdouble *"))
        "glVertexAttribLPointerEXT"(
            void,
            GLuint("index"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            address("pointer", "const void *")
        )
        "glGetVertexAttribLdvEXT"(void, GLuint("index"), GLenum("pname"), address("params", "GLdouble *"))
    }
    file("VertexShader", EXT, "GL_EXT_vertex_shader") {
        "GL_VERTEX_SHADER_EXT"("0x8780")
        "GL_VERTEX_SHADER_BINDING_EXT"("0x8781")
        "GL_OP_INDEX_EXT"("0x8782")
        "GL_OP_NEGATE_EXT"("0x8783")
        "GL_OP_DOT3_EXT"("0x8784")
        "GL_OP_DOT4_EXT"("0x8785")
        "GL_OP_MUL_EXT"("0x8786")
        "GL_OP_ADD_EXT"("0x8787")
        "GL_OP_MADD_EXT"("0x8788")
        "GL_OP_FRAC_EXT"("0x8789")
        "GL_OP_MAX_EXT"("0x878A")
        "GL_OP_MIN_EXT"("0x878B")
        "GL_OP_SET_GE_EXT"("0x878C")
        "GL_OP_SET_LT_EXT"("0x878D")
        "GL_OP_CLAMP_EXT"("0x878E")
        "GL_OP_FLOOR_EXT"("0x878F")
        "GL_OP_ROUND_EXT"("0x8790")
        "GL_OP_EXP_BASE_2_EXT"("0x8791")
        "GL_OP_LOG_BASE_2_EXT"("0x8792")
        "GL_OP_POWER_EXT"("0x8793")
        "GL_OP_RECIP_EXT"("0x8794")
        "GL_OP_RECIP_SQRT_EXT"("0x8795")
        "GL_OP_SUB_EXT"("0x8796")
        "GL_OP_CROSS_PRODUCT_EXT"("0x8797")
        "GL_OP_MULTIPLY_MATRIX_EXT"("0x8798")
        "GL_OP_MOV_EXT"("0x8799")
        "GL_OUTPUT_VERTEX_EXT"("0x879A")
        "GL_OUTPUT_COLOR0_EXT"("0x879B")
        "GL_OUTPUT_COLOR1_EXT"("0x879C")
        "GL_OUTPUT_TEXTURE_COORD0_EXT"("0x879D")
        "GL_OUTPUT_TEXTURE_COORD1_EXT"("0x879E")
        "GL_OUTPUT_TEXTURE_COORD2_EXT"("0x879F")
        "GL_OUTPUT_TEXTURE_COORD3_EXT"("0x87A0")
        "GL_OUTPUT_TEXTURE_COORD4_EXT"("0x87A1")
        "GL_OUTPUT_TEXTURE_COORD5_EXT"("0x87A2")
        "GL_OUTPUT_TEXTURE_COORD6_EXT"("0x87A3")
        "GL_OUTPUT_TEXTURE_COORD7_EXT"("0x87A4")
        "GL_OUTPUT_TEXTURE_COORD8_EXT"("0x87A5")
        "GL_OUTPUT_TEXTURE_COORD9_EXT"("0x87A6")
        "GL_OUTPUT_TEXTURE_COORD10_EXT"("0x87A7")
        "GL_OUTPUT_TEXTURE_COORD11_EXT"("0x87A8")
        "GL_OUTPUT_TEXTURE_COORD12_EXT"("0x87A9")
        "GL_OUTPUT_TEXTURE_COORD13_EXT"("0x87AA")
        "GL_OUTPUT_TEXTURE_COORD14_EXT"("0x87AB")
        "GL_OUTPUT_TEXTURE_COORD15_EXT"("0x87AC")
        "GL_OUTPUT_TEXTURE_COORD16_EXT"("0x87AD")
        "GL_OUTPUT_TEXTURE_COORD17_EXT"("0x87AE")
        "GL_OUTPUT_TEXTURE_COORD18_EXT"("0x87AF")
        "GL_OUTPUT_TEXTURE_COORD19_EXT"("0x87B0")
        "GL_OUTPUT_TEXTURE_COORD20_EXT"("0x87B1")
        "GL_OUTPUT_TEXTURE_COORD21_EXT"("0x87B2")
        "GL_OUTPUT_TEXTURE_COORD22_EXT"("0x87B3")
        "GL_OUTPUT_TEXTURE_COORD23_EXT"("0x87B4")
        "GL_OUTPUT_TEXTURE_COORD24_EXT"("0x87B5")
        "GL_OUTPUT_TEXTURE_COORD25_EXT"("0x87B6")
        "GL_OUTPUT_TEXTURE_COORD26_EXT"("0x87B7")
        "GL_OUTPUT_TEXTURE_COORD27_EXT"("0x87B8")
        "GL_OUTPUT_TEXTURE_COORD28_EXT"("0x87B9")
        "GL_OUTPUT_TEXTURE_COORD29_EXT"("0x87BA")
        "GL_OUTPUT_TEXTURE_COORD30_EXT"("0x87BB")
        "GL_OUTPUT_TEXTURE_COORD31_EXT"("0x87BC")
        "GL_OUTPUT_FOG_EXT"("0x87BD")
        "GL_SCALAR_EXT"("0x87BE")
        "GL_VECTOR_EXT"("0x87BF")
        "GL_MATRIX_EXT"("0x87C0")
        "GL_VARIANT_EXT"("0x87C1")
        "GL_INVARIANT_EXT"("0x87C2")
        "GL_LOCAL_CONSTANT_EXT"("0x87C3")
        "GL_LOCAL_EXT"("0x87C4")
        "GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT"("0x87C5")
        "GL_MAX_VERTEX_SHADER_VARIANTS_EXT"("0x87C6")
        "GL_MAX_VERTEX_SHADER_INVARIANTS_EXT"("0x87C7")
        "GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT"("0x87C8")
        "GL_MAX_VERTEX_SHADER_LOCALS_EXT"("0x87C9")
        "GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT"("0x87CA")
        "GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT"("0x87CB")
        "GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT"("0x87CC")
        "GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT"("0x87CD")
        "GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT"("0x87CE")
        "GL_VERTEX_SHADER_INSTRUCTIONS_EXT"("0x87CF")
        "GL_VERTEX_SHADER_VARIANTS_EXT"("0x87D0")
        "GL_VERTEX_SHADER_INVARIANTS_EXT"("0x87D1")
        "GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT"("0x87D2")
        "GL_VERTEX_SHADER_LOCALS_EXT"("0x87D3")
        "GL_VERTEX_SHADER_OPTIMIZED_EXT"("0x87D4")
        "GL_X_EXT"("0x87D5")
        "GL_Y_EXT"("0x87D6")
        "GL_Z_EXT"("0x87D7")
        "GL_W_EXT"("0x87D8")
        "GL_NEGATIVE_X_EXT"("0x87D9")
        "GL_NEGATIVE_Y_EXT"("0x87DA")
        "GL_NEGATIVE_Z_EXT"("0x87DB")
        "GL_NEGATIVE_W_EXT"("0x87DC")
        "GL_ZERO_EXT"("0x87DD")
        "GL_ONE_EXT"("0x87DE")
        "GL_NEGATIVE_ONE_EXT"("0x87DF")
        "GL_NORMALIZED_RANGE_EXT"("0x87E0")
        "GL_FULL_RANGE_EXT"("0x87E1")
        "GL_CURRENT_VERTEX_EXT"("0x87E2")
        "GL_MVP_MATRIX_EXT"("0x87E3")
        "GL_VARIANT_VALUE_EXT"("0x87E4")
        "GL_VARIANT_DATATYPE_EXT"("0x87E5")
        "GL_VARIANT_ARRAY_STRIDE_EXT"("0x87E6")
        "GL_VARIANT_ARRAY_TYPE_EXT"("0x87E7")
        "GL_VARIANT_ARRAY_EXT"("0x87E8")
        "GL_VARIANT_ARRAY_POINTER_EXT"("0x87E9")
        "GL_INVARIANT_VALUE_EXT"("0x87EA")
        "GL_INVARIANT_DATATYPE_EXT"("0x87EB")
        "GL_LOCAL_CONSTANT_VALUE_EXT"("0x87EC")
        "GL_LOCAL_CONSTANT_DATATYPE_EXT"("0x87ED")
        "glBeginVertexShaderEXT"(void)
        "glEndVertexShaderEXT"(void)
        "glBindVertexShaderEXT"(void, GLuint("id"))
        "glGenVertexShadersEXT"(GLuint, GLuint("range"))
        "glDeleteVertexShaderEXT"(void, GLuint("id"))
        "glShaderOp1EXT"(void, GLenum("op"), GLuint("res"), GLuint("arg1"))
        "glShaderOp2EXT"(void, GLenum("op"), GLuint("res"), GLuint("arg1"), GLuint("arg2"))
        "glShaderOp3EXT"(void, GLenum("op"), GLuint("res"), GLuint("arg1"), GLuint("arg2"), GLuint("arg3"))
        "glSwizzleEXT"(
            void,
            GLuint("res"),
            GLuint("in"),
            GLenum("outX"),
            GLenum("outY"),
            GLenum("outZ"),
            GLenum("outW")
        )
        "glWriteMaskEXT"(
            void,
            GLuint("res"),
            GLuint("in"),
            GLenum("outX"),
            GLenum("outY"),
            GLenum("outZ"),
            GLenum("outW")
        )
        "glInsertComponentEXT"(void, GLuint("res"), GLuint("src"), GLuint("num"))
        "glExtractComponentEXT"(void, GLuint("res"), GLuint("src"), GLuint("num"))
        "glGenSymbolsEXT"(GLuint, GLenum("datatype"), GLenum("storagetype"), GLenum("range"), GLuint("components"))
        "glSetInvariantEXT"(void, GLuint("id"), GLenum("type"), address("addr", "const void *"))
        "glSetLocalConstantEXT"(void, GLuint("id"), GLenum("type"), address("addr", "const void *"))
        "glVariantbvEXT"(void, GLuint("id"), address("addr", "const GLbyte *"))
        "glVariantsvEXT"(void, GLuint("id"), address("addr", "const GLshort *"))
        "glVariantivEXT"(void, GLuint("id"), address("addr", "const GLint *"))
        "glVariantfvEXT"(void, GLuint("id"), address("addr", "const GLfloat *"))
        "glVariantdvEXT"(void, GLuint("id"), address("addr", "const GLdouble *"))
        "glVariantubvEXT"(void, GLuint("id"), address("addr", "const GLubyte *"))
        "glVariantusvEXT"(void, GLuint("id"), address("addr", "const GLushort *"))
        "glVariantuivEXT"(void, GLuint("id"), address("addr", "const GLuint *"))
        "glVariantPointerEXT"(void, GLuint("id"), GLenum("type"), GLuint("stride"), address("addr", "const void *"))
        "glEnableVariantClientStateEXT"(void, GLuint("id"))
        "glDisableVariantClientStateEXT"(void, GLuint("id"))
        "glBindLightParameterEXT"(GLuint, GLenum("light"), GLenum("value"))
        "glBindMaterialParameterEXT"(GLuint, GLenum("face"), GLenum("value"))
        "glBindTexGenParameterEXT"(GLuint, GLenum("unit"), GLenum("coord"), GLenum("value"))
        "glBindTextureUnitParameterEXT"(GLuint, GLenum("unit"), GLenum("value"))
        "glBindParameterEXT"(GLuint, GLenum("value"))
        "glIsVariantEnabledEXT"(GLboolean, GLuint("id"), GLenum("cap"))
        "glGetVariantBooleanvEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLboolean *"))
        "glGetVariantIntegervEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLint *"))
        "glGetVariantFloatvEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLfloat *"))
        "glGetVariantPointervEXT"(void, GLuint("id"), GLenum("value"), address("data", "void **"))
        "glGetInvariantBooleanvEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLboolean *"))
        "glGetInvariantIntegervEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLint *"))
        "glGetInvariantFloatvEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLfloat *"))
        "glGetLocalConstantBooleanvEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLboolean *"))
        "glGetLocalConstantIntegervEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLint *"))
        "glGetLocalConstantFloatvEXT"(void, GLuint("id"), GLenum("value"), address("data", "GLfloat *"))
    }
    file("VertexWeighting", EXT, "GL_EXT_vertex_weighting") {
        "GL_MODELVIEW0_STACK_DEPTH_EXT"("0x0BA3")
        "GL_MODELVIEW1_STACK_DEPTH_EXT"("0x8502")
        "GL_MODELVIEW0_MATRIX_EXT"("0x0BA6")
        "GL_MODELVIEW1_MATRIX_EXT"("0x8506")
        "GL_VERTEX_WEIGHTING_EXT"("0x8509")
        "GL_MODELVIEW0_EXT"("0x1700")
        "GL_MODELVIEW1_EXT"("0x850A")
        "GL_CURRENT_VERTEX_WEIGHT_EXT"("0x850B")
        "GL_VERTEX_WEIGHT_ARRAY_EXT"("0x850C")
        "GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT"("0x850D")
        "GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT"("0x850E")
        "GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT"("0x850F")
        "GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT"("0x8510")
        "glVertexWeightfEXT"(void, GLfloat("weight"))
        "glVertexWeightfvEXT"(void, address("weight", "const GLfloat *"))
        "glVertexWeightPointerEXT"(
            void,
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            address("pointer", "const void *")
        )
    }
    file("Win32KeyedMutex", EXT, "GL_EXT_win32_keyed_mutex") {
        "glAcquireKeyedMutexWin32EXT"(GLboolean, GLuint("memory"), GLuint64("key"), GLuint("timeout"))
        "glReleaseKeyedMutexWin32EXT"(GLboolean, GLuint("memory"), GLuint64("key"))
    }
    file("WindowRectangles", EXT, "GL_EXT_window_rectangles") {
        "GL_INCLUSIVE_EXT"("0x8F10")
        "GL_EXCLUSIVE_EXT"("0x8F11")
        "GL_WINDOW_RECTANGLE_EXT"("0x8F12")
        "GL_WINDOW_RECTANGLE_MODE_EXT"("0x8F13")
        "GL_MAX_WINDOW_RECTANGLES_EXT"("0x8F14")
        "GL_NUM_WINDOW_RECTANGLES_EXT"("0x8F15")
        "glWindowRectanglesEXT"(void, GLenum("mode"), GLsizei("count"), address("box", "const GLint *"))
    }
    file("X11SyncObject", EXT, "GL_EXT_x11_sync_object") {
        "GL_SYNC_X11_FENCE_EXT"("0x90E1")
        "glImportSyncEXT"(
            address,
            GLenum("external_sync_type"),
            GLintptr("external_sync"),
            GLbitfield("flags"),
            nativeType = "GLsync"
        )
    }
}
