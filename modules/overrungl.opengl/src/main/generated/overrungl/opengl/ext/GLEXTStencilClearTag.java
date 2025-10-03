// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_stencil_clear_tag`
public final class GLEXTStencilClearTag {
    public static final int GL_STENCIL_TAG_BITS_EXT = 0x88F2;
    public static final int GL_STENCIL_CLEAR_TAG_VALUE_EXT = 0x88F3;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glStencilClearTagEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glStencilClearTagEXT;
        private Handles(GLLoadFunc func) {
            PFN_glStencilClearTagEXT = func.invoke("glStencilClearTagEXT");
        }
    }

    public GLEXTStencilClearTag(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glStencilClearTagEXT`.
    /// ```
    /// void glStencilClearTagEXT((int) GLsizei stencilTagBits, (unsigned int) GLuint stencilClearTag);
    /// ```
    public void StencilClearTagEXT(int stencilTagBits, int stencilClearTag) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilClearTagEXT)) throw new GLSymbolNotFoundError("Symbol not found: glStencilClearTagEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilClearTagEXT", stencilTagBits, stencilClearTag); }
        Handles.MH_glStencilClearTagEXT.invokeExact(handles.PFN_glStencilClearTagEXT, stencilTagBits, stencilClearTag); }
        catch (Throwable e) { throw new RuntimeException("error in StencilClearTagEXT", e); }
    }

}
