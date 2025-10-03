// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_gl_spirv`
public final class GLARBGlSpirv {
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 0x9551;
    public static final int GL_SPIR_V_BINARY_ARB = 0x9552;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glSpecializeShaderARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glSpecializeShaderARB;
        private Handles(GLLoadFunc func) {
            PFN_glSpecializeShaderARB = func.invoke("glSpecializeShaderARB", "glSpecializeShader");
        }
    }

    public GLARBGlSpirv(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSpecializeShaderARB`.
    /// ```
    /// void glSpecializeShaderARB((unsigned int) GLuint shader, const GLchar* pEntryPoint, (unsigned int) GLuint numSpecializationConstants, const GLuint* pConstantIndex, const GLuint* pConstantValue);
    /// ```
    public void SpecializeShaderARB(int shader, @NonNull MemorySegment pEntryPoint, int numSpecializationConstants, @NonNull MemorySegment pConstantIndex, @NonNull MemorySegment pConstantValue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSpecializeShaderARB)) throw new GLSymbolNotFoundError("Symbol not found: glSpecializeShaderARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSpecializeShaderARB", shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue); }
        Handles.MH_glSpecializeShaderARB.get().invokeExact(handles.PFN_glSpecializeShaderARB, shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue); }
        catch (Throwable e) { throw new RuntimeException("error in SpecializeShaderARB", e); }
    }

}
