// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureBuildSizesInfoKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureBuildSizesInfoKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize accelerationStructureSize;
///     VkDeviceSize updateScratchSize;
///     VkDeviceSize buildScratchSize;
/// }
/// ```
public final class VkAccelerationStructureBuildSizesInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureSize"),
        ValueLayout.JAVA_LONG.withName("updateScratchSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_accelerationStructureSize = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureSize"));
    public static final long OFFSET_updateScratchSize = LAYOUT.byteOffset(PathElement.groupElement("updateScratchSize"));
    public static final long OFFSET_buildScratchSize = LAYOUT.byteOffset(PathElement.groupElement("buildScratchSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_accelerationStructureSize = LAYOUT.select(PathElement.groupElement("accelerationStructureSize"));
    public static final MemoryLayout LAYOUT_updateScratchSize = LAYOUT.select(PathElement.groupElement("updateScratchSize"));
    public static final MemoryLayout LAYOUT_buildScratchSize = LAYOUT.select(PathElement.groupElement("buildScratchSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_accelerationStructureSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureSize"));
    public static final VarHandle VH_updateScratchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("updateScratchSize"));
    public static final VarHandle VH_buildScratchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buildScratchSize"));

    public VkAccelerationStructureBuildSizesInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureBuildSizesInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildSizesInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureBuildSizesInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildSizesInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureBuildSizesInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildSizesInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureBuildSizesInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildSizesInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureBuildSizesInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureBuildSizesInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureBuildSizesInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR); }
    public static VkAccelerationStructureBuildSizesInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR);
        return s;
    }
    public VkAccelerationStructureBuildSizesInfoKHR copyFrom(VkAccelerationStructureBuildSizesInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR reinterpret(long count) { return new VkAccelerationStructureBuildSizesInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureBuildSizesInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildSizesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureBuildSizesInfoKHR asSlice(long index, long count) { return new VkAccelerationStructureBuildSizesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureBuildSizesInfoKHR at(long index, Consumer<VkAccelerationStructureBuildSizesInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long accelerationStructureSizeAt(long index) { return (long) VH_accelerationStructureSize.get(this.segment(), 0L, index); }
    public long updateScratchSizeAt(long index) { return (long) VH_updateScratchSize.get(this.segment(), 0L, index); }
    public long buildScratchSizeAt(long index) { return (long) VH_buildScratchSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long accelerationStructureSize() { return (long) VH_accelerationStructureSize.get(this.segment(), 0L, 0L); }
    public long updateScratchSize() { return (long) VH_updateScratchSize.get(this.segment(), 0L, 0L); }
    public long buildScratchSize() { return (long) VH_buildScratchSize.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureBuildSizesInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR accelerationStructureSizeAt(long index, long value) { VH_accelerationStructureSize.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR updateScratchSizeAt(long index, long value) { VH_updateScratchSize.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR buildScratchSizeAt(long index, long value) { VH_buildScratchSize.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR accelerationStructureSize(long value) { VH_accelerationStructureSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR updateScratchSize(long value) { VH_updateScratchSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR buildScratchSize(long value) { VH_buildScratchSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureBuildSizesInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureBuildSizesInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _accelerationStructureSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureSize, index), LAYOUT_accelerationStructureSize); }
    public MemorySegment _accelerationStructureSize() { return _accelerationStructureSizeAt(0L); }
    public VkAccelerationStructureBuildSizesInfoKHR _accelerationStructureSizeAt(long index, MemorySegment src) { _accelerationStructureSizeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR _accelerationStructureSize(MemorySegment src) { return _accelerationStructureSizeAt(0L, src); }
    public MemorySegment _updateScratchSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_updateScratchSize, index), LAYOUT_updateScratchSize); }
    public MemorySegment _updateScratchSize() { return _updateScratchSizeAt(0L); }
    public VkAccelerationStructureBuildSizesInfoKHR _updateScratchSizeAt(long index, MemorySegment src) { _updateScratchSizeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR _updateScratchSize(MemorySegment src) { return _updateScratchSizeAt(0L, src); }
    public MemorySegment _buildScratchSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buildScratchSize, index), LAYOUT_buildScratchSize); }
    public MemorySegment _buildScratchSize() { return _buildScratchSizeAt(0L); }
    public VkAccelerationStructureBuildSizesInfoKHR _buildScratchSizeAt(long index, MemorySegment src) { _buildScratchSizeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureBuildSizesInfoKHR _buildScratchSize(MemorySegment src) { return _buildScratchSizeAt(0L, src); }
}
