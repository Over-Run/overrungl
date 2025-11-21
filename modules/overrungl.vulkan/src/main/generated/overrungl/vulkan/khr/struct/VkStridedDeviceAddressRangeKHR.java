// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkStridedDeviceAddressRangeKHR`.
/// ## Layout
/// ```
/// struct VkStridedDeviceAddressRangeKHR {
///     VkDeviceAddress address;
///     VkDeviceSize size;
///     VkDeviceSize stride;
/// }
/// ```
public final class VkStridedDeviceAddressRangeKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    public static final long OFFSET_address = LAYOUT.byteOffset(PathElement.groupElement("address"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_address = LAYOUT.select(PathElement.groupElement("address"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final VarHandle VH_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("address"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    public VkStridedDeviceAddressRangeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkStridedDeviceAddressRangeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRangeKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkStridedDeviceAddressRangeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRangeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkStridedDeviceAddressRangeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRangeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkStridedDeviceAddressRangeKHR alloc(SegmentAllocator allocator) { return new VkStridedDeviceAddressRangeKHR(allocator.allocate(LAYOUT), 1); }
    public static VkStridedDeviceAddressRangeKHR alloc(SegmentAllocator allocator, long count) { return new VkStridedDeviceAddressRangeKHR(allocator.allocate(LAYOUT, count), count); }
    public VkStridedDeviceAddressRangeKHR copyFrom(VkStridedDeviceAddressRangeKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkStridedDeviceAddressRangeKHR reinterpret(long count) { return new VkStridedDeviceAddressRangeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkStridedDeviceAddressRangeKHR asSlice(long index) { return new VkStridedDeviceAddressRangeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkStridedDeviceAddressRangeKHR asSlice(long index, long count) { return new VkStridedDeviceAddressRangeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkStridedDeviceAddressRangeKHR at(long index, Consumer<VkStridedDeviceAddressRangeKHR> func) { func.accept(asSlice(index)); return this; }
    public long addressAt(long index) { return (long) VH_address.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public long strideAt(long index) { return (long) VH_stride.get(this.segment(), 0L, index); }
    public long address() { return (long) VH_address.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public long stride() { return (long) VH_stride.get(this.segment(), 0L, 0L); }
    public VkStridedDeviceAddressRangeKHR addressAt(long index, long value) { VH_address.set(this.segment(), 0L, index, value); return this; }
    public VkStridedDeviceAddressRangeKHR sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkStridedDeviceAddressRangeKHR strideAt(long index, long value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkStridedDeviceAddressRangeKHR address(long value) { VH_address.set(this.segment(), 0L, 0L, value); return this; }
    public VkStridedDeviceAddressRangeKHR size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkStridedDeviceAddressRangeKHR stride(long value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _addressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_address, index), LAYOUT_address); }
    public MemorySegment _address() { return _addressAt(0L); }
    public VkStridedDeviceAddressRangeKHR _addressAt(long index, MemorySegment src) { _addressAt(index).copyFrom(src); return this; }
    public VkStridedDeviceAddressRangeKHR _address(MemorySegment src) { return _addressAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkStridedDeviceAddressRangeKHR _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkStridedDeviceAddressRangeKHR _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkStridedDeviceAddressRangeKHR _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkStridedDeviceAddressRangeKHR _stride(MemorySegment src) { return _strideAt(0L, src); }
}
