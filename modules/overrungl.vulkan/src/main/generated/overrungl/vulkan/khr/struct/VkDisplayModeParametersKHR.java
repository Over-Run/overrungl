// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayModeParametersKHR`.
/// ## Layout
/// ```
/// struct VkDisplayModeParametersKHR {
///     VkExtent2D visibleRegion;
///     uint32_t refreshRate;
/// }
/// ```
public final class VkDisplayModeParametersKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("visibleRegion"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    public static final long OFFSET_visibleRegion = LAYOUT.byteOffset(PathElement.groupElement("visibleRegion"));
    public static final long OFFSET_refreshRate = LAYOUT.byteOffset(PathElement.groupElement("refreshRate"));
    public static final MemoryLayout LAYOUT_visibleRegion = LAYOUT.select(PathElement.groupElement("visibleRegion"));
    public static final MemoryLayout LAYOUT_refreshRate = LAYOUT.select(PathElement.groupElement("refreshRate"));
    public static final VarHandle VH_visibleRegion$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("visibleRegion"), PathElement.groupElement("width"));
    public static final VarHandle VH_visibleRegion$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("visibleRegion"), PathElement.groupElement("height"));
    public static final VarHandle VH_refreshRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshRate"));

    public VkDisplayModeParametersKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayModeParametersKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayModeParametersKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayModeParametersKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayModeParametersKHR alloc(SegmentAllocator allocator) { return new VkDisplayModeParametersKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayModeParametersKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModeParametersKHR(allocator.allocate(LAYOUT, count), count); }
    public VkDisplayModeParametersKHR copyFrom(VkDisplayModeParametersKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayModeParametersKHR reinterpret(long count) { return new VkDisplayModeParametersKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayModeParametersKHR asSlice(long index) { return new VkDisplayModeParametersKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayModeParametersKHR asSlice(long index, long count) { return new VkDisplayModeParametersKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayModeParametersKHR at(long index, Consumer<VkDisplayModeParametersKHR> func) { func.accept(asSlice(index)); return this; }
    public int visibleRegion$widthAt(long index) { return (int) VH_visibleRegion$width.get(this.segment(), 0L, index); }
    public int visibleRegion$heightAt(long index) { return (int) VH_visibleRegion$height.get(this.segment(), 0L, index); }
    public int refreshRateAt(long index) { return (int) VH_refreshRate.get(this.segment(), 0L, index); }
    public int visibleRegion$width() { return (int) VH_visibleRegion$width.get(this.segment(), 0L, 0L); }
    public int visibleRegion$height() { return (int) VH_visibleRegion$height.get(this.segment(), 0L, 0L); }
    public int refreshRate() { return (int) VH_refreshRate.get(this.segment(), 0L, 0L); }
    public VkDisplayModeParametersKHR visibleRegion$widthAt(long index, int value) { VH_visibleRegion$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeParametersKHR visibleRegion$heightAt(long index, int value) { VH_visibleRegion$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeParametersKHR refreshRateAt(long index, int value) { VH_refreshRate.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeParametersKHR visibleRegion$width(int value) { VH_visibleRegion$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeParametersKHR visibleRegion$height(int value) { VH_visibleRegion$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeParametersKHR refreshRate(int value) { VH_refreshRate.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _visibleRegionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_visibleRegion, index), LAYOUT_visibleRegion); }
    public MemorySegment _visibleRegion() { return _visibleRegionAt(0L); }
    public VkDisplayModeParametersKHR _visibleRegionAt(long index, MemorySegment src) { _visibleRegionAt(index).copyFrom(src); return this; }
    public VkDisplayModeParametersKHR _visibleRegion(MemorySegment src) { return _visibleRegionAt(0L, src); }
    public MemorySegment _refreshRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_refreshRate, index), LAYOUT_refreshRate); }
    public MemorySegment _refreshRate() { return _refreshRateAt(0L); }
    public VkDisplayModeParametersKHR _refreshRateAt(long index, MemorySegment src) { _refreshRateAt(index).copyFrom(src); return this; }
    public VkDisplayModeParametersKHR _refreshRate(MemorySegment src) { return _refreshRateAt(0L, src); }
}
