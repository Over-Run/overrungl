// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMultiDrawInfoEXT`.
/// ## Layout
/// ```
/// struct VkMultiDrawInfoEXT {
///     uint32_t firstVertex;
///     uint32_t vertexCount;
/// }
/// ```
public final class VkMultiDrawInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("vertexCount")
    );
    public static final long OFFSET_firstVertex = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
    public static final long OFFSET_vertexCount = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
    public static final MemoryLayout LAYOUT_firstVertex = LAYOUT.select(PathElement.groupElement("firstVertex"));
    public static final MemoryLayout LAYOUT_vertexCount = LAYOUT.select(PathElement.groupElement("vertexCount"));
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));

    public VkMultiDrawInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMultiDrawInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMultiDrawInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMultiDrawInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMultiDrawInfoEXT alloc(SegmentAllocator allocator) { return new VkMultiDrawInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMultiDrawInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMultiDrawInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public VkMultiDrawInfoEXT copyFrom(VkMultiDrawInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMultiDrawInfoEXT reinterpret(long count) { return new VkMultiDrawInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMultiDrawInfoEXT asSlice(long index) { return new VkMultiDrawInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMultiDrawInfoEXT asSlice(long index, long count) { return new VkMultiDrawInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMultiDrawInfoEXT at(long index, Consumer<VkMultiDrawInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int firstVertexAt(long index) { return (int) VH_firstVertex.get(this.segment(), 0L, index); }
    public int vertexCountAt(long index) { return (int) VH_vertexCount.get(this.segment(), 0L, index); }
    public int firstVertex() { return (int) VH_firstVertex.get(this.segment(), 0L, 0L); }
    public int vertexCount() { return (int) VH_vertexCount.get(this.segment(), 0L, 0L); }
    public VkMultiDrawInfoEXT firstVertexAt(long index, int value) { VH_firstVertex.set(this.segment(), 0L, index, value); return this; }
    public VkMultiDrawInfoEXT vertexCountAt(long index, int value) { VH_vertexCount.set(this.segment(), 0L, index, value); return this; }
    public VkMultiDrawInfoEXT firstVertex(int value) { VH_firstVertex.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiDrawInfoEXT vertexCount(int value) { VH_vertexCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _firstVertexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstVertex, index), LAYOUT_firstVertex); }
    public MemorySegment _firstVertex() { return _firstVertexAt(0L); }
    public VkMultiDrawInfoEXT _firstVertexAt(long index, MemorySegment src) { _firstVertexAt(index).copyFrom(src); return this; }
    public VkMultiDrawInfoEXT _firstVertex(MemorySegment src) { return _firstVertexAt(0L, src); }
    public MemorySegment _vertexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexCount, index), LAYOUT_vertexCount); }
    public MemorySegment _vertexCount() { return _vertexCountAt(0L); }
    public VkMultiDrawInfoEXT _vertexCountAt(long index, MemorySegment src) { _vertexCountAt(index).copyFrom(src); return this; }
    public VkMultiDrawInfoEXT _vertexCount(MemorySegment src) { return _vertexCountAt(0L, src); }
}
