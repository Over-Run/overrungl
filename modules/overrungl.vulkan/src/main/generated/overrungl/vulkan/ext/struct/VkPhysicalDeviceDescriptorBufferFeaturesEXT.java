// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorBufferFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorBufferFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 descriptorBuffer;
///     VkBool32 descriptorBufferCaptureReplay;
///     VkBool32 descriptorBufferImageLayoutIgnored;
///     VkBool32 descriptorBufferPushDescriptors;
/// }
/// ```
public final class VkPhysicalDeviceDescriptorBufferFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorBuffer"),
        ValueLayout.JAVA_INT.withName("descriptorBufferCaptureReplay"),
        ValueLayout.JAVA_INT.withName("descriptorBufferImageLayoutIgnored"),
        ValueLayout.JAVA_INT.withName("descriptorBufferPushDescriptors")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorBuffer = LAYOUT.byteOffset(PathElement.groupElement("descriptorBuffer"));
    public static final long OFFSET_descriptorBufferCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferCaptureReplay"));
    public static final long OFFSET_descriptorBufferImageLayoutIgnored = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
    public static final long OFFSET_descriptorBufferPushDescriptors = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferPushDescriptors"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorBuffer = LAYOUT.select(PathElement.groupElement("descriptorBuffer"));
    public static final MemoryLayout LAYOUT_descriptorBufferCaptureReplay = LAYOUT.select(PathElement.groupElement("descriptorBufferCaptureReplay"));
    public static final MemoryLayout LAYOUT_descriptorBufferImageLayoutIgnored = LAYOUT.select(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
    public static final MemoryLayout LAYOUT_descriptorBufferPushDescriptors = LAYOUT.select(PathElement.groupElement("descriptorBufferPushDescriptors"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBuffer"));
    public static final VarHandle VH_descriptorBufferCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferCaptureReplay"));
    public static final VarHandle VH_descriptorBufferImageLayoutIgnored = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
    public static final VarHandle VH_descriptorBufferPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferPushDescriptors"));

    public VkPhysicalDeviceDescriptorBufferFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT); }
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT copyFrom(VkPhysicalDeviceDescriptorBufferFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT at(long index, Consumer<VkPhysicalDeviceDescriptorBufferFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int descriptorBufferAt(long index) { return (int) VH_descriptorBuffer.get(this.segment(), 0L, index); }
    public int descriptorBufferCaptureReplayAt(long index) { return (int) VH_descriptorBufferCaptureReplay.get(this.segment(), 0L, index); }
    public int descriptorBufferImageLayoutIgnoredAt(long index) { return (int) VH_descriptorBufferImageLayoutIgnored.get(this.segment(), 0L, index); }
    public int descriptorBufferPushDescriptorsAt(long index) { return (int) VH_descriptorBufferPushDescriptors.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int descriptorBuffer() { return (int) VH_descriptorBuffer.get(this.segment(), 0L, 0L); }
    public int descriptorBufferCaptureReplay() { return (int) VH_descriptorBufferCaptureReplay.get(this.segment(), 0L, 0L); }
    public int descriptorBufferImageLayoutIgnored() { return (int) VH_descriptorBufferImageLayoutIgnored.get(this.segment(), 0L, 0L); }
    public int descriptorBufferPushDescriptors() { return (int) VH_descriptorBufferPushDescriptors.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferAt(long index, int value) { VH_descriptorBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferCaptureReplayAt(long index, int value) { VH_descriptorBufferCaptureReplay.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferImageLayoutIgnoredAt(long index, int value) { VH_descriptorBufferImageLayoutIgnored.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferPushDescriptorsAt(long index, int value) { VH_descriptorBufferPushDescriptors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBuffer(int value) { VH_descriptorBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferCaptureReplay(int value) { VH_descriptorBufferCaptureReplay.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferImageLayoutIgnored(int value) { VH_descriptorBufferImageLayoutIgnored.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferPushDescriptors(int value) { VH_descriptorBufferPushDescriptors.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBuffer, index), LAYOUT_descriptorBuffer); }
    public MemorySegment _descriptorBuffer() { return _descriptorBufferAt(0L); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _descriptorBufferAt(long index, MemorySegment src) { _descriptorBufferAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _descriptorBuffer(MemorySegment src) { return _descriptorBufferAt(0L, src); }
    public MemorySegment _descriptorBufferCaptureReplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBufferCaptureReplay, index), LAYOUT_descriptorBufferCaptureReplay); }
    public MemorySegment _descriptorBufferCaptureReplay() { return _descriptorBufferCaptureReplayAt(0L); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _descriptorBufferCaptureReplayAt(long index, MemorySegment src) { _descriptorBufferCaptureReplayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _descriptorBufferCaptureReplay(MemorySegment src) { return _descriptorBufferCaptureReplayAt(0L, src); }
    public MemorySegment _descriptorBufferImageLayoutIgnoredAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBufferImageLayoutIgnored, index), LAYOUT_descriptorBufferImageLayoutIgnored); }
    public MemorySegment _descriptorBufferImageLayoutIgnored() { return _descriptorBufferImageLayoutIgnoredAt(0L); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _descriptorBufferImageLayoutIgnoredAt(long index, MemorySegment src) { _descriptorBufferImageLayoutIgnoredAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _descriptorBufferImageLayoutIgnored(MemorySegment src) { return _descriptorBufferImageLayoutIgnoredAt(0L, src); }
    public MemorySegment _descriptorBufferPushDescriptorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBufferPushDescriptors, index), LAYOUT_descriptorBufferPushDescriptors); }
    public MemorySegment _descriptorBufferPushDescriptors() { return _descriptorBufferPushDescriptorsAt(0L); }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _descriptorBufferPushDescriptorsAt(long index, MemorySegment src) { _descriptorBufferPushDescriptorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT _descriptorBufferPushDescriptors(MemorySegment src) { return _descriptorBufferPushDescriptorsAt(0L, src); }
}
