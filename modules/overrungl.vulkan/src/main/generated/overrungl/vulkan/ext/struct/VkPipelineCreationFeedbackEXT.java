// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCreationFeedbackEXT`.
/// ## Layout
/// ```
/// struct VkPipelineCreationFeedbackEXT {
///     VkPipelineCreationFeedbackFlags flags;
///     uint64_t duration;
/// }
/// ```
public final class VkPipelineCreationFeedbackEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("duration")
    );
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_duration = LAYOUT.byteOffset(PathElement.groupElement("duration"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_duration = LAYOUT.select(PathElement.groupElement("duration"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_duration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("duration"));

    public VkPipelineCreationFeedbackEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCreationFeedbackEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCreationFeedbackEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCreationFeedbackEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCreationFeedbackEXT alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedbackEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCreationFeedbackEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineCreationFeedbackEXT(allocator.allocate(LAYOUT, count), count); }
    public VkPipelineCreationFeedbackEXT copyFrom(VkPipelineCreationFeedbackEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCreationFeedbackEXT reinterpret(long count) { return new VkPipelineCreationFeedbackEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCreationFeedbackEXT asSlice(long index) { return new VkPipelineCreationFeedbackEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCreationFeedbackEXT asSlice(long index, long count) { return new VkPipelineCreationFeedbackEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCreationFeedbackEXT at(long index, Consumer<VkPipelineCreationFeedbackEXT> func) { func.accept(asSlice(index)); return this; }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long durationAt(long index) { return (long) VH_duration.get(this.segment(), 0L, index); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long duration() { return (long) VH_duration.get(this.segment(), 0L, 0L); }
    public VkPipelineCreationFeedbackEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedbackEXT durationAt(long index, long value) { VH_duration.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedbackEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCreationFeedbackEXT duration(long value) { VH_duration.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineCreationFeedbackEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedbackEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _durationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_duration, index), LAYOUT_duration); }
    public MemorySegment _duration() { return _durationAt(0L); }
    public VkPipelineCreationFeedbackEXT _durationAt(long index, MemorySegment src) { _durationAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedbackEXT _duration(MemorySegment src) { return _durationAt(0L, src); }
}
