// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalTensorInfoARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalTensorInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkTensorCreateFlagsARM flags;
///     const VkTensorDescriptionARM* pDescription;
///     VkExternalMemoryHandleTypeFlagBits handleType;
/// }
/// ```
public final class VkPhysicalDeviceExternalTensorInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.ADDRESS.withName("pDescription"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pDescription = LAYOUT.byteOffset(PathElement.groupElement("pDescription"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pDescription = LAYOUT.select(PathElement.groupElement("pDescription"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pDescription = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescription"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    public VkPhysicalDeviceExternalTensorInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExternalTensorInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalTensorInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExternalTensorInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalTensorInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExternalTensorInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalTensorInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExternalTensorInfoARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalTensorInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExternalTensorInfoARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalTensorInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExternalTensorInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM); }
    public static VkPhysicalDeviceExternalTensorInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM);
        return s;
    }
    public VkPhysicalDeviceExternalTensorInfoARM copyFrom(VkPhysicalDeviceExternalTensorInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM reinterpret(long count) { return new VkPhysicalDeviceExternalTensorInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExternalTensorInfoARM asSlice(long index) { return new VkPhysicalDeviceExternalTensorInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExternalTensorInfoARM asSlice(long index, long count) { return new VkPhysicalDeviceExternalTensorInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExternalTensorInfoARM at(long index, Consumer<VkPhysicalDeviceExternalTensorInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long flagsAt(long index) { return (long) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pDescriptionAt(long index) { return (MemorySegment) VH_pDescription.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long flags() { return (long) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pDescription() { return (MemorySegment) VH_pDescription.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExternalTensorInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM flagsAt(long index, long value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM pDescriptionAt(long index, MemorySegment value) { VH_pDescription.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM flags(long value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM pDescription(MemorySegment value) { VH_pDescription.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExternalTensorInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExternalTensorInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPhysicalDeviceExternalTensorInfoARM _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pDescriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDescription, index), LAYOUT_pDescription); }
    public MemorySegment _pDescription() { return _pDescriptionAt(0L); }
    public VkPhysicalDeviceExternalTensorInfoARM _pDescriptionAt(long index, MemorySegment src) { _pDescriptionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM _pDescription(MemorySegment src) { return _pDescriptionAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkPhysicalDeviceExternalTensorInfoARM _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalTensorInfoARM _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
}
