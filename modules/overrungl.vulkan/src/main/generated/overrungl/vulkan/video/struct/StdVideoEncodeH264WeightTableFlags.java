// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH264WeightTableFlags`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH264WeightTableFlags {
///     uint32_t luma_weight_l0_flag;
///     uint32_t chroma_weight_l0_flag;
///     uint32_t luma_weight_l1_flag;
///     uint32_t chroma_weight_l1_flag;
/// }
/// ```
public final class StdVideoEncodeH264WeightTableFlags extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("luma_weight_l0_flag"),
        ValueLayout.JAVA_INT.withName("chroma_weight_l0_flag"),
        ValueLayout.JAVA_INT.withName("luma_weight_l1_flag"),
        ValueLayout.JAVA_INT.withName("chroma_weight_l1_flag")
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

    public StdVideoEncodeH264WeightTableFlags(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoEncodeH264WeightTableFlags of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTableFlags(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoEncodeH264WeightTableFlags ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTableFlags(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoEncodeH264WeightTableFlags ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTableFlags(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoEncodeH264WeightTableFlags alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264WeightTableFlags(allocator.allocate(LAYOUT), 1); }
    public static StdVideoEncodeH264WeightTableFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264WeightTableFlags(allocator.allocate(LAYOUT, count), count); }
    public StdVideoEncodeH264WeightTableFlags copyFrom(StdVideoEncodeH264WeightTableFlags src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoEncodeH264WeightTableFlags reinterpret(long count) { return new StdVideoEncodeH264WeightTableFlags(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoEncodeH264WeightTableFlags asSlice(long index) { return new StdVideoEncodeH264WeightTableFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoEncodeH264WeightTableFlags asSlice(long index, long count) { return new StdVideoEncodeH264WeightTableFlags(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoEncodeH264WeightTableFlags at(long index, Consumer<StdVideoEncodeH264WeightTableFlags> func) { func.accept(asSlice(index)); return this; }
    public int luma_weight_l0_flagAt(long index) { return (int) VH_luma_weight_l0_flag.get(this.segment(), 0L, index); }
    public int chroma_weight_l0_flagAt(long index) { return (int) VH_chroma_weight_l0_flag.get(this.segment(), 0L, index); }
    public int luma_weight_l1_flagAt(long index) { return (int) VH_luma_weight_l1_flag.get(this.segment(), 0L, index); }
    public int chroma_weight_l1_flagAt(long index) { return (int) VH_chroma_weight_l1_flag.get(this.segment(), 0L, index); }
    public int luma_weight_l0_flag() { return (int) VH_luma_weight_l0_flag.get(this.segment(), 0L, 0L); }
    public int chroma_weight_l0_flag() { return (int) VH_chroma_weight_l0_flag.get(this.segment(), 0L, 0L); }
    public int luma_weight_l1_flag() { return (int) VH_luma_weight_l1_flag.get(this.segment(), 0L, 0L); }
    public int chroma_weight_l1_flag() { return (int) VH_chroma_weight_l1_flag.get(this.segment(), 0L, 0L); }
    public StdVideoEncodeH264WeightTableFlags luma_weight_l0_flagAt(long index, int value) { VH_luma_weight_l0_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTableFlags chroma_weight_l0_flagAt(long index, int value) { VH_chroma_weight_l0_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTableFlags luma_weight_l1_flagAt(long index, int value) { VH_luma_weight_l1_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTableFlags chroma_weight_l1_flagAt(long index, int value) { VH_chroma_weight_l1_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTableFlags luma_weight_l0_flag(int value) { VH_luma_weight_l0_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTableFlags chroma_weight_l0_flag(int value) { VH_chroma_weight_l0_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTableFlags luma_weight_l1_flag(int value) { VH_luma_weight_l1_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTableFlags chroma_weight_l1_flag(int value) { VH_chroma_weight_l1_flag.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _luma_weight_l0_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_weight_l0_flag, index), LAYOUT_luma_weight_l0_flag); }
    public MemorySegment _luma_weight_l0_flag() { return _luma_weight_l0_flagAt(0L); }
    public StdVideoEncodeH264WeightTableFlags _luma_weight_l0_flagAt(long index, MemorySegment src) { _luma_weight_l0_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTableFlags _luma_weight_l0_flag(MemorySegment src) { return _luma_weight_l0_flagAt(0L, src); }
    public MemorySegment _chroma_weight_l0_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_weight_l0_flag, index), LAYOUT_chroma_weight_l0_flag); }
    public MemorySegment _chroma_weight_l0_flag() { return _chroma_weight_l0_flagAt(0L); }
    public StdVideoEncodeH264WeightTableFlags _chroma_weight_l0_flagAt(long index, MemorySegment src) { _chroma_weight_l0_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTableFlags _chroma_weight_l0_flag(MemorySegment src) { return _chroma_weight_l0_flagAt(0L, src); }
    public MemorySegment _luma_weight_l1_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_weight_l1_flag, index), LAYOUT_luma_weight_l1_flag); }
    public MemorySegment _luma_weight_l1_flag() { return _luma_weight_l1_flagAt(0L); }
    public StdVideoEncodeH264WeightTableFlags _luma_weight_l1_flagAt(long index, MemorySegment src) { _luma_weight_l1_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTableFlags _luma_weight_l1_flag(MemorySegment src) { return _luma_weight_l1_flagAt(0L, src); }
    public MemorySegment _chroma_weight_l1_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_weight_l1_flag, index), LAYOUT_chroma_weight_l1_flag); }
    public MemorySegment _chroma_weight_l1_flag() { return _chroma_weight_l1_flagAt(0L); }
    public StdVideoEncodeH264WeightTableFlags _chroma_weight_l1_flagAt(long index, MemorySegment src) { _chroma_weight_l1_flagAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTableFlags _chroma_weight_l1_flag(MemorySegment src) { return _chroma_weight_l1_flagAt(0L, src); }
}
