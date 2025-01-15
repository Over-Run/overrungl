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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### drmFormatModifier
/// [VarHandle][#VH_drmFormatModifier] - [Getter][#drmFormatModifier()] - [Setter][#drmFormatModifier(long)]
/// ### sharingMode
/// [VarHandle][#VH_sharingMode] - [Getter][#sharingMode()] - [Setter][#sharingMode(int)]
/// ### queueFamilyIndexCount
/// [VarHandle][#VH_queueFamilyIndexCount] - [Getter][#queueFamilyIndexCount()] - [Setter][#queueFamilyIndexCount(int)]
/// ### pQueueFamilyIndices
/// [VarHandle][#VH_pQueueFamilyIndices] - [Getter][#pQueueFamilyIndices()] - [Setter][#pQueueFamilyIndices(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceImageDrmFormatModifierInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint64_t drmFormatModifier;
///     VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t * pQueueFamilyIndices;
/// } VkPhysicalDeviceImageDrmFormatModifierInfoEXT;
/// ```
public sealed class VkPhysicalDeviceImageDrmFormatModifierInfoEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `drmFormatModifier` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    /// The [VarHandle] of `sharingMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    /// The [VarHandle] of `queueFamilyIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    /// The [VarHandle] of `pQueueFamilyIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment); }

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint64_t") long drmFormatModifier, @CType("VkSharingMode") int sharingMode, @CType("uint32_t") int queueFamilyIndexCount, @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndices) { return alloc(allocator).sType(sType).pNext(pNext).drmFormatModifier(drmFormatModifier).sharingMode(sharingMode).queueFamilyIndexCount(queueFamilyIndexCount).pQueueFamilyIndices(pQueueFamilyIndices); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT copyFrom(VkPhysicalDeviceImageDrmFormatModifierInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `drmFormatModifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_drmFormatModifier(MemorySegment segment, long index) { return (long) VH_drmFormatModifier.get(segment, 0L, index); }
    /// {@return `drmFormatModifier`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_drmFormatModifier(MemorySegment segment) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_drmFormatModifier(segment, 0L); }
    /// {@return `drmFormatModifier`}
    public @CType("uint64_t") long drmFormatModifier() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_drmFormatModifier(this.segment()); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drmFormatModifier(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_drmFormatModifier.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drmFormatModifier(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_drmFormatModifier(segment, 0L, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifier(@CType("uint64_t") long value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_drmFormatModifier(this.segment(), value); return this; }

    /// {@return `sharingMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSharingMode") int get_sharingMode(MemorySegment segment, long index) { return (int) VH_sharingMode.get(segment, 0L, index); }
    /// {@return `sharingMode`}
    /// @param segment the segment of the struct
    public static @CType("VkSharingMode") int get_sharingMode(MemorySegment segment) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_sharingMode(segment, 0L); }
    /// {@return `sharingMode`}
    public @CType("VkSharingMode") int sharingMode() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_sharingMode(this.segment()); }
    /// Sets `sharingMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sharingMode(MemorySegment segment, long index, @CType("VkSharingMode") int value) { VH_sharingMode.set(segment, 0L, index, value); }
    /// Sets `sharingMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sharingMode(MemorySegment segment, @CType("VkSharingMode") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_sharingMode(segment, 0L, value); }
    /// Sets `sharingMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingMode(@CType("VkSharingMode") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_sharingMode(this.segment(), value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueFamilyIndexCount(MemorySegment segment, long index) { return (int) VH_queueFamilyIndexCount.get(segment, 0L, index); }
    /// {@return `queueFamilyIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueFamilyIndexCount(MemorySegment segment) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_queueFamilyIndexCount(segment, 0L); }
    /// {@return `queueFamilyIndexCount`}
    public @CType("uint32_t") int queueFamilyIndexCount() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_queueFamilyIndexCount(this.segment()); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueFamilyIndexCount.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_queueFamilyIndexCount(segment, 0L, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCount(@CType("uint32_t") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_queueFamilyIndexCount(this.segment(), value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pQueueFamilyIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pQueueFamilyIndices.get(segment, 0L, index); }
    /// {@return `pQueueFamilyIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pQueueFamilyIndices(MemorySegment segment) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_pQueueFamilyIndices(segment, 0L); }
    /// {@return `pQueueFamilyIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndices() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_pQueueFamilyIndices(this.segment()); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQueueFamilyIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pQueueFamilyIndices.set(segment, 0L, index, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQueueFamilyIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_pQueueFamilyIndices(segment, 0L, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_pQueueFamilyIndices(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceImageDrmFormatModifierInfoEXT].
    public static final class Buffer extends VkPhysicalDeviceImageDrmFormatModifierInfoEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT asSlice(long index) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `drmFormatModifier` at the given index}
        /// @param index the index
        public @CType("uint64_t") long drmFormatModifierAt(long index) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_drmFormatModifier(this.segment(), index); }
        /// Sets `drmFormatModifier` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_drmFormatModifier(this.segment(), index, value); return this; }

        /// {@return `sharingMode` at the given index}
        /// @param index the index
        public @CType("VkSharingMode") int sharingModeAt(long index) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_sharingMode(this.segment(), index); }
        /// Sets `sharingMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sharingModeAt(long index, @CType("VkSharingMode") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_sharingMode(this.segment(), index, value); return this; }

        /// {@return `queueFamilyIndexCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int queueFamilyIndexCountAt(long index) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_queueFamilyIndexCount(this.segment(), index); }
        /// Sets `queueFamilyIndexCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queueFamilyIndexCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_queueFamilyIndexCount(this.segment(), index, value); return this; }

        /// {@return `pQueueFamilyIndices` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndicesAt(long index) { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.get_pQueueFamilyIndices(this.segment(), index); }
        /// Sets `pQueueFamilyIndices` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pQueueFamilyIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.set_pQueueFamilyIndices(this.segment(), index, value); return this; }

    }
}
