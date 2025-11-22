// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSetStateFlagsIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkSetStateFlagsIndirectCommandNV {
///     uint32_t data;
/// }
/// ```
public final class VkSetStateFlagsIndirectCommandNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("data")
    );
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    public static final VarHandle VH_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"));

    public VkSetStateFlagsIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSetStateFlagsIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetStateFlagsIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkSetStateFlagsIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetStateFlagsIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSetStateFlagsIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetStateFlagsIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSetStateFlagsIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkSetStateFlagsIndirectCommandNV(allocator.allocate(LAYOUT), 1); }
    public static VkSetStateFlagsIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkSetStateFlagsIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }
    public VkSetStateFlagsIndirectCommandNV copyFrom(VkSetStateFlagsIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSetStateFlagsIndirectCommandNV reinterpret(long count) { return new VkSetStateFlagsIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSetStateFlagsIndirectCommandNV asSlice(long index) { return new VkSetStateFlagsIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSetStateFlagsIndirectCommandNV asSlice(long index, long count) { return new VkSetStateFlagsIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSetStateFlagsIndirectCommandNV at(long index, Consumer<VkSetStateFlagsIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }
    public int dataAt(long index) { return (int) VH_data.get(this.segment(), 0L, index); }
    public int data() { return (int) VH_data.get(this.segment(), 0L, 0L); }
    public VkSetStateFlagsIndirectCommandNV dataAt(long index, int value) { VH_data.set(this.segment(), 0L, index, value); return this; }
    public VkSetStateFlagsIndirectCommandNV data(int value) { VH_data.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _dataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    public MemorySegment _data() { return _dataAt(0L); }
    public VkSetStateFlagsIndirectCommandNV _dataAt(long index, MemorySegment src) { _dataAt(index).copyFrom(src); return this; }
    public VkSetStateFlagsIndirectCommandNV _data(MemorySegment src) { return _dataAt(0L, src); }
}
