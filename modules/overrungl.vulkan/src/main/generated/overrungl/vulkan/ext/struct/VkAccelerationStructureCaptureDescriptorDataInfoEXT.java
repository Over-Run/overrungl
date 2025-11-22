// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureCaptureDescriptorDataInfoEXT`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureCaptureDescriptorDataInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureKHR accelerationStructure;
///     VkAccelerationStructureNV accelerationStructureNV;
/// }
/// ```
public final class VkAccelerationStructureCaptureDescriptorDataInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureNV")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    public static final long OFFSET_accelerationStructureNV = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureNV"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    public static final MemoryLayout LAYOUT_accelerationStructureNV = LAYOUT.select(PathElement.groupElement("accelerationStructureNV"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    public static final VarHandle VH_accelerationStructureNV = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureNV"));

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
        return s;
    }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT copyFrom(VkAccelerationStructureCaptureDescriptorDataInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT reinterpret(long count) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT asSlice(long index) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT asSlice(long index, long count) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT at(long index, Consumer<VkAccelerationStructureCaptureDescriptorDataInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long accelerationStructureAt(long index) { return (long) VH_accelerationStructure.get(this.segment(), 0L, index); }
    public long accelerationStructureNVAt(long index) { return (long) VH_accelerationStructureNV.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long accelerationStructure() { return (long) VH_accelerationStructure.get(this.segment(), 0L, 0L); }
    public long accelerationStructureNV() { return (long) VH_accelerationStructureNV.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureAt(long index, long value) { VH_accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureNVAt(long index, long value) { VH_accelerationStructureNV.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructure(long value) { VH_accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureNV(long value) { VH_accelerationStructureNV.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _accelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructure, index), LAYOUT_accelerationStructure); }
    public MemorySegment _accelerationStructure() { return _accelerationStructureAt(0L); }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT _accelerationStructureAt(long index, MemorySegment src) { _accelerationStructureAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT _accelerationStructure(MemorySegment src) { return _accelerationStructureAt(0L, src); }
    public MemorySegment _accelerationStructureNVAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureNV, index), LAYOUT_accelerationStructureNV); }
    public MemorySegment _accelerationStructureNV() { return _accelerationStructureNVAt(0L); }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT _accelerationStructureNVAt(long index, MemorySegment src) { _accelerationStructureNVAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT _accelerationStructureNV(MemorySegment src) { return _accelerationStructureNVAt(0L, src); }
}
