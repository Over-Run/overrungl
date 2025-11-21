// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMemoryToImageIndirectInfoKHR`.
/// ## Layout
/// ```
/// struct VkCopyMemoryToImageIndirectInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkAddressCopyFlagsKHR srcCopyFlags;
///     uint32_t copyCount;
///     VkStridedDeviceAddressRangeKHR copyAddressRange;
///     VkImage dstImage;
///     VkImageLayout dstImageLayout;
///     const VkImageSubresourceLayers* pImageSubresources;
/// }
/// ```
public final class VkCopyMemoryToImageIndirectInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcCopyFlags"),
        ValueLayout.JAVA_INT.withName("copyCount"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRangeKHR.LAYOUT.withName("copyAddressRange"),
        ValueLayout.JAVA_LONG.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.ADDRESS.withName("pImageSubresources")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcCopyFlags = LAYOUT.byteOffset(PathElement.groupElement("srcCopyFlags"));
    public static final long OFFSET_copyCount = LAYOUT.byteOffset(PathElement.groupElement("copyCount"));
    public static final long OFFSET_copyAddressRange = LAYOUT.byteOffset(PathElement.groupElement("copyAddressRange"));
    public static final long OFFSET_dstImage = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
    public static final long OFFSET_dstImageLayout = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
    public static final long OFFSET_pImageSubresources = LAYOUT.byteOffset(PathElement.groupElement("pImageSubresources"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcCopyFlags = LAYOUT.select(PathElement.groupElement("srcCopyFlags"));
    public static final MemoryLayout LAYOUT_copyCount = LAYOUT.select(PathElement.groupElement("copyCount"));
    public static final MemoryLayout LAYOUT_copyAddressRange = LAYOUT.select(PathElement.groupElement("copyAddressRange"));
    public static final MemoryLayout LAYOUT_dstImage = LAYOUT.select(PathElement.groupElement("dstImage"));
    public static final MemoryLayout LAYOUT_dstImageLayout = LAYOUT.select(PathElement.groupElement("dstImageLayout"));
    public static final MemoryLayout LAYOUT_pImageSubresources = LAYOUT.select(PathElement.groupElement("pImageSubresources"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcCopyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcCopyFlags"));
    public static final VarHandle VH_copyCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyCount"));
    public static final VarHandle VH_copyAddressRange$address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyAddressRange"), PathElement.groupElement("address"));
    public static final VarHandle VH_copyAddressRange$size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyAddressRange"), PathElement.groupElement("size"));
    public static final VarHandle VH_copyAddressRange$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyAddressRange"), PathElement.groupElement("stride"));
    public static final VarHandle VH_dstImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage"));
    public static final VarHandle VH_dstImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout"));
    public static final VarHandle VH_pImageSubresources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageSubresources"));

    public VkCopyMemoryToImageIndirectInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyMemoryToImageIndirectInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyMemoryToImageIndirectInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyMemoryToImageIndirectInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyMemoryToImageIndirectInfoKHR alloc(SegmentAllocator allocator) { return new VkCopyMemoryToImageIndirectInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkCopyMemoryToImageIndirectInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryToImageIndirectInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyMemoryToImageIndirectInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR); }
    public static VkCopyMemoryToImageIndirectInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR);
        return s;
    }
    public VkCopyMemoryToImageIndirectInfoKHR copyFrom(VkCopyMemoryToImageIndirectInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR reinterpret(long count) { return new VkCopyMemoryToImageIndirectInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyMemoryToImageIndirectInfoKHR asSlice(long index) { return new VkCopyMemoryToImageIndirectInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyMemoryToImageIndirectInfoKHR asSlice(long index, long count) { return new VkCopyMemoryToImageIndirectInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyMemoryToImageIndirectInfoKHR at(long index, Consumer<VkCopyMemoryToImageIndirectInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int srcCopyFlagsAt(long index) { return (int) VH_srcCopyFlags.get(this.segment(), 0L, index); }
    public int copyCountAt(long index) { return (int) VH_copyCount.get(this.segment(), 0L, index); }
    public long copyAddressRange$addressAt(long index) { return (long) VH_copyAddressRange$address.get(this.segment(), 0L, index); }
    public long copyAddressRange$sizeAt(long index) { return (long) VH_copyAddressRange$size.get(this.segment(), 0L, index); }
    public long copyAddressRange$strideAt(long index) { return (long) VH_copyAddressRange$stride.get(this.segment(), 0L, index); }
    public long dstImageAt(long index) { return (long) VH_dstImage.get(this.segment(), 0L, index); }
    public int dstImageLayoutAt(long index) { return (int) VH_dstImageLayout.get(this.segment(), 0L, index); }
    public MemorySegment pImageSubresourcesAt(long index) { return (MemorySegment) VH_pImageSubresources.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int srcCopyFlags() { return (int) VH_srcCopyFlags.get(this.segment(), 0L, 0L); }
    public int copyCount() { return (int) VH_copyCount.get(this.segment(), 0L, 0L); }
    public long copyAddressRange$address() { return (long) VH_copyAddressRange$address.get(this.segment(), 0L, 0L); }
    public long copyAddressRange$size() { return (long) VH_copyAddressRange$size.get(this.segment(), 0L, 0L); }
    public long copyAddressRange$stride() { return (long) VH_copyAddressRange$stride.get(this.segment(), 0L, 0L); }
    public long dstImage() { return (long) VH_dstImage.get(this.segment(), 0L, 0L); }
    public int dstImageLayout() { return (int) VH_dstImageLayout.get(this.segment(), 0L, 0L); }
    public MemorySegment pImageSubresources() { return (MemorySegment) VH_pImageSubresources.get(this.segment(), 0L, 0L); }
    public VkCopyMemoryToImageIndirectInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR srcCopyFlagsAt(long index, int value) { VH_srcCopyFlags.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR copyCountAt(long index, int value) { VH_copyCount.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange$addressAt(long index, long value) { VH_copyAddressRange$address.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange$sizeAt(long index, long value) { VH_copyAddressRange$size.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange$strideAt(long index, long value) { VH_copyAddressRange$stride.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR dstImageAt(long index, long value) { VH_dstImage.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR dstImageLayoutAt(long index, int value) { VH_dstImageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR pImageSubresourcesAt(long index, MemorySegment value) { VH_pImageSubresources.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR srcCopyFlags(int value) { VH_srcCopyFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR copyCount(int value) { VH_copyCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange$address(long value) { VH_copyAddressRange$address.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange$size(long value) { VH_copyAddressRange$size.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange$stride(long value) { VH_copyAddressRange$stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR dstImage(long value) { VH_dstImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR dstImageLayout(int value) { VH_dstImageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR pImageSubresources(MemorySegment value) { VH_pImageSubresources.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyMemoryToImageIndirectInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyMemoryToImageIndirectInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcCopyFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcCopyFlags, index), LAYOUT_srcCopyFlags); }
    public MemorySegment _srcCopyFlags() { return _srcCopyFlagsAt(0L); }
    public VkCopyMemoryToImageIndirectInfoKHR _srcCopyFlagsAt(long index, MemorySegment src) { _srcCopyFlagsAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR _srcCopyFlags(MemorySegment src) { return _srcCopyFlagsAt(0L, src); }
    public MemorySegment _copyCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_copyCount, index), LAYOUT_copyCount); }
    public MemorySegment _copyCount() { return _copyCountAt(0L); }
    public VkCopyMemoryToImageIndirectInfoKHR _copyCountAt(long index, MemorySegment src) { _copyCountAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR _copyCount(MemorySegment src) { return _copyCountAt(0L, src); }
    public MemorySegment _copyAddressRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_copyAddressRange, index), LAYOUT_copyAddressRange); }
    public MemorySegment _copyAddressRange() { return _copyAddressRangeAt(0L); }
    public VkCopyMemoryToImageIndirectInfoKHR _copyAddressRangeAt(long index, MemorySegment src) { _copyAddressRangeAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR _copyAddressRange(MemorySegment src) { return _copyAddressRangeAt(0L, src); }
    public MemorySegment _dstImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstImage, index), LAYOUT_dstImage); }
    public MemorySegment _dstImage() { return _dstImageAt(0L); }
    public VkCopyMemoryToImageIndirectInfoKHR _dstImageAt(long index, MemorySegment src) { _dstImageAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR _dstImage(MemorySegment src) { return _dstImageAt(0L, src); }
    public MemorySegment _dstImageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstImageLayout, index), LAYOUT_dstImageLayout); }
    public MemorySegment _dstImageLayout() { return _dstImageLayoutAt(0L); }
    public VkCopyMemoryToImageIndirectInfoKHR _dstImageLayoutAt(long index, MemorySegment src) { _dstImageLayoutAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR _dstImageLayout(MemorySegment src) { return _dstImageLayoutAt(0L, src); }
    public MemorySegment _pImageSubresourcesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImageSubresources, index), LAYOUT_pImageSubresources); }
    public MemorySegment _pImageSubresources() { return _pImageSubresourcesAt(0L); }
    public VkCopyMemoryToImageIndirectInfoKHR _pImageSubresourcesAt(long index, MemorySegment src) { _pImageSubresourcesAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectInfoKHR _pImageSubresources(MemorySegment src) { return _pImageSubresourcesAt(0L, src); }
}
