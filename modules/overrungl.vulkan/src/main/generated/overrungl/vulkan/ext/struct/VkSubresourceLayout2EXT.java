// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubresourceLayout2EXT`.
/// ## Layout
/// ```
/// struct VkSubresourceLayout2EXT {
///     VkStructureType sType;
///     void* pNext;
///     VkSubresourceLayout subresourceLayout;
/// }
/// ```
public final class VkSubresourceLayout2EXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkSubresourceLayout.LAYOUT.withName("subresourceLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_subresourceLayout = LAYOUT.byteOffset(PathElement.groupElement("subresourceLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_subresourceLayout = LAYOUT.select(PathElement.groupElement("subresourceLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_subresourceLayout$offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceLayout"), PathElement.groupElement("offset"));
    public static final VarHandle VH_subresourceLayout$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceLayout"), PathElement.groupElement("size"));
    public static final VarHandle VH_subresourceLayout$rowPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceLayout"), PathElement.groupElement("rowPitch"));
    public static final VarHandle VH_subresourceLayout$arrayPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceLayout"), PathElement.groupElement("arrayPitch"));
    public static final VarHandle VH_subresourceLayout$depthPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceLayout"), PathElement.groupElement("depthPitch"));

    public VkSubresourceLayout2EXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubresourceLayout2EXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout2EXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubresourceLayout2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout2EXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubresourceLayout2EXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout2EXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubresourceLayout2EXT alloc(SegmentAllocator allocator) { return new VkSubresourceLayout2EXT(allocator.allocate(LAYOUT), 1); }
    public static VkSubresourceLayout2EXT alloc(SegmentAllocator allocator, long count) { return new VkSubresourceLayout2EXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSubresourceLayout2EXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2); }
    public static VkSubresourceLayout2EXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2);
        return s;
    }
    public VkSubresourceLayout2EXT copyFrom(VkSubresourceLayout2EXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubresourceLayout2EXT reinterpret(long count) { return new VkSubresourceLayout2EXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubresourceLayout2EXT asSlice(long index) { return new VkSubresourceLayout2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubresourceLayout2EXT asSlice(long index, long count) { return new VkSubresourceLayout2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubresourceLayout2EXT at(long index, Consumer<VkSubresourceLayout2EXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long subresourceLayout$offsetAt(long index) { return (long) VH_subresourceLayout$offset.get(this.segment(), 0L, index); }
    public long subresourceLayout$sizeAt(long index) { return (long) VH_subresourceLayout$size.get(this.segment(), 0L, index); }
    public long subresourceLayout$rowPitchAt(long index) { return (long) VH_subresourceLayout$rowPitch.get(this.segment(), 0L, index); }
    public long subresourceLayout$arrayPitchAt(long index) { return (long) VH_subresourceLayout$arrayPitch.get(this.segment(), 0L, index); }
    public long subresourceLayout$depthPitchAt(long index) { return (long) VH_subresourceLayout$depthPitch.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long subresourceLayout$offset() { return (long) VH_subresourceLayout$offset.get(this.segment(), 0L, 0L); }
    public long subresourceLayout$size() { return (long) VH_subresourceLayout$size.get(this.segment(), 0L, 0L); }
    public long subresourceLayout$rowPitch() { return (long) VH_subresourceLayout$rowPitch.get(this.segment(), 0L, 0L); }
    public long subresourceLayout$arrayPitch() { return (long) VH_subresourceLayout$arrayPitch.get(this.segment(), 0L, 0L); }
    public long subresourceLayout$depthPitch() { return (long) VH_subresourceLayout$depthPitch.get(this.segment(), 0L, 0L); }
    public VkSubresourceLayout2EXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2EXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$offsetAt(long index, long value) { VH_subresourceLayout$offset.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$sizeAt(long index, long value) { VH_subresourceLayout$size.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$rowPitchAt(long index, long value) { VH_subresourceLayout$rowPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$arrayPitchAt(long index, long value) { VH_subresourceLayout$arrayPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$depthPitchAt(long index, long value) { VH_subresourceLayout$depthPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2EXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2EXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$offset(long value) { VH_subresourceLayout$offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$size(long value) { VH_subresourceLayout$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$rowPitch(long value) { VH_subresourceLayout$rowPitch.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$arrayPitch(long value) { VH_subresourceLayout$arrayPitch.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2EXT subresourceLayout$depthPitch(long value) { VH_subresourceLayout$depthPitch.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubresourceLayout2EXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout2EXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubresourceLayout2EXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout2EXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _subresourceLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subresourceLayout, index), LAYOUT_subresourceLayout); }
    public MemorySegment _subresourceLayout() { return _subresourceLayoutAt(0L); }
    public VkSubresourceLayout2EXT _subresourceLayoutAt(long index, MemorySegment src) { _subresourceLayoutAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout2EXT _subresourceLayout(MemorySegment src) { return _subresourceLayoutAt(0L, src); }
}
