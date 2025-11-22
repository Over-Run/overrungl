// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupBindSparseInfo`.
/// ## Layout
/// ```
/// struct VkDeviceGroupBindSparseInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t resourceDeviceIndex;
///     uint32_t memoryDeviceIndex;
/// }
/// ```
public final class VkDeviceGroupBindSparseInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("resourceDeviceIndex"),
        ValueLayout.JAVA_INT.withName("memoryDeviceIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_resourceDeviceIndex = LAYOUT.byteOffset(PathElement.groupElement("resourceDeviceIndex"));
    public static final long OFFSET_memoryDeviceIndex = LAYOUT.byteOffset(PathElement.groupElement("memoryDeviceIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_resourceDeviceIndex = LAYOUT.select(PathElement.groupElement("resourceDeviceIndex"));
    public static final MemoryLayout LAYOUT_memoryDeviceIndex = LAYOUT.select(PathElement.groupElement("memoryDeviceIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_resourceDeviceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceDeviceIndex"));
    public static final VarHandle VH_memoryDeviceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryDeviceIndex"));

    public VkDeviceGroupBindSparseInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupBindSparseInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupBindSparseInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupBindSparseInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupBindSparseInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupBindSparseInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupBindSparseInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupBindSparseInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupBindSparseInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO); }
    public static VkDeviceGroupBindSparseInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO);
        return s;
    }
    public VkDeviceGroupBindSparseInfo copyFrom(VkDeviceGroupBindSparseInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupBindSparseInfo reinterpret(long count) { return new VkDeviceGroupBindSparseInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupBindSparseInfo asSlice(long index) { return new VkDeviceGroupBindSparseInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupBindSparseInfo asSlice(long index, long count) { return new VkDeviceGroupBindSparseInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupBindSparseInfo at(long index, Consumer<VkDeviceGroupBindSparseInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int resourceDeviceIndexAt(long index) { return (int) VH_resourceDeviceIndex.get(this.segment(), 0L, index); }
    public int memoryDeviceIndexAt(long index) { return (int) VH_memoryDeviceIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int resourceDeviceIndex() { return (int) VH_resourceDeviceIndex.get(this.segment(), 0L, 0L); }
    public int memoryDeviceIndex() { return (int) VH_memoryDeviceIndex.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupBindSparseInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupBindSparseInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupBindSparseInfo resourceDeviceIndexAt(long index, int value) { VH_resourceDeviceIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupBindSparseInfo memoryDeviceIndexAt(long index, int value) { VH_memoryDeviceIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupBindSparseInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupBindSparseInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupBindSparseInfo resourceDeviceIndex(int value) { VH_resourceDeviceIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupBindSparseInfo memoryDeviceIndex(int value) { VH_memoryDeviceIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupBindSparseInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupBindSparseInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupBindSparseInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupBindSparseInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _resourceDeviceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resourceDeviceIndex, index), LAYOUT_resourceDeviceIndex); }
    public MemorySegment _resourceDeviceIndex() { return _resourceDeviceIndexAt(0L); }
    public VkDeviceGroupBindSparseInfo _resourceDeviceIndexAt(long index, MemorySegment src) { _resourceDeviceIndexAt(index).copyFrom(src); return this; }
    public VkDeviceGroupBindSparseInfo _resourceDeviceIndex(MemorySegment src) { return _resourceDeviceIndexAt(0L, src); }
    public MemorySegment _memoryDeviceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryDeviceIndex, index), LAYOUT_memoryDeviceIndex); }
    public MemorySegment _memoryDeviceIndex() { return _memoryDeviceIndexAt(0L); }
    public VkDeviceGroupBindSparseInfo _memoryDeviceIndexAt(long index, MemorySegment src) { _memoryDeviceIndexAt(index).copyFrom(src); return this; }
    public VkDeviceGroupBindSparseInfo _memoryDeviceIndex(MemorySegment src) { return _memoryDeviceIndexAt(0L, src); }
}
