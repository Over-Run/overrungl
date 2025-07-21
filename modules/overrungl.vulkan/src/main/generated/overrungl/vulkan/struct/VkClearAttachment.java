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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkClearAttachment {
///     ((uint32_t) VkFlags) VkImageAspectFlags aspectMask;
///     uint32_t colorAttachment;
///     (union VkClearValue) VkClearValue clearValue;
/// };
/// ```
public final class VkClearAttachment extends GroupType {
    /// The struct layout of `VkClearAttachment`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("colorAttachment"),
        overrungl.vulkan.union.VkClearValue.LAYOUT.withName("clearValue")
    );
    /// The byte offset of `aspectMask`.
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    /// The memory layout of `aspectMask`.
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The byte offset of `colorAttachment`.
    public static final long OFFSET_colorAttachment = LAYOUT.byteOffset(PathElement.groupElement("colorAttachment"));
    /// The memory layout of `colorAttachment`.
    public static final MemoryLayout LAYOUT_colorAttachment = LAYOUT.select(PathElement.groupElement("colorAttachment"));
    /// The [VarHandle] of `colorAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachment"));
    /// The byte offset of `clearValue`.
    public static final long OFFSET_clearValue = LAYOUT.byteOffset(PathElement.groupElement("clearValue"));
    /// The memory layout of `clearValue`.
    public static final MemoryLayout LAYOUT_clearValue = LAYOUT.select(PathElement.groupElement("clearValue"));

    /// Creates `VkClearAttachment` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClearAttachment(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClearAttachment` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearAttachment of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearAttachment(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClearAttachment` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearAttachment ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearAttachment(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClearAttachment` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearAttachment ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearAttachment(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClearAttachment` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearAttachment`
    public static VkClearAttachment alloc(SegmentAllocator allocator) { return new VkClearAttachment(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClearAttachment` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearAttachment`
    public static VkClearAttachment alloc(SegmentAllocator allocator, long count) { return new VkClearAttachment(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkClearAttachment` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param colorAttachment `colorAttachment`
    /// @param clearValue `clearValue`
    /// @return the allocated `VkClearAttachment`
    public static VkClearAttachment allocInit(SegmentAllocator allocator, int aspectMask, int colorAttachment, MemorySegment clearValue) {
        return alloc(allocator).aspectMask(aspectMask).colorAttachment(colorAttachment).clearValue(clearValue);
    }

    /// Allocates a `VkClearAttachment` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param colorAttachment `colorAttachment`
    /// @return the allocated `VkClearAttachment`
    public static VkClearAttachment allocInit(SegmentAllocator allocator, int aspectMask, int colorAttachment) {
        return alloc(allocator).aspectMask(aspectMask).colorAttachment(colorAttachment);
    }

    /// Allocates a `VkClearAttachment` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @return the allocated `VkClearAttachment`
    public static VkClearAttachment allocInit(SegmentAllocator allocator, int aspectMask) {
        return alloc(allocator).aspectMask(aspectMask);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClearAttachment copyFrom(VkClearAttachment src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClearAttachment reinterpret(long count) { return new VkClearAttachment(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    public int aspectMask() { return aspectMask(this.segment(), 0L); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspectMask(MemorySegment segment, long index, int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearAttachment aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

    /// {@return `colorAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorAttachment(MemorySegment segment, long index) { return (int) VH_colorAttachment.get(segment, 0L, index); }
    /// {@return `colorAttachment`}
    public int colorAttachment() { return colorAttachment(this.segment(), 0L); }
    /// Sets `colorAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorAttachment(MemorySegment segment, long index, int value) { VH_colorAttachment.set(segment, 0L, index, value); }
    /// Sets `colorAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearAttachment colorAttachment(int value) { colorAttachment(this.segment(), 0L, value); return this; }

    /// {@return `clearValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment clearValue(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_clearValue, index), LAYOUT_clearValue); }
    /// {@return `clearValue`}
    public MemorySegment clearValue() { return clearValue(this.segment(), 0L); }
    /// Sets `clearValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clearValue(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_clearValue, index), LAYOUT_clearValue.byteSize()); }
    /// Sets `clearValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearAttachment clearValue(MemorySegment value) { clearValue(this.segment(), 0L, value); return this; }
    /// Accepts `clearValue` with the given function.
    /// @param func the function
    /// @return `this`
    public VkClearAttachment clearValue(Consumer<overrungl.vulkan.union.VkClearValue> func) { func.accept(overrungl.vulkan.union.VkClearValue.of(clearValue())); return this; }

    /// Creates a slice of `VkClearAttachment`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClearAttachment`
    public VkClearAttachment asSlice(long index) { return new VkClearAttachment(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClearAttachment`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClearAttachment`
    public VkClearAttachment asSlice(long index, long count) { return new VkClearAttachment(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClearAttachment` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClearAttachment at(long index, Consumer<VkClearAttachment> func) { func.accept(asSlice(index)); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param index the index of the struct buffer
    public int aspectMaskAt(long index) { return aspectMask(this.segment(), index); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClearAttachment aspectMaskAt(long index, int value) { aspectMask(this.segment(), index, value); return this; }

    /// {@return `colorAttachment` at the given index}
    /// @param index the index of the struct buffer
    public int colorAttachmentAt(long index) { return colorAttachment(this.segment(), index); }
    /// Sets `colorAttachment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClearAttachment colorAttachmentAt(long index, int value) { colorAttachment(this.segment(), index, value); return this; }

    /// {@return `clearValue` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment clearValueAt(long index) { return clearValue(this.segment(), index); }
    /// Sets `clearValue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClearAttachment clearValueAt(long index, MemorySegment value) { clearValue(this.segment(), index, value); return this; }
    /// Accepts `clearValue` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkClearAttachment clearValueAt(long index, Consumer<overrungl.vulkan.union.VkClearValue> func) { func.accept(overrungl.vulkan.union.VkClearValue.of(clearValueAt(index))); return this; }

}
