// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureMotionInfoNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureMotionInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxInstances;
///     VkAccelerationStructureMotionInfoFlagsNV flags;
/// }
/// ```
public final class VkAccelerationStructureMotionInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInstances"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxInstances = LAYOUT.byteOffset(PathElement.groupElement("maxInstances"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxInstances = LAYOUT.select(PathElement.groupElement("maxInstances"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxInstances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstances"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkAccelerationStructureMotionInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureMotionInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureMotionInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureMotionInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureMotionInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMotionInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureMotionInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureMotionInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureMotionInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV); }
    public static VkAccelerationStructureMotionInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV);
        return s;
    }
    public VkAccelerationStructureMotionInfoNV copyFrom(VkAccelerationStructureMotionInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureMotionInfoNV reinterpret(long count) { return new VkAccelerationStructureMotionInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureMotionInfoNV asSlice(long index) { return new VkAccelerationStructureMotionInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureMotionInfoNV asSlice(long index, long count) { return new VkAccelerationStructureMotionInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureMotionInfoNV at(long index, Consumer<VkAccelerationStructureMotionInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxInstancesAt(long index) { return (int) VH_maxInstances.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxInstances() { return (int) VH_maxInstances.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureMotionInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureMotionInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureMotionInfoNV maxInstancesAt(long index, int value) { VH_maxInstances.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureMotionInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureMotionInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureMotionInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureMotionInfoNV maxInstances(int value) { VH_maxInstances.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureMotionInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureMotionInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureMotionInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureMotionInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureMotionInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxInstancesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInstances, index), LAYOUT_maxInstances); }
    public MemorySegment _maxInstances() { return _maxInstancesAt(0L); }
    public VkAccelerationStructureMotionInfoNV _maxInstancesAt(long index, MemorySegment src) { _maxInstancesAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureMotionInfoNV _maxInstances(MemorySegment src) { return _maxInstancesAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkAccelerationStructureMotionInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureMotionInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
