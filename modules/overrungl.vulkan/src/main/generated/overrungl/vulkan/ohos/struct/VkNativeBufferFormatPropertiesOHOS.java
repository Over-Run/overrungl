// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkNativeBufferFormatPropertiesOHOS`.
/// ## Layout
/// ```
/// struct VkNativeBufferFormatPropertiesOHOS {
///     VkStructureType sType;
///     void* pNext;
///     VkFormat format;
///     uint64_t externalFormat;
///     VkFormatFeatureFlags formatFeatures;
///     VkComponentMapping samplerYcbcrConversionComponents;
///     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     VkSamplerYcbcrRange suggestedYcbcrRange;
///     VkChromaLocation suggestedXChromaOffset;
///     VkChromaLocation suggestedYChromaOffset;
/// }
/// ```
public final class VkNativeBufferFormatPropertiesOHOS extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
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
    public static final VarHandle VH_formatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatFeatures"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("r"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("g"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("b"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("a"));
    public static final VarHandle VH_suggestedYcbcrModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrModel"));
    public static final VarHandle VH_suggestedYcbcrRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrRange"));
    public static final VarHandle VH_suggestedXChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedXChromaOffset"));
    public static final VarHandle VH_suggestedYChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYChromaOffset"));

    public VkNativeBufferFormatPropertiesOHOS(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkNativeBufferFormatPropertiesOHOS of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferFormatPropertiesOHOS(segment, estimateCount(segment, LAYOUT)); }
    public static VkNativeBufferFormatPropertiesOHOS ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferFormatPropertiesOHOS(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkNativeBufferFormatPropertiesOHOS ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferFormatPropertiesOHOS(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkNativeBufferFormatPropertiesOHOS alloc(SegmentAllocator allocator) { return new VkNativeBufferFormatPropertiesOHOS(allocator.allocate(LAYOUT), 1); }
    public static VkNativeBufferFormatPropertiesOHOS alloc(SegmentAllocator allocator, long count) { return new VkNativeBufferFormatPropertiesOHOS(allocator.allocate(LAYOUT, count), count); }
    public static VkNativeBufferFormatPropertiesOHOS allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ohos.VKOHOSExternalMemory.VK_STRUCTURE_TYPE_NATIVE_BUFFER_FORMAT_PROPERTIES_OHOS); }
    public static VkNativeBufferFormatPropertiesOHOS allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ohos.VKOHOSExternalMemory.VK_STRUCTURE_TYPE_NATIVE_BUFFER_FORMAT_PROPERTIES_OHOS);
        return s;
    }
    public VkNativeBufferFormatPropertiesOHOS copyFrom(VkNativeBufferFormatPropertiesOHOS src) { this.segment().copyFrom(src.segment()); return this; }
    public VkNativeBufferFormatPropertiesOHOS reinterpret(long count) { return new VkNativeBufferFormatPropertiesOHOS(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkNativeBufferFormatPropertiesOHOS asSlice(long index) { return new VkNativeBufferFormatPropertiesOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkNativeBufferFormatPropertiesOHOS asSlice(long index, long count) { return new VkNativeBufferFormatPropertiesOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkNativeBufferFormatPropertiesOHOS at(long index, Consumer<VkNativeBufferFormatPropertiesOHOS> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public long externalFormatAt(long index) { return (long) VH_externalFormat.get(this.segment(), 0L, index); }
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
    public int formatFeatures() { return (int) VH_formatFeatures.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$r() { return (int) VH_samplerYcbcrConversionComponents$r.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$g() { return (int) VH_samplerYcbcrConversionComponents$g.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$b() { return (int) VH_samplerYcbcrConversionComponents$b.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$a() { return (int) VH_samplerYcbcrConversionComponents$a.get(this.segment(), 0L, 0L); }
    public int suggestedYcbcrModel() { return (int) VH_suggestedYcbcrModel.get(this.segment(), 0L, 0L); }
    public int suggestedYcbcrRange() { return (int) VH_suggestedYcbcrRange.get(this.segment(), 0L, 0L); }
    public int suggestedXChromaOffset() { return (int) VH_suggestedXChromaOffset.get(this.segment(), 0L, 0L); }
    public int suggestedYChromaOffset() { return (int) VH_suggestedYChromaOffset.get(this.segment(), 0L, 0L); }
    public VkNativeBufferFormatPropertiesOHOS sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS externalFormatAt(long index, long value) { VH_externalFormat.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS formatFeaturesAt(long index, int value) { VH_formatFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS samplerYcbcrConversionComponents$rAt(long index, int value) { VH_samplerYcbcrConversionComponents$r.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS samplerYcbcrConversionComponents$gAt(long index, int value) { VH_samplerYcbcrConversionComponents$g.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS samplerYcbcrConversionComponents$bAt(long index, int value) { VH_samplerYcbcrConversionComponents$b.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS samplerYcbcrConversionComponents$aAt(long index, int value) { VH_samplerYcbcrConversionComponents$a.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS suggestedYcbcrModelAt(long index, int value) { VH_suggestedYcbcrModel.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS suggestedYcbcrRangeAt(long index, int value) { VH_suggestedYcbcrRange.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS suggestedXChromaOffsetAt(long index, int value) { VH_suggestedXChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS suggestedYChromaOffsetAt(long index, int value) { VH_suggestedYChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS externalFormat(long value) { VH_externalFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS formatFeatures(int value) { VH_formatFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS samplerYcbcrConversionComponents$r(int value) { VH_samplerYcbcrConversionComponents$r.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS samplerYcbcrConversionComponents$g(int value) { VH_samplerYcbcrConversionComponents$g.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS samplerYcbcrConversionComponents$b(int value) { VH_samplerYcbcrConversionComponents$b.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS samplerYcbcrConversionComponents$a(int value) { VH_samplerYcbcrConversionComponents$a.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS suggestedYcbcrModel(int value) { VH_suggestedYcbcrModel.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS suggestedYcbcrRange(int value) { VH_suggestedYcbcrRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS suggestedXChromaOffset(int value) { VH_suggestedXChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferFormatPropertiesOHOS suggestedYChromaOffset(int value) { VH_suggestedYChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _externalFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFormat, index), LAYOUT_externalFormat); }
    public MemorySegment _externalFormat() { return _externalFormatAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _externalFormatAt(long index, MemorySegment src) { _externalFormatAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _externalFormat(MemorySegment src) { return _externalFormatAt(0L, src); }
    public MemorySegment _formatFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_formatFeatures, index), LAYOUT_formatFeatures); }
    public MemorySegment _formatFeatures() { return _formatFeaturesAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _formatFeaturesAt(long index, MemorySegment src) { _formatFeaturesAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _formatFeatures(MemorySegment src) { return _formatFeaturesAt(0L, src); }
    public MemorySegment _samplerYcbcrConversionComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), LAYOUT_samplerYcbcrConversionComponents); }
    public MemorySegment _samplerYcbcrConversionComponents() { return _samplerYcbcrConversionComponentsAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _samplerYcbcrConversionComponentsAt(long index, MemorySegment src) { _samplerYcbcrConversionComponentsAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _samplerYcbcrConversionComponents(MemorySegment src) { return _samplerYcbcrConversionComponentsAt(0L, src); }
    public MemorySegment _suggestedYcbcrModelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYcbcrModel, index), LAYOUT_suggestedYcbcrModel); }
    public MemorySegment _suggestedYcbcrModel() { return _suggestedYcbcrModelAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _suggestedYcbcrModelAt(long index, MemorySegment src) { _suggestedYcbcrModelAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _suggestedYcbcrModel(MemorySegment src) { return _suggestedYcbcrModelAt(0L, src); }
    public MemorySegment _suggestedYcbcrRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYcbcrRange, index), LAYOUT_suggestedYcbcrRange); }
    public MemorySegment _suggestedYcbcrRange() { return _suggestedYcbcrRangeAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _suggestedYcbcrRangeAt(long index, MemorySegment src) { _suggestedYcbcrRangeAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _suggestedYcbcrRange(MemorySegment src) { return _suggestedYcbcrRangeAt(0L, src); }
    public MemorySegment _suggestedXChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedXChromaOffset, index), LAYOUT_suggestedXChromaOffset); }
    public MemorySegment _suggestedXChromaOffset() { return _suggestedXChromaOffsetAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _suggestedXChromaOffsetAt(long index, MemorySegment src) { _suggestedXChromaOffsetAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _suggestedXChromaOffset(MemorySegment src) { return _suggestedXChromaOffsetAt(0L, src); }
    public MemorySegment _suggestedYChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYChromaOffset, index), LAYOUT_suggestedYChromaOffset); }
    public MemorySegment _suggestedYChromaOffset() { return _suggestedYChromaOffsetAt(0L); }
    public VkNativeBufferFormatPropertiesOHOS _suggestedYChromaOffsetAt(long index, MemorySegment src) { _suggestedYChromaOffsetAt(index).copyFrom(src); return this; }
    public VkNativeBufferFormatPropertiesOHOS _suggestedYChromaOffset(MemorySegment src) { return _suggestedYChromaOffsetAt(0L, src); }
}
