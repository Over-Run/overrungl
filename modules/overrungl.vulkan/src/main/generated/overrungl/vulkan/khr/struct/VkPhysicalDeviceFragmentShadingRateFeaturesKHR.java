// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRateFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineFragmentShadingRate;
///     VkBool32 primitiveFragmentShadingRate;
///     VkBool32 attachmentFragmentShadingRate;
/// }
/// ```
public final class VkPhysicalDeviceFragmentShadingRateFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("attachmentFragmentShadingRate")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineFragmentShadingRate = LAYOUT.byteOffset(PathElement.groupElement("pipelineFragmentShadingRate"));
    public static final long OFFSET_primitiveFragmentShadingRate = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRate"));
    public static final long OFFSET_attachmentFragmentShadingRate = LAYOUT.byteOffset(PathElement.groupElement("attachmentFragmentShadingRate"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineFragmentShadingRate = LAYOUT.select(PathElement.groupElement("pipelineFragmentShadingRate"));
    public static final MemoryLayout LAYOUT_primitiveFragmentShadingRate = LAYOUT.select(PathElement.groupElement("primitiveFragmentShadingRate"));
    public static final MemoryLayout LAYOUT_attachmentFragmentShadingRate = LAYOUT.select(PathElement.groupElement("attachmentFragmentShadingRate"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineFragmentShadingRate"));
    public static final VarHandle VH_primitiveFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRate"));
    public static final VarHandle VH_attachmentFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentFragmentShadingRate"));

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR); }
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR copyFrom(VkPhysicalDeviceFragmentShadingRateFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR at(long index, Consumer<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineFragmentShadingRateAt(long index) { return (int) VH_pipelineFragmentShadingRate.get(this.segment(), 0L, index); }
    public int primitiveFragmentShadingRateAt(long index) { return (int) VH_primitiveFragmentShadingRate.get(this.segment(), 0L, index); }
    public int attachmentFragmentShadingRateAt(long index) { return (int) VH_attachmentFragmentShadingRate.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineFragmentShadingRate() { return (int) VH_pipelineFragmentShadingRate.get(this.segment(), 0L, 0L); }
    public int primitiveFragmentShadingRate() { return (int) VH_primitiveFragmentShadingRate.get(this.segment(), 0L, 0L); }
    public int attachmentFragmentShadingRate() { return (int) VH_attachmentFragmentShadingRate.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRateAt(long index, int value) { VH_pipelineFragmentShadingRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRateAt(long index, int value) { VH_primitiveFragmentShadingRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRateAt(long index, int value) { VH_attachmentFragmentShadingRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRate(int value) { VH_pipelineFragmentShadingRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRate(int value) { VH_primitiveFragmentShadingRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRate(int value) { VH_attachmentFragmentShadingRate.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineFragmentShadingRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineFragmentShadingRate, index), LAYOUT_pipelineFragmentShadingRate); }
    public MemorySegment _pipelineFragmentShadingRate() { return _pipelineFragmentShadingRateAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _pipelineFragmentShadingRateAt(long index, MemorySegment src) { _pipelineFragmentShadingRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _pipelineFragmentShadingRate(MemorySegment src) { return _pipelineFragmentShadingRateAt(0L, src); }
    public MemorySegment _primitiveFragmentShadingRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveFragmentShadingRate, index), LAYOUT_primitiveFragmentShadingRate); }
    public MemorySegment _primitiveFragmentShadingRate() { return _primitiveFragmentShadingRateAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _primitiveFragmentShadingRateAt(long index, MemorySegment src) { _primitiveFragmentShadingRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _primitiveFragmentShadingRate(MemorySegment src) { return _primitiveFragmentShadingRateAt(0L, src); }
    public MemorySegment _attachmentFragmentShadingRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentFragmentShadingRate, index), LAYOUT_attachmentFragmentShadingRate); }
    public MemorySegment _attachmentFragmentShadingRate() { return _attachmentFragmentShadingRateAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _attachmentFragmentShadingRateAt(long index, MemorySegment src) { _attachmentFragmentShadingRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR _attachmentFragmentShadingRate(MemorySegment src) { return _attachmentFragmentShadingRateAt(0L, src); }
}
