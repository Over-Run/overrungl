// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureVersionInfoKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureVersionInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const uint8_t* pVersionData;
/// }
/// ```
public final class VkAccelerationStructureVersionInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pVersionData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pVersionData = LAYOUT.byteOffset(PathElement.groupElement("pVersionData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pVersionData = LAYOUT.select(PathElement.groupElement("pVersionData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pVersionData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVersionData"));

    public VkAccelerationStructureVersionInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureVersionInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureVersionInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureVersionInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureVersionInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureVersionInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureVersionInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureVersionInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureVersionInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureVersionInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureVersionInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureVersionInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR); }
    public static VkAccelerationStructureVersionInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR);
        return s;
    }
    public VkAccelerationStructureVersionInfoKHR copyFrom(VkAccelerationStructureVersionInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureVersionInfoKHR reinterpret(long count) { return new VkAccelerationStructureVersionInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureVersionInfoKHR asSlice(long index) { return new VkAccelerationStructureVersionInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureVersionInfoKHR asSlice(long index, long count) { return new VkAccelerationStructureVersionInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureVersionInfoKHR at(long index, Consumer<VkAccelerationStructureVersionInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pVersionDataAt(long index) { return (MemorySegment) VH_pVersionData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pVersionData() { return (MemorySegment) VH_pVersionData.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureVersionInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureVersionInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureVersionInfoKHR pVersionDataAt(long index, MemorySegment value) { VH_pVersionData.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureVersionInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureVersionInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureVersionInfoKHR pVersionData(MemorySegment value) { VH_pVersionData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureVersionInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureVersionInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureVersionInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureVersionInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pVersionDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVersionData, index), LAYOUT_pVersionData); }
    public MemorySegment _pVersionData() { return _pVersionDataAt(0L); }
    public VkAccelerationStructureVersionInfoKHR _pVersionDataAt(long index, MemorySegment src) { _pVersionDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureVersionInfoKHR _pVersionData(MemorySegment src) { return _pVersionDataAt(0L, src); }
}
