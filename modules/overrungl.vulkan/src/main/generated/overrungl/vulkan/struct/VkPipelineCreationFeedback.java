// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCreationFeedback`.
/// ## Layout
/// ```
/// struct VkPipelineCreationFeedback {
///     VkPipelineCreationFeedbackFlags flags;
///     uint64_t duration;
/// }
/// ```
public final class VkPipelineCreationFeedback extends GroupType {
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

    public VkPipelineCreationFeedback(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCreationFeedback of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedback(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCreationFeedback ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedback(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCreationFeedback ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedback(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCreationFeedback alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedback(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCreationFeedback alloc(SegmentAllocator allocator, long count) { return new VkPipelineCreationFeedback(allocator.allocate(LAYOUT, count), count); }
    public VkPipelineCreationFeedback copyFrom(VkPipelineCreationFeedback src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCreationFeedback reinterpret(long count) { return new VkPipelineCreationFeedback(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCreationFeedback asSlice(long index) { return new VkPipelineCreationFeedback(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCreationFeedback asSlice(long index, long count) { return new VkPipelineCreationFeedback(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCreationFeedback at(long index, Consumer<VkPipelineCreationFeedback> func) { func.accept(asSlice(index)); return this; }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long durationAt(long index) { return (long) VH_duration.get(this.segment(), 0L, index); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long duration() { return (long) VH_duration.get(this.segment(), 0L, 0L); }
    public VkPipelineCreationFeedback flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedback durationAt(long index, long value) { VH_duration.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCreationFeedback flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCreationFeedback duration(long value) { VH_duration.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineCreationFeedback _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedback _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _durationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_duration, index), LAYOUT_duration); }
    public MemorySegment _duration() { return _durationAt(0L); }
    public VkPipelineCreationFeedback _durationAt(long index, MemorySegment src) { _durationAt(index).copyFrom(src); return this; }
    public VkPipelineCreationFeedback _duration(MemorySegment src) { return _durationAt(0L, src); }
}
