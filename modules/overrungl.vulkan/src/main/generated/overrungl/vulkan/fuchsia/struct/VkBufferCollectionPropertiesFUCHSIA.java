// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferCollectionPropertiesFUCHSIA`.
/// ## Layout
/// ```
/// struct VkBufferCollectionPropertiesFUCHSIA {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t memoryTypeBits;
///     uint32_t bufferCount;
///     uint32_t createInfoIndex;
///     uint64_t sysmemPixelFormat;
///     VkFormatFeatureFlags formatFeatures;
///     VkSysmemColorSpaceFUCHSIA sysmemColorSpaceIndex;
///     VkComponentMapping samplerYcbcrConversionComponents;
///     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     VkSamplerYcbcrRange suggestedYcbcrRange;
///     VkChromaLocation suggestedXChromaOffset;
///     VkChromaLocation suggestedYChromaOffset;
/// }
/// ```
public final class VkBufferCollectionPropertiesFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits"),
        ValueLayout.JAVA_INT.withName("bufferCount"),
        ValueLayout.JAVA_INT.withName("createInfoIndex"),
        ValueLayout.JAVA_LONG.withName("sysmemPixelFormat"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        overrungl.vulkan.fuchsia.struct.VkSysmemColorSpaceFUCHSIA.LAYOUT.withName("sysmemColorSpaceIndex"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    public static final long OFFSET_bufferCount = LAYOUT.byteOffset(PathElement.groupElement("bufferCount"));
    public static final long OFFSET_createInfoIndex = LAYOUT.byteOffset(PathElement.groupElement("createInfoIndex"));
    public static final long OFFSET_sysmemPixelFormat = LAYOUT.byteOffset(PathElement.groupElement("sysmemPixelFormat"));
    public static final long OFFSET_formatFeatures = LAYOUT.byteOffset(PathElement.groupElement("formatFeatures"));
    public static final long OFFSET_sysmemColorSpaceIndex = LAYOUT.byteOffset(PathElement.groupElement("sysmemColorSpaceIndex"));
    public static final long OFFSET_samplerYcbcrConversionComponents = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversionComponents"));
    public static final long OFFSET_suggestedYcbcrModel = LAYOUT.byteOffset(PathElement.groupElement("suggestedYcbcrModel"));
    public static final long OFFSET_suggestedYcbcrRange = LAYOUT.byteOffset(PathElement.groupElement("suggestedYcbcrRange"));
    public static final long OFFSET_suggestedXChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("suggestedXChromaOffset"));
    public static final long OFFSET_suggestedYChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("suggestedYChromaOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    public static final MemoryLayout LAYOUT_bufferCount = LAYOUT.select(PathElement.groupElement("bufferCount"));
    public static final MemoryLayout LAYOUT_createInfoIndex = LAYOUT.select(PathElement.groupElement("createInfoIndex"));
    public static final MemoryLayout LAYOUT_sysmemPixelFormat = LAYOUT.select(PathElement.groupElement("sysmemPixelFormat"));
    public static final MemoryLayout LAYOUT_formatFeatures = LAYOUT.select(PathElement.groupElement("formatFeatures"));
    public static final MemoryLayout LAYOUT_sysmemColorSpaceIndex = LAYOUT.select(PathElement.groupElement("sysmemColorSpaceIndex"));
    public static final MemoryLayout LAYOUT_samplerYcbcrConversionComponents = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversionComponents"));
    public static final MemoryLayout LAYOUT_suggestedYcbcrModel = LAYOUT.select(PathElement.groupElement("suggestedYcbcrModel"));
    public static final MemoryLayout LAYOUT_suggestedYcbcrRange = LAYOUT.select(PathElement.groupElement("suggestedYcbcrRange"));
    public static final MemoryLayout LAYOUT_suggestedXChromaOffset = LAYOUT.select(PathElement.groupElement("suggestedXChromaOffset"));
    public static final MemoryLayout LAYOUT_suggestedYChromaOffset = LAYOUT.select(PathElement.groupElement("suggestedYChromaOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));
    public static final VarHandle VH_bufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCount"));
    public static final VarHandle VH_createInfoIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfoIndex"));
    public static final VarHandle VH_sysmemPixelFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemPixelFormat"));
    public static final VarHandle VH_formatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatFeatures"));
    public static final VarHandle VH_sysmemColorSpaceIndex$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemColorSpaceIndex"), PathElement.groupElement("sType"));
    public static final VarHandle VH_sysmemColorSpaceIndex$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemColorSpaceIndex"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_sysmemColorSpaceIndex$colorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemColorSpaceIndex"), PathElement.groupElement("colorSpace"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("r"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("g"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("b"));
    public static final VarHandle VH_samplerYcbcrConversionComponents$a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionComponents"), PathElement.groupElement("a"));
    public static final VarHandle VH_suggestedYcbcrModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrModel"));
    public static final VarHandle VH_suggestedYcbcrRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrRange"));
    public static final VarHandle VH_suggestedXChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedXChromaOffset"));
    public static final VarHandle VH_suggestedYChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYChromaOffset"));

    public VkBufferCollectionPropertiesFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferCollectionPropertiesFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionPropertiesFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferCollectionPropertiesFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionPropertiesFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferCollectionPropertiesFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionPropertiesFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferCollectionPropertiesFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionPropertiesFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkBufferCollectionPropertiesFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkBufferCollectionPropertiesFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferCollectionPropertiesFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_BUFFER_COLLECTION_PROPERTIES_FUCHSIA); }
    public static VkBufferCollectionPropertiesFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_BUFFER_COLLECTION_PROPERTIES_FUCHSIA);
        return s;
    }
    public VkBufferCollectionPropertiesFUCHSIA copyFrom(VkBufferCollectionPropertiesFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferCollectionPropertiesFUCHSIA reinterpret(long count) { return new VkBufferCollectionPropertiesFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferCollectionPropertiesFUCHSIA asSlice(long index) { return new VkBufferCollectionPropertiesFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferCollectionPropertiesFUCHSIA asSlice(long index, long count) { return new VkBufferCollectionPropertiesFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferCollectionPropertiesFUCHSIA at(long index, Consumer<VkBufferCollectionPropertiesFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryTypeBitsAt(long index) { return (int) VH_memoryTypeBits.get(this.segment(), 0L, index); }
    public int bufferCountAt(long index) { return (int) VH_bufferCount.get(this.segment(), 0L, index); }
    public int createInfoIndexAt(long index) { return (int) VH_createInfoIndex.get(this.segment(), 0L, index); }
    public long sysmemPixelFormatAt(long index) { return (long) VH_sysmemPixelFormat.get(this.segment(), 0L, index); }
    public int formatFeaturesAt(long index) { return (int) VH_formatFeatures.get(this.segment(), 0L, index); }
    public int sysmemColorSpaceIndex$sTypeAt(long index) { return (int) VH_sysmemColorSpaceIndex$sType.get(this.segment(), 0L, index); }
    public MemorySegment sysmemColorSpaceIndex$pNextAt(long index) { return (MemorySegment) VH_sysmemColorSpaceIndex$pNext.get(this.segment(), 0L, index); }
    public int sysmemColorSpaceIndex$colorSpaceAt(long index) { return (int) VH_sysmemColorSpaceIndex$colorSpace.get(this.segment(), 0L, index); }
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
    public int memoryTypeBits() { return (int) VH_memoryTypeBits.get(this.segment(), 0L, 0L); }
    public int bufferCount() { return (int) VH_bufferCount.get(this.segment(), 0L, 0L); }
    public int createInfoIndex() { return (int) VH_createInfoIndex.get(this.segment(), 0L, 0L); }
    public long sysmemPixelFormat() { return (long) VH_sysmemPixelFormat.get(this.segment(), 0L, 0L); }
    public int formatFeatures() { return (int) VH_formatFeatures.get(this.segment(), 0L, 0L); }
    public int sysmemColorSpaceIndex$sType() { return (int) VH_sysmemColorSpaceIndex$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment sysmemColorSpaceIndex$pNext() { return (MemorySegment) VH_sysmemColorSpaceIndex$pNext.get(this.segment(), 0L, 0L); }
    public int sysmemColorSpaceIndex$colorSpace() { return (int) VH_sysmemColorSpaceIndex$colorSpace.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$r() { return (int) VH_samplerYcbcrConversionComponents$r.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$g() { return (int) VH_samplerYcbcrConversionComponents$g.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$b() { return (int) VH_samplerYcbcrConversionComponents$b.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversionComponents$a() { return (int) VH_samplerYcbcrConversionComponents$a.get(this.segment(), 0L, 0L); }
    public int suggestedYcbcrModel() { return (int) VH_suggestedYcbcrModel.get(this.segment(), 0L, 0L); }
    public int suggestedYcbcrRange() { return (int) VH_suggestedYcbcrRange.get(this.segment(), 0L, 0L); }
    public int suggestedXChromaOffset() { return (int) VH_suggestedXChromaOffset.get(this.segment(), 0L, 0L); }
    public int suggestedYChromaOffset() { return (int) VH_suggestedYChromaOffset.get(this.segment(), 0L, 0L); }
    public VkBufferCollectionPropertiesFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA memoryTypeBitsAt(long index, int value) { VH_memoryTypeBits.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA bufferCountAt(long index, int value) { VH_bufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA createInfoIndexAt(long index, int value) { VH_createInfoIndex.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sysmemPixelFormatAt(long index, long value) { VH_sysmemPixelFormat.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA formatFeaturesAt(long index, int value) { VH_formatFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndex$sTypeAt(long index, int value) { VH_sysmemColorSpaceIndex$sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndex$pNextAt(long index, MemorySegment value) { VH_sysmemColorSpaceIndex$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndex$colorSpaceAt(long index, int value) { VH_sysmemColorSpaceIndex$colorSpace.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents$rAt(long index, int value) { VH_samplerYcbcrConversionComponents$r.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents$gAt(long index, int value) { VH_samplerYcbcrConversionComponents$g.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents$bAt(long index, int value) { VH_samplerYcbcrConversionComponents$b.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents$aAt(long index, int value) { VH_samplerYcbcrConversionComponents$a.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrModelAt(long index, int value) { VH_suggestedYcbcrModel.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrRangeAt(long index, int value) { VH_suggestedYcbcrRange.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA suggestedXChromaOffsetAt(long index, int value) { VH_suggestedXChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA suggestedYChromaOffsetAt(long index, int value) { VH_suggestedYChromaOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA memoryTypeBits(int value) { VH_memoryTypeBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA bufferCount(int value) { VH_bufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA createInfoIndex(int value) { VH_createInfoIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sysmemPixelFormat(long value) { VH_sysmemPixelFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA formatFeatures(int value) { VH_formatFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndex$sType(int value) { VH_sysmemColorSpaceIndex$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndex$pNext(MemorySegment value) { VH_sysmemColorSpaceIndex$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndex$colorSpace(int value) { VH_sysmemColorSpaceIndex$colorSpace.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents$r(int value) { VH_samplerYcbcrConversionComponents$r.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents$g(int value) { VH_samplerYcbcrConversionComponents$g.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents$b(int value) { VH_samplerYcbcrConversionComponents$b.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents$a(int value) { VH_samplerYcbcrConversionComponents$a.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrModel(int value) { VH_suggestedYcbcrModel.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrRange(int value) { VH_suggestedYcbcrRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA suggestedXChromaOffset(int value) { VH_suggestedXChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionPropertiesFUCHSIA suggestedYChromaOffset(int value) { VH_suggestedYChromaOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryTypeBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypeBits, index), LAYOUT_memoryTypeBits); }
    public MemorySegment _memoryTypeBits() { return _memoryTypeBitsAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _memoryTypeBitsAt(long index, MemorySegment src) { _memoryTypeBitsAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _memoryTypeBits(MemorySegment src) { return _memoryTypeBitsAt(0L, src); }
    public MemorySegment _bufferCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferCount, index), LAYOUT_bufferCount); }
    public MemorySegment _bufferCount() { return _bufferCountAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _bufferCountAt(long index, MemorySegment src) { _bufferCountAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _bufferCount(MemorySegment src) { return _bufferCountAt(0L, src); }
    public MemorySegment _createInfoIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_createInfoIndex, index), LAYOUT_createInfoIndex); }
    public MemorySegment _createInfoIndex() { return _createInfoIndexAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _createInfoIndexAt(long index, MemorySegment src) { _createInfoIndexAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _createInfoIndex(MemorySegment src) { return _createInfoIndexAt(0L, src); }
    public MemorySegment _sysmemPixelFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sysmemPixelFormat, index), LAYOUT_sysmemPixelFormat); }
    public MemorySegment _sysmemPixelFormat() { return _sysmemPixelFormatAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _sysmemPixelFormatAt(long index, MemorySegment src) { _sysmemPixelFormatAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _sysmemPixelFormat(MemorySegment src) { return _sysmemPixelFormatAt(0L, src); }
    public MemorySegment _formatFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_formatFeatures, index), LAYOUT_formatFeatures); }
    public MemorySegment _formatFeatures() { return _formatFeaturesAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _formatFeaturesAt(long index, MemorySegment src) { _formatFeaturesAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _formatFeatures(MemorySegment src) { return _formatFeaturesAt(0L, src); }
    public MemorySegment _sysmemColorSpaceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sysmemColorSpaceIndex, index), LAYOUT_sysmemColorSpaceIndex); }
    public MemorySegment _sysmemColorSpaceIndex() { return _sysmemColorSpaceIndexAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _sysmemColorSpaceIndexAt(long index, MemorySegment src) { _sysmemColorSpaceIndexAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _sysmemColorSpaceIndex(MemorySegment src) { return _sysmemColorSpaceIndexAt(0L, src); }
    public MemorySegment _samplerYcbcrConversionComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), LAYOUT_samplerYcbcrConversionComponents); }
    public MemorySegment _samplerYcbcrConversionComponents() { return _samplerYcbcrConversionComponentsAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _samplerYcbcrConversionComponentsAt(long index, MemorySegment src) { _samplerYcbcrConversionComponentsAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _samplerYcbcrConversionComponents(MemorySegment src) { return _samplerYcbcrConversionComponentsAt(0L, src); }
    public MemorySegment _suggestedYcbcrModelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYcbcrModel, index), LAYOUT_suggestedYcbcrModel); }
    public MemorySegment _suggestedYcbcrModel() { return _suggestedYcbcrModelAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _suggestedYcbcrModelAt(long index, MemorySegment src) { _suggestedYcbcrModelAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _suggestedYcbcrModel(MemorySegment src) { return _suggestedYcbcrModelAt(0L, src); }
    public MemorySegment _suggestedYcbcrRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYcbcrRange, index), LAYOUT_suggestedYcbcrRange); }
    public MemorySegment _suggestedYcbcrRange() { return _suggestedYcbcrRangeAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _suggestedYcbcrRangeAt(long index, MemorySegment src) { _suggestedYcbcrRangeAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _suggestedYcbcrRange(MemorySegment src) { return _suggestedYcbcrRangeAt(0L, src); }
    public MemorySegment _suggestedXChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedXChromaOffset, index), LAYOUT_suggestedXChromaOffset); }
    public MemorySegment _suggestedXChromaOffset() { return _suggestedXChromaOffsetAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _suggestedXChromaOffsetAt(long index, MemorySegment src) { _suggestedXChromaOffsetAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _suggestedXChromaOffset(MemorySegment src) { return _suggestedXChromaOffsetAt(0L, src); }
    public MemorySegment _suggestedYChromaOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_suggestedYChromaOffset, index), LAYOUT_suggestedYChromaOffset); }
    public MemorySegment _suggestedYChromaOffset() { return _suggestedYChromaOffsetAt(0L); }
    public VkBufferCollectionPropertiesFUCHSIA _suggestedYChromaOffsetAt(long index, MemorySegment src) { _suggestedYChromaOffsetAt(index).copyFrom(src); return this; }
    public VkBufferCollectionPropertiesFUCHSIA _suggestedYChromaOffset(MemorySegment src) { return _suggestedYChromaOffsetAt(0L, src); }
}
