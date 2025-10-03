// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_sample_positions`
public final class GLAMDSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glSetMultisamplefvAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glSetMultisamplefvAMD;
        private Handles(GLLoadFunc func) {
            PFN_glSetMultisamplefvAMD = func.invoke("glSetMultisamplefvAMD");
        }
    }

    public GLAMDSamplePositions(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSetMultisamplefvAMD`.
    /// ```
    /// void glSetMultisamplefvAMD((unsigned int) GLenum pname, (unsigned int) GLuint index, const GLfloat* val);
    /// ```
    public void SetMultisamplefvAMD(int pname, int index, @NonNull MemorySegment val) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetMultisamplefvAMD)) throw new GLSymbolNotFoundError("Symbol not found: glSetMultisamplefvAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSetMultisamplefvAMD", pname, index, val); }
        Handles.MH_glSetMultisamplefvAMD.get().invokeExact(handles.PFN_glSetMultisamplefvAMD, pname, index, val); }
        catch (Throwable e) { throw new RuntimeException("error in SetMultisamplefvAMD", e); }
    }

}
