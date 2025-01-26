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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderBufferFloat32Atomics;
///     VkBool32 shaderBufferFloat32AtomicAdd;
///     VkBool32 shaderBufferFloat64Atomics;
///     VkBool32 shaderBufferFloat64AtomicAdd;
///     VkBool32 shaderSharedFloat32Atomics;
///     VkBool32 shaderSharedFloat32AtomicAdd;
///     VkBool32 shaderSharedFloat64Atomics;
///     VkBool32 shaderSharedFloat64AtomicAdd;
///     VkBool32 shaderImageFloat32Atomics;
///     VkBool32 shaderImageFloat32AtomicAdd;
///     VkBool32 sparseImageFloat32Atomics;
///     VkBool32 sparseImageFloat32AtomicAdd;
/// };
/// ```
public sealed class VkPhysicalDeviceShaderAtomicFloatFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicAdd")
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
    /// The byte offset of `shaderBufferFloat32Atomics`.
    public static final long OFFSET_shaderBufferFloat32Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32Atomics"));
    /// The memory layout of `shaderBufferFloat32Atomics`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat32Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferFloat32Atomics"));
    /// The [VarHandle] of `shaderBufferFloat32Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBufferFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32Atomics"));
    /// The byte offset of `shaderBufferFloat32AtomicAdd`.
    public static final long OFFSET_shaderBufferFloat32AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
    /// The memory layout of `shaderBufferFloat32AtomicAdd`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat32AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
    /// The [VarHandle] of `shaderBufferFloat32AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBufferFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
    /// The byte offset of `shaderBufferFloat64Atomics`.
    public static final long OFFSET_shaderBufferFloat64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64Atomics"));
    /// The memory layout of `shaderBufferFloat64Atomics`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat64Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferFloat64Atomics"));
    /// The [VarHandle] of `shaderBufferFloat64Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBufferFloat64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64Atomics"));
    /// The byte offset of `shaderBufferFloat64AtomicAdd`.
    public static final long OFFSET_shaderBufferFloat64AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
    /// The memory layout of `shaderBufferFloat64AtomicAdd`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat64AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
    /// The [VarHandle] of `shaderBufferFloat64AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBufferFloat64AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
    /// The byte offset of `shaderSharedFloat32Atomics`.
    public static final long OFFSET_shaderSharedFloat32Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32Atomics"));
    /// The memory layout of `shaderSharedFloat32Atomics`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat32Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedFloat32Atomics"));
    /// The [VarHandle] of `shaderSharedFloat32Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSharedFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32Atomics"));
    /// The byte offset of `shaderSharedFloat32AtomicAdd`.
    public static final long OFFSET_shaderSharedFloat32AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
    /// The memory layout of `shaderSharedFloat32AtomicAdd`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat32AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
    /// The [VarHandle] of `shaderSharedFloat32AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSharedFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
    /// The byte offset of `shaderSharedFloat64Atomics`.
    public static final long OFFSET_shaderSharedFloat64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64Atomics"));
    /// The memory layout of `shaderSharedFloat64Atomics`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat64Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedFloat64Atomics"));
    /// The [VarHandle] of `shaderSharedFloat64Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSharedFloat64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64Atomics"));
    /// The byte offset of `shaderSharedFloat64AtomicAdd`.
    public static final long OFFSET_shaderSharedFloat64AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
    /// The memory layout of `shaderSharedFloat64AtomicAdd`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat64AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
    /// The [VarHandle] of `shaderSharedFloat64AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSharedFloat64AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
    /// The byte offset of `shaderImageFloat32Atomics`.
    public static final long OFFSET_shaderImageFloat32Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32Atomics"));
    /// The memory layout of `shaderImageFloat32Atomics`.
    public static final MemoryLayout LAYOUT_shaderImageFloat32Atomics = LAYOUT.select(PathElement.groupElement("shaderImageFloat32Atomics"));
    /// The [VarHandle] of `shaderImageFloat32Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderImageFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32Atomics"));
    /// The byte offset of `shaderImageFloat32AtomicAdd`.
    public static final long OFFSET_shaderImageFloat32AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
    /// The memory layout of `shaderImageFloat32AtomicAdd`.
    public static final MemoryLayout LAYOUT_shaderImageFloat32AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
    /// The [VarHandle] of `shaderImageFloat32AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderImageFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
    /// The byte offset of `sparseImageFloat32Atomics`.
    public static final long OFFSET_sparseImageFloat32Atomics = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32Atomics"));
    /// The memory layout of `sparseImageFloat32Atomics`.
    public static final MemoryLayout LAYOUT_sparseImageFloat32Atomics = LAYOUT.select(PathElement.groupElement("sparseImageFloat32Atomics"));
    /// The [VarHandle] of `sparseImageFloat32Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseImageFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32Atomics"));
    /// The byte offset of `sparseImageFloat32AtomicAdd`.
    public static final long OFFSET_sparseImageFloat32AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32AtomicAdd"));
    /// The memory layout of `sparseImageFloat32AtomicAdd`.
    public static final MemoryLayout LAYOUT_sparseImageFloat32AtomicAdd = LAYOUT.select(PathElement.groupElement("sparseImageFloat32AtomicAdd"));
    /// The [VarHandle] of `sparseImageFloat32AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseImageFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32AtomicAdd"));

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT copyFrom(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat32Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat32Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat32Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat32Atomics`}
    public int shaderBufferFloat32Atomics() { return shaderBufferFloat32Atomics(this.segment(), 0L); }
    /// Sets `shaderBufferFloat32Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat32Atomics(MemorySegment segment, long index, int value) { VH_shaderBufferFloat32Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat32Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32Atomics(int value) { shaderBufferFloat32Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat32AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat32AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat32AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat32AtomicAdd`}
    public int shaderBufferFloat32AtomicAdd() { return shaderBufferFloat32AtomicAdd(this.segment(), 0L); }
    /// Sets `shaderBufferFloat32AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat32AtomicAdd(MemorySegment segment, long index, int value) { VH_shaderBufferFloat32AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat32AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32AtomicAdd(int value) { shaderBufferFloat32AtomicAdd(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat64Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat64Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat64Atomics`}
    public int shaderBufferFloat64Atomics() { return shaderBufferFloat64Atomics(this.segment(), 0L); }
    /// Sets `shaderBufferFloat64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat64Atomics(MemorySegment segment, long index, int value) { VH_shaderBufferFloat64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64Atomics(int value) { shaderBufferFloat64Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat64AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat64AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat64AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat64AtomicAdd`}
    public int shaderBufferFloat64AtomicAdd() { return shaderBufferFloat64AtomicAdd(this.segment(), 0L); }
    /// Sets `shaderBufferFloat64AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat64AtomicAdd(MemorySegment segment, long index, int value) { VH_shaderBufferFloat64AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat64AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64AtomicAdd(int value) { shaderBufferFloat64AtomicAdd(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat32Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat32Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat32Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat32Atomics`}
    public int shaderSharedFloat32Atomics() { return shaderSharedFloat32Atomics(this.segment(), 0L); }
    /// Sets `shaderSharedFloat32Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat32Atomics(MemorySegment segment, long index, int value) { VH_shaderSharedFloat32Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat32Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32Atomics(int value) { shaderSharedFloat32Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat32AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat32AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat32AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat32AtomicAdd`}
    public int shaderSharedFloat32AtomicAdd() { return shaderSharedFloat32AtomicAdd(this.segment(), 0L); }
    /// Sets `shaderSharedFloat32AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat32AtomicAdd(MemorySegment segment, long index, int value) { VH_shaderSharedFloat32AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat32AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32AtomicAdd(int value) { shaderSharedFloat32AtomicAdd(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat64Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat64Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat64Atomics`}
    public int shaderSharedFloat64Atomics() { return shaderSharedFloat64Atomics(this.segment(), 0L); }
    /// Sets `shaderSharedFloat64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat64Atomics(MemorySegment segment, long index, int value) { VH_shaderSharedFloat64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64Atomics(int value) { shaderSharedFloat64Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat64AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat64AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat64AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat64AtomicAdd`}
    public int shaderSharedFloat64AtomicAdd() { return shaderSharedFloat64AtomicAdd(this.segment(), 0L); }
    /// Sets `shaderSharedFloat64AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat64AtomicAdd(MemorySegment segment, long index, int value) { VH_shaderSharedFloat64AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat64AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64AtomicAdd(int value) { shaderSharedFloat64AtomicAdd(this.segment(), 0L, value); return this; }

    /// {@return `shaderImageFloat32Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderImageFloat32Atomics(MemorySegment segment, long index) { return (int) VH_shaderImageFloat32Atomics.get(segment, 0L, index); }
    /// {@return `shaderImageFloat32Atomics`}
    public int shaderImageFloat32Atomics() { return shaderImageFloat32Atomics(this.segment(), 0L); }
    /// Sets `shaderImageFloat32Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderImageFloat32Atomics(MemorySegment segment, long index, int value) { VH_shaderImageFloat32Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderImageFloat32Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32Atomics(int value) { shaderImageFloat32Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderImageFloat32AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderImageFloat32AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderImageFloat32AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderImageFloat32AtomicAdd`}
    public int shaderImageFloat32AtomicAdd() { return shaderImageFloat32AtomicAdd(this.segment(), 0L); }
    /// Sets `shaderImageFloat32AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderImageFloat32AtomicAdd(MemorySegment segment, long index, int value) { VH_shaderImageFloat32AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderImageFloat32AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32AtomicAdd(int value) { shaderImageFloat32AtomicAdd(this.segment(), 0L, value); return this; }

    /// {@return `sparseImageFloat32Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseImageFloat32Atomics(MemorySegment segment, long index) { return (int) VH_sparseImageFloat32Atomics.get(segment, 0L, index); }
    /// {@return `sparseImageFloat32Atomics`}
    public int sparseImageFloat32Atomics() { return sparseImageFloat32Atomics(this.segment(), 0L); }
    /// Sets `sparseImageFloat32Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseImageFloat32Atomics(MemorySegment segment, long index, int value) { VH_sparseImageFloat32Atomics.set(segment, 0L, index, value); }
    /// Sets `sparseImageFloat32Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32Atomics(int value) { sparseImageFloat32Atomics(this.segment(), 0L, value); return this; }

    /// {@return `sparseImageFloat32AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseImageFloat32AtomicAdd(MemorySegment segment, long index) { return (int) VH_sparseImageFloat32AtomicAdd.get(segment, 0L, index); }
    /// {@return `sparseImageFloat32AtomicAdd`}
    public int sparseImageFloat32AtomicAdd() { return sparseImageFloat32AtomicAdd(this.segment(), 0L); }
    /// Sets `sparseImageFloat32AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseImageFloat32AtomicAdd(MemorySegment segment, long index, int value) { VH_sparseImageFloat32AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `sparseImageFloat32AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32AtomicAdd(int value) { sparseImageFloat32AtomicAdd(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderAtomicFloatFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `shaderBufferFloat32Atomics` at the given index}
        /// @param index the index of the struct buffer
        public int shaderBufferFloat32AtomicsAt(long index) { return shaderBufferFloat32Atomics(this.segment(), index); }
        /// Sets `shaderBufferFloat32Atomics` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferFloat32AtomicsAt(long index, int value) { shaderBufferFloat32Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderBufferFloat32AtomicAdd` at the given index}
        /// @param index the index of the struct buffer
        public int shaderBufferFloat32AtomicAddAt(long index) { return shaderBufferFloat32AtomicAdd(this.segment(), index); }
        /// Sets `shaderBufferFloat32AtomicAdd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferFloat32AtomicAddAt(long index, int value) { shaderBufferFloat32AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `shaderBufferFloat64Atomics` at the given index}
        /// @param index the index of the struct buffer
        public int shaderBufferFloat64AtomicsAt(long index) { return shaderBufferFloat64Atomics(this.segment(), index); }
        /// Sets `shaderBufferFloat64Atomics` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferFloat64AtomicsAt(long index, int value) { shaderBufferFloat64Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderBufferFloat64AtomicAdd` at the given index}
        /// @param index the index of the struct buffer
        public int shaderBufferFloat64AtomicAddAt(long index) { return shaderBufferFloat64AtomicAdd(this.segment(), index); }
        /// Sets `shaderBufferFloat64AtomicAdd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferFloat64AtomicAddAt(long index, int value) { shaderBufferFloat64AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `shaderSharedFloat32Atomics` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSharedFloat32AtomicsAt(long index) { return shaderSharedFloat32Atomics(this.segment(), index); }
        /// Sets `shaderSharedFloat32Atomics` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedFloat32AtomicsAt(long index, int value) { shaderSharedFloat32Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderSharedFloat32AtomicAdd` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSharedFloat32AtomicAddAt(long index) { return shaderSharedFloat32AtomicAdd(this.segment(), index); }
        /// Sets `shaderSharedFloat32AtomicAdd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedFloat32AtomicAddAt(long index, int value) { shaderSharedFloat32AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `shaderSharedFloat64Atomics` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSharedFloat64AtomicsAt(long index) { return shaderSharedFloat64Atomics(this.segment(), index); }
        /// Sets `shaderSharedFloat64Atomics` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedFloat64AtomicsAt(long index, int value) { shaderSharedFloat64Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderSharedFloat64AtomicAdd` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSharedFloat64AtomicAddAt(long index) { return shaderSharedFloat64AtomicAdd(this.segment(), index); }
        /// Sets `shaderSharedFloat64AtomicAdd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedFloat64AtomicAddAt(long index, int value) { shaderSharedFloat64AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `shaderImageFloat32Atomics` at the given index}
        /// @param index the index of the struct buffer
        public int shaderImageFloat32AtomicsAt(long index) { return shaderImageFloat32Atomics(this.segment(), index); }
        /// Sets `shaderImageFloat32Atomics` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderImageFloat32AtomicsAt(long index, int value) { shaderImageFloat32Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderImageFloat32AtomicAdd` at the given index}
        /// @param index the index of the struct buffer
        public int shaderImageFloat32AtomicAddAt(long index) { return shaderImageFloat32AtomicAdd(this.segment(), index); }
        /// Sets `shaderImageFloat32AtomicAdd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderImageFloat32AtomicAddAt(long index, int value) { shaderImageFloat32AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `sparseImageFloat32Atomics` at the given index}
        /// @param index the index of the struct buffer
        public int sparseImageFloat32AtomicsAt(long index) { return sparseImageFloat32Atomics(this.segment(), index); }
        /// Sets `sparseImageFloat32Atomics` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sparseImageFloat32AtomicsAt(long index, int value) { sparseImageFloat32Atomics(this.segment(), index, value); return this; }

        /// {@return `sparseImageFloat32AtomicAdd` at the given index}
        /// @param index the index of the struct buffer
        public int sparseImageFloat32AtomicAddAt(long index) { return sparseImageFloat32AtomicAdd(this.segment(), index); }
        /// Sets `sparseImageFloat32AtomicAdd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sparseImageFloat32AtomicAddAt(long index, int value) { sparseImageFloat32AtomicAdd(this.segment(), index, value); return this; }

    }
}
