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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(MemorySegment)]
/// ### RefFrameId
/// [VarHandle][#VH_RefFrameId] - [Getter][#RefFrameId()] - [Setter][#RefFrameId(int)]
/// ### frame_type
/// [VarHandle][#VH_frame_type] - [Getter][#frame_type()] - [Setter][#frame_type(int)]
/// ### OrderHint
/// [VarHandle][#VH_OrderHint] - [Getter][#OrderHint()] - [Setter][#OrderHint(byte)]
/// ### reserved1
/// [VarHandle][#VH_reserved1] - [Getter][#reserved1()] - [Setter][#reserved1(byte)]
/// ### pExtensionHeader
/// [VarHandle][#VH_pExtensionHeader] - [Getter][#pExtensionHeader()] - [Setter][#pExtensionHeader(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoEncodeAV1ReferenceInfo {
///     StdVideoEncodeAV1ReferenceInfoFlags flags;
///     uint32_t RefFrameId;
///     StdVideoAV1FrameType frame_type;
///     uint8_t OrderHint;
///     uint8_t [3] reserved1;
///     const StdVideoEncodeAV1ExtensionHeader * pExtensionHeader;
/// } StdVideoEncodeAV1ReferenceInfo;
/// ```
public sealed class StdVideoEncodeAV1ReferenceInfo extends Struct {
    /// The struct layout of `StdVideoEncodeAV1ReferenceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        StdVideoEncodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("RefFrameId"),
        ValueLayout.JAVA_INT.withName("frame_type"),
        ValueLayout.JAVA_BYTE.withName("OrderHint"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withName("pExtensionHeader")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `RefFrameId` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_RefFrameId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefFrameId"));
    /// The [VarHandle] of `frame_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frame_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_type"));
    /// The [VarHandle] of `OrderHint` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_OrderHint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OrderHint"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `pExtensionHeader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pExtensionHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtensionHeader"));

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    public StdVideoEncodeAV1ReferenceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfo(segment); }

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfo`
    public static StdVideoEncodeAV1ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1ReferenceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfo`
    public static StdVideoEncodeAV1ReferenceInfo allocInit(SegmentAllocator allocator, @CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment flags, @CType("uint32_t") int RefFrameId, @CType("StdVideoAV1FrameType") int frame_type, @CType("uint8_t") byte OrderHint, @CType("uint8_t [3]") byte reserved1, @CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment pExtensionHeader) { return alloc(allocator).flags(flags).RefFrameId(RefFrameId).frame_type(frame_type).OrderHint(OrderHint).reserved1(reserved1).pExtensionHeader(pExtensionHeader); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo copyFrom(StdVideoEncodeAV1ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment get_flags(MemorySegment segment, long index) { return (MemorySegment) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment get_flags(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment flags() { return StdVideoEncodeAV1ReferenceInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment value) { StdVideoEncodeAV1ReferenceInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo flags(@CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment value) { StdVideoEncodeAV1ReferenceInfo.set_flags(this.segment(), value); return this; }

    /// {@return `RefFrameId` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_RefFrameId(MemorySegment segment, long index) { return (int) VH_RefFrameId.get(segment, 0L, index); }
    /// {@return `RefFrameId`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_RefFrameId(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfo.get_RefFrameId(segment, 0L); }
    /// {@return `RefFrameId`}
    public @CType("uint32_t") int RefFrameId() { return StdVideoEncodeAV1ReferenceInfo.get_RefFrameId(this.segment()); }
    /// Sets `RefFrameId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_RefFrameId(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_RefFrameId.set(segment, 0L, index, value); }
    /// Sets `RefFrameId` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_RefFrameId(MemorySegment segment, @CType("uint32_t") int value) { StdVideoEncodeAV1ReferenceInfo.set_RefFrameId(segment, 0L, value); }
    /// Sets `RefFrameId` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo RefFrameId(@CType("uint32_t") int value) { StdVideoEncodeAV1ReferenceInfo.set_RefFrameId(this.segment(), value); return this; }

    /// {@return `frame_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1FrameType") int get_frame_type(MemorySegment segment, long index) { return (int) VH_frame_type.get(segment, 0L, index); }
    /// {@return `frame_type`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1FrameType") int get_frame_type(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfo.get_frame_type(segment, 0L); }
    /// {@return `frame_type`}
    public @CType("StdVideoAV1FrameType") int frame_type() { return StdVideoEncodeAV1ReferenceInfo.get_frame_type(this.segment()); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frame_type(MemorySegment segment, long index, @CType("StdVideoAV1FrameType") int value) { VH_frame_type.set(segment, 0L, index, value); }
    /// Sets `frame_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frame_type(MemorySegment segment, @CType("StdVideoAV1FrameType") int value) { StdVideoEncodeAV1ReferenceInfo.set_frame_type(segment, 0L, value); }
    /// Sets `frame_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo frame_type(@CType("StdVideoAV1FrameType") int value) { StdVideoEncodeAV1ReferenceInfo.set_frame_type(this.segment(), value); return this; }

    /// {@return `OrderHint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_OrderHint(MemorySegment segment, long index) { return (byte) VH_OrderHint.get(segment, 0L, index); }
    /// {@return `OrderHint`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_OrderHint(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfo.get_OrderHint(segment, 0L); }
    /// {@return `OrderHint`}
    public @CType("uint8_t") byte OrderHint() { return StdVideoEncodeAV1ReferenceInfo.get_OrderHint(this.segment()); }
    /// Sets `OrderHint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_OrderHint(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_OrderHint.set(segment, 0L, index, value); }
    /// Sets `OrderHint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_OrderHint(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoEncodeAV1ReferenceInfo.set_OrderHint(segment, 0L, value); }
    /// Sets `OrderHint` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo OrderHint(@CType("uint8_t") byte value) { StdVideoEncodeAV1ReferenceInfo.set_OrderHint(this.segment(), value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [3]") byte get_reserved1(MemorySegment segment, long index) { return (byte) VH_reserved1.get(segment, 0L, index); }
    /// {@return `reserved1`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [3]") byte get_reserved1(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfo.get_reserved1(segment, 0L); }
    /// {@return `reserved1`}
    public @CType("uint8_t [3]") byte reserved1() { return StdVideoEncodeAV1ReferenceInfo.get_reserved1(this.segment()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, long index, @CType("uint8_t [3]") byte value) { VH_reserved1.set(segment, 0L, index, value); }
    /// Sets `reserved1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reserved1(MemorySegment segment, @CType("uint8_t [3]") byte value) { StdVideoEncodeAV1ReferenceInfo.set_reserved1(segment, 0L, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo reserved1(@CType("uint8_t [3]") byte value) { StdVideoEncodeAV1ReferenceInfo.set_reserved1(this.segment(), value); return this; }

    /// {@return `pExtensionHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment get_pExtensionHeader(MemorySegment segment, long index) { return (MemorySegment) VH_pExtensionHeader.get(segment, 0L, index); }
    /// {@return `pExtensionHeader`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment get_pExtensionHeader(MemorySegment segment) { return StdVideoEncodeAV1ReferenceInfo.get_pExtensionHeader(segment, 0L); }
    /// {@return `pExtensionHeader`}
    public @CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment pExtensionHeader() { return StdVideoEncodeAV1ReferenceInfo.get_pExtensionHeader(this.segment()); }
    /// Sets `pExtensionHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pExtensionHeader(MemorySegment segment, long index, @CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment value) { VH_pExtensionHeader.set(segment, 0L, index, value); }
    /// Sets `pExtensionHeader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pExtensionHeader(MemorySegment segment, @CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment value) { StdVideoEncodeAV1ReferenceInfo.set_pExtensionHeader(segment, 0L, value); }
    /// Sets `pExtensionHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo pExtensionHeader(@CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment value) { StdVideoEncodeAV1ReferenceInfo.set_pExtensionHeader(this.segment(), value); return this; }

    /// A buffer of [StdVideoEncodeAV1ReferenceInfo].
    public static final class Buffer extends StdVideoEncodeAV1ReferenceInfo {
        private final long elementCount;

        /// Creates `StdVideoEncodeAV1ReferenceInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoEncodeAV1ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoEncodeAV1ReferenceInfo`
        public StdVideoEncodeAV1ReferenceInfo asSlice(long index) { return new StdVideoEncodeAV1ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoEncodeAV1ReferenceInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoEncodeAV1ReferenceInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment flagsAt(long index) { return StdVideoEncodeAV1ReferenceInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("StdVideoEncodeAV1ReferenceInfoFlags") MemorySegment value) { StdVideoEncodeAV1ReferenceInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `RefFrameId` at the given index}
        /// @param index the index
        public @CType("uint32_t") int RefFrameIdAt(long index) { return StdVideoEncodeAV1ReferenceInfo.get_RefFrameId(this.segment(), index); }
        /// Sets `RefFrameId` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer RefFrameIdAt(long index, @CType("uint32_t") int value) { StdVideoEncodeAV1ReferenceInfo.set_RefFrameId(this.segment(), index, value); return this; }

        /// {@return `frame_type` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1FrameType") int frame_typeAt(long index) { return StdVideoEncodeAV1ReferenceInfo.get_frame_type(this.segment(), index); }
        /// Sets `frame_type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frame_typeAt(long index, @CType("StdVideoAV1FrameType") int value) { StdVideoEncodeAV1ReferenceInfo.set_frame_type(this.segment(), index, value); return this; }

        /// {@return `OrderHint` at the given index}
        /// @param index the index
        public @CType("uint8_t") byte OrderHintAt(long index) { return StdVideoEncodeAV1ReferenceInfo.get_OrderHint(this.segment(), index); }
        /// Sets `OrderHint` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer OrderHintAt(long index, @CType("uint8_t") byte value) { StdVideoEncodeAV1ReferenceInfo.set_OrderHint(this.segment(), index, value); return this; }

        /// {@return `reserved1` at the given index}
        /// @param index the index
        public @CType("uint8_t [3]") byte reserved1At(long index) { return StdVideoEncodeAV1ReferenceInfo.get_reserved1(this.segment(), index); }
        /// Sets `reserved1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reserved1At(long index, @CType("uint8_t [3]") byte value) { StdVideoEncodeAV1ReferenceInfo.set_reserved1(this.segment(), index, value); return this; }

        /// {@return `pExtensionHeader` at the given index}
        /// @param index the index
        public @CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment pExtensionHeaderAt(long index) { return StdVideoEncodeAV1ReferenceInfo.get_pExtensionHeader(this.segment(), index); }
        /// Sets `pExtensionHeader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pExtensionHeaderAt(long index, @CType("const StdVideoEncodeAV1ExtensionHeader *") MemorySegment value) { StdVideoEncodeAV1ReferenceInfo.set_pExtensionHeader(this.segment(), index, value); return this; }

    }
}
