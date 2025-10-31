// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoDecodeH264PictureInfo`.
/// ## Layout
/// ```
/// struct StdVideoDecodeH264PictureInfo {
///     (struct StdVideoDecodeH264PictureInfoFlags) StdVideoDecodeH264PictureInfoFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint16_t frame_num;
///     uint16_t idr_pic_id;
///     int32_t PicOrderCnt[2];
/// };
/// ```
public final class StdVideoDecodeH264PictureInfo extends GroupType {
    /// The struct layout of `StdVideoDecodeH264PictureInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_SHORT.withName("frame_num"),
        ValueLayout.JAVA_SHORT.withName("idr_pic_id"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("PicOrderCnt")
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
    public static final VarHandle VH_seq_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("seq_parameter_set_id"));
    /// The byte offset of `pic_parameter_set_id`.
    public static final long OFFSET_pic_parameter_set_id = LAYOUT.byteOffset(PathElement.groupElement("pic_parameter_set_id"));
    /// The memory layout of `pic_parameter_set_id`.
    public static final MemoryLayout LAYOUT_pic_parameter_set_id = LAYOUT.select(PathElement.groupElement("pic_parameter_set_id"));
    /// The [VarHandle] of `pic_parameter_set_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pic_parameter_set_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pic_parameter_set_id"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The byte offset of `reserved2`.
    public static final long OFFSET_reserved2 = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
    /// The memory layout of `reserved2`.
    public static final MemoryLayout LAYOUT_reserved2 = LAYOUT.select(PathElement.groupElement("reserved2"));
    /// The [VarHandle] of `reserved2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reserved2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved2"));
    /// The byte offset of `frame_num`.
    public static final long OFFSET_frame_num = LAYOUT.byteOffset(PathElement.groupElement("frame_num"));
    /// The memory layout of `frame_num`.
    public static final MemoryLayout LAYOUT_frame_num = LAYOUT.select(PathElement.groupElement("frame_num"));
    /// The [VarHandle] of `frame_num` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_num"));
    /// The byte offset of `idr_pic_id`.
    public static final long OFFSET_idr_pic_id = LAYOUT.byteOffset(PathElement.groupElement("idr_pic_id"));
    /// The memory layout of `idr_pic_id`.
    public static final MemoryLayout LAYOUT_idr_pic_id = LAYOUT.select(PathElement.groupElement("idr_pic_id"));
    /// The [VarHandle] of `idr_pic_id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_idr_pic_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("idr_pic_id"));
    /// The byte offset of `PicOrderCnt`.
    public static final long OFFSET_PicOrderCnt = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
    /// The memory layout of `PicOrderCnt`.
    public static final MemoryLayout LAYOUT_PicOrderCnt = LAYOUT.select(PathElement.groupElement("PicOrderCnt"));
    /// The [VarHandle] of `PicOrderCnt` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_PicOrderCnt = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PicOrderCnt"), PathElement.sequenceElement());

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoDecodeH264PictureInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264PictureInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH264PictureInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264PictureInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH264PictureInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoDecodeH264PictureInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH264PictureInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeH264PictureInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeH264PictureInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH264PictureInfo`
    public static StdVideoDecodeH264PictureInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeH264PictureInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoDecodeH264PictureInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH264PictureInfo`
    public static StdVideoDecodeH264PictureInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH264PictureInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeH264PictureInfo copyFrom(StdVideoDecodeH264PictureInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoDecodeH264PictureInfo reinterpret(long count) { return new StdVideoDecodeH264PictureInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoDecodeH264PictureInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoDecodeH264PictureInfo flags(Consumer<overrungl.vulkan.video.StdVideoDecodeH264PictureInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.of(flags())); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte seq_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_seq_parameter_set_id.get(segment, 0L, index); }
    /// {@return `seq_parameter_set_id`}
    public byte seq_parameter_set_id() { return seq_parameter_set_id(this.segment(), 0L); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void seq_parameter_set_id(MemorySegment segment, long index, byte value) { VH_seq_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `seq_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo seq_parameter_set_id(byte value) { seq_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `pic_parameter_set_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte pic_parameter_set_id(MemorySegment segment, long index) { return (byte) VH_pic_parameter_set_id.get(segment, 0L, index); }
    /// {@return `pic_parameter_set_id`}
    public byte pic_parameter_set_id() { return pic_parameter_set_id(this.segment(), 0L); }
    /// Sets `pic_parameter_set_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pic_parameter_set_id(MemorySegment segment, long index, byte value) { VH_pic_parameter_set_id.set(segment, 0L, index, value); }
    /// Sets `pic_parameter_set_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo pic_parameter_set_id(byte value) { pic_parameter_set_id(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    public byte reserved1() { return reserved1(this.segment(), 0L); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo reserved1(byte value) { reserved1(this.segment(), 0L, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte reserved2(MemorySegment segment, long index) { return (byte) VH_reserved2.get(segment, 0L, index); }
    /// {@return `reserved2`}
    public byte reserved2() { return reserved2(this.segment(), 0L); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved2(MemorySegment segment, long index, byte value) { VH_reserved2.set(segment, 0L, index, value); }
    /// Sets `reserved2` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo reserved2(byte value) { reserved2(this.segment(), 0L, value); return this; }

    /// {@return `frame_num` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short frame_num(MemorySegment segment, long index) { return (short) VH_frame_num.get(segment, 0L, index); }
    /// {@return `frame_num`}
    public short frame_num() { return frame_num(this.segment(), 0L); }
    /// Sets `frame_num` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_num(MemorySegment segment, long index, short value) { VH_frame_num.set(segment, 0L, index, value); }
    /// Sets `frame_num` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo frame_num(short value) { frame_num(this.segment(), 0L, value); return this; }

    /// {@return `idr_pic_id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short idr_pic_id(MemorySegment segment, long index) { return (short) VH_idr_pic_id.get(segment, 0L, index); }
    /// {@return `idr_pic_id`}
    public short idr_pic_id() { return idr_pic_id(this.segment(), 0L); }
    /// Sets `idr_pic_id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void idr_pic_id(MemorySegment segment, long index, short value) { VH_idr_pic_id.set(segment, 0L, index, value); }
    /// Sets `idr_pic_id` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo idr_pic_id(short value) { idr_pic_id(this.segment(), 0L, value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment PicOrderCnt(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_PicOrderCnt, index), LAYOUT_PicOrderCnt); }
    /// {@return `PicOrderCnt` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int PicOrderCnt(MemorySegment segment, long index, long index0) { return (int) VH_PicOrderCnt.get(segment, 0L, index, index0); }
    /// {@return `PicOrderCnt`}
    public MemorySegment PicOrderCnt() { return PicOrderCnt(this.segment(), 0L); }
    /// {@return `PicOrderCnt`}
    /// @param index0 the Index 0 of the array
    public int PicOrderCnt(long index0) { return PicOrderCnt(this.segment(), 0L, index0); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void PicOrderCnt(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_PicOrderCnt, index), LAYOUT_PicOrderCnt.byteSize()); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void PicOrderCnt(MemorySegment segment, long index, long index0, int value) { VH_PicOrderCnt.set(segment, 0L, index, index0, value); }
    /// Sets `PicOrderCnt` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo PicOrderCnt(MemorySegment value) { PicOrderCnt(this.segment(), 0L, value); return this; }
    /// Sets `PicOrderCnt` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo PicOrderCnt(long index0, int value) { PicOrderCnt(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `StdVideoDecodeH264PictureInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeH264PictureInfo`
    public StdVideoDecodeH264PictureInfo asSlice(long index) { return new StdVideoDecodeH264PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoDecodeH264PictureInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeH264PictureInfo`
    public StdVideoDecodeH264PictureInfo asSlice(long index, long count) { return new StdVideoDecodeH264PictureInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoDecodeH264PictureInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoDecodeH264PictureInfo at(long index, Consumer<StdVideoDecodeH264PictureInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoDecodeH264PictureInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoDecodeH264PictureInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `seq_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte seq_parameter_set_idAt(long index) { return seq_parameter_set_id(this.segment(), index); }
    /// Sets `seq_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo seq_parameter_set_idAt(long index, byte value) { seq_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `pic_parameter_set_id` at the given index}
    /// @param index the index of the struct buffer
    public byte pic_parameter_set_idAt(long index) { return pic_parameter_set_id(this.segment(), index); }
    /// Sets `pic_parameter_set_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo pic_parameter_set_idAt(long index, byte value) { pic_parameter_set_id(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved1At(long index) { return reserved1(this.segment(), index); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo reserved1At(long index, byte value) { reserved1(this.segment(), index, value); return this; }

    /// {@return `reserved2` at the given index}
    /// @param index the index of the struct buffer
    public byte reserved2At(long index) { return reserved2(this.segment(), index); }
    /// Sets `reserved2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo reserved2At(long index, byte value) { reserved2(this.segment(), index, value); return this; }

    /// {@return `frame_num` at the given index}
    /// @param index the index of the struct buffer
    public short frame_numAt(long index) { return frame_num(this.segment(), index); }
    /// Sets `frame_num` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo frame_numAt(long index, short value) { frame_num(this.segment(), index, value); return this; }

    /// {@return `idr_pic_id` at the given index}
    /// @param index the index of the struct buffer
    public short idr_pic_idAt(long index) { return idr_pic_id(this.segment(), index); }
    /// Sets `idr_pic_id` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo idr_pic_idAt(long index, short value) { idr_pic_id(this.segment(), index, value); return this; }

    /// {@return `PicOrderCnt` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment PicOrderCntAt(long index) { return PicOrderCnt(this.segment(), index); }
    /// {@return `PicOrderCnt` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int PicOrderCntAt(long index, long index0) { return PicOrderCnt(this.segment(), index, index0); }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo PicOrderCntAt(long index, MemorySegment value) { PicOrderCnt(this.segment(), index, value); return this; }
    /// Sets `PicOrderCnt` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH264PictureInfo PicOrderCntAt(long index, long index0, int value) { PicOrderCnt(this.segment(), index, index0, value); return this; }

}
