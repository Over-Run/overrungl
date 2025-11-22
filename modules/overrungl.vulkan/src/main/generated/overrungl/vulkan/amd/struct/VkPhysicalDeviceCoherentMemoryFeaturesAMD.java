// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCoherentMemoryFeaturesAMD`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCoherentMemoryFeaturesAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 deviceCoherentMemory;
/// }
/// ```
public final class VkPhysicalDeviceCoherentMemoryFeaturesAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceCoherentMemory")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceCoherentMemory = LAYOUT.byteOffset(PathElement.groupElement("deviceCoherentMemory"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceCoherentMemory = LAYOUT.select(PathElement.groupElement("deviceCoherentMemory"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceCoherentMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceCoherentMemory"));

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoherentMemoryFeaturesAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoherentMemoryFeaturesAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCoherentMemoryFeaturesAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDDeviceCoherentMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD); }
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDDeviceCoherentMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD);
        return s;
    }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD copyFrom(VkPhysicalDeviceCoherentMemoryFeaturesAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD reinterpret(long count) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD asSlice(long index) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD asSlice(long index, long count) { return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD at(long index, Consumer<VkPhysicalDeviceCoherentMemoryFeaturesAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceCoherentMemoryAt(long index) { return (int) VH_deviceCoherentMemory.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceCoherentMemory() { return (int) VH_deviceCoherentMemory.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD deviceCoherentMemoryAt(long index, int value) { VH_deviceCoherentMemory.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD deviceCoherentMemory(int value) { VH_deviceCoherentMemory.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceCoherentMemoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceCoherentMemory, index), LAYOUT_deviceCoherentMemory); }
    public MemorySegment _deviceCoherentMemory() { return _deviceCoherentMemoryAt(0L); }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD _deviceCoherentMemoryAt(long index, MemorySegment src) { _deviceCoherentMemoryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD _deviceCoherentMemory(MemorySegment src) { return _deviceCoherentMemoryAt(0L, src); }
}
