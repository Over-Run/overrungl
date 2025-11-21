// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265SubLayerHrdParameters`.
/// ## Layout
/// ```
/// struct StdVideoH265SubLayerHrdParameters {
///     uint32_t bit_rate_value_minus1[STD_VIDEO_H265_CPB_CNT_LIST_SIZE];
///     uint32_t cpb_size_value_minus1[STD_VIDEO_H265_CPB_CNT_LIST_SIZE];
///     uint32_t cpb_size_du_value_minus1[STD_VIDEO_H265_CPB_CNT_LIST_SIZE];
///     uint32_t bit_rate_du_value_minus1[STD_VIDEO_H265_CPB_CNT_LIST_SIZE];
///     uint32_t cbr_flag;
/// }
/// ```
public final class StdVideoH265SubLayerHrdParameters extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_CPB_CNT_LIST_SIZE, ValueLayout.JAVA_INT).withName("bit_rate_value_minus1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_CPB_CNT_LIST_SIZE, ValueLayout.JAVA_INT).withName("cpb_size_value_minus1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_CPB_CNT_LIST_SIZE, ValueLayout.JAVA_INT).withName("cpb_size_du_value_minus1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_CPB_CNT_LIST_SIZE, ValueLayout.JAVA_INT).withName("bit_rate_du_value_minus1"),
        ValueLayout.JAVA_INT.withName("cbr_flag")
    );
    public static final long OFFSET_bit_rate_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_value_minus1"));
    public static final long OFFSET_cpb_size_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_value_minus1"));
    public static final long OFFSET_cpb_size_du_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_du_value_minus1"));
    public static final long OFFSET_bit_rate_du_value_minus1 = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_du_value_minus1"));
    public static final long OFFSET_cbr_flag = LAYOUT.byteOffset(PathElement.groupElement("cbr_flag"));
    public static final MemoryLayout LAYOUT_bit_rate_value_minus1 = LAYOUT.select(PathElement.groupElement("bit_rate_value_minus1"));
    public static final MemoryLayout LAYOUT_cpb_size_value_minus1 = LAYOUT.select(PathElement.groupElement("cpb_size_value_minus1"));
    public static final MemoryLayout LAYOUT_cpb_size_du_value_minus1 = LAYOUT.select(PathElement.groupElement("cpb_size_du_value_minus1"));
    public static final MemoryLayout LAYOUT_bit_rate_du_value_minus1 = LAYOUT.select(PathElement.groupElement("bit_rate_du_value_minus1"));
    public static final MemoryLayout LAYOUT_cbr_flag = LAYOUT.select(PathElement.groupElement("cbr_flag"));
    public static final VarHandle VH_bit_rate_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_value_minus1"), PathElement.sequenceElement());
    public static final VarHandle VH_cpb_size_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_value_minus1"), PathElement.sequenceElement());
    public static final VarHandle VH_cpb_size_du_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cpb_size_du_value_minus1"), PathElement.sequenceElement());
    public static final VarHandle VH_bit_rate_du_value_minus1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bit_rate_du_value_minus1"), PathElement.sequenceElement());
    public static final VarHandle VH_cbr_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cbr_flag"));

    public StdVideoH265SubLayerHrdParameters(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoH265SubLayerHrdParameters of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SubLayerHrdParameters(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoH265SubLayerHrdParameters ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SubLayerHrdParameters(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoH265SubLayerHrdParameters ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265SubLayerHrdParameters(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoH265SubLayerHrdParameters alloc(SegmentAllocator allocator) { return new StdVideoH265SubLayerHrdParameters(allocator.allocate(LAYOUT), 1); }
    public static StdVideoH265SubLayerHrdParameters alloc(SegmentAllocator allocator, long count) { return new StdVideoH265SubLayerHrdParameters(allocator.allocate(LAYOUT, count), count); }
    public StdVideoH265SubLayerHrdParameters copyFrom(StdVideoH265SubLayerHrdParameters src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoH265SubLayerHrdParameters reinterpret(long count) { return new StdVideoH265SubLayerHrdParameters(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoH265SubLayerHrdParameters asSlice(long index) { return new StdVideoH265SubLayerHrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoH265SubLayerHrdParameters asSlice(long index, long count) { return new StdVideoH265SubLayerHrdParameters(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoH265SubLayerHrdParameters at(long index, Consumer<StdVideoH265SubLayerHrdParameters> func) { func.accept(asSlice(index)); return this; }
    public int bit_rate_value_minus1At(long index, long index0) { return (int) VH_bit_rate_value_minus1.get(this.segment(), 0L, index, index0); }
    public int cpb_size_value_minus1At(long index, long index0) { return (int) VH_cpb_size_value_minus1.get(this.segment(), 0L, index, index0); }
    public int cpb_size_du_value_minus1At(long index, long index0) { return (int) VH_cpb_size_du_value_minus1.get(this.segment(), 0L, index, index0); }
    public int bit_rate_du_value_minus1At(long index, long index0) { return (int) VH_bit_rate_du_value_minus1.get(this.segment(), 0L, index, index0); }
    public int cbr_flagAt(long index) { return (int) VH_cbr_flag.get(this.segment(), 0L, index); }
    public int bit_rate_value_minus1(long index0) { return (int) VH_bit_rate_value_minus1.get(this.segment(), 0L, 0L, index0); }
    public int cpb_size_value_minus1(long index0) { return (int) VH_cpb_size_value_minus1.get(this.segment(), 0L, 0L, index0); }
    public int cpb_size_du_value_minus1(long index0) { return (int) VH_cpb_size_du_value_minus1.get(this.segment(), 0L, 0L, index0); }
    public int bit_rate_du_value_minus1(long index0) { return (int) VH_bit_rate_du_value_minus1.get(this.segment(), 0L, 0L, index0); }
    public int cbr_flag() { return (int) VH_cbr_flag.get(this.segment(), 0L, 0L); }
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1At(long index, long index0, int value) { VH_bit_rate_value_minus1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1At(long index, long index0, int value) { VH_cpb_size_value_minus1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1At(long index, long index0, int value) { VH_cpb_size_du_value_minus1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1At(long index, long index0, int value) { VH_bit_rate_du_value_minus1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265SubLayerHrdParameters cbr_flagAt(long index, int value) { VH_cbr_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(long index0, int value) { VH_bit_rate_value_minus1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(long index0, int value) { VH_cpb_size_value_minus1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(long index0, int value) { VH_cpb_size_du_value_minus1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(long index0, int value) { VH_bit_rate_du_value_minus1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH265SubLayerHrdParameters cbr_flag(int value) { VH_cbr_flag.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bit_rate_value_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bit_rate_value_minus1, index), LAYOUT_bit_rate_value_minus1); }
    public MemorySegment _bit_rate_value_minus1() { return _bit_rate_value_minus1At(0L); }
    public StdVideoH265SubLayerHrdParameters _bit_rate_value_minus1At(long index, MemorySegment src) { _bit_rate_value_minus1At(index).copyFrom(src); return this; }
    public StdVideoH265SubLayerHrdParameters _bit_rate_value_minus1(MemorySegment src) { return _bit_rate_value_minus1At(0L, src); }
    public MemorySegment _cpb_size_value_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cpb_size_value_minus1, index), LAYOUT_cpb_size_value_minus1); }
    public MemorySegment _cpb_size_value_minus1() { return _cpb_size_value_minus1At(0L); }
    public StdVideoH265SubLayerHrdParameters _cpb_size_value_minus1At(long index, MemorySegment src) { _cpb_size_value_minus1At(index).copyFrom(src); return this; }
    public StdVideoH265SubLayerHrdParameters _cpb_size_value_minus1(MemorySegment src) { return _cpb_size_value_minus1At(0L, src); }
    public MemorySegment _cpb_size_du_value_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cpb_size_du_value_minus1, index), LAYOUT_cpb_size_du_value_minus1); }
    public MemorySegment _cpb_size_du_value_minus1() { return _cpb_size_du_value_minus1At(0L); }
    public StdVideoH265SubLayerHrdParameters _cpb_size_du_value_minus1At(long index, MemorySegment src) { _cpb_size_du_value_minus1At(index).copyFrom(src); return this; }
    public StdVideoH265SubLayerHrdParameters _cpb_size_du_value_minus1(MemorySegment src) { return _cpb_size_du_value_minus1At(0L, src); }
    public MemorySegment _bit_rate_du_value_minus1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bit_rate_du_value_minus1, index), LAYOUT_bit_rate_du_value_minus1); }
    public MemorySegment _bit_rate_du_value_minus1() { return _bit_rate_du_value_minus1At(0L); }
    public StdVideoH265SubLayerHrdParameters _bit_rate_du_value_minus1At(long index, MemorySegment src) { _bit_rate_du_value_minus1At(index).copyFrom(src); return this; }
    public StdVideoH265SubLayerHrdParameters _bit_rate_du_value_minus1(MemorySegment src) { return _bit_rate_du_value_minus1At(0L, src); }
    public MemorySegment _cbr_flagAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cbr_flag, index), LAYOUT_cbr_flag); }
    public MemorySegment _cbr_flag() { return _cbr_flagAt(0L); }
    public StdVideoH265SubLayerHrdParameters _cbr_flagAt(long index, MemorySegment src) { _cbr_flagAt(index).copyFrom(src); return this; }
    public StdVideoH265SubLayerHrdParameters _cbr_flag(MemorySegment src) { return _cbr_flagAt(0L, src); }
}
