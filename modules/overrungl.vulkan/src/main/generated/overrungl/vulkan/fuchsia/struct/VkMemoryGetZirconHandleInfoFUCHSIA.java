// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryGetZirconHandleInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkMemoryGetZirconHandleInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceMemory memory;
///     VkExternalMemoryHandleTypeFlagBits handleType;
/// }
/// ```
public final class VkMemoryGetZirconHandleInfoFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    public VkMemoryGetZirconHandleInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryGetZirconHandleInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetZirconHandleInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryGetZirconHandleInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryGetZirconHandleInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryGetZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkMemoryGetZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryGetZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkMemoryGetZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryGetZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIAExternalMemory.VK_STRUCTURE_TYPE_MEMORY_GET_ZIRCON_HANDLE_INFO_FUCHSIA); }
    public static VkMemoryGetZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIAExternalMemory.VK_STRUCTURE_TYPE_MEMORY_GET_ZIRCON_HANDLE_INFO_FUCHSIA);
        return s;
    }
    public VkMemoryGetZirconHandleInfoFUCHSIA copyFrom(VkMemoryGetZirconHandleInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA reinterpret(long count) { return new VkMemoryGetZirconHandleInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryGetZirconHandleInfoFUCHSIA asSlice(long index) { return new VkMemoryGetZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryGetZirconHandleInfoFUCHSIA asSlice(long index, long count) { return new VkMemoryGetZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryGetZirconHandleInfoFUCHSIA at(long index, Consumer<VkMemoryGetZirconHandleInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public VkMemoryGetZirconHandleInfoFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryGetZirconHandleInfoFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryGetZirconHandleInfoFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkMemoryGetZirconHandleInfoFUCHSIA _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkMemoryGetZirconHandleInfoFUCHSIA _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkMemoryGetZirconHandleInfoFUCHSIA _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
}
