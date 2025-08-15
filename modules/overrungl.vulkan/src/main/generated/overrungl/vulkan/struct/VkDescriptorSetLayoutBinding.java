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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetLayoutBinding`.
/// ## Layout
/// ```
/// struct VkDescriptorSetLayoutBinding {
///     uint32_t binding;
///     (int) VkDescriptorType descriptorType;
///     uint32_t descriptorCount;
///     ((uint32_t) VkFlags) VkShaderStageFlags stageFlags;
///     const VkSampler* pImmutableSamplers;
/// };
/// ```
public final class VkDescriptorSetLayoutBinding extends GroupType {
    /// The struct layout of `VkDescriptorSetLayoutBinding`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("pImmutableSamplers")
    );
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The byte offset of `descriptorType`.
    public static final long OFFSET_descriptorType = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
    /// The memory layout of `descriptorType`.
    public static final MemoryLayout LAYOUT_descriptorType = LAYOUT.select(PathElement.groupElement("descriptorType"));
    /// The [VarHandle] of `descriptorType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    /// The byte offset of `descriptorCount`.
    public static final long OFFSET_descriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
    /// The memory layout of `descriptorCount`.
    public static final MemoryLayout LAYOUT_descriptorCount = LAYOUT.select(PathElement.groupElement("descriptorCount"));
    /// The [VarHandle] of `descriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));
    /// The byte offset of `stageFlags`.
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    /// The memory layout of `stageFlags`.
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The byte offset of `pImmutableSamplers`.
    public static final long OFFSET_pImmutableSamplers = LAYOUT.byteOffset(PathElement.groupElement("pImmutableSamplers"));
    /// The memory layout of `pImmutableSamplers`.
    public static final MemoryLayout LAYOUT_pImmutableSamplers = LAYOUT.select(PathElement.groupElement("pImmutableSamplers"));
    /// The [VarHandle] of `pImmutableSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImmutableSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImmutableSamplers"));

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDescriptorSetLayoutBinding(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBinding of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBinding(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBinding ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBinding(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBinding ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBinding(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorSetLayoutBinding` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutBinding`
    public static VkDescriptorSetLayoutBinding alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutBinding(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorSetLayoutBinding` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetLayoutBinding`
    public static VkDescriptorSetLayoutBinding alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutBinding(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetLayoutBinding copyFrom(VkDescriptorSetLayoutBinding src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorSetLayoutBinding reinterpret(long count) { return new VkDescriptorSetLayoutBinding(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    public int binding() { return binding(this.segment(), 0L); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binding(MemorySegment segment, long index, int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorType(MemorySegment segment, long index) { return (int) VH_descriptorType.get(segment, 0L, index); }
    /// {@return `descriptorType`}
    public int descriptorType() { return descriptorType(this.segment(), 0L); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorType(MemorySegment segment, long index, int value) { VH_descriptorType.set(segment, 0L, index, value); }
    /// Sets `descriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding descriptorType(int value) { descriptorType(this.segment(), 0L, value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorCount`}
    public int descriptorCount() { return descriptorCount(this.segment(), 0L); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorCount(MemorySegment segment, long index, int value) { VH_descriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding descriptorCount(int value) { descriptorCount(this.segment(), 0L, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    public int stageFlags() { return stageFlags(this.segment(), 0L); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageFlags(MemorySegment segment, long index, int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding stageFlags(int value) { stageFlags(this.segment(), 0L, value); return this; }

    /// {@return `pImmutableSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pImmutableSamplers(MemorySegment segment, long index) { return (MemorySegment) VH_pImmutableSamplers.get(segment, 0L, index); }
    /// {@return `pImmutableSamplers`}
    public MemorySegment pImmutableSamplers() { return pImmutableSamplers(this.segment(), 0L); }
    /// Sets `pImmutableSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pImmutableSamplers(MemorySegment segment, long index, MemorySegment value) { VH_pImmutableSamplers.set(segment, 0L, index, value); }
    /// Sets `pImmutableSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding pImmutableSamplers(MemorySegment value) { pImmutableSamplers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorSetLayoutBinding`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorSetLayoutBinding`
    public VkDescriptorSetLayoutBinding asSlice(long index) { return new VkDescriptorSetLayoutBinding(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorSetLayoutBinding`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorSetLayoutBinding`
    public VkDescriptorSetLayoutBinding asSlice(long index, long count) { return new VkDescriptorSetLayoutBinding(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorSetLayoutBinding` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorSetLayoutBinding at(long index, Consumer<VkDescriptorSetLayoutBinding> func) { func.accept(asSlice(index)); return this; }

    /// {@return `binding` at the given index}
    /// @param index the index of the struct buffer
    public int bindingAt(long index) { return binding(this.segment(), index); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorTypeAt(long index) { return descriptorType(this.segment(), index); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding descriptorTypeAt(long index, int value) { descriptorType(this.segment(), index, value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorCountAt(long index) { return descriptorCount(this.segment(), index); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding descriptorCountAt(long index, int value) { descriptorCount(this.segment(), index, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param index the index of the struct buffer
    public int stageFlagsAt(long index) { return stageFlags(this.segment(), index); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding stageFlagsAt(long index, int value) { stageFlags(this.segment(), index, value); return this; }

    /// {@return `pImmutableSamplers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pImmutableSamplersAt(long index) { return pImmutableSamplers(this.segment(), index); }
    /// Sets `pImmutableSamplers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding pImmutableSamplersAt(long index, MemorySegment value) { pImmutableSamplers(this.segment(), index, value); return this; }

}
