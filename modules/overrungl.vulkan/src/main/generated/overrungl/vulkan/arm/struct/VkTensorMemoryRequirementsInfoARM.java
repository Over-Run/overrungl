// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorMemoryRequirementsInfoARM`.
/// ## Layout
/// ```
/// struct VkTensorMemoryRequirementsInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkTensorARM tensor;
/// }
/// ```
public final class VkTensorMemoryRequirementsInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("tensor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tensor = LAYOUT.byteOffset(PathElement.groupElement("tensor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tensor = LAYOUT.select(PathElement.groupElement("tensor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensor"));

    public VkTensorMemoryRequirementsInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTensorMemoryRequirementsInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryRequirementsInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTensorMemoryRequirementsInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryRequirementsInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTensorMemoryRequirementsInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorMemoryRequirementsInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTensorMemoryRequirementsInfoARM alloc(SegmentAllocator allocator) { return new VkTensorMemoryRequirementsInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkTensorMemoryRequirementsInfoARM alloc(SegmentAllocator allocator, long count) { return new VkTensorMemoryRequirementsInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkTensorMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM); }
    public static VkTensorMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM);
        return s;
    }
    public VkTensorMemoryRequirementsInfoARM copyFrom(VkTensorMemoryRequirementsInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTensorMemoryRequirementsInfoARM reinterpret(long count) { return new VkTensorMemoryRequirementsInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTensorMemoryRequirementsInfoARM asSlice(long index) { return new VkTensorMemoryRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTensorMemoryRequirementsInfoARM asSlice(long index, long count) { return new VkTensorMemoryRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTensorMemoryRequirementsInfoARM at(long index, Consumer<VkTensorMemoryRequirementsInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long tensorAt(long index) { return (long) VH_tensor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long tensor() { return (long) VH_tensor.get(this.segment(), 0L, 0L); }
    public VkTensorMemoryRequirementsInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryRequirementsInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryRequirementsInfoARM tensorAt(long index, long value) { VH_tensor.set(this.segment(), 0L, index, value); return this; }
    public VkTensorMemoryRequirementsInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryRequirementsInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorMemoryRequirementsInfoARM tensor(long value) { VH_tensor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTensorMemoryRequirementsInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTensorMemoryRequirementsInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTensorMemoryRequirementsInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTensorMemoryRequirementsInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tensorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensor, index), LAYOUT_tensor); }
    public MemorySegment _tensor() { return _tensorAt(0L); }
    public VkTensorMemoryRequirementsInfoARM _tensorAt(long index, MemorySegment src) { _tensorAt(index).copyFrom(src); return this; }
    public VkTensorMemoryRequirementsInfoARM _tensor(MemorySegment src) { return _tensorAt(0L, src); }
}
