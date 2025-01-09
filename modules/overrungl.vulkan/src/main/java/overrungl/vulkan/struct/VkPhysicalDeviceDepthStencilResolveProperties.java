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
/// ### supportedDepthResolveModes
/// [VarHandle][#VH_supportedDepthResolveModes] - [Getter][#supportedDepthResolveModes()] - [Setter][#supportedDepthResolveModes(int)]
/// ### supportedStencilResolveModes
/// [VarHandle][#VH_supportedStencilResolveModes] - [Getter][#supportedStencilResolveModes()] - [Setter][#supportedStencilResolveModes(int)]
/// ### independentResolveNone
/// [VarHandle][#VH_independentResolveNone] - [Getter][#independentResolveNone()] - [Setter][#independentResolveNone(int)]
/// ### independentResolve
/// [VarHandle][#VH_independentResolve] - [Getter][#independentResolve()] - [Setter][#independentResolve(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDepthStencilResolveProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkResolveModeFlags supportedDepthResolveModes;
///     VkResolveModeFlags supportedStencilResolveModes;
///     VkBool32 independentResolveNone;
///     VkBool32 independentResolve;
/// } VkPhysicalDeviceDepthStencilResolveProperties;
/// ```
public final class VkPhysicalDeviceDepthStencilResolveProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceDepthStencilResolveProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedDepthResolveModes"),
        ValueLayout.JAVA_INT.withName("supportedStencilResolveModes"),
        ValueLayout.JAVA_INT.withName("independentResolveNone"),
        ValueLayout.JAVA_INT.withName("independentResolve")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `supportedDepthResolveModes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedDepthResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedDepthResolveModes"));
    /// The [VarHandle] of `supportedStencilResolveModes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedStencilResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStencilResolveModes"));
    /// The [VarHandle] of `independentResolveNone` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_independentResolveNone = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolveNone"));
    /// The [VarHandle] of `independentResolve` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_independentResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolve"));

    /// Creates `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDepthStencilResolveProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDepthStencilResolveProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthStencilResolveProperties(segment); }

    /// Creates `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDepthStencilResolveProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthStencilResolveProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDepthStencilResolveProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthStencilResolveProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDepthStencilResolveProperties`
    public static VkPhysicalDeviceDepthStencilResolveProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthStencilResolveProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDepthStencilResolveProperties`
    public static VkPhysicalDeviceDepthStencilResolveProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDepthStencilResolveProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDepthStencilResolveProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDepthStencilResolveProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDepthStencilResolveProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDepthStencilResolveProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDepthStencilResolveProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDepthStencilResolveProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDepthStencilResolveProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDepthStencilResolveProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDepthStencilResolveProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `supportedDepthResolveModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkResolveModeFlags") int get_supportedDepthResolveModes(MemorySegment segment, long index) { return (int) VH_supportedDepthResolveModes.get(segment, 0L, index); }
    /// {@return `supportedDepthResolveModes`}
    /// @param segment the segment of the struct
    public static @CType("VkResolveModeFlags") int get_supportedDepthResolveModes(MemorySegment segment) { return VkPhysicalDeviceDepthStencilResolveProperties.get_supportedDepthResolveModes(segment, 0L); }
    /// {@return `supportedDepthResolveModes` at the given index}
    /// @param index the index
    public @CType("VkResolveModeFlags") int supportedDepthResolveModesAt(long index) { return VkPhysicalDeviceDepthStencilResolveProperties.get_supportedDepthResolveModes(this.segment(), index); }
    /// {@return `supportedDepthResolveModes`}
    public @CType("VkResolveModeFlags") int supportedDepthResolveModes() { return VkPhysicalDeviceDepthStencilResolveProperties.get_supportedDepthResolveModes(this.segment()); }
    /// Sets `supportedDepthResolveModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedDepthResolveModes(MemorySegment segment, long index, @CType("VkResolveModeFlags") int value) { VH_supportedDepthResolveModes.set(segment, 0L, index, value); }
    /// Sets `supportedDepthResolveModes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedDepthResolveModes(MemorySegment segment, @CType("VkResolveModeFlags") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_supportedDepthResolveModes(segment, 0L, value); }
    /// Sets `supportedDepthResolveModes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties supportedDepthResolveModesAt(long index, @CType("VkResolveModeFlags") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_supportedDepthResolveModes(this.segment(), index, value); return this; }
    /// Sets `supportedDepthResolveModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties supportedDepthResolveModes(@CType("VkResolveModeFlags") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_supportedDepthResolveModes(this.segment(), value); return this; }

    /// {@return `supportedStencilResolveModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkResolveModeFlags") int get_supportedStencilResolveModes(MemorySegment segment, long index) { return (int) VH_supportedStencilResolveModes.get(segment, 0L, index); }
    /// {@return `supportedStencilResolveModes`}
    /// @param segment the segment of the struct
    public static @CType("VkResolveModeFlags") int get_supportedStencilResolveModes(MemorySegment segment) { return VkPhysicalDeviceDepthStencilResolveProperties.get_supportedStencilResolveModes(segment, 0L); }
    /// {@return `supportedStencilResolveModes` at the given index}
    /// @param index the index
    public @CType("VkResolveModeFlags") int supportedStencilResolveModesAt(long index) { return VkPhysicalDeviceDepthStencilResolveProperties.get_supportedStencilResolveModes(this.segment(), index); }
    /// {@return `supportedStencilResolveModes`}
    public @CType("VkResolveModeFlags") int supportedStencilResolveModes() { return VkPhysicalDeviceDepthStencilResolveProperties.get_supportedStencilResolveModes(this.segment()); }
    /// Sets `supportedStencilResolveModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedStencilResolveModes(MemorySegment segment, long index, @CType("VkResolveModeFlags") int value) { VH_supportedStencilResolveModes.set(segment, 0L, index, value); }
    /// Sets `supportedStencilResolveModes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedStencilResolveModes(MemorySegment segment, @CType("VkResolveModeFlags") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_supportedStencilResolveModes(segment, 0L, value); }
    /// Sets `supportedStencilResolveModes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties supportedStencilResolveModesAt(long index, @CType("VkResolveModeFlags") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_supportedStencilResolveModes(this.segment(), index, value); return this; }
    /// Sets `supportedStencilResolveModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties supportedStencilResolveModes(@CType("VkResolveModeFlags") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_supportedStencilResolveModes(this.segment(), value); return this; }

    /// {@return `independentResolveNone` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_independentResolveNone(MemorySegment segment, long index) { return (int) VH_independentResolveNone.get(segment, 0L, index); }
    /// {@return `independentResolveNone`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_independentResolveNone(MemorySegment segment) { return VkPhysicalDeviceDepthStencilResolveProperties.get_independentResolveNone(segment, 0L); }
    /// {@return `independentResolveNone` at the given index}
    /// @param index the index
    public @CType("VkBool32") int independentResolveNoneAt(long index) { return VkPhysicalDeviceDepthStencilResolveProperties.get_independentResolveNone(this.segment(), index); }
    /// {@return `independentResolveNone`}
    public @CType("VkBool32") int independentResolveNone() { return VkPhysicalDeviceDepthStencilResolveProperties.get_independentResolveNone(this.segment()); }
    /// Sets `independentResolveNone` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_independentResolveNone(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_independentResolveNone.set(segment, 0L, index, value); }
    /// Sets `independentResolveNone` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_independentResolveNone(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_independentResolveNone(segment, 0L, value); }
    /// Sets `independentResolveNone` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolveNoneAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_independentResolveNone(this.segment(), index, value); return this; }
    /// Sets `independentResolveNone` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolveNone(@CType("VkBool32") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_independentResolveNone(this.segment(), value); return this; }

    /// {@return `independentResolve` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_independentResolve(MemorySegment segment, long index) { return (int) VH_independentResolve.get(segment, 0L, index); }
    /// {@return `independentResolve`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_independentResolve(MemorySegment segment) { return VkPhysicalDeviceDepthStencilResolveProperties.get_independentResolve(segment, 0L); }
    /// {@return `independentResolve` at the given index}
    /// @param index the index
    public @CType("VkBool32") int independentResolveAt(long index) { return VkPhysicalDeviceDepthStencilResolveProperties.get_independentResolve(this.segment(), index); }
    /// {@return `independentResolve`}
    public @CType("VkBool32") int independentResolve() { return VkPhysicalDeviceDepthStencilResolveProperties.get_independentResolve(this.segment()); }
    /// Sets `independentResolve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_independentResolve(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_independentResolve.set(segment, 0L, index, value); }
    /// Sets `independentResolve` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_independentResolve(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_independentResolve(segment, 0L, value); }
    /// Sets `independentResolve` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolveAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_independentResolve(this.segment(), index, value); return this; }
    /// Sets `independentResolve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolve(@CType("VkBool32") int value) { VkPhysicalDeviceDepthStencilResolveProperties.set_independentResolve(this.segment(), value); return this; }

}
