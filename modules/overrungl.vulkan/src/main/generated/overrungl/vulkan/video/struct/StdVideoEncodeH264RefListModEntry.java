// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH264RefListModEntry`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH264RefListModEntry {
///     StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc;
///     uint16_t abs_diff_pic_num_minus1;
///     uint16_t long_term_pic_num;
/// }
/// ```
public final class StdVideoEncodeH264RefListModEntry extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("modification_of_pic_nums_idc"),
        ValueLayout.JAVA_SHORT.withName("abs_diff_pic_num_minus1"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num")
    );
    public static final long OFFSET_modification_of_pic_nums_idc = LAYOUT.byteOffset(PathElement.groupElement("modification_of_pic_nums_idc"));
    public static final long OFFSET_abs_diff_pic_num_minus1 = LAYOUT.byteOffset(PathElement.groupElement("abs_diff_pic_num_minus1"));
    public static final long OFFSET_long_term_pic_num = LAYOUT.byteOffset(PathElement.groupElement("long_term_pic_num"));
    public static final MemoryLayout LAYOUT_modification_of_pic_nums_idc = LAYOUT.select(PathElement.groupElement("modification_of_pic_nums_idc"));
    public static final MemoryLayout LAYOUT_abs_diff_pic_num_minus1 = LAYOUT.select(PathElement.groupElement("abs_diff_pic_num_minus1"));
    public static final MemoryLayout LAYOUT_long_term_pic_num = LAYOUT.select(PathElement.groupElement("long_term_pic_num"));
    public static final VarHandle VH_modification_of_pic_nums_idc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("modification_of_pic_nums_idc"));
    public static final VarHandle VH_abs_diff_pic_num_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("abs_diff_pic_num_minus1"));
    public static final VarHandle VH_long_term_pic_num = LAYOUT.arrayElementVarHandle(PathElement.groupElement("long_term_pic_num"));

    public StdVideoEncodeH264RefListModEntry(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoEncodeH264RefListModEntry of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264RefListModEntry(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoEncodeH264RefListModEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264RefListModEntry(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoEncodeH264RefListModEntry ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264RefListModEntry(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoEncodeH264RefListModEntry alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264RefListModEntry(allocator.allocate(LAYOUT), 1); }
    public static StdVideoEncodeH264RefListModEntry alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264RefListModEntry(allocator.allocate(LAYOUT, count), count); }
    public StdVideoEncodeH264RefListModEntry copyFrom(StdVideoEncodeH264RefListModEntry src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoEncodeH264RefListModEntry reinterpret(long count) { return new StdVideoEncodeH264RefListModEntry(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoEncodeH264RefListModEntry asSlice(long index) { return new StdVideoEncodeH264RefListModEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoEncodeH264RefListModEntry asSlice(long index, long count) { return new StdVideoEncodeH264RefListModEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoEncodeH264RefListModEntry at(long index, Consumer<StdVideoEncodeH264RefListModEntry> func) { func.accept(asSlice(index)); return this; }
    public int modification_of_pic_nums_idcAt(long index) { return (int) VH_modification_of_pic_nums_idc.get(this.segment(), 0L, index); }
    public short abs_diff_pic_num_minus1At(long index) { return (short) VH_abs_diff_pic_num_minus1.get(this.segment(), 0L, index); }
    public short long_term_pic_numAt(long index) { return (short) VH_long_term_pic_num.get(this.segment(), 0L, index); }
    public int modification_of_pic_nums_idc() { return (int) VH_modification_of_pic_nums_idc.get(this.segment(), 0L, 0L); }
    public short abs_diff_pic_num_minus1() { return (short) VH_abs_diff_pic_num_minus1.get(this.segment(), 0L, 0L); }
    public short long_term_pic_num() { return (short) VH_long_term_pic_num.get(this.segment(), 0L, 0L); }
    public StdVideoEncodeH264RefListModEntry modification_of_pic_nums_idcAt(long index, int value) { VH_modification_of_pic_nums_idc.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264RefListModEntry abs_diff_pic_num_minus1At(long index, short value) { VH_abs_diff_pic_num_minus1.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264RefListModEntry long_term_pic_numAt(long index, short value) { VH_long_term_pic_num.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264RefListModEntry modification_of_pic_nums_idc(int value) { VH_modification_of_pic_nums_idc.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264RefListModEntry abs_diff_pic_num_minus1(short value) { VH_abs_diff_pic_num_minus1.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264RefListModEntry long_term_pic_num(short value) { VH_long_term_pic_num.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _modification_of_pic_nums_idcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_modification_of_pic_nums_idc, index), LAYOUT_modification_of_pic_nums_idc); }
    public MemorySegment _modification_of_pic_nums_idc() { return _modification_of_pic_nums_idcAt(0L); }
    public StdVideoEncodeH264RefListModEntry _modification_of_pic_nums_idcAt(long index, MemorySegment src) { _modification_of_pic_nums_idcAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264RefListModEntry _modification_of_pic_nums_idc(MemorySegment src) { return _modification_of_pic_nums_idcAt(0L, src); }
    public MemorySegment _abs_diff_pic_num_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_abs_diff_pic_num_minus1, index), LAYOUT_abs_diff_pic_num_minus1); }
    public MemorySegment _abs_diff_pic_num_minus1() { return _abs_diff_pic_num_minus1At(0L); }
    public StdVideoEncodeH264RefListModEntry _abs_diff_pic_num_minus1At(long index, MemorySegment src) { _abs_diff_pic_num_minus1At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264RefListModEntry _abs_diff_pic_num_minus1(MemorySegment src) { return _abs_diff_pic_num_minus1At(0L, src); }
    public MemorySegment _long_term_pic_numAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_long_term_pic_num, index), LAYOUT_long_term_pic_num); }
    public MemorySegment _long_term_pic_num() { return _long_term_pic_numAt(0L); }
    public StdVideoEncodeH264RefListModEntry _long_term_pic_numAt(long index, MemorySegment src) { _long_term_pic_numAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264RefListModEntry _long_term_pic_num(MemorySegment src) { return _long_term_pic_numAt(0L, src); }
}
