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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `StdVideoEncodeAV1ReferenceInfo`.
/// ## Layout
/// ```
/// struct StdVideoEncodeAV1ReferenceInfo {
///     (struct StdVideoEncodeAV1ReferenceInfoFlags) StdVideoEncodeAV1ReferenceInfoFlags flags;
///     uint32_t RefFrameId;
///     (int) StdVideoAV1FrameType frame_type;
///     uint8_t OrderHint;
///     uint8_t reserved1[3];
///     const StdVideoEncodeAV1ExtensionHeader* pExtensionHeader;
/// };
/// ```
public final class StdVideoEncodeAV1ReferenceInfo extends GroupType {
    /// The struct layout of `StdVideoEncodeAV1ReferenceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("RefFrameId"),
        ValueLayout.JAVA_INT.withName("frame_type"),
        ValueLayout.JAVA_BYTE.withName("OrderHint"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_BYTE).withName("reserved1"),
        ValueLayout.ADDRESS.withName("pExtensionHeader")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The byte offset of `RefFrameId`.
    public static final long OFFSET_RefFrameId = LAYOUT.byteOffset(PathElement.groupElement("RefFrameId"));
    /// The memory layout of `RefFrameId`.
    public static final MemoryLayout LAYOUT_RefFrameId = LAYOUT.select(PathElement.groupElement("RefFrameId"));
    /// The [VarHandle] of `RefFrameId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_RefFrameId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("RefFrameId"));
    /// The byte offset of `frame_type`.
    public static final long OFFSET_frame_type = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
    /// The memory layout of `frame_type`.
    public static final MemoryLayout LAYOUT_frame_type = LAYOUT.select(PathElement.groupElement("frame_type"));
    /// The [VarHandle] of `frame_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frame_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frame_type"));
    /// The byte offset of `OrderHint`.
    public static final long OFFSET_OrderHint = LAYOUT.byteOffset(PathElement.groupElement("OrderHint"));
    /// The memory layout of `OrderHint`.
    public static final MemoryLayout LAYOUT_OrderHint = LAYOUT.select(PathElement.groupElement("OrderHint"));
    /// The [VarHandle] of `OrderHint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_OrderHint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OrderHint"));
    /// The byte offset of `reserved1`.
    public static final long OFFSET_reserved1 = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
    /// The memory layout of `reserved1`.
    public static final MemoryLayout LAYOUT_reserved1 = LAYOUT.select(PathElement.groupElement("reserved1"));
    /// The [VarHandle] of `reserved1` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_reserved1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
    /// The byte offset of `pExtensionHeader`.
    public static final long OFFSET_pExtensionHeader = LAYOUT.byteOffset(PathElement.groupElement("pExtensionHeader"));
    /// The memory layout of `pExtensionHeader`.
    public static final MemoryLayout LAYOUT_pExtensionHeader = LAYOUT.select(PathElement.groupElement("pExtensionHeader"));
    /// The [VarHandle] of `pExtensionHeader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pExtensionHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtensionHeader"));

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public StdVideoEncodeAV1ReferenceInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `StdVideoEncodeAV1ReferenceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoEncodeAV1ReferenceInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new StdVideoEncodeAV1ReferenceInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfo`
    public static StdVideoEncodeAV1ReferenceInfo alloc(SegmentAllocator allocator) { return new StdVideoEncodeAV1ReferenceInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `StdVideoEncodeAV1ReferenceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoEncodeAV1ReferenceInfo`
    public static StdVideoEncodeAV1ReferenceInfo alloc(SegmentAllocator allocator, long count) { return new StdVideoEncodeAV1ReferenceInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo copyFrom(StdVideoEncodeAV1ReferenceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public StdVideoEncodeAV1ReferenceInfo reinterpret(long count) { return new StdVideoEncodeAV1ReferenceInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public StdVideoEncodeAV1ReferenceInfo flags(MemorySegment value) { flags(this.segment(), 0L, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo flags(Consumer<overrungl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags.of(flags())); return this; }

    /// {@return `RefFrameId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int RefFrameId(MemorySegment segment, long index) { return (int) VH_RefFrameId.get(segment, 0L, index); }
    /// {@return `RefFrameId`}
    public int RefFrameId() { return RefFrameId(this.segment(), 0L); }
    /// Sets `RefFrameId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void RefFrameId(MemorySegment segment, long index, int value) { VH_RefFrameId.set(segment, 0L, index, value); }
    /// Sets `RefFrameId` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo RefFrameId(int value) { RefFrameId(this.segment(), 0L, value); return this; }

    /// {@return `frame_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frame_type(MemorySegment segment, long index) { return (int) VH_frame_type.get(segment, 0L, index); }
    /// {@return `frame_type`}
    public int frame_type() { return frame_type(this.segment(), 0L); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frame_type(MemorySegment segment, long index, int value) { VH_frame_type.set(segment, 0L, index, value); }
    /// Sets `frame_type` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo frame_type(int value) { frame_type(this.segment(), 0L, value); return this; }

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
    public StdVideoEncodeAV1ReferenceInfo OrderHint(byte value) { OrderHint(this.segment(), 0L, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment reserved1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1); }
    /// {@return `reserved1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte reserved1(MemorySegment segment, long index, long index0) { return (byte) VH_reserved1.get(segment, 0L, index, index0); }
    /// {@return `reserved1`}
    public MemorySegment reserved1() { return reserved1(this.segment(), 0L); }
    /// {@return `reserved1`}
    /// @param index0 the Index 0 of the array
    public byte reserved1(long index0) { return reserved1(this.segment(), 0L, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_reserved1, index), LAYOUT_reserved1.byteSize()); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void reserved1(MemorySegment segment, long index, long index0, byte value) { VH_reserved1.set(segment, 0L, index, index0, value); }
    /// Sets `reserved1` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo reserved1(MemorySegment value) { reserved1(this.segment(), 0L, value); return this; }
    /// Sets `reserved1` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo reserved1(long index0, byte value) { reserved1(this.segment(), 0L, index0, value); return this; }

    /// {@return `pExtensionHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pExtensionHeader(MemorySegment segment, long index) { return (MemorySegment) VH_pExtensionHeader.get(segment, 0L, index); }
    /// {@return `pExtensionHeader`}
    public MemorySegment pExtensionHeader() { return pExtensionHeader(this.segment(), 0L); }
    /// Sets `pExtensionHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pExtensionHeader(MemorySegment segment, long index, MemorySegment value) { VH_pExtensionHeader.set(segment, 0L, index, value); }
    /// Sets `pExtensionHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo pExtensionHeader(MemorySegment value) { pExtensionHeader(this.segment(), 0L, value); return this; }

    /// Creates a slice of `StdVideoEncodeAV1ReferenceInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoEncodeAV1ReferenceInfo`
    public StdVideoEncodeAV1ReferenceInfo asSlice(long index) { return new StdVideoEncodeAV1ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `StdVideoEncodeAV1ReferenceInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoEncodeAV1ReferenceInfo`
    public StdVideoEncodeAV1ReferenceInfo asSlice(long index, long count) { return new StdVideoEncodeAV1ReferenceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `StdVideoEncodeAV1ReferenceInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo at(long index, Consumer<StdVideoEncodeAV1ReferenceInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo flagsAt(long index, MemorySegment value) { flags(this.segment(), index, value); return this; }
    /// Accepts `flags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo flagsAt(long index, Consumer<overrungl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags> func) { func.accept(overrungl.vulkan.video.StdVideoEncodeAV1ReferenceInfoFlags.of(flagsAt(index))); return this; }

    /// {@return `RefFrameId` at the given index}
    /// @param index the index of the struct buffer
    public int RefFrameIdAt(long index) { return RefFrameId(this.segment(), index); }
    /// Sets `RefFrameId` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo RefFrameIdAt(long index, int value) { RefFrameId(this.segment(), index, value); return this; }

    /// {@return `frame_type` at the given index}
    /// @param index the index of the struct buffer
    public int frame_typeAt(long index) { return frame_type(this.segment(), index); }
    /// Sets `frame_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo frame_typeAt(long index, int value) { frame_type(this.segment(), index, value); return this; }

    /// {@return `OrderHint` at the given index}
    /// @param index the index of the struct buffer
    public byte OrderHintAt(long index) { return OrderHint(this.segment(), index); }
    /// Sets `OrderHint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo OrderHintAt(long index, byte value) { OrderHint(this.segment(), index, value); return this; }

    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment reserved1At(long index) { return reserved1(this.segment(), index); }
    /// {@return `reserved1` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte reserved1At(long index, long index0) { return reserved1(this.segment(), index, index0); }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo reserved1At(long index, MemorySegment value) { reserved1(this.segment(), index, value); return this; }
    /// Sets `reserved1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo reserved1At(long index, long index0, byte value) { reserved1(this.segment(), index, index0, value); return this; }

    /// {@return `pExtensionHeader` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pExtensionHeaderAt(long index) { return pExtensionHeader(this.segment(), index); }
    /// Sets `pExtensionHeader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public StdVideoEncodeAV1ReferenceInfo pExtensionHeaderAt(long index, MemorySegment value) { pExtensionHeader(this.segment(), index, value); return this; }

}
