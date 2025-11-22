// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkSampleCountFlagBits maxFragmentShadingRateInvocationCount;
/// }
/// ```
public final class VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateInvocationCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxFragmentShadingRateInvocationCount = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateInvocationCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateInvocationCount = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateInvocationCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxFragmentShadingRateInvocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateInvocationCount"));

    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV copyFrom(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV at(long index, Consumer<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxFragmentShadingRateInvocationCountAt(long index) { return (int) VH_maxFragmentShadingRateInvocationCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxFragmentShadingRateInvocationCount() { return (int) VH_maxFragmentShadingRateInvocationCount.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV maxFragmentShadingRateInvocationCountAt(long index, int value) { VH_maxFragmentShadingRateInvocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV maxFragmentShadingRateInvocationCount(int value) { VH_maxFragmentShadingRateInvocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxFragmentShadingRateInvocationCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentShadingRateInvocationCount, index), LAYOUT_maxFragmentShadingRateInvocationCount); }
    public MemorySegment _maxFragmentShadingRateInvocationCount() { return _maxFragmentShadingRateInvocationCountAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV _maxFragmentShadingRateInvocationCountAt(long index, MemorySegment src) { _maxFragmentShadingRateInvocationCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV _maxFragmentShadingRateInvocationCount(MemorySegment src) { return _maxFragmentShadingRateInvocationCountAt(0L, src); }
}
