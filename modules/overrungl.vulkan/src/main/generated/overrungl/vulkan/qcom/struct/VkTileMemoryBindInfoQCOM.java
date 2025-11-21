// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTileMemoryBindInfoQCOM`.
/// ## Layout
/// ```
/// struct VkTileMemoryBindInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceMemory memory;
/// }
/// ```
public final class VkTileMemoryBindInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("memory")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));

    public VkTileMemoryBindInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTileMemoryBindInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemoryBindInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTileMemoryBindInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemoryBindInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTileMemoryBindInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemoryBindInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTileMemoryBindInfoQCOM alloc(SegmentAllocator allocator) { return new VkTileMemoryBindInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkTileMemoryBindInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkTileMemoryBindInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkTileMemoryBindInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM); }
    public static VkTileMemoryBindInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM);
        return s;
    }
    public VkTileMemoryBindInfoQCOM copyFrom(VkTileMemoryBindInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTileMemoryBindInfoQCOM reinterpret(long count) { return new VkTileMemoryBindInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTileMemoryBindInfoQCOM asSlice(long index) { return new VkTileMemoryBindInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTileMemoryBindInfoQCOM asSlice(long index, long count) { return new VkTileMemoryBindInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTileMemoryBindInfoQCOM at(long index, Consumer<VkTileMemoryBindInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public VkTileMemoryBindInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTileMemoryBindInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTileMemoryBindInfoQCOM memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkTileMemoryBindInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTileMemoryBindInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTileMemoryBindInfoQCOM memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTileMemoryBindInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTileMemoryBindInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTileMemoryBindInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTileMemoryBindInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkTileMemoryBindInfoQCOM _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkTileMemoryBindInfoQCOM _memory(MemorySegment src) { return _memoryAt(0L, src); }
}
