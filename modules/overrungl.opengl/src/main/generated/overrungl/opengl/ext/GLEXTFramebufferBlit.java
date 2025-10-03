// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_framebuffer_blit`
public final class GLEXTFramebufferBlit {
    public static final int GL_READ_FRAMEBUFFER_EXT = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER_EXT = 0x8CA9;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING_EXT = 0x8CA6;
    public static final int GL_READ_FRAMEBUFFER_BINDING_EXT = 0x8CAA;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBlitFramebufferEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBlitFramebufferEXT;
        private Handles(GLLoadFunc func) {
            PFN_glBlitFramebufferEXT = func.invoke("glBlitFramebufferEXT", "glBlitFramebuffer");
        }
    }

    public GLEXTFramebufferBlit(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlitFramebufferEXT`.
    /// ```
    /// void glBlitFramebufferEXT((int) GLint srcX0, (int) GLint srcY0, (int) GLint srcX1, (int) GLint srcY1, (int) GLint dstX0, (int) GLint dstY0, (int) GLint dstX1, (int) GLint dstY1, (unsigned int) GLbitfield mask, (unsigned int) GLenum filter);
    /// ```
    public void BlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlitFramebufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBlitFramebufferEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlitFramebufferEXT", srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        Handles.MH_glBlitFramebufferEXT.get().invokeExact(handles.PFN_glBlitFramebufferEXT, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in BlitFramebufferEXT", e); }
    }

}
