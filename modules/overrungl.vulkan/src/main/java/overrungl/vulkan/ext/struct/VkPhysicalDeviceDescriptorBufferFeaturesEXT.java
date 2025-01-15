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
/// ### descriptorBuffer
/// [VarHandle][#VH_descriptorBuffer] - [Getter][#descriptorBuffer()] - [Setter][#descriptorBuffer(int)]
/// ### descriptorBufferCaptureReplay
/// [VarHandle][#VH_descriptorBufferCaptureReplay] - [Getter][#descriptorBufferCaptureReplay()] - [Setter][#descriptorBufferCaptureReplay(int)]
/// ### descriptorBufferImageLayoutIgnored
/// [VarHandle][#VH_descriptorBufferImageLayoutIgnored] - [Getter][#descriptorBufferImageLayoutIgnored()] - [Setter][#descriptorBufferImageLayoutIgnored(int)]
/// ### descriptorBufferPushDescriptors
/// [VarHandle][#VH_descriptorBufferPushDescriptors] - [Getter][#descriptorBufferPushDescriptors()] - [Setter][#descriptorBufferPushDescriptors(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDescriptorBufferFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 descriptorBuffer;
///     VkBool32 descriptorBufferCaptureReplay;
///     VkBool32 descriptorBufferImageLayoutIgnored;
///     VkBool32 descriptorBufferPushDescriptors;
/// } VkPhysicalDeviceDescriptorBufferFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceDescriptorBufferFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorBuffer"),
        ValueLayout.JAVA_INT.withName("descriptorBufferCaptureReplay"),
        ValueLayout.JAVA_INT.withName("descriptorBufferImageLayoutIgnored"),
        ValueLayout.JAVA_INT.withName("descriptorBufferPushDescriptors")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `descriptorBuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBuffer"));
    /// The [VarHandle] of `descriptorBufferCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBufferCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferCaptureReplay"));
    /// The [VarHandle] of `descriptorBufferImageLayoutIgnored` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBufferImageLayoutIgnored = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
    /// The [VarHandle] of `descriptorBufferPushDescriptors` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBufferPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferPushDescriptors"));

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int descriptorBuffer, @CType("VkBool32") int descriptorBufferCaptureReplay, @CType("VkBool32") int descriptorBufferImageLayoutIgnored, @CType("VkBool32") int descriptorBufferPushDescriptors) { return alloc(allocator).sType(sType).pNext(pNext).descriptorBuffer(descriptorBuffer).descriptorBufferCaptureReplay(descriptorBufferCaptureReplay).descriptorBufferImageLayoutIgnored(descriptorBufferImageLayoutIgnored).descriptorBufferPushDescriptors(descriptorBufferPushDescriptors); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT copyFrom(VkPhysicalDeviceDescriptorBufferFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `descriptorBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBuffer(MemorySegment segment, long index) { return (int) VH_descriptorBuffer.get(segment, 0L, index); }
    /// {@return `descriptorBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBuffer(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBuffer(segment, 0L); }
    /// {@return `descriptorBuffer`}
    public @CType("VkBool32") int descriptorBuffer() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBuffer(this.segment()); }
    /// Sets `descriptorBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBuffer.set(segment, 0L, index, value); }
    /// Sets `descriptorBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBuffer(segment, 0L, value); }
    /// Sets `descriptorBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBuffer(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBuffer(this.segment(), value); return this; }

    /// {@return `descriptorBufferCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBufferCaptureReplay(MemorySegment segment, long index) { return (int) VH_descriptorBufferCaptureReplay.get(segment, 0L, index); }
    /// {@return `descriptorBufferCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBufferCaptureReplay(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferCaptureReplay(segment, 0L); }
    /// {@return `descriptorBufferCaptureReplay`}
    public @CType("VkBool32") int descriptorBufferCaptureReplay() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferCaptureReplay(this.segment()); }
    /// Sets `descriptorBufferCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBufferCaptureReplay(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBufferCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBufferCaptureReplay(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferCaptureReplay(segment, 0L, value); }
    /// Sets `descriptorBufferCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferCaptureReplay(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferCaptureReplay(this.segment(), value); return this; }

    /// {@return `descriptorBufferImageLayoutIgnored` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBufferImageLayoutIgnored(MemorySegment segment, long index) { return (int) VH_descriptorBufferImageLayoutIgnored.get(segment, 0L, index); }
    /// {@return `descriptorBufferImageLayoutIgnored`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBufferImageLayoutIgnored(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferImageLayoutIgnored(segment, 0L); }
    /// {@return `descriptorBufferImageLayoutIgnored`}
    public @CType("VkBool32") int descriptorBufferImageLayoutIgnored() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferImageLayoutIgnored(this.segment()); }
    /// Sets `descriptorBufferImageLayoutIgnored` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBufferImageLayoutIgnored(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBufferImageLayoutIgnored.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferImageLayoutIgnored` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBufferImageLayoutIgnored(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferImageLayoutIgnored(segment, 0L, value); }
    /// Sets `descriptorBufferImageLayoutIgnored` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferImageLayoutIgnored(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferImageLayoutIgnored(this.segment(), value); return this; }

    /// {@return `descriptorBufferPushDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBufferPushDescriptors(MemorySegment segment, long index) { return (int) VH_descriptorBufferPushDescriptors.get(segment, 0L, index); }
    /// {@return `descriptorBufferPushDescriptors`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBufferPushDescriptors(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferPushDescriptors(segment, 0L); }
    /// {@return `descriptorBufferPushDescriptors`}
    public @CType("VkBool32") int descriptorBufferPushDescriptors() { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferPushDescriptors(this.segment()); }
    /// Sets `descriptorBufferPushDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBufferPushDescriptors(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBufferPushDescriptors.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferPushDescriptors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBufferPushDescriptors(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferPushDescriptors(segment, 0L, value); }
    /// Sets `descriptorBufferPushDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferPushDescriptors(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferPushDescriptors(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceDescriptorBufferFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceDescriptorBufferFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `descriptorBuffer` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBufferAt(long index) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBuffer(this.segment(), index); }
        /// Sets `descriptorBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBuffer(this.segment(), index, value); return this; }

        /// {@return `descriptorBufferCaptureReplay` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBufferCaptureReplayAt(long index) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferCaptureReplay(this.segment(), index); }
        /// Sets `descriptorBufferCaptureReplay` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferCaptureReplayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferCaptureReplay(this.segment(), index, value); return this; }

        /// {@return `descriptorBufferImageLayoutIgnored` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBufferImageLayoutIgnoredAt(long index) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferImageLayoutIgnored(this.segment(), index); }
        /// Sets `descriptorBufferImageLayoutIgnored` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferImageLayoutIgnoredAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferImageLayoutIgnored(this.segment(), index, value); return this; }

        /// {@return `descriptorBufferPushDescriptors` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBufferPushDescriptorsAt(long index) { return VkPhysicalDeviceDescriptorBufferFeaturesEXT.get_descriptorBufferPushDescriptors(this.segment(), index); }
        /// Sets `descriptorBufferPushDescriptors` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferPushDescriptorsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferFeaturesEXT.set_descriptorBufferPushDescriptors(this.segment(), index, value); return this; }

    }
}
