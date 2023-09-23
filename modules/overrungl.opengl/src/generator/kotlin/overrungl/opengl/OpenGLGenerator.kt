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
import java.time.Clock
import java.time.LocalDate
import kotlin.io.path.Path

enum class OpenGLExt(val dir: String, val packageName: String, val extName: String) {
    CORE("", "", ""),
    ARB("ext/arb/", ".ext.arb", "ARB"),
    KHR("ext/khr/", ".ext.khr", "KHR"),
    OES("ext/oes/", ".ext.oes", "OES"),
    `3DFX`("ext/", ".ext", "3DFX"),
    AMD("ext/amd/", ".ext.amd", "AMD"),
    APPLE("ext/apple/", ".ext.apple", "APPLE"),
    ATI("ext/ati/", ".ext.ati", "ATI"),
    EXT("ext/ext/", ".ext.ext", "EXT"),
    GREMEDY("ext/", ".ext", "GREMEDY"),
    HP("ext/", ".ext", "HP"),
    IBM("ext/ibm/", ".ext.ibm", "IBM"),
    INGR("ext/", ".ext", "INGR"),
    INTEL("ext/intel/", ".ext.intel", "INTEL"),
    MESAX("ext/mesa/", ".ext.mesa", "MESAX"),
    MESA("ext/mesa/", ".ext.mesa", "MESA"),
    NVX("ext/nv/", ".ext.nv", "NVX"),
    NV("ext/nv/", ".ext.nv", "NV"),
    OML("ext/", ".ext", "OML"),
    OVR("ext/", ".ext", "OVR"),
    PGI("ext/", ".ext", "PGI"),
    REND("ext/", ".ext", "REND"),
    S3("ext/", ".ext", "S3"),
    SGIS("ext/sgi/", ".ext.sgi", "SGIS"),
    SGIX("ext/sgi/", ".ext.sgi", "SGIX"),
    SGI("ext/sgi/", ".ext.sgi", "SGI"),
    SUNX("ext/sun/", ".ext.sun", "SUNX"),
    SUN("ext/sun/", ".ext.sun", "SUN"),
    WIN("ext/", ".ext", "WIN")
}

data class Type(val name: String, val layout: String?) {
    operator fun invoke(name: String, nativeType: String? = null): Parameter = Parameter(this, name, nativeType)
    override fun toString(): String = name
}

val fileHeader = """/*
 * MIT License
 *
 * Copyright (c) 2022-${LocalDate.now(Clock.systemUTC()).year} Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!"""

private val generatedFunctions = ArrayList<Function>()
private val generatedExtFunctions = ArrayList<Function>()
private val generatedClasses = ArrayList<OpenGLFile>()
private val generatedExtClasses = ArrayList<OpenGLFile>()

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
    val params: List<Parameter>,
    val content: String? = null
) {
    private val _overloads = ArrayList<Function>()
    val overloads: List<Function>
        get() = _overloads

    operator fun String.invoke(returnType: Type, content: String, vararg params: Parameter, nativeType: String? = null) {
        _overloads.add(Function(this, returnType, nativeType, params.toList(), content))
    }
}

class OpenGLFile(
    val name: String,
    val ext: OpenGLExt,
    private val extName: String
) {
    private val constants = LinkedHashMap<String, String>()
    private val functions = ArrayList<Function>()

    operator fun String.invoke(value: String) {
        constants[this] = value
    }

    operator fun String.invoke(returnType: Type, vararg params: Parameter, nativeType: String? = null) {
        Function(this, returnType, nativeType, params.toList()).also {
            functions.add(it)
            when (ext) {
                CORE -> generatedFunctions.add(it)
                else -> generatedExtFunctions.add(it)
            }
        }
    }

    internal fun generate() {
        Files.writeString(Path("${ext.dir}GL${ext.extName}$name.java"), buildString {
            // file-header
            appendLine(
                """
                $fileHeader
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
                fun appendFuncHeader(f: Function) {
                    append("    public static ")
                    if (f.nativeType != null)
                        append("@NativeType(\"${f.nativeType}\") ")
                    append("${f.returnType} ${f.name}(")
                    f.params.forEachIndexed { index, it ->
                        if (index != 0) append(", ")
                        if (it.nativeType != null)
                            append("@NativeType(\"${it.nativeType}\") ")
                        append("${it.type} ${it.name}")
                    }
                    appendLine(") {")
                }
                functions.forEach { f ->
                    appendFuncHeader(f)
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

                    // overloads
                    if (f.overloads.isNotEmpty()) {
                        f.overloads.forEach { overload ->
                            appendFuncHeader(overload)
                            appendLine(overload.content!!.prependIndent("        "))
                            appendLine("    }\n")
                        }
                    }
                }
            }
            appendLine("}")
        })
    }
}

fun file(
    name: String,
    ext: OpenGLExt = CORE,
    extName: String = "GL",
    block: OpenGLFile.() -> Unit
) {
    OpenGLFile(name, ext, extName).also {
        block(it)
        when (ext) {
            CORE -> generatedClasses.add(it)
            else -> generatedExtClasses.add(it)
        }
    }.generate()
}

fun file(
    name: String,
    ext: OpenGLExt = CORE,
    extName: String = "GL",
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
    file(
        "BlendEquationAdvancedCoherent", KHR, "GL_KHR_blend_equation_advanced_coherent",
        "GL_BLEND_ADVANCED_COHERENT_KHR" to "0x9285"
    )
    file(
        "NoError", KHR, "GL_KHR_no_error",
        "GL_CONTEXT_FLAG_NO_ERROR_BIT_KHR" to "0x00000008"
    )
    file("ParallelShaderCompile", KHR, "GL_KHR_parallel_shader_compile") {
        "GL_MAX_SHADER_COMPILER_THREADS_KHR"("0x91B0")
        "GL_COMPLETION_STATUS_KHR"("0x91B1")
        "glMaxShaderCompilerThreadsKHR"(void, GLuint("count"))
    }
    file(
        "Robustness", KHR, "GL_KHR_robustness",
        "GL_CONTEXT_ROBUST_ACCESS" to "0x90F3"
    )
    file(
        "ShaderSubgroup", KHR, "GL_KHR_shader_subgroup",
        "GL_SUBGROUP_SIZE_KHR" to "0x9532",
        "GL_SUBGROUP_SUPPORTED_STAGES_KHR" to "0x9533",
        "GL_SUBGROUP_SUPPORTED_FEATURES_KHR" to "0x9534",
        "GL_SUBGROUP_QUAD_ALL_STAGES_KHR" to "0x9535",
        "GL_SUBGROUP_FEATURE_BASIC_BIT_KHR" to "0x00000001",
        "GL_SUBGROUP_FEATURE_VOTE_BIT_KHR" to "0x00000002",
        "GL_SUBGROUP_FEATURE_ARITHMETIC_BIT_KHR" to "0x00000004",
        "GL_SUBGROUP_FEATURE_BALLOT_BIT_KHR" to "0x00000008",
        "GL_SUBGROUP_FEATURE_SHUFFLE_BIT_KHR" to "0x00000010",
        "GL_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT_KHR" to "0x00000020",
        "GL_SUBGROUP_FEATURE_CLUSTERED_BIT_KHR" to "0x00000040",
        "GL_SUBGROUP_FEATURE_QUAD_BIT_KHR" to "0x00000080"
    )
    file(
        "TextureCompressionAstcHdr", KHR, "GL_KHR_texture_compression_astc_hdr",
        "GL_COMPRESSED_RGBA_ASTC_4x4_KHR" to "0x93B0",
        "GL_COMPRESSED_RGBA_ASTC_5x4_KHR" to "0x93B1",
        "GL_COMPRESSED_RGBA_ASTC_5x5_KHR" to "0x93B2",
        "GL_COMPRESSED_RGBA_ASTC_6x5_KHR" to "0x93B3",
        "GL_COMPRESSED_RGBA_ASTC_6x6_KHR" to "0x93B4",
        "GL_COMPRESSED_RGBA_ASTC_8x5_KHR" to "0x93B5",
        "GL_COMPRESSED_RGBA_ASTC_8x6_KHR" to "0x93B6",
        "GL_COMPRESSED_RGBA_ASTC_8x8_KHR" to "0x93B7",
        "GL_COMPRESSED_RGBA_ASTC_10x5_KHR" to "0x93B8",
        "GL_COMPRESSED_RGBA_ASTC_10x6_KHR" to "0x93B9",
        "GL_COMPRESSED_RGBA_ASTC_10x8_KHR" to "0x93BA",
        "GL_COMPRESSED_RGBA_ASTC_10x10_KHR" to "0x93BB",
        "GL_COMPRESSED_RGBA_ASTC_12x10_KHR" to "0x93BC",
        "GL_COMPRESSED_RGBA_ASTC_12x12_KHR" to "0x93BD",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR" to "0x93D0",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR" to "0x93D1",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR" to "0x93D2",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR" to "0x93D3",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR" to "0x93D4",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR" to "0x93D5",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR" to "0x93D6",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR" to "0x93D7",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR" to "0x93D8",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR" to "0x93D9",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR" to "0x93DA",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR" to "0x93DB",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR" to "0x93DC",
        "GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR" to "0x93DD"
    )
}

fun oes() {
}

fun `3dfx`() {
    file(
        "Multisample", `3DFX`, "GL_3DFX_multisample",
        "GL_MULTISAMPLE_3DFX" to "0x86B2",
        "GL_SAMPLE_BUFFERS_3DFX" to "0x86B3",
        "GL_SAMPLES_3DFX" to "0x86B4",
        "GL_MULTISAMPLE_BIT_3DFX" to "0x20000000"
    )
    file("Tbuffer", `3DFX`, "GL_3DFX_tbuffer") {
        "glTbufferMask3DFX"(void, GLuint("mask"))
    }
    file(
        "TextureCompressionFXT1", `3DFX`, "GL_3DFX_texture_compression_FXT1",
        "GL_COMPRESSED_RGB_FXT1_3DFX" to "0x86B0",
        "GL_COMPRESSED_RGBA_FXT1_3DFX" to "0x86B1"
    )
}

fun amd() {}

fun apple() {}

fun ati() {}

fun ext() {}

fun gremedy() {}

fun hp() {}

fun ibm() {}

fun ingr() {}

fun intel() {}

fun mesa() {}

fun nv() {}

fun oml() {}

fun ovr() {}

fun pgi() {}

fun rend() {}

fun s3() {}

fun sgi() {}

fun sun() {
    file("ConstantData", SUNX, "GL_SUNX_constant_data") {
        "GL_UNPACK_CONSTANT_DATA_SUNX"("0x81D5")
        "GL_TEXTURE_CONSTANT_DATA_SUNX"("0x81D6")
        "glFinishTextureSUNX"(void)
    }
    file(
        "ConvolutionBorderModes", SUN, "GL_SUN_convolution_border_modes",
        "GL_WRAP_BORDER_SUN" to "0x81D4"
    )
    file("GlobalAlpha", SUN, "GL_SUN_global_alpha") {
        "GL_GLOBAL_ALPHA_SUN"("0x81D9")
        "GL_GLOBAL_ALPHA_FACTOR_SUN"("0x81DA")
        "glGlobalAlphaFactorbSUN"(void, GLbyte("factor"))
        "glGlobalAlphaFactorsSUN"(void, GLshort("factor"))
        "glGlobalAlphaFactoriSUN"(void, GLint("factor"))
        "glGlobalAlphaFactorfSUN"(void, GLfloat("factor"))
        "glGlobalAlphaFactordSUN"(void, GLdouble("factor"))
        "glGlobalAlphaFactorubSUN"(void, GLubyte("factor"))
        "glGlobalAlphaFactorusSUN"(void, GLushort("factor"))
        "glGlobalAlphaFactoruiSUN"(void, GLuint("factor"))
    }
    file("MeshArray", SUN, "GL_SUN_mesh_array") {
        "GL_QUAD_MESH_SUN"("0x8614")
        "GL_TRIANGLE_MESH_SUN"("0x8615")
        "glDrawMeshArraysSUN"(void, GLenum("mode"), GLint("first"), GLsizei("count"), GLsizei("width"))
    }
    file(
        "SliceAccum", SUN, "GL_SUN_slice_accum",
        "GL_SLICE_ACCUM_SUN" to "0x85CC"
    )
    file("TriangleList", SUN, "GL_SUN_triangle_list") {
        "GL_RESTART_SUN"("0x0001")
        "GL_REPLACE_MIDDLE_SUN"("0x0002")
        "GL_REPLACE_OLDEST_SUN"("0x0003")
        "GL_TRIANGLE_LIST_SUN"("0x81D7")
        "GL_REPLACEMENT_CODE_SUN"("0x81D8")
        "GL_REPLACEMENT_CODE_ARRAY_SUN"("0x85C0")
        "GL_REPLACEMENT_CODE_ARRAY_TYPE_SUN"("0x85C1")
        "GL_REPLACEMENT_CODE_ARRAY_STRIDE_SUN"("0x85C2")
        "GL_REPLACEMENT_CODE_ARRAY_POINTER_SUN"("0x85C3")
        "GL_R1UI_V3F_SUN"("0x85C4")
        "GL_R1UI_C4UB_V3F_SUN"("0x85C5")
        "GL_R1UI_C3F_V3F_SUN"("0x85C6")
        "GL_R1UI_N3F_V3F_SUN"("0x85C7")
        "GL_R1UI_C4F_N3F_V3F_SUN"("0x85C8")
        "GL_R1UI_T2F_V3F_SUN"("0x85C9")
        "GL_R1UI_T2F_N3F_V3F_SUN"("0x85CA")
        "GL_R1UI_T2F_C4F_N3F_V3F_SUN"("0x85CB")
        "glReplacementCodeuiSUN"(void, GLuint("code"))
        "glReplacementCodeusSUN"(void, GLushort("code"))
        "glReplacementCodeubSUN"(void, GLubyte("code"))
        "glReplacementCodeuivSUN"(void, address("code", "const GLuint *"))
        "glReplacementCodeusvSUN"(void, address("code", "const GLushort *"))
        "glReplacementCodeubvSUN"(void, address("code", "const GLubyte *"))
        "glReplacementCodePointerSUN"(void, GLenum("type"), GLsizei("stride"), address("pointer", "const void **"))
    }
    file("Vertex", SUN, "GL_SUN_vertex") {
        "glColor4ubVertex2fSUN"(
            void,
            GLubyte("r"),
            GLubyte("g"),
            GLubyte("b"),
            GLubyte("a"),
            GLfloat("x"),
            GLfloat("y")
        )
        "glColor4ubVertex2fvSUN"(void, address("c", "const GLubyte *"), address("v", "const GLfloat *"))
        "glColor4ubVertex3fSUN"(
            void,
            GLubyte("r"),
            GLubyte("g"),
            GLubyte("b"),
            GLubyte("a"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glColor4ubVertex3fvSUN"(void, address("c", "const GLubyte *"), address("v", "const GLfloat *"))
        "glColor3fVertex3fSUN"(void, GLfloat("r"), GLfloat("g"), GLfloat("b"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glColor3fVertex3fvSUN"(void, address("c", "const GLfloat *"), address("v", "const GLfloat *"))
        "glNormal3fVertex3fSUN"(
            void,
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glNormal3fVertex3fvSUN"(void, address("n", "const GLfloat *"), address("v", "const GLfloat *"))
        "glColor4fNormal3fVertex3fSUN"(
            void,
            GLfloat("r"),
            GLfloat("g"),
            GLfloat("b"),
            GLfloat("a"),
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glColor4fNormal3fVertex3fvSUN"(
            void,
            address("c", "const GLfloat *"),
            address("n", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glTexCoord2fVertex3fSUN"(void, GLfloat("s"), GLfloat("t"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glTexCoord2fVertex3fvSUN"(void, address("tc", "const GLfloat *"), address("v", "const GLfloat *"))
        "glTexCoord4fVertex4fSUN"(
            void,
            GLfloat("s"),
            GLfloat("t"),
            GLfloat("p"),
            GLfloat("q"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z"),
            GLfloat("w")
        )
        "glTexCoord4fVertex4fvSUN"(void, address("tc", "const GLfloat *"), address("v", "const GLfloat *"))
        "glTexCoord2fColor4ubVertex3fSUN"(
            void,
            GLfloat("s"),
            GLfloat("t"),
            GLubyte("r"),
            GLubyte("g"),
            GLubyte("b"),
            GLubyte("a"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glTexCoord2fColor4ubVertex3fvSUN"(
            void,
            address("tc", "const GLfloat *"),
            address("c", "const GLubyte *"),
            address("v", "const GLfloat *")
        )
        "glTexCoord2fColor3fVertex3fSUN"(
            void,
            GLfloat("s"),
            GLfloat("t"),
            GLfloat("r"),
            GLfloat("g"),
            GLfloat("b"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glTexCoord2fColor3fVertex3fvSUN"(
            void,
            address("tc", "const GLfloat *"),
            address("c", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glTexCoord2fNormal3fVertex3fSUN"(
            void,
            GLfloat("s"),
            GLfloat("t"),
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glTexCoord2fNormal3fVertex3fvSUN"(
            void,
            address("tc", "const GLfloat *"),
            address("n", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glTexCoord2fColor4fNormal3fVertex3fSUN"(
            void,
            GLfloat("s"),
            GLfloat("t"),
            GLfloat("r"),
            GLfloat("g"),
            GLfloat("b"),
            GLfloat("a"),
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glTexCoord2fColor4fNormal3fVertex3fvSUN"(
            void,
            address("tc", "const GLfloat *"),
            address("c", "const GLfloat *"),
            address("n", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glTexCoord4fColor4fNormal3fVertex4fSUN"(
            void,
            GLfloat("s"),
            GLfloat("t"),
            GLfloat("p"),
            GLfloat("q"),
            GLfloat("r"),
            GLfloat("g"),
            GLfloat("b"),
            GLfloat("a"),
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z"),
            GLfloat("w")
        )
        "glTexCoord4fColor4fNormal3fVertex4fvSUN"(
            void,
            address("tc", "const GLfloat *"),
            address("c", "const GLfloat *"),
            address("n", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glReplacementCodeuiVertex3fSUN"(void, GLuint("rc"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glReplacementCodeuiVertex3fvSUN"(void, address("rc", "const GLuint *"), address("v", "const GLfloat *"))
        "glReplacementCodeuiColor4ubVertex3fSUN"(
            void,
            GLuint("rc"),
            GLubyte("r"),
            GLubyte("g"),
            GLubyte("b"),
            GLubyte("a"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glReplacementCodeuiColor4ubVertex3fvSUN"(
            void,
            address("rc", "const GLuint *"),
            address("c", "const GLubyte *"),
            address("v", "const GLfloat *")
        )
        "glReplacementCodeuiColor3fVertex3fSUN"(
            void,
            GLuint("rc"),
            GLfloat("r"),
            GLfloat("g"),
            GLfloat("b"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glReplacementCodeuiColor3fVertex3fvSUN"(
            void,
            address("rc", "const GLuint *"),
            address("c", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glReplacementCodeuiNormal3fVertex3fSUN"(
            void,
            GLuint("rc"),
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glReplacementCodeuiNormal3fVertex3fvSUN"(
            void,
            address("rc", "const GLuint *"),
            address("n", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glReplacementCodeuiColor4fNormal3fVertex3fSUN"(
            void,
            GLuint("rc"),
            GLfloat("r"),
            GLfloat("g"),
            GLfloat("b"),
            GLfloat("a"),
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glReplacementCodeuiColor4fNormal3fVertex3fvSUN"(
            void,
            address("rc", "const GLuint *"),
            address("c", "const GLfloat *"),
            address("n", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glReplacementCodeuiTexCoord2fVertex3fSUN"(
            void,
            GLuint("rc"),
            GLfloat("s"),
            GLfloat("t"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glReplacementCodeuiTexCoord2fVertex3fvSUN"(
            void,
            address("rc", "const GLuint *"),
            address("tc", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN"(
            void,
            GLuint("rc"),
            GLfloat("s"),
            GLfloat("t"),
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN"(
            void,
            address("rc", "const GLuint *"),
            address("tc", "const GLfloat *"),
            address("n", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
        "glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN"(
            void,
            GLuint("rc"),
            GLfloat("s"),
            GLfloat("t"),
            GLfloat("r"),
            GLfloat("g"),
            GLfloat("b"),
            GLfloat("a"),
            GLfloat("nx"),
            GLfloat("ny"),
            GLfloat("nz"),
            GLfloat("x"),
            GLfloat("y"),
            GLfloat("z")
        )
        "glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN"(
            void,
            address("rc", "const GLuint *"),
            address("tc", "const GLfloat *"),
            address("c", "const GLfloat *"),
            address("n", "const GLfloat *"),
            address("v", "const GLfloat *")
        )
    }
}

fun win() {
    file(
        "PhongShading", WIN, "GL_WIN_phong_shading",
        "GL_PHONG_WIN" to "0x80EA",
        "GL_PHONG_HINT_WIN" to "0x80EB"
    )
    file(
        "SpecularFog", WIN, "GL_WIN_specular_fog",
        "GL_FOG_SPECULAR_TEXTURE_WIN" to "0x80EC"
    )
}

fun glExtCaps() {
    Files.writeString(Path("GLExtCaps.java"), buildString {
        appendLine(
            """
            $fileHeader
            package overrungl.opengl;

            import overrungl.opengl.ext.*;
            import overrungl.opengl.ext.arb.*;
            import overrungl.opengl.ext.khr.*;
            import overrungl.opengl.ext.amd.*;
            import overrungl.opengl.ext.apple.*;
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
            """.trimIndent()
        )
        generatedExtFunctions.forEachIndexed { index, function ->
            if (index == 0) append("        ")
            else append(", ")
            append(function.name)
        }
        appendLine(";\n        void load(GLLoadFunc load) {")
        generatedExtClasses.forEach {
            appendLine("        ${it.ext.extName}${it.name}.load(this, load);")
        }
        appendLine("    }\n}")
    })
}

/**
 * @author squid233
 * @since 0.1.0
 */
fun main() {
    arb()
    khr()
    oes()
    `3dfx`()
    amd()
    apple()
    ati()
    ext()
    gremedy()
    hp()
    ibm()
    ingr()
    intel()
    mesa()
    nv()
    oml()
    ovr()
    pgi()
    rend()
    s3()
    sgi()
    sun()
    win()
    glExtCaps()
}
