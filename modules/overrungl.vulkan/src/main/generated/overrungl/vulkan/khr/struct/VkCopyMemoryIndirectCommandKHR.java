// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMemoryIndirectCommandKHR`.
/// ## Layout
/// ```
/// struct VkCopyMemoryIndirectCommandKHR {
///     VkDeviceAddress srcAddress;
///     VkDeviceAddress dstAddress;
///     VkDeviceSize size;
/// }
/// ```
public final class VkCopyMemoryIndirectCommandKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_srcAddress = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
    public static final long OFFSET_dstAddress = LAYOUT.byteOffset(PathElement.groupElement("dstAddress"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_srcAddress = LAYOUT.select(PathElement.groupElement("srcAddress"));
    public static final MemoryLayout LAYOUT_dstAddress = LAYOUT.select(PathElement.groupElement("dstAddress"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_srcAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress"));
    public static final VarHandle VH_dstAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddress"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkCopyMemoryIndirectCommandKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyMemoryIndirectCommandKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyMemoryIndirectCommandKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyMemoryIndirectCommandKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyMemoryIndirectCommandKHR alloc(SegmentAllocator allocator) { return new VkCopyMemoryIndirectCommandKHR(allocator.allocate(LAYOUT), 1); }
    public static VkCopyMemoryIndirectCommandKHR alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryIndirectCommandKHR(allocator.allocate(LAYOUT, count), count); }
    public VkCopyMemoryIndirectCommandKHR copyFrom(VkCopyMemoryIndirectCommandKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyMemoryIndirectCommandKHR reinterpret(long count) { return new VkCopyMemoryIndirectCommandKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyMemoryIndirectCommandKHR asSlice(long index) { return new VkCopyMemoryIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyMemoryIndirectCommandKHR asSlice(long index, long count) { return new VkCopyMemoryIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyMemoryIndirectCommandKHR at(long index, Consumer<VkCopyMemoryIndirectCommandKHR> func) { func.accept(asSlice(index)); return this; }
    public long srcAddressAt(long index) { return (long) VH_srcAddress.get(this.segment(), 0L, index); }
    public long dstAddressAt(long index) { return (long) VH_dstAddress.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public long srcAddress() { return (long) VH_srcAddress.get(this.segment(), 0L, 0L); }
    public long dstAddress() { return (long) VH_dstAddress.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkCopyMemoryIndirectCommandKHR srcAddressAt(long index, long value) { VH_srcAddress.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectCommandKHR dstAddressAt(long index, long value) { VH_dstAddress.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectCommandKHR sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectCommandKHR srcAddress(long value) { VH_srcAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectCommandKHR dstAddress(long value) { VH_dstAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectCommandKHR size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _srcAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAddress, index), LAYOUT_srcAddress); }
    public MemorySegment _srcAddress() { return _srcAddressAt(0L); }
    public VkCopyMemoryIndirectCommandKHR _srcAddressAt(long index, MemorySegment src) { _srcAddressAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectCommandKHR _srcAddress(MemorySegment src) { return _srcAddressAt(0L, src); }
    public MemorySegment _dstAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAddress, index), LAYOUT_dstAddress); }
    public MemorySegment _dstAddress() { return _dstAddressAt(0L); }
    public VkCopyMemoryIndirectCommandKHR _dstAddressAt(long index, MemorySegment src) { _dstAddressAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectCommandKHR _dstAddress(MemorySegment src) { return _dstAddressAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkCopyMemoryIndirectCommandKHR _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectCommandKHR _size(MemorySegment src) { return _sizeAt(0L, src); }
}
