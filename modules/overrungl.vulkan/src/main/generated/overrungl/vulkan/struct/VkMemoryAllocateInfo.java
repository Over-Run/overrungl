// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryAllocateInfo`.
/// ## Layout
/// ```
/// struct VkMemoryAllocateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceSize allocationSize;
///     uint32_t memoryTypeIndex;
/// }
/// ```
public final class VkMemoryAllocateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("allocationSize"),
        ValueLayout.JAVA_INT.withName("memoryTypeIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_allocationSize = LAYOUT.byteOffset(PathElement.groupElement("allocationSize"));
    public static final long OFFSET_memoryTypeIndex = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_allocationSize = LAYOUT.select(PathElement.groupElement("allocationSize"));
    public static final MemoryLayout LAYOUT_memoryTypeIndex = LAYOUT.select(PathElement.groupElement("memoryTypeIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_allocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationSize"));
    public static final VarHandle VH_memoryTypeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeIndex"));

    public VkMemoryAllocateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryAllocateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryAllocateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryAllocateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryAllocateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryAllocateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryAllocateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryAllocateInfo alloc(SegmentAllocator allocator) { return new VkMemoryAllocateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryAllocateInfo alloc(SegmentAllocator allocator, long count) { return new VkMemoryAllocateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryAllocateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO); }
    public static VkMemoryAllocateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO);
        return s;
    }
    public VkMemoryAllocateInfo copyFrom(VkMemoryAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryAllocateInfo reinterpret(long count) { return new VkMemoryAllocateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryAllocateInfo asSlice(long index) { return new VkMemoryAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryAllocateInfo asSlice(long index, long count) { return new VkMemoryAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryAllocateInfo at(long index, Consumer<VkMemoryAllocateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long allocationSizeAt(long index) { return (long) VH_allocationSize.get(this.segment(), 0L, index); }
    public int memoryTypeIndexAt(long index) { return (int) VH_memoryTypeIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long allocationSize() { return (long) VH_allocationSize.get(this.segment(), 0L, 0L); }
    public int memoryTypeIndex() { return (int) VH_memoryTypeIndex.get(this.segment(), 0L, 0L); }
    public VkMemoryAllocateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryAllocateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryAllocateInfo allocationSizeAt(long index, long value) { VH_allocationSize.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryAllocateInfo memoryTypeIndexAt(long index, int value) { VH_memoryTypeIndex.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryAllocateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryAllocateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryAllocateInfo allocationSize(long value) { VH_allocationSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryAllocateInfo memoryTypeIndex(int value) { VH_memoryTypeIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryAllocateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryAllocateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryAllocateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryAllocateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _allocationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_allocationSize, index), LAYOUT_allocationSize); }
    public MemorySegment _allocationSize() { return _allocationSizeAt(0L); }
    public VkMemoryAllocateInfo _allocationSizeAt(long index, MemorySegment src) { _allocationSizeAt(index).copyFrom(src); return this; }
    public VkMemoryAllocateInfo _allocationSize(MemorySegment src) { return _allocationSizeAt(0L, src); }
    public MemorySegment _memoryTypeIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypeIndex, index), LAYOUT_memoryTypeIndex); }
    public MemorySegment _memoryTypeIndex() { return _memoryTypeIndexAt(0L); }
    public VkMemoryAllocateInfo _memoryTypeIndexAt(long index, MemorySegment src) { _memoryTypeIndexAt(index).copyFrom(src); return this; }
    public VkMemoryAllocateInfo _memoryTypeIndex(MemorySegment src) { return _memoryTypeIndexAt(0L, src); }
}
