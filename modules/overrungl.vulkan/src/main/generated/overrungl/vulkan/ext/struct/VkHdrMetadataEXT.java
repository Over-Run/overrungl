// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkHdrMetadataEXT`.
/// ## Layout
/// ```
/// struct VkHdrMetadataEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkXYColorEXT displayPrimaryRed;
///     VkXYColorEXT displayPrimaryGreen;
///     VkXYColorEXT displayPrimaryBlue;
///     VkXYColorEXT whitePoint;
///     float maxLuminance;
///     float minLuminance;
///     float maxContentLightLevel;
///     float maxFrameAverageLightLevel;
/// }
/// ```
public final class VkHdrMetadataEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryRed"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryGreen"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryBlue"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("whitePoint"),
        ValueLayout.JAVA_FLOAT.withName("maxLuminance"),
        ValueLayout.JAVA_FLOAT.withName("minLuminance"),
        ValueLayout.JAVA_FLOAT.withName("maxContentLightLevel"),
        ValueLayout.JAVA_FLOAT.withName("maxFrameAverageLightLevel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_displayPrimaryRed = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryRed"));
    public static final long OFFSET_displayPrimaryGreen = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryGreen"));
    public static final long OFFSET_displayPrimaryBlue = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryBlue"));
    public static final long OFFSET_whitePoint = LAYOUT.byteOffset(PathElement.groupElement("whitePoint"));
    public static final long OFFSET_maxLuminance = LAYOUT.byteOffset(PathElement.groupElement("maxLuminance"));
    public static final long OFFSET_minLuminance = LAYOUT.byteOffset(PathElement.groupElement("minLuminance"));
    public static final long OFFSET_maxContentLightLevel = LAYOUT.byteOffset(PathElement.groupElement("maxContentLightLevel"));
    public static final long OFFSET_maxFrameAverageLightLevel = LAYOUT.byteOffset(PathElement.groupElement("maxFrameAverageLightLevel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_displayPrimaryRed = LAYOUT.select(PathElement.groupElement("displayPrimaryRed"));
    public static final MemoryLayout LAYOUT_displayPrimaryGreen = LAYOUT.select(PathElement.groupElement("displayPrimaryGreen"));
    public static final MemoryLayout LAYOUT_displayPrimaryBlue = LAYOUT.select(PathElement.groupElement("displayPrimaryBlue"));
    public static final MemoryLayout LAYOUT_whitePoint = LAYOUT.select(PathElement.groupElement("whitePoint"));
    public static final MemoryLayout LAYOUT_maxLuminance = LAYOUT.select(PathElement.groupElement("maxLuminance"));
    public static final MemoryLayout LAYOUT_minLuminance = LAYOUT.select(PathElement.groupElement("minLuminance"));
    public static final MemoryLayout LAYOUT_maxContentLightLevel = LAYOUT.select(PathElement.groupElement("maxContentLightLevel"));
    public static final MemoryLayout LAYOUT_maxFrameAverageLightLevel = LAYOUT.select(PathElement.groupElement("maxFrameAverageLightLevel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_displayPrimaryRed$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayPrimaryRed"), PathElement.groupElement("x"));
    public static final VarHandle VH_displayPrimaryRed$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayPrimaryRed"), PathElement.groupElement("y"));
    public static final VarHandle VH_displayPrimaryGreen$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayPrimaryGreen"), PathElement.groupElement("x"));
    public static final VarHandle VH_displayPrimaryGreen$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayPrimaryGreen"), PathElement.groupElement("y"));
    public static final VarHandle VH_displayPrimaryBlue$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayPrimaryBlue"), PathElement.groupElement("x"));
    public static final VarHandle VH_displayPrimaryBlue$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayPrimaryBlue"), PathElement.groupElement("y"));
    public static final VarHandle VH_whitePoint$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("whitePoint"), PathElement.groupElement("x"));
    public static final VarHandle VH_whitePoint$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("whitePoint"), PathElement.groupElement("y"));
    public static final VarHandle VH_maxLuminance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLuminance"));
    public static final VarHandle VH_minLuminance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minLuminance"));
    public static final VarHandle VH_maxContentLightLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxContentLightLevel"));
    public static final VarHandle VH_maxFrameAverageLightLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameAverageLightLevel"));

    public VkHdrMetadataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkHdrMetadataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrMetadataEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkHdrMetadataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrMetadataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkHdrMetadataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrMetadataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkHdrMetadataEXT alloc(SegmentAllocator allocator) { return new VkHdrMetadataEXT(allocator.allocate(LAYOUT), 1); }
    public static VkHdrMetadataEXT alloc(SegmentAllocator allocator, long count) { return new VkHdrMetadataEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkHdrMetadataEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTHdrMetadata.VK_STRUCTURE_TYPE_HDR_METADATA_EXT); }
    public static VkHdrMetadataEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTHdrMetadata.VK_STRUCTURE_TYPE_HDR_METADATA_EXT);
        return s;
    }
    public VkHdrMetadataEXT copyFrom(VkHdrMetadataEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkHdrMetadataEXT reinterpret(long count) { return new VkHdrMetadataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkHdrMetadataEXT asSlice(long index) { return new VkHdrMetadataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkHdrMetadataEXT asSlice(long index, long count) { return new VkHdrMetadataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkHdrMetadataEXT at(long index, Consumer<VkHdrMetadataEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public float displayPrimaryRed$xAt(long index) { return (float) VH_displayPrimaryRed$x.get(this.segment(), 0L, index); }
    public float displayPrimaryRed$yAt(long index) { return (float) VH_displayPrimaryRed$y.get(this.segment(), 0L, index); }
    public float displayPrimaryGreen$xAt(long index) { return (float) VH_displayPrimaryGreen$x.get(this.segment(), 0L, index); }
    public float displayPrimaryGreen$yAt(long index) { return (float) VH_displayPrimaryGreen$y.get(this.segment(), 0L, index); }
    public float displayPrimaryBlue$xAt(long index) { return (float) VH_displayPrimaryBlue$x.get(this.segment(), 0L, index); }
    public float displayPrimaryBlue$yAt(long index) { return (float) VH_displayPrimaryBlue$y.get(this.segment(), 0L, index); }
    public float whitePoint$xAt(long index) { return (float) VH_whitePoint$x.get(this.segment(), 0L, index); }
    public float whitePoint$yAt(long index) { return (float) VH_whitePoint$y.get(this.segment(), 0L, index); }
    public float maxLuminanceAt(long index) { return (float) VH_maxLuminance.get(this.segment(), 0L, index); }
    public float minLuminanceAt(long index) { return (float) VH_minLuminance.get(this.segment(), 0L, index); }
    public float maxContentLightLevelAt(long index) { return (float) VH_maxContentLightLevel.get(this.segment(), 0L, index); }
    public float maxFrameAverageLightLevelAt(long index) { return (float) VH_maxFrameAverageLightLevel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public float displayPrimaryRed$x() { return (float) VH_displayPrimaryRed$x.get(this.segment(), 0L, 0L); }
    public float displayPrimaryRed$y() { return (float) VH_displayPrimaryRed$y.get(this.segment(), 0L, 0L); }
    public float displayPrimaryGreen$x() { return (float) VH_displayPrimaryGreen$x.get(this.segment(), 0L, 0L); }
    public float displayPrimaryGreen$y() { return (float) VH_displayPrimaryGreen$y.get(this.segment(), 0L, 0L); }
    public float displayPrimaryBlue$x() { return (float) VH_displayPrimaryBlue$x.get(this.segment(), 0L, 0L); }
    public float displayPrimaryBlue$y() { return (float) VH_displayPrimaryBlue$y.get(this.segment(), 0L, 0L); }
    public float whitePoint$x() { return (float) VH_whitePoint$x.get(this.segment(), 0L, 0L); }
    public float whitePoint$y() { return (float) VH_whitePoint$y.get(this.segment(), 0L, 0L); }
    public float maxLuminance() { return (float) VH_maxLuminance.get(this.segment(), 0L, 0L); }
    public float minLuminance() { return (float) VH_minLuminance.get(this.segment(), 0L, 0L); }
    public float maxContentLightLevel() { return (float) VH_maxContentLightLevel.get(this.segment(), 0L, 0L); }
    public float maxFrameAverageLightLevel() { return (float) VH_maxFrameAverageLightLevel.get(this.segment(), 0L, 0L); }
    public VkHdrMetadataEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT displayPrimaryRed$xAt(long index, float value) { VH_displayPrimaryRed$x.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT displayPrimaryRed$yAt(long index, float value) { VH_displayPrimaryRed$y.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT displayPrimaryGreen$xAt(long index, float value) { VH_displayPrimaryGreen$x.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT displayPrimaryGreen$yAt(long index, float value) { VH_displayPrimaryGreen$y.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT displayPrimaryBlue$xAt(long index, float value) { VH_displayPrimaryBlue$x.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT displayPrimaryBlue$yAt(long index, float value) { VH_displayPrimaryBlue$y.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT whitePoint$xAt(long index, float value) { VH_whitePoint$x.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT whitePoint$yAt(long index, float value) { VH_whitePoint$y.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT maxLuminanceAt(long index, float value) { VH_maxLuminance.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT minLuminanceAt(long index, float value) { VH_minLuminance.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT maxContentLightLevelAt(long index, float value) { VH_maxContentLightLevel.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT maxFrameAverageLightLevelAt(long index, float value) { VH_maxFrameAverageLightLevel.set(this.segment(), 0L, index, value); return this; }
    public VkHdrMetadataEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT displayPrimaryRed$x(float value) { VH_displayPrimaryRed$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT displayPrimaryRed$y(float value) { VH_displayPrimaryRed$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT displayPrimaryGreen$x(float value) { VH_displayPrimaryGreen$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT displayPrimaryGreen$y(float value) { VH_displayPrimaryGreen$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT displayPrimaryBlue$x(float value) { VH_displayPrimaryBlue$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT displayPrimaryBlue$y(float value) { VH_displayPrimaryBlue$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT whitePoint$x(float value) { VH_whitePoint$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT whitePoint$y(float value) { VH_whitePoint$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT maxLuminance(float value) { VH_maxLuminance.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT minLuminance(float value) { VH_minLuminance.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT maxContentLightLevel(float value) { VH_maxContentLightLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrMetadataEXT maxFrameAverageLightLevel(float value) { VH_maxFrameAverageLightLevel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkHdrMetadataEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkHdrMetadataEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _displayPrimaryRedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayPrimaryRed, index), LAYOUT_displayPrimaryRed); }
    public MemorySegment _displayPrimaryRed() { return _displayPrimaryRedAt(0L); }
    public VkHdrMetadataEXT _displayPrimaryRedAt(long index, MemorySegment src) { _displayPrimaryRedAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _displayPrimaryRed(MemorySegment src) { return _displayPrimaryRedAt(0L, src); }
    public MemorySegment _displayPrimaryGreenAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayPrimaryGreen, index), LAYOUT_displayPrimaryGreen); }
    public MemorySegment _displayPrimaryGreen() { return _displayPrimaryGreenAt(0L); }
    public VkHdrMetadataEXT _displayPrimaryGreenAt(long index, MemorySegment src) { _displayPrimaryGreenAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _displayPrimaryGreen(MemorySegment src) { return _displayPrimaryGreenAt(0L, src); }
    public MemorySegment _displayPrimaryBlueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayPrimaryBlue, index), LAYOUT_displayPrimaryBlue); }
    public MemorySegment _displayPrimaryBlue() { return _displayPrimaryBlueAt(0L); }
    public VkHdrMetadataEXT _displayPrimaryBlueAt(long index, MemorySegment src) { _displayPrimaryBlueAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _displayPrimaryBlue(MemorySegment src) { return _displayPrimaryBlueAt(0L, src); }
    public MemorySegment _whitePointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_whitePoint, index), LAYOUT_whitePoint); }
    public MemorySegment _whitePoint() { return _whitePointAt(0L); }
    public VkHdrMetadataEXT _whitePointAt(long index, MemorySegment src) { _whitePointAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _whitePoint(MemorySegment src) { return _whitePointAt(0L, src); }
    public MemorySegment _maxLuminanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxLuminance, index), LAYOUT_maxLuminance); }
    public MemorySegment _maxLuminance() { return _maxLuminanceAt(0L); }
    public VkHdrMetadataEXT _maxLuminanceAt(long index, MemorySegment src) { _maxLuminanceAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _maxLuminance(MemorySegment src) { return _maxLuminanceAt(0L, src); }
    public MemorySegment _minLuminanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minLuminance, index), LAYOUT_minLuminance); }
    public MemorySegment _minLuminance() { return _minLuminanceAt(0L); }
    public VkHdrMetadataEXT _minLuminanceAt(long index, MemorySegment src) { _minLuminanceAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _minLuminance(MemorySegment src) { return _minLuminanceAt(0L, src); }
    public MemorySegment _maxContentLightLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxContentLightLevel, index), LAYOUT_maxContentLightLevel); }
    public MemorySegment _maxContentLightLevel() { return _maxContentLightLevelAt(0L); }
    public VkHdrMetadataEXT _maxContentLightLevelAt(long index, MemorySegment src) { _maxContentLightLevelAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _maxContentLightLevel(MemorySegment src) { return _maxContentLightLevelAt(0L, src); }
    public MemorySegment _maxFrameAverageLightLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFrameAverageLightLevel, index), LAYOUT_maxFrameAverageLightLevel); }
    public MemorySegment _maxFrameAverageLightLevel() { return _maxFrameAverageLightLevelAt(0L); }
    public VkHdrMetadataEXT _maxFrameAverageLightLevelAt(long index, MemorySegment src) { _maxFrameAverageLightLevelAt(index).copyFrom(src); return this; }
    public VkHdrMetadataEXT _maxFrameAverageLightLevel(MemorySegment src) { return _maxFrameAverageLightLevelAt(0L, src); }
}
