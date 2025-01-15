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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### videoSessionParametersTemplate
/// [VarHandle][#VH_videoSessionParametersTemplate] - [Getter][#videoSessionParametersTemplate()] - [Setter][#videoSessionParametersTemplate(java.lang.foreign.MemorySegment)]
/// ### videoSession
/// [VarHandle][#VH_videoSession] - [Getter][#videoSession()] - [Setter][#videoSession(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoSessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoSessionParametersCreateFlagsKHR flags;
///     VkVideoSessionParametersKHR videoSessionParametersTemplate;
///     VkVideoSessionKHR videoSession;
/// } VkVideoSessionParametersCreateInfoKHR;
/// ```
public sealed class VkVideoSessionParametersCreateInfoKHR extends Struct {
    /// The struct layout of `VkVideoSessionParametersCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("videoSessionParametersTemplate"),
        ValueLayout.ADDRESS.withName("videoSession")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `videoSessionParametersTemplate` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_videoSessionParametersTemplate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSessionParametersTemplate"));
    /// The [VarHandle] of `videoSession` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_videoSession = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSession"));

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoSessionParametersCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionParametersCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoSessionParametersCreateInfoKHR(segment); }

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoSessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoSessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoSessionParametersCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoSessionParametersCreateInfoKHR`
    public static VkVideoSessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkVideoSessionParametersCreateFlagsKHR") int flags, @CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment videoSessionParametersTemplate, @CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment videoSession) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).videoSessionParametersTemplate(videoSessionParametersTemplate).videoSession(videoSession); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR copyFrom(VkVideoSessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoSessionParametersCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoSessionParametersCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoSessionParametersCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoSessionParametersCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoSessionParametersCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoSessionParametersCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoSessionParametersCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoSessionParametersCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoSessionParametersCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkVideoSessionParametersCreateFlagsKHR") int flags() { return VkVideoSessionParametersCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoSessionParametersCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoSessionParametersCreateFlagsKHR") int value) { VkVideoSessionParametersCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR flags(@CType("VkVideoSessionParametersCreateFlagsKHR") int value) { VkVideoSessionParametersCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `videoSessionParametersTemplate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment get_videoSessionParametersTemplate(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_videoSessionParametersTemplate.get(segment, 0L, index); }
    /// {@return `videoSessionParametersTemplate`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment get_videoSessionParametersTemplate(MemorySegment segment) { return VkVideoSessionParametersCreateInfoKHR.get_videoSessionParametersTemplate(segment, 0L); }
    /// {@return `videoSessionParametersTemplate`}
    public @CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment videoSessionParametersTemplate() { return VkVideoSessionParametersCreateInfoKHR.get_videoSessionParametersTemplate(this.segment()); }
    /// Sets `videoSessionParametersTemplate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoSessionParametersTemplate(MemorySegment segment, long index, @CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment value) { VH_videoSessionParametersTemplate.set(segment, 0L, index, value); }
    /// Sets `videoSessionParametersTemplate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoSessionParametersTemplate(MemorySegment segment, @CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_videoSessionParametersTemplate(segment, 0L, value); }
    /// Sets `videoSessionParametersTemplate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplate(@CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_videoSessionParametersTemplate(this.segment(), value); return this; }

    /// {@return `videoSession` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment get_videoSession(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_videoSession.get(segment, 0L, index); }
    /// {@return `videoSession`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment get_videoSession(MemorySegment segment) { return VkVideoSessionParametersCreateInfoKHR.get_videoSession(segment, 0L); }
    /// {@return `videoSession`}
    public @CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment videoSession() { return VkVideoSessionParametersCreateInfoKHR.get_videoSession(this.segment()); }
    /// Sets `videoSession` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoSession(MemorySegment segment, long index, @CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment value) { VH_videoSession.set(segment, 0L, index, value); }
    /// Sets `videoSession` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoSession(MemorySegment segment, @CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_videoSession(segment, 0L, value); }
    /// Sets `videoSession` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersCreateInfoKHR videoSession(@CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_videoSession(this.segment(), value); return this; }

    /// A buffer of [VkVideoSessionParametersCreateInfoKHR].
    public static final class Buffer extends VkVideoSessionParametersCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoSessionParametersCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoSessionParametersCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoSessionParametersCreateInfoKHR`
        public VkVideoSessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoSessionParametersCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoSessionParametersCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoSessionParametersCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoSessionParametersCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoSessionParametersCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkVideoSessionParametersCreateFlagsKHR") int flagsAt(long index) { return VkVideoSessionParametersCreateInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkVideoSessionParametersCreateFlagsKHR") int value) { VkVideoSessionParametersCreateInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `videoSessionParametersTemplate` at the given index}
        /// @param index the index
        public @CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment videoSessionParametersTemplateAt(long index) { return VkVideoSessionParametersCreateInfoKHR.get_videoSessionParametersTemplate(this.segment(), index); }
        /// Sets `videoSessionParametersTemplate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer videoSessionParametersTemplateAt(long index, @CType("VkVideoSessionParametersKHR") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_videoSessionParametersTemplate(this.segment(), index, value); return this; }

        /// {@return `videoSession` at the given index}
        /// @param index the index
        public @CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment videoSessionAt(long index) { return VkVideoSessionParametersCreateInfoKHR.get_videoSession(this.segment(), index); }
        /// Sets `videoSession` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer videoSessionAt(long index, @CType("VkVideoSessionKHR") java.lang.foreign.MemorySegment value) { VkVideoSessionParametersCreateInfoKHR.set_videoSession(this.segment(), index, value); return this; }

    }
}
