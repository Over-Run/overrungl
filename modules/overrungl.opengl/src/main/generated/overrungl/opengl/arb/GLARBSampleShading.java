// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_sample_shading`
public final class GLARBSampleShading {
    public static final int GL_SAMPLE_SHADING_ARB = 0x8C36;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 0x8C37;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMinSampleShadingARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glMinSampleShadingARB;
        private Handles(GLLoadFunc func) {
            PFN_glMinSampleShadingARB = func.invoke("glMinSampleShadingARB", "glMinSampleShading");
        }
    }

    public GLARBSampleShading(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMinSampleShadingARB`.
    /// ```
    /// void glMinSampleShadingARB(((float) khronos_float_t) GLfloat value);
    /// ```
    public void MinSampleShadingARB(float value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMinSampleShadingARB)) throw new GLSymbolNotFoundError("Symbol not found: glMinSampleShadingARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMinSampleShadingARB", value); }
        Handles.MH_glMinSampleShadingARB.invokeExact(handles.PFN_glMinSampleShadingARB, value); }
        catch (Throwable e) { throw new RuntimeException("error in MinSampleShadingARB", e); }
    }

}
