// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_timer_query`
public final class GLEXTTimerQuery {
    public static final int GL_TIME_ELAPSED_EXT = 0x88BF;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGetQueryObjecti64vEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetQueryObjectui64vEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGetQueryObjecti64vEXT;
        public final MemorySegment PFN_glGetQueryObjectui64vEXT;
        private Handles(GLLoadFunc func) {
            PFN_glGetQueryObjecti64vEXT = func.invoke("glGetQueryObjecti64vEXT", "glGetQueryObjecti64v");
            PFN_glGetQueryObjectui64vEXT = func.invoke("glGetQueryObjectui64vEXT", "glGetQueryObjectui64v");
        }
    }

    public GLEXTTimerQuery(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetQueryObjecti64vEXT`.
    /// ```
    /// void glGetQueryObjecti64vEXT((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint64* params);
    /// ```
    public void GetQueryObjecti64vEXT(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjecti64vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjecti64vEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjecti64vEXT", id, pname, params); }
        Handles.MH_glGetQueryObjecti64vEXT.get().invokeExact(handles.PFN_glGetQueryObjecti64vEXT, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjecti64vEXT", e); }
    }

    /// Invokes `glGetQueryObjectui64vEXT`.
    /// ```
    /// void glGetQueryObjectui64vEXT((unsigned int) GLuint id, (unsigned int) GLenum pname, GLuint64* params);
    /// ```
    public void GetQueryObjectui64vEXT(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectui64vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjectui64vEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjectui64vEXT", id, pname, params); }
        Handles.MH_glGetQueryObjectui64vEXT.get().invokeExact(handles.PFN_glGetQueryObjectui64vEXT, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectui64vEXT", e); }
    }

}
