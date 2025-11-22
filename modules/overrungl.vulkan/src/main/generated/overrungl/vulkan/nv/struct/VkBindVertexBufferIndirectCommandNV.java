// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindVertexBufferIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkBindVertexBufferIndirectCommandNV {
///     VkDeviceAddress bufferAddress;
///     uint32_t size;
///     uint32_t stride;
/// }
/// ```
public final class VkBindVertexBufferIndirectCommandNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("stride")
    );
    public static final long OFFSET_bufferAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_bufferAddress = LAYOUT.select(PathElement.groupElement("bufferAddress"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    public VkBindVertexBufferIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindVertexBufferIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindVertexBufferIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindVertexBufferIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindVertexBufferIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindVertexBufferIndirectCommandNV(allocator.allocate(LAYOUT), 1); }
    public static VkBindVertexBufferIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBindVertexBufferIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }
    public VkBindVertexBufferIndirectCommandNV copyFrom(VkBindVertexBufferIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindVertexBufferIndirectCommandNV reinterpret(long count) { return new VkBindVertexBufferIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindVertexBufferIndirectCommandNV asSlice(long index) { return new VkBindVertexBufferIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindVertexBufferIndirectCommandNV asSlice(long index, long count) { return new VkBindVertexBufferIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindVertexBufferIndirectCommandNV at(long index, Consumer<VkBindVertexBufferIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }
    public long bufferAddressAt(long index) { return (long) VH_bufferAddress.get(this.segment(), 0L, index); }
    public int sizeAt(long index) { return (int) VH_size.get(this.segment(), 0L, index); }
    public int strideAt(long index) { return (int) VH_stride.get(this.segment(), 0L, index); }
    public long bufferAddress() { return (long) VH_bufferAddress.get(this.segment(), 0L, 0L); }
    public int size() { return (int) VH_size.get(this.segment(), 0L, 0L); }
    public int stride() { return (int) VH_stride.get(this.segment(), 0L, 0L); }
    public VkBindVertexBufferIndirectCommandNV bufferAddressAt(long index, long value) { VH_bufferAddress.set(this.segment(), 0L, index, value); return this; }
    public VkBindVertexBufferIndirectCommandNV sizeAt(long index, int value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkBindVertexBufferIndirectCommandNV strideAt(long index, int value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkBindVertexBufferIndirectCommandNV bufferAddress(long value) { VH_bufferAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindVertexBufferIndirectCommandNV size(int value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindVertexBufferIndirectCommandNV stride(int value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bufferAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferAddress, index), LAYOUT_bufferAddress); }
    public MemorySegment _bufferAddress() { return _bufferAddressAt(0L); }
    public VkBindVertexBufferIndirectCommandNV _bufferAddressAt(long index, MemorySegment src) { _bufferAddressAt(index).copyFrom(src); return this; }
    public VkBindVertexBufferIndirectCommandNV _bufferAddress(MemorySegment src) { return _bufferAddressAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkBindVertexBufferIndirectCommandNV _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkBindVertexBufferIndirectCommandNV _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkBindVertexBufferIndirectCommandNV _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkBindVertexBufferIndirectCommandNV _stride(MemorySegment src) { return _strideAt(0L, src); }
}
