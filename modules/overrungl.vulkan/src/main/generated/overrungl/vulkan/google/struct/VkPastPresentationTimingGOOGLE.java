// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.google.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPastPresentationTimingGOOGLE`.
/// ## Layout
/// ```
/// struct VkPastPresentationTimingGOOGLE {
///     uint32_t presentID;
///     uint64_t desiredPresentTime;
///     uint64_t actualPresentTime;
///     uint64_t earliestPresentTime;
///     uint64_t presentMargin;
/// }
/// ```
public final class VkPastPresentationTimingGOOGLE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime"),
        ValueLayout.JAVA_LONG.withName("actualPresentTime"),
        ValueLayout.JAVA_LONG.withName("earliestPresentTime"),
        ValueLayout.JAVA_LONG.withName("presentMargin")
    );
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    public static final long OFFSET_desiredPresentTime = LAYOUT.byteOffset(PathElement.groupElement("desiredPresentTime"));
    public static final long OFFSET_actualPresentTime = LAYOUT.byteOffset(PathElement.groupElement("actualPresentTime"));
    public static final long OFFSET_earliestPresentTime = LAYOUT.byteOffset(PathElement.groupElement("earliestPresentTime"));
    public static final long OFFSET_presentMargin = LAYOUT.byteOffset(PathElement.groupElement("presentMargin"));
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    public static final MemoryLayout LAYOUT_desiredPresentTime = LAYOUT.select(PathElement.groupElement("desiredPresentTime"));
    public static final MemoryLayout LAYOUT_actualPresentTime = LAYOUT.select(PathElement.groupElement("actualPresentTime"));
    public static final MemoryLayout LAYOUT_earliestPresentTime = LAYOUT.select(PathElement.groupElement("earliestPresentTime"));
    public static final MemoryLayout LAYOUT_presentMargin = LAYOUT.select(PathElement.groupElement("presentMargin"));
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    public static final VarHandle VH_desiredPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("desiredPresentTime"));
    public static final VarHandle VH_actualPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("actualPresentTime"));
    public static final VarHandle VH_earliestPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earliestPresentTime"));
    public static final VarHandle VH_presentMargin = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMargin"));

    public VkPastPresentationTimingGOOGLE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPastPresentationTimingGOOGLE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingGOOGLE(segment, estimateCount(segment, LAYOUT)); }
    public static VkPastPresentationTimingGOOGLE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingGOOGLE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPastPresentationTimingGOOGLE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingGOOGLE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPastPresentationTimingGOOGLE alloc(SegmentAllocator allocator) { return new VkPastPresentationTimingGOOGLE(allocator.allocate(LAYOUT), 1); }
    public static VkPastPresentationTimingGOOGLE alloc(SegmentAllocator allocator, long count) { return new VkPastPresentationTimingGOOGLE(allocator.allocate(LAYOUT, count), count); }
    public VkPastPresentationTimingGOOGLE copyFrom(VkPastPresentationTimingGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPastPresentationTimingGOOGLE reinterpret(long count) { return new VkPastPresentationTimingGOOGLE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPastPresentationTimingGOOGLE asSlice(long index) { return new VkPastPresentationTimingGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPastPresentationTimingGOOGLE asSlice(long index, long count) { return new VkPastPresentationTimingGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPastPresentationTimingGOOGLE at(long index, Consumer<VkPastPresentationTimingGOOGLE> func) { func.accept(asSlice(index)); return this; }
    public int presentIDAt(long index) { return (int) VH_presentID.get(this.segment(), 0L, index); }
    public long desiredPresentTimeAt(long index) { return (long) VH_desiredPresentTime.get(this.segment(), 0L, index); }
    public long actualPresentTimeAt(long index) { return (long) VH_actualPresentTime.get(this.segment(), 0L, index); }
    public long earliestPresentTimeAt(long index) { return (long) VH_earliestPresentTime.get(this.segment(), 0L, index); }
    public long presentMarginAt(long index) { return (long) VH_presentMargin.get(this.segment(), 0L, index); }
    public int presentID() { return (int) VH_presentID.get(this.segment(), 0L, 0L); }
    public long desiredPresentTime() { return (long) VH_desiredPresentTime.get(this.segment(), 0L, 0L); }
    public long actualPresentTime() { return (long) VH_actualPresentTime.get(this.segment(), 0L, 0L); }
    public long earliestPresentTime() { return (long) VH_earliestPresentTime.get(this.segment(), 0L, 0L); }
    public long presentMargin() { return (long) VH_presentMargin.get(this.segment(), 0L, 0L); }
    public VkPastPresentationTimingGOOGLE presentIDAt(long index, int value) { VH_presentID.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingGOOGLE desiredPresentTimeAt(long index, long value) { VH_desiredPresentTime.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingGOOGLE actualPresentTimeAt(long index, long value) { VH_actualPresentTime.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingGOOGLE earliestPresentTimeAt(long index, long value) { VH_earliestPresentTime.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingGOOGLE presentMarginAt(long index, long value) { VH_presentMargin.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingGOOGLE presentID(int value) { VH_presentID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingGOOGLE desiredPresentTime(long value) { VH_desiredPresentTime.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingGOOGLE actualPresentTime(long value) { VH_actualPresentTime.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingGOOGLE earliestPresentTime(long value) { VH_earliestPresentTime.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingGOOGLE presentMargin(long value) { VH_presentMargin.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _presentIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentID, index), LAYOUT_presentID); }
    public MemorySegment _presentID() { return _presentIDAt(0L); }
    public VkPastPresentationTimingGOOGLE _presentIDAt(long index, MemorySegment src) { _presentIDAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingGOOGLE _presentID(MemorySegment src) { return _presentIDAt(0L, src); }
    public MemorySegment _desiredPresentTimeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_desiredPresentTime, index), LAYOUT_desiredPresentTime); }
    public MemorySegment _desiredPresentTime() { return _desiredPresentTimeAt(0L); }
    public VkPastPresentationTimingGOOGLE _desiredPresentTimeAt(long index, MemorySegment src) { _desiredPresentTimeAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingGOOGLE _desiredPresentTime(MemorySegment src) { return _desiredPresentTimeAt(0L, src); }
    public MemorySegment _actualPresentTimeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_actualPresentTime, index), LAYOUT_actualPresentTime); }
    public MemorySegment _actualPresentTime() { return _actualPresentTimeAt(0L); }
    public VkPastPresentationTimingGOOGLE _actualPresentTimeAt(long index, MemorySegment src) { _actualPresentTimeAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingGOOGLE _actualPresentTime(MemorySegment src) { return _actualPresentTimeAt(0L, src); }
    public MemorySegment _earliestPresentTimeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_earliestPresentTime, index), LAYOUT_earliestPresentTime); }
    public MemorySegment _earliestPresentTime() { return _earliestPresentTimeAt(0L); }
    public VkPastPresentationTimingGOOGLE _earliestPresentTimeAt(long index, MemorySegment src) { _earliestPresentTimeAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingGOOGLE _earliestPresentTime(MemorySegment src) { return _earliestPresentTimeAt(0L, src); }
    public MemorySegment _presentMarginAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentMargin, index), LAYOUT_presentMargin); }
    public MemorySegment _presentMargin() { return _presentMarginAt(0L); }
    public VkPastPresentationTimingGOOGLE _presentMarginAt(long index, MemorySegment src) { _presentMarginAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingGOOGLE _presentMargin(MemorySegment src) { return _presentMarginAt(0L, src); }
}
