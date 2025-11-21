// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkComponentMapping`.
/// ## Layout
/// ```
/// struct VkComponentMapping {
///     VkComponentSwizzle r;
///     VkComponentSwizzle g;
///     VkComponentSwizzle b;
///     VkComponentSwizzle a;
/// }
/// ```
public final class VkComponentMapping extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("r"),
        ValueLayout.JAVA_INT.withName("g"),
        ValueLayout.JAVA_INT.withName("b"),
        ValueLayout.JAVA_INT.withName("a")
    );
    public static final long OFFSET_r = LAYOUT.byteOffset(PathElement.groupElement("r"));
    public static final long OFFSET_g = LAYOUT.byteOffset(PathElement.groupElement("g"));
    public static final long OFFSET_b = LAYOUT.byteOffset(PathElement.groupElement("b"));
    public static final long OFFSET_a = LAYOUT.byteOffset(PathElement.groupElement("a"));
    public static final MemoryLayout LAYOUT_r = LAYOUT.select(PathElement.groupElement("r"));
    public static final MemoryLayout LAYOUT_g = LAYOUT.select(PathElement.groupElement("g"));
    public static final MemoryLayout LAYOUT_b = LAYOUT.select(PathElement.groupElement("b"));
    public static final MemoryLayout LAYOUT_a = LAYOUT.select(PathElement.groupElement("a"));
    public static final VarHandle VH_r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("r"));
    public static final VarHandle VH_g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("g"));
    public static final VarHandle VH_b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("b"));
    public static final VarHandle VH_a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("a"));

    public VkComponentMapping(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkComponentMapping of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComponentMapping(segment, estimateCount(segment, LAYOUT)); }
    public static VkComponentMapping ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComponentMapping(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkComponentMapping ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkComponentMapping(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkComponentMapping alloc(SegmentAllocator allocator) { return new VkComponentMapping(allocator.allocate(LAYOUT), 1); }
    public static VkComponentMapping alloc(SegmentAllocator allocator, long count) { return new VkComponentMapping(allocator.allocate(LAYOUT, count), count); }
    public VkComponentMapping copyFrom(VkComponentMapping src) { this.segment().copyFrom(src.segment()); return this; }
    public VkComponentMapping reinterpret(long count) { return new VkComponentMapping(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkComponentMapping asSlice(long index) { return new VkComponentMapping(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkComponentMapping asSlice(long index, long count) { return new VkComponentMapping(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkComponentMapping at(long index, Consumer<VkComponentMapping> func) { func.accept(asSlice(index)); return this; }
    public int rAt(long index) { return (int) VH_r.get(this.segment(), 0L, index); }
    public int gAt(long index) { return (int) VH_g.get(this.segment(), 0L, index); }
    public int bAt(long index) { return (int) VH_b.get(this.segment(), 0L, index); }
    public int aAt(long index) { return (int) VH_a.get(this.segment(), 0L, index); }
    public int r() { return (int) VH_r.get(this.segment(), 0L, 0L); }
    public int g() { return (int) VH_g.get(this.segment(), 0L, 0L); }
    public int b() { return (int) VH_b.get(this.segment(), 0L, 0L); }
    public int a() { return (int) VH_a.get(this.segment(), 0L, 0L); }
    public VkComponentMapping rAt(long index, int value) { VH_r.set(this.segment(), 0L, index, value); return this; }
    public VkComponentMapping gAt(long index, int value) { VH_g.set(this.segment(), 0L, index, value); return this; }
    public VkComponentMapping bAt(long index, int value) { VH_b.set(this.segment(), 0L, index, value); return this; }
    public VkComponentMapping aAt(long index, int value) { VH_a.set(this.segment(), 0L, index, value); return this; }
    public VkComponentMapping r(int value) { VH_r.set(this.segment(), 0L, 0L, value); return this; }
    public VkComponentMapping g(int value) { VH_g.set(this.segment(), 0L, 0L, value); return this; }
    public VkComponentMapping b(int value) { VH_b.set(this.segment(), 0L, 0L, value); return this; }
    public VkComponentMapping a(int value) { VH_a.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _rAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_r, index), LAYOUT_r); }
    public MemorySegment _r() { return _rAt(0L); }
    public VkComponentMapping _rAt(long index, MemorySegment src) { _rAt(index).copyFrom(src); return this; }
    public VkComponentMapping _r(MemorySegment src) { return _rAt(0L, src); }
    public MemorySegment _gAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_g, index), LAYOUT_g); }
    public MemorySegment _g() { return _gAt(0L); }
    public VkComponentMapping _gAt(long index, MemorySegment src) { _gAt(index).copyFrom(src); return this; }
    public VkComponentMapping _g(MemorySegment src) { return _gAt(0L, src); }
    public MemorySegment _bAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_b, index), LAYOUT_b); }
    public MemorySegment _b() { return _bAt(0L); }
    public VkComponentMapping _bAt(long index, MemorySegment src) { _bAt(index).copyFrom(src); return this; }
    public VkComponentMapping _b(MemorySegment src) { return _bAt(0L, src); }
    public MemorySegment _aAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_a, index), LAYOUT_a); }
    public MemorySegment _a() { return _aAt(0L); }
    public VkComponentMapping _aAt(long index, MemorySegment src) { _aAt(index).copyFrom(src); return this; }
    public VkComponentMapping _a(MemorySegment src) { return _aAt(0L, src); }
}
