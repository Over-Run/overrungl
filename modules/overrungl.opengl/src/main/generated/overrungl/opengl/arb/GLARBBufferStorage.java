// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_buffer_storage`
public final class GLARBBufferStorage {
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_PERSISTENT_BIT = 0x0040;
    public static final int GL_MAP_COHERENT_BIT = 0x0080;
    public static final int GL_DYNAMIC_STORAGE_BIT = 0x0100;
    public static final int GL_CLIENT_STORAGE_BIT = 0x0200;
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x00004000;
    public static final int GL_BUFFER_IMMUTABLE_STORAGE = 0x821F;
    public static final int GL_BUFFER_STORAGE_FLAGS = 0x8220;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBufferStorage = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBufferStorage;
        private Handles(GLLoadFunc func) {
            PFN_glBufferStorage = func.invoke("glBufferStorage");
        }
    }

    public GLARBBufferStorage(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBufferStorage`.
    /// ```
    /// void glBufferStorage((unsigned int) GLenum target, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data, (unsigned int) GLbitfield flags);
    /// ```
    public void BufferStorage(int target, long size, @NonNull MemorySegment data, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferStorage)) throw new GLSymbolNotFoundError("Symbol not found: glBufferStorage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferStorage", target, size, data, flags); }
        Handles.MH_glBufferStorage.get().invokeExact(handles.PFN_glBufferStorage, target, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in BufferStorage", e); }
    }

}
