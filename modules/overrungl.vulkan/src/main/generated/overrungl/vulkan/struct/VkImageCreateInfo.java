// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageCreateInfo`.
/// ## Layout
/// ```
/// struct VkImageCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageCreateFlags flags;
///     VkImageType imageType;
///     VkFormat format;
///     VkExtent3D extent;
///     uint32_t mipLevels;
///     uint32_t arrayLayers;
///     VkSampleCountFlagBits samples;
///     VkImageTiling tiling;
///     VkImageUsageFlags usage;
///     VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t* pQueueFamilyIndices;
///     VkImageLayout initialLayout;
/// }
/// ```
public final class VkImageCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("imageType"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("mipLevels"),
        ValueLayout.JAVA_INT.withName("arrayLayers"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("tiling"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices"),
        ValueLayout.JAVA_INT.withName("initialLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_imageType = LAYOUT.byteOffset(PathElement.groupElement("imageType"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    public static final long OFFSET_mipLevels = LAYOUT.byteOffset(PathElement.groupElement("mipLevels"));
    public static final long OFFSET_arrayLayers = LAYOUT.byteOffset(PathElement.groupElement("arrayLayers"));
    public static final long OFFSET_samples = LAYOUT.byteOffset(PathElement.groupElement("samples"));
    public static final long OFFSET_tiling = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final long OFFSET_sharingMode = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
    public static final long OFFSET_queueFamilyIndexCount = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
    public static final long OFFSET_pQueueFamilyIndices = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
    public static final long OFFSET_initialLayout = LAYOUT.byteOffset(PathElement.groupElement("initialLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_imageType = LAYOUT.select(PathElement.groupElement("imageType"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));
    public static final MemoryLayout LAYOUT_mipLevels = LAYOUT.select(PathElement.groupElement("mipLevels"));
    public static final MemoryLayout LAYOUT_arrayLayers = LAYOUT.select(PathElement.groupElement("arrayLayers"));
    public static final MemoryLayout LAYOUT_samples = LAYOUT.select(PathElement.groupElement("samples"));
    public static final MemoryLayout LAYOUT_tiling = LAYOUT.select(PathElement.groupElement("tiling"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_sharingMode = LAYOUT.select(PathElement.groupElement("sharingMode"));
    public static final MemoryLayout LAYOUT_queueFamilyIndexCount = LAYOUT.select(PathElement.groupElement("queueFamilyIndexCount"));
    public static final MemoryLayout LAYOUT_pQueueFamilyIndices = LAYOUT.select(PathElement.groupElement("pQueueFamilyIndices"));
    public static final MemoryLayout LAYOUT_initialLayout = LAYOUT.select(PathElement.groupElement("initialLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_imageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageType"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_extent$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("depth"));
    public static final VarHandle VH_mipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevels"));
    public static final VarHandle VH_arrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayLayers"));
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));
    public static final VarHandle VH_initialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialLayout"));

    public VkImageCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageCreateInfo alloc(SegmentAllocator allocator) { return new VkImageCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkImageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO); }
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO);
        return s;
    }
    public VkImageCreateInfo copyFrom(VkImageCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageCreateInfo reinterpret(long count) { return new VkImageCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageCreateInfo asSlice(long index) { return new VkImageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageCreateInfo asSlice(long index, long count) { return new VkImageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageCreateInfo at(long index, Consumer<VkImageCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int imageTypeAt(long index) { return (int) VH_imageType.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int extent$widthAt(long index) { return (int) VH_extent$width.get(this.segment(), 0L, index); }
    public int extent$heightAt(long index) { return (int) VH_extent$height.get(this.segment(), 0L, index); }
    public int extent$depthAt(long index) { return (int) VH_extent$depth.get(this.segment(), 0L, index); }
    public int mipLevelsAt(long index) { return (int) VH_mipLevels.get(this.segment(), 0L, index); }
    public int arrayLayersAt(long index) { return (int) VH_arrayLayers.get(this.segment(), 0L, index); }
    public int samplesAt(long index) { return (int) VH_samples.get(this.segment(), 0L, index); }
    public int tilingAt(long index) { return (int) VH_tiling.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int sharingModeAt(long index) { return (int) VH_sharingMode.get(this.segment(), 0L, index); }
    public int queueFamilyIndexCountAt(long index) { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pQueueFamilyIndicesAt(long index) { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, index); }
    public int initialLayoutAt(long index) { return (int) VH_initialLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int imageType() { return (int) VH_imageType.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int extent$width() { return (int) VH_extent$width.get(this.segment(), 0L, 0L); }
    public int extent$height() { return (int) VH_extent$height.get(this.segment(), 0L, 0L); }
    public int extent$depth() { return (int) VH_extent$depth.get(this.segment(), 0L, 0L); }
    public int mipLevels() { return (int) VH_mipLevels.get(this.segment(), 0L, 0L); }
    public int arrayLayers() { return (int) VH_arrayLayers.get(this.segment(), 0L, 0L); }
    public int samples() { return (int) VH_samples.get(this.segment(), 0L, 0L); }
    public int tiling() { return (int) VH_tiling.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public int sharingMode() { return (int) VH_sharingMode.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndexCount() { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueueFamilyIndices() { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, 0L); }
    public int initialLayout() { return (int) VH_initialLayout.get(this.segment(), 0L, 0L); }
    public VkImageCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo imageTypeAt(long index, int value) { VH_imageType.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo extent$widthAt(long index, int value) { VH_extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo extent$heightAt(long index, int value) { VH_extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo extent$depthAt(long index, int value) { VH_extent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo mipLevelsAt(long index, int value) { VH_mipLevels.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo arrayLayersAt(long index, int value) { VH_arrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo samplesAt(long index, int value) { VH_samples.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo tilingAt(long index, int value) { VH_tiling.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo sharingModeAt(long index, int value) { VH_sharingMode.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo queueFamilyIndexCountAt(long index, int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo pQueueFamilyIndicesAt(long index, MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo initialLayoutAt(long index, int value) { VH_initialLayout.set(this.segment(), 0L, index, value); return this; }
    public VkImageCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo imageType(int value) { VH_imageType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo extent$width(int value) { VH_extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo extent$height(int value) { VH_extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo extent$depth(int value) { VH_extent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo mipLevels(int value) { VH_mipLevels.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo arrayLayers(int value) { VH_arrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo samples(int value) { VH_samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo tiling(int value) { VH_tiling.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo sharingMode(int value) { VH_sharingMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo queueFamilyIndexCount(int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo pQueueFamilyIndices(MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageCreateInfo initialLayout(int value) { VH_initialLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImageCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _imageTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageType, index), LAYOUT_imageType); }
    public MemorySegment _imageType() { return _imageTypeAt(0L); }
    public VkImageCreateInfo _imageTypeAt(long index, MemorySegment src) { _imageTypeAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _imageType(MemorySegment src) { return _imageTypeAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkImageCreateInfo _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _extentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    public MemorySegment _extent() { return _extentAt(0L); }
    public VkImageCreateInfo _extentAt(long index, MemorySegment src) { _extentAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _extent(MemorySegment src) { return _extentAt(0L, src); }
    public MemorySegment _mipLevelsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mipLevels, index), LAYOUT_mipLevels); }
    public MemorySegment _mipLevels() { return _mipLevelsAt(0L); }
    public VkImageCreateInfo _mipLevelsAt(long index, MemorySegment src) { _mipLevelsAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _mipLevels(MemorySegment src) { return _mipLevelsAt(0L, src); }
    public MemorySegment _arrayLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_arrayLayers, index), LAYOUT_arrayLayers); }
    public MemorySegment _arrayLayers() { return _arrayLayersAt(0L); }
    public VkImageCreateInfo _arrayLayersAt(long index, MemorySegment src) { _arrayLayersAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _arrayLayers(MemorySegment src) { return _arrayLayersAt(0L, src); }
    public MemorySegment _samplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samples, index), LAYOUT_samples); }
    public MemorySegment _samples() { return _samplesAt(0L); }
    public VkImageCreateInfo _samplesAt(long index, MemorySegment src) { _samplesAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _samples(MemorySegment src) { return _samplesAt(0L, src); }
    public MemorySegment _tilingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tiling, index), LAYOUT_tiling); }
    public MemorySegment _tiling() { return _tilingAt(0L); }
    public VkImageCreateInfo _tilingAt(long index, MemorySegment src) { _tilingAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _tiling(MemorySegment src) { return _tilingAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkImageCreateInfo _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _usage(MemorySegment src) { return _usageAt(0L, src); }
    public MemorySegment _sharingModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sharingMode, index), LAYOUT_sharingMode); }
    public MemorySegment _sharingMode() { return _sharingModeAt(0L); }
    public VkImageCreateInfo _sharingModeAt(long index, MemorySegment src) { _sharingModeAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _sharingMode(MemorySegment src) { return _sharingModeAt(0L, src); }
    public MemorySegment _queueFamilyIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndexCount, index), LAYOUT_queueFamilyIndexCount); }
    public MemorySegment _queueFamilyIndexCount() { return _queueFamilyIndexCountAt(0L); }
    public VkImageCreateInfo _queueFamilyIndexCountAt(long index, MemorySegment src) { _queueFamilyIndexCountAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _queueFamilyIndexCount(MemorySegment src) { return _queueFamilyIndexCountAt(0L, src); }
    public MemorySegment _pQueueFamilyIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueueFamilyIndices, index), LAYOUT_pQueueFamilyIndices); }
    public MemorySegment _pQueueFamilyIndices() { return _pQueueFamilyIndicesAt(0L); }
    public VkImageCreateInfo _pQueueFamilyIndicesAt(long index, MemorySegment src) { _pQueueFamilyIndicesAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _pQueueFamilyIndices(MemorySegment src) { return _pQueueFamilyIndicesAt(0L, src); }
    public MemorySegment _initialLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initialLayout, index), LAYOUT_initialLayout); }
    public MemorySegment _initialLayout() { return _initialLayoutAt(0L); }
    public VkImageCreateInfo _initialLayoutAt(long index, MemorySegment src) { _initialLayoutAt(index).copyFrom(src); return this; }
    public VkImageCreateInfo _initialLayout(MemorySegment src) { return _initialLayoutAt(0L, src); }
}
