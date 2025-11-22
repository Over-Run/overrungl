// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayModeProperties2KHR`.
/// ## Layout
/// ```
/// struct VkDisplayModeProperties2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkDisplayModePropertiesKHR displayModeProperties;
/// }
/// ```
public final class VkDisplayModeProperties2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkDisplayModePropertiesKHR.LAYOUT.withName("displayModeProperties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_displayModeProperties = LAYOUT.byteOffset(PathElement.groupElement("displayModeProperties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_displayModeProperties = LAYOUT.select(PathElement.groupElement("displayModeProperties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_displayModeProperties$displayMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayModeProperties"), PathElement.groupElement("displayMode"));
    public static final VarHandle VH_displayModeProperties$parameters$visibleRegion$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayModeProperties"), PathElement.groupElement("parameters"), PathElement.groupElement("visibleRegion"), PathElement.groupElement("width"));
    public static final VarHandle VH_displayModeProperties$parameters$visibleRegion$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayModeProperties"), PathElement.groupElement("parameters"), PathElement.groupElement("visibleRegion"), PathElement.groupElement("height"));
    public static final VarHandle VH_displayModeProperties$parameters$refreshRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayModeProperties"), PathElement.groupElement("parameters"), PathElement.groupElement("refreshRate"));

    public VkDisplayModeProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayModeProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeProperties2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayModeProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayModeProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayModeProperties2KHR alloc(SegmentAllocator allocator) { return new VkDisplayModeProperties2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayModeProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModeProperties2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayModeProperties2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR); }
    public static VkDisplayModeProperties2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR);
        return s;
    }
    public VkDisplayModeProperties2KHR copyFrom(VkDisplayModeProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayModeProperties2KHR reinterpret(long count) { return new VkDisplayModeProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayModeProperties2KHR asSlice(long index) { return new VkDisplayModeProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayModeProperties2KHR asSlice(long index, long count) { return new VkDisplayModeProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayModeProperties2KHR at(long index, Consumer<VkDisplayModeProperties2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long displayModeProperties$displayModeAt(long index) { return (long) VH_displayModeProperties$displayMode.get(this.segment(), 0L, index); }
    public int displayModeProperties$parameters$visibleRegion$widthAt(long index) { return (int) VH_displayModeProperties$parameters$visibleRegion$width.get(this.segment(), 0L, index); }
    public int displayModeProperties$parameters$visibleRegion$heightAt(long index) { return (int) VH_displayModeProperties$parameters$visibleRegion$height.get(this.segment(), 0L, index); }
    public int displayModeProperties$parameters$refreshRateAt(long index) { return (int) VH_displayModeProperties$parameters$refreshRate.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long displayModeProperties$displayMode() { return (long) VH_displayModeProperties$displayMode.get(this.segment(), 0L, 0L); }
    public int displayModeProperties$parameters$visibleRegion$width() { return (int) VH_displayModeProperties$parameters$visibleRegion$width.get(this.segment(), 0L, 0L); }
    public int displayModeProperties$parameters$visibleRegion$height() { return (int) VH_displayModeProperties$parameters$visibleRegion$height.get(this.segment(), 0L, 0L); }
    public int displayModeProperties$parameters$refreshRate() { return (int) VH_displayModeProperties$parameters$refreshRate.get(this.segment(), 0L, 0L); }
    public VkDisplayModeProperties2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeProperties2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeProperties2KHR displayModeProperties$displayModeAt(long index, long value) { VH_displayModeProperties$displayMode.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeProperties2KHR displayModeProperties$parameters$visibleRegion$widthAt(long index, int value) { VH_displayModeProperties$parameters$visibleRegion$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeProperties2KHR displayModeProperties$parameters$visibleRegion$heightAt(long index, int value) { VH_displayModeProperties$parameters$visibleRegion$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeProperties2KHR displayModeProperties$parameters$refreshRateAt(long index, int value) { VH_displayModeProperties$parameters$refreshRate.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeProperties2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeProperties2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeProperties2KHR displayModeProperties$displayMode(long value) { VH_displayModeProperties$displayMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeProperties2KHR displayModeProperties$parameters$visibleRegion$width(int value) { VH_displayModeProperties$parameters$visibleRegion$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeProperties2KHR displayModeProperties$parameters$visibleRegion$height(int value) { VH_displayModeProperties$parameters$visibleRegion$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeProperties2KHR displayModeProperties$parameters$refreshRate(int value) { VH_displayModeProperties$parameters$refreshRate.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayModeProperties2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayModeProperties2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayModeProperties2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayModeProperties2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _displayModePropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayModeProperties, index), LAYOUT_displayModeProperties); }
    public MemorySegment _displayModeProperties() { return _displayModePropertiesAt(0L); }
    public VkDisplayModeProperties2KHR _displayModePropertiesAt(long index, MemorySegment src) { _displayModePropertiesAt(index).copyFrom(src); return this; }
    public VkDisplayModeProperties2KHR _displayModeProperties(MemorySegment src) { return _displayModePropertiesAt(0L, src); }
}
