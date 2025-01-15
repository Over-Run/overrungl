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
package overrungl.vulkan.fuchsia.struct;

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
/// ### imagePipeHandle
/// [VarHandle][#VH_imagePipeHandle] - [Getter][#imagePipeHandle()] - [Setter][#imagePipeHandle(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImagePipeSurfaceCreateInfoFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     VkImagePipeSurfaceCreateFlagsFUCHSIA flags;
///     zx_handle_t imagePipeHandle;
/// } VkImagePipeSurfaceCreateInfoFUCHSIA;
/// ```
public sealed class VkImagePipeSurfaceCreateInfoFUCHSIA extends Struct {
    /// The struct layout of `VkImagePipeSurfaceCreateInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("imagePipeHandle")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `imagePipeHandle` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imagePipeHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imagePipeHandle"));

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkImagePipeSurfaceCreateInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImagePipeSurfaceCreateInfoFUCHSIA(segment); }

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImagePipeSurfaceCreateInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int flags, @CType("zx_handle_t") int imagePipeHandle) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imagePipeHandle(imagePipeHandle); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImagePipeSurfaceCreateInfoFUCHSIA copyFrom(VkImagePipeSurfaceCreateInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImagePipeSurfaceCreateInfoFUCHSIA sType(@CType("VkStructureType") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImagePipeSurfaceCreateInfoFUCHSIA pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int get_flags(MemorySegment segment) { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int flags() { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImagePipeSurfaceCreateInfoFUCHSIA flags(@CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_flags(this.segment(), value); return this; }

    /// {@return `imagePipeHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("zx_handle_t") int get_imagePipeHandle(MemorySegment segment, long index) { return (int) VH_imagePipeHandle.get(segment, 0L, index); }
    /// {@return `imagePipeHandle`}
    /// @param segment the segment of the struct
    public static @CType("zx_handle_t") int get_imagePipeHandle(MemorySegment segment) { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_imagePipeHandle(segment, 0L); }
    /// {@return `imagePipeHandle`}
    public @CType("zx_handle_t") int imagePipeHandle() { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_imagePipeHandle(this.segment()); }
    /// Sets `imagePipeHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imagePipeHandle(MemorySegment segment, long index, @CType("zx_handle_t") int value) { VH_imagePipeHandle.set(segment, 0L, index, value); }
    /// Sets `imagePipeHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imagePipeHandle(MemorySegment segment, @CType("zx_handle_t") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_imagePipeHandle(segment, 0L, value); }
    /// Sets `imagePipeHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImagePipeSurfaceCreateInfoFUCHSIA imagePipeHandle(@CType("zx_handle_t") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_imagePipeHandle(this.segment(), value); return this; }

    /// A buffer of [VkImagePipeSurfaceCreateInfoFUCHSIA].
    public static final class Buffer extends VkImagePipeSurfaceCreateInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImagePipeSurfaceCreateInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImagePipeSurfaceCreateInfoFUCHSIA`
        public VkImagePipeSurfaceCreateInfoFUCHSIA asSlice(long index) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImagePipeSurfaceCreateInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImagePipeSurfaceCreateInfoFUCHSIA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int flagsAt(long index) { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkImagePipeSurfaceCreateFlagsFUCHSIA") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_flags(this.segment(), index, value); return this; }

        /// {@return `imagePipeHandle` at the given index}
        /// @param index the index
        public @CType("zx_handle_t") int imagePipeHandleAt(long index) { return VkImagePipeSurfaceCreateInfoFUCHSIA.get_imagePipeHandle(this.segment(), index); }
        /// Sets `imagePipeHandle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imagePipeHandleAt(long index, @CType("zx_handle_t") int value) { VkImagePipeSurfaceCreateInfoFUCHSIA.set_imagePipeHandle(this.segment(), index, value); return this; }

    }
}
