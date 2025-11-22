// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSpecializationInfo`.
/// ## Layout
/// ```
/// struct VkSpecializationInfo {
///     uint32_t mapEntryCount;
///     const VkSpecializationMapEntry* pMapEntries;
///     size_t dataSize;
///     const void* pData;
/// }
/// ```
public final class VkSpecializationInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("mapEntryCount"),
        ValueLayout.ADDRESS.withName("pMapEntries"),
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long OFFSET_mapEntryCount = LAYOUT.byteOffset(PathElement.groupElement("mapEntryCount"));
    public static final long OFFSET_pMapEntries = LAYOUT.byteOffset(PathElement.groupElement("pMapEntries"));
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    public static final MemoryLayout LAYOUT_mapEntryCount = LAYOUT.select(PathElement.groupElement("mapEntryCount"));
    public static final MemoryLayout LAYOUT_pMapEntries = LAYOUT.select(PathElement.groupElement("pMapEntries"));
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    public static final VarHandle VH_mapEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mapEntryCount"));
    public static final VarHandle VH_pMapEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMapEntries"));
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    public VkSpecializationInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSpecializationInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSpecializationInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSpecializationInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSpecializationInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSpecializationInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSpecializationInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSpecializationInfo alloc(SegmentAllocator allocator) { return new VkSpecializationInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSpecializationInfo alloc(SegmentAllocator allocator, long count) { return new VkSpecializationInfo(allocator.allocate(LAYOUT, count), count); }
    public VkSpecializationInfo copyFrom(VkSpecializationInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSpecializationInfo reinterpret(long count) { return new VkSpecializationInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSpecializationInfo asSlice(long index) { return new VkSpecializationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSpecializationInfo asSlice(long index, long count) { return new VkSpecializationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSpecializationInfo at(long index, Consumer<VkSpecializationInfo> func) { func.accept(asSlice(index)); return this; }
    public int mapEntryCountAt(long index) { return (int) VH_mapEntryCount.get(this.segment(), 0L, index); }
    public MemorySegment pMapEntriesAt(long index) { return (MemorySegment) VH_pMapEntries.get(this.segment(), 0L, index); }
    public long dataSizeAt(long index) { return (long) VH_dataSize.get(this.segment(), 0L, index); }
    public MemorySegment pDataAt(long index) { return (MemorySegment) VH_pData.get(this.segment(), 0L, index); }
    public int mapEntryCount() { return (int) VH_mapEntryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pMapEntries() { return (MemorySegment) VH_pMapEntries.get(this.segment(), 0L, 0L); }
    public long dataSize() { return (long) VH_dataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pData() { return (MemorySegment) VH_pData.get(this.segment(), 0L, 0L); }
    public VkSpecializationInfo mapEntryCountAt(long index, int value) { VH_mapEntryCount.set(this.segment(), 0L, index, value); return this; }
    public VkSpecializationInfo pMapEntriesAt(long index, MemorySegment value) { VH_pMapEntries.set(this.segment(), 0L, index, value); return this; }
    public VkSpecializationInfo dataSizeAt(long index, long value) { VH_dataSize.set(this.segment(), 0L, index, value); return this; }
    public VkSpecializationInfo pDataAt(long index, MemorySegment value) { VH_pData.set(this.segment(), 0L, index, value); return this; }
    public VkSpecializationInfo mapEntryCount(int value) { VH_mapEntryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSpecializationInfo pMapEntries(MemorySegment value) { VH_pMapEntries.set(this.segment(), 0L, 0L, value); return this; }
    public VkSpecializationInfo dataSize(long value) { VH_dataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkSpecializationInfo pData(MemorySegment value) { VH_pData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _mapEntryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mapEntryCount, index), LAYOUT_mapEntryCount); }
    public MemorySegment _mapEntryCount() { return _mapEntryCountAt(0L); }
    public VkSpecializationInfo _mapEntryCountAt(long index, MemorySegment src) { _mapEntryCountAt(index).copyFrom(src); return this; }
    public VkSpecializationInfo _mapEntryCount(MemorySegment src) { return _mapEntryCountAt(0L, src); }
    public MemorySegment _pMapEntriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMapEntries, index), LAYOUT_pMapEntries); }
    public MemorySegment _pMapEntries() { return _pMapEntriesAt(0L); }
    public VkSpecializationInfo _pMapEntriesAt(long index, MemorySegment src) { _pMapEntriesAt(index).copyFrom(src); return this; }
    public VkSpecializationInfo _pMapEntries(MemorySegment src) { return _pMapEntriesAt(0L, src); }
    public MemorySegment _dataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataSize, index), LAYOUT_dataSize); }
    public MemorySegment _dataSize() { return _dataSizeAt(0L); }
    public VkSpecializationInfo _dataSizeAt(long index, MemorySegment src) { _dataSizeAt(index).copyFrom(src); return this; }
    public VkSpecializationInfo _dataSize(MemorySegment src) { return _dataSizeAt(0L, src); }
    public MemorySegment _pDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pData, index), LAYOUT_pData); }
    public MemorySegment _pData() { return _pDataAt(0L); }
    public VkSpecializationInfo _pDataAt(long index, MemorySegment src) { _pDataAt(index).copyFrom(src); return this; }
    public VkSpecializationInfo _pData(MemorySegment src) { return _pDataAt(0L, src); }
}
