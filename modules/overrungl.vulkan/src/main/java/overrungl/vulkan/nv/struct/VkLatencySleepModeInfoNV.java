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
package overrungl.vulkan.nv.struct;

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
/// ### lowLatencyMode
/// [VarHandle][#VH_lowLatencyMode] - [Getter][#lowLatencyMode()] - [Setter][#lowLatencyMode(int)]
/// ### lowLatencyBoost
/// [VarHandle][#VH_lowLatencyBoost] - [Getter][#lowLatencyBoost()] - [Setter][#lowLatencyBoost(int)]
/// ### minimumIntervalUs
/// [VarHandle][#VH_minimumIntervalUs] - [Getter][#minimumIntervalUs()] - [Setter][#minimumIntervalUs(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLatencySleepModeInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 lowLatencyMode;
///     VkBool32 lowLatencyBoost;
///     uint32_t minimumIntervalUs;
/// } VkLatencySleepModeInfoNV;
/// ```
public sealed class VkLatencySleepModeInfoNV extends Struct {
    /// The struct layout of `VkLatencySleepModeInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lowLatencyMode"),
        ValueLayout.JAVA_INT.withName("lowLatencyBoost"),
        ValueLayout.JAVA_INT.withName("minimumIntervalUs")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `lowLatencyMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lowLatencyMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lowLatencyMode"));
    /// The [VarHandle] of `lowLatencyBoost` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lowLatencyBoost = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lowLatencyBoost"));
    /// The [VarHandle] of `minimumIntervalUs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minimumIntervalUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minimumIntervalUs"));

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkLatencySleepModeInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepModeInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySleepModeInfoNV(segment); }

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepModeInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySleepModeInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLatencySleepModeInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkLatencySleepModeInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySleepModeInfoNV`
    public static VkLatencySleepModeInfoNV alloc(SegmentAllocator allocator) { return new VkLatencySleepModeInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLatencySleepModeInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencySleepModeInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkLatencySleepModeInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySleepModeInfoNV`
    public static VkLatencySleepModeInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkBool32") int lowLatencyMode, @CType("VkBool32") int lowLatencyBoost, @CType("uint32_t") int minimumIntervalUs) { return alloc(allocator).sType(sType).pNext(pNext).lowLatencyMode(lowLatencyMode).lowLatencyBoost(lowLatencyBoost).minimumIntervalUs(minimumIntervalUs); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLatencySleepModeInfoNV copyFrom(VkLatencySleepModeInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkLatencySleepModeInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkLatencySleepModeInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkLatencySleepModeInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepModeInfoNV sType(@CType("VkStructureType") int value) { VkLatencySleepModeInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkLatencySleepModeInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkLatencySleepModeInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkLatencySleepModeInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepModeInfoNV pNext(@CType("const void *") MemorySegment value) { VkLatencySleepModeInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `lowLatencyMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_lowLatencyMode(MemorySegment segment, long index) { return (int) VH_lowLatencyMode.get(segment, 0L, index); }
    /// {@return `lowLatencyMode`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_lowLatencyMode(MemorySegment segment) { return VkLatencySleepModeInfoNV.get_lowLatencyMode(segment, 0L); }
    /// {@return `lowLatencyMode`}
    public @CType("VkBool32") int lowLatencyMode() { return VkLatencySleepModeInfoNV.get_lowLatencyMode(this.segment()); }
    /// Sets `lowLatencyMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lowLatencyMode(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_lowLatencyMode.set(segment, 0L, index, value); }
    /// Sets `lowLatencyMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lowLatencyMode(MemorySegment segment, @CType("VkBool32") int value) { VkLatencySleepModeInfoNV.set_lowLatencyMode(segment, 0L, value); }
    /// Sets `lowLatencyMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepModeInfoNV lowLatencyMode(@CType("VkBool32") int value) { VkLatencySleepModeInfoNV.set_lowLatencyMode(this.segment(), value); return this; }

    /// {@return `lowLatencyBoost` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_lowLatencyBoost(MemorySegment segment, long index) { return (int) VH_lowLatencyBoost.get(segment, 0L, index); }
    /// {@return `lowLatencyBoost`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_lowLatencyBoost(MemorySegment segment) { return VkLatencySleepModeInfoNV.get_lowLatencyBoost(segment, 0L); }
    /// {@return `lowLatencyBoost`}
    public @CType("VkBool32") int lowLatencyBoost() { return VkLatencySleepModeInfoNV.get_lowLatencyBoost(this.segment()); }
    /// Sets `lowLatencyBoost` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lowLatencyBoost(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_lowLatencyBoost.set(segment, 0L, index, value); }
    /// Sets `lowLatencyBoost` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lowLatencyBoost(MemorySegment segment, @CType("VkBool32") int value) { VkLatencySleepModeInfoNV.set_lowLatencyBoost(segment, 0L, value); }
    /// Sets `lowLatencyBoost` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepModeInfoNV lowLatencyBoost(@CType("VkBool32") int value) { VkLatencySleepModeInfoNV.set_lowLatencyBoost(this.segment(), value); return this; }

    /// {@return `minimumIntervalUs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minimumIntervalUs(MemorySegment segment, long index) { return (int) VH_minimumIntervalUs.get(segment, 0L, index); }
    /// {@return `minimumIntervalUs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minimumIntervalUs(MemorySegment segment) { return VkLatencySleepModeInfoNV.get_minimumIntervalUs(segment, 0L); }
    /// {@return `minimumIntervalUs`}
    public @CType("uint32_t") int minimumIntervalUs() { return VkLatencySleepModeInfoNV.get_minimumIntervalUs(this.segment()); }
    /// Sets `minimumIntervalUs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minimumIntervalUs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minimumIntervalUs.set(segment, 0L, index, value); }
    /// Sets `minimumIntervalUs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minimumIntervalUs(MemorySegment segment, @CType("uint32_t") int value) { VkLatencySleepModeInfoNV.set_minimumIntervalUs(segment, 0L, value); }
    /// Sets `minimumIntervalUs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepModeInfoNV minimumIntervalUs(@CType("uint32_t") int value) { VkLatencySleepModeInfoNV.set_minimumIntervalUs(this.segment(), value); return this; }

    /// A buffer of [VkLatencySleepModeInfoNV].
    public static final class Buffer extends VkLatencySleepModeInfoNV {
        private final long elementCount;

        /// Creates `VkLatencySleepModeInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkLatencySleepModeInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkLatencySleepModeInfoNV`
        public VkLatencySleepModeInfoNV asSlice(long index) { return new VkLatencySleepModeInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkLatencySleepModeInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkLatencySleepModeInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkLatencySleepModeInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkLatencySleepModeInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkLatencySleepModeInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkLatencySleepModeInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `lowLatencyMode` at the given index}
        /// @param index the index
        public @CType("VkBool32") int lowLatencyModeAt(long index) { return VkLatencySleepModeInfoNV.get_lowLatencyMode(this.segment(), index); }
        /// Sets `lowLatencyMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer lowLatencyModeAt(long index, @CType("VkBool32") int value) { VkLatencySleepModeInfoNV.set_lowLatencyMode(this.segment(), index, value); return this; }

        /// {@return `lowLatencyBoost` at the given index}
        /// @param index the index
        public @CType("VkBool32") int lowLatencyBoostAt(long index) { return VkLatencySleepModeInfoNV.get_lowLatencyBoost(this.segment(), index); }
        /// Sets `lowLatencyBoost` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer lowLatencyBoostAt(long index, @CType("VkBool32") int value) { VkLatencySleepModeInfoNV.set_lowLatencyBoost(this.segment(), index, value); return this; }

        /// {@return `minimumIntervalUs` at the given index}
        /// @param index the index
        public @CType("uint32_t") int minimumIntervalUsAt(long index) { return VkLatencySleepModeInfoNV.get_minimumIntervalUs(this.segment(), index); }
        /// Sets `minimumIntervalUs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minimumIntervalUsAt(long index, @CType("uint32_t") int value) { VkLatencySleepModeInfoNV.set_minimumIntervalUs(this.segment(), index, value); return this; }

    }
}
