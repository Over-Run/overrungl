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
/// ### shaderDrawParameters
/// [VarHandle][#VH_shaderDrawParameters] - [Getter][#shaderDrawParameters()] - [Setter][#shaderDrawParameters(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderDrawParametersFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderDrawParameters;
/// } VkPhysicalDeviceShaderDrawParametersFeatures;
/// ```
public sealed class VkPhysicalDeviceShaderDrawParametersFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderDrawParametersFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderDrawParameters")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderDrawParameters` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDrawParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDrawParameters"));

    /// Creates `VkPhysicalDeviceShaderDrawParametersFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderDrawParametersFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderDrawParametersFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderDrawParametersFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderDrawParametersFeatures(segment); }

    /// Creates `VkPhysicalDeviceShaderDrawParametersFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderDrawParametersFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderDrawParametersFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderDrawParametersFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderDrawParametersFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderDrawParametersFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderDrawParametersFeatures`
    public static VkPhysicalDeviceShaderDrawParametersFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderDrawParametersFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderDrawParametersFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderDrawParametersFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderDrawParametersFeatures` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderDrawParametersFeatures`
    public static VkPhysicalDeviceShaderDrawParametersFeatures allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int shaderDrawParameters) { return alloc(allocator).sType(sType).pNext(pNext).shaderDrawParameters(shaderDrawParameters); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderDrawParametersFeatures copyFrom(VkPhysicalDeviceShaderDrawParametersFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderDrawParametersFeatures.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderDrawParametersFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderDrawParametersFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderDrawParametersFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderDrawParametersFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderDrawParametersFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderDrawParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDrawParameters(MemorySegment segment, long index) { return (int) VH_shaderDrawParameters.get(segment, 0L, index); }
    /// {@return `shaderDrawParameters`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDrawParameters(MemorySegment segment) { return VkPhysicalDeviceShaderDrawParametersFeatures.get_shaderDrawParameters(segment, 0L); }
    /// {@return `shaderDrawParameters`}
    public @CType("VkBool32") int shaderDrawParameters() { return VkPhysicalDeviceShaderDrawParametersFeatures.get_shaderDrawParameters(this.segment()); }
    /// Sets `shaderDrawParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDrawParameters(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDrawParameters.set(segment, 0L, index, value); }
    /// Sets `shaderDrawParameters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDrawParameters(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_shaderDrawParameters(segment, 0L, value); }
    /// Sets `shaderDrawParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderDrawParametersFeatures shaderDrawParameters(@CType("VkBool32") int value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_shaderDrawParameters(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderDrawParametersFeatures].
    public static final class Buffer extends VkPhysicalDeviceShaderDrawParametersFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderDrawParametersFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderDrawParametersFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderDrawParametersFeatures`
        public VkPhysicalDeviceShaderDrawParametersFeatures asSlice(long index) { return new VkPhysicalDeviceShaderDrawParametersFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderDrawParametersFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderDrawParametersFeatures`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderDrawParametersFeatures.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderDrawParametersFeatures.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderDrawParameters` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDrawParametersAt(long index) { return VkPhysicalDeviceShaderDrawParametersFeatures.get_shaderDrawParameters(this.segment(), index); }
        /// Sets `shaderDrawParameters` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDrawParametersAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderDrawParametersFeatures.set_shaderDrawParameters(this.segment(), index, value); return this; }

    }
}
