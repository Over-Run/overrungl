// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferCopy`.
/// ## Layout
/// ```
/// struct VkBufferCopy {
///     VkDeviceSize srcOffset;
///     VkDeviceSize dstOffset;
///     VkDeviceSize size;
/// }
/// ```
public final class VkBufferCopy extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcOffset"),
        ValueLayout.JAVA_LONG.withName("dstOffset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_srcOffset = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
    public static final long OFFSET_dstOffset = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_srcOffset = LAYOUT.select(PathElement.groupElement("srcOffset"));
    public static final MemoryLayout LAYOUT_dstOffset = LAYOUT.select(PathElement.groupElement("dstOffset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_srcOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffset"));
    public static final VarHandle VH_dstOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkBufferCopy(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferCopy of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferCopy ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferCopy ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferCopy alloc(SegmentAllocator allocator) { return new VkBufferCopy(allocator.allocate(LAYOUT), 1); }
    public static VkBufferCopy alloc(SegmentAllocator allocator, long count) { return new VkBufferCopy(allocator.allocate(LAYOUT, count), count); }
    public VkBufferCopy copyFrom(VkBufferCopy src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferCopy reinterpret(long count) { return new VkBufferCopy(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferCopy asSlice(long index) { return new VkBufferCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferCopy asSlice(long index, long count) { return new VkBufferCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferCopy at(long index, Consumer<VkBufferCopy> func) { func.accept(asSlice(index)); return this; }
    public long srcOffsetAt(long index) { return (long) VH_srcOffset.get(this.segment(), 0L, index); }
    public long dstOffsetAt(long index) { return (long) VH_dstOffset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public long srcOffset() { return (long) VH_srcOffset.get(this.segment(), 0L, 0L); }
    public long dstOffset() { return (long) VH_dstOffset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkBufferCopy srcOffsetAt(long index, long value) { VH_srcOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCopy dstOffsetAt(long index, long value) { VH_dstOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCopy sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCopy srcOffset(long value) { VH_srcOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCopy dstOffset(long value) { VH_dstOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCopy size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _srcOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcOffset, index), LAYOUT_srcOffset); }
    public MemorySegment _srcOffset() { return _srcOffsetAt(0L); }
    public VkBufferCopy _srcOffsetAt(long index, MemorySegment src) { _srcOffsetAt(index).copyFrom(src); return this; }
    public VkBufferCopy _srcOffset(MemorySegment src) { return _srcOffsetAt(0L, src); }
    public MemorySegment _dstOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstOffset, index), LAYOUT_dstOffset); }
    public MemorySegment _dstOffset() { return _dstOffsetAt(0L); }
    public VkBufferCopy _dstOffsetAt(long index, MemorySegment src) { _dstOffsetAt(index).copyFrom(src); return this; }
    public VkBufferCopy _dstOffset(MemorySegment src) { return _dstOffsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkBufferCopy _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkBufferCopy _size(MemorySegment src) { return _sizeAt(0L, src); }
}
