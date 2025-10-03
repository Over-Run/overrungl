// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_clear_buffer_object`
public final class GLARBClearBufferObject {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glClearBufferData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearBufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glClearBufferData;
        public final MemorySegment PFN_glClearBufferSubData;
        private Handles(GLLoadFunc func) {
            PFN_glClearBufferData = func.invoke("glClearBufferData");
            PFN_glClearBufferSubData = func.invoke("glClearBufferSubData");
        }
    }

    public GLARBClearBufferObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glClearBufferData`.
    /// ```
    /// void glClearBufferData((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearBufferData(int target, int internalformat, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferData)) throw new GLSymbolNotFoundError("Symbol not found: glClearBufferData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearBufferData", target, internalformat, format, type, data); }
        Handles.MH_glClearBufferData.invokeExact(handles.PFN_glClearBufferData, target, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferData", e); }
    }

    /// Invokes `glClearBufferSubData`.
    /// ```
    /// void glClearBufferSubData((unsigned int) GLenum target, (unsigned int) GLenum internalformat, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glClearBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearBufferSubData", target, internalformat, offset, size, format, type, data); }
        Handles.MH_glClearBufferSubData.invokeExact(handles.PFN_glClearBufferSubData, target, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferSubData", e); }
    }

}
