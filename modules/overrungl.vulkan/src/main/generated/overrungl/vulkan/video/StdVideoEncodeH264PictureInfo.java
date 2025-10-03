// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH264PictureInfo`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH264PictureInfo {
///     (struct StdVideoEncodeH264PictureInfoFlags) StdVideoEncodeH264PictureInfoFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint16_t idr_pic_id;
///     (int) StdVideoH264PictureType primary_pic_type;
///     uint32_t frame_num;
///     int32_t PicOrderCnt;
///     uint8_t temporal_id;
///     uint8_t reserved1[3];
///     const StdVideoEncodeH264ReferenceListsInfo* pRefLists;
/// };
/// ```
public final class StdVideoEncodeH264PictureInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeH264PictureInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeH264PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_SHORT.withName("idr_pic_id"),
        ValueLayout.JAVA_INT.withName("primary_pic_type"),
        ValueLayout.JAVA_INT.withName("frame_num"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt"),
        ValueLayout.JAVA_BYTE.withName("temporal_id"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_BYTE).withName("reserved1"),
        ValueLayout.ADDRESS.withName("pRefLists")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `seq_parameter_set_id`.
    public static final long OFFSET_seq_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("seq_parameter_set_id"));
    /// The memory layout of `seq_parameter_set_id`.
    public static final MemoryLayout LAYOUT_seq_parameter_set_id = LAYOUT.select(PathElement.groupElement("seq_parameter_set_id"));
    /// The [VarHandle] of `seq_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_seq_parameter_set_id = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_parameter_set_id")));
    /// The byte offset of `pic_parameter_set_id`.
    public static final long OFFSET_pic_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("pic_parameter_set_id"));
    /// The memory layout of `pic_parameter_set_id`.
    public static final MemoryLayout LAYOUT_pic_parameter_set_id = LAYOUT.select(PathElement.groupElement("pic_parameter_set_id"));
    /// The [VarHandle] of `pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pic_parameter_set_id = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_parameter_set_id")));
    /// The byte offset of `idr_pic_id`.
    public static final long OFFSET_idr_pic_id = LAYOUT.byteOffset(PathElement.groupElement("idr_pic_id"));
    /// The memory layout of `idr_pic_id`.
    public static final MemoryLayout LAYOUT_idr_pic_id = LAYOUT.select(PathElement.groupElement("idr_pic_id"));
    /// The [VarHandle] of `idr_pic_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_idr_pic_id = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("idr_pic_id")));
    /// The byte offset of `primary_pic_type`.
    public static final long OFFSET_primary_pic_type = LAYOUT.byteOffset(PathElement.groupElement("primary_pic_type"));
    /// The memory layout of `primary_pic_type`.
    public static final MemoryLayout LAYOUT_primary_pic_type = LAYOUT.select(PathElement.groupElement("primary_pic_type"));
    /// The [VarHandle] of `primary_pic_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_primary_pic_type = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("primary_pic_type")));
    /// The byte offset of `frame_num`.
    public static final long OFFSET_frame_num = LAYOUT.byteOffset(PathElement.groupElement("frame_num"));
    /// The memory layout of `frame_num`.
    public static final MemoryLayout LAYOUT_frame_num = LAYOUT.select(PathElement.groupElement("frame_num"));
    /// The [VarHandle] of `frame_num` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_frame_num = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_num")));
    /// The byte offset of `PicOrderCnt`.
    public static final long OFFSET_PicOrderCnt = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
    /// The memory layout of `PicOrderCnt`.
    public static final MemoryLayout LAYOUT_PicOrderCnt = LAYOUT.select(PathElement.groupElement("PicOrderCnt"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_PicOrderCnt = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt")));
    /// The byte offset of `temporal_id`.
    public static final long OFFSET_temporal_id = LAYOUT.byteOffset(PathElement.groupElement("temporal_id"));
    /// The memory layout of `temporal_id`.
    public static final MemoryLayout LAYOUT_temporal_id = LAYOUT.select(PathElement.groupElement("temporal_id"));
    /// The [VarHandle] of `temporal_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_temporal_id = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporal_id")));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_reserved1 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement()));
    /// The byte offset of `pRefLists`.
    public static final long OFFSET_pRefLists = LAYOUT.byteOffset(PathElement.groupElement("pRefLists"));
    /// The memory layout of `pRefLists`.
    public static final MemoryLayout LAYOUT_pRefLists = LAYOUT.select(PathElement.groupElement("pRefLists"));
    /// The [VarHandle] of `pRefLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pRefLists = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRefLists")));

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeH264PictureInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264PictureInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264PictureInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264PictureInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264PictureInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeH264PictureInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264PictureInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeH264PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeH264PictureInfo`
    public static StdVideoEncodeH264PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264PictureInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeH264PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeH264PictureInfo`
    public static StdVideoEncodeH264PictureInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264PictureInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeH264PictureInfo copyFrom(StdVideoEncodeH264PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeH264PictureInfo reinterpret(long count) { return new StdVideoEncodeH264PictureInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoEncodeH264PictureInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH264PictureInfo flags(Consumer<overrungl.vulkan.video.StdVideoEncodeH264PictureInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH264PictureInfoFlags.of(flags())); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_seq_parameter_set_id.get().get(segment, 0L, index); }
    /// {@return `seq_parameter_set_id`}
    public byte seq_parameter_set_id() { return seq_parameter_set_id(this.segment(), 0L); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_parameter_set_id(MemorySegment segment, long index, byte value) { VH_seq_parameter_set_id.get().set(segment, 0L, index, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo seq_parameter_set_id(byte value) { seq_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pic_parameter_set_id.get().get(segment, 0L, index); }
    /// {@return `pic_parameter_set_id`}
    public byte pic_parameter_set_id() { return pic_parameter_set_id(this.segment(), 0L); }
    /// Sets `pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_parameter_set_id(MemorySegment segment, long index, byte value) { VH_pic_parameter_set_id.get().set(segment, 0L, index, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo pic_parameter_set_id(byte value) { pic_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `idr_pic_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short idr_pic_id(MemorySegment segment, long index) { return (short) VH_idr_pic_id.get().get(segment, 0L, index); }
    /// {@return `idr_pic_id`}
    public short idr_pic_id() { return idr_pic_id(this.segment(), 0L); }
    /// Sets `idr_pic_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void idr_pic_id(MemorySegment segment, long index, short value) { VH_idr_pic_id.get().set(segment, 0L, index, value); }
    /// Sets `idr_pic_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo idr_pic_id(short value) { idr_pic_id(this.segment(), 0L, value); return this; }

    /// {@return `primary_pic_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primary_pic_type(MemorySegment segment, long index) { return (int) VH_primary_pic_type.get().get(segment, 0L, index); }
    /// {@return `primary_pic_type`}
    public int primary_pic_type() { return primary_pic_type(this.segment(), 0L); }
    /// Sets `primary_pic_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primary_pic_type(MemorySegment segment, long index, int value) { VH_primary_pic_type.get().set(segment, 0L, index, value); }
    /// Sets `primary_pic_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo primary_pic_type(int value) { primary_pic_type(this.segment(), 0L, value); return this; }

    /// {@return `frame_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_num(MemorySegment segment, long index) { return (int) VH_frame_num.get().get(segment, 0L, index); }
    /// {@return `frame_num`}
    public int frame_num() { return frame_num(this.segment(), 0L); }
    /// Sets `frame_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_num(MemorySegment segment, long index, int value) { VH_frame_num.get().set(segment, 0L, index, value); }
    /// Sets `frame_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo frame_num(int value) { frame_num(this.segment(), 0L, value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int PicOrderCnt(MemorySegment segment, long index) { return (int) VH_PicOrderCnt.get().get(segment, 0L, index); }
    /// {@return `PicOrderCnt`}
    public int PicOrderCnt() { return PicOrderCnt(this.segment(), 0L); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void PicOrderCnt(MemorySegment segment, long index, int value) { VH_PicOrderCnt.get().set(segment, 0L, index, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo PicOrderCnt(int value) { PicOrderCnt(this.segment(), 0L, value); return this; }

    /// {@return `temporal_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte temporal_id(MemorySegment segment, long index) { return (byte) VH_temporal_id.get().get(segment, 0L, index); }
    /// {@return `temporal_id`}
    public byte temporal_id() { return temporal_id(this.segment(), 0L); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void temporal_id(MemorySegment segment, long index, byte value) { VH_temporal_id.get().set(segment, 0L, index, value); }
    /// Sets `temporal_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo temporal_id(byte value) { temporal_id(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte reserved1(MemorySegment segment, long index, long index0) { return (byte) VH_reserved1.get().get(segment, 0L, index, index0); }
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
    public static void reserved1(MemorySegment segment, long index, long index0, byte value) { VH_reserved1.get().set(segment, 0L, index, index0, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo reserved1(long index0, byte value) { reserved1(this.segment(), 0L, index0, value); return this; }

    /// {@return `pRefLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRefLists(MemorySegment segment, long index) { return (MemorySegment) VH_pRefLists.get().get(segment, 0L, index); }
    /// {@return `pRefLists`}
    public MemorySegment pRefLists() { return pRefLists(this.segment(), 0L); }
    /// Sets `pRefLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRefLists(MemorySegment segment, long index, MemorySegment value) { VH_pRefLists.get().set(segment, 0L, index, value); }
    /// Sets `pRefLists` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo pRefLists(MemorySegment value) { pRefLists(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoEncodeH264PictureInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeH264PictureInfo`
    public StdVideoEncodeH264PictureInfo asSlice(long index) { return new StdVideoEncodeH264PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeH264PictureInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeH264PictureInfo`
    public StdVideoEncodeH264PictureInfo asSlice(long index, long count) { return new StdVideoEncodeH264PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeH264PictureInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeH264PictureInfo at(long index, Consumer<StdVideoEncodeH264PictureInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeH264PictureInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeH264PictureInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeH264PictureInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte seq_parameter_set_idAt(long index) { return seq_parameter_set_id(this.segment(), index); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo seq_parameter_set_idAt(long index, byte value) { seq_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `pic_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte pic_parameter_set_idAt(long index) { return pic_parameter_set_id(this.segment(), index); }
    /// Sets `pic_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo pic_parameter_set_idAt(long index, byte value) { pic_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `idr_pic_id` at the given index}
    /// @param index the index of the struct buffer
    public short idr_pic_idAt(long index) { return idr_pic_id(this.segment(), index); }
    /// Sets `idr_pic_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo idr_pic_idAt(long index, short value) { idr_pic_id(this.segment(), index, value); return this; }

    /// {@return `primary_pic_type` at the given index}
    /// @param index the index of the struct buffer
    public int primary_pic_typeAt(long index) { return primary_pic_type(this.segment(), index); }
    /// Sets `primary_pic_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo primary_pic_typeAt(long index, int value) { primary_pic_type(this.segment(), index, value); return this; }

    /// {@return `frame_num` at the given index}
    /// @param index the index of the struct buffer
    public int frame_numAt(long index) { return frame_num(this.segment(), index); }
    /// Sets `frame_num` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo frame_numAt(long index, int value) { frame_num(this.segment(), index, value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param index the index of the struct buffer
    public int PicOrderCntAt(long index) { return PicOrderCnt(this.segment(), index); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo PicOrderCntAt(long index, int value) { PicOrderCnt(this.segment(), index, value); return this; }

    /// {@return `temporal_id` at the given index}
    /// @param index the index of the struct buffer
    public byte temporal_idAt(long index) { return temporal_id(this.segment(), index); }
    /// Sets `temporal_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo temporal_idAt(long index, byte value) { temporal_id(this.segment(), index, value); return this; }

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
    public StdVideoEncodeH264PictureInfo reserved1At(long index, MemorySegment value) { reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo reserved1At(long index, long index0, byte value) { reserved1(this.segment(), index, index0, value); return this; }

    /// {@return `pRefLists` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pRefListsAt(long index) { return pRefLists(this.segment(), index); }
    /// Sets `pRefLists` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeH264PictureInfo pRefListsAt(long index, MemorySegment value) { pRefLists(this.segment(), index, value); return this; }

}
