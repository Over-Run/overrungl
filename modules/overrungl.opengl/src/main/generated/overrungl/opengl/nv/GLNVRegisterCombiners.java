// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_register_combiners`
public final class GLNVRegisterCombiners {
    public static final int GL_REGISTER_COMBINERS_NV = 0x8522;
    public static final int GL_VARIABLE_A_NV = 0x8523;
    public static final int GL_VARIABLE_B_NV = 0x8524;
    public static final int GL_VARIABLE_C_NV = 0x8525;
    public static final int GL_VARIABLE_D_NV = 0x8526;
    public static final int GL_VARIABLE_E_NV = 0x8527;
    public static final int GL_VARIABLE_F_NV = 0x8528;
    public static final int GL_VARIABLE_G_NV = 0x8529;
    public static final int GL_CONSTANT_COLOR0_NV = 0x852A;
    public static final int GL_CONSTANT_COLOR1_NV = 0x852B;
    public static final int GL_PRIMARY_COLOR_NV = 0x852C;
    public static final int GL_SECONDARY_COLOR_NV = 0x852D;
    public static final int GL_SPARE0_NV = 0x852E;
    public static final int GL_SPARE1_NV = 0x852F;
    public static final int GL_DISCARD_NV = 0x8530;
    public static final int GL_E_TIMES_F_NV = 0x8531;
    public static final int GL_SPARE0_PLUS_SECONDARY_COLOR_NV = 0x8532;
    public static final int GL_UNSIGNED_IDENTITY_NV = 0x8536;
    public static final int GL_UNSIGNED_INVERT_NV = 0x8537;
    public static final int GL_EXPAND_NORMAL_NV = 0x8538;
    public static final int GL_EXPAND_NEGATE_NV = 0x8539;
    public static final int GL_HALF_BIAS_NORMAL_NV = 0x853A;
    public static final int GL_HALF_BIAS_NEGATE_NV = 0x853B;
    public static final int GL_SIGNED_IDENTITY_NV = 0x853C;
    public static final int GL_SIGNED_NEGATE_NV = 0x853D;
    public static final int GL_SCALE_BY_TWO_NV = 0x853E;
    public static final int GL_SCALE_BY_FOUR_NV = 0x853F;
    public static final int GL_SCALE_BY_ONE_HALF_NV = 0x8540;
    public static final int GL_BIAS_BY_NEGATIVE_ONE_HALF_NV = 0x8541;
    public static final int GL_COMBINER_INPUT_NV = 0x8542;
    public static final int GL_COMBINER_MAPPING_NV = 0x8543;
    public static final int GL_COMBINER_COMPONENT_USAGE_NV = 0x8544;
    public static final int GL_COMBINER_AB_DOT_PRODUCT_NV = 0x8545;
    public static final int GL_COMBINER_CD_DOT_PRODUCT_NV = 0x8546;
    public static final int GL_COMBINER_MUX_SUM_NV = 0x8547;
    public static final int GL_COMBINER_SCALE_NV = 0x8548;
    public static final int GL_COMBINER_BIAS_NV = 0x8549;
    public static final int GL_COMBINER_AB_OUTPUT_NV = 0x854A;
    public static final int GL_COMBINER_CD_OUTPUT_NV = 0x854B;
    public static final int GL_COMBINER_SUM_OUTPUT_NV = 0x854C;
    public static final int GL_MAX_GENERAL_COMBINERS_NV = 0x854D;
    public static final int GL_NUM_GENERAL_COMBINERS_NV = 0x854E;
    public static final int GL_COLOR_SUM_CLAMP_NV = 0x854F;
    public static final int GL_COMBINER0_NV = 0x8550;
    public static final int GL_COMBINER1_NV = 0x8551;
    public static final int GL_COMBINER2_NV = 0x8552;
    public static final int GL_COMBINER3_NV = 0x8553;
    public static final int GL_COMBINER4_NV = 0x8554;
    public static final int GL_COMBINER5_NV = 0x8555;
    public static final int GL_COMBINER6_NV = 0x8556;
    public static final int GL_COMBINER7_NV = 0x8557;
    public static final int GL_TEXTURE0_ARB = 0x84C0;
    public static final int GL_TEXTURE1_ARB = 0x84C1;
    public static final int GL_ZERO = 0;
    public static final int GL_NONE = 0;
    public static final int GL_FOG = 0x0B60;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCombinerParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCombinerParameterfNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glCombinerParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCombinerParameteriNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCombinerInputNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCombinerOutputNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glFinalCombinerInputNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetCombinerInputParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCombinerInputParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCombinerOutputParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCombinerOutputParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetFinalCombinerInputParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetFinalCombinerInputParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glCombinerParameterfvNV;
        public final MemorySegment PFN_glCombinerParameterfNV;
        public final MemorySegment PFN_glCombinerParameterivNV;
        public final MemorySegment PFN_glCombinerParameteriNV;
        public final MemorySegment PFN_glCombinerInputNV;
        public final MemorySegment PFN_glCombinerOutputNV;
        public final MemorySegment PFN_glFinalCombinerInputNV;
        public final MemorySegment PFN_glGetCombinerInputParameterfvNV;
        public final MemorySegment PFN_glGetCombinerInputParameterivNV;
        public final MemorySegment PFN_glGetCombinerOutputParameterfvNV;
        public final MemorySegment PFN_glGetCombinerOutputParameterivNV;
        public final MemorySegment PFN_glGetFinalCombinerInputParameterfvNV;
        public final MemorySegment PFN_glGetFinalCombinerInputParameterivNV;
        private Handles(GLLoadFunc func) {
            PFN_glCombinerParameterfvNV = func.invoke("glCombinerParameterfvNV");
            PFN_glCombinerParameterfNV = func.invoke("glCombinerParameterfNV");
            PFN_glCombinerParameterivNV = func.invoke("glCombinerParameterivNV");
            PFN_glCombinerParameteriNV = func.invoke("glCombinerParameteriNV");
            PFN_glCombinerInputNV = func.invoke("glCombinerInputNV");
            PFN_glCombinerOutputNV = func.invoke("glCombinerOutputNV");
            PFN_glFinalCombinerInputNV = func.invoke("glFinalCombinerInputNV");
            PFN_glGetCombinerInputParameterfvNV = func.invoke("glGetCombinerInputParameterfvNV");
            PFN_glGetCombinerInputParameterivNV = func.invoke("glGetCombinerInputParameterivNV");
            PFN_glGetCombinerOutputParameterfvNV = func.invoke("glGetCombinerOutputParameterfvNV");
            PFN_glGetCombinerOutputParameterivNV = func.invoke("glGetCombinerOutputParameterivNV");
            PFN_glGetFinalCombinerInputParameterfvNV = func.invoke("glGetFinalCombinerInputParameterfvNV");
            PFN_glGetFinalCombinerInputParameterivNV = func.invoke("glGetFinalCombinerInputParameterivNV");
        }
    }

    public GLNVRegisterCombiners(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCombinerParameterfvNV`.
    /// ```
    /// void glCombinerParameterfvNV((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void CombinerParameterfvNV(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCombinerParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glCombinerParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCombinerParameterfvNV", pname, params); }
        Handles.MH_glCombinerParameterfvNV.invokeExact(handles.PFN_glCombinerParameterfvNV, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in CombinerParameterfvNV", e); }
    }

    /// Invokes `glCombinerParameterfNV`.
    /// ```
    /// void glCombinerParameterfNV((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void CombinerParameterfNV(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCombinerParameterfNV)) throw new GLSymbolNotFoundError("Symbol not found: glCombinerParameterfNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCombinerParameterfNV", pname, param); }
        Handles.MH_glCombinerParameterfNV.invokeExact(handles.PFN_glCombinerParameterfNV, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in CombinerParameterfNV", e); }
    }

    /// Invokes `glCombinerParameterivNV`.
    /// ```
    /// void glCombinerParameterivNV((unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void CombinerParameterivNV(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCombinerParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glCombinerParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCombinerParameterivNV", pname, params); }
        Handles.MH_glCombinerParameterivNV.invokeExact(handles.PFN_glCombinerParameterivNV, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in CombinerParameterivNV", e); }
    }

    /// Invokes `glCombinerParameteriNV`.
    /// ```
    /// void glCombinerParameteriNV((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void CombinerParameteriNV(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCombinerParameteriNV)) throw new GLSymbolNotFoundError("Symbol not found: glCombinerParameteriNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCombinerParameteriNV", pname, param); }
        Handles.MH_glCombinerParameteriNV.invokeExact(handles.PFN_glCombinerParameteriNV, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in CombinerParameteriNV", e); }
    }

    /// Invokes `glCombinerInputNV`.
    /// ```
    /// void glCombinerInputNV((unsigned int) GLenum stage, (unsigned int) GLenum portion, (unsigned int) GLenum variable, (unsigned int) GLenum input, (unsigned int) GLenum mapping, (unsigned int) GLenum componentUsage);
    /// ```
    public void CombinerInputNV(int stage, int portion, int variable, int input, int mapping, int componentUsage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCombinerInputNV)) throw new GLSymbolNotFoundError("Symbol not found: glCombinerInputNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCombinerInputNV", stage, portion, variable, input, mapping, componentUsage); }
        Handles.MH_glCombinerInputNV.invokeExact(handles.PFN_glCombinerInputNV, stage, portion, variable, input, mapping, componentUsage); }
        catch (Throwable e) { throw new RuntimeException("error in CombinerInputNV", e); }
    }

    /// Invokes `glCombinerOutputNV`.
    /// ```
    /// void glCombinerOutputNV((unsigned int) GLenum stage, (unsigned int) GLenum portion, (unsigned int) GLenum abOutput, (unsigned int) GLenum cdOutput, (unsigned int) GLenum sumOutput, (unsigned int) GLenum scale, (unsigned int) GLenum bias, GLboolean abDotProduct, GLboolean cdDotProduct, GLboolean muxSum);
    /// ```
    public void CombinerOutputNV(int stage, int portion, int abOutput, int cdOutput, int sumOutput, int scale, int bias, boolean abDotProduct, boolean cdDotProduct, boolean muxSum) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCombinerOutputNV)) throw new GLSymbolNotFoundError("Symbol not found: glCombinerOutputNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCombinerOutputNV", stage, portion, abOutput, cdOutput, sumOutput, scale, bias, abDotProduct, cdDotProduct, muxSum); }
        Handles.MH_glCombinerOutputNV.invokeExact(handles.PFN_glCombinerOutputNV, stage, portion, abOutput, cdOutput, sumOutput, scale, bias, ((abDotProduct) ? (byte)1 : (byte)0), ((cdDotProduct) ? (byte)1 : (byte)0), ((muxSum) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in CombinerOutputNV", e); }
    }

    /// Invokes `glFinalCombinerInputNV`.
    /// ```
    /// void glFinalCombinerInputNV((unsigned int) GLenum variable, (unsigned int) GLenum input, (unsigned int) GLenum mapping, (unsigned int) GLenum componentUsage);
    /// ```
    public void FinalCombinerInputNV(int variable, int input, int mapping, int componentUsage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinalCombinerInputNV)) throw new GLSymbolNotFoundError("Symbol not found: glFinalCombinerInputNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinalCombinerInputNV", variable, input, mapping, componentUsage); }
        Handles.MH_glFinalCombinerInputNV.invokeExact(handles.PFN_glFinalCombinerInputNV, variable, input, mapping, componentUsage); }
        catch (Throwable e) { throw new RuntimeException("error in FinalCombinerInputNV", e); }
    }

    /// Invokes `glGetCombinerInputParameterfvNV`.
    /// ```
    /// void glGetCombinerInputParameterfvNV((unsigned int) GLenum stage, (unsigned int) GLenum portion, (unsigned int) GLenum variable, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetCombinerInputParameterfvNV(int stage, int portion, int variable, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCombinerInputParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetCombinerInputParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCombinerInputParameterfvNV", stage, portion, variable, pname, params); }
        Handles.MH_glGetCombinerInputParameterfvNV.invokeExact(handles.PFN_glGetCombinerInputParameterfvNV, stage, portion, variable, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetCombinerInputParameterfvNV", e); }
    }

    /// Invokes `glGetCombinerInputParameterivNV`.
    /// ```
    /// void glGetCombinerInputParameterivNV((unsigned int) GLenum stage, (unsigned int) GLenum portion, (unsigned int) GLenum variable, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetCombinerInputParameterivNV(int stage, int portion, int variable, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCombinerInputParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetCombinerInputParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCombinerInputParameterivNV", stage, portion, variable, pname, params); }
        Handles.MH_glGetCombinerInputParameterivNV.invokeExact(handles.PFN_glGetCombinerInputParameterivNV, stage, portion, variable, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetCombinerInputParameterivNV", e); }
    }

    /// Invokes `glGetCombinerOutputParameterfvNV`.
    /// ```
    /// void glGetCombinerOutputParameterfvNV((unsigned int) GLenum stage, (unsigned int) GLenum portion, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetCombinerOutputParameterfvNV(int stage, int portion, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCombinerOutputParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetCombinerOutputParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCombinerOutputParameterfvNV", stage, portion, pname, params); }
        Handles.MH_glGetCombinerOutputParameterfvNV.invokeExact(handles.PFN_glGetCombinerOutputParameterfvNV, stage, portion, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetCombinerOutputParameterfvNV", e); }
    }

    /// Invokes `glGetCombinerOutputParameterivNV`.
    /// ```
    /// void glGetCombinerOutputParameterivNV((unsigned int) GLenum stage, (unsigned int) GLenum portion, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetCombinerOutputParameterivNV(int stage, int portion, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCombinerOutputParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetCombinerOutputParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCombinerOutputParameterivNV", stage, portion, pname, params); }
        Handles.MH_glGetCombinerOutputParameterivNV.invokeExact(handles.PFN_glGetCombinerOutputParameterivNV, stage, portion, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetCombinerOutputParameterivNV", e); }
    }

    /// Invokes `glGetFinalCombinerInputParameterfvNV`.
    /// ```
    /// void glGetFinalCombinerInputParameterfvNV((unsigned int) GLenum variable, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetFinalCombinerInputParameterfvNV(int variable, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFinalCombinerInputParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetFinalCombinerInputParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFinalCombinerInputParameterfvNV", variable, pname, params); }
        Handles.MH_glGetFinalCombinerInputParameterfvNV.invokeExact(handles.PFN_glGetFinalCombinerInputParameterfvNV, variable, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFinalCombinerInputParameterfvNV", e); }
    }

    /// Invokes `glGetFinalCombinerInputParameterivNV`.
    /// ```
    /// void glGetFinalCombinerInputParameterivNV((unsigned int) GLenum variable, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFinalCombinerInputParameterivNV(int variable, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFinalCombinerInputParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetFinalCombinerInputParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFinalCombinerInputParameterivNV", variable, pname, params); }
        Handles.MH_glGetFinalCombinerInputParameterivNV.invokeExact(handles.PFN_glGetFinalCombinerInputParameterivNV, variable, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFinalCombinerInputParameterivNV", e); }
    }

}
