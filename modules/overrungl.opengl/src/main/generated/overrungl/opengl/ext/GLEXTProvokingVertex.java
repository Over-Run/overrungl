// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_provoking_vertex`
public final class GLEXTProvokingVertex {
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION_EXT = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION_EXT = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX_EXT = 0x8E4F;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glProvokingVertexEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glProvokingVertexEXT;
        private Handles(GLLoadFunc func) {
            PFN_glProvokingVertexEXT = func.invoke("glProvokingVertexEXT", "glProvokingVertex");
        }
    }

    public GLEXTProvokingVertex(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glProvokingVertexEXT`.
    /// ```
    /// void glProvokingVertexEXT((unsigned int) GLenum mode);
    /// ```
    public void ProvokingVertexEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProvokingVertexEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProvokingVertexEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProvokingVertexEXT", mode); }
        Handles.MH_glProvokingVertexEXT.get().invokeExact(handles.PFN_glProvokingVertexEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in ProvokingVertexEXT", e); }
    }

}
