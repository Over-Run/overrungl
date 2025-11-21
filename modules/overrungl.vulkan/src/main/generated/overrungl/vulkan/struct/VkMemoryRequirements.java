// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryRequirements`.
/// ## Layout
/// ```
/// struct VkMemoryRequirements {
///     VkDeviceSize size;
///     VkDeviceSize alignment;
///     uint32_t memoryTypeBits;
/// }
/// ```
public final class VkMemoryRequirements extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("alignment"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_alignment = LAYOUT.byteOffset(PathElement.groupElement("alignment"));
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_alignment = LAYOUT.select(PathElement.groupElement("alignment"));
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_alignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alignment"));
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));

    public VkMemoryRequirements(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryRequirements of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryRequirements ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryRequirements ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryRequirements alloc(SegmentAllocator allocator) { return new VkMemoryRequirements(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryRequirements alloc(SegmentAllocator allocator, long count) { return new VkMemoryRequirements(allocator.allocate(LAYOUT, count), count); }
    public VkMemoryRequirements copyFrom(VkMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryRequirements reinterpret(long count) { return new VkMemoryRequirements(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryRequirements asSlice(long index) { return new VkMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryRequirements asSlice(long index, long count) { return new VkMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryRequirements at(long index, Consumer<VkMemoryRequirements> func) { func.accept(asSlice(index)); return this; }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public long alignmentAt(long index) { return (long) VH_alignment.get(this.segment(), 0L, index); }
    public int memoryTypeBitsAt(long index) { return (int) VH_memoryTypeBits.get(this.segment(), 0L, index); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public long alignment() { return (long) VH_alignment.get(this.segment(), 0L, 0L); }
    public int memoryTypeBits() { return (int) VH_memoryTypeBits.get(this.segment(), 0L, 0L); }
    public VkMemoryRequirements sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryRequirements alignmentAt(long index, long value) { VH_alignment.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryRequirements memoryTypeBitsAt(long index, int value) { VH_memoryTypeBits.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryRequirements size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryRequirements alignment(long value) { VH_alignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryRequirements memoryTypeBits(int value) { VH_memoryTypeBits.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkMemoryRequirements _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkMemoryRequirements _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _alignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_alignment, index), LAYOUT_alignment); }
    public MemorySegment _alignment() { return _alignmentAt(0L); }
    public VkMemoryRequirements _alignmentAt(long index, MemorySegment src) { _alignmentAt(index).copyFrom(src); return this; }
    public VkMemoryRequirements _alignment(MemorySegment src) { return _alignmentAt(0L, src); }
    public MemorySegment _memoryTypeBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypeBits, index), LAYOUT_memoryTypeBits); }
    public MemorySegment _memoryTypeBits() { return _memoryTypeBitsAt(0L); }
    public VkMemoryRequirements _memoryTypeBitsAt(long index, MemorySegment src) { _memoryTypeBitsAt(index).copyFrom(src); return this; }
    public VkMemoryRequirements _memoryTypeBits(MemorySegment src) { return _memoryTypeBitsAt(0L, src); }
}
