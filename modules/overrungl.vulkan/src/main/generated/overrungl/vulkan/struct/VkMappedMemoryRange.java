// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMappedMemoryRange`.
/// ## Layout
/// ```
/// struct VkMappedMemoryRange {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceMemory memory;
///     VkDeviceSize offset;
///     VkDeviceSize size;
/// }
/// ```
public final class VkMappedMemoryRange extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkMappedMemoryRange(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMappedMemoryRange of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMappedMemoryRange(segment, estimateCount(segment, LAYOUT)); }
    public static VkMappedMemoryRange ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMappedMemoryRange(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMappedMemoryRange ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMappedMemoryRange(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMappedMemoryRange alloc(SegmentAllocator allocator) { return new VkMappedMemoryRange(allocator.allocate(LAYOUT), 1); }
    public static VkMappedMemoryRange alloc(SegmentAllocator allocator, long count) { return new VkMappedMemoryRange(allocator.allocate(LAYOUT, count), count); }
    public static VkMappedMemoryRange allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE); }
    public static VkMappedMemoryRange allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE);
        return s;
    }
    public VkMappedMemoryRange copyFrom(VkMappedMemoryRange src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMappedMemoryRange reinterpret(long count) { return new VkMappedMemoryRange(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMappedMemoryRange asSlice(long index) { return new VkMappedMemoryRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMappedMemoryRange asSlice(long index, long count) { return new VkMappedMemoryRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMappedMemoryRange at(long index, Consumer<VkMappedMemoryRange> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkMappedMemoryRange sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMappedMemoryRange pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMappedMemoryRange memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkMappedMemoryRange offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkMappedMemoryRange sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkMappedMemoryRange sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMappedMemoryRange pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMappedMemoryRange memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkMappedMemoryRange offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkMappedMemoryRange size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMappedMemoryRange _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMappedMemoryRange _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMappedMemoryRange _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMappedMemoryRange _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkMappedMemoryRange _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkMappedMemoryRange _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkMappedMemoryRange _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkMappedMemoryRange _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkMappedMemoryRange _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkMappedMemoryRange _size(MemorySegment src) { return _sizeAt(0L, src); }
}
