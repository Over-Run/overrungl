// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.oes;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_OES_single_precision`
public final class GLOESSinglePrecision {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glClearDepthfOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glClipPlanefOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangefOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glFrustumfOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glGetClipPlanefOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glOrthofOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glClearDepthfOES;
        public final MemorySegment PFN_glClipPlanefOES;
        public final MemorySegment PFN_glDepthRangefOES;
        public final MemorySegment PFN_glFrustumfOES;
        public final MemorySegment PFN_glGetClipPlanefOES;
        public final MemorySegment PFN_glOrthofOES;
        private Handles(GLLoadFunc func) {
            PFN_glClearDepthfOES = func.invoke("glClearDepthfOES", "glClearDepthf");
            PFN_glClipPlanefOES = func.invoke("glClipPlanefOES");
            PFN_glDepthRangefOES = func.invoke("glDepthRangefOES", "glDepthRangef");
            PFN_glFrustumfOES = func.invoke("glFrustumfOES");
            PFN_glGetClipPlanefOES = func.invoke("glGetClipPlanefOES");
            PFN_glOrthofOES = func.invoke("glOrthofOES");
        }
    }

    public GLOESSinglePrecision(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glClearDepthfOES`.
    /// ```
    /// void glClearDepthfOES(((float) khronos_float_t) GLclampf depth);
    /// ```
    public void ClearDepthfOES(float depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearDepthfOES)) throw new GLSymbolNotFoundError("Symbol not found: glClearDepthfOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearDepthfOES", depth); }
        Handles.MH_glClearDepthfOES.invokeExact(handles.PFN_glClearDepthfOES, depth); }
        catch (Throwable e) { throw new RuntimeException("error in ClearDepthfOES", e); }
    }

    /// Invokes `glClipPlanefOES`.
    /// ```
    /// void glClipPlanefOES((unsigned int) GLenum plane, const GLfloat* equation);
    /// ```
    public void ClipPlanefOES(int plane, @NonNull MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClipPlanefOES)) throw new GLSymbolNotFoundError("Symbol not found: glClipPlanefOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClipPlanefOES", plane, equation); }
        Handles.MH_glClipPlanefOES.invokeExact(handles.PFN_glClipPlanefOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in ClipPlanefOES", e); }
    }

    /// Invokes `glDepthRangefOES`.
    /// ```
    /// void glDepthRangefOES(((float) khronos_float_t) GLclampf n, ((float) khronos_float_t) GLclampf f);
    /// ```
    public void DepthRangefOES(float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangefOES)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangefOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthRangefOES", n, f); }
        Handles.MH_glDepthRangefOES.invokeExact(handles.PFN_glDepthRangefOES, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangefOES", e); }
    }

    /// Invokes `glFrustumfOES`.
    /// ```
    /// void glFrustumfOES(((float) khronos_float_t) GLfloat l, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat n, ((float) khronos_float_t) GLfloat f);
    /// ```
    public void FrustumfOES(float l, float r, float b, float t, float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFrustumfOES)) throw new GLSymbolNotFoundError("Symbol not found: glFrustumfOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFrustumfOES", l, r, b, t, n, f); }
        Handles.MH_glFrustumfOES.invokeExact(handles.PFN_glFrustumfOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in FrustumfOES", e); }
    }

    /// Invokes `glGetClipPlanefOES`.
    /// ```
    /// void glGetClipPlanefOES((unsigned int) GLenum plane, GLfloat* equation);
    /// ```
    public void GetClipPlanefOES(int plane, @NonNull MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetClipPlanefOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetClipPlanefOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetClipPlanefOES", plane, equation); }
        Handles.MH_glGetClipPlanefOES.invokeExact(handles.PFN_glGetClipPlanefOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in GetClipPlanefOES", e); }
    }

    /// Invokes `glOrthofOES`.
    /// ```
    /// void glOrthofOES(((float) khronos_float_t) GLfloat l, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat n, ((float) khronos_float_t) GLfloat f);
    /// ```
    public void OrthofOES(float l, float r, float b, float t, float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glOrthofOES)) throw new GLSymbolNotFoundError("Symbol not found: glOrthofOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glOrthofOES", l, r, b, t, n, f); }
        Handles.MH_glOrthofOES.invokeExact(handles.PFN_glOrthofOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in OrthofOES", e); }
    }

}
