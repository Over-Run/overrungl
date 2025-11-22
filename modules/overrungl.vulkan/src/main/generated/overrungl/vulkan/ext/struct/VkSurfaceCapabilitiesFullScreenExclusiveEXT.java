// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceCapabilitiesFullScreenExclusiveEXT`.
/// ## Layout
/// ```
/// struct VkSurfaceCapabilitiesFullScreenExclusiveEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fullScreenExclusiveSupported;
/// }
/// ```
public final class VkSurfaceCapabilitiesFullScreenExclusiveEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fullScreenExclusiveSupported")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fullScreenExclusiveSupported = LAYOUT.byteOffset(PathElement.groupElement("fullScreenExclusiveSupported"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fullScreenExclusiveSupported = LAYOUT.select(PathElement.groupElement("fullScreenExclusiveSupported"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fullScreenExclusiveSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullScreenExclusiveSupported"));

    public VkSurfaceCapabilitiesFullScreenExclusiveEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesFullScreenExclusiveEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesFullScreenExclusiveEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesFullScreenExclusiveEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilitiesFullScreenExclusiveEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT alloc(SegmentAllocator allocator, long count) { return new VkSurfaceCapabilitiesFullScreenExclusiveEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT); }
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT);
        return s;
    }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT copyFrom(VkSurfaceCapabilitiesFullScreenExclusiveEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT reinterpret(long count) { return new VkSurfaceCapabilitiesFullScreenExclusiveEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT asSlice(long index) { return new VkSurfaceCapabilitiesFullScreenExclusiveEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT asSlice(long index, long count) { return new VkSurfaceCapabilitiesFullScreenExclusiveEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT at(long index, Consumer<VkSurfaceCapabilitiesFullScreenExclusiveEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fullScreenExclusiveSupportedAt(long index) { return (int) VH_fullScreenExclusiveSupported.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fullScreenExclusiveSupported() { return (int) VH_fullScreenExclusiveSupported.get(this.segment(), 0L, 0L); }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT fullScreenExclusiveSupportedAt(long index, int value) { VH_fullScreenExclusiveSupported.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT fullScreenExclusiveSupported(int value) { VH_fullScreenExclusiveSupported.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fullScreenExclusiveSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fullScreenExclusiveSupported, index), LAYOUT_fullScreenExclusiveSupported); }
    public MemorySegment _fullScreenExclusiveSupported() { return _fullScreenExclusiveSupportedAt(0L); }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT _fullScreenExclusiveSupportedAt(long index, MemorySegment src) { _fullScreenExclusiveSupportedAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT _fullScreenExclusiveSupported(MemorySegment src) { return _fullScreenExclusiveSupportedAt(0L, src); }
}
