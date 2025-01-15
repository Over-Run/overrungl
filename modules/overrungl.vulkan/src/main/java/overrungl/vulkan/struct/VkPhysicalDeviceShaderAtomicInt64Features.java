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
/// ### shaderBufferInt64Atomics
/// [VarHandle][#VH_shaderBufferInt64Atomics] - [Getter][#shaderBufferInt64Atomics()] - [Setter][#shaderBufferInt64Atomics(int)]
/// ### shaderSharedInt64Atomics
/// [VarHandle][#VH_shaderSharedInt64Atomics] - [Getter][#shaderSharedInt64Atomics()] - [Setter][#shaderSharedInt64Atomics(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderAtomicInt64Features {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderBufferInt64Atomics;
///     VkBool32 shaderSharedInt64Atomics;
/// } VkPhysicalDeviceShaderAtomicInt64Features;
/// ```
public sealed class VkPhysicalDeviceShaderAtomicInt64Features extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderAtomicInt64Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferInt64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedInt64Atomics")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderBufferInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferInt64Atomics"));
    /// The [VarHandle] of `shaderSharedInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedInt64Atomics"));

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderAtomicInt64Features(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicInt64Features of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicInt64Features(segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicInt64Features ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicInt64Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicInt64Features`
    public static VkPhysicalDeviceShaderAtomicInt64Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicInt64Features(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderAtomicInt64Features`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicInt64Features`
    public static VkPhysicalDeviceShaderAtomicInt64Features allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int shaderBufferInt64Atomics, @CType("VkBool32") int shaderSharedInt64Atomics) { return alloc(allocator).sType(sType).pNext(pNext).shaderBufferInt64Atomics(shaderBufferInt64Atomics).shaderSharedInt64Atomics(shaderSharedInt64Atomics); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features copyFrom(VkPhysicalDeviceShaderAtomicInt64Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicInt64Features.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderAtomicInt64Features.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicInt64Features.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderAtomicInt64Features.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicInt64Features.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicInt64Features.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderBufferInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferInt64Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferInt64Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicInt64Features.get_shaderBufferInt64Atomics(segment, 0L); }
    /// {@return `shaderBufferInt64Atomics`}
    public @CType("VkBool32") int shaderBufferInt64Atomics() { return VkPhysicalDeviceShaderAtomicInt64Features.get_shaderBufferInt64Atomics(this.segment()); }
    /// Sets `shaderBufferInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferInt64Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferInt64Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferInt64Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_shaderBufferInt64Atomics(segment, 0L, value); }
    /// Sets `shaderBufferInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features shaderBufferInt64Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_shaderBufferInt64Atomics(this.segment(), value); return this; }

    /// {@return `shaderSharedInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedInt64Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedInt64Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicInt64Features.get_shaderSharedInt64Atomics(segment, 0L); }
    /// {@return `shaderSharedInt64Atomics`}
    public @CType("VkBool32") int shaderSharedInt64Atomics() { return VkPhysicalDeviceShaderAtomicInt64Features.get_shaderSharedInt64Atomics(this.segment()); }
    /// Sets `shaderSharedInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedInt64Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedInt64Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedInt64Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_shaderSharedInt64Atomics(segment, 0L, value); }
    /// Sets `shaderSharedInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features shaderSharedInt64Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_shaderSharedInt64Atomics(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderAtomicInt64Features].
    public static final class Buffer extends VkPhysicalDeviceShaderAtomicInt64Features {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderAtomicInt64Features.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderAtomicInt64Features`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderAtomicInt64Features`
        public VkPhysicalDeviceShaderAtomicInt64Features asSlice(long index) { return new VkPhysicalDeviceShaderAtomicInt64Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderAtomicInt64Features`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderAtomicInt64Features`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderAtomicInt64Features.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderAtomicInt64Features.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicInt64Features.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderBufferInt64Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderBufferInt64AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicInt64Features.get_shaderBufferInt64Atomics(this.segment(), index); }
        /// Sets `shaderBufferInt64Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferInt64AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_shaderBufferInt64Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderSharedInt64Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSharedInt64AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicInt64Features.get_shaderSharedInt64Atomics(this.segment(), index); }
        /// Sets `shaderSharedInt64Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedInt64AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicInt64Features.set_shaderSharedInt64Atomics(this.segment(), index, value); return this; }

    }
}
