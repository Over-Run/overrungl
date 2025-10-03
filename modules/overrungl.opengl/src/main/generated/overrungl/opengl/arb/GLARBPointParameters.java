// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_point_parameters`
public final class GLARBPointParameters {
    public static final int GL_POINT_SIZE_MIN_ARB = 0x8126;
    public static final int GL_POINT_SIZE_MAX_ARB = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_ARB = 0x8128;
    public static final int GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPointParameterfARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glPointParameterfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glPointParameterfARB;
        public final MemorySegment PFN_glPointParameterfvARB;
        private Handles(GLLoadFunc func) {
            PFN_glPointParameterfARB = func.invoke("glPointParameterfARB", "glPointParameterf");
            PFN_glPointParameterfvARB = func.invoke("glPointParameterfvARB", "glPointParameterfv");
        }
    }

    public GLARBPointParameters(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPointParameterfARB`.
    /// ```
    /// void glPointParameterfARB((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void PointParameterfARB(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfARB)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfARB", pname, param); }
        Handles.MH_glPointParameterfARB.invokeExact(handles.PFN_glPointParameterfARB, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfARB", e); }
    }

    /// Invokes `glPointParameterfvARB`.
    /// ```
    /// void glPointParameterfvARB((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void PointParameterfvARB(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfvARB", pname, params); }
        Handles.MH_glPointParameterfvARB.invokeExact(handles.PFN_glPointParameterfvARB, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfvARB", e); }
    }

}
