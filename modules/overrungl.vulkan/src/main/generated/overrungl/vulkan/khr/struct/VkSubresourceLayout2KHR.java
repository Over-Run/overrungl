// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubresourceLayout2KHR`.
/// ## Layout
/// ```
/// struct VkSubresourceLayout2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkSubresourceLayout subresourceLayout;
/// }
/// ```
public final class VkSubresourceLayout2KHR extends GroupType {
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

    public VkSubresourceLayout2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubresourceLayout2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubresourceLayout2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubresourceLayout2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubresourceLayout2KHR alloc(SegmentAllocator allocator) { return new VkSubresourceLayout2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkSubresourceLayout2KHR alloc(SegmentAllocator allocator, long count) { return new VkSubresourceLayout2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSubresourceLayout2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2); }
    public static VkSubresourceLayout2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2);
        return s;
    }
    public VkSubresourceLayout2KHR copyFrom(VkSubresourceLayout2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubresourceLayout2KHR reinterpret(long count) { return new VkSubresourceLayout2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubresourceLayout2KHR asSlice(long index) { return new VkSubresourceLayout2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubresourceLayout2KHR asSlice(long index, long count) { return new VkSubresourceLayout2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubresourceLayout2KHR at(long index, Consumer<VkSubresourceLayout2KHR> func) { func.accept(asSlice(index)); return this; }
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
    public VkSubresourceLayout2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$offsetAt(long index, long value) { VH_subresourceLayout$offset.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$sizeAt(long index, long value) { VH_subresourceLayout$size.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$rowPitchAt(long index, long value) { VH_subresourceLayout$rowPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$arrayPitchAt(long index, long value) { VH_subresourceLayout$arrayPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$depthPitchAt(long index, long value) { VH_subresourceLayout$depthPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$offset(long value) { VH_subresourceLayout$offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$size(long value) { VH_subresourceLayout$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$rowPitch(long value) { VH_subresourceLayout$rowPitch.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$arrayPitch(long value) { VH_subresourceLayout$arrayPitch.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout2KHR subresourceLayout$depthPitch(long value) { VH_subresourceLayout$depthPitch.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubresourceLayout2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubresourceLayout2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _subresourceLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subresourceLayout, index), LAYOUT_subresourceLayout); }
    public MemorySegment _subresourceLayout() { return _subresourceLayoutAt(0L); }
    public VkSubresourceLayout2KHR _subresourceLayoutAt(long index, MemorySegment src) { _subresourceLayoutAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout2KHR _subresourceLayout(MemorySegment src) { return _subresourceLayoutAt(0L, src); }
}
