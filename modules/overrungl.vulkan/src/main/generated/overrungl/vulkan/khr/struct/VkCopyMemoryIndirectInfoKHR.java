// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMemoryIndirectInfoKHR`.
/// ## Layout
/// ```
/// struct VkCopyMemoryIndirectInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkAddressCopyFlagsKHR srcCopyFlags;
///     VkAddressCopyFlagsKHR dstCopyFlags;
///     uint32_t copyCount;
///     VkStridedDeviceAddressRangeKHR copyAddressRange;
/// }
/// ```
public final class VkCopyMemoryIndirectInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcCopyFlags"),
        ValueLayout.JAVA_INT.withName("dstCopyFlags"),
        ValueLayout.JAVA_INT.withName("copyCount"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRangeKHR.LAYOUT.withName("copyAddressRange")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcCopyFlags = LAYOUT.byteOffset(PathElement.groupElement("srcCopyFlags"));
    public static final long OFFSET_dstCopyFlags = LAYOUT.byteOffset(PathElement.groupElement("dstCopyFlags"));
    public static final long OFFSET_copyCount = LAYOUT.byteOffset(PathElement.groupElement("copyCount"));
    public static final long OFFSET_copyAddressRange = LAYOUT.byteOffset(PathElement.groupElement("copyAddressRange"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcCopyFlags = LAYOUT.select(PathElement.groupElement("srcCopyFlags"));
    public static final MemoryLayout LAYOUT_dstCopyFlags = LAYOUT.select(PathElement.groupElement("dstCopyFlags"));
    public static final MemoryLayout LAYOUT_copyCount = LAYOUT.select(PathElement.groupElement("copyCount"));
    public static final MemoryLayout LAYOUT_copyAddressRange = LAYOUT.select(PathElement.groupElement("copyAddressRange"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcCopyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcCopyFlags"));
    public static final VarHandle VH_dstCopyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstCopyFlags"));
    public static final VarHandle VH_copyCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyCount"));
    public static final VarHandle VH_copyAddressRange$address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyAddressRange"), PathElement.groupElement("address"));
    public static final VarHandle VH_copyAddressRange$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyAddressRange"), PathElement.groupElement("size"));
    public static final VarHandle VH_copyAddressRange$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyAddressRange"), PathElement.groupElement("stride"));

    public VkCopyMemoryIndirectInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyMemoryIndirectInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyMemoryIndirectInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyMemoryIndirectInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyMemoryIndirectInfoKHR alloc(SegmentAllocator allocator) { return new VkCopyMemoryIndirectInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkCopyMemoryIndirectInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryIndirectInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyMemoryIndirectInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR); }
    public static VkCopyMemoryIndirectInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR);
        return s;
    }
    public VkCopyMemoryIndirectInfoKHR copyFrom(VkCopyMemoryIndirectInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyMemoryIndirectInfoKHR reinterpret(long count) { return new VkCopyMemoryIndirectInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyMemoryIndirectInfoKHR asSlice(long index) { return new VkCopyMemoryIndirectInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyMemoryIndirectInfoKHR asSlice(long index, long count) { return new VkCopyMemoryIndirectInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyMemoryIndirectInfoKHR at(long index, Consumer<VkCopyMemoryIndirectInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int srcCopyFlagsAt(long index) { return (int) VH_srcCopyFlags.get(this.segment(), 0L, index); }
    public int dstCopyFlagsAt(long index) { return (int) VH_dstCopyFlags.get(this.segment(), 0L, index); }
    public int copyCountAt(long index) { return (int) VH_copyCount.get(this.segment(), 0L, index); }
    public long copyAddressRange$addressAt(long index) { return (long) VH_copyAddressRange$address.get(this.segment(), 0L, index); }
    public long copyAddressRange$sizeAt(long index) { return (long) VH_copyAddressRange$size.get(this.segment(), 0L, index); }
    public long copyAddressRange$strideAt(long index) { return (long) VH_copyAddressRange$stride.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int srcCopyFlags() { return (int) VH_srcCopyFlags.get(this.segment(), 0L, 0L); }
    public int dstCopyFlags() { return (int) VH_dstCopyFlags.get(this.segment(), 0L, 0L); }
    public int copyCount() { return (int) VH_copyCount.get(this.segment(), 0L, 0L); }
    public long copyAddressRange$address() { return (long) VH_copyAddressRange$address.get(this.segment(), 0L, 0L); }
    public long copyAddressRange$size() { return (long) VH_copyAddressRange$size.get(this.segment(), 0L, 0L); }
    public long copyAddressRange$stride() { return (long) VH_copyAddressRange$stride.get(this.segment(), 0L, 0L); }
    public VkCopyMemoryIndirectInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectInfoKHR srcCopyFlagsAt(long index, int value) { VH_srcCopyFlags.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectInfoKHR dstCopyFlagsAt(long index, int value) { VH_dstCopyFlags.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectInfoKHR copyCountAt(long index, int value) { VH_copyCount.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectInfoKHR copyAddressRange$addressAt(long index, long value) { VH_copyAddressRange$address.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectInfoKHR copyAddressRange$sizeAt(long index, long value) { VH_copyAddressRange$size.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectInfoKHR copyAddressRange$strideAt(long index, long value) { VH_copyAddressRange$stride.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryIndirectInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectInfoKHR srcCopyFlags(int value) { VH_srcCopyFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectInfoKHR dstCopyFlags(int value) { VH_dstCopyFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectInfoKHR copyCount(int value) { VH_copyCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectInfoKHR copyAddressRange$address(long value) { VH_copyAddressRange$address.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectInfoKHR copyAddressRange$size(long value) { VH_copyAddressRange$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryIndirectInfoKHR copyAddressRange$stride(long value) { VH_copyAddressRange$stride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyMemoryIndirectInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyMemoryIndirectInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcCopyFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcCopyFlags, index), LAYOUT_srcCopyFlags); }
    public MemorySegment _srcCopyFlags() { return _srcCopyFlagsAt(0L); }
    public VkCopyMemoryIndirectInfoKHR _srcCopyFlagsAt(long index, MemorySegment src) { _srcCopyFlagsAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectInfoKHR _srcCopyFlags(MemorySegment src) { return _srcCopyFlagsAt(0L, src); }
    public MemorySegment _dstCopyFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstCopyFlags, index), LAYOUT_dstCopyFlags); }
    public MemorySegment _dstCopyFlags() { return _dstCopyFlagsAt(0L); }
    public VkCopyMemoryIndirectInfoKHR _dstCopyFlagsAt(long index, MemorySegment src) { _dstCopyFlagsAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectInfoKHR _dstCopyFlags(MemorySegment src) { return _dstCopyFlagsAt(0L, src); }
    public MemorySegment _copyCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_copyCount, index), LAYOUT_copyCount); }
    public MemorySegment _copyCount() { return _copyCountAt(0L); }
    public VkCopyMemoryIndirectInfoKHR _copyCountAt(long index, MemorySegment src) { _copyCountAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectInfoKHR _copyCount(MemorySegment src) { return _copyCountAt(0L, src); }
    public MemorySegment _copyAddressRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_copyAddressRange, index), LAYOUT_copyAddressRange); }
    public MemorySegment _copyAddressRange() { return _copyAddressRangeAt(0L); }
    public VkCopyMemoryIndirectInfoKHR _copyAddressRangeAt(long index, MemorySegment src) { _copyAddressRangeAt(index).copyFrom(src); return this; }
    public VkCopyMemoryIndirectInfoKHR _copyAddressRange(MemorySegment src) { return _copyAddressRangeAt(0L, src); }
}
