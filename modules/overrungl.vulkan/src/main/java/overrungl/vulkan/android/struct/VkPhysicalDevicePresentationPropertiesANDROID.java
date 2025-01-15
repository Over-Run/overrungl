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
package overrungl.vulkan.android.struct;

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
/// ### sharedImage
/// [VarHandle][#VH_sharedImage] - [Getter][#sharedImage()] - [Setter][#sharedImage(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePresentationPropertiesANDROID {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 sharedImage;
/// } VkPhysicalDevicePresentationPropertiesANDROID;
/// ```
public sealed class VkPhysicalDevicePresentationPropertiesANDROID extends Struct {
    /// The struct layout of `VkPhysicalDevicePresentationPropertiesANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sharedImage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sharedImage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sharedImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharedImage"));

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePresentationPropertiesANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePresentationPropertiesANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePresentationPropertiesANDROID(segment); }

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePresentationPropertiesANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePresentationPropertiesANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePresentationPropertiesANDROID`
    public static VkPhysicalDevicePresentationPropertiesANDROID alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentationPropertiesANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePresentationPropertiesANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePresentationPropertiesANDROID`
    public static VkPhysicalDevicePresentationPropertiesANDROID allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int sharedImage) { return alloc(allocator).sType(sType).pNext(pNext).sharedImage(sharedImage); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID copyFrom(VkPhysicalDevicePresentationPropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePresentationPropertiesANDROID.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePresentationPropertiesANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePresentationPropertiesANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID sType(@CType("VkStructureType") int value) { VkPhysicalDevicePresentationPropertiesANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePresentationPropertiesANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePresentationPropertiesANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePresentationPropertiesANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePresentationPropertiesANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `sharedImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sharedImage(MemorySegment segment, long index) { return (int) VH_sharedImage.get(segment, 0L, index); }
    /// {@return `sharedImage`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sharedImage(MemorySegment segment) { return VkPhysicalDevicePresentationPropertiesANDROID.get_sharedImage(segment, 0L); }
    /// {@return `sharedImage`}
    public @CType("VkBool32") int sharedImage() { return VkPhysicalDevicePresentationPropertiesANDROID.get_sharedImage(this.segment()); }
    /// Sets `sharedImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sharedImage(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sharedImage.set(segment, 0L, index, value); }
    /// Sets `sharedImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sharedImage(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePresentationPropertiesANDROID.set_sharedImage(segment, 0L, value); }
    /// Sets `sharedImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID sharedImage(@CType("VkBool32") int value) { VkPhysicalDevicePresentationPropertiesANDROID.set_sharedImage(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDevicePresentationPropertiesANDROID].
    public static final class Buffer extends VkPhysicalDevicePresentationPropertiesANDROID {
        private final long elementCount;

        /// Creates `VkPhysicalDevicePresentationPropertiesANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevicePresentationPropertiesANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevicePresentationPropertiesANDROID`
        public VkPhysicalDevicePresentationPropertiesANDROID asSlice(long index) { return new VkPhysicalDevicePresentationPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevicePresentationPropertiesANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevicePresentationPropertiesANDROID`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePresentationPropertiesANDROID.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePresentationPropertiesANDROID.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePresentationPropertiesANDROID.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePresentationPropertiesANDROID.set_pNext(this.segment(), index, value); return this; }

        /// {@return `sharedImage` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sharedImageAt(long index) { return VkPhysicalDevicePresentationPropertiesANDROID.get_sharedImage(this.segment(), index); }
        /// Sets `sharedImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sharedImageAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePresentationPropertiesANDROID.set_sharedImage(this.segment(), index, value); return this; }

    }
}
