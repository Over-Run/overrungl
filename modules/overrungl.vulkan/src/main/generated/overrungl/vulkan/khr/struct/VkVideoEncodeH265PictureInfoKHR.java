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

/// Represents `VkVideoEncodeH265PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265PictureInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t naluSliceSegmentEntryCount;
///     const VkVideoEncodeH265NaluSliceSegmentInfoKHR* pNaluSliceSegmentEntries;
///     const StdVideoEncodeH265PictureInfo* pStdPictureInfo;
/// };
/// ```
public final class VkVideoEncodeH265PictureInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceSegmentEntryCount"),
        ValueLayout.ADDRESS.withName("pNaluSliceSegmentEntries"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo")
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
    /// The byte offset of `naluSliceSegmentEntryCount`.
    public static final long OFFSET_naluSliceSegmentEntryCount = LAYOUT.byteOffset(PathElement.groupElement("naluSliceSegmentEntryCount"));
    /// The memory layout of `naluSliceSegmentEntryCount`.
    public static final MemoryLayout LAYOUT_naluSliceSegmentEntryCount = LAYOUT.select(PathElement.groupElement("naluSliceSegmentEntryCount"));
    /// The [VarHandle] of `naluSliceSegmentEntryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_naluSliceSegmentEntryCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("naluSliceSegmentEntryCount")));
    /// The byte offset of `pNaluSliceSegmentEntries`.
    public static final long OFFSET_pNaluSliceSegmentEntries = LAYOUT.byteOffset(PathElement.groupElement("pNaluSliceSegmentEntries"));
    /// The memory layout of `pNaluSliceSegmentEntries`.
    public static final MemoryLayout LAYOUT_pNaluSliceSegmentEntries = LAYOUT.select(PathElement.groupElement("pNaluSliceSegmentEntries"));
    /// The [VarHandle] of `pNaluSliceSegmentEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNaluSliceSegmentEntries = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNaluSliceSegmentEntries")));
    /// The byte offset of `pStdPictureInfo`.
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    /// The memory layout of `pStdPictureInfo`.
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pStdPictureInfo = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo")));

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265PictureInfoKHR`
    public static VkVideoEncodeH265PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265PictureInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265PictureInfoKHR`
    public static VkVideoEncodeH265PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR copyFrom(VkVideoEncodeH265PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265PictureInfoKHR reinterpret(long count) { return new VkVideoEncodeH265PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH265PictureInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265PictureInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `naluSliceSegmentEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int naluSliceSegmentEntryCount(MemorySegment segment, long index) { return (int) VH_naluSliceSegmentEntryCount.get().get(segment, 0L, index); }
    /// {@return `naluSliceSegmentEntryCount`}
    public int naluSliceSegmentEntryCount() { return naluSliceSegmentEntryCount(this.segment(), 0L); }
    /// Sets `naluSliceSegmentEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void naluSliceSegmentEntryCount(MemorySegment segment, long index, int value) { VH_naluSliceSegmentEntryCount.get().set(segment, 0L, index, value); }
    /// Sets `naluSliceSegmentEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR naluSliceSegmentEntryCount(int value) { naluSliceSegmentEntryCount(this.segment(), 0L, value); return this; }

    /// {@return `pNaluSliceSegmentEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNaluSliceSegmentEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pNaluSliceSegmentEntries.get().get(segment, 0L, index); }
    /// {@return `pNaluSliceSegmentEntries`}
    public MemorySegment pNaluSliceSegmentEntries() { return pNaluSliceSegmentEntries(this.segment(), 0L); }
    /// Sets `pNaluSliceSegmentEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNaluSliceSegmentEntries(MemorySegment segment, long index, MemorySegment value) { VH_pNaluSliceSegmentEntries.get().set(segment, 0L, index, value); }
    /// Sets `pNaluSliceSegmentEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntries(MemorySegment value) { pNaluSliceSegmentEntries(this.segment(), 0L, value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdPictureInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pStdPictureInfo.get().get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    public MemorySegment pStdPictureInfo() { return pStdPictureInfo(this.segment(), 0L); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdPictureInfo(MemorySegment segment, long index, MemorySegment value) { VH_pStdPictureInfo.get().set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfo(MemorySegment value) { pStdPictureInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265PictureInfoKHR`
    public VkVideoEncodeH265PictureInfoKHR asSlice(long index) { return new VkVideoEncodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265PictureInfoKHR`
    public VkVideoEncodeH265PictureInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265PictureInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR at(long index, Consumer<VkVideoEncodeH265PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `naluSliceSegmentEntryCount` at the given index}
    /// @param index the index of the struct buffer
    public int naluSliceSegmentEntryCountAt(long index) { return naluSliceSegmentEntryCount(this.segment(), index); }
    /// Sets `naluSliceSegmentEntryCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR naluSliceSegmentEntryCountAt(long index, int value) { naluSliceSegmentEntryCount(this.segment(), index, value); return this; }

    /// {@return `pNaluSliceSegmentEntries` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNaluSliceSegmentEntriesAt(long index) { return pNaluSliceSegmentEntries(this.segment(), index); }
    /// Sets `pNaluSliceSegmentEntries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntriesAt(long index, MemorySegment value) { pNaluSliceSegmentEntries(this.segment(), index, value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdPictureInfoAt(long index) { return pStdPictureInfo(this.segment(), index); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { pStdPictureInfo(this.segment(), index, value); return this; }

}
