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
/// ### failOp
/// [VarHandle][#VH_failOp] - [Getter][#failOp()] - [Setter][#failOp(int)]
/// ### passOp
/// [VarHandle][#VH_passOp] - [Getter][#passOp()] - [Setter][#passOp(int)]
/// ### depthFailOp
/// [VarHandle][#VH_depthFailOp] - [Getter][#depthFailOp()] - [Setter][#depthFailOp(int)]
/// ### compareOp
/// [VarHandle][#VH_compareOp] - [Getter][#compareOp()] - [Setter][#compareOp(int)]
/// ### compareMask
/// [VarHandle][#VH_compareMask] - [Getter][#compareMask()] - [Setter][#compareMask(int)]
/// ### writeMask
/// [VarHandle][#VH_writeMask] - [Getter][#writeMask()] - [Setter][#writeMask(int)]
/// ### reference
/// [VarHandle][#VH_reference] - [Getter][#reference()] - [Setter][#reference(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkStencilOpState {
///     VkStencilOp failOp;
///     VkStencilOp passOp;
///     VkStencilOp depthFailOp;
///     VkCompareOp compareOp;
///     uint32_t compareMask;
///     uint32_t writeMask;
///     uint32_t reference;
/// } VkStencilOpState;
/// ```
public final class VkStencilOpState extends Struct {
    /// The struct layout of `VkStencilOpState`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("failOp"),
        ValueLayout.JAVA_INT.withName("passOp"),
        ValueLayout.JAVA_INT.withName("depthFailOp"),
        ValueLayout.JAVA_INT.withName("compareOp"),
        ValueLayout.JAVA_INT.withName("compareMask"),
        ValueLayout.JAVA_INT.withName("writeMask"),
        ValueLayout.JAVA_INT.withName("reference")
    );
    /// The [VarHandle] of `failOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_failOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("failOp"));
    /// The [VarHandle] of `passOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_passOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("passOp"));
    /// The [VarHandle] of `depthFailOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthFailOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthFailOp"));
    /// The [VarHandle] of `compareOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareOp"));
    /// The [VarHandle] of `compareMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compareMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareMask"));
    /// The [VarHandle] of `writeMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_writeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeMask"));
    /// The [VarHandle] of `reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reference"));

    /// Creates `VkStencilOpState` with the given segment.
    /// @param segment the memory segment
    public VkStencilOpState(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkStencilOpState` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStencilOpState of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkStencilOpState(segment); }

    /// Creates `VkStencilOpState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStencilOpState ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkStencilOpState(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkStencilOpState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStencilOpState ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkStencilOpState(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkStencilOpState` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStencilOpState`
    public static VkStencilOpState alloc(SegmentAllocator allocator) { return new VkStencilOpState(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkStencilOpState` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStencilOpState`
    public static VkStencilOpState alloc(SegmentAllocator allocator, long count) { return new VkStencilOpState(allocator.allocate(LAYOUT, count)); }

    /// {@return `failOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStencilOp") int get_failOp(MemorySegment segment, long index) { return (int) VH_failOp.get(segment, 0L, index); }
    /// {@return `failOp`}
    /// @param segment the segment of the struct
    public static @CType("VkStencilOp") int get_failOp(MemorySegment segment) { return VkStencilOpState.get_failOp(segment, 0L); }
    /// {@return `failOp` at the given index}
    /// @param index the index
    public @CType("VkStencilOp") int failOpAt(long index) { return VkStencilOpState.get_failOp(this.segment(), index); }
    /// {@return `failOp`}
    public @CType("VkStencilOp") int failOp() { return VkStencilOpState.get_failOp(this.segment()); }
    /// Sets `failOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_failOp(MemorySegment segment, long index, @CType("VkStencilOp") int value) { VH_failOp.set(segment, 0L, index, value); }
    /// Sets `failOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_failOp(MemorySegment segment, @CType("VkStencilOp") int value) { VkStencilOpState.set_failOp(segment, 0L, value); }
    /// Sets `failOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStencilOpState failOpAt(long index, @CType("VkStencilOp") int value) { VkStencilOpState.set_failOp(this.segment(), index, value); return this; }
    /// Sets `failOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState failOp(@CType("VkStencilOp") int value) { VkStencilOpState.set_failOp(this.segment(), value); return this; }

    /// {@return `passOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStencilOp") int get_passOp(MemorySegment segment, long index) { return (int) VH_passOp.get(segment, 0L, index); }
    /// {@return `passOp`}
    /// @param segment the segment of the struct
    public static @CType("VkStencilOp") int get_passOp(MemorySegment segment) { return VkStencilOpState.get_passOp(segment, 0L); }
    /// {@return `passOp` at the given index}
    /// @param index the index
    public @CType("VkStencilOp") int passOpAt(long index) { return VkStencilOpState.get_passOp(this.segment(), index); }
    /// {@return `passOp`}
    public @CType("VkStencilOp") int passOp() { return VkStencilOpState.get_passOp(this.segment()); }
    /// Sets `passOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_passOp(MemorySegment segment, long index, @CType("VkStencilOp") int value) { VH_passOp.set(segment, 0L, index, value); }
    /// Sets `passOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_passOp(MemorySegment segment, @CType("VkStencilOp") int value) { VkStencilOpState.set_passOp(segment, 0L, value); }
    /// Sets `passOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStencilOpState passOpAt(long index, @CType("VkStencilOp") int value) { VkStencilOpState.set_passOp(this.segment(), index, value); return this; }
    /// Sets `passOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState passOp(@CType("VkStencilOp") int value) { VkStencilOpState.set_passOp(this.segment(), value); return this; }

    /// {@return `depthFailOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStencilOp") int get_depthFailOp(MemorySegment segment, long index) { return (int) VH_depthFailOp.get(segment, 0L, index); }
    /// {@return `depthFailOp`}
    /// @param segment the segment of the struct
    public static @CType("VkStencilOp") int get_depthFailOp(MemorySegment segment) { return VkStencilOpState.get_depthFailOp(segment, 0L); }
    /// {@return `depthFailOp` at the given index}
    /// @param index the index
    public @CType("VkStencilOp") int depthFailOpAt(long index) { return VkStencilOpState.get_depthFailOp(this.segment(), index); }
    /// {@return `depthFailOp`}
    public @CType("VkStencilOp") int depthFailOp() { return VkStencilOpState.get_depthFailOp(this.segment()); }
    /// Sets `depthFailOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthFailOp(MemorySegment segment, long index, @CType("VkStencilOp") int value) { VH_depthFailOp.set(segment, 0L, index, value); }
    /// Sets `depthFailOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthFailOp(MemorySegment segment, @CType("VkStencilOp") int value) { VkStencilOpState.set_depthFailOp(segment, 0L, value); }
    /// Sets `depthFailOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStencilOpState depthFailOpAt(long index, @CType("VkStencilOp") int value) { VkStencilOpState.set_depthFailOp(this.segment(), index, value); return this; }
    /// Sets `depthFailOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState depthFailOp(@CType("VkStencilOp") int value) { VkStencilOpState.set_depthFailOp(this.segment(), value); return this; }

    /// {@return `compareOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCompareOp") int get_compareOp(MemorySegment segment, long index) { return (int) VH_compareOp.get(segment, 0L, index); }
    /// {@return `compareOp`}
    /// @param segment the segment of the struct
    public static @CType("VkCompareOp") int get_compareOp(MemorySegment segment) { return VkStencilOpState.get_compareOp(segment, 0L); }
    /// {@return `compareOp` at the given index}
    /// @param index the index
    public @CType("VkCompareOp") int compareOpAt(long index) { return VkStencilOpState.get_compareOp(this.segment(), index); }
    /// {@return `compareOp`}
    public @CType("VkCompareOp") int compareOp() { return VkStencilOpState.get_compareOp(this.segment()); }
    /// Sets `compareOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compareOp(MemorySegment segment, long index, @CType("VkCompareOp") int value) { VH_compareOp.set(segment, 0L, index, value); }
    /// Sets `compareOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compareOp(MemorySegment segment, @CType("VkCompareOp") int value) { VkStencilOpState.set_compareOp(segment, 0L, value); }
    /// Sets `compareOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStencilOpState compareOpAt(long index, @CType("VkCompareOp") int value) { VkStencilOpState.set_compareOp(this.segment(), index, value); return this; }
    /// Sets `compareOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState compareOp(@CType("VkCompareOp") int value) { VkStencilOpState.set_compareOp(this.segment(), value); return this; }

    /// {@return `compareMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_compareMask(MemorySegment segment, long index) { return (int) VH_compareMask.get(segment, 0L, index); }
    /// {@return `compareMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_compareMask(MemorySegment segment) { return VkStencilOpState.get_compareMask(segment, 0L); }
    /// {@return `compareMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int compareMaskAt(long index) { return VkStencilOpState.get_compareMask(this.segment(), index); }
    /// {@return `compareMask`}
    public @CType("uint32_t") int compareMask() { return VkStencilOpState.get_compareMask(this.segment()); }
    /// Sets `compareMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compareMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_compareMask.set(segment, 0L, index, value); }
    /// Sets `compareMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compareMask(MemorySegment segment, @CType("uint32_t") int value) { VkStencilOpState.set_compareMask(segment, 0L, value); }
    /// Sets `compareMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStencilOpState compareMaskAt(long index, @CType("uint32_t") int value) { VkStencilOpState.set_compareMask(this.segment(), index, value); return this; }
    /// Sets `compareMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState compareMask(@CType("uint32_t") int value) { VkStencilOpState.set_compareMask(this.segment(), value); return this; }

    /// {@return `writeMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_writeMask(MemorySegment segment, long index) { return (int) VH_writeMask.get(segment, 0L, index); }
    /// {@return `writeMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_writeMask(MemorySegment segment) { return VkStencilOpState.get_writeMask(segment, 0L); }
    /// {@return `writeMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int writeMaskAt(long index) { return VkStencilOpState.get_writeMask(this.segment(), index); }
    /// {@return `writeMask`}
    public @CType("uint32_t") int writeMask() { return VkStencilOpState.get_writeMask(this.segment()); }
    /// Sets `writeMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_writeMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_writeMask.set(segment, 0L, index, value); }
    /// Sets `writeMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_writeMask(MemorySegment segment, @CType("uint32_t") int value) { VkStencilOpState.set_writeMask(segment, 0L, value); }
    /// Sets `writeMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStencilOpState writeMaskAt(long index, @CType("uint32_t") int value) { VkStencilOpState.set_writeMask(this.segment(), index, value); return this; }
    /// Sets `writeMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState writeMask(@CType("uint32_t") int value) { VkStencilOpState.set_writeMask(this.segment(), value); return this; }

    /// {@return `reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_reference(MemorySegment segment, long index) { return (int) VH_reference.get(segment, 0L, index); }
    /// {@return `reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_reference(MemorySegment segment) { return VkStencilOpState.get_reference(segment, 0L); }
    /// {@return `reference` at the given index}
    /// @param index the index
    public @CType("uint32_t") int referenceAt(long index) { return VkStencilOpState.get_reference(this.segment(), index); }
    /// {@return `reference`}
    public @CType("uint32_t") int reference() { return VkStencilOpState.get_reference(this.segment()); }
    /// Sets `reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reference(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_reference.set(segment, 0L, index, value); }
    /// Sets `reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reference(MemorySegment segment, @CType("uint32_t") int value) { VkStencilOpState.set_reference(segment, 0L, value); }
    /// Sets `reference` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStencilOpState referenceAt(long index, @CType("uint32_t") int value) { VkStencilOpState.set_reference(this.segment(), index, value); return this; }
    /// Sets `reference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState reference(@CType("uint32_t") int value) { VkStencilOpState.set_reference(this.segment(), value); return this; }

}
