// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMutableDescriptorTypeCreateInfoVALVE`.
/// ## Layout
/// ```
/// struct VkMutableDescriptorTypeCreateInfoVALVE {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t mutableDescriptorTypeListCount;
///     const VkMutableDescriptorTypeListEXT* pMutableDescriptorTypeLists;
/// }
/// ```
public final class VkMutableDescriptorTypeCreateInfoVALVE extends GroupType {
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

    public VkMutableDescriptorTypeCreateInfoVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMutableDescriptorTypeCreateInfoVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkMutableDescriptorTypeCreateInfoVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMutableDescriptorTypeCreateInfoVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMutableDescriptorTypeCreateInfoVALVE alloc(SegmentAllocator allocator) { return new VkMutableDescriptorTypeCreateInfoVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkMutableDescriptorTypeCreateInfoVALVE alloc(SegmentAllocator allocator, long count) { return new VkMutableDescriptorTypeCreateInfoVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkMutableDescriptorTypeCreateInfoVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT); }
    public static VkMutableDescriptorTypeCreateInfoVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT);
        return s;
    }
    public VkMutableDescriptorTypeCreateInfoVALVE copyFrom(VkMutableDescriptorTypeCreateInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE reinterpret(long count) { return new VkMutableDescriptorTypeCreateInfoVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMutableDescriptorTypeCreateInfoVALVE asSlice(long index) { return new VkMutableDescriptorTypeCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMutableDescriptorTypeCreateInfoVALVE asSlice(long index, long count) { return new VkMutableDescriptorTypeCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMutableDescriptorTypeCreateInfoVALVE at(long index, Consumer<VkMutableDescriptorTypeCreateInfoVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int mutableDescriptorTypeListCountAt(long index) { return (int) VH_mutableDescriptorTypeListCount.get(this.segment(), 0L, index); }
    public MemorySegment pMutableDescriptorTypeListsAt(long index) { return (MemorySegment) VH_pMutableDescriptorTypeLists.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int mutableDescriptorTypeListCount() { return (int) VH_mutableDescriptorTypeListCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pMutableDescriptorTypeLists() { return (MemorySegment) VH_pMutableDescriptorTypeLists.get(this.segment(), 0L, 0L); }
    public VkMutableDescriptorTypeCreateInfoVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE mutableDescriptorTypeListCountAt(long index, int value) { VH_mutableDescriptorTypeListCount.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE pMutableDescriptorTypeListsAt(long index, MemorySegment value) { VH_pMutableDescriptorTypeLists.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE mutableDescriptorTypeListCount(int value) { VH_mutableDescriptorTypeListCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE pMutableDescriptorTypeLists(MemorySegment value) { VH_pMutableDescriptorTypeLists.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMutableDescriptorTypeCreateInfoVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMutableDescriptorTypeCreateInfoVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _mutableDescriptorTypeListCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mutableDescriptorTypeListCount, index), LAYOUT_mutableDescriptorTypeListCount); }
    public MemorySegment _mutableDescriptorTypeListCount() { return _mutableDescriptorTypeListCountAt(0L); }
    public VkMutableDescriptorTypeCreateInfoVALVE _mutableDescriptorTypeListCountAt(long index, MemorySegment src) { _mutableDescriptorTypeListCountAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE _mutableDescriptorTypeListCount(MemorySegment src) { return _mutableDescriptorTypeListCountAt(0L, src); }
    public MemorySegment _pMutableDescriptorTypeListsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMutableDescriptorTypeLists, index), LAYOUT_pMutableDescriptorTypeLists); }
    public MemorySegment _pMutableDescriptorTypeLists() { return _pMutableDescriptorTypeListsAt(0L); }
    public VkMutableDescriptorTypeCreateInfoVALVE _pMutableDescriptorTypeListsAt(long index, MemorySegment src) { _pMutableDescriptorTypeListsAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeCreateInfoVALVE _pMutableDescriptorTypeLists(MemorySegment src) { return _pMutableDescriptorTypeListsAt(0L, src); }
}
