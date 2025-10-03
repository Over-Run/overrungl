// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_transform_feedback_instanced`
public final class GLARBTransformFeedbackInstanced {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawTransformFeedbackInstanced = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawTransformFeedbackStreamInstanced = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawTransformFeedbackInstanced;
        public final MemorySegment PFN_glDrawTransformFeedbackStreamInstanced;
        private Handles(GLLoadFunc func) {
            PFN_glDrawTransformFeedbackInstanced = func.invoke("glDrawTransformFeedbackInstanced");
            PFN_glDrawTransformFeedbackStreamInstanced = func.invoke("glDrawTransformFeedbackStreamInstanced");
        }
    }

    public GLARBTransformFeedbackInstanced(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawTransformFeedbackInstanced`.
    /// ```
    /// void glDrawTransformFeedbackInstanced((unsigned int) GLenum mode, (unsigned int) GLuint id, (int) GLsizei instancecount);
    /// ```
    public void DrawTransformFeedbackInstanced(int mode, int id, int instancecount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackInstanced)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTransformFeedbackInstanced");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTransformFeedbackInstanced", mode, id, instancecount); }
        Handles.MH_glDrawTransformFeedbackInstanced.invokeExact(handles.PFN_glDrawTransformFeedbackInstanced, mode, id, instancecount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackInstanced", e); }
    }

    /// Invokes `glDrawTransformFeedbackStreamInstanced`.
    /// ```
    /// void glDrawTransformFeedbackStreamInstanced((unsigned int) GLenum mode, (unsigned int) GLuint id, (unsigned int) GLuint stream, (int) GLsizei instancecount);
    /// ```
    public void DrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int instancecount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackStreamInstanced)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTransformFeedbackStreamInstanced");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTransformFeedbackStreamInstanced", mode, id, stream, instancecount); }
        Handles.MH_glDrawTransformFeedbackStreamInstanced.invokeExact(handles.PFN_glDrawTransformFeedbackStreamInstanced, mode, id, stream, instancecount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackStreamInstanced", e); }
    }

}
