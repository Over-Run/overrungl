// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_color_buffer_float`
public final class GLARBColorBufferFloat {
    public static final int GL_RGBA_FLOAT_MODE_ARB = 0x8820;
    public static final int GL_CLAMP_VERTEX_COLOR_ARB = 0x891A;
    public static final int GL_CLAMP_FRAGMENT_COLOR_ARB = 0x891B;
    public static final int GL_CLAMP_READ_COLOR_ARB = 0x891C;
    public static final int GL_FIXED_ONLY_ARB = 0x891D;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glClampColorARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glClampColorARB;
        private Handles(GLLoadFunc func) {
            PFN_glClampColorARB = func.invoke("glClampColorARB", "glClampColor");
        }
    }

    public GLARBColorBufferFloat(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glClampColorARB`.
    /// ```
    /// void glClampColorARB((unsigned int) GLenum target, (unsigned int) GLenum clamp);
    /// ```
    public void ClampColorARB(int target, int clamp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClampColorARB)) throw new GLSymbolNotFoundError("Symbol not found: glClampColorARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClampColorARB", target, clamp); }
        Handles.MH_glClampColorARB.invokeExact(handles.PFN_glClampColorARB, target, clamp); }
        catch (Throwable e) { throw new RuntimeException("error in ClampColorARB", e); }
    }

}
