// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_vertex_array`
public final class GLEXTVertexArray {
    public static final int GL_VERTEX_ARRAY_EXT = 0x8074;
    public static final int GL_NORMAL_ARRAY_EXT = 0x8075;
    public static final int GL_COLOR_ARRAY_EXT = 0x8076;
    public static final int GL_INDEX_ARRAY_EXT = 0x8077;
    public static final int GL_TEXTURE_COORD_ARRAY_EXT = 0x8078;
    public static final int GL_EDGE_FLAG_ARRAY_EXT = 0x8079;
    public static final int GL_VERTEX_ARRAY_SIZE_EXT = 0x807A;
    public static final int GL_VERTEX_ARRAY_TYPE_EXT = 0x807B;
    public static final int GL_VERTEX_ARRAY_STRIDE_EXT = 0x807C;
    public static final int GL_VERTEX_ARRAY_COUNT_EXT = 0x807D;
    public static final int GL_NORMAL_ARRAY_TYPE_EXT = 0x807E;
    public static final int GL_NORMAL_ARRAY_STRIDE_EXT = 0x807F;
    public static final int GL_NORMAL_ARRAY_COUNT_EXT = 0x8080;
    public static final int GL_COLOR_ARRAY_SIZE_EXT = 0x8081;
    public static final int GL_COLOR_ARRAY_TYPE_EXT = 0x8082;
    public static final int GL_COLOR_ARRAY_STRIDE_EXT = 0x8083;
    public static final int GL_COLOR_ARRAY_COUNT_EXT = 0x8084;
    public static final int GL_INDEX_ARRAY_TYPE_EXT = 0x8085;
    public static final int GL_INDEX_ARRAY_STRIDE_EXT = 0x8086;
    public static final int GL_INDEX_ARRAY_COUNT_EXT = 0x8087;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE_EXT = 0x8088;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE_EXT = 0x8089;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE_EXT = 0x808A;
    public static final int GL_TEXTURE_COORD_ARRAY_COUNT_EXT = 0x808B;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE_EXT = 0x808C;
    public static final int GL_EDGE_FLAG_ARRAY_COUNT_EXT = 0x808D;
    public static final int GL_VERTEX_ARRAY_POINTER_EXT = 0x808E;
    public static final int GL_NORMAL_ARRAY_POINTER_EXT = 0x808F;
    public static final int GL_COLOR_ARRAY_POINTER_EXT = 0x8090;
    public static final int GL_INDEX_ARRAY_POINTER_EXT = 0x8091;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER_EXT = 0x8092;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER_EXT = 0x8093;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glArrayElementEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glColorPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDrawArraysEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glEdgeFlagPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPointervEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIndexPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glNormalPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoordPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glArrayElementEXT;
        public final MemorySegment PFN_glColorPointerEXT;
        public final MemorySegment PFN_glDrawArraysEXT;
        public final MemorySegment PFN_glEdgeFlagPointerEXT;
        public final MemorySegment PFN_glGetPointervEXT;
        public final MemorySegment PFN_glIndexPointerEXT;
        public final MemorySegment PFN_glNormalPointerEXT;
        public final MemorySegment PFN_glTexCoordPointerEXT;
        public final MemorySegment PFN_glVertexPointerEXT;
        private Handles(GLLoadFunc func) {
            PFN_glArrayElementEXT = func.invoke("glArrayElementEXT", "glArrayElement");
            PFN_glColorPointerEXT = func.invoke("glColorPointerEXT");
            PFN_glDrawArraysEXT = func.invoke("glDrawArraysEXT", "glDrawArrays");
            PFN_glEdgeFlagPointerEXT = func.invoke("glEdgeFlagPointerEXT");
            PFN_glGetPointervEXT = func.invoke("glGetPointervEXT", "glGetPointerv");
            PFN_glIndexPointerEXT = func.invoke("glIndexPointerEXT");
            PFN_glNormalPointerEXT = func.invoke("glNormalPointerEXT");
            PFN_glTexCoordPointerEXT = func.invoke("glTexCoordPointerEXT");
            PFN_glVertexPointerEXT = func.invoke("glVertexPointerEXT");
        }
    }

    public GLEXTVertexArray(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glArrayElementEXT`.
    /// ```
    /// void glArrayElementEXT((int) GLint i);
    /// ```
    public void ArrayElementEXT(int i) {
        if (MemoryUtil.isNullPointer(handles.PFN_glArrayElementEXT)) throw new GLSymbolNotFoundError("Symbol not found: glArrayElementEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glArrayElementEXT", i); }
        Handles.MH_glArrayElementEXT.get().invokeExact(handles.PFN_glArrayElementEXT, i); }
        catch (Throwable e) { throw new RuntimeException("error in ArrayElementEXT", e); }
    }

    /// Invokes `glColorPointerEXT`.
    /// ```
    /// void glColorPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void ColorPointerEXT(int size, int type, int stride, int count, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glColorPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorPointerEXT", size, type, stride, count, pointer); }
        Handles.MH_glColorPointerEXT.get().invokeExact(handles.PFN_glColorPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in ColorPointerEXT", e); }
    }

    /// Invokes `glDrawArraysEXT`.
    /// ```
    /// void glDrawArraysEXT((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count);
    /// ```
    public void DrawArraysEXT(int mode, int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDrawArraysEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawArraysEXT", mode, first, count); }
        Handles.MH_glDrawArraysEXT.get().invokeExact(handles.PFN_glDrawArraysEXT, mode, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysEXT", e); }
    }

    /// Invokes `glEdgeFlagPointerEXT`.
    /// ```
    /// void glEdgeFlagPointerEXT((int) GLsizei stride, (int) GLsizei count, const GLboolean* pointer);
    /// ```
    public void EdgeFlagPointerEXT(int stride, int count, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEdgeFlagPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEdgeFlagPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEdgeFlagPointerEXT", stride, count, pointer); }
        Handles.MH_glEdgeFlagPointerEXT.get().invokeExact(handles.PFN_glEdgeFlagPointerEXT, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in EdgeFlagPointerEXT", e); }
    }

    /// Invokes `glGetPointervEXT`.
    /// ```
    /// void glGetPointervEXT((unsigned int) GLenum pname, void** params);
    /// ```
    public void GetPointervEXT(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointervEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetPointervEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPointervEXT", pname, params); }
        Handles.MH_glGetPointervEXT.get().invokeExact(handles.PFN_glGetPointervEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointervEXT", e); }
    }

    /// Invokes `glIndexPointerEXT`.
    /// ```
    /// void glIndexPointerEXT((unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void IndexPointerEXT(int type, int stride, int count, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIndexPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIndexPointerEXT", type, stride, count, pointer); }
        Handles.MH_glIndexPointerEXT.get().invokeExact(handles.PFN_glIndexPointerEXT, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in IndexPointerEXT", e); }
    }

    /// Invokes `glNormalPointerEXT`.
    /// ```
    /// void glNormalPointerEXT((unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void NormalPointerEXT(int type, int stride, int count, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNormalPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalPointerEXT", type, stride, count, pointer); }
        Handles.MH_glNormalPointerEXT.get().invokeExact(handles.PFN_glNormalPointerEXT, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in NormalPointerEXT", e); }
    }

    /// Invokes `glTexCoordPointerEXT`.
    /// ```
    /// void glTexCoordPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void TexCoordPointerEXT(int size, int type, int stride, int count, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordPointerEXT", size, type, stride, count, pointer); }
        Handles.MH_glTexCoordPointerEXT.get().invokeExact(handles.PFN_glTexCoordPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordPointerEXT", e); }
    }

    /// Invokes `glVertexPointerEXT`.
    /// ```
    /// void glVertexPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, (int) GLsizei count, const void* pointer);
    /// ```
    public void VertexPointerEXT(int size, int type, int stride, int count, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexPointerEXT", size, type, stride, count, pointer); }
        Handles.MH_glVertexPointerEXT.get().invokeExact(handles.PFN_glVertexPointerEXT, size, type, stride, count, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexPointerEXT", e); }
    }

}
