// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_query_resource`
public final class GLNVQueryResource {
    public static final int GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV = 0x9540;
    public static final int GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV = 0x9542;
    public static final int GL_QUERY_RESOURCE_SYS_RESERVED_NV = 0x9544;
    public static final int GL_QUERY_RESOURCE_TEXTURE_NV = 0x9545;
    public static final int GL_QUERY_RESOURCE_RENDERBUFFER_NV = 0x9546;
    public static final int GL_QUERY_RESOURCE_BUFFEROBJECT_NV = 0x9547;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glQueryResourceNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glQueryResourceNV;
        private Handles(GLLoadFunc func) {
            PFN_glQueryResourceNV = func.invoke("glQueryResourceNV");
        }
    }

    public GLNVQueryResource(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glQueryResourceNV`.
    /// ```
    /// (int) GLint glQueryResourceNV((unsigned int) GLenum queryType, (int) GLint tagId, (unsigned int) GLuint count, GLint* buffer);
    /// ```
    public int QueryResourceNV(int queryType, int tagId, int count, @NonNull MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryResourceNV)) throw new GLSymbolNotFoundError("Symbol not found: glQueryResourceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glQueryResourceNV", queryType, tagId, count, buffer); }
        return (int) Handles.MH_glQueryResourceNV.invokeExact(handles.PFN_glQueryResourceNV, queryType, tagId, count, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in QueryResourceNV", e); }
    }

}
