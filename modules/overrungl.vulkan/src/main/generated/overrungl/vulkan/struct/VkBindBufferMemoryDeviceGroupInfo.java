// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindBufferMemoryDeviceGroupInfo`.
/// ## Layout
/// ```
/// struct VkBindBufferMemoryDeviceGroupInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceIndexCount;
///     const uint32_t* pDeviceIndices;
/// }
/// ```
public final class VkBindBufferMemoryDeviceGroupInfo extends GroupType {
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

    public VkBindBufferMemoryDeviceGroupInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindBufferMemoryDeviceGroupInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindBufferMemoryDeviceGroupInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindBufferMemoryDeviceGroupInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindBufferMemoryDeviceGroupInfo alloc(SegmentAllocator allocator) { return new VkBindBufferMemoryDeviceGroupInfo(allocator.allocate(LAYOUT), 1); }
    public static VkBindBufferMemoryDeviceGroupInfo alloc(SegmentAllocator allocator, long count) { return new VkBindBufferMemoryDeviceGroupInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkBindBufferMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO); }
    public static VkBindBufferMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO);
        return s;
    }
    public VkBindBufferMemoryDeviceGroupInfo copyFrom(VkBindBufferMemoryDeviceGroupInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindBufferMemoryDeviceGroupInfo reinterpret(long count) { return new VkBindBufferMemoryDeviceGroupInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindBufferMemoryDeviceGroupInfo asSlice(long index) { return new VkBindBufferMemoryDeviceGroupInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindBufferMemoryDeviceGroupInfo asSlice(long index, long count) { return new VkBindBufferMemoryDeviceGroupInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindBufferMemoryDeviceGroupInfo at(long index, Consumer<VkBindBufferMemoryDeviceGroupInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceIndexCountAt(long index) { return (int) VH_deviceIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pDeviceIndicesAt(long index) { return (MemorySegment) VH_pDeviceIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceIndexCount() { return (int) VH_deviceIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDeviceIndices() { return (MemorySegment) VH_pDeviceIndices.get(this.segment(), 0L, 0L); }
    public VkBindBufferMemoryDeviceGroupInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfo deviceIndexCountAt(long index, int value) { VH_deviceIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndicesAt(long index, MemorySegment value) { VH_pDeviceIndices.set(this.segment(), 0L, index, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfo deviceIndexCount(int value) { VH_deviceIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndices(MemorySegment value) { VH_pDeviceIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindBufferMemoryDeviceGroupInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryDeviceGroupInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindBufferMemoryDeviceGroupInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryDeviceGroupInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceIndexCount, index), LAYOUT_deviceIndexCount); }
    public MemorySegment _deviceIndexCount() { return _deviceIndexCountAt(0L); }
    public VkBindBufferMemoryDeviceGroupInfo _deviceIndexCountAt(long index, MemorySegment src) { _deviceIndexCountAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryDeviceGroupInfo _deviceIndexCount(MemorySegment src) { return _deviceIndexCountAt(0L, src); }
    public MemorySegment _pDeviceIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDeviceIndices, index), LAYOUT_pDeviceIndices); }
    public MemorySegment _pDeviceIndices() { return _pDeviceIndicesAt(0L); }
    public VkBindBufferMemoryDeviceGroupInfo _pDeviceIndicesAt(long index, MemorySegment src) { _pDeviceIndicesAt(index).copyFrom(src); return this; }
    public VkBindBufferMemoryDeviceGroupInfo _pDeviceIndices(MemorySegment src) { return _pDeviceIndicesAt(0L, src); }
}
