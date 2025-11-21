// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceOpacityMicromapPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceOpacityMicromapPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxOpacity2StateSubdivisionLevel;
///     uint32_t maxOpacity4StateSubdivisionLevel;
/// }
/// ```
public final class VkPhysicalDeviceOpacityMicromapPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxOpacity2StateSubdivisionLevel"),
        ValueLayout.JAVA_INT.withName("maxOpacity4StateSubdivisionLevel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxOpacity2StateSubdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
    public static final long OFFSET_maxOpacity4StateSubdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxOpacity2StateSubdivisionLevel = LAYOUT.select(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
    public static final MemoryLayout LAYOUT_maxOpacity4StateSubdivisionLevel = LAYOUT.select(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxOpacity2StateSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
    public static final VarHandle VH_maxOpacity4StateSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT); }
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT copyFrom(VkPhysicalDeviceOpacityMicromapPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT at(long index, Consumer<VkPhysicalDeviceOpacityMicromapPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxOpacity2StateSubdivisionLevelAt(long index) { return (int) VH_maxOpacity2StateSubdivisionLevel.get(this.segment(), 0L, index); }
    public int maxOpacity4StateSubdivisionLevelAt(long index) { return (int) VH_maxOpacity4StateSubdivisionLevel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxOpacity2StateSubdivisionLevel() { return (int) VH_maxOpacity2StateSubdivisionLevel.get(this.segment(), 0L, 0L); }
    public int maxOpacity4StateSubdivisionLevel() { return (int) VH_maxOpacity4StateSubdivisionLevel.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity2StateSubdivisionLevelAt(long index, int value) { VH_maxOpacity2StateSubdivisionLevel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity4StateSubdivisionLevelAt(long index, int value) { VH_maxOpacity4StateSubdivisionLevel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity2StateSubdivisionLevel(int value) { VH_maxOpacity2StateSubdivisionLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity4StateSubdivisionLevel(int value) { VH_maxOpacity4StateSubdivisionLevel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxOpacity2StateSubdivisionLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxOpacity2StateSubdivisionLevel, index), LAYOUT_maxOpacity2StateSubdivisionLevel); }
    public MemorySegment _maxOpacity2StateSubdivisionLevel() { return _maxOpacity2StateSubdivisionLevelAt(0L); }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT _maxOpacity2StateSubdivisionLevelAt(long index, MemorySegment src) { _maxOpacity2StateSubdivisionLevelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT _maxOpacity2StateSubdivisionLevel(MemorySegment src) { return _maxOpacity2StateSubdivisionLevelAt(0L, src); }
    public MemorySegment _maxOpacity4StateSubdivisionLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxOpacity4StateSubdivisionLevel, index), LAYOUT_maxOpacity4StateSubdivisionLevel); }
    public MemorySegment _maxOpacity4StateSubdivisionLevel() { return _maxOpacity4StateSubdivisionLevelAt(0L); }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT _maxOpacity4StateSubdivisionLevelAt(long index, MemorySegment src) { _maxOpacity4StateSubdivisionLevelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT _maxOpacity4StateSubdivisionLevel(MemorySegment src) { return _maxOpacity4StateSubdivisionLevelAt(0L, src); }
}
