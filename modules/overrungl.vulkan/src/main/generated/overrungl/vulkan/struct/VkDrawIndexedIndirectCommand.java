// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrawIndexedIndirectCommand`.
/// ## Layout
/// ```
/// struct VkDrawIndexedIndirectCommand {
///     uint32_t indexCount;
///     uint32_t instanceCount;
///     uint32_t firstIndex;
///     int32_t vertexOffset;
///     uint32_t firstInstance;
/// }
/// ```
public final class VkDrawIndexedIndirectCommand extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );
    public static final long OFFSET_indexCount = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
    public static final long OFFSET_instanceCount = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
    public static final long OFFSET_firstIndex = LAYOUT.byteOffset(PathElement.groupElement("firstIndex"));
    public static final long OFFSET_vertexOffset = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
    public static final long OFFSET_firstInstance = LAYOUT.byteOffset(PathElement.groupElement("firstInstance"));
    public static final MemoryLayout LAYOUT_indexCount = LAYOUT.select(PathElement.groupElement("indexCount"));
    public static final MemoryLayout LAYOUT_instanceCount = LAYOUT.select(PathElement.groupElement("instanceCount"));
    public static final MemoryLayout LAYOUT_firstIndex = LAYOUT.select(PathElement.groupElement("firstIndex"));
    public static final MemoryLayout LAYOUT_vertexOffset = LAYOUT.select(PathElement.groupElement("vertexOffset"));
    public static final MemoryLayout LAYOUT_firstInstance = LAYOUT.select(PathElement.groupElement("firstInstance"));
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    public static final VarHandle VH_firstIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstIndex"));
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));
    public static final VarHandle VH_firstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstInstance"));

    public VkDrawIndexedIndirectCommand(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDrawIndexedIndirectCommand of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndexedIndirectCommand(segment, estimateCount(segment, LAYOUT)); }
    public static VkDrawIndexedIndirectCommand ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndexedIndirectCommand(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDrawIndexedIndirectCommand ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndexedIndirectCommand(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDrawIndexedIndirectCommand alloc(SegmentAllocator allocator) { return new VkDrawIndexedIndirectCommand(allocator.allocate(LAYOUT), 1); }
    public static VkDrawIndexedIndirectCommand alloc(SegmentAllocator allocator, long count) { return new VkDrawIndexedIndirectCommand(allocator.allocate(LAYOUT, count), count); }
    public VkDrawIndexedIndirectCommand copyFrom(VkDrawIndexedIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDrawIndexedIndirectCommand reinterpret(long count) { return new VkDrawIndexedIndirectCommand(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDrawIndexedIndirectCommand asSlice(long index) { return new VkDrawIndexedIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDrawIndexedIndirectCommand asSlice(long index, long count) { return new VkDrawIndexedIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDrawIndexedIndirectCommand at(long index, Consumer<VkDrawIndexedIndirectCommand> func) { func.accept(asSlice(index)); return this; }
    public int indexCountAt(long index) { return (int) VH_indexCount.get(this.segment(), 0L, index); }
    public int instanceCountAt(long index) { return (int) VH_instanceCount.get(this.segment(), 0L, index); }
    public int firstIndexAt(long index) { return (int) VH_firstIndex.get(this.segment(), 0L, index); }
    public int vertexOffsetAt(long index) { return (int) VH_vertexOffset.get(this.segment(), 0L, index); }
    public int firstInstanceAt(long index) { return (int) VH_firstInstance.get(this.segment(), 0L, index); }
    public int indexCount() { return (int) VH_indexCount.get(this.segment(), 0L, 0L); }
    public int instanceCount() { return (int) VH_instanceCount.get(this.segment(), 0L, 0L); }
    public int firstIndex() { return (int) VH_firstIndex.get(this.segment(), 0L, 0L); }
    public int vertexOffset() { return (int) VH_vertexOffset.get(this.segment(), 0L, 0L); }
    public int firstInstance() { return (int) VH_firstInstance.get(this.segment(), 0L, 0L); }
    public VkDrawIndexedIndirectCommand indexCountAt(long index, int value) { VH_indexCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndexedIndirectCommand instanceCountAt(long index, int value) { VH_instanceCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndexedIndirectCommand firstIndexAt(long index, int value) { VH_firstIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndexedIndirectCommand vertexOffsetAt(long index, int value) { VH_vertexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndexedIndirectCommand firstInstanceAt(long index, int value) { VH_firstInstance.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndexedIndirectCommand indexCount(int value) { VH_indexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndexedIndirectCommand instanceCount(int value) { VH_instanceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndexedIndirectCommand firstIndex(int value) { VH_firstIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndexedIndirectCommand vertexOffset(int value) { VH_vertexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndexedIndirectCommand firstInstance(int value) { VH_firstInstance.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _indexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexCount, index), LAYOUT_indexCount); }
    public MemorySegment _indexCount() { return _indexCountAt(0L); }
    public VkDrawIndexedIndirectCommand _indexCountAt(long index, MemorySegment src) { _indexCountAt(index).copyFrom(src); return this; }
    public VkDrawIndexedIndirectCommand _indexCount(MemorySegment src) { return _indexCountAt(0L, src); }
    public MemorySegment _instanceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceCount, index), LAYOUT_instanceCount); }
    public MemorySegment _instanceCount() { return _instanceCountAt(0L); }
    public VkDrawIndexedIndirectCommand _instanceCountAt(long index, MemorySegment src) { _instanceCountAt(index).copyFrom(src); return this; }
    public VkDrawIndexedIndirectCommand _instanceCount(MemorySegment src) { return _instanceCountAt(0L, src); }
    public MemorySegment _firstIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstIndex, index), LAYOUT_firstIndex); }
    public MemorySegment _firstIndex() { return _firstIndexAt(0L); }
    public VkDrawIndexedIndirectCommand _firstIndexAt(long index, MemorySegment src) { _firstIndexAt(index).copyFrom(src); return this; }
    public VkDrawIndexedIndirectCommand _firstIndex(MemorySegment src) { return _firstIndexAt(0L, src); }
    public MemorySegment _vertexOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexOffset, index), LAYOUT_vertexOffset); }
    public MemorySegment _vertexOffset() { return _vertexOffsetAt(0L); }
    public VkDrawIndexedIndirectCommand _vertexOffsetAt(long index, MemorySegment src) { _vertexOffsetAt(index).copyFrom(src); return this; }
    public VkDrawIndexedIndirectCommand _vertexOffset(MemorySegment src) { return _vertexOffsetAt(0L, src); }
    public MemorySegment _firstInstanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstInstance, index), LAYOUT_firstInstance); }
    public MemorySegment _firstInstance() { return _firstInstanceAt(0L); }
    public VkDrawIndexedIndirectCommand _firstInstanceAt(long index, MemorySegment src) { _firstInstanceAt(index).copyFrom(src); return this; }
    public VkDrawIndexedIndirectCommand _firstInstance(MemorySegment src) { return _firstInstanceAt(0L, src); }
}
