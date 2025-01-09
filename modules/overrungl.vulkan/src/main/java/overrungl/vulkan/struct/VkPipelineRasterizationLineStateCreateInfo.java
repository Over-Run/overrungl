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
/// ### lineRasterizationMode
/// [VarHandle][#VH_lineRasterizationMode] - [Getter][#lineRasterizationMode()] - [Setter][#lineRasterizationMode(int)]
/// ### stippledLineEnable
/// [VarHandle][#VH_stippledLineEnable] - [Getter][#stippledLineEnable()] - [Setter][#stippledLineEnable(int)]
/// ### lineStippleFactor
/// [VarHandle][#VH_lineStippleFactor] - [Getter][#lineStippleFactor()] - [Setter][#lineStippleFactor(int)]
/// ### lineStipplePattern
/// [VarHandle][#VH_lineStipplePattern] - [Getter][#lineStipplePattern()] - [Setter][#lineStipplePattern(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineRasterizationLineStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkLineRasterizationMode lineRasterizationMode;
///     VkBool32 stippledLineEnable;
///     uint32_t lineStippleFactor;
///     uint16_t lineStipplePattern;
/// } VkPipelineRasterizationLineStateCreateInfo;
/// ```
public final class VkPipelineRasterizationLineStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineRasterizationLineStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineRasterizationMode"),
        ValueLayout.JAVA_INT.withName("stippledLineEnable"),
        ValueLayout.JAVA_INT.withName("lineStippleFactor"),
        ValueLayout.JAVA_SHORT.withName("lineStipplePattern")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `lineRasterizationMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lineRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineRasterizationMode"));
    /// The [VarHandle] of `stippledLineEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stippledLineEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledLineEnable"));
    /// The [VarHandle] of `lineStippleFactor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lineStippleFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineStippleFactor"));
    /// The [VarHandle] of `lineStipplePattern` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_lineStipplePattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineStipplePattern"));

    /// Creates `VkPipelineRasterizationLineStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineRasterizationLineStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineRasterizationLineStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationLineStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment); }

    /// Creates `VkPipelineRasterizationLineStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationLineStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineRasterizationLineStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationLineStateCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineRasterizationLineStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationLineStateCreateInfo`
    public static VkPipelineRasterizationLineStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationLineStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineRasterizationLineStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationLineStateCreateInfo`
    public static VkPipelineRasterizationLineStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationLineStateCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineRasterizationLineStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineRasterizationLineStateCreateInfo`
    public VkPipelineRasterizationLineStateCreateInfo asSlice(long index) { return new VkPipelineRasterizationLineStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineRasterizationLineStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineRasterizationLineStateCreateInfo`
    public VkPipelineRasterizationLineStateCreateInfo asSlice(long index, long count) { return new VkPipelineRasterizationLineStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineRasterizationLineStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineRasterizationLineStateCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineRasterizationLineStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineRasterizationLineStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineRasterizationLineStateCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineRasterizationLineStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineRasterizationLineStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineRasterizationLineStateCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineRasterizationLineStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationLineStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationLineStateCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationLineStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `lineRasterizationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkLineRasterizationMode") int get_lineRasterizationMode(MemorySegment segment, long index) { return (int) VH_lineRasterizationMode.get(segment, 0L, index); }
    /// {@return `lineRasterizationMode`}
    /// @param segment the segment of the struct
    public static @CType("VkLineRasterizationMode") int get_lineRasterizationMode(MemorySegment segment) { return VkPipelineRasterizationLineStateCreateInfo.get_lineRasterizationMode(segment, 0L); }
    /// {@return `lineRasterizationMode` at the given index}
    /// @param index the index
    public @CType("VkLineRasterizationMode") int lineRasterizationModeAt(long index) { return VkPipelineRasterizationLineStateCreateInfo.get_lineRasterizationMode(this.segment(), index); }
    /// {@return `lineRasterizationMode`}
    public @CType("VkLineRasterizationMode") int lineRasterizationMode() { return VkPipelineRasterizationLineStateCreateInfo.get_lineRasterizationMode(this.segment()); }
    /// Sets `lineRasterizationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lineRasterizationMode(MemorySegment segment, long index, @CType("VkLineRasterizationMode") int value) { VH_lineRasterizationMode.set(segment, 0L, index, value); }
    /// Sets `lineRasterizationMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lineRasterizationMode(MemorySegment segment, @CType("VkLineRasterizationMode") int value) { VkPipelineRasterizationLineStateCreateInfo.set_lineRasterizationMode(segment, 0L, value); }
    /// Sets `lineRasterizationMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationModeAt(long index, @CType("VkLineRasterizationMode") int value) { VkPipelineRasterizationLineStateCreateInfo.set_lineRasterizationMode(this.segment(), index, value); return this; }
    /// Sets `lineRasterizationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(@CType("VkLineRasterizationMode") int value) { VkPipelineRasterizationLineStateCreateInfo.set_lineRasterizationMode(this.segment(), value); return this; }

    /// {@return `stippledLineEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_stippledLineEnable(MemorySegment segment, long index) { return (int) VH_stippledLineEnable.get(segment, 0L, index); }
    /// {@return `stippledLineEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_stippledLineEnable(MemorySegment segment) { return VkPipelineRasterizationLineStateCreateInfo.get_stippledLineEnable(segment, 0L); }
    /// {@return `stippledLineEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int stippledLineEnableAt(long index) { return VkPipelineRasterizationLineStateCreateInfo.get_stippledLineEnable(this.segment(), index); }
    /// {@return `stippledLineEnable`}
    public @CType("VkBool32") int stippledLineEnable() { return VkPipelineRasterizationLineStateCreateInfo.get_stippledLineEnable(this.segment()); }
    /// Sets `stippledLineEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stippledLineEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_stippledLineEnable.set(segment, 0L, index, value); }
    /// Sets `stippledLineEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stippledLineEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineRasterizationLineStateCreateInfo.set_stippledLineEnable(segment, 0L, value); }
    /// Sets `stippledLineEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnableAt(long index, @CType("VkBool32") int value) { VkPipelineRasterizationLineStateCreateInfo.set_stippledLineEnable(this.segment(), index, value); return this; }
    /// Sets `stippledLineEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(@CType("VkBool32") int value) { VkPipelineRasterizationLineStateCreateInfo.set_stippledLineEnable(this.segment(), value); return this; }

    /// {@return `lineStippleFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_lineStippleFactor(MemorySegment segment, long index) { return (int) VH_lineStippleFactor.get(segment, 0L, index); }
    /// {@return `lineStippleFactor`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_lineStippleFactor(MemorySegment segment) { return VkPipelineRasterizationLineStateCreateInfo.get_lineStippleFactor(segment, 0L); }
    /// {@return `lineStippleFactor` at the given index}
    /// @param index the index
    public @CType("uint32_t") int lineStippleFactorAt(long index) { return VkPipelineRasterizationLineStateCreateInfo.get_lineStippleFactor(this.segment(), index); }
    /// {@return `lineStippleFactor`}
    public @CType("uint32_t") int lineStippleFactor() { return VkPipelineRasterizationLineStateCreateInfo.get_lineStippleFactor(this.segment()); }
    /// Sets `lineStippleFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lineStippleFactor(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_lineStippleFactor.set(segment, 0L, index, value); }
    /// Sets `lineStippleFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lineStippleFactor(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineRasterizationLineStateCreateInfo.set_lineStippleFactor(segment, 0L, value); }
    /// Sets `lineStippleFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactorAt(long index, @CType("uint32_t") int value) { VkPipelineRasterizationLineStateCreateInfo.set_lineStippleFactor(this.segment(), index, value); return this; }
    /// Sets `lineStippleFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(@CType("uint32_t") int value) { VkPipelineRasterizationLineStateCreateInfo.set_lineStippleFactor(this.segment(), value); return this; }

    /// {@return `lineStipplePattern` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_lineStipplePattern(MemorySegment segment, long index) { return (short) VH_lineStipplePattern.get(segment, 0L, index); }
    /// {@return `lineStipplePattern`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_lineStipplePattern(MemorySegment segment) { return VkPipelineRasterizationLineStateCreateInfo.get_lineStipplePattern(segment, 0L); }
    /// {@return `lineStipplePattern` at the given index}
    /// @param index the index
    public @CType("uint16_t") short lineStipplePatternAt(long index) { return VkPipelineRasterizationLineStateCreateInfo.get_lineStipplePattern(this.segment(), index); }
    /// {@return `lineStipplePattern`}
    public @CType("uint16_t") short lineStipplePattern() { return VkPipelineRasterizationLineStateCreateInfo.get_lineStipplePattern(this.segment()); }
    /// Sets `lineStipplePattern` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lineStipplePattern(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_lineStipplePattern.set(segment, 0L, index, value); }
    /// Sets `lineStipplePattern` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lineStipplePattern(MemorySegment segment, @CType("uint16_t") short value) { VkPipelineRasterizationLineStateCreateInfo.set_lineStipplePattern(segment, 0L, value); }
    /// Sets `lineStipplePattern` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineStipplePatternAt(long index, @CType("uint16_t") short value) { VkPipelineRasterizationLineStateCreateInfo.set_lineStipplePattern(this.segment(), index, value); return this; }
    /// Sets `lineStipplePattern` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(@CType("uint16_t") short value) { VkPipelineRasterizationLineStateCreateInfo.set_lineStipplePattern(this.segment(), value); return this; }

}
