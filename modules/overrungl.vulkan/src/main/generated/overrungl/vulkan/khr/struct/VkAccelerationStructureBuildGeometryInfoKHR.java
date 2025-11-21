// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureBuildGeometryInfoKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureBuildGeometryInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureTypeKHR type;
///     VkBuildAccelerationStructureFlagsKHR flags;
///     VkBuildAccelerationStructureModeKHR mode;
///     VkAccelerationStructureKHR srcAccelerationStructure;
///     VkAccelerationStructureKHR dstAccelerationStructure;
///     uint32_t geometryCount;
///     const VkAccelerationStructureGeometryKHR* pGeometries;
///     const VkAccelerationStructureGeometryKHR* const* ppGeometries;
///     VkDeviceOrHostAddressKHR scratchData;
/// }
/// ```
public final class VkAccelerationStructureBuildGeometryInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_LONG.withName("srcAccelerationStructure"),
        ValueLayout.JAVA_LONG.withName("dstAccelerationStructure"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withName("pGeometries"),
        ValueLayout.ADDRESS.withName("ppGeometries"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final long OFFSET_srcAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructure"));
    public static final long OFFSET_dstAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("dstAccelerationStructure"));
    public static final long OFFSET_geometryCount = LAYOUT.byteOffset(PathElement.groupElement("geometryCount"));
    public static final long OFFSET_pGeometries = LAYOUT.byteOffset(PathElement.groupElement("pGeometries"));
    public static final long OFFSET_ppGeometries = LAYOUT.byteOffset(PathElement.groupElement("ppGeometries"));
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_srcAccelerationStructure = LAYOUT.select(PathElement.groupElement("srcAccelerationStructure"));
    public static final MemoryLayout LAYOUT_dstAccelerationStructure = LAYOUT.select(PathElement.groupElement("dstAccelerationStructure"));
    public static final MemoryLayout LAYOUT_geometryCount = LAYOUT.select(PathElement.groupElement("geometryCount"));
    public static final MemoryLayout LAYOUT_pGeometries = LAYOUT.select(PathElement.groupElement("pGeometries"));
    public static final MemoryLayout LAYOUT_ppGeometries = LAYOUT.select(PathElement.groupElement("ppGeometries"));
    public static final MemoryLayout LAYOUT_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    public static final VarHandle VH_srcAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccelerationStructure"));
    public static final VarHandle VH_dstAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccelerationStructure"));
    public static final VarHandle VH_geometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryCount"));
    public static final VarHandle VH_pGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGeometries"));
    public static final VarHandle VH_ppGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppGeometries"));
    public static final VarHandle VH_scratchData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_scratchData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchData"), PathElement.groupElement("hostAddress"));

    public VkAccelerationStructureBuildGeometryInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureBuildGeometryInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildGeometryInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureBuildGeometryInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildGeometryInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureBuildGeometryInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildGeometryInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureBuildGeometryInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildGeometryInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureBuildGeometryInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureBuildGeometryInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR); }
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR);
        return s;
    }
    public VkAccelerationStructureBuildGeometryInfoKHR copyFrom(VkAccelerationStructureBuildGeometryInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR reinterpret(long count) { return new VkAccelerationStructureBuildGeometryInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureBuildGeometryInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildGeometryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureBuildGeometryInfoKHR asSlice(long index, long count) { return new VkAccelerationStructureBuildGeometryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureBuildGeometryInfoKHR at(long index, Consumer<VkAccelerationStructureBuildGeometryInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public long srcAccelerationStructureAt(long index) { return (long) VH_srcAccelerationStructure.get(this.segment(), 0L, index); }
    public long dstAccelerationStructureAt(long index) { return (long) VH_dstAccelerationStructure.get(this.segment(), 0L, index); }
    public int geometryCountAt(long index) { return (int) VH_geometryCount.get(this.segment(), 0L, index); }
    public MemorySegment pGeometriesAt(long index) { return (MemorySegment) VH_pGeometries.get(this.segment(), 0L, index); }
    public MemorySegment ppGeometriesAt(long index) { return (MemorySegment) VH_ppGeometries.get(this.segment(), 0L, index); }
    public long scratchData$deviceAddressAt(long index) { return (long) VH_scratchData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment scratchData$hostAddressAt(long index) { return (MemorySegment) VH_scratchData$hostAddress.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public long srcAccelerationStructure() { return (long) VH_srcAccelerationStructure.get(this.segment(), 0L, 0L); }
    public long dstAccelerationStructure() { return (long) VH_dstAccelerationStructure.get(this.segment(), 0L, 0L); }
    public int geometryCount() { return (int) VH_geometryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pGeometries() { return (MemorySegment) VH_pGeometries.get(this.segment(), 0L, 0L); }
    public MemorySegment ppGeometries() { return (MemorySegment) VH_ppGeometries.get(this.segment(), 0L, 0L); }
    public long scratchData$deviceAddress() { return (long) VH_scratchData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment scratchData$hostAddress() { return (MemorySegment) VH_scratchData$hostAddress.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructureAt(long index, long value) { VH_srcAccelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructureAt(long index, long value) { VH_dstAccelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR geometryCountAt(long index, int value) { VH_geometryCount.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR pGeometriesAt(long index, MemorySegment value) { VH_pGeometries.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometriesAt(long index, MemorySegment value) { VH_ppGeometries.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData$deviceAddressAt(long index, long value) { VH_scratchData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData$hostAddressAt(long index, MemorySegment value) { VH_scratchData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructure(long value) { VH_srcAccelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructure(long value) { VH_dstAccelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR geometryCount(int value) { VH_geometryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR pGeometries(MemorySegment value) { VH_pGeometries.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometries(MemorySegment value) { VH_ppGeometries.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData$deviceAddress(long value) { VH_scratchData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData$hostAddress(MemorySegment value) { VH_scratchData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _mode(MemorySegment src) { return _modeAt(0L, src); }
    public MemorySegment _srcAccelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccelerationStructure, index), LAYOUT_srcAccelerationStructure); }
    public MemorySegment _srcAccelerationStructure() { return _srcAccelerationStructureAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _srcAccelerationStructureAt(long index, MemorySegment src) { _srcAccelerationStructureAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _srcAccelerationStructure(MemorySegment src) { return _srcAccelerationStructureAt(0L, src); }
    public MemorySegment _dstAccelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAccelerationStructure, index), LAYOUT_dstAccelerationStructure); }
    public MemorySegment _dstAccelerationStructure() { return _dstAccelerationStructureAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _dstAccelerationStructureAt(long index, MemorySegment src) { _dstAccelerationStructureAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _dstAccelerationStructure(MemorySegment src) { return _dstAccelerationStructureAt(0L, src); }
    public MemorySegment _geometryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_geometryCount, index), LAYOUT_geometryCount); }
    public MemorySegment _geometryCount() { return _geometryCountAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _geometryCountAt(long index, MemorySegment src) { _geometryCountAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _geometryCount(MemorySegment src) { return _geometryCountAt(0L, src); }
    public MemorySegment _pGeometriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pGeometries, index), LAYOUT_pGeometries); }
    public MemorySegment _pGeometries() { return _pGeometriesAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _pGeometriesAt(long index, MemorySegment src) { _pGeometriesAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _pGeometries(MemorySegment src) { return _pGeometriesAt(0L, src); }
    public MemorySegment _ppGeometriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ppGeometries, index), LAYOUT_ppGeometries); }
    public MemorySegment _ppGeometries() { return _ppGeometriesAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _ppGeometriesAt(long index, MemorySegment src) { _ppGeometriesAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _ppGeometries(MemorySegment src) { return _ppGeometriesAt(0L, src); }
    public MemorySegment _scratchDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scratchData, index), LAYOUT_scratchData); }
    public MemorySegment _scratchData() { return _scratchDataAt(0L); }
    public VkAccelerationStructureBuildGeometryInfoKHR _scratchDataAt(long index, MemorySegment src) { _scratchDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildGeometryInfoKHR _scratchData(MemorySegment src) { return _scratchDataAt(0L, src); }
}
