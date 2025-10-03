// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.mesa;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_MESA_resize_buffers`
public final class GLMESAResizeBuffers {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glResizeBuffersMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glResizeBuffersMESA;
        private Handles(GLLoadFunc func) {
            PFN_glResizeBuffersMESA = func.invoke("glResizeBuffersMESA");
        }
    }

    public GLMESAResizeBuffers(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glResizeBuffersMESA`.
    /// ```
    /// void glResizeBuffersMESA();
    /// ```
    public void ResizeBuffersMESA() {
        if (MemoryUtil.isNullPointer(handles.PFN_glResizeBuffersMESA)) throw new GLSymbolNotFoundError("Symbol not found: glResizeBuffersMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResizeBuffersMESA"); }
        Handles.MH_glResizeBuffersMESA.get().invokeExact(handles.PFN_glResizeBuffersMESA); }
        catch (Throwable e) { throw new RuntimeException("error in ResizeBuffersMESA", e); }
    }

}
