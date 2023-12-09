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
}
