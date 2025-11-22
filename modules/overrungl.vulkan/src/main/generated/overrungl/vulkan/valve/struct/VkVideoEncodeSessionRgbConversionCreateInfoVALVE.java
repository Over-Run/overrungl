// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`.
/// ## Layout
/// ```
/// struct VkVideoEncodeSessionRgbConversionCreateInfoVALVE {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeRgbModelConversionFlagBitsVALVE rgbModel;
///     VkVideoEncodeRgbRangeCompressionFlagBitsVALVE rgbRange;
///     VkVideoEncodeRgbChromaOffsetFlagBitsVALVE xChromaOffset;
///     VkVideoEncodeRgbChromaOffsetFlagBitsVALVE yChromaOffset;
/// }
/// ```
public final class VkVideoEncodeSessionRgbConversionCreateInfoVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rgbModel"),
        ValueLayout.JAVA_INT.withName("rgbRange"),
        ValueLayout.JAVA_INT.withName("xChromaOffset"),
        ValueLayout.JAVA_INT.withName("yChromaOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rgbModel = LAYOUT.byteOffset(PathElement.groupElement("rgbModel"));
    public static final long OFFSET_rgbRange = LAYOUT.byteOffset(PathElement.groupElement("rgbRange"));
    public static final long OFFSET_xChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffset"));
    public static final long OFFSET_yChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rgbModel = LAYOUT.select(PathElement.groupElement("rgbModel"));
    public static final MemoryLayout LAYOUT_rgbRange = LAYOUT.select(PathElement.groupElement("rgbRange"));
    public static final MemoryLayout LAYOUT_xChromaOffset = LAYOUT.select(PathElement.groupElement("xChromaOffset"));
    public static final MemoryLayout LAYOUT_yChromaOffset = LAYOUT.select(PathElement.groupElement("yChromaOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rgbModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgbModel"));
    public static final VarHandle VH_rgbRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgbRange"));
    public static final VarHandle VH_xChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xChromaOffset"));
    public static final VarHandle VH_yChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("yChromaOffset"));

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE alloc(SegmentAllocator allocator) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE); }
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE);
        return s;
    }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE copyFrom(VkVideoEncodeSessionRgbConversionCreateInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE reinterpret(long count) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE asSlice(long index) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE asSlice(long index, long count) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE at(long index, Consumer<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rgbModelAt(long index) { return (int) VH_rgbModel.get(this.segment(), 0L, index); }
    public int rgbRangeAt(long index) { return (int) VH_rgbRange.get(this.segment(), 0L, index); }
    public int xChromaOffsetAt(long index) { return (int) VH_xChromaOffset.get(this.segment(), 0L, index); }
    public int yChromaOffsetAt(long index) { return (int) VH_yChromaOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rgbModel() { return (int) VH_rgbModel.get(this.segment(), 0L, 0L); }
    public int rgbRange() { return (int) VH_rgbRange.get(this.segment(), 0L, 0L); }
    public int xChromaOffset() { return (int) VH_xChromaOffset.get(this.segment(), 0L, 0L); }
    public int yChromaOffset() { return (int) VH_yChromaOffset.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbModelAt(long index, int value) { VH_rgbModel.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbRangeAt(long index, int value) { VH_rgbRange.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE xChromaOffsetAt(long index, int value) { VH_xChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE yChromaOffsetAt(long index, int value) { VH_yChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbModel(int value) { VH_rgbModel.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbRange(int value) { VH_rgbRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE xChromaOffset(int value) { VH_xChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE yChromaOffset(int value) { VH_yChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rgbModelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rgbModel, index), LAYOUT_rgbModel); }
    public MemorySegment _rgbModel() { return _rgbModelAt(0L); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _rgbModelAt(long index, MemorySegment src) { _rgbModelAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _rgbModel(MemorySegment src) { return _rgbModelAt(0L, src); }
    public MemorySegment _rgbRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rgbRange, index), LAYOUT_rgbRange); }
    public MemorySegment _rgbRange() { return _rgbRangeAt(0L); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _rgbRangeAt(long index, MemorySegment src) { _rgbRangeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _rgbRange(MemorySegment src) { return _rgbRangeAt(0L, src); }
    public MemorySegment _xChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_xChromaOffset, index), LAYOUT_xChromaOffset); }
    public MemorySegment _xChromaOffset() { return _xChromaOffsetAt(0L); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _xChromaOffsetAt(long index, MemorySegment src) { _xChromaOffsetAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _xChromaOffset(MemorySegment src) { return _xChromaOffsetAt(0L, src); }
    public MemorySegment _yChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_yChromaOffset, index), LAYOUT_yChromaOffset); }
    public MemorySegment _yChromaOffset() { return _yChromaOffsetAt(0L); }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _yChromaOffsetAt(long index, MemorySegment src) { _yChromaOffsetAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE _yChromaOffset(MemorySegment src) { return _yChromaOffsetAt(0L, src); }
}
