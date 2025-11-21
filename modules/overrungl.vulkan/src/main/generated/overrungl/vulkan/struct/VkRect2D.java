// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRect2D`.
/// ## Layout
/// ```
/// struct VkRect2D {
///     VkOffset2D offset;
///     VkExtent2D extent;
/// }
/// ```
public final class VkRect2D extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("extent")
    );
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));
    public static final VarHandle VH_offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("height"));

    public VkRect2D(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRect2D of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRect2D(segment, estimateCount(segment, LAYOUT)); }
    public static VkRect2D ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRect2D(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRect2D ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRect2D(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRect2D alloc(SegmentAllocator allocator) { return new VkRect2D(allocator.allocate(LAYOUT), 1); }
    public static VkRect2D alloc(SegmentAllocator allocator, long count) { return new VkRect2D(allocator.allocate(LAYOUT, count), count); }
    public VkRect2D copyFrom(VkRect2D src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRect2D reinterpret(long count) { return new VkRect2D(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRect2D asSlice(long index) { return new VkRect2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRect2D asSlice(long index, long count) { return new VkRect2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRect2D at(long index, Consumer<VkRect2D> func) { func.accept(asSlice(index)); return this; }
    public int offset$xAt(long index) { return (int) VH_offset$x.get(this.segment(), 0L, index); }
    public int offset$yAt(long index) { return (int) VH_offset$y.get(this.segment(), 0L, index); }
    public int extent$widthAt(long index) { return (int) VH_extent$width.get(this.segment(), 0L, index); }
    public int extent$heightAt(long index) { return (int) VH_extent$height.get(this.segment(), 0L, index); }
    public int offset$x() { return (int) VH_offset$x.get(this.segment(), 0L, 0L); }
    public int offset$y() { return (int) VH_offset$y.get(this.segment(), 0L, 0L); }
    public int extent$width() { return (int) VH_extent$width.get(this.segment(), 0L, 0L); }
    public int extent$height() { return (int) VH_extent$height.get(this.segment(), 0L, 0L); }
    public VkRect2D offset$xAt(long index, int value) { VH_offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkRect2D offset$yAt(long index, int value) { VH_offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkRect2D extent$widthAt(long index, int value) { VH_extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkRect2D extent$heightAt(long index, int value) { VH_extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkRect2D offset$x(int value) { VH_offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkRect2D offset$y(int value) { VH_offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkRect2D extent$width(int value) { VH_extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkRect2D extent$height(int value) { VH_extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkRect2D _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkRect2D _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _extentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    public MemorySegment _extent() { return _extentAt(0L); }
    public VkRect2D _extentAt(long index, MemorySegment src) { _extentAt(index).copyFrom(src); return this; }
    public VkRect2D _extent(MemorySegment src) { return _extentAt(0L, src); }
}
