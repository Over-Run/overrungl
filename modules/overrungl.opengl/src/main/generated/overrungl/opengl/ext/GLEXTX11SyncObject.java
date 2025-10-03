// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_x11_sync_object`
public final class GLEXTX11SyncObject {
    public static final int GL_SYNC_X11_FENCE_EXT = 0x90E1;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImportSyncEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glImportSyncEXT;
        private Handles(GLLoadFunc func) {
            PFN_glImportSyncEXT = func.invoke("glImportSyncEXT");
        }
    }

    public GLEXTX11SyncObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glImportSyncEXT`.
    /// ```
    /// (struct __GLsync *) GLsync glImportSyncEXT((unsigned int) GLenum external_sync_type, ((signed long long) khronos_intptr_t) GLintptr external_sync, (unsigned int) GLbitfield flags);
    /// ```
    public @NonNull MemorySegment ImportSyncEXT(int external_sync_type, long external_sync, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportSyncEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportSyncEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glImportSyncEXT", external_sync_type, external_sync, flags); }
        return (MemorySegment) Handles.MH_glImportSyncEXT.invokeExact(handles.PFN_glImportSyncEXT, external_sync_type, external_sync, flags); }
        catch (Throwable e) { throw new RuntimeException("error in ImportSyncEXT", e); }
    }

}
