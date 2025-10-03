// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_semaphore_win32`
public final class GLEXTSemaphoreWin32 {
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 0x9587;
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 0x9588;
    public static final int GL_DEVICE_LUID_EXT = 0x9599;
    public static final int GL_DEVICE_NODE_MASK_EXT = 0x959A;
    public static final int GL_LUID_SIZE_EXT = 8;
    public static final int GL_HANDLE_TYPE_D3D12_FENCE_EXT = 0x9594;
    public static final int GL_D3D12_FENCE_VALUE_EXT = 0x9595;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImportSemaphoreWin32HandleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glImportSemaphoreWin32NameEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glImportSemaphoreWin32HandleEXT;
        public final MemorySegment PFN_glImportSemaphoreWin32NameEXT;
        private Handles(GLLoadFunc func) {
            PFN_glImportSemaphoreWin32HandleEXT = func.invoke("glImportSemaphoreWin32HandleEXT");
            PFN_glImportSemaphoreWin32NameEXT = func.invoke("glImportSemaphoreWin32NameEXT");
        }
    }

    public GLEXTSemaphoreWin32(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glImportSemaphoreWin32HandleEXT`.
    /// ```
    /// void glImportSemaphoreWin32HandleEXT((unsigned int) GLuint semaphore, (unsigned int) GLenum handleType, void* handle);
    /// ```
    public void ImportSemaphoreWin32HandleEXT(int semaphore, int handleType, @NonNull MemorySegment handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportSemaphoreWin32HandleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportSemaphoreWin32HandleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glImportSemaphoreWin32HandleEXT", semaphore, handleType, handle); }
        Handles.MH_glImportSemaphoreWin32HandleEXT.invokeExact(handles.PFN_glImportSemaphoreWin32HandleEXT, semaphore, handleType, handle); }
        catch (Throwable e) { throw new RuntimeException("error in ImportSemaphoreWin32HandleEXT", e); }
    }

    /// Invokes `glImportSemaphoreWin32NameEXT`.
    /// ```
    /// void glImportSemaphoreWin32NameEXT((unsigned int) GLuint semaphore, (unsigned int) GLenum handleType, const void* name);
    /// ```
    public void ImportSemaphoreWin32NameEXT(int semaphore, int handleType, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportSemaphoreWin32NameEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportSemaphoreWin32NameEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glImportSemaphoreWin32NameEXT", semaphore, handleType, name); }
        Handles.MH_glImportSemaphoreWin32NameEXT.invokeExact(handles.PFN_glImportSemaphoreWin32NameEXT, semaphore, handleType, name); }
        catch (Throwable e) { throw new RuntimeException("error in ImportSemaphoreWin32NameEXT", e); }
    }

}
