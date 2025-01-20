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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### videoSession
/// [VarHandle][#VH_videoSession] - [Getter][#videoSession()] - [Setter][#videoSession(MemorySegment)]
/// ### videoSessionParameters
/// [VarHandle][#VH_videoSessionParameters] - [Getter][#videoSessionParameters()] - [Setter][#videoSessionParameters(MemorySegment)]
/// ### referenceSlotCount
/// [VarHandle][#VH_referenceSlotCount] - [Getter][#referenceSlotCount()] - [Setter][#referenceSlotCount(int)]
/// ### pReferenceSlots
/// [VarHandle][#VH_pReferenceSlots] - [Getter][#pReferenceSlots()] - [Setter][#pReferenceSlots(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoBeginCodingInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoBeginCodingFlagsKHR flags;
///     VkVideoSessionKHR videoSession;
///     VkVideoSessionParametersKHR videoSessionParameters;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR * pReferenceSlots;
/// } VkVideoBeginCodingInfoKHR;
/// ```
public sealed class VkVideoBeginCodingInfoKHR extends Struct {
    /// The struct layout of `VkVideoBeginCodingInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("videoSession"),
        ValueLayout.ADDRESS.withName("videoSessionParameters"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `videoSession` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoSession = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSession"));
    /// The [VarHandle] of `videoSessionParameters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoSessionParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSessionParameters"));
    /// The [VarHandle] of `referenceSlotCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_referenceSlotCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceSlotCount"));
    /// The [VarHandle] of `pReferenceSlots` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pReferenceSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReferenceSlots"));

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoBeginCodingInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoBeginCodingInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoBeginCodingInfoKHR(segment); }

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoBeginCodingInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoBeginCodingInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoBeginCodingInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoBeginCodingInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoBeginCodingInfoKHR`
    public static VkVideoBeginCodingInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoBeginCodingInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoBeginCodingInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoBeginCodingInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoBeginCodingInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoBeginCodingInfoKHR`
    public static VkVideoBeginCodingInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkVideoBeginCodingFlagsKHR") int flags, @CType("VkVideoSessionKHR") MemorySegment videoSession, @CType("VkVideoSessionParametersKHR") MemorySegment videoSessionParameters, @CType("uint32_t") int referenceSlotCount, @CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment pReferenceSlots) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).videoSession(videoSession).videoSessionParameters(videoSessionParameters).referenceSlotCount(referenceSlotCount).pReferenceSlots(pReferenceSlots); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoBeginCodingInfoKHR copyFrom(VkVideoBeginCodingInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoBeginCodingInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoBeginCodingInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoBeginCodingInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR sType(@CType("VkStructureType") int value) { VkVideoBeginCodingInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoBeginCodingInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkVideoBeginCodingInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR pNext(@CType("const void *") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoBeginCodingFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoBeginCodingFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoBeginCodingInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkVideoBeginCodingFlagsKHR") int flags() { return VkVideoBeginCodingInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoBeginCodingFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoBeginCodingFlagsKHR") int value) { VkVideoBeginCodingInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR flags(@CType("VkVideoBeginCodingFlagsKHR") int value) { VkVideoBeginCodingInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `videoSession` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoSessionKHR") MemorySegment get_videoSession(MemorySegment segment, long index) { return (MemorySegment) VH_videoSession.get(segment, 0L, index); }
    /// {@return `videoSession`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoSessionKHR") MemorySegment get_videoSession(MemorySegment segment) { return VkVideoBeginCodingInfoKHR.get_videoSession(segment, 0L); }
    /// {@return `videoSession`}
    public @CType("VkVideoSessionKHR") MemorySegment videoSession() { return VkVideoBeginCodingInfoKHR.get_videoSession(this.segment()); }
    /// Sets `videoSession` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoSession(MemorySegment segment, long index, @CType("VkVideoSessionKHR") MemorySegment value) { VH_videoSession.set(segment, 0L, index, value); }
    /// Sets `videoSession` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoSession(MemorySegment segment, @CType("VkVideoSessionKHR") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_videoSession(segment, 0L, value); }
    /// Sets `videoSession` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR videoSession(@CType("VkVideoSessionKHR") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_videoSession(this.segment(), value); return this; }

    /// {@return `videoSessionParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoSessionParametersKHR") MemorySegment get_videoSessionParameters(MemorySegment segment, long index) { return (MemorySegment) VH_videoSessionParameters.get(segment, 0L, index); }
    /// {@return `videoSessionParameters`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoSessionParametersKHR") MemorySegment get_videoSessionParameters(MemorySegment segment) { return VkVideoBeginCodingInfoKHR.get_videoSessionParameters(segment, 0L); }
    /// {@return `videoSessionParameters`}
    public @CType("VkVideoSessionParametersKHR") MemorySegment videoSessionParameters() { return VkVideoBeginCodingInfoKHR.get_videoSessionParameters(this.segment()); }
    /// Sets `videoSessionParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoSessionParameters(MemorySegment segment, long index, @CType("VkVideoSessionParametersKHR") MemorySegment value) { VH_videoSessionParameters.set(segment, 0L, index, value); }
    /// Sets `videoSessionParameters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoSessionParameters(MemorySegment segment, @CType("VkVideoSessionParametersKHR") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_videoSessionParameters(segment, 0L, value); }
    /// Sets `videoSessionParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR videoSessionParameters(@CType("VkVideoSessionParametersKHR") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_videoSessionParameters(this.segment(), value); return this; }

    /// {@return `referenceSlotCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_referenceSlotCount(MemorySegment segment, long index) { return (int) VH_referenceSlotCount.get(segment, 0L, index); }
    /// {@return `referenceSlotCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_referenceSlotCount(MemorySegment segment) { return VkVideoBeginCodingInfoKHR.get_referenceSlotCount(segment, 0L); }
    /// {@return `referenceSlotCount`}
    public @CType("uint32_t") int referenceSlotCount() { return VkVideoBeginCodingInfoKHR.get_referenceSlotCount(this.segment()); }
    /// Sets `referenceSlotCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_referenceSlotCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_referenceSlotCount.set(segment, 0L, index, value); }
    /// Sets `referenceSlotCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_referenceSlotCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoBeginCodingInfoKHR.set_referenceSlotCount(segment, 0L, value); }
    /// Sets `referenceSlotCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR referenceSlotCount(@CType("uint32_t") int value) { VkVideoBeginCodingInfoKHR.set_referenceSlotCount(this.segment(), value); return this; }

    /// {@return `pReferenceSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment get_pReferenceSlots(MemorySegment segment, long index) { return (MemorySegment) VH_pReferenceSlots.get(segment, 0L, index); }
    /// {@return `pReferenceSlots`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment get_pReferenceSlots(MemorySegment segment) { return VkVideoBeginCodingInfoKHR.get_pReferenceSlots(segment, 0L); }
    /// {@return `pReferenceSlots`}
    public @CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment pReferenceSlots() { return VkVideoBeginCodingInfoKHR.get_pReferenceSlots(this.segment()); }
    /// Sets `pReferenceSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pReferenceSlots(MemorySegment segment, long index, @CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment value) { VH_pReferenceSlots.set(segment, 0L, index, value); }
    /// Sets `pReferenceSlots` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pReferenceSlots(MemorySegment segment, @CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_pReferenceSlots(segment, 0L, value); }
    /// Sets `pReferenceSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoBeginCodingInfoKHR pReferenceSlots(@CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_pReferenceSlots(this.segment(), value); return this; }

    /// A buffer of [VkVideoBeginCodingInfoKHR].
    public static final class Buffer extends VkVideoBeginCodingInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoBeginCodingInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoBeginCodingInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoBeginCodingInfoKHR`
        public VkVideoBeginCodingInfoKHR asSlice(long index) { return new VkVideoBeginCodingInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoBeginCodingInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoBeginCodingInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoBeginCodingInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoBeginCodingInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkVideoBeginCodingInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkVideoBeginCodingFlagsKHR") int flagsAt(long index) { return VkVideoBeginCodingInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkVideoBeginCodingFlagsKHR") int value) { VkVideoBeginCodingInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `videoSession` at the given index}
        /// @param index the index
        public @CType("VkVideoSessionKHR") MemorySegment videoSessionAt(long index) { return VkVideoBeginCodingInfoKHR.get_videoSession(this.segment(), index); }
        /// Sets `videoSession` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer videoSessionAt(long index, @CType("VkVideoSessionKHR") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_videoSession(this.segment(), index, value); return this; }

        /// {@return `videoSessionParameters` at the given index}
        /// @param index the index
        public @CType("VkVideoSessionParametersKHR") MemorySegment videoSessionParametersAt(long index) { return VkVideoBeginCodingInfoKHR.get_videoSessionParameters(this.segment(), index); }
        /// Sets `videoSessionParameters` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer videoSessionParametersAt(long index, @CType("VkVideoSessionParametersKHR") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_videoSessionParameters(this.segment(), index, value); return this; }

        /// {@return `referenceSlotCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int referenceSlotCountAt(long index) { return VkVideoBeginCodingInfoKHR.get_referenceSlotCount(this.segment(), index); }
        /// Sets `referenceSlotCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer referenceSlotCountAt(long index, @CType("uint32_t") int value) { VkVideoBeginCodingInfoKHR.set_referenceSlotCount(this.segment(), index, value); return this; }

        /// {@return `pReferenceSlots` at the given index}
        /// @param index the index
        public @CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment pReferenceSlotsAt(long index) { return VkVideoBeginCodingInfoKHR.get_pReferenceSlots(this.segment(), index); }
        /// Sets `pReferenceSlots` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pReferenceSlotsAt(long index, @CType("const VkVideoReferenceSlotInfoKHR *") MemorySegment value) { VkVideoBeginCodingInfoKHR.set_pReferenceSlots(this.segment(), index, value); return this; }

    }
}
