// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTileShadingPropertiesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTileShadingPropertiesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxApronSize;
///     VkBool32 preferNonCoherent;
///     VkExtent2D tileGranularity;
///     VkExtent2D maxTileShadingRate;
/// }
/// ```
public final class VkPhysicalDeviceTileShadingPropertiesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxApronSize"),
        ValueLayout.JAVA_INT.withName("preferNonCoherent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("tileGranularity"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTileShadingRate")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxApronSize = LAYOUT.byteOffset(PathElement.groupElement("maxApronSize"));
    public static final long OFFSET_preferNonCoherent = LAYOUT.byteOffset(PathElement.groupElement("preferNonCoherent"));
    public static final long OFFSET_tileGranularity = LAYOUT.byteOffset(PathElement.groupElement("tileGranularity"));
    public static final long OFFSET_maxTileShadingRate = LAYOUT.byteOffset(PathElement.groupElement("maxTileShadingRate"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxApronSize = LAYOUT.select(PathElement.groupElement("maxApronSize"));
    public static final MemoryLayout LAYOUT_preferNonCoherent = LAYOUT.select(PathElement.groupElement("preferNonCoherent"));
    public static final MemoryLayout LAYOUT_tileGranularity = LAYOUT.select(PathElement.groupElement("tileGranularity"));
    public static final MemoryLayout LAYOUT_maxTileShadingRate = LAYOUT.select(PathElement.groupElement("maxTileShadingRate"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxApronSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxApronSize"));
    public static final VarHandle VH_preferNonCoherent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferNonCoherent"));
    public static final VarHandle VH_tileGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_tileGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxTileShadingRate$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTileShadingRate"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxTileShadingRate$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTileShadingRate"), PathElement.groupElement("height"));

    public VkPhysicalDeviceTileShadingPropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTileShadingPropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingPropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTileShadingPropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingPropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTileShadingPropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingPropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTileShadingPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTileShadingPropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM); }
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM);
        return s;
    }
    public VkPhysicalDeviceTileShadingPropertiesQCOM copyFrom(VkPhysicalDeviceTileShadingPropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM reinterpret(long count) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM at(long index, Consumer<VkPhysicalDeviceTileShadingPropertiesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxApronSizeAt(long index) { return (int) VH_maxApronSize.get(this.segment(), 0L, index); }
    public int preferNonCoherentAt(long index) { return (int) VH_preferNonCoherent.get(this.segment(), 0L, index); }
    public int tileGranularity$widthAt(long index) { return (int) VH_tileGranularity$width.get(this.segment(), 0L, index); }
    public int tileGranularity$heightAt(long index) { return (int) VH_tileGranularity$height.get(this.segment(), 0L, index); }
    public int maxTileShadingRate$widthAt(long index) { return (int) VH_maxTileShadingRate$width.get(this.segment(), 0L, index); }
    public int maxTileShadingRate$heightAt(long index) { return (int) VH_maxTileShadingRate$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxApronSize() { return (int) VH_maxApronSize.get(this.segment(), 0L, 0L); }
    public int preferNonCoherent() { return (int) VH_preferNonCoherent.get(this.segment(), 0L, 0L); }
    public int tileGranularity$width() { return (int) VH_tileGranularity$width.get(this.segment(), 0L, 0L); }
    public int tileGranularity$height() { return (int) VH_tileGranularity$height.get(this.segment(), 0L, 0L); }
    public int maxTileShadingRate$width() { return (int) VH_maxTileShadingRate$width.get(this.segment(), 0L, 0L); }
    public int maxTileShadingRate$height() { return (int) VH_maxTileShadingRate$height.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxApronSizeAt(long index, int value) { VH_maxApronSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM preferNonCoherentAt(long index, int value) { VH_preferNonCoherent.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity$widthAt(long index, int value) { VH_tileGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity$heightAt(long index, int value) { VH_tileGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate$widthAt(long index, int value) { VH_maxTileShadingRate$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate$heightAt(long index, int value) { VH_maxTileShadingRate$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxApronSize(int value) { VH_maxApronSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM preferNonCoherent(int value) { VH_preferNonCoherent.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity$width(int value) { VH_tileGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity$height(int value) { VH_tileGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate$width(int value) { VH_maxTileShadingRate$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate$height(int value) { VH_maxTileShadingRate$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxApronSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxApronSize, index), LAYOUT_maxApronSize); }
    public MemorySegment _maxApronSize() { return _maxApronSizeAt(0L); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _maxApronSizeAt(long index, MemorySegment src) { _maxApronSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _maxApronSize(MemorySegment src) { return _maxApronSizeAt(0L, src); }
    public MemorySegment _preferNonCoherentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferNonCoherent, index), LAYOUT_preferNonCoherent); }
    public MemorySegment _preferNonCoherent() { return _preferNonCoherentAt(0L); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _preferNonCoherentAt(long index, MemorySegment src) { _preferNonCoherentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _preferNonCoherent(MemorySegment src) { return _preferNonCoherentAt(0L, src); }
    public MemorySegment _tileGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileGranularity, index), LAYOUT_tileGranularity); }
    public MemorySegment _tileGranularity() { return _tileGranularityAt(0L); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _tileGranularityAt(long index, MemorySegment src) { _tileGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _tileGranularity(MemorySegment src) { return _tileGranularityAt(0L, src); }
    public MemorySegment _maxTileShadingRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTileShadingRate, index), LAYOUT_maxTileShadingRate); }
    public MemorySegment _maxTileShadingRate() { return _maxTileShadingRateAt(0L); }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _maxTileShadingRateAt(long index, MemorySegment src) { _maxTileShadingRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileShadingPropertiesQCOM _maxTileShadingRate(MemorySegment src) { return _maxTileShadingRateAt(0L, src); }
}
