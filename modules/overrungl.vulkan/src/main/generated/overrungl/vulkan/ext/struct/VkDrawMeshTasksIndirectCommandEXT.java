// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrawMeshTasksIndirectCommandEXT`.
/// ## Layout
/// ```
/// struct VkDrawMeshTasksIndirectCommandEXT {
///     uint32_t groupCountX;
///     uint32_t groupCountY;
///     uint32_t groupCountZ;
/// }
/// ```
public final class VkDrawMeshTasksIndirectCommandEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("groupCountX"),
        ValueLayout.JAVA_INT.withName("groupCountY"),
        ValueLayout.JAVA_INT.withName("groupCountZ")
    );
    public static final long OFFSET_groupCountX = LAYOUT.byteOffset(PathElement.groupElement("groupCountX"));
    public static final long OFFSET_groupCountY = LAYOUT.byteOffset(PathElement.groupElement("groupCountY"));
    public static final long OFFSET_groupCountZ = LAYOUT.byteOffset(PathElement.groupElement("groupCountZ"));
    public static final MemoryLayout LAYOUT_groupCountX = LAYOUT.select(PathElement.groupElement("groupCountX"));
    public static final MemoryLayout LAYOUT_groupCountY = LAYOUT.select(PathElement.groupElement("groupCountY"));
    public static final MemoryLayout LAYOUT_groupCountZ = LAYOUT.select(PathElement.groupElement("groupCountZ"));
    public static final VarHandle VH_groupCountX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountX"));
    public static final VarHandle VH_groupCountY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountY"));
    public static final VarHandle VH_groupCountZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountZ"));

    public VkDrawMeshTasksIndirectCommandEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDrawMeshTasksIndirectCommandEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDrawMeshTasksIndirectCommandEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDrawMeshTasksIndirectCommandEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDrawMeshTasksIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkDrawMeshTasksIndirectCommandEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDrawMeshTasksIndirectCommandEXT alloc(SegmentAllocator allocator, long count) { return new VkDrawMeshTasksIndirectCommandEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDrawMeshTasksIndirectCommandEXT copyFrom(VkDrawMeshTasksIndirectCommandEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDrawMeshTasksIndirectCommandEXT reinterpret(long count) { return new VkDrawMeshTasksIndirectCommandEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDrawMeshTasksIndirectCommandEXT asSlice(long index) { return new VkDrawMeshTasksIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDrawMeshTasksIndirectCommandEXT asSlice(long index, long count) { return new VkDrawMeshTasksIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDrawMeshTasksIndirectCommandEXT at(long index, Consumer<VkDrawMeshTasksIndirectCommandEXT> func) { func.accept(asSlice(index)); return this; }
    public int groupCountXAt(long index) { return (int) VH_groupCountX.get(this.segment(), 0L, index); }
    public int groupCountYAt(long index) { return (int) VH_groupCountY.get(this.segment(), 0L, index); }
    public int groupCountZAt(long index) { return (int) VH_groupCountZ.get(this.segment(), 0L, index); }
    public int groupCountX() { return (int) VH_groupCountX.get(this.segment(), 0L, 0L); }
    public int groupCountY() { return (int) VH_groupCountY.get(this.segment(), 0L, 0L); }
    public int groupCountZ() { return (int) VH_groupCountZ.get(this.segment(), 0L, 0L); }
    public VkDrawMeshTasksIndirectCommandEXT groupCountXAt(long index, int value) { VH_groupCountX.set(this.segment(), 0L, index, value); return this; }
    public VkDrawMeshTasksIndirectCommandEXT groupCountYAt(long index, int value) { VH_groupCountY.set(this.segment(), 0L, index, value); return this; }
    public VkDrawMeshTasksIndirectCommandEXT groupCountZAt(long index, int value) { VH_groupCountZ.set(this.segment(), 0L, index, value); return this; }
    public VkDrawMeshTasksIndirectCommandEXT groupCountX(int value) { VH_groupCountX.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawMeshTasksIndirectCommandEXT groupCountY(int value) { VH_groupCountY.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawMeshTasksIndirectCommandEXT groupCountZ(int value) { VH_groupCountZ.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _groupCountXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_groupCountX, index), LAYOUT_groupCountX); }
    public MemorySegment _groupCountX() { return _groupCountXAt(0L); }
    public VkDrawMeshTasksIndirectCommandEXT _groupCountXAt(long index, MemorySegment src) { _groupCountXAt(index).copyFrom(src); return this; }
    public VkDrawMeshTasksIndirectCommandEXT _groupCountX(MemorySegment src) { return _groupCountXAt(0L, src); }
    public MemorySegment _groupCountYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_groupCountY, index), LAYOUT_groupCountY); }
    public MemorySegment _groupCountY() { return _groupCountYAt(0L); }
    public VkDrawMeshTasksIndirectCommandEXT _groupCountYAt(long index, MemorySegment src) { _groupCountYAt(index).copyFrom(src); return this; }
    public VkDrawMeshTasksIndirectCommandEXT _groupCountY(MemorySegment src) { return _groupCountYAt(0L, src); }
    public MemorySegment _groupCountZAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_groupCountZ, index), LAYOUT_groupCountZ); }
    public MemorySegment _groupCountZ() { return _groupCountZAt(0L); }
    public VkDrawMeshTasksIndirectCommandEXT _groupCountZAt(long index, MemorySegment src) { _groupCountZAt(index).copyFrom(src); return this; }
    public VkDrawMeshTasksIndirectCommandEXT _groupCountZ(MemorySegment src) { return _groupCountZAt(0L, src); }
}
