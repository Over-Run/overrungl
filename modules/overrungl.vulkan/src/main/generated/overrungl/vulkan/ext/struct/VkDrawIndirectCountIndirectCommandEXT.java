// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrawIndirectCountIndirectCommandEXT`.
/// ## Layout
/// ```
/// struct VkDrawIndirectCountIndirectCommandEXT {
///     VkDeviceAddress bufferAddress;
///     uint32_t stride;
///     uint32_t commandCount;
/// }
/// ```
public final class VkDrawIndirectCountIndirectCommandEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("commandCount")
    );
    public static final long OFFSET_bufferAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final long OFFSET_commandCount = LAYOUT.byteOffset(PathElement.groupElement("commandCount"));
    public static final MemoryLayout LAYOUT_bufferAddress = LAYOUT.select(PathElement.groupElement("bufferAddress"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_commandCount = LAYOUT.select(PathElement.groupElement("commandCount"));
    public static final VarHandle VH_bufferAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferAddress"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    public static final VarHandle VH_commandCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandCount"));

    public VkDrawIndirectCountIndirectCommandEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDrawIndirectCountIndirectCommandEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCountIndirectCommandEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDrawIndirectCountIndirectCommandEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCountIndirectCommandEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDrawIndirectCountIndirectCommandEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawIndirectCountIndirectCommandEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDrawIndirectCountIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkDrawIndirectCountIndirectCommandEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDrawIndirectCountIndirectCommandEXT alloc(SegmentAllocator allocator, long count) { return new VkDrawIndirectCountIndirectCommandEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDrawIndirectCountIndirectCommandEXT copyFrom(VkDrawIndirectCountIndirectCommandEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDrawIndirectCountIndirectCommandEXT reinterpret(long count) { return new VkDrawIndirectCountIndirectCommandEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDrawIndirectCountIndirectCommandEXT asSlice(long index) { return new VkDrawIndirectCountIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDrawIndirectCountIndirectCommandEXT asSlice(long index, long count) { return new VkDrawIndirectCountIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDrawIndirectCountIndirectCommandEXT at(long index, Consumer<VkDrawIndirectCountIndirectCommandEXT> func) { func.accept(asSlice(index)); return this; }
    public long bufferAddressAt(long index) { return (long) VH_bufferAddress.get(this.segment(), 0L, index); }
    public int strideAt(long index) { return (int) VH_stride.get(this.segment(), 0L, index); }
    public int commandCountAt(long index) { return (int) VH_commandCount.get(this.segment(), 0L, index); }
    public long bufferAddress() { return (long) VH_bufferAddress.get(this.segment(), 0L, 0L); }
    public int stride() { return (int) VH_stride.get(this.segment(), 0L, 0L); }
    public int commandCount() { return (int) VH_commandCount.get(this.segment(), 0L, 0L); }
    public VkDrawIndirectCountIndirectCommandEXT bufferAddressAt(long index, long value) { VH_bufferAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndirectCountIndirectCommandEXT strideAt(long index, int value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndirectCountIndirectCommandEXT commandCountAt(long index, int value) { VH_commandCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrawIndirectCountIndirectCommandEXT bufferAddress(long value) { VH_bufferAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndirectCountIndirectCommandEXT stride(int value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawIndirectCountIndirectCommandEXT commandCount(int value) { VH_commandCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bufferAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferAddress, index), LAYOUT_bufferAddress); }
    public MemorySegment _bufferAddress() { return _bufferAddressAt(0L); }
    public VkDrawIndirectCountIndirectCommandEXT _bufferAddressAt(long index, MemorySegment src) { _bufferAddressAt(index).copyFrom(src); return this; }
    public VkDrawIndirectCountIndirectCommandEXT _bufferAddress(MemorySegment src) { return _bufferAddressAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkDrawIndirectCountIndirectCommandEXT _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkDrawIndirectCountIndirectCommandEXT _stride(MemorySegment src) { return _strideAt(0L, src); }
    public MemorySegment _commandCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_commandCount, index), LAYOUT_commandCount); }
    public MemorySegment _commandCount() { return _commandCountAt(0L); }
    public VkDrawIndirectCountIndirectCommandEXT _commandCountAt(long index, MemorySegment src) { _commandCountAt(index).copyFrom(src); return this; }
    public VkDrawIndirectCountIndirectCommandEXT _commandCount(MemorySegment src) { return _commandCountAt(0L, src); }
}
