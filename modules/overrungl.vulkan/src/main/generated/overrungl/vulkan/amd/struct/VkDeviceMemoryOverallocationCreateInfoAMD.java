// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceMemoryOverallocationCreateInfoAMD`.
/// ## Layout
/// ```
/// struct VkDeviceMemoryOverallocationCreateInfoAMD {
///     VkStructureType sType;
///     const void* pNext;
///     VkMemoryOverallocationBehaviorAMD overallocationBehavior;
/// }
/// ```
public final class VkDeviceMemoryOverallocationCreateInfoAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("overallocationBehavior")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_overallocationBehavior = LAYOUT.byteOffset(PathElement.groupElement("overallocationBehavior"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_overallocationBehavior = LAYOUT.select(PathElement.groupElement("overallocationBehavior"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_overallocationBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("overallocationBehavior"));

    public VkDeviceMemoryOverallocationCreateInfoAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceMemoryOverallocationCreateInfoAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryOverallocationCreateInfoAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceMemoryOverallocationCreateInfoAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryOverallocationCreateInfoAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceMemoryOverallocationCreateInfoAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryOverallocationCreateInfoAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceMemoryOverallocationCreateInfoAMD alloc(SegmentAllocator allocator) { return new VkDeviceMemoryOverallocationCreateInfoAMD(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceMemoryOverallocationCreateInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkDeviceMemoryOverallocationCreateInfoAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceMemoryOverallocationCreateInfoAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDMemoryOverallocationBehavior.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD); }
    public static VkDeviceMemoryOverallocationCreateInfoAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDMemoryOverallocationBehavior.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD);
        return s;
    }
    public VkDeviceMemoryOverallocationCreateInfoAMD copyFrom(VkDeviceMemoryOverallocationCreateInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD reinterpret(long count) { return new VkDeviceMemoryOverallocationCreateInfoAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceMemoryOverallocationCreateInfoAMD asSlice(long index) { return new VkDeviceMemoryOverallocationCreateInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceMemoryOverallocationCreateInfoAMD asSlice(long index, long count) { return new VkDeviceMemoryOverallocationCreateInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceMemoryOverallocationCreateInfoAMD at(long index, Consumer<VkDeviceMemoryOverallocationCreateInfoAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int overallocationBehaviorAt(long index) { return (int) VH_overallocationBehavior.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int overallocationBehavior() { return (int) VH_overallocationBehavior.get(this.segment(), 0L, 0L); }
    public VkDeviceMemoryOverallocationCreateInfoAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD overallocationBehaviorAt(long index, int value) { VH_overallocationBehavior.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD overallocationBehavior(int value) { VH_overallocationBehavior.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceMemoryOverallocationCreateInfoAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceMemoryOverallocationCreateInfoAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _overallocationBehaviorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_overallocationBehavior, index), LAYOUT_overallocationBehavior); }
    public MemorySegment _overallocationBehavior() { return _overallocationBehaviorAt(0L); }
    public VkDeviceMemoryOverallocationCreateInfoAMD _overallocationBehaviorAt(long index, MemorySegment src) { _overallocationBehaviorAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryOverallocationCreateInfoAMD _overallocationBehavior(MemorySegment src) { return _overallocationBehaviorAt(0L, src); }
}
