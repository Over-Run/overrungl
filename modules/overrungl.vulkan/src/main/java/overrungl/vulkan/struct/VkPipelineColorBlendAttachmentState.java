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
/// ### blendEnable
/// [VarHandle][#VH_blendEnable] - [Getter][#blendEnable()] - [Setter][#blendEnable(int)]
/// ### srcColorBlendFactor
/// [VarHandle][#VH_srcColorBlendFactor] - [Getter][#srcColorBlendFactor()] - [Setter][#srcColorBlendFactor(int)]
/// ### dstColorBlendFactor
/// [VarHandle][#VH_dstColorBlendFactor] - [Getter][#dstColorBlendFactor()] - [Setter][#dstColorBlendFactor(int)]
/// ### colorBlendOp
/// [VarHandle][#VH_colorBlendOp] - [Getter][#colorBlendOp()] - [Setter][#colorBlendOp(int)]
/// ### srcAlphaBlendFactor
/// [VarHandle][#VH_srcAlphaBlendFactor] - [Getter][#srcAlphaBlendFactor()] - [Setter][#srcAlphaBlendFactor(int)]
/// ### dstAlphaBlendFactor
/// [VarHandle][#VH_dstAlphaBlendFactor] - [Getter][#dstAlphaBlendFactor()] - [Setter][#dstAlphaBlendFactor(int)]
/// ### alphaBlendOp
/// [VarHandle][#VH_alphaBlendOp] - [Getter][#alphaBlendOp()] - [Setter][#alphaBlendOp(int)]
/// ### colorWriteMask
/// [VarHandle][#VH_colorWriteMask] - [Getter][#colorWriteMask()] - [Setter][#colorWriteMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineColorBlendAttachmentState {
///     VkBool32 blendEnable;
///     VkBlendFactor srcColorBlendFactor;
///     VkBlendFactor dstColorBlendFactor;
///     VkBlendOp colorBlendOp;
///     VkBlendFactor srcAlphaBlendFactor;
///     VkBlendFactor dstAlphaBlendFactor;
///     VkBlendOp alphaBlendOp;
///     VkColorComponentFlags colorWriteMask;
/// } VkPipelineColorBlendAttachmentState;
/// ```
public final class VkPipelineColorBlendAttachmentState extends Struct {
    /// The struct layout of `VkPipelineColorBlendAttachmentState`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("blendEnable"),
        ValueLayout.JAVA_INT.withName("srcColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("colorBlendOp"),
        ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("alphaBlendOp"),
        ValueLayout.JAVA_INT.withName("colorWriteMask")
    );
    /// The [VarHandle] of `blendEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blendEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendEnable"));
    /// The [VarHandle] of `srcColorBlendFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcColorBlendFactor"));
    /// The [VarHandle] of `dstColorBlendFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstColorBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstColorBlendFactor"));
    /// The [VarHandle] of `colorBlendOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorBlendOp"));
    /// The [VarHandle] of `srcAlphaBlendFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAlphaBlendFactor"));
    /// The [VarHandle] of `dstAlphaBlendFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstAlphaBlendFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAlphaBlendFactor"));
    /// The [VarHandle] of `alphaBlendOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_alphaBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaBlendOp"));
    /// The [VarHandle] of `colorWriteMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorWriteMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorWriteMask"));

    /// Creates `VkPipelineColorBlendAttachmentState` with the given segment.
    /// @param segment the memory segment
    public VkPipelineColorBlendAttachmentState(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineColorBlendAttachmentState` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAttachmentState of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment); }

    /// Creates `VkPipelineColorBlendAttachmentState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAttachmentState ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineColorBlendAttachmentState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAttachmentState ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorBlendAttachmentState(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendAttachmentState(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineColorBlendAttachmentState` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineColorBlendAttachmentState`
    public static VkPipelineColorBlendAttachmentState alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorBlendAttachmentState(allocator.allocate(LAYOUT, count)); }

    /// {@return `blendEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_blendEnable(MemorySegment segment, long index) { return (int) VH_blendEnable.get(segment, 0L, index); }
    /// {@return `blendEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_blendEnable(MemorySegment segment) { return VkPipelineColorBlendAttachmentState.get_blendEnable(segment, 0L); }
    /// {@return `blendEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int blendEnableAt(long index) { return VkPipelineColorBlendAttachmentState.get_blendEnable(this.segment(), index); }
    /// {@return `blendEnable`}
    public @CType("VkBool32") int blendEnable() { return VkPipelineColorBlendAttachmentState.get_blendEnable(this.segment()); }
    /// Sets `blendEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blendEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_blendEnable.set(segment, 0L, index, value); }
    /// Sets `blendEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blendEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineColorBlendAttachmentState.set_blendEnable(segment, 0L, value); }
    /// Sets `blendEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState blendEnableAt(long index, @CType("VkBool32") int value) { VkPipelineColorBlendAttachmentState.set_blendEnable(this.segment(), index, value); return this; }
    /// Sets `blendEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState blendEnable(@CType("VkBool32") int value) { VkPipelineColorBlendAttachmentState.set_blendEnable(this.segment(), value); return this; }

    /// {@return `srcColorBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendFactor") int get_srcColorBlendFactor(MemorySegment segment, long index) { return (int) VH_srcColorBlendFactor.get(segment, 0L, index); }
    /// {@return `srcColorBlendFactor`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendFactor") int get_srcColorBlendFactor(MemorySegment segment) { return VkPipelineColorBlendAttachmentState.get_srcColorBlendFactor(segment, 0L); }
    /// {@return `srcColorBlendFactor` at the given index}
    /// @param index the index
    public @CType("VkBlendFactor") int srcColorBlendFactorAt(long index) { return VkPipelineColorBlendAttachmentState.get_srcColorBlendFactor(this.segment(), index); }
    /// {@return `srcColorBlendFactor`}
    public @CType("VkBlendFactor") int srcColorBlendFactor() { return VkPipelineColorBlendAttachmentState.get_srcColorBlendFactor(this.segment()); }
    /// Sets `srcColorBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcColorBlendFactor(MemorySegment segment, long index, @CType("VkBlendFactor") int value) { VH_srcColorBlendFactor.set(segment, 0L, index, value); }
    /// Sets `srcColorBlendFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcColorBlendFactor(MemorySegment segment, @CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_srcColorBlendFactor(segment, 0L, value); }
    /// Sets `srcColorBlendFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState srcColorBlendFactorAt(long index, @CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_srcColorBlendFactor(this.segment(), index, value); return this; }
    /// Sets `srcColorBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState srcColorBlendFactor(@CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_srcColorBlendFactor(this.segment(), value); return this; }

    /// {@return `dstColorBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendFactor") int get_dstColorBlendFactor(MemorySegment segment, long index) { return (int) VH_dstColorBlendFactor.get(segment, 0L, index); }
    /// {@return `dstColorBlendFactor`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendFactor") int get_dstColorBlendFactor(MemorySegment segment) { return VkPipelineColorBlendAttachmentState.get_dstColorBlendFactor(segment, 0L); }
    /// {@return `dstColorBlendFactor` at the given index}
    /// @param index the index
    public @CType("VkBlendFactor") int dstColorBlendFactorAt(long index) { return VkPipelineColorBlendAttachmentState.get_dstColorBlendFactor(this.segment(), index); }
    /// {@return `dstColorBlendFactor`}
    public @CType("VkBlendFactor") int dstColorBlendFactor() { return VkPipelineColorBlendAttachmentState.get_dstColorBlendFactor(this.segment()); }
    /// Sets `dstColorBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstColorBlendFactor(MemorySegment segment, long index, @CType("VkBlendFactor") int value) { VH_dstColorBlendFactor.set(segment, 0L, index, value); }
    /// Sets `dstColorBlendFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstColorBlendFactor(MemorySegment segment, @CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_dstColorBlendFactor(segment, 0L, value); }
    /// Sets `dstColorBlendFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState dstColorBlendFactorAt(long index, @CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_dstColorBlendFactor(this.segment(), index, value); return this; }
    /// Sets `dstColorBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState dstColorBlendFactor(@CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_dstColorBlendFactor(this.segment(), value); return this; }

    /// {@return `colorBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendOp") int get_colorBlendOp(MemorySegment segment, long index) { return (int) VH_colorBlendOp.get(segment, 0L, index); }
    /// {@return `colorBlendOp`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendOp") int get_colorBlendOp(MemorySegment segment) { return VkPipelineColorBlendAttachmentState.get_colorBlendOp(segment, 0L); }
    /// {@return `colorBlendOp` at the given index}
    /// @param index the index
    public @CType("VkBlendOp") int colorBlendOpAt(long index) { return VkPipelineColorBlendAttachmentState.get_colorBlendOp(this.segment(), index); }
    /// {@return `colorBlendOp`}
    public @CType("VkBlendOp") int colorBlendOp() { return VkPipelineColorBlendAttachmentState.get_colorBlendOp(this.segment()); }
    /// Sets `colorBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorBlendOp(MemorySegment segment, long index, @CType("VkBlendOp") int value) { VH_colorBlendOp.set(segment, 0L, index, value); }
    /// Sets `colorBlendOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorBlendOp(MemorySegment segment, @CType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.set_colorBlendOp(segment, 0L, value); }
    /// Sets `colorBlendOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState colorBlendOpAt(long index, @CType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.set_colorBlendOp(this.segment(), index, value); return this; }
    /// Sets `colorBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState colorBlendOp(@CType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.set_colorBlendOp(this.segment(), value); return this; }

    /// {@return `srcAlphaBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendFactor") int get_srcAlphaBlendFactor(MemorySegment segment, long index) { return (int) VH_srcAlphaBlendFactor.get(segment, 0L, index); }
    /// {@return `srcAlphaBlendFactor`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendFactor") int get_srcAlphaBlendFactor(MemorySegment segment) { return VkPipelineColorBlendAttachmentState.get_srcAlphaBlendFactor(segment, 0L); }
    /// {@return `srcAlphaBlendFactor` at the given index}
    /// @param index the index
    public @CType("VkBlendFactor") int srcAlphaBlendFactorAt(long index) { return VkPipelineColorBlendAttachmentState.get_srcAlphaBlendFactor(this.segment(), index); }
    /// {@return `srcAlphaBlendFactor`}
    public @CType("VkBlendFactor") int srcAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.get_srcAlphaBlendFactor(this.segment()); }
    /// Sets `srcAlphaBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAlphaBlendFactor(MemorySegment segment, long index, @CType("VkBlendFactor") int value) { VH_srcAlphaBlendFactor.set(segment, 0L, index, value); }
    /// Sets `srcAlphaBlendFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAlphaBlendFactor(MemorySegment segment, @CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_srcAlphaBlendFactor(segment, 0L, value); }
    /// Sets `srcAlphaBlendFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactorAt(long index, @CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_srcAlphaBlendFactor(this.segment(), index, value); return this; }
    /// Sets `srcAlphaBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(@CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_srcAlphaBlendFactor(this.segment(), value); return this; }

    /// {@return `dstAlphaBlendFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendFactor") int get_dstAlphaBlendFactor(MemorySegment segment, long index) { return (int) VH_dstAlphaBlendFactor.get(segment, 0L, index); }
    /// {@return `dstAlphaBlendFactor`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendFactor") int get_dstAlphaBlendFactor(MemorySegment segment) { return VkPipelineColorBlendAttachmentState.get_dstAlphaBlendFactor(segment, 0L); }
    /// {@return `dstAlphaBlendFactor` at the given index}
    /// @param index the index
    public @CType("VkBlendFactor") int dstAlphaBlendFactorAt(long index) { return VkPipelineColorBlendAttachmentState.get_dstAlphaBlendFactor(this.segment(), index); }
    /// {@return `dstAlphaBlendFactor`}
    public @CType("VkBlendFactor") int dstAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.get_dstAlphaBlendFactor(this.segment()); }
    /// Sets `dstAlphaBlendFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAlphaBlendFactor(MemorySegment segment, long index, @CType("VkBlendFactor") int value) { VH_dstAlphaBlendFactor.set(segment, 0L, index, value); }
    /// Sets `dstAlphaBlendFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAlphaBlendFactor(MemorySegment segment, @CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_dstAlphaBlendFactor(segment, 0L, value); }
    /// Sets `dstAlphaBlendFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactorAt(long index, @CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_dstAlphaBlendFactor(this.segment(), index, value); return this; }
    /// Sets `dstAlphaBlendFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(@CType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.set_dstAlphaBlendFactor(this.segment(), value); return this; }

    /// {@return `alphaBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendOp") int get_alphaBlendOp(MemorySegment segment, long index) { return (int) VH_alphaBlendOp.get(segment, 0L, index); }
    /// {@return `alphaBlendOp`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendOp") int get_alphaBlendOp(MemorySegment segment) { return VkPipelineColorBlendAttachmentState.get_alphaBlendOp(segment, 0L); }
    /// {@return `alphaBlendOp` at the given index}
    /// @param index the index
    public @CType("VkBlendOp") int alphaBlendOpAt(long index) { return VkPipelineColorBlendAttachmentState.get_alphaBlendOp(this.segment(), index); }
    /// {@return `alphaBlendOp`}
    public @CType("VkBlendOp") int alphaBlendOp() { return VkPipelineColorBlendAttachmentState.get_alphaBlendOp(this.segment()); }
    /// Sets `alphaBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alphaBlendOp(MemorySegment segment, long index, @CType("VkBlendOp") int value) { VH_alphaBlendOp.set(segment, 0L, index, value); }
    /// Sets `alphaBlendOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alphaBlendOp(MemorySegment segment, @CType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.set_alphaBlendOp(segment, 0L, value); }
    /// Sets `alphaBlendOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState alphaBlendOpAt(long index, @CType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.set_alphaBlendOp(this.segment(), index, value); return this; }
    /// Sets `alphaBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState alphaBlendOp(@CType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.set_alphaBlendOp(this.segment(), value); return this; }

    /// {@return `colorWriteMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkColorComponentFlags") int get_colorWriteMask(MemorySegment segment, long index) { return (int) VH_colorWriteMask.get(segment, 0L, index); }
    /// {@return `colorWriteMask`}
    /// @param segment the segment of the struct
    public static @CType("VkColorComponentFlags") int get_colorWriteMask(MemorySegment segment) { return VkPipelineColorBlendAttachmentState.get_colorWriteMask(segment, 0L); }
    /// {@return `colorWriteMask` at the given index}
    /// @param index the index
    public @CType("VkColorComponentFlags") int colorWriteMaskAt(long index) { return VkPipelineColorBlendAttachmentState.get_colorWriteMask(this.segment(), index); }
    /// {@return `colorWriteMask`}
    public @CType("VkColorComponentFlags") int colorWriteMask() { return VkPipelineColorBlendAttachmentState.get_colorWriteMask(this.segment()); }
    /// Sets `colorWriteMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorWriteMask(MemorySegment segment, long index, @CType("VkColorComponentFlags") int value) { VH_colorWriteMask.set(segment, 0L, index, value); }
    /// Sets `colorWriteMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorWriteMask(MemorySegment segment, @CType("VkColorComponentFlags") int value) { VkPipelineColorBlendAttachmentState.set_colorWriteMask(segment, 0L, value); }
    /// Sets `colorWriteMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState colorWriteMaskAt(long index, @CType("VkColorComponentFlags") int value) { VkPipelineColorBlendAttachmentState.set_colorWriteMask(this.segment(), index, value); return this; }
    /// Sets `colorWriteMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAttachmentState colorWriteMask(@CType("VkColorComponentFlags") int value) { VkPipelineColorBlendAttachmentState.set_colorWriteMask(this.segment(), value); return this; }

}
