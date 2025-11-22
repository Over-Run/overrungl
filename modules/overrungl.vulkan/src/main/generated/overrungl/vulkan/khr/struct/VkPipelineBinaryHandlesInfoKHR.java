// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineBinaryHandlesInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryHandlesInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t pipelineBinaryCount;
///     VkPipelineBinaryKHR* pPipelineBinaries;
/// }
/// ```
public final class VkPipelineBinaryHandlesInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCount"),
        ValueLayout.ADDRESS.withName("pPipelineBinaries")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineBinaryCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryCount"));
    public static final long OFFSET_pPipelineBinaries = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaries"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineBinaryCount = LAYOUT.select(PathElement.groupElement("pipelineBinaryCount"));
    public static final MemoryLayout LAYOUT_pPipelineBinaries = LAYOUT.select(PathElement.groupElement("pPipelineBinaries"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineBinaryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryCount"));
    public static final VarHandle VH_pPipelineBinaries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaries"));

    public VkPipelineBinaryHandlesInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineBinaryHandlesInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryHandlesInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineBinaryHandlesInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryHandlesInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineBinaryHandlesInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryHandlesInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineBinaryHandlesInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryHandlesInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineBinaryHandlesInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryHandlesInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineBinaryHandlesInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR); }
    public static VkPipelineBinaryHandlesInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR);
        return s;
    }
    public VkPipelineBinaryHandlesInfoKHR copyFrom(VkPipelineBinaryHandlesInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineBinaryHandlesInfoKHR reinterpret(long count) { return new VkPipelineBinaryHandlesInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineBinaryHandlesInfoKHR asSlice(long index) { return new VkPipelineBinaryHandlesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineBinaryHandlesInfoKHR asSlice(long index, long count) { return new VkPipelineBinaryHandlesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineBinaryHandlesInfoKHR at(long index, Consumer<VkPipelineBinaryHandlesInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelineBinaryCountAt(long index) { return (int) VH_pipelineBinaryCount.get(this.segment(), 0L, index); }
    public MemorySegment pPipelineBinariesAt(long index) { return (MemorySegment) VH_pPipelineBinaries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelineBinaryCount() { return (int) VH_pipelineBinaryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPipelineBinaries() { return (MemorySegment) VH_pPipelineBinaries.get(this.segment(), 0L, 0L); }
    public VkPipelineBinaryHandlesInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryHandlesInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryHandlesInfoKHR pipelineBinaryCountAt(long index, int value) { VH_pipelineBinaryCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryHandlesInfoKHR pPipelineBinariesAt(long index, MemorySegment value) { VH_pPipelineBinaries.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryHandlesInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryHandlesInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryHandlesInfoKHR pipelineBinaryCount(int value) { VH_pipelineBinaryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryHandlesInfoKHR pPipelineBinaries(MemorySegment value) { VH_pPipelineBinaries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineBinaryHandlesInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryHandlesInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineBinaryHandlesInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryHandlesInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineBinaryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBinaryCount, index), LAYOUT_pipelineBinaryCount); }
    public MemorySegment _pipelineBinaryCount() { return _pipelineBinaryCountAt(0L); }
    public VkPipelineBinaryHandlesInfoKHR _pipelineBinaryCountAt(long index, MemorySegment src) { _pipelineBinaryCountAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryHandlesInfoKHR _pipelineBinaryCount(MemorySegment src) { return _pipelineBinaryCountAt(0L, src); }
    public MemorySegment _pPipelineBinariesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelineBinaries, index), LAYOUT_pPipelineBinaries); }
    public MemorySegment _pPipelineBinaries() { return _pPipelineBinariesAt(0L); }
    public VkPipelineBinaryHandlesInfoKHR _pPipelineBinariesAt(long index, MemorySegment src) { _pPipelineBinariesAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryHandlesInfoKHR _pPipelineBinaries(MemorySegment src) { return _pPipelineBinariesAt(0L, src); }
}
