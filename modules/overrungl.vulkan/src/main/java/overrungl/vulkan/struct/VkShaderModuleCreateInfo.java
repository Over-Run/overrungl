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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### codeSize
/// [VarHandle][#VH_codeSize] - [Getter][#codeSize()] - [Setter][#codeSize(long)]
/// ### pCode
/// [VarHandle][#VH_pCode] - [Getter][#pCode()] - [Setter][#pCode(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkShaderModuleCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkShaderModuleCreateFlags flags;
///     size_t codeSize;
///     const uint32_t * pCode;
/// } VkShaderModuleCreateInfo;
/// ```
public sealed class VkShaderModuleCreateInfo extends Struct {
    /// The struct layout of `VkShaderModuleCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("codeSize"),
        ValueLayout.ADDRESS.withName("pCode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `codeSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_codeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeSize"));
    /// The [VarHandle] of `pCode` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCode"));

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkShaderModuleCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderModuleCreateInfo(segment); }

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderModuleCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo alloc(SegmentAllocator allocator) { return new VkShaderModuleCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkShaderModuleCreateFlags") int flags, @CType("size_t") long codeSize, @CType("const uint32_t *") java.lang.foreign.MemorySegment pCode) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).codeSize(codeSize).pCode(pCode); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderModuleCreateInfo copyFrom(VkShaderModuleCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkShaderModuleCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkShaderModuleCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkShaderModuleCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo sType(@CType("VkStructureType") int value) { VkShaderModuleCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkShaderModuleCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkShaderModuleCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderModuleCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderModuleCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderModuleCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderModuleCreateFlags") int get_flags(MemorySegment segment) { return VkShaderModuleCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkShaderModuleCreateFlags") int flags() { return VkShaderModuleCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkShaderModuleCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkShaderModuleCreateFlags") int value) { VkShaderModuleCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo flags(@CType("VkShaderModuleCreateFlags") int value) { VkShaderModuleCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `codeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_codeSize(MemorySegment segment, long index) { return (long) VH_codeSize.get(segment, 0L, index); }
    /// {@return `codeSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_codeSize(MemorySegment segment) { return VkShaderModuleCreateInfo.get_codeSize(segment, 0L); }
    /// {@return `codeSize`}
    public @CType("size_t") long codeSize() { return VkShaderModuleCreateInfo.get_codeSize(this.segment()); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_codeSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_codeSize.set(segment, 0L, index, value); }
    /// Sets `codeSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_codeSize(MemorySegment segment, @CType("size_t") long value) { VkShaderModuleCreateInfo.set_codeSize(segment, 0L, value); }
    /// Sets `codeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo codeSize(@CType("size_t") long value) { VkShaderModuleCreateInfo.set_codeSize(this.segment(), value); return this; }

    /// {@return `pCode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pCode(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCode.get(segment, 0L, index); }
    /// {@return `pCode`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pCode(MemorySegment segment) { return VkShaderModuleCreateInfo.get_pCode(segment, 0L); }
    /// {@return `pCode`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pCode() { return VkShaderModuleCreateInfo.get_pCode(this.segment()); }
    /// Sets `pCode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCode(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pCode.set(segment, 0L, index, value); }
    /// Sets `pCode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCode(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkShaderModuleCreateInfo.set_pCode(segment, 0L, value); }
    /// Sets `pCode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo pCode(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkShaderModuleCreateInfo.set_pCode(this.segment(), value); return this; }

    /// A buffer of [VkShaderModuleCreateInfo].
    public static final class Buffer extends VkShaderModuleCreateInfo {
        private final long elementCount;

        /// Creates `VkShaderModuleCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkShaderModuleCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkShaderModuleCreateInfo`
        public VkShaderModuleCreateInfo asSlice(long index) { return new VkShaderModuleCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkShaderModuleCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkShaderModuleCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkShaderModuleCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkShaderModuleCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkShaderModuleCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderModuleCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkShaderModuleCreateFlags") int flagsAt(long index) { return VkShaderModuleCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkShaderModuleCreateFlags") int value) { VkShaderModuleCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `codeSize` at the given index}
        /// @param index the index
        public @CType("size_t") long codeSizeAt(long index) { return VkShaderModuleCreateInfo.get_codeSize(this.segment(), index); }
        /// Sets `codeSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer codeSizeAt(long index, @CType("size_t") long value) { VkShaderModuleCreateInfo.set_codeSize(this.segment(), index, value); return this; }

        /// {@return `pCode` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") java.lang.foreign.MemorySegment pCodeAt(long index) { return VkShaderModuleCreateInfo.get_pCode(this.segment(), index); }
        /// Sets `pCode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCodeAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkShaderModuleCreateInfo.set_pCode(this.segment(), index, value); return this; }

    }
}
