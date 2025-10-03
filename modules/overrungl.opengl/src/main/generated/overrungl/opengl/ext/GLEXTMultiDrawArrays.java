// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_multi_draw_arrays`
public final class GLEXTMultiDrawArrays {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glMultiDrawArraysEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glMultiDrawElementsEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glMultiDrawArraysEXT;
        public final MemorySegment PFN_glMultiDrawElementsEXT;
        private Handles(GLLoadFunc func) {
            PFN_glMultiDrawArraysEXT = func.invoke("glMultiDrawArraysEXT", "glMultiDrawArrays");
            PFN_glMultiDrawElementsEXT = func.invoke("glMultiDrawElementsEXT", "glMultiDrawElements");
        }
    }

    public GLEXTMultiDrawArrays(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMultiDrawArraysEXT`.
    /// ```
    /// void glMultiDrawArraysEXT((unsigned int) GLenum mode, const GLint* first, const GLsizei* count, (int) GLsizei primcount);
    /// ```
    public void MultiDrawArraysEXT(int mode, @NonNull MemorySegment first, @NonNull MemorySegment count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawArraysEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawArraysEXT", mode, first, count, primcount); }
        Handles.MH_glMultiDrawArraysEXT.get().invokeExact(handles.PFN_glMultiDrawArraysEXT, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysEXT", e); }
    }

    /// Invokes `glMultiDrawElementsEXT`.
    /// ```
    /// void glMultiDrawElementsEXT((unsigned int) GLenum mode, const GLsizei* count, (unsigned int) GLenum type, const void* const * indices, (int) GLsizei primcount);
    /// ```
    public void MultiDrawElementsEXT(int mode, @NonNull MemorySegment count, int type, @NonNull MemorySegment indices, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsEXT", mode, count, type, indices, primcount); }
        Handles.MH_glMultiDrawElementsEXT.get().invokeExact(handles.PFN_glMultiDrawElementsEXT, mode, count, type, indices, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsEXT", e); }
    }

}
