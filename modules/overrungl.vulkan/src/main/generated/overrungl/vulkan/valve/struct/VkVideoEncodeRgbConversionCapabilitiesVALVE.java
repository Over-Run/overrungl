// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeRgbConversionCapabilitiesVALVE`.
/// ## Layout
/// ```
/// struct VkVideoEncodeRgbConversionCapabilitiesVALVE {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeRgbModelConversionFlagsVALVE rgbModels;
///     VkVideoEncodeRgbRangeCompressionFlagsVALVE rgbRanges;
///     VkVideoEncodeRgbChromaOffsetFlagsVALVE xChromaOffsets;
///     VkVideoEncodeRgbChromaOffsetFlagsVALVE yChromaOffsets;
/// }
/// ```
public final class VkVideoEncodeRgbConversionCapabilitiesVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rgbModels"),
        ValueLayout.JAVA_INT.withName("rgbRanges"),
        ValueLayout.JAVA_INT.withName("xChromaOffsets"),
        ValueLayout.JAVA_INT.withName("yChromaOffsets")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rgbModels = LAYOUT.byteOffset(PathElement.groupElement("rgbModels"));
    public static final long OFFSET_rgbRanges = LAYOUT.byteOffset(PathElement.groupElement("rgbRanges"));
    public static final long OFFSET_xChromaOffsets = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffsets"));
    public static final long OFFSET_yChromaOffsets = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffsets"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rgbModels = LAYOUT.select(PathElement.groupElement("rgbModels"));
    public static final MemoryLayout LAYOUT_rgbRanges = LAYOUT.select(PathElement.groupElement("rgbRanges"));
    public static final MemoryLayout LAYOUT_xChromaOffsets = LAYOUT.select(PathElement.groupElement("xChromaOffsets"));
    public static final MemoryLayout LAYOUT_yChromaOffsets = LAYOUT.select(PathElement.groupElement("yChromaOffsets"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rgbModels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgbModels"));
    public static final VarHandle VH_rgbRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgbRanges"));
    public static final VarHandle VH_xChromaOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xChromaOffsets"));
    public static final VarHandle VH_yChromaOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("yChromaOffsets"));

    public VkVideoEncodeRgbConversionCapabilitiesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE alloc(SegmentAllocator allocator) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE); }
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE);
        return s;
    }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE copyFrom(VkVideoEncodeRgbConversionCapabilitiesVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE reinterpret(long count) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE asSlice(long index) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE asSlice(long index, long count) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE at(long index, Consumer<VkVideoEncodeRgbConversionCapabilitiesVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rgbModelsAt(long index) { return (int) VH_rgbModels.get(this.segment(), 0L, index); }
    public int rgbRangesAt(long index) { return (int) VH_rgbRanges.get(this.segment(), 0L, index); }
    public int xChromaOffsetsAt(long index) { return (int) VH_xChromaOffsets.get(this.segment(), 0L, index); }
    public int yChromaOffsetsAt(long index) { return (int) VH_yChromaOffsets.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rgbModels() { return (int) VH_rgbModels.get(this.segment(), 0L, 0L); }
    public int rgbRanges() { return (int) VH_rgbRanges.get(this.segment(), 0L, 0L); }
    public int xChromaOffsets() { return (int) VH_xChromaOffsets.get(this.segment(), 0L, 0L); }
    public int yChromaOffsets() { return (int) VH_yChromaOffsets.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbModelsAt(long index, int value) { VH_rgbModels.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbRangesAt(long index, int value) { VH_rgbRanges.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE xChromaOffsetsAt(long index, int value) { VH_xChromaOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE yChromaOffsetsAt(long index, int value) { VH_yChromaOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbModels(int value) { VH_rgbModels.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbRanges(int value) { VH_rgbRanges.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE xChromaOffsets(int value) { VH_xChromaOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE yChromaOffsets(int value) { VH_yChromaOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rgbModelsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rgbModels, index), LAYOUT_rgbModels); }
    public MemorySegment _rgbModels() { return _rgbModelsAt(0L); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _rgbModelsAt(long index, MemorySegment src) { _rgbModelsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _rgbModels(MemorySegment src) { return _rgbModelsAt(0L, src); }
    public MemorySegment _rgbRangesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rgbRanges, index), LAYOUT_rgbRanges); }
    public MemorySegment _rgbRanges() { return _rgbRangesAt(0L); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _rgbRangesAt(long index, MemorySegment src) { _rgbRangesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _rgbRanges(MemorySegment src) { return _rgbRangesAt(0L, src); }
    public MemorySegment _xChromaOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_xChromaOffsets, index), LAYOUT_xChromaOffsets); }
    public MemorySegment _xChromaOffsets() { return _xChromaOffsetsAt(0L); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _xChromaOffsetsAt(long index, MemorySegment src) { _xChromaOffsetsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _xChromaOffsets(MemorySegment src) { return _xChromaOffsetsAt(0L, src); }
    public MemorySegment _yChromaOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_yChromaOffsets, index), LAYOUT_yChromaOffsets); }
    public MemorySegment _yChromaOffsets() { return _yChromaOffsetsAt(0L); }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _yChromaOffsetsAt(long index, MemorySegment src) { _yChromaOffsetsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRgbConversionCapabilitiesVALVE _yChromaOffsets(MemorySegment src) { return _yChromaOffsetsAt(0L, src); }
}
