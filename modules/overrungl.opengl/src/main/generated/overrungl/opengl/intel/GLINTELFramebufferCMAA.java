// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.intel;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_INTEL_framebuffer_CMAA`
public final class GLINTELFramebufferCMAA {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glApplyFramebufferAttachmentCMAAINTEL = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glApplyFramebufferAttachmentCMAAINTEL;
        private Handles(GLLoadFunc func) {
            PFN_glApplyFramebufferAttachmentCMAAINTEL = func.invoke("glApplyFramebufferAttachmentCMAAINTEL");
        }
    }

    public GLINTELFramebufferCMAA(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glApplyFramebufferAttachmentCMAAINTEL`.
    /// ```
    /// void glApplyFramebufferAttachmentCMAAINTEL();
    /// ```
    public void ApplyFramebufferAttachmentCMAAINTEL() {
        if (MemoryUtil.isNullPointer(handles.PFN_glApplyFramebufferAttachmentCMAAINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glApplyFramebufferAttachmentCMAAINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glApplyFramebufferAttachmentCMAAINTEL"); }
        Handles.MH_glApplyFramebufferAttachmentCMAAINTEL.invokeExact(handles.PFN_glApplyFramebufferAttachmentCMAAINTEL); }
        catch (Throwable e) { throw new RuntimeException("error in ApplyFramebufferAttachmentCMAAINTEL", e); }
    }

}
