// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH265ReferenceListsInfo`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH265ReferenceListsInfo {
///     (struct StdVideoEncodeH265ReferenceListsInfoFlags) StdVideoEncodeH265ReferenceListsInfoFlags flags;
///     uint8_t num_ref_idx_l0_active_minus1;
///     uint8_t num_ref_idx_l1_active_minus1;
///     uint8_t RefPicList0[15];
///     uint8_t RefPicList1[15];
///     uint8_t list_entry_l0[15];
///     uint8_t list_entry_l1[15];
/// };
/// ```
public final class StdVideoEncodeH265ReferenceListsInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeH265ReferenceListsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH265ReferenceListsInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_active_minus1"),
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("RefPicList0"),
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("RefPicList1"),
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("list_entry_l0"),
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("list_entry_l1")
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
    /// The byte offset of `list_entry_l0`.
    public static final long OFFSET_list_entry_l0 = LAYOUT.byteOffset(PathElement.groupElement("list_entry_l0"));
    /// The memory layout of `list_entry_l0`.
    public static final MemoryLayout LAYOUT_list_entry_l0 = LAYOUT.select(PathElement.groupElement("list_entry_l0"));
    /// The [VarHandle] of `list_entry_l0` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_list_entry_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("list_entry_l0"), PathElement.sequenceElement());
    /// The byte offset of `list_entry_l1`.
    public static final long OFFSET_list_entry_l1 = LAYOUT.byteOffset(PathElement.groupElement("list_entry_l1"));
    /// The memory layout of `list_entry_l1`.
    public static final MemoryLayout LAYOUT_list_entry_l1 = LAYOUT.select(PathElement.groupElement("list_entry_l1"));
    /// The [VarHandle] of `list_entry_l1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_list_entry_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("list_entry_l1"), PathElement.sequenceElement());

    /// Creates `StdVideoEncodeH265ReferenceListsInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH265ReferenceListsInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH265ReferenceListsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH265ReferenceListsInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265ReferenceListsInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH265ReferenceListsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH265ReferenceListsInfo`
    public static StdVideoEncodeH265ReferenceListsInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265ReferenceListsInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH265ReferenceListsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH265ReferenceListsInfo`
    public static StdVideoEncodeH265ReferenceListsInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265ReferenceListsInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo copyFrom(StdVideoEncodeH265ReferenceListsInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH265ReferenceListsInfo reinterpret(long count) { return new StdVideoEncodeH265ReferenceListsInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoEncodeH265ReferenceListsInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo flags(Consumer<overrungl.vulkan.video.StdVideoEncodeH265ReferenceListsInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH265ReferenceListsInfoFlags.of(flags())); return this; }

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
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l0_active_minus1(byte value) { num_ref_idx_l0_active_minus1(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l1_active_minus1(byte value) { num_ref_idx_l1_active_minus1(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeH265ReferenceListsInfo RefPicList0(MemorySegment value) { RefPicList0(this.segment(), 0L, value); return this; }
    /// Sets `RefPicList0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo RefPicList0(long index0, byte value) { RefPicList0(this.segment(), 0L, index0, value); return this; }

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
    public StdVideoEncodeH265ReferenceListsInfo RefPicList1(MemorySegment value) { RefPicList1(this.segment(), 0L, value); return this; }
    /// Sets `RefPicList1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo RefPicList1(long index0, byte value) { RefPicList1(this.segment(), 0L, index0, value); return this; }

    /// {@return `list_entry_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment list_entry_l0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_list_entry_l0, index), LAYOUT_list_entry_l0); }
    /// {@return `list_entry_l0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte list_entry_l0(MemorySegment segment, long index, long index0) { return (byte) VH_list_entry_l0.get(segment, 0L, index, index0); }
    /// {@return `list_entry_l0`}
    public MemorySegment list_entry_l0() { return list_entry_l0(this.segment(), 0L); }
    /// {@return `list_entry_l0`}
    /// @param index0 the Index 0 of the array
    public byte list_entry_l0(long index0) { return list_entry_l0(this.segment(), 0L, index0); }
    /// Sets `list_entry_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void list_entry_l0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_list_entry_l0, index), LAYOUT_list_entry_l0.byteSize()); }
    /// Sets `list_entry_l0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void list_entry_l0(MemorySegment segment, long index, long index0, byte value) { VH_list_entry_l0.set(segment, 0L, index, index0, value); }
    /// Sets `list_entry_l0` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l0(MemorySegment value) { list_entry_l0(this.segment(), 0L, value); return this; }
    /// Sets `list_entry_l0` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l0(long index0, byte value) { list_entry_l0(this.segment(), 0L, index0, value); return this; }

    /// {@return `list_entry_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment list_entry_l1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_list_entry_l1, index), LAYOUT_list_entry_l1); }
    /// {@return `list_entry_l1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte list_entry_l1(MemorySegment segment, long index, long index0) { return (byte) VH_list_entry_l1.get(segment, 0L, index, index0); }
    /// {@return `list_entry_l1`}
    public MemorySegment list_entry_l1() { return list_entry_l1(this.segment(), 0L); }
    /// {@return `list_entry_l1`}
    /// @param index0 the Index 0 of the array
    public byte list_entry_l1(long index0) { return list_entry_l1(this.segment(), 0L, index0); }
    /// Sets `list_entry_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void list_entry_l1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_list_entry_l1, index), LAYOUT_list_entry_l1.byteSize()); }
    /// Sets `list_entry_l1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void list_entry_l1(MemorySegment segment, long index, long index0, byte value) { VH_list_entry_l1.set(segment, 0L, index, index0, value); }
    /// Sets `list_entry_l1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l1(MemorySegment value) { list_entry_l1(this.segment(), 0L, value); return this; }
    /// Sets `list_entry_l1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l1(long index0, byte value) { list_entry_l1(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `StdVideoEncodeH265ReferenceListsInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH265ReferenceListsInfo`
    public StdVideoEncodeH265ReferenceListsInfo asSlice(long index) { return new StdVideoEncodeH265ReferenceListsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH265ReferenceListsInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH265ReferenceListsInfo`
    public StdVideoEncodeH265ReferenceListsInfo asSlice(long index, long count) { return new StdVideoEncodeH265ReferenceListsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH265ReferenceListsInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo at(long index, Consumer<StdVideoEncodeH265ReferenceListsInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeH265ReferenceListsInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH265ReferenceListsInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `num_ref_idx_l0_active_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte num_ref_idx_l0_active_minus1At(long index) { return num_ref_idx_l0_active_minus1(this.segment(), index); }
    /// Sets `num_ref_idx_l0_active_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l0_active_minus1At(long index, byte value) { num_ref_idx_l0_active_minus1(this.segment(), index, value); return this; }

    /// {@return `num_ref_idx_l1_active_minus1` at the given index}
    /// @param index the index of the struct buffer
    public byte num_ref_idx_l1_active_minus1At(long index) { return num_ref_idx_l1_active_minus1(this.segment(), index); }
    /// Sets `num_ref_idx_l1_active_minus1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l1_active_minus1At(long index, byte value) { num_ref_idx_l1_active_minus1(this.segment(), index, value); return this; }

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
    public StdVideoEncodeH265ReferenceListsInfo RefPicList0At(long index, MemorySegment value) { RefPicList0(this.segment(), index, value); return this; }
    /// Sets `RefPicList0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo RefPicList0At(long index, long index0, byte value) { RefPicList0(this.segment(), index, index0, value); return this; }

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
    public StdVideoEncodeH265ReferenceListsInfo RefPicList1At(long index, MemorySegment value) { RefPicList1(this.segment(), index, value); return this; }
    /// Sets `RefPicList1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo RefPicList1At(long index, long index0, byte value) { RefPicList1(this.segment(), index, index0, value); return this; }

    /// {@return `list_entry_l0` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment list_entry_l0At(long index) { return list_entry_l0(this.segment(), index); }
    /// {@return `list_entry_l0` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte list_entry_l0At(long index, long index0) { return list_entry_l0(this.segment(), index, index0); }
    /// Sets `list_entry_l0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l0At(long index, MemorySegment value) { list_entry_l0(this.segment(), index, value); return this; }
    /// Sets `list_entry_l0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l0At(long index, long index0, byte value) { list_entry_l0(this.segment(), index, index0, value); return this; }

    /// {@return `list_entry_l1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment list_entry_l1At(long index) { return list_entry_l1(this.segment(), index); }
    /// {@return `list_entry_l1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte list_entry_l1At(long index, long index0) { return list_entry_l1(this.segment(), index, index0); }
    /// Sets `list_entry_l1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l1At(long index, MemorySegment value) { list_entry_l1(this.segment(), index, value); return this; }
    /// Sets `list_entry_l1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l1At(long index, long index0, byte value) { list_entry_l1(this.segment(), index, index0, value); return this; }

}
