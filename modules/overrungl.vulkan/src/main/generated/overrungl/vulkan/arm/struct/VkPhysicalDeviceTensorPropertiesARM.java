// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTensorPropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTensorPropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxTensorDimensionCount;
///     uint64_t maxTensorElements;
///     uint64_t maxPerDimensionTensorElements;
///     int64_t maxTensorStride;
///     uint64_t maxTensorSize;
///     uint32_t maxTensorShaderAccessArrayLength;
///     uint32_t maxTensorShaderAccessSize;
///     uint32_t maxDescriptorSetStorageTensors;
///     uint32_t maxPerStageDescriptorSetStorageTensors;
///     uint32_t maxDescriptorSetUpdateAfterBindStorageTensors;
///     uint32_t maxPerStageDescriptorUpdateAfterBindStorageTensors;
///     VkBool32 shaderStorageTensorArrayNonUniformIndexingNative;
///     VkShaderStageFlags shaderTensorSupportedStages;
/// }
/// ```
public final class VkPhysicalDeviceTensorPropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTensorDimensionCount"),
        ValueLayout.JAVA_LONG.withName("maxTensorElements"),
        ValueLayout.JAVA_LONG.withName("maxPerDimensionTensorElements"),
        ValueLayout.JAVA_LONG.withName("maxTensorStride"),
        ValueLayout.JAVA_LONG.withName("maxTensorSize"),
        ValueLayout.JAVA_INT.withName("maxTensorShaderAccessArrayLength"),
        ValueLayout.JAVA_INT.withName("maxTensorShaderAccessSize"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageTensors"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorSetStorageTensors"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageTensors"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageTensors"),
        ValueLayout.JAVA_INT.withName("shaderStorageTensorArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderTensorSupportedStages")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxTensorDimensionCount = LAYOUT.byteOffset(PathElement.groupElement("maxTensorDimensionCount"));
    public static final long OFFSET_maxTensorElements = LAYOUT.byteOffset(PathElement.groupElement("maxTensorElements"));
    public static final long OFFSET_maxPerDimensionTensorElements = LAYOUT.byteOffset(PathElement.groupElement("maxPerDimensionTensorElements"));
    public static final long OFFSET_maxTensorStride = LAYOUT.byteOffset(PathElement.groupElement("maxTensorStride"));
    public static final long OFFSET_maxTensorSize = LAYOUT.byteOffset(PathElement.groupElement("maxTensorSize"));
    public static final long OFFSET_maxTensorShaderAccessArrayLength = LAYOUT.byteOffset(PathElement.groupElement("maxTensorShaderAccessArrayLength"));
    public static final long OFFSET_maxTensorShaderAccessSize = LAYOUT.byteOffset(PathElement.groupElement("maxTensorShaderAccessSize"));
    public static final long OFFSET_maxDescriptorSetStorageTensors = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageTensors"));
    public static final long OFFSET_maxPerStageDescriptorSetStorageTensors = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSetStorageTensors"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageTensors = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageTensors"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageTensors = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageTensors"));
    public static final long OFFSET_shaderStorageTensorArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderTensorSupportedStages = LAYOUT.byteOffset(PathElement.groupElement("shaderTensorSupportedStages"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxTensorDimensionCount = LAYOUT.select(PathElement.groupElement("maxTensorDimensionCount"));
    public static final MemoryLayout LAYOUT_maxTensorElements = LAYOUT.select(PathElement.groupElement("maxTensorElements"));
    public static final MemoryLayout LAYOUT_maxPerDimensionTensorElements = LAYOUT.select(PathElement.groupElement("maxPerDimensionTensorElements"));
    public static final MemoryLayout LAYOUT_maxTensorStride = LAYOUT.select(PathElement.groupElement("maxTensorStride"));
    public static final MemoryLayout LAYOUT_maxTensorSize = LAYOUT.select(PathElement.groupElement("maxTensorSize"));
    public static final MemoryLayout LAYOUT_maxTensorShaderAccessArrayLength = LAYOUT.select(PathElement.groupElement("maxTensorShaderAccessArrayLength"));
    public static final MemoryLayout LAYOUT_maxTensorShaderAccessSize = LAYOUT.select(PathElement.groupElement("maxTensorShaderAccessSize"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetStorageTensors = LAYOUT.select(PathElement.groupElement("maxDescriptorSetStorageTensors"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorSetStorageTensors = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorSetStorageTensors"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageTensors = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageTensors"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageTensors = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageTensors"));
    public static final MemoryLayout LAYOUT_shaderStorageTensorArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderTensorSupportedStages = LAYOUT.select(PathElement.groupElement("shaderTensorSupportedStages"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxTensorDimensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorDimensionCount"));
    public static final VarHandle VH_maxTensorElements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorElements"));
    public static final VarHandle VH_maxPerDimensionTensorElements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerDimensionTensorElements"));
    public static final VarHandle VH_maxTensorStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorStride"));
    public static final VarHandle VH_maxTensorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorSize"));
    public static final VarHandle VH_maxTensorShaderAccessArrayLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorShaderAccessArrayLength"));
    public static final VarHandle VH_maxTensorShaderAccessSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorShaderAccessSize"));
    public static final VarHandle VH_maxDescriptorSetStorageTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageTensors"));
    public static final VarHandle VH_maxPerStageDescriptorSetStorageTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorSetStorageTensors"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageTensors"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageTensors"));
    public static final VarHandle VH_shaderStorageTensorArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderTensorSupportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTensorSupportedStages"));

    public VkPhysicalDeviceTensorPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTensorPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorPropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTensorPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTensorPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTensorPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTensorPropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTensorPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTensorPropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTensorPropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM); }
    public static VkPhysicalDeviceTensorPropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM);
        return s;
    }
    public VkPhysicalDeviceTensorPropertiesARM copyFrom(VkPhysicalDeviceTensorPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTensorPropertiesARM reinterpret(long count) { return new VkPhysicalDeviceTensorPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTensorPropertiesARM asSlice(long index) { return new VkPhysicalDeviceTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTensorPropertiesARM asSlice(long index, long count) { return new VkPhysicalDeviceTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTensorPropertiesARM at(long index, Consumer<VkPhysicalDeviceTensorPropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxTensorDimensionCountAt(long index) { return (int) VH_maxTensorDimensionCount.get(this.segment(), 0L, index); }
    public long maxTensorElementsAt(long index) { return (long) VH_maxTensorElements.get(this.segment(), 0L, index); }
    public long maxPerDimensionTensorElementsAt(long index) { return (long) VH_maxPerDimensionTensorElements.get(this.segment(), 0L, index); }
    public long maxTensorStrideAt(long index) { return (long) VH_maxTensorStride.get(this.segment(), 0L, index); }
    public long maxTensorSizeAt(long index) { return (long) VH_maxTensorSize.get(this.segment(), 0L, index); }
    public int maxTensorShaderAccessArrayLengthAt(long index) { return (int) VH_maxTensorShaderAccessArrayLength.get(this.segment(), 0L, index); }
    public int maxTensorShaderAccessSizeAt(long index) { return (int) VH_maxTensorShaderAccessSize.get(this.segment(), 0L, index); }
    public int maxDescriptorSetStorageTensorsAt(long index) { return (int) VH_maxDescriptorSetStorageTensors.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorSetStorageTensorsAt(long index) { return (int) VH_maxPerStageDescriptorSetStorageTensors.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindStorageTensorsAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageTensors.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageTensors.get(this.segment(), 0L, index); }
    public int shaderStorageTensorArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderStorageTensorArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderTensorSupportedStagesAt(long index) { return (int) VH_shaderTensorSupportedStages.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxTensorDimensionCount() { return (int) VH_maxTensorDimensionCount.get(this.segment(), 0L, 0L); }
    public long maxTensorElements() { return (long) VH_maxTensorElements.get(this.segment(), 0L, 0L); }
    public long maxPerDimensionTensorElements() { return (long) VH_maxPerDimensionTensorElements.get(this.segment(), 0L, 0L); }
    public long maxTensorStride() { return (long) VH_maxTensorStride.get(this.segment(), 0L, 0L); }
    public long maxTensorSize() { return (long) VH_maxTensorSize.get(this.segment(), 0L, 0L); }
    public int maxTensorShaderAccessArrayLength() { return (int) VH_maxTensorShaderAccessArrayLength.get(this.segment(), 0L, 0L); }
    public int maxTensorShaderAccessSize() { return (int) VH_maxTensorShaderAccessSize.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetStorageTensors() { return (int) VH_maxDescriptorSetStorageTensors.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorSetStorageTensors() { return (int) VH_maxPerStageDescriptorSetStorageTensors.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindStorageTensors() { return (int) VH_maxDescriptorSetUpdateAfterBindStorageTensors.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindStorageTensors() { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageTensors.get(this.segment(), 0L, 0L); }
    public int shaderStorageTensorArrayNonUniformIndexingNative() { return (int) VH_shaderStorageTensorArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderTensorSupportedStages() { return (int) VH_shaderTensorSupportedStages.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTensorPropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorDimensionCountAt(long index, int value) { VH_maxTensorDimensionCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorElementsAt(long index, long value) { VH_maxTensorElements.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxPerDimensionTensorElementsAt(long index, long value) { VH_maxPerDimensionTensorElements.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorStrideAt(long index, long value) { VH_maxTensorStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorSizeAt(long index, long value) { VH_maxTensorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessArrayLengthAt(long index, int value) { VH_maxTensorShaderAccessArrayLength.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessSizeAt(long index, int value) { VH_maxTensorShaderAccessSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetStorageTensorsAt(long index, int value) { VH_maxDescriptorSetStorageTensors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorSetStorageTensorsAt(long index, int value) { VH_maxPerStageDescriptorSetStorageTensors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetUpdateAfterBindStorageTensorsAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageTensors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageTensors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM shaderStorageTensorArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderStorageTensorArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM shaderTensorSupportedStagesAt(long index, int value) { VH_shaderTensorSupportedStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorDimensionCount(int value) { VH_maxTensorDimensionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorElements(long value) { VH_maxTensorElements.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxPerDimensionTensorElements(long value) { VH_maxPerDimensionTensorElements.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorStride(long value) { VH_maxTensorStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorSize(long value) { VH_maxTensorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessArrayLength(int value) { VH_maxTensorShaderAccessArrayLength.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessSize(int value) { VH_maxTensorShaderAccessSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetStorageTensors(int value) { VH_maxDescriptorSetStorageTensors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorSetStorageTensors(int value) { VH_maxPerStageDescriptorSetStorageTensors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetUpdateAfterBindStorageTensors(int value) { VH_maxDescriptorSetUpdateAfterBindStorageTensors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorUpdateAfterBindStorageTensors(int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageTensors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM shaderStorageTensorArrayNonUniformIndexingNative(int value) { VH_shaderStorageTensorArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTensorPropertiesARM shaderTensorSupportedStages(int value) { VH_shaderTensorSupportedStages.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxTensorDimensionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTensorDimensionCount, index), LAYOUT_maxTensorDimensionCount); }
    public MemorySegment _maxTensorDimensionCount() { return _maxTensorDimensionCountAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorDimensionCountAt(long index, MemorySegment src) { _maxTensorDimensionCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorDimensionCount(MemorySegment src) { return _maxTensorDimensionCountAt(0L, src); }
    public MemorySegment _maxTensorElementsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTensorElements, index), LAYOUT_maxTensorElements); }
    public MemorySegment _maxTensorElements() { return _maxTensorElementsAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorElementsAt(long index, MemorySegment src) { _maxTensorElementsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorElements(MemorySegment src) { return _maxTensorElementsAt(0L, src); }
    public MemorySegment _maxPerDimensionTensorElementsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerDimensionTensorElements, index), LAYOUT_maxPerDimensionTensorElements); }
    public MemorySegment _maxPerDimensionTensorElements() { return _maxPerDimensionTensorElementsAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxPerDimensionTensorElementsAt(long index, MemorySegment src) { _maxPerDimensionTensorElementsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxPerDimensionTensorElements(MemorySegment src) { return _maxPerDimensionTensorElementsAt(0L, src); }
    public MemorySegment _maxTensorStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTensorStride, index), LAYOUT_maxTensorStride); }
    public MemorySegment _maxTensorStride() { return _maxTensorStrideAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorStrideAt(long index, MemorySegment src) { _maxTensorStrideAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorStride(MemorySegment src) { return _maxTensorStrideAt(0L, src); }
    public MemorySegment _maxTensorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTensorSize, index), LAYOUT_maxTensorSize); }
    public MemorySegment _maxTensorSize() { return _maxTensorSizeAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorSizeAt(long index, MemorySegment src) { _maxTensorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorSize(MemorySegment src) { return _maxTensorSizeAt(0L, src); }
    public MemorySegment _maxTensorShaderAccessArrayLengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTensorShaderAccessArrayLength, index), LAYOUT_maxTensorShaderAccessArrayLength); }
    public MemorySegment _maxTensorShaderAccessArrayLength() { return _maxTensorShaderAccessArrayLengthAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorShaderAccessArrayLengthAt(long index, MemorySegment src) { _maxTensorShaderAccessArrayLengthAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorShaderAccessArrayLength(MemorySegment src) { return _maxTensorShaderAccessArrayLengthAt(0L, src); }
    public MemorySegment _maxTensorShaderAccessSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTensorShaderAccessSize, index), LAYOUT_maxTensorShaderAccessSize); }
    public MemorySegment _maxTensorShaderAccessSize() { return _maxTensorShaderAccessSizeAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorShaderAccessSizeAt(long index, MemorySegment src) { _maxTensorShaderAccessSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxTensorShaderAccessSize(MemorySegment src) { return _maxTensorShaderAccessSizeAt(0L, src); }
    public MemorySegment _maxDescriptorSetStorageTensorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetStorageTensors, index), LAYOUT_maxDescriptorSetStorageTensors); }
    public MemorySegment _maxDescriptorSetStorageTensors() { return _maxDescriptorSetStorageTensorsAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxDescriptorSetStorageTensorsAt(long index, MemorySegment src) { _maxDescriptorSetStorageTensorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxDescriptorSetStorageTensors(MemorySegment src) { return _maxDescriptorSetStorageTensorsAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorSetStorageTensorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorSetStorageTensors, index), LAYOUT_maxPerStageDescriptorSetStorageTensors); }
    public MemorySegment _maxPerStageDescriptorSetStorageTensors() { return _maxPerStageDescriptorSetStorageTensorsAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxPerStageDescriptorSetStorageTensorsAt(long index, MemorySegment src) { _maxPerStageDescriptorSetStorageTensorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxPerStageDescriptorSetStorageTensors(MemorySegment src) { return _maxPerStageDescriptorSetStorageTensorsAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageTensorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindStorageTensors, index), LAYOUT_maxDescriptorSetUpdateAfterBindStorageTensors); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageTensors() { return _maxDescriptorSetUpdateAfterBindStorageTensorsAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxDescriptorSetUpdateAfterBindStorageTensorsAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindStorageTensorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxDescriptorSetUpdateAfterBindStorageTensors(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindStorageTensorsAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindStorageTensors, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageTensors); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageTensors() { return _maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _maxPerStageDescriptorUpdateAfterBindStorageTensors(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(0L, src); }
    public MemorySegment _shaderStorageTensorArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageTensorArrayNonUniformIndexingNative, index), LAYOUT_shaderStorageTensorArrayNonUniformIndexingNative); }
    public MemorySegment _shaderStorageTensorArrayNonUniformIndexingNative() { return _shaderStorageTensorArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _shaderStorageTensorArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderStorageTensorArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _shaderStorageTensorArrayNonUniformIndexingNative(MemorySegment src) { return _shaderStorageTensorArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderTensorSupportedStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTensorSupportedStages, index), LAYOUT_shaderTensorSupportedStages); }
    public MemorySegment _shaderTensorSupportedStages() { return _shaderTensorSupportedStagesAt(0L); }
    public VkPhysicalDeviceTensorPropertiesARM _shaderTensorSupportedStagesAt(long index, MemorySegment src) { _shaderTensorSupportedStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTensorPropertiesARM _shaderTensorSupportedStages(MemorySegment src) { return _shaderTensorSupportedStagesAt(0L, src); }
}
