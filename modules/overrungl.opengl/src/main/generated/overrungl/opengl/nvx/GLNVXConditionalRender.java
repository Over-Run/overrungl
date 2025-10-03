// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nvx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NVX_conditional_render`
public final class GLNVXConditionalRender {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBeginConditionalRenderNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndConditionalRenderNVX = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glBeginConditionalRenderNVX;
        public final MemorySegment PFN_glEndConditionalRenderNVX;
        private Handles(GLLoadFunc func) {
            PFN_glBeginConditionalRenderNVX = func.invoke("glBeginConditionalRenderNVX");
            PFN_glEndConditionalRenderNVX = func.invoke("glEndConditionalRenderNVX", "glEndConditionalRender");
        }
    }

    public GLNVXConditionalRender(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBeginConditionalRenderNVX`.
    /// ```
    /// void glBeginConditionalRenderNVX((unsigned int) GLuint id);
    /// ```
    public void BeginConditionalRenderNVX(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginConditionalRenderNVX)) throw new GLSymbolNotFoundError("Symbol not found: glBeginConditionalRenderNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginConditionalRenderNVX", id); }
        Handles.MH_glBeginConditionalRenderNVX.invokeExact(handles.PFN_glBeginConditionalRenderNVX, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginConditionalRenderNVX", e); }
    }

    /// Invokes `glEndConditionalRenderNVX`.
    /// ```
    /// void glEndConditionalRenderNVX();
    /// ```
    public void EndConditionalRenderNVX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndConditionalRenderNVX)) throw new GLSymbolNotFoundError("Symbol not found: glEndConditionalRenderNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndConditionalRenderNVX"); }
        Handles.MH_glEndConditionalRenderNVX.invokeExact(handles.PFN_glEndConditionalRenderNVX); }
        catch (Throwable e) { throw new RuntimeException("error in EndConditionalRenderNVX", e); }
    }

}
