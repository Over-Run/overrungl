// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_clip_space_w_scaling`
public final class GLNVClipSpaceWScaling {
    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 0x937C;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV = 0x937D;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV = 0x937E;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glViewportPositionWScaleNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public final MemorySegment PFN_glViewportPositionWScaleNV;
        private Handles(GLLoadFunc func) {
            PFN_glViewportPositionWScaleNV = func.invoke("glViewportPositionWScaleNV");
        }
    }

    public GLNVClipSpaceWScaling(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glViewportPositionWScaleNV`.
    /// ```
    /// void glViewportPositionWScaleNV((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat xcoeff, ((float) khronos_float_t) GLfloat ycoeff);
    /// ```
    public void ViewportPositionWScaleNV(int index, float xcoeff, float ycoeff) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportPositionWScaleNV)) throw new GLSymbolNotFoundError("Symbol not found: glViewportPositionWScaleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glViewportPositionWScaleNV", index, xcoeff, ycoeff); }
        Handles.MH_glViewportPositionWScaleNV.get().invokeExact(handles.PFN_glViewportPositionWScaleNV, index, xcoeff, ycoeff); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportPositionWScaleNV", e); }
    }

}
