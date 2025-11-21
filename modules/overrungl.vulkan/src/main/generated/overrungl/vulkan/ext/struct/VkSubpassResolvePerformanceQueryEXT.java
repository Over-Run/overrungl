// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubpassResolvePerformanceQueryEXT`.
/// ## Layout
/// ```
/// struct VkSubpassResolvePerformanceQueryEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 optimal;
/// }
/// ```
public final class VkSubpassResolvePerformanceQueryEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimal")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_optimal = LAYOUT.byteOffset(PathElement.groupElement("optimal"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_optimal = LAYOUT.select(PathElement.groupElement("optimal"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_optimal = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimal"));

    public VkSubpassResolvePerformanceQueryEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubpassResolvePerformanceQueryEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassResolvePerformanceQueryEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubpassResolvePerformanceQueryEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassResolvePerformanceQueryEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubpassResolvePerformanceQueryEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassResolvePerformanceQueryEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubpassResolvePerformanceQueryEXT alloc(SegmentAllocator allocator) { return new VkSubpassResolvePerformanceQueryEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSubpassResolvePerformanceQueryEXT alloc(SegmentAllocator allocator, long count) { return new VkSubpassResolvePerformanceQueryEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSubpassResolvePerformanceQueryEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT); }
    public static VkSubpassResolvePerformanceQueryEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT);
        return s;
    }
    public VkSubpassResolvePerformanceQueryEXT copyFrom(VkSubpassResolvePerformanceQueryEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubpassResolvePerformanceQueryEXT reinterpret(long count) { return new VkSubpassResolvePerformanceQueryEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubpassResolvePerformanceQueryEXT asSlice(long index) { return new VkSubpassResolvePerformanceQueryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubpassResolvePerformanceQueryEXT asSlice(long index, long count) { return new VkSubpassResolvePerformanceQueryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubpassResolvePerformanceQueryEXT at(long index, Consumer<VkSubpassResolvePerformanceQueryEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int optimalAt(long index) { return (int) VH_optimal.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int optimal() { return (int) VH_optimal.get(this.segment(), 0L, 0L); }
    public VkSubpassResolvePerformanceQueryEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassResolvePerformanceQueryEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassResolvePerformanceQueryEXT optimalAt(long index, int value) { VH_optimal.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassResolvePerformanceQueryEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassResolvePerformanceQueryEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassResolvePerformanceQueryEXT optimal(int value) { VH_optimal.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubpassResolvePerformanceQueryEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubpassResolvePerformanceQueryEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubpassResolvePerformanceQueryEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubpassResolvePerformanceQueryEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _optimalAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimal, index), LAYOUT_optimal); }
    public MemorySegment _optimal() { return _optimalAt(0L); }
    public VkSubpassResolvePerformanceQueryEXT _optimalAt(long index, MemorySegment src) { _optimalAt(index).copyFrom(src); return this; }
    public VkSubpassResolvePerformanceQueryEXT _optimal(MemorySegment src) { return _optimalAt(0L, src); }
}
