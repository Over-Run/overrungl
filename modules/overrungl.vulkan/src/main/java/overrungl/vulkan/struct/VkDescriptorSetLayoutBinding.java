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
/// ### binding
/// [VarHandle][#VH_binding] - [Getter][#binding()] - [Setter][#binding(int)]
/// ### descriptorType
/// [VarHandle][#VH_descriptorType] - [Getter][#descriptorType()] - [Setter][#descriptorType(int)]
/// ### descriptorCount
/// [VarHandle][#VH_descriptorCount] - [Getter][#descriptorCount()] - [Setter][#descriptorCount(int)]
/// ### stageFlags
/// [VarHandle][#VH_stageFlags] - [Getter][#stageFlags()] - [Setter][#stageFlags(int)]
/// ### pImmutableSamplers
/// [VarHandle][#VH_pImmutableSamplers] - [Getter][#pImmutableSamplers()] - [Setter][#pImmutableSamplers(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorSetLayoutBinding {
///     uint32_t binding;
///     VkDescriptorType descriptorType;
///     uint32_t descriptorCount;
///     VkShaderStageFlags stageFlags;
///     const VkSampler * pImmutableSamplers;
/// } VkDescriptorSetLayoutBinding;
/// ```
public sealed class VkDescriptorSetLayoutBinding extends Struct {
    /// The struct layout of `VkDescriptorSetLayoutBinding`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("pImmutableSamplers")
    );
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The [VarHandle] of `descriptorType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    /// The [VarHandle] of `descriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `pImmutableSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImmutableSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImmutableSamplers"));

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetLayoutBinding(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBinding of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBinding(segment); }

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBinding ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBinding(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetLayoutBinding` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorSetLayoutBinding` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutBinding`
    public static VkDescriptorSetLayoutBinding alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutBinding(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetLayoutBinding` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetLayoutBinding`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorSetLayoutBinding` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutBinding`
    public static VkDescriptorSetLayoutBinding allocInit(SegmentAllocator allocator, @CType("uint32_t") int binding, @CType("VkDescriptorType") int descriptorType, @CType("uint32_t") int descriptorCount, @CType("VkShaderStageFlags") int stageFlags, @CType("const VkSampler *") MemorySegment pImmutableSamplers) { return alloc(allocator).binding(binding).descriptorType(descriptorType).descriptorCount(descriptorCount).stageFlags(stageFlags).pImmutableSamplers(pImmutableSamplers); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetLayoutBinding copyFrom(VkDescriptorSetLayoutBinding src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_binding(MemorySegment segment) { return VkDescriptorSetLayoutBinding.get_binding(segment, 0L); }
    /// {@return `binding`}
    public @CType("uint32_t") int binding() { return VkDescriptorSetLayoutBinding.get_binding(this.segment()); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_binding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_binding(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetLayoutBinding.set_binding(segment, 0L, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding binding(@CType("uint32_t") int value) { VkDescriptorSetLayoutBinding.set_binding(this.segment(), value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorType") int get_descriptorType(MemorySegment segment, long index) { return (int) VH_descriptorType.get(segment, 0L, index); }
    /// {@return `descriptorType`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorType") int get_descriptorType(MemorySegment segment) { return VkDescriptorSetLayoutBinding.get_descriptorType(segment, 0L); }
    /// {@return `descriptorType`}
    public @CType("VkDescriptorType") int descriptorType() { return VkDescriptorSetLayoutBinding.get_descriptorType(this.segment()); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorType(MemorySegment segment, long index, @CType("VkDescriptorType") int value) { VH_descriptorType.set(segment, 0L, index, value); }
    /// Sets `descriptorType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorType(MemorySegment segment, @CType("VkDescriptorType") int value) { VkDescriptorSetLayoutBinding.set_descriptorType(segment, 0L, value); }
    /// Sets `descriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding descriptorType(@CType("VkDescriptorType") int value) { VkDescriptorSetLayoutBinding.set_descriptorType(this.segment(), value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment) { return VkDescriptorSetLayoutBinding.get_descriptorCount(segment, 0L); }
    /// {@return `descriptorCount`}
    public @CType("uint32_t") int descriptorCount() { return VkDescriptorSetLayoutBinding.get_descriptorCount(this.segment()); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetLayoutBinding.set_descriptorCount(segment, 0L, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding descriptorCount(@CType("uint32_t") int value) { VkDescriptorSetLayoutBinding.set_descriptorCount(this.segment(), value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment) { return VkDescriptorSetLayoutBinding.get_stageFlags(segment, 0L); }
    /// {@return `stageFlags`}
    public @CType("VkShaderStageFlags") int stageFlags() { return VkDescriptorSetLayoutBinding.get_stageFlags(this.segment()); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkDescriptorSetLayoutBinding.set_stageFlags(segment, 0L, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding stageFlags(@CType("VkShaderStageFlags") int value) { VkDescriptorSetLayoutBinding.set_stageFlags(this.segment(), value); return this; }

    /// {@return `pImmutableSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSampler *") MemorySegment get_pImmutableSamplers(MemorySegment segment, long index) { return (MemorySegment) VH_pImmutableSamplers.get(segment, 0L, index); }
    /// {@return `pImmutableSamplers`}
    /// @param segment the segment of the struct
    public static @CType("const VkSampler *") MemorySegment get_pImmutableSamplers(MemorySegment segment) { return VkDescriptorSetLayoutBinding.get_pImmutableSamplers(segment, 0L); }
    /// {@return `pImmutableSamplers`}
    public @CType("const VkSampler *") MemorySegment pImmutableSamplers() { return VkDescriptorSetLayoutBinding.get_pImmutableSamplers(this.segment()); }
    /// Sets `pImmutableSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImmutableSamplers(MemorySegment segment, long index, @CType("const VkSampler *") MemorySegment value) { VH_pImmutableSamplers.set(segment, 0L, index, value); }
    /// Sets `pImmutableSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImmutableSamplers(MemorySegment segment, @CType("const VkSampler *") MemorySegment value) { VkDescriptorSetLayoutBinding.set_pImmutableSamplers(segment, 0L, value); }
    /// Sets `pImmutableSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBinding pImmutableSamplers(@CType("const VkSampler *") MemorySegment value) { VkDescriptorSetLayoutBinding.set_pImmutableSamplers(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorSetLayoutBinding].
    public static final class Buffer extends VkDescriptorSetLayoutBinding {
        private final long elementCount;

        /// Creates `VkDescriptorSetLayoutBinding.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorSetLayoutBinding`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorSetLayoutBinding`
        public VkDescriptorSetLayoutBinding asSlice(long index) { return new VkDescriptorSetLayoutBinding(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorSetLayoutBinding`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorSetLayoutBinding`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `binding` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bindingAt(long index) { return VkDescriptorSetLayoutBinding.get_binding(this.segment(), index); }
        /// Sets `binding` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bindingAt(long index, @CType("uint32_t") int value) { VkDescriptorSetLayoutBinding.set_binding(this.segment(), index, value); return this; }

        /// {@return `descriptorType` at the given index}
        /// @param index the index
        public @CType("VkDescriptorType") int descriptorTypeAt(long index) { return VkDescriptorSetLayoutBinding.get_descriptorType(this.segment(), index); }
        /// Sets `descriptorType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorTypeAt(long index, @CType("VkDescriptorType") int value) { VkDescriptorSetLayoutBinding.set_descriptorType(this.segment(), index, value); return this; }

        /// {@return `descriptorCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int descriptorCountAt(long index) { return VkDescriptorSetLayoutBinding.get_descriptorCount(this.segment(), index); }
        /// Sets `descriptorCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorCountAt(long index, @CType("uint32_t") int value) { VkDescriptorSetLayoutBinding.set_descriptorCount(this.segment(), index, value); return this; }

        /// {@return `stageFlags` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int stageFlagsAt(long index) { return VkDescriptorSetLayoutBinding.get_stageFlags(this.segment(), index); }
        /// Sets `stageFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageFlagsAt(long index, @CType("VkShaderStageFlags") int value) { VkDescriptorSetLayoutBinding.set_stageFlags(this.segment(), index, value); return this; }

        /// {@return `pImmutableSamplers` at the given index}
        /// @param index the index
        public @CType("const VkSampler *") MemorySegment pImmutableSamplersAt(long index) { return VkDescriptorSetLayoutBinding.get_pImmutableSamplers(this.segment(), index); }
        /// Sets `pImmutableSamplers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pImmutableSamplersAt(long index, @CType("const VkSampler *") MemorySegment value) { VkDescriptorSetLayoutBinding.set_pImmutableSamplers(this.segment(), index, value); return this; }

    }
}
