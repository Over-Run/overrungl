// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderClockFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderClockFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSubgroupClock;
///     VkBool32 shaderDeviceClock;
/// }
/// ```
public final class VkPhysicalDeviceShaderClockFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupClock"),
        ValueLayout.JAVA_INT.withName("shaderDeviceClock")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderSubgroupClock = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupClock"));
    public static final long OFFSET_shaderDeviceClock = LAYOUT.byteOffset(PathElement.groupElement("shaderDeviceClock"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderSubgroupClock = LAYOUT.select(PathElement.groupElement("shaderSubgroupClock"));
    public static final MemoryLayout LAYOUT_shaderDeviceClock = LAYOUT.select(PathElement.groupElement("shaderDeviceClock"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderSubgroupClock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupClock"));
    public static final VarHandle VH_shaderDeviceClock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDeviceClock"));

    public VkPhysicalDeviceShaderClockFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderClockFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderClockFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderClockFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderClockFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderClockFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderClockFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderClockFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderClockFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRShaderClock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR); }
    public static VkPhysicalDeviceShaderClockFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRShaderClock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceShaderClockFeaturesKHR copyFrom(VkPhysicalDeviceShaderClockFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderClockFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderClockFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderClockFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderClockFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderClockFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderClockFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderClockFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderSubgroupClockAt(long index) { return (int) VH_shaderSubgroupClock.get(this.segment(), 0L, index); }
    public int shaderDeviceClockAt(long index) { return (int) VH_shaderDeviceClock.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupClock() { return (int) VH_shaderSubgroupClock.get(this.segment(), 0L, 0L); }
    public int shaderDeviceClock() { return (int) VH_shaderDeviceClock.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderClockFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClockAt(long index, int value) { VH_shaderSubgroupClock.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderDeviceClockAt(long index, int value) { VH_shaderDeviceClock.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClock(int value) { VH_shaderSubgroupClock.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderDeviceClock(int value) { VH_shaderDeviceClock.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderClockFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderClockFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderSubgroupClockAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupClock, index), LAYOUT_shaderSubgroupClock); }
    public MemorySegment _shaderSubgroupClock() { return _shaderSubgroupClockAt(0L); }
    public VkPhysicalDeviceShaderClockFeaturesKHR _shaderSubgroupClockAt(long index, MemorySegment src) { _shaderSubgroupClockAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR _shaderSubgroupClock(MemorySegment src) { return _shaderSubgroupClockAt(0L, src); }
    public MemorySegment _shaderDeviceClockAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDeviceClock, index), LAYOUT_shaderDeviceClock); }
    public MemorySegment _shaderDeviceClock() { return _shaderDeviceClockAt(0L); }
    public VkPhysicalDeviceShaderClockFeaturesKHR _shaderDeviceClockAt(long index, MemorySegment src) { _shaderDeviceClockAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderClockFeaturesKHR _shaderDeviceClock(MemorySegment src) { return _shaderDeviceClockAt(0L, src); }
}
