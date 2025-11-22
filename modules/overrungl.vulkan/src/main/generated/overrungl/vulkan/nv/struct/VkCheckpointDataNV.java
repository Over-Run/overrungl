// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCheckpointDataNV`.
/// ## Layout
/// ```
/// struct VkCheckpointDataNV {
///     VkStructureType sType;
///     void* pNext;
///     VkPipelineStageFlagBits stage;
///     void* pCheckpointMarker;
/// }
/// ```
public final class VkCheckpointDataNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stage"),
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

    public VkCheckpointDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCheckpointDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointDataNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCheckpointDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCheckpointDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCheckpointDataNV alloc(SegmentAllocator allocator) { return new VkCheckpointDataNV(allocator.allocate(LAYOUT), 1); }
    public static VkCheckpointDataNV alloc(SegmentAllocator allocator, long count) { return new VkCheckpointDataNV(allocator.allocate(LAYOUT, count), count); }
    public static VkCheckpointDataNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV); }
    public static VkCheckpointDataNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV);
        return s;
    }
    public VkCheckpointDataNV copyFrom(VkCheckpointDataNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCheckpointDataNV reinterpret(long count) { return new VkCheckpointDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCheckpointDataNV asSlice(long index) { return new VkCheckpointDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCheckpointDataNV asSlice(long index, long count) { return new VkCheckpointDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCheckpointDataNV at(long index, Consumer<VkCheckpointDataNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stageAt(long index) { return (int) VH_stage.get(this.segment(), 0L, index); }
    public MemorySegment pCheckpointMarkerAt(long index) { return (MemorySegment) VH_pCheckpointMarker.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stage() { return (int) VH_stage.get(this.segment(), 0L, 0L); }
    public MemorySegment pCheckpointMarker() { return (MemorySegment) VH_pCheckpointMarker.get(this.segment(), 0L, 0L); }
    public VkCheckpointDataNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCheckpointDataNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCheckpointDataNV stageAt(long index, int value) { VH_stage.set(this.segment(), 0L, index, value); return this; }
    public VkCheckpointDataNV pCheckpointMarkerAt(long index, MemorySegment value) { VH_pCheckpointMarker.set(this.segment(), 0L, index, value); return this; }
    public VkCheckpointDataNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCheckpointDataNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCheckpointDataNV stage(int value) { VH_stage.set(this.segment(), 0L, 0L, value); return this; }
    public VkCheckpointDataNV pCheckpointMarker(MemorySegment value) { VH_pCheckpointMarker.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCheckpointDataNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCheckpointDataNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCheckpointDataNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCheckpointDataNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage); }
    public MemorySegment _stage() { return _stageAt(0L); }
    public VkCheckpointDataNV _stageAt(long index, MemorySegment src) { _stageAt(index).copyFrom(src); return this; }
    public VkCheckpointDataNV _stage(MemorySegment src) { return _stageAt(0L, src); }
    public MemorySegment _pCheckpointMarkerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCheckpointMarker, index), LAYOUT_pCheckpointMarker); }
    public MemorySegment _pCheckpointMarker() { return _pCheckpointMarkerAt(0L); }
    public VkCheckpointDataNV _pCheckpointMarkerAt(long index, MemorySegment src) { _pCheckpointMarkerAt(index).copyFrom(src); return this; }
    public VkCheckpointDataNV _pCheckpointMarker(MemorySegment src) { return _pCheckpointMarkerAt(0L, src); }
}
