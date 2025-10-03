// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_vertex_array_object`
public final class GLARBVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBindVertexArray = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDeleteVertexArrays = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGenVertexArrays = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsVertexArray = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBindVertexArray;
        public final MemorySegment PFN_glDeleteVertexArrays;
        public final MemorySegment PFN_glGenVertexArrays;
        public final MemorySegment PFN_glIsVertexArray;
        private Handles(GLLoadFunc func) {
            PFN_glBindVertexArray = func.invoke("glBindVertexArray");
            PFN_glDeleteVertexArrays = func.invoke("glDeleteVertexArrays");
            PFN_glGenVertexArrays = func.invoke("glGenVertexArrays");
            PFN_glIsVertexArray = func.invoke("glIsVertexArray");
        }
    }

    public GLARBVertexArrayObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBindVertexArray`.
    /// ```
    /// void glBindVertexArray((unsigned int) GLuint array);
    /// ```
    public void BindVertexArray(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexArray)) throw new GLSymbolNotFoundError("Symbol not found: glBindVertexArray");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindVertexArray", array); }
        Handles.MH_glBindVertexArray.get().invokeExact(handles.PFN_glBindVertexArray, array); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexArray", e); }
    }

    /// Invokes `glDeleteVertexArrays`.
    /// ```
    /// void glDeleteVertexArrays((int) GLsizei n, const GLuint* arrays);
    /// ```
    public void DeleteVertexArrays(int n, @NonNull MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteVertexArrays)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteVertexArrays");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteVertexArrays", n, arrays); }
        Handles.MH_glDeleteVertexArrays.get().invokeExact(handles.PFN_glDeleteVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteVertexArrays", e); }
    }

    /// Invokes `glGenVertexArrays`.
    /// ```
    /// void glGenVertexArrays((int) GLsizei n, GLuint* arrays);
    /// ```
    public void GenVertexArrays(int n, @NonNull MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenVertexArrays)) throw new GLSymbolNotFoundError("Symbol not found: glGenVertexArrays");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenVertexArrays", n, arrays); }
        Handles.MH_glGenVertexArrays.get().invokeExact(handles.PFN_glGenVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in GenVertexArrays", e); }
    }

    /// Invokes `glIsVertexArray`.
    /// ```
    /// GLboolean glIsVertexArray((unsigned int) GLuint array);
    /// ```
    public boolean IsVertexArray(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsVertexArray)) throw new GLSymbolNotFoundError("Symbol not found: glIsVertexArray");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsVertexArray", array); }
        return (((byte) Handles.MH_glIsVertexArray.get().invokeExact(handles.PFN_glIsVertexArray, array)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsVertexArray", e); }
    }

}
