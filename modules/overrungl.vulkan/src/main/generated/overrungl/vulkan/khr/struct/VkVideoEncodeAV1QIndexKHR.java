// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1QIndexKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1QIndexKHR {
///     uint32_t intraQIndex;
///     uint32_t predictiveQIndex;
///     uint32_t bipredictiveQIndex;
/// }
/// ```
public final class VkVideoEncodeAV1QIndexKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("intraQIndex"),
        ValueLayout.JAVA_INT.withName("predictiveQIndex"),
        ValueLayout.JAVA_INT.withName("bipredictiveQIndex")
    );
    public static final long OFFSET_intraQIndex = LAYOUT.byteOffset(PathElement.groupElement("intraQIndex"));
    public static final long OFFSET_predictiveQIndex = LAYOUT.byteOffset(PathElement.groupElement("predictiveQIndex"));
    public static final long OFFSET_bipredictiveQIndex = LAYOUT.byteOffset(PathElement.groupElement("bipredictiveQIndex"));
    public static final MemoryLayout LAYOUT_intraQIndex = LAYOUT.select(PathElement.groupElement("intraQIndex"));
    public static final MemoryLayout LAYOUT_predictiveQIndex = LAYOUT.select(PathElement.groupElement("predictiveQIndex"));
    public static final MemoryLayout LAYOUT_bipredictiveQIndex = LAYOUT.select(PathElement.groupElement("bipredictiveQIndex"));
    public static final VarHandle VH_intraQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraQIndex"));
    public static final VarHandle VH_predictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictiveQIndex"));
    public static final VarHandle VH_bipredictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bipredictiveQIndex"));

    public VkVideoEncodeAV1QIndexKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1QIndexKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QIndexKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1QIndexKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QIndexKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1QIndexKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QIndexKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1QIndexKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QIndexKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1QIndexKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1QIndexKHR(allocator.allocate(LAYOUT, count), count); }
    public VkVideoEncodeAV1QIndexKHR copyFrom(VkVideoEncodeAV1QIndexKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1QIndexKHR reinterpret(long count) { return new VkVideoEncodeAV1QIndexKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1QIndexKHR asSlice(long index) { return new VkVideoEncodeAV1QIndexKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1QIndexKHR asSlice(long index, long count) { return new VkVideoEncodeAV1QIndexKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1QIndexKHR at(long index, Consumer<VkVideoEncodeAV1QIndexKHR> func) { func.accept(asSlice(index)); return this; }
    public int intraQIndexAt(long index) { return (int) VH_intraQIndex.get(this.segment(), 0L, index); }
    public int predictiveQIndexAt(long index) { return (int) VH_predictiveQIndex.get(this.segment(), 0L, index); }
    public int bipredictiveQIndexAt(long index) { return (int) VH_bipredictiveQIndex.get(this.segment(), 0L, index); }
    public int intraQIndex() { return (int) VH_intraQIndex.get(this.segment(), 0L, 0L); }
    public int predictiveQIndex() { return (int) VH_predictiveQIndex.get(this.segment(), 0L, 0L); }
    public int bipredictiveQIndex() { return (int) VH_bipredictiveQIndex.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1QIndexKHR intraQIndexAt(long index, int value) { VH_intraQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QIndexKHR predictiveQIndexAt(long index, int value) { VH_predictiveQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QIndexKHR bipredictiveQIndexAt(long index, int value) { VH_bipredictiveQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QIndexKHR intraQIndex(int value) { VH_intraQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QIndexKHR predictiveQIndex(int value) { VH_predictiveQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QIndexKHR bipredictiveQIndex(int value) { VH_bipredictiveQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _intraQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_intraQIndex, index), LAYOUT_intraQIndex); }
    public MemorySegment _intraQIndex() { return _intraQIndexAt(0L); }
    public VkVideoEncodeAV1QIndexKHR _intraQIndexAt(long index, MemorySegment src) { _intraQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QIndexKHR _intraQIndex(MemorySegment src) { return _intraQIndexAt(0L, src); }
    public MemorySegment _predictiveQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_predictiveQIndex, index), LAYOUT_predictiveQIndex); }
    public MemorySegment _predictiveQIndex() { return _predictiveQIndexAt(0L); }
    public VkVideoEncodeAV1QIndexKHR _predictiveQIndexAt(long index, MemorySegment src) { _predictiveQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QIndexKHR _predictiveQIndex(MemorySegment src) { return _predictiveQIndexAt(0L, src); }
    public MemorySegment _bipredictiveQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bipredictiveQIndex, index), LAYOUT_bipredictiveQIndex); }
    public MemorySegment _bipredictiveQIndex() { return _bipredictiveQIndexAt(0L); }
    public VkVideoEncodeAV1QIndexKHR _bipredictiveQIndexAt(long index, MemorySegment src) { _bipredictiveQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QIndexKHR _bipredictiveQIndex(MemorySegment src) { return _bipredictiveQIndexAt(0L, src); }
}
