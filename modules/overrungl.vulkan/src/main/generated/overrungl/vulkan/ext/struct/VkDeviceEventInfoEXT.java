// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceEventInfoEXT`.
/// ## Layout
/// ```
/// struct VkDeviceEventInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceEventTypeEXT deviceEvent;
/// }
/// ```
public final class VkDeviceEventInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceEvent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceEvent = LAYOUT.byteOffset(PathElement.groupElement("deviceEvent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceEvent = LAYOUT.select(PathElement.groupElement("deviceEvent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceEvent"));

    public VkDeviceEventInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceEventInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceEventInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceEventInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceEventInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceEventInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceEventInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceEventInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceEventInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceEventInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceEventInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceEventInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDisplayControl.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT); }
    public static VkDeviceEventInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDisplayControl.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT);
        return s;
    }
    public VkDeviceEventInfoEXT copyFrom(VkDeviceEventInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceEventInfoEXT reinterpret(long count) { return new VkDeviceEventInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceEventInfoEXT asSlice(long index) { return new VkDeviceEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceEventInfoEXT asSlice(long index, long count) { return new VkDeviceEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceEventInfoEXT at(long index, Consumer<VkDeviceEventInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceEventAt(long index) { return (int) VH_deviceEvent.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceEvent() { return (int) VH_deviceEvent.get(this.segment(), 0L, 0L); }
    public VkDeviceEventInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceEventInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceEventInfoEXT deviceEventAt(long index, int value) { VH_deviceEvent.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceEventInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceEventInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceEventInfoEXT deviceEvent(int value) { VH_deviceEvent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceEventInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceEventInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceEventInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceEventInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceEventAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceEvent, index), LAYOUT_deviceEvent); }
    public MemorySegment _deviceEvent() { return _deviceEventAt(0L); }
    public VkDeviceEventInfoEXT _deviceEventAt(long index, MemorySegment src) { _deviceEventAt(index).copyFrom(src); return this; }
    public VkDeviceEventInfoEXT _deviceEvent(MemorySegment src) { return _deviceEventAt(0L, src); }
}
