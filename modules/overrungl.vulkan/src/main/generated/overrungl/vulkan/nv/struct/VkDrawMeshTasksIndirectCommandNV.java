// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrawMeshTasksIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkDrawMeshTasksIndirectCommandNV {
///     uint32_t taskCount;
///     uint32_t firstTask;
/// };
/// ```
public final class VkDrawMeshTasksIndirectCommandNV extends GroupType {
    /// The struct layout of `VkDrawMeshTasksIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("taskCount"),
        ValueLayout.JAVA_INT.withName("firstTask")
    );
    /// The byte offset of `taskCount`.
    public static final long OFFSET_taskCount = LAYOUT.byteOffset(PathElement.groupElement("taskCount"));
    /// The memory layout of `taskCount`.
    public static final MemoryLayout LAYOUT_taskCount = LAYOUT.select(PathElement.groupElement("taskCount"));
    /// The [VarHandle] of `taskCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_taskCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("taskCount")));
    /// The byte offset of `firstTask`.
    public static final long OFFSET_firstTask = LAYOUT.byteOffset(PathElement.groupElement("firstTask"));
    /// The memory layout of `firstTask`.
    public static final MemoryLayout LAYOUT_firstTask = LAYOUT.select(PathElement.groupElement("firstTask"));
    /// The [VarHandle] of `firstTask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_firstTask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstTask")));

    /// Creates `VkDrawMeshTasksIndirectCommandNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDrawMeshTasksIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDrawMeshTasksIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrawMeshTasksIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDrawMeshTasksIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawMeshTasksIndirectCommandNV`
    public static VkDrawMeshTasksIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkDrawMeshTasksIndirectCommandNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawMeshTasksIndirectCommandNV`
    public static VkDrawMeshTasksIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkDrawMeshTasksIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV copyFrom(VkDrawMeshTasksIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDrawMeshTasksIndirectCommandNV reinterpret(long count) { return new VkDrawMeshTasksIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `taskCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int taskCount(MemorySegment segment, long index) { return (int) VH_taskCount.get().get(segment, 0L, index); }
    /// {@return `taskCount`}
    public int taskCount() { return taskCount(this.segment(), 0L); }
    /// Sets `taskCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void taskCount(MemorySegment segment, long index, int value) { VH_taskCount.get().set(segment, 0L, index, value); }
    /// Sets `taskCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV taskCount(int value) { taskCount(this.segment(), 0L, value); return this; }

    /// {@return `firstTask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstTask(MemorySegment segment, long index) { return (int) VH_firstTask.get().get(segment, 0L, index); }
    /// {@return `firstTask`}
    public int firstTask() { return firstTask(this.segment(), 0L); }
    /// Sets `firstTask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstTask(MemorySegment segment, long index, int value) { VH_firstTask.get().set(segment, 0L, index, value); }
    /// Sets `firstTask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV firstTask(int value) { firstTask(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDrawMeshTasksIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDrawMeshTasksIndirectCommandNV`
    public VkDrawMeshTasksIndirectCommandNV asSlice(long index) { return new VkDrawMeshTasksIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDrawMeshTasksIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDrawMeshTasksIndirectCommandNV`
    public VkDrawMeshTasksIndirectCommandNV asSlice(long index, long count) { return new VkDrawMeshTasksIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDrawMeshTasksIndirectCommandNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV at(long index, Consumer<VkDrawMeshTasksIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `taskCount` at the given index}
    /// @param index the index of the struct buffer
    public int taskCountAt(long index) { return taskCount(this.segment(), index); }
    /// Sets `taskCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV taskCountAt(long index, int value) { taskCount(this.segment(), index, value); return this; }

    /// {@return `firstTask` at the given index}
    /// @param index the index of the struct buffer
    public int firstTaskAt(long index) { return firstTask(this.segment(), index); }
    /// Sets `firstTask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandNV firstTaskAt(long index, int value) { firstTask(this.segment(), index, value); return this; }

}
