/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct StdVideoVP9Segmentation {
///     (struct StdVideoVP9SegmentationFlags) StdVideoVP9SegmentationFlags flags;
///     uint8_t segmentation_tree_probs[7];
///     uint8_t segmentation_pred_prob[3];
///     uint8_t FeatureEnabled[8];
///     int16_t FeatureData[8][4];
/// };
/// ```
public final class StdVideoVP9Segmentation extends GroupType {
    /// The struct layout of `StdVideoVP9Segmentation`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoVP9SegmentationFlags.LAYOUT.withName("flags"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_BYTE).withName("segmentation_tree_probs"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_BYTE).withName("segmentation_pred_prob"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("FeatureEnabled"),
        MemoryLayout.sequenceLayout(4, MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_SHORT)).withName("FeatureData")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `segmentation_tree_probs`.
    public static final long OFFSET_segmentation_tree_probs = LAYOUT.byteOffset(PathElement.groupElement("segmentation_tree_probs"));
    /// The memory layout of `segmentation_tree_probs`.
    public static final MemoryLayout LAYOUT_segmentation_tree_probs = LAYOUT.select(PathElement.groupElement("segmentation_tree_probs"));
    /// The [VarHandle] of `segmentation_tree_probs` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_segmentation_tree_probs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("segmentation_tree_probs"), PathElement.sequenceElement());
    /// The byte offset of `segmentation_pred_prob`.
    public static final long OFFSET_segmentation_pred_prob = LAYOUT.byteOffset(PathElement.groupElement("segmentation_pred_prob"));
    /// The memory layout of `segmentation_pred_prob`.
    public static final MemoryLayout LAYOUT_segmentation_pred_prob = LAYOUT.select(PathElement.groupElement("segmentation_pred_prob"));
    /// The [VarHandle] of `segmentation_pred_prob` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_segmentation_pred_prob = LAYOUT.arrayElementVarHandle(PathElement.groupElement("segmentation_pred_prob"), PathElement.sequenceElement());
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

    /// Creates `StdVideoVP9Segmentation` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoVP9Segmentation(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoVP9Segmentation` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9Segmentation of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9Segmentation(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoVP9Segmentation` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9Segmentation ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9Segmentation(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoVP9Segmentation` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9Segmentation ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9Segmentation(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoVP9Segmentation`
    public static StdVideoVP9Segmentation alloc(SegmentAllocator allocator) { return new StdVideoVP9Segmentation(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoVP9Segmentation`
    public static StdVideoVP9Segmentation alloc(SegmentAllocator allocator, long count) { return new StdVideoVP9Segmentation(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoVP9Segmentation copyFrom(StdVideoVP9Segmentation src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoVP9Segmentation reinterpret(long count) { return new StdVideoVP9Segmentation(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment flags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    /// {@return `flags`}
    public MemorySegment flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags.byteSize()); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoVP9Segmentation flags(Consumer<overrungl.vulkan.video.StdVideoVP9SegmentationFlags> func) { func.accept(overrungl.vulkan.video.StdVideoVP9SegmentationFlags.of(flags())); return this; }

    /// {@return `segmentation_tree_probs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment segmentation_tree_probs(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_segmentation_tree_probs, index), LAYOUT_segmentation_tree_probs); }
    /// {@return `segmentation_tree_probs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte segmentation_tree_probs(MemorySegment segment, long index, long index0) { return (byte) VH_segmentation_tree_probs.get(segment, 0L, index, index0); }
    /// {@return `segmentation_tree_probs`}
    public MemorySegment segmentation_tree_probs() { return segmentation_tree_probs(this.segment(), 0L); }
    /// {@return `segmentation_tree_probs`}
    /// @param index0 the Index 0 of the array
    public byte segmentation_tree_probs(long index0) { return segmentation_tree_probs(this.segment(), 0L, index0); }
    /// Sets `segmentation_tree_probs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void segmentation_tree_probs(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_segmentation_tree_probs, index), LAYOUT_segmentation_tree_probs.byteSize()); }
    /// Sets `segmentation_tree_probs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void segmentation_tree_probs(MemorySegment segment, long index, long index0, byte value) { VH_segmentation_tree_probs.set(segment, 0L, index, index0, value); }
    /// Sets `segmentation_tree_probs` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation segmentation_tree_probs(MemorySegment value) { segmentation_tree_probs(this.segment(), 0L, value); return this; }
    /// Sets `segmentation_tree_probs` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation segmentation_tree_probs(long index0, byte value) { segmentation_tree_probs(this.segment(), 0L, index0, value); return this; }

    /// {@return `segmentation_pred_prob` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment segmentation_pred_prob(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_segmentation_pred_prob, index), LAYOUT_segmentation_pred_prob); }
    /// {@return `segmentation_pred_prob` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte segmentation_pred_prob(MemorySegment segment, long index, long index0) { return (byte) VH_segmentation_pred_prob.get(segment, 0L, index, index0); }
    /// {@return `segmentation_pred_prob`}
    public MemorySegment segmentation_pred_prob() { return segmentation_pred_prob(this.segment(), 0L); }
    /// {@return `segmentation_pred_prob`}
    /// @param index0 the Index 0 of the array
    public byte segmentation_pred_prob(long index0) { return segmentation_pred_prob(this.segment(), 0L, index0); }
    /// Sets `segmentation_pred_prob` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void segmentation_pred_prob(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_segmentation_pred_prob, index), LAYOUT_segmentation_pred_prob.byteSize()); }
    /// Sets `segmentation_pred_prob` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void segmentation_pred_prob(MemorySegment segment, long index, long index0, byte value) { VH_segmentation_pred_prob.set(segment, 0L, index, index0, value); }
    /// Sets `segmentation_pred_prob` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation segmentation_pred_prob(MemorySegment value) { segmentation_pred_prob(this.segment(), 0L, value); return this; }
    /// Sets `segmentation_pred_prob` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation segmentation_pred_prob(long index0, byte value) { segmentation_pred_prob(this.segment(), 0L, index0, value); return this; }

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
    public StdVideoVP9Segmentation FeatureEnabled(MemorySegment value) { FeatureEnabled(this.segment(), 0L, value); return this; }
    /// Sets `FeatureEnabled` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation FeatureEnabled(long index0, byte value) { FeatureEnabled(this.segment(), 0L, index0, value); return this; }

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
    public StdVideoVP9Segmentation FeatureData(MemorySegment value) { FeatureData(this.segment(), 0L, value); return this; }
    /// Sets `FeatureData` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation FeatureData(long index0, long index1, short value) { FeatureData(this.segment(), 0L, index0, index1, value); return this; }

    /// Creates a slice of `StdVideoVP9Segmentation`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoVP9Segmentation`
    public StdVideoVP9Segmentation asSlice(long index) { return new StdVideoVP9Segmentation(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoVP9Segmentation`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoVP9Segmentation`
    public StdVideoVP9Segmentation asSlice(long index, long count) { return new StdVideoVP9Segmentation(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoVP9Segmentation` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoVP9Segmentation at(long index, Consumer<StdVideoVP9Segmentation> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoVP9Segmentation flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoVP9SegmentationFlags> func) { func.accept(overrungl.vulkan.video.StdVideoVP9SegmentationFlags.of(flagsAt(index))); return this; }

    /// {@return `segmentation_tree_probs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment segmentation_tree_probsAt(long index) { return segmentation_tree_probs(this.segment(), index); }
    /// {@return `segmentation_tree_probs` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte segmentation_tree_probsAt(long index, long index0) { return segmentation_tree_probs(this.segment(), index, index0); }
    /// Sets `segmentation_tree_probs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation segmentation_tree_probsAt(long index, MemorySegment value) { segmentation_tree_probs(this.segment(), index, value); return this; }
    /// Sets `segmentation_tree_probs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation segmentation_tree_probsAt(long index, long index0, byte value) { segmentation_tree_probs(this.segment(), index, index0, value); return this; }

    /// {@return `segmentation_pred_prob` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment segmentation_pred_probAt(long index) { return segmentation_pred_prob(this.segment(), index); }
    /// {@return `segmentation_pred_prob` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte segmentation_pred_probAt(long index, long index0) { return segmentation_pred_prob(this.segment(), index, index0); }
    /// Sets `segmentation_pred_prob` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation segmentation_pred_probAt(long index, MemorySegment value) { segmentation_pred_prob(this.segment(), index, value); return this; }
    /// Sets `segmentation_pred_prob` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation segmentation_pred_probAt(long index, long index0, byte value) { segmentation_pred_prob(this.segment(), index, index0, value); return this; }

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
    public StdVideoVP9Segmentation FeatureEnabledAt(long index, MemorySegment value) { FeatureEnabled(this.segment(), index, value); return this; }
    /// Sets `FeatureEnabled` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation FeatureEnabledAt(long index, long index0, byte value) { FeatureEnabled(this.segment(), index, index0, value); return this; }

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
    public StdVideoVP9Segmentation FeatureDataAt(long index, MemorySegment value) { FeatureData(this.segment(), index, value); return this; }
    /// Sets `FeatureData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param index1 the Index 1 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoVP9Segmentation FeatureDataAt(long index, long index0, long index1, short value) { FeatureData(this.segment(), index, index0, index1, value); return this; }

}
