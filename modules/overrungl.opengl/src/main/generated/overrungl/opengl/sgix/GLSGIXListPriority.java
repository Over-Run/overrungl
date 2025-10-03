// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_list_priority`
public final class GLSGIXListPriority {
    public static final int GL_LIST_PRIORITY_SGIX = 0x8182;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGetListParameterfvSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetListParameterivSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glListParameterfSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glListParameterfvSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glListParameteriSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glListParameterivSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGetListParameterfvSGIX;
        public final MemorySegment PFN_glGetListParameterivSGIX;
        public final MemorySegment PFN_glListParameterfSGIX;
        public final MemorySegment PFN_glListParameterfvSGIX;
        public final MemorySegment PFN_glListParameteriSGIX;
        public final MemorySegment PFN_glListParameterivSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glGetListParameterfvSGIX = func.invoke("glGetListParameterfvSGIX");
            PFN_glGetListParameterivSGIX = func.invoke("glGetListParameterivSGIX");
            PFN_glListParameterfSGIX = func.invoke("glListParameterfSGIX");
            PFN_glListParameterfvSGIX = func.invoke("glListParameterfvSGIX");
            PFN_glListParameteriSGIX = func.invoke("glListParameteriSGIX");
            PFN_glListParameterivSGIX = func.invoke("glListParameterivSGIX");
        }
    }

    public GLSGIXListPriority(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetListParameterfvSGIX`.
    /// ```
    /// void glGetListParameterfvSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetListParameterfvSGIX(int list, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetListParameterfvSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glGetListParameterfvSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetListParameterfvSGIX", list, pname, params); }
        Handles.MH_glGetListParameterfvSGIX.get().invokeExact(handles.PFN_glGetListParameterfvSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetListParameterfvSGIX", e); }
    }

    /// Invokes `glGetListParameterivSGIX`.
    /// ```
    /// void glGetListParameterivSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetListParameterivSGIX(int list, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetListParameterivSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glGetListParameterivSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetListParameterivSGIX", list, pname, params); }
        Handles.MH_glGetListParameterivSGIX.get().invokeExact(handles.PFN_glGetListParameterivSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetListParameterivSGIX", e); }
    }

    /// Invokes `glListParameterfSGIX`.
    /// ```
    /// void glListParameterfSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void ListParameterfSGIX(int list, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListParameterfSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glListParameterfSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glListParameterfSGIX", list, pname, param); }
        Handles.MH_glListParameterfSGIX.get().invokeExact(handles.PFN_glListParameterfSGIX, list, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ListParameterfSGIX", e); }
    }

    /// Invokes `glListParameterfvSGIX`.
    /// ```
    /// void glListParameterfvSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void ListParameterfvSGIX(int list, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListParameterfvSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glListParameterfvSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glListParameterfvSGIX", list, pname, params); }
        Handles.MH_glListParameterfvSGIX.get().invokeExact(handles.PFN_glListParameterfvSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ListParameterfvSGIX", e); }
    }

    /// Invokes `glListParameteriSGIX`.
    /// ```
    /// void glListParameteriSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void ListParameteriSGIX(int list, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListParameteriSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glListParameteriSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glListParameteriSGIX", list, pname, param); }
        Handles.MH_glListParameteriSGIX.get().invokeExact(handles.PFN_glListParameteriSGIX, list, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ListParameteriSGIX", e); }
    }

    /// Invokes `glListParameterivSGIX`.
    /// ```
    /// void glListParameterivSGIX((unsigned int) GLuint list, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void ListParameterivSGIX(int list, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListParameterivSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glListParameterivSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glListParameterivSGIX", list, pname, params); }
        Handles.MH_glListParameterivSGIX.get().invokeExact(handles.PFN_glListParameterivSGIX, list, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ListParameterivSGIX", e); }
    }

}
