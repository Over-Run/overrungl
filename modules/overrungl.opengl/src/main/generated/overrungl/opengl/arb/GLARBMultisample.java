// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_multisample`
public final class GLARBMultisample {
    public static final int GL_MULTISAMPLE_ARB = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE_ARB = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_ARB = 0x809F;
    public static final int GL_SAMPLE_COVERAGE_ARB = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS_ARB = 0x80A8;
    public static final int GL_SAMPLES_ARB = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE_ARB = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT_ARB = 0x80AB;
    public static final int GL_MULTISAMPLE_BIT_ARB = 0x20000000;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glSampleCoverageARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BYTE)));
        public final MemorySegment PFN_glSampleCoverageARB;
        private Handles(GLLoadFunc func) {
            PFN_glSampleCoverageARB = func.invoke("glSampleCoverageARB", "glSampleCoverage");
        }
    }

    public GLARBMultisample(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSampleCoverageARB`.
    /// ```
    /// void glSampleCoverageARB(((float) khronos_float_t) GLfloat value, GLboolean invert);
    /// ```
    public void SampleCoverageARB(float value, boolean invert) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleCoverageARB)) throw new GLSymbolNotFoundError("Symbol not found: glSampleCoverageARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSampleCoverageARB", value, invert); }
        Handles.MH_glSampleCoverageARB.get().invokeExact(handles.PFN_glSampleCoverageARB, value, ((invert) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in SampleCoverageARB", e); }
    }

}
