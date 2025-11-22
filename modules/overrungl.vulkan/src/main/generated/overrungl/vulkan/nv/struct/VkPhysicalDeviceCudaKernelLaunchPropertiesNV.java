// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCudaKernelLaunchPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t computeCapabilityMinor;
///     uint32_t computeCapabilityMajor;
/// }
/// ```
public final class VkPhysicalDeviceCudaKernelLaunchPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMinor"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMajor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_computeCapabilityMinor = LAYOUT.byteOffset(PathElement.groupElement("computeCapabilityMinor"));
    public static final long OFFSET_computeCapabilityMajor = LAYOUT.byteOffset(PathElement.groupElement("computeCapabilityMajor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_computeCapabilityMinor = LAYOUT.select(PathElement.groupElement("computeCapabilityMinor"));
    public static final MemoryLayout LAYOUT_computeCapabilityMajor = LAYOUT.select(PathElement.groupElement("computeCapabilityMajor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_computeCapabilityMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeCapabilityMinor"));
    public static final VarHandle VH_computeCapabilityMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeCapabilityMajor"));

    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCudaKernelLaunch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV); }
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCudaKernelLaunch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV copyFrom(VkPhysicalDeviceCudaKernelLaunchPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV asSlice(long index) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV at(long index, Consumer<VkPhysicalDeviceCudaKernelLaunchPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int computeCapabilityMinorAt(long index) { return (int) VH_computeCapabilityMinor.get(this.segment(), 0L, index); }
    public int computeCapabilityMajorAt(long index) { return (int) VH_computeCapabilityMajor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int computeCapabilityMinor() { return (int) VH_computeCapabilityMinor.get(this.segment(), 0L, 0L); }
    public int computeCapabilityMajor() { return (int) VH_computeCapabilityMajor.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMinorAt(long index, int value) { VH_computeCapabilityMinor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMajorAt(long index, int value) { VH_computeCapabilityMajor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMinor(int value) { VH_computeCapabilityMinor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMajor(int value) { VH_computeCapabilityMajor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _computeCapabilityMinorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_computeCapabilityMinor, index), LAYOUT_computeCapabilityMinor); }
    public MemorySegment _computeCapabilityMinor() { return _computeCapabilityMinorAt(0L); }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV _computeCapabilityMinorAt(long index, MemorySegment src) { _computeCapabilityMinorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV _computeCapabilityMinor(MemorySegment src) { return _computeCapabilityMinorAt(0L, src); }
    public MemorySegment _computeCapabilityMajorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_computeCapabilityMajor, index), LAYOUT_computeCapabilityMajor); }
    public MemorySegment _computeCapabilityMajor() { return _computeCapabilityMajorAt(0L); }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV _computeCapabilityMajorAt(long index, MemorySegment src) { _computeCapabilityMajorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV _computeCapabilityMajor(MemorySegment src) { return _computeCapabilityMajorAt(0L, src); }
}
