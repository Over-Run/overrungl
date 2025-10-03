// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_sparse_buffer`
public final class GLARBSparseBuffer {
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x0400;
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBufferPageCommitmentARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glNamedBufferPageCommitmentEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glNamedBufferPageCommitmentARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)));
        public final MemorySegment PFN_glBufferPageCommitmentARB;
        public final MemorySegment PFN_glNamedBufferPageCommitmentEXT;
        public final MemorySegment PFN_glNamedBufferPageCommitmentARB;
        private Handles(GLLoadFunc func) {
            PFN_glBufferPageCommitmentARB = func.invoke("glBufferPageCommitmentARB");PFN_glNamedBufferPageCommitmentEXT = func.invoke("glNamedBufferPageCommitmentEXT");PFN_glNamedBufferPageCommitmentARB = func.invoke("glNamedBufferPageCommitmentARB");
        }
    }

    public GLARBSparseBuffer(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBufferPageCommitmentARB`.
    /// ```
    /// void glBufferPageCommitmentARB((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, GLboolean commit);
    /// ```
    public void BufferPageCommitmentARB(int target, long offset, long size, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferPageCommitmentARB)) throw new GLSymbolNotFoundError("Symbol not found: glBufferPageCommitmentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBufferPageCommitmentARB", target, offset, size, commit); }
        Handles.MH_glBufferPageCommitmentARB.get().invokeExact(handles.PFN_glBufferPageCommitmentARB, target, offset, size, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in BufferPageCommitmentARB", e); }
    }

    /// Invokes `glNamedBufferPageCommitmentEXT`.
    /// ```
    /// void glNamedBufferPageCommitmentEXT((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, GLboolean commit);
    /// ```
    public void NamedBufferPageCommitmentEXT(int buffer, long offset, long size, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferPageCommitmentEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferPageCommitmentEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferPageCommitmentEXT", buffer, offset, size, commit); }
        Handles.MH_glNamedBufferPageCommitmentEXT.get().invokeExact(handles.PFN_glNamedBufferPageCommitmentEXT, buffer, offset, size, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferPageCommitmentEXT", e); }
    }

    /// Invokes `glNamedBufferPageCommitmentARB`.
    /// ```
    /// void glNamedBufferPageCommitmentARB((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, GLboolean commit);
    /// ```
    public void NamedBufferPageCommitmentARB(int buffer, long offset, long size, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferPageCommitmentARB)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferPageCommitmentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferPageCommitmentARB", buffer, offset, size, commit); }
        Handles.MH_glNamedBufferPageCommitmentARB.get().invokeExact(handles.PFN_glNamedBufferPageCommitmentARB, buffer, offset, size, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferPageCommitmentARB", e); }
    }

}
