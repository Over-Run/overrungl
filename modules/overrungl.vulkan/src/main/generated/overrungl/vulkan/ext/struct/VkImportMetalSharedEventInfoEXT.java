// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportMetalSharedEventInfoEXT`.
/// ## Layout
/// ```
/// struct VkImportMetalSharedEventInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     MTLSharedEvent_id mtlSharedEvent;
/// }
/// ```
public final class VkImportMetalSharedEventInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_mtlSharedEvent = LAYOUT.byteOffset(PathElement.groupElement("mtlSharedEvent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_mtlSharedEvent = LAYOUT.select(PathElement.groupElement("mtlSharedEvent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_mtlSharedEvent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlSharedEvent"));

    public VkImportMetalSharedEventInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportMetalSharedEventInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalSharedEventInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportMetalSharedEventInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalSharedEventInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportMetalSharedEventInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalSharedEventInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImportMetalSharedEventInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMetalSharedEventInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImportMetalSharedEventInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT); }
    public static VkImportMetalSharedEventInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT);
        return s;
    }
    public VkImportMetalSharedEventInfoEXT copyFrom(VkImportMetalSharedEventInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportMetalSharedEventInfoEXT reinterpret(long count) { return new VkImportMetalSharedEventInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportMetalSharedEventInfoEXT asSlice(long index) { return new VkImportMetalSharedEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportMetalSharedEventInfoEXT asSlice(long index, long count) { return new VkImportMetalSharedEventInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportMetalSharedEventInfoEXT at(long index, Consumer<VkImportMetalSharedEventInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment mtlSharedEventAt(long index) { return (MemorySegment) VH_mtlSharedEvent.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment mtlSharedEvent() { return (MemorySegment) VH_mtlSharedEvent.get(this.segment(), 0L, 0L); }
    public VkImportMetalSharedEventInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalSharedEventInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalSharedEventInfoEXT mtlSharedEventAt(long index, MemorySegment value) { VH_mtlSharedEvent.set(this.segment(), 0L, index, value); return this; }
    public VkImportMetalSharedEventInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalSharedEventInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportMetalSharedEventInfoEXT mtlSharedEvent(MemorySegment value) { VH_mtlSharedEvent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportMetalSharedEventInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportMetalSharedEventInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportMetalSharedEventInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportMetalSharedEventInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _mtlSharedEventAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mtlSharedEvent, index), LAYOUT_mtlSharedEvent); }
    public MemorySegment _mtlSharedEvent() { return _mtlSharedEventAt(0L); }
    public VkImportMetalSharedEventInfoEXT _mtlSharedEventAt(long index, MemorySegment src) { _mtlSharedEventAt(index).copyFrom(src); return this; }
    public VkImportMetalSharedEventInfoEXT _mtlSharedEvent(MemorySegment src) { return _mtlSharedEventAt(0L, src); }
}
