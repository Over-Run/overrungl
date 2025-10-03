// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_blend_minmax`
public final class GLEXTBlendMinmax {
    public static final int GL_MIN_EXT = 0x8007;
    public static final int GL_MAX_EXT = 0x8008;
    public static final int GL_FUNC_ADD_EXT = 0x8006;
    public static final int GL_BLEND_EQUATION_EXT = 0x8009;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBlendEquationEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBlendEquationEXT;
        private Handles(GLLoadFunc func) {
            PFN_glBlendEquationEXT = func.invoke("glBlendEquationEXT", "glBlendEquation");
        }
    }

    public GLEXTBlendMinmax(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendEquationEXT`.
    /// ```
    /// void glBlendEquationEXT((unsigned int) GLenum mode);
    /// ```
    public void BlendEquationEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationEXT", mode); }
        Handles.MH_glBlendEquationEXT.get().invokeExact(handles.PFN_glBlendEquationEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationEXT", e); }
    }

}
