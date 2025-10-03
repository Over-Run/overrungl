// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.intel;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_INTEL_parallel_arrays`
public final class GLINTELParallelArrays {
    public static final int GL_PARALLEL_ARRAYS_INTEL = 0x83F4;
    public static final int GL_VERTEX_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F5;
    public static final int GL_NORMAL_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F6;
    public static final int GL_COLOR_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F7;
    public static final int GL_TEXTURE_COORD_ARRAY_PARALLEL_POINTERS_INTEL = 0x83F8;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexPointervINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalPointervINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorPointervINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoordPointervINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertexPointervINTEL;
        public final MemorySegment PFN_glNormalPointervINTEL;
        public final MemorySegment PFN_glColorPointervINTEL;
        public final MemorySegment PFN_glTexCoordPointervINTEL;
        private Handles(GLLoadFunc func) {
            PFN_glVertexPointervINTEL = func.invoke("glVertexPointervINTEL");
            PFN_glNormalPointervINTEL = func.invoke("glNormalPointervINTEL");
            PFN_glColorPointervINTEL = func.invoke("glColorPointervINTEL");
            PFN_glTexCoordPointervINTEL = func.invoke("glTexCoordPointervINTEL");
        }
    }

    public GLINTELParallelArrays(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexPointervINTEL`.
    /// ```
    /// void glVertexPointervINTEL((int) GLint size, (unsigned int) GLenum type, const void** pointer);
    /// ```
    public void VertexPointervINTEL(int size, int type, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexPointervINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glVertexPointervINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexPointervINTEL", size, type, pointer); }
        Handles.MH_glVertexPointervINTEL.invokeExact(handles.PFN_glVertexPointervINTEL, size, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexPointervINTEL", e); }
    }

    /// Invokes `glNormalPointervINTEL`.
    /// ```
    /// void glNormalPointervINTEL((unsigned int) GLenum type, const void** pointer);
    /// ```
    public void NormalPointervINTEL(int type, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalPointervINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glNormalPointervINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalPointervINTEL", type, pointer); }
        Handles.MH_glNormalPointervINTEL.invokeExact(handles.PFN_glNormalPointervINTEL, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in NormalPointervINTEL", e); }
    }

    /// Invokes `glColorPointervINTEL`.
    /// ```
    /// void glColorPointervINTEL((int) GLint size, (unsigned int) GLenum type, const void** pointer);
    /// ```
    public void ColorPointervINTEL(int size, int type, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorPointervINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glColorPointervINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorPointervINTEL", size, type, pointer); }
        Handles.MH_glColorPointervINTEL.invokeExact(handles.PFN_glColorPointervINTEL, size, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in ColorPointervINTEL", e); }
    }

    /// Invokes `glTexCoordPointervINTEL`.
    /// ```
    /// void glTexCoordPointervINTEL((int) GLint size, (unsigned int) GLenum type, const void** pointer);
    /// ```
    public void TexCoordPointervINTEL(int size, int type, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordPointervINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordPointervINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordPointervINTEL", size, type, pointer); }
        Handles.MH_glTexCoordPointervINTEL.invokeExact(handles.PFN_glTexCoordPointervINTEL, size, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordPointervINTEL", e); }
    }

}
