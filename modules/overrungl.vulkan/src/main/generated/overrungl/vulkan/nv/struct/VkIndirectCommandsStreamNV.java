// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsStreamNV`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsStreamNV {
///     VkBuffer buffer;
///     VkDeviceSize offset;
/// }
/// ```
public final class VkIndirectCommandsStreamNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset")
    );
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    public VkIndirectCommandsStreamNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsStreamNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsStreamNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsStreamNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsStreamNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsStreamNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsStreamNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsStreamNV alloc(SegmentAllocator allocator) { return new VkIndirectCommandsStreamNV(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsStreamNV alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsStreamNV(allocator.allocate(LAYOUT, count), count); }
    public VkIndirectCommandsStreamNV copyFrom(VkIndirectCommandsStreamNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsStreamNV reinterpret(long count) { return new VkIndirectCommandsStreamNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsStreamNV asSlice(long index) { return new VkIndirectCommandsStreamNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsStreamNV asSlice(long index, long count) { return new VkIndirectCommandsStreamNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsStreamNV at(long index, Consumer<VkIndirectCommandsStreamNV> func) { func.accept(asSlice(index)); return this; }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsStreamNV bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsStreamNV offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsStreamNV buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsStreamNV offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkIndirectCommandsStreamNV _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsStreamNV _buffer(MemorySegment src) { return _bufferAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkIndirectCommandsStreamNV _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsStreamNV _offset(MemorySegment src) { return _offsetAt(0L, src); }
}
