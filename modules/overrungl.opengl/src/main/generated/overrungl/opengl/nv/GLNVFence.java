// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_fence`
public final class GLNVFence {
    public static final int GL_ALL_COMPLETED_NV = 0x84F2;
    public static final int GL_FENCE_STATUS_NV = 0x84F3;
    public static final int GL_FENCE_CONDITION_NV = 0x84F4;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDeleteFencesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenFencesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsFenceNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTestFenceNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFenceivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFinishFenceNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSetFenceNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDeleteFencesNV;
        public final MemorySegment PFN_glGenFencesNV;
        public final MemorySegment PFN_glIsFenceNV;
        public final MemorySegment PFN_glTestFenceNV;
        public final MemorySegment PFN_glGetFenceivNV;
        public final MemorySegment PFN_glFinishFenceNV;
        public final MemorySegment PFN_glSetFenceNV;
        private Handles(GLLoadFunc func) {
            PFN_glDeleteFencesNV = func.invoke("glDeleteFencesNV");
            PFN_glGenFencesNV = func.invoke("glGenFencesNV");
            PFN_glIsFenceNV = func.invoke("glIsFenceNV");
            PFN_glTestFenceNV = func.invoke("glTestFenceNV");
            PFN_glGetFenceivNV = func.invoke("glGetFenceivNV");
            PFN_glFinishFenceNV = func.invoke("glFinishFenceNV");
            PFN_glSetFenceNV = func.invoke("glSetFenceNV");
        }
    }

    public GLNVFence(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDeleteFencesNV`.
    /// ```
    /// void glDeleteFencesNV((int) GLsizei n, const GLuint* fences);
    /// ```
    public void DeleteFencesNV(int n, @NonNull MemorySegment fences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteFencesNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteFencesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteFencesNV", n, fences); }
        Handles.MH_glDeleteFencesNV.invokeExact(handles.PFN_glDeleteFencesNV, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteFencesNV", e); }
    }

    /// Invokes `glGenFencesNV`.
    /// ```
    /// void glGenFencesNV((int) GLsizei n, GLuint* fences);
    /// ```
    public void GenFencesNV(int n, @NonNull MemorySegment fences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenFencesNV)) throw new GLSymbolNotFoundError("Symbol not found: glGenFencesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenFencesNV", n, fences); }
        Handles.MH_glGenFencesNV.invokeExact(handles.PFN_glGenFencesNV, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in GenFencesNV", e); }
    }

    /// Invokes `glIsFenceNV`.
    /// ```
    /// GLboolean glIsFenceNV((unsigned int) GLuint fence);
    /// ```
    public boolean IsFenceNV(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsFenceNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsFenceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsFenceNV", fence); }
        return (((byte) Handles.MH_glIsFenceNV.invokeExact(handles.PFN_glIsFenceNV, fence)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsFenceNV", e); }
    }

    /// Invokes `glTestFenceNV`.
    /// ```
    /// GLboolean glTestFenceNV((unsigned int) GLuint fence);
    /// ```
    public boolean TestFenceNV(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTestFenceNV)) throw new GLSymbolNotFoundError("Symbol not found: glTestFenceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTestFenceNV", fence); }
        return (((byte) Handles.MH_glTestFenceNV.invokeExact(handles.PFN_glTestFenceNV, fence)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in TestFenceNV", e); }
    }

    /// Invokes `glGetFenceivNV`.
    /// ```
    /// void glGetFenceivNV((unsigned int) GLuint fence, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFenceivNV(int fence, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFenceivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetFenceivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFenceivNV", fence, pname, params); }
        Handles.MH_glGetFenceivNV.invokeExact(handles.PFN_glGetFenceivNV, fence, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFenceivNV", e); }
    }

    /// Invokes `glFinishFenceNV`.
    /// ```
    /// void glFinishFenceNV((unsigned int) GLuint fence);
    /// ```
    public void FinishFenceNV(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishFenceNV)) throw new GLSymbolNotFoundError("Symbol not found: glFinishFenceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinishFenceNV", fence); }
        Handles.MH_glFinishFenceNV.invokeExact(handles.PFN_glFinishFenceNV, fence); }
        catch (Throwable e) { throw new RuntimeException("error in FinishFenceNV", e); }
    }

    /// Invokes `glSetFenceNV`.
    /// ```
    /// void glSetFenceNV((unsigned int) GLuint fence, (unsigned int) GLenum condition);
    /// ```
    public void SetFenceNV(int fence, int condition) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetFenceNV)) throw new GLSymbolNotFoundError("Symbol not found: glSetFenceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSetFenceNV", fence, condition); }
        Handles.MH_glSetFenceNV.invokeExact(handles.PFN_glSetFenceNV, fence, condition); }
        catch (Throwable e) { throw new RuntimeException("error in SetFenceNV", e); }
    }

}
