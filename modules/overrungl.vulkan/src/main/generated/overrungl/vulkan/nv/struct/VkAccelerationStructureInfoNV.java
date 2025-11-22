// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureInfoNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureTypeNV type;
///     VkBuildAccelerationStructureFlagsNV flags;
///     uint32_t instanceCount;
///     uint32_t geometryCount;
///     const VkGeometryNV* pGeometries;
/// }
/// ```
public final class VkAccelerationStructureInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withName("pGeometries")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_instanceCount = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
    public static final long OFFSET_geometryCount = LAYOUT.byteOffset(PathElement.groupElement("geometryCount"));
    public static final long OFFSET_pGeometries = LAYOUT.byteOffset(PathElement.groupElement("pGeometries"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_instanceCount = LAYOUT.select(PathElement.groupElement("instanceCount"));
    public static final MemoryLayout LAYOUT_geometryCount = LAYOUT.select(PathElement.groupElement("geometryCount"));
    public static final MemoryLayout LAYOUT_pGeometries = LAYOUT.select(PathElement.groupElement("pGeometries"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    public static final VarHandle VH_geometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryCount"));
    public static final VarHandle VH_pGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGeometries"));

    public VkAccelerationStructureInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV); }
    public static VkAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV);
        return s;
    }
    public VkAccelerationStructureInfoNV copyFrom(VkAccelerationStructureInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureInfoNV reinterpret(long count) { return new VkAccelerationStructureInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureInfoNV asSlice(long index) { return new VkAccelerationStructureInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureInfoNV asSlice(long index, long count) { return new VkAccelerationStructureInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureInfoNV at(long index, Consumer<VkAccelerationStructureInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int instanceCountAt(long index) { return (int) VH_instanceCount.get(this.segment(), 0L, index); }
    public int geometryCountAt(long index) { return (int) VH_geometryCount.get(this.segment(), 0L, index); }
    public MemorySegment pGeometriesAt(long index) { return (MemorySegment) VH_pGeometries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int instanceCount() { return (int) VH_instanceCount.get(this.segment(), 0L, 0L); }
    public int geometryCount() { return (int) VH_geometryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pGeometries() { return (MemorySegment) VH_pGeometries.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureInfoNV typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureInfoNV instanceCountAt(long index, int value) { VH_instanceCount.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureInfoNV geometryCountAt(long index, int value) { VH_geometryCount.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureInfoNV pGeometriesAt(long index, MemorySegment value) { VH_pGeometries.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureInfoNV type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureInfoNV instanceCount(int value) { VH_instanceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureInfoNV geometryCount(int value) { VH_geometryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureInfoNV pGeometries(MemorySegment value) { VH_pGeometries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkAccelerationStructureInfoNV _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureInfoNV _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkAccelerationStructureInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _instanceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceCount, index), LAYOUT_instanceCount); }
    public MemorySegment _instanceCount() { return _instanceCountAt(0L); }
    public VkAccelerationStructureInfoNV _instanceCountAt(long index, MemorySegment src) { _instanceCountAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureInfoNV _instanceCount(MemorySegment src) { return _instanceCountAt(0L, src); }
    public MemorySegment _geometryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_geometryCount, index), LAYOUT_geometryCount); }
    public MemorySegment _geometryCount() { return _geometryCountAt(0L); }
    public VkAccelerationStructureInfoNV _geometryCountAt(long index, MemorySegment src) { _geometryCountAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureInfoNV _geometryCount(MemorySegment src) { return _geometryCountAt(0L, src); }
    public MemorySegment _pGeometriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pGeometries, index), LAYOUT_pGeometries); }
    public MemorySegment _pGeometries() { return _pGeometriesAt(0L); }
    public VkAccelerationStructureInfoNV _pGeometriesAt(long index, MemorySegment src) { _pGeometriesAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureInfoNV _pGeometries(MemorySegment src) { return _pGeometriesAt(0L, src); }
}
