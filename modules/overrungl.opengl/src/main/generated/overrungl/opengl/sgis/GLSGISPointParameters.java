// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_point_parameters`
public final class GLSGISPointParameters {
    public static final int GL_POINT_SIZE_MIN_SGIS = 0x8126;
    public static final int GL_POINT_SIZE_MAX_SGIS = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_SGIS = 0x8128;
    public static final int GL_DISTANCE_ATTENUATION_SGIS = 0x8129;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glPointParameterfSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glPointParameterfvSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glPointParameterfSGIS;
        public final MemorySegment PFN_glPointParameterfvSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glPointParameterfSGIS = func.invoke("glPointParameterfSGIS", "glPointParameterf");
            PFN_glPointParameterfvSGIS = func.invoke("glPointParameterfvSGIS", "glPointParameterfv");
        }
    }

    public GLSGISPointParameters(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPointParameterfSGIS`.
    /// ```
    /// void glPointParameterfSGIS((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void PointParameterfSGIS(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfSGIS", pname, param); }
        Handles.MH_glPointParameterfSGIS.get().invokeExact(handles.PFN_glPointParameterfSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfSGIS", e); }
    }

    /// Invokes `glPointParameterfvSGIS`.
    /// ```
    /// void glPointParameterfvSGIS((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void PointParameterfvSGIS(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfvSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfvSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfvSGIS", pname, params); }
        Handles.MH_glPointParameterfvSGIS.get().invokeExact(handles.PFN_glPointParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfvSGIS", e); }
    }

}
