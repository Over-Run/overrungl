// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBuildPartitionedAccelerationStructureInfoNV`.
/// ## Layout
/// ```
/// struct VkBuildPartitionedAccelerationStructureInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     VkPartitionedAccelerationStructureInstancesInputNV input;
///     VkDeviceAddress srcAccelerationStructureData;
///     VkDeviceAddress dstAccelerationStructureData;
///     VkDeviceAddress scratchData;
///     VkDeviceAddress srcInfos;
///     VkDeviceAddress srcInfosCount;
/// }
/// ```
public final class VkBuildPartitionedAccelerationStructureInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.nv.struct.VkPartitionedAccelerationStructureInstancesInputNV.LAYOUT.withName("input"),
        ValueLayout.JAVA_LONG.withName("srcAccelerationStructureData"),
        ValueLayout.JAVA_LONG.withName("dstAccelerationStructureData"),
        ValueLayout.JAVA_LONG.withName("scratchData"),
        ValueLayout.JAVA_LONG.withName("srcInfos"),
        ValueLayout.JAVA_LONG.withName("srcInfosCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_input = LAYOUT.byteOffset(PathElement.groupElement("input"));
    public static final long OFFSET_srcAccelerationStructureData = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructureData"));
    public static final long OFFSET_dstAccelerationStructureData = LAYOUT.byteOffset(PathElement.groupElement("dstAccelerationStructureData"));
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    public static final long OFFSET_srcInfos = LAYOUT.byteOffset(PathElement.groupElement("srcInfos"));
    public static final long OFFSET_srcInfosCount = LAYOUT.byteOffset(PathElement.groupElement("srcInfosCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_input = LAYOUT.select(PathElement.groupElement("input"));
    public static final MemoryLayout LAYOUT_srcAccelerationStructureData = LAYOUT.select(PathElement.groupElement("srcAccelerationStructureData"));
    public static final MemoryLayout LAYOUT_dstAccelerationStructureData = LAYOUT.select(PathElement.groupElement("dstAccelerationStructureData"));
    public static final MemoryLayout LAYOUT_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));
    public static final MemoryLayout LAYOUT_srcInfos = LAYOUT.select(PathElement.groupElement("srcInfos"));
    public static final MemoryLayout LAYOUT_srcInfosCount = LAYOUT.select(PathElement.groupElement("srcInfosCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_input$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("sType"));
    public static final VarHandle VH_input$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_input$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("flags"));
    public static final VarHandle VH_input$instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("instanceCount"));
    public static final VarHandle VH_input$maxInstancePerPartitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("maxInstancePerPartitionCount"));
    public static final VarHandle VH_input$partitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("partitionCount"));
    public static final VarHandle VH_input$maxInstanceInGlobalPartitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input"), PathElement.groupElement("maxInstanceInGlobalPartitionCount"));
    public static final VarHandle VH_srcAccelerationStructureData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccelerationStructureData"));
    public static final VarHandle VH_dstAccelerationStructureData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccelerationStructureData"));
    public static final VarHandle VH_scratchData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchData"));
    public static final VarHandle VH_srcInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfos"));
    public static final VarHandle VH_srcInfosCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfosCount"));

    public VkBuildPartitionedAccelerationStructureInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBuildPartitionedAccelerationStructureInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkBuildPartitionedAccelerationStructureInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBuildPartitionedAccelerationStructureInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBuildPartitionedAccelerationStructureInfoNV alloc(SegmentAllocator allocator) { return new VkBuildPartitionedAccelerationStructureInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkBuildPartitionedAccelerationStructureInfoNV alloc(SegmentAllocator allocator, long count) { return new VkBuildPartitionedAccelerationStructureInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV); }
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV);
        return s;
    }
    public VkBuildPartitionedAccelerationStructureInfoNV copyFrom(VkBuildPartitionedAccelerationStructureInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV reinterpret(long count) { return new VkBuildPartitionedAccelerationStructureInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBuildPartitionedAccelerationStructureInfoNV asSlice(long index) { return new VkBuildPartitionedAccelerationStructureInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBuildPartitionedAccelerationStructureInfoNV asSlice(long index, long count) { return new VkBuildPartitionedAccelerationStructureInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBuildPartitionedAccelerationStructureInfoNV at(long index, Consumer<VkBuildPartitionedAccelerationStructureInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int input$sTypeAt(long index) { return (int) VH_input$sType.get(this.segment(), 0L, index); }
    public MemorySegment input$pNextAt(long index) { return (MemorySegment) VH_input$pNext.get(this.segment(), 0L, index); }
    public int input$flagsAt(long index) { return (int) VH_input$flags.get(this.segment(), 0L, index); }
    public int input$instanceCountAt(long index) { return (int) VH_input$instanceCount.get(this.segment(), 0L, index); }
    public int input$maxInstancePerPartitionCountAt(long index) { return (int) VH_input$maxInstancePerPartitionCount.get(this.segment(), 0L, index); }
    public int input$partitionCountAt(long index) { return (int) VH_input$partitionCount.get(this.segment(), 0L, index); }
    public int input$maxInstanceInGlobalPartitionCountAt(long index) { return (int) VH_input$maxInstanceInGlobalPartitionCount.get(this.segment(), 0L, index); }
    public long srcAccelerationStructureDataAt(long index) { return (long) VH_srcAccelerationStructureData.get(this.segment(), 0L, index); }
    public long dstAccelerationStructureDataAt(long index) { return (long) VH_dstAccelerationStructureData.get(this.segment(), 0L, index); }
    public long scratchDataAt(long index) { return (long) VH_scratchData.get(this.segment(), 0L, index); }
    public long srcInfosAt(long index) { return (long) VH_srcInfos.get(this.segment(), 0L, index); }
    public long srcInfosCountAt(long index) { return (long) VH_srcInfosCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int input$sType() { return (int) VH_input$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment input$pNext() { return (MemorySegment) VH_input$pNext.get(this.segment(), 0L, 0L); }
    public int input$flags() { return (int) VH_input$flags.get(this.segment(), 0L, 0L); }
    public int input$instanceCount() { return (int) VH_input$instanceCount.get(this.segment(), 0L, 0L); }
    public int input$maxInstancePerPartitionCount() { return (int) VH_input$maxInstancePerPartitionCount.get(this.segment(), 0L, 0L); }
    public int input$partitionCount() { return (int) VH_input$partitionCount.get(this.segment(), 0L, 0L); }
    public int input$maxInstanceInGlobalPartitionCount() { return (int) VH_input$maxInstanceInGlobalPartitionCount.get(this.segment(), 0L, 0L); }
    public long srcAccelerationStructureData() { return (long) VH_srcAccelerationStructureData.get(this.segment(), 0L, 0L); }
    public long dstAccelerationStructureData() { return (long) VH_dstAccelerationStructureData.get(this.segment(), 0L, 0L); }
    public long scratchData() { return (long) VH_scratchData.get(this.segment(), 0L, 0L); }
    public long srcInfos() { return (long) VH_srcInfos.get(this.segment(), 0L, 0L); }
    public long srcInfosCount() { return (long) VH_srcInfosCount.get(this.segment(), 0L, 0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$sTypeAt(long index, int value) { VH_input$sType.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$pNextAt(long index, MemorySegment value) { VH_input$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$flagsAt(long index, int value) { VH_input$flags.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$instanceCountAt(long index, int value) { VH_input$instanceCount.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$maxInstancePerPartitionCountAt(long index, int value) { VH_input$maxInstancePerPartitionCount.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$partitionCountAt(long index, int value) { VH_input$partitionCount.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$maxInstanceInGlobalPartitionCountAt(long index, int value) { VH_input$maxInstanceInGlobalPartitionCount.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV srcAccelerationStructureDataAt(long index, long value) { VH_srcAccelerationStructureData.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV dstAccelerationStructureDataAt(long index, long value) { VH_dstAccelerationStructureData.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV scratchDataAt(long index, long value) { VH_scratchData.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfosAt(long index, long value) { VH_srcInfos.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfosCountAt(long index, long value) { VH_srcInfosCount.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$sType(int value) { VH_input$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$pNext(MemorySegment value) { VH_input$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$flags(int value) { VH_input$flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$instanceCount(int value) { VH_input$instanceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$maxInstancePerPartitionCount(int value) { VH_input$maxInstancePerPartitionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$partitionCount(int value) { VH_input$partitionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV input$maxInstanceInGlobalPartitionCount(int value) { VH_input$maxInstanceInGlobalPartitionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV srcAccelerationStructureData(long value) { VH_srcAccelerationStructureData.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV dstAccelerationStructureData(long value) { VH_dstAccelerationStructureData.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV scratchData(long value) { VH_scratchData.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfos(long value) { VH_srcInfos.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfosCount(long value) { VH_srcInfosCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _inputAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_input, index), LAYOUT_input); }
    public MemorySegment _input() { return _inputAt(0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV _inputAt(long index, MemorySegment src) { _inputAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV _input(MemorySegment src) { return _inputAt(0L, src); }
    public MemorySegment _srcAccelerationStructureDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccelerationStructureData, index), LAYOUT_srcAccelerationStructureData); }
    public MemorySegment _srcAccelerationStructureData() { return _srcAccelerationStructureDataAt(0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV _srcAccelerationStructureDataAt(long index, MemorySegment src) { _srcAccelerationStructureDataAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV _srcAccelerationStructureData(MemorySegment src) { return _srcAccelerationStructureDataAt(0L, src); }
    public MemorySegment _dstAccelerationStructureDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAccelerationStructureData, index), LAYOUT_dstAccelerationStructureData); }
    public MemorySegment _dstAccelerationStructureData() { return _dstAccelerationStructureDataAt(0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV _dstAccelerationStructureDataAt(long index, MemorySegment src) { _dstAccelerationStructureDataAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV _dstAccelerationStructureData(MemorySegment src) { return _dstAccelerationStructureDataAt(0L, src); }
    public MemorySegment _scratchDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scratchData, index), LAYOUT_scratchData); }
    public MemorySegment _scratchData() { return _scratchDataAt(0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV _scratchDataAt(long index, MemorySegment src) { _scratchDataAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV _scratchData(MemorySegment src) { return _scratchDataAt(0L, src); }
    public MemorySegment _srcInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcInfos, index), LAYOUT_srcInfos); }
    public MemorySegment _srcInfos() { return _srcInfosAt(0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV _srcInfosAt(long index, MemorySegment src) { _srcInfosAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV _srcInfos(MemorySegment src) { return _srcInfosAt(0L, src); }
    public MemorySegment _srcInfosCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcInfosCount, index), LAYOUT_srcInfosCount); }
    public MemorySegment _srcInfosCount() { return _srcInfosCountAt(0L); }
    public VkBuildPartitionedAccelerationStructureInfoNV _srcInfosCountAt(long index, MemorySegment src) { _srcInfosCountAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureInfoNV _srcInfosCount(MemorySegment src) { return _srcInfosCountAt(0L, src); }
}
