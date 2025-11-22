// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCooperativeVectorPropertiesNV`.
/// ## Layout
/// ```
/// struct VkCooperativeVectorPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkComponentTypeKHR inputType;
///     VkComponentTypeKHR inputInterpretation;
///     VkComponentTypeKHR matrixInterpretation;
///     VkComponentTypeKHR biasInterpretation;
///     VkComponentTypeKHR resultType;
///     VkBool32 transpose;
/// }
/// ```
public final class VkCooperativeVectorPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inputType"),
        ValueLayout.JAVA_INT.withName("inputInterpretation"),
        ValueLayout.JAVA_INT.withName("matrixInterpretation"),
        ValueLayout.JAVA_INT.withName("biasInterpretation"),
        ValueLayout.JAVA_INT.withName("resultType"),
        ValueLayout.JAVA_INT.withName("transpose")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_inputType = LAYOUT.byteOffset(PathElement.groupElement("inputType"));
    public static final long OFFSET_inputInterpretation = LAYOUT.byteOffset(PathElement.groupElement("inputInterpretation"));
    public static final long OFFSET_matrixInterpretation = LAYOUT.byteOffset(PathElement.groupElement("matrixInterpretation"));
    public static final long OFFSET_biasInterpretation = LAYOUT.byteOffset(PathElement.groupElement("biasInterpretation"));
    public static final long OFFSET_resultType = LAYOUT.byteOffset(PathElement.groupElement("resultType"));
    public static final long OFFSET_transpose = LAYOUT.byteOffset(PathElement.groupElement("transpose"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_inputType = LAYOUT.select(PathElement.groupElement("inputType"));
    public static final MemoryLayout LAYOUT_inputInterpretation = LAYOUT.select(PathElement.groupElement("inputInterpretation"));
    public static final MemoryLayout LAYOUT_matrixInterpretation = LAYOUT.select(PathElement.groupElement("matrixInterpretation"));
    public static final MemoryLayout LAYOUT_biasInterpretation = LAYOUT.select(PathElement.groupElement("biasInterpretation"));
    public static final MemoryLayout LAYOUT_resultType = LAYOUT.select(PathElement.groupElement("resultType"));
    public static final MemoryLayout LAYOUT_transpose = LAYOUT.select(PathElement.groupElement("transpose"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_inputType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputType"));
    public static final VarHandle VH_inputInterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputInterpretation"));
    public static final VarHandle VH_matrixInterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrixInterpretation"));
    public static final VarHandle VH_biasInterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("biasInterpretation"));
    public static final VarHandle VH_resultType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resultType"));
    public static final VarHandle VH_transpose = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transpose"));

    public VkCooperativeVectorPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCooperativeVectorPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeVectorPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCooperativeVectorPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeVectorPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCooperativeVectorPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeVectorPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCooperativeVectorPropertiesNV alloc(SegmentAllocator allocator) { return new VkCooperativeVectorPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkCooperativeVectorPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkCooperativeVectorPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkCooperativeVectorPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeVector.VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV); }
    public static VkCooperativeVectorPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeVector.VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV);
        return s;
    }
    public VkCooperativeVectorPropertiesNV copyFrom(VkCooperativeVectorPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCooperativeVectorPropertiesNV reinterpret(long count) { return new VkCooperativeVectorPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCooperativeVectorPropertiesNV asSlice(long index) { return new VkCooperativeVectorPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCooperativeVectorPropertiesNV asSlice(long index, long count) { return new VkCooperativeVectorPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCooperativeVectorPropertiesNV at(long index, Consumer<VkCooperativeVectorPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int inputTypeAt(long index) { return (int) VH_inputType.get(this.segment(), 0L, index); }
    public int inputInterpretationAt(long index) { return (int) VH_inputInterpretation.get(this.segment(), 0L, index); }
    public int matrixInterpretationAt(long index) { return (int) VH_matrixInterpretation.get(this.segment(), 0L, index); }
    public int biasInterpretationAt(long index) { return (int) VH_biasInterpretation.get(this.segment(), 0L, index); }
    public int resultTypeAt(long index) { return (int) VH_resultType.get(this.segment(), 0L, index); }
    public int transposeAt(long index) { return (int) VH_transpose.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int inputType() { return (int) VH_inputType.get(this.segment(), 0L, 0L); }
    public int inputInterpretation() { return (int) VH_inputInterpretation.get(this.segment(), 0L, 0L); }
    public int matrixInterpretation() { return (int) VH_matrixInterpretation.get(this.segment(), 0L, 0L); }
    public int biasInterpretation() { return (int) VH_biasInterpretation.get(this.segment(), 0L, 0L); }
    public int resultType() { return (int) VH_resultType.get(this.segment(), 0L, 0L); }
    public int transpose() { return (int) VH_transpose.get(this.segment(), 0L, 0L); }
    public VkCooperativeVectorPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeVectorPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeVectorPropertiesNV inputTypeAt(long index, int value) { VH_inputType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeVectorPropertiesNV inputInterpretationAt(long index, int value) { VH_inputInterpretation.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeVectorPropertiesNV matrixInterpretationAt(long index, int value) { VH_matrixInterpretation.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeVectorPropertiesNV biasInterpretationAt(long index, int value) { VH_biasInterpretation.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeVectorPropertiesNV resultTypeAt(long index, int value) { VH_resultType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeVectorPropertiesNV transposeAt(long index, int value) { VH_transpose.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeVectorPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeVectorPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeVectorPropertiesNV inputType(int value) { VH_inputType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeVectorPropertiesNV inputInterpretation(int value) { VH_inputInterpretation.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeVectorPropertiesNV matrixInterpretation(int value) { VH_matrixInterpretation.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeVectorPropertiesNV biasInterpretation(int value) { VH_biasInterpretation.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeVectorPropertiesNV resultType(int value) { VH_resultType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeVectorPropertiesNV transpose(int value) { VH_transpose.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCooperativeVectorPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeVectorPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCooperativeVectorPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCooperativeVectorPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _inputTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inputType, index), LAYOUT_inputType); }
    public MemorySegment _inputType() { return _inputTypeAt(0L); }
    public VkCooperativeVectorPropertiesNV _inputTypeAt(long index, MemorySegment src) { _inputTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeVectorPropertiesNV _inputType(MemorySegment src) { return _inputTypeAt(0L, src); }
    public MemorySegment _inputInterpretationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inputInterpretation, index), LAYOUT_inputInterpretation); }
    public MemorySegment _inputInterpretation() { return _inputInterpretationAt(0L); }
    public VkCooperativeVectorPropertiesNV _inputInterpretationAt(long index, MemorySegment src) { _inputInterpretationAt(index).copyFrom(src); return this; }
    public VkCooperativeVectorPropertiesNV _inputInterpretation(MemorySegment src) { return _inputInterpretationAt(0L, src); }
    public MemorySegment _matrixInterpretationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_matrixInterpretation, index), LAYOUT_matrixInterpretation); }
    public MemorySegment _matrixInterpretation() { return _matrixInterpretationAt(0L); }
    public VkCooperativeVectorPropertiesNV _matrixInterpretationAt(long index, MemorySegment src) { _matrixInterpretationAt(index).copyFrom(src); return this; }
    public VkCooperativeVectorPropertiesNV _matrixInterpretation(MemorySegment src) { return _matrixInterpretationAt(0L, src); }
    public MemorySegment _biasInterpretationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_biasInterpretation, index), LAYOUT_biasInterpretation); }
    public MemorySegment _biasInterpretation() { return _biasInterpretationAt(0L); }
    public VkCooperativeVectorPropertiesNV _biasInterpretationAt(long index, MemorySegment src) { _biasInterpretationAt(index).copyFrom(src); return this; }
    public VkCooperativeVectorPropertiesNV _biasInterpretation(MemorySegment src) { return _biasInterpretationAt(0L, src); }
    public MemorySegment _resultTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resultType, index), LAYOUT_resultType); }
    public MemorySegment _resultType() { return _resultTypeAt(0L); }
    public VkCooperativeVectorPropertiesNV _resultTypeAt(long index, MemorySegment src) { _resultTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeVectorPropertiesNV _resultType(MemorySegment src) { return _resultTypeAt(0L, src); }
    public MemorySegment _transposeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transpose, index), LAYOUT_transpose); }
    public MemorySegment _transpose() { return _transposeAt(0L); }
    public VkCooperativeVectorPropertiesNV _transposeAt(long index, MemorySegment src) { _transposeAt(index).copyFrom(src); return this; }
    public VkCooperativeVectorPropertiesNV _transpose(MemorySegment src) { return _transposeAt(0L, src); }
}
