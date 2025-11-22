// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLineRasterizationFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLineRasterizationFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rectangularLines;
///     VkBool32 bresenhamLines;
///     VkBool32 smoothLines;
///     VkBool32 stippledRectangularLines;
///     VkBool32 stippledBresenhamLines;
///     VkBool32 stippledSmoothLines;
/// }
/// ```
public final class VkPhysicalDeviceLineRasterizationFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rectangularLines"),
        ValueLayout.JAVA_INT.withName("bresenhamLines"),
        ValueLayout.JAVA_INT.withName("smoothLines"),
        ValueLayout.JAVA_INT.withName("stippledRectangularLines"),
        ValueLayout.JAVA_INT.withName("stippledBresenhamLines"),
        ValueLayout.JAVA_INT.withName("stippledSmoothLines")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rectangularLines = LAYOUT.byteOffset(PathElement.groupElement("rectangularLines"));
    public static final long OFFSET_bresenhamLines = LAYOUT.byteOffset(PathElement.groupElement("bresenhamLines"));
    public static final long OFFSET_smoothLines = LAYOUT.byteOffset(PathElement.groupElement("smoothLines"));
    public static final long OFFSET_stippledRectangularLines = LAYOUT.byteOffset(PathElement.groupElement("stippledRectangularLines"));
    public static final long OFFSET_stippledBresenhamLines = LAYOUT.byteOffset(PathElement.groupElement("stippledBresenhamLines"));
    public static final long OFFSET_stippledSmoothLines = LAYOUT.byteOffset(PathElement.groupElement("stippledSmoothLines"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rectangularLines = LAYOUT.select(PathElement.groupElement("rectangularLines"));
    public static final MemoryLayout LAYOUT_bresenhamLines = LAYOUT.select(PathElement.groupElement("bresenhamLines"));
    public static final MemoryLayout LAYOUT_smoothLines = LAYOUT.select(PathElement.groupElement("smoothLines"));
    public static final MemoryLayout LAYOUT_stippledRectangularLines = LAYOUT.select(PathElement.groupElement("stippledRectangularLines"));
    public static final MemoryLayout LAYOUT_stippledBresenhamLines = LAYOUT.select(PathElement.groupElement("stippledBresenhamLines"));
    public static final MemoryLayout LAYOUT_stippledSmoothLines = LAYOUT.select(PathElement.groupElement("stippledSmoothLines"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangularLines"));
    public static final VarHandle VH_bresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bresenhamLines"));
    public static final VarHandle VH_smoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("smoothLines"));
    public static final VarHandle VH_stippledRectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledRectangularLines"));
    public static final VarHandle VH_stippledBresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledBresenhamLines"));
    public static final VarHandle VH_stippledSmoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledSmoothLines"));

    public VkPhysicalDeviceLineRasterizationFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLineRasterizationFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLineRasterizationFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES); }
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES);
        return s;
    }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR copyFrom(VkPhysicalDeviceLineRasterizationFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceLineRasterizationFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceLineRasterizationFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceLineRasterizationFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR at(long index, Consumer<VkPhysicalDeviceLineRasterizationFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rectangularLinesAt(long index) { return (int) VH_rectangularLines.get(this.segment(), 0L, index); }
    public int bresenhamLinesAt(long index) { return (int) VH_bresenhamLines.get(this.segment(), 0L, index); }
    public int smoothLinesAt(long index) { return (int) VH_smoothLines.get(this.segment(), 0L, index); }
    public int stippledRectangularLinesAt(long index) { return (int) VH_stippledRectangularLines.get(this.segment(), 0L, index); }
    public int stippledBresenhamLinesAt(long index) { return (int) VH_stippledBresenhamLines.get(this.segment(), 0L, index); }
    public int stippledSmoothLinesAt(long index) { return (int) VH_stippledSmoothLines.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rectangularLines() { return (int) VH_rectangularLines.get(this.segment(), 0L, 0L); }
    public int bresenhamLines() { return (int) VH_bresenhamLines.get(this.segment(), 0L, 0L); }
    public int smoothLines() { return (int) VH_smoothLines.get(this.segment(), 0L, 0L); }
    public int stippledRectangularLines() { return (int) VH_stippledRectangularLines.get(this.segment(), 0L, 0L); }
    public int stippledBresenhamLines() { return (int) VH_stippledBresenhamLines.get(this.segment(), 0L, 0L); }
    public int stippledSmoothLines() { return (int) VH_stippledSmoothLines.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR rectangularLinesAt(long index, int value) { VH_rectangularLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR bresenhamLinesAt(long index, int value) { VH_bresenhamLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR smoothLinesAt(long index, int value) { VH_smoothLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledRectangularLinesAt(long index, int value) { VH_stippledRectangularLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledBresenhamLinesAt(long index, int value) { VH_stippledBresenhamLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledSmoothLinesAt(long index, int value) { VH_stippledSmoothLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR rectangularLines(int value) { VH_rectangularLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR bresenhamLines(int value) { VH_bresenhamLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR smoothLines(int value) { VH_smoothLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledRectangularLines(int value) { VH_stippledRectangularLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledBresenhamLines(int value) { VH_stippledBresenhamLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledSmoothLines(int value) { VH_stippledSmoothLines.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rectangularLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rectangularLines, index), LAYOUT_rectangularLines); }
    public MemorySegment _rectangularLines() { return _rectangularLinesAt(0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _rectangularLinesAt(long index, MemorySegment src) { _rectangularLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _rectangularLines(MemorySegment src) { return _rectangularLinesAt(0L, src); }
    public MemorySegment _bresenhamLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bresenhamLines, index), LAYOUT_bresenhamLines); }
    public MemorySegment _bresenhamLines() { return _bresenhamLinesAt(0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _bresenhamLinesAt(long index, MemorySegment src) { _bresenhamLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _bresenhamLines(MemorySegment src) { return _bresenhamLinesAt(0L, src); }
    public MemorySegment _smoothLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_smoothLines, index), LAYOUT_smoothLines); }
    public MemorySegment _smoothLines() { return _smoothLinesAt(0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _smoothLinesAt(long index, MemorySegment src) { _smoothLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _smoothLines(MemorySegment src) { return _smoothLinesAt(0L, src); }
    public MemorySegment _stippledRectangularLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stippledRectangularLines, index), LAYOUT_stippledRectangularLines); }
    public MemorySegment _stippledRectangularLines() { return _stippledRectangularLinesAt(0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _stippledRectangularLinesAt(long index, MemorySegment src) { _stippledRectangularLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _stippledRectangularLines(MemorySegment src) { return _stippledRectangularLinesAt(0L, src); }
    public MemorySegment _stippledBresenhamLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stippledBresenhamLines, index), LAYOUT_stippledBresenhamLines); }
    public MemorySegment _stippledBresenhamLines() { return _stippledBresenhamLinesAt(0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _stippledBresenhamLinesAt(long index, MemorySegment src) { _stippledBresenhamLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _stippledBresenhamLines(MemorySegment src) { return _stippledBresenhamLinesAt(0L, src); }
    public MemorySegment _stippledSmoothLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stippledSmoothLines, index), LAYOUT_stippledSmoothLines); }
    public MemorySegment _stippledSmoothLines() { return _stippledSmoothLinesAt(0L); }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _stippledSmoothLinesAt(long index, MemorySegment src) { _stippledSmoothLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationFeaturesKHR _stippledSmoothLines(MemorySegment src) { return _stippledSmoothLinesAt(0L, src); }
}
