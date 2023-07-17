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

package overrungl.opengl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

/**
 * @author squid233
 * @since 0.1.0
 */
public final class OpenGLGenerator {
    public static void main(String[] args) throws IOException {
        generateFiles();
    }

    @SuppressWarnings("unchecked")
    private static Map<String, String> constants(String... strings) {
        final int length = strings.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException(STR."strings.length must be an even; got \{length}");
        }
        Map.Entry<String, String>[] entries = new Map.Entry[length / 2];
        for (int i = 0; i < entries.length; i++) {
            entries[i] = Map.entry(strings[i * 2], strings[i * 2 + 1]);
        }
        return Map.ofEntries(entries);
    }

    private static Map<String, String> constants(String constantsTable) {
        return constants(constantsTable.split("\\s+"));
    }

    private static GLExtFunc[] functions(GLExtFunc... functions) {
        return functions;
    }

    private static GLExtFunc func(String name, Type returnType, FuncParam... params) {
        return new GLExtFunc(name, returnType, params);
    }

    private static FuncParam z(String name) {
        return new FuncParam(Type.Boolean, name);
    }

    private static FuncParam i(String name) {
        return new FuncParam(Type.Int, name);
    }

    private static FuncParam j(String name) {
        return new FuncParam(Type.Long, name);
    }

    private static FuncParam f(String name) {
        return new FuncParam(Type.Float, name);
    }

    private static FuncParam p(String name) {
        return new FuncParam(Type.Address, name);
    }

    private static void generateFiles() throws IOException {
        generateFile("GLARBRobustness", new GLExtension("GL_ARB_robustness",
            constants(
                "GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB", "0x00000004",
                "GL_LOSE_CONTEXT_ON_RESET_ARB", "0x8252",
                "GL_GUILTY_CONTEXT_RESET_ARB", "0x8253",
                "GL_INNOCENT_CONTEXT_RESET_ARB", "0x8254",
                "GL_UNKNOWN_CONTEXT_RESET_ARB", "0x8255",
                "GL_RESET_NOTIFICATION_STRATEGY_ARB", "0x8256",
                "GL_NO_RESET_NOTIFICATION_ARB", "0x8261"
            ), functions(
            func("glGetGraphicsResetStatusARB", Type.Int),
            func("glGetnCompressedTexImageARB", Type.Void, i("target"), i("lod"), i("bufSize"), p("img")),
            func("glGetnTexImageARB", Type.Void, i("target"), i("level"), i("format"), i("type"), i("bufSize"), p("img")),
            func("glGetnUniformdvARB", Type.Void, i("program"), i("location"), i("bufSize"), p("params")),
            func("glGetnUniformfvARB", Type.Void, i("program"), i("location"), i("bufSize"), p("params")),
            func("glGetnUniformivARB", Type.Void, i("program"), i("location"), i("bufSize"), p("params")),
            func("glGetnUniformuivARB", Type.Void, i("program"), i("location"), i("bufSize"), p("params")),
            func("glReadnPixelsARB", Type.Void, i("x"), i("y"), i("width"), i("height"), i("format"), i("type"), i("bufSize"), p("data"))
        )));
        generateFile("GLARBSampleLocations", new GLExtension("GL_ARB_sample_locations",
            constants(
                "GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB", "0x933D",
                "GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB", "0x933E",
                "GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB", "0x933F",
                "GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB", "0x9340",
                "GL_SAMPLE_LOCATION_ARB", "0x8E50",
                "GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB", "0x9341",
                "GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB", "0x9342",
                "GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB", "0x9343"
            ), functions(
            func("glEvaluateDepthValuesARB", Type.Void),
            func("glFramebufferSampleLocationsfvARB", Type.Void, i("target"), i("start"), i("count"), p("v")),
            func("glNamedFramebufferSampleLocationsfvARB", Type.Void, i("framebuffer"), i("start"), i("count"), p("v"))
        )));
        generateFile("GLARBSampleShading", new GLExtension("GL_ARB_sample_shading",
            constants(
                "GL_SAMPLE_SHADING_ARB", "0x8C36",
                "GL_MIN_SAMPLE_SHADING_VALUE_ARB", "0x8C37"
            ), functions(
            func("glMinSampleShadingARB", Type.Void, f("value"))
        )));
        generateFile("GLARBShaderObjects", new GLExtension("GL_ARB_shader_objects",
            constants(
                "GL_PROGRAM_OBJECT_ARB", "0x8B40",
                "GL_SHADER_OBJECT_ARB", "0x8B48",
                "GL_OBJECT_TYPE_ARB", "0x8B4E",
                "GL_OBJECT_SUBTYPE_ARB", "0x8B4F",
                "GL_FLOAT_VEC2_ARB", "0x8B50",
                "GL_FLOAT_VEC3_ARB", "0x8B51",
                "GL_FLOAT_VEC4_ARB", "0x8B52",
                "GL_INT_VEC2_ARB", "0x8B53",
                "GL_INT_VEC3_ARB", "0x8B54",
                "GL_INT_VEC4_ARB", "0x8B55",
                "GL_BOOL_ARB", "0x8B56",
                "GL_BOOL_VEC2_ARB", "0x8B57",
                "GL_BOOL_VEC3_ARB", "0x8B58",
                "GL_BOOL_VEC4_ARB", "0x8B59",
                "GL_FLOAT_MAT2_ARB", "0x8B5A",
                "GL_FLOAT_MAT3_ARB", "0x8B5B",
                "GL_FLOAT_MAT4_ARB", "0x8B5C",
                "GL_SAMPLER_1D_ARB", "0x8B5D",
                "GL_SAMPLER_2D_ARB", "0x8B5E",
                "GL_SAMPLER_3D_ARB", "0x8B5F",
                "GL_SAMPLER_CUBE_ARB", "0x8B60",
                "GL_SAMPLER_1D_SHADOW_ARB", "0x8B61",
                "GL_SAMPLER_2D_SHADOW_ARB", "0x8B62",
                "GL_SAMPLER_2D_RECT_ARB", "0x8B63",
                "GL_SAMPLER_2D_RECT_SHADOW_ARB", "0x8B64",
                "GL_OBJECT_DELETE_STATUS_ARB", "0x8B80",
                "GL_OBJECT_COMPILE_STATUS_ARB", "0x8B81",
                "GL_OBJECT_LINK_STATUS_ARB", "0x8B82",
                "GL_OBJECT_VALIDATE_STATUS_ARB", "0x8B83",
                "GL_OBJECT_INFO_LOG_LENGTH_ARB", "0x8B84",
                "GL_OBJECT_ATTACHED_OBJECTS_ARB", "0x8B85",
                "GL_OBJECT_ACTIVE_UNIFORMS_ARB", "0x8B86",
                "GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB", "0x8B87",
                "GL_OBJECT_SHADER_SOURCE_LENGTH_ARB", "0x8B88"
            ), functions(
            func("glDeleteObjectARB", Type.Void, i("obj")),
            func("glGetHandleARB", Type.Int, i("pname")),
            func("glDetachObjectARB", Type.Void, i("containerObj"), i("attachedObj")),
            func("glCreateShaderObjectARB", Type.Int, i("shaderType")),
            func("glShaderSourceARB", Type.Void, i("shaderObj"), i("count"), p("string"), p("length")),
            func("glCompileShaderARB", Type.Void, i("shaderObj")),
            func("glCreateProgramObjectARB", Type.Int),
            func("glAttachObjectARB", Type.Void, i("containerObj"), i("obj")),
            func("glLinkProgramARB", Type.Void, i("programObj")),
            func("glUseProgramObjectARB", Type.Void, i("programObj")),
            func("glValidateProgramARB", Type.Void, i("programObj")),
            func("glUniform1fARB", Type.Void, i("location"), f("v0")),
            func("glUniform2fARB", Type.Void, i("location"), f("v0"), f("v1")),
            func("glUniform3fARB", Type.Void, i("location"), f("v0"), f("v1"), f("v2")),
            func("glUniform4fARB", Type.Void, i("location"), f("v0"), f("v1"), f("v2"), f("v3")),
            func("glUniform1iARB", Type.Void, i("location"), i("v0")),
            func("glUniform2iARB", Type.Void, i("location"), i("v0"), i("v1")),
            func("glUniform3iARB", Type.Void, i("location"), i("v0"), i("v1"), i("v2")),
            func("glUniform4iARB", Type.Void, i("location"), i("v0"), i("v1"), i("v2"), i("v3")),
            func("glUniform1fvARB", Type.Void, i("location"), i("count"), p("value")),
            func("glUniform2fvARB", Type.Void, i("location"), i("count"), p("value")),
            func("glUniform3fvARB", Type.Void, i("location"), i("count"), p("value")),
            func("glUniform4fvARB", Type.Void, i("location"), i("count"), p("value")),
            func("glUniform1ivARB", Type.Void, i("location"), i("count"), p("value")),
            func("glUniform2ivARB", Type.Void, i("location"), i("count"), p("value")),
            func("glUniform3ivARB", Type.Void, i("location"), i("count"), p("value")),
            func("glUniform4ivARB", Type.Void, i("location"), i("count"), p("value")),
            func("glUniformMatrix2fvARB", Type.Void, i("location"), i("count"), z("transpose"), p("value")),
            func("glUniformMatrix3fvARB", Type.Void, i("location"), i("count"), z("transpose"), p("value")),
            func("glUniformMatrix4fvARB", Type.Void, i("location"), i("count"), z("transpose"), p("value")),
            func("glGetObjectParameterfvARB", Type.Void, i("obj"), i("pname"), p("params")),
            func("glGetObjectParameterivARB", Type.Void, i("obj"), i("pname"), p("params")),
            func("glGetInfoLogARB", Type.Void, i("obj"), i("maxLength"), p("length"), p("infoLog")),
            func("glGetAttachedObjectsARB", Type.Void, i("containerObj"), i("maxCount"), p("count"), p("obj")),
            func("glGetUniformLocationARB", Type.Int, i("programObj"), p("name")),
            func("glGetActiveUniformARB", Type.Void, i("programObj"), i("index"), i("maxLength"), p("length"), p("size"), p("type"), p("name")),
            func("glGetUniformfvARB", Type.Void, i("programObj"), i("location"), p("params")),
            func("glGetUniformivARB", Type.Void, i("programObj"), i("location"), p("params")),
            func("glGetShaderSourceARB", Type.Void, i("obj"), i("maxLength"), p("length"), p("source"))
        )));
        generateFile("GLARBShadingLanguageInclude", new GLExtension("GL_ARB_shading_language_include",
            constants(
                "GL_SHADER_INCLUDE_ARB", "0x8DAE",
                "GL_NAMED_STRING_LENGTH_ARB", "0x8DE9",
                "GL_NAMED_STRING_TYPE_ARB", "0x8DEA"
            ), functions(
            func("glNamedStringARB", Type.Void, i("type"), i("nameLen"), p("name"), i("stringLen"), p("string")),
            func("glDeleteNamedStringARB", Type.Void, i("nameLen"), p("name")),
            func("glCompileShaderIncludeARB", Type.Void, i("shader"), i("count"), p("path"), p("length")),
            func("glIsNamedStringARB", Type.Boolean, i("nameLen"), p("name")),
            func("glGetNamedStringARB", Type.Void, i("nameLen"), p("name"), i("bufSize"), p("stringLen"), p("string")),
            func("glGetNamedStringivARB", Type.Void, i("nameLen"), p("name"), i("pname"), p("params"))
        )));
        generateFile("GLARBShadow", "GL_ARB_shadow",
            "GL_TEXTURE_COMPARE_MODE_ARB", "0x884C",
            "GL_TEXTURE_COMPARE_FUNC_ARB", "0x884D",
            "GL_COMPARE_R_TO_TEXTURE_ARB", "0x884E"
        );
        generateFile("GLARBShadowAmbient", "GL_ARB_shadow_ambient",
            "GL_TEXTURE_COMPARE_FAIL_VALUE_ARB", "0x80BF");
        generateFile("GLARBSparseBuffer", new GLExtension("GL_ARB_sparse_buffer",
            constants(
                "GL_SPARSE_STORAGE_BIT_ARB", "0x0400",
                "GL_SPARSE_BUFFER_PAGE_SIZE_ARB", "0x82F8"
            ), functions(
            func("glBufferPageCommitmentARB", Type.Void, i("target"), j("offset"), j("size"), z("commit")),
            func("glNamedBufferPageCommitmentEXT", Type.Void, i("buffer"), j("offset"), j("size"), z("commit")),
            func("glNamedBufferPageCommitmentARB", Type.Void, i("buffer"), j("offset"), j("size"), z("commit"))
        )));
        generateFile("GLARBSparseTexture", new GLExtension("GL_ARB_sparse_texture",
            constants(
                "GL_TEXTURE_SPARSE_ARB", "0x91A6",
                "GL_VIRTUAL_PAGE_SIZE_INDEX_ARB", "0x91A7",
                "GL_NUM_SPARSE_LEVELS_ARB", "0x91AA",
                "GL_NUM_VIRTUAL_PAGE_SIZES_ARB", "0x91A8",
                "GL_VIRTUAL_PAGE_SIZE_X_ARB", "0x9195",
                "GL_VIRTUAL_PAGE_SIZE_Y_ARB", "0x9196",
                "GL_VIRTUAL_PAGE_SIZE_Z_ARB", "0x9197",
                "GL_MAX_SPARSE_TEXTURE_SIZE_ARB", "0x9198",
                "GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB", "0x9199",
                "GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB", "0x919A",
                "GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB", "0x91A9"
            ), functions(
            func("glTexPageCommitmentARB", Type.Void, i("target"), i("level"), i("xoffset"), i("yoffset"), i("zoffset"), i("width"), i("height"), i("depth"), z("commit"))
        )));
        generateFile("GLARBTextureBorderClamp", "GL_ARB_texture_border_clamp",
            "GL_CLAMP_TO_BORDER_ARB", "0x812D");
        generateFile("GLARBTextureBufferObject", new GLExtension("GL_ARB_texture_buffer_object",
            constants(
                "GL_TEXTURE_BUFFER_ARB", "0x8C2A",
                "GL_MAX_TEXTURE_BUFFER_SIZE_ARB", "0x8C2B",
                "GL_TEXTURE_BINDING_BUFFER_ARB", "0x8C2C",
                "GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB", "0x8C2D",
                "GL_TEXTURE_BUFFER_FORMAT_ARB", "0x8C2E"
            ), functions(
            func("glTexBufferARB", Type.Void, i("target"), i("internalFormat"), i("buffer"))
        )));
        generateFile("GLARBTextureCompression", new GLExtension("GL_ARB_texture_compression",
            constants(
                "GL_COMPRESSED_ALPHA_ARB", "0x84E9",
                "GL_COMPRESSED_LUMINANCE_ARB", "0x84EA",
                "GL_COMPRESSED_LUMINANCE_ALPHA_ARB", "0x84EB",
                "GL_COMPRESSED_INTENSITY_ARB", "0x84EC",
                "GL_COMPRESSED_RGB_ARB", "0x84ED",
                "GL_COMPRESSED_RGBA_ARB", "0x84EE",
                "GL_TEXTURE_COMPRESSION_HINT_ARB", "0x84EF",
                "GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB", "0x86A0",
                "GL_TEXTURE_COMPRESSED_ARB", "0x86A1",
                "GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB", "0x86A2",
                "GL_COMPRESSED_TEXTURE_FORMATS_ARB", "0x86A3"
            ), functions(
            func("glCompressedTexImage3DARB", Type.Void, i("target"), i("level"), i("internalFormat"), i("width"), i("height"), i("depth"), i("border"), i("imageSize"), p("data")),
            func("glCompressedTexImage2DARB", Type.Void, i("target"), i("level"), i("internalFormat"), i("width"), i("height"), i("border"), i("imageSize"), p("data")),
            func("glCompressedTexImage1DARB", Type.Void, i("target"), i("level"), i("internalFormat"), i("width"), i("border"), i("imageSize"), p("data")),
            func("glCompressedTexSubImage3DARB", Type.Void, i("target"), i("level"), i("xoffset"), i("yoffset"), i("zoffset"), i("width"), i("height"), i("depth"), i("format"), i("imageSize"), p("data")),
            func("glCompressedTexSubImage2DARB", Type.Void, i("target"), i("level"), i("xoffset"), i("yoffset"), i("width"), i("height"), i("format"), i("imageSize"), p("data")),
            func("glCompressedTexSubImage1DARB", Type.Void, i("target"), i("level"), i("xoffset"), i("width"), i("format"), i("imageSize"), p("data")),
            func("glGetCompressedTexImageARB", Type.Void, i("target"), i("level"), p("img"))
        )));
        generateFile("GLARBTextureCompressionBptc", "GL_ARB_texture_compression_bptc",
            "GL_COMPRESSED_RGBA_BPTC_UNORM_ARB", "0x8E8C",
            "GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB", "0x8E8D",
            "GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB", "0x8E8E",
            "GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB", "0x8E8F"
        );
        generateFile("GLARBTextureCubeMap", "GL_ARB_texture_cube_map",
            "GL_NORMAL_MAP_ARB", "0x8511",
            "GL_REFLECTION_MAP_ARB", "0x8512",
            "GL_TEXTURE_CUBE_MAP_ARB", "0x8513",
            "GL_TEXTURE_BINDING_CUBE_MAP_ARB", "0x8514",
            "GL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB", "0x8515",
            "GL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB", "0x8516",
            "GL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB", "0x8517",
            "GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB", "0x8518",
            "GL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB", "0x8519",
            "GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB", "0x851A",
            "GL_PROXY_TEXTURE_CUBE_MAP_ARB", "0x851B",
            "GL_MAX_CUBE_MAP_TEXTURE_SIZE_ARB", "0x851C"
        );
        generateFile("GLARBTextureCubeMapArray", "GL_ARB_texture_cube_map_array",
            "GL_TEXTURE_CUBE_MAP_ARRAY_ARB", "0x9009",
            "GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB", "0x900A",
            "GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB", "0x900B",
            "GL_SAMPLER_CUBE_MAP_ARRAY_ARB", "0x900C",
            "GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB", "0x900D",
            "GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB", "0x900E",
            "GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB", "0x900F"
        );
        generateFile("GLARBTextureEnvCombine", "GL_ARB_texture_env_combine",
            "GL_COMBINE_ARB", "0x8570",
            "GL_COMBINE_RGB_ARB", "0x8571",
            "GL_COMBINE_ALPHA_ARB", "0x8572",
            "GL_SOURCE0_RGB_ARB", "0x8580",
            "GL_SOURCE1_RGB_ARB", "0x8581",
            "GL_SOURCE2_RGB_ARB", "0x8582",
            "GL_SOURCE0_ALPHA_ARB", "0x8588",
            "GL_SOURCE1_ALPHA_ARB", "0x8589",
            "GL_SOURCE2_ALPHA_ARB", "0x858A",
            "GL_OPERAND0_RGB_ARB", "0x8590",
            "GL_OPERAND1_RGB_ARB", "0x8591",
            "GL_OPERAND2_RGB_ARB", "0x8592",
            "GL_OPERAND0_ALPHA_ARB", "0x8598",
            "GL_OPERAND1_ALPHA_ARB", "0x8599",
            "GL_OPERAND2_ALPHA_ARB", "0x859A",
            "GL_RGB_SCALE_ARB", "0x8573",
            "GL_ADD_SIGNED_ARB", "0x8574",
            "GL_INTERPOLATE_ARB", "0x8575",
            "GL_SUBTRACT_ARB", "0x84E7",
            "GL_CONSTANT_ARB", "0x8576",
            "GL_PRIMARY_COLOR_ARB", "0x8577",
            "GL_PREVIOUS_ARB", "0x8578"
        );
        generateFile("GLARBTextureEnvDot3", "GL_ARB_texture_env_dot3",
            "GL_DOT3_RGB_ARB", "0x86AE",
            "GL_DOT3_RGBA_ARB", "0x86AF"
        );
        generateFile("GLARBTextureFilterMinmax", "GL_ARB_texture_filter_minmax",
            "GL_TEXTURE_REDUCTION_MODE_ARB", "0x9366",
            "GL_WEIGHTED_AVERAGE_ARB", "0x9367"
        );
        generateFile("GLARBTextureFloat", "GL_ARB_texture_float",
            "GL_TEXTURE_RED_TYPE_ARB", "0x8C10",
            "GL_TEXTURE_GREEN_TYPE_ARB", "0x8C11",
            "GL_TEXTURE_BLUE_TYPE_ARB", "0x8C12",
            "GL_TEXTURE_ALPHA_TYPE_ARB", "0x8C13",
            "GL_TEXTURE_LUMINANCE_TYPE_ARB", "0x8C14",
            "GL_TEXTURE_INTENSITY_TYPE_ARB", "0x8C15",
            "GL_TEXTURE_DEPTH_TYPE_ARB", "0x8C16",
            "GL_UNSIGNED_NORMALIZED_ARB", "0x8C17",
            "GL_RGBA32F_ARB", "0x8814",
            "GL_RGB32F_ARB", "0x8815",
            "GL_ALPHA32F_ARB", "0x8816",
            "GL_INTENSITY32F_ARB", "0x8817",
            "GL_LUMINANCE32F_ARB", "0x8818",
            "GL_LUMINANCE_ALPHA32F_ARB", "0x8819",
            "GL_RGBA16F_ARB", "0x881A",
            "GL_RGB16F_ARB", "0x881B",
            "GL_ALPHA16F_ARB", "0x881C",
            "GL_INTENSITY16F_ARB", "0x881D",
            "GL_LUMINANCE16F_ARB", "0x881E",
            "GL_LUMINANCE_ALPHA16F_ARB", "0x881F"
        );
        generateFile("GLARBTextureGather", "GL_ARB_texture_gather", """
            GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB 0x8E5E
            GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB 0x8E5F
            GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB 0x8F9F""");
        generateFile("GLARBTextureMirroredRepeat", "GL_ARB_texture_mirrored_repeat",
            "GL_MIRRORED_REPEAT_ARB", "0x8370");
        generateFile("GLARBTextureRectangle", "GL_ARB_texture_rectangle", """
            GL_TEXTURE_RECTANGLE_ARB          0x84F5
            GL_TEXTURE_BINDING_RECTANGLE_ARB  0x84F6
            GL_PROXY_TEXTURE_RECTANGLE_ARB    0x84F7
            GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB 0x84F8""");
        generateFile("GLARBTransformFeedbackOverflowQuery", "GL_ARB_transform_feedback_overflow_query", """
            GL_TRANSFORM_FEEDBACK_OVERFLOW_ARB 0x82EC
            GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB 0x82ED""");
        generateFile("GLARBTransposeMatrix", new GLExtension("GL_ARB_transpose_matrix",
            constants("""
                GL_TRANSPOSE_MODELVIEW_MATRIX_ARB 0x84E3
                GL_TRANSPOSE_PROJECTION_MATRIX_ARB 0x84E4
                GL_TRANSPOSE_TEXTURE_MATRIX_ARB   0x84E5
                GL_TRANSPOSE_COLOR_MATRIX_ARB     0x84E6"""), functions(
            func("glLoadTransposeMatrixfARB", Type.Void, p("m")),
            func("glLoadTransposeMatrixdARB", Type.Void, p("m")),
            func("glMultTransposeMatrixfARB", Type.Void, p("m")),
            func("glMultTransposeMatrixdARB", Type.Void, p("m"))
        )));
    }

    private static void generateFile(String filename, String extName, String constantsTable) throws IOException {
        generateFile(filename, new GLExtension(extName, constants(constantsTable), null));
    }

    private static void generateFile(String filename, String extName, String... constants) throws IOException {
        generateFile(filename, new GLExtension(extName, constants(constants), null));
    }

    private static void generateFile(String filename, GLExtension extension) throws IOException {
        final StringBuilder sb = new StringBuilder(2048);
        final boolean isArb = filename.startsWith("GLARB");
        // file-header
        sb.append("""
            // this file is auto-generated. DO NOT EDIT!
            package overrungl.opengl.ext""");
        if (isArb) {
            sb.append(".arb");
        }
        sb.append(";").append("""


            import overrungl.*;
            import overrungl.opengl.*;
            import java.lang.foreign.MemorySegment;
            import static overrungl.FunctionDescriptors.*;

            /**
             *""").append(" {@code ").append(extension.name()).append("""
            }
             */
            public final class\s""").append(filename).append(" {");
        // constants
        for (var e : extension.constants().entrySet()) {
            sb.append("\n    public static final int ").append(e.getKey()).append(" = ").append(e.getValue()).append(';');
        }
        // load functions
        final GLExtFunc[] functions = extension.functions();
        if (functions != null) {
            sb.append("""
                \n
                    public static void load(GLExtCaps ext, GLLoadFunc load) {
                        if (!ext.""").append(extension.name()).append(") return;");
            for (GLExtFunc(String name, Type returnType, FuncParam[] params) : functions) {
                sb.append("\n        ext.").append(name).append(" = load.invoke(\"").append(name).append("\", ");
                for (FuncParam param : params) {
                    sb.append(param.type().shortStr());
                }
                sb.append(returnType.shortStr());
                sb.append(");");
            }
            sb.append("\n    }\n");
            // declare methods
            for (GLExtFunc(String name, Type returnType, FuncParam[] params) : functions) {
                sb.append("\n    public static ").append(returnType.name()).append(' ').append(name).append("(");
                // parameters
                int i = 0;
                for (FuncParam(Type type, String paramName) : params) {
                    if (i > 0) sb.append(", ");
                    sb.append(type.name()).append(' ').append(paramName);
                    i++;
                }
                // method body
                sb.append("""
                    ) {
                            final var ext = GLLoader.getExtCapabilities();
                            try {
                               \s""");
                if (!returnType.equals(Type.Void)) {
                    sb.append("return (").append(returnType.name()).append(") ");
                }
                // invoke function
                sb.append("GLLoader.check(ext.").append(name).append(").invokeExact(");
                i = 0;
                for (FuncParam param : params) {
                    if (i > 0) sb.append(", ");
                    sb.append(param.name());
                    i++;
                }
                sb.append("""
                    );
                            } catch (Throwable e) {
                                throw new AssertionError("should not reach here", e);
                            }
                        }""");
            }
        }
        // eof
        sb.append("\n}\n");
        String prefix;
        if (isArb) {
            prefix = "arb/";
        } else {
            prefix = "";
        }
        Files.writeString(Path.of(STR."ext/\{prefix}\{filename}.java"), sb);
    }
}
