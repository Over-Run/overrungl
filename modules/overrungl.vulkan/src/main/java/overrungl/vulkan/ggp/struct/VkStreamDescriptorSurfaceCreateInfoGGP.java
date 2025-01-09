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
package overrungl.vulkan.ggp.struct;

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
/// ### streamDescriptor
/// [VarHandle][#VH_streamDescriptor] - [Getter][#streamDescriptor()] - [Setter][#streamDescriptor(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkStreamDescriptorSurfaceCreateInfoGGP {
///     VkStructureType sType;
///     const void * pNext;
///     VkStreamDescriptorSurfaceCreateFlagsGGP flags;
///     GgpStreamDescriptor streamDescriptor;
/// } VkStreamDescriptorSurfaceCreateInfoGGP;
/// ```
public final class VkStreamDescriptorSurfaceCreateInfoGGP extends Struct {
    /// The struct layout of `VkStreamDescriptorSurfaceCreateInfoGGP`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("streamDescriptor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `streamDescriptor` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_streamDescriptor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("streamDescriptor"));

    /// Creates `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment.
    /// @param segment the memory segment
    public VkStreamDescriptorSurfaceCreateInfoGGP(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStreamDescriptorSurfaceCreateInfoGGP of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkStreamDescriptorSurfaceCreateInfoGGP(segment); }

    /// Creates `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStreamDescriptorSurfaceCreateInfoGGP ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkStreamDescriptorSurfaceCreateInfoGGP(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStreamDescriptorSurfaceCreateInfoGGP ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkStreamDescriptorSurfaceCreateInfoGGP(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStreamDescriptorSurfaceCreateInfoGGP`
    public static VkStreamDescriptorSurfaceCreateInfoGGP alloc(SegmentAllocator allocator) { return new VkStreamDescriptorSurfaceCreateInfoGGP(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStreamDescriptorSurfaceCreateInfoGGP`
    public static VkStreamDescriptorSurfaceCreateInfoGGP alloc(SegmentAllocator allocator, long count) { return new VkStreamDescriptorSurfaceCreateInfoGGP(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkStreamDescriptorSurfaceCreateInfoGGP.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkStreamDescriptorSurfaceCreateInfoGGP.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkStreamDescriptorSurfaceCreateInfoGGP.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP sTypeAt(long index, @CType("VkStructureType") int value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP sType(@CType("VkStructureType") int value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkStreamDescriptorSurfaceCreateInfoGGP.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkStreamDescriptorSurfaceCreateInfoGGP.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkStreamDescriptorSurfaceCreateInfoGGP.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStreamDescriptorSurfaceCreateFlagsGGP") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkStreamDescriptorSurfaceCreateFlagsGGP") int get_flags(MemorySegment segment) { return VkStreamDescriptorSurfaceCreateInfoGGP.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkStreamDescriptorSurfaceCreateFlagsGGP") int flagsAt(long index) { return VkStreamDescriptorSurfaceCreateInfoGGP.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkStreamDescriptorSurfaceCreateFlagsGGP") int flags() { return VkStreamDescriptorSurfaceCreateInfoGGP.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkStreamDescriptorSurfaceCreateFlagsGGP") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkStreamDescriptorSurfaceCreateFlagsGGP") int value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP flagsAt(long index, @CType("VkStreamDescriptorSurfaceCreateFlagsGGP") int value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP flags(@CType("VkStreamDescriptorSurfaceCreateFlagsGGP") int value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_flags(this.segment(), value); return this; }

    /// {@return `streamDescriptor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("GgpStreamDescriptor") java.lang.foreign.MemorySegment get_streamDescriptor(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_streamDescriptor.get(segment, 0L, index); }
    /// {@return `streamDescriptor`}
    /// @param segment the segment of the struct
    public static @CType("GgpStreamDescriptor") java.lang.foreign.MemorySegment get_streamDescriptor(MemorySegment segment) { return VkStreamDescriptorSurfaceCreateInfoGGP.get_streamDescriptor(segment, 0L); }
    /// {@return `streamDescriptor` at the given index}
    /// @param index the index
    public @CType("GgpStreamDescriptor") java.lang.foreign.MemorySegment streamDescriptorAt(long index) { return VkStreamDescriptorSurfaceCreateInfoGGP.get_streamDescriptor(this.segment(), index); }
    /// {@return `streamDescriptor`}
    public @CType("GgpStreamDescriptor") java.lang.foreign.MemorySegment streamDescriptor() { return VkStreamDescriptorSurfaceCreateInfoGGP.get_streamDescriptor(this.segment()); }
    /// Sets `streamDescriptor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_streamDescriptor(MemorySegment segment, long index, @CType("GgpStreamDescriptor") java.lang.foreign.MemorySegment value) { VH_streamDescriptor.set(segment, 0L, index, value); }
    /// Sets `streamDescriptor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_streamDescriptor(MemorySegment segment, @CType("GgpStreamDescriptor") java.lang.foreign.MemorySegment value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_streamDescriptor(segment, 0L, value); }
    /// Sets `streamDescriptor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP streamDescriptorAt(long index, @CType("GgpStreamDescriptor") java.lang.foreign.MemorySegment value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_streamDescriptor(this.segment(), index, value); return this; }
    /// Sets `streamDescriptor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP streamDescriptor(@CType("GgpStreamDescriptor") java.lang.foreign.MemorySegment value) { VkStreamDescriptorSurfaceCreateInfoGGP.set_streamDescriptor(this.segment(), value); return this; }

}
