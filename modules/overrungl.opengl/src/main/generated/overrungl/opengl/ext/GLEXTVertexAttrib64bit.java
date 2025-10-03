// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_vertex_attrib_64bit`
public final class GLEXTVertexAttrib64bit {
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_DOUBLE_VEC2_EXT = 0x8FFC;
    public static final int GL_DOUBLE_VEC3_EXT = 0x8FFD;
    public static final int GL_DOUBLE_VEC4_EXT = 0x8FFE;
    public static final int GL_DOUBLE_MAT2_EXT = 0x8F46;
    public static final int GL_DOUBLE_MAT3_EXT = 0x8F47;
    public static final int GL_DOUBLE_MAT4_EXT = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3_EXT = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4_EXT = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2_EXT = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4_EXT = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2_EXT = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3_EXT = 0x8F4E;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glVertexAttribL1dEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glVertexAttribL2dEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glVertexAttribL3dEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glVertexAttribL4dEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glVertexAttribL1dvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribL2dvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribL3dvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribL4dvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribLPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVertexAttribLdvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glVertexAttribL1dEXT;
        public final MemorySegment PFN_glVertexAttribL2dEXT;
        public final MemorySegment PFN_glVertexAttribL3dEXT;
        public final MemorySegment PFN_glVertexAttribL4dEXT;
        public final MemorySegment PFN_glVertexAttribL1dvEXT;
        public final MemorySegment PFN_glVertexAttribL2dvEXT;
        public final MemorySegment PFN_glVertexAttribL3dvEXT;
        public final MemorySegment PFN_glVertexAttribL4dvEXT;
        public final MemorySegment PFN_glVertexAttribLPointerEXT;
        public final MemorySegment PFN_glGetVertexAttribLdvEXT;
        private Handles(GLLoadFunc func) {
            PFN_glVertexAttribL1dEXT = func.invoke("glVertexAttribL1dEXT", "glVertexAttribL1d");
            PFN_glVertexAttribL2dEXT = func.invoke("glVertexAttribL2dEXT", "glVertexAttribL2d");
            PFN_glVertexAttribL3dEXT = func.invoke("glVertexAttribL3dEXT", "glVertexAttribL3d");
            PFN_glVertexAttribL4dEXT = func.invoke("glVertexAttribL4dEXT", "glVertexAttribL4d");
            PFN_glVertexAttribL1dvEXT = func.invoke("glVertexAttribL1dvEXT", "glVertexAttribL1dv");
            PFN_glVertexAttribL2dvEXT = func.invoke("glVertexAttribL2dvEXT", "glVertexAttribL2dv");
            PFN_glVertexAttribL3dvEXT = func.invoke("glVertexAttribL3dvEXT", "glVertexAttribL3dv");
            PFN_glVertexAttribL4dvEXT = func.invoke("glVertexAttribL4dvEXT", "glVertexAttribL4dv");
            PFN_glVertexAttribLPointerEXT = func.invoke("glVertexAttribLPointerEXT", "glVertexAttribLPointer");
            PFN_glGetVertexAttribLdvEXT = func.invoke("glGetVertexAttribLdvEXT", "glGetVertexAttribLdv");
        }
    }

    public GLEXTVertexAttrib64bit(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexAttribL1dEXT`.
    /// ```
    /// void glVertexAttribL1dEXT((unsigned int) GLuint index, (double) GLdouble x);
    /// ```
    public void VertexAttribL1dEXT(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1dEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL1dEXT", index, x); }
        Handles.MH_glVertexAttribL1dEXT.get().invokeExact(handles.PFN_glVertexAttribL1dEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1dEXT", e); }
    }

    /// Invokes `glVertexAttribL2dEXT`.
    /// ```
    /// void glVertexAttribL2dEXT((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexAttribL2dEXT(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL2dEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL2dEXT", index, x, y); }
        Handles.MH_glVertexAttribL2dEXT.get().invokeExact(handles.PFN_glVertexAttribL2dEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2dEXT", e); }
    }

    /// Invokes `glVertexAttribL3dEXT`.
    /// ```
    /// void glVertexAttribL3dEXT((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexAttribL3dEXT(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL3dEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL3dEXT", index, x, y, z); }
        Handles.MH_glVertexAttribL3dEXT.get().invokeExact(handles.PFN_glVertexAttribL3dEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3dEXT", e); }
    }

    /// Invokes `glVertexAttribL4dEXT`.
    /// ```
    /// void glVertexAttribL4dEXT((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexAttribL4dEXT(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL4dEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL4dEXT", index, x, y, z, w); }
        Handles.MH_glVertexAttribL4dEXT.get().invokeExact(handles.PFN_glVertexAttribL4dEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4dEXT", e); }
    }

    /// Invokes `glVertexAttribL1dvEXT`.
    /// ```
    /// void glVertexAttribL1dvEXT((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL1dvEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL1dvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL1dvEXT", index, v); }
        Handles.MH_glVertexAttribL1dvEXT.get().invokeExact(handles.PFN_glVertexAttribL1dvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1dvEXT", e); }
    }

    /// Invokes `glVertexAttribL2dvEXT`.
    /// ```
    /// void glVertexAttribL2dvEXT((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL2dvEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL2dvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL2dvEXT", index, v); }
        Handles.MH_glVertexAttribL2dvEXT.get().invokeExact(handles.PFN_glVertexAttribL2dvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2dvEXT", e); }
    }

    /// Invokes `glVertexAttribL3dvEXT`.
    /// ```
    /// void glVertexAttribL3dvEXT((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL3dvEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL3dvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL3dvEXT", index, v); }
        Handles.MH_glVertexAttribL3dvEXT.get().invokeExact(handles.PFN_glVertexAttribL3dvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3dvEXT", e); }
    }

    /// Invokes `glVertexAttribL4dvEXT`.
    /// ```
    /// void glVertexAttribL4dvEXT((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL4dvEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribL4dvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribL4dvEXT", index, v); }
        Handles.MH_glVertexAttribL4dvEXT.get().invokeExact(handles.PFN_glVertexAttribL4dvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4dvEXT", e); }
    }

    /// Invokes `glVertexAttribLPointerEXT`.
    /// ```
    /// void glVertexAttribLPointerEXT((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribLPointerEXT(int index, int size, int type, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribLPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribLPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribLPointerEXT", index, size, type, stride, pointer); }
        Handles.MH_glVertexAttribLPointerEXT.get().invokeExact(handles.PFN_glVertexAttribLPointerEXT, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribLPointerEXT", e); }
    }

    /// Invokes `glGetVertexAttribLdvEXT`.
    /// ```
    /// void glGetVertexAttribLdvEXT((unsigned int) GLuint index, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribLdvEXT(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribLdvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribLdvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribLdvEXT", index, pname, params); }
        Handles.MH_glGetVertexAttribLdvEXT.get().invokeExact(handles.PFN_glGetVertexAttribLdvEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribLdvEXT", e); }
    }

}
