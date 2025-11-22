// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineSessionMemoryRequirementsInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkDataGraphPipelineSessionARM session;
///     VkDataGraphPipelineSessionBindPointARM bindPoint;
///     uint32_t objectIndex;
/// }
/// ```
public final class VkDataGraphPipelineSessionMemoryRequirementsInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("session"),
        ValueLayout.JAVA_INT.withName("bindPoint"),
        ValueLayout.JAVA_INT.withName("objectIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_session = LAYOUT.byteOffset(PathElement.groupElement("session"));
    public static final long OFFSET_bindPoint = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
    public static final long OFFSET_objectIndex = LAYOUT.byteOffset(PathElement.groupElement("objectIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_session = LAYOUT.select(PathElement.groupElement("session"));
    public static final MemoryLayout LAYOUT_bindPoint = LAYOUT.select(PathElement.groupElement("bindPoint"));
    public static final MemoryLayout LAYOUT_objectIndex = LAYOUT.select(PathElement.groupElement("objectIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_session = LAYOUT.arrayElementVarHandle(PathElement.groupElement("session"));
    public static final VarHandle VH_bindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPoint"));
    public static final VarHandle VH_objectIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectIndex"));

    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM); }
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM copyFrom(VkDataGraphPipelineSessionMemoryRequirementsInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM reinterpret(long count) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM asSlice(long index) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM at(long index, Consumer<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long sessionAt(long index) { return (long) VH_session.get(this.segment(), 0L, index); }
    public int bindPointAt(long index) { return (int) VH_bindPoint.get(this.segment(), 0L, index); }
    public int objectIndexAt(long index) { return (int) VH_objectIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long session() { return (long) VH_session.get(this.segment(), 0L, 0L); }
    public int bindPoint() { return (int) VH_bindPoint.get(this.segment(), 0L, 0L); }
    public int objectIndex() { return (int) VH_objectIndex.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sessionAt(long index, long value) { VH_session.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM bindPointAt(long index, int value) { VH_bindPoint.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM objectIndexAt(long index, int value) { VH_objectIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM session(long value) { VH_session.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM bindPoint(int value) { VH_bindPoint.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM objectIndex(int value) { VH_objectIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sessionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_session, index), LAYOUT_session); }
    public MemorySegment _session() { return _sessionAt(0L); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _sessionAt(long index, MemorySegment src) { _sessionAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _session(MemorySegment src) { return _sessionAt(0L, src); }
    public MemorySegment _bindPointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindPoint, index), LAYOUT_bindPoint); }
    public MemorySegment _bindPoint() { return _bindPointAt(0L); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _bindPointAt(long index, MemorySegment src) { _bindPointAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _bindPoint(MemorySegment src) { return _bindPointAt(0L, src); }
    public MemorySegment _objectIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectIndex, index), LAYOUT_objectIndex); }
    public MemorySegment _objectIndex() { return _objectIndexAt(0L); }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _objectIndexAt(long index, MemorySegment src) { _objectIndexAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM _objectIndex(MemorySegment src) { return _objectIndexAt(0L, src); }
}
