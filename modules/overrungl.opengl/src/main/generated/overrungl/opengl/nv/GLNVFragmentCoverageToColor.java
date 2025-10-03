// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_fragment_coverage_to_color`
public final class GLNVFragmentCoverageToColor {
    public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 0x92DD;
    public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 0x92DE;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFragmentCoverageColorNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glFragmentCoverageColorNV;
        private Handles(GLLoadFunc func) {
            PFN_glFragmentCoverageColorNV = func.invoke("glFragmentCoverageColorNV");
        }
    }

    public GLNVFragmentCoverageToColor(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFragmentCoverageColorNV`.
    /// ```
    /// void glFragmentCoverageColorNV((unsigned int) GLuint color);
    /// ```
    public void FragmentCoverageColorNV(int color) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentCoverageColorNV)) throw new GLSymbolNotFoundError("Symbol not found: glFragmentCoverageColorNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFragmentCoverageColorNV", color); }
        Handles.MH_glFragmentCoverageColorNV.invokeExact(handles.PFN_glFragmentCoverageColorNV, color); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentCoverageColorNV", e); }
    }

}
