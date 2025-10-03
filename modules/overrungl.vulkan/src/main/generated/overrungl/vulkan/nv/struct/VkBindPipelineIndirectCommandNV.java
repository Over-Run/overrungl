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

/// Represents `VkBindPipelineIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkBindPipelineIndirectCommandNV {
///     (uint64_t) VkDeviceAddress pipelineAddress;
/// };
/// ```
public final class VkBindPipelineIndirectCommandNV extends GroupType {
    /// The struct layout of `VkBindPipelineIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("pipelineAddress")
    );
    /// The byte offset of `pipelineAddress`.
    public static final long OFFSET_pipelineAddress = LAYOUT.byteOffset(PathElement.groupElement("pipelineAddress"));
    /// The memory layout of `pipelineAddress`.
    public static final MemoryLayout LAYOUT_pipelineAddress = LAYOUT.select(PathElement.groupElement("pipelineAddress"));
    /// The [VarHandle] of `pipelineAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pipelineAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineAddress")));

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindPipelineIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindPipelineIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindPipelineIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindPipelineIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindPipelineIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindPipelineIndirectCommandNV`
    public static VkBindPipelineIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindPipelineIndirectCommandNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindPipelineIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindPipelineIndirectCommandNV`
    public static VkBindPipelineIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBindPipelineIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindPipelineIndirectCommandNV copyFrom(VkBindPipelineIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindPipelineIndirectCommandNV reinterpret(long count) { return new VkBindPipelineIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pipelineAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipelineAddress(MemorySegment segment, long index) { return (long) VH_pipelineAddress.get().get(segment, 0L, index); }
    /// {@return `pipelineAddress`}
    public long pipelineAddress() { return pipelineAddress(this.segment(), 0L); }
    /// Sets `pipelineAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineAddress(MemorySegment segment, long index, long value) { VH_pipelineAddress.get().set(segment, 0L, index, value); }
    /// Sets `pipelineAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindPipelineIndirectCommandNV pipelineAddress(long value) { pipelineAddress(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindPipelineIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindPipelineIndirectCommandNV`
    public VkBindPipelineIndirectCommandNV asSlice(long index) { return new VkBindPipelineIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindPipelineIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindPipelineIndirectCommandNV`
    public VkBindPipelineIndirectCommandNV asSlice(long index, long count) { return new VkBindPipelineIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindPipelineIndirectCommandNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindPipelineIndirectCommandNV at(long index, Consumer<VkBindPipelineIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pipelineAddress` at the given index}
    /// @param index the index of the struct buffer
    public long pipelineAddressAt(long index) { return pipelineAddress(this.segment(), index); }
    /// Sets `pipelineAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindPipelineIndirectCommandNV pipelineAddressAt(long index, long value) { pipelineAddress(this.segment(), index, value); return this; }

}
