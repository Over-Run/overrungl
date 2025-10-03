// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_occlusion_query`
public final class GLARBOcclusionQuery {
    public static final int GL_QUERY_COUNTER_BITS_ARB = 0x8864;
    public static final int GL_CURRENT_QUERY_ARB = 0x8865;
    public static final int GL_QUERY_RESULT_ARB = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE_ARB = 0x8867;
    public static final int GL_SAMPLES_PASSED_ARB = 0x8914;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGenQueriesARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeleteQueriesARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsQueryARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBeginQueryARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glEndQueryARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetQueryivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetQueryObjectivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetQueryObjectuivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGenQueriesARB;
        public final MemorySegment PFN_glDeleteQueriesARB;
        public final MemorySegment PFN_glIsQueryARB;
        public final MemorySegment PFN_glBeginQueryARB;
        public final MemorySegment PFN_glEndQueryARB;
        public final MemorySegment PFN_glGetQueryivARB;
        public final MemorySegment PFN_glGetQueryObjectivARB;
        public final MemorySegment PFN_glGetQueryObjectuivARB;
        private Handles(GLLoadFunc func) {
            PFN_glGenQueriesARB = func.invoke("glGenQueriesARB", "glGenQueries");
            PFN_glDeleteQueriesARB = func.invoke("glDeleteQueriesARB", "glDeleteQueries");
            PFN_glIsQueryARB = func.invoke("glIsQueryARB", "glIsQuery");
            PFN_glBeginQueryARB = func.invoke("glBeginQueryARB", "glBeginQuery");
            PFN_glEndQueryARB = func.invoke("glEndQueryARB", "glEndQuery");
            PFN_glGetQueryivARB = func.invoke("glGetQueryivARB", "glGetQueryiv");
            PFN_glGetQueryObjectivARB = func.invoke("glGetQueryObjectivARB", "glGetQueryObjectiv");
            PFN_glGetQueryObjectuivARB = func.invoke("glGetQueryObjectuivARB", "glGetQueryObjectuiv");
        }
    }

    public GLARBOcclusionQuery(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGenQueriesARB`.
    /// ```
    /// void glGenQueriesARB((int) GLsizei n, GLuint* ids);
    /// ```
    public void GenQueriesARB(int n, @NonNull MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenQueriesARB)) throw new GLSymbolNotFoundError("Symbol not found: glGenQueriesARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenQueriesARB", n, ids); }
        Handles.MH_glGenQueriesARB.get().invokeExact(handles.PFN_glGenQueriesARB, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenQueriesARB", e); }
    }

    /// Invokes `glDeleteQueriesARB`.
    /// ```
    /// void glDeleteQueriesARB((int) GLsizei n, const GLuint* ids);
    /// ```
    public void DeleteQueriesARB(int n, @NonNull MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteQueriesARB)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteQueriesARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteQueriesARB", n, ids); }
        Handles.MH_glDeleteQueriesARB.get().invokeExact(handles.PFN_glDeleteQueriesARB, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteQueriesARB", e); }
    }

    /// Invokes `glIsQueryARB`.
    /// ```
    /// GLboolean glIsQueryARB((unsigned int) GLuint id);
    /// ```
    public boolean IsQueryARB(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsQueryARB)) throw new GLSymbolNotFoundError("Symbol not found: glIsQueryARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsQueryARB", id); }
        return (((byte) Handles.MH_glIsQueryARB.get().invokeExact(handles.PFN_glIsQueryARB, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsQueryARB", e); }
    }

    /// Invokes `glBeginQueryARB`.
    /// ```
    /// void glBeginQueryARB((unsigned int) GLenum target, (unsigned int) GLuint id);
    /// ```
    public void BeginQueryARB(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginQueryARB)) throw new GLSymbolNotFoundError("Symbol not found: glBeginQueryARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginQueryARB", target, id); }
        Handles.MH_glBeginQueryARB.get().invokeExact(handles.PFN_glBeginQueryARB, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginQueryARB", e); }
    }

    /// Invokes `glEndQueryARB`.
    /// ```
    /// void glEndQueryARB((unsigned int) GLenum target);
    /// ```
    public void EndQueryARB(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndQueryARB)) throw new GLSymbolNotFoundError("Symbol not found: glEndQueryARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndQueryARB", target); }
        Handles.MH_glEndQueryARB.get().invokeExact(handles.PFN_glEndQueryARB, target); }
        catch (Throwable e) { throw new RuntimeException("error in EndQueryARB", e); }
    }

    /// Invokes `glGetQueryivARB`.
    /// ```
    /// void glGetQueryivARB((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetQueryivARB(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryivARB", target, pname, params); }
        Handles.MH_glGetQueryivARB.get().invokeExact(handles.PFN_glGetQueryivARB, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryivARB", e); }
    }

    /// Invokes `glGetQueryObjectivARB`.
    /// ```
    /// void glGetQueryObjectivARB((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetQueryObjectivARB(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjectivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjectivARB", id, pname, params); }
        Handles.MH_glGetQueryObjectivARB.get().invokeExact(handles.PFN_glGetQueryObjectivARB, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectivARB", e); }
    }

    /// Invokes `glGetQueryObjectuivARB`.
    /// ```
    /// void glGetQueryObjectuivARB((unsigned int) GLuint id, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetQueryObjectuivARB(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectuivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjectuivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjectuivARB", id, pname, params); }
        Handles.MH_glGetQueryObjectuivARB.get().invokeExact(handles.PFN_glGetQueryObjectuivARB, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectuivARB", e); }
    }

}
