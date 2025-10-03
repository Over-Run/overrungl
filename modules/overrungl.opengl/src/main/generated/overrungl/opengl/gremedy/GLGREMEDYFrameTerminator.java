// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.gremedy;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_GREMEDY_frame_terminator`
public final class GLGREMEDYFrameTerminator {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glFrameTerminatorGREMEDY = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glFrameTerminatorGREMEDY;
        private Handles(GLLoadFunc func) {
            PFN_glFrameTerminatorGREMEDY = func.invoke("glFrameTerminatorGREMEDY");
        }
    }

    public GLGREMEDYFrameTerminator(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFrameTerminatorGREMEDY`.
    /// ```
    /// void glFrameTerminatorGREMEDY();
    /// ```
    public void FrameTerminatorGREMEDY() {
        if (MemoryUtil.isNullPointer(handles.PFN_glFrameTerminatorGREMEDY)) throw new GLSymbolNotFoundError("Symbol not found: glFrameTerminatorGREMEDY");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFrameTerminatorGREMEDY"); }
        Handles.MH_glFrameTerminatorGREMEDY.get().invokeExact(handles.PFN_glFrameTerminatorGREMEDY); }
        catch (Throwable e) { throw new RuntimeException("error in FrameTerminatorGREMEDY", e); }
    }

}
