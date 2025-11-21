// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 zeroInitializeDeviceMemory;
/// }
/// ```
public final class VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("zeroInitializeDeviceMemory")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_zeroInitializeDeviceMemory = LAYOUT.byteOffset(PathElement.groupElement("zeroInitializeDeviceMemory"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_zeroInitializeDeviceMemory = LAYOUT.select(PathElement.groupElement("zeroInitializeDeviceMemory"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_zeroInitializeDeviceMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("zeroInitializeDeviceMemory"));

    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTZeroInitializeDeviceMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT); }
    public static VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTZeroInitializeDeviceMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT copyFrom(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT at(long index, Consumer<VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int zeroInitializeDeviceMemoryAt(long index) { return (int) VH_zeroInitializeDeviceMemory.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int zeroInitializeDeviceMemory() { return (int) VH_zeroInitializeDeviceMemory.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT zeroInitializeDeviceMemoryAt(long index, int value) { VH_zeroInitializeDeviceMemory.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT zeroInitializeDeviceMemory(int value) { VH_zeroInitializeDeviceMemory.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _zeroInitializeDeviceMemoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_zeroInitializeDeviceMemory, index), LAYOUT_zeroInitializeDeviceMemory); }
    public MemorySegment _zeroInitializeDeviceMemory() { return _zeroInitializeDeviceMemoryAt(0L); }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT _zeroInitializeDeviceMemoryAt(long index, MemorySegment src) { _zeroInitializeDeviceMemoryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT _zeroInitializeDeviceMemory(MemorySegment src) { return _zeroInitializeDeviceMemoryAt(0L, src); }
}
