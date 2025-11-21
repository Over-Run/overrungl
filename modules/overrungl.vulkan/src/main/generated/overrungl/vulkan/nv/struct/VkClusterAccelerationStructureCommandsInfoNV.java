// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureCommandsInfoNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureCommandsInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     VkClusterAccelerationStructureInputInfoNV input;
///     VkDeviceAddress dstImplicitData;
///     VkDeviceAddress scratchData;
///     VkStridedDeviceAddressRegionKHR dstAddressesArray;
///     VkStridedDeviceAddressRegionKHR dstSizesArray;
///     VkStridedDeviceAddressRegionKHR srcInfosArray;
///     VkDeviceAddress srcInfosCount;
///     VkClusterAccelerationStructureAddressResolutionFlagsNV addressResolutionFlags;
/// }
/// ```
public final class VkClusterAccelerationStructureCommandsInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.nv.struct.VkClusterAccelerationStructureInputInfoNV.LAYOUT.withName("input"),
        ValueLayout.JAVA_LONG.withName("dstImplicitData"),
        ValueLayout.JAVA_LONG.withName("scratchData"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRegionKHR.LAYOUT.withName("dstAddressesArray"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRegionKHR.LAYOUT.withName("dstSizesArray"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRegionKHR.LAYOUT.withName("srcInfosArray"),
        ValueLayout.JAVA_LONG.withName("srcInfosCount"),
        ValueLayout.JAVA_INT.withName("addressResolutionFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_input = LAYOUT.byteOffset(PathElement.groupElement("input"));
    public static final long OFFSET_dstImplicitData = LAYOUT.byteOffset(PathElement.groupElement("dstImplicitData"));
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    public static final long OFFSET_dstAddressesArray = LAYOUT.byteOffset(PathElement.groupElement("dstAddressesArray"));
    public static final long OFFSET_dstSizesArray = LAYOUT.byteOffset(PathElement.groupElement("dstSizesArray"));
    public static final long OFFSET_srcInfosArray = LAYOUT.byteOffset(PathElement.groupElement("srcInfosArray"));
    public static final long OFFSET_srcInfosCount = LAYOUT.byteOffset(PathElement.groupElement("srcInfosCount"));
    public static final long OFFSET_addressResolutionFlags = LAYOUT.byteOffset(PathElement.groupElement("addressResolutionFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_input = LAYOUT.select(PathElement.groupElement("input"));
    public static final MemoryLayout LAYOUT_dstImplicitData = LAYOUT.select(PathElement.groupElement("dstImplicitData"));
    public static final MemoryLayout LAYOUT_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));
    public static final MemoryLayout LAYOUT_dstAddressesArray = LAYOUT.select(PathElement.groupElement("dstAddressesArray"));
    public static final MemoryLayout LAYOUT_dstSizesArray = LAYOUT.select(PathElement.groupElement("dstSizesArray"));
    public static final MemoryLayout LAYOUT_srcInfosArray = LAYOUT.select(PathElement.groupElement("srcInfosArray"));
    public static final MemoryLayout LAYOUT_srcInfosCount = LAYOUT.select(PathElement.groupElement("srcInfosCount"));
    public static final MemoryLayout LAYOUT_addressResolutionFlags = LAYOUT.select(PathElement.groupElement("addressResolutionFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_input$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("sType"));
    public static final VarHandle VH_input$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_input$maxAccelerationStructureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("maxAccelerationStructureCount"));
    public static final VarHandle VH_input$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("flags"));
    public static final VarHandle VH_input$opType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("opType"));
    public static final VarHandle VH_input$opMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("opMode"));
    public static final VarHandle VH_input$opInput$pClustersBottomLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("opInput"), PathElement.groupElement("pClustersBottomLevel"));
    public static final VarHandle VH_input$opInput$pTriangleClusters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("opInput"), PathElement.groupElement("pTriangleClusters"));
    public static final VarHandle VH_input$opInput$pMoveObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("opInput"), PathElement.groupElement("pMoveObjects"));
    public static final VarHandle VH_dstImplicitData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImplicitData"));
    public static final VarHandle VH_scratchData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchData"));
    public static final VarHandle VH_dstAddressesArray$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddressesArray"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_dstAddressesArray$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddressesArray"), PathElement.groupElement("stride"));
    public static final VarHandle VH_dstAddressesArray$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddressesArray"), PathElement.groupElement("size"));
    public static final VarHandle VH_dstSizesArray$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSizesArray"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_dstSizesArray$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSizesArray"), PathElement.groupElement("stride"));
    public static final VarHandle VH_dstSizesArray$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSizesArray"), PathElement.groupElement("size"));
    public static final VarHandle VH_srcInfosArray$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfosArray"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_srcInfosArray$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfosArray"), PathElement.groupElement("stride"));
    public static final VarHandle VH_srcInfosArray$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfosArray"), PathElement.groupElement("size"));
    public static final VarHandle VH_srcInfosCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfosCount"));
    public static final VarHandle VH_addressResolutionFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressResolutionFlags"));

    public VkClusterAccelerationStructureCommandsInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureCommandsInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureCommandsInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureCommandsInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureCommandsInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureCommandsInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureCommandsInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureCommandsInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureCommandsInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureCommandsInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureCommandsInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkClusterAccelerationStructureCommandsInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV); }
    public static VkClusterAccelerationStructureCommandsInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV);
        return s;
    }
    public VkClusterAccelerationStructureCommandsInfoNV copyFrom(VkClusterAccelerationStructureCommandsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureCommandsInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureCommandsInfoNV asSlice(long index) { return new VkClusterAccelerationStructureCommandsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureCommandsInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureCommandsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureCommandsInfoNV at(long index, Consumer<VkClusterAccelerationStructureCommandsInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int input$sTypeAt(long index) { return (int) VH_input$sType.get(this.segment(), 0L, index); }
    public MemorySegment input$pNextAt(long index) { return (MemorySegment) VH_input$pNext.get(this.segment(), 0L, index); }
    public int input$maxAccelerationStructureCountAt(long index) { return (int) VH_input$maxAccelerationStructureCount.get(this.segment(), 0L, index); }
    public int input$flagsAt(long index) { return (int) VH_input$flags.get(this.segment(), 0L, index); }
    public int input$opTypeAt(long index) { return (int) VH_input$opType.get(this.segment(), 0L, index); }
    public int input$opModeAt(long index) { return (int) VH_input$opMode.get(this.segment(), 0L, index); }
    public MemorySegment input$opInput$pClustersBottomLevelAt(long index) { return (MemorySegment) VH_input$opInput$pClustersBottomLevel.get(this.segment(), 0L, index); }
    public MemorySegment input$opInput$pTriangleClustersAt(long index) { return (MemorySegment) VH_input$opInput$pTriangleClusters.get(this.segment(), 0L, index); }
    public MemorySegment input$opInput$pMoveObjectsAt(long index) { return (MemorySegment) VH_input$opInput$pMoveObjects.get(this.segment(), 0L, index); }
    public long dstImplicitDataAt(long index) { return (long) VH_dstImplicitData.get(this.segment(), 0L, index); }
    public long scratchDataAt(long index) { return (long) VH_scratchData.get(this.segment(), 0L, index); }
    public long dstAddressesArray$deviceAddressAt(long index) { return (long) VH_dstAddressesArray$deviceAddress.get(this.segment(), 0L, index); }
    public long dstAddressesArray$strideAt(long index) { return (long) VH_dstAddressesArray$stride.get(this.segment(), 0L, index); }
    public long dstAddressesArray$sizeAt(long index) { return (long) VH_dstAddressesArray$size.get(this.segment(), 0L, index); }
    public long dstSizesArray$deviceAddressAt(long index) { return (long) VH_dstSizesArray$deviceAddress.get(this.segment(), 0L, index); }
    public long dstSizesArray$strideAt(long index) { return (long) VH_dstSizesArray$stride.get(this.segment(), 0L, index); }
    public long dstSizesArray$sizeAt(long index) { return (long) VH_dstSizesArray$size.get(this.segment(), 0L, index); }
    public long srcInfosArray$deviceAddressAt(long index) { return (long) VH_srcInfosArray$deviceAddress.get(this.segment(), 0L, index); }
    public long srcInfosArray$strideAt(long index) { return (long) VH_srcInfosArray$stride.get(this.segment(), 0L, index); }
    public long srcInfosArray$sizeAt(long index) { return (long) VH_srcInfosArray$size.get(this.segment(), 0L, index); }
    public long srcInfosCountAt(long index) { return (long) VH_srcInfosCount.get(this.segment(), 0L, index); }
    public int addressResolutionFlagsAt(long index) { return (int) VH_addressResolutionFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int input$sType() { return (int) VH_input$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment input$pNext() { return (MemorySegment) VH_input$pNext.get(this.segment(), 0L, 0L); }
    public int input$maxAccelerationStructureCount() { return (int) VH_input$maxAccelerationStructureCount.get(this.segment(), 0L, 0L); }
    public int input$flags() { return (int) VH_input$flags.get(this.segment(), 0L, 0L); }
    public int input$opType() { return (int) VH_input$opType.get(this.segment(), 0L, 0L); }
    public int input$opMode() { return (int) VH_input$opMode.get(this.segment(), 0L, 0L); }
    public MemorySegment input$opInput$pClustersBottomLevel() { return (MemorySegment) VH_input$opInput$pClustersBottomLevel.get(this.segment(), 0L, 0L); }
    public MemorySegment input$opInput$pTriangleClusters() { return (MemorySegment) VH_input$opInput$pTriangleClusters.get(this.segment(), 0L, 0L); }
    public MemorySegment input$opInput$pMoveObjects() { return (MemorySegment) VH_input$opInput$pMoveObjects.get(this.segment(), 0L, 0L); }
    public long dstImplicitData() { return (long) VH_dstImplicitData.get(this.segment(), 0L, 0L); }
    public long scratchData() { return (long) VH_scratchData.get(this.segment(), 0L, 0L); }
    public long dstAddressesArray$deviceAddress() { return (long) VH_dstAddressesArray$deviceAddress.get(this.segment(), 0L, 0L); }
    public long dstAddressesArray$stride() { return (long) VH_dstAddressesArray$stride.get(this.segment(), 0L, 0L); }
    public long dstAddressesArray$size() { return (long) VH_dstAddressesArray$size.get(this.segment(), 0L, 0L); }
    public long dstSizesArray$deviceAddress() { return (long) VH_dstSizesArray$deviceAddress.get(this.segment(), 0L, 0L); }
    public long dstSizesArray$stride() { return (long) VH_dstSizesArray$stride.get(this.segment(), 0L, 0L); }
    public long dstSizesArray$size() { return (long) VH_dstSizesArray$size.get(this.segment(), 0L, 0L); }
    public long srcInfosArray$deviceAddress() { return (long) VH_srcInfosArray$deviceAddress.get(this.segment(), 0L, 0L); }
    public long srcInfosArray$stride() { return (long) VH_srcInfosArray$stride.get(this.segment(), 0L, 0L); }
    public long srcInfosArray$size() { return (long) VH_srcInfosArray$size.get(this.segment(), 0L, 0L); }
    public long srcInfosCount() { return (long) VH_srcInfosCount.get(this.segment(), 0L, 0L); }
    public int addressResolutionFlags() { return (int) VH_addressResolutionFlags.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureCommandsInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$sTypeAt(long index, int value) { VH_input$sType.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$pNextAt(long index, MemorySegment value) { VH_input$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$maxAccelerationStructureCountAt(long index, int value) { VH_input$maxAccelerationStructureCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$flagsAt(long index, int value) { VH_input$flags.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opTypeAt(long index, int value) { VH_input$opType.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opModeAt(long index, int value) { VH_input$opMode.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opInput$pClustersBottomLevelAt(long index, MemorySegment value) { VH_input$opInput$pClustersBottomLevel.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opInput$pTriangleClustersAt(long index, MemorySegment value) { VH_input$opInput$pTriangleClusters.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opInput$pMoveObjectsAt(long index, MemorySegment value) { VH_input$opInput$pMoveObjects.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstImplicitDataAt(long index, long value) { VH_dstImplicitData.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV scratchDataAt(long index, long value) { VH_scratchData.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray$deviceAddressAt(long index, long value) { VH_dstAddressesArray$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray$strideAt(long index, long value) { VH_dstAddressesArray$stride.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray$sizeAt(long index, long value) { VH_dstAddressesArray$size.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray$deviceAddressAt(long index, long value) { VH_dstSizesArray$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray$strideAt(long index, long value) { VH_dstSizesArray$stride.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray$sizeAt(long index, long value) { VH_dstSizesArray$size.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray$deviceAddressAt(long index, long value) { VH_srcInfosArray$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray$strideAt(long index, long value) { VH_srcInfosArray$stride.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray$sizeAt(long index, long value) { VH_srcInfosArray$size.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosCountAt(long index, long value) { VH_srcInfosCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV addressResolutionFlagsAt(long index, int value) { VH_addressResolutionFlags.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$sType(int value) { VH_input$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$pNext(MemorySegment value) { VH_input$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$maxAccelerationStructureCount(int value) { VH_input$maxAccelerationStructureCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$flags(int value) { VH_input$flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opType(int value) { VH_input$opType.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opMode(int value) { VH_input$opMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opInput$pClustersBottomLevel(MemorySegment value) { VH_input$opInput$pClustersBottomLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opInput$pTriangleClusters(MemorySegment value) { VH_input$opInput$pTriangleClusters.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV input$opInput$pMoveObjects(MemorySegment value) { VH_input$opInput$pMoveObjects.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstImplicitData(long value) { VH_dstImplicitData.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV scratchData(long value) { VH_scratchData.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray$deviceAddress(long value) { VH_dstAddressesArray$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray$stride(long value) { VH_dstAddressesArray$stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray$size(long value) { VH_dstAddressesArray$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray$deviceAddress(long value) { VH_dstSizesArray$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray$stride(long value) { VH_dstSizesArray$stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray$size(long value) { VH_dstSizesArray$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray$deviceAddress(long value) { VH_srcInfosArray$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray$stride(long value) { VH_srcInfosArray$stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray$size(long value) { VH_srcInfosArray$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosCount(long value) { VH_srcInfosCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV addressResolutionFlags(int value) { VH_addressResolutionFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _inputAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_input, index), LAYOUT_input); }
    public MemorySegment _input() { return _inputAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _inputAt(long index, MemorySegment src) { _inputAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _input(MemorySegment src) { return _inputAt(0L, src); }
    public MemorySegment _dstImplicitDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstImplicitData, index), LAYOUT_dstImplicitData); }
    public MemorySegment _dstImplicitData() { return _dstImplicitDataAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _dstImplicitDataAt(long index, MemorySegment src) { _dstImplicitDataAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _dstImplicitData(MemorySegment src) { return _dstImplicitDataAt(0L, src); }
    public MemorySegment _scratchDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scratchData, index), LAYOUT_scratchData); }
    public MemorySegment _scratchData() { return _scratchDataAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _scratchDataAt(long index, MemorySegment src) { _scratchDataAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _scratchData(MemorySegment src) { return _scratchDataAt(0L, src); }
    public MemorySegment _dstAddressesArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAddressesArray, index), LAYOUT_dstAddressesArray); }
    public MemorySegment _dstAddressesArray() { return _dstAddressesArrayAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _dstAddressesArrayAt(long index, MemorySegment src) { _dstAddressesArrayAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _dstAddressesArray(MemorySegment src) { return _dstAddressesArrayAt(0L, src); }
    public MemorySegment _dstSizesArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstSizesArray, index), LAYOUT_dstSizesArray); }
    public MemorySegment _dstSizesArray() { return _dstSizesArrayAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _dstSizesArrayAt(long index, MemorySegment src) { _dstSizesArrayAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _dstSizesArray(MemorySegment src) { return _dstSizesArrayAt(0L, src); }
    public MemorySegment _srcInfosArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcInfosArray, index), LAYOUT_srcInfosArray); }
    public MemorySegment _srcInfosArray() { return _srcInfosArrayAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _srcInfosArrayAt(long index, MemorySegment src) { _srcInfosArrayAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _srcInfosArray(MemorySegment src) { return _srcInfosArrayAt(0L, src); }
    public MemorySegment _srcInfosCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcInfosCount, index), LAYOUT_srcInfosCount); }
    public MemorySegment _srcInfosCount() { return _srcInfosCountAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _srcInfosCountAt(long index, MemorySegment src) { _srcInfosCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _srcInfosCount(MemorySegment src) { return _srcInfosCountAt(0L, src); }
    public MemorySegment _addressResolutionFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_addressResolutionFlags, index), LAYOUT_addressResolutionFlags); }
    public MemorySegment _addressResolutionFlags() { return _addressResolutionFlagsAt(0L); }
    public VkClusterAccelerationStructureCommandsInfoNV _addressResolutionFlagsAt(long index, MemorySegment src) { _addressResolutionFlagsAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureCommandsInfoNV _addressResolutionFlags(MemorySegment src) { return _addressResolutionFlagsAt(0L, src); }
}
