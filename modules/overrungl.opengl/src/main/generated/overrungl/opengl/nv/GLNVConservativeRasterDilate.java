// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_conservative_raster_dilate`
public final class GLNVConservativeRasterDilate {
    public static final int GL_CONSERVATIVE_RASTER_DILATE_NV = 0x9379;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV = 0x937A;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 0x937B;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glConservativeRasterParameterfNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public final MemorySegment PFN_glConservativeRasterParameterfNV;
        private Handles(GLLoadFunc func) {
            PFN_glConservativeRasterParameterfNV = func.invoke("glConservativeRasterParameterfNV");
        }
    }

    public GLNVConservativeRasterDilate(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glConservativeRasterParameterfNV`.
    /// ```
    /// void glConservativeRasterParameterfNV((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat value);
    /// ```
    public void ConservativeRasterParameterfNV(int pname, float value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConservativeRasterParameterfNV)) throw new GLSymbolNotFoundError("Symbol not found: glConservativeRasterParameterfNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConservativeRasterParameterfNV", pname, value); }
        Handles.MH_glConservativeRasterParameterfNV.get().invokeExact(handles.PFN_glConservativeRasterParameterfNV, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in ConservativeRasterParameterfNV", e); }
    }

}
