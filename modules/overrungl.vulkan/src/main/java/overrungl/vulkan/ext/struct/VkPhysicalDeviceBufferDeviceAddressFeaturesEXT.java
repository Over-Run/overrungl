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
/// ### bufferDeviceAddress
/// [VarHandle][#VH_bufferDeviceAddress] - [Getter][#bufferDeviceAddress()] - [Setter][#bufferDeviceAddress(int)]
/// ### bufferDeviceAddressCaptureReplay
/// [VarHandle][#VH_bufferDeviceAddressCaptureReplay] - [Getter][#bufferDeviceAddressCaptureReplay()] - [Setter][#bufferDeviceAddressCaptureReplay(int)]
/// ### bufferDeviceAddressMultiDevice
/// [VarHandle][#VH_bufferDeviceAddressMultiDevice] - [Getter][#bufferDeviceAddressMultiDevice()] - [Setter][#bufferDeviceAddressMultiDevice(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceBufferDeviceAddressFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 bufferDeviceAddress;
///     VkBool32 bufferDeviceAddressCaptureReplay;
///     VkBool32 bufferDeviceAddressMultiDevice;
/// } VkPhysicalDeviceBufferDeviceAddressFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceBufferDeviceAddressFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddress"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `bufferDeviceAddress` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddress"));
    /// The [VarHandle] of `bufferDeviceAddressCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The [VarHandle] of `bufferDeviceAddressMultiDevice` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddressMultiDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int bufferDeviceAddress, @CType("VkBool32") int bufferDeviceAddressCaptureReplay, @CType("VkBool32") int bufferDeviceAddressMultiDevice) { return alloc(allocator).sType(sType).pNext(pNext).bufferDeviceAddress(bufferDeviceAddress).bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay).bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT copyFrom(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddress(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddress.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddress(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddress(segment, 0L); }
    /// {@return `bufferDeviceAddress`}
    public @CType("VkBool32") int bufferDeviceAddress() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddress(this.segment()); }
    /// Sets `bufferDeviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddress(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddress.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddress(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddress(segment, 0L, value); }
    /// Sets `bufferDeviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddress(@CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddress(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddressCaptureReplay(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressCaptureReplay.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddressCaptureReplay(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddressCaptureReplay(segment, 0L); }
    /// {@return `bufferDeviceAddressCaptureReplay`}
    public @CType("VkBool32") int bufferDeviceAddressCaptureReplay() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddressCaptureReplay(this.segment()); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddressCaptureReplay(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddressCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddressCaptureReplay(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddressCaptureReplay(segment, 0L, value); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressCaptureReplay(@CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddressCaptureReplay(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddressMultiDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddressMultiDevice(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressMultiDevice.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressMultiDevice`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddressMultiDevice(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddressMultiDevice(segment, 0L); }
    /// {@return `bufferDeviceAddressMultiDevice`}
    public @CType("VkBool32") int bufferDeviceAddressMultiDevice() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddressMultiDevice(this.segment()); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddressMultiDevice(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddressMultiDevice.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddressMultiDevice(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddressMultiDevice(segment, 0L, value); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressMultiDevice(@CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddressMultiDevice(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceBufferDeviceAddressFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceBufferDeviceAddressFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
        public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceBufferDeviceAddressFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `bufferDeviceAddress` at the given index}
        /// @param index the index
        public @CType("VkBool32") int bufferDeviceAddressAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddress(this.segment(), index); }
        /// Sets `bufferDeviceAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferDeviceAddressAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddress(this.segment(), index, value); return this; }

        /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
        /// @param index the index
        public @CType("VkBool32") int bufferDeviceAddressCaptureReplayAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddressCaptureReplay(this.segment(), index); }
        /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferDeviceAddressCaptureReplayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddressCaptureReplay(this.segment(), index, value); return this; }

        /// {@return `bufferDeviceAddressMultiDevice` at the given index}
        /// @param index the index
        public @CType("VkBool32") int bufferDeviceAddressMultiDeviceAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.get_bufferDeviceAddressMultiDevice(this.segment(), index); }
        /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferDeviceAddressMultiDeviceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.set_bufferDeviceAddressMultiDevice(this.segment(), index, value); return this; }

    }
}
