// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ibm;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_IBM_static_data`
public final class GLIBMStaticData {
    public static final int GL_ALL_STATIC_DATA_IBM = 103060;
    public static final int GL_STATIC_VERTEX_ARRAY_IBM = 103061;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFlushStaticDataIBM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glFlushStaticDataIBM;
        private Handles(GLLoadFunc func) {
            PFN_glFlushStaticDataIBM = func.invoke("glFlushStaticDataIBM");
        }
    }

    public GLIBMStaticData(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFlushStaticDataIBM`.
    /// ```
    /// void glFlushStaticDataIBM((unsigned int) GLenum target);
    /// ```
    public void FlushStaticDataIBM(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushStaticDataIBM)) throw new GLSymbolNotFoundError("Symbol not found: glFlushStaticDataIBM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFlushStaticDataIBM", target); }
        Handles.MH_glFlushStaticDataIBM.invokeExact(handles.PFN_glFlushStaticDataIBM, target); }
        catch (Throwable e) { throw new RuntimeException("error in FlushStaticDataIBM", e); }
    }

}
