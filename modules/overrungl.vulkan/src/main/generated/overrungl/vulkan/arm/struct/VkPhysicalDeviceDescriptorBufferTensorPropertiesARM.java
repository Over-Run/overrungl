// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorBufferTensorPropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     size_t tensorCaptureReplayDescriptorDataSize;
///     size_t tensorViewCaptureReplayDescriptorDataSize;
///     size_t tensorDescriptorSize;
/// }
/// ```
public final class VkPhysicalDeviceDescriptorBufferTensorPropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("tensorCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("tensorViewCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("tensorDescriptorSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tensorCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("tensorCaptureReplayDescriptorDataSize"));
    public static final long OFFSET_tensorViewCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("tensorViewCaptureReplayDescriptorDataSize"));
    public static final long OFFSET_tensorDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("tensorDescriptorSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tensorCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("tensorCaptureReplayDescriptorDataSize"));
    public static final MemoryLayout LAYOUT_tensorViewCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("tensorViewCaptureReplayDescriptorDataSize"));
    public static final MemoryLayout LAYOUT_tensorDescriptorSize = LAYOUT.select(PathElement.groupElement("tensorDescriptorSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tensorCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorCaptureReplayDescriptorDataSize"));
    public static final VarHandle VH_tensorViewCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorViewCaptureReplayDescriptorDataSize"));
    public static final VarHandle VH_tensorDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorDescriptorSize"));

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM); }
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM);
        return s;
    }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM copyFrom(VkPhysicalDeviceDescriptorBufferTensorPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM reinterpret(long count) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM at(long index, Consumer<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long tensorCaptureReplayDescriptorDataSizeAt(long index) { return (long) VH_tensorCaptureReplayDescriptorDataSize.get(this.segment(), 0L, index); }
    public long tensorViewCaptureReplayDescriptorDataSizeAt(long index) { return (long) VH_tensorViewCaptureReplayDescriptorDataSize.get(this.segment(), 0L, index); }
    public long tensorDescriptorSizeAt(long index) { return (long) VH_tensorDescriptorSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long tensorCaptureReplayDescriptorDataSize() { return (long) VH_tensorCaptureReplayDescriptorDataSize.get(this.segment(), 0L, 0L); }
    public long tensorViewCaptureReplayDescriptorDataSize() { return (long) VH_tensorViewCaptureReplayDescriptorDataSize.get(this.segment(), 0L, 0L); }
    public long tensorDescriptorSize() { return (long) VH_tensorDescriptorSize.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorCaptureReplayDescriptorDataSizeAt(long index, long value) { VH_tensorCaptureReplayDescriptorDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorViewCaptureReplayDescriptorDataSizeAt(long index, long value) { VH_tensorViewCaptureReplayDescriptorDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorDescriptorSizeAt(long index, long value) { VH_tensorDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorCaptureReplayDescriptorDataSize(long value) { VH_tensorCaptureReplayDescriptorDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorViewCaptureReplayDescriptorDataSize(long value) { VH_tensorViewCaptureReplayDescriptorDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorDescriptorSize(long value) { VH_tensorDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tensorCaptureReplayDescriptorDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensorCaptureReplayDescriptorDataSize, index), LAYOUT_tensorCaptureReplayDescriptorDataSize); }
    public MemorySegment _tensorCaptureReplayDescriptorDataSize() { return _tensorCaptureReplayDescriptorDataSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _tensorCaptureReplayDescriptorDataSizeAt(long index, MemorySegment src) { _tensorCaptureReplayDescriptorDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _tensorCaptureReplayDescriptorDataSize(MemorySegment src) { return _tensorCaptureReplayDescriptorDataSizeAt(0L, src); }
    public MemorySegment _tensorViewCaptureReplayDescriptorDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensorViewCaptureReplayDescriptorDataSize, index), LAYOUT_tensorViewCaptureReplayDescriptorDataSize); }
    public MemorySegment _tensorViewCaptureReplayDescriptorDataSize() { return _tensorViewCaptureReplayDescriptorDataSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _tensorViewCaptureReplayDescriptorDataSizeAt(long index, MemorySegment src) { _tensorViewCaptureReplayDescriptorDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _tensorViewCaptureReplayDescriptorDataSize(MemorySegment src) { return _tensorViewCaptureReplayDescriptorDataSizeAt(0L, src); }
    public MemorySegment _tensorDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensorDescriptorSize, index), LAYOUT_tensorDescriptorSize); }
    public MemorySegment _tensorDescriptorSize() { return _tensorDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _tensorDescriptorSizeAt(long index, MemorySegment src) { _tensorDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM _tensorDescriptorSize(MemorySegment src) { return _tensorDescriptorSizeAt(0L, src); }
}
