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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 deviceGeneratedCommands;
///     (uint32_t) VkBool32 dynamicGeneratedPipelineLayout;
/// };
/// ```
public final class VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCommands"),
        ValueLayout.JAVA_INT.withName("dynamicGeneratedPipelineLayout")
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
    /// The byte offset of `deviceGeneratedCommands`.
    public static final long OFFSET_deviceGeneratedCommands = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommands"));
    /// The memory layout of `deviceGeneratedCommands`.
    public static final MemoryLayout LAYOUT_deviceGeneratedCommands = LAYOUT.select(PathElement.groupElement("deviceGeneratedCommands"));
    /// The [VarHandle] of `deviceGeneratedCommands` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceGeneratedCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommands"));
    /// The byte offset of `dynamicGeneratedPipelineLayout`.
    public static final long OFFSET_dynamicGeneratedPipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("dynamicGeneratedPipelineLayout"));
    /// The memory layout of `dynamicGeneratedPipelineLayout`.
    public static final MemoryLayout LAYOUT_dynamicGeneratedPipelineLayout = LAYOUT.select(PathElement.groupElement("dynamicGeneratedPipelineLayout"));
    /// The [VarHandle] of `dynamicGeneratedPipelineLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dynamicGeneratedPipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicGeneratedPipelineLayout"));

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceGeneratedCommands` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceGeneratedCommands(MemorySegment segment, long index) { return (int) VH_deviceGeneratedCommands.get(segment, 0L, index); }
    /// {@return `deviceGeneratedCommands`}
    public int deviceGeneratedCommands() { return deviceGeneratedCommands(this.segment(), 0L); }
    /// Sets `deviceGeneratedCommands` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceGeneratedCommands(MemorySegment segment, long index, int value) { VH_deviceGeneratedCommands.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedCommands` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT deviceGeneratedCommands(int value) { deviceGeneratedCommands(this.segment(), 0L, value); return this; }

    /// {@return `dynamicGeneratedPipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicGeneratedPipelineLayout(MemorySegment segment, long index) { return (int) VH_dynamicGeneratedPipelineLayout.get(segment, 0L, index); }
    /// {@return `dynamicGeneratedPipelineLayout`}
    public int dynamicGeneratedPipelineLayout() { return dynamicGeneratedPipelineLayout(this.segment(), 0L); }
    /// Sets `dynamicGeneratedPipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicGeneratedPipelineLayout(MemorySegment segment, long index, int value) { VH_dynamicGeneratedPipelineLayout.set(segment, 0L, index, value); }
    /// Sets `dynamicGeneratedPipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT dynamicGeneratedPipelineLayout(int value) { dynamicGeneratedPipelineLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT at(long index, Consumer<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `deviceGeneratedCommands` at the given index}
    /// @param index the index of the struct buffer
    public int deviceGeneratedCommandsAt(long index) { return deviceGeneratedCommands(this.segment(), index); }
    /// Sets `deviceGeneratedCommands` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT deviceGeneratedCommandsAt(long index, int value) { deviceGeneratedCommands(this.segment(), index, value); return this; }

    /// {@return `dynamicGeneratedPipelineLayout` at the given index}
    /// @param index the index of the struct buffer
    public int dynamicGeneratedPipelineLayoutAt(long index) { return dynamicGeneratedPipelineLayout(this.segment(), index); }
    /// Sets `dynamicGeneratedPipelineLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT dynamicGeneratedPipelineLayoutAt(long index, int value) { dynamicGeneratedPipelineLayout(this.segment(), index, value); return this; }

}
