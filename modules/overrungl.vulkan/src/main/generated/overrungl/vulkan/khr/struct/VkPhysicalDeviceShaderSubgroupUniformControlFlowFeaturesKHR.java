// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSubgroupUniformControlFlow;
/// }
/// ```
public final class VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupUniformControlFlow")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderSubgroupUniformControlFlow = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupUniformControlFlow"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderSubgroupUniformControlFlow = LAYOUT.select(PathElement.groupElement("shaderSubgroupUniformControlFlow"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderSubgroupUniformControlFlow = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupUniformControlFlow"));

    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRShaderSubgroupUniformControlFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR); }
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRShaderSubgroupUniformControlFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR copyFrom(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderSubgroupUniformControlFlowAt(long index) { return (int) VH_shaderSubgroupUniformControlFlow.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupUniformControlFlow() { return (int) VH_shaderSubgroupUniformControlFlow.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR shaderSubgroupUniformControlFlowAt(long index, int value) { VH_shaderSubgroupUniformControlFlow.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR shaderSubgroupUniformControlFlow(int value) { VH_shaderSubgroupUniformControlFlow.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderSubgroupUniformControlFlowAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupUniformControlFlow, index), LAYOUT_shaderSubgroupUniformControlFlow); }
    public MemorySegment _shaderSubgroupUniformControlFlow() { return _shaderSubgroupUniformControlFlowAt(0L); }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR _shaderSubgroupUniformControlFlowAt(long index, MemorySegment src) { _shaderSubgroupUniformControlFlowAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR _shaderSubgroupUniformControlFlow(MemorySegment src) { return _shaderSubgroupUniformControlFlowAt(0L, src); }
}
