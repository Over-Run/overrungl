// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorCopyARM`.
/// ## Layout
/// ```
/// struct VkTensorCopyARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t dimensionCount;
///     const uint64_t* pSrcOffset;
///     const uint64_t* pDstOffset;
///     const uint64_t* pExtent;
/// }
/// ```
public final class VkTensorCopyARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dimensionCount"),
        ValueLayout.ADDRESS.withName("pSrcOffset"),
        ValueLayout.ADDRESS.withName("pDstOffset"),
        ValueLayout.ADDRESS.withName("pExtent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dimensionCount = LAYOUT.byteOffset(PathElement.groupElement("dimensionCount"));
    public static final long OFFSET_pSrcOffset = LAYOUT.byteOffset(PathElement.groupElement("pSrcOffset"));
    public static final long OFFSET_pDstOffset = LAYOUT.byteOffset(PathElement.groupElement("pDstOffset"));
    public static final long OFFSET_pExtent = LAYOUT.byteOffset(PathElement.groupElement("pExtent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dimensionCount = LAYOUT.select(PathElement.groupElement("dimensionCount"));
    public static final MemoryLayout LAYOUT_pSrcOffset = LAYOUT.select(PathElement.groupElement("pSrcOffset"));
    public static final MemoryLayout LAYOUT_pDstOffset = LAYOUT.select(PathElement.groupElement("pDstOffset"));
    public static final MemoryLayout LAYOUT_pExtent = LAYOUT.select(PathElement.groupElement("pExtent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dimensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dimensionCount"));
    public static final VarHandle VH_pSrcOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSrcOffset"));
    public static final VarHandle VH_pDstOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDstOffset"));
    public static final VarHandle VH_pExtent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtent"));

    public VkTensorCopyARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTensorCopyARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCopyARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTensorCopyARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCopyARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTensorCopyARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCopyARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTensorCopyARM alloc(SegmentAllocator allocator) { return new VkTensorCopyARM(allocator.allocate(LAYOUT), 1); }
    public static VkTensorCopyARM alloc(SegmentAllocator allocator, long count) { return new VkTensorCopyARM(allocator.allocate(LAYOUT, count), count); }
    public static VkTensorCopyARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_COPY_ARM); }
    public static VkTensorCopyARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_COPY_ARM);
        return s;
    }
    public VkTensorCopyARM copyFrom(VkTensorCopyARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTensorCopyARM reinterpret(long count) { return new VkTensorCopyARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTensorCopyARM asSlice(long index) { return new VkTensorCopyARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTensorCopyARM asSlice(long index, long count) { return new VkTensorCopyARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTensorCopyARM at(long index, Consumer<VkTensorCopyARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dimensionCountAt(long index) { return (int) VH_dimensionCount.get(this.segment(), 0L, index); }
    public MemorySegment pSrcOffsetAt(long index) { return (MemorySegment) VH_pSrcOffset.get(this.segment(), 0L, index); }
    public MemorySegment pDstOffsetAt(long index) { return (MemorySegment) VH_pDstOffset.get(this.segment(), 0L, index); }
    public MemorySegment pExtentAt(long index) { return (MemorySegment) VH_pExtent.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dimensionCount() { return (int) VH_dimensionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSrcOffset() { return (MemorySegment) VH_pSrcOffset.get(this.segment(), 0L, 0L); }
    public MemorySegment pDstOffset() { return (MemorySegment) VH_pDstOffset.get(this.segment(), 0L, 0L); }
    public MemorySegment pExtent() { return (MemorySegment) VH_pExtent.get(this.segment(), 0L, 0L); }
    public VkTensorCopyARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCopyARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCopyARM dimensionCountAt(long index, int value) { VH_dimensionCount.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCopyARM pSrcOffsetAt(long index, MemorySegment value) { VH_pSrcOffset.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCopyARM pDstOffsetAt(long index, MemorySegment value) { VH_pDstOffset.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCopyARM pExtentAt(long index, MemorySegment value) { VH_pExtent.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCopyARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCopyARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCopyARM dimensionCount(int value) { VH_dimensionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCopyARM pSrcOffset(MemorySegment value) { VH_pSrcOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCopyARM pDstOffset(MemorySegment value) { VH_pDstOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCopyARM pExtent(MemorySegment value) { VH_pExtent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTensorCopyARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTensorCopyARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTensorCopyARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTensorCopyARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dimensionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dimensionCount, index), LAYOUT_dimensionCount); }
    public MemorySegment _dimensionCount() { return _dimensionCountAt(0L); }
    public VkTensorCopyARM _dimensionCountAt(long index, MemorySegment src) { _dimensionCountAt(index).copyFrom(src); return this; }
    public VkTensorCopyARM _dimensionCount(MemorySegment src) { return _dimensionCountAt(0L, src); }
    public MemorySegment _pSrcOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSrcOffset, index), LAYOUT_pSrcOffset); }
    public MemorySegment _pSrcOffset() { return _pSrcOffsetAt(0L); }
    public VkTensorCopyARM _pSrcOffsetAt(long index, MemorySegment src) { _pSrcOffsetAt(index).copyFrom(src); return this; }
    public VkTensorCopyARM _pSrcOffset(MemorySegment src) { return _pSrcOffsetAt(0L, src); }
    public MemorySegment _pDstOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDstOffset, index), LAYOUT_pDstOffset); }
    public MemorySegment _pDstOffset() { return _pDstOffsetAt(0L); }
    public VkTensorCopyARM _pDstOffsetAt(long index, MemorySegment src) { _pDstOffsetAt(index).copyFrom(src); return this; }
    public VkTensorCopyARM _pDstOffset(MemorySegment src) { return _pDstOffsetAt(0L, src); }
    public MemorySegment _pExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pExtent, index), LAYOUT_pExtent); }
    public MemorySegment _pExtent() { return _pExtentAt(0L); }
    public VkTensorCopyARM _pExtentAt(long index, MemorySegment src) { _pExtentAt(index).copyFrom(src); return this; }
    public VkTensorCopyARM _pExtent(MemorySegment src) { return _pExtentAt(0L, src); }
}
