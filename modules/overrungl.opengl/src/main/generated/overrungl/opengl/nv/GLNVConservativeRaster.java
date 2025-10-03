// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_conservative_raster`
public final class GLNVConservativeRaster {
    public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 0x9346;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV = 0x9347;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV = 0x9348;
    public static final int GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 0x9349;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSubpixelPrecisionBiasNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glSubpixelPrecisionBiasNV;
        private Handles(GLLoadFunc func) {
            PFN_glSubpixelPrecisionBiasNV = func.invoke("glSubpixelPrecisionBiasNV");
        }
    }

    public GLNVConservativeRaster(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSubpixelPrecisionBiasNV`.
    /// ```
    /// void glSubpixelPrecisionBiasNV((unsigned int) GLuint xbits, (unsigned int) GLuint ybits);
    /// ```
    public void SubpixelPrecisionBiasNV(int xbits, int ybits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSubpixelPrecisionBiasNV)) throw new GLSymbolNotFoundError("Symbol not found: glSubpixelPrecisionBiasNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSubpixelPrecisionBiasNV", xbits, ybits); }
        Handles.MH_glSubpixelPrecisionBiasNV.invokeExact(handles.PFN_glSubpixelPrecisionBiasNV, xbits, ybits); }
        catch (Throwable e) { throw new RuntimeException("error in SubpixelPrecisionBiasNV", e); }
    }

}
