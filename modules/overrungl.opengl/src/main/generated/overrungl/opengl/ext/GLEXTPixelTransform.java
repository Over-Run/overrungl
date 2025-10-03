// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_pixel_transform`
public final class GLEXTPixelTransform {
    public static final int GL_PIXEL_TRANSFORM_2D_EXT = 0x8330;
    public static final int GL_PIXEL_MAG_FILTER_EXT = 0x8331;
    public static final int GL_PIXEL_MIN_FILTER_EXT = 0x8332;
    public static final int GL_PIXEL_CUBIC_WEIGHT_EXT = 0x8333;
    public static final int GL_CUBIC_EXT = 0x8334;
    public static final int GL_AVERAGE_EXT = 0x8335;
    public static final int GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8336;
    public static final int GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8337;
    public static final int GL_PIXEL_TRANSFORM_2D_MATRIX_EXT = 0x8338;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glPixelTransformParameteriEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glPixelTransformParameterfEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glPixelTransformParameterivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glPixelTransformParameterfvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPixelTransformParameterivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPixelTransformParameterfvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glPixelTransformParameteriEXT;
        public final MemorySegment PFN_glPixelTransformParameterfEXT;
        public final MemorySegment PFN_glPixelTransformParameterivEXT;
        public final MemorySegment PFN_glPixelTransformParameterfvEXT;
        public final MemorySegment PFN_glGetPixelTransformParameterivEXT;
        public final MemorySegment PFN_glGetPixelTransformParameterfvEXT;
        private Handles(GLLoadFunc func) {
            PFN_glPixelTransformParameteriEXT = func.invoke("glPixelTransformParameteriEXT");
            PFN_glPixelTransformParameterfEXT = func.invoke("glPixelTransformParameterfEXT");
            PFN_glPixelTransformParameterivEXT = func.invoke("glPixelTransformParameterivEXT");
            PFN_glPixelTransformParameterfvEXT = func.invoke("glPixelTransformParameterfvEXT");
            PFN_glGetPixelTransformParameterivEXT = func.invoke("glGetPixelTransformParameterivEXT");
            PFN_glGetPixelTransformParameterfvEXT = func.invoke("glGetPixelTransformParameterfvEXT");
        }
    }

    public GLEXTPixelTransform(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPixelTransformParameteriEXT`.
    /// ```
    /// void glPixelTransformParameteriEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void PixelTransformParameteriEXT(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTransformParameteriEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTransformParameteriEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTransformParameteriEXT", target, pname, param); }
        Handles.MH_glPixelTransformParameteriEXT.get().invokeExact(handles.PFN_glPixelTransformParameteriEXT, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTransformParameteriEXT", e); }
    }

    /// Invokes `glPixelTransformParameterfEXT`.
    /// ```
    /// void glPixelTransformParameterfEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void PixelTransformParameterfEXT(int target, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTransformParameterfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTransformParameterfEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTransformParameterfEXT", target, pname, param); }
        Handles.MH_glPixelTransformParameterfEXT.get().invokeExact(handles.PFN_glPixelTransformParameterfEXT, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTransformParameterfEXT", e); }
    }

    /// Invokes `glPixelTransformParameterivEXT`.
    /// ```
    /// void glPixelTransformParameterivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void PixelTransformParameterivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTransformParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTransformParameterivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTransformParameterivEXT", target, pname, params); }
        Handles.MH_glPixelTransformParameterivEXT.get().invokeExact(handles.PFN_glPixelTransformParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTransformParameterivEXT", e); }
    }

    /// Invokes `glPixelTransformParameterfvEXT`.
    /// ```
    /// void glPixelTransformParameterfvEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void PixelTransformParameterfvEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTransformParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTransformParameterfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTransformParameterfvEXT", target, pname, params); }
        Handles.MH_glPixelTransformParameterfvEXT.get().invokeExact(handles.PFN_glPixelTransformParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTransformParameterfvEXT", e); }
    }

    /// Invokes `glGetPixelTransformParameterivEXT`.
    /// ```
    /// void glGetPixelTransformParameterivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetPixelTransformParameterivEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPixelTransformParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetPixelTransformParameterivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPixelTransformParameterivEXT", target, pname, params); }
        Handles.MH_glGetPixelTransformParameterivEXT.get().invokeExact(handles.PFN_glGetPixelTransformParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPixelTransformParameterivEXT", e); }
    }

    /// Invokes `glGetPixelTransformParameterfvEXT`.
    /// ```
    /// void glGetPixelTransformParameterfvEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetPixelTransformParameterfvEXT(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPixelTransformParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetPixelTransformParameterfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPixelTransformParameterfvEXT", target, pname, params); }
        Handles.MH_glGetPixelTransformParameterfvEXT.get().invokeExact(handles.PFN_glGetPixelTransformParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPixelTransformParameterfvEXT", e); }
    }

}
