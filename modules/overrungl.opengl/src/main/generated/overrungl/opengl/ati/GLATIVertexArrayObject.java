// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ati;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_vertex_array_object`
public final class GLATIVertexArrayObject {
    public static final int GL_STATIC_ATI = 0x8760;
    public static final int GL_DYNAMIC_ATI = 0x8761;
    public static final int GL_PRESERVE_ATI = 0x8762;
    public static final int GL_DISCARD_ATI = 0x8763;
    public static final int GL_OBJECT_BUFFER_SIZE_ATI = 0x8764;
    public static final int GL_OBJECT_BUFFER_USAGE_ATI = 0x8765;
    public static final int GL_ARRAY_OBJECT_BUFFER_ATI = 0x8766;
    public static final int GL_ARRAY_OBJECT_OFFSET_ATI = 0x8767;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glNewObjectBufferATI = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsObjectBufferATI = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUpdateObjectBufferATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetObjectBufferfvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectBufferivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFreeObjectBufferATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glArrayObjectATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetArrayObjectfvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetArrayObjectivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantArrayObjectATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVariantArrayObjectfvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVariantArrayObjectivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glNewObjectBufferATI;
        public final MemorySegment PFN_glIsObjectBufferATI;
        public final MemorySegment PFN_glUpdateObjectBufferATI;
        public final MemorySegment PFN_glGetObjectBufferfvATI;
        public final MemorySegment PFN_glGetObjectBufferivATI;
        public final MemorySegment PFN_glFreeObjectBufferATI;
        public final MemorySegment PFN_glArrayObjectATI;
        public final MemorySegment PFN_glGetArrayObjectfvATI;
        public final MemorySegment PFN_glGetArrayObjectivATI;
        public final MemorySegment PFN_glVariantArrayObjectATI;
        public final MemorySegment PFN_glGetVariantArrayObjectfvATI;
        public final MemorySegment PFN_glGetVariantArrayObjectivATI;
        private Handles(GLLoadFunc func) {
            PFN_glNewObjectBufferATI = func.invoke("glNewObjectBufferATI");
            PFN_glIsObjectBufferATI = func.invoke("glIsObjectBufferATI");
            PFN_glUpdateObjectBufferATI = func.invoke("glUpdateObjectBufferATI");
            PFN_glGetObjectBufferfvATI = func.invoke("glGetObjectBufferfvATI");
            PFN_glGetObjectBufferivATI = func.invoke("glGetObjectBufferivATI");
            PFN_glFreeObjectBufferATI = func.invoke("glFreeObjectBufferATI");
            PFN_glArrayObjectATI = func.invoke("glArrayObjectATI");
            PFN_glGetArrayObjectfvATI = func.invoke("glGetArrayObjectfvATI");
            PFN_glGetArrayObjectivATI = func.invoke("glGetArrayObjectivATI");
            PFN_glVariantArrayObjectATI = func.invoke("glVariantArrayObjectATI");
            PFN_glGetVariantArrayObjectfvATI = func.invoke("glGetVariantArrayObjectfvATI");
            PFN_glGetVariantArrayObjectivATI = func.invoke("glGetVariantArrayObjectivATI");
        }
    }

    public GLATIVertexArrayObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glNewObjectBufferATI`.
    /// ```
    /// (unsigned int) GLuint glNewObjectBufferATI((int) GLsizei size, const void* pointer, (unsigned int) GLenum usage);
    /// ```
    public int NewObjectBufferATI(int size, @NonNull MemorySegment pointer, int usage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNewObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glNewObjectBufferATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNewObjectBufferATI", size, pointer, usage); }
        return (int) Handles.MH_glNewObjectBufferATI.invokeExact(handles.PFN_glNewObjectBufferATI, size, pointer, usage); }
        catch (Throwable e) { throw new RuntimeException("error in NewObjectBufferATI", e); }
    }

    /// Invokes `glIsObjectBufferATI`.
    /// ```
    /// GLboolean glIsObjectBufferATI((unsigned int) GLuint buffer);
    /// ```
    public boolean IsObjectBufferATI(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glIsObjectBufferATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsObjectBufferATI", buffer); }
        return (((byte) Handles.MH_glIsObjectBufferATI.invokeExact(handles.PFN_glIsObjectBufferATI, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsObjectBufferATI", e); }
    }

    /// Invokes `glUpdateObjectBufferATI`.
    /// ```
    /// void glUpdateObjectBufferATI((unsigned int) GLuint buffer, (unsigned int) GLuint offset, (int) GLsizei size, const void* pointer, (unsigned int) GLenum preserve);
    /// ```
    public void UpdateObjectBufferATI(int buffer, int offset, int size, @NonNull MemorySegment pointer, int preserve) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUpdateObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glUpdateObjectBufferATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUpdateObjectBufferATI", buffer, offset, size, pointer, preserve); }
        Handles.MH_glUpdateObjectBufferATI.invokeExact(handles.PFN_glUpdateObjectBufferATI, buffer, offset, size, pointer, preserve); }
        catch (Throwable e) { throw new RuntimeException("error in UpdateObjectBufferATI", e); }
    }

    /// Invokes `glGetObjectBufferfvATI`.
    /// ```
    /// void glGetObjectBufferfvATI((unsigned int) GLuint buffer, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetObjectBufferfvATI(int buffer, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectBufferfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectBufferfvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectBufferfvATI", buffer, pname, params); }
        Handles.MH_glGetObjectBufferfvATI.invokeExact(handles.PFN_glGetObjectBufferfvATI, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectBufferfvATI", e); }
    }

    /// Invokes `glGetObjectBufferivATI`.
    /// ```
    /// void glGetObjectBufferivATI((unsigned int) GLuint buffer, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetObjectBufferivATI(int buffer, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectBufferivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectBufferivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectBufferivATI", buffer, pname, params); }
        Handles.MH_glGetObjectBufferivATI.invokeExact(handles.PFN_glGetObjectBufferivATI, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectBufferivATI", e); }
    }

    /// Invokes `glFreeObjectBufferATI`.
    /// ```
    /// void glFreeObjectBufferATI((unsigned int) GLuint buffer);
    /// ```
    public void FreeObjectBufferATI(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFreeObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glFreeObjectBufferATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFreeObjectBufferATI", buffer); }
        Handles.MH_glFreeObjectBufferATI.invokeExact(handles.PFN_glFreeObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in FreeObjectBufferATI", e); }
    }

    /// Invokes `glArrayObjectATI`.
    /// ```
    /// void glArrayObjectATI((unsigned int) GLenum array, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, (unsigned int) GLuint buffer, (unsigned int) GLuint offset);
    /// ```
    public void ArrayObjectATI(int array, int size, int type, int stride, int buffer, int offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glArrayObjectATI)) throw new GLSymbolNotFoundError("Symbol not found: glArrayObjectATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glArrayObjectATI", array, size, type, stride, buffer, offset); }
        Handles.MH_glArrayObjectATI.invokeExact(handles.PFN_glArrayObjectATI, array, size, type, stride, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in ArrayObjectATI", e); }
    }

    /// Invokes `glGetArrayObjectfvATI`.
    /// ```
    /// void glGetArrayObjectfvATI((unsigned int) GLenum array, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetArrayObjectfvATI(int array, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetArrayObjectfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetArrayObjectfvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetArrayObjectfvATI", array, pname, params); }
        Handles.MH_glGetArrayObjectfvATI.invokeExact(handles.PFN_glGetArrayObjectfvATI, array, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetArrayObjectfvATI", e); }
    }

    /// Invokes `glGetArrayObjectivATI`.
    /// ```
    /// void glGetArrayObjectivATI((unsigned int) GLenum array, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetArrayObjectivATI(int array, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetArrayObjectivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetArrayObjectivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetArrayObjectivATI", array, pname, params); }
        Handles.MH_glGetArrayObjectivATI.invokeExact(handles.PFN_glGetArrayObjectivATI, array, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetArrayObjectivATI", e); }
    }

    /// Invokes `glVariantArrayObjectATI`.
    /// ```
    /// void glVariantArrayObjectATI((unsigned int) GLuint id, (unsigned int) GLenum type, (int) GLsizei stride, (unsigned int) GLuint buffer, (unsigned int) GLuint offset);
    /// ```
    public void VariantArrayObjectATI(int id, int type, int stride, int buffer, int offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantArrayObjectATI)) throw new GLSymbolNotFoundError("Symbol not found: glVariantArrayObjectATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVariantArrayObjectATI", id, type, stride, buffer, offset); }
        Handles.MH_glVariantArrayObjectATI.invokeExact(handles.PFN_glVariantArrayObjectATI, id, type, stride, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VariantArrayObjectATI", e); }
    }

    /// Invokes `glGetVariantArrayObjectfvATI`.
    /// ```
    /// void glGetVariantArrayObjectfvATI((unsigned int) GLuint id, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVariantArrayObjectfvATI(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVariantArrayObjectfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetVariantArrayObjectfvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVariantArrayObjectfvATI", id, pname, params); }
        Handles.MH_glGetVariantArrayObjectfvATI.invokeExact(handles.PFN_glGetVariantArrayObjectfvATI, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVariantArrayObjectfvATI", e); }
    }

    /// Invokes `glGetVariantArrayObjectivATI`.
    /// ```
    /// void glGetVariantArrayObjectivATI((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVariantArrayObjectivATI(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVariantArrayObjectivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetVariantArrayObjectivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVariantArrayObjectivATI", id, pname, params); }
        Handles.MH_glGetVariantArrayObjectivATI.invokeExact(handles.PFN_glGetVariantArrayObjectivATI, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVariantArrayObjectivATI", e); }
    }

}
