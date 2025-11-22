// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceCounterDescriptionKHR`.
/// ## Layout
/// ```
/// struct VkPerformanceCounterDescriptionKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPerformanceCounterDescriptionFlagsKHR flags;
///     char name[VK_MAX_DESCRIPTION_SIZE];
///     char category[VK_MAX_DESCRIPTION_SIZE];
///     char description[VK_MAX_DESCRIPTION_SIZE];
/// }
/// ```
public final class VkPerformanceCounterDescriptionKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("category"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final long OFFSET_category = LAYOUT.byteOffset(PathElement.groupElement("category"));
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_category = LAYOUT.select(PathElement.groupElement("category"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    public static final VarHandle VH_category = LAYOUT.arrayElementVarHandle(PathElement.groupElement("category"), PathElement.sequenceElement());
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());

    public VkPerformanceCounterDescriptionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceCounterDescriptionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceCounterDescriptionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceCounterDescriptionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceCounterDescriptionKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterDescriptionKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceCounterDescriptionKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterDescriptionKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceCounterDescriptionKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR); }
    public static VkPerformanceCounterDescriptionKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR);
        return s;
    }
    public VkPerformanceCounterDescriptionKHR copyFrom(VkPerformanceCounterDescriptionKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceCounterDescriptionKHR reinterpret(long count) { return new VkPerformanceCounterDescriptionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceCounterDescriptionKHR asSlice(long index) { return new VkPerformanceCounterDescriptionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceCounterDescriptionKHR asSlice(long index, long count) { return new VkPerformanceCounterDescriptionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceCounterDescriptionKHR at(long index, Consumer<VkPerformanceCounterDescriptionKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public byte nameAt(long index, long index0) { return (byte) VH_name.get(this.segment(), 0L, index, index0); }
    public byte categoryAt(long index, long index0) { return (byte) VH_category.get(this.segment(), 0L, index, index0); }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public byte name(long index0) { return (byte) VH_name.get(this.segment(), 0L, 0L, index0); }
    public byte category(long index0) { return (byte) VH_category.get(this.segment(), 0L, 0L, index0); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public VkPerformanceCounterDescriptionKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterDescriptionKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterDescriptionKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterDescriptionKHR nameAt(long index, long index0, byte value) { VH_name.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPerformanceCounterDescriptionKHR categoryAt(long index, long index0, byte value) { VH_category.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPerformanceCounterDescriptionKHR descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPerformanceCounterDescriptionKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterDescriptionKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterDescriptionKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterDescriptionKHR name(long index0, byte value) { VH_name.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPerformanceCounterDescriptionKHR category(long index0, byte value) { VH_category.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPerformanceCounterDescriptionKHR description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceCounterDescriptionKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceCounterDescriptionKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPerformanceCounterDescriptionKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkPerformanceCounterDescriptionKHR _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionKHR _name(MemorySegment src) { return _nameAt(0L, src); }
    public MemorySegment _categoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_category, index), LAYOUT_category); }
    public MemorySegment _category() { return _categoryAt(0L); }
    public VkPerformanceCounterDescriptionKHR _categoryAt(long index, MemorySegment src) { _categoryAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionKHR _category(MemorySegment src) { return _categoryAt(0L, src); }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkPerformanceCounterDescriptionKHR _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionKHR _description(MemorySegment src) { return _descriptionAt(0L, src); }
}
