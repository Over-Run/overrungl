// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_multi_draw_indirect`
public final class GLAMDMultiDrawIndirect {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glMultiDrawArraysIndirectAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glMultiDrawElementsIndirectAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glMultiDrawArraysIndirectAMD;
        public final MemorySegment PFN_glMultiDrawElementsIndirectAMD;
        private Handles(GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirectAMD = func.invoke("glMultiDrawArraysIndirectAMD", "glMultiDrawArraysIndirect");
            PFN_glMultiDrawElementsIndirectAMD = func.invoke("glMultiDrawElementsIndirectAMD", "glMultiDrawElementsIndirect");
        }
    }

    public GLAMDMultiDrawIndirect(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMultiDrawArraysIndirectAMD`.
    /// ```
    /// void glMultiDrawArraysIndirectAMD((unsigned int) GLenum mode, const void* indirect, (int) GLsizei primcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawArraysIndirectAMD(int mode, @NonNull MemorySegment indirect, int primcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirectAMD)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirectAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawArraysIndirectAMD", mode, indirect, primcount, stride); }
        Handles.MH_glMultiDrawArraysIndirectAMD.get().invokeExact(handles.PFN_glMultiDrawArraysIndirectAMD, mode, indirect, primcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirectAMD", e); }
    }

    /// Invokes `glMultiDrawElementsIndirectAMD`.
    /// ```
    /// void glMultiDrawElementsIndirectAMD((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect, (int) GLsizei primcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawElementsIndirectAMD(int mode, int type, @NonNull MemorySegment indirect, int primcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirectAMD)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirectAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsIndirectAMD", mode, type, indirect, primcount, stride); }
        Handles.MH_glMultiDrawElementsIndirectAMD.get().invokeExact(handles.PFN_glMultiDrawElementsIndirectAMD, mode, type, indirect, primcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirectAMD", e); }
    }

}
