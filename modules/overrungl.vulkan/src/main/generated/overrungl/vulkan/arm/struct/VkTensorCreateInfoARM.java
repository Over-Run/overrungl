// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkTensorCreateInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkTensorCreateFlagsARM flags;
///     const VkTensorDescriptionARM* pDescription;
///     VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t* pQueueFamilyIndices;
/// }
/// ```
public final class VkTensorCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.ADDRESS.withName("pDescription"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pDescription = LAYOUT.byteOffset(PathElement.groupElement("pDescription"));
    public static final long OFFSET_sharingMode = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
    public static final long OFFSET_queueFamilyIndexCount = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
    public static final long OFFSET_pQueueFamilyIndices = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pDescription = LAYOUT.select(PathElement.groupElement("pDescription"));
    public static final MemoryLayout LAYOUT_sharingMode = LAYOUT.select(PathElement.groupElement("sharingMode"));
    public static final MemoryLayout LAYOUT_queueFamilyIndexCount = LAYOUT.select(PathElement.groupElement("queueFamilyIndexCount"));
    public static final MemoryLayout LAYOUT_pQueueFamilyIndices = LAYOUT.select(PathElement.groupElement("pQueueFamilyIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pDescription = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescription"));
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));

    public VkTensorCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTensorCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTensorCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTensorCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTensorCreateInfoARM alloc(SegmentAllocator allocator) { return new VkTensorCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkTensorCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkTensorCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkTensorCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM); }
    public static VkTensorCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM);
        return s;
    }
    public VkTensorCreateInfoARM copyFrom(VkTensorCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTensorCreateInfoARM reinterpret(long count) { return new VkTensorCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTensorCreateInfoARM asSlice(long index) { return new VkTensorCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTensorCreateInfoARM asSlice(long index, long count) { return new VkTensorCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTensorCreateInfoARM at(long index, Consumer<VkTensorCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long flagsAt(long index) { return (long) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pDescriptionAt(long index) { return (MemorySegment) VH_pDescription.get(this.segment(), 0L, index); }
    public int sharingModeAt(long index) { return (int) VH_sharingMode.get(this.segment(), 0L, index); }
    public int queueFamilyIndexCountAt(long index) { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pQueueFamilyIndicesAt(long index) { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long flags() { return (long) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pDescription() { return (MemorySegment) VH_pDescription.get(this.segment(), 0L, 0L); }
    public int sharingMode() { return (int) VH_sharingMode.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndexCount() { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueueFamilyIndices() { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, 0L); }
    public VkTensorCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCreateInfoARM flagsAt(long index, long value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCreateInfoARM pDescriptionAt(long index, MemorySegment value) { VH_pDescription.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCreateInfoARM sharingModeAt(long index, int value) { VH_sharingMode.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCreateInfoARM queueFamilyIndexCountAt(long index, int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCreateInfoARM pQueueFamilyIndicesAt(long index, MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, index, value); return this; }
    public VkTensorCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCreateInfoARM flags(long value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCreateInfoARM pDescription(MemorySegment value) { VH_pDescription.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCreateInfoARM sharingMode(int value) { VH_sharingMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCreateInfoARM queueFamilyIndexCount(int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorCreateInfoARM pQueueFamilyIndices(MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTensorCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTensorCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTensorCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTensorCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkTensorCreateInfoARM _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkTensorCreateInfoARM _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pDescriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDescription, index), LAYOUT_pDescription); }
    public MemorySegment _pDescription() { return _pDescriptionAt(0L); }
    public VkTensorCreateInfoARM _pDescriptionAt(long index, MemorySegment src) { _pDescriptionAt(index).copyFrom(src); return this; }
    public VkTensorCreateInfoARM _pDescription(MemorySegment src) { return _pDescriptionAt(0L, src); }
    public MemorySegment _sharingModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sharingMode, index), LAYOUT_sharingMode); }
    public MemorySegment _sharingMode() { return _sharingModeAt(0L); }
    public VkTensorCreateInfoARM _sharingModeAt(long index, MemorySegment src) { _sharingModeAt(index).copyFrom(src); return this; }
    public VkTensorCreateInfoARM _sharingMode(MemorySegment src) { return _sharingModeAt(0L, src); }
    public MemorySegment _queueFamilyIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndexCount, index), LAYOUT_queueFamilyIndexCount); }
    public MemorySegment _queueFamilyIndexCount() { return _queueFamilyIndexCountAt(0L); }
    public VkTensorCreateInfoARM _queueFamilyIndexCountAt(long index, MemorySegment src) { _queueFamilyIndexCountAt(index).copyFrom(src); return this; }
    public VkTensorCreateInfoARM _queueFamilyIndexCount(MemorySegment src) { return _queueFamilyIndexCountAt(0L, src); }
    public MemorySegment _pQueueFamilyIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueueFamilyIndices, index), LAYOUT_pQueueFamilyIndices); }
    public MemorySegment _pQueueFamilyIndices() { return _pQueueFamilyIndicesAt(0L); }
    public VkTensorCreateInfoARM _pQueueFamilyIndicesAt(long index, MemorySegment src) { _pQueueFamilyIndicesAt(index).copyFrom(src); return this; }
    public VkTensorCreateInfoARM _pQueueFamilyIndices(MemorySegment src) { return _pQueueFamilyIndicesAt(0L, src); }
}
