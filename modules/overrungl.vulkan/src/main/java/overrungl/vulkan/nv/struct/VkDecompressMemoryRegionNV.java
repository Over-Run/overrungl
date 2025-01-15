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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### srcAddress
/// [VarHandle][#VH_srcAddress] - [Getter][#srcAddress()] - [Setter][#srcAddress(long)]
/// ### dstAddress
/// [VarHandle][#VH_dstAddress] - [Getter][#dstAddress()] - [Setter][#dstAddress(long)]
/// ### compressedSize
/// [VarHandle][#VH_compressedSize] - [Getter][#compressedSize()] - [Setter][#compressedSize(long)]
/// ### decompressedSize
/// [VarHandle][#VH_decompressedSize] - [Getter][#decompressedSize()] - [Setter][#decompressedSize(long)]
/// ### decompressionMethod
/// [VarHandle][#VH_decompressionMethod] - [Getter][#decompressionMethod()] - [Setter][#decompressionMethod(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDecompressMemoryRegionNV {
///     VkDeviceAddress srcAddress;
///     VkDeviceAddress dstAddress;
///     VkDeviceSize compressedSize;
///     VkDeviceSize decompressedSize;
///     VkMemoryDecompressionMethodFlagsNV decompressionMethod;
/// } VkDecompressMemoryRegionNV;
/// ```
public sealed class VkDecompressMemoryRegionNV extends Struct {
    /// The struct layout of `VkDecompressMemoryRegionNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("compressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressionMethod")
    );
    /// The [VarHandle] of `srcAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_srcAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress"));
    /// The [VarHandle] of `dstAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dstAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddress"));
    /// The [VarHandle] of `compressedSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_compressedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressedSize"));
    /// The [VarHandle] of `decompressedSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_decompressedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressedSize"));
    /// The [VarHandle] of `decompressionMethod` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_decompressionMethod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressionMethod"));

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    /// @param segment the memory segment
    public VkDecompressMemoryRegionNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDecompressMemoryRegionNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDecompressMemoryRegionNV(segment); }

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDecompressMemoryRegionNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDecompressMemoryRegionNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDecompressMemoryRegionNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDecompressMemoryRegionNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDecompressMemoryRegionNV`
    public static VkDecompressMemoryRegionNV alloc(SegmentAllocator allocator) { return new VkDecompressMemoryRegionNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDecompressMemoryRegionNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDecompressMemoryRegionNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDecompressMemoryRegionNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDecompressMemoryRegionNV`
    public static VkDecompressMemoryRegionNV allocInit(SegmentAllocator allocator, @CType("VkDeviceAddress") long srcAddress, @CType("VkDeviceAddress") long dstAddress, @CType("VkDeviceSize") long compressedSize, @CType("VkDeviceSize") long decompressedSize, @CType("VkMemoryDecompressionMethodFlagsNV") long decompressionMethod) { return alloc(allocator).srcAddress(srcAddress).dstAddress(dstAddress).compressedSize(compressedSize).decompressedSize(decompressedSize).decompressionMethod(decompressionMethod); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDecompressMemoryRegionNV copyFrom(VkDecompressMemoryRegionNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `srcAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_srcAddress(MemorySegment segment, long index) { return (long) VH_srcAddress.get(segment, 0L, index); }
    /// {@return `srcAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_srcAddress(MemorySegment segment) { return VkDecompressMemoryRegionNV.get_srcAddress(segment, 0L); }
    /// {@return `srcAddress`}
    public @CType("VkDeviceAddress") long srcAddress() { return VkDecompressMemoryRegionNV.get_srcAddress(this.segment()); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_srcAddress.set(segment, 0L, index, value); }
    /// Sets `srcAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDecompressMemoryRegionNV.set_srcAddress(segment, 0L, value); }
    /// Sets `srcAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV srcAddress(@CType("VkDeviceAddress") long value) { VkDecompressMemoryRegionNV.set_srcAddress(this.segment(), value); return this; }

    /// {@return `dstAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_dstAddress(MemorySegment segment, long index) { return (long) VH_dstAddress.get(segment, 0L, index); }
    /// {@return `dstAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_dstAddress(MemorySegment segment) { return VkDecompressMemoryRegionNV.get_dstAddress(segment, 0L); }
    /// {@return `dstAddress`}
    public @CType("VkDeviceAddress") long dstAddress() { return VkDecompressMemoryRegionNV.get_dstAddress(this.segment()); }
    /// Sets `dstAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_dstAddress.set(segment, 0L, index, value); }
    /// Sets `dstAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDecompressMemoryRegionNV.set_dstAddress(segment, 0L, value); }
    /// Sets `dstAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV dstAddress(@CType("VkDeviceAddress") long value) { VkDecompressMemoryRegionNV.set_dstAddress(this.segment(), value); return this; }

    /// {@return `compressedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_compressedSize(MemorySegment segment, long index) { return (long) VH_compressedSize.get(segment, 0L, index); }
    /// {@return `compressedSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_compressedSize(MemorySegment segment) { return VkDecompressMemoryRegionNV.get_compressedSize(segment, 0L); }
    /// {@return `compressedSize`}
    public @CType("VkDeviceSize") long compressedSize() { return VkDecompressMemoryRegionNV.get_compressedSize(this.segment()); }
    /// Sets `compressedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compressedSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_compressedSize.set(segment, 0L, index, value); }
    /// Sets `compressedSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compressedSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDecompressMemoryRegionNV.set_compressedSize(segment, 0L, value); }
    /// Sets `compressedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV compressedSize(@CType("VkDeviceSize") long value) { VkDecompressMemoryRegionNV.set_compressedSize(this.segment(), value); return this; }

    /// {@return `decompressedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_decompressedSize(MemorySegment segment, long index) { return (long) VH_decompressedSize.get(segment, 0L, index); }
    /// {@return `decompressedSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_decompressedSize(MemorySegment segment) { return VkDecompressMemoryRegionNV.get_decompressedSize(segment, 0L); }
    /// {@return `decompressedSize`}
    public @CType("VkDeviceSize") long decompressedSize() { return VkDecompressMemoryRegionNV.get_decompressedSize(this.segment()); }
    /// Sets `decompressedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_decompressedSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_decompressedSize.set(segment, 0L, index, value); }
    /// Sets `decompressedSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_decompressedSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDecompressMemoryRegionNV.set_decompressedSize(segment, 0L, value); }
    /// Sets `decompressedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV decompressedSize(@CType("VkDeviceSize") long value) { VkDecompressMemoryRegionNV.set_decompressedSize(this.segment(), value); return this; }

    /// {@return `decompressionMethod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMemoryDecompressionMethodFlagsNV") long get_decompressionMethod(MemorySegment segment, long index) { return (long) VH_decompressionMethod.get(segment, 0L, index); }
    /// {@return `decompressionMethod`}
    /// @param segment the segment of the struct
    public static @CType("VkMemoryDecompressionMethodFlagsNV") long get_decompressionMethod(MemorySegment segment) { return VkDecompressMemoryRegionNV.get_decompressionMethod(segment, 0L); }
    /// {@return `decompressionMethod`}
    public @CType("VkMemoryDecompressionMethodFlagsNV") long decompressionMethod() { return VkDecompressMemoryRegionNV.get_decompressionMethod(this.segment()); }
    /// Sets `decompressionMethod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_decompressionMethod(MemorySegment segment, long index, @CType("VkMemoryDecompressionMethodFlagsNV") long value) { VH_decompressionMethod.set(segment, 0L, index, value); }
    /// Sets `decompressionMethod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_decompressionMethod(MemorySegment segment, @CType("VkMemoryDecompressionMethodFlagsNV") long value) { VkDecompressMemoryRegionNV.set_decompressionMethod(segment, 0L, value); }
    /// Sets `decompressionMethod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDecompressMemoryRegionNV decompressionMethod(@CType("VkMemoryDecompressionMethodFlagsNV") long value) { VkDecompressMemoryRegionNV.set_decompressionMethod(this.segment(), value); return this; }

    /// A buffer of [VkDecompressMemoryRegionNV].
    public static final class Buffer extends VkDecompressMemoryRegionNV {
        private final long elementCount;

        /// Creates `VkDecompressMemoryRegionNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDecompressMemoryRegionNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDecompressMemoryRegionNV`
        public VkDecompressMemoryRegionNV asSlice(long index) { return new VkDecompressMemoryRegionNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDecompressMemoryRegionNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDecompressMemoryRegionNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `srcAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long srcAddressAt(long index) { return VkDecompressMemoryRegionNV.get_srcAddress(this.segment(), index); }
        /// Sets `srcAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcAddressAt(long index, @CType("VkDeviceAddress") long value) { VkDecompressMemoryRegionNV.set_srcAddress(this.segment(), index, value); return this; }

        /// {@return `dstAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long dstAddressAt(long index) { return VkDecompressMemoryRegionNV.get_dstAddress(this.segment(), index); }
        /// Sets `dstAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstAddressAt(long index, @CType("VkDeviceAddress") long value) { VkDecompressMemoryRegionNV.set_dstAddress(this.segment(), index, value); return this; }

        /// {@return `compressedSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long compressedSizeAt(long index) { return VkDecompressMemoryRegionNV.get_compressedSize(this.segment(), index); }
        /// Sets `compressedSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer compressedSizeAt(long index, @CType("VkDeviceSize") long value) { VkDecompressMemoryRegionNV.set_compressedSize(this.segment(), index, value); return this; }

        /// {@return `decompressedSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long decompressedSizeAt(long index) { return VkDecompressMemoryRegionNV.get_decompressedSize(this.segment(), index); }
        /// Sets `decompressedSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer decompressedSizeAt(long index, @CType("VkDeviceSize") long value) { VkDecompressMemoryRegionNV.set_decompressedSize(this.segment(), index, value); return this; }

        /// {@return `decompressionMethod` at the given index}
        /// @param index the index
        public @CType("VkMemoryDecompressionMethodFlagsNV") long decompressionMethodAt(long index) { return VkDecompressMemoryRegionNV.get_decompressionMethod(this.segment(), index); }
        /// Sets `decompressionMethod` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer decompressionMethodAt(long index, @CType("VkMemoryDecompressionMethodFlagsNV") long value) { VkDecompressMemoryRegionNV.set_decompressionMethod(this.segment(), index, value); return this; }

    }
}
