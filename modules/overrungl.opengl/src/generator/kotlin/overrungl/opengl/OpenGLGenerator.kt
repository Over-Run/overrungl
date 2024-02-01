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

/* note: adding a new extension
 * you need to add the extension in glExtCaps::caps
 */

package overrungl.opengl

import overrungl.opengl.OpenGLExt.*
import java.nio.file.Files
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

const val fileHeader = """/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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

val arena = Type("Arena", null)

val GLboolean = boolean
val GLbyte = byte
val GLubyte = byte
val GLshort = short
val GLushort = short
val GLint = int
val GLuint = int
val GLfixed = int
val GLsizei = int
val GLenum = int
val GLintptr = long
val GLsizeiptr = long
val GLbitfield = int
val GLfloat = float
val GLclampf = float
val GLdouble = double
val GLclampd = double
val GLchar = byte
val GLint64 = long
val GLuint64 = long

val GLsizeiptrARB = long
val GLintptrARB = long
val GLhandleARB = int // Don't know how to handle on APPLE
val GLcharARB = byte
val GLint64EXT = long
val GLuint64EXT = long
val GLhalfNV = short
val GLvdpauSurfaceNV = GLintptr

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

    operator fun invoke(action: Function.() -> Unit) {
        action()
    }

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
    val hasFunction: Boolean
        get() = functions.isNotEmpty()

    operator fun String.invoke(value: String) {
        constants[this] = value
    }

    operator fun String.invoke(returnType: Type, vararg params: Parameter, nativeType: String? = null): Function =
        Function(this, returnType, nativeType, params.toList()).also {
            functions.add(it)
            when (ext) {
                CORE -> generatedFunctions.add(it)
                else -> generatedExtFunctions.add(it)
            }
        }

    internal fun generate() {
        Path(ext.dir).also {
            if (!Files.exists(it)) {
                Files.createDirectories(it)
            }
            Files.writeString(it.resolve("GL${ext.extName}$name.java"), buildString {
                // file-header
                appendLine(
                    """
                ${fileHeader.prependIndent("|")}
                |package overrungl.opengl${ext.packageName};
                |import overrungl.NativeType;
                |import overrungl.opengl.*;
                |import java.lang.foreign.*;

                |/**
                | * {@code $extName}
                | */
                |public interface GL${ext.extName}$name {
            """.trimMargin()
                )
                // constants
                constants.forEach { (name, value) ->
                    appendLine("    int $name = $value;")
                }
                if (functions.isNotEmpty()) {
                    appendLine()
                    // functions
                    fun appendFuncHeader(f: Function, overload: Boolean) {
                        append("    ")
                        if (overload) {
                            appendLine("@overrun.marshal.gen.Skip")
                            append("    ")
                        }
                        if (f.nativeType != null)
                            append("@NativeType(\"${f.nativeType}\") ")
                        append("default ${f.returnType} ${f.name}(")
                        f.params.forEachIndexed { index, it ->
                            if (index != 0) append(", ")
                            if (it.nativeType != null)
                                append("@NativeType(\"${it.nativeType}\") ")
                            append("${it.type} ${it.name}")
                        }
                        appendLine(") {")
                    }
                    functions.forEach { f ->
                        appendFuncHeader(f, false)
                        appendLine("        throw new ContextException();")
                        appendLine("    }")
                        appendLine()

                        // overloads
                        if (f.overloads.isNotEmpty()) {
                            f.overloads.forEach { overload ->
                                appendFuncHeader(overload, true)
                                appendLine(overload.content!!.prependIndent("        "))
                                appendLine("    }")
                                appendLine()
                            }
                        }
                    }
                }
                appendLine("}")
            })
        }
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
    file("ByteCoordinates", OES, "GL_OES_byte_coordinates") {
        "glMultiTexCoord1bOES"(void, GLenum("texture"), GLbyte("s"))
        "glMultiTexCoord1bvOES"(void, GLenum("texture"), address("coords", "const GLbyte *"))
        "glMultiTexCoord2bOES"(void, GLenum("texture"), GLbyte("s"), GLbyte("t"))
        "glMultiTexCoord2bvOES"(void, GLenum("texture"), address("coords", "const GLbyte *"))
        "glMultiTexCoord3bOES"(void, GLenum("texture"), GLbyte("s"), GLbyte("t"), GLbyte("r"))
        "glMultiTexCoord3bvOES"(void, GLenum("texture"), address("coords", "const GLbyte *"))
        "glMultiTexCoord4bOES"(void, GLenum("texture"), GLbyte("s"), GLbyte("t"), GLbyte("r"), GLbyte("q"))
        "glMultiTexCoord4bvOES"(void, GLenum("texture"), address("coords", "const GLbyte *"))
        "glTexCoord1bOES"(void, GLbyte("s"))
        "glTexCoord1bvOES"(void, address("coords", "const GLbyte *"))
        "glTexCoord2bOES"(void, GLbyte("s"), GLbyte("t"))
        "glTexCoord2bvOES"(void, address("coords", "const GLbyte *"))
        "glTexCoord3bOES"(void, GLbyte("s"), GLbyte("t"), GLbyte("r"))
        "glTexCoord3bvOES"(void, address("coords", "const GLbyte *"))
        "glTexCoord4bOES"(void, GLbyte("s"), GLbyte("t"), GLbyte("r"), GLbyte("q"))
        "glTexCoord4bvOES"(void, address("coords", "const GLbyte *"))
        "glVertex2bOES"(void, GLbyte("x"), GLbyte("y"))
        "glVertex2bvOES"(void, address("coords", "const GLbyte *"))
        "glVertex3bOES"(void, GLbyte("x"), GLbyte("y"), GLbyte("z"))
        "glVertex3bvOES"(void, address("coords", "const GLbyte *"))
        "glVertex4bOES"(void, GLbyte("x"), GLbyte("y"), GLbyte("z"), GLbyte("w"))
        "glVertex4bvOES"(void, address("coords", "const GLbyte *"))
    }
    file(
        "CompressedPalettedTexture", OES, "GL_OES_compressed_paletted_texture",
        "GL_PALETTE4_RGB8_OES" to "0x8B90",
        "GL_PALETTE4_RGBA8_OES" to "0x8B91",
        "GL_PALETTE4_R5_G6_B5_OES" to "0x8B92",
        "GL_PALETTE4_RGBA4_OES" to "0x8B93",
        "GL_PALETTE4_RGB5_A1_OES" to "0x8B94",
        "GL_PALETTE8_RGB8_OES" to "0x8B95",
        "GL_PALETTE8_RGBA8_OES" to "0x8B96",
        "GL_PALETTE8_R5_G6_B5_OES" to "0x8B97",
        "GL_PALETTE8_RGBA4_OES" to "0x8B98",
        "GL_PALETTE8_RGB5_A1_OES" to "0x8B99"
    )
    file("FixedPoint", OES, "GL_OES_fixed_point") {
        "GL_FIXED_OES"("0x140C")
        "glAlphaFuncxOES"(void, GLenum("func"), GLfixed("ref"))
        "glClearColorxOES"(void, GLfixed("red"), GLfixed("green"), GLfixed("blue"), GLfixed("alpha"))
        "glClearDepthxOES"(void, GLfixed("depth"))
        "glClipPlanexOES"(void, GLenum("plane"), address("equation", "const GLfixed *"))
        "glColor4xOES"(void, GLfixed("red"), GLfixed("green"), GLfixed("blue"), GLfixed("alpha"))
        "glDepthRangexOES"(void, GLfixed("n"), GLfixed("f"))
        "glFogxOES"(void, GLenum("pname"), GLfixed("param"))
        "glFogxvOES"(void, GLenum("pname"), address("param", "const GLfixed *"))
        "glFrustumxOES"(void, GLfixed("l"), GLfixed("r"), GLfixed("b"), GLfixed("t"), GLfixed("n"), GLfixed("f"))
        "glGetClipPlanexOES"(void, GLenum("plane"), address("equation", "GLfixed *"))
        "glGetFixedvOES"(void, GLenum("pname"), address("params", "GLfixed *"))
        "glGetTexEnvxvOES"(void, GLenum("target"), GLenum("pname"), address("params", "GLfixed *"))
        "glGetTexParameterxvOES"(void, GLenum("target"), GLenum("pname"), address("params", "GLfixed *"))
        "glLightModelxOES"(void, GLenum("pname"), GLfixed("param"))
        "glLightModelxvOES"(void, GLenum("pname"), address("param", "const GLfixed *"))
        "glLightxOES"(void, GLenum("light"), GLenum("pname"), GLfixed("param"))
        "glLightxvOES"(void, GLenum("light"), GLenum("pname"), address("params", "const GLfixed *"))
        "glLineWidthxOES"(void, GLfixed("width"))
        "glLoadMatrixxOES"(void, address("m", "const GLfixed *"))
        "glMaterialxOES"(void, GLenum("face"), GLenum("pname"), GLfixed("param"))
        "glMaterialxvOES"(void, GLenum("face"), GLenum("pname"), address("param", "const GLfixed *"))
        "glMultMatrixxOES"(void, address("m", "const GLfixed *"))
        "glMultiTexCoord4xOES"(void, GLenum("texture"), GLfixed("s"), GLfixed("t"), GLfixed("r"), GLfixed("q"))
        "glNormal3xOES"(void, GLfixed("nx"), GLfixed("ny"), GLfixed("nz"))
        "glOrthoxOES"(void, GLfixed("l"), GLfixed("r"), GLfixed("b"), GLfixed("t"), GLfixed("n"), GLfixed("f"))
        "glPointParameterxvOES"(void, GLenum("pname"), address("params", "const GLfixed *"))
        "glPointSizexOES"(void, GLfixed("size"))
        "glPolygonOffsetxOES"(void, GLfixed("factor"), GLfixed("units"))
        "glRotatexOES"(void, GLfixed("angle"), GLfixed("x"), GLfixed("y"), GLfixed("z"))
        "glScalexOES"(void, GLfixed("x"), GLfixed("y"), GLfixed("z"))
        "glTexEnvxOES"(void, GLenum("target"), GLenum("pname"), GLfixed("param"))
        "glTexEnvxvOES"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfixed *"))
        "glTexParameterxOES"(void, GLenum("target"), GLenum("pname"), GLfixed("param"))
        "glTexParameterxvOES"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfixed *"))
        "glTranslatexOES"(void, GLfixed("x"), GLfixed("y"), GLfixed("z"))
        "glAccumxOES"(void, GLenum("op"), GLfixed("value"))
        "glBitmapxOES"(
            void,
            GLsizei("width"),
            GLsizei("height"),
            GLfixed("xorig"),
            GLfixed("yorig"),
            GLfixed("xmove"),
            GLfixed("ymove"),
            address("bitmap", "const GLubyte *")
        )
        "glBlendColorxOES"(void, GLfixed("red"), GLfixed("green"), GLfixed("blue"), GLfixed("alpha"))
        "glClearAccumxOES"(void, GLfixed("red"), GLfixed("green"), GLfixed("blue"), GLfixed("alpha"))
        "glColor3xOES"(void, GLfixed("red"), GLfixed("green"), GLfixed("blue"))
        "glColor3xvOES"(void, address("components", "const GLfixed *"))
        "glColor4xvOES"(void, address("components", "const GLfixed *"))
        "glConvolutionParameterxOES"(void, GLenum("target"), GLenum("pname"), GLfixed("param"))
        "glConvolutionParameterxvOES"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfixed *"))
        "glEvalCoord1xOES"(void, GLfixed("u"))
        "glEvalCoord1xvOES"(void, address("coords", "const GLfixed *"))
        "glEvalCoord2xOES"(void, GLfixed("u"), GLfixed("v"))
        "glEvalCoord2xvOES"(void, address("coords", "const GLfixed *"))
        "glFeedbackBufferxOES"(void, GLsizei("n"), GLenum("type"), address("buffer", "const GLfixed *"))
        "glGetConvolutionParameterxvOES"(void, GLenum("target"), GLenum("pname"), address("params", "GLfixed *"))
        "glGetHistogramParameterxvOES"(void, GLenum("target"), GLenum("pname"), address("params", "GLfixed *"))
        "glGetLightxOES"(void, GLenum("light"), GLenum("pname"), address("params", "GLfixed *"))
        "glGetMapxvOES"(void, GLenum("target"), GLenum("query"), address("v", "GLfixed *"))
        "glGetMaterialxOES"(void, GLenum("face"), GLenum("pname"), GLfixed("param"))
        "glGetPixelMapxv"(void, GLenum("map"), GLint("size"), address("values", "GLfixed *"))
        "glGetTexGenxvOES"(void, GLenum("coord"), GLenum("pname"), address("params", "GLfixed *"))
        "glGetTexLevelParameterxvOES"(
            void,
            GLenum("target"),
            GLint("level"),
            GLenum("pname"),
            address("params", "GLfixed *")
        )
        "glIndexxOES"(void, GLfixed("component"))
        "glIndexxvOES"(void, address("component", "const GLfixed *"))
        "glLoadTransposeMatrixxOES"(void, address("m", "const GLfixed *"))
        "glMap1xOES"(
            void,
            GLenum("target"),
            GLfixed("u1"),
            GLfixed("u2"),
            GLint("stride"),
            GLint("order"),
            GLfixed("points")
        )
        "glMap2xOES"(
            void,
            GLenum("target"),
            GLfixed("u1"),
            GLfixed("u2"),
            GLint("ustride"),
            GLint("uorder"),
            GLfixed("v1"),
            GLfixed("v2"),
            GLint("vstride"),
            GLint("vorder"),
            GLfixed("points")
        )
        "glMapGrid1xOES"(void, GLint("n"), GLfixed("u1"), GLfixed("u2"))
        "glMapGrid2xOES"(void, GLint("n"), GLfixed("u1"), GLfixed("u2"), GLfixed("v1"), GLfixed("v2"))
        "glMultTransposeMatrixxOES"(void, address("m", "const GLfixed *"))
        "glMultiTexCoord1xOES"(void, GLenum("texture"), GLfixed("s"))
        "glMultiTexCoord1xvOES"(void, GLenum("texture"), address("coords", "const GLfixed *"))
        "glMultiTexCoord2xOES"(void, GLenum("texture"), GLfixed("s"), GLfixed("t"))
        "glMultiTexCoord2xvOES"(void, GLenum("texture"), address("coords", "const GLfixed *"))
        "glMultiTexCoord3xOES"(void, GLenum("texture"), GLfixed("s"), GLfixed("t"), GLfixed("r"))
        "glMultiTexCoord3xvOES"(void, GLenum("texture"), address("coords", "const GLfixed *"))
        "glMultiTexCoord4xvOES"(void, GLenum("texture"), address("coords", "const GLfixed *"))
        "glNormal3xvOES"(void, address("coords", "const GLfixed *"))
        "glPassThroughxOES"(void, GLfixed("token"))
        "glPixelMapx"(void, GLenum("map"), GLint("size"), address("values", "const GLfixed *"))
        "glPixelStorex"(void, GLenum("pname"), GLfixed("param"))
        "glPixelTransferxOES"(void, GLenum("pname"), GLfixed("param"))
        "glPixelZoomxOES"(void, GLfixed("xfactor"), GLfixed("yfactor"))
        "glPrioritizeTexturesxOES"(
            void,
            GLsizei("n"),
            address("textures", "const GLuint *"),
            address("priorities", "const GLfixed *")
        )
        "glRasterPos2xOES"(void, GLfixed("x"), GLfixed("y"))
        "glRasterPos2xvOES"(void, address("coords", "const GLfixed *"))
        "glRasterPos3xOES"(void, GLfixed("x"), GLfixed("y"), GLfixed("z"))
        "glRasterPos3xvOES"(void, address("coords", "const GLfixed *"))
        "glRasterPos4xOES"(void, GLfixed("x"), GLfixed("y"), GLfixed("z"), GLfixed("w"))
        "glRasterPos4xvOES"(void, address("coords", "const GLfixed *"))
        "glRectxOES"(void, GLfixed("x1"), GLfixed("y1"), GLfixed("x2"), GLfixed("y2"))
        "glRectxvOES"(void, address("v1", "const GLfixed *"), address("v2", "const GLfixed *"))
        "glTexCoord1xOES"(void, GLfixed("s"))
        "glTexCoord1xvOES"(void, address("coords", "const GLfixed *"))
        "glTexCoord2xOES"(void, GLfixed("s"), GLfixed("t"))
        "glTexCoord2xvOES"(void, address("coords", "const GLfixed *"))
        "glTexCoord3xOES"(void, GLfixed("s"), GLfixed("t"), GLfixed("r"))
        "glTexCoord3xvOES"(void, address("coords", "const GLfixed *"))
        "glTexCoord4xOES"(void, GLfixed("s"), GLfixed("t"), GLfixed("r"), GLfixed("q"))
        "glTexCoord4xvOES"(void, address("coords", "const GLfixed *"))
        "glTexGenxOES"(void, GLenum("coord"), GLenum("pname"), GLfixed("param"))
        "glTexGenxvOES"(void, GLenum("coord"), GLenum("pname"), address("params", "const GLfixed *"))
        "glVertex2xOES"(void, GLfixed("x"))
        "glVertex2xvOES"(void, address("coords", "const GLfixed *"))
        "glVertex3xOES"(void, GLfixed("x"), GLfixed("y"))
        "glVertex3xvOES"(void, address("coords", "const GLfixed *"))
        "glVertex4xOES"(void, GLfixed("x"), GLfixed("y"), GLfixed("z"))
        "glVertex4xvOES"(void, address("coords", "const GLfixed *"))
    }
    file("QueryMatrix", OES, "GL_OES_query_matrix") {
        "glQueryMatrixxOES"(GLbitfield, address("mantissa", "GLfixed *"), address("exponent", "GLint *"))
    }
    file(
        "ReadFormat", OES, "GL_OES_read_format",
        "GL_IMPLEMENTATION_COLOR_READ_TYPE_OES" to "0x8B9A",
        "GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES" to "0x8B9B"
    )
    file("SinglePrecision", OES, "GL_OES_single_precision") {
        "glClearDepthfOES"(void, GLclampf("depth"))
        "glClipPlanefOES"(void, GLenum("plane"), address("equation", "const GLfloat *"))
        "glDepthRangefOES"(void, GLclampf("n"), GLclampf("f"))
        "glFrustumfOES"(void, GLfloat("l"), GLfloat("r"), GLfloat("b"), GLfloat("t"), GLfloat("n"), GLfloat("f"))
        "glGetClipPlanefOES"(void, GLenum("plane"), address("equation", "GLfloat *"))
        "glOrthofOES"(void, GLfloat("l"), GLfloat("r"), GLfloat("b"), GLfloat("t"), GLfloat("n"), GLfloat("f"))
    }
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

fun apple() {
    file("AuxDepthStencil", APPLE, "GL_APPLE_aux_depth_stencil", "GL_AUX_DEPTH_STENCIL_APPLE" to "0x8A14")
    file("ClientStorage", APPLE, "GL_APPLE_client_storage", "GL_UNPACK_CLIENT_STORAGE_APPLE" to "0x85B2")
    file("ElementArray", APPLE, "GL_APPLE_element_array") {
        "GL_ELEMENT_ARRAY_APPLE"("0x8A0C")
        "GL_ELEMENT_ARRAY_TYPE_APPLE"("0x8A0D")
        "GL_ELEMENT_ARRAY_POINTER_APPLE"("0x8A0E")
        "glElementPointerAPPLE"(void, GLenum("type"), address("pointer", "const void *"))
        "glDrawElementArrayAPPLE"(void, GLenum("mode"), GLint("first"), GLsizei("count"))
        "glDrawRangeElementArrayAPPLE"(
            void,
            GLenum("mode"),
            GLuint("start"),
            GLuint("end"),
            GLint("first"),
            GLsizei("count")
        )
        "glMultiDrawElementArrayAPPLE"(
            void,
            GLenum("mode"),
            address("first", "const GLint *"),
            address("count", "const GLsizei *"),
            GLsizei("primcount")
        )
        "glMultiDrawRangeElementArrayAPPLE"(
            void,
            GLenum("mode"),
            GLuint("start"),
            GLuint("end"),
            address("first", "const GLint *"),
            address("count", "const GLsizei *"),
            GLsizei("primcount")
        )
    }
    file("Fence", APPLE, "GL_APPLE_fence") {
        "GL_DRAW_PIXELS_APPLE"("0x8A0A")
        "GL_FENCE_APPLE"("0x8A0B")
        "glGenFencesAPPLE"(void, GLsizei("n"), address("fences", "GLuint *"))
        "glDeleteFencesAPPLE"(void, GLsizei("n"), address("fences", "const GLuint *"))
        "glSetFenceAPPLE"(void, GLuint("fence"))
        "glIsFenceAPPLE"(GLboolean, GLuint("fence"))
        "glTestFenceAPPLE"(GLboolean, GLuint("fence"))
        "glFinishFenceAPPLE"(void, GLuint("fence"))
        "glTestObjectAPPLE"(GLboolean, GLenum("object"), GLuint("name"))
        "glFinishObjectAPPLE"(void, GLenum("object"), GLint("name"))
    }
    file(
        "FloatPixels", APPLE, "GL_APPLE_float_pixels",
        "GL_HALF_APPLE" to "0x140B",
        "GL_RGBA_FLOAT32_APPLE" to "0x8814",
        "GL_RGB_FLOAT32_APPLE" to "0x8815",
        "GL_ALPHA_FLOAT32_APPLE" to "0x8816",
        "GL_INTENSITY_FLOAT32_APPLE" to "0x8817",
        "GL_LUMINANCE_FLOAT32_APPLE" to "0x8818",
        "GL_LUMINANCE_ALPHA_FLOAT32_APPLE" to "0x8819",
        "GL_RGBA_FLOAT16_APPLE" to "0x881A",
        "GL_RGB_FLOAT16_APPLE" to "0x881B",
        "GL_ALPHA_FLOAT16_APPLE" to "0x881C",
        "GL_INTENSITY_FLOAT16_APPLE" to "0x881D",
        "GL_LUMINANCE_FLOAT16_APPLE" to "0x881E",
        "GL_LUMINANCE_ALPHA_FLOAT16_APPLE" to "0x881F",
        "GL_COLOR_FLOAT_APPLE" to "0x8A0F"
    )
    file("FlushBufferRange", APPLE, "GL_APPLE_flush_buffer_range") {
        "GL_BUFFER_SERIALIZED_MODIFY_APPLE"("0x8A12")
        "GL_BUFFER_FLUSHING_UNMAP_APPLE"("0x8A13")
        "glBufferParameteriAPPLE"(void, GLenum("target"), GLenum("pname"), GLint("param"))
        "glFlushMappedBufferRangeAPPLE"(void, GLenum("target"), GLintptr("offset"), GLsizeiptr("size"))
    }
    file("ObjectPurgeable", APPLE, "GL_APPLE_object_purgeable") {
        "GL_BUFFER_OBJECT_APPLE"("0x85B3")
        "GL_RELEASED_APPLE"("0x8A19")
        "GL_VOLATILE_APPLE"("0x8A1A")
        "GL_RETAINED_APPLE"("0x8A1B")
        "GL_UNDEFINED_APPLE"("0x8A1C")
        "GL_PURGEABLE_APPLE"("0x8A1D")
        "glObjectPurgeableAPPLE"(GLenum, GLenum("objectType"), GLuint("name"), GLenum("option"))
        "glObjectUnpurgeableAPPLE"(GLenum, GLenum("objectType"), GLuint("name"), GLenum("option"))
        "glGetObjectParameterivAPPLE"(
            void,
            GLenum("objectType"),
            GLuint("name"),
            GLenum("pname"),
            address("params", "GLint *")
        )
    }
    file(
        "Rgb422", APPLE, "GL_APPLE_rgb_422",
        "GL_RGB_422_APPLE" to "0x8A1F",
        "GL_UNSIGNED_SHORT_8_8_APPLE" to "0x85BA",
        "GL_UNSIGNED_SHORT_8_8_REV_APPLE" to "0x85BB",
        "GL_RGB_RAW_422_APPLE" to "0x8A51"
    )
    file(
        "RowBytes", APPLE, "GL_APPLE_row_bytes",
        "GL_PACK_ROW_BYTES_APPLE" to "0x8A15",
        "GL_UNPACK_ROW_BYTES_APPLE" to "0x8A16"
    )
    file("SpecularVector", APPLE, "GL_APPLE_specular_vector", "GL_LIGHT_MODEL_SPECULAR_VECTOR_APPLE" to "0x85B0")
    file("TextureRange", APPLE, "GL_APPLE_texture_range") {
        "GL_TEXTURE_RANGE_LENGTH_APPLE"("0x85B7")
        "GL_TEXTURE_RANGE_POINTER_APPLE"("0x85B8")
        "GL_TEXTURE_STORAGE_HINT_APPLE"("0x85BC")
        "GL_STORAGE_PRIVATE_APPLE"("0x85BD")
        "GL_STORAGE_CACHED_APPLE"("0x85BE")
        "GL_STORAGE_SHARED_APPLE"("0x85BF")
        "glTextureRangeAPPLE"(void, GLenum("target"), GLsizei("length"), address("pointer", "const void *"))
        "glGetTexParameterPointervAPPLE"(void, GLenum("target"), GLenum("pname"), address("params", "void **"))
    }
    file("TransformHint", APPLE, "GL_APPLE_transform_hint", "GL_TRANSFORM_HINT_APPLE" to "0x85B1")
    file("VertexArrayObject", APPLE, "GL_APPLE_vertex_array_object") {
        "GL_VERTEX_ARRAY_BINDING_APPLE"("0x85B5")
        "glBindVertexArrayAPPLE"(void, GLuint("array"))
        "glDeleteVertexArraysAPPLE"(void, GLsizei("n"), address("arrays", "const GLuint *"))
        "glGenVertexArraysAPPLE"(void, GLsizei("n"), address("arrays", "GLuint *"))
        "glIsVertexArrayAPPLE"(GLboolean, GLuint("array"))
    }
    file("VertexArrayRange", APPLE, "GL_APPLE_vertex_array_range") {
        "GL_VERTEX_ARRAY_RANGE_APPLE"("0x851D")
        "GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE"("0x851E")
        "GL_VERTEX_ARRAY_STORAGE_HINT_APPLE"("0x851F")
        "GL_VERTEX_ARRAY_RANGE_POINTER_APPLE"("0x8521")
        "GL_STORAGE_CLIENT_APPLE"("0x85B4")
        "glVertexArrayRangeAPPLE"(void, GLsizei("length"), address("pointer", "void *"))
        "glFlushVertexArrayRangeAPPLE"(void, GLsizei("length"), address("pointer", "void *"))
        "glVertexArrayParameteriAPPLE"(void, GLenum("pname"), GLint("param"))
    }
    file("VertexProgramEvaluators", APPLE, "GL_APPLE_vertex_program_evaluators") {
        "GL_VERTEX_ATTRIB_MAP1_APPLE"("0x8A00")
        "GL_VERTEX_ATTRIB_MAP2_APPLE"("0x8A01")
        "GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE"("0x8A02")
        "GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE"("0x8A03")
        "GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE"("0x8A04")
        "GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE"("0x8A05")
        "GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE"("0x8A06")
        "GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE"("0x8A07")
        "GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE"("0x8A08")
        "GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE"("0x8A09")
        "glEnableVertexAttribAPPLE"(void, GLuint("index"), GLenum("pname"))
        "glDisableVertexAttribAPPLE"(void, GLuint("index"), GLenum("pname"))
        "glIsVertexAttribEnabledAPPLE"(GLboolean, GLuint("index"), GLenum("pname"))
        "glMapVertexAttrib1dAPPLE"(
            void,
            GLuint("index"),
            GLuint("size"),
            GLdouble("u1"),
            GLdouble("u2"),
            GLint("stride"),
            GLint("order"),
            address("points", "const GLdouble *")
        )
        "glMapVertexAttrib1fAPPLE"(
            void,
            GLuint("index"),
            GLuint("size"),
            GLfloat("u1"),
            GLfloat("u2"),
            GLint("stride"),
            GLint("order"),
            address("points", "const GLfloat *")
        )
        "glMapVertexAttrib2dAPPLE"(
            void,
            GLuint("index"),
            GLuint("size"),
            GLdouble("u1"),
            GLdouble("u2"),
            GLint("ustride"),
            GLint("uorder"),
            GLdouble("v1"),
            GLdouble("v2"),
            GLint("vstride"),
            GLint("vorder"),
            address("points", "const GLdouble *")
        )
        "glMapVertexAttrib2fAPPLE"(
            void,
            GLuint("index"),
            GLuint("size"),
            GLfloat("u1"),
            GLfloat("u2"),
            GLint("ustride"),
            GLint("uorder"),
            GLfloat("v1"),
            GLfloat("v2"),
            GLint("vstride"),
            GLint("vorder"),
            address("points", "const GLfloat *")
        )
    }
    file("Ycbcr422", APPLE, "GL_APPLE_ycbcr_422", "GL_YCBCR_422_APPLE" to "0x85B9")
}

fun ati() {
    file("DrawBuffers", ATI, "GL_ATI_draw_buffers") {
        "GL_MAX_DRAW_BUFFERS_ATI"("0x8824")
        "GL_DRAW_BUFFER0_ATI"("0x8825")
        "GL_DRAW_BUFFER1_ATI"("0x8826")
        "GL_DRAW_BUFFER2_ATI"("0x8827")
        "GL_DRAW_BUFFER3_ATI"("0x8828")
        "GL_DRAW_BUFFER4_ATI"("0x8829")
        "GL_DRAW_BUFFER5_ATI"("0x882A")
        "GL_DRAW_BUFFER6_ATI"("0x882B")
        "GL_DRAW_BUFFER7_ATI"("0x882C")
        "GL_DRAW_BUFFER8_ATI"("0x882D")
        "GL_DRAW_BUFFER9_ATI"("0x882E")
        "GL_DRAW_BUFFER10_ATI"("0x882F")
        "GL_DRAW_BUFFER11_ATI"("0x8830")
        "GL_DRAW_BUFFER12_ATI"("0x8831")
        "GL_DRAW_BUFFER13_ATI"("0x8832")
        "GL_DRAW_BUFFER14_ATI"("0x8833")
        "GL_DRAW_BUFFER15_ATI"("0x8834")
        "glDrawBuffersATI"(void, GLsizei("n"), address("bufs", "const GLenum *"))
    }
    file("ElementArray", ATI, "GL_ATI_element_array") {
        "GL_ELEMENT_ARRAY_ATI"("0x8768")
        "GL_ELEMENT_ARRAY_TYPE_ATI"("0x8769")
        "GL_ELEMENT_ARRAY_POINTER_ATI"("0x876A")
        "glElementPointerATI"(void, GLenum("type"), address("pointer", "const void *"))
        "glDrawElementArrayATI"(void, GLenum("mode"), GLsizei("count"))
        "glDrawRangeElementArrayATI"(void, GLenum("mode"), GLuint("start"), GLuint("end"), GLsizei("count"))
    }
    file("EnvmapBumpmap", ATI, "GL_ATI_envmap_bumpmap") {
        "GL_BUMP_ROT_MATRIX_ATI"("0x8775")
        "GL_BUMP_ROT_MATRIX_SIZE_ATI"("0x8776")
        "GL_BUMP_NUM_TEX_UNITS_ATI"("0x8777")
        "GL_BUMP_TEX_UNITS_ATI"("0x8778")
        "GL_DUDV_ATI"("0x8779")
        "GL_DU8DV8_ATI"("0x877A")
        "GL_BUMP_ENVMAP_ATI"("0x877B")
        "GL_BUMP_TARGET_ATI"("0x877C")
        "glTexBumpParameterivATI"(void, GLenum("pname"), address("param", "const GLint *"))
        "glTexBumpParameterfvATI"(void, GLenum("pname"), address("param", "const GLfloat *"))
        "glGetTexBumpParameterivATI"(void, GLenum("pname"), address("param", "GLint *"))
        "glGetTexBumpParameterfvATI"(void, GLenum("pname"), address("param", "GLfloat *"))
    }
    file("FragmentShader", ATI, "GL_ATI_fragment_shader") {
        "GL_FRAGMENT_SHADER_ATI"("0x8920")
        "GL_REG_0_ATI"("0x8921")
        "GL_REG_1_ATI"("0x8922")
        "GL_REG_2_ATI"("0x8923")
        "GL_REG_3_ATI"("0x8924")
        "GL_REG_4_ATI"("0x8925")
        "GL_REG_5_ATI"("0x8926")
        "GL_REG_6_ATI"("0x8927")
        "GL_REG_7_ATI"("0x8928")
        "GL_REG_8_ATI"("0x8929")
        "GL_REG_9_ATI"("0x892A")
        "GL_REG_10_ATI"("0x892B")
        "GL_REG_11_ATI"("0x892C")
        "GL_REG_12_ATI"("0x892D")
        "GL_REG_13_ATI"("0x892E")
        "GL_REG_14_ATI"("0x892F")
        "GL_REG_15_ATI"("0x8930")
        "GL_REG_16_ATI"("0x8931")
        "GL_REG_17_ATI"("0x8932")
        "GL_REG_18_ATI"("0x8933")
        "GL_REG_19_ATI"("0x8934")
        "GL_REG_20_ATI"("0x8935")
        "GL_REG_21_ATI"("0x8936")
        "GL_REG_22_ATI"("0x8937")
        "GL_REG_23_ATI"("0x8938")
        "GL_REG_24_ATI"("0x8939")
        "GL_REG_25_ATI"("0x893A")
        "GL_REG_26_ATI"("0x893B")
        "GL_REG_27_ATI"("0x893C")
        "GL_REG_28_ATI"("0x893D")
        "GL_REG_29_ATI"("0x893E")
        "GL_REG_30_ATI"("0x893F")
        "GL_REG_31_ATI"("0x8940")
        "GL_CON_0_ATI"("0x8941")
        "GL_CON_1_ATI"("0x8942")
        "GL_CON_2_ATI"("0x8943")
        "GL_CON_3_ATI"("0x8944")
        "GL_CON_4_ATI"("0x8945")
        "GL_CON_5_ATI"("0x8946")
        "GL_CON_6_ATI"("0x8947")
        "GL_CON_7_ATI"("0x8948")
        "GL_CON_8_ATI"("0x8949")
        "GL_CON_9_ATI"("0x894A")
        "GL_CON_10_ATI"("0x894B")
        "GL_CON_11_ATI"("0x894C")
        "GL_CON_12_ATI"("0x894D")
        "GL_CON_13_ATI"("0x894E")
        "GL_CON_14_ATI"("0x894F")
        "GL_CON_15_ATI"("0x8950")
        "GL_CON_16_ATI"("0x8951")
        "GL_CON_17_ATI"("0x8952")
        "GL_CON_18_ATI"("0x8953")
        "GL_CON_19_ATI"("0x8954")
        "GL_CON_20_ATI"("0x8955")
        "GL_CON_21_ATI"("0x8956")
        "GL_CON_22_ATI"("0x8957")
        "GL_CON_23_ATI"("0x8958")
        "GL_CON_24_ATI"("0x8959")
        "GL_CON_25_ATI"("0x895A")
        "GL_CON_26_ATI"("0x895B")
        "GL_CON_27_ATI"("0x895C")
        "GL_CON_28_ATI"("0x895D")
        "GL_CON_29_ATI"("0x895E")
        "GL_CON_30_ATI"("0x895F")
        "GL_CON_31_ATI"("0x8960")
        "GL_MOV_ATI"("0x8961")
        "GL_ADD_ATI"("0x8963")
        "GL_MUL_ATI"("0x8964")
        "GL_SUB_ATI"("0x8965")
        "GL_DOT3_ATI"("0x8966")
        "GL_DOT4_ATI"("0x8967")
        "GL_MAD_ATI"("0x8968")
        "GL_LERP_ATI"("0x8969")
        "GL_CND_ATI"("0x896A")
        "GL_CND0_ATI"("0x896B")
        "GL_DOT2_ADD_ATI"("0x896C")
        "GL_SECONDARY_INTERPOLATOR_ATI"("0x896D")
        "GL_NUM_FRAGMENT_REGISTERS_ATI"("0x896E")
        "GL_NUM_FRAGMENT_CONSTANTS_ATI"("0x896F")
        "GL_NUM_PASSES_ATI"("0x8970")
        "GL_NUM_INSTRUCTIONS_PER_PASS_ATI"("0x8971")
        "GL_NUM_INSTRUCTIONS_TOTAL_ATI"("0x8972")
        "GL_NUM_INPUT_INTERPOLATOR_COMPONENTS_ATI"("0x8973")
        "GL_NUM_LOOPBACK_COMPONENTS_ATI"("0x8974")
        "GL_COLOR_ALPHA_PAIRING_ATI"("0x8975")
        "GL_SWIZZLE_STR_ATI"("0x8976")
        "GL_SWIZZLE_STQ_ATI"("0x8977")
        "GL_SWIZZLE_STR_DR_ATI"("0x8978")
        "GL_SWIZZLE_STQ_DQ_ATI"("0x8979")
        "GL_SWIZZLE_STRQ_ATI"("0x897A")
        "GL_SWIZZLE_STRQ_DQ_ATI"("0x897B")
        "GL_RED_BIT_ATI"("0x00000001")
        "GL_GREEN_BIT_ATI"("0x00000002")
        "GL_BLUE_BIT_ATI"("0x00000004")
        "GL_2X_BIT_ATI"("0x00000001")
        "GL_4X_BIT_ATI"("0x00000002")
        "GL_8X_BIT_ATI"("0x00000004")
        "GL_HALF_BIT_ATI"("0x00000008")
        "GL_QUARTER_BIT_ATI"("0x00000010")
        "GL_EIGHTH_BIT_ATI"("0x00000020")
        "GL_SATURATE_BIT_ATI"("0x00000040")
        "GL_COMP_BIT_ATI"("0x00000002")
        "GL_NEGATE_BIT_ATI"("0x00000004")
        "GL_BIAS_BIT_ATI"("0x00000008")
        "glGenFragmentShadersATI"(GLuint, GLuint("range"))
        "glBindFragmentShaderATI"(void, GLuint("id"))
        "glDeleteFragmentShaderATI"(void, GLuint("id"))
        "glBeginFragmentShaderATI"(void)
        "glEndFragmentShaderATI"(void)
        "glPassTexCoordATI"(void, GLuint("dst"), GLuint("coord"), GLenum("swizzle"))
        "glSampleMapATI"(void, GLuint("dst"), GLuint("interp"), GLenum("swizzle"))
        "glColorFragmentOp1ATI"(
            void,
            GLenum("op"),
            GLuint("dst"),
            GLuint("dstMask"),
            GLuint("dstMod"),
            GLuint("arg1"),
            GLuint("arg1Rep"),
            GLuint("arg1Mod")
        )
        "glColorFragmentOp2ATI"(
            void,
            GLenum("op"),
            GLuint("dst"),
            GLuint("dstMask"),
            GLuint("dstMod"),
            GLuint("arg1"),
            GLuint("arg1Rep"),
            GLuint("arg1Mod"),
            GLuint("arg2"),
            GLuint("arg2Rep"),
            GLuint("arg2Mod")
        )
        "glColorFragmentOp3ATI"(
            void,
            GLenum("op"),
            GLuint("dst"),
            GLuint("dstMask"),
            GLuint("dstMod"),
            GLuint("arg1"),
            GLuint("arg1Rep"),
            GLuint("arg1Mod"),
            GLuint("arg2"),
            GLuint("arg2Rep"),
            GLuint("arg2Mod"),
            GLuint("arg3"),
            GLuint("arg3Rep"),
            GLuint("arg3Mod")
        )
        "glAlphaFragmentOp1ATI"(
            void,
            GLenum("op"),
            GLuint("dst"),
            GLuint("dstMod"),
            GLuint("arg1"),
            GLuint("arg1Rep"),
            GLuint("arg1Mod")
        )
        "glAlphaFragmentOp2ATI"(
            void,
            GLenum("op"),
            GLuint("dst"),
            GLuint("dstMod"),
            GLuint("arg1"),
            GLuint("arg1Rep"),
            GLuint("arg1Mod"),
            GLuint("arg2"),
            GLuint("arg2Rep"),
            GLuint("arg2Mod")
        )
        "glAlphaFragmentOp3ATI"(
            void,
            GLenum("op"),
            GLuint("dst"),
            GLuint("dstMod"),
            GLuint("arg1"),
            GLuint("arg1Rep"),
            GLuint("arg1Mod"),
            GLuint("arg2"),
            GLuint("arg2Rep"),
            GLuint("arg2Mod"),
            GLuint("arg3"),
            GLuint("arg3Rep"),
            GLuint("arg3Mod")
        )
        "glSetFragmentShaderConstantATI"(void, GLuint("dst"), address("value", "const GLfloat *"))
    }
    file("MapObjectBuffer", ATI, "GL_ATI_map_object_buffer") {
        "glMapObjectBufferATI"(address, GLuint("buffer"), nativeType = "void*")
        "glUnmapObjectBufferATI"(void, GLuint("buffer"))
    }
    file(
        "Meminfo", ATI, "GL_ATI_meminfo",
        "GL_VBO_FREE_MEMORY_ATI" to "0x87FB",
        "GL_TEXTURE_FREE_MEMORY_ATI" to "0x87FC",
        "GL_RENDERBUFFER_FREE_MEMORY_ATI" to "0x87FD"
    )
    file(
        "PixelFormatFloat", ATI, "GL_ATI_pixel_format_float",
        "GL_RGBA_FLOAT_MODE_ATI" to "0x8820",
        "GL_COLOR_CLEAR_UNCLAMPED_VALUE_ATI" to "0x8835"
    )
    file("PnTriangles", ATI, "GL_ATI_pn_triangles") {
        "GL_PN_TRIANGLES_ATI"("0x87F0")
        "GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI"("0x87F1")
        "GL_PN_TRIANGLES_POINT_MODE_ATI"("0x87F2")
        "GL_PN_TRIANGLES_NORMAL_MODE_ATI"("0x87F3")
        "GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI"("0x87F4")
        "GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI"("0x87F5")
        "GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI"("0x87F6")
        "GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI"("0x87F7")
        "GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI"("0x87F8")
        "glPNTrianglesiATI"(void, GLenum("pname"), GLint("param"))
        "glPNTrianglesfATI"(void, GLenum("pname"), GLfloat("param"))
    }
    file("SeparateStencil", ATI, "GL_ATI_separate_stencil") {
        "GL_STENCIL_BACK_FUNC_ATI"("0x8800")
        "GL_STENCIL_BACK_FAIL_ATI"("0x8801")
        "GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI"("0x8802")
        "GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI"("0x8803")
        "glStencilOpSeparateATI"(void, GLenum("face"), GLenum("sfail"), GLenum("dpfail"), GLenum("dppass"))
        "glStencilFuncSeparateATI"(void, GLenum("frontfunc"), GLenum("backfunc"), GLint("ref"), GLuint("mask"))
    }
    file("TextFragmentShader", ATI, "GL_ATI_text_fragment_shader", "GL_TEXT_FRAGMENT_SHADER_ATI" to "0x8200")
    file(
        "TextureEnvCombine3", ATI, "GL_ATI_texture_env_combine3",
        "GL_MODULATE_ADD_ATI" to "0x8744",
        "GL_MODULATE_SIGNED_ADD_ATI" to "0x8745",
        "GL_MODULATE_SUBTRACT_ATI" to "0x8746"
    )
    file(
        "TextureFloat", ATI, "GL_ATI_texture_float",
        "GL_RGBA_FLOAT32_ATI" to "0x8814",
        "GL_RGB_FLOAT32_ATI" to "0x8815",
        "GL_ALPHA_FLOAT32_ATI" to "0x8816",
        "GL_INTENSITY_FLOAT32_ATI" to "0x8817",
        "GL_LUMINANCE_FLOAT32_ATI" to "0x8818",
        "GL_LUMINANCE_ALPHA_FLOAT32_ATI" to "0x8819",
        "GL_RGBA_FLOAT16_ATI" to "0x881A",
        "GL_RGB_FLOAT16_ATI" to "0x881B",
        "GL_ALPHA_FLOAT16_ATI" to "0x881C",
        "GL_INTENSITY_FLOAT16_ATI" to "0x881D",
        "GL_LUMINANCE_FLOAT16_ATI" to "0x881E",
        "GL_LUMINANCE_ALPHA_FLOAT16_ATI" to "0x881F"
    )
    file(
        "TextureMirrorOnce", ATI, "GL_ATI_texture_mirror_once",
        "GL_MIRROR_CLAMP_ATI" to "0x8742",
        "GL_MIRROR_CLAMP_TO_EDGE_ATI" to "0x8743"
    )
    file("VertexArrayObject", ATI, "GL_ATI_vertex_array_object") {
        "GL_STATIC_ATI"("0x8760")
        "GL_DYNAMIC_ATI"("0x8761")
        "GL_PRESERVE_ATI"("0x8762")
        "GL_DISCARD_ATI"("0x8763")
        "GL_OBJECT_BUFFER_SIZE_ATI"("0x8764")
        "GL_OBJECT_BUFFER_USAGE_ATI"("0x8765")
        "GL_ARRAY_OBJECT_BUFFER_ATI"("0x8766")
        "GL_ARRAY_OBJECT_OFFSET_ATI"("0x8767")
        "glNewObjectBufferATI"(GLuint, GLsizei("size"), address("pointer", "const void *"), GLenum("usage"))
        "glIsObjectBufferATI"(GLboolean, GLuint("buffer"))
        "glUpdateObjectBufferATI"(
            void,
            GLuint("buffer"),
            GLuint("offset"),
            GLsizei("size"),
            address("pointer", "const void *"),
            GLenum("preserve")
        )
        "glGetObjectBufferfvATI"(void, GLuint("buffer"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetObjectBufferivATI"(void, GLuint("buffer"), GLenum("pname"), address("params", "GLint *"))
        "glFreeObjectBufferATI"(void, GLuint("buffer"))
        "glArrayObjectATI"(
            void,
            GLenum("array"),
            GLint("size"),
            GLenum("type"),
            GLsizei("stride"),
            GLuint("buffer"),
            GLuint("offset")
        )
        "glGetArrayObjectfvATI"(void, GLenum("array"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetArrayObjectivATI"(void, GLenum("array"), GLenum("pname"), address("params", "GLint *"))
        "glVariantArrayObjectATI"(
            void,
            GLuint("id"),
            GLenum("type"),
            GLsizei("stride"),
            GLuint("buffer"),
            GLuint("offset")
        )
        "glGetVariantArrayObjectfvATI"(void, GLuint("id"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetVariantArrayObjectivATI"(void, GLuint("id"), GLenum("pname"), address("params", "GLint *"))
    }
    file("VertexAttribArrayObject", ATI, "GL_ATI_vertex_attrib_array_object") {
        "glVertexAttribArrayObjectATI"(
            void,
            GLuint("index"),
            GLint("size"),
            GLenum("type"),
            GLboolean("normalized"),
            GLsizei("stride"),
            GLuint("buffer"),
            GLuint("offset")
        )
        "glGetVertexAttribArrayObjectfvATI"(void, GLuint("index"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetVertexAttribArrayObjectivATI"(void, GLuint("index"), GLenum("pname"), address("params", "GLint *"))
    }
    file("VertexStreams", ATI, "GL_ATI_vertex_streams") {
        "GL_MAX_VERTEX_STREAMS_ATI"("0x876B")
        "GL_VERTEX_STREAM0_ATI"("0x876C")
        "GL_VERTEX_STREAM1_ATI"("0x876D")
        "GL_VERTEX_STREAM2_ATI"("0x876E")
        "GL_VERTEX_STREAM3_ATI"("0x876F")
        "GL_VERTEX_STREAM4_ATI"("0x8770")
        "GL_VERTEX_STREAM5_ATI"("0x8771")
        "GL_VERTEX_STREAM6_ATI"("0x8772")
        "GL_VERTEX_STREAM7_ATI"("0x8773")
        "GL_VERTEX_SOURCE_ATI"("0x8774")
        "glVertexStream1sATI"(void, GLenum("stream"), GLshort("x"))
        "glVertexStream1svATI"(void, GLenum("stream"), address("coords", "const GLshort *"))
        "glVertexStream1iATI"(void, GLenum("stream"), GLint("x"))
        "glVertexStream1ivATI"(void, GLenum("stream"), address("coords", "const GLint *"))
        "glVertexStream1fATI"(void, GLenum("stream"), GLfloat("x"))
        "glVertexStream1fvATI"(void, GLenum("stream"), address("coords", "const GLfloat *"))
        "glVertexStream1dATI"(void, GLenum("stream"), GLdouble("x"))
        "glVertexStream1dvATI"(void, GLenum("stream"), address("coords", "const GLdouble *"))
        "glVertexStream2sATI"(void, GLenum("stream"), GLshort("x"), GLshort("y"))
        "glVertexStream2svATI"(void, GLenum("stream"), address("coords", "const GLshort *"))
        "glVertexStream2iATI"(void, GLenum("stream"), GLint("x"), GLint("y"))
        "glVertexStream2ivATI"(void, GLenum("stream"), address("coords", "const GLint *"))
        "glVertexStream2fATI"(void, GLenum("stream"), GLfloat("x"), GLfloat("y"))
        "glVertexStream2fvATI"(void, GLenum("stream"), address("coords", "const GLfloat *"))
        "glVertexStream2dATI"(void, GLenum("stream"), GLdouble("x"), GLdouble("y"))
        "glVertexStream2dvATI"(void, GLenum("stream"), address("coords", "const GLdouble *"))
        "glVertexStream3sATI"(void, GLenum("stream"), GLshort("x"), GLshort("y"), GLshort("z"))
        "glVertexStream3svATI"(void, GLenum("stream"), address("coords", "const GLshort *"))
        "glVertexStream3iATI"(void, GLenum("stream"), GLint("x"), GLint("y"), GLint("z"))
        "glVertexStream3ivATI"(void, GLenum("stream"), address("coords", "const GLint *"))
        "glVertexStream3fATI"(void, GLenum("stream"), GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glVertexStream3fvATI"(void, GLenum("stream"), address("coords", "const GLfloat *"))
        "glVertexStream3dATI"(void, GLenum("stream"), GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glVertexStream3dvATI"(void, GLenum("stream"), address("coords", "const GLdouble *"))
        "glVertexStream4sATI"(void, GLenum("stream"), GLshort("x"), GLshort("y"), GLshort("z"), GLshort("w"))
        "glVertexStream4svATI"(void, GLenum("stream"), address("coords", "const GLshort *"))
        "glVertexStream4iATI"(void, GLenum("stream"), GLint("x"), GLint("y"), GLint("z"), GLint("w"))
        "glVertexStream4ivATI"(void, GLenum("stream"), address("coords", "const GLint *"))
        "glVertexStream4fATI"(void, GLenum("stream"), GLfloat("x"), GLfloat("y"), GLfloat("z"), GLfloat("w"))
        "glVertexStream4fvATI"(void, GLenum("stream"), address("coords", "const GLfloat *"))
        "glVertexStream4dATI"(void, GLenum("stream"), GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))
        "glVertexStream4dvATI"(void, GLenum("stream"), address("coords", "const GLdouble *"))
        "glNormalStream3bATI"(void, GLenum("stream"), GLbyte("nx"), GLbyte("ny"), GLbyte("nz"))
        "glNormalStream3bvATI"(void, GLenum("stream"), address("coords", "const GLbyte *"))
        "glNormalStream3sATI"(void, GLenum("stream"), GLshort("nx"), GLshort("ny"), GLshort("nz"))
        "glNormalStream3svATI"(void, GLenum("stream"), address("coords", "const GLshort *"))
        "glNormalStream3iATI"(void, GLenum("stream"), GLint("nx"), GLint("ny"), GLint("nz"))
        "glNormalStream3ivATI"(void, GLenum("stream"), address("coords", "const GLint *"))
        "glNormalStream3fATI"(void, GLenum("stream"), GLfloat("nx"), GLfloat("ny"), GLfloat("nz"))
        "glNormalStream3fvATI"(void, GLenum("stream"), address("coords", "const GLfloat *"))
        "glNormalStream3dATI"(void, GLenum("stream"), GLdouble("nx"), GLdouble("ny"), GLdouble("nz"))
        "glNormalStream3dvATI"(void, GLenum("stream"), address("coords", "const GLdouble *"))
        "glClientActiveVertexStreamATI"(void, GLenum("stream"))
        "glVertexBlendEnviATI"(void, GLenum("pname"), GLint("param"))
        "glVertexBlendEnvfATI"(void, GLenum("pname"), GLfloat("param"))
    }
}

fun gremedy() {
    file("FrameTerminator", GREMEDY, "GL_GREMEDY_frame_terminator") {
        "glFrameTerminatorGREMEDY"(void)
    }
    file("StringMarker", GREMEDY, "GL_GREMEDY_string_marker") {
        "glStringMarkerGREMEDY"(void, GLsizei("len"), address("string", "const void *"))
    }
}

fun hp() {
    file(
        "ConvolutionBorderModes", HP, "GL_HP_convolution_border_modes",
        "GL_IGNORE_BORDER_HP" to "0x8150",
        "GL_CONSTANT_BORDER_HP" to "0x8151",
        "GL_REPLICATE_BORDER_HP" to "0x8153",
        "GL_CONVOLUTION_BORDER_COLOR_HP" to "0x8154"
    )
    file("ImageTransform", HP, "GL_HP_image_transform") {
        "GL_IMAGE_SCALE_X_HP"("0x8155")
        "GL_IMAGE_SCALE_Y_HP"("0x8156")
        "GL_IMAGE_TRANSLATE_X_HP"("0x8157")
        "GL_IMAGE_TRANSLATE_Y_HP"("0x8158")
        "GL_IMAGE_ROTATE_ANGLE_HP"("0x8159")
        "GL_IMAGE_ROTATE_ORIGIN_X_HP"("0x815A")
        "GL_IMAGE_ROTATE_ORIGIN_Y_HP"("0x815B")
        "GL_IMAGE_MAG_FILTER_HP"("0x815C")
        "GL_IMAGE_MIN_FILTER_HP"("0x815D")
        "GL_IMAGE_CUBIC_WEIGHT_HP"("0x815E")
        "GL_CUBIC_HP"("0x815F")
        "GL_AVERAGE_HP"("0x8160")
        "GL_IMAGE_TRANSFORM_2D_HP"("0x8161")
        "GL_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP"("0x8162")
        "GL_PROXY_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP"("0x8163")
        "glImageTransformParameteriHP"(void, GLenum("target"), GLenum("pname"), GLint("param"))
        "glImageTransformParameterfHP"(void, GLenum("target"), GLenum("pname"), GLfloat("param"))
        "glImageTransformParameterivHP"(void, GLenum("target"), GLenum("pname"), address("params", "const GLint *"))
        "glImageTransformParameterfvHP"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfloat *"))
        "glGetImageTransformParameterivHP"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
        "glGetImageTransformParameterfvHP"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
    }
    file(
        "OcclusionTest", HP, "GL_HP_occlusion_test",
        "GL_OCCLUSION_TEST_HP" to "0x8165",
        "GL_OCCLUSION_TEST_RESULT_HP" to "0x8166"
    )
    file(
        "TextureLighting", HP, "GL_HP_texture_lighting",
        "GL_TEXTURE_LIGHTING_MODE_HP" to "0x8167",
        "GL_TEXTURE_POST_SPECULAR_HP" to "0x8168",
        "GL_TEXTURE_PRE_SPECULAR_HP" to "0x8169"
    )
}

fun ibm() {
    file("CullVertex", IBM, "GL_IBM_cull_vertex", "GL_CULL_VERTEX_IBM" to "103050")
    file("MultimodeDrawArrays", IBM, "GL_IBM_multimode_draw_arrays") {
        "glMultiModeDrawArraysIBM"(
            void,
            address("mode", "const GLenum *"),
            address("first", "const GLint *"),
            address("count", "const GLsizei *"),
            GLsizei("primcount"),
            GLint("modestride")
        )
        "glMultiModeDrawElementsIBM"(
            void,
            address("mode", "const GLenum *"),
            address("count", "const GLsizei *"),
            GLenum("type"),
            address("indices", "const void *const*"),
            GLsizei("primcount"),
            GLint("modestride")
        )
    }
    file("RasterposClip", IBM, "GL_IBM_rasterpos_clip", "GL_RASTER_POSITION_UNCLIPPED_IBM" to "0x19262")
    file("StaticData", IBM, "GL_IBM_static_data") {
        "GL_ALL_STATIC_DATA_IBM"("103060")
        "GL_STATIC_VERTEX_ARRAY_IBM"("103061")
        "glFlushStaticDataIBM"(void, GLenum("target"))
    }
    file("TextureMirroredRepeat", IBM, "GL_IBM_texture_mirrored_repeat", "GL_MIRRORED_REPEAT_IBM" to "0x8370")
    file("VertexArrayLists", IBM, "GL_IBM_vertex_array_lists") {
        "GL_VERTEX_ARRAY_LIST_IBM"("103070")
        "GL_NORMAL_ARRAY_LIST_IBM"("103071")
        "GL_COLOR_ARRAY_LIST_IBM"("103072")
        "GL_INDEX_ARRAY_LIST_IBM"("103073")
        "GL_TEXTURE_COORD_ARRAY_LIST_IBM"("103074")
        "GL_EDGE_FLAG_ARRAY_LIST_IBM"("103075")
        "GL_FOG_COORDINATE_ARRAY_LIST_IBM"("103076")
        "GL_SECONDARY_COLOR_ARRAY_LIST_IBM"("103077")
        "GL_VERTEX_ARRAY_LIST_STRIDE_IBM"("103080")
        "GL_NORMAL_ARRAY_LIST_STRIDE_IBM"("103081")
        "GL_COLOR_ARRAY_LIST_STRIDE_IBM"("103082")
        "GL_INDEX_ARRAY_LIST_STRIDE_IBM"("103083")
        "GL_TEXTURE_COORD_ARRAY_LIST_STRIDE_IBM"("103084")
        "GL_EDGE_FLAG_ARRAY_LIST_STRIDE_IBM"("103085")
        "GL_FOG_COORDINATE_ARRAY_LIST_STRIDE_IBM"("103086")
        "GL_SECONDARY_COLOR_ARRAY_LIST_STRIDE_IBM"("103087")
        "glColorPointerListIBM"(
            void,
            GLint("size"),
            GLenum("type"),
            GLint("stride"),
            address("pointer", "const void **"),
            GLint("ptrstride")
        )
        "glSecondaryColorPointerListIBM"(
            void,
            GLint("size"),
            GLenum("type"),
            GLint("stride"),
            address("pointer", "const void **"),
            GLint("ptrstride")
        )
        "glEdgeFlagPointerListIBM"(void, GLint("stride"), address("pointer", "const GLboolean **"), GLint("ptrstride"))
        "glFogCoordPointerListIBM"(
            void,
            GLenum("type"),
            GLint("stride"),
            address("pointer", "const void **"),
            GLint("ptrstride")
        )
        "glIndexPointerListIBM"(
            void,
            GLenum("type"),
            GLint("stride"),
            address("pointer", "const void **"),
            GLint("ptrstride")
        )
        "glNormalPointerListIBM"(
            void,
            GLenum("type"),
            GLint("stride"),
            address("pointer", "const void **"),
            GLint("ptrstride")
        )
        "glTexCoordPointerListIBM"(
            void,
            GLint("size"),
            GLenum("type"),
            GLint("stride"),
            address("pointer", "const void **"),
            GLint("ptrstride")
        )
        "glVertexPointerListIBM"(
            void,
            GLint("size"),
            GLenum("type"),
            GLint("stride"),
            address("pointer", "const void **"),
            GLint("ptrstride")
        )
    }
}

fun ingr() {
    file("BlendFuncSeparate", INGR, "GL_INGR_blend_func_separate") {
        "glBlendFuncSeparateINGR"(
            void,
            GLenum("sfactorRGB"),
            GLenum("dfactorRGB"),
            GLenum("sfactorAlpha"),
            GLenum("dfactorAlpha")
        )
    }
    file(
        "ColorClamp", INGR, "GL_INGR_color_clamp",
        "GL_RED_MIN_CLAMP_INGR" to "0x8560",
        "GL_GREEN_MIN_CLAMP_INGR" to "0x8561",
        "GL_BLUE_MIN_CLAMP_INGR" to "0x8562",
        "GL_ALPHA_MIN_CLAMP_INGR" to "0x8563",
        "GL_RED_MAX_CLAMP_INGR" to "0x8564",
        "GL_GREEN_MAX_CLAMP_INGR" to "0x8565",
        "GL_BLUE_MAX_CLAMP_INGR" to "0x8566",
        "GL_ALPHA_MAX_CLAMP_INGR" to "0x8567"
    )
    file("InterlaceRead", INGR, "GL_INGR_interlace_read", "GL_INTERLACE_READ_INGR" to "0x8568")
}

fun intel() {
    file("BlackholeRender", INTEL, "GL_INTEL_blackhole_render", "GL_BLACKHOLE_RENDER_INTEL" to "0x83FC")
    file("ConservativeRasterization", INTEL, "GL_INTEL_conservative_rasterization", "GL_CONSERVATIVE_RASTERIZATION_INTEL" to "0x83FE")
    file("FramebufferCMAA", INTEL, "GL_INTEL_framebuffer_CMAA") {
        "glApplyFramebufferAttachmentCMAAINTEL"(void)
    }
    file("MapTexture", INTEL, "GL_INTEL_map_texture") {
        "GL_TEXTURE_MEMORY_LAYOUT_INTEL"("0x83FF")
        "GL_LAYOUT_DEFAULT_INTEL"("0")
        "GL_LAYOUT_LINEAR_INTEL"("1")
        "GL_LAYOUT_LINEAR_CPU_CACHED_INTEL"("2")
        "glSyncTextureINTEL"(void, GLuint("texture"))
        "glUnmapTexture2DINTEL"(void, GLuint("texture"), GLint("level"))
        "glMapTexture2DINTEL"(
            address,
            GLuint("texture"),
            GLint("level"),
            GLbitfield("access"),
            address("stride", "GLint *"),
            address("layout", "GLenum *"),
            nativeType = "void*"
        )
    }
    file("ParallelArrays", INTEL, "GL_INTEL_parallel_arrays") {
        "GL_PARALLEL_ARRAYS_INTEL"("0x83F4")
        "GL_VERTEX_ARRAY_PARALLEL_POINTERS_INTEL"("0x83F5")
        "GL_NORMAL_ARRAY_PARALLEL_POINTERS_INTEL"("0x83F6")
        "GL_COLOR_ARRAY_PARALLEL_POINTERS_INTEL"("0x83F7")
        "GL_TEXTURE_COORD_ARRAY_PARALLEL_POINTERS_INTEL"("0x83F8")
        "glVertexPointervINTEL"(void, GLint("size"), GLenum("type"), address("pointer", "const void **"))
        "glNormalPointervINTEL"(void, GLenum("type"), address("pointer", "const void **"))
        "glColorPointervINTEL"(void, GLint("size"), GLenum("type"), address("pointer", "const void **"))
        "glTexCoordPointervINTEL"(void, GLint("size"), GLenum("type"), address("pointer", "const void **"))
    }
    file("PerformanceQuery", INTEL, "GL_INTEL_performance_query") {
        "GL_PERFQUERY_SINGLE_CONTEXT_INTEL"("0x00000000")
        "GL_PERFQUERY_GLOBAL_CONTEXT_INTEL"("0x00000001")
        "GL_PERFQUERY_WAIT_INTEL"("0x83FB")
        "GL_PERFQUERY_FLUSH_INTEL"("0x83FA")
        "GL_PERFQUERY_DONOT_FLUSH_INTEL"("0x83F9")
        "GL_PERFQUERY_COUNTER_EVENT_INTEL"("0x94F0")
        "GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL"("0x94F1")
        "GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL"("0x94F2")
        "GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL"("0x94F3")
        "GL_PERFQUERY_COUNTER_RAW_INTEL"("0x94F4")
        "GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL"("0x94F5")
        "GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL"("0x94F8")
        "GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL"("0x94F9")
        "GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL"("0x94FA")
        "GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL"("0x94FB")
        "GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL"("0x94FC")
        "GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL"("0x94FD")
        "GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL"("0x94FE")
        "GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL"("0x94FF")
        "GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL"("0x9500")
        "glBeginPerfQueryINTEL"(void, GLuint("queryHandle"))
        "glCreatePerfQueryINTEL"(void, GLuint("queryId"), address("queryHandle", "GLuint *"))
        "glDeletePerfQueryINTEL"(void, GLuint("queryHandle"))
        "glEndPerfQueryINTEL"(void, GLuint("queryHandle"))
        "glGetFirstPerfQueryIdINTEL"(void, address("queryId", "GLuint *"))
        "glGetNextPerfQueryIdINTEL"(void, GLuint("queryId"), address("nextQueryId", "GLuint *"))
        "glGetPerfCounterInfoINTEL"(
            void,
            GLuint("queryId"),
            GLuint("counterId"),
            GLuint("counterNameLength"),
            address("counterName", "GLchar *"),
            GLuint("counterDescLength"),
            address("counterDesc", "GLchar *"),
            address("counterOffset", "GLuint *"),
            address("counterDataSize", "GLuint *"),
            address("counterTypeEnum", "GLuint *"),
            address("counterDataTypeEnum", "GLuint *"),
            address("rawCounterMaxValue", "GLuint64 *")
        )
        "glGetPerfQueryDataINTEL"(
            void,
            GLuint("queryHandle"),
            GLuint("flags"),
            GLsizei("dataSize"),
            address("data", "void *"),
            address("bytesWritten", "GLuint *")
        )
        "glGetPerfQueryIdByNameINTEL"(void, address("queryName", "GLchar *"), address("queryId", "GLuint *"))
        "glGetPerfQueryInfoINTEL"(
            void,
            GLuint("queryId"),
            GLuint("queryNameLength"),
            address("queryName", "GLchar *"),
            address("dataSize", "GLuint *"),
            address("noCounters", "GLuint *"),
            address("noInstances", "GLuint *"),
            address("capsMask", "GLuint *")
        )
    }
}

fun mesa() {
    file(
        "TextureStack", MESAX, "GL_MESAX_texture_stack",
        "GL_TEXTURE_1D_STACK_MESAX" to "0x8759",
        "GL_TEXTURE_2D_STACK_MESAX" to "0x875A",
        "GL_PROXY_TEXTURE_1D_STACK_MESAX" to "0x875B",
        "GL_PROXY_TEXTURE_2D_STACK_MESAX" to "0x875C",
        "GL_TEXTURE_1D_STACK_BINDING_MESAX" to "0x875D",
        "GL_TEXTURE_2D_STACK_BINDING_MESAX" to "0x875E"
    )
    file("FramebufferFlipX", MESA, "GL_MESA_framebuffer_flip_x", "GL_FRAMEBUFFER_FLIP_X_MESA" to "0x8BBC")
    file("FramebufferFlipY", MESA, "GL_MESA_framebuffer_flip_y") {
        "GL_FRAMEBUFFER_FLIP_Y_MESA"("0x8BBB")
        "glFramebufferParameteriMESA"(void, GLenum("target"), GLenum("pname"), GLint("param"))
        "glGetFramebufferParameterivMESA"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
    }
    file("FramebufferSwapXY", MESA, "GL_MESA_framebuffer_swap_xy", "GL_FRAMEBUFFER_SWAP_XY_MESA" to "0x8BBD")
    file("PackInvert", MESA, "GL_MESA_pack_invert", "GL_PACK_INVERT_MESA" to "0x8758")
    file("ProgramBinaryFormats", MESA, "GL_MESA_program_binary_formats", "GL_PROGRAM_BINARY_FORMAT_MESA" to "0x875F")
    file("ResizeBuffers", MESA, "GL_MESA_resize_buffers") {
        "glResizeBuffersMESA"(void)
    }
    file(
        "TileRasterOrder", MESA, "GL_MESA_tile_raster_order",
        "GL_TILE_RASTER_ORDER_FIXED_MESA" to "0x8BB8",
        "GL_TILE_RASTER_ORDER_INCREASING_X_MESA" to "0x8BB9",
        "GL_TILE_RASTER_ORDER_INCREASING_Y_MESA" to "0x8BBA"
    )
    file("WindowPos", MESA, "GL_MESA_window_pos") {
        "glWindowPos2dMESA"(void, GLdouble("x"), GLdouble("y"))
        "glWindowPos2dvMESA"(void, address("v", "const GLdouble *"))
        "glWindowPos2fMESA"(void, GLfloat("x"), GLfloat("y"))
        "glWindowPos2fvMESA"(void, address("v", "const GLfloat *"))
        "glWindowPos2iMESA"(void, GLint("x"), GLint("y"))
        "glWindowPos2ivMESA"(void, address("v", "const GLint *"))
        "glWindowPos2sMESA"(void, GLshort("x"), GLshort("y"))
        "glWindowPos2svMESA"(void, address("v", "const GLshort *"))
        "glWindowPos3dMESA"(void, GLdouble("x"), GLdouble("y"), GLdouble("z"))
        "glWindowPos3dvMESA"(void, address("v", "const GLdouble *"))
        "glWindowPos3fMESA"(void, GLfloat("x"), GLfloat("y"), GLfloat("z"))
        "glWindowPos3fvMESA"(void, address("v", "const GLfloat *"))
        "glWindowPos3iMESA"(void, GLint("x"), GLint("y"), GLint("z"))
        "glWindowPos3ivMESA"(void, address("v", "const GLint *"))
        "glWindowPos3sMESA"(void, GLshort("x"), GLshort("y"), GLshort("z"))
        "glWindowPos3svMESA"(void, address("v", "const GLshort *"))
        "glWindowPos4dMESA"(void, GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))
        "glWindowPos4dvMESA"(void, address("v", "const GLdouble *"))
        "glWindowPos4fMESA"(void, GLfloat("x"), GLfloat("y"), GLfloat("z"), GLfloat("w"))
        "glWindowPos4fvMESA"(void, address("v", "const GLfloat *"))
        "glWindowPos4iMESA"(void, GLint("x"), GLint("y"), GLint("z"), GLint("w"))
        "glWindowPos4ivMESA"(void, address("v", "const GLint *"))
        "glWindowPos4sMESA"(void, GLshort("x"), GLshort("y"), GLshort("z"), GLshort("w"))
        "glWindowPos4svMESA"(void, address("v", "const GLshort *"))
    }
    file(
        "YcbcrTexture", MESA, "GL_MESA_ycbcr_texture",
        "GL_UNSIGNED_SHORT_8_8_MESA" to "0x85BA",
        "GL_UNSIGNED_SHORT_8_8_REV_MESA" to "0x85BB",
        "GL_YCBCR_MESA" to "0x8757"
    )
}

fun oml() {
    file(
        "Interlace", OML, "GL_OML_interlace",
        "GL_INTERLACE_OML" to "0x8980",
        "GL_INTERLACE_READ_OML" to "0x8981"
    )
    file(
        "Resample", OML, "GL_OML_resample",
        "GL_PACK_RESAMPLE_OML" to "0x8984",
        "GL_UNPACK_RESAMPLE_OML" to "0x8985",
        "GL_RESAMPLE_REPLICATE_OML" to "0x8986",
        "GL_RESAMPLE_ZERO_FILL_OML" to "0x8987",
        "GL_RESAMPLE_AVERAGE_OML" to "0x8988",
        "GL_RESAMPLE_DECIMATE_OML" to "0x8989"
    )
    file(
        "Subsample", OML, "GL_OML_subsample",
        "GL_FORMAT_SUBSAMPLE_24_24_OML" to "0x8982",
        "GL_FORMAT_SUBSAMPLE_244_244_OML" to "0x8983"
    )
}

fun ovr() {
    file("Multiview", OVR, "GL_OVR_multiview") {
        "GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR"("0x9630")
        "GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR"("0x9632")
        "GL_MAX_VIEWS_OVR"("0x9631")
        "GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR"("0x9633")
        "glFramebufferTextureMultiviewOVR"(
            void,
            GLenum("target"),
            GLenum("attachment"),
            GLuint("texture"),
            GLint("level"),
            GLint("baseViewIndex"),
            GLsizei("numViews")
        )
    }
}

fun pgi() {
    file("MiscHints", PGI, "GL_PGI_misc_hints") {
        "GL_PREFER_DOUBLEBUFFER_HINT_PGI"("0x1A1F8")
        "GL_CONSERVE_MEMORY_HINT_PGI"("0x1A1FD")
        "GL_RECLAIM_MEMORY_HINT_PGI"("0x1A1FE")
        "GL_NATIVE_GRAPHICS_HANDLE_PGI"("0x1A202")
        "GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI"("0x1A203")
        "GL_NATIVE_GRAPHICS_END_HINT_PGI"("0x1A204")
        "GL_ALWAYS_FAST_HINT_PGI"("0x1A20C")
        "GL_ALWAYS_SOFT_HINT_PGI"("0x1A20D")
        "GL_ALLOW_DRAW_OBJ_HINT_PGI"("0x1A20E")
        "GL_ALLOW_DRAW_WIN_HINT_PGI"("0x1A20F")
        "GL_ALLOW_DRAW_FRG_HINT_PGI"("0x1A210")
        "GL_ALLOW_DRAW_MEM_HINT_PGI"("0x1A211")
        "GL_STRICT_DEPTHFUNC_HINT_PGI"("0x1A216")
        "GL_STRICT_LIGHTING_HINT_PGI"("0x1A217")
        "GL_STRICT_SCISSOR_HINT_PGI"("0x1A218")
        "GL_FULL_STIPPLE_HINT_PGI"("0x1A219")
        "GL_CLIP_NEAR_HINT_PGI"("0x1A220")
        "GL_CLIP_FAR_HINT_PGI"("0x1A221")
        "GL_WIDE_LINE_HINT_PGI"("0x1A222")
        "GL_BACK_NORMALS_HINT_PGI"("0x1A223")
        "glHintPGI"(void, GLenum("target"), GLint("mode"))
    }
    file(
        "VertexHints", PGI, "GL_PGI_vertex_hints",
        "GL_VERTEX_DATA_HINT_PGI" to "0x1A22A",
        "GL_VERTEX_CONSISTENT_HINT_PGI" to "0x1A22B",
        "GL_MATERIAL_SIDE_HINT_PGI" to "0x1A22C",
        "GL_MAX_VERTEX_HINT_PGI" to "0x1A22D",
        "GL_COLOR3_BIT_PGI" to "0x00010000",
        "GL_COLOR4_BIT_PGI" to "0x00020000",
        "GL_EDGEFLAG_BIT_PGI" to "0x00040000",
        "GL_INDEX_BIT_PGI" to "0x00080000",
        "GL_MAT_AMBIENT_BIT_PGI" to "0x00100000",
        "GL_MAT_AMBIENT_AND_DIFFUSE_BIT_PGI" to "0x00200000",
        "GL_MAT_DIFFUSE_BIT_PGI" to "0x00400000",
        "GL_MAT_EMISSION_BIT_PGI" to "0x00800000",
        "GL_MAT_COLOR_INDEXES_BIT_PGI" to "0x01000000",
        "GL_MAT_SHININESS_BIT_PGI" to "0x02000000",
        "GL_MAT_SPECULAR_BIT_PGI" to "0x04000000",
        "GL_NORMAL_BIT_PGI" to "0x08000000",
        "GL_TEXCOORD1_BIT_PGI" to "0x10000000",
        "GL_TEXCOORD2_BIT_PGI" to "0x20000000",
        "GL_TEXCOORD3_BIT_PGI" to "0x40000000",
        "GL_TEXCOORD4_BIT_PGI" to "0x80000000",
        "GL_VERTEX23_BIT_PGI" to "0x00000004",
        "GL_VERTEX4_BIT_PGI" to "0x00000008"
    )
}

fun rend() {
    file(
        "ScreenCoordinates", REND, "GL_REND_screen_coordinates",
        "GL_SCREEN_COORDINATES_REND" to "0x8490",
        "GL_INVERTED_SCREEN_W_REND" to "0x8491"
    )
}

fun s3() {
    file(
        "S3tc", S3, "GL_S3_s3tc",
        "GL_RGB_S3TC" to "0x83A0",
        "GL_RGB4_S3TC" to "0x83A1",
        "GL_RGBA_S3TC" to "0x83A2",
        "GL_RGBA4_S3TC" to "0x83A3",
        "GL_RGBA_DXT5_S3TC" to "0x83A4",
        "GL_RGBA4_DXT5_S3TC" to "0x83A5"
    )
}

fun sgi() {
    file("DetailTexture", SGIS, "GL_SGIS_detail_texture") {
        "GL_DETAIL_TEXTURE_2D_SGIS"("0x8095")
        "GL_DETAIL_TEXTURE_2D_BINDING_SGIS"("0x8096")
        "GL_LINEAR_DETAIL_SGIS"("0x8097")
        "GL_LINEAR_DETAIL_ALPHA_SGIS"("0x8098")
        "GL_LINEAR_DETAIL_COLOR_SGIS"("0x8099")
        "GL_DETAIL_TEXTURE_LEVEL_SGIS"("0x809A")
        "GL_DETAIL_TEXTURE_MODE_SGIS"("0x809B")
        "GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS"("0x809C")
        "glDetailTexFuncSGIS"(void, GLenum("target"), GLsizei("n"), address("points", "const GLfloat *"))
        "glGetDetailTexFuncSGIS"(void, GLenum("target"), address("points", "GLfloat *"))
    }
    file("FogFunction", SGIS, "GL_SGIS_fog_function") {
        "GL_FOG_FUNC_SGIS"("0x812A")
        "GL_FOG_FUNC_POINTS_SGIS"("0x812B")
        "GL_MAX_FOG_FUNC_POINTS_SGIS"("0x812C")
        "glFogFuncSGIS"(void, GLsizei("n"), address("points", "const GLfloat *"))
        "glGetFogFuncSGIS"(void, address("points", "GLfloat *"))
    }
    file(
        "GenerateMipmap", SGIS, "GL_SGIS_generate_mipmap",
        "GL_GENERATE_MIPMAP_SGIS" to "0x8191",
        "GL_GENERATE_MIPMAP_HINT_SGIS" to "0x8192"
    )
    file("Multisample", SGIS, "GL_SGIS_multisample") {
        "GL_MULTISAMPLE_SGIS"("0x809D")
        "GL_SAMPLE_ALPHA_TO_MASK_SGIS"("0x809E")
        "GL_SAMPLE_ALPHA_TO_ONE_SGIS"("0x809F")
        "GL_SAMPLE_MASK_SGIS"("0x80A0")
        "GL_1PASS_SGIS"("0x80A1")
        "GL_2PASS_0_SGIS"("0x80A2")
        "GL_2PASS_1_SGIS"("0x80A3")
        "GL_4PASS_0_SGIS"("0x80A4")
        "GL_4PASS_1_SGIS"("0x80A5")
        "GL_4PASS_2_SGIS"("0x80A6")
        "GL_4PASS_3_SGIS"("0x80A7")
        "GL_SAMPLE_BUFFERS_SGIS"("0x80A8")
        "GL_SAMPLES_SGIS"("0x80A9")
        "GL_SAMPLE_MASK_VALUE_SGIS"("0x80AA")
        "GL_SAMPLE_MASK_INVERT_SGIS"("0x80AB")
        "GL_SAMPLE_PATTERN_SGIS"("0x80AC")
        "glSampleMaskSGIS"(void, GLclampf("value"), GLboolean("invert"))
        "glSamplePatternSGIS"(void, GLenum("pattern"))
    }
    file("PixelTexture", SGIS, "GL_SGIS_pixel_texture") {
        "GL_PIXEL_TEXTURE_SGIS"("0x8353")
        "GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS"("0x8354")
        "GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS"("0x8355")
        "GL_PIXEL_GROUP_COLOR_SGIS"("0x8356")
        "glPixelTexGenParameteriSGIS"(void, GLenum("pname"), GLint("param"))
        "glPixelTexGenParameterivSGIS"(void, GLenum("pname"), address("params", "const GLint *"))
        "glPixelTexGenParameterfSGIS"(void, GLenum("pname"), GLfloat("param"))
        "glPixelTexGenParameterfvSGIS"(void, GLenum("pname"), address("params", "const GLfloat *"))
        "glGetPixelTexGenParameterivSGIS"(void, GLenum("pname"), address("params", "GLint *"))
        "glGetPixelTexGenParameterfvSGIS"(void, GLenum("pname"), address("params", "GLfloat *"))
    }
    file(
        "PointLineTexgen", SGIS, "GL_SGIS_point_line_texgen",
        "GL_EYE_DISTANCE_TO_POINT_SGIS" to "0x81F0",
        "GL_OBJECT_DISTANCE_TO_POINT_SGIS" to "0x81F1",
        "GL_EYE_DISTANCE_TO_LINE_SGIS" to "0x81F2",
        "GL_OBJECT_DISTANCE_TO_LINE_SGIS" to "0x81F3",
        "GL_EYE_POINT_SGIS" to "0x81F4",
        "GL_OBJECT_POINT_SGIS" to "0x81F5",
        "GL_EYE_LINE_SGIS" to "0x81F6",
        "GL_OBJECT_LINE_SGIS" to "0x81F7"
    )
    file("PointParameters", SGIS, "GL_SGIS_point_parameters") {
        "GL_POINT_SIZE_MIN_SGIS"("0x8126")
        "GL_POINT_SIZE_MAX_SGIS"("0x8127")
        "GL_POINT_FADE_THRESHOLD_SIZE_SGIS"("0x8128")
        "GL_DISTANCE_ATTENUATION_SGIS"("0x8129")
        "glPointParameterfSGIS"(void, GLenum("pname"), GLfloat("param"))
        "glPointParameterfvSGIS"(void, GLenum("pname"), address("params", "const GLfloat *"))
    }
    file("SharpenTexture", SGIS, "GL_SGIS_sharpen_texture") {
        "GL_LINEAR_SHARPEN_SGIS"("0x80AD")
        "GL_LINEAR_SHARPEN_ALPHA_SGIS"("0x80AE")
        "GL_LINEAR_SHARPEN_COLOR_SGIS"("0x80AF")
        "GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS"("0x80B0")
        "glSharpenTexFuncSGIS"(void, GLenum("target"), GLsizei("n"), address("points", "const GLfloat *"))
        "glGetSharpenTexFuncSGIS"(void, GLenum("target"), address("points", "GLfloat *"))
    }
    file("Texture4D", SGIS, "GL_SGIS_texture4D") {
        "GL_PACK_SKIP_VOLUMES_SGIS"("0x8130")
        "GL_PACK_IMAGE_DEPTH_SGIS"("0x8131")
        "GL_UNPACK_SKIP_VOLUMES_SGIS"("0x8132")
        "GL_UNPACK_IMAGE_DEPTH_SGIS"("0x8133")
        "GL_TEXTURE_4D_SGIS"("0x8134")
        "GL_PROXY_TEXTURE_4D_SGIS"("0x8135")
        "GL_TEXTURE_4DSIZE_SGIS"("0x8136")
        "GL_TEXTURE_WRAP_Q_SGIS"("0x8137")
        "GL_MAX_4D_TEXTURE_SIZE_SGIS"("0x8138")
        "GL_TEXTURE_4D_BINDING_SGIS"("0x814F")
        "glTexImage4DSGIS"(
            void,
            GLenum("target"),
            GLint("level"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLsizei("size4d"),
            GLint("border"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
        "glTexSubImage4DSGIS"(
            void,
            GLenum("target"),
            GLint("level"),
            GLint("xoffset"),
            GLint("yoffset"),
            GLint("zoffset"),
            GLint("woffset"),
            GLsizei("width"),
            GLsizei("height"),
            GLsizei("depth"),
            GLsizei("size4d"),
            GLenum("format"),
            GLenum("type"),
            address("pixels", "const void *")
        )
    }
    file("TextureBorderClamp", SGIS, "GL_SGIS_texture_border_clamp", "GL_CLAMP_TO_BORDER_SGIS" to "0x812D")
    file("TextureColorMask", SGIS, "GL_SGIS_texture_color_mask") {
        "GL_TEXTURE_COLOR_WRITEMASK_SGIS"("0x81EF")
        "glTextureColorMaskSGIS"(void, GLboolean("red"), GLboolean("green"), GLboolean("blue"), GLboolean("alpha"))
    }
    file("TextureEdgeClamp", SGIS, "GL_SGIS_texture_edge_clamp", "GL_CLAMP_TO_EDGE_SGIS" to "0x812F")
    file("TextureFilter4", SGIS, "GL_SGIS_texture_filter4") {
        "GL_FILTER4_SGIS"("0x8146")
        "GL_TEXTURE_FILTER4_SIZE_SGIS"("0x8147")
        "glGetTexFilterFuncSGIS"(void, GLenum("target"), GLenum("filter"), address("weights", "GLfloat *"))
        "glTexFilterFuncSGIS"(
            void,
            GLenum("target"),
            GLenum("filter"),
            GLsizei("n"),
            address("weights", "const GLfloat *")
        )
    }
    file(
        "TextureLod", SGIS, "GL_SGIS_texture_lod",
        "GL_TEXTURE_MIN_LOD_SGIS" to "0x813A",
        "GL_TEXTURE_MAX_LOD_SGIS" to "0x813B",
        "GL_TEXTURE_BASE_LEVEL_SGIS" to "0x813C",
        "GL_TEXTURE_MAX_LEVEL_SGIS" to "0x813D"
    )
    file(
        "TextureSelect", SGIS, "GL_SGIS_texture_select",
        "GL_DUAL_ALPHA4_SGIS" to "0x8110",
        "GL_DUAL_ALPHA8_SGIS" to "0x8111",
        "GL_DUAL_ALPHA12_SGIS" to "0x8112",
        "GL_DUAL_ALPHA16_SGIS" to "0x8113",
        "GL_DUAL_LUMINANCE4_SGIS" to "0x8114",
        "GL_DUAL_LUMINANCE8_SGIS" to "0x8115",
        "GL_DUAL_LUMINANCE12_SGIS" to "0x8116",
        "GL_DUAL_LUMINANCE16_SGIS" to "0x8117",
        "GL_DUAL_INTENSITY4_SGIS" to "0x8118",
        "GL_DUAL_INTENSITY8_SGIS" to "0x8119",
        "GL_DUAL_INTENSITY12_SGIS" to "0x811A",
        "GL_DUAL_INTENSITY16_SGIS" to "0x811B",
        "GL_DUAL_LUMINANCE_ALPHA4_SGIS" to "0x811C",
        "GL_DUAL_LUMINANCE_ALPHA8_SGIS" to "0x811D",
        "GL_QUAD_ALPHA4_SGIS" to "0x811E",
        "GL_QUAD_ALPHA8_SGIS" to "0x811F",
        "GL_QUAD_LUMINANCE4_SGIS" to "0x8120",
        "GL_QUAD_LUMINANCE8_SGIS" to "0x8121",
        "GL_QUAD_INTENSITY4_SGIS" to "0x8122",
        "GL_QUAD_INTENSITY8_SGIS" to "0x8123",
        "GL_DUAL_TEXTURE_SELECT_SGIS" to "0x8124",
        "GL_QUAD_TEXTURE_SELECT_SGIS" to "0x8125"
    )
    file("Async", SGIX, "GL_SGIX_async") {
        "GL_ASYNC_MARKER_SGIX"("0x8329")
        "glAsyncMarkerSGIX"(void, GLuint("marker"))
        "glFinishAsyncSGIX"(GLint, address("markerp", "GLuint *"))
        "glPollAsyncSGIX"(GLint, address("markerp", "GLuint *"))
        "glGenAsyncMarkersSGIX"(GLuint, GLsizei("range"))
        "glDeleteAsyncMarkersSGIX"(void, GLuint("marker"), GLsizei("range"))
        "glIsAsyncMarkerSGIX"(GLboolean, GLuint("marker"))
    }
    file(
        "AsyncHistogram", SGIX, "GL_SGIX_async_histogram",
        "GL_ASYNC_HISTOGRAM_SGIX" to "0x832C",
        "GL_MAX_ASYNC_HISTOGRAM_SGIX" to "0x832D"
    )
    file(
        "AsyncPixel", SGIX, "GL_SGIX_async_pixel",
        "GL_ASYNC_TEX_IMAGE_SGIX" to "0x835C",
        "GL_ASYNC_DRAW_PIXELS_SGIX" to "0x835D",
        "GL_ASYNC_READ_PIXELS_SGIX" to "0x835E",
        "GL_MAX_ASYNC_TEX_IMAGE_SGIX" to "0x835F",
        "GL_MAX_ASYNC_DRAW_PIXELS_SGIX" to "0x8360",
        "GL_MAX_ASYNC_READ_PIXELS_SGIX" to "0x8361"
    )
    file(
        "BlendAlphaMinmax", SGIX, "GL_SGIX_blend_alpha_minmax",
        "GL_ALPHA_MIN_SGIX" to "0x8320",
        "GL_ALPHA_MAX_SGIX" to "0x8321"
    )
    file("CalligraphicFragment", SGIX, "GL_SGIX_calligraphic_fragment", "GL_CALLIGRAPHIC_FRAGMENT_SGIX" to "0x8183")
    file(
        "Clipmap", SGIX, "GL_SGIX_clipmap",
        "GL_LINEAR_CLIPMAP_LINEAR_SGIX" to "0x8170",
        "GL_TEXTURE_CLIPMAP_CENTER_SGIX" to "0x8171",
        "GL_TEXTURE_CLIPMAP_FRAME_SGIX" to "0x8172",
        "GL_TEXTURE_CLIPMAP_OFFSET_SGIX" to "0x8173",
        "GL_TEXTURE_CLIPMAP_VIRTUAL_DEPTH_SGIX" to "0x8174",
        "GL_TEXTURE_CLIPMAP_LOD_OFFSET_SGIX" to "0x8175",
        "GL_TEXTURE_CLIPMAP_DEPTH_SGIX" to "0x8176",
        "GL_MAX_CLIPMAP_DEPTH_SGIX" to "0x8177",
        "GL_MAX_CLIPMAP_VIRTUAL_DEPTH_SGIX" to "0x8178",
        "GL_NEAREST_CLIPMAP_NEAREST_SGIX" to "0x844D",
        "GL_NEAREST_CLIPMAP_LINEAR_SGIX" to "0x844E",
        "GL_LINEAR_CLIPMAP_NEAREST_SGIX" to "0x844F"
    )
    file("ConvolutionAccuracy", SGIX, "GL_SGIX_convolution_accuracy", "GL_CONVOLUTION_HINT_SGIX" to "0x8316")
    file(
        "DepthTexture", SGIX, "GL_SGIX_depth_texture",
        "GL_DEPTH_COMPONENT16_SGIX" to "0x81A5",
        "GL_DEPTH_COMPONENT24_SGIX" to "0x81A6",
        "GL_DEPTH_COMPONENT32_SGIX" to "0x81A7"
    )
    file("FlushRaster", SGIX, "GL_SGIX_flush_raster") {
        "glFlushRasterSGIX"(void)
    }
    file(
        "FogOffset", SGIX, "GL_SGIX_fog_offset",
        "GL_FOG_OFFSET_SGIX" to "0x8198",
        "GL_FOG_OFFSET_VALUE_SGIX" to "0x8199"
    )
    file("FragmentLighting", SGIX, "GL_SGIX_fragment_lighting") {
        "GL_FRAGMENT_LIGHTING_SGIX"("0x8400")
        "GL_FRAGMENT_COLOR_MATERIAL_SGIX"("0x8401")
        "GL_FRAGMENT_COLOR_MATERIAL_FACE_SGIX"("0x8402")
        "GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_SGIX"("0x8403")
        "GL_MAX_FRAGMENT_LIGHTS_SGIX"("0x8404")
        "GL_MAX_ACTIVE_LIGHTS_SGIX"("0x8405")
        "GL_CURRENT_RASTER_NORMAL_SGIX"("0x8406")
        "GL_LIGHT_ENV_MODE_SGIX"("0x8407")
        "GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_SGIX"("0x8408")
        "GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_SGIX"("0x8409")
        "GL_FRAGMENT_LIGHT_MODEL_AMBIENT_SGIX"("0x840A")
        "GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_SGIX"("0x840B")
        "GL_FRAGMENT_LIGHT0_SGIX"("0x840C")
        "GL_FRAGMENT_LIGHT1_SGIX"("0x840D")
        "GL_FRAGMENT_LIGHT2_SGIX"("0x840E")
        "GL_FRAGMENT_LIGHT3_SGIX"("0x840F")
        "GL_FRAGMENT_LIGHT4_SGIX"("0x8410")
        "GL_FRAGMENT_LIGHT5_SGIX"("0x8411")
        "GL_FRAGMENT_LIGHT6_SGIX"("0x8412")
        "GL_FRAGMENT_LIGHT7_SGIX"("0x8413")
        "glFragmentColorMaterialSGIX"(void, GLenum("face"), GLenum("mode"))
        "glFragmentLightfSGIX"(void, GLenum("light"), GLenum("pname"), GLfloat("param"))
        "glFragmentLightfvSGIX"(void, GLenum("light"), GLenum("pname"), address("params", "const GLfloat *"))
        "glFragmentLightiSGIX"(void, GLenum("light"), GLenum("pname"), GLint("param"))
        "glFragmentLightivSGIX"(void, GLenum("light"), GLenum("pname"), address("params", "const GLint *"))
        "glFragmentLightModelfSGIX"(void, GLenum("pname"), GLfloat("param"))
        "glFragmentLightModelfvSGIX"(void, GLenum("pname"), address("params", "const GLfloat *"))
        "glFragmentLightModeliSGIX"(void, GLenum("pname"), GLint("param"))
        "glFragmentLightModelivSGIX"(void, GLenum("pname"), address("params", "const GLint *"))
        "glFragmentMaterialfSGIX"(void, GLenum("face"), GLenum("pname"), GLfloat("param"))
        "glFragmentMaterialfvSGIX"(void, GLenum("face"), GLenum("pname"), address("params", "const GLfloat *"))
        "glFragmentMaterialiSGIX"(void, GLenum("face"), GLenum("pname"), GLint("param"))
        "glFragmentMaterialivSGIX"(void, GLenum("face"), GLenum("pname"), address("params", "const GLint *"))
        "glGetFragmentLightfvSGIX"(void, GLenum("light"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetFragmentLightivSGIX"(void, GLenum("light"), GLenum("pname"), address("params", "GLint *"))
        "glGetFragmentMaterialfvSGIX"(void, GLenum("face"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetFragmentMaterialivSGIX"(void, GLenum("face"), GLenum("pname"), address("params", "GLint *"))
        "glLightEnviSGIX"(void, GLenum("pname"), GLint("param"))
    }
    file("Framezoom", SGIX, "GL_SGIX_framezoom") {
        "GL_FRAMEZOOM_SGIX"("0x818B")
        "GL_FRAMEZOOM_FACTOR_SGIX"("0x818C")
        "GL_MAX_FRAMEZOOM_FACTOR_SGIX"("0x818D")
        "glFrameZoomSGIX"(void, GLint("factor"))
    }
    file("IglooInterface", SGIX, "GL_SGIX_igloo_interface") {
        "glIglooInterfaceSGIX"(void, GLenum("pname"), address("params", "const void *"))
    }
    file("Instruments", SGIX, "GL_SGIX_instruments") {
        "GL_INSTRUMENT_BUFFER_POINTER_SGIX"("0x8180")
        "GL_INSTRUMENT_MEASUREMENTS_SGIX"("0x8181")
        "glGetInstrumentsSGIX"(GLint)
        "glInstrumentsBufferSGIX"(void, GLsizei("size"), address("buffer", "GLint *"))
        "glPollInstrumentsSGIX"(GLint, address("marker_p", "GLint *"))
        "glReadInstrumentsSGIX"(void, GLint("marker"))
        "glStartInstrumentsSGIX"(void)
        "glStopInstrumentsSGIX"(void, GLint("marker"))
    }
    file("Interlace", SGIX, "GL_SGIX_interlace", "GL_INTERLACE_SGIX" to "0x8094")
    file("IrInstrument1", SGIX, "GL_SGIX_ir_instrument1", "GL_IR_INSTRUMENT1_SGIX" to "0x817F")
    file("ListPriority", SGIX, "GL_SGIX_list_priority") {
        "GL_LIST_PRIORITY_SGIX"("0x8182")
        "glGetListParameterfvSGIX"(void, GLuint("list"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetListParameterivSGIX"(void, GLuint("list"), GLenum("pname"), address("params", "GLint *"))
        "glListParameterfSGIX"(void, GLuint("list"), GLenum("pname"), GLfloat("param"))
        "glListParameterfvSGIX"(void, GLuint("list"), GLenum("pname"), address("params", "const GLfloat *"))
        "glListParameteriSGIX"(void, GLuint("list"), GLenum("pname"), GLint("param"))
        "glListParameterivSGIX"(void, GLuint("list"), GLenum("pname"), address("params", "const GLint *"))
    }
    file("PixelTexture", SGIX, "GL_SGIX_pixel_texture") {
        "GL_PIXEL_TEX_GEN_SGIX"("0x8139")
        "GL_PIXEL_TEX_GEN_MODE_SGIX"("0x832B")
        "glPixelTexGenSGIX"(void, GLenum("mode"))
    }
    file(
        "PixelTiles", SGIX, "GL_SGIX_pixel_tiles",
        "GL_PIXEL_TILE_BEST_ALIGNMENT_SGIX" to "0x813E",
        "GL_PIXEL_TILE_CACHE_INCREMENT_SGIX" to "0x813F",
        "GL_PIXEL_TILE_WIDTH_SGIX" to "0x8140",
        "GL_PIXEL_TILE_HEIGHT_SGIX" to "0x8141",
        "GL_PIXEL_TILE_GRID_WIDTH_SGIX" to "0x8142",
        "GL_PIXEL_TILE_GRID_HEIGHT_SGIX" to "0x8143",
        "GL_PIXEL_TILE_GRID_DEPTH_SGIX" to "0x8144",
        "GL_PIXEL_TILE_CACHE_SIZE_SGIX" to "0x8145"
    )
    file("PolynomialFFD", SGIX, "GL_SGIX_polynomial_ffd") {
        "GL_TEXTURE_DEFORMATION_BIT_SGIX"("0x00000001")
        "GL_GEOMETRY_DEFORMATION_BIT_SGIX"("0x00000002")
        "GL_GEOMETRY_DEFORMATION_SGIX"("0x8194")
        "GL_TEXTURE_DEFORMATION_SGIX"("0x8195")
        "GL_DEFORMATIONS_MASK_SGIX"("0x8196")
        "GL_MAX_DEFORMATION_ORDER_SGIX"("0x8197")
        "glDeformationMap3dSGIX"(
            void,
            GLenum("target"),
            GLdouble("u1"),
            GLdouble("u2"),
            GLint("ustride"),
            GLint("uorder"),
            GLdouble("v1"),
            GLdouble("v2"),
            GLint("vstride"),
            GLint("vorder"),
            GLdouble("w1"),
            GLdouble("w2"),
            GLint("wstride"),
            GLint("worder"),
            address("points", "const GLdouble *")
        )
        "glDeformationMap3fSGIX"(
            void,
            GLenum("target"),
            GLfloat("u1"),
            GLfloat("u2"),
            GLint("ustride"),
            GLint("uorder"),
            GLfloat("v1"),
            GLfloat("v2"),
            GLint("vstride"),
            GLint("vorder"),
            GLfloat("w1"),
            GLfloat("w2"),
            GLint("wstride"),
            GLint("worder"),
            address("points", "const GLfloat *")
        )
        "glDeformSGIX"(void, GLbitfield("mask"))
        "glLoadIdentityDeformationMapSGIX"(void, GLbitfield("mask"))
    }
    file("ReferencePlane", SGIX, "GL_SGIX_reference_plane") {
        "GL_REFERENCE_PLANE_SGIX"("0x817D")
        "GL_REFERENCE_PLANE_EQUATION_SGIX"("0x817E")
        "glReferencePlaneSGIX"(void, address("equation", "const GLdouble *"))
    }
    file(
        "Resample", SGIX, "GL_SGIX_resample",
        "GL_PACK_RESAMPLE_SGIX" to "0x842E",
        "GL_UNPACK_RESAMPLE_SGIX" to "0x842F",
        "GL_RESAMPLE_REPLICATE_SGIX" to "0x8433",
        "GL_RESAMPLE_ZERO_FILL_SGIX" to "0x8434",
        "GL_RESAMPLE_DECIMATE_SGIX" to "0x8430"
    )
    file("ScalebiasHint", SGIX, "GL_SGIX_scalebias_hint", "GL_SCALEBIAS_HINT_SGIX" to "0x8322")
    file(
        "Shadow", SGIX, "GL_SGIX_shadow",
        "GL_TEXTURE_COMPARE_SGIX" to "0x819A",
        "GL_TEXTURE_COMPARE_OPERATOR_SGIX" to "0x819B",
        "GL_TEXTURE_LEQUAL_R_SGIX" to "0x819C",
        "GL_TEXTURE_GEQUAL_R_SGIX" to "0x819D"
    )
    file("ShadowAmbient", SGIX, "GL_SGIX_shadow_ambient", "GL_SHADOW_AMBIENT_SGIX" to "0x80BF")
    file("Sprite", SGIX, "GL_SGIX_sprite") {
        "GL_SPRITE_SGIX"("0x8148")
        "GL_SPRITE_MODE_SGIX"("0x8149")
        "GL_SPRITE_AXIS_SGIX"("0x814A")
        "GL_SPRITE_TRANSLATION_SGIX"("0x814B")
        "GL_SPRITE_AXIAL_SGIX"("0x814C")
        "GL_SPRITE_OBJECT_ALIGNED_SGIX"("0x814D")
        "GL_SPRITE_EYE_ALIGNED_SGIX"("0x814E")
        "glSpriteParameterfSGIX"(void, GLenum("pname"), GLfloat("param"))
        "glSpriteParameterfvSGIX"(void, GLenum("pname"), address("params", "const GLfloat *"))
        "glSpriteParameteriSGIX"(void, GLenum("pname"), GLint("param"))
        "glSpriteParameterivSGIX"(void, GLenum("pname"), address("params", "const GLint *"))
    }
    file(
        "Subsample", SGIX, "GL_SGIX_subsample",
        "GL_PACK_SUBSAMPLE_RATE_SGIX" to "0x85A0",
        "GL_UNPACK_SUBSAMPLE_RATE_SGIX" to "0x85A1",
        "GL_PIXEL_SUBSAMPLE_4444_SGIX" to "0x85A2",
        "GL_PIXEL_SUBSAMPLE_2424_SGIX" to "0x85A3",
        "GL_PIXEL_SUBSAMPLE_4242_SGIX" to "0x85A4"
    )
    file("TagSampleBuffer", SGIX, "GL_SGIX_tag_sample_buffer") {
        "glTagSampleBufferSGIX"(void)
    }
    file("TextureAddEnv", SGIX, "GL_SGIX_texture_add_env", "GL_TEXTURE_ENV_BIAS_SGIX" to "0x80BE")
    file(
        "TextureCoordinateClamp", SGIX, "GL_SGIX_texture_coordinate_clamp",
        "GL_TEXTURE_MAX_CLAMP_S_SGIX" to "0x8369",
        "GL_TEXTURE_MAX_CLAMP_T_SGIX" to "0x836A",
        "GL_TEXTURE_MAX_CLAMP_R_SGIX" to "0x836B"
    )
    file(
        "TextureLodBias", SGIX, "GL_SGIX_texture_lod_bias",
        "GL_TEXTURE_LOD_BIAS_S_SGIX" to "0x818E",
        "GL_TEXTURE_LOD_BIAS_T_SGIX" to "0x818F",
        "GL_TEXTURE_LOD_BIAS_R_SGIX" to "0x8190"
    )
    file("TextureMultiBuffer", SGIX, "GL_SGIX_texture_multi_buffer", "GL_TEXTURE_MULTI_BUFFER_HINT_SGIX" to "0x812E")
    file(
        "TextureScaleBias", SGIX, "GL_SGIX_texture_scale_bias",
        "GL_POST_TEXTURE_FILTER_BIAS_SGIX" to "0x8179",
        "GL_POST_TEXTURE_FILTER_SCALE_SGIX" to "0x817A",
        "GL_POST_TEXTURE_FILTER_BIAS_RANGE_SGIX" to "0x817B",
        "GL_POST_TEXTURE_FILTER_SCALE_RANGE_SGIX" to "0x817C"
    )
    file(
        "VertexPreclip", SGIX, "GL_SGIX_vertex_preclip",
        "GL_VERTEX_PRECLIP_SGIX" to "0x83EE",
        "GL_VERTEX_PRECLIP_HINT_SGIX" to "0x83EF"
    )
    file(
        "Ycrcb", SGIX, "GL_SGIX_ycrcb",
        "GL_YCRCB_422_SGIX" to "0x81BB",
        "GL_YCRCB_444_SGIX" to "0x81BC"
    )
    file(
        "Ycrcba", SGIX, "GL_SGIX_ycrcba",
        "GL_YCRCB_SGIX" to "0x8318",
        "GL_YCRCBA_SGIX" to "0x8319"
    )
    file(
        "ColorMatrix", SGI, "GL_SGI_color_matrix",
        "GL_COLOR_MATRIX_SGI" to "0x80B1",
        "GL_COLOR_MATRIX_STACK_DEPTH_SGI" to "0x80B2",
        "GL_MAX_COLOR_MATRIX_STACK_DEPTH_SGI" to "0x80B3",
        "GL_POST_COLOR_MATRIX_RED_SCALE_SGI" to "0x80B4",
        "GL_POST_COLOR_MATRIX_GREEN_SCALE_SGI" to "0x80B5",
        "GL_POST_COLOR_MATRIX_BLUE_SCALE_SGI" to "0x80B6",
        "GL_POST_COLOR_MATRIX_ALPHA_SCALE_SGI" to "0x80B7",
        "GL_POST_COLOR_MATRIX_RED_BIAS_SGI" to "0x80B8",
        "GL_POST_COLOR_MATRIX_GREEN_BIAS_SGI" to "0x80B9",
        "GL_POST_COLOR_MATRIX_BLUE_BIAS_SGI" to "0x80BA",
        "GL_POST_COLOR_MATRIX_ALPHA_BIAS_SGI" to "0x80BB"
    )
    file("ColorTable", SGI, "GL_SGI_color_table") {
        "GL_COLOR_TABLE_SGI"("0x80D0")
        "GL_POST_CONVOLUTION_COLOR_TABLE_SGI"("0x80D1")
        "GL_POST_COLOR_MATRIX_COLOR_TABLE_SGI"("0x80D2")
        "GL_PROXY_COLOR_TABLE_SGI"("0x80D3")
        "GL_PROXY_POST_CONVOLUTION_COLOR_TABLE_SGI"("0x80D4")
        "GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE_SGI"("0x80D5")
        "GL_COLOR_TABLE_SCALE_SGI"("0x80D6")
        "GL_COLOR_TABLE_BIAS_SGI"("0x80D7")
        "GL_COLOR_TABLE_FORMAT_SGI"("0x80D8")
        "GL_COLOR_TABLE_WIDTH_SGI"("0x80D9")
        "GL_COLOR_TABLE_RED_SIZE_SGI"("0x80DA")
        "GL_COLOR_TABLE_GREEN_SIZE_SGI"("0x80DB")
        "GL_COLOR_TABLE_BLUE_SIZE_SGI"("0x80DC")
        "GL_COLOR_TABLE_ALPHA_SIZE_SGI"("0x80DD")
        "GL_COLOR_TABLE_LUMINANCE_SIZE_SGI"("0x80DE")
        "GL_COLOR_TABLE_INTENSITY_SIZE_SGI"("0x80DF")
        "glColorTableSGI"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLsizei("width"),
            GLenum("format"),
            GLenum("type"),
            address("table", "const void *")
        )
        "glColorTableParameterfvSGI"(void, GLenum("target"), GLenum("pname"), address("params", "const GLfloat *"))
        "glColorTableParameterivSGI"(void, GLenum("target"), GLenum("pname"), address("params", "const GLint *"))
        "glCopyColorTableSGI"(
            void,
            GLenum("target"),
            GLenum("internalformat"),
            GLint("x"),
            GLint("y"),
            GLsizei("width")
        )
        "glGetColorTableSGI"(void, GLenum("target"), GLenum("format"), GLenum("type"), address("table", "void *"))
        "glGetColorTableParameterfvSGI"(void, GLenum("target"), GLenum("pname"), address("params", "GLfloat *"))
        "glGetColorTableParameterivSGI"(void, GLenum("target"), GLenum("pname"), address("params", "GLint *"))
    }
    file(
        "TextureColorTable", SGI, "GL_SGI_texture_color_table",
        "GL_TEXTURE_COLOR_TABLE_SGI" to "0x80BC",
        "GL_PROXY_TEXTURE_COLOR_TABLE_SGI" to "0x80BD"
    )
}

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

fun glExtension() {
    Files.writeString(Path("ext/GLExtension.java"), buildString {
        appendLine("""
            ${fileHeader.prependIndent("|")}
            |package overrungl.opengl.ext;
            |import overrungl.opengl.ext.arb.*;
            |import overrungl.opengl.ext.khr.*;
            |import overrungl.opengl.ext.oes.*;
            |import overrungl.opengl.ext.amd.*;
            |import overrungl.opengl.ext.apple.*;
            |import overrungl.opengl.ext.ati.*;
            |import overrungl.opengl.ext.ext.*;
            |import overrungl.opengl.ext.ibm.*;
            |import overrungl.opengl.ext.intel.*;
            |import overrungl.opengl.ext.mesa.*;
            |import overrungl.opengl.ext.nv.*;
            |import overrungl.opengl.ext.sgi.*;
            |import overrungl.opengl.ext.sun.*;
            |
            |/**
            | * The OpenGL extension functions.
            | *
            | * @since 0.1.0
            | */
            |public interface GLExtension extends
        """.trimMargin())
        generatedExtClasses.joinTo(this, ",\n") { "    GL${it.ext.extName}${it.name}" }
        appendLine(" {")
        appendLine("}")
    })
}

fun glFlags() {
    val caps = arrayOf(
        "GL_ARB_ES2_compatibility",
        "GL_ARB_ES3_1_compatibility",
        "GL_ARB_ES3_2_compatibility",
        "GL_ARB_ES3_compatibility",
        "GL_ARB_arrays_of_arrays",
        "GL_ARB_base_instance",
        "GL_ARB_bindless_texture",
        "GL_ARB_blend_func_extended",
        "GL_ARB_buffer_storage",
        "GL_ARB_cl_event",
        "GL_ARB_clear_buffer_object",
        "GL_ARB_clear_texture",
        "GL_ARB_clip_control",
        "GL_ARB_color_buffer_float",
        "GL_ARB_compatibility",
        "GL_ARB_compressed_texture_pixel_storage",
        "GL_ARB_compute_shader",
        "GL_ARB_compute_variable_group_size",
        "GL_ARB_conditional_render_inverted",
        "GL_ARB_conservative_depth",
        "GL_ARB_copy_buffer",
        "GL_ARB_copy_image",
        "GL_ARB_cull_distance",
        "GL_ARB_debug_output",
        "GL_ARB_depth_buffer_float",
        "GL_ARB_depth_clamp",
        "GL_ARB_depth_texture",
        "GL_ARB_derivative_control",
        "GL_ARB_direct_state_access",
        "GL_ARB_draw_buffers",
        "GL_ARB_draw_buffers_blend",
        "GL_ARB_draw_elements_base_vertex",
        "GL_ARB_draw_indirect",
        "GL_ARB_draw_instanced",
        "GL_ARB_enhanced_layouts",
        "GL_ARB_explicit_attrib_location",
        "GL_ARB_explicit_uniform_location",
        "GL_ARB_fragment_coord_conventions",
        "GL_ARB_fragment_layer_viewport",
        "GL_ARB_fragment_program",
        "GL_ARB_fragment_program_shadow",
        "GL_ARB_fragment_shader",
        "GL_ARB_fragment_shader_interlock",
        "GL_ARB_framebuffer_no_attachments",
        "GL_ARB_framebuffer_object",
        "GL_ARB_framebuffer_sRGB",
        "GL_ARB_geometry_shader4",
        "GL_ARB_get_program_binary",
        "GL_ARB_get_texture_sub_image",
        "GL_ARB_gl_spirv",
        "GL_ARB_gpu_shader5",
        "GL_ARB_gpu_shader_fp64",
        "GL_ARB_gpu_shader_int64",
        "GL_ARB_half_float_pixel",
        "GL_ARB_half_float_vertex",
        "GL_ARB_imaging",
        "GL_ARB_indirect_parameters",
        "GL_ARB_instanced_arrays",
        "GL_ARB_internalformat_query",
        "GL_ARB_internalformat_query2",
        "GL_ARB_invalidate_subdata",
        "GL_ARB_map_buffer_alignment",
        "GL_ARB_map_buffer_range",
        "GL_ARB_matrix_palette",
        "GL_ARB_multi_bind",
        "GL_ARB_multi_draw_indirect",
        "GL_ARB_multisample",
        "GL_ARB_multitexture",
        "GL_ARB_occlusion_query",
        "GL_ARB_occlusion_query2",
        "GL_ARB_parallel_shader_compile",
        "GL_ARB_pipeline_statistics_query",
        "GL_ARB_pixel_buffer_object",
        "GL_ARB_point_parameters",
        "GL_ARB_point_sprite",
        "GL_ARB_polygon_offset_clamp",
        "GL_ARB_post_depth_coverage",
        "GL_ARB_program_interface_query",
        "GL_ARB_provoking_vertex",
        "GL_ARB_query_buffer_object",
        "GL_ARB_robust_buffer_access_behavior",
        "GL_ARB_robustness",
        "GL_ARB_robustness_isolation",
        "GL_ARB_sample_locations",
        "GL_ARB_sample_shading",
        "GL_ARB_sampler_objects",
        "GL_ARB_seamless_cube_map",
        "GL_ARB_seamless_cubemap_per_texture",
        "GL_ARB_separate_shader_objects",
        "GL_ARB_shader_atomic_counter_ops",
        "GL_ARB_shader_atomic_counters",
        "GL_ARB_shader_ballot",
        "GL_ARB_shader_bit_encoding",
        "GL_ARB_shader_clock",
        "GL_ARB_shader_draw_parameters",
        "GL_ARB_shader_group_vote",
        "GL_ARB_shader_image_load_store",
        "GL_ARB_shader_image_size",
        "GL_ARB_shader_objects",
        "GL_ARB_shader_precision",
        "GL_ARB_shader_stencil_export",
        "GL_ARB_shader_storage_buffer_object",
        "GL_ARB_shader_subroutine",
        "GL_ARB_shader_texture_image_samples",
        "GL_ARB_shader_texture_lod",
        "GL_ARB_shader_viewport_layer_array",
        "GL_ARB_shading_language_100",
        "GL_ARB_shading_language_420pack",
        "GL_ARB_shading_language_include",
        "GL_ARB_shading_language_packing",
        "GL_ARB_shadow",
        "GL_ARB_shadow_ambient",
        "GL_ARB_sparse_buffer",
        "GL_ARB_sparse_texture",
        "GL_ARB_sparse_texture2",
        "GL_ARB_sparse_texture_clamp",
        "GL_ARB_spirv_extensions",
        "GL_ARB_stencil_texturing",
        "GL_ARB_sync",
        "GL_ARB_tessellation_shader",
        "GL_ARB_texture_barrier",
        "GL_ARB_texture_border_clamp",
        "GL_ARB_texture_buffer_object",
        "GL_ARB_texture_buffer_object_rgb32",
        "GL_ARB_texture_buffer_range",
        "GL_ARB_texture_compression",
        "GL_ARB_texture_compression_bptc",
        "GL_ARB_texture_compression_rgtc",
        "GL_ARB_texture_cube_map",
        "GL_ARB_texture_cube_map_array",
        "GL_ARB_texture_env_add",
        "GL_ARB_texture_env_combine",
        "GL_ARB_texture_env_crossbar",
        "GL_ARB_texture_env_dot3",
        "GL_ARB_texture_filter_anisotropic",
        "GL_ARB_texture_filter_minmax",
        "GL_ARB_texture_float",
        "GL_ARB_texture_gather",
        "GL_ARB_texture_mirror_clamp_to_edge",
        "GL_ARB_texture_mirrored_repeat",
        "GL_ARB_texture_multisample",
        "GL_ARB_texture_non_power_of_two",
        "GL_ARB_texture_query_levels",
        "GL_ARB_texture_query_lod",
        "GL_ARB_texture_rectangle",
        "GL_ARB_texture_rg",
        "GL_ARB_texture_rgb10_a2ui",
        "GL_ARB_texture_stencil8",
        "GL_ARB_texture_storage",
        "GL_ARB_texture_storage_multisample",
        "GL_ARB_texture_swizzle",
        "GL_ARB_texture_view",
        "GL_ARB_timer_query",
        "GL_ARB_transform_feedback2",
        "GL_ARB_transform_feedback3",
        "GL_ARB_transform_feedback_instanced",
        "GL_ARB_transform_feedback_overflow_query",
        "GL_ARB_transpose_matrix",
        "GL_ARB_uniform_buffer_object",
        "GL_ARB_vertex_array_bgra",
        "GL_ARB_vertex_array_object",
        "GL_ARB_vertex_attrib_64bit",
        "GL_ARB_vertex_attrib_binding",
        "GL_ARB_vertex_blend",
        "GL_ARB_vertex_buffer_object",
        "GL_ARB_vertex_program",
        "GL_ARB_vertex_shader",
        "GL_ARB_vertex_type_10f_11f_11f_rev",
        "GL_ARB_vertex_type_2_10_10_10_rev",
        "GL_ARB_viewport_array",
        "GL_ARB_window_pos",
        "GL_KHR_blend_equation_advanced",
        "GL_KHR_blend_equation_advanced_coherent",
        "GL_KHR_context_flush_control",
        "GL_KHR_debug",
        "GL_KHR_no_error",
        "GL_KHR_parallel_shader_compile",
        "GL_KHR_robust_buffer_access_behavior",
        "GL_KHR_robustness",
        "GL_KHR_shader_subgroup",
        "GL_KHR_texture_compression_astc_hdr",
        "GL_KHR_texture_compression_astc_ldr",
        "GL_KHR_texture_compression_astc_sliced_3d",
        "GL_OES_byte_coordinates",
        "GL_OES_compressed_paletted_texture",
        "GL_OES_fixed_point",
        "GL_OES_query_matrix",
        "GL_OES_read_format",
        "GL_OES_single_precision",
        "GL_3DFX_multisample",
        "GL_3DFX_tbuffer",
        "GL_3DFX_texture_compression_FXT1",
        "GL_AMD_blend_minmax_factor",
        "GL_AMD_conservative_depth",
        "GL_AMD_debug_output",
        "GL_AMD_depth_clamp_separate",
        "GL_AMD_draw_buffers_blend",
        "GL_AMD_framebuffer_multisample_advanced",
        "GL_AMD_framebuffer_sample_positions",
        "GL_AMD_gcn_shader",
        "GL_AMD_gpu_shader_half_float",
        "GL_AMD_gpu_shader_int16",
        "GL_AMD_gpu_shader_int64",
        "GL_AMD_interleaved_elements",
        "GL_AMD_multi_draw_indirect",
        "GL_AMD_name_gen_delete",
        "GL_AMD_occlusion_query_event",
        "GL_AMD_performance_monitor",
        "GL_AMD_pinned_memory",
        "GL_AMD_query_buffer_object",
        "GL_AMD_sample_positions",
        "GL_AMD_seamless_cubemap_per_texture",
        "GL_AMD_shader_atomic_counter_ops",
        "GL_AMD_shader_ballot",
        "GL_AMD_shader_explicit_vertex_parameter",
        "GL_AMD_shader_gpu_shader_half_float_fetch",
        "GL_AMD_shader_image_load_store_lod",
        "GL_AMD_shader_stencil_export",
        "GL_AMD_shader_trinary_minmax",
        "GL_AMD_sparse_texture",
        "GL_AMD_stencil_operation_extended",
        "GL_AMD_texture_gather_bias_lod",
        "GL_AMD_texture_texture4",
        "GL_AMD_transform_feedback3_lines_triangles",
        "GL_AMD_transform_feedback4",
        "GL_AMD_vertex_shader_layer",
        "GL_AMD_vertex_shader_tessellator",
        "GL_AMD_vertex_shader_viewport_index",
        "GL_APPLE_aux_depth_stencil",
        "GL_APPLE_client_storage",
        "GL_APPLE_element_array",
        "GL_APPLE_fence",
        "GL_APPLE_float_pixels",
        "GL_APPLE_flush_buffer_range",
        "GL_APPLE_object_purgeable",
        "GL_APPLE_rgb_422",
        "GL_APPLE_row_bytes",
        "GL_APPLE_specular_vector",
        "GL_APPLE_texture_range",
        "GL_APPLE_transform_hint",
        "GL_APPLE_vertex_array_object",
        "GL_APPLE_vertex_array_range",
        "GL_APPLE_vertex_program_evaluators",
        "GL_APPLE_ycbcr_422",
        "GL_ATI_draw_buffers",
        "GL_ATI_element_array",
        "GL_ATI_envmap_bumpmap",
        "GL_ATI_fragment_shader",
        "GL_ATI_map_object_buffer",
        "GL_ATI_meminfo",
        "GL_ATI_pixel_format_float",
        "GL_ATI_pn_triangles",
        "GL_ATI_separate_stencil",
        "GL_ATI_text_fragment_shader",
        "GL_ATI_texture_env_combine3",
        "GL_ATI_texture_float",
        "GL_ATI_texture_mirror_once",
        "GL_ATI_vertex_array_object",
        "GL_ATI_vertex_attrib_array_object",
        "GL_ATI_vertex_streams",
        "GL_EXT_422_pixels",
        "GL_EXT_EGL_image_storage",
        "GL_EXT_EGL_sync",
        "GL_EXT_abgr",
        "GL_EXT_bgra",
        "GL_EXT_bindable_uniform",
        "GL_EXT_blend_color",
        "GL_EXT_blend_equation_separate",
        "GL_EXT_blend_func_separate",
        "GL_EXT_blend_logic_op",
        "GL_EXT_blend_minmax",
        "GL_EXT_blend_subtract",
        "GL_EXT_clip_volume_hint",
        "GL_EXT_cmyka",
        "GL_EXT_color_subtable",
        "GL_EXT_compiled_vertex_array",
        "GL_EXT_convolution",
        "GL_EXT_coordinate_frame",
        "GL_EXT_copy_texture",
        "GL_EXT_cull_vertex",
        "GL_EXT_debug_label",
        "GL_EXT_debug_marker",
        "GL_EXT_depth_bounds_test",
        "GL_EXT_direct_state_access",
        "GL_EXT_draw_buffers2",
        "GL_EXT_draw_instanced",
        "GL_EXT_draw_range_elements",
        "GL_EXT_external_buffer",
        "GL_EXT_fog_coord",
        "GL_EXT_framebuffer_blit",
        "GL_EXT_framebuffer_blit_layers",
        "GL_EXT_framebuffer_multisample",
        "GL_EXT_framebuffer_multisample_blit_scaled",
        "GL_EXT_framebuffer_object",
        "GL_EXT_framebuffer_sRGB",
        "GL_EXT_geometry_shader4",
        "GL_EXT_gpu_program_parameters",
        "GL_EXT_gpu_shader4",
        "GL_EXT_histogram",
        "GL_EXT_index_array_formats",
        "GL_EXT_index_func",
        "GL_EXT_index_material",
        "GL_EXT_index_texture",
        "GL_EXT_light_texture",
        "GL_EXT_memory_object",
        "GL_EXT_memory_object_fd",
        "GL_EXT_memory_object_win32",
        "GL_EXT_misc_attribute",
        "GL_EXT_multi_draw_arrays",
        "GL_EXT_multisample",
        "GL_EXT_multiview_tessellation_geometry_shader",
        "GL_EXT_multiview_texture_multisample",
        "GL_EXT_multiview_timer_query",
        "GL_EXT_packed_depth_stencil",
        "GL_EXT_packed_float",
        "GL_EXT_packed_pixels",
        "GL_EXT_paletted_texture",
        "GL_EXT_pixel_buffer_object",
        "GL_EXT_pixel_transform",
        "GL_EXT_pixel_transform_color_table",
        "GL_EXT_point_parameters",
        "GL_EXT_polygon_offset",
        "GL_EXT_polygon_offset_clamp",
        "GL_EXT_post_depth_coverage",
        "GL_EXT_provoking_vertex",
        "GL_EXT_raster_multisample",
        "GL_EXT_rescale_normal",
        "GL_EXT_secondary_color",
        "GL_EXT_semaphore",
        "GL_EXT_semaphore_fd",
        "GL_EXT_semaphore_win32",
        "GL_EXT_separate_shader_objects",
        "GL_EXT_separate_specular_color",
        "GL_EXT_shader_framebuffer_fetch",
        "GL_EXT_shader_framebuffer_fetch_non_coherent",
        "GL_EXT_shader_image_load_formatted",
        "GL_EXT_shader_image_load_store",
        "GL_EXT_shader_integer_mix",
        "GL_EXT_shader_samples_identical",
        "GL_EXT_shadow_funcs",
        "GL_EXT_shared_texture_palette",
        "GL_EXT_sparse_texture2",
        "GL_EXT_stencil_clear_tag",
        "GL_EXT_stencil_two_side",
        "GL_EXT_stencil_wrap",
        "GL_EXT_subtexture",
        "GL_EXT_texture",
        "GL_EXT_texture3D",
        "GL_EXT_texture_array",
        "GL_EXT_texture_buffer_object",
        "GL_EXT_texture_compression_latc",
        "GL_EXT_texture_compression_rgtc",
        "GL_EXT_texture_compression_s3tc",
        "GL_EXT_texture_cube_map",
        "GL_EXT_texture_env_add",
        "GL_EXT_texture_env_combine",
        "GL_EXT_texture_env_dot3",
        "GL_EXT_texture_filter_anisotropic",
        "GL_EXT_texture_filter_minmax",
        "GL_EXT_texture_integer",
        "GL_EXT_texture_lod_bias",
        "GL_EXT_texture_mirror_clamp",
        "GL_EXT_texture_object",
        "GL_EXT_texture_perturb_normal",
        "GL_EXT_texture_sRGB",
        "GL_EXT_texture_sRGB_R8",
        "GL_EXT_texture_sRGB_RG8",
        "GL_EXT_texture_sRGB_decode",
        "GL_EXT_texture_shadow_lod",
        "GL_EXT_texture_shared_exponent",
        "GL_EXT_texture_snorm",
        "GL_EXT_texture_storage",
        "GL_EXT_texture_swizzle",
        "GL_EXT_timer_query",
        "GL_EXT_transform_feedback",
        "GL_EXT_vertex_array",
        "GL_EXT_vertex_array_bgra",
        "GL_EXT_vertex_attrib_64bit",
        "GL_EXT_vertex_shader",
        "GL_EXT_vertex_weighting",
        "GL_EXT_win32_keyed_mutex",
        "GL_EXT_window_rectangles",
        "GL_EXT_x11_sync_object",
        "GL_GREMEDY_frame_terminator",
        "GL_GREMEDY_string_marker",
        "GL_HP_convolution_border_modes",
        "GL_HP_image_transform",
        "GL_HP_occlusion_test",
        "GL_HP_texture_lighting",
        "GL_IBM_cull_vertex",
        "GL_IBM_multimode_draw_arrays",
        "GL_IBM_rasterpos_clip",
        "GL_IBM_static_data",
        "GL_IBM_texture_mirrored_repeat",
        "GL_IBM_vertex_array_lists",
        "GL_INGR_blend_func_separate",
        "GL_INGR_color_clamp",
        "GL_INGR_interlace_read",
        "GL_INTEL_blackhole_render",
        "GL_INTEL_conservative_rasterization",
        "GL_INTEL_fragment_shader_ordering",
        "GL_INTEL_framebuffer_CMAA",
        "GL_INTEL_map_texture",
        "GL_INTEL_parallel_arrays",
        "GL_INTEL_performance_query",
        "GL_MESAX_texture_stack",
        "GL_MESA_framebuffer_flip_x",
        "GL_MESA_framebuffer_flip_y",
        "GL_MESA_framebuffer_swap_xy",
        "GL_MESA_pack_invert",
        "GL_MESA_program_binary_formats",
        "GL_MESA_resize_buffers",
        "GL_MESA_shader_integer_functions",
        "GL_MESA_tile_raster_order",
        "GL_MESA_window_pos",
        "GL_MESA_ycbcr_texture",
        "GL_NVX_blend_equation_advanced_multi_draw_buffers",
        "GL_NVX_conditional_render",
        "GL_NVX_gpu_memory_info",
        "GL_NVX_gpu_multicast2",
        "GL_NVX_linked_gpu_multicast",
        "GL_NVX_progress_fence",
        "GL_NV_alpha_to_coverage_dither_control",
        "GL_NV_bindless_multi_draw_indirect",
        "GL_NV_bindless_multi_draw_indirect_count",
        "GL_NV_bindless_texture",
        "GL_NV_blend_equation_advanced",
        "GL_NV_blend_equation_advanced_coherent",
        "GL_NV_blend_minmax_factor",
        "GL_NV_blend_square",
        "GL_NV_clip_space_w_scaling",
        "GL_NV_command_list",
        "GL_NV_compute_program5",
        "GL_NV_compute_shader_derivatives",
        "GL_NV_conditional_render",
        "GL_NV_conservative_raster",
        "GL_NV_conservative_raster_dilate",
        "GL_NV_conservative_raster_pre_snap",
        "GL_NV_conservative_raster_pre_snap_triangles",
        "GL_NV_conservative_raster_underestimation",
        "GL_NV_copy_depth_to_color",
        "GL_NV_copy_image",
        "GL_NV_deep_texture3D",
        "GL_NV_depth_buffer_float",
        "GL_NV_depth_clamp",
        "GL_NV_draw_texture",
        "GL_NV_draw_vulkan_image",
        "GL_NV_evaluators",
        "GL_NV_explicit_multisample",
        "GL_NV_fence",
        "GL_NV_fill_rectangle",
        "GL_NV_float_buffer",
        "GL_NV_fog_distance",
        "GL_NV_fragment_coverage_to_color",
        "GL_NV_fragment_program",
        "GL_NV_fragment_program2",
        "GL_NV_fragment_program4",
        "GL_NV_fragment_program_option",
        "GL_NV_fragment_shader_barycentric",
        "GL_NV_fragment_shader_interlock",
        "GL_NV_framebuffer_mixed_samples",
        "GL_NV_framebuffer_multisample_coverage",
        "GL_NV_geometry_program4",
        "GL_NV_geometry_shader4",
        "GL_NV_geometry_shader_passthrough",
        "GL_NV_gpu_multicast",
        "GL_NV_gpu_program4",
        "GL_NV_gpu_program5",
        "GL_NV_gpu_program5_mem_extended",
        "GL_NV_gpu_shader5",
        "GL_NV_half_float",
        "GL_NV_internalformat_sample_query",
        "GL_NV_light_max_exponent",
        "GL_NV_memory_attachment",
        "GL_NV_memory_object_sparse",
        "GL_NV_mesh_shader",
        "GL_NV_multisample_coverage",
        "GL_NV_multisample_filter_hint",
        "GL_NV_occlusion_query",
        "GL_NV_packed_depth_stencil",
        "GL_NV_parameter_buffer_object",
        "GL_NV_parameter_buffer_object2",
        "GL_NV_path_rendering",
        "GL_NV_path_rendering_shared_edge",
        "GL_NV_pixel_data_range",
        "GL_NV_point_sprite",
        "GL_NV_present_video",
        "GL_NV_primitive_restart",
        "GL_NV_primitive_shading_rate",
        "GL_NV_query_resource",
        "GL_NV_query_resource_tag",
        "GL_NV_register_combiners",
        "GL_NV_register_combiners2",
        "GL_NV_representative_fragment_test",
        "GL_NV_robustness_video_memory_purge",
        "GL_NV_sample_locations",
        "GL_NV_sample_mask_override_coverage",
        "GL_NV_scissor_exclusive",
        "GL_NV_shader_atomic_counters",
        "GL_NV_shader_atomic_float",
        "GL_NV_shader_atomic_float64",
        "GL_NV_shader_atomic_fp16_vector",
        "GL_NV_shader_atomic_int64",
        "GL_NV_shader_buffer_load",
        "GL_NV_shader_buffer_store",
        "GL_NV_shader_storage_buffer_object",
        "GL_NV_shader_subgroup_partitioned",
        "GL_NV_shader_texture_footprint",
        "GL_NV_shader_thread_group",
        "GL_NV_shader_thread_shuffle",
        "GL_NV_shading_rate_image",
        "GL_NV_stereo_view_rendering",
        "GL_NV_tessellation_program5",
        "GL_NV_texgen_emboss",
        "GL_NV_texgen_reflection",
        "GL_NV_texture_barrier",
        "GL_NV_texture_compression_vtc",
        "GL_NV_texture_env_combine4",
        "GL_NV_texture_expand_normal",
        "GL_NV_texture_multisample",
        "GL_NV_texture_rectangle",
        "GL_NV_texture_rectangle_compressed",
        "GL_NV_texture_shader",
        "GL_NV_texture_shader2",
        "GL_NV_texture_shader3",
        "GL_NV_timeline_semaphore",
        "GL_NV_transform_feedback",
        "GL_NV_transform_feedback2",
        "GL_NV_uniform_buffer_std430_layout",
        "GL_NV_uniform_buffer_unified_memory",
        "GL_NV_vdpau_interop",
        "GL_NV_vdpau_interop2",
        "GL_NV_vertex_array_range",
        "GL_NV_vertex_array_range2",
        "GL_NV_vertex_attrib_integer_64bit",
        "GL_NV_vertex_buffer_unified_memory",
        "GL_NV_vertex_program",
        "GL_NV_vertex_program1_1",
        "GL_NV_vertex_program2",
        "GL_NV_vertex_program2_option",
        "GL_NV_vertex_program3",
        "GL_NV_vertex_program4",
        "GL_NV_video_capture",
        "GL_NV_viewport_array2",
        "GL_NV_viewport_swizzle",
        "GL_OML_interlace",
        "GL_OML_resample",
        "GL_OML_subsample",
        "GL_OVR_multiview",
        "GL_OVR_multiview2",
        "GL_PGI_misc_hints",
        "GL_PGI_vertex_hints",
        "GL_REND_screen_coordinates",
        "GL_S3_s3tc",
        "GL_SGIS_detail_texture",
        "GL_SGIS_fog_function",
        "GL_SGIS_generate_mipmap",
        "GL_SGIS_multisample",
        "GL_SGIS_pixel_texture",
        "GL_SGIS_point_line_texgen",
        "GL_SGIS_point_parameters",
        "GL_SGIS_sharpen_texture",
        "GL_SGIS_texture4D",
        "GL_SGIS_texture_border_clamp",
        "GL_SGIS_texture_color_mask",
        "GL_SGIS_texture_edge_clamp",
        "GL_SGIS_texture_filter4",
        "GL_SGIS_texture_lod",
        "GL_SGIS_texture_select",
        "GL_SGIX_async",
        "GL_SGIX_async_histogram",
        "GL_SGIX_async_pixel",
        "GL_SGIX_blend_alpha_minmax",
        "GL_SGIX_calligraphic_fragment",
        "GL_SGIX_clipmap",
        "GL_SGIX_convolution_accuracy",
        "GL_SGIX_depth_pass_instrument",
        "GL_SGIX_depth_texture",
        "GL_SGIX_flush_raster",
        "GL_SGIX_fog_offset",
        "GL_SGIX_fragment_lighting",
        "GL_SGIX_framezoom",
        "GL_SGIX_igloo_interface",
        "GL_SGIX_instruments",
        "GL_SGIX_interlace",
        "GL_SGIX_ir_instrument1",
        "GL_SGIX_list_priority",
        "GL_SGIX_pixel_texture",
        "GL_SGIX_pixel_tiles",
        "GL_SGIX_polynomial_ffd",
        "GL_SGIX_reference_plane",
        "GL_SGIX_resample",
        "GL_SGIX_scalebias_hint",
        "GL_SGIX_shadow",
        "GL_SGIX_shadow_ambient",
        "GL_SGIX_sprite",
        "GL_SGIX_subsample",
        "GL_SGIX_tag_sample_buffer",
        "GL_SGIX_texture_add_env",
        "GL_SGIX_texture_coordinate_clamp",
        "GL_SGIX_texture_lod_bias",
        "GL_SGIX_texture_multi_buffer",
        "GL_SGIX_texture_scale_bias",
        "GL_SGIX_vertex_preclip",
        "GL_SGIX_ycrcb",
        "GL_SGIX_ycrcb_subsample",
        "GL_SGIX_ycrcba",
        "GL_SGI_color_matrix",
        "GL_SGI_color_table",
        "GL_SGI_texture_color_table",
        "GL_SUNX_constant_data",
        "GL_SUN_convolution_border_modes",
        "GL_SUN_global_alpha",
        "GL_SUN_mesh_array",
        "GL_SUN_slice_accum",
        "GL_SUN_triangle_list",
        "GL_SUN_vertex",
        "GL_WIN_phong_shading",
        "GL_WIN_specular_fog"
    )
    Files.writeString(
        Path("GLFlags.java"),
        """
            ${fileHeader.prependIndent("|")}
            |package overrungl.opengl;
            |
            |/**
            | * The OpenGL flags.
            | *
            | * @since 0.1.0
            | */
            |public final class GLFlags {
            |    final GLLoadFunc load;
            |    final boolean foundExtension;
            |    /** The OpenGL core flags. */
            |    public final boolean GL10, GL11, GL12, GL13, GL14, GL15,
            |        GL20, GL21,
            |        GL30, GL31, GL32, GL33,
            |        GL40, GL41, GL42, GL43, GL44, GL45, GL46;
            |    /** The OpenGL extension flags. */
            |    public final boolean ${caps.joinToString()};
            |
            |    /**
            |     * Construct OpenGL flags.
            |     *
            |     * @param load the function where to find OpenGL functions.
            |     */
            |    GLFlags(GLLoadFunc load) {
            |        this.load = load;
            |        var core = GLFinder.findCoreGL(load);
            |        int major = core.x();
            |        int minor = core.y();
            |        this.GL10 = (major == 1 && minor >= 0) || major > 1;
            |        this.GL11 = (major == 1 && minor >= 1) || major > 1;
            |        this.GL12 = (major == 1 && minor >= 2) || major > 1;
            |        this.GL13 = (major == 1 && minor >= 3) || major > 1;
            |        this.GL14 = (major == 1 && minor >= 4) || major > 1;
            |        this.GL15 = (major == 1 && minor >= 5) || major > 1;
            |        this.GL20 = (major == 2 && minor >= 0) || major > 2;
            |        this.GL21 = (major == 2 && minor >= 1) || major > 2;
            |        this.GL30 = (major == 3 && minor >= 0) || major > 3;
            |        this.GL31 = (major == 3 && minor >= 1) || major > 3;
            |        this.GL32 = (major == 3 && minor >= 2) || major > 3;
            |        this.GL33 = (major == 3 && minor >= 3) || major > 3;
            |        this.GL40 = (major == 4 && minor >= 0) || major > 4;
            |        this.GL41 = (major == 4 && minor >= 1) || major > 4;
            |        this.GL42 = (major == 4 && minor >= 2) || major > 4;
            |        this.GL43 = (major == 4 && minor >= 3) || major > 4;
            |        this.GL44 = (major == 4 && minor >= 4) || major > 4;
            |        this.GL45 = (major == 4 && minor >= 5) || major > 4;
            |        this.GL46 = (major == 4 && minor >= 6) || major > 4;
            |        var list = new java.util.ArrayList<String>(700);
            |        this.foundExtension = GLFinder.getExtensions(load, major, list);
            |        ${caps.joinToString("\n|        ") { "this.$it = this.foundExtension && list.contains(\"$it\");" }}
            |    }
            |}
            |
        """.trimMargin()
    )
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
    glExtension()
    glFlags()
}
