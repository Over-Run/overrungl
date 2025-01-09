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
/// ### subpass
/// [VarHandle][#VH_subpass] - [Getter][#subpass()] - [Setter][#subpass(int)]
/// ### inputAttachmentIndex
/// [VarHandle][#VH_inputAttachmentIndex] - [Getter][#inputAttachmentIndex()] - [Setter][#inputAttachmentIndex(int)]
/// ### aspectMask
/// [VarHandle][#VH_aspectMask] - [Getter][#aspectMask()] - [Setter][#aspectMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkInputAttachmentAspectReference {
///     uint32_t subpass;
///     uint32_t inputAttachmentIndex;
///     VkImageAspectFlags aspectMask;
/// } VkInputAttachmentAspectReference;
/// ```
public final class VkInputAttachmentAspectReference extends Struct {
    /// The struct layout of `VkInputAttachmentAspectReference`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_INT.withName("inputAttachmentIndex"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `inputAttachmentIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentIndex"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));

    /// Creates `VkInputAttachmentAspectReference` with the given segment.
    /// @param segment the memory segment
    public VkInputAttachmentAspectReference(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkInputAttachmentAspectReference` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInputAttachmentAspectReference of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkInputAttachmentAspectReference(segment); }

    /// Creates `VkInputAttachmentAspectReference` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInputAttachmentAspectReference ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkInputAttachmentAspectReference(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkInputAttachmentAspectReference` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInputAttachmentAspectReference ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkInputAttachmentAspectReference(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkInputAttachmentAspectReference` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkInputAttachmentAspectReference`
    public static VkInputAttachmentAspectReference alloc(SegmentAllocator allocator) { return new VkInputAttachmentAspectReference(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkInputAttachmentAspectReference` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkInputAttachmentAspectReference`
    public static VkInputAttachmentAspectReference alloc(SegmentAllocator allocator, long count) { return new VkInputAttachmentAspectReference(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkInputAttachmentAspectReference`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkInputAttachmentAspectReference`
    public VkInputAttachmentAspectReference asSlice(long index) { return new VkInputAttachmentAspectReference(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkInputAttachmentAspectReference`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkInputAttachmentAspectReference`
    public VkInputAttachmentAspectReference asSlice(long index, long count) { return new VkInputAttachmentAspectReference(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpass(MemorySegment segment) { return VkInputAttachmentAspectReference.get_subpass(segment, 0L); }
    /// {@return `subpass` at the given index}
    /// @param index the index
    public @CType("uint32_t") int subpassAt(long index) { return VkInputAttachmentAspectReference.get_subpass(this.segment(), index); }
    /// {@return `subpass`}
    public @CType("uint32_t") int subpass() { return VkInputAttachmentAspectReference.get_subpass(this.segment()); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, @CType("uint32_t") int value) { VkInputAttachmentAspectReference.set_subpass(segment, 0L, value); }
    /// Sets `subpass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference subpassAt(long index, @CType("uint32_t") int value) { VkInputAttachmentAspectReference.set_subpass(this.segment(), index, value); return this; }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference subpass(@CType("uint32_t") int value) { VkInputAttachmentAspectReference.set_subpass(this.segment(), value); return this; }

    /// {@return `inputAttachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_inputAttachmentIndex(MemorySegment segment, long index) { return (int) VH_inputAttachmentIndex.get(segment, 0L, index); }
    /// {@return `inputAttachmentIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_inputAttachmentIndex(MemorySegment segment) { return VkInputAttachmentAspectReference.get_inputAttachmentIndex(segment, 0L); }
    /// {@return `inputAttachmentIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int inputAttachmentIndexAt(long index) { return VkInputAttachmentAspectReference.get_inputAttachmentIndex(this.segment(), index); }
    /// {@return `inputAttachmentIndex`}
    public @CType("uint32_t") int inputAttachmentIndex() { return VkInputAttachmentAspectReference.get_inputAttachmentIndex(this.segment()); }
    /// Sets `inputAttachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inputAttachmentIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_inputAttachmentIndex.set(segment, 0L, index, value); }
    /// Sets `inputAttachmentIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inputAttachmentIndex(MemorySegment segment, @CType("uint32_t") int value) { VkInputAttachmentAspectReference.set_inputAttachmentIndex(segment, 0L, value); }
    /// Sets `inputAttachmentIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference inputAttachmentIndexAt(long index, @CType("uint32_t") int value) { VkInputAttachmentAspectReference.set_inputAttachmentIndex(this.segment(), index, value); return this; }
    /// Sets `inputAttachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference inputAttachmentIndex(@CType("uint32_t") int value) { VkInputAttachmentAspectReference.set_inputAttachmentIndex(this.segment(), value); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment) { return VkInputAttachmentAspectReference.get_aspectMask(segment, 0L); }
    /// {@return `aspectMask` at the given index}
    /// @param index the index
    public @CType("VkImageAspectFlags") int aspectMaskAt(long index) { return VkInputAttachmentAspectReference.get_aspectMask(this.segment(), index); }
    /// {@return `aspectMask`}
    public @CType("VkImageAspectFlags") int aspectMask() { return VkInputAttachmentAspectReference.get_aspectMask(this.segment()); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, long index, @CType("VkImageAspectFlags") int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, @CType("VkImageAspectFlags") int value) { VkInputAttachmentAspectReference.set_aspectMask(segment, 0L, value); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference aspectMaskAt(long index, @CType("VkImageAspectFlags") int value) { VkInputAttachmentAspectReference.set_aspectMask(this.segment(), index, value); return this; }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReference aspectMask(@CType("VkImageAspectFlags") int value) { VkInputAttachmentAspectReference.set_aspectMask(this.segment(), value); return this; }

}
