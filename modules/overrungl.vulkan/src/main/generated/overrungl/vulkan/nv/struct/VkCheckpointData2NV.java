// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCheckpointData2NV`.
/// ## Layout
/// ```
/// struct VkCheckpointData2NV {
///     VkStructureType sType;
///     void* pNext;
///     VkPipelineStageFlags2 stage;
///     void* pCheckpointMarker;
/// }
/// ```
public final class VkCheckpointData2NV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("stage"),
        ValueLayout.ADDRESS.withName("pCheckpointMarker")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    public static final long OFFSET_pCheckpointMarker = LAYOUT.byteOffset(PathElement.groupElement("pCheckpointMarker"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    public static final MemoryLayout LAYOUT_pCheckpointMarker = LAYOUT.select(PathElement.groupElement("pCheckpointMarker"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    public static final VarHandle VH_pCheckpointMarker = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCheckpointMarker"));

    public VkCheckpointData2NV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCheckpointData2NV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCheckpointData2NV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCheckpointData2NV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCheckpointData2NV alloc(SegmentAllocator allocator) { return new VkCheckpointData2NV(allocator.allocate(LAYOUT), 1); }
    public static VkCheckpointData2NV alloc(SegmentAllocator allocator, long count) { return new VkCheckpointData2NV(allocator.allocate(LAYOUT, count), count); }
    public static VkCheckpointData2NV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV); }
    public static VkCheckpointData2NV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV);
        return s;
    }
    public VkCheckpointData2NV copyFrom(VkCheckpointData2NV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCheckpointData2NV reinterpret(long count) { return new VkCheckpointData2NV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCheckpointData2NV asSlice(long index) { return new VkCheckpointData2NV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCheckpointData2NV asSlice(long index, long count) { return new VkCheckpointData2NV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCheckpointData2NV at(long index, Consumer<VkCheckpointData2NV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long stageAt(long index) { return (long) VH_stage.get(this.segment(), 0L, index); }
    public MemorySegment pCheckpointMarkerAt(long index) { return (MemorySegment) VH_pCheckpointMarker.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long stage() { return (long) VH_stage.get(this.segment(), 0L, 0L); }
    public MemorySegment pCheckpointMarker() { return (MemorySegment) VH_pCheckpointMarker.get(this.segment(), 0L, 0L); }
    public VkCheckpointData2NV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCheckpointData2NV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCheckpointData2NV stageAt(long index, long value) { VH_stage.set(this.segment(), 0L, index, value); return this; }
    public VkCheckpointData2NV pCheckpointMarkerAt(long index, MemorySegment value) { VH_pCheckpointMarker.set(this.segment(), 0L, index, value); return this; }
    public VkCheckpointData2NV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCheckpointData2NV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCheckpointData2NV stage(long value) { VH_stage.set(this.segment(), 0L, 0L, value); return this; }
    public VkCheckpointData2NV pCheckpointMarker(MemorySegment value) { VH_pCheckpointMarker.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCheckpointData2NV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCheckpointData2NV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCheckpointData2NV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCheckpointData2NV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage); }
    public MemorySegment _stage() { return _stageAt(0L); }
    public VkCheckpointData2NV _stageAt(long index, MemorySegment src) { _stageAt(index).copyFrom(src); return this; }
    public VkCheckpointData2NV _stage(MemorySegment src) { return _stageAt(0L, src); }
    public MemorySegment _pCheckpointMarkerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCheckpointMarker, index), LAYOUT_pCheckpointMarker); }
    public MemorySegment _pCheckpointMarker() { return _pCheckpointMarkerAt(0L); }
    public VkCheckpointData2NV _pCheckpointMarkerAt(long index, MemorySegment src) { _pCheckpointMarkerAt(index).copyFrom(src); return this; }
    public VkCheckpointData2NV _pCheckpointMarker(MemorySegment src) { return _pCheckpointMarkerAt(0L, src); }
}
