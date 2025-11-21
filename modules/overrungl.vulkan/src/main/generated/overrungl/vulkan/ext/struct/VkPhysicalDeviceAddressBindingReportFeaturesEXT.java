// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceAddressBindingReportFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceAddressBindingReportFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 reportAddressBinding;
/// }
/// ```
public final class VkPhysicalDeviceAddressBindingReportFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("reportAddressBinding")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_reportAddressBinding = LAYOUT.byteOffset(PathElement.groupElement("reportAddressBinding"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_reportAddressBinding = LAYOUT.select(PathElement.groupElement("reportAddressBinding"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_reportAddressBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reportAddressBinding"));

    public VkPhysicalDeviceAddressBindingReportFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAddressBindingReportFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAddressBindingReportFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAddressBindingReportFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT); }
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT copyFrom(VkPhysicalDeviceAddressBindingReportFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT at(long index, Consumer<VkPhysicalDeviceAddressBindingReportFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int reportAddressBindingAt(long index) { return (int) VH_reportAddressBinding.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int reportAddressBinding() { return (int) VH_reportAddressBinding.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT reportAddressBindingAt(long index, int value) { VH_reportAddressBinding.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT reportAddressBinding(int value) { VH_reportAddressBinding.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _reportAddressBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_reportAddressBinding, index), LAYOUT_reportAddressBinding); }
    public MemorySegment _reportAddressBinding() { return _reportAddressBindingAt(0L); }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT _reportAddressBindingAt(long index, MemorySegment src) { _reportAddressBindingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT _reportAddressBinding(MemorySegment src) { return _reportAddressBindingAt(0L, src); }
}
