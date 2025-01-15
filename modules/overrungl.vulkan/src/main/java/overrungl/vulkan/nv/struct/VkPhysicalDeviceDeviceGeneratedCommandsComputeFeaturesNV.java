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
package overrungl.vulkan.nv.struct;

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
/// ### deviceGeneratedCompute
/// [VarHandle][#VH_deviceGeneratedCompute] - [Getter][#deviceGeneratedCompute()] - [Setter][#deviceGeneratedCompute(int)]
/// ### deviceGeneratedComputePipelines
/// [VarHandle][#VH_deviceGeneratedComputePipelines] - [Getter][#deviceGeneratedComputePipelines()] - [Setter][#deviceGeneratedComputePipelines(int)]
/// ### deviceGeneratedComputeCaptureReplay
/// [VarHandle][#VH_deviceGeneratedComputeCaptureReplay] - [Getter][#deviceGeneratedComputeCaptureReplay()] - [Setter][#deviceGeneratedComputeCaptureReplay(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 deviceGeneratedCompute;
///     VkBool32 deviceGeneratedComputePipelines;
///     VkBool32 deviceGeneratedComputeCaptureReplay;
/// } VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV;
/// ```
public sealed class VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCompute"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputePipelines"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputeCaptureReplay")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceGeneratedCompute` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceGeneratedCompute = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCompute"));
    /// The [VarHandle] of `deviceGeneratedComputePipelines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceGeneratedComputePipelines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedComputePipelines"));
    /// The [VarHandle] of `deviceGeneratedComputeCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceGeneratedComputeCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int deviceGeneratedCompute, @CType("VkBool32") int deviceGeneratedComputePipelines, @CType("VkBool32") int deviceGeneratedComputeCaptureReplay) { return alloc(allocator).sType(sType).pNext(pNext).deviceGeneratedCompute(deviceGeneratedCompute).deviceGeneratedComputePipelines(deviceGeneratedComputePipelines).deviceGeneratedComputeCaptureReplay(deviceGeneratedComputeCaptureReplay); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceGeneratedCompute` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceGeneratedCompute(MemorySegment segment, long index) { return (int) VH_deviceGeneratedCompute.get(segment, 0L, index); }
    /// {@return `deviceGeneratedCompute`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceGeneratedCompute(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedCompute(segment, 0L); }
    /// {@return `deviceGeneratedCompute`}
    public @CType("VkBool32") int deviceGeneratedCompute() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedCompute(this.segment()); }
    /// Sets `deviceGeneratedCompute` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceGeneratedCompute(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceGeneratedCompute.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedCompute` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceGeneratedCompute(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedCompute(segment, 0L, value); }
    /// Sets `deviceGeneratedCompute` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedCompute(@CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedCompute(this.segment(), value); return this; }

    /// {@return `deviceGeneratedComputePipelines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceGeneratedComputePipelines(MemorySegment segment, long index) { return (int) VH_deviceGeneratedComputePipelines.get(segment, 0L, index); }
    /// {@return `deviceGeneratedComputePipelines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceGeneratedComputePipelines(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedComputePipelines(segment, 0L); }
    /// {@return `deviceGeneratedComputePipelines`}
    public @CType("VkBool32") int deviceGeneratedComputePipelines() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedComputePipelines(this.segment()); }
    /// Sets `deviceGeneratedComputePipelines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceGeneratedComputePipelines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceGeneratedComputePipelines.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedComputePipelines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceGeneratedComputePipelines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedComputePipelines(segment, 0L, value); }
    /// Sets `deviceGeneratedComputePipelines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputePipelines(@CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedComputePipelines(this.segment(), value); return this; }

    /// {@return `deviceGeneratedComputeCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceGeneratedComputeCaptureReplay(MemorySegment segment, long index) { return (int) VH_deviceGeneratedComputeCaptureReplay.get(segment, 0L, index); }
    /// {@return `deviceGeneratedComputeCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceGeneratedComputeCaptureReplay(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedComputeCaptureReplay(segment, 0L); }
    /// {@return `deviceGeneratedComputeCaptureReplay`}
    public @CType("VkBool32") int deviceGeneratedComputeCaptureReplay() { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedComputeCaptureReplay(this.segment()); }
    /// Sets `deviceGeneratedComputeCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceGeneratedComputeCaptureReplay(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceGeneratedComputeCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedComputeCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceGeneratedComputeCaptureReplay(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedComputeCaptureReplay(segment, 0L, value); }
    /// Sets `deviceGeneratedComputeCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputeCaptureReplay(@CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedComputeCaptureReplay(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `deviceGeneratedCompute` at the given index}
        /// @param index the index
        public @CType("VkBool32") int deviceGeneratedComputeAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedCompute(this.segment(), index); }
        /// Sets `deviceGeneratedCompute` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedComputeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedCompute(this.segment(), index, value); return this; }

        /// {@return `deviceGeneratedComputePipelines` at the given index}
        /// @param index the index
        public @CType("VkBool32") int deviceGeneratedComputePipelinesAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedComputePipelines(this.segment(), index); }
        /// Sets `deviceGeneratedComputePipelines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedComputePipelinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedComputePipelines(this.segment(), index, value); return this; }

        /// {@return `deviceGeneratedComputeCaptureReplay` at the given index}
        /// @param index the index
        public @CType("VkBool32") int deviceGeneratedComputeCaptureReplayAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.get_deviceGeneratedComputeCaptureReplay(this.segment(), index); }
        /// Sets `deviceGeneratedComputeCaptureReplay` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedComputeCaptureReplayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.set_deviceGeneratedComputeCaptureReplay(this.segment(), index, value); return this; }

    }
}
