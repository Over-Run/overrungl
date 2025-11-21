// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryMetalHandlePropertiesEXT`.
/// ## Layout
/// ```
/// struct VkMemoryMetalHandlePropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t memoryTypeBits;
/// }
/// ```
public final class VkMemoryMetalHandlePropertiesEXT extends GroupType {
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

    public VkMemoryMetalHandlePropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryMetalHandlePropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMetalHandlePropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryMetalHandlePropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMetalHandlePropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryMetalHandlePropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMetalHandlePropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryMetalHandlePropertiesEXT alloc(SegmentAllocator allocator) { return new VkMemoryMetalHandlePropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryMetalHandlePropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkMemoryMetalHandlePropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryMetalHandlePropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT); }
    public static VkMemoryMetalHandlePropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT);
        return s;
    }
    public VkMemoryMetalHandlePropertiesEXT copyFrom(VkMemoryMetalHandlePropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryMetalHandlePropertiesEXT reinterpret(long count) { return new VkMemoryMetalHandlePropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryMetalHandlePropertiesEXT asSlice(long index) { return new VkMemoryMetalHandlePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryMetalHandlePropertiesEXT asSlice(long index, long count) { return new VkMemoryMetalHandlePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryMetalHandlePropertiesEXT at(long index, Consumer<VkMemoryMetalHandlePropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryTypeBitsAt(long index) { return (int) VH_memoryTypeBits.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryTypeBits() { return (int) VH_memoryTypeBits.get(this.segment(), 0L, 0L); }
    public VkMemoryMetalHandlePropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMetalHandlePropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMetalHandlePropertiesEXT memoryTypeBitsAt(long index, int value) { VH_memoryTypeBits.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryMetalHandlePropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMetalHandlePropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryMetalHandlePropertiesEXT memoryTypeBits(int value) { VH_memoryTypeBits.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryMetalHandlePropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryMetalHandlePropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryMetalHandlePropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryMetalHandlePropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryTypeBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypeBits, index), LAYOUT_memoryTypeBits); }
    public MemorySegment _memoryTypeBits() { return _memoryTypeBitsAt(0L); }
    public VkMemoryMetalHandlePropertiesEXT _memoryTypeBitsAt(long index, MemorySegment src) { _memoryTypeBitsAt(index).copyFrom(src); return this; }
    public VkMemoryMetalHandlePropertiesEXT _memoryTypeBits(MemorySegment src) { return _memoryTypeBitsAt(0L, src); }
}
