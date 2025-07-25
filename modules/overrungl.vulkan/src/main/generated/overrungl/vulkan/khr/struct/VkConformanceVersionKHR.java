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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkConformanceVersionKHR {
///     uint8_t major;
///     uint8_t minor;
///     uint8_t subminor;
///     uint8_t patch;
/// };
/// ```
public final class VkConformanceVersionKHR extends GroupType {
    /// The struct layout of `VkConformanceVersionKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("major"),
        ValueLayout.JAVA_BYTE.withName("minor"),
        ValueLayout.JAVA_BYTE.withName("subminor"),
        ValueLayout.JAVA_BYTE.withName("patch")
    );
    /// The byte offset of `major`.
    public static final long OFFSET_major = LAYOUT.byteOffset(PathElement.groupElement("major"));
    /// The memory layout of `major`.
    public static final MemoryLayout LAYOUT_major = LAYOUT.select(PathElement.groupElement("major"));
    /// The [VarHandle] of `major` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_major = LAYOUT.arrayElementVarHandle(PathElement.groupElement("major"));
    /// The byte offset of `minor`.
    public static final long OFFSET_minor = LAYOUT.byteOffset(PathElement.groupElement("minor"));
    /// The memory layout of `minor`.
    public static final MemoryLayout LAYOUT_minor = LAYOUT.select(PathElement.groupElement("minor"));
    /// The [VarHandle] of `minor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minor"));
    /// The byte offset of `subminor`.
    public static final long OFFSET_subminor = LAYOUT.byteOffset(PathElement.groupElement("subminor"));
    /// The memory layout of `subminor`.
    public static final MemoryLayout LAYOUT_subminor = LAYOUT.select(PathElement.groupElement("subminor"));
    /// The [VarHandle] of `subminor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subminor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subminor"));
    /// The byte offset of `patch`.
    public static final long OFFSET_patch = LAYOUT.byteOffset(PathElement.groupElement("patch"));
    /// The memory layout of `patch`.
    public static final MemoryLayout LAYOUT_patch = LAYOUT.select(PathElement.groupElement("patch"));
    /// The [VarHandle] of `patch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_patch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("patch"));

    /// Creates `VkConformanceVersionKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkConformanceVersionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkConformanceVersionKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersionKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkConformanceVersionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkConformanceVersionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkConformanceVersionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkConformanceVersionKHR`
    public static VkConformanceVersionKHR alloc(SegmentAllocator allocator) { return new VkConformanceVersionKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkConformanceVersionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkConformanceVersionKHR`
    public static VkConformanceVersionKHR alloc(SegmentAllocator allocator, long count) { return new VkConformanceVersionKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkConformanceVersionKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param major `major`
    /// @param minor `minor`
    /// @param subminor `subminor`
    /// @param patch `patch`
    /// @return the allocated `VkConformanceVersionKHR`
    public static VkConformanceVersionKHR allocInit(SegmentAllocator allocator, byte major, byte minor, byte subminor, byte patch) {
        return alloc(allocator).major(major).minor(minor).subminor(subminor).patch(patch);
    }

    /// Allocates a `VkConformanceVersionKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param major `major`
    /// @param minor `minor`
    /// @param subminor `subminor`
    /// @return the allocated `VkConformanceVersionKHR`
    public static VkConformanceVersionKHR allocInit(SegmentAllocator allocator, byte major, byte minor, byte subminor) {
        return alloc(allocator).major(major).minor(minor).subminor(subminor);
    }

    /// Allocates a `VkConformanceVersionKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param major `major`
    /// @param minor `minor`
    /// @return the allocated `VkConformanceVersionKHR`
    public static VkConformanceVersionKHR allocInit(SegmentAllocator allocator, byte major, byte minor) {
        return alloc(allocator).major(major).minor(minor);
    }

    /// Allocates a `VkConformanceVersionKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param major `major`
    /// @return the allocated `VkConformanceVersionKHR`
    public static VkConformanceVersionKHR allocInit(SegmentAllocator allocator, byte major) {
        return alloc(allocator).major(major);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkConformanceVersionKHR copyFrom(VkConformanceVersionKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkConformanceVersionKHR reinterpret(long count) { return new VkConformanceVersionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `major` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte major(MemorySegment segment, long index) { return (byte) VH_major.get(segment, 0L, index); }
    /// {@return `major`}
    public byte major() { return major(this.segment(), 0L); }
    /// Sets `major` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void major(MemorySegment segment, long index, byte value) { VH_major.set(segment, 0L, index, value); }
    /// Sets `major` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersionKHR major(byte value) { major(this.segment(), 0L, value); return this; }

    /// {@return `minor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte minor(MemorySegment segment, long index) { return (byte) VH_minor.get(segment, 0L, index); }
    /// {@return `minor`}
    public byte minor() { return minor(this.segment(), 0L); }
    /// Sets `minor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minor(MemorySegment segment, long index, byte value) { VH_minor.set(segment, 0L, index, value); }
    /// Sets `minor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersionKHR minor(byte value) { minor(this.segment(), 0L, value); return this; }

    /// {@return `subminor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte subminor(MemorySegment segment, long index) { return (byte) VH_subminor.get(segment, 0L, index); }
    /// {@return `subminor`}
    public byte subminor() { return subminor(this.segment(), 0L); }
    /// Sets `subminor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subminor(MemorySegment segment, long index, byte value) { VH_subminor.set(segment, 0L, index, value); }
    /// Sets `subminor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersionKHR subminor(byte value) { subminor(this.segment(), 0L, value); return this; }

    /// {@return `patch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte patch(MemorySegment segment, long index) { return (byte) VH_patch.get(segment, 0L, index); }
    /// {@return `patch`}
    public byte patch() { return patch(this.segment(), 0L); }
    /// Sets `patch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void patch(MemorySegment segment, long index, byte value) { VH_patch.set(segment, 0L, index, value); }
    /// Sets `patch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersionKHR patch(byte value) { patch(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkConformanceVersionKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkConformanceVersionKHR`
    public VkConformanceVersionKHR asSlice(long index) { return new VkConformanceVersionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkConformanceVersionKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkConformanceVersionKHR`
    public VkConformanceVersionKHR asSlice(long index, long count) { return new VkConformanceVersionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkConformanceVersionKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkConformanceVersionKHR at(long index, Consumer<VkConformanceVersionKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `major` at the given index}
    /// @param index the index of the struct buffer
    public byte majorAt(long index) { return major(this.segment(), index); }
    /// Sets `major` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkConformanceVersionKHR majorAt(long index, byte value) { major(this.segment(), index, value); return this; }

    /// {@return `minor` at the given index}
    /// @param index the index of the struct buffer
    public byte minorAt(long index) { return minor(this.segment(), index); }
    /// Sets `minor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkConformanceVersionKHR minorAt(long index, byte value) { minor(this.segment(), index, value); return this; }

    /// {@return `subminor` at the given index}
    /// @param index the index of the struct buffer
    public byte subminorAt(long index) { return subminor(this.segment(), index); }
    /// Sets `subminor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkConformanceVersionKHR subminorAt(long index, byte value) { subminor(this.segment(), index, value); return this; }

    /// {@return `patch` at the given index}
    /// @param index the index of the struct buffer
    public byte patchAt(long index) { return patch(this.segment(), index); }
    /// Sets `patch` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkConformanceVersionKHR patchAt(long index, byte value) { patch(this.segment(), index, value); return this; }

}
