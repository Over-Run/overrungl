// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceOrHostAddressConstKHR`.
/// ## Layout
/// ```
/// union VkDeviceOrHostAddressConstKHR {
///     VkDeviceAddress deviceAddress;
///     const void* hostAddress;
/// }
/// ```
public final class VkDeviceOrHostAddressConstKHR extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    public static final long OFFSET_hostAddress = LAYOUT.byteOffset(PathElement.groupElement("hostAddress"));
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    public static final MemoryLayout LAYOUT_hostAddress = LAYOUT.select(PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostAddress"));

    public VkDeviceOrHostAddressConstKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceOrHostAddressConstKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceOrHostAddressConstKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceOrHostAddressConstKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceOrHostAddressConstKHR alloc(SegmentAllocator allocator) { return new VkDeviceOrHostAddressConstKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceOrHostAddressConstKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceOrHostAddressConstKHR(allocator.allocate(LAYOUT, count), count); }
    public VkDeviceOrHostAddressConstKHR copyFrom(VkDeviceOrHostAddressConstKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceOrHostAddressConstKHR reinterpret(long count) { return new VkDeviceOrHostAddressConstKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceOrHostAddressConstKHR asSlice(long index) { return new VkDeviceOrHostAddressConstKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceOrHostAddressConstKHR asSlice(long index, long count) { return new VkDeviceOrHostAddressConstKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceOrHostAddressConstKHR at(long index, Consumer<VkDeviceOrHostAddressConstKHR> func) { func.accept(asSlice(index)); return this; }
    public long deviceAddressAt(long index) { return (long) VH_deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment hostAddressAt(long index) { return (MemorySegment) VH_hostAddress.get(this.segment(), 0L, index); }
    public long deviceAddress() { return (long) VH_deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment hostAddress() { return (MemorySegment) VH_hostAddress.get(this.segment(), 0L, 0L); }
    public VkDeviceOrHostAddressConstKHR deviceAddressAt(long index, long value) { VH_deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceOrHostAddressConstKHR hostAddressAt(long index, MemorySegment value) { VH_hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceOrHostAddressConstKHR deviceAddress(long value) { VH_deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceOrHostAddressConstKHR hostAddress(MemorySegment value) { VH_hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _deviceAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceAddress, index), LAYOUT_deviceAddress); }
    public MemorySegment _deviceAddress() { return _deviceAddressAt(0L); }
    public VkDeviceOrHostAddressConstKHR _deviceAddressAt(long index, MemorySegment src) { _deviceAddressAt(index).copyFrom(src); return this; }
    public VkDeviceOrHostAddressConstKHR _deviceAddress(MemorySegment src) { return _deviceAddressAt(0L, src); }
    public MemorySegment _hostAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hostAddress, index), LAYOUT_hostAddress); }
    public MemorySegment _hostAddress() { return _hostAddressAt(0L); }
    public VkDeviceOrHostAddressConstKHR _hostAddressAt(long index, MemorySegment src) { _hostAddressAt(index).copyFrom(src); return this; }
    public VkDeviceOrHostAddressConstKHR _hostAddress(MemorySegment src) { return _hostAddressAt(0L, src); }
}
