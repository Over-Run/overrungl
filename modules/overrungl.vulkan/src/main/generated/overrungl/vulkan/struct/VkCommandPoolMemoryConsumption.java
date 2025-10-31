// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCommandPoolMemoryConsumption`.
/// ## Layout
/// ```
/// struct VkCommandPoolMemoryConsumption {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize commandPoolAllocated;
///     (uint64_t) VkDeviceSize commandPoolReservedSize;
///     (uint64_t) VkDeviceSize commandBufferAllocated;
/// };
/// ```
public final class VkCommandPoolMemoryConsumption extends GroupType {
    /// The struct layout of `VkCommandPoolMemoryConsumption`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("commandPoolAllocated"),
        ValueLayout.JAVA_LONG.withName("commandPoolReservedSize"),
        ValueLayout.JAVA_LONG.withName("commandBufferAllocated")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `commandPoolAllocated`.
    public static final long OFFSET_commandPoolAllocated = LAYOUT.byteOffset(PathElement.groupElement("commandPoolAllocated"));
    /// The memory layout of `commandPoolAllocated`.
    public static final MemoryLayout LAYOUT_commandPoolAllocated = LAYOUT.select(PathElement.groupElement("commandPoolAllocated"));
    /// The [VarHandle] of `commandPoolAllocated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandPoolAllocated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolAllocated"));
    /// The byte offset of `commandPoolReservedSize`.
    public static final long OFFSET_commandPoolReservedSize = LAYOUT.byteOffset(PathElement.groupElement("commandPoolReservedSize"));
    /// The memory layout of `commandPoolReservedSize`.
    public static final MemoryLayout LAYOUT_commandPoolReservedSize = LAYOUT.select(PathElement.groupElement("commandPoolReservedSize"));
    /// The [VarHandle] of `commandPoolReservedSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandPoolReservedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolReservedSize"));
    /// The byte offset of `commandBufferAllocated`.
    public static final long OFFSET_commandBufferAllocated = LAYOUT.byteOffset(PathElement.groupElement("commandBufferAllocated"));
    /// The memory layout of `commandBufferAllocated`.
    public static final MemoryLayout LAYOUT_commandBufferAllocated = LAYOUT.select(PathElement.groupElement("commandBufferAllocated"));
    /// The [VarHandle] of `commandBufferAllocated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBufferAllocated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferAllocated"));

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCommandPoolMemoryConsumption(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryConsumption of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolMemoryConsumption(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryConsumption ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolMemoryConsumption(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCommandPoolMemoryConsumption` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryConsumption ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolMemoryConsumption(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCommandPoolMemoryConsumption` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandPoolMemoryConsumption`
    public static VkCommandPoolMemoryConsumption alloc(SegmentAllocator allocator) { return new VkCommandPoolMemoryConsumption(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCommandPoolMemoryConsumption` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandPoolMemoryConsumption`
    public static VkCommandPoolMemoryConsumption alloc(SegmentAllocator allocator, long count) { return new VkCommandPoolMemoryConsumption(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandPoolMemoryConsumption copyFrom(VkCommandPoolMemoryConsumption src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCommandPoolMemoryConsumption reinterpret(long count) { return new VkCommandPoolMemoryConsumption(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `commandPoolAllocated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long commandPoolAllocated(MemorySegment segment, long index) { return (long) VH_commandPoolAllocated.get(segment, 0L, index); }
    /// {@return `commandPoolAllocated`}
    public long commandPoolAllocated() { return commandPoolAllocated(this.segment(), 0L); }
    /// Sets `commandPoolAllocated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandPoolAllocated(MemorySegment segment, long index, long value) { VH_commandPoolAllocated.set(segment, 0L, index, value); }
    /// Sets `commandPoolAllocated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandPoolAllocated(long value) { commandPoolAllocated(this.segment(), 0L, value); return this; }

    /// {@return `commandPoolReservedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long commandPoolReservedSize(MemorySegment segment, long index) { return (long) VH_commandPoolReservedSize.get(segment, 0L, index); }
    /// {@return `commandPoolReservedSize`}
    public long commandPoolReservedSize() { return commandPoolReservedSize(this.segment(), 0L); }
    /// Sets `commandPoolReservedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandPoolReservedSize(MemorySegment segment, long index, long value) { VH_commandPoolReservedSize.set(segment, 0L, index, value); }
    /// Sets `commandPoolReservedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandPoolReservedSize(long value) { commandPoolReservedSize(this.segment(), 0L, value); return this; }

    /// {@return `commandBufferAllocated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long commandBufferAllocated(MemorySegment segment, long index) { return (long) VH_commandBufferAllocated.get(segment, 0L, index); }
    /// {@return `commandBufferAllocated`}
    public long commandBufferAllocated() { return commandBufferAllocated(this.segment(), 0L); }
    /// Sets `commandBufferAllocated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandBufferAllocated(MemorySegment segment, long index, long value) { VH_commandBufferAllocated.set(segment, 0L, index, value); }
    /// Sets `commandBufferAllocated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandBufferAllocated(long value) { commandBufferAllocated(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCommandPoolMemoryConsumption`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCommandPoolMemoryConsumption`
    public VkCommandPoolMemoryConsumption asSlice(long index) { return new VkCommandPoolMemoryConsumption(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCommandPoolMemoryConsumption`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCommandPoolMemoryConsumption`
    public VkCommandPoolMemoryConsumption asSlice(long index, long count) { return new VkCommandPoolMemoryConsumption(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCommandPoolMemoryConsumption` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCommandPoolMemoryConsumption at(long index, Consumer<VkCommandPoolMemoryConsumption> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `commandPoolAllocated` at the given index}
    /// @param index the index of the struct buffer
    public long commandPoolAllocatedAt(long index) { return commandPoolAllocated(this.segment(), index); }
    /// Sets `commandPoolAllocated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandPoolAllocatedAt(long index, long value) { commandPoolAllocated(this.segment(), index, value); return this; }

    /// {@return `commandPoolReservedSize` at the given index}
    /// @param index the index of the struct buffer
    public long commandPoolReservedSizeAt(long index) { return commandPoolReservedSize(this.segment(), index); }
    /// Sets `commandPoolReservedSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandPoolReservedSizeAt(long index, long value) { commandPoolReservedSize(this.segment(), index, value); return this; }

    /// {@return `commandBufferAllocated` at the given index}
    /// @param index the index of the struct buffer
    public long commandBufferAllocatedAt(long index) { return commandBufferAllocated(this.segment(), index); }
    /// Sets `commandBufferAllocated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryConsumption commandBufferAllocatedAt(long index, long value) { commandBufferAllocated(this.segment(), index, value); return this; }

}
