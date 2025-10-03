// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_fog_function`
public final class GLSGISFogFunction {
    public static final int GL_FOG_FUNC_SGIS = 0x812A;
    public static final int GL_FOG_FUNC_POINTS_SGIS = 0x812B;
    public static final int GL_MAX_FOG_FUNC_POINTS_SGIS = 0x812C;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glFogFuncSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetFogFuncSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glFogFuncSGIS;
        public final MemorySegment PFN_glGetFogFuncSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glFogFuncSGIS = func.invoke("glFogFuncSGIS");
            PFN_glGetFogFuncSGIS = func.invoke("glGetFogFuncSGIS");
        }
    }

    public GLSGISFogFunction(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFogFuncSGIS`.
    /// ```
    /// void glFogFuncSGIS((int) GLsizei n, const GLfloat* points);
    /// ```
    public void FogFuncSGIS(int n, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glFogFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogFuncSGIS", n, points); }
        Handles.MH_glFogFuncSGIS.get().invokeExact(handles.PFN_glFogFuncSGIS, n, points); }
        catch (Throwable e) { throw new RuntimeException("error in FogFuncSGIS", e); }
    }

    /// Invokes `glGetFogFuncSGIS`.
    /// ```
    /// void glGetFogFuncSGIS(GLfloat* points);
    /// ```
    public void GetFogFuncSGIS(@NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFogFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glGetFogFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFogFuncSGIS", points); }
        Handles.MH_glGetFogFuncSGIS.get().invokeExact(handles.PFN_glGetFogFuncSGIS, points); }
        catch (Throwable e) { throw new RuntimeException("error in GetFogFuncSGIS", e); }
    }

}
