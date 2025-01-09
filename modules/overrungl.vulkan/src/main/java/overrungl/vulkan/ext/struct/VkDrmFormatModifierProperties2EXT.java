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
/// ### drmFormatModifier
/// [VarHandle][#VH_drmFormatModifier] - [Getter][#drmFormatModifier()] - [Setter][#drmFormatModifier(long)]
/// ### drmFormatModifierPlaneCount
/// [VarHandle][#VH_drmFormatModifierPlaneCount] - [Getter][#drmFormatModifierPlaneCount()] - [Setter][#drmFormatModifierPlaneCount(int)]
/// ### drmFormatModifierTilingFeatures
/// [VarHandle][#VH_drmFormatModifierTilingFeatures] - [Getter][#drmFormatModifierTilingFeatures()] - [Setter][#drmFormatModifierTilingFeatures(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDrmFormatModifierProperties2EXT {
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     VkFormatFeatureFlags2 drmFormatModifierTilingFeatures;
/// } VkDrmFormatModifierProperties2EXT;
/// ```
public final class VkDrmFormatModifierProperties2EXT extends Struct {
    /// The struct layout of `VkDrmFormatModifierProperties2EXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifierTilingFeatures")
    );
    /// The [VarHandle] of `drmFormatModifier` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    /// The [VarHandle] of `drmFormatModifierPlaneCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_drmFormatModifierPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The [VarHandle] of `drmFormatModifierTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_drmFormatModifierTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierTilingFeatures"));

    /// Creates `VkDrmFormatModifierProperties2EXT` with the given segment.
    /// @param segment the memory segment
    public VkDrmFormatModifierProperties2EXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrmFormatModifierProperties2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierProperties2EXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment); }

    /// Creates `VkDrmFormatModifierProperties2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierProperties2EXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrmFormatModifierProperties2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierProperties2EXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDrmFormatModifierProperties2EXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrmFormatModifierProperties2EXT`
    public static VkDrmFormatModifierProperties2EXT alloc(SegmentAllocator allocator) { return new VkDrmFormatModifierProperties2EXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrmFormatModifierProperties2EXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrmFormatModifierProperties2EXT`
    public static VkDrmFormatModifierProperties2EXT alloc(SegmentAllocator allocator, long count) { return new VkDrmFormatModifierProperties2EXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDrmFormatModifierProperties2EXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDrmFormatModifierProperties2EXT`
    public VkDrmFormatModifierProperties2EXT asSlice(long index) { return new VkDrmFormatModifierProperties2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDrmFormatModifierProperties2EXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDrmFormatModifierProperties2EXT`
    public VkDrmFormatModifierProperties2EXT asSlice(long index, long count) { return new VkDrmFormatModifierProperties2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `drmFormatModifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_drmFormatModifier(MemorySegment segment, long index) { return (long) VH_drmFormatModifier.get(segment, 0L, index); }
    /// {@return `drmFormatModifier`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_drmFormatModifier(MemorySegment segment) { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifier(segment, 0L); }
    /// {@return `drmFormatModifier` at the given index}
    /// @param index the index
    public @CType("uint64_t") long drmFormatModifierAt(long index) { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifier(this.segment(), index); }
    /// {@return `drmFormatModifier`}
    public @CType("uint64_t") long drmFormatModifier() { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifier(this.segment()); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drmFormatModifier(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_drmFormatModifier.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drmFormatModifier(MemorySegment segment, @CType("uint64_t") long value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifier(segment, 0L, value); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierAt(long index, @CType("uint64_t") long value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifier(this.segment(), index, value); return this; }
    /// Sets `drmFormatModifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifier(@CType("uint64_t") long value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifier(this.segment(), value); return this; }

    /// {@return `drmFormatModifierPlaneCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_drmFormatModifierPlaneCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierPlaneCount.get(segment, 0L, index); }
    /// {@return `drmFormatModifierPlaneCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_drmFormatModifierPlaneCount(MemorySegment segment) { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifierPlaneCount(segment, 0L); }
    /// {@return `drmFormatModifierPlaneCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int drmFormatModifierPlaneCountAt(long index) { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifierPlaneCount(this.segment(), index); }
    /// {@return `drmFormatModifierPlaneCount`}
    public @CType("uint32_t") int drmFormatModifierPlaneCount() { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifierPlaneCount(this.segment()); }
    /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drmFormatModifierPlaneCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_drmFormatModifierPlaneCount.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierPlaneCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drmFormatModifierPlaneCount(MemorySegment segment, @CType("uint32_t") int value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifierPlaneCount(segment, 0L, value); }
    /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierPlaneCountAt(long index, @CType("uint32_t") int value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifierPlaneCount(this.segment(), index, value); return this; }
    /// Sets `drmFormatModifierPlaneCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierPlaneCount(@CType("uint32_t") int value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifierPlaneCount(this.segment(), value); return this; }

    /// {@return `drmFormatModifierTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags2") long get_drmFormatModifierTilingFeatures(MemorySegment segment, long index) { return (long) VH_drmFormatModifierTilingFeatures.get(segment, 0L, index); }
    /// {@return `drmFormatModifierTilingFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags2") long get_drmFormatModifierTilingFeatures(MemorySegment segment) { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifierTilingFeatures(segment, 0L); }
    /// {@return `drmFormatModifierTilingFeatures` at the given index}
    /// @param index the index
    public @CType("VkFormatFeatureFlags2") long drmFormatModifierTilingFeaturesAt(long index) { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifierTilingFeatures(this.segment(), index); }
    /// {@return `drmFormatModifierTilingFeatures`}
    public @CType("VkFormatFeatureFlags2") long drmFormatModifierTilingFeatures() { return VkDrmFormatModifierProperties2EXT.get_drmFormatModifierTilingFeatures(this.segment()); }
    /// Sets `drmFormatModifierTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drmFormatModifierTilingFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags2") long value) { VH_drmFormatModifierTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierTilingFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drmFormatModifierTilingFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags2") long value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifierTilingFeatures(segment, 0L, value); }
    /// Sets `drmFormatModifierTilingFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierTilingFeaturesAt(long index, @CType("VkFormatFeatureFlags2") long value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifierTilingFeatures(this.segment(), index, value); return this; }
    /// Sets `drmFormatModifierTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierTilingFeatures(@CType("VkFormatFeatureFlags2") long value) { VkDrmFormatModifierProperties2EXT.set_drmFormatModifierTilingFeatures(this.segment(), value); return this; }

}
