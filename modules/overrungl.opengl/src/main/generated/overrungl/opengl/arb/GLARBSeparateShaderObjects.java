// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_separate_shader_objects`
public final class GLARBSeparateShaderObjects {
    public static final int GL_VERTEX_SHADER_BIT = 0x00000001;
    public static final int GL_FRAGMENT_SHADER_BIT = 0x00000002;
    public static final int GL_GEOMETRY_SHADER_BIT = 0x00000004;
    public static final int GL_TESS_CONTROL_SHADER_BIT = 0x00000008;
    public static final int GL_TESS_EVALUATION_SHADER_BIT = 0x00000010;
    public static final int GL_ALL_SHADER_BITS = 0xFFFFFFFF;
    public static final int GL_PROGRAM_SEPARABLE = 0x8258;
    public static final int GL_ACTIVE_PROGRAM = 0x8259;
    public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glUseProgramStages = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glActiveShaderProgram = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glCreateShaderProgramv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glBindProgramPipeline = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDeleteProgramPipelines = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGenProgramPipelines = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsProgramPipeline = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetProgramPipelineiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramParameteri = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1iv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1d = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1ui = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform1uiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2iv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2d = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2ui = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform2uiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3iv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3d = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3ui = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform3uiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4i = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4iv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4f = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4d = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4ui = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glProgramUniform4uiv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix2fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix3fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix4fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix2dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix3dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix4dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix2x3fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix3x2fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix2x4fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix4x2fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix3x4fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix4x3fv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix2x3dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix3x2dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix2x4dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix4x2dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix3x4dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramUniformMatrix4x3dv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glValidateProgramPipeline = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetProgramPipelineInfoLog = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glUseProgramStages;
        public final MemorySegment PFN_glActiveShaderProgram;
        public final MemorySegment PFN_glCreateShaderProgramv;
        public final MemorySegment PFN_glBindProgramPipeline;
        public final MemorySegment PFN_glDeleteProgramPipelines;
        public final MemorySegment PFN_glGenProgramPipelines;
        public final MemorySegment PFN_glIsProgramPipeline;
        public final MemorySegment PFN_glGetProgramPipelineiv;
        public final MemorySegment PFN_glProgramParameteri;
        public final MemorySegment PFN_glProgramUniform1i;
        public final MemorySegment PFN_glProgramUniform1iv;
        public final MemorySegment PFN_glProgramUniform1f;
        public final MemorySegment PFN_glProgramUniform1fv;
        public final MemorySegment PFN_glProgramUniform1d;
        public final MemorySegment PFN_glProgramUniform1dv;
        public final MemorySegment PFN_glProgramUniform1ui;
        public final MemorySegment PFN_glProgramUniform1uiv;
        public final MemorySegment PFN_glProgramUniform2i;
        public final MemorySegment PFN_glProgramUniform2iv;
        public final MemorySegment PFN_glProgramUniform2f;
        public final MemorySegment PFN_glProgramUniform2fv;
        public final MemorySegment PFN_glProgramUniform2d;
        public final MemorySegment PFN_glProgramUniform2dv;
        public final MemorySegment PFN_glProgramUniform2ui;
        public final MemorySegment PFN_glProgramUniform2uiv;
        public final MemorySegment PFN_glProgramUniform3i;
        public final MemorySegment PFN_glProgramUniform3iv;
        public final MemorySegment PFN_glProgramUniform3f;
        public final MemorySegment PFN_glProgramUniform3fv;
        public final MemorySegment PFN_glProgramUniform3d;
        public final MemorySegment PFN_glProgramUniform3dv;
        public final MemorySegment PFN_glProgramUniform3ui;
        public final MemorySegment PFN_glProgramUniform3uiv;
        public final MemorySegment PFN_glProgramUniform4i;
        public final MemorySegment PFN_glProgramUniform4iv;
        public final MemorySegment PFN_glProgramUniform4f;
        public final MemorySegment PFN_glProgramUniform4fv;
        public final MemorySegment PFN_glProgramUniform4d;
        public final MemorySegment PFN_glProgramUniform4dv;
        public final MemorySegment PFN_glProgramUniform4ui;
        public final MemorySegment PFN_glProgramUniform4uiv;
        public final MemorySegment PFN_glProgramUniformMatrix2fv;
        public final MemorySegment PFN_glProgramUniformMatrix3fv;
        public final MemorySegment PFN_glProgramUniformMatrix4fv;
        public final MemorySegment PFN_glProgramUniformMatrix2dv;
        public final MemorySegment PFN_glProgramUniformMatrix3dv;
        public final MemorySegment PFN_glProgramUniformMatrix4dv;
        public final MemorySegment PFN_glProgramUniformMatrix2x3fv;
        public final MemorySegment PFN_glProgramUniformMatrix3x2fv;
        public final MemorySegment PFN_glProgramUniformMatrix2x4fv;
        public final MemorySegment PFN_glProgramUniformMatrix4x2fv;
        public final MemorySegment PFN_glProgramUniformMatrix3x4fv;
        public final MemorySegment PFN_glProgramUniformMatrix4x3fv;
        public final MemorySegment PFN_glProgramUniformMatrix2x3dv;
        public final MemorySegment PFN_glProgramUniformMatrix3x2dv;
        public final MemorySegment PFN_glProgramUniformMatrix2x4dv;
        public final MemorySegment PFN_glProgramUniformMatrix4x2dv;
        public final MemorySegment PFN_glProgramUniformMatrix3x4dv;
        public final MemorySegment PFN_glProgramUniformMatrix4x3dv;
        public final MemorySegment PFN_glValidateProgramPipeline;
        public final MemorySegment PFN_glGetProgramPipelineInfoLog;
        private Handles(GLLoadFunc func) {
            PFN_glUseProgramStages = func.invoke("glUseProgramStages");
            PFN_glActiveShaderProgram = func.invoke("glActiveShaderProgram");
            PFN_glCreateShaderProgramv = func.invoke("glCreateShaderProgramv");
            PFN_glBindProgramPipeline = func.invoke("glBindProgramPipeline");
            PFN_glDeleteProgramPipelines = func.invoke("glDeleteProgramPipelines");
            PFN_glGenProgramPipelines = func.invoke("glGenProgramPipelines");
            PFN_glIsProgramPipeline = func.invoke("glIsProgramPipeline");
            PFN_glGetProgramPipelineiv = func.invoke("glGetProgramPipelineiv");
            PFN_glProgramParameteri = func.invoke("glProgramParameteri");
            PFN_glProgramUniform1i = func.invoke("glProgramUniform1i");
            PFN_glProgramUniform1iv = func.invoke("glProgramUniform1iv");
            PFN_glProgramUniform1f = func.invoke("glProgramUniform1f");
            PFN_glProgramUniform1fv = func.invoke("glProgramUniform1fv");
            PFN_glProgramUniform1d = func.invoke("glProgramUniform1d");
            PFN_glProgramUniform1dv = func.invoke("glProgramUniform1dv");
            PFN_glProgramUniform1ui = func.invoke("glProgramUniform1ui");
            PFN_glProgramUniform1uiv = func.invoke("glProgramUniform1uiv");
            PFN_glProgramUniform2i = func.invoke("glProgramUniform2i");
            PFN_glProgramUniform2iv = func.invoke("glProgramUniform2iv");
            PFN_glProgramUniform2f = func.invoke("glProgramUniform2f");
            PFN_glProgramUniform2fv = func.invoke("glProgramUniform2fv");
            PFN_glProgramUniform2d = func.invoke("glProgramUniform2d");
            PFN_glProgramUniform2dv = func.invoke("glProgramUniform2dv");
            PFN_glProgramUniform2ui = func.invoke("glProgramUniform2ui");
            PFN_glProgramUniform2uiv = func.invoke("glProgramUniform2uiv");
            PFN_glProgramUniform3i = func.invoke("glProgramUniform3i");
            PFN_glProgramUniform3iv = func.invoke("glProgramUniform3iv");
            PFN_glProgramUniform3f = func.invoke("glProgramUniform3f");
            PFN_glProgramUniform3fv = func.invoke("glProgramUniform3fv");
            PFN_glProgramUniform3d = func.invoke("glProgramUniform3d");
            PFN_glProgramUniform3dv = func.invoke("glProgramUniform3dv");
            PFN_glProgramUniform3ui = func.invoke("glProgramUniform3ui");
            PFN_glProgramUniform3uiv = func.invoke("glProgramUniform3uiv");
            PFN_glProgramUniform4i = func.invoke("glProgramUniform4i");
            PFN_glProgramUniform4iv = func.invoke("glProgramUniform4iv");
            PFN_glProgramUniform4f = func.invoke("glProgramUniform4f");
            PFN_glProgramUniform4fv = func.invoke("glProgramUniform4fv");
            PFN_glProgramUniform4d = func.invoke("glProgramUniform4d");
            PFN_glProgramUniform4dv = func.invoke("glProgramUniform4dv");
            PFN_glProgramUniform4ui = func.invoke("glProgramUniform4ui");
            PFN_glProgramUniform4uiv = func.invoke("glProgramUniform4uiv");
            PFN_glProgramUniformMatrix2fv = func.invoke("glProgramUniformMatrix2fv");
            PFN_glProgramUniformMatrix3fv = func.invoke("glProgramUniformMatrix3fv");
            PFN_glProgramUniformMatrix4fv = func.invoke("glProgramUniformMatrix4fv");
            PFN_glProgramUniformMatrix2dv = func.invoke("glProgramUniformMatrix2dv");
            PFN_glProgramUniformMatrix3dv = func.invoke("glProgramUniformMatrix3dv");
            PFN_glProgramUniformMatrix4dv = func.invoke("glProgramUniformMatrix4dv");
            PFN_glProgramUniformMatrix2x3fv = func.invoke("glProgramUniformMatrix2x3fv");
            PFN_glProgramUniformMatrix3x2fv = func.invoke("glProgramUniformMatrix3x2fv");
            PFN_glProgramUniformMatrix2x4fv = func.invoke("glProgramUniformMatrix2x4fv");
            PFN_glProgramUniformMatrix4x2fv = func.invoke("glProgramUniformMatrix4x2fv");
            PFN_glProgramUniformMatrix3x4fv = func.invoke("glProgramUniformMatrix3x4fv");
            PFN_glProgramUniformMatrix4x3fv = func.invoke("glProgramUniformMatrix4x3fv");
            PFN_glProgramUniformMatrix2x3dv = func.invoke("glProgramUniformMatrix2x3dv");
            PFN_glProgramUniformMatrix3x2dv = func.invoke("glProgramUniformMatrix3x2dv");
            PFN_glProgramUniformMatrix2x4dv = func.invoke("glProgramUniformMatrix2x4dv");
            PFN_glProgramUniformMatrix4x2dv = func.invoke("glProgramUniformMatrix4x2dv");
            PFN_glProgramUniformMatrix3x4dv = func.invoke("glProgramUniformMatrix3x4dv");
            PFN_glProgramUniformMatrix4x3dv = func.invoke("glProgramUniformMatrix4x3dv");
            PFN_glValidateProgramPipeline = func.invoke("glValidateProgramPipeline");
            PFN_glGetProgramPipelineInfoLog = func.invoke("glGetProgramPipelineInfoLog");
        }
    }

    public GLARBSeparateShaderObjects(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glUseProgramStages`.
    /// ```
    /// void glUseProgramStages((unsigned int) GLuint pipeline, (unsigned int) GLbitfield stages, (unsigned int) GLuint program);
    /// ```
    public void UseProgramStages(int pipeline, int stages, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUseProgramStages)) throw new GLSymbolNotFoundError("Symbol not found: glUseProgramStages");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUseProgramStages", pipeline, stages, program); }
        Handles.MH_glUseProgramStages.get().invokeExact(handles.PFN_glUseProgramStages, pipeline, stages, program); }
        catch (Throwable e) { throw new RuntimeException("error in UseProgramStages", e); }
    }

    /// Invokes `glActiveShaderProgram`.
    /// ```
    /// void glActiveShaderProgram((unsigned int) GLuint pipeline, (unsigned int) GLuint program);
    /// ```
    public void ActiveShaderProgram(int pipeline, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveShaderProgram)) throw new GLSymbolNotFoundError("Symbol not found: glActiveShaderProgram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glActiveShaderProgram", pipeline, program); }
        Handles.MH_glActiveShaderProgram.get().invokeExact(handles.PFN_glActiveShaderProgram, pipeline, program); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveShaderProgram", e); }
    }

    /// Invokes `glCreateShaderProgramv`.
    /// ```
    /// (unsigned int) GLuint glCreateShaderProgramv((unsigned int) GLenum type, (int) GLsizei count, const GLchar* const * strings);
    /// ```
    public int CreateShaderProgramv(int type, int count, @NonNull MemorySegment strings) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateShaderProgramv)) throw new GLSymbolNotFoundError("Symbol not found: glCreateShaderProgramv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateShaderProgramv", type, count, strings); }
        return (int) Handles.MH_glCreateShaderProgramv.get().invokeExact(handles.PFN_glCreateShaderProgramv, type, count, strings); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShaderProgramv", e); }
    }

    /// Invokes `glBindProgramPipeline`.
    /// ```
    /// void glBindProgramPipeline((unsigned int) GLuint pipeline);
    /// ```
    public void BindProgramPipeline(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindProgramPipeline)) throw new GLSymbolNotFoundError("Symbol not found: glBindProgramPipeline");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindProgramPipeline", pipeline); }
        Handles.MH_glBindProgramPipeline.get().invokeExact(handles.PFN_glBindProgramPipeline, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in BindProgramPipeline", e); }
    }

    /// Invokes `glDeleteProgramPipelines`.
    /// ```
    /// void glDeleteProgramPipelines((int) GLsizei n, const GLuint* pipelines);
    /// ```
    public void DeleteProgramPipelines(int n, @NonNull MemorySegment pipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteProgramPipelines)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteProgramPipelines");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteProgramPipelines", n, pipelines); }
        Handles.MH_glDeleteProgramPipelines.get().invokeExact(handles.PFN_glDeleteProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteProgramPipelines", e); }
    }

    /// Invokes `glGenProgramPipelines`.
    /// ```
    /// void glGenProgramPipelines((int) GLsizei n, GLuint* pipelines);
    /// ```
    public void GenProgramPipelines(int n, @NonNull MemorySegment pipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenProgramPipelines)) throw new GLSymbolNotFoundError("Symbol not found: glGenProgramPipelines");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenProgramPipelines", n, pipelines); }
        Handles.MH_glGenProgramPipelines.get().invokeExact(handles.PFN_glGenProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in GenProgramPipelines", e); }
    }

    /// Invokes `glIsProgramPipeline`.
    /// ```
    /// GLboolean glIsProgramPipeline((unsigned int) GLuint pipeline);
    /// ```
    public boolean IsProgramPipeline(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsProgramPipeline)) throw new GLSymbolNotFoundError("Symbol not found: glIsProgramPipeline");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsProgramPipeline", pipeline); }
        return (((byte) Handles.MH_glIsProgramPipeline.get().invokeExact(handles.PFN_glIsProgramPipeline, pipeline)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsProgramPipeline", e); }
    }

    /// Invokes `glGetProgramPipelineiv`.
    /// ```
    /// void glGetProgramPipelineiv((unsigned int) GLuint pipeline, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramPipelineiv(int pipeline, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramPipelineiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramPipelineiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramPipelineiv", pipeline, pname, params); }
        Handles.MH_glGetProgramPipelineiv.get().invokeExact(handles.PFN_glGetProgramPipelineiv, pipeline, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramPipelineiv", e); }
    }

    /// Invokes `glProgramParameteri`.
    /// ```
    /// void glProgramParameteri((unsigned int) GLuint program, (unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void ProgramParameteri(int program, int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameteri", program, pname, value); }
        Handles.MH_glProgramParameteri.get().invokeExact(handles.PFN_glProgramParameteri, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameteri", e); }
    }

    /// Invokes `glProgramUniform1i`.
    /// ```
    /// void glProgramUniform1i((unsigned int) GLuint program, (int) GLint location, (int) GLint v0);
    /// ```
    public void ProgramUniform1i(int program, int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1i)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1i", program, location, v0); }
        Handles.MH_glProgramUniform1i.get().invokeExact(handles.PFN_glProgramUniform1i, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1i", e); }
    }

    /// Invokes `glProgramUniform1iv`.
    /// ```
    /// void glProgramUniform1iv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform1iv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1iv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1iv", program, location, count, value); }
        Handles.MH_glProgramUniform1iv.get().invokeExact(handles.PFN_glProgramUniform1iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1iv", e); }
    }

    /// Invokes `glProgramUniform1f`.
    /// ```
    /// void glProgramUniform1f((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0);
    /// ```
    public void ProgramUniform1f(int program, int location, float v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1f)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1f", program, location, v0); }
        Handles.MH_glProgramUniform1f.get().invokeExact(handles.PFN_glProgramUniform1f, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1f", e); }
    }

    /// Invokes `glProgramUniform1fv`.
    /// ```
    /// void glProgramUniform1fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform1fv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1fv", program, location, count, value); }
        Handles.MH_glProgramUniform1fv.get().invokeExact(handles.PFN_glProgramUniform1fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1fv", e); }
    }

    /// Invokes `glProgramUniform1d`.
    /// ```
    /// void glProgramUniform1d((unsigned int) GLuint program, (int) GLint location, (double) GLdouble v0);
    /// ```
    public void ProgramUniform1d(int program, int location, double v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1d)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1d", program, location, v0); }
        Handles.MH_glProgramUniform1d.get().invokeExact(handles.PFN_glProgramUniform1d, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1d", e); }
    }

    /// Invokes `glProgramUniform1dv`.
    /// ```
    /// void glProgramUniform1dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform1dv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1dv", program, location, count, value); }
        Handles.MH_glProgramUniform1dv.get().invokeExact(handles.PFN_glProgramUniform1dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1dv", e); }
    }

    /// Invokes `glProgramUniform1ui`.
    /// ```
    /// void glProgramUniform1ui((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0);
    /// ```
    public void ProgramUniform1ui(int program, int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ui)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1ui", program, location, v0); }
        Handles.MH_glProgramUniform1ui.get().invokeExact(handles.PFN_glProgramUniform1ui, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ui", e); }
    }

    /// Invokes `glProgramUniform1uiv`.
    /// ```
    /// void glProgramUniform1uiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform1uiv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1uiv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform1uiv", program, location, count, value); }
        Handles.MH_glProgramUniform1uiv.get().invokeExact(handles.PFN_glProgramUniform1uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1uiv", e); }
    }

    /// Invokes `glProgramUniform2i`.
    /// ```
    /// void glProgramUniform2i((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1);
    /// ```
    public void ProgramUniform2i(int program, int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2i)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2i", program, location, v0, v1); }
        Handles.MH_glProgramUniform2i.get().invokeExact(handles.PFN_glProgramUniform2i, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2i", e); }
    }

    /// Invokes `glProgramUniform2iv`.
    /// ```
    /// void glProgramUniform2iv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform2iv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2iv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2iv", program, location, count, value); }
        Handles.MH_glProgramUniform2iv.get().invokeExact(handles.PFN_glProgramUniform2iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2iv", e); }
    }

    /// Invokes `glProgramUniform2f`.
    /// ```
    /// void glProgramUniform2f((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1);
    /// ```
    public void ProgramUniform2f(int program, int location, float v0, float v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2f)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2f", program, location, v0, v1); }
        Handles.MH_glProgramUniform2f.get().invokeExact(handles.PFN_glProgramUniform2f, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2f", e); }
    }

    /// Invokes `glProgramUniform2fv`.
    /// ```
    /// void glProgramUniform2fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform2fv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2fv", program, location, count, value); }
        Handles.MH_glProgramUniform2fv.get().invokeExact(handles.PFN_glProgramUniform2fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2fv", e); }
    }

    /// Invokes `glProgramUniform2d`.
    /// ```
    /// void glProgramUniform2d((unsigned int) GLuint program, (int) GLint location, (double) GLdouble v0, (double) GLdouble v1);
    /// ```
    public void ProgramUniform2d(int program, int location, double v0, double v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2d)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2d", program, location, v0, v1); }
        Handles.MH_glProgramUniform2d.get().invokeExact(handles.PFN_glProgramUniform2d, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2d", e); }
    }

    /// Invokes `glProgramUniform2dv`.
    /// ```
    /// void glProgramUniform2dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform2dv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2dv", program, location, count, value); }
        Handles.MH_glProgramUniform2dv.get().invokeExact(handles.PFN_glProgramUniform2dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2dv", e); }
    }

    /// Invokes `glProgramUniform2ui`.
    /// ```
    /// void glProgramUniform2ui((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1);
    /// ```
    public void ProgramUniform2ui(int program, int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ui)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2ui", program, location, v0, v1); }
        Handles.MH_glProgramUniform2ui.get().invokeExact(handles.PFN_glProgramUniform2ui, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ui", e); }
    }

    /// Invokes `glProgramUniform2uiv`.
    /// ```
    /// void glProgramUniform2uiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform2uiv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2uiv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform2uiv", program, location, count, value); }
        Handles.MH_glProgramUniform2uiv.get().invokeExact(handles.PFN_glProgramUniform2uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2uiv", e); }
    }

    /// Invokes `glProgramUniform3i`.
    /// ```
    /// void glProgramUniform3i((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2);
    /// ```
    public void ProgramUniform3i(int program, int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3i)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3i", program, location, v0, v1, v2); }
        Handles.MH_glProgramUniform3i.get().invokeExact(handles.PFN_glProgramUniform3i, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3i", e); }
    }

    /// Invokes `glProgramUniform3iv`.
    /// ```
    /// void glProgramUniform3iv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform3iv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3iv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3iv", program, location, count, value); }
        Handles.MH_glProgramUniform3iv.get().invokeExact(handles.PFN_glProgramUniform3iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3iv", e); }
    }

    /// Invokes `glProgramUniform3f`.
    /// ```
    /// void glProgramUniform3f((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2);
    /// ```
    public void ProgramUniform3f(int program, int location, float v0, float v1, float v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3f)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3f", program, location, v0, v1, v2); }
        Handles.MH_glProgramUniform3f.get().invokeExact(handles.PFN_glProgramUniform3f, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3f", e); }
    }

    /// Invokes `glProgramUniform3fv`.
    /// ```
    /// void glProgramUniform3fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform3fv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3fv", program, location, count, value); }
        Handles.MH_glProgramUniform3fv.get().invokeExact(handles.PFN_glProgramUniform3fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3fv", e); }
    }

    /// Invokes `glProgramUniform3d`.
    /// ```
    /// void glProgramUniform3d((unsigned int) GLuint program, (int) GLint location, (double) GLdouble v0, (double) GLdouble v1, (double) GLdouble v2);
    /// ```
    public void ProgramUniform3d(int program, int location, double v0, double v1, double v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3d)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3d", program, location, v0, v1, v2); }
        Handles.MH_glProgramUniform3d.get().invokeExact(handles.PFN_glProgramUniform3d, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3d", e); }
    }

    /// Invokes `glProgramUniform3dv`.
    /// ```
    /// void glProgramUniform3dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform3dv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3dv", program, location, count, value); }
        Handles.MH_glProgramUniform3dv.get().invokeExact(handles.PFN_glProgramUniform3dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3dv", e); }
    }

    /// Invokes `glProgramUniform3ui`.
    /// ```
    /// void glProgramUniform3ui((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2);
    /// ```
    public void ProgramUniform3ui(int program, int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ui)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3ui", program, location, v0, v1, v2); }
        Handles.MH_glProgramUniform3ui.get().invokeExact(handles.PFN_glProgramUniform3ui, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ui", e); }
    }

    /// Invokes `glProgramUniform3uiv`.
    /// ```
    /// void glProgramUniform3uiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform3uiv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform3uiv", program, location, count, value); }
        Handles.MH_glProgramUniform3uiv.get().invokeExact(handles.PFN_glProgramUniform3uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3uiv", e); }
    }

    /// Invokes `glProgramUniform4i`.
    /// ```
    /// void glProgramUniform4i((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2, (int) GLint v3);
    /// ```
    public void ProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4i)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4i", program, location, v0, v1, v2, v3); }
        Handles.MH_glProgramUniform4i.get().invokeExact(handles.PFN_glProgramUniform4i, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4i", e); }
    }

    /// Invokes `glProgramUniform4iv`.
    /// ```
    /// void glProgramUniform4iv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform4iv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4iv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4iv", program, location, count, value); }
        Handles.MH_glProgramUniform4iv.get().invokeExact(handles.PFN_glProgramUniform4iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4iv", e); }
    }

    /// Invokes `glProgramUniform4f`.
    /// ```
    /// void glProgramUniform4f((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, ((float) khronos_float_t) GLfloat v3);
    /// ```
    public void ProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4f)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4f", program, location, v0, v1, v2, v3); }
        Handles.MH_glProgramUniform4f.get().invokeExact(handles.PFN_glProgramUniform4f, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4f", e); }
    }

    /// Invokes `glProgramUniform4fv`.
    /// ```
    /// void glProgramUniform4fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform4fv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4fv", program, location, count, value); }
        Handles.MH_glProgramUniform4fv.get().invokeExact(handles.PFN_glProgramUniform4fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4fv", e); }
    }

    /// Invokes `glProgramUniform4d`.
    /// ```
    /// void glProgramUniform4d((unsigned int) GLuint program, (int) GLint location, (double) GLdouble v0, (double) GLdouble v1, (double) GLdouble v2, (double) GLdouble v3);
    /// ```
    public void ProgramUniform4d(int program, int location, double v0, double v1, double v2, double v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4d)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4d", program, location, v0, v1, v2, v3); }
        Handles.MH_glProgramUniform4d.get().invokeExact(handles.PFN_glProgramUniform4d, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4d", e); }
    }

    /// Invokes `glProgramUniform4dv`.
    /// ```
    /// void glProgramUniform4dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform4dv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4dv", program, location, count, value); }
        Handles.MH_glProgramUniform4dv.get().invokeExact(handles.PFN_glProgramUniform4dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4dv", e); }
    }

    /// Invokes `glProgramUniform4ui`.
    /// ```
    /// void glProgramUniform4ui((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2, (unsigned int) GLuint v3);
    /// ```
    public void ProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ui)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4ui", program, location, v0, v1, v2, v3); }
        Handles.MH_glProgramUniform4ui.get().invokeExact(handles.PFN_glProgramUniform4ui, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ui", e); }
    }

    /// Invokes `glProgramUniform4uiv`.
    /// ```
    /// void glProgramUniform4uiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform4uiv(int program, int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniform4uiv", program, location, count, value); }
        Handles.MH_glProgramUniform4uiv.get().invokeExact(handles.PFN_glProgramUniform4uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4uiv", e); }
    }

    /// Invokes `glProgramUniformMatrix2fv`.
    /// ```
    /// void glProgramUniformMatrix2fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2fv.get().invokeExact(handles.PFN_glProgramUniformMatrix2fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2fv", e); }
    }

    /// Invokes `glProgramUniformMatrix3fv`.
    /// ```
    /// void glProgramUniformMatrix3fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3fv.get().invokeExact(handles.PFN_glProgramUniformMatrix3fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3fv", e); }
    }

    /// Invokes `glProgramUniformMatrix4fv`.
    /// ```
    /// void glProgramUniformMatrix4fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4fv.get().invokeExact(handles.PFN_glProgramUniformMatrix4fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4fv", e); }
    }

    /// Invokes `glProgramUniformMatrix2dv`.
    /// ```
    /// void glProgramUniformMatrix2dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2dv.get().invokeExact(handles.PFN_glProgramUniformMatrix2dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2dv", e); }
    }

    /// Invokes `glProgramUniformMatrix3dv`.
    /// ```
    /// void glProgramUniformMatrix3dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3dv.get().invokeExact(handles.PFN_glProgramUniformMatrix3dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3dv", e); }
    }

    /// Invokes `glProgramUniformMatrix4dv`.
    /// ```
    /// void glProgramUniformMatrix4dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4dv.get().invokeExact(handles.PFN_glProgramUniformMatrix4dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4dv", e); }
    }

    /// Invokes `glProgramUniformMatrix2x3fv`.
    /// ```
    /// void glProgramUniformMatrix2x3fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x3fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2x3fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2x3fv.get().invokeExact(handles.PFN_glProgramUniformMatrix2x3fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x3fv", e); }
    }

    /// Invokes `glProgramUniformMatrix3x2fv`.
    /// ```
    /// void glProgramUniformMatrix3x2fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x2fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3x2fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3x2fv.get().invokeExact(handles.PFN_glProgramUniformMatrix3x2fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x2fv", e); }
    }

    /// Invokes `glProgramUniformMatrix2x4fv`.
    /// ```
    /// void glProgramUniformMatrix2x4fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x4fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2x4fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2x4fv.get().invokeExact(handles.PFN_glProgramUniformMatrix2x4fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x4fv", e); }
    }

    /// Invokes `glProgramUniformMatrix4x2fv`.
    /// ```
    /// void glProgramUniformMatrix4x2fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x2fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4x2fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4x2fv.get().invokeExact(handles.PFN_glProgramUniformMatrix4x2fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x2fv", e); }
    }

    /// Invokes `glProgramUniformMatrix3x4fv`.
    /// ```
    /// void glProgramUniformMatrix3x4fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x4fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3x4fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3x4fv.get().invokeExact(handles.PFN_glProgramUniformMatrix3x4fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x4fv", e); }
    }

    /// Invokes `glProgramUniformMatrix4x3fv`.
    /// ```
    /// void glProgramUniformMatrix4x3fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x3fv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4x3fv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4x3fv.get().invokeExact(handles.PFN_glProgramUniformMatrix4x3fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x3fv", e); }
    }

    /// Invokes `glProgramUniformMatrix2x3dv`.
    /// ```
    /// void glProgramUniformMatrix2x3dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x3dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2x3dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2x3dv.get().invokeExact(handles.PFN_glProgramUniformMatrix2x3dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x3dv", e); }
    }

    /// Invokes `glProgramUniformMatrix3x2dv`.
    /// ```
    /// void glProgramUniformMatrix3x2dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x2dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3x2dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3x2dv.get().invokeExact(handles.PFN_glProgramUniformMatrix3x2dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x2dv", e); }
    }

    /// Invokes `glProgramUniformMatrix2x4dv`.
    /// ```
    /// void glProgramUniformMatrix2x4dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x4dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix2x4dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix2x4dv.get().invokeExact(handles.PFN_glProgramUniformMatrix2x4dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x4dv", e); }
    }

    /// Invokes `glProgramUniformMatrix4x2dv`.
    /// ```
    /// void glProgramUniformMatrix4x2dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x2dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4x2dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4x2dv.get().invokeExact(handles.PFN_glProgramUniformMatrix4x2dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x2dv", e); }
    }

    /// Invokes `glProgramUniformMatrix3x4dv`.
    /// ```
    /// void glProgramUniformMatrix3x4dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x4dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix3x4dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix3x4dv.get().invokeExact(handles.PFN_glProgramUniformMatrix3x4dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x4dv", e); }
    }

    /// Invokes `glProgramUniformMatrix4x3dv`.
    /// ```
    /// void glProgramUniformMatrix4x3dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x3dv)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramUniformMatrix4x3dv", program, location, count, transpose, value); }
        Handles.MH_glProgramUniformMatrix4x3dv.get().invokeExact(handles.PFN_glProgramUniformMatrix4x3dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x3dv", e); }
    }

    /// Invokes `glValidateProgramPipeline`.
    /// ```
    /// void glValidateProgramPipeline((unsigned int) GLuint pipeline);
    /// ```
    public void ValidateProgramPipeline(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glValidateProgramPipeline)) throw new GLSymbolNotFoundError("Symbol not found: glValidateProgramPipeline");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glValidateProgramPipeline", pipeline); }
        Handles.MH_glValidateProgramPipeline.get().invokeExact(handles.PFN_glValidateProgramPipeline, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in ValidateProgramPipeline", e); }
    }

    /// Invokes `glGetProgramPipelineInfoLog`.
    /// ```
    /// void glGetProgramPipelineInfoLog((unsigned int) GLuint pipeline, (int) GLsizei bufSize, GLsizei* length, GLchar* infoLog);
    /// ```
    public void GetProgramPipelineInfoLog(int pipeline, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment infoLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramPipelineInfoLog)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramPipelineInfoLog");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramPipelineInfoLog", pipeline, bufSize, length, infoLog); }
        Handles.MH_glGetProgramPipelineInfoLog.get().invokeExact(handles.PFN_glGetProgramPipelineInfoLog, pipeline, bufSize, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramPipelineInfoLog", e); }
    }

}
