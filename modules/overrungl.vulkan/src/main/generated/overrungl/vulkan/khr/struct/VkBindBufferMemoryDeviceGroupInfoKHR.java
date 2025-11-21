// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindBufferMemoryDeviceGroupInfoKHR`.
/// ## Layout
/// ```
/// struct VkBindBufferMemoryDeviceGroupInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceIndexCount;
///     const uint32_t* pDeviceIndices;
/// }
/// ```
public final class VkBindBufferMemoryDeviceGroupInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceIndexCount = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
    public static final long OFFSET_pDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceIndexCount = LAYOUT.select(PathElement.groupElement("deviceIndexCount"));
    public static final MemoryLayout LAYOUT_pDeviceIndices = LAYOUT.select(PathElement.groupElement("pDeviceIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));

    public VkBindBufferMemoryDeviceGroupInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindBufferMemoryDeviceGroupInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindBufferMemoryDeviceGroupInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindBufferMemoryDeviceGroupInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindBufferMemoryDeviceGroupInfoKHR alloc(SegmentAllocator allocator) { return new VkBindBufferMemoryDeviceGroupInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkBindBufferMemoryDeviceGroupInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkBindBufferMemoryDeviceGroupInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkBindBufferMemoryDeviceGroupInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO); }
    public static VkBindBufferMemoryDeviceGroupInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO);
        return s;
    }
    public VkBindBufferMemoryDeviceGroupInfoKHR copyFrom(VkBindBufferMemoryDeviceGroupInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR reinterpret(long count) { return new VkBindBufferMemoryDeviceGroupInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindBufferMemoryDeviceGroupInfoKHR asSlice(long index) { return new VkBindBufferMemoryDeviceGroupInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindBufferMemoryDeviceGroupInfoKHR asSlice(long index, long count) { return new VkBindBufferMemoryDeviceGroupInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindBufferMemoryDeviceGroupInfoKHR at(long index, Consumer<VkBindBufferMemoryDeviceGroupInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceIndexCountAt(long index) { return (int) VH_deviceIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pDeviceIndicesAt(long index) { return (MemorySegment) VH_pDeviceIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceIndexCount() { return (int) VH_deviceIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDeviceIndices() { return (MemorySegment) VH_pDeviceIndices.get(this.segment(), 0L, 0L); }
    public VkBindBufferMemoryDeviceGroupInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR deviceIndexCountAt(long index, int value) { VH_deviceIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR pDeviceIndicesAt(long index, MemorySegment value) { VH_pDeviceIndices.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR deviceIndexCount(int value) { VH_deviceIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR pDeviceIndices(MemorySegment value) { VH_pDeviceIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindBufferMemoryDeviceGroupInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindBufferMemoryDeviceGroupInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceIndexCount, index), LAYOUT_deviceIndexCount); }
    public MemorySegment _deviceIndexCount() { return _deviceIndexCountAt(0L); }
    public VkBindBufferMemoryDeviceGroupInfoKHR _deviceIndexCountAt(long index, MemorySegment src) { _deviceIndexCountAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR _deviceIndexCount(MemorySegment src) { return _deviceIndexCountAt(0L, src); }
    public MemorySegment _pDeviceIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDeviceIndices, index), LAYOUT_pDeviceIndices); }
    public MemorySegment _pDeviceIndices() { return _pDeviceIndicesAt(0L); }
    public VkBindBufferMemoryDeviceGroupInfoKHR _pDeviceIndicesAt(long index, MemorySegment src) { _pDeviceIndicesAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryDeviceGroupInfoKHR _pDeviceIndices(MemorySegment src) { return _pDeviceIndicesAt(0L, src); }
}
