// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.apple;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_APPLE_vertex_array_object`
public final class GLAPPLEVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBindVertexArrayAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDeleteVertexArraysAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGenVertexArraysAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsVertexArrayAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBindVertexArrayAPPLE;
        public final MemorySegment PFN_glDeleteVertexArraysAPPLE;
        public final MemorySegment PFN_glGenVertexArraysAPPLE;
        public final MemorySegment PFN_glIsVertexArrayAPPLE;
        private Handles(GLLoadFunc func) {
            PFN_glBindVertexArrayAPPLE = func.invoke("glBindVertexArrayAPPLE");
            PFN_glDeleteVertexArraysAPPLE = func.invoke("glDeleteVertexArraysAPPLE", "glDeleteVertexArrays");
            PFN_glGenVertexArraysAPPLE = func.invoke("glGenVertexArraysAPPLE", "glGenVertexArrays");
            PFN_glIsVertexArrayAPPLE = func.invoke("glIsVertexArrayAPPLE", "glIsVertexArray");
        }
    }

    public GLAPPLEVertexArrayObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBindVertexArrayAPPLE`.
    /// ```
    /// void glBindVertexArrayAPPLE((unsigned int) GLuint array);
    /// ```
    public void BindVertexArrayAPPLE(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glBindVertexArrayAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindVertexArrayAPPLE", array); }
        Handles.MH_glBindVertexArrayAPPLE.get().invokeExact(handles.PFN_glBindVertexArrayAPPLE, array); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexArrayAPPLE", e); }
    }

    /// Invokes `glDeleteVertexArraysAPPLE`.
    /// ```
    /// void glDeleteVertexArraysAPPLE((int) GLsizei n, const GLuint* arrays);
    /// ```
    public void DeleteVertexArraysAPPLE(int n, @NonNull MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteVertexArraysAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteVertexArraysAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteVertexArraysAPPLE", n, arrays); }
        Handles.MH_glDeleteVertexArraysAPPLE.get().invokeExact(handles.PFN_glDeleteVertexArraysAPPLE, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteVertexArraysAPPLE", e); }
    }

    /// Invokes `glGenVertexArraysAPPLE`.
    /// ```
    /// void glGenVertexArraysAPPLE((int) GLsizei n, GLuint* arrays);
    /// ```
    public void GenVertexArraysAPPLE(int n, @NonNull MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenVertexArraysAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glGenVertexArraysAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenVertexArraysAPPLE", n, arrays); }
        Handles.MH_glGenVertexArraysAPPLE.get().invokeExact(handles.PFN_glGenVertexArraysAPPLE, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in GenVertexArraysAPPLE", e); }
    }

    /// Invokes `glIsVertexArrayAPPLE`.
    /// ```
    /// GLboolean glIsVertexArrayAPPLE((unsigned int) GLuint array);
    /// ```
    public boolean IsVertexArrayAPPLE(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsVertexArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glIsVertexArrayAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsVertexArrayAPPLE", array); }
        return (((byte) Handles.MH_glIsVertexArrayAPPLE.get().invokeExact(handles.PFN_glIsVertexArrayAPPLE, array)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsVertexArrayAPPLE", e); }
    }

}
