// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupCommandBufferBeginInfo`.
/// ## Layout
/// ```
/// struct VkDeviceGroupCommandBufferBeginInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceMask;
/// }
/// ```
public final class VkDeviceGroupCommandBufferBeginInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceMask = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceMask = LAYOUT.select(PathElement.groupElement("deviceMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    public VkDeviceGroupCommandBufferBeginInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupCommandBufferBeginInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupCommandBufferBeginInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupCommandBufferBeginInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupCommandBufferBeginInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupCommandBufferBeginInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupCommandBufferBeginInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupCommandBufferBeginInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupCommandBufferBeginInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupCommandBufferBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupCommandBufferBeginInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupCommandBufferBeginInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO); }
    public static VkDeviceGroupCommandBufferBeginInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO);
        return s;
    }
    public VkDeviceGroupCommandBufferBeginInfo copyFrom(VkDeviceGroupCommandBufferBeginInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupCommandBufferBeginInfo reinterpret(long count) { return new VkDeviceGroupCommandBufferBeginInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupCommandBufferBeginInfo asSlice(long index) { return new VkDeviceGroupCommandBufferBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupCommandBufferBeginInfo asSlice(long index, long count) { return new VkDeviceGroupCommandBufferBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupCommandBufferBeginInfo at(long index, Consumer<VkDeviceGroupCommandBufferBeginInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceMaskAt(long index) { return (int) VH_deviceMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceMask() { return (int) VH_deviceMask.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupCommandBufferBeginInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfo deviceMaskAt(long index, int value) { VH_deviceMask.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupCommandBufferBeginInfo deviceMask(int value) { VH_deviceMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupCommandBufferBeginInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupCommandBufferBeginInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupCommandBufferBeginInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupCommandBufferBeginInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceMask, index), LAYOUT_deviceMask); }
    public MemorySegment _deviceMask() { return _deviceMaskAt(0L); }
    public VkDeviceGroupCommandBufferBeginInfo _deviceMaskAt(long index, MemorySegment src) { _deviceMaskAt(index).copyFrom(src); return this; }
    public VkDeviceGroupCommandBufferBeginInfo _deviceMask(MemorySegment src) { return _deviceMaskAt(0L, src); }
}
