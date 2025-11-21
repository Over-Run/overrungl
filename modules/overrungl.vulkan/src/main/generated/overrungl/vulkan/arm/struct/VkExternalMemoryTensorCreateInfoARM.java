// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalMemoryTensorCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkExternalMemoryTensorCreateInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkExternalMemoryHandleTypeFlags handleTypes;
/// }
/// ```
public final class VkExternalMemoryTensorCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleTypes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_handleTypes = LAYOUT.byteOffset(PathElement.groupElement("handleTypes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_handleTypes = LAYOUT.select(PathElement.groupElement("handleTypes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_handleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleTypes"));

    public VkExternalMemoryTensorCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalMemoryTensorCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryTensorCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalMemoryTensorCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryTensorCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalMemoryTensorCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryTensorCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalMemoryTensorCreateInfoARM alloc(SegmentAllocator allocator) { return new VkExternalMemoryTensorCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkExternalMemoryTensorCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkExternalMemoryTensorCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalMemoryTensorCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM); }
    public static VkExternalMemoryTensorCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM);
        return s;
    }
    public VkExternalMemoryTensorCreateInfoARM copyFrom(VkExternalMemoryTensorCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalMemoryTensorCreateInfoARM reinterpret(long count) { return new VkExternalMemoryTensorCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalMemoryTensorCreateInfoARM asSlice(long index) { return new VkExternalMemoryTensorCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalMemoryTensorCreateInfoARM asSlice(long index, long count) { return new VkExternalMemoryTensorCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalMemoryTensorCreateInfoARM at(long index, Consumer<VkExternalMemoryTensorCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int handleTypesAt(long index) { return (int) VH_handleTypes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int handleTypes() { return (int) VH_handleTypes.get(this.segment(), 0L, 0L); }
    public VkExternalMemoryTensorCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryTensorCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryTensorCreateInfoARM handleTypesAt(long index, int value) { VH_handleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryTensorCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalMemoryTensorCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalMemoryTensorCreateInfoARM handleTypes(int value) { VH_handleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalMemoryTensorCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalMemoryTensorCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalMemoryTensorCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalMemoryTensorCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _handleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleTypes, index), LAYOUT_handleTypes); }
    public MemorySegment _handleTypes() { return _handleTypesAt(0L); }
    public VkExternalMemoryTensorCreateInfoARM _handleTypesAt(long index, MemorySegment src) { _handleTypesAt(index).copyFrom(src); return this; }
    public VkExternalMemoryTensorCreateInfoARM _handleTypes(MemorySegment src) { return _handleTypesAt(0L, src); }
}
