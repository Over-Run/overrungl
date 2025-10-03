// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_separate_shader_objects`
public final class GLEXTSeparateShaderObjects {
    public static final int GL_ACTIVE_PROGRAM_EXT = 0x8B8D;
    public static final int GL_VERTEX_SHADER_BIT_EXT = 0x00000001;
    public static final int GL_FRAGMENT_SHADER_BIT_EXT = 0x00000002;
    public static final int GL_ALL_SHADER_BITS_EXT = 0xFFFFFFFF;
    public static final int GL_PROGRAM_SEPARABLE_EXT = 0x8258;
    public static final int GL_PROGRAM_PIPELINE_BINDING_EXT = 0x825A;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUseShaderProgramEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glActiveProgramEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateShaderProgramEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glActiveShaderProgramEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindProgramPipelineEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateShaderProgramvEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteProgramPipelinesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenProgramPipelinesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramPipelineInfoLogEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramPipelineivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsProgramPipelineEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramParameteriEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1fEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform1fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1iEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1ivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2fEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform2fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2iEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform2ivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3fEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform3fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3iEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform3ivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4fEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform4fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4iEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform4ivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUseProgramStagesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glValidateProgramPipelineEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1uiEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform2uiEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform3uiEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform4uiEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1uivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2uivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3uivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4uivEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x3fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x2fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x4fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x2fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x4fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x3fvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glUseShaderProgramEXT;
        public final MemorySegment PFN_glActiveProgramEXT;
        public final MemorySegment PFN_glCreateShaderProgramEXT;
        public final MemorySegment PFN_glActiveShaderProgramEXT;
        public final MemorySegment PFN_glBindProgramPipelineEXT;
        public final MemorySegment PFN_glCreateShaderProgramvEXT;
        public final MemorySegment PFN_glDeleteProgramPipelinesEXT;
        public final MemorySegment PFN_glGenProgramPipelinesEXT;
        public final MemorySegment PFN_glGetProgramPipelineInfoLogEXT;
        public final MemorySegment PFN_glGetProgramPipelineivEXT;
        public final MemorySegment PFN_glIsProgramPipelineEXT;
        public final MemorySegment PFN_glProgramParameteriEXT;
        public final MemorySegment PFN_glProgramUniform1fEXT;
        public final MemorySegment PFN_glProgramUniform1fvEXT;
        public final MemorySegment PFN_glProgramUniform1iEXT;
        public final MemorySegment PFN_glProgramUniform1ivEXT;
        public final MemorySegment PFN_glProgramUniform2fEXT;
        public final MemorySegment PFN_glProgramUniform2fvEXT;
        public final MemorySegment PFN_glProgramUniform2iEXT;
        public final MemorySegment PFN_glProgramUniform2ivEXT;
        public final MemorySegment PFN_glProgramUniform3fEXT;
        public final MemorySegment PFN_glProgramUniform3fvEXT;
        public final MemorySegment PFN_glProgramUniform3iEXT;
        public final MemorySegment PFN_glProgramUniform3ivEXT;
        public final MemorySegment PFN_glProgramUniform4fEXT;
        public final MemorySegment PFN_glProgramUniform4fvEXT;
        public final MemorySegment PFN_glProgramUniform4iEXT;
        public final MemorySegment PFN_glProgramUniform4ivEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4fvEXT;
        public final MemorySegment PFN_glUseProgramStagesEXT;
        public final MemorySegment PFN_glValidateProgramPipelineEXT;
        public final MemorySegment PFN_glProgramUniform1uiEXT;
        public final MemorySegment PFN_glProgramUniform2uiEXT;
        public final MemorySegment PFN_glProgramUniform3uiEXT;
        public final MemorySegment PFN_glProgramUniform4uiEXT;
        public final MemorySegment PFN_glProgramUniform1uivEXT;
        public final MemorySegment PFN_glProgramUniform2uivEXT;
        public final MemorySegment PFN_glProgramUniform3uivEXT;
        public final MemorySegment PFN_glProgramUniform4uivEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2x3fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3x2fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2x4fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4x2fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3x4fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4x3fvEXT;
        private Handles(GLLoadFunc func) {
            PFN_glUseShaderProgramEXT = func.invoke("glUseShaderProgramEXT");
            PFN_glActiveProgramEXT = func.invoke("glActiveProgramEXT");
            PFN_glCreateShaderProgramEXT = func.invoke("glCreateShaderProgramEXT");PFN_glActiveShaderProgramEXT = func.invoke("glActiveShaderProgramEXT");
            PFN_glBindProgramPipelineEXT = func.invoke("glBindProgramPipelineEXT");
            PFN_glCreateShaderProgramvEXT = func.invoke("glCreateShaderProgramvEXT");
            PFN_glDeleteProgramPipelinesEXT = func.invoke("glDeleteProgramPipelinesEXT");
            PFN_glGenProgramPipelinesEXT = func.invoke("glGenProgramPipelinesEXT");
            PFN_glGetProgramPipelineInfoLogEXT = func.invoke("glGetProgramPipelineInfoLogEXT");
            PFN_glGetProgramPipelineivEXT = func.invoke("glGetProgramPipelineivEXT");
            PFN_glIsProgramPipelineEXT = func.invoke("glIsProgramPipelineEXT");
            PFN_glProgramParameteriEXT = func.invoke("glProgramParameteriEXT", "glProgramParameteri");
            PFN_glProgramUniform1fEXT = func.invoke("glProgramUniform1fEXT", "glProgramUniform1f");
            PFN_glProgramUniform1fvEXT = func.invoke("glProgramUniform1fvEXT", "glProgramUniform1fv");
            PFN_glProgramUniform1iEXT = func.invoke("glProgramUniform1iEXT", "glProgramUniform1i");
            PFN_glProgramUniform1ivEXT = func.invoke("glProgramUniform1ivEXT", "glProgramUniform1iv");
            PFN_glProgramUniform2fEXT = func.invoke("glProgramUniform2fEXT", "glProgramUniform2f");
            PFN_glProgramUniform2fvEXT = func.invoke("glProgramUniform2fvEXT", "glProgramUniform2fv");
            PFN_glProgramUniform2iEXT = func.invoke("glProgramUniform2iEXT", "glProgramUniform2i");
            PFN_glProgramUniform2ivEXT = func.invoke("glProgramUniform2ivEXT", "glProgramUniform2iv");
            PFN_glProgramUniform3fEXT = func.invoke("glProgramUniform3fEXT", "glProgramUniform3f");
            PFN_glProgramUniform3fvEXT = func.invoke("glProgramUniform3fvEXT", "glProgramUniform3fv");
            PFN_glProgramUniform3iEXT = func.invoke("glProgramUniform3iEXT", "glProgramUniform3i");
            PFN_glProgramUniform3ivEXT = func.invoke("glProgramUniform3ivEXT", "glProgramUniform3iv");
            PFN_glProgramUniform4fEXT = func.invoke("glProgramUniform4fEXT", "glProgramUniform4f");
            PFN_glProgramUniform4fvEXT = func.invoke("glProgramUniform4fvEXT", "glProgramUniform4fv");
            PFN_glProgramUniform4iEXT = func.invoke("glProgramUniform4iEXT", "glProgramUniform4i");
            PFN_glProgramUniform4ivEXT = func.invoke("glProgramUniform4ivEXT", "glProgramUniform4iv");
            PFN_glProgramUniformMatrix2fvEXT = func.invoke("glProgramUniformMatrix2fvEXT", "glProgramUniformMatrix2fv");
            PFN_glProgramUniformMatrix3fvEXT = func.invoke("glProgramUniformMatrix3fvEXT", "glProgramUniformMatrix3fv");
            PFN_glProgramUniformMatrix4fvEXT = func.invoke("glProgramUniformMatrix4fvEXT", "glProgramUniformMatrix4fv");
            PFN_glUseProgramStagesEXT = func.invoke("glUseProgramStagesEXT");
            PFN_glValidateProgramPipelineEXT = func.invoke("glValidateProgramPipelineEXT");PFN_glProgramUniform1uiEXT = func.invoke("glProgramUniform1uiEXT", "glProgramUniform1ui");
            PFN_glProgramUniform2uiEXT = func.invoke("glProgramUniform2uiEXT", "glProgramUniform2ui");
            PFN_glProgramUniform3uiEXT = func.invoke("glProgramUniform3uiEXT", "glProgramUniform3ui");
            PFN_glProgramUniform4uiEXT = func.invoke("glProgramUniform4uiEXT", "glProgramUniform4ui");
            PFN_glProgramUniform1uivEXT = func.invoke("glProgramUniform1uivEXT", "glProgramUniform1uiv");
            PFN_glProgramUniform2uivEXT = func.invoke("glProgramUniform2uivEXT", "glProgramUniform2uiv");
            PFN_glProgramUniform3uivEXT = func.invoke("glProgramUniform3uivEXT", "glProgramUniform3uiv");
            PFN_glProgramUniform4uivEXT = func.invoke("glProgramUniform4uivEXT", "glProgramUniform4uiv");
            PFN_glProgramUniformMatrix2x3fvEXT = func.invoke("glProgramUniformMatrix2x3fvEXT", "glProgramUniformMatrix2x3fv");
            PFN_glProgramUniformMatrix3x2fvEXT = func.invoke("glProgramUniformMatrix3x2fvEXT", "glProgramUniformMatrix3x2fv");
            PFN_glProgramUniformMatrix2x4fvEXT = func.invoke("glProgramUniformMatrix2x4fvEXT", "glProgramUniformMatrix2x4fv");
            PFN_glProgramUniformMatrix4x2fvEXT = func.invoke("glProgramUniformMatrix4x2fvEXT", "glProgramUniformMatrix4x2fv");
            PFN_glProgramUniformMatrix3x4fvEXT = func.invoke("glProgramUniformMatrix3x4fvEXT", "glProgramUniformMatrix3x4fv");
            PFN_glProgramUniformMatrix4x3fvEXT = func.invoke("glProgramUniformMatrix4x3fvEXT", "glProgramUniformMatrix4x3fv");
        }
    }

    public GLEXTSeparateShaderObjects(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glUseShaderProgramEXT`.
    /// ```
    /// void glUseShaderProgramEXT((unsigned int) GLenum type, (unsigned int) GLuint program);
    /// ```
    public void UseShaderProgramEXT(int type, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUseShaderProgramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glUseShaderProgramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUseShaderProgramEXT", type, program); }
        Handles.MH_glUseShaderProgramEXT.invokeExact(handles.PFN_glUseShaderProgramEXT, type, program); }
        catch (Throwable e) { throw new RuntimeException("error in UseShaderProgramEXT", e); }
    }

    /// Invokes `glActiveProgramEXT`.
    /// ```
    /// void glActiveProgramEXT((unsigned int) GLuint program);
    /// ```
    public void ActiveProgramEXT(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveProgramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glActiveProgramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glActiveProgramEXT", program); }
        Handles.MH_glActiveProgramEXT.invokeExact(handles.PFN_glActiveProgramEXT, program); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveProgramEXT", e); }
    }

    /// Invokes `glCreateShaderProgramEXT`.
    /// ```
    /// (unsigned int) GLuint glCreateShaderProgramEXT((unsigned int) GLenum type, const GLchar* string);
    /// ```
    public int CreateShaderProgramEXT(int type, @NonNull MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateShaderProgramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCreateShaderProgramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateShaderProgramEXT", type, string); }
        return (int) Handles.MH_glCreateShaderProgramEXT.invokeExact(handles.PFN_glCreateShaderProgramEXT, type, string); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShaderProgramEXT", e); }
    }

    /// Invokes `glActiveShaderProgramEXT`.
    /// ```
    /// void glActiveShaderProgramEXT((unsigned int) GLuint pipeline, (unsigned int) GLuint program);
    /// ```
    public void ActiveShaderProgramEXT(int pipeline, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveShaderProgramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glActiveShaderProgramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glActiveShaderProgramEXT", pipeline, program); }
        Handles.MH_glActiveShaderProgramEXT.invokeExact(handles.PFN_glActiveShaderProgramEXT, pipeline, program); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveShaderProgramEXT", e); }
    }

    /// Invokes `glBindProgramPipelineEXT`.
    /// ```
    /// void glBindProgramPipelineEXT((unsigned int) GLuint pipeline);
    /// ```
    public void BindProgramPipelineEXT(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindProgramPipelineEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindProgramPipelineEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindProgramPipelineEXT", pipeline); }
        Handles.MH_glBindProgramPipelineEXT.invokeExact(handles.PFN_glBindProgramPipelineEXT, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in BindProgramPipelineEXT", e); }
    }

    /// Invokes `glCreateShaderProgramvEXT`.
    /// ```
    /// (unsigned int) GLuint glCreateShaderProgramvEXT((unsigned int) GLenum type, (int) GLsizei count, const GLchar* const * strings);
    /// ```
    public int CreateShaderProgramvEXT(int type, int count, @NonNull MemorySegment strings) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateShaderProgramvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCreateShaderProgramvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateShaderProgramvEXT", type, count, strings); }
        return (int) Handles.MH_glCreateShaderProgramvEXT.invokeExact(handles.PFN_glCreateShaderProgramvEXT, type, count, strings); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShaderProgramvEXT", e); }
    }

    /// Invokes `glDeleteProgramPipelinesEXT`.
    /// ```
    /// void glDeleteProgramPipelinesEXT((int) GLsizei n, const GLuint* pipelines);
    /// ```
    public void DeleteProgramPipelinesEXT(int n, @NonNull MemorySegment pipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteProgramPipelinesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteProgramPipelinesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteProgramPipelinesEXT", n, pipelines); }
        Handles.MH_glDeleteProgramPipelinesEXT.invokeExact(handles.PFN_glDeleteProgramPipelinesEXT, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteProgramPipelinesEXT", e); }
    }

    /// Invokes `glGenProgramPipelinesEXT`.
    /// ```
    /// void glGenProgramPipelinesEXT((int) GLsizei n, GLuint* pipelines);
    /// ```
    public void GenProgramPipelinesEXT(int n, @NonNull MemorySegment pipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenProgramPipelinesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGenProgramPipelinesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenProgramPipelinesEXT", n, pipelines); }
        Handles.MH_glGenProgramPipelinesEXT.invokeExact(handles.PFN_glGenProgramPipelinesEXT, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in GenProgramPipelinesEXT", e); }
    }

    /// Invokes `glGetProgramPipelineInfoLogEXT`.
    /// ```
    /// void glGetProgramPipelineInfoLogEXT((unsigned int) GLuint pipeline, (int) GLsizei bufSize, GLsizei* length, GLchar* infoLog);
    /// ```
    public void GetProgramPipelineInfoLogEXT(int pipeline, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment infoLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramPipelineInfoLogEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramPipelineInfoLogEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramPipelineInfoLogEXT", pipeline, bufSize, length, infoLog); }
        Handles.MH_glGetProgramPipelineInfoLogEXT.invokeExact(handles.PFN_glGetProgramPipelineInfoLogEXT, pipeline, bufSize, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramPipelineInfoLogEXT", e); }
    }

    /// Invokes `glGetProgramPipelineivEXT`.
    /// ```
    /// void glGetProgramPipelineivEXT((unsigned int) GLuint pipeline, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramPipelineivEXT(int pipeline, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramPipelineivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramPipelineivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramPipelineivEXT", pipeline, pname, params); }
        Handles.MH_glGetProgramPipelineivEXT.invokeExact(handles.PFN_glGetProgramPipelineivEXT, pipeline, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramPipelineivEXT", e); }
    }

    /// Invokes `glIsProgramPipelineEXT`.
    /// ```
    /// GLboolean glIsProgramPipelineEXT((unsigned int) GLuint pipeline);
    /// ```
    public boolean IsProgramPipelineEXT(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsProgramPipelineEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIsProgramPipelineEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsProgramPipelineEXT", pipeline); }
        return (((byte) Handles.MH_glIsProgramPipelineEXT.invokeExact(handles.PFN_glIsProgramPipelineEXT, pipeline)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsProgramPipelineEXT", e); }
    }

    /// Invokes `glProgramParameteriEXT`.
    /// ```
    /// void glProgramParameteriEXT((unsigned int) GLuint program, (unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void ProgramParameteriEXT(int program, int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameteriEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameteriEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameteriEXT", program, pname, value); }
        Handles.MH_glProgramParameteriEXT.invokeExact(handles.PFN_glProgramParameteriEXT, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameteriEXT", e); }
    }

    /// Invokes `glProgramUniform1fEXT`.
    /// ```
    /// void glProgramUniform1fEXT((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0);
    /// ```
    public void ProgramUniform1fEXT(int program, int location, float v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1fEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1fEXT", program, location, v0); }
        Handles.MH_glProgramUniform1fEXT.invokeExact(handles.PFN_glProgramUniform1fEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1fEXT", e); }
    }

    /// Invokes `glProgramUniform1fvEXT`.
    /// ```
    /// void glProgramUniform1fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform1fvEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1fvEXT", program, location, count, value); }
        Handles.MH_glProgramUniform1fvEXT.invokeExact(handles.PFN_glProgramUniform1fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1fvEXT", e); }
    }

    /// Invokes `glProgramUniform1iEXT`.
    /// ```
    /// void glProgramUniform1iEXT((unsigned int) GLuint program, (int) GLint location, (int) GLint v0);
    /// ```
    public void ProgramUniform1iEXT(int program, int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1iEXT", program, location, v0); }
        Handles.MH_glProgramUniform1iEXT.invokeExact(handles.PFN_glProgramUniform1iEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1iEXT", e); }
    }

    /// Invokes `glProgramUniform1ivEXT`.
    /// ```
    /// void glProgramUniform1ivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform1ivEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1ivEXT", program, location, count, value); }
        Handles.MH_glProgramUniform1ivEXT.invokeExact(handles.PFN_glProgramUniform1ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ivEXT", e); }
    }

    /// Invokes `glProgramUniform2fEXT`.
    /// ```
    /// void glProgramUniform2fEXT((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1);
    /// ```
    public void ProgramUniform2fEXT(int program, int location, float v0, float v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2fEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2fEXT", program, location, v0, v1); }
        Handles.MH_glProgramUniform2fEXT.invokeExact(handles.PFN_glProgramUniform2fEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2fEXT", e); }
    }

    /// Invokes `glProgramUniform2fvEXT`.
    /// ```
    /// void glProgramUniform2fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform2fvEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2fvEXT", program, location, count, value); }
        Handles.MH_glProgramUniform2fvEXT.invokeExact(handles.PFN_glProgramUniform2fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2fvEXT", e); }
    }

    /// Invokes `glProgramUniform2iEXT`.
    /// ```
    /// void glProgramUniform2iEXT((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1);
    /// ```
    public void ProgramUniform2iEXT(int program, int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2iEXT", program, location, v0, v1); }
        Handles.MH_glProgramUniform2iEXT.invokeExact(handles.PFN_glProgramUniform2iEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2iEXT", e); }
    }

    /// Invokes `glProgramUniform2ivEXT`.
    /// ```
    /// void glProgramUniform2ivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform2ivEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2ivEXT", program, location, count, value); }
        Handles.MH_glProgramUniform2ivEXT.invokeExact(handles.PFN_glProgramUniform2ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ivEXT", e); }
    }

    /// Invokes `glProgramUniform3fEXT`.
    /// ```
    /// void glProgramUniform3fEXT((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2);
    /// ```
    public void ProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3fEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3fEXT", program, location, v0, v1, v2); }
        Handles.MH_glProgramUniform3fEXT.invokeExact(handles.PFN_glProgramUniform3fEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3fEXT", e); }
    }

    /// Invokes `glProgramUniform3fvEXT`.
    /// ```
    /// void glProgramUniform3fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform3fvEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3fvEXT", program, location, count, value); }
        Handles.MH_glProgramUniform3fvEXT.invokeExact(handles.PFN_glProgramUniform3fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3fvEXT", e); }
    }

    /// Invokes `glProgramUniform3iEXT`.
    /// ```
    /// void glProgramUniform3iEXT((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2);
    /// ```
    public void ProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3iEXT", program, location, v0, v1, v2); }
        Handles.MH_glProgramUniform3iEXT.invokeExact(handles.PFN_glProgramUniform3iEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3iEXT", e); }
    }

    /// Invokes `glProgramUniform3ivEXT`.
    /// ```
    /// void glProgramUniform3ivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform3ivEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3ivEXT", program, location, count, value); }
        Handles.MH_glProgramUniform3ivEXT.invokeExact(handles.PFN_glProgramUniform3ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ivEXT", e); }
    }

    /// Invokes `glProgramUniform4fEXT`.
    /// ```
    /// void glProgramUniform4fEXT((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, ((float) khronos_float_t) GLfloat v3);
    /// ```
    public void ProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4fEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4fEXT", program, location, v0, v1, v2, v3); }
        Handles.MH_glProgramUniform4fEXT.invokeExact(handles.PFN_glProgramUniform4fEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4fEXT", e); }
    }

    /// Invokes `glProgramUniform4fvEXT`.
    /// ```
    /// void glProgramUniform4fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform4fvEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4fvEXT", program, location, count, value); }
        Handles.MH_glProgramUniform4fvEXT.invokeExact(handles.PFN_glProgramUniform4fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4fvEXT", e); }
    }

    /// Invokes `glProgramUniform4iEXT`.
    /// ```
    /// void glProgramUniform4iEXT((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2, (int) GLint v3);
    /// ```
    public void ProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4iEXT", program, location, v0, v1, v2, v3); }
        Handles.MH_glProgramUniform4iEXT.invokeExact(handles.PFN_glProgramUniform4iEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4iEXT", e); }
    }

    /// Invokes `glProgramUniform4ivEXT`.
    /// ```
    /// void glProgramUniform4ivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform4ivEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4ivEXT", program, location, count, value); }
        Handles.MH_glProgramUniform4ivEXT.invokeExact(handles.PFN_glProgramUniform4ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ivEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix2fvEXT`.
    /// ```
    /// void glProgramUniformMatrix2fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2fvEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix3fvEXT`.
    /// ```
    /// void glProgramUniformMatrix3fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3fvEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix4fvEXT`.
    /// ```
    /// void glProgramUniformMatrix4fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4fvEXT", e); }
    }

    /// Invokes `glUseProgramStagesEXT`.
    /// ```
    /// void glUseProgramStagesEXT((unsigned int) GLuint pipeline, (unsigned int) GLbitfield stages, (unsigned int) GLuint program);
    /// ```
    public void UseProgramStagesEXT(int pipeline, int stages, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUseProgramStagesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glUseProgramStagesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUseProgramStagesEXT", pipeline, stages, program); }
        Handles.MH_glUseProgramStagesEXT.invokeExact(handles.PFN_glUseProgramStagesEXT, pipeline, stages, program); }
        catch (Throwable e) { throw new RuntimeException("error in UseProgramStagesEXT", e); }
    }

    /// Invokes `glValidateProgramPipelineEXT`.
    /// ```
    /// void glValidateProgramPipelineEXT((unsigned int) GLuint pipeline);
    /// ```
    public void ValidateProgramPipelineEXT(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glValidateProgramPipelineEXT)) throw new GLSymbolNotFoundError("Symbol not found: glValidateProgramPipelineEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glValidateProgramPipelineEXT", pipeline); }
        Handles.MH_glValidateProgramPipelineEXT.invokeExact(handles.PFN_glValidateProgramPipelineEXT, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in ValidateProgramPipelineEXT", e); }
    }

    /// Invokes `glProgramUniform1uiEXT`.
    /// ```
    /// void glProgramUniform1uiEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0);
    /// ```
    public void ProgramUniform1uiEXT(int program, int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1uiEXT", program, location, v0); }
        Handles.MH_glProgramUniform1uiEXT.invokeExact(handles.PFN_glProgramUniform1uiEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1uiEXT", e); }
    }

    /// Invokes `glProgramUniform2uiEXT`.
    /// ```
    /// void glProgramUniform2uiEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1);
    /// ```
    public void ProgramUniform2uiEXT(int program, int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2uiEXT", program, location, v0, v1); }
        Handles.MH_glProgramUniform2uiEXT.invokeExact(handles.PFN_glProgramUniform2uiEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2uiEXT", e); }
    }

    /// Invokes `glProgramUniform3uiEXT`.
    /// ```
    /// void glProgramUniform3uiEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2);
    /// ```
    public void ProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3uiEXT", program, location, v0, v1, v2); }
        Handles.MH_glProgramUniform3uiEXT.invokeExact(handles.PFN_glProgramUniform3uiEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3uiEXT", e); }
    }

    /// Invokes `glProgramUniform4uiEXT`.
    /// ```
    /// void glProgramUniform4uiEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2, (unsigned int) GLuint v3);
    /// ```
    public void ProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4uiEXT", program, location, v0, v1, v2, v3); }
        Handles.MH_glProgramUniform4uiEXT.invokeExact(handles.PFN_glProgramUniform4uiEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4uiEXT", e); }
    }

    /// Invokes `glProgramUniform1uivEXT`.
    /// ```
    /// void glProgramUniform1uivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform1uivEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1uivEXT", program, location, count, value); }
        Handles.MH_glProgramUniform1uivEXT.invokeExact(handles.PFN_glProgramUniform1uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1uivEXT", e); }
    }

    /// Invokes `glProgramUniform2uivEXT`.
    /// ```
    /// void glProgramUniform2uivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform2uivEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2uivEXT", program, location, count, value); }
        Handles.MH_glProgramUniform2uivEXT.invokeExact(handles.PFN_glProgramUniform2uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2uivEXT", e); }
    }

    /// Invokes `glProgramUniform3uivEXT`.
    /// ```
    /// void glProgramUniform3uivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform3uivEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3uivEXT", program, location, count, value); }
        Handles.MH_glProgramUniform3uivEXT.invokeExact(handles.PFN_glProgramUniform3uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3uivEXT", e); }
    }

    /// Invokes `glProgramUniform4uivEXT`.
    /// ```
    /// void glProgramUniform4uivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform4uivEXT(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4uivEXT", program, location, count, value); }
        Handles.MH_glProgramUniform4uivEXT.invokeExact(handles.PFN_glProgramUniform4uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4uivEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix2x3fvEXT`.
    /// ```
    /// void glProgramUniformMatrix2x3fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2x3fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2x3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x3fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x3fvEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix3x2fvEXT`.
    /// ```
    /// void glProgramUniformMatrix3x2fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x2fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3x2fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3x2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x2fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x2fvEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix2x4fvEXT`.
    /// ```
    /// void glProgramUniformMatrix2x4fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2x4fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2x4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x4fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x4fvEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix4x2fvEXT`.
    /// ```
    /// void glProgramUniformMatrix4x2fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x2fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4x2fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4x2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x2fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x2fvEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix3x4fvEXT`.
    /// ```
    /// void glProgramUniformMatrix3x4fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3x4fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3x4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x4fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x4fvEXT", e); }
    }

    /// Invokes `glProgramUniformMatrix4x3fvEXT`.
    /// ```
    /// void glProgramUniformMatrix4x3fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4x3fvEXT", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4x3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x3fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x3fvEXT", e); }
    }

}
