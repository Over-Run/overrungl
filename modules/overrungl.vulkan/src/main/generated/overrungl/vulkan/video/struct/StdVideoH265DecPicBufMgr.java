// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265DecPicBufMgr`.
/// ## Layout
/// ```
/// struct StdVideoH265DecPicBufMgr {
///     uint32_t max_latency_increase_plus1[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE];
///     uint8_t max_dec_pic_buffering_minus1[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE];
///     uint8_t max_num_reorder_pics[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE];
/// }
/// ```
public final class StdVideoH265DecPicBufMgr extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SUBLAYERS_LIST_SIZE, ValueLayout.JAVA_INT).withName("max_latency_increase_plus1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SUBLAYERS_LIST_SIZE, ValueLayout.JAVA_BYTE).withName("max_dec_pic_buffering_minus1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SUBLAYERS_LIST_SIZE, ValueLayout.JAVA_BYTE).withName("max_num_reorder_pics")
    );
    public static final long OFFSET_max_latency_increase_plus1 = LAYOUT.byteOffset(PathElement.groupElement("max_latency_increase_plus1"));
    public static final long OFFSET_max_dec_pic_buffering_minus1 = LAYOUT.byteOffset(PathElement.groupElement("max_dec_pic_buffering_minus1"));
    public static final long OFFSET_max_num_reorder_pics = LAYOUT.byteOffset(PathElement.groupElement("max_num_reorder_pics"));
    public static final MemoryLayout LAYOUT_max_latency_increase_plus1 = LAYOUT.select(PathElement.groupElement("max_latency_increase_plus1"));
    public static final MemoryLayout LAYOUT_max_dec_pic_buffering_minus1 = LAYOUT.select(PathElement.groupElement("max_dec_pic_buffering_minus1"));
    public static final MemoryLayout LAYOUT_max_num_reorder_pics = LAYOUT.select(PathElement.groupElement("max_num_reorder_pics"));
    public static final VarHandle VH_max_latency_increase_plus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_latency_increase_plus1"), PathElement.sequenceElement());
    public static final VarHandle VH_max_dec_pic_buffering_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_dec_pic_buffering_minus1"), PathElement.sequenceElement());
    public static final VarHandle VH_max_num_reorder_pics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("max_num_reorder_pics"), PathElement.sequenceElement());

    public StdVideoH265DecPicBufMgr(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoH265DecPicBufMgr of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoH265DecPicBufMgr ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoH265DecPicBufMgr ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265DecPicBufMgr(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoH265DecPicBufMgr alloc(SegmentAllocator allocator) { return new StdVideoH265DecPicBufMgr(allocator.allocate(LAYOUT), 1); }
    public static StdVideoH265DecPicBufMgr alloc(SegmentAllocator allocator, long count) { return new StdVideoH265DecPicBufMgr(allocator.allocate(LAYOUT, count), count); }
    public StdVideoH265DecPicBufMgr copyFrom(StdVideoH265DecPicBufMgr src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoH265DecPicBufMgr reinterpret(long count) { return new StdVideoH265DecPicBufMgr(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoH265DecPicBufMgr asSlice(long index) { return new StdVideoH265DecPicBufMgr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoH265DecPicBufMgr asSlice(long index, long count) { return new StdVideoH265DecPicBufMgr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoH265DecPicBufMgr at(long index, Consumer<StdVideoH265DecPicBufMgr> func) { func.accept(asSlice(index)); return this; }
    public int max_latency_increase_plus1At(long index, long index0) { return (int) VH_max_latency_increase_plus1.get(this.segment(), 0L, index, index0); }
    public byte max_dec_pic_buffering_minus1At(long index, long index0) { return (byte) VH_max_dec_pic_buffering_minus1.get(this.segment(), 0L, index, index0); }
    public byte max_num_reorder_picsAt(long index, long index0) { return (byte) VH_max_num_reorder_pics.get(this.segment(), 0L, index, index0); }
    public int max_latency_increase_plus1(long index0) { return (int) VH_max_latency_increase_plus1.get(this.segment(), 0L, 0L, index0); }
    public byte max_dec_pic_buffering_minus1(long index0) { return (byte) VH_max_dec_pic_buffering_minus1.get(this.segment(), 0L, 0L, index0); }
    public byte max_num_reorder_pics(long index0) { return (byte) VH_max_num_reorder_pics.get(this.segment(), 0L, 0L, index0); }
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1At(long index, long index0, int value) { VH_max_latency_increase_plus1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1At(long index, long index0, byte value) { VH_max_dec_pic_buffering_minus1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265DecPicBufMgr max_num_reorder_picsAt(long index, long index0, byte value) { VH_max_num_reorder_pics.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(long index0, int value) { VH_max_latency_increase_plus1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(long index0, byte value) { VH_max_dec_pic_buffering_minus1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH265DecPicBufMgr max_num_reorder_pics(long index0, byte value) { VH_max_num_reorder_pics.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _max_latency_increase_plus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_max_latency_increase_plus1, index), LAYOUT_max_latency_increase_plus1); }
    public MemorySegment _max_latency_increase_plus1() { return _max_latency_increase_plus1At(0L); }
    public StdVideoH265DecPicBufMgr _max_latency_increase_plus1At(long index, MemorySegment src) { _max_latency_increase_plus1At(index).copyFrom(src); return this; }
    public StdVideoH265DecPicBufMgr _max_latency_increase_plus1(MemorySegment src) { return _max_latency_increase_plus1At(0L, src); }
    public MemorySegment _max_dec_pic_buffering_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_max_dec_pic_buffering_minus1, index), LAYOUT_max_dec_pic_buffering_minus1); }
    public MemorySegment _max_dec_pic_buffering_minus1() { return _max_dec_pic_buffering_minus1At(0L); }
    public StdVideoH265DecPicBufMgr _max_dec_pic_buffering_minus1At(long index, MemorySegment src) { _max_dec_pic_buffering_minus1At(index).copyFrom(src); return this; }
    public StdVideoH265DecPicBufMgr _max_dec_pic_buffering_minus1(MemorySegment src) { return _max_dec_pic_buffering_minus1At(0L, src); }
    public MemorySegment _max_num_reorder_picsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_max_num_reorder_pics, index), LAYOUT_max_num_reorder_pics); }
    public MemorySegment _max_num_reorder_pics() { return _max_num_reorder_picsAt(0L); }
    public StdVideoH265DecPicBufMgr _max_num_reorder_picsAt(long index, MemorySegment src) { _max_num_reorder_picsAt(index).copyFrom(src); return this; }
    public StdVideoH265DecPicBufMgr _max_num_reorder_pics(MemorySegment src) { return _max_num_reorder_picsAt(0L, src); }
}
