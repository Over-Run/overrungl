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
/// ### multiview
/// [VarHandle][#VH_multiview] - [Getter][#multiview()] - [Setter][#multiview(int)]
/// ### multiviewGeometryShader
/// [VarHandle][#VH_multiviewGeometryShader] - [Getter][#multiviewGeometryShader()] - [Setter][#multiviewGeometryShader(int)]
/// ### multiviewTessellationShader
/// [VarHandle][#VH_multiviewTessellationShader] - [Getter][#multiviewTessellationShader()] - [Setter][#multiviewTessellationShader(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMultiviewFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 multiview;
///     VkBool32 multiviewGeometryShader;
///     VkBool32 multiviewTessellationShader;
/// } VkPhysicalDeviceMultiviewFeatures;
/// ```
public sealed class VkPhysicalDeviceMultiviewFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceMultiviewFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `multiview` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiview = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiview"));
    /// The [VarHandle] of `multiviewGeometryShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiviewGeometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewGeometryShader"));
    /// The [VarHandle] of `multiviewTessellationShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiviewTessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewTessellationShader"));

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMultiviewFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeatures(segment); }

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMultiviewFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewFeatures`
    public static VkPhysicalDeviceMultiviewFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMultiviewFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMultiviewFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMultiviewFeatures` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewFeatures`
    public static VkPhysicalDeviceMultiviewFeatures allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int multiview, @CType("VkBool32") int multiviewGeometryShader, @CType("VkBool32") int multiviewTessellationShader) { return alloc(allocator).sType(sType).pNext(pNext).multiview(multiview).multiviewGeometryShader(multiviewGeometryShader).multiviewTessellationShader(multiviewTessellationShader); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures copyFrom(VkPhysicalDeviceMultiviewFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMultiviewFeatures.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMultiviewFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMultiviewFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMultiviewFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `multiview` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiview(MemorySegment segment, long index) { return (int) VH_multiview.get(segment, 0L, index); }
    /// {@return `multiview`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiview(MemorySegment segment) { return VkPhysicalDeviceMultiviewFeatures.get_multiview(segment, 0L); }
    /// {@return `multiview`}
    public @CType("VkBool32") int multiview() { return VkPhysicalDeviceMultiviewFeatures.get_multiview(this.segment()); }
    /// Sets `multiview` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiview(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiview.set(segment, 0L, index, value); }
    /// Sets `multiview` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiview(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiview(segment, 0L, value); }
    /// Sets `multiview` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures multiview(@CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiview(this.segment(), value); return this; }

    /// {@return `multiviewGeometryShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiviewGeometryShader(MemorySegment segment, long index) { return (int) VH_multiviewGeometryShader.get(segment, 0L, index); }
    /// {@return `multiviewGeometryShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiviewGeometryShader(MemorySegment segment) { return VkPhysicalDeviceMultiviewFeatures.get_multiviewGeometryShader(segment, 0L); }
    /// {@return `multiviewGeometryShader`}
    public @CType("VkBool32") int multiviewGeometryShader() { return VkPhysicalDeviceMultiviewFeatures.get_multiviewGeometryShader(this.segment()); }
    /// Sets `multiviewGeometryShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiviewGeometryShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiviewGeometryShader.set(segment, 0L, index, value); }
    /// Sets `multiviewGeometryShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiviewGeometryShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiviewGeometryShader(segment, 0L, value); }
    /// Sets `multiviewGeometryShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures multiviewGeometryShader(@CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiviewGeometryShader(this.segment(), value); return this; }

    /// {@return `multiviewTessellationShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiviewTessellationShader(MemorySegment segment, long index) { return (int) VH_multiviewTessellationShader.get(segment, 0L, index); }
    /// {@return `multiviewTessellationShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiviewTessellationShader(MemorySegment segment) { return VkPhysicalDeviceMultiviewFeatures.get_multiviewTessellationShader(segment, 0L); }
    /// {@return `multiviewTessellationShader`}
    public @CType("VkBool32") int multiviewTessellationShader() { return VkPhysicalDeviceMultiviewFeatures.get_multiviewTessellationShader(this.segment()); }
    /// Sets `multiviewTessellationShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiviewTessellationShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiviewTessellationShader.set(segment, 0L, index, value); }
    /// Sets `multiviewTessellationShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiviewTessellationShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiviewTessellationShader(segment, 0L, value); }
    /// Sets `multiviewTessellationShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures multiviewTessellationShader(@CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiviewTessellationShader(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceMultiviewFeatures].
    public static final class Buffer extends VkPhysicalDeviceMultiviewFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMultiviewFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMultiviewFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMultiviewFeatures`
        public VkPhysicalDeviceMultiviewFeatures asSlice(long index) { return new VkPhysicalDeviceMultiviewFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMultiviewFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMultiviewFeatures`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMultiviewFeatures.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewFeatures.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMultiviewFeatures.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewFeatures.set_pNext(this.segment(), index, value); return this; }

        /// {@return `multiview` at the given index}
        /// @param index the index
        public @CType("VkBool32") int multiviewAt(long index) { return VkPhysicalDeviceMultiviewFeatures.get_multiview(this.segment(), index); }
        /// Sets `multiview` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer multiviewAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiview(this.segment(), index, value); return this; }

        /// {@return `multiviewGeometryShader` at the given index}
        /// @param index the index
        public @CType("VkBool32") int multiviewGeometryShaderAt(long index) { return VkPhysicalDeviceMultiviewFeatures.get_multiviewGeometryShader(this.segment(), index); }
        /// Sets `multiviewGeometryShader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer multiviewGeometryShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiviewGeometryShader(this.segment(), index, value); return this; }

        /// {@return `multiviewTessellationShader` at the given index}
        /// @param index the index
        public @CType("VkBool32") int multiviewTessellationShaderAt(long index) { return VkPhysicalDeviceMultiviewFeatures.get_multiviewTessellationShader(this.segment(), index); }
        /// Sets `multiviewTessellationShader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer multiviewTessellationShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewFeatures.set_multiviewTessellationShader(this.segment(), index, value); return this; }

    }
}
