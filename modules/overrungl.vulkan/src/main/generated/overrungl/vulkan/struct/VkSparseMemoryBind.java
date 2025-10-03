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

/// Represents `VkSparseMemoryBind`.
/// ## Layout
/// ```
/// struct VkSparseMemoryBind {
///     (uint64_t) VkDeviceSize resourceOffset;
///     (uint64_t) VkDeviceSize size;
///     (uint64_t) VkDeviceMemory memory;
///     (uint64_t) VkDeviceSize memoryOffset;
///     ((uint32_t) VkFlags) VkSparseMemoryBindFlags flags;
/// };
/// ```
public final class VkSparseMemoryBind extends GroupType {
    /// The struct layout of `VkSparseMemoryBind`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("resourceOffset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The byte offset of `resourceOffset`.
    public static final long OFFSET_resourceOffset = LAYOUT.byteOffset(PathElement.groupElement("resourceOffset"));
    /// The memory layout of `resourceOffset`.
    public static final MemoryLayout LAYOUT_resourceOffset = LAYOUT.select(PathElement.groupElement("resourceOffset"));
    /// The [VarHandle] of `resourceOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_resourceOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceOffset")));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_size = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("size")));
    /// The byte offset of `memory`.
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    /// The memory layout of `memory`.
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_memory = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory")));
    /// The byte offset of `memoryOffset`.
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    /// The memory layout of `memoryOffset`.
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    /// The [VarHandle] of `memoryOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_memoryOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset")));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));

    /// Creates `VkSparseMemoryBind` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSparseMemoryBind(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSparseMemoryBind` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseMemoryBind of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseMemoryBind` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseMemoryBind ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSparseMemoryBind` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseMemoryBind ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSparseMemoryBind` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseMemoryBind`
    public static VkSparseMemoryBind alloc(SegmentAllocator allocator) { return new VkSparseMemoryBind(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSparseMemoryBind` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseMemoryBind`
    public static VkSparseMemoryBind alloc(SegmentAllocator allocator, long count) { return new VkSparseMemoryBind(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseMemoryBind copyFrom(VkSparseMemoryBind src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSparseMemoryBind reinterpret(long count) { return new VkSparseMemoryBind(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `resourceOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long resourceOffset(MemorySegment segment, long index) { return (long) VH_resourceOffset.get().get(segment, 0L, index); }
    /// {@return `resourceOffset`}
    public long resourceOffset() { return resourceOffset(this.segment(), 0L); }
    /// Sets `resourceOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resourceOffset(MemorySegment segment, long index, long value) { VH_resourceOffset.get().set(segment, 0L, index, value); }
    /// Sets `resourceOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind resourceOffset(long value) { resourceOffset(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get().get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.get().set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memory(MemorySegment segment, long index) { return (long) VH_memory.get().get(segment, 0L, index); }
    /// {@return `memory`}
    public long memory() { return memory(this.segment(), 0L); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memory(MemorySegment segment, long index, long value) { VH_memory.get().set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind memory(long value) { memory(this.segment(), 0L, value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memoryOffset(MemorySegment segment, long index) { return (long) VH_memoryOffset.get().get(segment, 0L, index); }
    /// {@return `memoryOffset`}
    public long memoryOffset() { return memoryOffset(this.segment(), 0L); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryOffset(MemorySegment segment, long index, long value) { VH_memoryOffset.get().set(segment, 0L, index, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind memoryOffset(long value) { memoryOffset(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSparseMemoryBind`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSparseMemoryBind`
    public VkSparseMemoryBind asSlice(long index) { return new VkSparseMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSparseMemoryBind`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSparseMemoryBind`
    public VkSparseMemoryBind asSlice(long index, long count) { return new VkSparseMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSparseMemoryBind` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSparseMemoryBind at(long index, Consumer<VkSparseMemoryBind> func) { func.accept(asSlice(index)); return this; }

    /// {@return `resourceOffset` at the given index}
    /// @param index the index of the struct buffer
    public long resourceOffsetAt(long index) { return resourceOffset(this.segment(), index); }
    /// Sets `resourceOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind resourceOffsetAt(long index, long value) { resourceOffset(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `memory` at the given index}
    /// @param index the index of the struct buffer
    public long memoryAt(long index) { return memory(this.segment(), index); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind memoryAt(long index, long value) { memory(this.segment(), index, value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param index the index of the struct buffer
    public long memoryOffsetAt(long index) { return memoryOffset(this.segment(), index); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind memoryOffsetAt(long index, long value) { memoryOffset(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

}
