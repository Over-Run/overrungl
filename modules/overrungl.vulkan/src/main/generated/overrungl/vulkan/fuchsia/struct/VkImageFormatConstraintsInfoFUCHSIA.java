// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageFormatConstraintsInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkImageFormatConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageCreateInfo imageCreateInfo;
///     VkFormatFeatureFlags requiredFormatFeatures;
///     VkImageFormatConstraintsFlagsFUCHSIA flags;
///     uint64_t sysmemPixelFormat;
///     uint32_t colorSpaceCount;
///     const VkSysmemColorSpaceFUCHSIA* pColorSpaces;
/// }
/// ```
public final class VkImageFormatConstraintsInfoFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageCreateInfo.LAYOUT.withName("imageCreateInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("sysmemPixelFormat"),
        ValueLayout.JAVA_INT.withName("colorSpaceCount"),
        ValueLayout.ADDRESS.withName("pColorSpaces")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("imageCreateInfo"));
    public static final long OFFSET_requiredFormatFeatures = LAYOUT.byteOffset(PathElement.groupElement("requiredFormatFeatures"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_sysmemPixelFormat = LAYOUT.byteOffset(PathElement.groupElement("sysmemPixelFormat"));
    public static final long OFFSET_colorSpaceCount = LAYOUT.byteOffset(PathElement.groupElement("colorSpaceCount"));
    public static final long OFFSET_pColorSpaces = LAYOUT.byteOffset(PathElement.groupElement("pColorSpaces"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageCreateInfo = LAYOUT.select(PathElement.groupElement("imageCreateInfo"));
    public static final MemoryLayout LAYOUT_requiredFormatFeatures = LAYOUT.select(PathElement.groupElement("requiredFormatFeatures"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_sysmemPixelFormat = LAYOUT.select(PathElement.groupElement("sysmemPixelFormat"));
    public static final MemoryLayout LAYOUT_colorSpaceCount = LAYOUT.select(PathElement.groupElement("colorSpaceCount"));
    public static final MemoryLayout LAYOUT_pColorSpaces = LAYOUT.select(PathElement.groupElement("pColorSpaces"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageCreateInfo$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("sType"));
    public static final VarHandle VH_imageCreateInfo$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageCreateInfo$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("flags"));
    public static final VarHandle VH_imageCreateInfo$imageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("imageType"));
    public static final VarHandle VH_imageCreateInfo$format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("format"));
    public static final VarHandle VH_imageCreateInfo$extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_imageCreateInfo$extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_imageCreateInfo$extent$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("extent"), PathElement.groupElement("depth"));
    public static final VarHandle VH_imageCreateInfo$mipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("mipLevels"));
    public static final VarHandle VH_imageCreateInfo$arrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("arrayLayers"));
    public static final VarHandle VH_imageCreateInfo$samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("samples"));
    public static final VarHandle VH_imageCreateInfo$tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("tiling"));
    public static final VarHandle VH_imageCreateInfo$usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("usage"));
    public static final VarHandle VH_imageCreateInfo$sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("sharingMode"));
    public static final VarHandle VH_imageCreateInfo$queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("queueFamilyIndexCount"));
    public static final VarHandle VH_imageCreateInfo$pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("pQueueFamilyIndices"));
    public static final VarHandle VH_imageCreateInfo$initialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateInfo"), PathElement.groupElement("initialLayout"));
    public static final VarHandle VH_requiredFormatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredFormatFeatures"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_sysmemPixelFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemPixelFormat"));
    public static final VarHandle VH_colorSpaceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpaceCount"));
    public static final VarHandle VH_pColorSpaces = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorSpaces"));

    public VkImageFormatConstraintsInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageFormatConstraintsInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatConstraintsInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageFormatConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageFormatConstraintsInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageFormatConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImageFormatConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkImageFormatConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkImageFormatConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkImageFormatConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA); }
    public static VkImageFormatConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA);
        return s;
    }
    public VkImageFormatConstraintsInfoFUCHSIA copyFrom(VkImageFormatConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA reinterpret(long count) { return new VkImageFormatConstraintsInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageFormatConstraintsInfoFUCHSIA asSlice(long index) { return new VkImageFormatConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageFormatConstraintsInfoFUCHSIA asSlice(long index, long count) { return new VkImageFormatConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageFormatConstraintsInfoFUCHSIA at(long index, Consumer<VkImageFormatConstraintsInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageCreateInfo$sTypeAt(long index) { return (int) VH_imageCreateInfo$sType.get(this.segment(), 0L, index); }
    public MemorySegment imageCreateInfo$pNextAt(long index) { return (MemorySegment) VH_imageCreateInfo$pNext.get(this.segment(), 0L, index); }
    public int imageCreateInfo$flagsAt(long index) { return (int) VH_imageCreateInfo$flags.get(this.segment(), 0L, index); }
    public int imageCreateInfo$imageTypeAt(long index) { return (int) VH_imageCreateInfo$imageType.get(this.segment(), 0L, index); }
    public int imageCreateInfo$formatAt(long index) { return (int) VH_imageCreateInfo$format.get(this.segment(), 0L, index); }
    public int imageCreateInfo$extent$widthAt(long index) { return (int) VH_imageCreateInfo$extent$width.get(this.segment(), 0L, index); }
    public int imageCreateInfo$extent$heightAt(long index) { return (int) VH_imageCreateInfo$extent$height.get(this.segment(), 0L, index); }
    public int imageCreateInfo$extent$depthAt(long index) { return (int) VH_imageCreateInfo$extent$depth.get(this.segment(), 0L, index); }
    public int imageCreateInfo$mipLevelsAt(long index) { return (int) VH_imageCreateInfo$mipLevels.get(this.segment(), 0L, index); }
    public int imageCreateInfo$arrayLayersAt(long index) { return (int) VH_imageCreateInfo$arrayLayers.get(this.segment(), 0L, index); }
    public int imageCreateInfo$samplesAt(long index) { return (int) VH_imageCreateInfo$samples.get(this.segment(), 0L, index); }
    public int imageCreateInfo$tilingAt(long index) { return (int) VH_imageCreateInfo$tiling.get(this.segment(), 0L, index); }
    public int imageCreateInfo$usageAt(long index) { return (int) VH_imageCreateInfo$usage.get(this.segment(), 0L, index); }
    public int imageCreateInfo$sharingModeAt(long index) { return (int) VH_imageCreateInfo$sharingMode.get(this.segment(), 0L, index); }
    public int imageCreateInfo$queueFamilyIndexCountAt(long index) { return (int) VH_imageCreateInfo$queueFamilyIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment imageCreateInfo$pQueueFamilyIndicesAt(long index) { return (MemorySegment) VH_imageCreateInfo$pQueueFamilyIndices.get(this.segment(), 0L, index); }
    public int imageCreateInfo$initialLayoutAt(long index) { return (int) VH_imageCreateInfo$initialLayout.get(this.segment(), 0L, index); }
    public int requiredFormatFeaturesAt(long index) { return (int) VH_requiredFormatFeatures.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long sysmemPixelFormatAt(long index) { return (long) VH_sysmemPixelFormat.get(this.segment(), 0L, index); }
    public int colorSpaceCountAt(long index) { return (int) VH_colorSpaceCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorSpacesAt(long index) { return (MemorySegment) VH_pColorSpaces.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$sType() { return (int) VH_imageCreateInfo$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment imageCreateInfo$pNext() { return (MemorySegment) VH_imageCreateInfo$pNext.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$flags() { return (int) VH_imageCreateInfo$flags.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$imageType() { return (int) VH_imageCreateInfo$imageType.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$format() { return (int) VH_imageCreateInfo$format.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$extent$width() { return (int) VH_imageCreateInfo$extent$width.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$extent$height() { return (int) VH_imageCreateInfo$extent$height.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$extent$depth() { return (int) VH_imageCreateInfo$extent$depth.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$mipLevels() { return (int) VH_imageCreateInfo$mipLevels.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$arrayLayers() { return (int) VH_imageCreateInfo$arrayLayers.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$samples() { return (int) VH_imageCreateInfo$samples.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$tiling() { return (int) VH_imageCreateInfo$tiling.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$usage() { return (int) VH_imageCreateInfo$usage.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$sharingMode() { return (int) VH_imageCreateInfo$sharingMode.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$queueFamilyIndexCount() { return (int) VH_imageCreateInfo$queueFamilyIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment imageCreateInfo$pQueueFamilyIndices() { return (MemorySegment) VH_imageCreateInfo$pQueueFamilyIndices.get(this.segment(), 0L, 0L); }
    public int imageCreateInfo$initialLayout() { return (int) VH_imageCreateInfo$initialLayout.get(this.segment(), 0L, 0L); }
    public int requiredFormatFeatures() { return (int) VH_requiredFormatFeatures.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long sysmemPixelFormat() { return (long) VH_sysmemPixelFormat.get(this.segment(), 0L, 0L); }
    public int colorSpaceCount() { return (int) VH_colorSpaceCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorSpaces() { return (MemorySegment) VH_pColorSpaces.get(this.segment(), 0L, 0L); }
    public VkImageFormatConstraintsInfoFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$sTypeAt(long index, int value) { VH_imageCreateInfo$sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$pNextAt(long index, MemorySegment value) { VH_imageCreateInfo$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$flagsAt(long index, int value) { VH_imageCreateInfo$flags.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$imageTypeAt(long index, int value) { VH_imageCreateInfo$imageType.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$formatAt(long index, int value) { VH_imageCreateInfo$format.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$extent$widthAt(long index, int value) { VH_imageCreateInfo$extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$extent$heightAt(long index, int value) { VH_imageCreateInfo$extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$extent$depthAt(long index, int value) { VH_imageCreateInfo$extent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$mipLevelsAt(long index, int value) { VH_imageCreateInfo$mipLevels.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$arrayLayersAt(long index, int value) { VH_imageCreateInfo$arrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$samplesAt(long index, int value) { VH_imageCreateInfo$samples.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$tilingAt(long index, int value) { VH_imageCreateInfo$tiling.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$usageAt(long index, int value) { VH_imageCreateInfo$usage.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$sharingModeAt(long index, int value) { VH_imageCreateInfo$sharingMode.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$queueFamilyIndexCountAt(long index, int value) { VH_imageCreateInfo$queueFamilyIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$pQueueFamilyIndicesAt(long index, MemorySegment value) { VH_imageCreateInfo$pQueueFamilyIndices.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$initialLayoutAt(long index, int value) { VH_imageCreateInfo$initialLayout.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA requiredFormatFeaturesAt(long index, int value) { VH_requiredFormatFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA sysmemPixelFormatAt(long index, long value) { VH_sysmemPixelFormat.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA colorSpaceCountAt(long index, int value) { VH_colorSpaceCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA pColorSpacesAt(long index, MemorySegment value) { VH_pColorSpaces.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$sType(int value) { VH_imageCreateInfo$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$pNext(MemorySegment value) { VH_imageCreateInfo$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$flags(int value) { VH_imageCreateInfo$flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$imageType(int value) { VH_imageCreateInfo$imageType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$format(int value) { VH_imageCreateInfo$format.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$extent$width(int value) { VH_imageCreateInfo$extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$extent$height(int value) { VH_imageCreateInfo$extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$extent$depth(int value) { VH_imageCreateInfo$extent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$mipLevels(int value) { VH_imageCreateInfo$mipLevels.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$arrayLayers(int value) { VH_imageCreateInfo$arrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$samples(int value) { VH_imageCreateInfo$samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$tiling(int value) { VH_imageCreateInfo$tiling.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$usage(int value) { VH_imageCreateInfo$usage.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$sharingMode(int value) { VH_imageCreateInfo$sharingMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$queueFamilyIndexCount(int value) { VH_imageCreateInfo$queueFamilyIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$pQueueFamilyIndices(MemorySegment value) { VH_imageCreateInfo$pQueueFamilyIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo$initialLayout(int value) { VH_imageCreateInfo$initialLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA requiredFormatFeatures(int value) { VH_requiredFormatFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA sysmemPixelFormat(long value) { VH_sysmemPixelFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA colorSpaceCount(int value) { VH_colorSpaceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA pColorSpaces(MemorySegment value) { VH_pColorSpaces.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageFormatConstraintsInfoFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageFormatConstraintsInfoFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageCreateInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCreateInfo, index), LAYOUT_imageCreateInfo); }
    public MemorySegment _imageCreateInfo() { return _imageCreateInfoAt(0L); }
    public VkImageFormatConstraintsInfoFUCHSIA _imageCreateInfoAt(long index, MemorySegment src) { _imageCreateInfoAt(index).copyFrom(src); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA _imageCreateInfo(MemorySegment src) { return _imageCreateInfoAt(0L, src); }
    public MemorySegment _requiredFormatFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiredFormatFeatures, index), LAYOUT_requiredFormatFeatures); }
    public MemorySegment _requiredFormatFeatures() { return _requiredFormatFeaturesAt(0L); }
    public VkImageFormatConstraintsInfoFUCHSIA _requiredFormatFeaturesAt(long index, MemorySegment src) { _requiredFormatFeaturesAt(index).copyFrom(src); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA _requiredFormatFeatures(MemorySegment src) { return _requiredFormatFeaturesAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImageFormatConstraintsInfoFUCHSIA _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _sysmemPixelFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sysmemPixelFormat, index), LAYOUT_sysmemPixelFormat); }
    public MemorySegment _sysmemPixelFormat() { return _sysmemPixelFormatAt(0L); }
    public VkImageFormatConstraintsInfoFUCHSIA _sysmemPixelFormatAt(long index, MemorySegment src) { _sysmemPixelFormatAt(index).copyFrom(src); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA _sysmemPixelFormat(MemorySegment src) { return _sysmemPixelFormatAt(0L, src); }
    public MemorySegment _colorSpaceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorSpaceCount, index), LAYOUT_colorSpaceCount); }
    public MemorySegment _colorSpaceCount() { return _colorSpaceCountAt(0L); }
    public VkImageFormatConstraintsInfoFUCHSIA _colorSpaceCountAt(long index, MemorySegment src) { _colorSpaceCountAt(index).copyFrom(src); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA _colorSpaceCount(MemorySegment src) { return _colorSpaceCountAt(0L, src); }
    public MemorySegment _pColorSpacesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorSpaces, index), LAYOUT_pColorSpaces); }
    public MemorySegment _pColorSpaces() { return _pColorSpacesAt(0L); }
    public VkImageFormatConstraintsInfoFUCHSIA _pColorSpacesAt(long index, MemorySegment src) { _pColorSpacesAt(index).copyFrom(src); return this; }
    public VkImageFormatConstraintsInfoFUCHSIA _pColorSpaces(MemorySegment src) { return _pColorSpacesAt(0L, src); }
}
