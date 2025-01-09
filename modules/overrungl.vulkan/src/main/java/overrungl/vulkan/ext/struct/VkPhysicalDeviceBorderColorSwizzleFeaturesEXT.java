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
/// ### borderColorSwizzle
/// [VarHandle][#VH_borderColorSwizzle] - [Getter][#borderColorSwizzle()] - [Setter][#borderColorSwizzle(int)]
/// ### borderColorSwizzleFromImage
/// [VarHandle][#VH_borderColorSwizzleFromImage] - [Getter][#borderColorSwizzleFromImage()] - [Setter][#borderColorSwizzleFromImage(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceBorderColorSwizzleFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 borderColorSwizzle;
///     VkBool32 borderColorSwizzleFromImage;
/// } VkPhysicalDeviceBorderColorSwizzleFeaturesEXT;
/// ```
public final class VkPhysicalDeviceBorderColorSwizzleFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzle"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzleFromImage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `borderColorSwizzle` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_borderColorSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColorSwizzle"));
    /// The [VarHandle] of `borderColorSwizzleFromImage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_borderColorSwizzleFromImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColorSwizzleFromImage"));

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `borderColorSwizzle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_borderColorSwizzle(MemorySegment segment, long index) { return (int) VH_borderColorSwizzle.get(segment, 0L, index); }
    /// {@return `borderColorSwizzle`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_borderColorSwizzle(MemorySegment segment) { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_borderColorSwizzle(segment, 0L); }
    /// {@return `borderColorSwizzle` at the given index}
    /// @param index the index
    public @CType("VkBool32") int borderColorSwizzleAt(long index) { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_borderColorSwizzle(this.segment(), index); }
    /// {@return `borderColorSwizzle`}
    public @CType("VkBool32") int borderColorSwizzle() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_borderColorSwizzle(this.segment()); }
    /// Sets `borderColorSwizzle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_borderColorSwizzle(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_borderColorSwizzle.set(segment, 0L, index, value); }
    /// Sets `borderColorSwizzle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_borderColorSwizzle(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_borderColorSwizzle(segment, 0L, value); }
    /// Sets `borderColorSwizzle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_borderColorSwizzle(this.segment(), index, value); return this; }
    /// Sets `borderColorSwizzle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzle(@CType("VkBool32") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_borderColorSwizzle(this.segment(), value); return this; }

    /// {@return `borderColorSwizzleFromImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_borderColorSwizzleFromImage(MemorySegment segment, long index) { return (int) VH_borderColorSwizzleFromImage.get(segment, 0L, index); }
    /// {@return `borderColorSwizzleFromImage`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_borderColorSwizzleFromImage(MemorySegment segment) { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_borderColorSwizzleFromImage(segment, 0L); }
    /// {@return `borderColorSwizzleFromImage` at the given index}
    /// @param index the index
    public @CType("VkBool32") int borderColorSwizzleFromImageAt(long index) { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_borderColorSwizzleFromImage(this.segment(), index); }
    /// {@return `borderColorSwizzleFromImage`}
    public @CType("VkBool32") int borderColorSwizzleFromImage() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.get_borderColorSwizzleFromImage(this.segment()); }
    /// Sets `borderColorSwizzleFromImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_borderColorSwizzleFromImage(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_borderColorSwizzleFromImage.set(segment, 0L, index, value); }
    /// Sets `borderColorSwizzleFromImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_borderColorSwizzleFromImage(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_borderColorSwizzleFromImage(segment, 0L, value); }
    /// Sets `borderColorSwizzleFromImage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImageAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_borderColorSwizzleFromImage(this.segment(), index, value); return this; }
    /// Sets `borderColorSwizzleFromImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImage(@CType("VkBool32") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.set_borderColorSwizzleFromImage(this.segment(), value); return this; }

}
