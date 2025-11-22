// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceBufferAddressFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceBufferAddressFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 bufferDeviceAddress;
///     VkBool32 bufferDeviceAddressCaptureReplay;
///     VkBool32 bufferDeviceAddressMultiDevice;
/// }
/// ```
public final class VkPhysicalDeviceBufferAddressFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddress"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_bufferDeviceAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddress"));
    public static final long OFFSET_bufferDeviceAddressCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    public static final long OFFSET_bufferDeviceAddressMultiDevice = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_bufferDeviceAddress = LAYOUT.select(PathElement.groupElement("bufferDeviceAddress"));
    public static final MemoryLayout LAYOUT_bufferDeviceAddressCaptureReplay = LAYOUT.select(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    public static final MemoryLayout LAYOUT_bufferDeviceAddressMultiDevice = LAYOUT.select(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_bufferDeviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddress"));
    public static final VarHandle VH_bufferDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    public static final VarHandle VH_bufferDeviceAddressMultiDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));

    public VkPhysicalDeviceBufferAddressFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceBufferAddressFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferAddressFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceBufferAddressFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferAddressFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceBufferAddressFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferAddressFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceBufferAddressFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBufferAddressFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceBufferAddressFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceBufferAddressFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceBufferAddressFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTBufferDeviceAddress.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT); }
    public static VkPhysicalDeviceBufferAddressFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTBufferDeviceAddress.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceBufferAddressFeaturesEXT copyFrom(VkPhysicalDeviceBufferAddressFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceBufferAddressFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceBufferAddressFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceBufferAddressFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT at(long index, Consumer<VkPhysicalDeviceBufferAddressFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int bufferDeviceAddressAt(long index) { return (int) VH_bufferDeviceAddress.get(this.segment(), 0L, index); }
    public int bufferDeviceAddressCaptureReplayAt(long index) { return (int) VH_bufferDeviceAddressCaptureReplay.get(this.segment(), 0L, index); }
    public int bufferDeviceAddressMultiDeviceAt(long index) { return (int) VH_bufferDeviceAddressMultiDevice.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int bufferDeviceAddress() { return (int) VH_bufferDeviceAddress.get(this.segment(), 0L, 0L); }
    public int bufferDeviceAddressCaptureReplay() { return (int) VH_bufferDeviceAddressCaptureReplay.get(this.segment(), 0L, 0L); }
    public int bufferDeviceAddressMultiDevice() { return (int) VH_bufferDeviceAddressMultiDevice.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressAt(long index, int value) { VH_bufferDeviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressCaptureReplayAt(long index, int value) { VH_bufferDeviceAddressCaptureReplay.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressMultiDeviceAt(long index, int value) { VH_bufferDeviceAddressMultiDevice.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddress(int value) { VH_bufferDeviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressCaptureReplay(int value) { VH_bufferDeviceAddressCaptureReplay.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressMultiDevice(int value) { VH_bufferDeviceAddressMultiDevice.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _bufferDeviceAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferDeviceAddress, index), LAYOUT_bufferDeviceAddress); }
    public MemorySegment _bufferDeviceAddress() { return _bufferDeviceAddressAt(0L); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _bufferDeviceAddressAt(long index, MemorySegment src) { _bufferDeviceAddressAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _bufferDeviceAddress(MemorySegment src) { return _bufferDeviceAddressAt(0L, src); }
    public MemorySegment _bufferDeviceAddressCaptureReplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferDeviceAddressCaptureReplay, index), LAYOUT_bufferDeviceAddressCaptureReplay); }
    public MemorySegment _bufferDeviceAddressCaptureReplay() { return _bufferDeviceAddressCaptureReplayAt(0L); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _bufferDeviceAddressCaptureReplayAt(long index, MemorySegment src) { _bufferDeviceAddressCaptureReplayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _bufferDeviceAddressCaptureReplay(MemorySegment src) { return _bufferDeviceAddressCaptureReplayAt(0L, src); }
    public MemorySegment _bufferDeviceAddressMultiDeviceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferDeviceAddressMultiDevice, index), LAYOUT_bufferDeviceAddressMultiDevice); }
    public MemorySegment _bufferDeviceAddressMultiDevice() { return _bufferDeviceAddressMultiDeviceAt(0L); }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _bufferDeviceAddressMultiDeviceAt(long index, MemorySegment src) { _bufferDeviceAddressMultiDeviceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBufferAddressFeaturesEXT _bufferDeviceAddressMultiDevice(MemorySegment src) { return _bufferDeviceAddressMultiDeviceAt(0L, src); }
}
