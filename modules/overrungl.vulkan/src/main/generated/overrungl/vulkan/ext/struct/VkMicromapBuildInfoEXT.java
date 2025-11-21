// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMicromapBuildInfoEXT`.
/// ## Layout
/// ```
/// struct VkMicromapBuildInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkMicromapTypeEXT type;
///     VkBuildMicromapFlagsEXT flags;
///     VkBuildMicromapModeEXT mode;
///     VkMicromapEXT dstMicromap;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT* pUsageCounts;
///     const VkMicromapUsageEXT* const* ppUsageCounts;
///     VkDeviceOrHostAddressConstKHR data;
///     VkDeviceOrHostAddressKHR scratchData;
///     VkDeviceOrHostAddressConstKHR triangleArray;
///     VkDeviceSize triangleArrayStride;
/// }
/// ```
public final class VkMicromapBuildInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_LONG.withName("dstMicromap"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withName("pUsageCounts"),
        ValueLayout.ADDRESS.withName("ppUsageCounts"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("triangleArray"),
        ValueLayout.JAVA_LONG.withName("triangleArrayStride")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final long OFFSET_dstMicromap = LAYOUT.byteOffset(PathElement.groupElement("dstMicromap"));
    public static final long OFFSET_usageCountsCount = LAYOUT.byteOffset(PathElement.groupElement("usageCountsCount"));
    public static final long OFFSET_pUsageCounts = LAYOUT.byteOffset(PathElement.groupElement("pUsageCounts"));
    public static final long OFFSET_ppUsageCounts = LAYOUT.byteOffset(PathElement.groupElement("ppUsageCounts"));
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    public static final long OFFSET_triangleArray = LAYOUT.byteOffset(PathElement.groupElement("triangleArray"));
    public static final long OFFSET_triangleArrayStride = LAYOUT.byteOffset(PathElement.groupElement("triangleArrayStride"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_dstMicromap = LAYOUT.select(PathElement.groupElement("dstMicromap"));
    public static final MemoryLayout LAYOUT_usageCountsCount = LAYOUT.select(PathElement.groupElement("usageCountsCount"));
    public static final MemoryLayout LAYOUT_pUsageCounts = LAYOUT.select(PathElement.groupElement("pUsageCounts"));
    public static final MemoryLayout LAYOUT_ppUsageCounts = LAYOUT.select(PathElement.groupElement("ppUsageCounts"));
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    public static final MemoryLayout LAYOUT_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));
    public static final MemoryLayout LAYOUT_triangleArray = LAYOUT.select(PathElement.groupElement("triangleArray"));
    public static final MemoryLayout LAYOUT_triangleArrayStride = LAYOUT.select(PathElement.groupElement("triangleArrayStride"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    public static final VarHandle VH_dstMicromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstMicromap"));
    public static final VarHandle VH_usageCountsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usageCountsCount"));
    public static final VarHandle VH_pUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUsageCounts"));
    public static final VarHandle VH_ppUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppUsageCounts"));
    public static final VarHandle VH_data$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_data$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_scratchData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_scratchData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_triangleArray$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangleArray"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_triangleArray$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangleArray"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_triangleArrayStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangleArrayStride"));

    public VkMicromapBuildInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMicromapBuildInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMicromapBuildInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMicromapBuildInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMicromapBuildInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapBuildInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMicromapBuildInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapBuildInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT); }
    public static VkMicromapBuildInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT);
        return s;
    }
    public VkMicromapBuildInfoEXT copyFrom(VkMicromapBuildInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMicromapBuildInfoEXT reinterpret(long count) { return new VkMicromapBuildInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMicromapBuildInfoEXT asSlice(long index) { return new VkMicromapBuildInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMicromapBuildInfoEXT asSlice(long index, long count) { return new VkMicromapBuildInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMicromapBuildInfoEXT at(long index, Consumer<VkMicromapBuildInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public long dstMicromapAt(long index) { return (long) VH_dstMicromap.get(this.segment(), 0L, index); }
    public int usageCountsCountAt(long index) { return (int) VH_usageCountsCount.get(this.segment(), 0L, index); }
    public MemorySegment pUsageCountsAt(long index) { return (MemorySegment) VH_pUsageCounts.get(this.segment(), 0L, index); }
    public MemorySegment ppUsageCountsAt(long index) { return (MemorySegment) VH_ppUsageCounts.get(this.segment(), 0L, index); }
    public long data$deviceAddressAt(long index) { return (long) VH_data$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment data$hostAddressAt(long index) { return (MemorySegment) VH_data$hostAddress.get(this.segment(), 0L, index); }
    public long scratchData$deviceAddressAt(long index) { return (long) VH_scratchData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment scratchData$hostAddressAt(long index) { return (MemorySegment) VH_scratchData$hostAddress.get(this.segment(), 0L, index); }
    public long triangleArray$deviceAddressAt(long index) { return (long) VH_triangleArray$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment triangleArray$hostAddressAt(long index) { return (MemorySegment) VH_triangleArray$hostAddress.get(this.segment(), 0L, index); }
    public long triangleArrayStrideAt(long index) { return (long) VH_triangleArrayStride.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public long dstMicromap() { return (long) VH_dstMicromap.get(this.segment(), 0L, 0L); }
    public int usageCountsCount() { return (int) VH_usageCountsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pUsageCounts() { return (MemorySegment) VH_pUsageCounts.get(this.segment(), 0L, 0L); }
    public MemorySegment ppUsageCounts() { return (MemorySegment) VH_ppUsageCounts.get(this.segment(), 0L, 0L); }
    public long data$deviceAddress() { return (long) VH_data$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment data$hostAddress() { return (MemorySegment) VH_data$hostAddress.get(this.segment(), 0L, 0L); }
    public long scratchData$deviceAddress() { return (long) VH_scratchData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment scratchData$hostAddress() { return (MemorySegment) VH_scratchData$hostAddress.get(this.segment(), 0L, 0L); }
    public long triangleArray$deviceAddress() { return (long) VH_triangleArray$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment triangleArray$hostAddress() { return (MemorySegment) VH_triangleArray$hostAddress.get(this.segment(), 0L, 0L); }
    public long triangleArrayStride() { return (long) VH_triangleArrayStride.get(this.segment(), 0L, 0L); }
    public VkMicromapBuildInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT dstMicromapAt(long index, long value) { VH_dstMicromap.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT usageCountsCountAt(long index, int value) { VH_usageCountsCount.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT pUsageCountsAt(long index, MemorySegment value) { VH_pUsageCounts.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT ppUsageCountsAt(long index, MemorySegment value) { VH_ppUsageCounts.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT data$deviceAddressAt(long index, long value) { VH_data$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT data$hostAddressAt(long index, MemorySegment value) { VH_data$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT scratchData$deviceAddressAt(long index, long value) { VH_scratchData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT scratchData$hostAddressAt(long index, MemorySegment value) { VH_scratchData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT triangleArray$deviceAddressAt(long index, long value) { VH_triangleArray$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT triangleArray$hostAddressAt(long index, MemorySegment value) { VH_triangleArray$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT triangleArrayStrideAt(long index, long value) { VH_triangleArrayStride.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapBuildInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT dstMicromap(long value) { VH_dstMicromap.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT usageCountsCount(int value) { VH_usageCountsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT pUsageCounts(MemorySegment value) { VH_pUsageCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT ppUsageCounts(MemorySegment value) { VH_ppUsageCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT data$deviceAddress(long value) { VH_data$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT data$hostAddress(MemorySegment value) { VH_data$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT scratchData$deviceAddress(long value) { VH_scratchData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT scratchData$hostAddress(MemorySegment value) { VH_scratchData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT triangleArray$deviceAddress(long value) { VH_triangleArray$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT triangleArray$hostAddress(MemorySegment value) { VH_triangleArray$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapBuildInfoEXT triangleArrayStride(long value) { VH_triangleArrayStride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMicromapBuildInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMicromapBuildInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkMicromapBuildInfoEXT _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkMicromapBuildInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkMicromapBuildInfoEXT _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _mode(MemorySegment src) { return _modeAt(0L, src); }
    public MemorySegment _dstMicromapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstMicromap, index), LAYOUT_dstMicromap); }
    public MemorySegment _dstMicromap() { return _dstMicromapAt(0L); }
    public VkMicromapBuildInfoEXT _dstMicromapAt(long index, MemorySegment src) { _dstMicromapAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _dstMicromap(MemorySegment src) { return _dstMicromapAt(0L, src); }
    public MemorySegment _usageCountsCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usageCountsCount, index), LAYOUT_usageCountsCount); }
    public MemorySegment _usageCountsCount() { return _usageCountsCountAt(0L); }
    public VkMicromapBuildInfoEXT _usageCountsCountAt(long index, MemorySegment src) { _usageCountsCountAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _usageCountsCount(MemorySegment src) { return _usageCountsCountAt(0L, src); }
    public MemorySegment _pUsageCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUsageCounts, index), LAYOUT_pUsageCounts); }
    public MemorySegment _pUsageCounts() { return _pUsageCountsAt(0L); }
    public VkMicromapBuildInfoEXT _pUsageCountsAt(long index, MemorySegment src) { _pUsageCountsAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _pUsageCounts(MemorySegment src) { return _pUsageCountsAt(0L, src); }
    public MemorySegment _ppUsageCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ppUsageCounts, index), LAYOUT_ppUsageCounts); }
    public MemorySegment _ppUsageCounts() { return _ppUsageCountsAt(0L); }
    public VkMicromapBuildInfoEXT _ppUsageCountsAt(long index, MemorySegment src) { _ppUsageCountsAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _ppUsageCounts(MemorySegment src) { return _ppUsageCountsAt(0L, src); }
    public MemorySegment _dataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    public MemorySegment _data() { return _dataAt(0L); }
    public VkMicromapBuildInfoEXT _dataAt(long index, MemorySegment src) { _dataAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _data(MemorySegment src) { return _dataAt(0L, src); }
    public MemorySegment _scratchDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scratchData, index), LAYOUT_scratchData); }
    public MemorySegment _scratchData() { return _scratchDataAt(0L); }
    public VkMicromapBuildInfoEXT _scratchDataAt(long index, MemorySegment src) { _scratchDataAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _scratchData(MemorySegment src) { return _scratchDataAt(0L, src); }
    public MemorySegment _triangleArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_triangleArray, index), LAYOUT_triangleArray); }
    public MemorySegment _triangleArray() { return _triangleArrayAt(0L); }
    public VkMicromapBuildInfoEXT _triangleArrayAt(long index, MemorySegment src) { _triangleArrayAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _triangleArray(MemorySegment src) { return _triangleArrayAt(0L, src); }
    public MemorySegment _triangleArrayStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_triangleArrayStride, index), LAYOUT_triangleArrayStride); }
    public MemorySegment _triangleArrayStride() { return _triangleArrayStrideAt(0L); }
    public VkMicromapBuildInfoEXT _triangleArrayStrideAt(long index, MemorySegment src) { _triangleArrayStrideAt(index).copyFrom(src); return this; }
    public VkMicromapBuildInfoEXT _triangleArrayStride(MemorySegment src) { return _triangleArrayStrideAt(0L, src); }
}
