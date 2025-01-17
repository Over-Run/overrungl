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
package overrungl.vulkan.android.struct;

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
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSwapchainImageCreateInfoANDROID {
///     VkStructureType sType;
///     const void * pNext;
///     VkSwapchainImageUsageFlagsANDROID usage;
/// } VkSwapchainImageCreateInfoANDROID;
/// ```
public sealed class VkSwapchainImageCreateInfoANDROID extends Struct {
    /// The struct layout of `VkSwapchainImageCreateInfoANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("usage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));

    /// Creates `VkSwapchainImageCreateInfoANDROID` with the given segment.
    /// @param segment the memory segment
    public VkSwapchainImageCreateInfoANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSwapchainImageCreateInfoANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainImageCreateInfoANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainImageCreateInfoANDROID(segment); }

    /// Creates `VkSwapchainImageCreateInfoANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainImageCreateInfoANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainImageCreateInfoANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainImageCreateInfoANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSwapchainImageCreateInfoANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSwapchainImageCreateInfoANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainImageCreateInfoANDROID`
    public static VkSwapchainImageCreateInfoANDROID alloc(SegmentAllocator allocator) { return new VkSwapchainImageCreateInfoANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSwapchainImageCreateInfoANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainImageCreateInfoANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSwapchainImageCreateInfoANDROID` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainImageCreateInfoANDROID`
    public static VkSwapchainImageCreateInfoANDROID allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkSwapchainImageUsageFlagsANDROID") int usage) { return alloc(allocator).sType(sType).pNext(pNext).usage(usage); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainImageCreateInfoANDROID copyFrom(VkSwapchainImageCreateInfoANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSwapchainImageCreateInfoANDROID.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSwapchainImageCreateInfoANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSwapchainImageCreateInfoANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainImageCreateInfoANDROID sType(@CType("VkStructureType") int value) { VkSwapchainImageCreateInfoANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSwapchainImageCreateInfoANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSwapchainImageCreateInfoANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainImageCreateInfoANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainImageCreateInfoANDROID pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainImageCreateInfoANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSwapchainImageUsageFlagsANDROID") int get_usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("VkSwapchainImageUsageFlagsANDROID") int get_usage(MemorySegment segment) { return VkSwapchainImageCreateInfoANDROID.get_usage(segment, 0L); }
    /// {@return `usage`}
    public @CType("VkSwapchainImageUsageFlagsANDROID") int usage() { return VkSwapchainImageCreateInfoANDROID.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("VkSwapchainImageUsageFlagsANDROID") int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("VkSwapchainImageUsageFlagsANDROID") int value) { VkSwapchainImageCreateInfoANDROID.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainImageCreateInfoANDROID usage(@CType("VkSwapchainImageUsageFlagsANDROID") int value) { VkSwapchainImageCreateInfoANDROID.set_usage(this.segment(), value); return this; }

    /// A buffer of [VkSwapchainImageCreateInfoANDROID].
    public static final class Buffer extends VkSwapchainImageCreateInfoANDROID {
        private final long elementCount;

        /// Creates `VkSwapchainImageCreateInfoANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSwapchainImageCreateInfoANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSwapchainImageCreateInfoANDROID`
        public VkSwapchainImageCreateInfoANDROID asSlice(long index) { return new VkSwapchainImageCreateInfoANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSwapchainImageCreateInfoANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSwapchainImageCreateInfoANDROID`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSwapchainImageCreateInfoANDROID.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSwapchainImageCreateInfoANDROID.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSwapchainImageCreateInfoANDROID.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainImageCreateInfoANDROID.set_pNext(this.segment(), index, value); return this; }

        /// {@return `usage` at the given index}
        /// @param index the index
        public @CType("VkSwapchainImageUsageFlagsANDROID") int usageAt(long index) { return VkSwapchainImageCreateInfoANDROID.get_usage(this.segment(), index); }
        /// Sets `usage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer usageAt(long index, @CType("VkSwapchainImageUsageFlagsANDROID") int value) { VkSwapchainImageCreateInfoANDROID.set_usage(this.segment(), index, value); return this; }

    }
}
