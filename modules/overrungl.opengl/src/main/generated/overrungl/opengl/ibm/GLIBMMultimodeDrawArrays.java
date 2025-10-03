// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ibm;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_IBM_multimode_draw_arrays`
public final class GLIBMMultimodeDrawArrays {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiModeDrawArraysIBM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiModeDrawElementsIBM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMultiModeDrawArraysIBM;
        public final MemorySegment PFN_glMultiModeDrawElementsIBM;
        private Handles(GLLoadFunc func) {
            PFN_glMultiModeDrawArraysIBM = func.invoke("glMultiModeDrawArraysIBM");
            PFN_glMultiModeDrawElementsIBM = func.invoke("glMultiModeDrawElementsIBM");
        }
    }

    public GLIBMMultimodeDrawArrays(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMultiModeDrawArraysIBM`.
    /// ```
    /// void glMultiModeDrawArraysIBM(const GLenum* mode, const GLint* first, const GLsizei* count, (int) GLsizei primcount, (int) GLint modestride);
    /// ```
    public void MultiModeDrawArraysIBM(@NonNull MemorySegment mode, @NonNull MemorySegment first, @NonNull MemorySegment count, int primcount, int modestride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiModeDrawArraysIBM)) throw new GLSymbolNotFoundError("Symbol not found: glMultiModeDrawArraysIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiModeDrawArraysIBM", mode, first, count, primcount, modestride); }
        Handles.MH_glMultiModeDrawArraysIBM.invokeExact(handles.PFN_glMultiModeDrawArraysIBM, mode, first, count, primcount, modestride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiModeDrawArraysIBM", e); }
    }

    /// Invokes `glMultiModeDrawElementsIBM`.
    /// ```
    /// void glMultiModeDrawElementsIBM(const GLenum* mode, const GLsizei* count, (unsigned int) GLenum type, const void* const * indices, (int) GLsizei primcount, (int) GLint modestride);
    /// ```
    public void MultiModeDrawElementsIBM(@NonNull MemorySegment mode, @NonNull MemorySegment count, int type, @NonNull MemorySegment indices, int primcount, int modestride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiModeDrawElementsIBM)) throw new GLSymbolNotFoundError("Symbol not found: glMultiModeDrawElementsIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiModeDrawElementsIBM", mode, count, type, indices, primcount, modestride); }
        Handles.MH_glMultiModeDrawElementsIBM.invokeExact(handles.PFN_glMultiModeDrawElementsIBM, mode, count, type, indices, primcount, modestride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiModeDrawElementsIBM", e); }
    }

}
