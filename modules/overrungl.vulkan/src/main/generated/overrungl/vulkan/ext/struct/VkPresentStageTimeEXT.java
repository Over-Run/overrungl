// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentStageTimeEXT`.
/// ## Layout
/// ```
/// struct VkPresentStageTimeEXT {
///     VkPresentStageFlagsEXT stage;
///     uint64_t time;
/// }
/// ```
public final class VkPresentStageTimeEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("time")
    );
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    public static final long OFFSET_time = LAYOUT.byteOffset(PathElement.groupElement("time"));
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    public static final MemoryLayout LAYOUT_time = LAYOUT.select(PathElement.groupElement("time"));
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    public static final VarHandle VH_time = LAYOUT.arrayElementVarHandle(PathElement.groupElement("time"));

    public VkPresentStageTimeEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentStageTimeEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentStageTimeEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentStageTimeEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentStageTimeEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentStageTimeEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentStageTimeEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentStageTimeEXT alloc(SegmentAllocator allocator) { return new VkPresentStageTimeEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPresentStageTimeEXT alloc(SegmentAllocator allocator, long count) { return new VkPresentStageTimeEXT(allocator.allocate(LAYOUT, count), count); }
    public VkPresentStageTimeEXT copyFrom(VkPresentStageTimeEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentStageTimeEXT reinterpret(long count) { return new VkPresentStageTimeEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentStageTimeEXT asSlice(long index) { return new VkPresentStageTimeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentStageTimeEXT asSlice(long index, long count) { return new VkPresentStageTimeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentStageTimeEXT at(long index, Consumer<VkPresentStageTimeEXT> func) { func.accept(asSlice(index)); return this; }
    public int stageAt(long index) { return (int) VH_stage.get(this.segment(), 0L, index); }
    public long timeAt(long index) { return (long) VH_time.get(this.segment(), 0L, index); }
    public int stage() { return (int) VH_stage.get(this.segment(), 0L, 0L); }
    public long time() { return (long) VH_time.get(this.segment(), 0L, 0L); }
    public VkPresentStageTimeEXT stageAt(long index, int value) { VH_stage.set(this.segment(), 0L, index, value); return this; }
    public VkPresentStageTimeEXT timeAt(long index, long value) { VH_time.set(this.segment(), 0L, index, value); return this; }
    public VkPresentStageTimeEXT stage(int value) { VH_stage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentStageTimeEXT time(long value) { VH_time.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _stageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage); }
    public MemorySegment _stage() { return _stageAt(0L); }
    public VkPresentStageTimeEXT _stageAt(long index, MemorySegment src) { _stageAt(index).copyFrom(src); return this; }
    public VkPresentStageTimeEXT _stage(MemorySegment src) { return _stageAt(0L, src); }
    public MemorySegment _timeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_time, index), LAYOUT_time); }
    public MemorySegment _time() { return _timeAt(0L); }
    public VkPresentStageTimeEXT _timeAt(long index, MemorySegment src) { _timeAt(index).copyFrom(src); return this; }
    public VkPresentStageTimeEXT _time(MemorySegment src) { return _timeAt(0L, src); }
}
