// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBuildPartitionedAccelerationStructureIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkBuildPartitionedAccelerationStructureIndirectCommandNV {
///     VkPartitionedAccelerationStructureOpTypeNV opType;
///     uint32_t argCount;
///     VkStridedDeviceAddressNV argData;
/// }
/// ```
public final class VkBuildPartitionedAccelerationStructureIndirectCommandNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("opType"),
        ValueLayout.JAVA_INT.withName("argCount"),
        overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV.LAYOUT.withName("argData")
    );
    public static final long OFFSET_opType = LAYOUT.byteOffset(PathElement.groupElement("opType"));
    public static final long OFFSET_argCount = LAYOUT.byteOffset(PathElement.groupElement("argCount"));
    public static final long OFFSET_argData = LAYOUT.byteOffset(PathElement.groupElement("argData"));
    public static final MemoryLayout LAYOUT_opType = LAYOUT.select(PathElement.groupElement("opType"));
    public static final MemoryLayout LAYOUT_argCount = LAYOUT.select(PathElement.groupElement("argCount"));
    public static final MemoryLayout LAYOUT_argData = LAYOUT.select(PathElement.groupElement("argData"));
    public static final VarHandle VH_opType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opType"));
    public static final VarHandle VH_argCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("argCount"));
    public static final VarHandle VH_argData$startAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("argData"), PathElement.groupElement("startAddress"));
    public static final VarHandle VH_argData$strideInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("argData"), PathElement.groupElement("strideInBytes"));

    public VkBuildPartitionedAccelerationStructureIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(allocator.allocate(LAYOUT), 1); }
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV copyFrom(VkBuildPartitionedAccelerationStructureIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV reinterpret(long count) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV asSlice(long index) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV asSlice(long index, long count) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV at(long index, Consumer<VkBuildPartitionedAccelerationStructureIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }
    public int opTypeAt(long index) { return (int) VH_opType.get(this.segment(), 0L, index); }
    public int argCountAt(long index) { return (int) VH_argCount.get(this.segment(), 0L, index); }
    public long argData$startAddressAt(long index) { return (long) VH_argData$startAddress.get(this.segment(), 0L, index); }
    public long argData$strideInBytesAt(long index) { return (long) VH_argData$strideInBytes.get(this.segment(), 0L, index); }
    public int opType() { return (int) VH_opType.get(this.segment(), 0L, 0L); }
    public int argCount() { return (int) VH_argCount.get(this.segment(), 0L, 0L); }
    public long argData$startAddress() { return (long) VH_argData$startAddress.get(this.segment(), 0L, 0L); }
    public long argData$strideInBytes() { return (long) VH_argData$strideInBytes.get(this.segment(), 0L, 0L); }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV opTypeAt(long index, int value) { VH_opType.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argCountAt(long index, int value) { VH_argCount.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData$startAddressAt(long index, long value) { VH_argData$startAddress.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData$strideInBytesAt(long index, long value) { VH_argData$strideInBytes.set(this.segment(), 0L, index, value); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV opType(int value) { VH_opType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argCount(int value) { VH_argCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData$startAddress(long value) { VH_argData$startAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData$strideInBytes(long value) { VH_argData$strideInBytes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _opTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_opType, index), LAYOUT_opType); }
    public MemorySegment _opType() { return _opTypeAt(0L); }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV _opTypeAt(long index, MemorySegment src) { _opTypeAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV _opType(MemorySegment src) { return _opTypeAt(0L, src); }
    public MemorySegment _argCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_argCount, index), LAYOUT_argCount); }
    public MemorySegment _argCount() { return _argCountAt(0L); }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV _argCountAt(long index, MemorySegment src) { _argCountAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV _argCount(MemorySegment src) { return _argCountAt(0L, src); }
    public MemorySegment _argDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_argData, index), LAYOUT_argData); }
    public MemorySegment _argData() { return _argDataAt(0L); }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV _argDataAt(long index, MemorySegment src) { _argDataAt(index).copyFrom(src); return this; }
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV _argData(MemorySegment src) { return _argDataAt(0L, src); }
}
