// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureMoveObjectsInputNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureMoveObjectsInputNV {
///     VkStructureType sType;
///     void* pNext;
///     VkClusterAccelerationStructureTypeNV type;
///     VkBool32 noMoveOverlap;
///     VkDeviceSize maxMovedBytes;
/// }
/// ```
public final class VkClusterAccelerationStructureMoveObjectsInputNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("noMoveOverlap"),
        ValueLayout.JAVA_LONG.withName("maxMovedBytes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_noMoveOverlap = LAYOUT.byteOffset(PathElement.groupElement("noMoveOverlap"));
    public static final long OFFSET_maxMovedBytes = LAYOUT.byteOffset(PathElement.groupElement("maxMovedBytes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_noMoveOverlap = LAYOUT.select(PathElement.groupElement("noMoveOverlap"));
    public static final MemoryLayout LAYOUT_maxMovedBytes = LAYOUT.select(PathElement.groupElement("maxMovedBytes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_noMoveOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("noMoveOverlap"));
    public static final VarHandle VH_maxMovedBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMovedBytes"));

    public VkClusterAccelerationStructureMoveObjectsInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureMoveObjectsInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInputNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureMoveObjectsInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureMoveObjectsInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureMoveObjectsInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureMoveObjectsInputNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureMoveObjectsInputNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureMoveObjectsInputNV(allocator.allocate(LAYOUT, count), count); }
    public static VkClusterAccelerationStructureMoveObjectsInputNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV); }
    public static VkClusterAccelerationStructureMoveObjectsInputNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV);
        return s;
    }
    public VkClusterAccelerationStructureMoveObjectsInputNV copyFrom(VkClusterAccelerationStructureMoveObjectsInputNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV reinterpret(long count) { return new VkClusterAccelerationStructureMoveObjectsInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureMoveObjectsInputNV asSlice(long index) { return new VkClusterAccelerationStructureMoveObjectsInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureMoveObjectsInputNV asSlice(long index, long count) { return new VkClusterAccelerationStructureMoveObjectsInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureMoveObjectsInputNV at(long index, Consumer<VkClusterAccelerationStructureMoveObjectsInputNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int noMoveOverlapAt(long index) { return (int) VH_noMoveOverlap.get(this.segment(), 0L, index); }
    public long maxMovedBytesAt(long index) { return (long) VH_maxMovedBytes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int noMoveOverlap() { return (int) VH_noMoveOverlap.get(this.segment(), 0L, 0L); }
    public long maxMovedBytes() { return (long) VH_maxMovedBytes.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureMoveObjectsInputNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV noMoveOverlapAt(long index, int value) { VH_noMoveOverlap.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV maxMovedBytesAt(long index, long value) { VH_maxMovedBytes.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV noMoveOverlap(int value) { VH_noMoveOverlap.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV maxMovedBytes(long value) { VH_maxMovedBytes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkClusterAccelerationStructureMoveObjectsInputNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkClusterAccelerationStructureMoveObjectsInputNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkClusterAccelerationStructureMoveObjectsInputNV _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _noMoveOverlapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_noMoveOverlap, index), LAYOUT_noMoveOverlap); }
    public MemorySegment _noMoveOverlap() { return _noMoveOverlapAt(0L); }
    public VkClusterAccelerationStructureMoveObjectsInputNV _noMoveOverlapAt(long index, MemorySegment src) { _noMoveOverlapAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV _noMoveOverlap(MemorySegment src) { return _noMoveOverlapAt(0L, src); }
    public MemorySegment _maxMovedBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMovedBytes, index), LAYOUT_maxMovedBytes); }
    public MemorySegment _maxMovedBytes() { return _maxMovedBytesAt(0L); }
    public VkClusterAccelerationStructureMoveObjectsInputNV _maxMovedBytesAt(long index, MemorySegment src) { _maxMovedBytesAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureMoveObjectsInputNV _maxMovedBytes(MemorySegment src) { return _maxMovedBytesAt(0L, src); }
}
