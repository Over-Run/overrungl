// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAllocationCallbacks`.
/// ## Layout
/// ```
/// struct VkAllocationCallbacks {
///     void* pUserData;
///     PFN_vkAllocationFunction pfnAllocation;
///     PFN_vkReallocationFunction pfnReallocation;
///     PFN_vkFreeFunction pfnFree;
///     PFN_vkInternalAllocationNotification pfnInternalAllocation;
///     PFN_vkInternalFreeNotification pfnInternalFree;
/// }
/// ```
public final class VkAllocationCallbacks extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.ADDRESS.withName("pfnAllocation"),
        ValueLayout.ADDRESS.withName("pfnReallocation"),
        ValueLayout.ADDRESS.withName("pfnFree"),
        ValueLayout.ADDRESS.withName("pfnInternalAllocation"),
        ValueLayout.ADDRESS.withName("pfnInternalFree")
    );
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    public static final long OFFSET_pfnAllocation = LAYOUT.byteOffset(PathElement.groupElement("pfnAllocation"));
    public static final long OFFSET_pfnReallocation = LAYOUT.byteOffset(PathElement.groupElement("pfnReallocation"));
    public static final long OFFSET_pfnFree = LAYOUT.byteOffset(PathElement.groupElement("pfnFree"));
    public static final long OFFSET_pfnInternalAllocation = LAYOUT.byteOffset(PathElement.groupElement("pfnInternalAllocation"));
    public static final long OFFSET_pfnInternalFree = LAYOUT.byteOffset(PathElement.groupElement("pfnInternalFree"));
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    public static final MemoryLayout LAYOUT_pfnAllocation = LAYOUT.select(PathElement.groupElement("pfnAllocation"));
    public static final MemoryLayout LAYOUT_pfnReallocation = LAYOUT.select(PathElement.groupElement("pfnReallocation"));
    public static final MemoryLayout LAYOUT_pfnFree = LAYOUT.select(PathElement.groupElement("pfnFree"));
    public static final MemoryLayout LAYOUT_pfnInternalAllocation = LAYOUT.select(PathElement.groupElement("pfnInternalAllocation"));
    public static final MemoryLayout LAYOUT_pfnInternalFree = LAYOUT.select(PathElement.groupElement("pfnInternalFree"));
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));
    public static final VarHandle VH_pfnAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnAllocation"));
    public static final VarHandle VH_pfnReallocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnReallocation"));
    public static final VarHandle VH_pfnFree = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnFree"));
    public static final VarHandle VH_pfnInternalAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnInternalAllocation"));
    public static final VarHandle VH_pfnInternalFree = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnInternalFree"));

    public VkAllocationCallbacks(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAllocationCallbacks of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment, estimateCount(segment, LAYOUT)); }
    public static VkAllocationCallbacks ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAllocationCallbacks ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAllocationCallbacks alloc(SegmentAllocator allocator) { return new VkAllocationCallbacks(allocator.allocate(LAYOUT), 1); }
    public static VkAllocationCallbacks alloc(SegmentAllocator allocator, long count) { return new VkAllocationCallbacks(allocator.allocate(LAYOUT, count), count); }
    public VkAllocationCallbacks copyFrom(VkAllocationCallbacks src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAllocationCallbacks reinterpret(long count) { return new VkAllocationCallbacks(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAllocationCallbacks asSlice(long index) { return new VkAllocationCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAllocationCallbacks asSlice(long index, long count) { return new VkAllocationCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAllocationCallbacks at(long index, Consumer<VkAllocationCallbacks> func) { func.accept(asSlice(index)); return this; }
    public MemorySegment pUserDataAt(long index) { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, index); }
    public MemorySegment pfnAllocationAt(long index) { return (MemorySegment) VH_pfnAllocation.get(this.segment(), 0L, index); }
    public MemorySegment pfnReallocationAt(long index) { return (MemorySegment) VH_pfnReallocation.get(this.segment(), 0L, index); }
    public MemorySegment pfnFreeAt(long index) { return (MemorySegment) VH_pfnFree.get(this.segment(), 0L, index); }
    public MemorySegment pfnInternalAllocationAt(long index) { return (MemorySegment) VH_pfnInternalAllocation.get(this.segment(), 0L, index); }
    public MemorySegment pfnInternalFreeAt(long index) { return (MemorySegment) VH_pfnInternalFree.get(this.segment(), 0L, index); }
    public MemorySegment pUserData() { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnAllocation() { return (MemorySegment) VH_pfnAllocation.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnReallocation() { return (MemorySegment) VH_pfnReallocation.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnFree() { return (MemorySegment) VH_pfnFree.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnInternalAllocation() { return (MemorySegment) VH_pfnInternalAllocation.get(this.segment(), 0L, 0L); }
    public MemorySegment pfnInternalFree() { return (MemorySegment) VH_pfnInternalFree.get(this.segment(), 0L, 0L); }
    public VkAllocationCallbacks pUserDataAt(long index, MemorySegment value) { VH_pUserData.set(this.segment(), 0L, index, value); return this; }
    public VkAllocationCallbacks pfnAllocationAt(long index, MemorySegment value) { VH_pfnAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkAllocationCallbacks pfnReallocationAt(long index, MemorySegment value) { VH_pfnReallocation.set(this.segment(), 0L, index, value); return this; }
    public VkAllocationCallbacks pfnFreeAt(long index, MemorySegment value) { VH_pfnFree.set(this.segment(), 0L, index, value); return this; }
    public VkAllocationCallbacks pfnInternalAllocationAt(long index, MemorySegment value) { VH_pfnInternalAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkAllocationCallbacks pfnInternalFreeAt(long index, MemorySegment value) { VH_pfnInternalFree.set(this.segment(), 0L, index, value); return this; }
    public VkAllocationCallbacks pUserData(MemorySegment value) { VH_pUserData.set(this.segment(), 0L, 0L, value); return this; }
    public VkAllocationCallbacks pfnAllocation(MemorySegment value) { VH_pfnAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkAllocationCallbacks pfnReallocation(MemorySegment value) { VH_pfnReallocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkAllocationCallbacks pfnFree(MemorySegment value) { VH_pfnFree.set(this.segment(), 0L, 0L, value); return this; }
    public VkAllocationCallbacks pfnInternalAllocation(MemorySegment value) { VH_pfnInternalAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkAllocationCallbacks pfnInternalFree(MemorySegment value) { VH_pfnInternalFree.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _pUserDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUserData, index), LAYOUT_pUserData); }
    public MemorySegment _pUserData() { return _pUserDataAt(0L); }
    public VkAllocationCallbacks _pUserDataAt(long index, MemorySegment src) { _pUserDataAt(index).copyFrom(src); return this; }
    public VkAllocationCallbacks _pUserData(MemorySegment src) { return _pUserDataAt(0L, src); }
    public MemorySegment _pfnAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnAllocation, index), LAYOUT_pfnAllocation); }
    public MemorySegment _pfnAllocation() { return _pfnAllocationAt(0L); }
    public VkAllocationCallbacks _pfnAllocationAt(long index, MemorySegment src) { _pfnAllocationAt(index).copyFrom(src); return this; }
    public VkAllocationCallbacks _pfnAllocation(MemorySegment src) { return _pfnAllocationAt(0L, src); }
    public MemorySegment _pfnReallocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnReallocation, index), LAYOUT_pfnReallocation); }
    public MemorySegment _pfnReallocation() { return _pfnReallocationAt(0L); }
    public VkAllocationCallbacks _pfnReallocationAt(long index, MemorySegment src) { _pfnReallocationAt(index).copyFrom(src); return this; }
    public VkAllocationCallbacks _pfnReallocation(MemorySegment src) { return _pfnReallocationAt(0L, src); }
    public MemorySegment _pfnFreeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnFree, index), LAYOUT_pfnFree); }
    public MemorySegment _pfnFree() { return _pfnFreeAt(0L); }
    public VkAllocationCallbacks _pfnFreeAt(long index, MemorySegment src) { _pfnFreeAt(index).copyFrom(src); return this; }
    public VkAllocationCallbacks _pfnFree(MemorySegment src) { return _pfnFreeAt(0L, src); }
    public MemorySegment _pfnInternalAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnInternalAllocation, index), LAYOUT_pfnInternalAllocation); }
    public MemorySegment _pfnInternalAllocation() { return _pfnInternalAllocationAt(0L); }
    public VkAllocationCallbacks _pfnInternalAllocationAt(long index, MemorySegment src) { _pfnInternalAllocationAt(index).copyFrom(src); return this; }
    public VkAllocationCallbacks _pfnInternalAllocation(MemorySegment src) { return _pfnInternalAllocationAt(0L, src); }
    public MemorySegment _pfnInternalFreeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pfnInternalFree, index), LAYOUT_pfnInternalFree); }
    public MemorySegment _pfnInternalFree() { return _pfnInternalFreeAt(0L); }
    public VkAllocationCallbacks _pfnInternalFreeAt(long index, MemorySegment src) { _pfnInternalFreeAt(index).copyFrom(src); return this; }
    public VkAllocationCallbacks _pfnInternalFree(MemorySegment src) { return _pfnInternalFreeAt(0L, src); }
}
