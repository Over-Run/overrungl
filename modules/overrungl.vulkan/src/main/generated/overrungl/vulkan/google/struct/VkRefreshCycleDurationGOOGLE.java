// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.google.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRefreshCycleDurationGOOGLE`.
/// ## Layout
/// ```
/// struct VkRefreshCycleDurationGOOGLE {
///     uint64_t refreshDuration;
/// }
/// ```
public final class VkRefreshCycleDurationGOOGLE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("refreshDuration")
    );
    public static final long OFFSET_refreshDuration = LAYOUT.byteOffset(PathElement.groupElement("refreshDuration"));
    public static final MemoryLayout LAYOUT_refreshDuration = LAYOUT.select(PathElement.groupElement("refreshDuration"));
    public static final VarHandle VH_refreshDuration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshDuration"));

    public VkRefreshCycleDurationGOOGLE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRefreshCycleDurationGOOGLE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRefreshCycleDurationGOOGLE(segment, estimateCount(segment, LAYOUT)); }
    public static VkRefreshCycleDurationGOOGLE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRefreshCycleDurationGOOGLE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRefreshCycleDurationGOOGLE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRefreshCycleDurationGOOGLE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRefreshCycleDurationGOOGLE alloc(SegmentAllocator allocator) { return new VkRefreshCycleDurationGOOGLE(allocator.allocate(LAYOUT), 1); }
    public static VkRefreshCycleDurationGOOGLE alloc(SegmentAllocator allocator, long count) { return new VkRefreshCycleDurationGOOGLE(allocator.allocate(LAYOUT, count), count); }
    public VkRefreshCycleDurationGOOGLE copyFrom(VkRefreshCycleDurationGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRefreshCycleDurationGOOGLE reinterpret(long count) { return new VkRefreshCycleDurationGOOGLE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRefreshCycleDurationGOOGLE asSlice(long index) { return new VkRefreshCycleDurationGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRefreshCycleDurationGOOGLE asSlice(long index, long count) { return new VkRefreshCycleDurationGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRefreshCycleDurationGOOGLE at(long index, Consumer<VkRefreshCycleDurationGOOGLE> func) { func.accept(asSlice(index)); return this; }
    public long refreshDurationAt(long index) { return (long) VH_refreshDuration.get(this.segment(), 0L, index); }
    public long refreshDuration() { return (long) VH_refreshDuration.get(this.segment(), 0L, 0L); }
    public VkRefreshCycleDurationGOOGLE refreshDurationAt(long index, long value) { VH_refreshDuration.set(this.segment(), 0L, index, value); return this; }
    public VkRefreshCycleDurationGOOGLE refreshDuration(long value) { VH_refreshDuration.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _refreshDurationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_refreshDuration, index), LAYOUT_refreshDuration); }
    public MemorySegment _refreshDuration() { return _refreshDurationAt(0L); }
    public VkRefreshCycleDurationGOOGLE _refreshDurationAt(long index, MemorySegment src) { _refreshDurationAt(index).copyFrom(src); return this; }
    public VkRefreshCycleDurationGOOGLE _refreshDuration(MemorySegment src) { return _refreshDurationAt(0L, src); }
}
