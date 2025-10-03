// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_flush_raster`
public final class GLSGIXFlushRaster {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFlushRasterSGIX = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glFlushRasterSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glFlushRasterSGIX = func.invoke("glFlushRasterSGIX");
        }
    }

    public GLSGIXFlushRaster(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFlushRasterSGIX`.
    /// ```
    /// void glFlushRasterSGIX();
    /// ```
    public void FlushRasterSGIX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushRasterSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glFlushRasterSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFlushRasterSGIX"); }
        Handles.MH_glFlushRasterSGIX.invokeExact(handles.PFN_glFlushRasterSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in FlushRasterSGIX", e); }
    }

}
