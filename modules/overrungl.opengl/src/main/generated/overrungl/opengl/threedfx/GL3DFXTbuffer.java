// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.threedfx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_3DFX_tbuffer`
public final class GL3DFXTbuffer {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTbufferMask3DFX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glTbufferMask3DFX;
        private Handles(GLLoadFunc func) {
            PFN_glTbufferMask3DFX = func.invoke("glTbufferMask3DFX");
        }
    }

    public GL3DFXTbuffer(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTbufferMask3DFX`.
    /// ```
    /// void glTbufferMask3DFX((unsigned int) GLuint mask);
    /// ```
    public void TbufferMask3DFX(int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTbufferMask3DFX)) throw new GLSymbolNotFoundError("Symbol not found: glTbufferMask3DFX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTbufferMask3DFX", mask); }
        Handles.MH_glTbufferMask3DFX.get().invokeExact(handles.PFN_glTbufferMask3DFX, mask); }
        catch (Throwable e) { throw new RuntimeException("error in TbufferMask3DFX", e); }
    }

}
