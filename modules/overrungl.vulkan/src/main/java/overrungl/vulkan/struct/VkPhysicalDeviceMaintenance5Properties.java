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
/// ### earlyFragmentMultisampleCoverageAfterSampleCounting
/// [VarHandle][#VH_earlyFragmentMultisampleCoverageAfterSampleCounting] - [Getter][#earlyFragmentMultisampleCoverageAfterSampleCounting()] - [Setter][#earlyFragmentMultisampleCoverageAfterSampleCounting(int)]
/// ### earlyFragmentSampleMaskTestBeforeSampleCounting
/// [VarHandle][#VH_earlyFragmentSampleMaskTestBeforeSampleCounting] - [Getter][#earlyFragmentSampleMaskTestBeforeSampleCounting()] - [Setter][#earlyFragmentSampleMaskTestBeforeSampleCounting(int)]
/// ### depthStencilSwizzleOneSupport
/// [VarHandle][#VH_depthStencilSwizzleOneSupport] - [Getter][#depthStencilSwizzleOneSupport()] - [Setter][#depthStencilSwizzleOneSupport(int)]
/// ### polygonModePointSize
/// [VarHandle][#VH_polygonModePointSize] - [Getter][#polygonModePointSize()] - [Setter][#polygonModePointSize(int)]
/// ### nonStrictSinglePixelWideLinesUseParallelogram
/// [VarHandle][#VH_nonStrictSinglePixelWideLinesUseParallelogram] - [Getter][#nonStrictSinglePixelWideLinesUseParallelogram()] - [Setter][#nonStrictSinglePixelWideLinesUseParallelogram(int)]
/// ### nonStrictWideLinesUseParallelogram
/// [VarHandle][#VH_nonStrictWideLinesUseParallelogram] - [Getter][#nonStrictWideLinesUseParallelogram()] - [Setter][#nonStrictWideLinesUseParallelogram(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMaintenance5Properties {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 earlyFragmentMultisampleCoverageAfterSampleCounting;
///     VkBool32 earlyFragmentSampleMaskTestBeforeSampleCounting;
///     VkBool32 depthStencilSwizzleOneSupport;
///     VkBool32 polygonModePointSize;
///     VkBool32 nonStrictSinglePixelWideLinesUseParallelogram;
///     VkBool32 nonStrictWideLinesUseParallelogram;
/// } VkPhysicalDeviceMaintenance5Properties;
/// ```
public sealed class VkPhysicalDeviceMaintenance5Properties extends Struct {
    /// The struct layout of `VkPhysicalDeviceMaintenance5Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
        ValueLayout.JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
        ValueLayout.JAVA_INT.withName("depthStencilSwizzleOneSupport"),
        ValueLayout.JAVA_INT.withName("polygonModePointSize"),
        ValueLayout.JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("nonStrictWideLinesUseParallelogram")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `earlyFragmentMultisampleCoverageAfterSampleCounting` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    /// The [VarHandle] of `earlyFragmentSampleMaskTestBeforeSampleCounting` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    /// The [VarHandle] of `depthStencilSwizzleOneSupport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthStencilSwizzleOneSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    /// The [VarHandle] of `polygonModePointSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_polygonModePointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonModePointSize"));
    /// The [VarHandle] of `nonStrictSinglePixelWideLinesUseParallelogram` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    /// The [VarHandle] of `nonStrictWideLinesUseParallelogram` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nonStrictWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMaintenance5Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance5Properties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5Properties(segment); }

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance5Properties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMaintenance5Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMaintenance5Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance5Properties`
    public static VkPhysicalDeviceMaintenance5Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance5Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMaintenance5Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance5Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance5Properties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance5Properties`
    public static VkPhysicalDeviceMaintenance5Properties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int earlyFragmentMultisampleCoverageAfterSampleCounting, @CType("VkBool32") int earlyFragmentSampleMaskTestBeforeSampleCounting, @CType("VkBool32") int depthStencilSwizzleOneSupport, @CType("VkBool32") int polygonModePointSize, @CType("VkBool32") int nonStrictSinglePixelWideLinesUseParallelogram, @CType("VkBool32") int nonStrictWideLinesUseParallelogram) { return alloc(allocator).sType(sType).pNext(pNext).earlyFragmentMultisampleCoverageAfterSampleCounting(earlyFragmentMultisampleCoverageAfterSampleCounting).earlyFragmentSampleMaskTestBeforeSampleCounting(earlyFragmentSampleMaskTestBeforeSampleCounting).depthStencilSwizzleOneSupport(depthStencilSwizzleOneSupport).polygonModePointSize(polygonModePointSize).nonStrictSinglePixelWideLinesUseParallelogram(nonStrictSinglePixelWideLinesUseParallelogram).nonStrictWideLinesUseParallelogram(nonStrictWideLinesUseParallelogram); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties copyFrom(VkPhysicalDeviceMaintenance5Properties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMaintenance5Properties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMaintenance5Properties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance5Properties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance5Properties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMaintenance5Properties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMaintenance5Properties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance5Properties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance5Properties.set_pNext(this.segment(), value); return this; }

    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, long index) { return (int) VH_earlyFragmentMultisampleCoverageAfterSampleCounting.get(segment, 0L, index); }
    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment) { return VkPhysicalDeviceMaintenance5Properties.get_earlyFragmentMultisampleCoverageAfterSampleCounting(segment, 0L); }
    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting`}
    public @CType("VkBool32") int earlyFragmentMultisampleCoverageAfterSampleCounting() { return VkPhysicalDeviceMaintenance5Properties.get_earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment()); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_earlyFragmentMultisampleCoverageAfterSampleCounting.set(segment, 0L, index, value); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_earlyFragmentMultisampleCoverageAfterSampleCounting(segment, 0L, value); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties earlyFragmentMultisampleCoverageAfterSampleCounting(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), value); return this; }

    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, long index) { return (int) VH_earlyFragmentSampleMaskTestBeforeSampleCounting.get(segment, 0L, index); }
    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment) { return VkPhysicalDeviceMaintenance5Properties.get_earlyFragmentSampleMaskTestBeforeSampleCounting(segment, 0L); }
    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting`}
    public @CType("VkBool32") int earlyFragmentSampleMaskTestBeforeSampleCounting() { return VkPhysicalDeviceMaintenance5Properties.get_earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment()); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_earlyFragmentSampleMaskTestBeforeSampleCounting.set(segment, 0L, index, value); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_earlyFragmentSampleMaskTestBeforeSampleCounting(segment, 0L, value); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties earlyFragmentSampleMaskTestBeforeSampleCounting(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), value); return this; }

    /// {@return `depthStencilSwizzleOneSupport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthStencilSwizzleOneSupport(MemorySegment segment, long index) { return (int) VH_depthStencilSwizzleOneSupport.get(segment, 0L, index); }
    /// {@return `depthStencilSwizzleOneSupport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthStencilSwizzleOneSupport(MemorySegment segment) { return VkPhysicalDeviceMaintenance5Properties.get_depthStencilSwizzleOneSupport(segment, 0L); }
    /// {@return `depthStencilSwizzleOneSupport`}
    public @CType("VkBool32") int depthStencilSwizzleOneSupport() { return VkPhysicalDeviceMaintenance5Properties.get_depthStencilSwizzleOneSupport(this.segment()); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthStencilSwizzleOneSupport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthStencilSwizzleOneSupport.set(segment, 0L, index, value); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthStencilSwizzleOneSupport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_depthStencilSwizzleOneSupport(segment, 0L, value); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties depthStencilSwizzleOneSupport(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_depthStencilSwizzleOneSupport(this.segment(), value); return this; }

    /// {@return `polygonModePointSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_polygonModePointSize(MemorySegment segment, long index) { return (int) VH_polygonModePointSize.get(segment, 0L, index); }
    /// {@return `polygonModePointSize`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_polygonModePointSize(MemorySegment segment) { return VkPhysicalDeviceMaintenance5Properties.get_polygonModePointSize(segment, 0L); }
    /// {@return `polygonModePointSize`}
    public @CType("VkBool32") int polygonModePointSize() { return VkPhysicalDeviceMaintenance5Properties.get_polygonModePointSize(this.segment()); }
    /// Sets `polygonModePointSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_polygonModePointSize(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_polygonModePointSize.set(segment, 0L, index, value); }
    /// Sets `polygonModePointSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_polygonModePointSize(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_polygonModePointSize(segment, 0L, value); }
    /// Sets `polygonModePointSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties polygonModePointSize(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_polygonModePointSize(this.segment(), value); return this; }

    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, long index) { return (int) VH_nonStrictSinglePixelWideLinesUseParallelogram.get(segment, 0L, index); }
    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment) { return VkPhysicalDeviceMaintenance5Properties.get_nonStrictSinglePixelWideLinesUseParallelogram(segment, 0L); }
    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram`}
    public @CType("VkBool32") int nonStrictSinglePixelWideLinesUseParallelogram() { return VkPhysicalDeviceMaintenance5Properties.get_nonStrictSinglePixelWideLinesUseParallelogram(this.segment()); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nonStrictSinglePixelWideLinesUseParallelogram.set(segment, 0L, index, value); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_nonStrictSinglePixelWideLinesUseParallelogram(segment, 0L, value); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties nonStrictSinglePixelWideLinesUseParallelogram(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), value); return this; }

    /// {@return `nonStrictWideLinesUseParallelogram` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nonStrictWideLinesUseParallelogram(MemorySegment segment, long index) { return (int) VH_nonStrictWideLinesUseParallelogram.get(segment, 0L, index); }
    /// {@return `nonStrictWideLinesUseParallelogram`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nonStrictWideLinesUseParallelogram(MemorySegment segment) { return VkPhysicalDeviceMaintenance5Properties.get_nonStrictWideLinesUseParallelogram(segment, 0L); }
    /// {@return `nonStrictWideLinesUseParallelogram`}
    public @CType("VkBool32") int nonStrictWideLinesUseParallelogram() { return VkPhysicalDeviceMaintenance5Properties.get_nonStrictWideLinesUseParallelogram(this.segment()); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nonStrictWideLinesUseParallelogram(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nonStrictWideLinesUseParallelogram.set(segment, 0L, index, value); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nonStrictWideLinesUseParallelogram(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_nonStrictWideLinesUseParallelogram(segment, 0L, value); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Properties nonStrictWideLinesUseParallelogram(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_nonStrictWideLinesUseParallelogram(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceMaintenance5Properties].
    public static final class Buffer extends VkPhysicalDeviceMaintenance5Properties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMaintenance5Properties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMaintenance5Properties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMaintenance5Properties`
        public VkPhysicalDeviceMaintenance5Properties asSlice(long index) { return new VkPhysicalDeviceMaintenance5Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMaintenance5Properties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMaintenance5Properties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMaintenance5Properties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance5Properties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMaintenance5Properties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance5Properties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting` at the given index}
        /// @param index the index
        public @CType("VkBool32") int earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index) { return VkPhysicalDeviceMaintenance5Properties.get_earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), index); }
        /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), index, value); return this; }

        /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting` at the given index}
        /// @param index the index
        public @CType("VkBool32") int earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index) { return VkPhysicalDeviceMaintenance5Properties.get_earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), index); }
        /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), index, value); return this; }

        /// {@return `depthStencilSwizzleOneSupport` at the given index}
        /// @param index the index
        public @CType("VkBool32") int depthStencilSwizzleOneSupportAt(long index) { return VkPhysicalDeviceMaintenance5Properties.get_depthStencilSwizzleOneSupport(this.segment(), index); }
        /// Sets `depthStencilSwizzleOneSupport` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthStencilSwizzleOneSupportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_depthStencilSwizzleOneSupport(this.segment(), index, value); return this; }

        /// {@return `polygonModePointSize` at the given index}
        /// @param index the index
        public @CType("VkBool32") int polygonModePointSizeAt(long index) { return VkPhysicalDeviceMaintenance5Properties.get_polygonModePointSize(this.segment(), index); }
        /// Sets `polygonModePointSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer polygonModePointSizeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_polygonModePointSize(this.segment(), index, value); return this; }

        /// {@return `nonStrictSinglePixelWideLinesUseParallelogram` at the given index}
        /// @param index the index
        public @CType("VkBool32") int nonStrictSinglePixelWideLinesUseParallelogramAt(long index) { return VkPhysicalDeviceMaintenance5Properties.get_nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), index); }
        /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nonStrictSinglePixelWideLinesUseParallelogramAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), index, value); return this; }

        /// {@return `nonStrictWideLinesUseParallelogram` at the given index}
        /// @param index the index
        public @CType("VkBool32") int nonStrictWideLinesUseParallelogramAt(long index) { return VkPhysicalDeviceMaintenance5Properties.get_nonStrictWideLinesUseParallelogram(this.segment(), index); }
        /// Sets `nonStrictWideLinesUseParallelogram` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nonStrictWideLinesUseParallelogramAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance5Properties.set_nonStrictWideLinesUseParallelogram(this.segment(), index, value); return this; }

    }
}
