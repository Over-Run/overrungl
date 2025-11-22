// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteDescriptorSetTensorARM`.
/// ## Layout
/// ```
/// struct VkWriteDescriptorSetTensorARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t tensorViewCount;
///     const VkTensorViewARM* pTensorViews;
/// }
/// ```
public final class VkWriteDescriptorSetTensorARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tensorViewCount"),
        ValueLayout.ADDRESS.withName("pTensorViews")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tensorViewCount = LAYOUT.byteOffset(PathElement.groupElement("tensorViewCount"));
    public static final long OFFSET_pTensorViews = LAYOUT.byteOffset(PathElement.groupElement("pTensorViews"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tensorViewCount = LAYOUT.select(PathElement.groupElement("tensorViewCount"));
    public static final MemoryLayout LAYOUT_pTensorViews = LAYOUT.select(PathElement.groupElement("pTensorViews"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tensorViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorViewCount"));
    public static final VarHandle VH_pTensorViews = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTensorViews"));

    public VkWriteDescriptorSetTensorARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWriteDescriptorSetTensorARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetTensorARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkWriteDescriptorSetTensorARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetTensorARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWriteDescriptorSetTensorARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetTensorARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWriteDescriptorSetTensorARM alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetTensorARM(allocator.allocate(LAYOUT), 1); }
    public static VkWriteDescriptorSetTensorARM alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSetTensorARM(allocator.allocate(LAYOUT, count), count); }
    public static VkWriteDescriptorSetTensorARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM); }
    public static VkWriteDescriptorSetTensorARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM);
        return s;
    }
    public VkWriteDescriptorSetTensorARM copyFrom(VkWriteDescriptorSetTensorARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWriteDescriptorSetTensorARM reinterpret(long count) { return new VkWriteDescriptorSetTensorARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWriteDescriptorSetTensorARM asSlice(long index) { return new VkWriteDescriptorSetTensorARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWriteDescriptorSetTensorARM asSlice(long index, long count) { return new VkWriteDescriptorSetTensorARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWriteDescriptorSetTensorARM at(long index, Consumer<VkWriteDescriptorSetTensorARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tensorViewCountAt(long index) { return (int) VH_tensorViewCount.get(this.segment(), 0L, index); }
    public MemorySegment pTensorViewsAt(long index) { return (MemorySegment) VH_pTensorViews.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tensorViewCount() { return (int) VH_tensorViewCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pTensorViews() { return (MemorySegment) VH_pTensorViews.get(this.segment(), 0L, 0L); }
    public VkWriteDescriptorSetTensorARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetTensorARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetTensorARM tensorViewCountAt(long index, int value) { VH_tensorViewCount.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetTensorARM pTensorViewsAt(long index, MemorySegment value) { VH_pTensorViews.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetTensorARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetTensorARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetTensorARM tensorViewCount(int value) { VH_tensorViewCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetTensorARM pTensorViews(MemorySegment value) { VH_pTensorViews.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWriteDescriptorSetTensorARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetTensorARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWriteDescriptorSetTensorARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetTensorARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tensorViewCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensorViewCount, index), LAYOUT_tensorViewCount); }
    public MemorySegment _tensorViewCount() { return _tensorViewCountAt(0L); }
    public VkWriteDescriptorSetTensorARM _tensorViewCountAt(long index, MemorySegment src) { _tensorViewCountAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetTensorARM _tensorViewCount(MemorySegment src) { return _tensorViewCountAt(0L, src); }
    public MemorySegment _pTensorViewsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTensorViews, index), LAYOUT_pTensorViews); }
    public MemorySegment _pTensorViews() { return _pTensorViewsAt(0L); }
    public VkWriteDescriptorSetTensorARM _pTensorViewsAt(long index, MemorySegment src) { _pTensorViewsAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetTensorARM _pTensorViews(MemorySegment src) { return _pTensorViewsAt(0L, src); }
}
