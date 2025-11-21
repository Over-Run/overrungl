// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSparseMemoryBind`.
/// ## Layout
/// ```
/// struct VkSparseMemoryBind {
///     VkDeviceSize resourceOffset;
///     VkDeviceSize size;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     VkSparseMemoryBindFlags flags;
/// }
/// ```
public final class VkSparseMemoryBind extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("resourceOffset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_resourceOffset = LAYOUT.byteOffset(PathElement.groupElement("resourceOffset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_resourceOffset = LAYOUT.select(PathElement.groupElement("resourceOffset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_resourceOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceOffset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkSparseMemoryBind(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSparseMemoryBind of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment, estimateCount(segment, LAYOUT)); }
    public static VkSparseMemoryBind ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSparseMemoryBind ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSparseMemoryBind alloc(SegmentAllocator allocator) { return new VkSparseMemoryBind(allocator.allocate(LAYOUT), 1); }
    public static VkSparseMemoryBind alloc(SegmentAllocator allocator, long count) { return new VkSparseMemoryBind(allocator.allocate(LAYOUT, count), count); }
    public VkSparseMemoryBind copyFrom(VkSparseMemoryBind src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSparseMemoryBind reinterpret(long count) { return new VkSparseMemoryBind(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSparseMemoryBind asSlice(long index) { return new VkSparseMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSparseMemoryBind asSlice(long index, long count) { return new VkSparseMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSparseMemoryBind at(long index, Consumer<VkSparseMemoryBind> func) { func.accept(asSlice(index)); return this; }
    public long resourceOffsetAt(long index) { return (long) VH_resourceOffset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long memoryOffsetAt(long index) { return (long) VH_memoryOffset.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long resourceOffset() { return (long) VH_resourceOffset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long memoryOffset() { return (long) VH_memoryOffset.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkSparseMemoryBind resourceOffsetAt(long index, long value) { VH_resourceOffset.set(this.segment(), 0L, index, value); return this; }
    public VkSparseMemoryBind sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkSparseMemoryBind memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkSparseMemoryBind memoryOffsetAt(long index, long value) { VH_memoryOffset.set(this.segment(), 0L, index, value); return this; }
    public VkSparseMemoryBind flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkSparseMemoryBind resourceOffset(long value) { VH_resourceOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseMemoryBind size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseMemoryBind memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseMemoryBind memoryOffset(long value) { VH_memoryOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseMemoryBind flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _resourceOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resourceOffset, index), LAYOUT_resourceOffset); }
    public MemorySegment _resourceOffset() { return _resourceOffsetAt(0L); }
    public VkSparseMemoryBind _resourceOffsetAt(long index, MemorySegment src) { _resourceOffsetAt(index).copyFrom(src); return this; }
    public VkSparseMemoryBind _resourceOffset(MemorySegment src) { return _resourceOffsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkSparseMemoryBind _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkSparseMemoryBind _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkSparseMemoryBind _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkSparseMemoryBind _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _memoryOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryOffset, index), LAYOUT_memoryOffset); }
    public MemorySegment _memoryOffset() { return _memoryOffsetAt(0L); }
    public VkSparseMemoryBind _memoryOffsetAt(long index, MemorySegment src) { _memoryOffsetAt(index).copyFrom(src); return this; }
    public VkSparseMemoryBind _memoryOffset(MemorySegment src) { return _memoryOffsetAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkSparseMemoryBind _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkSparseMemoryBind _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
