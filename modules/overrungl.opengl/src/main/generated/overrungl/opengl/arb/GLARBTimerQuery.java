// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_timer_query`
public final class GLARBTimerQuery {
    public static final int GL_TIME_ELAPSED = 0x88BF;
    public static final int GL_TIMESTAMP = 0x8E28;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glQueryCounter = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetQueryObjecti64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryObjectui64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glQueryCounter;
        public final MemorySegment PFN_glGetQueryObjecti64v;
        public final MemorySegment PFN_glGetQueryObjectui64v;
        private Handles(GLLoadFunc func) {
            PFN_glQueryCounter = func.invoke("glQueryCounter");
            PFN_glGetQueryObjecti64v = func.invoke("glGetQueryObjecti64v");
            PFN_glGetQueryObjectui64v = func.invoke("glGetQueryObjectui64v");
        }
    }

    public GLARBTimerQuery(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glQueryCounter`.
    /// ```
    /// void glQueryCounter((unsigned int) GLuint id, (unsigned int) GLenum target);
    /// ```
    public void QueryCounter(int id, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryCounter)) throw new GLSymbolNotFoundError("Symbol not found: glQueryCounter");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glQueryCounter", id, target); }
        Handles.MH_glQueryCounter.invokeExact(handles.PFN_glQueryCounter, id, target); }
        catch (Throwable e) { throw new RuntimeException("error in QueryCounter", e); }
    }

    /// Invokes `glGetQueryObjecti64v`.
    /// ```
    /// void glGetQueryObjecti64v((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint64* params);
    /// ```
    public void GetQueryObjecti64v(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjecti64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjecti64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjecti64v", id, pname, params); }
        Handles.MH_glGetQueryObjecti64v.invokeExact(handles.PFN_glGetQueryObjecti64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjecti64v", e); }
    }

    /// Invokes `glGetQueryObjectui64v`.
    /// ```
    /// void glGetQueryObjectui64v((unsigned int) GLuint id, (unsigned int) GLenum pname, GLuint64* params);
    /// ```
    public void GetQueryObjectui64v(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryObjectui64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryObjectui64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryObjectui64v", id, pname, params); }
        Handles.MH_glGetQueryObjectui64v.invokeExact(handles.PFN_glGetQueryObjectui64v, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryObjectui64v", e); }
    }

}
