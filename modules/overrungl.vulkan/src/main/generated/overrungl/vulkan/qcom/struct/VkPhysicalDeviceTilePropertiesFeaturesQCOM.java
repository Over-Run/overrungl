// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTilePropertiesFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTilePropertiesFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 tileProperties;
/// }
/// ```
public final class VkPhysicalDeviceTilePropertiesFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tileProperties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tileProperties = LAYOUT.byteOffset(PathElement.groupElement("tileProperties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tileProperties = LAYOUT.select(PathElement.groupElement("tileProperties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tileProperties = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileProperties"));

    public VkPhysicalDeviceTilePropertiesFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTilePropertiesFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTilePropertiesFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTilePropertiesFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM); }
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM copyFrom(VkPhysicalDeviceTilePropertiesFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceTilePropertiesFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tilePropertiesAt(long index) { return (int) VH_tileProperties.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tileProperties() { return (int) VH_tileProperties.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM tilePropertiesAt(long index, int value) { VH_tileProperties.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM tileProperties(int value) { VH_tileProperties.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tilePropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileProperties, index), LAYOUT_tileProperties); }
    public MemorySegment _tileProperties() { return _tilePropertiesAt(0L); }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM _tilePropertiesAt(long index, MemorySegment src) { _tilePropertiesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM _tileProperties(MemorySegment src) { return _tilePropertiesAt(0L, src); }
}
