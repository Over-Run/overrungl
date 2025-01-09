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
/// ### enableYDegamma
/// [VarHandle][#VH_enableYDegamma] - [Getter][#enableYDegamma()] - [Setter][#enableYDegamma(int)]
/// ### enableCbCrDegamma
/// [VarHandle][#VH_enableCbCrDegamma] - [Getter][#enableCbCrDegamma()] - [Setter][#enableCbCrDegamma(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 enableYDegamma;
///     VkBool32 enableCbCrDegamma;
/// } VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM;
/// ```
public final class VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM extends Struct {
    /// The struct layout of `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enableYDegamma"),
        ValueLayout.JAVA_INT.withName("enableCbCrDegamma")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `enableYDegamma` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enableYDegamma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enableYDegamma"));
    /// The [VarHandle] of `enableCbCrDegamma` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enableCbCrDegamma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enableCbCrDegamma"));

    /// Creates `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment); }

    /// Creates `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sType(@CType("VkStructureType") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `enableYDegamma` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_enableYDegamma(MemorySegment segment, long index) { return (int) VH_enableYDegamma.get(segment, 0L, index); }
    /// {@return `enableYDegamma`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_enableYDegamma(MemorySegment segment) { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_enableYDegamma(segment, 0L); }
    /// {@return `enableYDegamma` at the given index}
    /// @param index the index
    public @CType("VkBool32") int enableYDegammaAt(long index) { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_enableYDegamma(this.segment(), index); }
    /// {@return `enableYDegamma`}
    public @CType("VkBool32") int enableYDegamma() { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_enableYDegamma(this.segment()); }
    /// Sets `enableYDegamma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enableYDegamma(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_enableYDegamma.set(segment, 0L, index, value); }
    /// Sets `enableYDegamma` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enableYDegamma(MemorySegment segment, @CType("VkBool32") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_enableYDegamma(segment, 0L, value); }
    /// Sets `enableYDegamma` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegammaAt(long index, @CType("VkBool32") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_enableYDegamma(this.segment(), index, value); return this; }
    /// Sets `enableYDegamma` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegamma(@CType("VkBool32") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_enableYDegamma(this.segment(), value); return this; }

    /// {@return `enableCbCrDegamma` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_enableCbCrDegamma(MemorySegment segment, long index) { return (int) VH_enableCbCrDegamma.get(segment, 0L, index); }
    /// {@return `enableCbCrDegamma`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_enableCbCrDegamma(MemorySegment segment) { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_enableCbCrDegamma(segment, 0L); }
    /// {@return `enableCbCrDegamma` at the given index}
    /// @param index the index
    public @CType("VkBool32") int enableCbCrDegammaAt(long index) { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_enableCbCrDegamma(this.segment(), index); }
    /// {@return `enableCbCrDegamma`}
    public @CType("VkBool32") int enableCbCrDegamma() { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.get_enableCbCrDegamma(this.segment()); }
    /// Sets `enableCbCrDegamma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enableCbCrDegamma(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_enableCbCrDegamma.set(segment, 0L, index, value); }
    /// Sets `enableCbCrDegamma` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enableCbCrDegamma(MemorySegment segment, @CType("VkBool32") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_enableCbCrDegamma(segment, 0L, value); }
    /// Sets `enableCbCrDegamma` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegammaAt(long index, @CType("VkBool32") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_enableCbCrDegamma(this.segment(), index, value); return this; }
    /// Sets `enableCbCrDegamma` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegamma(@CType("VkBool32") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.set_enableCbCrDegamma(this.segment(), value); return this; }

}