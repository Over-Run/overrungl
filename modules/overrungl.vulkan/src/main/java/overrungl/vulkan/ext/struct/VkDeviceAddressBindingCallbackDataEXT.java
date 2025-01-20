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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### baseAddress
/// [VarHandle][#VH_baseAddress] - [Getter][#baseAddress()] - [Setter][#baseAddress(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### bindingType
/// [VarHandle][#VH_bindingType] - [Getter][#bindingType()] - [Setter][#bindingType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceAddressBindingCallbackDataEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceAddressBindingFlagsEXT flags;
///     VkDeviceAddress baseAddress;
///     VkDeviceSize size;
///     VkDeviceAddressBindingTypeEXT bindingType;
/// } VkDeviceAddressBindingCallbackDataEXT;
/// ```
public sealed class VkDeviceAddressBindingCallbackDataEXT extends Struct {
    /// The struct layout of `VkDeviceAddressBindingCallbackDataEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("baseAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("bindingType")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `baseAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_baseAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseAddress"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `bindingType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bindingType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindingType"));

    /// Creates `VkDeviceAddressBindingCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceAddressBindingCallbackDataEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceAddressBindingCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceAddressBindingCallbackDataEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceAddressBindingCallbackDataEXT(segment); }

    /// Creates `VkDeviceAddressBindingCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceAddressBindingCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceAddressBindingCallbackDataEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceAddressBindingCallbackDataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceAddressBindingCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceAddressBindingCallbackDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceAddressBindingCallbackDataEXT`
    public static VkDeviceAddressBindingCallbackDataEXT alloc(SegmentAllocator allocator) { return new VkDeviceAddressBindingCallbackDataEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceAddressBindingCallbackDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceAddressBindingCallbackDataEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceAddressBindingCallbackDataEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceAddressBindingCallbackDataEXT`
    public static VkDeviceAddressBindingCallbackDataEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkDeviceAddressBindingFlagsEXT") int flags, @CType("VkDeviceAddress") long baseAddress, @CType("VkDeviceSize") long size, @CType("VkDeviceAddressBindingTypeEXT") int bindingType) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).baseAddress(baseAddress).size(size).bindingType(bindingType); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceAddressBindingCallbackDataEXT copyFrom(VkDeviceAddressBindingCallbackDataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceAddressBindingCallbackDataEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceAddressBindingCallbackDataEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceAddressBindingCallbackDataEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceAddressBindingCallbackDataEXT sType(@CType("VkStructureType") int value) { VkDeviceAddressBindingCallbackDataEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkDeviceAddressBindingCallbackDataEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkDeviceAddressBindingCallbackDataEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkDeviceAddressBindingCallbackDataEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceAddressBindingCallbackDataEXT pNext(@CType("void *") MemorySegment value) { VkDeviceAddressBindingCallbackDataEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddressBindingFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddressBindingFlagsEXT") int get_flags(MemorySegment segment) { return VkDeviceAddressBindingCallbackDataEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDeviceAddressBindingFlagsEXT") int flags() { return VkDeviceAddressBindingCallbackDataEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDeviceAddressBindingFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDeviceAddressBindingFlagsEXT") int value) { VkDeviceAddressBindingCallbackDataEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceAddressBindingCallbackDataEXT flags(@CType("VkDeviceAddressBindingFlagsEXT") int value) { VkDeviceAddressBindingCallbackDataEXT.set_flags(this.segment(), value); return this; }

    /// {@return `baseAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_baseAddress(MemorySegment segment, long index) { return (long) VH_baseAddress.get(segment, 0L, index); }
    /// {@return `baseAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_baseAddress(MemorySegment segment) { return VkDeviceAddressBindingCallbackDataEXT.get_baseAddress(segment, 0L); }
    /// {@return `baseAddress`}
    public @CType("VkDeviceAddress") long baseAddress() { return VkDeviceAddressBindingCallbackDataEXT.get_baseAddress(this.segment()); }
    /// Sets `baseAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_baseAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_baseAddress.set(segment, 0L, index, value); }
    /// Sets `baseAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_baseAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDeviceAddressBindingCallbackDataEXT.set_baseAddress(segment, 0L, value); }
    /// Sets `baseAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceAddressBindingCallbackDataEXT baseAddress(@CType("VkDeviceAddress") long value) { VkDeviceAddressBindingCallbackDataEXT.set_baseAddress(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkDeviceAddressBindingCallbackDataEXT.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkDeviceAddressBindingCallbackDataEXT.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDeviceAddressBindingCallbackDataEXT.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceAddressBindingCallbackDataEXT size(@CType("VkDeviceSize") long value) { VkDeviceAddressBindingCallbackDataEXT.set_size(this.segment(), value); return this; }

    /// {@return `bindingType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddressBindingTypeEXT") int get_bindingType(MemorySegment segment, long index) { return (int) VH_bindingType.get(segment, 0L, index); }
    /// {@return `bindingType`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddressBindingTypeEXT") int get_bindingType(MemorySegment segment) { return VkDeviceAddressBindingCallbackDataEXT.get_bindingType(segment, 0L); }
    /// {@return `bindingType`}
    public @CType("VkDeviceAddressBindingTypeEXT") int bindingType() { return VkDeviceAddressBindingCallbackDataEXT.get_bindingType(this.segment()); }
    /// Sets `bindingType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bindingType(MemorySegment segment, long index, @CType("VkDeviceAddressBindingTypeEXT") int value) { VH_bindingType.set(segment, 0L, index, value); }
    /// Sets `bindingType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bindingType(MemorySegment segment, @CType("VkDeviceAddressBindingTypeEXT") int value) { VkDeviceAddressBindingCallbackDataEXT.set_bindingType(segment, 0L, value); }
    /// Sets `bindingType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceAddressBindingCallbackDataEXT bindingType(@CType("VkDeviceAddressBindingTypeEXT") int value) { VkDeviceAddressBindingCallbackDataEXT.set_bindingType(this.segment(), value); return this; }

    /// A buffer of [VkDeviceAddressBindingCallbackDataEXT].
    public static final class Buffer extends VkDeviceAddressBindingCallbackDataEXT {
        private final long elementCount;

        /// Creates `VkDeviceAddressBindingCallbackDataEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceAddressBindingCallbackDataEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceAddressBindingCallbackDataEXT`
        public VkDeviceAddressBindingCallbackDataEXT asSlice(long index) { return new VkDeviceAddressBindingCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceAddressBindingCallbackDataEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceAddressBindingCallbackDataEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceAddressBindingCallbackDataEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceAddressBindingCallbackDataEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkDeviceAddressBindingCallbackDataEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkDeviceAddressBindingCallbackDataEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddressBindingFlagsEXT") int flagsAt(long index) { return VkDeviceAddressBindingCallbackDataEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDeviceAddressBindingFlagsEXT") int value) { VkDeviceAddressBindingCallbackDataEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `baseAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long baseAddressAt(long index) { return VkDeviceAddressBindingCallbackDataEXT.get_baseAddress(this.segment(), index); }
        /// Sets `baseAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer baseAddressAt(long index, @CType("VkDeviceAddress") long value) { VkDeviceAddressBindingCallbackDataEXT.set_baseAddress(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkDeviceAddressBindingCallbackDataEXT.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkDeviceAddressBindingCallbackDataEXT.set_size(this.segment(), index, value); return this; }

        /// {@return `bindingType` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddressBindingTypeEXT") int bindingTypeAt(long index) { return VkDeviceAddressBindingCallbackDataEXT.get_bindingType(this.segment(), index); }
        /// Sets `bindingType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bindingTypeAt(long index, @CType("VkDeviceAddressBindingTypeEXT") int value) { VkDeviceAddressBindingCallbackDataEXT.set_bindingType(this.segment(), index, value); return this; }

    }
}
