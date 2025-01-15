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
package overrungl.vulkan.amd.struct;

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
/// ### shaderCoreFeatures
/// [VarHandle][#VH_shaderCoreFeatures] - [Getter][#shaderCoreFeatures()] - [Setter][#shaderCoreFeatures(int)]
/// ### activeComputeUnitCount
/// [VarHandle][#VH_activeComputeUnitCount] - [Getter][#activeComputeUnitCount()] - [Setter][#activeComputeUnitCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderCoreProperties2AMD {
///     VkStructureType sType;
///     void * pNext;
///     VkShaderCorePropertiesFlagsAMD shaderCoreFeatures;
///     uint32_t activeComputeUnitCount;
/// } VkPhysicalDeviceShaderCoreProperties2AMD;
/// ```
public sealed class VkPhysicalDeviceShaderCoreProperties2AMD extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderCoreProperties2AMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreFeatures"),
        ValueLayout.JAVA_INT.withName("activeComputeUnitCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderCoreFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderCoreFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreFeatures"));
    /// The [VarHandle] of `activeComputeUnitCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_activeComputeUnitCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("activeComputeUnitCount"));

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderCoreProperties2AMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreProperties2AMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreProperties2AMD(segment); }

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreProperties2AMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreProperties2AMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCoreProperties2AMD`
    public static VkPhysicalDeviceShaderCoreProperties2AMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreProperties2AMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCoreProperties2AMD`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderCoreProperties2AMD` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCoreProperties2AMD`
    public static VkPhysicalDeviceShaderCoreProperties2AMD allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkShaderCorePropertiesFlagsAMD") int shaderCoreFeatures, @CType("uint32_t") int activeComputeUnitCount) { return alloc(allocator).sType(sType).pNext(pNext).shaderCoreFeatures(shaderCoreFeatures).activeComputeUnitCount(activeComputeUnitCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD copyFrom(VkPhysicalDeviceShaderCoreProperties2AMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderCoreProperties2AMD.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderCoreProperties2AMD.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderCoreProperties2AMD.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderCoreProperties2AMD.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderCoreFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderCorePropertiesFlagsAMD") int get_shaderCoreFeatures(MemorySegment segment, long index) { return (int) VH_shaderCoreFeatures.get(segment, 0L, index); }
    /// {@return `shaderCoreFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderCorePropertiesFlagsAMD") int get_shaderCoreFeatures(MemorySegment segment) { return VkPhysicalDeviceShaderCoreProperties2AMD.get_shaderCoreFeatures(segment, 0L); }
    /// {@return `shaderCoreFeatures`}
    public @CType("VkShaderCorePropertiesFlagsAMD") int shaderCoreFeatures() { return VkPhysicalDeviceShaderCoreProperties2AMD.get_shaderCoreFeatures(this.segment()); }
    /// Sets `shaderCoreFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderCoreFeatures(MemorySegment segment, long index, @CType("VkShaderCorePropertiesFlagsAMD") int value) { VH_shaderCoreFeatures.set(segment, 0L, index, value); }
    /// Sets `shaderCoreFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderCoreFeatures(MemorySegment segment, @CType("VkShaderCorePropertiesFlagsAMD") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_shaderCoreFeatures(segment, 0L, value); }
    /// Sets `shaderCoreFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD shaderCoreFeatures(@CType("VkShaderCorePropertiesFlagsAMD") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_shaderCoreFeatures(this.segment(), value); return this; }

    /// {@return `activeComputeUnitCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_activeComputeUnitCount(MemorySegment segment, long index) { return (int) VH_activeComputeUnitCount.get(segment, 0L, index); }
    /// {@return `activeComputeUnitCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_activeComputeUnitCount(MemorySegment segment) { return VkPhysicalDeviceShaderCoreProperties2AMD.get_activeComputeUnitCount(segment, 0L); }
    /// {@return `activeComputeUnitCount`}
    public @CType("uint32_t") int activeComputeUnitCount() { return VkPhysicalDeviceShaderCoreProperties2AMD.get_activeComputeUnitCount(this.segment()); }
    /// Sets `activeComputeUnitCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_activeComputeUnitCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_activeComputeUnitCount.set(segment, 0L, index, value); }
    /// Sets `activeComputeUnitCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_activeComputeUnitCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_activeComputeUnitCount(segment, 0L, value); }
    /// Sets `activeComputeUnitCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreProperties2AMD activeComputeUnitCount(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_activeComputeUnitCount(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderCoreProperties2AMD].
    public static final class Buffer extends VkPhysicalDeviceShaderCoreProperties2AMD {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderCoreProperties2AMD.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderCoreProperties2AMD`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderCoreProperties2AMD`
        public VkPhysicalDeviceShaderCoreProperties2AMD asSlice(long index) { return new VkPhysicalDeviceShaderCoreProperties2AMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderCoreProperties2AMD`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderCoreProperties2AMD`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderCoreProperties2AMD.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderCoreProperties2AMD.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderCoreFeatures` at the given index}
        /// @param index the index
        public @CType("VkShaderCorePropertiesFlagsAMD") int shaderCoreFeaturesAt(long index) { return VkPhysicalDeviceShaderCoreProperties2AMD.get_shaderCoreFeatures(this.segment(), index); }
        /// Sets `shaderCoreFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderCoreFeaturesAt(long index, @CType("VkShaderCorePropertiesFlagsAMD") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_shaderCoreFeatures(this.segment(), index, value); return this; }

        /// {@return `activeComputeUnitCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int activeComputeUnitCountAt(long index) { return VkPhysicalDeviceShaderCoreProperties2AMD.get_activeComputeUnitCount(this.segment(), index); }
        /// Sets `activeComputeUnitCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer activeComputeUnitCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.set_activeComputeUnitCount(this.segment(), index, value); return this; }

    }
}
