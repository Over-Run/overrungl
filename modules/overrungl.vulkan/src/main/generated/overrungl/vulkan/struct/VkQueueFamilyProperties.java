// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyProperties`.
/// ## Layout
/// ```
/// struct VkQueueFamilyProperties {
///     VkQueueFlags queueFlags;
///     uint32_t queueCount;
///     uint32_t timestampValidBits;
///     VkExtent3D minImageTransferGranularity;
/// }
/// ```
public final class VkQueueFamilyProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("queueFlags"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.JAVA_INT.withName("timestampValidBits"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("minImageTransferGranularity")
    );
    public static final long OFFSET_queueFlags = LAYOUT.byteOffset(PathElement.groupElement("queueFlags"));
    public static final long OFFSET_queueCount = LAYOUT.byteOffset(PathElement.groupElement("queueCount"));
    public static final long OFFSET_timestampValidBits = LAYOUT.byteOffset(PathElement.groupElement("timestampValidBits"));
    public static final long OFFSET_minImageTransferGranularity = LAYOUT.byteOffset(PathElement.groupElement("minImageTransferGranularity"));
    public static final MemoryLayout LAYOUT_queueFlags = LAYOUT.select(PathElement.groupElement("queueFlags"));
    public static final MemoryLayout LAYOUT_queueCount = LAYOUT.select(PathElement.groupElement("queueCount"));
    public static final MemoryLayout LAYOUT_timestampValidBits = LAYOUT.select(PathElement.groupElement("timestampValidBits"));
    public static final MemoryLayout LAYOUT_minImageTransferGranularity = LAYOUT.select(PathElement.groupElement("minImageTransferGranularity"));
    public static final VarHandle VH_queueFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFlags"));
    public static final VarHandle VH_queueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCount"));
    public static final VarHandle VH_timestampValidBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampValidBits"));
    public static final VarHandle VH_minImageTransferGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageTransferGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_minImageTransferGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageTransferGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_minImageTransferGranularity$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageTransferGranularity"), PathElement.groupElement("depth"));

    public VkQueueFamilyProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyProperties alloc(SegmentAllocator allocator) { return new VkQueueFamilyProperties(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyProperties alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyProperties(allocator.allocate(LAYOUT, count), count); }
    public VkQueueFamilyProperties copyFrom(VkQueueFamilyProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyProperties reinterpret(long count) { return new VkQueueFamilyProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyProperties asSlice(long index) { return new VkQueueFamilyProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyProperties asSlice(long index, long count) { return new VkQueueFamilyProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyProperties at(long index, Consumer<VkQueueFamilyProperties> func) { func.accept(asSlice(index)); return this; }
    public int queueFlagsAt(long index) { return (int) VH_queueFlags.get(this.segment(), 0L, index); }
    public int queueCountAt(long index) { return (int) VH_queueCount.get(this.segment(), 0L, index); }
    public int timestampValidBitsAt(long index) { return (int) VH_timestampValidBits.get(this.segment(), 0L, index); }
    public int minImageTransferGranularity$widthAt(long index) { return (int) VH_minImageTransferGranularity$width.get(this.segment(), 0L, index); }
    public int minImageTransferGranularity$heightAt(long index) { return (int) VH_minImageTransferGranularity$height.get(this.segment(), 0L, index); }
    public int minImageTransferGranularity$depthAt(long index) { return (int) VH_minImageTransferGranularity$depth.get(this.segment(), 0L, index); }
    public int queueFlags() { return (int) VH_queueFlags.get(this.segment(), 0L, 0L); }
    public int queueCount() { return (int) VH_queueCount.get(this.segment(), 0L, 0L); }
    public int timestampValidBits() { return (int) VH_timestampValidBits.get(this.segment(), 0L, 0L); }
    public int minImageTransferGranularity$width() { return (int) VH_minImageTransferGranularity$width.get(this.segment(), 0L, 0L); }
    public int minImageTransferGranularity$height() { return (int) VH_minImageTransferGranularity$height.get(this.segment(), 0L, 0L); }
    public int minImageTransferGranularity$depth() { return (int) VH_minImageTransferGranularity$depth.get(this.segment(), 0L, 0L); }
    public VkQueueFamilyProperties queueFlagsAt(long index, int value) { VH_queueFlags.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties queueCountAt(long index, int value) { VH_queueCount.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties timestampValidBitsAt(long index, int value) { VH_timestampValidBits.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties minImageTransferGranularity$widthAt(long index, int value) { VH_minImageTransferGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties minImageTransferGranularity$heightAt(long index, int value) { VH_minImageTransferGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties minImageTransferGranularity$depthAt(long index, int value) { VH_minImageTransferGranularity$depth.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyProperties queueFlags(int value) { VH_queueFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties queueCount(int value) { VH_queueCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties timestampValidBits(int value) { VH_timestampValidBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties minImageTransferGranularity$width(int value) { VH_minImageTransferGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties minImageTransferGranularity$height(int value) { VH_minImageTransferGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyProperties minImageTransferGranularity$depth(int value) { VH_minImageTransferGranularity$depth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _queueFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFlags, index), LAYOUT_queueFlags); }
    public MemorySegment _queueFlags() { return _queueFlagsAt(0L); }
    public VkQueueFamilyProperties _queueFlagsAt(long index, MemorySegment src) { _queueFlagsAt(index).copyFrom(src); return this; }
    public VkQueueFamilyProperties _queueFlags(MemorySegment src) { return _queueFlagsAt(0L, src); }
    public MemorySegment _queueCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueCount, index), LAYOUT_queueCount); }
    public MemorySegment _queueCount() { return _queueCountAt(0L); }
    public VkQueueFamilyProperties _queueCountAt(long index, MemorySegment src) { _queueCountAt(index).copyFrom(src); return this; }
    public VkQueueFamilyProperties _queueCount(MemorySegment src) { return _queueCountAt(0L, src); }
    public MemorySegment _timestampValidBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timestampValidBits, index), LAYOUT_timestampValidBits); }
    public MemorySegment _timestampValidBits() { return _timestampValidBitsAt(0L); }
    public VkQueueFamilyProperties _timestampValidBitsAt(long index, MemorySegment src) { _timestampValidBitsAt(index).copyFrom(src); return this; }
    public VkQueueFamilyProperties _timestampValidBits(MemorySegment src) { return _timestampValidBitsAt(0L, src); }
    public MemorySegment _minImageTransferGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minImageTransferGranularity, index), LAYOUT_minImageTransferGranularity); }
    public MemorySegment _minImageTransferGranularity() { return _minImageTransferGranularityAt(0L); }
    public VkQueueFamilyProperties _minImageTransferGranularityAt(long index, MemorySegment src) { _minImageTransferGranularityAt(index).copyFrom(src); return this; }
    public VkQueueFamilyProperties _minImageTransferGranularity(MemorySegment src) { return _minImageTransferGranularityAt(0L, src); }
}
