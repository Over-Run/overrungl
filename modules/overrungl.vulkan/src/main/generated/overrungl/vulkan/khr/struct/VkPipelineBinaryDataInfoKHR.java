// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineBinaryDataInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryDataInfoKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPipelineBinaryKHR pipelineBinary;
/// }
/// ```
public final class VkPipelineBinaryDataInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("pipelineBinary")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelineBinary = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinary"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelineBinary = LAYOUT.select(PathElement.groupElement("pipelineBinary"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelineBinary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinary"));

    public VkPipelineBinaryDataInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineBinaryDataInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineBinaryDataInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineBinaryDataInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineBinaryDataInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryDataInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineBinaryDataInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryDataInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineBinaryDataInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR); }
    public static VkPipelineBinaryDataInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR);
        return s;
    }
    public VkPipelineBinaryDataInfoKHR copyFrom(VkPipelineBinaryDataInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineBinaryDataInfoKHR reinterpret(long count) { return new VkPipelineBinaryDataInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineBinaryDataInfoKHR asSlice(long index) { return new VkPipelineBinaryDataInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineBinaryDataInfoKHR asSlice(long index, long count) { return new VkPipelineBinaryDataInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineBinaryDataInfoKHR at(long index, Consumer<VkPipelineBinaryDataInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long pipelineBinaryAt(long index) { return (long) VH_pipelineBinary.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long pipelineBinary() { return (long) VH_pipelineBinary.get(this.segment(), 0L, 0L); }
    public VkPipelineBinaryDataInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryDataInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryDataInfoKHR pipelineBinaryAt(long index, long value) { VH_pipelineBinary.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryDataInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryDataInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryDataInfoKHR pipelineBinary(long value) { VH_pipelineBinary.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineBinaryDataInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryDataInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineBinaryDataInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryDataInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelineBinaryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBinary, index), LAYOUT_pipelineBinary); }
    public MemorySegment _pipelineBinary() { return _pipelineBinaryAt(0L); }
    public VkPipelineBinaryDataInfoKHR _pipelineBinaryAt(long index, MemorySegment src) { _pipelineBinaryAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryDataInfoKHR _pipelineBinary(MemorySegment src) { return _pipelineBinaryAt(0L, src); }
}
