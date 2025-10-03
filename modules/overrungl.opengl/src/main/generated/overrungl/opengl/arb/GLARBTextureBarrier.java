// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_texture_barrier`
public final class GLARBTextureBarrier {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTextureBarrier = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glTextureBarrier;
        private Handles(GLLoadFunc func) {
            PFN_glTextureBarrier = func.invoke("glTextureBarrier");
        }
    }

    public GLARBTextureBarrier(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTextureBarrier`.
    /// ```
    /// void glTextureBarrier();
    /// ```
    public void TextureBarrier() {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBarrier)) throw new GLSymbolNotFoundError("Symbol not found: glTextureBarrier");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureBarrier"); }
        Handles.MH_glTextureBarrier.get().invokeExact(handles.PFN_glTextureBarrier); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBarrier", e); }
    }

}
