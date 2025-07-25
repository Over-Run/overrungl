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
/// struct VkPipelineColorBlendAttachmentState {
///     (uint32_t) VkBool32 blendEnable;
///     (int) VkBlendFactor srcColorBlendFactor;
///     (int) VkBlendFactor dstColorBlendFactor;
///     (int) VkBlendOp colorBlendOp;
///     (int) VkBlendFactor srcAlphaBlendFactor;
///     (int) VkBlendFactor dstAlphaBlendFactor;
///     (int) VkBlendOp alphaBlendOp;
///     ((uint32_t) VkFlags) VkColorComponentFlags colorWriteMask;
/// };
/// ```
public final class VkPipelineColorBlendAttachmentState extends GroupType {
    /// The struct layout of `VkPipelineColorBlendAttachmentState`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("blendEnable"),
        ValueLayout.JAVA_INT.withName("srcColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("colorBlendOp"),
        ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("alphaBlendOp"),
        ValueLayout.JAVA_INT.withName("colorWriteMask")
    );
    /// The byte offset of `blendEnable`.
    public static final long OFFSET_blendEnable = LAYOUT.byteOffset(PathElement.groupElement("blendEnable"));
    /// The memory layout of `blendEnable`.
    public static final MemoryLayout LAYOUT_blendEnable = LAYOUT.select(PathElement.groupElement("blendEnable"));
    /// The [VarHandle] of `blendEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blendEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendEnable"));
    /// The byte offset of `srcColorBlendFactor`.
    public static final long OFFSET_srcColorBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("srcColorBlendFactor"));
    /// The memory layout of `srcColorBlendFactor`.
    public static final MemoryLayout LAYOUT_srcColorBlendFactor = LAYOUT.select(PathElement.groupElement("srcColorBlendFactor"));
    /// The [VarHandle] of `srcColorBlendFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcColorBlendFactor"));
    /// The byte offset of `dstColorBlendFactor`.
    public static final long OFFSET_dstColorBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("dstColorBlendFactor"));
    /// The memory layout of `dstColorBlendFactor`.
    public static final MemoryLayout LAYOUT_dstColorBlendFactor = LAYOUT.select(PathElement.groupElement("dstColorBlendFactor"));
    /// The [VarHandle] of `dstColorBlendFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstColorBlendFactor"));
    /// The byte offset of `colorBlendOp`.
    public static final long OFFSET_colorBlendOp = LAYOUT.byteOffset(PathElement.groupElement("colorBlendOp"));
    /// The memory layout of `colorBlendOp`.
    public static final MemoryLayout LAYOUT_colorBlendOp = LAYOUT.select(PathElement.groupElement("colorBlendOp"));
    /// The [VarHandle] of `colorBlendOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorBlendOp"));
    /// The byte offset of `srcAlphaBlendFactor`.
    public static final long OFFSET_srcAlphaBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("srcAlphaBlendFactor"));
    /// The memory layout of `srcAlphaBlendFactor`.
    public static final MemoryLayout LAYOUT_srcAlphaBlendFactor = LAYOUT.select(PathElement.groupElement("srcAlphaBlendFactor"));
    /// The [VarHandle] of `srcAlphaBlendFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAlphaBlendFactor"));
    /// The byte offset of `dstAlphaBlendFactor`.
    public static final long OFFSET_dstAlphaBlendFactor = LAYOUT.byteOffset(PathElement.groupElement("dstAlphaBlendFactor"));
    /// The memory layout of `dstAlphaBlendFactor`.
    public static final MemoryLayout LAYOUT_dstAlphaBlendFactor = LAYOUT.select(PathElement.groupElement("dstAlphaBlendFactor"));
    /// The [VarHandle] of `dstAlphaBlendFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAlphaBlendFactor"));
    /// The byte offset of `alphaBlendOp`.
    public static final long OFFSET_alphaBlendOp = LAYOUT.byteOffset(PathElement.groupElement("alphaBlendOp"));
    /// The memory layout of `alphaBlendOp`.
    public static final MemoryLayout LAYOUT_alphaBlendOp = LAYOUT.select(PathElement.groupElement("alphaBlendOp"));
    /// The [VarHandle] of `alphaBlendOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alphaBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaBlendOp"));
    /// The byte offset of `colorWriteMask`.
    public static final long OFFSET_colorWriteMask = LAYOUT.byteOffset(PathElement.groupElement("colorWriteMask"));
    /// The memory layout of `colorWriteMask`.
    public static final MemoryLayout LAYOUT_colorWriteMask = LAYOUT.select(PathElement.groupElement("colorWriteMask"));
    /// The [VarHandle] of `colorWriteMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorWriteMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorWriteMask"));

    /// Creates `VkPipelineColorBlendAttachmentState` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineColorBlendAttachmentState(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineColorBlendAttachmentState` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAttachmentState of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineColorBlendAttachmentState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAttachmentState ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineColorBlendAttachmentState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAttachmentState ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendAttachmentState(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorBlendAttachmentState(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param blendEnable `blendEnable`
    /// @param srcColorBlendFactor `srcColorBlendFactor`
    /// @param dstColorBlendFactor `dstColorBlendFactor`
    /// @param colorBlendOp `colorBlendOp`
    /// @param srcAlphaBlendFactor `srcAlphaBlendFactor`
    /// @param dstAlphaBlendFactor `dstAlphaBlendFactor`
    /// @param alphaBlendOp `alphaBlendOp`
    /// @param colorWriteMask `colorWriteMask`
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState allocInit(SegmentAllocator allocator, int blendEnable, int srcColorBlendFactor, int dstColorBlendFactor, int colorBlendOp, int srcAlphaBlendFactor, int dstAlphaBlendFactor, int alphaBlendOp, int colorWriteMask) {
        return alloc(allocator).blendEnable(blendEnable).srcColorBlendFactor(srcColorBlendFactor).dstColorBlendFactor(dstColorBlendFactor).colorBlendOp(colorBlendOp).srcAlphaBlendFactor(srcAlphaBlendFactor).dstAlphaBlendFactor(dstAlphaBlendFactor).alphaBlendOp(alphaBlendOp).colorWriteMask(colorWriteMask);
    }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param blendEnable `blendEnable`
    /// @param srcColorBlendFactor `srcColorBlendFactor`
    /// @param dstColorBlendFactor `dstColorBlendFactor`
    /// @param colorBlendOp `colorBlendOp`
    /// @param srcAlphaBlendFactor `srcAlphaBlendFactor`
    /// @param dstAlphaBlendFactor `dstAlphaBlendFactor`
    /// @param alphaBlendOp `alphaBlendOp`
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState allocInit(SegmentAllocator allocator, int blendEnable, int srcColorBlendFactor, int dstColorBlendFactor, int colorBlendOp, int srcAlphaBlendFactor, int dstAlphaBlendFactor, int alphaBlendOp) {
        return alloc(allocator).blendEnable(blendEnable).srcColorBlendFactor(srcColorBlendFactor).dstColorBlendFactor(dstColorBlendFactor).colorBlendOp(colorBlendOp).srcAlphaBlendFactor(srcAlphaBlendFactor).dstAlphaBlendFactor(dstAlphaBlendFactor).alphaBlendOp(alphaBlendOp);
    }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param blendEnable `blendEnable`
    /// @param srcColorBlendFactor `srcColorBlendFactor`
    /// @param dstColorBlendFactor `dstColorBlendFactor`
    /// @param colorBlendOp `colorBlendOp`
    /// @param srcAlphaBlendFactor `srcAlphaBlendFactor`
    /// @param dstAlphaBlendFactor `dstAlphaBlendFactor`
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState allocInit(SegmentAllocator allocator, int blendEnable, int srcColorBlendFactor, int dstColorBlendFactor, int colorBlendOp, int srcAlphaBlendFactor, int dstAlphaBlendFactor) {
        return alloc(allocator).blendEnable(blendEnable).srcColorBlendFactor(srcColorBlendFactor).dstColorBlendFactor(dstColorBlendFactor).colorBlendOp(colorBlendOp).srcAlphaBlendFactor(srcAlphaBlendFactor).dstAlphaBlendFactor(dstAlphaBlendFactor);
    }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param blendEnable `blendEnable`
    /// @param srcColorBlendFactor `srcColorBlendFactor`
    /// @param dstColorBlendFactor `dstColorBlendFactor`
    /// @param colorBlendOp `colorBlendOp`
    /// @param srcAlphaBlendFactor `srcAlphaBlendFactor`
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState allocInit(SegmentAllocator allocator, int blendEnable, int srcColorBlendFactor, int dstColorBlendFactor, int colorBlendOp, int srcAlphaBlendFactor) {
        return alloc(allocator).blendEnable(blendEnable).srcColorBlendFactor(srcColorBlendFactor).dstColorBlendFactor(dstColorBlendFactor).colorBlendOp(colorBlendOp).srcAlphaBlendFactor(srcAlphaBlendFactor);
    }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param blendEnable `blendEnable`
    /// @param srcColorBlendFactor `srcColorBlendFactor`
    /// @param dstColorBlendFactor `dstColorBlendFactor`
    /// @param colorBlendOp `colorBlendOp`
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState allocInit(SegmentAllocator allocator, int blendEnable, int srcColorBlendFactor, int dstColorBlendFactor, int colorBlendOp) {
        return alloc(allocator).blendEnable(blendEnable).srcColorBlendFactor(srcColorBlendFactor).dstColorBlendFactor(dstColorBlendFactor).colorBlendOp(colorBlendOp);
    }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param blendEnable `blendEnable`
    /// @param srcColorBlendFactor `srcColorBlendFactor`
    /// @param dstColorBlendFactor `dstColorBlendFactor`
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState allocInit(SegmentAllocator allocator, int blendEnable, int srcColorBlendFactor, int dstColorBlendFactor) {
        return alloc(allocator).blendEnable(blendEnable).srcColorBlendFactor(srcColorBlendFactor).dstColorBlendFactor(dstColorBlendFactor);
    }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param blendEnable `blendEnable`
    /// @param srcColorBlendFactor `srcColorBlendFactor`
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState allocInit(SegmentAllocator allocator, int blendEnable, int srcColorBlendFactor) {
        return alloc(allocator).blendEnable(blendEnable).srcColorBlendFactor(srcColorBlendFactor);
    }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param blendEnable `blendEnable`
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState allocInit(SegmentAllocator allocator, int blendEnable) {
        return alloc(allocator).blendEnable(blendEnable);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineColorBlendAttachmentState copyFrom(VkPipelineColorBlendAttachmentState src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineColorBlendAttachmentState reinterpret(long count) { return new VkPipelineColorBlendAttachmentState(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `blendEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blendEnable(MemorySegment segment, long index) { return (int) VH_blendEnable.get(segment, 0L, index); }
    /// {@return `blendEnable`}
    public int blendEnable() { return blendEnable(this.segment(), 0L); }
    /// Sets `blendEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blendEnable(MemorySegment segment, long index, int value) { VH_blendEnable.set(segment, 0L, index, value); }
    /// Sets `blendEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState blendEnable(int value) { blendEnable(this.segment(), 0L, value); return this; }

    /// {@return `srcColorBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcColorBlendFactor(MemorySegment segment, long index) { return (int) VH_srcColorBlendFactor.get(segment, 0L, index); }
    /// {@return `srcColorBlendFactor`}
    public int srcColorBlendFactor() { return srcColorBlendFactor(this.segment(), 0L); }
    /// Sets `srcColorBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcColorBlendFactor(MemorySegment segment, long index, int value) { VH_srcColorBlendFactor.set(segment, 0L, index, value); }
    /// Sets `srcColorBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState srcColorBlendFactor(int value) { srcColorBlendFactor(this.segment(), 0L, value); return this; }

    /// {@return `dstColorBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstColorBlendFactor(MemorySegment segment, long index) { return (int) VH_dstColorBlendFactor.get(segment, 0L, index); }
    /// {@return `dstColorBlendFactor`}
    public int dstColorBlendFactor() { return dstColorBlendFactor(this.segment(), 0L); }
    /// Sets `dstColorBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstColorBlendFactor(MemorySegment segment, long index, int value) { VH_dstColorBlendFactor.set(segment, 0L, index, value); }
    /// Sets `dstColorBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState dstColorBlendFactor(int value) { dstColorBlendFactor(this.segment(), 0L, value); return this; }

    /// {@return `colorBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorBlendOp(MemorySegment segment, long index) { return (int) VH_colorBlendOp.get(segment, 0L, index); }
    /// {@return `colorBlendOp`}
    public int colorBlendOp() { return colorBlendOp(this.segment(), 0L); }
    /// Sets `colorBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorBlendOp(MemorySegment segment, long index, int value) { VH_colorBlendOp.set(segment, 0L, index, value); }
    /// Sets `colorBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState colorBlendOp(int value) { colorBlendOp(this.segment(), 0L, value); return this; }

    /// {@return `srcAlphaBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcAlphaBlendFactor(MemorySegment segment, long index) { return (int) VH_srcAlphaBlendFactor.get(segment, 0L, index); }
    /// {@return `srcAlphaBlendFactor`}
    public int srcAlphaBlendFactor() { return srcAlphaBlendFactor(this.segment(), 0L); }
    /// Sets `srcAlphaBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAlphaBlendFactor(MemorySegment segment, long index, int value) { VH_srcAlphaBlendFactor.set(segment, 0L, index, value); }
    /// Sets `srcAlphaBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(int value) { srcAlphaBlendFactor(this.segment(), 0L, value); return this; }

    /// {@return `dstAlphaBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstAlphaBlendFactor(MemorySegment segment, long index) { return (int) VH_dstAlphaBlendFactor.get(segment, 0L, index); }
    /// {@return `dstAlphaBlendFactor`}
    public int dstAlphaBlendFactor() { return dstAlphaBlendFactor(this.segment(), 0L); }
    /// Sets `dstAlphaBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAlphaBlendFactor(MemorySegment segment, long index, int value) { VH_dstAlphaBlendFactor.set(segment, 0L, index, value); }
    /// Sets `dstAlphaBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(int value) { dstAlphaBlendFactor(this.segment(), 0L, value); return this; }

    /// {@return `alphaBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int alphaBlendOp(MemorySegment segment, long index) { return (int) VH_alphaBlendOp.get(segment, 0L, index); }
    /// {@return `alphaBlendOp`}
    public int alphaBlendOp() { return alphaBlendOp(this.segment(), 0L); }
    /// Sets `alphaBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alphaBlendOp(MemorySegment segment, long index, int value) { VH_alphaBlendOp.set(segment, 0L, index, value); }
    /// Sets `alphaBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState alphaBlendOp(int value) { alphaBlendOp(this.segment(), 0L, value); return this; }

    /// {@return `colorWriteMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorWriteMask(MemorySegment segment, long index) { return (int) VH_colorWriteMask.get(segment, 0L, index); }
    /// {@return `colorWriteMask`}
    public int colorWriteMask() { return colorWriteMask(this.segment(), 0L); }
    /// Sets `colorWriteMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorWriteMask(MemorySegment segment, long index, int value) { VH_colorWriteMask.set(segment, 0L, index, value); }
    /// Sets `colorWriteMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState colorWriteMask(int value) { colorWriteMask(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineColorBlendAttachmentState`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineColorBlendAttachmentState`
    public VkPipelineColorBlendAttachmentState asSlice(long index) { return new VkPipelineColorBlendAttachmentState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineColorBlendAttachmentState`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineColorBlendAttachmentState`
    public VkPipelineColorBlendAttachmentState asSlice(long index, long count) { return new VkPipelineColorBlendAttachmentState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineColorBlendAttachmentState` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineColorBlendAttachmentState at(long index, Consumer<VkPipelineColorBlendAttachmentState> func) { func.accept(asSlice(index)); return this; }

    /// {@return `blendEnable` at the given index}
    /// @param index the index of the struct buffer
    public int blendEnableAt(long index) { return blendEnable(this.segment(), index); }
    /// Sets `blendEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState blendEnableAt(long index, int value) { blendEnable(this.segment(), index, value); return this; }

    /// {@return `srcColorBlendFactor` at the given index}
    /// @param index the index of the struct buffer
    public int srcColorBlendFactorAt(long index) { return srcColorBlendFactor(this.segment(), index); }
    /// Sets `srcColorBlendFactor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState srcColorBlendFactorAt(long index, int value) { srcColorBlendFactor(this.segment(), index, value); return this; }

    /// {@return `dstColorBlendFactor` at the given index}
    /// @param index the index of the struct buffer
    public int dstColorBlendFactorAt(long index) { return dstColorBlendFactor(this.segment(), index); }
    /// Sets `dstColorBlendFactor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState dstColorBlendFactorAt(long index, int value) { dstColorBlendFactor(this.segment(), index, value); return this; }

    /// {@return `colorBlendOp` at the given index}
    /// @param index the index of the struct buffer
    public int colorBlendOpAt(long index) { return colorBlendOp(this.segment(), index); }
    /// Sets `colorBlendOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState colorBlendOpAt(long index, int value) { colorBlendOp(this.segment(), index, value); return this; }

    /// {@return `srcAlphaBlendFactor` at the given index}
    /// @param index the index of the struct buffer
    public int srcAlphaBlendFactorAt(long index) { return srcAlphaBlendFactor(this.segment(), index); }
    /// Sets `srcAlphaBlendFactor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactorAt(long index, int value) { srcAlphaBlendFactor(this.segment(), index, value); return this; }

    /// {@return `dstAlphaBlendFactor` at the given index}
    /// @param index the index of the struct buffer
    public int dstAlphaBlendFactorAt(long index) { return dstAlphaBlendFactor(this.segment(), index); }
    /// Sets `dstAlphaBlendFactor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactorAt(long index, int value) { dstAlphaBlendFactor(this.segment(), index, value); return this; }

    /// {@return `alphaBlendOp` at the given index}
    /// @param index the index of the struct buffer
    public int alphaBlendOpAt(long index) { return alphaBlendOp(this.segment(), index); }
    /// Sets `alphaBlendOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState alphaBlendOpAt(long index, int value) { alphaBlendOp(this.segment(), index, value); return this; }

    /// {@return `colorWriteMask` at the given index}
    /// @param index the index of the struct buffer
    public int colorWriteMaskAt(long index) { return colorWriteMask(this.segment(), index); }
    /// Sets `colorWriteMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState colorWriteMaskAt(long index, int value) { colorWriteMask(this.segment(), index, value); return this; }

}
