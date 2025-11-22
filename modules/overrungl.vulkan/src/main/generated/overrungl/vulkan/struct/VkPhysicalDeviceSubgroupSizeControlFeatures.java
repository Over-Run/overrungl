// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSubgroupSizeControlFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubgroupSizeControlFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 subgroupSizeControl;
///     VkBool32 computeFullSubgroups;
/// }
/// ```
public final class VkPhysicalDeviceSubgroupSizeControlFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subgroupSizeControl"),
        ValueLayout.JAVA_INT.withName("computeFullSubgroups")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_subgroupSizeControl = LAYOUT.byteOffset(PathElement.groupElement("subgroupSizeControl"));
    public static final long OFFSET_computeFullSubgroups = LAYOUT.byteOffset(PathElement.groupElement("computeFullSubgroups"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_subgroupSizeControl = LAYOUT.select(PathElement.groupElement("subgroupSizeControl"));
    public static final MemoryLayout LAYOUT_computeFullSubgroups = LAYOUT.select(PathElement.groupElement("computeFullSubgroups"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_subgroupSizeControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSizeControl"));
    public static final VarHandle VH_computeFullSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeFullSubgroups"));

    public VkPhysicalDeviceSubgroupSizeControlFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSubgroupSizeControlFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSubgroupSizeControlFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSubgroupSizeControlFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSubgroupSizeControlFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupSizeControlFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSubgroupSizeControlFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubgroupSizeControlFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSubgroupSizeControlFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES); }
    public static VkPhysicalDeviceSubgroupSizeControlFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES);
        return s;
    }
    public VkPhysicalDeviceSubgroupSizeControlFeatures copyFrom(VkPhysicalDeviceSubgroupSizeControlFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures reinterpret(long count) { return new VkPhysicalDeviceSubgroupSizeControlFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSubgroupSizeControlFeatures asSlice(long index) { return new VkPhysicalDeviceSubgroupSizeControlFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSubgroupSizeControlFeatures asSlice(long index, long count) { return new VkPhysicalDeviceSubgroupSizeControlFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSubgroupSizeControlFeatures at(long index, Consumer<VkPhysicalDeviceSubgroupSizeControlFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int subgroupSizeControlAt(long index) { return (int) VH_subgroupSizeControl.get(this.segment(), 0L, index); }
    public int computeFullSubgroupsAt(long index) { return (int) VH_computeFullSubgroups.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int subgroupSizeControl() { return (int) VH_subgroupSizeControl.get(this.segment(), 0L, 0L); }
    public int computeFullSubgroups() { return (int) VH_computeFullSubgroups.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSubgroupSizeControlFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures subgroupSizeControlAt(long index, int value) { VH_subgroupSizeControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures computeFullSubgroupsAt(long index, int value) { VH_computeFullSubgroups.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures subgroupSizeControl(int value) { VH_subgroupSizeControl.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures computeFullSubgroups(int value) { VH_computeFullSubgroups.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _subgroupSizeControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupSizeControl, index), LAYOUT_subgroupSizeControl); }
    public MemorySegment _subgroupSizeControl() { return _subgroupSizeControlAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlFeatures _subgroupSizeControlAt(long index, MemorySegment src) { _subgroupSizeControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures _subgroupSizeControl(MemorySegment src) { return _subgroupSizeControlAt(0L, src); }
    public MemorySegment _computeFullSubgroupsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_computeFullSubgroups, index), LAYOUT_computeFullSubgroups); }
    public MemorySegment _computeFullSubgroups() { return _computeFullSubgroupsAt(0L); }
    public VkPhysicalDeviceSubgroupSizeControlFeatures _computeFullSubgroupsAt(long index, MemorySegment src) { _computeFullSubgroupsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubgroupSizeControlFeatures _computeFullSubgroups(MemorySegment src) { return _computeFullSubgroupsAt(0L, src); }
}
