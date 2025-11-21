// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeH264WeightTable`.
/// ## Layout
/// ```
/// struct StdVideoEncodeH264WeightTable {
///     StdVideoEncodeH264WeightTableFlags flags;
///     uint8_t luma_log2_weight_denom;
///     uint8_t chroma_log2_weight_denom;
///     int8_t luma_weight_l0[STD_VIDEO_H264_MAX_NUM_LIST_REF];
///     int8_t luma_offset_l0[STD_VIDEO_H264_MAX_NUM_LIST_REF];
///     int8_t chroma_weight_l0[STD_VIDEO_H264_MAX_NUM_LIST_REF][STD_VIDEO_H264_MAX_CHROMA_PLANES];
///     int8_t chroma_offset_l0[STD_VIDEO_H264_MAX_NUM_LIST_REF][STD_VIDEO_H264_MAX_CHROMA_PLANES];
///     int8_t luma_weight_l1[STD_VIDEO_H264_MAX_NUM_LIST_REF];
///     int8_t luma_offset_l1[STD_VIDEO_H264_MAX_NUM_LIST_REF];
///     int8_t chroma_weight_l1[STD_VIDEO_H264_MAX_NUM_LIST_REF][STD_VIDEO_H264_MAX_CHROMA_PLANES];
///     int8_t chroma_offset_l1[STD_VIDEO_H264_MAX_NUM_LIST_REF][STD_VIDEO_H264_MAX_CHROMA_PLANES];
/// }
/// ```
public final class StdVideoEncodeH264WeightTable extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.struct.StdVideoEncodeH264WeightTableFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("luma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("chroma_log2_weight_denom"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_NUM_LIST_REF, ValueLayout.JAVA_BYTE).withName("luma_weight_l0"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_NUM_LIST_REF, ValueLayout.JAVA_BYTE).withName("luma_offset_l0"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_NUM_LIST_REF, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_CHROMA_PLANES, ValueLayout.JAVA_BYTE)).withName("chroma_weight_l0"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_NUM_LIST_REF, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_CHROMA_PLANES, ValueLayout.JAVA_BYTE)).withName("chroma_offset_l0"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_NUM_LIST_REF, ValueLayout.JAVA_BYTE).withName("luma_weight_l1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_NUM_LIST_REF, ValueLayout.JAVA_BYTE).withName("luma_offset_l1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_NUM_LIST_REF, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_CHROMA_PLANES, ValueLayout.JAVA_BYTE)).withName("chroma_weight_l1"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_NUM_LIST_REF, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_MAX_CHROMA_PLANES, ValueLayout.JAVA_BYTE)).withName("chroma_offset_l1")
    );
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_luma_log2_weight_denom = LAYOUT.byteOffset(PathElement.groupElement("luma_log2_weight_denom"));
    public static final long OFFSET_chroma_log2_weight_denom = LAYOUT.byteOffset(PathElement.groupElement("chroma_log2_weight_denom"));
    public static final long OFFSET_luma_weight_l0 = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l0"));
    public static final long OFFSET_luma_offset_l0 = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l0"));
    public static final long OFFSET_chroma_weight_l0 = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l0"));
    public static final long OFFSET_chroma_offset_l0 = LAYOUT.byteOffset(PathElement.groupElement("chroma_offset_l0"));
    public static final long OFFSET_luma_weight_l1 = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l1"));
    public static final long OFFSET_luma_offset_l1 = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l1"));
    public static final long OFFSET_chroma_weight_l1 = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l1"));
    public static final long OFFSET_chroma_offset_l1 = LAYOUT.byteOffset(PathElement.groupElement("chroma_offset_l1"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_luma_log2_weight_denom = LAYOUT.select(PathElement.groupElement("luma_log2_weight_denom"));
    public static final MemoryLayout LAYOUT_chroma_log2_weight_denom = LAYOUT.select(PathElement.groupElement("chroma_log2_weight_denom"));
    public static final MemoryLayout LAYOUT_luma_weight_l0 = LAYOUT.select(PathElement.groupElement("luma_weight_l0"));
    public static final MemoryLayout LAYOUT_luma_offset_l0 = LAYOUT.select(PathElement.groupElement("luma_offset_l0"));
    public static final MemoryLayout LAYOUT_chroma_weight_l0 = LAYOUT.select(PathElement.groupElement("chroma_weight_l0"));
    public static final MemoryLayout LAYOUT_chroma_offset_l0 = LAYOUT.select(PathElement.groupElement("chroma_offset_l0"));
    public static final MemoryLayout LAYOUT_luma_weight_l1 = LAYOUT.select(PathElement.groupElement("luma_weight_l1"));
    public static final MemoryLayout LAYOUT_luma_offset_l1 = LAYOUT.select(PathElement.groupElement("luma_offset_l1"));
    public static final MemoryLayout LAYOUT_chroma_weight_l1 = LAYOUT.select(PathElement.groupElement("chroma_weight_l1"));
    public static final MemoryLayout LAYOUT_chroma_offset_l1 = LAYOUT.select(PathElement.groupElement("chroma_offset_l1"));
    public static final VarHandle VH_flags$luma_weight_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"), PathElement.groupElement("luma_weight_l0_flag"));
    public static final VarHandle VH_flags$chroma_weight_l0_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"), PathElement.groupElement("chroma_weight_l0_flag"));
    public static final VarHandle VH_flags$luma_weight_l1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"), PathElement.groupElement("luma_weight_l1_flag"));
    public static final VarHandle VH_flags$chroma_weight_l1_flag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"), PathElement.groupElement("chroma_weight_l1_flag"));
    public static final VarHandle VH_luma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_log2_weight_denom"));
    public static final VarHandle VH_chroma_log2_weight_denom = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_log2_weight_denom"));
    public static final VarHandle VH_luma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l0"), PathElement.sequenceElement());
    public static final VarHandle VH_luma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l0"), PathElement.sequenceElement());
    public static final VarHandle VH_chroma_weight_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_chroma_offset_l0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_offset_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_luma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_weight_l1"), PathElement.sequenceElement());
    public static final VarHandle VH_luma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("luma_offset_l1"), PathElement.sequenceElement());
    public static final VarHandle VH_chroma_weight_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_weight_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_chroma_offset_l1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chroma_offset_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());

    public StdVideoEncodeH264WeightTable(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoEncodeH264WeightTable of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTable(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoEncodeH264WeightTable ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTable(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoEncodeH264WeightTable ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeH264WeightTable(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoEncodeH264WeightTable alloc(SegmentAllocator allocator) { return new StdVideoEncodeH264WeightTable(allocator.allocate(LAYOUT), 1); }
    public static StdVideoEncodeH264WeightTable alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeH264WeightTable(allocator.allocate(LAYOUT, count), count); }
    public StdVideoEncodeH264WeightTable copyFrom(StdVideoEncodeH264WeightTable src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoEncodeH264WeightTable reinterpret(long count) { return new StdVideoEncodeH264WeightTable(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoEncodeH264WeightTable asSlice(long index) { return new StdVideoEncodeH264WeightTable(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoEncodeH264WeightTable asSlice(long index, long count) { return new StdVideoEncodeH264WeightTable(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoEncodeH264WeightTable at(long index, Consumer<StdVideoEncodeH264WeightTable> func) { func.accept(asSlice(index)); return this; }
    public int flags$luma_weight_l0_flagAt(long index) { return (int) VH_flags$luma_weight_l0_flag.get(this.segment(), 0L, index); }
    public int flags$chroma_weight_l0_flagAt(long index) { return (int) VH_flags$chroma_weight_l0_flag.get(this.segment(), 0L, index); }
    public int flags$luma_weight_l1_flagAt(long index) { return (int) VH_flags$luma_weight_l1_flag.get(this.segment(), 0L, index); }
    public int flags$chroma_weight_l1_flagAt(long index) { return (int) VH_flags$chroma_weight_l1_flag.get(this.segment(), 0L, index); }
    public byte luma_log2_weight_denomAt(long index) { return (byte) VH_luma_log2_weight_denom.get(this.segment(), 0L, index); }
    public byte chroma_log2_weight_denomAt(long index) { return (byte) VH_chroma_log2_weight_denom.get(this.segment(), 0L, index); }
    public byte luma_weight_l0At(long index, long index0) { return (byte) VH_luma_weight_l0.get(this.segment(), 0L, index, index0); }
    public byte luma_offset_l0At(long index, long index0) { return (byte) VH_luma_offset_l0.get(this.segment(), 0L, index, index0); }
    public byte chroma_weight_l0At(long index, long index0, long index1) { return (byte) VH_chroma_weight_l0.get(this.segment(), 0L, index, index0, index1); }
    public byte chroma_offset_l0At(long index, long index0, long index1) { return (byte) VH_chroma_offset_l0.get(this.segment(), 0L, index, index0, index1); }
    public byte luma_weight_l1At(long index, long index0) { return (byte) VH_luma_weight_l1.get(this.segment(), 0L, index, index0); }
    public byte luma_offset_l1At(long index, long index0) { return (byte) VH_luma_offset_l1.get(this.segment(), 0L, index, index0); }
    public byte chroma_weight_l1At(long index, long index0, long index1) { return (byte) VH_chroma_weight_l1.get(this.segment(), 0L, index, index0, index1); }
    public byte chroma_offset_l1At(long index, long index0, long index1) { return (byte) VH_chroma_offset_l1.get(this.segment(), 0L, index, index0, index1); }
    public int flags$luma_weight_l0_flag() { return (int) VH_flags$luma_weight_l0_flag.get(this.segment(), 0L, 0L); }
    public int flags$chroma_weight_l0_flag() { return (int) VH_flags$chroma_weight_l0_flag.get(this.segment(), 0L, 0L); }
    public int flags$luma_weight_l1_flag() { return (int) VH_flags$luma_weight_l1_flag.get(this.segment(), 0L, 0L); }
    public int flags$chroma_weight_l1_flag() { return (int) VH_flags$chroma_weight_l1_flag.get(this.segment(), 0L, 0L); }
    public byte luma_log2_weight_denom() { return (byte) VH_luma_log2_weight_denom.get(this.segment(), 0L, 0L); }
    public byte chroma_log2_weight_denom() { return (byte) VH_chroma_log2_weight_denom.get(this.segment(), 0L, 0L); }
    public byte luma_weight_l0(long index0) { return (byte) VH_luma_weight_l0.get(this.segment(), 0L, 0L, index0); }
    public byte luma_offset_l0(long index0) { return (byte) VH_luma_offset_l0.get(this.segment(), 0L, 0L, index0); }
    public byte chroma_weight_l0(long index0, long index1) { return (byte) VH_chroma_weight_l0.get(this.segment(), 0L, 0L, index0, index1); }
    public byte chroma_offset_l0(long index0, long index1) { return (byte) VH_chroma_offset_l0.get(this.segment(), 0L, 0L, index0, index1); }
    public byte luma_weight_l1(long index0) { return (byte) VH_luma_weight_l1.get(this.segment(), 0L, 0L, index0); }
    public byte luma_offset_l1(long index0) { return (byte) VH_luma_offset_l1.get(this.segment(), 0L, 0L, index0); }
    public byte chroma_weight_l1(long index0, long index1) { return (byte) VH_chroma_weight_l1.get(this.segment(), 0L, 0L, index0, index1); }
    public byte chroma_offset_l1(long index0, long index1) { return (byte) VH_chroma_offset_l1.get(this.segment(), 0L, 0L, index0, index1); }
    public StdVideoEncodeH264WeightTable flags$luma_weight_l0_flagAt(long index, int value) { VH_flags$luma_weight_l0_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTable flags$chroma_weight_l0_flagAt(long index, int value) { VH_flags$chroma_weight_l0_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTable flags$luma_weight_l1_flagAt(long index, int value) { VH_flags$luma_weight_l1_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTable flags$chroma_weight_l1_flagAt(long index, int value) { VH_flags$chroma_weight_l1_flag.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTable luma_log2_weight_denomAt(long index, byte value) { VH_luma_log2_weight_denom.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_log2_weight_denomAt(long index, byte value) { VH_chroma_log2_weight_denom.set(this.segment(), 0L, index, value); return this; }
    public StdVideoEncodeH264WeightTable luma_weight_l0At(long index, long index0, byte value) { VH_luma_weight_l0.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoEncodeH264WeightTable luma_offset_l0At(long index, long index0, byte value) { VH_luma_offset_l0.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_weight_l0At(long index, long index0, long index1, byte value) { VH_chroma_weight_l0.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_offset_l0At(long index, long index0, long index1, byte value) { VH_chroma_offset_l0.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoEncodeH264WeightTable luma_weight_l1At(long index, long index0, byte value) { VH_luma_weight_l1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoEncodeH264WeightTable luma_offset_l1At(long index, long index0, byte value) { VH_luma_offset_l1.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_weight_l1At(long index, long index0, long index1, byte value) { VH_chroma_weight_l1.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_offset_l1At(long index, long index0, long index1, byte value) { VH_chroma_offset_l1.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoEncodeH264WeightTable flags$luma_weight_l0_flag(int value) { VH_flags$luma_weight_l0_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTable flags$chroma_weight_l0_flag(int value) { VH_flags$chroma_weight_l0_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTable flags$luma_weight_l1_flag(int value) { VH_flags$luma_weight_l1_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTable flags$chroma_weight_l1_flag(int value) { VH_flags$chroma_weight_l1_flag.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTable luma_log2_weight_denom(byte value) { VH_luma_log2_weight_denom.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_log2_weight_denom(byte value) { VH_chroma_log2_weight_denom.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoEncodeH264WeightTable luma_weight_l0(long index0, byte value) { VH_luma_weight_l0.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoEncodeH264WeightTable luma_offset_l0(long index0, byte value) { VH_luma_offset_l0.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_weight_l0(long index0, long index1, byte value) { VH_chroma_weight_l0.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_offset_l0(long index0, long index1, byte value) { VH_chroma_offset_l0.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public StdVideoEncodeH264WeightTable luma_weight_l1(long index0, byte value) { VH_luma_weight_l1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoEncodeH264WeightTable luma_offset_l1(long index0, byte value) { VH_luma_offset_l1.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_weight_l1(long index0, long index1, byte value) { VH_chroma_weight_l1.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public StdVideoEncodeH264WeightTable chroma_offset_l1(long index0, long index1, byte value) { VH_chroma_offset_l1.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public StdVideoEncodeH264WeightTable _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _luma_log2_weight_denomAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_log2_weight_denom, index), LAYOUT_luma_log2_weight_denom); }
    public MemorySegment _luma_log2_weight_denom() { return _luma_log2_weight_denomAt(0L); }
    public StdVideoEncodeH264WeightTable _luma_log2_weight_denomAt(long index, MemorySegment src) { _luma_log2_weight_denomAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _luma_log2_weight_denom(MemorySegment src) { return _luma_log2_weight_denomAt(0L, src); }
    public MemorySegment _chroma_log2_weight_denomAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_log2_weight_denom, index), LAYOUT_chroma_log2_weight_denom); }
    public MemorySegment _chroma_log2_weight_denom() { return _chroma_log2_weight_denomAt(0L); }
    public StdVideoEncodeH264WeightTable _chroma_log2_weight_denomAt(long index, MemorySegment src) { _chroma_log2_weight_denomAt(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _chroma_log2_weight_denom(MemorySegment src) { return _chroma_log2_weight_denomAt(0L, src); }
    public MemorySegment _luma_weight_l0At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_weight_l0, index), LAYOUT_luma_weight_l0); }
    public MemorySegment _luma_weight_l0() { return _luma_weight_l0At(0L); }
    public StdVideoEncodeH264WeightTable _luma_weight_l0At(long index, MemorySegment src) { _luma_weight_l0At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _luma_weight_l0(MemorySegment src) { return _luma_weight_l0At(0L, src); }
    public MemorySegment _luma_offset_l0At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_offset_l0, index), LAYOUT_luma_offset_l0); }
    public MemorySegment _luma_offset_l0() { return _luma_offset_l0At(0L); }
    public StdVideoEncodeH264WeightTable _luma_offset_l0At(long index, MemorySegment src) { _luma_offset_l0At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _luma_offset_l0(MemorySegment src) { return _luma_offset_l0At(0L, src); }
    public MemorySegment _chroma_weight_l0At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_weight_l0, index), LAYOUT_chroma_weight_l0); }
    public MemorySegment _chroma_weight_l0() { return _chroma_weight_l0At(0L); }
    public StdVideoEncodeH264WeightTable _chroma_weight_l0At(long index, MemorySegment src) { _chroma_weight_l0At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _chroma_weight_l0(MemorySegment src) { return _chroma_weight_l0At(0L, src); }
    public MemorySegment _chroma_offset_l0At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_offset_l0, index), LAYOUT_chroma_offset_l0); }
    public MemorySegment _chroma_offset_l0() { return _chroma_offset_l0At(0L); }
    public StdVideoEncodeH264WeightTable _chroma_offset_l0At(long index, MemorySegment src) { _chroma_offset_l0At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _chroma_offset_l0(MemorySegment src) { return _chroma_offset_l0At(0L, src); }
    public MemorySegment _luma_weight_l1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_weight_l1, index), LAYOUT_luma_weight_l1); }
    public MemorySegment _luma_weight_l1() { return _luma_weight_l1At(0L); }
    public StdVideoEncodeH264WeightTable _luma_weight_l1At(long index, MemorySegment src) { _luma_weight_l1At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _luma_weight_l1(MemorySegment src) { return _luma_weight_l1At(0L, src); }
    public MemorySegment _luma_offset_l1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_luma_offset_l1, index), LAYOUT_luma_offset_l1); }
    public MemorySegment _luma_offset_l1() { return _luma_offset_l1At(0L); }
    public StdVideoEncodeH264WeightTable _luma_offset_l1At(long index, MemorySegment src) { _luma_offset_l1At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _luma_offset_l1(MemorySegment src) { return _luma_offset_l1At(0L, src); }
    public MemorySegment _chroma_weight_l1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_weight_l1, index), LAYOUT_chroma_weight_l1); }
    public MemorySegment _chroma_weight_l1() { return _chroma_weight_l1At(0L); }
    public StdVideoEncodeH264WeightTable _chroma_weight_l1At(long index, MemorySegment src) { _chroma_weight_l1At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _chroma_weight_l1(MemorySegment src) { return _chroma_weight_l1At(0L, src); }
    public MemorySegment _chroma_offset_l1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_chroma_offset_l1, index), LAYOUT_chroma_offset_l1); }
    public MemorySegment _chroma_offset_l1() { return _chroma_offset_l1At(0L); }
    public StdVideoEncodeH264WeightTable _chroma_offset_l1At(long index, MemorySegment src) { _chroma_offset_l1At(index).copyFrom(src); return this; }
    public StdVideoEncodeH264WeightTable _chroma_offset_l1(MemorySegment src) { return _chroma_offset_l1At(0L, src); }
}
