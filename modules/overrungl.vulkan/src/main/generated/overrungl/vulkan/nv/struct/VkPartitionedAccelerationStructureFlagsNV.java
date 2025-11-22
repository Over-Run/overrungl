// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPartitionedAccelerationStructureFlagsNV`.
/// ## Layout
/// ```
/// struct VkPartitionedAccelerationStructureFlagsNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 enablePartitionTranslation;
/// }
/// ```
public final class VkPartitionedAccelerationStructureFlagsNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enablePartitionTranslation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_enablePartitionTranslation = LAYOUT.byteOffset(PathElement.groupElement("enablePartitionTranslation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_enablePartitionTranslation = LAYOUT.select(PathElement.groupElement("enablePartitionTranslation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_enablePartitionTranslation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enablePartitionTranslation"));

    public VkPartitionedAccelerationStructureFlagsNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPartitionedAccelerationStructureFlagsNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureFlagsNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPartitionedAccelerationStructureFlagsNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureFlagsNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPartitionedAccelerationStructureFlagsNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureFlagsNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPartitionedAccelerationStructureFlagsNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureFlagsNV(allocator.allocate(LAYOUT), 1); }
    public static VkPartitionedAccelerationStructureFlagsNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureFlagsNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPartitionedAccelerationStructureFlagsNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV); }
    public static VkPartitionedAccelerationStructureFlagsNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV);
        return s;
    }
    public VkPartitionedAccelerationStructureFlagsNV copyFrom(VkPartitionedAccelerationStructureFlagsNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPartitionedAccelerationStructureFlagsNV reinterpret(long count) { return new VkPartitionedAccelerationStructureFlagsNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPartitionedAccelerationStructureFlagsNV asSlice(long index) { return new VkPartitionedAccelerationStructureFlagsNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPartitionedAccelerationStructureFlagsNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureFlagsNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPartitionedAccelerationStructureFlagsNV at(long index, Consumer<VkPartitionedAccelerationStructureFlagsNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int enablePartitionTranslationAt(long index) { return (int) VH_enablePartitionTranslation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int enablePartitionTranslation() { return (int) VH_enablePartitionTranslation.get(this.segment(), 0L, 0L); }
    public VkPartitionedAccelerationStructureFlagsNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureFlagsNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureFlagsNV enablePartitionTranslationAt(long index, int value) { VH_enablePartitionTranslation.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureFlagsNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureFlagsNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureFlagsNV enablePartitionTranslation(int value) { VH_enablePartitionTranslation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPartitionedAccelerationStructureFlagsNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureFlagsNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPartitionedAccelerationStructureFlagsNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureFlagsNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _enablePartitionTranslationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enablePartitionTranslation, index), LAYOUT_enablePartitionTranslation); }
    public MemorySegment _enablePartitionTranslation() { return _enablePartitionTranslationAt(0L); }
    public VkPartitionedAccelerationStructureFlagsNV _enablePartitionTranslationAt(long index, MemorySegment src) { _enablePartitionTranslationAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureFlagsNV _enablePartitionTranslation(MemorySegment src) { return _enablePartitionTranslationAt(0L, src); }
}
