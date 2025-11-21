// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPushConstantsInfoKHR`.
/// ## Layout
/// ```
/// struct VkPushConstantsInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineLayout layout;
///     VkShaderStageFlags stageFlags;
///     uint32_t offset;
///     uint32_t size;
///     const void* pValues;
/// }
/// ```
public final class VkPushConstantsInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_pValues = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_pValues = LAYOUT.select(PathElement.groupElement("pValues"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_pValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues"));

    public VkPushConstantsInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPushConstantsInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantsInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPushConstantsInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantsInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPushConstantsInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantsInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPushConstantsInfoKHR alloc(SegmentAllocator allocator) { return new VkPushConstantsInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPushConstantsInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPushConstantsInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPushConstantsInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO); }
    public static VkPushConstantsInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO);
        return s;
    }
    public VkPushConstantsInfoKHR copyFrom(VkPushConstantsInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPushConstantsInfoKHR reinterpret(long count) { return new VkPushConstantsInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPushConstantsInfoKHR asSlice(long index) { return new VkPushConstantsInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPushConstantsInfoKHR asSlice(long index, long count) { return new VkPushConstantsInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPushConstantsInfoKHR at(long index, Consumer<VkPushConstantsInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public int stageFlagsAt(long index) { return (int) VH_stageFlags.get(this.segment(), 0L, index); }
    public int offsetAt(long index) { return (int) VH_offset.get(this.segment(), 0L, index); }
    public int sizeAt(long index) { return (int) VH_size.get(this.segment(), 0L, index); }
    public MemorySegment pValuesAt(long index) { return (MemorySegment) VH_pValues.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public int stageFlags() { return (int) VH_stageFlags.get(this.segment(), 0L, 0L); }
    public int offset() { return (int) VH_offset.get(this.segment(), 0L, 0L); }
    public int size() { return (int) VH_size.get(this.segment(), 0L, 0L); }
    public MemorySegment pValues() { return (MemorySegment) VH_pValues.get(this.segment(), 0L, 0L); }
    public VkPushConstantsInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantsInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantsInfoKHR layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantsInfoKHR stageFlagsAt(long index, int value) { VH_stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantsInfoKHR offsetAt(long index, int value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantsInfoKHR sizeAt(long index, int value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantsInfoKHR pValuesAt(long index, MemorySegment value) { VH_pValues.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantsInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushConstantsInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushConstantsInfoKHR layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushConstantsInfoKHR stageFlags(int value) { VH_stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushConstantsInfoKHR offset(int value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushConstantsInfoKHR size(int value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushConstantsInfoKHR pValues(MemorySegment value) { VH_pValues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPushConstantsInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPushConstantsInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPushConstantsInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPushConstantsInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkPushConstantsInfoKHR _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkPushConstantsInfoKHR _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _stageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageFlags, index), LAYOUT_stageFlags); }
    public MemorySegment _stageFlags() { return _stageFlagsAt(0L); }
    public VkPushConstantsInfoKHR _stageFlagsAt(long index, MemorySegment src) { _stageFlagsAt(index).copyFrom(src); return this; }
    public VkPushConstantsInfoKHR _stageFlags(MemorySegment src) { return _stageFlagsAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkPushConstantsInfoKHR _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkPushConstantsInfoKHR _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkPushConstantsInfoKHR _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkPushConstantsInfoKHR _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _pValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pValues, index), LAYOUT_pValues); }
    public MemorySegment _pValues() { return _pValuesAt(0L); }
    public VkPushConstantsInfoKHR _pValuesAt(long index, MemorySegment src) { _pValuesAt(index).copyFrom(src); return this; }
    public VkPushConstantsInfoKHR _pValues(MemorySegment src) { return _pValuesAt(0L, src); }
}
