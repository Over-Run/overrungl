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
package overrungl.vulkan.ext.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### dfb
/// [VarHandle][#VH_dfb] - [Getter][#dfb()] - [Setter][#dfb(MemorySegment)]
/// ### surface
/// [VarHandle][#VH_surface] - [Getter][#surface()] - [Setter][#surface(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDirectFBSurfaceCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDirectFBSurfaceCreateFlagsEXT flags;
///     IDirectFB * dfb;
///     IDirectFBSurface * surface;
/// } VkDirectFBSurfaceCreateInfoEXT;
/// ```
public sealed class VkDirectFBSurfaceCreateInfoEXT extends Struct {
    /// The struct layout of `VkDirectFBSurfaceCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("dfb"),
        ValueLayout.ADDRESS.withName("surface")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `dfb` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dfb = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dfb"));
    /// The [VarHandle] of `surface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));

    /// Creates `VkDirectFBSurfaceCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDirectFBSurfaceCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDirectFBSurfaceCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectFBSurfaceCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDirectFBSurfaceCreateInfoEXT(segment); }

    /// Creates `VkDirectFBSurfaceCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDirectFBSurfaceCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectFBSurfaceCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDirectFBSurfaceCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDirectFBSurfaceCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDirectFBSurfaceCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDirectFBSurfaceCreateInfoEXT`
    public static VkDirectFBSurfaceCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDirectFBSurfaceCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDirectFBSurfaceCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDirectFBSurfaceCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDirectFBSurfaceCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDirectFBSurfaceCreateInfoEXT`
    public static VkDirectFBSurfaceCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDirectFBSurfaceCreateFlagsEXT") int flags, @CType("IDirectFB *") MemorySegment dfb, @CType("IDirectFBSurface *") MemorySegment surface) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).dfb(dfb).surface(surface); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDirectFBSurfaceCreateInfoEXT copyFrom(VkDirectFBSurfaceCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDirectFBSurfaceCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDirectFBSurfaceCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDirectFBSurfaceCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectFBSurfaceCreateInfoEXT sType(@CType("VkStructureType") int value) { VkDirectFBSurfaceCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDirectFBSurfaceCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDirectFBSurfaceCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectFBSurfaceCreateInfoEXT pNext(@CType("const void *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDirectFBSurfaceCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDirectFBSurfaceCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkDirectFBSurfaceCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDirectFBSurfaceCreateFlagsEXT") int flags() { return VkDirectFBSurfaceCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDirectFBSurfaceCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDirectFBSurfaceCreateFlagsEXT") int value) { VkDirectFBSurfaceCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectFBSurfaceCreateInfoEXT flags(@CType("VkDirectFBSurfaceCreateFlagsEXT") int value) { VkDirectFBSurfaceCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `dfb` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("IDirectFB *") MemorySegment get_dfb(MemorySegment segment, long index) { return (MemorySegment) VH_dfb.get(segment, 0L, index); }
    /// {@return `dfb`}
    /// @param segment the segment of the struct
    public static @CType("IDirectFB *") MemorySegment get_dfb(MemorySegment segment) { return VkDirectFBSurfaceCreateInfoEXT.get_dfb(segment, 0L); }
    /// {@return `dfb`}
    public @CType("IDirectFB *") MemorySegment dfb() { return VkDirectFBSurfaceCreateInfoEXT.get_dfb(this.segment()); }
    /// Sets `dfb` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dfb(MemorySegment segment, long index, @CType("IDirectFB *") MemorySegment value) { VH_dfb.set(segment, 0L, index, value); }
    /// Sets `dfb` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dfb(MemorySegment segment, @CType("IDirectFB *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_dfb(segment, 0L, value); }
    /// Sets `dfb` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectFBSurfaceCreateInfoEXT dfb(@CType("IDirectFB *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_dfb(this.segment(), value); return this; }

    /// {@return `surface` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("IDirectFBSurface *") MemorySegment get_surface(MemorySegment segment, long index) { return (MemorySegment) VH_surface.get(segment, 0L, index); }
    /// {@return `surface`}
    /// @param segment the segment of the struct
    public static @CType("IDirectFBSurface *") MemorySegment get_surface(MemorySegment segment) { return VkDirectFBSurfaceCreateInfoEXT.get_surface(segment, 0L); }
    /// {@return `surface`}
    public @CType("IDirectFBSurface *") MemorySegment surface() { return VkDirectFBSurfaceCreateInfoEXT.get_surface(this.segment()); }
    /// Sets `surface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_surface(MemorySegment segment, long index, @CType("IDirectFBSurface *") MemorySegment value) { VH_surface.set(segment, 0L, index, value); }
    /// Sets `surface` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_surface(MemorySegment segment, @CType("IDirectFBSurface *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_surface(segment, 0L, value); }
    /// Sets `surface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectFBSurfaceCreateInfoEXT surface(@CType("IDirectFBSurface *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_surface(this.segment(), value); return this; }

    /// A buffer of [VkDirectFBSurfaceCreateInfoEXT].
    public static final class Buffer extends VkDirectFBSurfaceCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkDirectFBSurfaceCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDirectFBSurfaceCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDirectFBSurfaceCreateInfoEXT`
        public VkDirectFBSurfaceCreateInfoEXT asSlice(long index) { return new VkDirectFBSurfaceCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDirectFBSurfaceCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDirectFBSurfaceCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDirectFBSurfaceCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDirectFBSurfaceCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDirectFBSurfaceCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDirectFBSurfaceCreateFlagsEXT") int flagsAt(long index) { return VkDirectFBSurfaceCreateInfoEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDirectFBSurfaceCreateFlagsEXT") int value) { VkDirectFBSurfaceCreateInfoEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `dfb` at the given index}
        /// @param index the index
        public @CType("IDirectFB *") MemorySegment dfbAt(long index) { return VkDirectFBSurfaceCreateInfoEXT.get_dfb(this.segment(), index); }
        /// Sets `dfb` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dfbAt(long index, @CType("IDirectFB *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_dfb(this.segment(), index, value); return this; }

        /// {@return `surface` at the given index}
        /// @param index the index
        public @CType("IDirectFBSurface *") MemorySegment surfaceAt(long index) { return VkDirectFBSurfaceCreateInfoEXT.get_surface(this.segment(), index); }
        /// Sets `surface` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer surfaceAt(long index, @CType("IDirectFBSurface *") MemorySegment value) { VkDirectFBSurfaceCreateInfoEXT.set_surface(this.segment(), index, value); return this; }

    }
}
