// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceSize compactedSize;
///     VkAccelerationStructureInfoNV info;
/// }
/// ```
public final class VkAccelerationStructureCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("compactedSize"),
        overrungl.vulkan.nv.struct.VkAccelerationStructureInfoNV.LAYOUT.withName("info")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_compactedSize = LAYOUT.byteOffset(PathElement.groupElement("compactedSize"));
    public static final long OFFSET_info = LAYOUT.byteOffset(PathElement.groupElement("info"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_compactedSize = LAYOUT.select(PathElement.groupElement("compactedSize"));
    public static final MemoryLayout LAYOUT_info = LAYOUT.select(PathElement.groupElement("info"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_compactedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compactedSize"));
    public static final VarHandle VH_info$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("sType"));
    public static final VarHandle VH_info$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_info$type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("type"));
    public static final VarHandle VH_info$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("flags"));
    public static final VarHandle VH_info$instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("instanceCount"));
    public static final VarHandle VH_info$geometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("geometryCount"));
    public static final VarHandle VH_info$pGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("pGeometries"));

    public VkAccelerationStructureCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureCreateInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV); }
    public static VkAccelerationStructureCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV);
        return s;
    }
    public VkAccelerationStructureCreateInfoNV copyFrom(VkAccelerationStructureCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureCreateInfoNV reinterpret(long count) { return new VkAccelerationStructureCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureCreateInfoNV asSlice(long index) { return new VkAccelerationStructureCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureCreateInfoNV asSlice(long index, long count) { return new VkAccelerationStructureCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureCreateInfoNV at(long index, Consumer<VkAccelerationStructureCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long compactedSizeAt(long index) { return (long) VH_compactedSize.get(this.segment(), 0L, index); }
    public int info$sTypeAt(long index) { return (int) VH_info$sType.get(this.segment(), 0L, index); }
    public MemorySegment info$pNextAt(long index) { return (MemorySegment) VH_info$pNext.get(this.segment(), 0L, index); }
    public int info$typeAt(long index) { return (int) VH_info$type.get(this.segment(), 0L, index); }
    public int info$flagsAt(long index) { return (int) VH_info$flags.get(this.segment(), 0L, index); }
    public int info$instanceCountAt(long index) { return (int) VH_info$instanceCount.get(this.segment(), 0L, index); }
    public int info$geometryCountAt(long index) { return (int) VH_info$geometryCount.get(this.segment(), 0L, index); }
    public MemorySegment info$pGeometriesAt(long index) { return (MemorySegment) VH_info$pGeometries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long compactedSize() { return (long) VH_compactedSize.get(this.segment(), 0L, 0L); }
    public int info$sType() { return (int) VH_info$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment info$pNext() { return (MemorySegment) VH_info$pNext.get(this.segment(), 0L, 0L); }
    public int info$type() { return (int) VH_info$type.get(this.segment(), 0L, 0L); }
    public int info$flags() { return (int) VH_info$flags.get(this.segment(), 0L, 0L); }
    public int info$instanceCount() { return (int) VH_info$instanceCount.get(this.segment(), 0L, 0L); }
    public int info$geometryCount() { return (int) VH_info$geometryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment info$pGeometries() { return (MemorySegment) VH_info$pGeometries.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV compactedSizeAt(long index, long value) { VH_compactedSize.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$sTypeAt(long index, int value) { VH_info$sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$pNextAt(long index, MemorySegment value) { VH_info$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$typeAt(long index, int value) { VH_info$type.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$flagsAt(long index, int value) { VH_info$flags.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$instanceCountAt(long index, int value) { VH_info$instanceCount.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$geometryCountAt(long index, int value) { VH_info$geometryCount.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$pGeometriesAt(long index, MemorySegment value) { VH_info$pGeometries.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV compactedSize(long value) { VH_compactedSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$sType(int value) { VH_info$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$pNext(MemorySegment value) { VH_info$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$type(int value) { VH_info$type.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$flags(int value) { VH_info$flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$instanceCount(int value) { VH_info$instanceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$geometryCount(int value) { VH_info$geometryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureCreateInfoNV info$pGeometries(MemorySegment value) { VH_info$pGeometries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _compactedSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compactedSize, index), LAYOUT_compactedSize); }
    public MemorySegment _compactedSize() { return _compactedSizeAt(0L); }
    public VkAccelerationStructureCreateInfoNV _compactedSizeAt(long index, MemorySegment src) { _compactedSizeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureCreateInfoNV _compactedSize(MemorySegment src) { return _compactedSizeAt(0L, src); }
    public MemorySegment _infoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_info, index), LAYOUT_info); }
    public MemorySegment _info() { return _infoAt(0L); }
    public VkAccelerationStructureCreateInfoNV _infoAt(long index, MemorySegment src) { _infoAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureCreateInfoNV _info(MemorySegment src) { return _infoAt(0L, src); }
}
