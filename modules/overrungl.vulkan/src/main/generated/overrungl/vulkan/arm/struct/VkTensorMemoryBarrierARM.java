// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorMemoryBarrierARM`.
/// ## Layout
/// ```
/// struct VkTensorMemoryBarrierARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 srcStageMask;
///     ((uint64_t) VkFlags64) VkAccessFlags2 srcAccessMask;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 dstStageMask;
///     ((uint64_t) VkFlags64) VkAccessFlags2 dstAccessMask;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     (uint64_t) VkTensorARM tensor;
/// };
/// ```
public final class VkTensorMemoryBarrierARM extends GroupType {
    /// The struct layout of `VkTensorMemoryBarrierARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.JAVA_LONG.withName("tensor")
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
    /// The byte offset of `srcStageMask`.
    public static final long OFFSET_srcStageMask = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
    /// The memory layout of `srcStageMask`.
    public static final MemoryLayout LAYOUT_srcStageMask = LAYOUT.select(PathElement.groupElement("srcStageMask"));
    /// The [VarHandle] of `srcStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    /// The byte offset of `srcAccessMask`.
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    /// The memory layout of `srcAccessMask`.
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The byte offset of `dstStageMask`.
    public static final long OFFSET_dstStageMask = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
    /// The memory layout of `dstStageMask`.
    public static final MemoryLayout LAYOUT_dstStageMask = LAYOUT.select(PathElement.groupElement("dstStageMask"));
    /// The [VarHandle] of `dstStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    /// The byte offset of `dstAccessMask`.
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    /// The memory layout of `dstAccessMask`.
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    /// The byte offset of `srcQueueFamilyIndex`.
    public static final long OFFSET_srcQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The memory layout of `srcQueueFamilyIndex`.
    public static final MemoryLayout LAYOUT_srcQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The [VarHandle] of `srcQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The byte offset of `dstQueueFamilyIndex`.
    public static final long OFFSET_dstQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The memory layout of `dstQueueFamilyIndex`.
    public static final MemoryLayout LAYOUT_dstQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The [VarHandle] of `dstQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The byte offset of `tensor`.
    public static final long OFFSET_tensor = LAYOUT.byteOffset(PathElement.groupElement("tensor"));
    /// The memory layout of `tensor`.
    public static final MemoryLayout LAYOUT_tensor = LAYOUT.select(PathElement.groupElement("tensor"));
    /// The [VarHandle] of `tensor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensor"));

    /// Creates `VkTensorMemoryBarrierARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTensorMemoryBarrierARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTensorMemoryBarrierARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorMemoryBarrierARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryBarrierARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTensorMemoryBarrierARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorMemoryBarrierARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryBarrierARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTensorMemoryBarrierARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorMemoryBarrierARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryBarrierARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTensorMemoryBarrierARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTensorMemoryBarrierARM`
    public static VkTensorMemoryBarrierARM alloc(SegmentAllocator allocator) { return new VkTensorMemoryBarrierARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTensorMemoryBarrierARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTensorMemoryBarrierARM`
    public static VkTensorMemoryBarrierARM alloc(SegmentAllocator allocator, long count) { return new VkTensorMemoryBarrierARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTensorMemoryBarrierARM copyFrom(VkTensorMemoryBarrierARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTensorMemoryBarrierARM reinterpret(long count) { return new VkTensorMemoryBarrierARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkTensorMemoryBarrierARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTensorMemoryBarrierARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcStageMask(MemorySegment segment, long index) { return (long) VH_srcStageMask.get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    public long srcStageMask() { return srcStageMask(this.segment(), 0L); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcStageMask(MemorySegment segment, long index, long value) { VH_srcStageMask.set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM srcStageMask(long value) { srcStageMask(this.segment(), 0L, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAccessMask(MemorySegment segment, long index) { return (long) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    public long srcAccessMask() { return srcAccessMask(this.segment(), 0L); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccessMask(MemorySegment segment, long index, long value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM srcAccessMask(long value) { srcAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstStageMask(MemorySegment segment, long index) { return (long) VH_dstStageMask.get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    public long dstStageMask() { return dstStageMask(this.segment(), 0L); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstStageMask(MemorySegment segment, long index, long value) { VH_dstStageMask.set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM dstStageMask(long value) { dstStageMask(this.segment(), 0L, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAccessMask(MemorySegment segment, long index) { return (long) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    public long dstAccessMask() { return dstAccessMask(this.segment(), 0L); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccessMask(MemorySegment segment, long index, long value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM dstAccessMask(long value) { dstAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_srcQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `srcQueueFamilyIndex`}
    public int srcQueueFamilyIndex() { return srcQueueFamilyIndex(this.segment(), 0L); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcQueueFamilyIndex(MemorySegment segment, long index, int value) { VH_srcQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM srcQueueFamilyIndex(int value) { srcQueueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_dstQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `dstQueueFamilyIndex`}
    public int dstQueueFamilyIndex() { return dstQueueFamilyIndex(this.segment(), 0L); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstQueueFamilyIndex(MemorySegment segment, long index, int value) { VH_dstQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM dstQueueFamilyIndex(int value) { dstQueueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `tensor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long tensor(MemorySegment segment, long index) { return (long) VH_tensor.get(segment, 0L, index); }
    /// {@return `tensor`}
    public long tensor() { return tensor(this.segment(), 0L); }
    /// Sets `tensor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensor(MemorySegment segment, long index, long value) { VH_tensor.set(segment, 0L, index, value); }
    /// Sets `tensor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM tensor(long value) { tensor(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTensorMemoryBarrierARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTensorMemoryBarrierARM`
    public VkTensorMemoryBarrierARM asSlice(long index) { return new VkTensorMemoryBarrierARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTensorMemoryBarrierARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTensorMemoryBarrierARM`
    public VkTensorMemoryBarrierARM asSlice(long index, long count) { return new VkTensorMemoryBarrierARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTensorMemoryBarrierARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTensorMemoryBarrierARM at(long index, Consumer<VkTensorMemoryBarrierARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param index the index of the struct buffer
    public long srcStageMaskAt(long index) { return srcStageMask(this.segment(), index); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM srcStageMaskAt(long index, long value) { srcStageMask(this.segment(), index, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public long srcAccessMaskAt(long index) { return srcAccessMask(this.segment(), index); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM srcAccessMaskAt(long index, long value) { srcAccessMask(this.segment(), index, value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param index the index of the struct buffer
    public long dstStageMaskAt(long index) { return dstStageMask(this.segment(), index); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM dstStageMaskAt(long index, long value) { dstStageMask(this.segment(), index, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public long dstAccessMaskAt(long index) { return dstAccessMask(this.segment(), index); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM dstAccessMaskAt(long index, long value) { dstAccessMask(this.segment(), index, value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int srcQueueFamilyIndexAt(long index) { return srcQueueFamilyIndex(this.segment(), index); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM srcQueueFamilyIndexAt(long index, int value) { srcQueueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int dstQueueFamilyIndexAt(long index) { return dstQueueFamilyIndex(this.segment(), index); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM dstQueueFamilyIndexAt(long index, int value) { dstQueueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `tensor` at the given index}
    /// @param index the index of the struct buffer
    public long tensorAt(long index) { return tensor(this.segment(), index); }
    /// Sets `tensor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorMemoryBarrierARM tensorAt(long index, long value) { tensor(this.segment(), index, value); return this; }

}
