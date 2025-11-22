// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineDiscardRectangleStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineDiscardRectangleStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineDiscardRectangleStateCreateFlagsEXT flags;
///     VkDiscardRectangleModeEXT discardRectangleMode;
///     uint32_t discardRectangleCount;
///     const VkRect2D* pDiscardRectangles;
/// }
/// ```
public final class VkPipelineDiscardRectangleStateCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("discardRectangleMode"),
        ValueLayout.JAVA_INT.withName("discardRectangleCount"),
        ValueLayout.ADDRESS.withName("pDiscardRectangles")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_discardRectangleMode = LAYOUT.byteOffset(PathElement.groupElement("discardRectangleMode"));
    public static final long OFFSET_discardRectangleCount = LAYOUT.byteOffset(PathElement.groupElement("discardRectangleCount"));
    public static final long OFFSET_pDiscardRectangles = LAYOUT.byteOffset(PathElement.groupElement("pDiscardRectangles"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_discardRectangleMode = LAYOUT.select(PathElement.groupElement("discardRectangleMode"));
    public static final MemoryLayout LAYOUT_discardRectangleCount = LAYOUT.select(PathElement.groupElement("discardRectangleCount"));
    public static final MemoryLayout LAYOUT_pDiscardRectangles = LAYOUT.select(PathElement.groupElement("pDiscardRectangles"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_discardRectangleMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardRectangleMode"));
    public static final VarHandle VH_discardRectangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardRectangleCount"));
    public static final VarHandle VH_pDiscardRectangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDiscardRectangles"));

    public VkPipelineDiscardRectangleStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineDiscardRectangleStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineDiscardRectangleStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineDiscardRectangleStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineDiscardRectangleStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineDiscardRectangleStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineDiscardRectangleStateCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDiscardRectangles.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT); }
    public static VkPipelineDiscardRectangleStateCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDiscardRectangles.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineDiscardRectangleStateCreateInfoEXT copyFrom(VkPipelineDiscardRectangleStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT reinterpret(long count) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT asSlice(long index) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT at(long index, Consumer<VkPipelineDiscardRectangleStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int discardRectangleModeAt(long index) { return (int) VH_discardRectangleMode.get(this.segment(), 0L, index); }
    public int discardRectangleCountAt(long index) { return (int) VH_discardRectangleCount.get(this.segment(), 0L, index); }
    public MemorySegment pDiscardRectanglesAt(long index) { return (MemorySegment) VH_pDiscardRectangles.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int discardRectangleMode() { return (int) VH_discardRectangleMode.get(this.segment(), 0L, 0L); }
    public int discardRectangleCount() { return (int) VH_discardRectangleCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDiscardRectangles() { return (MemorySegment) VH_pDiscardRectangles.get(this.segment(), 0L, 0L); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleModeAt(long index, int value) { VH_discardRectangleMode.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCountAt(long index, int value) { VH_discardRectangleCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectanglesAt(long index, MemorySegment value) { VH_pDiscardRectangles.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleMode(int value) { VH_discardRectangleMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCount(int value) { VH_discardRectangleCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectangles(MemorySegment value) { VH_pDiscardRectangles.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _discardRectangleModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_discardRectangleMode, index), LAYOUT_discardRectangleMode); }
    public MemorySegment _discardRectangleMode() { return _discardRectangleModeAt(0L); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _discardRectangleModeAt(long index, MemorySegment src) { _discardRectangleModeAt(index).copyFrom(src); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _discardRectangleMode(MemorySegment src) { return _discardRectangleModeAt(0L, src); }
    public MemorySegment _discardRectangleCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_discardRectangleCount, index), LAYOUT_discardRectangleCount); }
    public MemorySegment _discardRectangleCount() { return _discardRectangleCountAt(0L); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _discardRectangleCountAt(long index, MemorySegment src) { _discardRectangleCountAt(index).copyFrom(src); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _discardRectangleCount(MemorySegment src) { return _discardRectangleCountAt(0L, src); }
    public MemorySegment _pDiscardRectanglesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDiscardRectangles, index), LAYOUT_pDiscardRectangles); }
    public MemorySegment _pDiscardRectangles() { return _pDiscardRectanglesAt(0L); }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _pDiscardRectanglesAt(long index, MemorySegment src) { _pDiscardRectanglesAt(index).copyFrom(src); return this; }
    public VkPipelineDiscardRectangleStateCreateInfoEXT _pDiscardRectangles(MemorySegment src) { return _pDiscardRectanglesAt(0L, src); }
}
