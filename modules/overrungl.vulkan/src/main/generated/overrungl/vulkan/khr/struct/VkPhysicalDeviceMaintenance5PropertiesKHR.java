// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance5PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance5PropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 earlyFragmentMultisampleCoverageAfterSampleCounting;
///     VkBool32 earlyFragmentSampleMaskTestBeforeSampleCounting;
///     VkBool32 depthStencilSwizzleOneSupport;
///     VkBool32 polygonModePointSize;
///     VkBool32 nonStrictSinglePixelWideLinesUseParallelogram;
///     VkBool32 nonStrictWideLinesUseParallelogram;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance5PropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
        ValueLayout.JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
        ValueLayout.JAVA_INT.withName("depthStencilSwizzleOneSupport"),
        ValueLayout.JAVA_INT.withName("polygonModePointSize"),
        ValueLayout.JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("nonStrictWideLinesUseParallelogram")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    public static final long OFFSET_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    public static final long OFFSET_depthStencilSwizzleOneSupport = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    public static final long OFFSET_polygonModePointSize = LAYOUT.byteOffset(PathElement.groupElement("polygonModePointSize"));
    public static final long OFFSET_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.byteOffset(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    public static final long OFFSET_nonStrictWideLinesUseParallelogram = LAYOUT.byteOffset(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.select(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    public static final MemoryLayout LAYOUT_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.select(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    public static final MemoryLayout LAYOUT_depthStencilSwizzleOneSupport = LAYOUT.select(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    public static final MemoryLayout LAYOUT_polygonModePointSize = LAYOUT.select(PathElement.groupElement("polygonModePointSize"));
    public static final MemoryLayout LAYOUT_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.select(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    public static final MemoryLayout LAYOUT_nonStrictWideLinesUseParallelogram = LAYOUT.select(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    public static final VarHandle VH_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    public static final VarHandle VH_depthStencilSwizzleOneSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    public static final VarHandle VH_polygonModePointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonModePointSize"));
    public static final VarHandle VH_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    public static final VarHandle VH_nonStrictWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));

    public VkPhysicalDeviceMaintenance5PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance5PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance5PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance5PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance5PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance5PropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance5PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance5PropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance5PropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES); }
    public static VkPhysicalDeviceMaintenance5PropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceMaintenance5PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance5PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance5PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance5PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance5PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance5PropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index) { return (int) VH_earlyFragmentMultisampleCoverageAfterSampleCounting.get(this.segment(), 0L, index); }
    public int earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index) { return (int) VH_earlyFragmentSampleMaskTestBeforeSampleCounting.get(this.segment(), 0L, index); }
    public int depthStencilSwizzleOneSupportAt(long index) { return (int) VH_depthStencilSwizzleOneSupport.get(this.segment(), 0L, index); }
    public int polygonModePointSizeAt(long index) { return (int) VH_polygonModePointSize.get(this.segment(), 0L, index); }
    public int nonStrictSinglePixelWideLinesUseParallelogramAt(long index) { return (int) VH_nonStrictSinglePixelWideLinesUseParallelogram.get(this.segment(), 0L, index); }
    public int nonStrictWideLinesUseParallelogramAt(long index) { return (int) VH_nonStrictWideLinesUseParallelogram.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int earlyFragmentMultisampleCoverageAfterSampleCounting() { return (int) VH_earlyFragmentMultisampleCoverageAfterSampleCounting.get(this.segment(), 0L, 0L); }
    public int earlyFragmentSampleMaskTestBeforeSampleCounting() { return (int) VH_earlyFragmentSampleMaskTestBeforeSampleCounting.get(this.segment(), 0L, 0L); }
    public int depthStencilSwizzleOneSupport() { return (int) VH_depthStencilSwizzleOneSupport.get(this.segment(), 0L, 0L); }
    public int polygonModePointSize() { return (int) VH_polygonModePointSize.get(this.segment(), 0L, 0L); }
    public int nonStrictSinglePixelWideLinesUseParallelogram() { return (int) VH_nonStrictSinglePixelWideLinesUseParallelogram.get(this.segment(), 0L, 0L); }
    public int nonStrictWideLinesUseParallelogram() { return (int) VH_nonStrictWideLinesUseParallelogram.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index, int value) { VH_earlyFragmentMultisampleCoverageAfterSampleCounting.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index, int value) { VH_earlyFragmentSampleMaskTestBeforeSampleCounting.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR depthStencilSwizzleOneSupportAt(long index, int value) { VH_depthStencilSwizzleOneSupport.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR polygonModePointSizeAt(long index, int value) { VH_polygonModePointSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR nonStrictSinglePixelWideLinesUseParallelogramAt(long index, int value) { VH_nonStrictSinglePixelWideLinesUseParallelogram.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR nonStrictWideLinesUseParallelogramAt(long index, int value) { VH_nonStrictWideLinesUseParallelogram.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR earlyFragmentMultisampleCoverageAfterSampleCounting(int value) { VH_earlyFragmentMultisampleCoverageAfterSampleCounting.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR earlyFragmentSampleMaskTestBeforeSampleCounting(int value) { VH_earlyFragmentSampleMaskTestBeforeSampleCounting.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR depthStencilSwizzleOneSupport(int value) { VH_depthStencilSwizzleOneSupport.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR polygonModePointSize(int value) { VH_polygonModePointSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR nonStrictSinglePixelWideLinesUseParallelogram(int value) { VH_nonStrictSinglePixelWideLinesUseParallelogram.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR nonStrictWideLinesUseParallelogram(int value) { VH_nonStrictWideLinesUseParallelogram.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_earlyFragmentMultisampleCoverageAfterSampleCounting, index), LAYOUT_earlyFragmentMultisampleCoverageAfterSampleCounting); }
    public MemorySegment _earlyFragmentMultisampleCoverageAfterSampleCounting() { return _earlyFragmentMultisampleCoverageAfterSampleCountingAt(0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index, MemorySegment src) { _earlyFragmentMultisampleCoverageAfterSampleCountingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment src) { return _earlyFragmentMultisampleCoverageAfterSampleCountingAt(0L, src); }
    public MemorySegment _earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_earlyFragmentSampleMaskTestBeforeSampleCounting, index), LAYOUT_earlyFragmentSampleMaskTestBeforeSampleCounting); }
    public MemorySegment _earlyFragmentSampleMaskTestBeforeSampleCounting() { return _earlyFragmentSampleMaskTestBeforeSampleCountingAt(0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index, MemorySegment src) { _earlyFragmentSampleMaskTestBeforeSampleCountingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment src) { return _earlyFragmentSampleMaskTestBeforeSampleCountingAt(0L, src); }
    public MemorySegment _depthStencilSwizzleOneSupportAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthStencilSwizzleOneSupport, index), LAYOUT_depthStencilSwizzleOneSupport); }
    public MemorySegment _depthStencilSwizzleOneSupport() { return _depthStencilSwizzleOneSupportAt(0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _depthStencilSwizzleOneSupportAt(long index, MemorySegment src) { _depthStencilSwizzleOneSupportAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _depthStencilSwizzleOneSupport(MemorySegment src) { return _depthStencilSwizzleOneSupportAt(0L, src); }
    public MemorySegment _polygonModePointSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_polygonModePointSize, index), LAYOUT_polygonModePointSize); }
    public MemorySegment _polygonModePointSize() { return _polygonModePointSizeAt(0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _polygonModePointSizeAt(long index, MemorySegment src) { _polygonModePointSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _polygonModePointSize(MemorySegment src) { return _polygonModePointSizeAt(0L, src); }
    public MemorySegment _nonStrictSinglePixelWideLinesUseParallelogramAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nonStrictSinglePixelWideLinesUseParallelogram, index), LAYOUT_nonStrictSinglePixelWideLinesUseParallelogram); }
    public MemorySegment _nonStrictSinglePixelWideLinesUseParallelogram() { return _nonStrictSinglePixelWideLinesUseParallelogramAt(0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _nonStrictSinglePixelWideLinesUseParallelogramAt(long index, MemorySegment src) { _nonStrictSinglePixelWideLinesUseParallelogramAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment src) { return _nonStrictSinglePixelWideLinesUseParallelogramAt(0L, src); }
    public MemorySegment _nonStrictWideLinesUseParallelogramAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nonStrictWideLinesUseParallelogram, index), LAYOUT_nonStrictWideLinesUseParallelogram); }
    public MemorySegment _nonStrictWideLinesUseParallelogram() { return _nonStrictWideLinesUseParallelogramAt(0L); }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _nonStrictWideLinesUseParallelogramAt(long index, MemorySegment src) { _nonStrictWideLinesUseParallelogramAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance5PropertiesKHR _nonStrictWideLinesUseParallelogram(MemorySegment src) { return _nonStrictWideLinesUseParallelogramAt(0L, src); }
}
