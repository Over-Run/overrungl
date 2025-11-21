// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryRequirements2`.
/// ## Layout
/// ```
/// struct VkMemoryRequirements2 {
///     VkStructureType sType;
///     void* pNext;
///     VkMemoryRequirements memoryRequirements;
/// }
/// ```
public final class VkMemoryRequirements2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkMemoryRequirements.LAYOUT.withName("memoryRequirements")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryRequirements = LAYOUT.select(PathElement.groupElement("memoryRequirements"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryRequirements$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("size"));
    public static final VarHandle VH_memoryRequirements$alignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("alignment"));
    public static final VarHandle VH_memoryRequirements$memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("memoryTypeBits"));

    public VkMemoryRequirements2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryRequirements2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements2(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryRequirements2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryRequirements2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryRequirements2 alloc(SegmentAllocator allocator) { return new VkMemoryRequirements2(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryRequirements2 alloc(SegmentAllocator allocator, long count) { return new VkMemoryRequirements2(allocator.allocate(LAYOUT, count), count); }
    public static VkMemoryRequirements2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2); }
    public static VkMemoryRequirements2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2);
        return s;
    }
    public VkMemoryRequirements2 copyFrom(VkMemoryRequirements2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryRequirements2 reinterpret(long count) { return new VkMemoryRequirements2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryRequirements2 asSlice(long index) { return new VkMemoryRequirements2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryRequirements2 asSlice(long index, long count) { return new VkMemoryRequirements2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryRequirements2 at(long index, Consumer<VkMemoryRequirements2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long memoryRequirements$sizeAt(long index) { return (long) VH_memoryRequirements$size.get(this.segment(), 0L, index); }
    public long memoryRequirements$alignmentAt(long index) { return (long) VH_memoryRequirements$alignment.get(this.segment(), 0L, index); }
    public int memoryRequirements$memoryTypeBitsAt(long index) { return (int) VH_memoryRequirements$memoryTypeBits.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long memoryRequirements$size() { return (long) VH_memoryRequirements$size.get(this.segment(), 0L, 0L); }
    public long memoryRequirements$alignment() { return (long) VH_memoryRequirements$alignment.get(this.segment(), 0L, 0L); }
    public int memoryRequirements$memoryTypeBits() { return (int) VH_memoryRequirements$memoryTypeBits.get(this.segment(), 0L, 0L); }
    public VkMemoryRequirements2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryRequirements2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryRequirements2 memoryRequirements$sizeAt(long index, long value) { VH_memoryRequirements$size.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryRequirements2 memoryRequirements$alignmentAt(long index, long value) { VH_memoryRequirements$alignment.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryRequirements2 memoryRequirements$memoryTypeBitsAt(long index, int value) { VH_memoryRequirements$memoryTypeBits.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryRequirements2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryRequirements2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryRequirements2 memoryRequirements$size(long value) { VH_memoryRequirements$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryRequirements2 memoryRequirements$alignment(long value) { VH_memoryRequirements$alignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryRequirements2 memoryRequirements$memoryTypeBits(int value) { VH_memoryRequirements$memoryTypeBits.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMemoryRequirements2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMemoryRequirements2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMemoryRequirements2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMemoryRequirements2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryRequirementsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryRequirements, index), LAYOUT_memoryRequirements); }
    public MemorySegment _memoryRequirements() { return _memoryRequirementsAt(0L); }
    public VkMemoryRequirements2 _memoryRequirementsAt(long index, MemorySegment src) { _memoryRequirementsAt(index).copyFrom(src); return this; }
    public VkMemoryRequirements2 _memoryRequirements(MemorySegment src) { return _memoryRequirementsAt(0L, src); }
}
