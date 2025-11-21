// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceProvokingVertexPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceProvokingVertexPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 provokingVertexModePerPipeline;
///     VkBool32 transformFeedbackPreservesTriangleFanProvokingVertex;
/// }
/// ```
public final class VkPhysicalDeviceProvokingVertexPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexModePerPipeline"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesTriangleFanProvokingVertex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_provokingVertexModePerPipeline = LAYOUT.byteOffset(PathElement.groupElement("provokingVertexModePerPipeline"));
    public static final long OFFSET_transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_provokingVertexModePerPipeline = LAYOUT.select(PathElement.groupElement("provokingVertexModePerPipeline"));
    public static final MemoryLayout LAYOUT_transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.select(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_provokingVertexModePerPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("provokingVertexModePerPipeline"));
    public static final VarHandle VH_transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));

    public VkPhysicalDeviceProvokingVertexPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT); }
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT copyFrom(VkPhysicalDeviceProvokingVertexPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT at(long index, Consumer<VkPhysicalDeviceProvokingVertexPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int provokingVertexModePerPipelineAt(long index) { return (int) VH_provokingVertexModePerPipeline.get(this.segment(), 0L, index); }
    public int transformFeedbackPreservesTriangleFanProvokingVertexAt(long index) { return (int) VH_transformFeedbackPreservesTriangleFanProvokingVertex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int provokingVertexModePerPipeline() { return (int) VH_provokingVertexModePerPipeline.get(this.segment(), 0L, 0L); }
    public int transformFeedbackPreservesTriangleFanProvokingVertex() { return (int) VH_transformFeedbackPreservesTriangleFanProvokingVertex.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT provokingVertexModePerPipelineAt(long index, int value) { VH_provokingVertexModePerPipeline.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT transformFeedbackPreservesTriangleFanProvokingVertexAt(long index, int value) { VH_transformFeedbackPreservesTriangleFanProvokingVertex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT provokingVertexModePerPipeline(int value) { VH_provokingVertexModePerPipeline.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT transformFeedbackPreservesTriangleFanProvokingVertex(int value) { VH_transformFeedbackPreservesTriangleFanProvokingVertex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _provokingVertexModePerPipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_provokingVertexModePerPipeline, index), LAYOUT_provokingVertexModePerPipeline); }
    public MemorySegment _provokingVertexModePerPipeline() { return _provokingVertexModePerPipelineAt(0L); }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT _provokingVertexModePerPipelineAt(long index, MemorySegment src) { _provokingVertexModePerPipelineAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT _provokingVertexModePerPipeline(MemorySegment src) { return _provokingVertexModePerPipelineAt(0L, src); }
    public MemorySegment _transformFeedbackPreservesTriangleFanProvokingVertexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformFeedbackPreservesTriangleFanProvokingVertex, index), LAYOUT_transformFeedbackPreservesTriangleFanProvokingVertex); }
    public MemorySegment _transformFeedbackPreservesTriangleFanProvokingVertex() { return _transformFeedbackPreservesTriangleFanProvokingVertexAt(0L); }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT _transformFeedbackPreservesTriangleFanProvokingVertexAt(long index, MemorySegment src) { _transformFeedbackPreservesTriangleFanProvokingVertexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProvokingVertexPropertiesEXT _transformFeedbackPreservesTriangleFanProvokingVertex(MemorySegment src) { return _transformFeedbackPreservesTriangleFanProvokingVertexAt(0L, src); }
}
