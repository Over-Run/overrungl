// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_query_resource_tag`
public final class GLNVQueryResourceTag {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGenQueryResourceTagNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeleteQueryResourceTagNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glQueryResourceTagNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGenQueryResourceTagNV;
        public final MemorySegment PFN_glDeleteQueryResourceTagNV;
        public final MemorySegment PFN_glQueryResourceTagNV;
        private Handles(GLLoadFunc func) {
            PFN_glGenQueryResourceTagNV = func.invoke("glGenQueryResourceTagNV");
            PFN_glDeleteQueryResourceTagNV = func.invoke("glDeleteQueryResourceTagNV");
            PFN_glQueryResourceTagNV = func.invoke("glQueryResourceTagNV");
        }
    }

    public GLNVQueryResourceTag(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGenQueryResourceTagNV`.
    /// ```
    /// void glGenQueryResourceTagNV((int) GLsizei n, GLint* tagIds);
    /// ```
    public void GenQueryResourceTagNV(int n, @NonNull MemorySegment tagIds) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenQueryResourceTagNV)) throw new GLSymbolNotFoundError("Symbol not found: glGenQueryResourceTagNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenQueryResourceTagNV", n, tagIds); }
        Handles.MH_glGenQueryResourceTagNV.get().invokeExact(handles.PFN_glGenQueryResourceTagNV, n, tagIds); }
        catch (Throwable e) { throw new RuntimeException("error in GenQueryResourceTagNV", e); }
    }

    /// Invokes `glDeleteQueryResourceTagNV`.
    /// ```
    /// void glDeleteQueryResourceTagNV((int) GLsizei n, const GLint* tagIds);
    /// ```
    public void DeleteQueryResourceTagNV(int n, @NonNull MemorySegment tagIds) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteQueryResourceTagNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteQueryResourceTagNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteQueryResourceTagNV", n, tagIds); }
        Handles.MH_glDeleteQueryResourceTagNV.get().invokeExact(handles.PFN_glDeleteQueryResourceTagNV, n, tagIds); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteQueryResourceTagNV", e); }
    }

    /// Invokes `glQueryResourceTagNV`.
    /// ```
    /// void glQueryResourceTagNV((int) GLint tagId, const GLchar* tagString);
    /// ```
    public void QueryResourceTagNV(int tagId, @NonNull MemorySegment tagString) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryResourceTagNV)) throw new GLSymbolNotFoundError("Symbol not found: glQueryResourceTagNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glQueryResourceTagNV", tagId, tagString); }
        Handles.MH_glQueryResourceTagNV.get().invokeExact(handles.PFN_glQueryResourceTagNV, tagId, tagString); }
        catch (Throwable e) { throw new RuntimeException("error in QueryResourceTagNV", e); }
    }

}
