// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_ES2_compatibility`
public final class GLARBES2Compatibility {
    public static final int GL_FIXED = 0x140C;
    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
    public static final int GL_LOW_FLOAT = 0x8DF0;
    public static final int GL_MEDIUM_FLOAT = 0x8DF1;
    public static final int GL_HIGH_FLOAT = 0x8DF2;
    public static final int GL_LOW_INT = 0x8DF3;
    public static final int GL_MEDIUM_INT = 0x8DF4;
    public static final int GL_HIGH_INT = 0x8DF5;
    public static final int GL_SHADER_COMPILER = 0x8DFA;
    public static final int GL_SHADER_BINARY_FORMATS = 0x8DF8;
    public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8DF9;
    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
    public static final int GL_MAX_VARYING_VECTORS = 0x8DFC;
    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
    public static final int GL_RGB565 = 0x8D62;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glReleaseShaderCompiler = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glShaderBinary = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetShaderPrecisionFormat = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangef = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glClearDepthf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glReleaseShaderCompiler;
        public final MemorySegment PFN_glShaderBinary;
        public final MemorySegment PFN_glGetShaderPrecisionFormat;
        public final MemorySegment PFN_glDepthRangef;
        public final MemorySegment PFN_glClearDepthf;
        private Handles(GLLoadFunc func) {
            PFN_glReleaseShaderCompiler = func.invoke("glReleaseShaderCompiler");
            PFN_glShaderBinary = func.invoke("glShaderBinary");
            PFN_glGetShaderPrecisionFormat = func.invoke("glGetShaderPrecisionFormat");
            PFN_glDepthRangef = func.invoke("glDepthRangef");
            PFN_glClearDepthf = func.invoke("glClearDepthf");
        }
    }

    public GLARBES2Compatibility(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glReleaseShaderCompiler`.
    /// ```
    /// void glReleaseShaderCompiler();
    /// ```
    public void ReleaseShaderCompiler() {
        if (MemoryUtil.isNullPointer(handles.PFN_glReleaseShaderCompiler)) throw new GLSymbolNotFoundError("Symbol not found: glReleaseShaderCompiler");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReleaseShaderCompiler"); }
        Handles.MH_glReleaseShaderCompiler.invokeExact(handles.PFN_glReleaseShaderCompiler); }
        catch (Throwable e) { throw new RuntimeException("error in ReleaseShaderCompiler", e); }
    }

    /// Invokes `glShaderBinary`.
    /// ```
    /// void glShaderBinary((int) GLsizei count, const GLuint* shaders, (unsigned int) GLenum binaryFormat, const void* binary, (int) GLsizei length);
    /// ```
    public void ShaderBinary(int count, @NonNull MemorySegment shaders, int binaryFormat, @NonNull MemorySegment binary, int length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderBinary)) throw new GLSymbolNotFoundError("Symbol not found: glShaderBinary");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShaderBinary", count, shaders, binaryFormat, binary, length); }
        Handles.MH_glShaderBinary.invokeExact(handles.PFN_glShaderBinary, count, shaders, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderBinary", e); }
    }

    /// Invokes `glGetShaderPrecisionFormat`.
    /// ```
    /// void glGetShaderPrecisionFormat((unsigned int) GLenum shadertype, (unsigned int) GLenum precisiontype, GLint* range, GLint* precision);
    /// ```
    public void GetShaderPrecisionFormat(int shadertype, int precisiontype, @NonNull MemorySegment range, @NonNull MemorySegment precision) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShaderPrecisionFormat)) throw new GLSymbolNotFoundError("Symbol not found: glGetShaderPrecisionFormat");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetShaderPrecisionFormat", shadertype, precisiontype, range, precision); }
        Handles.MH_glGetShaderPrecisionFormat.invokeExact(handles.PFN_glGetShaderPrecisionFormat, shadertype, precisiontype, range, precision); }
        catch (Throwable e) { throw new RuntimeException("error in GetShaderPrecisionFormat", e); }
    }

    /// Invokes `glDepthRangef`.
    /// ```
    /// void glDepthRangef(((float) khronos_float_t) GLfloat n, ((float) khronos_float_t) GLfloat f);
    /// ```
    public void DepthRangef(float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangef)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangef");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthRangef", n, f); }
        Handles.MH_glDepthRangef.invokeExact(handles.PFN_glDepthRangef, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangef", e); }
    }

    /// Invokes `glClearDepthf`.
    /// ```
    /// void glClearDepthf(((float) khronos_float_t) GLfloat d);
    /// ```
    public void ClearDepthf(float d) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearDepthf)) throw new GLSymbolNotFoundError("Symbol not found: glClearDepthf");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearDepthf", d); }
        Handles.MH_glClearDepthf.invokeExact(handles.PFN_glClearDepthf, d); }
        catch (Throwable e) { throw new RuntimeException("error in ClearDepthf", e); }
    }

}
