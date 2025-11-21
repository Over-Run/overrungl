// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyTensorInfoARM`.
/// ## Layout
/// ```
/// struct VkCopyTensorInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkTensorARM srcTensor;
///     VkTensorARM dstTensor;
///     uint32_t regionCount;
///     const VkTensorCopyARM* pRegions;
/// }
/// ```
public final class VkCopyTensorInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcTensor"),
        ValueLayout.JAVA_LONG.withName("dstTensor"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcTensor = LAYOUT.byteOffset(PathElement.groupElement("srcTensor"));
    public static final long OFFSET_dstTensor = LAYOUT.byteOffset(PathElement.groupElement("dstTensor"));
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcTensor = LAYOUT.select(PathElement.groupElement("srcTensor"));
    public static final MemoryLayout LAYOUT_dstTensor = LAYOUT.select(PathElement.groupElement("dstTensor"));
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcTensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcTensor"));
    public static final VarHandle VH_dstTensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstTensor"));
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    public VkCopyTensorInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyTensorInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyTensorInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyTensorInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyTensorInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyTensorInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyTensorInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyTensorInfoARM alloc(SegmentAllocator allocator) { return new VkCopyTensorInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkCopyTensorInfoARM alloc(SegmentAllocator allocator, long count) { return new VkCopyTensorInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyTensorInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM); }
    public static VkCopyTensorInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM);
        return s;
    }
    public VkCopyTensorInfoARM copyFrom(VkCopyTensorInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyTensorInfoARM reinterpret(long count) { return new VkCopyTensorInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyTensorInfoARM asSlice(long index) { return new VkCopyTensorInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyTensorInfoARM asSlice(long index, long count) { return new VkCopyTensorInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyTensorInfoARM at(long index, Consumer<VkCopyTensorInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcTensorAt(long index) { return (long) VH_srcTensor.get(this.segment(), 0L, index); }
    public long dstTensorAt(long index) { return (long) VH_dstTensor.get(this.segment(), 0L, index); }
    public int regionCountAt(long index) { return (int) VH_regionCount.get(this.segment(), 0L, index); }
    public MemorySegment pRegionsAt(long index) { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcTensor() { return (long) VH_srcTensor.get(this.segment(), 0L, 0L); }
    public long dstTensor() { return (long) VH_dstTensor.get(this.segment(), 0L, 0L); }
    public int regionCount() { return (int) VH_regionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRegions() { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, 0L); }
    public VkCopyTensorInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyTensorInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyTensorInfoARM srcTensorAt(long index, long value) { VH_srcTensor.set(this.segment(), 0L, index, value); return this; }
    public VkCopyTensorInfoARM dstTensorAt(long index, long value) { VH_dstTensor.set(this.segment(), 0L, index, value); return this; }
    public VkCopyTensorInfoARM regionCountAt(long index, int value) { VH_regionCount.set(this.segment(), 0L, index, value); return this; }
    public VkCopyTensorInfoARM pRegionsAt(long index, MemorySegment value) { VH_pRegions.set(this.segment(), 0L, index, value); return this; }
    public VkCopyTensorInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyTensorInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyTensorInfoARM srcTensor(long value) { VH_srcTensor.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyTensorInfoARM dstTensor(long value) { VH_dstTensor.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyTensorInfoARM regionCount(int value) { VH_regionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyTensorInfoARM pRegions(MemorySegment value) { VH_pRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyTensorInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyTensorInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyTensorInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyTensorInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcTensorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcTensor, index), LAYOUT_srcTensor); }
    public MemorySegment _srcTensor() { return _srcTensorAt(0L); }
    public VkCopyTensorInfoARM _srcTensorAt(long index, MemorySegment src) { _srcTensorAt(index).copyFrom(src); return this; }
    public VkCopyTensorInfoARM _srcTensor(MemorySegment src) { return _srcTensorAt(0L, src); }
    public MemorySegment _dstTensorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstTensor, index), LAYOUT_dstTensor); }
    public MemorySegment _dstTensor() { return _dstTensorAt(0L); }
    public VkCopyTensorInfoARM _dstTensorAt(long index, MemorySegment src) { _dstTensorAt(index).copyFrom(src); return this; }
    public VkCopyTensorInfoARM _dstTensor(MemorySegment src) { return _dstTensorAt(0L, src); }
    public MemorySegment _regionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_regionCount, index), LAYOUT_regionCount); }
    public MemorySegment _regionCount() { return _regionCountAt(0L); }
    public VkCopyTensorInfoARM _regionCountAt(long index, MemorySegment src) { _regionCountAt(index).copyFrom(src); return this; }
    public VkCopyTensorInfoARM _regionCount(MemorySegment src) { return _regionCountAt(0L, src); }
    public MemorySegment _pRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRegions, index), LAYOUT_pRegions); }
    public MemorySegment _pRegions() { return _pRegionsAt(0L); }
    public VkCopyTensorInfoARM _pRegionsAt(long index, MemorySegment src) { _pRegionsAt(index).copyFrom(src); return this; }
    public VkCopyTensorInfoARM _pRegions(MemorySegment src) { return _pRegionsAt(0L, src); }
}
