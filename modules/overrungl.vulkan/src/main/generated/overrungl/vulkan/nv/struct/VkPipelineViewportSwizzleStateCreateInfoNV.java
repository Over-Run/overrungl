// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportSwizzleStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineViewportSwizzleStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineViewportSwizzleStateCreateFlagsNV flags;
///     uint32_t viewportCount;
///     const VkViewportSwizzleNV* pViewportSwizzles;
/// }
/// ```
public final class VkPipelineViewportSwizzleStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewportSwizzles")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_viewportCount = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
    public static final long OFFSET_pViewportSwizzles = LAYOUT.byteOffset(PathElement.groupElement("pViewportSwizzles"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_viewportCount = LAYOUT.select(PathElement.groupElement("viewportCount"));
    public static final MemoryLayout LAYOUT_pViewportSwizzles = LAYOUT.select(PathElement.groupElement("pViewportSwizzles"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    public static final VarHandle VH_pViewportSwizzles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportSwizzles"));

    public VkPipelineViewportSwizzleStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineViewportSwizzleStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineViewportSwizzleStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineViewportSwizzleStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineViewportSwizzleStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportSwizzleStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineViewportSwizzleStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportSwizzleStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineViewportSwizzleStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVViewportSwizzle.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV); }
    public static VkPipelineViewportSwizzleStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVViewportSwizzle.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineViewportSwizzleStateCreateInfoNV copyFrom(VkPipelineViewportSwizzleStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportSwizzleStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineViewportSwizzleStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportSwizzleStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineViewportSwizzleStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportSwizzleStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineViewportSwizzleStateCreateInfoNV at(long index, Consumer<VkPipelineViewportSwizzleStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int viewportCountAt(long index) { return (int) VH_viewportCount.get(this.segment(), 0L, index); }
    public MemorySegment pViewportSwizzlesAt(long index) { return (MemorySegment) VH_pViewportSwizzles.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int viewportCount() { return (int) VH_viewportCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewportSwizzles() { return (MemorySegment) VH_pViewportSwizzles.get(this.segment(), 0L, 0L); }
    public VkPipelineViewportSwizzleStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV viewportCountAt(long index, int value) { VH_viewportCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzlesAt(long index, MemorySegment value) { VH_pViewportSwizzles.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV viewportCount(int value) { VH_viewportCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzles(MemorySegment value) { VH_pViewportSwizzles.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineViewportSwizzleStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineViewportSwizzleStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineViewportSwizzleStateCreateInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _viewportCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportCount, index), LAYOUT_viewportCount); }
    public MemorySegment _viewportCount() { return _viewportCountAt(0L); }
    public VkPipelineViewportSwizzleStateCreateInfoNV _viewportCountAt(long index, MemorySegment src) { _viewportCountAt(index).copyFrom(src); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV _viewportCount(MemorySegment src) { return _viewportCountAt(0L, src); }
    public MemorySegment _pViewportSwizzlesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewportSwizzles, index), LAYOUT_pViewportSwizzles); }
    public MemorySegment _pViewportSwizzles() { return _pViewportSwizzlesAt(0L); }
    public VkPipelineViewportSwizzleStateCreateInfoNV _pViewportSwizzlesAt(long index, MemorySegment src) { _pViewportSwizzlesAt(index).copyFrom(src); return this; }
    public VkPipelineViewportSwizzleStateCreateInfoNV _pViewportSwizzles(MemorySegment src) { return _pViewportSwizzlesAt(0L, src); }
}
