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

/// Represents `VkBufferMemoryBarrier`.
/// ## Layout
/// ```
/// struct VkBufferMemoryBarrier {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkAccessFlags srcAccessMask;
///     ((uint32_t) VkFlags) VkAccessFlags dstAccessMask;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     (uint64_t) VkBuffer buffer;
///     (uint64_t) VkDeviceSize offset;
///     (uint64_t) VkDeviceSize size;
/// };
/// ```
public final class VkBufferMemoryBarrier extends GroupType {
    /// The struct layout of `VkBufferMemoryBarrier`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `srcAccessMask`.
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    /// The memory layout of `srcAccessMask`.
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_srcAccessMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask")));
    /// The byte offset of `dstAccessMask`.
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    /// The memory layout of `dstAccessMask`.
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dstAccessMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask")));
    /// The byte offset of `srcQueueFamilyIndex`.
    public static final long OFFSET_srcQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The memory layout of `srcQueueFamilyIndex`.
    public static final MemoryLayout LAYOUT_srcQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The [VarHandle] of `srcQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_srcQueueFamilyIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex")));
    /// The byte offset of `dstQueueFamilyIndex`.
    public static final long OFFSET_dstQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The memory layout of `dstQueueFamilyIndex`.
    public static final MemoryLayout LAYOUT_dstQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The [VarHandle] of `dstQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dstQueueFamilyIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex")));
    /// The byte offset of `buffer`.
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    /// The memory layout of `buffer`.
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_buffer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer")));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_offset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset")));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_size = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("size")));

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBufferMemoryBarrier(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBufferMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBufferMemoryBarrier` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferMemoryBarrier`
    public static VkBufferMemoryBarrier alloc(SegmentAllocator allocator) { return new VkBufferMemoryBarrier(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBufferMemoryBarrier` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferMemoryBarrier`
    public static VkBufferMemoryBarrier alloc(SegmentAllocator allocator, long count) { return new VkBufferMemoryBarrier(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferMemoryBarrier copyFrom(VkBufferMemoryBarrier src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBufferMemoryBarrier reinterpret(long count) { return new VkBufferMemoryBarrier(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcAccessMask(MemorySegment segment, long index) { return (int) VH_srcAccessMask.get().get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    public int srcAccessMask() { return srcAccessMask(this.segment(), 0L); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccessMask(MemorySegment segment, long index, int value) { VH_srcAccessMask.get().set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier srcAccessMask(int value) { srcAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstAccessMask(MemorySegment segment, long index) { return (int) VH_dstAccessMask.get().get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    public int dstAccessMask() { return dstAccessMask(this.segment(), 0L); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccessMask(MemorySegment segment, long index, int value) { VH_dstAccessMask.get().set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier dstAccessMask(int value) { dstAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_srcQueueFamilyIndex.get().get(segment, 0L, index); }
    /// {@return `srcQueueFamilyIndex`}
    public int srcQueueFamilyIndex() { return srcQueueFamilyIndex(this.segment(), 0L); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcQueueFamilyIndex(MemorySegment segment, long index, int value) { VH_srcQueueFamilyIndex.get().set(segment, 0L, index, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier srcQueueFamilyIndex(int value) { srcQueueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_dstQueueFamilyIndex.get().get(segment, 0L, index); }
    /// {@return `dstQueueFamilyIndex`}
    public int dstQueueFamilyIndex() { return dstQueueFamilyIndex(this.segment(), 0L); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstQueueFamilyIndex(MemorySegment segment, long index, int value) { VH_dstQueueFamilyIndex.get().set(segment, 0L, index, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier dstQueueFamilyIndex(int value) { dstQueueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long buffer(MemorySegment segment, long index) { return (long) VH_buffer.get().get(segment, 0L, index); }
    /// {@return `buffer`}
    public long buffer() { return buffer(this.segment(), 0L); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void buffer(MemorySegment segment, long index, long value) { VH_buffer.get().set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier buffer(long value) { buffer(this.segment(), 0L, value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long offset(MemorySegment segment, long index) { return (long) VH_offset.get().get(segment, 0L, index); }
    /// {@return `offset`}
    public long offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, long value) { VH_offset.get().set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier offset(long value) { offset(this.segment(), 0L, value); return this; }

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
    public VkBufferMemoryBarrier size(long value) { size(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBufferMemoryBarrier`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBufferMemoryBarrier`
    public VkBufferMemoryBarrier asSlice(long index) { return new VkBufferMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBufferMemoryBarrier`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBufferMemoryBarrier`
    public VkBufferMemoryBarrier asSlice(long index, long count) { return new VkBufferMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBufferMemoryBarrier` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBufferMemoryBarrier at(long index, Consumer<VkBufferMemoryBarrier> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public int srcAccessMaskAt(long index) { return srcAccessMask(this.segment(), index); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier srcAccessMaskAt(long index, int value) { srcAccessMask(this.segment(), index, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public int dstAccessMaskAt(long index) { return dstAccessMask(this.segment(), index); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier dstAccessMaskAt(long index, int value) { dstAccessMask(this.segment(), index, value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int srcQueueFamilyIndexAt(long index) { return srcQueueFamilyIndex(this.segment(), index); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier srcQueueFamilyIndexAt(long index, int value) { srcQueueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int dstQueueFamilyIndexAt(long index) { return dstQueueFamilyIndex(this.segment(), index); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier dstQueueFamilyIndexAt(long index, int value) { dstQueueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `buffer` at the given index}
    /// @param index the index of the struct buffer
    public long bufferAt(long index) { return buffer(this.segment(), index); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier bufferAt(long index, long value) { buffer(this.segment(), index, value); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public long offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier offsetAt(long index, long value) { offset(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

}
