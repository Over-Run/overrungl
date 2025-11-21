// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMeshShaderPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMeshShaderPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxDrawMeshTasksCount;
///     uint32_t maxTaskWorkGroupInvocations;
///     uint32_t maxTaskWorkGroupSize[3];
///     uint32_t maxTaskTotalMemorySize;
///     uint32_t maxTaskOutputCount;
///     uint32_t maxMeshWorkGroupInvocations;
///     uint32_t maxMeshWorkGroupSize[3];
///     uint32_t maxMeshTotalMemorySize;
///     uint32_t maxMeshOutputVertices;
///     uint32_t maxMeshOutputPrimitives;
///     uint32_t maxMeshMultiviewViewCount;
///     uint32_t meshOutputPerVertexGranularity;
///     uint32_t meshOutputPerPrimitiveGranularity;
/// }
/// ```
public final class VkPhysicalDeviceMeshShaderPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDrawMeshTasksCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskTotalMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskOutputCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxMeshTotalMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives"),
        ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity"),
        ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxDrawMeshTasksCount = LAYOUT.byteOffset(PathElement.groupElement("maxDrawMeshTasksCount"));
    public static final long OFFSET_maxTaskWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    public static final long OFFSET_maxTaskWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupSize"));
    public static final long OFFSET_maxTaskTotalMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxTaskTotalMemorySize"));
    public static final long OFFSET_maxTaskOutputCount = LAYOUT.byteOffset(PathElement.groupElement("maxTaskOutputCount"));
    public static final long OFFSET_maxMeshWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    public static final long OFFSET_maxMeshWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupSize"));
    public static final long OFFSET_maxMeshTotalMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxMeshTotalMemorySize"));
    public static final long OFFSET_maxMeshOutputVertices = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputVertices"));
    public static final long OFFSET_maxMeshOutputPrimitives = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputPrimitives"));
    public static final long OFFSET_maxMeshMultiviewViewCount = LAYOUT.byteOffset(PathElement.groupElement("maxMeshMultiviewViewCount"));
    public static final long OFFSET_meshOutputPerVertexGranularity = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerVertexGranularity"));
    public static final long OFFSET_meshOutputPerPrimitiveGranularity = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxDrawMeshTasksCount = LAYOUT.select(PathElement.groupElement("maxDrawMeshTasksCount"));
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    public static final MemoryLayout LAYOUT_maxTaskWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxTaskWorkGroupSize"));
    public static final MemoryLayout LAYOUT_maxTaskTotalMemorySize = LAYOUT.select(PathElement.groupElement("maxTaskTotalMemorySize"));
    public static final MemoryLayout LAYOUT_maxTaskOutputCount = LAYOUT.select(PathElement.groupElement("maxTaskOutputCount"));
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    public static final MemoryLayout LAYOUT_maxMeshWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxMeshWorkGroupSize"));
    public static final MemoryLayout LAYOUT_maxMeshTotalMemorySize = LAYOUT.select(PathElement.groupElement("maxMeshTotalMemorySize"));
    public static final MemoryLayout LAYOUT_maxMeshOutputVertices = LAYOUT.select(PathElement.groupElement("maxMeshOutputVertices"));
    public static final MemoryLayout LAYOUT_maxMeshOutputPrimitives = LAYOUT.select(PathElement.groupElement("maxMeshOutputPrimitives"));
    public static final MemoryLayout LAYOUT_maxMeshMultiviewViewCount = LAYOUT.select(PathElement.groupElement("maxMeshMultiviewViewCount"));
    public static final MemoryLayout LAYOUT_meshOutputPerVertexGranularity = LAYOUT.select(PathElement.groupElement("meshOutputPerVertexGranularity"));
    public static final MemoryLayout LAYOUT_meshOutputPerPrimitiveGranularity = LAYOUT.select(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxDrawMeshTasksCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawMeshTasksCount"));
    public static final VarHandle VH_maxTaskWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupInvocations"));
    public static final VarHandle VH_maxTaskWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskWorkGroupSize"), PathElement.sequenceElement());
    public static final VarHandle VH_maxTaskTotalMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskTotalMemorySize"));
    public static final VarHandle VH_maxTaskOutputCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTaskOutputCount"));
    public static final VarHandle VH_maxMeshWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupInvocations"));
    public static final VarHandle VH_maxMeshWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshWorkGroupSize"), PathElement.sequenceElement());
    public static final VarHandle VH_maxMeshTotalMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshTotalMemorySize"));
    public static final VarHandle VH_maxMeshOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputVertices"));
    public static final VarHandle VH_maxMeshOutputPrimitives = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshOutputPrimitives"));
    public static final VarHandle VH_maxMeshMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMeshMultiviewViewCount"));
    public static final VarHandle VH_meshOutputPerVertexGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerVertexGranularity"));
    public static final VarHandle VH_meshOutputPerPrimitiveGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));

    public VkPhysicalDeviceMeshShaderPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMeshShaderPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMeshShaderPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMeshShaderPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMeshShaderPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMeshShaderPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMeshShaderPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV); }
    public static VkPhysicalDeviceMeshShaderPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceMeshShaderPropertiesNV copyFrom(VkPhysicalDeviceMeshShaderPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceMeshShaderPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMeshShaderPropertiesNV asSlice(long index) { return new VkPhysicalDeviceMeshShaderPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMeshShaderPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMeshShaderPropertiesNV at(long index, Consumer<VkPhysicalDeviceMeshShaderPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxDrawMeshTasksCountAt(long index) { return (int) VH_maxDrawMeshTasksCount.get(this.segment(), 0L, index); }
    public int maxTaskWorkGroupInvocationsAt(long index) { return (int) VH_maxTaskWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int maxTaskWorkGroupSizeAt(long index, long index0) { return (int) VH_maxTaskWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int maxTaskTotalMemorySizeAt(long index) { return (int) VH_maxTaskTotalMemorySize.get(this.segment(), 0L, index); }
    public int maxTaskOutputCountAt(long index) { return (int) VH_maxTaskOutputCount.get(this.segment(), 0L, index); }
    public int maxMeshWorkGroupInvocationsAt(long index) { return (int) VH_maxMeshWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int maxMeshWorkGroupSizeAt(long index, long index0) { return (int) VH_maxMeshWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int maxMeshTotalMemorySizeAt(long index) { return (int) VH_maxMeshTotalMemorySize.get(this.segment(), 0L, index); }
    public int maxMeshOutputVerticesAt(long index) { return (int) VH_maxMeshOutputVertices.get(this.segment(), 0L, index); }
    public int maxMeshOutputPrimitivesAt(long index) { return (int) VH_maxMeshOutputPrimitives.get(this.segment(), 0L, index); }
    public int maxMeshMultiviewViewCountAt(long index) { return (int) VH_maxMeshMultiviewViewCount.get(this.segment(), 0L, index); }
    public int meshOutputPerVertexGranularityAt(long index) { return (int) VH_meshOutputPerVertexGranularity.get(this.segment(), 0L, index); }
    public int meshOutputPerPrimitiveGranularityAt(long index) { return (int) VH_meshOutputPerPrimitiveGranularity.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxDrawMeshTasksCount() { return (int) VH_maxDrawMeshTasksCount.get(this.segment(), 0L, 0L); }
    public int maxTaskWorkGroupInvocations() { return (int) VH_maxTaskWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int maxTaskWorkGroupSize(long index0) { return (int) VH_maxTaskWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public int maxTaskTotalMemorySize() { return (int) VH_maxTaskTotalMemorySize.get(this.segment(), 0L, 0L); }
    public int maxTaskOutputCount() { return (int) VH_maxTaskOutputCount.get(this.segment(), 0L, 0L); }
    public int maxMeshWorkGroupInvocations() { return (int) VH_maxMeshWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int maxMeshWorkGroupSize(long index0) { return (int) VH_maxMeshWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public int maxMeshTotalMemorySize() { return (int) VH_maxMeshTotalMemorySize.get(this.segment(), 0L, 0L); }
    public int maxMeshOutputVertices() { return (int) VH_maxMeshOutputVertices.get(this.segment(), 0L, 0L); }
    public int maxMeshOutputPrimitives() { return (int) VH_maxMeshOutputPrimitives.get(this.segment(), 0L, 0L); }
    public int maxMeshMultiviewViewCount() { return (int) VH_maxMeshMultiviewViewCount.get(this.segment(), 0L, 0L); }
    public int meshOutputPerVertexGranularity() { return (int) VH_meshOutputPerVertexGranularity.get(this.segment(), 0L, 0L); }
    public int meshOutputPerPrimitiveGranularity() { return (int) VH_meshOutputPerPrimitiveGranularity.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxDrawMeshTasksCountAt(long index, int value) { VH_maxDrawMeshTasksCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupInvocationsAt(long index, int value) { VH_maxTaskWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSizeAt(long index, long index0, int value) { VH_maxTaskWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskTotalMemorySizeAt(long index, int value) { VH_maxTaskTotalMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskOutputCountAt(long index, int value) { VH_maxTaskOutputCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupInvocationsAt(long index, int value) { VH_maxMeshWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSizeAt(long index, long index0, int value) { VH_maxMeshWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshTotalMemorySizeAt(long index, int value) { VH_maxMeshTotalMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputVerticesAt(long index, int value) { VH_maxMeshOutputVertices.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputPrimitivesAt(long index, int value) { VH_maxMeshOutputPrimitives.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshMultiviewViewCountAt(long index, int value) { VH_maxMeshMultiviewViewCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerVertexGranularityAt(long index, int value) { VH_meshOutputPerVertexGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerPrimitiveGranularityAt(long index, int value) { VH_meshOutputPerPrimitiveGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxDrawMeshTasksCount(int value) { VH_maxDrawMeshTasksCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupInvocations(int value) { VH_maxTaskWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSize(long index0, int value) { VH_maxTaskWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskTotalMemorySize(int value) { VH_maxTaskTotalMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskOutputCount(int value) { VH_maxTaskOutputCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupInvocations(int value) { VH_maxMeshWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSize(long index0, int value) { VH_maxMeshWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshTotalMemorySize(int value) { VH_maxMeshTotalMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputVertices(int value) { VH_maxMeshOutputVertices.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputPrimitives(int value) { VH_maxMeshOutputPrimitives.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshMultiviewViewCount(int value) { VH_maxMeshMultiviewViewCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerVertexGranularity(int value) { VH_meshOutputPerVertexGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerPrimitiveGranularity(int value) { VH_meshOutputPerPrimitiveGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxDrawMeshTasksCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDrawMeshTasksCount, index), LAYOUT_maxDrawMeshTasksCount); }
    public MemorySegment _maxDrawMeshTasksCount() { return _maxDrawMeshTasksCountAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxDrawMeshTasksCountAt(long index, MemorySegment src) { _maxDrawMeshTasksCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxDrawMeshTasksCount(MemorySegment src) { return _maxDrawMeshTasksCountAt(0L, src); }
    public MemorySegment _maxTaskWorkGroupInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupInvocations, index), LAYOUT_maxTaskWorkGroupInvocations); }
    public MemorySegment _maxTaskWorkGroupInvocations() { return _maxTaskWorkGroupInvocationsAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxTaskWorkGroupInvocationsAt(long index, MemorySegment src) { _maxTaskWorkGroupInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxTaskWorkGroupInvocations(MemorySegment src) { return _maxTaskWorkGroupInvocationsAt(0L, src); }
    public MemorySegment _maxTaskWorkGroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskWorkGroupSize, index), LAYOUT_maxTaskWorkGroupSize); }
    public MemorySegment _maxTaskWorkGroupSize() { return _maxTaskWorkGroupSizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxTaskWorkGroupSizeAt(long index, MemorySegment src) { _maxTaskWorkGroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxTaskWorkGroupSize(MemorySegment src) { return _maxTaskWorkGroupSizeAt(0L, src); }
    public MemorySegment _maxTaskTotalMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskTotalMemorySize, index), LAYOUT_maxTaskTotalMemorySize); }
    public MemorySegment _maxTaskTotalMemorySize() { return _maxTaskTotalMemorySizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxTaskTotalMemorySizeAt(long index, MemorySegment src) { _maxTaskTotalMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxTaskTotalMemorySize(MemorySegment src) { return _maxTaskTotalMemorySizeAt(0L, src); }
    public MemorySegment _maxTaskOutputCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTaskOutputCount, index), LAYOUT_maxTaskOutputCount); }
    public MemorySegment _maxTaskOutputCount() { return _maxTaskOutputCountAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxTaskOutputCountAt(long index, MemorySegment src) { _maxTaskOutputCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxTaskOutputCount(MemorySegment src) { return _maxTaskOutputCountAt(0L, src); }
    public MemorySegment _maxMeshWorkGroupInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupInvocations, index), LAYOUT_maxMeshWorkGroupInvocations); }
    public MemorySegment _maxMeshWorkGroupInvocations() { return _maxMeshWorkGroupInvocationsAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshWorkGroupInvocationsAt(long index, MemorySegment src) { _maxMeshWorkGroupInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshWorkGroupInvocations(MemorySegment src) { return _maxMeshWorkGroupInvocationsAt(0L, src); }
    public MemorySegment _maxMeshWorkGroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshWorkGroupSize, index), LAYOUT_maxMeshWorkGroupSize); }
    public MemorySegment _maxMeshWorkGroupSize() { return _maxMeshWorkGroupSizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshWorkGroupSizeAt(long index, MemorySegment src) { _maxMeshWorkGroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshWorkGroupSize(MemorySegment src) { return _maxMeshWorkGroupSizeAt(0L, src); }
    public MemorySegment _maxMeshTotalMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshTotalMemorySize, index), LAYOUT_maxMeshTotalMemorySize); }
    public MemorySegment _maxMeshTotalMemorySize() { return _maxMeshTotalMemorySizeAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshTotalMemorySizeAt(long index, MemorySegment src) { _maxMeshTotalMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshTotalMemorySize(MemorySegment src) { return _maxMeshTotalMemorySizeAt(0L, src); }
    public MemorySegment _maxMeshOutputVerticesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshOutputVertices, index), LAYOUT_maxMeshOutputVertices); }
    public MemorySegment _maxMeshOutputVertices() { return _maxMeshOutputVerticesAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshOutputVerticesAt(long index, MemorySegment src) { _maxMeshOutputVerticesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshOutputVertices(MemorySegment src) { return _maxMeshOutputVerticesAt(0L, src); }
    public MemorySegment _maxMeshOutputPrimitivesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshOutputPrimitives, index), LAYOUT_maxMeshOutputPrimitives); }
    public MemorySegment _maxMeshOutputPrimitives() { return _maxMeshOutputPrimitivesAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshOutputPrimitivesAt(long index, MemorySegment src) { _maxMeshOutputPrimitivesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshOutputPrimitives(MemorySegment src) { return _maxMeshOutputPrimitivesAt(0L, src); }
    public MemorySegment _maxMeshMultiviewViewCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMeshMultiviewViewCount, index), LAYOUT_maxMeshMultiviewViewCount); }
    public MemorySegment _maxMeshMultiviewViewCount() { return _maxMeshMultiviewViewCountAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshMultiviewViewCountAt(long index, MemorySegment src) { _maxMeshMultiviewViewCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _maxMeshMultiviewViewCount(MemorySegment src) { return _maxMeshMultiviewViewCountAt(0L, src); }
    public MemorySegment _meshOutputPerVertexGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_meshOutputPerVertexGranularity, index), LAYOUT_meshOutputPerVertexGranularity); }
    public MemorySegment _meshOutputPerVertexGranularity() { return _meshOutputPerVertexGranularityAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _meshOutputPerVertexGranularityAt(long index, MemorySegment src) { _meshOutputPerVertexGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _meshOutputPerVertexGranularity(MemorySegment src) { return _meshOutputPerVertexGranularityAt(0L, src); }
    public MemorySegment _meshOutputPerPrimitiveGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_meshOutputPerPrimitiveGranularity, index), LAYOUT_meshOutputPerPrimitiveGranularity); }
    public MemorySegment _meshOutputPerPrimitiveGranularity() { return _meshOutputPerPrimitiveGranularityAt(0L); }
    public VkPhysicalDeviceMeshShaderPropertiesNV _meshOutputPerPrimitiveGranularityAt(long index, MemorySegment src) { _meshOutputPerPrimitiveGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderPropertiesNV _meshOutputPerPrimitiveGranularity(MemorySegment src) { return _meshOutputPerPrimitiveGranularityAt(0L, src); }
}
