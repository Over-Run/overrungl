// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_point_parameters`
public final class GLEXTPointParameters {
    public static final int GL_POINT_SIZE_MIN_EXT = 0x8126;
    public static final int GL_POINT_SIZE_MAX_EXT = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_EXT = 0x8128;
    public static final int GL_DISTANCE_ATTENUATION_EXT = 0x8129;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glPointParameterfEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glPointParameterfvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glPointParameterfEXT;
        public final MemorySegment PFN_glPointParameterfvEXT;
        private Handles(GLLoadFunc func) {
            PFN_glPointParameterfEXT = func.invoke("glPointParameterfEXT", "glPointParameterf");
            PFN_glPointParameterfvEXT = func.invoke("glPointParameterfvEXT", "glPointParameterfv");
        }
    }

    public GLEXTPointParameters(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPointParameterfEXT`.
    /// ```
    /// void glPointParameterfEXT((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void PointParameterfEXT(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfEXT", pname, param); }
        Handles.MH_glPointParameterfEXT.get().invokeExact(handles.PFN_glPointParameterfEXT, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfEXT", e); }
    }

    /// Invokes `glPointParameterfvEXT`.
    /// ```
    /// void glPointParameterfvEXT((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void PointParameterfvEXT(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfvEXT", pname, params); }
        Handles.MH_glPointParameterfvEXT.get().invokeExact(handles.PFN_glPointParameterfvEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfvEXT", e); }
    }

}
