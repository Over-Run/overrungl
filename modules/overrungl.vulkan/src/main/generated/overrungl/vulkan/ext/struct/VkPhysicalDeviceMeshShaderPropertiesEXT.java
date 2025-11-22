// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMeshShaderPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMeshShaderPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxTaskWorkGroupTotalCount;
///     uint32_t maxTaskWorkGroupCount[3];
///     uint32_t maxTaskWorkGroupInvocations;
///     uint32_t maxTaskWorkGroupSize[3];
///     uint32_t maxTaskPayloadSize;
///     uint32_t maxTaskSharedMemorySize;
///     uint32_t maxTaskPayloadAndSharedMemorySize;
///     uint32_t maxMeshWorkGroupTotalCount;
///     uint32_t maxMeshWorkGroupCount[3];
///     uint32_t maxMeshWorkGroupInvocations;
///     uint32_t maxMeshWorkGroupSize[3];
///     uint32_t maxMeshSharedMemorySize;
///     uint32_t maxMeshPayloadAndSharedMemorySize;
///     uint32_t maxMeshOutputMemorySize;
///     uint32_t maxMeshPayloadAndOutputMemorySize;
///     uint32_t maxMeshOutputComponents;
///     uint32_t maxMeshOutputVertices;
///     uint32_t maxMeshOutputPrimitives;
///     uint32_t maxMeshOutputLayers;
///     uint32_t maxMeshMultiviewViewCount;
///     uint32_t meshOutputPerVertexGranularity;
///     uint32_t meshOutputPerPrimitiveGranularity;
///     uint32_t maxPreferredTaskWorkGroupInvocations;
///     uint32_t maxPreferredMeshWorkGroupInvocations;
///     VkBool32 prefersLocalInvocationVertexOutput;
///     VkBool32 prefersLocalInvocationPrimitiveOutput;
///     VkBool32 prefersCompactVertexOutput;
///     VkBool32 prefersCompactPrimitiveOutput;
/// }
/// ```
public final class VkPhysicalDeviceMeshShaderPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxTaskSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxMeshSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshPayloadAndOutputMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputLayers"),
        ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity"),
        ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity"),
        ValueLayout.JAVA_INT.withName("maxPreferredTaskWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxPreferredMeshWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("prefersLocalInvocationVertexOutput"),
        ValueLayout.JAVA_INT.withName("prefersLocalInvocationPrimitiveOutput"),
        ValueLayout.JAVA_INT.withName("prefersCompactVertexOutput"),
        ValueLayout.JAVA_INT.withName("prefersCompactPrimitiveOutput")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxTaskWorkGroupTotalCount = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
    public static final long OFFSET_maxTaskWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupCount"));
    public static final long OFFSET_maxTaskWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    public static final long OFFSET_maxTaskWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupSize"));
    public static final long OFFSET_maxTaskPayloadSize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskPayloadSize"));
    public static final long OFFSET_maxTaskSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskSharedMemorySize"));
    public static final long OFFSET_maxTaskPayloadAndSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
    public static final long OFFSET_maxMeshWorkGroupTotalCount = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
    public static final long OFFSET_maxMeshWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupCount"));
    public static final long OFFSET_maxMeshWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    public static final long OFFSET_maxMeshWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupSize"));
    public static final long OFFSET_maxMeshSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshSharedMemorySize"));
    public static final long OFFSET_maxMeshPayloadAndSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
    public static final long OFFSET_maxMeshOutputMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputMemorySize"));
    public static final long OFFSET_maxMeshPayloadAndOutputMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
    public static final long OFFSET_maxMeshOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputComponents"));
    public static final long OFFSET_maxMeshOutputVertices = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputVertices"));
    public static final long OFFSET_maxMeshOutputPrimitives = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputPrimitives"));
    public static final long OFFSET_maxMeshOutputLayers = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputLayers"));
    public static final long OFFSET_maxMeshMultiviewViewCount = LAYOUT.byteOffset(PathElement.groupElement("maxMeshMultiviewViewCount"));
    public static final long OFFSET_meshOutputPerVertexGranularity = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerVertexGranularity"));
    public static final long OFFSET_meshOutputPerPrimitiveGranularity = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    public static final long OFFSET_maxPreferredTaskWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
    public static final long OFFSET_maxPreferredMeshWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
    public static final long OFFSET_prefersLocalInvocationVertexOutput = LAYOUT.byteOffset(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
    public static final long OFFSET_prefersLocalInvocationPrimitiveOutput = LAYOUT.byteOffset(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
    public static final long OFFSET_prefersCompactVertexOutput = LAYOUT.byteOffset(PathElement.groupElement("prefersCompactVertexOutput"));
    public static final long OFFSET_prefersCompactPrimitiveOutput = LAYOUT.byteOffset(PathElement.groupElement("prefersCompactPrimitiveOutput"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupTotalCount = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupCount"));
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupSize"));
    public static final MemoryLayout LAYOUT_maxTaskPayloadSize = LAYOUT.select(PathElement.groupElement("maxTaskPayloadSize"));
    public static final MemoryLayout LAYOUT_maxTaskSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxTaskSharedMemorySize"));
    public static final MemoryLayout LAYOUT_maxTaskPayloadAndSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupTotalCount = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupCount"));
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupSize"));
    public static final MemoryLayout LAYOUT_maxMeshSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshSharedMemorySize"));
    public static final MemoryLayout LAYOUT_maxMeshPayloadAndSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
    public static final MemoryLayout LAYOUT_maxMeshOutputMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshOutputMemorySize"));
    public static final MemoryLayout LAYOUT_maxMeshPayloadAndOutputMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
    public static final MemoryLayout LAYOUT_maxMeshOutputComponents = LAYOUT.select(PathElement.groupElement("maxMeshOutputComponents"));
    public static final MemoryLayout LAYOUT_maxMeshOutputVertices = LAYOUT.select(PathElement.groupElement("maxMeshOutputVertices"));
    public static final MemoryLayout LAYOUT_maxMeshOutputPrimitives = LAYOUT.select(PathElement.groupElement("maxMeshOutputPrimitives"));
    public static final MemoryLayout LAYOUT_maxMeshOutputLayers = LAYOUT.select(PathElement.groupElement("maxMeshOutputLayers"));
    public static final MemoryLayout LAYOUT_maxMeshMultiviewViewCount = LAYOUT.select(PathElement.groupElement("maxMeshMultiviewViewCount"));
    public static final MemoryLayout LAYOUT_meshOutputPerVertexGranularity = LAYOUT.select(PathElement.groupElement("meshOutputPerVertexGranularity"));
    public static final MemoryLayout LAYOUT_meshOutputPerPrimitiveGranularity = LAYOUT.select(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    public static final MemoryLayout LAYOUT_maxPreferredTaskWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
    public static final MemoryLayout LAYOUT_maxPreferredMeshWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
    public static final MemoryLayout LAYOUT_prefersLocalInvocationVertexOutput = LAYOUT.select(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
    public static final MemoryLayout LAYOUT_prefersLocalInvocationPrimitiveOutput = LAYOUT.select(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
    public static final MemoryLayout LAYOUT_prefersCompactVertexOutput = LAYOUT.select(PathElement.groupElement("prefersCompactVertexOutput"));
    public static final MemoryLayout LAYOUT_prefersCompactPrimitiveOutput = LAYOUT.select(PathElement.groupElement("prefersCompactPrimitiveOutput"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxTaskWorkGroupTotalCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
    public static final VarHandle VH_maxTaskWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupCount"), PathElement.sequenceElement());
    public static final VarHandle VH_maxTaskWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    public static final VarHandle VH_maxTaskWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupSize"), PathElement.sequenceElement());
    public static final VarHandle VH_maxTaskPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskPayloadSize"));
    public static final VarHandle VH_maxTaskSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskSharedMemorySize"));
    public static final VarHandle VH_maxTaskPayloadAndSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
    public static final VarHandle VH_maxMeshWorkGroupTotalCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
    public static final VarHandle VH_maxMeshWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupCount"), PathElement.sequenceElement());
    public static final VarHandle VH_maxMeshWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    public static final VarHandle VH_maxMeshWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupSize"), PathElement.sequenceElement());
    public static final VarHandle VH_maxMeshSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshSharedMemorySize"));
    public static final VarHandle VH_maxMeshPayloadAndSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
    public static final VarHandle VH_maxMeshOutputMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputMemorySize"));
    public static final VarHandle VH_maxMeshPayloadAndOutputMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
    public static final VarHandle VH_maxMeshOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputComponents"));
    public static final VarHandle VH_maxMeshOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputVertices"));
    public static final VarHandle VH_maxMeshOutputPrimitives = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputPrimitives"));
    public static final VarHandle VH_maxMeshOutputLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputLayers"));
    public static final VarHandle VH_maxMeshMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshMultiviewViewCount"));
    public static final VarHandle VH_meshOutputPerVertexGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerVertexGranularity"));
    public static final VarHandle VH_meshOutputPerPrimitiveGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    public static final VarHandle VH_maxPreferredTaskWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
    public static final VarHandle VH_maxPreferredMeshWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
    public static final VarHandle VH_prefersLocalInvocationVertexOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
    public static final VarHandle VH_prefersLocalInvocationPrimitiveOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
    public static final VarHandle VH_prefersCompactVertexOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersCompactVertexOutput"));
    public static final VarHandle VH_prefersCompactPrimitiveOutput = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersCompactPrimitiveOutput"));

    public VkPhysicalDeviceMeshShaderPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMeshShaderPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMeshShaderPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMeshShaderPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMeshShaderPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMeshShaderPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMeshShaderPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT); }
    public static VkPhysicalDeviceMeshShaderPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceMeshShaderPropertiesEXT copyFrom(VkPhysicalDeviceMeshShaderPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT at(long index, Consumer<VkPhysicalDeviceMeshShaderPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxTaskWorkGroupTotalCountAt(long index) { return (int) VH_maxTaskWorkGroupTotalCount.get(this.segment(), 0L, index); }
    public int maxTaskWorkGroupCountAt(long index, long index0) { return (int) VH_maxTaskWorkGroupCount.get(this.segment(), 0L, index, index0); }
    public int maxTaskWorkGroupInvocationsAt(long index) { return (int) VH_maxTaskWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int maxTaskWorkGroupSizeAt(long index, long index0) { return (int) VH_maxTaskWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int maxTaskPayloadSizeAt(long index) { return (int) VH_maxTaskPayloadSize.get(this.segment(), 0L, index); }
    public int maxTaskSharedMemorySizeAt(long index) { return (int) VH_maxTaskSharedMemorySize.get(this.segment(), 0L, index); }
    public int maxTaskPayloadAndSharedMemorySizeAt(long index) { return (int) VH_maxTaskPayloadAndSharedMemorySize.get(this.segment(), 0L, index); }
    public int maxMeshWorkGroupTotalCountAt(long index) { return (int) VH_maxMeshWorkGroupTotalCount.get(this.segment(), 0L, index); }
    public int maxMeshWorkGroupCountAt(long index, long index0) { return (int) VH_maxMeshWorkGroupCount.get(this.segment(), 0L, index, index0); }
    public int maxMeshWorkGroupInvocationsAt(long index) { return (int) VH_maxMeshWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int maxMeshWorkGroupSizeAt(long index, long index0) { return (int) VH_maxMeshWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int maxMeshSharedMemorySizeAt(long index) { return (int) VH_maxMeshSharedMemorySize.get(this.segment(), 0L, index); }
    public int maxMeshPayloadAndSharedMemorySizeAt(long index) { return (int) VH_maxMeshPayloadAndSharedMemorySize.get(this.segment(), 0L, index); }
    public int maxMeshOutputMemorySizeAt(long index) { return (int) VH_maxMeshOutputMemorySize.get(this.segment(), 0L, index); }
    public int maxMeshPayloadAndOutputMemorySizeAt(long index) { return (int) VH_maxMeshPayloadAndOutputMemorySize.get(this.segment(), 0L, index); }
    public int maxMeshOutputComponentsAt(long index) { return (int) VH_maxMeshOutputComponents.get(this.segment(), 0L, index); }
    public int maxMeshOutputVerticesAt(long index) { return (int) VH_maxMeshOutputVertices.get(this.segment(), 0L, index); }
    public int maxMeshOutputPrimitivesAt(long index) { return (int) VH_maxMeshOutputPrimitives.get(this.segment(), 0L, index); }
    public int maxMeshOutputLayersAt(long index) { return (int) VH_maxMeshOutputLayers.get(this.segment(), 0L, index); }
    public int maxMeshMultiviewViewCountAt(long index) { return (int) VH_maxMeshMultiviewViewCount.get(this.segment(), 0L, index); }
    public int meshOutputPerVertexGranularityAt(long index) { return (int) VH_meshOutputPerVertexGranularity.get(this.segment(), 0L, index); }
    public int meshOutputPerPrimitiveGranularityAt(long index) { return (int) VH_meshOutputPerPrimitiveGranularity.get(this.segment(), 0L, index); }
    public int maxPreferredTaskWorkGroupInvocationsAt(long index) { return (int) VH_maxPreferredTaskWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int maxPreferredMeshWorkGroupInvocationsAt(long index) { return (int) VH_maxPreferredMeshWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int prefersLocalInvocationVertexOutputAt(long index) { return (int) VH_prefersLocalInvocationVertexOutput.get(this.segment(), 0L, index); }
    public int prefersLocalInvocationPrimitiveOutputAt(long index) { return (int) VH_prefersLocalInvocationPrimitiveOutput.get(this.segment(), 0L, index); }
    public int prefersCompactVertexOutputAt(long index) { return (int) VH_prefersCompactVertexOutput.get(this.segment(), 0L, index); }
    public int prefersCompactPrimitiveOutputAt(long index) { return (int) VH_prefersCompactPrimitiveOutput.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxTaskWorkGroupTotalCount() { return (int) VH_maxTaskWorkGroupTotalCount.get(this.segment(), 0L, 0L); }
    public int maxTaskWorkGroupCount(long index0) { return (int) VH_maxTaskWorkGroupCount.get(this.segment(), 0L, 0L, index0); }
    public int maxTaskWorkGroupInvocations() { return (int) VH_maxTaskWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int maxTaskWorkGroupSize(long index0) { return (int) VH_maxTaskWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public int maxTaskPayloadSize() { return (int) VH_maxTaskPayloadSize.get(this.segment(), 0L, 0L); }
    public int maxTaskSharedMemorySize() { return (int) VH_maxTaskSharedMemorySize.get(this.segment(), 0L, 0L); }
    public int maxTaskPayloadAndSharedMemorySize() { return (int) VH_maxTaskPayloadAndSharedMemorySize.get(this.segment(), 0L, 0L); }
    public int maxMeshWorkGroupTotalCount() { return (int) VH_maxMeshWorkGroupTotalCount.get(this.segment(), 0L, 0L); }
    public int maxMeshWorkGroupCount(long index0) { return (int) VH_maxMeshWorkGroupCount.get(this.segment(), 0L, 0L, index0); }
    public int maxMeshWorkGroupInvocations() { return (int) VH_maxMeshWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int maxMeshWorkGroupSize(long index0) { return (int) VH_maxMeshWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public int maxMeshSharedMemorySize() { return (int) VH_maxMeshSharedMemorySize.get(this.segment(), 0L, 0L); }
    public int maxMeshPayloadAndSharedMemorySize() { return (int) VH_maxMeshPayloadAndSharedMemorySize.get(this.segment(), 0L, 0L); }
    public int maxMeshOutputMemorySize() { return (int) VH_maxMeshOutputMemorySize.get(this.segment(), 0L, 0L); }
    public int maxMeshPayloadAndOutputMemorySize() { return (int) VH_maxMeshPayloadAndOutputMemorySize.get(this.segment(), 0L, 0L); }
    public int maxMeshOutputComponents() { return (int) VH_maxMeshOutputComponents.get(this.segment(), 0L, 0L); }
    public int maxMeshOutputVertices() { return (int) VH_maxMeshOutputVertices.get(this.segment(), 0L, 0L); }
    public int maxMeshOutputPrimitives() { return (int) VH_maxMeshOutputPrimitives.get(this.segment(), 0L, 0L); }
    public int maxMeshOutputLayers() { return (int) VH_maxMeshOutputLayers.get(this.segment(), 0L, 0L); }
    public int maxMeshMultiviewViewCount() { return (int) VH_maxMeshMultiviewViewCount.get(this.segment(), 0L, 0L); }
    public int meshOutputPerVertexGranularity() { return (int) VH_meshOutputPerVertexGranularity.get(this.segment(), 0L, 0L); }
    public int meshOutputPerPrimitiveGranularity() { return (int) VH_meshOutputPerPrimitiveGranularity.get(this.segment(), 0L, 0L); }
    public int maxPreferredTaskWorkGroupInvocations() { return (int) VH_maxPreferredTaskWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int maxPreferredMeshWorkGroupInvocations() { return (int) VH_maxPreferredMeshWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int prefersLocalInvocationVertexOutput() { return (int) VH_prefersLocalInvocationVertexOutput.get(this.segment(), 0L, 0L); }
    public int prefersLocalInvocationPrimitiveOutput() { return (int) VH_prefersLocalInvocationPrimitiveOutput.get(this.segment(), 0L, 0L); }
    public int prefersCompactVertexOutput() { return (int) VH_prefersCompactVertexOutput.get(this.segment(), 0L, 0L); }
    public int prefersCompactPrimitiveOutput() { return (int) VH_prefersCompactPrimitiveOutput.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupTotalCountAt(long index, int value) { VH_maxTaskWorkGroupTotalCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupCountAt(long index, long index0, int value) { VH_maxTaskWorkGroupCount.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupInvocationsAt(long index, int value) { VH_maxTaskWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupSizeAt(long index, long index0, int value) { VH_maxTaskWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadSizeAt(long index, int value) { VH_maxTaskPayloadSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskSharedMemorySizeAt(long index, int value) { VH_maxTaskSharedMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadAndSharedMemorySizeAt(long index, int value) { VH_maxTaskPayloadAndSharedMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupTotalCountAt(long index, int value) { VH_maxMeshWorkGroupTotalCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupCountAt(long index, long index0, int value) { VH_maxMeshWorkGroupCount.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupInvocationsAt(long index, int value) { VH_maxMeshWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupSizeAt(long index, long index0, int value) { VH_maxMeshWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshSharedMemorySizeAt(long index, int value) { VH_maxMeshSharedMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndSharedMemorySizeAt(long index, int value) { VH_maxMeshPayloadAndSharedMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputMemorySizeAt(long index, int value) { VH_maxMeshOutputMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndOutputMemorySizeAt(long index, int value) { VH_maxMeshPayloadAndOutputMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputComponentsAt(long index, int value) { VH_maxMeshOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputVerticesAt(long index, int value) { VH_maxMeshOutputVertices.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputPrimitivesAt(long index, int value) { VH_maxMeshOutputPrimitives.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputLayersAt(long index, int value) { VH_maxMeshOutputLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshMultiviewViewCountAt(long index, int value) { VH_maxMeshMultiviewViewCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerVertexGranularityAt(long index, int value) { VH_meshOutputPerVertexGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerPrimitiveGranularityAt(long index, int value) { VH_meshOutputPerPrimitiveGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredTaskWorkGroupInvocationsAt(long index, int value) { VH_maxPreferredTaskWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredMeshWorkGroupInvocationsAt(long index, int value) { VH_maxPreferredMeshWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationVertexOutputAt(long index, int value) { VH_prefersLocalInvocationVertexOutput.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationPrimitiveOutputAt(long index, int value) { VH_prefersLocalInvocationPrimitiveOutput.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactVertexOutputAt(long index, int value) { VH_prefersCompactVertexOutput.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactPrimitiveOutputAt(long index, int value) { VH_prefersCompactPrimitiveOutput.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupTotalCount(int value) { VH_maxTaskWorkGroupTotalCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupCount(long index0, int value) { VH_maxTaskWorkGroupCount.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupInvocations(int value) { VH_maxTaskWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupSize(long index0, int value) { VH_maxTaskWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadSize(int value) { VH_maxTaskPayloadSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskSharedMemorySize(int value) { VH_maxTaskSharedMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadAndSharedMemorySize(int value) { VH_maxTaskPayloadAndSharedMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupTotalCount(int value) { VH_maxMeshWorkGroupTotalCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupCount(long index0, int value) { VH_maxMeshWorkGroupCount.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupInvocations(int value) { VH_maxMeshWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupSize(long index0, int value) { VH_maxMeshWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshSharedMemorySize(int value) { VH_maxMeshSharedMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndSharedMemorySize(int value) { VH_maxMeshPayloadAndSharedMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputMemorySize(int value) { VH_maxMeshOutputMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndOutputMemorySize(int value) { VH_maxMeshPayloadAndOutputMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputComponents(int value) { VH_maxMeshOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputVertices(int value) { VH_maxMeshOutputVertices.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputPrimitives(int value) { VH_maxMeshOutputPrimitives.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputLayers(int value) { VH_maxMeshOutputLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshMultiviewViewCount(int value) { VH_maxMeshMultiviewViewCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerVertexGranularity(int value) { VH_meshOutputPerVertexGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerPrimitiveGranularity(int value) { VH_meshOutputPerPrimitiveGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredTaskWorkGroupInvocations(int value) { VH_maxPreferredTaskWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredMeshWorkGroupInvocations(int value) { VH_maxPreferredMeshWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationVertexOutput(int value) { VH_prefersLocalInvocationVertexOutput.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationPrimitiveOutput(int value) { VH_prefersLocalInvocationPrimitiveOutput.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactVertexOutput(int value) { VH_prefersCompactVertexOutput.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactPrimitiveOutput(int value) { VH_prefersCompactPrimitiveOutput.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxTaskWorkGroupTotalCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupTotalCount, index), LAYOUT_maxTaskWorkGroupTotalCount); }
    public MemorySegment _maxTaskWorkGroupTotalCount() { return _maxTaskWorkGroupTotalCountAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskWorkGroupTotalCountAt(long index, MemorySegment src) { _maxTaskWorkGroupTotalCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskWorkGroupTotalCount(MemorySegment src) { return _maxTaskWorkGroupTotalCountAt(0L, src); }
    public MemorySegment _maxTaskWorkGroupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupCount, index), LAYOUT_maxTaskWorkGroupCount); }
    public MemorySegment _maxTaskWorkGroupCount() { return _maxTaskWorkGroupCountAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskWorkGroupCountAt(long index, MemorySegment src) { _maxTaskWorkGroupCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskWorkGroupCount(MemorySegment src) { return _maxTaskWorkGroupCountAt(0L, src); }
    public MemorySegment _maxTaskWorkGroupInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupInvocations, index), LAYOUT_maxTaskWorkGroupInvocations); }
    public MemorySegment _maxTaskWorkGroupInvocations() { return _maxTaskWorkGroupInvocationsAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskWorkGroupInvocationsAt(long index, MemorySegment src) { _maxTaskWorkGroupInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskWorkGroupInvocations(MemorySegment src) { return _maxTaskWorkGroupInvocationsAt(0L, src); }
    public MemorySegment _maxTaskWorkGroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupSize, index), LAYOUT_maxTaskWorkGroupSize); }
    public MemorySegment _maxTaskWorkGroupSize() { return _maxTaskWorkGroupSizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskWorkGroupSizeAt(long index, MemorySegment src) { _maxTaskWorkGroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskWorkGroupSize(MemorySegment src) { return _maxTaskWorkGroupSizeAt(0L, src); }
    public MemorySegment _maxTaskPayloadSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskPayloadSize, index), LAYOUT_maxTaskPayloadSize); }
    public MemorySegment _maxTaskPayloadSize() { return _maxTaskPayloadSizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskPayloadSizeAt(long index, MemorySegment src) { _maxTaskPayloadSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskPayloadSize(MemorySegment src) { return _maxTaskPayloadSizeAt(0L, src); }
    public MemorySegment _maxTaskSharedMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskSharedMemorySize, index), LAYOUT_maxTaskSharedMemorySize); }
    public MemorySegment _maxTaskSharedMemorySize() { return _maxTaskSharedMemorySizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskSharedMemorySizeAt(long index, MemorySegment src) { _maxTaskSharedMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskSharedMemorySize(MemorySegment src) { return _maxTaskSharedMemorySizeAt(0L, src); }
    public MemorySegment _maxTaskPayloadAndSharedMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskPayloadAndSharedMemorySize, index), LAYOUT_maxTaskPayloadAndSharedMemorySize); }
    public MemorySegment _maxTaskPayloadAndSharedMemorySize() { return _maxTaskPayloadAndSharedMemorySizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskPayloadAndSharedMemorySizeAt(long index, MemorySegment src) { _maxTaskPayloadAndSharedMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxTaskPayloadAndSharedMemorySize(MemorySegment src) { return _maxTaskPayloadAndSharedMemorySizeAt(0L, src); }
    public MemorySegment _maxMeshWorkGroupTotalCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupTotalCount, index), LAYOUT_maxMeshWorkGroupTotalCount); }
    public MemorySegment _maxMeshWorkGroupTotalCount() { return _maxMeshWorkGroupTotalCountAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshWorkGroupTotalCountAt(long index, MemorySegment src) { _maxMeshWorkGroupTotalCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshWorkGroupTotalCount(MemorySegment src) { return _maxMeshWorkGroupTotalCountAt(0L, src); }
    public MemorySegment _maxMeshWorkGroupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupCount, index), LAYOUT_maxMeshWorkGroupCount); }
    public MemorySegment _maxMeshWorkGroupCount() { return _maxMeshWorkGroupCountAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshWorkGroupCountAt(long index, MemorySegment src) { _maxMeshWorkGroupCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshWorkGroupCount(MemorySegment src) { return _maxMeshWorkGroupCountAt(0L, src); }
    public MemorySegment _maxMeshWorkGroupInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupInvocations, index), LAYOUT_maxMeshWorkGroupInvocations); }
    public MemorySegment _maxMeshWorkGroupInvocations() { return _maxMeshWorkGroupInvocationsAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshWorkGroupInvocationsAt(long index, MemorySegment src) { _maxMeshWorkGroupInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshWorkGroupInvocations(MemorySegment src) { return _maxMeshWorkGroupInvocationsAt(0L, src); }
    public MemorySegment _maxMeshWorkGroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupSize, index), LAYOUT_maxMeshWorkGroupSize); }
    public MemorySegment _maxMeshWorkGroupSize() { return _maxMeshWorkGroupSizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshWorkGroupSizeAt(long index, MemorySegment src) { _maxMeshWorkGroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshWorkGroupSize(MemorySegment src) { return _maxMeshWorkGroupSizeAt(0L, src); }
    public MemorySegment _maxMeshSharedMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshSharedMemorySize, index), LAYOUT_maxMeshSharedMemorySize); }
    public MemorySegment _maxMeshSharedMemorySize() { return _maxMeshSharedMemorySizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshSharedMemorySizeAt(long index, MemorySegment src) { _maxMeshSharedMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshSharedMemorySize(MemorySegment src) { return _maxMeshSharedMemorySizeAt(0L, src); }
    public MemorySegment _maxMeshPayloadAndSharedMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshPayloadAndSharedMemorySize, index), LAYOUT_maxMeshPayloadAndSharedMemorySize); }
    public MemorySegment _maxMeshPayloadAndSharedMemorySize() { return _maxMeshPayloadAndSharedMemorySizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshPayloadAndSharedMemorySizeAt(long index, MemorySegment src) { _maxMeshPayloadAndSharedMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshPayloadAndSharedMemorySize(MemorySegment src) { return _maxMeshPayloadAndSharedMemorySizeAt(0L, src); }
    public MemorySegment _maxMeshOutputMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshOutputMemorySize, index), LAYOUT_maxMeshOutputMemorySize); }
    public MemorySegment _maxMeshOutputMemorySize() { return _maxMeshOutputMemorySizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputMemorySizeAt(long index, MemorySegment src) { _maxMeshOutputMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputMemorySize(MemorySegment src) { return _maxMeshOutputMemorySizeAt(0L, src); }
    public MemorySegment _maxMeshPayloadAndOutputMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshPayloadAndOutputMemorySize, index), LAYOUT_maxMeshPayloadAndOutputMemorySize); }
    public MemorySegment _maxMeshPayloadAndOutputMemorySize() { return _maxMeshPayloadAndOutputMemorySizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshPayloadAndOutputMemorySizeAt(long index, MemorySegment src) { _maxMeshPayloadAndOutputMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshPayloadAndOutputMemorySize(MemorySegment src) { return _maxMeshPayloadAndOutputMemorySizeAt(0L, src); }
    public MemorySegment _maxMeshOutputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshOutputComponents, index), LAYOUT_maxMeshOutputComponents); }
    public MemorySegment _maxMeshOutputComponents() { return _maxMeshOutputComponentsAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputComponentsAt(long index, MemorySegment src) { _maxMeshOutputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputComponents(MemorySegment src) { return _maxMeshOutputComponentsAt(0L, src); }
    public MemorySegment _maxMeshOutputVerticesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshOutputVertices, index), LAYOUT_maxMeshOutputVertices); }
    public MemorySegment _maxMeshOutputVertices() { return _maxMeshOutputVerticesAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputVerticesAt(long index, MemorySegment src) { _maxMeshOutputVerticesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputVertices(MemorySegment src) { return _maxMeshOutputVerticesAt(0L, src); }
    public MemorySegment _maxMeshOutputPrimitivesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshOutputPrimitives, index), LAYOUT_maxMeshOutputPrimitives); }
    public MemorySegment _maxMeshOutputPrimitives() { return _maxMeshOutputPrimitivesAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputPrimitivesAt(long index, MemorySegment src) { _maxMeshOutputPrimitivesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputPrimitives(MemorySegment src) { return _maxMeshOutputPrimitivesAt(0L, src); }
    public MemorySegment _maxMeshOutputLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshOutputLayers, index), LAYOUT_maxMeshOutputLayers); }
    public MemorySegment _maxMeshOutputLayers() { return _maxMeshOutputLayersAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputLayersAt(long index, MemorySegment src) { _maxMeshOutputLayersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshOutputLayers(MemorySegment src) { return _maxMeshOutputLayersAt(0L, src); }
    public MemorySegment _maxMeshMultiviewViewCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshMultiviewViewCount, index), LAYOUT_maxMeshMultiviewViewCount); }
    public MemorySegment _maxMeshMultiviewViewCount() { return _maxMeshMultiviewViewCountAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshMultiviewViewCountAt(long index, MemorySegment src) { _maxMeshMultiviewViewCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxMeshMultiviewViewCount(MemorySegment src) { return _maxMeshMultiviewViewCountAt(0L, src); }
    public MemorySegment _meshOutputPerVertexGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_meshOutputPerVertexGranularity, index), LAYOUT_meshOutputPerVertexGranularity); }
    public MemorySegment _meshOutputPerVertexGranularity() { return _meshOutputPerVertexGranularityAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _meshOutputPerVertexGranularityAt(long index, MemorySegment src) { _meshOutputPerVertexGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _meshOutputPerVertexGranularity(MemorySegment src) { return _meshOutputPerVertexGranularityAt(0L, src); }
    public MemorySegment _meshOutputPerPrimitiveGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_meshOutputPerPrimitiveGranularity, index), LAYOUT_meshOutputPerPrimitiveGranularity); }
    public MemorySegment _meshOutputPerPrimitiveGranularity() { return _meshOutputPerPrimitiveGranularityAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _meshOutputPerPrimitiveGranularityAt(long index, MemorySegment src) { _meshOutputPerPrimitiveGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _meshOutputPerPrimitiveGranularity(MemorySegment src) { return _meshOutputPerPrimitiveGranularityAt(0L, src); }
    public MemorySegment _maxPreferredTaskWorkGroupInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPreferredTaskWorkGroupInvocations, index), LAYOUT_maxPreferredTaskWorkGroupInvocations); }
    public MemorySegment _maxPreferredTaskWorkGroupInvocations() { return _maxPreferredTaskWorkGroupInvocationsAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxPreferredTaskWorkGroupInvocationsAt(long index, MemorySegment src) { _maxPreferredTaskWorkGroupInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxPreferredTaskWorkGroupInvocations(MemorySegment src) { return _maxPreferredTaskWorkGroupInvocationsAt(0L, src); }
    public MemorySegment _maxPreferredMeshWorkGroupInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPreferredMeshWorkGroupInvocations, index), LAYOUT_maxPreferredMeshWorkGroupInvocations); }
    public MemorySegment _maxPreferredMeshWorkGroupInvocations() { return _maxPreferredMeshWorkGroupInvocationsAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxPreferredMeshWorkGroupInvocationsAt(long index, MemorySegment src) { _maxPreferredMeshWorkGroupInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _maxPreferredMeshWorkGroupInvocations(MemorySegment src) { return _maxPreferredMeshWorkGroupInvocationsAt(0L, src); }
    public MemorySegment _prefersLocalInvocationVertexOutputAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_prefersLocalInvocationVertexOutput, index), LAYOUT_prefersLocalInvocationVertexOutput); }
    public MemorySegment _prefersLocalInvocationVertexOutput() { return _prefersLocalInvocationVertexOutputAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _prefersLocalInvocationVertexOutputAt(long index, MemorySegment src) { _prefersLocalInvocationVertexOutputAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _prefersLocalInvocationVertexOutput(MemorySegment src) { return _prefersLocalInvocationVertexOutputAt(0L, src); }
    public MemorySegment _prefersLocalInvocationPrimitiveOutputAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_prefersLocalInvocationPrimitiveOutput, index), LAYOUT_prefersLocalInvocationPrimitiveOutput); }
    public MemorySegment _prefersLocalInvocationPrimitiveOutput() { return _prefersLocalInvocationPrimitiveOutputAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _prefersLocalInvocationPrimitiveOutputAt(long index, MemorySegment src) { _prefersLocalInvocationPrimitiveOutputAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _prefersLocalInvocationPrimitiveOutput(MemorySegment src) { return _prefersLocalInvocationPrimitiveOutputAt(0L, src); }
    public MemorySegment _prefersCompactVertexOutputAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_prefersCompactVertexOutput, index), LAYOUT_prefersCompactVertexOutput); }
    public MemorySegment _prefersCompactVertexOutput() { return _prefersCompactVertexOutputAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _prefersCompactVertexOutputAt(long index, MemorySegment src) { _prefersCompactVertexOutputAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _prefersCompactVertexOutput(MemorySegment src) { return _prefersCompactVertexOutputAt(0L, src); }
    public MemorySegment _prefersCompactPrimitiveOutputAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_prefersCompactPrimitiveOutput, index), LAYOUT_prefersCompactPrimitiveOutput); }
    public MemorySegment _prefersCompactPrimitiveOutput() { return _prefersCompactPrimitiveOutputAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _prefersCompactPrimitiveOutputAt(long index, MemorySegment src) { _prefersCompactPrimitiveOutputAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesEXT _prefersCompactPrimitiveOutput(MemorySegment src) { return _prefersCompactPrimitiveOutputAt(0L, src); }
}
