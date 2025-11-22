// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAabbPositionsKHR`.
/// ## Layout
/// ```
/// struct VkAabbPositionsKHR {
///     float minX;
///     float minY;
///     float minZ;
///     float maxX;
///     float maxY;
///     float maxZ;
/// }
/// ```
public final class VkAabbPositionsKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("minX"),
        ValueLayout.JAVA_FLOAT.withName("minY"),
        ValueLayout.JAVA_FLOAT.withName("minZ"),
        ValueLayout.JAVA_FLOAT.withName("maxX"),
        ValueLayout.JAVA_FLOAT.withName("maxY"),
        ValueLayout.JAVA_FLOAT.withName("maxZ")
    );
    public static final long OFFSET_minX = LAYOUT.byteOffset(PathElement.groupElement("minX"));
    public static final long OFFSET_minY = LAYOUT.byteOffset(PathElement.groupElement("minY"));
    public static final long OFFSET_minZ = LAYOUT.byteOffset(PathElement.groupElement("minZ"));
    public static final long OFFSET_maxX = LAYOUT.byteOffset(PathElement.groupElement("maxX"));
    public static final long OFFSET_maxY = LAYOUT.byteOffset(PathElement.groupElement("maxY"));
    public static final long OFFSET_maxZ = LAYOUT.byteOffset(PathElement.groupElement("maxZ"));
    public static final MemoryLayout LAYOUT_minX = LAYOUT.select(PathElement.groupElement("minX"));
    public static final MemoryLayout LAYOUT_minY = LAYOUT.select(PathElement.groupElement("minY"));
    public static final MemoryLayout LAYOUT_minZ = LAYOUT.select(PathElement.groupElement("minZ"));
    public static final MemoryLayout LAYOUT_maxX = LAYOUT.select(PathElement.groupElement("maxX"));
    public static final MemoryLayout LAYOUT_maxY = LAYOUT.select(PathElement.groupElement("maxY"));
    public static final MemoryLayout LAYOUT_maxZ = LAYOUT.select(PathElement.groupElement("maxZ"));
    public static final VarHandle VH_minX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minX"));
    public static final VarHandle VH_minY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minY"));
    public static final VarHandle VH_minZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minZ"));
    public static final VarHandle VH_maxX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxX"));
    public static final VarHandle VH_maxY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxY"));
    public static final VarHandle VH_maxZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxZ"));

    public VkAabbPositionsKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAabbPositionsKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAabbPositionsKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAabbPositionsKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAabbPositionsKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAabbPositionsKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAabbPositionsKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAabbPositionsKHR alloc(SegmentAllocator allocator) { return new VkAabbPositionsKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAabbPositionsKHR alloc(SegmentAllocator allocator, long count) { return new VkAabbPositionsKHR(allocator.allocate(LAYOUT, count), count); }
    public VkAabbPositionsKHR copyFrom(VkAabbPositionsKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAabbPositionsKHR reinterpret(long count) { return new VkAabbPositionsKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAabbPositionsKHR asSlice(long index) { return new VkAabbPositionsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAabbPositionsKHR asSlice(long index, long count) { return new VkAabbPositionsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAabbPositionsKHR at(long index, Consumer<VkAabbPositionsKHR> func) { func.accept(asSlice(index)); return this; }
    public float minXAt(long index) { return (float) VH_minX.get(this.segment(), 0L, index); }
    public float minYAt(long index) { return (float) VH_minY.get(this.segment(), 0L, index); }
    public float minZAt(long index) { return (float) VH_minZ.get(this.segment(), 0L, index); }
    public float maxXAt(long index) { return (float) VH_maxX.get(this.segment(), 0L, index); }
    public float maxYAt(long index) { return (float) VH_maxY.get(this.segment(), 0L, index); }
    public float maxZAt(long index) { return (float) VH_maxZ.get(this.segment(), 0L, index); }
    public float minX() { return (float) VH_minX.get(this.segment(), 0L, 0L); }
    public float minY() { return (float) VH_minY.get(this.segment(), 0L, 0L); }
    public float minZ() { return (float) VH_minZ.get(this.segment(), 0L, 0L); }
    public float maxX() { return (float) VH_maxX.get(this.segment(), 0L, 0L); }
    public float maxY() { return (float) VH_maxY.get(this.segment(), 0L, 0L); }
    public float maxZ() { return (float) VH_maxZ.get(this.segment(), 0L, 0L); }
    public VkAabbPositionsKHR minXAt(long index, float value) { VH_minX.set(this.segment(), 0L, index, value); return this; }
    public VkAabbPositionsKHR minYAt(long index, float value) { VH_minY.set(this.segment(), 0L, index, value); return this; }
    public VkAabbPositionsKHR minZAt(long index, float value) { VH_minZ.set(this.segment(), 0L, index, value); return this; }
    public VkAabbPositionsKHR maxXAt(long index, float value) { VH_maxX.set(this.segment(), 0L, index, value); return this; }
    public VkAabbPositionsKHR maxYAt(long index, float value) { VH_maxY.set(this.segment(), 0L, index, value); return this; }
    public VkAabbPositionsKHR maxZAt(long index, float value) { VH_maxZ.set(this.segment(), 0L, index, value); return this; }
    public VkAabbPositionsKHR minX(float value) { VH_minX.set(this.segment(), 0L, 0L, value); return this; }
    public VkAabbPositionsKHR minY(float value) { VH_minY.set(this.segment(), 0L, 0L, value); return this; }
    public VkAabbPositionsKHR minZ(float value) { VH_minZ.set(this.segment(), 0L, 0L, value); return this; }
    public VkAabbPositionsKHR maxX(float value) { VH_maxX.set(this.segment(), 0L, 0L, value); return this; }
    public VkAabbPositionsKHR maxY(float value) { VH_maxY.set(this.segment(), 0L, 0L, value); return this; }
    public VkAabbPositionsKHR maxZ(float value) { VH_maxZ.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _minXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minX, index), LAYOUT_minX); }
    public MemorySegment _minX() { return _minXAt(0L); }
    public VkAabbPositionsKHR _minXAt(long index, MemorySegment src) { _minXAt(index).copyFrom(src); return this; }
    public VkAabbPositionsKHR _minX(MemorySegment src) { return _minXAt(0L, src); }
    public MemorySegment _minYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minY, index), LAYOUT_minY); }
    public MemorySegment _minY() { return _minYAt(0L); }
    public VkAabbPositionsKHR _minYAt(long index, MemorySegment src) { _minYAt(index).copyFrom(src); return this; }
    public VkAabbPositionsKHR _minY(MemorySegment src) { return _minYAt(0L, src); }
    public MemorySegment _minZAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minZ, index), LAYOUT_minZ); }
    public MemorySegment _minZ() { return _minZAt(0L); }
    public VkAabbPositionsKHR _minZAt(long index, MemorySegment src) { _minZAt(index).copyFrom(src); return this; }
    public VkAabbPositionsKHR _minZ(MemorySegment src) { return _minZAt(0L, src); }
    public MemorySegment _maxXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxX, index), LAYOUT_maxX); }
    public MemorySegment _maxX() { return _maxXAt(0L); }
    public VkAabbPositionsKHR _maxXAt(long index, MemorySegment src) { _maxXAt(index).copyFrom(src); return this; }
    public VkAabbPositionsKHR _maxX(MemorySegment src) { return _maxXAt(0L, src); }
    public MemorySegment _maxYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxY, index), LAYOUT_maxY); }
    public MemorySegment _maxY() { return _maxYAt(0L); }
    public VkAabbPositionsKHR _maxYAt(long index, MemorySegment src) { _maxYAt(index).copyFrom(src); return this; }
    public VkAabbPositionsKHR _maxY(MemorySegment src) { return _maxYAt(0L, src); }
    public MemorySegment _maxZAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxZ, index), LAYOUT_maxZ); }
    public MemorySegment _maxZ() { return _maxZAt(0L); }
    public VkAabbPositionsKHR _maxZAt(long index, MemorySegment src) { _maxZAt(index).copyFrom(src); return this; }
    public VkAabbPositionsKHR _maxZ(MemorySegment src) { return _maxZAt(0L, src); }
}
