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
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDevicePCIBusInfoPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t pciDomain;
///     uint32_t pciBus;
///     uint32_t pciDevice;
///     uint32_t pciFunction;
/// };
/// ```
public sealed class VkPhysicalDevicePCIBusInfoPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDevicePCIBusInfoPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pciDomain"),
        ValueLayout.JAVA_INT.withName("pciBus"),
        ValueLayout.JAVA_INT.withName("pciDevice"),
        ValueLayout.JAVA_INT.withName("pciFunction")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `pciDomain`.
    public static final long OFFSET_pciDomain = LAYOUT.byteOffset(PathElement.groupElement("pciDomain"));
    /// The memory layout of `pciDomain`.
    public static final MemoryLayout LAYOUT_pciDomain = LAYOUT.select(PathElement.groupElement("pciDomain"));
    /// The [VarHandle] of `pciDomain` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pciDomain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciDomain"));
    /// The byte offset of `pciBus`.
    public static final long OFFSET_pciBus = LAYOUT.byteOffset(PathElement.groupElement("pciBus"));
    /// The memory layout of `pciBus`.
    public static final MemoryLayout LAYOUT_pciBus = LAYOUT.select(PathElement.groupElement("pciBus"));
    /// The [VarHandle] of `pciBus` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pciBus = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciBus"));
    /// The byte offset of `pciDevice`.
    public static final long OFFSET_pciDevice = LAYOUT.byteOffset(PathElement.groupElement("pciDevice"));
    /// The memory layout of `pciDevice`.
    public static final MemoryLayout LAYOUT_pciDevice = LAYOUT.select(PathElement.groupElement("pciDevice"));
    /// The [VarHandle] of `pciDevice` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pciDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciDevice"));
    /// The byte offset of `pciFunction`.
    public static final long OFFSET_pciFunction = LAYOUT.byteOffset(PathElement.groupElement("pciFunction"));
    /// The memory layout of `pciFunction`.
    public static final MemoryLayout LAYOUT_pciFunction = LAYOUT.select(PathElement.groupElement("pciFunction"));
    /// The [VarHandle] of `pciFunction` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pciFunction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pciFunction"));

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePCIBusInfoPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePCIBusInfoPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pciDomain `pciDomain`
    /// @param pciBus `pciBus`
    /// @param pciDevice `pciDevice`
    /// @param pciFunction `pciFunction`
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pciDomain, int pciBus, int pciDevice, int pciFunction) {
        return alloc(allocator).sType(sType).pNext(pNext).pciDomain(pciDomain).pciBus(pciBus).pciDevice(pciDevice).pciFunction(pciFunction);
    }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pciDomain `pciDomain`
    /// @param pciBus `pciBus`
    /// @param pciDevice `pciDevice`
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pciDomain, int pciBus, int pciDevice) {
        return alloc(allocator).sType(sType).pNext(pNext).pciDomain(pciDomain).pciBus(pciBus).pciDevice(pciDevice);
    }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pciDomain `pciDomain`
    /// @param pciBus `pciBus`
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pciDomain, int pciBus) {
        return alloc(allocator).sType(sType).pNext(pNext).pciDomain(pciDomain).pciBus(pciBus);
    }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pciDomain `pciDomain`
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pciDomain) {
        return alloc(allocator).sType(sType).pNext(pNext).pciDomain(pciDomain);
    }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDevicePCIBusInfoPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDevicePCIBusInfoPropertiesEXT`
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT copyFrom(VkPhysicalDevicePCIBusInfoPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pciDomain` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pciDomain(MemorySegment segment, long index) { return (int) VH_pciDomain.get(segment, 0L, index); }
    /// {@return `pciDomain`}
    public int pciDomain() { return pciDomain(this.segment(), 0L); }
    /// Sets `pciDomain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pciDomain(MemorySegment segment, long index, int value) { VH_pciDomain.set(segment, 0L, index, value); }
    /// Sets `pciDomain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDomain(int value) { pciDomain(this.segment(), 0L, value); return this; }

    /// {@return `pciBus` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pciBus(MemorySegment segment, long index) { return (int) VH_pciBus.get(segment, 0L, index); }
    /// {@return `pciBus`}
    public int pciBus() { return pciBus(this.segment(), 0L); }
    /// Sets `pciBus` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pciBus(MemorySegment segment, long index, int value) { VH_pciBus.set(segment, 0L, index, value); }
    /// Sets `pciBus` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciBus(int value) { pciBus(this.segment(), 0L, value); return this; }

    /// {@return `pciDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pciDevice(MemorySegment segment, long index) { return (int) VH_pciDevice.get(segment, 0L, index); }
    /// {@return `pciDevice`}
    public int pciDevice() { return pciDevice(this.segment(), 0L); }
    /// Sets `pciDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pciDevice(MemorySegment segment, long index, int value) { VH_pciDevice.set(segment, 0L, index, value); }
    /// Sets `pciDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDevice(int value) { pciDevice(this.segment(), 0L, value); return this; }

    /// {@return `pciFunction` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pciFunction(MemorySegment segment, long index) { return (int) VH_pciFunction.get(segment, 0L, index); }
    /// {@return `pciFunction`}
    public int pciFunction() { return pciFunction(this.segment(), 0L); }
    /// Sets `pciFunction` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pciFunction(MemorySegment segment, long index, int value) { VH_pciFunction.set(segment, 0L, index, value); }
    /// Sets `pciFunction` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciFunction(int value) { pciFunction(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `pciDomain` at the given index}
        /// @param index the index of the struct buffer
        public int pciDomainAt(long index) { return pciDomain(this.segment(), index); }
        /// Sets `pciDomain` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pciDomainAt(long index, int value) { pciDomain(this.segment(), index, value); return this; }

        /// {@return `pciBus` at the given index}
        /// @param index the index of the struct buffer
        public int pciBusAt(long index) { return pciBus(this.segment(), index); }
        /// Sets `pciBus` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pciBusAt(long index, int value) { pciBus(this.segment(), index, value); return this; }

        /// {@return `pciDevice` at the given index}
        /// @param index the index of the struct buffer
        public int pciDeviceAt(long index) { return pciDevice(this.segment(), index); }
        /// Sets `pciDevice` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pciDeviceAt(long index, int value) { pciDevice(this.segment(), index, value); return this; }

        /// {@return `pciFunction` at the given index}
        /// @param index the index of the struct buffer
        public int pciFunctionAt(long index) { return pciFunction(this.segment(), index); }
        /// Sets `pciFunction` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pciFunctionAt(long index, int value) { pciFunction(this.segment(), index, value); return this; }

    }
}
