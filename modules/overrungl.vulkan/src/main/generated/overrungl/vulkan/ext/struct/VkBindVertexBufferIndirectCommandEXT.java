// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindVertexBufferIndirectCommandEXT`.
/// ## Layout
/// ```
/// struct VkBindVertexBufferIndirectCommandEXT {
///     VkDeviceAddress bufferAddress;
///     uint32_t size;
///     uint32_t stride;
/// }
/// ```
public final class VkBindVertexBufferIndirectCommandEXT extends GroupType {
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

    public VkBindVertexBufferIndirectCommandEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindVertexBufferIndirectCommandEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindVertexBufferIndirectCommandEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindVertexBufferIndirectCommandEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindVertexBufferIndirectCommandEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindVertexBufferIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkBindVertexBufferIndirectCommandEXT(allocator.allocate(LAYOUT), 1); }
    public static VkBindVertexBufferIndirectCommandEXT alloc(SegmentAllocator allocator, long count) { return new VkBindVertexBufferIndirectCommandEXT(allocator.allocate(LAYOUT, count), count); }
    public VkBindVertexBufferIndirectCommandEXT copyFrom(VkBindVertexBufferIndirectCommandEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindVertexBufferIndirectCommandEXT reinterpret(long count) { return new VkBindVertexBufferIndirectCommandEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindVertexBufferIndirectCommandEXT asSlice(long index) { return new VkBindVertexBufferIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindVertexBufferIndirectCommandEXT asSlice(long index, long count) { return new VkBindVertexBufferIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindVertexBufferIndirectCommandEXT at(long index, Consumer<VkBindVertexBufferIndirectCommandEXT> func) { func.accept(asSlice(index)); return this; }
    public long bufferAddressAt(long index) { return (long) VH_bufferAddress.get(this.segment(), 0L, index); }
    public int sizeAt(long index) { return (int) VH_size.get(this.segment(), 0L, index); }
    public int strideAt(long index) { return (int) VH_stride.get(this.segment(), 0L, index); }
    public long bufferAddress() { return (long) VH_bufferAddress.get(this.segment(), 0L, 0L); }
    public int size() { return (int) VH_size.get(this.segment(), 0L, 0L); }
    public int stride() { return (int) VH_stride.get(this.segment(), 0L, 0L); }
    public VkBindVertexBufferIndirectCommandEXT bufferAddressAt(long index, long value) { VH_bufferAddress.set(this.segment(), 0L, index, value); return this; }
    public VkBindVertexBufferIndirectCommandEXT sizeAt(long index, int value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkBindVertexBufferIndirectCommandEXT strideAt(long index, int value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkBindVertexBufferIndirectCommandEXT bufferAddress(long value) { VH_bufferAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindVertexBufferIndirectCommandEXT size(int value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindVertexBufferIndirectCommandEXT stride(int value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bufferAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferAddress, index), LAYOUT_bufferAddress); }
    public MemorySegment _bufferAddress() { return _bufferAddressAt(0L); }
    public VkBindVertexBufferIndirectCommandEXT _bufferAddressAt(long index, MemorySegment src) { _bufferAddressAt(index).copyFrom(src); return this; }
    public VkBindVertexBufferIndirectCommandEXT _bufferAddress(MemorySegment src) { return _bufferAddressAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkBindVertexBufferIndirectCommandEXT _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkBindVertexBufferIndirectCommandEXT _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkBindVertexBufferIndirectCommandEXT _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkBindVertexBufferIndirectCommandEXT _stride(MemorySegment src) { return _strideAt(0L, src); }
}
