// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceOpticalFlowFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceOpticalFlowFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 opticalFlow;
/// }
/// ```
public final class VkPhysicalDeviceOpticalFlowFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("opticalFlow")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_opticalFlow = LAYOUT.byteOffset(PathElement.groupElement("opticalFlow"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_opticalFlow = LAYOUT.select(PathElement.groupElement("opticalFlow"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_opticalFlow = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opticalFlow"));

    public VkPhysicalDeviceOpticalFlowFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceOpticalFlowFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceOpticalFlowFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceOpticalFlowFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceOpticalFlowFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceOpticalFlowFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceOpticalFlowFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV); }
    public static VkPhysicalDeviceOpticalFlowFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceOpticalFlowFeaturesNV copyFrom(VkPhysicalDeviceOpticalFlowFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceOpticalFlowFeaturesNV asSlice(long index) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceOpticalFlowFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceOpticalFlowFeaturesNV at(long index, Consumer<VkPhysicalDeviceOpticalFlowFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int opticalFlowAt(long index) { return (int) VH_opticalFlow.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int opticalFlow() { return (int) VH_opticalFlow.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceOpticalFlowFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV opticalFlowAt(long index, int value) { VH_opticalFlow.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV opticalFlow(int value) { VH_opticalFlow.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceOpticalFlowFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceOpticalFlowFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _opticalFlowAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_opticalFlow, index), LAYOUT_opticalFlow); }
    public MemorySegment _opticalFlow() { return _opticalFlowAt(0L); }
    public VkPhysicalDeviceOpticalFlowFeaturesNV _opticalFlowAt(long index, MemorySegment src) { _opticalFlowAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpticalFlowFeaturesNV _opticalFlow(MemorySegment src) { return _opticalFlowAt(0L, src); }
}
