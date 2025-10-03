// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_indirect_parameters`
public final class GLARBIndirectParameters {
    public static final int GL_PARAMETER_BUFFER_ARB = 0x80EE;
    public static final int GL_PARAMETER_BUFFER_BINDING_ARB = 0x80EF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysIndirectCountARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsIndirectCountARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMultiDrawArraysIndirectCountARB;
        public final MemorySegment PFN_glMultiDrawElementsIndirectCountARB;
        private Handles(GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirectCountARB = func.invoke("glMultiDrawArraysIndirectCountARB", "glMultiDrawArraysIndirectCount");
            PFN_glMultiDrawElementsIndirectCountARB = func.invoke("glMultiDrawElementsIndirectCountARB", "glMultiDrawElementsIndirectCount");
        }
    }

    public GLARBIndirectParameters(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMultiDrawArraysIndirectCountARB`.
    /// ```
    /// void glMultiDrawArraysIndirectCountARB((unsigned int) GLenum mode, const void* indirect, ((signed long long) khronos_intptr_t) GLintptr drawcount, (int) GLsizei maxdrawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawArraysIndirectCountARB(int mode, @NonNull MemorySegment indirect, long drawcount, int maxdrawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirectCountARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirectCountARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawArraysIndirectCountARB", mode, indirect, drawcount, maxdrawcount, stride); }
        Handles.MH_glMultiDrawArraysIndirectCountARB.invokeExact(handles.PFN_glMultiDrawArraysIndirectCountARB, mode, indirect, drawcount, maxdrawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirectCountARB", e); }
    }

    /// Invokes `glMultiDrawElementsIndirectCountARB`.
    /// ```
    /// void glMultiDrawElementsIndirectCountARB((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect, ((signed long long) khronos_intptr_t) GLintptr drawcount, (int) GLsizei maxdrawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawElementsIndirectCountARB(int mode, int type, @NonNull MemorySegment indirect, long drawcount, int maxdrawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirectCountARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirectCountARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsIndirectCountARB", mode, type, indirect, drawcount, maxdrawcount, stride); }
        Handles.MH_glMultiDrawElementsIndirectCountARB.invokeExact(handles.PFN_glMultiDrawElementsIndirectCountARB, mode, type, indirect, drawcount, maxdrawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirectCountARB", e); }
    }

}
