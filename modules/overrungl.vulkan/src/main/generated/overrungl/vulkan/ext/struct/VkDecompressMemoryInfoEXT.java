// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDecompressMemoryInfoEXT`.
/// ## Layout
/// ```
/// struct VkDecompressMemoryInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkMemoryDecompressionMethodFlagsEXT decompressionMethod;
///     uint32_t regionCount;
///     const VkDecompressMemoryRegionEXT* pRegions;
/// }
/// ```
public final class VkDecompressMemoryInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("decompressionMethod"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_decompressionMethod = LAYOUT.byteOffset(PathElement.groupElement("decompressionMethod"));
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_decompressionMethod = LAYOUT.select(PathElement.groupElement("decompressionMethod"));
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_decompressionMethod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressionMethod"));
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    public VkDecompressMemoryInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDecompressMemoryInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDecompressMemoryInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDecompressMemoryInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDecompressMemoryInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDecompressMemoryInfoEXT alloc(SegmentAllocator allocator) { return new VkDecompressMemoryInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDecompressMemoryInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDecompressMemoryInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDecompressMemoryInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT); }
    public static VkDecompressMemoryInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMemoryDecompression.VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT);
        return s;
    }
    public VkDecompressMemoryInfoEXT copyFrom(VkDecompressMemoryInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDecompressMemoryInfoEXT reinterpret(long count) { return new VkDecompressMemoryInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDecompressMemoryInfoEXT asSlice(long index) { return new VkDecompressMemoryInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDecompressMemoryInfoEXT asSlice(long index, long count) { return new VkDecompressMemoryInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDecompressMemoryInfoEXT at(long index, Consumer<VkDecompressMemoryInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long decompressionMethodAt(long index) { return (long) VH_decompressionMethod.get(this.segment(), 0L, index); }
    public int regionCountAt(long index) { return (int) VH_regionCount.get(this.segment(), 0L, index); }
    public MemorySegment pRegionsAt(long index) { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long decompressionMethod() { return (long) VH_decompressionMethod.get(this.segment(), 0L, 0L); }
    public int regionCount() { return (int) VH_regionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRegions() { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, 0L); }
    public VkDecompressMemoryInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryInfoEXT decompressionMethodAt(long index, long value) { VH_decompressionMethod.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryInfoEXT regionCountAt(long index, int value) { VH_regionCount.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryInfoEXT pRegionsAt(long index, MemorySegment value) { VH_pRegions.set(this.segment(), 0L, index, value); return this; }
    public VkDecompressMemoryInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryInfoEXT decompressionMethod(long value) { VH_decompressionMethod.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryInfoEXT regionCount(int value) { VH_regionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDecompressMemoryInfoEXT pRegions(MemorySegment value) { VH_pRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDecompressMemoryInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDecompressMemoryInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _decompressionMethodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_decompressionMethod, index), LAYOUT_decompressionMethod); }
    public MemorySegment _decompressionMethod() { return _decompressionMethodAt(0L); }
    public VkDecompressMemoryInfoEXT _decompressionMethodAt(long index, MemorySegment src) { _decompressionMethodAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryInfoEXT _decompressionMethod(MemorySegment src) { return _decompressionMethodAt(0L, src); }
    public MemorySegment _regionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_regionCount, index), LAYOUT_regionCount); }
    public MemorySegment _regionCount() { return _regionCountAt(0L); }
    public VkDecompressMemoryInfoEXT _regionCountAt(long index, MemorySegment src) { _regionCountAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryInfoEXT _regionCount(MemorySegment src) { return _regionCountAt(0L, src); }
    public MemorySegment _pRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRegions, index), LAYOUT_pRegions); }
    public MemorySegment _pRegions() { return _pRegionsAt(0L); }
    public VkDecompressMemoryInfoEXT _pRegionsAt(long index, MemorySegment src) { _pRegionsAt(index).copyFrom(src); return this; }
    public VkDecompressMemoryInfoEXT _pRegions(MemorySegment src) { return _pRegionsAt(0L, src); }
}
