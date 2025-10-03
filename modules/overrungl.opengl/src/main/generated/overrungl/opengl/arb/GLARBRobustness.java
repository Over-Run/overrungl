// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_robustness`
public final class GLARBRobustness {
    public static final int GL_NO_ERROR = 0;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGetGraphicsResetStatusARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetnTexImageARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReadnPixelsARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnCompressedTexImageARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnUniformfvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnUniformivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnUniformuivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnUniformdvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnMapdvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnMapfvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnMapivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnPixelMapfvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnPixelMapuivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnPixelMapusvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnPolygonStippleARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnColorTableARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnConvolutionFilterARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnSeparableFilterARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnHistogramARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetnMinmaxARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGetGraphicsResetStatusARB;
        public final MemorySegment PFN_glGetnTexImageARB;
        public final MemorySegment PFN_glReadnPixelsARB;
        public final MemorySegment PFN_glGetnCompressedTexImageARB;
        public final MemorySegment PFN_glGetnUniformfvARB;
        public final MemorySegment PFN_glGetnUniformivARB;
        public final MemorySegment PFN_glGetnUniformuivARB;
        public final MemorySegment PFN_glGetnUniformdvARB;
        public final MemorySegment PFN_glGetnMapdvARB;
        public final MemorySegment PFN_glGetnMapfvARB;
        public final MemorySegment PFN_glGetnMapivARB;
        public final MemorySegment PFN_glGetnPixelMapfvARB;
        public final MemorySegment PFN_glGetnPixelMapuivARB;
        public final MemorySegment PFN_glGetnPixelMapusvARB;
        public final MemorySegment PFN_glGetnPolygonStippleARB;
        public final MemorySegment PFN_glGetnColorTableARB;
        public final MemorySegment PFN_glGetnConvolutionFilterARB;
        public final MemorySegment PFN_glGetnSeparableFilterARB;
        public final MemorySegment PFN_glGetnHistogramARB;
        public final MemorySegment PFN_glGetnMinmaxARB;
        private Handles(GLLoadFunc func) {
            PFN_glGetGraphicsResetStatusARB = func.invoke("glGetGraphicsResetStatusARB");
            PFN_glGetnTexImageARB = func.invoke("glGetnTexImageARB");
            PFN_glReadnPixelsARB = func.invoke("glReadnPixelsARB", "glReadnPixels");
            PFN_glGetnCompressedTexImageARB = func.invoke("glGetnCompressedTexImageARB");
            PFN_glGetnUniformfvARB = func.invoke("glGetnUniformfvARB");
            PFN_glGetnUniformivARB = func.invoke("glGetnUniformivARB");
            PFN_glGetnUniformuivARB = func.invoke("glGetnUniformuivARB");
            PFN_glGetnUniformdvARB = func.invoke("glGetnUniformdvARB");PFN_glGetnMapdvARB = func.invoke("glGetnMapdvARB");
            PFN_glGetnMapfvARB = func.invoke("glGetnMapfvARB");
            PFN_glGetnMapivARB = func.invoke("glGetnMapivARB");
            PFN_glGetnPixelMapfvARB = func.invoke("glGetnPixelMapfvARB");
            PFN_glGetnPixelMapuivARB = func.invoke("glGetnPixelMapuivARB");
            PFN_glGetnPixelMapusvARB = func.invoke("glGetnPixelMapusvARB");
            PFN_glGetnPolygonStippleARB = func.invoke("glGetnPolygonStippleARB");
            PFN_glGetnColorTableARB = func.invoke("glGetnColorTableARB");
            PFN_glGetnConvolutionFilterARB = func.invoke("glGetnConvolutionFilterARB");
            PFN_glGetnSeparableFilterARB = func.invoke("glGetnSeparableFilterARB");
            PFN_glGetnHistogramARB = func.invoke("glGetnHistogramARB");
            PFN_glGetnMinmaxARB = func.invoke("glGetnMinmaxARB");
        }
    }

    public GLARBRobustness(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetGraphicsResetStatusARB`.
    /// ```
    /// (unsigned int) GLenum glGetGraphicsResetStatusARB();
    /// ```
    public int GetGraphicsResetStatusARB() {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetGraphicsResetStatusARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetGraphicsResetStatusARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetGraphicsResetStatusARB"); }
        return (int) Handles.MH_glGetGraphicsResetStatusARB.get().invokeExact(handles.PFN_glGetGraphicsResetStatusARB); }
        catch (Throwable e) { throw new RuntimeException("error in GetGraphicsResetStatusARB", e); }
    }

    /// Invokes `glGetnTexImageARB`.
    /// ```
    /// void glGetnTexImageARB((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* img);
    /// ```
    public void GetnTexImageARB(int target, int level, int format, int type, int bufSize, @NonNull MemorySegment img) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnTexImageARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnTexImageARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnTexImageARB", target, level, format, type, bufSize, img); }
        Handles.MH_glGetnTexImageARB.get().invokeExact(handles.PFN_glGetnTexImageARB, target, level, format, type, bufSize, img); }
        catch (Throwable e) { throw new RuntimeException("error in GetnTexImageARB", e); }
    }

    /// Invokes `glReadnPixelsARB`.
    /// ```
    /// void glReadnPixelsARB((int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* data);
    /// ```
    public void ReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReadnPixelsARB)) throw new GLSymbolNotFoundError("Symbol not found: glReadnPixelsARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReadnPixelsARB", x, y, width, height, format, type, bufSize, data); }
        Handles.MH_glReadnPixelsARB.get().invokeExact(handles.PFN_glReadnPixelsARB, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in ReadnPixelsARB", e); }
    }

    /// Invokes `glGetnCompressedTexImageARB`.
    /// ```
    /// void glGetnCompressedTexImageARB((unsigned int) GLenum target, (int) GLint lod, (int) GLsizei bufSize, void* img);
    /// ```
    public void GetnCompressedTexImageARB(int target, int lod, int bufSize, @NonNull MemorySegment img) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnCompressedTexImageARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnCompressedTexImageARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnCompressedTexImageARB", target, lod, bufSize, img); }
        Handles.MH_glGetnCompressedTexImageARB.get().invokeExact(handles.PFN_glGetnCompressedTexImageARB, target, lod, bufSize, img); }
        catch (Throwable e) { throw new RuntimeException("error in GetnCompressedTexImageARB", e); }
    }

    /// Invokes `glGetnUniformfvARB`.
    /// ```
    /// void glGetnUniformfvARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLfloat* params);
    /// ```
    public void GetnUniformfvARB(int program, int location, int bufSize, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformfvARB", program, location, bufSize, params); }
        Handles.MH_glGetnUniformfvARB.get().invokeExact(handles.PFN_glGetnUniformfvARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformfvARB", e); }
    }

    /// Invokes `glGetnUniformivARB`.
    /// ```
    /// void glGetnUniformivARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLint* params);
    /// ```
    public void GetnUniformivARB(int program, int location, int bufSize, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformivARB", program, location, bufSize, params); }
        Handles.MH_glGetnUniformivARB.get().invokeExact(handles.PFN_glGetnUniformivARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformivARB", e); }
    }

    /// Invokes `glGetnUniformuivARB`.
    /// ```
    /// void glGetnUniformuivARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLuint* params);
    /// ```
    public void GetnUniformuivARB(int program, int location, int bufSize, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformuivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformuivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformuivARB", program, location, bufSize, params); }
        Handles.MH_glGetnUniformuivARB.get().invokeExact(handles.PFN_glGetnUniformuivARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformuivARB", e); }
    }

    /// Invokes `glGetnUniformdvARB`.
    /// ```
    /// void glGetnUniformdvARB((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLdouble* params);
    /// ```
    public void GetnUniformdvARB(int program, int location, int bufSize, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformdvARB", program, location, bufSize, params); }
        Handles.MH_glGetnUniformdvARB.get().invokeExact(handles.PFN_glGetnUniformdvARB, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformdvARB", e); }
    }

    /// Invokes `glGetnMapdvARB`.
    /// ```
    /// void glGetnMapdvARB((unsigned int) GLenum target, (unsigned int) GLenum query, (int) GLsizei bufSize, GLdouble* v);
    /// ```
    public void GetnMapdvARB(int target, int query, int bufSize, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnMapdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnMapdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnMapdvARB", target, query, bufSize, v); }
        Handles.MH_glGetnMapdvARB.get().invokeExact(handles.PFN_glGetnMapdvARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetnMapdvARB", e); }
    }

    /// Invokes `glGetnMapfvARB`.
    /// ```
    /// void glGetnMapfvARB((unsigned int) GLenum target, (unsigned int) GLenum query, (int) GLsizei bufSize, GLfloat* v);
    /// ```
    public void GetnMapfvARB(int target, int query, int bufSize, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnMapfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnMapfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnMapfvARB", target, query, bufSize, v); }
        Handles.MH_glGetnMapfvARB.get().invokeExact(handles.PFN_glGetnMapfvARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetnMapfvARB", e); }
    }

    /// Invokes `glGetnMapivARB`.
    /// ```
    /// void glGetnMapivARB((unsigned int) GLenum target, (unsigned int) GLenum query, (int) GLsizei bufSize, GLint* v);
    /// ```
    public void GetnMapivARB(int target, int query, int bufSize, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnMapivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnMapivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnMapivARB", target, query, bufSize, v); }
        Handles.MH_glGetnMapivARB.get().invokeExact(handles.PFN_glGetnMapivARB, target, query, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetnMapivARB", e); }
    }

    /// Invokes `glGetnPixelMapfvARB`.
    /// ```
    /// void glGetnPixelMapfvARB((unsigned int) GLenum map, (int) GLsizei bufSize, GLfloat* values);
    /// ```
    public void GetnPixelMapfvARB(int map, int bufSize, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnPixelMapfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnPixelMapfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnPixelMapfvARB", map, bufSize, values); }
        Handles.MH_glGetnPixelMapfvARB.get().invokeExact(handles.PFN_glGetnPixelMapfvARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnPixelMapfvARB", e); }
    }

    /// Invokes `glGetnPixelMapuivARB`.
    /// ```
    /// void glGetnPixelMapuivARB((unsigned int) GLenum map, (int) GLsizei bufSize, GLuint* values);
    /// ```
    public void GetnPixelMapuivARB(int map, int bufSize, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnPixelMapuivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnPixelMapuivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnPixelMapuivARB", map, bufSize, values); }
        Handles.MH_glGetnPixelMapuivARB.get().invokeExact(handles.PFN_glGetnPixelMapuivARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnPixelMapuivARB", e); }
    }

    /// Invokes `glGetnPixelMapusvARB`.
    /// ```
    /// void glGetnPixelMapusvARB((unsigned int) GLenum map, (int) GLsizei bufSize, GLushort* values);
    /// ```
    public void GetnPixelMapusvARB(int map, int bufSize, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnPixelMapusvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnPixelMapusvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnPixelMapusvARB", map, bufSize, values); }
        Handles.MH_glGetnPixelMapusvARB.get().invokeExact(handles.PFN_glGetnPixelMapusvARB, map, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnPixelMapusvARB", e); }
    }

    /// Invokes `glGetnPolygonStippleARB`.
    /// ```
    /// void glGetnPolygonStippleARB((int) GLsizei bufSize, GLubyte* pattern);
    /// ```
    public void GetnPolygonStippleARB(int bufSize, @NonNull MemorySegment pattern) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnPolygonStippleARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnPolygonStippleARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnPolygonStippleARB", bufSize, pattern); }
        Handles.MH_glGetnPolygonStippleARB.get().invokeExact(handles.PFN_glGetnPolygonStippleARB, bufSize, pattern); }
        catch (Throwable e) { throw new RuntimeException("error in GetnPolygonStippleARB", e); }
    }

    /// Invokes `glGetnColorTableARB`.
    /// ```
    /// void glGetnColorTableARB((unsigned int) GLenum target, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* table);
    /// ```
    public void GetnColorTableARB(int target, int format, int type, int bufSize, @NonNull MemorySegment table) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnColorTableARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnColorTableARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnColorTableARB", target, format, type, bufSize, table); }
        Handles.MH_glGetnColorTableARB.get().invokeExact(handles.PFN_glGetnColorTableARB, target, format, type, bufSize, table); }
        catch (Throwable e) { throw new RuntimeException("error in GetnColorTableARB", e); }
    }

    /// Invokes `glGetnConvolutionFilterARB`.
    /// ```
    /// void glGetnConvolutionFilterARB((unsigned int) GLenum target, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* image);
    /// ```
    public void GetnConvolutionFilterARB(int target, int format, int type, int bufSize, @NonNull MemorySegment image) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnConvolutionFilterARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnConvolutionFilterARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnConvolutionFilterARB", target, format, type, bufSize, image); }
        Handles.MH_glGetnConvolutionFilterARB.get().invokeExact(handles.PFN_glGetnConvolutionFilterARB, target, format, type, bufSize, image); }
        catch (Throwable e) { throw new RuntimeException("error in GetnConvolutionFilterARB", e); }
    }

    /// Invokes `glGetnSeparableFilterARB`.
    /// ```
    /// void glGetnSeparableFilterARB((unsigned int) GLenum target, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei rowBufSize, void* row, (int) GLsizei columnBufSize, void* column, void* span);
    /// ```
    public void GetnSeparableFilterARB(int target, int format, int type, int rowBufSize, @NonNull MemorySegment row, int columnBufSize, @NonNull MemorySegment column, @NonNull MemorySegment span) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnSeparableFilterARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnSeparableFilterARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnSeparableFilterARB", target, format, type, rowBufSize, row, columnBufSize, column, span); }
        Handles.MH_glGetnSeparableFilterARB.get().invokeExact(handles.PFN_glGetnSeparableFilterARB, target, format, type, rowBufSize, row, columnBufSize, column, span); }
        catch (Throwable e) { throw new RuntimeException("error in GetnSeparableFilterARB", e); }
    }

    /// Invokes `glGetnHistogramARB`.
    /// ```
    /// void glGetnHistogramARB((unsigned int) GLenum target, GLboolean reset, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* values);
    /// ```
    public void GetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnHistogramARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnHistogramARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnHistogramARB", target, reset, format, type, bufSize, values); }
        Handles.MH_glGetnHistogramARB.get().invokeExact(handles.PFN_glGetnHistogramARB, target, ((reset) ? (byte)1 : (byte)0), format, type, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnHistogramARB", e); }
    }

    /// Invokes `glGetnMinmaxARB`.
    /// ```
    /// void glGetnMinmaxARB((unsigned int) GLenum target, GLboolean reset, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* values);
    /// ```
    public void GetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnMinmaxARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetnMinmaxARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnMinmaxARB", target, reset, format, type, bufSize, values); }
        Handles.MH_glGetnMinmaxARB.get().invokeExact(handles.PFN_glGetnMinmaxARB, target, ((reset) ? (byte)1 : (byte)0), format, type, bufSize, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetnMinmaxARB", e); }
    }

}
