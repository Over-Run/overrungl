// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineRobustnessPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineRobustnessPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs;
///     VkPipelineRobustnessImageBehavior defaultRobustnessImages;
/// }
/// ```
public final class VkPhysicalDevicePipelineRobustnessPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessImages")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_defaultRobustnessStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    public static final long OFFSET_defaultRobustnessUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    public static final long OFFSET_defaultRobustnessVertexInputs = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessVertexInputs"));
    public static final long OFFSET_defaultRobustnessImages = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessImages"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_defaultRobustnessStorageBuffers = LAYOUT.select(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    public static final MemoryLayout LAYOUT_defaultRobustnessUniformBuffers = LAYOUT.select(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    public static final MemoryLayout LAYOUT_defaultRobustnessVertexInputs = LAYOUT.select(PathElement.groupElement("defaultRobustnessVertexInputs"));
    public static final MemoryLayout LAYOUT_defaultRobustnessImages = LAYOUT.select(PathElement.groupElement("defaultRobustnessImages"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_defaultRobustnessStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    public static final VarHandle VH_defaultRobustnessUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    public static final VarHandle VH_defaultRobustnessVertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessVertexInputs"));
    public static final VarHandle VH_defaultRobustnessImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessImages"));

    public VkPhysicalDevicePipelineRobustnessPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES); }
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES);
        return s;
    }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT copyFrom(VkPhysicalDevicePipelineRobustnessPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT reinterpret(long count) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT asSlice(long index) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT at(long index, Consumer<VkPhysicalDevicePipelineRobustnessPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int defaultRobustnessStorageBuffersAt(long index) { return (int) VH_defaultRobustnessStorageBuffers.get(this.segment(), 0L, index); }
    public int defaultRobustnessUniformBuffersAt(long index) { return (int) VH_defaultRobustnessUniformBuffers.get(this.segment(), 0L, index); }
    public int defaultRobustnessVertexInputsAt(long index) { return (int) VH_defaultRobustnessVertexInputs.get(this.segment(), 0L, index); }
    public int defaultRobustnessImagesAt(long index) { return (int) VH_defaultRobustnessImages.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int defaultRobustnessStorageBuffers() { return (int) VH_defaultRobustnessStorageBuffers.get(this.segment(), 0L, 0L); }
    public int defaultRobustnessUniformBuffers() { return (int) VH_defaultRobustnessUniformBuffers.get(this.segment(), 0L, 0L); }
    public int defaultRobustnessVertexInputs() { return (int) VH_defaultRobustnessVertexInputs.get(this.segment(), 0L, 0L); }
    public int defaultRobustnessImages() { return (int) VH_defaultRobustnessImages.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessStorageBuffersAt(long index, int value) { VH_defaultRobustnessStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessUniformBuffersAt(long index, int value) { VH_defaultRobustnessUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessVertexInputsAt(long index, int value) { VH_defaultRobustnessVertexInputs.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessImagesAt(long index, int value) { VH_defaultRobustnessImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessStorageBuffers(int value) { VH_defaultRobustnessStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessUniformBuffers(int value) { VH_defaultRobustnessUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessVertexInputs(int value) { VH_defaultRobustnessVertexInputs.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessImages(int value) { VH_defaultRobustnessImages.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _defaultRobustnessStorageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultRobustnessStorageBuffers, index), LAYOUT_defaultRobustnessStorageBuffers); }
    public MemorySegment _defaultRobustnessStorageBuffers() { return _defaultRobustnessStorageBuffersAt(0L); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _defaultRobustnessStorageBuffersAt(long index, MemorySegment src) { _defaultRobustnessStorageBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _defaultRobustnessStorageBuffers(MemorySegment src) { return _defaultRobustnessStorageBuffersAt(0L, src); }
    public MemorySegment _defaultRobustnessUniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultRobustnessUniformBuffers, index), LAYOUT_defaultRobustnessUniformBuffers); }
    public MemorySegment _defaultRobustnessUniformBuffers() { return _defaultRobustnessUniformBuffersAt(0L); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _defaultRobustnessUniformBuffersAt(long index, MemorySegment src) { _defaultRobustnessUniformBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _defaultRobustnessUniformBuffers(MemorySegment src) { return _defaultRobustnessUniformBuffersAt(0L, src); }
    public MemorySegment _defaultRobustnessVertexInputsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultRobustnessVertexInputs, index), LAYOUT_defaultRobustnessVertexInputs); }
    public MemorySegment _defaultRobustnessVertexInputs() { return _defaultRobustnessVertexInputsAt(0L); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _defaultRobustnessVertexInputsAt(long index, MemorySegment src) { _defaultRobustnessVertexInputsAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _defaultRobustnessVertexInputs(MemorySegment src) { return _defaultRobustnessVertexInputsAt(0L, src); }
    public MemorySegment _defaultRobustnessImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultRobustnessImages, index), LAYOUT_defaultRobustnessImages); }
    public MemorySegment _defaultRobustnessImages() { return _defaultRobustnessImagesAt(0L); }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _defaultRobustnessImagesAt(long index, MemorySegment src) { _defaultRobustnessImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT _defaultRobustnessImages(MemorySegment src) { return _defaultRobustnessImagesAt(0L, src); }
}
