// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDispatchIndirectCommand`.
/// ## Layout
/// ```
/// struct VkDispatchIndirectCommand {
///     uint32_t x;
///     uint32_t y;
///     uint32_t z;
/// }
/// ```
public final class VkDispatchIndirectCommand extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z")
    );
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    public static final long OFFSET_z = LAYOUT.byteOffset(PathElement.groupElement("z"));
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    public static final MemoryLayout LAYOUT_z = LAYOUT.select(PathElement.groupElement("z"));
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    public static final VarHandle VH_z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("z"));

    public VkDispatchIndirectCommand(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDispatchIndirectCommand of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchIndirectCommand(segment, estimateCount(segment, LAYOUT)); }
    public static VkDispatchIndirectCommand ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchIndirectCommand(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDispatchIndirectCommand ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchIndirectCommand(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDispatchIndirectCommand alloc(SegmentAllocator allocator) { return new VkDispatchIndirectCommand(allocator.allocate(LAYOUT), 1); }
    public static VkDispatchIndirectCommand alloc(SegmentAllocator allocator, long count) { return new VkDispatchIndirectCommand(allocator.allocate(LAYOUT, count), count); }
    public VkDispatchIndirectCommand copyFrom(VkDispatchIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDispatchIndirectCommand reinterpret(long count) { return new VkDispatchIndirectCommand(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDispatchIndirectCommand asSlice(long index) { return new VkDispatchIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDispatchIndirectCommand asSlice(long index, long count) { return new VkDispatchIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDispatchIndirectCommand at(long index, Consumer<VkDispatchIndirectCommand> func) { func.accept(asSlice(index)); return this; }
    public int xAt(long index) { return (int) VH_x.get(this.segment(), 0L, index); }
    public int yAt(long index) { return (int) VH_y.get(this.segment(), 0L, index); }
    public int zAt(long index) { return (int) VH_z.get(this.segment(), 0L, index); }
    public int x() { return (int) VH_x.get(this.segment(), 0L, 0L); }
    public int y() { return (int) VH_y.get(this.segment(), 0L, 0L); }
    public int z() { return (int) VH_z.get(this.segment(), 0L, 0L); }
    public VkDispatchIndirectCommand xAt(long index, int value) { VH_x.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchIndirectCommand yAt(long index, int value) { VH_y.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchIndirectCommand zAt(long index, int value) { VH_z.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchIndirectCommand x(int value) { VH_x.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchIndirectCommand y(int value) { VH_y.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchIndirectCommand z(int value) { VH_z.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _xAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_x, index), LAYOUT_x); }
    public MemorySegment _x() { return _xAt(0L); }
    public VkDispatchIndirectCommand _xAt(long index, MemorySegment src) { _xAt(index).copyFrom(src); return this; }
    public VkDispatchIndirectCommand _x(MemorySegment src) { return _xAt(0L, src); }
    public MemorySegment _yAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_y, index), LAYOUT_y); }
    public MemorySegment _y() { return _yAt(0L); }
    public VkDispatchIndirectCommand _yAt(long index, MemorySegment src) { _yAt(index).copyFrom(src); return this; }
    public VkDispatchIndirectCommand _y(MemorySegment src) { return _yAt(0L, src); }
    public MemorySegment _zAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_z, index), LAYOUT_z); }
    public MemorySegment _z() { return _zAt(0L); }
    public VkDispatchIndirectCommand _zAt(long index, MemorySegment src) { _zAt(index).copyFrom(src); return this; }
    public VkDispatchIndirectCommand _z(MemorySegment src) { return _zAt(0L, src); }
}
