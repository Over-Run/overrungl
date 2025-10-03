// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH265DpbSlotInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH265DpbSlotInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeH265ReferenceInfo* pStdReferenceInfo;
/// };
/// ```
public final class VkVideoDecodeH265DpbSlotInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeH265DpbSlotInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdReferenceInfo")
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
    /// The byte offset of `pStdReferenceInfo`.
    public static final long OFFSET_pStdReferenceInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdReferenceInfo"));
    /// The memory layout of `pStdReferenceInfo`.
    public static final MemoryLayout LAYOUT_pStdReferenceInfo = LAYOUT.select(PathElement.groupElement("pStdReferenceInfo"));
    /// The [VarHandle] of `pStdReferenceInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdReferenceInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdReferenceInfo"));

    /// Creates `VkVideoDecodeH265DpbSlotInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoDecodeH265DpbSlotInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoDecodeH265DpbSlotInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265DpbSlotInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265DpbSlotInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH265DpbSlotInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265DpbSlotInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265DpbSlotInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoDecodeH265DpbSlotInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265DpbSlotInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265DpbSlotInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeH265DpbSlotInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265DpbSlotInfoKHR`
    public static VkVideoDecodeH265DpbSlotInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265DpbSlotInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoDecodeH265DpbSlotInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH265DpbSlotInfoKHR`
    public static VkVideoDecodeH265DpbSlotInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265DpbSlotInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH265DpbSlotInfoKHR copyFrom(VkVideoDecodeH265DpbSlotInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoDecodeH265DpbSlotInfoKHR reinterpret(long count) { return new VkVideoDecodeH265DpbSlotInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoDecodeH265DpbSlotInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH265DpbSlotInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pStdReferenceInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdReferenceInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pStdReferenceInfo.get(segment, 0L, index); }
    /// {@return `pStdReferenceInfo`}
    public MemorySegment pStdReferenceInfo() { return pStdReferenceInfo(this.segment(), 0L); }
    /// Sets `pStdReferenceInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdReferenceInfo(MemorySegment segment, long index, MemorySegment value) { VH_pStdReferenceInfo.set(segment, 0L, index, value); }
    /// Sets `pStdReferenceInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265DpbSlotInfoKHR pStdReferenceInfo(MemorySegment value) { pStdReferenceInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoDecodeH265DpbSlotInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeH265DpbSlotInfoKHR`
    public VkVideoDecodeH265DpbSlotInfoKHR asSlice(long index) { return new VkVideoDecodeH265DpbSlotInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoDecodeH265DpbSlotInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeH265DpbSlotInfoKHR`
    public VkVideoDecodeH265DpbSlotInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH265DpbSlotInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoDecodeH265DpbSlotInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoDecodeH265DpbSlotInfoKHR at(long index, Consumer<VkVideoDecodeH265DpbSlotInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265DpbSlotInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265DpbSlotInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pStdReferenceInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdReferenceInfoAt(long index) { return pStdReferenceInfo(this.segment(), index); }
    /// Sets `pStdReferenceInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265DpbSlotInfoKHR pStdReferenceInfoAt(long index, MemorySegment value) { pStdReferenceInfo(this.segment(), index, value); return this; }

}
