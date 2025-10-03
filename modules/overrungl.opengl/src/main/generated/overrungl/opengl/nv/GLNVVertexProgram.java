// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_vertex_program`
public final class GLNVVertexProgram {
    public static final int GL_VERTEX_PROGRAM_NV = 0x8620;
    public static final int GL_VERTEX_STATE_PROGRAM_NV = 0x8621;
    public static final int GL_ATTRIB_ARRAY_SIZE_NV = 0x8623;
    public static final int GL_ATTRIB_ARRAY_STRIDE_NV = 0x8624;
    public static final int GL_ATTRIB_ARRAY_TYPE_NV = 0x8625;
    public static final int GL_CURRENT_ATTRIB_NV = 0x8626;
    public static final int GL_PROGRAM_LENGTH_NV = 0x8627;
    public static final int GL_PROGRAM_STRING_NV = 0x8628;
    public static final int GL_MODELVIEW_PROJECTION_NV = 0x8629;
    public static final int GL_IDENTITY_NV = 0x862A;
    public static final int GL_INVERSE_NV = 0x862B;
    public static final int GL_TRANSPOSE_NV = 0x862C;
    public static final int GL_INVERSE_TRANSPOSE_NV = 0x862D;
    public static final int GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV = 0x862E;
    public static final int GL_MAX_TRACK_MATRICES_NV = 0x862F;
    public static final int GL_MATRIX0_NV = 0x8630;
    public static final int GL_MATRIX1_NV = 0x8631;
    public static final int GL_MATRIX2_NV = 0x8632;
    public static final int GL_MATRIX3_NV = 0x8633;
    public static final int GL_MATRIX4_NV = 0x8634;
    public static final int GL_MATRIX5_NV = 0x8635;
    public static final int GL_MATRIX6_NV = 0x8636;
    public static final int GL_MATRIX7_NV = 0x8637;
    public static final int GL_CURRENT_MATRIX_STACK_DEPTH_NV = 0x8640;
    public static final int GL_CURRENT_MATRIX_NV = 0x8641;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE_NV = 0x8642;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE_NV = 0x8643;
    public static final int GL_PROGRAM_PARAMETER_NV = 0x8644;
    public static final int GL_ATTRIB_ARRAY_POINTER_NV = 0x8645;
    public static final int GL_PROGRAM_TARGET_NV = 0x8646;
    public static final int GL_PROGRAM_RESIDENT_NV = 0x8647;
    public static final int GL_TRACK_MATRIX_NV = 0x8648;
    public static final int GL_TRACK_MATRIX_TRANSFORM_NV = 0x8649;
    public static final int GL_VERTEX_PROGRAM_BINDING_NV = 0x864A;
    public static final int GL_PROGRAM_ERROR_POSITION_NV = 0x864B;
    public static final int GL_VERTEX_ATTRIB_ARRAY0_NV = 0x8650;
    public static final int GL_VERTEX_ATTRIB_ARRAY1_NV = 0x8651;
    public static final int GL_VERTEX_ATTRIB_ARRAY2_NV = 0x8652;
    public static final int GL_VERTEX_ATTRIB_ARRAY3_NV = 0x8653;
    public static final int GL_VERTEX_ATTRIB_ARRAY4_NV = 0x8654;
    public static final int GL_VERTEX_ATTRIB_ARRAY5_NV = 0x8655;
    public static final int GL_VERTEX_ATTRIB_ARRAY6_NV = 0x8656;
    public static final int GL_VERTEX_ATTRIB_ARRAY7_NV = 0x8657;
    public static final int GL_VERTEX_ATTRIB_ARRAY8_NV = 0x8658;
    public static final int GL_VERTEX_ATTRIB_ARRAY9_NV = 0x8659;
    public static final int GL_VERTEX_ATTRIB_ARRAY10_NV = 0x865A;
    public static final int GL_VERTEX_ATTRIB_ARRAY11_NV = 0x865B;
    public static final int GL_VERTEX_ATTRIB_ARRAY12_NV = 0x865C;
    public static final int GL_VERTEX_ATTRIB_ARRAY13_NV = 0x865D;
    public static final int GL_VERTEX_ATTRIB_ARRAY14_NV = 0x865E;
    public static final int GL_VERTEX_ATTRIB_ARRAY15_NV = 0x865F;
    public static final int GL_MAP1_VERTEX_ATTRIB0_4_NV = 0x8660;
    public static final int GL_MAP1_VERTEX_ATTRIB1_4_NV = 0x8661;
    public static final int GL_MAP1_VERTEX_ATTRIB2_4_NV = 0x8662;
    public static final int GL_MAP1_VERTEX_ATTRIB3_4_NV = 0x8663;
    public static final int GL_MAP1_VERTEX_ATTRIB4_4_NV = 0x8664;
    public static final int GL_MAP1_VERTEX_ATTRIB5_4_NV = 0x8665;
    public static final int GL_MAP1_VERTEX_ATTRIB6_4_NV = 0x8666;
    public static final int GL_MAP1_VERTEX_ATTRIB7_4_NV = 0x8667;
    public static final int GL_MAP1_VERTEX_ATTRIB8_4_NV = 0x8668;
    public static final int GL_MAP1_VERTEX_ATTRIB9_4_NV = 0x8669;
    public static final int GL_MAP1_VERTEX_ATTRIB10_4_NV = 0x866A;
    public static final int GL_MAP1_VERTEX_ATTRIB11_4_NV = 0x866B;
    public static final int GL_MAP1_VERTEX_ATTRIB12_4_NV = 0x866C;
    public static final int GL_MAP1_VERTEX_ATTRIB13_4_NV = 0x866D;
    public static final int GL_MAP1_VERTEX_ATTRIB14_4_NV = 0x866E;
    public static final int GL_MAP1_VERTEX_ATTRIB15_4_NV = 0x866F;
    public static final int GL_MAP2_VERTEX_ATTRIB0_4_NV = 0x8670;
    public static final int GL_MAP2_VERTEX_ATTRIB1_4_NV = 0x8671;
    public static final int GL_MAP2_VERTEX_ATTRIB2_4_NV = 0x8672;
    public static final int GL_MAP2_VERTEX_ATTRIB3_4_NV = 0x8673;
    public static final int GL_MAP2_VERTEX_ATTRIB4_4_NV = 0x8674;
    public static final int GL_MAP2_VERTEX_ATTRIB5_4_NV = 0x8675;
    public static final int GL_MAP2_VERTEX_ATTRIB6_4_NV = 0x8676;
    public static final int GL_MAP2_VERTEX_ATTRIB7_4_NV = 0x8677;
    public static final int GL_MAP2_VERTEX_ATTRIB8_4_NV = 0x8678;
    public static final int GL_MAP2_VERTEX_ATTRIB9_4_NV = 0x8679;
    public static final int GL_MAP2_VERTEX_ATTRIB10_4_NV = 0x867A;
    public static final int GL_MAP2_VERTEX_ATTRIB11_4_NV = 0x867B;
    public static final int GL_MAP2_VERTEX_ATTRIB12_4_NV = 0x867C;
    public static final int GL_MAP2_VERTEX_ATTRIB13_4_NV = 0x867D;
    public static final int GL_MAP2_VERTEX_ATTRIB14_4_NV = 0x867E;
    public static final int GL_MAP2_VERTEX_ATTRIB15_4_NV = 0x867F;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glAreProgramsResidentNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glBindProgramNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDeleteProgramsNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glExecuteProgramNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGenProgramsNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetProgramParameterdvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetProgramParameterfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetProgramivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetProgramStringNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetTrackMatrixivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVertexAttribdvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVertexAttribfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVertexAttribivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVertexAttribPointervNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsProgramNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glLoadProgramNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramParameter4dNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glProgramParameter4dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramParameter4fNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glProgramParameter4fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramParameters4dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glProgramParameters4fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glRequestResidentProgramsNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTrackMatrixNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glVertexAttribPointerNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib1dNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib1dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib1fNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib1fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib1sNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib1svNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib2dNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib2dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib2fNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib2fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib2sNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib2svNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib3dNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib3dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib3fNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib3fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib3sNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib3svNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4dNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4fNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4sNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4svNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4ubNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4ubvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs1dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs1fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs1svNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs2dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs2fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs2svNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs3dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs3fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs3svNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs4dvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs4fvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs4svNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs4ubvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glAreProgramsResidentNV;
        public final MemorySegment PFN_glBindProgramNV;
        public final MemorySegment PFN_glDeleteProgramsNV;
        public final MemorySegment PFN_glExecuteProgramNV;
        public final MemorySegment PFN_glGenProgramsNV;
        public final MemorySegment PFN_glGetProgramParameterdvNV;
        public final MemorySegment PFN_glGetProgramParameterfvNV;
        public final MemorySegment PFN_glGetProgramivNV;
        public final MemorySegment PFN_glGetProgramStringNV;
        public final MemorySegment PFN_glGetTrackMatrixivNV;
        public final MemorySegment PFN_glGetVertexAttribdvNV;
        public final MemorySegment PFN_glGetVertexAttribfvNV;
        public final MemorySegment PFN_glGetVertexAttribivNV;
        public final MemorySegment PFN_glGetVertexAttribPointervNV;
        public final MemorySegment PFN_glIsProgramNV;
        public final MemorySegment PFN_glLoadProgramNV;
        public final MemorySegment PFN_glProgramParameter4dNV;
        public final MemorySegment PFN_glProgramParameter4dvNV;
        public final MemorySegment PFN_glProgramParameter4fNV;
        public final MemorySegment PFN_glProgramParameter4fvNV;
        public final MemorySegment PFN_glProgramParameters4dvNV;
        public final MemorySegment PFN_glProgramParameters4fvNV;
        public final MemorySegment PFN_glRequestResidentProgramsNV;
        public final MemorySegment PFN_glTrackMatrixNV;
        public final MemorySegment PFN_glVertexAttribPointerNV;
        public final MemorySegment PFN_glVertexAttrib1dNV;
        public final MemorySegment PFN_glVertexAttrib1dvNV;
        public final MemorySegment PFN_glVertexAttrib1fNV;
        public final MemorySegment PFN_glVertexAttrib1fvNV;
        public final MemorySegment PFN_glVertexAttrib1sNV;
        public final MemorySegment PFN_glVertexAttrib1svNV;
        public final MemorySegment PFN_glVertexAttrib2dNV;
        public final MemorySegment PFN_glVertexAttrib2dvNV;
        public final MemorySegment PFN_glVertexAttrib2fNV;
        public final MemorySegment PFN_glVertexAttrib2fvNV;
        public final MemorySegment PFN_glVertexAttrib2sNV;
        public final MemorySegment PFN_glVertexAttrib2svNV;
        public final MemorySegment PFN_glVertexAttrib3dNV;
        public final MemorySegment PFN_glVertexAttrib3dvNV;
        public final MemorySegment PFN_glVertexAttrib3fNV;
        public final MemorySegment PFN_glVertexAttrib3fvNV;
        public final MemorySegment PFN_glVertexAttrib3sNV;
        public final MemorySegment PFN_glVertexAttrib3svNV;
        public final MemorySegment PFN_glVertexAttrib4dNV;
        public final MemorySegment PFN_glVertexAttrib4dvNV;
        public final MemorySegment PFN_glVertexAttrib4fNV;
        public final MemorySegment PFN_glVertexAttrib4fvNV;
        public final MemorySegment PFN_glVertexAttrib4sNV;
        public final MemorySegment PFN_glVertexAttrib4svNV;
        public final MemorySegment PFN_glVertexAttrib4ubNV;
        public final MemorySegment PFN_glVertexAttrib4ubvNV;
        public final MemorySegment PFN_glVertexAttribs1dvNV;
        public final MemorySegment PFN_glVertexAttribs1fvNV;
        public final MemorySegment PFN_glVertexAttribs1svNV;
        public final MemorySegment PFN_glVertexAttribs2dvNV;
        public final MemorySegment PFN_glVertexAttribs2fvNV;
        public final MemorySegment PFN_glVertexAttribs2svNV;
        public final MemorySegment PFN_glVertexAttribs3dvNV;
        public final MemorySegment PFN_glVertexAttribs3fvNV;
        public final MemorySegment PFN_glVertexAttribs3svNV;
        public final MemorySegment PFN_glVertexAttribs4dvNV;
        public final MemorySegment PFN_glVertexAttribs4fvNV;
        public final MemorySegment PFN_glVertexAttribs4svNV;
        public final MemorySegment PFN_glVertexAttribs4ubvNV;
        private Handles(GLLoadFunc func) {
            PFN_glAreProgramsResidentNV = func.invoke("glAreProgramsResidentNV");
            PFN_glBindProgramNV = func.invoke("glBindProgramNV", "glBindProgramARB");
            PFN_glDeleteProgramsNV = func.invoke("glDeleteProgramsNV", "glDeleteProgramsARB");
            PFN_glExecuteProgramNV = func.invoke("glExecuteProgramNV");
            PFN_glGenProgramsNV = func.invoke("glGenProgramsNV", "glGenProgramsARB");
            PFN_glGetProgramParameterdvNV = func.invoke("glGetProgramParameterdvNV");
            PFN_glGetProgramParameterfvNV = func.invoke("glGetProgramParameterfvNV");
            PFN_glGetProgramivNV = func.invoke("glGetProgramivNV");
            PFN_glGetProgramStringNV = func.invoke("glGetProgramStringNV");
            PFN_glGetTrackMatrixivNV = func.invoke("glGetTrackMatrixivNV");
            PFN_glGetVertexAttribdvNV = func.invoke("glGetVertexAttribdvNV", "glGetVertexAttribdv");
            PFN_glGetVertexAttribfvNV = func.invoke("glGetVertexAttribfvNV", "glGetVertexAttribfv");
            PFN_glGetVertexAttribivNV = func.invoke("glGetVertexAttribivNV", "glGetVertexAttribiv");
            PFN_glGetVertexAttribPointervNV = func.invoke("glGetVertexAttribPointervNV", "glGetVertexAttribPointerv");
            PFN_glIsProgramNV = func.invoke("glIsProgramNV", "glIsProgramARB");
            PFN_glLoadProgramNV = func.invoke("glLoadProgramNV");
            PFN_glProgramParameter4dNV = func.invoke("glProgramParameter4dNV");
            PFN_glProgramParameter4dvNV = func.invoke("glProgramParameter4dvNV");
            PFN_glProgramParameter4fNV = func.invoke("glProgramParameter4fNV");
            PFN_glProgramParameter4fvNV = func.invoke("glProgramParameter4fvNV");
            PFN_glProgramParameters4dvNV = func.invoke("glProgramParameters4dvNV");
            PFN_glProgramParameters4fvNV = func.invoke("glProgramParameters4fvNV");
            PFN_glRequestResidentProgramsNV = func.invoke("glRequestResidentProgramsNV");
            PFN_glTrackMatrixNV = func.invoke("glTrackMatrixNV");
            PFN_glVertexAttribPointerNV = func.invoke("glVertexAttribPointerNV");
            PFN_glVertexAttrib1dNV = func.invoke("glVertexAttrib1dNV", "glVertexAttrib1d");
            PFN_glVertexAttrib1dvNV = func.invoke("glVertexAttrib1dvNV", "glVertexAttrib1dv");
            PFN_glVertexAttrib1fNV = func.invoke("glVertexAttrib1fNV", "glVertexAttrib1f");
            PFN_glVertexAttrib1fvNV = func.invoke("glVertexAttrib1fvNV", "glVertexAttrib1fv");
            PFN_glVertexAttrib1sNV = func.invoke("glVertexAttrib1sNV", "glVertexAttrib1s");
            PFN_glVertexAttrib1svNV = func.invoke("glVertexAttrib1svNV", "glVertexAttrib1sv");
            PFN_glVertexAttrib2dNV = func.invoke("glVertexAttrib2dNV", "glVertexAttrib2d");
            PFN_glVertexAttrib2dvNV = func.invoke("glVertexAttrib2dvNV", "glVertexAttrib2dv");
            PFN_glVertexAttrib2fNV = func.invoke("glVertexAttrib2fNV", "glVertexAttrib2f");
            PFN_glVertexAttrib2fvNV = func.invoke("glVertexAttrib2fvNV", "glVertexAttrib2fv");
            PFN_glVertexAttrib2sNV = func.invoke("glVertexAttrib2sNV", "glVertexAttrib2s");
            PFN_glVertexAttrib2svNV = func.invoke("glVertexAttrib2svNV", "glVertexAttrib2sv");
            PFN_glVertexAttrib3dNV = func.invoke("glVertexAttrib3dNV", "glVertexAttrib3d");
            PFN_glVertexAttrib3dvNV = func.invoke("glVertexAttrib3dvNV", "glVertexAttrib3dv");
            PFN_glVertexAttrib3fNV = func.invoke("glVertexAttrib3fNV", "glVertexAttrib3f");
            PFN_glVertexAttrib3fvNV = func.invoke("glVertexAttrib3fvNV", "glVertexAttrib3fv");
            PFN_glVertexAttrib3sNV = func.invoke("glVertexAttrib3sNV", "glVertexAttrib3s");
            PFN_glVertexAttrib3svNV = func.invoke("glVertexAttrib3svNV", "glVertexAttrib3sv");
            PFN_glVertexAttrib4dNV = func.invoke("glVertexAttrib4dNV", "glVertexAttrib4d");
            PFN_glVertexAttrib4dvNV = func.invoke("glVertexAttrib4dvNV", "glVertexAttrib4dv");
            PFN_glVertexAttrib4fNV = func.invoke("glVertexAttrib4fNV", "glVertexAttrib4f");
            PFN_glVertexAttrib4fvNV = func.invoke("glVertexAttrib4fvNV", "glVertexAttrib4fv");
            PFN_glVertexAttrib4sNV = func.invoke("glVertexAttrib4sNV", "glVertexAttrib4s");
            PFN_glVertexAttrib4svNV = func.invoke("glVertexAttrib4svNV", "glVertexAttrib4sv");
            PFN_glVertexAttrib4ubNV = func.invoke("glVertexAttrib4ubNV", "glVertexAttrib4Nub");
            PFN_glVertexAttrib4ubvNV = func.invoke("glVertexAttrib4ubvNV", "glVertexAttrib4Nubv");
            PFN_glVertexAttribs1dvNV = func.invoke("glVertexAttribs1dvNV");
            PFN_glVertexAttribs1fvNV = func.invoke("glVertexAttribs1fvNV");
            PFN_glVertexAttribs1svNV = func.invoke("glVertexAttribs1svNV");
            PFN_glVertexAttribs2dvNV = func.invoke("glVertexAttribs2dvNV");
            PFN_glVertexAttribs2fvNV = func.invoke("glVertexAttribs2fvNV");
            PFN_glVertexAttribs2svNV = func.invoke("glVertexAttribs2svNV");
            PFN_glVertexAttribs3dvNV = func.invoke("glVertexAttribs3dvNV");
            PFN_glVertexAttribs3fvNV = func.invoke("glVertexAttribs3fvNV");
            PFN_glVertexAttribs3svNV = func.invoke("glVertexAttribs3svNV");
            PFN_glVertexAttribs4dvNV = func.invoke("glVertexAttribs4dvNV");
            PFN_glVertexAttribs4fvNV = func.invoke("glVertexAttribs4fvNV");
            PFN_glVertexAttribs4svNV = func.invoke("glVertexAttribs4svNV");
            PFN_glVertexAttribs4ubvNV = func.invoke("glVertexAttribs4ubvNV");
        }
    }

    public GLNVVertexProgram(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glAreProgramsResidentNV`.
    /// ```
    /// GLboolean glAreProgramsResidentNV((int) GLsizei n, const GLuint* programs, GLboolean* residences);
    /// ```
    public boolean AreProgramsResidentNV(int n, @NonNull MemorySegment programs, @NonNull MemorySegment residences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAreProgramsResidentNV)) throw new GLSymbolNotFoundError("Symbol not found: glAreProgramsResidentNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAreProgramsResidentNV", n, programs, residences); }
        return (((byte) Handles.MH_glAreProgramsResidentNV.get().invokeExact(handles.PFN_glAreProgramsResidentNV, n, programs, residences)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in AreProgramsResidentNV", e); }
    }

    /// Invokes `glBindProgramNV`.
    /// ```
    /// void glBindProgramNV((unsigned int) GLenum target, (unsigned int) GLuint id);
    /// ```
    public void BindProgramNV(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindProgramNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindProgramNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindProgramNV", target, id); }
        Handles.MH_glBindProgramNV.get().invokeExact(handles.PFN_glBindProgramNV, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindProgramNV", e); }
    }

    /// Invokes `glDeleteProgramsNV`.
    /// ```
    /// void glDeleteProgramsNV((int) GLsizei n, const GLuint* programs);
    /// ```
    public void DeleteProgramsNV(int n, @NonNull MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteProgramsNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteProgramsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteProgramsNV", n, programs); }
        Handles.MH_glDeleteProgramsNV.get().invokeExact(handles.PFN_glDeleteProgramsNV, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteProgramsNV", e); }
    }

    /// Invokes `glExecuteProgramNV`.
    /// ```
    /// void glExecuteProgramNV((unsigned int) GLenum target, (unsigned int) GLuint id, const GLfloat* params);
    /// ```
    public void ExecuteProgramNV(int target, int id, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glExecuteProgramNV)) throw new GLSymbolNotFoundError("Symbol not found: glExecuteProgramNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glExecuteProgramNV", target, id, params); }
        Handles.MH_glExecuteProgramNV.get().invokeExact(handles.PFN_glExecuteProgramNV, target, id, params); }
        catch (Throwable e) { throw new RuntimeException("error in ExecuteProgramNV", e); }
    }

    /// Invokes `glGenProgramsNV`.
    /// ```
    /// void glGenProgramsNV((int) GLsizei n, GLuint* programs);
    /// ```
    public void GenProgramsNV(int n, @NonNull MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenProgramsNV)) throw new GLSymbolNotFoundError("Symbol not found: glGenProgramsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenProgramsNV", n, programs); }
        Handles.MH_glGenProgramsNV.get().invokeExact(handles.PFN_glGenProgramsNV, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in GenProgramsNV", e); }
    }

    /// Invokes `glGetProgramParameterdvNV`.
    /// ```
    /// void glGetProgramParameterdvNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetProgramParameterdvNV(int target, int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramParameterdvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramParameterdvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramParameterdvNV", target, index, pname, params); }
        Handles.MH_glGetProgramParameterdvNV.get().invokeExact(handles.PFN_glGetProgramParameterdvNV, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramParameterdvNV", e); }
    }

    /// Invokes `glGetProgramParameterfvNV`.
    /// ```
    /// void glGetProgramParameterfvNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetProgramParameterfvNV(int target, int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramParameterfvNV", target, index, pname, params); }
        Handles.MH_glGetProgramParameterfvNV.get().invokeExact(handles.PFN_glGetProgramParameterfvNV, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramParameterfvNV", e); }
    }

    /// Invokes `glGetProgramivNV`.
    /// ```
    /// void glGetProgramivNV((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramivNV(int id, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramivNV", id, pname, params); }
        Handles.MH_glGetProgramivNV.get().invokeExact(handles.PFN_glGetProgramivNV, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramivNV", e); }
    }

    /// Invokes `glGetProgramStringNV`.
    /// ```
    /// void glGetProgramStringNV((unsigned int) GLuint id, (unsigned int) GLenum pname, GLubyte* program);
    /// ```
    public void GetProgramStringNV(int id, int pname, @NonNull MemorySegment program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramStringNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramStringNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramStringNV", id, pname, program); }
        Handles.MH_glGetProgramStringNV.get().invokeExact(handles.PFN_glGetProgramStringNV, id, pname, program); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramStringNV", e); }
    }

    /// Invokes `glGetTrackMatrixivNV`.
    /// ```
    /// void glGetTrackMatrixivNV((unsigned int) GLenum target, (unsigned int) GLuint address, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTrackMatrixivNV(int target, int address, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTrackMatrixivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetTrackMatrixivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTrackMatrixivNV", target, address, pname, params); }
        Handles.MH_glGetTrackMatrixivNV.get().invokeExact(handles.PFN_glGetTrackMatrixivNV, target, address, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTrackMatrixivNV", e); }
    }

    /// Invokes `glGetVertexAttribdvNV`.
    /// ```
    /// void glGetVertexAttribdvNV((unsigned int) GLuint index, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribdvNV(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribdvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribdvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribdvNV", index, pname, params); }
        Handles.MH_glGetVertexAttribdvNV.get().invokeExact(handles.PFN_glGetVertexAttribdvNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribdvNV", e); }
    }

    /// Invokes `glGetVertexAttribfvNV`.
    /// ```
    /// void glGetVertexAttribfvNV((unsigned int) GLuint index, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVertexAttribfvNV(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribfvNV", index, pname, params); }
        Handles.MH_glGetVertexAttribfvNV.get().invokeExact(handles.PFN_glGetVertexAttribfvNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribfvNV", e); }
    }

    /// Invokes `glGetVertexAttribivNV`.
    /// ```
    /// void glGetVertexAttribivNV((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribivNV(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribivNV", index, pname, params); }
        Handles.MH_glGetVertexAttribivNV.get().invokeExact(handles.PFN_glGetVertexAttribivNV, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribivNV", e); }
    }

    /// Invokes `glGetVertexAttribPointervNV`.
    /// ```
    /// void glGetVertexAttribPointervNV((unsigned int) GLuint index, (unsigned int) GLenum pname, void** pointer);
    /// ```
    public void GetVertexAttribPointervNV(int index, int pname, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribPointervNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribPointervNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribPointervNV", index, pname, pointer); }
        Handles.MH_glGetVertexAttribPointervNV.get().invokeExact(handles.PFN_glGetVertexAttribPointervNV, index, pname, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribPointervNV", e); }
    }

    /// Invokes `glIsProgramNV`.
    /// ```
    /// GLboolean glIsProgramNV((unsigned int) GLuint id);
    /// ```
    public boolean IsProgramNV(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsProgramNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsProgramNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsProgramNV", id); }
        return (((byte) Handles.MH_glIsProgramNV.get().invokeExact(handles.PFN_glIsProgramNV, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsProgramNV", e); }
    }

    /// Invokes `glLoadProgramNV`.
    /// ```
    /// void glLoadProgramNV((unsigned int) GLenum target, (unsigned int) GLuint id, (int) GLsizei len, const GLubyte* program);
    /// ```
    public void LoadProgramNV(int target, int id, int len, @NonNull MemorySegment program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadProgramNV)) throw new GLSymbolNotFoundError("Symbol not found: glLoadProgramNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLoadProgramNV", target, id, len, program); }
        Handles.MH_glLoadProgramNV.get().invokeExact(handles.PFN_glLoadProgramNV, target, id, len, program); }
        catch (Throwable e) { throw new RuntimeException("error in LoadProgramNV", e); }
    }

    /// Invokes `glProgramParameter4dNV`.
    /// ```
    /// void glProgramParameter4dNV((unsigned int) GLenum target, (unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void ProgramParameter4dNV(int target, int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameter4dNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameter4dNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameter4dNV", target, index, x, y, z, w); }
        Handles.MH_glProgramParameter4dNV.get().invokeExact(handles.PFN_glProgramParameter4dNV, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameter4dNV", e); }
    }

    /// Invokes `glProgramParameter4dvNV`.
    /// ```
    /// void glProgramParameter4dvNV((unsigned int) GLenum target, (unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void ProgramParameter4dvNV(int target, int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameter4dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameter4dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameter4dvNV", target, index, v); }
        Handles.MH_glProgramParameter4dvNV.get().invokeExact(handles.PFN_glProgramParameter4dvNV, target, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameter4dvNV", e); }
    }

    /// Invokes `glProgramParameter4fNV`.
    /// ```
    /// void glProgramParameter4fNV((unsigned int) GLenum target, (unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void ProgramParameter4fNV(int target, int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameter4fNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameter4fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameter4fNV", target, index, x, y, z, w); }
        Handles.MH_glProgramParameter4fNV.get().invokeExact(handles.PFN_glProgramParameter4fNV, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameter4fNV", e); }
    }

    /// Invokes `glProgramParameter4fvNV`.
    /// ```
    /// void glProgramParameter4fvNV((unsigned int) GLenum target, (unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void ProgramParameter4fvNV(int target, int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameter4fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameter4fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameter4fvNV", target, index, v); }
        Handles.MH_glProgramParameter4fvNV.get().invokeExact(handles.PFN_glProgramParameter4fvNV, target, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameter4fvNV", e); }
    }

    /// Invokes `glProgramParameters4dvNV`.
    /// ```
    /// void glProgramParameters4dvNV((unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLdouble* v);
    /// ```
    public void ProgramParameters4dvNV(int target, int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameters4dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameters4dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameters4dvNV", target, index, count, v); }
        Handles.MH_glProgramParameters4dvNV.get().invokeExact(handles.PFN_glProgramParameters4dvNV, target, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameters4dvNV", e); }
    }

    /// Invokes `glProgramParameters4fvNV`.
    /// ```
    /// void glProgramParameters4fvNV((unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void ProgramParameters4fvNV(int target, int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameters4fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameters4fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameters4fvNV", target, index, count, v); }
        Handles.MH_glProgramParameters4fvNV.get().invokeExact(handles.PFN_glProgramParameters4fvNV, target, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameters4fvNV", e); }
    }

    /// Invokes `glRequestResidentProgramsNV`.
    /// ```
    /// void glRequestResidentProgramsNV((int) GLsizei n, const GLuint* programs);
    /// ```
    public void RequestResidentProgramsNV(int n, @NonNull MemorySegment programs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRequestResidentProgramsNV)) throw new GLSymbolNotFoundError("Symbol not found: glRequestResidentProgramsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRequestResidentProgramsNV", n, programs); }
        Handles.MH_glRequestResidentProgramsNV.get().invokeExact(handles.PFN_glRequestResidentProgramsNV, n, programs); }
        catch (Throwable e) { throw new RuntimeException("error in RequestResidentProgramsNV", e); }
    }

    /// Invokes `glTrackMatrixNV`.
    /// ```
    /// void glTrackMatrixNV((unsigned int) GLenum target, (unsigned int) GLuint address, (unsigned int) GLenum matrix, (unsigned int) GLenum transform);
    /// ```
    public void TrackMatrixNV(int target, int address, int matrix, int transform) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTrackMatrixNV)) throw new GLSymbolNotFoundError("Symbol not found: glTrackMatrixNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTrackMatrixNV", target, address, matrix, transform); }
        Handles.MH_glTrackMatrixNV.get().invokeExact(handles.PFN_glTrackMatrixNV, target, address, matrix, transform); }
        catch (Throwable e) { throw new RuntimeException("error in TrackMatrixNV", e); }
    }

    /// Invokes `glVertexAttribPointerNV`.
    /// ```
    /// void glVertexAttribPointerNV((unsigned int) GLuint index, (int) GLint fsize, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribPointerNV(int index, int fsize, int type, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribPointerNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribPointerNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribPointerNV", index, fsize, type, stride, pointer); }
        Handles.MH_glVertexAttribPointerNV.get().invokeExact(handles.PFN_glVertexAttribPointerNV, index, fsize, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribPointerNV", e); }
    }

    /// Invokes `glVertexAttrib1dNV`.
    /// ```
    /// void glVertexAttrib1dNV((unsigned int) GLuint index, (double) GLdouble x);
    /// ```
    public void VertexAttrib1dNV(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1dNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1dNV", index, x); }
        Handles.MH_glVertexAttrib1dNV.get().invokeExact(handles.PFN_glVertexAttrib1dNV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dNV", e); }
    }

    /// Invokes `glVertexAttrib1dvNV`.
    /// ```
    /// void glVertexAttrib1dvNV((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib1dvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1dvNV", index, v); }
        Handles.MH_glVertexAttrib1dvNV.get().invokeExact(handles.PFN_glVertexAttrib1dvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dvNV", e); }
    }

    /// Invokes `glVertexAttrib1fNV`.
    /// ```
    /// void glVertexAttrib1fNV((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x);
    /// ```
    public void VertexAttrib1fNV(int index, float x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1fNV", index, x); }
        Handles.MH_glVertexAttrib1fNV.get().invokeExact(handles.PFN_glVertexAttrib1fNV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fNV", e); }
    }

    /// Invokes `glVertexAttrib1fvNV`.
    /// ```
    /// void glVertexAttrib1fvNV((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib1fvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1fvNV", index, v); }
        Handles.MH_glVertexAttrib1fvNV.get().invokeExact(handles.PFN_glVertexAttrib1fvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fvNV", e); }
    }

    /// Invokes `glVertexAttrib1sNV`.
    /// ```
    /// void glVertexAttrib1sNV((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x);
    /// ```
    public void VertexAttrib1sNV(int index, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1sNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1sNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1sNV", index, x); }
        Handles.MH_glVertexAttrib1sNV.get().invokeExact(handles.PFN_glVertexAttrib1sNV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1sNV", e); }
    }

    /// Invokes `glVertexAttrib1svNV`.
    /// ```
    /// void glVertexAttrib1svNV((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib1svNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1svNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1svNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1svNV", index, v); }
        Handles.MH_glVertexAttrib1svNV.get().invokeExact(handles.PFN_glVertexAttrib1svNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1svNV", e); }
    }

    /// Invokes `glVertexAttrib2dNV`.
    /// ```
    /// void glVertexAttrib2dNV((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexAttrib2dNV(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2dNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2dNV", index, x, y); }
        Handles.MH_glVertexAttrib2dNV.get().invokeExact(handles.PFN_glVertexAttrib2dNV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dNV", e); }
    }

    /// Invokes `glVertexAttrib2dvNV`.
    /// ```
    /// void glVertexAttrib2dvNV((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib2dvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2dvNV", index, v); }
        Handles.MH_glVertexAttrib2dvNV.get().invokeExact(handles.PFN_glVertexAttrib2dvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dvNV", e); }
    }

    /// Invokes `glVertexAttrib2fNV`.
    /// ```
    /// void glVertexAttrib2fNV((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void VertexAttrib2fNV(int index, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2fNV", index, x, y); }
        Handles.MH_glVertexAttrib2fNV.get().invokeExact(handles.PFN_glVertexAttrib2fNV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fNV", e); }
    }

    /// Invokes `glVertexAttrib2fvNV`.
    /// ```
    /// void glVertexAttrib2fvNV((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib2fvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2fvNV", index, v); }
        Handles.MH_glVertexAttrib2fvNV.get().invokeExact(handles.PFN_glVertexAttrib2fvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fvNV", e); }
    }

    /// Invokes `glVertexAttrib2sNV`.
    /// ```
    /// void glVertexAttrib2sNV((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y);
    /// ```
    public void VertexAttrib2sNV(int index, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2sNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2sNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2sNV", index, x, y); }
        Handles.MH_glVertexAttrib2sNV.get().invokeExact(handles.PFN_glVertexAttrib2sNV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2sNV", e); }
    }

    /// Invokes `glVertexAttrib2svNV`.
    /// ```
    /// void glVertexAttrib2svNV((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib2svNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2svNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2svNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2svNV", index, v); }
        Handles.MH_glVertexAttrib2svNV.get().invokeExact(handles.PFN_glVertexAttrib2svNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2svNV", e); }
    }

    /// Invokes `glVertexAttrib3dNV`.
    /// ```
    /// void glVertexAttrib3dNV((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexAttrib3dNV(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3dNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3dNV", index, x, y, z); }
        Handles.MH_glVertexAttrib3dNV.get().invokeExact(handles.PFN_glVertexAttrib3dNV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dNV", e); }
    }

    /// Invokes `glVertexAttrib3dvNV`.
    /// ```
    /// void glVertexAttrib3dvNV((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib3dvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3dvNV", index, v); }
        Handles.MH_glVertexAttrib3dvNV.get().invokeExact(handles.PFN_glVertexAttrib3dvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dvNV", e); }
    }

    /// Invokes `glVertexAttrib3fNV`.
    /// ```
    /// void glVertexAttrib3fNV((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void VertexAttrib3fNV(int index, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3fNV", index, x, y, z); }
        Handles.MH_glVertexAttrib3fNV.get().invokeExact(handles.PFN_glVertexAttrib3fNV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fNV", e); }
    }

    /// Invokes `glVertexAttrib3fvNV`.
    /// ```
    /// void glVertexAttrib3fvNV((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib3fvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3fvNV", index, v); }
        Handles.MH_glVertexAttrib3fvNV.get().invokeExact(handles.PFN_glVertexAttrib3fvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fvNV", e); }
    }

    /// Invokes `glVertexAttrib3sNV`.
    /// ```
    /// void glVertexAttrib3sNV((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z);
    /// ```
    public void VertexAttrib3sNV(int index, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3sNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3sNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3sNV", index, x, y, z); }
        Handles.MH_glVertexAttrib3sNV.get().invokeExact(handles.PFN_glVertexAttrib3sNV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3sNV", e); }
    }

    /// Invokes `glVertexAttrib3svNV`.
    /// ```
    /// void glVertexAttrib3svNV((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib3svNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3svNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3svNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3svNV", index, v); }
        Handles.MH_glVertexAttrib3svNV.get().invokeExact(handles.PFN_glVertexAttrib3svNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3svNV", e); }
    }

    /// Invokes `glVertexAttrib4dNV`.
    /// ```
    /// void glVertexAttrib4dNV((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexAttrib4dNV(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4dNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4dNV", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4dNV.get().invokeExact(handles.PFN_glVertexAttrib4dNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dNV", e); }
    }

    /// Invokes `glVertexAttrib4dvNV`.
    /// ```
    /// void glVertexAttrib4dvNV((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib4dvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4dvNV", index, v); }
        Handles.MH_glVertexAttrib4dvNV.get().invokeExact(handles.PFN_glVertexAttrib4dvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dvNV", e); }
    }

    /// Invokes `glVertexAttrib4fNV`.
    /// ```
    /// void glVertexAttrib4fNV((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void VertexAttrib4fNV(int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4fNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4fNV", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4fNV.get().invokeExact(handles.PFN_glVertexAttrib4fNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fNV", e); }
    }

    /// Invokes `glVertexAttrib4fvNV`.
    /// ```
    /// void glVertexAttrib4fvNV((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib4fvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4fvNV", index, v); }
        Handles.MH_glVertexAttrib4fvNV.get().invokeExact(handles.PFN_glVertexAttrib4fvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fvNV", e); }
    }

    /// Invokes `glVertexAttrib4sNV`.
    /// ```
    /// void glVertexAttrib4sNV((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z, ((signed short) khronos_int16_t) GLshort w);
    /// ```
    public void VertexAttrib4sNV(int index, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4sNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4sNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4sNV", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4sNV.get().invokeExact(handles.PFN_glVertexAttrib4sNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4sNV", e); }
    }

    /// Invokes `glVertexAttrib4svNV`.
    /// ```
    /// void glVertexAttrib4svNV((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib4svNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4svNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4svNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4svNV", index, v); }
        Handles.MH_glVertexAttrib4svNV.get().invokeExact(handles.PFN_glVertexAttrib4svNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4svNV", e); }
    }

    /// Invokes `glVertexAttrib4ubNV`.
    /// ```
    /// void glVertexAttrib4ubNV((unsigned int) GLuint index, ((unsigned char) khronos_uint8_t) GLubyte x, ((unsigned char) khronos_uint8_t) GLubyte y, ((unsigned char) khronos_uint8_t) GLubyte z, ((unsigned char) khronos_uint8_t) GLubyte w);
    /// ```
    public void VertexAttrib4ubNV(int index, byte x, byte y, byte z, byte w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ubNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4ubNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4ubNV", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4ubNV.get().invokeExact(handles.PFN_glVertexAttrib4ubNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ubNV", e); }
    }

    /// Invokes `glVertexAttrib4ubvNV`.
    /// ```
    /// void glVertexAttrib4ubvNV((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttrib4ubvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ubvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4ubvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4ubvNV", index, v); }
        Handles.MH_glVertexAttrib4ubvNV.get().invokeExact(handles.PFN_glVertexAttrib4ubvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ubvNV", e); }
    }

    /// Invokes `glVertexAttribs1dvNV`.
    /// ```
    /// void glVertexAttribs1dvNV((unsigned int) GLuint index, (int) GLsizei count, const GLdouble* v);
    /// ```
    public void VertexAttribs1dvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs1dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs1dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs1dvNV", index, count, v); }
        Handles.MH_glVertexAttribs1dvNV.get().invokeExact(handles.PFN_glVertexAttribs1dvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs1dvNV", e); }
    }

    /// Invokes `glVertexAttribs1fvNV`.
    /// ```
    /// void glVertexAttribs1fvNV((unsigned int) GLuint index, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void VertexAttribs1fvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs1fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs1fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs1fvNV", index, count, v); }
        Handles.MH_glVertexAttribs1fvNV.get().invokeExact(handles.PFN_glVertexAttribs1fvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs1fvNV", e); }
    }

    /// Invokes `glVertexAttribs1svNV`.
    /// ```
    /// void glVertexAttribs1svNV((unsigned int) GLuint index, (int) GLsizei count, const GLshort* v);
    /// ```
    public void VertexAttribs1svNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs1svNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs1svNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs1svNV", index, count, v); }
        Handles.MH_glVertexAttribs1svNV.get().invokeExact(handles.PFN_glVertexAttribs1svNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs1svNV", e); }
    }

    /// Invokes `glVertexAttribs2dvNV`.
    /// ```
    /// void glVertexAttribs2dvNV((unsigned int) GLuint index, (int) GLsizei count, const GLdouble* v);
    /// ```
    public void VertexAttribs2dvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs2dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs2dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs2dvNV", index, count, v); }
        Handles.MH_glVertexAttribs2dvNV.get().invokeExact(handles.PFN_glVertexAttribs2dvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs2dvNV", e); }
    }

    /// Invokes `glVertexAttribs2fvNV`.
    /// ```
    /// void glVertexAttribs2fvNV((unsigned int) GLuint index, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void VertexAttribs2fvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs2fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs2fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs2fvNV", index, count, v); }
        Handles.MH_glVertexAttribs2fvNV.get().invokeExact(handles.PFN_glVertexAttribs2fvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs2fvNV", e); }
    }

    /// Invokes `glVertexAttribs2svNV`.
    /// ```
    /// void glVertexAttribs2svNV((unsigned int) GLuint index, (int) GLsizei count, const GLshort* v);
    /// ```
    public void VertexAttribs2svNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs2svNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs2svNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs2svNV", index, count, v); }
        Handles.MH_glVertexAttribs2svNV.get().invokeExact(handles.PFN_glVertexAttribs2svNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs2svNV", e); }
    }

    /// Invokes `glVertexAttribs3dvNV`.
    /// ```
    /// void glVertexAttribs3dvNV((unsigned int) GLuint index, (int) GLsizei count, const GLdouble* v);
    /// ```
    public void VertexAttribs3dvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs3dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs3dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs3dvNV", index, count, v); }
        Handles.MH_glVertexAttribs3dvNV.get().invokeExact(handles.PFN_glVertexAttribs3dvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs3dvNV", e); }
    }

    /// Invokes `glVertexAttribs3fvNV`.
    /// ```
    /// void glVertexAttribs3fvNV((unsigned int) GLuint index, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void VertexAttribs3fvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs3fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs3fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs3fvNV", index, count, v); }
        Handles.MH_glVertexAttribs3fvNV.get().invokeExact(handles.PFN_glVertexAttribs3fvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs3fvNV", e); }
    }

    /// Invokes `glVertexAttribs3svNV`.
    /// ```
    /// void glVertexAttribs3svNV((unsigned int) GLuint index, (int) GLsizei count, const GLshort* v);
    /// ```
    public void VertexAttribs3svNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs3svNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs3svNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs3svNV", index, count, v); }
        Handles.MH_glVertexAttribs3svNV.get().invokeExact(handles.PFN_glVertexAttribs3svNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs3svNV", e); }
    }

    /// Invokes `glVertexAttribs4dvNV`.
    /// ```
    /// void glVertexAttribs4dvNV((unsigned int) GLuint index, (int) GLsizei count, const GLdouble* v);
    /// ```
    public void VertexAttribs4dvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4dvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs4dvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs4dvNV", index, count, v); }
        Handles.MH_glVertexAttribs4dvNV.get().invokeExact(handles.PFN_glVertexAttribs4dvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4dvNV", e); }
    }

    /// Invokes `glVertexAttribs4fvNV`.
    /// ```
    /// void glVertexAttribs4fvNV((unsigned int) GLuint index, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void VertexAttribs4fvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4fvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs4fvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs4fvNV", index, count, v); }
        Handles.MH_glVertexAttribs4fvNV.get().invokeExact(handles.PFN_glVertexAttribs4fvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4fvNV", e); }
    }

    /// Invokes `glVertexAttribs4svNV`.
    /// ```
    /// void glVertexAttribs4svNV((unsigned int) GLuint index, (int) GLsizei count, const GLshort* v);
    /// ```
    public void VertexAttribs4svNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4svNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs4svNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs4svNV", index, count, v); }
        Handles.MH_glVertexAttribs4svNV.get().invokeExact(handles.PFN_glVertexAttribs4svNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4svNV", e); }
    }

    /// Invokes `glVertexAttribs4ubvNV`.
    /// ```
    /// void glVertexAttribs4ubvNV((unsigned int) GLuint index, (int) GLsizei count, const GLubyte* v);
    /// ```
    public void VertexAttribs4ubvNV(int index, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4ubvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs4ubvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs4ubvNV", index, count, v); }
        Handles.MH_glVertexAttribs4ubvNV.get().invokeExact(handles.PFN_glVertexAttribs4ubvNV, index, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4ubvNV", e); }
    }

}
