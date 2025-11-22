// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageConstraintsInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkImageConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t formatConstraintsCount;
///     const VkImageFormatConstraintsInfoFUCHSIA* pFormatConstraints;
///     VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints;
///     VkImageConstraintsInfoFlagsFUCHSIA flags;
/// }
/// ```
public final class VkImageConstraintsInfoFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatConstraintsCount"),
        ValueLayout.ADDRESS.withName("pFormatConstraints"),
        overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_formatConstraintsCount = LAYOUT.byteOffset(PathElement.groupElement("formatConstraintsCount"));
    public static final long OFFSET_pFormatConstraints = LAYOUT.byteOffset(PathElement.groupElement("pFormatConstraints"));
    public static final long OFFSET_bufferCollectionConstraints = LAYOUT.byteOffset(PathElement.groupElement("bufferCollectionConstraints"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_formatConstraintsCount = LAYOUT.select(PathElement.groupElement("formatConstraintsCount"));
    public static final MemoryLayout LAYOUT_pFormatConstraints = LAYOUT.select(PathElement.groupElement("pFormatConstraints"));
    public static final MemoryLayout LAYOUT_bufferCollectionConstraints = LAYOUT.select(PathElement.groupElement("bufferCollectionConstraints"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_formatConstraintsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatConstraintsCount"));
    public static final VarHandle VH_pFormatConstraints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFormatConstraints"));
    public static final VarHandle VH_bufferCollectionConstraints$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("sType"));
    public static final VarHandle VH_bufferCollectionConstraints$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_bufferCollectionConstraints$minBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("minBufferCount"));
    public static final VarHandle VH_bufferCollectionConstraints$maxBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("maxBufferCount"));
    public static final VarHandle VH_bufferCollectionConstraints$minBufferCountForCamping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("minBufferCountForCamping"));
    public static final VarHandle VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("minBufferCountForDedicatedSlack"));
    public static final VarHandle VH_bufferCollectionConstraints$minBufferCountForSharedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCollectionConstraints"), PathElement.groupElement("minBufferCountForSharedSlack"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkImageConstraintsInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageConstraintsInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageConstraintsInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImageConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkImageConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkImageConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkImageConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_IMAGE_CONSTRAINTS_INFO_FUCHSIA); }
    public static VkImageConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_IMAGE_CONSTRAINTS_INFO_FUCHSIA);
        return s;
    }
    public VkImageConstraintsInfoFUCHSIA copyFrom(VkImageConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageConstraintsInfoFUCHSIA reinterpret(long count) { return new VkImageConstraintsInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageConstraintsInfoFUCHSIA asSlice(long index) { return new VkImageConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageConstraintsInfoFUCHSIA asSlice(long index, long count) { return new VkImageConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageConstraintsInfoFUCHSIA at(long index, Consumer<VkImageConstraintsInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatConstraintsCountAt(long index) { return (int) VH_formatConstraintsCount.get(this.segment(), 0L, index); }
    public MemorySegment pFormatConstraintsAt(long index) { return (MemorySegment) VH_pFormatConstraints.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$sTypeAt(long index) { return (int) VH_bufferCollectionConstraints$sType.get(this.segment(), 0L, index); }
    public MemorySegment bufferCollectionConstraints$pNextAt(long index) { return (MemorySegment) VH_bufferCollectionConstraints$pNext.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$minBufferCountAt(long index) { return (int) VH_bufferCollectionConstraints$minBufferCount.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$maxBufferCountAt(long index) { return (int) VH_bufferCollectionConstraints$maxBufferCount.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$minBufferCountForCampingAt(long index) { return (int) VH_bufferCollectionConstraints$minBufferCountForCamping.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$minBufferCountForDedicatedSlackAt(long index) { return (int) VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack.get(this.segment(), 0L, index); }
    public int bufferCollectionConstraints$minBufferCountForSharedSlackAt(long index) { return (int) VH_bufferCollectionConstraints$minBufferCountForSharedSlack.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int formatConstraintsCount() { return (int) VH_formatConstraintsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pFormatConstraints() { return (MemorySegment) VH_pFormatConstraints.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$sType() { return (int) VH_bufferCollectionConstraints$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment bufferCollectionConstraints$pNext() { return (MemorySegment) VH_bufferCollectionConstraints$pNext.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$minBufferCount() { return (int) VH_bufferCollectionConstraints$minBufferCount.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$maxBufferCount() { return (int) VH_bufferCollectionConstraints$maxBufferCount.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$minBufferCountForCamping() { return (int) VH_bufferCollectionConstraints$minBufferCountForCamping.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$minBufferCountForDedicatedSlack() { return (int) VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack.get(this.segment(), 0L, 0L); }
    public int bufferCollectionConstraints$minBufferCountForSharedSlack() { return (int) VH_bufferCollectionConstraints$minBufferCountForSharedSlack.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkImageConstraintsInfoFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA formatConstraintsCountAt(long index, int value) { VH_formatConstraintsCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA pFormatConstraintsAt(long index, MemorySegment value) { VH_pFormatConstraints.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$sTypeAt(long index, int value) { VH_bufferCollectionConstraints$sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$pNextAt(long index, MemorySegment value) { VH_bufferCollectionConstraints$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountAt(long index, int value) { VH_bufferCollectionConstraints$minBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$maxBufferCountAt(long index, int value) { VH_bufferCollectionConstraints$maxBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForCampingAt(long index, int value) { VH_bufferCollectionConstraints$minBufferCountForCamping.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForDedicatedSlackAt(long index, int value) { VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForSharedSlackAt(long index, int value) { VH_bufferCollectionConstraints$minBufferCountForSharedSlack.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImageConstraintsInfoFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA formatConstraintsCount(int value) { VH_formatConstraintsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA pFormatConstraints(MemorySegment value) { VH_pFormatConstraints.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$sType(int value) { VH_bufferCollectionConstraints$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$pNext(MemorySegment value) { VH_bufferCollectionConstraints$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCount(int value) { VH_bufferCollectionConstraints$minBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$maxBufferCount(int value) { VH_bufferCollectionConstraints$maxBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForCamping(int value) { VH_bufferCollectionConstraints$minBufferCountForCamping.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForDedicatedSlack(int value) { VH_bufferCollectionConstraints$minBufferCountForDedicatedSlack.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints$minBufferCountForSharedSlack(int value) { VH_bufferCollectionConstraints$minBufferCountForSharedSlack.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageConstraintsInfoFUCHSIA flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageConstraintsInfoFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageConstraintsInfoFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageConstraintsInfoFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageConstraintsInfoFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatConstraintsCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_formatConstraintsCount, index), LAYOUT_formatConstraintsCount); }
    public MemorySegment _formatConstraintsCount() { return _formatConstraintsCountAt(0L); }
    public VkImageConstraintsInfoFUCHSIA _formatConstraintsCountAt(long index, MemorySegment src) { _formatConstraintsCountAt(index).copyFrom(src); return this; }
    public VkImageConstraintsInfoFUCHSIA _formatConstraintsCount(MemorySegment src) { return _formatConstraintsCountAt(0L, src); }
    public MemorySegment _pFormatConstraintsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pFormatConstraints, index), LAYOUT_pFormatConstraints); }
    public MemorySegment _pFormatConstraints() { return _pFormatConstraintsAt(0L); }
    public VkImageConstraintsInfoFUCHSIA _pFormatConstraintsAt(long index, MemorySegment src) { _pFormatConstraintsAt(index).copyFrom(src); return this; }
    public VkImageConstraintsInfoFUCHSIA _pFormatConstraints(MemorySegment src) { return _pFormatConstraintsAt(0L, src); }
    public MemorySegment _bufferCollectionConstraintsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), LAYOUT_bufferCollectionConstraints); }
    public MemorySegment _bufferCollectionConstraints() { return _bufferCollectionConstraintsAt(0L); }
    public VkImageConstraintsInfoFUCHSIA _bufferCollectionConstraintsAt(long index, MemorySegment src) { _bufferCollectionConstraintsAt(index).copyFrom(src); return this; }
    public VkImageConstraintsInfoFUCHSIA _bufferCollectionConstraints(MemorySegment src) { return _bufferCollectionConstraintsAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImageConstraintsInfoFUCHSIA _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImageConstraintsInfoFUCHSIA _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
