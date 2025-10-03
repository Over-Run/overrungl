// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindVertexBufferIndirectCommandEXT`.
/// ## Layout
/// ```
/// struct VkBindVertexBufferIndirectCommandEXT {
///     (uint64_t) VkDeviceAddress bufferAddress;
///     uint32_t size;
///     uint32_t stride;
/// };
/// ```
public final class VkBindVertexBufferIndirectCommandEXT extends GroupType {
    /// The struct layout of `VkBindVertexBufferIndirectCommandEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("stride")
    );
    /// The byte offset of `bufferAddress`.
    public static final long OFFSET_bufferAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
    /// The memory layout of `bufferAddress`.
    public static final MemoryLayout LAYOUT_bufferAddress = LAYOUT.select(PathElement.groupElement("bufferAddress"));
    /// The [VarHandle] of `bufferAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    /// Creates `VkBindVertexBufferIndirectCommandEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindVertexBufferIndirectCommandEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindVertexBufferIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVertexBufferIndirectCommandEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindVertexBufferIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVertexBufferIndirectCommandEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindVertexBufferIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindVertexBufferIndirectCommandEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindVertexBufferIndirectCommandEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindVertexBufferIndirectCommandEXT`
    public static VkBindVertexBufferIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkBindVertexBufferIndirectCommandEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindVertexBufferIndirectCommandEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindVertexBufferIndirectCommandEXT`
    public static VkBindVertexBufferIndirectCommandEXT alloc(SegmentAllocator allocator, long count) { return new VkBindVertexBufferIndirectCommandEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindVertexBufferIndirectCommandEXT copyFrom(VkBindVertexBufferIndirectCommandEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindVertexBufferIndirectCommandEXT reinterpret(long count) { return new VkBindVertexBufferIndirectCommandEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `bufferAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferAddress(MemorySegment segment, long index) { return (long) VH_bufferAddress.get(segment, 0L, index); }
    /// {@return `bufferAddress`}
    public long bufferAddress() { return bufferAddress(this.segment(), 0L); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferAddress(MemorySegment segment, long index, long value) { VH_bufferAddress.set(segment, 0L, index, value); }
    /// Sets `bufferAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandEXT bufferAddress(long value) { bufferAddress(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public int size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandEXT size(int value) { size(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    public int stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandEXT stride(int value) { stride(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindVertexBufferIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindVertexBufferIndirectCommandEXT`
    public VkBindVertexBufferIndirectCommandEXT asSlice(long index) { return new VkBindVertexBufferIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindVertexBufferIndirectCommandEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindVertexBufferIndirectCommandEXT`
    public VkBindVertexBufferIndirectCommandEXT asSlice(long index, long count) { return new VkBindVertexBufferIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindVertexBufferIndirectCommandEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindVertexBufferIndirectCommandEXT at(long index, Consumer<VkBindVertexBufferIndirectCommandEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `bufferAddress` at the given index}
    /// @param index the index of the struct buffer
    public long bufferAddressAt(long index) { return bufferAddress(this.segment(), index); }
    /// Sets `bufferAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandEXT bufferAddressAt(long index, long value) { bufferAddress(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public int sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandEXT sizeAt(long index, int value) { size(this.segment(), index, value); return this; }

    /// {@return `stride` at the given index}
    /// @param index the index of the struct buffer
    public int strideAt(long index) { return stride(this.segment(), index); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindVertexBufferIndirectCommandEXT strideAt(long index, int value) { stride(this.segment(), index, value); return this; }

}
