// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryDedicatedRequirements`.
/// ## Layout
/// ```
/// struct VkMemoryDedicatedRequirements {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 prefersDedicatedAllocation;
///     VkBool32 requiresDedicatedAllocation;
/// }
/// ```
public final class VkMemoryDedicatedRequirements extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("prefersDedicatedAllocation"),
        ValueLayout.JAVA_INT.withName("requiresDedicatedAllocation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_prefersDedicatedAllocation = LAYOUT.byteOffset(PathElement.groupElement("prefersDedicatedAllocation"));
    public static final long OFFSET_requiresDedicatedAllocation = LAYOUT.byteOffset(PathElement.groupElement("requiresDedicatedAllocation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_prefersDedicatedAllocation = LAYOUT.select(PathElement.groupElement("prefersDedicatedAllocation"));
    public static final MemoryLayout LAYOUT_requiresDedicatedAllocation = LAYOUT.select(PathElement.groupElement("requiresDedicatedAllocation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_prefersDedicatedAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersDedicatedAllocation"));
    public static final VarHandle VH_requiresDedicatedAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresDedicatedAllocation"));

    public VkMemoryDedicatedRequirements(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryDedicatedRequirements of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryDedicatedRequirements(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryDedicatedRequirements ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryDedicatedRequirements(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryDedicatedRequirements ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryDedicatedRequirements(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryDedicatedRequirements alloc(SegmentAllocator allocator) { return new VkMemoryDedicatedRequirements(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryDedicatedRequirements alloc(SegmentAllocator allocator, long count) { return new VkMemoryDedicatedRequirements(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryDedicatedRequirements allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS); }
    public static VkMemoryDedicatedRequirements allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS);
        return s;
    }
    public VkMemoryDedicatedRequirements copyFrom(VkMemoryDedicatedRequirements src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryDedicatedRequirements reinterpret(long count) { return new VkMemoryDedicatedRequirements(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryDedicatedRequirements asSlice(long index) { return new VkMemoryDedicatedRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryDedicatedRequirements asSlice(long index, long count) { return new VkMemoryDedicatedRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryDedicatedRequirements at(long index, Consumer<VkMemoryDedicatedRequirements> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int prefersDedicatedAllocationAt(long index) { return (int) VH_prefersDedicatedAllocation.get(this.segment(), 0L, index); }
    public int requiresDedicatedAllocationAt(long index) { return (int) VH_requiresDedicatedAllocation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int prefersDedicatedAllocation() { return (int) VH_prefersDedicatedAllocation.get(this.segment(), 0L, 0L); }
    public int requiresDedicatedAllocation() { return (int) VH_requiresDedicatedAllocation.get(this.segment(), 0L, 0L); }
    public VkMemoryDedicatedRequirements sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryDedicatedRequirements pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryDedicatedRequirements prefersDedicatedAllocationAt(long index, int value) { VH_prefersDedicatedAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryDedicatedRequirements requiresDedicatedAllocationAt(long index, int value) { VH_requiresDedicatedAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryDedicatedRequirements sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryDedicatedRequirements pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryDedicatedRequirements prefersDedicatedAllocation(int value) { VH_prefersDedicatedAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryDedicatedRequirements requiresDedicatedAllocation(int value) { VH_requiresDedicatedAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryDedicatedRequirements _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryDedicatedRequirements _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryDedicatedRequirements _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryDedicatedRequirements _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _prefersDedicatedAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_prefersDedicatedAllocation, index), LAYOUT_prefersDedicatedAllocation); }
    public MemorySegment _prefersDedicatedAllocation() { return _prefersDedicatedAllocationAt(0L); }
    public VkMemoryDedicatedRequirements _prefersDedicatedAllocationAt(long index, MemorySegment src) { _prefersDedicatedAllocationAt(index).copyFrom(src); return this; }
    public VkMemoryDedicatedRequirements _prefersDedicatedAllocation(MemorySegment src) { return _prefersDedicatedAllocationAt(0L, src); }
    public MemorySegment _requiresDedicatedAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiresDedicatedAllocation, index), LAYOUT_requiresDedicatedAllocation); }
    public MemorySegment _requiresDedicatedAllocation() { return _requiresDedicatedAllocationAt(0L); }
    public VkMemoryDedicatedRequirements _requiresDedicatedAllocationAt(long index, MemorySegment src) { _requiresDedicatedAllocationAt(index).copyFrom(src); return this; }
    public VkMemoryDedicatedRequirements _requiresDedicatedAllocation(MemorySegment src) { return _requiresDedicatedAllocationAt(0L, src); }
}
