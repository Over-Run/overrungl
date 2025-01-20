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
/// ### hasStdSPSOverrides
/// [VarHandle][#VH_hasStdSPSOverrides] - [Getter][#hasStdSPSOverrides()] - [Setter][#hasStdSPSOverrides(int)]
/// ### hasStdPPSOverrides
/// [VarHandle][#VH_hasStdPPSOverrides] - [Getter][#hasStdPPSOverrides()] - [Setter][#hasStdPPSOverrides(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264SessionParametersFeedbackInfoKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 hasStdSPSOverrides;
///     VkBool32 hasStdPPSOverrides;
/// } VkVideoEncodeH264SessionParametersFeedbackInfoKHR;
/// ```
public sealed class VkVideoEncodeH264SessionParametersFeedbackInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasStdSPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdPPSOverrides")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `hasStdSPSOverrides` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hasStdSPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdSPSOverrides"));
    /// The [VarHandle] of `hasStdPPSOverrides` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hasStdPPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdPPSOverrides"));

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH264SessionParametersFeedbackInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int hasStdSPSOverrides, @CType("VkBool32") int hasStdPPSOverrides) { return alloc(allocator).sType(sType).pNext(pNext).hasStdSPSOverrides(hasStdSPSOverrides).hasStdPPSOverrides(hasStdPPSOverrides); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR copyFrom(VkVideoEncodeH264SessionParametersFeedbackInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR pNext(@CType("void *") MemorySegment value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `hasStdSPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hasStdSPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdSPSOverrides.get(segment, 0L, index); }
    /// {@return `hasStdSPSOverrides`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hasStdSPSOverrides(MemorySegment segment) { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_hasStdSPSOverrides(segment, 0L); }
    /// {@return `hasStdSPSOverrides`}
    public @CType("VkBool32") int hasStdSPSOverrides() { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_hasStdSPSOverrides(this.segment()); }
    /// Sets `hasStdSPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hasStdSPSOverrides(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hasStdSPSOverrides.set(segment, 0L, index, value); }
    /// Sets `hasStdSPSOverrides` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hasStdSPSOverrides(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_hasStdSPSOverrides(segment, 0L, value); }
    /// Sets `hasStdSPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdSPSOverrides(@CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_hasStdSPSOverrides(this.segment(), value); return this; }

    /// {@return `hasStdPPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hasStdPPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdPPSOverrides.get(segment, 0L, index); }
    /// {@return `hasStdPPSOverrides`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hasStdPPSOverrides(MemorySegment segment) { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_hasStdPPSOverrides(segment, 0L); }
    /// {@return `hasStdPPSOverrides`}
    public @CType("VkBool32") int hasStdPPSOverrides() { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_hasStdPPSOverrides(this.segment()); }
    /// Sets `hasStdPPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hasStdPPSOverrides(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hasStdPPSOverrides.set(segment, 0L, index, value); }
    /// Sets `hasStdPPSOverrides` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hasStdPPSOverrides(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_hasStdPPSOverrides(segment, 0L, value); }
    /// Sets `hasStdPPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdPPSOverrides(@CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_hasStdPPSOverrides(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeH264SessionParametersFeedbackInfoKHR].
    public static final class Buffer extends VkVideoEncodeH264SessionParametersFeedbackInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
        public VkVideoEncodeH264SessionParametersFeedbackInfoKHR asSlice(long index) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `hasStdSPSOverrides` at the given index}
        /// @param index the index
        public @CType("VkBool32") int hasStdSPSOverridesAt(long index) { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_hasStdSPSOverrides(this.segment(), index); }
        /// Sets `hasStdSPSOverrides` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hasStdSPSOverridesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_hasStdSPSOverrides(this.segment(), index, value); return this; }

        /// {@return `hasStdPPSOverrides` at the given index}
        /// @param index the index
        public @CType("VkBool32") int hasStdPPSOverridesAt(long index) { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.get_hasStdPPSOverrides(this.segment(), index); }
        /// Sets `hasStdPPSOverrides` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hasStdPPSOverridesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.set_hasStdPPSOverrides(this.segment(), index, value); return this; }

    }
}
