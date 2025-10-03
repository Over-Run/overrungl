// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ati;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_fragment_shader`
public final class GLATIFragmentShader {
    public static final int GL_FRAGMENT_SHADER_ATI = 0x8920;
    public static final int GL_REG_0_ATI = 0x8921;
    public static final int GL_REG_1_ATI = 0x8922;
    public static final int GL_REG_2_ATI = 0x8923;
    public static final int GL_REG_3_ATI = 0x8924;
    public static final int GL_REG_4_ATI = 0x8925;
    public static final int GL_REG_5_ATI = 0x8926;
    public static final int GL_REG_6_ATI = 0x8927;
    public static final int GL_REG_7_ATI = 0x8928;
    public static final int GL_REG_8_ATI = 0x8929;
    public static final int GL_REG_9_ATI = 0x892A;
    public static final int GL_REG_10_ATI = 0x892B;
    public static final int GL_REG_11_ATI = 0x892C;
    public static final int GL_REG_12_ATI = 0x892D;
    public static final int GL_REG_13_ATI = 0x892E;
    public static final int GL_REG_14_ATI = 0x892F;
    public static final int GL_REG_15_ATI = 0x8930;
    public static final int GL_REG_16_ATI = 0x8931;
    public static final int GL_REG_17_ATI = 0x8932;
    public static final int GL_REG_18_ATI = 0x8933;
    public static final int GL_REG_19_ATI = 0x8934;
    public static final int GL_REG_20_ATI = 0x8935;
    public static final int GL_REG_21_ATI = 0x8936;
    public static final int GL_REG_22_ATI = 0x8937;
    public static final int GL_REG_23_ATI = 0x8938;
    public static final int GL_REG_24_ATI = 0x8939;
    public static final int GL_REG_25_ATI = 0x893A;
    public static final int GL_REG_26_ATI = 0x893B;
    public static final int GL_REG_27_ATI = 0x893C;
    public static final int GL_REG_28_ATI = 0x893D;
    public static final int GL_REG_29_ATI = 0x893E;
    public static final int GL_REG_30_ATI = 0x893F;
    public static final int GL_REG_31_ATI = 0x8940;
    public static final int GL_CON_0_ATI = 0x8941;
    public static final int GL_CON_1_ATI = 0x8942;
    public static final int GL_CON_2_ATI = 0x8943;
    public static final int GL_CON_3_ATI = 0x8944;
    public static final int GL_CON_4_ATI = 0x8945;
    public static final int GL_CON_5_ATI = 0x8946;
    public static final int GL_CON_6_ATI = 0x8947;
    public static final int GL_CON_7_ATI = 0x8948;
    public static final int GL_CON_8_ATI = 0x8949;
    public static final int GL_CON_9_ATI = 0x894A;
    public static final int GL_CON_10_ATI = 0x894B;
    public static final int GL_CON_11_ATI = 0x894C;
    public static final int GL_CON_12_ATI = 0x894D;
    public static final int GL_CON_13_ATI = 0x894E;
    public static final int GL_CON_14_ATI = 0x894F;
    public static final int GL_CON_15_ATI = 0x8950;
    public static final int GL_CON_16_ATI = 0x8951;
    public static final int GL_CON_17_ATI = 0x8952;
    public static final int GL_CON_18_ATI = 0x8953;
    public static final int GL_CON_19_ATI = 0x8954;
    public static final int GL_CON_20_ATI = 0x8955;
    public static final int GL_CON_21_ATI = 0x8956;
    public static final int GL_CON_22_ATI = 0x8957;
    public static final int GL_CON_23_ATI = 0x8958;
    public static final int GL_CON_24_ATI = 0x8959;
    public static final int GL_CON_25_ATI = 0x895A;
    public static final int GL_CON_26_ATI = 0x895B;
    public static final int GL_CON_27_ATI = 0x895C;
    public static final int GL_CON_28_ATI = 0x895D;
    public static final int GL_CON_29_ATI = 0x895E;
    public static final int GL_CON_30_ATI = 0x895F;
    public static final int GL_CON_31_ATI = 0x8960;
    public static final int GL_MOV_ATI = 0x8961;
    public static final int GL_ADD_ATI = 0x8963;
    public static final int GL_MUL_ATI = 0x8964;
    public static final int GL_SUB_ATI = 0x8965;
    public static final int GL_DOT3_ATI = 0x8966;
    public static final int GL_DOT4_ATI = 0x8967;
    public static final int GL_MAD_ATI = 0x8968;
    public static final int GL_LERP_ATI = 0x8969;
    public static final int GL_CND_ATI = 0x896A;
    public static final int GL_CND0_ATI = 0x896B;
    public static final int GL_DOT2_ADD_ATI = 0x896C;
    public static final int GL_SECONDARY_INTERPOLATOR_ATI = 0x896D;
    public static final int GL_NUM_FRAGMENT_REGISTERS_ATI = 0x896E;
    public static final int GL_NUM_FRAGMENT_CONSTANTS_ATI = 0x896F;
    public static final int GL_NUM_PASSES_ATI = 0x8970;
    public static final int GL_NUM_INSTRUCTIONS_PER_PASS_ATI = 0x8971;
    public static final int GL_NUM_INSTRUCTIONS_TOTAL_ATI = 0x8972;
    public static final int GL_NUM_INPUT_INTERPOLATOR_COMPONENTS_ATI = 0x8973;
    public static final int GL_NUM_LOOPBACK_COMPONENTS_ATI = 0x8974;
    public static final int GL_COLOR_ALPHA_PAIRING_ATI = 0x8975;
    public static final int GL_SWIZZLE_STR_ATI = 0x8976;
    public static final int GL_SWIZZLE_STQ_ATI = 0x8977;
    public static final int GL_SWIZZLE_STR_DR_ATI = 0x8978;
    public static final int GL_SWIZZLE_STQ_DQ_ATI = 0x8979;
    public static final int GL_SWIZZLE_STRQ_ATI = 0x897A;
    public static final int GL_SWIZZLE_STRQ_DQ_ATI = 0x897B;
    public static final int GL_RED_BIT_ATI = 0x00000001;
    public static final int GL_GREEN_BIT_ATI = 0x00000002;
    public static final int GL_BLUE_BIT_ATI = 0x00000004;
    public static final int GL_2X_BIT_ATI = 0x00000001;
    public static final int GL_4X_BIT_ATI = 0x00000002;
    public static final int GL_8X_BIT_ATI = 0x00000004;
    public static final int GL_HALF_BIT_ATI = 0x00000008;
    public static final int GL_QUARTER_BIT_ATI = 0x00000010;
    public static final int GL_EIGHTH_BIT_ATI = 0x00000020;
    public static final int GL_SATURATE_BIT_ATI = 0x00000040;
    public static final int GL_COMP_BIT_ATI = 0x00000002;
    public static final int GL_NEGATE_BIT_ATI = 0x00000004;
    public static final int GL_BIAS_BIT_ATI = 0x00000008;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGenFragmentShadersATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBindFragmentShaderATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDeleteFragmentShaderATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBeginFragmentShaderATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public static final Supplier<MethodHandle> MH_glEndFragmentShaderATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public static final Supplier<MethodHandle> MH_glPassTexCoordATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glSampleMapATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glColorFragmentOp1ATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glColorFragmentOp2ATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glColorFragmentOp3ATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glAlphaFragmentOp1ATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glAlphaFragmentOp2ATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glAlphaFragmentOp3ATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glSetFragmentShaderConstantATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGenFragmentShadersATI;
        public final MemorySegment PFN_glBindFragmentShaderATI;
        public final MemorySegment PFN_glDeleteFragmentShaderATI;
        public final MemorySegment PFN_glBeginFragmentShaderATI;
        public final MemorySegment PFN_glEndFragmentShaderATI;
        public final MemorySegment PFN_glPassTexCoordATI;
        public final MemorySegment PFN_glSampleMapATI;
        public final MemorySegment PFN_glColorFragmentOp1ATI;
        public final MemorySegment PFN_glColorFragmentOp2ATI;
        public final MemorySegment PFN_glColorFragmentOp3ATI;
        public final MemorySegment PFN_glAlphaFragmentOp1ATI;
        public final MemorySegment PFN_glAlphaFragmentOp2ATI;
        public final MemorySegment PFN_glAlphaFragmentOp3ATI;
        public final MemorySegment PFN_glSetFragmentShaderConstantATI;
        private Handles(GLLoadFunc func) {
            PFN_glGenFragmentShadersATI = func.invoke("glGenFragmentShadersATI");
            PFN_glBindFragmentShaderATI = func.invoke("glBindFragmentShaderATI");
            PFN_glDeleteFragmentShaderATI = func.invoke("glDeleteFragmentShaderATI");
            PFN_glBeginFragmentShaderATI = func.invoke("glBeginFragmentShaderATI");
            PFN_glEndFragmentShaderATI = func.invoke("glEndFragmentShaderATI");
            PFN_glPassTexCoordATI = func.invoke("glPassTexCoordATI");
            PFN_glSampleMapATI = func.invoke("glSampleMapATI");
            PFN_glColorFragmentOp1ATI = func.invoke("glColorFragmentOp1ATI");
            PFN_glColorFragmentOp2ATI = func.invoke("glColorFragmentOp2ATI");
            PFN_glColorFragmentOp3ATI = func.invoke("glColorFragmentOp3ATI");
            PFN_glAlphaFragmentOp1ATI = func.invoke("glAlphaFragmentOp1ATI");
            PFN_glAlphaFragmentOp2ATI = func.invoke("glAlphaFragmentOp2ATI");
            PFN_glAlphaFragmentOp3ATI = func.invoke("glAlphaFragmentOp3ATI");
            PFN_glSetFragmentShaderConstantATI = func.invoke("glSetFragmentShaderConstantATI");
        }
    }

    public GLATIFragmentShader(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGenFragmentShadersATI`.
    /// ```
    /// (unsigned int) GLuint glGenFragmentShadersATI((unsigned int) GLuint range);
    /// ```
    public int GenFragmentShadersATI(int range) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenFragmentShadersATI)) throw new GLSymbolNotFoundError("Symbol not found: glGenFragmentShadersATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenFragmentShadersATI", range); }
        return (int) Handles.MH_glGenFragmentShadersATI.get().invokeExact(handles.PFN_glGenFragmentShadersATI, range); }
        catch (Throwable e) { throw new RuntimeException("error in GenFragmentShadersATI", e); }
    }

    /// Invokes `glBindFragmentShaderATI`.
    /// ```
    /// void glBindFragmentShaderATI((unsigned int) GLuint id);
    /// ```
    public void BindFragmentShaderATI(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindFragmentShaderATI)) throw new GLSymbolNotFoundError("Symbol not found: glBindFragmentShaderATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindFragmentShaderATI", id); }
        Handles.MH_glBindFragmentShaderATI.get().invokeExact(handles.PFN_glBindFragmentShaderATI, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindFragmentShaderATI", e); }
    }

    /// Invokes `glDeleteFragmentShaderATI`.
    /// ```
    /// void glDeleteFragmentShaderATI((unsigned int) GLuint id);
    /// ```
    public void DeleteFragmentShaderATI(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteFragmentShaderATI)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteFragmentShaderATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteFragmentShaderATI", id); }
        Handles.MH_glDeleteFragmentShaderATI.get().invokeExact(handles.PFN_glDeleteFragmentShaderATI, id); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteFragmentShaderATI", e); }
    }

    /// Invokes `glBeginFragmentShaderATI`.
    /// ```
    /// void glBeginFragmentShaderATI();
    /// ```
    public void BeginFragmentShaderATI() {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginFragmentShaderATI)) throw new GLSymbolNotFoundError("Symbol not found: glBeginFragmentShaderATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginFragmentShaderATI"); }
        Handles.MH_glBeginFragmentShaderATI.get().invokeExact(handles.PFN_glBeginFragmentShaderATI); }
        catch (Throwable e) { throw new RuntimeException("error in BeginFragmentShaderATI", e); }
    }

    /// Invokes `glEndFragmentShaderATI`.
    /// ```
    /// void glEndFragmentShaderATI();
    /// ```
    public void EndFragmentShaderATI() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndFragmentShaderATI)) throw new GLSymbolNotFoundError("Symbol not found: glEndFragmentShaderATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndFragmentShaderATI"); }
        Handles.MH_glEndFragmentShaderATI.get().invokeExact(handles.PFN_glEndFragmentShaderATI); }
        catch (Throwable e) { throw new RuntimeException("error in EndFragmentShaderATI", e); }
    }

    /// Invokes `glPassTexCoordATI`.
    /// ```
    /// void glPassTexCoordATI((unsigned int) GLuint dst, (unsigned int) GLuint coord, (unsigned int) GLenum swizzle);
    /// ```
    public void PassTexCoordATI(int dst, int coord, int swizzle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPassTexCoordATI)) throw new GLSymbolNotFoundError("Symbol not found: glPassTexCoordATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPassTexCoordATI", dst, coord, swizzle); }
        Handles.MH_glPassTexCoordATI.get().invokeExact(handles.PFN_glPassTexCoordATI, dst, coord, swizzle); }
        catch (Throwable e) { throw new RuntimeException("error in PassTexCoordATI", e); }
    }

    /// Invokes `glSampleMapATI`.
    /// ```
    /// void glSampleMapATI((unsigned int) GLuint dst, (unsigned int) GLuint interp, (unsigned int) GLenum swizzle);
    /// ```
    public void SampleMapATI(int dst, int interp, int swizzle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleMapATI)) throw new GLSymbolNotFoundError("Symbol not found: glSampleMapATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSampleMapATI", dst, interp, swizzle); }
        Handles.MH_glSampleMapATI.get().invokeExact(handles.PFN_glSampleMapATI, dst, interp, swizzle); }
        catch (Throwable e) { throw new RuntimeException("error in SampleMapATI", e); }
    }

    /// Invokes `glColorFragmentOp1ATI`.
    /// ```
    /// void glColorFragmentOp1ATI((unsigned int) GLenum op, (unsigned int) GLuint dst, (unsigned int) GLuint dstMask, (unsigned int) GLuint dstMod, (unsigned int) GLuint arg1, (unsigned int) GLuint arg1Rep, (unsigned int) GLuint arg1Mod);
    /// ```
    public void ColorFragmentOp1ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorFragmentOp1ATI)) throw new GLSymbolNotFoundError("Symbol not found: glColorFragmentOp1ATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorFragmentOp1ATI", op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod); }
        Handles.MH_glColorFragmentOp1ATI.get().invokeExact(handles.PFN_glColorFragmentOp1ATI, op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod); }
        catch (Throwable e) { throw new RuntimeException("error in ColorFragmentOp1ATI", e); }
    }

    /// Invokes `glColorFragmentOp2ATI`.
    /// ```
    /// void glColorFragmentOp2ATI((unsigned int) GLenum op, (unsigned int) GLuint dst, (unsigned int) GLuint dstMask, (unsigned int) GLuint dstMod, (unsigned int) GLuint arg1, (unsigned int) GLuint arg1Rep, (unsigned int) GLuint arg1Mod, (unsigned int) GLuint arg2, (unsigned int) GLuint arg2Rep, (unsigned int) GLuint arg2Mod);
    /// ```
    public void ColorFragmentOp2ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorFragmentOp2ATI)) throw new GLSymbolNotFoundError("Symbol not found: glColorFragmentOp2ATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorFragmentOp2ATI", op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod); }
        Handles.MH_glColorFragmentOp2ATI.get().invokeExact(handles.PFN_glColorFragmentOp2ATI, op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod); }
        catch (Throwable e) { throw new RuntimeException("error in ColorFragmentOp2ATI", e); }
    }

    /// Invokes `glColorFragmentOp3ATI`.
    /// ```
    /// void glColorFragmentOp3ATI((unsigned int) GLenum op, (unsigned int) GLuint dst, (unsigned int) GLuint dstMask, (unsigned int) GLuint dstMod, (unsigned int) GLuint arg1, (unsigned int) GLuint arg1Rep, (unsigned int) GLuint arg1Mod, (unsigned int) GLuint arg2, (unsigned int) GLuint arg2Rep, (unsigned int) GLuint arg2Mod, (unsigned int) GLuint arg3, (unsigned int) GLuint arg3Rep, (unsigned int) GLuint arg3Mod);
    /// ```
    public void ColorFragmentOp3ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod, int arg3, int arg3Rep, int arg3Mod) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorFragmentOp3ATI)) throw new GLSymbolNotFoundError("Symbol not found: glColorFragmentOp3ATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorFragmentOp3ATI", op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod, arg3, arg3Rep, arg3Mod); }
        Handles.MH_glColorFragmentOp3ATI.get().invokeExact(handles.PFN_glColorFragmentOp3ATI, op, dst, dstMask, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod, arg3, arg3Rep, arg3Mod); }
        catch (Throwable e) { throw new RuntimeException("error in ColorFragmentOp3ATI", e); }
    }

    /// Invokes `glAlphaFragmentOp1ATI`.
    /// ```
    /// void glAlphaFragmentOp1ATI((unsigned int) GLenum op, (unsigned int) GLuint dst, (unsigned int) GLuint dstMod, (unsigned int) GLuint arg1, (unsigned int) GLuint arg1Rep, (unsigned int) GLuint arg1Mod);
    /// ```
    public void AlphaFragmentOp1ATI(int op, int dst, int dstMod, int arg1, int arg1Rep, int arg1Mod) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAlphaFragmentOp1ATI)) throw new GLSymbolNotFoundError("Symbol not found: glAlphaFragmentOp1ATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAlphaFragmentOp1ATI", op, dst, dstMod, arg1, arg1Rep, arg1Mod); }
        Handles.MH_glAlphaFragmentOp1ATI.get().invokeExact(handles.PFN_glAlphaFragmentOp1ATI, op, dst, dstMod, arg1, arg1Rep, arg1Mod); }
        catch (Throwable e) { throw new RuntimeException("error in AlphaFragmentOp1ATI", e); }
    }

    /// Invokes `glAlphaFragmentOp2ATI`.
    /// ```
    /// void glAlphaFragmentOp2ATI((unsigned int) GLenum op, (unsigned int) GLuint dst, (unsigned int) GLuint dstMod, (unsigned int) GLuint arg1, (unsigned int) GLuint arg1Rep, (unsigned int) GLuint arg1Mod, (unsigned int) GLuint arg2, (unsigned int) GLuint arg2Rep, (unsigned int) GLuint arg2Mod);
    /// ```
    public void AlphaFragmentOp2ATI(int op, int dst, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAlphaFragmentOp2ATI)) throw new GLSymbolNotFoundError("Symbol not found: glAlphaFragmentOp2ATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAlphaFragmentOp2ATI", op, dst, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod); }
        Handles.MH_glAlphaFragmentOp2ATI.get().invokeExact(handles.PFN_glAlphaFragmentOp2ATI, op, dst, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod); }
        catch (Throwable e) { throw new RuntimeException("error in AlphaFragmentOp2ATI", e); }
    }

    /// Invokes `glAlphaFragmentOp3ATI`.
    /// ```
    /// void glAlphaFragmentOp3ATI((unsigned int) GLenum op, (unsigned int) GLuint dst, (unsigned int) GLuint dstMod, (unsigned int) GLuint arg1, (unsigned int) GLuint arg1Rep, (unsigned int) GLuint arg1Mod, (unsigned int) GLuint arg2, (unsigned int) GLuint arg2Rep, (unsigned int) GLuint arg2Mod, (unsigned int) GLuint arg3, (unsigned int) GLuint arg3Rep, (unsigned int) GLuint arg3Mod);
    /// ```
    public void AlphaFragmentOp3ATI(int op, int dst, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod, int arg3, int arg3Rep, int arg3Mod) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAlphaFragmentOp3ATI)) throw new GLSymbolNotFoundError("Symbol not found: glAlphaFragmentOp3ATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAlphaFragmentOp3ATI", op, dst, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod, arg3, arg3Rep, arg3Mod); }
        Handles.MH_glAlphaFragmentOp3ATI.get().invokeExact(handles.PFN_glAlphaFragmentOp3ATI, op, dst, dstMod, arg1, arg1Rep, arg1Mod, arg2, arg2Rep, arg2Mod, arg3, arg3Rep, arg3Mod); }
        catch (Throwable e) { throw new RuntimeException("error in AlphaFragmentOp3ATI", e); }
    }

    /// Invokes `glSetFragmentShaderConstantATI`.
    /// ```
    /// void glSetFragmentShaderConstantATI((unsigned int) GLuint dst, const GLfloat* value);
    /// ```
    public void SetFragmentShaderConstantATI(int dst, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSetFragmentShaderConstantATI)) throw new GLSymbolNotFoundError("Symbol not found: glSetFragmentShaderConstantATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSetFragmentShaderConstantATI", dst, value); }
        Handles.MH_glSetFragmentShaderConstantATI.get().invokeExact(handles.PFN_glSetFragmentShaderConstantATI, dst, value); }
        catch (Throwable e) { throw new RuntimeException("error in SetFragmentShaderConstantATI", e); }
    }

}
