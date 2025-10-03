// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_framezoom`
public final class GLSGIXFramezoom {
    public static final int GL_FRAMEZOOM_SGIX = 0x818B;
    public static final int GL_FRAMEZOOM_FACTOR_SGIX = 0x818C;
    public static final int GL_MAX_FRAMEZOOM_FACTOR_SGIX = 0x818D;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glFrameZoomSGIX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glFrameZoomSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glFrameZoomSGIX = func.invoke("glFrameZoomSGIX");
        }
    }

    public GLSGIXFramezoom(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFrameZoomSGIX`.
    /// ```
    /// void glFrameZoomSGIX((int) GLint factor);
    /// ```
    public void FrameZoomSGIX(int factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFrameZoomSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glFrameZoomSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFrameZoomSGIX", factor); }
        Handles.MH_glFrameZoomSGIX.get().invokeExact(handles.PFN_glFrameZoomSGIX, factor); }
        catch (Throwable e) { throw new RuntimeException("error in FrameZoomSGIX", e); }
    }

}
