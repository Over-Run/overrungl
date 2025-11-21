// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDisplacementMicromapPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDisplacementMicromapPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxDisplacementMicromapSubdivisionLevel;
/// }
/// ```
public final class VkPhysicalDeviceDisplacementMicromapPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDisplacementMicromapSubdivisionLevel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxDisplacementMicromapSubdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("maxDisplacementMicromapSubdivisionLevel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxDisplacementMicromapSubdivisionLevel = LAYOUT.select(PathElement.groupElement("maxDisplacementMicromapSubdivisionLevel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxDisplacementMicromapSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDisplacementMicromapSubdivisionLevel"));

    public VkPhysicalDeviceDisplacementMicromapPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDisplacementMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV); }
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDisplacementMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV copyFrom(VkPhysicalDeviceDisplacementMicromapPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV asSlice(long index) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV at(long index, Consumer<VkPhysicalDeviceDisplacementMicromapPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxDisplacementMicromapSubdivisionLevelAt(long index) { return (int) VH_maxDisplacementMicromapSubdivisionLevel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxDisplacementMicromapSubdivisionLevel() { return (int) VH_maxDisplacementMicromapSubdivisionLevel.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV maxDisplacementMicromapSubdivisionLevelAt(long index, int value) { VH_maxDisplacementMicromapSubdivisionLevel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV maxDisplacementMicromapSubdivisionLevel(int value) { VH_maxDisplacementMicromapSubdivisionLevel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxDisplacementMicromapSubdivisionLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDisplacementMicromapSubdivisionLevel, index), LAYOUT_maxDisplacementMicromapSubdivisionLevel); }
    public MemorySegment _maxDisplacementMicromapSubdivisionLevel() { return _maxDisplacementMicromapSubdivisionLevelAt(0L); }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV _maxDisplacementMicromapSubdivisionLevelAt(long index, MemorySegment src) { _maxDisplacementMicromapSubdivisionLevelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV _maxDisplacementMicromapSubdivisionLevel(MemorySegment src) { return _maxDisplacementMicromapSubdivisionLevelAt(0L, src); }
}
