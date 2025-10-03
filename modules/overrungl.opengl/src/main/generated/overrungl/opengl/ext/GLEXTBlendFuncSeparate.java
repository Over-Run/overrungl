// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_blend_func_separate`
public final class GLEXTBlendFuncSeparate {
    public static final int GL_BLEND_DST_RGB_EXT = 0x80C8;
    public static final int GL_BLEND_SRC_RGB_EXT = 0x80C9;
    public static final int GL_BLEND_DST_ALPHA_EXT = 0x80CA;
    public static final int GL_BLEND_SRC_ALPHA_EXT = 0x80CB;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendFuncSeparateEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlendFuncSeparateEXT;
        private Handles(GLLoadFunc func) {
            PFN_glBlendFuncSeparateEXT = func.invoke("glBlendFuncSeparateEXT", "glBlendFuncSeparate");
        }
    }

    public GLEXTBlendFuncSeparate(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendFuncSeparateEXT`.
    /// ```
    /// void glBlendFuncSeparateEXT((unsigned int) GLenum sfactorRGB, (unsigned int) GLenum dfactorRGB, (unsigned int) GLenum sfactorAlpha, (unsigned int) GLenum dfactorAlpha);
    /// ```
    public void BlendFuncSeparateEXT(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncSeparateEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFuncSeparateEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendFuncSeparateEXT", sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); }
        Handles.MH_glBlendFuncSeparateEXT.invokeExact(handles.PFN_glBlendFuncSeparateEXT, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncSeparateEXT", e); }
    }

}
