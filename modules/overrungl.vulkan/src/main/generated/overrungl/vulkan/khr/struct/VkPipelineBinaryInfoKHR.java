// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineBinaryInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t binaryCount;
///     const VkPipelineBinaryKHR* pPipelineBinaries;
/// }
/// ```
public final class VkPipelineBinaryInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withName("pPipelineBinaries")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_binaryCount = LAYOUT.byteOffset(PathElement.groupElement("binaryCount"));
    public static final long OFFSET_pPipelineBinaries = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaries"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_binaryCount = LAYOUT.select(PathElement.groupElement("binaryCount"));
    public static final MemoryLayout LAYOUT_pPipelineBinaries = LAYOUT.select(PathElement.groupElement("pPipelineBinaries"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_binaryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binaryCount"));
    public static final VarHandle VH_pPipelineBinaries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaries"));

    public VkPipelineBinaryInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineBinaryInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineBinaryInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineBinaryInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineBinaryInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineBinaryInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineBinaryInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR); }
    public static VkPipelineBinaryInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR);
        return s;
    }
    public VkPipelineBinaryInfoKHR copyFrom(VkPipelineBinaryInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineBinaryInfoKHR reinterpret(long count) { return new VkPipelineBinaryInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineBinaryInfoKHR asSlice(long index) { return new VkPipelineBinaryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineBinaryInfoKHR asSlice(long index, long count) { return new VkPipelineBinaryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineBinaryInfoKHR at(long index, Consumer<VkPipelineBinaryInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int binaryCountAt(long index) { return (int) VH_binaryCount.get(this.segment(), 0L, index); }
    public MemorySegment pPipelineBinariesAt(long index) { return (MemorySegment) VH_pPipelineBinaries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int binaryCount() { return (int) VH_binaryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPipelineBinaries() { return (MemorySegment) VH_pPipelineBinaries.get(this.segment(), 0L, 0L); }
    public VkPipelineBinaryInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryInfoKHR binaryCountAt(long index, int value) { VH_binaryCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryInfoKHR pPipelineBinariesAt(long index, MemorySegment value) { VH_pPipelineBinaries.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryInfoKHR binaryCount(int value) { VH_binaryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryInfoKHR pPipelineBinaries(MemorySegment value) { VH_pPipelineBinaries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineBinaryInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineBinaryInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _binaryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binaryCount, index), LAYOUT_binaryCount); }
    public MemorySegment _binaryCount() { return _binaryCountAt(0L); }
    public VkPipelineBinaryInfoKHR _binaryCountAt(long index, MemorySegment src) { _binaryCountAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryInfoKHR _binaryCount(MemorySegment src) { return _binaryCountAt(0L, src); }
    public MemorySegment _pPipelineBinariesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelineBinaries, index), LAYOUT_pPipelineBinaries); }
    public MemorySegment _pPipelineBinaries() { return _pPipelineBinariesAt(0L); }
    public VkPipelineBinaryInfoKHR _pPipelineBinariesAt(long index, MemorySegment src) { _pPipelineBinariesAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryInfoKHR _pPipelineBinaries(MemorySegment src) { return _pPipelineBinariesAt(0L, src); }
}
