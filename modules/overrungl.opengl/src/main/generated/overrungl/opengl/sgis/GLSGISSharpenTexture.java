// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_sharpen_texture`
public final class GLSGISSharpenTexture {
    public static final int GL_LINEAR_SHARPEN_SGIS = 0x80AD;
    public static final int GL_LINEAR_SHARPEN_ALPHA_SGIS = 0x80AE;
    public static final int GL_LINEAR_SHARPEN_COLOR_SGIS = 0x80AF;
    public static final int GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS = 0x80B0;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glSharpenTexFuncSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetSharpenTexFuncSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glSharpenTexFuncSGIS;
        public final MemorySegment PFN_glGetSharpenTexFuncSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glSharpenTexFuncSGIS = func.invoke("glSharpenTexFuncSGIS");
            PFN_glGetSharpenTexFuncSGIS = func.invoke("glGetSharpenTexFuncSGIS");
        }
    }

    public GLSGISSharpenTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSharpenTexFuncSGIS`.
    /// ```
    /// void glSharpenTexFuncSGIS((unsigned int) GLenum target, (int) GLsizei n, const GLfloat* points);
    /// ```
    public void SharpenTexFuncSGIS(int target, int n, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSharpenTexFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glSharpenTexFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSharpenTexFuncSGIS", target, n, points); }
        Handles.MH_glSharpenTexFuncSGIS.get().invokeExact(handles.PFN_glSharpenTexFuncSGIS, target, n, points); }
        catch (Throwable e) { throw new RuntimeException("error in SharpenTexFuncSGIS", e); }
    }

    /// Invokes `glGetSharpenTexFuncSGIS`.
    /// ```
    /// void glGetSharpenTexFuncSGIS((unsigned int) GLenum target, GLfloat* points);
    /// ```
    public void GetSharpenTexFuncSGIS(int target, @NonNull MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSharpenTexFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glGetSharpenTexFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSharpenTexFuncSGIS", target, points); }
        Handles.MH_glGetSharpenTexFuncSGIS.get().invokeExact(handles.PFN_glGetSharpenTexFuncSGIS, target, points); }
        catch (Throwable e) { throw new RuntimeException("error in GetSharpenTexFuncSGIS", e); }
    }

}
