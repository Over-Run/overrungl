// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_cull_vertex`
public final class GLEXTCullVertex {
    public static final int GL_CULL_VERTEX_EXT = 0x81AA;
    public static final int GL_CULL_VERTEX_EYE_POSITION_EXT = 0x81AB;
    public static final int GL_CULL_VERTEX_OBJECT_POSITION_EXT = 0x81AC;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glCullParameterdvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glCullParameterfvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glCullParameterdvEXT;
        public final MemorySegment PFN_glCullParameterfvEXT;
        private Handles(GLLoadFunc func) {
            PFN_glCullParameterdvEXT = func.invoke("glCullParameterdvEXT");
            PFN_glCullParameterfvEXT = func.invoke("glCullParameterfvEXT");
        }
    }

    public GLEXTCullVertex(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCullParameterdvEXT`.
    /// ```
    /// void glCullParameterdvEXT((unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void CullParameterdvEXT(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCullParameterdvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCullParameterdvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCullParameterdvEXT", pname, params); }
        Handles.MH_glCullParameterdvEXT.get().invokeExact(handles.PFN_glCullParameterdvEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in CullParameterdvEXT", e); }
    }

    /// Invokes `glCullParameterfvEXT`.
    /// ```
    /// void glCullParameterfvEXT((unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void CullParameterfvEXT(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCullParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCullParameterfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCullParameterfvEXT", pname, params); }
        Handles.MH_glCullParameterfvEXT.get().invokeExact(handles.PFN_glCullParameterfvEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in CullParameterfvEXT", e); }
    }

}
