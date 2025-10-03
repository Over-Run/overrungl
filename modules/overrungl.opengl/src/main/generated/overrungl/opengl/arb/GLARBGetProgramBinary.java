// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_get_program_binary`
public final class GLARBGetProgramBinary {
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
    public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
    public static final int GL_PROGRAM_BINARY_FORMATS = 0x87FF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetProgramBinary = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramBinary = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGetProgramBinary;
        public final MemorySegment PFN_glProgramBinary;
        public final MemorySegment PFN_glProgramParameteri;
        private Handles(GLLoadFunc func) {
            PFN_glGetProgramBinary = func.invoke("glGetProgramBinary");
            PFN_glProgramBinary = func.invoke("glProgramBinary");
            PFN_glProgramParameteri = func.invoke("glProgramParameteri");
        }
    }

    public GLARBGetProgramBinary(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetProgramBinary`.
    /// ```
    /// void glGetProgramBinary((unsigned int) GLuint program, (int) GLsizei bufSize, GLsizei* length, GLenum* binaryFormat, void* binary);
    /// ```
    public void GetProgramBinary(int program, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment binaryFormat, @NonNull MemorySegment binary) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramBinary)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramBinary");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramBinary", program, bufSize, length, binaryFormat, binary); }
        Handles.MH_glGetProgramBinary.invokeExact(handles.PFN_glGetProgramBinary, program, bufSize, length, binaryFormat, binary); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramBinary", e); }
    }

    /// Invokes `glProgramBinary`.
    /// ```
    /// void glProgramBinary((unsigned int) GLuint program, (unsigned int) GLenum binaryFormat, const void* binary, (int) GLsizei length);
    /// ```
    public void ProgramBinary(int program, int binaryFormat, @NonNull MemorySegment binary, int length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramBinary)) throw new GLSymbolNotFoundError("Symbol not found: glProgramBinary");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramBinary", program, binaryFormat, binary, length); }
        Handles.MH_glProgramBinary.invokeExact(handles.PFN_glProgramBinary, program, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramBinary", e); }
    }

    /// Invokes `glProgramParameteri`.
    /// ```
    /// void glProgramParameteri((unsigned int) GLuint program, (unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void ProgramParameteri(int program, int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameteri", program, pname, value); }
        Handles.MH_glProgramParameteri.invokeExact(handles.PFN_glProgramParameteri, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameteri", e); }
    }

}
