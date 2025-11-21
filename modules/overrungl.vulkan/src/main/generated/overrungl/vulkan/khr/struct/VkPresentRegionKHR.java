// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentRegionKHR`.
/// ## Layout
/// ```
/// struct VkPresentRegionKHR {
///     uint32_t rectangleCount;
///     const VkRectLayerKHR* pRectangles;
/// }
/// ```
public final class VkPresentRegionKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("rectangleCount"),
        ValueLayout.ADDRESS.withName("pRectangles")
    );
    public static final long OFFSET_rectangleCount = LAYOUT.byteOffset(PathElement.groupElement("rectangleCount"));
    public static final long OFFSET_pRectangles = LAYOUT.byteOffset(PathElement.groupElement("pRectangles"));
    public static final MemoryLayout LAYOUT_rectangleCount = LAYOUT.select(PathElement.groupElement("rectangleCount"));
    public static final MemoryLayout LAYOUT_pRectangles = LAYOUT.select(PathElement.groupElement("pRectangles"));
    public static final VarHandle VH_rectangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangleCount"));
    public static final VarHandle VH_pRectangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRectangles"));

    public VkPresentRegionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentRegionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentRegionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentRegionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentRegionKHR alloc(SegmentAllocator allocator) { return new VkPresentRegionKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPresentRegionKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentRegionKHR(allocator.allocate(LAYOUT, count), count); }
    public VkPresentRegionKHR copyFrom(VkPresentRegionKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentRegionKHR reinterpret(long count) { return new VkPresentRegionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentRegionKHR asSlice(long index) { return new VkPresentRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentRegionKHR asSlice(long index, long count) { return new VkPresentRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentRegionKHR at(long index, Consumer<VkPresentRegionKHR> func) { func.accept(asSlice(index)); return this; }
    public int rectangleCountAt(long index) { return (int) VH_rectangleCount.get(this.segment(), 0L, index); }
    public MemorySegment pRectanglesAt(long index) { return (MemorySegment) VH_pRectangles.get(this.segment(), 0L, index); }
    public int rectangleCount() { return (int) VH_rectangleCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRectangles() { return (MemorySegment) VH_pRectangles.get(this.segment(), 0L, 0L); }
    public VkPresentRegionKHR rectangleCountAt(long index, int value) { VH_rectangleCount.set(this.segment(), 0L, index, value); return this; }
    public VkPresentRegionKHR pRectanglesAt(long index, MemorySegment value) { VH_pRectangles.set(this.segment(), 0L, index, value); return this; }
    public VkPresentRegionKHR rectangleCount(int value) { VH_rectangleCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentRegionKHR pRectangles(MemorySegment value) { VH_pRectangles.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _rectangleCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rectangleCount, index), LAYOUT_rectangleCount); }
    public MemorySegment _rectangleCount() { return _rectangleCountAt(0L); }
    public VkPresentRegionKHR _rectangleCountAt(long index, MemorySegment src) { _rectangleCountAt(index).copyFrom(src); return this; }
    public VkPresentRegionKHR _rectangleCount(MemorySegment src) { return _rectangleCountAt(0L, src); }
    public MemorySegment _pRectanglesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRectangles, index), LAYOUT_pRectangles); }
    public MemorySegment _pRectangles() { return _pRectanglesAt(0L); }
    public VkPresentRegionKHR _pRectanglesAt(long index, MemorySegment src) { _pRectanglesAt(index).copyFrom(src); return this; }
    public VkPresentRegionKHR _pRectangles(MemorySegment src) { return _pRectanglesAt(0L, src); }
}
