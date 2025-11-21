// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceInvocationMaskFeaturesHUAWEI`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceInvocationMaskFeaturesHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 invocationMask;
/// }
/// ```
public final class VkPhysicalDeviceInvocationMaskFeaturesHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("invocationMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_invocationMask = LAYOUT.byteOffset(PathElement.groupElement("invocationMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_invocationMask = LAYOUT.select(PathElement.groupElement("invocationMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_invocationMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("invocationMask"));

    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEIInvocationMask.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI); }
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEIInvocationMask.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI);
        return s;
    }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI copyFrom(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI reinterpret(long count) { return new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI asSlice(long index) { return new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI at(long index, Consumer<VkPhysicalDeviceInvocationMaskFeaturesHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int invocationMaskAt(long index) { return (int) VH_invocationMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int invocationMask() { return (int) VH_invocationMask.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI invocationMaskAt(long index, int value) { VH_invocationMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI invocationMask(int value) { VH_invocationMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _invocationMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_invocationMask, index), LAYOUT_invocationMask); }
    public MemorySegment _invocationMask() { return _invocationMaskAt(0L); }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI _invocationMaskAt(long index, MemorySegment src) { _invocationMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI _invocationMask(MemorySegment src) { return _invocationMaskAt(0L, src); }
}
