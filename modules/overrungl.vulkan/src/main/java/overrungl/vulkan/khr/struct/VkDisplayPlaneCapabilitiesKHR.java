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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### supportedAlpha
/// [VarHandle][#VH_supportedAlpha] - [Getter][#supportedAlpha()] - [Setter][#supportedAlpha(int)]
/// ### minSrcPosition
/// [Byte offset][#OFFSET_minSrcPosition] - [Memory layout][#ML_minSrcPosition] - [Getter][#minSrcPosition()] - [Setter][#minSrcPosition(java.lang.foreign.MemorySegment)]
/// ### maxSrcPosition
/// [Byte offset][#OFFSET_maxSrcPosition] - [Memory layout][#ML_maxSrcPosition] - [Getter][#maxSrcPosition()] - [Setter][#maxSrcPosition(java.lang.foreign.MemorySegment)]
/// ### minSrcExtent
/// [Byte offset][#OFFSET_minSrcExtent] - [Memory layout][#ML_minSrcExtent] - [Getter][#minSrcExtent()] - [Setter][#minSrcExtent(java.lang.foreign.MemorySegment)]
/// ### maxSrcExtent
/// [Byte offset][#OFFSET_maxSrcExtent] - [Memory layout][#ML_maxSrcExtent] - [Getter][#maxSrcExtent()] - [Setter][#maxSrcExtent(java.lang.foreign.MemorySegment)]
/// ### minDstPosition
/// [Byte offset][#OFFSET_minDstPosition] - [Memory layout][#ML_minDstPosition] - [Getter][#minDstPosition()] - [Setter][#minDstPosition(java.lang.foreign.MemorySegment)]
/// ### maxDstPosition
/// [Byte offset][#OFFSET_maxDstPosition] - [Memory layout][#ML_maxDstPosition] - [Getter][#maxDstPosition()] - [Setter][#maxDstPosition(java.lang.foreign.MemorySegment)]
/// ### minDstExtent
/// [Byte offset][#OFFSET_minDstExtent] - [Memory layout][#ML_minDstExtent] - [Getter][#minDstExtent()] - [Setter][#minDstExtent(java.lang.foreign.MemorySegment)]
/// ### maxDstExtent
/// [Byte offset][#OFFSET_maxDstExtent] - [Memory layout][#ML_maxDstExtent] - [Getter][#maxDstExtent()] - [Setter][#maxDstExtent(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayPlaneCapabilitiesKHR {
///     VkDisplayPlaneAlphaFlagsKHR supportedAlpha;
///     VkOffset2D minSrcPosition;
///     VkOffset2D maxSrcPosition;
///     VkExtent2D minSrcExtent;
///     VkExtent2D maxSrcExtent;
///     VkOffset2D minDstPosition;
///     VkOffset2D maxDstPosition;
///     VkExtent2D minDstExtent;
///     VkExtent2D maxDstExtent;
/// } VkDisplayPlaneCapabilitiesKHR;
/// ```
public sealed class VkDisplayPlaneCapabilitiesKHR extends Struct {
    /// The struct layout of `VkDisplayPlaneCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("supportedAlpha"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("minSrcPosition"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("maxSrcPosition"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minSrcExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxSrcExtent"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("minDstPosition"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("maxDstPosition"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minDstExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxDstExtent")
    );
    /// The [VarHandle] of `supportedAlpha` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedAlpha"));
    /// The byte offset of `minSrcPosition`.
    public static final long OFFSET_minSrcPosition = LAYOUT.byteOffset(PathElement.groupElement("minSrcPosition"));
    /// The memory layout of `minSrcPosition`.
    public static final MemoryLayout ML_minSrcPosition = LAYOUT.select(PathElement.groupElement("minSrcPosition"));
    /// The byte offset of `maxSrcPosition`.
    public static final long OFFSET_maxSrcPosition = LAYOUT.byteOffset(PathElement.groupElement("maxSrcPosition"));
    /// The memory layout of `maxSrcPosition`.
    public static final MemoryLayout ML_maxSrcPosition = LAYOUT.select(PathElement.groupElement("maxSrcPosition"));
    /// The byte offset of `minSrcExtent`.
    public static final long OFFSET_minSrcExtent = LAYOUT.byteOffset(PathElement.groupElement("minSrcExtent"));
    /// The memory layout of `minSrcExtent`.
    public static final MemoryLayout ML_minSrcExtent = LAYOUT.select(PathElement.groupElement("minSrcExtent"));
    /// The byte offset of `maxSrcExtent`.
    public static final long OFFSET_maxSrcExtent = LAYOUT.byteOffset(PathElement.groupElement("maxSrcExtent"));
    /// The memory layout of `maxSrcExtent`.
    public static final MemoryLayout ML_maxSrcExtent = LAYOUT.select(PathElement.groupElement("maxSrcExtent"));
    /// The byte offset of `minDstPosition`.
    public static final long OFFSET_minDstPosition = LAYOUT.byteOffset(PathElement.groupElement("minDstPosition"));
    /// The memory layout of `minDstPosition`.
    public static final MemoryLayout ML_minDstPosition = LAYOUT.select(PathElement.groupElement("minDstPosition"));
    /// The byte offset of `maxDstPosition`.
    public static final long OFFSET_maxDstPosition = LAYOUT.byteOffset(PathElement.groupElement("maxDstPosition"));
    /// The memory layout of `maxDstPosition`.
    public static final MemoryLayout ML_maxDstPosition = LAYOUT.select(PathElement.groupElement("maxDstPosition"));
    /// The byte offset of `minDstExtent`.
    public static final long OFFSET_minDstExtent = LAYOUT.byteOffset(PathElement.groupElement("minDstExtent"));
    /// The memory layout of `minDstExtent`.
    public static final MemoryLayout ML_minDstExtent = LAYOUT.select(PathElement.groupElement("minDstExtent"));
    /// The byte offset of `maxDstExtent`.
    public static final long OFFSET_maxDstExtent = LAYOUT.byteOffset(PathElement.groupElement("maxDstExtent"));
    /// The memory layout of `maxDstExtent`.
    public static final MemoryLayout ML_maxDstExtent = LAYOUT.select(PathElement.groupElement("maxDstExtent"));

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPlaneCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneCapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilitiesKHR(segment); }

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneCapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDisplayPlaneCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlaneCapabilitiesKHR`
    public static VkDisplayPlaneCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPlaneCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPlaneCapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayPlaneCapabilitiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlaneCapabilitiesKHR`
    public static VkDisplayPlaneCapabilitiesKHR allocInit(SegmentAllocator allocator, @CType("VkDisplayPlaneAlphaFlagsKHR") int supportedAlpha, @CType("VkOffset2D") java.lang.foreign.MemorySegment minSrcPosition, @CType("VkOffset2D") java.lang.foreign.MemorySegment maxSrcPosition, @CType("VkExtent2D") java.lang.foreign.MemorySegment minSrcExtent, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxSrcExtent, @CType("VkOffset2D") java.lang.foreign.MemorySegment minDstPosition, @CType("VkOffset2D") java.lang.foreign.MemorySegment maxDstPosition, @CType("VkExtent2D") java.lang.foreign.MemorySegment minDstExtent, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxDstExtent) { return alloc(allocator).supportedAlpha(supportedAlpha).minSrcPosition(minSrcPosition).maxSrcPosition(maxSrcPosition).minSrcExtent(minSrcExtent).maxSrcExtent(maxSrcExtent).minDstPosition(minDstPosition).maxDstPosition(maxDstPosition).minDstExtent(minDstExtent).maxDstExtent(maxDstExtent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR copyFrom(VkDisplayPlaneCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `supportedAlpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayPlaneAlphaFlagsKHR") int get_supportedAlpha(MemorySegment segment, long index) { return (int) VH_supportedAlpha.get(segment, 0L, index); }
    /// {@return `supportedAlpha`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayPlaneAlphaFlagsKHR") int get_supportedAlpha(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_supportedAlpha(segment, 0L); }
    /// {@return `supportedAlpha`}
    public @CType("VkDisplayPlaneAlphaFlagsKHR") int supportedAlpha() { return VkDisplayPlaneCapabilitiesKHR.get_supportedAlpha(this.segment()); }
    /// Sets `supportedAlpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedAlpha(MemorySegment segment, long index, @CType("VkDisplayPlaneAlphaFlagsKHR") int value) { VH_supportedAlpha.set(segment, 0L, index, value); }
    /// Sets `supportedAlpha` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedAlpha(MemorySegment segment, @CType("VkDisplayPlaneAlphaFlagsKHR") int value) { VkDisplayPlaneCapabilitiesKHR.set_supportedAlpha(segment, 0L, value); }
    /// Sets `supportedAlpha` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR supportedAlpha(@CType("VkDisplayPlaneAlphaFlagsKHR") int value) { VkDisplayPlaneCapabilitiesKHR.set_supportedAlpha(this.segment(), value); return this; }

    /// {@return `minSrcPosition` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_minSrcPosition(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minSrcPosition, index), ML_minSrcPosition); }
    /// {@return `minSrcPosition`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_minSrcPosition(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_minSrcPosition(segment, 0L); }
    /// {@return `minSrcPosition`}
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment minSrcPosition() { return VkDisplayPlaneCapabilitiesKHR.get_minSrcPosition(this.segment()); }
    /// Sets `minSrcPosition` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSrcPosition(MemorySegment segment, long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minSrcPosition, index), ML_minSrcPosition.byteSize()); }
    /// Sets `minSrcPosition` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSrcPosition(MemorySegment segment, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minSrcPosition(segment, 0L, value); }
    /// Sets `minSrcPosition` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition(@CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minSrcPosition(this.segment(), value); return this; }

    /// {@return `maxSrcPosition` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_maxSrcPosition(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxSrcPosition, index), ML_maxSrcPosition); }
    /// {@return `maxSrcPosition`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_maxSrcPosition(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_maxSrcPosition(segment, 0L); }
    /// {@return `maxSrcPosition`}
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment maxSrcPosition() { return VkDisplayPlaneCapabilitiesKHR.get_maxSrcPosition(this.segment()); }
    /// Sets `maxSrcPosition` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSrcPosition(MemorySegment segment, long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxSrcPosition, index), ML_maxSrcPosition.byteSize()); }
    /// Sets `maxSrcPosition` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSrcPosition(MemorySegment segment, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxSrcPosition(segment, 0L, value); }
    /// Sets `maxSrcPosition` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition(@CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxSrcPosition(this.segment(), value); return this; }

    /// {@return `minSrcExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minSrcExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minSrcExtent, index), ML_minSrcExtent); }
    /// {@return `minSrcExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minSrcExtent(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_minSrcExtent(segment, 0L); }
    /// {@return `minSrcExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minSrcExtent() { return VkDisplayPlaneCapabilitiesKHR.get_minSrcExtent(this.segment()); }
    /// Sets `minSrcExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSrcExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minSrcExtent, index), ML_minSrcExtent.byteSize()); }
    /// Sets `minSrcExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSrcExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minSrcExtent(segment, 0L, value); }
    /// Sets `minSrcExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minSrcExtent(this.segment(), value); return this; }

    /// {@return `maxSrcExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxSrcExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxSrcExtent, index), ML_maxSrcExtent); }
    /// {@return `maxSrcExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxSrcExtent(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_maxSrcExtent(segment, 0L); }
    /// {@return `maxSrcExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxSrcExtent() { return VkDisplayPlaneCapabilitiesKHR.get_maxSrcExtent(this.segment()); }
    /// Sets `maxSrcExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSrcExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxSrcExtent, index), ML_maxSrcExtent.byteSize()); }
    /// Sets `maxSrcExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSrcExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxSrcExtent(segment, 0L, value); }
    /// Sets `maxSrcExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxSrcExtent(this.segment(), value); return this; }

    /// {@return `minDstPosition` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_minDstPosition(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minDstPosition, index), ML_minDstPosition); }
    /// {@return `minDstPosition`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_minDstPosition(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_minDstPosition(segment, 0L); }
    /// {@return `minDstPosition`}
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment minDstPosition() { return VkDisplayPlaneCapabilitiesKHR.get_minDstPosition(this.segment()); }
    /// Sets `minDstPosition` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minDstPosition(MemorySegment segment, long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minDstPosition, index), ML_minDstPosition.byteSize()); }
    /// Sets `minDstPosition` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minDstPosition(MemorySegment segment, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minDstPosition(segment, 0L, value); }
    /// Sets `minDstPosition` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstPosition(@CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minDstPosition(this.segment(), value); return this; }

    /// {@return `maxDstPosition` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_maxDstPosition(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxDstPosition, index), ML_maxDstPosition); }
    /// {@return `maxDstPosition`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_maxDstPosition(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_maxDstPosition(segment, 0L); }
    /// {@return `maxDstPosition`}
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment maxDstPosition() { return VkDisplayPlaneCapabilitiesKHR.get_maxDstPosition(this.segment()); }
    /// Sets `maxDstPosition` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDstPosition(MemorySegment segment, long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxDstPosition, index), ML_maxDstPosition.byteSize()); }
    /// Sets `maxDstPosition` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDstPosition(MemorySegment segment, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxDstPosition(segment, 0L, value); }
    /// Sets `maxDstPosition` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition(@CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxDstPosition(this.segment(), value); return this; }

    /// {@return `minDstExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minDstExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minDstExtent, index), ML_minDstExtent); }
    /// {@return `minDstExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minDstExtent(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_minDstExtent(segment, 0L); }
    /// {@return `minDstExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minDstExtent() { return VkDisplayPlaneCapabilitiesKHR.get_minDstExtent(this.segment()); }
    /// Sets `minDstExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minDstExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minDstExtent, index), ML_minDstExtent.byteSize()); }
    /// Sets `minDstExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minDstExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minDstExtent(segment, 0L, value); }
    /// Sets `minDstExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minDstExtent(this.segment(), value); return this; }

    /// {@return `maxDstExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxDstExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxDstExtent, index), ML_maxDstExtent); }
    /// {@return `maxDstExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxDstExtent(MemorySegment segment) { return VkDisplayPlaneCapabilitiesKHR.get_maxDstExtent(segment, 0L); }
    /// {@return `maxDstExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxDstExtent() { return VkDisplayPlaneCapabilitiesKHR.get_maxDstExtent(this.segment()); }
    /// Sets `maxDstExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDstExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxDstExtent, index), ML_maxDstExtent.byteSize()); }
    /// Sets `maxDstExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDstExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxDstExtent(segment, 0L, value); }
    /// Sets `maxDstExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxDstExtent(this.segment(), value); return this; }

    /// A buffer of [VkDisplayPlaneCapabilitiesKHR].
    public static final class Buffer extends VkDisplayPlaneCapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkDisplayPlaneCapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayPlaneCapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayPlaneCapabilitiesKHR`
        public VkDisplayPlaneCapabilitiesKHR asSlice(long index) { return new VkDisplayPlaneCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayPlaneCapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayPlaneCapabilitiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `supportedAlpha` at the given index}
        /// @param index the index
        public @CType("VkDisplayPlaneAlphaFlagsKHR") int supportedAlphaAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_supportedAlpha(this.segment(), index); }
        /// Sets `supportedAlpha` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supportedAlphaAt(long index, @CType("VkDisplayPlaneAlphaFlagsKHR") int value) { VkDisplayPlaneCapabilitiesKHR.set_supportedAlpha(this.segment(), index, value); return this; }

        /// {@return `minSrcPosition` at the given index}
        /// @param index the index
        public @CType("VkOffset2D") java.lang.foreign.MemorySegment minSrcPositionAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_minSrcPosition(this.segment(), index); }
        /// Sets `minSrcPosition` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minSrcPositionAt(long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minSrcPosition(this.segment(), index, value); return this; }

        /// {@return `maxSrcPosition` at the given index}
        /// @param index the index
        public @CType("VkOffset2D") java.lang.foreign.MemorySegment maxSrcPositionAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_maxSrcPosition(this.segment(), index); }
        /// Sets `maxSrcPosition` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSrcPositionAt(long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxSrcPosition(this.segment(), index, value); return this; }

        /// {@return `minSrcExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment minSrcExtentAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_minSrcExtent(this.segment(), index); }
        /// Sets `minSrcExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minSrcExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minSrcExtent(this.segment(), index, value); return this; }

        /// {@return `maxSrcExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxSrcExtentAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_maxSrcExtent(this.segment(), index); }
        /// Sets `maxSrcExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSrcExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxSrcExtent(this.segment(), index, value); return this; }

        /// {@return `minDstPosition` at the given index}
        /// @param index the index
        public @CType("VkOffset2D") java.lang.foreign.MemorySegment minDstPositionAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_minDstPosition(this.segment(), index); }
        /// Sets `minDstPosition` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minDstPositionAt(long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minDstPosition(this.segment(), index, value); return this; }

        /// {@return `maxDstPosition` at the given index}
        /// @param index the index
        public @CType("VkOffset2D") java.lang.foreign.MemorySegment maxDstPositionAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_maxDstPosition(this.segment(), index); }
        /// Sets `maxDstPosition` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDstPositionAt(long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxDstPosition(this.segment(), index, value); return this; }

        /// {@return `minDstExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment minDstExtentAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_minDstExtent(this.segment(), index); }
        /// Sets `minDstExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minDstExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_minDstExtent(this.segment(), index, value); return this; }

        /// {@return `maxDstExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxDstExtentAt(long index) { return VkDisplayPlaneCapabilitiesKHR.get_maxDstExtent(this.segment(), index); }
        /// Sets `maxDstExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDstExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPlaneCapabilitiesKHR.set_maxDstExtent(this.segment(), index, value); return this; }

    }
}
