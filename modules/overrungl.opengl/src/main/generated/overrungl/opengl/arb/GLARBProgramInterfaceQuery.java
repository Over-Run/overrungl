// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_program_interface_query`
public final class GLARBProgramInterfaceQuery {
    public static final int GL_UNIFORM = 0x92E1;
    public static final int GL_UNIFORM_BLOCK = 0x92E2;
    public static final int GL_PROGRAM_INPUT = 0x92E3;
    public static final int GL_PROGRAM_OUTPUT = 0x92E4;
    public static final int GL_BUFFER_VARIABLE = 0x92E5;
    public static final int GL_SHADER_STORAGE_BLOCK = 0x92E6;
    public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;
    public static final int GL_VERTEX_SUBROUTINE = 0x92E8;
    public static final int GL_TESS_CONTROL_SUBROUTINE = 0x92E9;
    public static final int GL_TESS_EVALUATION_SUBROUTINE = 0x92EA;
    public static final int GL_GEOMETRY_SUBROUTINE = 0x92EB;
    public static final int GL_FRAGMENT_SUBROUTINE = 0x92EC;
    public static final int GL_COMPUTE_SUBROUTINE = 0x92ED;
    public static final int GL_VERTEX_SUBROUTINE_UNIFORM = 0x92EE;
    public static final int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 0x92EF;
    public static final int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0;
    public static final int GL_GEOMETRY_SUBROUTINE_UNIFORM = 0x92F1;
    public static final int GL_FRAGMENT_SUBROUTINE_UNIFORM = 0x92F2;
    public static final int GL_COMPUTE_SUBROUTINE_UNIFORM = 0x92F3;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING = 0x92F4;
    public static final int GL_ACTIVE_RESOURCES = 0x92F5;
    public static final int GL_MAX_NAME_LENGTH = 0x92F6;
    public static final int GL_MAX_NUM_ACTIVE_VARIABLES = 0x92F7;
    public static final int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;
    public static final int GL_NAME_LENGTH = 0x92F9;
    public static final int GL_TYPE = 0x92FA;
    public static final int GL_ARRAY_SIZE = 0x92FB;
    public static final int GL_OFFSET = 0x92FC;
    public static final int GL_BLOCK_INDEX = 0x92FD;
    public static final int GL_ARRAY_STRIDE = 0x92FE;
    public static final int GL_MATRIX_STRIDE = 0x92FF;
    public static final int GL_IS_ROW_MAJOR = 0x9300;
    public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = 0x9301;
    public static final int GL_BUFFER_BINDING = 0x9302;
    public static final int GL_BUFFER_DATA_SIZE = 0x9303;
    public static final int GL_NUM_ACTIVE_VARIABLES = 0x9304;
    public static final int GL_ACTIVE_VARIABLES = 0x9305;
    public static final int GL_REFERENCED_BY_VERTEX_SHADER = 0x9306;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 0x9309;
    public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = 0x930A;
    public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 0x930B;
    public static final int GL_TOP_LEVEL_ARRAY_SIZE = 0x930C;
    public static final int GL_TOP_LEVEL_ARRAY_STRIDE = 0x930D;
    public static final int GL_LOCATION = 0x930E;
    public static final int GL_LOCATION_INDEX = 0x930F;
    public static final int GL_IS_PER_PATCH = 0x92E7;
    public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
    public static final int GL_COMPATIBLE_SUBROUTINES = 0x8E4B;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetProgramInterfaceiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceIndex = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceName = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceLocation = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceLocationIndex = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetProgramInterfaceiv;
        public final MemorySegment PFN_glGetProgramResourceIndex;
        public final MemorySegment PFN_glGetProgramResourceName;
        public final MemorySegment PFN_glGetProgramResourceiv;
        public final MemorySegment PFN_glGetProgramResourceLocation;
        public final MemorySegment PFN_glGetProgramResourceLocationIndex;
        private Handles(GLLoadFunc func) {
            PFN_glGetProgramInterfaceiv = func.invoke("glGetProgramInterfaceiv");
            PFN_glGetProgramResourceIndex = func.invoke("glGetProgramResourceIndex");
            PFN_glGetProgramResourceName = func.invoke("glGetProgramResourceName");
            PFN_glGetProgramResourceiv = func.invoke("glGetProgramResourceiv");
            PFN_glGetProgramResourceLocation = func.invoke("glGetProgramResourceLocation");
            PFN_glGetProgramResourceLocationIndex = func.invoke("glGetProgramResourceLocationIndex");
        }
    }

    public GLARBProgramInterfaceQuery(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetProgramInterfaceiv`.
    /// ```
    /// void glGetProgramInterfaceiv((unsigned int) GLuint program, (unsigned int) GLenum programInterface, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramInterfaceiv(int program, int programInterface, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramInterfaceiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramInterfaceiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramInterfaceiv", program, programInterface, pname, params); }
        Handles.MH_glGetProgramInterfaceiv.invokeExact(handles.PFN_glGetProgramInterfaceiv, program, programInterface, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramInterfaceiv", e); }
    }

    /// Invokes `glGetProgramResourceIndex`.
    /// ```
    /// (unsigned int) GLuint glGetProgramResourceIndex((unsigned int) GLuint program, (unsigned int) GLenum programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceIndex(int program, int programInterface, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceIndex)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramResourceIndex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramResourceIndex", program, programInterface, name); }
        return (int) Handles.MH_glGetProgramResourceIndex.invokeExact(handles.PFN_glGetProgramResourceIndex, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceIndex", e); }
    }

    /// Invokes `glGetProgramResourceName`.
    /// ```
    /// void glGetProgramResourceName((unsigned int) GLuint program, (unsigned int) GLenum programInterface, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLchar* name);
    /// ```
    public void GetProgramResourceName(int program, int programInterface, int index, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceName)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramResourceName");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramResourceName", program, programInterface, index, bufSize, length, name); }
        Handles.MH_glGetProgramResourceName.invokeExact(handles.PFN_glGetProgramResourceName, program, programInterface, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceName", e); }
    }

    /// Invokes `glGetProgramResourceiv`.
    /// ```
    /// void glGetProgramResourceiv((unsigned int) GLuint program, (unsigned int) GLenum programInterface, (unsigned int) GLuint index, (int) GLsizei propCount, const GLenum* props, (int) GLsizei count, GLsizei* length, GLint* params);
    /// ```
    public void GetProgramResourceiv(int program, int programInterface, int index, int propCount, @NonNull MemorySegment props, int count, @NonNull MemorySegment length, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramResourceiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramResourceiv", program, programInterface, index, propCount, props, count, length, params); }
        Handles.MH_glGetProgramResourceiv.invokeExact(handles.PFN_glGetProgramResourceiv, program, programInterface, index, propCount, props, count, length, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceiv", e); }
    }

    /// Invokes `glGetProgramResourceLocation`.
    /// ```
    /// (int) GLint glGetProgramResourceLocation((unsigned int) GLuint program, (unsigned int) GLenum programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceLocation(int program, int programInterface, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceLocation)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramResourceLocation");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramResourceLocation", program, programInterface, name); }
        return (int) Handles.MH_glGetProgramResourceLocation.invokeExact(handles.PFN_glGetProgramResourceLocation, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceLocation", e); }
    }

    /// Invokes `glGetProgramResourceLocationIndex`.
    /// ```
    /// (int) GLint glGetProgramResourceLocationIndex((unsigned int) GLuint program, (unsigned int) GLenum programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceLocationIndex(int program, int programInterface, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceLocationIndex)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramResourceLocationIndex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramResourceLocationIndex", program, programInterface, name); }
        return (int) Handles.MH_glGetProgramResourceLocationIndex.invokeExact(handles.PFN_glGetProgramResourceLocationIndex, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceLocationIndex", e); }
    }

}
