// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_transform_feedback2`
public final class GLNVTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING_NV = 0x8E25;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBindTransformFeedbackNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDeleteTransformFeedbacksNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGenTransformFeedbacksNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsTransformFeedbackNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glPauseTransformFeedbackNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public static final Supplier<MethodHandle> MH_glResumeTransformFeedbackNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public static final Supplier<MethodHandle> MH_glDrawTransformFeedbackNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBindTransformFeedbackNV;
        public final MemorySegment PFN_glDeleteTransformFeedbacksNV;
        public final MemorySegment PFN_glGenTransformFeedbacksNV;
        public final MemorySegment PFN_glIsTransformFeedbackNV;
        public final MemorySegment PFN_glPauseTransformFeedbackNV;
        public final MemorySegment PFN_glResumeTransformFeedbackNV;
        public final MemorySegment PFN_glDrawTransformFeedbackNV;
        private Handles(GLLoadFunc func) {
            PFN_glBindTransformFeedbackNV = func.invoke("glBindTransformFeedbackNV");
            PFN_glDeleteTransformFeedbacksNV = func.invoke("glDeleteTransformFeedbacksNV", "glDeleteTransformFeedbacks");
            PFN_glGenTransformFeedbacksNV = func.invoke("glGenTransformFeedbacksNV", "glGenTransformFeedbacks");
            PFN_glIsTransformFeedbackNV = func.invoke("glIsTransformFeedbackNV", "glIsTransformFeedback");
            PFN_glPauseTransformFeedbackNV = func.invoke("glPauseTransformFeedbackNV", "glPauseTransformFeedback");
            PFN_glResumeTransformFeedbackNV = func.invoke("glResumeTransformFeedbackNV", "glResumeTransformFeedback");
            PFN_glDrawTransformFeedbackNV = func.invoke("glDrawTransformFeedbackNV", "glDrawTransformFeedback");
        }
    }

    public GLNVTransformFeedback2(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBindTransformFeedbackNV`.
    /// ```
    /// void glBindTransformFeedbackNV((unsigned int) GLenum target, (unsigned int) GLuint id);
    /// ```
    public void BindTransformFeedbackNV(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTransformFeedbackNV", target, id); }
        Handles.MH_glBindTransformFeedbackNV.get().invokeExact(handles.PFN_glBindTransformFeedbackNV, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindTransformFeedbackNV", e); }
    }

    /// Invokes `glDeleteTransformFeedbacksNV`.
    /// ```
    /// void glDeleteTransformFeedbacksNV((int) GLsizei n, const GLuint* ids);
    /// ```
    public void DeleteTransformFeedbacksNV(int n, @NonNull MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteTransformFeedbacksNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacksNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteTransformFeedbacksNV", n, ids); }
        Handles.MH_glDeleteTransformFeedbacksNV.get().invokeExact(handles.PFN_glDeleteTransformFeedbacksNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteTransformFeedbacksNV", e); }
    }

    /// Invokes `glGenTransformFeedbacksNV`.
    /// ```
    /// void glGenTransformFeedbacksNV((int) GLsizei n, GLuint* ids);
    /// ```
    public void GenTransformFeedbacksNV(int n, @NonNull MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenTransformFeedbacksNV)) throw new GLSymbolNotFoundError("Symbol not found: glGenTransformFeedbacksNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenTransformFeedbacksNV", n, ids); }
        Handles.MH_glGenTransformFeedbacksNV.get().invokeExact(handles.PFN_glGenTransformFeedbacksNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenTransformFeedbacksNV", e); }
    }

    /// Invokes `glIsTransformFeedbackNV`.
    /// ```
    /// GLboolean glIsTransformFeedbackNV((unsigned int) GLuint id);
    /// ```
    public boolean IsTransformFeedbackNV(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsTransformFeedbackNV", id); }
        return (((byte) Handles.MH_glIsTransformFeedbackNV.get().invokeExact(handles.PFN_glIsTransformFeedbackNV, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTransformFeedbackNV", e); }
    }

    /// Invokes `glPauseTransformFeedbackNV`.
    /// ```
    /// void glPauseTransformFeedbackNV();
    /// ```
    public void PauseTransformFeedbackNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPauseTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glPauseTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPauseTransformFeedbackNV"); }
        Handles.MH_glPauseTransformFeedbackNV.get().invokeExact(handles.PFN_glPauseTransformFeedbackNV); }
        catch (Throwable e) { throw new RuntimeException("error in PauseTransformFeedbackNV", e); }
    }

    /// Invokes `glResumeTransformFeedbackNV`.
    /// ```
    /// void glResumeTransformFeedbackNV();
    /// ```
    public void ResumeTransformFeedbackNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glResumeTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glResumeTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResumeTransformFeedbackNV"); }
        Handles.MH_glResumeTransformFeedbackNV.get().invokeExact(handles.PFN_glResumeTransformFeedbackNV); }
        catch (Throwable e) { throw new RuntimeException("error in ResumeTransformFeedbackNV", e); }
    }

    /// Invokes `glDrawTransformFeedbackNV`.
    /// ```
    /// void glDrawTransformFeedbackNV((unsigned int) GLenum mode, (unsigned int) GLuint id);
    /// ```
    public void DrawTransformFeedbackNV(int mode, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTransformFeedbackNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTransformFeedbackNV", mode, id); }
        Handles.MH_glDrawTransformFeedbackNV.get().invokeExact(handles.PFN_glDrawTransformFeedbackNV, mode, id); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackNV", e); }
    }

}
