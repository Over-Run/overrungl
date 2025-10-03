// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sunx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SUNX_constant_data`
public final class GLSUNXConstantData {
    public static final int GL_UNPACK_CONSTANT_DATA_SUNX = 0x81D5;
    public static final int GL_TEXTURE_CONSTANT_DATA_SUNX = 0x81D6;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glFinishTextureSUNX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glFinishTextureSUNX;
        private Handles(GLLoadFunc func) {
            PFN_glFinishTextureSUNX = func.invoke("glFinishTextureSUNX");
        }
    }

    public GLSUNXConstantData(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFinishTextureSUNX`.
    /// ```
    /// void glFinishTextureSUNX();
    /// ```
    public void FinishTextureSUNX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishTextureSUNX)) throw new GLSymbolNotFoundError("Symbol not found: glFinishTextureSUNX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinishTextureSUNX"); }
        Handles.MH_glFinishTextureSUNX.get().invokeExact(handles.PFN_glFinishTextureSUNX); }
        catch (Throwable e) { throw new RuntimeException("error in FinishTextureSUNX", e); }
    }

}
