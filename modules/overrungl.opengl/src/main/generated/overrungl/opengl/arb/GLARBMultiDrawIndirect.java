// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_multi_draw_indirect`
public final class GLARBMultiDrawIndirect {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMultiDrawArraysIndirect;
        public final MemorySegment PFN_glMultiDrawElementsIndirect;
        private Handles(GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirect = func.invoke("glMultiDrawArraysIndirect", "glMultiDrawArraysIndirectAMD", "glMultiDrawArraysIndirectEXT");
            PFN_glMultiDrawElementsIndirect = func.invoke("glMultiDrawElementsIndirect", "glMultiDrawElementsIndirectAMD", "glMultiDrawElementsIndirectEXT");
        }
    }

    public GLARBMultiDrawIndirect(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMultiDrawArraysIndirect`.
    /// ```
    /// void glMultiDrawArraysIndirect((unsigned int) GLenum mode, const void* indirect, (int) GLsizei drawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawArraysIndirect(int mode, @NonNull MemorySegment indirect, int drawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawArraysIndirect", mode, indirect, drawcount, stride); }
        Handles.MH_glMultiDrawArraysIndirect.invokeExact(handles.PFN_glMultiDrawArraysIndirect, mode, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirect", e); }
    }

    /// Invokes `glMultiDrawElementsIndirect`.
    /// ```
    /// void glMultiDrawElementsIndirect((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect, (int) GLsizei drawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawElementsIndirect(int mode, int type, @NonNull MemorySegment indirect, int drawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsIndirect", mode, type, indirect, drawcount, stride); }
        Handles.MH_glMultiDrawElementsIndirect.invokeExact(handles.PFN_glMultiDrawElementsIndirect, mode, type, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirect", e); }
    }

}
