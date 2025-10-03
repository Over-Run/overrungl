// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_blend_color`
public final class GLEXTBlendColor {
    public static final int GL_CONSTANT_COLOR_EXT = 0x8001;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR_EXT = 0x8002;
    public static final int GL_CONSTANT_ALPHA_EXT = 0x8003;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 0x8004;
    public static final int GL_BLEND_COLOR_EXT = 0x8005;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBlendColorEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public final MemorySegment PFN_glBlendColorEXT;
        private Handles(GLLoadFunc func) {
            PFN_glBlendColorEXT = func.invoke("glBlendColorEXT", "glBlendColor");
        }
    }

    public GLEXTBlendColor(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendColorEXT`.
    /// ```
    /// void glBlendColorEXT(((float) khronos_float_t) GLfloat red, ((float) khronos_float_t) GLfloat green, ((float) khronos_float_t) GLfloat blue, ((float) khronos_float_t) GLfloat alpha);
    /// ```
    public void BlendColorEXT(float red, float green, float blue, float alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendColorEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBlendColorEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendColorEXT", red, green, blue, alpha); }
        Handles.MH_glBlendColorEXT.get().invokeExact(handles.PFN_glBlendColorEXT, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendColorEXT", e); }
    }

}
