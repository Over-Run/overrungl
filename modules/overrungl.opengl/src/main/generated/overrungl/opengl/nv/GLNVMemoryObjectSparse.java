// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_memory_object_sparse`
public final class GLNVMemoryObjectSparse {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBufferPageCommitmentMemNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glTexPageCommitmentMemNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glNamedBufferPageCommitmentMemNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glTexturePageCommitmentMemNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)));
        public final MemorySegment PFN_glBufferPageCommitmentMemNV;
        public final MemorySegment PFN_glTexPageCommitmentMemNV;
        public final MemorySegment PFN_glNamedBufferPageCommitmentMemNV;
        public final MemorySegment PFN_glTexturePageCommitmentMemNV;
        private Handles(GLLoadFunc func) {
            PFN_glBufferPageCommitmentMemNV = func.invoke("glBufferPageCommitmentMemNV");
            PFN_glTexPageCommitmentMemNV = func.invoke("glTexPageCommitmentMemNV");PFN_glNamedBufferPageCommitmentMemNV = func.invoke("glNamedBufferPageCommitmentMemNV");
            PFN_glTexturePageCommitmentMemNV = func.invoke("glTexturePageCommitmentMemNV");
        }
    }

    public GLNVMemoryObjectSparse(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBufferPageCommitmentMemNV`.
    /// ```
    /// void glBufferPageCommitmentMemNV((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 memOffset, GLboolean commit);
    /// ```
    public void BufferPageCommitmentMemNV(int target, long offset, long size, int memory, long memOffset, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferPageCommitmentMemNV)) throw new GLSymbolNotFoundError("Symbol not found: glBufferPageCommitmentMemNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferPageCommitmentMemNV", target, offset, size, memory, memOffset, commit); }
        Handles.MH_glBufferPageCommitmentMemNV.get().invokeExact(handles.PFN_glBufferPageCommitmentMemNV, target, offset, size, memory, memOffset, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in BufferPageCommitmentMemNV", e); }
    }

    /// Invokes `glTexPageCommitmentMemNV`.
    /// ```
    /// void glTexPageCommitmentMemNV((unsigned int) GLenum target, (int) GLint layer, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset, GLboolean commit);
    /// ```
    public void TexPageCommitmentMemNV(int target, int layer, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int memory, long offset, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexPageCommitmentMemNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexPageCommitmentMemNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexPageCommitmentMemNV", target, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit); }
        Handles.MH_glTexPageCommitmentMemNV.get().invokeExact(handles.PFN_glTexPageCommitmentMemNV, target, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexPageCommitmentMemNV", e); }
    }

    /// Invokes `glNamedBufferPageCommitmentMemNV`.
    /// ```
    /// void glNamedBufferPageCommitmentMemNV((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 memOffset, GLboolean commit);
    /// ```
    public void NamedBufferPageCommitmentMemNV(int buffer, long offset, long size, int memory, long memOffset, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferPageCommitmentMemNV)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferPageCommitmentMemNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferPageCommitmentMemNV", buffer, offset, size, memory, memOffset, commit); }
        Handles.MH_glNamedBufferPageCommitmentMemNV.get().invokeExact(handles.PFN_glNamedBufferPageCommitmentMemNV, buffer, offset, size, memory, memOffset, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferPageCommitmentMemNV", e); }
    }

    /// Invokes `glTexturePageCommitmentMemNV`.
    /// ```
    /// void glTexturePageCommitmentMemNV((unsigned int) GLuint texture, (int) GLint layer, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 offset, GLboolean commit);
    /// ```
    public void TexturePageCommitmentMemNV(int texture, int layer, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int memory, long offset, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexturePageCommitmentMemNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexturePageCommitmentMemNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexturePageCommitmentMemNV", texture, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit); }
        Handles.MH_glTexturePageCommitmentMemNV.get().invokeExact(handles.PFN_glTexturePageCommitmentMemNV, texture, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexturePageCommitmentMemNV", e); }
    }

}
