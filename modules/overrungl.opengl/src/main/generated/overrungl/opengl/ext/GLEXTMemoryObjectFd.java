// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_memory_object_fd`
public final class GLEXTMemoryObjectFd {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImportMemoryFdEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glImportMemoryFdEXT;
        private Handles(GLLoadFunc func) {
            PFN_glImportMemoryFdEXT = func.invoke("glImportMemoryFdEXT");
        }
    }

    public GLEXTMemoryObjectFd(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glImportMemoryFdEXT`.
    /// ```
    /// void glImportMemoryFdEXT((unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 size, (unsigned int) GLenum handleType, (int) GLint fd);
    /// ```
    public void ImportMemoryFdEXT(int memory, long size, int handleType, int fd) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportMemoryFdEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportMemoryFdEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glImportMemoryFdEXT", memory, size, handleType, fd); }
        Handles.MH_glImportMemoryFdEXT.invokeExact(handles.PFN_glImportMemoryFdEXT, memory, size, handleType, fd); }
        catch (Throwable e) { throw new RuntimeException("error in ImportMemoryFdEXT", e); }
    }

}
