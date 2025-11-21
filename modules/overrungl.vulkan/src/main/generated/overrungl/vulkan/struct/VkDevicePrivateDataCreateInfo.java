// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDevicePrivateDataCreateInfo`.
/// ## Layout
/// ```
/// struct VkDevicePrivateDataCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t privateDataSlotRequestCount;
/// }
/// ```
public final class VkDevicePrivateDataCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("privateDataSlotRequestCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_privateDataSlotRequestCount = LAYOUT.byteOffset(PathElement.groupElement("privateDataSlotRequestCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_privateDataSlotRequestCount = LAYOUT.select(PathElement.groupElement("privateDataSlotRequestCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_privateDataSlotRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("privateDataSlotRequestCount"));

    public VkDevicePrivateDataCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDevicePrivateDataCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePrivateDataCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDevicePrivateDataCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePrivateDataCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDevicePrivateDataCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDevicePrivateDataCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDevicePrivateDataCreateInfo alloc(SegmentAllocator allocator) { return new VkDevicePrivateDataCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDevicePrivateDataCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDevicePrivateDataCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDevicePrivateDataCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO); }
    public static VkDevicePrivateDataCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO);
        return s;
    }
    public VkDevicePrivateDataCreateInfo copyFrom(VkDevicePrivateDataCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDevicePrivateDataCreateInfo reinterpret(long count) { return new VkDevicePrivateDataCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDevicePrivateDataCreateInfo asSlice(long index) { return new VkDevicePrivateDataCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDevicePrivateDataCreateInfo asSlice(long index, long count) { return new VkDevicePrivateDataCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDevicePrivateDataCreateInfo at(long index, Consumer<VkDevicePrivateDataCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int privateDataSlotRequestCountAt(long index) { return (int) VH_privateDataSlotRequestCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int privateDataSlotRequestCount() { return (int) VH_privateDataSlotRequestCount.get(this.segment(), 0L, 0L); }
    public VkDevicePrivateDataCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDevicePrivateDataCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDevicePrivateDataCreateInfo privateDataSlotRequestCountAt(long index, int value) { VH_privateDataSlotRequestCount.set(this.segment(), 0L, index, value); return this; }
    public VkDevicePrivateDataCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDevicePrivateDataCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDevicePrivateDataCreateInfo privateDataSlotRequestCount(int value) { VH_privateDataSlotRequestCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDevicePrivateDataCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDevicePrivateDataCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDevicePrivateDataCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDevicePrivateDataCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _privateDataSlotRequestCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_privateDataSlotRequestCount, index), LAYOUT_privateDataSlotRequestCount); }
    public MemorySegment _privateDataSlotRequestCount() { return _privateDataSlotRequestCountAt(0L); }
    public VkDevicePrivateDataCreateInfo _privateDataSlotRequestCountAt(long index, MemorySegment src) { _privateDataSlotRequestCountAt(index).copyFrom(src); return this; }
    public VkDevicePrivateDataCreateInfo _privateDataSlotRequestCount(MemorySegment src) { return _privateDataSlotRequestCountAt(0L, src); }
}
