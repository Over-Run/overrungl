// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubresourceLayout`.
/// ## Layout
/// ```
/// struct VkSubresourceLayout {
///     VkDeviceSize offset;
///     VkDeviceSize size;
///     VkDeviceSize rowPitch;
///     VkDeviceSize arrayPitch;
///     VkDeviceSize depthPitch;
/// }
/// ```
public final class VkSubresourceLayout extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("rowPitch"),
        ValueLayout.JAVA_LONG.withName("arrayPitch"),
        ValueLayout.JAVA_LONG.withName("depthPitch")
    );
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_rowPitch = LAYOUT.byteOffset(PathElement.groupElement("rowPitch"));
    public static final long OFFSET_arrayPitch = LAYOUT.byteOffset(PathElement.groupElement("arrayPitch"));
    public static final long OFFSET_depthPitch = LAYOUT.byteOffset(PathElement.groupElement("depthPitch"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_rowPitch = LAYOUT.select(PathElement.groupElement("rowPitch"));
    public static final MemoryLayout LAYOUT_arrayPitch = LAYOUT.select(PathElement.groupElement("arrayPitch"));
    public static final MemoryLayout LAYOUT_depthPitch = LAYOUT.select(PathElement.groupElement("depthPitch"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_rowPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rowPitch"));
    public static final VarHandle VH_arrayPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayPitch"));
    public static final VarHandle VH_depthPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthPitch"));

    public VkSubresourceLayout(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubresourceLayout of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubresourceLayout ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubresourceLayout ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubresourceLayout alloc(SegmentAllocator allocator) { return new VkSubresourceLayout(allocator.allocate(LAYOUT), 1); }
    public static VkSubresourceLayout alloc(SegmentAllocator allocator, long count) { return new VkSubresourceLayout(allocator.allocate(LAYOUT, count), count); }
    public VkSubresourceLayout copyFrom(VkSubresourceLayout src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubresourceLayout reinterpret(long count) { return new VkSubresourceLayout(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubresourceLayout asSlice(long index) { return new VkSubresourceLayout(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubresourceLayout asSlice(long index, long count) { return new VkSubresourceLayout(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubresourceLayout at(long index, Consumer<VkSubresourceLayout> func) { func.accept(asSlice(index)); return this; }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public long rowPitchAt(long index) { return (long) VH_rowPitch.get(this.segment(), 0L, index); }
    public long arrayPitchAt(long index) { return (long) VH_arrayPitch.get(this.segment(), 0L, index); }
    public long depthPitchAt(long index) { return (long) VH_depthPitch.get(this.segment(), 0L, index); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public long rowPitch() { return (long) VH_rowPitch.get(this.segment(), 0L, 0L); }
    public long arrayPitch() { return (long) VH_arrayPitch.get(this.segment(), 0L, 0L); }
    public long depthPitch() { return (long) VH_depthPitch.get(this.segment(), 0L, 0L); }
    public VkSubresourceLayout offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout rowPitchAt(long index, long value) { VH_rowPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout arrayPitchAt(long index, long value) { VH_arrayPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout depthPitchAt(long index, long value) { VH_depthPitch.set(this.segment(), 0L, index, value); return this; }
    public VkSubresourceLayout offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout rowPitch(long value) { VH_rowPitch.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout arrayPitch(long value) { VH_arrayPitch.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubresourceLayout depthPitch(long value) { VH_depthPitch.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkSubresourceLayout _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkSubresourceLayout _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _rowPitchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rowPitch, index), LAYOUT_rowPitch); }
    public MemorySegment _rowPitch() { return _rowPitchAt(0L); }
    public VkSubresourceLayout _rowPitchAt(long index, MemorySegment src) { _rowPitchAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout _rowPitch(MemorySegment src) { return _rowPitchAt(0L, src); }
    public MemorySegment _arrayPitchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_arrayPitch, index), LAYOUT_arrayPitch); }
    public MemorySegment _arrayPitch() { return _arrayPitchAt(0L); }
    public VkSubresourceLayout _arrayPitchAt(long index, MemorySegment src) { _arrayPitchAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout _arrayPitch(MemorySegment src) { return _arrayPitchAt(0L, src); }
    public MemorySegment _depthPitchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthPitch, index), LAYOUT_depthPitch); }
    public MemorySegment _depthPitch() { return _depthPitchAt(0L); }
    public VkSubresourceLayout _depthPitchAt(long index, MemorySegment src) { _depthPitchAt(index).copyFrom(src); return this; }
    public VkSubresourceLayout _depthPitch(MemorySegment src) { return _depthPitchAt(0L, src); }
}
