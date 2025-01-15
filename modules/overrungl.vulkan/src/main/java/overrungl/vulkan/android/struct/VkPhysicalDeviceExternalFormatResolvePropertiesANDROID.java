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
/// ### nullColorAttachmentWithExternalFormatResolve
/// [VarHandle][#VH_nullColorAttachmentWithExternalFormatResolve] - [Getter][#nullColorAttachmentWithExternalFormatResolve()] - [Setter][#nullColorAttachmentWithExternalFormatResolve(int)]
/// ### externalFormatResolveChromaOffsetX
/// [VarHandle][#VH_externalFormatResolveChromaOffsetX] - [Getter][#externalFormatResolveChromaOffsetX()] - [Setter][#externalFormatResolveChromaOffsetX(int)]
/// ### externalFormatResolveChromaOffsetY
/// [VarHandle][#VH_externalFormatResolveChromaOffsetY] - [Getter][#externalFormatResolveChromaOffsetY()] - [Setter][#externalFormatResolveChromaOffsetY(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceExternalFormatResolvePropertiesANDROID {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 nullColorAttachmentWithExternalFormatResolve;
///     VkChromaLocation externalFormatResolveChromaOffsetX;
///     VkChromaLocation externalFormatResolveChromaOffsetY;
/// } VkPhysicalDeviceExternalFormatResolvePropertiesANDROID;
/// ```
public sealed class VkPhysicalDeviceExternalFormatResolvePropertiesANDROID extends Struct {
    /// The struct layout of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nullColorAttachmentWithExternalFormatResolve"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetX"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetY")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `nullColorAttachmentWithExternalFormatResolve` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nullColorAttachmentWithExternalFormatResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nullColorAttachmentWithExternalFormatResolve"));
    /// The [VarHandle] of `externalFormatResolveChromaOffsetX` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_externalFormatResolveChromaOffsetX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormatResolveChromaOffsetX"));
    /// The [VarHandle] of `externalFormatResolveChromaOffsetY` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_externalFormatResolveChromaOffsetY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormatResolveChromaOffsetY"));

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment); }

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int nullColorAttachmentWithExternalFormatResolve, @CType("VkChromaLocation") int externalFormatResolveChromaOffsetX, @CType("VkChromaLocation") int externalFormatResolveChromaOffsetY) { return alloc(allocator).sType(sType).pNext(pNext).nullColorAttachmentWithExternalFormatResolve(nullColorAttachmentWithExternalFormatResolve).externalFormatResolveChromaOffsetX(externalFormatResolveChromaOffsetX).externalFormatResolveChromaOffsetY(externalFormatResolveChromaOffsetY); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID copyFrom(VkPhysicalDeviceExternalFormatResolvePropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID sType(@CType("VkStructureType") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `nullColorAttachmentWithExternalFormatResolve` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nullColorAttachmentWithExternalFormatResolve(MemorySegment segment, long index) { return (int) VH_nullColorAttachmentWithExternalFormatResolve.get(segment, 0L, index); }
    /// {@return `nullColorAttachmentWithExternalFormatResolve`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nullColorAttachmentWithExternalFormatResolve(MemorySegment segment) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_nullColorAttachmentWithExternalFormatResolve(segment, 0L); }
    /// {@return `nullColorAttachmentWithExternalFormatResolve`}
    public @CType("VkBool32") int nullColorAttachmentWithExternalFormatResolve() { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_nullColorAttachmentWithExternalFormatResolve(this.segment()); }
    /// Sets `nullColorAttachmentWithExternalFormatResolve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nullColorAttachmentWithExternalFormatResolve(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nullColorAttachmentWithExternalFormatResolve.set(segment, 0L, index, value); }
    /// Sets `nullColorAttachmentWithExternalFormatResolve` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nullColorAttachmentWithExternalFormatResolve(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_nullColorAttachmentWithExternalFormatResolve(segment, 0L, value); }
    /// Sets `nullColorAttachmentWithExternalFormatResolve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID nullColorAttachmentWithExternalFormatResolve(@CType("VkBool32") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_nullColorAttachmentWithExternalFormatResolve(this.segment(), value); return this; }

    /// {@return `externalFormatResolveChromaOffsetX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_externalFormatResolveChromaOffsetX(MemorySegment segment, long index) { return (int) VH_externalFormatResolveChromaOffsetX.get(segment, 0L, index); }
    /// {@return `externalFormatResolveChromaOffsetX`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_externalFormatResolveChromaOffsetX(MemorySegment segment) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_externalFormatResolveChromaOffsetX(segment, 0L); }
    /// {@return `externalFormatResolveChromaOffsetX`}
    public @CType("VkChromaLocation") int externalFormatResolveChromaOffsetX() { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_externalFormatResolveChromaOffsetX(this.segment()); }
    /// Sets `externalFormatResolveChromaOffsetX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalFormatResolveChromaOffsetX(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_externalFormatResolveChromaOffsetX.set(segment, 0L, index, value); }
    /// Sets `externalFormatResolveChromaOffsetX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalFormatResolveChromaOffsetX(MemorySegment segment, @CType("VkChromaLocation") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_externalFormatResolveChromaOffsetX(segment, 0L, value); }
    /// Sets `externalFormatResolveChromaOffsetX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetX(@CType("VkChromaLocation") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_externalFormatResolveChromaOffsetX(this.segment(), value); return this; }

    /// {@return `externalFormatResolveChromaOffsetY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_externalFormatResolveChromaOffsetY(MemorySegment segment, long index) { return (int) VH_externalFormatResolveChromaOffsetY.get(segment, 0L, index); }
    /// {@return `externalFormatResolveChromaOffsetY`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_externalFormatResolveChromaOffsetY(MemorySegment segment) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_externalFormatResolveChromaOffsetY(segment, 0L); }
    /// {@return `externalFormatResolveChromaOffsetY`}
    public @CType("VkChromaLocation") int externalFormatResolveChromaOffsetY() { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_externalFormatResolveChromaOffsetY(this.segment()); }
    /// Sets `externalFormatResolveChromaOffsetY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalFormatResolveChromaOffsetY(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_externalFormatResolveChromaOffsetY.set(segment, 0L, index, value); }
    /// Sets `externalFormatResolveChromaOffsetY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalFormatResolveChromaOffsetY(MemorySegment segment, @CType("VkChromaLocation") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_externalFormatResolveChromaOffsetY(segment, 0L, value); }
    /// Sets `externalFormatResolveChromaOffsetY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetY(@CType("VkChromaLocation") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_externalFormatResolveChromaOffsetY(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceExternalFormatResolvePropertiesANDROID].
    public static final class Buffer extends VkPhysicalDeviceExternalFormatResolvePropertiesANDROID {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
        public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID asSlice(long index) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_pNext(this.segment(), index, value); return this; }

        /// {@return `nullColorAttachmentWithExternalFormatResolve` at the given index}
        /// @param index the index
        public @CType("VkBool32") int nullColorAttachmentWithExternalFormatResolveAt(long index) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_nullColorAttachmentWithExternalFormatResolve(this.segment(), index); }
        /// Sets `nullColorAttachmentWithExternalFormatResolve` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nullColorAttachmentWithExternalFormatResolveAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_nullColorAttachmentWithExternalFormatResolve(this.segment(), index, value); return this; }

        /// {@return `externalFormatResolveChromaOffsetX` at the given index}
        /// @param index the index
        public @CType("VkChromaLocation") int externalFormatResolveChromaOffsetXAt(long index) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_externalFormatResolveChromaOffsetX(this.segment(), index); }
        /// Sets `externalFormatResolveChromaOffsetX` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer externalFormatResolveChromaOffsetXAt(long index, @CType("VkChromaLocation") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_externalFormatResolveChromaOffsetX(this.segment(), index, value); return this; }

        /// {@return `externalFormatResolveChromaOffsetY` at the given index}
        /// @param index the index
        public @CType("VkChromaLocation") int externalFormatResolveChromaOffsetYAt(long index) { return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.get_externalFormatResolveChromaOffsetY(this.segment(), index); }
        /// Sets `externalFormatResolveChromaOffsetY` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer externalFormatResolveChromaOffsetYAt(long index, @CType("VkChromaLocation") int value) { VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.set_externalFormatResolveChromaOffsetY(this.segment(), index, value); return this; }

    }
}
