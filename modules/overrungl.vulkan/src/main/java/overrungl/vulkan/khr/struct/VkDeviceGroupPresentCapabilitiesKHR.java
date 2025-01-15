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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK11.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### presentMask
/// [Byte offset][#OFFSET_presentMask] - [Memory layout][#ML_presentMask] - [Getter][#presentMask()] - [Setter][#presentMask(java.lang.foreign.MemorySegment)]
/// ### modes
/// [VarHandle][#VH_modes] - [Getter][#modes()] - [Setter][#modes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceGroupPresentCapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t[VK_MAX_DEVICE_GROUP_SIZE] presentMask;
///     VkDeviceGroupPresentModeFlagsKHR modes;
/// } VkDeviceGroupPresentCapabilitiesKHR;
/// ```
public sealed class VkDeviceGroupPresentCapabilitiesKHR extends Struct {
    /// The struct layout of `VkDeviceGroupPresentCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DEVICE_GROUP_SIZE, ValueLayout.JAVA_INT).withName("presentMask"),
        ValueLayout.JAVA_INT.withName("modes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `presentMask`.
    public static final long OFFSET_presentMask = LAYOUT.byteOffset(PathElement.groupElement("presentMask"));
    /// The memory layout of `presentMask`.
    public static final MemoryLayout ML_presentMask = LAYOUT.select(PathElement.groupElement("presentMask"));
    /// The [VarHandle] of `modes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_modes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("modes"));

    /// Creates `VkDeviceGroupPresentCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupPresentCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupPresentCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupPresentCapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupPresentCapabilitiesKHR(segment); }

    /// Creates `VkDeviceGroupPresentCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupPresentCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupPresentCapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupPresentCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceGroupPresentCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceGroupPresentCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupPresentCapabilitiesKHR`
    public static VkDeviceGroupPresentCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupPresentCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupPresentCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupPresentCapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceGroupPresentCapabilitiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupPresentCapabilitiesKHR`
    public static VkDeviceGroupPresentCapabilitiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment presentMask, @CType("VkDeviceGroupPresentModeFlagsKHR") int modes) { return alloc(allocator).sType(sType).pNext(pNext).presentMask(presentMask).modes(modes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupPresentCapabilitiesKHR copyFrom(VkDeviceGroupPresentCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceGroupPresentCapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceGroupPresentCapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceGroupPresentCapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentCapabilitiesKHR sType(@CType("VkStructureType") int value) { VkDeviceGroupPresentCapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceGroupPresentCapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceGroupPresentCapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentCapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentCapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentCapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `presentMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment get_presentMask(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_presentMask, index), ML_presentMask); }
    /// {@return `presentMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment get_presentMask(MemorySegment segment) { return VkDeviceGroupPresentCapabilitiesKHR.get_presentMask(segment, 0L); }
    /// {@return `presentMask`}
    public @CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment presentMask() { return VkDeviceGroupPresentCapabilitiesKHR.get_presentMask(this.segment()); }
    /// Sets `presentMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentMask(MemorySegment segment, long index, @CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_presentMask, index), ML_presentMask.byteSize()); }
    /// Sets `presentMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentMask(MemorySegment segment, @CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentCapabilitiesKHR.set_presentMask(segment, 0L, value); }
    /// Sets `presentMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentCapabilitiesKHR presentMask(@CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentCapabilitiesKHR.set_presentMask(this.segment(), value); return this; }

    /// {@return `modes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceGroupPresentModeFlagsKHR") int get_modes(MemorySegment segment, long index) { return (int) VH_modes.get(segment, 0L, index); }
    /// {@return `modes`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceGroupPresentModeFlagsKHR") int get_modes(MemorySegment segment) { return VkDeviceGroupPresentCapabilitiesKHR.get_modes(segment, 0L); }
    /// {@return `modes`}
    public @CType("VkDeviceGroupPresentModeFlagsKHR") int modes() { return VkDeviceGroupPresentCapabilitiesKHR.get_modes(this.segment()); }
    /// Sets `modes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_modes(MemorySegment segment, long index, @CType("VkDeviceGroupPresentModeFlagsKHR") int value) { VH_modes.set(segment, 0L, index, value); }
    /// Sets `modes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_modes(MemorySegment segment, @CType("VkDeviceGroupPresentModeFlagsKHR") int value) { VkDeviceGroupPresentCapabilitiesKHR.set_modes(segment, 0L, value); }
    /// Sets `modes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentCapabilitiesKHR modes(@CType("VkDeviceGroupPresentModeFlagsKHR") int value) { VkDeviceGroupPresentCapabilitiesKHR.set_modes(this.segment(), value); return this; }

    /// A buffer of [VkDeviceGroupPresentCapabilitiesKHR].
    public static final class Buffer extends VkDeviceGroupPresentCapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkDeviceGroupPresentCapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceGroupPresentCapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceGroupPresentCapabilitiesKHR`
        public VkDeviceGroupPresentCapabilitiesKHR asSlice(long index) { return new VkDeviceGroupPresentCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceGroupPresentCapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceGroupPresentCapabilitiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceGroupPresentCapabilitiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceGroupPresentCapabilitiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceGroupPresentCapabilitiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentCapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `presentMask` at the given index}
        /// @param index the index
        public @CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment presentMaskAt(long index) { return VkDeviceGroupPresentCapabilitiesKHR.get_presentMask(this.segment(), index); }
        /// Sets `presentMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentMaskAt(long index, @CType("uint32_t[VK_MAX_DEVICE_GROUP_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentCapabilitiesKHR.set_presentMask(this.segment(), index, value); return this; }

        /// {@return `modes` at the given index}
        /// @param index the index
        public @CType("VkDeviceGroupPresentModeFlagsKHR") int modesAt(long index) { return VkDeviceGroupPresentCapabilitiesKHR.get_modes(this.segment(), index); }
        /// Sets `modes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer modesAt(long index, @CType("VkDeviceGroupPresentModeFlagsKHR") int value) { VkDeviceGroupPresentCapabilitiesKHR.set_modes(this.segment(), index, value); return this; }

    }
}
