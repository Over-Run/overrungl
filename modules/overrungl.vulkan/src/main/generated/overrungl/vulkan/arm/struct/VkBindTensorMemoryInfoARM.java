// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindTensorMemoryInfoARM`.
/// ## Layout
/// ```
/// struct VkBindTensorMemoryInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkTensorARM tensor;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
/// }
/// ```
public final class VkBindTensorMemoryInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("tensor"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tensor = LAYOUT.byteOffset(PathElement.groupElement("tensor"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tensor = LAYOUT.select(PathElement.groupElement("tensor"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensor"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));

    public VkBindTensorMemoryInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindTensorMemoryInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindTensorMemoryInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindTensorMemoryInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindTensorMemoryInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindTensorMemoryInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindTensorMemoryInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindTensorMemoryInfoARM alloc(SegmentAllocator allocator) { return new VkBindTensorMemoryInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkBindTensorMemoryInfoARM alloc(SegmentAllocator allocator, long count) { return new VkBindTensorMemoryInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkBindTensorMemoryInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM); }
    public static VkBindTensorMemoryInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM);
        return s;
    }
    public VkBindTensorMemoryInfoARM copyFrom(VkBindTensorMemoryInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindTensorMemoryInfoARM reinterpret(long count) { return new VkBindTensorMemoryInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindTensorMemoryInfoARM asSlice(long index) { return new VkBindTensorMemoryInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindTensorMemoryInfoARM asSlice(long index, long count) { return new VkBindTensorMemoryInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindTensorMemoryInfoARM at(long index, Consumer<VkBindTensorMemoryInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long tensorAt(long index) { return (long) VH_tensor.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long memoryOffsetAt(long index) { return (long) VH_memoryOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long tensor() { return (long) VH_tensor.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long memoryOffset() { return (long) VH_memoryOffset.get(this.segment(), 0L, 0L); }
    public VkBindTensorMemoryInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindTensorMemoryInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindTensorMemoryInfoARM tensorAt(long index, long value) { VH_tensor.set(this.segment(), 0L, index, value); return this; }
    public VkBindTensorMemoryInfoARM memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkBindTensorMemoryInfoARM memoryOffsetAt(long index, long value) { VH_memoryOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBindTensorMemoryInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindTensorMemoryInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindTensorMemoryInfoARM tensor(long value) { VH_tensor.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindTensorMemoryInfoARM memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindTensorMemoryInfoARM memoryOffset(long value) { VH_memoryOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindTensorMemoryInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindTensorMemoryInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindTensorMemoryInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindTensorMemoryInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tensorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensor, index), LAYOUT_tensor); }
    public MemorySegment _tensor() { return _tensorAt(0L); }
    public VkBindTensorMemoryInfoARM _tensorAt(long index, MemorySegment src) { _tensorAt(index).copyFrom(src); return this; }
    public VkBindTensorMemoryInfoARM _tensor(MemorySegment src) { return _tensorAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkBindTensorMemoryInfoARM _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkBindTensorMemoryInfoARM _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _memoryOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryOffset, index), LAYOUT_memoryOffset); }
    public MemorySegment _memoryOffset() { return _memoryOffsetAt(0L); }
    public VkBindTensorMemoryInfoARM _memoryOffsetAt(long index, MemorySegment src) { _memoryOffsetAt(index).copyFrom(src); return this; }
    public VkBindTensorMemoryInfoARM _memoryOffset(MemorySegment src) { return _memoryOffsetAt(0L, src); }
}
