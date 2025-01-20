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
/// ### deviceGeneratedCommands
/// [VarHandle][#VH_deviceGeneratedCommands] - [Getter][#deviceGeneratedCommands()] - [Setter][#deviceGeneratedCommands(int)]
/// ### dynamicGeneratedPipelineLayout
/// [VarHandle][#VH_dynamicGeneratedPipelineLayout] - [Getter][#dynamicGeneratedPipelineLayout()] - [Setter][#dynamicGeneratedPipelineLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 deviceGeneratedCommands;
///     VkBool32 dynamicGeneratedPipelineLayout;
/// } VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCommands"),
        ValueLayout.JAVA_INT.withName("dynamicGeneratedPipelineLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceGeneratedCommands` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceGeneratedCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommands"));
    /// The [VarHandle] of `dynamicGeneratedPipelineLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dynamicGeneratedPipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicGeneratedPipelineLayout"));

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int deviceGeneratedCommands, @CType("VkBool32") int dynamicGeneratedPipelineLayout) { return alloc(allocator).sType(sType).pNext(pNext).deviceGeneratedCommands(deviceGeneratedCommands).dynamicGeneratedPipelineLayout(dynamicGeneratedPipelineLayout); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceGeneratedCommands` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceGeneratedCommands(MemorySegment segment, long index) { return (int) VH_deviceGeneratedCommands.get(segment, 0L, index); }
    /// {@return `deviceGeneratedCommands`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceGeneratedCommands(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_deviceGeneratedCommands(segment, 0L); }
    /// {@return `deviceGeneratedCommands`}
    public @CType("VkBool32") int deviceGeneratedCommands() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_deviceGeneratedCommands(this.segment()); }
    /// Sets `deviceGeneratedCommands` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceGeneratedCommands(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceGeneratedCommands.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedCommands` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceGeneratedCommands(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_deviceGeneratedCommands(segment, 0L, value); }
    /// Sets `deviceGeneratedCommands` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT deviceGeneratedCommands(@CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_deviceGeneratedCommands(this.segment(), value); return this; }

    /// {@return `dynamicGeneratedPipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dynamicGeneratedPipelineLayout(MemorySegment segment, long index) { return (int) VH_dynamicGeneratedPipelineLayout.get(segment, 0L, index); }
    /// {@return `dynamicGeneratedPipelineLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dynamicGeneratedPipelineLayout(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_dynamicGeneratedPipelineLayout(segment, 0L); }
    /// {@return `dynamicGeneratedPipelineLayout`}
    public @CType("VkBool32") int dynamicGeneratedPipelineLayout() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_dynamicGeneratedPipelineLayout(this.segment()); }
    /// Sets `dynamicGeneratedPipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicGeneratedPipelineLayout(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dynamicGeneratedPipelineLayout.set(segment, 0L, index, value); }
    /// Sets `dynamicGeneratedPipelineLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicGeneratedPipelineLayout(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_dynamicGeneratedPipelineLayout(segment, 0L, value); }
    /// Sets `dynamicGeneratedPipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT dynamicGeneratedPipelineLayout(@CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_dynamicGeneratedPipelineLayout(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `deviceGeneratedCommands` at the given index}
        /// @param index the index
        public @CType("VkBool32") int deviceGeneratedCommandsAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_deviceGeneratedCommands(this.segment(), index); }
        /// Sets `deviceGeneratedCommands` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedCommandsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_deviceGeneratedCommands(this.segment(), index, value); return this; }

        /// {@return `dynamicGeneratedPipelineLayout` at the given index}
        /// @param index the index
        public @CType("VkBool32") int dynamicGeneratedPipelineLayoutAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.get_dynamicGeneratedPipelineLayout(this.segment(), index); }
        /// Sets `dynamicGeneratedPipelineLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dynamicGeneratedPipelineLayoutAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.set_dynamicGeneratedPipelineLayout(this.segment(), index, value); return this; }

    }
}
