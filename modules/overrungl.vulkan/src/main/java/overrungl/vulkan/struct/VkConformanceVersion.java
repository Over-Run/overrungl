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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### major
/// [VarHandle][#VH_major] - [Getter][#major()] - [Setter][#major(byte)]
/// ### minor
/// [VarHandle][#VH_minor] - [Getter][#minor()] - [Setter][#minor(byte)]
/// ### subminor
/// [VarHandle][#VH_subminor] - [Getter][#subminor()] - [Setter][#subminor(byte)]
/// ### patch
/// [VarHandle][#VH_patch] - [Getter][#patch()] - [Setter][#patch(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkConformanceVersion {
///     uint8_t major;
///     uint8_t minor;
///     uint8_t subminor;
///     uint8_t patch;
/// } VkConformanceVersion;
/// ```
public final class VkConformanceVersion extends Struct {
    /// The struct layout of `VkConformanceVersion`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("major"),
        ValueLayout.JAVA_BYTE.withName("minor"),
        ValueLayout.JAVA_BYTE.withName("subminor"),
        ValueLayout.JAVA_BYTE.withName("patch")
    );
    /// The [VarHandle] of `major` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_major = LAYOUT.arrayElementVarHandle(PathElement.groupElement("major"));
    /// The [VarHandle] of `minor` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_minor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minor"));
    /// The [VarHandle] of `subminor` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_subminor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subminor"));
    /// The [VarHandle] of `patch` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_patch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("patch"));

    /// Creates `VkConformanceVersion` with the given segment.
    /// @param segment the memory segment
    public VkConformanceVersion(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkConformanceVersion` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersion of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkConformanceVersion(segment); }

    /// Creates `VkConformanceVersion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersion ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkConformanceVersion(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkConformanceVersion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersion ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkConformanceVersion(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkConformanceVersion` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion alloc(SegmentAllocator allocator) { return new VkConformanceVersion(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkConformanceVersion` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion alloc(SegmentAllocator allocator, long count) { return new VkConformanceVersion(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkConformanceVersion`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkConformanceVersion`
    public VkConformanceVersion asSlice(long index) { return new VkConformanceVersion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkConformanceVersion`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkConformanceVersion`
    public VkConformanceVersion asSlice(long index, long count) { return new VkConformanceVersion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `major` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_major(MemorySegment segment, long index) { return (byte) VH_major.get(segment, 0L, index); }
    /// {@return `major`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_major(MemorySegment segment) { return VkConformanceVersion.get_major(segment, 0L); }
    /// {@return `major` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte majorAt(long index) { return VkConformanceVersion.get_major(this.segment(), index); }
    /// {@return `major`}
    public @CType("uint8_t") byte major() { return VkConformanceVersion.get_major(this.segment()); }
    /// Sets `major` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_major(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_major.set(segment, 0L, index, value); }
    /// Sets `major` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_major(MemorySegment segment, @CType("uint8_t") byte value) { VkConformanceVersion.set_major(segment, 0L, value); }
    /// Sets `major` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion majorAt(long index, @CType("uint8_t") byte value) { VkConformanceVersion.set_major(this.segment(), index, value); return this; }
    /// Sets `major` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion major(@CType("uint8_t") byte value) { VkConformanceVersion.set_major(this.segment(), value); return this; }

    /// {@return `minor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_minor(MemorySegment segment, long index) { return (byte) VH_minor.get(segment, 0L, index); }
    /// {@return `minor`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_minor(MemorySegment segment) { return VkConformanceVersion.get_minor(segment, 0L); }
    /// {@return `minor` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte minorAt(long index) { return VkConformanceVersion.get_minor(this.segment(), index); }
    /// {@return `minor`}
    public @CType("uint8_t") byte minor() { return VkConformanceVersion.get_minor(this.segment()); }
    /// Sets `minor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minor(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_minor.set(segment, 0L, index, value); }
    /// Sets `minor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minor(MemorySegment segment, @CType("uint8_t") byte value) { VkConformanceVersion.set_minor(segment, 0L, value); }
    /// Sets `minor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion minorAt(long index, @CType("uint8_t") byte value) { VkConformanceVersion.set_minor(this.segment(), index, value); return this; }
    /// Sets `minor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion minor(@CType("uint8_t") byte value) { VkConformanceVersion.set_minor(this.segment(), value); return this; }

    /// {@return `subminor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_subminor(MemorySegment segment, long index) { return (byte) VH_subminor.get(segment, 0L, index); }
    /// {@return `subminor`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_subminor(MemorySegment segment) { return VkConformanceVersion.get_subminor(segment, 0L); }
    /// {@return `subminor` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte subminorAt(long index) { return VkConformanceVersion.get_subminor(this.segment(), index); }
    /// {@return `subminor`}
    public @CType("uint8_t") byte subminor() { return VkConformanceVersion.get_subminor(this.segment()); }
    /// Sets `subminor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subminor(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_subminor.set(segment, 0L, index, value); }
    /// Sets `subminor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subminor(MemorySegment segment, @CType("uint8_t") byte value) { VkConformanceVersion.set_subminor(segment, 0L, value); }
    /// Sets `subminor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion subminorAt(long index, @CType("uint8_t") byte value) { VkConformanceVersion.set_subminor(this.segment(), index, value); return this; }
    /// Sets `subminor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion subminor(@CType("uint8_t") byte value) { VkConformanceVersion.set_subminor(this.segment(), value); return this; }

    /// {@return `patch` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_patch(MemorySegment segment, long index) { return (byte) VH_patch.get(segment, 0L, index); }
    /// {@return `patch`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_patch(MemorySegment segment) { return VkConformanceVersion.get_patch(segment, 0L); }
    /// {@return `patch` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte patchAt(long index) { return VkConformanceVersion.get_patch(this.segment(), index); }
    /// {@return `patch`}
    public @CType("uint8_t") byte patch() { return VkConformanceVersion.get_patch(this.segment()); }
    /// Sets `patch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_patch(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_patch.set(segment, 0L, index, value); }
    /// Sets `patch` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_patch(MemorySegment segment, @CType("uint8_t") byte value) { VkConformanceVersion.set_patch(segment, 0L, value); }
    /// Sets `patch` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion patchAt(long index, @CType("uint8_t") byte value) { VkConformanceVersion.set_patch(this.segment(), index, value); return this; }
    /// Sets `patch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion patch(@CType("uint8_t") byte value) { VkConformanceVersion.set_patch(this.segment(), value); return this; }

}
