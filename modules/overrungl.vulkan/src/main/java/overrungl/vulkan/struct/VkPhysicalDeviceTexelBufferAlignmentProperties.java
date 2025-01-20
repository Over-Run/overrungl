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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### storageTexelBufferOffsetAlignmentBytes
/// [VarHandle][#VH_storageTexelBufferOffsetAlignmentBytes] - [Getter][#storageTexelBufferOffsetAlignmentBytes()] - [Setter][#storageTexelBufferOffsetAlignmentBytes(long)]
/// ### storageTexelBufferOffsetSingleTexelAlignment
/// [VarHandle][#VH_storageTexelBufferOffsetSingleTexelAlignment] - [Getter][#storageTexelBufferOffsetSingleTexelAlignment()] - [Setter][#storageTexelBufferOffsetSingleTexelAlignment(int)]
/// ### uniformTexelBufferOffsetAlignmentBytes
/// [VarHandle][#VH_uniformTexelBufferOffsetAlignmentBytes] - [Getter][#uniformTexelBufferOffsetAlignmentBytes()] - [Setter][#uniformTexelBufferOffsetAlignmentBytes(long)]
/// ### uniformTexelBufferOffsetSingleTexelAlignment
/// [VarHandle][#VH_uniformTexelBufferOffsetSingleTexelAlignment] - [Getter][#uniformTexelBufferOffsetSingleTexelAlignment()] - [Setter][#uniformTexelBufferOffsetSingleTexelAlignment(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceTexelBufferAlignmentProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
/// } VkPhysicalDeviceTexelBufferAlignmentProperties;
/// ```
public sealed class VkPhysicalDeviceTexelBufferAlignmentProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceTexelBufferAlignmentProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `storageTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_storageTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `storageTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `uniformTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `uniformTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceTexelBufferAlignmentProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkDeviceSize") long storageTexelBufferOffsetAlignmentBytes, @CType("VkBool32") int storageTexelBufferOffsetSingleTexelAlignment, @CType("VkDeviceSize") long uniformTexelBufferOffsetAlignmentBytes, @CType("VkBool32") int uniformTexelBufferOffsetSingleTexelAlignment) { return alloc(allocator).sType(sType).pNext(pNext).storageTexelBufferOffsetAlignmentBytes(storageTexelBufferOffsetAlignmentBytes).storageTexelBufferOffsetSingleTexelAlignment(storageTexelBufferOffsetSingleTexelAlignment).uniformTexelBufferOffsetAlignmentBytes(uniformTexelBufferOffsetAlignmentBytes).uniformTexelBufferOffsetSingleTexelAlignment(uniformTexelBufferOffsetSingleTexelAlignment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties copyFrom(VkPhysicalDeviceTexelBufferAlignmentProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetAlignmentBytes(segment, 0L); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    public @CType("VkDeviceSize") long storageTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetAlignmentBytes(this.segment()); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_storageTexelBufferOffsetAlignmentBytes.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetAlignmentBytes(segment, 0L, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetAlignmentBytes(@CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetAlignmentBytes(this.segment(), value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetSingleTexelAlignment(segment, 0L); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    public @CType("VkBool32") int storageTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetSingleTexelAlignment(this.segment()); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetSingleTexelAlignment(segment, 0L, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetSingleTexelAlignment(@CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetAlignmentBytes(segment, 0L); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    public @CType("VkDeviceSize") long uniformTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetAlignmentBytes(this.segment()); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_uniformTexelBufferOffsetAlignmentBytes.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetAlignmentBytes(segment, 0L, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetAlignmentBytes(@CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetAlignmentBytes(this.segment(), value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetSingleTexelAlignment(segment, 0L); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    public @CType("VkBool32") int uniformTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetSingleTexelAlignment(this.segment()); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetSingleTexelAlignment(segment, 0L, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetSingleTexelAlignment(@CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceTexelBufferAlignmentProperties].
    public static final class Buffer extends VkPhysicalDeviceTexelBufferAlignmentProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceTexelBufferAlignmentProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceTexelBufferAlignmentProperties`
        public VkPhysicalDeviceTexelBufferAlignmentProperties asSlice(long index) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceTexelBufferAlignmentProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceTexelBufferAlignmentProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long storageTexelBufferOffsetAlignmentBytesAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetAlignmentBytes(this.segment(), index); }
        /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storageTexelBufferOffsetAlignmentBytesAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }

        /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
        /// @param index the index
        public @CType("VkBool32") int storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
        /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storageTexelBufferOffsetSingleTexelAlignmentAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }

        /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long uniformTexelBufferOffsetAlignmentBytesAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetAlignmentBytes(this.segment(), index); }
        /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uniformTexelBufferOffsetAlignmentBytesAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }

        /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
        /// @param index the index
        public @CType("VkBool32") int uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
        /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }

    }
}
