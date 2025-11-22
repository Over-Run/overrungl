// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryMapInfo`.
/// ## Layout
/// ```
/// struct VkMemoryMapInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkMemoryMapFlags flags;
///     VkDeviceMemory memory;
///     VkDeviceSize offset;
///     VkDeviceSize size;
/// }
/// ```
public final class VkMemoryMapInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkMemoryMapInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryMapInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryMapInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryMapInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryMapInfo alloc(SegmentAllocator allocator) { return new VkMemoryMapInfo(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryMapInfo alloc(SegmentAllocator allocator, long count) { return new VkMemoryMapInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryMapInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_MEMORY_MAP_INFO); }
    public static VkMemoryMapInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_MEMORY_MAP_INFO);
        return s;
    }
    public VkMemoryMapInfo copyFrom(VkMemoryMapInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryMapInfo reinterpret(long count) { return new VkMemoryMapInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryMapInfo asSlice(long index) { return new VkMemoryMapInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryMapInfo asSlice(long index, long count) { return new VkMemoryMapInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryMapInfo at(long index, Consumer<VkMemoryMapInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkMemoryMapInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapInfo memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapInfo offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapInfo sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMapInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMapInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMapInfo memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMapInfo offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMapInfo size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryMapInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryMapInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryMapInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryMapInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkMemoryMapInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkMemoryMapInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkMemoryMapInfo _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkMemoryMapInfo _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkMemoryMapInfo _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkMemoryMapInfo _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkMemoryMapInfo _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkMemoryMapInfo _size(MemorySegment src) { return _sizeAt(0L, src); }
}
