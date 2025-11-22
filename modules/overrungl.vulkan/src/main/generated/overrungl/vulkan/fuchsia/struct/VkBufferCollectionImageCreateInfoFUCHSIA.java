// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferCollectionImageCreateInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkBufferCollectionImageCreateInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkBufferCollectionFUCHSIA collection;
///     uint32_t index;
/// }
/// ```
public final class VkBufferCollectionImageCreateInfoFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("collection"),
        ValueLayout.JAVA_INT.withName("index")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_collection = LAYOUT.byteOffset(PathElement.groupElement("collection"));
    public static final long OFFSET_index = LAYOUT.byteOffset(PathElement.groupElement("index"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_collection = LAYOUT.select(PathElement.groupElement("collection"));
    public static final MemoryLayout LAYOUT_index = LAYOUT.select(PathElement.groupElement("index"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_collection = LAYOUT.arrayElementVarHandle(PathElement.groupElement("collection"));
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));

    public VkBufferCollectionImageCreateInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferCollectionImageCreateInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionImageCreateInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferCollectionImageCreateInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionImageCreateInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferCollectionImageCreateInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionImageCreateInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferCollectionImageCreateInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionImageCreateInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkBufferCollectionImageCreateInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkBufferCollectionImageCreateInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferCollectionImageCreateInfoFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_BUFFER_COLLECTION_IMAGE_CREATE_INFO_FUCHSIA); }
    public static VkBufferCollectionImageCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIABufferCollection.VK_STRUCTURE_TYPE_BUFFER_COLLECTION_IMAGE_CREATE_INFO_FUCHSIA);
        return s;
    }
    public VkBufferCollectionImageCreateInfoFUCHSIA copyFrom(VkBufferCollectionImageCreateInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA reinterpret(long count) { return new VkBufferCollectionImageCreateInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferCollectionImageCreateInfoFUCHSIA asSlice(long index) { return new VkBufferCollectionImageCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferCollectionImageCreateInfoFUCHSIA asSlice(long index, long count) { return new VkBufferCollectionImageCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferCollectionImageCreateInfoFUCHSIA at(long index, Consumer<VkBufferCollectionImageCreateInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long collectionAt(long index) { return (long) VH_collection.get(this.segment(), 0L, index); }
    public int indexAt(long index) { return (int) VH_index.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long collection() { return (long) VH_collection.get(this.segment(), 0L, 0L); }
    public int index() { return (int) VH_index.get(this.segment(), 0L, 0L); }
    public VkBufferCollectionImageCreateInfoFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA collectionAt(long index, long value) { VH_collection.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA indexAt(long index, int value) { VH_index.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA collection(long value) { VH_collection.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA index(int value) { VH_index.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferCollectionImageCreateInfoFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferCollectionImageCreateInfoFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _collectionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_collection, index), LAYOUT_collection); }
    public MemorySegment _collection() { return _collectionAt(0L); }
    public VkBufferCollectionImageCreateInfoFUCHSIA _collectionAt(long index, MemorySegment src) { _collectionAt(index).copyFrom(src); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA _collection(MemorySegment src) { return _collectionAt(0L, src); }
    public MemorySegment _indexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_index, index), LAYOUT_index); }
    public MemorySegment _index() { return _indexAt(0L); }
    public VkBufferCollectionImageCreateInfoFUCHSIA _indexAt(long index, MemorySegment src) { _indexAt(index).copyFrom(src); return this; }
    public VkBufferCollectionImageCreateInfoFUCHSIA _index(MemorySegment src) { return _indexAt(0L, src); }
}
