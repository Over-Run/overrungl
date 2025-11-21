// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`.
/// ## Layout
/// ```
/// struct VkCooperativeMatrixFlexibleDimensionsPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t MGranularity;
///     uint32_t NGranularity;
///     uint32_t KGranularity;
///     VkComponentTypeKHR AType;
///     VkComponentTypeKHR BType;
///     VkComponentTypeKHR CType;
///     VkComponentTypeKHR ResultType;
///     VkBool32 saturatingAccumulation;
///     VkScopeKHR scope;
///     uint32_t workgroupInvocations;
/// }
/// ```
public final class VkCooperativeMatrixFlexibleDimensionsPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MGranularity"),
        ValueLayout.JAVA_INT.withName("NGranularity"),
        ValueLayout.JAVA_INT.withName("KGranularity"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("ResultType"),
        ValueLayout.JAVA_INT.withName("saturatingAccumulation"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("workgroupInvocations")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_MGranularity = LAYOUT.byteOffset(PathElement.groupElement("MGranularity"));
    public static final long OFFSET_NGranularity = LAYOUT.byteOffset(PathElement.groupElement("NGranularity"));
    public static final long OFFSET_KGranularity = LAYOUT.byteOffset(PathElement.groupElement("KGranularity"));
    public static final long OFFSET_AType = LAYOUT.byteOffset(PathElement.groupElement("AType"));
    public static final long OFFSET_BType = LAYOUT.byteOffset(PathElement.groupElement("BType"));
    public static final long OFFSET_CType = LAYOUT.byteOffset(PathElement.groupElement("CType"));
    public static final long OFFSET_ResultType = LAYOUT.byteOffset(PathElement.groupElement("ResultType"));
    public static final long OFFSET_saturatingAccumulation = LAYOUT.byteOffset(PathElement.groupElement("saturatingAccumulation"));
    public static final long OFFSET_scope = LAYOUT.byteOffset(PathElement.groupElement("scope"));
    public static final long OFFSET_workgroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("workgroupInvocations"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_MGranularity = LAYOUT.select(PathElement.groupElement("MGranularity"));
    public static final MemoryLayout LAYOUT_NGranularity = LAYOUT.select(PathElement.groupElement("NGranularity"));
    public static final MemoryLayout LAYOUT_KGranularity = LAYOUT.select(PathElement.groupElement("KGranularity"));
    public static final MemoryLayout LAYOUT_AType = LAYOUT.select(PathElement.groupElement("AType"));
    public static final MemoryLayout LAYOUT_BType = LAYOUT.select(PathElement.groupElement("BType"));
    public static final MemoryLayout LAYOUT_CType = LAYOUT.select(PathElement.groupElement("CType"));
    public static final MemoryLayout LAYOUT_ResultType = LAYOUT.select(PathElement.groupElement("ResultType"));
    public static final MemoryLayout LAYOUT_saturatingAccumulation = LAYOUT.select(PathElement.groupElement("saturatingAccumulation"));
    public static final MemoryLayout LAYOUT_scope = LAYOUT.select(PathElement.groupElement("scope"));
    public static final MemoryLayout LAYOUT_workgroupInvocations = LAYOUT.select(PathElement.groupElement("workgroupInvocations"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_MGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MGranularity"));
    public static final VarHandle VH_NGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NGranularity"));
    public static final VarHandle VH_KGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("KGranularity"));
    public static final VarHandle VH_AType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("AType"));
    public static final VarHandle VH_BType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("BType"));
    public static final VarHandle VH_CType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("CType"));
    public static final VarHandle VH_ResultType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ResultType"));
    public static final VarHandle VH_saturatingAccumulation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("saturatingAccumulation"));
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));
    public static final VarHandle VH_workgroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupInvocations"));

    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeMatrix2.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV); }
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeMatrix2.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV);
        return s;
    }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV copyFrom(VkCooperativeMatrixFlexibleDimensionsPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV reinterpret(long count) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV asSlice(long index) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV asSlice(long index, long count) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV at(long index, Consumer<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int MGranularityAt(long index) { return (int) VH_MGranularity.get(this.segment(), 0L, index); }
    public int NGranularityAt(long index) { return (int) VH_NGranularity.get(this.segment(), 0L, index); }
    public int KGranularityAt(long index) { return (int) VH_KGranularity.get(this.segment(), 0L, index); }
    public int ATypeAt(long index) { return (int) VH_AType.get(this.segment(), 0L, index); }
    public int BTypeAt(long index) { return (int) VH_BType.get(this.segment(), 0L, index); }
    public int CTypeAt(long index) { return (int) VH_CType.get(this.segment(), 0L, index); }
    public int ResultTypeAt(long index) { return (int) VH_ResultType.get(this.segment(), 0L, index); }
    public int saturatingAccumulationAt(long index) { return (int) VH_saturatingAccumulation.get(this.segment(), 0L, index); }
    public int scopeAt(long index) { return (int) VH_scope.get(this.segment(), 0L, index); }
    public int workgroupInvocationsAt(long index) { return (int) VH_workgroupInvocations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int MGranularity() { return (int) VH_MGranularity.get(this.segment(), 0L, 0L); }
    public int NGranularity() { return (int) VH_NGranularity.get(this.segment(), 0L, 0L); }
    public int KGranularity() { return (int) VH_KGranularity.get(this.segment(), 0L, 0L); }
    public int AType() { return (int) VH_AType.get(this.segment(), 0L, 0L); }
    public int BType() { return (int) VH_BType.get(this.segment(), 0L, 0L); }
    public int CType() { return (int) VH_CType.get(this.segment(), 0L, 0L); }
    public int ResultType() { return (int) VH_ResultType.get(this.segment(), 0L, 0L); }
    public int saturatingAccumulation() { return (int) VH_saturatingAccumulation.get(this.segment(), 0L, 0L); }
    public int scope() { return (int) VH_scope.get(this.segment(), 0L, 0L); }
    public int workgroupInvocations() { return (int) VH_workgroupInvocations.get(this.segment(), 0L, 0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV MGranularityAt(long index, int value) { VH_MGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV NGranularityAt(long index, int value) { VH_NGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV KGranularityAt(long index, int value) { VH_KGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV ATypeAt(long index, int value) { VH_AType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV BTypeAt(long index, int value) { VH_BType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV CTypeAt(long index, int value) { VH_CType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV ResultTypeAt(long index, int value) { VH_ResultType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV saturatingAccumulationAt(long index, int value) { VH_saturatingAccumulation.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV scopeAt(long index, int value) { VH_scope.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV workgroupInvocationsAt(long index, int value) { VH_workgroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV MGranularity(int value) { VH_MGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV NGranularity(int value) { VH_NGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV KGranularity(int value) { VH_KGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV AType(int value) { VH_AType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV BType(int value) { VH_BType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV CType(int value) { VH_CType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV ResultType(int value) { VH_ResultType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV saturatingAccumulation(int value) { VH_saturatingAccumulation.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV scope(int value) { VH_scope.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV workgroupInvocations(int value) { VH_workgroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _MGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_MGranularity, index), LAYOUT_MGranularity); }
    public MemorySegment _MGranularity() { return _MGranularityAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _MGranularityAt(long index, MemorySegment src) { _MGranularityAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _MGranularity(MemorySegment src) { return _MGranularityAt(0L, src); }
    public MemorySegment _NGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_NGranularity, index), LAYOUT_NGranularity); }
    public MemorySegment _NGranularity() { return _NGranularityAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _NGranularityAt(long index, MemorySegment src) { _NGranularityAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _NGranularity(MemorySegment src) { return _NGranularityAt(0L, src); }
    public MemorySegment _KGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_KGranularity, index), LAYOUT_KGranularity); }
    public MemorySegment _KGranularity() { return _KGranularityAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _KGranularityAt(long index, MemorySegment src) { _KGranularityAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _KGranularity(MemorySegment src) { return _KGranularityAt(0L, src); }
    public MemorySegment _ATypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_AType, index), LAYOUT_AType); }
    public MemorySegment _AType() { return _ATypeAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _ATypeAt(long index, MemorySegment src) { _ATypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _AType(MemorySegment src) { return _ATypeAt(0L, src); }
    public MemorySegment _BTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_BType, index), LAYOUT_BType); }
    public MemorySegment _BType() { return _BTypeAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _BTypeAt(long index, MemorySegment src) { _BTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _BType(MemorySegment src) { return _BTypeAt(0L, src); }
    public MemorySegment _CTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_CType, index), LAYOUT_CType); }
    public MemorySegment _CType() { return _CTypeAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _CTypeAt(long index, MemorySegment src) { _CTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _CType(MemorySegment src) { return _CTypeAt(0L, src); }
    public MemorySegment _ResultTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ResultType, index), LAYOUT_ResultType); }
    public MemorySegment _ResultType() { return _ResultTypeAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _ResultTypeAt(long index, MemorySegment src) { _ResultTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _ResultType(MemorySegment src) { return _ResultTypeAt(0L, src); }
    public MemorySegment _saturatingAccumulationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_saturatingAccumulation, index), LAYOUT_saturatingAccumulation); }
    public MemorySegment _saturatingAccumulation() { return _saturatingAccumulationAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _saturatingAccumulationAt(long index, MemorySegment src) { _saturatingAccumulationAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _saturatingAccumulation(MemorySegment src) { return _saturatingAccumulationAt(0L, src); }
    public MemorySegment _scopeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scope, index), LAYOUT_scope); }
    public MemorySegment _scope() { return _scopeAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _scopeAt(long index, MemorySegment src) { _scopeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _scope(MemorySegment src) { return _scopeAt(0L, src); }
    public MemorySegment _workgroupInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_workgroupInvocations, index), LAYOUT_workgroupInvocations); }
    public MemorySegment _workgroupInvocations() { return _workgroupInvocationsAt(0L); }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _workgroupInvocationsAt(long index, MemorySegment src) { _workgroupInvocationsAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV _workgroupInvocations(MemorySegment src) { return _workgroupInvocationsAt(0L, src); }
}
