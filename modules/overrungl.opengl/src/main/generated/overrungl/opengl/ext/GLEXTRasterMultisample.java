// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_raster_multisample`
public final class GLEXTRasterMultisample {
    public static final int GL_RASTER_MULTISAMPLE_EXT = 0x9327;
    public static final int GL_RASTER_SAMPLES_EXT = 0x9328;
    public static final int GL_MAX_RASTER_SAMPLES_EXT = 0x9329;
    public static final int GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT = 0x932A;
    public static final int GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B;
    public static final int GL_EFFECTIVE_RASTER_SAMPLES_EXT = 0x932C;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glRasterSamplesEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)));
        public final MemorySegment PFN_glRasterSamplesEXT;
        private Handles(GLLoadFunc func) {
            PFN_glRasterSamplesEXT = func.invoke("glRasterSamplesEXT");
        }
    }

    public GLEXTRasterMultisample(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glRasterSamplesEXT`.
    /// ```
    /// void glRasterSamplesEXT((unsigned int) GLuint samples, GLboolean fixedsamplelocations);
    /// ```
    public void RasterSamplesEXT(int samples, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterSamplesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glRasterSamplesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRasterSamplesEXT", samples, fixedsamplelocations); }
        Handles.MH_glRasterSamplesEXT.get().invokeExact(handles.PFN_glRasterSamplesEXT, samples, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in RasterSamplesEXT", e); }
    }

}
