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

/// Represents `VkVideoDecodeH265PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH265PictureInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeH265PictureInfo* pStdPictureInfo;
///     uint32_t sliceSegmentCount;
///     const uint32_t* pSliceSegmentOffsets;
/// };
/// ```
public final class VkVideoDecodeH265PictureInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeH265PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("sliceSegmentCount"),
        ValueLayout.ADDRESS.withName("pSliceSegmentOffsets")
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
    /// The byte offset of `pStdPictureInfo`.
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    /// The memory layout of `pStdPictureInfo`.
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pStdPictureInfo = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo")));
    /// The byte offset of `sliceSegmentCount`.
    public static final long OFFSET_sliceSegmentCount = LAYOUT.byteOffset(PathElement.groupElement("sliceSegmentCount"));
    /// The memory layout of `sliceSegmentCount`.
    public static final MemoryLayout LAYOUT_sliceSegmentCount = LAYOUT.select(PathElement.groupElement("sliceSegmentCount"));
    /// The [VarHandle] of `sliceSegmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sliceSegmentCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceSegmentCount")));
    /// The byte offset of `pSliceSegmentOffsets`.
    public static final long OFFSET_pSliceSegmentOffsets = LAYOUT.byteOffset(PathElement.groupElement("pSliceSegmentOffsets"));
    /// The memory layout of `pSliceSegmentOffsets`.
    public static final MemoryLayout LAYOUT_pSliceSegmentOffsets = LAYOUT.select(PathElement.groupElement("pSliceSegmentOffsets"));
    /// The [VarHandle] of `pSliceSegmentOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pSliceSegmentOffsets = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSliceSegmentOffsets")));

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoDecodeH265PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoDecodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeH265PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265PictureInfoKHR`
    public static VkVideoDecodeH265PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265PictureInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoDecodeH265PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH265PictureInfoKHR`
    public static VkVideoDecodeH265PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR copyFrom(VkVideoDecodeH265PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoDecodeH265PictureInfoKHR reinterpret(long count) { return new VkVideoDecodeH265PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoDecodeH265PictureInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH265PictureInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH265PictureInfoKHR pStdPictureInfo(MemorySegment value) { pStdPictureInfo(this.segment(), 0L, value); return this; }

    /// {@return `sliceSegmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sliceSegmentCount(MemorySegment segment, long index) { return (int) VH_sliceSegmentCount.get().get(segment, 0L, index); }
    /// {@return `sliceSegmentCount`}
    public int sliceSegmentCount() { return sliceSegmentCount(this.segment(), 0L); }
    /// Sets `sliceSegmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sliceSegmentCount(MemorySegment segment, long index, int value) { VH_sliceSegmentCount.get().set(segment, 0L, index, value); }
    /// Sets `sliceSegmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR sliceSegmentCount(int value) { sliceSegmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pSliceSegmentOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSliceSegmentOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pSliceSegmentOffsets.get().get(segment, 0L, index); }
    /// {@return `pSliceSegmentOffsets`}
    public MemorySegment pSliceSegmentOffsets() { return pSliceSegmentOffsets(this.segment(), 0L); }
    /// Sets `pSliceSegmentOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSliceSegmentOffsets(MemorySegment segment, long index, MemorySegment value) { VH_pSliceSegmentOffsets.get().set(segment, 0L, index, value); }
    /// Sets `pSliceSegmentOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR pSliceSegmentOffsets(MemorySegment value) { pSliceSegmentOffsets(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoDecodeH265PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeH265PictureInfoKHR`
    public VkVideoDecodeH265PictureInfoKHR asSlice(long index) { return new VkVideoDecodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoDecodeH265PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeH265PictureInfoKHR`
    public VkVideoDecodeH265PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoDecodeH265PictureInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR at(long index, Consumer<VkVideoDecodeH265PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdPictureInfoAt(long index) { return pStdPictureInfo(this.segment(), index); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { pStdPictureInfo(this.segment(), index, value); return this; }

    /// {@return `sliceSegmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int sliceSegmentCountAt(long index) { return sliceSegmentCount(this.segment(), index); }
    /// Sets `sliceSegmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR sliceSegmentCountAt(long index, int value) { sliceSegmentCount(this.segment(), index, value); return this; }

    /// {@return `pSliceSegmentOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSliceSegmentOffsetsAt(long index) { return pSliceSegmentOffsets(this.segment(), index); }
    /// Sets `pSliceSegmentOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265PictureInfoKHR pSliceSegmentOffsetsAt(long index, MemorySegment value) { pSliceSegmentOffsets(this.segment(), index, value); return this; }

}
