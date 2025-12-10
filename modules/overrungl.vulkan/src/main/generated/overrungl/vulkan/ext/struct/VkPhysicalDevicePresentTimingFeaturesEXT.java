// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePresentTimingFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePresentTimingFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentTiming;
///     VkBool32 presentAtAbsoluteTime;
///     VkBool32 presentAtRelativeTime;
/// }
/// ```
public final class VkPhysicalDevicePresentTimingFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentTiming"),
        ValueLayout.JAVA_INT.withName("presentAtAbsoluteTime"),
        ValueLayout.JAVA_INT.withName("presentAtRelativeTime")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentTiming = LAYOUT.byteOffset(PathElement.groupElement("presentTiming"));
    public static final long OFFSET_presentAtAbsoluteTime = LAYOUT.byteOffset(PathElement.groupElement("presentAtAbsoluteTime"));
    public static final long OFFSET_presentAtRelativeTime = LAYOUT.byteOffset(PathElement.groupElement("presentAtRelativeTime"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentTiming = LAYOUT.select(PathElement.groupElement("presentTiming"));
    public static final MemoryLayout LAYOUT_presentAtAbsoluteTime = LAYOUT.select(PathElement.groupElement("presentAtAbsoluteTime"));
    public static final MemoryLayout LAYOUT_presentAtRelativeTime = LAYOUT.select(PathElement.groupElement("presentAtRelativeTime"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentTiming = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentTiming"));
    public static final VarHandle VH_presentAtAbsoluteTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentAtAbsoluteTime"));
    public static final VarHandle VH_presentAtRelativeTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentAtRelativeTime"));

    public VkPhysicalDevicePresentTimingFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePresentTimingFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentTimingFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePresentTimingFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentTimingFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePresentTimingFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentTimingFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePresentTimingFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentTimingFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePresentTimingFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentTimingFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePresentTimingFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT); }
    public static VkPhysicalDevicePresentTimingFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDevicePresentTimingFeaturesEXT copyFrom(VkPhysicalDevicePresentTimingFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePresentTimingFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePresentTimingFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePresentTimingFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePresentTimingFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePresentTimingFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePresentTimingFeaturesEXT at(long index, Consumer<VkPhysicalDevicePresentTimingFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentTimingAt(long index) { return (int) VH_presentTiming.get(this.segment(), 0L, index); }
    public int presentAtAbsoluteTimeAt(long index) { return (int) VH_presentAtAbsoluteTime.get(this.segment(), 0L, index); }
    public int presentAtRelativeTimeAt(long index) { return (int) VH_presentAtRelativeTime.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentTiming() { return (int) VH_presentTiming.get(this.segment(), 0L, 0L); }
    public int presentAtAbsoluteTime() { return (int) VH_presentAtAbsoluteTime.get(this.segment(), 0L, 0L); }
    public int presentAtRelativeTime() { return (int) VH_presentAtRelativeTime.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePresentTimingFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT presentTimingAt(long index, int value) { VH_presentTiming.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT presentAtAbsoluteTimeAt(long index, int value) { VH_presentAtAbsoluteTime.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT presentAtRelativeTimeAt(long index, int value) { VH_presentAtRelativeTime.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT presentTiming(int value) { VH_presentTiming.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT presentAtAbsoluteTime(int value) { VH_presentAtAbsoluteTime.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT presentAtRelativeTime(int value) { VH_presentAtRelativeTime.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePresentTimingFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePresentTimingFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentTimingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentTiming, index), LAYOUT_presentTiming); }
    public MemorySegment _presentTiming() { return _presentTimingAt(0L); }
    public VkPhysicalDevicePresentTimingFeaturesEXT _presentTimingAt(long index, MemorySegment src) { _presentTimingAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT _presentTiming(MemorySegment src) { return _presentTimingAt(0L, src); }
    public MemorySegment _presentAtAbsoluteTimeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentAtAbsoluteTime, index), LAYOUT_presentAtAbsoluteTime); }
    public MemorySegment _presentAtAbsoluteTime() { return _presentAtAbsoluteTimeAt(0L); }
    public VkPhysicalDevicePresentTimingFeaturesEXT _presentAtAbsoluteTimeAt(long index, MemorySegment src) { _presentAtAbsoluteTimeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT _presentAtAbsoluteTime(MemorySegment src) { return _presentAtAbsoluteTimeAt(0L, src); }
    public MemorySegment _presentAtRelativeTimeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentAtRelativeTime, index), LAYOUT_presentAtRelativeTime); }
    public MemorySegment _presentAtRelativeTime() { return _presentAtRelativeTimeAt(0L); }
    public VkPhysicalDevicePresentTimingFeaturesEXT _presentAtRelativeTimeAt(long index, MemorySegment src) { _presentAtRelativeTimeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentTimingFeaturesEXT _presentAtRelativeTime(MemorySegment src) { return _presentAtRelativeTimeAt(0L, src); }
}
