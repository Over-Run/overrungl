// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qnx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkScreenBufferFormatPropertiesQNX`.
/// ## Layout
/// ```
/// struct VkScreenBufferFormatPropertiesQNX {
///     VkStructureType sType;
///     void* pNext;
///     VkFormat format;
///     uint64_t externalFormat;
///     uint64_t screenUsage;
///     VkFormatFeatureFlags formatFeatures;
///     VkComponentMapping samplerYcbcrConversionComponents;
///     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     VkSamplerYcbcrRange suggestedYcbcrRange;
///     VkChromaLocation suggestedXChromaOffset;
///     VkChromaLocation suggestedYChromaOffset;
/// }
/// ```
public final class VkScreenBufferFormatPropertiesQNX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
        ValueLayout.JAVA_LONG.withName("screenUsage"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_externalFormat = LAYOUT.byteOffset(PathElement.groupElement("externalFormat"));
    public static final long OFFSET_screenUsage = LAYOUT.byteOffset(PathElement.groupElement("screenUsage"));
    public static final long OFFSET_formatFeatures = LAYOUT.byteOffset(PathElement.groupElement("formatFeatures"));
    public static final long OFFSET_samplerYcbcrConversionComponents = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversionComponents"));
    public static final long OFFSET_suggestedYcbcrModel = LAYOUT.byteOffset(PathElement.groupElement("suggestedYcbcrModel"));
    public static final long OFFSET_suggestedYcbcrRange = LAYOUT.byteOffset(PathElement.groupElement("suggestedYcbcrRange"));
    public static final long OFFSET_suggestedXChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("suggestedXChromaOffset"));
    public static final long OFFSET_suggestedYChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("suggestedYChromaOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_externalFormat = LAYOUT.select(PathElement.groupElement("externalFormat"));
    public static final MemoryLayout LAYOUT_screenUsage = LAYOUT.select(PathElement.groupElement("screenUsage"));
    public static final MemoryLayout LAYOUT_formatFeatures = LAYOUT.select(PathElement.groupElement("formatFeatures"));
    public static final MemoryLayout LAYOUT_samplerYcbcrConversionComponents = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversionComponents"));
    public static final MemoryLayout LAYOUT_suggestedYcbcrModel = LAYOUT.select(PathElement.groupElement("suggestedYcbcrModel"));
    public static final MemoryLayout LAYOUT_suggestedYcbcrRange = LAYOUT.select(PathElement.groupElement("suggestedYcbcrRange"));
    public static final MemoryLayout LAYOUT_suggestedXChromaOffset = LAYOUT.select(PathElement.groupElement("suggestedXChromaOffset"));
    public static final MemoryLayout LAYOUT_suggestedYChromaOffset = LAYOUT.select(PathElement.groupElement("suggestedYChromaOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_externalFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat"));
    public static final VarHandle VH_screenUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("screenUsage"));
    public static final VarHandle VH_formatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatFeatures"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("r"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("g"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("b"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("a"));
    public static final VarHandle VH_suggestedYcbcrModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrModel"));
    public static final VarHandle VH_suggestedYcbcrRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrRange"));
    public static final VarHandle VH_suggestedXChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedXChromaOffset"));
    public static final VarHandle VH_suggestedYChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYChromaOffset"));

    public VkScreenBufferFormatPropertiesQNX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkScreenBufferFormatPropertiesQNX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenBufferFormatPropertiesQNX(segment, estimateCount(segment, LAYOUT)); }
    public static VkScreenBufferFormatPropertiesQNX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenBufferFormatPropertiesQNX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkScreenBufferFormatPropertiesQNX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenBufferFormatPropertiesQNX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkScreenBufferFormatPropertiesQNX alloc(SegmentAllocator allocator) { return new VkScreenBufferFormatPropertiesQNX(allocator.allocate(LAYOUT), 1); }
    public static VkScreenBufferFormatPropertiesQNX alloc(SegmentAllocator allocator, long count) { return new VkScreenBufferFormatPropertiesQNX(allocator.allocate(LAYOUT, count), count); }
    public static VkScreenBufferFormatPropertiesQNX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qnx.VKQNXExternalMemoryScreenBuffer.VK_STRUCTURE_TYPE_SCREEN_BUFFER_FORMAT_PROPERTIES_QNX); }
    public static VkScreenBufferFormatPropertiesQNX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qnx.VKQNXExternalMemoryScreenBuffer.VK_STRUCTURE_TYPE_SCREEN_BUFFER_FORMAT_PROPERTIES_QNX);
        return s;
    }
    public VkScreenBufferFormatPropertiesQNX copyFrom(VkScreenBufferFormatPropertiesQNX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkScreenBufferFormatPropertiesQNX reinterpret(long count) { return new VkScreenBufferFormatPropertiesQNX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkScreenBufferFormatPropertiesQNX asSlice(long index) { return new VkScreenBufferFormatPropertiesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkScreenBufferFormatPropertiesQNX asSlice(long index, long count) { return new VkScreenBufferFormatPropertiesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkScreenBufferFormatPropertiesQNX at(long index, Consumer<VkScreenBufferFormatPropertiesQNX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public long externalFormatAt(long index) { return (long) VH_externalFormat.get(this.segment(), 0L, index); }
    public long screenUsageAt(long index) { return (long) VH_screenUsage.get(this.segment(), 0L, index); }
    public int formatFeaturesAt(long index) { return (int) VH_formatFeatures.get(this.segment(), 0L, index); }
    public int samplerYcbcrConversionComponents$rAt(long index) { return (int) VH_samplerYcbcrConversionComponents$r.get(this.segment(), 0L, index); }
    public int samplerYcbcrConversionComponents$gAt(long index) { return (int) VH_samplerYcbcrConversionComponents$g.get(this.segment(), 0L, index); }
    public int samplerYcbcrConversionComponents$bAt(long index) { return (int) VH_samplerYcbcrConversionComponents$b.get(this.segment(), 0L, index); }
    public int samplerYcbcrConversionComponents$aAt(long index) { return (int) VH_samplerYcbcrConversionComponents$a.get(this.segment(), 0L, index); }
    public int suggestedYcbcrModelAt(long index) { return (int) VH_suggestedYcbcrModel.get(this.segment(), 0L, index); }
    public int suggestedYcbcrRangeAt(long index) { return (int) VH_suggestedYcbcrRange.get(this.segment(), 0L, index); }
    public int suggestedXChromaOffsetAt(long index) { return (int) VH_suggestedXChromaOffset.get(this.segment(), 0L, index); }
    public int suggestedYChromaOffsetAt(long index) { return (int) VH_suggestedYChromaOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public long externalFormat() { return (long) VH_externalFormat.get(this.segment(), 0L, 0L); }
    public long screenUsage() { return (long) VH_screenUsage.get(this.segment(), 0L, 0L); }
    public int formatFeatures() { return (int) VH_formatFeatures.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$r() { return (int) VH_samplerYcbcrConversionComponents$r.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$g() { return (int) VH_samplerYcbcrConversionComponents$g.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$b() { return (int) VH_samplerYcbcrConversionComponents$b.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$a() { return (int) VH_samplerYcbcrConversionComponents$a.get(this.segment(), 0L, 0L); }
    public int suggestedYcbcrModel() { return (int) VH_suggestedYcbcrModel.get(this.segment(), 0L, 0L); }
    public int suggestedYcbcrRange() { return (int) VH_suggestedYcbcrRange.get(this.segment(), 0L, 0L); }
    public int suggestedXChromaOffset() { return (int) VH_suggestedXChromaOffset.get(this.segment(), 0L, 0L); }
    public int suggestedYChromaOffset() { return (int) VH_suggestedYChromaOffset.get(this.segment(), 0L, 0L); }
    public VkScreenBufferFormatPropertiesQNX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX externalFormatAt(long index, long value) { VH_externalFormat.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX screenUsageAt(long index, long value) { VH_screenUsage.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX formatFeaturesAt(long index, int value) { VH_formatFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents$rAt(long index, int value) { VH_samplerYcbcrConversionComponents$r.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents$gAt(long index, int value) { VH_samplerYcbcrConversionComponents$g.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents$bAt(long index, int value) { VH_samplerYcbcrConversionComponents$b.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents$aAt(long index, int value) { VH_samplerYcbcrConversionComponents$a.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX suggestedYcbcrModelAt(long index, int value) { VH_suggestedYcbcrModel.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX suggestedYcbcrRangeAt(long index, int value) { VH_suggestedYcbcrRange.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX suggestedXChromaOffsetAt(long index, int value) { VH_suggestedXChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX suggestedYChromaOffsetAt(long index, int value) { VH_suggestedYChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferFormatPropertiesQNX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX externalFormat(long value) { VH_externalFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX screenUsage(long value) { VH_screenUsage.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX formatFeatures(int value) { VH_formatFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents$r(int value) { VH_samplerYcbcrConversionComponents$r.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents$g(int value) { VH_samplerYcbcrConversionComponents$g.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents$b(int value) { VH_samplerYcbcrConversionComponents$b.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents$a(int value) { VH_samplerYcbcrConversionComponents$a.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX suggestedYcbcrModel(int value) { VH_suggestedYcbcrModel.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX suggestedYcbcrRange(int value) { VH_suggestedYcbcrRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX suggestedXChromaOffset(int value) { VH_suggestedXChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferFormatPropertiesQNX suggestedYChromaOffset(int value) { VH_suggestedYChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _externalFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFormat, index), LAYOUT_externalFormat); }
    public MemorySegment _externalFormat() { return _externalFormatAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _externalFormatAt(long index, MemorySegment src) { _externalFormatAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _externalFormat(MemorySegment src) { return _externalFormatAt(0L, src); }
    public MemorySegment _screenUsageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_screenUsage, index), LAYOUT_screenUsage); }
    public MemorySegment _screenUsage() { return _screenUsageAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _screenUsageAt(long index, MemorySegment src) { _screenUsageAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _screenUsage(MemorySegment src) { return _screenUsageAt(0L, src); }
    public MemorySegment _formatFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_formatFeatures, index), LAYOUT_formatFeatures); }
    public MemorySegment _formatFeatures() { return _formatFeaturesAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _formatFeaturesAt(long index, MemorySegment src) { _formatFeaturesAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _formatFeatures(MemorySegment src) { return _formatFeaturesAt(0L, src); }
    public MemorySegment _samplerYcbcrConversionComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), LAYOUT_samplerYcbcrConversionComponents); }
    public MemorySegment _samplerYcbcrConversionComponents() { return _samplerYcbcrConversionComponentsAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _samplerYcbcrConversionComponentsAt(long index, MemorySegment src) { _samplerYcbcrConversionComponentsAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _samplerYcbcrConversionComponents(MemorySegment src) { return _samplerYcbcrConversionComponentsAt(0L, src); }
    public MemorySegment _suggestedYcbcrModelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYcbcrModel, index), LAYOUT_suggestedYcbcrModel); }
    public MemorySegment _suggestedYcbcrModel() { return _suggestedYcbcrModelAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _suggestedYcbcrModelAt(long index, MemorySegment src) { _suggestedYcbcrModelAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _suggestedYcbcrModel(MemorySegment src) { return _suggestedYcbcrModelAt(0L, src); }
    public MemorySegment _suggestedYcbcrRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYcbcrRange, index), LAYOUT_suggestedYcbcrRange); }
    public MemorySegment _suggestedYcbcrRange() { return _suggestedYcbcrRangeAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _suggestedYcbcrRangeAt(long index, MemorySegment src) { _suggestedYcbcrRangeAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _suggestedYcbcrRange(MemorySegment src) { return _suggestedYcbcrRangeAt(0L, src); }
    public MemorySegment _suggestedXChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedXChromaOffset, index), LAYOUT_suggestedXChromaOffset); }
    public MemorySegment _suggestedXChromaOffset() { return _suggestedXChromaOffsetAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _suggestedXChromaOffsetAt(long index, MemorySegment src) { _suggestedXChromaOffsetAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _suggestedXChromaOffset(MemorySegment src) { return _suggestedXChromaOffsetAt(0L, src); }
    public MemorySegment _suggestedYChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYChromaOffset, index), LAYOUT_suggestedYChromaOffset); }
    public MemorySegment _suggestedYChromaOffset() { return _suggestedYChromaOffsetAt(0L); }
    public VkScreenBufferFormatPropertiesQNX _suggestedYChromaOffsetAt(long index, MemorySegment src) { _suggestedYChromaOffsetAt(index).copyFrom(src); return this; }
    public VkScreenBufferFormatPropertiesQNX _suggestedYChromaOffset(MemorySegment src) { return _suggestedYChromaOffsetAt(0L, src); }
}
