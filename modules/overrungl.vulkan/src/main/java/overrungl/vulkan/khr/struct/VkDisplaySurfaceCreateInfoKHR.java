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

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### displayMode
/// [VarHandle][#VH_displayMode] - [Getter][#displayMode()] - [Setter][#displayMode(MemorySegment)]
/// ### planeIndex
/// [VarHandle][#VH_planeIndex] - [Getter][#planeIndex()] - [Setter][#planeIndex(int)]
/// ### planeStackIndex
/// [VarHandle][#VH_planeStackIndex] - [Getter][#planeStackIndex()] - [Setter][#planeStackIndex(int)]
/// ### transform
/// [VarHandle][#VH_transform] - [Getter][#transform()] - [Setter][#transform(int)]
/// ### globalAlpha
/// [VarHandle][#VH_globalAlpha] - [Getter][#globalAlpha()] - [Setter][#globalAlpha(float)]
/// ### alphaMode
/// [VarHandle][#VH_alphaMode] - [Getter][#alphaMode()] - [Setter][#alphaMode(int)]
/// ### imageExtent
/// [Byte offset][#OFFSET_imageExtent] - [Memory layout][#ML_imageExtent] - [Getter][#imageExtent()] - [Setter][#imageExtent(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplaySurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkDisplaySurfaceCreateFlagsKHR flags;
///     VkDisplayModeKHR displayMode;
///     uint32_t planeIndex;
///     uint32_t planeStackIndex;
///     VkSurfaceTransformFlagBitsKHR transform;
///     float globalAlpha;
///     VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
///     VkExtent2D imageExtent;
/// } VkDisplaySurfaceCreateInfoKHR;
/// ```
public sealed class VkDisplaySurfaceCreateInfoKHR extends Struct {
    /// The struct layout of `VkDisplaySurfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("displayMode"),
        ValueLayout.JAVA_INT.withName("planeIndex"),
        ValueLayout.JAVA_INT.withName("planeStackIndex"),
        ValueLayout.JAVA_INT.withName("transform"),
        ValueLayout.JAVA_FLOAT.withName("globalAlpha"),
        ValueLayout.JAVA_INT.withName("alphaMode"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("imageExtent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `displayMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displayMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayMode"));
    /// The [VarHandle] of `planeIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_planeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeIndex"));
    /// The [VarHandle] of `planeStackIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_planeStackIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeStackIndex"));
    /// The [VarHandle] of `transform` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));
    /// The [VarHandle] of `globalAlpha` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_globalAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalAlpha"));
    /// The [VarHandle] of `alphaMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_alphaMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaMode"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout ML_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplaySurfaceCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplaySurfaceCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplaySurfaceCreateInfoKHR(segment); }

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplaySurfaceCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplaySurfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkDisplaySurfaceCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDisplaySurfaceCreateFlagsKHR") int flags, @CType("VkDisplayModeKHR") MemorySegment displayMode, @CType("uint32_t") int planeIndex, @CType("uint32_t") int planeStackIndex, @CType("VkSurfaceTransformFlagBitsKHR") int transform, @CType("float") float globalAlpha, @CType("VkDisplayPlaneAlphaFlagBitsKHR") int alphaMode, @CType("VkExtent2D") MemorySegment imageExtent) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).displayMode(displayMode).planeIndex(planeIndex).planeStackIndex(planeStackIndex).transform(transform).globalAlpha(globalAlpha).alphaMode(alphaMode).imageExtent(imageExtent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR copyFrom(VkDisplaySurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplaySurfaceCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplaySurfaceCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR sType(@CType("VkStructureType") int value) { VkDisplaySurfaceCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDisplaySurfaceCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR pNext(@CType("const void *") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplaySurfaceCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplaySurfaceCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDisplaySurfaceCreateFlagsKHR") int flags() { return VkDisplaySurfaceCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDisplaySurfaceCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDisplaySurfaceCreateFlagsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR flags(@CType("VkDisplaySurfaceCreateFlagsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `displayMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayModeKHR") MemorySegment get_displayMode(MemorySegment segment, long index) { return (MemorySegment) VH_displayMode.get(segment, 0L, index); }
    /// {@return `displayMode`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayModeKHR") MemorySegment get_displayMode(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_displayMode(segment, 0L); }
    /// {@return `displayMode`}
    public @CType("VkDisplayModeKHR") MemorySegment displayMode() { return VkDisplaySurfaceCreateInfoKHR.get_displayMode(this.segment()); }
    /// Sets `displayMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayMode(MemorySegment segment, long index, @CType("VkDisplayModeKHR") MemorySegment value) { VH_displayMode.set(segment, 0L, index, value); }
    /// Sets `displayMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayMode(MemorySegment segment, @CType("VkDisplayModeKHR") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_displayMode(segment, 0L, value); }
    /// Sets `displayMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR displayMode(@CType("VkDisplayModeKHR") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_displayMode(this.segment(), value); return this; }

    /// {@return `planeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_planeIndex(MemorySegment segment, long index) { return (int) VH_planeIndex.get(segment, 0L, index); }
    /// {@return `planeIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_planeIndex(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_planeIndex(segment, 0L); }
    /// {@return `planeIndex`}
    public @CType("uint32_t") int planeIndex() { return VkDisplaySurfaceCreateInfoKHR.get_planeIndex(this.segment()); }
    /// Sets `planeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_planeIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_planeIndex.set(segment, 0L, index, value); }
    /// Sets `planeIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_planeIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.set_planeIndex(segment, 0L, value); }
    /// Sets `planeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR planeIndex(@CType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.set_planeIndex(this.segment(), value); return this; }

    /// {@return `planeStackIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_planeStackIndex(MemorySegment segment, long index) { return (int) VH_planeStackIndex.get(segment, 0L, index); }
    /// {@return `planeStackIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_planeStackIndex(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_planeStackIndex(segment, 0L); }
    /// {@return `planeStackIndex`}
    public @CType("uint32_t") int planeStackIndex() { return VkDisplaySurfaceCreateInfoKHR.get_planeStackIndex(this.segment()); }
    /// Sets `planeStackIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_planeStackIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_planeStackIndex.set(segment, 0L, index, value); }
    /// Sets `planeStackIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_planeStackIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.set_planeStackIndex(segment, 0L, value); }
    /// Sets `planeStackIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR planeStackIndex(@CType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.set_planeStackIndex(this.segment(), value); return this; }

    /// {@return `transform` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_transform(MemorySegment segment, long index) { return (int) VH_transform.get(segment, 0L, index); }
    /// {@return `transform`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_transform(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_transform(segment, 0L); }
    /// {@return `transform`}
    public @CType("VkSurfaceTransformFlagBitsKHR") int transform() { return VkDisplaySurfaceCreateInfoKHR.get_transform(this.segment()); }
    /// Sets `transform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transform(MemorySegment segment, long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VH_transform.set(segment, 0L, index, value); }
    /// Sets `transform` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transform(MemorySegment segment, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_transform(segment, 0L, value); }
    /// Sets `transform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR transform(@CType("VkSurfaceTransformFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_transform(this.segment(), value); return this; }

    /// {@return `globalAlpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_globalAlpha(MemorySegment segment, long index) { return (float) VH_globalAlpha.get(segment, 0L, index); }
    /// {@return `globalAlpha`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_globalAlpha(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_globalAlpha(segment, 0L); }
    /// {@return `globalAlpha`}
    public @CType("float") float globalAlpha() { return VkDisplaySurfaceCreateInfoKHR.get_globalAlpha(this.segment()); }
    /// Sets `globalAlpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_globalAlpha(MemorySegment segment, long index, @CType("float") float value) { VH_globalAlpha.set(segment, 0L, index, value); }
    /// Sets `globalAlpha` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_globalAlpha(MemorySegment segment, @CType("float") float value) { VkDisplaySurfaceCreateInfoKHR.set_globalAlpha(segment, 0L, value); }
    /// Sets `globalAlpha` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR globalAlpha(@CType("float") float value) { VkDisplaySurfaceCreateInfoKHR.set_globalAlpha(this.segment(), value); return this; }

    /// {@return `alphaMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayPlaneAlphaFlagBitsKHR") int get_alphaMode(MemorySegment segment, long index) { return (int) VH_alphaMode.get(segment, 0L, index); }
    /// {@return `alphaMode`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayPlaneAlphaFlagBitsKHR") int get_alphaMode(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_alphaMode(segment, 0L); }
    /// {@return `alphaMode`}
    public @CType("VkDisplayPlaneAlphaFlagBitsKHR") int alphaMode() { return VkDisplaySurfaceCreateInfoKHR.get_alphaMode(this.segment()); }
    /// Sets `alphaMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alphaMode(MemorySegment segment, long index, @CType("VkDisplayPlaneAlphaFlagBitsKHR") int value) { VH_alphaMode.set(segment, 0L, index, value); }
    /// Sets `alphaMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alphaMode(MemorySegment segment, @CType("VkDisplayPlaneAlphaFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_alphaMode(segment, 0L, value); }
    /// Sets `alphaMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR alphaMode(@CType("VkDisplayPlaneAlphaFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_alphaMode(this.segment(), value); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent); }
    /// {@return `imageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_imageExtent(MemorySegment segment) { return VkDisplaySurfaceCreateInfoKHR.get_imageExtent(segment, 0L); }
    /// {@return `imageExtent`}
    public @CType("VkExtent2D") MemorySegment imageExtent() { return VkDisplaySurfaceCreateInfoKHR.get_imageExtent(this.segment()); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), ML_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageExtent(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_imageExtent(segment, 0L, value); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR imageExtent(@CType("VkExtent2D") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_imageExtent(this.segment(), value); return this; }

    /// A buffer of [VkDisplaySurfaceCreateInfoKHR].
    public static final class Buffer extends VkDisplaySurfaceCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkDisplaySurfaceCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplaySurfaceCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplaySurfaceCreateInfoKHR`
        public VkDisplaySurfaceCreateInfoKHR asSlice(long index) { return new VkDisplaySurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplaySurfaceCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplaySurfaceCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplaySurfaceCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDisplaySurfaceCreateFlagsKHR") int flagsAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDisplaySurfaceCreateFlagsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `displayMode` at the given index}
        /// @param index the index
        public @CType("VkDisplayModeKHR") MemorySegment displayModeAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_displayMode(this.segment(), index); }
        /// Sets `displayMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayModeAt(long index, @CType("VkDisplayModeKHR") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_displayMode(this.segment(), index, value); return this; }

        /// {@return `planeIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int planeIndexAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_planeIndex(this.segment(), index); }
        /// Sets `planeIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer planeIndexAt(long index, @CType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.set_planeIndex(this.segment(), index, value); return this; }

        /// {@return `planeStackIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int planeStackIndexAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_planeStackIndex(this.segment(), index); }
        /// Sets `planeStackIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer planeStackIndexAt(long index, @CType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.set_planeStackIndex(this.segment(), index, value); return this; }

        /// {@return `transform` at the given index}
        /// @param index the index
        public @CType("VkSurfaceTransformFlagBitsKHR") int transformAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_transform(this.segment(), index); }
        /// Sets `transform` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformAt(long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_transform(this.segment(), index, value); return this; }

        /// {@return `globalAlpha` at the given index}
        /// @param index the index
        public @CType("float") float globalAlphaAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_globalAlpha(this.segment(), index); }
        /// Sets `globalAlpha` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer globalAlphaAt(long index, @CType("float") float value) { VkDisplaySurfaceCreateInfoKHR.set_globalAlpha(this.segment(), index, value); return this; }

        /// {@return `alphaMode` at the given index}
        /// @param index the index
        public @CType("VkDisplayPlaneAlphaFlagBitsKHR") int alphaModeAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_alphaMode(this.segment(), index); }
        /// Sets `alphaMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer alphaModeAt(long index, @CType("VkDisplayPlaneAlphaFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.set_alphaMode(this.segment(), index, value); return this; }

        /// {@return `imageExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment imageExtentAt(long index) { return VkDisplaySurfaceCreateInfoKHR.get_imageExtent(this.segment(), index); }
        /// Sets `imageExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageExtentAt(long index, @CType("VkExtent2D") MemorySegment value) { VkDisplaySurfaceCreateInfoKHR.set_imageExtent(this.segment(), index, value); return this; }

    }
}
