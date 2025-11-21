// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAntiLagPresentationInfoAMD`.
/// ## Layout
/// ```
/// struct VkAntiLagPresentationInfoAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkAntiLagStageAMD stage;
///     uint64_t frameIndex;
/// }
/// ```
public final class VkAntiLagPresentationInfoAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("frameIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    public static final long OFFSET_frameIndex = LAYOUT.byteOffset(PathElement.groupElement("frameIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    public static final MemoryLayout LAYOUT_frameIndex = LAYOUT.select(PathElement.groupElement("frameIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    public static final VarHandle VH_frameIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameIndex"));

    public VkAntiLagPresentationInfoAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAntiLagPresentationInfoAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagPresentationInfoAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkAntiLagPresentationInfoAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagPresentationInfoAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAntiLagPresentationInfoAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagPresentationInfoAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAntiLagPresentationInfoAMD alloc(SegmentAllocator allocator) { return new VkAntiLagPresentationInfoAMD(allocator.allocate(LAYOUT), 1); }
    public static VkAntiLagPresentationInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkAntiLagPresentationInfoAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkAntiLagPresentationInfoAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD); }
    public static VkAntiLagPresentationInfoAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD);
        return s;
    }
    public VkAntiLagPresentationInfoAMD copyFrom(VkAntiLagPresentationInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAntiLagPresentationInfoAMD reinterpret(long count) { return new VkAntiLagPresentationInfoAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAntiLagPresentationInfoAMD asSlice(long index) { return new VkAntiLagPresentationInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAntiLagPresentationInfoAMD asSlice(long index, long count) { return new VkAntiLagPresentationInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAntiLagPresentationInfoAMD at(long index, Consumer<VkAntiLagPresentationInfoAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stageAt(long index) { return (int) VH_stage.get(this.segment(), 0L, index); }
    public long frameIndexAt(long index) { return (long) VH_frameIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stage() { return (int) VH_stage.get(this.segment(), 0L, 0L); }
    public long frameIndex() { return (long) VH_frameIndex.get(this.segment(), 0L, 0L); }
    public VkAntiLagPresentationInfoAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagPresentationInfoAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagPresentationInfoAMD stageAt(long index, int value) { VH_stage.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagPresentationInfoAMD frameIndexAt(long index, long value) { VH_frameIndex.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagPresentationInfoAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAntiLagPresentationInfoAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAntiLagPresentationInfoAMD stage(int value) { VH_stage.set(this.segment(), 0L, 0L, value); return this; }
    public VkAntiLagPresentationInfoAMD frameIndex(long value) { VH_frameIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAntiLagPresentationInfoAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAntiLagPresentationInfoAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAntiLagPresentationInfoAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAntiLagPresentationInfoAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage); }
    public MemorySegment _stage() { return _stageAt(0L); }
    public VkAntiLagPresentationInfoAMD _stageAt(long index, MemorySegment src) { _stageAt(index).copyFrom(src); return this; }
    public VkAntiLagPresentationInfoAMD _stage(MemorySegment src) { return _stageAt(0L, src); }
    public MemorySegment _frameIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frameIndex, index), LAYOUT_frameIndex); }
    public MemorySegment _frameIndex() { return _frameIndexAt(0L); }
    public VkAntiLagPresentationInfoAMD _frameIndexAt(long index, MemorySegment src) { _frameIndexAt(index).copyFrom(src); return this; }
    public VkAntiLagPresentationInfoAMD _frameIndex(MemorySegment src) { return _frameIndexAt(0L, src); }
}
