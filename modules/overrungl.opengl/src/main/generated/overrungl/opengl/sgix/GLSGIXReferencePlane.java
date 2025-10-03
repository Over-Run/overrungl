// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_reference_plane`
public final class GLSGIXReferencePlane {
    public static final int GL_REFERENCE_PLANE_SGIX = 0x817D;
    public static final int GL_REFERENCE_PLANE_EQUATION_SGIX = 0x817E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glReferencePlaneSGIX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public final MemorySegment PFN_glReferencePlaneSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glReferencePlaneSGIX = func.invoke("glReferencePlaneSGIX");
        }
    }

    public GLSGIXReferencePlane(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glReferencePlaneSGIX`.
    /// ```
    /// void glReferencePlaneSGIX(const GLdouble* equation);
    /// ```
    public void ReferencePlaneSGIX(@NonNull MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReferencePlaneSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glReferencePlaneSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReferencePlaneSGIX", equation); }
        Handles.MH_glReferencePlaneSGIX.invokeExact(handles.PFN_glReferencePlaneSGIX, equation); }
        catch (Throwable e) { throw new RuntimeException("error in ReferencePlaneSGIX", e); }
    }

}
