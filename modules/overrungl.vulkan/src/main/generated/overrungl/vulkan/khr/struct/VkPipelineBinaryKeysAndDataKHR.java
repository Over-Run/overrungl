// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineBinaryKeysAndDataKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryKeysAndDataKHR {
///     uint32_t binaryCount;
///     const VkPipelineBinaryKeyKHR* pPipelineBinaryKeys;
///     const VkPipelineBinaryDataKHR* pPipelineBinaryData;
/// }
/// ```
public final class VkPipelineBinaryKeysAndDataKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withName("pPipelineBinaryKeys"),
        ValueLayout.ADDRESS.withName("pPipelineBinaryData")
    );
    public static final long OFFSET_binaryCount = LAYOUT.byteOffset(PathElement.groupElement("binaryCount"));
    public static final long OFFSET_pPipelineBinaryKeys = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaryKeys"));
    public static final long OFFSET_pPipelineBinaryData = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaryData"));
    public static final MemoryLayout LAYOUT_binaryCount = LAYOUT.select(PathElement.groupElement("binaryCount"));
    public static final MemoryLayout LAYOUT_pPipelineBinaryKeys = LAYOUT.select(PathElement.groupElement("pPipelineBinaryKeys"));
    public static final MemoryLayout LAYOUT_pPipelineBinaryData = LAYOUT.select(PathElement.groupElement("pPipelineBinaryData"));
    public static final VarHandle VH_binaryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binaryCount"));
    public static final VarHandle VH_pPipelineBinaryKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaryKeys"));
    public static final VarHandle VH_pPipelineBinaryData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineBinaryData"));

    public VkPipelineBinaryKeysAndDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineBinaryKeysAndDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeysAndDataKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineBinaryKeysAndDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeysAndDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineBinaryKeysAndDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeysAndDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineBinaryKeysAndDataKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryKeysAndDataKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineBinaryKeysAndDataKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryKeysAndDataKHR(allocator.allocate(LAYOUT, count), count); }
    public VkPipelineBinaryKeysAndDataKHR copyFrom(VkPipelineBinaryKeysAndDataKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineBinaryKeysAndDataKHR reinterpret(long count) { return new VkPipelineBinaryKeysAndDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineBinaryKeysAndDataKHR asSlice(long index) { return new VkPipelineBinaryKeysAndDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineBinaryKeysAndDataKHR asSlice(long index, long count) { return new VkPipelineBinaryKeysAndDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineBinaryKeysAndDataKHR at(long index, Consumer<VkPipelineBinaryKeysAndDataKHR> func) { func.accept(asSlice(index)); return this; }
    public int binaryCountAt(long index) { return (int) VH_binaryCount.get(this.segment(), 0L, index); }
    public MemorySegment pPipelineBinaryKeysAt(long index) { return (MemorySegment) VH_pPipelineBinaryKeys.get(this.segment(), 0L, index); }
    public MemorySegment pPipelineBinaryDataAt(long index) { return (MemorySegment) VH_pPipelineBinaryData.get(this.segment(), 0L, index); }
    public int binaryCount() { return (int) VH_binaryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPipelineBinaryKeys() { return (MemorySegment) VH_pPipelineBinaryKeys.get(this.segment(), 0L, 0L); }
    public MemorySegment pPipelineBinaryData() { return (MemorySegment) VH_pPipelineBinaryData.get(this.segment(), 0L, 0L); }
    public VkPipelineBinaryKeysAndDataKHR binaryCountAt(long index, int value) { VH_binaryCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryKeysAt(long index, MemorySegment value) { VH_pPipelineBinaryKeys.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryDataAt(long index, MemorySegment value) { VH_pPipelineBinaryData.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineBinaryKeysAndDataKHR binaryCount(int value) { VH_binaryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryKeys(MemorySegment value) { VH_pPipelineBinaryKeys.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryData(MemorySegment value) { VH_pPipelineBinaryData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _binaryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binaryCount, index), LAYOUT_binaryCount); }
    public MemorySegment _binaryCount() { return _binaryCountAt(0L); }
    public VkPipelineBinaryKeysAndDataKHR _binaryCountAt(long index, MemorySegment src) { _binaryCountAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryKeysAndDataKHR _binaryCount(MemorySegment src) { return _binaryCountAt(0L, src); }
    public MemorySegment _pPipelineBinaryKeysAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelineBinaryKeys, index), LAYOUT_pPipelineBinaryKeys); }
    public MemorySegment _pPipelineBinaryKeys() { return _pPipelineBinaryKeysAt(0L); }
    public VkPipelineBinaryKeysAndDataKHR _pPipelineBinaryKeysAt(long index, MemorySegment src) { _pPipelineBinaryKeysAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryKeysAndDataKHR _pPipelineBinaryKeys(MemorySegment src) { return _pPipelineBinaryKeysAt(0L, src); }
    public MemorySegment _pPipelineBinaryDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelineBinaryData, index), LAYOUT_pPipelineBinaryData); }
    public MemorySegment _pPipelineBinaryData() { return _pPipelineBinaryDataAt(0L); }
    public VkPipelineBinaryKeysAndDataKHR _pPipelineBinaryDataAt(long index, MemorySegment src) { _pPipelineBinaryDataAt(index).copyFrom(src); return this; }
    public VkPipelineBinaryKeysAndDataKHR _pPipelineBinaryData(MemorySegment src) { return _pPipelineBinaryDataAt(0L, src); }
}
