// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPushConstantRange`.
/// ## Layout
/// ```
/// struct VkPushConstantRange {
///     VkShaderStageFlags stageFlags;
///     uint32_t offset;
///     uint32_t size;
/// }
/// ```
public final class VkPushConstantRange extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("size")
    );
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkPushConstantRange(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPushConstantRange of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantRange(segment, estimateCount(segment, LAYOUT)); }
    public static VkPushConstantRange ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantRange(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPushConstantRange ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantRange(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPushConstantRange alloc(SegmentAllocator allocator) { return new VkPushConstantRange(allocator.allocate(LAYOUT), 1); }
    public static VkPushConstantRange alloc(SegmentAllocator allocator, long count) { return new VkPushConstantRange(allocator.allocate(LAYOUT, count), count); }
    public VkPushConstantRange copyFrom(VkPushConstantRange src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPushConstantRange reinterpret(long count) { return new VkPushConstantRange(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPushConstantRange asSlice(long index) { return new VkPushConstantRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPushConstantRange asSlice(long index, long count) { return new VkPushConstantRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPushConstantRange at(long index, Consumer<VkPushConstantRange> func) { func.accept(asSlice(index)); return this; }
    public int stageFlagsAt(long index) { return (int) VH_stageFlags.get(this.segment(), 0L, index); }
    public int offsetAt(long index) { return (int) VH_offset.get(this.segment(), 0L, index); }
    public int sizeAt(long index) { return (int) VH_size.get(this.segment(), 0L, index); }
    public int stageFlags() { return (int) VH_stageFlags.get(this.segment(), 0L, 0L); }
    public int offset() { return (int) VH_offset.get(this.segment(), 0L, 0L); }
    public int size() { return (int) VH_size.get(this.segment(), 0L, 0L); }
    public VkPushConstantRange stageFlagsAt(long index, int value) { VH_stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantRange offsetAt(long index, int value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantRange sizeAt(long index, int value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkPushConstantRange stageFlags(int value) { VH_stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushConstantRange offset(int value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushConstantRange size(int value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _stageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageFlags, index), LAYOUT_stageFlags); }
    public MemorySegment _stageFlags() { return _stageFlagsAt(0L); }
    public VkPushConstantRange _stageFlagsAt(long index, MemorySegment src) { _stageFlagsAt(index).copyFrom(src); return this; }
    public VkPushConstantRange _stageFlags(MemorySegment src) { return _stageFlagsAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkPushConstantRange _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkPushConstantRange _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkPushConstantRange _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkPushConstantRange _size(MemorySegment src) { return _sizeAt(0L, src); }
}
