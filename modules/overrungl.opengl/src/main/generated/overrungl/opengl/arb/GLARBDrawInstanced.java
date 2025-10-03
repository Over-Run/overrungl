// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_draw_instanced`
public final class GLARBDrawInstanced {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glDrawArraysInstancedARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDrawElementsInstancedARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glDrawArraysInstancedARB;
        public final MemorySegment PFN_glDrawElementsInstancedARB;
        private Handles(GLLoadFunc func) {
            PFN_glDrawArraysInstancedARB = func.invoke("glDrawArraysInstancedARB", "glDrawArraysInstanced");
            PFN_glDrawElementsInstancedARB = func.invoke("glDrawElementsInstancedARB", "glDrawElementsInstanced");
        }
    }

    public GLARBDrawInstanced(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawArraysInstancedARB`.
    /// ```
    /// void glDrawArraysInstancedARB((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count, (int) GLsizei primcount);
    /// ```
    public void DrawArraysInstancedARB(int mode, int first, int count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysInstancedARB)) throw new GLSymbolNotFoundError("Symbol not found: glDrawArraysInstancedARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawArraysInstancedARB", mode, first, count, primcount); }
        Handles.MH_glDrawArraysInstancedARB.get().invokeExact(handles.PFN_glDrawArraysInstancedARB, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysInstancedARB", e); }
    }

    /// Invokes `glDrawElementsInstancedARB`.
    /// ```
    /// void glDrawElementsInstancedARB((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei primcount);
    /// ```
    public void DrawElementsInstancedARB(int mode, int count, int type, @NonNull MemorySegment indices, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedARB)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedARB", mode, count, type, indices, primcount); }
        Handles.MH_glDrawElementsInstancedARB.get().invokeExact(handles.PFN_glDrawElementsInstancedARB, mode, count, type, indices, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedARB", e); }
    }

}
