// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkHdrVividDynamicMetadataHUAWEI`.
/// ## Layout
/// ```
/// struct VkHdrVividDynamicMetadataHUAWEI {
///     VkStructureType sType;
///     const void* pNext;
///     size_t dynamicMetadataSize;
///     const void* pDynamicMetadata;
/// }
/// ```
public final class VkHdrVividDynamicMetadataHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("dynamicMetadataSize"),
        ValueLayout.ADDRESS.withName("pDynamicMetadata")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dynamicMetadataSize = LAYOUT.byteOffset(PathElement.groupElement("dynamicMetadataSize"));
    public static final long OFFSET_pDynamicMetadata = LAYOUT.byteOffset(PathElement.groupElement("pDynamicMetadata"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dynamicMetadataSize = LAYOUT.select(PathElement.groupElement("dynamicMetadataSize"));
    public static final MemoryLayout LAYOUT_pDynamicMetadata = LAYOUT.select(PathElement.groupElement("pDynamicMetadata"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dynamicMetadataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicMetadataSize"));
    public static final VarHandle VH_pDynamicMetadata = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicMetadata"));

    public VkHdrVividDynamicMetadataHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkHdrVividDynamicMetadataHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkHdrVividDynamicMetadataHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkHdrVividDynamicMetadataHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkHdrVividDynamicMetadataHUAWEI alloc(SegmentAllocator allocator) { return new VkHdrVividDynamicMetadataHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkHdrVividDynamicMetadataHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkHdrVividDynamicMetadataHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkHdrVividDynamicMetadataHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEIHdrVivid.VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI); }
    public static VkHdrVividDynamicMetadataHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEIHdrVivid.VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI);
        return s;
    }
    public VkHdrVividDynamicMetadataHUAWEI copyFrom(VkHdrVividDynamicMetadataHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkHdrVividDynamicMetadataHUAWEI reinterpret(long count) { return new VkHdrVividDynamicMetadataHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkHdrVividDynamicMetadataHUAWEI asSlice(long index) { return new VkHdrVividDynamicMetadataHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkHdrVividDynamicMetadataHUAWEI asSlice(long index, long count) { return new VkHdrVividDynamicMetadataHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkHdrVividDynamicMetadataHUAWEI at(long index, Consumer<VkHdrVividDynamicMetadataHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long dynamicMetadataSizeAt(long index) { return (long) VH_dynamicMetadataSize.get(this.segment(), 0L, index); }
    public MemorySegment pDynamicMetadataAt(long index) { return (MemorySegment) VH_pDynamicMetadata.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long dynamicMetadataSize() { return (long) VH_dynamicMetadataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pDynamicMetadata() { return (MemorySegment) VH_pDynamicMetadata.get(this.segment(), 0L, 0L); }
    public VkHdrVividDynamicMetadataHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkHdrVividDynamicMetadataHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkHdrVividDynamicMetadataHUAWEI dynamicMetadataSizeAt(long index, long value) { VH_dynamicMetadataSize.set(this.segment(), 0L, index, value); return this; }
    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadataAt(long index, MemorySegment value) { VH_pDynamicMetadata.set(this.segment(), 0L, index, value); return this; }
    public VkHdrVividDynamicMetadataHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrVividDynamicMetadataHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrVividDynamicMetadataHUAWEI dynamicMetadataSize(long value) { VH_dynamicMetadataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadata(MemorySegment value) { VH_pDynamicMetadata.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkHdrVividDynamicMetadataHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkHdrVividDynamicMetadataHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkHdrVividDynamicMetadataHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkHdrVividDynamicMetadataHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dynamicMetadataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicMetadataSize, index), LAYOUT_dynamicMetadataSize); }
    public MemorySegment _dynamicMetadataSize() { return _dynamicMetadataSizeAt(0L); }
    public VkHdrVividDynamicMetadataHUAWEI _dynamicMetadataSizeAt(long index, MemorySegment src) { _dynamicMetadataSizeAt(index).copyFrom(src); return this; }
    public VkHdrVividDynamicMetadataHUAWEI _dynamicMetadataSize(MemorySegment src) { return _dynamicMetadataSizeAt(0L, src); }
    public MemorySegment _pDynamicMetadataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDynamicMetadata, index), LAYOUT_pDynamicMetadata); }
    public MemorySegment _pDynamicMetadata() { return _pDynamicMetadataAt(0L); }
    public VkHdrVividDynamicMetadataHUAWEI _pDynamicMetadataAt(long index, MemorySegment src) { _pDynamicMetadataAt(index).copyFrom(src); return this; }
    public VkHdrVividDynamicMetadataHUAWEI _pDynamicMetadata(MemorySegment src) { return _pDynamicMetadataAt(0L, src); }
}
