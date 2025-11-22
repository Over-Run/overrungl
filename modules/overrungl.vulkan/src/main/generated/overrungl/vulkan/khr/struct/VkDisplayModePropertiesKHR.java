// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayModePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkDisplayModePropertiesKHR {
///     VkDisplayModeKHR displayMode;
///     VkDisplayModeParametersKHR parameters;
/// }
/// ```
public final class VkDisplayModePropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("displayMode"),
        overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );
    public static final long OFFSET_displayMode = LAYOUT.byteOffset(PathElement.groupElement("displayMode"));
    public static final long OFFSET_parameters = LAYOUT.byteOffset(PathElement.groupElement("parameters"));
    public static final MemoryLayout LAYOUT_displayMode = LAYOUT.select(PathElement.groupElement("displayMode"));
    public static final MemoryLayout LAYOUT_parameters = LAYOUT.select(PathElement.groupElement("parameters"));
    public static final VarHandle VH_displayMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayMode"));
    public static final VarHandle VH_parameters$visibleRegion$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameters"), PathElement.groupElement("visibleRegion"), PathElement.groupElement("width"));
    public static final VarHandle VH_parameters$visibleRegion$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameters"), PathElement.groupElement("visibleRegion"), PathElement.groupElement("height"));
    public static final VarHandle VH_parameters$refreshRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameters"), PathElement.groupElement("refreshRate"));

    public VkDisplayModePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayModePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayModePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayModePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayModePropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayModePropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayModePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModePropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public VkDisplayModePropertiesKHR copyFrom(VkDisplayModePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayModePropertiesKHR reinterpret(long count) { return new VkDisplayModePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayModePropertiesKHR asSlice(long index) { return new VkDisplayModePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayModePropertiesKHR asSlice(long index, long count) { return new VkDisplayModePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayModePropertiesKHR at(long index, Consumer<VkDisplayModePropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public long displayModeAt(long index) { return (long) VH_displayMode.get(this.segment(), 0L, index); }
    public int parameters$visibleRegion$widthAt(long index) { return (int) VH_parameters$visibleRegion$width.get(this.segment(), 0L, index); }
    public int parameters$visibleRegion$heightAt(long index) { return (int) VH_parameters$visibleRegion$height.get(this.segment(), 0L, index); }
    public int parameters$refreshRateAt(long index) { return (int) VH_parameters$refreshRate.get(this.segment(), 0L, index); }
    public long displayMode() { return (long) VH_displayMode.get(this.segment(), 0L, 0L); }
    public int parameters$visibleRegion$width() { return (int) VH_parameters$visibleRegion$width.get(this.segment(), 0L, 0L); }
    public int parameters$visibleRegion$height() { return (int) VH_parameters$visibleRegion$height.get(this.segment(), 0L, 0L); }
    public int parameters$refreshRate() { return (int) VH_parameters$refreshRate.get(this.segment(), 0L, 0L); }
    public VkDisplayModePropertiesKHR displayModeAt(long index, long value) { VH_displayMode.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModePropertiesKHR parameters$visibleRegion$widthAt(long index, int value) { VH_parameters$visibleRegion$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModePropertiesKHR parameters$visibleRegion$heightAt(long index, int value) { VH_parameters$visibleRegion$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModePropertiesKHR parameters$refreshRateAt(long index, int value) { VH_parameters$refreshRate.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModePropertiesKHR displayMode(long value) { VH_displayMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModePropertiesKHR parameters$visibleRegion$width(int value) { VH_parameters$visibleRegion$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModePropertiesKHR parameters$visibleRegion$height(int value) { VH_parameters$visibleRegion$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModePropertiesKHR parameters$refreshRate(int value) { VH_parameters$refreshRate.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _displayModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayMode, index), LAYOUT_displayMode); }
    public MemorySegment _displayMode() { return _displayModeAt(0L); }
    public VkDisplayModePropertiesKHR _displayModeAt(long index, MemorySegment src) { _displayModeAt(index).copyFrom(src); return this; }
    public VkDisplayModePropertiesKHR _displayMode(MemorySegment src) { return _displayModeAt(0L, src); }
    public MemorySegment _parametersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_parameters, index), LAYOUT_parameters); }
    public MemorySegment _parameters() { return _parametersAt(0L); }
    public VkDisplayModePropertiesKHR _parametersAt(long index, MemorySegment src) { _parametersAt(index).copyFrom(src); return this; }
    public VkDisplayModePropertiesKHR _parameters(MemorySegment src) { return _parametersAt(0L, src); }
}
