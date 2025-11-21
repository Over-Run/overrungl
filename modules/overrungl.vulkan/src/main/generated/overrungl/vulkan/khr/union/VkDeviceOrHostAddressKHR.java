// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceOrHostAddressKHR`.
/// ## Layout
/// ```
/// union VkDeviceOrHostAddressKHR {
///     VkDeviceAddress deviceAddress;
///     void* hostAddress;
/// }
/// ```
public final class VkDeviceOrHostAddressKHR extends GroupType {
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

    public VkDeviceOrHostAddressKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceOrHostAddressKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceOrHostAddressKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceOrHostAddressKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceOrHostAddressKHR alloc(SegmentAllocator allocator) { return new VkDeviceOrHostAddressKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceOrHostAddressKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceOrHostAddressKHR(allocator.allocate(LAYOUT, count), count); }
    public VkDeviceOrHostAddressKHR copyFrom(VkDeviceOrHostAddressKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceOrHostAddressKHR reinterpret(long count) { return new VkDeviceOrHostAddressKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceOrHostAddressKHR asSlice(long index) { return new VkDeviceOrHostAddressKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceOrHostAddressKHR asSlice(long index, long count) { return new VkDeviceOrHostAddressKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceOrHostAddressKHR at(long index, Consumer<VkDeviceOrHostAddressKHR> func) { func.accept(asSlice(index)); return this; }
    public long deviceAddressAt(long index) { return (long) VH_deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment hostAddressAt(long index) { return (MemorySegment) VH_hostAddress.get(this.segment(), 0L, index); }
    public long deviceAddress() { return (long) VH_deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment hostAddress() { return (MemorySegment) VH_hostAddress.get(this.segment(), 0L, 0L); }
    public VkDeviceOrHostAddressKHR deviceAddressAt(long index, long value) { VH_deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceOrHostAddressKHR hostAddressAt(long index, MemorySegment value) { VH_hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceOrHostAddressKHR deviceAddress(long value) { VH_deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceOrHostAddressKHR hostAddress(MemorySegment value) { VH_hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _deviceAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceAddress, index), LAYOUT_deviceAddress); }
    public MemorySegment _deviceAddress() { return _deviceAddressAt(0L); }
    public VkDeviceOrHostAddressKHR _deviceAddressAt(long index, MemorySegment src) { _deviceAddressAt(index).copyFrom(src); return this; }
    public VkDeviceOrHostAddressKHR _deviceAddress(MemorySegment src) { return _deviceAddressAt(0L, src); }
    public MemorySegment _hostAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hostAddress, index), LAYOUT_hostAddress); }
    public MemorySegment _hostAddress() { return _hostAddressAt(0L); }
    public VkDeviceOrHostAddressKHR _hostAddressAt(long index, MemorySegment src) { _hostAddressAt(index).copyFrom(src); return this; }
    public VkDeviceOrHostAddressKHR _hostAddress(MemorySegment src) { return _hostAddressAt(0L, src); }
}
