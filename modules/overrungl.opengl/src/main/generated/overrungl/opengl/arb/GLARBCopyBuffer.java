// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_copy_buffer`
public final class GLARBCopyBuffer {
    public static final int GL_COPY_READ_BUFFER = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER = 0x8F37;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glCopyBufferSubData = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public final MemorySegment PFN_glCopyBufferSubData;
        private Handles(GLLoadFunc func) {
            PFN_glCopyBufferSubData = func.invoke("glCopyBufferSubData");
        }
    }

    public GLARBCopyBuffer(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCopyBufferSubData`.
    /// ```
    /// void glCopyBufferSubData((unsigned int) GLenum readTarget, (unsigned int) GLenum writeTarget, ((signed long long) khronos_intptr_t) GLintptr readOffset, ((signed long long) khronos_intptr_t) GLintptr writeOffset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void CopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glCopyBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyBufferSubData", readTarget, writeTarget, readOffset, writeOffset, size); }
        Handles.MH_glCopyBufferSubData.get().invokeExact(handles.PFN_glCopyBufferSubData, readTarget, writeTarget, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in CopyBufferSubData", e); }
    }

}
