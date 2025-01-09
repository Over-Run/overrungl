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
/// ### rectangularLines
/// [VarHandle][#VH_rectangularLines] - [Getter][#rectangularLines()] - [Setter][#rectangularLines(int)]
/// ### bresenhamLines
/// [VarHandle][#VH_bresenhamLines] - [Getter][#bresenhamLines()] - [Setter][#bresenhamLines(int)]
/// ### smoothLines
/// [VarHandle][#VH_smoothLines] - [Getter][#smoothLines()] - [Setter][#smoothLines(int)]
/// ### stippledRectangularLines
/// [VarHandle][#VH_stippledRectangularLines] - [Getter][#stippledRectangularLines()] - [Setter][#stippledRectangularLines(int)]
/// ### stippledBresenhamLines
/// [VarHandle][#VH_stippledBresenhamLines] - [Getter][#stippledBresenhamLines()] - [Setter][#stippledBresenhamLines(int)]
/// ### stippledSmoothLines
/// [VarHandle][#VH_stippledSmoothLines] - [Getter][#stippledSmoothLines()] - [Setter][#stippledSmoothLines(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceLineRasterizationFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 rectangularLines;
///     VkBool32 bresenhamLines;
///     VkBool32 smoothLines;
///     VkBool32 stippledRectangularLines;
///     VkBool32 stippledBresenhamLines;
///     VkBool32 stippledSmoothLines;
/// } VkPhysicalDeviceLineRasterizationFeatures;
/// ```
public final class VkPhysicalDeviceLineRasterizationFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceLineRasterizationFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rectangularLines"),
        ValueLayout.JAVA_INT.withName("bresenhamLines"),
        ValueLayout.JAVA_INT.withName("smoothLines"),
        ValueLayout.JAVA_INT.withName("stippledRectangularLines"),
        ValueLayout.JAVA_INT.withName("stippledBresenhamLines"),
        ValueLayout.JAVA_INT.withName("stippledSmoothLines")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `rectangularLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangularLines"));
    /// The [VarHandle] of `bresenhamLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bresenhamLines"));
    /// The [VarHandle] of `smoothLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_smoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("smoothLines"));
    /// The [VarHandle] of `stippledRectangularLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stippledRectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledRectangularLines"));
    /// The [VarHandle] of `stippledBresenhamLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stippledBresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledBresenhamLines"));
    /// The [VarHandle] of `stippledSmoothLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stippledSmoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledSmoothLines"));

    /// Creates `VkPhysicalDeviceLineRasterizationFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceLineRasterizationFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceLineRasterizationFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeatures(segment); }

    /// Creates `VkPhysicalDeviceLineRasterizationFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceLineRasterizationFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationFeatures ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLineRasterizationFeatures`
    public static VkPhysicalDeviceLineRasterizationFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLineRasterizationFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLineRasterizationFeatures`
    public static VkPhysicalDeviceLineRasterizationFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLineRasterizationFeatures(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationFeatures.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceLineRasterizationFeatures.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceLineRasterizationFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceLineRasterizationFeatures.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceLineRasterizationFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLineRasterizationFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLineRasterizationFeatures.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLineRasterizationFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `rectangularLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rectangularLines(MemorySegment segment, long index) { return (int) VH_rectangularLines.get(segment, 0L, index); }
    /// {@return `rectangularLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rectangularLines(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationFeatures.get_rectangularLines(segment, 0L); }
    /// {@return `rectangularLines` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rectangularLinesAt(long index) { return VkPhysicalDeviceLineRasterizationFeatures.get_rectangularLines(this.segment(), index); }
    /// {@return `rectangularLines`}
    public @CType("VkBool32") int rectangularLines() { return VkPhysicalDeviceLineRasterizationFeatures.get_rectangularLines(this.segment()); }
    /// Sets `rectangularLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rectangularLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rectangularLines.set(segment, 0L, index, value); }
    /// Sets `rectangularLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rectangularLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_rectangularLines(segment, 0L, value); }
    /// Sets `rectangularLines` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures rectangularLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_rectangularLines(this.segment(), index, value); return this; }
    /// Sets `rectangularLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures rectangularLines(@CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_rectangularLines(this.segment(), value); return this; }

    /// {@return `bresenhamLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bresenhamLines(MemorySegment segment, long index) { return (int) VH_bresenhamLines.get(segment, 0L, index); }
    /// {@return `bresenhamLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bresenhamLines(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationFeatures.get_bresenhamLines(segment, 0L); }
    /// {@return `bresenhamLines` at the given index}
    /// @param index the index
    public @CType("VkBool32") int bresenhamLinesAt(long index) { return VkPhysicalDeviceLineRasterizationFeatures.get_bresenhamLines(this.segment(), index); }
    /// {@return `bresenhamLines`}
    public @CType("VkBool32") int bresenhamLines() { return VkPhysicalDeviceLineRasterizationFeatures.get_bresenhamLines(this.segment()); }
    /// Sets `bresenhamLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bresenhamLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bresenhamLines.set(segment, 0L, index, value); }
    /// Sets `bresenhamLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bresenhamLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_bresenhamLines(segment, 0L, value); }
    /// Sets `bresenhamLines` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures bresenhamLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_bresenhamLines(this.segment(), index, value); return this; }
    /// Sets `bresenhamLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures bresenhamLines(@CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_bresenhamLines(this.segment(), value); return this; }

    /// {@return `smoothLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_smoothLines(MemorySegment segment, long index) { return (int) VH_smoothLines.get(segment, 0L, index); }
    /// {@return `smoothLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_smoothLines(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationFeatures.get_smoothLines(segment, 0L); }
    /// {@return `smoothLines` at the given index}
    /// @param index the index
    public @CType("VkBool32") int smoothLinesAt(long index) { return VkPhysicalDeviceLineRasterizationFeatures.get_smoothLines(this.segment(), index); }
    /// {@return `smoothLines`}
    public @CType("VkBool32") int smoothLines() { return VkPhysicalDeviceLineRasterizationFeatures.get_smoothLines(this.segment()); }
    /// Sets `smoothLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_smoothLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_smoothLines.set(segment, 0L, index, value); }
    /// Sets `smoothLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_smoothLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_smoothLines(segment, 0L, value); }
    /// Sets `smoothLines` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures smoothLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_smoothLines(this.segment(), index, value); return this; }
    /// Sets `smoothLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures smoothLines(@CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_smoothLines(this.segment(), value); return this; }

    /// {@return `stippledRectangularLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_stippledRectangularLines(MemorySegment segment, long index) { return (int) VH_stippledRectangularLines.get(segment, 0L, index); }
    /// {@return `stippledRectangularLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_stippledRectangularLines(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledRectangularLines(segment, 0L); }
    /// {@return `stippledRectangularLines` at the given index}
    /// @param index the index
    public @CType("VkBool32") int stippledRectangularLinesAt(long index) { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledRectangularLines(this.segment(), index); }
    /// {@return `stippledRectangularLines`}
    public @CType("VkBool32") int stippledRectangularLines() { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledRectangularLines(this.segment()); }
    /// Sets `stippledRectangularLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stippledRectangularLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_stippledRectangularLines.set(segment, 0L, index, value); }
    /// Sets `stippledRectangularLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stippledRectangularLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledRectangularLines(segment, 0L, value); }
    /// Sets `stippledRectangularLines` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledRectangularLines(this.segment(), index, value); return this; }
    /// Sets `stippledRectangularLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLines(@CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledRectangularLines(this.segment(), value); return this; }

    /// {@return `stippledBresenhamLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_stippledBresenhamLines(MemorySegment segment, long index) { return (int) VH_stippledBresenhamLines.get(segment, 0L, index); }
    /// {@return `stippledBresenhamLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_stippledBresenhamLines(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledBresenhamLines(segment, 0L); }
    /// {@return `stippledBresenhamLines` at the given index}
    /// @param index the index
    public @CType("VkBool32") int stippledBresenhamLinesAt(long index) { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledBresenhamLines(this.segment(), index); }
    /// {@return `stippledBresenhamLines`}
    public @CType("VkBool32") int stippledBresenhamLines() { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledBresenhamLines(this.segment()); }
    /// Sets `stippledBresenhamLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stippledBresenhamLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_stippledBresenhamLines.set(segment, 0L, index, value); }
    /// Sets `stippledBresenhamLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stippledBresenhamLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledBresenhamLines(segment, 0L, value); }
    /// Sets `stippledBresenhamLines` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledBresenhamLines(this.segment(), index, value); return this; }
    /// Sets `stippledBresenhamLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLines(@CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledBresenhamLines(this.segment(), value); return this; }

    /// {@return `stippledSmoothLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_stippledSmoothLines(MemorySegment segment, long index) { return (int) VH_stippledSmoothLines.get(segment, 0L, index); }
    /// {@return `stippledSmoothLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_stippledSmoothLines(MemorySegment segment) { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledSmoothLines(segment, 0L); }
    /// {@return `stippledSmoothLines` at the given index}
    /// @param index the index
    public @CType("VkBool32") int stippledSmoothLinesAt(long index) { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledSmoothLines(this.segment(), index); }
    /// {@return `stippledSmoothLines`}
    public @CType("VkBool32") int stippledSmoothLines() { return VkPhysicalDeviceLineRasterizationFeatures.get_stippledSmoothLines(this.segment()); }
    /// Sets `stippledSmoothLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stippledSmoothLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_stippledSmoothLines.set(segment, 0L, index, value); }
    /// Sets `stippledSmoothLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stippledSmoothLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledSmoothLines(segment, 0L, value); }
    /// Sets `stippledSmoothLines` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledSmoothLines(this.segment(), index, value); return this; }
    /// Sets `stippledSmoothLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLines(@CType("VkBool32") int value) { VkPhysicalDeviceLineRasterizationFeatures.set_stippledSmoothLines(this.segment(), value); return this; }

}
