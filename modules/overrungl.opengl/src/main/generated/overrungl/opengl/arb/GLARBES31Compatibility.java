// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_ES3_1_compatibility`
public final class GLARBES31Compatibility {
    public static final int GL_BACK = 0x0405;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glMemoryBarrierByRegion = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glMemoryBarrierByRegion;
        private Handles(GLLoadFunc func) {
            PFN_glMemoryBarrierByRegion = func.invoke("glMemoryBarrierByRegion");
        }
    }

    public GLARBES31Compatibility(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMemoryBarrierByRegion`.
    /// ```
    /// void glMemoryBarrierByRegion((unsigned int) GLbitfield barriers);
    /// ```
    public void MemoryBarrierByRegion(int barriers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMemoryBarrierByRegion)) throw new GLSymbolNotFoundError("Symbol not found: glMemoryBarrierByRegion");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMemoryBarrierByRegion", barriers); }
        Handles.MH_glMemoryBarrierByRegion.get().invokeExact(handles.PFN_glMemoryBarrierByRegion, barriers); }
        catch (Throwable e) { throw new RuntimeException("error in MemoryBarrierByRegion", e); }
    }

}
