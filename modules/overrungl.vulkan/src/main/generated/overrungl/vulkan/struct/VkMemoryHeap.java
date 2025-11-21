// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryHeap`.
/// ## Layout
/// ```
/// struct VkMemoryHeap {
///     VkDeviceSize size;
///     VkMemoryHeapFlags flags;
/// }
/// ```
public final class VkMemoryHeap extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkMemoryHeap(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryHeap of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryHeap(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryHeap ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryHeap(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryHeap ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryHeap(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryHeap alloc(SegmentAllocator allocator) { return new VkMemoryHeap(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryHeap alloc(SegmentAllocator allocator, long count) { return new VkMemoryHeap(allocator.allocate(LAYOUT, count), count); }
    public VkMemoryHeap copyFrom(VkMemoryHeap src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryHeap reinterpret(long count) { return new VkMemoryHeap(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryHeap asSlice(long index) { return new VkMemoryHeap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryHeap asSlice(long index, long count) { return new VkMemoryHeap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryHeap at(long index, Consumer<VkMemoryHeap> func) { func.accept(asSlice(index)); return this; }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkMemoryHeap sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryHeap flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryHeap size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryHeap flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkMemoryHeap _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkMemoryHeap _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkMemoryHeap _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkMemoryHeap _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
