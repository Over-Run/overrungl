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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSamplerBorderColorComponentMappingCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkComponentMapping) VkComponentMapping components;
///     (uint32_t) VkBool32 srgb;
/// };
/// ```
public final class VkSamplerBorderColorComponentMappingCreateInfoEXT extends GroupType {
    /// The struct layout of `VkSamplerBorderColorComponentMappingCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("srgb")
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
    /// The byte offset of `components`.
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    /// The memory layout of `components`.
    public static final MemoryLayout LAYOUT_components = LAYOUT.select(PathElement.groupElement("components"));
    /// The byte offset of `srgb`.
    public static final long OFFSET_srgb = LAYOUT.byteOffset(PathElement.groupElement("srgb"));
    /// The memory layout of `srgb`.
    public static final MemoryLayout LAYOUT_srgb = LAYOUT.select(PathElement.groupElement("srgb"));
    /// The [VarHandle] of `srgb` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srgb = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srgb"));

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerBorderColorComponentMappingCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param components `components`
    /// @param srgb `srgb`
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment components, int srgb) {
        return alloc(allocator).sType(sType).pNext(pNext).components(components).srgb(srgb);
    }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param components `components`
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment components) {
        return alloc(allocator).sType(sType).pNext(pNext).components(components);
    }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSamplerBorderColorComponentMappingCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT copyFrom(VkSamplerBorderColorComponentMappingCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerBorderColorComponentMappingCreateInfoEXT reinterpret(long count) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerBorderColorComponentMappingCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerBorderColorComponentMappingCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `components` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment components(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_components, index), LAYOUT_components); }
    /// {@return `components`}
    public MemorySegment components() { return components(this.segment(), 0L); }
    /// Sets `components` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void components(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_components, index), LAYOUT_components.byteSize()); }
    /// Sets `components` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(MemorySegment value) { components(this.segment(), 0L, value); return this; }
    /// Accepts `components` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(components())); return this; }

    /// {@return `srgb` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srgb(MemorySegment segment, long index) { return (int) VH_srgb.get(segment, 0L, index); }
    /// {@return `srgb`}
    public int srgb() { return srgb(this.segment(), 0L); }
    /// Sets `srgb` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srgb(MemorySegment segment, long index, int value) { VH_srgb.set(segment, 0L, index, value); }
    /// Sets `srgb` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT srgb(int value) { srgb(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerBorderColorComponentMappingCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT asSlice(long index) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerBorderColorComponentMappingCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerBorderColorComponentMappingCreateInfoEXT`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT asSlice(long index, long count) { return new VkSamplerBorderColorComponentMappingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerBorderColorComponentMappingCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT at(long index, Consumer<VkSamplerBorderColorComponentMappingCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `components` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment componentsAt(long index) { return components(this.segment(), index); }
    /// Sets `components` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT componentsAt(long index, MemorySegment value) { components(this.segment(), index, value); return this; }
    /// Accepts `components` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT componentsAt(long index, Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(componentsAt(index))); return this; }

    /// {@return `srgb` at the given index}
    /// @param index the index of the struct buffer
    public int srgbAt(long index) { return srgb(this.segment(), index); }
    /// Sets `srgb` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerBorderColorComponentMappingCreateInfoEXT srgbAt(long index, int value) { srgb(this.segment(), index, value); return this; }

}
