// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_draw_texture`
public final class GLNVDrawTexture {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawTextureNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glDrawTextureNV;
        private Handles(GLLoadFunc func) {
            PFN_glDrawTextureNV = func.invoke("glDrawTextureNV");
        }
    }

    public GLNVDrawTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawTextureNV`.
    /// ```
    /// void glDrawTextureNV((unsigned int) GLuint texture, (unsigned int) GLuint sampler, ((float) khronos_float_t) GLfloat x0, ((float) khronos_float_t) GLfloat y0, ((float) khronos_float_t) GLfloat x1, ((float) khronos_float_t) GLfloat y1, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat s0, ((float) khronos_float_t) GLfloat t0, ((float) khronos_float_t) GLfloat s1, ((float) khronos_float_t) GLfloat t1);
    /// ```
    public void DrawTextureNV(int texture, int sampler, float x0, float y0, float x1, float y1, float z, float s0, float t0, float s1, float t1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTextureNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTextureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTextureNV", texture, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1); }
        Handles.MH_glDrawTextureNV.invokeExact(handles.PFN_glDrawTextureNV, texture, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTextureNV", e); }
    }

}
