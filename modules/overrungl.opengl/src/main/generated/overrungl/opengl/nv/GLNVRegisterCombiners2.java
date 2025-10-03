// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_register_combiners2`
public final class GLNVRegisterCombiners2 {
    public static final int GL_PER_STAGE_CONSTANTS_NV = 0x8535;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glCombinerStageParameterfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetCombinerStageParameterfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glCombinerStageParameterfvNV;
        public final MemorySegment PFN_glGetCombinerStageParameterfvNV;
        private Handles(GLLoadFunc func) {
            PFN_glCombinerStageParameterfvNV = func.invoke("glCombinerStageParameterfvNV");
            PFN_glGetCombinerStageParameterfvNV = func.invoke("glGetCombinerStageParameterfvNV");
        }
    }

    public GLNVRegisterCombiners2(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCombinerStageParameterfvNV`.
    /// ```
    /// void glCombinerStageParameterfvNV((unsigned int) GLenum stage, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void CombinerStageParameterfvNV(int stage, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCombinerStageParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glCombinerStageParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCombinerStageParameterfvNV", stage, pname, params); }
        Handles.MH_glCombinerStageParameterfvNV.get().invokeExact(handles.PFN_glCombinerStageParameterfvNV, stage, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in CombinerStageParameterfvNV", e); }
    }

    /// Invokes `glGetCombinerStageParameterfvNV`.
    /// ```
    /// void glGetCombinerStageParameterfvNV((unsigned int) GLenum stage, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetCombinerStageParameterfvNV(int stage, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCombinerStageParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetCombinerStageParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCombinerStageParameterfvNV", stage, pname, params); }
        Handles.MH_glGetCombinerStageParameterfvNV.get().invokeExact(handles.PFN_glGetCombinerStageParameterfvNV, stage, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetCombinerStageParameterfvNV", e); }
    }

}
