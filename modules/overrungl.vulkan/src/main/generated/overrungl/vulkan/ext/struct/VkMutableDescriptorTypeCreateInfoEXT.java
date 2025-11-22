// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMutableDescriptorTypeCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkMutableDescriptorTypeCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t mutableDescriptorTypeListCount;
///     const VkMutableDescriptorTypeListEXT* pMutableDescriptorTypeLists;
/// }
/// ```
public final class VkMutableDescriptorTypeCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mutableDescriptorTypeListCount"),
        ValueLayout.ADDRESS.withName("pMutableDescriptorTypeLists")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_mutableDescriptorTypeListCount = LAYOUT.byteOffset(PathElement.groupElement("mutableDescriptorTypeListCount"));
    public static final long OFFSET_pMutableDescriptorTypeLists = LAYOUT.byteOffset(PathElement.groupElement("pMutableDescriptorTypeLists"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_mutableDescriptorTypeListCount = LAYOUT.select(PathElement.groupElement("mutableDescriptorTypeListCount"));
    public static final MemoryLayout LAYOUT_pMutableDescriptorTypeLists = LAYOUT.select(PathElement.groupElement("pMutableDescriptorTypeLists"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_mutableDescriptorTypeListCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mutableDescriptorTypeListCount"));
    public static final VarHandle VH_pMutableDescriptorTypeLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMutableDescriptorTypeLists"));

    public VkMutableDescriptorTypeCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMutableDescriptorTypeCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMutableDescriptorTypeCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMutableDescriptorTypeCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMutableDescriptorTypeCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkMutableDescriptorTypeCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMutableDescriptorTypeCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMutableDescriptorTypeCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkMutableDescriptorTypeCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT); }
    public static VkMutableDescriptorTypeCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT);
        return s;
    }
    public VkMutableDescriptorTypeCreateInfoEXT copyFrom(VkMutableDescriptorTypeCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT reinterpret(long count) { return new VkMutableDescriptorTypeCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMutableDescriptorTypeCreateInfoEXT asSlice(long index) { return new VkMutableDescriptorTypeCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMutableDescriptorTypeCreateInfoEXT asSlice(long index, long count) { return new VkMutableDescriptorTypeCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMutableDescriptorTypeCreateInfoEXT at(long index, Consumer<VkMutableDescriptorTypeCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int mutableDescriptorTypeListCountAt(long index) { return (int) VH_mutableDescriptorTypeListCount.get(this.segment(), 0L, index); }
    public MemorySegment pMutableDescriptorTypeListsAt(long index) { return (MemorySegment) VH_pMutableDescriptorTypeLists.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int mutableDescriptorTypeListCount() { return (int) VH_mutableDescriptorTypeListCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pMutableDescriptorTypeLists() { return (MemorySegment) VH_pMutableDescriptorTypeLists.get(this.segment(), 0L, 0L); }
    public VkMutableDescriptorTypeCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT mutableDescriptorTypeListCountAt(long index, int value) { VH_mutableDescriptorTypeListCount.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT pMutableDescriptorTypeListsAt(long index, MemorySegment value) { VH_pMutableDescriptorTypeLists.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT mutableDescriptorTypeListCount(int value) { VH_mutableDescriptorTypeListCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT pMutableDescriptorTypeLists(MemorySegment value) { VH_pMutableDescriptorTypeLists.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMutableDescriptorTypeCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMutableDescriptorTypeCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _mutableDescriptorTypeListCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mutableDescriptorTypeListCount, index), LAYOUT_mutableDescriptorTypeListCount); }
    public MemorySegment _mutableDescriptorTypeListCount() { return _mutableDescriptorTypeListCountAt(0L); }
    public VkMutableDescriptorTypeCreateInfoEXT _mutableDescriptorTypeListCountAt(long index, MemorySegment src) { _mutableDescriptorTypeListCountAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT _mutableDescriptorTypeListCount(MemorySegment src) { return _mutableDescriptorTypeListCountAt(0L, src); }
    public MemorySegment _pMutableDescriptorTypeListsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMutableDescriptorTypeLists, index), LAYOUT_pMutableDescriptorTypeLists); }
    public MemorySegment _pMutableDescriptorTypeLists() { return _pMutableDescriptorTypeListsAt(0L); }
    public VkMutableDescriptorTypeCreateInfoEXT _pMutableDescriptorTypeListsAt(long index, MemorySegment src) { _pMutableDescriptorTypeListsAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeCreateInfoEXT _pMutableDescriptorTypeLists(MemorySegment src) { return _pMutableDescriptorTypeListsAt(0L, src); }
}
