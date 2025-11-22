// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayModeCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkDisplayModeCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDisplayModeCreateFlagsKHR flags;
///     VkDisplayModeParametersKHR parameters;
/// }
/// ```
public final class VkDisplayModeCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_parameters = LAYOUT.byteOffset(PathElement.groupElement("parameters"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_parameters = LAYOUT.select(PathElement.groupElement("parameters"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_parameters$visibleRegion$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameters"), PathElement.groupElement("visibleRegion"), PathElement.groupElement("width"));
    public static final VarHandle VH_parameters$visibleRegion$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameters"), PathElement.groupElement("visibleRegion"), PathElement.groupElement("height"));
    public static final VarHandle VH_parameters$refreshRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameters"), PathElement.groupElement("refreshRate"));

    public VkDisplayModeCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayModeCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayModeCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayModeCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayModeCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkDisplayModeCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayModeCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModeCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayModeCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDisplay.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR); }
    public static VkDisplayModeCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDisplay.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR);
        return s;
    }
    public VkDisplayModeCreateInfoKHR copyFrom(VkDisplayModeCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayModeCreateInfoKHR reinterpret(long count) { return new VkDisplayModeCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayModeCreateInfoKHR asSlice(long index) { return new VkDisplayModeCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayModeCreateInfoKHR asSlice(long index, long count) { return new VkDisplayModeCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayModeCreateInfoKHR at(long index, Consumer<VkDisplayModeCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int parameters$visibleRegion$widthAt(long index) { return (int) VH_parameters$visibleRegion$width.get(this.segment(), 0L, index); }
    public int parameters$visibleRegion$heightAt(long index) { return (int) VH_parameters$visibleRegion$height.get(this.segment(), 0L, index); }
    public int parameters$refreshRateAt(long index) { return (int) VH_parameters$refreshRate.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int parameters$visibleRegion$width() { return (int) VH_parameters$visibleRegion$width.get(this.segment(), 0L, 0L); }
    public int parameters$visibleRegion$height() { return (int) VH_parameters$visibleRegion$height.get(this.segment(), 0L, 0L); }
    public int parameters$refreshRate() { return (int) VH_parameters$refreshRate.get(this.segment(), 0L, 0L); }
    public VkDisplayModeCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeCreateInfoKHR parameters$visibleRegion$widthAt(long index, int value) { VH_parameters$visibleRegion$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeCreateInfoKHR parameters$visibleRegion$heightAt(long index, int value) { VH_parameters$visibleRegion$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeCreateInfoKHR parameters$refreshRateAt(long index, int value) { VH_parameters$refreshRate.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayModeCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeCreateInfoKHR parameters$visibleRegion$width(int value) { VH_parameters$visibleRegion$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeCreateInfoKHR parameters$visibleRegion$height(int value) { VH_parameters$visibleRegion$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayModeCreateInfoKHR parameters$refreshRate(int value) { VH_parameters$refreshRate.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayModeCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayModeCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayModeCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayModeCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDisplayModeCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDisplayModeCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _parametersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_parameters, index), LAYOUT_parameters); }
    public MemorySegment _parameters() { return _parametersAt(0L); }
    public VkDisplayModeCreateInfoKHR _parametersAt(long index, MemorySegment src) { _parametersAt(index).copyFrom(src); return this; }
    public VkDisplayModeCreateInfoKHR _parameters(MemorySegment src) { return _parametersAt(0L, src); }
}
