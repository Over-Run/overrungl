// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_base_instance`
public final class GLARBBaseInstance {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glDrawArraysInstancedBaseInstance = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDrawElementsInstancedBaseInstance = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDrawElementsInstancedBaseVertexBaseInstance = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glDrawArraysInstancedBaseInstance;
        public final MemorySegment PFN_glDrawElementsInstancedBaseInstance;
        public final MemorySegment PFN_glDrawElementsInstancedBaseVertexBaseInstance;
        private Handles(GLLoadFunc func) {
            PFN_glDrawArraysInstancedBaseInstance = func.invoke("glDrawArraysInstancedBaseInstance");
            PFN_glDrawElementsInstancedBaseInstance = func.invoke("glDrawElementsInstancedBaseInstance");
            PFN_glDrawElementsInstancedBaseVertexBaseInstance = func.invoke("glDrawElementsInstancedBaseVertexBaseInstance");
        }
    }

    public GLARBBaseInstance(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawArraysInstancedBaseInstance`.
    /// ```
    /// void glDrawArraysInstancedBaseInstance((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count, (int) GLsizei instancecount, (unsigned int) GLuint baseinstance);
    /// ```
    public void DrawArraysInstancedBaseInstance(int mode, int first, int count, int instancecount, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysInstancedBaseInstance)) throw new GLSymbolNotFoundError("Symbol not found: glDrawArraysInstancedBaseInstance");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawArraysInstancedBaseInstance", mode, first, count, instancecount, baseinstance); }
        Handles.MH_glDrawArraysInstancedBaseInstance.get().invokeExact(handles.PFN_glDrawArraysInstancedBaseInstance, mode, first, count, instancecount, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysInstancedBaseInstance", e); }
    }

    /// Invokes `glDrawElementsInstancedBaseInstance`.
    /// ```
    /// void glDrawElementsInstancedBaseInstance((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei instancecount, (unsigned int) GLuint baseinstance);
    /// ```
    public void DrawElementsInstancedBaseInstance(int mode, int count, int type, @NonNull MemorySegment indices, int instancecount, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedBaseInstance)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseInstance");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedBaseInstance", mode, count, type, indices, instancecount, baseinstance); }
        Handles.MH_glDrawElementsInstancedBaseInstance.get().invokeExact(handles.PFN_glDrawElementsInstancedBaseInstance, mode, count, type, indices, instancecount, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedBaseInstance", e); }
    }

    /// Invokes `glDrawElementsInstancedBaseVertexBaseInstance`.
    /// ```
    /// void glDrawElementsInstancedBaseVertexBaseInstance((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei instancecount, (int) GLint basevertex, (unsigned int) GLuint baseinstance);
    /// ```
    public void DrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, @NonNull MemorySegment indices, int instancecount, int basevertex, int baseinstance) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedBaseVertexBaseInstance)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedBaseVertexBaseInstance");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedBaseVertexBaseInstance", mode, count, type, indices, instancecount, basevertex, baseinstance); }
        Handles.MH_glDrawElementsInstancedBaseVertexBaseInstance.get().invokeExact(handles.PFN_glDrawElementsInstancedBaseVertexBaseInstance, mode, count, type, indices, instancecount, basevertex, baseinstance); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedBaseVertexBaseInstance", e); }
    }

}
