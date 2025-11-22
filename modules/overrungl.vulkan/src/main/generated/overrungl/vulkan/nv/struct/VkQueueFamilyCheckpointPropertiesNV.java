// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyCheckpointPropertiesNV`.
/// ## Layout
/// ```
/// struct VkQueueFamilyCheckpointPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkPipelineStageFlags checkpointExecutionStageMask;
/// }
/// ```
public final class VkQueueFamilyCheckpointPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("checkpointExecutionStageMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_checkpointExecutionStageMask = LAYOUT.byteOffset(PathElement.groupElement("checkpointExecutionStageMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_checkpointExecutionStageMask = LAYOUT.select(PathElement.groupElement("checkpointExecutionStageMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_checkpointExecutionStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("checkpointExecutionStageMask"));

    public VkQueueFamilyCheckpointPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyCheckpointPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyCheckpointPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyCheckpointPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyCheckpointPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyCheckpointPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyCheckpointPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyCheckpointPropertiesNV alloc(SegmentAllocator allocator) { return new VkQueueFamilyCheckpointPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyCheckpointPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyCheckpointPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkQueueFamilyCheckpointPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV); }
    public static VkQueueFamilyCheckpointPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV);
        return s;
    }
    public VkQueueFamilyCheckpointPropertiesNV copyFrom(VkQueueFamilyCheckpointPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyCheckpointPropertiesNV reinterpret(long count) { return new VkQueueFamilyCheckpointPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyCheckpointPropertiesNV asSlice(long index) { return new VkQueueFamilyCheckpointPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyCheckpointPropertiesNV asSlice(long index, long count) { return new VkQueueFamilyCheckpointPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyCheckpointPropertiesNV at(long index, Consumer<VkQueueFamilyCheckpointPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int checkpointExecutionStageMaskAt(long index) { return (int) VH_checkpointExecutionStageMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int checkpointExecutionStageMask() { return (int) VH_checkpointExecutionStageMask.get(this.segment(), 0L, 0L); }
    public VkQueueFamilyCheckpointPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyCheckpointPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyCheckpointPropertiesNV checkpointExecutionStageMaskAt(long index, int value) { VH_checkpointExecutionStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyCheckpointPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyCheckpointPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyCheckpointPropertiesNV checkpointExecutionStageMask(int value) { VH_checkpointExecutionStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueueFamilyCheckpointPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueueFamilyCheckpointPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueueFamilyCheckpointPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueueFamilyCheckpointPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _checkpointExecutionStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_checkpointExecutionStageMask, index), LAYOUT_checkpointExecutionStageMask); }
    public MemorySegment _checkpointExecutionStageMask() { return _checkpointExecutionStageMaskAt(0L); }
    public VkQueueFamilyCheckpointPropertiesNV _checkpointExecutionStageMaskAt(long index, MemorySegment src) { _checkpointExecutionStageMaskAt(index).copyFrom(src); return this; }
    public VkQueueFamilyCheckpointPropertiesNV _checkpointExecutionStageMask(MemorySegment src) { return _checkpointExecutionStageMaskAt(0L, src); }
}
