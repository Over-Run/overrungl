// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorDescriptionARM`.
/// ## Layout
/// ```
/// struct VkTensorDescriptionARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkTensorTilingARM tiling;
///     VkFormat format;
///     uint32_t dimensionCount;
///     const int64_t* pDimensions;
///     const int64_t* pStrides;
///     VkTensorUsageFlagsARM usage;
/// }
/// ```
public final class VkTensorDescriptionARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tiling"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("dimensionCount"),
        ValueLayout.ADDRESS.withName("pDimensions"),
        ValueLayout.ADDRESS.withName("pStrides"),
        ValueLayout.JAVA_LONG.withName("usage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tiling = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_dimensionCount = LAYOUT.byteOffset(PathElement.groupElement("dimensionCount"));
    public static final long OFFSET_pDimensions = LAYOUT.byteOffset(PathElement.groupElement("pDimensions"));
    public static final long OFFSET_pStrides = LAYOUT.byteOffset(PathElement.groupElement("pStrides"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tiling = LAYOUT.select(PathElement.groupElement("tiling"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_dimensionCount = LAYOUT.select(PathElement.groupElement("dimensionCount"));
    public static final MemoryLayout LAYOUT_pDimensions = LAYOUT.select(PathElement.groupElement("pDimensions"));
    public static final MemoryLayout LAYOUT_pStrides = LAYOUT.select(PathElement.groupElement("pStrides"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_dimensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dimensionCount"));
    public static final VarHandle VH_pDimensions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDimensions"));
    public static final VarHandle VH_pStrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStrides"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));

    public VkTensorDescriptionARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkTensorDescriptionARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDescriptionARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkTensorDescriptionARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDescriptionARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkTensorDescriptionARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDescriptionARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkTensorDescriptionARM alloc(SegmentAllocator allocator) { return new VkTensorDescriptionARM(allocator.allocate(LAYOUT), 1); }
    public static VkTensorDescriptionARM alloc(SegmentAllocator allocator, long count) { return new VkTensorDescriptionARM(allocator.allocate(LAYOUT, count), count); }
    public static VkTensorDescriptionARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM); }
    public static VkTensorDescriptionARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMTensors.VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM);
        return s;
    }
    public VkTensorDescriptionARM copyFrom(VkTensorDescriptionARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkTensorDescriptionARM reinterpret(long count) { return new VkTensorDescriptionARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkTensorDescriptionARM asSlice(long index) { return new VkTensorDescriptionARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkTensorDescriptionARM asSlice(long index, long count) { return new VkTensorDescriptionARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkTensorDescriptionARM at(long index, Consumer<VkTensorDescriptionARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tilingAt(long index) { return (int) VH_tiling.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int dimensionCountAt(long index) { return (int) VH_dimensionCount.get(this.segment(), 0L, index); }
    public MemorySegment pDimensionsAt(long index) { return (MemorySegment) VH_pDimensions.get(this.segment(), 0L, index); }
    public MemorySegment pStridesAt(long index) { return (MemorySegment) VH_pStrides.get(this.segment(), 0L, index); }
    public long usageAt(long index) { return (long) VH_usage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tiling() { return (int) VH_tiling.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int dimensionCount() { return (int) VH_dimensionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDimensions() { return (MemorySegment) VH_pDimensions.get(this.segment(), 0L, 0L); }
    public MemorySegment pStrides() { return (MemorySegment) VH_pStrides.get(this.segment(), 0L, 0L); }
    public long usage() { return (long) VH_usage.get(this.segment(), 0L, 0L); }
    public VkTensorDescriptionARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkTensorDescriptionARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkTensorDescriptionARM tilingAt(long index, int value) { VH_tiling.set(this.segment(), 0L, index, value); return this; }
    public VkTensorDescriptionARM formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkTensorDescriptionARM dimensionCountAt(long index, int value) { VH_dimensionCount.set(this.segment(), 0L, index, value); return this; }
    public VkTensorDescriptionARM pDimensionsAt(long index, MemorySegment value) { VH_pDimensions.set(this.segment(), 0L, index, value); return this; }
    public VkTensorDescriptionARM pStridesAt(long index, MemorySegment value) { VH_pStrides.set(this.segment(), 0L, index, value); return this; }
    public VkTensorDescriptionARM usageAt(long index, long value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkTensorDescriptionARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorDescriptionARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorDescriptionARM tiling(int value) { VH_tiling.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorDescriptionARM format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorDescriptionARM dimensionCount(int value) { VH_dimensionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorDescriptionARM pDimensions(MemorySegment value) { VH_pDimensions.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorDescriptionARM pStrides(MemorySegment value) { VH_pStrides.set(this.segment(), 0L, 0L, value); return this; }
    public VkTensorDescriptionARM usage(long value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkTensorDescriptionARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkTensorDescriptionARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkTensorDescriptionARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkTensorDescriptionARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tilingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tiling, index), LAYOUT_tiling); }
    public MemorySegment _tiling() { return _tilingAt(0L); }
    public VkTensorDescriptionARM _tilingAt(long index, MemorySegment src) { _tilingAt(index).copyFrom(src); return this; }
    public VkTensorDescriptionARM _tiling(MemorySegment src) { return _tilingAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkTensorDescriptionARM _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkTensorDescriptionARM _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _dimensionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dimensionCount, index), LAYOUT_dimensionCount); }
    public MemorySegment _dimensionCount() { return _dimensionCountAt(0L); }
    public VkTensorDescriptionARM _dimensionCountAt(long index, MemorySegment src) { _dimensionCountAt(index).copyFrom(src); return this; }
    public VkTensorDescriptionARM _dimensionCount(MemorySegment src) { return _dimensionCountAt(0L, src); }
    public MemorySegment _pDimensionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDimensions, index), LAYOUT_pDimensions); }
    public MemorySegment _pDimensions() { return _pDimensionsAt(0L); }
    public VkTensorDescriptionARM _pDimensionsAt(long index, MemorySegment src) { _pDimensionsAt(index).copyFrom(src); return this; }
    public VkTensorDescriptionARM _pDimensions(MemorySegment src) { return _pDimensionsAt(0L, src); }
    public MemorySegment _pStridesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStrides, index), LAYOUT_pStrides); }
    public MemorySegment _pStrides() { return _pStridesAt(0L); }
    public VkTensorDescriptionARM _pStridesAt(long index, MemorySegment src) { _pStridesAt(index).copyFrom(src); return this; }
    public VkTensorDescriptionARM _pStrides(MemorySegment src) { return _pStridesAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkTensorDescriptionARM _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkTensorDescriptionARM _usage(MemorySegment src) { return _usageAt(0L, src); }
}
