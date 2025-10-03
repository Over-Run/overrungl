// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_transform_feedback3`
public final class GLARBTransformFeedback3 {
    public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;
    public static final int GL_MAX_VERTEX_STREAMS = 0x8E71;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glDrawTransformFeedbackStream = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBeginQueryIndexed = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glEndQueryIndexed = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetQueryIndexediv = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glDrawTransformFeedbackStream;
        public final MemorySegment PFN_glBeginQueryIndexed;
        public final MemorySegment PFN_glEndQueryIndexed;
        public final MemorySegment PFN_glGetQueryIndexediv;
        private Handles(GLLoadFunc func) {
            PFN_glDrawTransformFeedbackStream = func.invoke("glDrawTransformFeedbackStream");
            PFN_glBeginQueryIndexed = func.invoke("glBeginQueryIndexed");
            PFN_glEndQueryIndexed = func.invoke("glEndQueryIndexed");
            PFN_glGetQueryIndexediv = func.invoke("glGetQueryIndexediv");
        }
    }

    public GLARBTransformFeedback3(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawTransformFeedbackStream`.
    /// ```
    /// void glDrawTransformFeedbackStream((unsigned int) GLenum mode, (unsigned int) GLuint id, (unsigned int) GLuint stream);
    /// ```
    public void DrawTransformFeedbackStream(int mode, int id, int stream) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackStream)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTransformFeedbackStream");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTransformFeedbackStream", mode, id, stream); }
        Handles.MH_glDrawTransformFeedbackStream.get().invokeExact(handles.PFN_glDrawTransformFeedbackStream, mode, id, stream); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackStream", e); }
    }

    /// Invokes `glBeginQueryIndexed`.
    /// ```
    /// void glBeginQueryIndexed((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint id);
    /// ```
    public void BeginQueryIndexed(int target, int index, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginQueryIndexed)) throw new GLSymbolNotFoundError("Symbol not found: glBeginQueryIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginQueryIndexed", target, index, id); }
        Handles.MH_glBeginQueryIndexed.get().invokeExact(handles.PFN_glBeginQueryIndexed, target, index, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginQueryIndexed", e); }
    }

    /// Invokes `glEndQueryIndexed`.
    /// ```
    /// void glEndQueryIndexed((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void EndQueryIndexed(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndQueryIndexed)) throw new GLSymbolNotFoundError("Symbol not found: glEndQueryIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndQueryIndexed", target, index); }
        Handles.MH_glEndQueryIndexed.get().invokeExact(handles.PFN_glEndQueryIndexed, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in EndQueryIndexed", e); }
    }

    /// Invokes `glGetQueryIndexediv`.
    /// ```
    /// void glGetQueryIndexediv((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetQueryIndexediv(int target, int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryIndexediv)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryIndexediv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryIndexediv", target, index, pname, params); }
        Handles.MH_glGetQueryIndexediv.get().invokeExact(handles.PFN_glGetQueryIndexediv, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryIndexediv", e); }
    }

}
