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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### linearTilingFeatures
/// [VarHandle][#VH_linearTilingFeatures] - [Getter][#linearTilingFeatures()] - [Setter][#linearTilingFeatures(long)]
/// ### optimalTilingFeatures
/// [VarHandle][#VH_optimalTilingFeatures] - [Getter][#optimalTilingFeatures()] - [Setter][#optimalTilingFeatures(long)]
/// ### bufferFeatures
/// [VarHandle][#VH_bufferFeatures] - [Getter][#bufferFeatures()] - [Setter][#bufferFeatures(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFormatProperties3 {
///     VkStructureType sType;
///     void * pNext;
///     VkFormatFeatureFlags2 linearTilingFeatures;
///     VkFormatFeatureFlags2 optimalTilingFeatures;
///     VkFormatFeatureFlags2 bufferFeatures;
/// } VkFormatProperties3;
/// ```
public final class VkFormatProperties3 extends Struct {
    /// The struct layout of `VkFormatProperties3`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("linearTilingFeatures"),
        ValueLayout.JAVA_LONG.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_LONG.withName("bufferFeatures")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `linearTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_linearTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingFeatures"));
    /// The [VarHandle] of `optimalTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_optimalTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingFeatures"));
    /// The [VarHandle] of `bufferFeatures` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_bufferFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferFeatures"));

    /// Creates `VkFormatProperties3` with the given segment.
    /// @param segment the memory segment
    public VkFormatProperties3(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFormatProperties3` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties3 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFormatProperties3(segment); }

    /// Creates `VkFormatProperties3` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties3 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFormatProperties3(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFormatProperties3` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties3 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkFormatProperties3(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkFormatProperties3` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFormatProperties3`
    public static VkFormatProperties3 alloc(SegmentAllocator allocator) { return new VkFormatProperties3(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFormatProperties3` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFormatProperties3`
    public static VkFormatProperties3 alloc(SegmentAllocator allocator, long count) { return new VkFormatProperties3(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFormatProperties3.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkFormatProperties3.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFormatProperties3.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFormatProperties3.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 sTypeAt(long index, @CType("VkStructureType") int value) { VkFormatProperties3.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 sType(@CType("VkStructureType") int value) { VkFormatProperties3.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkFormatProperties3.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkFormatProperties3.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkFormatProperties3.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkFormatProperties3.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkFormatProperties3.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkFormatProperties3.set_pNext(this.segment(), value); return this; }

    /// {@return `linearTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags2") long get_linearTilingFeatures(MemorySegment segment, long index) { return (long) VH_linearTilingFeatures.get(segment, 0L, index); }
    /// {@return `linearTilingFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags2") long get_linearTilingFeatures(MemorySegment segment) { return VkFormatProperties3.get_linearTilingFeatures(segment, 0L); }
    /// {@return `linearTilingFeatures` at the given index}
    /// @param index the index
    public @CType("VkFormatFeatureFlags2") long linearTilingFeaturesAt(long index) { return VkFormatProperties3.get_linearTilingFeatures(this.segment(), index); }
    /// {@return `linearTilingFeatures`}
    public @CType("VkFormatFeatureFlags2") long linearTilingFeatures() { return VkFormatProperties3.get_linearTilingFeatures(this.segment()); }
    /// Sets `linearTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_linearTilingFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags2") long value) { VH_linearTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `linearTilingFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_linearTilingFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_linearTilingFeatures(segment, 0L, value); }
    /// Sets `linearTilingFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 linearTilingFeaturesAt(long index, @CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_linearTilingFeatures(this.segment(), index, value); return this; }
    /// Sets `linearTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 linearTilingFeatures(@CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_linearTilingFeatures(this.segment(), value); return this; }

    /// {@return `optimalTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags2") long get_optimalTilingFeatures(MemorySegment segment, long index) { return (long) VH_optimalTilingFeatures.get(segment, 0L, index); }
    /// {@return `optimalTilingFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags2") long get_optimalTilingFeatures(MemorySegment segment) { return VkFormatProperties3.get_optimalTilingFeatures(segment, 0L); }
    /// {@return `optimalTilingFeatures` at the given index}
    /// @param index the index
    public @CType("VkFormatFeatureFlags2") long optimalTilingFeaturesAt(long index) { return VkFormatProperties3.get_optimalTilingFeatures(this.segment(), index); }
    /// {@return `optimalTilingFeatures`}
    public @CType("VkFormatFeatureFlags2") long optimalTilingFeatures() { return VkFormatProperties3.get_optimalTilingFeatures(this.segment()); }
    /// Sets `optimalTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_optimalTilingFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags2") long value) { VH_optimalTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `optimalTilingFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_optimalTilingFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_optimalTilingFeatures(segment, 0L, value); }
    /// Sets `optimalTilingFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 optimalTilingFeaturesAt(long index, @CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_optimalTilingFeatures(this.segment(), index, value); return this; }
    /// Sets `optimalTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 optimalTilingFeatures(@CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_optimalTilingFeatures(this.segment(), value); return this; }

    /// {@return `bufferFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags2") long get_bufferFeatures(MemorySegment segment, long index) { return (long) VH_bufferFeatures.get(segment, 0L, index); }
    /// {@return `bufferFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags2") long get_bufferFeatures(MemorySegment segment) { return VkFormatProperties3.get_bufferFeatures(segment, 0L); }
    /// {@return `bufferFeatures` at the given index}
    /// @param index the index
    public @CType("VkFormatFeatureFlags2") long bufferFeaturesAt(long index) { return VkFormatProperties3.get_bufferFeatures(this.segment(), index); }
    /// {@return `bufferFeatures`}
    public @CType("VkFormatFeatureFlags2") long bufferFeatures() { return VkFormatProperties3.get_bufferFeatures(this.segment()); }
    /// Sets `bufferFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags2") long value) { VH_bufferFeatures.set(segment, 0L, index, value); }
    /// Sets `bufferFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_bufferFeatures(segment, 0L, value); }
    /// Sets `bufferFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 bufferFeaturesAt(long index, @CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_bufferFeatures(this.segment(), index, value); return this; }
    /// Sets `bufferFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 bufferFeatures(@CType("VkFormatFeatureFlags2") long value) { VkFormatProperties3.set_bufferFeatures(this.segment(), value); return this; }

}
