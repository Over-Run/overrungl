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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### drmFormatModifier
/// [VarHandle][#VH_drmFormatModifier] - [Getter][#drmFormatModifier()] - [Setter][#drmFormatModifier(long)]
/// ### drmFormatModifierPlaneCount
/// [VarHandle][#VH_drmFormatModifierPlaneCount] - [Getter][#drmFormatModifierPlaneCount()] - [Setter][#drmFormatModifierPlaneCount(int)]
/// ### pPlaneLayouts
/// [VarHandle][#VH_pPlaneLayouts] - [Getter][#pPlaneLayouts()] - [Setter][#pPlaneLayouts(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageDrmFormatModifierExplicitCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     const VkSubresourceLayout * pPlaneLayouts;
/// } VkImageDrmFormatModifierExplicitCreateInfoEXT;
/// ```
public sealed class VkImageDrmFormatModifierExplicitCreateInfoEXT extends Struct {
    /// The struct layout of `VkImageDrmFormatModifierExplicitCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.ADDRESS.withName("pPlaneLayouts")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `drmFormatModifier` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    /// The [VarHandle] of `drmFormatModifierPlaneCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_drmFormatModifierPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The [VarHandle] of `pPlaneLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPlaneLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPlaneLayouts"));

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImageDrmFormatModifierExplicitCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment); }

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageDrmFormatModifierExplicitCreateInfoEXT`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageDrmFormatModifierExplicitCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageDrmFormatModifierExplicitCreateInfoEXT`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint64_t") long drmFormatModifier, @CType("uint32_t") int drmFormatModifierPlaneCount, @CType("const VkSubresourceLayout *") MemorySegment pPlaneLayouts) { return alloc(allocator).sType(sType).pNext(pNext).drmFormatModifier(drmFormatModifier).drmFormatModifierPlaneCount(drmFormatModifierPlaneCount).pPlaneLayouts(pPlaneLayouts); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT copyFrom(VkImageDrmFormatModifierExplicitCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType(@CType("VkStructureType") int value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNext(@CType("const void *") MemorySegment value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `drmFormatModifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_drmFormatModifier(MemorySegment segment, long index) { return (long) VH_drmFormatModifier.get(segment, 0L, index); }
    /// {@return `drmFormatModifier`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_drmFormatModifier(MemorySegment segment) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_drmFormatModifier(segment, 0L); }
    /// {@return `drmFormatModifier`}
    public @CType("uint64_t") long drmFormatModifier() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_drmFormatModifier(this.segment()); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drmFormatModifier(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_drmFormatModifier.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drmFormatModifier(MemorySegment segment, @CType("uint64_t") long value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_drmFormatModifier(segment, 0L, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifier(@CType("uint64_t") long value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_drmFormatModifier(this.segment(), value); return this; }

    /// {@return `drmFormatModifierPlaneCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_drmFormatModifierPlaneCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierPlaneCount.get(segment, 0L, index); }
    /// {@return `drmFormatModifierPlaneCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_drmFormatModifierPlaneCount(MemorySegment segment) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_drmFormatModifierPlaneCount(segment, 0L); }
    /// {@return `drmFormatModifierPlaneCount`}
    public @CType("uint32_t") int drmFormatModifierPlaneCount() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_drmFormatModifierPlaneCount(this.segment()); }
    /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drmFormatModifierPlaneCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_drmFormatModifierPlaneCount.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierPlaneCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drmFormatModifierPlaneCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_drmFormatModifierPlaneCount(segment, 0L, value); }
    /// Sets `drmFormatModifierPlaneCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifierPlaneCount(@CType("uint32_t") int value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_drmFormatModifierPlaneCount(this.segment(), value); return this; }

    /// {@return `pPlaneLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSubresourceLayout *") MemorySegment get_pPlaneLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pPlaneLayouts.get(segment, 0L, index); }
    /// {@return `pPlaneLayouts`}
    /// @param segment the segment of the struct
    public static @CType("const VkSubresourceLayout *") MemorySegment get_pPlaneLayouts(MemorySegment segment) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_pPlaneLayouts(segment, 0L); }
    /// {@return `pPlaneLayouts`}
    public @CType("const VkSubresourceLayout *") MemorySegment pPlaneLayouts() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_pPlaneLayouts(this.segment()); }
    /// Sets `pPlaneLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPlaneLayouts(MemorySegment segment, long index, @CType("const VkSubresourceLayout *") MemorySegment value) { VH_pPlaneLayouts.set(segment, 0L, index, value); }
    /// Sets `pPlaneLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPlaneLayouts(MemorySegment segment, @CType("const VkSubresourceLayout *") MemorySegment value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_pPlaneLayouts(segment, 0L, value); }
    /// Sets `pPlaneLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayouts(@CType("const VkSubresourceLayout *") MemorySegment value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_pPlaneLayouts(this.segment(), value); return this; }

    /// A buffer of [VkImageDrmFormatModifierExplicitCreateInfoEXT].
    public static final class Buffer extends VkImageDrmFormatModifierExplicitCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageDrmFormatModifierExplicitCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageDrmFormatModifierExplicitCreateInfoEXT`
        public VkImageDrmFormatModifierExplicitCreateInfoEXT asSlice(long index) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageDrmFormatModifierExplicitCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageDrmFormatModifierExplicitCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `drmFormatModifier` at the given index}
        /// @param index the index
        public @CType("uint64_t") long drmFormatModifierAt(long index) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_drmFormatModifier(this.segment(), index); }
        /// Sets `drmFormatModifier` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierAt(long index, @CType("uint64_t") long value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_drmFormatModifier(this.segment(), index, value); return this; }

        /// {@return `drmFormatModifierPlaneCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int drmFormatModifierPlaneCountAt(long index) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_drmFormatModifierPlaneCount(this.segment(), index); }
        /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierPlaneCountAt(long index, @CType("uint32_t") int value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_drmFormatModifierPlaneCount(this.segment(), index, value); return this; }

        /// {@return `pPlaneLayouts` at the given index}
        /// @param index the index
        public @CType("const VkSubresourceLayout *") MemorySegment pPlaneLayoutsAt(long index) { return VkImageDrmFormatModifierExplicitCreateInfoEXT.get_pPlaneLayouts(this.segment(), index); }
        /// Sets `pPlaneLayouts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPlaneLayoutsAt(long index, @CType("const VkSubresourceLayout *") MemorySegment value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.set_pPlaneLayouts(this.segment(), index, value); return this; }

    }
}
