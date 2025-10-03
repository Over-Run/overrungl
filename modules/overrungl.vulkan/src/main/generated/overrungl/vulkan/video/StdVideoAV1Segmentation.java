// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoAV1Segmentation`.
/// ## Layout
/// ```
/// struct StdVideoAV1Segmentation {
///     uint8_t FeatureEnabled[8];
///     int16_t FeatureData[8][8];
/// };
/// ```
public final class StdVideoAV1Segmentation extends GroupType {
    /// The struct layout of `StdVideoAV1Segmentation`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("FeatureEnabled"),
        MemoryLayout.sequenceLayout(8, MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_SHORT)).withName("FeatureData")
    );
    /// The byte offset of `FeatureEnabled`.
    public static final long OFFSET_FeatureEnabled = LAYOUT.byteOffset(PathElement.groupElement("FeatureEnabled"));
    /// The memory layout of `FeatureEnabled`.
    public static final MemoryLayout LAYOUT_FeatureEnabled = LAYOUT.select(PathElement.groupElement("FeatureEnabled"));
    /// The [VarHandle] of `FeatureEnabled` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_FeatureEnabled = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FeatureEnabled"), PathElement.sequenceElement());
    /// The byte offset of `FeatureData`.
    public static final long OFFSET_FeatureData = LAYOUT.byteOffset(PathElement.groupElement("FeatureData"));
    /// The memory layout of `FeatureData`.
    public static final MemoryLayout LAYOUT_FeatureData = LAYOUT.select(PathElement.groupElement("FeatureData"));
    /// The [VarHandle] of `FeatureData` of type `(MemorySegment base, long baseOffset, long index, long index0, long index1)MemorySegment`.
    public static final VarHandle VH_FeatureData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("FeatureData"), PathElement.sequenceElement(), PathElement.sequenceElement());

    /// Creates `StdVideoAV1Segmentation` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoAV1Segmentation(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoAV1Segmentation` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Segmentation of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoAV1Segmentation` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Segmentation ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoAV1Segmentation` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1Segmentation ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoAV1Segmentation(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoAV1Segmentation` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1Segmentation`
    public static StdVideoAV1Segmentation alloc(SegmentAllocator allocator) { return new StdVideoAV1Segmentation(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoAV1Segmentation` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1Segmentation`
    public static StdVideoAV1Segmentation alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1Segmentation(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoAV1Segmentation copyFrom(StdVideoAV1Segmentation src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoAV1Segmentation reinterpret(long count) { return new StdVideoAV1Segmentation(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `FeatureEnabled` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment FeatureEnabled(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_FeatureEnabled, index), LAYOUT_FeatureEnabled); }
    /// {@return `FeatureEnabled` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte FeatureEnabled(MemorySegment segment, long index, long index0) { return (byte) VH_FeatureEnabled.get(segment, 0L, index, index0); }
    /// {@return `FeatureEnabled`}
    public MemorySegment FeatureEnabled() { return FeatureEnabled(this.segment(), 0L); }
    /// {@return `FeatureEnabled`}
    /// @param index0 the Index 0 of the array
    public byte FeatureEnabled(long index0) { return FeatureEnabled(this.segment(), 0L, index0); }
    /// Sets `FeatureEnabled` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void FeatureEnabled(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_FeatureEnabled, index), LAYOUT_FeatureEnabled.byteSize()); }
    /// Sets `FeatureEnabled` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void FeatureEnabled(MemorySegment segment, long index, long index0, byte value) { VH_FeatureEnabled.set(segment, 0L, index, index0, value); }
    /// Sets `FeatureEnabled` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureEnabled(MemorySegment value) { FeatureEnabled(this.segment(), 0L, value); return this; }
    /// Sets `FeatureEnabled` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureEnabled(long index0, byte value) { FeatureEnabled(this.segment(), 0L, index0, value); return this; }

    /// {@return `FeatureData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment FeatureData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_FeatureData, index), LAYOUT_FeatureData); }
    /// {@return `FeatureData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public static short FeatureData(MemorySegment segment, long index, long index0, long index1) { return (short) VH_FeatureData.get(segment, 0L, index, index0, index1); }
    /// {@return `FeatureData`}
    public MemorySegment FeatureData() { return FeatureData(this.segment(), 0L); }
    /// {@return `FeatureData`}
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    public short FeatureData(long index0, long index1) { return FeatureData(this.segment(), 0L, index0, index1); }
    /// Sets `FeatureData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void FeatureData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_FeatureData, index), LAYOUT_FeatureData.byteSize()); }
    /// Sets `FeatureData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    public static void FeatureData(MemorySegment segment, long index, long index0, long index1, short value) { VH_FeatureData.set(segment, 0L, index, index0, index1, value); }
    /// Sets `FeatureData` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureData(MemorySegment value) { FeatureData(this.segment(), 0L, value); return this; }
    /// Sets `FeatureData` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureData(long index0, long index1, short value) { FeatureData(this.segment(), 0L, index0, index1, value); return this; }

    /// Creates a slice of `StdVideoAV1Segmentation`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1Segmentation`
    public StdVideoAV1Segmentation asSlice(long index) { return new StdVideoAV1Segmentation(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoAV1Segmentation`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1Segmentation`
    public StdVideoAV1Segmentation asSlice(long index, long count) { return new StdVideoAV1Segmentation(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoAV1Segmentation` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoAV1Segmentation at(long index, Consumer<StdVideoAV1Segmentation> func) { func.accept(asSlice(index)); return this; }

    /// {@return `FeatureEnabled` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment FeatureEnabledAt(long index) { return FeatureEnabled(this.segment(), index); }
    /// {@return `FeatureEnabled` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte FeatureEnabledAt(long index, long index0) { return FeatureEnabled(this.segment(), index, index0); }
    /// Sets `FeatureEnabled` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureEnabledAt(long index, MemorySegment value) { FeatureEnabled(this.segment(), index, value); return this; }
    /// Sets `FeatureEnabled` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureEnabledAt(long index, long index0, byte value) { FeatureEnabled(this.segment(), index, index0, value); return this; }

    /// {@return `FeatureData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment FeatureDataAt(long index) { return FeatureData(this.segment(), index); }
    /// {@return `FeatureData` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
        public short FeatureDataAt(long index, long index0, long index1) { return FeatureData(this.segment(), index, index0, index1); }
    /// Sets `FeatureData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureDataAt(long index, MemorySegment value) { FeatureData(this.segment(), index, value); return this; }
    /// Sets `FeatureData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoAV1Segmentation FeatureDataAt(long index, long index0, long index1, short value) { FeatureData(this.segment(), index, index0, index1, value); return this; }

}
