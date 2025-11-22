// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindBufferMemoryInfo`.
/// ## Layout
/// ```
/// struct VkBindBufferMemoryInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkBuffer buffer;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
/// }
/// ```
public final class VkBindBufferMemoryInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));

    public VkBindBufferMemoryInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindBufferMemoryInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindBufferMemoryInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindBufferMemoryInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindBufferMemoryInfo alloc(SegmentAllocator allocator) { return new VkBindBufferMemoryInfo(allocator.allocate(LAYOUT), 1); }
    public static VkBindBufferMemoryInfo alloc(SegmentAllocator allocator, long count) { return new VkBindBufferMemoryInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkBindBufferMemoryInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO); }
    public static VkBindBufferMemoryInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO);
        return s;
    }
    public VkBindBufferMemoryInfo copyFrom(VkBindBufferMemoryInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindBufferMemoryInfo reinterpret(long count) { return new VkBindBufferMemoryInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindBufferMemoryInfo asSlice(long index) { return new VkBindBufferMemoryInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindBufferMemoryInfo asSlice(long index, long count) { return new VkBindBufferMemoryInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindBufferMemoryInfo at(long index, Consumer<VkBindBufferMemoryInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long memoryOffsetAt(long index) { return (long) VH_memoryOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long memoryOffset() { return (long) VH_memoryOffset.get(this.segment(), 0L, 0L); }
    public VkBindBufferMemoryInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryInfo bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryInfo memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryInfo memoryOffsetAt(long index, long value) { VH_memoryOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryInfo buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryInfo memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryInfo memoryOffset(long value) { VH_memoryOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindBufferMemoryInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindBufferMemoryInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkBindBufferMemoryInfo _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryInfo _buffer(MemorySegment src) { return _bufferAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkBindBufferMemoryInfo _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryInfo _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _memoryOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryOffset, index), LAYOUT_memoryOffset); }
    public MemorySegment _memoryOffset() { return _memoryOffsetAt(0L); }
    public VkBindBufferMemoryInfo _memoryOffsetAt(long index, MemorySegment src) { _memoryOffsetAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryInfo _memoryOffset(MemorySegment src) { return _memoryOffsetAt(0L, src); }
}
