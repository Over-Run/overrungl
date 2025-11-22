// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorBufferTensorFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorBufferTensorFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 descriptorBufferTensorDescriptors;
/// }
/// ```
public final class VkPhysicalDeviceDescriptorBufferTensorFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorBufferTensorDescriptors")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorBufferTensorDescriptors = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferTensorDescriptors"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorBufferTensorDescriptors = LAYOUT.select(PathElement.groupElement("descriptorBufferTensorDescriptors"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorBufferTensorDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferTensorDescriptors"));

    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM); }
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM);
        return s;
    }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM copyFrom(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM at(long index, Consumer<VkPhysicalDeviceDescriptorBufferTensorFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int descriptorBufferTensorDescriptorsAt(long index) { return (int) VH_descriptorBufferTensorDescriptors.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int descriptorBufferTensorDescriptors() { return (int) VH_descriptorBufferTensorDescriptors.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM descriptorBufferTensorDescriptorsAt(long index, int value) { VH_descriptorBufferTensorDescriptors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM descriptorBufferTensorDescriptors(int value) { VH_descriptorBufferTensorDescriptors.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorBufferTensorDescriptorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBufferTensorDescriptors, index), LAYOUT_descriptorBufferTensorDescriptors); }
    public MemorySegment _descriptorBufferTensorDescriptors() { return _descriptorBufferTensorDescriptorsAt(0L); }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM _descriptorBufferTensorDescriptorsAt(long index, MemorySegment src) { _descriptorBufferTensorDescriptorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM _descriptorBufferTensorDescriptors(MemorySegment src) { return _descriptorBufferTensorDescriptorsAt(0L, src); }
}
