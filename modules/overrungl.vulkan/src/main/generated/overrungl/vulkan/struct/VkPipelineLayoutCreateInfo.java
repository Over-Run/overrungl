// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineLayoutCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineLayoutCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineLayoutCreateFlags flags;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout* pSetLayouts;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange* pPushConstantRanges;
/// }
/// ```
public final class VkPipelineLayoutCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withName("pPushConstantRanges")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_setLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("setLayoutCount"));
    public static final long OFFSET_pSetLayouts = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
    public static final long OFFSET_pushConstantRangeCount = LAYOUT.byteOffset(PathElement.groupElement("pushConstantRangeCount"));
    public static final long OFFSET_pPushConstantRanges = LAYOUT.byteOffset(PathElement.groupElement("pPushConstantRanges"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_setLayoutCount = LAYOUT.select(PathElement.groupElement("setLayoutCount"));
    public static final MemoryLayout LAYOUT_pSetLayouts = LAYOUT.select(PathElement.groupElement("pSetLayouts"));
    public static final MemoryLayout LAYOUT_pushConstantRangeCount = LAYOUT.select(PathElement.groupElement("pushConstantRangeCount"));
    public static final MemoryLayout LAYOUT_pPushConstantRanges = LAYOUT.select(PathElement.groupElement("pPushConstantRanges"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_setLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setLayoutCount"));
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));
    public static final VarHandle VH_pushConstantRangeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushConstantRangeCount"));
    public static final VarHandle VH_pPushConstantRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstantRanges"));

    public VkPipelineLayoutCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineLayoutCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLayoutCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineLayoutCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLayoutCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineLayoutCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineLayoutCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineLayoutCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineLayoutCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineLayoutCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineLayoutCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineLayoutCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO); }
    public static VkPipelineLayoutCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);
        return s;
    }
    public VkPipelineLayoutCreateInfo copyFrom(VkPipelineLayoutCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineLayoutCreateInfo reinterpret(long count) { return new VkPipelineLayoutCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineLayoutCreateInfo asSlice(long index) { return new VkPipelineLayoutCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineLayoutCreateInfo asSlice(long index, long count) { return new VkPipelineLayoutCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineLayoutCreateInfo at(long index, Consumer<VkPipelineLayoutCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int setLayoutCountAt(long index) { return (int) VH_setLayoutCount.get(this.segment(), 0L, index); }
    public MemorySegment pSetLayoutsAt(long index) { return (MemorySegment) VH_pSetLayouts.get(this.segment(), 0L, index); }
    public int pushConstantRangeCountAt(long index) { return (int) VH_pushConstantRangeCount.get(this.segment(), 0L, index); }
    public MemorySegment pPushConstantRangesAt(long index) { return (MemorySegment) VH_pPushConstantRanges.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int setLayoutCount() { return (int) VH_setLayoutCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSetLayouts() { return (MemorySegment) VH_pSetLayouts.get(this.segment(), 0L, 0L); }
    public int pushConstantRangeCount() { return (int) VH_pushConstantRangeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPushConstantRanges() { return (MemorySegment) VH_pPushConstantRanges.get(this.segment(), 0L, 0L); }
    public VkPipelineLayoutCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLayoutCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLayoutCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLayoutCreateInfo setLayoutCountAt(long index, int value) { VH_setLayoutCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLayoutCreateInfo pSetLayoutsAt(long index, MemorySegment value) { VH_pSetLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLayoutCreateInfo pushConstantRangeCountAt(long index, int value) { VH_pushConstantRangeCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLayoutCreateInfo pPushConstantRangesAt(long index, MemorySegment value) { VH_pPushConstantRanges.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineLayoutCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLayoutCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLayoutCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLayoutCreateInfo setLayoutCount(int value) { VH_setLayoutCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLayoutCreateInfo pSetLayouts(MemorySegment value) { VH_pSetLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLayoutCreateInfo pushConstantRangeCount(int value) { VH_pushConstantRangeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineLayoutCreateInfo pPushConstantRanges(MemorySegment value) { VH_pPushConstantRanges.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineLayoutCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineLayoutCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineLayoutCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineLayoutCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineLayoutCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineLayoutCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _setLayoutCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_setLayoutCount, index), LAYOUT_setLayoutCount); }
    public MemorySegment _setLayoutCount() { return _setLayoutCountAt(0L); }
    public VkPipelineLayoutCreateInfo _setLayoutCountAt(long index, MemorySegment src) { _setLayoutCountAt(index).copyFrom(src); return this; }
    public VkPipelineLayoutCreateInfo _setLayoutCount(MemorySegment src) { return _setLayoutCountAt(0L, src); }
    public MemorySegment _pSetLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSetLayouts, index), LAYOUT_pSetLayouts); }
    public MemorySegment _pSetLayouts() { return _pSetLayoutsAt(0L); }
    public VkPipelineLayoutCreateInfo _pSetLayoutsAt(long index, MemorySegment src) { _pSetLayoutsAt(index).copyFrom(src); return this; }
    public VkPipelineLayoutCreateInfo _pSetLayouts(MemorySegment src) { return _pSetLayoutsAt(0L, src); }
    public MemorySegment _pushConstantRangeCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pushConstantRangeCount, index), LAYOUT_pushConstantRangeCount); }
    public MemorySegment _pushConstantRangeCount() { return _pushConstantRangeCountAt(0L); }
    public VkPipelineLayoutCreateInfo _pushConstantRangeCountAt(long index, MemorySegment src) { _pushConstantRangeCountAt(index).copyFrom(src); return this; }
    public VkPipelineLayoutCreateInfo _pushConstantRangeCount(MemorySegment src) { return _pushConstantRangeCountAt(0L, src); }
    public MemorySegment _pPushConstantRangesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPushConstantRanges, index), LAYOUT_pPushConstantRanges); }
    public MemorySegment _pPushConstantRanges() { return _pPushConstantRangesAt(0L); }
    public VkPipelineLayoutCreateInfo _pPushConstantRangesAt(long index, MemorySegment src) { _pPushConstantRangesAt(index).copyFrom(src); return this; }
    public VkPipelineLayoutCreateInfo _pPushConstantRanges(MemorySegment src) { return _pPushConstantRangesAt(0L, src); }
}
