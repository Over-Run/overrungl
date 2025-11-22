// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFrameBoundaryTensorsARM`.
/// ## Layout
/// ```
/// struct VkFrameBoundaryTensorsARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t tensorCount;
///     const VkTensorARM* pTensors;
/// }
/// ```
public final class VkFrameBoundaryTensorsARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tensorCount"),
        ValueLayout.ADDRESS.withName("pTensors")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tensorCount = LAYOUT.byteOffset(PathElement.groupElement("tensorCount"));
    public static final long OFFSET_pTensors = LAYOUT.byteOffset(PathElement.groupElement("pTensors"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tensorCount = LAYOUT.select(PathElement.groupElement("tensorCount"));
    public static final MemoryLayout LAYOUT_pTensors = LAYOUT.select(PathElement.groupElement("pTensors"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tensorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorCount"));
    public static final VarHandle VH_pTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTensors"));

    public VkFrameBoundaryTensorsARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFrameBoundaryTensorsARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryTensorsARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkFrameBoundaryTensorsARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryTensorsARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFrameBoundaryTensorsARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryTensorsARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFrameBoundaryTensorsARM alloc(SegmentAllocator allocator) { return new VkFrameBoundaryTensorsARM(allocator.allocate(LAYOUT), 1); }
    public static VkFrameBoundaryTensorsARM alloc(SegmentAllocator allocator, long count) { return new VkFrameBoundaryTensorsARM(allocator.allocate(LAYOUT, count), count); }
    public static VkFrameBoundaryTensorsARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM); }
    public static VkFrameBoundaryTensorsARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM);
        return s;
    }
    public VkFrameBoundaryTensorsARM copyFrom(VkFrameBoundaryTensorsARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFrameBoundaryTensorsARM reinterpret(long count) { return new VkFrameBoundaryTensorsARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFrameBoundaryTensorsARM asSlice(long index) { return new VkFrameBoundaryTensorsARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFrameBoundaryTensorsARM asSlice(long index, long count) { return new VkFrameBoundaryTensorsARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFrameBoundaryTensorsARM at(long index, Consumer<VkFrameBoundaryTensorsARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tensorCountAt(long index) { return (int) VH_tensorCount.get(this.segment(), 0L, index); }
    public MemorySegment pTensorsAt(long index) { return (MemorySegment) VH_pTensors.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tensorCount() { return (int) VH_tensorCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pTensors() { return (MemorySegment) VH_pTensors.get(this.segment(), 0L, 0L); }
    public VkFrameBoundaryTensorsARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryTensorsARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryTensorsARM tensorCountAt(long index, int value) { VH_tensorCount.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryTensorsARM pTensorsAt(long index, MemorySegment value) { VH_pTensors.set(this.segment(), 0L, index, value); return this; }
    public VkFrameBoundaryTensorsARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryTensorsARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryTensorsARM tensorCount(int value) { VH_tensorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkFrameBoundaryTensorsARM pTensors(MemorySegment value) { VH_pTensors.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFrameBoundaryTensorsARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryTensorsARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFrameBoundaryTensorsARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryTensorsARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tensorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tensorCount, index), LAYOUT_tensorCount); }
    public MemorySegment _tensorCount() { return _tensorCountAt(0L); }
    public VkFrameBoundaryTensorsARM _tensorCountAt(long index, MemorySegment src) { _tensorCountAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryTensorsARM _tensorCount(MemorySegment src) { return _tensorCountAt(0L, src); }
    public MemorySegment _pTensorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTensors, index), LAYOUT_pTensors); }
    public MemorySegment _pTensors() { return _pTensorsAt(0L); }
    public VkFrameBoundaryTensorsARM _pTensorsAt(long index, MemorySegment src) { _pTensorsAt(index).copyFrom(src); return this; }
    public VkFrameBoundaryTensorsARM _pTensors(MemorySegment src) { return _pTensorsAt(0L, src); }
}
