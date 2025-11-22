// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingEndInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderingEndInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
/// }
/// ```
public final class VkRenderingEndInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));

    public VkRenderingEndInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderingEndInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingEndInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderingEndInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingEndInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderingEndInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingEndInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderingEndInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderingEndInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderingEndInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderingEndInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderingEndInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance10.VK_STRUCTURE_TYPE_RENDERING_END_INFO_KHR); }
    public static VkRenderingEndInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance10.VK_STRUCTURE_TYPE_RENDERING_END_INFO_KHR);
        return s;
    }
    public VkRenderingEndInfoEXT copyFrom(VkRenderingEndInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderingEndInfoEXT reinterpret(long count) { return new VkRenderingEndInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderingEndInfoEXT asSlice(long index) { return new VkRenderingEndInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderingEndInfoEXT asSlice(long index, long count) { return new VkRenderingEndInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderingEndInfoEXT at(long index, Consumer<VkRenderingEndInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public VkRenderingEndInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingEndInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingEndInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingEndInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderingEndInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderingEndInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderingEndInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderingEndInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
}
