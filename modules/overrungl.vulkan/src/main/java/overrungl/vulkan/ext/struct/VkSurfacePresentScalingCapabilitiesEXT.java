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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### supportedPresentScaling
/// [VarHandle][#VH_supportedPresentScaling] - [Getter][#supportedPresentScaling()] - [Setter][#supportedPresentScaling(int)]
/// ### supportedPresentGravityX
/// [VarHandle][#VH_supportedPresentGravityX] - [Getter][#supportedPresentGravityX()] - [Setter][#supportedPresentGravityX(int)]
/// ### supportedPresentGravityY
/// [VarHandle][#VH_supportedPresentGravityY] - [Getter][#supportedPresentGravityY()] - [Setter][#supportedPresentGravityY(int)]
/// ### minScaledImageExtent
/// [Byte offset][#OFFSET_minScaledImageExtent] - [Memory layout][#ML_minScaledImageExtent] - [Getter][#minScaledImageExtent()] - [Setter][#minScaledImageExtent(java.lang.foreign.MemorySegment)]
/// ### maxScaledImageExtent
/// [Byte offset][#OFFSET_maxScaledImageExtent] - [Memory layout][#ML_maxScaledImageExtent] - [Getter][#maxScaledImageExtent()] - [Setter][#maxScaledImageExtent(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSurfacePresentScalingCapabilitiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkPresentScalingFlagsEXT supportedPresentScaling;
///     VkPresentGravityFlagsEXT supportedPresentGravityX;
///     VkPresentGravityFlagsEXT supportedPresentGravityY;
///     VkExtent2D minScaledImageExtent;
///     VkExtent2D maxScaledImageExtent;
/// } VkSurfacePresentScalingCapabilitiesEXT;
/// ```
public sealed class VkSurfacePresentScalingCapabilitiesEXT extends Struct {
    /// The struct layout of `VkSurfacePresentScalingCapabilitiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedPresentScaling"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityX"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityY"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minScaledImageExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxScaledImageExtent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `supportedPresentScaling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedPresentScaling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentScaling"));
    /// The [VarHandle] of `supportedPresentGravityX` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedPresentGravityX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentGravityX"));
    /// The [VarHandle] of `supportedPresentGravityY` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedPresentGravityY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentGravityY"));
    /// The byte offset of `minScaledImageExtent`.
    public static final long OFFSET_minScaledImageExtent = LAYOUT.byteOffset(PathElement.groupElement("minScaledImageExtent"));
    /// The memory layout of `minScaledImageExtent`.
    public static final MemoryLayout ML_minScaledImageExtent = LAYOUT.select(PathElement.groupElement("minScaledImageExtent"));
    /// The byte offset of `maxScaledImageExtent`.
    public static final long OFFSET_maxScaledImageExtent = LAYOUT.byteOffset(PathElement.groupElement("maxScaledImageExtent"));
    /// The memory layout of `maxScaledImageExtent`.
    public static final MemoryLayout ML_maxScaledImageExtent = LAYOUT.select(PathElement.groupElement("maxScaledImageExtent"));

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkSurfacePresentScalingCapabilitiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentScalingCapabilitiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfacePresentScalingCapabilitiesEXT(segment); }

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentScalingCapabilitiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfacePresentScalingCapabilitiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT alloc(SegmentAllocator allocator) { return new VkSurfacePresentScalingCapabilitiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkPresentScalingFlagsEXT") int supportedPresentScaling, @CType("VkPresentGravityFlagsEXT") int supportedPresentGravityX, @CType("VkPresentGravityFlagsEXT") int supportedPresentGravityY, @CType("VkExtent2D") java.lang.foreign.MemorySegment minScaledImageExtent, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxScaledImageExtent) { return alloc(allocator).sType(sType).pNext(pNext).supportedPresentScaling(supportedPresentScaling).supportedPresentGravityX(supportedPresentGravityX).supportedPresentGravityY(supportedPresentGravityY).minScaledImageExtent(minScaledImageExtent).maxScaledImageExtent(maxScaledImageExtent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT copyFrom(VkSurfacePresentScalingCapabilitiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSurfacePresentScalingCapabilitiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSurfacePresentScalingCapabilitiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT sType(@CType("VkStructureType") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSurfacePresentScalingCapabilitiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSurfacePresentScalingCapabilitiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `supportedPresentScaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentScalingFlagsEXT") int get_supportedPresentScaling(MemorySegment segment, long index) { return (int) VH_supportedPresentScaling.get(segment, 0L, index); }
    /// {@return `supportedPresentScaling`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentScalingFlagsEXT") int get_supportedPresentScaling(MemorySegment segment) { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentScaling(segment, 0L); }
    /// {@return `supportedPresentScaling`}
    public @CType("VkPresentScalingFlagsEXT") int supportedPresentScaling() { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentScaling(this.segment()); }
    /// Sets `supportedPresentScaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedPresentScaling(MemorySegment segment, long index, @CType("VkPresentScalingFlagsEXT") int value) { VH_supportedPresentScaling.set(segment, 0L, index, value); }
    /// Sets `supportedPresentScaling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedPresentScaling(MemorySegment segment, @CType("VkPresentScalingFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentScaling(segment, 0L, value); }
    /// Sets `supportedPresentScaling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentScaling(@CType("VkPresentScalingFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentScaling(this.segment(), value); return this; }

    /// {@return `supportedPresentGravityX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentGravityFlagsEXT") int get_supportedPresentGravityX(MemorySegment segment, long index) { return (int) VH_supportedPresentGravityX.get(segment, 0L, index); }
    /// {@return `supportedPresentGravityX`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentGravityFlagsEXT") int get_supportedPresentGravityX(MemorySegment segment) { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentGravityX(segment, 0L); }
    /// {@return `supportedPresentGravityX`}
    public @CType("VkPresentGravityFlagsEXT") int supportedPresentGravityX() { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentGravityX(this.segment()); }
    /// Sets `supportedPresentGravityX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedPresentGravityX(MemorySegment segment, long index, @CType("VkPresentGravityFlagsEXT") int value) { VH_supportedPresentGravityX.set(segment, 0L, index, value); }
    /// Sets `supportedPresentGravityX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedPresentGravityX(MemorySegment segment, @CType("VkPresentGravityFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentGravityX(segment, 0L, value); }
    /// Sets `supportedPresentGravityX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityX(@CType("VkPresentGravityFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentGravityX(this.segment(), value); return this; }

    /// {@return `supportedPresentGravityY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentGravityFlagsEXT") int get_supportedPresentGravityY(MemorySegment segment, long index) { return (int) VH_supportedPresentGravityY.get(segment, 0L, index); }
    /// {@return `supportedPresentGravityY`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentGravityFlagsEXT") int get_supportedPresentGravityY(MemorySegment segment) { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentGravityY(segment, 0L); }
    /// {@return `supportedPresentGravityY`}
    public @CType("VkPresentGravityFlagsEXT") int supportedPresentGravityY() { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentGravityY(this.segment()); }
    /// Sets `supportedPresentGravityY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedPresentGravityY(MemorySegment segment, long index, @CType("VkPresentGravityFlagsEXT") int value) { VH_supportedPresentGravityY.set(segment, 0L, index, value); }
    /// Sets `supportedPresentGravityY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedPresentGravityY(MemorySegment segment, @CType("VkPresentGravityFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentGravityY(segment, 0L, value); }
    /// Sets `supportedPresentGravityY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityY(@CType("VkPresentGravityFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentGravityY(this.segment(), value); return this; }

    /// {@return `minScaledImageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minScaledImageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minScaledImageExtent, index), ML_minScaledImageExtent); }
    /// {@return `minScaledImageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minScaledImageExtent(MemorySegment segment) { return VkSurfacePresentScalingCapabilitiesEXT.get_minScaledImageExtent(segment, 0L); }
    /// {@return `minScaledImageExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minScaledImageExtent() { return VkSurfacePresentScalingCapabilitiesEXT.get_minScaledImageExtent(this.segment()); }
    /// Sets `minScaledImageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minScaledImageExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minScaledImageExtent, index), ML_minScaledImageExtent.byteSize()); }
    /// Sets `minScaledImageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minScaledImageExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_minScaledImageExtent(segment, 0L, value); }
    /// Sets `minScaledImageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_minScaledImageExtent(this.segment(), value); return this; }

    /// {@return `maxScaledImageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxScaledImageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxScaledImageExtent, index), ML_maxScaledImageExtent); }
    /// {@return `maxScaledImageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxScaledImageExtent(MemorySegment segment) { return VkSurfacePresentScalingCapabilitiesEXT.get_maxScaledImageExtent(segment, 0L); }
    /// {@return `maxScaledImageExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxScaledImageExtent() { return VkSurfacePresentScalingCapabilitiesEXT.get_maxScaledImageExtent(this.segment()); }
    /// Sets `maxScaledImageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxScaledImageExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxScaledImageExtent, index), ML_maxScaledImageExtent.byteSize()); }
    /// Sets `maxScaledImageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxScaledImageExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_maxScaledImageExtent(segment, 0L, value); }
    /// Sets `maxScaledImageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_maxScaledImageExtent(this.segment(), value); return this; }

    /// A buffer of [VkSurfacePresentScalingCapabilitiesEXT].
    public static final class Buffer extends VkSurfacePresentScalingCapabilitiesEXT {
        private final long elementCount;

        /// Creates `VkSurfacePresentScalingCapabilitiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSurfacePresentScalingCapabilitiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSurfacePresentScalingCapabilitiesEXT`
        public VkSurfacePresentScalingCapabilitiesEXT asSlice(long index) { return new VkSurfacePresentScalingCapabilitiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSurfacePresentScalingCapabilitiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSurfacePresentScalingCapabilitiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSurfacePresentScalingCapabilitiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSurfacePresentScalingCapabilitiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `supportedPresentScaling` at the given index}
        /// @param index the index
        public @CType("VkPresentScalingFlagsEXT") int supportedPresentScalingAt(long index) { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentScaling(this.segment(), index); }
        /// Sets `supportedPresentScaling` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supportedPresentScalingAt(long index, @CType("VkPresentScalingFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentScaling(this.segment(), index, value); return this; }

        /// {@return `supportedPresentGravityX` at the given index}
        /// @param index the index
        public @CType("VkPresentGravityFlagsEXT") int supportedPresentGravityXAt(long index) { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentGravityX(this.segment(), index); }
        /// Sets `supportedPresentGravityX` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supportedPresentGravityXAt(long index, @CType("VkPresentGravityFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentGravityX(this.segment(), index, value); return this; }

        /// {@return `supportedPresentGravityY` at the given index}
        /// @param index the index
        public @CType("VkPresentGravityFlagsEXT") int supportedPresentGravityYAt(long index) { return VkSurfacePresentScalingCapabilitiesEXT.get_supportedPresentGravityY(this.segment(), index); }
        /// Sets `supportedPresentGravityY` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supportedPresentGravityYAt(long index, @CType("VkPresentGravityFlagsEXT") int value) { VkSurfacePresentScalingCapabilitiesEXT.set_supportedPresentGravityY(this.segment(), index, value); return this; }

        /// {@return `minScaledImageExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment minScaledImageExtentAt(long index) { return VkSurfacePresentScalingCapabilitiesEXT.get_minScaledImageExtent(this.segment(), index); }
        /// Sets `minScaledImageExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minScaledImageExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_minScaledImageExtent(this.segment(), index, value); return this; }

        /// {@return `maxScaledImageExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxScaledImageExtentAt(long index) { return VkSurfacePresentScalingCapabilitiesEXT.get_maxScaledImageExtent(this.segment(), index); }
        /// Sets `maxScaledImageExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxScaledImageExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfacePresentScalingCapabilitiesEXT.set_maxScaledImageExtent(this.segment(), index, value); return this; }

    }
}
