// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_semaphore_fd`
public final class GLEXTSemaphoreFd {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImportSemaphoreFdEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glImportSemaphoreFdEXT;
        private Handles(GLLoadFunc func) {
            PFN_glImportSemaphoreFdEXT = func.invoke("glImportSemaphoreFdEXT");
        }
    }

    public GLEXTSemaphoreFd(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glImportSemaphoreFdEXT`.
    /// ```
    /// void glImportSemaphoreFdEXT((unsigned int) GLuint semaphore, (unsigned int) GLenum handleType, (int) GLint fd);
    /// ```
    public void ImportSemaphoreFdEXT(int semaphore, int handleType, int fd) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportSemaphoreFdEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportSemaphoreFdEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glImportSemaphoreFdEXT", semaphore, handleType, fd); }
        Handles.MH_glImportSemaphoreFdEXT.invokeExact(handles.PFN_glImportSemaphoreFdEXT, semaphore, handleType, fd); }
        catch (Throwable e) { throw new RuntimeException("error in ImportSemaphoreFdEXT", e); }
    }

}
