// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_fragment_program`
public final class GLARBFragmentProgram {
    public static final int GL_FRAGMENT_PROGRAM_ARB = 0x8804;
    public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;
    public static final int GL_PROGRAM_LENGTH_ARB = 0x8627;
    public static final int GL_PROGRAM_FORMAT_ARB = 0x8876;
    public static final int GL_PROGRAM_BINDING_ARB = 0x8677;
    public static final int GL_PROGRAM_INSTRUCTIONS_ARB = 0x88A0;
    public static final int GL_MAX_PROGRAM_INSTRUCTIONS_ARB = 0x88A1;
    public static final int GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A2;
    public static final int GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB = 0x88A3;
    public static final int GL_PROGRAM_TEMPORARIES_ARB = 0x88A4;
    public static final int GL_MAX_PROGRAM_TEMPORARIES_ARB = 0x88A5;
    public static final int GL_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A6;
    public static final int GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB = 0x88A7;
    public static final int GL_PROGRAM_PARAMETERS_ARB = 0x88A8;
    public static final int GL_MAX_PROGRAM_PARAMETERS_ARB = 0x88A9;
    public static final int GL_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AA;
    public static final int GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB = 0x88AB;
    public static final int GL_PROGRAM_ATTRIBS_ARB = 0x88AC;
    public static final int GL_MAX_PROGRAM_ATTRIBS_ARB = 0x88AD;
    public static final int GL_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AE;
    public static final int GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB = 0x88AF;
    public static final int GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB = 0x88B4;
    public static final int GL_MAX_PROGRAM_ENV_PARAMETERS_ARB = 0x88B5;
    public static final int GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB = 0x88B6;
    public static final int GL_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x8805;
    public static final int GL_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x8806;
    public static final int GL_PROGRAM_TEX_INDIRECTIONS_ARB = 0x8807;
    public static final int GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x8808;
    public static final int GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x8809;
    public static final int GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x880A;
    public static final int GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB = 0x880B;
    public static final int GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB = 0x880C;
    public static final int GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB = 0x880D;
    public static final int GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x880E;
    public static final int GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x880F;
    public static final int GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x8810;
    public static final int GL_PROGRAM_STRING_ARB = 0x8628;
    public static final int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;
    public static final int GL_CURRENT_MATRIX_ARB = 0x8641;
    public static final int GL_TRANSPOSE_CURRENT_MATRIX_ARB = 0x88B7;
    public static final int GL_CURRENT_MATRIX_STACK_DEPTH_ARB = 0x8640;
    public static final int GL_MAX_PROGRAM_MATRICES_ARB = 0x862F;
    public static final int GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;
    public static final int GL_MAX_TEXTURE_COORDS_ARB = 0x8871;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS_ARB = 0x8872;
    public static final int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;
    public static final int GL_MATRIX0_ARB = 0x88C0;
    public static final int GL_MATRIX1_ARB = 0x88C1;
    public static final int GL_MATRIX2_ARB = 0x88C2;
    public static final int GL_MATRIX3_ARB = 0x88C3;
    public static final int GL_MATRIX4_ARB = 0x88C4;
    public static final int GL_MATRIX5_ARB = 0x88C5;
    public static final int GL_MATRIX6_ARB = 0x88C6;
    public static final int GL_MATRIX7_ARB = 0x88C7;
    public static final int GL_MATRIX8_ARB = 0x88C8;
    public static final int GL_MATRIX9_ARB = 0x88C9;
    public static final int GL_MATRIX10_ARB = 0x88CA;
    public static final int GL_MATRIX11_ARB = 0x88CB;
    public static final int GL_MATRIX12_ARB = 0x88CC;
    public static final int GL_MATRIX13_ARB = 0x88CD;
    public static final int GL_MATRIX14_ARB = 0x88CE;
    public static final int GL_MATRIX15_ARB = 0x88CF;
    public static final int GL_MATRIX16_ARB = 0x88D0;
    public static final int GL_MATRIX17_ARB = 0x88D1;
    public static final int GL_MATRIX18_ARB = 0x88D2;
    public static final int GL_MATRIX19_ARB = 0x88D3;
    public static final int GL_MATRIX20_ARB = 0x88D4;
    public static final int GL_MATRIX21_ARB = 0x88D5;
    public static final int GL_MATRIX22_ARB = 0x88D6;
    public static final int GL_MATRIX23_ARB = 0x88D7;
    public static final int GL_MATRIX24_ARB = 0x88D8;
    public static final int GL_MATRIX25_ARB = 0x88D9;
    public static final int GL_MATRIX26_ARB = 0x88DA;
    public static final int GL_MATRIX27_ARB = 0x88DB;
    public static final int GL_MATRIX28_ARB = 0x88DC;
    public static final int GL_MATRIX29_ARB = 0x88DD;
    public static final int GL_MATRIX30_ARB = 0x88DE;
    public static final int GL_MATRIX31_ARB = 0x88DF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProgramStringARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindProgramARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteProgramsARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenProgramsARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParameter4dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramEnvParameter4dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramEnvParameter4fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramEnvParameter4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParameter4dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramLocalParameter4dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramLocalParameter4fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramLocalParameter4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramEnvParameterdvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramEnvParameterfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramLocalParameterdvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramLocalParameterfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramStringARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsProgramARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glProgramStringARB;
        public final MemorySegment PFN_glBindProgramARB;
        public final MemorySegment PFN_glDeleteProgramsARB;
        public final MemorySegment PFN_glGenProgramsARB;
        public final MemorySegment PFN_glProgramEnvParameter4dARB;
        public final MemorySegment PFN_glProgramEnvParameter4dvARB;
        public final MemorySegment PFN_glProgramEnvParameter4fARB;
        public final MemorySegment PFN_glProgramEnvParameter4fvARB;
        public final MemorySegment PFN_glProgramLocalParameter4dARB;
        public final MemorySegment PFN_glProgramLocalParameter4dvARB;
        public final MemorySegment PFN_glProgramLocalParameter4fARB;
        public final MemorySegment PFN_glProgramLocalParameter4fvARB;
        public final MemorySegment PFN_glGetProgramEnvParameterdvARB;
        public final MemorySegment PFN_glGetProgramEnvParameterfvARB;
        public final MemorySegment PFN_glGetProgramLocalParameterdvARB;
        public final MemorySegment PFN_glGetProgramLocalParameterfvARB;
        public final MemorySegment PFN_glGetProgramivARB;
        public final MemorySegment PFN_glGetProgramStringARB;
        public final MemorySegment PFN_glIsProgramARB;
        private Handles(GLLoadFunc func) {
            PFN_glProgramStringARB = func.invoke("glProgramStringARB");
            PFN_glBindProgramARB = func.invoke("glBindProgramARB", "glBindProgramNV");
            PFN_glDeleteProgramsARB = func.invoke("glDeleteProgramsARB", "glDeleteProgramsNV");
            PFN_glGenProgramsARB = func.invoke("glGenProgramsARB", "glGenProgramsNV");
            PFN_glProgramEnvParameter4dARB = func.invoke("glProgramEnvParameter4dARB");
            PFN_glProgramEnvParameter4dvARB = func.invoke("glProgramEnvParameter4dvARB");
            PFN_glProgramEnvParameter4fARB = func.invoke("glProgramEnvParameter4fARB");
            PFN_glProgramEnvParameter4fvARB = func.invoke("glProgramEnvParameter4fvARB");
            PFN_glProgramLocalParameter4dARB = func.invoke("glProgramLocalParameter4dARB");
            PFN_glProgramLocalParameter4dvARB = func.invoke("glProgramLocalParameter4dvARB");
            PFN_glProgramLocalParameter4fARB = func.invoke("glProgramLocalParameter4fARB");
            PFN_glProgramLocalParameter4fvARB = func.invoke("glProgramLocalParameter4fvARB");
            PFN_glGetProgramEnvParameterdvARB = func.invoke("glGetProgramEnvParameterdvARB");
            PFN_glGetProgramEnvParameterfvARB = func.invoke("glGetProgramEnvParameterfvARB");
            PFN_glGetProgramLocalParameterdvARB = func.invoke("glGetProgramLocalParameterdvARB");
            PFN_glGetProgramLocalParameterfvARB = func.invoke("glGetProgramLocalParameterfvARB");
            PFN_glGetProgramivARB = func.invoke("glGetProgramivARB");
            PFN_glGetProgramStringARB = func.invoke("glGetProgramStringARB");
            PFN_glIsProgramARB = func.invoke("glIsProgramARB", "glIsProgramNV");
        }
    }

    public GLARBFragmentProgram(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glProgramStringARB`.
    /// ```
    /// void glProgramStringARB((unsigned int) GLenum target, (unsigned int) GLenum format, (int) GLsizei len, const void* string);
    /// ```
    public void ProgramStringARB(int target, int format, int len, @NonNull MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramStringARB", target, format, len, string); }
        Handles.MH_glProgramStringARB.invokeExact(handles.PFN_glProgramStringARB, target, format, len, string); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramStringARB", e); }
    }

    /// Invokes `glBindProgramARB`.
    /// ```
    /// void glBindProgramARB((unsigned int) GLenum target, (unsigned int) GLuint program);
    /// ```
    public void BindProgramARB(int target, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindProgramARB)) throw new GLSymbolNotFoundError("Symbol not found: glBindProgramARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindProgramARB", target, program); }
        Handles.MH_glBindProgramARB.invokeExact(handles.PFN_glBindProgramARB, target, program); }
        catch (Throwable e) { throw new RuntimeException("error in BindProgramARB", e); }
    }

    /// Invokes `glDeleteProgramsARB`.
    /// ```
    /// void glDeleteProgramsARB((int) GLsizei n, const GLuint* programs);
    /// ```
    public void DeleteProgramsARB(int n, @NonNull MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteProgramsARB)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteProgramsARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteProgramsARB", n, programs); }
        Handles.MH_glDeleteProgramsARB.invokeExact(handles.PFN_glDeleteProgramsARB, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteProgramsARB", e); }
    }

    /// Invokes `glGenProgramsARB`.
    /// ```
    /// void glGenProgramsARB((int) GLsizei n, GLuint* programs);
    /// ```
    public void GenProgramsARB(int n, @NonNull MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenProgramsARB)) throw new GLSymbolNotFoundError("Symbol not found: glGenProgramsARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenProgramsARB", n, programs); }
        Handles.MH_glGenProgramsARB.invokeExact(handles.PFN_glGenProgramsARB, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in GenProgramsARB", e); }
    }

    /// Invokes `glProgramEnvParameter4dARB`.
    /// ```
    /// void glProgramEnvParameter4dARB((unsigned int) GLenum target, (unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void ProgramEnvParameter4dARB(int target, int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameter4dARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameter4dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameter4dARB", target, index, x, y, z, w); }
        Handles.MH_glProgramEnvParameter4dARB.invokeExact(handles.PFN_glProgramEnvParameter4dARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameter4dARB", e); }
    }

    /// Invokes `glProgramEnvParameter4dvARB`.
    /// ```
    /// void glProgramEnvParameter4dvARB((unsigned int) GLenum target, (unsigned int) GLuint index, const GLdouble* params);
    /// ```
    public void ProgramEnvParameter4dvARB(int target, int index, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameter4dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameter4dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameter4dvARB", target, index, params); }
        Handles.MH_glProgramEnvParameter4dvARB.invokeExact(handles.PFN_glProgramEnvParameter4dvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameter4dvARB", e); }
    }

    /// Invokes `glProgramEnvParameter4fARB`.
    /// ```
    /// void glProgramEnvParameter4fARB((unsigned int) GLenum target, (unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void ProgramEnvParameter4fARB(int target, int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameter4fARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameter4fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameter4fARB", target, index, x, y, z, w); }
        Handles.MH_glProgramEnvParameter4fARB.invokeExact(handles.PFN_glProgramEnvParameter4fARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameter4fARB", e); }
    }

    /// Invokes `glProgramEnvParameter4fvARB`.
    /// ```
    /// void glProgramEnvParameter4fvARB((unsigned int) GLenum target, (unsigned int) GLuint index, const GLfloat* params);
    /// ```
    public void ProgramEnvParameter4fvARB(int target, int index, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramEnvParameter4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramEnvParameter4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramEnvParameter4fvARB", target, index, params); }
        Handles.MH_glProgramEnvParameter4fvARB.invokeExact(handles.PFN_glProgramEnvParameter4fvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramEnvParameter4fvARB", e); }
    }

    /// Invokes `glProgramLocalParameter4dARB`.
    /// ```
    /// void glProgramLocalParameter4dARB((unsigned int) GLenum target, (unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void ProgramLocalParameter4dARB(int target, int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameter4dARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameter4dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameter4dARB", target, index, x, y, z, w); }
        Handles.MH_glProgramLocalParameter4dARB.invokeExact(handles.PFN_glProgramLocalParameter4dARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameter4dARB", e); }
    }

    /// Invokes `glProgramLocalParameter4dvARB`.
    /// ```
    /// void glProgramLocalParameter4dvARB((unsigned int) GLenum target, (unsigned int) GLuint index, const GLdouble* params);
    /// ```
    public void ProgramLocalParameter4dvARB(int target, int index, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameter4dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameter4dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameter4dvARB", target, index, params); }
        Handles.MH_glProgramLocalParameter4dvARB.invokeExact(handles.PFN_glProgramLocalParameter4dvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameter4dvARB", e); }
    }

    /// Invokes `glProgramLocalParameter4fARB`.
    /// ```
    /// void glProgramLocalParameter4fARB((unsigned int) GLenum target, (unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void ProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameter4fARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameter4fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameter4fARB", target, index, x, y, z, w); }
        Handles.MH_glProgramLocalParameter4fARB.invokeExact(handles.PFN_glProgramLocalParameter4fARB, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameter4fARB", e); }
    }

    /// Invokes `glProgramLocalParameter4fvARB`.
    /// ```
    /// void glProgramLocalParameter4fvARB((unsigned int) GLenum target, (unsigned int) GLuint index, const GLfloat* params);
    /// ```
    public void ProgramLocalParameter4fvARB(int target, int index, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramLocalParameter4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramLocalParameter4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramLocalParameter4fvARB", target, index, params); }
        Handles.MH_glProgramLocalParameter4fvARB.invokeExact(handles.PFN_glProgramLocalParameter4fvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramLocalParameter4fvARB", e); }
    }

    /// Invokes `glGetProgramEnvParameterdvARB`.
    /// ```
    /// void glGetProgramEnvParameterdvARB((unsigned int) GLenum target, (unsigned int) GLuint index, GLdouble* params);
    /// ```
    public void GetProgramEnvParameterdvARB(int target, int index, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramEnvParameterdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramEnvParameterdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramEnvParameterdvARB", target, index, params); }
        Handles.MH_glGetProgramEnvParameterdvARB.invokeExact(handles.PFN_glGetProgramEnvParameterdvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramEnvParameterdvARB", e); }
    }

    /// Invokes `glGetProgramEnvParameterfvARB`.
    /// ```
    /// void glGetProgramEnvParameterfvARB((unsigned int) GLenum target, (unsigned int) GLuint index, GLfloat* params);
    /// ```
    public void GetProgramEnvParameterfvARB(int target, int index, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramEnvParameterfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramEnvParameterfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramEnvParameterfvARB", target, index, params); }
        Handles.MH_glGetProgramEnvParameterfvARB.invokeExact(handles.PFN_glGetProgramEnvParameterfvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramEnvParameterfvARB", e); }
    }

    /// Invokes `glGetProgramLocalParameterdvARB`.
    /// ```
    /// void glGetProgramLocalParameterdvARB((unsigned int) GLenum target, (unsigned int) GLuint index, GLdouble* params);
    /// ```
    public void GetProgramLocalParameterdvARB(int target, int index, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramLocalParameterdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramLocalParameterdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramLocalParameterdvARB", target, index, params); }
        Handles.MH_glGetProgramLocalParameterdvARB.invokeExact(handles.PFN_glGetProgramLocalParameterdvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramLocalParameterdvARB", e); }
    }

    /// Invokes `glGetProgramLocalParameterfvARB`.
    /// ```
    /// void glGetProgramLocalParameterfvARB((unsigned int) GLenum target, (unsigned int) GLuint index, GLfloat* params);
    /// ```
    public void GetProgramLocalParameterfvARB(int target, int index, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramLocalParameterfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramLocalParameterfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramLocalParameterfvARB", target, index, params); }
        Handles.MH_glGetProgramLocalParameterfvARB.invokeExact(handles.PFN_glGetProgramLocalParameterfvARB, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramLocalParameterfvARB", e); }
    }

    /// Invokes `glGetProgramivARB`.
    /// ```
    /// void glGetProgramivARB((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramivARB(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramivARB", target, pname, params); }
        Handles.MH_glGetProgramivARB.invokeExact(handles.PFN_glGetProgramivARB, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramivARB", e); }
    }

    /// Invokes `glGetProgramStringARB`.
    /// ```
    /// void glGetProgramStringARB((unsigned int) GLenum target, (unsigned int) GLenum pname, void* string);
    /// ```
    public void GetProgramStringARB(int target, int pname, @NonNull MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramStringARB", target, pname, string); }
        Handles.MH_glGetProgramStringARB.invokeExact(handles.PFN_glGetProgramStringARB, target, pname, string); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramStringARB", e); }
    }

    /// Invokes `glIsProgramARB`.
    /// ```
    /// GLboolean glIsProgramARB((unsigned int) GLuint program);
    /// ```
    public boolean IsProgramARB(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsProgramARB)) throw new GLSymbolNotFoundError("Symbol not found: glIsProgramARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsProgramARB", program); }
        return (((byte) Handles.MH_glIsProgramARB.invokeExact(handles.PFN_glIsProgramARB, program)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsProgramARB", e); }
    }

}
