// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_polygon_offset_clamp`
public final class GLEXTPolygonOffsetClamp {
    public static final int GL_POLYGON_OFFSET_CLAMP_EXT = 0x8E1B;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPolygonOffsetClampEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glPolygonOffsetClampEXT;
        private Handles(GLLoadFunc func) {
            PFN_glPolygonOffsetClampEXT = func.invoke("glPolygonOffsetClampEXT", "glPolygonOffsetClamp");
        }
    }

    public GLEXTPolygonOffsetClamp(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPolygonOffsetClampEXT`.
    /// ```
    /// void glPolygonOffsetClampEXT(((float) khronos_float_t) GLfloat factor, ((float) khronos_float_t) GLfloat units, ((float) khronos_float_t) GLfloat clamp);
    /// ```
    public void PolygonOffsetClampEXT(float factor, float units, float clamp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPolygonOffsetClampEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPolygonOffsetClampEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPolygonOffsetClampEXT", factor, units, clamp); }
        Handles.MH_glPolygonOffsetClampEXT.invokeExact(handles.PFN_glPolygonOffsetClampEXT, factor, units, clamp); }
        catch (Throwable e) { throw new RuntimeException("error in PolygonOffsetClampEXT", e); }
    }

}
