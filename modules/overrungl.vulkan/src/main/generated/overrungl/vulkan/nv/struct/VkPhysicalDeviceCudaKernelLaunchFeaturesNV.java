// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCudaKernelLaunchFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCudaKernelLaunchFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cudaKernelLaunchFeatures;
/// }
/// ```
public final class VkPhysicalDeviceCudaKernelLaunchFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cudaKernelLaunchFeatures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cudaKernelLaunchFeatures = LAYOUT.byteOffset(PathElement.groupElement("cudaKernelLaunchFeatures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cudaKernelLaunchFeatures = LAYOUT.select(PathElement.groupElement("cudaKernelLaunchFeatures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cudaKernelLaunchFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cudaKernelLaunchFeatures"));

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCudaKernelLaunch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV); }
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCudaKernelLaunch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV copyFrom(VkPhysicalDeviceCudaKernelLaunchFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV at(long index, Consumer<VkPhysicalDeviceCudaKernelLaunchFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cudaKernelLaunchFeaturesAt(long index) { return (int) VH_cudaKernelLaunchFeatures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cudaKernelLaunchFeatures() { return (int) VH_cudaKernelLaunchFeatures.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV cudaKernelLaunchFeaturesAt(long index, int value) { VH_cudaKernelLaunchFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV cudaKernelLaunchFeatures(int value) { VH_cudaKernelLaunchFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cudaKernelLaunchFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cudaKernelLaunchFeatures, index), LAYOUT_cudaKernelLaunchFeatures); }
    public MemorySegment _cudaKernelLaunchFeatures() { return _cudaKernelLaunchFeaturesAt(0L); }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV _cudaKernelLaunchFeaturesAt(long index, MemorySegment src) { _cudaKernelLaunchFeaturesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV _cudaKernelLaunchFeatures(MemorySegment src) { return _cudaKernelLaunchFeaturesAt(0L, src); }
}
