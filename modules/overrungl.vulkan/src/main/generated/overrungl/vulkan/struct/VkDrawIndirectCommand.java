// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrawIndirectCommand`.
/// ## Layout
/// ```
/// struct VkDrawIndirectCommand {
///     uint32_t vertexCount;
///     uint32_t instanceCount;
///     uint32_t firstVertex;
///     uint32_t firstInstance;
/// }
/// ```
public final class VkDrawIndirectCommand extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );
    public static final long OFFSET_vertexCount = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
    public static final long OFFSET_instanceCount = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
    public static final long OFFSET_firstVertex = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
    public static final long OFFSET_firstInstance = LAYOUT.byteOffset(PathElement.groupElement("firstInstance"));
    public static final MemoryLayout LAYOUT_vertexCount = LAYOUT.select(PathElement.groupElement("vertexCount"));
    public static final MemoryLayout LAYOUT_instanceCount = LAYOUT.select(PathElement.groupElement("instanceCount"));
    public static final MemoryLayout LAYOUT_firstVertex = LAYOUT.select(PathElement.groupElement("firstVertex"));
    public static final MemoryLayout LAYOUT_firstInstance = LAYOUT.select(PathElement.groupElement("firstInstance"));
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    public static final VarHandle VH_firstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstInstance"));

    public VkDrawIndirectCommand(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDrawIndirectCommand of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCommand(segment, estimateCount(segment, LAYOUT)); }
    public static VkDrawIndirectCommand ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCommand(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDrawIndirectCommand ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCommand(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDrawIndirectCommand alloc(SegmentAllocator allocator) { return new VkDrawIndirectCommand(allocator.allocate(LAYOUT), 1); }
    public static VkDrawIndirectCommand alloc(SegmentAllocator allocator, long count) { return new VkDrawIndirectCommand(allocator.allocate(LAYOUT, count), count); }
    public VkDrawIndirectCommand copyFrom(VkDrawIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDrawIndirectCommand reinterpret(long count) { return new VkDrawIndirectCommand(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDrawIndirectCommand asSlice(long index) { return new VkDrawIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDrawIndirectCommand asSlice(long index, long count) { return new VkDrawIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDrawIndirectCommand at(long index, Consumer<VkDrawIndirectCommand> func) { func.accept(asSlice(index)); return this; }
    public int vertexCountAt(long index) { return (int) VH_vertexCount.get(this.segment(), 0L, index); }
    public int instanceCountAt(long index) { return (int) VH_instanceCount.get(this.segment(), 0L, index); }
    public int firstVertexAt(long index) { return (int) VH_firstVertex.get(this.segment(), 0L, index); }
    public int firstInstanceAt(long index) { return (int) VH_firstInstance.get(this.segment(), 0L, index); }
    public int vertexCount() { return (int) VH_vertexCount.get(this.segment(), 0L, 0L); }
    public int instanceCount() { return (int) VH_instanceCount.get(this.segment(), 0L, 0L); }
    public int firstVertex() { return (int) VH_firstVertex.get(this.segment(), 0L, 0L); }
    public int firstInstance() { return (int) VH_firstInstance.get(this.segment(), 0L, 0L); }
    public VkDrawIndirectCommand vertexCountAt(long index, int value) { VH_vertexCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndirectCommand instanceCountAt(long index, int value) { VH_instanceCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndirectCommand firstVertexAt(long index, int value) { VH_firstVertex.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndirectCommand firstInstanceAt(long index, int value) { VH_firstInstance.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndirectCommand vertexCount(int value) { VH_vertexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndirectCommand instanceCount(int value) { VH_instanceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndirectCommand firstVertex(int value) { VH_firstVertex.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndirectCommand firstInstance(int value) { VH_firstInstance.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _vertexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexCount, index), LAYOUT_vertexCount); }
    public MemorySegment _vertexCount() { return _vertexCountAt(0L); }
    public VkDrawIndirectCommand _vertexCountAt(long index, MemorySegment src) { _vertexCountAt(index).copyFrom(src); return this; }
    public VkDrawIndirectCommand _vertexCount(MemorySegment src) { return _vertexCountAt(0L, src); }
    public MemorySegment _instanceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceCount, index), LAYOUT_instanceCount); }
    public MemorySegment _instanceCount() { return _instanceCountAt(0L); }
    public VkDrawIndirectCommand _instanceCountAt(long index, MemorySegment src) { _instanceCountAt(index).copyFrom(src); return this; }
    public VkDrawIndirectCommand _instanceCount(MemorySegment src) { return _instanceCountAt(0L, src); }
    public MemorySegment _firstVertexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstVertex, index), LAYOUT_firstVertex); }
    public MemorySegment _firstVertex() { return _firstVertexAt(0L); }
    public VkDrawIndirectCommand _firstVertexAt(long index, MemorySegment src) { _firstVertexAt(index).copyFrom(src); return this; }
    public VkDrawIndirectCommand _firstVertex(MemorySegment src) { return _firstVertexAt(0L, src); }
    public MemorySegment _firstInstanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstInstance, index), LAYOUT_firstInstance); }
    public MemorySegment _firstInstance() { return _firstInstanceAt(0L); }
    public VkDrawIndirectCommand _firstInstanceAt(long index, MemorySegment src) { _firstInstanceAt(index).copyFrom(src); return this; }
    public VkDrawIndirectCommand _firstInstance(MemorySegment src) { return _firstInstanceAt(0L, src); }
}
