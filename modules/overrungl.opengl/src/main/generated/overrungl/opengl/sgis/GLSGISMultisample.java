// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_multisample`
public final class GLSGISMultisample {
    public static final int GL_MULTISAMPLE_SGIS = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_MASK_SGIS = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_SGIS = 0x809F;
    public static final int GL_SAMPLE_MASK_SGIS = 0x80A0;
    public static final int GL_1PASS_SGIS = 0x80A1;
    public static final int GL_2PASS_0_SGIS = 0x80A2;
    public static final int GL_2PASS_1_SGIS = 0x80A3;
    public static final int GL_4PASS_0_SGIS = 0x80A4;
    public static final int GL_4PASS_1_SGIS = 0x80A5;
    public static final int GL_4PASS_2_SGIS = 0x80A6;
    public static final int GL_4PASS_3_SGIS = 0x80A7;
    public static final int GL_SAMPLE_BUFFERS_SGIS = 0x80A8;
    public static final int GL_SAMPLES_SGIS = 0x80A9;
    public static final int GL_SAMPLE_MASK_VALUE_SGIS = 0x80AA;
    public static final int GL_SAMPLE_MASK_INVERT_SGIS = 0x80AB;
    public static final int GL_SAMPLE_PATTERN_SGIS = 0x80AC;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSampleMaskSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glSamplePatternSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glSampleMaskSGIS;
        public final MemorySegment PFN_glSamplePatternSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glSampleMaskSGIS = func.invoke("glSampleMaskSGIS", "glSampleMaskEXT");
            PFN_glSamplePatternSGIS = func.invoke("glSamplePatternSGIS", "glSamplePatternEXT");
        }
    }

    public GLSGISMultisample(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSampleMaskSGIS`.
    /// ```
    /// void glSampleMaskSGIS(((float) khronos_float_t) GLclampf value, GLboolean invert);
    /// ```
    public void SampleMaskSGIS(float value, boolean invert) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleMaskSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glSampleMaskSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSampleMaskSGIS", value, invert); }
        Handles.MH_glSampleMaskSGIS.invokeExact(handles.PFN_glSampleMaskSGIS, value, ((invert) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in SampleMaskSGIS", e); }
    }

    /// Invokes `glSamplePatternSGIS`.
    /// ```
    /// void glSamplePatternSGIS((unsigned int) GLenum pattern);
    /// ```
    public void SamplePatternSGIS(int pattern) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSamplePatternSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glSamplePatternSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSamplePatternSGIS", pattern); }
        Handles.MH_glSamplePatternSGIS.invokeExact(handles.PFN_glSamplePatternSGIS, pattern); }
        catch (Throwable e) { throw new RuntimeException("error in SamplePatternSGIS", e); }
    }

}
