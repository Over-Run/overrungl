// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferCollectionConstraintsInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkBufferCollectionConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t minBufferCount;
///     uint32_t maxBufferCount;
///     uint32_t minBufferCountForCamping;
///     uint32_t minBufferCountForDedicatedSlack;
///     uint32_t minBufferCountForSharedSlack;
/// }
/// ```
public final class VkBufferCollectionConstraintsInfoFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minBufferCount"),
        ValueLayout.JAVA_INT.withName("maxBufferCount"),
        ValueLayout.JAVA_INT.withName("minBufferCountForCamping"),
        ValueLayout.JAVA_INT.withName("minBufferCountForDedicatedSlack"),
        ValueLayout.JAVA_INT.withName("minBufferCountForSharedSlack")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minBufferCount = LAYOUT.byteOffset(PathElement.groupElement("minBufferCount"));
    public static final long OFFSET_maxBufferCount = LAYOUT.byteOffset(PathElement.groupElement("maxBufferCount"));
    public static final long OFFSET_minBufferCountForCamping = LAYOUT.byteOffset(PathElement.groupElement("minBufferCountForCamping"));
    public static final long OFFSET_minBufferCountForDedicatedSlack = LAYOUT.byteOffset(PathElement.groupElement("minBufferCountForDedicatedSlack"));
    public static final long OFFSET_minBufferCountForSharedSlack = LAYOUT.byteOffset(PathElement.groupElement("minBufferCountForSharedSlack"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minBufferCount = LAYOUT.select(PathElement.groupElement("minBufferCount"));
    public static final MemoryLayout LAYOUT_maxBufferCount = LAYOUT.select(PathElement.groupElement("maxBufferCount"));
    public static final MemoryLayout LAYOUT_minBufferCountForCamping = LAYOUT.select(PathElement.groupElement("minBufferCountForCamping"));
    public static final MemoryLayout LAYOUT_minBufferCountForDedicatedSlack = LAYOUT.select(PathElement.groupElement("minBufferCountForDedicatedSlack"));
    public static final MemoryLayout LAYOUT_minBufferCountForSharedSlack = LAYOUT.select(PathElement.groupElement("minBufferCountForSharedSlack"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCount"));
    public static final VarHandle VH_maxBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBufferCount"));
    public static final VarHandle VH_minBufferCountForCamping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForCamping"));
    public static final VarHandle VH_minBufferCountForDedicatedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForDedicatedSlack"));
    public static final VarHandle VH_minBufferCountForSharedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForSharedSlack"));

    public VkBufferCollectionConstraintsInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferCollectionConstraintsInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionConstraintsInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferCollectionConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferCollectionConstraintsInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionConstraintsInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferCollectionConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkBufferCollectionConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkBufferCollectionConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA); }
    public static VkBufferCollectionConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA);
        return s;
    }
    public VkBufferCollectionConstraintsInfoFUCHSIA copyFrom(VkBufferCollectionConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA reinterpret(long count) { return new VkBufferCollectionConstraintsInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferCollectionConstraintsInfoFUCHSIA asSlice(long index) { return new VkBufferCollectionConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferCollectionConstraintsInfoFUCHSIA asSlice(long index, long count) { return new VkBufferCollectionConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferCollectionConstraintsInfoFUCHSIA at(long index, Consumer<VkBufferCollectionConstraintsInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minBufferCountAt(long index) { return (int) VH_minBufferCount.get(this.segment(), 0L, index); }
    public int maxBufferCountAt(long index) { return (int) VH_maxBufferCount.get(this.segment(), 0L, index); }
    public int minBufferCountForCampingAt(long index) { return (int) VH_minBufferCountForCamping.get(this.segment(), 0L, index); }
    public int minBufferCountForDedicatedSlackAt(long index) { return (int) VH_minBufferCountForDedicatedSlack.get(this.segment(), 0L, index); }
    public int minBufferCountForSharedSlackAt(long index) { return (int) VH_minBufferCountForSharedSlack.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minBufferCount() { return (int) VH_minBufferCount.get(this.segment(), 0L, 0L); }
    public int maxBufferCount() { return (int) VH_maxBufferCount.get(this.segment(), 0L, 0L); }
    public int minBufferCountForCamping() { return (int) VH_minBufferCountForCamping.get(this.segment(), 0L, 0L); }
    public int minBufferCountForDedicatedSlack() { return (int) VH_minBufferCountForDedicatedSlack.get(this.segment(), 0L, 0L); }
    public int minBufferCountForSharedSlack() { return (int) VH_minBufferCountForSharedSlack.get(this.segment(), 0L, 0L); }
    public VkBufferCollectionConstraintsInfoFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountAt(long index, int value) { VH_minBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA maxBufferCountAt(long index, int value) { VH_maxBufferCount.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForCampingAt(long index, int value) { VH_minBufferCountForCamping.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForDedicatedSlackAt(long index, int value) { VH_minBufferCountForDedicatedSlack.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForSharedSlackAt(long index, int value) { VH_minBufferCountForSharedSlack.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCount(int value) { VH_minBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA maxBufferCount(int value) { VH_maxBufferCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForCamping(int value) { VH_minBufferCountForCamping.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForDedicatedSlack(int value) { VH_minBufferCountForDedicatedSlack.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForSharedSlack(int value) { VH_minBufferCountForSharedSlack.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferCollectionConstraintsInfoFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferCollectionConstraintsInfoFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minBufferCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minBufferCount, index), LAYOUT_minBufferCount); }
    public MemorySegment _minBufferCount() { return _minBufferCountAt(0L); }
    public VkBufferCollectionConstraintsInfoFUCHSIA _minBufferCountAt(long index, MemorySegment src) { _minBufferCountAt(index).copyFrom(src); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA _minBufferCount(MemorySegment src) { return _minBufferCountAt(0L, src); }
    public MemorySegment _maxBufferCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBufferCount, index), LAYOUT_maxBufferCount); }
    public MemorySegment _maxBufferCount() { return _maxBufferCountAt(0L); }
    public VkBufferCollectionConstraintsInfoFUCHSIA _maxBufferCountAt(long index, MemorySegment src) { _maxBufferCountAt(index).copyFrom(src); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA _maxBufferCount(MemorySegment src) { return _maxBufferCountAt(0L, src); }
    public MemorySegment _minBufferCountForCampingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minBufferCountForCamping, index), LAYOUT_minBufferCountForCamping); }
    public MemorySegment _minBufferCountForCamping() { return _minBufferCountForCampingAt(0L); }
    public VkBufferCollectionConstraintsInfoFUCHSIA _minBufferCountForCampingAt(long index, MemorySegment src) { _minBufferCountForCampingAt(index).copyFrom(src); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA _minBufferCountForCamping(MemorySegment src) { return _minBufferCountForCampingAt(0L, src); }
    public MemorySegment _minBufferCountForDedicatedSlackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minBufferCountForDedicatedSlack, index), LAYOUT_minBufferCountForDedicatedSlack); }
    public MemorySegment _minBufferCountForDedicatedSlack() { return _minBufferCountForDedicatedSlackAt(0L); }
    public VkBufferCollectionConstraintsInfoFUCHSIA _minBufferCountForDedicatedSlackAt(long index, MemorySegment src) { _minBufferCountForDedicatedSlackAt(index).copyFrom(src); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA _minBufferCountForDedicatedSlack(MemorySegment src) { return _minBufferCountForDedicatedSlackAt(0L, src); }
    public MemorySegment _minBufferCountForSharedSlackAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minBufferCountForSharedSlack, index), LAYOUT_minBufferCountForSharedSlack); }
    public MemorySegment _minBufferCountForSharedSlack() { return _minBufferCountForSharedSlackAt(0L); }
    public VkBufferCollectionConstraintsInfoFUCHSIA _minBufferCountForSharedSlackAt(long index, MemorySegment src) { _minBufferCountForSharedSlackAt(index).copyFrom(src); return this; }
    public VkBufferCollectionConstraintsInfoFUCHSIA _minBufferCountForSharedSlack(MemorySegment src) { return _minBufferCountForSharedSlackAt(0L, src); }
}
