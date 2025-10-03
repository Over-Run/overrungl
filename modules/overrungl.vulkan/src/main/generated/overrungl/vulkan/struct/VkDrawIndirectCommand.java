// This file is auto-generated. DO NOT EDIT!
//@formatter:off
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
/// };
/// ```
public final class VkDrawIndirectCommand extends GroupType {
    /// The struct layout of `VkDrawIndirectCommand`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );
    /// The byte offset of `vertexCount`.
    public static final long OFFSET_vertexCount = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
    /// The memory layout of `vertexCount`.
    public static final MemoryLayout LAYOUT_vertexCount = LAYOUT.select(PathElement.groupElement("vertexCount"));
    /// The [VarHandle] of `vertexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));
    /// The byte offset of `instanceCount`.
    public static final long OFFSET_instanceCount = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
    /// The memory layout of `instanceCount`.
    public static final MemoryLayout LAYOUT_instanceCount = LAYOUT.select(PathElement.groupElement("instanceCount"));
    /// The [VarHandle] of `instanceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    /// The byte offset of `firstVertex`.
    public static final long OFFSET_firstVertex = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
    /// The memory layout of `firstVertex`.
    public static final MemoryLayout LAYOUT_firstVertex = LAYOUT.select(PathElement.groupElement("firstVertex"));
    /// The [VarHandle] of `firstVertex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    /// The byte offset of `firstInstance`.
    public static final long OFFSET_firstInstance = LAYOUT.byteOffset(PathElement.groupElement("firstInstance"));
    /// The memory layout of `firstInstance`.
    public static final MemoryLayout LAYOUT_firstInstance = LAYOUT.select(PathElement.groupElement("firstInstance"));
    /// The [VarHandle] of `firstInstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstInstance"));

    /// Creates `VkDrawIndirectCommand` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDrawIndirectCommand(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDrawIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCommand of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCommand(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrawIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCommand ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCommand(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDrawIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawIndirectCommand ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCommand(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDrawIndirectCommand` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawIndirectCommand`
    public static VkDrawIndirectCommand alloc(SegmentAllocator allocator) { return new VkDrawIndirectCommand(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDrawIndirectCommand` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawIndirectCommand`
    public static VkDrawIndirectCommand alloc(SegmentAllocator allocator, long count) { return new VkDrawIndirectCommand(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrawIndirectCommand copyFrom(VkDrawIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDrawIndirectCommand reinterpret(long count) { return new VkDrawIndirectCommand(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `vertexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexCount(MemorySegment segment, long index) { return (int) VH_vertexCount.get(segment, 0L, index); }
    /// {@return `vertexCount`}
    public int vertexCount() { return vertexCount(this.segment(), 0L); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexCount(MemorySegment segment, long index, int value) { VH_vertexCount.set(segment, 0L, index, value); }
    /// Sets `vertexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand vertexCount(int value) { vertexCount(this.segment(), 0L, value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceCount(MemorySegment segment, long index) { return (int) VH_instanceCount.get(segment, 0L, index); }
    /// {@return `instanceCount`}
    public int instanceCount() { return instanceCount(this.segment(), 0L); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceCount(MemorySegment segment, long index, int value) { VH_instanceCount.set(segment, 0L, index, value); }
    /// Sets `instanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand instanceCount(int value) { instanceCount(this.segment(), 0L, value); return this; }

    /// {@return `firstVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstVertex(MemorySegment segment, long index) { return (int) VH_firstVertex.get(segment, 0L, index); }
    /// {@return `firstVertex`}
    public int firstVertex() { return firstVertex(this.segment(), 0L); }
    /// Sets `firstVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstVertex(MemorySegment segment, long index, int value) { VH_firstVertex.set(segment, 0L, index, value); }
    /// Sets `firstVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand firstVertex(int value) { firstVertex(this.segment(), 0L, value); return this; }

    /// {@return `firstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstInstance(MemorySegment segment, long index) { return (int) VH_firstInstance.get(segment, 0L, index); }
    /// {@return `firstInstance`}
    public int firstInstance() { return firstInstance(this.segment(), 0L); }
    /// Sets `firstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstInstance(MemorySegment segment, long index, int value) { VH_firstInstance.set(segment, 0L, index, value); }
    /// Sets `firstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand firstInstance(int value) { firstInstance(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDrawIndirectCommand`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDrawIndirectCommand`
    public VkDrawIndirectCommand asSlice(long index) { return new VkDrawIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDrawIndirectCommand`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDrawIndirectCommand`
    public VkDrawIndirectCommand asSlice(long index, long count) { return new VkDrawIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDrawIndirectCommand` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDrawIndirectCommand at(long index, Consumer<VkDrawIndirectCommand> func) { func.accept(asSlice(index)); return this; }

    /// {@return `vertexCount` at the given index}
    /// @param index the index of the struct buffer
    public int vertexCountAt(long index) { return vertexCount(this.segment(), index); }
    /// Sets `vertexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand vertexCountAt(long index, int value) { vertexCount(this.segment(), index, value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param index the index of the struct buffer
    public int instanceCountAt(long index) { return instanceCount(this.segment(), index); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand instanceCountAt(long index, int value) { instanceCount(this.segment(), index, value); return this; }

    /// {@return `firstVertex` at the given index}
    /// @param index the index of the struct buffer
    public int firstVertexAt(long index) { return firstVertex(this.segment(), index); }
    /// Sets `firstVertex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand firstVertexAt(long index, int value) { firstVertex(this.segment(), index, value); return this; }

    /// {@return `firstInstance` at the given index}
    /// @param index the index of the struct buffer
    public int firstInstanceAt(long index) { return firstInstance(this.segment(), index); }
    /// Sets `firstInstance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawIndirectCommand firstInstanceAt(long index, int value) { firstInstance(this.segment(), index, value); return this; }

}
