// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_pixel_texture`
public final class GLSGIXPixelTexture {
    public static final int GL_PIXEL_TEX_GEN_SGIX = 0x8139;
    public static final int GL_PIXEL_TEX_GEN_MODE_SGIX = 0x832B;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glPixelTexGenSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glPixelTexGenSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glPixelTexGenSGIX = func.invoke("glPixelTexGenSGIX");
        }
    }

    public GLSGIXPixelTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPixelTexGenSGIX`.
    /// ```
    /// void glPixelTexGenSGIX((unsigned int) GLenum mode);
    /// ```
    public void PixelTexGenSGIX(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTexGenSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTexGenSGIX", mode); }
        Handles.MH_glPixelTexGenSGIX.get().invokeExact(handles.PFN_glPixelTexGenSGIX, mode); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenSGIX", e); }
    }

}
