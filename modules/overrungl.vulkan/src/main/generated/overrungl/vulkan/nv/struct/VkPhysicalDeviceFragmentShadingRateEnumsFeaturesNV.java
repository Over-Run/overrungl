// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentShadingRateEnums;
///     VkBool32 supersampleFragmentShadingRates;
///     VkBool32 noInvocationFragmentShadingRates;
/// }
/// ```
public final class VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateEnums"),
        ValueLayout.JAVA_INT.withName("supersampleFragmentShadingRates"),
        ValueLayout.JAVA_INT.withName("noInvocationFragmentShadingRates")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentShadingRateEnums = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateEnums"));
    public static final long OFFSET_supersampleFragmentShadingRates = LAYOUT.byteOffset(PathElement.groupElement("supersampleFragmentShadingRates"));
    public static final long OFFSET_noInvocationFragmentShadingRates = LAYOUT.byteOffset(PathElement.groupElement("noInvocationFragmentShadingRates"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateEnums = LAYOUT.select(PathElement.groupElement("fragmentShadingRateEnums"));
    public static final MemoryLayout LAYOUT_supersampleFragmentShadingRates = LAYOUT.select(PathElement.groupElement("supersampleFragmentShadingRates"));
    public static final MemoryLayout LAYOUT_noInvocationFragmentShadingRates = LAYOUT.select(PathElement.groupElement("noInvocationFragmentShadingRates"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentShadingRateEnums = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateEnums"));
    public static final VarHandle VH_supersampleFragmentShadingRates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supersampleFragmentShadingRates"));
    public static final VarHandle VH_noInvocationFragmentShadingRates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("noInvocationFragmentShadingRates"));

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV); }
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV copyFrom(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV at(long index, Consumer<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentShadingRateEnumsAt(long index) { return (int) VH_fragmentShadingRateEnums.get(this.segment(), 0L, index); }
    public int supersampleFragmentShadingRatesAt(long index) { return (int) VH_supersampleFragmentShadingRates.get(this.segment(), 0L, index); }
    public int noInvocationFragmentShadingRatesAt(long index) { return (int) VH_noInvocationFragmentShadingRates.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateEnums() { return (int) VH_fragmentShadingRateEnums.get(this.segment(), 0L, 0L); }
    public int supersampleFragmentShadingRates() { return (int) VH_supersampleFragmentShadingRates.get(this.segment(), 0L, 0L); }
    public int noInvocationFragmentShadingRates() { return (int) VH_noInvocationFragmentShadingRates.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnumsAt(long index, int value) { VH_fragmentShadingRateEnums.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRatesAt(long index, int value) { VH_supersampleFragmentShadingRates.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRatesAt(long index, int value) { VH_noInvocationFragmentShadingRates.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnums(int value) { VH_fragmentShadingRateEnums.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRates(int value) { VH_supersampleFragmentShadingRates.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRates(int value) { VH_noInvocationFragmentShadingRates.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentShadingRateEnumsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateEnums, index), LAYOUT_fragmentShadingRateEnums); }
    public MemorySegment _fragmentShadingRateEnums() { return _fragmentShadingRateEnumsAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _fragmentShadingRateEnumsAt(long index, MemorySegment src) { _fragmentShadingRateEnumsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _fragmentShadingRateEnums(MemorySegment src) { return _fragmentShadingRateEnumsAt(0L, src); }
    public MemorySegment _supersampleFragmentShadingRatesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supersampleFragmentShadingRates, index), LAYOUT_supersampleFragmentShadingRates); }
    public MemorySegment _supersampleFragmentShadingRates() { return _supersampleFragmentShadingRatesAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _supersampleFragmentShadingRatesAt(long index, MemorySegment src) { _supersampleFragmentShadingRatesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _supersampleFragmentShadingRates(MemorySegment src) { return _supersampleFragmentShadingRatesAt(0L, src); }
    public MemorySegment _noInvocationFragmentShadingRatesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_noInvocationFragmentShadingRates, index), LAYOUT_noInvocationFragmentShadingRates); }
    public MemorySegment _noInvocationFragmentShadingRates() { return _noInvocationFragmentShadingRatesAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _noInvocationFragmentShadingRatesAt(long index, MemorySegment src) { _noInvocationFragmentShadingRatesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV _noInvocationFragmentShadingRates(MemorySegment src) { return _noInvocationFragmentShadingRatesAt(0L, src); }
}
