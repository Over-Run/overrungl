// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDepthClampZeroOneFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDepthClampZeroOneFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 depthClampZeroOne;
/// }
/// ```
public final class VkPhysicalDeviceDepthClampZeroOneFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthClampZeroOne")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_depthClampZeroOne = LAYOUT.byteOffset(PathElement.groupElement("depthClampZeroOne"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_depthClampZeroOne = LAYOUT.select(PathElement.groupElement("depthClampZeroOne"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_depthClampZeroOne = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClampZeroOne"));

    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDepthClampZeroOne.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR); }
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDepthClampZeroOne.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR copyFrom(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR at(long index, Consumer<VkPhysicalDeviceDepthClampZeroOneFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int depthClampZeroOneAt(long index) { return (int) VH_depthClampZeroOne.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int depthClampZeroOne() { return (int) VH_depthClampZeroOne.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR depthClampZeroOneAt(long index, int value) { VH_depthClampZeroOne.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR depthClampZeroOne(int value) { VH_depthClampZeroOne.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _depthClampZeroOneAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthClampZeroOne, index), LAYOUT_depthClampZeroOne); }
    public MemorySegment _depthClampZeroOne() { return _depthClampZeroOneAt(0L); }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR _depthClampZeroOneAt(long index, MemorySegment src) { _depthClampZeroOneAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR _depthClampZeroOne(MemorySegment src) { return _depthClampZeroOneAt(0L, src); }
}
