// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRasterizationDepthClipStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationDepthClipStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineRasterizationDepthClipStateCreateFlagsEXT flags;
///     VkBool32 depthClipEnable;
/// }
/// ```
public final class VkPipelineRasterizationDepthClipStateCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthClipEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_depthClipEnable = LAYOUT.byteOffset(PathElement.groupElement("depthClipEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_depthClipEnable = LAYOUT.select(PathElement.groupElement("depthClipEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_depthClipEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClipEnable"));

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDepthClipEnable.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT); }
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDepthClipEnable.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT copyFrom(VkPipelineRasterizationDepthClipStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT reinterpret(long count) { return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT asSlice(long index) { return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT at(long index, Consumer<VkPipelineRasterizationDepthClipStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int depthClipEnableAt(long index) { return (int) VH_depthClipEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int depthClipEnable() { return (int) VH_depthClipEnable.get(this.segment(), 0L, 0L); }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT depthClipEnableAt(long index, int value) { VH_depthClipEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT depthClipEnable(int value) { VH_depthClipEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _depthClipEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthClipEnable, index), LAYOUT_depthClipEnable); }
    public MemorySegment _depthClipEnable() { return _depthClipEnableAt(0L); }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT _depthClipEnableAt(long index, MemorySegment src) { _depthClipEnableAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT _depthClipEnable(MemorySegment src) { return _depthClipEnableAt(0L, src); }
}
