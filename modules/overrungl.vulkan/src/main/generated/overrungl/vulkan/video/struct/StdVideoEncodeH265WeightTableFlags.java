// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH265WeightTableFlags`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH265WeightTableFlags {
///     uint16_t luma_weight_l0_flag;
///     uint16_t chroma_weight_l0_flag;
///     uint16_t luma_weight_l1_flag;
///     uint16_t chroma_weight_l1_flag;
/// }
/// ```
public final class StdVideoEncodeH265WeightTableFlags extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("luma_weight_l0_flag"),
        ValueLayout.JAVA_SHORT.withName("chroma_weight_l0_flag"),
        ValueLayout.JAVA_SHORT.withName("luma_weight_l1_flag"),
        ValueLayout.JAVA_SHORT.withName("chroma_weight_l1_flag")
    );
    public static final long OFFSET_luma_weight_l0_flag = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l0_flag"));
    public static final long OFFSET_chroma_weight_l0_flag = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l0_flag"));
    public static final long OFFSET_luma_weight_l1_flag = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l1_flag"));
    public static final long OFFSET_chroma_weight_l1_flag = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l1_flag"));
    public static final MemoryLayout LAYOUT_luma_weight_l0_flag = LAYOUT.select(PathElement.groupElement("luma_weight_l0_flag"));
    public static final MemoryLayout LAYOUT_chroma_weight_l0_flag = LAYOUT.select(PathElement.groupElement("chroma_weight_l0_flag"));
    public static final MemoryLayout LAYOUT_luma_weight_l1_flag = LAYOUT.select(PathElement.groupElement("luma_weight_l1_flag"));
    public static final MemoryLayout LAYOUT_chroma_weight_l1_flag = LAYOUT.select(PathElement.groupElement("chroma_weight_l1_flag"));
    public static final VarHandle VH_luma_weight_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l0_flag"));
    public static final VarHandle VH_chroma_weight_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l0_flag"));
    public static final VarHandle VH_luma_weight_l1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l1_flag"));
    public static final VarHandle VH_chroma_weight_l1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l1_flag"));

    public StdVideoEncodeH265WeightTableFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoEncodeH265WeightTableFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTableFlags(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoEncodeH265WeightTableFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTableFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoEncodeH265WeightTableFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH265WeightTableFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoEncodeH265WeightTableFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH265WeightTableFlags(allocator.allocate(LAYOUT), 1); }
    public static StdVideoEncodeH265WeightTableFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH265WeightTableFlags(allocator.allocate(LAYOUT, count), count); }
    public StdVideoEncodeH265WeightTableFlags copyFrom(StdVideoEncodeH265WeightTableFlags src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoEncodeH265WeightTableFlags reinterpret(long count) { return new StdVideoEncodeH265WeightTableFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoEncodeH265WeightTableFlags asSlice(long index) { return new StdVideoEncodeH265WeightTableFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoEncodeH265WeightTableFlags asSlice(long index, long count) { return new StdVideoEncodeH265WeightTableFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoEncodeH265WeightTableFlags at(long index, Consumer<StdVideoEncodeH265WeightTableFlags> func) { func.accept(asSlice(index)); return this; }
    public short luma_weight_l0_flagAt(long index) { return (short) VH_luma_weight_l0_flag.get(this.segment(), 0L, index); }
    public short chroma_weight_l0_flagAt(long index) { return (short) VH_chroma_weight_l0_flag.get(this.segment(), 0L, index); }
    public short luma_weight_l1_flagAt(long index) { return (short) VH_luma_weight_l1_flag.get(this.segment(), 0L, index); }
    public short chroma_weight_l1_flagAt(long index) { return (short) VH_chroma_weight_l1_flag.get(this.segment(), 0L, index); }
    public short luma_weight_l0_flag() { return (short) VH_luma_weight_l0_flag.get(this.segment(), 0L, 0L); }
    public short chroma_weight_l0_flag() { return (short) VH_chroma_weight_l0_flag.get(this.segment(), 0L, 0L); }
    public short luma_weight_l1_flag() { return (short) VH_luma_weight_l1_flag.get(this.segment(), 0L, 0L); }
    public short chroma_weight_l1_flag() { return (short) VH_chroma_weight_l1_flag.get(this.segment(), 0L, 0L); }
    public StdVideoEncodeH265WeightTableFlags luma_weight_l0_flagAt(long index, short value) { VH_luma_weight_l0_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l0_flagAt(long index, short value) { VH_chroma_weight_l0_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH265WeightTableFlags luma_weight_l1_flagAt(long index, short value) { VH_luma_weight_l1_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l1_flagAt(long index, short value) { VH_chroma_weight_l1_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH265WeightTableFlags luma_weight_l0_flag(short value) { VH_luma_weight_l0_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l0_flag(short value) { VH_chroma_weight_l0_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH265WeightTableFlags luma_weight_l1_flag(short value) { VH_luma_weight_l1_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH265WeightTableFlags chroma_weight_l1_flag(short value) { VH_chroma_weight_l1_flag.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _luma_weight_l0_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_weight_l0_flag, index), LAYOUT_luma_weight_l0_flag); }
    public MemorySegment _luma_weight_l0_flag() { return _luma_weight_l0_flagAt(0L); }
    public StdVideoEncodeH265WeightTableFlags _luma_weight_l0_flagAt(long index, MemorySegment src) { _luma_weight_l0_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265WeightTableFlags _luma_weight_l0_flag(MemorySegment src) { return _luma_weight_l0_flagAt(0L, src); }
    public MemorySegment _chroma_weight_l0_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_weight_l0_flag, index), LAYOUT_chroma_weight_l0_flag); }
    public MemorySegment _chroma_weight_l0_flag() { return _chroma_weight_l0_flagAt(0L); }
    public StdVideoEncodeH265WeightTableFlags _chroma_weight_l0_flagAt(long index, MemorySegment src) { _chroma_weight_l0_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265WeightTableFlags _chroma_weight_l0_flag(MemorySegment src) { return _chroma_weight_l0_flagAt(0L, src); }
    public MemorySegment _luma_weight_l1_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_weight_l1_flag, index), LAYOUT_luma_weight_l1_flag); }
    public MemorySegment _luma_weight_l1_flag() { return _luma_weight_l1_flagAt(0L); }
    public StdVideoEncodeH265WeightTableFlags _luma_weight_l1_flagAt(long index, MemorySegment src) { _luma_weight_l1_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265WeightTableFlags _luma_weight_l1_flag(MemorySegment src) { return _luma_weight_l1_flagAt(0L, src); }
    public MemorySegment _chroma_weight_l1_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_weight_l1_flag, index), LAYOUT_chroma_weight_l1_flag); }
    public MemorySegment _chroma_weight_l1_flag() { return _chroma_weight_l1_flagAt(0L); }
    public StdVideoEncodeH265WeightTableFlags _chroma_weight_l1_flagAt(long index, MemorySegment src) { _chroma_weight_l1_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH265WeightTableFlags _chroma_weight_l1_flag(MemorySegment src) { return _chroma_weight_l1_flagAt(0L, src); }
}
