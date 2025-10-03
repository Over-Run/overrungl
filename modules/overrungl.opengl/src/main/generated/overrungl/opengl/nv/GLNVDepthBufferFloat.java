// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_depth_buffer_float`
public final class GLNVDepthBufferFloat {
    public static final int GL_DEPTH_COMPONENT32F_NV = 0x8DAB;
    public static final int GL_DEPTH32F_STENCIL8_NV = 0x8DAC;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 0x8DAD;
    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 0x8DAF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDepthRangedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glClearDepthdNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glDepthBoundsdNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public final MemorySegment PFN_glDepthRangedNV;
        public final MemorySegment PFN_glClearDepthdNV;
        public final MemorySegment PFN_glDepthBoundsdNV;
        private Handles(GLLoadFunc func) {
            PFN_glDepthRangedNV = func.invoke("glDepthRangedNV");
            PFN_glClearDepthdNV = func.invoke("glClearDepthdNV");
            PFN_glDepthBoundsdNV = func.invoke("glDepthBoundsdNV");
        }
    }

    public GLNVDepthBufferFloat(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDepthRangedNV`.
    /// ```
    /// void glDepthRangedNV((double) GLdouble zNear, (double) GLdouble zFar);
    /// ```
    public void DepthRangedNV(double zNear, double zFar) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangedNV)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthRangedNV", zNear, zFar); }
        Handles.MH_glDepthRangedNV.invokeExact(handles.PFN_glDepthRangedNV, zNear, zFar); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangedNV", e); }
    }

    /// Invokes `glClearDepthdNV`.
    /// ```
    /// void glClearDepthdNV((double) GLdouble depth);
    /// ```
    public void ClearDepthdNV(double depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearDepthdNV)) throw new GLSymbolNotFoundError("Symbol not found: glClearDepthdNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearDepthdNV", depth); }
        Handles.MH_glClearDepthdNV.invokeExact(handles.PFN_glClearDepthdNV, depth); }
        catch (Throwable e) { throw new RuntimeException("error in ClearDepthdNV", e); }
    }

    /// Invokes `glDepthBoundsdNV`.
    /// ```
    /// void glDepthBoundsdNV((double) GLdouble zmin, (double) GLdouble zmax);
    /// ```
    public void DepthBoundsdNV(double zmin, double zmax) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthBoundsdNV)) throw new GLSymbolNotFoundError("Symbol not found: glDepthBoundsdNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthBoundsdNV", zmin, zmax); }
        Handles.MH_glDepthBoundsdNV.invokeExact(handles.PFN_glDepthBoundsdNV, zmin, zmax); }
        catch (Throwable e) { throw new RuntimeException("error in DepthBoundsdNV", e); }
    }

}
