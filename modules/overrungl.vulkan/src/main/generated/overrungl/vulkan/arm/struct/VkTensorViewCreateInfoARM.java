// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorViewCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkTensorViewCreateInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkTensorViewCreateFlagsARM flags;
///     VkTensorARM tensor;
///     VkFormat format;
/// }
/// ```
public final class VkTensorViewCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.JAVA_LONG.withName("tensor"),
        ValueLayout.JAVA_INT.withName("format")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_tensor = LAYOUT.byteOffset(PathElement.groupElement("tensor"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_tensor = LAYOUT.select(PathElement.groupElement("tensor"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_tensor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensor"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    public VkTensorViewCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTensorViewCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorViewCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTensorViewCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorViewCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTensorViewCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorViewCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTensorViewCreateInfoARM alloc(SegmentAllocator allocator) { return new VkTensorViewCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkTensorViewCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkTensorViewCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkTensorViewCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM); }
    public static VkTensorViewCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM);
        return s;
    }
    public VkTensorViewCreateInfoARM copyFrom(VkTensorViewCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTensorViewCreateInfoARM reinterpret(long count) { return new VkTensorViewCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTensorViewCreateInfoARM asSlice(long index) { return new VkTensorViewCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTensorViewCreateInfoARM asSlice(long index, long count) { return new VkTensorViewCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTensorViewCreateInfoARM at(long index, Consumer<VkTensorViewCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long flagsAt(long index) { return (long) VH_flags.get(this.segment(), 0L, index); }
    public long tensorAt(long index) { return (long) VH_tensor.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long flags() { return (long) VH_flags.get(this.segment(), 0L, 0L); }
    public long tensor() { return (long) VH_tensor.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public VkTensorViewCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTensorViewCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTensorViewCreateInfoARM flagsAt(long index, long value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkTensorViewCreateInfoARM tensorAt(long index, long value) { VH_tensor.set(this.segment(), 0L, index, value); return this; }
    public VkTensorViewCreateInfoARM formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkTensorViewCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorViewCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorViewCreateInfoARM flags(long value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorViewCreateInfoARM tensor(long value) { VH_tensor.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorViewCreateInfoARM format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTensorViewCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTensorViewCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTensorViewCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTensorViewCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkTensorViewCreateInfoARM _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkTensorViewCreateInfoARM _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _tensorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensor, index), LAYOUT_tensor); }
    public MemorySegment _tensor() { return _tensorAt(0L); }
    public VkTensorViewCreateInfoARM _tensorAt(long index, MemorySegment src) { _tensorAt(index).copyFrom(src); return this; }
    public VkTensorViewCreateInfoARM _tensor(MemorySegment src) { return _tensorAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkTensorViewCreateInfoARM _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkTensorViewCreateInfoARM _format(MemorySegment src) { return _formatAt(0L, src); }
}
