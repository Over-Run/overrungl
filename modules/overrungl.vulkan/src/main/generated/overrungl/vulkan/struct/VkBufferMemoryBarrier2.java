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

/// Represents `VkBufferMemoryBarrier2`.
/// ## Layout
/// ```
/// struct VkBufferMemoryBarrier2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 srcStageMask;
///     ((uint64_t) VkFlags64) VkAccessFlags2 srcAccessMask;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 dstStageMask;
///     ((uint64_t) VkFlags64) VkAccessFlags2 dstAccessMask;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     (uint64_t) VkBuffer buffer;
///     (uint64_t) VkDeviceSize offset;
///     (uint64_t) VkDeviceSize size;
/// };
/// ```
public final class VkBufferMemoryBarrier2 extends GroupType {
    /// The struct layout of `VkBufferMemoryBarrier2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask"),
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
    /// The byte offset of `srcStageMask`.
    public static final long OFFSET_srcStageMask = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
    /// The memory layout of `srcStageMask`.
    public static final MemoryLayout LAYOUT_srcStageMask = LAYOUT.select(PathElement.groupElement("srcStageMask"));
    /// The [VarHandle] of `srcStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_srcStageMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask")));
    /// The byte offset of `srcAccessMask`.
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    /// The memory layout of `srcAccessMask`.
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_srcAccessMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask")));
    /// The byte offset of `dstStageMask`.
    public static final long OFFSET_dstStageMask = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
    /// The memory layout of `dstStageMask`.
    public static final MemoryLayout LAYOUT_dstStageMask = LAYOUT.select(PathElement.groupElement("dstStageMask"));
    /// The [VarHandle] of `dstStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dstStageMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask")));
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

    /// Creates `VkBufferMemoryBarrier2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBufferMemoryBarrier2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBufferMemoryBarrier2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBufferMemoryBarrier2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferMemoryBarrier2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBufferMemoryBarrier2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferMemoryBarrier2`
    public static VkBufferMemoryBarrier2 alloc(SegmentAllocator allocator) { return new VkBufferMemoryBarrier2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBufferMemoryBarrier2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferMemoryBarrier2`
    public static VkBufferMemoryBarrier2 alloc(SegmentAllocator allocator, long count) { return new VkBufferMemoryBarrier2(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferMemoryBarrier2 copyFrom(VkBufferMemoryBarrier2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBufferMemoryBarrier2 reinterpret(long count) { return new VkBufferMemoryBarrier2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBufferMemoryBarrier2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBufferMemoryBarrier2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcStageMask(MemorySegment segment, long index) { return (long) VH_srcStageMask.get().get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    public long srcStageMask() { return srcStageMask(this.segment(), 0L); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcStageMask(MemorySegment segment, long index, long value) { VH_srcStageMask.get().set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcStageMask(long value) { srcStageMask(this.segment(), 0L, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAccessMask(MemorySegment segment, long index) { return (long) VH_srcAccessMask.get().get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    public long srcAccessMask() { return srcAccessMask(this.segment(), 0L); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccessMask(MemorySegment segment, long index, long value) { VH_srcAccessMask.get().set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcAccessMask(long value) { srcAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstStageMask(MemorySegment segment, long index) { return (long) VH_dstStageMask.get().get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    public long dstStageMask() { return dstStageMask(this.segment(), 0L); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstStageMask(MemorySegment segment, long index, long value) { VH_dstStageMask.get().set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstStageMask(long value) { dstStageMask(this.segment(), 0L, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAccessMask(MemorySegment segment, long index) { return (long) VH_dstAccessMask.get().get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    public long dstAccessMask() { return dstAccessMask(this.segment(), 0L); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccessMask(MemorySegment segment, long index, long value) { VH_dstAccessMask.get().set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstAccessMask(long value) { dstAccessMask(this.segment(), 0L, value); return this; }

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
    public VkBufferMemoryBarrier2 srcQueueFamilyIndex(int value) { srcQueueFamilyIndex(this.segment(), 0L, value); return this; }

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
    public VkBufferMemoryBarrier2 dstQueueFamilyIndex(int value) { dstQueueFamilyIndex(this.segment(), 0L, value); return this; }

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
    public VkBufferMemoryBarrier2 buffer(long value) { buffer(this.segment(), 0L, value); return this; }

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
    public VkBufferMemoryBarrier2 offset(long value) { offset(this.segment(), 0L, value); return this; }

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
    public VkBufferMemoryBarrier2 size(long value) { size(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBufferMemoryBarrier2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBufferMemoryBarrier2`
    public VkBufferMemoryBarrier2 asSlice(long index) { return new VkBufferMemoryBarrier2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBufferMemoryBarrier2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBufferMemoryBarrier2`
    public VkBufferMemoryBarrier2 asSlice(long index, long count) { return new VkBufferMemoryBarrier2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBufferMemoryBarrier2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBufferMemoryBarrier2 at(long index, Consumer<VkBufferMemoryBarrier2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param index the index of the struct buffer
    public long srcStageMaskAt(long index) { return srcStageMask(this.segment(), index); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcStageMaskAt(long index, long value) { srcStageMask(this.segment(), index, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public long srcAccessMaskAt(long index) { return srcAccessMask(this.segment(), index); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcAccessMaskAt(long index, long value) { srcAccessMask(this.segment(), index, value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param index the index of the struct buffer
    public long dstStageMaskAt(long index) { return dstStageMask(this.segment(), index); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstStageMaskAt(long index, long value) { dstStageMask(this.segment(), index, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public long dstAccessMaskAt(long index) { return dstAccessMask(this.segment(), index); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstAccessMaskAt(long index, long value) { dstAccessMask(this.segment(), index, value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int srcQueueFamilyIndexAt(long index) { return srcQueueFamilyIndex(this.segment(), index); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 srcQueueFamilyIndexAt(long index, int value) { srcQueueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int dstQueueFamilyIndexAt(long index) { return dstQueueFamilyIndex(this.segment(), index); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 dstQueueFamilyIndexAt(long index, int value) { dstQueueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `buffer` at the given index}
    /// @param index the index of the struct buffer
    public long bufferAt(long index) { return buffer(this.segment(), index); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 bufferAt(long index, long value) { buffer(this.segment(), index, value); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public long offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 offsetAt(long index, long value) { offset(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferMemoryBarrier2 sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

}
