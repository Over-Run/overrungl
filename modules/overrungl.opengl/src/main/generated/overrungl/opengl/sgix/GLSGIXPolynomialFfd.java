// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_polynomial_ffd`
public final class GLSGIXPolynomialFfd {
    public static final int GL_TEXTURE_DEFORMATION_BIT_SGIX = 0x00000001;
    public static final int GL_GEOMETRY_DEFORMATION_BIT_SGIX = 0x00000002;
    public static final int GL_GEOMETRY_DEFORMATION_SGIX = 0x8194;
    public static final int GL_TEXTURE_DEFORMATION_SGIX = 0x8195;
    public static final int GL_DEFORMATIONS_MASK_SGIX = 0x8196;
    public static final int GL_MAX_DEFORMATION_ORDER_SGIX = 0x8197;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glDeformationMap3dSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeformationMap3fSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeformSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glLoadIdentityDeformationMapSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glDeformationMap3dSGIX;
        public final MemorySegment PFN_glDeformationMap3fSGIX;
        public final MemorySegment PFN_glDeformSGIX;
        public final MemorySegment PFN_glLoadIdentityDeformationMapSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glDeformationMap3dSGIX = func.invoke("glDeformationMap3dSGIX");
            PFN_glDeformationMap3fSGIX = func.invoke("glDeformationMap3fSGIX");
            PFN_glDeformSGIX = func.invoke("glDeformSGIX");
            PFN_glLoadIdentityDeformationMapSGIX = func.invoke("glLoadIdentityDeformationMapSGIX");
        }
    }

    public GLSGIXPolynomialFfd(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDeformationMap3dSGIX`.
    /// ```
    /// void glDeformationMap3dSGIX((unsigned int) GLenum target, (double) GLdouble u1, (double) GLdouble u2, (int) GLint ustride, (int) GLint uorder, (double) GLdouble v1, (double) GLdouble v2, (int) GLint vstride, (int) GLint vorder, (double) GLdouble w1, (double) GLdouble w2, (int) GLint wstride, (int) GLint worder, const GLdouble* points);
    /// ```
    public void DeformationMap3dSGIX(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double w1, double w2, int wstride, int worder, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeformationMap3dSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glDeformationMap3dSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeformationMap3dSGIX", target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, w1, w2, wstride, worder, points); }
        Handles.MH_glDeformationMap3dSGIX.get().invokeExact(handles.PFN_glDeformationMap3dSGIX, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, w1, w2, wstride, worder, points); }
        catch (Throwable e) { throw new RuntimeException("error in DeformationMap3dSGIX", e); }
    }

    /// Invokes `glDeformationMap3fSGIX`.
    /// ```
    /// void glDeformationMap3fSGIX((unsigned int) GLenum target, ((float) khronos_float_t) GLfloat u1, ((float) khronos_float_t) GLfloat u2, (int) GLint ustride, (int) GLint uorder, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, (int) GLint vstride, (int) GLint vorder, ((float) khronos_float_t) GLfloat w1, ((float) khronos_float_t) GLfloat w2, (int) GLint wstride, (int) GLint worder, const GLfloat* points);
    /// ```
    public void DeformationMap3fSGIX(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float w1, float w2, int wstride, int worder, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeformationMap3fSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glDeformationMap3fSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeformationMap3fSGIX", target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, w1, w2, wstride, worder, points); }
        Handles.MH_glDeformationMap3fSGIX.get().invokeExact(handles.PFN_glDeformationMap3fSGIX, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, w1, w2, wstride, worder, points); }
        catch (Throwable e) { throw new RuntimeException("error in DeformationMap3fSGIX", e); }
    }

    /// Invokes `glDeformSGIX`.
    /// ```
    /// void glDeformSGIX((unsigned int) GLbitfield mask);
    /// ```
    public void DeformSGIX(int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeformSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glDeformSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeformSGIX", mask); }
        Handles.MH_glDeformSGIX.get().invokeExact(handles.PFN_glDeformSGIX, mask); }
        catch (Throwable e) { throw new RuntimeException("error in DeformSGIX", e); }
    }

    /// Invokes `glLoadIdentityDeformationMapSGIX`.
    /// ```
    /// void glLoadIdentityDeformationMapSGIX((unsigned int) GLbitfield mask);
    /// ```
    public void LoadIdentityDeformationMapSGIX(int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadIdentityDeformationMapSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glLoadIdentityDeformationMapSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLoadIdentityDeformationMapSGIX", mask); }
        Handles.MH_glLoadIdentityDeformationMapSGIX.get().invokeExact(handles.PFN_glLoadIdentityDeformationMapSGIX, mask); }
        catch (Throwable e) { throw new RuntimeException("error in LoadIdentityDeformationMapSGIX", e); }
    }

}
