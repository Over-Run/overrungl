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
package overrungl.vulkan.struct;

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
/// ### inlineUniformBlock
/// [VarHandle][#VH_inlineUniformBlock] - [Getter][#inlineUniformBlock()] - [Setter][#inlineUniformBlock(int)]
/// ### descriptorBindingInlineUniformBlockUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingInlineUniformBlockUpdateAfterBind] - [Getter][#descriptorBindingInlineUniformBlockUpdateAfterBind()] - [Setter][#descriptorBindingInlineUniformBlockUpdateAfterBind(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceInlineUniformBlockFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 inlineUniformBlock;
///     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
/// } VkPhysicalDeviceInlineUniformBlockFeatures;
/// ```
public final class VkPhysicalDeviceInlineUniformBlockFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceInlineUniformBlockFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inlineUniformBlock"),
        ValueLayout.JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `inlineUniformBlock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inlineUniformBlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inlineUniformBlock"));
    /// The [VarHandle] of `descriptorBindingInlineUniformBlockUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));

    /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceInlineUniformBlockFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockFeatures(segment); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockFeatures ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockFeatures`
    public static VkPhysicalDeviceInlineUniformBlockFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceInlineUniformBlockFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockFeatures`
    public static VkPhysicalDeviceInlineUniformBlockFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceInlineUniformBlockFeatures(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceInlineUniformBlockFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceInlineUniformBlockFeatures`
    public VkPhysicalDeviceInlineUniformBlockFeatures asSlice(long index) { return new VkPhysicalDeviceInlineUniformBlockFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceInlineUniformBlockFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceInlineUniformBlockFeatures`
    public VkPhysicalDeviceInlineUniformBlockFeatures asSlice(long index, long count) { return new VkPhysicalDeviceInlineUniformBlockFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockFeatures.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceInlineUniformBlockFeatures.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceInlineUniformBlockFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceInlineUniformBlockFeatures.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceInlineUniformBlockFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `inlineUniformBlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_inlineUniformBlock(MemorySegment segment, long index) { return (int) VH_inlineUniformBlock.get(segment, 0L, index); }
    /// {@return `inlineUniformBlock`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_inlineUniformBlock(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockFeatures.get_inlineUniformBlock(segment, 0L); }
    /// {@return `inlineUniformBlock` at the given index}
    /// @param index the index
    public @CType("VkBool32") int inlineUniformBlockAt(long index) { return VkPhysicalDeviceInlineUniformBlockFeatures.get_inlineUniformBlock(this.segment(), index); }
    /// {@return `inlineUniformBlock`}
    public @CType("VkBool32") int inlineUniformBlock() { return VkPhysicalDeviceInlineUniformBlockFeatures.get_inlineUniformBlock(this.segment()); }
    /// Sets `inlineUniformBlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inlineUniformBlock(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_inlineUniformBlock.set(segment, 0L, index, value); }
    /// Sets `inlineUniformBlock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inlineUniformBlock(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_inlineUniformBlock(segment, 0L, value); }
    /// Sets `inlineUniformBlock` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures inlineUniformBlockAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_inlineUniformBlock(this.segment(), index, value); return this; }
    /// Sets `inlineUniformBlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures inlineUniformBlock(@CType("VkBool32") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_inlineUniformBlock(this.segment(), value); return this; }

    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingInlineUniformBlockUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceInlineUniformBlockFeatures.get_descriptorBindingInlineUniformBlockUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind` at the given index}
    /// @param index the index
    public @CType("VkBool32") int descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index) { return VkPhysicalDeviceInlineUniformBlockFeatures.get_descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), index); }
    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingInlineUniformBlockUpdateAfterBind() { return VkPhysicalDeviceInlineUniformBlockFeatures.get_descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingInlineUniformBlockUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_descriptorBindingInlineUniformBlockUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), index, value); return this; }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockFeatures descriptorBindingInlineUniformBlockUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.set_descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), value); return this; }

}
