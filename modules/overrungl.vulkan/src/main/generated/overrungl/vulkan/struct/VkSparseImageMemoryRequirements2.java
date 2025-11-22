// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSparseImageMemoryRequirements2`.
/// ## Layout
/// ```
/// struct VkSparseImageMemoryRequirements2 {
///     VkStructureType sType;
///     void* pNext;
///     VkSparseImageMemoryRequirements memoryRequirements;
/// }
/// ```
public final class VkSparseImageMemoryRequirements2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkSparseImageMemoryRequirements.LAYOUT.withName("memoryRequirements")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryRequirements = LAYOUT.select(PathElement.groupElement("memoryRequirements"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryRequirements$formatProperties$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("formatProperties"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_memoryRequirements$formatProperties$imageGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("formatProperties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_memoryRequirements$formatProperties$imageGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("formatProperties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_memoryRequirements$formatProperties$imageGranularity$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("formatProperties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("depth"));
    public static final VarHandle VH_memoryRequirements$formatProperties$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("formatProperties"), PathElement.groupElement("flags"));
    public static final VarHandle VH_memoryRequirements$imageMipTailFirstLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("imageMipTailFirstLod"));
    public static final VarHandle VH_memoryRequirements$imageMipTailSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("imageMipTailSize"));
    public static final VarHandle VH_memoryRequirements$imageMipTailOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("imageMipTailOffset"));
    public static final VarHandle VH_memoryRequirements$imageMipTailStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRequirements"), PathElement.groupElement("imageMipTailStride"));

    public VkSparseImageMemoryRequirements2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSparseImageMemoryRequirements2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements2(segment, estimateCount(segment, LAYOUT)); }
    public static VkSparseImageMemoryRequirements2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSparseImageMemoryRequirements2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSparseImageMemoryRequirements2 alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryRequirements2(allocator.allocate(LAYOUT), 1); }
    public static VkSparseImageMemoryRequirements2 alloc(SegmentAllocator allocator, long count) { return new VkSparseImageMemoryRequirements2(allocator.allocate(LAYOUT, count), count); }
    public static VkSparseImageMemoryRequirements2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2); }
    public static VkSparseImageMemoryRequirements2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2);
        return s;
    }
    public VkSparseImageMemoryRequirements2 copyFrom(VkSparseImageMemoryRequirements2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSparseImageMemoryRequirements2 reinterpret(long count) { return new VkSparseImageMemoryRequirements2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSparseImageMemoryRequirements2 asSlice(long index) { return new VkSparseImageMemoryRequirements2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSparseImageMemoryRequirements2 asSlice(long index, long count) { return new VkSparseImageMemoryRequirements2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSparseImageMemoryRequirements2 at(long index, Consumer<VkSparseImageMemoryRequirements2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryRequirements$formatProperties$aspectMaskAt(long index) { return (int) VH_memoryRequirements$formatProperties$aspectMask.get(this.segment(), 0L, index); }
    public int memoryRequirements$formatProperties$imageGranularity$widthAt(long index) { return (int) VH_memoryRequirements$formatProperties$imageGranularity$width.get(this.segment(), 0L, index); }
    public int memoryRequirements$formatProperties$imageGranularity$heightAt(long index) { return (int) VH_memoryRequirements$formatProperties$imageGranularity$height.get(this.segment(), 0L, index); }
    public int memoryRequirements$formatProperties$imageGranularity$depthAt(long index) { return (int) VH_memoryRequirements$formatProperties$imageGranularity$depth.get(this.segment(), 0L, index); }
    public int memoryRequirements$formatProperties$flagsAt(long index) { return (int) VH_memoryRequirements$formatProperties$flags.get(this.segment(), 0L, index); }
    public int memoryRequirements$imageMipTailFirstLodAt(long index) { return (int) VH_memoryRequirements$imageMipTailFirstLod.get(this.segment(), 0L, index); }
    public long memoryRequirements$imageMipTailSizeAt(long index) { return (long) VH_memoryRequirements$imageMipTailSize.get(this.segment(), 0L, index); }
    public long memoryRequirements$imageMipTailOffsetAt(long index) { return (long) VH_memoryRequirements$imageMipTailOffset.get(this.segment(), 0L, index); }
    public long memoryRequirements$imageMipTailStrideAt(long index) { return (long) VH_memoryRequirements$imageMipTailStride.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryRequirements$formatProperties$aspectMask() { return (int) VH_memoryRequirements$formatProperties$aspectMask.get(this.segment(), 0L, 0L); }
    public int memoryRequirements$formatProperties$imageGranularity$width() { return (int) VH_memoryRequirements$formatProperties$imageGranularity$width.get(this.segment(), 0L, 0L); }
    public int memoryRequirements$formatProperties$imageGranularity$height() { return (int) VH_memoryRequirements$formatProperties$imageGranularity$height.get(this.segment(), 0L, 0L); }
    public int memoryRequirements$formatProperties$imageGranularity$depth() { return (int) VH_memoryRequirements$formatProperties$imageGranularity$depth.get(this.segment(), 0L, 0L); }
    public int memoryRequirements$formatProperties$flags() { return (int) VH_memoryRequirements$formatProperties$flags.get(this.segment(), 0L, 0L); }
    public int memoryRequirements$imageMipTailFirstLod() { return (int) VH_memoryRequirements$imageMipTailFirstLod.get(this.segment(), 0L, 0L); }
    public long memoryRequirements$imageMipTailSize() { return (long) VH_memoryRequirements$imageMipTailSize.get(this.segment(), 0L, 0L); }
    public long memoryRequirements$imageMipTailOffset() { return (long) VH_memoryRequirements$imageMipTailOffset.get(this.segment(), 0L, 0L); }
    public long memoryRequirements$imageMipTailStride() { return (long) VH_memoryRequirements$imageMipTailStride.get(this.segment(), 0L, 0L); }
    public VkSparseImageMemoryRequirements2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$aspectMaskAt(long index, int value) { VH_memoryRequirements$formatProperties$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$imageGranularity$widthAt(long index, int value) { VH_memoryRequirements$formatProperties$imageGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$imageGranularity$heightAt(long index, int value) { VH_memoryRequirements$formatProperties$imageGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$imageGranularity$depthAt(long index, int value) { VH_memoryRequirements$formatProperties$imageGranularity$depth.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$flagsAt(long index, int value) { VH_memoryRequirements$formatProperties$flags.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$imageMipTailFirstLodAt(long index, int value) { VH_memoryRequirements$imageMipTailFirstLod.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$imageMipTailSizeAt(long index, long value) { VH_memoryRequirements$imageMipTailSize.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$imageMipTailOffsetAt(long index, long value) { VH_memoryRequirements$imageMipTailOffset.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$imageMipTailStrideAt(long index, long value) { VH_memoryRequirements$imageMipTailStride.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$aspectMask(int value) { VH_memoryRequirements$formatProperties$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$imageGranularity$width(int value) { VH_memoryRequirements$formatProperties$imageGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$imageGranularity$height(int value) { VH_memoryRequirements$formatProperties$imageGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$imageGranularity$depth(int value) { VH_memoryRequirements$formatProperties$imageGranularity$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$formatProperties$flags(int value) { VH_memoryRequirements$formatProperties$flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$imageMipTailFirstLod(int value) { VH_memoryRequirements$imageMipTailFirstLod.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$imageMipTailSize(long value) { VH_memoryRequirements$imageMipTailSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$imageMipTailOffset(long value) { VH_memoryRequirements$imageMipTailOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements2 memoryRequirements$imageMipTailStride(long value) { VH_memoryRequirements$imageMipTailStride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSparseImageMemoryRequirements2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryRequirements2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSparseImageMemoryRequirements2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryRequirements2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryRequirementsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryRequirements, index), LAYOUT_memoryRequirements); }
    public MemorySegment _memoryRequirements() { return _memoryRequirementsAt(0L); }
    public VkSparseImageMemoryRequirements2 _memoryRequirementsAt(long index, MemorySegment src) { _memoryRequirementsAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryRequirements2 _memoryRequirements(MemorySegment src) { return _memoryRequirementsAt(0L, src); }
}
