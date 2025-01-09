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
package overrungl.vulkan.valve.struct;

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
/// ### descriptorSetLayout
/// [VarHandle][#VH_descriptorSetLayout] - [Getter][#descriptorSetLayout()] - [Setter][#descriptorSetLayout(java.lang.foreign.MemorySegment)]
/// ### binding
/// [VarHandle][#VH_binding] - [Getter][#binding()] - [Setter][#binding(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorSetBindingReferenceVALVE {
///     VkStructureType sType;
///     const void * pNext;
///     VkDescriptorSetLayout descriptorSetLayout;
///     uint32_t binding;
/// } VkDescriptorSetBindingReferenceVALVE;
/// ```
public final class VkDescriptorSetBindingReferenceVALVE extends Struct {
    /// The struct layout of `VkDescriptorSetBindingReferenceVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("binding")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `descriptorSetLayout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_descriptorSetLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayout"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));

    /// Creates `VkDescriptorSetBindingReferenceVALVE` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetBindingReferenceVALVE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetBindingReferenceVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetBindingReferenceVALVE of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetBindingReferenceVALVE(segment); }

    /// Creates `VkDescriptorSetBindingReferenceVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetBindingReferenceVALVE ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetBindingReferenceVALVE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetBindingReferenceVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetBindingReferenceVALVE ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetBindingReferenceVALVE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDescriptorSetBindingReferenceVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetBindingReferenceVALVE`
    public static VkDescriptorSetBindingReferenceVALVE alloc(SegmentAllocator allocator) { return new VkDescriptorSetBindingReferenceVALVE(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetBindingReferenceVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetBindingReferenceVALVE`
    public static VkDescriptorSetBindingReferenceVALVE alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetBindingReferenceVALVE(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorSetBindingReferenceVALVE.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorSetBindingReferenceVALVE.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorSetBindingReferenceVALVE.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorSetBindingReferenceVALVE.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorSetBindingReferenceVALVE.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE sType(@CType("VkStructureType") int value) { VkDescriptorSetBindingReferenceVALVE.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorSetBindingReferenceVALVE.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorSetBindingReferenceVALVE.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorSetBindingReferenceVALVE.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetBindingReferenceVALVE.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetBindingReferenceVALVE.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetBindingReferenceVALVE.set_pNext(this.segment(), value); return this; }

    /// {@return `descriptorSetLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorSetLayout") java.lang.foreign.MemorySegment get_descriptorSetLayout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_descriptorSetLayout.get(segment, 0L, index); }
    /// {@return `descriptorSetLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorSetLayout") java.lang.foreign.MemorySegment get_descriptorSetLayout(MemorySegment segment) { return VkDescriptorSetBindingReferenceVALVE.get_descriptorSetLayout(segment, 0L); }
    /// {@return `descriptorSetLayout` at the given index}
    /// @param index the index
    public @CType("VkDescriptorSetLayout") java.lang.foreign.MemorySegment descriptorSetLayoutAt(long index) { return VkDescriptorSetBindingReferenceVALVE.get_descriptorSetLayout(this.segment(), index); }
    /// {@return `descriptorSetLayout`}
    public @CType("VkDescriptorSetLayout") java.lang.foreign.MemorySegment descriptorSetLayout() { return VkDescriptorSetBindingReferenceVALVE.get_descriptorSetLayout(this.segment()); }
    /// Sets `descriptorSetLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetLayout(MemorySegment segment, long index, @CType("VkDescriptorSetLayout") java.lang.foreign.MemorySegment value) { VH_descriptorSetLayout.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetLayout(MemorySegment segment, @CType("VkDescriptorSetLayout") java.lang.foreign.MemorySegment value) { VkDescriptorSetBindingReferenceVALVE.set_descriptorSetLayout(segment, 0L, value); }
    /// Sets `descriptorSetLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE descriptorSetLayoutAt(long index, @CType("VkDescriptorSetLayout") java.lang.foreign.MemorySegment value) { VkDescriptorSetBindingReferenceVALVE.set_descriptorSetLayout(this.segment(), index, value); return this; }
    /// Sets `descriptorSetLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE descriptorSetLayout(@CType("VkDescriptorSetLayout") java.lang.foreign.MemorySegment value) { VkDescriptorSetBindingReferenceVALVE.set_descriptorSetLayout(this.segment(), value); return this; }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_binding(MemorySegment segment) { return VkDescriptorSetBindingReferenceVALVE.get_binding(segment, 0L); }
    /// {@return `binding` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bindingAt(long index) { return VkDescriptorSetBindingReferenceVALVE.get_binding(this.segment(), index); }
    /// {@return `binding`}
    public @CType("uint32_t") int binding() { return VkDescriptorSetBindingReferenceVALVE.get_binding(this.segment()); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_binding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_binding(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetBindingReferenceVALVE.set_binding(segment, 0L, value); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE bindingAt(long index, @CType("uint32_t") int value) { VkDescriptorSetBindingReferenceVALVE.set_binding(this.segment(), index, value); return this; }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetBindingReferenceVALVE binding(@CType("uint32_t") int value) { VkDescriptorSetBindingReferenceVALVE.set_binding(this.segment(), value); return this; }

}
