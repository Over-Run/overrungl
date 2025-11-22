// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 computeDerivativeGroupQuads;
///     VkBool32 computeDerivativeGroupLinear;
/// }
/// ```
public final class VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupQuads"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupLinear")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_computeDerivativeGroupQuads = LAYOUT.byteOffset(PathElement.groupElement("computeDerivativeGroupQuads"));
    public static final long OFFSET_computeDerivativeGroupLinear = LAYOUT.byteOffset(PathElement.groupElement("computeDerivativeGroupLinear"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_computeDerivativeGroupQuads = LAYOUT.select(PathElement.groupElement("computeDerivativeGroupQuads"));
    public static final MemoryLayout LAYOUT_computeDerivativeGroupLinear = LAYOUT.select(PathElement.groupElement("computeDerivativeGroupLinear"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_computeDerivativeGroupQuads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeDerivativeGroupQuads"));
    public static final VarHandle VH_computeDerivativeGroupLinear = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeDerivativeGroupLinear"));

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR); }
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR copyFrom(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR at(long index, Consumer<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int computeDerivativeGroupQuadsAt(long index) { return (int) VH_computeDerivativeGroupQuads.get(this.segment(), 0L, index); }
    public int computeDerivativeGroupLinearAt(long index) { return (int) VH_computeDerivativeGroupLinear.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int computeDerivativeGroupQuads() { return (int) VH_computeDerivativeGroupQuads.get(this.segment(), 0L, 0L); }
    public int computeDerivativeGroupLinear() { return (int) VH_computeDerivativeGroupLinear.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupQuadsAt(long index, int value) { VH_computeDerivativeGroupQuads.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupLinearAt(long index, int value) { VH_computeDerivativeGroupLinear.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupQuads(int value) { VH_computeDerivativeGroupQuads.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupLinear(int value) { VH_computeDerivativeGroupLinear.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _computeDerivativeGroupQuadsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_computeDerivativeGroupQuads, index), LAYOUT_computeDerivativeGroupQuads); }
    public MemorySegment _computeDerivativeGroupQuads() { return _computeDerivativeGroupQuadsAt(0L); }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR _computeDerivativeGroupQuadsAt(long index, MemorySegment src) { _computeDerivativeGroupQuadsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR _computeDerivativeGroupQuads(MemorySegment src) { return _computeDerivativeGroupQuadsAt(0L, src); }
    public MemorySegment _computeDerivativeGroupLinearAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_computeDerivativeGroupLinear, index), LAYOUT_computeDerivativeGroupLinear); }
    public MemorySegment _computeDerivativeGroupLinear() { return _computeDerivativeGroupLinearAt(0L); }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR _computeDerivativeGroupLinearAt(long index, MemorySegment src) { _computeDerivativeGroupLinearAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR _computeDerivativeGroupLinear(MemorySegment src) { return _computeDerivativeGroupLinearAt(0L, src); }
}
