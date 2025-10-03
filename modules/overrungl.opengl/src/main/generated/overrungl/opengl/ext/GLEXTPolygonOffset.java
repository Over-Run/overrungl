// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_polygon_offset`
public final class GLEXTPolygonOffset {
    public static final int GL_POLYGON_OFFSET_EXT = 0x8037;
    public static final int GL_POLYGON_OFFSET_FACTOR_EXT = 0x8038;
    public static final int GL_POLYGON_OFFSET_BIAS_EXT = 0x8039;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glPolygonOffsetEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public final MemorySegment PFN_glPolygonOffsetEXT;
        private Handles(GLLoadFunc func) {
            PFN_glPolygonOffsetEXT = func.invoke("glPolygonOffsetEXT");
        }
    }

    public GLEXTPolygonOffset(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPolygonOffsetEXT`.
    /// ```
    /// void glPolygonOffsetEXT(((float) khronos_float_t) GLfloat factor, ((float) khronos_float_t) GLfloat bias);
    /// ```
    public void PolygonOffsetEXT(float factor, float bias) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPolygonOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPolygonOffsetEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPolygonOffsetEXT", factor, bias); }
        Handles.MH_glPolygonOffsetEXT.get().invokeExact(handles.PFN_glPolygonOffsetEXT, factor, bias); }
        catch (Throwable e) { throw new RuntimeException("error in PolygonOffsetEXT", e); }
    }

}
