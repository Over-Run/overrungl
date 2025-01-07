/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

import com.palantir.javapoet.TypeName
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.Text
import overrungl.gen.*
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.io.path.Path
import kotlin.io.path.createDirectories

// gl.xml updated: 2025/01/01

private val recordingErrorType = mutableSetOf<String>()

val openglPackage = "overrungl.opengl"
fun extPackage(vendor: String): String {
    val lowercase = vendor.lowercase()
    if (lowercase == "3dfx") return "$openglPackage.threedfx"
    return "$openglPackage.$lowercase"
}

val featureExtends = mapOf(
    "1.1" to "10",
    "1.2" to "11",
    "1.3" to "12",
    "1.4" to "13",
    "1.5" to "14",
    "2.0" to "15",
    "2.1" to "20",
    "3.0" to "21",
    "3.1" to "30",
    "3.2" to "31",
    "3.3" to "32",
    "4.0" to "33",
    "4.1" to "40",
    "4.2" to "41",
    "4.3" to "42",
    "4.4" to "43",
    "4.5" to "44",
    "4.6" to "45",
)
val featurePermits = mapOf(
    "1.0" to "11",
    "1.1" to "12",
    "1.2" to "13",
    "1.3" to "14",
    "1.4" to "15",
    "1.5" to "20",
    "2.0" to "21",
    "2.1" to "30",
    "3.0" to "31",
    "3.1" to "32",
    "3.2" to "33",
    "3.3" to "40",
    "4.0" to "41",
    "4.1" to "42",
    "4.2" to "43",
    "4.3" to "44",
    "4.4" to "45",
    "4.5" to "46",
    "4.6" to "",
)

private fun useStack(code: String): String =
    "try (var __stack = MemoryStack.pushLocal()) { $code }"

enum class GLDataType(
    val stackAlloc: String,
    val segmentGet: String,
) {
    BOOLEAN("__stack.bytes((byte) 0)", "get(ValueLayout.JAVA_BOOLEAN, 0)"),
    INTEGER("__stack.ints(0)", "get(ValueLayout.JAVA_INT, 0)"),
    LONG("__stack.longs(0)", "get(ValueLayout.JAVA_LONG, 0)"),
    FLOAT("__stack.floats(0)", "get(ValueLayout.JAVA_FLOAT, 0)"),
    DOUBLE("__stack.doubles(0)", "get(ValueLayout.JAVA_DOUBLE, 0)"),
}

fun featureCustomCode(number: String): String? {
    return when (number) {
        "1.0" -> {
            fun GetTypev(type: GLDataType, name: String, param: String): String =
                useStack(
                    "var p = ${type.stackAlloc}; $name($param, p); return p.${type.segmentGet};"
                )
            """
                public boolean GetBooleanv(@CType("GLenum") int pname) { ${
                GetTypev(
                    GLDataType.BOOLEAN,
                    "GetBooleanv",
                    "pname"
                )
            } }
                public double GetDoublev(@CType("GLenum") int pname) { ${
                GetTypev(
                    GLDataType.DOUBLE,
                    "GetDoublev",
                    "pname"
                )
            } }
                public float GetFloatv(@CType("GLenum") int pname) { ${
                GetTypev(
                    GLDataType.FLOAT,
                    "GetFloatv",
                    "pname"
                )
            } }
                public int GetIntegerv(@CType("GLenum") int pname) { ${
                GetTypev(
                    GLDataType.INTEGER,
                    "GetIntegerv",
                    "pname"
                )
            } }
                public String GetString_(@CType("GLenum") int pname) { return Unmarshal.unmarshalAsString(GetString(pname)); }
                public float GetTexParameterfv(@CType("GLenum") int target, @CType("GLenum") int pname) { ${
                GetTypev(
                    GLDataType.FLOAT,
                    "GetTexParameterfv",
                    "target, pname"
                )
            } }
                public int GetTexParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname) { ${
                GetTypev(
                    GLDataType.INTEGER,
                    "GetTexParameteriv",
                    "target, pname"
                )
            } }
                public float GetTexLevelParameterfv(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname) { ${
                GetTypev(
                    GLDataType.FLOAT,
                    "GetTexLevelParameterfv",
                    "target, level, pname"
                )
            } }
                public int GetTexLevelParameteriv(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname) { ${
                GetTypev(
                    GLDataType.INTEGER,
                    "GetTexLevelParameteriv",
                    "target, level, pname"
                )
            } }
            """.trimIndent()
        }

        "1.1" -> """
            public void DeleteTextures(int texture) { ${useStack("DeleteTextures(1, __stack.ints(texture));")} }
            public int GenTextures() { ${useStack("var p = __stack.ints(0); GenTextures(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
        """.trimIndent()

        "1.5" -> """
            public int GenQueries() { ${useStack("var p = __stack.ints(0); GenQueries(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public void DeleteQueries(int id) { ${useStack("DeleteQueries(1, __stack.ints(id));")} }
            public int GetQueryiv(@CType("GLenum") int target, @CType("GLenum") int pname) { ${useStack("var p = __stack.ints(0); GetQueryiv(target, pname, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public int GetQueryObjectiv(@CType("GLuint") int id, @CType("GLenum") int pname) { ${useStack("var p = __stack.ints(0); GetQueryObjectiv(id, pname, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public int GetQueryObjectuiv(@CType("GLuint") int id, @CType("GLenum") int pname) { ${useStack("var p = __stack.ints(0); GetQueryObjectuiv(id, pname, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public void DeleteBuffers(int buffer) { ${useStack("DeleteBuffers(1, __stack.ints(buffer));")} }
            public int GenBuffers() { ${useStack("var p = __stack.ints(0); GenBuffers(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public void BufferData(@CType("GLenum") int target, @CType("const void *") MemorySegment data, @CType("GLenum") int usage) { BufferData(target, data.byteSize(), data, usage); }
            public int GetBufferParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname) { ${useStack("var p = __stack.ints(0); GetBufferParameteriv(target, pname, p); return p.${GLDataType.INTEGER.segmentGet};")} }
        """.trimIndent()

        "2.0" -> """
            public void BindAttribLocation(@CType("GLuint") int program, @CType("GLuint") int index, @CType("const GLchar *") String name) { ${
            useStack(
                "BindAttribLocation(program, index, Marshal.marshal(__stack, name));"
            )
        } }
            public int GetAttribLocation(@CType("GLuint") int program, @CType("const GLchar *") String name) { ${
            useStack(
                "return GetAttribLocation(program, Marshal.marshal(__stack, name));"
            )
        } }
            public int GetProgramiv(@CType("GLuint") int program, @CType("GLenum") int pname) { ${useStack("var p = __stack.ints(0); GetProgramiv(program, pname, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public String GetProgramInfoLog(@CType("GLuint") int program) { ${
            useStack(
                "int sz = GetProgramiv(program, GL_INFO_LOG_LENGTH); var p = __stack.allocate(ValueLayout.JAVA_BYTE, sz); GetProgramInfoLog(program, sz, MemorySegment.NULL, p); return Unmarshal.unmarshalStringPointer(p);"
            )
        } }
            public int GetShaderiv(@CType("GLuint") int shader, @CType("GLenum") int pname) { ${useStack("var p = __stack.ints(0); GetShaderiv(shader, pname, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public String GetShaderInfoLog(@CType("GLuint") int shader) { ${
            useStack(
                "int sz = GetShaderiv(shader, GL_INFO_LOG_LENGTH); var p = __stack.allocate(ValueLayout.JAVA_BYTE, sz); GetShaderInfoLog(shader, sz, MemorySegment.NULL, p); return Unmarshal.unmarshalStringPointer(p);"
            )
        } }
            public int GetUniformLocation(@CType("GLuint") int program, @CType("const GLchar *") String name) { ${
            useStack(
                "return GetUniformLocation(program, Marshal.marshal(__stack, name));"
            )
        } }
            public void ShaderSource(@CType("GLuint") int shader, String string) { ${useStack("ShaderSource(shader, 1, __stack.addresses(Marshal.marshal(__stack, string)), MemorySegment.NULL);")} }
        """.trimIndent()

        "3.0" -> """
            public boolean GetBooleani_v(@CType("GLenum") int target, @CType("GLuint") int index) { ${useStack("var p = ${GLDataType.BOOLEAN.stackAlloc}; GetBooleani_v(target, index, p); return p.${GLDataType.BOOLEAN.segmentGet};")} }
            public int GetIntegeri_v(@CType("GLenum") int target, @CType("GLuint") int index) { ${useStack("var p = ${GLDataType.INTEGER.stackAlloc}; GetIntegeri_v(target, index, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public void BindFragDataLocation(@CType("GLuint") int program, @CType("GLuint") int color, @CType("const GLchar *") String name) { ${
            useStack(
                "BindFragDataLocation(program, color, Marshal.marshal(__stack, name));"
            )
        } }
            public int GetFragDataLocation(@CType("GLuint") int program, @CType("const GLchar *") String name) { ${
            useStack(
                "return GetFragDataLocation(program, Marshal.marshal(__stack, name));"
            )
        } }
            public String GetStringi_(@CType("GLenum") int name, @CType("GLuint") int index) { return Unmarshal.unmarshalAsString(GetStringi(name, index)); }
            public void DeleteRenderbuffers(int renderbuffer) { ${useStack("DeleteRenderbuffers(1, __stack.ints(renderbuffer));")} }
            public int GenRenderbuffers() { ${useStack("var p = __stack.ints(0); GenRenderbuffers(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public int GetRenderbufferParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname) { ${
            useStack(
                "var p = __stack.ints(0); GetRenderbufferParameteriv(target, pname, p); return p.${GLDataType.INTEGER.segmentGet};"
            )
        } }
            public void DeleteFramebuffers(int framebuffer) { ${useStack("DeleteFramebuffers(1, __stack.ints(framebuffer));")} }
            public int GenFramebuffers() { ${useStack("var p = __stack.ints(0); GenFramebuffers(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public int GetFramebufferAttachmentParameteriv(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int pname) { ${
            useStack(
                "var p = __stack.ints(0); GetFramebufferAttachmentParameteriv(target, attachment, pname, p); return p.${GLDataType.INTEGER.segmentGet};"
            )
        } }
            public void DeleteVertexArrays(int array) { ${useStack("DeleteVertexArrays(1, __stack.ints(array));")} }
            public int GenVertexArrays() { ${useStack("var p = __stack.ints(0); GenVertexArrays(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
        """.trimIndent()

        "3.2" -> """
            public long GetInteger64i_v(@CType("GLenum") int target, @CType("GLuint") int index) { ${useStack("var p = __stack.longs(0); GetInteger64i_v(target, index, p); return p.${GLDataType.LONG.segmentGet};")} }
            public long GetBufferParameteri64v(@CType("GLenum") int target, @CType("GLenum") int pname) { ${useStack("var p = __stack.longs(0); GetBufferParameteri64v(target, pname, p); return p.${GLDataType.LONG.segmentGet};")} }
        """.trimIndent()

        "3.3" -> """
            public int GetFragDataIndex(@CType("GLuint") int program, @CType("const GLchar *") String name) { ${
            useStack(
                "return GetFragDataIndex(program, Marshal.marshal(__stack, name));"
            )
        } }
            public int GenSamplers() { ${useStack("var p = __stack.ints(0); GenSamplers(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public void DeleteSamplers(int sampler) { ${useStack("DeleteSamplers(1, __stack.ints(sampler));")} }
        """.trimIndent()

        "4.0" -> """
            public int GetSubroutineUniformLocation(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") String name) { ${
            useStack(
                "return GetSubroutineUniformLocation(program, shadertype, Marshal.marshal(__stack, name));"
            )
        } }
            public int GetSubroutineIndex(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") String name) { ${
            useStack(
                "return GetSubroutineIndex(program, shadertype, Marshal.marshal(__stack, name));"
            )
        } }
            public void DeleteTransformFeedbacks(int id) { ${useStack("DeleteTransformFeedbacks(1, __stack.ints(id));")} }
            public int GenTransformFeedbacks() { ${useStack("var p = __stack.ints(0); GenTransformFeedbacks(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
        """.trimIndent()

        "4.1" -> """
            public void DeleteProgramPipelines(int pipeline) { ${useStack("DeleteProgramPipelines(1, __stack.ints(pipeline));")} }
            public int GenProgramPipelines() { ${useStack("var p = __stack.ints(0); GenProgramPipelines(1, p); return p.${GLDataType.INTEGER.segmentGet};")} }
            public float GetFloati_v(@CType("GLenum") int target, @CType("GLuint") int index) { ${useStack("var p = ${GLDataType.FLOAT.stackAlloc}; GetFloati_v(target, index, p); return p.${GLDataType.FLOAT.segmentGet};")} }
            public double GetDoublei_v(@CType("GLenum") int target, @CType("GLuint") int index) { ${useStack("var p = ${GLDataType.DOUBLE.stackAlloc}; GetDoublei_v(target, index, p); return p.${GLDataType.DOUBLE.segmentGet};")} }
        """.trimIndent()

        "4.3" -> """
            public void DebugMessageCallback(Arena arena, @CType("GLDEBUGPROC") GLDebugProc callback, @CType("const void *") MemorySegment userParam) { DebugMessageCallback(Marshal.marshal(arena, callback), userParam); }
        """.trimIndent()

        "4.5" -> {
            fun Create(name: String, target: Boolean = false) =
                "public int Create$name(${if (target) """@CType("GLenum") int target""" else ""}) { ${useStack("var p = __stack.ints(0); Create$name(${if (target) "target, " else ""}1, p); return p.${GLDataType.INTEGER.segmentGet};")} }"
            """
                ${Create("TransformFeedbacks")}
                ${Create("Buffers")}
                public void NamedBufferData(@CType("GLuint") int buffer, @CType("const void *") MemorySegment data, @CType("GLenum") int usage) { NamedBufferData(buffer, data.byteSize(), data, usage); }
                public int GetNamedBufferParameteriv(@CType("GLuint") int buffer, @CType("GLenum") int pname) { ${
                useStack(
                    "var p = ${GLDataType.INTEGER.stackAlloc}; GetNamedBufferParameteriv(buffer, pname, p); return p.${GLDataType.INTEGER.segmentGet};"
                )
            } }
                public long GetNamedBufferParameteri64v(@CType("GLuint") int buffer, @CType("GLenum") int pname) { ${
                useStack(
                    "var p = ${GLDataType.LONG.stackAlloc}; GetNamedBufferParameteri64v(buffer, pname, p); return p.${GLDataType.LONG.segmentGet};"
                )
            } }
                ${Create("Framebuffers")}
                ${Create("Renderbuffers")}
                ${Create("Textures", true)}
                ${Create("VertexArrays")}
                ${Create("Samplers")}
                ${Create("ProgramPipelines")}
                ${Create("Queries", true)}
            """.trimIndent()
        }

        else -> null
    }
}

fun isAOlder(a: String, b: String): Boolean {
    val splitA = a.split('.')
    val splitB = b.split('.')
    val majorA = splitA[0].toInt()
    val majorB = splitB[0].toInt()
    val minorA = splitA[1].toInt()
    val minorB = splitB[1].toInt()
    if (majorA < majorB) return true
    if (majorA > majorB) return false
    return minorA < minorB
}

fun readTypeFromNode(root: Node, dst: MutableList<GLTypeRef>): String? {
    var name: String? = null
    for (i in 0 until root.childNodes.length) {
        when (val node = root.childNodes.item(i)) {
            is Text -> {
                if (node.wholeText.isNotBlank()) {
                    dst.add(GLTypeRefLiteral(node.wholeText.trim()))
                }
            }

            is Element -> {
                when (node.tagName) {
                    "ptype" -> dst.add(GLTypeRefPType(node.textContent.trim()))
                    "name" -> name = node.textContent.trim()
                }
            }
        }
    }
    return name
}

val typeMap = mutableMapOf<String, CustomTypeSpec>().also {
    it["void"] = void
    it["void *"] = void_ptr
    it["void **"] = address c "void **"
    it["const void **"] = address c "const void **"
    it["const void *const*"] = address c "const void *const*"

    it["GLhandleARB *"] = address c "GLhandleARB *"
    it["GLenum *"] = jint_array c "GLenum *"
    it["GLfixed *"] = jint_array c "GLfixed *"
    it["GLsizei *"] = jint_array c "GLsizei *"
    it["GLboolean *"] = address c "GLboolean *"
    it["GLchar *"] = address c "GLchar *"
    it["GLcharARB *"] = address c "GLcharARB *"
    it["GLubyte *"] = jbyte_array c "GLubyte *"
    it["GLushort *"] = jshort_array c "GLushort *"
    it["GLint *"] = jint_array c "GLint *"
    it["GLuint *"] = jint_array c "GLuint *"
    it["GLint64 *"] = jlong_array c "GLint64 *"
    it["GLuint64 *"] = jlong_array c "GLuint64 *"
    it["GLint64EXT *"] = jlong_array c "GLint64EXT *"
    it["GLuint64EXT *"] = jlong_array c "GLuint64EXT *"
    it["GLfloat *"] = jfloat_array c "GLfloat *"
    it["GLdouble *"] = jdouble_array c "GLdouble *"

    it["const GLenum *"] = jint_array c "const GLenum *"
    it["const GLfixed *"] = jint_array c "const GLfixed *"
    it["const GLsizei *"] = jint_array c "const GLsizei *"
    it["const GLchar *const*"] = address c "const GLchar *const*"
    it["const GLcharARB *"] = address c "const GLcharARB *"
    it["const GLcharARB **"] = address c "const GLcharARB **"
    it["const GLboolean *"] = address c "const GLboolean *"
    it["const GLboolean **"] = address c "const GLboolean **"
    it["const GLbyte *"] = jbyte_array c "const GLbyte *"
    it["const GLubyte *"] = jbyte_array c "const GLubyte *"
    it["const GLshort *"] = jshort_array c "const GLshort *"
    it["const GLushort *"] = jshort_array c "const GLushort *"
    it["const GLhalfNV *"] = jshort_array c "const GLhalfNV *"
    it["const GLint *"] = jint_array c "const GLint *"
    it["const GLuint *"] = jint_array c "const GLuint *"
    it["const GLint64 *"] = jlong_array c "const GLint64 *"
    it["const GLuint64 *"] = jlong_array c "const GLuint64 *"
    it["const GLint64EXT *"] = jlong_array c "const GLint64EXT *"
    it["const GLuint64EXT *"] = jlong_array c "const GLuint64EXT *"
    it["const GLintptr *"] = jlong_array c "const GLintptr *"
    it["const GLsizeiptr *"] = jlong_array c "const GLsizeiptr *"
    it["const GLvdpauSurfaceNV *"] = jlong_array c "const GLvdpauSurfaceNV *"
    it["const GLfloat *"] = jfloat_array c "const GLfloat *"
    it["const GLdouble *"] = jdouble_array c "const GLdouble *"
    it["const GLclampf *"] = jfloat_array c "const GLclampf *"

    it["struct _cl_context *"] = address c "struct _cl_context *"
    it["struct _cl_event *"] = address c "struct _cl_event *"
}

fun ptype(type: CustomTypeSpec, name: String): CustomTypeSpec {
    val spec = type c name
    typeMap[name] = spec
    return spec
}

fun computeRawType(type: GLType): String = type.tokens.joinToString(" ")
fun computePType(type: GLType): CustomTypeSpec {
    val rawType = computeRawType(type)
    val res = typeMap[rawType]
    if (res == null) {
        recordingErrorType.add(rawType)
        return int
    } else {
        return res
    }
}

fun computeFunctionDescriptor(command: GLCommand): String {
    val returnTypeSpec = computePType(command.type)
    val paramTypeSpecs = command.params.map { computePType(it.type) }
    return buildString {
        append("FunctionDescriptor.of")
        if (returnTypeSpec.carrier == TypeName.VOID) {
            append("Void(")
        } else {
            append("(")
            append(returnTypeSpec.layout!!)
            if (paramTypeSpecs.isNotEmpty()) {
                append(", ")
            }
        }
        append(paramTypeSpecs.joinToString(", ") { it.layout!! })
        append(")")
    }
}

val khronos_int8_t = ptype(jbyte, "khronos_int8_t")
val khronos_uint8_t = ptype(jbyte, "khronos_uint8_t")
val khronos_int16_t = ptype(jshort, "khronos_int16_t")
val khronos_uint16_t = ptype(jshort, "khronos_uint16_t")
val khronos_int32_t = ptype(jint, "khronos_int32_t")
val khronos_uint32_t = ptype(jint, "khronos_uint32_t")
val khronos_int64_t = ptype(jlong, "khronos_int64_t")
val khronos_uint64_t = ptype(jlong, "khronos_uint64_t")
val khronos_intptr_t = ptype(jlong, "khronos_intptr_t")
val khronos_uintptr_t = ptype(jlong, "khronos_uintptr_t")
val khronos_ssize_t = ptype(jlong, "khronos_ssize_t")
val khronos_usize_t = ptype(jlong, "khronos_usize_t")
val khronos_float_t = ptype(jfloat, "khronos_float_t")

val GLenum = ptype(uint, "GLenum")
val GLboolean = ptype(/*uchar*/jboolean, "GLboolean")
val GLbitfield = ptype(uint, "GLbitfield")
val GLbyte = ptype(khronos_int8_t, "GLbyte")
val GLubyte = ptype(khronos_uint8_t, "GLubyte")
val GLshort = ptype(khronos_int16_t, "GLshort")
val GLushort = ptype(khronos_uint16_t, "GLushort")
val GLint = ptype(int, "GLint")
val GLuint = ptype(uint, "GLuint")
val GLclampx = ptype(khronos_int32_t, "GLclampx")
val GLsizei = ptype(int, "GLsizei")
val GLfloat = ptype(khronos_float_t, "GLfloat")
val GLclampf = ptype(khronos_float_t, "GLclampf")
val GLdouble = ptype(double, "GLdouble")
val GLclampd = ptype(double, "GLclampd")
val GLeglClientBufferEXT = ptype(address, "GLeglClientBufferEXT")
val GLeglImageOES = ptype(address, "GLeglImageOES")
val GLchar = ptype(char, "GLchar")
val GLcharARB = ptype(char, "GLcharARB")

/*
   Note: this is defined as void* on __APPLE__
 */
val GLhandleARB = ptype(uint, "GLhandleARB")

val GLhalf = ptype(khronos_uint16_t, "GLhalf")
val GLhalfARB = ptype(khronos_uint16_t, "GLhalfARB")
val GLfixed = ptype(khronos_int32_t, "GLfixed")
val GLintptr = ptype(khronos_intptr_t, "GLintptr")
val GLintptrARB = ptype(khronos_intptr_t, "GLintptrARB")
val GLsizeiptr = ptype(khronos_ssize_t, "GLsizeiptr")
val GLsizeiptrARB = ptype(khronos_ssize_t, "GLsizeiptrARB")
val GLint64 = ptype(khronos_int64_t, "GLint64")
val GLint64EXT = ptype(khronos_int64_t, "GLint64EXT")
val GLuint64 = ptype(khronos_uint64_t, "GLuint64")
val GLuint64EXT = ptype(khronos_uint64_t, "GLuint64EXT")
val GLsync = ptype(address, "GLsync")
val GLDEBUGPROC = ptype(generateUpcallType(openglPackage, "GLDebugProc"), "GLDEBUGPROC")
val GLDEBUGPROCARB = ptype(GLDEBUGPROC, "GLDEBUGPROCARB")
val GLDEBUGPROCKHR = ptype(GLDEBUGPROC, "GLDEBUGPROCKHR")
val GLDEBUGPROCAMD = ptype(generateUpcallType(extPackage("AMD"), "GLDebugProcAMD"), "GLDEBUGPROCAMD")
val GLhalfNV = ptype(ushort, "GLhalfNV")
val GLvdpauSurfaceNV = ptype(GLintptr, "GLvdpauSurfaceNV")
val GLVULKANPROCNV = ptype(generateUpcallType(extPackage("NV"), "GLVulkanProcNV"), "GLVULKANPROCNV")

val const_GLchar_ptr = ptype(address, "const GLchar *")
val const_void_ptr = ptype(address, "const void *")

fun main() {
    val xmlFactory = DocumentBuilderFactory.newInstance()
    val xmlBuilder = xmlFactory.newDocumentBuilder()
    val document = ClassLoader.getSystemResourceAsStream("gl.xml")!!.use { xmlBuilder.parse(it) }
    val root = document.documentElement

    // enums
    val enumMap = mutableMapOf<String, GLEnum>()
    root.getElementsByTagName("enums").also {
        for (i in 0 until it.length) {
            it.item(i).childNodes.also { enums ->
                for (j in 0 until enums.length) {
                    enums.item(j).also { enum ->
                        if (enum is Element && enum.tagName == "enum") {
                            val value = enum.getAttribute("value")
                            val name = enum.getAttribute("name")
                            val type = if (enum.hasAttribute("type")) enum.getAttribute("type") else null
                            enumMap[name] = GLEnum(name = name, value = value, type = type)
                        }
                    }
                }
            }
        }
    }

    // commands
    val commandMap = mutableMapOf<String, GLCommand>()
    val aliasMap = mutableMapOf<String, MutableList<String>>()
    root.getElementsByTagName("commands").also {
        for (i in 0 until it.length) {
            it.item(i).childNodes.also { commands ->
                for (j in 0 until commands.length) {
                    commands.item(j).childNodes.also { command ->
                        if (command is Element && command.tagName == "command") {
                            // type and name
                            val proto = command.getElementsByTagName("proto").item(0) as Element
                            val type = mutableListOf<GLTypeRef>()
                            val name = readTypeFromNode(proto, type)

                            // parameters
                            val paramsList = mutableListOf<GLCommandParam>()
                            val params = command.getElementsByTagName("param")
                            for (i1 in 0 until params.length) {
                                val param = params.item(i1) as Element
                                val paramType = mutableListOf<GLTypeRef>()
                                val paramName = readTypeFromNode(param, paramType)
                                paramsList.add(GLCommandParam(GLType(paramType), paramName!!))
                            }

                            // alias
                            val aliases = command.getElementsByTagName("alias")
                            for (i1 in 0 until aliases.length) {
                                val alias = aliases.item(i1) as Element
                                aliasMap.computeIfAbsent(alias.getAttribute("name")) { mutableListOf() }
                                    .add(name!!)
                            }

                            commandMap[name!!] = GLCommand(GLType(type), name, paramsList)
                        }
                    }
                }
            }
        }
    }

    // features
    val features = mutableListOf<GLFeature>()
    val removeEnums = mutableListOf<GLRemoveEnum>()
    val removeCommands = mutableListOf<GLRemoveCommand>()
    val featureList = root.getElementsByTagName("feature")
    for (i in 0 until featureList.length) {
        val feature = featureList.item(i) as Element
        if (feature.getAttribute("api") == "gl") {
            val number = feature.getAttribute("number")
            val featureRequires = mutableListOf<GLRequire>()
            feature.getElementsByTagName("require").also { nodeList ->
                for (i1 in 0 until nodeList.length) {
                    val require = nodeList.item(i1) as Element
                    val reqEnums = mutableListOf<GLRequireEnum>()
                    val reqCommands = mutableListOf<GLRequireCommand>()
                    require.getElementsByTagName("enum").also {
                        for (i2 in 0 until it.length) {
                            val node = it.item(i2) as Element
                            reqEnums.add(GLRequireEnum(node.getAttribute("name")))
                        }
                    }
                    require.getElementsByTagName("command").also {
                        for (i2 in 0 until it.length) {
                            val node = it.item(i2) as Element
                            reqCommands.add(GLRequireCommand(node.getAttribute("name")))
                        }
                    }
                    featureRequires.add(
                        GLRequire(
                            profile = if (require.hasAttribute("profile"))
                                require.getAttribute("profile")
                            else null,
                            reqEnums,
                            reqCommands
                        )
                    )
                }
            }
            feature.getElementsByTagName("remove").also { nodeList ->
                for (i1 in 0 until nodeList.length) {
                    val remove = nodeList.item(i1) as Element
                    remove.getElementsByTagName("enum").also {
                        for (i2 in 0 until it.length) {
                            val node = it.item(i2) as Element
                            removeEnums.add(GLRemoveEnum(node.getAttribute("name"), number))
                        }
                    }
                    remove.getElementsByTagName("command").also {
                        for (i2 in 0 until it.length) {
                            val node = it.item(i2) as Element
                            removeCommands.add(GLRemoveCommand(node.getAttribute("name"), number))
                        }
                    }
                }
            }
            features.add(GLFeature(number, featureRequires))
        }
    }

    fun InstanceDowncall.addEnum(enum: GLRequireEnum) {
        val get = enumMap[enum.name]!!
        val longType = get.type == "ull"
        field(
            InstanceDowncallField(
                modifier = "static",
                type = if (longType) "long" else "int",
                name = get.name,
                value = if (longType) "${get.value}L" else get.value
            )
        )
    }

    fun InstanceDowncall.addCommand(command: GLRequireCommand) {
        val get = commandMap[command.name]!!
        // handles
        field(
            InstanceDowncallField(
                modifier = "static",
                type = "MethodHandle",
                name = "MH_${get.name}",
                value = "RuntimeHelper.downcall(${computeFunctionDescriptor(get)})"
            )
        )

        // address
        field(
            InstanceDowncallField(
                type = "MemorySegment",
                name = "PFN_${get.name}"
            )
        )

        method(
            InstanceDowncallMethod(
                returnType = computePType(get.type),
                name = get.name.substring(2),
                params = get.params.map { InstanceDowncallParameter(computePType(it.type), it.name) },
                entrypoint = get.name
            )
        )
    }

    // core
    val featureAddedEnums = mutableListOf<String>()
    val featureAddedCommands = mutableListOf<String>()
    features.forEach { feature ->
        InstanceDowncall(openglPackage, "GL${feature.number.replace(".", "")}") {
            modifier = "sealed"
            featureExtends[feature.number]?.also { extends("GL${it}") }
            featurePermits[feature.number]?.also { permits("GL${it}") }
            constructorParam = "GLLoadFunc func"
            constructorCode = buildString {
                if (feature.number != "1.0") {
                    appendLine("super(func);")
                }
                val thisFeatureAddedCommand = mutableListOf<String>()
                var i = 0
                feature.coreForEach(removeCommands, GLRequire::commands) { command ->
                    if (command.name !in thisFeatureAddedCommand &&
                        command.name !in featureAddedCommands
                    ) {
                        if (i > 0) {
                            appendLine()
                        }
                        val get = commandMap[command.name]!!
                        append("""PFN_${get.name} = func.invoke("${get.name}"""")
                        aliasMap[get.name]?.forEach { append(""", "$it"""") }
                        append(""");""")
                        i++
                        thisFeatureAddedCommand.add(command.name)
                    }
                }
            }
            customCode = featureCustomCode(feature.number)

            feature.coreForEach(removeEnums, GLRequire::enums) {
                if (it.name !in featureAddedEnums) {
                    addEnum(it)
                    featureAddedEnums.add(it.name)
                }
            }
            feature.coreForEach(removeCommands, GLRequire::commands) {
                if (it.name !in featureAddedCommands) {
                    addCommand(it)
                    featureAddedCommands.add(it.name)
                }
            }
        }
    }

    // compatibility
    // not going to add removed features

    // extension
    val extensions = mutableListOf<GLExtension>()
    val extensionList = (root.getElementsByTagName("extensions").item(0) as Element)
        .getElementsByTagName("extension")
    for (i in 0 until extensionList.length) {
        val extension = extensionList.item(i) as Element
        val supported = extension.getAttribute("supported")
        if (supported.split('|').contains("gl")) {
            val name = extension.getAttribute("name")
            val extensionRequires = mutableListOf<GLRequire>()
            val requireList = extension.getElementsByTagName("require")
            for (i1 in 0 until requireList.length) {
                val require = requireList.item(i1) as Element
                val requireEnums = mutableListOf<GLRequireEnum>()
                val requireCommands = mutableListOf<GLRequireCommand>()
                require.getElementsByTagName("enum").also {
                    for (i2 in 0 until it.length) {
                        val node = it.item(i2) as Element
                        requireEnums.add(GLRequireEnum(node.getAttribute("name")))
                    }
                }
                require.getElementsByTagName("command").also {
                    for (i2 in 0 until it.length) {
                        val node = it.item(i2) as Element
                        requireCommands.add(GLRequireCommand(node.getAttribute("name")))
                    }
                }
                extensionRequires.add(GLRequire(null, requireEnums, requireCommands))
            }
            extensions.add(GLExtension(name, extensionRequires))
        }
    }

    // generate extensions
    run {
        val vendors = mutableSetOf<String>()
        extensions.forEach { extension ->
            if (extension.requires.isNotEmpty()) {
                val vendor = extension.name.substring(3).substringBefore('_')
                vendors.add(vendor)

                Path(extPackage(vendor).replace('.', '/')).createDirectories()
            }
        }
        extensions.forEach { extension ->
            if (extension.requires.isNotEmpty()) {
                val vendor = extension.name.substring(3).substringBefore('_')
                val className = extension.name.split('_')
                    .joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
                InstanceDowncall(extPackage(vendor), className) {
                    modifier = "final"
                    if (extension.requires.all { it.commands.isEmpty() }) {
                        constructorModifier = "private"
                    } else {
                        constructorParam = "overrungl.opengl.GLLoadFunc func"
                        constructorCode = buildString {
                            extension.requires.forEach { require ->
                                require.commands.forEachIndexed { index, command ->
                                    if (index > 0) {
                                        appendLine()
                                    }
                                    val get = commandMap[command.name]!!
                                    append("""PFN_${get.name} = func.invoke("${get.name}"""")
                                    aliasMap.entries.find { it.value.contains(get.name) }?.key?.also { append(""", "$it"""") }
                                    append(");")
                                }
                            }
                        }
                    }

                    extension.requires.forEach { require ->
                        require.enums.forEach(::addEnum)
                        require.commands.forEach(::addCommand)
                    }
                }
            }
        }


        // generate module-info.java
        writeString(Path("module-info.java"), buildString {
            appendLine(commentedFileHeader)
            appendLine(
                """
                    /// The OpenGL binding.
                    ///
                    /// - [References](https://registry.khronos.org/OpenGL-Refpages/gl4/)
                    /// - [Registry](https://github.com/KhronosGroup/OpenGL-Registry)
                    module overrungl.opengl {
                        exports overrungl.opengl;
                """.trimIndent()
            )
            vendors.forEach { appendLine("    exports ${extPackage(it)};") }
            appendLine(
                """
                    |
                    |    requires transitive overrungl.core;
                    |    requires static org.jetbrains.annotations;
                """.trimMargin()
            )
            appendLine("}")
        })
    }

    // flags
    writeString(Path("overrungl/opengl/GLFlags.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine(
            """
                package $openglPackage;

                public final class GLFlags {
                    public final boolean GL10, GL11, GL12, GL13, GL14, GL15;
                    public final boolean GL20, GL21;
                    public final boolean GL30, GL31, GL32, GL33;
                    public final boolean GL40, GL41, GL42, GL43, GL44, GL45, GL46;
            """.trimIndent()
        )
        extensions.forEach { extension ->
            appendLine("    public final boolean ${extension.name};")
        }
        appendLine()
        appendLine(
            """
                |    public GLFlags(GLLoadFunc func) {
                |        var loader = new GLLoader(func);
                |        int version = loader.findCoreGL();
                |        int major = GLLoader.versionMajor(version), minor = GLLoader.versionMinor(version);
                |        GL10 = (major == 1 && minor >= 0) || major > 1;
                |        GL11 = (major == 1 && minor >= 1) || major > 1;
                |        GL12 = (major == 1 && minor >= 2) || major > 1;
                |        GL13 = (major == 1 && minor >= 3) || major > 1;
                |        GL14 = (major == 1 && minor >= 4) || major > 1;
                |        GL15 = (major == 1 && minor >= 5) || major > 1;
                |        GL20 = (major == 2 && minor >= 0) || major > 2;
                |        GL21 = (major == 2 && minor >= 1) || major > 2;
                |        GL30 = (major == 3 && minor >= 0) || major > 3;
                |        GL31 = (major == 3 && minor >= 1) || major > 3;
                |        GL32 = (major == 3 && minor >= 2) || major > 3;
                |        GL33 = (major == 3 && minor >= 3) || major > 3;
                |        GL40 = (major == 4 && minor >= 0) || major > 4;
                |        GL41 = (major == 4 && minor >= 1) || major > 4;
                |        GL42 = (major == 4 && minor >= 2) || major > 4;
                |        GL43 = (major == 4 && minor >= 3) || major > 4;
                |        GL44 = (major == 4 && minor >= 4) || major > 4;
                |        GL45 = (major == 4 && minor >= 5) || major > 4;
                |        GL46 = (major == 4 && minor >= 6) || major > 4;
                |        var exts = loader.getExtensions(version);
            """.trimMargin()
        )
        extensions.forEach { extension ->
            appendLine("""        ${extension.name} = loader.hasExtension(version, exts, "${extension.name}");""")
        }
        appendLine("    }")
        appendLine("}")
    })

    upcall()

    if (recordingErrorType.isNotEmpty()) {
        System.err.println("Recorded error types")
        recordingErrorType.forEach {
            System.err.println(it)
        }
    }
}

// Define special upcall
fun upcall() {
    Upcall(openglPackage, "GLDebugProc") {
        interfaceMethod = "invoke"(
            void,
            GLenum("source"),
            GLenum("type"),
            GLuint("id"),
            GLenum("severity"),
            (string_u8 c const_GLchar_ptr.cType)("message"),
            const_void_ptr("userParam")
        )
        targetMethod = "invoke"(
            void,
            GLenum("source"),
            GLenum("type"),
            GLuint("id"),
            GLenum("severity"),
            GLsizei("length"),
            const_GLchar_ptr("message"),
            const_void_ptr("userParam"),
            code = "invoke(source, type, id, severity, Unmarshal.unmarshalAsString(message), userParam);"
        )
        wrapperCode = """
            return (source, type, id, severity, message, userParam) -> { try (var stack = MemoryStack.pushLocal()) {
                var seg = Marshal.marshal(stack, message);
                invoke(stub, source, type, id, severity, Math.toIntExact(seg.byteSize()), seg, userParam);
            } };
        """.trimIndent()
    }

    Upcall(extPackage("AMD"), "GLDebugProcAMD") {
        interfaceMethod = "invoke"(
            void,
            GLuint("id"),
            GLenum("category"),
            GLenum("severity"),
            (string_u8 c const_GLchar_ptr.cType)("message"),
            void_ptr("userParam")
        )
        targetMethod = "invoke"(
            void,
            GLuint("id"),
            GLenum("category"),
            GLenum("severity"),
            GLsizei("length"),
            const_GLchar_ptr("message"),
            void_ptr("userParam"),
            code = "invoke(id, category, severity, Unmarshal.unmarshalAsString(message), userParam);"
        )
        wrapperCode = """
            return (id, category, severity, message, userParam) -> { try (var stack = MemoryStack.pushLocal()) {
                var seg = Marshal.marshal(stack, message);
                invoke(stub, id, category, severity, Math.toIntExact(seg.byteSize()), seg, userParam);
            } };
        """.trimIndent()
    }

    Upcall(extPackage("NV"), "GLVulkanProcNV") {
        targetMethod = "invoke"(void)
    }
}

data class GLEnum(val name: String, val value: String, val type: String?)

sealed interface GLTypeRef
data class GLType(val tokens: List<GLTypeRef>)

data class GLTypeRefLiteral(val text: String) : GLTypeRef {
    override fun toString(): String {
        return text
    }
}

data class GLTypeRefPType(val name: String) : GLTypeRef {
    override fun toString(): String {
        return name
    }
}

data class GLCommandParam(val type: GLType, val name: String)
data class GLCommand(val type: GLType, val name: String, val params: List<GLCommandParam>)

interface GLRequireEntry {
    val name: String
}

data class GLRequireEnum(override val name: String) : GLRequireEntry
data class GLRequireCommand(override val name: String) : GLRequireEntry

interface GLRemoveEntry {
    val name: String
    val removeNumber: String
}

data class GLRemoveEnum(override val name: String, override val removeNumber: String) : GLRemoveEntry
data class GLRemoveCommand(override val name: String, override val removeNumber: String) : GLRemoveEntry

data class GLRequire(val profile: String?, val enums: List<GLRequireEnum>, val commands: List<GLRequireCommand>)

data class GLFeature(val number: String, val requires: List<GLRequire>) {
    fun <T : GLRequireEntry> coreForEach(
        removed: List<GLRemoveEntry>,
        listGetter: (GLRequire) -> List<T>,
        action: (T) -> Unit
    ) {
        requires.forEach { require ->
            listGetter(require).forEach { e ->
                if ((require.profile == null && (removed.find { it.name == e.name }?.let {
                        isAOlder(it.removeNumber, number)
                    } != false)) ||
                    require.profile == "core"
                ) {
                    action(e)
                }
            }
        }
    }
}

data class GLExtension(val name: String, val requires: List<GLRequire>)
