// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_vertex_program4`
public final class GLNVVertexProgram4 {
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_NV = 0x88FD;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glVertexAttribI1iEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI2iEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI3iEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI4iEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI1uiEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI2uiEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI3uiEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI4uiEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI1ivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI2ivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI3ivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI4ivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI1uivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI2uivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI3uivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI4uivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI4bvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI4svEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI4ubvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribI4usvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribIPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVertexAttribIivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVertexAttribIuivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glVertexAttribI1iEXT;
        public final MemorySegment PFN_glVertexAttribI2iEXT;
        public final MemorySegment PFN_glVertexAttribI3iEXT;
        public final MemorySegment PFN_glVertexAttribI4iEXT;
        public final MemorySegment PFN_glVertexAttribI1uiEXT;
        public final MemorySegment PFN_glVertexAttribI2uiEXT;
        public final MemorySegment PFN_glVertexAttribI3uiEXT;
        public final MemorySegment PFN_glVertexAttribI4uiEXT;
        public final MemorySegment PFN_glVertexAttribI1ivEXT;
        public final MemorySegment PFN_glVertexAttribI2ivEXT;
        public final MemorySegment PFN_glVertexAttribI3ivEXT;
        public final MemorySegment PFN_glVertexAttribI4ivEXT;
        public final MemorySegment PFN_glVertexAttribI1uivEXT;
        public final MemorySegment PFN_glVertexAttribI2uivEXT;
        public final MemorySegment PFN_glVertexAttribI3uivEXT;
        public final MemorySegment PFN_glVertexAttribI4uivEXT;
        public final MemorySegment PFN_glVertexAttribI4bvEXT;
        public final MemorySegment PFN_glVertexAttribI4svEXT;
        public final MemorySegment PFN_glVertexAttribI4ubvEXT;
        public final MemorySegment PFN_glVertexAttribI4usvEXT;
        public final MemorySegment PFN_glVertexAttribIPointerEXT;
        public final MemorySegment PFN_glGetVertexAttribIivEXT;
        public final MemorySegment PFN_glGetVertexAttribIuivEXT;
        private Handles(GLLoadFunc func) {
            PFN_glVertexAttribI1iEXT = func.invoke("glVertexAttribI1iEXT", "glVertexAttribI1i");
            PFN_glVertexAttribI2iEXT = func.invoke("glVertexAttribI2iEXT", "glVertexAttribI2i");
            PFN_glVertexAttribI3iEXT = func.invoke("glVertexAttribI3iEXT", "glVertexAttribI3i");
            PFN_glVertexAttribI4iEXT = func.invoke("glVertexAttribI4iEXT", "glVertexAttribI4i");
            PFN_glVertexAttribI1uiEXT = func.invoke("glVertexAttribI1uiEXT", "glVertexAttribI1ui");
            PFN_glVertexAttribI2uiEXT = func.invoke("glVertexAttribI2uiEXT", "glVertexAttribI2ui");
            PFN_glVertexAttribI3uiEXT = func.invoke("glVertexAttribI3uiEXT", "glVertexAttribI3ui");
            PFN_glVertexAttribI4uiEXT = func.invoke("glVertexAttribI4uiEXT", "glVertexAttribI4ui");
            PFN_glVertexAttribI1ivEXT = func.invoke("glVertexAttribI1ivEXT", "glVertexAttribI1iv");
            PFN_glVertexAttribI2ivEXT = func.invoke("glVertexAttribI2ivEXT", "glVertexAttribI2iv");
            PFN_glVertexAttribI3ivEXT = func.invoke("glVertexAttribI3ivEXT", "glVertexAttribI3iv");
            PFN_glVertexAttribI4ivEXT = func.invoke("glVertexAttribI4ivEXT", "glVertexAttribI4iv");
            PFN_glVertexAttribI1uivEXT = func.invoke("glVertexAttribI1uivEXT", "glVertexAttribI1uiv");
            PFN_glVertexAttribI2uivEXT = func.invoke("glVertexAttribI2uivEXT", "glVertexAttribI2uiv");
            PFN_glVertexAttribI3uivEXT = func.invoke("glVertexAttribI3uivEXT", "glVertexAttribI3uiv");
            PFN_glVertexAttribI4uivEXT = func.invoke("glVertexAttribI4uivEXT", "glVertexAttribI4uiv");
            PFN_glVertexAttribI4bvEXT = func.invoke("glVertexAttribI4bvEXT", "glVertexAttribI4bv");
            PFN_glVertexAttribI4svEXT = func.invoke("glVertexAttribI4svEXT", "glVertexAttribI4sv");
            PFN_glVertexAttribI4ubvEXT = func.invoke("glVertexAttribI4ubvEXT", "glVertexAttribI4ubv");
            PFN_glVertexAttribI4usvEXT = func.invoke("glVertexAttribI4usvEXT", "glVertexAttribI4usv");
            PFN_glVertexAttribIPointerEXT = func.invoke("glVertexAttribIPointerEXT", "glVertexAttribIPointer");
            PFN_glGetVertexAttribIivEXT = func.invoke("glGetVertexAttribIivEXT", "glGetVertexAttribIiv");
            PFN_glGetVertexAttribIuivEXT = func.invoke("glGetVertexAttribIuivEXT", "glGetVertexAttribIuiv");
        }
    }

    public GLNVVertexProgram4(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexAttribI1iEXT`.
    /// ```
    /// void glVertexAttribI1iEXT((unsigned int) GLuint index, (int) GLint x);
    /// ```
    public void VertexAttribI1iEXT(int index, int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI1iEXT", index, x); }
        Handles.MH_glVertexAttribI1iEXT.get().invokeExact(handles.PFN_glVertexAttribI1iEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1iEXT", e); }
    }

    /// Invokes `glVertexAttribI2iEXT`.
    /// ```
    /// void glVertexAttribI2iEXT((unsigned int) GLuint index, (int) GLint x, (int) GLint y);
    /// ```
    public void VertexAttribI2iEXT(int index, int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI2iEXT", index, x, y); }
        Handles.MH_glVertexAttribI2iEXT.get().invokeExact(handles.PFN_glVertexAttribI2iEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2iEXT", e); }
    }

    /// Invokes `glVertexAttribI3iEXT`.
    /// ```
    /// void glVertexAttribI3iEXT((unsigned int) GLuint index, (int) GLint x, (int) GLint y, (int) GLint z);
    /// ```
    public void VertexAttribI3iEXT(int index, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI3iEXT", index, x, y, z); }
        Handles.MH_glVertexAttribI3iEXT.get().invokeExact(handles.PFN_glVertexAttribI3iEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3iEXT", e); }
    }

    /// Invokes `glVertexAttribI4iEXT`.
    /// ```
    /// void glVertexAttribI4iEXT((unsigned int) GLuint index, (int) GLint x, (int) GLint y, (int) GLint z, (int) GLint w);
    /// ```
    public void VertexAttribI4iEXT(int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4iEXT", index, x, y, z, w); }
        Handles.MH_glVertexAttribI4iEXT.get().invokeExact(handles.PFN_glVertexAttribI4iEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4iEXT", e); }
    }

    /// Invokes `glVertexAttribI1uiEXT`.
    /// ```
    /// void glVertexAttribI1uiEXT((unsigned int) GLuint index, (unsigned int) GLuint x);
    /// ```
    public void VertexAttribI1uiEXT(int index, int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI1uiEXT", index, x); }
        Handles.MH_glVertexAttribI1uiEXT.get().invokeExact(handles.PFN_glVertexAttribI1uiEXT, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1uiEXT", e); }
    }

    /// Invokes `glVertexAttribI2uiEXT`.
    /// ```
    /// void glVertexAttribI2uiEXT((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y);
    /// ```
    public void VertexAttribI2uiEXT(int index, int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI2uiEXT", index, x, y); }
        Handles.MH_glVertexAttribI2uiEXT.get().invokeExact(handles.PFN_glVertexAttribI2uiEXT, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2uiEXT", e); }
    }

    /// Invokes `glVertexAttribI3uiEXT`.
    /// ```
    /// void glVertexAttribI3uiEXT((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y, (unsigned int) GLuint z);
    /// ```
    public void VertexAttribI3uiEXT(int index, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI3uiEXT", index, x, y, z); }
        Handles.MH_glVertexAttribI3uiEXT.get().invokeExact(handles.PFN_glVertexAttribI3uiEXT, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3uiEXT", e); }
    }

    /// Invokes `glVertexAttribI4uiEXT`.
    /// ```
    /// void glVertexAttribI4uiEXT((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y, (unsigned int) GLuint z, (unsigned int) GLuint w);
    /// ```
    public void VertexAttribI4uiEXT(int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4uiEXT", index, x, y, z, w); }
        Handles.MH_glVertexAttribI4uiEXT.get().invokeExact(handles.PFN_glVertexAttribI4uiEXT, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4uiEXT", e); }
    }

    /// Invokes `glVertexAttribI1ivEXT`.
    /// ```
    /// void glVertexAttribI1ivEXT((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI1ivEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI1ivEXT", index, v); }
        Handles.MH_glVertexAttribI1ivEXT.get().invokeExact(handles.PFN_glVertexAttribI1ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1ivEXT", e); }
    }

    /// Invokes `glVertexAttribI2ivEXT`.
    /// ```
    /// void glVertexAttribI2ivEXT((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI2ivEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI2ivEXT", index, v); }
        Handles.MH_glVertexAttribI2ivEXT.get().invokeExact(handles.PFN_glVertexAttribI2ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2ivEXT", e); }
    }

    /// Invokes `glVertexAttribI3ivEXT`.
    /// ```
    /// void glVertexAttribI3ivEXT((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI3ivEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI3ivEXT", index, v); }
        Handles.MH_glVertexAttribI3ivEXT.get().invokeExact(handles.PFN_glVertexAttribI3ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3ivEXT", e); }
    }

    /// Invokes `glVertexAttribI4ivEXT`.
    /// ```
    /// void glVertexAttribI4ivEXT((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI4ivEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4ivEXT", index, v); }
        Handles.MH_glVertexAttribI4ivEXT.get().invokeExact(handles.PFN_glVertexAttribI4ivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4ivEXT", e); }
    }

    /// Invokes `glVertexAttribI1uivEXT`.
    /// ```
    /// void glVertexAttribI1uivEXT((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI1uivEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI1uivEXT", index, v); }
        Handles.MH_glVertexAttribI1uivEXT.get().invokeExact(handles.PFN_glVertexAttribI1uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1uivEXT", e); }
    }

    /// Invokes `glVertexAttribI2uivEXT`.
    /// ```
    /// void glVertexAttribI2uivEXT((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI2uivEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI2uivEXT", index, v); }
        Handles.MH_glVertexAttribI2uivEXT.get().invokeExact(handles.PFN_glVertexAttribI2uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2uivEXT", e); }
    }

    /// Invokes `glVertexAttribI3uivEXT`.
    /// ```
    /// void glVertexAttribI3uivEXT((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI3uivEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI3uivEXT", index, v); }
        Handles.MH_glVertexAttribI3uivEXT.get().invokeExact(handles.PFN_glVertexAttribI3uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3uivEXT", e); }
    }

    /// Invokes `glVertexAttribI4uivEXT`.
    /// ```
    /// void glVertexAttribI4uivEXT((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI4uivEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4uivEXT", index, v); }
        Handles.MH_glVertexAttribI4uivEXT.get().invokeExact(handles.PFN_glVertexAttribI4uivEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4uivEXT", e); }
    }

    /// Invokes `glVertexAttribI4bvEXT`.
    /// ```
    /// void glVertexAttribI4bvEXT((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttribI4bvEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4bvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4bvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4bvEXT", index, v); }
        Handles.MH_glVertexAttribI4bvEXT.get().invokeExact(handles.PFN_glVertexAttribI4bvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4bvEXT", e); }
    }

    /// Invokes `glVertexAttribI4svEXT`.
    /// ```
    /// void glVertexAttribI4svEXT((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttribI4svEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4svEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4svEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4svEXT", index, v); }
        Handles.MH_glVertexAttribI4svEXT.get().invokeExact(handles.PFN_glVertexAttribI4svEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4svEXT", e); }
    }

    /// Invokes `glVertexAttribI4ubvEXT`.
    /// ```
    /// void glVertexAttribI4ubvEXT((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttribI4ubvEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4ubvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4ubvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4ubvEXT", index, v); }
        Handles.MH_glVertexAttribI4ubvEXT.get().invokeExact(handles.PFN_glVertexAttribI4ubvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4ubvEXT", e); }
    }

    /// Invokes `glVertexAttribI4usvEXT`.
    /// ```
    /// void glVertexAttribI4usvEXT((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttribI4usvEXT(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4usvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4usvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4usvEXT", index, v); }
        Handles.MH_glVertexAttribI4usvEXT.get().invokeExact(handles.PFN_glVertexAttribI4usvEXT, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4usvEXT", e); }
    }

    /// Invokes `glVertexAttribIPointerEXT`.
    /// ```
    /// void glVertexAttribIPointerEXT((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribIPointerEXT(int index, int size, int type, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribIPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribIPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribIPointerEXT", index, size, type, stride, pointer); }
        Handles.MH_glVertexAttribIPointerEXT.get().invokeExact(handles.PFN_glVertexAttribIPointerEXT, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribIPointerEXT", e); }
    }

    /// Invokes `glGetVertexAttribIivEXT`.
    /// ```
    /// void glGetVertexAttribIivEXT((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribIivEXT(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribIivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribIivEXT", index, pname, params); }
        Handles.MH_glGetVertexAttribIivEXT.get().invokeExact(handles.PFN_glGetVertexAttribIivEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribIivEXT", e); }
    }

    /// Invokes `glGetVertexAttribIuivEXT`.
    /// ```
    /// void glGetVertexAttribIuivEXT((unsigned int) GLuint index, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetVertexAttribIuivEXT(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribIuivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribIuivEXT", index, pname, params); }
        Handles.MH_glGetVertexAttribIuivEXT.get().invokeExact(handles.PFN_glGetVertexAttribIuivEXT, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribIuivEXT", e); }
    }

}
