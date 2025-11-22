// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureBuildRangeInfoKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureBuildRangeInfoKHR {
///     uint32_t primitiveCount;
///     uint32_t primitiveOffset;
///     uint32_t firstVertex;
///     uint32_t transformOffset;
/// }
/// ```
public final class VkAccelerationStructureBuildRangeInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("primitiveCount"),
        ValueLayout.JAVA_INT.withName("primitiveOffset"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("transformOffset")
    );
    public static final long OFFSET_primitiveCount = LAYOUT.byteOffset(PathElement.groupElement("primitiveCount"));
    public static final long OFFSET_primitiveOffset = LAYOUT.byteOffset(PathElement.groupElement("primitiveOffset"));
    public static final long OFFSET_firstVertex = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
    public static final long OFFSET_transformOffset = LAYOUT.byteOffset(PathElement.groupElement("transformOffset"));
    public static final MemoryLayout LAYOUT_primitiveCount = LAYOUT.select(PathElement.groupElement("primitiveCount"));
    public static final MemoryLayout LAYOUT_primitiveOffset = LAYOUT.select(PathElement.groupElement("primitiveOffset"));
    public static final MemoryLayout LAYOUT_firstVertex = LAYOUT.select(PathElement.groupElement("firstVertex"));
    public static final MemoryLayout LAYOUT_transformOffset = LAYOUT.select(PathElement.groupElement("transformOffset"));
    public static final VarHandle VH_primitiveCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveCount"));
    public static final VarHandle VH_primitiveOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveOffset"));
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    public static final VarHandle VH_transformOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformOffset"));

    public VkAccelerationStructureBuildRangeInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureBuildRangeInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildRangeInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureBuildRangeInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildRangeInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureBuildRangeInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildRangeInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureBuildRangeInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildRangeInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureBuildRangeInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureBuildRangeInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public VkAccelerationStructureBuildRangeInfoKHR copyFrom(VkAccelerationStructureBuildRangeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR reinterpret(long count) { return new VkAccelerationStructureBuildRangeInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureBuildRangeInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildRangeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureBuildRangeInfoKHR asSlice(long index, long count) { return new VkAccelerationStructureBuildRangeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureBuildRangeInfoKHR at(long index, Consumer<VkAccelerationStructureBuildRangeInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int primitiveCountAt(long index) { return (int) VH_primitiveCount.get(this.segment(), 0L, index); }
    public int primitiveOffsetAt(long index) { return (int) VH_primitiveOffset.get(this.segment(), 0L, index); }
    public int firstVertexAt(long index) { return (int) VH_firstVertex.get(this.segment(), 0L, index); }
    public int transformOffsetAt(long index) { return (int) VH_transformOffset.get(this.segment(), 0L, index); }
    public int primitiveCount() { return (int) VH_primitiveCount.get(this.segment(), 0L, 0L); }
    public int primitiveOffset() { return (int) VH_primitiveOffset.get(this.segment(), 0L, 0L); }
    public int firstVertex() { return (int) VH_firstVertex.get(this.segment(), 0L, 0L); }
    public int transformOffset() { return (int) VH_transformOffset.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureBuildRangeInfoKHR primitiveCountAt(long index, int value) { VH_primitiveCount.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffsetAt(long index, int value) { VH_primitiveOffset.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR firstVertexAt(long index, int value) { VH_firstVertex.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR transformOffsetAt(long index, int value) { VH_transformOffset.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR primitiveCount(int value) { VH_primitiveCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffset(int value) { VH_primitiveOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR firstVertex(int value) { VH_firstVertex.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR transformOffset(int value) { VH_transformOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _primitiveCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveCount, index), LAYOUT_primitiveCount); }
    public MemorySegment _primitiveCount() { return _primitiveCountAt(0L); }
    public VkAccelerationStructureBuildRangeInfoKHR _primitiveCountAt(long index, MemorySegment src) { _primitiveCountAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR _primitiveCount(MemorySegment src) { return _primitiveCountAt(0L, src); }
    public MemorySegment _primitiveOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveOffset, index), LAYOUT_primitiveOffset); }
    public MemorySegment _primitiveOffset() { return _primitiveOffsetAt(0L); }
    public VkAccelerationStructureBuildRangeInfoKHR _primitiveOffsetAt(long index, MemorySegment src) { _primitiveOffsetAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR _primitiveOffset(MemorySegment src) { return _primitiveOffsetAt(0L, src); }
    public MemorySegment _firstVertexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstVertex, index), LAYOUT_firstVertex); }
    public MemorySegment _firstVertex() { return _firstVertexAt(0L); }
    public VkAccelerationStructureBuildRangeInfoKHR _firstVertexAt(long index, MemorySegment src) { _firstVertexAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR _firstVertex(MemorySegment src) { return _firstVertexAt(0L, src); }
    public MemorySegment _transformOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformOffset, index), LAYOUT_transformOffset); }
    public MemorySegment _transformOffset() { return _transformOffsetAt(0L); }
    public VkAccelerationStructureBuildRangeInfoKHR _transformOffsetAt(long index, MemorySegment src) { _transformOffsetAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildRangeInfoKHR _transformOffset(MemorySegment src) { return _transformOffsetAt(0L, src); }
}
