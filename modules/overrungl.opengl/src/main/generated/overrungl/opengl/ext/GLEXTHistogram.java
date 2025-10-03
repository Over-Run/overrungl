// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_histogram`
public final class GLEXTHistogram {
    public static final int GL_HISTOGRAM_EXT = 0x8024;
    public static final int GL_PROXY_HISTOGRAM_EXT = 0x8025;
    public static final int GL_HISTOGRAM_WIDTH_EXT = 0x8026;
    public static final int GL_HISTOGRAM_FORMAT_EXT = 0x8027;
    public static final int GL_HISTOGRAM_RED_SIZE_EXT = 0x8028;
    public static final int GL_HISTOGRAM_GREEN_SIZE_EXT = 0x8029;
    public static final int GL_HISTOGRAM_BLUE_SIZE_EXT = 0x802A;
    public static final int GL_HISTOGRAM_ALPHA_SIZE_EXT = 0x802B;
    public static final int GL_HISTOGRAM_LUMINANCE_SIZE_EXT = 0x802C;
    public static final int GL_HISTOGRAM_SINK_EXT = 0x802D;
    public static final int GL_MINMAX_EXT = 0x802E;
    public static final int GL_MINMAX_FORMAT_EXT = 0x802F;
    public static final int GL_MINMAX_SINK_EXT = 0x8030;
    public static final int GL_TABLE_TOO_LARGE_EXT = 0x8031;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGetHistogramEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetHistogramParameterfvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetHistogramParameterivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetMinmaxEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetMinmaxParameterfvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetMinmaxParameterivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glHistogramEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glMinmaxEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glResetHistogramEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glResetMinmaxEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glGetHistogramEXT;
        public final MemorySegment PFN_glGetHistogramParameterfvEXT;
        public final MemorySegment PFN_glGetHistogramParameterivEXT;
        public final MemorySegment PFN_glGetMinmaxEXT;
        public final MemorySegment PFN_glGetMinmaxParameterfvEXT;
        public final MemorySegment PFN_glGetMinmaxParameterivEXT;
        public final MemorySegment PFN_glHistogramEXT;
        public final MemorySegment PFN_glMinmaxEXT;
        public final MemorySegment PFN_glResetHistogramEXT;
        public final MemorySegment PFN_glResetMinmaxEXT;
        private Handles(GLLoadFunc func) {
            PFN_glGetHistogramEXT = func.invoke("glGetHistogramEXT");
            PFN_glGetHistogramParameterfvEXT = func.invoke("glGetHistogramParameterfvEXT");
            PFN_glGetHistogramParameterivEXT = func.invoke("glGetHistogramParameterivEXT");
            PFN_glGetMinmaxEXT = func.invoke("glGetMinmaxEXT");
            PFN_glGetMinmaxParameterfvEXT = func.invoke("glGetMinmaxParameterfvEXT");
            PFN_glGetMinmaxParameterivEXT = func.invoke("glGetMinmaxParameterivEXT");
            PFN_glHistogramEXT = func.invoke("glHistogramEXT", "glHistogram");
            PFN_glMinmaxEXT = func.invoke("glMinmaxEXT", "glMinmax");
            PFN_glResetHistogramEXT = func.invoke("glResetHistogramEXT", "glResetHistogram");
            PFN_glResetMinmaxEXT = func.invoke("glResetMinmaxEXT", "glResetMinmax");
        }
    }

    public GLEXTHistogram(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetHistogramEXT`.
    /// ```
    /// void glGetHistogramEXT((unsigned int) GLenum target, GLboolean reset, (unsigned int) GLenum format, (unsigned int) GLenum type, void* values);
    /// ```
    public void GetHistogramEXT(int target, boolean reset, int format, int type, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetHistogramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetHistogramEXT", target, reset, format, type, values); }
        Handles.MH_glGetHistogramEXT.get().invokeExact(handles.PFN_glGetHistogramEXT, target, ((reset) ? (byte)1 : (byte)0), format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramEXT", e); }
    }

    /// Invokes `glGetHistogramParameterfvEXT`.
    /// ```
    /// void glGetHistogramParameterfvEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetHistogramParameterfvEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetHistogramParameterfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetHistogramParameterfvEXT", target, pname, params); }
        Handles.MH_glGetHistogramParameterfvEXT.get().invokeExact(handles.PFN_glGetHistogramParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramParameterfvEXT", e); }
    }

    /// Invokes `glGetHistogramParameterivEXT`.
    /// ```
    /// void glGetHistogramParameterivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetHistogramParameterivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetHistogramParameterivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetHistogramParameterivEXT", target, pname, params); }
        Handles.MH_glGetHistogramParameterivEXT.get().invokeExact(handles.PFN_glGetHistogramParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramParameterivEXT", e); }
    }

    /// Invokes `glGetMinmaxEXT`.
    /// ```
    /// void glGetMinmaxEXT((unsigned int) GLenum target, GLboolean reset, (unsigned int) GLenum format, (unsigned int) GLenum type, void* values);
    /// ```
    public void GetMinmaxEXT(int target, boolean reset, int format, int type, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmaxEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMinmaxEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMinmaxEXT", target, reset, format, type, values); }
        Handles.MH_glGetMinmaxEXT.get().invokeExact(handles.PFN_glGetMinmaxEXT, target, ((reset) ? (byte)1 : (byte)0), format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmaxEXT", e); }
    }

    /// Invokes `glGetMinmaxParameterfvEXT`.
    /// ```
    /// void glGetMinmaxParameterfvEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetMinmaxParameterfvEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmaxParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMinmaxParameterfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMinmaxParameterfvEXT", target, pname, params); }
        Handles.MH_glGetMinmaxParameterfvEXT.get().invokeExact(handles.PFN_glGetMinmaxParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmaxParameterfvEXT", e); }
    }

    /// Invokes `glGetMinmaxParameterivEXT`.
    /// ```
    /// void glGetMinmaxParameterivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMinmaxParameterivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmaxParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMinmaxParameterivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMinmaxParameterivEXT", target, pname, params); }
        Handles.MH_glGetMinmaxParameterivEXT.get().invokeExact(handles.PFN_glGetMinmaxParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmaxParameterivEXT", e); }
    }

    /// Invokes `glHistogramEXT`.
    /// ```
    /// void glHistogramEXT((unsigned int) GLenum target, (int) GLsizei width, (unsigned int) GLenum internalformat, GLboolean sink);
    /// ```
    public void HistogramEXT(int target, int width, int internalformat, boolean sink) {
        if (MemoryUtil.isNullPointer(handles.PFN_glHistogramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glHistogramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glHistogramEXT", target, width, internalformat, sink); }
        Handles.MH_glHistogramEXT.get().invokeExact(handles.PFN_glHistogramEXT, target, width, internalformat, ((sink) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in HistogramEXT", e); }
    }

    /// Invokes `glMinmaxEXT`.
    /// ```
    /// void glMinmaxEXT((unsigned int) GLenum target, (unsigned int) GLenum internalformat, GLboolean sink);
    /// ```
    public void MinmaxEXT(int target, int internalformat, boolean sink) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMinmaxEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMinmaxEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMinmaxEXT", target, internalformat, sink); }
        Handles.MH_glMinmaxEXT.get().invokeExact(handles.PFN_glMinmaxEXT, target, internalformat, ((sink) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in MinmaxEXT", e); }
    }

    /// Invokes `glResetHistogramEXT`.
    /// ```
    /// void glResetHistogramEXT((unsigned int) GLenum target);
    /// ```
    public void ResetHistogramEXT(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glResetHistogramEXT)) throw new GLSymbolNotFoundError("Symbol not found: glResetHistogramEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResetHistogramEXT", target); }
        Handles.MH_glResetHistogramEXT.get().invokeExact(handles.PFN_glResetHistogramEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in ResetHistogramEXT", e); }
    }

    /// Invokes `glResetMinmaxEXT`.
    /// ```
    /// void glResetMinmaxEXT((unsigned int) GLenum target);
    /// ```
    public void ResetMinmaxEXT(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glResetMinmaxEXT)) throw new GLSymbolNotFoundError("Symbol not found: glResetMinmaxEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResetMinmaxEXT", target); }
        Handles.MH_glResetMinmaxEXT.get().invokeExact(handles.PFN_glResetMinmaxEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in ResetMinmaxEXT", e); }
    }

}
