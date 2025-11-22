// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrawMeshTasksIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkDrawMeshTasksIndirectCommandNV {
///     uint32_t taskCount;
///     uint32_t firstTask;
/// }
/// ```
public final class VkDrawMeshTasksIndirectCommandNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("taskCount"),
        ValueLayout.JAVA_INT.withName("firstTask")
    );
    public static final long OFFSET_taskCount = LAYOUT.byteOffset(PathElement.groupElement("taskCount"));
    public static final long OFFSET_firstTask = LAYOUT.byteOffset(PathElement.groupElement("firstTask"));
    public static final MemoryLayout LAYOUT_taskCount = LAYOUT.select(PathElement.groupElement("taskCount"));
    public static final MemoryLayout LAYOUT_firstTask = LAYOUT.select(PathElement.groupElement("firstTask"));
    public static final VarHandle VH_taskCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("taskCount"));
    public static final VarHandle VH_firstTask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstTask"));

    public VkDrawMeshTasksIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDrawMeshTasksIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkDrawMeshTasksIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDrawMeshTasksIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDrawMeshTasksIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkDrawMeshTasksIndirectCommandNV(allocator.allocate(LAYOUT), 1); }
    public static VkDrawMeshTasksIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkDrawMeshTasksIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }
    public VkDrawMeshTasksIndirectCommandNV copyFrom(VkDrawMeshTasksIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDrawMeshTasksIndirectCommandNV reinterpret(long count) { return new VkDrawMeshTasksIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDrawMeshTasksIndirectCommandNV asSlice(long index) { return new VkDrawMeshTasksIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDrawMeshTasksIndirectCommandNV asSlice(long index, long count) { return new VkDrawMeshTasksIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDrawMeshTasksIndirectCommandNV at(long index, Consumer<VkDrawMeshTasksIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }
    public int taskCountAt(long index) { return (int) VH_taskCount.get(this.segment(), 0L, index); }
    public int firstTaskAt(long index) { return (int) VH_firstTask.get(this.segment(), 0L, index); }
    public int taskCount() { return (int) VH_taskCount.get(this.segment(), 0L, 0L); }
    public int firstTask() { return (int) VH_firstTask.get(this.segment(), 0L, 0L); }
    public VkDrawMeshTasksIndirectCommandNV taskCountAt(long index, int value) { VH_taskCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrawMeshTasksIndirectCommandNV firstTaskAt(long index, int value) { VH_firstTask.set(this.segment(), 0L, index, value); return this; }
    public VkDrawMeshTasksIndirectCommandNV taskCount(int value) { VH_taskCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrawMeshTasksIndirectCommandNV firstTask(int value) { VH_firstTask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _taskCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_taskCount, index), LAYOUT_taskCount); }
    public MemorySegment _taskCount() { return _taskCountAt(0L); }
    public VkDrawMeshTasksIndirectCommandNV _taskCountAt(long index, MemorySegment src) { _taskCountAt(index).copyFrom(src); return this; }
    public VkDrawMeshTasksIndirectCommandNV _taskCount(MemorySegment src) { return _taskCountAt(0L, src); }
    public MemorySegment _firstTaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstTask, index), LAYOUT_firstTask); }
    public MemorySegment _firstTask() { return _firstTaskAt(0L); }
    public VkDrawMeshTasksIndirectCommandNV _firstTaskAt(long index, MemorySegment src) { _firstTaskAt(index).copyFrom(src); return this; }
    public VkDrawMeshTasksIndirectCommandNV _firstTask(MemorySegment src) { return _firstTaskAt(0L, src); }
}
