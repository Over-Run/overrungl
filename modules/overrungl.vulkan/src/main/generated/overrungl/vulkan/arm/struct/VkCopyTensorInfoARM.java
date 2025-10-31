// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyTensorInfoARM`.
/// ## Layout
/// ```
/// struct VkCopyTensorInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkTensorARM srcTensor;
///     (uint64_t) VkTensorARM dstTensor;
///     uint32_t regionCount;
///     const VkTensorCopyARM* pRegions;
/// };
/// ```
public final class VkCopyTensorInfoARM extends GroupType {
    /// The struct layout of `VkCopyTensorInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcTensor"),
        ValueLayout.JAVA_LONG.withName("dstTensor"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
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
    /// The byte offset of `srcTensor`.
    public static final long OFFSET_srcTensor = LAYOUT.byteOffset(PathElement.groupElement("srcTensor"));
    /// The memory layout of `srcTensor`.
    public static final MemoryLayout LAYOUT_srcTensor = LAYOUT.select(PathElement.groupElement("srcTensor"));
    /// The [VarHandle] of `srcTensor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcTensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcTensor"));
    /// The byte offset of `dstTensor`.
    public static final long OFFSET_dstTensor = LAYOUT.byteOffset(PathElement.groupElement("dstTensor"));
    /// The memory layout of `dstTensor`.
    public static final MemoryLayout LAYOUT_dstTensor = LAYOUT.select(PathElement.groupElement("dstTensor"));
    /// The [VarHandle] of `dstTensor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstTensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstTensor"));
    /// The byte offset of `regionCount`.
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    /// The memory layout of `regionCount`.
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The byte offset of `pRegions`.
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    /// The memory layout of `pRegions`.
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkCopyTensorInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCopyTensorInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCopyTensorInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyTensorInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyTensorInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyTensorInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyTensorInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyTensorInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCopyTensorInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyTensorInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyTensorInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyTensorInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyTensorInfoARM`
    public static VkCopyTensorInfoARM alloc(SegmentAllocator allocator) { return new VkCopyTensorInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCopyTensorInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyTensorInfoARM`
    public static VkCopyTensorInfoARM alloc(SegmentAllocator allocator, long count) { return new VkCopyTensorInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyTensorInfoARM copyFrom(VkCopyTensorInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCopyTensorInfoARM reinterpret(long count) { return new VkCopyTensorInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCopyTensorInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCopyTensorInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcTensor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcTensor(MemorySegment segment, long index) { return (long) VH_srcTensor.get(segment, 0L, index); }
    /// {@return `srcTensor`}
    public long srcTensor() { return srcTensor(this.segment(), 0L); }
    /// Sets `srcTensor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcTensor(MemorySegment segment, long index, long value) { VH_srcTensor.set(segment, 0L, index, value); }
    /// Sets `srcTensor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM srcTensor(long value) { srcTensor(this.segment(), 0L, value); return this; }

    /// {@return `dstTensor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstTensor(MemorySegment segment, long index) { return (long) VH_dstTensor.get(segment, 0L, index); }
    /// {@return `dstTensor`}
    public long dstTensor() { return dstTensor(this.segment(), 0L); }
    /// Sets `dstTensor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstTensor(MemorySegment segment, long index, long value) { VH_dstTensor.set(segment, 0L, index, value); }
    /// Sets `dstTensor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM dstTensor(long value) { dstTensor(this.segment(), 0L, value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    public int regionCount() { return regionCount(this.segment(), 0L); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void regionCount(MemorySegment segment, long index, int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM regionCount(int value) { regionCount(this.segment(), 0L, value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    public MemorySegment pRegions() { return pRegions(this.segment(), 0L); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRegions(MemorySegment segment, long index, MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM pRegions(MemorySegment value) { pRegions(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCopyTensorInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyTensorInfoARM`
    public VkCopyTensorInfoARM asSlice(long index) { return new VkCopyTensorInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCopyTensorInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyTensorInfoARM`
    public VkCopyTensorInfoARM asSlice(long index, long count) { return new VkCopyTensorInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCopyTensorInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCopyTensorInfoARM at(long index, Consumer<VkCopyTensorInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcTensor` at the given index}
    /// @param index the index of the struct buffer
    public long srcTensorAt(long index) { return srcTensor(this.segment(), index); }
    /// Sets `srcTensor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM srcTensorAt(long index, long value) { srcTensor(this.segment(), index, value); return this; }

    /// {@return `dstTensor` at the given index}
    /// @param index the index of the struct buffer
    public long dstTensorAt(long index) { return dstTensor(this.segment(), index); }
    /// Sets `dstTensor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM dstTensorAt(long index, long value) { dstTensor(this.segment(), index, value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param index the index of the struct buffer
    public int regionCountAt(long index) { return regionCount(this.segment(), index); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM regionCountAt(long index, int value) { regionCount(this.segment(), index, value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRegionsAt(long index) { return pRegions(this.segment(), index); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyTensorInfoARM pRegionsAt(long index, MemorySegment value) { pRegions(this.segment(), index, value); return this; }

}
