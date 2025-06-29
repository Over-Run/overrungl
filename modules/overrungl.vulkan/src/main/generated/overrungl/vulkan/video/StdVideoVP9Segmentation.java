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
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

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
public sealed class StdVideoVP9Segmentation extends GroupType {
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
    /// @param segment the memory segment
    public StdVideoVP9Segmentation(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoVP9Segmentation` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoVP9Segmentation` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoVP9Segmentation ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoVP9Segmentation(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `StdVideoVP9Segmentation` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoVP9Segmentation`
    public static StdVideoVP9Segmentation alloc(SegmentAllocator allocator) { return new StdVideoVP9Segmentation(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoVP9Segmentation`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param segmentation_tree_probs `segmentation_tree_probs`
    /// @param segmentation_pred_prob `segmentation_pred_prob`
    /// @param FeatureEnabled `FeatureEnabled`
    /// @param FeatureData `FeatureData`
    /// @return the allocated `StdVideoVP9Segmentation`
    public static StdVideoVP9Segmentation allocInit(SegmentAllocator allocator, MemorySegment flags, MemorySegment segmentation_tree_probs, MemorySegment segmentation_pred_prob, MemorySegment FeatureEnabled, MemorySegment FeatureData) {
        return alloc(allocator).flags(flags).segmentation_tree_probs(segmentation_tree_probs).segmentation_pred_prob(segmentation_pred_prob).FeatureEnabled(FeatureEnabled).FeatureData(FeatureData);
    }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param segmentation_tree_probs `segmentation_tree_probs`
    /// @param segmentation_pred_prob `segmentation_pred_prob`
    /// @param FeatureEnabled `FeatureEnabled`
    /// @return the allocated `StdVideoVP9Segmentation`
    public static StdVideoVP9Segmentation allocInit(SegmentAllocator allocator, MemorySegment flags, MemorySegment segmentation_tree_probs, MemorySegment segmentation_pred_prob, MemorySegment FeatureEnabled) {
        return alloc(allocator).flags(flags).segmentation_tree_probs(segmentation_tree_probs).segmentation_pred_prob(segmentation_pred_prob).FeatureEnabled(FeatureEnabled);
    }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param segmentation_tree_probs `segmentation_tree_probs`
    /// @param segmentation_pred_prob `segmentation_pred_prob`
    /// @return the allocated `StdVideoVP9Segmentation`
    public static StdVideoVP9Segmentation allocInit(SegmentAllocator allocator, MemorySegment flags, MemorySegment segmentation_tree_probs, MemorySegment segmentation_pred_prob) {
        return alloc(allocator).flags(flags).segmentation_tree_probs(segmentation_tree_probs).segmentation_pred_prob(segmentation_pred_prob);
    }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param segmentation_tree_probs `segmentation_tree_probs`
    /// @return the allocated `StdVideoVP9Segmentation`
    public static StdVideoVP9Segmentation allocInit(SegmentAllocator allocator, MemorySegment flags, MemorySegment segmentation_tree_probs) {
        return alloc(allocator).flags(flags).segmentation_tree_probs(segmentation_tree_probs);
    }

    /// Allocates a `StdVideoVP9Segmentation` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoVP9Segmentation`
    public static StdVideoVP9Segmentation allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoVP9Segmentation copyFrom(StdVideoVP9Segmentation src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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

    /// A buffer of [StdVideoVP9Segmentation].
    public static final class Buffer extends StdVideoVP9Segmentation {
        private final long elementCount;

        /// Creates `StdVideoVP9Segmentation.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoVP9Segmentation`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoVP9Segmentation`
        public StdVideoVP9Segmentation asSlice(long index) { return new StdVideoVP9Segmentation(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoVP9Segmentation`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoVP9Segmentation`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
        /// Accepts `flags` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoVP9SegmentationFlags> func) { func.accept(overrungl.vulkan.video.StdVideoVP9SegmentationFlags.of(flagsAt(index))); return this; }

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
        public Buffer segmentation_tree_probsAt(long index, MemorySegment value) { segmentation_tree_probs(this.segment(), index, value); return this; }
        /// Sets `segmentation_tree_probs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer segmentation_tree_probsAt(long index, long index0, byte value) { segmentation_tree_probs(this.segment(), index, index0, value); return this; }

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
        public Buffer segmentation_pred_probAt(long index, MemorySegment value) { segmentation_pred_prob(this.segment(), index, value); return this; }
        /// Sets `segmentation_pred_prob` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer segmentation_pred_probAt(long index, long index0, byte value) { segmentation_pred_prob(this.segment(), index, index0, value); return this; }

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
        public Buffer FeatureEnabledAt(long index, MemorySegment value) { FeatureEnabled(this.segment(), index, value); return this; }
        /// Sets `FeatureEnabled` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer FeatureEnabledAt(long index, long index0, byte value) { FeatureEnabled(this.segment(), index, index0, value); return this; }

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
        public Buffer FeatureDataAt(long index, MemorySegment value) { FeatureData(this.segment(), index, value); return this; }
        /// Sets `FeatureData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param index1 the Index 1 of the array
        /// @param value the value
        /// @return `this`
        public Buffer FeatureDataAt(long index, long index0, long index1, short value) { FeatureData(this.segment(), index, index0, index1, value); return this; }

    }
}
