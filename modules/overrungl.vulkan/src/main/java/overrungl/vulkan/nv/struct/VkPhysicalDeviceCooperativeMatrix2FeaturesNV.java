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
package overrungl.vulkan.nv.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### cooperativeMatrixWorkgroupScope
/// [VarHandle][#VH_cooperativeMatrixWorkgroupScope] - [Getter][#cooperativeMatrixWorkgroupScope()] - [Setter][#cooperativeMatrixWorkgroupScope(int)]
/// ### cooperativeMatrixFlexibleDimensions
/// [VarHandle][#VH_cooperativeMatrixFlexibleDimensions] - [Getter][#cooperativeMatrixFlexibleDimensions()] - [Setter][#cooperativeMatrixFlexibleDimensions(int)]
/// ### cooperativeMatrixReductions
/// [VarHandle][#VH_cooperativeMatrixReductions] - [Getter][#cooperativeMatrixReductions()] - [Setter][#cooperativeMatrixReductions(int)]
/// ### cooperativeMatrixConversions
/// [VarHandle][#VH_cooperativeMatrixConversions] - [Getter][#cooperativeMatrixConversions()] - [Setter][#cooperativeMatrixConversions(int)]
/// ### cooperativeMatrixPerElementOperations
/// [VarHandle][#VH_cooperativeMatrixPerElementOperations] - [Getter][#cooperativeMatrixPerElementOperations()] - [Setter][#cooperativeMatrixPerElementOperations(int)]
/// ### cooperativeMatrixTensorAddressing
/// [VarHandle][#VH_cooperativeMatrixTensorAddressing] - [Getter][#cooperativeMatrixTensorAddressing()] - [Setter][#cooperativeMatrixTensorAddressing(int)]
/// ### cooperativeMatrixBlockLoads
/// [VarHandle][#VH_cooperativeMatrixBlockLoads] - [Getter][#cooperativeMatrixBlockLoads()] - [Setter][#cooperativeMatrixBlockLoads(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceCooperativeMatrix2FeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 cooperativeMatrixWorkgroupScope;
///     VkBool32 cooperativeMatrixFlexibleDimensions;
///     VkBool32 cooperativeMatrixReductions;
///     VkBool32 cooperativeMatrixConversions;
///     VkBool32 cooperativeMatrixPerElementOperations;
///     VkBool32 cooperativeMatrixTensorAddressing;
///     VkBool32 cooperativeMatrixBlockLoads;
/// } VkPhysicalDeviceCooperativeMatrix2FeaturesNV;
/// ```
public sealed class VkPhysicalDeviceCooperativeMatrix2FeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScope"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixReductions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixConversions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixPerElementOperations"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixTensorAddressing"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixBlockLoads")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `cooperativeMatrixWorkgroupScope` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixWorkgroupScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
    /// The [VarHandle] of `cooperativeMatrixFlexibleDimensions` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixFlexibleDimensions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
    /// The [VarHandle] of `cooperativeMatrixReductions` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixReductions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixReductions"));
    /// The [VarHandle] of `cooperativeMatrixConversions` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixConversions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixConversions"));
    /// The [VarHandle] of `cooperativeMatrixPerElementOperations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixPerElementOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
    /// The [VarHandle] of `cooperativeMatrixTensorAddressing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixTensorAddressing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
    /// The [VarHandle] of `cooperativeMatrixBlockLoads` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixBlockLoads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixBlockLoads"));

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int cooperativeMatrixWorkgroupScope, @CType("VkBool32") int cooperativeMatrixFlexibleDimensions, @CType("VkBool32") int cooperativeMatrixReductions, @CType("VkBool32") int cooperativeMatrixConversions, @CType("VkBool32") int cooperativeMatrixPerElementOperations, @CType("VkBool32") int cooperativeMatrixTensorAddressing, @CType("VkBool32") int cooperativeMatrixBlockLoads) { return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope).cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions).cooperativeMatrixReductions(cooperativeMatrixReductions).cooperativeMatrixConversions(cooperativeMatrixConversions).cooperativeMatrixPerElementOperations(cooperativeMatrixPerElementOperations).cooperativeMatrixTensorAddressing(cooperativeMatrixTensorAddressing).cooperativeMatrixBlockLoads(cooperativeMatrixBlockLoads); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV copyFrom(VkPhysicalDeviceCooperativeMatrix2FeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixWorkgroupScope` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrixWorkgroupScope(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixWorkgroupScope.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixWorkgroupScope`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrixWorkgroupScope(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixWorkgroupScope(segment, 0L); }
    /// {@return `cooperativeMatrixWorkgroupScope`}
    public @CType("VkBool32") int cooperativeMatrixWorkgroupScope() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixWorkgroupScope(this.segment()); }
    /// Sets `cooperativeMatrixWorkgroupScope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixWorkgroupScope(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrixWorkgroupScope.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixWorkgroupScope` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixWorkgroupScope(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixWorkgroupScope(segment, 0L, value); }
    /// Sets `cooperativeMatrixWorkgroupScope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixWorkgroupScope(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixWorkgroupScope(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixFlexibleDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrixFlexibleDimensions(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixFlexibleDimensions.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixFlexibleDimensions`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrixFlexibleDimensions(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixFlexibleDimensions(segment, 0L); }
    /// {@return `cooperativeMatrixFlexibleDimensions`}
    public @CType("VkBool32") int cooperativeMatrixFlexibleDimensions() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixFlexibleDimensions(this.segment()); }
    /// Sets `cooperativeMatrixFlexibleDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixFlexibleDimensions(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrixFlexibleDimensions.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixFlexibleDimensions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixFlexibleDimensions(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixFlexibleDimensions(segment, 0L, value); }
    /// Sets `cooperativeMatrixFlexibleDimensions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixFlexibleDimensions(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixFlexibleDimensions(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixReductions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrixReductions(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixReductions.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixReductions`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrixReductions(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixReductions(segment, 0L); }
    /// {@return `cooperativeMatrixReductions`}
    public @CType("VkBool32") int cooperativeMatrixReductions() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixReductions(this.segment()); }
    /// Sets `cooperativeMatrixReductions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixReductions(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrixReductions.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixReductions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixReductions(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixReductions(segment, 0L, value); }
    /// Sets `cooperativeMatrixReductions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixReductions(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixReductions(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixConversions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrixConversions(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixConversions.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixConversions`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrixConversions(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixConversions(segment, 0L); }
    /// {@return `cooperativeMatrixConversions`}
    public @CType("VkBool32") int cooperativeMatrixConversions() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixConversions(this.segment()); }
    /// Sets `cooperativeMatrixConversions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixConversions(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrixConversions.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixConversions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixConversions(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixConversions(segment, 0L, value); }
    /// Sets `cooperativeMatrixConversions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixConversions(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixConversions(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixPerElementOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrixPerElementOperations(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixPerElementOperations.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixPerElementOperations`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrixPerElementOperations(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixPerElementOperations(segment, 0L); }
    /// {@return `cooperativeMatrixPerElementOperations`}
    public @CType("VkBool32") int cooperativeMatrixPerElementOperations() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixPerElementOperations(this.segment()); }
    /// Sets `cooperativeMatrixPerElementOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixPerElementOperations(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrixPerElementOperations.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixPerElementOperations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixPerElementOperations(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixPerElementOperations(segment, 0L, value); }
    /// Sets `cooperativeMatrixPerElementOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixPerElementOperations(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixPerElementOperations(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixTensorAddressing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrixTensorAddressing(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixTensorAddressing.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixTensorAddressing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrixTensorAddressing(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixTensorAddressing(segment, 0L); }
    /// {@return `cooperativeMatrixTensorAddressing`}
    public @CType("VkBool32") int cooperativeMatrixTensorAddressing() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixTensorAddressing(this.segment()); }
    /// Sets `cooperativeMatrixTensorAddressing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixTensorAddressing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrixTensorAddressing.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixTensorAddressing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixTensorAddressing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixTensorAddressing(segment, 0L, value); }
    /// Sets `cooperativeMatrixTensorAddressing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixTensorAddressing(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixTensorAddressing(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixBlockLoads` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrixBlockLoads(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixBlockLoads.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixBlockLoads`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrixBlockLoads(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixBlockLoads(segment, 0L); }
    /// {@return `cooperativeMatrixBlockLoads`}
    public @CType("VkBool32") int cooperativeMatrixBlockLoads() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixBlockLoads(this.segment()); }
    /// Sets `cooperativeMatrixBlockLoads` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixBlockLoads(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrixBlockLoads.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixBlockLoads` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixBlockLoads(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixBlockLoads(segment, 0L, value); }
    /// Sets `cooperativeMatrixBlockLoads` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixBlockLoads(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixBlockLoads(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceCooperativeMatrix2FeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceCooperativeMatrix2FeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixWorkgroupScope` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixWorkgroupScopeAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixWorkgroupScope(this.segment(), index); }
        /// Sets `cooperativeMatrixWorkgroupScope` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixWorkgroupScopeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixWorkgroupScope(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixFlexibleDimensions` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixFlexibleDimensionsAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixFlexibleDimensions(this.segment(), index); }
        /// Sets `cooperativeMatrixFlexibleDimensions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixFlexibleDimensionsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixFlexibleDimensions(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixReductions` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixReductionsAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixReductions(this.segment(), index); }
        /// Sets `cooperativeMatrixReductions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixReductionsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixReductions(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixConversions` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixConversionsAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixConversions(this.segment(), index); }
        /// Sets `cooperativeMatrixConversions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixConversionsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixConversions(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixPerElementOperations` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixPerElementOperationsAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixPerElementOperations(this.segment(), index); }
        /// Sets `cooperativeMatrixPerElementOperations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixPerElementOperationsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixPerElementOperations(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixTensorAddressing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixTensorAddressingAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixTensorAddressing(this.segment(), index); }
        /// Sets `cooperativeMatrixTensorAddressing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixTensorAddressingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixTensorAddressing(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixBlockLoads` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixBlockLoadsAt(long index) { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.get_cooperativeMatrixBlockLoads(this.segment(), index); }
        /// Sets `cooperativeMatrixBlockLoads` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixBlockLoadsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.set_cooperativeMatrixBlockLoads(this.segment(), index, value); return this; }

    }
}
