// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.video.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoH265PredictorPaletteEntries`.
/// ## Layout
/// ```
/// struct StdVideoH265PredictorPaletteEntries {
///     uint16_t PredictorPaletteEntries[STD_VIDEO_H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE][STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE];
/// }
/// ```
public final class StdVideoH265PredictorPaletteEntries extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE, MemoryLayout.sequenceLayout(overrungl.vulkan.video.VulkanVideoCodecH265std.STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE, ValueLayout.JAVA_SHORT)).withName("PredictorPaletteEntries")
    );
    public static final long OFFSET_PredictorPaletteEntries = LAYOUT.byteOffset(PathElement.groupElement("PredictorPaletteEntries"));
    public static final MemoryLayout LAYOUT_PredictorPaletteEntries = LAYOUT.select(PathElement.groupElement("PredictorPaletteEntries"));
    public static final VarHandle VH_PredictorPaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("PredictorPaletteEntries"), PathElement.sequenceElement(), PathElement.sequenceElement());

    public StdVideoH265PredictorPaletteEntries(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static StdVideoH265PredictorPaletteEntries of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PredictorPaletteEntries(segment, estimateCount(segment, LAYOUT)); }
    public static StdVideoH265PredictorPaletteEntries ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PredictorPaletteEntries(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static StdVideoH265PredictorPaletteEntries ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoH265PredictorPaletteEntries(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static StdVideoH265PredictorPaletteEntries alloc(SegmentAllocator allocator) { return new StdVideoH265PredictorPaletteEntries(allocator.allocate(LAYOUT), 1); }
    public static StdVideoH265PredictorPaletteEntries alloc(SegmentAllocator allocator, long count) { return new StdVideoH265PredictorPaletteEntries(allocator.allocate(LAYOUT, count), count); }
    public StdVideoH265PredictorPaletteEntries copyFrom(StdVideoH265PredictorPaletteEntries src) { this.segment().copyFrom(src.segment()); return this; }
    public StdVideoH265PredictorPaletteEntries reinterpret(long count) { return new StdVideoH265PredictorPaletteEntries(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public StdVideoH265PredictorPaletteEntries asSlice(long index) { return new StdVideoH265PredictorPaletteEntries(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public StdVideoH265PredictorPaletteEntries asSlice(long index, long count) { return new StdVideoH265PredictorPaletteEntries(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public StdVideoH265PredictorPaletteEntries at(long index, Consumer<StdVideoH265PredictorPaletteEntries> func) { func.accept(asSlice(index)); return this; }
    public short PredictorPaletteEntriesAt(long index, long index0, long index1) { return (short) VH_PredictorPaletteEntries.get(this.segment(), 0L, index, index0, index1); }
    public short PredictorPaletteEntries(long index0, long index1) { return (short) VH_PredictorPaletteEntries.get(this.segment(), 0L, 0L, index0, index1); }
    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntriesAt(long index, long index0, long index1, short value) { VH_PredictorPaletteEntries.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(long index0, long index1, short value) { VH_PredictorPaletteEntries.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public MemorySegment _PredictorPaletteEntriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_PredictorPaletteEntries, index), LAYOUT_PredictorPaletteEntries); }
    public MemorySegment _PredictorPaletteEntries() { return _PredictorPaletteEntriesAt(0L); }
    public StdVideoH265PredictorPaletteEntries _PredictorPaletteEntriesAt(long index, MemorySegment src) { _PredictorPaletteEntriesAt(index).copyFrom(src); return this; }
    public StdVideoH265PredictorPaletteEntries _PredictorPaletteEntries(MemorySegment src) { return _PredictorPaletteEntriesAt(0L, src); }
}
