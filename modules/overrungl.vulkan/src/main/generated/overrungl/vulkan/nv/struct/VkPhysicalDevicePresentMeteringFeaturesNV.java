// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePresentMeteringFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePresentMeteringFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentMetering;
/// }
/// ```
public final class VkPhysicalDevicePresentMeteringFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentMetering")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentMetering = LAYOUT.byteOffset(PathElement.groupElement("presentMetering"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentMetering = LAYOUT.select(PathElement.groupElement("presentMetering"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentMetering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMetering"));

    public VkPhysicalDevicePresentMeteringFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePresentMeteringFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentMeteringFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePresentMeteringFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentMeteringFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePresentMeteringFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentMeteringFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePresentMeteringFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentMeteringFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePresentMeteringFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentMeteringFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePresentMeteringFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPresentMetering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV); }
    public static VkPhysicalDevicePresentMeteringFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPresentMetering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV);
        return s;
    }
    public VkPhysicalDevicePresentMeteringFeaturesNV copyFrom(VkPhysicalDevicePresentMeteringFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV reinterpret(long count) { return new VkPhysicalDevicePresentMeteringFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePresentMeteringFeaturesNV asSlice(long index) { return new VkPhysicalDevicePresentMeteringFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePresentMeteringFeaturesNV asSlice(long index, long count) { return new VkPhysicalDevicePresentMeteringFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePresentMeteringFeaturesNV at(long index, Consumer<VkPhysicalDevicePresentMeteringFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentMeteringAt(long index) { return (int) VH_presentMetering.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentMetering() { return (int) VH_presentMetering.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePresentMeteringFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV presentMeteringAt(long index, int value) { VH_presentMetering.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV presentMetering(int value) { VH_presentMetering.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePresentMeteringFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePresentMeteringFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentMeteringAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentMetering, index), LAYOUT_presentMetering); }
    public MemorySegment _presentMetering() { return _presentMeteringAt(0L); }
    public VkPhysicalDevicePresentMeteringFeaturesNV _presentMeteringAt(long index, MemorySegment src) { _presentMeteringAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentMeteringFeaturesNV _presentMetering(MemorySegment src) { return _presentMeteringAt(0L, src); }
}
