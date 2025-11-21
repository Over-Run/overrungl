// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubresourceHostMemcpySizeEXT`.
/// ## Layout
/// ```
/// struct VkSubresourceHostMemcpySizeEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize size;
/// }
/// ```
public final class VkSubresourceHostMemcpySizeEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkSubresourceHostMemcpySizeEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubresourceHostMemcpySizeEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceHostMemcpySizeEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubresourceHostMemcpySizeEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceHostMemcpySizeEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubresourceHostMemcpySizeEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceHostMemcpySizeEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubresourceHostMemcpySizeEXT alloc(SegmentAllocator allocator) { return new VkSubresourceHostMemcpySizeEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSubresourceHostMemcpySizeEXT alloc(SegmentAllocator allocator, long count) { return new VkSubresourceHostMemcpySizeEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSubresourceHostMemcpySizeEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE); }
    public static VkSubresourceHostMemcpySizeEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE);
        return s;
    }
    public VkSubresourceHostMemcpySizeEXT copyFrom(VkSubresourceHostMemcpySizeEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubresourceHostMemcpySizeEXT reinterpret(long count) { return new VkSubresourceHostMemcpySizeEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubresourceHostMemcpySizeEXT asSlice(long index) { return new VkSubresourceHostMemcpySizeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubresourceHostMemcpySizeEXT asSlice(long index, long count) { return new VkSubresourceHostMemcpySizeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubresourceHostMemcpySizeEXT at(long index, Consumer<VkSubresourceHostMemcpySizeEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkSubresourceHostMemcpySizeEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceHostMemcpySizeEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceHostMemcpySizeEXT sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceHostMemcpySizeEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceHostMemcpySizeEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceHostMemcpySizeEXT size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubresourceHostMemcpySizeEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubresourceHostMemcpySizeEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubresourceHostMemcpySizeEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubresourceHostMemcpySizeEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkSubresourceHostMemcpySizeEXT _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkSubresourceHostMemcpySizeEXT _size(MemorySegment src) { return _sizeAt(0L, src); }
}
