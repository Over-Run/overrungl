// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH264ScalingLists`.
/// ## Layout
/// ```
/// struct StdVideoH264ScalingLists {
///     uint16_t scaling_list_present_mask;
///     uint16_t use_default_scaling_matrix_mask;
///     uint8_t ScalingList4x4[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_LISTS][STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS];
///     uint8_t ScalingList8x8[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_LISTS][STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS];
/// }
/// ```
public final class StdVideoH264ScalingLists extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("scaling_list_present_mask"),
        ValueLayout.JAVA_SHORT.withName("use_default_scaling_matrix_mask"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_SCALING_LIST_4X4_NUM_LISTS, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS, ValueLayout.JAVA_BYTE)).withName("ScalingList4x4"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_SCALING_LIST_8X8_NUM_LISTS, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH264std.STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS, ValueLayout.JAVA_BYTE)).withName("ScalingList8x8")
    );
    public static final long OFFSET_scaling_list_present_mask = LAYOUT.byteOffset(PathElement.groupElement("scaling_list_present_mask"));
    public static final long OFFSET_use_default_scaling_matrix_mask = LAYOUT.byteOffset(PathElement.groupElement("use_default_scaling_matrix_mask"));
    public static final long OFFSET_ScalingList4x4 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList4x4"));
    public static final long OFFSET_ScalingList8x8 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList8x8"));
    public static final MemoryLayout LAYOUT_scaling_list_present_mask = LAYOUT.select(PathElement.groupElement("scaling_list_present_mask"));
    public static final MemoryLayout LAYOUT_use_default_scaling_matrix_mask = LAYOUT.select(PathElement.groupElement("use_default_scaling_matrix_mask"));
    public static final MemoryLayout LAYOUT_ScalingList4x4 = LAYOUT.select(PathElement.groupElement("ScalingList4x4"));
    public static final MemoryLayout LAYOUT_ScalingList8x8 = LAYOUT.select(PathElement.groupElement("ScalingList8x8"));
    public static final VarHandle VH_scaling_list_present_mask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scaling_list_present_mask"));
    public static final VarHandle VH_use_default_scaling_matrix_mask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use_default_scaling_matrix_mask"));
    public static final VarHandle VH_ScalingList4x4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList4x4"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_ScalingList8x8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList8x8"), PathElement.sequenceElement(), PathElement.sequenceElement());

    public StdVideoH264ScalingLists(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoH264ScalingLists of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264ScalingLists(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoH264ScalingLists ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264ScalingLists(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoH264ScalingLists ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH264ScalingLists(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoH264ScalingLists alloc(SegmentAllocator allocator) { return new StdVideoH264ScalingLists(allocator.allocate(LAYOUT), 1); }
    public static StdVideoH264ScalingLists alloc(SegmentAllocator allocator, long count) { return new StdVideoH264ScalingLists(allocator.allocate(LAYOUT, count), count); }
    public StdVideoH264ScalingLists copyFrom(StdVideoH264ScalingLists src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoH264ScalingLists reinterpret(long count) { return new StdVideoH264ScalingLists(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoH264ScalingLists asSlice(long index) { return new StdVideoH264ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoH264ScalingLists asSlice(long index, long count) { return new StdVideoH264ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoH264ScalingLists at(long index, Consumer<StdVideoH264ScalingLists> func) { func.accept(asSlice(index)); return this; }
    public short scaling_list_present_maskAt(long index) { return (short) VH_scaling_list_present_mask.get(this.segment(), 0L, index); }
    public short use_default_scaling_matrix_maskAt(long index) { return (short) VH_use_default_scaling_matrix_mask.get(this.segment(), 0L, index); }
    public byte ScalingList4x4At(long index, long index0, long index1) { return (byte) VH_ScalingList4x4.get(this.segment(), 0L, index, index0, index1); }
    public byte ScalingList8x8At(long index, long index0, long index1) { return (byte) VH_ScalingList8x8.get(this.segment(), 0L, index, index0, index1); }
    public short scaling_list_present_mask() { return (short) VH_scaling_list_present_mask.get(this.segment(), 0L, 0L); }
    public short use_default_scaling_matrix_mask() { return (short) VH_use_default_scaling_matrix_mask.get(this.segment(), 0L, 0L); }
    public byte ScalingList4x4(long index0, long index1) { return (byte) VH_ScalingList4x4.get(this.segment(), 0L, 0L, index0, index1); }
    public byte ScalingList8x8(long index0, long index1) { return (byte) VH_ScalingList8x8.get(this.segment(), 0L, 0L, index0, index1); }
    public StdVideoH264ScalingLists scaling_list_present_maskAt(long index, short value) { VH_scaling_list_present_mask.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264ScalingLists use_default_scaling_matrix_maskAt(long index, short value) { VH_use_default_scaling_matrix_mask.set(this.segment(), 0L, index, value); return this; }
    public StdVideoH264ScalingLists ScalingList4x4At(long index, long index0, long index1, byte value) { VH_ScalingList4x4.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoH264ScalingLists ScalingList8x8At(long index, long index0, long index1, byte value) { VH_ScalingList8x8.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoH264ScalingLists scaling_list_present_mask(short value) { VH_scaling_list_present_mask.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264ScalingLists use_default_scaling_matrix_mask(short value) { VH_use_default_scaling_matrix_mask.set(this.segment(), 0L, 0L, value); return this; }
    public StdVideoH264ScalingLists ScalingList4x4(long index0, long index1, byte value) { VH_ScalingList4x4.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public StdVideoH264ScalingLists ScalingList8x8(long index0, long index1, byte value) { VH_ScalingList8x8.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public MemorySegment _scaling_list_present_maskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scaling_list_present_mask, index), LAYOUT_scaling_list_present_mask); }
    public MemorySegment _scaling_list_present_mask() { return _scaling_list_present_maskAt(0L); }
    public StdVideoH264ScalingLists _scaling_list_present_maskAt(long index, MemorySegment src) { _scaling_list_present_maskAt(index).copyFrom(src); return this; }
    public StdVideoH264ScalingLists _scaling_list_present_mask(MemorySegment src) { return _scaling_list_present_maskAt(0L, src); }
    public MemorySegment _use_default_scaling_matrix_maskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_use_default_scaling_matrix_mask, index), LAYOUT_use_default_scaling_matrix_mask); }
    public MemorySegment _use_default_scaling_matrix_mask() { return _use_default_scaling_matrix_maskAt(0L); }
    public StdVideoH264ScalingLists _use_default_scaling_matrix_maskAt(long index, MemorySegment src) { _use_default_scaling_matrix_maskAt(index).copyFrom(src); return this; }
    public StdVideoH264ScalingLists _use_default_scaling_matrix_mask(MemorySegment src) { return _use_default_scaling_matrix_maskAt(0L, src); }
    public MemorySegment _ScalingList4x4At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ScalingList4x4, index), LAYOUT_ScalingList4x4); }
    public MemorySegment _ScalingList4x4() { return _ScalingList4x4At(0L); }
    public StdVideoH264ScalingLists _ScalingList4x4At(long index, MemorySegment src) { _ScalingList4x4At(index).copyFrom(src); return this; }
    public StdVideoH264ScalingLists _ScalingList4x4(MemorySegment src) { return _ScalingList4x4At(0L, src); }
    public MemorySegment _ScalingList8x8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ScalingList8x8, index), LAYOUT_ScalingList8x8); }
    public MemorySegment _ScalingList8x8() { return _ScalingList8x8At(0L); }
    public StdVideoH264ScalingLists _ScalingList8x8At(long index, MemorySegment src) { _ScalingList8x8At(index).copyFrom(src); return this; }
    public StdVideoH264ScalingLists _ScalingList8x8(MemorySegment src) { return _ScalingList8x8At(0L, src); }
}
