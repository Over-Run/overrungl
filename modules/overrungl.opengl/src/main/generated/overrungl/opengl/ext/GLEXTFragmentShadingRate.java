// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_fragment_shading_rate`
public final class GLEXTFragmentShadingRate {
    public static final int GL_SHADING_RATE_1X1_PIXELS_EXT = 0x96A6;
    public static final int GL_SHADING_RATE_1X2_PIXELS_EXT = 0x96A7;
    public static final int GL_SHADING_RATE_2X1_PIXELS_EXT = 0x96A8;
    public static final int GL_SHADING_RATE_2X2_PIXELS_EXT = 0x96A9;
    public static final int GL_SHADING_RATE_1X4_PIXELS_EXT = 0x96AA;
    public static final int GL_SHADING_RATE_4X1_PIXELS_EXT = 0x96AB;
    public static final int GL_SHADING_RATE_4X2_PIXELS_EXT = 0x96AC;
    public static final int GL_SHADING_RATE_2X4_PIXELS_EXT = 0x96AD;
    public static final int GL_SHADING_RATE_4X4_PIXELS_EXT = 0x96AE;
    public static final int GL_SHADING_RATE_EXT = 0x96D0;
    public static final int GL_SHADING_RATE_ATTACHMENT_EXT = 0x96D1;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_EXT = 0x96D2;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_EXT = 0x96D3;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_EXT = 0x96D4;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_EXT = 0x96D5;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_EXT = 0x96D6;
    public static final int GL_MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT = 0x96D7;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT = 0x96D8;
    public static final int GL_MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT = 0x96D9;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT = 0x96DA;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_ASPECT_RATIO_EXT = 0x96DB;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_LAYERS_EXT = 0x96DC;
    public static final int GL_FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_SUPPORTED_EXT = 0x96DD;
    public static final int GL_FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_SUPPORTED_EXT = 0x96DE;
    public static final int GL_FRAGMENT_SHADING_RATE_ATTACHMENT_WITH_DEFAULT_FRAMEBUFFER_SUPPORTED_EXT = 0x96DF;
    public static final int GL_FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINERS_SUPPORTED_EXT = 0x8F6F;
    public static final int GL_FRAGMENT_SHADING_RATE_PRIMITIVE_RATE_WITH_MULTI_VIEWPORT_SUPPORTED_EXT = 0x9780;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetFragmentShadingRatesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glShadingRateEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShadingRateCombinerOpsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferShadingRateEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGetFragmentShadingRatesEXT;
        public final MemorySegment PFN_glShadingRateEXT;
        public final MemorySegment PFN_glShadingRateCombinerOpsEXT;
        public final MemorySegment PFN_glFramebufferShadingRateEXT;
        private Handles(GLLoadFunc func) {
            PFN_glGetFragmentShadingRatesEXT = func.invoke("glGetFragmentShadingRatesEXT");
            PFN_glShadingRateEXT = func.invoke("glShadingRateEXT");
            PFN_glShadingRateCombinerOpsEXT = func.invoke("glShadingRateCombinerOpsEXT");
            PFN_glFramebufferShadingRateEXT = func.invoke("glFramebufferShadingRateEXT");
        }
    }

    public GLEXTFragmentShadingRate(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetFragmentShadingRatesEXT`.
    /// ```
    /// void glGetFragmentShadingRatesEXT((int) GLsizei samples, (int) GLsizei maxCount, GLsizei* count, GLenum* shadingRates);
    /// ```
    public void GetFragmentShadingRatesEXT(int samples, int maxCount, @NonNull MemorySegment count, @NonNull MemorySegment shadingRates) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragmentShadingRatesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetFragmentShadingRatesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFragmentShadingRatesEXT", samples, maxCount, count, shadingRates); }
        Handles.MH_glGetFragmentShadingRatesEXT.invokeExact(handles.PFN_glGetFragmentShadingRatesEXT, samples, maxCount, count, shadingRates); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragmentShadingRatesEXT", e); }
    }

    /// Invokes `glShadingRateEXT`.
    /// ```
    /// void glShadingRateEXT((unsigned int) GLenum rate);
    /// ```
    public void ShadingRateEXT(int rate) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShadingRateEXT)) throw new GLSymbolNotFoundError("Symbol not found: glShadingRateEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShadingRateEXT", rate); }
        Handles.MH_glShadingRateEXT.invokeExact(handles.PFN_glShadingRateEXT, rate); }
        catch (Throwable e) { throw new RuntimeException("error in ShadingRateEXT", e); }
    }

    /// Invokes `glShadingRateCombinerOpsEXT`.
    /// ```
    /// void glShadingRateCombinerOpsEXT((unsigned int) GLenum combinerOp0, (unsigned int) GLenum combinerOp1);
    /// ```
    public void ShadingRateCombinerOpsEXT(int combinerOp0, int combinerOp1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShadingRateCombinerOpsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glShadingRateCombinerOpsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShadingRateCombinerOpsEXT", combinerOp0, combinerOp1); }
        Handles.MH_glShadingRateCombinerOpsEXT.invokeExact(handles.PFN_glShadingRateCombinerOpsEXT, combinerOp0, combinerOp1); }
        catch (Throwable e) { throw new RuntimeException("error in ShadingRateCombinerOpsEXT", e); }
    }

    /// Invokes `glFramebufferShadingRateEXT`.
    /// ```
    /// void glFramebufferShadingRateEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint baseLayer, (int) GLsizei numLayers, (int) GLsizei texelWidth, (int) GLsizei texelHeight);
    /// ```
    public void FramebufferShadingRateEXT(int target, int attachment, int texture, int baseLayer, int numLayers, int texelWidth, int texelHeight) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferShadingRateEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferShadingRateEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferShadingRateEXT", target, attachment, texture, baseLayer, numLayers, texelWidth, texelHeight); }
        Handles.MH_glFramebufferShadingRateEXT.invokeExact(handles.PFN_glFramebufferShadingRateEXT, target, attachment, texture, baseLayer, numLayers, texelWidth, texelHeight); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferShadingRateEXT", e); }
    }

}
