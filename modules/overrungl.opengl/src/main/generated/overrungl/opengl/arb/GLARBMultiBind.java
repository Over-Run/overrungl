// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_multi_bind`
public final class GLARBMultiBind {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBindBuffersBase = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glBindBuffersRange = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glBindTextures = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glBindSamplers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glBindImageTextures = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glBindVertexBuffers = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glBindBuffersBase;
        public final MemorySegment PFN_glBindBuffersRange;
        public final MemorySegment PFN_glBindTextures;
        public final MemorySegment PFN_glBindSamplers;
        public final MemorySegment PFN_glBindImageTextures;
        public final MemorySegment PFN_glBindVertexBuffers;
        private Handles(GLLoadFunc func) {
            PFN_glBindBuffersBase = func.invoke("glBindBuffersBase");
            PFN_glBindBuffersRange = func.invoke("glBindBuffersRange");
            PFN_glBindTextures = func.invoke("glBindTextures");
            PFN_glBindSamplers = func.invoke("glBindSamplers");
            PFN_glBindImageTextures = func.invoke("glBindImageTextures");
            PFN_glBindVertexBuffers = func.invoke("glBindVertexBuffers");
        }
    }

    public GLARBMultiBind(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBindBuffersBase`.
    /// ```
    /// void glBindBuffersBase((unsigned int) GLenum target, (unsigned int) GLuint first, (int) GLsizei count, const GLuint* buffers);
    /// ```
    public void BindBuffersBase(int target, int first, int count, @NonNull MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBuffersBase)) throw new GLSymbolNotFoundError("Symbol not found: glBindBuffersBase");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBuffersBase", target, first, count, buffers); }
        Handles.MH_glBindBuffersBase.get().invokeExact(handles.PFN_glBindBuffersBase, target, first, count, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in BindBuffersBase", e); }
    }

    /// Invokes `glBindBuffersRange`.
    /// ```
    /// void glBindBuffersRange((unsigned int) GLenum target, (unsigned int) GLuint first, (int) GLsizei count, const GLuint* buffers, const GLintptr* offsets, const GLsizeiptr* sizes);
    /// ```
    public void BindBuffersRange(int target, int first, int count, @NonNull MemorySegment buffers, @NonNull MemorySegment offsets, @NonNull MemorySegment sizes) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBuffersRange)) throw new GLSymbolNotFoundError("Symbol not found: glBindBuffersRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBuffersRange", target, first, count, buffers, offsets, sizes); }
        Handles.MH_glBindBuffersRange.get().invokeExact(handles.PFN_glBindBuffersRange, target, first, count, buffers, offsets, sizes); }
        catch (Throwable e) { throw new RuntimeException("error in BindBuffersRange", e); }
    }

    /// Invokes `glBindTextures`.
    /// ```
    /// void glBindTextures((unsigned int) GLuint first, (int) GLsizei count, const GLuint* textures);
    /// ```
    public void BindTextures(int first, int count, @NonNull MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTextures)) throw new GLSymbolNotFoundError("Symbol not found: glBindTextures");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTextures", first, count, textures); }
        Handles.MH_glBindTextures.get().invokeExact(handles.PFN_glBindTextures, first, count, textures); }
        catch (Throwable e) { throw new RuntimeException("error in BindTextures", e); }
    }

    /// Invokes `glBindSamplers`.
    /// ```
    /// void glBindSamplers((unsigned int) GLuint first, (int) GLsizei count, const GLuint* samplers);
    /// ```
    public void BindSamplers(int first, int count, @NonNull MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindSamplers)) throw new GLSymbolNotFoundError("Symbol not found: glBindSamplers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindSamplers", first, count, samplers); }
        Handles.MH_glBindSamplers.get().invokeExact(handles.PFN_glBindSamplers, first, count, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in BindSamplers", e); }
    }

    /// Invokes `glBindImageTextures`.
    /// ```
    /// void glBindImageTextures((unsigned int) GLuint first, (int) GLsizei count, const GLuint* textures);
    /// ```
    public void BindImageTextures(int first, int count, @NonNull MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindImageTextures)) throw new GLSymbolNotFoundError("Symbol not found: glBindImageTextures");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindImageTextures", first, count, textures); }
        Handles.MH_glBindImageTextures.get().invokeExact(handles.PFN_glBindImageTextures, first, count, textures); }
        catch (Throwable e) { throw new RuntimeException("error in BindImageTextures", e); }
    }

    /// Invokes `glBindVertexBuffers`.
    /// ```
    /// void glBindVertexBuffers((unsigned int) GLuint first, (int) GLsizei count, const GLuint* buffers, const GLintptr* offsets, const GLsizei* strides);
    /// ```
    public void BindVertexBuffers(int first, int count, @NonNull MemorySegment buffers, @NonNull MemorySegment offsets, @NonNull MemorySegment strides) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexBuffers)) throw new GLSymbolNotFoundError("Symbol not found: glBindVertexBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindVertexBuffers", first, count, buffers, offsets, strides); }
        Handles.MH_glBindVertexBuffers.get().invokeExact(handles.PFN_glBindVertexBuffers, first, count, buffers, offsets, strides); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexBuffers", e); }
    }

}
