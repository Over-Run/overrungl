// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qnx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkScreenBufferPropertiesQNX`.
/// ## Layout
/// ```
/// struct VkScreenBufferPropertiesQNX {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize allocationSize;
///     uint32_t memoryTypeBits;
/// }
/// ```
public final class VkScreenBufferPropertiesQNX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("allocationSize"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_allocationSize = LAYOUT.byteOffset(PathElement.groupElement("allocationSize"));
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_allocationSize = LAYOUT.select(PathElement.groupElement("allocationSize"));
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_allocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationSize"));
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));

    public VkScreenBufferPropertiesQNX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkScreenBufferPropertiesQNX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenBufferPropertiesQNX(segment, estimateCount(segment, LAYOUT)); }
    public static VkScreenBufferPropertiesQNX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenBufferPropertiesQNX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkScreenBufferPropertiesQNX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenBufferPropertiesQNX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkScreenBufferPropertiesQNX alloc(SegmentAllocator allocator) { return new VkScreenBufferPropertiesQNX(allocator.allocate(LAYOUT), 1); }
    public static VkScreenBufferPropertiesQNX alloc(SegmentAllocator allocator, long count) { return new VkScreenBufferPropertiesQNX(allocator.allocate(LAYOUT, count), count); }
    public static VkScreenBufferPropertiesQNX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qnx.VKQNXExternalMemoryScreenBuffer.VK_STRUCTURE_TYPE_SCREEN_BUFFER_PROPERTIES_QNX); }
    public static VkScreenBufferPropertiesQNX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qnx.VKQNXExternalMemoryScreenBuffer.VK_STRUCTURE_TYPE_SCREEN_BUFFER_PROPERTIES_QNX);
        return s;
    }
    public VkScreenBufferPropertiesQNX copyFrom(VkScreenBufferPropertiesQNX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkScreenBufferPropertiesQNX reinterpret(long count) { return new VkScreenBufferPropertiesQNX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkScreenBufferPropertiesQNX asSlice(long index) { return new VkScreenBufferPropertiesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkScreenBufferPropertiesQNX asSlice(long index, long count) { return new VkScreenBufferPropertiesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkScreenBufferPropertiesQNX at(long index, Consumer<VkScreenBufferPropertiesQNX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long allocationSizeAt(long index) { return (long) VH_allocationSize.get(this.segment(), 0L, index); }
    public int memoryTypeBitsAt(long index) { return (int) VH_memoryTypeBits.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long allocationSize() { return (long) VH_allocationSize.get(this.segment(), 0L, 0L); }
    public int memoryTypeBits() { return (int) VH_memoryTypeBits.get(this.segment(), 0L, 0L); }
    public VkScreenBufferPropertiesQNX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferPropertiesQNX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferPropertiesQNX allocationSizeAt(long index, long value) { VH_allocationSize.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferPropertiesQNX memoryTypeBitsAt(long index, int value) { VH_memoryTypeBits.set(this.segment(), 0L, index, value); return this; }
    public VkScreenBufferPropertiesQNX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferPropertiesQNX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferPropertiesQNX allocationSize(long value) { VH_allocationSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkScreenBufferPropertiesQNX memoryTypeBits(int value) { VH_memoryTypeBits.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkScreenBufferPropertiesQNX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkScreenBufferPropertiesQNX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkScreenBufferPropertiesQNX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkScreenBufferPropertiesQNX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _allocationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_allocationSize, index), LAYOUT_allocationSize); }
    public MemorySegment _allocationSize() { return _allocationSizeAt(0L); }
    public VkScreenBufferPropertiesQNX _allocationSizeAt(long index, MemorySegment src) { _allocationSizeAt(index).copyFrom(src); return this; }
    public VkScreenBufferPropertiesQNX _allocationSize(MemorySegment src) { return _allocationSizeAt(0L, src); }
    public MemorySegment _memoryTypeBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypeBits, index), LAYOUT_memoryTypeBits); }
    public MemorySegment _memoryTypeBits() { return _memoryTypeBitsAt(0L); }
    public VkScreenBufferPropertiesQNX _memoryTypeBitsAt(long index, MemorySegment src) { _memoryTypeBitsAt(index).copyFrom(src); return this; }
    public VkScreenBufferPropertiesQNX _memoryTypeBits(MemorySegment src) { return _memoryTypeBitsAt(0L, src); }
}
