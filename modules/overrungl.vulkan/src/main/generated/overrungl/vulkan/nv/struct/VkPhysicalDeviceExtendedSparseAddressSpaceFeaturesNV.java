// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 extendedSparseAddressSpace;
/// }
/// ```
public final class VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedSparseAddressSpace")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_extendedSparseAddressSpace = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseAddressSpace"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_extendedSparseAddressSpace = LAYOUT.select(PathElement.groupElement("extendedSparseAddressSpace"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_extendedSparseAddressSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseAddressSpace"));

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV); }
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV copyFrom(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV at(long index, Consumer<VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int extendedSparseAddressSpaceAt(long index) { return (int) VH_extendedSparseAddressSpace.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int extendedSparseAddressSpace() { return (int) VH_extendedSparseAddressSpace.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extendedSparseAddressSpaceAt(long index, int value) { VH_extendedSparseAddressSpace.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extendedSparseAddressSpace(int value) { VH_extendedSparseAddressSpace.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _extendedSparseAddressSpaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedSparseAddressSpace, index), LAYOUT_extendedSparseAddressSpace); }
    public MemorySegment _extendedSparseAddressSpace() { return _extendedSparseAddressSpaceAt(0L); }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV _extendedSparseAddressSpaceAt(long index, MemorySegment src) { _extendedSparseAddressSpaceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV _extendedSparseAddressSpace(MemorySegment src) { return _extendedSparseAddressSpaceAt(0L, src); }
}
