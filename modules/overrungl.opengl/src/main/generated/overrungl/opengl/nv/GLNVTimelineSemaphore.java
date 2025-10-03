// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_timeline_semaphore`
public final class GLNVTimelineSemaphore {
    public static final int GL_TIMELINE_SEMAPHORE_VALUE_NV = 0x9595;
    public static final int GL_SEMAPHORE_TYPE_NV = 0x95B3;
    public static final int GL_SEMAPHORE_TYPE_BINARY_NV = 0x95B4;
    public static final int GL_SEMAPHORE_TYPE_TIMELINE_NV = 0x95B5;
    public static final int GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV = 0x95B6;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glCreateSemaphoresNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSemaphoreParameterivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetSemaphoreParameterivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glCreateSemaphoresNV;
        public final MemorySegment PFN_glSemaphoreParameterivNV;
        public final MemorySegment PFN_glGetSemaphoreParameterivNV;
        private Handles(GLLoadFunc func) {
            PFN_glCreateSemaphoresNV = func.invoke("glCreateSemaphoresNV");
            PFN_glSemaphoreParameterivNV = func.invoke("glSemaphoreParameterivNV");
            PFN_glGetSemaphoreParameterivNV = func.invoke("glGetSemaphoreParameterivNV");
        }
    }

    public GLNVTimelineSemaphore(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCreateSemaphoresNV`.
    /// ```
    /// void glCreateSemaphoresNV((int) GLsizei n, GLuint* semaphores);
    /// ```
    public void CreateSemaphoresNV(int n, @NonNull MemorySegment semaphores) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateSemaphoresNV)) throw new GLSymbolNotFoundError("Symbol not found: glCreateSemaphoresNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateSemaphoresNV", n, semaphores); }
        Handles.MH_glCreateSemaphoresNV.get().invokeExact(handles.PFN_glCreateSemaphoresNV, n, semaphores); }
        catch (Throwable e) { throw new RuntimeException("error in CreateSemaphoresNV", e); }
    }

    /// Invokes `glSemaphoreParameterivNV`.
    /// ```
    /// void glSemaphoreParameterivNV((unsigned int) GLuint semaphore, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void SemaphoreParameterivNV(int semaphore, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSemaphoreParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glSemaphoreParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSemaphoreParameterivNV", semaphore, pname, params); }
        Handles.MH_glSemaphoreParameterivNV.get().invokeExact(handles.PFN_glSemaphoreParameterivNV, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in SemaphoreParameterivNV", e); }
    }

    /// Invokes `glGetSemaphoreParameterivNV`.
    /// ```
    /// void glGetSemaphoreParameterivNV((unsigned int) GLuint semaphore, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetSemaphoreParameterivNV(int semaphore, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSemaphoreParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetSemaphoreParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSemaphoreParameterivNV", semaphore, pname, params); }
        Handles.MH_glGetSemaphoreParameterivNV.get().invokeExact(handles.PFN_glGetSemaphoreParameterivNV, semaphore, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetSemaphoreParameterivNV", e); }
    }

}
