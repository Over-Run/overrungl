// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ibm;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_IBM_vertex_array_lists`
public final class GLIBMVertexArrayLists {
    public static final int GL_VERTEX_ARRAY_LIST_IBM = 103070;
    public static final int GL_NORMAL_ARRAY_LIST_IBM = 103071;
    public static final int GL_COLOR_ARRAY_LIST_IBM = 103072;
    public static final int GL_INDEX_ARRAY_LIST_IBM = 103073;
    public static final int GL_TEXTURE_COORD_ARRAY_LIST_IBM = 103074;
    public static final int GL_EDGE_FLAG_ARRAY_LIST_IBM = 103075;
    public static final int GL_FOG_COORDINATE_ARRAY_LIST_IBM = 103076;
    public static final int GL_SECONDARY_COLOR_ARRAY_LIST_IBM = 103077;
    public static final int GL_VERTEX_ARRAY_LIST_STRIDE_IBM = 103080;
    public static final int GL_NORMAL_ARRAY_LIST_STRIDE_IBM = 103081;
    public static final int GL_COLOR_ARRAY_LIST_STRIDE_IBM = 103082;
    public static final int GL_INDEX_ARRAY_LIST_STRIDE_IBM = 103083;
    public static final int GL_TEXTURE_COORD_ARRAY_LIST_STRIDE_IBM = 103084;
    public static final int GL_EDGE_FLAG_ARRAY_LIST_STRIDE_IBM = 103085;
    public static final int GL_FOG_COORDINATE_ARRAY_LIST_STRIDE_IBM = 103086;
    public static final int GL_SECONDARY_COLOR_ARRAY_LIST_STRIDE_IBM = 103087;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glColorPointerListIBM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glSecondaryColorPointerListIBM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glEdgeFlagPointerListIBM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glFogCoordPointerListIBM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glIndexPointerListIBM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glNormalPointerListIBM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTexCoordPointerListIBM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexPointerListIBM = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glColorPointerListIBM;
        public final MemorySegment PFN_glSecondaryColorPointerListIBM;
        public final MemorySegment PFN_glEdgeFlagPointerListIBM;
        public final MemorySegment PFN_glFogCoordPointerListIBM;
        public final MemorySegment PFN_glIndexPointerListIBM;
        public final MemorySegment PFN_glNormalPointerListIBM;
        public final MemorySegment PFN_glTexCoordPointerListIBM;
        public final MemorySegment PFN_glVertexPointerListIBM;
        private Handles(GLLoadFunc func) {
            PFN_glColorPointerListIBM = func.invoke("glColorPointerListIBM");
            PFN_glSecondaryColorPointerListIBM = func.invoke("glSecondaryColorPointerListIBM");
            PFN_glEdgeFlagPointerListIBM = func.invoke("glEdgeFlagPointerListIBM");
            PFN_glFogCoordPointerListIBM = func.invoke("glFogCoordPointerListIBM");
            PFN_glIndexPointerListIBM = func.invoke("glIndexPointerListIBM");
            PFN_glNormalPointerListIBM = func.invoke("glNormalPointerListIBM");
            PFN_glTexCoordPointerListIBM = func.invoke("glTexCoordPointerListIBM");
            PFN_glVertexPointerListIBM = func.invoke("glVertexPointerListIBM");
        }
    }

    public GLIBMVertexArrayLists(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glColorPointerListIBM`.
    /// ```
    /// void glColorPointerListIBM((int) GLint size, (unsigned int) GLenum type, (int) GLint stride, const void** pointer, (int) GLint ptrstride);
    /// ```
    public void ColorPointerListIBM(int size, int type, int stride, @NonNull MemorySegment pointer, int ptrstride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorPointerListIBM)) throw new GLSymbolNotFoundError("Symbol not found: glColorPointerListIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorPointerListIBM", size, type, stride, pointer, ptrstride); }
        Handles.MH_glColorPointerListIBM.get().invokeExact(handles.PFN_glColorPointerListIBM, size, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in ColorPointerListIBM", e); }
    }

    /// Invokes `glSecondaryColorPointerListIBM`.
    /// ```
    /// void glSecondaryColorPointerListIBM((int) GLint size, (unsigned int) GLenum type, (int) GLint stride, const void** pointer, (int) GLint ptrstride);
    /// ```
    public void SecondaryColorPointerListIBM(int size, int type, int stride, @NonNull MemorySegment pointer, int ptrstride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColorPointerListIBM)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColorPointerListIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColorPointerListIBM", size, type, stride, pointer, ptrstride); }
        Handles.MH_glSecondaryColorPointerListIBM.get().invokeExact(handles.PFN_glSecondaryColorPointerListIBM, size, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColorPointerListIBM", e); }
    }

    /// Invokes `glEdgeFlagPointerListIBM`.
    /// ```
    /// void glEdgeFlagPointerListIBM((int) GLint stride, const GLboolean** pointer, (int) GLint ptrstride);
    /// ```
    public void EdgeFlagPointerListIBM(int stride, @NonNull MemorySegment pointer, int ptrstride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEdgeFlagPointerListIBM)) throw new GLSymbolNotFoundError("Symbol not found: glEdgeFlagPointerListIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEdgeFlagPointerListIBM", stride, pointer, ptrstride); }
        Handles.MH_glEdgeFlagPointerListIBM.get().invokeExact(handles.PFN_glEdgeFlagPointerListIBM, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in EdgeFlagPointerListIBM", e); }
    }

    /// Invokes `glFogCoordPointerListIBM`.
    /// ```
    /// void glFogCoordPointerListIBM((unsigned int) GLenum type, (int) GLint stride, const void** pointer, (int) GLint ptrstride);
    /// ```
    public void FogCoordPointerListIBM(int type, int stride, @NonNull MemorySegment pointer, int ptrstride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordPointerListIBM)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoordPointerListIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoordPointerListIBM", type, stride, pointer, ptrstride); }
        Handles.MH_glFogCoordPointerListIBM.get().invokeExact(handles.PFN_glFogCoordPointerListIBM, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordPointerListIBM", e); }
    }

    /// Invokes `glIndexPointerListIBM`.
    /// ```
    /// void glIndexPointerListIBM((unsigned int) GLenum type, (int) GLint stride, const void** pointer, (int) GLint ptrstride);
    /// ```
    public void IndexPointerListIBM(int type, int stride, @NonNull MemorySegment pointer, int ptrstride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexPointerListIBM)) throw new GLSymbolNotFoundError("Symbol not found: glIndexPointerListIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIndexPointerListIBM", type, stride, pointer, ptrstride); }
        Handles.MH_glIndexPointerListIBM.get().invokeExact(handles.PFN_glIndexPointerListIBM, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in IndexPointerListIBM", e); }
    }

    /// Invokes `glNormalPointerListIBM`.
    /// ```
    /// void glNormalPointerListIBM((unsigned int) GLenum type, (int) GLint stride, const void** pointer, (int) GLint ptrstride);
    /// ```
    public void NormalPointerListIBM(int type, int stride, @NonNull MemorySegment pointer, int ptrstride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalPointerListIBM)) throw new GLSymbolNotFoundError("Symbol not found: glNormalPointerListIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalPointerListIBM", type, stride, pointer, ptrstride); }
        Handles.MH_glNormalPointerListIBM.get().invokeExact(handles.PFN_glNormalPointerListIBM, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in NormalPointerListIBM", e); }
    }

    /// Invokes `glTexCoordPointerListIBM`.
    /// ```
    /// void glTexCoordPointerListIBM((int) GLint size, (unsigned int) GLenum type, (int) GLint stride, const void** pointer, (int) GLint ptrstride);
    /// ```
    public void TexCoordPointerListIBM(int size, int type, int stride, @NonNull MemorySegment pointer, int ptrstride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordPointerListIBM)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordPointerListIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordPointerListIBM", size, type, stride, pointer, ptrstride); }
        Handles.MH_glTexCoordPointerListIBM.get().invokeExact(handles.PFN_glTexCoordPointerListIBM, size, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordPointerListIBM", e); }
    }

    /// Invokes `glVertexPointerListIBM`.
    /// ```
    /// void glVertexPointerListIBM((int) GLint size, (unsigned int) GLenum type, (int) GLint stride, const void** pointer, (int) GLint ptrstride);
    /// ```
    public void VertexPointerListIBM(int size, int type, int stride, @NonNull MemorySegment pointer, int ptrstride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexPointerListIBM)) throw new GLSymbolNotFoundError("Symbol not found: glVertexPointerListIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexPointerListIBM", size, type, stride, pointer, ptrstride); }
        Handles.MH_glVertexPointerListIBM.get().invokeExact(handles.PFN_glVertexPointerListIBM, size, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in VertexPointerListIBM", e); }
    }

}
