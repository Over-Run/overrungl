// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ingr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_INGR_blend_func_separate`
public final class GLINGRBlendFuncSeparate {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBlendFuncSeparateINGR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBlendFuncSeparateINGR;
        private Handles(GLLoadFunc func) {
            PFN_glBlendFuncSeparateINGR = func.invoke("glBlendFuncSeparateINGR", "glBlendFuncSeparate");
        }
    }

    public GLINGRBlendFuncSeparate(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendFuncSeparateINGR`.
    /// ```
    /// void glBlendFuncSeparateINGR((unsigned int) GLenum sfactorRGB, (unsigned int) GLenum dfactorRGB, (unsigned int) GLenum sfactorAlpha, (unsigned int) GLenum dfactorAlpha);
    /// ```
    public void BlendFuncSeparateINGR(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncSeparateINGR)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFuncSeparateINGR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendFuncSeparateINGR", sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); }
        Handles.MH_glBlendFuncSeparateINGR.get().invokeExact(handles.PFN_glBlendFuncSeparateINGR, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncSeparateINGR", e); }
    }

}
