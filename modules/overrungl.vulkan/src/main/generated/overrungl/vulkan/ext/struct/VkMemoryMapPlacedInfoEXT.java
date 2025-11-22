// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryMapPlacedInfoEXT`.
/// ## Layout
/// ```
/// struct VkMemoryMapPlacedInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     void* pPlacedAddress;
/// }
/// ```
public final class VkMemoryMapPlacedInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pPlacedAddress")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pPlacedAddress = LAYOUT.byteOffset(PathElement.groupElement("pPlacedAddress"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pPlacedAddress = LAYOUT.select(PathElement.groupElement("pPlacedAddress"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pPlacedAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPlacedAddress"));

    public VkMemoryMapPlacedInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryMapPlacedInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapPlacedInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryMapPlacedInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapPlacedInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryMapPlacedInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapPlacedInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryMapPlacedInfoEXT alloc(SegmentAllocator allocator) { return new VkMemoryMapPlacedInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryMapPlacedInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMemoryMapPlacedInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryMapPlacedInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMapMemoryPlaced.VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT); }
    public static VkMemoryMapPlacedInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMapMemoryPlaced.VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT);
        return s;
    }
    public VkMemoryMapPlacedInfoEXT copyFrom(VkMemoryMapPlacedInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryMapPlacedInfoEXT reinterpret(long count) { return new VkMemoryMapPlacedInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryMapPlacedInfoEXT asSlice(long index) { return new VkMemoryMapPlacedInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryMapPlacedInfoEXT asSlice(long index, long count) { return new VkMemoryMapPlacedInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryMapPlacedInfoEXT at(long index, Consumer<VkMemoryMapPlacedInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pPlacedAddressAt(long index) { return (MemorySegment) VH_pPlacedAddress.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pPlacedAddress() { return (MemorySegment) VH_pPlacedAddress.get(this.segment(), 0L, 0L); }
    public VkMemoryMapPlacedInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapPlacedInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapPlacedInfoEXT pPlacedAddressAt(long index, MemorySegment value) { VH_pPlacedAddress.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMapPlacedInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMapPlacedInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMapPlacedInfoEXT pPlacedAddress(MemorySegment value) { VH_pPlacedAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryMapPlacedInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryMapPlacedInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryMapPlacedInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryMapPlacedInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pPlacedAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPlacedAddress, index), LAYOUT_pPlacedAddress); }
    public MemorySegment _pPlacedAddress() { return _pPlacedAddressAt(0L); }
    public VkMemoryMapPlacedInfoEXT _pPlacedAddressAt(long index, MemorySegment src) { _pPlacedAddressAt(index).copyFrom(src); return this; }
    public VkMemoryMapPlacedInfoEXT _pPlacedAddress(MemorySegment src) { return _pPlacedAddressAt(0L, src); }
}
