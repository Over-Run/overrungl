// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_stencil_operation_extended`
public final class GLAMDStencilOperationExtended {
    public static final int GL_SET_AMD = 0x874A;
    public static final int GL_REPLACE_VALUE_AMD = 0x874B;
    public static final int GL_STENCIL_OP_VALUE_AMD = 0x874C;
    public static final int GL_STENCIL_BACK_OP_VALUE_AMD = 0x874D;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glStencilOpValueAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glStencilOpValueAMD;
        private Handles(GLLoadFunc func) {
            PFN_glStencilOpValueAMD = func.invoke("glStencilOpValueAMD");
        }
    }

    public GLAMDStencilOperationExtended(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glStencilOpValueAMD`.
    /// ```
    /// void glStencilOpValueAMD((unsigned int) GLenum face, (unsigned int) GLuint value);
    /// ```
    public void StencilOpValueAMD(int face, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilOpValueAMD)) throw new GLSymbolNotFoundError("Symbol not found: glStencilOpValueAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilOpValueAMD", face, value); }
        Handles.MH_glStencilOpValueAMD.get().invokeExact(handles.PFN_glStencilOpValueAMD, face, value); }
        catch (Throwable e) { throw new RuntimeException("error in StencilOpValueAMD", e); }
    }

}
