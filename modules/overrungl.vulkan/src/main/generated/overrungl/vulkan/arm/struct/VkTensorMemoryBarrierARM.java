// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorMemoryBarrierARM`.
/// ## Layout
/// ```
/// struct VkTensorMemoryBarrierARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineStageFlags2 srcStageMask;
///     VkAccessFlags2 srcAccessMask;
///     VkPipelineStageFlags2 dstStageMask;
///     VkAccessFlags2 dstAccessMask;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     VkTensorARM tensor;
/// }
/// ```
public final class VkTensorMemoryBarrierARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.JAVA_LONG.withName("tensor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcStageMask = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    public static final long OFFSET_dstStageMask = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    public static final long OFFSET_srcQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final long OFFSET_dstQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final long OFFSET_tensor = LAYOUT.byteOffset(PathElement.groupElement("tensor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcStageMask = LAYOUT.select(PathElement.groupElement("srcStageMask"));
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    public static final MemoryLayout LAYOUT_dstStageMask = LAYOUT.select(PathElement.groupElement("dstStageMask"));
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    public static final MemoryLayout LAYOUT_srcQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final MemoryLayout LAYOUT_dstQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final MemoryLayout LAYOUT_tensor = LAYOUT.select(PathElement.groupElement("tensor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final VarHandle VH_tensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensor"));

    public VkTensorMemoryBarrierARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTensorMemoryBarrierARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryBarrierARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTensorMemoryBarrierARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryBarrierARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTensorMemoryBarrierARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryBarrierARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTensorMemoryBarrierARM alloc(SegmentAllocator allocator) { return new VkTensorMemoryBarrierARM(allocator.allocate(LAYOUT), 1); }
    public static VkTensorMemoryBarrierARM alloc(SegmentAllocator allocator, long count) { return new VkTensorMemoryBarrierARM(allocator.allocate(LAYOUT, count), count); }
    public static VkTensorMemoryBarrierARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM); }
    public static VkTensorMemoryBarrierARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM);
        return s;
    }
    public VkTensorMemoryBarrierARM copyFrom(VkTensorMemoryBarrierARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTensorMemoryBarrierARM reinterpret(long count) { return new VkTensorMemoryBarrierARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTensorMemoryBarrierARM asSlice(long index) { return new VkTensorMemoryBarrierARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTensorMemoryBarrierARM asSlice(long index, long count) { return new VkTensorMemoryBarrierARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTensorMemoryBarrierARM at(long index, Consumer<VkTensorMemoryBarrierARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcStageMaskAt(long index) { return (long) VH_srcStageMask.get(this.segment(), 0L, index); }
    public long srcAccessMaskAt(long index) { return (long) VH_srcAccessMask.get(this.segment(), 0L, index); }
    public long dstStageMaskAt(long index) { return (long) VH_dstStageMask.get(this.segment(), 0L, index); }
    public long dstAccessMaskAt(long index) { return (long) VH_dstAccessMask.get(this.segment(), 0L, index); }
    public int srcQueueFamilyIndexAt(long index) { return (int) VH_srcQueueFamilyIndex.get(this.segment(), 0L, index); }
    public int dstQueueFamilyIndexAt(long index) { return (int) VH_dstQueueFamilyIndex.get(this.segment(), 0L, index); }
    public long tensorAt(long index) { return (long) VH_tensor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcStageMask() { return (long) VH_srcStageMask.get(this.segment(), 0L, 0L); }
    public long srcAccessMask() { return (long) VH_srcAccessMask.get(this.segment(), 0L, 0L); }
    public long dstStageMask() { return (long) VH_dstStageMask.get(this.segment(), 0L, 0L); }
    public long dstAccessMask() { return (long) VH_dstAccessMask.get(this.segment(), 0L, 0L); }
    public int srcQueueFamilyIndex() { return (int) VH_srcQueueFamilyIndex.get(this.segment(), 0L, 0L); }
    public int dstQueueFamilyIndex() { return (int) VH_dstQueueFamilyIndex.get(this.segment(), 0L, 0L); }
    public long tensor() { return (long) VH_tensor.get(this.segment(), 0L, 0L); }
    public VkTensorMemoryBarrierARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM srcStageMaskAt(long index, long value) { VH_srcStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM srcAccessMaskAt(long index, long value) { VH_srcAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM dstStageMaskAt(long index, long value) { VH_dstStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM dstAccessMaskAt(long index, long value) { VH_dstAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM srcQueueFamilyIndexAt(long index, int value) { VH_srcQueueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM dstQueueFamilyIndexAt(long index, int value) { VH_dstQueueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM tensorAt(long index, long value) { VH_tensor.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryBarrierARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryBarrierARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryBarrierARM srcStageMask(long value) { VH_srcStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryBarrierARM srcAccessMask(long value) { VH_srcAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryBarrierARM dstStageMask(long value) { VH_dstStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryBarrierARM dstAccessMask(long value) { VH_dstAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryBarrierARM srcQueueFamilyIndex(int value) { VH_srcQueueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryBarrierARM dstQueueFamilyIndex(int value) { VH_dstQueueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryBarrierARM tensor(long value) { VH_tensor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTensorMemoryBarrierARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTensorMemoryBarrierARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcStageMask, index), LAYOUT_srcStageMask); }
    public MemorySegment _srcStageMask() { return _srcStageMaskAt(0L); }
    public VkTensorMemoryBarrierARM _srcStageMaskAt(long index, MemorySegment src) { _srcStageMaskAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _srcStageMask(MemorySegment src) { return _srcStageMaskAt(0L, src); }
    public MemorySegment _srcAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccessMask, index), LAYOUT_srcAccessMask); }
    public MemorySegment _srcAccessMask() { return _srcAccessMaskAt(0L); }
    public VkTensorMemoryBarrierARM _srcAccessMaskAt(long index, MemorySegment src) { _srcAccessMaskAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _srcAccessMask(MemorySegment src) { return _srcAccessMaskAt(0L, src); }
    public MemorySegment _dstStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstStageMask, index), LAYOUT_dstStageMask); }
    public MemorySegment _dstStageMask() { return _dstStageMaskAt(0L); }
    public VkTensorMemoryBarrierARM _dstStageMaskAt(long index, MemorySegment src) { _dstStageMaskAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _dstStageMask(MemorySegment src) { return _dstStageMaskAt(0L, src); }
    public MemorySegment _dstAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAccessMask, index), LAYOUT_dstAccessMask); }
    public MemorySegment _dstAccessMask() { return _dstAccessMaskAt(0L); }
    public VkTensorMemoryBarrierARM _dstAccessMaskAt(long index, MemorySegment src) { _dstAccessMaskAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _dstAccessMask(MemorySegment src) { return _dstAccessMaskAt(0L, src); }
    public MemorySegment _srcQueueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcQueueFamilyIndex, index), LAYOUT_srcQueueFamilyIndex); }
    public MemorySegment _srcQueueFamilyIndex() { return _srcQueueFamilyIndexAt(0L); }
    public VkTensorMemoryBarrierARM _srcQueueFamilyIndexAt(long index, MemorySegment src) { _srcQueueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _srcQueueFamilyIndex(MemorySegment src) { return _srcQueueFamilyIndexAt(0L, src); }
    public MemorySegment _dstQueueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstQueueFamilyIndex, index), LAYOUT_dstQueueFamilyIndex); }
    public MemorySegment _dstQueueFamilyIndex() { return _dstQueueFamilyIndexAt(0L); }
    public VkTensorMemoryBarrierARM _dstQueueFamilyIndexAt(long index, MemorySegment src) { _dstQueueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _dstQueueFamilyIndex(MemorySegment src) { return _dstQueueFamilyIndexAt(0L, src); }
    public MemorySegment _tensorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensor, index), LAYOUT_tensor); }
    public MemorySegment _tensor() { return _tensorAt(0L); }
    public VkTensorMemoryBarrierARM _tensorAt(long index, MemorySegment src) { _tensorAt(index).copyFrom(src); return this; }
    public VkTensorMemoryBarrierARM _tensor(MemorySegment src) { return _tensorAt(0L, src); }
}
