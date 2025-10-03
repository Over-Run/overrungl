// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_transform_feedback2`
public final class GLARBTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteTransformFeedbacks = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenTransformFeedbacks = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTransformFeedback = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPauseTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glResumeTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glDrawTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBindTransformFeedback;
        public final MemorySegment PFN_glDeleteTransformFeedbacks;
        public final MemorySegment PFN_glGenTransformFeedbacks;
        public final MemorySegment PFN_glIsTransformFeedback;
        public final MemorySegment PFN_glPauseTransformFeedback;
        public final MemorySegment PFN_glResumeTransformFeedback;
        public final MemorySegment PFN_glDrawTransformFeedback;
        private Handles(GLLoadFunc func) {
            PFN_glBindTransformFeedback = func.invoke("glBindTransformFeedback");
            PFN_glDeleteTransformFeedbacks = func.invoke("glDeleteTransformFeedbacks");
            PFN_glGenTransformFeedbacks = func.invoke("glGenTransformFeedbacks");
            PFN_glIsTransformFeedback = func.invoke("glIsTransformFeedback");
            PFN_glPauseTransformFeedback = func.invoke("glPauseTransformFeedback");
            PFN_glResumeTransformFeedback = func.invoke("glResumeTransformFeedback");
            PFN_glDrawTransformFeedback = func.invoke("glDrawTransformFeedback");
        }
    }

    public GLARBTransformFeedback2(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBindTransformFeedback`.
    /// ```
    /// void glBindTransformFeedback((unsigned int) GLenum target, (unsigned int) GLuint id);
    /// ```
    public void BindTransformFeedback(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glBindTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTransformFeedback", target, id); }
        Handles.MH_glBindTransformFeedback.invokeExact(handles.PFN_glBindTransformFeedback, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindTransformFeedback", e); }
    }

    /// Invokes `glDeleteTransformFeedbacks`.
    /// ```
    /// void glDeleteTransformFeedbacks((int) GLsizei n, const GLuint* ids);
    /// ```
    public void DeleteTransformFeedbacks(int n, @NonNull MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteTransformFeedbacks)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacks");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteTransformFeedbacks", n, ids); }
        Handles.MH_glDeleteTransformFeedbacks.invokeExact(handles.PFN_glDeleteTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteTransformFeedbacks", e); }
    }

    /// Invokes `glGenTransformFeedbacks`.
    /// ```
    /// void glGenTransformFeedbacks((int) GLsizei n, GLuint* ids);
    /// ```
    public void GenTransformFeedbacks(int n, @NonNull MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenTransformFeedbacks)) throw new GLSymbolNotFoundError("Symbol not found: glGenTransformFeedbacks");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenTransformFeedbacks", n, ids); }
        Handles.MH_glGenTransformFeedbacks.invokeExact(handles.PFN_glGenTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenTransformFeedbacks", e); }
    }

    /// Invokes `glIsTransformFeedback`.
    /// ```
    /// GLboolean glIsTransformFeedback((unsigned int) GLuint id);
    /// ```
    public boolean IsTransformFeedback(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glIsTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsTransformFeedback", id); }
        return (((byte) Handles.MH_glIsTransformFeedback.invokeExact(handles.PFN_glIsTransformFeedback, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTransformFeedback", e); }
    }

    /// Invokes `glPauseTransformFeedback`.
    /// ```
    /// void glPauseTransformFeedback();
    /// ```
    public void PauseTransformFeedback() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPauseTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glPauseTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPauseTransformFeedback"); }
        Handles.MH_glPauseTransformFeedback.invokeExact(handles.PFN_glPauseTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in PauseTransformFeedback", e); }
    }

    /// Invokes `glResumeTransformFeedback`.
    /// ```
    /// void glResumeTransformFeedback();
    /// ```
    public void ResumeTransformFeedback() {
        if (MemoryUtil.isNullPointer(handles.PFN_glResumeTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glResumeTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResumeTransformFeedback"); }
        Handles.MH_glResumeTransformFeedback.invokeExact(handles.PFN_glResumeTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in ResumeTransformFeedback", e); }
    }

    /// Invokes `glDrawTransformFeedback`.
    /// ```
    /// void glDrawTransformFeedback((unsigned int) GLenum mode, (unsigned int) GLuint id);
    /// ```
    public void DrawTransformFeedback(int mode, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTransformFeedback", mode, id); }
        Handles.MH_glDrawTransformFeedback.invokeExact(handles.PFN_glDrawTransformFeedback, mode, id); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedback", e); }
    }

}
