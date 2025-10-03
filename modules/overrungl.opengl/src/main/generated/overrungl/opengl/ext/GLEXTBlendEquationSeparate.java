// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_blend_equation_separate`
public final class GLEXTBlendEquationSeparate {
    public static final int GL_BLEND_EQUATION_RGB_EXT = 0x8009;
    public static final int GL_BLEND_EQUATION_ALPHA_EXT = 0x883D;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendEquationSeparateEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlendEquationSeparateEXT;
        private Handles(GLLoadFunc func) {
            PFN_glBlendEquationSeparateEXT = func.invoke("glBlendEquationSeparateEXT", "glBlendEquationSeparate");
        }
    }

    public GLEXTBlendEquationSeparate(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendEquationSeparateEXT`.
    /// ```
    /// void glBlendEquationSeparateEXT((unsigned int) GLenum modeRGB, (unsigned int) GLenum modeAlpha);
    /// ```
    public void BlendEquationSeparateEXT(int modeRGB, int modeAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationSeparateEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationSeparateEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationSeparateEXT", modeRGB, modeAlpha); }
        Handles.MH_glBlendEquationSeparateEXT.invokeExact(handles.PFN_glBlendEquationSeparateEXT, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationSeparateEXT", e); }
    }

}
