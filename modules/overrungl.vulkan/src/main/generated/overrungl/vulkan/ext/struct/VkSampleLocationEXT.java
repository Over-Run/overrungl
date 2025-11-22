// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSampleLocationEXT`.
/// ## Layout
/// ```
/// struct VkSampleLocationEXT {
///     float x;
///     float y;
/// }
/// ```
public final class VkSampleLocationEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y")
    );
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));

    public VkSampleLocationEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSampleLocationEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSampleLocationEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSampleLocationEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSampleLocationEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSampleLocationEXT alloc(SegmentAllocator allocator) { return new VkSampleLocationEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSampleLocationEXT alloc(SegmentAllocator allocator, long count) { return new VkSampleLocationEXT(allocator.allocate(LAYOUT, count), count); }
    public VkSampleLocationEXT copyFrom(VkSampleLocationEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSampleLocationEXT reinterpret(long count) { return new VkSampleLocationEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSampleLocationEXT asSlice(long index) { return new VkSampleLocationEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSampleLocationEXT asSlice(long index, long count) { return new VkSampleLocationEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSampleLocationEXT at(long index, Consumer<VkSampleLocationEXT> func) { func.accept(asSlice(index)); return this; }
    public float xAt(long index) { return (float) VH_x.get(this.segment(), 0L, index); }
    public float yAt(long index) { return (float) VH_y.get(this.segment(), 0L, index); }
    public float x() { return (float) VH_x.get(this.segment(), 0L, 0L); }
    public float y() { return (float) VH_y.get(this.segment(), 0L, 0L); }
    public VkSampleLocationEXT xAt(long index, float value) { VH_x.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationEXT yAt(long index, float value) { VH_y.set(this.segment(), 0L, index, value); return this; }
    public VkSampleLocationEXT x(float value) { VH_x.set(this.segment(), 0L, 0L, value); return this; }
    public VkSampleLocationEXT y(float value) { VH_y.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _xAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_x, index), LAYOUT_x); }
    public MemorySegment _x() { return _xAt(0L); }
    public VkSampleLocationEXT _xAt(long index, MemorySegment src) { _xAt(index).copyFrom(src); return this; }
    public VkSampleLocationEXT _x(MemorySegment src) { return _xAt(0L, src); }
    public MemorySegment _yAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_y, index), LAYOUT_y); }
    public MemorySegment _y() { return _yAt(0L); }
    public VkSampleLocationEXT _yAt(long index, MemorySegment src) { _yAt(index).copyFrom(src); return this; }
    public VkSampleLocationEXT _y(MemorySegment src) { return _yAt(0L, src); }
}
