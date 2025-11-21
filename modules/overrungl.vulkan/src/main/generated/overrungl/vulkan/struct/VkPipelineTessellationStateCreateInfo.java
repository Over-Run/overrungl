// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineTessellationStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineTessellationStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineTessellationStateCreateFlags flags;
///     uint32_t patchControlPoints;
/// }
/// ```
public final class VkPipelineTessellationStateCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("patchControlPoints")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_patchControlPoints = LAYOUT.byteOffset(PathElement.groupElement("patchControlPoints"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_patchControlPoints = LAYOUT.select(PathElement.groupElement("patchControlPoints"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_patchControlPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("patchControlPoints"));

    public VkPipelineTessellationStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineTessellationStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineTessellationStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineTessellationStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineTessellationStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineTessellationStateCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineTessellationStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineTessellationStateCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineTessellationStateCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO); }
    public static VkPipelineTessellationStateCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineTessellationStateCreateInfo copyFrom(VkPipelineTessellationStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineTessellationStateCreateInfo reinterpret(long count) { return new VkPipelineTessellationStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineTessellationStateCreateInfo asSlice(long index) { return new VkPipelineTessellationStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineTessellationStateCreateInfo asSlice(long index, long count) { return new VkPipelineTessellationStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineTessellationStateCreateInfo at(long index, Consumer<VkPipelineTessellationStateCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int patchControlPointsAt(long index) { return (int) VH_patchControlPoints.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int patchControlPoints() { return (int) VH_patchControlPoints.get(this.segment(), 0L, 0L); }
    public VkPipelineTessellationStateCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineTessellationStateCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineTessellationStateCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineTessellationStateCreateInfo patchControlPointsAt(long index, int value) { VH_patchControlPoints.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineTessellationStateCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineTessellationStateCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineTessellationStateCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineTessellationStateCreateInfo patchControlPoints(int value) { VH_patchControlPoints.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineTessellationStateCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineTessellationStateCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineTessellationStateCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineTessellationStateCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineTessellationStateCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineTessellationStateCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _patchControlPointsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_patchControlPoints, index), LAYOUT_patchControlPoints); }
    public MemorySegment _patchControlPoints() { return _patchControlPointsAt(0L); }
    public VkPipelineTessellationStateCreateInfo _patchControlPointsAt(long index, MemorySegment src) { _patchControlPointsAt(index).copyFrom(src); return this; }
    public VkPipelineTessellationStateCreateInfo _patchControlPoints(MemorySegment src) { return _patchControlPointsAt(0L, src); }
}
