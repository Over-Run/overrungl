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
/// ### srcSubpass
/// [VarHandle][#VH_srcSubpass] - [Getter][#srcSubpass()] - [Setter][#srcSubpass(int)]
/// ### dstSubpass
/// [VarHandle][#VH_dstSubpass] - [Getter][#dstSubpass()] - [Setter][#dstSubpass(int)]
/// ### srcStageMask
/// [VarHandle][#VH_srcStageMask] - [Getter][#srcStageMask()] - [Setter][#srcStageMask(int)]
/// ### dstStageMask
/// [VarHandle][#VH_dstStageMask] - [Getter][#dstStageMask()] - [Setter][#dstStageMask(int)]
/// ### srcAccessMask
/// [VarHandle][#VH_srcAccessMask] - [Getter][#srcAccessMask()] - [Setter][#srcAccessMask(int)]
/// ### dstAccessMask
/// [VarHandle][#VH_dstAccessMask] - [Getter][#dstAccessMask()] - [Setter][#dstAccessMask(int)]
/// ### dependencyFlags
/// [VarHandle][#VH_dependencyFlags] - [Getter][#dependencyFlags()] - [Setter][#dependencyFlags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassDependency {
///     uint32_t srcSubpass;
///     uint32_t dstSubpass;
///     VkPipelineStageFlags srcStageMask;
///     VkPipelineStageFlags dstStageMask;
///     VkAccessFlags srcAccessMask;
///     VkAccessFlags dstAccessMask;
///     VkDependencyFlags dependencyFlags;
/// } VkSubpassDependency;
/// ```
public final class VkSubpassDependency extends Struct {
    /// The struct layout of `VkSubpassDependency`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("srcSubpass"),
        ValueLayout.JAVA_INT.withName("dstSubpass"),
        ValueLayout.JAVA_INT.withName("srcStageMask"),
        ValueLayout.JAVA_INT.withName("dstStageMask"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("dependencyFlags")
    );
    /// The [VarHandle] of `srcSubpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcSubpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubpass"));
    /// The [VarHandle] of `dstSubpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstSubpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubpass"));
    /// The [VarHandle] of `srcStageMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    /// The [VarHandle] of `dstStageMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `dependencyFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dependencyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyFlags"));

    /// Creates `VkSubpassDependency` with the given segment.
    /// @param segment the memory segment
    public VkSubpassDependency(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassDependency` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDependency of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDependency(segment); }

    /// Creates `VkSubpassDependency` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDependency ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDependency(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassDependency` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDependency ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDependency(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSubpassDependency` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDependency`
    public static VkSubpassDependency alloc(SegmentAllocator allocator) { return new VkSubpassDependency(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassDependency` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassDependency`
    public static VkSubpassDependency alloc(SegmentAllocator allocator, long count) { return new VkSubpassDependency(allocator.allocate(LAYOUT, count)); }

    /// {@return `srcSubpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_srcSubpass(MemorySegment segment, long index) { return (int) VH_srcSubpass.get(segment, 0L, index); }
    /// {@return `srcSubpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_srcSubpass(MemorySegment segment) { return VkSubpassDependency.get_srcSubpass(segment, 0L); }
    /// {@return `srcSubpass` at the given index}
    /// @param index the index
    public @CType("uint32_t") int srcSubpassAt(long index) { return VkSubpassDependency.get_srcSubpass(this.segment(), index); }
    /// {@return `srcSubpass`}
    public @CType("uint32_t") int srcSubpass() { return VkSubpassDependency.get_srcSubpass(this.segment()); }
    /// Sets `srcSubpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcSubpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_srcSubpass.set(segment, 0L, index, value); }
    /// Sets `srcSubpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcSubpass(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDependency.set_srcSubpass(segment, 0L, value); }
    /// Sets `srcSubpass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcSubpassAt(long index, @CType("uint32_t") int value) { VkSubpassDependency.set_srcSubpass(this.segment(), index, value); return this; }
    /// Sets `srcSubpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcSubpass(@CType("uint32_t") int value) { VkSubpassDependency.set_srcSubpass(this.segment(), value); return this; }

    /// {@return `dstSubpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstSubpass(MemorySegment segment, long index) { return (int) VH_dstSubpass.get(segment, 0L, index); }
    /// {@return `dstSubpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstSubpass(MemorySegment segment) { return VkSubpassDependency.get_dstSubpass(segment, 0L); }
    /// {@return `dstSubpass` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dstSubpassAt(long index) { return VkSubpassDependency.get_dstSubpass(this.segment(), index); }
    /// {@return `dstSubpass`}
    public @CType("uint32_t") int dstSubpass() { return VkSubpassDependency.get_dstSubpass(this.segment()); }
    /// Sets `dstSubpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstSubpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstSubpass.set(segment, 0L, index, value); }
    /// Sets `dstSubpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstSubpass(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDependency.set_dstSubpass(segment, 0L, value); }
    /// Sets `dstSubpass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstSubpassAt(long index, @CType("uint32_t") int value) { VkSubpassDependency.set_dstSubpass(this.segment(), index, value); return this; }
    /// Sets `dstSubpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstSubpass(@CType("uint32_t") int value) { VkSubpassDependency.set_dstSubpass(this.segment(), value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags") int get_srcStageMask(MemorySegment segment, long index) { return (int) VH_srcStageMask.get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags") int get_srcStageMask(MemorySegment segment) { return VkSubpassDependency.get_srcStageMask(segment, 0L); }
    /// {@return `srcStageMask` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags") int srcStageMaskAt(long index) { return VkSubpassDependency.get_srcStageMask(this.segment(), index); }
    /// {@return `srcStageMask`}
    public @CType("VkPipelineStageFlags") int srcStageMask() { return VkSubpassDependency.get_srcStageMask(this.segment()); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags") int value) { VH_srcStageMask.set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, @CType("VkPipelineStageFlags") int value) { VkSubpassDependency.set_srcStageMask(segment, 0L, value); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcStageMaskAt(long index, @CType("VkPipelineStageFlags") int value) { VkSubpassDependency.set_srcStageMask(this.segment(), index, value); return this; }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcStageMask(@CType("VkPipelineStageFlags") int value) { VkSubpassDependency.set_srcStageMask(this.segment(), value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags") int get_dstStageMask(MemorySegment segment, long index) { return (int) VH_dstStageMask.get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags") int get_dstStageMask(MemorySegment segment) { return VkSubpassDependency.get_dstStageMask(segment, 0L); }
    /// {@return `dstStageMask` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags") int dstStageMaskAt(long index) { return VkSubpassDependency.get_dstStageMask(this.segment(), index); }
    /// {@return `dstStageMask`}
    public @CType("VkPipelineStageFlags") int dstStageMask() { return VkSubpassDependency.get_dstStageMask(this.segment()); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags") int value) { VH_dstStageMask.set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, @CType("VkPipelineStageFlags") int value) { VkSubpassDependency.set_dstStageMask(segment, 0L, value); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstStageMaskAt(long index, @CType("VkPipelineStageFlags") int value) { VkSubpassDependency.set_dstStageMask(this.segment(), index, value); return this; }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstStageMask(@CType("VkPipelineStageFlags") int value) { VkSubpassDependency.set_dstStageMask(this.segment(), value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags") int get_srcAccessMask(MemorySegment segment, long index) { return (int) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags") int get_srcAccessMask(MemorySegment segment) { return VkSubpassDependency.get_srcAccessMask(segment, 0L); }
    /// {@return `srcAccessMask` at the given index}
    /// @param index the index
    public @CType("VkAccessFlags") int srcAccessMaskAt(long index) { return VkSubpassDependency.get_srcAccessMask(this.segment(), index); }
    /// {@return `srcAccessMask`}
    public @CType("VkAccessFlags") int srcAccessMask() { return VkSubpassDependency.get_srcAccessMask(this.segment()); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags") int value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, @CType("VkAccessFlags") int value) { VkSubpassDependency.set_srcAccessMask(segment, 0L, value); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcAccessMaskAt(long index, @CType("VkAccessFlags") int value) { VkSubpassDependency.set_srcAccessMask(this.segment(), index, value); return this; }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency srcAccessMask(@CType("VkAccessFlags") int value) { VkSubpassDependency.set_srcAccessMask(this.segment(), value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags") int get_dstAccessMask(MemorySegment segment, long index) { return (int) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags") int get_dstAccessMask(MemorySegment segment) { return VkSubpassDependency.get_dstAccessMask(segment, 0L); }
    /// {@return `dstAccessMask` at the given index}
    /// @param index the index
    public @CType("VkAccessFlags") int dstAccessMaskAt(long index) { return VkSubpassDependency.get_dstAccessMask(this.segment(), index); }
    /// {@return `dstAccessMask`}
    public @CType("VkAccessFlags") int dstAccessMask() { return VkSubpassDependency.get_dstAccessMask(this.segment()); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags") int value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, @CType("VkAccessFlags") int value) { VkSubpassDependency.set_dstAccessMask(segment, 0L, value); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstAccessMaskAt(long index, @CType("VkAccessFlags") int value) { VkSubpassDependency.set_dstAccessMask(this.segment(), index, value); return this; }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dstAccessMask(@CType("VkAccessFlags") int value) { VkSubpassDependency.set_dstAccessMask(this.segment(), value); return this; }

    /// {@return `dependencyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDependencyFlags") int get_dependencyFlags(MemorySegment segment, long index) { return (int) VH_dependencyFlags.get(segment, 0L, index); }
    /// {@return `dependencyFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkDependencyFlags") int get_dependencyFlags(MemorySegment segment) { return VkSubpassDependency.get_dependencyFlags(segment, 0L); }
    /// {@return `dependencyFlags` at the given index}
    /// @param index the index
    public @CType("VkDependencyFlags") int dependencyFlagsAt(long index) { return VkSubpassDependency.get_dependencyFlags(this.segment(), index); }
    /// {@return `dependencyFlags`}
    public @CType("VkDependencyFlags") int dependencyFlags() { return VkSubpassDependency.get_dependencyFlags(this.segment()); }
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dependencyFlags(MemorySegment segment, long index, @CType("VkDependencyFlags") int value) { VH_dependencyFlags.set(segment, 0L, index, value); }
    /// Sets `dependencyFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dependencyFlags(MemorySegment segment, @CType("VkDependencyFlags") int value) { VkSubpassDependency.set_dependencyFlags(segment, 0L, value); }
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dependencyFlagsAt(long index, @CType("VkDependencyFlags") int value) { VkSubpassDependency.set_dependencyFlags(this.segment(), index, value); return this; }
    /// Sets `dependencyFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency dependencyFlags(@CType("VkDependencyFlags") int value) { VkSubpassDependency.set_dependencyFlags(this.segment(), value); return this; }

}
