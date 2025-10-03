// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_internalformat_sample_query`
public final class GLNVInternalformatSampleQuery {
    public static final int GL_RENDERBUFFER = 0x8D41;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int GL_MULTISAMPLES_NV = 0x9371;
    public static final int GL_SUPERSAMPLE_SCALE_X_NV = 0x9372;
    public static final int GL_SUPERSAMPLE_SCALE_Y_NV = 0x9373;
    public static final int GL_CONFORMANT_NV = 0x9374;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGetInternalformatSampleivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGetInternalformatSampleivNV;
        private Handles(GLLoadFunc func) {
            PFN_glGetInternalformatSampleivNV = func.invoke("glGetInternalformatSampleivNV");
        }
    }

    public GLNVInternalformatSampleQuery(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetInternalformatSampleivNV`.
    /// ```
    /// void glGetInternalformatSampleivNV((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei samples, (unsigned int) GLenum pname, (int) GLsizei count, GLint* params);
    /// ```
    public void GetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int count, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInternalformatSampleivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetInternalformatSampleivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInternalformatSampleivNV", target, internalformat, samples, pname, count, params); }
        Handles.MH_glGetInternalformatSampleivNV.get().invokeExact(handles.PFN_glGetInternalformatSampleivNV, target, internalformat, samples, pname, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetInternalformatSampleivNV", e); }
    }

}
