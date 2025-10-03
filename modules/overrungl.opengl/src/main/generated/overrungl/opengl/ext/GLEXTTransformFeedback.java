// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_transform_feedback`
public final class GLEXTTransformFeedback {
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT = 0x8C85;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 0x8C8F;
    public static final int GL_INTERLEAVED_ATTRIBS_EXT = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS_EXT = 0x8C8D;
    public static final int GL_PRIMITIVES_GENERATED_EXT = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD_EXT = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT = 0x8C8B;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT = 0x8C80;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_EXT = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT = 0x8C7F;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 0x8C76;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBeginTransformFeedbackEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glEndTransformFeedbackEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public static final Supplier<MethodHandle> MH_glBindBufferRangeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glBindBufferOffsetEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glBindBufferBaseEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTransformFeedbackVaryingsEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetTransformFeedbackVaryingEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glBeginTransformFeedbackEXT;
        public final MemorySegment PFN_glEndTransformFeedbackEXT;
        public final MemorySegment PFN_glBindBufferRangeEXT;
        public final MemorySegment PFN_glBindBufferOffsetEXT;
        public final MemorySegment PFN_glBindBufferBaseEXT;
        public final MemorySegment PFN_glTransformFeedbackVaryingsEXT;
        public final MemorySegment PFN_glGetTransformFeedbackVaryingEXT;
        private Handles(GLLoadFunc func) {
            PFN_glBeginTransformFeedbackEXT = func.invoke("glBeginTransformFeedbackEXT", "glBeginTransformFeedback");
            PFN_glEndTransformFeedbackEXT = func.invoke("glEndTransformFeedbackEXT", "glEndTransformFeedback");
            PFN_glBindBufferRangeEXT = func.invoke("glBindBufferRangeEXT", "glBindBufferRange");
            PFN_glBindBufferOffsetEXT = func.invoke("glBindBufferOffsetEXT");
            PFN_glBindBufferBaseEXT = func.invoke("glBindBufferBaseEXT", "glBindBufferBase");
            PFN_glTransformFeedbackVaryingsEXT = func.invoke("glTransformFeedbackVaryingsEXT", "glTransformFeedbackVaryings");
            PFN_glGetTransformFeedbackVaryingEXT = func.invoke("glGetTransformFeedbackVaryingEXT", "glGetTransformFeedbackVarying");
        }
    }

    public GLEXTTransformFeedback(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBeginTransformFeedbackEXT`.
    /// ```
    /// void glBeginTransformFeedbackEXT((unsigned int) GLenum primitiveMode);
    /// ```
    public void BeginTransformFeedbackEXT(int primitiveMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginTransformFeedbackEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBeginTransformFeedbackEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginTransformFeedbackEXT", primitiveMode); }
        Handles.MH_glBeginTransformFeedbackEXT.get().invokeExact(handles.PFN_glBeginTransformFeedbackEXT, primitiveMode); }
        catch (Throwable e) { throw new RuntimeException("error in BeginTransformFeedbackEXT", e); }
    }

    /// Invokes `glEndTransformFeedbackEXT`.
    /// ```
    /// void glEndTransformFeedbackEXT();
    /// ```
    public void EndTransformFeedbackEXT() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndTransformFeedbackEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEndTransformFeedbackEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndTransformFeedbackEXT"); }
        Handles.MH_glEndTransformFeedbackEXT.get().invokeExact(handles.PFN_glEndTransformFeedbackEXT); }
        catch (Throwable e) { throw new RuntimeException("error in EndTransformFeedbackEXT", e); }
    }

    /// Invokes `glBindBufferRangeEXT`.
    /// ```
    /// void glBindBufferRangeEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void BindBufferRangeEXT(int target, int index, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferRangeEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferRangeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferRangeEXT", target, index, buffer, offset, size); }
        Handles.MH_glBindBufferRangeEXT.get().invokeExact(handles.PFN_glBindBufferRangeEXT, target, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferRangeEXT", e); }
    }

    /// Invokes `glBindBufferOffsetEXT`.
    /// ```
    /// void glBindBufferOffsetEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void BindBufferOffsetEXT(int target, int index, int buffer, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferOffsetEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferOffsetEXT", target, index, buffer, offset); }
        Handles.MH_glBindBufferOffsetEXT.get().invokeExact(handles.PFN_glBindBufferOffsetEXT, target, index, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferOffsetEXT", e); }
    }

    /// Invokes `glBindBufferBaseEXT`.
    /// ```
    /// void glBindBufferBaseEXT((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer);
    /// ```
    public void BindBufferBaseEXT(int target, int index, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferBaseEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferBaseEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferBaseEXT", target, index, buffer); }
        Handles.MH_glBindBufferBaseEXT.get().invokeExact(handles.PFN_glBindBufferBaseEXT, target, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferBaseEXT", e); }
    }

    /// Invokes `glTransformFeedbackVaryingsEXT`.
    /// ```
    /// void glTransformFeedbackVaryingsEXT((unsigned int) GLuint program, (int) GLsizei count, const GLchar* const * varyings, (unsigned int) GLenum bufferMode);
    /// ```
    public void TransformFeedbackVaryingsEXT(int program, int count, @NonNull MemorySegment varyings, int bufferMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackVaryingsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTransformFeedbackVaryingsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTransformFeedbackVaryingsEXT", program, count, varyings, bufferMode); }
        Handles.MH_glTransformFeedbackVaryingsEXT.get().invokeExact(handles.PFN_glTransformFeedbackVaryingsEXT, program, count, varyings, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackVaryingsEXT", e); }
    }

    /// Invokes `glGetTransformFeedbackVaryingEXT`.
    /// ```
    /// void glGetTransformFeedbackVaryingEXT((unsigned int) GLuint program, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLsizei* size, GLenum* type, GLchar* name);
    /// ```
    public void GetTransformFeedbackVaryingEXT(int program, int index, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment size, @NonNull MemorySegment type, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbackVaryingEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTransformFeedbackVaryingEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTransformFeedbackVaryingEXT", program, index, bufSize, length, size, type, name); }
        Handles.MH_glGetTransformFeedbackVaryingEXT.get().invokeExact(handles.PFN_glGetTransformFeedbackVaryingEXT, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbackVaryingEXT", e); }
    }

}
