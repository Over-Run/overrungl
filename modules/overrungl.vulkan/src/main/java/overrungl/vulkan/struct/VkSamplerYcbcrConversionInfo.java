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
/// ### conversion
/// [VarHandle][#VH_conversion] - [Getter][#conversion()] - [Setter][#conversion(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerYcbcrConversionInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkSamplerYcbcrConversion conversion;
/// } VkSamplerYcbcrConversionInfo;
/// ```
public final class VkSamplerYcbcrConversionInfo extends Struct {
    /// The struct layout of `VkSamplerYcbcrConversionInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("conversion")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `conversion` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_conversion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conversion"));

    /// Creates `VkSamplerYcbcrConversionInfo` with the given segment.
    /// @param segment the memory segment
    public VkSamplerYcbcrConversionInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerYcbcrConversionInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionInfo(segment); }

    /// Creates `VkSamplerYcbcrConversionInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerYcbcrConversionInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSamplerYcbcrConversionInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerYcbcrConversionInfo`
    public static VkSamplerYcbcrConversionInfo alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerYcbcrConversionInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerYcbcrConversionInfo`
    public static VkSamplerYcbcrConversionInfo alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSamplerYcbcrConversionInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerYcbcrConversionInfo`
    public VkSamplerYcbcrConversionInfo asSlice(long index) { return new VkSamplerYcbcrConversionInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSamplerYcbcrConversionInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerYcbcrConversionInfo`
    public VkSamplerYcbcrConversionInfo asSlice(long index, long count) { return new VkSamplerYcbcrConversionInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerYcbcrConversionInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerYcbcrConversionInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerYcbcrConversionInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerYcbcrConversionInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerYcbcrConversionInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionInfo sType(@CType("VkStructureType") int value) { VkSamplerYcbcrConversionInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSamplerYcbcrConversionInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSamplerYcbcrConversionInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSamplerYcbcrConversionInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `conversion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrConversion") java.lang.foreign.MemorySegment get_conversion(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_conversion.get(segment, 0L, index); }
    /// {@return `conversion`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrConversion") java.lang.foreign.MemorySegment get_conversion(MemorySegment segment) { return VkSamplerYcbcrConversionInfo.get_conversion(segment, 0L); }
    /// {@return `conversion` at the given index}
    /// @param index the index
    public @CType("VkSamplerYcbcrConversion") java.lang.foreign.MemorySegment conversionAt(long index) { return VkSamplerYcbcrConversionInfo.get_conversion(this.segment(), index); }
    /// {@return `conversion`}
    public @CType("VkSamplerYcbcrConversion") java.lang.foreign.MemorySegment conversion() { return VkSamplerYcbcrConversionInfo.get_conversion(this.segment()); }
    /// Sets `conversion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conversion(MemorySegment segment, long index, @CType("VkSamplerYcbcrConversion") java.lang.foreign.MemorySegment value) { VH_conversion.set(segment, 0L, index, value); }
    /// Sets `conversion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conversion(MemorySegment segment, @CType("VkSamplerYcbcrConversion") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionInfo.set_conversion(segment, 0L, value); }
    /// Sets `conversion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionInfo conversionAt(long index, @CType("VkSamplerYcbcrConversion") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionInfo.set_conversion(this.segment(), index, value); return this; }
    /// Sets `conversion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionInfo conversion(@CType("VkSamplerYcbcrConversion") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionInfo.set_conversion(this.segment(), value); return this; }

}
