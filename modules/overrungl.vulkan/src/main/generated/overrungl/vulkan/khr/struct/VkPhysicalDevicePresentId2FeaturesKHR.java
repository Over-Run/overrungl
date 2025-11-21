// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePresentId2FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePresentId2FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentId2;
/// }
/// ```
public final class VkPhysicalDevicePresentId2FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentId2")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentId2 = LAYOUT.byteOffset(PathElement.groupElement("presentId2"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentId2 = LAYOUT.select(PathElement.groupElement("presentId2"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentId2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentId2"));

    public VkPhysicalDevicePresentId2FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePresentId2FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentId2FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePresentId2FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentId2FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePresentId2FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentId2FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePresentId2FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentId2FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePresentId2FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentId2FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePresentId2FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPresentId2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR); }
    public static VkPhysicalDevicePresentId2FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPresentId2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDevicePresentId2FeaturesKHR copyFrom(VkPhysicalDevicePresentId2FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePresentId2FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePresentId2FeaturesKHR asSlice(long index) { return new VkPhysicalDevicePresentId2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePresentId2FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePresentId2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePresentId2FeaturesKHR at(long index, Consumer<VkPhysicalDevicePresentId2FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentId2At(long index) { return (int) VH_presentId2.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentId2() { return (int) VH_presentId2.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePresentId2FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR presentId2At(long index, int value) { VH_presentId2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR presentId2(int value) { VH_presentId2.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePresentId2FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePresentId2FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentId2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentId2, index), LAYOUT_presentId2); }
    public MemorySegment _presentId2() { return _presentId2At(0L); }
    public VkPhysicalDevicePresentId2FeaturesKHR _presentId2At(long index, MemorySegment src) { _presentId2At(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentId2FeaturesKHR _presentId2(MemorySegment src) { return _presentId2At(0L, src); }
}
