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
package overrungl.vulkan.arm.struct;

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
/// ### pixelRate
/// [VarHandle][#VH_pixelRate] - [Getter][#pixelRate()] - [Setter][#pixelRate(int)]
/// ### texelRate
/// [VarHandle][#VH_texelRate] - [Getter][#texelRate()] - [Setter][#texelRate(int)]
/// ### fmaRate
/// [VarHandle][#VH_fmaRate] - [Getter][#fmaRate()] - [Setter][#fmaRate(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderCorePropertiesARM {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t pixelRate;
///     uint32_t texelRate;
///     uint32_t fmaRate;
/// } VkPhysicalDeviceShaderCorePropertiesARM;
/// ```
public sealed class VkPhysicalDeviceShaderCorePropertiesARM extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderCorePropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pixelRate"),
        ValueLayout.JAVA_INT.withName("texelRate"),
        ValueLayout.JAVA_INT.withName("fmaRate")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pixelRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pixelRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelRate"));
    /// The [VarHandle] of `texelRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_texelRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("texelRate"));
    /// The [VarHandle] of `fmaRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fmaRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fmaRate"));

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderCorePropertiesARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesARM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesARM(segment); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesARM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesARM`
    public static VkPhysicalDeviceShaderCorePropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCorePropertiesARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesARM`
    public static VkPhysicalDeviceShaderCorePropertiesARM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int pixelRate, @CType("uint32_t") int texelRate, @CType("uint32_t") int fmaRate) { return alloc(allocator).sType(sType).pNext(pNext).pixelRate(pixelRate).texelRate(texelRate).fmaRate(fmaRate); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM copyFrom(VkPhysicalDeviceShaderCorePropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesARM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderCorePropertiesARM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesARM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceShaderCorePropertiesARM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceShaderCorePropertiesARM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceShaderCorePropertiesARM.set_pNext(this.segment(), value); return this; }

    /// {@return `pixelRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pixelRate(MemorySegment segment, long index) { return (int) VH_pixelRate.get(segment, 0L, index); }
    /// {@return `pixelRate`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pixelRate(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesARM.get_pixelRate(segment, 0L); }
    /// {@return `pixelRate`}
    public @CType("uint32_t") int pixelRate() { return VkPhysicalDeviceShaderCorePropertiesARM.get_pixelRate(this.segment()); }
    /// Sets `pixelRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pixelRate(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pixelRate.set(segment, 0L, index, value); }
    /// Sets `pixelRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pixelRate(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_pixelRate(segment, 0L, value); }
    /// Sets `pixelRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM pixelRate(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_pixelRate(this.segment(), value); return this; }

    /// {@return `texelRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_texelRate(MemorySegment segment, long index) { return (int) VH_texelRate.get(segment, 0L, index); }
    /// {@return `texelRate`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_texelRate(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesARM.get_texelRate(segment, 0L); }
    /// {@return `texelRate`}
    public @CType("uint32_t") int texelRate() { return VkPhysicalDeviceShaderCorePropertiesARM.get_texelRate(this.segment()); }
    /// Sets `texelRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_texelRate(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_texelRate.set(segment, 0L, index, value); }
    /// Sets `texelRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_texelRate(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_texelRate(segment, 0L, value); }
    /// Sets `texelRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM texelRate(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_texelRate(this.segment(), value); return this; }

    /// {@return `fmaRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_fmaRate(MemorySegment segment, long index) { return (int) VH_fmaRate.get(segment, 0L, index); }
    /// {@return `fmaRate`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_fmaRate(MemorySegment segment) { return VkPhysicalDeviceShaderCorePropertiesARM.get_fmaRate(segment, 0L); }
    /// {@return `fmaRate`}
    public @CType("uint32_t") int fmaRate() { return VkPhysicalDeviceShaderCorePropertiesARM.get_fmaRate(this.segment()); }
    /// Sets `fmaRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fmaRate(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_fmaRate.set(segment, 0L, index, value); }
    /// Sets `fmaRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fmaRate(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_fmaRate(segment, 0L, value); }
    /// Sets `fmaRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM fmaRate(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_fmaRate(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderCorePropertiesARM].
    public static final class Buffer extends VkPhysicalDeviceShaderCorePropertiesARM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderCorePropertiesARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderCorePropertiesARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderCorePropertiesARM`
        public VkPhysicalDeviceShaderCorePropertiesARM asSlice(long index) { return new VkPhysicalDeviceShaderCorePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderCorePropertiesARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderCorePropertiesARM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderCorePropertiesARM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderCorePropertiesARM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceShaderCorePropertiesARM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pixelRate` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pixelRateAt(long index) { return VkPhysicalDeviceShaderCorePropertiesARM.get_pixelRate(this.segment(), index); }
        /// Sets `pixelRate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pixelRateAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_pixelRate(this.segment(), index, value); return this; }

        /// {@return `texelRate` at the given index}
        /// @param index the index
        public @CType("uint32_t") int texelRateAt(long index) { return VkPhysicalDeviceShaderCorePropertiesARM.get_texelRate(this.segment(), index); }
        /// Sets `texelRate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer texelRateAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_texelRate(this.segment(), index, value); return this; }

        /// {@return `fmaRate` at the given index}
        /// @param index the index
        public @CType("uint32_t") int fmaRateAt(long index) { return VkPhysicalDeviceShaderCorePropertiesARM.get_fmaRate(this.segment(), index); }
        /// Sets `fmaRate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fmaRateAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCorePropertiesARM.set_fmaRate(this.segment(), index, value); return this; }

    }
}
