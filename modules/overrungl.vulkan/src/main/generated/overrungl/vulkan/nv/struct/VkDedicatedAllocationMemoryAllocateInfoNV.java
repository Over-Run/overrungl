// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDedicatedAllocationMemoryAllocateInfoNV`.
/// ## Layout
/// ```
/// struct VkDedicatedAllocationMemoryAllocateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
///     VkBuffer buffer;
/// }
/// ```
public final class VkDedicatedAllocationMemoryAllocateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_LONG.withName("buffer")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));

    public VkDedicatedAllocationMemoryAllocateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDedicatedAllocationMemoryAllocateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDedicatedAllocationMemoryAllocateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkDedicatedAllocationMemoryAllocateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDedicatedAllocationMemoryAllocateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDedicatedAllocationMemoryAllocateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDedicatedAllocationMemoryAllocateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDedicatedAllocationMemoryAllocateInfoNV alloc(SegmentAllocator allocator) { return new VkDedicatedAllocationMemoryAllocateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkDedicatedAllocationMemoryAllocateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkDedicatedAllocationMemoryAllocateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkDedicatedAllocationMemoryAllocateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV); }
    public static VkDedicatedAllocationMemoryAllocateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV);
        return s;
    }
    public VkDedicatedAllocationMemoryAllocateInfoNV copyFrom(VkDedicatedAllocationMemoryAllocateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV reinterpret(long count) { return new VkDedicatedAllocationMemoryAllocateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDedicatedAllocationMemoryAllocateInfoNV asSlice(long index) { return new VkDedicatedAllocationMemoryAllocateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDedicatedAllocationMemoryAllocateInfoNV asSlice(long index, long count) { return new VkDedicatedAllocationMemoryAllocateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDedicatedAllocationMemoryAllocateInfoNV at(long index, Consumer<VkDedicatedAllocationMemoryAllocateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public VkDedicatedAllocationMemoryAllocateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDedicatedAllocationMemoryAllocateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDedicatedAllocationMemoryAllocateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkDedicatedAllocationMemoryAllocateInfoNV _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV _image(MemorySegment src) { return _imageAt(0L, src); }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkDedicatedAllocationMemoryAllocateInfoNV _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkDedicatedAllocationMemoryAllocateInfoNV _buffer(MemorySegment src) { return _bufferAt(0L, src); }
}
