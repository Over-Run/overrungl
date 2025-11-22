// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceCounterDescriptionARM`.
/// ## Layout
/// ```
/// struct VkPerformanceCounterDescriptionARM {
///     VkStructureType sType;
///     void* pNext;
///     VkPerformanceCounterDescriptionFlagsARM flags;
///     char name[VK_MAX_DESCRIPTION_SIZE];
/// }
/// ```
public final class VkPerformanceCounterDescriptionARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());

    public VkPerformanceCounterDescriptionARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceCounterDescriptionARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceCounterDescriptionARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceCounterDescriptionARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceCounterDescriptionARM alloc(SegmentAllocator allocator) { return new VkPerformanceCounterDescriptionARM(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceCounterDescriptionARM alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterDescriptionARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceCounterDescriptionARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM); }
    public static VkPerformanceCounterDescriptionARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_ARM);
        return s;
    }
    public VkPerformanceCounterDescriptionARM copyFrom(VkPerformanceCounterDescriptionARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceCounterDescriptionARM reinterpret(long count) { return new VkPerformanceCounterDescriptionARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceCounterDescriptionARM asSlice(long index) { return new VkPerformanceCounterDescriptionARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceCounterDescriptionARM asSlice(long index, long count) { return new VkPerformanceCounterDescriptionARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceCounterDescriptionARM at(long index, Consumer<VkPerformanceCounterDescriptionARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public byte nameAt(long index, long index0) { return (byte) VH_name.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public byte name(long index0) { return (byte) VH_name.get(this.segment(), 0L, 0L, index0); }
    public VkPerformanceCounterDescriptionARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterDescriptionARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterDescriptionARM flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterDescriptionARM nameAt(long index, long index0, byte value) { VH_name.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPerformanceCounterDescriptionARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterDescriptionARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterDescriptionARM flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterDescriptionARM name(long index0, byte value) { VH_name.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceCounterDescriptionARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceCounterDescriptionARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPerformanceCounterDescriptionARM _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionARM _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkPerformanceCounterDescriptionARM _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterDescriptionARM _name(MemorySegment src) { return _nameAt(0L, src); }
}
