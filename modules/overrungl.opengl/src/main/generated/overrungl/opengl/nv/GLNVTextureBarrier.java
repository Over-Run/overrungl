// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_texture_barrier`
public final class GLNVTextureBarrier {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTextureBarrierNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glTextureBarrierNV;
        private Handles(GLLoadFunc func) {
            PFN_glTextureBarrierNV = func.invoke("glTextureBarrierNV");
        }
    }

    public GLNVTextureBarrier(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTextureBarrierNV`.
    /// ```
    /// void glTextureBarrierNV();
    /// ```
    public void TextureBarrierNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBarrierNV)) throw new GLSymbolNotFoundError("Symbol not found: glTextureBarrierNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureBarrierNV"); }
        Handles.MH_glTextureBarrierNV.get().invokeExact(handles.PFN_glTextureBarrierNV); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBarrierNV", e); }
    }

}
