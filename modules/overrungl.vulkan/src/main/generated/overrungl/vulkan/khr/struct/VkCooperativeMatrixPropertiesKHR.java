// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCooperativeMatrixPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkCooperativeMatrixPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t MSize;
///     uint32_t NSize;
///     uint32_t KSize;
///     VkComponentTypeKHR AType;
///     VkComponentTypeKHR BType;
///     VkComponentTypeKHR CType;
///     VkComponentTypeKHR ResultType;
///     VkBool32 saturatingAccumulation;
///     VkScopeKHR scope;
/// }
/// ```
public final class VkCooperativeMatrixPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MSize"),
        ValueLayout.JAVA_INT.withName("NSize"),
        ValueLayout.JAVA_INT.withName("KSize"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("ResultType"),
        ValueLayout.JAVA_INT.withName("saturatingAccumulation"),
        ValueLayout.JAVA_INT.withName("scope")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_MSize = LAYOUT.byteOffset(PathElement.groupElement("MSize"));
    public static final long OFFSET_NSize = LAYOUT.byteOffset(PathElement.groupElement("NSize"));
    public static final long OFFSET_KSize = LAYOUT.byteOffset(PathElement.groupElement("KSize"));
    public static final long OFFSET_AType = LAYOUT.byteOffset(PathElement.groupElement("AType"));
    public static final long OFFSET_BType = LAYOUT.byteOffset(PathElement.groupElement("BType"));
    public static final long OFFSET_CType = LAYOUT.byteOffset(PathElement.groupElement("CType"));
    public static final long OFFSET_ResultType = LAYOUT.byteOffset(PathElement.groupElement("ResultType"));
    public static final long OFFSET_saturatingAccumulation = LAYOUT.byteOffset(PathElement.groupElement("saturatingAccumulation"));
    public static final long OFFSET_scope = LAYOUT.byteOffset(PathElement.groupElement("scope"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_MSize = LAYOUT.select(PathElement.groupElement("MSize"));
    public static final MemoryLayout LAYOUT_NSize = LAYOUT.select(PathElement.groupElement("NSize"));
    public static final MemoryLayout LAYOUT_KSize = LAYOUT.select(PathElement.groupElement("KSize"));
    public static final MemoryLayout LAYOUT_AType = LAYOUT.select(PathElement.groupElement("AType"));
    public static final MemoryLayout LAYOUT_BType = LAYOUT.select(PathElement.groupElement("BType"));
    public static final MemoryLayout LAYOUT_CType = LAYOUT.select(PathElement.groupElement("CType"));
    public static final MemoryLayout LAYOUT_ResultType = LAYOUT.select(PathElement.groupElement("ResultType"));
    public static final MemoryLayout LAYOUT_saturatingAccumulation = LAYOUT.select(PathElement.groupElement("saturatingAccumulation"));
    public static final MemoryLayout LAYOUT_scope = LAYOUT.select(PathElement.groupElement("scope"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_MSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MSize"));
    public static final VarHandle VH_NSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NSize"));
    public static final VarHandle VH_KSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("KSize"));
    public static final VarHandle VH_AType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("AType"));
    public static final VarHandle VH_BType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("BType"));
    public static final VarHandle VH_CType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("CType"));
    public static final VarHandle VH_ResultType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ResultType"));
    public static final VarHandle VH_saturatingAccumulation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("saturatingAccumulation"));
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));

    public VkCooperativeMatrixPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCooperativeMatrixPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkCooperativeMatrixPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCooperativeMatrixPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCooperativeMatrixPropertiesKHR alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkCooperativeMatrixPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkCooperativeMatrixPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkCooperativeMatrixPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR); }
    public static VkCooperativeMatrixPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR);
        return s;
    }
    public VkCooperativeMatrixPropertiesKHR copyFrom(VkCooperativeMatrixPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCooperativeMatrixPropertiesKHR reinterpret(long count) { return new VkCooperativeMatrixPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCooperativeMatrixPropertiesKHR asSlice(long index) { return new VkCooperativeMatrixPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCooperativeMatrixPropertiesKHR asSlice(long index, long count) { return new VkCooperativeMatrixPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCooperativeMatrixPropertiesKHR at(long index, Consumer<VkCooperativeMatrixPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int MSizeAt(long index) { return (int) VH_MSize.get(this.segment(), 0L, index); }
    public int NSizeAt(long index) { return (int) VH_NSize.get(this.segment(), 0L, index); }
    public int KSizeAt(long index) { return (int) VH_KSize.get(this.segment(), 0L, index); }
    public int ATypeAt(long index) { return (int) VH_AType.get(this.segment(), 0L, index); }
    public int BTypeAt(long index) { return (int) VH_BType.get(this.segment(), 0L, index); }
    public int CTypeAt(long index) { return (int) VH_CType.get(this.segment(), 0L, index); }
    public int ResultTypeAt(long index) { return (int) VH_ResultType.get(this.segment(), 0L, index); }
    public int saturatingAccumulationAt(long index) { return (int) VH_saturatingAccumulation.get(this.segment(), 0L, index); }
    public int scopeAt(long index) { return (int) VH_scope.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int MSize() { return (int) VH_MSize.get(this.segment(), 0L, 0L); }
    public int NSize() { return (int) VH_NSize.get(this.segment(), 0L, 0L); }
    public int KSize() { return (int) VH_KSize.get(this.segment(), 0L, 0L); }
    public int AType() { return (int) VH_AType.get(this.segment(), 0L, 0L); }
    public int BType() { return (int) VH_BType.get(this.segment(), 0L, 0L); }
    public int CType() { return (int) VH_CType.get(this.segment(), 0L, 0L); }
    public int ResultType() { return (int) VH_ResultType.get(this.segment(), 0L, 0L); }
    public int saturatingAccumulation() { return (int) VH_saturatingAccumulation.get(this.segment(), 0L, 0L); }
    public int scope() { return (int) VH_scope.get(this.segment(), 0L, 0L); }
    public VkCooperativeMatrixPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR MSizeAt(long index, int value) { VH_MSize.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR NSizeAt(long index, int value) { VH_NSize.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR KSizeAt(long index, int value) { VH_KSize.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR ATypeAt(long index, int value) { VH_AType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR BTypeAt(long index, int value) { VH_BType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR CTypeAt(long index, int value) { VH_CType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR ResultTypeAt(long index, int value) { VH_ResultType.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR saturatingAccumulationAt(long index, int value) { VH_saturatingAccumulation.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR scopeAt(long index, int value) { VH_scope.set(this.segment(), 0L, index, value); return this; }
    public VkCooperativeMatrixPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR MSize(int value) { VH_MSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR NSize(int value) { VH_NSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR KSize(int value) { VH_KSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR AType(int value) { VH_AType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR BType(int value) { VH_BType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR CType(int value) { VH_CType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR ResultType(int value) { VH_ResultType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR saturatingAccumulation(int value) { VH_saturatingAccumulation.set(this.segment(), 0L, 0L, value); return this; }
    public VkCooperativeMatrixPropertiesKHR scope(int value) { VH_scope.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _MSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_MSize, index), LAYOUT_MSize); }
    public MemorySegment _MSize() { return _MSizeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _MSizeAt(long index, MemorySegment src) { _MSizeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _MSize(MemorySegment src) { return _MSizeAt(0L, src); }
    public MemorySegment _NSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_NSize, index), LAYOUT_NSize); }
    public MemorySegment _NSize() { return _NSizeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _NSizeAt(long index, MemorySegment src) { _NSizeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _NSize(MemorySegment src) { return _NSizeAt(0L, src); }
    public MemorySegment _KSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_KSize, index), LAYOUT_KSize); }
    public MemorySegment _KSize() { return _KSizeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _KSizeAt(long index, MemorySegment src) { _KSizeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _KSize(MemorySegment src) { return _KSizeAt(0L, src); }
    public MemorySegment _ATypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_AType, index), LAYOUT_AType); }
    public MemorySegment _AType() { return _ATypeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _ATypeAt(long index, MemorySegment src) { _ATypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _AType(MemorySegment src) { return _ATypeAt(0L, src); }
    public MemorySegment _BTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_BType, index), LAYOUT_BType); }
    public MemorySegment _BType() { return _BTypeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _BTypeAt(long index, MemorySegment src) { _BTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _BType(MemorySegment src) { return _BTypeAt(0L, src); }
    public MemorySegment _CTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_CType, index), LAYOUT_CType); }
    public MemorySegment _CType() { return _CTypeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _CTypeAt(long index, MemorySegment src) { _CTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _CType(MemorySegment src) { return _CTypeAt(0L, src); }
    public MemorySegment _ResultTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ResultType, index), LAYOUT_ResultType); }
    public MemorySegment _ResultType() { return _ResultTypeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _ResultTypeAt(long index, MemorySegment src) { _ResultTypeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _ResultType(MemorySegment src) { return _ResultTypeAt(0L, src); }
    public MemorySegment _saturatingAccumulationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_saturatingAccumulation, index), LAYOUT_saturatingAccumulation); }
    public MemorySegment _saturatingAccumulation() { return _saturatingAccumulationAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _saturatingAccumulationAt(long index, MemorySegment src) { _saturatingAccumulationAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _saturatingAccumulation(MemorySegment src) { return _saturatingAccumulationAt(0L, src); }
    public MemorySegment _scopeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scope, index), LAYOUT_scope); }
    public MemorySegment _scope() { return _scopeAt(0L); }
    public VkCooperativeMatrixPropertiesKHR _scopeAt(long index, MemorySegment src) { _scopeAt(index).copyFrom(src); return this; }
    public VkCooperativeMatrixPropertiesKHR _scope(MemorySegment src) { return _scopeAt(0L, src); }
}
