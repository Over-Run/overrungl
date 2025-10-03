// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_texture_filter4`
public final class GLSGISTextureFilter4 {
    public static final int GL_FILTER4_SGIS = 0x8146;
    public static final int GL_TEXTURE_FILTER4_SIZE_SGIS = 0x8147;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetTexFilterFuncSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexFilterFuncSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetTexFilterFuncSGIS;
        public final MemorySegment PFN_glTexFilterFuncSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glGetTexFilterFuncSGIS = func.invoke("glGetTexFilterFuncSGIS");
            PFN_glTexFilterFuncSGIS = func.invoke("glTexFilterFuncSGIS");
        }
    }

    public GLSGISTextureFilter4(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetTexFilterFuncSGIS`.
    /// ```
    /// void glGetTexFilterFuncSGIS((unsigned int) GLenum target, (unsigned int) GLenum filter, GLfloat* weights);
    /// ```
    public void GetTexFilterFuncSGIS(int target, int filter, @NonNull MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexFilterFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexFilterFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexFilterFuncSGIS", target, filter, weights); }
        Handles.MH_glGetTexFilterFuncSGIS.invokeExact(handles.PFN_glGetTexFilterFuncSGIS, target, filter, weights); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexFilterFuncSGIS", e); }
    }

    /// Invokes `glTexFilterFuncSGIS`.
    /// ```
    /// void glTexFilterFuncSGIS((unsigned int) GLenum target, (unsigned int) GLenum filter, (int) GLsizei n, const GLfloat* weights);
    /// ```
    public void TexFilterFuncSGIS(int target, int filter, int n, @NonNull MemorySegment weights) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexFilterFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glTexFilterFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexFilterFuncSGIS", target, filter, n, weights); }
        Handles.MH_glTexFilterFuncSGIS.invokeExact(handles.PFN_glTexFilterFuncSGIS, target, filter, n, weights); }
        catch (Throwable e) { throw new RuntimeException("error in TexFilterFuncSGIS", e); }
    }

}
