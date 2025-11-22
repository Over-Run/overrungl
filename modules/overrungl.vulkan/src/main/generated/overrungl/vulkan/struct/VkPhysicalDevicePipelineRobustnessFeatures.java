// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineRobustnessFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineRobustnessFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineRobustness;
/// }
/// ```
public final class VkPhysicalDevicePipelineRobustnessFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineRobustness")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineRobustness = LAYOUT.byteOffset(PathElement.groupElement("pipelineRobustness"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineRobustness = LAYOUT.select(PathElement.groupElement("pipelineRobustness"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineRobustness = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineRobustness"));

    public VkPhysicalDevicePipelineRobustnessFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineRobustnessFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineRobustnessFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineRobustnessFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineRobustnessFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineRobustnessFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineRobustnessFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineRobustnessFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineRobustnessFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES); }
    public static VkPhysicalDevicePipelineRobustnessFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES);
        return s;
    }
    public VkPhysicalDevicePipelineRobustnessFeatures copyFrom(VkPhysicalDevicePipelineRobustnessFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures reinterpret(long count) { return new VkPhysicalDevicePipelineRobustnessFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineRobustnessFeatures asSlice(long index) { return new VkPhysicalDevicePipelineRobustnessFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineRobustnessFeatures asSlice(long index, long count) { return new VkPhysicalDevicePipelineRobustnessFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineRobustnessFeatures at(long index, Consumer<VkPhysicalDevicePipelineRobustnessFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineRobustnessAt(long index) { return (int) VH_pipelineRobustness.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineRobustness() { return (int) VH_pipelineRobustness.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineRobustnessFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures pipelineRobustnessAt(long index, int value) { VH_pipelineRobustness.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures pipelineRobustness(int value) { VH_pipelineRobustness.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineRobustnessFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineRobustnessFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineRobustnessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineRobustness, index), LAYOUT_pipelineRobustness); }
    public MemorySegment _pipelineRobustness() { return _pipelineRobustnessAt(0L); }
    public VkPhysicalDevicePipelineRobustnessFeatures _pipelineRobustnessAt(long index, MemorySegment src) { _pipelineRobustnessAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessFeatures _pipelineRobustness(MemorySegment src) { return _pipelineRobustnessAt(0L, src); }
}
