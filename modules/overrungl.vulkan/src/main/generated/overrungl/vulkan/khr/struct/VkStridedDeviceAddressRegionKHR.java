// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkStridedDeviceAddressRegionKHR`.
/// ## Layout
/// ```
/// struct VkStridedDeviceAddressRegionKHR {
///     VkDeviceAddress deviceAddress;
///     VkDeviceSize stride;
///     VkDeviceSize size;
/// }
/// ```
public final class VkStridedDeviceAddressRegionKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("stride"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkStridedDeviceAddressRegionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkStridedDeviceAddressRegionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkStridedDeviceAddressRegionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkStridedDeviceAddressRegionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkStridedDeviceAddressRegionKHR alloc(SegmentAllocator allocator) { return new VkStridedDeviceAddressRegionKHR(allocator.allocate(LAYOUT), 1); }
    public static VkStridedDeviceAddressRegionKHR alloc(SegmentAllocator allocator, long count) { return new VkStridedDeviceAddressRegionKHR(allocator.allocate(LAYOUT, count), count); }
    public VkStridedDeviceAddressRegionKHR copyFrom(VkStridedDeviceAddressRegionKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkStridedDeviceAddressRegionKHR reinterpret(long count) { return new VkStridedDeviceAddressRegionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkStridedDeviceAddressRegionKHR asSlice(long index) { return new VkStridedDeviceAddressRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkStridedDeviceAddressRegionKHR asSlice(long index, long count) { return new VkStridedDeviceAddressRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkStridedDeviceAddressRegionKHR at(long index, Consumer<VkStridedDeviceAddressRegionKHR> func) { func.accept(asSlice(index)); return this; }
    public long deviceAddressAt(long index) { return (long) VH_deviceAddress.get(this.segment(), 0L, index); }
    public long strideAt(long index) { return (long) VH_stride.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public long deviceAddress() { return (long) VH_deviceAddress.get(this.segment(), 0L, 0L); }
    public long stride() { return (long) VH_stride.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkStridedDeviceAddressRegionKHR deviceAddressAt(long index, long value) { VH_deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkStridedDeviceAddressRegionKHR strideAt(long index, long value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkStridedDeviceAddressRegionKHR sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkStridedDeviceAddressRegionKHR deviceAddress(long value) { VH_deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkStridedDeviceAddressRegionKHR stride(long value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkStridedDeviceAddressRegionKHR size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _deviceAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceAddress, index), LAYOUT_deviceAddress); }
    public MemorySegment _deviceAddress() { return _deviceAddressAt(0L); }
    public VkStridedDeviceAddressRegionKHR _deviceAddressAt(long index, MemorySegment src) { _deviceAddressAt(index).copyFrom(src); return this; }
    public VkStridedDeviceAddressRegionKHR _deviceAddress(MemorySegment src) { return _deviceAddressAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkStridedDeviceAddressRegionKHR _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkStridedDeviceAddressRegionKHR _stride(MemorySegment src) { return _strideAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkStridedDeviceAddressRegionKHR _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkStridedDeviceAddressRegionKHR _size(MemorySegment src) { return _sizeAt(0L, src); }
}
