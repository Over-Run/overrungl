// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorBufferInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorBufferInfo {
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize range;
/// }
/// ```
public final class VkDescriptorBufferInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("range")
    );
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_range = LAYOUT.byteOffset(PathElement.groupElement("range"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_range = LAYOUT.select(PathElement.groupElement("range"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("range"));

    public VkDescriptorBufferInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorBufferInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorBufferInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorBufferInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorBufferInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorBufferInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorBufferInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorBufferInfo alloc(SegmentAllocator allocator) { return new VkDescriptorBufferInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorBufferInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorBufferInfo(allocator.allocate(LAYOUT, count), count); }
    public VkDescriptorBufferInfo copyFrom(VkDescriptorBufferInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorBufferInfo reinterpret(long count) { return new VkDescriptorBufferInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorBufferInfo asSlice(long index) { return new VkDescriptorBufferInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorBufferInfo asSlice(long index, long count) { return new VkDescriptorBufferInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorBufferInfo at(long index, Consumer<VkDescriptorBufferInfo> func) { func.accept(asSlice(index)); return this; }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long rangeAt(long index) { return (long) VH_range.get(this.segment(), 0L, index); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public long range() { return (long) VH_range.get(this.segment(), 0L, 0L); }
    public VkDescriptorBufferInfo bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorBufferInfo offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorBufferInfo rangeAt(long index, long value) { VH_range.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorBufferInfo buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorBufferInfo offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorBufferInfo range(long value) { VH_range.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkDescriptorBufferInfo _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkDescriptorBufferInfo _buffer(MemorySegment src) { return _bufferAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkDescriptorBufferInfo _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkDescriptorBufferInfo _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _rangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_range, index), LAYOUT_range); }
    public MemorySegment _range() { return _rangeAt(0L); }
    public VkDescriptorBufferInfo _rangeAt(long index, MemorySegment src) { _rangeAt(index).copyFrom(src); return this; }
    public VkDescriptorBufferInfo _range(MemorySegment src) { return _rangeAt(0L, src); }
}
