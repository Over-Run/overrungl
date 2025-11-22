// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindAccelerationStructureMemoryInfoNV`.
/// ## Layout
/// ```
/// struct VkBindAccelerationStructureMemoryInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureNV accelerationStructure;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     uint32_t deviceIndexCount;
///     const uint32_t* pDeviceIndices;
/// }
/// ```
public final class VkBindAccelerationStructureMemoryInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    public static final long OFFSET_deviceIndexCount = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
    public static final long OFFSET_pDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    public static final MemoryLayout LAYOUT_deviceIndexCount = LAYOUT.select(PathElement.groupElement("deviceIndexCount"));
    public static final MemoryLayout LAYOUT_pDeviceIndices = LAYOUT.select(PathElement.groupElement("pDeviceIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));

    public VkBindAccelerationStructureMemoryInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindAccelerationStructureMemoryInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindAccelerationStructureMemoryInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindAccelerationStructureMemoryInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindAccelerationStructureMemoryInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindAccelerationStructureMemoryInfoNV alloc(SegmentAllocator allocator) { return new VkBindAccelerationStructureMemoryInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkBindAccelerationStructureMemoryInfoNV alloc(SegmentAllocator allocator, long count) { return new VkBindAccelerationStructureMemoryInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV); }
    public static VkBindAccelerationStructureMemoryInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV);
        return s;
    }
    public VkBindAccelerationStructureMemoryInfoNV copyFrom(VkBindAccelerationStructureMemoryInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindAccelerationStructureMemoryInfoNV reinterpret(long count) { return new VkBindAccelerationStructureMemoryInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindAccelerationStructureMemoryInfoNV asSlice(long index) { return new VkBindAccelerationStructureMemoryInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindAccelerationStructureMemoryInfoNV asSlice(long index, long count) { return new VkBindAccelerationStructureMemoryInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindAccelerationStructureMemoryInfoNV at(long index, Consumer<VkBindAccelerationStructureMemoryInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long accelerationStructureAt(long index) { return (long) VH_accelerationStructure.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long memoryOffsetAt(long index) { return (long) VH_memoryOffset.get(this.segment(), 0L, index); }
    public int deviceIndexCountAt(long index) { return (int) VH_deviceIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pDeviceIndicesAt(long index) { return (MemorySegment) VH_pDeviceIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long accelerationStructure() { return (long) VH_accelerationStructure.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long memoryOffset() { return (long) VH_memoryOffset.get(this.segment(), 0L, 0L); }
    public int deviceIndexCount() { return (int) VH_deviceIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDeviceIndices() { return (MemorySegment) VH_pDeviceIndices.get(this.segment(), 0L, 0L); }
    public VkBindAccelerationStructureMemoryInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructureAt(long index, long value) { VH_accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV memoryOffsetAt(long index, long value) { VH_memoryOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV deviceIndexCountAt(long index, int value) { VH_deviceIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndicesAt(long index, MemorySegment value) { VH_pDeviceIndices.set(this.segment(), 0L, index, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructure(long value) { VH_accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV memoryOffset(long value) { VH_memoryOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV deviceIndexCount(int value) { VH_deviceIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndices(MemorySegment value) { VH_pDeviceIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindAccelerationStructureMemoryInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindAccelerationStructureMemoryInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindAccelerationStructureMemoryInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindAccelerationStructureMemoryInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _accelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructure, index), LAYOUT_accelerationStructure); }
    public MemorySegment _accelerationStructure() { return _accelerationStructureAt(0L); }
    public VkBindAccelerationStructureMemoryInfoNV _accelerationStructureAt(long index, MemorySegment src) { _accelerationStructureAt(index).copyFrom(src); return this; }
    public VkBindAccelerationStructureMemoryInfoNV _accelerationStructure(MemorySegment src) { return _accelerationStructureAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkBindAccelerationStructureMemoryInfoNV _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkBindAccelerationStructureMemoryInfoNV _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _memoryOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryOffset, index), LAYOUT_memoryOffset); }
    public MemorySegment _memoryOffset() { return _memoryOffsetAt(0L); }
    public VkBindAccelerationStructureMemoryInfoNV _memoryOffsetAt(long index, MemorySegment src) { _memoryOffsetAt(index).copyFrom(src); return this; }
    public VkBindAccelerationStructureMemoryInfoNV _memoryOffset(MemorySegment src) { return _memoryOffsetAt(0L, src); }
    public MemorySegment _deviceIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceIndexCount, index), LAYOUT_deviceIndexCount); }
    public MemorySegment _deviceIndexCount() { return _deviceIndexCountAt(0L); }
    public VkBindAccelerationStructureMemoryInfoNV _deviceIndexCountAt(long index, MemorySegment src) { _deviceIndexCountAt(index).copyFrom(src); return this; }
    public VkBindAccelerationStructureMemoryInfoNV _deviceIndexCount(MemorySegment src) { return _deviceIndexCountAt(0L, src); }
    public MemorySegment _pDeviceIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDeviceIndices, index), LAYOUT_pDeviceIndices); }
    public MemorySegment _pDeviceIndices() { return _pDeviceIndicesAt(0L); }
    public VkBindAccelerationStructureMemoryInfoNV _pDeviceIndicesAt(long index, MemorySegment src) { _pDeviceIndicesAt(index).copyFrom(src); return this; }
    public VkBindAccelerationStructureMemoryInfoNV _pDeviceIndices(MemorySegment src) { return _pDeviceIndicesAt(0L, src); }
}
