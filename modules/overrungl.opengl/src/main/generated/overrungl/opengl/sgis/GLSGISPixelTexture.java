// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_pixel_texture`
public final class GLSGISPixelTexture {
    public static final int GL_PIXEL_TEXTURE_SGIS = 0x8353;
    public static final int GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS = 0x8354;
    public static final int GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS = 0x8355;
    public static final int GL_PIXEL_GROUP_COLOR_SGIS = 0x8356;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glPixelTexGenParameteriSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glPixelTexGenParameterivSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glPixelTexGenParameterfSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glPixelTexGenParameterfvSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPixelTexGenParameterivSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPixelTexGenParameterfvSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glPixelTexGenParameteriSGIS;
        public final MemorySegment PFN_glPixelTexGenParameterivSGIS;
        public final MemorySegment PFN_glPixelTexGenParameterfSGIS;
        public final MemorySegment PFN_glPixelTexGenParameterfvSGIS;
        public final MemorySegment PFN_glGetPixelTexGenParameterivSGIS;
        public final MemorySegment PFN_glGetPixelTexGenParameterfvSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glPixelTexGenParameteriSGIS = func.invoke("glPixelTexGenParameteriSGIS");
            PFN_glPixelTexGenParameterivSGIS = func.invoke("glPixelTexGenParameterivSGIS");
            PFN_glPixelTexGenParameterfSGIS = func.invoke("glPixelTexGenParameterfSGIS");
            PFN_glPixelTexGenParameterfvSGIS = func.invoke("glPixelTexGenParameterfvSGIS");
            PFN_glGetPixelTexGenParameterivSGIS = func.invoke("glGetPixelTexGenParameterivSGIS");
            PFN_glGetPixelTexGenParameterfvSGIS = func.invoke("glGetPixelTexGenParameterfvSGIS");
        }
    }

    public GLSGISPixelTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPixelTexGenParameteriSGIS`.
    /// ```
    /// void glPixelTexGenParameteriSGIS((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void PixelTexGenParameteriSGIS(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenParameteriSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTexGenParameteriSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTexGenParameteriSGIS", pname, param); }
        Handles.MH_glPixelTexGenParameteriSGIS.get().invokeExact(handles.PFN_glPixelTexGenParameteriSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenParameteriSGIS", e); }
    }

    /// Invokes `glPixelTexGenParameterivSGIS`.
    /// ```
    /// void glPixelTexGenParameterivSGIS((unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void PixelTexGenParameterivSGIS(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenParameterivSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTexGenParameterivSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTexGenParameterivSGIS", pname, params); }
        Handles.MH_glPixelTexGenParameterivSGIS.get().invokeExact(handles.PFN_glPixelTexGenParameterivSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenParameterivSGIS", e); }
    }

    /// Invokes `glPixelTexGenParameterfSGIS`.
    /// ```
    /// void glPixelTexGenParameterfSGIS((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void PixelTexGenParameterfSGIS(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenParameterfSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTexGenParameterfSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTexGenParameterfSGIS", pname, param); }
        Handles.MH_glPixelTexGenParameterfSGIS.get().invokeExact(handles.PFN_glPixelTexGenParameterfSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenParameterfSGIS", e); }
    }

    /// Invokes `glPixelTexGenParameterfvSGIS`.
    /// ```
    /// void glPixelTexGenParameterfvSGIS((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void PixelTexGenParameterfvSGIS(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenParameterfvSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTexGenParameterfvSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTexGenParameterfvSGIS", pname, params); }
        Handles.MH_glPixelTexGenParameterfvSGIS.get().invokeExact(handles.PFN_glPixelTexGenParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenParameterfvSGIS", e); }
    }

    /// Invokes `glGetPixelTexGenParameterivSGIS`.
    /// ```
    /// void glGetPixelTexGenParameterivSGIS((unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetPixelTexGenParameterivSGIS(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPixelTexGenParameterivSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glGetPixelTexGenParameterivSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPixelTexGenParameterivSGIS", pname, params); }
        Handles.MH_glGetPixelTexGenParameterivSGIS.get().invokeExact(handles.PFN_glGetPixelTexGenParameterivSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPixelTexGenParameterivSGIS", e); }
    }

    /// Invokes `glGetPixelTexGenParameterfvSGIS`.
    /// ```
    /// void glGetPixelTexGenParameterfvSGIS((unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetPixelTexGenParameterfvSGIS(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPixelTexGenParameterfvSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glGetPixelTexGenParameterfvSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPixelTexGenParameterfvSGIS", pname, params); }
        Handles.MH_glGetPixelTexGenParameterfvSGIS.get().invokeExact(handles.PFN_glGetPixelTexGenParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPixelTexGenParameterfvSGIS", e); }
    }

}
