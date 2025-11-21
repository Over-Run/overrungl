// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderZeroInitializeWorkgroupMemory;
/// }
/// ```
public final class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderZeroInitializeWorkgroupMemory = LAYOUT.byteOffset(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderZeroInitializeWorkgroupMemory = LAYOUT.select(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderZeroInitializeWorkgroupMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES); }
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES);
        return s;
    }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR copyFrom(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR at(long index, Consumer<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderZeroInitializeWorkgroupMemoryAt(long index) { return (int) VH_shaderZeroInitializeWorkgroupMemory.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderZeroInitializeWorkgroupMemory() { return (int) VH_shaderZeroInitializeWorkgroupMemory.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR shaderZeroInitializeWorkgroupMemoryAt(long index, int value) { VH_shaderZeroInitializeWorkgroupMemory.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR shaderZeroInitializeWorkgroupMemory(int value) { VH_shaderZeroInitializeWorkgroupMemory.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderZeroInitializeWorkgroupMemoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderZeroInitializeWorkgroupMemory, index), LAYOUT_shaderZeroInitializeWorkgroupMemory); }
    public MemorySegment _shaderZeroInitializeWorkgroupMemory() { return _shaderZeroInitializeWorkgroupMemoryAt(0L); }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR _shaderZeroInitializeWorkgroupMemoryAt(long index, MemorySegment src) { _shaderZeroInitializeWorkgroupMemoryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR _shaderZeroInitializeWorkgroupMemory(MemorySegment src) { return _shaderZeroInitializeWorkgroupMemoryAt(0L, src); }
}
