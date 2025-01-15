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
/// ### robustBufferAccess2
/// [VarHandle][#VH_robustBufferAccess2] - [Getter][#robustBufferAccess2()] - [Setter][#robustBufferAccess2(int)]
/// ### robustImageAccess2
/// [VarHandle][#VH_robustImageAccess2] - [Getter][#robustImageAccess2()] - [Setter][#robustImageAccess2(int)]
/// ### nullDescriptor
/// [VarHandle][#VH_nullDescriptor] - [Getter][#nullDescriptor()] - [Setter][#nullDescriptor(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRobustness2FeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 robustBufferAccess2;
///     VkBool32 robustImageAccess2;
///     VkBool32 nullDescriptor;
/// } VkPhysicalDeviceRobustness2FeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceRobustness2FeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceRobustness2FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustBufferAccess2"),
        ValueLayout.JAVA_INT.withName("robustImageAccess2"),
        ValueLayout.JAVA_INT.withName("nullDescriptor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `robustBufferAccess2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_robustBufferAccess2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccess2"));
    /// The [VarHandle] of `robustImageAccess2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_robustImageAccess2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustImageAccess2"));
    /// The [VarHandle] of `nullDescriptor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nullDescriptor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nullDescriptor"));

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRobustness2FeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2FeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2FeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2FeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRobustness2FeaturesEXT`
    public static VkPhysicalDeviceRobustness2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRobustness2FeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRobustness2FeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRobustness2FeaturesEXT`
    public static VkPhysicalDeviceRobustness2FeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int robustBufferAccess2, @CType("VkBool32") int robustImageAccess2, @CType("VkBool32") int nullDescriptor) { return alloc(allocator).sType(sType).pNext(pNext).robustBufferAccess2(robustBufferAccess2).robustImageAccess2(robustImageAccess2).nullDescriptor(nullDescriptor); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT copyFrom(VkPhysicalDeviceRobustness2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRobustness2FeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceRobustness2FeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `robustBufferAccess2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_robustBufferAccess2(MemorySegment segment, long index) { return (int) VH_robustBufferAccess2.get(segment, 0L, index); }
    /// {@return `robustBufferAccess2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_robustBufferAccess2(MemorySegment segment) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_robustBufferAccess2(segment, 0L); }
    /// {@return `robustBufferAccess2`}
    public @CType("VkBool32") int robustBufferAccess2() { return VkPhysicalDeviceRobustness2FeaturesEXT.get_robustBufferAccess2(this.segment()); }
    /// Sets `robustBufferAccess2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustBufferAccess2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_robustBufferAccess2.set(segment, 0L, index, value); }
    /// Sets `robustBufferAccess2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustBufferAccess2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_robustBufferAccess2(segment, 0L, value); }
    /// Sets `robustBufferAccess2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT robustBufferAccess2(@CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_robustBufferAccess2(this.segment(), value); return this; }

    /// {@return `robustImageAccess2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_robustImageAccess2(MemorySegment segment, long index) { return (int) VH_robustImageAccess2.get(segment, 0L, index); }
    /// {@return `robustImageAccess2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_robustImageAccess2(MemorySegment segment) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_robustImageAccess2(segment, 0L); }
    /// {@return `robustImageAccess2`}
    public @CType("VkBool32") int robustImageAccess2() { return VkPhysicalDeviceRobustness2FeaturesEXT.get_robustImageAccess2(this.segment()); }
    /// Sets `robustImageAccess2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustImageAccess2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_robustImageAccess2.set(segment, 0L, index, value); }
    /// Sets `robustImageAccess2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustImageAccess2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_robustImageAccess2(segment, 0L, value); }
    /// Sets `robustImageAccess2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT robustImageAccess2(@CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_robustImageAccess2(this.segment(), value); return this; }

    /// {@return `nullDescriptor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nullDescriptor(MemorySegment segment, long index) { return (int) VH_nullDescriptor.get(segment, 0L, index); }
    /// {@return `nullDescriptor`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nullDescriptor(MemorySegment segment) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_nullDescriptor(segment, 0L); }
    /// {@return `nullDescriptor`}
    public @CType("VkBool32") int nullDescriptor() { return VkPhysicalDeviceRobustness2FeaturesEXT.get_nullDescriptor(this.segment()); }
    /// Sets `nullDescriptor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nullDescriptor(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nullDescriptor.set(segment, 0L, index, value); }
    /// Sets `nullDescriptor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nullDescriptor(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_nullDescriptor(segment, 0L, value); }
    /// Sets `nullDescriptor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT nullDescriptor(@CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_nullDescriptor(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceRobustness2FeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceRobustness2FeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRobustness2FeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRobustness2FeaturesEXT`
        public VkPhysicalDeviceRobustness2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceRobustness2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRobustness2FeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRobustness2FeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `robustBufferAccess2` at the given index}
        /// @param index the index
        public @CType("VkBool32") int robustBufferAccess2At(long index) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_robustBufferAccess2(this.segment(), index); }
        /// Sets `robustBufferAccess2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer robustBufferAccess2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_robustBufferAccess2(this.segment(), index, value); return this; }

        /// {@return `robustImageAccess2` at the given index}
        /// @param index the index
        public @CType("VkBool32") int robustImageAccess2At(long index) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_robustImageAccess2(this.segment(), index); }
        /// Sets `robustImageAccess2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer robustImageAccess2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_robustImageAccess2(this.segment(), index, value); return this; }

        /// {@return `nullDescriptor` at the given index}
        /// @param index the index
        public @CType("VkBool32") int nullDescriptorAt(long index) { return VkPhysicalDeviceRobustness2FeaturesEXT.get_nullDescriptor(this.segment(), index); }
        /// Sets `nullDescriptor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nullDescriptorAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.set_nullDescriptor(this.segment(), index, value); return this; }

    }
}
