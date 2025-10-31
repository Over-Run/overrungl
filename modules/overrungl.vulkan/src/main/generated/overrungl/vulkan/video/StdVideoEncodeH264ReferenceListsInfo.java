// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH264ReferenceListsInfo`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH264ReferenceListsInfo {
///     (struct StdVideoEncodeH264ReferenceListsInfoFlags) StdVideoEncodeH264ReferenceListsInfoFlags flags;
///     uint8_t num_ref_idx_l0_active_minus1;
///     uint8_t num_ref_idx_l1_active_minus1;
///     uint8_t RefPicList0[32];
///     uint8_t RefPicList1[32];
///     uint8_t refList0ModOpCount;
///     uint8_t refList1ModOpCount;
///     uint8_t refPicMarkingOpCount;
///     uint8_t reserved1[7];
///     const StdVideoEncodeH264RefListModEntry* pRefList0ModOperations;
///     const StdVideoEncodeH264RefListModEntry* pRefList1ModOperations;
///     const StdVideoEncodeH264RefPicMarkingEntry* pRefPicMarkingOperations;
/// };
/// ```
public final class StdVideoEncodeH264ReferenceListsInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeH264ReferenceListsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH264ReferenceListsInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_active_minus1"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("RefPicList0"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("RefPicList1"),
        ValueLayout.JAVA_BYTE.withName("refList0ModOpCount"),
        ValueLayout.JAVA_BYTE.withName("refList1ModOpCount"),
        ValueLayout.JAVA_BYTE.withName("refPicMarkingOpCount"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_BYTE).withName("reserved1"),
        ValueLayout.ADDRESS.withName("pRefList0ModOperations"),
        ValueLayout.ADDRESS.withName("pRefList1ModOperations"),
        ValueLayout.ADDRESS.withName("pRefPicMarkingOperations")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `num_ref_idx_l0_active_minus1`.
    public static final long OFFSET_num_ref_idx_l0_active_minus1 = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l0_active_minus1"));
    /// The memory layout of `num_ref_idx_l0_active_minus1`.
    public static final MemoryLayout LAYOUT_num_ref_idx_l0_active_minus1 = LAYOUT.select(PathElement.groupElement("num_ref_idx_l0_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l0_active_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_ref_idx_l0_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l0_active_minus1"));
    /// The byte offset of `num_ref_idx_l1_active_minus1`.
    public static final long OFFSET_num_ref_idx_l1_active_minus1 = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l1_active_minus1"));
    /// The memory layout of `num_ref_idx_l1_active_minus1`.
    public static final MemoryLayout LAYOUT_num_ref_idx_l1_active_minus1 = LAYOUT.select(PathElement.groupElement("num_ref_idx_l1_active_minus1"));
    /// The [VarHandle] of `num_ref_idx_l1_active_minus1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_ref_idx_l1_active_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_ref_idx_l1_active_minus1"));
    /// The byte offset of `RefPicList0`.
    public static final long OFFSET_RefPicList0 = LAYOUT.byteOffset(PathElement.groupElement("RefPicList0"));
    /// The memory layout of `RefPicList0`.
    public static final MemoryLayout LAYOUT_RefPicList0 = LAYOUT.select(PathElement.groupElement("RefPicList0"));
    /// The [VarHandle] of `RefPicList0` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_RefPicList0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicList0"), PathElement.sequenceElement());
    /// The byte offset of `RefPicList1`.
    public static final long OFFSET_RefPicList1 = LAYOUT.byteOffset(PathElement.groupElement("RefPicList1"));
    /// The memory layout of `RefPicList1`.
    public static final MemoryLayout LAYOUT_RefPicList1 = LAYOUT.select(PathElement.groupElement("RefPicList1"));
    /// The [VarHandle] of `RefPicList1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_RefPicList1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefPicList1"), PathElement.sequenceElement());
    /// The byte offset of `refList0ModOpCount`.
    public static final long OFFSET_refList0ModOpCount = LAYOUT.byteOffset(PathElement.groupElement("refList0ModOpCount"));
    /// The memory layout of `refList0ModOpCount`.
    public static final MemoryLayout LAYOUT_refList0ModOpCount = LAYOUT.select(PathElement.groupElement("refList0ModOpCount"));
    /// The [VarHandle] of `refList0ModOpCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_refList0ModOpCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refList0ModOpCount"));
    /// The byte offset of `refList1ModOpCount`.
    public static final long OFFSET_refList1ModOpCount = LAYOUT.byteOffset(PathElement.groupElement("refList1ModOpCount"));
    /// The memory layout of `refList1ModOpCount`.
    public static final MemoryLayout LAYOUT_refList1ModOpCount = LAYOUT.select(PathElement.groupElement("refList1ModOpCount"));
    /// The [VarHandle] of `refList1ModOpCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_refList1ModOpCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refList1ModOpCount"));
    /// The byte offset of `refPicMarkingOpCount`.
    public static final long OFFSET_refPicMarkingOpCount = LAYOUT.byteOffset(PathElement.groupElement("refPicMarkingOpCount"));
    /// The memory layout of `refPicMarkingOpCount`.
    public static final MemoryLayout LAYOUT_refPicMarkingOpCount = LAYOUT.select(PathElement.groupElement("refPicMarkingOpCount"));
    /// The [VarHandle] of `refPicMarkingOpCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_refPicMarkingOpCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refPicMarkingOpCount"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
    /// The byte offset of `pRefList0ModOperations`.
    public static final long OFFSET_pRefList0ModOperations = LAYOUT.byteOffset(PathElement.groupElement("pRefList0ModOperations"));
    /// The memory layout of `pRefList0ModOperations`.
    public static final MemoryLayout LAYOUT_pRefList0ModOperations = LAYOUT.select(PathElement.groupElement("pRefList0ModOperations"));
    /// The [VarHandle] of `pRefList0ModOperations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRefList0ModOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefList0ModOperations"));
    /// The byte offset of `pRefList1ModOperations`.
    public static final long OFFSET_pRefList1ModOperations = LAYOUT.byteOffset(PathElement.groupElement("pRefList1ModOperations"));
    /// The memory layout of `pRefList1ModOperations`.
    public static final MemoryLayout LAYOUT_pRefList1ModOperations = LAYOUT.select(PathElement.groupElement("pRefList1ModOperations"));
    /// The [VarHandle] of `pRefList1ModOperations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRefList1ModOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefList1ModOperations"));
    /// The byte offset of `pRefPicMarkingOperations`.
    public static final long OFFSET_pRefPicMarkingOperations = LAYOUT.byteOffset(PathElement.groupElement("pRefPicMarkingOperations"));
    /// The memory layout of `pRefPicMarkingOperations`.
    public static final MemoryLayout LAYOUT_pRefPicMarkingOperations = LAYOUT.select(PathElement.groupElement("pRefPicMarkingOperations"));
    /// The [VarHandle] of `pRefPicMarkingOperations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRefPicMarkingOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefPicMarkingOperations"));

    /// Creates `StdVideoEncodeH264ReferenceListsInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH264ReferenceListsInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH264ReferenceListsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264ReferenceListsInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264ReferenceListsInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264ReferenceListsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264ReferenceListsInfo`
    public static StdVideoEncodeH264ReferenceListsInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264ReferenceListsInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH264ReferenceListsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264ReferenceListsInfo`
    public static StdVideoEncodeH264ReferenceListsInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264ReferenceListsInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo copyFrom(StdVideoEncodeH264ReferenceListsInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH264ReferenceListsInfo reinterpret(long count) { return new StdVideoEncodeH264ReferenceListsInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo flags(Consumer<overrungl.vulkan.video.StdVideoEncodeH264ReferenceListsInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH264ReferenceListsInfoFlags.of(flags())); return this; }

    /// {@return `num_ref_idx_l0_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_ref_idx_l0_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l0_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l0_active_minus1`}
    public byte num_ref_idx_l0_active_minus1() { return num_ref_idx_l0_active_minus1(this.segment(), 0L); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_ref_idx_l0_active_minus1(MemorySegment segment, long index, byte value) { VH_num_ref_idx_l0_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l0_active_minus1(byte value) { num_ref_idx_l0_active_minus1(this.segment(), 0L, value); return this; }

    /// {@return `num_ref_idx_l1_active_minus1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte num_ref_idx_l1_active_minus1(MemorySegment segment, long index) { return (byte) VH_num_ref_idx_l1_active_minus1.get(segment, 0L, index); }
    /// {@return `num_ref_idx_l1_active_minus1`}
    public byte num_ref_idx_l1_active_minus1() { return num_ref_idx_l1_active_minus1(this.segment(), 0L); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_ref_idx_l1_active_minus1(MemorySegment segment, long index, byte value) { VH_num_ref_idx_l1_active_minus1.set(segment, 0L, index, value); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l1_active_minus1(byte value) { num_ref_idx_l1_active_minus1(this.segment(), 0L, value); return this; }

    /// {@return `RefPicList0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment RefPicList0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_RefPicList0, index), LAYOUT_RefPicList0); }
    /// {@return `RefPicList0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte RefPicList0(MemorySegment segment, long index, long index0) { return (byte) VH_RefPicList0.get(segment, 0L, index, index0); }
    /// {@return `RefPicList0`}
    public MemorySegment RefPicList0() { return RefPicList0(this.segment(), 0L); }
    /// {@return `RefPicList0`}
    /// @param index0 the Index 0 of the array
    public byte RefPicList0(long index0) { return RefPicList0(this.segment(), 0L, index0); }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void RefPicList0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_RefPicList0, index), LAYOUT_RefPicList0.byteSize()); }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void RefPicList0(MemorySegment segment, long index, long index0, byte value) { VH_RefPicList0.set(segment, 0L, index, index0, value); }
    /// Sets `RefPicList0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList0(MemorySegment value) { RefPicList0(this.segment(), 0L, value); return this; }
    /// Sets `RefPicList0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList0(long index0, byte value) { RefPicList0(this.segment(), 0L, index0, value); return this; }

    /// {@return `RefPicList1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment RefPicList1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_RefPicList1, index), LAYOUT_RefPicList1); }
    /// {@return `RefPicList1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte RefPicList1(MemorySegment segment, long index, long index0) { return (byte) VH_RefPicList1.get(segment, 0L, index, index0); }
    /// {@return `RefPicList1`}
    public MemorySegment RefPicList1() { return RefPicList1(this.segment(), 0L); }
    /// {@return `RefPicList1`}
    /// @param index0 the Index 0 of the array
    public byte RefPicList1(long index0) { return RefPicList1(this.segment(), 0L, index0); }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void RefPicList1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_RefPicList1, index), LAYOUT_RefPicList1.byteSize()); }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void RefPicList1(MemorySegment segment, long index, long index0, byte value) { VH_RefPicList1.set(segment, 0L, index, index0, value); }
    /// Sets `RefPicList1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList1(MemorySegment value) { RefPicList1(this.segment(), 0L, value); return this; }
    /// Sets `RefPicList1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList1(long index0, byte value) { RefPicList1(this.segment(), 0L, index0, value); return this; }

    /// {@return `refList0ModOpCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte refList0ModOpCount(MemorySegment segment, long index) { return (byte) VH_refList0ModOpCount.get(segment, 0L, index); }
    /// {@return `refList0ModOpCount`}
    public byte refList0ModOpCount() { return refList0ModOpCount(this.segment(), 0L); }
    /// Sets `refList0ModOpCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void refList0ModOpCount(MemorySegment segment, long index, byte value) { VH_refList0ModOpCount.set(segment, 0L, index, value); }
    /// Sets `refList0ModOpCount` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refList0ModOpCount(byte value) { refList0ModOpCount(this.segment(), 0L, value); return this; }

    /// {@return `refList1ModOpCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte refList1ModOpCount(MemorySegment segment, long index) { return (byte) VH_refList1ModOpCount.get(segment, 0L, index); }
    /// {@return `refList1ModOpCount`}
    public byte refList1ModOpCount() { return refList1ModOpCount(this.segment(), 0L); }
    /// Sets `refList1ModOpCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void refList1ModOpCount(MemorySegment segment, long index, byte value) { VH_refList1ModOpCount.set(segment, 0L, index, value); }
    /// Sets `refList1ModOpCount` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refList1ModOpCount(byte value) { refList1ModOpCount(this.segment(), 0L, value); return this; }

    /// {@return `refPicMarkingOpCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte refPicMarkingOpCount(MemorySegment segment, long index) { return (byte) VH_refPicMarkingOpCount.get(segment, 0L, index); }
    /// {@return `refPicMarkingOpCount`}
    public byte refPicMarkingOpCount() { return refPicMarkingOpCount(this.segment(), 0L); }
    /// Sets `refPicMarkingOpCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void refPicMarkingOpCount(MemorySegment segment, long index, byte value) { VH_refPicMarkingOpCount.set(segment, 0L, index, value); }
    /// Sets `refPicMarkingOpCount` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refPicMarkingOpCount(byte value) { refPicMarkingOpCount(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte reserved1(MemorySegment segment, long index, long index0) { return (byte) VH_reserved1.get(segment, 0L, index, index0); }
    /// {@return `reserved1`}
    public MemorySegment reserved1() { return reserved1(this.segment(), 0L); }
    /// {@return `reserved1`}
    /// @param index0 the Index 0 of the array
    public byte reserved1(long index0) { return reserved1(this.segment(), 0L, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1.byteSize()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, long index0, byte value) { VH_reserved1.set(segment, 0L, index, index0, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo reserved1(long index0, byte value) { reserved1(this.segment(), 0L, index0, value); return this; }

    /// {@return `pRefList0ModOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRefList0ModOperations(MemorySegment segment, long index) { return (MemorySegment) VH_pRefList0ModOperations.get(segment, 0L, index); }
    /// {@return `pRefList0ModOperations`}
    public MemorySegment pRefList0ModOperations() { return pRefList0ModOperations(this.segment(), 0L); }
    /// Sets `pRefList0ModOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRefList0ModOperations(MemorySegment segment, long index, MemorySegment value) { VH_pRefList0ModOperations.set(segment, 0L, index, value); }
    /// Sets `pRefList0ModOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefList0ModOperations(MemorySegment value) { pRefList0ModOperations(this.segment(), 0L, value); return this; }

    /// {@return `pRefList1ModOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRefList1ModOperations(MemorySegment segment, long index) { return (MemorySegment) VH_pRefList1ModOperations.get(segment, 0L, index); }
    /// {@return `pRefList1ModOperations`}
    public MemorySegment pRefList1ModOperations() { return pRefList1ModOperations(this.segment(), 0L); }
    /// Sets `pRefList1ModOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRefList1ModOperations(MemorySegment segment, long index, MemorySegment value) { VH_pRefList1ModOperations.set(segment, 0L, index, value); }
    /// Sets `pRefList1ModOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefList1ModOperations(MemorySegment value) { pRefList1ModOperations(this.segment(), 0L, value); return this; }

    /// {@return `pRefPicMarkingOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRefPicMarkingOperations(MemorySegment segment, long index) { return (MemorySegment) VH_pRefPicMarkingOperations.get(segment, 0L, index); }
    /// {@return `pRefPicMarkingOperations`}
    public MemorySegment pRefPicMarkingOperations() { return pRefPicMarkingOperations(this.segment(), 0L); }
    /// Sets `pRefPicMarkingOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRefPicMarkingOperations(MemorySegment segment, long index, MemorySegment value) { VH_pRefPicMarkingOperations.set(segment, 0L, index, value); }
    /// Sets `pRefPicMarkingOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefPicMarkingOperations(MemorySegment value) { pRefPicMarkingOperations(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoEncodeH264ReferenceListsInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH264ReferenceListsInfo`
    public StdVideoEncodeH264ReferenceListsInfo asSlice(long index) { return new StdVideoEncodeH264ReferenceListsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH264ReferenceListsInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH264ReferenceListsInfo`
    public StdVideoEncodeH264ReferenceListsInfo asSlice(long index, long count) { return new StdVideoEncodeH264ReferenceListsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH264ReferenceListsInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo at(long index, Consumer<StdVideoEncodeH264ReferenceListsInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeH264ReferenceListsInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH264ReferenceListsInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `num_ref_idx_l0_active_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte num_ref_idx_l0_active_minus1At(long index) { return num_ref_idx_l0_active_minus1(this.segment(), index); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l0_active_minus1At(long index, byte value) { num_ref_idx_l0_active_minus1(this.segment(), index, value); return this; }

    /// {@return `num_ref_idx_l1_active_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte num_ref_idx_l1_active_minus1At(long index) { return num_ref_idx_l1_active_minus1(this.segment(), index); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l1_active_minus1At(long index, byte value) { num_ref_idx_l1_active_minus1(this.segment(), index, value); return this; }

    /// {@return `RefPicList0` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment RefPicList0At(long index) { return RefPicList0(this.segment(), index); }
    /// {@return `RefPicList0` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte RefPicList0At(long index, long index0) { return RefPicList0(this.segment(), index, index0); }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList0At(long index, MemorySegment value) { RefPicList0(this.segment(), index, value); return this; }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList0At(long index, long index0, byte value) { RefPicList0(this.segment(), index, index0, value); return this; }

    /// {@return `RefPicList1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment RefPicList1At(long index) { return RefPicList1(this.segment(), index); }
    /// {@return `RefPicList1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte RefPicList1At(long index, long index0) { return RefPicList1(this.segment(), index, index0); }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList1At(long index, MemorySegment value) { RefPicList1(this.segment(), index, value); return this; }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo RefPicList1At(long index, long index0, byte value) { RefPicList1(this.segment(), index, index0, value); return this; }

    /// {@return `refList0ModOpCount` at the given index}
    /// @param index the index of the struct buffer
    public byte refList0ModOpCountAt(long index) { return refList0ModOpCount(this.segment(), index); }
    /// Sets `refList0ModOpCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refList0ModOpCountAt(long index, byte value) { refList0ModOpCount(this.segment(), index, value); return this; }

    /// {@return `refList1ModOpCount` at the given index}
    /// @param index the index of the struct buffer
    public byte refList1ModOpCountAt(long index) { return refList1ModOpCount(this.segment(), index); }
    /// Sets `refList1ModOpCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refList1ModOpCountAt(long index, byte value) { refList1ModOpCount(this.segment(), index, value); return this; }

    /// {@return `refPicMarkingOpCount` at the given index}
    /// @param index the index of the struct buffer
    public byte refPicMarkingOpCountAt(long index) { return refPicMarkingOpCount(this.segment(), index); }
    /// Sets `refPicMarkingOpCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo refPicMarkingOpCountAt(long index, byte value) { refPicMarkingOpCount(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment reserved1At(long index) { return reserved1(this.segment(), index); }
    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte reserved1At(long index, long index0) { return reserved1(this.segment(), index, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo reserved1At(long index, MemorySegment value) { reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo reserved1At(long index, long index0, byte value) { reserved1(this.segment(), index, index0, value); return this; }

    /// {@return `pRefList0ModOperations` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRefList0ModOperationsAt(long index) { return pRefList0ModOperations(this.segment(), index); }
    /// Sets `pRefList0ModOperations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefList0ModOperationsAt(long index, MemorySegment value) { pRefList0ModOperations(this.segment(), index, value); return this; }

    /// {@return `pRefList1ModOperations` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRefList1ModOperationsAt(long index) { return pRefList1ModOperations(this.segment(), index); }
    /// Sets `pRefList1ModOperations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefList1ModOperationsAt(long index, MemorySegment value) { pRefList1ModOperations(this.segment(), index, value); return this; }

    /// {@return `pRefPicMarkingOperations` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRefPicMarkingOperationsAt(long index) { return pRefPicMarkingOperations(this.segment(), index); }
    /// Sets `pRefPicMarkingOperations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264ReferenceListsInfo pRefPicMarkingOperationsAt(long index, MemorySegment value) { pRefPicMarkingOperations(this.segment(), index, value); return this; }

}
