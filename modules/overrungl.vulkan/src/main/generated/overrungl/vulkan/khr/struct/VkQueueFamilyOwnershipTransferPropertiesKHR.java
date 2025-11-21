// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyOwnershipTransferPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkQueueFamilyOwnershipTransferPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t optimalImageTransferToQueueFamilies;
/// }
/// ```
public final class VkQueueFamilyOwnershipTransferPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimalImageTransferToQueueFamilies")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_optimalImageTransferToQueueFamilies = LAYOUT.byteOffset(PathElement.groupElement("optimalImageTransferToQueueFamilies"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_optimalImageTransferToQueueFamilies = LAYOUT.select(PathElement.groupElement("optimalImageTransferToQueueFamilies"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_optimalImageTransferToQueueFamilies = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalImageTransferToQueueFamilies"));

    public VkQueueFamilyOwnershipTransferPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueueFamilyOwnershipTransferPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyOwnershipTransferPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueueFamilyOwnershipTransferPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyOwnershipTransferPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueueFamilyOwnershipTransferPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyOwnershipTransferPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueueFamilyOwnershipTransferPropertiesKHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkQueueFamilyOwnershipTransferPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkQueueFamilyOwnershipTransferPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance9.VK_STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR); }
    public static VkQueueFamilyOwnershipTransferPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance9.VK_STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR);
        return s;
    }
    public VkQueueFamilyOwnershipTransferPropertiesKHR copyFrom(VkQueueFamilyOwnershipTransferPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR reinterpret(long count) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueueFamilyOwnershipTransferPropertiesKHR asSlice(long index) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueueFamilyOwnershipTransferPropertiesKHR asSlice(long index, long count) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueueFamilyOwnershipTransferPropertiesKHR at(long index, Consumer<VkQueueFamilyOwnershipTransferPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int optimalImageTransferToQueueFamiliesAt(long index) { return (int) VH_optimalImageTransferToQueueFamilies.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int optimalImageTransferToQueueFamilies() { return (int) VH_optimalImageTransferToQueueFamilies.get(this.segment(), 0L, 0L); }
    public VkQueueFamilyOwnershipTransferPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR optimalImageTransferToQueueFamiliesAt(long index, int value) { VH_optimalImageTransferToQueueFamilies.set(this.segment(), 0L, index, value); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR optimalImageTransferToQueueFamilies(int value) { VH_optimalImageTransferToQueueFamilies.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueueFamilyOwnershipTransferPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueueFamilyOwnershipTransferPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _optimalImageTransferToQueueFamiliesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalImageTransferToQueueFamilies, index), LAYOUT_optimalImageTransferToQueueFamilies); }
    public MemorySegment _optimalImageTransferToQueueFamilies() { return _optimalImageTransferToQueueFamiliesAt(0L); }
    public VkQueueFamilyOwnershipTransferPropertiesKHR _optimalImageTransferToQueueFamiliesAt(long index, MemorySegment src) { _optimalImageTransferToQueueFamiliesAt(index).copyFrom(src); return this; }
    public VkQueueFamilyOwnershipTransferPropertiesKHR _optimalImageTransferToQueueFamilies(MemorySegment src) { return _optimalImageTransferToQueueFamiliesAt(0L, src); }
}
