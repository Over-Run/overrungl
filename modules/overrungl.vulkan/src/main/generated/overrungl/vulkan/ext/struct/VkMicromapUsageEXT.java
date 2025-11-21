// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMicromapUsageEXT`.
/// ## Layout
/// ```
/// struct VkMicromapUsageEXT {
///     uint32_t count;
///     uint32_t subdivisionLevel;
///     uint32_t format;
/// }
/// ```
public final class VkMicromapUsageEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("subdivisionLevel"),
        ValueLayout.JAVA_INT.withName("format")
    );
    public static final long OFFSET_count = LAYOUT.byteOffset(PathElement.groupElement("count"));
    public static final long OFFSET_subdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("subdivisionLevel"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_count = LAYOUT.select(PathElement.groupElement("count"));
    public static final MemoryLayout LAYOUT_subdivisionLevel = LAYOUT.select(PathElement.groupElement("subdivisionLevel"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final VarHandle VH_count = LAYOUT.arrayElementVarHandle(PathElement.groupElement("count"));
    public static final VarHandle VH_subdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subdivisionLevel"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    public VkMicromapUsageEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMicromapUsageEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMicromapUsageEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMicromapUsageEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMicromapUsageEXT alloc(SegmentAllocator allocator) { return new VkMicromapUsageEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMicromapUsageEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapUsageEXT(allocator.allocate(LAYOUT, count), count); }
    public VkMicromapUsageEXT copyFrom(VkMicromapUsageEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMicromapUsageEXT reinterpret(long count) { return new VkMicromapUsageEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMicromapUsageEXT asSlice(long index) { return new VkMicromapUsageEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMicromapUsageEXT asSlice(long index, long count) { return new VkMicromapUsageEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMicromapUsageEXT at(long index, Consumer<VkMicromapUsageEXT> func) { func.accept(asSlice(index)); return this; }
    public int countAt(long index) { return (int) VH_count.get(this.segment(), 0L, index); }
    public int subdivisionLevelAt(long index) { return (int) VH_subdivisionLevel.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int count() { return (int) VH_count.get(this.segment(), 0L, 0L); }
    public int subdivisionLevel() { return (int) VH_subdivisionLevel.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public VkMicromapUsageEXT countAt(long index, int value) { VH_count.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapUsageEXT subdivisionLevelAt(long index, int value) { VH_subdivisionLevel.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapUsageEXT formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapUsageEXT count(int value) { VH_count.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapUsageEXT subdivisionLevel(int value) { VH_subdivisionLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapUsageEXT format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _countAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_count, index), LAYOUT_count); }
    public MemorySegment _count() { return _countAt(0L); }
    public VkMicromapUsageEXT _countAt(long index, MemorySegment src) { _countAt(index).copyFrom(src); return this; }
    public VkMicromapUsageEXT _count(MemorySegment src) { return _countAt(0L, src); }
    public MemorySegment _subdivisionLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subdivisionLevel, index), LAYOUT_subdivisionLevel); }
    public MemorySegment _subdivisionLevel() { return _subdivisionLevelAt(0L); }
    public VkMicromapUsageEXT _subdivisionLevelAt(long index, MemorySegment src) { _subdivisionLevelAt(index).copyFrom(src); return this; }
    public VkMicromapUsageEXT _subdivisionLevel(MemorySegment src) { return _subdivisionLevelAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkMicromapUsageEXT _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkMicromapUsageEXT _format(MemorySegment src) { return _formatAt(0L, src); }
}
