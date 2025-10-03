// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_occlusion_query_event`
public final class GLAMDOcclusionQueryEvent {
    public static final int GL_OCCLUSION_QUERY_EVENT_MASK_AMD = 0x874F;
    public static final int GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD = 0x00000001;
    public static final int GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD = 0x00000002;
    public static final int GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD = 0x00000004;
    public static final int GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD = 0x00000008;
    public static final int GL_QUERY_ALL_EVENT_BITS_AMD = 0xFFFFFFFF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glQueryObjectParameteruiAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glQueryObjectParameteruiAMD;
        private Handles(GLLoadFunc func) {
            PFN_glQueryObjectParameteruiAMD = func.invoke("glQueryObjectParameteruiAMD");
        }
    }

    public GLAMDOcclusionQueryEvent(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glQueryObjectParameteruiAMD`.
    /// ```
    /// void glQueryObjectParameteruiAMD((unsigned int) GLenum target, (unsigned int) GLuint id, (unsigned int) GLenum pname, (unsigned int) GLuint param);
    /// ```
    public void QueryObjectParameteruiAMD(int target, int id, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryObjectParameteruiAMD)) throw new GLSymbolNotFoundError("Symbol not found: glQueryObjectParameteruiAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glQueryObjectParameteruiAMD", target, id, pname, param); }
        Handles.MH_glQueryObjectParameteruiAMD.invokeExact(handles.PFN_glQueryObjectParameteruiAMD, target, id, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in QueryObjectParameteruiAMD", e); }
    }

}
