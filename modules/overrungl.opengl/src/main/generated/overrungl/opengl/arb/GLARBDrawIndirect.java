// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_draw_indirect`
public final class GLARBDrawIndirect {
    public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDrawElementsIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDrawArraysIndirect;
        public final MemorySegment PFN_glDrawElementsIndirect;
        private Handles(GLLoadFunc func) {
            PFN_glDrawArraysIndirect = func.invoke("glDrawArraysIndirect");
            PFN_glDrawElementsIndirect = func.invoke("glDrawElementsIndirect");
        }
    }

    public GLARBDrawIndirect(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawArraysIndirect`.
    /// ```
    /// void glDrawArraysIndirect((unsigned int) GLenum mode, const void* indirect);
    /// ```
    public void DrawArraysIndirect(int mode, @NonNull MemorySegment indirect) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glDrawArraysIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawArraysIndirect", mode, indirect); }
        Handles.MH_glDrawArraysIndirect.invokeExact(handles.PFN_glDrawArraysIndirect, mode, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysIndirect", e); }
    }

    /// Invokes `glDrawElementsIndirect`.
    /// ```
    /// void glDrawElementsIndirect((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect);
    /// ```
    public void DrawElementsIndirect(int mode, int type, @NonNull MemorySegment indirect) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsIndirect", mode, type, indirect); }
        Handles.MH_glDrawElementsIndirect.invokeExact(handles.PFN_glDrawElementsIndirect, mode, type, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsIndirect", e); }
    }

}
