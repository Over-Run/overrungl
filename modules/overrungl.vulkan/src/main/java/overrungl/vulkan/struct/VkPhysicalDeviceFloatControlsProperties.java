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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### denormBehaviorIndependence
/// [VarHandle][#VH_denormBehaviorIndependence] - [Getter][#denormBehaviorIndependence()] - [Setter][#denormBehaviorIndependence(int)]
/// ### roundingModeIndependence
/// [VarHandle][#VH_roundingModeIndependence] - [Getter][#roundingModeIndependence()] - [Setter][#roundingModeIndependence(int)]
/// ### shaderSignedZeroInfNanPreserveFloat16
/// [VarHandle][#VH_shaderSignedZeroInfNanPreserveFloat16] - [Getter][#shaderSignedZeroInfNanPreserveFloat16()] - [Setter][#shaderSignedZeroInfNanPreserveFloat16(int)]
/// ### shaderSignedZeroInfNanPreserveFloat32
/// [VarHandle][#VH_shaderSignedZeroInfNanPreserveFloat32] - [Getter][#shaderSignedZeroInfNanPreserveFloat32()] - [Setter][#shaderSignedZeroInfNanPreserveFloat32(int)]
/// ### shaderSignedZeroInfNanPreserveFloat64
/// [VarHandle][#VH_shaderSignedZeroInfNanPreserveFloat64] - [Getter][#shaderSignedZeroInfNanPreserveFloat64()] - [Setter][#shaderSignedZeroInfNanPreserveFloat64(int)]
/// ### shaderDenormPreserveFloat16
/// [VarHandle][#VH_shaderDenormPreserveFloat16] - [Getter][#shaderDenormPreserveFloat16()] - [Setter][#shaderDenormPreserveFloat16(int)]
/// ### shaderDenormPreserveFloat32
/// [VarHandle][#VH_shaderDenormPreserveFloat32] - [Getter][#shaderDenormPreserveFloat32()] - [Setter][#shaderDenormPreserveFloat32(int)]
/// ### shaderDenormPreserveFloat64
/// [VarHandle][#VH_shaderDenormPreserveFloat64] - [Getter][#shaderDenormPreserveFloat64()] - [Setter][#shaderDenormPreserveFloat64(int)]
/// ### shaderDenormFlushToZeroFloat16
/// [VarHandle][#VH_shaderDenormFlushToZeroFloat16] - [Getter][#shaderDenormFlushToZeroFloat16()] - [Setter][#shaderDenormFlushToZeroFloat16(int)]
/// ### shaderDenormFlushToZeroFloat32
/// [VarHandle][#VH_shaderDenormFlushToZeroFloat32] - [Getter][#shaderDenormFlushToZeroFloat32()] - [Setter][#shaderDenormFlushToZeroFloat32(int)]
/// ### shaderDenormFlushToZeroFloat64
/// [VarHandle][#VH_shaderDenormFlushToZeroFloat64] - [Getter][#shaderDenormFlushToZeroFloat64()] - [Setter][#shaderDenormFlushToZeroFloat64(int)]
/// ### shaderRoundingModeRTEFloat16
/// [VarHandle][#VH_shaderRoundingModeRTEFloat16] - [Getter][#shaderRoundingModeRTEFloat16()] - [Setter][#shaderRoundingModeRTEFloat16(int)]
/// ### shaderRoundingModeRTEFloat32
/// [VarHandle][#VH_shaderRoundingModeRTEFloat32] - [Getter][#shaderRoundingModeRTEFloat32()] - [Setter][#shaderRoundingModeRTEFloat32(int)]
/// ### shaderRoundingModeRTEFloat64
/// [VarHandle][#VH_shaderRoundingModeRTEFloat64] - [Getter][#shaderRoundingModeRTEFloat64()] - [Setter][#shaderRoundingModeRTEFloat64(int)]
/// ### shaderRoundingModeRTZFloat16
/// [VarHandle][#VH_shaderRoundingModeRTZFloat16] - [Getter][#shaderRoundingModeRTZFloat16()] - [Setter][#shaderRoundingModeRTZFloat16(int)]
/// ### shaderRoundingModeRTZFloat32
/// [VarHandle][#VH_shaderRoundingModeRTZFloat32] - [Getter][#shaderRoundingModeRTZFloat32()] - [Setter][#shaderRoundingModeRTZFloat32(int)]
/// ### shaderRoundingModeRTZFloat64
/// [VarHandle][#VH_shaderRoundingModeRTZFloat64] - [Getter][#shaderRoundingModeRTZFloat64()] - [Setter][#shaderRoundingModeRTZFloat64(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFloatControlsProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkShaderFloatControlsIndependence denormBehaviorIndependence;
///     VkShaderFloatControlsIndependence roundingModeIndependence;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat16;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat32;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat64;
///     VkBool32 shaderDenormPreserveFloat16;
///     VkBool32 shaderDenormPreserveFloat32;
///     VkBool32 shaderDenormPreserveFloat64;
///     VkBool32 shaderDenormFlushToZeroFloat16;
///     VkBool32 shaderDenormFlushToZeroFloat32;
///     VkBool32 shaderDenormFlushToZeroFloat64;
///     VkBool32 shaderRoundingModeRTEFloat16;
///     VkBool32 shaderRoundingModeRTEFloat32;
///     VkBool32 shaderRoundingModeRTEFloat64;
///     VkBool32 shaderRoundingModeRTZFloat16;
///     VkBool32 shaderRoundingModeRTZFloat32;
///     VkBool32 shaderRoundingModeRTZFloat64;
/// } VkPhysicalDeviceFloatControlsProperties;
/// ```
public sealed class VkPhysicalDeviceFloatControlsProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceFloatControlsProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("denormBehaviorIndependence"),
        ValueLayout.JAVA_INT.withName("roundingModeIndependence"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat64")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `denormBehaviorIndependence` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_denormBehaviorIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("denormBehaviorIndependence"));
    /// The [VarHandle] of `roundingModeIndependence` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_roundingModeIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("roundingModeIndependence"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    /// The [VarHandle] of `shaderDenormPreserveFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat16"));
    /// The [VarHandle] of `shaderDenormPreserveFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat32"));
    /// The [VarHandle] of `shaderDenormPreserveFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat64"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat64"));

    /// Creates `VkPhysicalDeviceFloatControlsProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFloatControlsProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFloatControlsProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFloatControlsProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFloatControlsProperties(segment); }

    /// Creates `VkPhysicalDeviceFloatControlsProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFloatControlsProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFloatControlsProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFloatControlsProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFloatControlsProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceFloatControlsProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFloatControlsProperties`
    public static VkPhysicalDeviceFloatControlsProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFloatControlsProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFloatControlsProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFloatControlsProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFloatControlsProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFloatControlsProperties`
    public static VkPhysicalDeviceFloatControlsProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkShaderFloatControlsIndependence") int denormBehaviorIndependence, @CType("VkShaderFloatControlsIndependence") int roundingModeIndependence, @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat16, @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat32, @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat64, @CType("VkBool32") int shaderDenormPreserveFloat16, @CType("VkBool32") int shaderDenormPreserveFloat32, @CType("VkBool32") int shaderDenormPreserveFloat64, @CType("VkBool32") int shaderDenormFlushToZeroFloat16, @CType("VkBool32") int shaderDenormFlushToZeroFloat32, @CType("VkBool32") int shaderDenormFlushToZeroFloat64, @CType("VkBool32") int shaderRoundingModeRTEFloat16, @CType("VkBool32") int shaderRoundingModeRTEFloat32, @CType("VkBool32") int shaderRoundingModeRTEFloat64, @CType("VkBool32") int shaderRoundingModeRTZFloat16, @CType("VkBool32") int shaderRoundingModeRTZFloat32, @CType("VkBool32") int shaderRoundingModeRTZFloat64) { return alloc(allocator).sType(sType).pNext(pNext).denormBehaviorIndependence(denormBehaviorIndependence).roundingModeIndependence(roundingModeIndependence).shaderSignedZeroInfNanPreserveFloat16(shaderSignedZeroInfNanPreserveFloat16).shaderSignedZeroInfNanPreserveFloat32(shaderSignedZeroInfNanPreserveFloat32).shaderSignedZeroInfNanPreserveFloat64(shaderSignedZeroInfNanPreserveFloat64).shaderDenormPreserveFloat16(shaderDenormPreserveFloat16).shaderDenormPreserveFloat32(shaderDenormPreserveFloat32).shaderDenormPreserveFloat64(shaderDenormPreserveFloat64).shaderDenormFlushToZeroFloat16(shaderDenormFlushToZeroFloat16).shaderDenormFlushToZeroFloat32(shaderDenormFlushToZeroFloat32).shaderDenormFlushToZeroFloat64(shaderDenormFlushToZeroFloat64).shaderRoundingModeRTEFloat16(shaderRoundingModeRTEFloat16).shaderRoundingModeRTEFloat32(shaderRoundingModeRTEFloat32).shaderRoundingModeRTEFloat64(shaderRoundingModeRTEFloat64).shaderRoundingModeRTZFloat16(shaderRoundingModeRTZFloat16).shaderRoundingModeRTZFloat32(shaderRoundingModeRTZFloat32).shaderRoundingModeRTZFloat64(shaderRoundingModeRTZFloat64); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties copyFrom(VkPhysicalDeviceFloatControlsProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFloatControlsProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFloatControlsProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFloatControlsProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceFloatControlsProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceFloatControlsProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceFloatControlsProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `denormBehaviorIndependence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderFloatControlsIndependence") int get_denormBehaviorIndependence(MemorySegment segment, long index) { return (int) VH_denormBehaviorIndependence.get(segment, 0L, index); }
    /// {@return `denormBehaviorIndependence`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderFloatControlsIndependence") int get_denormBehaviorIndependence(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_denormBehaviorIndependence(segment, 0L); }
    /// {@return `denormBehaviorIndependence`}
    public @CType("VkShaderFloatControlsIndependence") int denormBehaviorIndependence() { return VkPhysicalDeviceFloatControlsProperties.get_denormBehaviorIndependence(this.segment()); }
    /// Sets `denormBehaviorIndependence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_denormBehaviorIndependence(MemorySegment segment, long index, @CType("VkShaderFloatControlsIndependence") int value) { VH_denormBehaviorIndependence.set(segment, 0L, index, value); }
    /// Sets `denormBehaviorIndependence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_denormBehaviorIndependence(MemorySegment segment, @CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceFloatControlsProperties.set_denormBehaviorIndependence(segment, 0L, value); }
    /// Sets `denormBehaviorIndependence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties denormBehaviorIndependence(@CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceFloatControlsProperties.set_denormBehaviorIndependence(this.segment(), value); return this; }

    /// {@return `roundingModeIndependence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderFloatControlsIndependence") int get_roundingModeIndependence(MemorySegment segment, long index) { return (int) VH_roundingModeIndependence.get(segment, 0L, index); }
    /// {@return `roundingModeIndependence`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderFloatControlsIndependence") int get_roundingModeIndependence(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_roundingModeIndependence(segment, 0L); }
    /// {@return `roundingModeIndependence`}
    public @CType("VkShaderFloatControlsIndependence") int roundingModeIndependence() { return VkPhysicalDeviceFloatControlsProperties.get_roundingModeIndependence(this.segment()); }
    /// Sets `roundingModeIndependence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_roundingModeIndependence(MemorySegment segment, long index, @CType("VkShaderFloatControlsIndependence") int value) { VH_roundingModeIndependence.set(segment, 0L, index, value); }
    /// Sets `roundingModeIndependence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_roundingModeIndependence(MemorySegment segment, @CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceFloatControlsProperties.set_roundingModeIndependence(segment, 0L, value); }
    /// Sets `roundingModeIndependence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties roundingModeIndependence(@CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceFloatControlsProperties.set_roundingModeIndependence(this.segment(), value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat16.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat16(segment, 0L); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat16`}
    public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat16() { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat16(this.segment()); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSignedZeroInfNanPreserveFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat16(segment, 0L, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderSignedZeroInfNanPreserveFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat16(this.segment(), value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat32.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat32(segment, 0L); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat32`}
    public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat32() { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat32(this.segment()); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSignedZeroInfNanPreserveFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat32(segment, 0L, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderSignedZeroInfNanPreserveFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat32(this.segment(), value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat64.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat64(segment, 0L); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat64`}
    public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat64() { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat64(this.segment()); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSignedZeroInfNanPreserveFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat64(segment, 0L, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderSignedZeroInfNanPreserveFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat64(this.segment(), value); return this; }

    /// {@return `shaderDenormPreserveFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat16(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat16.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat16(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat16(segment, 0L); }
    /// {@return `shaderDenormPreserveFloat16`}
    public @CType("VkBool32") int shaderDenormPreserveFloat16() { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat16(this.segment()); }
    /// Sets `shaderDenormPreserveFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormPreserveFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat16(segment, 0L, value); }
    /// Sets `shaderDenormPreserveFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderDenormPreserveFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat16(this.segment(), value); return this; }

    /// {@return `shaderDenormPreserveFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat32(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat32.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat32(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat32(segment, 0L); }
    /// {@return `shaderDenormPreserveFloat32`}
    public @CType("VkBool32") int shaderDenormPreserveFloat32() { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat32(this.segment()); }
    /// Sets `shaderDenormPreserveFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormPreserveFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat32(segment, 0L, value); }
    /// Sets `shaderDenormPreserveFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderDenormPreserveFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat32(this.segment(), value); return this; }

    /// {@return `shaderDenormPreserveFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat64(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat64.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat64(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat64(segment, 0L); }
    /// {@return `shaderDenormPreserveFloat64`}
    public @CType("VkBool32") int shaderDenormPreserveFloat64() { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat64(this.segment()); }
    /// Sets `shaderDenormPreserveFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormPreserveFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat64(segment, 0L, value); }
    /// Sets `shaderDenormPreserveFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderDenormPreserveFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat64(this.segment(), value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat16(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat16.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat16(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat16(segment, 0L); }
    /// {@return `shaderDenormFlushToZeroFloat16`}
    public @CType("VkBool32") int shaderDenormFlushToZeroFloat16() { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat16(this.segment()); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormFlushToZeroFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat16(segment, 0L, value); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderDenormFlushToZeroFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat16(this.segment(), value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat32(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat32.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat32(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat32(segment, 0L); }
    /// {@return `shaderDenormFlushToZeroFloat32`}
    public @CType("VkBool32") int shaderDenormFlushToZeroFloat32() { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat32(this.segment()); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormFlushToZeroFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat32(segment, 0L, value); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderDenormFlushToZeroFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat32(this.segment(), value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat64(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat64.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat64(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat64(segment, 0L); }
    /// {@return `shaderDenormFlushToZeroFloat64`}
    public @CType("VkBool32") int shaderDenormFlushToZeroFloat64() { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat64(this.segment()); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormFlushToZeroFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat64(segment, 0L, value); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderDenormFlushToZeroFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat64(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTEFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat16(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat16.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat16(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat16(segment, 0L); }
    /// {@return `shaderRoundingModeRTEFloat16`}
    public @CType("VkBool32") int shaderRoundingModeRTEFloat16() { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat16(this.segment()); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTEFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat16(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTEFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat16(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTEFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat32(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat32.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat32(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat32(segment, 0L); }
    /// {@return `shaderRoundingModeRTEFloat32`}
    public @CType("VkBool32") int shaderRoundingModeRTEFloat32() { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat32(this.segment()); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTEFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat32(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTEFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat32(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTEFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat64(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat64.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat64(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat64(segment, 0L); }
    /// {@return `shaderRoundingModeRTEFloat64`}
    public @CType("VkBool32") int shaderRoundingModeRTEFloat64() { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat64(this.segment()); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTEFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat64(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTEFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat64(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTZFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat16(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat16.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat16(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat16(segment, 0L); }
    /// {@return `shaderRoundingModeRTZFloat16`}
    public @CType("VkBool32") int shaderRoundingModeRTZFloat16() { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat16(this.segment()); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTZFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat16(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTZFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat16(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTZFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat32(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat32.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat32(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat32(segment, 0L); }
    /// {@return `shaderRoundingModeRTZFloat32`}
    public @CType("VkBool32") int shaderRoundingModeRTZFloat32() { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat32(this.segment()); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTZFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat32(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTZFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat32(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTZFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat64(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat64.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat64(MemorySegment segment) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat64(segment, 0L); }
    /// {@return `shaderRoundingModeRTZFloat64`}
    public @CType("VkBool32") int shaderRoundingModeRTZFloat64() { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat64(this.segment()); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTZFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat64(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTZFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat64(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceFloatControlsProperties].
    public static final class Buffer extends VkPhysicalDeviceFloatControlsProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFloatControlsProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFloatControlsProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFloatControlsProperties`
        public VkPhysicalDeviceFloatControlsProperties asSlice(long index) { return new VkPhysicalDeviceFloatControlsProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFloatControlsProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFloatControlsProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFloatControlsProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFloatControlsProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceFloatControlsProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceFloatControlsProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `denormBehaviorIndependence` at the given index}
        /// @param index the index
        public @CType("VkShaderFloatControlsIndependence") int denormBehaviorIndependenceAt(long index) { return VkPhysicalDeviceFloatControlsProperties.get_denormBehaviorIndependence(this.segment(), index); }
        /// Sets `denormBehaviorIndependence` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer denormBehaviorIndependenceAt(long index, @CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceFloatControlsProperties.set_denormBehaviorIndependence(this.segment(), index, value); return this; }

        /// {@return `roundingModeIndependence` at the given index}
        /// @param index the index
        public @CType("VkShaderFloatControlsIndependence") int roundingModeIndependenceAt(long index) { return VkPhysicalDeviceFloatControlsProperties.get_roundingModeIndependence(this.segment(), index); }
        /// Sets `roundingModeIndependence` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer roundingModeIndependenceAt(long index, @CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceFloatControlsProperties.set_roundingModeIndependence(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat16At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat16(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat32At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat32(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat64At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderSignedZeroInfNanPreserveFloat64(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderSignedZeroInfNanPreserveFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormPreserveFloat16At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat16(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormPreserveFloat32At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat32(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormPreserveFloat64At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormPreserveFloat64(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormPreserveFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormFlushToZeroFloat16At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat16(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormFlushToZeroFloat32At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat32(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormFlushToZeroFloat64At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderDenormFlushToZeroFloat64(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderDenormFlushToZeroFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTEFloat16At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat16(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTEFloat32At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat32(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTEFloat64At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTEFloat64(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTEFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTZFloat16At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat16(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTZFloat32At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat32(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTZFloat64At(long index) { return VkPhysicalDeviceFloatControlsProperties.get_shaderRoundingModeRTZFloat64(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFloatControlsProperties.set_shaderRoundingModeRTZFloat64(this.segment(), index, value); return this; }

    }
}
