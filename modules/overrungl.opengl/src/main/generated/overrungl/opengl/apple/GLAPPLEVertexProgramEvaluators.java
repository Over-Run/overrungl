// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.apple;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_APPLE_vertex_program_evaluators`
public final class GLAPPLEVertexProgramEvaluators {
    public static final int GL_VERTEX_ATTRIB_MAP1_APPLE = 0x8A00;
    public static final int GL_VERTEX_ATTRIB_MAP2_APPLE = 0x8A01;
    public static final int GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE = 0x8A02;
    public static final int GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE = 0x8A03;
    public static final int GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE = 0x8A04;
    public static final int GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = 0x8A05;
    public static final int GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE = 0x8A06;
    public static final int GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE = 0x8A07;
    public static final int GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE = 0x8A08;
    public static final int GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = 0x8A09;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glEnableVertexAttribAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDisableVertexAttribAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glIsVertexAttribEnabledAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glMapVertexAttrib1dAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMapVertexAttrib1fAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMapVertexAttrib2dAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMapVertexAttrib2fAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glEnableVertexAttribAPPLE;
        public final MemorySegment PFN_glDisableVertexAttribAPPLE;
        public final MemorySegment PFN_glIsVertexAttribEnabledAPPLE;
        public final MemorySegment PFN_glMapVertexAttrib1dAPPLE;
        public final MemorySegment PFN_glMapVertexAttrib1fAPPLE;
        public final MemorySegment PFN_glMapVertexAttrib2dAPPLE;
        public final MemorySegment PFN_glMapVertexAttrib2fAPPLE;
        private Handles(GLLoadFunc func) {
            PFN_glEnableVertexAttribAPPLE = func.invoke("glEnableVertexAttribAPPLE");
            PFN_glDisableVertexAttribAPPLE = func.invoke("glDisableVertexAttribAPPLE");
            PFN_glIsVertexAttribEnabledAPPLE = func.invoke("glIsVertexAttribEnabledAPPLE");
            PFN_glMapVertexAttrib1dAPPLE = func.invoke("glMapVertexAttrib1dAPPLE");
            PFN_glMapVertexAttrib1fAPPLE = func.invoke("glMapVertexAttrib1fAPPLE");
            PFN_glMapVertexAttrib2dAPPLE = func.invoke("glMapVertexAttrib2dAPPLE");
            PFN_glMapVertexAttrib2fAPPLE = func.invoke("glMapVertexAttrib2fAPPLE");
        }
    }

    public GLAPPLEVertexProgramEvaluators(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glEnableVertexAttribAPPLE`.
    /// ```
    /// void glEnableVertexAttribAPPLE((unsigned int) GLuint index, (unsigned int) GLenum pname);
    /// ```
    public void EnableVertexAttribAPPLE(int index, int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexAttribAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVertexAttribAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnableVertexAttribAPPLE", index, pname); }
        Handles.MH_glEnableVertexAttribAPPLE.get().invokeExact(handles.PFN_glEnableVertexAttribAPPLE, index, pname); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexAttribAPPLE", e); }
    }

    /// Invokes `glDisableVertexAttribAPPLE`.
    /// ```
    /// void glDisableVertexAttribAPPLE((unsigned int) GLuint index, (unsigned int) GLenum pname);
    /// ```
    public void DisableVertexAttribAPPLE(int index, int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexAttribAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVertexAttribAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisableVertexAttribAPPLE", index, pname); }
        Handles.MH_glDisableVertexAttribAPPLE.get().invokeExact(handles.PFN_glDisableVertexAttribAPPLE, index, pname); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexAttribAPPLE", e); }
    }

    /// Invokes `glIsVertexAttribEnabledAPPLE`.
    /// ```
    /// GLboolean glIsVertexAttribEnabledAPPLE((unsigned int) GLuint index, (unsigned int) GLenum pname);
    /// ```
    public boolean IsVertexAttribEnabledAPPLE(int index, int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsVertexAttribEnabledAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glIsVertexAttribEnabledAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsVertexAttribEnabledAPPLE", index, pname); }
        return (((byte) Handles.MH_glIsVertexAttribEnabledAPPLE.get().invokeExact(handles.PFN_glIsVertexAttribEnabledAPPLE, index, pname)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsVertexAttribEnabledAPPLE", e); }
    }

    /// Invokes `glMapVertexAttrib1dAPPLE`.
    /// ```
    /// void glMapVertexAttrib1dAPPLE((unsigned int) GLuint index, (unsigned int) GLuint size, (double) GLdouble u1, (double) GLdouble u2, (int) GLint stride, (int) GLint order, const GLdouble* points);
    /// ```
    public void MapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapVertexAttrib1dAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMapVertexAttrib1dAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapVertexAttrib1dAPPLE", index, size, u1, u2, stride, order, points); }
        Handles.MH_glMapVertexAttrib1dAPPLE.get().invokeExact(handles.PFN_glMapVertexAttrib1dAPPLE, index, size, u1, u2, stride, order, points); }
        catch (Throwable e) { throw new RuntimeException("error in MapVertexAttrib1dAPPLE", e); }
    }

    /// Invokes `glMapVertexAttrib1fAPPLE`.
    /// ```
    /// void glMapVertexAttrib1fAPPLE((unsigned int) GLuint index, (unsigned int) GLuint size, ((float) khronos_float_t) GLfloat u1, ((float) khronos_float_t) GLfloat u2, (int) GLint stride, (int) GLint order, const GLfloat* points);
    /// ```
    public void MapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapVertexAttrib1fAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMapVertexAttrib1fAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapVertexAttrib1fAPPLE", index, size, u1, u2, stride, order, points); }
        Handles.MH_glMapVertexAttrib1fAPPLE.get().invokeExact(handles.PFN_glMapVertexAttrib1fAPPLE, index, size, u1, u2, stride, order, points); }
        catch (Throwable e) { throw new RuntimeException("error in MapVertexAttrib1fAPPLE", e); }
    }

    /// Invokes `glMapVertexAttrib2dAPPLE`.
    /// ```
    /// void glMapVertexAttrib2dAPPLE((unsigned int) GLuint index, (unsigned int) GLuint size, (double) GLdouble u1, (double) GLdouble u2, (int) GLint ustride, (int) GLint uorder, (double) GLdouble v1, (double) GLdouble v2, (int) GLint vstride, (int) GLint vorder, const GLdouble* points);
    /// ```
    public void MapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapVertexAttrib2dAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMapVertexAttrib2dAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapVertexAttrib2dAPPLE", index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        Handles.MH_glMapVertexAttrib2dAPPLE.get().invokeExact(handles.PFN_glMapVertexAttrib2dAPPLE, index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        catch (Throwable e) { throw new RuntimeException("error in MapVertexAttrib2dAPPLE", e); }
    }

    /// Invokes `glMapVertexAttrib2fAPPLE`.
    /// ```
    /// void glMapVertexAttrib2fAPPLE((unsigned int) GLuint index, (unsigned int) GLuint size, ((float) khronos_float_t) GLfloat u1, ((float) khronos_float_t) GLfloat u2, (int) GLint ustride, (int) GLint uorder, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, (int) GLint vstride, (int) GLint vorder, const GLfloat* points);
    /// ```
    public void MapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapVertexAttrib2fAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMapVertexAttrib2fAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapVertexAttrib2fAPPLE", index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        Handles.MH_glMapVertexAttrib2fAPPLE.get().invokeExact(handles.PFN_glMapVertexAttrib2fAPPLE, index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        catch (Throwable e) { throw new RuntimeException("error in MapVertexAttrib2fAPPLE", e); }
    }

}
