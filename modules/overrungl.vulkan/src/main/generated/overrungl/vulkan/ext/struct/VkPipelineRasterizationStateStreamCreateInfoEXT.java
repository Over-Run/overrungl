// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRasterizationStateStreamCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationStateStreamCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineRasterizationStateStreamCreateFlagsEXT flags;
///     uint32_t rasterizationStream;
/// }
/// ```
public final class VkPipelineRasterizationStateStreamCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rasterizationStream")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_rasterizationStream = LAYOUT.byteOffset(PathElement.groupElement("rasterizationStream"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_rasterizationStream = LAYOUT.select(PathElement.groupElement("rasterizationStream"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_rasterizationStream = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationStream"));

    public VkPipelineRasterizationStateStreamCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRasterizationStateStreamCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateStreamCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRasterizationStateStreamCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateStreamCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRasterizationStateStreamCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateStreamCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRasterizationStateStreamCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationStateStreamCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRasterizationStateStreamCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationStateStreamCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRasterizationStateStreamCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTTransformFeedback.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT); }
    public static VkPipelineRasterizationStateStreamCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTTransformFeedback.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineRasterizationStateStreamCreateInfoEXT copyFrom(VkPipelineRasterizationStateStreamCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT reinterpret(long count) { return new VkPipelineRasterizationStateStreamCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRasterizationStateStreamCreateInfoEXT asSlice(long index) { return new VkPipelineRasterizationStateStreamCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRasterizationStateStreamCreateInfoEXT asSlice(long index, long count) { return new VkPipelineRasterizationStateStreamCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRasterizationStateStreamCreateInfoEXT at(long index, Consumer<VkPipelineRasterizationStateStreamCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int rasterizationStreamAt(long index) { return (int) VH_rasterizationStream.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int rasterizationStream() { return (int) VH_rasterizationStream.get(this.segment(), 0L, 0L); }
    public VkPipelineRasterizationStateStreamCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT rasterizationStreamAt(long index, int value) { VH_rasterizationStream.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT rasterizationStream(int value) { VH_rasterizationStream.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRasterizationStateStreamCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRasterizationStateStreamCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineRasterizationStateStreamCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _rasterizationStreamAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizationStream, index), LAYOUT_rasterizationStream); }
    public MemorySegment _rasterizationStream() { return _rasterizationStreamAt(0L); }
    public VkPipelineRasterizationStateStreamCreateInfoEXT _rasterizationStreamAt(long index, MemorySegment src) { _rasterizationStreamAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateStreamCreateInfoEXT _rasterizationStream(MemorySegment src) { return _rasterizationStreamAt(0L, src); }
}
