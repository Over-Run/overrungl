// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgi;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGI_color_table`
public final class GLSGIColorTable {
    public static final int GL_COLOR_TABLE_SGI = 0x80D0;
    public static final int GL_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D1;
    public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D2;
    public static final int GL_PROXY_COLOR_TABLE_SGI = 0x80D3;
    public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D4;
    public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D5;
    public static final int GL_COLOR_TABLE_SCALE_SGI = 0x80D6;
    public static final int GL_COLOR_TABLE_BIAS_SGI = 0x80D7;
    public static final int GL_COLOR_TABLE_FORMAT_SGI = 0x80D8;
    public static final int GL_COLOR_TABLE_WIDTH_SGI = 0x80D9;
    public static final int GL_COLOR_TABLE_RED_SIZE_SGI = 0x80DA;
    public static final int GL_COLOR_TABLE_GREEN_SIZE_SGI = 0x80DB;
    public static final int GL_COLOR_TABLE_BLUE_SIZE_SGI = 0x80DC;
    public static final int GL_COLOR_TABLE_ALPHA_SIZE_SGI = 0x80DD;
    public static final int GL_COLOR_TABLE_LUMINANCE_SIZE_SGI = 0x80DE;
    public static final int GL_COLOR_TABLE_INTENSITY_SIZE_SGI = 0x80DF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glColorTableSGI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorTableParameterfvSGI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorTableParameterivSGI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyColorTableSGI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetColorTableSGI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableParameterfvSGI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetColorTableParameterivSGI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glColorTableSGI;
        public final MemorySegment PFN_glColorTableParameterfvSGI;
        public final MemorySegment PFN_glColorTableParameterivSGI;
        public final MemorySegment PFN_glCopyColorTableSGI;
        public final MemorySegment PFN_glGetColorTableSGI;
        public final MemorySegment PFN_glGetColorTableParameterfvSGI;
        public final MemorySegment PFN_glGetColorTableParameterivSGI;
        private Handles(GLLoadFunc func) {
            PFN_glColorTableSGI = func.invoke("glColorTableSGI", "glColorTable");
            PFN_glColorTableParameterfvSGI = func.invoke("glColorTableParameterfvSGI", "glColorTableParameterfv");
            PFN_glColorTableParameterivSGI = func.invoke("glColorTableParameterivSGI", "glColorTableParameteriv");
            PFN_glCopyColorTableSGI = func.invoke("glCopyColorTableSGI", "glCopyColorTable");
            PFN_glGetColorTableSGI = func.invoke("glGetColorTableSGI");
            PFN_glGetColorTableParameterfvSGI = func.invoke("glGetColorTableParameterfvSGI");
            PFN_glGetColorTableParameterivSGI = func.invoke("glGetColorTableParameterivSGI");
        }
    }

    public GLSGIColorTable(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glColorTableSGI`.
    /// ```
    /// void glColorTableSGI((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* table);
    /// ```
    public void ColorTableSGI(int target, int internalformat, int width, int format, int type, @NonNull MemorySegment table) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorTableSGI)) throw new GLSymbolNotFoundError("Symbol not found: glColorTableSGI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorTableSGI", target, internalformat, width, format, type, table); }
        Handles.MH_glColorTableSGI.invokeExact(handles.PFN_glColorTableSGI, target, internalformat, width, format, type, table); }
        catch (Throwable e) { throw new RuntimeException("error in ColorTableSGI", e); }
    }

    /// Invokes `glColorTableParameterfvSGI`.
    /// ```
    /// void glColorTableParameterfvSGI((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void ColorTableParameterfvSGI(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorTableParameterfvSGI)) throw new GLSymbolNotFoundError("Symbol not found: glColorTableParameterfvSGI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorTableParameterfvSGI", target, pname, params); }
        Handles.MH_glColorTableParameterfvSGI.invokeExact(handles.PFN_glColorTableParameterfvSGI, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ColorTableParameterfvSGI", e); }
    }

    /// Invokes `glColorTableParameterivSGI`.
    /// ```
    /// void glColorTableParameterivSGI((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void ColorTableParameterivSGI(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorTableParameterivSGI)) throw new GLSymbolNotFoundError("Symbol not found: glColorTableParameterivSGI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorTableParameterivSGI", target, pname, params); }
        Handles.MH_glColorTableParameterivSGI.invokeExact(handles.PFN_glColorTableParameterivSGI, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ColorTableParameterivSGI", e); }
    }

    /// Invokes `glCopyColorTableSGI`.
    /// ```
    /// void glCopyColorTableSGI((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyColorTableSGI(int target, int internalformat, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyColorTableSGI)) throw new GLSymbolNotFoundError("Symbol not found: glCopyColorTableSGI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyColorTableSGI", target, internalformat, x, y, width); }
        Handles.MH_glCopyColorTableSGI.invokeExact(handles.PFN_glCopyColorTableSGI, target, internalformat, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyColorTableSGI", e); }
    }

    /// Invokes `glGetColorTableSGI`.
    /// ```
    /// void glGetColorTableSGI((unsigned int) GLenum target, (unsigned int) GLenum format, (unsigned int) GLenum type, void* table);
    /// ```
    public void GetColorTableSGI(int target, int format, int type, @NonNull MemorySegment table) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableSGI)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTableSGI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTableSGI", target, format, type, table); }
        Handles.MH_glGetColorTableSGI.invokeExact(handles.PFN_glGetColorTableSGI, target, format, type, table); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableSGI", e); }
    }

    /// Invokes `glGetColorTableParameterfvSGI`.
    /// ```
    /// void glGetColorTableParameterfvSGI((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetColorTableParameterfvSGI(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableParameterfvSGI)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTableParameterfvSGI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTableParameterfvSGI", target, pname, params); }
        Handles.MH_glGetColorTableParameterfvSGI.invokeExact(handles.PFN_glGetColorTableParameterfvSGI, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableParameterfvSGI", e); }
    }

    /// Invokes `glGetColorTableParameterivSGI`.
    /// ```
    /// void glGetColorTableParameterivSGI((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetColorTableParameterivSGI(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetColorTableParameterivSGI)) throw new GLSymbolNotFoundError("Symbol not found: glGetColorTableParameterivSGI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetColorTableParameterivSGI", target, pname, params); }
        Handles.MH_glGetColorTableParameterivSGI.invokeExact(handles.PFN_glGetColorTableParameterivSGI, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetColorTableParameterivSGI", e); }
    }

}
