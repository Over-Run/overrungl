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
package overrungl.vulkan.qcom.struct;

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
/// ### textureSampleWeighted
/// [VarHandle][#VH_textureSampleWeighted] - [Getter][#textureSampleWeighted()] - [Setter][#textureSampleWeighted(int)]
/// ### textureBoxFilter
/// [VarHandle][#VH_textureBoxFilter] - [Getter][#textureBoxFilter()] - [Setter][#textureBoxFilter(int)]
/// ### textureBlockMatch
/// [VarHandle][#VH_textureBlockMatch] - [Getter][#textureBlockMatch()] - [Setter][#textureBlockMatch(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceImageProcessingFeaturesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 textureSampleWeighted;
///     VkBool32 textureBoxFilter;
///     VkBool32 textureBlockMatch;
/// } VkPhysicalDeviceImageProcessingFeaturesQCOM;
/// ```
public final class VkPhysicalDeviceImageProcessingFeaturesQCOM extends Struct {
    /// The struct layout of `VkPhysicalDeviceImageProcessingFeaturesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureSampleWeighted"),
        ValueLayout.JAVA_INT.withName("textureBoxFilter"),
        ValueLayout.JAVA_INT.withName("textureBlockMatch")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `textureSampleWeighted` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_textureSampleWeighted = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureSampleWeighted"));
    /// The [VarHandle] of `textureBoxFilter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_textureBoxFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureBoxFilter"));
    /// The [VarHandle] of `textureBlockMatch` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_textureBlockMatch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureBlockMatch"));

    /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImageProcessingFeaturesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment); }

    /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `textureSampleWeighted` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_textureSampleWeighted(MemorySegment segment, long index) { return (int) VH_textureSampleWeighted.get(segment, 0L, index); }
    /// {@return `textureSampleWeighted`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_textureSampleWeighted(MemorySegment segment) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureSampleWeighted(segment, 0L); }
    /// {@return `textureSampleWeighted` at the given index}
    /// @param index the index
    public @CType("VkBool32") int textureSampleWeightedAt(long index) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureSampleWeighted(this.segment(), index); }
    /// {@return `textureSampleWeighted`}
    public @CType("VkBool32") int textureSampleWeighted() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureSampleWeighted(this.segment()); }
    /// Sets `textureSampleWeighted` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_textureSampleWeighted(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_textureSampleWeighted.set(segment, 0L, index, value); }
    /// Sets `textureSampleWeighted` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_textureSampleWeighted(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureSampleWeighted(segment, 0L, value); }
    /// Sets `textureSampleWeighted` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureSampleWeightedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureSampleWeighted(this.segment(), index, value); return this; }
    /// Sets `textureSampleWeighted` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureSampleWeighted(@CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureSampleWeighted(this.segment(), value); return this; }

    /// {@return `textureBoxFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_textureBoxFilter(MemorySegment segment, long index) { return (int) VH_textureBoxFilter.get(segment, 0L, index); }
    /// {@return `textureBoxFilter`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_textureBoxFilter(MemorySegment segment) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureBoxFilter(segment, 0L); }
    /// {@return `textureBoxFilter` at the given index}
    /// @param index the index
    public @CType("VkBool32") int textureBoxFilterAt(long index) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureBoxFilter(this.segment(), index); }
    /// {@return `textureBoxFilter`}
    public @CType("VkBool32") int textureBoxFilter() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureBoxFilter(this.segment()); }
    /// Sets `textureBoxFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_textureBoxFilter(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_textureBoxFilter.set(segment, 0L, index, value); }
    /// Sets `textureBoxFilter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_textureBoxFilter(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureBoxFilter(segment, 0L, value); }
    /// Sets `textureBoxFilter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBoxFilterAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureBoxFilter(this.segment(), index, value); return this; }
    /// Sets `textureBoxFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBoxFilter(@CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureBoxFilter(this.segment(), value); return this; }

    /// {@return `textureBlockMatch` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_textureBlockMatch(MemorySegment segment, long index) { return (int) VH_textureBlockMatch.get(segment, 0L, index); }
    /// {@return `textureBlockMatch`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_textureBlockMatch(MemorySegment segment) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureBlockMatch(segment, 0L); }
    /// {@return `textureBlockMatch` at the given index}
    /// @param index the index
    public @CType("VkBool32") int textureBlockMatchAt(long index) { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureBlockMatch(this.segment(), index); }
    /// {@return `textureBlockMatch`}
    public @CType("VkBool32") int textureBlockMatch() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.get_textureBlockMatch(this.segment()); }
    /// Sets `textureBlockMatch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_textureBlockMatch(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_textureBlockMatch.set(segment, 0L, index, value); }
    /// Sets `textureBlockMatch` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_textureBlockMatch(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureBlockMatch(segment, 0L, value); }
    /// Sets `textureBlockMatch` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBlockMatchAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureBlockMatch(this.segment(), index, value); return this; }
    /// Sets `textureBlockMatch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBlockMatch(@CType("VkBool32") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.set_textureBlockMatch(this.segment(), value); return this; }

}
