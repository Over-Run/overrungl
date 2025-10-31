// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_viewport_array`
public final class GLARBViewportArray {
    public static final int GL_SCISSOR_BOX = 0x0C10;
    public static final int GL_VIEWPORT = 0x0BA2;
    public static final int GL_DEPTH_RANGE = 0x0B70;
    public static final int GL_SCISSOR_TEST = 0x0C11;
    public static final int GL_MAX_VIEWPORTS = 0x825B;
    public static final int GL_VIEWPORT_SUBPIXEL_BITS = 0x825C;
    public static final int GL_VIEWPORT_BOUNDS_RANGE = 0x825D;
    public static final int GL_LAYER_PROVOKING_VERTEX = 0x825E;
    public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;
    public static final int GL_UNDEFINED_VERTEX = 0x8260;
    public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX = 0x8E4F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glViewportArrayv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glViewportIndexedf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glViewportIndexedfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glScissorArrayv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glScissorIndexed = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glScissorIndexedv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeArrayv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeIndexed = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glGetFloati_v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDoublei_v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeArraydvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeIndexeddNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public final MemorySegment PFN_glViewportArrayv;
        public final MemorySegment PFN_glViewportIndexedf;
        public final MemorySegment PFN_glViewportIndexedfv;
        public final MemorySegment PFN_glScissorArrayv;
        public final MemorySegment PFN_glScissorIndexed;
        public final MemorySegment PFN_glScissorIndexedv;
        public final MemorySegment PFN_glDepthRangeArrayv;
        public final MemorySegment PFN_glDepthRangeIndexed;
        public final MemorySegment PFN_glGetFloati_v;
        public final MemorySegment PFN_glGetDoublei_v;
        public final MemorySegment PFN_glDepthRangeArraydvNV;
        public final MemorySegment PFN_glDepthRangeIndexeddNV;
        private Handles(GLLoadFunc func) {
            PFN_glViewportArrayv = func.invoke("glViewportArrayv", "glViewportArrayvNV", "glViewportArrayvOES");
            PFN_glViewportIndexedf = func.invoke("glViewportIndexedf", "glViewportIndexedfOES", "glViewportIndexedfNV");
            PFN_glViewportIndexedfv = func.invoke("glViewportIndexedfv", "glViewportIndexedfvOES", "glViewportIndexedfvNV");
            PFN_glScissorArrayv = func.invoke("glScissorArrayv", "glScissorArrayvNV", "glScissorArrayvOES");
            PFN_glScissorIndexed = func.invoke("glScissorIndexed", "glScissorIndexedNV", "glScissorIndexedOES");
            PFN_glScissorIndexedv = func.invoke("glScissorIndexedv", "glScissorIndexedvNV", "glScissorIndexedvOES");
            PFN_glDepthRangeArrayv = func.invoke("glDepthRangeArrayv");
            PFN_glDepthRangeIndexed = func.invoke("glDepthRangeIndexed");
            PFN_glGetFloati_v = func.invoke("glGetFloati_v", "glGetFloatIndexedvEXT", "glGetFloati_vEXT", "glGetFloati_vNV", "glGetFloati_vOES");
            PFN_glGetDoublei_v = func.invoke("glGetDoublei_v", "glGetDoubleIndexedvEXT", "glGetDoublei_vEXT");
            PFN_glDepthRangeArraydvNV = func.invoke("glDepthRangeArraydvNV");
            PFN_glDepthRangeIndexeddNV = func.invoke("glDepthRangeIndexeddNV");
        }
    }

    public GLARBViewportArray(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glViewportArrayv`.
    /// ```
    /// void glViewportArrayv((unsigned int) GLuint first, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void ViewportArrayv(int first, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportArrayv)) throw new GLSymbolNotFoundError("Symbol not found: glViewportArrayv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glViewportArrayv", first, count, v); }
        Handles.MH_glViewportArrayv.invokeExact(handles.PFN_glViewportArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportArrayv", e); }
    }

    /// Invokes `glViewportIndexedf`.
    /// ```
    /// void glViewportIndexedf((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat w, ((float) khronos_float_t) GLfloat h);
    /// ```
    public void ViewportIndexedf(int index, float x, float y, float w, float h) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportIndexedf)) throw new GLSymbolNotFoundError("Symbol not found: glViewportIndexedf");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glViewportIndexedf", index, x, y, w, h); }
        Handles.MH_glViewportIndexedf.invokeExact(handles.PFN_glViewportIndexedf, index, x, y, w, h); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportIndexedf", e); }
    }

    /// Invokes `glViewportIndexedfv`.
    /// ```
    /// void glViewportIndexedfv((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void ViewportIndexedfv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportIndexedfv)) throw new GLSymbolNotFoundError("Symbol not found: glViewportIndexedfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glViewportIndexedfv", index, v); }
        Handles.MH_glViewportIndexedfv.invokeExact(handles.PFN_glViewportIndexedfv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportIndexedfv", e); }
    }

    /// Invokes `glScissorArrayv`.
    /// ```
    /// void glScissorArrayv((unsigned int) GLuint first, (int) GLsizei count, const GLint* v);
    /// ```
    public void ScissorArrayv(int first, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScissorArrayv)) throw new GLSymbolNotFoundError("Symbol not found: glScissorArrayv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glScissorArrayv", first, count, v); }
        Handles.MH_glScissorArrayv.invokeExact(handles.PFN_glScissorArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ScissorArrayv", e); }
    }

    /// Invokes `glScissorIndexed`.
    /// ```
    /// void glScissorIndexed((unsigned int) GLuint index, (int) GLint left, (int) GLint bottom, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void ScissorIndexed(int index, int left, int bottom, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScissorIndexed)) throw new GLSymbolNotFoundError("Symbol not found: glScissorIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glScissorIndexed", index, left, bottom, width, height); }
        Handles.MH_glScissorIndexed.invokeExact(handles.PFN_glScissorIndexed, index, left, bottom, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in ScissorIndexed", e); }
    }

    /// Invokes `glScissorIndexedv`.
    /// ```
    /// void glScissorIndexedv((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void ScissorIndexedv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScissorIndexedv)) throw new GLSymbolNotFoundError("Symbol not found: glScissorIndexedv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glScissorIndexedv", index, v); }
        Handles.MH_glScissorIndexedv.invokeExact(handles.PFN_glScissorIndexedv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in ScissorIndexedv", e); }
    }

    /// Invokes `glDepthRangeArrayv`.
    /// ```
    /// void glDepthRangeArrayv((unsigned int) GLuint first, (int) GLsizei count, const GLdouble* v);
    /// ```
    public void DepthRangeArrayv(int first, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangeArrayv)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangeArrayv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthRangeArrayv", first, count, v); }
        Handles.MH_glDepthRangeArrayv.invokeExact(handles.PFN_glDepthRangeArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangeArrayv", e); }
    }

    /// Invokes `glDepthRangeIndexed`.
    /// ```
    /// void glDepthRangeIndexed((unsigned int) GLuint index, (double) GLdouble n, (double) GLdouble f);
    /// ```
    public void DepthRangeIndexed(int index, double n, double f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangeIndexed)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangeIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthRangeIndexed", index, n, f); }
        Handles.MH_glDepthRangeIndexed.invokeExact(handles.PFN_glDepthRangeIndexed, index, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangeIndexed", e); }
    }

    /// Invokes `glGetFloati_v`.
    /// ```
    /// void glGetFloati_v((unsigned int) GLenum target, (unsigned int) GLuint index, GLfloat* data);
    /// ```
    public void GetFloati_v(int target, int index, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFloati_v)) throw new GLSymbolNotFoundError("Symbol not found: glGetFloati_v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFloati_v", target, index, data); }
        Handles.MH_glGetFloati_v.invokeExact(handles.PFN_glGetFloati_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetFloati_v", e); }
    }

    /// Invokes `glGetDoublei_v`.
    /// ```
    /// void glGetDoublei_v((unsigned int) GLenum target, (unsigned int) GLuint index, GLdouble* data);
    /// ```
    public void GetDoublei_v(int target, int index, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDoublei_v)) throw new GLSymbolNotFoundError("Symbol not found: glGetDoublei_v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetDoublei_v", target, index, data); }
        Handles.MH_glGetDoublei_v.invokeExact(handles.PFN_glGetDoublei_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetDoublei_v", e); }
    }

    /// Invokes `glDepthRangeArraydvNV`.
    /// ```
    /// void glDepthRangeArraydvNV((unsigned int) GLuint first, (int) GLsizei count, const GLdouble* v);
    /// ```
    public void DepthRangeArraydvNV(int first, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangeArraydvNV)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangeArraydvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthRangeArraydvNV", first, count, v); }
        Handles.MH_glDepthRangeArraydvNV.invokeExact(handles.PFN_glDepthRangeArraydvNV, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangeArraydvNV", e); }
    }

    /// Invokes `glDepthRangeIndexeddNV`.
    /// ```
    /// void glDepthRangeIndexeddNV((unsigned int) GLuint index, (double) GLdouble n, (double) GLdouble f);
    /// ```
    public void DepthRangeIndexeddNV(int index, double n, double f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangeIndexeddNV)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangeIndexeddNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthRangeIndexeddNV", index, n, f); }
        Handles.MH_glDepthRangeIndexeddNV.invokeExact(handles.PFN_glDepthRangeIndexeddNV, index, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangeIndexeddNV", e); }
    }

}
