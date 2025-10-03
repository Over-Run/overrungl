// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_vertex_attrib_binding`
public final class GLARBVertexAttribBinding {
    public static final int GL_VERTEX_ATTRIB_BINDING = 0x82D4;
    public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
    public static final int GL_VERTEX_BINDING_DIVISOR = 0x82D6;
    public static final int GL_VERTEX_BINDING_OFFSET = 0x82D7;
    public static final int GL_VERTEX_BINDING_STRIDE = 0x82D8;
    public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
    public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBindVertexBuffer = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribFormat = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribIFormat = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribLFormat = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribBinding = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexBindingDivisor = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBindVertexBuffer;
        public final MemorySegment PFN_glVertexAttribFormat;
        public final MemorySegment PFN_glVertexAttribIFormat;
        public final MemorySegment PFN_glVertexAttribLFormat;
        public final MemorySegment PFN_glVertexAttribBinding;
        public final MemorySegment PFN_glVertexBindingDivisor;
        private Handles(GLLoadFunc func) {
            PFN_glBindVertexBuffer = func.invoke("glBindVertexBuffer");
            PFN_glVertexAttribFormat = func.invoke("glVertexAttribFormat");
            PFN_glVertexAttribIFormat = func.invoke("glVertexAttribIFormat");
            PFN_glVertexAttribLFormat = func.invoke("glVertexAttribLFormat");
            PFN_glVertexAttribBinding = func.invoke("glVertexAttribBinding");
            PFN_glVertexBindingDivisor = func.invoke("glVertexBindingDivisor");
        }
    }

    public GLARBVertexAttribBinding(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBindVertexBuffer`.
    /// ```
    /// void glBindVertexBuffer((unsigned int) GLuint bindingindex, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, (int) GLsizei stride);
    /// ```
    public void BindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBindVertexBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindVertexBuffer", bindingindex, buffer, offset, stride); }
        Handles.MH_glBindVertexBuffer.get().invokeExact(handles.PFN_glBindVertexBuffer, bindingindex, buffer, offset, stride); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexBuffer", e); }
    }

    /// Invokes `glVertexAttribFormat`.
    /// ```
    /// void glVertexAttribFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribFormat");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribFormat", attribindex, size, type, normalized, relativeoffset); }
        Handles.MH_glVertexAttribFormat.get().invokeExact(handles.PFN_glVertexAttribFormat, attribindex, size, type, ((normalized) ? (byte)1 : (byte)0), relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribFormat", e); }
    }

    /// Invokes `glVertexAttribIFormat`.
    /// ```
    /// void glVertexAttribIFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribIFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribIFormat");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribIFormat", attribindex, size, type, relativeoffset); }
        Handles.MH_glVertexAttribIFormat.get().invokeExact(handles.PFN_glVertexAttribIFormat, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribIFormat", e); }
    }

    /// Invokes `glVertexAttribLFormat`.
    /// ```
    /// void glVertexAttribLFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribLFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribLFormat");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribLFormat", attribindex, size, type, relativeoffset); }
        Handles.MH_glVertexAttribLFormat.get().invokeExact(handles.PFN_glVertexAttribLFormat, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribLFormat", e); }
    }

    /// Invokes `glVertexAttribBinding`.
    /// ```
    /// void glVertexAttribBinding((unsigned int) GLuint attribindex, (unsigned int) GLuint bindingindex);
    /// ```
    public void VertexAttribBinding(int attribindex, int bindingindex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribBinding)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribBinding");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribBinding", attribindex, bindingindex); }
        Handles.MH_glVertexAttribBinding.get().invokeExact(handles.PFN_glVertexAttribBinding, attribindex, bindingindex); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribBinding", e); }
    }

    /// Invokes `glVertexBindingDivisor`.
    /// ```
    /// void glVertexBindingDivisor((unsigned int) GLuint bindingindex, (unsigned int) GLuint divisor);
    /// ```
    public void VertexBindingDivisor(int bindingindex, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexBindingDivisor)) throw new GLSymbolNotFoundError("Symbol not found: glVertexBindingDivisor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexBindingDivisor", bindingindex, divisor); }
        Handles.MH_glVertexBindingDivisor.get().invokeExact(handles.PFN_glVertexBindingDivisor, bindingindex, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexBindingDivisor", e); }
    }

}
