// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceInlineUniformBlockPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxInlineUniformBlockSize;
///     uint32_t maxPerStageDescriptorInlineUniformBlocks;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxDescriptorSetInlineUniformBlocks;
///     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
/// }
/// ```
public final class VkPhysicalDeviceInlineUniformBlockPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockSize"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxInlineUniformBlockSize = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformBlockSize"));
    public static final long OFFSET_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    public static final long OFFSET_maxDescriptorSetInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxInlineUniformBlockSize = LAYOUT.select(PathElement.groupElement("maxInlineUniformBlockSize"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxInlineUniformBlockSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockSize"));
    public static final VarHandle VH_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    public static final VarHandle VH_maxDescriptorSetInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));

    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES); }
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT copyFrom(VkPhysicalDeviceInlineUniformBlockPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT at(long index, Consumer<VkPhysicalDeviceInlineUniformBlockPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxInlineUniformBlockSizeAt(long index) { return (int) VH_maxInlineUniformBlockSize.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorInlineUniformBlocksAt(long index) { return (int) VH_maxPerStageDescriptorInlineUniformBlocks.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get(this.segment(), 0L, index); }
    public int maxDescriptorSetInlineUniformBlocksAt(long index) { return (int) VH_maxDescriptorSetInlineUniformBlocks.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxInlineUniformBlockSize() { return (int) VH_maxInlineUniformBlockSize.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorInlineUniformBlocks() { return (int) VH_maxPerStageDescriptorInlineUniformBlocks.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return (int) VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetInlineUniformBlocks() { return (int) VH_maxDescriptorSetInlineUniformBlocks.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return (int) VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxInlineUniformBlockSizeAt(long index, int value) { VH_maxInlineUniformBlockSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxPerStageDescriptorInlineUniformBlocksAt(long index, int value) { VH_maxPerStageDescriptorInlineUniformBlocks.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxDescriptorSetInlineUniformBlocksAt(long index, int value) { VH_maxDescriptorSetInlineUniformBlocks.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxInlineUniformBlockSize(int value) { VH_maxInlineUniformBlockSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxPerStageDescriptorInlineUniformBlocks(int value) { VH_maxPerStageDescriptorInlineUniformBlocks.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int value) { VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxDescriptorSetInlineUniformBlocks(int value) { VH_maxDescriptorSetInlineUniformBlocks.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int value) { VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxInlineUniformBlockSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInlineUniformBlockSize, index), LAYOUT_maxInlineUniformBlockSize); }
    public MemorySegment _maxInlineUniformBlockSize() { return _maxInlineUniformBlockSizeAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxInlineUniformBlockSizeAt(long index, MemorySegment src) { _maxInlineUniformBlockSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxInlineUniformBlockSize(MemorySegment src) { return _maxInlineUniformBlockSizeAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorInlineUniformBlocksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorInlineUniformBlocks, index), LAYOUT_maxPerStageDescriptorInlineUniformBlocks); }
    public MemorySegment _maxPerStageDescriptorInlineUniformBlocks() { return _maxPerStageDescriptorInlineUniformBlocksAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxPerStageDescriptorInlineUniformBlocksAt(long index, MemorySegment src) { _maxPerStageDescriptorInlineUniformBlocksAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxPerStageDescriptorInlineUniformBlocks(MemorySegment src) { return _maxPerStageDescriptorInlineUniformBlocksAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(0L, src); }
    public MemorySegment _maxDescriptorSetInlineUniformBlocksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetInlineUniformBlocks, index), LAYOUT_maxDescriptorSetInlineUniformBlocks); }
    public MemorySegment _maxDescriptorSetInlineUniformBlocks() { return _maxDescriptorSetInlineUniformBlocksAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxDescriptorSetInlineUniformBlocksAt(long index, MemorySegment src) { _maxDescriptorSetInlineUniformBlocksAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxDescriptorSetInlineUniformBlocks(MemorySegment src) { return _maxDescriptorSetInlineUniformBlocksAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindInlineUniformBlocks, index), LAYOUT_maxDescriptorSetUpdateAfterBindInlineUniformBlocks); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(0L); }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT _maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(0L, src); }
}
