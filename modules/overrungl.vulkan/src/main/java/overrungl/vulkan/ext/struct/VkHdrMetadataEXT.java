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
/// ### displayPrimaryRed
/// [Byte offset][#OFFSET_displayPrimaryRed] - [Memory layout][#ML_displayPrimaryRed] - [Getter][#displayPrimaryRed()] - [Setter][#displayPrimaryRed(java.lang.foreign.MemorySegment)]
/// ### displayPrimaryGreen
/// [Byte offset][#OFFSET_displayPrimaryGreen] - [Memory layout][#ML_displayPrimaryGreen] - [Getter][#displayPrimaryGreen()] - [Setter][#displayPrimaryGreen(java.lang.foreign.MemorySegment)]
/// ### displayPrimaryBlue
/// [Byte offset][#OFFSET_displayPrimaryBlue] - [Memory layout][#ML_displayPrimaryBlue] - [Getter][#displayPrimaryBlue()] - [Setter][#displayPrimaryBlue(java.lang.foreign.MemorySegment)]
/// ### whitePoint
/// [Byte offset][#OFFSET_whitePoint] - [Memory layout][#ML_whitePoint] - [Getter][#whitePoint()] - [Setter][#whitePoint(java.lang.foreign.MemorySegment)]
/// ### maxLuminance
/// [VarHandle][#VH_maxLuminance] - [Getter][#maxLuminance()] - [Setter][#maxLuminance(float)]
/// ### minLuminance
/// [VarHandle][#VH_minLuminance] - [Getter][#minLuminance()] - [Setter][#minLuminance(float)]
/// ### maxContentLightLevel
/// [VarHandle][#VH_maxContentLightLevel] - [Getter][#maxContentLightLevel()] - [Setter][#maxContentLightLevel(float)]
/// ### maxFrameAverageLightLevel
/// [VarHandle][#VH_maxFrameAverageLightLevel] - [Getter][#maxFrameAverageLightLevel()] - [Setter][#maxFrameAverageLightLevel(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkHdrMetadataEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkXYColorEXT displayPrimaryRed;
///     VkXYColorEXT displayPrimaryGreen;
///     VkXYColorEXT displayPrimaryBlue;
///     VkXYColorEXT whitePoint;
///     float maxLuminance;
///     float minLuminance;
///     float maxContentLightLevel;
///     float maxFrameAverageLightLevel;
/// } VkHdrMetadataEXT;
/// ```
public sealed class VkHdrMetadataEXT extends Struct {
    /// The struct layout of `VkHdrMetadataEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryRed"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryGreen"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryBlue"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("whitePoint"),
        ValueLayout.JAVA_FLOAT.withName("maxLuminance"),
        ValueLayout.JAVA_FLOAT.withName("minLuminance"),
        ValueLayout.JAVA_FLOAT.withName("maxContentLightLevel"),
        ValueLayout.JAVA_FLOAT.withName("maxFrameAverageLightLevel")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `displayPrimaryRed`.
    public static final long OFFSET_displayPrimaryRed = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryRed"));
    /// The memory layout of `displayPrimaryRed`.
    public static final MemoryLayout ML_displayPrimaryRed = LAYOUT.select(PathElement.groupElement("displayPrimaryRed"));
    /// The byte offset of `displayPrimaryGreen`.
    public static final long OFFSET_displayPrimaryGreen = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryGreen"));
    /// The memory layout of `displayPrimaryGreen`.
    public static final MemoryLayout ML_displayPrimaryGreen = LAYOUT.select(PathElement.groupElement("displayPrimaryGreen"));
    /// The byte offset of `displayPrimaryBlue`.
    public static final long OFFSET_displayPrimaryBlue = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryBlue"));
    /// The memory layout of `displayPrimaryBlue`.
    public static final MemoryLayout ML_displayPrimaryBlue = LAYOUT.select(PathElement.groupElement("displayPrimaryBlue"));
    /// The byte offset of `whitePoint`.
    public static final long OFFSET_whitePoint = LAYOUT.byteOffset(PathElement.groupElement("whitePoint"));
    /// The memory layout of `whitePoint`.
    public static final MemoryLayout ML_whitePoint = LAYOUT.select(PathElement.groupElement("whitePoint"));
    /// The [VarHandle] of `maxLuminance` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxLuminance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLuminance"));
    /// The [VarHandle] of `minLuminance` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minLuminance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minLuminance"));
    /// The [VarHandle] of `maxContentLightLevel` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxContentLightLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxContentLightLevel"));
    /// The [VarHandle] of `maxFrameAverageLightLevel` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxFrameAverageLightLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameAverageLightLevel"));

    /// Creates `VkHdrMetadataEXT` with the given segment.
    /// @param segment the memory segment
    public VkHdrMetadataEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkHdrMetadataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrMetadataEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkHdrMetadataEXT(segment); }

    /// Creates `VkHdrMetadataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkHdrMetadataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrMetadataEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkHdrMetadataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkHdrMetadataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkHdrMetadataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHdrMetadataEXT`
    public static VkHdrMetadataEXT alloc(SegmentAllocator allocator) { return new VkHdrMetadataEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkHdrMetadataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkHdrMetadataEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkHdrMetadataEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHdrMetadataEXT`
    public static VkHdrMetadataEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryRed, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryGreen, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryBlue, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment whitePoint, @CType("float") float maxLuminance, @CType("float") float minLuminance, @CType("float") float maxContentLightLevel, @CType("float") float maxFrameAverageLightLevel) { return alloc(allocator).sType(sType).pNext(pNext).displayPrimaryRed(displayPrimaryRed).displayPrimaryGreen(displayPrimaryGreen).displayPrimaryBlue(displayPrimaryBlue).whitePoint(whitePoint).maxLuminance(maxLuminance).minLuminance(minLuminance).maxContentLightLevel(maxContentLightLevel).maxFrameAverageLightLevel(maxFrameAverageLightLevel); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkHdrMetadataEXT copyFrom(VkHdrMetadataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkHdrMetadataEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkHdrMetadataEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkHdrMetadataEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT sType(@CType("VkStructureType") int value) { VkHdrMetadataEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkHdrMetadataEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkHdrMetadataEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `displayPrimaryRed` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkXYColorEXT") java.lang.foreign.MemorySegment get_displayPrimaryRed(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayPrimaryRed, index), ML_displayPrimaryRed); }
    /// {@return `displayPrimaryRed`}
    /// @param segment the segment of the struct
    public static @CType("VkXYColorEXT") java.lang.foreign.MemorySegment get_displayPrimaryRed(MemorySegment segment) { return VkHdrMetadataEXT.get_displayPrimaryRed(segment, 0L); }
    /// {@return `displayPrimaryRed`}
    public @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryRed() { return VkHdrMetadataEXT.get_displayPrimaryRed(this.segment()); }
    /// Sets `displayPrimaryRed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayPrimaryRed(MemorySegment segment, long index, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayPrimaryRed, index), ML_displayPrimaryRed.byteSize()); }
    /// Sets `displayPrimaryRed` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayPrimaryRed(MemorySegment segment, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryRed(segment, 0L, value); }
    /// Sets `displayPrimaryRed` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryRed(@CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryRed(this.segment(), value); return this; }

    /// {@return `displayPrimaryGreen` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkXYColorEXT") java.lang.foreign.MemorySegment get_displayPrimaryGreen(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayPrimaryGreen, index), ML_displayPrimaryGreen); }
    /// {@return `displayPrimaryGreen`}
    /// @param segment the segment of the struct
    public static @CType("VkXYColorEXT") java.lang.foreign.MemorySegment get_displayPrimaryGreen(MemorySegment segment) { return VkHdrMetadataEXT.get_displayPrimaryGreen(segment, 0L); }
    /// {@return `displayPrimaryGreen`}
    public @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryGreen() { return VkHdrMetadataEXT.get_displayPrimaryGreen(this.segment()); }
    /// Sets `displayPrimaryGreen` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayPrimaryGreen(MemorySegment segment, long index, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayPrimaryGreen, index), ML_displayPrimaryGreen.byteSize()); }
    /// Sets `displayPrimaryGreen` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayPrimaryGreen(MemorySegment segment, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryGreen(segment, 0L, value); }
    /// Sets `displayPrimaryGreen` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryGreen(@CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryGreen(this.segment(), value); return this; }

    /// {@return `displayPrimaryBlue` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkXYColorEXT") java.lang.foreign.MemorySegment get_displayPrimaryBlue(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayPrimaryBlue, index), ML_displayPrimaryBlue); }
    /// {@return `displayPrimaryBlue`}
    /// @param segment the segment of the struct
    public static @CType("VkXYColorEXT") java.lang.foreign.MemorySegment get_displayPrimaryBlue(MemorySegment segment) { return VkHdrMetadataEXT.get_displayPrimaryBlue(segment, 0L); }
    /// {@return `displayPrimaryBlue`}
    public @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryBlue() { return VkHdrMetadataEXT.get_displayPrimaryBlue(this.segment()); }
    /// Sets `displayPrimaryBlue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayPrimaryBlue(MemorySegment segment, long index, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayPrimaryBlue, index), ML_displayPrimaryBlue.byteSize()); }
    /// Sets `displayPrimaryBlue` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayPrimaryBlue(MemorySegment segment, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryBlue(segment, 0L, value); }
    /// Sets `displayPrimaryBlue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryBlue(@CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryBlue(this.segment(), value); return this; }

    /// {@return `whitePoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkXYColorEXT") java.lang.foreign.MemorySegment get_whitePoint(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_whitePoint, index), ML_whitePoint); }
    /// {@return `whitePoint`}
    /// @param segment the segment of the struct
    public static @CType("VkXYColorEXT") java.lang.foreign.MemorySegment get_whitePoint(MemorySegment segment) { return VkHdrMetadataEXT.get_whitePoint(segment, 0L); }
    /// {@return `whitePoint`}
    public @CType("VkXYColorEXT") java.lang.foreign.MemorySegment whitePoint() { return VkHdrMetadataEXT.get_whitePoint(this.segment()); }
    /// Sets `whitePoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_whitePoint(MemorySegment segment, long index, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_whitePoint, index), ML_whitePoint.byteSize()); }
    /// Sets `whitePoint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_whitePoint(MemorySegment segment, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_whitePoint(segment, 0L, value); }
    /// Sets `whitePoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT whitePoint(@CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_whitePoint(this.segment(), value); return this; }

    /// {@return `maxLuminance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxLuminance(MemorySegment segment, long index) { return (float) VH_maxLuminance.get(segment, 0L, index); }
    /// {@return `maxLuminance`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxLuminance(MemorySegment segment) { return VkHdrMetadataEXT.get_maxLuminance(segment, 0L); }
    /// {@return `maxLuminance`}
    public @CType("float") float maxLuminance() { return VkHdrMetadataEXT.get_maxLuminance(this.segment()); }
    /// Sets `maxLuminance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLuminance(MemorySegment segment, long index, @CType("float") float value) { VH_maxLuminance.set(segment, 0L, index, value); }
    /// Sets `maxLuminance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLuminance(MemorySegment segment, @CType("float") float value) { VkHdrMetadataEXT.set_maxLuminance(segment, 0L, value); }
    /// Sets `maxLuminance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxLuminance(@CType("float") float value) { VkHdrMetadataEXT.set_maxLuminance(this.segment(), value); return this; }

    /// {@return `minLuminance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minLuminance(MemorySegment segment, long index) { return (float) VH_minLuminance.get(segment, 0L, index); }
    /// {@return `minLuminance`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minLuminance(MemorySegment segment) { return VkHdrMetadataEXT.get_minLuminance(segment, 0L); }
    /// {@return `minLuminance`}
    public @CType("float") float minLuminance() { return VkHdrMetadataEXT.get_minLuminance(this.segment()); }
    /// Sets `minLuminance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minLuminance(MemorySegment segment, long index, @CType("float") float value) { VH_minLuminance.set(segment, 0L, index, value); }
    /// Sets `minLuminance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minLuminance(MemorySegment segment, @CType("float") float value) { VkHdrMetadataEXT.set_minLuminance(segment, 0L, value); }
    /// Sets `minLuminance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT minLuminance(@CType("float") float value) { VkHdrMetadataEXT.set_minLuminance(this.segment(), value); return this; }

    /// {@return `maxContentLightLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxContentLightLevel(MemorySegment segment, long index) { return (float) VH_maxContentLightLevel.get(segment, 0L, index); }
    /// {@return `maxContentLightLevel`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxContentLightLevel(MemorySegment segment) { return VkHdrMetadataEXT.get_maxContentLightLevel(segment, 0L); }
    /// {@return `maxContentLightLevel`}
    public @CType("float") float maxContentLightLevel() { return VkHdrMetadataEXT.get_maxContentLightLevel(this.segment()); }
    /// Sets `maxContentLightLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxContentLightLevel(MemorySegment segment, long index, @CType("float") float value) { VH_maxContentLightLevel.set(segment, 0L, index, value); }
    /// Sets `maxContentLightLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxContentLightLevel(MemorySegment segment, @CType("float") float value) { VkHdrMetadataEXT.set_maxContentLightLevel(segment, 0L, value); }
    /// Sets `maxContentLightLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxContentLightLevel(@CType("float") float value) { VkHdrMetadataEXT.set_maxContentLightLevel(this.segment(), value); return this; }

    /// {@return `maxFrameAverageLightLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxFrameAverageLightLevel(MemorySegment segment, long index) { return (float) VH_maxFrameAverageLightLevel.get(segment, 0L, index); }
    /// {@return `maxFrameAverageLightLevel`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxFrameAverageLightLevel(MemorySegment segment) { return VkHdrMetadataEXT.get_maxFrameAverageLightLevel(segment, 0L); }
    /// {@return `maxFrameAverageLightLevel`}
    public @CType("float") float maxFrameAverageLightLevel() { return VkHdrMetadataEXT.get_maxFrameAverageLightLevel(this.segment()); }
    /// Sets `maxFrameAverageLightLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFrameAverageLightLevel(MemorySegment segment, long index, @CType("float") float value) { VH_maxFrameAverageLightLevel.set(segment, 0L, index, value); }
    /// Sets `maxFrameAverageLightLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFrameAverageLightLevel(MemorySegment segment, @CType("float") float value) { VkHdrMetadataEXT.set_maxFrameAverageLightLevel(segment, 0L, value); }
    /// Sets `maxFrameAverageLightLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxFrameAverageLightLevel(@CType("float") float value) { VkHdrMetadataEXT.set_maxFrameAverageLightLevel(this.segment(), value); return this; }

    /// A buffer of [VkHdrMetadataEXT].
    public static final class Buffer extends VkHdrMetadataEXT {
        private final long elementCount;

        /// Creates `VkHdrMetadataEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkHdrMetadataEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkHdrMetadataEXT`
        public VkHdrMetadataEXT asSlice(long index) { return new VkHdrMetadataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkHdrMetadataEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkHdrMetadataEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkHdrMetadataEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkHdrMetadataEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkHdrMetadataEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `displayPrimaryRed` at the given index}
        /// @param index the index
        public @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryRedAt(long index) { return VkHdrMetadataEXT.get_displayPrimaryRed(this.segment(), index); }
        /// Sets `displayPrimaryRed` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayPrimaryRedAt(long index, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryRed(this.segment(), index, value); return this; }

        /// {@return `displayPrimaryGreen` at the given index}
        /// @param index the index
        public @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryGreenAt(long index) { return VkHdrMetadataEXT.get_displayPrimaryGreen(this.segment(), index); }
        /// Sets `displayPrimaryGreen` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayPrimaryGreenAt(long index, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryGreen(this.segment(), index, value); return this; }

        /// {@return `displayPrimaryBlue` at the given index}
        /// @param index the index
        public @CType("VkXYColorEXT") java.lang.foreign.MemorySegment displayPrimaryBlueAt(long index) { return VkHdrMetadataEXT.get_displayPrimaryBlue(this.segment(), index); }
        /// Sets `displayPrimaryBlue` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayPrimaryBlueAt(long index, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_displayPrimaryBlue(this.segment(), index, value); return this; }

        /// {@return `whitePoint` at the given index}
        /// @param index the index
        public @CType("VkXYColorEXT") java.lang.foreign.MemorySegment whitePointAt(long index) { return VkHdrMetadataEXT.get_whitePoint(this.segment(), index); }
        /// Sets `whitePoint` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer whitePointAt(long index, @CType("VkXYColorEXT") java.lang.foreign.MemorySegment value) { VkHdrMetadataEXT.set_whitePoint(this.segment(), index, value); return this; }

        /// {@return `maxLuminance` at the given index}
        /// @param index the index
        public @CType("float") float maxLuminanceAt(long index) { return VkHdrMetadataEXT.get_maxLuminance(this.segment(), index); }
        /// Sets `maxLuminance` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxLuminanceAt(long index, @CType("float") float value) { VkHdrMetadataEXT.set_maxLuminance(this.segment(), index, value); return this; }

        /// {@return `minLuminance` at the given index}
        /// @param index the index
        public @CType("float") float minLuminanceAt(long index) { return VkHdrMetadataEXT.get_minLuminance(this.segment(), index); }
        /// Sets `minLuminance` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minLuminanceAt(long index, @CType("float") float value) { VkHdrMetadataEXT.set_minLuminance(this.segment(), index, value); return this; }

        /// {@return `maxContentLightLevel` at the given index}
        /// @param index the index
        public @CType("float") float maxContentLightLevelAt(long index) { return VkHdrMetadataEXT.get_maxContentLightLevel(this.segment(), index); }
        /// Sets `maxContentLightLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxContentLightLevelAt(long index, @CType("float") float value) { VkHdrMetadataEXT.set_maxContentLightLevel(this.segment(), index, value); return this; }

        /// {@return `maxFrameAverageLightLevel` at the given index}
        /// @param index the index
        public @CType("float") float maxFrameAverageLightLevelAt(long index) { return VkHdrMetadataEXT.get_maxFrameAverageLightLevel(this.segment(), index); }
        /// Sets `maxFrameAverageLightLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFrameAverageLightLevelAt(long index, @CType("float") float value) { VkHdrMetadataEXT.set_maxFrameAverageLightLevel(this.segment(), index, value); return this; }

    }
}
