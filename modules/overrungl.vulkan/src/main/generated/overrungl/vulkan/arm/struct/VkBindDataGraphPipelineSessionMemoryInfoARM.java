// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindDataGraphPipelineSessionMemoryInfoARM`.
/// ## Layout
/// ```
/// struct VkBindDataGraphPipelineSessionMemoryInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkDataGraphPipelineSessionARM session;
///     VkDataGraphPipelineSessionBindPointARM bindPoint;
///     uint32_t objectIndex;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
/// }
/// ```
public final class VkBindDataGraphPipelineSessionMemoryInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("session"),
        ValueLayout.JAVA_INT.withName("bindPoint"),
        ValueLayout.JAVA_INT.withName("objectIndex"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_session = LAYOUT.byteOffset(PathElement.groupElement("session"));
    public static final long OFFSET_bindPoint = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
    public static final long OFFSET_objectIndex = LAYOUT.byteOffset(PathElement.groupElement("objectIndex"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_session = LAYOUT.select(PathElement.groupElement("session"));
    public static final MemoryLayout LAYOUT_bindPoint = LAYOUT.select(PathElement.groupElement("bindPoint"));
    public static final MemoryLayout LAYOUT_objectIndex = LAYOUT.select(PathElement.groupElement("objectIndex"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_session = LAYOUT.arrayElementVarHandle(PathElement.groupElement("session"));
    public static final VarHandle VH_bindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPoint"));
    public static final VarHandle VH_objectIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectIndex"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));

    public VkBindDataGraphPipelineSessionMemoryInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindDataGraphPipelineSessionMemoryInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDataGraphPipelineSessionMemoryInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindDataGraphPipelineSessionMemoryInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDataGraphPipelineSessionMemoryInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindDataGraphPipelineSessionMemoryInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDataGraphPipelineSessionMemoryInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindDataGraphPipelineSessionMemoryInfoARM alloc(SegmentAllocator allocator) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkBindDataGraphPipelineSessionMemoryInfoARM alloc(SegmentAllocator allocator, long count) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkBindDataGraphPipelineSessionMemoryInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM); }
    public static VkBindDataGraphPipelineSessionMemoryInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM);
        return s;
    }
    public VkBindDataGraphPipelineSessionMemoryInfoARM copyFrom(VkBindDataGraphPipelineSessionMemoryInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM reinterpret(long count) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM asSlice(long index) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM asSlice(long index, long count) { return new VkBindDataGraphPipelineSessionMemoryInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM at(long index, Consumer<VkBindDataGraphPipelineSessionMemoryInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long sessionAt(long index) { return (long) VH_session.get(this.segment(), 0L, index); }
    public int bindPointAt(long index) { return (int) VH_bindPoint.get(this.segment(), 0L, index); }
    public int objectIndexAt(long index) { return (int) VH_objectIndex.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long memoryOffsetAt(long index) { return (long) VH_memoryOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long session() { return (long) VH_session.get(this.segment(), 0L, 0L); }
    public int bindPoint() { return (int) VH_bindPoint.get(this.segment(), 0L, 0L); }
    public int objectIndex() { return (int) VH_objectIndex.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long memoryOffset() { return (long) VH_memoryOffset.get(this.segment(), 0L, 0L); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM sessionAt(long index, long value) { VH_session.set(this.segment(), 0L, index, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM bindPointAt(long index, int value) { VH_bindPoint.set(this.segment(), 0L, index, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM objectIndexAt(long index, int value) { VH_objectIndex.set(this.segment(), 0L, index, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryOffsetAt(long index, long value) { VH_memoryOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM session(long value) { VH_session.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM bindPoint(int value) { VH_bindPoint.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM objectIndex(int value) { VH_objectIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryOffset(long value) { VH_memoryOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sessionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_session, index), LAYOUT_session); }
    public MemorySegment _session() { return _sessionAt(0L); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _sessionAt(long index, MemorySegment src) { _sessionAt(index).copyFrom(src); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _session(MemorySegment src) { return _sessionAt(0L, src); }
    public MemorySegment _bindPointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindPoint, index), LAYOUT_bindPoint); }
    public MemorySegment _bindPoint() { return _bindPointAt(0L); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _bindPointAt(long index, MemorySegment src) { _bindPointAt(index).copyFrom(src); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _bindPoint(MemorySegment src) { return _bindPointAt(0L, src); }
    public MemorySegment _objectIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_objectIndex, index), LAYOUT_objectIndex); }
    public MemorySegment _objectIndex() { return _objectIndexAt(0L); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _objectIndexAt(long index, MemorySegment src) { _objectIndexAt(index).copyFrom(src); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _objectIndex(MemorySegment src) { return _objectIndexAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _memoryOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryOffset, index), LAYOUT_memoryOffset); }
    public MemorySegment _memoryOffset() { return _memoryOffsetAt(0L); }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _memoryOffsetAt(long index, MemorySegment src) { _memoryOffsetAt(index).copyFrom(src); return this; }
    public VkBindDataGraphPipelineSessionMemoryInfoARM _memoryOffset(MemorySegment src) { return _memoryOffsetAt(0L, src); }
}
