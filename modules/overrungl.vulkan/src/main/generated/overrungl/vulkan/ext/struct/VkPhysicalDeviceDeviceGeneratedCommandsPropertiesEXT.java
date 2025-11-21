// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxIndirectPipelineCount;
///     uint32_t maxIndirectShaderObjectCount;
///     uint32_t maxIndirectSequenceCount;
///     uint32_t maxIndirectCommandsTokenCount;
///     uint32_t maxIndirectCommandsTokenOffset;
///     uint32_t maxIndirectCommandsIndirectStride;
///     VkIndirectCommandsInputModeFlagsEXT supportedIndirectCommandsInputModes;
///     VkShaderStageFlags supportedIndirectCommandsShaderStages;
///     VkShaderStageFlags supportedIndirectCommandsShaderStagesPipelineBinding;
///     VkShaderStageFlags supportedIndirectCommandsShaderStagesShaderBinding;
///     VkBool32 deviceGeneratedCommandsTransformFeedback;
///     VkBool32 deviceGeneratedCommandsMultiDrawIndirectCount;
/// }
/// ```
public final class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxIndirectPipelineCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectShaderObjectCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenOffset"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsIndirectStride"),
        ValueLayout.JAVA_INT.withName("supportedIndirectCommandsInputModes"),
        ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStages"),
        ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStagesPipelineBinding"),
        ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStagesShaderBinding"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCommandsTransformFeedback"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCommandsMultiDrawIndirectCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxIndirectPipelineCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectPipelineCount"));
    public static final long OFFSET_maxIndirectShaderObjectCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectShaderObjectCount"));
    public static final long OFFSET_maxIndirectSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectSequenceCount"));
    public static final long OFFSET_maxIndirectCommandsTokenCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    public static final long OFFSET_maxIndirectCommandsTokenOffset = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    public static final long OFFSET_maxIndirectCommandsIndirectStride = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
    public static final long OFFSET_supportedIndirectCommandsInputModes = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsInputModes"));
    public static final long OFFSET_supportedIndirectCommandsShaderStages = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
    public static final long OFFSET_supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
    public static final long OFFSET_supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
    public static final long OFFSET_deviceGeneratedCommandsTransformFeedback = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
    public static final long OFFSET_deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxIndirectPipelineCount = LAYOUT.select(PathElement.groupElement("maxIndirectPipelineCount"));
    public static final MemoryLayout LAYOUT_maxIndirectShaderObjectCount = LAYOUT.select(PathElement.groupElement("maxIndirectShaderObjectCount"));
    public static final MemoryLayout LAYOUT_maxIndirectSequenceCount = LAYOUT.select(PathElement.groupElement("maxIndirectSequenceCount"));
    public static final MemoryLayout LAYOUT_maxIndirectCommandsTokenCount = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    public static final MemoryLayout LAYOUT_maxIndirectCommandsTokenOffset = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    public static final MemoryLayout LAYOUT_maxIndirectCommandsIndirectStride = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
    public static final MemoryLayout LAYOUT_supportedIndirectCommandsInputModes = LAYOUT.select(PathElement.groupElement("supportedIndirectCommandsInputModes"));
    public static final MemoryLayout LAYOUT_supportedIndirectCommandsShaderStages = LAYOUT.select(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
    public static final MemoryLayout LAYOUT_supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT.select(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
    public static final MemoryLayout LAYOUT_supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT.select(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
    public static final MemoryLayout LAYOUT_deviceGeneratedCommandsTransformFeedback = LAYOUT.select(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
    public static final MemoryLayout LAYOUT_deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT.select(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxIndirectPipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectPipelineCount"));
    public static final VarHandle VH_maxIndirectShaderObjectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectShaderObjectCount"));
    public static final VarHandle VH_maxIndirectSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectSequenceCount"));
    public static final VarHandle VH_maxIndirectCommandsTokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    public static final VarHandle VH_maxIndirectCommandsTokenOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    public static final VarHandle VH_maxIndirectCommandsIndirectStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
    public static final VarHandle VH_supportedIndirectCommandsInputModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsInputModes"));
    public static final VarHandle VH_supportedIndirectCommandsShaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
    public static final VarHandle VH_supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
    public static final VarHandle VH_supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
    public static final VarHandle VH_deviceGeneratedCommandsTransformFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
    public static final VarHandle VH_deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT at(long index, Consumer<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxIndirectPipelineCountAt(long index) { return (int) VH_maxIndirectPipelineCount.get(this.segment(), 0L, index); }
    public int maxIndirectShaderObjectCountAt(long index) { return (int) VH_maxIndirectShaderObjectCount.get(this.segment(), 0L, index); }
    public int maxIndirectSequenceCountAt(long index) { return (int) VH_maxIndirectSequenceCount.get(this.segment(), 0L, index); }
    public int maxIndirectCommandsTokenCountAt(long index) { return (int) VH_maxIndirectCommandsTokenCount.get(this.segment(), 0L, index); }
    public int maxIndirectCommandsTokenOffsetAt(long index) { return (int) VH_maxIndirectCommandsTokenOffset.get(this.segment(), 0L, index); }
    public int maxIndirectCommandsIndirectStrideAt(long index) { return (int) VH_maxIndirectCommandsIndirectStride.get(this.segment(), 0L, index); }
    public int supportedIndirectCommandsInputModesAt(long index) { return (int) VH_supportedIndirectCommandsInputModes.get(this.segment(), 0L, index); }
    public int supportedIndirectCommandsShaderStagesAt(long index) { return (int) VH_supportedIndirectCommandsShaderStages.get(this.segment(), 0L, index); }
    public int supportedIndirectCommandsShaderStagesPipelineBindingAt(long index) { return (int) VH_supportedIndirectCommandsShaderStagesPipelineBinding.get(this.segment(), 0L, index); }
    public int supportedIndirectCommandsShaderStagesShaderBindingAt(long index) { return (int) VH_supportedIndirectCommandsShaderStagesShaderBinding.get(this.segment(), 0L, index); }
    public int deviceGeneratedCommandsTransformFeedbackAt(long index) { return (int) VH_deviceGeneratedCommandsTransformFeedback.get(this.segment(), 0L, index); }
    public int deviceGeneratedCommandsMultiDrawIndirectCountAt(long index) { return (int) VH_deviceGeneratedCommandsMultiDrawIndirectCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxIndirectPipelineCount() { return (int) VH_maxIndirectPipelineCount.get(this.segment(), 0L, 0L); }
    public int maxIndirectShaderObjectCount() { return (int) VH_maxIndirectShaderObjectCount.get(this.segment(), 0L, 0L); }
    public int maxIndirectSequenceCount() { return (int) VH_maxIndirectSequenceCount.get(this.segment(), 0L, 0L); }
    public int maxIndirectCommandsTokenCount() { return (int) VH_maxIndirectCommandsTokenCount.get(this.segment(), 0L, 0L); }
    public int maxIndirectCommandsTokenOffset() { return (int) VH_maxIndirectCommandsTokenOffset.get(this.segment(), 0L, 0L); }
    public int maxIndirectCommandsIndirectStride() { return (int) VH_maxIndirectCommandsIndirectStride.get(this.segment(), 0L, 0L); }
    public int supportedIndirectCommandsInputModes() { return (int) VH_supportedIndirectCommandsInputModes.get(this.segment(), 0L, 0L); }
    public int supportedIndirectCommandsShaderStages() { return (int) VH_supportedIndirectCommandsShaderStages.get(this.segment(), 0L, 0L); }
    public int supportedIndirectCommandsShaderStagesPipelineBinding() { return (int) VH_supportedIndirectCommandsShaderStagesPipelineBinding.get(this.segment(), 0L, 0L); }
    public int supportedIndirectCommandsShaderStagesShaderBinding() { return (int) VH_supportedIndirectCommandsShaderStagesShaderBinding.get(this.segment(), 0L, 0L); }
    public int deviceGeneratedCommandsTransformFeedback() { return (int) VH_deviceGeneratedCommandsTransformFeedback.get(this.segment(), 0L, 0L); }
    public int deviceGeneratedCommandsMultiDrawIndirectCount() { return (int) VH_deviceGeneratedCommandsMultiDrawIndirectCount.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectPipelineCountAt(long index, int value) { VH_maxIndirectPipelineCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectShaderObjectCountAt(long index, int value) { VH_maxIndirectShaderObjectCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectSequenceCountAt(long index, int value) { VH_maxIndirectSequenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenCountAt(long index, int value) { VH_maxIndirectCommandsTokenCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenOffsetAt(long index, int value) { VH_maxIndirectCommandsTokenOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsIndirectStrideAt(long index, int value) { VH_maxIndirectCommandsIndirectStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsInputModesAt(long index, int value) { VH_supportedIndirectCommandsInputModes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesAt(long index, int value) { VH_supportedIndirectCommandsShaderStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesPipelineBindingAt(long index, int value) { VH_supportedIndirectCommandsShaderStagesPipelineBinding.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesShaderBindingAt(long index, int value) { VH_supportedIndirectCommandsShaderStagesShaderBinding.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsTransformFeedbackAt(long index, int value) { VH_deviceGeneratedCommandsTransformFeedback.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsMultiDrawIndirectCountAt(long index, int value) { VH_deviceGeneratedCommandsMultiDrawIndirectCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectPipelineCount(int value) { VH_maxIndirectPipelineCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectShaderObjectCount(int value) { VH_maxIndirectShaderObjectCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectSequenceCount(int value) { VH_maxIndirectSequenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenCount(int value) { VH_maxIndirectCommandsTokenCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenOffset(int value) { VH_maxIndirectCommandsTokenOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsIndirectStride(int value) { VH_maxIndirectCommandsIndirectStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsInputModes(int value) { VH_supportedIndirectCommandsInputModes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStages(int value) { VH_supportedIndirectCommandsShaderStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesPipelineBinding(int value) { VH_supportedIndirectCommandsShaderStagesPipelineBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesShaderBinding(int value) { VH_supportedIndirectCommandsShaderStagesShaderBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsTransformFeedback(int value) { VH_deviceGeneratedCommandsTransformFeedback.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsMultiDrawIndirectCount(int value) { VH_deviceGeneratedCommandsMultiDrawIndirectCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxIndirectPipelineCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectPipelineCount, index), LAYOUT_maxIndirectPipelineCount); }
    public MemorySegment _maxIndirectPipelineCount() { return _maxIndirectPipelineCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectPipelineCountAt(long index, MemorySegment src) { _maxIndirectPipelineCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectPipelineCount(MemorySegment src) { return _maxIndirectPipelineCountAt(0L, src); }
    public MemorySegment _maxIndirectShaderObjectCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectShaderObjectCount, index), LAYOUT_maxIndirectShaderObjectCount); }
    public MemorySegment _maxIndirectShaderObjectCount() { return _maxIndirectShaderObjectCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectShaderObjectCountAt(long index, MemorySegment src) { _maxIndirectShaderObjectCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectShaderObjectCount(MemorySegment src) { return _maxIndirectShaderObjectCountAt(0L, src); }
    public MemorySegment _maxIndirectSequenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectSequenceCount, index), LAYOUT_maxIndirectSequenceCount); }
    public MemorySegment _maxIndirectSequenceCount() { return _maxIndirectSequenceCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectSequenceCountAt(long index, MemorySegment src) { _maxIndirectSequenceCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectSequenceCount(MemorySegment src) { return _maxIndirectSequenceCountAt(0L, src); }
    public MemorySegment _maxIndirectCommandsTokenCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectCommandsTokenCount, index), LAYOUT_maxIndirectCommandsTokenCount); }
    public MemorySegment _maxIndirectCommandsTokenCount() { return _maxIndirectCommandsTokenCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectCommandsTokenCountAt(long index, MemorySegment src) { _maxIndirectCommandsTokenCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectCommandsTokenCount(MemorySegment src) { return _maxIndirectCommandsTokenCountAt(0L, src); }
    public MemorySegment _maxIndirectCommandsTokenOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectCommandsTokenOffset, index), LAYOUT_maxIndirectCommandsTokenOffset); }
    public MemorySegment _maxIndirectCommandsTokenOffset() { return _maxIndirectCommandsTokenOffsetAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectCommandsTokenOffsetAt(long index, MemorySegment src) { _maxIndirectCommandsTokenOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectCommandsTokenOffset(MemorySegment src) { return _maxIndirectCommandsTokenOffsetAt(0L, src); }
    public MemorySegment _maxIndirectCommandsIndirectStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectCommandsIndirectStride, index), LAYOUT_maxIndirectCommandsIndirectStride); }
    public MemorySegment _maxIndirectCommandsIndirectStride() { return _maxIndirectCommandsIndirectStrideAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectCommandsIndirectStrideAt(long index, MemorySegment src) { _maxIndirectCommandsIndirectStrideAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _maxIndirectCommandsIndirectStride(MemorySegment src) { return _maxIndirectCommandsIndirectStrideAt(0L, src); }
    public MemorySegment _supportedIndirectCommandsInputModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedIndirectCommandsInputModes, index), LAYOUT_supportedIndirectCommandsInputModes); }
    public MemorySegment _supportedIndirectCommandsInputModes() { return _supportedIndirectCommandsInputModesAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _supportedIndirectCommandsInputModesAt(long index, MemorySegment src) { _supportedIndirectCommandsInputModesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _supportedIndirectCommandsInputModes(MemorySegment src) { return _supportedIndirectCommandsInputModesAt(0L, src); }
    public MemorySegment _supportedIndirectCommandsShaderStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedIndirectCommandsShaderStages, index), LAYOUT_supportedIndirectCommandsShaderStages); }
    public MemorySegment _supportedIndirectCommandsShaderStages() { return _supportedIndirectCommandsShaderStagesAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _supportedIndirectCommandsShaderStagesAt(long index, MemorySegment src) { _supportedIndirectCommandsShaderStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _supportedIndirectCommandsShaderStages(MemorySegment src) { return _supportedIndirectCommandsShaderStagesAt(0L, src); }
    public MemorySegment _supportedIndirectCommandsShaderStagesPipelineBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedIndirectCommandsShaderStagesPipelineBinding, index), LAYOUT_supportedIndirectCommandsShaderStagesPipelineBinding); }
    public MemorySegment _supportedIndirectCommandsShaderStagesPipelineBinding() { return _supportedIndirectCommandsShaderStagesPipelineBindingAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _supportedIndirectCommandsShaderStagesPipelineBindingAt(long index, MemorySegment src) { _supportedIndirectCommandsShaderStagesPipelineBindingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _supportedIndirectCommandsShaderStagesPipelineBinding(MemorySegment src) { return _supportedIndirectCommandsShaderStagesPipelineBindingAt(0L, src); }
    public MemorySegment _supportedIndirectCommandsShaderStagesShaderBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedIndirectCommandsShaderStagesShaderBinding, index), LAYOUT_supportedIndirectCommandsShaderStagesShaderBinding); }
    public MemorySegment _supportedIndirectCommandsShaderStagesShaderBinding() { return _supportedIndirectCommandsShaderStagesShaderBindingAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _supportedIndirectCommandsShaderStagesShaderBindingAt(long index, MemorySegment src) { _supportedIndirectCommandsShaderStagesShaderBindingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _supportedIndirectCommandsShaderStagesShaderBinding(MemorySegment src) { return _supportedIndirectCommandsShaderStagesShaderBindingAt(0L, src); }
    public MemorySegment _deviceGeneratedCommandsTransformFeedbackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceGeneratedCommandsTransformFeedback, index), LAYOUT_deviceGeneratedCommandsTransformFeedback); }
    public MemorySegment _deviceGeneratedCommandsTransformFeedback() { return _deviceGeneratedCommandsTransformFeedbackAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _deviceGeneratedCommandsTransformFeedbackAt(long index, MemorySegment src) { _deviceGeneratedCommandsTransformFeedbackAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _deviceGeneratedCommandsTransformFeedback(MemorySegment src) { return _deviceGeneratedCommandsTransformFeedbackAt(0L, src); }
    public MemorySegment _deviceGeneratedCommandsMultiDrawIndirectCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceGeneratedCommandsMultiDrawIndirectCount, index), LAYOUT_deviceGeneratedCommandsMultiDrawIndirectCount); }
    public MemorySegment _deviceGeneratedCommandsMultiDrawIndirectCount() { return _deviceGeneratedCommandsMultiDrawIndirectCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _deviceGeneratedCommandsMultiDrawIndirectCountAt(long index, MemorySegment src) { _deviceGeneratedCommandsMultiDrawIndirectCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT _deviceGeneratedCommandsMultiDrawIndirectCount(MemorySegment src) { return _deviceGeneratedCommandsMultiDrawIndirectCountAt(0L, src); }
}
