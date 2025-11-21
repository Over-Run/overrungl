// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 meshAndTaskShaderDerivatives;
/// }
/// ```
public final class VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("meshAndTaskShaderDerivatives")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_meshAndTaskShaderDerivatives = LAYOUT.byteOffset(PathElement.groupElement("meshAndTaskShaderDerivatives"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_meshAndTaskShaderDerivatives = LAYOUT.select(PathElement.groupElement("meshAndTaskShaderDerivatives"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_meshAndTaskShaderDerivatives = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshAndTaskShaderDerivatives"));

    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR); }
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR copyFrom(VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR at(long index, Consumer<VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int meshAndTaskShaderDerivativesAt(long index) { return (int) VH_meshAndTaskShaderDerivatives.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int meshAndTaskShaderDerivatives() { return (int) VH_meshAndTaskShaderDerivatives.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR meshAndTaskShaderDerivativesAt(long index, int value) { VH_meshAndTaskShaderDerivatives.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR meshAndTaskShaderDerivatives(int value) { VH_meshAndTaskShaderDerivatives.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _meshAndTaskShaderDerivativesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_meshAndTaskShaderDerivatives, index), LAYOUT_meshAndTaskShaderDerivatives); }
    public MemorySegment _meshAndTaskShaderDerivatives() { return _meshAndTaskShaderDerivativesAt(0L); }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR _meshAndTaskShaderDerivativesAt(long index, MemorySegment src) { _meshAndTaskShaderDerivativesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR _meshAndTaskShaderDerivatives(MemorySegment src) { return _meshAndTaskShaderDerivativesAt(0L, src); }
}
