// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_bindless_multi_draw_indirect_count`
public final class GLNVBindlessMultiDrawIndirectCount {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysIndirectBindlessCountNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsIndirectBindlessCountNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMultiDrawArraysIndirectBindlessCountNV;
        public final MemorySegment PFN_glMultiDrawElementsIndirectBindlessCountNV;
        private Handles(GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirectBindlessCountNV = func.invoke("glMultiDrawArraysIndirectBindlessCountNV");
            PFN_glMultiDrawElementsIndirectBindlessCountNV = func.invoke("glMultiDrawElementsIndirectBindlessCountNV");
        }
    }

    public GLNVBindlessMultiDrawIndirectCount(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMultiDrawArraysIndirectBindlessCountNV`.
    /// ```
    /// void glMultiDrawArraysIndirectBindlessCountNV((unsigned int) GLenum mode, const void* indirect, (int) GLsizei drawCount, (int) GLsizei maxDrawCount, (int) GLsizei stride, (int) GLint vertexBufferCount);
    /// ```
    public void MultiDrawArraysIndirectBindlessCountNV(int mode, @NonNull MemorySegment indirect, int drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirectBindlessCountNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirectBindlessCountNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawArraysIndirectBindlessCountNV", mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount); }
        Handles.MH_glMultiDrawArraysIndirectBindlessCountNV.invokeExact(handles.PFN_glMultiDrawArraysIndirectBindlessCountNV, mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirectBindlessCountNV", e); }
    }

    /// Invokes `glMultiDrawElementsIndirectBindlessCountNV`.
    /// ```
    /// void glMultiDrawElementsIndirectBindlessCountNV((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect, (int) GLsizei drawCount, (int) GLsizei maxDrawCount, (int) GLsizei stride, (int) GLint vertexBufferCount);
    /// ```
    public void MultiDrawElementsIndirectBindlessCountNV(int mode, int type, @NonNull MemorySegment indirect, int drawCount, int maxDrawCount, int stride, int vertexBufferCount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirectBindlessCountNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirectBindlessCountNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsIndirectBindlessCountNV", mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount); }
        Handles.MH_glMultiDrawElementsIndirectBindlessCountNV.invokeExact(handles.PFN_glMultiDrawElementsIndirectBindlessCountNV, mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirectBindlessCountNV", e); }
    }

}
