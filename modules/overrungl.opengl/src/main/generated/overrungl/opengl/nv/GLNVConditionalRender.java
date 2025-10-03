// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_conditional_render`
public final class GLNVConditionalRender {
    public static final int GL_QUERY_WAIT_NV = 0x8E13;
    public static final int GL_QUERY_NO_WAIT_NV = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT_NV = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBeginConditionalRenderNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glEndConditionalRenderNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glBeginConditionalRenderNV;
        public final MemorySegment PFN_glEndConditionalRenderNV;
        private Handles(GLLoadFunc func) {
            PFN_glBeginConditionalRenderNV = func.invoke("glBeginConditionalRenderNV", "glBeginConditionalRender");
            PFN_glEndConditionalRenderNV = func.invoke("glEndConditionalRenderNV", "glEndConditionalRender");
        }
    }

    public GLNVConditionalRender(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBeginConditionalRenderNV`.
    /// ```
    /// void glBeginConditionalRenderNV((unsigned int) GLuint id, (unsigned int) GLenum mode);
    /// ```
    public void BeginConditionalRenderNV(int id, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginConditionalRenderNV)) throw new GLSymbolNotFoundError("Symbol not found: glBeginConditionalRenderNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginConditionalRenderNV", id, mode); }
        Handles.MH_glBeginConditionalRenderNV.get().invokeExact(handles.PFN_glBeginConditionalRenderNV, id, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BeginConditionalRenderNV", e); }
    }

    /// Invokes `glEndConditionalRenderNV`.
    /// ```
    /// void glEndConditionalRenderNV();
    /// ```
    public void EndConditionalRenderNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndConditionalRenderNV)) throw new GLSymbolNotFoundError("Symbol not found: glEndConditionalRenderNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndConditionalRenderNV"); }
        Handles.MH_glEndConditionalRenderNV.get().invokeExact(handles.PFN_glEndConditionalRenderNV); }
        catch (Throwable e) { throw new RuntimeException("error in EndConditionalRenderNV", e); }
    }

}
