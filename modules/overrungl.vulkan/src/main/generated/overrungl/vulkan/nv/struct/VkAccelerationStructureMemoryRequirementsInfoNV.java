// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureMemoryRequirementsInfoNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureMemoryRequirementsInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureMemoryRequirementsTypeNV type;
///     VkAccelerationStructureNV accelerationStructure;
/// }
/// ```
public final class VkAccelerationStructureMemoryRequirementsInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    public VkAccelerationStructureMemoryRequirementsInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureMemoryRequirementsInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMemoryRequirementsInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureMemoryRequirementsInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMemoryRequirementsInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureMemoryRequirementsInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMemoryRequirementsInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureMemoryRequirementsInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMemoryRequirementsInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureMemoryRequirementsInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureMemoryRequirementsInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureMemoryRequirementsInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV); }
    public static VkAccelerationStructureMemoryRequirementsInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
        return s;
    }
    public VkAccelerationStructureMemoryRequirementsInfoNV copyFrom(VkAccelerationStructureMemoryRequirementsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV reinterpret(long count) { return new VkAccelerationStructureMemoryRequirementsInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureMemoryRequirementsInfoNV asSlice(long index) { return new VkAccelerationStructureMemoryRequirementsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureMemoryRequirementsInfoNV asSlice(long index, long count) { return new VkAccelerationStructureMemoryRequirementsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureMemoryRequirementsInfoNV at(long index, Consumer<VkAccelerationStructureMemoryRequirementsInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public long accelerationStructureAt(long index) { return (long) VH_accelerationStructure.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public long accelerationStructure() { return (long) VH_accelerationStructure.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureMemoryRequirementsInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV accelerationStructureAt(long index, long value) { VH_accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV accelerationStructure(long value) { VH_accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureMemoryRequirementsInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureMemoryRequirementsInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkAccelerationStructureMemoryRequirementsInfoNV _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _accelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructure, index), LAYOUT_accelerationStructure); }
    public MemorySegment _accelerationStructure() { return _accelerationStructureAt(0L); }
    public VkAccelerationStructureMemoryRequirementsInfoNV _accelerationStructureAt(long index, MemorySegment src) { _accelerationStructureAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureMemoryRequirementsInfoNV _accelerationStructure(MemorySegment src) { return _accelerationStructureAt(0L, src); }
}
