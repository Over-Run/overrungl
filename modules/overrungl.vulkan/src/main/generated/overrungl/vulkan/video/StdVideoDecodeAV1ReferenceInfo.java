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
/// struct StdVideoDecodeAV1ReferenceInfo {
///     (struct StdVideoDecodeAV1ReferenceInfoFlags) StdVideoDecodeAV1ReferenceInfoFlags flags;
///     uint8_t frame_type;
///     uint8_t RefFrameSignBias;
///     uint8_t OrderHint;
///     uint8_t SavedOrderHints[8];
/// };
/// ```
public final class StdVideoDecodeAV1ReferenceInfo extends GroupType {
    /// The struct layout of `StdVideoDecodeAV1ReferenceInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoDecodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("frame_type"),
        ValueLayout.JAVA_BYTE.withName("RefFrameSignBias"),
        ValueLayout.JAVA_BYTE.withName("OrderHint"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("SavedOrderHints")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `frame_type`.
    public static final long OFFSET_frame_type = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
    /// The memory layout of `frame_type`.
    public static final MemoryLayout LAYOUT_frame_type = LAYOUT.select(PathElement.groupElement("frame_type"));
    /// The [VarHandle] of `frame_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_type"));
    /// The byte offset of `RefFrameSignBias`.
    public static final long OFFSET_RefFrameSignBias = LAYOUT.byteOffset(PathElement.groupElement("RefFrameSignBias"));
    /// The memory layout of `RefFrameSignBias`.
    public static final MemoryLayout LAYOUT_RefFrameSignBias = LAYOUT.select(PathElement.groupElement("RefFrameSignBias"));
    /// The [VarHandle] of `RefFrameSignBias` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_RefFrameSignBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefFrameSignBias"));
    /// The byte offset of `OrderHint`.
    public static final long OFFSET_OrderHint = LAYOUT.byteOffset(PathElement.groupElement("OrderHint"));
    /// The memory layout of `OrderHint`.
    public static final MemoryLayout LAYOUT_OrderHint = LAYOUT.select(PathElement.groupElement("OrderHint"));
    /// The [VarHandle] of `OrderHint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_OrderHint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OrderHint"));
    /// The byte offset of `SavedOrderHints`.
    public static final long OFFSET_SavedOrderHints = LAYOUT.byteOffset(PathElement.groupElement("SavedOrderHints"));
    /// The memory layout of `SavedOrderHints`.
    public static final MemoryLayout LAYOUT_SavedOrderHints = LAYOUT.select(PathElement.groupElement("SavedOrderHints"));
    /// The [VarHandle] of `SavedOrderHints` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_SavedOrderHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("SavedOrderHints"), PathElement.sequenceElement());

    /// Creates `StdVideoDecodeAV1ReferenceInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoDecodeAV1ReferenceInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoDecodeAV1ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoDecodeAV1ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoDecodeAV1ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeAV1ReferenceInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoDecodeAV1ReferenceInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoDecodeAV1ReferenceInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeAV1ReferenceInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param RefFrameSignBias `RefFrameSignBias`
    /// @param OrderHint `OrderHint`
    /// @param SavedOrderHints `SavedOrderHints`
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte frame_type, byte RefFrameSignBias, byte OrderHint, MemorySegment SavedOrderHints) {
        return alloc(allocator).flags(flags).frame_type(frame_type).RefFrameSignBias(RefFrameSignBias).OrderHint(OrderHint).SavedOrderHints(SavedOrderHints);
    }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param RefFrameSignBias `RefFrameSignBias`
    /// @param OrderHint `OrderHint`
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte frame_type, byte RefFrameSignBias, byte OrderHint) {
        return alloc(allocator).flags(flags).frame_type(frame_type).RefFrameSignBias(RefFrameSignBias).OrderHint(OrderHint);
    }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @param RefFrameSignBias `RefFrameSignBias`
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte frame_type, byte RefFrameSignBias) {
        return alloc(allocator).flags(flags).frame_type(frame_type).RefFrameSignBias(RefFrameSignBias);
    }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @param frame_type `frame_type`
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo allocInit(SegmentAllocator allocator, MemorySegment flags, byte frame_type) {
        return alloc(allocator).flags(flags).frame_type(frame_type);
    }

    /// Allocates a `StdVideoDecodeAV1ReferenceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param flags `flags`
    /// @return the allocated `StdVideoDecodeAV1ReferenceInfo`
    public static StdVideoDecodeAV1ReferenceInfo allocInit(SegmentAllocator allocator, MemorySegment flags) {
        return alloc(allocator).flags(flags);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo copyFrom(StdVideoDecodeAV1ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoDecodeAV1ReferenceInfo reinterpret(long count) { return new StdVideoDecodeAV1ReferenceInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoDecodeAV1ReferenceInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo flags(Consumer<overrungl.vulkan.video.StdVideoDecodeAV1ReferenceInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoDecodeAV1ReferenceInfoFlags.of(flags())); return this; }

    /// {@return `frame_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte frame_type(MemorySegment segment, long index) { return (byte) VH_frame_type.get(segment, 0L, index); }
    /// {@return `frame_type`}
    public byte frame_type() { return frame_type(this.segment(), 0L); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_type(MemorySegment segment, long index, byte value) { VH_frame_type.set(segment, 0L, index, value); }
    /// Sets `frame_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo frame_type(byte value) { frame_type(this.segment(), 0L, value); return this; }

    /// {@return `RefFrameSignBias` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte RefFrameSignBias(MemorySegment segment, long index) { return (byte) VH_RefFrameSignBias.get(segment, 0L, index); }
    /// {@return `RefFrameSignBias`}
    public byte RefFrameSignBias() { return RefFrameSignBias(this.segment(), 0L); }
    /// Sets `RefFrameSignBias` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void RefFrameSignBias(MemorySegment segment, long index, byte value) { VH_RefFrameSignBias.set(segment, 0L, index, value); }
    /// Sets `RefFrameSignBias` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo RefFrameSignBias(byte value) { RefFrameSignBias(this.segment(), 0L, value); return this; }

    /// {@return `OrderHint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte OrderHint(MemorySegment segment, long index) { return (byte) VH_OrderHint.get(segment, 0L, index); }
    /// {@return `OrderHint`}
    public byte OrderHint() { return OrderHint(this.segment(), 0L); }
    /// Sets `OrderHint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void OrderHint(MemorySegment segment, long index, byte value) { VH_OrderHint.set(segment, 0L, index, value); }
    /// Sets `OrderHint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo OrderHint(byte value) { OrderHint(this.segment(), 0L, value); return this; }

    /// {@return `SavedOrderHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment SavedOrderHints(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_SavedOrderHints, index), LAYOUT_SavedOrderHints); }
    /// {@return `SavedOrderHints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte SavedOrderHints(MemorySegment segment, long index, long index0) { return (byte) VH_SavedOrderHints.get(segment, 0L, index, index0); }
    /// {@return `SavedOrderHints`}
    public MemorySegment SavedOrderHints() { return SavedOrderHints(this.segment(), 0L); }
    /// {@return `SavedOrderHints`}
    /// @param index0 the Index 0 of the array
    public byte SavedOrderHints(long index0) { return SavedOrderHints(this.segment(), 0L, index0); }
    /// Sets `SavedOrderHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void SavedOrderHints(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_SavedOrderHints, index), LAYOUT_SavedOrderHints.byteSize()); }
    /// Sets `SavedOrderHints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void SavedOrderHints(MemorySegment segment, long index, long index0, byte value) { VH_SavedOrderHints.set(segment, 0L, index, index0, value); }
    /// Sets `SavedOrderHints` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo SavedOrderHints(MemorySegment value) { SavedOrderHints(this.segment(), 0L, value); return this; }
    /// Sets `SavedOrderHints` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo SavedOrderHints(long index0, byte value) { SavedOrderHints(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `StdVideoDecodeAV1ReferenceInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoDecodeAV1ReferenceInfo`
    public StdVideoDecodeAV1ReferenceInfo asSlice(long index) { return new StdVideoDecodeAV1ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoDecodeAV1ReferenceInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoDecodeAV1ReferenceInfo`
    public StdVideoDecodeAV1ReferenceInfo asSlice(long index, long count) { return new StdVideoDecodeAV1ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoDecodeAV1ReferenceInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo at(long index, Consumer<StdVideoDecodeAV1ReferenceInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoDecodeAV1ReferenceInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoDecodeAV1ReferenceInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `frame_type` at the given index}
    /// @param index the index of the struct buffer
    public byte frame_typeAt(long index) { return frame_type(this.segment(), index); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo frame_typeAt(long index, byte value) { frame_type(this.segment(), index, value); return this; }

    /// {@return `RefFrameSignBias` at the given index}
    /// @param index the index of the struct buffer
    public byte RefFrameSignBiasAt(long index) { return RefFrameSignBias(this.segment(), index); }
    /// Sets `RefFrameSignBias` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo RefFrameSignBiasAt(long index, byte value) { RefFrameSignBias(this.segment(), index, value); return this; }

    /// {@return `OrderHint` at the given index}
    /// @param index the index of the struct buffer
    public byte OrderHintAt(long index) { return OrderHint(this.segment(), index); }
    /// Sets `OrderHint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo OrderHintAt(long index, byte value) { OrderHint(this.segment(), index, value); return this; }

    /// {@return `SavedOrderHints` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment SavedOrderHintsAt(long index) { return SavedOrderHints(this.segment(), index); }
    /// {@return `SavedOrderHints` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte SavedOrderHintsAt(long index, long index0) { return SavedOrderHints(this.segment(), index, index0); }
    /// Sets `SavedOrderHints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo SavedOrderHintsAt(long index, MemorySegment value) { SavedOrderHints(this.segment(), index, value); return this; }
    /// Sets `SavedOrderHints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeAV1ReferenceInfo SavedOrderHintsAt(long index, long index0, byte value) { SavedOrderHints(this.segment(), index, index0, value); return this; }

}
