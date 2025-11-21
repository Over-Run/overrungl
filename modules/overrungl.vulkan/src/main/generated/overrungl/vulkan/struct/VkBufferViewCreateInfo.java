// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferViewCreateInfo`.
/// ## Layout
/// ```
/// struct VkBufferViewCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkBufferViewCreateFlags flags;
///     VkBuffer buffer;
///     VkFormat format;
///     VkDeviceSize offset;
///     VkDeviceSize range;
/// }
/// ```
public final class VkBufferViewCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("range")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_range = LAYOUT.byteOffset(PathElement.groupElement("range"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_range = LAYOUT.select(PathElement.groupElement("range"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("range"));

    public VkBufferViewCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferViewCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferViewCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferViewCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferViewCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferViewCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferViewCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferViewCreateInfo alloc(SegmentAllocator allocator) { return new VkBufferViewCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkBufferViewCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkBufferViewCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferViewCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO); }
    public static VkBufferViewCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO);
        return s;
    }
    public VkBufferViewCreateInfo copyFrom(VkBufferViewCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferViewCreateInfo reinterpret(long count) { return new VkBufferViewCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferViewCreateInfo asSlice(long index) { return new VkBufferViewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferViewCreateInfo asSlice(long index, long count) { return new VkBufferViewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferViewCreateInfo at(long index, Consumer<VkBufferViewCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long rangeAt(long index) { return (long) VH_range.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public long range() { return (long) VH_range.get(this.segment(), 0L, 0L); }
    public VkBufferViewCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferViewCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferViewCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkBufferViewCreateInfo bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkBufferViewCreateInfo formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkBufferViewCreateInfo offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferViewCreateInfo rangeAt(long index, long value) { VH_range.set(this.segment(), 0L, index, value); return this; }
    public VkBufferViewCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferViewCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferViewCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferViewCreateInfo buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferViewCreateInfo format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferViewCreateInfo offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferViewCreateInfo range(long value) { VH_range.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferViewCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferViewCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferViewCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferViewCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkBufferViewCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkBufferViewCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkBufferViewCreateInfo _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkBufferViewCreateInfo _buffer(MemorySegment src) { return _bufferAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkBufferViewCreateInfo _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkBufferViewCreateInfo _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkBufferViewCreateInfo _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkBufferViewCreateInfo _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _rangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_range, index), LAYOUT_range); }
    public MemorySegment _range() { return _rangeAt(0L); }
    public VkBufferViewCreateInfo _rangeAt(long index, MemorySegment src) { _rangeAt(index).copyFrom(src); return this; }
    public VkBufferViewCreateInfo _range(MemorySegment src) { return _rangeAt(0L, src); }
}
