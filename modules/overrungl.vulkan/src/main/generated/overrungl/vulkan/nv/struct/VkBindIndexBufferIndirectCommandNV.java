// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindIndexBufferIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkBindIndexBufferIndirectCommandNV {
///     VkDeviceAddress bufferAddress;
///     uint32_t size;
///     VkIndexType indexType;
/// }
/// ```
public final class VkBindIndexBufferIndirectCommandNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("indexType")
    );
    public static final long OFFSET_bufferAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    public static final MemoryLayout LAYOUT_bufferAddress = LAYOUT.select(PathElement.groupElement("bufferAddress"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));

    public VkBindIndexBufferIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindIndexBufferIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindIndexBufferIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindIndexBufferIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindIndexBufferIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindIndexBufferIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindIndexBufferIndirectCommandNV(allocator.allocate(LAYOUT), 1); }
    public static VkBindIndexBufferIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBindIndexBufferIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }
    public VkBindIndexBufferIndirectCommandNV copyFrom(VkBindIndexBufferIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindIndexBufferIndirectCommandNV reinterpret(long count) { return new VkBindIndexBufferIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindIndexBufferIndirectCommandNV asSlice(long index) { return new VkBindIndexBufferIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindIndexBufferIndirectCommandNV asSlice(long index, long count) { return new VkBindIndexBufferIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindIndexBufferIndirectCommandNV at(long index, Consumer<VkBindIndexBufferIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }
    public long bufferAddressAt(long index) { return (long) VH_bufferAddress.get(this.segment(), 0L, index); }
    public int sizeAt(long index) { return (int) VH_size.get(this.segment(), 0L, index); }
    public int indexTypeAt(long index) { return (int) VH_indexType.get(this.segment(), 0L, index); }
    public long bufferAddress() { return (long) VH_bufferAddress.get(this.segment(), 0L, 0L); }
    public int size() { return (int) VH_size.get(this.segment(), 0L, 0L); }
    public int indexType() { return (int) VH_indexType.get(this.segment(), 0L, 0L); }
    public VkBindIndexBufferIndirectCommandNV bufferAddressAt(long index, long value) { VH_bufferAddress.set(this.segment(), 0L, index, value); return this; }
    public VkBindIndexBufferIndirectCommandNV sizeAt(long index, int value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkBindIndexBufferIndirectCommandNV indexTypeAt(long index, int value) { VH_indexType.set(this.segment(), 0L, index, value); return this; }
    public VkBindIndexBufferIndirectCommandNV bufferAddress(long value) { VH_bufferAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindIndexBufferIndirectCommandNV size(int value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindIndexBufferIndirectCommandNV indexType(int value) { VH_indexType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bufferAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferAddress, index), LAYOUT_bufferAddress); }
    public MemorySegment _bufferAddress() { return _bufferAddressAt(0L); }
    public VkBindIndexBufferIndirectCommandNV _bufferAddressAt(long index, MemorySegment src) { _bufferAddressAt(index).copyFrom(src); return this; }
    public VkBindIndexBufferIndirectCommandNV _bufferAddress(MemorySegment src) { return _bufferAddressAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkBindIndexBufferIndirectCommandNV _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkBindIndexBufferIndirectCommandNV _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _indexTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexType, index), LAYOUT_indexType); }
    public MemorySegment _indexType() { return _indexTypeAt(0L); }
    public VkBindIndexBufferIndirectCommandNV _indexTypeAt(long index, MemorySegment src) { _indexTypeAt(index).copyFrom(src); return this; }
    public VkBindIndexBufferIndirectCommandNV _indexType(MemorySegment src) { return _indexTypeAt(0L, src); }
}
