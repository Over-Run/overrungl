// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.google.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentTimeGOOGLE`.
/// ## Layout
/// ```
/// struct VkPresentTimeGOOGLE {
///     uint32_t presentID;
///     uint64_t desiredPresentTime;
/// }
/// ```
public final class VkPresentTimeGOOGLE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime")
    );
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    public static final long OFFSET_desiredPresentTime = LAYOUT.byteOffset(PathElement.groupElement("desiredPresentTime"));
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    public static final MemoryLayout LAYOUT_desiredPresentTime = LAYOUT.select(PathElement.groupElement("desiredPresentTime"));
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    public static final VarHandle VH_desiredPresentTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("desiredPresentTime"));

    public VkPresentTimeGOOGLE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentTimeGOOGLE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimeGOOGLE(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentTimeGOOGLE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimeGOOGLE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentTimeGOOGLE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimeGOOGLE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentTimeGOOGLE alloc(SegmentAllocator allocator) { return new VkPresentTimeGOOGLE(allocator.allocate(LAYOUT), 1); }
    public static VkPresentTimeGOOGLE alloc(SegmentAllocator allocator, long count) { return new VkPresentTimeGOOGLE(allocator.allocate(LAYOUT, count), count); }
    public VkPresentTimeGOOGLE copyFrom(VkPresentTimeGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentTimeGOOGLE reinterpret(long count) { return new VkPresentTimeGOOGLE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentTimeGOOGLE asSlice(long index) { return new VkPresentTimeGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentTimeGOOGLE asSlice(long index, long count) { return new VkPresentTimeGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentTimeGOOGLE at(long index, Consumer<VkPresentTimeGOOGLE> func) { func.accept(asSlice(index)); return this; }
    public int presentIDAt(long index) { return (int) VH_presentID.get(this.segment(), 0L, index); }
    public long desiredPresentTimeAt(long index) { return (long) VH_desiredPresentTime.get(this.segment(), 0L, index); }
    public int presentID() { return (int) VH_presentID.get(this.segment(), 0L, 0L); }
    public long desiredPresentTime() { return (long) VH_desiredPresentTime.get(this.segment(), 0L, 0L); }
    public VkPresentTimeGOOGLE presentIDAt(long index, int value) { VH_presentID.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimeGOOGLE desiredPresentTimeAt(long index, long value) { VH_desiredPresentTime.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimeGOOGLE presentID(int value) { VH_presentID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimeGOOGLE desiredPresentTime(long value) { VH_desiredPresentTime.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _presentIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentID, index), LAYOUT_presentID); }
    public MemorySegment _presentID() { return _presentIDAt(0L); }
    public VkPresentTimeGOOGLE _presentIDAt(long index, MemorySegment src) { _presentIDAt(index).copyFrom(src); return this; }
    public VkPresentTimeGOOGLE _presentID(MemorySegment src) { return _presentIDAt(0L, src); }
    public MemorySegment _desiredPresentTimeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_desiredPresentTime, index), LAYOUT_desiredPresentTime); }
    public MemorySegment _desiredPresentTime() { return _desiredPresentTimeAt(0L); }
    public VkPresentTimeGOOGLE _desiredPresentTimeAt(long index, MemorySegment src) { _desiredPresentTimeAt(index).copyFrom(src); return this; }
    public VkPresentTimeGOOGLE _desiredPresentTime(MemorySegment src) { return _desiredPresentTimeAt(0L, src); }
}
