// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_async`
public final class GLSGIXAsync {
    public static final int GL_ASYNC_MARKER_SGIX = 0x8329;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glAsyncMarkerSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glFinishAsyncSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glPollAsyncSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGenAsyncMarkersSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDeleteAsyncMarkersSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glIsAsyncMarkerSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glAsyncMarkerSGIX;
        public final MemorySegment PFN_glFinishAsyncSGIX;
        public final MemorySegment PFN_glPollAsyncSGIX;
        public final MemorySegment PFN_glGenAsyncMarkersSGIX;
        public final MemorySegment PFN_glDeleteAsyncMarkersSGIX;
        public final MemorySegment PFN_glIsAsyncMarkerSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glAsyncMarkerSGIX = func.invoke("glAsyncMarkerSGIX");
            PFN_glFinishAsyncSGIX = func.invoke("glFinishAsyncSGIX");
            PFN_glPollAsyncSGIX = func.invoke("glPollAsyncSGIX");
            PFN_glGenAsyncMarkersSGIX = func.invoke("glGenAsyncMarkersSGIX");
            PFN_glDeleteAsyncMarkersSGIX = func.invoke("glDeleteAsyncMarkersSGIX");
            PFN_glIsAsyncMarkerSGIX = func.invoke("glIsAsyncMarkerSGIX");
        }
    }

    public GLSGIXAsync(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glAsyncMarkerSGIX`.
    /// ```
    /// void glAsyncMarkerSGIX((unsigned int) GLuint marker);
    /// ```
    public void AsyncMarkerSGIX(int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAsyncMarkerSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glAsyncMarkerSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAsyncMarkerSGIX", marker); }
        Handles.MH_glAsyncMarkerSGIX.get().invokeExact(handles.PFN_glAsyncMarkerSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in AsyncMarkerSGIX", e); }
    }

    /// Invokes `glFinishAsyncSGIX`.
    /// ```
    /// (int) GLint glFinishAsyncSGIX(GLuint* markerp);
    /// ```
    public int FinishAsyncSGIX(@NonNull MemorySegment markerp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishAsyncSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glFinishAsyncSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinishAsyncSGIX", markerp); }
        return (int) Handles.MH_glFinishAsyncSGIX.get().invokeExact(handles.PFN_glFinishAsyncSGIX, markerp); }
        catch (Throwable e) { throw new RuntimeException("error in FinishAsyncSGIX", e); }
    }

    /// Invokes `glPollAsyncSGIX`.
    /// ```
    /// (int) GLint glPollAsyncSGIX(GLuint* markerp);
    /// ```
    public int PollAsyncSGIX(@NonNull MemorySegment markerp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPollAsyncSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glPollAsyncSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPollAsyncSGIX", markerp); }
        return (int) Handles.MH_glPollAsyncSGIX.get().invokeExact(handles.PFN_glPollAsyncSGIX, markerp); }
        catch (Throwable e) { throw new RuntimeException("error in PollAsyncSGIX", e); }
    }

    /// Invokes `glGenAsyncMarkersSGIX`.
    /// ```
    /// (unsigned int) GLuint glGenAsyncMarkersSGIX((int) GLsizei range);
    /// ```
    public int GenAsyncMarkersSGIX(int range) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenAsyncMarkersSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glGenAsyncMarkersSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenAsyncMarkersSGIX", range); }
        return (int) Handles.MH_glGenAsyncMarkersSGIX.get().invokeExact(handles.PFN_glGenAsyncMarkersSGIX, range); }
        catch (Throwable e) { throw new RuntimeException("error in GenAsyncMarkersSGIX", e); }
    }

    /// Invokes `glDeleteAsyncMarkersSGIX`.
    /// ```
    /// void glDeleteAsyncMarkersSGIX((unsigned int) GLuint marker, (int) GLsizei range);
    /// ```
    public void DeleteAsyncMarkersSGIX(int marker, int range) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteAsyncMarkersSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteAsyncMarkersSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteAsyncMarkersSGIX", marker, range); }
        Handles.MH_glDeleteAsyncMarkersSGIX.get().invokeExact(handles.PFN_glDeleteAsyncMarkersSGIX, marker, range); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteAsyncMarkersSGIX", e); }
    }

    /// Invokes `glIsAsyncMarkerSGIX`.
    /// ```
    /// GLboolean glIsAsyncMarkerSGIX((unsigned int) GLuint marker);
    /// ```
    public boolean IsAsyncMarkerSGIX(int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsAsyncMarkerSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glIsAsyncMarkerSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsAsyncMarkerSGIX", marker); }
        return (((byte) Handles.MH_glIsAsyncMarkerSGIX.get().invokeExact(handles.PFN_glIsAsyncMarkerSGIX, marker)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsAsyncMarkerSGIX", e); }
    }

}
