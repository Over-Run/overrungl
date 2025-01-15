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
/// ### accelerationStructure
/// [VarHandle][#VH_accelerationStructure] - [Getter][#accelerationStructure()] - [Setter][#accelerationStructure(java.lang.foreign.MemorySegment)]
/// ### accelerationStructureNV
/// [VarHandle][#VH_accelerationStructureNV] - [Getter][#accelerationStructureNV()] - [Setter][#accelerationStructureNV(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureCaptureDescriptorDataInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccelerationStructureKHR accelerationStructure;
///     VkAccelerationStructureNV accelerationStructureNV;
/// } VkAccelerationStructureCaptureDescriptorDataInfoEXT;
/// ```
public sealed class VkAccelerationStructureCaptureDescriptorDataInfoEXT extends Struct {
    /// The struct layout of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("accelerationStructure"),
        ValueLayout.ADDRESS.withName("accelerationStructureNV")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `accelerationStructureNV` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_accelerationStructureNV = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureNV"));

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment); }

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment accelerationStructure, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment accelerationStructureNV) { return alloc(allocator).sType(sType).pNext(pNext).accelerationStructure(accelerationStructure).accelerationStructureNV(accelerationStructureNV); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT copyFrom(VkAccelerationStructureCaptureDescriptorDataInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sType(@CType("VkStructureType") int value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment get_accelerationStructure(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment get_accelerationStructure(MemorySegment segment) { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_accelerationStructure(segment, 0L); }
    /// {@return `accelerationStructure`}
    public @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment accelerationStructure() { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_accelerationStructure(this.segment()); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, long index, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_accelerationStructure(segment, 0L, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructure(@CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_accelerationStructure(this.segment(), value); return this; }

    /// {@return `accelerationStructureNV` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment get_accelerationStructureNV(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_accelerationStructureNV.get(segment, 0L, index); }
    /// {@return `accelerationStructureNV`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment get_accelerationStructureNV(MemorySegment segment) { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_accelerationStructureNV(segment, 0L); }
    /// {@return `accelerationStructureNV`}
    public @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment accelerationStructureNV() { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_accelerationStructureNV(this.segment()); }
    /// Sets `accelerationStructureNV` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureNV(MemorySegment segment, long index, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VH_accelerationStructureNV.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureNV` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureNV(MemorySegment segment, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_accelerationStructureNV(segment, 0L, value); }
    /// Sets `accelerationStructureNV` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureNV(@CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_accelerationStructureNV(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureCaptureDescriptorDataInfoEXT].
    public static final class Buffer extends VkAccelerationStructureCaptureDescriptorDataInfoEXT {
        private final long elementCount;

        /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
        public VkAccelerationStructureCaptureDescriptorDataInfoEXT asSlice(long index) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `accelerationStructure` at the given index}
        /// @param index the index
        public @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment accelerationStructureAt(long index) { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_accelerationStructure(this.segment(), index); }
        /// Sets `accelerationStructure` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureAt(long index, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_accelerationStructure(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureNV` at the given index}
        /// @param index the index
        public @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment accelerationStructureNVAt(long index) { return VkAccelerationStructureCaptureDescriptorDataInfoEXT.get_accelerationStructureNV(this.segment(), index); }
        /// Sets `accelerationStructureNV` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureNVAt(long index, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCaptureDescriptorDataInfoEXT.set_accelerationStructureNV(this.segment(), index, value); return this; }

    }
}
