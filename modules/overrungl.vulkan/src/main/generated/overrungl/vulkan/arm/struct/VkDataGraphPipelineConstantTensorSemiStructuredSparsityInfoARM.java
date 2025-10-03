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

/// Represents `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t dimension;
///     uint32_t zeroCount;
///     uint32_t groupSize;
/// };
/// ```
public final class VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dimension"),
        ValueLayout.JAVA_INT.withName("zeroCount"),
        ValueLayout.JAVA_INT.withName("groupSize")
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
    /// The byte offset of `dimension`.
    public static final long OFFSET_dimension = LAYOUT.byteOffset(PathElement.groupElement("dimension"));
    /// The memory layout of `dimension`.
    public static final MemoryLayout LAYOUT_dimension = LAYOUT.select(PathElement.groupElement("dimension"));
    /// The [VarHandle] of `dimension` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dimension = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dimension")));
    /// The byte offset of `zeroCount`.
    public static final long OFFSET_zeroCount = LAYOUT.byteOffset(PathElement.groupElement("zeroCount"));
    /// The memory layout of `zeroCount`.
    public static final MemoryLayout LAYOUT_zeroCount = LAYOUT.select(PathElement.groupElement("zeroCount"));
    /// The [VarHandle] of `zeroCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_zeroCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("zeroCount")));
    /// The byte offset of `groupSize`.
    public static final long OFFSET_groupSize = LAYOUT.byteOffset(PathElement.groupElement("groupSize"));
    /// The memory layout of `groupSize`.
    public static final MemoryLayout LAYOUT_groupSize = LAYOUT.select(PathElement.groupElement("groupSize"));
    /// The [VarHandle] of `groupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_groupSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupSize")));

    /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM copyFrom(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM reinterpret(long count) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dimension` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dimension(MemorySegment segment, long index) { return (int) VH_dimension.get().get(segment, 0L, index); }
    /// {@return `dimension`}
    public int dimension() { return dimension(this.segment(), 0L); }
    /// Sets `dimension` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dimension(MemorySegment segment, long index, int value) { VH_dimension.get().set(segment, 0L, index, value); }
    /// Sets `dimension` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM dimension(int value) { dimension(this.segment(), 0L, value); return this; }

    /// {@return `zeroCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int zeroCount(MemorySegment segment, long index) { return (int) VH_zeroCount.get().get(segment, 0L, index); }
    /// {@return `zeroCount`}
    public int zeroCount() { return zeroCount(this.segment(), 0L); }
    /// Sets `zeroCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void zeroCount(MemorySegment segment, long index, int value) { VH_zeroCount.get().set(segment, 0L, index, value); }
    /// Sets `zeroCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM zeroCount(int value) { zeroCount(this.segment(), 0L, value); return this; }

    /// {@return `groupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int groupSize(MemorySegment segment, long index) { return (int) VH_groupSize.get().get(segment, 0L, index); }
    /// {@return `groupSize`}
    public int groupSize() { return groupSize(this.segment(), 0L); }
    /// Sets `groupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void groupSize(MemorySegment segment, long index, int value) { VH_groupSize.get().set(segment, 0L, index, value); }
    /// Sets `groupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM groupSize(int value) { groupSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM asSlice(long index) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM at(long index, Consumer<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dimension` at the given index}
    /// @param index the index of the struct buffer
    public int dimensionAt(long index) { return dimension(this.segment(), index); }
    /// Sets `dimension` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM dimensionAt(long index, int value) { dimension(this.segment(), index, value); return this; }

    /// {@return `zeroCount` at the given index}
    /// @param index the index of the struct buffer
    public int zeroCountAt(long index) { return zeroCount(this.segment(), index); }
    /// Sets `zeroCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM zeroCountAt(long index, int value) { zeroCount(this.segment(), index, value); return this; }

    /// {@return `groupSize` at the given index}
    /// @param index the index of the struct buffer
    public int groupSizeAt(long index) { return groupSize(this.segment(), index); }
    /// Sets `groupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM groupSizeAt(long index, int value) { groupSize(this.segment(), index, value); return this; }

}
