// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH264RefPicMarkingEntry`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH264RefPicMarkingEntry {
///     StdVideoH264MemMgmtControlOp memory_management_control_operation;
///     uint16_t difference_of_pic_nums_minus1;
///     uint16_t long_term_pic_num;
///     uint16_t long_term_frame_idx;
///     uint16_t max_long_term_frame_idx_plus1;
/// }
/// ```
public final class StdVideoEncodeH264RefPicMarkingEntry extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("memory_management_control_operation"),
        ValueLayout.JAVA_SHORT.withName("difference_of_pic_nums_minus1"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num"),
        ValueLayout.JAVA_SHORT.withName("long_term_frame_idx"),
        ValueLayout.JAVA_SHORT.withName("max_long_term_frame_idx_plus1")
    );
    public static final long OFFSET_memory_management_control_operation = LAYOUT.byteOffset(PathElement.groupElement("memory_management_control_operation"));
    public static final long OFFSET_difference_of_pic_nums_minus1 = LAYOUT.byteOffset(PathElement.groupElement("difference_of_pic_nums_minus1"));
    public static final long OFFSET_long_term_pic_num = LAYOUT.byteOffset(PathElement.groupElement("long_term_pic_num"));
    public static final long OFFSET_long_term_frame_idx = LAYOUT.byteOffset(PathElement.groupElement("long_term_frame_idx"));
    public static final long OFFSET_max_long_term_frame_idx_plus1 = LAYOUT.byteOffset(PathElement.groupElement("max_long_term_frame_idx_plus1"));
    public static final MemoryLayout LAYOUT_memory_management_control_operation = LAYOUT.select(PathElement.groupElement("memory_management_control_operation"));
    public static final MemoryLayout LAYOUT_difference_of_pic_nums_minus1 = LAYOUT.select(PathElement.groupElement("difference_of_pic_nums_minus1"));
    public static final MemoryLayout LAYOUT_long_term_pic_num = LAYOUT.select(PathElement.groupElement("long_term_pic_num"));
    public static final MemoryLayout LAYOUT_long_term_frame_idx = LAYOUT.select(PathElement.groupElement("long_term_frame_idx"));
    public static final MemoryLayout LAYOUT_max_long_term_frame_idx_plus1 = LAYOUT.select(PathElement.groupElement("max_long_term_frame_idx_plus1"));
    public static final VarHandle VH_memory_management_control_operation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory_management_control_operation"));
    public static final VarHandle VH_difference_of_pic_nums_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("difference_of_pic_nums_minus1"));
    public static final VarHandle VH_long_term_pic_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_pic_num"));
    public static final VarHandle VH_long_term_frame_idx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_frame_idx"));
    public static final VarHandle VH_max_long_term_frame_idx_plus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_long_term_frame_idx_plus1"));

    public StdVideoEncodeH264RefPicMarkingEntry(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoEncodeH264RefPicMarkingEntry of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264RefPicMarkingEntry(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoEncodeH264RefPicMarkingEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264RefPicMarkingEntry(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoEncodeH264RefPicMarkingEntry ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264RefPicMarkingEntry(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoEncodeH264RefPicMarkingEntry alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264RefPicMarkingEntry(allocator.allocate(LAYOUT), 1); }
    public static StdVideoEncodeH264RefPicMarkingEntry alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264RefPicMarkingEntry(allocator.allocate(LAYOUT, count), count); }
    public StdVideoEncodeH264RefPicMarkingEntry copyFrom(StdVideoEncodeH264RefPicMarkingEntry src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry reinterpret(long count) { return new StdVideoEncodeH264RefPicMarkingEntry(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoEncodeH264RefPicMarkingEntry asSlice(long index) { return new StdVideoEncodeH264RefPicMarkingEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoEncodeH264RefPicMarkingEntry asSlice(long index, long count) { return new StdVideoEncodeH264RefPicMarkingEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoEncodeH264RefPicMarkingEntry at(long index, Consumer<StdVideoEncodeH264RefPicMarkingEntry> func) { func.accept(asSlice(index)); return this; }
    public int memory_management_control_operationAt(long index) { return (int) VH_memory_management_control_operation.get(this.segment(), 0L, index); }
    public short difference_of_pic_nums_minus1At(long index) { return (short) VH_difference_of_pic_nums_minus1.get(this.segment(), 0L, index); }
    public short long_term_pic_numAt(long index) { return (short) VH_long_term_pic_num.get(this.segment(), 0L, index); }
    public short long_term_frame_idxAt(long index) { return (short) VH_long_term_frame_idx.get(this.segment(), 0L, index); }
    public short max_long_term_frame_idx_plus1At(long index) { return (short) VH_max_long_term_frame_idx_plus1.get(this.segment(), 0L, index); }
    public int memory_management_control_operation() { return (int) VH_memory_management_control_operation.get(this.segment(), 0L, 0L); }
    public short difference_of_pic_nums_minus1() { return (short) VH_difference_of_pic_nums_minus1.get(this.segment(), 0L, 0L); }
    public short long_term_pic_num() { return (short) VH_long_term_pic_num.get(this.segment(), 0L, 0L); }
    public short long_term_frame_idx() { return (short) VH_long_term_frame_idx.get(this.segment(), 0L, 0L); }
    public short max_long_term_frame_idx_plus1() { return (short) VH_max_long_term_frame_idx_plus1.get(this.segment(), 0L, 0L); }
    public StdVideoEncodeH264RefPicMarkingEntry memory_management_control_operationAt(long index, int value) { VH_memory_management_control_operation.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry difference_of_pic_nums_minus1At(long index, short value) { VH_difference_of_pic_nums_minus1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry long_term_pic_numAt(long index, short value) { VH_long_term_pic_num.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry long_term_frame_idxAt(long index, short value) { VH_long_term_frame_idx.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry max_long_term_frame_idx_plus1At(long index, short value) { VH_max_long_term_frame_idx_plus1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry memory_management_control_operation(int value) { VH_memory_management_control_operation.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry difference_of_pic_nums_minus1(short value) { VH_difference_of_pic_nums_minus1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry long_term_pic_num(short value) { VH_long_term_pic_num.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry long_term_frame_idx(short value) { VH_long_term_frame_idx.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry max_long_term_frame_idx_plus1(short value) { VH_max_long_term_frame_idx_plus1.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _memory_management_control_operationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory_management_control_operation, index), LAYOUT_memory_management_control_operation); }
    public MemorySegment _memory_management_control_operation() { return _memory_management_control_operationAt(0L); }
    public StdVideoEncodeH264RefPicMarkingEntry _memory_management_control_operationAt(long index, MemorySegment src) { _memory_management_control_operationAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry _memory_management_control_operation(MemorySegment src) { return _memory_management_control_operationAt(0L, src); }
    public MemorySegment _difference_of_pic_nums_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_difference_of_pic_nums_minus1, index), LAYOUT_difference_of_pic_nums_minus1); }
    public MemorySegment _difference_of_pic_nums_minus1() { return _difference_of_pic_nums_minus1At(0L); }
    public StdVideoEncodeH264RefPicMarkingEntry _difference_of_pic_nums_minus1At(long index, MemorySegment src) { _difference_of_pic_nums_minus1At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry _difference_of_pic_nums_minus1(MemorySegment src) { return _difference_of_pic_nums_minus1At(0L, src); }
    public MemorySegment _long_term_pic_numAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_long_term_pic_num, index), LAYOUT_long_term_pic_num); }
    public MemorySegment _long_term_pic_num() { return _long_term_pic_numAt(0L); }
    public StdVideoEncodeH264RefPicMarkingEntry _long_term_pic_numAt(long index, MemorySegment src) { _long_term_pic_numAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry _long_term_pic_num(MemorySegment src) { return _long_term_pic_numAt(0L, src); }
    public MemorySegment _long_term_frame_idxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_long_term_frame_idx, index), LAYOUT_long_term_frame_idx); }
    public MemorySegment _long_term_frame_idx() { return _long_term_frame_idxAt(0L); }
    public StdVideoEncodeH264RefPicMarkingEntry _long_term_frame_idxAt(long index, MemorySegment src) { _long_term_frame_idxAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry _long_term_frame_idx(MemorySegment src) { return _long_term_frame_idxAt(0L, src); }
    public MemorySegment _max_long_term_frame_idx_plus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_max_long_term_frame_idx_plus1, index), LAYOUT_max_long_term_frame_idx_plus1); }
    public MemorySegment _max_long_term_frame_idx_plus1() { return _max_long_term_frame_idx_plus1At(0L); }
    public StdVideoEncodeH264RefPicMarkingEntry _max_long_term_frame_idx_plus1At(long index, MemorySegment src) { _max_long_term_frame_idx_plus1At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264RefPicMarkingEntry _max_long_term_frame_idx_plus1(MemorySegment src) { return _max_long_term_frame_idx_plus1At(0L, src); }
}
