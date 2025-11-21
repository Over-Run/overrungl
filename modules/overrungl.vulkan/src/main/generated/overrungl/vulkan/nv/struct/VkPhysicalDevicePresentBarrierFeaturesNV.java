// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePresentBarrierFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePresentBarrierFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentBarrier;
/// }
/// ```
public final class VkPhysicalDevicePresentBarrierFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentBarrier")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentBarrier = LAYOUT.byteOffset(PathElement.groupElement("presentBarrier"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentBarrier = LAYOUT.select(PathElement.groupElement("presentBarrier"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentBarrier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentBarrier"));

    public VkPhysicalDevicePresentBarrierFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePresentBarrierFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentBarrierFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePresentBarrierFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentBarrierFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePresentBarrierFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentBarrierFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePresentBarrierFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentBarrierFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePresentBarrierFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentBarrierFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePresentBarrierFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPresentBarrier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV); }
    public static VkPhysicalDevicePresentBarrierFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPresentBarrier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV);
        return s;
    }
    public VkPhysicalDevicePresentBarrierFeaturesNV copyFrom(VkPhysicalDevicePresentBarrierFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV reinterpret(long count) { return new VkPhysicalDevicePresentBarrierFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePresentBarrierFeaturesNV asSlice(long index) { return new VkPhysicalDevicePresentBarrierFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePresentBarrierFeaturesNV asSlice(long index, long count) { return new VkPhysicalDevicePresentBarrierFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePresentBarrierFeaturesNV at(long index, Consumer<VkPhysicalDevicePresentBarrierFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentBarrierAt(long index) { return (int) VH_presentBarrier.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentBarrier() { return (int) VH_presentBarrier.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePresentBarrierFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV presentBarrierAt(long index, int value) { VH_presentBarrier.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV presentBarrier(int value) { VH_presentBarrier.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePresentBarrierFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePresentBarrierFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentBarrierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentBarrier, index), LAYOUT_presentBarrier); }
    public MemorySegment _presentBarrier() { return _presentBarrierAt(0L); }
    public VkPhysicalDevicePresentBarrierFeaturesNV _presentBarrierAt(long index, MemorySegment src) { _presentBarrierAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentBarrierFeaturesNV _presentBarrier(MemorySegment src) { return _presentBarrierAt(0L, src); }
}
