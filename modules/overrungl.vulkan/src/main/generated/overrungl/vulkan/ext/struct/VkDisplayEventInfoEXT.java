// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayEventInfoEXT`.
/// ## Layout
/// ```
/// struct VkDisplayEventInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDisplayEventTypeEXT displayEvent;
/// }
/// ```
public final class VkDisplayEventInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displayEvent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_displayEvent = LAYOUT.byteOffset(PathElement.groupElement("displayEvent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_displayEvent = LAYOUT.select(PathElement.groupElement("displayEvent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_displayEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayEvent"));

    public VkDisplayEventInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayEventInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayEventInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayEventInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayEventInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayEventInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayEventInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayEventInfoEXT alloc(SegmentAllocator allocator) { return new VkDisplayEventInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayEventInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDisplayEventInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayEventInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT); }
    public static VkDisplayEventInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT);
        return s;
    }
    public VkDisplayEventInfoEXT copyFrom(VkDisplayEventInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayEventInfoEXT reinterpret(long count) { return new VkDisplayEventInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayEventInfoEXT asSlice(long index) { return new VkDisplayEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayEventInfoEXT asSlice(long index, long count) { return new VkDisplayEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayEventInfoEXT at(long index, Consumer<VkDisplayEventInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int displayEventAt(long index) { return (int) VH_displayEvent.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int displayEvent() { return (int) VH_displayEvent.get(this.segment(), 0L, 0L); }
    public VkDisplayEventInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayEventInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayEventInfoEXT displayEventAt(long index, int value) { VH_displayEvent.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayEventInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayEventInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayEventInfoEXT displayEvent(int value) { VH_displayEvent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayEventInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayEventInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayEventInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayEventInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _displayEventAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayEvent, index), LAYOUT_displayEvent); }
    public MemorySegment _displayEvent() { return _displayEventAt(0L); }
    public VkDisplayEventInfoEXT _displayEventAt(long index, MemorySegment src) { _displayEventAt(index).copyFrom(src); return this; }
    public VkDisplayEventInfoEXT _displayEvent(MemorySegment src) { return _displayEventAt(0L, src); }
}
