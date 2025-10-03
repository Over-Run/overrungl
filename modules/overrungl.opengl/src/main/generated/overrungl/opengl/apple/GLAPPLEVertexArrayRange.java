// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.apple;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_APPLE_vertex_array_range`
public final class GLAPPLEVertexArrayRange {
    public static final int GL_VERTEX_ARRAY_RANGE_APPLE = 0x851D;
    public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE = 0x851E;
    public static final int GL_VERTEX_ARRAY_STORAGE_HINT_APPLE = 0x851F;
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_APPLE = 0x8521;
    public static final int GL_STORAGE_CLIENT_APPLE = 0x85B4;
    public static final int GL_STORAGE_CACHED_APPLE = 0x85BE;
    public static final int GL_STORAGE_SHARED_APPLE = 0x85BF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexArrayRangeAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFlushVertexArrayRangeAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexArrayParameteriAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glVertexArrayRangeAPPLE;
        public final MemorySegment PFN_glFlushVertexArrayRangeAPPLE;
        public final MemorySegment PFN_glVertexArrayParameteriAPPLE;
        private Handles(GLLoadFunc func) {
            PFN_glVertexArrayRangeAPPLE = func.invoke("glVertexArrayRangeAPPLE");
            PFN_glFlushVertexArrayRangeAPPLE = func.invoke("glFlushVertexArrayRangeAPPLE");
            PFN_glVertexArrayParameteriAPPLE = func.invoke("glVertexArrayParameteriAPPLE");
        }
    }

    public GLAPPLEVertexArrayRange(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexArrayRangeAPPLE`.
    /// ```
    /// void glVertexArrayRangeAPPLE((int) GLsizei length, void* pointer);
    /// ```
    public void VertexArrayRangeAPPLE(int length, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayRangeAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayRangeAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayRangeAPPLE", length, pointer); }
        Handles.MH_glVertexArrayRangeAPPLE.invokeExact(handles.PFN_glVertexArrayRangeAPPLE, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayRangeAPPLE", e); }
    }

    /// Invokes `glFlushVertexArrayRangeAPPLE`.
    /// ```
    /// void glFlushVertexArrayRangeAPPLE((int) GLsizei length, void* pointer);
    /// ```
    public void FlushVertexArrayRangeAPPLE(int length, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushVertexArrayRangeAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glFlushVertexArrayRangeAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFlushVertexArrayRangeAPPLE", length, pointer); }
        Handles.MH_glFlushVertexArrayRangeAPPLE.invokeExact(handles.PFN_glFlushVertexArrayRangeAPPLE, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in FlushVertexArrayRangeAPPLE", e); }
    }

    /// Invokes `glVertexArrayParameteriAPPLE`.
    /// ```
    /// void glVertexArrayParameteriAPPLE((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void VertexArrayParameteriAPPLE(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayParameteriAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayParameteriAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayParameteriAPPLE", pname, param); }
        Handles.MH_glVertexArrayParameteriAPPLE.invokeExact(handles.PFN_glVertexArrayParameteriAPPLE, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayParameteriAPPLE", e); }
    }

}
