// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceFullScreenExclusiveInfoEXT`.
/// ## Layout
/// ```
/// struct VkSurfaceFullScreenExclusiveInfoEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkFullScreenExclusiveEXT fullScreenExclusive;
/// }
/// ```
public final class VkSurfaceFullScreenExclusiveInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fullScreenExclusive")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fullScreenExclusive = LAYOUT.byteOffset(PathElement.groupElement("fullScreenExclusive"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fullScreenExclusive = LAYOUT.select(PathElement.groupElement("fullScreenExclusive"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fullScreenExclusive = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullScreenExclusive"));

    public VkSurfaceFullScreenExclusiveInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceFullScreenExclusiveInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceFullScreenExclusiveInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceFullScreenExclusiveInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceFullScreenExclusiveInfoEXT alloc(SegmentAllocator allocator) { return new VkSurfaceFullScreenExclusiveInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceFullScreenExclusiveInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSurfaceFullScreenExclusiveInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceFullScreenExclusiveInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT); }
    public static VkSurfaceFullScreenExclusiveInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT);
        return s;
    }
    public VkSurfaceFullScreenExclusiveInfoEXT copyFrom(VkSurfaceFullScreenExclusiveInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT reinterpret(long count) { return new VkSurfaceFullScreenExclusiveInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceFullScreenExclusiveInfoEXT asSlice(long index) { return new VkSurfaceFullScreenExclusiveInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceFullScreenExclusiveInfoEXT asSlice(long index, long count) { return new VkSurfaceFullScreenExclusiveInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceFullScreenExclusiveInfoEXT at(long index, Consumer<VkSurfaceFullScreenExclusiveInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fullScreenExclusiveAt(long index) { return (int) VH_fullScreenExclusive.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fullScreenExclusive() { return (int) VH_fullScreenExclusive.get(this.segment(), 0L, 0L); }
    public VkSurfaceFullScreenExclusiveInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT fullScreenExclusiveAt(long index, int value) { VH_fullScreenExclusive.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT fullScreenExclusive(int value) { VH_fullScreenExclusive.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceFullScreenExclusiveInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceFullScreenExclusiveInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fullScreenExclusiveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fullScreenExclusive, index), LAYOUT_fullScreenExclusive); }
    public MemorySegment _fullScreenExclusive() { return _fullScreenExclusiveAt(0L); }
    public VkSurfaceFullScreenExclusiveInfoEXT _fullScreenExclusiveAt(long index, MemorySegment src) { _fullScreenExclusiveAt(index).copyFrom(src); return this; }
    public VkSurfaceFullScreenExclusiveInfoEXT _fullScreenExclusive(MemorySegment src) { return _fullScreenExclusiveAt(0L, src); }
}
