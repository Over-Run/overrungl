// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.oes;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_OES_query_matrix`
public final class GLOESQueryMatrix {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glQueryMatrixxOES = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glQueryMatrixxOES;
        private Handles(GLLoadFunc func) {
            PFN_glQueryMatrixxOES = func.invoke("glQueryMatrixxOES");
        }
    }

    public GLOESQueryMatrix(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glQueryMatrixxOES`.
    /// ```
    /// (unsigned int) GLbitfield glQueryMatrixxOES(GLfixed* mantissa, GLint* exponent);
    /// ```
    public int QueryMatrixxOES(@NonNull MemorySegment mantissa, @NonNull MemorySegment exponent) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glQueryMatrixxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glQueryMatrixxOES", mantissa, exponent); }
        return (int) Handles.MH_glQueryMatrixxOES.invokeExact(handles.PFN_glQueryMatrixxOES, mantissa, exponent); }
        catch (Throwable e) { throw new RuntimeException("error in QueryMatrixxOES", e); }
    }

}
