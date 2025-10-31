// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_map_buffer_range`
public final class GLARBMapBufferRange {
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMapBufferRange = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFlushMappedBufferRange = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glMapBufferRange;
        public final MemorySegment PFN_glFlushMappedBufferRange;
        private Handles(GLLoadFunc func) {
            PFN_glMapBufferRange = func.invoke("glMapBufferRange", "glMapBufferRangeEXT");
            PFN_glFlushMappedBufferRange = func.invoke("glFlushMappedBufferRange", "glFlushMappedBufferRangeAPPLE", "glFlushMappedBufferRangeEXT");
        }
    }

    public GLARBMapBufferRange(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMapBufferRange`.
    /// ```
    /// void* glMapBufferRange((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length, (unsigned int) GLbitfield access);
    /// ```
    public @NonNull MemorySegment MapBufferRange(int target, long offset, long length, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glMapBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapBufferRange", target, offset, length, access); }
        return (MemorySegment) Handles.MH_glMapBufferRange.invokeExact(handles.PFN_glMapBufferRange, target, offset, length, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapBufferRange", e); }
    }

    /// Invokes `glFlushMappedBufferRange`.
    /// ```
    /// void glFlushMappedBufferRange((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length);
    /// ```
    public void FlushMappedBufferRange(int target, long offset, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushMappedBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glFlushMappedBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFlushMappedBufferRange", target, offset, length); }
        Handles.MH_glFlushMappedBufferRange.invokeExact(handles.PFN_glFlushMappedBufferRange, target, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in FlushMappedBufferRange", e); }
    }

}
