// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_texture_color_mask`
public final class GLSGISTextureColorMask {
    public static final int GL_TEXTURE_COLOR_WRITEMASK_SGIS = 0x81EF;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTextureColorMaskSGIS = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)));
        public final MemorySegment PFN_glTextureColorMaskSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glTextureColorMaskSGIS = func.invoke("glTextureColorMaskSGIS");
        }
    }

    public GLSGISTextureColorMask(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTextureColorMaskSGIS`.
    /// ```
    /// void glTextureColorMaskSGIS(GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha);
    /// ```
    public void TextureColorMaskSGIS(boolean red, boolean green, boolean blue, boolean alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureColorMaskSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glTextureColorMaskSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureColorMaskSGIS", red, green, blue, alpha); }
        Handles.MH_glTextureColorMaskSGIS.get().invokeExact(handles.PFN_glTextureColorMaskSGIS, ((red) ? (byte)1 : (byte)0), ((green) ? (byte)1 : (byte)0), ((blue) ? (byte)1 : (byte)0), ((alpha) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureColorMaskSGIS", e); }
    }

}
