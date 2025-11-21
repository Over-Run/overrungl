// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryZirconHandlePropertiesFUCHSIA`.
/// ## Layout
/// ```
/// struct VkMemoryZirconHandlePropertiesFUCHSIA {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t memoryTypeBits;
/// }
/// ```
public final class VkMemoryZirconHandlePropertiesFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));

    public VkMemoryZirconHandlePropertiesFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryZirconHandlePropertiesFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryZirconHandlePropertiesFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryZirconHandlePropertiesFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryZirconHandlePropertiesFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryZirconHandlePropertiesFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryZirconHandlePropertiesFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryZirconHandlePropertiesFUCHSIA alloc(SegmentAllocator allocator) { return new VkMemoryZirconHandlePropertiesFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryZirconHandlePropertiesFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkMemoryZirconHandlePropertiesFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryZirconHandlePropertiesFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIAExternalMemory.VK_STRUCTURE_TYPE_MEMORY_ZIRCON_HANDLE_PROPERTIES_FUCHSIA); }
    public static VkMemoryZirconHandlePropertiesFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIAExternalMemory.VK_STRUCTURE_TYPE_MEMORY_ZIRCON_HANDLE_PROPERTIES_FUCHSIA);
        return s;
    }
    public VkMemoryZirconHandlePropertiesFUCHSIA copyFrom(VkMemoryZirconHandlePropertiesFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA reinterpret(long count) { return new VkMemoryZirconHandlePropertiesFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryZirconHandlePropertiesFUCHSIA asSlice(long index) { return new VkMemoryZirconHandlePropertiesFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryZirconHandlePropertiesFUCHSIA asSlice(long index, long count) { return new VkMemoryZirconHandlePropertiesFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryZirconHandlePropertiesFUCHSIA at(long index, Consumer<VkMemoryZirconHandlePropertiesFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryTypeBitsAt(long index) { return (int) VH_memoryTypeBits.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryTypeBits() { return (int) VH_memoryTypeBits.get(this.segment(), 0L, 0L); }
    public VkMemoryZirconHandlePropertiesFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA memoryTypeBitsAt(long index, int value) { VH_memoryTypeBits.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA memoryTypeBits(int value) { VH_memoryTypeBits.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryZirconHandlePropertiesFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryZirconHandlePropertiesFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryTypeBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypeBits, index), LAYOUT_memoryTypeBits); }
    public MemorySegment _memoryTypeBits() { return _memoryTypeBitsAt(0L); }
    public VkMemoryZirconHandlePropertiesFUCHSIA _memoryTypeBitsAt(long index, MemorySegment src) { _memoryTypeBitsAt(index).copyFrom(src); return this; }
    public VkMemoryZirconHandlePropertiesFUCHSIA _memoryTypeBits(MemorySegment src) { return _memoryTypeBitsAt(0L, src); }
}
