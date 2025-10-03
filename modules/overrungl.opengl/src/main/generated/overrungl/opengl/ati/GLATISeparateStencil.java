// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ati;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_separate_stencil`
public final class GLATISeparateStencil {
    public static final int GL_STENCIL_BACK_FUNC_ATI = 0x8800;
    public static final int GL_STENCIL_BACK_FAIL_ATI = 0x8801;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI = 0x8802;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI = 0x8803;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glStencilOpSeparateATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glStencilFuncSeparateATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glStencilOpSeparateATI;
        public final MemorySegment PFN_glStencilFuncSeparateATI;
        private Handles(GLLoadFunc func) {
            PFN_glStencilOpSeparateATI = func.invoke("glStencilOpSeparateATI", "glStencilOpSeparate");
            PFN_glStencilFuncSeparateATI = func.invoke("glStencilFuncSeparateATI");
        }
    }

    public GLATISeparateStencil(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glStencilOpSeparateATI`.
    /// ```
    /// void glStencilOpSeparateATI((unsigned int) GLenum face, (unsigned int) GLenum sfail, (unsigned int) GLenum dpfail, (unsigned int) GLenum dppass);
    /// ```
    public void StencilOpSeparateATI(int face, int sfail, int dpfail, int dppass) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilOpSeparateATI)) throw new GLSymbolNotFoundError("Symbol not found: glStencilOpSeparateATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilOpSeparateATI", face, sfail, dpfail, dppass); }
        Handles.MH_glStencilOpSeparateATI.get().invokeExact(handles.PFN_glStencilOpSeparateATI, face, sfail, dpfail, dppass); }
        catch (Throwable e) { throw new RuntimeException("error in StencilOpSeparateATI", e); }
    }

    /// Invokes `glStencilFuncSeparateATI`.
    /// ```
    /// void glStencilFuncSeparateATI((unsigned int) GLenum frontfunc, (unsigned int) GLenum backfunc, (int) GLint ref, (unsigned int) GLuint mask);
    /// ```
    public void StencilFuncSeparateATI(int frontfunc, int backfunc, int ref, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilFuncSeparateATI)) throw new GLSymbolNotFoundError("Symbol not found: glStencilFuncSeparateATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilFuncSeparateATI", frontfunc, backfunc, ref, mask); }
        Handles.MH_glStencilFuncSeparateATI.get().invokeExact(handles.PFN_glStencilFuncSeparateATI, frontfunc, backfunc, ref, mask); }
        catch (Throwable e) { throw new RuntimeException("error in StencilFuncSeparateATI", e); }
    }

}
