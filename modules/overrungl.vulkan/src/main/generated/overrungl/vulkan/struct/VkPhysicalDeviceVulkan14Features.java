// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan14Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan14Features {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 globalPriorityQuery;
///     VkBool32 shaderSubgroupRotate;
///     VkBool32 shaderSubgroupRotateClustered;
///     VkBool32 shaderFloatControls2;
///     VkBool32 shaderExpectAssume;
///     VkBool32 rectangularLines;
///     VkBool32 bresenhamLines;
///     VkBool32 smoothLines;
///     VkBool32 stippledRectangularLines;
///     VkBool32 stippledBresenhamLines;
///     VkBool32 stippledSmoothLines;
///     VkBool32 vertexAttributeInstanceRateDivisor;
///     VkBool32 vertexAttributeInstanceRateZeroDivisor;
///     VkBool32 indexTypeUint8;
///     VkBool32 dynamicRenderingLocalRead;
///     VkBool32 maintenance5;
///     VkBool32 maintenance6;
///     VkBool32 pipelineProtectedAccess;
///     VkBool32 pipelineRobustness;
///     VkBool32 hostImageCopy;
///     VkBool32 pushDescriptor;
/// }
/// ```
public final class VkPhysicalDeviceVulkan14Features extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriorityQuery"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotate"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered"),
        ValueLayout.JAVA_INT.withName("shaderFloatControls2"),
        ValueLayout.JAVA_INT.withName("shaderExpectAssume"),
        ValueLayout.JAVA_INT.withName("rectangularLines"),
        ValueLayout.JAVA_INT.withName("bresenhamLines"),
        ValueLayout.JAVA_INT.withName("smoothLines"),
        ValueLayout.JAVA_INT.withName("stippledRectangularLines"),
        ValueLayout.JAVA_INT.withName("stippledBresenhamLines"),
        ValueLayout.JAVA_INT.withName("stippledSmoothLines"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor"),
        ValueLayout.JAVA_INT.withName("indexTypeUint8"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalRead"),
        ValueLayout.JAVA_INT.withName("maintenance5"),
        ValueLayout.JAVA_INT.withName("maintenance6"),
        ValueLayout.JAVA_INT.withName("pipelineProtectedAccess"),
        ValueLayout.JAVA_INT.withName("pipelineRobustness"),
        ValueLayout.JAVA_INT.withName("hostImageCopy"),
        ValueLayout.JAVA_INT.withName("pushDescriptor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_globalPriorityQuery = LAYOUT.byteOffset(PathElement.groupElement("globalPriorityQuery"));
    public static final long OFFSET_shaderSubgroupRotate = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupRotate"));
    public static final long OFFSET_shaderSubgroupRotateClustered = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupRotateClustered"));
    public static final long OFFSET_shaderFloatControls2 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloatControls2"));
    public static final long OFFSET_shaderExpectAssume = LAYOUT.byteOffset(PathElement.groupElement("shaderExpectAssume"));
    public static final long OFFSET_rectangularLines = LAYOUT.byteOffset(PathElement.groupElement("rectangularLines"));
    public static final long OFFSET_bresenhamLines = LAYOUT.byteOffset(PathElement.groupElement("bresenhamLines"));
    public static final long OFFSET_smoothLines = LAYOUT.byteOffset(PathElement.groupElement("smoothLines"));
    public static final long OFFSET_stippledRectangularLines = LAYOUT.byteOffset(PathElement.groupElement("stippledRectangularLines"));
    public static final long OFFSET_stippledBresenhamLines = LAYOUT.byteOffset(PathElement.groupElement("stippledBresenhamLines"));
    public static final long OFFSET_stippledSmoothLines = LAYOUT.byteOffset(PathElement.groupElement("stippledSmoothLines"));
    public static final long OFFSET_vertexAttributeInstanceRateDivisor = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    public static final long OFFSET_vertexAttributeInstanceRateZeroDivisor = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    public static final long OFFSET_indexTypeUint8 = LAYOUT.byteOffset(PathElement.groupElement("indexTypeUint8"));
    public static final long OFFSET_dynamicRenderingLocalRead = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalRead"));
    public static final long OFFSET_maintenance5 = LAYOUT.byteOffset(PathElement.groupElement("maintenance5"));
    public static final long OFFSET_maintenance6 = LAYOUT.byteOffset(PathElement.groupElement("maintenance6"));
    public static final long OFFSET_pipelineProtectedAccess = LAYOUT.byteOffset(PathElement.groupElement("pipelineProtectedAccess"));
    public static final long OFFSET_pipelineRobustness = LAYOUT.byteOffset(PathElement.groupElement("pipelineRobustness"));
    public static final long OFFSET_hostImageCopy = LAYOUT.byteOffset(PathElement.groupElement("hostImageCopy"));
    public static final long OFFSET_pushDescriptor = LAYOUT.byteOffset(PathElement.groupElement("pushDescriptor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_globalPriorityQuery = LAYOUT.select(PathElement.groupElement("globalPriorityQuery"));
    public static final MemoryLayout LAYOUT_shaderSubgroupRotate = LAYOUT.select(PathElement.groupElement("shaderSubgroupRotate"));
    public static final MemoryLayout LAYOUT_shaderSubgroupRotateClustered = LAYOUT.select(PathElement.groupElement("shaderSubgroupRotateClustered"));
    public static final MemoryLayout LAYOUT_shaderFloatControls2 = LAYOUT.select(PathElement.groupElement("shaderFloatControls2"));
    public static final MemoryLayout LAYOUT_shaderExpectAssume = LAYOUT.select(PathElement.groupElement("shaderExpectAssume"));
    public static final MemoryLayout LAYOUT_rectangularLines = LAYOUT.select(PathElement.groupElement("rectangularLines"));
    public static final MemoryLayout LAYOUT_bresenhamLines = LAYOUT.select(PathElement.groupElement("bresenhamLines"));
    public static final MemoryLayout LAYOUT_smoothLines = LAYOUT.select(PathElement.groupElement("smoothLines"));
    public static final MemoryLayout LAYOUT_stippledRectangularLines = LAYOUT.select(PathElement.groupElement("stippledRectangularLines"));
    public static final MemoryLayout LAYOUT_stippledBresenhamLines = LAYOUT.select(PathElement.groupElement("stippledBresenhamLines"));
    public static final MemoryLayout LAYOUT_stippledSmoothLines = LAYOUT.select(PathElement.groupElement("stippledSmoothLines"));
    public static final MemoryLayout LAYOUT_vertexAttributeInstanceRateDivisor = LAYOUT.select(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    public static final MemoryLayout LAYOUT_vertexAttributeInstanceRateZeroDivisor = LAYOUT.select(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    public static final MemoryLayout LAYOUT_indexTypeUint8 = LAYOUT.select(PathElement.groupElement("indexTypeUint8"));
    public static final MemoryLayout LAYOUT_dynamicRenderingLocalRead = LAYOUT.select(PathElement.groupElement("dynamicRenderingLocalRead"));
    public static final MemoryLayout LAYOUT_maintenance5 = LAYOUT.select(PathElement.groupElement("maintenance5"));
    public static final MemoryLayout LAYOUT_maintenance6 = LAYOUT.select(PathElement.groupElement("maintenance6"));
    public static final MemoryLayout LAYOUT_pipelineProtectedAccess = LAYOUT.select(PathElement.groupElement("pipelineProtectedAccess"));
    public static final MemoryLayout LAYOUT_pipelineRobustness = LAYOUT.select(PathElement.groupElement("pipelineRobustness"));
    public static final MemoryLayout LAYOUT_hostImageCopy = LAYOUT.select(PathElement.groupElement("hostImageCopy"));
    public static final MemoryLayout LAYOUT_pushDescriptor = LAYOUT.select(PathElement.groupElement("pushDescriptor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_globalPriorityQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalPriorityQuery"));
    public static final VarHandle VH_shaderSubgroupRotate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotate"));
    public static final VarHandle VH_shaderSubgroupRotateClustered = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotateClustered"));
    public static final VarHandle VH_shaderFloatControls2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloatControls2"));
    public static final VarHandle VH_shaderExpectAssume = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderExpectAssume"));
    public static final VarHandle VH_rectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangularLines"));
    public static final VarHandle VH_bresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bresenhamLines"));
    public static final VarHandle VH_smoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("smoothLines"));
    public static final VarHandle VH_stippledRectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledRectangularLines"));
    public static final VarHandle VH_stippledBresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledBresenhamLines"));
    public static final VarHandle VH_stippledSmoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledSmoothLines"));
    public static final VarHandle VH_vertexAttributeInstanceRateDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    public static final VarHandle VH_vertexAttributeInstanceRateZeroDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    public static final VarHandle VH_indexTypeUint8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexTypeUint8"));
    public static final VarHandle VH_dynamicRenderingLocalRead = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalRead"));
    public static final VarHandle VH_maintenance5 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance5"));
    public static final VarHandle VH_maintenance6 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance6"));
    public static final VarHandle VH_pipelineProtectedAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineProtectedAccess"));
    public static final VarHandle VH_pipelineRobustness = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineRobustness"));
    public static final VarHandle VH_hostImageCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostImageCopy"));
    public static final VarHandle VH_pushDescriptor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushDescriptor"));

    public VkPhysicalDeviceVulkan14Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkan14Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Features(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkan14Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Features(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkan14Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkan14Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan14Features(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkan14Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan14Features(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkan14Features allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES); }
    public static VkPhysicalDeviceVulkan14Features allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES);
        return s;
    }
    public VkPhysicalDeviceVulkan14Features copyFrom(VkPhysicalDeviceVulkan14Features src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkan14Features reinterpret(long count) { return new VkPhysicalDeviceVulkan14Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkan14Features asSlice(long index) { return new VkPhysicalDeviceVulkan14Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkan14Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan14Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkan14Features at(long index, Consumer<VkPhysicalDeviceVulkan14Features> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int globalPriorityQueryAt(long index) { return (int) VH_globalPriorityQuery.get(this.segment(), 0L, index); }
    public int shaderSubgroupRotateAt(long index) { return (int) VH_shaderSubgroupRotate.get(this.segment(), 0L, index); }
    public int shaderSubgroupRotateClusteredAt(long index) { return (int) VH_shaderSubgroupRotateClustered.get(this.segment(), 0L, index); }
    public int shaderFloatControls2At(long index) { return (int) VH_shaderFloatControls2.get(this.segment(), 0L, index); }
    public int shaderExpectAssumeAt(long index) { return (int) VH_shaderExpectAssume.get(this.segment(), 0L, index); }
    public int rectangularLinesAt(long index) { return (int) VH_rectangularLines.get(this.segment(), 0L, index); }
    public int bresenhamLinesAt(long index) { return (int) VH_bresenhamLines.get(this.segment(), 0L, index); }
    public int smoothLinesAt(long index) { return (int) VH_smoothLines.get(this.segment(), 0L, index); }
    public int stippledRectangularLinesAt(long index) { return (int) VH_stippledRectangularLines.get(this.segment(), 0L, index); }
    public int stippledBresenhamLinesAt(long index) { return (int) VH_stippledBresenhamLines.get(this.segment(), 0L, index); }
    public int stippledSmoothLinesAt(long index) { return (int) VH_stippledSmoothLines.get(this.segment(), 0L, index); }
    public int vertexAttributeInstanceRateDivisorAt(long index) { return (int) VH_vertexAttributeInstanceRateDivisor.get(this.segment(), 0L, index); }
    public int vertexAttributeInstanceRateZeroDivisorAt(long index) { return (int) VH_vertexAttributeInstanceRateZeroDivisor.get(this.segment(), 0L, index); }
    public int indexTypeUint8At(long index) { return (int) VH_indexTypeUint8.get(this.segment(), 0L, index); }
    public int dynamicRenderingLocalReadAt(long index) { return (int) VH_dynamicRenderingLocalRead.get(this.segment(), 0L, index); }
    public int maintenance5At(long index) { return (int) VH_maintenance5.get(this.segment(), 0L, index); }
    public int maintenance6At(long index) { return (int) VH_maintenance6.get(this.segment(), 0L, index); }
    public int pipelineProtectedAccessAt(long index) { return (int) VH_pipelineProtectedAccess.get(this.segment(), 0L, index); }
    public int pipelineRobustnessAt(long index) { return (int) VH_pipelineRobustness.get(this.segment(), 0L, index); }
    public int hostImageCopyAt(long index) { return (int) VH_hostImageCopy.get(this.segment(), 0L, index); }
    public int pushDescriptorAt(long index) { return (int) VH_pushDescriptor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int globalPriorityQuery() { return (int) VH_globalPriorityQuery.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupRotate() { return (int) VH_shaderSubgroupRotate.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupRotateClustered() { return (int) VH_shaderSubgroupRotateClustered.get(this.segment(), 0L, 0L); }
    public int shaderFloatControls2() { return (int) VH_shaderFloatControls2.get(this.segment(), 0L, 0L); }
    public int shaderExpectAssume() { return (int) VH_shaderExpectAssume.get(this.segment(), 0L, 0L); }
    public int rectangularLines() { return (int) VH_rectangularLines.get(this.segment(), 0L, 0L); }
    public int bresenhamLines() { return (int) VH_bresenhamLines.get(this.segment(), 0L, 0L); }
    public int smoothLines() { return (int) VH_smoothLines.get(this.segment(), 0L, 0L); }
    public int stippledRectangularLines() { return (int) VH_stippledRectangularLines.get(this.segment(), 0L, 0L); }
    public int stippledBresenhamLines() { return (int) VH_stippledBresenhamLines.get(this.segment(), 0L, 0L); }
    public int stippledSmoothLines() { return (int) VH_stippledSmoothLines.get(this.segment(), 0L, 0L); }
    public int vertexAttributeInstanceRateDivisor() { return (int) VH_vertexAttributeInstanceRateDivisor.get(this.segment(), 0L, 0L); }
    public int vertexAttributeInstanceRateZeroDivisor() { return (int) VH_vertexAttributeInstanceRateZeroDivisor.get(this.segment(), 0L, 0L); }
    public int indexTypeUint8() { return (int) VH_indexTypeUint8.get(this.segment(), 0L, 0L); }
    public int dynamicRenderingLocalRead() { return (int) VH_dynamicRenderingLocalRead.get(this.segment(), 0L, 0L); }
    public int maintenance5() { return (int) VH_maintenance5.get(this.segment(), 0L, 0L); }
    public int maintenance6() { return (int) VH_maintenance6.get(this.segment(), 0L, 0L); }
    public int pipelineProtectedAccess() { return (int) VH_pipelineProtectedAccess.get(this.segment(), 0L, 0L); }
    public int pipelineRobustness() { return (int) VH_pipelineRobustness.get(this.segment(), 0L, 0L); }
    public int hostImageCopy() { return (int) VH_hostImageCopy.get(this.segment(), 0L, 0L); }
    public int pushDescriptor() { return (int) VH_pushDescriptor.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkan14Features sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features globalPriorityQueryAt(long index, int value) { VH_globalPriorityQuery.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateAt(long index, int value) { VH_shaderSubgroupRotate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClusteredAt(long index, int value) { VH_shaderSubgroupRotateClustered.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features shaderFloatControls2At(long index, int value) { VH_shaderFloatControls2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features shaderExpectAssumeAt(long index, int value) { VH_shaderExpectAssume.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features rectangularLinesAt(long index, int value) { VH_rectangularLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features bresenhamLinesAt(long index, int value) { VH_bresenhamLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features smoothLinesAt(long index, int value) { VH_smoothLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features stippledRectangularLinesAt(long index, int value) { VH_stippledRectangularLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features stippledBresenhamLinesAt(long index, int value) { VH_stippledBresenhamLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features stippledSmoothLinesAt(long index, int value) { VH_stippledSmoothLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisorAt(long index, int value) { VH_vertexAttributeInstanceRateDivisor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisorAt(long index, int value) { VH_vertexAttributeInstanceRateZeroDivisor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features indexTypeUint8At(long index, int value) { VH_indexTypeUint8.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalReadAt(long index, int value) { VH_dynamicRenderingLocalRead.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features maintenance5At(long index, int value) { VH_maintenance5.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features maintenance6At(long index, int value) { VH_maintenance6.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccessAt(long index, int value) { VH_pipelineProtectedAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features pipelineRobustnessAt(long index, int value) { VH_pipelineRobustness.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features hostImageCopyAt(long index, int value) { VH_hostImageCopy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features pushDescriptorAt(long index, int value) { VH_pushDescriptor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Features sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features globalPriorityQuery(int value) { VH_globalPriorityQuery.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(int value) { VH_shaderSubgroupRotate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(int value) { VH_shaderSubgroupRotateClustered.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features shaderFloatControls2(int value) { VH_shaderFloatControls2.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features shaderExpectAssume(int value) { VH_shaderExpectAssume.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features rectangularLines(int value) { VH_rectangularLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features bresenhamLines(int value) { VH_bresenhamLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features smoothLines(int value) { VH_smoothLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features stippledRectangularLines(int value) { VH_stippledRectangularLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features stippledBresenhamLines(int value) { VH_stippledBresenhamLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features stippledSmoothLines(int value) { VH_stippledSmoothLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(int value) { VH_vertexAttributeInstanceRateDivisor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(int value) { VH_vertexAttributeInstanceRateZeroDivisor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features indexTypeUint8(int value) { VH_indexTypeUint8.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(int value) { VH_dynamicRenderingLocalRead.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features maintenance5(int value) { VH_maintenance5.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features maintenance6(int value) { VH_maintenance6.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(int value) { VH_pipelineProtectedAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features pipelineRobustness(int value) { VH_pipelineRobustness.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features hostImageCopy(int value) { VH_hostImageCopy.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Features pushDescriptor(int value) { VH_pushDescriptor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkan14Features _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkan14Features _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _globalPriorityQueryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_globalPriorityQuery, index), LAYOUT_globalPriorityQuery); }
    public MemorySegment _globalPriorityQuery() { return _globalPriorityQueryAt(0L); }
    public VkPhysicalDeviceVulkan14Features _globalPriorityQueryAt(long index, MemorySegment src) { _globalPriorityQueryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _globalPriorityQuery(MemorySegment src) { return _globalPriorityQueryAt(0L, src); }
    public MemorySegment _shaderSubgroupRotateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupRotate, index), LAYOUT_shaderSubgroupRotate); }
    public MemorySegment _shaderSubgroupRotate() { return _shaderSubgroupRotateAt(0L); }
    public VkPhysicalDeviceVulkan14Features _shaderSubgroupRotateAt(long index, MemorySegment src) { _shaderSubgroupRotateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _shaderSubgroupRotate(MemorySegment src) { return _shaderSubgroupRotateAt(0L, src); }
    public MemorySegment _shaderSubgroupRotateClusteredAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupRotateClustered, index), LAYOUT_shaderSubgroupRotateClustered); }
    public MemorySegment _shaderSubgroupRotateClustered() { return _shaderSubgroupRotateClusteredAt(0L); }
    public VkPhysicalDeviceVulkan14Features _shaderSubgroupRotateClusteredAt(long index, MemorySegment src) { _shaderSubgroupRotateClusteredAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _shaderSubgroupRotateClustered(MemorySegment src) { return _shaderSubgroupRotateClusteredAt(0L, src); }
    public MemorySegment _shaderFloatControls2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloatControls2, index), LAYOUT_shaderFloatControls2); }
    public MemorySegment _shaderFloatControls2() { return _shaderFloatControls2At(0L); }
    public VkPhysicalDeviceVulkan14Features _shaderFloatControls2At(long index, MemorySegment src) { _shaderFloatControls2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _shaderFloatControls2(MemorySegment src) { return _shaderFloatControls2At(0L, src); }
    public MemorySegment _shaderExpectAssumeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderExpectAssume, index), LAYOUT_shaderExpectAssume); }
    public MemorySegment _shaderExpectAssume() { return _shaderExpectAssumeAt(0L); }
    public VkPhysicalDeviceVulkan14Features _shaderExpectAssumeAt(long index, MemorySegment src) { _shaderExpectAssumeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _shaderExpectAssume(MemorySegment src) { return _shaderExpectAssumeAt(0L, src); }
    public MemorySegment _rectangularLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rectangularLines, index), LAYOUT_rectangularLines); }
    public MemorySegment _rectangularLines() { return _rectangularLinesAt(0L); }
    public VkPhysicalDeviceVulkan14Features _rectangularLinesAt(long index, MemorySegment src) { _rectangularLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _rectangularLines(MemorySegment src) { return _rectangularLinesAt(0L, src); }
    public MemorySegment _bresenhamLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bresenhamLines, index), LAYOUT_bresenhamLines); }
    public MemorySegment _bresenhamLines() { return _bresenhamLinesAt(0L); }
    public VkPhysicalDeviceVulkan14Features _bresenhamLinesAt(long index, MemorySegment src) { _bresenhamLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _bresenhamLines(MemorySegment src) { return _bresenhamLinesAt(0L, src); }
    public MemorySegment _smoothLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_smoothLines, index), LAYOUT_smoothLines); }
    public MemorySegment _smoothLines() { return _smoothLinesAt(0L); }
    public VkPhysicalDeviceVulkan14Features _smoothLinesAt(long index, MemorySegment src) { _smoothLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _smoothLines(MemorySegment src) { return _smoothLinesAt(0L, src); }
    public MemorySegment _stippledRectangularLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stippledRectangularLines, index), LAYOUT_stippledRectangularLines); }
    public MemorySegment _stippledRectangularLines() { return _stippledRectangularLinesAt(0L); }
    public VkPhysicalDeviceVulkan14Features _stippledRectangularLinesAt(long index, MemorySegment src) { _stippledRectangularLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _stippledRectangularLines(MemorySegment src) { return _stippledRectangularLinesAt(0L, src); }
    public MemorySegment _stippledBresenhamLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stippledBresenhamLines, index), LAYOUT_stippledBresenhamLines); }
    public MemorySegment _stippledBresenhamLines() { return _stippledBresenhamLinesAt(0L); }
    public VkPhysicalDeviceVulkan14Features _stippledBresenhamLinesAt(long index, MemorySegment src) { _stippledBresenhamLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _stippledBresenhamLines(MemorySegment src) { return _stippledBresenhamLinesAt(0L, src); }
    public MemorySegment _stippledSmoothLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stippledSmoothLines, index), LAYOUT_stippledSmoothLines); }
    public MemorySegment _stippledSmoothLines() { return _stippledSmoothLinesAt(0L); }
    public VkPhysicalDeviceVulkan14Features _stippledSmoothLinesAt(long index, MemorySegment src) { _stippledSmoothLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _stippledSmoothLines(MemorySegment src) { return _stippledSmoothLinesAt(0L, src); }
    public MemorySegment _vertexAttributeInstanceRateDivisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexAttributeInstanceRateDivisor, index), LAYOUT_vertexAttributeInstanceRateDivisor); }
    public MemorySegment _vertexAttributeInstanceRateDivisor() { return _vertexAttributeInstanceRateDivisorAt(0L); }
    public VkPhysicalDeviceVulkan14Features _vertexAttributeInstanceRateDivisorAt(long index, MemorySegment src) { _vertexAttributeInstanceRateDivisorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _vertexAttributeInstanceRateDivisor(MemorySegment src) { return _vertexAttributeInstanceRateDivisorAt(0L, src); }
    public MemorySegment _vertexAttributeInstanceRateZeroDivisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexAttributeInstanceRateZeroDivisor, index), LAYOUT_vertexAttributeInstanceRateZeroDivisor); }
    public MemorySegment _vertexAttributeInstanceRateZeroDivisor() { return _vertexAttributeInstanceRateZeroDivisorAt(0L); }
    public VkPhysicalDeviceVulkan14Features _vertexAttributeInstanceRateZeroDivisorAt(long index, MemorySegment src) { _vertexAttributeInstanceRateZeroDivisorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _vertexAttributeInstanceRateZeroDivisor(MemorySegment src) { return _vertexAttributeInstanceRateZeroDivisorAt(0L, src); }
    public MemorySegment _indexTypeUint8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexTypeUint8, index), LAYOUT_indexTypeUint8); }
    public MemorySegment _indexTypeUint8() { return _indexTypeUint8At(0L); }
    public VkPhysicalDeviceVulkan14Features _indexTypeUint8At(long index, MemorySegment src) { _indexTypeUint8At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _indexTypeUint8(MemorySegment src) { return _indexTypeUint8At(0L, src); }
    public MemorySegment _dynamicRenderingLocalReadAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicRenderingLocalRead, index), LAYOUT_dynamicRenderingLocalRead); }
    public MemorySegment _dynamicRenderingLocalRead() { return _dynamicRenderingLocalReadAt(0L); }
    public VkPhysicalDeviceVulkan14Features _dynamicRenderingLocalReadAt(long index, MemorySegment src) { _dynamicRenderingLocalReadAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _dynamicRenderingLocalRead(MemorySegment src) { return _dynamicRenderingLocalReadAt(0L, src); }
    public MemorySegment _maintenance5At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maintenance5, index), LAYOUT_maintenance5); }
    public MemorySegment _maintenance5() { return _maintenance5At(0L); }
    public VkPhysicalDeviceVulkan14Features _maintenance5At(long index, MemorySegment src) { _maintenance5At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _maintenance5(MemorySegment src) { return _maintenance5At(0L, src); }
    public MemorySegment _maintenance6At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maintenance6, index), LAYOUT_maintenance6); }
    public MemorySegment _maintenance6() { return _maintenance6At(0L); }
    public VkPhysicalDeviceVulkan14Features _maintenance6At(long index, MemorySegment src) { _maintenance6At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _maintenance6(MemorySegment src) { return _maintenance6At(0L, src); }
    public MemorySegment _pipelineProtectedAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineProtectedAccess, index), LAYOUT_pipelineProtectedAccess); }
    public MemorySegment _pipelineProtectedAccess() { return _pipelineProtectedAccessAt(0L); }
    public VkPhysicalDeviceVulkan14Features _pipelineProtectedAccessAt(long index, MemorySegment src) { _pipelineProtectedAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _pipelineProtectedAccess(MemorySegment src) { return _pipelineProtectedAccessAt(0L, src); }
    public MemorySegment _pipelineRobustnessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineRobustness, index), LAYOUT_pipelineRobustness); }
    public MemorySegment _pipelineRobustness() { return _pipelineRobustnessAt(0L); }
    public VkPhysicalDeviceVulkan14Features _pipelineRobustnessAt(long index, MemorySegment src) { _pipelineRobustnessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _pipelineRobustness(MemorySegment src) { return _pipelineRobustnessAt(0L, src); }
    public MemorySegment _hostImageCopyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hostImageCopy, index), LAYOUT_hostImageCopy); }
    public MemorySegment _hostImageCopy() { return _hostImageCopyAt(0L); }
    public VkPhysicalDeviceVulkan14Features _hostImageCopyAt(long index, MemorySegment src) { _hostImageCopyAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _hostImageCopy(MemorySegment src) { return _hostImageCopyAt(0L, src); }
    public MemorySegment _pushDescriptorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pushDescriptor, index), LAYOUT_pushDescriptor); }
    public MemorySegment _pushDescriptor() { return _pushDescriptorAt(0L); }
    public VkPhysicalDeviceVulkan14Features _pushDescriptorAt(long index, MemorySegment src) { _pushDescriptorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Features _pushDescriptor(MemorySegment src) { return _pushDescriptorAt(0L, src); }
}
