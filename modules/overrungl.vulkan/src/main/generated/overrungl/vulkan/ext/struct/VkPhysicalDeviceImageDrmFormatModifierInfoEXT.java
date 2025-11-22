// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageDrmFormatModifierInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t drmFormatModifier;
///     VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t* pQueueFamilyIndices;
/// }
/// ```
public final class VkPhysicalDeviceImageDrmFormatModifierInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_drmFormatModifier = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
    public static final long OFFSET_sharingMode = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
    public static final long OFFSET_queueFamilyIndexCount = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
    public static final long OFFSET_pQueueFamilyIndices = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_drmFormatModifier = LAYOUT.select(PathElement.groupElement("drmFormatModifier"));
    public static final MemoryLayout LAYOUT_sharingMode = LAYOUT.select(PathElement.groupElement("sharingMode"));
    public static final MemoryLayout LAYOUT_queueFamilyIndexCount = LAYOUT.select(PathElement.groupElement("queueFamilyIndexCount"));
    public static final MemoryLayout LAYOUT_pQueueFamilyIndices = LAYOUT.select(PathElement.groupElement("pQueueFamilyIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT); }
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT);
        return s;
    }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT copyFrom(VkPhysicalDeviceImageDrmFormatModifierInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT reinterpret(long count) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT asSlice(long index) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT at(long index, Consumer<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long drmFormatModifierAt(long index) { return (long) VH_drmFormatModifier.get(this.segment(), 0L, index); }
    public int sharingModeAt(long index) { return (int) VH_sharingMode.get(this.segment(), 0L, index); }
    public int queueFamilyIndexCountAt(long index) { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pQueueFamilyIndicesAt(long index) { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long drmFormatModifier() { return (long) VH_drmFormatModifier.get(this.segment(), 0L, 0L); }
    public int sharingMode() { return (int) VH_sharingMode.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndexCount() { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueueFamilyIndices() { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifierAt(long index, long value) { VH_drmFormatModifier.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingModeAt(long index, int value) { VH_sharingMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCountAt(long index, int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndicesAt(long index, MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifier(long value) { VH_drmFormatModifier.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingMode(int value) { VH_sharingMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCount(int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndices(MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _drmFormatModifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifier, index), LAYOUT_drmFormatModifier); }
    public MemorySegment _drmFormatModifier() { return _drmFormatModifierAt(0L); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _drmFormatModifierAt(long index, MemorySegment src) { _drmFormatModifierAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _drmFormatModifier(MemorySegment src) { return _drmFormatModifierAt(0L, src); }
    public MemorySegment _sharingModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sharingMode, index), LAYOUT_sharingMode); }
    public MemorySegment _sharingMode() { return _sharingModeAt(0L); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _sharingModeAt(long index, MemorySegment src) { _sharingModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _sharingMode(MemorySegment src) { return _sharingModeAt(0L, src); }
    public MemorySegment _queueFamilyIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndexCount, index), LAYOUT_queueFamilyIndexCount); }
    public MemorySegment _queueFamilyIndexCount() { return _queueFamilyIndexCountAt(0L); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _queueFamilyIndexCountAt(long index, MemorySegment src) { _queueFamilyIndexCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _queueFamilyIndexCount(MemorySegment src) { return _queueFamilyIndexCountAt(0L, src); }
    public MemorySegment _pQueueFamilyIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueueFamilyIndices, index), LAYOUT_pQueueFamilyIndices); }
    public MemorySegment _pQueueFamilyIndices() { return _pQueueFamilyIndicesAt(0L); }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _pQueueFamilyIndicesAt(long index, MemorySegment src) { _pQueueFamilyIndicesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT _pQueueFamilyIndices(MemorySegment src) { return _pQueueFamilyIndicesAt(0L, src); }
}
