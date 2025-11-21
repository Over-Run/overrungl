// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkViewportSwizzleNV`.
/// ## Layout
/// ```
/// struct VkViewportSwizzleNV {
///     VkViewportCoordinateSwizzleNV x;
///     VkViewportCoordinateSwizzleNV y;
///     VkViewportCoordinateSwizzleNV z;
///     VkViewportCoordinateSwizzleNV w;
/// }
/// ```
public final class VkViewportSwizzleNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z"),
        ValueLayout.JAVA_INT.withName("w")
    );
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    public static final long OFFSET_z = LAYOUT.byteOffset(PathElement.groupElement("z"));
    public static final long OFFSET_w = LAYOUT.byteOffset(PathElement.groupElement("w"));
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    public static final MemoryLayout LAYOUT_z = LAYOUT.select(PathElement.groupElement("z"));
    public static final MemoryLayout LAYOUT_w = LAYOUT.select(PathElement.groupElement("w"));
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    public static final VarHandle VH_z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("z"));
    public static final VarHandle VH_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("w"));

    public VkViewportSwizzleNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkViewportSwizzleNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkViewportSwizzleNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkViewportSwizzleNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportSwizzleNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkViewportSwizzleNV alloc(SegmentAllocator allocator) { return new VkViewportSwizzleNV(allocator.allocate(LAYOUT), 1); }
    public static VkViewportSwizzleNV alloc(SegmentAllocator allocator, long count) { return new VkViewportSwizzleNV(allocator.allocate(LAYOUT, count), count); }
    public VkViewportSwizzleNV copyFrom(VkViewportSwizzleNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkViewportSwizzleNV reinterpret(long count) { return new VkViewportSwizzleNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkViewportSwizzleNV asSlice(long index) { return new VkViewportSwizzleNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkViewportSwizzleNV asSlice(long index, long count) { return new VkViewportSwizzleNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkViewportSwizzleNV at(long index, Consumer<VkViewportSwizzleNV> func) { func.accept(asSlice(index)); return this; }
    public int xAt(long index) { return (int) VH_x.get(this.segment(), 0L, index); }
    public int yAt(long index) { return (int) VH_y.get(this.segment(), 0L, index); }
    public int zAt(long index) { return (int) VH_z.get(this.segment(), 0L, index); }
    public int wAt(long index) { return (int) VH_w.get(this.segment(), 0L, index); }
    public int x() { return (int) VH_x.get(this.segment(), 0L, 0L); }
    public int y() { return (int) VH_y.get(this.segment(), 0L, 0L); }
    public int z() { return (int) VH_z.get(this.segment(), 0L, 0L); }
    public int w() { return (int) VH_w.get(this.segment(), 0L, 0L); }
    public VkViewportSwizzleNV xAt(long index, int value) { VH_x.set(this.segment(), 0L, index, value); return this; }
    public VkViewportSwizzleNV yAt(long index, int value) { VH_y.set(this.segment(), 0L, index, value); return this; }
    public VkViewportSwizzleNV zAt(long index, int value) { VH_z.set(this.segment(), 0L, index, value); return this; }
    public VkViewportSwizzleNV wAt(long index, int value) { VH_w.set(this.segment(), 0L, index, value); return this; }
    public VkViewportSwizzleNV x(int value) { VH_x.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewportSwizzleNV y(int value) { VH_y.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewportSwizzleNV z(int value) { VH_z.set(this.segment(), 0L, 0L, value); return this; }
    public VkViewportSwizzleNV w(int value) { VH_w.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _xAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_x, index), LAYOUT_x); }
    public MemorySegment _x() { return _xAt(0L); }
    public VkViewportSwizzleNV _xAt(long index, MemorySegment src) { _xAt(index).copyFrom(src); return this; }
    public VkViewportSwizzleNV _x(MemorySegment src) { return _xAt(0L, src); }
    public MemorySegment _yAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_y, index), LAYOUT_y); }
    public MemorySegment _y() { return _yAt(0L); }
    public VkViewportSwizzleNV _yAt(long index, MemorySegment src) { _yAt(index).copyFrom(src); return this; }
    public VkViewportSwizzleNV _y(MemorySegment src) { return _yAt(0L, src); }
    public MemorySegment _zAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_z, index), LAYOUT_z); }
    public MemorySegment _z() { return _zAt(0L); }
    public VkViewportSwizzleNV _zAt(long index, MemorySegment src) { _zAt(index).copyFrom(src); return this; }
    public VkViewportSwizzleNV _z(MemorySegment src) { return _zAt(0L, src); }
    public MemorySegment _wAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_w, index), LAYOUT_w); }
    public MemorySegment _w() { return _wAt(0L); }
    public VkViewportSwizzleNV _wAt(long index, MemorySegment src) { _wAt(index).copyFrom(src); return this; }
    public VkViewportSwizzleNV _w(MemorySegment src) { return _wAt(0L, src); }
}
