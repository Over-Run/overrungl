// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindImageMemoryInfo`.
/// ## Layout
/// ```
/// struct VkBindImageMemoryInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
/// }
/// ```
public final class VkBindImageMemoryInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));

    public VkBindImageMemoryInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindImageMemoryInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindImageMemoryInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindImageMemoryInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindImageMemoryInfo alloc(SegmentAllocator allocator) { return new VkBindImageMemoryInfo(allocator.allocate(LAYOUT), 1); }
    public static VkBindImageMemoryInfo alloc(SegmentAllocator allocator, long count) { return new VkBindImageMemoryInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkBindImageMemoryInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO); }
    public static VkBindImageMemoryInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO);
        return s;
    }
    public VkBindImageMemoryInfo copyFrom(VkBindImageMemoryInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindImageMemoryInfo reinterpret(long count) { return new VkBindImageMemoryInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindImageMemoryInfo asSlice(long index) { return new VkBindImageMemoryInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindImageMemoryInfo asSlice(long index, long count) { return new VkBindImageMemoryInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindImageMemoryInfo at(long index, Consumer<VkBindImageMemoryInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long memoryOffsetAt(long index) { return (long) VH_memoryOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long memoryOffset() { return (long) VH_memoryOffset.get(this.segment(), 0L, 0L); }
    public VkBindImageMemoryInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryInfo imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryInfo memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryInfo memoryOffsetAt(long index, long value) { VH_memoryOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryInfo image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryInfo memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryInfo memoryOffset(long value) { VH_memoryOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindImageMemoryInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindImageMemoryInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkBindImageMemoryInfo _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryInfo _image(MemorySegment src) { return _imageAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkBindImageMemoryInfo _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryInfo _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _memoryOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryOffset, index), LAYOUT_memoryOffset); }
    public MemorySegment _memoryOffset() { return _memoryOffsetAt(0L); }
    public VkBindImageMemoryInfo _memoryOffsetAt(long index, MemorySegment src) { _memoryOffsetAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryInfo _memoryOffset(MemorySegment src) { return _memoryOffsetAt(0L, src); }
}
