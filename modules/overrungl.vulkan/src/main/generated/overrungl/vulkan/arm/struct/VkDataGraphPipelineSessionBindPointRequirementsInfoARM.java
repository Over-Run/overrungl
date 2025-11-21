// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineSessionBindPointRequirementsInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkDataGraphPipelineSessionARM session;
/// }
/// ```
public final class VkDataGraphPipelineSessionBindPointRequirementsInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("session")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_session = LAYOUT.byteOffset(PathElement.groupElement("session"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_session = LAYOUT.select(PathElement.groupElement("session"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_session = LAYOUT.arrayElementVarHandle(PathElement.groupElement("session"));

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM); }
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM copyFrom(VkDataGraphPipelineSessionBindPointRequirementsInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM reinterpret(long count) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM asSlice(long index) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM at(long index, Consumer<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long sessionAt(long index) { return (long) VH_session.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long session() { return (long) VH_session.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sessionAt(long index, long value) { VH_session.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM session(long value) { VH_session.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sessionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_session, index), LAYOUT_session); }
    public MemorySegment _session() { return _sessionAt(0L); }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM _sessionAt(long index, MemorySegment src) { _sessionAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM _session(MemorySegment src) { return _sessionAt(0L, src); }
}
