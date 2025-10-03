// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ati;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_draw_buffers`
public final class GLATIDrawBuffers {
    public static final int GL_MAX_DRAW_BUFFERS_ATI = 0x8824;
    public static final int GL_DRAW_BUFFER0_ATI = 0x8825;
    public static final int GL_DRAW_BUFFER1_ATI = 0x8826;
    public static final int GL_DRAW_BUFFER2_ATI = 0x8827;
    public static final int GL_DRAW_BUFFER3_ATI = 0x8828;
    public static final int GL_DRAW_BUFFER4_ATI = 0x8829;
    public static final int GL_DRAW_BUFFER5_ATI = 0x882A;
    public static final int GL_DRAW_BUFFER6_ATI = 0x882B;
    public static final int GL_DRAW_BUFFER7_ATI = 0x882C;
    public static final int GL_DRAW_BUFFER8_ATI = 0x882D;
    public static final int GL_DRAW_BUFFER9_ATI = 0x882E;
    public static final int GL_DRAW_BUFFER10_ATI = 0x882F;
    public static final int GL_DRAW_BUFFER11_ATI = 0x8830;
    public static final int GL_DRAW_BUFFER12_ATI = 0x8831;
    public static final int GL_DRAW_BUFFER13_ATI = 0x8832;
    public static final int GL_DRAW_BUFFER14_ATI = 0x8833;
    public static final int GL_DRAW_BUFFER15_ATI = 0x8834;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawBuffersATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDrawBuffersATI;
        private Handles(GLLoadFunc func) {
            PFN_glDrawBuffersATI = func.invoke("glDrawBuffersATI", "glDrawBuffers");
        }
    }

    public GLATIDrawBuffers(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawBuffersATI`.
    /// ```
    /// void glDrawBuffersATI((int) GLsizei n, const GLenum* bufs);
    /// ```
    public void DrawBuffersATI(int n, @NonNull MemorySegment bufs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawBuffersATI)) throw new GLSymbolNotFoundError("Symbol not found: glDrawBuffersATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawBuffersATI", n, bufs); }
        Handles.MH_glDrawBuffersATI.invokeExact(handles.PFN_glDrawBuffersATI, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in DrawBuffersATI", e); }
    }

}
