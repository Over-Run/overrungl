// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.apple;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_APPLE_fence`
public final class GLAPPLEFence {
    public static final int GL_DRAW_PIXELS_APPLE = 0x8A0A;
    public static final int GL_FENCE_APPLE = 0x8A0B;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGenFencesAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeleteFencesAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSetFenceAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glIsFenceAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTestFenceAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glFinishFenceAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTestObjectAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glFinishObjectAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glGenFencesAPPLE;
        public final MemorySegment PFN_glDeleteFencesAPPLE;
        public final MemorySegment PFN_glSetFenceAPPLE;
        public final MemorySegment PFN_glIsFenceAPPLE;
        public final MemorySegment PFN_glTestFenceAPPLE;
        public final MemorySegment PFN_glFinishFenceAPPLE;
        public final MemorySegment PFN_glTestObjectAPPLE;
        public final MemorySegment PFN_glFinishObjectAPPLE;
        private Handles(GLLoadFunc func) {
            PFN_glGenFencesAPPLE = func.invoke("glGenFencesAPPLE");
            PFN_glDeleteFencesAPPLE = func.invoke("glDeleteFencesAPPLE");
            PFN_glSetFenceAPPLE = func.invoke("glSetFenceAPPLE");
            PFN_glIsFenceAPPLE = func.invoke("glIsFenceAPPLE");
            PFN_glTestFenceAPPLE = func.invoke("glTestFenceAPPLE");
            PFN_glFinishFenceAPPLE = func.invoke("glFinishFenceAPPLE");
            PFN_glTestObjectAPPLE = func.invoke("glTestObjectAPPLE");
            PFN_glFinishObjectAPPLE = func.invoke("glFinishObjectAPPLE");
        }
    }

    public GLAPPLEFence(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGenFencesAPPLE`.
    /// ```
    /// void glGenFencesAPPLE((int) GLsizei n, GLuint* fences);
    /// ```
    public void GenFencesAPPLE(int n, @NonNull MemorySegment fences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenFencesAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glGenFencesAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenFencesAPPLE", n, fences); }
        Handles.MH_glGenFencesAPPLE.get().invokeExact(handles.PFN_glGenFencesAPPLE, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in GenFencesAPPLE", e); }
    }

    /// Invokes `glDeleteFencesAPPLE`.
    /// ```
    /// void glDeleteFencesAPPLE((int) GLsizei n, const GLuint* fences);
    /// ```
    public void DeleteFencesAPPLE(int n, @NonNull MemorySegment fences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteFencesAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteFencesAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteFencesAPPLE", n, fences); }
        Handles.MH_glDeleteFencesAPPLE.get().invokeExact(handles.PFN_glDeleteFencesAPPLE, n, fences); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteFencesAPPLE", e); }
    }

    /// Invokes `glSetFenceAPPLE`.
    /// ```
    /// void glSetFenceAPPLE((unsigned int) GLuint fence);
    /// ```
    public void SetFenceAPPLE(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetFenceAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glSetFenceAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSetFenceAPPLE", fence); }
        Handles.MH_glSetFenceAPPLE.get().invokeExact(handles.PFN_glSetFenceAPPLE, fence); }
        catch (Throwable e) { throw new RuntimeException("error in SetFenceAPPLE", e); }
    }

    /// Invokes `glIsFenceAPPLE`.
    /// ```
    /// GLboolean glIsFenceAPPLE((unsigned int) GLuint fence);
    /// ```
    public boolean IsFenceAPPLE(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsFenceAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glIsFenceAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsFenceAPPLE", fence); }
        return (((byte) Handles.MH_glIsFenceAPPLE.get().invokeExact(handles.PFN_glIsFenceAPPLE, fence)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsFenceAPPLE", e); }
    }

    /// Invokes `glTestFenceAPPLE`.
    /// ```
    /// GLboolean glTestFenceAPPLE((unsigned int) GLuint fence);
    /// ```
    public boolean TestFenceAPPLE(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTestFenceAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glTestFenceAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTestFenceAPPLE", fence); }
        return (((byte) Handles.MH_glTestFenceAPPLE.get().invokeExact(handles.PFN_glTestFenceAPPLE, fence)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in TestFenceAPPLE", e); }
    }

    /// Invokes `glFinishFenceAPPLE`.
    /// ```
    /// void glFinishFenceAPPLE((unsigned int) GLuint fence);
    /// ```
    public void FinishFenceAPPLE(int fence) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishFenceAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glFinishFenceAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinishFenceAPPLE", fence); }
        Handles.MH_glFinishFenceAPPLE.get().invokeExact(handles.PFN_glFinishFenceAPPLE, fence); }
        catch (Throwable e) { throw new RuntimeException("error in FinishFenceAPPLE", e); }
    }

    /// Invokes `glTestObjectAPPLE`.
    /// ```
    /// GLboolean glTestObjectAPPLE((unsigned int) GLenum object, (unsigned int) GLuint name);
    /// ```
    public boolean TestObjectAPPLE(int object, int name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTestObjectAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glTestObjectAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTestObjectAPPLE", object, name); }
        return (((byte) Handles.MH_glTestObjectAPPLE.get().invokeExact(handles.PFN_glTestObjectAPPLE, object, name)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in TestObjectAPPLE", e); }
    }

    /// Invokes `glFinishObjectAPPLE`.
    /// ```
    /// void glFinishObjectAPPLE((unsigned int) GLenum object, (int) GLint name);
    /// ```
    public void FinishObjectAPPLE(int object, int name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishObjectAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glFinishObjectAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinishObjectAPPLE", object, name); }
        Handles.MH_glFinishObjectAPPLE.get().invokeExact(handles.PFN_glFinishObjectAPPLE, object, name); }
        catch (Throwable e) { throw new RuntimeException("error in FinishObjectAPPLE", e); }
    }

}
