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
/// ### pciDomain
/// [VarHandle][#VH_pciDomain] - [Getter][#pciDomain()] - [Setter][#pciDomain(int)]
/// ### pciBus
/// [VarHandle][#VH_pciBus] - [Getter][#pciBus()] - [Setter][#pciBus(int)]
/// ### pciDevice
/// [VarHandle][#VH_pciDevice] - [Getter][#pciDevice()] - [Setter][#pciDevice(int)]
/// ### pciFunction
/// [VarHandle][#VH_pciFunction] - [Getter][#pciFunction()] - [Setter][#pciFunction(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePCIBusInfoPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t pciDomain;
///     uint32_t pciBus;
///     uint32_t pciDevice;
///     uint32_t pciFunction;
/// } VkPhysicalDevicePCIBusInfoPropertiesEXT;
/// ```
public sealed class VkPhysicalDevicePCIBusInfoPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDevicePCIBusInfoPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pciDomain"),
        ValueLayout.JAVA_INT.withName("pciBus"),
        ValueLayout.JAVA_INT.withName("pciDevice"),
        ValueLayout.JAVA_INT.withName("pciFunction")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pciDomain` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pciDomain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciDomain"));
    /// The [VarHandle] of `pciBus` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pciBus = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciBus"));
    /// The [VarHandle] of `pciDevice` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pciDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciDevice"));
    /// The [VarHandle] of `pciFunction` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pciFunction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciFunction"));

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePCIBusInfoPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment); }

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePCIBusInfoPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int pciDomain, @CType("uint32_t") int pciBus, @CType("uint32_t") int pciDevice, @CType("uint32_t") int pciFunction) { return alloc(allocator).sType(sType).pNext(pNext).pciDomain(pciDomain).pciBus(pciBus).pciDevice(pciDevice).pciFunction(pciFunction); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT copyFrom(VkPhysicalDevicePCIBusInfoPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `pciDomain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pciDomain(MemorySegment segment, long index) { return (int) VH_pciDomain.get(segment, 0L, index); }
    /// {@return `pciDomain`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pciDomain(MemorySegment segment) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciDomain(segment, 0L); }
    /// {@return `pciDomain`}
    public @CType("uint32_t") int pciDomain() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciDomain(this.segment()); }
    /// Sets `pciDomain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pciDomain(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pciDomain.set(segment, 0L, index, value); }
    /// Sets `pciDomain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pciDomain(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciDomain(segment, 0L, value); }
    /// Sets `pciDomain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDomain(@CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciDomain(this.segment(), value); return this; }

    /// {@return `pciBus` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pciBus(MemorySegment segment, long index) { return (int) VH_pciBus.get(segment, 0L, index); }
    /// {@return `pciBus`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pciBus(MemorySegment segment) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciBus(segment, 0L); }
    /// {@return `pciBus`}
    public @CType("uint32_t") int pciBus() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciBus(this.segment()); }
    /// Sets `pciBus` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pciBus(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pciBus.set(segment, 0L, index, value); }
    /// Sets `pciBus` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pciBus(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciBus(segment, 0L, value); }
    /// Sets `pciBus` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciBus(@CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciBus(this.segment(), value); return this; }

    /// {@return `pciDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pciDevice(MemorySegment segment, long index) { return (int) VH_pciDevice.get(segment, 0L, index); }
    /// {@return `pciDevice`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pciDevice(MemorySegment segment) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciDevice(segment, 0L); }
    /// {@return `pciDevice`}
    public @CType("uint32_t") int pciDevice() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciDevice(this.segment()); }
    /// Sets `pciDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pciDevice(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pciDevice.set(segment, 0L, index, value); }
    /// Sets `pciDevice` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pciDevice(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciDevice(segment, 0L, value); }
    /// Sets `pciDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDevice(@CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciDevice(this.segment(), value); return this; }

    /// {@return `pciFunction` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pciFunction(MemorySegment segment, long index) { return (int) VH_pciFunction.get(segment, 0L, index); }
    /// {@return `pciFunction`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pciFunction(MemorySegment segment) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciFunction(segment, 0L); }
    /// {@return `pciFunction`}
    public @CType("uint32_t") int pciFunction() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciFunction(this.segment()); }
    /// Sets `pciFunction` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pciFunction(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pciFunction.set(segment, 0L, index, value); }
    /// Sets `pciFunction` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pciFunction(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciFunction(segment, 0L, value); }
    /// Sets `pciFunction` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciFunction(@CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciFunction(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDevicePCIBusInfoPropertiesEXT].
    public static final class Buffer extends VkPhysicalDevicePCIBusInfoPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevicePCIBusInfoPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevicePCIBusInfoPropertiesEXT`
        public VkPhysicalDevicePCIBusInfoPropertiesEXT asSlice(long index) { return new VkPhysicalDevicePCIBusInfoPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevicePCIBusInfoPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevicePCIBusInfoPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pciDomain` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pciDomainAt(long index) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciDomain(this.segment(), index); }
        /// Sets `pciDomain` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pciDomainAt(long index, @CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciDomain(this.segment(), index, value); return this; }

        /// {@return `pciBus` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pciBusAt(long index) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciBus(this.segment(), index); }
        /// Sets `pciBus` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pciBusAt(long index, @CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciBus(this.segment(), index, value); return this; }

        /// {@return `pciDevice` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pciDeviceAt(long index) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciDevice(this.segment(), index); }
        /// Sets `pciDevice` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pciDeviceAt(long index, @CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciDevice(this.segment(), index, value); return this; }

        /// {@return `pciFunction` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pciFunctionAt(long index) { return VkPhysicalDevicePCIBusInfoPropertiesEXT.get_pciFunction(this.segment(), index); }
        /// Sets `pciFunction` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pciFunctionAt(long index, @CType("uint32_t") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.set_pciFunction(this.segment(), index, value); return this; }

    }
}
