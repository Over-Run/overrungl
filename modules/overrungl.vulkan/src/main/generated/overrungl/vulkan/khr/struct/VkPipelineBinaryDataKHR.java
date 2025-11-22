// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineBinaryDataKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryDataKHR {
///     size_t dataSize;
///     void* pData;
/// }
/// ```
public final class VkPipelineBinaryDataKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    public VkPipelineBinaryDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineBinaryDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineBinaryDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineBinaryDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineBinaryDataKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryDataKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineBinaryDataKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryDataKHR(allocator.allocate(LAYOUT, count), count); }
    public VkPipelineBinaryDataKHR copyFrom(VkPipelineBinaryDataKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineBinaryDataKHR reinterpret(long count) { return new VkPipelineBinaryDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineBinaryDataKHR asSlice(long index) { return new VkPipelineBinaryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineBinaryDataKHR asSlice(long index, long count) { return new VkPipelineBinaryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineBinaryDataKHR at(long index, Consumer<VkPipelineBinaryDataKHR> func) { func.accept(asSlice(index)); return this; }
    public long dataSizeAt(long index) { return (long) VH_dataSize.get(this.segment(), 0L, index); }
    public MemorySegment pDataAt(long index) { return (MemorySegment) VH_pData.get(this.segment(), 0L, index); }
    public long dataSize() { return (long) VH_dataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pData() { return (MemorySegment) VH_pData.get(this.segment(), 0L, 0L); }
    public VkPipelineBinaryDataKHR dataSizeAt(long index, long value) { VH_dataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryDataKHR pDataAt(long index, MemorySegment value) { VH_pData.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryDataKHR dataSize(long value) { VH_dataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryDataKHR pData(MemorySegment value) { VH_pData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _dataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataSize, index), LAYOUT_dataSize); }
    public MemorySegment _dataSize() { return _dataSizeAt(0L); }
    public VkPipelineBinaryDataKHR _dataSizeAt(long index, MemorySegment src) { _dataSizeAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryDataKHR _dataSize(MemorySegment src) { return _dataSizeAt(0L, src); }
    public MemorySegment _pDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pData, index), LAYOUT_pData); }
    public MemorySegment _pData() { return _pDataAt(0L); }
    public VkPipelineBinaryDataKHR _pDataAt(long index, MemorySegment src) { _pDataAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryDataKHR _pData(MemorySegment src) { return _pDataAt(0L, src); }
}
