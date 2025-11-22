// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRobustnessCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineRobustnessCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineRobustnessBufferBehavior storageBuffers;
///     VkPipelineRobustnessBufferBehavior uniformBuffers;
///     VkPipelineRobustnessBufferBehavior vertexInputs;
///     VkPipelineRobustnessImageBehavior images;
/// }
/// ```
public final class VkPipelineRobustnessCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffers"),
        ValueLayout.JAVA_INT.withName("uniformBuffers"),
        ValueLayout.JAVA_INT.withName("vertexInputs"),
        ValueLayout.JAVA_INT.withName("images")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_storageBuffers = LAYOUT.byteOffset(PathElement.groupElement("storageBuffers"));
    public static final long OFFSET_uniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("uniformBuffers"));
    public static final long OFFSET_vertexInputs = LAYOUT.byteOffset(PathElement.groupElement("vertexInputs"));
    public static final long OFFSET_images = LAYOUT.byteOffset(PathElement.groupElement("images"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_storageBuffers = LAYOUT.select(PathElement.groupElement("storageBuffers"));
    public static final MemoryLayout LAYOUT_uniformBuffers = LAYOUT.select(PathElement.groupElement("uniformBuffers"));
    public static final MemoryLayout LAYOUT_vertexInputs = LAYOUT.select(PathElement.groupElement("vertexInputs"));
    public static final MemoryLayout LAYOUT_images = LAYOUT.select(PathElement.groupElement("images"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_storageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffers"));
    public static final VarHandle VH_uniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBuffers"));
    public static final VarHandle VH_vertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexInputs"));
    public static final VarHandle VH_images = LAYOUT.arrayElementVarHandle(PathElement.groupElement("images"));

    public VkPipelineRobustnessCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRobustnessCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRobustnessCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRobustnessCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRobustnessCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRobustnessCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRobustnessCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRobustnessCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRobustnessCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRobustnessCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineRobustnessCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRobustnessCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO); }
    public static VkPipelineRobustnessCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO);
        return s;
    }
    public VkPipelineRobustnessCreateInfo copyFrom(VkPipelineRobustnessCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRobustnessCreateInfo reinterpret(long count) { return new VkPipelineRobustnessCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRobustnessCreateInfo asSlice(long index) { return new VkPipelineRobustnessCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRobustnessCreateInfo asSlice(long index, long count) { return new VkPipelineRobustnessCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRobustnessCreateInfo at(long index, Consumer<VkPipelineRobustnessCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int storageBuffersAt(long index) { return (int) VH_storageBuffers.get(this.segment(), 0L, index); }
    public int uniformBuffersAt(long index) { return (int) VH_uniformBuffers.get(this.segment(), 0L, index); }
    public int vertexInputsAt(long index) { return (int) VH_vertexInputs.get(this.segment(), 0L, index); }
    public int imagesAt(long index) { return (int) VH_images.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int storageBuffers() { return (int) VH_storageBuffers.get(this.segment(), 0L, 0L); }
    public int uniformBuffers() { return (int) VH_uniformBuffers.get(this.segment(), 0L, 0L); }
    public int vertexInputs() { return (int) VH_vertexInputs.get(this.segment(), 0L, 0L); }
    public int images() { return (int) VH_images.get(this.segment(), 0L, 0L); }
    public VkPipelineRobustnessCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRobustnessCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRobustnessCreateInfo storageBuffersAt(long index, int value) { VH_storageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRobustnessCreateInfo uniformBuffersAt(long index, int value) { VH_uniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRobustnessCreateInfo vertexInputsAt(long index, int value) { VH_vertexInputs.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRobustnessCreateInfo imagesAt(long index, int value) { VH_images.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRobustnessCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRobustnessCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRobustnessCreateInfo storageBuffers(int value) { VH_storageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRobustnessCreateInfo uniformBuffers(int value) { VH_uniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRobustnessCreateInfo vertexInputs(int value) { VH_vertexInputs.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRobustnessCreateInfo images(int value) { VH_images.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRobustnessCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRobustnessCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRobustnessCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRobustnessCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _storageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageBuffers, index), LAYOUT_storageBuffers); }
    public MemorySegment _storageBuffers() { return _storageBuffersAt(0L); }
    public VkPipelineRobustnessCreateInfo _storageBuffersAt(long index, MemorySegment src) { _storageBuffersAt(index).copyFrom(src); return this; }
    public VkPipelineRobustnessCreateInfo _storageBuffers(MemorySegment src) { return _storageBuffersAt(0L, src); }
    public MemorySegment _uniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformBuffers, index), LAYOUT_uniformBuffers); }
    public MemorySegment _uniformBuffers() { return _uniformBuffersAt(0L); }
    public VkPipelineRobustnessCreateInfo _uniformBuffersAt(long index, MemorySegment src) { _uniformBuffersAt(index).copyFrom(src); return this; }
    public VkPipelineRobustnessCreateInfo _uniformBuffers(MemorySegment src) { return _uniformBuffersAt(0L, src); }
    public MemorySegment _vertexInputsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexInputs, index), LAYOUT_vertexInputs); }
    public MemorySegment _vertexInputs() { return _vertexInputsAt(0L); }
    public VkPipelineRobustnessCreateInfo _vertexInputsAt(long index, MemorySegment src) { _vertexInputsAt(index).copyFrom(src); return this; }
    public VkPipelineRobustnessCreateInfo _vertexInputs(MemorySegment src) { return _vertexInputsAt(0L, src); }
    public MemorySegment _imagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_images, index), LAYOUT_images); }
    public MemorySegment _images() { return _imagesAt(0L); }
    public VkPipelineRobustnessCreateInfo _imagesAt(long index, MemorySegment src) { _imagesAt(index).copyFrom(src); return this; }
    public VkPipelineRobustnessCreateInfo _images(MemorySegment src) { return _imagesAt(0L, src); }
}
