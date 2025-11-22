// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOffset2D`.
/// ## Layout
/// ```
/// struct VkOffset2D {
///     int32_t x;
///     int32_t y;
/// }
/// ```
public final class VkOffset2D extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y")
    );
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));

    public VkOffset2D(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkOffset2D of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOffset2D(segment, estimateCount(segment, LAYOUT)); }
    public static VkOffset2D ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOffset2D(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkOffset2D ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOffset2D(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkOffset2D alloc(SegmentAllocator allocator) { return new VkOffset2D(allocator.allocate(LAYOUT), 1); }
    public static VkOffset2D alloc(SegmentAllocator allocator, long count) { return new VkOffset2D(allocator.allocate(LAYOUT, count), count); }
    public VkOffset2D copyFrom(VkOffset2D src) { this.segment().copyFrom(src.segment()); return this; }
    public VkOffset2D reinterpret(long count) { return new VkOffset2D(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkOffset2D asSlice(long index) { return new VkOffset2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkOffset2D asSlice(long index, long count) { return new VkOffset2D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkOffset2D at(long index, Consumer<VkOffset2D> func) { func.accept(asSlice(index)); return this; }
    public int xAt(long index) { return (int) VH_x.get(this.segment(), 0L, index); }
    public int yAt(long index) { return (int) VH_y.get(this.segment(), 0L, index); }
    public int x() { return (int) VH_x.get(this.segment(), 0L, 0L); }
    public int y() { return (int) VH_y.get(this.segment(), 0L, 0L); }
    public VkOffset2D xAt(long index, int value) { VH_x.set(this.segment(), 0L, index, value); return this; }
    public VkOffset2D yAt(long index, int value) { VH_y.set(this.segment(), 0L, index, value); return this; }
    public VkOffset2D x(int value) { VH_x.set(this.segment(), 0L, 0L, value); return this; }
    public VkOffset2D y(int value) { VH_y.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _xAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_x, index), LAYOUT_x); }
    public MemorySegment _x() { return _xAt(0L); }
    public VkOffset2D _xAt(long index, MemorySegment src) { _xAt(index).copyFrom(src); return this; }
    public VkOffset2D _x(MemorySegment src) { return _xAt(0L, src); }
    public MemorySegment _yAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_y, index), LAYOUT_y); }
    public MemorySegment _y() { return _yAt(0L); }
    public VkOffset2D _yAt(long index, MemorySegment src) { _yAt(index).copyFrom(src); return this; }
    public VkOffset2D _y(MemorySegment src) { return _yAt(0L, src); }
}
