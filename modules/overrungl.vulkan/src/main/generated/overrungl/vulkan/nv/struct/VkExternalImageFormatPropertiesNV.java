// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalImageFormatPropertiesNV`.
/// ## Layout
/// ```
/// struct VkExternalImageFormatPropertiesNV {
///     VkImageFormatProperties imageFormatProperties;
///     VkExternalMemoryFeatureFlagsNV externalMemoryFeatures;
///     VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes;
///     VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes;
/// }
/// ```
public final class VkExternalImageFormatPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageFormatProperties.LAYOUT.withName("imageFormatProperties"),
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    public static final long OFFSET_imageFormatProperties = LAYOUT.byteOffset(PathElement.groupElement("imageFormatProperties"));
    public static final long OFFSET_externalMemoryFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryFeatures"));
    public static final long OFFSET_exportFromImportedHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final long OFFSET_compatibleHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
    public static final MemoryLayout LAYOUT_imageFormatProperties = LAYOUT.select(PathElement.groupElement("imageFormatProperties"));
    public static final MemoryLayout LAYOUT_externalMemoryFeatures = LAYOUT.select(PathElement.groupElement("externalMemoryFeatures"));
    public static final MemoryLayout LAYOUT_exportFromImportedHandleTypes = LAYOUT.select(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final MemoryLayout LAYOUT_compatibleHandleTypes = LAYOUT.select(PathElement.groupElement("compatibleHandleTypes"));
    public static final VarHandle VH_imageFormatProperties$maxExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_imageFormatProperties$maxExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_imageFormatProperties$maxExtent$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxExtent"), PathElement.groupElement("depth"));
    public static final VarHandle VH_imageFormatProperties$maxMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxMipLevels"));
    public static final VarHandle VH_imageFormatProperties$maxArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxArrayLayers"));
    public static final VarHandle VH_imageFormatProperties$sampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("sampleCounts"));
    public static final VarHandle VH_imageFormatProperties$maxResourceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxResourceSize"));
    public static final VarHandle VH_externalMemoryFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryFeatures"));
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));

    public VkExternalImageFormatPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalImageFormatPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalImageFormatPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalImageFormatPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalImageFormatPropertiesNV alloc(SegmentAllocator allocator) { return new VkExternalImageFormatPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkExternalImageFormatPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkExternalImageFormatPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public VkExternalImageFormatPropertiesNV copyFrom(VkExternalImageFormatPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalImageFormatPropertiesNV reinterpret(long count) { return new VkExternalImageFormatPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalImageFormatPropertiesNV asSlice(long index) { return new VkExternalImageFormatPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalImageFormatPropertiesNV asSlice(long index, long count) { return new VkExternalImageFormatPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalImageFormatPropertiesNV at(long index, Consumer<VkExternalImageFormatPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int imageFormatProperties$maxExtent$widthAt(long index) { return (int) VH_imageFormatProperties$maxExtent$width.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxExtent$heightAt(long index) { return (int) VH_imageFormatProperties$maxExtent$height.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxExtent$depthAt(long index) { return (int) VH_imageFormatProperties$maxExtent$depth.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxMipLevelsAt(long index) { return (int) VH_imageFormatProperties$maxMipLevels.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxArrayLayersAt(long index) { return (int) VH_imageFormatProperties$maxArrayLayers.get(this.segment(), 0L, index); }
    public int imageFormatProperties$sampleCountsAt(long index) { return (int) VH_imageFormatProperties$sampleCounts.get(this.segment(), 0L, index); }
    public long imageFormatProperties$maxResourceSizeAt(long index) { return (long) VH_imageFormatProperties$maxResourceSize.get(this.segment(), 0L, index); }
    public int externalMemoryFeaturesAt(long index) { return (int) VH_externalMemoryFeatures.get(this.segment(), 0L, index); }
    public int exportFromImportedHandleTypesAt(long index) { return (int) VH_exportFromImportedHandleTypes.get(this.segment(), 0L, index); }
    public int compatibleHandleTypesAt(long index) { return (int) VH_compatibleHandleTypes.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxExtent$width() { return (int) VH_imageFormatProperties$maxExtent$width.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxExtent$height() { return (int) VH_imageFormatProperties$maxExtent$height.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxExtent$depth() { return (int) VH_imageFormatProperties$maxExtent$depth.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxMipLevels() { return (int) VH_imageFormatProperties$maxMipLevels.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxArrayLayers() { return (int) VH_imageFormatProperties$maxArrayLayers.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$sampleCounts() { return (int) VH_imageFormatProperties$sampleCounts.get(this.segment(), 0L, 0L); }
    public long imageFormatProperties$maxResourceSize() { return (long) VH_imageFormatProperties$maxResourceSize.get(this.segment(), 0L, 0L); }
    public int externalMemoryFeatures() { return (int) VH_externalMemoryFeatures.get(this.segment(), 0L, 0L); }
    public int exportFromImportedHandleTypes() { return (int) VH_exportFromImportedHandleTypes.get(this.segment(), 0L, 0L); }
    public int compatibleHandleTypes() { return (int) VH_compatibleHandleTypes.get(this.segment(), 0L, 0L); }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxExtent$widthAt(long index, int value) { VH_imageFormatProperties$maxExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxExtent$heightAt(long index, int value) { VH_imageFormatProperties$maxExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxExtent$depthAt(long index, int value) { VH_imageFormatProperties$maxExtent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxMipLevelsAt(long index, int value) { VH_imageFormatProperties$maxMipLevels.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxArrayLayersAt(long index, int value) { VH_imageFormatProperties$maxArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$sampleCountsAt(long index, int value) { VH_imageFormatProperties$sampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxResourceSizeAt(long index, long value) { VH_imageFormatProperties$maxResourceSize.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV externalMemoryFeaturesAt(long index, int value) { VH_externalMemoryFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV exportFromImportedHandleTypesAt(long index, int value) { VH_exportFromImportedHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV compatibleHandleTypesAt(long index, int value) { VH_compatibleHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxExtent$width(int value) { VH_imageFormatProperties$maxExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxExtent$height(int value) { VH_imageFormatProperties$maxExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxExtent$depth(int value) { VH_imageFormatProperties$maxExtent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxMipLevels(int value) { VH_imageFormatProperties$maxMipLevels.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxArrayLayers(int value) { VH_imageFormatProperties$maxArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$sampleCounts(int value) { VH_imageFormatProperties$sampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV imageFormatProperties$maxResourceSize(long value) { VH_imageFormatProperties$maxResourceSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV externalMemoryFeatures(int value) { VH_externalMemoryFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV exportFromImportedHandleTypes(int value) { VH_exportFromImportedHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalImageFormatPropertiesNV compatibleHandleTypes(int value) { VH_compatibleHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _imageFormatPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageFormatProperties, index), LAYOUT_imageFormatProperties); }
    public MemorySegment _imageFormatProperties() { return _imageFormatPropertiesAt(0L); }
    public VkExternalImageFormatPropertiesNV _imageFormatPropertiesAt(long index, MemorySegment src) { _imageFormatPropertiesAt(index).copyFrom(src); return this; }
    public VkExternalImageFormatPropertiesNV _imageFormatProperties(MemorySegment src) { return _imageFormatPropertiesAt(0L, src); }
    public MemorySegment _externalMemoryFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalMemoryFeatures, index), LAYOUT_externalMemoryFeatures); }
    public MemorySegment _externalMemoryFeatures() { return _externalMemoryFeaturesAt(0L); }
    public VkExternalImageFormatPropertiesNV _externalMemoryFeaturesAt(long index, MemorySegment src) { _externalMemoryFeaturesAt(index).copyFrom(src); return this; }
    public VkExternalImageFormatPropertiesNV _externalMemoryFeatures(MemorySegment src) { return _externalMemoryFeaturesAt(0L, src); }
    public MemorySegment _exportFromImportedHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_exportFromImportedHandleTypes, index), LAYOUT_exportFromImportedHandleTypes); }
    public MemorySegment _exportFromImportedHandleTypes() { return _exportFromImportedHandleTypesAt(0L); }
    public VkExternalImageFormatPropertiesNV _exportFromImportedHandleTypesAt(long index, MemorySegment src) { _exportFromImportedHandleTypesAt(index).copyFrom(src); return this; }
    public VkExternalImageFormatPropertiesNV _exportFromImportedHandleTypes(MemorySegment src) { return _exportFromImportedHandleTypesAt(0L, src); }
    public MemorySegment _compatibleHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compatibleHandleTypes, index), LAYOUT_compatibleHandleTypes); }
    public MemorySegment _compatibleHandleTypes() { return _compatibleHandleTypesAt(0L); }
    public VkExternalImageFormatPropertiesNV _compatibleHandleTypesAt(long index, MemorySegment src) { _compatibleHandleTypesAt(index).copyFrom(src); return this; }
    public VkExternalImageFormatPropertiesNV _compatibleHandleTypes(MemorySegment src) { return _compatibleHandleTypesAt(0L, src); }
}
