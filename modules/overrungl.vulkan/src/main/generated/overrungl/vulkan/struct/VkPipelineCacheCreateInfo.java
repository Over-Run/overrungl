// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCacheCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineCacheCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCacheCreateFlags flags;
///     size_t initialDataSize;
///     const void* pInitialData;
/// }
/// ```
public final class VkPipelineCacheCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        CanonicalTypes.SIZE_T.withName("initialDataSize"),
        ValueLayout.ADDRESS.withName("pInitialData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_initialDataSize = LAYOUT.byteOffset(PathElement.groupElement("initialDataSize"));
    public static final long OFFSET_pInitialData = LAYOUT.byteOffset(PathElement.groupElement("pInitialData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_initialDataSize = LAYOUT.select(PathElement.groupElement("initialDataSize"));
    public static final MemoryLayout LAYOUT_pInitialData = LAYOUT.select(PathElement.groupElement("pInitialData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_initialDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialDataSize"));
    public static final VarHandle VH_pInitialData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInitialData"));

    public VkPipelineCacheCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCacheCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCacheCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCacheCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCacheCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineCacheCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCacheCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineCacheCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO); }
    public static VkPipelineCacheCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO);
        return s;
    }
    public VkPipelineCacheCreateInfo copyFrom(VkPipelineCacheCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCacheCreateInfo reinterpret(long count) { return new VkPipelineCacheCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCacheCreateInfo asSlice(long index) { return new VkPipelineCacheCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCacheCreateInfo asSlice(long index, long count) { return new VkPipelineCacheCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCacheCreateInfo at(long index, Consumer<VkPipelineCacheCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long initialDataSizeAt(long index) { return (long) VH_initialDataSize.get(this.segment(), 0L, index); }
    public MemorySegment pInitialDataAt(long index) { return (MemorySegment) VH_pInitialData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long initialDataSize() { return (long) VH_initialDataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pInitialData() { return (MemorySegment) VH_pInitialData.get(this.segment(), 0L, 0L); }
    public VkPipelineCacheCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheCreateInfo initialDataSizeAt(long index, long value) { VH_initialDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheCreateInfo pInitialDataAt(long index, MemorySegment value) { VH_pInitialData.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCacheCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheCreateInfo initialDataSize(long value) { VH_initialDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCacheCreateInfo pInitialData(MemorySegment value) { VH_pInitialData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineCacheCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineCacheCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineCacheCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineCacheCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineCacheCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineCacheCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _initialDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initialDataSize, index), LAYOUT_initialDataSize); }
    public MemorySegment _initialDataSize() { return _initialDataSizeAt(0L); }
    public VkPipelineCacheCreateInfo _initialDataSizeAt(long index, MemorySegment src) { _initialDataSizeAt(index).copyFrom(src); return this; }
    public VkPipelineCacheCreateInfo _initialDataSize(MemorySegment src) { return _initialDataSizeAt(0L, src); }
    public MemorySegment _pInitialDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pInitialData, index), LAYOUT_pInitialData); }
    public MemorySegment _pInitialData() { return _pInitialDataAt(0L); }
    public VkPipelineCacheCreateInfo _pInitialDataAt(long index, MemorySegment src) { _pInitialDataAt(index).copyFrom(src); return this; }
    public VkPipelineCacheCreateInfo _pInitialData(MemorySegment src) { return _pInitialDataAt(0L, src); }
}
