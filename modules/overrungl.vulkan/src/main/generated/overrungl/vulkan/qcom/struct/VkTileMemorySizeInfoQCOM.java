// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTileMemorySizeInfoQCOM`.
/// ## Layout
/// ```
/// struct VkTileMemorySizeInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceSize size;
/// }
/// ```
public final class VkTileMemorySizeInfoQCOM extends GroupType {
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

    public VkTileMemorySizeInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTileMemorySizeInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemorySizeInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTileMemorySizeInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemorySizeInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTileMemorySizeInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemorySizeInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTileMemorySizeInfoQCOM alloc(SegmentAllocator allocator) { return new VkTileMemorySizeInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkTileMemorySizeInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkTileMemorySizeInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkTileMemorySizeInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM); }
    public static VkTileMemorySizeInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM);
        return s;
    }
    public VkTileMemorySizeInfoQCOM copyFrom(VkTileMemorySizeInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTileMemorySizeInfoQCOM reinterpret(long count) { return new VkTileMemorySizeInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTileMemorySizeInfoQCOM asSlice(long index) { return new VkTileMemorySizeInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTileMemorySizeInfoQCOM asSlice(long index, long count) { return new VkTileMemorySizeInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTileMemorySizeInfoQCOM at(long index, Consumer<VkTileMemorySizeInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkTileMemorySizeInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTileMemorySizeInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTileMemorySizeInfoQCOM sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkTileMemorySizeInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTileMemorySizeInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTileMemorySizeInfoQCOM size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTileMemorySizeInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTileMemorySizeInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTileMemorySizeInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTileMemorySizeInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkTileMemorySizeInfoQCOM _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkTileMemorySizeInfoQCOM _size(MemorySegment src) { return _sizeAt(0L, src); }
}
