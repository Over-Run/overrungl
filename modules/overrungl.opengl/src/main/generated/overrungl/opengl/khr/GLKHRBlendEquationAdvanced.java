// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_KHR_blend_equation_advanced`
public final class GLKHRBlendEquationAdvanced {
    public static final int GL_MULTIPLY_KHR = 0x9294;
    public static final int GL_SCREEN_KHR = 0x9295;
    public static final int GL_OVERLAY_KHR = 0x9296;
    public static final int GL_DARKEN_KHR = 0x9297;
    public static final int GL_LIGHTEN_KHR = 0x9298;
    public static final int GL_COLORDODGE_KHR = 0x9299;
    public static final int GL_COLORBURN_KHR = 0x929A;
    public static final int GL_HARDLIGHT_KHR = 0x929B;
    public static final int GL_SOFTLIGHT_KHR = 0x929C;
    public static final int GL_DIFFERENCE_KHR = 0x929E;
    public static final int GL_EXCLUSION_KHR = 0x92A0;
    public static final int GL_HSL_HUE_KHR = 0x92AD;
    public static final int GL_HSL_SATURATION_KHR = 0x92AE;
    public static final int GL_HSL_COLOR_KHR = 0x92AF;
    public static final int GL_HSL_LUMINOSITY_KHR = 0x92B0;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBlendBarrierKHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glBlendBarrierKHR;
        private Handles(GLLoadFunc func) {
            PFN_glBlendBarrierKHR = func.invoke("glBlendBarrierKHR", "glBlendBarrier");
        }
    }

    public GLKHRBlendEquationAdvanced(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendBarrierKHR`.
    /// ```
    /// void glBlendBarrierKHR();
    /// ```
    public void BlendBarrierKHR() {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendBarrierKHR)) throw new GLSymbolNotFoundError("Symbol not found: glBlendBarrierKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendBarrierKHR"); }
        Handles.MH_glBlendBarrierKHR.get().invokeExact(handles.PFN_glBlendBarrierKHR); }
        catch (Throwable e) { throw new RuntimeException("error in BlendBarrierKHR", e); }
    }

}
