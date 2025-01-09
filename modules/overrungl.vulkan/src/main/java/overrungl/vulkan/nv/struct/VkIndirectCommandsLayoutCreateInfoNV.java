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
package overrungl.vulkan.nv.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### pipelineBindPoint
/// [VarHandle][#VH_pipelineBindPoint] - [Getter][#pipelineBindPoint()] - [Setter][#pipelineBindPoint(int)]
/// ### tokenCount
/// [VarHandle][#VH_tokenCount] - [Getter][#tokenCount()] - [Setter][#tokenCount(int)]
/// ### pTokens
/// [VarHandle][#VH_pTokens] - [Getter][#pTokens()] - [Setter][#pTokens(java.lang.foreign.MemorySegment)]
/// ### streamCount
/// [VarHandle][#VH_streamCount] - [Getter][#streamCount()] - [Setter][#streamCount(int)]
/// ### pStreamStrides
/// [VarHandle][#VH_pStreamStrides] - [Getter][#pStreamStrides()] - [Setter][#pStreamStrides(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsLayoutCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkIndirectCommandsLayoutUsageFlagsNV flags;
///     VkPipelineBindPoint pipelineBindPoint;
///     uint32_t tokenCount;
///     const VkIndirectCommandsLayoutTokenNV * pTokens;
///     uint32_t streamCount;
///     const uint32_t * pStreamStrides;
/// } VkIndirectCommandsLayoutCreateInfoNV;
/// ```
public final class VkIndirectCommandsLayoutCreateInfoNV extends Struct {
    /// The struct layout of `VkIndirectCommandsLayoutCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("tokenCount"),
        ValueLayout.ADDRESS.withName("pTokens"),
        ValueLayout.JAVA_INT.withName("streamCount"),
        ValueLayout.ADDRESS.withName("pStreamStrides")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `tokenCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenCount"));
    /// The [VarHandle] of `pTokens` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTokens = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTokens"));
    /// The [VarHandle] of `streamCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_streamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("streamCount"));
    /// The [VarHandle] of `pStreamStrides` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStreamStrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStreamStrides"));

    /// Creates `VkIndirectCommandsLayoutCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsLayoutCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoNV`
    public static VkIndirectCommandsLayoutCreateInfoNV alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoNV`
    public static VkIndirectCommandsLayoutCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectCommandsLayoutCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectCommandsLayoutCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV sType(@CType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkIndirectCommandsLayoutCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkIndirectCommandsLayoutCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsLayoutUsageFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsLayoutUsageFlagsNV") int get_flags(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoNV.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkIndirectCommandsLayoutUsageFlagsNV") int flagsAt(long index) { return VkIndirectCommandsLayoutCreateInfoNV.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkIndirectCommandsLayoutUsageFlagsNV") int flags() { return VkIndirectCommandsLayoutCreateInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkIndirectCommandsLayoutUsageFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkIndirectCommandsLayoutUsageFlagsNV") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV flagsAt(long index, @CType("VkIndirectCommandsLayoutUsageFlagsNV") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV flags(@CType("VkIndirectCommandsLayoutUsageFlagsNV") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_flags(this.segment(), value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoNV.get_pipelineBindPoint(segment, 0L); }
    /// {@return `pipelineBindPoint` at the given index}
    /// @param index the index
    public @CType("VkPipelineBindPoint") int pipelineBindPointAt(long index) { return VkIndirectCommandsLayoutCreateInfoNV.get_pipelineBindPoint(this.segment(), index); }
    /// {@return `pipelineBindPoint`}
    public @CType("VkPipelineBindPoint") int pipelineBindPoint() { return VkIndirectCommandsLayoutCreateInfoNV.get_pipelineBindPoint(this.segment()); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, long index, @CType("VkPipelineBindPoint") int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, @CType("VkPipelineBindPoint") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_pipelineBindPoint(segment, 0L, value); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPointAt(long index, @CType("VkPipelineBindPoint") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_pipelineBindPoint(this.segment(), index, value); return this; }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPoint(@CType("VkPipelineBindPoint") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_pipelineBindPoint(this.segment(), value); return this; }

    /// {@return `tokenCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_tokenCount(MemorySegment segment, long index) { return (int) VH_tokenCount.get(segment, 0L, index); }
    /// {@return `tokenCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_tokenCount(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoNV.get_tokenCount(segment, 0L); }
    /// {@return `tokenCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int tokenCountAt(long index) { return VkIndirectCommandsLayoutCreateInfoNV.get_tokenCount(this.segment(), index); }
    /// {@return `tokenCount`}
    public @CType("uint32_t") int tokenCount() { return VkIndirectCommandsLayoutCreateInfoNV.get_tokenCount(this.segment()); }
    /// Sets `tokenCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tokenCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_tokenCount.set(segment, 0L, index, value); }
    /// Sets `tokenCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tokenCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_tokenCount(segment, 0L, value); }
    /// Sets `tokenCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV tokenCountAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_tokenCount(this.segment(), index, value); return this; }
    /// Sets `tokenCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV tokenCount(@CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_tokenCount(this.segment(), value); return this; }

    /// {@return `pTokens` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkIndirectCommandsLayoutTokenNV *") java.lang.foreign.MemorySegment get_pTokens(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTokens.get(segment, 0L, index); }
    /// {@return `pTokens`}
    /// @param segment the segment of the struct
    public static @CType("const VkIndirectCommandsLayoutTokenNV *") java.lang.foreign.MemorySegment get_pTokens(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoNV.get_pTokens(segment, 0L); }
    /// {@return `pTokens` at the given index}
    /// @param index the index
    public @CType("const VkIndirectCommandsLayoutTokenNV *") java.lang.foreign.MemorySegment pTokensAt(long index) { return VkIndirectCommandsLayoutCreateInfoNV.get_pTokens(this.segment(), index); }
    /// {@return `pTokens`}
    public @CType("const VkIndirectCommandsLayoutTokenNV *") java.lang.foreign.MemorySegment pTokens() { return VkIndirectCommandsLayoutCreateInfoNV.get_pTokens(this.segment()); }
    /// Sets `pTokens` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTokens(MemorySegment segment, long index, @CType("const VkIndirectCommandsLayoutTokenNV *") java.lang.foreign.MemorySegment value) { VH_pTokens.set(segment, 0L, index, value); }
    /// Sets `pTokens` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTokens(MemorySegment segment, @CType("const VkIndirectCommandsLayoutTokenNV *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pTokens(segment, 0L, value); }
    /// Sets `pTokens` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pTokensAt(long index, @CType("const VkIndirectCommandsLayoutTokenNV *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pTokens(this.segment(), index, value); return this; }
    /// Sets `pTokens` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pTokens(@CType("const VkIndirectCommandsLayoutTokenNV *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pTokens(this.segment(), value); return this; }

    /// {@return `streamCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_streamCount(MemorySegment segment, long index) { return (int) VH_streamCount.get(segment, 0L, index); }
    /// {@return `streamCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_streamCount(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoNV.get_streamCount(segment, 0L); }
    /// {@return `streamCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int streamCountAt(long index) { return VkIndirectCommandsLayoutCreateInfoNV.get_streamCount(this.segment(), index); }
    /// {@return `streamCount`}
    public @CType("uint32_t") int streamCount() { return VkIndirectCommandsLayoutCreateInfoNV.get_streamCount(this.segment()); }
    /// Sets `streamCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_streamCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_streamCount.set(segment, 0L, index, value); }
    /// Sets `streamCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_streamCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_streamCount(segment, 0L, value); }
    /// Sets `streamCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV streamCountAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_streamCount(this.segment(), index, value); return this; }
    /// Sets `streamCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV streamCount(@CType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoNV.set_streamCount(this.segment(), value); return this; }

    /// {@return `pStreamStrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pStreamStrides(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStreamStrides.get(segment, 0L, index); }
    /// {@return `pStreamStrides`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pStreamStrides(MemorySegment segment) { return VkIndirectCommandsLayoutCreateInfoNV.get_pStreamStrides(segment, 0L); }
    /// {@return `pStreamStrides` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pStreamStridesAt(long index) { return VkIndirectCommandsLayoutCreateInfoNV.get_pStreamStrides(this.segment(), index); }
    /// {@return `pStreamStrides`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pStreamStrides() { return VkIndirectCommandsLayoutCreateInfoNV.get_pStreamStrides(this.segment()); }
    /// Sets `pStreamStrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStreamStrides(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pStreamStrides.set(segment, 0L, index, value); }
    /// Sets `pStreamStrides` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStreamStrides(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pStreamStrides(segment, 0L, value); }
    /// Sets `pStreamStrides` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStridesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pStreamStrides(this.segment(), index, value); return this; }
    /// Sets `pStreamStrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStrides(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkIndirectCommandsLayoutCreateInfoNV.set_pStreamStrides(this.segment(), value); return this; }

}
