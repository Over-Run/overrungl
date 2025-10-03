// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_stencil_two_side`
public final class GLEXTStencilTwoSide {
    public static final int GL_STENCIL_TEST_TWO_SIDE_EXT = 0x8910;
    public static final int GL_ACTIVE_STENCIL_FACE_EXT = 0x8911;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glActiveStencilFaceEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glActiveStencilFaceEXT;
        private Handles(GLLoadFunc func) {
            PFN_glActiveStencilFaceEXT = func.invoke("glActiveStencilFaceEXT");
        }
    }

    public GLEXTStencilTwoSide(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glActiveStencilFaceEXT`.
    /// ```
    /// void glActiveStencilFaceEXT((unsigned int) GLenum face);
    /// ```
    public void ActiveStencilFaceEXT(int face) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveStencilFaceEXT)) throw new GLSymbolNotFoundError("Symbol not found: glActiveStencilFaceEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glActiveStencilFaceEXT", face); }
        Handles.MH_glActiveStencilFaceEXT.invokeExact(handles.PFN_glActiveStencilFaceEXT, face); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveStencilFaceEXT", e); }
    }

}
