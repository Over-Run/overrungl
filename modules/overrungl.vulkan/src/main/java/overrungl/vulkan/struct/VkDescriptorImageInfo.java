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
/// ### sampler
/// [VarHandle][#VH_sampler] - [Getter][#sampler()] - [Setter][#sampler(java.lang.foreign.MemorySegment)]
/// ### imageView
/// [VarHandle][#VH_imageView] - [Getter][#imageView()] - [Setter][#imageView(java.lang.foreign.MemorySegment)]
/// ### imageLayout
/// [VarHandle][#VH_imageLayout] - [Getter][#imageLayout()] - [Setter][#imageLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorImageInfo {
///     VkSampler sampler;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
/// } VkDescriptorImageInfo;
/// ```
public final class VkDescriptorImageInfo extends Struct {
    /// The struct layout of `VkDescriptorImageInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("sampler"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout")
    );
    /// The [VarHandle] of `sampler` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_sampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `imageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));

    /// Creates `VkDescriptorImageInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorImageInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorImageInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorImageInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorImageInfo(segment); }

    /// Creates `VkDescriptorImageInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorImageInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorImageInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorImageInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorImageInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorImageInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDescriptorImageInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorImageInfo`
    public static VkDescriptorImageInfo alloc(SegmentAllocator allocator) { return new VkDescriptorImageInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorImageInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorImageInfo`
    public static VkDescriptorImageInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorImageInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sampler` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampler") java.lang.foreign.MemorySegment get_sampler(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_sampler.get(segment, 0L, index); }
    /// {@return `sampler`}
    /// @param segment the segment of the struct
    public static @CType("VkSampler") java.lang.foreign.MemorySegment get_sampler(MemorySegment segment) { return VkDescriptorImageInfo.get_sampler(segment, 0L); }
    /// {@return `sampler` at the given index}
    /// @param index the index
    public @CType("VkSampler") java.lang.foreign.MemorySegment samplerAt(long index) { return VkDescriptorImageInfo.get_sampler(this.segment(), index); }
    /// {@return `sampler`}
    public @CType("VkSampler") java.lang.foreign.MemorySegment sampler() { return VkDescriptorImageInfo.get_sampler(this.segment()); }
    /// Sets `sampler` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampler(MemorySegment segment, long index, @CType("VkSampler") java.lang.foreign.MemorySegment value) { VH_sampler.set(segment, 0L, index, value); }
    /// Sets `sampler` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampler(MemorySegment segment, @CType("VkSampler") java.lang.foreign.MemorySegment value) { VkDescriptorImageInfo.set_sampler(segment, 0L, value); }
    /// Sets `sampler` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo samplerAt(long index, @CType("VkSampler") java.lang.foreign.MemorySegment value) { VkDescriptorImageInfo.set_sampler(this.segment(), index, value); return this; }
    /// Sets `sampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo sampler(@CType("VkSampler") java.lang.foreign.MemorySegment value) { VkDescriptorImageInfo.set_sampler(this.segment(), value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment) { return VkDescriptorImageInfo.get_imageView(segment, 0L); }
    /// {@return `imageView` at the given index}
    /// @param index the index
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageViewAt(long index) { return VkDescriptorImageInfo.get_imageView(this.segment(), index); }
    /// {@return `imageView`}
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageView() { return VkDescriptorImageInfo.get_imageView(this.segment()); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkDescriptorImageInfo.set_imageView(segment, 0L, value); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo imageViewAt(long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkDescriptorImageInfo.set_imageView(this.segment(), index, value); return this; }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo imageView(@CType("VkImageView") java.lang.foreign.MemorySegment value) { VkDescriptorImageInfo.set_imageView(this.segment(), value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_imageLayout(MemorySegment segment, long index) { return (int) VH_imageLayout.get(segment, 0L, index); }
    /// {@return `imageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_imageLayout(MemorySegment segment) { return VkDescriptorImageInfo.get_imageLayout(segment, 0L); }
    /// {@return `imageLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int imageLayoutAt(long index) { return VkDescriptorImageInfo.get_imageLayout(this.segment(), index); }
    /// {@return `imageLayout`}
    public @CType("VkImageLayout") int imageLayout() { return VkDescriptorImageInfo.get_imageLayout(this.segment()); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_imageLayout.set(segment, 0L, index, value); }
    /// Sets `imageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkDescriptorImageInfo.set_imageLayout(segment, 0L, value); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo imageLayoutAt(long index, @CType("VkImageLayout") int value) { VkDescriptorImageInfo.set_imageLayout(this.segment(), index, value); return this; }
    /// Sets `imageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo imageLayout(@CType("VkImageLayout") int value) { VkDescriptorImageInfo.set_imageLayout(this.segment(), value); return this; }

}
