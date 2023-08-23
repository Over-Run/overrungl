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

import overrungl.opengl.OpenGLExt.*
import java.nio.file.Files
import kotlin.io.path.Path

enum class OpenGLExt(val dir: String, val packageName: String, val extName: String) {
    CORE("", "", ""),
    ARB("ext/arb", ".ext.arb", "ARB"),
    KHR("ext/khr", ".ext.khr", "KHR")
}

data class Type(val name: String, val layout: String?) {
    operator fun invoke(name: String, nativeType: String? = null): Parameter = Parameter(this, name, nativeType)
    override fun toString(): String = name
}

val void = Type("void", null)
val boolean = Type("boolean", "JAVA_BYTE")
val byte = Type("byte", "JAVA_BYTE")
val short = Type("short", "JAVA_SHORT")
val int = Type("int", "JAVA_INT")
val long = Type("long", "JAVA_LONG")
val float = Type("float", "JAVA_FLOAT")
val double = Type("double", "JAVA_DOUBLE")
val address = Type("MemorySegment", "ADDRESS")
val GLboolean = boolean
val GLbyte = byte
val GLubyte = byte
val GLshort = short
val GLushort = short
val GLint = int
val GLuint = int
val GLenum = int
val GLsizei = int
val GLfloat = float
val GLdouble = double

val GLsizeiptrARB = long
val GLintptrARB = long
val GLhandleARB = int // Don't know how to handle on APPLE
val GLcharARB = byte

data class Parameter(
    val type: Type,
    val name: String,
    val nativeType: String?
)

data class Function(
    val name: String,
    val returnType: Type = void,
    val nativeType: String?,
    val params: List<Parameter>
)

class OpenGLFile(
    private val name: String,
    private val ext: OpenGLExt = CORE,
    private val extName: String = "EXT"
) {
    private val constants = LinkedHashMap<String, String>()
    private val functions = ArrayList<Function>()

    operator fun String.invoke(value: String) {
        constants[this] = value
    }

    operator fun String.invoke(returnType: Type, vararg params: Parameter, nativeType: String?=null) {
        functions.add(Function(this, returnType, nativeType, params.toList()))
    }

    internal fun generate() {
        Files.writeString(Path("${ext.dir}/GL${ext.extName}$name.java"), buildString {
            // file-header
            appendLine(
                """
                // this file is auto-generated. DO NOT EDIT!
                package overrungl.opengl${ext.packageName};

                import overrungl.*;
                import overrungl.opengl.*;
                import java.lang.foreign.*;
                import static java.lang.foreign.FunctionDescriptor.of;
                import static java.lang.foreign.FunctionDescriptor.ofVoid;
                import static java.lang.foreign.ValueLayout.*;
                import static overrungl.opengl.GLLoader.*;

                /**
                  * {@code $extName}
                  */
                public final class GL${ext.extName}$name {
            """.trimIndent()
            )
            // constants
            constants.forEach { (name, value) ->
                appendLine("    public static final int $name = $value;")
            }
            if (functions.isNotEmpty()) {
                appendLine()
                // loader
                appendLine("    public static void load(GLExtCaps ext, GLLoadFunc load) {")
                appendLine("        if (!ext.$extName) return;")
                functions.forEach { f ->
                    append("        ext.${f.name} = load.invoke(\"${f.name}\", ${if (f.returnType == void) "ofVoid" else "of"}(")
                    if (f.returnType != void)
                        append(f.returnType.layout)
                    f.params.forEachIndexed { index, it ->
                        if (index != 0 || f.returnType != void) append(", ")
                        append(it.type.layout)
                    }
                    appendLine("));")
                }
                appendLine("    }")
                appendLine()
                // functions
                functions.forEach { f ->
                    append("    public static ")
                    if (f.nativeType!=null)
                        append("@NativeType(\"${f.nativeType}\") ")
                    append("${f.returnType} ${f.name}(")
                    f.params.forEachIndexed { index, it ->
                        if (index != 0) append(", ")
                        if (it.nativeType != null)
                            append("@NativeType(\"${it.nativeType}\") ")
                        append("${it.type} ${it.name}")
                    }
                    appendLine(") {")
                    appendLine("        final var ext = getExtCapabilities();")
                    appendLine("        try {")
                    if (f.returnType != void)
                        appendLine("            return (${f.returnType})")
                    append("            check(ext.${f.name}).invokeExact(")
                    f.params.forEachIndexed { index, it ->
                        if (index != 0) append(", ")
                        append(it.name)
                    }
                    appendLine(
                        """);
                    |        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
                    |    }
                """.trimMargin()
                    )
                    appendLine()
                }
            }
            appendLine("}")
        })
    }
}

fun file(
    name: String,
    ext: OpenGLExt = CORE,
    extName: String = "EXT",
    block: OpenGLFile.() -> Unit
) {
    OpenGLFile(name, ext, extName).also(block).generate()
}

fun file(
    name: String,
    ext: OpenGLExt = CORE,
    extName: String = "EXT",
    vararg const: Pair<String, String>
) {
    file(name, ext, extName) {
        const.forEach { (name, value) -> name(value) }
    }
}

fun arb() {
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
        "glFramebufferSampleLocationsfvARB"(void, int("target"), int("start"), int("count"), address("v", "const GLfloat *v"))
        "glNamedFramebufferSampleLocationsfvARB"(void, int("framebuffer"), int("start"), int("count"), address("v", "const GLfloat *v"))
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
        "glShaderSourceARB"(void, int("shaderObj"), int("count"), address("string", "const GLcharARB**"), address("length", "const GLint*"))
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
        "glUniformMatrix2fvARB"(void, int("location"), int("count"), boolean("transpose"), address("value", "const GLfloat*"))
        "glUniformMatrix3fvARB"(void, int("location"), int("count"), boolean("transpose"), address("value", "const GLfloat*"))
        "glUniformMatrix4fvARB"(void, int("location"), int("count"), boolean("transpose"), address("value", "const GLfloat*"))
        "glGetObjectParameterfvARB"(void, int("obj"), int("pname"), address("params", "GLfloat*"))
        "glGetObjectParameterivARB"(void, int("obj"), int("pname"), address("params", "GLint*"))
        "glGetInfoLogARB"(void, int("obj"), int("maxLength"), address("length", "GLsizei*"), address("infoLog", "GLcharARB*"))
        "glGetAttachedObjectsARB"(void, int("containerObj"), int("maxCount"), address("count", "GLsizei*"), address("obj", "GLhandleARB*"))
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
        "glGetShaderSourceARB"(void, int("obj"), int("maxLength"), address("length", "GLsizei*"), address("source", "GLcharARB*"))
    }
    file("ShadingLanguageInclude", ARB, "GL_ARB_shading_language_include") {
        "GL_SHADER_INCLUDE_ARB"("0x8DAE")
        "GL_NAMED_STRING_LENGTH_ARB"("0x8DE9")
        "GL_NAMED_STRING_TYPE_ARB"("0x8DEA")
        "glNamedStringARB"(void, int("type"), int("nameLen"), address("name", "const GLchar*"), int("stringLen"), address("string", "const GLchar*"))
        "glDeleteNamedStringARB"(void, int("nameLen"), address("name", "const GLchar*"))
        "glCompileShaderIncludeARB"(void, int("shader"), int("count"), address("path", "const GLchar *const*"), address("length", "const GLint*"))
        "glIsNamedStringARB"(boolean, int("nameLen"), address("name", "const GLchar*"))
        "glGetNamedStringARB"(
            void,
            int("nameLen"),
            address("name", "const GLchar*"),
            int("bufSize"),
            address("stringLen", "GLint*"),
            address("string", "GLchar*")
        )
        "glGetNamedStringivARB"(void, int("nameLen"), address("name", "const GLchar*"), int("pname"), address("params", "GLint*"))
    }
    file("Shadow", ARB, "GL_ARB_shadow") {
        "GL_TEXTURE_COMPARE_MODE_ARB"("0x884C")
        "GL_TEXTURE_COMPARE_FUNC_ARB"("0x884D")
        "GL_COMPARE_R_TO_TEXTURE_ARB"("0x884E")
    }
    file("ShadowAmbient", ARB, "GL_ARB_shadow_ambient") {
        "GL_TEXTURE_COMPARE_FAIL_VALUE_ARB"("0x80BF")
    }
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
    file("TextureBorderClamp", ARB, "GL_ARB_texture_border_clamp") {
        "GL_CLAMP_TO_BORDER_ARB"("0x812D")
    }
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
    file("TextureCompressionBptc", ARB, "GL_ARB_texture_compression_bptc") {
        "GL_COMPRESSED_RGBA_BPTC_UNORM_ARB"("0x8E8C")
        "GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB"("0x8E8D")
        "GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB"("0x8E8E")
        "GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB"("0x8E8F")
    }
    file("TextureCubeMap", ARB, "GL_ARB_texture_cube_map") {
        "GL_NORMAL_MAP_ARB"("0x8511")
        "GL_REFLECTION_MAP_ARB"("0x8512")
        "GL_TEXTURE_CUBE_MAP_ARB"("0x8513")
        "GL_TEXTURE_BINDING_CUBE_MAP_ARB"("0x8514")
        "GL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB"("0x8515")
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB"("0x8516")
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB"("0x8517")
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB"("0x8518")
        "GL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB"("0x8519")
        "GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB"("0x851A")
        "GL_PROXY_TEXTURE_CUBE_MAP_ARB"("0x851B")
        "GL_MAX_CUBE_MAP_TEXTURE_SIZE_ARB"("0x851C")
    }
    file("TextureCubeMapArray", ARB, "GL_ARB_texture_cube_map_array") {
        "GL_TEXTURE_CUBE_MAP_ARRAY_ARB"("0x9009")
        "GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB"("0x900A")
        "GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB"("0x900B")
        "GL_SAMPLER_CUBE_MAP_ARRAY_ARB"("0x900C")
        "GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB"("0x900D")
        "GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB"("0x900E")
        "GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB"("0x900F")
    }
    file("TextureEnvCombine", ARB, "GL_ARB_texture_env_combine") {
        "GL_COMBINE_ARB"("0x8570")
        "GL_COMBINE_RGB_ARB"("0x8571")
        "GL_COMBINE_ALPHA_ARB"("0x8572")
        "GL_SOURCE0_RGB_ARB"("0x8580")
        "GL_SOURCE1_RGB_ARB"("0x8581")
        "GL_SOURCE2_RGB_ARB"("0x8582")
        "GL_SOURCE0_ALPHA_ARB"("0x8588")
        "GL_SOURCE1_ALPHA_ARB"("0x8589")
        "GL_SOURCE2_ALPHA_ARB"("0x858A")
        "GL_OPERAND0_RGB_ARB"("0x8590")
        "GL_OPERAND1_RGB_ARB"("0x8591")
        "GL_OPERAND2_RGB_ARB"("0x8592")
        "GL_OPERAND0_ALPHA_ARB"("0x8598")
        "GL_OPERAND1_ALPHA_ARB"("0x8599")
        "GL_OPERAND2_ALPHA_ARB"("0x859A")
        "GL_RGB_SCALE_ARB"("0x8573")
        "GL_ADD_SIGNED_ARB"("0x8574")
        "GL_INTERPOLATE_ARB"("0x8575")
        "GL_SUBTRACT_ARB"("0x84E7")
        "GL_CONSTANT_ARB"("0x8576")
        "GL_PRIMARY_COLOR_ARB"("0x8577")
        "GL_PREVIOUS_ARB"("0x8578")
    }
    file("TextureEnvDot3", ARB, "GL_ARB_texture_env_dot3") {
        "GL_DOT3_RGB_ARB"("0x86AE")
        "GL_DOT3_RGBA_ARB"("0x86AF")
    }
    file("TextureFilterMinmax", ARB, "GL_ARB_texture_filter_minmax") {
        "GL_TEXTURE_REDUCTION_MODE_ARB"("0x9366")
        "GL_WEIGHTED_AVERAGE_ARB"("0x9367")
    }
    file("TextureFloat", ARB, "GL_ARB_texture_float") {
        "GL_TEXTURE_RED_TYPE_ARB"("0x8C10")
        "GL_TEXTURE_GREEN_TYPE_ARB"("0x8C11")
        "GL_TEXTURE_BLUE_TYPE_ARB"("0x8C12")
        "GL_TEXTURE_ALPHA_TYPE_ARB"("0x8C13")
        "GL_TEXTURE_LUMINANCE_TYPE_ARB"("0x8C14")
        "GL_TEXTURE_INTENSITY_TYPE_ARB"("0x8C15")
        "GL_TEXTURE_DEPTH_TYPE_ARB"("0x8C16")
        "GL_UNSIGNED_NORMALIZED_ARB"("0x8C17")
        "GL_RGBA32F_ARB"("0x8814")
        "GL_RGB32F_ARB"("0x8815")
        "GL_ALPHA32F_ARB"("0x8816")
        "GL_INTENSITY32F_ARB"("0x8817")
        "GL_LUMINANCE32F_ARB"("0x8818")
        "GL_LUMINANCE_ALPHA32F_ARB"("0x8819")
        "GL_RGBA16F_ARB"("0x881A")
        "GL_RGB16F_ARB"("0x881B")
        "GL_ALPHA16F_ARB"("0x881C")
        "GL_INTENSITY16F_ARB"("0x881D")
        "GL_LUMINANCE16F_ARB"("0x881E")
        "GL_LUMINANCE_ALPHA16F_ARB"("0x881F")
    }
    file("TextureGather", ARB, "GL_ARB_texture_gather") {
        "GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB"("0x8E5E")
        "GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB"("0x8E5F")
        "GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB"("0x8F9F")
    }
    file("TextureMirroredRepeat", ARB, "GL_ARB_texture_mirrored_repeat") {
        "GL_MIRRORED_REPEAT_ARB"("0x8370")
    }
    file("TextureRectangle", ARB, "GL_ARB_texture_rectangle") {
        "GL_TEXTURE_RECTANGLE_ARB"("0x84F5")
        "GL_TEXTURE_BINDING_RECTANGLE_ARB"("0x84F6")
        "GL_PROXY_TEXTURE_RECTANGLE_ARB"("0x84F7")
        "GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB"("0x84F8")
    }
    file("TransformFeedbackOverflowQuery", ARB, "GL_ARB_transform_feedback_overflow_query") {
        "GL_TRANSFORM_FEEDBACK_OVERFLOW_ARB"("0x82EC")
        "GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB"("0x82ED")
    }
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

fun khr() {
    file("BlendEquationAdvanced", KHR, "GL_KHR_blend_equation_advanced") {
        "GL_MULTIPLY_KHR"("0x9294")
        "GL_SCREEN_KHR"("0x9295")
        "GL_OVERLAY_KHR"("0x9296")
        "GL_DARKEN_KHR"("0x9297")
        "GL_LIGHTEN_KHR"("0x9298")
        "GL_COLORDODGE_KHR"("0x9299")
        "GL_COLORBURN_KHR"("0x929A")
        "GL_HARDLIGHT_KHR"("0x929B")
        "GL_SOFTLIGHT_KHR"("0x929C")
        "GL_DIFFERENCE_KHR"("0x929E")
        "GL_EXCLUSION_KHR"("0x92A0")
        "GL_HSL_HUE_KHR"("0x92AD")
        "GL_HSL_SATURATION_KHR"("0x92AE")
        "GL_HSL_COLOR_KHR"("0x92AF")
        "GL_HSL_LUMINOSITY_KHR"("0x92B0")
        "glBlendBarrierKHR"(void)
    }
    file("BlendEquationAdvancedCoherent", KHR, "GL_KHR_blend_equation_advanced_coherent") {
        "GL_BLEND_ADVANCED_COHERENT_KHR"("0x9285")
    }
    file("NoError", KHR, "GL_KHR_no_error") {
        "GL_CONTEXT_FLAG_NO_ERROR_BIT_KHR"("0x00000008")
    }
    file("ParallelShaderCompile", KHR, "GL_KHR_parallel_shader_compile") {
        "GL_MAX_SHADER_COMPILER_THREADS_KHR"("0x91B0")
        "GL_COMPLETION_STATUS_KHR"("0x91B1")
        "glMaxShaderCompilerThreadsKHR"(void, GLuint("count"))
    }
    file("Robustness", KHR, "GL_KHR_robustness") {
        "GL_CONTEXT_ROBUST_ACCESS"("0x90F3")
    }
    file("ShaderSubgroup", KHR, "GL_KHR_shader_subgroup") {
        "GL_SUBGROUP_SIZE_KHR"("0x9532")
        "GL_SUBGROUP_SUPPORTED_STAGES_KHR"("0x9533")
        "GL_SUBGROUP_SUPPORTED_FEATURES_KHR"("0x9534")
        "GL_SUBGROUP_QUAD_ALL_STAGES_KHR"("0x9535")
        "GL_SUBGROUP_FEATURE_BASIC_BIT_KHR"("0x00000001")
        "GL_SUBGROUP_FEATURE_VOTE_BIT_KHR"("0x00000002")
        "GL_SUBGROUP_FEATURE_ARITHMETIC_BIT_KHR"("0x00000004")
        "GL_SUBGROUP_FEATURE_BALLOT_BIT_KHR"("0x00000008")
        "GL_SUBGROUP_FEATURE_SHUFFLE_BIT_KHR"("0x00000010")
        "GL_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT_KHR"("0x00000020")
        "GL_SUBGROUP_FEATURE_CLUSTERED_BIT_KHR"("0x00000040")
        "GL_SUBGROUP_FEATURE_QUAD_BIT_KHR"("0x00000080")
    }
    file("TextureCompressionAstcHdr", KHR, "GL_KHR_texture_compression_astc_hdr") {
        "GL_COMPRESSED_RGBA_ASTC_4x4_KHR"("0x93B0")
        "GL_COMPRESSED_RGBA_ASTC_5x4_KHR"("0x93B1")
        "GL_COMPRESSED_RGBA_ASTC_5x5_KHR"("0x93B2")
        "GL_COMPRESSED_RGBA_ASTC_6x5_KHR"("0x93B3")
        "GL_COMPRESSED_RGBA_ASTC_6x6_KHR"("0x93B4")
        "GL_COMPRESSED_RGBA_ASTC_8x5_KHR"("0x93B5")
        "GL_COMPRESSED_RGBA_ASTC_8x6_KHR"("0x93B6")
        "GL_COMPRESSED_RGBA_ASTC_8x8_KHR"("0x93B7")
        "GL_COMPRESSED_RGBA_ASTC_10x5_KHR"("0x93B8")
        "GL_COMPRESSED_RGBA_ASTC_10x6_KHR"("0x93B9")
        "GL_COMPRESSED_RGBA_ASTC_10x8_KHR"("0x93BA")
        "GL_COMPRESSED_RGBA_ASTC_10x10_KHR"("0x93BB")
        "GL_COMPRESSED_RGBA_ASTC_12x10_KHR"("0x93BC")
        "GL_COMPRESSED_RGBA_ASTC_12x12_KHR"("0x93BD")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR"("0x93D0")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR"("0x93D1")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR"("0x93D2")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR"("0x93D3")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR"("0x93D4")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR"("0x93D5")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR"("0x93D6")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR"("0x93D7")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR"("0x93D8")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR"("0x93D9")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR"("0x93DA")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR"("0x93DB")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR"("0x93DC")
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR"("0x93DD")
    }
}

/**
 * @author squid233
 * @since 0.1.0
 */
fun main() {
    arb()
    khr()
}
