// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineSessionBindPointRequirementARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineSessionBindPointRequirementARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkDataGraphPipelineSessionBindPointARM bindPoint;
///     VkDataGraphPipelineSessionBindPointTypeARM bindPointType;
///     uint32_t numObjects;
/// }
/// ```
public final class VkDataGraphPipelineSessionBindPointRequirementARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bindPoint"),
        ValueLayout.JAVA_INT.withName("bindPointType"),
        ValueLayout.JAVA_INT.withName("numObjects")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_bindPoint = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
    public static final long OFFSET_bindPointType = LAYOUT.byteOffset(PathElement.groupElement("bindPointType"));
    public static final long OFFSET_numObjects = LAYOUT.byteOffset(PathElement.groupElement("numObjects"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_bindPoint = LAYOUT.select(PathElement.groupElement("bindPoint"));
    public static final MemoryLayout LAYOUT_bindPointType = LAYOUT.select(PathElement.groupElement("bindPointType"));
    public static final MemoryLayout LAYOUT_numObjects = LAYOUT.select(PathElement.groupElement("numObjects"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_bindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPoint"));
    public static final VarHandle VH_bindPointType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPointType"));
    public static final VarHandle VH_numObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numObjects"));

    public VkDataGraphPipelineSessionBindPointRequirementARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineSessionBindPointRequirementARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineSessionBindPointRequirementARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineSessionBindPointRequirementARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineSessionBindPointRequirementARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineSessionBindPointRequirementARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineSessionBindPointRequirementARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineSessionBindPointRequirementARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineSessionBindPointRequirementARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM); }
    public static VkDataGraphPipelineSessionBindPointRequirementARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM);
        return s;
    }
    public VkDataGraphPipelineSessionBindPointRequirementARM copyFrom(VkDataGraphPipelineSessionBindPointRequirementARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM reinterpret(long count) { return new VkDataGraphPipelineSessionBindPointRequirementARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineSessionBindPointRequirementARM asSlice(long index) { return new VkDataGraphPipelineSessionBindPointRequirementARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineSessionBindPointRequirementARM asSlice(long index, long count) { return new VkDataGraphPipelineSessionBindPointRequirementARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineSessionBindPointRequirementARM at(long index, Consumer<VkDataGraphPipelineSessionBindPointRequirementARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int bindPointAt(long index) { return (int) VH_bindPoint.get(this.segment(), 0L, index); }
    public int bindPointTypeAt(long index) { return (int) VH_bindPointType.get(this.segment(), 0L, index); }
    public int numObjectsAt(long index) { return (int) VH_numObjects.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int bindPoint() { return (int) VH_bindPoint.get(this.segment(), 0L, 0L); }
    public int bindPointType() { return (int) VH_bindPointType.get(this.segment(), 0L, 0L); }
    public int numObjects() { return (int) VH_numObjects.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineSessionBindPointRequirementARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPointAt(long index, int value) { VH_bindPoint.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPointTypeAt(long index, int value) { VH_bindPointType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM numObjectsAt(long index, int value) { VH_numObjects.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPoint(int value) { VH_bindPoint.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPointType(int value) { VH_bindPointType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM numObjects(int value) { VH_numObjects.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineSessionBindPointRequirementARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineSessionBindPointRequirementARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _bindPointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindPoint, index), LAYOUT_bindPoint); }
    public MemorySegment _bindPoint() { return _bindPointAt(0L); }
    public VkDataGraphPipelineSessionBindPointRequirementARM _bindPointAt(long index, MemorySegment src) { _bindPointAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM _bindPoint(MemorySegment src) { return _bindPointAt(0L, src); }
    public MemorySegment _bindPointTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindPointType, index), LAYOUT_bindPointType); }
    public MemorySegment _bindPointType() { return _bindPointTypeAt(0L); }
    public VkDataGraphPipelineSessionBindPointRequirementARM _bindPointTypeAt(long index, MemorySegment src) { _bindPointTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM _bindPointType(MemorySegment src) { return _bindPointTypeAt(0L, src); }
    public MemorySegment _numObjectsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numObjects, index), LAYOUT_numObjects); }
    public MemorySegment _numObjects() { return _numObjectsAt(0L); }
    public VkDataGraphPipelineSessionBindPointRequirementARM _numObjectsAt(long index, MemorySegment src) { _numObjectsAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionBindPointRequirementARM _numObjects(MemorySegment src) { return _numObjectsAt(0L, src); }
}
