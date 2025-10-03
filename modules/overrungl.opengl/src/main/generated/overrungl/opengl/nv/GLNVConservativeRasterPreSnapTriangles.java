// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_conservative_raster_pre_snap_triangles`
public final class GLNVConservativeRasterPreSnapTriangles {
    public static final int GL_CONSERVATIVE_RASTER_MODE_NV = 0x954D;
    public static final int GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV = 0x954E;
    public static final int GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV = 0x954F;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glConservativeRasterParameteriNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glConservativeRasterParameteriNV;
        private Handles(GLLoadFunc func) {
            PFN_glConservativeRasterParameteriNV = func.invoke("glConservativeRasterParameteriNV");
        }
    }

    public GLNVConservativeRasterPreSnapTriangles(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glConservativeRasterParameteriNV`.
    /// ```
    /// void glConservativeRasterParameteriNV((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void ConservativeRasterParameteriNV(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConservativeRasterParameteriNV)) throw new GLSymbolNotFoundError("Symbol not found: glConservativeRasterParameteriNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConservativeRasterParameteriNV", pname, param); }
        Handles.MH_glConservativeRasterParameteriNV.get().invokeExact(handles.PFN_glConservativeRasterParameteriNV, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ConservativeRasterParameteriNV", e); }
    }

}
