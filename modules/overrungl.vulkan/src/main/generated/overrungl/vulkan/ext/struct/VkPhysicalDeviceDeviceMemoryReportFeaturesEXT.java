// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDeviceMemoryReportFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceMemoryReportFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 deviceMemoryReport;
/// }
/// ```
public final class VkPhysicalDeviceDeviceMemoryReportFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMemoryReport")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceMemoryReport = LAYOUT.byteOffset(PathElement.groupElement("deviceMemoryReport"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceMemoryReport = LAYOUT.select(PathElement.groupElement("deviceMemoryReport"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceMemoryReport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMemoryReport"));

    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceMemoryReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT); }
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceMemoryReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT copyFrom(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT at(long index, Consumer<VkPhysicalDeviceDeviceMemoryReportFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceMemoryReportAt(long index) { return (int) VH_deviceMemoryReport.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceMemoryReport() { return (int) VH_deviceMemoryReport.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT deviceMemoryReportAt(long index, int value) { VH_deviceMemoryReport.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT deviceMemoryReport(int value) { VH_deviceMemoryReport.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceMemoryReportAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceMemoryReport, index), LAYOUT_deviceMemoryReport); }
    public MemorySegment _deviceMemoryReport() { return _deviceMemoryReportAt(0L); }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT _deviceMemoryReportAt(long index, MemorySegment src) { _deviceMemoryReportAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT _deviceMemoryReport(MemorySegment src) { return _deviceMemoryReportAt(0L, src); }
}
