// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265ScalingLists`.
/// ## Layout
/// ```
/// struct StdVideoH265ScalingLists {
///     uint8_t ScalingList4x4[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_LISTS][STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS];
///     uint8_t ScalingList8x8[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_LISTS][STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS];
///     uint8_t ScalingList16x16[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS][STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS];
///     uint8_t ScalingList32x32[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS][STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS];
///     uint8_t ScalingListDCCoef16x16[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS];
///     uint8_t ScalingListDCCoef32x32[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS];
/// }
/// ```
public final class StdVideoH265ScalingLists extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_4X4_NUM_LISTS, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS, ValueLayout.JAVA_BYTE)).withName("ScalingList4x4"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_8X8_NUM_LISTS, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS, ValueLayout.JAVA_BYTE)).withName("ScalingList8x8"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS, ValueLayout.JAVA_BYTE)).withName("ScalingList16x16"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS, ValueLayout.JAVA_BYTE)).withName("ScalingList32x32"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS, ValueLayout.JAVA_BYTE).withName("ScalingListDCCoef16x16"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS, ValueLayout.JAVA_BYTE).withName("ScalingListDCCoef32x32")
    );
    public static final long OFFSET_ScalingList4x4 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList4x4"));
    public static final long OFFSET_ScalingList8x8 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList8x8"));
    public static final long OFFSET_ScalingList16x16 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList16x16"));
    public static final long OFFSET_ScalingList32x32 = LAYOUT.byteOffset(PathElement.groupElement("ScalingList32x32"));
    public static final long OFFSET_ScalingListDCCoef16x16 = LAYOUT.byteOffset(PathElement.groupElement("ScalingListDCCoef16x16"));
    public static final long OFFSET_ScalingListDCCoef32x32 = LAYOUT.byteOffset(PathElement.groupElement("ScalingListDCCoef32x32"));
    public static final MemoryLayout LAYOUT_ScalingList4x4 = LAYOUT.select(PathElement.groupElement("ScalingList4x4"));
    public static final MemoryLayout LAYOUT_ScalingList8x8 = LAYOUT.select(PathElement.groupElement("ScalingList8x8"));
    public static final MemoryLayout LAYOUT_ScalingList16x16 = LAYOUT.select(PathElement.groupElement("ScalingList16x16"));
    public static final MemoryLayout LAYOUT_ScalingList32x32 = LAYOUT.select(PathElement.groupElement("ScalingList32x32"));
    public static final MemoryLayout LAYOUT_ScalingListDCCoef16x16 = LAYOUT.select(PathElement.groupElement("ScalingListDCCoef16x16"));
    public static final MemoryLayout LAYOUT_ScalingListDCCoef32x32 = LAYOUT.select(PathElement.groupElement("ScalingListDCCoef32x32"));
    public static final VarHandle VH_ScalingList4x4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList4x4"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_ScalingList8x8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList8x8"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_ScalingList16x16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList16x16"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_ScalingList32x32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList32x32"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_ScalingListDCCoef16x16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingListDCCoef16x16"), PathElement.sequenceElement());
    public static final VarHandle VH_ScalingListDCCoef32x32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingListDCCoef32x32"), PathElement.sequenceElement());

    public StdVideoH265ScalingLists(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoH265ScalingLists of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoH265ScalingLists ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoH265ScalingLists ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoH265ScalingLists alloc(SegmentAllocator allocator) { return new StdVideoH265ScalingLists(allocator.allocate(LAYOUT), 1); }
    public static StdVideoH265ScalingLists alloc(SegmentAllocator allocator, long count) { return new StdVideoH265ScalingLists(allocator.allocate(LAYOUT, count), count); }
    public StdVideoH265ScalingLists copyFrom(StdVideoH265ScalingLists src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoH265ScalingLists reinterpret(long count) { return new StdVideoH265ScalingLists(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoH265ScalingLists asSlice(long index) { return new StdVideoH265ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoH265ScalingLists asSlice(long index, long count) { return new StdVideoH265ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoH265ScalingLists at(long index, Consumer<StdVideoH265ScalingLists> func) { func.accept(asSlice(index)); return this; }
    public byte ScalingList4x4At(long index, long index0, long index1) { return (byte) VH_ScalingList4x4.get(this.segment(), 0L, index, index0, index1); }
    public byte ScalingList8x8At(long index, long index0, long index1) { return (byte) VH_ScalingList8x8.get(this.segment(), 0L, index, index0, index1); }
    public byte ScalingList16x16At(long index, long index0, long index1) { return (byte) VH_ScalingList16x16.get(this.segment(), 0L, index, index0, index1); }
    public byte ScalingList32x32At(long index, long index0, long index1) { return (byte) VH_ScalingList32x32.get(this.segment(), 0L, index, index0, index1); }
    public byte ScalingListDCCoef16x16At(long index, long index0) { return (byte) VH_ScalingListDCCoef16x16.get(this.segment(), 0L, index, index0); }
    public byte ScalingListDCCoef32x32At(long index, long index0) { return (byte) VH_ScalingListDCCoef32x32.get(this.segment(), 0L, index, index0); }
    public byte ScalingList4x4(long index0, long index1) { return (byte) VH_ScalingList4x4.get(this.segment(), 0L, 0L, index0, index1); }
    public byte ScalingList8x8(long index0, long index1) { return (byte) VH_ScalingList8x8.get(this.segment(), 0L, 0L, index0, index1); }
    public byte ScalingList16x16(long index0, long index1) { return (byte) VH_ScalingList16x16.get(this.segment(), 0L, 0L, index0, index1); }
    public byte ScalingList32x32(long index0, long index1) { return (byte) VH_ScalingList32x32.get(this.segment(), 0L, 0L, index0, index1); }
    public byte ScalingListDCCoef16x16(long index0) { return (byte) VH_ScalingListDCCoef16x16.get(this.segment(), 0L, 0L, index0); }
    public byte ScalingListDCCoef32x32(long index0) { return (byte) VH_ScalingListDCCoef32x32.get(this.segment(), 0L, 0L, index0); }
    public StdVideoH265ScalingLists ScalingList4x4At(long index, long index0, long index1, byte value) { VH_ScalingList4x4.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoH265ScalingLists ScalingList8x8At(long index, long index0, long index1, byte value) { VH_ScalingList8x8.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoH265ScalingLists ScalingList16x16At(long index, long index0, long index1, byte value) { VH_ScalingList16x16.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoH265ScalingLists ScalingList32x32At(long index, long index0, long index1, byte value) { VH_ScalingList32x32.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoH265ScalingLists ScalingListDCCoef16x16At(long index, long index0, byte value) { VH_ScalingListDCCoef16x16.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265ScalingLists ScalingListDCCoef32x32At(long index, long index0, byte value) { VH_ScalingListDCCoef32x32.set(this.segment(), 0L, index, index0, value); return this; }
    public StdVideoH265ScalingLists ScalingList4x4(long index0, long index1, byte value) { VH_ScalingList4x4.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public StdVideoH265ScalingLists ScalingList8x8(long index0, long index1, byte value) { VH_ScalingList8x8.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public StdVideoH265ScalingLists ScalingList16x16(long index0, long index1, byte value) { VH_ScalingList16x16.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public StdVideoH265ScalingLists ScalingList32x32(long index0, long index1, byte value) { VH_ScalingList32x32.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public StdVideoH265ScalingLists ScalingListDCCoef16x16(long index0, byte value) { VH_ScalingListDCCoef16x16.set(this.segment(), 0L, 0L, index0, value); return this; }
    public StdVideoH265ScalingLists ScalingListDCCoef32x32(long index0, byte value) { VH_ScalingListDCCoef32x32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _ScalingList4x4At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ScalingList4x4, index), LAYOUT_ScalingList4x4); }
    public MemorySegment _ScalingList4x4() { return _ScalingList4x4At(0L); }
    public StdVideoH265ScalingLists _ScalingList4x4At(long index, MemorySegment src) { _ScalingList4x4At(index).copyFrom(src); return this; }
    public StdVideoH265ScalingLists _ScalingList4x4(MemorySegment src) { return _ScalingList4x4At(0L, src); }
    public MemorySegment _ScalingList8x8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ScalingList8x8, index), LAYOUT_ScalingList8x8); }
    public MemorySegment _ScalingList8x8() { return _ScalingList8x8At(0L); }
    public StdVideoH265ScalingLists _ScalingList8x8At(long index, MemorySegment src) { _ScalingList8x8At(index).copyFrom(src); return this; }
    public StdVideoH265ScalingLists _ScalingList8x8(MemorySegment src) { return _ScalingList8x8At(0L, src); }
    public MemorySegment _ScalingList16x16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ScalingList16x16, index), LAYOUT_ScalingList16x16); }
    public MemorySegment _ScalingList16x16() { return _ScalingList16x16At(0L); }
    public StdVideoH265ScalingLists _ScalingList16x16At(long index, MemorySegment src) { _ScalingList16x16At(index).copyFrom(src); return this; }
    public StdVideoH265ScalingLists _ScalingList16x16(MemorySegment src) { return _ScalingList16x16At(0L, src); }
    public MemorySegment _ScalingList32x32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ScalingList32x32, index), LAYOUT_ScalingList32x32); }
    public MemorySegment _ScalingList32x32() { return _ScalingList32x32At(0L); }
    public StdVideoH265ScalingLists _ScalingList32x32At(long index, MemorySegment src) { _ScalingList32x32At(index).copyFrom(src); return this; }
    public StdVideoH265ScalingLists _ScalingList32x32(MemorySegment src) { return _ScalingList32x32At(0L, src); }
    public MemorySegment _ScalingListDCCoef16x16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ScalingListDCCoef16x16, index), LAYOUT_ScalingListDCCoef16x16); }
    public MemorySegment _ScalingListDCCoef16x16() { return _ScalingListDCCoef16x16At(0L); }
    public StdVideoH265ScalingLists _ScalingListDCCoef16x16At(long index, MemorySegment src) { _ScalingListDCCoef16x16At(index).copyFrom(src); return this; }
    public StdVideoH265ScalingLists _ScalingListDCCoef16x16(MemorySegment src) { return _ScalingListDCCoef16x16At(0L, src); }
    public MemorySegment _ScalingListDCCoef32x32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ScalingListDCCoef32x32, index), LAYOUT_ScalingListDCCoef32x32); }
    public MemorySegment _ScalingListDCCoef32x32() { return _ScalingListDCCoef32x32At(0L); }
    public StdVideoH265ScalingLists _ScalingListDCCoef32x32At(long index, MemorySegment src) { _ScalingListDCCoef32x32At(index).copyFrom(src); return this; }
    public StdVideoH265ScalingLists _ScalingListDCCoef32x32(MemorySegment src) { return _ScalingListDCCoef32x32At(0L, src); }
}
