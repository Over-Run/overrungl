// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureMoveObjectsInfoNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureMoveObjectsInfoNV {
///     VkDeviceAddress srcAccelerationStructure;
/// }
/// ```
public final class VkClusterAccelerationStructureMoveObjectsInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAccelerationStructure")
    );
    public static final long OFFSET_srcAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructure"));
    public static final MemoryLayout LAYOUT_srcAccelerationStructure = LAYOUT.select(PathElement.groupElement("srcAccelerationStructure"));
    public static final VarHandle VH_srcAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccelerationStructure"));

    public VkClusterAccelerationStructureMoveObjectsInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureMoveObjectsInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureMoveObjectsInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureMoveObjectsInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureMoveObjectsInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureMoveObjectsInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(allocator.allocate(LAYOUT, count), count); }
    public VkClusterAccelerationStructureMoveObjectsInfoNV copyFrom(VkClusterAccelerationStructureMoveObjectsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureMoveObjectsInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureMoveObjectsInfoNV asSlice(long index) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureMoveObjectsInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureMoveObjectsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureMoveObjectsInfoNV at(long index, Consumer<VkClusterAccelerationStructureMoveObjectsInfoNV> func) { func.accept(asSlice(index)); return this; }
    public long srcAccelerationStructureAt(long index) { return (long) VH_srcAccelerationStructure.get(this.segment(), 0L, index); }
    public long srcAccelerationStructure() { return (long) VH_srcAccelerationStructure.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureMoveObjectsInfoNV srcAccelerationStructureAt(long index, long value) { VH_srcAccelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureMoveObjectsInfoNV srcAccelerationStructure(long value) { VH_srcAccelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _srcAccelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccelerationStructure, index), LAYOUT_srcAccelerationStructure); }
    public MemorySegment _srcAccelerationStructure() { return _srcAccelerationStructureAt(0L); }
    public VkClusterAccelerationStructureMoveObjectsInfoNV _srcAccelerationStructureAt(long index, MemorySegment src) { _srcAccelerationStructureAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureMoveObjectsInfoNV _srcAccelerationStructure(MemorySegment src) { return _srcAccelerationStructureAt(0L, src); }
}
