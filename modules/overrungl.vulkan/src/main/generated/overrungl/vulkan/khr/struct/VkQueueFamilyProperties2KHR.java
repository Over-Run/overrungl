// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyProperties2KHR`.
/// ## Layout
/// ```
/// struct VkQueueFamilyProperties2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkQueueFamilyProperties queueFamilyProperties;
/// }
/// ```
public final class VkQueueFamilyProperties2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkQueueFamilyProperties.LAYOUT.withName("queueFamilyProperties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queueFamilyProperties = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyProperties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queueFamilyProperties = LAYOUT.select(PathElement.groupElement("queueFamilyProperties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queueFamilyProperties$queueFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyProperties"), PathElement.groupElement("queueFlags"));
    public static final VarHandle VH_queueFamilyProperties$queueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyProperties"), PathElement.groupElement("queueCount"));
    public static final VarHandle VH_queueFamilyProperties$timestampValidBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyProperties"), PathElement.groupElement("timestampValidBits"));
    public static final VarHandle VH_queueFamilyProperties$minImageTransferGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyProperties"), PathElement.groupElement("minImageTransferGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_queueFamilyProperties$minImageTransferGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyProperties"), PathElement.groupElement("minImageTransferGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_queueFamilyProperties$minImageTransferGranularity$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyProperties"), PathElement.groupElement("minImageTransferGranularity"), PathElement.groupElement("depth"));

    public VkQueueFamilyProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyProperties2KHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyProperties2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyProperties2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkQueueFamilyProperties2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2); }
    public static VkQueueFamilyProperties2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2);
        return s;
    }
    public VkQueueFamilyProperties2KHR copyFrom(VkQueueFamilyProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyProperties2KHR reinterpret(long count) { return new VkQueueFamilyProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyProperties2KHR asSlice(long index) { return new VkQueueFamilyProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyProperties2KHR asSlice(long index, long count) { return new VkQueueFamilyProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyProperties2KHR at(long index, Consumer<VkQueueFamilyProperties2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int queueFamilyProperties$queueFlagsAt(long index) { return (int) VH_queueFamilyProperties$queueFlags.get(this.segment(), 0L, index); }
    public int queueFamilyProperties$queueCountAt(long index) { return (int) VH_queueFamilyProperties$queueCount.get(this.segment(), 0L, index); }
    public int queueFamilyProperties$timestampValidBitsAt(long index) { return (int) VH_queueFamilyProperties$timestampValidBits.get(this.segment(), 0L, index); }
    public int queueFamilyProperties$minImageTransferGranularity$widthAt(long index) { return (int) VH_queueFamilyProperties$minImageTransferGranularity$width.get(this.segment(), 0L, index); }
    public int queueFamilyProperties$minImageTransferGranularity$heightAt(long index) { return (int) VH_queueFamilyProperties$minImageTransferGranularity$height.get(this.segment(), 0L, index); }
    public int queueFamilyProperties$minImageTransferGranularity$depthAt(long index) { return (int) VH_queueFamilyProperties$minImageTransferGranularity$depth.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int queueFamilyProperties$queueFlags() { return (int) VH_queueFamilyProperties$queueFlags.get(this.segment(), 0L, 0L); }
    public int queueFamilyProperties$queueCount() { return (int) VH_queueFamilyProperties$queueCount.get(this.segment(), 0L, 0L); }
    public int queueFamilyProperties$timestampValidBits() { return (int) VH_queueFamilyProperties$timestampValidBits.get(this.segment(), 0L, 0L); }
    public int queueFamilyProperties$minImageTransferGranularity$width() { return (int) VH_queueFamilyProperties$minImageTransferGranularity$width.get(this.segment(), 0L, 0L); }
    public int queueFamilyProperties$minImageTransferGranularity$height() { return (int) VH_queueFamilyProperties$minImageTransferGranularity$height.get(this.segment(), 0L, 0L); }
    public int queueFamilyProperties$minImageTransferGranularity$depth() { return (int) VH_queueFamilyProperties$minImageTransferGranularity$depth.get(this.segment(), 0L, 0L); }
    public VkQueueFamilyProperties2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$queueFlagsAt(long index, int value) { VH_queueFamilyProperties$queueFlags.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$queueCountAt(long index, int value) { VH_queueFamilyProperties$queueCount.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$timestampValidBitsAt(long index, int value) { VH_queueFamilyProperties$timestampValidBits.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$minImageTransferGranularity$widthAt(long index, int value) { VH_queueFamilyProperties$minImageTransferGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$minImageTransferGranularity$heightAt(long index, int value) { VH_queueFamilyProperties$minImageTransferGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$minImageTransferGranularity$depthAt(long index, int value) { VH_queueFamilyProperties$minImageTransferGranularity$depth.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$queueFlags(int value) { VH_queueFamilyProperties$queueFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$queueCount(int value) { VH_queueFamilyProperties$queueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$timestampValidBits(int value) { VH_queueFamilyProperties$timestampValidBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$minImageTransferGranularity$width(int value) { VH_queueFamilyProperties$minImageTransferGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$minImageTransferGranularity$height(int value) { VH_queueFamilyProperties$minImageTransferGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties2KHR queueFamilyProperties$minImageTransferGranularity$depth(int value) { VH_queueFamilyProperties$minImageTransferGranularity$depth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueueFamilyProperties2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueueFamilyProperties2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueueFamilyProperties2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueueFamilyProperties2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queueFamilyPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyProperties, index), LAYOUT_queueFamilyProperties); }
    public MemorySegment _queueFamilyProperties() { return _queueFamilyPropertiesAt(0L); }
    public VkQueueFamilyProperties2KHR _queueFamilyPropertiesAt(long index, MemorySegment src) { _queueFamilyPropertiesAt(index).copyFrom(src); return this; }
    public VkQueueFamilyProperties2KHR _queueFamilyProperties(MemorySegment src) { return _queueFamilyPropertiesAt(0L, src); }
}
